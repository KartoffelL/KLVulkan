package Kartoffel.Licht.AGGraphics;

import java.util.concurrent.ConcurrentHashMap;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkExtent2D;
import org.lwjgl.vulkan.VkOffset2D;
import org.lwjgl.vulkan.VkQueue;
import org.lwjgl.vulkan.VkRect2D;
import org.lwjgl.vulkan.VkSubmitInfo;
import org.lwjgl.vulkan.VkViewport;

import Kartoffel.Licht.Vulkan.Buffer;
import Kartoffel.Licht.Vulkan.DescriptorPool;
import Kartoffel.Licht.Vulkan.Framebuffer;
import Kartoffel.Licht.Vulkan.RenderPass;
import Kartoffel.Licht.Vulkan.VulkanFreeable;
import Kartoffel.Licht.Vulkan.VulkanTools;

/**
 * An AGDrawer can be commanded to "draw things"->to dispatch commands.
 * In more technical terms, the AGDrawer encloses a command buffer, to which the commands are recorded. Using {@link #submitAll(long)} to submit the commands.
 * Contained are also various helper functions.
 */
public class AGDrawer implements VulkanFreeable{
	
	private static ConcurrentHashMap<AGDrawer, StackTraceElement[]> active = new ConcurrentHashMap<AGDrawer, StackTraceElement[]>();
	static {
		Runtime.getRuntime().addShutdownHook(new Thread(()->{
			active.forEach((b, a)->{
				System.err.println("Warning, unclosed AGDrawer-Object! " + b);
				for(int i = 3; i < a.length; i++)
					System.err.println(String.valueOf(new char[i])+a[i].toString());
			});
		}));
	}
	
	private VkCommandBuffer cbuffer;
	private VkDevice device;
	private VkQueue mainQueue;
	private long pool; //Command pool
	private long fence;
	private long[] waitSemaphores = new long[0];//semaphoreA
	private long[] signalSemaphores = new long[0];//semaphoreB
	private volatile boolean ready = false, recorded = false; //If this drawer is ready again to be submitted
	private long nanotime;
	
	int recordingRenderpassType = 0; //0 = no renderpass (invalid), 1 = to display, 2 = to framebuffer
	
