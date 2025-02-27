package Kartoffel.Licht.AGGraphics.EXTImGui;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.HashMap;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkRect2D;

import Kartoffel.Licht.AGGraphics.AGDrawer;
import Kartoffel.Licht.AGGraphics.AGShader;
import Kartoffel.Licht.AGGraphics.AGTexture;
import Kartoffel.Licht.AGGraphics.AGVGraphics;
import Kartoffel.Licht.AGGraphics.AGVGraphics.Window;
import Kartoffel.Licht.Vulkan.Buffer;
import Kartoffel.Licht.Vulkan.Descriptor;
import Kartoffel.Licht.Vulkan.DescriptorData;
import Kartoffel.Licht.Vulkan.DescriptorData.ddImage;
import Kartoffel.Licht.Vulkan.DescriptorPool;
import Kartoffel.Licht.Vulkan.DescriptorPool.DescriptorSet;
import Kartoffel.Licht.Vulkan.GraphicsPipeline.GraphicsPipelineInfo;
import Kartoffel.Licht.Vulkan.GraphicsPipeline.GraphicsPipelineInfo.Scissor;
import Kartoffel.Licht.Vulkan.GraphicsPipeline.GraphicsPipelineInfo.Viewport;
import Kartoffel.Licht.Vulkan.Image;
import Kartoffel.Licht.Vulkan.PipelineLayout.PushConstant;
import Kartoffel.Licht.Vulkan.Sampler;
import Kartoffel.Licht.Vulkan.VertexAttribDescriptor;
import Kartoffel.Licht.Vulkan.VulkanBufferUtils;
import Kartoffel.Licht.Vulkan.VulkanFreeable;
import imgui.ImDrawData;
import imgui.ImGui;
import imgui.ImGuiIO;
import imgui.ImVec2;
import imgui.ImVec4;
import imgui.flag.ImGuiBackendFlags;
import imgui.type.ImInt;

/**
 * Simple Integration of <a href="https://github.com/ocornut/imgui">Dear ImGui</a> into the Vulkan-world. First call {@link #updateBuffers()} to upload the rendered frame, then {@link #draw(AGDrawer)} to record the draw commands into some {@link AGDrawer}.
 * Also call {@link #newFrame()} right after {@link ImGui#newFrame()} to update things, and don't forget to call {@link ImGui#updatePlatformWindows()} and {@link ImGui#renderPlatformWindowsDefault()} if using viewports!
 */
public class ImGuiIntegration implements VulkanFreeable{
	
	private Window main;
	
	private VulkanBufferUtils utils;
	
	private DescriptorPool pool;
	private DescriptorPool upool; //For user images
	private HashMap<Long, DescriptorSet> sets = new HashMap<Long, DescriptorPool.DescriptorSet>();
	
	private AGShader shader;
	private bref mbref;
	private AGTexture texture;
	private Sampler sampler;
	private DescriptorSet descriptorSet;
	
