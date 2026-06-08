package io.github.kartoffell.klvulkan;
import io.github.kartoffell.klvulkan.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import java.nio.file.*;
import java.io.*;
import org.jspecify.annotations.*;
import org.lwjgl.system.*;
import java.nio.*;
import java.util.*;
import io.github.kartoffell.klvulkan.*;
// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
/**
Vulkan 1.3 core API interface definitions (merged)
*/
public class VK13 extends io.github.kartoffell.klvulkan.VK12{
	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevicePipelineCreationCacheControlFeatures.html">VkPhysicalDevicePipelineCreationCacheControlFeatures</a>
	*/
	public interface VkPhysicalDevicePipelineCreationCacheControlFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDevicePipelineCreationCacheControlFeatures>{
		default VkPhysicalDevicePipelineCreationCacheControlFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.STYPE);
		}

		default VkPhysicalDevicePipelineCreationCacheControlFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.PNEXT);
		}

		default VkPhysicalDevicePipelineCreationCacheControlFeatures pipelineCreationCacheControl(boolean pipelineCreationCacheControl){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.PIPELINECREATIONCACHECONTROL, pipelineCreationCacheControl?1:0);
			return this;
		}

		default boolean pipelineCreationCacheControl(){
			final var pipelineCreationCacheControl_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.PIPELINECREATIONCACHECONTROL);
			return pipelineCreationCacheControl_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDevicePipelineCreationCacheControlFeatures from the given Arena.
		*/
		public static VkPhysicalDevicePipelineCreationCacheControlFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDevicePipelineCreationCacheControlFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDevicePipelineCreationCacheControlFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.SIZEOF, (mem)->(VkPhysicalDevicePipelineCreationCacheControlFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResolveImageInfo2.html">VkResolveImageInfo2</a>
	*/
	public interface VkResolveImageInfo2 extends io.github.kartoffell.klvulkan.Element<VkResolveImageInfo2>{
		default VkResolveImageInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.STYPE);
		}

		default VkResolveImageInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.PNEXT);
		}

		default VkResolveImageInfo2 srcImage(Element<? extends VkImage> srcImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.SRCIMAGE, (srcImage==null?MemorySegment.NULL:srcImage.address()));
			return this;
		}

		default Element<? extends VkImage> srcImage(){
			final var srcImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.SRCIMAGE);
			return (srcImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->srcImage_);
		}

		default VkResolveImageInfo2 srcImageLayout(int srcImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.SRCIMAGELAYOUT, srcImageLayout);
			return this;
		}

		default int srcImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.SRCIMAGELAYOUT);
		}

		default VkResolveImageInfo2 dstImage(Element<? extends VkImage> dstImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.DSTIMAGE, (dstImage==null?MemorySegment.NULL:dstImage.address()));
			return this;
		}

		default Element<? extends VkImage> dstImage(){
			final var dstImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.DSTIMAGE);
			return (dstImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->dstImage_);
		}

		default VkResolveImageInfo2 dstImageLayout(int dstImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.DSTIMAGELAYOUT, dstImageLayout);
			return this;
		}

		default int dstImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.DSTIMAGELAYOUT);
		}

		default VkResolveImageInfo2 regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkResolveImageInfo2.REGIONCOUNT);
		}

		default VkResolveImageInfo2 pRegions(Element<VkImageResolve2> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkImageResolve2> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkResolveImageInfo2.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkImageResolve2.SIZEOF, (v108449608)->(v108449608.equals(MemorySegment.NULL)?null:(VkImageResolve2)()->v108449608)));
		}

		MemorySegment address();

		/**
		Allocates a new VkResolveImageInfo2 from the given Arena.
		*/
		public static VkResolveImageInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkResolveImageInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkResolveImageInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkResolveImageInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkResolveImageInfo2.SIZEOF, (mem)->(VkResolveImageInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferInheritanceRenderingInfo.html">VkCommandBufferInheritanceRenderingInfo</a>
	*/
	public interface VkCommandBufferInheritanceRenderingInfo extends io.github.kartoffell.klvulkan.Element<VkCommandBufferInheritanceRenderingInfo>{
		default VkCommandBufferInheritanceRenderingInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.STYPE);
		}

		default VkCommandBufferInheritanceRenderingInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.PNEXT);
		}

		default VkCommandBufferInheritanceRenderingInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.FLAGS);
		}

		default VkCommandBufferInheritanceRenderingInfo viewMask(int viewMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.VIEWMASK, viewMask);
			return this;
		}

		default int viewMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.VIEWMASK);
		}

		default VkCommandBufferInheritanceRenderingInfo colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.COLORATTACHMENTCOUNT);
		}

		default VkCommandBufferInheritanceRenderingInfo pColorAttachmentFormats(IntBuffer pColorAttachmentFormats){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS, (pColorAttachmentFormats==null?MemorySegment.NULL:MemorySegment.ofBuffer(pColorAttachmentFormats)));
			return this;
		}

		default IntBuffer pColorAttachmentFormats(){
			final var pColorAttachmentFormats_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.PCOLORATTACHMENTFORMATS);
			return (pColorAttachmentFormats_.equals(MemorySegment.NULL)?null:pColorAttachmentFormats_.asByteBuffer().asIntBuffer());
		}

		default VkCommandBufferInheritanceRenderingInfo depthAttachmentFormat(int depthAttachmentFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.DEPTHATTACHMENTFORMAT, depthAttachmentFormat);
			return this;
		}

		default int depthAttachmentFormat(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.DEPTHATTACHMENTFORMAT);
		}

		default VkCommandBufferInheritanceRenderingInfo stencilAttachmentFormat(int stencilAttachmentFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.STENCILATTACHMENTFORMAT, stencilAttachmentFormat);
			return this;
		}

		default int stencilAttachmentFormat(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.STENCILATTACHMENTFORMAT);
		}

		default VkCommandBufferInheritanceRenderingInfo rasterizationSamples(int rasterizationSamples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.RASTERIZATIONSAMPLES, rasterizationSamples);
			return this;
		}

		@Nullable
		default int rasterizationSamples(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.RASTERIZATIONSAMPLES);
		}

		MemorySegment address();

		/**
		Allocates a new VkCommandBufferInheritanceRenderingInfo from the given Arena.
		*/
		public static VkCommandBufferInheritanceRenderingInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCommandBufferInheritanceRenderingInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCommandBufferInheritanceRenderingInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.SIZEOF, (mem)->(VkCommandBufferInheritanceRenderingInfo)()->mem);
		}

	}

	public interface VkFormat extends io.github.kartoffell.klvulkan.VK11.VkFormat{
		public static final int VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK = 1000066010;

		public static final int VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK = 1000066003;

		public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 = 1000330002;

		public static final int VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK = 1000066009;

		public static final int VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK = 1000066012;

		public static final int VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK = 1000066001;

		public static final int VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK = 1000066005;

		public static final int VK_FORMAT_G8_B8R8_2PLANE_444_UNORM = 1000330000;

		public static final int VK_FORMAT_A4B4G4R4_UNORM_PACK16 = 1000340001;

		public static final int VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK = 1000066006;

		public static final int VK_FORMAT_G16_B16R16_2PLANE_444_UNORM = 1000330003;

		public static final int VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK = 1000066002;

		public static final int VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK = 1000066011;

		public static final int VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK = 1000066013;

		public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 = 1000330001;

		public static final int VK_FORMAT_A4R4G4B4_UNORM_PACK16 = 1000340000;

		public static final int VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK = 1000066000;

		public static final int VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK = 1000066007;

		public static final int VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK = 1000066004;

		public static final int VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK = 1000066008;

	}

	public interface VkImageLayout extends io.github.kartoffell.klvulkan.VK12.VkImageLayout{
		public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL = 1000314000;

		public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL = 1000314001;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageBlit2.html">VkImageBlit2</a>
	*/
	public interface VkImageBlit2 extends io.github.kartoffell.klvulkan.Element<VkImageBlit2>{
		default VkImageBlit2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageBlit2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageBlit2.STYPE);
		}

		default VkImageBlit2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageBlit2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageBlit2.PNEXT);
		}

		default VkImageSubresourceLayers srcSubresource(){
			final var srcSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit2.SRCSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (srcSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->srcSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default Element<VkOffset3D> srcOffsets(){
			final var srcOffsets_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit2.SRCOFFSETS, org.lwjgl.vulkan.VkOffset3D.SIZEOF*2);
			return (srcOffsets_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(srcOffsets_, org.lwjgl.vulkan.VkOffset3D.SIZEOF, (v1511909371)->(v1511909371.equals(MemorySegment.NULL)?null:(VkOffset3D)()->v1511909371)));
		}

		default VkImageSubresourceLayers dstSubresource(){
			final var dstSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit2.DSTSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (dstSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->dstSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default Element<VkOffset3D> dstOffsets(){
			final var dstOffsets_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit2.DSTOFFSETS, org.lwjgl.vulkan.VkOffset3D.SIZEOF*2);
			return (dstOffsets_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(dstOffsets_, org.lwjgl.vulkan.VkOffset3D.SIZEOF, (v861623840)->(v861623840.equals(MemorySegment.NULL)?null:(VkOffset3D)()->v861623840)));
		}

		MemorySegment address();

		/**
		Allocates a new VkImageBlit2 from the given Arena.
		*/
		public static VkImageBlit2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageBlit2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageBlit2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageBlit2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageBlit2.SIZEOF, (mem)->(VkImageBlit2)()->mem);
		}

	}

	public static class VkPhysicalDevice extends io.github.kartoffell.klvulkan.VK11.VkPhysicalDevice{
		public VkPhysicalDevice(MemorySegment address, VkInstance parent) {
			super(address, parent);
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceToolProperties.html">vkGetPhysicalDeviceToolProperties</a>
		*/
		public int vkGetPhysicalDeviceToolProperties(IntBuffer pToolCount, @Nullable Element<VkPhysicalDeviceToolProperties> pToolProperties) {
			if(capabilities.vkGetPhysicalDeviceToolProperties_==null) {
				capabilities.vkGetPhysicalDeviceToolProperties_ = capabilities.lookup("vkGetPhysicalDeviceToolProperties", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkGetPhysicalDeviceToolProperties_.invoke(address(), (pToolCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pToolCount)), (pToolProperties==null?MemorySegment.NULL:pToolProperties.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkToolPurposeFlagBits.html">VkToolPurposeFlagBits</a>
	*/
	public interface VkToolPurposeFlagBits{
		public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT = 16;

		public static final int VK_TOOL_PURPOSE_VALIDATION_BIT = 1;

		public static final int VK_TOOL_PURPOSE_PROFILING_BIT = 2;

		public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 8;

		public static final int VK_TOOL_PURPOSE_TRACING_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorPoolInlineUniformBlockCreateInfo.html">VkDescriptorPoolInlineUniformBlockCreateInfo</a>
	*/
	public interface VkDescriptorPoolInlineUniformBlockCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorPoolInlineUniformBlockCreateInfo>{
		default VkDescriptorPoolInlineUniformBlockCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.STYPE);
		}

		default VkDescriptorPoolInlineUniformBlockCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.PNEXT);
		}

		default VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindings(int maxInlineUniformBlockBindings){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.MAXINLINEUNIFORMBLOCKBINDINGS, maxInlineUniformBlockBindings);
			return this;
		}

		default int maxInlineUniformBlockBindings(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.MAXINLINEUNIFORMBLOCKBINDINGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorPoolInlineUniformBlockCreateInfo from the given Arena.
		*/
		public static VkDescriptorPoolInlineUniformBlockCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorPoolInlineUniformBlockCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorPoolInlineUniformBlockCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.SIZEOF, (mem)->(VkDescriptorPoolInlineUniformBlockCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceBufferMemoryRequirements.html">VkDeviceBufferMemoryRequirements</a>
	*/
	public interface VkDeviceBufferMemoryRequirements extends io.github.kartoffell.klvulkan.Element<VkDeviceBufferMemoryRequirements>{
		default VkDeviceBufferMemoryRequirements sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.STYPE);
		}

		default VkDeviceBufferMemoryRequirements pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.PNEXT);
		}

		default VkDeviceBufferMemoryRequirements pCreateInfo(Element<VkBufferCreateInfo> pCreateInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.PCREATEINFO, (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()));
			return this;
		}

		default Element<VkBufferCreateInfo> pCreateInfo(){
			final var pCreateInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.PCREATEINFO);
			return (pCreateInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pCreateInfo_, org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF, (v43650267)->(v43650267.equals(MemorySegment.NULL)?null:(VkBufferCreateInfo)()->v43650267)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDeviceBufferMemoryRequirements from the given Arena.
		*/
		public static VkDeviceBufferMemoryRequirements allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDeviceBufferMemoryRequirements from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDeviceBufferMemoryRequirements> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.SIZEOF, (mem)->(VkDeviceBufferMemoryRequirements)()->mem);
		}

	}

	public interface VkPipelineStageFlagBits extends io.github.kartoffell.klvulkan.VK10.VkPipelineStageFlagBits{
		public static final int VK_PIPELINE_STAGE_NONE = 1;

	}

	public interface VkAccessFlagBits extends io.github.kartoffell.klvulkan.VK10.VkAccessFlagBits{
		public static final int VK_ACCESS_NONE = 1;

	}

	public interface VkDynamicState extends io.github.kartoffell.klvulkan.VK10.VkDynamicState{
		public static final int VK_DYNAMIC_STATE_STENCIL_OP = 1000267011;

		public static final int VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE = 1000377001;

		public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE = 1000267005;

		public static final int VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE = 1000377002;

		public static final int VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT = 1000267003;

		public static final int VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE = 1000267010;

		public static final int VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT = 1000267004;

		public static final int VK_DYNAMIC_STATE_FRONT_FACE = 1000267001;

		public static final int VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY = 1000267002;

		public static final int VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE = 1000267006;

		public static final int VK_DYNAMIC_STATE_CULL_MODE = 1000267000;

		public static final int VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE = 1000377004;

		public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE = 1000267009;

		public static final int VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE = 1000267007;

		public static final int VK_DYNAMIC_STATE_DEPTH_COMPARE_OP = 1000267008;

	}

	public interface VkPipelineCreateFlagBits extends io.github.kartoffell.klvulkan.VK11.VkPipelineCreateFlagBits{
		public static final int VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 256;

		public static final int VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT = 512;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyBufferInfo2.html">VkCopyBufferInfo2</a>
	*/
	public interface VkCopyBufferInfo2 extends io.github.kartoffell.klvulkan.Element<VkCopyBufferInfo2>{
		default VkCopyBufferInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferInfo2.STYPE);
		}

		default VkCopyBufferInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.PNEXT);
		}

		default VkCopyBufferInfo2 srcBuffer(Element<? extends VkBuffer> srcBuffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.SRCBUFFER, (srcBuffer==null?MemorySegment.NULL:srcBuffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> srcBuffer(){
			final var srcBuffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.SRCBUFFER);
			return (srcBuffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->srcBuffer_);
		}

		default VkCopyBufferInfo2 dstBuffer(Element<? extends VkBuffer> dstBuffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.DSTBUFFER, (dstBuffer==null?MemorySegment.NULL:dstBuffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> dstBuffer(){
			final var dstBuffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.DSTBUFFER);
			return (dstBuffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->dstBuffer_);
		}

		default VkCopyBufferInfo2 regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferInfo2.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferInfo2.REGIONCOUNT);
		}

		default VkCopyBufferInfo2 pRegions(Element<VkBufferCopy2> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkBufferCopy2> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferInfo2.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkBufferCopy2.SIZEOF, (v849776463)->(v849776463.equals(MemorySegment.NULL)?null:(VkBufferCopy2)()->v849776463)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyBufferInfo2 from the given Arena.
		*/
		public static VkCopyBufferInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyBufferInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyBufferInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyBufferInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyBufferInfo2.SIZEOF, (mem)->(VkCopyBufferInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineStageFlagBits2.html">VkPipelineStageFlagBits2</a>
	*/
	public interface VkPipelineStageFlagBits2{
		public static final int VK_PIPELINE_STAGE_2_COPY_BIT = 1;

		public static final int VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT = 128;

		public static final int VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT = 2;

		public static final int VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT = 16;

		public static final int VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT = 2048;

		public static final int VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT = 65536;

		public static final int VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT = 32;

		public static final int VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT = 32768;

		public static final int VK_PIPELINE_STAGE_2_NONE = 1;

		public static final int VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT = 512;

		public static final int VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT = 8192;

		public static final int VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT = 1024;

		public static final int VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT = 64;

		public static final int VK_PIPELINE_STAGE_2_RESOLVE_BIT = 2;

		public static final int VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT = 4096;

		public static final int VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT = 8;

		public static final int VK_PIPELINE_STAGE_2_HOST_BIT = 16384;

		public static final int VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT = 16;

		public static final int VK_PIPELINE_STAGE_2_TRANSFER_BIT = 4096;

		public static final int VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT = 256;

		public static final int VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT = 64;

		public static final int VK_PIPELINE_STAGE_2_CLEAR_BIT = 8;

		public static final int VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 32;

		public static final int VK_PIPELINE_STAGE_2_BLIT_BIT = 4;

		public static final int VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT = 1;

		public static final int VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreSubmitInfo.html">VkSemaphoreSubmitInfo</a>
	*/
	public interface VkSemaphoreSubmitInfo extends io.github.kartoffell.klvulkan.Element<VkSemaphoreSubmitInfo>{
		default VkSemaphoreSubmitInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.STYPE);
		}

		default VkSemaphoreSubmitInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.PNEXT);
		}

		default VkSemaphoreSubmitInfo semaphore(Element<? extends VkSemaphore> semaphore){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.SEMAPHORE, (semaphore==null?MemorySegment.NULL:semaphore.address()));
			return this;
		}

		default Element<? extends VkSemaphore> semaphore(){
			final var semaphore_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.SEMAPHORE);
			return (semaphore_.equals(MemorySegment.NULL)?null:(Element<? extends VkSemaphore>)()->semaphore_);
		}

		default VkSemaphoreSubmitInfo value(long value){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.VALUE, value);
			return this;
		}

		default long value(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.VALUE);
		}

		default VkSemaphoreSubmitInfo stageMask(long stageMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.STAGEMASK, stageMask);
			return this;
		}

		@Nullable
		default long stageMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.STAGEMASK);
		}

		default VkSemaphoreSubmitInfo deviceIndex(int deviceIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.DEVICEINDEX, deviceIndex);
			return this;
		}

		default int deviceIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.DEVICEINDEX);
		}

		MemorySegment address();

		/**
		Allocates a new VkSemaphoreSubmitInfo from the given Arena.
		*/
		public static VkSemaphoreSubmitInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSemaphoreSubmitInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSemaphoreSubmitInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSemaphoreSubmitInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.SIZEOF, (mem)->(VkSemaphoreSubmitInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.html">VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures</a>
	*/
	public interface VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures>{
		default VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.STYPE);
		}

		default VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.PNEXT);
		}

		default VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures shaderZeroInitializeWorkgroupMemory(boolean shaderZeroInitializeWorkgroupMemory){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.SHADERZEROINITIALIZEWORKGROUPMEMORY, shaderZeroInitializeWorkgroupMemory?1:0);
			return this;
		}

		default boolean shaderZeroInitializeWorkgroupMemory(){
			final var shaderZeroInitializeWorkgroupMemory_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.SHADERZEROINITIALIZEWORKGROUPMEMORY);
			return shaderZeroInitializeWorkgroupMemory_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.SIZEOF, (mem)->(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceDynamicRenderingFeatures.html">VkPhysicalDeviceDynamicRenderingFeatures</a>
	*/
	public interface VkPhysicalDeviceDynamicRenderingFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceDynamicRenderingFeatures>{
		default VkPhysicalDeviceDynamicRenderingFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.STYPE);
		}

		default VkPhysicalDeviceDynamicRenderingFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.PNEXT);
		}

		default VkPhysicalDeviceDynamicRenderingFeatures dynamicRendering(boolean dynamicRendering){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.DYNAMICRENDERING, dynamicRendering?1:0);
			return this;
		}

		default boolean dynamicRendering(){
			final var dynamicRendering_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.DYNAMICRENDERING);
			return dynamicRendering_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceDynamicRenderingFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceDynamicRenderingFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceDynamicRenderingFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceDynamicRenderingFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.SIZEOF, (mem)->(VkPhysicalDeviceDynamicRenderingFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceInlineUniformBlockProperties.html">VkPhysicalDeviceInlineUniformBlockProperties</a>
	*/
	public interface VkPhysicalDeviceInlineUniformBlockProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceInlineUniformBlockProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.PNEXT);
		}

		default int maxInlineUniformBlockSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.MAXINLINEUNIFORMBLOCKSIZE);
		}

		default int maxPerStageDescriptorInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS);
		}

		default int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS);
		}

		default int maxDescriptorSetInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.MAXDESCRIPTORSETINLINEUNIFORMBLOCKS);
		}

		default int maxDescriptorSetUpdateAfterBindInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceInlineUniformBlockProperties from the given Arena.
		*/
		public static VkPhysicalDeviceInlineUniformBlockProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceInlineUniformBlockProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceInlineUniformBlockProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties.SIZEOF, (mem)->(VkPhysicalDeviceInlineUniformBlockProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceInlineUniformBlockFeatures.html">VkPhysicalDeviceInlineUniformBlockFeatures</a>
	*/
	public interface VkPhysicalDeviceInlineUniformBlockFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceInlineUniformBlockFeatures>{
		default VkPhysicalDeviceInlineUniformBlockFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.STYPE);
		}

		default VkPhysicalDeviceInlineUniformBlockFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.PNEXT);
		}

		default VkPhysicalDeviceInlineUniformBlockFeatures inlineUniformBlock(boolean inlineUniformBlock){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.INLINEUNIFORMBLOCK, inlineUniformBlock?1:0);
			return this;
		}

		default boolean inlineUniformBlock(){
			final var inlineUniformBlock_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.INLINEUNIFORMBLOCK);
			return inlineUniformBlock_!=0;
		}

		default VkPhysicalDeviceInlineUniformBlockFeatures descriptorBindingInlineUniformBlockUpdateAfterBind(boolean descriptorBindingInlineUniformBlockUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND, descriptorBindingInlineUniformBlockUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingInlineUniformBlockUpdateAfterBind(){
			final var descriptorBindingInlineUniformBlockUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND);
			return descriptorBindingInlineUniformBlockUpdateAfterBind_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceInlineUniformBlockFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceInlineUniformBlockFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceInlineUniformBlockFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceInlineUniformBlockFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.SIZEOF, (mem)->(VkPhysicalDeviceInlineUniformBlockFeatures)()->mem);
		}

	}

	public static class VkDevice extends io.github.kartoffell.klvulkan.VK12.VkDevice{
		public VkDevice(MemorySegment address, VkPhysicalDevice parent) {
			super(address, parent);
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyPrivateDataSlot.html">vkDestroyPrivateDataSlot</a>
		*/
		public void vkDestroyPrivateDataSlot(@Nullable Element<? extends VkPrivateDataSlot> privateDataSlot, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyPrivateDataSlot_==null) {
				capabilities.vkDestroyPrivateDataSlot_ = capabilities.lookup("vkDestroyPrivateDataSlot", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyPrivateDataSlot_.invoke(address(), (privateDataSlot==null?MemorySegment.NULL:privateDataSlot.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceImageSparseMemoryRequirements.html">vkGetDeviceImageSparseMemoryRequirements</a>
		*/
		public void vkGetDeviceImageSparseMemoryRequirements(Element<VkDeviceImageMemoryRequirements> pInfo, IntBuffer pSparseMemoryRequirementCount, @Nullable Element<VkSparseImageMemoryRequirements2> pSparseMemoryRequirements) {
			if(capabilities.vkGetDeviceImageSparseMemoryRequirements_==null) {
				capabilities.vkGetDeviceImageSparseMemoryRequirements_ = capabilities.lookup("vkGetDeviceImageSparseMemoryRequirements", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceImageSparseMemoryRequirements_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()), (pSparseMemoryRequirementCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pSparseMemoryRequirementCount)), (pSparseMemoryRequirements==null?MemorySegment.NULL:pSparseMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPrivateData.html">vkGetPrivateData</a>
		*/
		public void vkGetPrivateData(int objectType, long objectHandle, Element<? extends VkPrivateDataSlot> privateDataSlot, LongBuffer pData) {
			if(capabilities.vkGetPrivateData_==null) {
				capabilities.vkGetPrivateData_ = capabilities.lookup("vkGetPrivateData", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPrivateData_.invoke(address(), objectType, objectHandle, (privateDataSlot==null?MemorySegment.NULL:privateDataSlot.address()), (pData==null?MemorySegment.NULL:MemorySegment.ofBuffer(pData)));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreatePrivateDataSlot.html">vkCreatePrivateDataSlot</a>
		*/
		public void vkCreatePrivateDataSlot(Element<VkPrivateDataSlotCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkPrivateDataSlot>> pPrivateDataSlot) {
			if(capabilities.vkCreatePrivateDataSlot_==null) {
				capabilities.vkCreatePrivateDataSlot_ = capabilities.lookup("vkCreatePrivateDataSlot", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreatePrivateDataSlot_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pPrivateDataSlot==null?MemorySegment.NULL:pPrivateDataSlot.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceBufferMemoryRequirements.html">vkGetDeviceBufferMemoryRequirements</a>
		*/
		public void vkGetDeviceBufferMemoryRequirements(Element<VkDeviceBufferMemoryRequirements> pInfo, Element<VkMemoryRequirements2> pMemoryRequirements) {
			if(capabilities.vkGetDeviceBufferMemoryRequirements_==null) {
				capabilities.vkGetDeviceBufferMemoryRequirements_ = capabilities.lookup("vkGetDeviceBufferMemoryRequirements", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceBufferMemoryRequirements_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()), (pMemoryRequirements==null?MemorySegment.NULL:pMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkSetPrivateData.html">vkSetPrivateData</a>
		*/
		public void vkSetPrivateData(int objectType, long objectHandle, Element<? extends VkPrivateDataSlot> privateDataSlot, long data) {
			if(capabilities.vkSetPrivateData_==null) {
				capabilities.vkSetPrivateData_ = capabilities.lookup("vkSetPrivateData", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
			}
			try {
				final var return_ = (int) capabilities.vkSetPrivateData_.invoke(address(), objectType, objectHandle, (privateDataSlot==null?MemorySegment.NULL:privateDataSlot.address()), data);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceImageMemoryRequirements.html">vkGetDeviceImageMemoryRequirements</a>
		*/
		public void vkGetDeviceImageMemoryRequirements(Element<VkDeviceImageMemoryRequirements> pInfo, Element<VkMemoryRequirements2> pMemoryRequirements) {
			if(capabilities.vkGetDeviceImageMemoryRequirements_==null) {
				capabilities.vkGetDeviceImageMemoryRequirements_ = capabilities.lookup("vkGetDeviceImageMemoryRequirements", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceImageMemoryRequirements_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()), (pMemoryRequirements==null?MemorySegment.NULL:pMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		protected VkDevice VkDevice(MemorySegment mem, Object parent) {
			return new VkDevice(mem, (VkPhysicalDevice) parent); //Omega
		}

		protected VkPrivateDataSlot VkPrivateDataSlot(MemorySegment mem, Object parent) {
			return new VkPrivateDataSlot(mem, (VkDevice) parent);
		}

		protected VkQueue VkQueue(MemorySegment mem, Object parent) {
			return new VkQueue(mem, (VkDevice) parent); //Omega
		}

		protected VkCommandBuffer VkCommandBuffer(MemorySegment mem, Object parent) {
			return new VkCommandBuffer(mem, (VkCommandPool) parent); //Omega
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceToolProperties.html">VkPhysicalDeviceToolProperties</a>
	*/
	public interface VkPhysicalDeviceToolProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceToolProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.PNEXT);
		}

		default CString name(){
			final var name_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.NAME, API_Constants.VK_MAX_EXTENSION_NAME_SIZE);
			return name_.equals(MemorySegment.NULL)?null:CString.wrap(name_);
		}

		default CString version(){
			final var version_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.VERSION, API_Constants.VK_MAX_EXTENSION_NAME_SIZE);
			return version_.equals(MemorySegment.NULL)?null:CString.wrap(version_);
		}

		default int purposes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.PURPOSES);
		}

		default CString description(){
			final var description_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.DESCRIPTION, API_Constants.VK_MAX_DESCRIPTION_SIZE);
			return description_.equals(MemorySegment.NULL)?null:CString.wrap(description_);
		}

		default CString layer(){
			final var layer_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.LAYER, API_Constants.VK_MAX_EXTENSION_NAME_SIZE);
			return layer_.equals(MemorySegment.NULL)?null:CString.wrap(layer_);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceToolProperties from the given Arena.
		*/
		public static VkPhysicalDeviceToolProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceToolProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceToolProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.SIZEOF, (mem)->(VkPhysicalDeviceToolProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderingFlagBits.html">VkRenderingFlagBits</a>
	*/
	public interface VkRenderingFlagBits{
		public static final int VK_RENDERING_SUSPENDING_BIT = 2;

		public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 1;

		public static final int VK_RENDERING_RESUMING_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.html">VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures</a>
	*/
	public interface VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures>{
		default VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.STYPE);
		}

		default VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.PNEXT);
		}

		default VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures shaderDemoteToHelperInvocation(boolean shaderDemoteToHelperInvocation){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SHADERDEMOTETOHELPERINVOCATION, shaderDemoteToHelperInvocation?1:0);
			return this;
		}

		default boolean shaderDemoteToHelperInvocation(){
			final var shaderDemoteToHelperInvocation_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SHADERDEMOTETOHELPERINVOCATION);
			return shaderDemoteToHelperInvocation_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SIZEOF, (mem)->(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderingInfo.html">VkRenderingInfo</a>
	*/
	public interface VkRenderingInfo extends io.github.kartoffell.klvulkan.Element<VkRenderingInfo>{
		default VkRenderingInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.STYPE);
		}

		default VkRenderingInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PNEXT);
		}

		default VkRenderingInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.FLAGS);
		}

		default VkRect2D renderArea(){
			final var renderArea_ = address().asSlice(org.lwjgl.vulkan.VkRenderingInfo.RENDERAREA, org.lwjgl.vulkan.VkRect2D.SIZEOF);
			return (renderArea_.equals(MemorySegment.NULL)?null:(VkRect2D)()->renderArea_);
		}

		default VkRenderingInfo layerCount(int layerCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.LAYERCOUNT, layerCount);
			return this;
		}

		default int layerCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.LAYERCOUNT);
		}

		default VkRenderingInfo viewMask(int viewMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.VIEWMASK, viewMask);
			return this;
		}

		default int viewMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.VIEWMASK);
		}

		default VkRenderingInfo colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInfo.COLORATTACHMENTCOUNT);
		}

		default VkRenderingInfo pColorAttachments(Element<VkRenderingAttachmentInfo> pColorAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PCOLORATTACHMENTS, (pColorAttachments==null?MemorySegment.NULL:pColorAttachments.address()));
			return this;
		}

		default Element<VkRenderingAttachmentInfo> pColorAttachments(){
			final var pColorAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PCOLORATTACHMENTS);
			return (pColorAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pColorAttachments_, org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF, (v120689887)->(v120689887.equals(MemorySegment.NULL)?null:(VkRenderingAttachmentInfo)()->v120689887)));
		}

		default VkRenderingInfo pDepthAttachment(Element<VkRenderingAttachmentInfo> pDepthAttachment){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PDEPTHATTACHMENT, (pDepthAttachment==null?MemorySegment.NULL:pDepthAttachment.address()));
			return this;
		}

		@Nullable
		default Element<VkRenderingAttachmentInfo> pDepthAttachment(){
			final var pDepthAttachment_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PDEPTHATTACHMENT);
			return (pDepthAttachment_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDepthAttachment_, org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF, (v1857173583)->(v1857173583.equals(MemorySegment.NULL)?null:(VkRenderingAttachmentInfo)()->v1857173583)));
		}

		default VkRenderingInfo pStencilAttachment(Element<VkRenderingAttachmentInfo> pStencilAttachment){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PSTENCILATTACHMENT, (pStencilAttachment==null?MemorySegment.NULL:pStencilAttachment.address()));
			return this;
		}

		@Nullable
		default Element<VkRenderingAttachmentInfo> pStencilAttachment(){
			final var pStencilAttachment_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInfo.PSTENCILATTACHMENT);
			return (pStencilAttachment_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pStencilAttachment_, org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF, (v1016860054)->(v1016860054.equals(MemorySegment.NULL)?null:(VkRenderingAttachmentInfo)()->v1016860054)));
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderingInfo from the given Arena.
		*/
		public static VkRenderingInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderingInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderingInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderingInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderingInfo.SIZEOF, (mem)->(VkRenderingInfo)()->mem);
		}

	}

	public static class VkQueue extends io.github.kartoffell.klvulkan.VK10.VkQueue{
		public VkQueue(MemorySegment address, VkDevice parent) {
			super(address, parent);
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkQueueSubmit2.html">vkQueueSubmit2</a>
		*/
		public void vkQueueSubmit2(@Nullable int submitCount, Element<VkSubmitInfo2> pSubmits, @Nullable Element<? extends VkFence> fence) {
			if(capabilities.vkQueueSubmit2_==null) {
				capabilities.vkQueueSubmit2_ = capabilities.lookup("vkQueueSubmit2", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkQueueSubmit2_.invoke(address(), submitCount, (pSubmits==null?MemorySegment.NULL:pSubmits.address()), (fence==null?MemorySegment.NULL:fence.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	public static class VkCommandBuffer extends io.github.kartoffell.klvulkan.VK12.VkCommandBuffer{
		public VkCommandBuffer(MemorySegment address, VkCommandPool parent) {
			super(address, parent);
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetScissorWithCount.html">vkCmdSetScissorWithCount</a>
		*/
		public void vkCmdSetScissorWithCount(int scissorCount, Element<VkRect2D> pScissors) {
			if(capabilities.vkCmdSetScissorWithCount_==null) {
				capabilities.vkCmdSetScissorWithCount_ = capabilities.lookup("vkCmdSetScissorWithCount", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetScissorWithCount_.invoke(address(), scissorCount, (pScissors==null?MemorySegment.NULL:pScissors.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyImage2.html">vkCmdCopyImage2</a>
		*/
		public void vkCmdCopyImage2(Element<VkCopyImageInfo2> pCopyImageInfo) {
			if(capabilities.vkCmdCopyImage2_==null) {
				capabilities.vkCmdCopyImage2_ = capabilities.lookup("vkCmdCopyImage2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyImage2_.invoke(address(), (pCopyImageInfo==null?MemorySegment.NULL:pCopyImageInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetRasterizerDiscardEnable.html">vkCmdSetRasterizerDiscardEnable</a>
		*/
		public void vkCmdSetRasterizerDiscardEnable(boolean rasterizerDiscardEnable) {
			if(capabilities.vkCmdSetRasterizerDiscardEnable_==null) {
				capabilities.vkCmdSetRasterizerDiscardEnable_ = capabilities.lookup("vkCmdSetRasterizerDiscardEnable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetRasterizerDiscardEnable_.invoke(address(), rasterizerDiscardEnable?1:0);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdResetEvent2.html">vkCmdResetEvent2</a>
		*/
		public void vkCmdResetEvent2(Element<? extends VkEvent> event, @Nullable long stageMask) {
			if(capabilities.vkCmdResetEvent2_==null) {
				capabilities.vkCmdResetEvent2_ = capabilities.lookup("vkCmdResetEvent2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
			}
			try {
				capabilities.vkCmdResetEvent2_.invoke(address(), (event==null?MemorySegment.NULL:event.address()), stageMask);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetEvent2.html">vkCmdSetEvent2</a>
		*/
		public void vkCmdSetEvent2(Element<? extends VkEvent> event, Element<VkDependencyInfo> pDependencyInfo) {
			if(capabilities.vkCmdSetEvent2_==null) {
				capabilities.vkCmdSetEvent2_ = capabilities.lookup("vkCmdSetEvent2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetEvent2_.invoke(address(), (event==null?MemorySegment.NULL:event.address()), (pDependencyInfo==null?MemorySegment.NULL:pDependencyInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDepthTestEnable.html">vkCmdSetDepthTestEnable</a>
		*/
		public void vkCmdSetDepthTestEnable(boolean depthTestEnable) {
			if(capabilities.vkCmdSetDepthTestEnable_==null) {
				capabilities.vkCmdSetDepthTestEnable_ = capabilities.lookup("vkCmdSetDepthTestEnable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetDepthTestEnable_.invoke(address(), depthTestEnable?1:0);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetPrimitiveRestartEnable.html">vkCmdSetPrimitiveRestartEnable</a>
		*/
		public void vkCmdSetPrimitiveRestartEnable(boolean primitiveRestartEnable) {
			if(capabilities.vkCmdSetPrimitiveRestartEnable_==null) {
				capabilities.vkCmdSetPrimitiveRestartEnable_ = capabilities.lookup("vkCmdSetPrimitiveRestartEnable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetPrimitiveRestartEnable_.invoke(address(), primitiveRestartEnable?1:0);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyBufferToImage2.html">vkCmdCopyBufferToImage2</a>
		*/
		public void vkCmdCopyBufferToImage2(Element<VkCopyBufferToImageInfo2> pCopyBufferToImageInfo) {
			if(capabilities.vkCmdCopyBufferToImage2_==null) {
				capabilities.vkCmdCopyBufferToImage2_ = capabilities.lookup("vkCmdCopyBufferToImage2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyBufferToImage2_.invoke(address(), (pCopyBufferToImageInfo==null?MemorySegment.NULL:pCopyBufferToImageInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPipelineBarrier2.html">vkCmdPipelineBarrier2</a>
		*/
		public void vkCmdPipelineBarrier2(Element<VkDependencyInfo> pDependencyInfo) {
			if(capabilities.vkCmdPipelineBarrier2_==null) {
				capabilities.vkCmdPipelineBarrier2_ = capabilities.lookup("vkCmdPipelineBarrier2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPipelineBarrier2_.invoke(address(), (pDependencyInfo==null?MemorySegment.NULL:pDependencyInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdResolveImage2.html">vkCmdResolveImage2</a>
		*/
		public void vkCmdResolveImage2(Element<VkResolveImageInfo2> pResolveImageInfo) {
			if(capabilities.vkCmdResolveImage2_==null) {
				capabilities.vkCmdResolveImage2_ = capabilities.lookup("vkCmdResolveImage2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdResolveImage2_.invoke(address(), (pResolveImageInfo==null?MemorySegment.NULL:pResolveImageInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetStencilOp.html">vkCmdSetStencilOp</a>
		*/
		public void vkCmdSetStencilOp(int faceMask, int failOp, int passOp, int depthFailOp, int compareOp) {
			if(capabilities.vkCmdSetStencilOp_==null) {
				capabilities.vkCmdSetStencilOp_ = capabilities.lookup("vkCmdSetStencilOp", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetStencilOp_.invoke(address(), faceMask, failOp, passOp, depthFailOp, compareOp);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDepthWriteEnable.html">vkCmdSetDepthWriteEnable</a>
		*/
		public void vkCmdSetDepthWriteEnable(boolean depthWriteEnable) {
			if(capabilities.vkCmdSetDepthWriteEnable_==null) {
				capabilities.vkCmdSetDepthWriteEnable_ = capabilities.lookup("vkCmdSetDepthWriteEnable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetDepthWriteEnable_.invoke(address(), depthWriteEnable?1:0);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetFrontFace.html">vkCmdSetFrontFace</a>
		*/
		public void vkCmdSetFrontFace(int frontFace) {
			if(capabilities.vkCmdSetFrontFace_==null) {
				capabilities.vkCmdSetFrontFace_ = capabilities.lookup("vkCmdSetFrontFace", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetFrontFace_.invoke(address(), frontFace);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDepthBiasEnable.html">vkCmdSetDepthBiasEnable</a>
		*/
		public void vkCmdSetDepthBiasEnable(boolean depthBiasEnable) {
			if(capabilities.vkCmdSetDepthBiasEnable_==null) {
				capabilities.vkCmdSetDepthBiasEnable_ = capabilities.lookup("vkCmdSetDepthBiasEnable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetDepthBiasEnable_.invoke(address(), depthBiasEnable?1:0);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDepthBoundsTestEnable.html">vkCmdSetDepthBoundsTestEnable</a>
		*/
		public void vkCmdSetDepthBoundsTestEnable(boolean depthBoundsTestEnable) {
			if(capabilities.vkCmdSetDepthBoundsTestEnable_==null) {
				capabilities.vkCmdSetDepthBoundsTestEnable_ = capabilities.lookup("vkCmdSetDepthBoundsTestEnable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetDepthBoundsTestEnable_.invoke(address(), depthBoundsTestEnable?1:0);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBlitImage2.html">vkCmdBlitImage2</a>
		*/
		public void vkCmdBlitImage2(Element<VkBlitImageInfo2> pBlitImageInfo) {
			if(capabilities.vkCmdBlitImage2_==null) {
				capabilities.vkCmdBlitImage2_ = capabilities.lookup("vkCmdBlitImage2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBlitImage2_.invoke(address(), (pBlitImageInfo==null?MemorySegment.NULL:pBlitImageInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetCullMode.html">vkCmdSetCullMode</a>
		*/
		public void vkCmdSetCullMode(@Nullable int cullMode) {
			if(capabilities.vkCmdSetCullMode_==null) {
				capabilities.vkCmdSetCullMode_ = capabilities.lookup("vkCmdSetCullMode", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetCullMode_.invoke(address(), cullMode);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDepthCompareOp.html">vkCmdSetDepthCompareOp</a>
		*/
		public void vkCmdSetDepthCompareOp(int depthCompareOp) {
			if(capabilities.vkCmdSetDepthCompareOp_==null) {
				capabilities.vkCmdSetDepthCompareOp_ = capabilities.lookup("vkCmdSetDepthCompareOp", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetDepthCompareOp_.invoke(address(), depthCompareOp);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdEndRendering.html">vkCmdEndRendering</a>
		*/
		public void vkCmdEndRendering() {
			if(capabilities.vkCmdEndRendering_==null) {
				capabilities.vkCmdEndRendering_ = capabilities.lookup("vkCmdEndRendering", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdEndRendering_.invoke(address());
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBindVertexBuffers2.html">vkCmdBindVertexBuffers2</a>
		*/
		public void vkCmdBindVertexBuffers2(int firstBinding, int bindingCount, PointerBuffer<? extends Element<? extends VkBuffer>> pBuffers, LongBuffer pOffsets, @Nullable LongBuffer pSizes, @Nullable LongBuffer pStrides) {
			if(capabilities.vkCmdBindVertexBuffers2_==null) {
				capabilities.vkCmdBindVertexBuffers2_ = capabilities.lookup("vkCmdBindVertexBuffers2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBindVertexBuffers2_.invoke(address(), firstBinding, bindingCount, (pBuffers==null?MemorySegment.NULL:pBuffers.address()), (pOffsets==null?MemorySegment.NULL:MemorySegment.ofBuffer(pOffsets)), (pSizes==null?MemorySegment.NULL:MemorySegment.ofBuffer(pSizes)), (pStrides==null?MemorySegment.NULL:MemorySegment.ofBuffer(pStrides)));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetPrimitiveTopology.html">vkCmdSetPrimitiveTopology</a>
		*/
		public void vkCmdSetPrimitiveTopology(int primitiveTopology) {
			if(capabilities.vkCmdSetPrimitiveTopology_==null) {
				capabilities.vkCmdSetPrimitiveTopology_ = capabilities.lookup("vkCmdSetPrimitiveTopology", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetPrimitiveTopology_.invoke(address(), primitiveTopology);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyImageToBuffer2.html">vkCmdCopyImageToBuffer2</a>
		*/
		public void vkCmdCopyImageToBuffer2(Element<VkCopyImageToBufferInfo2> pCopyImageToBufferInfo) {
			if(capabilities.vkCmdCopyImageToBuffer2_==null) {
				capabilities.vkCmdCopyImageToBuffer2_ = capabilities.lookup("vkCmdCopyImageToBuffer2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyImageToBuffer2_.invoke(address(), (pCopyImageToBufferInfo==null?MemorySegment.NULL:pCopyImageToBufferInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBeginRendering.html">vkCmdBeginRendering</a>
		*/
		public void vkCmdBeginRendering(Element<VkRenderingInfo> pRenderingInfo) {
			if(capabilities.vkCmdBeginRendering_==null) {
				capabilities.vkCmdBeginRendering_ = capabilities.lookup("vkCmdBeginRendering", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBeginRendering_.invoke(address(), (pRenderingInfo==null?MemorySegment.NULL:pRenderingInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetViewportWithCount.html">vkCmdSetViewportWithCount</a>
		*/
		public void vkCmdSetViewportWithCount(int viewportCount, Element<VkViewport> pViewports) {
			if(capabilities.vkCmdSetViewportWithCount_==null) {
				capabilities.vkCmdSetViewportWithCount_ = capabilities.lookup("vkCmdSetViewportWithCount", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetViewportWithCount_.invoke(address(), viewportCount, (pViewports==null?MemorySegment.NULL:pViewports.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyBuffer2.html">vkCmdCopyBuffer2</a>
		*/
		public void vkCmdCopyBuffer2(Element<VkCopyBufferInfo2> pCopyBufferInfo) {
			if(capabilities.vkCmdCopyBuffer2_==null) {
				capabilities.vkCmdCopyBuffer2_ = capabilities.lookup("vkCmdCopyBuffer2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyBuffer2_.invoke(address(), (pCopyBufferInfo==null?MemorySegment.NULL:pCopyBufferInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdWaitEvents2.html">vkCmdWaitEvents2</a>
		*/
		public void vkCmdWaitEvents2(int eventCount, PointerBuffer<? extends Element<? extends VkEvent>> pEvents, Element<VkDependencyInfo> pDependencyInfos) {
			if(capabilities.vkCmdWaitEvents2_==null) {
				capabilities.vkCmdWaitEvents2_ = capabilities.lookup("vkCmdWaitEvents2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdWaitEvents2_.invoke(address(), eventCount, (pEvents==null?MemorySegment.NULL:pEvents.address()), (pDependencyInfos==null?MemorySegment.NULL:pDependencyInfos.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetStencilTestEnable.html">vkCmdSetStencilTestEnable</a>
		*/
		public void vkCmdSetStencilTestEnable(boolean stencilTestEnable) {
			if(capabilities.vkCmdSetStencilTestEnable_==null) {
				capabilities.vkCmdSetStencilTestEnable_ = capabilities.lookup("vkCmdSetStencilTestEnable", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetStencilTestEnable_.invoke(address(), stencilTestEnable?1:0);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdWriteTimestamp2.html">vkCmdWriteTimestamp2</a>
		*/
		public void vkCmdWriteTimestamp2(@Nullable long stage, Element<? extends VkQueryPool> queryPool, int query) {
			if(capabilities.vkCmdWriteTimestamp2_==null) {
				capabilities.vkCmdWriteTimestamp2_ = capabilities.lookup("vkCmdWriteTimestamp2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdWriteTimestamp2_.invoke(address(), stage, (queryPool==null?MemorySegment.NULL:queryPool.address()), query);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	public interface VkPipelineCacheCreateFlagBits extends io.github.kartoffell.klvulkan.VK10.VkPipelineCacheCreateFlagBits{
		public static final int VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceImageMemoryRequirements.html">VkDeviceImageMemoryRequirements</a>
	*/
	public interface VkDeviceImageMemoryRequirements extends io.github.kartoffell.klvulkan.Element<VkDeviceImageMemoryRequirements>{
		default VkDeviceImageMemoryRequirements sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.STYPE);
		}

		default VkDeviceImageMemoryRequirements pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PNEXT);
		}

		default VkDeviceImageMemoryRequirements pCreateInfo(Element<VkImageCreateInfo> pCreateInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PCREATEINFO, (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()));
			return this;
		}

		default Element<VkImageCreateInfo> pCreateInfo(){
			final var pCreateInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PCREATEINFO);
			return (pCreateInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pCreateInfo_, org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF, (v977674685)->(v977674685.equals(MemorySegment.NULL)?null:(VkImageCreateInfo)()->v977674685)));
		}

		default VkDeviceImageMemoryRequirements planeAspect(int planeAspect){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PLANEASPECT, planeAspect);
			return this;
		}

		@Nullable
		default int planeAspect(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PLANEASPECT);
		}

		MemorySegment address();

		/**
		Allocates a new VkDeviceImageMemoryRequirements from the given Arena.
		*/
		public static VkDeviceImageMemoryRequirements allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDeviceImageMemoryRequirements from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDeviceImageMemoryRequirements> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF, (mem)->(VkDeviceImageMemoryRequirements)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderIntegerDotProductProperties.html">VkPhysicalDeviceShaderIntegerDotProductProperties</a>
	*/
	public interface VkPhysicalDeviceShaderIntegerDotProductProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderIntegerDotProductProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT);
		}

		default boolean integerDotProduct8BitUnsignedAccelerated(){
			final var integerDotProduct8BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED);
			return integerDotProduct8BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct8BitSignedAccelerated(){
			final var integerDotProduct8BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED);
			return integerDotProduct8BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct8BitMixedSignednessAccelerated(){
			final var integerDotProduct8BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct8BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct4x8BitPackedUnsignedAccelerated(){
			final var integerDotProduct4x8BitPackedUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED);
			return integerDotProduct4x8BitPackedUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct4x8BitPackedSignedAccelerated(){
			final var integerDotProduct4x8BitPackedSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED);
			return integerDotProduct4x8BitPackedSignedAccelerated_!=0;
		}

		default boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated(){
			final var integerDotProduct4x8BitPackedMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct4x8BitPackedMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct16BitUnsignedAccelerated(){
			final var integerDotProduct16BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED);
			return integerDotProduct16BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct16BitSignedAccelerated(){
			final var integerDotProduct16BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED);
			return integerDotProduct16BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct16BitMixedSignednessAccelerated(){
			final var integerDotProduct16BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct16BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct32BitUnsignedAccelerated(){
			final var integerDotProduct32BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED);
			return integerDotProduct32BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct32BitSignedAccelerated(){
			final var integerDotProduct32BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED);
			return integerDotProduct32BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct32BitMixedSignednessAccelerated(){
			final var integerDotProduct32BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct32BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct64BitUnsignedAccelerated(){
			final var integerDotProduct64BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED);
			return integerDotProduct64BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct64BitSignedAccelerated(){
			final var integerDotProduct64BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED);
			return integerDotProduct64BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct64BitMixedSignednessAccelerated(){
			final var integerDotProduct64BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct64BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating8BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating8BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating8BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating8BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating16BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating16BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating16BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating16BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating32BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating32BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating32BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating32BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating64BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating64BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating64BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating64BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderIntegerDotProductProperties from the given Arena.
		*/
		public static VkPhysicalDeviceShaderIntegerDotProductProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderIntegerDotProductProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderIntegerDotProductProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF, (mem)->(VkPhysicalDeviceShaderIntegerDotProductProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFormatFeatureFlagBits2.html">VkFormatFeatureFlagBits2</a>
	*/
	public interface VkFormatFeatureFlagBits2{
		public static final int VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT = 128;

		public static final int VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT = 8;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 65536;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152;

		public static final int VK_FORMAT_FEATURE_2_BLIT_DST_BIT = 2048;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288;

		public static final int VK_FORMAT_FEATURE_2_BLIT_SRC_BIT = 1024;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT = 2;

		public static final int VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT = 16;

		public static final int VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT = 4;

		public static final int VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT = 256;

		public static final int VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT = 16384;

		public static final int VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT = 512;

		public static final int VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32;

		public static final int VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT = -2147483648;

		public static final int VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT = 131072;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT = 1;

		public static final int VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT = 32768;

		public static final int VK_FORMAT_FEATURE_2_DISJOINT_BIT = 4194304;

		public static final int VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT = 1;

		public static final int VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT = 64;

		public static final int VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT = 2;

		public static final int VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT = 8388608;

		public static final int VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT = 8192;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPrivateDataSlotCreateInfo.html">VkPrivateDataSlotCreateInfo</a>
	*/
	public interface VkPrivateDataSlotCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPrivateDataSlotCreateInfo>{
		default VkPrivateDataSlotCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.STYPE);
		}

		default VkPrivateDataSlotCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.PNEXT);
		}

		default VkPrivateDataSlotCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.FLAGS, flags);
			return this;
		}

		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPrivateDataSlotCreateInfo from the given Arena.
		*/
		public static VkPrivateDataSlotCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPrivateDataSlotCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPrivateDataSlotCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.SIZEOF, (mem)->(VkPrivateDataSlotCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkWriteDescriptorSetInlineUniformBlock.html">VkWriteDescriptorSetInlineUniformBlock</a>
	*/
	public interface VkWriteDescriptorSetInlineUniformBlock extends io.github.kartoffell.klvulkan.Element<VkWriteDescriptorSetInlineUniformBlock>{
		default VkWriteDescriptorSetInlineUniformBlock sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.STYPE);
		}

		default VkWriteDescriptorSetInlineUniformBlock pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.PNEXT);
		}

		default VkWriteDescriptorSetInlineUniformBlock dataSize(int dataSize){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.DATASIZE, dataSize);
			return this;
		}

		default int dataSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.DATASIZE);
		}

		default VkWriteDescriptorSetInlineUniformBlock pData(MemorySegment pData){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.PDATA, pData);
			return this;
		}

		default MemorySegment pData(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.PDATA);
		}

		MemorySegment address();

		/**
		Allocates a new VkWriteDescriptorSetInlineUniformBlock from the given Arena.
		*/
		public static VkWriteDescriptorSetInlineUniformBlock allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkWriteDescriptorSetInlineUniformBlock from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkWriteDescriptorSetInlineUniformBlock> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.SIZEOF, (mem)->(VkWriteDescriptorSetInlineUniformBlock)()->mem);
		}

	}

	public interface VkPipelineShaderStageCreateFlagBits extends io.github.kartoffell.klvulkan.VK10.VkPipelineShaderStageCreateFlagBits{
		public static final int VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT = 2;

		public static final int VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT = 1;

	}

	public interface VkStructureType extends io.github.kartoffell.klvulkan.VK12.VkStructureType{
		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES = 1000044003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES = 1000215000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES = 1000295000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES = 1000066000;

		public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO = 1000044004;

		public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO = 1000314005;

		public static final int VK_STRUCTURE_TYPE_RENDERING_INFO = 1000044000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES = 1000413000;

		public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 = 1000337010;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES = 1000314007;

		public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO = 1000295002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES = 1000138001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES = 1000413001;

		public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS = 1000413002;

		public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS = 1000413003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES = 1000335000;

		public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 = 1000314000;

		public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 = 1000337000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES = 54;

		public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 = 1000337004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES = 1000276000;

		public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 = 1000337005;

		public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 = 1000337003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES = 1000280001;

		public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 = 1000360000;

		public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO = 1000314003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES = 1000245000;

		public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO = 1000044001;

		public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2 = 1000337007;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO = 1000225001;

		public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 = 1000337009;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO = 1000192000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES = 1000280000;

		public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 = 1000314002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES = 1000281001;

		public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 = 1000337002;

		public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 = 1000314001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES = 1000225000;

		public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 = 1000337001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES = 53;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES = 1000225002;

		public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO = 1000314006;

		public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2 = 1000337006;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES = 1000138000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES = 1000325000;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO = 1000044002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES = 1000297000;

		public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK = 1000138002;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO = 1000138003;

		public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2 = 1000337008;

		public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO = 1000295001;

		public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2 = 1000314004;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferImageCopy2.html">VkBufferImageCopy2</a>
	*/
	public interface VkBufferImageCopy2 extends io.github.kartoffell.klvulkan.Element<VkBufferImageCopy2>{
		default VkBufferImageCopy2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy2.STYPE);
		}

		default VkBufferImageCopy2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferImageCopy2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferImageCopy2.PNEXT);
		}

		/**
		Specified in bytes
		*/
		default VkBufferImageCopy2 bufferOffset(long bufferOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferImageCopy2.BUFFEROFFSET, bufferOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long bufferOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferImageCopy2.BUFFEROFFSET);
		}

		/**
		Specified in texels
		*/
		default VkBufferImageCopy2 bufferRowLength(int bufferRowLength){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERROWLENGTH, bufferRowLength);
			return this;
		}

		/**
		Specified in texels
		*/
		default int bufferRowLength(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERROWLENGTH);
		}

		default VkBufferImageCopy2 bufferImageHeight(int bufferImageHeight){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERIMAGEHEIGHT, bufferImageHeight);
			return this;
		}

		default int bufferImageHeight(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERIMAGEHEIGHT);
		}

		default VkImageSubresourceLayers imageSubresource(){
			final var imageSubresource_ = address().asSlice(org.lwjgl.vulkan.VkBufferImageCopy2.IMAGESUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (imageSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->imageSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkOffset3D imageOffset(){
			final var imageOffset_ = address().asSlice(org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (imageOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->imageOffset_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkExtent3D imageExtent(){
			final var imageExtent_ = address().asSlice(org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEEXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (imageExtent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->imageExtent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferImageCopy2 from the given Arena.
		*/
		public static VkBufferImageCopy2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferImageCopy2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferImageCopy2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF, (mem)->(VkBufferImageCopy2)()->mem);
		}

	}

	public static class VkInstance extends io.github.kartoffell.klvulkan.VK12.VkInstance{
		public VkInstance(MemorySegment address, VK13 parent) {
			super(address, parent);
		}

		protected VkPhysicalDevice VkPhysicalDevice(MemorySegment mem, Object parent) {
			return new VkPhysicalDevice(mem, (VkInstance) parent); //Omega
		}

		protected VkInstance VkInstance(MemorySegment mem, Object parent) {
			return new VkInstance(mem, (VK13) parent); //Omega
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPrivateDataSlot.html">VkPrivateDataSlot</a>
	*/
	public static record VkPrivateDataSlot(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkPrivateDataSlot>{
		public static PointerBuffer<? extends VkPrivateDataSlot> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkPrivateDataSlot(mem, parent)); //VkPrivateDataSlot
		}

		public static PointerBuffer<? extends VkPrivateDataSlot> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCreationFeedbackFlagBits.html">VkPipelineCreationFeedbackFlagBits</a>
	*/
	public interface VkPipelineCreationFeedbackFlagBits{
		public static final int VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT = 4;

		public static final int VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT = 1;

		public static final int VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAccessFlagBits2.html">VkAccessFlagBits2</a>
	*/
	public interface VkAccessFlagBits2{
		public static final int VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT = 1;

		public static final int VK_ACCESS_2_MEMORY_WRITE_BIT = 65536;

		public static final int VK_ACCESS_2_SHADER_READ_BIT = 32;

		public static final int VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT = 128;

		public static final int VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT = 256;

		public static final int VK_ACCESS_2_NONE = 1;

		public static final int VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512;

		public static final int VK_ACCESS_2_HOST_READ_BIT = 8192;

		public static final int VK_ACCESS_2_SHADER_STORAGE_READ_BIT = 2;

		public static final int VK_ACCESS_2_SHADER_WRITE_BIT = 64;

		public static final int VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT = 16;

		public static final int VK_ACCESS_2_MEMORY_READ_BIT = 32768;

		public static final int VK_ACCESS_2_INDEX_READ_BIT = 2;

		public static final int VK_ACCESS_2_HOST_WRITE_BIT = 16384;

		public static final int VK_ACCESS_2_TRANSFER_READ_BIT = 2048;

		public static final int VK_ACCESS_2_SHADER_SAMPLED_READ_BIT = 1;

		public static final int VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT = 4;

		public static final int VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024;

		public static final int VK_ACCESS_2_TRANSFER_WRITE_BIT = 4096;

		public static final int VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT = 4;

		public static final int VK_ACCESS_2_UNIFORM_READ_BIT = 8;

	}

	public interface VkResult extends io.github.kartoffell.klvulkan.VK12.VkResult{
		public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageMemoryBarrier2.html">VkImageMemoryBarrier2</a>
	*/
	public interface VkImageMemoryBarrier2 extends io.github.kartoffell.klvulkan.Element<VkImageMemoryBarrier2>{
		default VkImageMemoryBarrier2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.STYPE);
		}

		default VkImageMemoryBarrier2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier2.PNEXT);
		}

		default VkImageMemoryBarrier2 srcStageMask(long srcStageMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.SRCSTAGEMASK, srcStageMask);
			return this;
		}

		@Nullable
		default long srcStageMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.SRCSTAGEMASK);
		}

		default VkImageMemoryBarrier2 srcAccessMask(long srcAccessMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		@Nullable
		default long srcAccessMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.SRCACCESSMASK);
		}

		default VkImageMemoryBarrier2 dstStageMask(long dstStageMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.DSTSTAGEMASK, dstStageMask);
			return this;
		}

		@Nullable
		default long dstStageMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.DSTSTAGEMASK);
		}

		default VkImageMemoryBarrier2 dstAccessMask(long dstAccessMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		@Nullable
		default long dstAccessMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageMemoryBarrier2.DSTACCESSMASK);
		}

		default VkImageMemoryBarrier2 oldLayout(int oldLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.OLDLAYOUT, oldLayout);
			return this;
		}

		default int oldLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.OLDLAYOUT);
		}

		default VkImageMemoryBarrier2 newLayout(int newLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.NEWLAYOUT, newLayout);
			return this;
		}

		default int newLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.NEWLAYOUT);
		}

		default VkImageMemoryBarrier2 srcQueueFamilyIndex(int srcQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.SRCQUEUEFAMILYINDEX, srcQueueFamilyIndex);
			return this;
		}

		default int srcQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.SRCQUEUEFAMILYINDEX);
		}

		default VkImageMemoryBarrier2 dstQueueFamilyIndex(int dstQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.DSTQUEUEFAMILYINDEX, dstQueueFamilyIndex);
			return this;
		}

		default int dstQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier2.DSTQUEUEFAMILYINDEX);
		}

		default VkImageMemoryBarrier2 image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier2.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier2.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		default VkImageSubresourceRange subresourceRange(){
			final var subresourceRange_ = address().asSlice(org.lwjgl.vulkan.VkImageMemoryBarrier2.SUBRESOURCERANGE, org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF);
			return (subresourceRange_.equals(MemorySegment.NULL)?null:(VkImageSubresourceRange)()->subresourceRange_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageMemoryBarrier2 from the given Arena.
		*/
		public static VkImageMemoryBarrier2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageMemoryBarrier2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageMemoryBarrier2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageMemoryBarrier2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageMemoryBarrier2.SIZEOF, (mem)->(VkImageMemoryBarrier2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDependencyInfo.html">VkDependencyInfo</a>
	*/
	public interface VkDependencyInfo extends io.github.kartoffell.klvulkan.Element<VkDependencyInfo>{
		default VkDependencyInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.STYPE);
		}

		default VkDependencyInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PNEXT);
		}

		default VkDependencyInfo dependencyFlags(int dependencyFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.DEPENDENCYFLAGS, dependencyFlags);
			return this;
		}

		@Nullable
		default int dependencyFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.DEPENDENCYFLAGS);
		}

		default VkDependencyInfo memoryBarrierCount(int memoryBarrierCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.MEMORYBARRIERCOUNT, memoryBarrierCount);
			return this;
		}

		@Nullable
		default int memoryBarrierCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.MEMORYBARRIERCOUNT);
		}

		default VkDependencyInfo pMemoryBarriers(Element<VkMemoryBarrier2> pMemoryBarriers){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PMEMORYBARRIERS, (pMemoryBarriers==null?MemorySegment.NULL:pMemoryBarriers.address()));
			return this;
		}

		default Element<VkMemoryBarrier2> pMemoryBarriers(){
			final var pMemoryBarriers_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PMEMORYBARRIERS);
			return (pMemoryBarriers_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pMemoryBarriers_, org.lwjgl.vulkan.VkMemoryBarrier2.SIZEOF, (v836427078)->(v836427078.equals(MemorySegment.NULL)?null:(VkMemoryBarrier2)()->v836427078)));
		}

		default VkDependencyInfo bufferMemoryBarrierCount(int bufferMemoryBarrierCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT, bufferMemoryBarrierCount);
			return this;
		}

		@Nullable
		default int bufferMemoryBarrierCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT);
		}

		default VkDependencyInfo pBufferMemoryBarriers(Element<VkBufferMemoryBarrier2> pBufferMemoryBarriers){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PBUFFERMEMORYBARRIERS, (pBufferMemoryBarriers==null?MemorySegment.NULL:pBufferMemoryBarriers.address()));
			return this;
		}

		default Element<VkBufferMemoryBarrier2> pBufferMemoryBarriers(){
			final var pBufferMemoryBarriers_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PBUFFERMEMORYBARRIERS);
			return (pBufferMemoryBarriers_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pBufferMemoryBarriers_, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SIZEOF, (v1322642290)->(v1322642290.equals(MemorySegment.NULL)?null:(VkBufferMemoryBarrier2)()->v1322642290)));
		}

		default VkDependencyInfo imageMemoryBarrierCount(int imageMemoryBarrierCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT, imageMemoryBarrierCount);
			return this;
		}

		@Nullable
		default int imageMemoryBarrierCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT);
		}

		default VkDependencyInfo pImageMemoryBarriers(Element<VkImageMemoryBarrier2> pImageMemoryBarriers){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PIMAGEMEMORYBARRIERS, (pImageMemoryBarriers==null?MemorySegment.NULL:pImageMemoryBarriers.address()));
			return this;
		}

		default Element<VkImageMemoryBarrier2> pImageMemoryBarriers(){
			final var pImageMemoryBarriers_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDependencyInfo.PIMAGEMEMORYBARRIERS);
			return (pImageMemoryBarriers_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pImageMemoryBarriers_, org.lwjgl.vulkan.VkImageMemoryBarrier2.SIZEOF, (v318353283)->(v318353283.equals(MemorySegment.NULL)?null:(VkImageMemoryBarrier2)()->v318353283)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDependencyInfo from the given Arena.
		*/
		public static VkDependencyInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDependencyInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDependencyInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDependencyInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDependencyInfo.SIZEOF, (mem)->(VkDependencyInfo)()->mem);
		}

	}

	public interface VkAttachmentStoreOp extends io.github.kartoffell.klvulkan.VK10.VkAttachmentStoreOp{
		public static final int VK_ATTACHMENT_STORE_OP_NONE = 1000301000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderingAttachmentInfo.html">VkRenderingAttachmentInfo</a>
	*/
	public interface VkRenderingAttachmentInfo extends io.github.kartoffell.klvulkan.Element<VkRenderingAttachmentInfo>{
		default VkRenderingAttachmentInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.STYPE);
		}

		default VkRenderingAttachmentInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentInfo.PNEXT);
		}

		default VkRenderingAttachmentInfo imageView(Element<? extends VkImageView> imageView){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGEVIEW, (imageView==null?MemorySegment.NULL:imageView.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkImageView> imageView(){
			final var imageView_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGEVIEW);
			return (imageView_.equals(MemorySegment.NULL)?null:(Element<? extends VkImageView>)()->imageView_);
		}

		default VkRenderingAttachmentInfo imageLayout(int imageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGELAYOUT, imageLayout);
			return this;
		}

		default int imageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGELAYOUT);
		}

		default VkRenderingAttachmentInfo resolveMode(int resolveMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEMODE, resolveMode);
			return this;
		}

		@Nullable
		default int resolveMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEMODE);
		}

		default VkRenderingAttachmentInfo resolveImageView(Element<? extends VkImageView> resolveImageView){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW, (resolveImageView==null?MemorySegment.NULL:resolveImageView.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkImageView> resolveImageView(){
			final var resolveImageView_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW);
			return (resolveImageView_.equals(MemorySegment.NULL)?null:(Element<? extends VkImageView>)()->resolveImageView_);
		}

		default VkRenderingAttachmentInfo resolveImageLayout(int resolveImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT, resolveImageLayout);
			return this;
		}

		default int resolveImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT);
		}

		default VkRenderingAttachmentInfo loadOp(int loadOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.LOADOP, loadOp);
			return this;
		}

		default int loadOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.LOADOP);
		}

		default VkRenderingAttachmentInfo storeOp(int storeOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.STOREOP, storeOp);
			return this;
		}

		default int storeOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentInfo.STOREOP);
		}

		default VkClearValue clearValue(){
			final var clearValue_ = address().asSlice(org.lwjgl.vulkan.VkRenderingAttachmentInfo.CLEARVALUE, org.lwjgl.vulkan.VkClearValue.SIZEOF);
			return (clearValue_.equals(MemorySegment.NULL)?null:(VkClearValue)()->clearValue_);
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderingAttachmentInfo from the given Arena.
		*/
		public static VkRenderingAttachmentInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderingAttachmentInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderingAttachmentInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF, (mem)->(VkRenderingAttachmentInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderIntegerDotProductFeatures.html">VkPhysicalDeviceShaderIntegerDotProductFeatures</a>
	*/
	public interface VkPhysicalDeviceShaderIntegerDotProductFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderIntegerDotProductFeatures>{
		default VkPhysicalDeviceShaderIntegerDotProductFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.STYPE);
		}

		default VkPhysicalDeviceShaderIntegerDotProductFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.PNEXT);
		}

		default VkPhysicalDeviceShaderIntegerDotProductFeatures shaderIntegerDotProduct(boolean shaderIntegerDotProduct){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.SHADERINTEGERDOTPRODUCT, shaderIntegerDotProduct?1:0);
			return this;
		}

		default boolean shaderIntegerDotProduct(){
			final var shaderIntegerDotProduct_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.SHADERINTEGERDOTPRODUCT);
			return shaderIntegerDotProduct_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderIntegerDotProductFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceShaderIntegerDotProductFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderIntegerDotProductFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderIntegerDotProductFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures.SIZEOF, (mem)->(VkPhysicalDeviceShaderIntegerDotProductFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyImageInfo2.html">VkCopyImageInfo2</a>
	*/
	public interface VkCopyImageInfo2 extends io.github.kartoffell.klvulkan.Element<VkCopyImageInfo2>{
		default VkCopyImageInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.STYPE);
		}

		default VkCopyImageInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.PNEXT);
		}

		default VkCopyImageInfo2 srcImage(Element<? extends VkImage> srcImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.SRCIMAGE, (srcImage==null?MemorySegment.NULL:srcImage.address()));
			return this;
		}

		default Element<? extends VkImage> srcImage(){
			final var srcImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.SRCIMAGE);
			return (srcImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->srcImage_);
		}

		default VkCopyImageInfo2 srcImageLayout(int srcImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.SRCIMAGELAYOUT, srcImageLayout);
			return this;
		}

		default int srcImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.SRCIMAGELAYOUT);
		}

		default VkCopyImageInfo2 dstImage(Element<? extends VkImage> dstImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.DSTIMAGE, (dstImage==null?MemorySegment.NULL:dstImage.address()));
			return this;
		}

		default Element<? extends VkImage> dstImage(){
			final var dstImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.DSTIMAGE);
			return (dstImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->dstImage_);
		}

		default VkCopyImageInfo2 dstImageLayout(int dstImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.DSTIMAGELAYOUT, dstImageLayout);
			return this;
		}

		default int dstImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.DSTIMAGELAYOUT);
		}

		default VkCopyImageInfo2 regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageInfo2.REGIONCOUNT);
		}

		default VkCopyImageInfo2 pRegions(Element<VkImageCopy2> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkImageCopy2> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageInfo2.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkImageCopy2.SIZEOF, (v431570856)->(v431570856.equals(MemorySegment.NULL)?null:(VkImageCopy2)()->v431570856)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyImageInfo2 from the given Arena.
		*/
		public static VkCopyImageInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyImageInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyImageInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyImageInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyImageInfo2.SIZEOF, (mem)->(VkCopyImageInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderTerminateInvocationFeatures.html">VkPhysicalDeviceShaderTerminateInvocationFeatures</a>
	*/
	public interface VkPhysicalDeviceShaderTerminateInvocationFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderTerminateInvocationFeatures>{
		default VkPhysicalDeviceShaderTerminateInvocationFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.STYPE);
		}

		default VkPhysicalDeviceShaderTerminateInvocationFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.PNEXT);
		}

		default VkPhysicalDeviceShaderTerminateInvocationFeatures shaderTerminateInvocation(boolean shaderTerminateInvocation){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.SHADERTERMINATEINVOCATION, shaderTerminateInvocation?1:0);
			return this;
		}

		default boolean shaderTerminateInvocation(){
			final var shaderTerminateInvocation_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.SHADERTERMINATEINVOCATION);
			return shaderTerminateInvocation_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderTerminateInvocationFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceShaderTerminateInvocationFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderTerminateInvocationFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderTerminateInvocationFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.SIZEOF, (mem)->(VkPhysicalDeviceShaderTerminateInvocationFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.html">VkPipelineShaderStageRequiredSubgroupSizeCreateInfo</a>
	*/
	public interface VkPipelineShaderStageRequiredSubgroupSizeCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineShaderStageRequiredSubgroupSizeCreateInfo>{
		default VkPipelineShaderStageRequiredSubgroupSizeCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.STYPE);
		}

		default VkPipelineShaderStageRequiredSubgroupSizeCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.PNEXT);
		}

		default VkPipelineShaderStageRequiredSubgroupSizeCreateInfo requiredSubgroupSize(int requiredSubgroupSize){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.REQUIREDSUBGROUPSIZE, requiredSubgroupSize);
			return this;
		}

		default int requiredSubgroupSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.REQUIREDSUBGROUPSIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo from the given Arena.
		*/
		public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineShaderStageRequiredSubgroupSizeCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineShaderStageRequiredSubgroupSizeCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.SIZEOF, (mem)->(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubmitInfo2.html">VkSubmitInfo2</a>
	*/
	public interface VkSubmitInfo2 extends io.github.kartoffell.klvulkan.Element<VkSubmitInfo2>{
		default VkSubmitInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.STYPE);
		}

		default VkSubmitInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PNEXT);
		}

		default VkSubmitInfo2 flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.FLAGS);
		}

		default VkSubmitInfo2 waitSemaphoreInfoCount(int waitSemaphoreInfoCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.WAITSEMAPHOREINFOCOUNT, waitSemaphoreInfoCount);
			return this;
		}

		@Nullable
		default int waitSemaphoreInfoCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.WAITSEMAPHOREINFOCOUNT);
		}

		default VkSubmitInfo2 pWaitSemaphoreInfos(Element<VkSemaphoreSubmitInfo> pWaitSemaphoreInfos){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PWAITSEMAPHOREINFOS, (pWaitSemaphoreInfos==null?MemorySegment.NULL:pWaitSemaphoreInfos.address()));
			return this;
		}

		default Element<VkSemaphoreSubmitInfo> pWaitSemaphoreInfos(){
			final var pWaitSemaphoreInfos_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PWAITSEMAPHOREINFOS);
			return (pWaitSemaphoreInfos_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pWaitSemaphoreInfos_, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.SIZEOF, (v2121199924)->(v2121199924.equals(MemorySegment.NULL)?null:(VkSemaphoreSubmitInfo)()->v2121199924)));
		}

		default VkSubmitInfo2 commandBufferInfoCount(int commandBufferInfoCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.COMMANDBUFFERINFOCOUNT, commandBufferInfoCount);
			return this;
		}

		@Nullable
		default int commandBufferInfoCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.COMMANDBUFFERINFOCOUNT);
		}

		default VkSubmitInfo2 pCommandBufferInfos(Element<VkCommandBufferSubmitInfo> pCommandBufferInfos){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PCOMMANDBUFFERINFOS, (pCommandBufferInfos==null?MemorySegment.NULL:pCommandBufferInfos.address()));
			return this;
		}

		default Element<VkCommandBufferSubmitInfo> pCommandBufferInfos(){
			final var pCommandBufferInfos_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PCOMMANDBUFFERINFOS);
			return (pCommandBufferInfos_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pCommandBufferInfos_, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.SIZEOF, (v520162288)->(v520162288.equals(MemorySegment.NULL)?null:(VkCommandBufferSubmitInfo)()->v520162288)));
		}

		default VkSubmitInfo2 signalSemaphoreInfoCount(int signalSemaphoreInfoCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.SIGNALSEMAPHOREINFOCOUNT, signalSemaphoreInfoCount);
			return this;
		}

		@Nullable
		default int signalSemaphoreInfoCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo2.SIGNALSEMAPHOREINFOCOUNT);
		}

		default VkSubmitInfo2 pSignalSemaphoreInfos(Element<VkSemaphoreSubmitInfo> pSignalSemaphoreInfos){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PSIGNALSEMAPHOREINFOS, (pSignalSemaphoreInfos==null?MemorySegment.NULL:pSignalSemaphoreInfos.address()));
			return this;
		}

		default Element<VkSemaphoreSubmitInfo> pSignalSemaphoreInfos(){
			final var pSignalSemaphoreInfos_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo2.PSIGNALSEMAPHOREINFOS);
			return (pSignalSemaphoreInfos_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pSignalSemaphoreInfos_, org.lwjgl.vulkan.VkSemaphoreSubmitInfo.SIZEOF, (v1088104996)->(v1088104996.equals(MemorySegment.NULL)?null:(VkSemaphoreSubmitInfo)()->v1088104996)));
		}

		MemorySegment address();

		/**
		Allocates a new VkSubmitInfo2 from the given Arena.
		*/
		public static VkSubmitInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubmitInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubmitInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubmitInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubmitInfo2.SIZEOF, (mem)->(VkSubmitInfo2)()->mem);
		}

	}

	public interface VkImageAspectFlagBits extends io.github.kartoffell.klvulkan.VK11.VkImageAspectFlagBits{
		public static final int VK_IMAGE_ASPECT_NONE = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyImageToBufferInfo2.html">VkCopyImageToBufferInfo2</a>
	*/
	public interface VkCopyImageToBufferInfo2 extends io.github.kartoffell.klvulkan.Element<VkCopyImageToBufferInfo2>{
		default VkCopyImageToBufferInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.STYPE);
		}

		default VkCopyImageToBufferInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.PNEXT);
		}

		default VkCopyImageToBufferInfo2 srcImage(Element<? extends VkImage> srcImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.SRCIMAGE, (srcImage==null?MemorySegment.NULL:srcImage.address()));
			return this;
		}

		default Element<? extends VkImage> srcImage(){
			final var srcImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.SRCIMAGE);
			return (srcImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->srcImage_);
		}

		default VkCopyImageToBufferInfo2 srcImageLayout(int srcImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.SRCIMAGELAYOUT, srcImageLayout);
			return this;
		}

		default int srcImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.SRCIMAGELAYOUT);
		}

		default VkCopyImageToBufferInfo2 dstBuffer(Element<? extends VkBuffer> dstBuffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.DSTBUFFER, (dstBuffer==null?MemorySegment.NULL:dstBuffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> dstBuffer(){
			final var dstBuffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.DSTBUFFER);
			return (dstBuffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->dstBuffer_);
		}

		default VkCopyImageToBufferInfo2 regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.REGIONCOUNT);
		}

		default VkCopyImageToBufferInfo2 pRegions(Element<VkBufferImageCopy2> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkBufferImageCopy2> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF, (v282003944)->(v282003944.equals(MemorySegment.NULL)?null:(VkBufferImageCopy2)()->v282003944)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyImageToBufferInfo2 from the given Arena.
		*/
		public static VkCopyImageToBufferInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyImageToBufferInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyImageToBufferInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyImageToBufferInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyImageToBufferInfo2.SIZEOF, (mem)->(VkCopyImageToBufferInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSubgroupSizeControlFeatures.html">VkPhysicalDeviceSubgroupSizeControlFeatures</a>
	*/
	public interface VkPhysicalDeviceSubgroupSizeControlFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceSubgroupSizeControlFeatures>{
		default VkPhysicalDeviceSubgroupSizeControlFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.STYPE);
		}

		default VkPhysicalDeviceSubgroupSizeControlFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.PNEXT);
		}

		default VkPhysicalDeviceSubgroupSizeControlFeatures subgroupSizeControl(boolean subgroupSizeControl){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.SUBGROUPSIZECONTROL, subgroupSizeControl?1:0);
			return this;
		}

		default boolean subgroupSizeControl(){
			final var subgroupSizeControl_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.SUBGROUPSIZECONTROL);
			return subgroupSizeControl_!=0;
		}

		default VkPhysicalDeviceSubgroupSizeControlFeatures computeFullSubgroups(boolean computeFullSubgroups){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.COMPUTEFULLSUBGROUPS, computeFullSubgroups?1:0);
			return this;
		}

		default boolean computeFullSubgroups(){
			final var computeFullSubgroups_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.COMPUTEFULLSUBGROUPS);
			return computeFullSubgroups_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceSubgroupSizeControlFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceSubgroupSizeControlFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceSubgroupSizeControlFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceSubgroupSizeControlFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.SIZEOF, (mem)->(VkPhysicalDeviceSubgroupSizeControlFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDevicePrivateDataCreateInfo.html">VkDevicePrivateDataCreateInfo</a>
	*/
	public interface VkDevicePrivateDataCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDevicePrivateDataCreateInfo>{
		default VkDevicePrivateDataCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.STYPE);
		}

		default VkDevicePrivateDataCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.PNEXT);
		}

		default VkDevicePrivateDataCreateInfo privateDataSlotRequestCount(int privateDataSlotRequestCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.PRIVATEDATASLOTREQUESTCOUNT, privateDataSlotRequestCount);
			return this;
		}

		default int privateDataSlotRequestCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.PRIVATEDATASLOTREQUESTCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkDevicePrivateDataCreateInfo from the given Arena.
		*/
		public static VkDevicePrivateDataCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDevicePrivateDataCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDevicePrivateDataCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.SIZEOF, (mem)->(VkDevicePrivateDataCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSubgroupSizeControlProperties.html">VkPhysicalDeviceSubgroupSizeControlProperties</a>
	*/
	public interface VkPhysicalDeviceSubgroupSizeControlProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceSubgroupSizeControlProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.PNEXT);
		}

		/**
		The minimum subgroup size supported by this device
		*/
		default int minSubgroupSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.MINSUBGROUPSIZE);
		}

		/**
		The maximum subgroup size supported by this device
		*/
		default int maxSubgroupSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.MAXSUBGROUPSIZE);
		}

		/**
		The maximum number of subgroups supported in a workgroup
		*/
		default int maxComputeWorkgroupSubgroups(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.MAXCOMPUTEWORKGROUPSUBGROUPS);
		}

		/**
		The shader stages that support specifying a subgroup size
		*/
		default int requiredSubgroupSizeStages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.REQUIREDSUBGROUPSIZESTAGES);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceSubgroupSizeControlProperties from the given Arena.
		*/
		public static VkPhysicalDeviceSubgroupSizeControlProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceSubgroupSizeControlProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceSubgroupSizeControlProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties.SIZEOF, (mem)->(VkPhysicalDeviceSubgroupSizeControlProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan13Properties.html">VkPhysicalDeviceVulkan13Properties</a>
	*/
	public interface VkPhysicalDeviceVulkan13Properties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan13Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.PNEXT);
		}

		/**
		The minimum subgroup size supported by this device
		*/
		default int minSubgroupSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MINSUBGROUPSIZE);
		}

		/**
		The maximum subgroup size supported by this device
		*/
		default int maxSubgroupSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXSUBGROUPSIZE);
		}

		/**
		The maximum number of subgroups supported in a workgroup
		*/
		default int maxComputeWorkgroupSubgroups(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXCOMPUTEWORKGROUPSUBGROUPS);
		}

		/**
		The shader stages that support specifying a subgroup size
		*/
		default int requiredSubgroupSizeStages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.REQUIREDSUBGROUPSIZESTAGES);
		}

		default int maxInlineUniformBlockSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXINLINEUNIFORMBLOCKSIZE);
		}

		default int maxPerStageDescriptorInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS);
		}

		default int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS);
		}

		default int maxDescriptorSetInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXDESCRIPTORSETINLINEUNIFORMBLOCKS);
		}

		default int maxDescriptorSetUpdateAfterBindInlineUniformBlocks(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS);
		}

		default int maxInlineUniformTotalSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXINLINEUNIFORMTOTALSIZE);
		}

		default boolean integerDotProduct8BitUnsignedAccelerated(){
			final var integerDotProduct8BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED);
			return integerDotProduct8BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct8BitSignedAccelerated(){
			final var integerDotProduct8BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED);
			return integerDotProduct8BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct8BitMixedSignednessAccelerated(){
			final var integerDotProduct8BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct8BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct4x8BitPackedUnsignedAccelerated(){
			final var integerDotProduct4x8BitPackedUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED);
			return integerDotProduct4x8BitPackedUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct4x8BitPackedSignedAccelerated(){
			final var integerDotProduct4x8BitPackedSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED);
			return integerDotProduct4x8BitPackedSignedAccelerated_!=0;
		}

		default boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated(){
			final var integerDotProduct4x8BitPackedMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct4x8BitPackedMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct16BitUnsignedAccelerated(){
			final var integerDotProduct16BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED);
			return integerDotProduct16BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct16BitSignedAccelerated(){
			final var integerDotProduct16BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED);
			return integerDotProduct16BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct16BitMixedSignednessAccelerated(){
			final var integerDotProduct16BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct16BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct32BitUnsignedAccelerated(){
			final var integerDotProduct32BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED);
			return integerDotProduct32BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct32BitSignedAccelerated(){
			final var integerDotProduct32BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED);
			return integerDotProduct32BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct32BitMixedSignednessAccelerated(){
			final var integerDotProduct32BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct32BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProduct64BitUnsignedAccelerated(){
			final var integerDotProduct64BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED);
			return integerDotProduct64BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProduct64BitSignedAccelerated(){
			final var integerDotProduct64BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED);
			return integerDotProduct64BitSignedAccelerated_!=0;
		}

		default boolean integerDotProduct64BitMixedSignednessAccelerated(){
			final var integerDotProduct64BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProduct64BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating8BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating8BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating8BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating8BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating16BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating16BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating16BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating16BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating32BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating32BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating32BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating32BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(){
			final var integerDotProductAccumulatingSaturating64BitUnsignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating64BitUnsignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated(){
			final var integerDotProductAccumulatingSaturating64BitSignedAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED);
			return integerDotProductAccumulatingSaturating64BitSignedAccelerated_!=0;
		}

		default boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(){
			final var integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED);
			return integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated_!=0;
		}

		default long storageTexelBufferOffsetAlignmentBytes(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.STORAGETEXELBUFFEROFFSETALIGNMENTBYTES);
		}

		default boolean storageTexelBufferOffsetSingleTexelAlignment(){
			final var storageTexelBufferOffsetSingleTexelAlignment_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT);
			return storageTexelBufferOffsetSingleTexelAlignment_!=0;
		}

		default long uniformTexelBufferOffsetAlignmentBytes(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES);
		}

		default boolean uniformTexelBufferOffsetSingleTexelAlignment(){
			final var uniformTexelBufferOffsetSingleTexelAlignment_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT);
			return uniformTexelBufferOffsetSingleTexelAlignment_!=0;
		}

		default long maxBufferSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.MAXBUFFERSIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan13Properties from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan13Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan13Properties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan13Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties.SIZEOF, (mem)->(VkPhysicalDeviceVulkan13Properties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferMemoryBarrier2.html">VkBufferMemoryBarrier2</a>
	*/
	public interface VkBufferMemoryBarrier2 extends io.github.kartoffell.klvulkan.Element<VkBufferMemoryBarrier2>{
		default VkBufferMemoryBarrier2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier2.STYPE);
		}

		default VkBufferMemoryBarrier2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier2.PNEXT);
		}

		default VkBufferMemoryBarrier2 srcStageMask(long srcStageMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SRCSTAGEMASK, srcStageMask);
			return this;
		}

		@Nullable
		default long srcStageMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SRCSTAGEMASK);
		}

		default VkBufferMemoryBarrier2 srcAccessMask(long srcAccessMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		@Nullable
		default long srcAccessMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SRCACCESSMASK);
		}

		default VkBufferMemoryBarrier2 dstStageMask(long dstStageMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.DSTSTAGEMASK, dstStageMask);
			return this;
		}

		@Nullable
		default long dstStageMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.DSTSTAGEMASK);
		}

		default VkBufferMemoryBarrier2 dstAccessMask(long dstAccessMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		@Nullable
		default long dstAccessMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.DSTACCESSMASK);
		}

		default VkBufferMemoryBarrier2 srcQueueFamilyIndex(int srcQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SRCQUEUEFAMILYINDEX, srcQueueFamilyIndex);
			return this;
		}

		default int srcQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SRCQUEUEFAMILYINDEX);
		}

		default VkBufferMemoryBarrier2 dstQueueFamilyIndex(int dstQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier2.DSTQUEUEFAMILYINDEX, dstQueueFamilyIndex);
			return this;
		}

		default int dstQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier2.DSTQUEUEFAMILYINDEX);
		}

		default VkBufferMemoryBarrier2 buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier2.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier2.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		default VkBufferMemoryBarrier2 offset(long offset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.OFFSET, offset);
			return this;
		}

		default long offset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.OFFSET);
		}

		default VkBufferMemoryBarrier2 size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SIZE, size);
			return this;
		}

		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferMemoryBarrier2 from the given Arena.
		*/
		public static VkBufferMemoryBarrier2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferMemoryBarrier2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferMemoryBarrier2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferMemoryBarrier2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferMemoryBarrier2.SIZEOF, (mem)->(VkBufferMemoryBarrier2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferCopy2.html">VkBufferCopy2</a>
	*/
	public interface VkBufferCopy2 extends io.github.kartoffell.klvulkan.Element<VkBufferCopy2>{
		default VkBufferCopy2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCopy2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCopy2.STYPE);
		}

		default VkBufferCopy2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferCopy2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferCopy2.PNEXT);
		}

		/**
		Specified in bytes
		*/
		default VkBufferCopy2 srcOffset(long srcOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy2.SRCOFFSET, srcOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long srcOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy2.SRCOFFSET);
		}

		/**
		Specified in bytes
		*/
		default VkBufferCopy2 dstOffset(long dstOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy2.DSTOFFSET, dstOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long dstOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy2.DSTOFFSET);
		}

		/**
		Specified in bytes
		*/
		default VkBufferCopy2 size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy2.SIZE, size);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy2.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferCopy2 from the given Arena.
		*/
		public static VkBufferCopy2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferCopy2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferCopy2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferCopy2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferCopy2.SIZEOF, (mem)->(VkBufferCopy2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSynchronization2Features.html">VkPhysicalDeviceSynchronization2Features</a>
	*/
	public interface VkPhysicalDeviceSynchronization2Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceSynchronization2Features>{
		default VkPhysicalDeviceSynchronization2Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.STYPE);
		}

		default VkPhysicalDeviceSynchronization2Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.PNEXT);
		}

		default VkPhysicalDeviceSynchronization2Features synchronization2(boolean synchronization2){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.SYNCHRONIZATION2, synchronization2?1:0);
			return this;
		}

		default boolean synchronization2(){
			final var synchronization2_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.SYNCHRONIZATION2);
			return synchronization2_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceSynchronization2Features from the given Arena.
		*/
		public static VkPhysicalDeviceSynchronization2Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceSynchronization2Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceSynchronization2Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.SIZEOF, (mem)->(VkPhysicalDeviceSynchronization2Features)()->mem);
		}

	}

	public interface VkObjectType extends io.github.kartoffell.klvulkan.VK11.VkObjectType{
		public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT = 1000295000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMaintenance4Properties.html">VkPhysicalDeviceMaintenance4Properties</a>
	*/
	public interface VkPhysicalDeviceMaintenance4Properties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceMaintenance4Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.PNEXT);
		}

		default long maxBufferSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.MAXBUFFERSIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceMaintenance4Properties from the given Arena.
		*/
		public static VkPhysicalDeviceMaintenance4Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceMaintenance4Properties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceMaintenance4Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.SIZEOF, (mem)->(VkPhysicalDeviceMaintenance4Properties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan13Features.html">VkPhysicalDeviceVulkan13Features</a>
	*/
	public interface VkPhysicalDeviceVulkan13Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan13Features>{
		default VkPhysicalDeviceVulkan13Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.STYPE);
		}

		default VkPhysicalDeviceVulkan13Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.PNEXT);
		}

		default VkPhysicalDeviceVulkan13Features robustImageAccess(boolean robustImageAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.ROBUSTIMAGEACCESS, robustImageAccess?1:0);
			return this;
		}

		default boolean robustImageAccess(){
			final var robustImageAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.ROBUSTIMAGEACCESS);
			return robustImageAccess_!=0;
		}

		default VkPhysicalDeviceVulkan13Features inlineUniformBlock(boolean inlineUniformBlock){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.INLINEUNIFORMBLOCK, inlineUniformBlock?1:0);
			return this;
		}

		default boolean inlineUniformBlock(){
			final var inlineUniformBlock_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.INLINEUNIFORMBLOCK);
			return inlineUniformBlock_!=0;
		}

		default VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(boolean descriptorBindingInlineUniformBlockUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND, descriptorBindingInlineUniformBlockUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingInlineUniformBlockUpdateAfterBind(){
			final var descriptorBindingInlineUniformBlockUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND);
			return descriptorBindingInlineUniformBlockUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(boolean pipelineCreationCacheControl){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.PIPELINECREATIONCACHECONTROL, pipelineCreationCacheControl?1:0);
			return this;
		}

		default boolean pipelineCreationCacheControl(){
			final var pipelineCreationCacheControl_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.PIPELINECREATIONCACHECONTROL);
			return pipelineCreationCacheControl_!=0;
		}

		default VkPhysicalDeviceVulkan13Features privateData(boolean privateData){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.PRIVATEDATA, privateData?1:0);
			return this;
		}

		default boolean privateData(){
			final var privateData_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.PRIVATEDATA);
			return privateData_!=0;
		}

		default VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(boolean shaderDemoteToHelperInvocation){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERDEMOTETOHELPERINVOCATION, shaderDemoteToHelperInvocation?1:0);
			return this;
		}

		default boolean shaderDemoteToHelperInvocation(){
			final var shaderDemoteToHelperInvocation_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERDEMOTETOHELPERINVOCATION);
			return shaderDemoteToHelperInvocation_!=0;
		}

		default VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(boolean shaderTerminateInvocation){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERTERMINATEINVOCATION, shaderTerminateInvocation?1:0);
			return this;
		}

		default boolean shaderTerminateInvocation(){
			final var shaderTerminateInvocation_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERTERMINATEINVOCATION);
			return shaderTerminateInvocation_!=0;
		}

		default VkPhysicalDeviceVulkan13Features subgroupSizeControl(boolean subgroupSizeControl){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SUBGROUPSIZECONTROL, subgroupSizeControl?1:0);
			return this;
		}

		default boolean subgroupSizeControl(){
			final var subgroupSizeControl_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SUBGROUPSIZECONTROL);
			return subgroupSizeControl_!=0;
		}

		default VkPhysicalDeviceVulkan13Features computeFullSubgroups(boolean computeFullSubgroups){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.COMPUTEFULLSUBGROUPS, computeFullSubgroups?1:0);
			return this;
		}

		default boolean computeFullSubgroups(){
			final var computeFullSubgroups_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.COMPUTEFULLSUBGROUPS);
			return computeFullSubgroups_!=0;
		}

		default VkPhysicalDeviceVulkan13Features synchronization2(boolean synchronization2){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SYNCHRONIZATION2, synchronization2?1:0);
			return this;
		}

		default boolean synchronization2(){
			final var synchronization2_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SYNCHRONIZATION2);
			return synchronization2_!=0;
		}

		default VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(boolean textureCompressionASTC_HDR){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.TEXTURECOMPRESSIONASTC_HDR, textureCompressionASTC_HDR?1:0);
			return this;
		}

		default boolean textureCompressionASTC_HDR(){
			final var textureCompressionASTC_HDR_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.TEXTURECOMPRESSIONASTC_HDR);
			return textureCompressionASTC_HDR_!=0;
		}

		default VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(boolean shaderZeroInitializeWorkgroupMemory){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERZEROINITIALIZEWORKGROUPMEMORY, shaderZeroInitializeWorkgroupMemory?1:0);
			return this;
		}

		default boolean shaderZeroInitializeWorkgroupMemory(){
			final var shaderZeroInitializeWorkgroupMemory_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERZEROINITIALIZEWORKGROUPMEMORY);
			return shaderZeroInitializeWorkgroupMemory_!=0;
		}

		default VkPhysicalDeviceVulkan13Features dynamicRendering(boolean dynamicRendering){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.DYNAMICRENDERING, dynamicRendering?1:0);
			return this;
		}

		default boolean dynamicRendering(){
			final var dynamicRendering_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.DYNAMICRENDERING);
			return dynamicRendering_!=0;
		}

		default VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(boolean shaderIntegerDotProduct){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERINTEGERDOTPRODUCT, shaderIntegerDotProduct?1:0);
			return this;
		}

		default boolean shaderIntegerDotProduct(){
			final var shaderIntegerDotProduct_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SHADERINTEGERDOTPRODUCT);
			return shaderIntegerDotProduct_!=0;
		}

		default VkPhysicalDeviceVulkan13Features maintenance4(boolean maintenance4){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.MAINTENANCE4, maintenance4?1:0);
			return this;
		}

		default boolean maintenance4(){
			final var maintenance4_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.MAINTENANCE4);
			return maintenance4_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan13Features from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan13Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan13Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan13Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features.SIZEOF, (mem)->(VkPhysicalDeviceVulkan13Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMaintenance4Features.html">VkPhysicalDeviceMaintenance4Features</a>
	*/
	public interface VkPhysicalDeviceMaintenance4Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceMaintenance4Features>{
		default VkPhysicalDeviceMaintenance4Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.STYPE);
		}

		default VkPhysicalDeviceMaintenance4Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.PNEXT);
		}

		default VkPhysicalDeviceMaintenance4Features maintenance4(boolean maintenance4){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.MAINTENANCE4, maintenance4?1:0);
			return this;
		}

		default boolean maintenance4(){
			final var maintenance4_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.MAINTENANCE4);
			return maintenance4_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceMaintenance4Features from the given Arena.
		*/
		public static VkPhysicalDeviceMaintenance4Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceMaintenance4Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceMaintenance4Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.SIZEOF, (mem)->(VkPhysicalDeviceMaintenance4Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceTextureCompressionASTCHDRFeatures.html">VkPhysicalDeviceTextureCompressionASTCHDRFeatures</a>
	*/
	public interface VkPhysicalDeviceTextureCompressionASTCHDRFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceTextureCompressionASTCHDRFeatures>{
		default VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.STYPE);
		}

		default VkPhysicalDeviceTextureCompressionASTCHDRFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.PNEXT);
		}

		default VkPhysicalDeviceTextureCompressionASTCHDRFeatures textureCompressionASTC_HDR(boolean textureCompressionASTC_HDR){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.TEXTURECOMPRESSIONASTC_HDR, textureCompressionASTC_HDR?1:0);
			return this;
		}

		default boolean textureCompressionASTC_HDR(){
			final var textureCompressionASTC_HDR_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.TEXTURECOMPRESSIONASTC_HDR);
			return textureCompressionASTC_HDR_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceTextureCompressionASTCHDRFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceTextureCompressionASTCHDRFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceTextureCompressionASTCHDRFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.SIZEOF, (mem)->(VkPhysicalDeviceTextureCompressionASTCHDRFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFormatProperties3.html">VkFormatProperties3</a>
	*/
	public interface VkFormatProperties3 extends io.github.kartoffell.klvulkan.Element<VkFormatProperties3>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFormatProperties3.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFormatProperties3.PNEXT);
		}

		@Nullable
		default long linearTilingFeatures(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkFormatProperties3.LINEARTILINGFEATURES);
		}

		@Nullable
		default long optimalTilingFeatures(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkFormatProperties3.OPTIMALTILINGFEATURES);
		}

		@Nullable
		default long bufferFeatures(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkFormatProperties3.BUFFERFEATURES);
		}

		MemorySegment address();

		/**
		Allocates a new VkFormatProperties3 from the given Arena.
		*/
		public static VkFormatProperties3 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkFormatProperties3.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkFormatProperties3 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkFormatProperties3> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkFormatProperties3.SIZEOF, (mem)->(VkFormatProperties3)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceImageRobustnessFeatures.html">VkPhysicalDeviceImageRobustnessFeatures</a>
	*/
	public interface VkPhysicalDeviceImageRobustnessFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceImageRobustnessFeatures>{
		default VkPhysicalDeviceImageRobustnessFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.STYPE);
		}

		default VkPhysicalDeviceImageRobustnessFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.PNEXT);
		}

		default VkPhysicalDeviceImageRobustnessFeatures robustImageAccess(boolean robustImageAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.ROBUSTIMAGEACCESS, robustImageAccess?1:0);
			return this;
		}

		default boolean robustImageAccess(){
			final var robustImageAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.ROBUSTIMAGEACCESS);
			return robustImageAccess_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceImageRobustnessFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceImageRobustnessFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceImageRobustnessFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceImageRobustnessFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.SIZEOF, (mem)->(VkPhysicalDeviceImageRobustnessFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevicePrivateDataFeatures.html">VkPhysicalDevicePrivateDataFeatures</a>
	*/
	public interface VkPhysicalDevicePrivateDataFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDevicePrivateDataFeatures>{
		default VkPhysicalDevicePrivateDataFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.STYPE);
		}

		default VkPhysicalDevicePrivateDataFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.PNEXT);
		}

		default VkPhysicalDevicePrivateDataFeatures privateData(boolean privateData){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.PRIVATEDATA, privateData?1:0);
			return this;
		}

		default boolean privateData(){
			final var privateData_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.PRIVATEDATA);
			return privateData_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDevicePrivateDataFeatures from the given Arena.
		*/
		public static VkPhysicalDevicePrivateDataFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDevicePrivateDataFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDevicePrivateDataFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.SIZEOF, (mem)->(VkPhysicalDevicePrivateDataFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceTexelBufferAlignmentProperties.html">VkPhysicalDeviceTexelBufferAlignmentProperties</a>
	*/
	public interface VkPhysicalDeviceTexelBufferAlignmentProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceTexelBufferAlignmentProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.PNEXT);
		}

		default long storageTexelBufferOffsetAlignmentBytes(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.STORAGETEXELBUFFEROFFSETALIGNMENTBYTES);
		}

		default boolean storageTexelBufferOffsetSingleTexelAlignment(){
			final var storageTexelBufferOffsetSingleTexelAlignment_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT);
			return storageTexelBufferOffsetSingleTexelAlignment_!=0;
		}

		default long uniformTexelBufferOffsetAlignmentBytes(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES);
		}

		default boolean uniformTexelBufferOffsetSingleTexelAlignment(){
			final var uniformTexelBufferOffsetSingleTexelAlignment_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT);
			return uniformTexelBufferOffsetSingleTexelAlignment_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceTexelBufferAlignmentProperties from the given Arena.
		*/
		public static VkPhysicalDeviceTexelBufferAlignmentProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceTexelBufferAlignmentProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceTexelBufferAlignmentProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties.SIZEOF, (mem)->(VkPhysicalDeviceTexelBufferAlignmentProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineRenderingCreateInfo.html">VkPipelineRenderingCreateInfo</a>
	*/
	public interface VkPipelineRenderingCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineRenderingCreateInfo>{
		default VkPipelineRenderingCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.STYPE);
		}

		default VkPipelineRenderingCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.PNEXT);
		}

		default VkPipelineRenderingCreateInfo viewMask(int viewMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.VIEWMASK, viewMask);
			return this;
		}

		default int viewMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.VIEWMASK);
		}

		default VkPipelineRenderingCreateInfo colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.COLORATTACHMENTCOUNT);
		}

		default VkPipelineRenderingCreateInfo pColorAttachmentFormats(IntBuffer pColorAttachmentFormats){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.PCOLORATTACHMENTFORMATS, (pColorAttachmentFormats==null?MemorySegment.NULL:MemorySegment.ofBuffer(pColorAttachmentFormats)));
			return this;
		}

		default IntBuffer pColorAttachmentFormats(){
			final var pColorAttachmentFormats_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.PCOLORATTACHMENTFORMATS);
			return (pColorAttachmentFormats_.equals(MemorySegment.NULL)?null:pColorAttachmentFormats_.asByteBuffer().asIntBuffer());
		}

		default VkPipelineRenderingCreateInfo depthAttachmentFormat(int depthAttachmentFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.DEPTHATTACHMENTFORMAT, depthAttachmentFormat);
			return this;
		}

		default int depthAttachmentFormat(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.DEPTHATTACHMENTFORMAT);
		}

		default VkPipelineRenderingCreateInfo stencilAttachmentFormat(int stencilAttachmentFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.STENCILATTACHMENTFORMAT, stencilAttachmentFormat);
			return this;
		}

		default int stencilAttachmentFormat(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.STENCILATTACHMENTFORMAT);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineRenderingCreateInfo from the given Arena.
		*/
		public static VkPipelineRenderingCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineRenderingCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineRenderingCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.SIZEOF, (mem)->(VkPipelineRenderingCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCreationFeedbackCreateInfo.html">VkPipelineCreationFeedbackCreateInfo</a>
	*/
	public interface VkPipelineCreationFeedbackCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineCreationFeedbackCreateInfo>{
		default VkPipelineCreationFeedbackCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.STYPE);
		}

		default VkPipelineCreationFeedbackCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PNEXT);
		}

		/**
		Output pipeline creation feedback.
		*/
		default VkPipelineCreationFeedbackCreateInfo pPipelineCreationFeedback(Element<VkPipelineCreationFeedback> pPipelineCreationFeedback){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PPIPELINECREATIONFEEDBACK, (pPipelineCreationFeedback==null?MemorySegment.NULL:pPipelineCreationFeedback.address()));
			return this;
		}

		/**
		Output pipeline creation feedback.
		*/
		default Element<VkPipelineCreationFeedback> pPipelineCreationFeedback(){
			final var pPipelineCreationFeedback_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PPIPELINECREATIONFEEDBACK);
			return (pPipelineCreationFeedback_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pPipelineCreationFeedback_, org.lwjgl.vulkan.VkPipelineCreationFeedback.SIZEOF, (v421637524)->(v421637524.equals(MemorySegment.NULL)?null:(VkPipelineCreationFeedback)()->v421637524)));
		}

		default VkPipelineCreationFeedbackCreateInfo pipelineStageCreationFeedbackCount(int pipelineStageCreationFeedbackCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PIPELINESTAGECREATIONFEEDBACKCOUNT, pipelineStageCreationFeedbackCount);
			return this;
		}

		@Nullable
		default int pipelineStageCreationFeedbackCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PIPELINESTAGECREATIONFEEDBACKCOUNT);
		}

		/**
		One entry for each shader stage specified in the parent Vk*PipelineCreateInfo struct
		*/
		default VkPipelineCreationFeedbackCreateInfo pPipelineStageCreationFeedbacks(Element<VkPipelineCreationFeedback> pPipelineStageCreationFeedbacks){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PPIPELINESTAGECREATIONFEEDBACKS, (pPipelineStageCreationFeedbacks==null?MemorySegment.NULL:pPipelineStageCreationFeedbacks.address()));
			return this;
		}

		/**
		One entry for each shader stage specified in the parent Vk*PipelineCreateInfo struct
		*/
		default Element<VkPipelineCreationFeedback> pPipelineStageCreationFeedbacks(){
			final var pPipelineStageCreationFeedbacks_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.PPIPELINESTAGECREATIONFEEDBACKS);
			return (pPipelineStageCreationFeedbacks_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pPipelineStageCreationFeedbacks_, org.lwjgl.vulkan.VkPipelineCreationFeedback.SIZEOF, (v250112971)->(v250112971.equals(MemorySegment.NULL)?null:(VkPipelineCreationFeedback)()->v250112971)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineCreationFeedbackCreateInfo from the given Arena.
		*/
		public static VkPipelineCreationFeedbackCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineCreationFeedbackCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineCreationFeedbackCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.SIZEOF, (mem)->(VkPipelineCreationFeedbackCreateInfo)()->mem);
		}

	}

	public interface VkEventCreateFlagBits extends io.github.kartoffell.klvulkan.VK10.VkEventCreateFlagBits{
		public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryBarrier2.html">VkMemoryBarrier2</a>
	*/
	public interface VkMemoryBarrier2 extends io.github.kartoffell.klvulkan.Element<VkMemoryBarrier2>{
		default VkMemoryBarrier2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier2.STYPE);
		}

		default VkMemoryBarrier2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryBarrier2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryBarrier2.PNEXT);
		}

		default VkMemoryBarrier2 srcStageMask(long srcStageMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.SRCSTAGEMASK, srcStageMask);
			return this;
		}

		@Nullable
		default long srcStageMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.SRCSTAGEMASK);
		}

		default VkMemoryBarrier2 srcAccessMask(long srcAccessMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		@Nullable
		default long srcAccessMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.SRCACCESSMASK);
		}

		default VkMemoryBarrier2 dstStageMask(long dstStageMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.DSTSTAGEMASK, dstStageMask);
			return this;
		}

		@Nullable
		default long dstStageMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.DSTSTAGEMASK);
		}

		default VkMemoryBarrier2 dstAccessMask(long dstAccessMask){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		@Nullable
		default long dstAccessMask(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryBarrier2.DSTACCESSMASK);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryBarrier2 from the given Arena.
		*/
		public static VkMemoryBarrier2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryBarrier2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryBarrier2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryBarrier2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryBarrier2.SIZEOF, (mem)->(VkMemoryBarrier2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBlitImageInfo2.html">VkBlitImageInfo2</a>
	*/
	public interface VkBlitImageInfo2 extends io.github.kartoffell.klvulkan.Element<VkBlitImageInfo2>{
		default VkBlitImageInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.STYPE);
		}

		default VkBlitImageInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.PNEXT);
		}

		default VkBlitImageInfo2 srcImage(Element<? extends VkImage> srcImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.SRCIMAGE, (srcImage==null?MemorySegment.NULL:srcImage.address()));
			return this;
		}

		default Element<? extends VkImage> srcImage(){
			final var srcImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.SRCIMAGE);
			return (srcImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->srcImage_);
		}

		default VkBlitImageInfo2 srcImageLayout(int srcImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.SRCIMAGELAYOUT, srcImageLayout);
			return this;
		}

		default int srcImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.SRCIMAGELAYOUT);
		}

		default VkBlitImageInfo2 dstImage(Element<? extends VkImage> dstImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.DSTIMAGE, (dstImage==null?MemorySegment.NULL:dstImage.address()));
			return this;
		}

		default Element<? extends VkImage> dstImage(){
			final var dstImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.DSTIMAGE);
			return (dstImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->dstImage_);
		}

		default VkBlitImageInfo2 dstImageLayout(int dstImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.DSTIMAGELAYOUT, dstImageLayout);
			return this;
		}

		default int dstImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.DSTIMAGELAYOUT);
		}

		default VkBlitImageInfo2 regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.REGIONCOUNT);
		}

		default VkBlitImageInfo2 pRegions(Element<VkImageBlit2> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkImageBlit2> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBlitImageInfo2.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkImageBlit2.SIZEOF, (v393996856)->(v393996856.equals(MemorySegment.NULL)?null:(VkImageBlit2)()->v393996856)));
		}

		default VkBlitImageInfo2 filter(int filter){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.FILTER, filter);
			return this;
		}

		default int filter(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBlitImageInfo2.FILTER);
		}

		MemorySegment address();

		/**
		Allocates a new VkBlitImageInfo2 from the given Arena.
		*/
		public static VkBlitImageInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBlitImageInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBlitImageInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBlitImageInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBlitImageInfo2.SIZEOF, (mem)->(VkBlitImageInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageResolve2.html">VkImageResolve2</a>
	*/
	public interface VkImageResolve2 extends io.github.kartoffell.klvulkan.Element<VkImageResolve2>{
		default VkImageResolve2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageResolve2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageResolve2.STYPE);
		}

		default VkImageResolve2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageResolve2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageResolve2.PNEXT);
		}

		default VkImageSubresourceLayers srcSubresource(){
			final var srcSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve2.SRCSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (srcSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->srcSubresource_);
		}

		default VkOffset3D srcOffset(){
			final var srcOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve2.SRCOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (srcOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->srcOffset_);
		}

		default VkImageSubresourceLayers dstSubresource(){
			final var dstSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve2.DSTSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (dstSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->dstSubresource_);
		}

		default VkOffset3D dstOffset(){
			final var dstOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve2.DSTOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (dstOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->dstOffset_);
		}

		default VkExtent3D extent(){
			final var extent_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve2.EXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (extent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->extent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageResolve2 from the given Arena.
		*/
		public static VkImageResolve2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageResolve2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageResolve2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageResolve2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageResolve2.SIZEOF, (mem)->(VkImageResolve2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyBufferToImageInfo2.html">VkCopyBufferToImageInfo2</a>
	*/
	public interface VkCopyBufferToImageInfo2 extends io.github.kartoffell.klvulkan.Element<VkCopyBufferToImageInfo2>{
		default VkCopyBufferToImageInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.STYPE);
		}

		default VkCopyBufferToImageInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.PNEXT);
		}

		default VkCopyBufferToImageInfo2 srcBuffer(Element<? extends VkBuffer> srcBuffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.SRCBUFFER, (srcBuffer==null?MemorySegment.NULL:srcBuffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> srcBuffer(){
			final var srcBuffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.SRCBUFFER);
			return (srcBuffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->srcBuffer_);
		}

		default VkCopyBufferToImageInfo2 dstImage(Element<? extends VkImage> dstImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.DSTIMAGE, (dstImage==null?MemorySegment.NULL:dstImage.address()));
			return this;
		}

		default Element<? extends VkImage> dstImage(){
			final var dstImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.DSTIMAGE);
			return (dstImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->dstImage_);
		}

		default VkCopyBufferToImageInfo2 dstImageLayout(int dstImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.DSTIMAGELAYOUT, dstImageLayout);
			return this;
		}

		default int dstImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.DSTIMAGELAYOUT);
		}

		default VkCopyBufferToImageInfo2 regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.REGIONCOUNT);
		}

		default VkCopyBufferToImageInfo2 pRegions(Element<VkBufferImageCopy2> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkBufferImageCopy2> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF, (v2131960182)->(v2131960182.equals(MemorySegment.NULL)?null:(VkBufferImageCopy2)()->v2131960182)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyBufferToImageInfo2 from the given Arena.
		*/
		public static VkCopyBufferToImageInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyBufferToImageInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyBufferToImageInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyBufferToImageInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyBufferToImageInfo2.SIZEOF, (mem)->(VkCopyBufferToImageInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubmitFlagBits.html">VkSubmitFlagBits</a>
	*/
	public interface VkSubmitFlagBits{
		public static final int VK_SUBMIT_PROTECTED_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCreationFeedback.html">VkPipelineCreationFeedback</a>
	*/
	public interface VkPipelineCreationFeedback extends io.github.kartoffell.klvulkan.Element<VkPipelineCreationFeedback>{
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCreationFeedback.FLAGS);
		}

		default long duration(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPipelineCreationFeedback.DURATION);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineCreationFeedback from the given Arena.
		*/
		public static VkPipelineCreationFeedback allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineCreationFeedback.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineCreationFeedback from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineCreationFeedback> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineCreationFeedback.SIZEOF, (mem)->(VkPipelineCreationFeedback)()->mem);
		}

	}

	public interface VkDescriptorType extends io.github.kartoffell.klvulkan.VK10.VkDescriptorType{
		public static final int VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK = 1000138000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferSubmitInfo.html">VkCommandBufferSubmitInfo</a>
	*/
	public interface VkCommandBufferSubmitInfo extends io.github.kartoffell.klvulkan.Element<VkCommandBufferSubmitInfo>{
		default VkCommandBufferSubmitInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.STYPE);
		}

		default VkCommandBufferSubmitInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.PNEXT);
		}

		default VkCommandBufferSubmitInfo commandBuffer(Element<? extends VkCommandBuffer> commandBuffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.COMMANDBUFFER, (commandBuffer==null?MemorySegment.NULL:commandBuffer.address()));
			return this;
		}

		default Element<? extends VkCommandBuffer> commandBuffer(){
			final var commandBuffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.COMMANDBUFFER);
			return (commandBuffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkCommandBuffer>)()->commandBuffer_);
		}

		default VkCommandBufferSubmitInfo deviceMask(int deviceMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.DEVICEMASK, deviceMask);
			return this;
		}

		default int deviceMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.DEVICEMASK);
		}

		MemorySegment address();

		/**
		Allocates a new VkCommandBufferSubmitInfo from the given Arena.
		*/
		public static VkCommandBufferSubmitInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCommandBufferSubmitInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCommandBufferSubmitInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCommandBufferSubmitInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCommandBufferSubmitInfo.SIZEOF, (mem)->(VkCommandBufferSubmitInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageCopy2.html">VkImageCopy2</a>
	*/
	public interface VkImageCopy2 extends io.github.kartoffell.klvulkan.Element<VkImageCopy2>{
		default VkImageCopy2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCopy2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCopy2.STYPE);
		}

		default VkImageCopy2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageCopy2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageCopy2.PNEXT);
		}

		default VkImageSubresourceLayers srcSubresource(){
			final var srcSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy2.SRCSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (srcSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->srcSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkOffset3D srcOffset(){
			final var srcOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy2.SRCOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (srcOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->srcOffset_);
		}

		default VkImageSubresourceLayers dstSubresource(){
			final var dstSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy2.DSTSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (dstSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->dstSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkOffset3D dstOffset(){
			final var dstOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy2.DSTOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (dstOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->dstOffset_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkExtent3D extent(){
			final var extent_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy2.EXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (extent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->extent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageCopy2 from the given Arena.
		*/
		public static VkImageCopy2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageCopy2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageCopy2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageCopy2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageCopy2.SIZEOF, (mem)->(VkImageCopy2)()->mem);
		}

	}

	protected final VkCapabilitiesGlobal capabilities = new VkCapabilitiesGlobal();

	public VkCapabilitiesGlobal capabilities() {
		return capabilities;
	}

	public static void checkError(int code) {
		VK12.checkError(code);
		switch (code) {
			case 1000297000 -> throw new VK_PIPELINE_COMPILE_REQUIRED();

		}
	}

}
