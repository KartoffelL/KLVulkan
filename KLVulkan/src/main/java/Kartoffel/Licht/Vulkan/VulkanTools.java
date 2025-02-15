package Kartoffel.Licht.Vulkan;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.joml.Vector4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVulkan;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.vma.Vma;
import org.lwjgl.vulkan.KHRSurface;
import org.lwjgl.vulkan.KHRSwapchain;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkApplicationInfo;
import org.lwjgl.vulkan.VkAttachmentDescription;
import org.lwjgl.vulkan.VkAttachmentReference;
import org.lwjgl.vulkan.VkBufferCopy;
import org.lwjgl.vulkan.VkBufferCreateInfo;
import org.lwjgl.vulkan.VkBufferImageCopy;
import org.lwjgl.vulkan.VkClearValue;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.lwjgl.vulkan.VkCommandBufferAllocateInfo;
import org.lwjgl.vulkan.VkCommandBufferBeginInfo;
import org.lwjgl.vulkan.VkCommandPoolCreateInfo;
import org.lwjgl.vulkan.VkComputePipelineCreateInfo;
import org.lwjgl.vulkan.VkDescriptorBufferInfo;
import org.lwjgl.vulkan.VkDescriptorImageInfo;
import org.lwjgl.vulkan.VkDescriptorPoolCreateInfo;
import org.lwjgl.vulkan.VkDescriptorPoolSize;
import org.lwjgl.vulkan.VkDescriptorSetAllocateInfo;
import org.lwjgl.vulkan.VkDescriptorSetLayoutBinding;
import org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkDeviceCreateInfo;
import org.lwjgl.vulkan.VkDeviceQueueCreateInfo;
import org.lwjgl.vulkan.VkExtensionProperties;
import org.lwjgl.vulkan.VkExtent2D;
import org.lwjgl.vulkan.VkExtent3D;
import org.lwjgl.vulkan.VkFenceCreateInfo;
import org.lwjgl.vulkan.VkFramebufferCreateInfo;
import org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo;
import org.lwjgl.vulkan.VkImageCreateInfo;
import org.lwjgl.vulkan.VkImageMemoryBarrier;
import org.lwjgl.vulkan.VkImageViewCreateInfo;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkInstanceCreateInfo;
import org.lwjgl.vulkan.VkLayerProperties;
import org.lwjgl.vulkan.VkMemoryHeap;
import org.lwjgl.vulkan.VkMemoryRequirements;
import org.lwjgl.vulkan.VkMemoryType;
import org.lwjgl.vulkan.VkOffset2D;
import org.lwjgl.vulkan.VkOffset3D;
import org.lwjgl.vulkan.VkPhysicalDevice;
import org.lwjgl.vulkan.VkPhysicalDeviceFeatures;
import org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties;
import org.lwjgl.vulkan.VkPhysicalDeviceProperties;
import org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState;
import org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo;
import org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo;
import org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo;
import org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo;
import org.lwjgl.vulkan.VkPipelineLayoutCreateInfo;
import org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo;
import org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo;
import org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo;
import org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo;
import org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo;
import org.lwjgl.vulkan.VkPushConstantRange;
import org.lwjgl.vulkan.VkQueue;
import org.lwjgl.vulkan.VkQueueFamilyProperties;
import org.lwjgl.vulkan.VkRect2D;
import org.lwjgl.vulkan.VkRenderPassBeginInfo;
import org.lwjgl.vulkan.VkRenderPassCreateInfo;
import org.lwjgl.vulkan.VkSamplerCreateInfo;
import org.lwjgl.vulkan.VkSemaphoreCreateInfo;
import org.lwjgl.vulkan.VkSemaphoreWaitInfo;
import org.lwjgl.vulkan.VkShaderModuleCreateInfo;
import org.lwjgl.vulkan.VkSubmitInfo;
import org.lwjgl.vulkan.VkSubpassDependency;
import org.lwjgl.vulkan.VkSubpassDescription;
import org.lwjgl.vulkan.VkSurfaceCapabilitiesKHR;
import org.lwjgl.vulkan.VkSwapchainCreateInfoKHR;
import org.lwjgl.vulkan.VkVertexInputAttributeDescription;
import org.lwjgl.vulkan.VkVertexInputBindingDescription;
import org.lwjgl.vulkan.VkViewport;
import org.lwjgl.vulkan.VkWriteDescriptorSet;

import Kartoffel.Licht.Vulkan.Allocator.Memory;
import Kartoffel.Licht.Vulkan.DescriptorData.ddBuffer;
import Kartoffel.Licht.Vulkan.DescriptorData.ddImage;
import Kartoffel.Licht.Vulkan.DescriptorPool.DescriptorSet;
import Kartoffel.Licht.Vulkan.GraphicsPipeline.GraphicsPipelineInfo;
import Kartoffel.Licht.Vulkan.PipelineLayout.PushConstant;
import Kartoffel.Licht.Vulkan.Impls.Allocator_Vma_Impl;
import Kartoffel.Licht.Vulkan.VulkanInstance.Device;
import Kartoffel.Licht.Vulkan.VulkanInstance.MemoryProperties;
import Kartoffel.Licht.Vulkan.VulkanInstance.QueueFamily;
import Kartoffel.Licht.Vulkan.VulkanInstance.ValidationLayer;
import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;


/**
 * Class for creating Vulkan Objects and doing stuff with them.
 */
public class VulkanTools {
	
	VulkanTools() {
		
	}
	
	
//	public static void configureDescriptor(VkDevice device, long descriptor, int binding, long[] offset, long[] range, vbuffer[] ubuffer, AGTextureVulkan[] textures, long[] sampler) {
//		
//		try(MemoryStack stack = MemoryStack.stackPush()) {
//			VkDescriptorBufferInfo.Buffer buffer_buffer = new VkDescriptorBufferInfo.Buffer(stack.calloc(24*ubuffer.length));
//			VkDescriptorImageInfo.Buffer image_buffer = new VkDescriptorImageInfo.Buffer(stack.calloc(1));
//			
//			for(int i = 0; i < ubuffer.length; i++) {
//				VkDescriptorBufferInfo info = new VkDescriptorBufferInfo(stack.calloc(24));
//				info.buffer(ubuffer[i].address);
//				info.offset(offset[i]);
//				info.range(range[i]);
//				buffer_buffer.put(i, info);
//			}
//			for(int i = 0; i < textures.length; i++) {
//				VkDescriptorImageInfo info = new VkDescriptorImageInfo(stack.calloc(24));
//				info.sampler(sampler[i]);
//				info.imageView(textures[i].imageview);
//				info.imageLayout(VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER);
//				image_buffer.put(0, info);
//			}
//			
//			
//			VkWriteDescriptorSet set = new VkWriteDescriptorSet(stack.calloc(64));
//			set.sType(VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
//			set.dstSet(descriptor);
//			set.dstBinding(binding);
//			set.dstArrayElement(0);
//			set.descriptorType(VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER);
//			set.descriptorCount(1);
//			set.pBufferInfo(buffer_buffer);
//			set.pImageInfo(image_buffer);
//			set.pTexelBufferView(null);
//			
//			VkWriteDescriptorSet.Buffer set_buffer = new VkWriteDescriptorSet.Buffer(stack.calloc(64*1));
//			set_buffer.put(0, set);
//			
//			VK13.vkUpdateDescriptorSets(device, set_buffer, null);
//			
//		}
//	}
	
//	public static int getSuitableMemoryIndex(VulkanInstance instance, graphicsDevice dv, int suitableFlags) {
//		for(int i = 0; i < dv.memory().type_flags().length; i++) {
//			int flags = dv.memory().type_flags()[i];
//			if((flags & suitableFlags) != suitableFlags)
//				continue;
//			return i;
//		}
//		return -1;
//	}
	
	
	