	private ImGuiImplGlfw impl;
	
	
	/**
	 * Creates a new {@link ImGuiIntegration} and all backend-structs needed. (GLFW for viewport backend). Also installs callbacks
	 * @param g the {@link AGVGraphics}
	 */
	public ImGuiIntegration(Window mainWindow) {
		this.main = mainWindow;
		this.utils = mainWindow.getParent().getUtils();
		ImGuiIO io = ImGui.getIO();
		var g = main.getParent();
		impl = new ImGuiImplGlfw(this);
		impl.init(mainWindow, true);
		
		io.setDisplaySize(main.getWidth(), main.getHeight());
		io.setDisplayFramebufferScale(1f, 1f);
		io.addBackendFlags(ImGuiBackendFlags.PlatformHasViewports|ImGuiBackendFlags.RendererHasViewports);
		
		sampler = g.generateTextureSampler(false, false, VK13.VK_SAMPLER_ADDRESS_MODE_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_REPEAT, 0);
		
		ImInt texWidth = new ImInt();
		ImInt texHeight = new ImInt();
		ByteBuffer buf = io.getFonts().getTexDataAsRGBA32(texWidth, texHeight);
		texture = g.generateTexture2D(VK13.VK_FORMAT_R8G8B8A8_UNORM, texWidth.get(), texHeight.get());
		g.transitionTexture(texture, VK13.VK_IMAGE_LAYOUT_GENERAL,
				VK13.VK_ACCESS_SHADER_READ_BIT, 
				VK13.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);
		g.putTexture2D(texture, buf, texWidth.get(), texHeight.get(), 0, 0);
		
		try {
			shader = g.createShaderPipeline(new String(ImGuiIntegration.class.getResourceAsStream("imgui.vs").readAllBytes()), new String(ImGuiIntegration.class.getResourceAsStream("imgui.fs").readAllBytes()),
					new Descriptor[][] {{new Descriptor(0, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, VK13.VK_SHADER_STAGE_FRAGMENT_BIT)}},
					new PushConstant[] {new PushConstant(VK13.VK_SHADER_STAGE_VERTEX_BIT, 0, 4*4)},
					new GraphicsPipelineInfo(VK13.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST, new int[] {VK13.VK_DYNAMIC_STATE_VIEWPORT, VK13.VK_DYNAMIC_STATE_SCISSOR}, new Viewport[] {new Viewport()}, new Scissor[] {new Scissor()}, new VertexAttribDescriptor[] {
							new VertexAttribDescriptor(0, 0, VK13.VK_FORMAT_R32G32_SFLOAT, 0),
							new VertexAttribDescriptor(0, 1, VK13.VK_FORMAT_R32G32_SFLOAT, 4*2),
							new VertexAttribDescriptor(0, 2, VK13.VK_FORMAT_R8G8B8A8_UNORM, 4*4)
					}, 20)
					.setDepthStencil_depthCompareOp(VK13.VK_COMPARE_OP_ALWAYS)
					.setRasterization_cullMode(VK13.VK_CULL_MODE_NONE),
					mainWindow.getCanvas().getRenderpass()
					);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Shader files for ImGui not found!");
		}
		pool = shader.createDescriptorPool(0, 1);
		upool = shader.createDescriptorPool(0, 10);
		descriptorSet = g.createDescriptorSets(pool, shader.getDescriptorLayouts()[0])[0];
		var data = new DescriptorData[] {
				AGVGraphics.di(texture, sampler, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
			};
		g.setDataOfDescriptorSet(descriptorSet, data);
		
		mbref = new bref();
	}
	public void recreateFontAtlas() {
		var io = ImGui.getIO();
		var g = main.getParent();
		ImInt texWidth = new ImInt();
		ImInt texHeight = new ImInt();
		ByteBuffer buf = io.getFonts().getTexDataAsRGBA32(texWidth, texHeight);
		texture.free();
		texture = g.generateTexture2D(VK13.VK_FORMAT_R8G8B8A8_UNORM, texWidth.get(), texHeight.get());
		g.transitionTexture(texture, VK13.VK_IMAGE_LAYOUT_GENERAL,
				VK13.VK_ACCESS_SHADER_READ_BIT, 
				VK13.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);
		g.putTexture2D(texture, buf, texWidth.get(), texHeight.get(), 0, 0);
		//Update descriptor set
		var data = new DescriptorData[] {
				AGVGraphics.di(texture, sampler, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
			};
		g.setDataOfDescriptorSet(descriptorSet, data);
	}
	/**
	 * Use the layouts, etc.. compatible with the shader provided using {@link #getShader()}!
	 * @param image the image descriptor data
	 * @return the id of the registered texture (is the address of the {@link Image})
	 */
	public long registerTexture(ddImage image) {
		long id = image.getImage().address();
		DescriptorSet nw = main.getParent().createDescriptorSets(upool, shader.getDescriptorLayouts()[0])[0];
		
		main.getParent().setDataOfDescriptorSet(nw, image);
		sets.put(id, nw);
		return id;
	}
	/**
	 * Unregisters the texture
	 * @param id the id (is the address of the {@link Image})
	 */
	public void unregisterTexture(long id) {
		VK13.vkFreeDescriptorSets(shader.getDevice().device(), upool.getAddress(), sets.remove(id).set);
	}
	/**
	 * {@return Helper class}
	 */
	public ImGuiImplGlfw getGLFWImpl() {
		return impl;
	}
	
	private int hsh = 0;
	/**
	 * Updates the main Buffers if necessary
	 */
	public void updateMainBuffers() {
		int h = hash(ImGui.getDrawData());
		if(hsh == h)
			return;
		hsh = h;
		updateBuffers(ImGui.getDrawData(), mbref);
	}
	/**
	 * Draws the Main-Viewport
	 * @param drawer the drawer to record the commands to
	 */
	public void drawMain(AGDrawer drawer) {
		draw(drawer, ImGui.getDrawData(), mbref);
	}
	/**
	 * Does things for Viewports to work properly
	 */
	public void newFrame() {
		impl.newFrame();
	}
	/**
	 * Records various commands to the {@link AGDrawer}.
	 * @param drawer -
	 * @param viewport the viewport
	 */
	public void draw(AGDrawer drawer, ImDrawData imDrawData, bref bref) {
		if(bref.indices != null) {
			drawer.bindShader(shader);
			drawer.setViewport(0, 0, 0, imDrawData.getDisplaySizeX(), imDrawData.getDisplaySizeY(), 0, 1);
			drawer.bindIndexBuffer16(bref.indices);
			drawer.bindBuffers(bref.vertices);
			ImVec2 displayOffset = new ImVec2();
			try(MemoryStack stack = MemoryStack.stackPush()) {
				
				FloatBuffer pushConstantBuffer = stack.mallocFloat(2);
	            pushConstantBuffer.put(0, 2.0f / imDrawData.getDisplaySizeX());
	            pushConstantBuffer.put(1, -2.0f / imDrawData.getDisplaySizeY());
	            VK13.vkCmdPushConstants(drawer.getCommandBuffer(), shader.getPipeline().getLayout().getAddress(),
	                    VK13.VK_SHADER_STAGE_VERTEX_BIT, 0, pushConstantBuffer);
	            
	            drawer.bindDescriptorSets(shader, descriptorSet);
	            boolean a = false;
	            ImVec4 imVec4 = new ImVec4();
	            VkRect2D.Buffer rect = VkRect2D.calloc(1, stack);
	            int numCmdLists = imDrawData.getCmdListsCount();
	            int offsetIdx = 0;
	            int offsetVtx = 0;
            	FloatBuffer pushConstantBuffer2 = stack.mallocFloat(2);
	            for (int i = 0; i < numCmdLists; i++) {
	                int cmdBufferSize = imDrawData.getCmdListCmdBufferSize(i);
	                for (int j = 0; j < cmdBufferSize; j++) {
	                	long id = imDrawData.getCmdListCmdBufferTextureId(i, j);
	                	if(id != 0) {
	                		a = true;
	                		if(!sets.containsKey(id)) {
	                			throw new RuntimeException("No registered texture found with id: " + id + "!");
	                		}
	                		drawer.bindDescriptorSets(shader, sets.get(id));
	                		
	                	} else if(a) {
	                		drawer.bindDescriptorSets(shader, descriptorSet);
	                		a = false;
	                	}
	                	
	                	imDrawData.getDisplayPos(displayOffset);
	                	pushConstantBuffer2.put(0, -displayOffset.x);
	                	pushConstantBuffer2.put(1, -displayOffset.y);
	    	            VK13.vkCmdPushConstants(drawer.getCommandBuffer(), shader.getPipeline().getLayout().getAddress(),
	    	                    VK13.VK_SHADER_STAGE_VERTEX_BIT, 4*2, pushConstantBuffer2);
	                    imDrawData.getCmdListCmdBufferClipRect(imVec4, i, j);
	                    rect.offset(it -> it.x((int) (Math.max(imVec4.x-displayOffset.x, 0))).y((int) (Math.max(imVec4.y-displayOffset.y, 1))));
	                    rect.extent(it -> it.width((int) (imVec4.z - imVec4.x)).height((int) (imVec4.w - imVec4.y)));
	                    VK13.vkCmdSetScissor(drawer.getCommandBuffer(), 0, rect);
	                    int numElements = imDrawData.getCmdListCmdBufferElemCount(i, j);
	                    VK13.vkCmdDrawIndexed(drawer.getCommandBuffer(), numElements, 1,
	                            offsetIdx + imDrawData.getCmdListCmdBufferIdxOffset(i, j),
	                            offsetVtx + imDrawData.getCmdListCmdBufferVtxOffset(i, j), 0);
	                }
	                offsetIdx += imDrawData.getCmdListIdxBufferSize(i);
	                offsetVtx += imDrawData.getCmdListVtxBufferSize(i);
	            }
	            
			}
		} else {
			System.err.println("Not drawable!"); //For some reason exception does not get thrown
			throw new RuntimeException("Not drawable!");
		}
	}
	/**
	 * data for an ImGui viewport
	 */
	class bref {
		/**
		 * the buffers
		 */
		public Buffer vertices, indices;
		/**
		 *  the current hashCode of the buffers
		 */
		public int hash;
	}
	/**
	 * The size difference between the current Buffers size and the actual size of the data that is required to trigger a resize. (bytes)
	 */
	public static int MERCY_BYTES = 16384;
	/**
	 * Puts the rendered data into the buffers.
	 */
	public void updateBuffers(ImDrawData imDrawData, bref bref) {
		impl.drawers.forEach((_, b)->{b.join();});
		int sizeOfImDrawVert = ImDrawData.sizeOfImDrawVert();
		int sizeOfImDrawIdx = ImDrawData.sizeOfImDrawIdx();
        int vertexBufferSize = imDrawData.getTotalVtxCount() * sizeOfImDrawVert;
        int indexBufferSize = imDrawData.getTotalIdxCount() * sizeOfImDrawIdx;
        if (vertexBufferSize == 0 || indexBufferSize == 0) {
            return;
        }
        if(bref.vertices == null) {
        	bref.vertices = utils.generateBuffer(vertexBufferSize, VK13.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT, false, false, false, 0, true, true, true);
        }else if (vertexBufferSize > bref.vertices.memory().getMemorySize() || vertexBufferSize+MERCY_BYTES < bref.vertices.memory().getMemorySize()) {
        	bref.vertices.free();
        	bref.vertices = utils.generateBuffer(vertexBufferSize, VK13.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT, false, false, false, 0, true, true, true);
//        	System.out.println("New Vertex Buffer! " + vertexBufferSize);
        }
        if(bref.indices == null) {
        	bref.indices = utils.generateBuffer(indexBufferSize, VK13.VK_BUFFER_USAGE_INDEX_BUFFER_BIT, false, false, false, 0, true, true, true);
        }else if (indexBufferSize > bref.indices.memory().getMemorySize() || indexBufferSize+MERCY_BYTES < bref.indices.memory().getMemorySize()) {
        	bref.indices.free();
        	bref.indices = utils.generateBuffer(indexBufferSize, VK13.VK_BUFFER_USAGE_INDEX_BUFFER_BIT, false, false, false, 0, true, true, true);
//        	System.out.println("New Index Buffer! " + indexBufferSize);
        }
        
        ByteBuffer dstVertexBuffer = bref.vertices.allocator().mapMemory(bref.vertices.memory());
        ByteBuffer dstIndexBuffer = bref.indices.allocator().mapMemory(bref.indices.memory());
//        System.err.println(dstVertexBuffer.capacity() + " " + dstIndexBuffer.capacity());
        int numCmdLists = imDrawData.getCmdListsCount();
//        System.out.println("Number of lists: " + numCmdLists);
        for (int i = 0; i < numCmdLists; i++) {
        	{
	        	int vtxbs = imDrawData.getCmdListVtxBufferSize(i)*sizeOfImDrawVert;
	            ByteBuffer imguiVertexBuffer = imDrawData.getCmdListVtxBufferData(i);
	            dstVertexBuffer.put(dstVertexBuffer.position(), imguiVertexBuffer, 0, vtxbs);
	            dstVertexBuffer.position(dstVertexBuffer.position()+vtxbs);
//	            System.err.println("Vertex count: " + vtxbs + " into " + dstVertexBuffer.capacity() + " " + vertexBufferSize + " " + imguiVertexBuffer.capacity() + " " + dstVertexBuffer.position());
        	}
        	{	// Always get the indices buffer after finishing with the vertices buffer
	            int idxbs = imDrawData.getCmdListIdxBufferSize(i)*sizeOfImDrawIdx;
	            ByteBuffer imguiIndexBuffer = imDrawData.getCmdListIdxBufferData(i);
	            dstIndexBuffer.put(dstIndexBuffer.position(), imguiIndexBuffer, 0, idxbs);
	            dstIndexBuffer.position(dstIndexBuffer.position()+idxbs);
//	            System.err.println("Index count: " + idxbs + " into " + dstIndexBuffer.capacity() + " " + indexBufferSize + " " + imguiIndexBuffer.capacity());
        	}
        }
//        System.err.println("end");
        bref.vertices.allocator().unmapMemory(bref.vertices.memory());
        bref.indices.allocator().unmapMemory(bref.indices.memory());
	}
	/**
	 * Hashes the ImDrawData
	 * @param imDrawData -
	 * @return -
	 */
	public static int hash(ImDrawData imDrawData) {
		int val = 642864514;
		int numCmdLists = imDrawData.getCmdListsCount();
		int sizeOfImDrawVert = ImDrawData.sizeOfImDrawVert();
		int sizeOfImDrawIdx = ImDrawData.sizeOfImDrawIdx();
	      for (int i = 0; i < numCmdLists; i++) {
	      	{
		        	int vtxbs = imDrawData.getCmdListVtxBufferSize(i)*sizeOfImDrawVert;
		            ByteBuffer imguiVertexBuffer = imDrawData.getCmdListVtxBufferData(i).slice(0, vtxbs);
		            val ^= imguiVertexBuffer.hashCode();
	      	}
	      	{	// Always get the indices buffer after finishing with the vertices buffer
		            int idxbs = imDrawData.getCmdListIdxBufferSize(i)*sizeOfImDrawIdx;
		            ByteBuffer imguiIndexBuffer = imDrawData.getCmdListIdxBufferData(i).slice(0, idxbs);
		            val ^= imguiIndexBuffer.hashCode();
	      	}
	      }
		return val;
	}
	
	/**
	 * {}@return the texture}
	 */
	public AGTexture getFontTexture() {
		return texture;
	}
	/**
	 * {@return the shader}
	 */
	public AGShader getShader() {
		return shader;
	}
	/**
	 * {@return the sampler}
	 */
	public Sampler getFontSampler() {
		return sampler;
	}

	@Override
	public void free() {
		impl.shutdown();
		pool.free();
		upool.free();
		shader.free();
		if(mbref.indices != null) {
			mbref.vertices.free();
			mbref.indices.free();
		}
		texture.free();
		sampler.free();
	}
	public boolean drawable() {
		return mbref.indices != null;
	}

}
