package io.github.kartoffell.KLVulkan;
import io.github.kartoffell.KLVulkan.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import java.nio.file.*;
import java.io.*;
import org.jspecify.annotations.*;
import org.lwjgl.system.*;
import java.nio.*;
import java.util.*;
import io.github.kartoffell.KLVulkan.*;
// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
/**
Vulkan 1.1 core API interface definitions (merged)
*/
public class VK11 extends io.github.kartoffell.KLVulkan.VK10{
	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindBufferMemoryDeviceGroupInfo.html">VkBindBufferMemoryDeviceGroupInfo</a>
	*/
	public interface VkBindBufferMemoryDeviceGroupInfo extends io.github.kartoffell.KLVulkan.Element<VkBindBufferMemoryDeviceGroupInfo>{
		default VkBindBufferMemoryDeviceGroupInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.STYPE);
		}

		default VkBindBufferMemoryDeviceGroupInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.PNEXT);
		}

		default VkBindBufferMemoryDeviceGroupInfo deviceIndexCount(int deviceIndexCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.DEVICEINDEXCOUNT, deviceIndexCount);
			return this;
		}

		@Nullable
		default int deviceIndexCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.DEVICEINDEXCOUNT);
		}

		default VkBindBufferMemoryDeviceGroupInfo pDeviceIndices(IntBuffer pDeviceIndices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.PDEVICEINDICES, (pDeviceIndices==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDeviceIndices)));
			return this;
		}

		default IntBuffer pDeviceIndices(){
			final var pDeviceIndices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.PDEVICEINDICES);
			return (pDeviceIndices_.equals(MemorySegment.NULL)?null:pDeviceIndices_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		public static VkBindBufferMemoryDeviceGroupInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkBindBufferMemoryDeviceGroupInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.SIZEOF, (mem)->(VkBindBufferMemoryDeviceGroupInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineTessellationDomainOriginStateCreateInfo.html">VkPipelineTessellationDomainOriginStateCreateInfo</a>
	*/
	public interface VkPipelineTessellationDomainOriginStateCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkPipelineTessellationDomainOriginStateCreateInfo>{
		default VkPipelineTessellationDomainOriginStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.STYPE);
		}

		default VkPipelineTessellationDomainOriginStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.PNEXT);
		}

		default VkPipelineTessellationDomainOriginStateCreateInfo domainOrigin(int domainOrigin){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.DOMAINORIGIN, domainOrigin);
			return this;
		}

		default int domainOrigin(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.DOMAINORIGIN);
		}

		MemorySegment address();

		public static VkPipelineTessellationDomainOriginStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPipelineTessellationDomainOriginStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.SIZEOF, (mem)->(VkPipelineTessellationDomainOriginStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMultiviewProperties.html">VkPhysicalDeviceMultiviewProperties</a>
	*/
	public interface VkPhysicalDeviceMultiviewProperties extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceMultiviewProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties.PNEXT);
		}

		/**
		max number of views in a subpass
		*/
		default int maxMultiviewViewCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties.MAXMULTIVIEWVIEWCOUNT);
		}

		/**
		max instance index for a draw in a multiview subpass
		*/
		default int maxMultiviewInstanceIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties.MAXMULTIVIEWINSTANCEINDEX);
		}

		MemorySegment address();

		public static VkPhysicalDeviceMultiviewProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceMultiviewProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties.SIZEOF, (mem)->(VkPhysicalDeviceMultiviewProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalSemaphoreFeatureFlagBits.html">VkExternalSemaphoreFeatureFlagBits</a>
	*/
	public interface VkExternalSemaphoreFeatureFlagBits{
		public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT = 2;

		public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT = 1;

	}

	public interface VkImageLayout extends io.github.kartoffell.KLVulkan.VK10.VkImageLayout{
		public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = 1000117001;

		public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = 1000117000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPassInputAttachmentAspectCreateInfo.html">VkRenderPassInputAttachmentAspectCreateInfo</a>
	*/
	public interface VkRenderPassInputAttachmentAspectCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkRenderPassInputAttachmentAspectCreateInfo>{
		default VkRenderPassInputAttachmentAspectCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.STYPE);
		}

		default VkRenderPassInputAttachmentAspectCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.PNEXT);
		}

		default VkRenderPassInputAttachmentAspectCreateInfo aspectReferenceCount(int aspectReferenceCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.ASPECTREFERENCECOUNT, aspectReferenceCount);
			return this;
		}

		default int aspectReferenceCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.ASPECTREFERENCECOUNT);
		}

		default VkRenderPassInputAttachmentAspectCreateInfo pAspectReferences(Element<VkInputAttachmentAspectReference> pAspectReferences){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.PASPECTREFERENCES, (pAspectReferences==null?MemorySegment.NULL:pAspectReferences.address()));
			return this;
		}

		default Element<VkInputAttachmentAspectReference> pAspectReferences(){
			final var pAspectReferences_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.PASPECTREFERENCES);
			return (pAspectReferences_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pAspectReferences_, org.lwjgl.vulkan.VkInputAttachmentAspectReference.SIZEOF, (v1266265220)->(v1266265220.equals(MemorySegment.NULL)?null:(VkInputAttachmentAspectReference)()->v1266265220)));
		}

		MemorySegment address();

		public static VkRenderPassInputAttachmentAspectCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkRenderPassInputAttachmentAspectCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.SIZEOF, (mem)->(VkRenderPassInputAttachmentAspectCreateInfo)()->mem);
		}

	}

	public interface VkImageCreateFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkImageCreateFlagBits{
		public static final int VK_IMAGE_CREATE_ALIAS_BIT = 1024;

		public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 64;

		public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = 32;

		public static final int VK_IMAGE_CREATE_PROTECTED_BIT = 2048;

		public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 128;

		public static final int VK_IMAGE_CREATE_DISJOINT_BIT = 512;

		public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT = 256;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVariablePointersFeatures.html">VkPhysicalDeviceVariablePointersFeatures</a>
	*/
	public interface VkPhysicalDeviceVariablePointersFeatures extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceVariablePointersFeatures>{
		default VkPhysicalDeviceVariablePointersFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.STYPE);
		}

		default VkPhysicalDeviceVariablePointersFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.PNEXT);
		}

		default VkPhysicalDeviceVariablePointersFeatures variablePointersStorageBuffer(boolean variablePointersStorageBuffer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERSSTORAGEBUFFER, variablePointersStorageBuffer?1:0);
			return this;
		}

		default boolean variablePointersStorageBuffer(){
			final var variablePointersStorageBuffer_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERSSTORAGEBUFFER);
			return variablePointersStorageBuffer_!=0;
		}

		default VkPhysicalDeviceVariablePointersFeatures variablePointers(boolean variablePointers){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERS, variablePointers?1:0);
			return this;
		}

		default boolean variablePointers(){
			final var variablePointers_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.VARIABLEPOINTERS);
			return variablePointers_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceVariablePointersFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceVariablePointersFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.SIZEOF, (mem)->(VkPhysicalDeviceVariablePointersFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueueFamilyProperties2.html">VkQueueFamilyProperties2</a>
	*/
	public interface VkQueueFamilyProperties2 extends io.github.kartoffell.KLVulkan.Element<VkQueueFamilyProperties2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueueFamilyProperties2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkQueueFamilyProperties2.PNEXT);
		}

		default VkQueueFamilyProperties queueFamilyProperties(){
			final var queueFamilyProperties_ = address().asSlice(org.lwjgl.vulkan.VkQueueFamilyProperties2.QUEUEFAMILYPROPERTIES, org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF);
			return (queueFamilyProperties_.equals(MemorySegment.NULL)?null:(VkQueueFamilyProperties)()->queueFamilyProperties_);
		}

		MemorySegment address();

		public static VkQueueFamilyProperties2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkQueueFamilyProperties2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkQueueFamilyProperties2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkQueueFamilyProperties2.SIZEOF, (mem)->(VkQueueFamilyProperties2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFenceImportFlagBits.html">VkFenceImportFlagBits</a>
	*/
	public interface VkFenceImportFlagBits{
		public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkChromaLocation.html">VkChromaLocation</a>
	*/
	public interface VkChromaLocation{
		public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;

		public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalMemoryHandleTypeFlagBits.html">VkExternalMemoryHandleTypeFlagBits</a>
	*/
	public interface VkExternalMemoryHandleTypeFlagBits{
		public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT = 1;

		public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT = 64;

		public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;

		public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT = 16;

		public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT = 8;

		public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;

		public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT = 32;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerYcbcrModelConversion.html">VkSamplerYcbcrModelConversion</a>
	*/
	public interface VkSamplerYcbcrModelConversion{
		public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;

		public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 = 3;

		public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 = 4;

		public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;

		public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderDrawParametersFeatures.html">VkPhysicalDeviceShaderDrawParametersFeatures</a>
	*/
	public interface VkPhysicalDeviceShaderDrawParametersFeatures extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceShaderDrawParametersFeatures>{
		default VkPhysicalDeviceShaderDrawParametersFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.STYPE);
		}

		default VkPhysicalDeviceShaderDrawParametersFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.PNEXT);
		}

		default VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParameters(boolean shaderDrawParameters){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.SHADERDRAWPARAMETERS, shaderDrawParameters?1:0);
			return this;
		}

		default boolean shaderDrawParameters(){
			final var shaderDrawParameters_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.SHADERDRAWPARAMETERS);
			return shaderDrawParameters_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceShaderDrawParametersFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceShaderDrawParametersFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.SIZEOF, (mem)->(VkPhysicalDeviceShaderDrawParametersFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalSemaphoreHandleTypeFlagBits.html">VkExternalSemaphoreHandleTypeFlagBits</a>
	*/
	public interface VkExternalSemaphoreHandleTypeFlagBits{
		public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT = 16;

		public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;

		public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;

		public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;

		public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT = 8;

		public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT = 8;

	}

	public static class VkDevice extends io.github.kartoffell.KLVulkan.VK10.VkDevice{
		public VkDevice(MemorySegment address, VkPhysicalDevice parent) {
			super(address, parent);
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetBufferMemoryRequirements2.html">vkGetBufferMemoryRequirements2</a>
		*/
		public void vkGetBufferMemoryRequirements2(Element<VkBufferMemoryRequirementsInfo2> pInfo, Element<VkMemoryRequirements2> pMemoryRequirements) {
			if(capabilities.vkGetBufferMemoryRequirements2_==null) {
				capabilities.vkGetBufferMemoryRequirements2_ = capabilities.lookup("vkGetBufferMemoryRequirements2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetBufferMemoryRequirements2_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()), (pMemoryRequirements==null?MemorySegment.NULL:pMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroySamplerYcbcrConversion.html">vkDestroySamplerYcbcrConversion</a>
		*/
		public void vkDestroySamplerYcbcrConversion(@Nullable Element<? extends VkSamplerYcbcrConversion> ycbcrConversion, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroySamplerYcbcrConversion_==null) {
				capabilities.vkDestroySamplerYcbcrConversion_ = capabilities.lookup("vkDestroySamplerYcbcrConversion", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroySamplerYcbcrConversion_.invoke(address(), (ycbcrConversion==null?MemorySegment.NULL:ycbcrConversion.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkBindImageMemory2.html">vkBindImageMemory2</a>
		*/
		public void vkBindImageMemory2(int bindInfoCount, Element<VkBindImageMemoryInfo> pBindInfos) {
			if(capabilities.vkBindImageMemory2_==null) {
				capabilities.vkBindImageMemory2_ = capabilities.lookup("vkBindImageMemory2", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkBindImageMemory2_.invoke(address(), bindInfoCount, (pBindInfos==null?MemorySegment.NULL:pBindInfos.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateSamplerYcbcrConversion.html">vkCreateSamplerYcbcrConversion</a>
		*/
		public void vkCreateSamplerYcbcrConversion(Element<VkSamplerYcbcrConversionCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkSamplerYcbcrConversion>> pYcbcrConversion) {
			if(capabilities.vkCreateSamplerYcbcrConversion_==null) {
				capabilities.vkCreateSamplerYcbcrConversion_ = capabilities.lookup("vkCreateSamplerYcbcrConversion", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateSamplerYcbcrConversion_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pYcbcrConversion==null?MemorySegment.NULL:pYcbcrConversion.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkTrimCommandPool.html">vkTrimCommandPool</a>
		*/
		public void vkTrimCommandPool(Element<? extends VkCommandPool> commandPool, @Nullable int flags) {
			if(capabilities.vkTrimCommandPool_==null) {
				capabilities.vkTrimCommandPool_ = capabilities.lookup("vkTrimCommandPool", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkTrimCommandPool_.invoke(address(), (commandPool==null?MemorySegment.NULL:commandPool.address()), flags);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateDescriptorUpdateTemplate.html">vkCreateDescriptorUpdateTemplate</a>
		*/
		public void vkCreateDescriptorUpdateTemplate(Element<VkDescriptorUpdateTemplateCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkDescriptorUpdateTemplate>> pDescriptorUpdateTemplate) {
			if(capabilities.vkCreateDescriptorUpdateTemplate_==null) {
				capabilities.vkCreateDescriptorUpdateTemplate_ = capabilities.lookup("vkCreateDescriptorUpdateTemplate", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateDescriptorUpdateTemplate_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pDescriptorUpdateTemplate==null?MemorySegment.NULL:pDescriptorUpdateTemplate.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkUpdateDescriptorSetWithTemplate.html">vkUpdateDescriptorSetWithTemplate</a>
		*/
		public void vkUpdateDescriptorSetWithTemplate(Element<? extends VkDescriptorSet> descriptorSet, Element<? extends VkDescriptorUpdateTemplate> descriptorUpdateTemplate, MemorySegment pData) {
			if(capabilities.vkUpdateDescriptorSetWithTemplate_==null) {
				capabilities.vkUpdateDescriptorSetWithTemplate_ = capabilities.lookup("vkUpdateDescriptorSetWithTemplate", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkUpdateDescriptorSetWithTemplate_.invoke(address(), (descriptorSet==null?MemorySegment.NULL:descriptorSet.address()), (descriptorUpdateTemplate==null?MemorySegment.NULL:descriptorUpdateTemplate.address()), pData);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkBindBufferMemory2.html">vkBindBufferMemory2</a>
		*/
		public void vkBindBufferMemory2(int bindInfoCount, Element<VkBindBufferMemoryInfo> pBindInfos) {
			if(capabilities.vkBindBufferMemory2_==null) {
				capabilities.vkBindBufferMemory2_ = capabilities.lookup("vkBindBufferMemory2", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkBindBufferMemory2_.invoke(address(), bindInfoCount, (pBindInfos==null?MemorySegment.NULL:pBindInfos.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetImageMemoryRequirements2.html">vkGetImageMemoryRequirements2</a>
		*/
		public void vkGetImageMemoryRequirements2(Element<VkImageMemoryRequirementsInfo2> pInfo, Element<VkMemoryRequirements2> pMemoryRequirements) {
			if(capabilities.vkGetImageMemoryRequirements2_==null) {
				capabilities.vkGetImageMemoryRequirements2_ = capabilities.lookup("vkGetImageMemoryRequirements2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetImageMemoryRequirements2_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()), (pMemoryRequirements==null?MemorySegment.NULL:pMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceQueue2.html">vkGetDeviceQueue2</a>
		*/
		public void vkGetDeviceQueue2(Element<VkDeviceQueueInfo2> pQueueInfo, PointerBuffer<? extends Element<? extends VkQueue>> pQueue) {
			if(capabilities.vkGetDeviceQueue2_==null) {
				capabilities.vkGetDeviceQueue2_ = capabilities.lookup("vkGetDeviceQueue2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceQueue2_.invoke(address(), (pQueueInfo==null?MemorySegment.NULL:pQueueInfo.address()), (pQueue==null?MemorySegment.NULL:pQueue.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetImageSparseMemoryRequirements2.html">vkGetImageSparseMemoryRequirements2</a>
		*/
		public void vkGetImageSparseMemoryRequirements2(Element<VkImageSparseMemoryRequirementsInfo2> pInfo, IntBuffer pSparseMemoryRequirementCount, @Nullable Element<VkSparseImageMemoryRequirements2> pSparseMemoryRequirements) {
			if(capabilities.vkGetImageSparseMemoryRequirements2_==null) {
				capabilities.vkGetImageSparseMemoryRequirements2_ = capabilities.lookup("vkGetImageSparseMemoryRequirements2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetImageSparseMemoryRequirements2_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()), (pSparseMemoryRequirementCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pSparseMemoryRequirementCount)), (pSparseMemoryRequirements==null?MemorySegment.NULL:pSparseMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceGroupPeerMemoryFeatures.html">vkGetDeviceGroupPeerMemoryFeatures</a>
		*/
		public void vkGetDeviceGroupPeerMemoryFeatures(int heapIndex, int localDeviceIndex, int remoteDeviceIndex, IntBuffer pPeerMemoryFeatures) {
			if(capabilities.vkGetDeviceGroupPeerMemoryFeatures_==null) {
				capabilities.vkGetDeviceGroupPeerMemoryFeatures_ = capabilities.lookup("vkGetDeviceGroupPeerMemoryFeatures", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceGroupPeerMemoryFeatures_.invoke(address(), heapIndex, localDeviceIndex, remoteDeviceIndex, (pPeerMemoryFeatures==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPeerMemoryFeatures)));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyDescriptorUpdateTemplate.html">vkDestroyDescriptorUpdateTemplate</a>
		*/
		public void vkDestroyDescriptorUpdateTemplate(@Nullable Element<? extends VkDescriptorUpdateTemplate> descriptorUpdateTemplate, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyDescriptorUpdateTemplate_==null) {
				capabilities.vkDestroyDescriptorUpdateTemplate_ = capabilities.lookup("vkDestroyDescriptorUpdateTemplate", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyDescriptorUpdateTemplate_.invoke(address(), (descriptorUpdateTemplate==null?MemorySegment.NULL:descriptorUpdateTemplate.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDescriptorSetLayoutSupport.html">vkGetDescriptorSetLayoutSupport</a>
		*/
		public void vkGetDescriptorSetLayoutSupport(Element<VkDescriptorSetLayoutCreateInfo> pCreateInfo, Element<VkDescriptorSetLayoutSupport> pSupport) {
			if(capabilities.vkGetDescriptorSetLayoutSupport_==null) {
				capabilities.vkGetDescriptorSetLayoutSupport_ = capabilities.lookup("vkGetDescriptorSetLayoutSupport", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDescriptorSetLayoutSupport_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pSupport==null?MemorySegment.NULL:pSupport.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		protected VkSamplerYcbcrConversion VkSamplerYcbcrConversion(MemorySegment mem, Object parent) {
			return new VkSamplerYcbcrConversion(mem, (VkDevice) parent);
		}

		protected VkDescriptorUpdateTemplate VkDescriptorUpdateTemplate(MemorySegment mem, Object parent) {
			return new VkDescriptorUpdateTemplate(mem, (VkDevice) parent);
		}

		protected VkCommandBuffer VkCommandBuffer(MemorySegment mem, Object parent) {
			return new VkCommandBuffer(mem, (VkCommandPool) parent); //Omega
		}

		protected VkDevice VkDevice(MemorySegment mem, Object parent) {
			return new VkDevice(mem, (VkPhysicalDevice) parent); //Omega
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorUpdateTemplateCreateInfo.html">VkDescriptorUpdateTemplateCreateInfo</a>
	*/
	public interface VkDescriptorUpdateTemplateCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkDescriptorUpdateTemplateCreateInfo>{
		default VkDescriptorUpdateTemplateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.STYPE);
		}

		default VkDescriptorUpdateTemplateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PNEXT);
		}

		default VkDescriptorUpdateTemplateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.FLAGS);
		}

		/**
		Number of descriptor update entries to use for the update template
		*/
		default VkDescriptorUpdateTemplateCreateInfo descriptorUpdateEntryCount(int descriptorUpdateEntryCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORUPDATEENTRYCOUNT, descriptorUpdateEntryCount);
			return this;
		}

		/**
		Number of descriptor update entries to use for the update template
		*/
		default int descriptorUpdateEntryCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORUPDATEENTRYCOUNT);
		}

		/**
		Descriptor update entries for the template
		*/
		default VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(Element<VkDescriptorUpdateTemplateEntry> pDescriptorUpdateEntries){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES, (pDescriptorUpdateEntries==null?MemorySegment.NULL:pDescriptorUpdateEntries.address()));
			return this;
		}

		/**
		Descriptor update entries for the template
		*/
		default Element<VkDescriptorUpdateTemplateEntry> pDescriptorUpdateEntries(){
			final var pDescriptorUpdateEntries_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES);
			return (pDescriptorUpdateEntries_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDescriptorUpdateEntries_, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.SIZEOF, (v1402215471)->(v1402215471.equals(MemorySegment.NULL)?null:(VkDescriptorUpdateTemplateEntry)()->v1402215471)));
		}

		default VkDescriptorUpdateTemplateCreateInfo templateType(int templateType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.TEMPLATETYPE, templateType);
			return this;
		}

		default int templateType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.TEMPLATETYPE);
		}

		default VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(Element<? extends VkDescriptorSetLayout> descriptorSetLayout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORSETLAYOUT, (descriptorSetLayout==null?MemorySegment.NULL:descriptorSetLayout.address()));
			return this;
		}

		default Element<? extends VkDescriptorSetLayout> descriptorSetLayout(){
			final var descriptorSetLayout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORSETLAYOUT);
			return (descriptorSetLayout_.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorSetLayout>)()->descriptorSetLayout_);
		}

		default VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(int pipelineBindPoint){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINEBINDPOINT, pipelineBindPoint);
			return this;
		}

		default int pipelineBindPoint(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINEBINDPOINT);
		}

		/**
		If used for push descriptors, this is the only allowed layout
		*/
		default VkDescriptorUpdateTemplateCreateInfo pipelineLayout(Element<? extends VkPipelineLayout> pipelineLayout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINELAYOUT, (pipelineLayout==null?MemorySegment.NULL:pipelineLayout.address()));
			return this;
		}

		/**
		If used for push descriptors, this is the only allowed layout
		*/
		default Element<? extends VkPipelineLayout> pipelineLayout(){
			final var pipelineLayout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINELAYOUT);
			return (pipelineLayout_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipelineLayout>)()->pipelineLayout_);
		}

		default VkDescriptorUpdateTemplateCreateInfo set(int set){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SET, set);
			return this;
		}

		default int set(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SET);
		}

		MemorySegment address();

		public static VkDescriptorUpdateTemplateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDescriptorUpdateTemplateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF, (mem)->(VkDescriptorUpdateTemplateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerYcbcrConversionCreateInfo.html">VkSamplerYcbcrConversionCreateInfo</a>
	*/
	public interface VkSamplerYcbcrConversionCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkSamplerYcbcrConversionCreateInfo>{
		default VkSamplerYcbcrConversionCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.STYPE);
		}

		default VkSamplerYcbcrConversionCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.PNEXT);
		}

		default VkSamplerYcbcrConversionCreateInfo format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORMAT, format);
			return this;
		}

		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORMAT);
		}

		default VkSamplerYcbcrConversionCreateInfo ycbcrModel(int ycbcrModel){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL, ycbcrModel);
			return this;
		}

		default int ycbcrModel(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL);
		}

		default VkSamplerYcbcrConversionCreateInfo ycbcrRange(int ycbcrRange){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE, ycbcrRange);
			return this;
		}

		default int ycbcrRange(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE);
		}

		default VkComponentMapping components(){
			final var components_ = address().asSlice(org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.COMPONENTS, org.lwjgl.vulkan.VkComponentMapping.SIZEOF);
			return (components_.equals(MemorySegment.NULL)?null:(VkComponentMapping)()->components_);
		}

		default VkSamplerYcbcrConversionCreateInfo xChromaOffset(int xChromaOffset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET, xChromaOffset);
			return this;
		}

		default int xChromaOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET);
		}

		default VkSamplerYcbcrConversionCreateInfo yChromaOffset(int yChromaOffset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET, yChromaOffset);
			return this;
		}

		default int yChromaOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET);
		}

		default VkSamplerYcbcrConversionCreateInfo chromaFilter(int chromaFilter){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER, chromaFilter);
			return this;
		}

		default int chromaFilter(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER);
		}

		default VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(boolean forceExplicitReconstruction){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION, forceExplicitReconstruction?1:0);
			return this;
		}

		default boolean forceExplicitReconstruction(){
			final var forceExplicitReconstruction_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION);
			return forceExplicitReconstruction_!=0;
		}

		MemorySegment address();

		public static VkSamplerYcbcrConversionCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkSamplerYcbcrConversionCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF, (mem)->(VkSamplerYcbcrConversionCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceGroupRenderPassBeginInfo.html">VkDeviceGroupRenderPassBeginInfo</a>
	*/
	public interface VkDeviceGroupRenderPassBeginInfo extends io.github.kartoffell.KLVulkan.Element<VkDeviceGroupRenderPassBeginInfo>{
		default VkDeviceGroupRenderPassBeginInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.STYPE);
		}

		default VkDeviceGroupRenderPassBeginInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.PNEXT);
		}

		default VkDeviceGroupRenderPassBeginInfo deviceMask(int deviceMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.DEVICEMASK, deviceMask);
			return this;
		}

		default int deviceMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.DEVICEMASK);
		}

		default VkDeviceGroupRenderPassBeginInfo deviceRenderAreaCount(int deviceRenderAreaCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.DEVICERENDERAREACOUNT, deviceRenderAreaCount);
			return this;
		}

		@Nullable
		default int deviceRenderAreaCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.DEVICERENDERAREACOUNT);
		}

		default VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreas(Element<VkRect2D> pDeviceRenderAreas){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS, (pDeviceRenderAreas==null?MemorySegment.NULL:pDeviceRenderAreas.address()));
			return this;
		}

		default Element<VkRect2D> pDeviceRenderAreas(){
			final var pDeviceRenderAreas_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS);
			return (pDeviceRenderAreas_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDeviceRenderAreas_, org.lwjgl.vulkan.VkRect2D.SIZEOF, (v1839962989)->(v1839962989.equals(MemorySegment.NULL)?null:(VkRect2D)()->v1839962989)));
		}

		MemorySegment address();

		public static VkDeviceGroupRenderPassBeginInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDeviceGroupRenderPassBeginInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.SIZEOF, (mem)->(VkDeviceGroupRenderPassBeginInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceProperties2.html">VkPhysicalDeviceProperties2</a>
	*/
	public interface VkPhysicalDeviceProperties2 extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceProperties2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProperties2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceProperties2.PNEXT);
		}

		default VkPhysicalDeviceProperties properties(){
			final var properties_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceProperties2.PROPERTIES, org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF);
			return (properties_.equals(MemorySegment.NULL)?null:(VkPhysicalDeviceProperties)()->properties_);
		}

		MemorySegment address();

		public static VkPhysicalDeviceProperties2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceProperties2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF, (mem)->(VkPhysicalDeviceProperties2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevice16BitStorageFeatures.html">VkPhysicalDevice16BitStorageFeatures</a>
	*/
	public interface VkPhysicalDevice16BitStorageFeatures extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDevice16BitStorageFeatures>{
		default VkPhysicalDevice16BitStorageFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STYPE);
		}

		default VkPhysicalDevice16BitStorageFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.PNEXT);
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock
		*/
		default VkPhysicalDevice16BitStorageFeatures storageBuffer16BitAccess(boolean storageBuffer16BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STORAGEBUFFER16BITACCESS, storageBuffer16BitAccess?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock
		*/
		default boolean storageBuffer16BitAccess(){
			final var storageBuffer16BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STORAGEBUFFER16BITACCESS);
			return storageBuffer16BitAccess_!=0;
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock and Block
		*/
		default VkPhysicalDevice16BitStorageFeatures uniformAndStorageBuffer16BitAccess(boolean uniformAndStorageBuffer16BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.UNIFORMANDSTORAGEBUFFER16BITACCESS, uniformAndStorageBuffer16BitAccess?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock and Block
		*/
		default boolean uniformAndStorageBuffer16BitAccess(){
			final var uniformAndStorageBuffer16BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.UNIFORMANDSTORAGEBUFFER16BITACCESS);
			return uniformAndStorageBuffer16BitAccess_!=0;
		}

		/**
		16-bit integer/floating-point variables supported in PushConstant
		*/
		default VkPhysicalDevice16BitStorageFeatures storagePushConstant16(boolean storagePushConstant16){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STORAGEPUSHCONSTANT16, storagePushConstant16?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in PushConstant
		*/
		default boolean storagePushConstant16(){
			final var storagePushConstant16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STORAGEPUSHCONSTANT16);
			return storagePushConstant16_!=0;
		}

		/**
		16-bit integer/floating-point variables supported in shader inputs and outputs
		*/
		default VkPhysicalDevice16BitStorageFeatures storageInputOutput16(boolean storageInputOutput16){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STORAGEINPUTOUTPUT16, storageInputOutput16?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in shader inputs and outputs
		*/
		default boolean storageInputOutput16(){
			final var storageInputOutput16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.STORAGEINPUTOUTPUT16);
			return storageInputOutput16_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDevice16BitStorageFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDevice16BitStorageFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.SIZEOF, (mem)->(VkPhysicalDevice16BitStorageFeatures)()->mem);
		}

	}

	public interface VkQueueFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkQueueFlagBits{
		public static final int VK_QUEUE_PROTECTED_BIT = 16;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetLayoutSupport.html">VkDescriptorSetLayoutSupport</a>
	*/
	public interface VkDescriptorSetLayoutSupport extends io.github.kartoffell.KLVulkan.Element<VkDescriptorSetLayoutSupport>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutSupport.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutSupport.PNEXT);
		}

		default boolean supported(){
			final var supported_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutSupport.SUPPORTED);
			return supported_!=0;
		}

		MemorySegment address();

		public static VkDescriptorSetLayoutSupport allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorSetLayoutSupport.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDescriptorSetLayoutSupport> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorSetLayoutSupport.SIZEOF, (mem)->(VkDescriptorSetLayoutSupport)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryAllocateFlagBits.html">VkMemoryAllocateFlagBits</a>
	*/
	public interface VkMemoryAllocateFlagBits{
		public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageFormatProperties2.html">VkSparseImageFormatProperties2</a>
	*/
	public interface VkSparseImageFormatProperties2 extends io.github.kartoffell.KLVulkan.Element<VkSparseImageFormatProperties2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageFormatProperties2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageFormatProperties2.PNEXT);
		}

		default VkSparseImageFormatProperties properties(){
			final var properties_ = address().asSlice(org.lwjgl.vulkan.VkSparseImageFormatProperties2.PROPERTIES, org.lwjgl.vulkan.VkSparseImageFormatProperties.SIZEOF);
			return (properties_.equals(MemorySegment.NULL)?null:(VkSparseImageFormatProperties)()->properties_);
		}

		MemorySegment address();

		public static VkSparseImageFormatProperties2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseImageFormatProperties2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkSparseImageFormatProperties2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseImageFormatProperties2.SIZEOF, (mem)->(VkSparseImageFormatProperties2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageFormatProperties2.html">VkImageFormatProperties2</a>
	*/
	public interface VkImageFormatProperties2 extends io.github.kartoffell.KLVulkan.Element<VkImageFormatProperties2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatProperties2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageFormatProperties2.PNEXT);
		}

		default VkImageFormatProperties imageFormatProperties(){
			final var imageFormatProperties_ = address().asSlice(org.lwjgl.vulkan.VkImageFormatProperties2.IMAGEFORMATPROPERTIES, org.lwjgl.vulkan.VkImageFormatProperties.SIZEOF);
			return (imageFormatProperties_.equals(MemorySegment.NULL)?null:(VkImageFormatProperties)()->imageFormatProperties_);
		}

		MemorySegment address();

		public static VkImageFormatProperties2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageFormatProperties2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkImageFormatProperties2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageFormatProperties2.SIZEOF, (mem)->(VkImageFormatProperties2)()->mem);
		}

	}

	public interface VkFormatFeatureFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkFormatFeatureFlagBits{
		public static final int VK_FORMAT_FEATURE_DISJOINT_BIT = 4194304;

		public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144;

		public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = 16384;

		public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576;

		public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT = 131072;

		public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT = 8388608;

		public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288;

		public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152;

		public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT = 32768;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceGroupBindSparseInfo.html">VkDeviceGroupBindSparseInfo</a>
	*/
	public interface VkDeviceGroupBindSparseInfo extends io.github.kartoffell.KLVulkan.Element<VkDeviceGroupBindSparseInfo>{
		default VkDeviceGroupBindSparseInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.STYPE);
		}

		default VkDeviceGroupBindSparseInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.PNEXT);
		}

		default VkDeviceGroupBindSparseInfo resourceDeviceIndex(int resourceDeviceIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.RESOURCEDEVICEINDEX, resourceDeviceIndex);
			return this;
		}

		default int resourceDeviceIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.RESOURCEDEVICEINDEX);
		}

		default VkDeviceGroupBindSparseInfo memoryDeviceIndex(int memoryDeviceIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.MEMORYDEVICEINDEX, memoryDeviceIndex);
			return this;
		}

		default int memoryDeviceIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.MEMORYDEVICEINDEX);
		}

		MemorySegment address();

		public static VkDeviceGroupBindSparseInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDeviceGroupBindSparseInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.SIZEOF, (mem)->(VkDeviceGroupBindSparseInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkProtectedSubmitInfo.html">VkProtectedSubmitInfo</a>
	*/
	public interface VkProtectedSubmitInfo extends io.github.kartoffell.KLVulkan.Element<VkProtectedSubmitInfo>{
		default VkProtectedSubmitInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkProtectedSubmitInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkProtectedSubmitInfo.STYPE);
		}

		default VkProtectedSubmitInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkProtectedSubmitInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkProtectedSubmitInfo.PNEXT);
		}

		/**
		Submit protected command buffers
		*/
		default VkProtectedSubmitInfo protectedSubmit(boolean protectedSubmit){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkProtectedSubmitInfo.PROTECTEDSUBMIT, protectedSubmit?1:0);
			return this;
		}

		/**
		Submit protected command buffers
		*/
		default boolean protectedSubmit(){
			final var protectedSubmit_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkProtectedSubmitInfo.PROTECTEDSUBMIT);
			return protectedSubmit_!=0;
		}

		MemorySegment address();

		public static VkProtectedSubmitInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkProtectedSubmitInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkProtectedSubmitInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkProtectedSubmitInfo.SIZEOF, (mem)->(VkProtectedSubmitInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerYcbcrConversionInfo.html">VkSamplerYcbcrConversionInfo</a>
	*/
	public interface VkSamplerYcbcrConversionInfo extends io.github.kartoffell.KLVulkan.Element<VkSamplerYcbcrConversionInfo>{
		default VkSamplerYcbcrConversionInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.STYPE);
		}

		default VkSamplerYcbcrConversionInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.PNEXT);
		}

		default VkSamplerYcbcrConversionInfo conversion(Element<? extends VkSamplerYcbcrConversion> conversion){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.CONVERSION, (conversion==null?MemorySegment.NULL:conversion.address()));
			return this;
		}

		default Element<? extends VkSamplerYcbcrConversion> conversion(){
			final var conversion_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.CONVERSION);
			return (conversion_.equals(MemorySegment.NULL)?null:(Element<? extends VkSamplerYcbcrConversion>)()->conversion_);
		}

		MemorySegment address();

		public static VkSamplerYcbcrConversionInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkSamplerYcbcrConversionInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.SIZEOF, (mem)->(VkSamplerYcbcrConversionInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceGroupCommandBufferBeginInfo.html">VkDeviceGroupCommandBufferBeginInfo</a>
	*/
	public interface VkDeviceGroupCommandBufferBeginInfo extends io.github.kartoffell.KLVulkan.Element<VkDeviceGroupCommandBufferBeginInfo>{
		default VkDeviceGroupCommandBufferBeginInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.STYPE);
		}

		default VkDeviceGroupCommandBufferBeginInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.PNEXT);
		}

		default VkDeviceGroupCommandBufferBeginInfo deviceMask(int deviceMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.DEVICEMASK, deviceMask);
			return this;
		}

		default int deviceMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.DEVICEMASK);
		}

		MemorySegment address();

		public static VkDeviceGroupCommandBufferBeginInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDeviceGroupCommandBufferBeginInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.SIZEOF, (mem)->(VkDeviceGroupCommandBufferBeginInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageMemoryRequirements2.html">VkSparseImageMemoryRequirements2</a>
	*/
	public interface VkSparseImageMemoryRequirements2 extends io.github.kartoffell.KLVulkan.Element<VkSparseImageMemoryRequirements2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.PNEXT);
		}

		default VkSparseImageMemoryRequirements memoryRequirements(){
			final var memoryRequirements_ = address().asSlice(org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.MEMORYREQUIREMENTS, org.lwjgl.vulkan.VkSparseImageMemoryRequirements.SIZEOF);
			return (memoryRequirements_.equals(MemorySegment.NULL)?null:(VkSparseImageMemoryRequirements)()->memoryRequirements_);
		}

		MemorySegment address();

		public static VkSparseImageMemoryRequirements2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkSparseImageMemoryRequirements2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.SIZEOF, (mem)->(VkSparseImageMemoryRequirements2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceGroupProperties.html">VkPhysicalDeviceGroupProperties</a>
	*/
	public interface VkPhysicalDeviceGroupProperties extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceGroupProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.PNEXT);
		}

		default int physicalDeviceCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.PHYSICALDEVICECOUNT);
		}

		default PointerBuffer<? extends Element<? extends VkPhysicalDevice>> physicalDevices(){
			final var physicalDevices_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.PHYSICALDEVICES, ValueLayout.ADDRESS.byteSize()*API_Constants.VK_MAX_DEVICE_GROUP_SIZE);
			return (physicalDevices_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(physicalDevices_, (v570253226)->(v570253226.equals(MemorySegment.NULL)?null:(Element<? extends VkPhysicalDevice>)()->v570253226)));
		}

		default boolean subsetAllocation(){
			final var subsetAllocation_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.SUBSETALLOCATION);
			return subsetAllocation_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceGroupProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceGroupProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.SIZEOF, (mem)->(VkPhysicalDeviceGroupProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorUpdateTemplateType.html">VkDescriptorUpdateTemplateType</a>
	*/
	public interface VkDescriptorUpdateTemplateType{
		public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryAllocateFlagsInfo.html">VkMemoryAllocateFlagsInfo</a>
	*/
	public interface VkMemoryAllocateFlagsInfo extends io.github.kartoffell.KLVulkan.Element<VkMemoryAllocateFlagsInfo>{
		default VkMemoryAllocateFlagsInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.STYPE);
		}

		default VkMemoryAllocateFlagsInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.PNEXT);
		}

		default VkMemoryAllocateFlagsInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.FLAGS);
		}

		default VkMemoryAllocateFlagsInfo deviceMask(int deviceMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.DEVICEMASK, deviceMask);
			return this;
		}

		default int deviceMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.DEVICEMASK);
		}

		MemorySegment address();

		public static VkMemoryAllocateFlagsInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkMemoryAllocateFlagsInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.SIZEOF, (mem)->(VkMemoryAllocateFlagsInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindImageMemoryDeviceGroupInfo.html">VkBindImageMemoryDeviceGroupInfo</a>
	*/
	public interface VkBindImageMemoryDeviceGroupInfo extends io.github.kartoffell.KLVulkan.Element<VkBindImageMemoryDeviceGroupInfo>{
		default VkBindImageMemoryDeviceGroupInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.STYPE);
		}

		default VkBindImageMemoryDeviceGroupInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.PNEXT);
		}

		default VkBindImageMemoryDeviceGroupInfo deviceIndexCount(int deviceIndexCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.DEVICEINDEXCOUNT, deviceIndexCount);
			return this;
		}

		@Nullable
		default int deviceIndexCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.DEVICEINDEXCOUNT);
		}

		default VkBindImageMemoryDeviceGroupInfo pDeviceIndices(IntBuffer pDeviceIndices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.PDEVICEINDICES, (pDeviceIndices==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDeviceIndices)));
			return this;
		}

		default IntBuffer pDeviceIndices(){
			final var pDeviceIndices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.PDEVICEINDICES);
			return (pDeviceIndices_.equals(MemorySegment.NULL)?null:pDeviceIndices_.asByteBuffer().asIntBuffer());
		}

		default VkBindImageMemoryDeviceGroupInfo splitInstanceBindRegionCount(int splitInstanceBindRegionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.SPLITINSTANCEBINDREGIONCOUNT, splitInstanceBindRegionCount);
			return this;
		}

		@Nullable
		default int splitInstanceBindRegionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.SPLITINSTANCEBINDREGIONCOUNT);
		}

		default VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegions(Element<VkRect2D> pSplitInstanceBindRegions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.PSPLITINSTANCEBINDREGIONS, (pSplitInstanceBindRegions==null?MemorySegment.NULL:pSplitInstanceBindRegions.address()));
			return this;
		}

		default Element<VkRect2D> pSplitInstanceBindRegions(){
			final var pSplitInstanceBindRegions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.PSPLITINSTANCEBINDREGIONS);
			return (pSplitInstanceBindRegions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pSplitInstanceBindRegions_, org.lwjgl.vulkan.VkRect2D.SIZEOF, (v661047965)->(v661047965.equals(MemorySegment.NULL)?null:(VkRect2D)()->v661047965)));
		}

		MemorySegment address();

		public static VkBindImageMemoryDeviceGroupInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkBindImageMemoryDeviceGroupInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.SIZEOF, (mem)->(VkBindImageMemoryDeviceGroupInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerYcbcrConversionImageFormatProperties.html">VkSamplerYcbcrConversionImageFormatProperties</a>
	*/
	public interface VkSamplerYcbcrConversionImageFormatProperties extends io.github.kartoffell.KLVulkan.Element<VkSamplerYcbcrConversionImageFormatProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.PNEXT);
		}

		default int combinedImageSamplerDescriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.COMBINEDIMAGESAMPLERDESCRIPTORCOUNT);
		}

		MemorySegment address();

		public static VkSamplerYcbcrConversionImageFormatProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkSamplerYcbcrConversionImageFormatProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.SIZEOF, (mem)->(VkSamplerYcbcrConversionImageFormatProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPassMultiviewCreateInfo.html">VkRenderPassMultiviewCreateInfo</a>
	*/
	public interface VkRenderPassMultiviewCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkRenderPassMultiviewCreateInfo>{
		default VkRenderPassMultiviewCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.STYPE);
		}

		default VkRenderPassMultiviewCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PNEXT);
		}

		default VkRenderPassMultiviewCreateInfo subpassCount(int subpassCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.SUBPASSCOUNT, subpassCount);
			return this;
		}

		@Nullable
		default int subpassCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.SUBPASSCOUNT);
		}

		default VkRenderPassMultiviewCreateInfo pViewMasks(IntBuffer pViewMasks){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PVIEWMASKS, (pViewMasks==null?MemorySegment.NULL:MemorySegment.ofBuffer(pViewMasks)));
			return this;
		}

		default IntBuffer pViewMasks(){
			final var pViewMasks_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PVIEWMASKS);
			return (pViewMasks_.equals(MemorySegment.NULL)?null:pViewMasks_.asByteBuffer().asIntBuffer());
		}

		default VkRenderPassMultiviewCreateInfo dependencyCount(int dependencyCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.DEPENDENCYCOUNT, dependencyCount);
			return this;
		}

		@Nullable
		default int dependencyCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.DEPENDENCYCOUNT);
		}

		default VkRenderPassMultiviewCreateInfo pViewOffsets(IntBuffer pViewOffsets){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PVIEWOFFSETS, (pViewOffsets==null?MemorySegment.NULL:MemorySegment.ofBuffer(pViewOffsets)));
			return this;
		}

		default IntBuffer pViewOffsets(){
			final var pViewOffsets_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PVIEWOFFSETS);
			return (pViewOffsets_.equals(MemorySegment.NULL)?null:pViewOffsets_.asByteBuffer().asIntBuffer());
		}

		default VkRenderPassMultiviewCreateInfo correlationMaskCount(int correlationMaskCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.CORRELATIONMASKCOUNT, correlationMaskCount);
			return this;
		}

		@Nullable
		default int correlationMaskCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.CORRELATIONMASKCOUNT);
		}

		default VkRenderPassMultiviewCreateInfo pCorrelationMasks(IntBuffer pCorrelationMasks){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PCORRELATIONMASKS, (pCorrelationMasks==null?MemorySegment.NULL:MemorySegment.ofBuffer(pCorrelationMasks)));
			return this;
		}

		default IntBuffer pCorrelationMasks(){
			final var pCorrelationMasks_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.PCORRELATIONMASKS);
			return (pCorrelationMasks_.equals(MemorySegment.NULL)?null:pCorrelationMasks_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		public static VkRenderPassMultiviewCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkRenderPassMultiviewCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.SIZEOF, (mem)->(VkRenderPassMultiviewCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferMemoryRequirementsInfo2.html">VkBufferMemoryRequirementsInfo2</a>
	*/
	public interface VkBufferMemoryRequirementsInfo2 extends io.github.kartoffell.KLVulkan.Element<VkBufferMemoryRequirementsInfo2>{
		default VkBufferMemoryRequirementsInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.STYPE);
		}

		default VkBufferMemoryRequirementsInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.PNEXT);
		}

		default VkBufferMemoryRequirementsInfo2 buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		MemorySegment address();

		public static VkBufferMemoryRequirementsInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkBufferMemoryRequirementsInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2.SIZEOF, (mem)->(VkBufferMemoryRequirementsInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevicePointClippingProperties.html">VkPhysicalDevicePointClippingProperties</a>
	*/
	public interface VkPhysicalDevicePointClippingProperties extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDevicePointClippingProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.PNEXT);
		}

		default int pointClippingBehavior(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.POINTCLIPPINGBEHAVIOR);
		}

		MemorySegment address();

		public static VkPhysicalDevicePointClippingProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDevicePointClippingProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.SIZEOF, (mem)->(VkPhysicalDevicePointClippingProperties)()->mem);
		}

	}

	public interface VkObjectType extends io.github.kartoffell.KLVulkan.VK10.VkObjectType{
		public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = 1000085000;

		public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION = 1000156000;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalMemoryFeatureFlagBits.html">VkExternalMemoryFeatureFlagBits</a>
	*/
	public interface VkExternalMemoryFeatureFlagBits{
		public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT = 4;

		public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 1;

		public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSparseImageFormatInfo2.html">VkPhysicalDeviceSparseImageFormatInfo2</a>
	*/
	public interface VkPhysicalDeviceSparseImageFormatInfo2 extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceSparseImageFormatInfo2>{
		default VkPhysicalDeviceSparseImageFormatInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.STYPE);
		}

		default VkPhysicalDeviceSparseImageFormatInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.PNEXT);
		}

		default VkPhysicalDeviceSparseImageFormatInfo2 format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.FORMAT, format);
			return this;
		}

		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.FORMAT);
		}

		default VkPhysicalDeviceSparseImageFormatInfo2 type(int type){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.TYPE, type);
			return this;
		}

		default int type(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.TYPE);
		}

		default VkPhysicalDeviceSparseImageFormatInfo2 samples(int samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.SAMPLES, samples);
			return this;
		}

		default int samples(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.SAMPLES);
		}

		default VkPhysicalDeviceSparseImageFormatInfo2 usage(int usage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.USAGE, usage);
			return this;
		}

		default int usage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.USAGE);
		}

		default VkPhysicalDeviceSparseImageFormatInfo2 tiling(int tiling){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.TILING, tiling);
			return this;
		}

		default int tiling(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.TILING);
		}

		MemorySegment address();

		public static VkPhysicalDeviceSparseImageFormatInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceSparseImageFormatInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.SIZEOF, (mem)->(VkPhysicalDeviceSparseImageFormatInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImagePlaneMemoryRequirementsInfo.html">VkImagePlaneMemoryRequirementsInfo</a>
	*/
	public interface VkImagePlaneMemoryRequirementsInfo extends io.github.kartoffell.KLVulkan.Element<VkImagePlaneMemoryRequirementsInfo>{
		default VkImagePlaneMemoryRequirementsInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.STYPE);
		}

		default VkImagePlaneMemoryRequirementsInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.PNEXT);
		}

		default VkImagePlaneMemoryRequirementsInfo planeAspect(int planeAspect){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.PLANEASPECT, planeAspect);
			return this;
		}

		default int planeAspect(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.PLANEASPECT);
		}

		MemorySegment address();

		public static VkImagePlaneMemoryRequirementsInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkImagePlaneMemoryRequirementsInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.SIZEOF, (mem)->(VkImagePlaneMemoryRequirementsInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerYcbcrConversion.html">VkSamplerYcbcrConversion</a>
	*/
	public static record VkSamplerYcbcrConversion(MemorySegment address, VkDevice parent) implements io.github.kartoffell.KLVulkan.Element<VkSamplerYcbcrConversion>{
		public static PointerBuffer<? extends VkSamplerYcbcrConversion> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkSamplerYcbcrConversion(mem, parent)); //VkSamplerYcbcrConversion
		}

		public static PointerBuffer<? extends VkSamplerYcbcrConversion> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	public interface VkPhysicalDeviceShaderDrawParameterFeatures extends io.github.kartoffell.KLVulkan.VK11.VkPhysicalDeviceShaderDrawParametersFeatures{
	}

	public interface VkBufferCreateFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkBufferCreateFlagBits{
		public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 8;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageViewUsageCreateInfo.html">VkImageViewUsageCreateInfo</a>
	*/
	public interface VkImageViewUsageCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkImageViewUsageCreateInfo>{
		default VkImageViewUsageCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewUsageCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewUsageCreateInfo.STYPE);
		}

		default VkImageViewUsageCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageViewUsageCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageViewUsageCreateInfo.PNEXT);
		}

		default VkImageViewUsageCreateInfo usage(int usage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewUsageCreateInfo.USAGE, usage);
			return this;
		}

		default int usage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewUsageCreateInfo.USAGE);
		}

		MemorySegment address();

		public static VkImageViewUsageCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageViewUsageCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkImageViewUsageCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageViewUsageCreateInfo.SIZEOF, (mem)->(VkImageViewUsageCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalBufferProperties.html">VkExternalBufferProperties</a>
	*/
	public interface VkExternalBufferProperties extends io.github.kartoffell.KLVulkan.Element<VkExternalBufferProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalBufferProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalBufferProperties.PNEXT);
		}

		default VkExternalMemoryProperties externalMemoryProperties(){
			final var externalMemoryProperties_ = address().asSlice(org.lwjgl.vulkan.VkExternalBufferProperties.EXTERNALMEMORYPROPERTIES, org.lwjgl.vulkan.VkExternalMemoryProperties.SIZEOF);
			return (externalMemoryProperties_.equals(MemorySegment.NULL)?null:(VkExternalMemoryProperties)()->externalMemoryProperties_);
		}

		MemorySegment address();

		public static VkExternalBufferProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExternalBufferProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExternalBufferProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExternalBufferProperties.SIZEOF, (mem)->(VkExternalBufferProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExportSemaphoreCreateInfo.html">VkExportSemaphoreCreateInfo</a>
	*/
	public interface VkExportSemaphoreCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkExportSemaphoreCreateInfo>{
		default VkExportSemaphoreCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.STYPE);
		}

		default VkExportSemaphoreCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.PNEXT);
		}

		default VkExportSemaphoreCreateInfo handleTypes(int handleTypes){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.HANDLETYPES, handleTypes);
			return this;
		}

		@Nullable
		default int handleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.HANDLETYPES);
		}

		MemorySegment address();

		public static VkExportSemaphoreCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExportSemaphoreCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.SIZEOF, (mem)->(VkExportSemaphoreCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalMemoryProperties.html">VkExternalMemoryProperties</a>
	*/
	public interface VkExternalMemoryProperties extends io.github.kartoffell.KLVulkan.Element<VkExternalMemoryProperties>{
		default int externalMemoryFeatures(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryProperties.EXTERNALMEMORYFEATURES);
		}

		@Nullable
		default int exportFromImportedHandleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryProperties.EXPORTFROMIMPORTEDHANDLETYPES);
		}

		default int compatibleHandleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryProperties.COMPATIBLEHANDLETYPES);
		}

		MemorySegment address();

		public static VkExternalMemoryProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExternalMemoryProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExternalMemoryProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExternalMemoryProperties.SIZEOF, (mem)->(VkExternalMemoryProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryRequirements2.html">VkMemoryRequirements2</a>
	*/
	public interface VkMemoryRequirements2 extends io.github.kartoffell.KLVulkan.Element<VkMemoryRequirements2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryRequirements2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryRequirements2.PNEXT);
		}

		default VkMemoryRequirements memoryRequirements(){
			final var memoryRequirements_ = address().asSlice(org.lwjgl.vulkan.VkMemoryRequirements2.MEMORYREQUIREMENTS, org.lwjgl.vulkan.VkMemoryRequirements.SIZEOF);
			return (memoryRequirements_.equals(MemorySegment.NULL)?null:(VkMemoryRequirements)()->memoryRequirements_);
		}

		MemorySegment address();

		public static VkMemoryRequirements2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryRequirements2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkMemoryRequirements2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryRequirements2.SIZEOF, (mem)->(VkMemoryRequirements2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalFenceProperties.html">VkExternalFenceProperties</a>
	*/
	public interface VkExternalFenceProperties extends io.github.kartoffell.KLVulkan.Element<VkExternalFenceProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalFenceProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalFenceProperties.PNEXT);
		}

		default int exportFromImportedHandleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalFenceProperties.EXPORTFROMIMPORTEDHANDLETYPES);
		}

		default int compatibleHandleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalFenceProperties.COMPATIBLEHANDLETYPES);
		}

		@Nullable
		default int externalFenceFeatures(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalFenceProperties.EXTERNALFENCEFEATURES);
		}

		MemorySegment address();

		public static VkExternalFenceProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExternalFenceProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExternalFenceProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExternalFenceProperties.SIZEOF, (mem)->(VkExternalFenceProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindBufferMemoryInfo.html">VkBindBufferMemoryInfo</a>
	*/
	public interface VkBindBufferMemoryInfo extends io.github.kartoffell.KLVulkan.Element<VkBindBufferMemoryInfo>{
		default VkBindBufferMemoryInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindBufferMemoryInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindBufferMemoryInfo.STYPE);
		}

		default VkBindBufferMemoryInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryInfo.PNEXT);
		}

		default VkBindBufferMemoryInfo buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryInfo.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryInfo.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		default VkBindBufferMemoryInfo memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryInfo.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindBufferMemoryInfo.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		default VkBindBufferMemoryInfo memoryOffset(long memoryOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBindBufferMemoryInfo.MEMORYOFFSET, memoryOffset);
			return this;
		}

		default long memoryOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBindBufferMemoryInfo.MEMORYOFFSET);
		}

		MemorySegment address();

		public static VkBindBufferMemoryInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindBufferMemoryInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkBindBufferMemoryInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindBufferMemoryInfo.SIZEOF, (mem)->(VkBindBufferMemoryInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryDedicatedRequirements.html">VkMemoryDedicatedRequirements</a>
	*/
	public interface VkMemoryDedicatedRequirements extends io.github.kartoffell.KLVulkan.Element<VkMemoryDedicatedRequirements>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryDedicatedRequirements.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryDedicatedRequirements.PNEXT);
		}

		default boolean prefersDedicatedAllocation(){
			final var prefersDedicatedAllocation_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryDedicatedRequirements.PREFERSDEDICATEDALLOCATION);
			return prefersDedicatedAllocation_!=0;
		}

		default boolean requiresDedicatedAllocation(){
			final var requiresDedicatedAllocation_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryDedicatedRequirements.REQUIRESDEDICATEDALLOCATION);
			return requiresDedicatedAllocation_!=0;
		}

		MemorySegment address();

		public static VkMemoryDedicatedRequirements allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryDedicatedRequirements.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkMemoryDedicatedRequirements> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryDedicatedRequirements.SIZEOF, (mem)->(VkMemoryDedicatedRequirements)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryDedicatedAllocateInfo.html">VkMemoryDedicatedAllocateInfo</a>
	*/
	public interface VkMemoryDedicatedAllocateInfo extends io.github.kartoffell.KLVulkan.Element<VkMemoryDedicatedAllocateInfo>{
		default VkMemoryDedicatedAllocateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.STYPE);
		}

		default VkMemoryDedicatedAllocateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.PNEXT);
		}

		/**
		Image that this allocation will be bound to
		*/
		default VkMemoryDedicatedAllocateInfo image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		/**
		Image that this allocation will be bound to
		*/
		@Nullable
		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		/**
		Buffer that this allocation will be bound to
		*/
		default VkMemoryDedicatedAllocateInfo buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		/**
		Buffer that this allocation will be bound to
		*/
		@Nullable
		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		MemorySegment address();

		public static VkMemoryDedicatedAllocateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkMemoryDedicatedAllocateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.SIZEOF, (mem)->(VkMemoryDedicatedAllocateInfo)()->mem);
		}

	}

	public interface VkFormat extends io.github.kartoffell.KLVulkan.VK10.VkFormat{
		public static final int VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 = 1000156011;

		public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 = 1000156015;

		public static final int VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM = 1000156002;

		public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = 1000156026;

		public static final int VK_FORMAT_B8G8R8G8_422_UNORM = 1000156001;

		public static final int VK_FORMAT_R12X4G12X4_UNORM_2PACK16 = 1000156018;

		public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 = 1000156023;

		public static final int VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 = 1000156020;

		public static final int VK_FORMAT_B16G16R16G16_422_UNORM = 1000156028;

		public static final int VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 = 1000156019;

		public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = 1000156016;

		public static final int VK_FORMAT_G16_B16R16_2PLANE_422_UNORM = 1000156032;

		public static final int VK_FORMAT_G16B16G16R16_422_UNORM = 1000156027;

		public static final int VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM = 1000156006;

		public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = 1000156014;

		public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = 1000156012;

		public static final int VK_FORMAT_G8B8G8R8_422_UNORM = 1000156000;

		public static final int VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM = 1000156004;

		public static final int VK_FORMAT_G8_B8R8_2PLANE_420_UNORM = 1000156003;

		public static final int VK_FORMAT_R12X4_UNORM_PACK16 = 1000156017;

		public static final int VK_FORMAT_G16_B16R16_2PLANE_420_UNORM = 1000156030;

		public static final int VK_FORMAT_R10X6_UNORM_PACK16 = 1000156007;

		public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 = 1000156025;

		public static final int VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 = 1000156021;

		public static final int VK_FORMAT_G8_B8R8_2PLANE_422_UNORM = 1000156005;

		public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 = 1000156013;

		public static final int VK_FORMAT_R10X6G10X6_UNORM_2PACK16 = 1000156008;

		public static final int VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 = 1000156010;

		public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = 1000156024;

		public static final int VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 = 1000156009;

		public static final int VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM = 1000156031;

		public static final int VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM = 1000156029;

		public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = 1000156022;

		public static final int VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM = 1000156033;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalImageFormatProperties.html">VkExternalImageFormatProperties</a>
	*/
	public interface VkExternalImageFormatProperties extends io.github.kartoffell.KLVulkan.Element<VkExternalImageFormatProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalImageFormatProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalImageFormatProperties.PNEXT);
		}

		default VkExternalMemoryProperties externalMemoryProperties(){
			final var externalMemoryProperties_ = address().asSlice(org.lwjgl.vulkan.VkExternalImageFormatProperties.EXTERNALMEMORYPROPERTIES, org.lwjgl.vulkan.VkExternalMemoryProperties.SIZEOF);
			return (externalMemoryProperties_.equals(MemorySegment.NULL)?null:(VkExternalMemoryProperties)()->externalMemoryProperties_);
		}

		MemorySegment address();

		public static VkExternalImageFormatProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExternalImageFormatProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExternalImageFormatProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExternalImageFormatProperties.SIZEOF, (mem)->(VkExternalImageFormatProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalMemoryBufferCreateInfo.html">VkExternalMemoryBufferCreateInfo</a>
	*/
	public interface VkExternalMemoryBufferCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkExternalMemoryBufferCreateInfo>{
		default VkExternalMemoryBufferCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.STYPE);
		}

		default VkExternalMemoryBufferCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.PNEXT);
		}

		default VkExternalMemoryBufferCreateInfo handleTypes(int handleTypes){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.HANDLETYPES, handleTypes);
			return this;
		}

		@Nullable
		default int handleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.HANDLETYPES);
		}

		MemorySegment address();

		public static VkExternalMemoryBufferCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExternalMemoryBufferCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.SIZEOF, (mem)->(VkExternalMemoryBufferCreateInfo)()->mem);
		}

	}

	public static class VkPhysicalDevice extends io.github.kartoffell.KLVulkan.VK10.VkPhysicalDevice{
		public VkPhysicalDevice(MemorySegment address, VkInstance parent) {
			super(address, parent);
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceQueueFamilyProperties2.html">vkGetPhysicalDeviceQueueFamilyProperties2</a>
		*/
		public void vkGetPhysicalDeviceQueueFamilyProperties2(IntBuffer pQueueFamilyPropertyCount, @Nullable Element<VkQueueFamilyProperties2> pQueueFamilyProperties) {
			if(capabilities.vkGetPhysicalDeviceQueueFamilyProperties2_==null) {
				capabilities.vkGetPhysicalDeviceQueueFamilyProperties2_ = capabilities.lookup("vkGetPhysicalDeviceQueueFamilyProperties2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceQueueFamilyProperties2_.invoke(address(), (pQueueFamilyPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pQueueFamilyPropertyCount)), (pQueueFamilyProperties==null?MemorySegment.NULL:pQueueFamilyProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceExternalFenceProperties.html">vkGetPhysicalDeviceExternalFenceProperties</a>
		*/
		public void vkGetPhysicalDeviceExternalFenceProperties(Element<VkPhysicalDeviceExternalFenceInfo> pExternalFenceInfo, Element<VkExternalFenceProperties> pExternalFenceProperties) {
			if(capabilities.vkGetPhysicalDeviceExternalFenceProperties_==null) {
				capabilities.vkGetPhysicalDeviceExternalFenceProperties_ = capabilities.lookup("vkGetPhysicalDeviceExternalFenceProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceExternalFenceProperties_.invoke(address(), (pExternalFenceInfo==null?MemorySegment.NULL:pExternalFenceInfo.address()), (pExternalFenceProperties==null?MemorySegment.NULL:pExternalFenceProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceMemoryProperties2.html">vkGetPhysicalDeviceMemoryProperties2</a>
		*/
		public void vkGetPhysicalDeviceMemoryProperties2(Element<VkPhysicalDeviceMemoryProperties2> pMemoryProperties) {
			if(capabilities.vkGetPhysicalDeviceMemoryProperties2_==null) {
				capabilities.vkGetPhysicalDeviceMemoryProperties2_ = capabilities.lookup("vkGetPhysicalDeviceMemoryProperties2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceMemoryProperties2_.invoke(address(), (pMemoryProperties==null?MemorySegment.NULL:pMemoryProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceFeatures2.html">vkGetPhysicalDeviceFeatures2</a>
		*/
		public void vkGetPhysicalDeviceFeatures2(Element<VkPhysicalDeviceFeatures2> pFeatures) {
			if(capabilities.vkGetPhysicalDeviceFeatures2_==null) {
				capabilities.vkGetPhysicalDeviceFeatures2_ = capabilities.lookup("vkGetPhysicalDeviceFeatures2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceFeatures2_.invoke(address(), (pFeatures==null?MemorySegment.NULL:pFeatures.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceFormatProperties2.html">vkGetPhysicalDeviceFormatProperties2</a>
		*/
		public void vkGetPhysicalDeviceFormatProperties2(int format, Element<VkFormatProperties2> pFormatProperties) {
			if(capabilities.vkGetPhysicalDeviceFormatProperties2_==null) {
				capabilities.vkGetPhysicalDeviceFormatProperties2_ = capabilities.lookup("vkGetPhysicalDeviceFormatProperties2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceFormatProperties2_.invoke(address(), format, (pFormatProperties==null?MemorySegment.NULL:pFormatProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceExternalSemaphoreProperties.html">vkGetPhysicalDeviceExternalSemaphoreProperties</a>
		*/
		public void vkGetPhysicalDeviceExternalSemaphoreProperties(Element<VkPhysicalDeviceExternalSemaphoreInfo> pExternalSemaphoreInfo, Element<VkExternalSemaphoreProperties> pExternalSemaphoreProperties) {
			if(capabilities.vkGetPhysicalDeviceExternalSemaphoreProperties_==null) {
				capabilities.vkGetPhysicalDeviceExternalSemaphoreProperties_ = capabilities.lookup("vkGetPhysicalDeviceExternalSemaphoreProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceExternalSemaphoreProperties_.invoke(address(), (pExternalSemaphoreInfo==null?MemorySegment.NULL:pExternalSemaphoreInfo.address()), (pExternalSemaphoreProperties==null?MemorySegment.NULL:pExternalSemaphoreProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceExternalBufferProperties.html">vkGetPhysicalDeviceExternalBufferProperties</a>
		*/
		public void vkGetPhysicalDeviceExternalBufferProperties(Element<VkPhysicalDeviceExternalBufferInfo> pExternalBufferInfo, Element<VkExternalBufferProperties> pExternalBufferProperties) {
			if(capabilities.vkGetPhysicalDeviceExternalBufferProperties_==null) {
				capabilities.vkGetPhysicalDeviceExternalBufferProperties_ = capabilities.lookup("vkGetPhysicalDeviceExternalBufferProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceExternalBufferProperties_.invoke(address(), (pExternalBufferInfo==null?MemorySegment.NULL:pExternalBufferInfo.address()), (pExternalBufferProperties==null?MemorySegment.NULL:pExternalBufferProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceProperties2.html">vkGetPhysicalDeviceProperties2</a>
		*/
		public void vkGetPhysicalDeviceProperties2(Element<VkPhysicalDeviceProperties2> pProperties) {
			if(capabilities.vkGetPhysicalDeviceProperties2_==null) {
				capabilities.vkGetPhysicalDeviceProperties2_ = capabilities.lookup("vkGetPhysicalDeviceProperties2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceProperties2_.invoke(address(), (pProperties==null?MemorySegment.NULL:pProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_FORMAT_NOT_SUPPORTED ->{@value VkResult#VK_ERROR_FORMAT_NOT_SUPPORTED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR, VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR, VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR, VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR, VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceImageFormatProperties2.html">vkGetPhysicalDeviceImageFormatProperties2</a>
		*/
		public void vkGetPhysicalDeviceImageFormatProperties2(Element<VkPhysicalDeviceImageFormatInfo2> pImageFormatInfo, Element<VkImageFormatProperties2> pImageFormatProperties) {
			if(capabilities.vkGetPhysicalDeviceImageFormatProperties2_==null) {
				capabilities.vkGetPhysicalDeviceImageFormatProperties2_ = capabilities.lookup("vkGetPhysicalDeviceImageFormatProperties2", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkGetPhysicalDeviceImageFormatProperties2_.invoke(address(), (pImageFormatInfo==null?MemorySegment.NULL:pImageFormatInfo.address()), (pImageFormatProperties==null?MemorySegment.NULL:pImageFormatProperties.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceSparseImageFormatProperties2.html">vkGetPhysicalDeviceSparseImageFormatProperties2</a>
		*/
		public void vkGetPhysicalDeviceSparseImageFormatProperties2(Element<VkPhysicalDeviceSparseImageFormatInfo2> pFormatInfo, IntBuffer pPropertyCount, @Nullable Element<VkSparseImageFormatProperties2> pProperties) {
			if(capabilities.vkGetPhysicalDeviceSparseImageFormatProperties2_==null) {
				capabilities.vkGetPhysicalDeviceSparseImageFormatProperties2_ = capabilities.lookup("vkGetPhysicalDeviceSparseImageFormatProperties2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceSparseImageFormatProperties2_.invoke(address(), (pFormatInfo==null?MemorySegment.NULL:pFormatInfo.address()), (pPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPropertyCount)), (pProperties==null?MemorySegment.NULL:pProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPointClippingBehavior.html">VkPointClippingBehavior</a>
	*/
	public interface VkPointClippingBehavior{
		public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;

		public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;

	}

	public interface VkMemoryHeapFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkMemoryHeapFlagBits{
		public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceExternalImageFormatInfo.html">VkPhysicalDeviceExternalImageFormatInfo</a>
	*/
	public interface VkPhysicalDeviceExternalImageFormatInfo extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceExternalImageFormatInfo>{
		default VkPhysicalDeviceExternalImageFormatInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.STYPE);
		}

		default VkPhysicalDeviceExternalImageFormatInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.PNEXT);
		}

		default VkPhysicalDeviceExternalImageFormatInfo handleType(int handleType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.HANDLETYPE, handleType);
			return this;
		}

		@Nullable
		default int handleType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.HANDLETYPE);
		}

		MemorySegment address();

		public static VkPhysicalDeviceExternalImageFormatInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceExternalImageFormatInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.SIZEOF, (mem)->(VkPhysicalDeviceExternalImageFormatInfo)()->mem);
		}

	}

	public interface VkPipelineCreateFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkPipelineCreateFlagBits{
		public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 8;

		public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = 16;

		public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_BIT = 16;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMaintenance3Properties.html">VkPhysicalDeviceMaintenance3Properties</a>
	*/
	public interface VkPhysicalDeviceMaintenance3Properties extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceMaintenance3Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties.PNEXT);
		}

		default int maxPerSetDescriptors(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties.MAXPERSETDESCRIPTORS);
		}

		default long maxMemoryAllocationSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties.MAXMEMORYALLOCATIONSIZE);
		}

		MemorySegment address();

		public static VkPhysicalDeviceMaintenance3Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceMaintenance3Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties.SIZEOF, (mem)->(VkPhysicalDeviceMaintenance3Properties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalMemoryImageCreateInfo.html">VkExternalMemoryImageCreateInfo</a>
	*/
	public interface VkExternalMemoryImageCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkExternalMemoryImageCreateInfo>{
		default VkExternalMemoryImageCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.STYPE);
		}

		default VkExternalMemoryImageCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.PNEXT);
		}

		default VkExternalMemoryImageCreateInfo handleTypes(int handleTypes){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.HANDLETYPES, handleTypes);
			return this;
		}

		@Nullable
		default int handleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.HANDLETYPES);
		}

		MemorySegment address();

		public static VkExternalMemoryImageCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExternalMemoryImageCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.SIZEOF, (mem)->(VkExternalMemoryImageCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceImageFormatInfo2.html">VkPhysicalDeviceImageFormatInfo2</a>
	*/
	public interface VkPhysicalDeviceImageFormatInfo2 extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceImageFormatInfo2>{
		default VkPhysicalDeviceImageFormatInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.STYPE);
		}

		default VkPhysicalDeviceImageFormatInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.PNEXT);
		}

		default VkPhysicalDeviceImageFormatInfo2 format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.FORMAT, format);
			return this;
		}

		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.FORMAT);
		}

		default VkPhysicalDeviceImageFormatInfo2 type(int type){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.TYPE, type);
			return this;
		}

		default int type(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.TYPE);
		}

		default VkPhysicalDeviceImageFormatInfo2 tiling(int tiling){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.TILING, tiling);
			return this;
		}

		default int tiling(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.TILING);
		}

		default VkPhysicalDeviceImageFormatInfo2 usage(int usage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.USAGE, usage);
			return this;
		}

		default int usage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.USAGE);
		}

		default VkPhysicalDeviceImageFormatInfo2 flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.FLAGS);
		}

		MemorySegment address();

		public static VkPhysicalDeviceImageFormatInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceImageFormatInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.SIZEOF, (mem)->(VkPhysicalDeviceImageFormatInfo2)()->mem);
		}

	}

	public static class VkCommandBuffer extends io.github.kartoffell.KLVulkan.VK10.VkCommandBuffer{
		public VkCommandBuffer(MemorySegment address, VkCommandPool parent) {
			super(address, parent);
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDeviceMask.html">vkCmdSetDeviceMask</a>
		*/
		public void vkCmdSetDeviceMask(int deviceMask) {
			if(capabilities.vkCmdSetDeviceMask_==null) {
				capabilities.vkCmdSetDeviceMask_ = capabilities.lookup("vkCmdSetDeviceMask", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetDeviceMask_.invoke(address(), deviceMask);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDispatchBase.html">vkCmdDispatchBase</a>
		*/
		public void vkCmdDispatchBase(int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ) {
			if(capabilities.vkCmdDispatchBase_==null) {
				capabilities.vkCmdDispatchBase_ = capabilities.lookup("vkCmdDispatchBase", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDispatchBase_.invoke(address(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceIDProperties.html">VkPhysicalDeviceIDProperties</a>
	*/
	public interface VkPhysicalDeviceIDProperties extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceIDProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.PNEXT);
		}

		default ByteBuffer deviceUUID(){
			final var deviceUUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.DEVICEUUID, 1*API_Constants.VK_UUID_SIZE);
			return (deviceUUID_.equals(MemorySegment.NULL)?null:deviceUUID_.asByteBuffer());
		}

		default ByteBuffer driverUUID(){
			final var driverUUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.DRIVERUUID, 1*API_Constants.VK_UUID_SIZE);
			return (driverUUID_.equals(MemorySegment.NULL)?null:driverUUID_.asByteBuffer());
		}

		default ByteBuffer deviceLUID(){
			final var deviceLUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.DEVICELUID, 1*API_Constants.VK_LUID_SIZE);
			return (deviceLUID_.equals(MemorySegment.NULL)?null:deviceLUID_.asByteBuffer());
		}

		default int deviceNodeMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.DEVICENODEMASK);
		}

		default boolean deviceLUIDValid(){
			final var deviceLUIDValid_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.DEVICELUIDVALID);
			return deviceLUIDValid_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceIDProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceIDProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceIDProperties.SIZEOF, (mem)->(VkPhysicalDeviceIDProperties)()->mem);
		}

	}

	public interface API_Constants extends io.github.kartoffell.KLVulkan.VK10.API_Constants{
		public static final int VK_LUID_SIZE = 8;

		public static final int VK_MAX_DEVICE_GROUP_SIZE = 32;

		public static final int VK_QUEUE_FAMILY_EXTERNAL = (~1);

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceProtectedMemoryFeatures.html">VkPhysicalDeviceProtectedMemoryFeatures</a>
	*/
	public interface VkPhysicalDeviceProtectedMemoryFeatures extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceProtectedMemoryFeatures>{
		default VkPhysicalDeviceProtectedMemoryFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.STYPE);
		}

		default VkPhysicalDeviceProtectedMemoryFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.PNEXT);
		}

		default VkPhysicalDeviceProtectedMemoryFeatures protectedMemory(boolean protectedMemory){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.PROTECTEDMEMORY, protectedMemory?1:0);
			return this;
		}

		default boolean protectedMemory(){
			final var protectedMemory_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.PROTECTEDMEMORY);
			return protectedMemory_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceProtectedMemoryFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceProtectedMemoryFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures.SIZEOF, (mem)->(VkPhysicalDeviceProtectedMemoryFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorUpdateTemplateEntry.html">VkDescriptorUpdateTemplateEntry</a>
	*/
	public interface VkDescriptorUpdateTemplateEntry extends io.github.kartoffell.KLVulkan.Element<VkDescriptorUpdateTemplateEntry>{
		/**
		Binding within the destination descriptor set to write
		*/
		default VkDescriptorUpdateTemplateEntry dstBinding(int dstBinding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DSTBINDING, dstBinding);
			return this;
		}

		/**
		Binding within the destination descriptor set to write
		*/
		default int dstBinding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DSTBINDING);
		}

		/**
		Array element within the destination binding to write
		*/
		default VkDescriptorUpdateTemplateEntry dstArrayElement(int dstArrayElement){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DSTARRAYELEMENT, dstArrayElement);
			return this;
		}

		/**
		Array element within the destination binding to write
		*/
		default int dstArrayElement(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DSTARRAYELEMENT);
		}

		/**
		Number of descriptors to write
		*/
		default VkDescriptorUpdateTemplateEntry descriptorCount(int descriptorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DESCRIPTORCOUNT, descriptorCount);
			return this;
		}

		/**
		Number of descriptors to write
		*/
		default int descriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DESCRIPTORCOUNT);
		}

		/**
		Descriptor type to write
		*/
		default VkDescriptorUpdateTemplateEntry descriptorType(int descriptorType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DESCRIPTORTYPE, descriptorType);
			return this;
		}

		/**
		Descriptor type to write
		*/
		default int descriptorType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.DESCRIPTORTYPE);
		}

		/**
		Offset into pData where the descriptors to update are stored
		*/
		default VkDescriptorUpdateTemplateEntry offset(long offset){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.OFFSET, MemorySegment.ofAddress(offset));;
			return this;
		}

		/**
		Offset into pData where the descriptors to update are stored
		*/
		default long offset(){
			final var offset_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.OFFSET);
			return offset_.address();
		}

		/**
		Stride between two descriptors in pData when writing more than one descriptor
		*/
		default VkDescriptorUpdateTemplateEntry stride(long stride){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.STRIDE, MemorySegment.ofAddress(stride));;
			return this;
		}

		/**
		Stride between two descriptors in pData when writing more than one descriptor
		*/
		default long stride(){
			final var stride_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.STRIDE);
			return stride_.address();
		}

		MemorySegment address();

		public static VkDescriptorUpdateTemplateEntry allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDescriptorUpdateTemplateEntry> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.SIZEOF, (mem)->(VkDescriptorUpdateTemplateEntry)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindImagePlaneMemoryInfo.html">VkBindImagePlaneMemoryInfo</a>
	*/
	public interface VkBindImagePlaneMemoryInfo extends io.github.kartoffell.KLVulkan.Element<VkBindImagePlaneMemoryInfo>{
		default VkBindImagePlaneMemoryInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.STYPE);
		}

		default VkBindImagePlaneMemoryInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.PNEXT);
		}

		default VkBindImagePlaneMemoryInfo planeAspect(int planeAspect){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.PLANEASPECT, planeAspect);
			return this;
		}

		default int planeAspect(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.PLANEASPECT);
		}

		MemorySegment address();

		public static VkBindImagePlaneMemoryInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkBindImagePlaneMemoryInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.SIZEOF, (mem)->(VkBindImagePlaneMemoryInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageSparseMemoryRequirementsInfo2.html">VkImageSparseMemoryRequirementsInfo2</a>
	*/
	public interface VkImageSparseMemoryRequirementsInfo2 extends io.github.kartoffell.KLVulkan.Element<VkImageSparseMemoryRequirementsInfo2>{
		default VkImageSparseMemoryRequirementsInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.STYPE);
		}

		default VkImageSparseMemoryRequirementsInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.PNEXT);
		}

		default VkImageSparseMemoryRequirementsInfo2 image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		MemorySegment address();

		public static VkImageSparseMemoryRequirementsInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkImageSparseMemoryRequirementsInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.SIZEOF, (mem)->(VkImageSparseMemoryRequirementsInfo2)()->mem);
		}

	}

	public interface VkCommandPoolCreateFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkCommandPoolCreateFlagBits{
		public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 4;

	}

	public interface VkStructureType extends io.github.kartoffell.KLVulkan.VK10.VkStructureType{
		public static final int VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES = 1000071003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES = 1000063000;

		public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO = 1000156002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO = 1000071000;

		public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 = 1000146001;

		public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 = 1000059007;

		public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO = 1000117002;

		public static final int VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO = 1000145000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES = 1000083000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES = 1000053002;

		public static final int VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO = 1000156003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO = 1000112000;

		public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 = 1000059003;

		public static final int VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES = 1000071001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES = 1000053001;

		public static final int VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO = 1000117001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO = 1000076000;

		public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO = 1000072000;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO = 1000117003;

		public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 = 1000059005;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES = 1000070000;

		public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO = 1000077000;

		public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES = 1000156005;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES = 1000071004;

		public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO = 1000113000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 = 1000059001;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO = 1000085000;

		public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO = 1000127001;

		public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 = 1000146004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES = 1000145002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO = 1000071002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES = 1000063000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES = 1000117000;

		public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO = 1000070001;

		public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 = 1000059002;

		public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO = 1000060013;

		public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO = 1000060006;

		public static final int VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES = 1000076001;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT = 1000168001;

		public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO = 1000060004;

		public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2 = 1000146000;

		public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO = 1000157000;

		public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO = 1000060003;

		public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO = 1000157001;

		public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 = 1000146002;

		public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES = 1000112001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES = 1000094000;

		public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO = 1000072002;

		public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO = 1000156000;

		public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2 = 1000146003;

		public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO = 1000060014;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 = 1000059004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES = 1000156004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 = 1000059008;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES = 1000120000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 = 1000059000;

		public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO = 1000060000;

		public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO = 1000072001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES = 1000168000;

		public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO = 1000060005;

		public static final int VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO = 1000053000;

		public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS = 1000127000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES = 1000145001;

		public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO = 1000156001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 = 1000059006;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES = 1000120000;

		public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 = 1000145003;

	}

	public static class VkInstance extends io.github.kartoffell.KLVulkan.VK10.VkInstance{
		public VkInstance(MemorySegment address, VK11 parent) {
			super(address, parent);
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEnumeratePhysicalDeviceGroups.html">vkEnumeratePhysicalDeviceGroups</a>
		*/
		public int vkEnumeratePhysicalDeviceGroups(IntBuffer pPhysicalDeviceGroupCount, @Nullable Element<VkPhysicalDeviceGroupProperties> pPhysicalDeviceGroupProperties) {
			if(capabilities.vkEnumeratePhysicalDeviceGroups_==null) {
				capabilities.vkEnumeratePhysicalDeviceGroups_ = capabilities.lookup("vkEnumeratePhysicalDeviceGroups", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkEnumeratePhysicalDeviceGroups_.invoke(address(), (pPhysicalDeviceGroupCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPhysicalDeviceGroupCount)), (pPhysicalDeviceGroupProperties==null?MemorySegment.NULL:pPhysicalDeviceGroupProperties.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		protected VkInstance VkInstance(MemorySegment mem, Object parent) {
			return new VkInstance(mem, (VK11) parent); //Omega
		}

		protected VkPhysicalDevice VkPhysicalDevice(MemorySegment mem, Object parent) {
			return new VkPhysicalDevice(mem, (VkInstance) parent); //Omega
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkInputAttachmentAspectReference.html">VkInputAttachmentAspectReference</a>
	*/
	public interface VkInputAttachmentAspectReference extends io.github.kartoffell.KLVulkan.Element<VkInputAttachmentAspectReference>{
		default VkInputAttachmentAspectReference subpass(int subpass){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInputAttachmentAspectReference.SUBPASS, subpass);
			return this;
		}

		default int subpass(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInputAttachmentAspectReference.SUBPASS);
		}

		default VkInputAttachmentAspectReference inputAttachmentIndex(int inputAttachmentIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInputAttachmentAspectReference.INPUTATTACHMENTINDEX, inputAttachmentIndex);
			return this;
		}

		default int inputAttachmentIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInputAttachmentAspectReference.INPUTATTACHMENTINDEX);
		}

		default VkInputAttachmentAspectReference aspectMask(int aspectMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInputAttachmentAspectReference.ASPECTMASK, aspectMask);
			return this;
		}

		default int aspectMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInputAttachmentAspectReference.ASPECTMASK);
		}

		MemorySegment address();

		public static VkInputAttachmentAspectReference allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkInputAttachmentAspectReference.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkInputAttachmentAspectReference> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkInputAttachmentAspectReference.SIZEOF, (mem)->(VkInputAttachmentAspectReference)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalFenceHandleTypeFlagBits.html">VkExternalFenceHandleTypeFlagBits</a>
	*/
	public interface VkExternalFenceHandleTypeFlagBits{
		public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;

		public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;

		public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;

		public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = 8;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalSemaphoreProperties.html">VkExternalSemaphoreProperties</a>
	*/
	public interface VkExternalSemaphoreProperties extends io.github.kartoffell.KLVulkan.Element<VkExternalSemaphoreProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalSemaphoreProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExternalSemaphoreProperties.PNEXT);
		}

		default int exportFromImportedHandleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalSemaphoreProperties.EXPORTFROMIMPORTEDHANDLETYPES);
		}

		default int compatibleHandleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalSemaphoreProperties.COMPATIBLEHANDLETYPES);
		}

		@Nullable
		default int externalSemaphoreFeatures(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExternalSemaphoreProperties.EXTERNALSEMAPHOREFEATURES);
		}

		MemorySegment address();

		public static VkExternalSemaphoreProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExternalSemaphoreProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExternalSemaphoreProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExternalSemaphoreProperties.SIZEOF, (mem)->(VkExternalSemaphoreProperties)()->mem);
		}

	}

	public interface VkResult extends io.github.kartoffell.KLVulkan.VK10.VkResult{
		public static final int VK_ERROR_OUT_OF_POOL_MEMORY = 1000069000;

		public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = 1000072003;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSubgroupProperties.html">VkPhysicalDeviceSubgroupProperties</a>
	*/
	public interface VkPhysicalDeviceSubgroupProperties extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceSubgroupProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.PNEXT);
		}

		/**
		The size of a subgroup for this queue.
		*/
		default int subgroupSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.SUBGROUPSIZE);
		}

		/**
		Bitfield of what shader stages support subgroup operations
		*/
		default int supportedStages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.SUPPORTEDSTAGES);
		}

		/**
		Bitfield of what subgroup operations are supported.
		*/
		default int supportedOperations(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.SUPPORTEDOPERATIONS);
		}

		/**
		Flag to specify whether quad operations are available in all stages.
		*/
		default boolean quadOperationsInAllStages(){
			final var quadOperationsInAllStages_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.QUADOPERATIONSINALLSTAGES);
			return quadOperationsInAllStages_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceSubgroupProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceSubgroupProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties.SIZEOF, (mem)->(VkPhysicalDeviceSubgroupProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceQueueInfo2.html">VkDeviceQueueInfo2</a>
	*/
	public interface VkDeviceQueueInfo2 extends io.github.kartoffell.KLVulkan.Element<VkDeviceQueueInfo2>{
		default VkDeviceQueueInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.STYPE);
		}

		default VkDeviceQueueInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueInfo2.PNEXT);
		}

		default VkDeviceQueueInfo2 flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.FLAGS);
		}

		default VkDeviceQueueInfo2 queueFamilyIndex(int queueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.QUEUEFAMILYINDEX, queueFamilyIndex);
			return this;
		}

		default int queueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.QUEUEFAMILYINDEX);
		}

		default VkDeviceQueueInfo2 queueIndex(int queueIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.QUEUEINDEX, queueIndex);
			return this;
		}

		default int queueIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueInfo2.QUEUEINDEX);
		}

		MemorySegment address();

		public static VkDeviceQueueInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceQueueInfo2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDeviceQueueInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceQueueInfo2.SIZEOF, (mem)->(VkDeviceQueueInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindImageMemoryInfo.html">VkBindImageMemoryInfo</a>
	*/
	public interface VkBindImageMemoryInfo extends io.github.kartoffell.KLVulkan.Element<VkBindImageMemoryInfo>{
		default VkBindImageMemoryInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindImageMemoryInfo.STYPE);
		}

		default VkBindImageMemoryInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryInfo.PNEXT);
		}

		default VkBindImageMemoryInfo image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryInfo.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryInfo.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		default VkBindImageMemoryInfo memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryInfo.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindImageMemoryInfo.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		default VkBindImageMemoryInfo memoryOffset(long memoryOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBindImageMemoryInfo.MEMORYOFFSET, memoryOffset);
			return this;
		}

		default long memoryOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBindImageMemoryInfo.MEMORYOFFSET);
		}

		MemorySegment address();

		public static VkBindImageMemoryInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindImageMemoryInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkBindImageMemoryInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindImageMemoryInfo.SIZEOF, (mem)->(VkBindImageMemoryInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceExternalBufferInfo.html">VkPhysicalDeviceExternalBufferInfo</a>
	*/
	public interface VkPhysicalDeviceExternalBufferInfo extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceExternalBufferInfo>{
		default VkPhysicalDeviceExternalBufferInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.STYPE);
		}

		default VkPhysicalDeviceExternalBufferInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.PNEXT);
		}

		default VkPhysicalDeviceExternalBufferInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.FLAGS);
		}

		default VkPhysicalDeviceExternalBufferInfo usage(int usage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.USAGE, usage);
			return this;
		}

		@Nullable
		default int usage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.USAGE);
		}

		default VkPhysicalDeviceExternalBufferInfo handleType(int handleType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.HANDLETYPE, handleType);
			return this;
		}

		default int handleType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.HANDLETYPE);
		}

		MemorySegment address();

		public static VkPhysicalDeviceExternalBufferInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceExternalBufferInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.SIZEOF, (mem)->(VkPhysicalDeviceExternalBufferInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceFeatures2.html">VkPhysicalDeviceFeatures2</a>
	*/
	public interface VkPhysicalDeviceFeatures2 extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceFeatures2>{
		default VkPhysicalDeviceFeatures2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures2.STYPE);
		}

		default VkPhysicalDeviceFeatures2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceFeatures2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceFeatures2.PNEXT);
		}

		default VkPhysicalDeviceFeatures features(){
			final var features_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceFeatures2.FEATURES, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SIZEOF);
			return (features_.equals(MemorySegment.NULL)?null:(VkPhysicalDeviceFeatures)()->features_);
		}

		MemorySegment address();

		public static VkPhysicalDeviceFeatures2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceFeatures2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceFeatures2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceFeatures2.SIZEOF, (mem)->(VkPhysicalDeviceFeatures2)()->mem);
		}

	}

	public interface VkImageAspectFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkImageAspectFlagBits{
		public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = 16;

		public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = 32;

		public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = 64;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExternalFenceFeatureFlagBits.html">VkExternalFenceFeatureFlagBits</a>
	*/
	public interface VkExternalFenceFeatureFlagBits{
		public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 1;

		public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPeerMemoryFeatureFlagBits.html">VkPeerMemoryFeatureFlagBits</a>
	*/
	public interface VkPeerMemoryFeatureFlagBits{
		public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT = 1;

		public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 8;

		public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT = 2;

		public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSamplerYcbcrConversionFeatures.html">VkPhysicalDeviceSamplerYcbcrConversionFeatures</a>
	*/
	public interface VkPhysicalDeviceSamplerYcbcrConversionFeatures extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceSamplerYcbcrConversionFeatures>{
		default VkPhysicalDeviceSamplerYcbcrConversionFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.STYPE);
		}

		default VkPhysicalDeviceSamplerYcbcrConversionFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.PNEXT);
		}

		/**
		Sampler color conversion supported
		*/
		default VkPhysicalDeviceSamplerYcbcrConversionFeatures samplerYcbcrConversion(boolean samplerYcbcrConversion){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.SAMPLERYCBCRCONVERSION, samplerYcbcrConversion?1:0);
			return this;
		}

		/**
		Sampler color conversion supported
		*/
		default boolean samplerYcbcrConversion(){
			final var samplerYcbcrConversion_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.SAMPLERYCBCRCONVERSION);
			return samplerYcbcrConversion_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceSamplerYcbcrConversionFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceSamplerYcbcrConversionFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.SIZEOF, (mem)->(VkPhysicalDeviceSamplerYcbcrConversionFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceGroupDeviceCreateInfo.html">VkDeviceGroupDeviceCreateInfo</a>
	*/
	public interface VkDeviceGroupDeviceCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkDeviceGroupDeviceCreateInfo>{
		default VkDeviceGroupDeviceCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.STYPE);
		}

		default VkDeviceGroupDeviceCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.PNEXT);
		}

		default VkDeviceGroupDeviceCreateInfo physicalDeviceCount(int physicalDeviceCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.PHYSICALDEVICECOUNT, physicalDeviceCount);
			return this;
		}

		@Nullable
		default int physicalDeviceCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.PHYSICALDEVICECOUNT);
		}

		default VkDeviceGroupDeviceCreateInfo pPhysicalDevices(PointerBuffer<? extends Element<? extends VkPhysicalDevice>> pPhysicalDevices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.PPHYSICALDEVICES, (pPhysicalDevices==null?MemorySegment.NULL:pPhysicalDevices.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkPhysicalDevice>> pPhysicalDevices(){
			final var pPhysicalDevices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.PPHYSICALDEVICES);
			return (pPhysicalDevices_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pPhysicalDevices_, (v1415630650)->(v1415630650.equals(MemorySegment.NULL)?null:(Element<? extends VkPhysicalDevice>)()->v1415630650)));
		}

		MemorySegment address();

		public static VkDeviceGroupDeviceCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDeviceGroupDeviceCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.SIZEOF, (mem)->(VkDeviceGroupDeviceCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMultiviewFeatures.html">VkPhysicalDeviceMultiviewFeatures</a>
	*/
	public interface VkPhysicalDeviceMultiviewFeatures extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceMultiviewFeatures>{
		default VkPhysicalDeviceMultiviewFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.STYPE);
		}

		default VkPhysicalDeviceMultiviewFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.PNEXT);
		}

		/**
		Multiple views in a render pass
		*/
		default VkPhysicalDeviceMultiviewFeatures multiview(boolean multiview){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.MULTIVIEW, multiview?1:0);
			return this;
		}

		/**
		Multiple views in a render pass
		*/
		default boolean multiview(){
			final var multiview_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.MULTIVIEW);
			return multiview_!=0;
		}

		/**
		Multiple views in a render pass w/ geometry shader
		*/
		default VkPhysicalDeviceMultiviewFeatures multiviewGeometryShader(boolean multiviewGeometryShader){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.MULTIVIEWGEOMETRYSHADER, multiviewGeometryShader?1:0);
			return this;
		}

		/**
		Multiple views in a render pass w/ geometry shader
		*/
		default boolean multiviewGeometryShader(){
			final var multiviewGeometryShader_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.MULTIVIEWGEOMETRYSHADER);
			return multiviewGeometryShader_!=0;
		}

		/**
		Multiple views in a render pass w/ tessellation shader
		*/
		default VkPhysicalDeviceMultiviewFeatures multiviewTessellationShader(boolean multiviewTessellationShader){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.MULTIVIEWTESSELLATIONSHADER, multiviewTessellationShader?1:0);
			return this;
		}

		/**
		Multiple views in a render pass w/ tessellation shader
		*/
		default boolean multiviewTessellationShader(){
			final var multiviewTessellationShader_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.MULTIVIEWTESSELLATIONSHADER);
			return multiviewTessellationShader_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceMultiviewFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceMultiviewFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.SIZEOF, (mem)->(VkPhysicalDeviceMultiviewFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorUpdateTemplate.html">VkDescriptorUpdateTemplate</a>
	*/
	public static record VkDescriptorUpdateTemplate(MemorySegment address, VkDevice parent) implements io.github.kartoffell.KLVulkan.Element<VkDescriptorUpdateTemplate>{
		public static PointerBuffer<? extends VkDescriptorUpdateTemplate> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkDescriptorUpdateTemplate(mem, parent)); //VkDescriptorUpdateTemplate
		}

		public static PointerBuffer<? extends VkDescriptorUpdateTemplate> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubgroupFeatureFlagBits.html">VkSubgroupFeatureFlagBits</a>
	*/
	public interface VkSubgroupFeatureFlagBits{
		public static final int VK_SUBGROUP_FEATURE_QUAD_BIT = 128;

		public static final int VK_SUBGROUP_FEATURE_SHUFFLE_BIT = 16;

		public static final int VK_SUBGROUP_FEATURE_BASIC_BIT = 1;

		public static final int VK_SUBGROUP_FEATURE_VOTE_BIT = 2;

		public static final int VK_SUBGROUP_FEATURE_ARITHMETIC_BIT = 4;

		public static final int VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 32;

		public static final int VK_SUBGROUP_FEATURE_CLUSTERED_BIT = 64;

		public static final int VK_SUBGROUP_FEATURE_BALLOT_BIT = 8;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceExternalSemaphoreInfo.html">VkPhysicalDeviceExternalSemaphoreInfo</a>
	*/
	public interface VkPhysicalDeviceExternalSemaphoreInfo extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceExternalSemaphoreInfo>{
		default VkPhysicalDeviceExternalSemaphoreInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.STYPE);
		}

		default VkPhysicalDeviceExternalSemaphoreInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.PNEXT);
		}

		default VkPhysicalDeviceExternalSemaphoreInfo handleType(int handleType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.HANDLETYPE, handleType);
			return this;
		}

		default int handleType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.HANDLETYPE);
		}

		MemorySegment address();

		public static VkPhysicalDeviceExternalSemaphoreInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceExternalSemaphoreInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.SIZEOF, (mem)->(VkPhysicalDeviceExternalSemaphoreInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExportFenceCreateInfo.html">VkExportFenceCreateInfo</a>
	*/
	public interface VkExportFenceCreateInfo extends io.github.kartoffell.KLVulkan.Element<VkExportFenceCreateInfo>{
		default VkExportFenceCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportFenceCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportFenceCreateInfo.STYPE);
		}

		default VkExportFenceCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExportFenceCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExportFenceCreateInfo.PNEXT);
		}

		default VkExportFenceCreateInfo handleTypes(int handleTypes){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportFenceCreateInfo.HANDLETYPES, handleTypes);
			return this;
		}

		@Nullable
		default int handleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportFenceCreateInfo.HANDLETYPES);
		}

		MemorySegment address();

		public static VkExportFenceCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExportFenceCreateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExportFenceCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExportFenceCreateInfo.SIZEOF, (mem)->(VkExportFenceCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerYcbcrRange.html">VkSamplerYcbcrRange</a>
	*/
	public interface VkSamplerYcbcrRange{
		public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;

		public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;

	}

	public interface VkPhysicalDeviceVariablePointerFeatures extends io.github.kartoffell.KLVulkan.VK11.VkPhysicalDeviceVariablePointersFeatures{
	}

	public interface VkDependencyFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkDependencyFlagBits{
		public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 4;

		public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceQueueCreateFlagBits.html">VkDeviceQueueCreateFlagBits</a>
	*/
	public interface VkDeviceQueueCreateFlagBits{
		public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageMemoryRequirementsInfo2.html">VkImageMemoryRequirementsInfo2</a>
	*/
	public interface VkImageMemoryRequirementsInfo2 extends io.github.kartoffell.KLVulkan.Element<VkImageMemoryRequirementsInfo2>{
		default VkImageMemoryRequirementsInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.STYPE);
		}

		default VkImageMemoryRequirementsInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.PNEXT);
		}

		default VkImageMemoryRequirementsInfo2 image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		MemorySegment address();

		public static VkImageMemoryRequirementsInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkImageMemoryRequirementsInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.SIZEOF, (mem)->(VkImageMemoryRequirementsInfo2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceExternalFenceInfo.html">VkPhysicalDeviceExternalFenceInfo</a>
	*/
	public interface VkPhysicalDeviceExternalFenceInfo extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceExternalFenceInfo>{
		default VkPhysicalDeviceExternalFenceInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.STYPE);
		}

		default VkPhysicalDeviceExternalFenceInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.PNEXT);
		}

		default VkPhysicalDeviceExternalFenceInfo handleType(int handleType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.HANDLETYPE, handleType);
			return this;
		}

		default int handleType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.HANDLETYPE);
		}

		MemorySegment address();

		public static VkPhysicalDeviceExternalFenceInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceExternalFenceInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo.SIZEOF, (mem)->(VkPhysicalDeviceExternalFenceInfo)()->mem);
		}

	}

	public interface VkMemoryPropertyFlagBits extends io.github.kartoffell.KLVulkan.VK10.VkMemoryPropertyFlagBits{
		public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 32;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFormatProperties2.html">VkFormatProperties2</a>
	*/
	public interface VkFormatProperties2 extends io.github.kartoffell.KLVulkan.Element<VkFormatProperties2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFormatProperties2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFormatProperties2.PNEXT);
		}

		default VkFormatProperties formatProperties(){
			final var formatProperties_ = address().asSlice(org.lwjgl.vulkan.VkFormatProperties2.FORMATPROPERTIES, org.lwjgl.vulkan.VkFormatProperties.SIZEOF);
			return (formatProperties_.equals(MemorySegment.NULL)?null:(VkFormatProperties)()->formatProperties_);
		}

		MemorySegment address();

		public static VkFormatProperties2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkFormatProperties2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkFormatProperties2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkFormatProperties2.SIZEOF, (mem)->(VkFormatProperties2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreImportFlagBits.html">VkSemaphoreImportFlagBits</a>
	*/
	public interface VkSemaphoreImportFlagBits{
		public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceGroupSubmitInfo.html">VkDeviceGroupSubmitInfo</a>
	*/
	public interface VkDeviceGroupSubmitInfo extends io.github.kartoffell.KLVulkan.Element<VkDeviceGroupSubmitInfo>{
		default VkDeviceGroupSubmitInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.STYPE);
		}

		default VkDeviceGroupSubmitInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PNEXT);
		}

		default VkDeviceGroupSubmitInfo waitSemaphoreCount(int waitSemaphoreCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.WAITSEMAPHORECOUNT, waitSemaphoreCount);
			return this;
		}

		@Nullable
		default int waitSemaphoreCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.WAITSEMAPHORECOUNT);
		}

		default VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndices(IntBuffer pWaitSemaphoreDeviceIndices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PWAITSEMAPHOREDEVICEINDICES, (pWaitSemaphoreDeviceIndices==null?MemorySegment.NULL:MemorySegment.ofBuffer(pWaitSemaphoreDeviceIndices)));
			return this;
		}

		default IntBuffer pWaitSemaphoreDeviceIndices(){
			final var pWaitSemaphoreDeviceIndices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PWAITSEMAPHOREDEVICEINDICES);
			return (pWaitSemaphoreDeviceIndices_.equals(MemorySegment.NULL)?null:pWaitSemaphoreDeviceIndices_.asByteBuffer().asIntBuffer());
		}

		default VkDeviceGroupSubmitInfo commandBufferCount(int commandBufferCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.COMMANDBUFFERCOUNT, commandBufferCount);
			return this;
		}

		@Nullable
		default int commandBufferCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.COMMANDBUFFERCOUNT);
		}

		default VkDeviceGroupSubmitInfo pCommandBufferDeviceMasks(IntBuffer pCommandBufferDeviceMasks){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PCOMMANDBUFFERDEVICEMASKS, (pCommandBufferDeviceMasks==null?MemorySegment.NULL:MemorySegment.ofBuffer(pCommandBufferDeviceMasks)));
			return this;
		}

		default IntBuffer pCommandBufferDeviceMasks(){
			final var pCommandBufferDeviceMasks_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PCOMMANDBUFFERDEVICEMASKS);
			return (pCommandBufferDeviceMasks_.equals(MemorySegment.NULL)?null:pCommandBufferDeviceMasks_.asByteBuffer().asIntBuffer());
		}

		default VkDeviceGroupSubmitInfo signalSemaphoreCount(int signalSemaphoreCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.SIGNALSEMAPHORECOUNT, signalSemaphoreCount);
			return this;
		}

		@Nullable
		default int signalSemaphoreCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.SIGNALSEMAPHORECOUNT);
		}

		default VkDeviceGroupSubmitInfo pSignalSemaphoreDeviceIndices(IntBuffer pSignalSemaphoreDeviceIndices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PSIGNALSEMAPHOREDEVICEINDICES, (pSignalSemaphoreDeviceIndices==null?MemorySegment.NULL:MemorySegment.ofBuffer(pSignalSemaphoreDeviceIndices)));
			return this;
		}

		default IntBuffer pSignalSemaphoreDeviceIndices(){
			final var pSignalSemaphoreDeviceIndices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.PSIGNALSEMAPHOREDEVICEINDICES);
			return (pSignalSemaphoreDeviceIndices_.equals(MemorySegment.NULL)?null:pSignalSemaphoreDeviceIndices_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		public static VkDeviceGroupSubmitInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkDeviceGroupSubmitInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.SIZEOF, (mem)->(VkDeviceGroupSubmitInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMemoryProperties2.html">VkPhysicalDeviceMemoryProperties2</a>
	*/
	public interface VkPhysicalDeviceMemoryProperties2 extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceMemoryProperties2>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2.PNEXT);
		}

		default VkPhysicalDeviceMemoryProperties memoryProperties(){
			final var memoryProperties_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2.MEMORYPROPERTIES, org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties.SIZEOF);
			return (memoryProperties_.equals(MemorySegment.NULL)?null:(VkPhysicalDeviceMemoryProperties)()->memoryProperties_);
		}

		MemorySegment address();

		public static VkPhysicalDeviceMemoryProperties2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceMemoryProperties2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2.SIZEOF, (mem)->(VkPhysicalDeviceMemoryProperties2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExportMemoryAllocateInfo.html">VkExportMemoryAllocateInfo</a>
	*/
	public interface VkExportMemoryAllocateInfo extends io.github.kartoffell.KLVulkan.Element<VkExportMemoryAllocateInfo>{
		default VkExportMemoryAllocateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportMemoryAllocateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportMemoryAllocateInfo.STYPE);
		}

		default VkExportMemoryAllocateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExportMemoryAllocateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkExportMemoryAllocateInfo.PNEXT);
		}

		default VkExportMemoryAllocateInfo handleTypes(int handleTypes){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportMemoryAllocateInfo.HANDLETYPES, handleTypes);
			return this;
		}

		@Nullable
		default int handleTypes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExportMemoryAllocateInfo.HANDLETYPES);
		}

		MemorySegment address();

		public static VkExportMemoryAllocateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExportMemoryAllocateInfo.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkExportMemoryAllocateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExportMemoryAllocateInfo.SIZEOF, (mem)->(VkExportMemoryAllocateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkTessellationDomainOrigin.html">VkTessellationDomainOrigin</a>
	*/
	public interface VkTessellationDomainOrigin{
		public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0;

		public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceProtectedMemoryProperties.html">VkPhysicalDeviceProtectedMemoryProperties</a>
	*/
	public interface VkPhysicalDeviceProtectedMemoryProperties extends io.github.kartoffell.KLVulkan.Element<VkPhysicalDeviceProtectedMemoryProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties.PNEXT);
		}

		default boolean protectedNoFault(){
			final var protectedNoFault_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties.PROTECTEDNOFAULT);
			return protectedNoFault_!=0;
		}

		MemorySegment address();

		public static VkPhysicalDeviceProtectedMemoryProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkPhysicalDeviceProtectedMemoryProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties.SIZEOF, (mem)->(VkPhysicalDeviceProtectedMemoryProperties)()->mem);
		}

	}

	protected final VkCapabilitiesGlobal capabilities = new VkCapabilitiesGlobal();

	public VkCapabilitiesGlobal capabilities() {
		return capabilities;
	}

	/**
	@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
	@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
	@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEnumerateInstanceVersion.html">vkEnumerateInstanceVersion</a>
	*/
	public void vkEnumerateInstanceVersion(IntBuffer pApiVersion) {
		if(capabilities.vkEnumerateInstanceVersion_==null) {
			capabilities.vkEnumerateInstanceVersion_ = capabilities.lookup("vkEnumerateInstanceVersion", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
		}
		try {
			final var return_ = (int) capabilities.vkEnumerateInstanceVersion_.invoke((pApiVersion==null?MemorySegment.NULL:MemorySegment.ofBuffer(pApiVersion)));
			if(return_<0) {checkError(return_); throw new VulkanError(return_);}
		} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
	}

	public static void checkError(int code) {
		VK10.checkError(code);
		switch (code) {
			case 1000069000 -> throw new VK_ERROR_OUT_OF_POOL_MEMORY();
			case 1000072003 -> throw new VK_ERROR_INVALID_EXTERNAL_HANDLE();

		}
	}

}
