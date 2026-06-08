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
Vulkan 1.4 core API interface definitions (merged)
*/
public class VK14 extends io.github.kartoffell.klvulkan.VK13{
	public interface VkIndexType extends io.github.kartoffell.klvulkan.VK10.VkIndexType{
		public static final int VK_INDEX_TYPE_UINT8 = 1000265000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineVertexInputDivisorStateCreateInfo.html">VkPipelineVertexInputDivisorStateCreateInfo</a>
	*/
	public interface VkPipelineVertexInputDivisorStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineVertexInputDivisorStateCreateInfo>{
		default VkPipelineVertexInputDivisorStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.STYPE);
		}

		default VkPipelineVertexInputDivisorStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PNEXT);
		}

		default VkPipelineVertexInputDivisorStateCreateInfo vertexBindingDivisorCount(int vertexBindingDivisorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.VERTEXBINDINGDIVISORCOUNT, vertexBindingDivisorCount);
			return this;
		}

		default int vertexBindingDivisorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.VERTEXBINDINGDIVISORCOUNT);
		}

		default VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(Element<VkVertexInputBindingDivisorDescription> pVertexBindingDivisors){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS, (pVertexBindingDivisors==null?MemorySegment.NULL:pVertexBindingDivisors.address()));
			return this;
		}

		default Element<VkVertexInputBindingDivisorDescription> pVertexBindingDivisors(){
			final var pVertexBindingDivisors_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS);
			return (pVertexBindingDivisors_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pVertexBindingDivisors_, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.SIZEOF, (v1808432653)->(v1808432653.equals(MemorySegment.NULL)?null:(VkVertexInputBindingDivisorDescription)()->v1808432653)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineVertexInputDivisorStateCreateInfo from the given Arena.
		*/
		public static VkPipelineVertexInputDivisorStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineVertexInputDivisorStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineVertexInputDivisorStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF, (mem)->(VkPipelineVertexInputDivisorStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubresourceHostMemcpySize.html">VkSubresourceHostMemcpySize</a>
	*/
	public interface VkSubresourceHostMemcpySize extends io.github.kartoffell.klvulkan.Element<VkSubresourceHostMemcpySize>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubresourceHostMemcpySize.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubresourceHostMemcpySize.PNEXT);
		}

		/**
		Specified in bytes
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceHostMemcpySize.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkSubresourceHostMemcpySize from the given Arena.
		*/
		public static VkSubresourceHostMemcpySize allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubresourceHostMemcpySize.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubresourceHostMemcpySize from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubresourceHostMemcpySize> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubresourceHostMemcpySize.SIZEOF, (mem)->(VkSubresourceHostMemcpySize)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan14Properties.html">VkPhysicalDeviceVulkan14Properties</a>
	*/
	public interface VkPhysicalDeviceVulkan14Properties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan14Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PNEXT);
		}

		default int lineSubPixelPrecisionBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.LINESUBPIXELPRECISIONBITS);
		}

		/**
		max value of vertex attribute divisor
		*/
		default int maxVertexAttribDivisor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXVERTEXATTRIBDIVISOR);
		}

		default boolean supportsNonZeroFirstInstance(){
			final var supportsNonZeroFirstInstance_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SUPPORTSNONZEROFIRSTINSTANCE);
			return supportsNonZeroFirstInstance_!=0;
		}

		default int maxPushDescriptors(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXPUSHDESCRIPTORS);
		}

		default boolean dynamicRenderingLocalReadDepthStencilAttachments(){
			final var dynamicRenderingLocalReadDepthStencilAttachments_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS);
			return dynamicRenderingLocalReadDepthStencilAttachments_!=0;
		}

		default boolean dynamicRenderingLocalReadMultisampledAttachments(){
			final var dynamicRenderingLocalReadMultisampledAttachments_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS);
			return dynamicRenderingLocalReadMultisampledAttachments_!=0;
		}

		default boolean earlyFragmentMultisampleCoverageAfterSampleCounting(){
			final var earlyFragmentMultisampleCoverageAfterSampleCounting_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING);
			return earlyFragmentMultisampleCoverageAfterSampleCounting_!=0;
		}

		default boolean earlyFragmentSampleMaskTestBeforeSampleCounting(){
			final var earlyFragmentSampleMaskTestBeforeSampleCounting_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING);
			return earlyFragmentSampleMaskTestBeforeSampleCounting_!=0;
		}

		default boolean depthStencilSwizzleOneSupport(){
			final var depthStencilSwizzleOneSupport_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEPTHSTENCILSWIZZLEONESUPPORT);
			return depthStencilSwizzleOneSupport_!=0;
		}

		default boolean polygonModePointSize(){
			final var polygonModePointSize_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.POLYGONMODEPOINTSIZE);
			return polygonModePointSize_!=0;
		}

		default boolean nonStrictSinglePixelWideLinesUseParallelogram(){
			final var nonStrictSinglePixelWideLinesUseParallelogram_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM);
			return nonStrictSinglePixelWideLinesUseParallelogram_!=0;
		}

		default boolean nonStrictWideLinesUseParallelogram(){
			final var nonStrictWideLinesUseParallelogram_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.NONSTRICTWIDELINESUSEPARALLELOGRAM);
			return nonStrictWideLinesUseParallelogram_!=0;
		}

		default boolean blockTexelViewCompatibleMultipleLayers(){
			final var blockTexelViewCompatibleMultipleLayers_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS);
			return blockTexelViewCompatibleMultipleLayers_!=0;
		}

		default int maxCombinedImageSamplerDescriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT);
		}

		default boolean fragmentShadingRateClampCombinerInputs(){
			final var fragmentShadingRateClampCombinerInputs_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS);
			return fragmentShadingRateClampCombinerInputs_!=0;
		}

		default int defaultRobustnessStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSSTORAGEBUFFERS);
		}

		default int defaultRobustnessUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSUNIFORMBUFFERS);
		}

		default int defaultRobustnessVertexInputs(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSVERTEXINPUTS);
		}

		default int defaultRobustnessImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSIMAGES);
		}

		@Nullable
		default int copySrcLayoutCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.COPYSRCLAYOUTCOUNT);
		}

		@Nullable
		default IntBuffer pCopySrcLayouts(){
			final var pCopySrcLayouts_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PCOPYSRCLAYOUTS);
			return (pCopySrcLayouts_.equals(MemorySegment.NULL)?null:pCopySrcLayouts_.asByteBuffer().asIntBuffer());
		}

		@Nullable
		default int copyDstLayoutCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.COPYDSTLAYOUTCOUNT);
		}

		@Nullable
		default IntBuffer pCopyDstLayouts(){
			final var pCopyDstLayouts_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PCOPYDSTLAYOUTS);
			return (pCopyDstLayouts_.equals(MemorySegment.NULL)?null:pCopyDstLayouts_.asByteBuffer().asIntBuffer());
		}

		@Nullable
		default ByteBuffer optimalTilingLayoutUUID(){
			final var optimalTilingLayoutUUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.OPTIMALTILINGLAYOUTUUID, 1*API_Constants.VK_UUID_SIZE);
			return (optimalTilingLayoutUUID_.equals(MemorySegment.NULL)?null:optimalTilingLayoutUUID_.asByteBuffer());
		}

		default boolean identicalMemoryTypeRequirements(){
			final var identicalMemoryTypeRequirements_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.IDENTICALMEMORYTYPEREQUIREMENTS);
			return identicalMemoryTypeRequirements_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan14Properties from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan14Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan14Properties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan14Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF, (mem)->(VkPhysicalDeviceVulkan14Properties)()->mem);
		}

	}

	public interface VkFormat extends io.github.kartoffell.klvulkan.VK13.VkFormat{
		public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16 = 1000470000;

		public static final int VK_FORMAT_A8_UNORM = 1000470001;

	}

	public interface VkImageLayout extends io.github.kartoffell.klvulkan.VK13.VkImageLayout{
		public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ = 1000232000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderExpectAssumeFeatures.html">VkPhysicalDeviceShaderExpectAssumeFeatures</a>
	*/
	public interface VkPhysicalDeviceShaderExpectAssumeFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderExpectAssumeFeatures>{
		default VkPhysicalDeviceShaderExpectAssumeFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.STYPE);
		}

		default VkPhysicalDeviceShaderExpectAssumeFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.PNEXT);
		}

		default VkPhysicalDeviceShaderExpectAssumeFeatures shaderExpectAssume(boolean shaderExpectAssume){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.SHADEREXPECTASSUME, shaderExpectAssume?1:0);
			return this;
		}

		default boolean shaderExpectAssume(){
			final var shaderExpectAssume_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.SHADEREXPECTASSUME);
			return shaderExpectAssume_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderExpectAssumeFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceShaderExpectAssumeFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderExpectAssumeFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderExpectAssumeFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.SIZEOF, (mem)->(VkPhysicalDeviceShaderExpectAssumeFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueueGlobalPriority.html">VkQueueGlobalPriority</a>
	*/
	public interface VkQueueGlobalPriority{
		public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH = 512;

		public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM = 256;

		public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW = 128;

		public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME = 1024;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryMapInfo.html">VkMemoryMapInfo</a>
	*/
	public interface VkMemoryMapInfo extends io.github.kartoffell.klvulkan.Element<VkMemoryMapInfo>{
		default VkMemoryMapInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryMapInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryMapInfo.STYPE);
		}

		default VkMemoryMapInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryMapInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryMapInfo.PNEXT);
		}

		default VkMemoryMapInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryMapInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryMapInfo.FLAGS);
		}

		default VkMemoryMapInfo memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryMapInfo.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryMapInfo.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		default VkMemoryMapInfo offset(long offset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryMapInfo.OFFSET, offset);
			return this;
		}

		default long offset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryMapInfo.OFFSET);
		}

		default VkMemoryMapInfo size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryMapInfo.SIZE, size);
			return this;
		}

		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryMapInfo.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryMapInfo from the given Arena.
		*/
		public static VkMemoryMapInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryMapInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryMapInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryMapInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryMapInfo.SIZEOF, (mem)->(VkMemoryMapInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageSubresource2.html">VkImageSubresource2</a>
	*/
	public interface VkImageSubresource2 extends io.github.kartoffell.klvulkan.Element<VkImageSubresource2>{
		default VkImageSubresource2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource2.STYPE);
		}

		default VkImageSubresource2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageSubresource2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageSubresource2.PNEXT);
		}

		default VkImageSubresource imageSubresource(){
			final var imageSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageSubresource2.IMAGESUBRESOURCE, org.lwjgl.vulkan.VkImageSubresource.SIZEOF);
			return (imageSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresource)()->imageSubresource_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageSubresource2 from the given Arena.
		*/
		public static VkImageSubresource2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageSubresource2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageSubresource2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageSubresource2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageSubresource2.SIZEOF, (mem)->(VkImageSubresource2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceGlobalPriorityQueryFeatures.html">VkPhysicalDeviceGlobalPriorityQueryFeatures</a>
	*/
	public interface VkPhysicalDeviceGlobalPriorityQueryFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceGlobalPriorityQueryFeatures>{
		default VkPhysicalDeviceGlobalPriorityQueryFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.STYPE);
		}

		default VkPhysicalDeviceGlobalPriorityQueryFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.PNEXT);
		}

		default VkPhysicalDeviceGlobalPriorityQueryFeatures globalPriorityQuery(boolean globalPriorityQuery){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.GLOBALPRIORITYQUERY, globalPriorityQuery?1:0);
			return this;
		}

		default boolean globalPriorityQuery(){
			final var globalPriorityQuery_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.GLOBALPRIORITYQUERY);
			return globalPriorityQuery_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceGlobalPriorityQueryFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceGlobalPriorityQueryFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceGlobalPriorityQueryFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceGlobalPriorityQueryFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.SIZEOF, (mem)->(VkPhysicalDeviceGlobalPriorityQueryFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceIndexTypeUint8Features.html">VkPhysicalDeviceIndexTypeUint8Features</a>
	*/
	public interface VkPhysicalDeviceIndexTypeUint8Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceIndexTypeUint8Features>{
		default VkPhysicalDeviceIndexTypeUint8Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.STYPE);
		}

		default VkPhysicalDeviceIndexTypeUint8Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.PNEXT);
		}

		default VkPhysicalDeviceIndexTypeUint8Features indexTypeUint8(boolean indexTypeUint8){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.INDEXTYPEUINT8, indexTypeUint8?1:0);
			return this;
		}

		default boolean indexTypeUint8(){
			final var indexTypeUint8_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.INDEXTYPEUINT8);
			return indexTypeUint8_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceIndexTypeUint8Features from the given Arena.
		*/
		public static VkPhysicalDeviceIndexTypeUint8Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceIndexTypeUint8Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceIndexTypeUint8Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.SIZEOF, (mem)->(VkPhysicalDeviceIndexTypeUint8Features)()->mem);
		}

	}

	public interface VkDynamicState extends io.github.kartoffell.klvulkan.VK13.VkDynamicState{
		public static final int VK_DYNAMIC_STATE_LINE_STIPPLE = 1000259000;

	}

	public interface VkPipelineCreateFlagBits extends io.github.kartoffell.klvulkan.VK13.VkPipelineCreateFlagBits{
		public static final int VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT = 134217728;

		public static final int VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT = 1073741824;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyImageToImageInfo.html">VkCopyImageToImageInfo</a>
	*/
	public interface VkCopyImageToImageInfo extends io.github.kartoffell.klvulkan.Element<VkCopyImageToImageInfo>{
		default VkCopyImageToImageInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.STYPE);
		}

		default VkCopyImageToImageInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.PNEXT);
		}

		default VkCopyImageToImageInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.FLAGS);
		}

		default VkCopyImageToImageInfo srcImage(Element<? extends VkImage> srcImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.SRCIMAGE, (srcImage==null?MemorySegment.NULL:srcImage.address()));
			return this;
		}

		default Element<? extends VkImage> srcImage(){
			final var srcImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.SRCIMAGE);
			return (srcImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->srcImage_);
		}

		default VkCopyImageToImageInfo srcImageLayout(int srcImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.SRCIMAGELAYOUT, srcImageLayout);
			return this;
		}

		default int srcImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.SRCIMAGELAYOUT);
		}

		default VkCopyImageToImageInfo dstImage(Element<? extends VkImage> dstImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.DSTIMAGE, (dstImage==null?MemorySegment.NULL:dstImage.address()));
			return this;
		}

		default Element<? extends VkImage> dstImage(){
			final var dstImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.DSTIMAGE);
			return (dstImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->dstImage_);
		}

		default VkCopyImageToImageInfo dstImageLayout(int dstImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.DSTIMAGELAYOUT, dstImageLayout);
			return this;
		}

		default int dstImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.DSTIMAGELAYOUT);
		}

		default VkCopyImageToImageInfo regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToImageInfo.REGIONCOUNT);
		}

		default VkCopyImageToImageInfo pRegions(Element<VkImageCopy2> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkImageCopy2> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToImageInfo.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkImageCopy2.SIZEOF, (v640808588)->(v640808588.equals(MemorySegment.NULL)?null:(VkImageCopy2)()->v640808588)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyImageToImageInfo from the given Arena.
		*/
		public static VkCopyImageToImageInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyImageToImageInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyImageToImageInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyImageToImageInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyImageToImageInfo.SIZEOF, (mem)->(VkCopyImageToImageInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVertexAttributeDivisorFeatures.html">VkPhysicalDeviceVertexAttributeDivisorFeatures</a>
	*/
	public interface VkPhysicalDeviceVertexAttributeDivisorFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVertexAttributeDivisorFeatures>{
		default VkPhysicalDeviceVertexAttributeDivisorFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.STYPE);
		}

		default VkPhysicalDeviceVertexAttributeDivisorFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.PNEXT);
		}

		default VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisor(boolean vertexAttributeInstanceRateDivisor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEDIVISOR, vertexAttributeInstanceRateDivisor?1:0);
			return this;
		}

		default boolean vertexAttributeInstanceRateDivisor(){
			final var vertexAttributeInstanceRateDivisor_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEDIVISOR);
			return vertexAttributeInstanceRateDivisor_!=0;
		}

		default VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisor(boolean vertexAttributeInstanceRateZeroDivisor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, vertexAttributeInstanceRateZeroDivisor?1:0);
			return this;
		}

		default boolean vertexAttributeInstanceRateZeroDivisor(){
			final var vertexAttributeInstanceRateZeroDivisor_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR);
			return vertexAttributeInstanceRateZeroDivisor_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVertexAttributeDivisorFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceVertexAttributeDivisorFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVertexAttributeDivisorFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVertexAttributeDivisorFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.SIZEOF, (mem)->(VkPhysicalDeviceVertexAttributeDivisorFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPushDescriptorSetWithTemplateInfo.html">VkPushDescriptorSetWithTemplateInfo</a>
	*/
	public interface VkPushDescriptorSetWithTemplateInfo extends io.github.kartoffell.klvulkan.Element<VkPushDescriptorSetWithTemplateInfo>{
		default VkPushDescriptorSetWithTemplateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.STYPE);
		}

		default VkPushDescriptorSetWithTemplateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.PNEXT);
		}

		default VkPushDescriptorSetWithTemplateInfo descriptorUpdateTemplate(Element<? extends VkDescriptorUpdateTemplate> descriptorUpdateTemplate){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.DESCRIPTORUPDATETEMPLATE, (descriptorUpdateTemplate==null?MemorySegment.NULL:descriptorUpdateTemplate.address()));
			return this;
		}

		default Element<? extends VkDescriptorUpdateTemplate> descriptorUpdateTemplate(){
			final var descriptorUpdateTemplate_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.DESCRIPTORUPDATETEMPLATE);
			return (descriptorUpdateTemplate_.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorUpdateTemplate>)()->descriptorUpdateTemplate_);
		}

		default VkPushDescriptorSetWithTemplateInfo layout(Element<? extends VkPipelineLayout> layout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.LAYOUT, (layout==null?MemorySegment.NULL:layout.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkPipelineLayout> layout(){
			final var layout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.LAYOUT);
			return (layout_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipelineLayout>)()->layout_);
		}

		default VkPushDescriptorSetWithTemplateInfo set(int set){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.SET, set);
			return this;
		}

		@Nullable
		default int set(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.SET);
		}

		default VkPushDescriptorSetWithTemplateInfo pData(MemorySegment pData){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.PDATA, pData);
			return this;
		}

		default MemorySegment pData(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.PDATA);
		}

		MemorySegment address();

		/**
		Allocates a new VkPushDescriptorSetWithTemplateInfo from the given Arena.
		*/
		public static VkPushDescriptorSetWithTemplateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPushDescriptorSetWithTemplateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPushDescriptorSetWithTemplateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.SIZEOF, (mem)->(VkPushDescriptorSetWithTemplateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan14Features.html">VkPhysicalDeviceVulkan14Features</a>
	*/
	public interface VkPhysicalDeviceVulkan14Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan14Features>{
		default VkPhysicalDeviceVulkan14Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STYPE);
		}

		default VkPhysicalDeviceVulkan14Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PNEXT);
		}

		default VkPhysicalDeviceVulkan14Features globalPriorityQuery(boolean globalPriorityQuery){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY, globalPriorityQuery?1:0);
			return this;
		}

		default boolean globalPriorityQuery(){
			final var globalPriorityQuery_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY);
			return globalPriorityQuery_!=0;
		}

		default VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(boolean shaderSubgroupRotate){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE, shaderSubgroupRotate?1:0);
			return this;
		}

		default boolean shaderSubgroupRotate(){
			final var shaderSubgroupRotate_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE);
			return shaderSubgroupRotate_!=0;
		}

		default VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(boolean shaderSubgroupRotateClustered){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED, shaderSubgroupRotateClustered?1:0);
			return this;
		}

		default boolean shaderSubgroupRotateClustered(){
			final var shaderSubgroupRotateClustered_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED);
			return shaderSubgroupRotateClustered_!=0;
		}

		default VkPhysicalDeviceVulkan14Features shaderFloatControls2(boolean shaderFloatControls2){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2, shaderFloatControls2?1:0);
			return this;
		}

		default boolean shaderFloatControls2(){
			final var shaderFloatControls2_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2);
			return shaderFloatControls2_!=0;
		}

		default VkPhysicalDeviceVulkan14Features shaderExpectAssume(boolean shaderExpectAssume){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME, shaderExpectAssume?1:0);
			return this;
		}

		default boolean shaderExpectAssume(){
			final var shaderExpectAssume_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME);
			return shaderExpectAssume_!=0;
		}

		default VkPhysicalDeviceVulkan14Features rectangularLines(boolean rectangularLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.RECTANGULARLINES, rectangularLines?1:0);
			return this;
		}

		default boolean rectangularLines(){
			final var rectangularLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.RECTANGULARLINES);
			return rectangularLines_!=0;
		}

		default VkPhysicalDeviceVulkan14Features bresenhamLines(boolean bresenhamLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.BRESENHAMLINES, bresenhamLines?1:0);
			return this;
		}

		default boolean bresenhamLines(){
			final var bresenhamLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.BRESENHAMLINES);
			return bresenhamLines_!=0;
		}

		default VkPhysicalDeviceVulkan14Features smoothLines(boolean smoothLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SMOOTHLINES, smoothLines?1:0);
			return this;
		}

		default boolean smoothLines(){
			final var smoothLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SMOOTHLINES);
			return smoothLines_!=0;
		}

		default VkPhysicalDeviceVulkan14Features stippledRectangularLines(boolean stippledRectangularLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES, stippledRectangularLines?1:0);
			return this;
		}

		default boolean stippledRectangularLines(){
			final var stippledRectangularLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES);
			return stippledRectangularLines_!=0;
		}

		default VkPhysicalDeviceVulkan14Features stippledBresenhamLines(boolean stippledBresenhamLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES, stippledBresenhamLines?1:0);
			return this;
		}

		default boolean stippledBresenhamLines(){
			final var stippledBresenhamLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES);
			return stippledBresenhamLines_!=0;
		}

		default VkPhysicalDeviceVulkan14Features stippledSmoothLines(boolean stippledSmoothLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES, stippledSmoothLines?1:0);
			return this;
		}

		default boolean stippledSmoothLines(){
			final var stippledSmoothLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES);
			return stippledSmoothLines_!=0;
		}

		default VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(boolean vertexAttributeInstanceRateDivisor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR, vertexAttributeInstanceRateDivisor?1:0);
			return this;
		}

		default boolean vertexAttributeInstanceRateDivisor(){
			final var vertexAttributeInstanceRateDivisor_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR);
			return vertexAttributeInstanceRateDivisor_!=0;
		}

		default VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(boolean vertexAttributeInstanceRateZeroDivisor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, vertexAttributeInstanceRateZeroDivisor?1:0);
			return this;
		}

		default boolean vertexAttributeInstanceRateZeroDivisor(){
			final var vertexAttributeInstanceRateZeroDivisor_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR);
			return vertexAttributeInstanceRateZeroDivisor_!=0;
		}

		default VkPhysicalDeviceVulkan14Features indexTypeUint8(boolean indexTypeUint8){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8, indexTypeUint8?1:0);
			return this;
		}

		default boolean indexTypeUint8(){
			final var indexTypeUint8_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8);
			return indexTypeUint8_!=0;
		}

		default VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(boolean dynamicRenderingLocalRead){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD, dynamicRenderingLocalRead?1:0);
			return this;
		}

		default boolean dynamicRenderingLocalRead(){
			final var dynamicRenderingLocalRead_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD);
			return dynamicRenderingLocalRead_!=0;
		}

		default VkPhysicalDeviceVulkan14Features maintenance5(boolean maintenance5){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE5, maintenance5?1:0);
			return this;
		}

		default boolean maintenance5(){
			final var maintenance5_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE5);
			return maintenance5_!=0;
		}

		default VkPhysicalDeviceVulkan14Features maintenance6(boolean maintenance6){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE6, maintenance6?1:0);
			return this;
		}

		default boolean maintenance6(){
			final var maintenance6_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE6);
			return maintenance6_!=0;
		}

		default VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(boolean pipelineProtectedAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS, pipelineProtectedAccess?1:0);
			return this;
		}

		default boolean pipelineProtectedAccess(){
			final var pipelineProtectedAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS);
			return pipelineProtectedAccess_!=0;
		}

		default VkPhysicalDeviceVulkan14Features pipelineRobustness(boolean pipelineRobustness){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS, pipelineRobustness?1:0);
			return this;
		}

		default boolean pipelineRobustness(){
			final var pipelineRobustness_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS);
			return pipelineRobustness_!=0;
		}

		default VkPhysicalDeviceVulkan14Features hostImageCopy(boolean hostImageCopy){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY, hostImageCopy?1:0);
			return this;
		}

		default boolean hostImageCopy(){
			final var hostImageCopy_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY);
			return hostImageCopy_!=0;
		}

		default VkPhysicalDeviceVulkan14Features pushDescriptor(boolean pushDescriptor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR, pushDescriptor?1:0);
			return this;
		}

		default boolean pushDescriptor(){
			final var pushDescriptor_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR);
			return pushDescriptor_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan14Features from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan14Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan14Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan14Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF, (mem)->(VkPhysicalDeviceVulkan14Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceHostImageCopyProperties.html">VkPhysicalDeviceHostImageCopyProperties</a>
	*/
	public interface VkPhysicalDeviceHostImageCopyProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceHostImageCopyProperties>{
		default VkPhysicalDeviceHostImageCopyProperties sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.STYPE);
		}

		default VkPhysicalDeviceHostImageCopyProperties pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.PNEXT);
		}

		default VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCount(int copySrcLayoutCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.COPYSRCLAYOUTCOUNT, copySrcLayoutCount);
			return this;
		}

		@Nullable
		default int copySrcLayoutCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.COPYSRCLAYOUTCOUNT);
		}

		default VkPhysicalDeviceHostImageCopyProperties pCopySrcLayouts(IntBuffer pCopySrcLayouts){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.PCOPYSRCLAYOUTS, (pCopySrcLayouts==null?MemorySegment.NULL:MemorySegment.ofBuffer(pCopySrcLayouts)));
			return this;
		}

		@Nullable
		default IntBuffer pCopySrcLayouts(){
			final var pCopySrcLayouts_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.PCOPYSRCLAYOUTS);
			return (pCopySrcLayouts_.equals(MemorySegment.NULL)?null:pCopySrcLayouts_.asByteBuffer().asIntBuffer());
		}

		default VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCount(int copyDstLayoutCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.COPYDSTLAYOUTCOUNT, copyDstLayoutCount);
			return this;
		}

		@Nullable
		default int copyDstLayoutCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.COPYDSTLAYOUTCOUNT);
		}

		default VkPhysicalDeviceHostImageCopyProperties pCopyDstLayouts(IntBuffer pCopyDstLayouts){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.PCOPYDSTLAYOUTS, (pCopyDstLayouts==null?MemorySegment.NULL:MemorySegment.ofBuffer(pCopyDstLayouts)));
			return this;
		}

		@Nullable
		default IntBuffer pCopyDstLayouts(){
			final var pCopyDstLayouts_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.PCOPYDSTLAYOUTS);
			return (pCopyDstLayouts_.equals(MemorySegment.NULL)?null:pCopyDstLayouts_.asByteBuffer().asIntBuffer());
		}

		@Nullable
		default ByteBuffer optimalTilingLayoutUUID(){
			final var optimalTilingLayoutUUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.OPTIMALTILINGLAYOUTUUID, 1*API_Constants.VK_UUID_SIZE);
			return (optimalTilingLayoutUUID_.equals(MemorySegment.NULL)?null:optimalTilingLayoutUUID_.asByteBuffer());
		}

		default VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirements(boolean identicalMemoryTypeRequirements){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.IDENTICALMEMORYTYPEREQUIREMENTS, identicalMemoryTypeRequirements?1:0);
			return this;
		}

		default boolean identicalMemoryTypeRequirements(){
			final var identicalMemoryTypeRequirements_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.IDENTICALMEMORYTYPEREQUIREMENTS);
			return identicalMemoryTypeRequirements_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceHostImageCopyProperties from the given Arena.
		*/
		public static VkPhysicalDeviceHostImageCopyProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceHostImageCopyProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceHostImageCopyProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.SIZEOF, (mem)->(VkPhysicalDeviceHostImageCopyProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindDescriptorSetsInfo.html">VkBindDescriptorSetsInfo</a>
	*/
	public interface VkBindDescriptorSetsInfo extends io.github.kartoffell.klvulkan.Element<VkBindDescriptorSetsInfo>{
		default VkBindDescriptorSetsInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.STYPE);
		}

		default VkBindDescriptorSetsInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.PNEXT);
		}

		default VkBindDescriptorSetsInfo stageFlags(int stageFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.STAGEFLAGS, stageFlags);
			return this;
		}

		default int stageFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.STAGEFLAGS);
		}

		default VkBindDescriptorSetsInfo layout(Element<? extends VkPipelineLayout> layout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.LAYOUT, (layout==null?MemorySegment.NULL:layout.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkPipelineLayout> layout(){
			final var layout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.LAYOUT);
			return (layout_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipelineLayout>)()->layout_);
		}

		default VkBindDescriptorSetsInfo firstSet(int firstSet){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.FIRSTSET, firstSet);
			return this;
		}

		@Nullable
		default int firstSet(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.FIRSTSET);
		}

		default VkBindDescriptorSetsInfo descriptorSetCount(int descriptorSetCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.DESCRIPTORSETCOUNT, descriptorSetCount);
			return this;
		}

		default int descriptorSetCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.DESCRIPTORSETCOUNT);
		}

		default VkBindDescriptorSetsInfo pDescriptorSets(PointerBuffer<? extends Element<? extends VkDescriptorSet>> pDescriptorSets){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.PDESCRIPTORSETS, (pDescriptorSets==null?MemorySegment.NULL:pDescriptorSets.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkDescriptorSet>> pDescriptorSets(){
			final var pDescriptorSets_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.PDESCRIPTORSETS);
			return (pDescriptorSets_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pDescriptorSets_, (v1859383896)->(v1859383896.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorSet>)()->v1859383896)));
		}

		default VkBindDescriptorSetsInfo dynamicOffsetCount(int dynamicOffsetCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.DYNAMICOFFSETCOUNT, dynamicOffsetCount);
			return this;
		}

		@Nullable
		default int dynamicOffsetCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.DYNAMICOFFSETCOUNT);
		}

		default VkBindDescriptorSetsInfo pDynamicOffsets(IntBuffer pDynamicOffsets){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.PDYNAMICOFFSETS, (pDynamicOffsets==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDynamicOffsets)));
			return this;
		}

		default IntBuffer pDynamicOffsets(){
			final var pDynamicOffsets_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.PDYNAMICOFFSETS);
			return (pDynamicOffsets_.equals(MemorySegment.NULL)?null:pDynamicOffsets_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkBindDescriptorSetsInfo from the given Arena.
		*/
		public static VkBindDescriptorSetsInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindDescriptorSetsInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBindDescriptorSetsInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBindDescriptorSetsInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindDescriptorSetsInfo.SIZEOF, (mem)->(VkBindDescriptorSetsInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkHostImageCopyFlagBits.html">VkHostImageCopyFlagBits</a>
	*/
	public interface VkHostImageCopyFlagBits{
		public static final int VK_HOST_IMAGE_COPY_MEMCPY = 1;

		public static final int VK_HOST_IMAGE_COPY_MEMCPY_BIT = 1;

	}

	public static class VkDevice extends io.github.kartoffell.klvulkan.VK13.VkDevice{
		public VkDevice(MemorySegment address, VkPhysicalDevice parent) {
			super(address, parent);
		}

		/**
		@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_MEMORY_MAP_FAILED ->{@value VkResult#VK_ERROR_MEMORY_MAP_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkTransitionImageLayout.html">vkTransitionImageLayout</a>
		*/
		public void vkTransitionImageLayout(int transitionCount, Element<VkHostImageLayoutTransitionInfo> pTransitions) {
			if(capabilities.vkTransitionImageLayout_==null) {
				capabilities.vkTransitionImageLayout_ = capabilities.lookup("vkTransitionImageLayout", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkTransitionImageLayout_.invoke(address(), transitionCount, (pTransitions==null?MemorySegment.NULL:pTransitions.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_MEMORY_MAP_FAILED ->{@value VkResult#VK_ERROR_MEMORY_MAP_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkMapMemory2.html">vkMapMemory2</a>
		*/
		public void vkMapMemory2(Element<VkMemoryMapInfo> pMemoryMapInfo, PointerBuffer<? extends MemorySegment> ppData) {
			if(capabilities.vkMapMemory2_==null) {
				capabilities.vkMapMemory2_ = capabilities.lookup("vkMapMemory2", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkMapMemory2_.invoke(address(), (pMemoryMapInfo==null?MemorySegment.NULL:pMemoryMapInfo.address()), (ppData==null?MemorySegment.NULL:ppData.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_MEMORY_MAP_FAILED ->{@value VkResult#VK_ERROR_MEMORY_MAP_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCopyImageToMemory.html">vkCopyImageToMemory</a>
		*/
		public void vkCopyImageToMemory(Element<VkCopyImageToMemoryInfo> pCopyImageToMemoryInfo) {
			if(capabilities.vkCopyImageToMemory_==null) {
				capabilities.vkCopyImageToMemory_ = capabilities.lookup("vkCopyImageToMemory", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCopyImageToMemory_.invoke(address(), (pCopyImageToMemoryInfo==null?MemorySegment.NULL:pCopyImageToMemoryInfo.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_MEMORY_MAP_FAILED ->{@value VkResult#VK_ERROR_MEMORY_MAP_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCopyImageToImage.html">vkCopyImageToImage</a>
		*/
		public void vkCopyImageToImage(Element<VkCopyImageToImageInfo> pCopyImageToImageInfo) {
			if(capabilities.vkCopyImageToImage_==null) {
				capabilities.vkCopyImageToImage_ = capabilities.lookup("vkCopyImageToImage", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCopyImageToImage_.invoke(address(), (pCopyImageToImageInfo==null?MemorySegment.NULL:pCopyImageToImageInfo.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_MEMORY_MAP_FAILED ->{@value VkResult#VK_ERROR_MEMORY_MAP_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCopyMemoryToImage.html">vkCopyMemoryToImage</a>
		*/
		public void vkCopyMemoryToImage(Element<VkCopyMemoryToImageInfo> pCopyMemoryToImageInfo) {
			if(capabilities.vkCopyMemoryToImage_==null) {
				capabilities.vkCopyMemoryToImage_ = capabilities.lookup("vkCopyMemoryToImage", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCopyMemoryToImage_.invoke(address(), (pCopyMemoryToImageInfo==null?MemorySegment.NULL:pCopyMemoryToImageInfo.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_MEMORY_MAP_FAILED ->{@value VkResult#VK_ERROR_MEMORY_MAP_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkUnmapMemory2.html">vkUnmapMemory2</a>
		*/
		public void vkUnmapMemory2(Element<VkMemoryUnmapInfo> pMemoryUnmapInfo) {
			if(capabilities.vkUnmapMemory2_==null) {
				capabilities.vkUnmapMemory2_ = capabilities.lookup("vkUnmapMemory2", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkUnmapMemory2_.invoke(address(), (pMemoryUnmapInfo==null?MemorySegment.NULL:pMemoryUnmapInfo.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceImageSubresourceLayout.html">vkGetDeviceImageSubresourceLayout</a>
		*/
		public void vkGetDeviceImageSubresourceLayout(Element<VkDeviceImageSubresourceInfo> pInfo, Element<VkSubresourceLayout2> pLayout) {
			if(capabilities.vkGetDeviceImageSubresourceLayout_==null) {
				capabilities.vkGetDeviceImageSubresourceLayout_ = capabilities.lookup("vkGetDeviceImageSubresourceLayout", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceImageSubresourceLayout_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()), (pLayout==null?MemorySegment.NULL:pLayout.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetImageSubresourceLayout2.html">vkGetImageSubresourceLayout2</a>
		*/
		public void vkGetImageSubresourceLayout2(Element<? extends VkImage> image, Element<VkImageSubresource2> pSubresource, Element<VkSubresourceLayout2> pLayout) {
			if(capabilities.vkGetImageSubresourceLayout2_==null) {
				capabilities.vkGetImageSubresourceLayout2_ = capabilities.lookup("vkGetImageSubresourceLayout2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetImageSubresourceLayout2_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), (pSubresource==null?MemorySegment.NULL:pSubresource.address()), (pLayout==null?MemorySegment.NULL:pLayout.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetRenderingAreaGranularity.html">vkGetRenderingAreaGranularity</a>
		*/
		public void vkGetRenderingAreaGranularity(Element<VkRenderingAreaInfo> pRenderingAreaInfo, Element<VkExtent2D> pGranularity) {
			if(capabilities.vkGetRenderingAreaGranularity_==null) {
				capabilities.vkGetRenderingAreaGranularity_ = capabilities.lookup("vkGetRenderingAreaGranularity", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetRenderingAreaGranularity_.invoke(address(), (pRenderingAreaInfo==null?MemorySegment.NULL:pRenderingAreaInfo.address()), (pGranularity==null?MemorySegment.NULL:pGranularity.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		protected VkCommandBuffer VkCommandBuffer(MemorySegment mem, Object parent) {
			return new VkCommandBuffer(mem, (VkCommandPool) parent); //Omega
		}

		protected VkDevice VkDevice(MemorySegment mem, Object parent) {
			return new VkDevice(mem, (VkPhysicalDevice) parent); //Omega
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMaintenance6Properties.html">VkPhysicalDeviceMaintenance6Properties</a>
	*/
	public interface VkPhysicalDeviceMaintenance6Properties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceMaintenance6Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Properties.PNEXT);
		}

		default boolean blockTexelViewCompatibleMultipleLayers(){
			final var blockTexelViewCompatibleMultipleLayers_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Properties.BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS);
			return blockTexelViewCompatibleMultipleLayers_!=0;
		}

		default int maxCombinedImageSamplerDescriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Properties.MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT);
		}

		default boolean fragmentShadingRateClampCombinerInputs(){
			final var fragmentShadingRateClampCombinerInputs_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Properties.FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS);
			return fragmentShadingRateClampCombinerInputs_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceMaintenance6Properties from the given Arena.
		*/
		public static VkPhysicalDeviceMaintenance6Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Properties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceMaintenance6Properties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceMaintenance6Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Properties.SIZEOF, (mem)->(VkPhysicalDeviceMaintenance6Properties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineRasterizationLineStateCreateInfo.html">VkPipelineRasterizationLineStateCreateInfo</a>
	*/
	public interface VkPipelineRasterizationLineStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineRasterizationLineStateCreateInfo>{
		default VkPipelineRasterizationLineStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STYPE);
		}

		default VkPipelineRasterizationLineStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.PNEXT);
		}

		default VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(int lineRasterizationMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINERASTERIZATIONMODE, lineRasterizationMode);
			return this;
		}

		default int lineRasterizationMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINERASTERIZATIONMODE);
		}

		default VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(boolean stippledLineEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STIPPLEDLINEENABLE, stippledLineEnable?1:0);
			return this;
		}

		default boolean stippledLineEnable(){
			final var stippledLineEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STIPPLEDLINEENABLE);
			return stippledLineEnable_!=0;
		}

		default VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(int lineStippleFactor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEFACTOR, lineStippleFactor);
			return this;
		}

		default int lineStippleFactor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEFACTOR);
		}

		default VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(short lineStipplePattern){
			address().set(ValueLayout.JAVA_SHORT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEPATTERN, lineStipplePattern);
			return this;
		}

		default short lineStipplePattern(){
			return address().get(ValueLayout.JAVA_SHORT, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEPATTERN);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineRasterizationLineStateCreateInfo from the given Arena.
		*/
		public static VkPipelineRasterizationLineStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineRasterizationLineStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineRasterizationLineStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF, (mem)->(VkPipelineRasterizationLineStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyMemoryToImageInfo.html">VkCopyMemoryToImageInfo</a>
	*/
	public interface VkCopyMemoryToImageInfo extends io.github.kartoffell.klvulkan.Element<VkCopyMemoryToImageInfo>{
		default VkCopyMemoryToImageInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.STYPE);
		}

		default VkCopyMemoryToImageInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.PNEXT);
		}

		default VkCopyMemoryToImageInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.FLAGS);
		}

		default VkCopyMemoryToImageInfo dstImage(Element<? extends VkImage> dstImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.DSTIMAGE, (dstImage==null?MemorySegment.NULL:dstImage.address()));
			return this;
		}

		default Element<? extends VkImage> dstImage(){
			final var dstImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.DSTIMAGE);
			return (dstImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->dstImage_);
		}

		default VkCopyMemoryToImageInfo dstImageLayout(int dstImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.DSTIMAGELAYOUT, dstImageLayout);
			return this;
		}

		default int dstImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.DSTIMAGELAYOUT);
		}

		default VkCopyMemoryToImageInfo regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.REGIONCOUNT);
		}

		default VkCopyMemoryToImageInfo pRegions(Element<VkMemoryToImageCopy> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkMemoryToImageCopy> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkMemoryToImageCopy.SIZEOF, (v145581669)->(v145581669.equals(MemorySegment.NULL)?null:(VkMemoryToImageCopy)()->v145581669)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyMemoryToImageInfo from the given Arena.
		*/
		public static VkCopyMemoryToImageInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyMemoryToImageInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyMemoryToImageInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyMemoryToImageInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyMemoryToImageInfo.SIZEOF, (mem)->(VkCopyMemoryToImageInfo)()->mem);
		}

	}

	public static class VkCommandBuffer extends io.github.kartoffell.klvulkan.VK13.VkCommandBuffer{
		public VkCommandBuffer(MemorySegment address, VkCommandPool parent) {
			super(address, parent);
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPushDescriptorSet.html">vkCmdPushDescriptorSet</a>
		*/
		public void vkCmdPushDescriptorSet(int pipelineBindPoint, Element<? extends VkPipelineLayout> layout, int set, int descriptorWriteCount, Element<VkWriteDescriptorSet> pDescriptorWrites) {
			if(capabilities.vkCmdPushDescriptorSet_==null) {
				capabilities.vkCmdPushDescriptorSet_ = capabilities.lookup("vkCmdPushDescriptorSet", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPushDescriptorSet_.invoke(address(), pipelineBindPoint, (layout==null?MemorySegment.NULL:layout.address()), set, descriptorWriteCount, (pDescriptorWrites==null?MemorySegment.NULL:pDescriptorWrites.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPushConstants2.html">vkCmdPushConstants2</a>
		*/
		public void vkCmdPushConstants2(Element<VkPushConstantsInfo> pPushConstantsInfo) {
			if(capabilities.vkCmdPushConstants2_==null) {
				capabilities.vkCmdPushConstants2_ = capabilities.lookup("vkCmdPushConstants2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPushConstants2_.invoke(address(), (pPushConstantsInfo==null?MemorySegment.NULL:pPushConstantsInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBindIndexBuffer2.html">vkCmdBindIndexBuffer2</a>
		*/
		public void vkCmdBindIndexBuffer2(@Nullable Element<? extends VkBuffer> buffer, long offset, long size, int indexType) {
			if(capabilities.vkCmdBindIndexBuffer2_==null) {
				capabilities.vkCmdBindIndexBuffer2_ = capabilities.lookup("vkCmdBindIndexBuffer2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdBindIndexBuffer2_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), offset, size, indexType);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetLineStipple.html">vkCmdSetLineStipple</a>
		*/
		public void vkCmdSetLineStipple(int lineStippleFactor, short lineStipplePattern) {
			if(capabilities.vkCmdSetLineStipple_==null) {
				capabilities.vkCmdSetLineStipple_ = capabilities.lookup("vkCmdSetLineStipple", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
			}
			try {
				capabilities.vkCmdSetLineStipple_.invoke(address(), lineStippleFactor, lineStipplePattern);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPushDescriptorSetWithTemplate2.html">vkCmdPushDescriptorSetWithTemplate2</a>
		*/
		public void vkCmdPushDescriptorSetWithTemplate2(Element<VkPushDescriptorSetWithTemplateInfo> pPushDescriptorSetWithTemplateInfo) {
			if(capabilities.vkCmdPushDescriptorSetWithTemplate2_==null) {
				capabilities.vkCmdPushDescriptorSetWithTemplate2_ = capabilities.lookup("vkCmdPushDescriptorSetWithTemplate2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPushDescriptorSetWithTemplate2_.invoke(address(), (pPushDescriptorSetWithTemplateInfo==null?MemorySegment.NULL:pPushDescriptorSetWithTemplateInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPushDescriptorSetWithTemplate.html">vkCmdPushDescriptorSetWithTemplate</a>
		*/
		public void vkCmdPushDescriptorSetWithTemplate(Element<? extends VkDescriptorUpdateTemplate> descriptorUpdateTemplate, Element<? extends VkPipelineLayout> layout, int set, MemorySegment pData) {
			if(capabilities.vkCmdPushDescriptorSetWithTemplate_==null) {
				capabilities.vkCmdPushDescriptorSetWithTemplate_ = capabilities.lookup("vkCmdPushDescriptorSetWithTemplate", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPushDescriptorSetWithTemplate_.invoke(address(), (descriptorUpdateTemplate==null?MemorySegment.NULL:descriptorUpdateTemplate.address()), (layout==null?MemorySegment.NULL:layout.address()), set, pData);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPushDescriptorSet2.html">vkCmdPushDescriptorSet2</a>
		*/
		public void vkCmdPushDescriptorSet2(Element<VkPushDescriptorSetInfo> pPushDescriptorSetInfo) {
			if(capabilities.vkCmdPushDescriptorSet2_==null) {
				capabilities.vkCmdPushDescriptorSet2_ = capabilities.lookup("vkCmdPushDescriptorSet2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPushDescriptorSet2_.invoke(address(), (pPushDescriptorSetInfo==null?MemorySegment.NULL:pPushDescriptorSetInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBindDescriptorSets2.html">vkCmdBindDescriptorSets2</a>
		*/
		public void vkCmdBindDescriptorSets2(Element<VkBindDescriptorSetsInfo> pBindDescriptorSetsInfo) {
			if(capabilities.vkCmdBindDescriptorSets2_==null) {
				capabilities.vkCmdBindDescriptorSets2_ = capabilities.lookup("vkCmdBindDescriptorSets2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBindDescriptorSets2_.invoke(address(), (pBindDescriptorSetsInfo==null?MemorySegment.NULL:pBindDescriptorSetsInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetRenderingInputAttachmentIndices.html">vkCmdSetRenderingInputAttachmentIndices</a>
		*/
		public void vkCmdSetRenderingInputAttachmentIndices(Element<VkRenderingInputAttachmentIndexInfo> pInputAttachmentIndexInfo) {
			if(capabilities.vkCmdSetRenderingInputAttachmentIndices_==null) {
				capabilities.vkCmdSetRenderingInputAttachmentIndices_ = capabilities.lookup("vkCmdSetRenderingInputAttachmentIndices", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetRenderingInputAttachmentIndices_.invoke(address(), (pInputAttachmentIndexInfo==null?MemorySegment.NULL:pInputAttachmentIndexInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetRenderingAttachmentLocations.html">vkCmdSetRenderingAttachmentLocations</a>
		*/
		public void vkCmdSetRenderingAttachmentLocations(Element<VkRenderingAttachmentLocationInfo> pLocationInfo) {
			if(capabilities.vkCmdSetRenderingAttachmentLocations_==null) {
				capabilities.vkCmdSetRenderingAttachmentLocations_ = capabilities.lookup("vkCmdSetRenderingAttachmentLocations", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetRenderingAttachmentLocations_.invoke(address(), (pLocationInfo==null?MemorySegment.NULL:pLocationInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineRobustnessCreateInfo.html">VkPipelineRobustnessCreateInfo</a>
	*/
	public interface VkPipelineRobustnessCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineRobustnessCreateInfo>{
		default VkPipelineRobustnessCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.STYPE);
		}

		default VkPipelineRobustnessCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.PNEXT);
		}

		default VkPipelineRobustnessCreateInfo storageBuffers(int storageBuffers){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.STORAGEBUFFERS, storageBuffers);
			return this;
		}

		default int storageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.STORAGEBUFFERS);
		}

		default VkPipelineRobustnessCreateInfo uniformBuffers(int uniformBuffers){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.UNIFORMBUFFERS, uniformBuffers);
			return this;
		}

		default int uniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.UNIFORMBUFFERS);
		}

		default VkPipelineRobustnessCreateInfo vertexInputs(int vertexInputs){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.VERTEXINPUTS, vertexInputs);
			return this;
		}

		default int vertexInputs(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.VERTEXINPUTS);
		}

		default VkPipelineRobustnessCreateInfo images(int images){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.IMAGES, images);
			return this;
		}

		default int images(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.IMAGES);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineRobustnessCreateInfo from the given Arena.
		*/
		public static VkPipelineRobustnessCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineRobustnessCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineRobustnessCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineRobustnessCreateInfo.SIZEOF, (mem)->(VkPipelineRobustnessCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryToImageCopy.html">VkMemoryToImageCopy</a>
	*/
	public interface VkMemoryToImageCopy extends io.github.kartoffell.klvulkan.Element<VkMemoryToImageCopy>{
		default VkMemoryToImageCopy sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryToImageCopy.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryToImageCopy.STYPE);
		}

		default VkMemoryToImageCopy pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryToImageCopy.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryToImageCopy.PNEXT);
		}

		default VkMemoryToImageCopy pHostPointer(MemorySegment pHostPointer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryToImageCopy.PHOSTPOINTER, pHostPointer);
			return this;
		}

		default MemorySegment pHostPointer(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryToImageCopy.PHOSTPOINTER);
		}

		/**
		Specified in texels
		*/
		default VkMemoryToImageCopy memoryRowLength(int memoryRowLength){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryToImageCopy.MEMORYROWLENGTH, memoryRowLength);
			return this;
		}

		/**
		Specified in texels
		*/
		default int memoryRowLength(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryToImageCopy.MEMORYROWLENGTH);
		}

		default VkMemoryToImageCopy memoryImageHeight(int memoryImageHeight){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryToImageCopy.MEMORYIMAGEHEIGHT, memoryImageHeight);
			return this;
		}

		default int memoryImageHeight(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryToImageCopy.MEMORYIMAGEHEIGHT);
		}

		default VkImageSubresourceLayers imageSubresource(){
			final var imageSubresource_ = address().asSlice(org.lwjgl.vulkan.VkMemoryToImageCopy.IMAGESUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (imageSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->imageSubresource_);
		}

		default VkOffset3D imageOffset(){
			final var imageOffset_ = address().asSlice(org.lwjgl.vulkan.VkMemoryToImageCopy.IMAGEOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (imageOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->imageOffset_);
		}

		default VkExtent3D imageExtent(){
			final var imageExtent_ = address().asSlice(org.lwjgl.vulkan.VkMemoryToImageCopy.IMAGEEXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (imageExtent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->imageExtent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryToImageCopy from the given Arena.
		*/
		public static VkMemoryToImageCopy allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryToImageCopy.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryToImageCopy from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryToImageCopy> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryToImageCopy.SIZEOF, (mem)->(VkMemoryToImageCopy)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMaintenance5Features.html">VkPhysicalDeviceMaintenance5Features</a>
	*/
	public interface VkPhysicalDeviceMaintenance5Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceMaintenance5Features>{
		default VkPhysicalDeviceMaintenance5Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.STYPE);
		}

		default VkPhysicalDeviceMaintenance5Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.PNEXT);
		}

		default VkPhysicalDeviceMaintenance5Features maintenance5(boolean maintenance5){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.MAINTENANCE5, maintenance5?1:0);
			return this;
		}

		default boolean maintenance5(){
			final var maintenance5_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.MAINTENANCE5);
			return maintenance5_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceMaintenance5Features from the given Arena.
		*/
		public static VkPhysicalDeviceMaintenance5Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceMaintenance5Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceMaintenance5Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.SIZEOF, (mem)->(VkPhysicalDeviceMaintenance5Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyImageToMemoryInfo.html">VkCopyImageToMemoryInfo</a>
	*/
	public interface VkCopyImageToMemoryInfo extends io.github.kartoffell.klvulkan.Element<VkCopyImageToMemoryInfo>{
		default VkCopyImageToMemoryInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.STYPE);
		}

		default VkCopyImageToMemoryInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.PNEXT);
		}

		default VkCopyImageToMemoryInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.FLAGS);
		}

		default VkCopyImageToMemoryInfo srcImage(Element<? extends VkImage> srcImage){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.SRCIMAGE, (srcImage==null?MemorySegment.NULL:srcImage.address()));
			return this;
		}

		default Element<? extends VkImage> srcImage(){
			final var srcImage_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.SRCIMAGE);
			return (srcImage_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->srcImage_);
		}

		default VkCopyImageToMemoryInfo srcImageLayout(int srcImageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.SRCIMAGELAYOUT, srcImageLayout);
			return this;
		}

		default int srcImageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.SRCIMAGELAYOUT);
		}

		default VkCopyImageToMemoryInfo regionCount(int regionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.REGIONCOUNT, regionCount);
			return this;
		}

		default int regionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.REGIONCOUNT);
		}

		default VkCopyImageToMemoryInfo pRegions(Element<VkImageToMemoryCopy> pRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.PREGIONS, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			return this;
		}

		default Element<VkImageToMemoryCopy> pRegions(){
			final var pRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.PREGIONS);
			return (pRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRegions_, org.lwjgl.vulkan.VkImageToMemoryCopy.SIZEOF, (v816798571)->(v816798571.equals(MemorySegment.NULL)?null:(VkImageToMemoryCopy)()->v816798571)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyImageToMemoryInfo from the given Arena.
		*/
		public static VkCopyImageToMemoryInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyImageToMemoryInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyImageToMemoryInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyImageToMemoryInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyImageToMemoryInfo.SIZEOF, (mem)->(VkCopyImageToMemoryInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkHostImageLayoutTransitionInfo.html">VkHostImageLayoutTransitionInfo</a>
	*/
	public interface VkHostImageLayoutTransitionInfo extends io.github.kartoffell.klvulkan.Element<VkHostImageLayoutTransitionInfo>{
		default VkHostImageLayoutTransitionInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.STYPE);
		}

		default VkHostImageLayoutTransitionInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.PNEXT);
		}

		default VkHostImageLayoutTransitionInfo image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		default VkHostImageLayoutTransitionInfo oldLayout(int oldLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.OLDLAYOUT, oldLayout);
			return this;
		}

		default int oldLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.OLDLAYOUT);
		}

		default VkHostImageLayoutTransitionInfo newLayout(int newLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.NEWLAYOUT, newLayout);
			return this;
		}

		default int newLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.NEWLAYOUT);
		}

		default VkImageSubresourceRange subresourceRange(){
			final var subresourceRange_ = address().asSlice(org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE, org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF);
			return (subresourceRange_.equals(MemorySegment.NULL)?null:(VkImageSubresourceRange)()->subresourceRange_);
		}

		MemorySegment address();

		/**
		Allocates a new VkHostImageLayoutTransitionInfo from the given Arena.
		*/
		public static VkHostImageLayoutTransitionInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkHostImageLayoutTransitionInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkHostImageLayoutTransitionInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF, (mem)->(VkHostImageLayoutTransitionInfo)()->mem);
		}

	}

	public interface API_Constants extends io.github.kartoffell.klvulkan.VK12.API_Constants{
		public static final int VK_MAX_GLOBAL_PRIORITY_SIZE = 16;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceLineRasterizationProperties.html">VkPhysicalDeviceLineRasterizationProperties</a>
	*/
	public interface VkPhysicalDeviceLineRasterizationProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceLineRasterizationProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.PNEXT);
		}

		default int lineSubPixelPrecisionBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.LINESUBPIXELPRECISIONBITS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceLineRasterizationProperties from the given Arena.
		*/
		public static VkPhysicalDeviceLineRasterizationProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceLineRasterizationProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceLineRasterizationProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.SIZEOF, (mem)->(VkPhysicalDeviceLineRasterizationProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPushConstantsInfo.html">VkPushConstantsInfo</a>
	*/
	public interface VkPushConstantsInfo extends io.github.kartoffell.klvulkan.Element<VkPushConstantsInfo>{
		default VkPushConstantsInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.STYPE);
		}

		default VkPushConstantsInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushConstantsInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushConstantsInfo.PNEXT);
		}

		default VkPushConstantsInfo layout(Element<? extends VkPipelineLayout> layout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushConstantsInfo.LAYOUT, (layout==null?MemorySegment.NULL:layout.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkPipelineLayout> layout(){
			final var layout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushConstantsInfo.LAYOUT);
			return (layout_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipelineLayout>)()->layout_);
		}

		default VkPushConstantsInfo stageFlags(int stageFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.STAGEFLAGS, stageFlags);
			return this;
		}

		default int stageFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.STAGEFLAGS);
		}

		default VkPushConstantsInfo offset(int offset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.OFFSET, offset);
			return this;
		}

		@Nullable
		default int offset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.OFFSET);
		}

		default VkPushConstantsInfo size(int size){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.SIZE, size);
			return this;
		}

		default int size(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantsInfo.SIZE);
		}

		default VkPushConstantsInfo pValues(MemorySegment pValues){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushConstantsInfo.PVALUES, pValues);
			return this;
		}

		default MemorySegment pValues(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushConstantsInfo.PVALUES);
		}

		MemorySegment address();

		/**
		Allocates a new VkPushConstantsInfo from the given Arena.
		*/
		public static VkPushConstantsInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPushConstantsInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPushConstantsInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF, (mem)->(VkPushConstantsInfo)()->mem);
		}

	}

	public interface VkFormatFeatureFlagBits2 extends io.github.kartoffell.klvulkan.VK13.VkFormatFeatureFlagBits2{
		public static final int VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT = 16384;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceQueueGlobalPriorityCreateInfo.html">VkDeviceQueueGlobalPriorityCreateInfo</a>
	*/
	public interface VkDeviceQueueGlobalPriorityCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDeviceQueueGlobalPriorityCreateInfo>{
		default VkDeviceQueueGlobalPriorityCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.STYPE);
		}

		default VkDeviceQueueGlobalPriorityCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.PNEXT);
		}

		default VkDeviceQueueGlobalPriorityCreateInfo globalPriority(int globalPriority){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.GLOBALPRIORITY, globalPriority);
			return this;
		}

		default int globalPriority(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.GLOBALPRIORITY);
		}

		MemorySegment address();

		/**
		Allocates a new VkDeviceQueueGlobalPriorityCreateInfo from the given Arena.
		*/
		public static VkDeviceQueueGlobalPriorityCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDeviceQueueGlobalPriorityCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDeviceQueueGlobalPriorityCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.SIZEOF, (mem)->(VkDeviceQueueGlobalPriorityCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCreateFlagBits2.html">VkPipelineCreateFlagBits2</a>
	*/
	public interface VkPipelineCreateFlagBits2{
		public static final int VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT = 1;

		public static final int VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT = 2;

		public static final int VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT = 16;

		public static final int VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 256;

		public static final int VK_PIPELINE_CREATE_2_DERIVATIVE_BIT = 4;

		public static final int VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT = 512;

		public static final int VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 8;

		public static final int VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT = 134217728;

		public static final int VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT = 1073741824;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineRobustnessImageBehavior.html">VkPipelineRobustnessImageBehavior</a>
	*/
	public interface VkPipelineRobustnessImageBehavior{
		public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS = 2;

		public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 = 3;

		public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT = 0;

		public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderSubgroupRotateFeatures.html">VkPhysicalDeviceShaderSubgroupRotateFeatures</a>
	*/
	public interface VkPhysicalDeviceShaderSubgroupRotateFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderSubgroupRotateFeatures>{
		default VkPhysicalDeviceShaderSubgroupRotateFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.STYPE);
		}

		default VkPhysicalDeviceShaderSubgroupRotateFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.PNEXT);
		}

		default VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotate(boolean shaderSubgroupRotate){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATE, shaderSubgroupRotate?1:0);
			return this;
		}

		default boolean shaderSubgroupRotate(){
			final var shaderSubgroupRotate_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATE);
			return shaderSubgroupRotate_!=0;
		}

		default VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateClustered(boolean shaderSubgroupRotateClustered){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATECLUSTERED, shaderSubgroupRotateClustered?1:0);
			return this;
		}

		default boolean shaderSubgroupRotateClustered(){
			final var shaderSubgroupRotateClustered_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATECLUSTERED);
			return shaderSubgroupRotateClustered_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderSubgroupRotateFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceShaderSubgroupRotateFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderSubgroupRotateFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderSubgroupRotateFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.SIZEOF, (mem)->(VkPhysicalDeviceShaderSubgroupRotateFeatures)()->mem);
		}

	}

	public interface VkStructureType extends io.github.kartoffell.klvulkan.VK13.VkStructureType{
		public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY = 1000270002;

		public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO = 1000174000;

		public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO = 1000270007;

		public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO = 1000232001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES = 1000528000;

		public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 = 1000338002;

		public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO = 1000545003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES = 1000259002;

		public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY = 1000270009;

		public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES = 1000388001;

		public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO = 1000270004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES = 1000080000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES = 1000190002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES = 1000466000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES = 1000232000;

		public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO = 1000470003;

		public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO = 1000232002;

		public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO = 1000271001;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO = 1000470005;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES = 55;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES = 1000270001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES = 1000068001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES = 1000470000;

		public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO = 1000470006;

		public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS = 1000545002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES = 1000259000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES = 1000525000;

		public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO = 1000545005;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES = 1000544000;

		public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO = 1000271000;

		public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO = 1000270005;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES = 1000068002;

		public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY = 1000270003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES = 1000545000;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO = 1000259001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES = 1000388000;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO = 1000190001;

		public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO = 1000270006;

		public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO = 1000470004;

		public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE = 1000270008;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO = 1000068000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES = 56;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES = 1000416000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES = 1000545001;

		public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 = 1000338003;

		public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO = 1000545004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES = 1000270000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES = 1000470001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES = 1000265000;

		public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO = 1000545006;

	}

	public static class VkInstance extends io.github.kartoffell.klvulkan.VK13.VkInstance{
		public VkInstance(MemorySegment address, VK14 parent) {
			super(address, parent);
		}

		protected VkInstance VkInstance(MemorySegment mem, Object parent) {
			return new VkInstance(mem, (VK14) parent); //Omega
		}

	}

	public interface VkDescriptorSetLayoutCreateFlagBits extends io.github.kartoffell.klvulkan.VK12.VkDescriptorSetLayoutCreateFlagBits{
		public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT = 1;

	}

	public interface VkResult extends io.github.kartoffell.klvulkan.VK13.VkResult{
		public static final int VK_ERROR_NOT_PERMITTED = 1000174001;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferUsageFlags2CreateInfo.html">VkBufferUsageFlags2CreateInfo</a>
	*/
	public interface VkBufferUsageFlags2CreateInfo extends io.github.kartoffell.klvulkan.Element<VkBufferUsageFlags2CreateInfo>{
		default VkBufferUsageFlags2CreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.STYPE);
		}

		default VkBufferUsageFlags2CreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.PNEXT);
		}

		default VkBufferUsageFlags2CreateInfo usage(long usage){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.USAGE, usage);
			return this;
		}

		default long usage(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.USAGE);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferUsageFlags2CreateInfo from the given Arena.
		*/
		public static VkBufferUsageFlags2CreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferUsageFlags2CreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferUsageFlags2CreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.SIZEOF, (mem)->(VkBufferUsageFlags2CreateInfo)()->mem);
		}

	}

	public interface VkDescriptorUpdateTemplateType extends io.github.kartoffell.klvulkan.VK11.VkDescriptorUpdateTemplateType{
		public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferUsageFlagBits2.html">VkBufferUsageFlagBits2</a>
	*/
	public interface VkBufferUsageFlagBits2{
		public static final int VK_BUFFER_USAGE_2_TRANSFER_DST_BIT = 2;

		public static final int VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT = 4;

		public static final int VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT = 8;

		public static final int VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT = 16;

		public static final int VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT = 1;

		public static final int VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT = 32;

		public static final int VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT = 64;

		public static final int VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT = 128;

		public static final int VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT = 256;

		public static final int VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT = 131072;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryUnmapFlagBits.html">VkMemoryUnmapFlagBits</a>
	*/
	public interface VkMemoryUnmapFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMaintenance5Properties.html">VkPhysicalDeviceMaintenance5Properties</a>
	*/
	public interface VkPhysicalDeviceMaintenance5Properties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceMaintenance5Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.PNEXT);
		}

		default boolean earlyFragmentMultisampleCoverageAfterSampleCounting(){
			final var earlyFragmentMultisampleCoverageAfterSampleCounting_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING);
			return earlyFragmentMultisampleCoverageAfterSampleCounting_!=0;
		}

		default boolean earlyFragmentSampleMaskTestBeforeSampleCounting(){
			final var earlyFragmentSampleMaskTestBeforeSampleCounting_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING);
			return earlyFragmentSampleMaskTestBeforeSampleCounting_!=0;
		}

		default boolean depthStencilSwizzleOneSupport(){
			final var depthStencilSwizzleOneSupport_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.DEPTHSTENCILSWIZZLEONESUPPORT);
			return depthStencilSwizzleOneSupport_!=0;
		}

		default boolean polygonModePointSize(){
			final var polygonModePointSize_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.POLYGONMODEPOINTSIZE);
			return polygonModePointSize_!=0;
		}

		default boolean nonStrictSinglePixelWideLinesUseParallelogram(){
			final var nonStrictSinglePixelWideLinesUseParallelogram_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM);
			return nonStrictSinglePixelWideLinesUseParallelogram_!=0;
		}

		default boolean nonStrictWideLinesUseParallelogram(){
			final var nonStrictWideLinesUseParallelogram_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.NONSTRICTWIDELINESUSEPARALLELOGRAM);
			return nonStrictWideLinesUseParallelogram_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceMaintenance5Properties from the given Arena.
		*/
		public static VkPhysicalDeviceMaintenance5Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceMaintenance5Properties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceMaintenance5Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.SIZEOF, (mem)->(VkPhysicalDeviceMaintenance5Properties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderingInputAttachmentIndexInfo.html">VkRenderingInputAttachmentIndexInfo</a>
	*/
	public interface VkRenderingInputAttachmentIndexInfo extends io.github.kartoffell.klvulkan.Element<VkRenderingInputAttachmentIndexInfo>{
		default VkRenderingInputAttachmentIndexInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.STYPE);
		}

		default VkRenderingInputAttachmentIndexInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PNEXT);
		}

		default VkRenderingInputAttachmentIndexInfo colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.COLORATTACHMENTCOUNT);
		}

		default VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndices(IntBuffer pColorAttachmentInputIndices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PCOLORATTACHMENTINPUTINDICES, (pColorAttachmentInputIndices==null?MemorySegment.NULL:MemorySegment.ofBuffer(pColorAttachmentInputIndices)));
			return this;
		}

		@Nullable
		default IntBuffer pColorAttachmentInputIndices(){
			final var pColorAttachmentInputIndices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PCOLORATTACHMENTINPUTINDICES);
			return (pColorAttachmentInputIndices_.equals(MemorySegment.NULL)?null:pColorAttachmentInputIndices_.asByteBuffer().asIntBuffer());
		}

		default VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndex(IntBuffer pDepthInputAttachmentIndex){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PDEPTHINPUTATTACHMENTINDEX, (pDepthInputAttachmentIndex==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDepthInputAttachmentIndex)));
			return this;
		}

		@Nullable
		default IntBuffer pDepthInputAttachmentIndex(){
			final var pDepthInputAttachmentIndex_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PDEPTHINPUTATTACHMENTINDEX);
			return (pDepthInputAttachmentIndex_.equals(MemorySegment.NULL)?null:pDepthInputAttachmentIndex_.asByteBuffer().asIntBuffer());
		}

		default VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndex(IntBuffer pStencilInputAttachmentIndex){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PSTENCILINPUTATTACHMENTINDEX, (pStencilInputAttachmentIndex==null?MemorySegment.NULL:MemorySegment.ofBuffer(pStencilInputAttachmentIndex)));
			return this;
		}

		@Nullable
		default IntBuffer pStencilInputAttachmentIndex(){
			final var pStencilInputAttachmentIndex_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.PSTENCILINPUTATTACHMENTINDEX);
			return (pStencilInputAttachmentIndex_.equals(MemorySegment.NULL)?null:pStencilInputAttachmentIndex_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderingInputAttachmentIndexInfo from the given Arena.
		*/
		public static VkRenderingInputAttachmentIndexInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderingInputAttachmentIndexInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderingInputAttachmentIndexInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.SIZEOF, (mem)->(VkRenderingInputAttachmentIndexInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPushDescriptorSetInfo.html">VkPushDescriptorSetInfo</a>
	*/
	public interface VkPushDescriptorSetInfo extends io.github.kartoffell.klvulkan.Element<VkPushDescriptorSetInfo>{
		default VkPushDescriptorSetInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.STYPE);
		}

		default VkPushDescriptorSetInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetInfo.PNEXT);
		}

		default VkPushDescriptorSetInfo stageFlags(int stageFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.STAGEFLAGS, stageFlags);
			return this;
		}

		default int stageFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.STAGEFLAGS);
		}

		default VkPushDescriptorSetInfo layout(Element<? extends VkPipelineLayout> layout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetInfo.LAYOUT, (layout==null?MemorySegment.NULL:layout.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkPipelineLayout> layout(){
			final var layout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetInfo.LAYOUT);
			return (layout_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipelineLayout>)()->layout_);
		}

		default VkPushDescriptorSetInfo set(int set){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.SET, set);
			return this;
		}

		@Nullable
		default int set(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.SET);
		}

		default VkPushDescriptorSetInfo descriptorWriteCount(int descriptorWriteCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.DESCRIPTORWRITECOUNT, descriptorWriteCount);
			return this;
		}

		default int descriptorWriteCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushDescriptorSetInfo.DESCRIPTORWRITECOUNT);
		}

		default VkPushDescriptorSetInfo pDescriptorWrites(Element<VkWriteDescriptorSet> pDescriptorWrites){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetInfo.PDESCRIPTORWRITES, (pDescriptorWrites==null?MemorySegment.NULL:pDescriptorWrites.address()));
			return this;
		}

		default Element<VkWriteDescriptorSet> pDescriptorWrites(){
			final var pDescriptorWrites_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPushDescriptorSetInfo.PDESCRIPTORWRITES);
			return (pDescriptorWrites_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDescriptorWrites_, org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF, (v428039780)->(v428039780.equals(MemorySegment.NULL)?null:(VkWriteDescriptorSet)()->v428039780)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPushDescriptorSetInfo from the given Arena.
		*/
		public static VkPushDescriptorSetInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPushDescriptorSetInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPushDescriptorSetInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF, (mem)->(VkPushDescriptorSetInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderFloatControls2Features.html">VkPhysicalDeviceShaderFloatControls2Features</a>
	*/
	public interface VkPhysicalDeviceShaderFloatControls2Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderFloatControls2Features>{
		default VkPhysicalDeviceShaderFloatControls2Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.STYPE);
		}

		default VkPhysicalDeviceShaderFloatControls2Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.PNEXT);
		}

		default VkPhysicalDeviceShaderFloatControls2Features shaderFloatControls2(boolean shaderFloatControls2){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.SHADERFLOATCONTROLS2, shaderFloatControls2?1:0);
			return this;
		}

		default boolean shaderFloatControls2(){
			final var shaderFloatControls2_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.SHADERFLOATCONTROLS2);
			return shaderFloatControls2_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderFloatControls2Features from the given Arena.
		*/
		public static VkPhysicalDeviceShaderFloatControls2Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderFloatControls2Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderFloatControls2Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.SIZEOF, (mem)->(VkPhysicalDeviceShaderFloatControls2Features)()->mem);
		}

	}

	public interface VkAttachmentLoadOp extends io.github.kartoffell.klvulkan.VK10.VkAttachmentLoadOp{
		public static final int VK_ATTACHMENT_LOAD_OP_NONE = 1000400000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkLineRasterizationMode.html">VkLineRasterizationMode</a>
	*/
	public interface VkLineRasterizationMode{
		public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT = 0;

		public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR = 1;

		public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH = 3;

		public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindMemoryStatus.html">VkBindMemoryStatus</a>
	*/
	public interface VkBindMemoryStatus extends io.github.kartoffell.klvulkan.Element<VkBindMemoryStatus>{
		default VkBindMemoryStatus sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindMemoryStatus.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindMemoryStatus.STYPE);
		}

		default VkBindMemoryStatus pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindMemoryStatus.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindMemoryStatus.PNEXT);
		}

		default VkBindMemoryStatus pResult(IntBuffer pResult){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindMemoryStatus.PRESULT, (pResult==null?MemorySegment.NULL:MemorySegment.ofBuffer(pResult)));
			return this;
		}

		default IntBuffer pResult(){
			final var pResult_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindMemoryStatus.PRESULT);
			return (pResult_.equals(MemorySegment.NULL)?null:pResult_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkBindMemoryStatus from the given Arena.
		*/
		public static VkBindMemoryStatus allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindMemoryStatus.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBindMemoryStatus from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBindMemoryStatus> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindMemoryStatus.SIZEOF, (mem)->(VkBindMemoryStatus)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceLineRasterizationFeatures.html">VkPhysicalDeviceLineRasterizationFeatures</a>
	*/
	public interface VkPhysicalDeviceLineRasterizationFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceLineRasterizationFeatures>{
		default VkPhysicalDeviceLineRasterizationFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STYPE);
		}

		default VkPhysicalDeviceLineRasterizationFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.PNEXT);
		}

		default VkPhysicalDeviceLineRasterizationFeatures rectangularLines(boolean rectangularLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.RECTANGULARLINES, rectangularLines?1:0);
			return this;
		}

		default boolean rectangularLines(){
			final var rectangularLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.RECTANGULARLINES);
			return rectangularLines_!=0;
		}

		default VkPhysicalDeviceLineRasterizationFeatures bresenhamLines(boolean bresenhamLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.BRESENHAMLINES, bresenhamLines?1:0);
			return this;
		}

		default boolean bresenhamLines(){
			final var bresenhamLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.BRESENHAMLINES);
			return bresenhamLines_!=0;
		}

		default VkPhysicalDeviceLineRasterizationFeatures smoothLines(boolean smoothLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.SMOOTHLINES, smoothLines?1:0);
			return this;
		}

		default boolean smoothLines(){
			final var smoothLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.SMOOTHLINES);
			return smoothLines_!=0;
		}

		default VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLines(boolean stippledRectangularLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDRECTANGULARLINES, stippledRectangularLines?1:0);
			return this;
		}

		default boolean stippledRectangularLines(){
			final var stippledRectangularLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDRECTANGULARLINES);
			return stippledRectangularLines_!=0;
		}

		default VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLines(boolean stippledBresenhamLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDBRESENHAMLINES, stippledBresenhamLines?1:0);
			return this;
		}

		default boolean stippledBresenhamLines(){
			final var stippledBresenhamLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDBRESENHAMLINES);
			return stippledBresenhamLines_!=0;
		}

		default VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLines(boolean stippledSmoothLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDSMOOTHLINES, stippledSmoothLines?1:0);
			return this;
		}

		default boolean stippledSmoothLines(){
			final var stippledSmoothLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDSMOOTHLINES);
			return stippledSmoothLines_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceLineRasterizationFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceLineRasterizationFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceLineRasterizationFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceLineRasterizationFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.SIZEOF, (mem)->(VkPhysicalDeviceLineRasterizationFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVertexAttributeDivisorProperties.html">VkPhysicalDeviceVertexAttributeDivisorProperties</a>
	*/
	public interface VkPhysicalDeviceVertexAttributeDivisorProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVertexAttributeDivisorProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.PNEXT);
		}

		/**
		max value of vertex attribute divisor
		*/
		default int maxVertexAttribDivisor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.MAXVERTEXATTRIBDIVISOR);
		}

		default boolean supportsNonZeroFirstInstance(){
			final var supportsNonZeroFirstInstance_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.SUPPORTSNONZEROFIRSTINSTANCE);
			return supportsNonZeroFirstInstance_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVertexAttributeDivisorProperties from the given Arena.
		*/
		public static VkPhysicalDeviceVertexAttributeDivisorProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVertexAttributeDivisorProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVertexAttributeDivisorProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.SIZEOF, (mem)->(VkPhysicalDeviceVertexAttributeDivisorProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryUnmapInfo.html">VkMemoryUnmapInfo</a>
	*/
	public interface VkMemoryUnmapInfo extends io.github.kartoffell.klvulkan.Element<VkMemoryUnmapInfo>{
		default VkMemoryUnmapInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryUnmapInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryUnmapInfo.STYPE);
		}

		default VkMemoryUnmapInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryUnmapInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryUnmapInfo.PNEXT);
		}

		default VkMemoryUnmapInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryUnmapInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryUnmapInfo.FLAGS);
		}

		default VkMemoryUnmapInfo memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryUnmapInfo.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryUnmapInfo.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryUnmapInfo from the given Arena.
		*/
		public static VkMemoryUnmapInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryUnmapInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryUnmapInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryUnmapInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryUnmapInfo.SIZEOF, (mem)->(VkMemoryUnmapInfo)()->mem);
		}

	}

	public interface VkSubgroupFeatureFlagBits extends io.github.kartoffell.klvulkan.VK11.VkSubgroupFeatureFlagBits{
		public static final int VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT = 1024;

		public static final int VK_SUBGROUP_FEATURE_ROTATE_BIT = 512;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevicePipelineRobustnessProperties.html">VkPhysicalDevicePipelineRobustnessProperties</a>
	*/
	public interface VkPhysicalDevicePipelineRobustnessProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDevicePipelineRobustnessProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.PNEXT);
		}

		default int defaultRobustnessStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSSTORAGEBUFFERS);
		}

		default int defaultRobustnessUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSUNIFORMBUFFERS);
		}

		default int defaultRobustnessVertexInputs(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSVERTEXINPUTS);
		}

		default int defaultRobustnessImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSIMAGES);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDevicePipelineRobustnessProperties from the given Arena.
		*/
		public static VkPhysicalDevicePipelineRobustnessProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDevicePipelineRobustnessProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDevicePipelineRobustnessProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessProperties.SIZEOF, (mem)->(VkPhysicalDevicePipelineRobustnessProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineRobustnessBufferBehavior.html">VkPipelineRobustnessBufferBehavior</a>
	*/
	public interface VkPipelineRobustnessBufferBehavior{
		public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED = 1;

		public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 = 3;

		public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT = 0;

		public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderingAttachmentLocationInfo.html">VkRenderingAttachmentLocationInfo</a>
	*/
	public interface VkRenderingAttachmentLocationInfo extends io.github.kartoffell.klvulkan.Element<VkRenderingAttachmentLocationInfo>{
		default VkRenderingAttachmentLocationInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.STYPE);
		}

		default VkRenderingAttachmentLocationInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.PNEXT);
		}

		default VkRenderingAttachmentLocationInfo colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.COLORATTACHMENTCOUNT);
		}

		default VkRenderingAttachmentLocationInfo pColorAttachmentLocations(IntBuffer pColorAttachmentLocations){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.PCOLORATTACHMENTLOCATIONS, (pColorAttachmentLocations==null?MemorySegment.NULL:MemorySegment.ofBuffer(pColorAttachmentLocations)));
			return this;
		}

		default IntBuffer pColorAttachmentLocations(){
			final var pColorAttachmentLocations_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.PCOLORATTACHMENTLOCATIONS);
			return (pColorAttachmentLocations_.equals(MemorySegment.NULL)?null:pColorAttachmentLocations_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderingAttachmentLocationInfo from the given Arena.
		*/
		public static VkRenderingAttachmentLocationInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderingAttachmentLocationInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderingAttachmentLocationInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.SIZEOF, (mem)->(VkRenderingAttachmentLocationInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceHostImageCopyFeatures.html">VkPhysicalDeviceHostImageCopyFeatures</a>
	*/
	public interface VkPhysicalDeviceHostImageCopyFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceHostImageCopyFeatures>{
		default VkPhysicalDeviceHostImageCopyFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.STYPE);
		}

		default VkPhysicalDeviceHostImageCopyFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.PNEXT);
		}

		default VkPhysicalDeviceHostImageCopyFeatures hostImageCopy(boolean hostImageCopy){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.HOSTIMAGECOPY, hostImageCopy?1:0);
			return this;
		}

		default boolean hostImageCopy(){
			final var hostImageCopy_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.HOSTIMAGECOPY);
			return hostImageCopy_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceHostImageCopyFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceHostImageCopyFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceHostImageCopyFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceHostImageCopyFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.SIZEOF, (mem)->(VkPhysicalDeviceHostImageCopyFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCreateFlags2CreateInfo.html">VkPipelineCreateFlags2CreateInfo</a>
	*/
	public interface VkPipelineCreateFlags2CreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineCreateFlags2CreateInfo>{
		default VkPipelineCreateFlags2CreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.STYPE);
		}

		default VkPipelineCreateFlags2CreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.PNEXT);
		}

		default VkPipelineCreateFlags2CreateInfo flags(long flags){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default long flags(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineCreateFlags2CreateInfo from the given Arena.
		*/
		public static VkPipelineCreateFlags2CreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineCreateFlags2CreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineCreateFlags2CreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.SIZEOF, (mem)->(VkPipelineCreateFlags2CreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkHostImageCopyDevicePerformanceQuery.html">VkHostImageCopyDevicePerformanceQuery</a>
	*/
	public interface VkHostImageCopyDevicePerformanceQuery extends io.github.kartoffell.klvulkan.Element<VkHostImageCopyDevicePerformanceQuery>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.PNEXT);
		}

		/**
		Specifies if device access is optimal
		*/
		default boolean optimalDeviceAccess(){
			final var optimalDeviceAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.OPTIMALDEVICEACCESS);
			return optimalDeviceAccess_!=0;
		}

		/**
		Specifies if memory layout is identical
		*/
		default boolean identicalMemoryLayout(){
			final var identicalMemoryLayout_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.IDENTICALMEMORYLAYOUT);
			return identicalMemoryLayout_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkHostImageCopyDevicePerformanceQuery from the given Arena.
		*/
		public static VkHostImageCopyDevicePerformanceQuery allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkHostImageCopyDevicePerformanceQuery from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkHostImageCopyDevicePerformanceQuery> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.SIZEOF, (mem)->(VkHostImageCopyDevicePerformanceQuery)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMaintenance6Features.html">VkPhysicalDeviceMaintenance6Features</a>
	*/
	public interface VkPhysicalDeviceMaintenance6Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceMaintenance6Features>{
		default VkPhysicalDeviceMaintenance6Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.STYPE);
		}

		default VkPhysicalDeviceMaintenance6Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.PNEXT);
		}

		default VkPhysicalDeviceMaintenance6Features maintenance6(boolean maintenance6){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.MAINTENANCE6, maintenance6?1:0);
			return this;
		}

		default boolean maintenance6(){
			final var maintenance6_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.MAINTENANCE6);
			return maintenance6_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceMaintenance6Features from the given Arena.
		*/
		public static VkPhysicalDeviceMaintenance6Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceMaintenance6Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceMaintenance6Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.SIZEOF, (mem)->(VkPhysicalDeviceMaintenance6Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevicePipelineProtectedAccessFeatures.html">VkPhysicalDevicePipelineProtectedAccessFeatures</a>
	*/
	public interface VkPhysicalDevicePipelineProtectedAccessFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDevicePipelineProtectedAccessFeatures>{
		default VkPhysicalDevicePipelineProtectedAccessFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.STYPE);
		}

		default VkPhysicalDevicePipelineProtectedAccessFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.PNEXT);
		}

		default VkPhysicalDevicePipelineProtectedAccessFeatures pipelineProtectedAccess(boolean pipelineProtectedAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.PIPELINEPROTECTEDACCESS, pipelineProtectedAccess?1:0);
			return this;
		}

		default boolean pipelineProtectedAccess(){
			final var pipelineProtectedAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.PIPELINEPROTECTEDACCESS);
			return pipelineProtectedAccess_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDevicePipelineProtectedAccessFeatures from the given Arena.
		*/
		public static VkPhysicalDevicePipelineProtectedAccessFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDevicePipelineProtectedAccessFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDevicePipelineProtectedAccessFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.SIZEOF, (mem)->(VkPhysicalDevicePipelineProtectedAccessFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueueFamilyGlobalPriorityProperties.html">VkQueueFamilyGlobalPriorityProperties</a>
	*/
	public interface VkQueueFamilyGlobalPriorityProperties extends io.github.kartoffell.klvulkan.Element<VkQueueFamilyGlobalPriorityProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityProperties.PNEXT);
		}

		default int priorityCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityProperties.PRIORITYCOUNT);
		}

		default IntBuffer priorities(){
			final var priorities_ = address().asSlice(org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityProperties.PRIORITIES, 4*API_Constants.VK_MAX_GLOBAL_PRIORITY_SIZE);
			return (priorities_.equals(MemorySegment.NULL)?null:priorities_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkQueueFamilyGlobalPriorityProperties from the given Arena.
		*/
		public static VkQueueFamilyGlobalPriorityProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkQueueFamilyGlobalPriorityProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkQueueFamilyGlobalPriorityProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityProperties.SIZEOF, (mem)->(VkQueueFamilyGlobalPriorityProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevicePipelineRobustnessFeatures.html">VkPhysicalDevicePipelineRobustnessFeatures</a>
	*/
	public interface VkPhysicalDevicePipelineRobustnessFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDevicePipelineRobustnessFeatures>{
		default VkPhysicalDevicePipelineRobustnessFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.STYPE);
		}

		default VkPhysicalDevicePipelineRobustnessFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.PNEXT);
		}

		default VkPhysicalDevicePipelineRobustnessFeatures pipelineRobustness(boolean pipelineRobustness){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.PIPELINEROBUSTNESS, pipelineRobustness?1:0);
			return this;
		}

		default boolean pipelineRobustness(){
			final var pipelineRobustness_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.PIPELINEROBUSTNESS);
			return pipelineRobustness_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDevicePipelineRobustnessFeatures from the given Arena.
		*/
		public static VkPhysicalDevicePipelineRobustnessFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDevicePipelineRobustnessFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDevicePipelineRobustnessFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.SIZEOF, (mem)->(VkPhysicalDevicePipelineRobustnessFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageToMemoryCopy.html">VkImageToMemoryCopy</a>
	*/
	public interface VkImageToMemoryCopy extends io.github.kartoffell.klvulkan.Element<VkImageToMemoryCopy>{
		default VkImageToMemoryCopy sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageToMemoryCopy.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageToMemoryCopy.STYPE);
		}

		default VkImageToMemoryCopy pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageToMemoryCopy.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageToMemoryCopy.PNEXT);
		}

		default VkImageToMemoryCopy pHostPointer(MemorySegment pHostPointer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageToMemoryCopy.PHOSTPOINTER, pHostPointer);
			return this;
		}

		default MemorySegment pHostPointer(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageToMemoryCopy.PHOSTPOINTER);
		}

		/**
		Specified in texels
		*/
		default VkImageToMemoryCopy memoryRowLength(int memoryRowLength){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageToMemoryCopy.MEMORYROWLENGTH, memoryRowLength);
			return this;
		}

		/**
		Specified in texels
		*/
		default int memoryRowLength(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageToMemoryCopy.MEMORYROWLENGTH);
		}

		default VkImageToMemoryCopy memoryImageHeight(int memoryImageHeight){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageToMemoryCopy.MEMORYIMAGEHEIGHT, memoryImageHeight);
			return this;
		}

		default int memoryImageHeight(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageToMemoryCopy.MEMORYIMAGEHEIGHT);
		}

		default VkImageSubresourceLayers imageSubresource(){
			final var imageSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageToMemoryCopy.IMAGESUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (imageSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->imageSubresource_);
		}

		default VkOffset3D imageOffset(){
			final var imageOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageToMemoryCopy.IMAGEOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (imageOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->imageOffset_);
		}

		default VkExtent3D imageExtent(){
			final var imageExtent_ = address().asSlice(org.lwjgl.vulkan.VkImageToMemoryCopy.IMAGEEXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (imageExtent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->imageExtent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageToMemoryCopy from the given Arena.
		*/
		public static VkImageToMemoryCopy allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageToMemoryCopy.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageToMemoryCopy from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageToMemoryCopy> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageToMemoryCopy.SIZEOF, (mem)->(VkImageToMemoryCopy)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceDynamicRenderingLocalReadFeatures.html">VkPhysicalDeviceDynamicRenderingLocalReadFeatures</a>
	*/
	public interface VkPhysicalDeviceDynamicRenderingLocalReadFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceDynamicRenderingLocalReadFeatures>{
		default VkPhysicalDeviceDynamicRenderingLocalReadFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.STYPE);
		}

		default VkPhysicalDeviceDynamicRenderingLocalReadFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.PNEXT);
		}

		default VkPhysicalDeviceDynamicRenderingLocalReadFeatures dynamicRenderingLocalRead(boolean dynamicRenderingLocalRead){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.DYNAMICRENDERINGLOCALREAD, dynamicRenderingLocalRead?1:0);
			return this;
		}

		default boolean dynamicRenderingLocalRead(){
			final var dynamicRenderingLocalRead_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.DYNAMICRENDERINGLOCALREAD);
			return dynamicRenderingLocalRead_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceDynamicRenderingLocalReadFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceDynamicRenderingLocalReadFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingLocalReadFeatures.SIZEOF, (mem)->(VkPhysicalDeviceDynamicRenderingLocalReadFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceImageSubresourceInfo.html">VkDeviceImageSubresourceInfo</a>
	*/
	public interface VkDeviceImageSubresourceInfo extends io.github.kartoffell.klvulkan.Element<VkDeviceImageSubresourceInfo>{
		default VkDeviceImageSubresourceInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.STYPE);
		}

		default VkDeviceImageSubresourceInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.PNEXT);
		}

		default VkDeviceImageSubresourceInfo pCreateInfo(Element<VkImageCreateInfo> pCreateInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.PCREATEINFO, (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()));
			return this;
		}

		default Element<VkImageCreateInfo> pCreateInfo(){
			final var pCreateInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.PCREATEINFO);
			return (pCreateInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pCreateInfo_, org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF, (v1756573246)->(v1756573246.equals(MemorySegment.NULL)?null:(VkImageCreateInfo)()->v1756573246)));
		}

		default VkDeviceImageSubresourceInfo pSubresource(Element<VkImageSubresource2> pSubresource){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.PSUBRESOURCE, (pSubresource==null?MemorySegment.NULL:pSubresource.address()));
			return this;
		}

		default Element<VkImageSubresource2> pSubresource(){
			final var pSubresource_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.PSUBRESOURCE);
			return (pSubresource_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pSubresource_, org.lwjgl.vulkan.VkImageSubresource2.SIZEOF, (v198112003)->(v198112003.equals(MemorySegment.NULL)?null:(VkImageSubresource2)()->v198112003)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDeviceImageSubresourceInfo from the given Arena.
		*/
		public static VkDeviceImageSubresourceInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDeviceImageSubresourceInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDeviceImageSubresourceInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.SIZEOF, (mem)->(VkDeviceImageSubresourceInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubresourceLayout2.html">VkSubresourceLayout2</a>
	*/
	public interface VkSubresourceLayout2 extends io.github.kartoffell.klvulkan.Element<VkSubresourceLayout2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubresourceLayout2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubresourceLayout2.PNEXT);
		}

		default VkSubresourceLayout subresourceLayout(){
			final var subresourceLayout_ = address().asSlice(org.lwjgl.vulkan.VkSubresourceLayout2.SUBRESOURCELAYOUT, org.lwjgl.vulkan.VkSubresourceLayout.SIZEOF);
			return (subresourceLayout_.equals(MemorySegment.NULL)?null:(VkSubresourceLayout)()->subresourceLayout_);
		}

		MemorySegment address();

		/**
		Allocates a new VkSubresourceLayout2 from the given Arena.
		*/
		public static VkSubresourceLayout2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubresourceLayout2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubresourceLayout2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubresourceLayout2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubresourceLayout2.SIZEOF, (mem)->(VkSubresourceLayout2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkVertexInputBindingDivisorDescription.html">VkVertexInputBindingDivisorDescription</a>
	*/
	public interface VkVertexInputBindingDivisorDescription extends io.github.kartoffell.klvulkan.Element<VkVertexInputBindingDivisorDescription>{
		default VkVertexInputBindingDivisorDescription binding(int binding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.BINDING, binding);
			return this;
		}

		default int binding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.BINDING);
		}

		default VkVertexInputBindingDivisorDescription divisor(int divisor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.DIVISOR, divisor);
			return this;
		}

		default int divisor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.DIVISOR);
		}

		MemorySegment address();

		/**
		Allocates a new VkVertexInputBindingDivisorDescription from the given Arena.
		*/
		public static VkVertexInputBindingDivisorDescription allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkVertexInputBindingDivisorDescription from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkVertexInputBindingDivisorDescription> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.SIZEOF, (mem)->(VkVertexInputBindingDivisorDescription)()->mem);
		}

	}

	public interface VkImageUsageFlagBits extends io.github.kartoffell.klvulkan.VK10.VkImageUsageFlagBits{
		public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT = 4194304;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderingAreaInfo.html">VkRenderingAreaInfo</a>
	*/
	public interface VkRenderingAreaInfo extends io.github.kartoffell.klvulkan.Element<VkRenderingAreaInfo>{
		default VkRenderingAreaInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.STYPE);
		}

		default VkRenderingAreaInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAreaInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAreaInfo.PNEXT);
		}

		default VkRenderingAreaInfo viewMask(int viewMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.VIEWMASK, viewMask);
			return this;
		}

		default int viewMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.VIEWMASK);
		}

		default VkRenderingAreaInfo colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.COLORATTACHMENTCOUNT);
		}

		default VkRenderingAreaInfo pColorAttachmentFormats(IntBuffer pColorAttachmentFormats){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAreaInfo.PCOLORATTACHMENTFORMATS, (pColorAttachmentFormats==null?MemorySegment.NULL:MemorySegment.ofBuffer(pColorAttachmentFormats)));
			return this;
		}

		default IntBuffer pColorAttachmentFormats(){
			final var pColorAttachmentFormats_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderingAreaInfo.PCOLORATTACHMENTFORMATS);
			return (pColorAttachmentFormats_.equals(MemorySegment.NULL)?null:pColorAttachmentFormats_.asByteBuffer().asIntBuffer());
		}

		default VkRenderingAreaInfo depthAttachmentFormat(int depthAttachmentFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.DEPTHATTACHMENTFORMAT, depthAttachmentFormat);
			return this;
		}

		default int depthAttachmentFormat(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.DEPTHATTACHMENTFORMAT);
		}

		default VkRenderingAreaInfo stencilAttachmentFormat(int stencilAttachmentFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.STENCILATTACHMENTFORMAT, stencilAttachmentFormat);
			return this;
		}

		default int stencilAttachmentFormat(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderingAreaInfo.STENCILATTACHMENTFORMAT);
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderingAreaInfo from the given Arena.
		*/
		public static VkRenderingAreaInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderingAreaInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderingAreaInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderingAreaInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderingAreaInfo.SIZEOF, (mem)->(VkRenderingAreaInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevicePushDescriptorProperties.html">VkPhysicalDevicePushDescriptorProperties</a>
	*/
	public interface VkPhysicalDevicePushDescriptorProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDevicePushDescriptorProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.PNEXT);
		}

		default int maxPushDescriptors(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.MAXPUSHDESCRIPTORS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDevicePushDescriptorProperties from the given Arena.
		*/
		public static VkPhysicalDevicePushDescriptorProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDevicePushDescriptorProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDevicePushDescriptorProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.SIZEOF, (mem)->(VkPhysicalDevicePushDescriptorProperties)()->mem);
		}

	}

	protected final VkCapabilitiesGlobal capabilities = new VkCapabilitiesGlobal();

	public VkCapabilitiesGlobal capabilities() {
		return capabilities;
	}

	public static void checkError(int code) {
		VK13.checkError(code);
		switch (code) {
			case 1000174001 -> throw new VK_ERROR_NOT_PERMITTED();

		}
	}

}