	/**
	 * Allocates Descriptor Sets
	 * @param device -
	 * @param pool -
	 * @param layouts -
	 * @return -
	 */
	public static long[] allocateDescriptorSets(VkDevice device, DescriptorPool pool, DescriptorSetLayout...layouts) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkDescriptorSetAllocateInfo info = new VkDescriptorSetAllocateInfo(stack.calloc(40));
			info.sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO);
			info.descriptorPool(pool.address);
			long[] dlayouts = new long[layouts.length];
			for(int i = 0; i < dlayouts.length; i++)
				dlayouts[i] = layouts[i].address;
			info.pSetLayouts(stack.longs(dlayouts));
			long[] l = new long[layouts.length];
			check("Failed to allocate Descriptor Sets!", VK13.vkAllocateDescriptorSets(device, info, l));
			return l;
		}
	}
	/**
	 * Starts recording 
	 * @param buffer the buffer to set up for recording
	 */
	public static void beginRecording(VkCommandBuffer buffer) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkCommandBufferBeginInfo info = new VkCommandBufferBeginInfo(stack.calloc(32));
			info.sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO);
			info.flags(0);
			info.pInheritanceInfo(null);
			check("Failed to begin Recording of Command Buffer!", VK13.vkBeginCommandBuffer(buffer, info));
		}
	}
	/**
	 * Starts a single-use command buffer
	 * @param device the device
	 * @param commandPool the commandPool
	 * @return the created single-use command buffer 
	 */
	public static VkCommandBuffer beginSingleUseCommandBuffer(VkDevice device, long commandPool) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VkCommandBufferAllocateInfo info = new VkCommandBufferAllocateInfo(stack.calloc(32));
			info.sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
			info.level(VK13.VK_COMMAND_BUFFER_LEVEL_PRIMARY);
			info.commandPool(commandPool);
			info.commandBufferCount(1);
			PointerBuffer pb = stack.callocPointer(1);
			VK13.vkAllocateCommandBuffers(device, info, pb);
			VkCommandBuffer commandbuffer = new VkCommandBuffer(pb.get(0), device);
			
			VkCommandBufferBeginInfo info_begin = new VkCommandBufferBeginInfo(stack.calloc(32));
			info_begin.sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO);
			info_begin.flags(VK13.VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT);
			VK13.vkBeginCommandBuffer(commandbuffer, info_begin);
			return commandbuffer;
		}
	}
	/**
	 * Checks if the result is valid, throws an {@link RuntimeException} otherwise
	 * @param message -
	 * @param vkResult -
	 */
	public static void check(String message, int vkResult) {
		if(vkResult == 0)
			return;
		throw new RuntimeException(message + " " + vkResult + " " + VulkanDebugUtil.getMeaning(vkResult));
	}
	/**
	 * Begins a Render pass
	 * @param buffer -
	 * @param renderpass -
	 * @param framebuffer -
	 * @param x -
	 * @param y -
	 * @param width -
	 * @param height -
	 * @param ClearColor -
	 */
	public static void cmdBeginRenderPass(VkCommandBuffer buffer, long renderpass, Framebuffer framebuffer, int x, int y, int width, int height, Vector4f...ClearColor) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkRenderPassBeginInfo info_begin = new VkRenderPassBeginInfo(stack.calloc(64));
			info_begin.sType(VK13.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO);
			info_begin.renderPass(renderpass);
			info_begin.framebuffer(framebuffer.getAddress());
			VkOffset2D off = new VkOffset2D(stack.calloc(8));
			off.x(x).y(y);
			VkExtent2D ext = new VkExtent2D(stack.calloc(8));
			ext.set(width, height);
			info_begin.renderArea().offset(off);
			info_begin.renderArea().extent(ext);
			
			VkClearValue.Buffer clearColor_buffer = new VkClearValue.Buffer(stack.calloc(16*ClearColor.length));
			for(int i = 0; i < ClearColor.length; i++) {
				VkClearValue  clearColor = new VkClearValue(stack.calloc(16));
				clearColor.color().float32(0, ClearColor[i].x).float32(1, ClearColor[i].y).float32(2, ClearColor[i].z).float32(3, ClearColor[i].w);
				clearColor_buffer.put(i, clearColor);
			}
			info_begin.clearValueCount(ClearColor.length);
			info_begin.pClearValues(clearColor_buffer);
			
			VK13.vkCmdBeginRenderPass(buffer, info_begin, VK13.VK_SUBPASS_CONTENTS_INLINE);
		}
	}
	/**
	 * Copies some memory from src to dst.
	 * @param src the source
	 * @param dst the destination
	 * @param srcOff the source offset
	 * @param dstOff the destination offset
	 * @param size the size
	 * @param commandPool the commandPool
	 * @param queue the queue
	 */
	public static void copyBuffer(Buffer src, Buffer dst, long srcOff, long dstOff, long size, long commandPool, VkQueue queue) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VkCommandBuffer commandbuffer = beginSingleUseCommandBuffer(src.device(), commandPool);
			
			VkBufferCopy copyRegion = new VkBufferCopy(stack.calloc(24));
			copyRegion.srcOffset(srcOff);
			copyRegion.dstOffset(dstOff);
			copyRegion.size(size);
			VkBufferCopy.Buffer copyRegion_buffer = new VkBufferCopy.Buffer(stack.calloc(24*1));
			copyRegion_buffer.put(0, copyRegion);
			VK13.vkCmdCopyBuffer(commandbuffer, src.address(), dst.address(), copyRegion_buffer);
			
			endSingleUseCommandBufferAndSubmit(src.device(), commandPool, commandbuffer, queue);
			
		}
	}
	/**
	 * Copies some memory from src o dst
	 * @param buffer the buffer
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param height the height
	 * @param commandPool the commandPool
	 * @param queue the queue
	 */
	public static void copyBuffer2Image(Buffer buffer, Image image, int x, int y, int width, int height, long commandPool, VkQueue queue) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VkCommandBuffer commandbuffer = beginSingleUseCommandBuffer(buffer.device(), commandPool);
			 VkBufferImageCopy copy = new  VkBufferImageCopy(stack.calloc(56));
			 copy.bufferOffset(0);
			 copy.bufferRowLength(0);
			 copy.bufferImageHeight(0);
			 
			 copy.imageSubresource().aspectMask(VK13.VK_IMAGE_ASPECT_COLOR_BIT);
			 copy.imageSubresource().mipLevel(0);
			 copy.imageSubresource().baseArrayLayer(0);
			 copy.imageSubresource().layerCount(1);
			 
			 VkOffset3D offset = new VkOffset3D(stack.calloc(12));
			 offset.set(x, y, 0);
			 copy.imageOffset(offset);
			 VkExtent3D extent = new VkExtent3D(stack.calloc(12));
			 extent.width(width);
			 extent.height(height);
			 extent.depth(1);
			 copy.imageExtent(extent);
			 
			 VkBufferImageCopy.Buffer copy_buffer = new VkBufferImageCopy.Buffer(stack.calloc(56*1));
			 copy_buffer.put(0, copy);
			 
			 VK13.vkCmdCopyBufferToImage(commandbuffer, buffer.address(), image.address(), VK13.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, copy_buffer);
			
			endSingleUseCommandBufferAndSubmit(buffer.device(), commandPool, commandbuffer, queue);
			
		}
	}
	/**
	 * Copies some memory from src o dst
	 * @param src the image
	 * @param layout the layout of the image
	 * @param dst the destination
	 * @param width the width
	 * @param height the height
	 * @param commandPool the commandPool
	 * @param queue the queue
	 */
	public static void copyImage2Buffer(Image src, long layout, Buffer dst, int width, int height, long commandPool, VkQueue queue) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VkCommandBuffer commandbuffer = beginSingleUseCommandBuffer(src.device(), commandPool);
			 VkBufferImageCopy copy = new  VkBufferImageCopy(stack.calloc(56));
			 copy.bufferOffset(0);
			 copy.bufferRowLength(0);
			 copy.bufferImageHeight(0);
			 
			 copy.imageSubresource().aspectMask(VK13.VK_IMAGE_ASPECT_COLOR_BIT);
			 copy.imageSubresource().mipLevel(0);
			 copy.imageSubresource().baseArrayLayer(0);
			 copy.imageSubresource().layerCount(1);
			 
			 VkOffset3D offset = new VkOffset3D(stack.calloc(12));
			 copy.imageOffset(offset);
			 VkExtent3D extent = new VkExtent3D(stack.calloc(12));
			 extent.width(width);
			 extent.height(height);
			 extent.depth(1);
			 copy.imageExtent(extent);
			 
			 VkBufferImageCopy.Buffer copy_buffer = new VkBufferImageCopy.Buffer(stack.calloc(56*1));
			 copy_buffer.put(0, copy);
			 VK13.vkCmdCopyImageToBuffer(commandbuffer, src.address(), (int) layout, dst.address(), copy_buffer);
			endSingleUseCommandBufferAndSubmit(src.device(), commandPool, commandbuffer, queue);
			
		}
	}
	/**
	 * Creates a new Buffer
	 * @param allocator -
	 * @param sizeBytes -
	 * @param vkbufferusage -
	 * @param memorySuitableFlags -
	 * @param memoryPreferredFlags -
	 * @return the created Buffer
	 */
	public static Buffer createBuffer(Allocator allocator, long sizeBytes, int vkbufferusage, int memorySuitableFlags, int memoryPreferredFlags) {
		long[] arrl = new long[1];
		VkDevice d = allocator.getDevice();
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkBufferCreateInfo info = new VkBufferCreateInfo(stack.calloc(56));
			info.sType(VK13.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO);
			info.size(sizeBytes);
			info.usage(vkbufferusage);
			info.sharingMode(VK13.VK_SHARING_MODE_EXCLUSIVE);
			check("Failed to create Buffer!", VK13.vkCreateBuffer(d, info, null, arrl));
			long buffer = arrl[0];
			VkMemoryRequirements requirements = new VkMemoryRequirements(stack.calloc(24));
			VK13.vkGetBufferMemoryRequirements(d, buffer, requirements);
			Allocator.Memory memory = allocator.allocateMemory(new Allocator_Vma_Impl.MemoryAllocationInfoImpl(requirements, 0, memorySuitableFlags, memoryPreferredFlags));
			VK13.vkBindBufferMemory(d, buffer, memory.getMemoryAddress(), memory.getMemoryOffset());
			return new Buffer(buffer, allocator, memory, d);
		}
	}
	/**
	 * Creates a Commandbuffer
	 * @param device -
	 * @param commandPool -
	 * @return -
	 */
	public static VkCommandBuffer createCommandBuffer(VkDevice device, long commandPool) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkCommandBufferAllocateInfo info_cb = new VkCommandBufferAllocateInfo(stack.calloc(32));
			info_cb.sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
			info_cb.commandPool(commandPool);
			info_cb.level(VK13.VK_COMMAND_BUFFER_LEVEL_PRIMARY);
			info_cb.commandBufferCount(1);
			PointerBuffer pb = stack.callocPointer(1);
			check("Failed to allocate Command Buffer!", VK13.vkAllocateCommandBuffers(device, info_cb, pb));
			return new VkCommandBuffer(pb.get(0), device);
		}
	}
	/**
	 * Creates a command Pool
	 * @param device -
	 * @param queueFamIndex -
	 * @return -
	 */
	public static long createCommandPool(VkDevice device, int queueFamIndex) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			
			VkCommandPoolCreateInfo info_cp = new VkCommandPoolCreateInfo(stack.calloc(24));
			info_cp.sType(VK13.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO);
			info_cp.flags(VK13.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT);
			info_cp.queueFamilyIndex(queueFamIndex);
			check("Failed to create Command Pool!", VK13.vkCreateCommandPool(device, info_cp, null, arrl));
			long commandpool = arrl[0];
			return commandpool;
		}
	}
	/**
	 * Creates a {@link ComputePipeline}
	 * @param stage -
	 * @param device -
	 * @param layout -
	 * @return -
	 */
	public static ComputePipeline createComputePipeline(ShaderStage stage, VirtualDevice device, PipelineLayout layout) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			
			VkPipelineShaderStageCreateInfo info_stage = new VkPipelineShaderStageCreateInfo(stack.calloc(48));
			info_stage.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO);
			info_stage.stage(stage.bits); //VK13.VK_SHADER_STAGE_VERTEX_BIT
			info_stage.module(stage.module.address);
			info_stage.pName(stack.ASCII(stage.entrypoint));
			
			
			VkComputePipelineCreateInfo info = new VkComputePipelineCreateInfo(stack.calloc(96));
			info.sType(VK13.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO);
			info.layout(layout.address);
			info.stage(info_stage);
			
			VkComputePipelineCreateInfo.Buffer info_buffer = new VkComputePipelineCreateInfo.Buffer(stack.calloc(96*1));
			info_buffer.put(0, info);
			check("Failed to create Compute Pipeline!", VK13.vkCreateComputePipelines(device.device(), 0, info_buffer, null, arrl));
			ComputePipeline res = new ComputePipeline();
			res.address = arrl[0];
			res.device = device;
			res.layout = layout;
			return res;
		}
	}
	/**
	 * Creates a Descriptor Pool
	 * @param device -
	 * @param types -
	 * @param amounts -
	 * @param amount -
	 * @return -
	 */
	public static DescriptorPool createDescriptorPool(VirtualDevice device, int[] types, int[] amounts, int amount) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			
			VkDescriptorPoolSize.Buffer poolSize_buffer = new VkDescriptorPoolSize.Buffer(stack.calloc(8*types.length));
			for(int i = 0; i < types.length; i++) {
				VkDescriptorPoolSize poolSize = new VkDescriptorPoolSize(stack.calloc(8));
				poolSize.type(types[i]);
				poolSize.descriptorCount(amounts[i]*amount);
				poolSize_buffer.put(i, poolSize);
			}
			
			VkDescriptorPoolCreateInfo poolInfo = new VkDescriptorPoolCreateInfo(stack.calloc(40));
			poolInfo.sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
			poolInfo.pPoolSizes(poolSize_buffer);
			poolInfo.maxSets(amount);
			
			check("Failed to create Descriptor Pool!", VK13.vkCreateDescriptorPool(device.device(), poolInfo, null, arrl));
			var res = new DescriptorPool();
			res.address = arrl[0];
			res.device = device;
			return res;
		}
	}
	/**
	 * Creates a {@link DescriptorSetLayout}
	 * @param device -
	 * @param b -
	 * @param dtype -
	 * @param stageFlags -
	 * @return -
	 */
	public static DescriptorSetLayout createDescriptorSetLayout(VirtualDevice device, int[] b, int[] dtype, int[] stageFlags) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkDescriptorSetLayoutBinding.Buffer info_buffer = new VkDescriptorSetLayoutBinding.Buffer(stack.calloc(24*b.length));
			
			for(int i = 0; i < b.length; i++) {
				VkDescriptorSetLayoutBinding binding = new VkDescriptorSetLayoutBinding(stack.calloc(24));
				binding.binding(b[i]);
				binding.descriptorType(dtype[i]);
				binding.descriptorCount(1);
				binding.stageFlags(stageFlags[i]); //Global
				binding.pImmutableSamplers(null);
				info_buffer.put(i, binding);
			}
			
			VkDescriptorSetLayoutCreateInfo info = new VkDescriptorSetLayoutCreateInfo(stack.calloc(32));
			info.sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
			info.pBindings(info_buffer);
			
			check("Failed to create Descriptor Set Layout!", VK13.vkCreateDescriptorSetLayout(device.device(), info, null, arrl));
			DescriptorSetLayout res = new DescriptorSetLayout(arrl[0], device);
			return res;
		}
	}
	/**
	 * Creates a Device
	 * @param device -
	 * @param queueFamilyIndex -
	 * @param features -
	 * @param Extensions -
	 * @return -
	 */
	public static VirtualDevice createDevice(Device device, int[] queueFamilyIndex, String features, String...Extensions) {
		VkDevice d = createDevice(device.device(), queueFamilyIndex, features, Extensions);
		return new VirtualDevice(device, d);
	}
	
	/**
	 * Creates a Device
	 * @param device -
	 * @param queueFamilyIndex -
	 * @param features -
	 * @param Extensions -
	 * @return -
	 */
	public static VkDevice createDevice(VkPhysicalDevice device, int[] queueFamilyIndex, String features, String...Extensions) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			
			VkDeviceQueueCreateInfo.Buffer buff = new VkDeviceQueueCreateInfo.Buffer(stack.calloc(40*queueFamilyIndex.length));
			for(int i = 0; i < queueFamilyIndex.length; i++){
				VkDeviceQueueCreateInfo info_queue = new VkDeviceQueueCreateInfo(stack.calloc(40*queueFamilyIndex.length));
				info_queue.sType(VK13.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
				info_queue.queueFamilyIndex(queueFamilyIndex[i]);
				info_queue.pQueuePriorities(stack.floats(1));
				buff.put(i, info_queue);
			}
			
			//Device Features
			VkPhysicalDeviceFeatures deviceFeatures = new VkPhysicalDeviceFeatures(stack.calloc(220));
			
			deviceFeatures.set(
					features.contains("robustBufferAccess"), features.contains("fullDrawIndexUint32"), features.contains("imageCubeArray"), features.contains("independentBlend"), features.contains("geometryShader"), features.contains("tessellationShader"), features.contains("sampleRateShading"), features.contains("dualSrcBlend"),
					features.contains("logicOp"), features.contains("multiDrawIndirect"), features.contains("drawIndirectFirstInstance"), features.contains("depthClamp"), features.contains("depthBiasClamp"), features.contains("fillModeNonSolid"), features.contains("depthBounds"), features.contains("wideLines"),
					features.contains("largePoints"), features.contains("alphaToOne"), features.contains("multiViewport"), features.contains("samplerAnisotropy"), features.contains("textureCompressionETC2"), features.contains("textureCompressionASTC_LDR"), features.contains("textureCompressionBC"), features.contains("occlusionQueryPrecise"),
					features.contains("pipelineStatisticsQuery"), features.contains("vertexPipelineStoresAndAtomics"), features.contains("fragmentStoresAndAtomics"), features.contains("shaderTessellationAndGeometryPointSize"), features.contains("shaderImageGatherExtended"), features.contains("shaderStorageImageExtendedFormats"), features.contains("shaderStorageImageMultisample"), features.contains("shaderStorageImageReadWithoutFormat"),
					features.contains("shaderStorageImageWriteWithoutFormat"), features.contains("shaderUniformBufferArrayDynamicIndexing"), features.contains("shaderSampledImageArrayDynamicIndexing"), features.contains("shaderStorageBufferArrayDynamicIndexing"), features.contains("shaderStorageImageArrayDynamicIndexing"), features.contains("shaderClipDistance"), features.contains("shaderCullDistance"), features.contains("shaderFloat64"),
					features.contains("shaderInt64"), features.contains("shaderInt16"), features.contains("shaderResourceResidency"), features.contains("shaderResourceMinLod"), features.contains("sparseBinding"), features.contains("sparseResidencyBuffer"), features.contains("sparseResidencyImage2D"), features.contains("sparseResidencyImage3D"),
					features.contains("sparseResidency2Samples"), features.contains("sparseResidency4Samples"), features.contains("sparseResidency8Samples"), features.contains("sparseResidency16Samples"), features.contains("sparseResidencyAliased"), features.contains("variableMultisampleRate"), features.contains("inheritedQueries"));
			
			VkDeviceCreateInfo device_info = new VkDeviceCreateInfo(stack.calloc(72));
			device_info.sType(VK13.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
			device_info.pQueueCreateInfos(buff);
			device_info.pEnabledFeatures(deviceFeatures);
			ByteBuffer[] extensionNames = new ByteBuffer[Extensions.length];
			for(int i = 0; i < Extensions.length; i++) {
				extensionNames[i] = stack.ASCII(Extensions[i]);
			}
			device_info.ppEnabledExtensionNames(stack.pointers(extensionNames));
			
			PointerBuffer devicePointerBuffer = stack.pointers(1); //Result gets stored here
			check("Failed to create Device!", VK13.vkCreateDevice(device, device_info, null, devicePointerBuffer));
			VkDevice d = new VkDevice(devicePointerBuffer.get(0), device, device_info);
			return d;
		}
	}
	
	/**
	 * Creates a fence
	 * @param device -
	 * @param signaled -
	 * @return -
	 */
	public static long createFence(VkDevice device, boolean signaled) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkFenceCreateInfo   info_fence = new VkFenceCreateInfo (stack.calloc(24));
			info_fence.sType(VK13.VK_STRUCTURE_TYPE_FENCE_CREATE_INFO);
			if(signaled)
				info_fence.flags(VK13.VK_FENCE_CREATE_SIGNALED_BIT);
			check("Failed to create Fence!", VK13.vkCreateFence(device, info_fence, null, arrl));
			long fence = arrl[0];
			return fence;
		}
	}
	/**
	 * Creates a Framebuffer
	 * @param renderpass -
	 * @param width -
	 * @param height -
	 * @param device -
	 * @param imageViews -
	 * @return -
	 */
	public static Framebuffer createFrameBuffer(long renderpass, int width, int height, VkDevice device, long...imageViews) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkFramebufferCreateInfo info_framebuffer = new VkFramebufferCreateInfo(stack.calloc(64));
			info_framebuffer.sType(VK13.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO);
			info_framebuffer.renderPass(renderpass);
			info_framebuffer.attachmentCount(imageViews.length);
			info_framebuffer.pAttachments(stack.longs(imageViews));
			info_framebuffer.width(width);
			info_framebuffer.height(height);
			info_framebuffer.layers(1);
			check("Failed to create FrameBuffer!", VK13.vkCreateFramebuffer(device, info_framebuffer, null, arrl));
			return new Framebuffer(device, arrl[0], renderpass);
		}
	}
	
	/**
	 * Sets the {@link DescriptorSet}s to the data. Each {@link DescriptorSet} gets a {@link DescriptorData} array.
	 * @param device the device
	 * @param sets the sets to set
	 * @param descriptorss the array of descriptor arrays
	 */
	public static void setDescriptorSets(VirtualDevice device, DescriptorSet[] sets, DescriptorData[][] descriptorss) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			int amount = 0;
			for(int i = 0; i < descriptorss.length; i++) {
				for(int l = 0; l < descriptorss[i].length; l++) {
					if(descriptorss[i][l] != null)
						amount++;
				}
			}
			int pointer = 0;
			VkWriteDescriptorSet.Buffer set_buffer = new VkWriteDescriptorSet.Buffer(stack.calloc(64*amount));
			
			for(int set = 0; set < descriptorss.length; set++) {
				DescriptorData[] descriptors = descriptorss[set];
				if(descriptors == null)
					continue;
				for(int binding = 0; binding < descriptors.length; binding++) { //For every binding in every set
					DescriptorData descriptor = descriptors[binding];
					if(descriptor == null)
						continue;
					//-------------------
					VkWriteDescriptorSet write = new VkWriteDescriptorSet(stack.calloc(64));
					VkDescriptorBufferInfo.Buffer buffer_buffer = new VkDescriptorBufferInfo.Buffer(stack.calloc(24*1));
					VkDescriptorImageInfo.Buffer image_buffer = new VkDescriptorImageInfo.Buffer(stack.calloc(24*1));
					
					if(descriptor instanceof ddBuffer) {
						VkDescriptorBufferInfo info = new VkDescriptorBufferInfo(stack.calloc(24));
						info.buffer(((ddBuffer) descriptor).getBuffer().address());
						info.offset(((ddBuffer) descriptor).getOffset());
						info.range(((ddBuffer) descriptor).getRange());
						buffer_buffer.put(0, info);
					}
					if(descriptor instanceof ddImage) {
						var t = ((ddImage) descriptor);
						VkDescriptorImageInfo info = new VkDescriptorImageInfo(stack.calloc(24));
						info.sampler(t.getSampler().getAddress());
						info.imageView(t.getImageView());
						info.imageLayout((int) t.getImageLayout());
						image_buffer.put(0, info);
					}
					write.sType(VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
					write.dstSet(sets[set].set);
					write.dstBinding(binding);
					write.dstArrayElement(0);
					write.descriptorType(descriptor.type);
					write.descriptorCount(1);
					write.pBufferInfo(buffer_buffer);
					write.pImageInfo(image_buffer);
					write.pTexelBufferView(null);
					set_buffer.put(pointer, write);
					pointer++;
					//-------------------
				}
			}
			VK13.vkUpdateDescriptorSets(device.device(), set_buffer, null);
		}
	}
	
	/**
	 * Creates a new Graphics Pipeline
	 * @param stages the stages
	 * @param device the device
	 * @param dlayouts the layouts
	 * @param info the {@link GraphicsPipelineInfo}
	 * @param renderpass the Renderpass
	 * @param subpass the subpass
	 * @return the created {@link GraphicsPipeline}
	 */
	public static GraphicsPipeline createGraphicsPipeline(ShaderStage[] stages, VirtualDevice device, DescriptorSetLayout[] dlayouts, PushConstant[] constants, GraphicsPipelineInfo info, RenderPass renderpass, int subpass) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkVertexInputBindingDescription[] descriptions = new VkVertexInputBindingDescription[info.vertexDescriptors.length];
			for(int i = 0; i < info.vertexDescriptors.length; i++)
				descriptions[i] = VulkanTools.getVertexDescr(stack, info.vertexDescriptors[i].binding(), info.vertexDescriptors[i].elementSizeBytes(), info.vertexDescriptors[i].instanced());
			VkVertexInputAttributeDescription[] attributes = new VkVertexInputAttributeDescription[info.attribDescriptors.length];
			for(int i = 0; i < info.attribDescriptors.length; i++)
				attributes[i] = VulkanTools.getVertexAttrDescr(stack, info.attribDescriptors[i].binding(), info.attribDescriptors[i].attrib(), info.attribDescriptors[i].type(), info.attribDescriptors[i].offsetBytes()); //0, 0, VK13.VK_FORMAT_R32G32B32_SFLOAT, 0
			PipelineLayout pipelineLayout = VulkanTools.createPipeLineLayout(device, dlayouts, constants);
			
			VkPipelineShaderStageCreateInfo.Buffer stagess = new VkPipelineShaderStageCreateInfo.Buffer(stack.calloc(VkPipelineShaderStageCreateInfo.SIZEOF*stages.length));
			for(int i = 0; i < stages.length; i++) {
				VkPipelineShaderStageCreateInfo info_stage = new VkPipelineShaderStageCreateInfo(stack.calloc(48));
				info_stage.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO);
				info_stage.stage(stages[i].bits); //VK13.VK_SHADER_STAGE_VERTEX_BIT
				info_stage.module(stages[i].module.address);
				info_stage.pName(stack.ASCII(stages[i].entrypoint));
				stagess.put(i, info_stage);
			}
			
			VkPipelineDynamicStateCreateInfo info_dynamicpipe = new VkPipelineDynamicStateCreateInfo(stack.calloc(32));
			info_dynamicpipe.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);
			info_dynamicpipe.pDynamicStates(stack.ints(info.dynamicStates));
						
			VkPipelineVertexInputStateCreateInfo vertexInputInfo = new VkPipelineVertexInputStateCreateInfo(stack.calloc(48));
			vertexInputInfo.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
			
			VkVertexInputBindingDescription.Buffer descriptions_buffer = new VkVertexInputBindingDescription.Buffer(stack.calloc(12*descriptions.length));
			for(int i = 0; i < descriptions.length; i++)
				descriptions_buffer.put(i, descriptions[i]);
			vertexInputInfo.pVertexBindingDescriptions(descriptions_buffer);
			
			VkVertexInputAttributeDescription.Buffer attribute_buffer = new VkVertexInputAttributeDescription.Buffer(stack.calloc(16*attributes.length));
			for(int i = 0; i < attributes.length; i++)
				attribute_buffer.put(i, attributes[i]);
			vertexInputInfo.pVertexAttributeDescriptions(attribute_buffer);
			
			VkPipelineInputAssemblyStateCreateInfo inputAssembly = new VkPipelineInputAssemblyStateCreateInfo(stack.calloc(32));
			inputAssembly.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO);
			inputAssembly.topology(info.inputAssembly_topology);
			inputAssembly.primitiveRestartEnable(info.inputAssembly_primitiveRestartEnabled);
			
			
			VkViewport.Buffer buff_viewport = new VkViewport.Buffer(stack.calloc(VkViewport.SIZEOF*info.viewports.length));
			for(int i = 0; i < info.viewports.length; i++) {
				VkViewport viewport = new VkViewport(stack.calloc(VkViewport.SIZEOF));
				viewport.x(info.viewports[i].x());
				viewport.y(info.viewports[i].y());
				viewport.width(info.viewports[i].width());
				viewport.height(info.viewports[i].height());
				viewport.minDepth(info.viewports[i].minDepth());
				viewport.maxDepth(info.viewports[i].maxDepth());
				buff_viewport.put(i, viewport);
			}
			VkRect2D.Buffer buff_scissor = new VkRect2D.Buffer(stack.calloc(VkRect2D.SIZEOF*info.scissors.length));
			for(int i = 0; i < info.scissors.length; i++) {
				VkRect2D scissor = new VkRect2D(stack.calloc(VkRect2D.SIZEOF));
				VkOffset2D offset = new VkOffset2D(stack.calloc(8));
				VkExtent2D extent = new VkExtent2D(stack.calloc(8));
				extent.set(info.scissors[i].width(), info.scissors[i].height());
				offset.set(info.scissors[i].x(), info.scissors[i].y());
				scissor.offset(offset);
				scissor.extent(extent);
				buff_scissor.put(i, scissor);
			}
			
			VkPipelineViewportStateCreateInfo info_viewport = new VkPipelineViewportStateCreateInfo(stack.calloc(48));
			info_viewport.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO);
			info_viewport.viewportCount(info.viewports.length);
			info_viewport.scissorCount(info.scissors.length);
			info_viewport.pViewports(buff_viewport);
			info_viewport.pScissors(buff_scissor);
			
			VkPipelineRasterizationStateCreateInfo rasterizer = new VkPipelineRasterizationStateCreateInfo(stack.calloc(64));
			rasterizer.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO);
			rasterizer.depthClampEnable(info.rasterization_depthClampEnable);
			rasterizer.rasterizerDiscardEnable(info.rasterization_rasterizerDiscardEnable);
			rasterizer.polygonMode(info.rasterization_polygonMode);
			rasterizer.lineWidth(info.rasterization_lineWidth);
			rasterizer.cullMode(info.rasterization_cullMode);
			rasterizer.frontFace(info.rasterization_frontFace);
			rasterizer.depthBiasEnable(info.rasterization_depthBiasEnable);
			rasterizer.depthBiasClamp(info.rasterization_depthBiasClamp);
			
			//TODO figure out how blending works
			VkPipelineColorBlendAttachmentState colorBlendAttachment = new VkPipelineColorBlendAttachmentState(stack.calloc(32));
			colorBlendAttachment.colorWriteMask(VK13.VK_COLOR_COMPONENT_R_BIT | VK13.VK_COLOR_COMPONENT_G_BIT | VK13.VK_COLOR_COMPONENT_B_BIT | VK13.VK_COLOR_COMPONENT_A_BIT);
			colorBlendAttachment.blendEnable(true);
			colorBlendAttachment.srcColorBlendFactor(VK13.VK_BLEND_FACTOR_SRC_ALPHA);
			colorBlendAttachment.dstColorBlendFactor(VK13.VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA);
			colorBlendAttachment.colorBlendOp(VK13.VK_BLEND_OP_ADD);
			colorBlendAttachment.srcAlphaBlendFactor(VK13.VK_BLEND_FACTOR_ONE);
			colorBlendAttachment.dstAlphaBlendFactor(VK13.VK_BLEND_FACTOR_ZERO);
			colorBlendAttachment.alphaBlendOp(VK13.VK_BLEND_OP_ADD);
			
			VkPipelineColorBlendAttachmentState.Buffer colorBlendAttachment_buffer = new VkPipelineColorBlendAttachmentState.Buffer(stack.calloc(32*1));
			colorBlendAttachment_buffer.put(0, colorBlendAttachment);
			
			VkPipelineColorBlendStateCreateInfo blendInfo = new VkPipelineColorBlendStateCreateInfo(stack.calloc(56));
			blendInfo.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
			blendInfo.logicOpEnable(false);
			blendInfo.logicOp(VK13.VK_LOGIC_OP_COPY);
			blendInfo.attachmentCount(1);
			blendInfo.pAttachments(colorBlendAttachment_buffer);
			blendInfo.blendConstants(0, 0f);
			blendInfo.blendConstants(1, 0f);
			blendInfo.blendConstants(2, 0f);
			blendInfo.blendConstants(3, 0f);
			//TODO end__________________________
			
			VkPipelineMultisampleStateCreateInfo info_multisample = new VkPipelineMultisampleStateCreateInfo(stack.calloc(48));
			info_multisample.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
			info_multisample.sampleShadingEnable(info.multisample_sampleShadingEnable);
			info_multisample.rasterizationSamples(info.multisample_rasterizationSamples);
			info_multisample.minSampleShading(info.multisample_minSampleShading);
			info_multisample.pSampleMask(info.pSampleMask);
			info_multisample.alphaToCoverageEnable(info.multisample_alphaToCoverageEnable);
			info_multisample.alphaToOneEnable(info.multisample_alphaToCoverageEnable);
			
			VkPipelineDepthStencilStateCreateInfo depthStencilState = new VkPipelineDepthStencilStateCreateInfo(stack.calloc(104));
			depthStencilState.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);
			depthStencilState.depthTestEnable(info.depthStencil_depthTestEnable);
			depthStencilState.depthWriteEnable(info.depthStencil_depthWriteEnable);
			depthStencilState.depthCompareOp(info.depthStencil_depthCompareOp);
			depthStencilState.depthBoundsTestEnable(info.depthStencil_depthBoundsTestEnable);
			depthStencilState.minDepthBounds(info.depthStencil_minDepthBounds);
			depthStencilState.maxDepthBounds(info.depthStencil_maxDepthBounds);
			depthStencilState.stencilTestEnable(info.depthStencil_stencilTestEnable);
			
			VkGraphicsPipelineCreateInfo gpc_info = new VkGraphicsPipelineCreateInfo(stack.calloc(144));
			gpc_info.sType(VK13.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO);
			gpc_info.stageCount(2); //Vertex and Fragment
			gpc_info.pStages(stagess);
			gpc_info.pVertexInputState(vertexInputInfo);
			gpc_info.pInputAssemblyState(inputAssembly);
			gpc_info.pViewportState(info_viewport);
			gpc_info.pRasterizationState(rasterizer);
			gpc_info.pMultisampleState(info_multisample); 
			gpc_info.pDepthStencilState(depthStencilState); //No usage of depth/stencil
			gpc_info.pColorBlendState(blendInfo);
			gpc_info.pDynamicState(info_dynamicpipe);
			
			gpc_info.layout(pipelineLayout.address);
			gpc_info.renderPass(renderpass.getAddress());
			gpc_info.subpass(subpass);
			
			gpc_info.basePipelineHandle(VK13.VK_NULL_HANDLE);
			gpc_info.basePipelineIndex(-1);
			
			VkGraphicsPipelineCreateInfo.Buffer info_buffer = new VkGraphicsPipelineCreateInfo.Buffer(stack.calloc(144*1));
			info_buffer.put(0, gpc_info);
			check("Failed to create Graphics Pipeline!", VK13.vkCreateGraphicsPipelines(device.device(), 0, info_buffer, null, arrl));
			var res = new GraphicsPipeline();
			res.address = arrl[0];
			res.device = device;
			res.layout = pipelineLayout;
			res.layouts = dlayouts;
			return res;
		}
		
		
	}
	
	
	
	
	
	/**
	 * Creates a new Image
	 * @param allocator -
	 * @param width -
	 * @param height -
	 * @param depth 1 for 2D images
	 * @param mipLevels -
	 * @param arrayLayers -
	 * @param imageFormat -
	 * @param tiling - eg. VK13.VK_IMAGE_TILING_OPTIMAL
	 * @param initialLayout - eg. VK13.VK_IMAGE_LAYOUT_UNDEFINED
	 * @param imageUsage -
	 * @param sharingMode - normally VK13.VK_SHARING_MODE_EXCLUSIVE
	 * @param flags - default 0
	 * @param samples - eg. VK13.VK_SAMPLE_COUNT_1_BIT
	 * @param memorySuitableFlags -
	 * @param memoryPreferredFlags -
	 * 
	 * @return -
	 */
	public static Image createImage(Allocator allocator, int width, int height, int depth, int mipLevels, int arrayLayers, int imageFormat, int tiling, int initialLayout, int imageUsage, int sharingMode, int flags, int samples, int memorySuitableFlags, int memoryPreferredFlags) {
		long[] arrl = new long[1];
		VkDevice device = allocator.getDevice();
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkImageCreateInfo info = new VkImageCreateInfo(stack.calloc(88));
			info.sType(VK13.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
			info.imageType(VK13.VK_IMAGE_TYPE_2D);
			info.extent().width(width); 
			info.extent().height(height);
			info.extent().depth(depth); //1
			info.mipLevels(mipLevels); //1
			info.arrayLayers(arrayLayers); //1
			info.format(imageFormat);
			info.tiling(tiling); //VK13.VK_IMAGE_TILING_OPTIMAL
			info.initialLayout(initialLayout); //VK13.VK_IMAGE_LAYOUT_UNDEFINED
			info.usage(imageUsage);
			info.sharingMode(sharingMode); //VK13.VK_SHARING_MODE_EXCLUSIVE
			info.flags(flags);
			info.samples(samples); //VK13.VK_SAMPLE_COUNT_1_BIT
			check("Failed to create Image!", VK13.vkCreateImage(device, info, null, arrl));
			long image = arrl[0];
			VkMemoryRequirements requirements = new VkMemoryRequirements(stack.calloc(24));
			VK13.vkGetImageMemoryRequirements(device, image, requirements);
			Allocator.Memory memory = allocator.allocateMemory(new Allocator_Vma_Impl.MemoryAllocationInfoImpl(requirements, 0, memorySuitableFlags, memoryPreferredFlags));
			VK13.vkBindImageMemory(device, image, memory.getMemoryAddress(), memory.getMemoryOffset());
			return new Image(image, allocator, memory, device);
		}
	}
	/**
	 * Creates a new Image Sampler
	 * @param device -
	 * @param magfLin -
	 * @param minfLin -
	 * @param addressModeU -
	 * @param addressModeV -
	 * @param addressModeW -
	 * @param anistrophy -
	 * @return -
	 */ 
	public static long createImageSampler(VkDevice device, boolean magfLin, boolean minfLin, int addressModeU, int addressModeV, int addressModeW, float anistrophy) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkSamplerCreateInfo info = new VkSamplerCreateInfo(stack.calloc(80));
			info.sType(VK13.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO);
			info.magFilter(magfLin ? VK13.VK_FILTER_LINEAR : VK13.VK_FILTER_NEAREST);
			info.minFilter(minfLin ? VK13.VK_FILTER_LINEAR : VK13.VK_FILTER_NEAREST);
			info.addressModeU(addressModeU);
			info.addressModeV(addressModeV);
			info.addressModeW(addressModeW);
			info.anisotropyEnable(anistrophy != 0);
			info.maxAnisotropy(anistrophy);
			info.borderColor(VK13.VK_BORDER_COLOR_INT_OPAQUE_BLACK);
			info.unnormalizedCoordinates(false);
			info.compareEnable(false);
			info.compareOp(VK13.VK_COMPARE_OP_ALWAYS);
			info.mipmapMode(VK13.VK_SAMPLER_MIPMAP_MODE_LINEAR);
			info.mipLodBias(0f);
			info.minLod(0f);
			info.maxLod(0f);
			VK13.vkCreateSampler(device, info, null, arrl);
			return arrl[0];
		}
	}
	/**
	 * Creates a new Image view
	 * @param image -
	 * @param format -
	 * @param viewType -
	 * @param imageAspectBit -
	 * @return -
	 */
	public static long createImageView(Image image, int format, int viewType, int imageAspectBit) {
		long[] arrl = new long[1];
		VkDevice device = image.device();
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkImageViewCreateInfo info_imageview = new VkImageViewCreateInfo(stack.calloc(80));
			info_imageview.sType(VK13.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
			info_imageview.image(image.getAddress());
			info_imageview.format(format);
			info_imageview.viewType(viewType);
			info_imageview.components().r(VK13.VK_COMPONENT_SWIZZLE_IDENTITY);
			info_imageview.components().g(VK13.VK_COMPONENT_SWIZZLE_IDENTITY);
			info_imageview.components().b(VK13.VK_COMPONENT_SWIZZLE_IDENTITY);
			info_imageview.components().a(VK13.VK_COMPONENT_SWIZZLE_IDENTITY);
			info_imageview.subresourceRange().aspectMask(imageAspectBit);
			info_imageview.subresourceRange().baseMipLevel(0);
			info_imageview.subresourceRange().levelCount(1);
			info_imageview.subresourceRange().baseArrayLayer(0);
			info_imageview.subresourceRange().layerCount(1);
			
			check("Failed to create Image View!", VK13.vkCreateImageView(device, info_imageview, null, arrl));
			return arrl[0];
			
		}
	}
	/**
	 * Creates a new Pipeline Layout
	 * @param device -
	 * @param descriptorsetlayout -
	 * @return -
	 */
	public static PipelineLayout createPipeLineLayout(VirtualDevice device, DescriptorSetLayout[] descriptorsetlayout, PushConstant[] constants) {
		long[] arrl = new long[1];
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VkPipelineLayoutCreateInfo info_uniforms = new VkPipelineLayoutCreateInfo(stack.calloc(48));
			info_uniforms.sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
			info_uniforms.setLayoutCount(1);
			long[] dsls = new long[descriptorsetlayout.length];
			for(int i = 0; i < dsls.length; i++)
				dsls[i] = descriptorsetlayout[i].address;
			info_uniforms.pSetLayouts(stack.longs(dsls));
			VkPushConstantRange.Buffer buff = null;
			if (constants != null){
				buff = new VkPushConstantRange.Buffer(stack.calloc(VkPushConstantRange.SIZEOF*constants.length));
				for(int i = 0; i < constants.length; i++) {
					VkPushConstantRange r = new VkPushConstantRange(stack.calloc(VkPushConstantRange.SIZEOF));
					r.set(constants[i].stageFlags(), constants[i].offset(), constants[i].size());
					buff.put(i, r);
				}
			}
			info_uniforms.pPushConstantRanges(buff);
			check("Failed to create Pipeline Layout!", VK13.vkCreatePipelineLayout(device.device(), info_uniforms, null, arrl));
			PipelineLayout res = new PipelineLayout(arrl[0], device);
			return res;
		}
	}
	/**
	 * Creates a new Renderpass
	 * @param device -
	 * @param attachments -
	 * @param subpasses -
	 * @return -
	 */
	public static RenderPass createRenderPass(VkDevice device, RenderPass.renderAttachment[] attachments, RenderPass.subpass[] subpasses) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkAttachmentDescription.Buffer description_buffer = new VkAttachmentDescription.Buffer(stack.calloc(36*attachments.length));
			
			for(int i = 0; i < attachments.length; i++){
				VkAttachmentDescription description = new VkAttachmentDescription(stack.calloc(36));
				description.format(attachments[i].format);
				description.samples(attachments[i].samples);
				description.loadOp(attachments[i].loadOp);
				description.storeOp(attachments[i].storeOp);
				description.stencilLoadOp(attachments[i].stencilLoadOp);
				description.stencilStoreOp(attachments[i].storeOp);
				description.initialLayout(attachments[i].initialLayout);
				description.finalLayout(attachments[i].finalLayout);
				description_buffer.put(i, description);
			}
			
			
			VkSubpassDescription.Buffer subpass_buffer = new VkSubpassDescription.Buffer(stack.calloc(72*subpasses.length));
			for (int i = 0; i < subpasses.length; i++){
				VkAttachmentReference.Buffer reference_buffer = new VkAttachmentReference.Buffer(stack.calloc(8*subpasses[i].references.length));
				
				for(int l = 0; l < subpasses[i].references.length; l++) {
					VkAttachmentReference reference = new VkAttachmentReference(stack.calloc(8));
					reference.attachment(subpasses[i].references[l].attachment());
					reference.layout(subpasses[i].references[l].layout());
					reference_buffer.put(l, reference);
				}
				VkAttachmentReference depthStc = null;
				if(subpasses[i].depthStencil != null){
					depthStc = new VkAttachmentReference(stack.calloc(8));
					depthStc.attachment(subpasses[i].depthStencil.attachment());
					depthStc.layout(subpasses[i].depthStencil.layout());
				}
				VkSubpassDescription subpass = new VkSubpassDescription(stack.calloc(72));
				subpass.pipelineBindPoint(subpasses[i].bindingPoint);
				subpass.colorAttachmentCount(subpasses[i].references.length);
				subpass.pColorAttachments(reference_buffer);
				subpass.pDepthStencilAttachment(depthStc);
				subpass_buffer.put(i, subpass);
			}
			
			VkSubpassDependency.Buffer buffer = new VkSubpassDependency.Buffer(stack.calloc(28*1));
			{
				VkSubpassDependency subpass_dependency = new VkSubpassDependency(stack.calloc(28));
				subpass_dependency.srcSubpass(VK13.VK_SUBPASS_EXTERNAL);
				subpass_dependency.dstSubpass(0);
				subpass_dependency.srcStageMask(VK13.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
				subpass_dependency.srcAccessMask(0);
				subpass_dependency.dstStageMask(VK13.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
				subpass_dependency.dstAccessMask(VK13.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT);
				buffer.put(0, subpass_dependency);
			}
			//---
			
			
			VkRenderPassCreateInfo info_renderpass = new VkRenderPassCreateInfo(stack.calloc(64));
			info_renderpass.sType(VK13.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO);
			info_renderpass.pAttachments(description_buffer);
			info_renderpass.pSubpasses(subpass_buffer);
			info_renderpass.pDependencies(buffer);
			
			check("Failed to create RenderPass!", VK13.vkCreateRenderPass(device, info_renderpass, null, arrl));
			long renderpass = arrl[0];
			return new RenderPass(renderpass, device);
		}
	}
	/**
	 * Creates a new Semaphore
	 * @param device -
	 * @return -
	 */
	public static long createSemaphore(VkDevice device) {
		long[] arrl = new long[1];
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VkSemaphoreCreateInfo  info_semaphore = new VkSemaphoreCreateInfo(stack.calloc(24));
			info_semaphore.sType(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);
			check("Failed to create Semaphore", VK13.vkCreateSemaphore(device, info_semaphore, null, arrl));
			long semaphore = arrl[0];
			return semaphore;
		}
	}
	/**
	 * Waits until a semaphore has a specific value.
	 * @param device -
	 * @param semaphore -
	 */
	public static void waitSemaphore(VkDevice device, long semaphore, long value) {
		try(MemoryStack stack = MemoryStack.stackPush()) { 
			VkSemaphoreWaitInfo info = new VkSemaphoreWaitInfo(stack.calloc(VkSemaphoreWaitInfo.SIZEOF));
			info.set(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO, 0, 0, 1, stack.longs(semaphore), stack.longs(value));
			VK13.vkWaitSemaphores(device, info, Long.MAX_VALUE);
		}
	}
	/**
	 * Creates a new {@link ShaderModule}
	 * @param device -
	 * @param data -
	 * @return -
	 */
	public static ShaderModule createShaderModule(VirtualDevice device, byte[] data) {
		long[] arrl = new long[1];
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VkShaderModuleCreateInfo info_shadm = new VkShaderModuleCreateInfo(stack.calloc(40));
			info_shadm.sType(VK13.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO);
			info_shadm.pCode(stack.bytes(data));
			check("Failed to create Shader Module!", VK13.vkCreateShaderModule(device.device(), info_shadm, null, arrl));
			ShaderModule res = new ShaderModule();
			res.address = arrl[0];
			res.device = device;
			return res;
		}
	}
	/**
	 * Creates a new swapchain
	 * @param surface -
	 * @param device -
	 * @param windowSurface -
	 * @param colorFormat -
	 * @param extendWidth -
	 * @param extendHeight -
	 * @param compositeAlpha -
	 * @param familyIndices -
	 * @return -
	 */
	public static long createSwapChain(long surface, VkDevice device, long windowSurface, int colorFormat, int extendWidth, int extendHeight, int compositeAlpha, int...familyIndices) {
		long[] arrl = new long[1];
		try (MemoryStack stack = MemoryStack.stackPush()) {
			
			VkSwapchainCreateInfoKHR info_swapchain = new VkSwapchainCreateInfoKHR(stack.calloc(104));
			info_swapchain.sType(KHRSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR);
			info_swapchain.surface(surface);
			
			info_swapchain.minImageCount(2);
			info_swapchain.imageFormat(colorFormat);
			info_swapchain.imageColorSpace(KHRSurface.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR);
			VkExtent2D ext = new VkExtent2D(stack.calloc(8));
			ext.set(extendWidth, extendHeight);
			info_swapchain.imageExtent(ext);
			info_swapchain.imageArrayLayers(1);
			info_swapchain.imageUsage(VK13.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT);
			info_swapchain.preTransform(KHRSurface.VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR);
			info_swapchain.compositeAlpha(compositeAlpha);
			info_swapchain.presentMode(KHRSurface.VK_PRESENT_MODE_FIFO_RELAXED_KHR);
			info_swapchain.clipped(true);
			info_swapchain.imageSharingMode(familyIndices.length == 1 ? VK13.VK_SHARING_MODE_EXCLUSIVE : VK13.VK_SHARING_MODE_CONCURRENT);
			info_swapchain.pQueueFamilyIndices(stack.ints(familyIndices));
			info_swapchain.oldSwapchain(VK13.VK_NULL_HANDLE);
			check("Failed to create Swapchain!", KHRSwapchain.vkCreateSwapchainKHR(device, info_swapchain, null, arrl));
			return arrl[0];
		}
	}
	/**
	 * Creates a Vulkan instance
	 * @param appName -
	 * @param avma -
	 * @param avmi -
	 * @param avp -
	 * @param engineName -
	 * @param evma -
	 * @param evmi -
	 * @param evp -
	 * @param extensions -
	 * @param includeGLFWExtensions -
	 * @param apiVersion -
	 * @return -
	 */
	@SuppressWarnings("resource")
	public static VulkanInstance createVulkanInstance(String appName, int avma, int avmi, int avp, String engineName, int evma, int evmi, int evp, String[] extensions, boolean includeGLFWExtensions, int apiVersion) {
		int[] arr = new int[1];
		VkInstance instance;
		VulkanInstance vulkanInstance = new VulkanInstance();
		try(MemoryStack stack = MemoryStack.stackPush()){
			VkApplicationInfo app_info = new VkApplicationInfo(stack.calloc(48));
			app_info.sType(VK13.VK_STRUCTURE_TYPE_APPLICATION_INFO);
			app_info.pApplicationName(stack.ASCII(appName));
			app_info.applicationVersion(VK13.VK_MAKE_VERSION(avma, avmi, avp));
			app_info.pEngineName(stack.ASCII(engineName));
			app_info.engineVersion(VK13.VK_MAKE_VERSION(evma, evmi, evp));
			app_info.apiVersion(apiVersion);
			
			VkInstanceCreateInfo instance_info = new VkInstanceCreateInfo(stack.calloc(64));
			instance_info.sType(VK13.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
			instance_info.pApplicationInfo(app_info);
			int pb_size = 0;
			PointerBuffer exts = null;
			if(includeGLFWExtensions) {
				PointerBuffer pb = GLFWVulkan.glfwGetRequiredInstanceExtensions(); //Instance extensions
				if(pb == null) {
					exts = stack.callocPointer(1);
					GLFW.glfwGetError(exts);
					throw new IllegalStateException("Failed to get required Instance Extensions for GLFW! " + exts.getStringASCII());
				}
				else
					pb_size = pb.capacity();
				exts = stack.callocPointer(pb_size+extensions.length);
				for(int i = 0; i < pb_size; i++)
					exts.put(i, pb.get(i));
			} else {
				exts = stack.callocPointer(extensions.length);
			}
			for(int i = pb_size; i < pb_size+extensions.length; i++)
				exts.put(i, stack.ASCII(extensions[i-pb_size]));
			instance_info.ppEnabledExtensionNames(exts);
			
			PointerBuffer b = stack.callocPointer(1);
			VK13.vkEnumerateInstanceLayerProperties(arr, null);
			int amountValidationLayers = arr[0];
//			DebugPrinter.out("ValidationlayerCount: " + amountValidationLayers);
			VkLayerProperties.Buffer buffer = new VkLayerProperties.Buffer(stack.calloc(VkLayerProperties.SIZEOF*amountValidationLayers));
			VK13.vkEnumerateInstanceLayerProperties(arr, buffer);
			
			VkLayerProperties[] validationLayerNames = new VkLayerProperties[amountValidationLayers];
			long[] validationLayerNamesPointers = new long[amountValidationLayers];
			vulkanInstance.ValidationLayers = new ValidationLayer[amountValidationLayers];
			for(int i = 0; i < amountValidationLayers; i++) {
				validationLayerNames[i] = buffer.get(i);
				validationLayerNamesPointers[i] = validationLayerNames[i].address();
				//DebugPrinter.out("Validation Layer " + i + " = '" + validationLayerNames[i].layerNameString() + "'");
				vulkanInstance.ValidationLayers[i] = new ValidationLayer(validationLayerNames[i].layerNameString(), validationLayerNames[i].descriptionString(), validationLayerNames[i].implementationVersion(), validationLayerNames[i].specVersion());
			}
			PointerBuffer validationLyaerNamesPointersPointerBuffer = stack.pointers(requestValidationLayersByName(validationLayerNames, "VK_LAYER_LUNARG_monitor", "VK_LAYER_KHRONOS_validation", "VK_LAYER_KHRONOS_synchronization2"));
			instance_info.ppEnabledLayerNames(validationLyaerNamesPointersPointerBuffer);
			
			check("Failed to create Vulkan Instance!", VK13.vkCreateInstance(instance_info, null, b));
			instance = new VkInstance(b.get(0), instance_info);
			
			vulkanInstance.instance = instance;
		}
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VK13.vkEnumeratePhysicalDevices(instance, arr, null);
			int amountPhysicalDevices = arr[0];
			PointerBuffer physicalDevicesPointer = stack.callocPointer(amountPhysicalDevices);
			VK13.vkEnumeratePhysicalDevices(instance, arr, physicalDevicesPointer);
			if(amountPhysicalDevices == 0)
				throw new RuntimeException("This Device does not support Vulkan!");
//			DebugPrinter.out("Physical Devices Count: " + amountPhysicalDevices);
			VkPhysicalDevice[] physicalDevices = new VkPhysicalDevice[amountPhysicalDevices];
			vulkanInstance.graphicsDevices = new Device[amountPhysicalDevices];
			for(int i = 0; i < amountPhysicalDevices; i++) {
//				DebugPrinter.out("");
				physicalDevices[i] = new VkPhysicalDevice(physicalDevicesPointer.get(i), instance);
//				DebugPrinter.out("Physical Device " + i + " = " + physicalDevices[i].toString());
				VkPhysicalDeviceProperties p = new VkPhysicalDeviceProperties(MemoryUtil.memCalloc(824));
				VK13.vkGetPhysicalDeviceProperties(physicalDevices[i], p);
//				DebugPrinter.out("-Properties:");
//				DebugPrinter.out("--Device Name: " + p.deviceNameString());
//				DebugPrinter.out("--API Version: " + p.apiVersion() + " ("+VK13.VK_API_VERSION_VARIANT(p.apiVersion())+"."+VK13.VK_API_VERSION_MAJOR(p.apiVersion())+"."+VK13.VK_API_VERSION_MINOR(p.apiVersion())+"."+VK13.VK_API_VERSION_PATCH(p.apiVersion())+")");
//				DebugPrinter.out("--Device Version: " + p.driverVersion() + " ("+VK13.VK_API_VERSION_VARIANT(p.driverVersion())+"."+VK13.VK_API_VERSION_MAJOR(p.driverVersion())+"."+VK13.VK_API_VERSION_MINOR(p.driverVersion())+"."+VK13.VK_API_VERSION_PATCH(p.driverVersion())+")");
//				DebugPrinter.out("--Device ID: " + p.deviceID());
//				DebugPrinter.out("--Device Type: " + p.deviceType());
//				DebugPrinter.out("--Vendor ID: " + p.vendorID());
				VK13.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevices[i], arr, null);
				int amountQueueFamilies = arr[0];
				QueueFamily[] families = new QueueFamily[amountQueueFamilies];
//				DebugPrinter.out("-Queue Families (" + amountQueueFamilies + ")");
				VkQueueFamilyProperties.Buffer bb = new VkQueueFamilyProperties.Buffer(stack.calloc(amountQueueFamilies*VkQueueFamilyProperties.SIZEOF));
				VK13.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevices[i], arr, bb);
				for(int i2 = 0; i2 < amountQueueFamilies; i2++) {
					VkQueueFamilyProperties pr = bb.get(i2);
					int maxCount = pr.queueCount();
					int flags = pr.queueFlags();
					boolean hasVK_QUEUE_GRAPHICS_BIT = BigInteger.valueOf(flags).testBit(0);
					boolean hasVK_QUEUE_COMPUTE_BIT = BigInteger.valueOf(flags).testBit(1);
					boolean hasVK_QUEUE_TRANSFER_BIT = BigInteger.valueOf(flags).testBit(2);
					boolean hasVK_QUEUE_SPARSE_BINDING_BIT = BigInteger.valueOf(flags).testBit(3);
					boolean hasVK_QUEUE_PROTECTED_BIT = BigInteger.valueOf(flags).testBit(4);
//					DebugPrinter.out("--Queue Family " + i + ": GBit: " + hasVK_QUEUE_GRAPHICS_BIT + ", CBit: " + hasVK_QUEUE_COMPUTE_BIT + ", TBit: " + hasVK_QUEUE_TRANSFER_BIT + ", SBBit: " + hasVK_QUEUE_SPARSE_BINDING_BIT);
					families[i2] = new QueueFamily(flags, hasVK_QUEUE_GRAPHICS_BIT, hasVK_QUEUE_COMPUTE_BIT, hasVK_QUEUE_TRANSFER_BIT, hasVK_QUEUE_SPARSE_BINDING_BIT, hasVK_QUEUE_PROTECTED_BIT, maxCount, pr.timestampValidBits());
				}
				VkPhysicalDeviceMemoryProperties memory = new VkPhysicalDeviceMemoryProperties(stack.calloc(520));
				VK13.vkGetPhysicalDeviceMemoryProperties(physicalDevices[i], memory);
				org.lwjgl.vulkan.VkMemoryHeap.Buffer memoryb1 = memory.memoryHeaps();
				
				long[] size_bytes = new long[memory.memoryHeapCount()];
				double[] size_megabytes = new double[memory.memoryHeapCount()];
				int[] type_index = new int[memory.memoryTypeCount()];
				int[] type_flags = new int[memory.memoryTypeCount()];
				int i2 = 0;
				for(VkMemoryHeap mh : memoryb1) {
					size_bytes[i2] = mh.size();
					size_megabytes[i2] = mh.size()/1048576.0;
					i2++;
				}
				org.lwjgl.vulkan.VkMemoryType.Buffer memoryb2 = memory.memoryTypes();
				i2 = 0;
				for(VkMemoryType mh : memoryb2) {
					type_index[i2] = mh.heapIndex();
					type_flags[i2] = mh.propertyFlags();
					i2++;
				}
//				String mem = "";
//				for(double d : size_megabytes)
//					mem += d+"MB/";
//				DebugPrinter.out("-Memory: " + mem.substring(0, mem.length()-1));
				MemoryProperties m = new MemoryProperties(size_bytes, size_megabytes, type_index, type_flags);
				
				VK13.vkEnumerateDeviceExtensionProperties(physicalDevices[i], (String)null, arr, null);
				int amountExtensionProperties = arr[0];
				ByteBuffer disposeBuffer = MemoryUtil.memCalloc(VkExtensionProperties.SIZEOF*amountExtensionProperties);
				VkExtensionProperties.Buffer epb = new VkExtensionProperties.Buffer(disposeBuffer);
				VK13.vkEnumerateDeviceExtensionProperties(physicalDevices[i], (String)null, arr, epb);
//				DebugPrinter.out("Supported Extensions ("+amountExtensionProperties+"):");
				String[] suppoerted_extensions = new String[amountExtensionProperties];
				for(int l = 0; l < amountExtensionProperties; l++) {
					suppoerted_extensions[l] = epb.get(l).extensionNameString();
//					DebugPrinter.out("-"+suppoerted_extensions[l]);;
				}
				epb.free();
				vulkanInstance.graphicsDevices[i] = new Device(p, physicalDevices[i], families, m, suppoerted_extensions);
			}
		}
		vulkanInstance.apiVersion = apiVersion;
		return vulkanInstance;
	}
	/**
	 * End the command Buffer
	 * @param buffer the buffer
	 */
	public static void endRecording(VkCommandBuffer buffer) {
		check("Failed to end Recording of Command Buffer!", VK13.vkEndCommandBuffer(buffer));
	}
	/**
	 * Ends the single use command Buffer and waits until the queue is finished.
	 * @param device the device
	 * @param commandPool the commandPool
	 * @param commandbuffer the commandBuffer
	 * @param queueToSubmit the queue to submit to
	 */
	public static void endSingleUseCommandBufferAndSubmit(VkDevice device, long commandPool, VkCommandBuffer commandbuffer, VkQueue queueToSubmit) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VK13.vkEndCommandBuffer(commandbuffer);
			
			VkSubmitInfo submitInfo = new VkSubmitInfo(stack.calloc(72));
			submitInfo.sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO);
			PointerBuffer pb = stack.callocPointer(1);
			pb.put(0, commandbuffer);
			submitInfo.pCommandBuffers(pb);
			
			VK13.vkQueueSubmit(queueToSubmit, submitInfo, 0);
			
			VK13.vkQueueWaitIdle(queueToSubmit);
			VK13.vkFreeCommandBuffers(device, commandPool, commandbuffer);
		}
	}