	AGDrawer(VkDevice device, VkQueue mainQueue, long fence, VkCommandBuffer buffer, long pool) {
		this.cbuffer = buffer;
		this.device = device;
		this.pool = pool;
		this.fence = fence;
		this.mainQueue = mainQueue;
		active.put(this, Thread.currentThread().getStackTrace());
	}
	/**
	 * Begins the Renderpass
	 * @param canvas the canvas
	 * @param framebuffer the {@link Framebuffer} index
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param height the height
	 */
	public void beginRenderpass(AGCanvas canvas, int frameBufferIndex, int x, int y, int width, int height) {
		if(recordingRenderpassType == 1)
			throw new RuntimeException("Renderpass already active!");
		recordingRenderpassType = 1;
		VulkanTools.cmdBeginRenderPass(cbuffer, canvas.getRenderpass().getAddress(), canvas.getFramebuffer(frameBufferIndex), x, y, width, height, canvas.getClearColors(frameBufferIndex));
	}
	/**
	 * ends the current {@link RenderPass}
	 */
	public void endRenderpass() {
		if(recordingRenderpassType == 0)
			throw new RuntimeException("No Renderpass active!");
		VK13.vkCmdEndRenderPass(getCommandBuffer());
		recordingRenderpassType = 0;
	}
	/**
	 * Binds a shader to be used
	 * @param shader the shader
	 */
	public void bindShader(AGShader shader) {
		VK13.vkCmdBindPipeline(cbuffer, shader.getPipeline().getVkPipelineBindPoint(), shader.address());
	}
	/**
	 * Binds the descriptorSets to the current usage of the shader
	 * @param shader the shader
	 * @param sets the sets to bind
	 */
	public void bindDescriptorSets(AGShader shader, DescriptorPool.DescriptorSet...sets) {
		long[] ids = new long[sets.length];
		for(int i = 0; i < ids.length; i++)
			ids[i] = sets[i].set;
		VK13.vkCmdBindDescriptorSets(cbuffer, shader.getPipeline().getVkPipelineBindPoint(), shader.getPipeline().getLayout().getAddress(), 0, ids, null);
	}
	/**
	 * Binds the descriptorSets to the current usage of the shader
	 * @param shader the shader
	 * @param offsets offsets of the sets
	 * @param sets the sets to bind
	 */
	public void bindDescriptorSets(AGShader shader, int[] offsets, DescriptorPool.DescriptorSet...sets) {
		long[] ids = new long[sets.length];
		for(int i = 0; i < ids.length; i++)
			ids[i] = sets[i].set;
		VK13.vkCmdBindDescriptorSets(cbuffer, shader.getPipeline().getVkPipelineBindPoint(), shader.getPipeline().getLayout().getAddress(), 0, ids, offsets);
	}
	/**
	 * Binds a single descriptorSet to the current usage of the shader
	 * @param shader the shader
	 * @param offsets the offset
	 * @param set the set to bind
	 */
	public void bindDescriptorSets(AGShader shader, int offsets, DescriptorPool.DescriptorSet set) {
		VK13.vkCmdBindDescriptorSets(cbuffer, shader.getPipeline().getVkPipelineBindPoint(), shader.getPipeline().getLayout().getAddress(), 0, new long[] {set.set}, offsets == 0 ? null : new int[] {offsets});
	}
	/**
	 * Sets the viewport. Won't have any effect if the dynamic states of the pipeline don't include {@link VK10#VK_DYNAMIC_STATE_VIEWPORT}
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param height the height
	 * @param md the min. depth
	 * @param mmd the max. depth
	 * @param index the index of the viewport
	 */
	public void setViewport(int index, float x, float y, float width, float height, float md, float mmd) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkViewport viewport = new VkViewport(stack.calloc(24));
			viewport.x(x);
			viewport.y(y);
			viewport.width(Math.max(width, 1));
			viewport.height(Math.max(height, 1));
			viewport.minDepth(md);
			viewport.maxDepth(mmd);
			VkViewport.Buffer viewport_buffer = new VkViewport.Buffer(stack.calloc(24));
			viewport_buffer.put(0, viewport);
			VK13.vkCmdSetViewport(cbuffer, index, viewport_buffer);
		}
	}
	/**
	 * Sets the scissor. Won't have any effect if the dynamic states of the pipeline don't include {@link VK10#VK_DYNAMIC_STATE_SCISSOR}
	 * @param index the scissor index
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param height the height
	 */
	public void setScissor(int index, int x, int y, int width, int height) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkOffset2D offset = new VkOffset2D(stack.calloc(8));
			offset.set(x, y);
			VkExtent2D extent = new VkExtent2D(stack.calloc(8));
			extent.set(width, height);
			
			VkRect2D scissor = new VkRect2D(stack.calloc(16));
			scissor.offset(offset);
			scissor.extent(extent);
			
			VkRect2D.Buffer scissor_buffer = new VkRect2D.Buffer(stack.calloc(16));
			scissor_buffer.put(0, scissor);
			VK13.vkCmdSetScissor(cbuffer, index, scissor_buffer);
		}
	}
	
	/**
	 * Starts recording of the commands to submit, calls {@link #join()} beforehand
	 */
	public void startDraw() {
		if(!ready())
			throw new RuntimeException("Drawer isin't ready yet!");
		VK13.vkResetCommandBuffer(cbuffer, 0);
		VulkanTools.beginRecording(cbuffer);
		recorded = false;
	}
	
	/**
	 * Ends recording of the commands to submit.
	 */
	public void endDraw() {
		VulkanTools.endRecording(cbuffer);
		recorded = true;
	}
	
	/**
	 * Submits all commands
	 * @param minTimeNano if the time between invokations of this method is smaller than minTimeNano, it will return -1
	 * @return the nanotime passed since the last submit, '-1' if time was smaller than minTimeNano
	 */
	public long submitAll(long minTimeNano) {
		return submitCommandBuffer(minTimeNano, waitSemaphores, signalSemaphores);
	}
	/**
	 * {@return true if all commands have been processed}
	 */
	public boolean ready() {
		if(ready)
			return true;
		return ready = (VK13.vkGetFenceStatus(device, fence) == VK13.VK_SUCCESS);
	}
	/**
	 * Waits until all commands have been processed, returns immediately if not active.
	 */
	public void join() {
		if(ready())
			return;
		VK13.vkWaitForFences(device, fence, true, Long.MAX_VALUE);
		ready = true;
	}
	/**
	 * Submits all commands
	 * @param waitSemaphores the semaphores to wait for
	 * @param signalSemaphores the semaphores to signal when everything has been processed.
	 * @param minTimeNano if the time between invokations of this method is smaller than minTimeNano, it will return -1
	 * @return the nanotime passed since the last submit, '-1' if time was smaller than minTimeNano
	 */
	public long submitCommandBuffer(long minTimeNano, long[] waitSemaphores, long[] signalSemaphores) {
		if(!ready())
			throw new RuntimeException("Drawer isin't ready yet!");
		if(!recorded)
			throw new RuntimeException("Drawer isin't recorded yet!");
		long a = System.nanoTime()-nanotime;
		if(a < minTimeNano)
			return -1;
		nanotime = System.nanoTime();
		VK13.vkResetFences(device, fence);
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkSubmitInfo info_submit = new VkSubmitInfo(stack.calloc(72));
			info_submit.sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO);
			info_submit.waitSemaphoreCount(waitSemaphores.length);
			info_submit.pWaitSemaphores(stack.longs(waitSemaphores));
			info_submit.pWaitDstStageMask(stack.ints(VK13.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT));
			info_submit.pCommandBuffers(stack.pointers(cbuffer));
			info_submit.pSignalSemaphores(stack.longs(signalSemaphores));
			VkSubmitInfo.Buffer info_submit_buffer = new VkSubmitInfo.Buffer(stack.calloc(72*1));
			info_submit_buffer.put(0, info_submit);
			if(VK13.vkQueueSubmit(mainQueue, info_submit_buffer, fence) != VK13.VK_SUCCESS) {
				throw new RuntimeException("Failed to submit Draw Command!");
			}
			ready = false;
		}
		return a;
	}
	/**
	 * Draws.
	 * @param elements the number of elements
	 * @param instances the number of instances
	 */
	public void draw(int elements, int instances) {
		VK13.vkCmdDraw(cbuffer, elements, instances, 0, 0);
	}
	/**
	 * Draws indexed.
	 * @param elements the number of elements
	 * @param instances the number of instances
	 */
	public void drawIndexed(int elements, int instances) {
		VK13.vkCmdDrawIndexed(cbuffer, elements, instances, 0, 0, 0);
	}
	/**
	 * Dispatches the compute.
	 * @param cx groupCount X
	 * @param cy groupCount Y
	 * @param cz groupCount Z
	 */
	public void dispatchCompute(int cx, int cy, int cz) {
		VK13.vkCmdDispatch(cbuffer, cx, cy, cz);;
	}

	/**
	 * Binds a buffer to be used as an index-buffer (indices as UINT32)
	 * @param buffer the buffer
	 */
	public void bindIndexBuffer(Buffer buffer) {
		VK13.vkCmdBindIndexBuffer(cbuffer, buffer.address(), 0, VK13.VK_INDEX_TYPE_UINT32);
	}
	/**
	 * Binds a buffer to be used as an index-buffer (indices as UINT16)
	 * @param buffer the buffer
	 */
	public void bindIndexBuffer16(Buffer buffer) {
		VK13.vkCmdBindIndexBuffer(cbuffer, buffer.address(), 0, VK13.VK_INDEX_TYPE_UINT16);
	}

	/**
	 * Binds buffers to be used as vertex-buffers
	 * @param buffers the buffers
	 */
	public void bindBuffers(Buffer... buffers) {
		long[] l = new long[buffers.length];
		for(int i = 0; i < buffers.length; i++)
			l[i] = buffers[i] == null ? 0 : buffers[i].address();
		VK13.vkCmdBindVertexBuffers(cbuffer, 0, l, new long[buffers.length]);
	}
	/**
	 * {@return the {@link VkCommandBuffer} used}
	 */
	public VkCommandBuffer getCommandBuffer() {
		return cbuffer;
	}
	/**
	 * {@return if the drawer got already recorded using {@link #startDraw()} and {@link #endDraw()}}
	 */
	public boolean isRecorded() {
		return recorded;
	}
	/**
	 * {@return the used device}
	 */
	public VkDevice getDevice() {
		return device;
	}
	/**
	 * {@return the internal fence}
	 */
	public long getFence() {
		return fence;
	}
	/**
	 * {@return the used queue}
	 */
	public VkQueue getMainQueue() {
		return mainQueue;
	}
	/**
	 * {@return the command pool}
	 */
	public long getCommandPool() {
		return pool;
	}
	/**
	 * {@return the internal signal semaphores}
	 */
	public long[] getSignalSemaphores() {
		return signalSemaphores;
	}
	/**
	 * {@return the internal wait semaphores}
	 */
	public long[] getWaitSemaphores() {
		return waitSemaphores;
	}
	
	public void free() {
		VK13.vkDestroyFence(device, fence, null);
		VK13.vkFreeCommandBuffers(device, pool, cbuffer);
		active.remove(this);
	}
}