//	/** //look into VulkanBufferUtils and Allocator!
//	 * Fills the Buffer with the given Data
//	 * @param buffer the buffer
//	 * @param data the data
//	 * @param srcOff the source offset
//	 * @param dstOff the destination offset
//	 * @param length the length
//	 */
//	public static void fillBuffer(Buffer buffer, ByteBuffer data, int srcOff, int dstOff, int length) {
//		PointerBuffer pb = fillBuffer_getPointerBuffer(buffer.device(), buffer.memory());
//		pb.getByteBuffer(0, (int) buffer.memory().getMemorySize()).put(dstOff, data, srcOff, length);
//		fillBuffer_free(buffer, pb);
//	}
	
//	/**
//	 * Helper function unmapping some memory and freeing the PointerBuffer.
//	 * @param buffer -
//	 * @param pb -
//	 */
//	private static void fillBuffer_free(Buffer buffer, PointerBuffer pb) {
//		VK13.vkUnmapMemory(buffer.device(), buffer.memory().getMemoryAddress());
//		MemoryUtil.memFree(pb);
//	}
//	
//	/**
//	 * Helper function mapping some memory and returning a PointerBuffer containing the address.
//	 * @param device -
//	 * @param memory -
//	 */
//	private static PointerBuffer fillBuffer_getPointerBuffer(VkDevice device, Memory memory) {
//		PointerBuffer pb = MemoryUtil.memAllocPointer(1);
//		VK13.vkMapMemory(device, memory.getMemoryAddress(), memory.getMemoryOffset(), memory.getMemorySize(), 0, pb);
//		return pb;
//	}
//	/** 
//	 * Maps some memory to a {@link ByteBuffer}
//	 * @param device the device
//	 * @param memory the memory
//	 * @param offset the offset
//	 * @param size if negative the whole memory will be mapped
//	 * @return a ByteBuffer viewing the mapped data
//	 */
//	public static ByteBuffer mapMemory(VkDevice device, Memory memory, long offset, long size) {
//		PointerBuffer pb = MemoryUtil.memAllocPointer(1);
//		VK13.vkMapMemory(device, memory.getMemoryAddress(), memory.getMemoryOffset()+offset, size < 0 ? memory.getMemorySize() : size, 0, pb);
//		ByteBuffer bb = pb.getByteBuffer(0, (int) memory.getMemorySize());
//		MemoryUtil.memFree(pb);
//		return bb;
//	}
//	/**
//	 * Unmaps some memory. The ByteBuffer created using {@link #unmapMemory(VkDevice, Memory)} will be invalidated
//	 * @param device -
//	 * @param memory -
//	 */
//	public static void unmapMemory(VkDevice device, Memory memory) {
//		VK13.vkUnmapMemory(device, memory.getMemoryAddress());
//	}
	
//	/**
//	 * Returns a ByteBuffer containing the {@link Buffer}s data. The returned Buffer is created via {@link ByteBuffer#allocateDirect(int)}
//	 * @param buffer the src buffer
//	 * @return the created buffer.
//	 */
//	public static ByteBuffer getBuffer(Buffer buffer) {
//		PointerBuffer pb = fillBuffer_getPointerBuffer(buffer.device(), buffer.memory());
//		ByteBuffer b = pb.getByteBuffer(0, (int) buffer.memory().getMemorySize());
//		MemoryUtil.memFree(pb);
//		ByteBuffer res = ByteBuffer.allocateDirect(b.capacity());
//		res.put(b);
//		return res;
//	}
	/**
	 *  {@return the instance extensions}
	 */
	public static String[] getInstanceExtensions() {
		int[] arr = new int[1];
		{
			VK13.vkEnumerateInstanceExtensionProperties((String)null, arr, null);
			int amountExtensionProperties = arr[0];
			ByteBuffer disposeBuffer = MemoryUtil.memCalloc(VkExtensionProperties.SIZEOF*amountExtensionProperties);
			VkExtensionProperties.Buffer epb = new VkExtensionProperties.Buffer(disposeBuffer);
			VK13.vkEnumerateInstanceExtensionProperties((String)null, arr, epb);
			String[] isuppoerted_extensions = new String[amountExtensionProperties];
			for(int l = 0; l < amountExtensionProperties; l++) {
				isuppoerted_extensions[l] = epb.get(l).extensionNameString();
//				DebugPrinter.out("-"+isuppoerted_extensions[l]);;
			}
			epb.free();
			return isuppoerted_extensions;
		}
	}
	/**
	 *  -
	 * @param device -
	 * @param family -
	 * @param index -
	 * @return -
	 */
	public static VkQueue getQueue(VkDevice device, int family, int index) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			PointerBuffer pb = stack.callocPointer(1);
			VK13.vkGetDeviceQueue(device, family, index, pb);
			return new VkQueue(pb.get(0), device);
		}
	}
	
	/**
	 *  -
	 * @param swapchain -
	 * @param device -
	 * @return -
	 */
	public static long[] getSwapchainImages(long swapchain, VkDevice device) {
		int[] arr = new int[1];
		KHRSwapchain.vkGetSwapchainImagesKHR(device, swapchain, arr, null);
		int amount = arr[0];
		long[] res = new long[amount];
		KHRSwapchain.vkGetSwapchainImagesKHR(device, swapchain, arr, res);
		return res;
	}
	
	/**
	 *  -
	 * @param stack -
	 * @param binding -
	 * @param location -
	 * @param format -
	 * @param offsetSizeBytes -
	 * @return -
	 */
	public static VkVertexInputAttributeDescription getVertexAttrDescr(MemoryStack stack, int binding, int location, int format, int offsetSizeBytes) {
		VkVertexInputAttributeDescription descr = new VkVertexInputAttributeDescription(stack.calloc(16));
		descr.binding(binding);
		descr.location(location);
		descr.format(format);
		descr.offset(offsetSizeBytes);
		return descr;
	}
	/**
	 * - 
	 * @param stack -
	 * @param binding -
	 * @param elementSizeBytes -
	 * @param instanced -
	 * @return -
	 */
	public static VkVertexInputBindingDescription getVertexDescr(MemoryStack stack, int binding, int elementSizeBytes, boolean instanced) {
		VkVertexInputBindingDescription descr = new VkVertexInputBindingDescription(stack.calloc(12));
		descr.binding(binding);
		descr.stride(elementSizeBytes);
		descr.inputRate(instanced ? VK13.VK_VERTEX_INPUT_RATE_INSTANCE : VK13.VK_VERTEX_INPUT_RATE_VERTEX);
		return descr;
	}
	/**
	 * -
	 * @param mainGPU -
	 * @param windowSurface -
	 * @return -
	 */
	public static VkSurfaceCapabilitiesKHR getVkSurfaceCapabilitiesKHR(VkPhysicalDevice mainGPU, long windowSurface) {
		VkSurfaceCapabilitiesKHR sss = new VkSurfaceCapabilitiesKHR(BufferUtils.createByteBuffer(52));
		KHRSurface.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(mainGPU, windowSurface, sss);
		return sss;
	}
	/**
	 * Requests a Validation Layer by name.
	 * @param validationLayerNames -
	 * @param layers -
	 * @return the pointers of the available layers
	 */
	public static long[] requestValidationLayersByName(VkLayerProperties[] validationLayerNames, String...layers) {
		List<VkLayerProperties> avaible = new ArrayList<>();
		for(String s : layers) {
			for(VkLayerProperties p : validationLayerNames)
				if(p.layerNameString().equalsIgnoreCase(s))
					avaible.add(p);
		}
		long[] pointers = new long[avaible.size()];
		for(int i = 0; i < avaible.size(); i++)
			pointers[i] = avaible.get(i).address();
//		DebugPrinter.out("Requested " + pointers.length + " Validation Layers for instance!");
		return pointers;
	}
	
	/**
	 * Transitions the Image Layout.
	 * @param image the image
	 * @param format the format
	 * @param oldLayout the old layout
	 * @param newLayout the new layout
	 * @param commandPool the commandPool
	 * @param queue the queue
	 * @param srcAccessMask the source access Mask
	 * @param dstAccessMask the destination access Mask
	 * @param sourceStage the source Stage
 	 * @param destinationStage the destination Stage
	 */
	public static void transitionImageLayout(Image image, int format, int oldLayout, int newLayout, long commandPool, VkQueue queue, int srcAccessMask, int dstAccessMask, int sourceStage, int destinationStage) {
		long imagea = image.address();
		VkDevice device = image.device();
		try (MemoryStack stack = MemoryStack.stackPush()) {
			VkCommandBuffer commandbuffer = beginSingleUseCommandBuffer(device, commandPool);
			VkImageMemoryBarrier barrier = new VkImageMemoryBarrier(stack.calloc(72));
			barrier.sType(VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER);
			barrier.oldLayout(oldLayout);
			barrier.newLayout(newLayout);
			barrier.srcQueueFamilyIndex(VK13.VK_QUEUE_FAMILY_IGNORED);
			barrier.dstQueueFamilyIndex(VK13.VK_QUEUE_FAMILY_IGNORED);
			barrier.image(imagea);
			barrier.subresourceRange().aspectMask(VK13.VK_IMAGE_ASPECT_COLOR_BIT);
			barrier.subresourceRange().baseMipLevel(0);
			barrier.subresourceRange().levelCount(1);
			barrier.subresourceRange().baseArrayLayer(0);
			barrier.subresourceRange().layerCount(1);
			barrier.srcAccessMask(srcAccessMask);
			barrier.dstAccessMask(dstAccessMask);
			
			VkImageMemoryBarrier.Buffer barrier_buffer = new VkImageMemoryBarrier.Buffer(stack.calloc(72*1));
			barrier_buffer.put(0, barrier);
			
			VK13.vkCmdPipelineBarrier(commandbuffer, sourceStage, destinationStage, 0, null, null, barrier_buffer);
			
			endSingleUseCommandBufferAndSubmit(device, commandPool, commandbuffer, queue);
		}
	}
	
}
