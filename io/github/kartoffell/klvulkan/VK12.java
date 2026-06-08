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
Vulkan 1.2 core API interface definitions (merged)
*/
public class VK12 extends io.github.kartoffell.klvulkan.VK11{
	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentReferenceStencilLayout.html">VkAttachmentReferenceStencilLayout</a>
	*/
	public interface VkAttachmentReferenceStencilLayout extends io.github.kartoffell.klvulkan.Element<VkAttachmentReferenceStencilLayout>{
		default VkAttachmentReferenceStencilLayout sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.STYPE);
		}

		default VkAttachmentReferenceStencilLayout pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.PNEXT);
		}

		default VkAttachmentReferenceStencilLayout stencilLayout(int stencilLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.STENCILLAYOUT, stencilLayout);
			return this;
		}

		default int stencilLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.STENCILLAYOUT);
		}

		MemorySegment address();

		/**
		Allocates a new VkAttachmentReferenceStencilLayout from the given Arena.
		*/
		public static VkAttachmentReferenceStencilLayout allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkAttachmentReferenceStencilLayout from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkAttachmentReferenceStencilLayout> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.SIZEOF, (mem)->(VkAttachmentReferenceStencilLayout)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferOpaqueCaptureAddressCreateInfo.html">VkBufferOpaqueCaptureAddressCreateInfo</a>
	*/
	public interface VkBufferOpaqueCaptureAddressCreateInfo extends io.github.kartoffell.klvulkan.Element<VkBufferOpaqueCaptureAddressCreateInfo>{
		default VkBufferOpaqueCaptureAddressCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.STYPE);
		}

		default VkBufferOpaqueCaptureAddressCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.PNEXT);
		}

		default VkBufferOpaqueCaptureAddressCreateInfo opaqueCaptureAddress(long opaqueCaptureAddress){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.OPAQUECAPTUREADDRESS, opaqueCaptureAddress);
			return this;
		}

		default long opaqueCaptureAddress(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.OPAQUECAPTUREADDRESS);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferOpaqueCaptureAddressCreateInfo from the given Arena.
		*/
		public static VkBufferOpaqueCaptureAddressCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferOpaqueCaptureAddressCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferOpaqueCaptureAddressCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.SIZEOF, (mem)->(VkBufferOpaqueCaptureAddressCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentDescriptionStencilLayout.html">VkAttachmentDescriptionStencilLayout</a>
	*/
	public interface VkAttachmentDescriptionStencilLayout extends io.github.kartoffell.klvulkan.Element<VkAttachmentDescriptionStencilLayout>{
		default VkAttachmentDescriptionStencilLayout sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.STYPE);
		}

		default VkAttachmentDescriptionStencilLayout pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.PNEXT);
		}

		default VkAttachmentDescriptionStencilLayout stencilInitialLayout(int stencilInitialLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.STENCILINITIALLAYOUT, stencilInitialLayout);
			return this;
		}

		default int stencilInitialLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.STENCILINITIALLAYOUT);
		}

		default VkAttachmentDescriptionStencilLayout stencilFinalLayout(int stencilFinalLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.STENCILFINALLAYOUT, stencilFinalLayout);
			return this;
		}

		default int stencilFinalLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.STENCILFINALLAYOUT);
		}

		MemorySegment address();

		/**
		Allocates a new VkAttachmentDescriptionStencilLayout from the given Arena.
		*/
		public static VkAttachmentDescriptionStencilLayout allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkAttachmentDescriptionStencilLayout from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkAttachmentDescriptionStencilLayout> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.SIZEOF, (mem)->(VkAttachmentDescriptionStencilLayout)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceScalarBlockLayoutFeatures.html">VkPhysicalDeviceScalarBlockLayoutFeatures</a>
	*/
	public interface VkPhysicalDeviceScalarBlockLayoutFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceScalarBlockLayoutFeatures>{
		default VkPhysicalDeviceScalarBlockLayoutFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.STYPE);
		}

		default VkPhysicalDeviceScalarBlockLayoutFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.PNEXT);
		}

		default VkPhysicalDeviceScalarBlockLayoutFeatures scalarBlockLayout(boolean scalarBlockLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.SCALARBLOCKLAYOUT, scalarBlockLayout?1:0);
			return this;
		}

		default boolean scalarBlockLayout(){
			final var scalarBlockLayout_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.SCALARBLOCKLAYOUT);
			return scalarBlockLayout_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceScalarBlockLayoutFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceScalarBlockLayoutFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceScalarBlockLayoutFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceScalarBlockLayoutFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.SIZEOF, (mem)->(VkPhysicalDeviceScalarBlockLayoutFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPassAttachmentBeginInfo.html">VkRenderPassAttachmentBeginInfo</a>
	*/
	public interface VkRenderPassAttachmentBeginInfo extends io.github.kartoffell.klvulkan.Element<VkRenderPassAttachmentBeginInfo>{
		default VkRenderPassAttachmentBeginInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.STYPE);
		}

		default VkRenderPassAttachmentBeginInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.PNEXT);
		}

		default VkRenderPassAttachmentBeginInfo attachmentCount(int attachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.ATTACHMENTCOUNT, attachmentCount);
			return this;
		}

		@Nullable
		default int attachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.ATTACHMENTCOUNT);
		}

		default VkRenderPassAttachmentBeginInfo pAttachments(PointerBuffer<? extends Element<? extends VkImageView>> pAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.PATTACHMENTS, (pAttachments==null?MemorySegment.NULL:pAttachments.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkImageView>> pAttachments(){
			final var pAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.PATTACHMENTS);
			return (pAttachments_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pAttachments_, (v1705072168)->(v1705072168.equals(MemorySegment.NULL)?null:(Element<? extends VkImageView>)()->v1705072168)));
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderPassAttachmentBeginInfo from the given Arena.
		*/
		public static VkRenderPassAttachmentBeginInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderPassAttachmentBeginInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderPassAttachmentBeginInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.SIZEOF, (mem)->(VkRenderPassAttachmentBeginInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassDependency2.html">VkSubpassDependency2</a>
	*/
	public interface VkSubpassDependency2 extends io.github.kartoffell.klvulkan.Element<VkSubpassDependency2>{
		default VkSubpassDependency2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.STYPE);
		}

		default VkSubpassDependency2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDependency2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDependency2.PNEXT);
		}

		default VkSubpassDependency2 srcSubpass(int srcSubpass){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.SRCSUBPASS, srcSubpass);
			return this;
		}

		default int srcSubpass(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.SRCSUBPASS);
		}

		default VkSubpassDependency2 dstSubpass(int dstSubpass){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DSTSUBPASS, dstSubpass);
			return this;
		}

		default int dstSubpass(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DSTSUBPASS);
		}

		default VkSubpassDependency2 srcStageMask(int srcStageMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.SRCSTAGEMASK, srcStageMask);
			return this;
		}

		@Nullable
		default int srcStageMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.SRCSTAGEMASK);
		}

		default VkSubpassDependency2 dstStageMask(int dstStageMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DSTSTAGEMASK, dstStageMask);
			return this;
		}

		@Nullable
		default int dstStageMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DSTSTAGEMASK);
		}

		default VkSubpassDependency2 srcAccessMask(int srcAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		@Nullable
		default int srcAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.SRCACCESSMASK);
		}

		default VkSubpassDependency2 dstAccessMask(int dstAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		@Nullable
		default int dstAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DSTACCESSMASK);
		}

		default VkSubpassDependency2 dependencyFlags(int dependencyFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DEPENDENCYFLAGS, dependencyFlags);
			return this;
		}

		@Nullable
		default int dependencyFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.DEPENDENCYFLAGS);
		}

		default VkSubpassDependency2 viewOffset(int viewOffset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.VIEWOFFSET, viewOffset);
			return this;
		}

		default int viewOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency2.VIEWOFFSET);
		}

		MemorySegment address();

		/**
		Allocates a new VkSubpassDependency2 from the given Arena.
		*/
		public static VkSubpassDependency2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubpassDependency2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubpassDependency2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubpassDependency2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubpassDependency2.SIZEOF, (mem)->(VkSubpassDependency2)()->mem);
		}

	}

	public interface VkImageLayout extends io.github.kartoffell.klvulkan.VK11.VkImageLayout{
		public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL = 1000241000;

		public static final int VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL = 1000241002;

		public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL = 1000241001;

		public static final int VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL = 1000241003;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorBindingFlagBits.html">VkDescriptorBindingFlagBits</a>
	*/
	public interface VkDescriptorBindingFlagBits{
		public static final int VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT = 1;

		public static final int VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT = 2;

		public static final int VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT = 4;

		public static final int VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT = 8;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan11Properties.html">VkPhysicalDeviceVulkan11Properties</a>
	*/
	public interface VkPhysicalDeviceVulkan11Properties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan11Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.PNEXT);
		}

		default ByteBuffer deviceUUID(){
			final var deviceUUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.DEVICEUUID, 1*API_Constants.VK_UUID_SIZE);
			return (deviceUUID_.equals(MemorySegment.NULL)?null:deviceUUID_.asByteBuffer());
		}

		default ByteBuffer driverUUID(){
			final var driverUUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.DRIVERUUID, 1*API_Constants.VK_UUID_SIZE);
			return (driverUUID_.equals(MemorySegment.NULL)?null:driverUUID_.asByteBuffer());
		}

		default ByteBuffer deviceLUID(){
			final var deviceLUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.DEVICELUID, 1*API_Constants.VK_LUID_SIZE);
			return (deviceLUID_.equals(MemorySegment.NULL)?null:deviceLUID_.asByteBuffer());
		}

		default int deviceNodeMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.DEVICENODEMASK);
		}

		default boolean deviceLUIDValid(){
			final var deviceLUIDValid_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.DEVICELUIDVALID);
			return deviceLUIDValid_!=0;
		}

		/**
		The size of a subgroup for this queue.
		*/
		default int subgroupSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.SUBGROUPSIZE);
		}

		/**
		Bitfield of what shader stages support subgroup operations
		*/
		default int subgroupSupportedStages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.SUBGROUPSUPPORTEDSTAGES);
		}

		/**
		Bitfield of what subgroup operations are supported.
		*/
		default int subgroupSupportedOperations(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.SUBGROUPSUPPORTEDOPERATIONS);
		}

		/**
		Flag to specify whether quad operations are available in all stages.
		*/
		default boolean subgroupQuadOperationsInAllStages(){
			final var subgroupQuadOperationsInAllStages_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.SUBGROUPQUADOPERATIONSINALLSTAGES);
			return subgroupQuadOperationsInAllStages_!=0;
		}

		default int pointClippingBehavior(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.POINTCLIPPINGBEHAVIOR);
		}

		/**
		max number of views in a subpass
		*/
		default int maxMultiviewViewCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.MAXMULTIVIEWVIEWCOUNT);
		}

		/**
		max instance index for a draw in a multiview subpass
		*/
		default int maxMultiviewInstanceIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.MAXMULTIVIEWINSTANCEINDEX);
		}

		default boolean protectedNoFault(){
			final var protectedNoFault_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.PROTECTEDNOFAULT);
			return protectedNoFault_!=0;
		}

		default int maxPerSetDescriptors(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.MAXPERSETDESCRIPTORS);
		}

		default long maxMemoryAllocationSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.MAXMEMORYALLOCATIONSIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan11Properties from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan11Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan11Properties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan11Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties.SIZEOF, (mem)->(VkPhysicalDeviceVulkan11Properties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPassCreateInfo2.html">VkRenderPassCreateInfo2</a>
	*/
	public interface VkRenderPassCreateInfo2 extends io.github.kartoffell.klvulkan.Element<VkRenderPassCreateInfo2>{
		default VkRenderPassCreateInfo2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.STYPE);
		}

		default VkRenderPassCreateInfo2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PNEXT);
		}

		default VkRenderPassCreateInfo2 flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.FLAGS);
		}

		default VkRenderPassCreateInfo2 attachmentCount(int attachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.ATTACHMENTCOUNT, attachmentCount);
			return this;
		}

		@Nullable
		default int attachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.ATTACHMENTCOUNT);
		}

		default VkRenderPassCreateInfo2 pAttachments(Element<VkAttachmentDescription2> pAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PATTACHMENTS, (pAttachments==null?MemorySegment.NULL:pAttachments.address()));
			return this;
		}

		default Element<VkAttachmentDescription2> pAttachments(){
			final var pAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PATTACHMENTS);
			return (pAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pAttachments_, org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF, (v778720569)->(v778720569.equals(MemorySegment.NULL)?null:(VkAttachmentDescription2)()->v778720569)));
		}

		default VkRenderPassCreateInfo2 subpassCount(int subpassCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.SUBPASSCOUNT, subpassCount);
			return this;
		}

		default int subpassCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.SUBPASSCOUNT);
		}

		default VkRenderPassCreateInfo2 pSubpasses(Element<VkSubpassDescription2> pSubpasses){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PSUBPASSES, (pSubpasses==null?MemorySegment.NULL:pSubpasses.address()));
			return this;
		}

		default Element<VkSubpassDescription2> pSubpasses(){
			final var pSubpasses_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PSUBPASSES);
			return (pSubpasses_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pSubpasses_, org.lwjgl.vulkan.VkSubpassDescription2.SIZEOF, (v1070157899)->(v1070157899.equals(MemorySegment.NULL)?null:(VkSubpassDescription2)()->v1070157899)));
		}

		default VkRenderPassCreateInfo2 dependencyCount(int dependencyCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.DEPENDENCYCOUNT, dependencyCount);
			return this;
		}

		@Nullable
		default int dependencyCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.DEPENDENCYCOUNT);
		}

		default VkRenderPassCreateInfo2 pDependencies(Element<VkSubpassDependency2> pDependencies){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PDEPENDENCIES, (pDependencies==null?MemorySegment.NULL:pDependencies.address()));
			return this;
		}

		default Element<VkSubpassDependency2> pDependencies(){
			final var pDependencies_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PDEPENDENCIES);
			return (pDependencies_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDependencies_, org.lwjgl.vulkan.VkSubpassDependency2.SIZEOF, (v1828868503)->(v1828868503.equals(MemorySegment.NULL)?null:(VkSubpassDependency2)()->v1828868503)));
		}

		default VkRenderPassCreateInfo2 correlatedViewMaskCount(int correlatedViewMaskCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT, correlatedViewMaskCount);
			return this;
		}

		@Nullable
		default int correlatedViewMaskCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT);
		}

		default VkRenderPassCreateInfo2 pCorrelatedViewMasks(IntBuffer pCorrelatedViewMasks){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS, (pCorrelatedViewMasks==null?MemorySegment.NULL:MemorySegment.ofBuffer(pCorrelatedViewMasks)));
			return this;
		}

		default IntBuffer pCorrelatedViewMasks(){
			final var pCorrelatedViewMasks_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS);
			return (pCorrelatedViewMasks_.equals(MemorySegment.NULL)?null:pCorrelatedViewMasks_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderPassCreateInfo2 from the given Arena.
		*/
		public static VkRenderPassCreateInfo2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderPassCreateInfo2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderPassCreateInfo2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF, (mem)->(VkRenderPassCreateInfo2)()->mem);
		}

	}

	public interface VkBufferUsageFlagBits extends io.github.kartoffell.klvulkan.VK10.VkBufferUsageFlagBits{
		public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT = 131072;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceDescriptorIndexingProperties.html">VkPhysicalDeviceDescriptorIndexingProperties</a>
	*/
	public interface VkPhysicalDeviceDescriptorIndexingProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceDescriptorIndexingProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.PNEXT);
		}

		default int maxUpdateAfterBindDescriptorsInAllPools(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS);
		}

		default boolean shaderUniformBufferArrayNonUniformIndexingNative(){
			final var shaderUniformBufferArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderUniformBufferArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderSampledImageArrayNonUniformIndexingNative(){
			final var shaderSampledImageArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderSampledImageArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderStorageBufferArrayNonUniformIndexingNative(){
			final var shaderStorageBufferArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderStorageBufferArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderStorageImageArrayNonUniformIndexingNative(){
			final var shaderStorageImageArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderStorageImageArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderInputAttachmentArrayNonUniformIndexingNative(){
			final var shaderInputAttachmentArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderInputAttachmentArrayNonUniformIndexingNative_!=0;
		}

		default boolean robustBufferAccessUpdateAfterBind(){
			final var robustBufferAccessUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ROBUSTBUFFERACCESSUPDATEAFTERBIND);
			return robustBufferAccessUpdateAfterBind_!=0;
		}

		default boolean quadDivergentImplicitLod(){
			final var quadDivergentImplicitLod_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.QUADDIVERGENTIMPLICITLOD);
			return quadDivergentImplicitLod_!=0;
		}

		default int maxPerStageDescriptorUpdateAfterBindSamplers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS);
		}

		default int maxPerStageDescriptorUpdateAfterBindUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS);
		}

		default int maxPerStageDescriptorUpdateAfterBindStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS);
		}

		default int maxPerStageDescriptorUpdateAfterBindSampledImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES);
		}

		default int maxPerStageDescriptorUpdateAfterBindStorageImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES);
		}

		default int maxPerStageDescriptorUpdateAfterBindInputAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS);
		}

		default int maxPerStageUpdateAfterBindResources(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES);
		}

		default int maxDescriptorSetUpdateAfterBindSamplers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS);
		}

		default int maxDescriptorSetUpdateAfterBindUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS);
		}

		default int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC);
		}

		default int maxDescriptorSetUpdateAfterBindStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS);
		}

		default int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC);
		}

		default int maxDescriptorSetUpdateAfterBindSampledImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES);
		}

		default int maxDescriptorSetUpdateAfterBindStorageImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES);
		}

		default int maxDescriptorSetUpdateAfterBindInputAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceDescriptorIndexingProperties from the given Arena.
		*/
		public static VkPhysicalDeviceDescriptorIndexingProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceDescriptorIndexingProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceDescriptorIndexingProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF, (mem)->(VkPhysicalDeviceDescriptorIndexingProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceDescriptorIndexingFeatures.html">VkPhysicalDeviceDescriptorIndexingFeatures</a>
	*/
	public interface VkPhysicalDeviceDescriptorIndexingFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceDescriptorIndexingFeatures>{
		default VkPhysicalDeviceDescriptorIndexingFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.STYPE);
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.PNEXT);
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(boolean shaderInputAttachmentArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, shaderInputAttachmentArrayDynamicIndexing?1:0);
			return this;
		}

		default boolean shaderInputAttachmentArrayDynamicIndexing(){
			final var shaderInputAttachmentArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING);
			return shaderInputAttachmentArrayDynamicIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(boolean shaderUniformTexelBufferArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, shaderUniformTexelBufferArrayDynamicIndexing?1:0);
			return this;
		}

		default boolean shaderUniformTexelBufferArrayDynamicIndexing(){
			final var shaderUniformTexelBufferArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING);
			return shaderUniformTexelBufferArrayDynamicIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(boolean shaderStorageTexelBufferArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, shaderStorageTexelBufferArrayDynamicIndexing?1:0);
			return this;
		}

		default boolean shaderStorageTexelBufferArrayDynamicIndexing(){
			final var shaderStorageTexelBufferArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING);
			return shaderStorageTexelBufferArrayDynamicIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(boolean shaderUniformBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, shaderUniformBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderUniformBufferArrayNonUniformIndexing(){
			final var shaderUniformBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING);
			return shaderUniformBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(boolean shaderSampledImageArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, shaderSampledImageArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderSampledImageArrayNonUniformIndexing(){
			final var shaderSampledImageArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING);
			return shaderSampledImageArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(boolean shaderStorageBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, shaderStorageBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderStorageBufferArrayNonUniformIndexing(){
			final var shaderStorageBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING);
			return shaderStorageBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(boolean shaderStorageImageArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, shaderStorageImageArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderStorageImageArrayNonUniformIndexing(){
			final var shaderStorageImageArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING);
			return shaderStorageImageArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(boolean shaderInputAttachmentArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, shaderInputAttachmentArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderInputAttachmentArrayNonUniformIndexing(){
			final var shaderInputAttachmentArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING);
			return shaderInputAttachmentArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(boolean shaderUniformTexelBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, shaderUniformTexelBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderUniformTexelBufferArrayNonUniformIndexing(){
			final var shaderUniformTexelBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING);
			return shaderUniformTexelBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(boolean shaderStorageTexelBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, shaderStorageTexelBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderStorageTexelBufferArrayNonUniformIndexing(){
			final var shaderStorageTexelBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING);
			return shaderStorageTexelBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(boolean descriptorBindingUniformBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, descriptorBindingUniformBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingUniformBufferUpdateAfterBind(){
			final var descriptorBindingUniformBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND);
			return descriptorBindingUniformBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(boolean descriptorBindingSampledImageUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, descriptorBindingSampledImageUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingSampledImageUpdateAfterBind(){
			final var descriptorBindingSampledImageUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND);
			return descriptorBindingSampledImageUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(boolean descriptorBindingStorageImageUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, descriptorBindingStorageImageUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingStorageImageUpdateAfterBind(){
			final var descriptorBindingStorageImageUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND);
			return descriptorBindingStorageImageUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(boolean descriptorBindingStorageBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, descriptorBindingStorageBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingStorageBufferUpdateAfterBind(){
			final var descriptorBindingStorageBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND);
			return descriptorBindingStorageBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(boolean descriptorBindingUniformTexelBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, descriptorBindingUniformTexelBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingUniformTexelBufferUpdateAfterBind(){
			final var descriptorBindingUniformTexelBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND);
			return descriptorBindingUniformTexelBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(boolean descriptorBindingStorageTexelBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, descriptorBindingStorageTexelBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingStorageTexelBufferUpdateAfterBind(){
			final var descriptorBindingStorageTexelBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND);
			return descriptorBindingStorageTexelBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(boolean descriptorBindingUpdateUnusedWhilePending){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, descriptorBindingUpdateUnusedWhilePending?1:0);
			return this;
		}

		default boolean descriptorBindingUpdateUnusedWhilePending(){
			final var descriptorBindingUpdateUnusedWhilePending_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING);
			return descriptorBindingUpdateUnusedWhilePending_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(boolean descriptorBindingPartiallyBound){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGPARTIALLYBOUND, descriptorBindingPartiallyBound?1:0);
			return this;
		}

		default boolean descriptorBindingPartiallyBound(){
			final var descriptorBindingPartiallyBound_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGPARTIALLYBOUND);
			return descriptorBindingPartiallyBound_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(boolean descriptorBindingVariableDescriptorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, descriptorBindingVariableDescriptorCount?1:0);
			return this;
		}

		default boolean descriptorBindingVariableDescriptorCount(){
			final var descriptorBindingVariableDescriptorCount_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT);
			return descriptorBindingVariableDescriptorCount_!=0;
		}

		default VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(boolean runtimeDescriptorArray){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.RUNTIMEDESCRIPTORARRAY, runtimeDescriptorArray?1:0);
			return this;
		}

		default boolean runtimeDescriptorArray(){
			final var runtimeDescriptorArray_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.RUNTIMEDESCRIPTORARRAY);
			return runtimeDescriptorArray_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceDescriptorIndexingFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceDescriptorIndexingFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceDescriptorIndexingFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceDescriptorIndexingFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF, (mem)->(VkPhysicalDeviceDescriptorIndexingFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreWaitFlagBits.html">VkSemaphoreWaitFlagBits</a>
	*/
	public interface VkSemaphoreWaitFlagBits{
		public static final int VK_SEMAPHORE_WAIT_ANY_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDriverId.html">VkDriverId</a>
	*/
	public interface VkDriverId{
		public static final int VK_DRIVER_ID_GOOGLE_SWIFTSHADER = 10;

		public static final int VK_DRIVER_ID_COREAVI_PROPRIETARY = 15;

		public static final int VK_DRIVER_ID_MESA_VENUS = 22;

		public static final int VK_DRIVER_ID_NVIDIA_PROPRIETARY = 4;

		public static final int VK_DRIVER_ID_AMD_PROPRIETARY = 1;

		public static final int VK_DRIVER_ID_BROADCOM_PROPRIETARY = 12;

		public static final int VK_DRIVER_ID_MESA_LLVMPIPE = 13;

		public static final int VK_DRIVER_ID_QUALCOMM_PROPRIETARY = 8;

		public static final int VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA = 6;

		public static final int VK_DRIVER_ID_MESA_V3DV = 19;

		public static final int VK_DRIVER_ID_MESA_TURNIP = 18;

		public static final int VK_DRIVER_ID_ARM_PROPRIETARY = 9;

		public static final int VK_DRIVER_ID_MESA_HONEYKRISP = 26;

		public static final int VK_DRIVER_ID_MOLTENVK = 14;

		public static final int VK_DRIVER_ID_SAMSUNG_PROPRIETARY = 21;

		public static final int VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA = 25;

		public static final int VK_DRIVER_ID_MESA_RADV = 3;

		public static final int VK_DRIVER_ID_VULKAN_SC_EMULATION_ON_VULKAN = 27;

		public static final int VK_DRIVER_ID_MESA_KOSMICKRISP = 28;

		public static final int VK_DRIVER_ID_AMD_OPEN_SOURCE = 2;

		public static final int VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS = 5;

		public static final int VK_DRIVER_ID_MESA_DOZEN = 23;

		public static final int VK_DRIVER_ID_MESA_NVK = 24;

		public static final int VK_DRIVER_ID_MESA_PANVK = 20;

		public static final int VK_DRIVER_ID_IMAGINATION_PROPRIETARY = 7;

		public static final int VK_DRIVER_ID_JUICE_PROPRIETARY = 16;

		public static final int VK_DRIVER_ID_VERISILICON_PROPRIETARY = 17;

		public static final int VK_DRIVER_ID_GGP_PROPRIETARY = 11;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentReference2.html">VkAttachmentReference2</a>
	*/
	public interface VkAttachmentReference2 extends io.github.kartoffell.klvulkan.Element<VkAttachmentReference2>{
		default VkAttachmentReference2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.STYPE);
		}

		default VkAttachmentReference2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentReference2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentReference2.PNEXT);
		}

		default VkAttachmentReference2 attachment(int attachment){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.ATTACHMENT, attachment);
			return this;
		}

		default int attachment(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.ATTACHMENT);
		}

		default VkAttachmentReference2 layout(int layout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.LAYOUT, layout);
			return this;
		}

		default int layout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.LAYOUT);
		}

		default VkAttachmentReference2 aspectMask(int aspectMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.ASPECTMASK, aspectMask);
			return this;
		}

		default int aspectMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference2.ASPECTMASK);
		}

		MemorySegment address();

		/**
		Allocates a new VkAttachmentReference2 from the given Arena.
		*/
		public static VkAttachmentReference2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkAttachmentReference2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkAttachmentReference2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkAttachmentReference2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkAttachmentReference2.SIZEOF, (mem)->(VkAttachmentReference2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassDescription2.html">VkSubpassDescription2</a>
	*/
	public interface VkSubpassDescription2 extends io.github.kartoffell.klvulkan.Element<VkSubpassDescription2>{
		default VkSubpassDescription2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.STYPE);
		}

		default VkSubpassDescription2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PNEXT);
		}

		default VkSubpassDescription2 flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.FLAGS);
		}

		default VkSubpassDescription2 pipelineBindPoint(int pipelineBindPoint){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.PIPELINEBINDPOINT, pipelineBindPoint);
			return this;
		}

		default int pipelineBindPoint(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.PIPELINEBINDPOINT);
		}

		default VkSubpassDescription2 viewMask(int viewMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.VIEWMASK, viewMask);
			return this;
		}

		default int viewMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.VIEWMASK);
		}

		default VkSubpassDescription2 inputAttachmentCount(int inputAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.INPUTATTACHMENTCOUNT, inputAttachmentCount);
			return this;
		}

		@Nullable
		default int inputAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.INPUTATTACHMENTCOUNT);
		}

		default VkSubpassDescription2 pInputAttachments(Element<VkAttachmentReference2> pInputAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PINPUTATTACHMENTS, (pInputAttachments==null?MemorySegment.NULL:pInputAttachments.address()));
			return this;
		}

		default Element<VkAttachmentReference2> pInputAttachments(){
			final var pInputAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PINPUTATTACHMENTS);
			return (pInputAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pInputAttachments_, org.lwjgl.vulkan.VkAttachmentReference2.SIZEOF, (v41765385)->(v41765385.equals(MemorySegment.NULL)?null:(VkAttachmentReference2)()->v41765385)));
		}

		default VkSubpassDescription2 colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.COLORATTACHMENTCOUNT);
		}

		default VkSubpassDescription2 pColorAttachments(Element<VkAttachmentReference2> pColorAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PCOLORATTACHMENTS, (pColorAttachments==null?MemorySegment.NULL:pColorAttachments.address()));
			return this;
		}

		default Element<VkAttachmentReference2> pColorAttachments(){
			final var pColorAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PCOLORATTACHMENTS);
			return (pColorAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pColorAttachments_, org.lwjgl.vulkan.VkAttachmentReference2.SIZEOF, (v2118255842)->(v2118255842.equals(MemorySegment.NULL)?null:(VkAttachmentReference2)()->v2118255842)));
		}

		default VkSubpassDescription2 pResolveAttachments(Element<VkAttachmentReference2> pResolveAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PRESOLVEATTACHMENTS, (pResolveAttachments==null?MemorySegment.NULL:pResolveAttachments.address()));
			return this;
		}

		@Nullable
		default Element<VkAttachmentReference2> pResolveAttachments(){
			final var pResolveAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PRESOLVEATTACHMENTS);
			return (pResolveAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pResolveAttachments_, org.lwjgl.vulkan.VkAttachmentReference2.SIZEOF, (v192694377)->(v192694377.equals(MemorySegment.NULL)?null:(VkAttachmentReference2)()->v192694377)));
		}

		default VkSubpassDescription2 pDepthStencilAttachment(Element<VkAttachmentReference2> pDepthStencilAttachment){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PDEPTHSTENCILATTACHMENT, (pDepthStencilAttachment==null?MemorySegment.NULL:pDepthStencilAttachment.address()));
			return this;
		}

		@Nullable
		default Element<VkAttachmentReference2> pDepthStencilAttachment(){
			final var pDepthStencilAttachment_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PDEPTHSTENCILATTACHMENT);
			return (pDepthStencilAttachment_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDepthStencilAttachment_, org.lwjgl.vulkan.VkAttachmentReference2.SIZEOF, (v1947020920)->(v1947020920.equals(MemorySegment.NULL)?null:(VkAttachmentReference2)()->v1947020920)));
		}

		default VkSubpassDescription2 preserveAttachmentCount(int preserveAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.PRESERVEATTACHMENTCOUNT, preserveAttachmentCount);
			return this;
		}

		@Nullable
		default int preserveAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription2.PRESERVEATTACHMENTCOUNT);
		}

		default VkSubpassDescription2 pPreserveAttachments(IntBuffer pPreserveAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PPRESERVEATTACHMENTS, (pPreserveAttachments==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPreserveAttachments)));
			return this;
		}

		default IntBuffer pPreserveAttachments(){
			final var pPreserveAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription2.PPRESERVEATTACHMENTS);
			return (pPreserveAttachments_.equals(MemorySegment.NULL)?null:pPreserveAttachments_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkSubpassDescription2 from the given Arena.
		*/
		public static VkSubpassDescription2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubpassDescription2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubpassDescription2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubpassDescription2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubpassDescription2.SIZEOF, (mem)->(VkSubpassDescription2)()->mem);
		}

	}

	public static class VkDevice extends io.github.kartoffell.klvulkan.VK11.VkDevice{
		public VkDevice(MemorySegment address, VkPhysicalDevice parent) {
			super(address, parent);
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetSemaphoreCounterValue.html">vkGetSemaphoreCounterValue</a>
		*/
		public void vkGetSemaphoreCounterValue(Element<? extends VkSemaphore> semaphore, LongBuffer pValue) {
			if(capabilities.vkGetSemaphoreCounterValue_==null) {
				capabilities.vkGetSemaphoreCounterValue_ = capabilities.lookup("vkGetSemaphoreCounterValue", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkGetSemaphoreCounterValue_.invoke(address(), (semaphore==null?MemorySegment.NULL:semaphore.address()), (pValue==null?MemorySegment.NULL:MemorySegment.ofBuffer(pValue)));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return (uint64_t)
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetBufferOpaqueCaptureAddress.html">vkGetBufferOpaqueCaptureAddress</a>
		*/
		public long vkGetBufferOpaqueCaptureAddress(Element<VkBufferDeviceAddressInfo> pInfo) {
			if(capabilities.vkGetBufferOpaqueCaptureAddress_==null) {
				capabilities.vkGetBufferOpaqueCaptureAddress_ = capabilities.lookup("vkGetBufferOpaqueCaptureAddress", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				return (long) capabilities.vkGetBufferOpaqueCaptureAddress_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkResetQueryPool.html">vkResetQueryPool</a>
		*/
		public void vkResetQueryPool(Element<? extends VkQueryPool> queryPool, int firstQuery, int queryCount) {
			if(capabilities.vkResetQueryPool_==null) {
				capabilities.vkResetQueryPool_ = capabilities.lookup("vkResetQueryPool", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkResetQueryPool_.invoke(address(), (queryPool==null?MemorySegment.NULL:queryPool.address()), firstQuery, queryCount);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return (VkDeviceAddress)
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetBufferDeviceAddress.html">vkGetBufferDeviceAddress</a>
		*/
		public long vkGetBufferDeviceAddress(Element<VkBufferDeviceAddressInfo> pInfo) {
			if(capabilities.vkGetBufferDeviceAddress_==null) {
				capabilities.vkGetBufferDeviceAddress_ = capabilities.lookup("vkGetBufferDeviceAddress", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				return (long) capabilities.vkGetBufferDeviceAddress_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return (uint64_t)
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceMemoryOpaqueCaptureAddress.html">vkGetDeviceMemoryOpaqueCaptureAddress</a>
		*/
		public long vkGetDeviceMemoryOpaqueCaptureAddress(Element<VkDeviceMemoryOpaqueCaptureAddressInfo> pInfo) {
			if(capabilities.vkGetDeviceMemoryOpaqueCaptureAddress_==null) {
				capabilities.vkGetDeviceMemoryOpaqueCaptureAddress_ = capabilities.lookup("vkGetDeviceMemoryOpaqueCaptureAddress", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				return (long) capabilities.vkGetDeviceMemoryOpaqueCaptureAddress_.invoke(address(), (pInfo==null?MemorySegment.NULL:pInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_TIMEOUT} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkWaitSemaphores.html">vkWaitSemaphores</a>
		*/
		public int vkWaitSemaphores(Element<VkSemaphoreWaitInfo> pWaitInfo, long timeout) {
			if(capabilities.vkWaitSemaphores_==null) {
				capabilities.vkWaitSemaphores_ = capabilities.lookup("vkWaitSemaphores", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
			}
			try {
				final var return_ = (int) capabilities.vkWaitSemaphores_.invoke(address(), (pWaitInfo==null?MemorySegment.NULL:pWaitInfo.address()), timeout);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkSignalSemaphore.html">vkSignalSemaphore</a>
		*/
		public void vkSignalSemaphore(Element<VkSemaphoreSignalInfo> pSignalInfo) {
			if(capabilities.vkSignalSemaphore_==null) {
				capabilities.vkSignalSemaphore_ = capabilities.lookup("vkSignalSemaphore", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkSignalSemaphore_.invoke(address(), (pSignalInfo==null?MemorySegment.NULL:pSignalInfo.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateRenderPass2.html">vkCreateRenderPass2</a>
		*/
		public void vkCreateRenderPass2(Element<VkRenderPassCreateInfo2> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkRenderPass>> pRenderPass) {
			if(capabilities.vkCreateRenderPass2_==null) {
				capabilities.vkCreateRenderPass2_ = capabilities.lookup("vkCreateRenderPass2", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateRenderPass2_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pRenderPass==null?MemorySegment.NULL:pRenderPass.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
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
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkanMemoryModelFeatures.html">VkPhysicalDeviceVulkanMemoryModelFeatures</a>
	*/
	public interface VkPhysicalDeviceVulkanMemoryModelFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkanMemoryModelFeatures>{
		default VkPhysicalDeviceVulkanMemoryModelFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.STYPE);
		}

		default VkPhysicalDeviceVulkanMemoryModelFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.PNEXT);
		}

		default VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(boolean vulkanMemoryModel){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODEL, vulkanMemoryModel?1:0);
			return this;
		}

		default boolean vulkanMemoryModel(){
			final var vulkanMemoryModel_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODEL);
			return vulkanMemoryModel_!=0;
		}

		default VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(boolean vulkanMemoryModelDeviceScope){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELDEVICESCOPE, vulkanMemoryModelDeviceScope?1:0);
			return this;
		}

		default boolean vulkanMemoryModelDeviceScope(){
			final var vulkanMemoryModelDeviceScope_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELDEVICESCOPE);
			return vulkanMemoryModelDeviceScope_!=0;
		}

		default VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(boolean vulkanMemoryModelAvailabilityVisibilityChains){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, vulkanMemoryModelAvailabilityVisibilityChains?1:0);
			return this;
		}

		default boolean vulkanMemoryModelAvailabilityVisibilityChains(){
			final var vulkanMemoryModelAvailabilityVisibilityChains_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS);
			return vulkanMemoryModelAvailabilityVisibilityChains_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkanMemoryModelFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceVulkanMemoryModelFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkanMemoryModelFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkanMemoryModelFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.SIZEOF, (mem)->(VkPhysicalDeviceVulkanMemoryModelFeatures)()->mem);
		}

	}

	public static class VkCommandBuffer extends io.github.kartoffell.klvulkan.VK11.VkCommandBuffer{
		public VkCommandBuffer(MemorySegment address, VkCommandPool parent) {
			super(address, parent);
		}

		/**
		Cmdbuffer levels: [primary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdNextSubpass2.html">vkCmdNextSubpass2</a>
		*/
		public void vkCmdNextSubpass2(Element<VkSubpassBeginInfo> pSubpassBeginInfo, Element<VkSubpassEndInfo> pSubpassEndInfo) {
			if(capabilities.vkCmdNextSubpass2_==null) {
				capabilities.vkCmdNextSubpass2_ = capabilities.lookup("vkCmdNextSubpass2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdNextSubpass2_.invoke(address(), (pSubpassBeginInfo==null?MemorySegment.NULL:pSubpassBeginInfo.address()), (pSubpassEndInfo==null?MemorySegment.NULL:pSubpassEndInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBeginRenderPass2.html">vkCmdBeginRenderPass2</a>
		*/
		public void vkCmdBeginRenderPass2(Element<VkRenderPassBeginInfo> pRenderPassBegin, Element<VkSubpassBeginInfo> pSubpassBeginInfo) {
			if(capabilities.vkCmdBeginRenderPass2_==null) {
				capabilities.vkCmdBeginRenderPass2_ = capabilities.lookup("vkCmdBeginRenderPass2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBeginRenderPass2_.invoke(address(), (pRenderPassBegin==null?MemorySegment.NULL:pRenderPassBegin.address()), (pSubpassBeginInfo==null?MemorySegment.NULL:pSubpassBeginInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDrawIndirectCount.html">vkCmdDrawIndirectCount</a>
		*/
		public void vkCmdDrawIndirectCount(Element<? extends VkBuffer> buffer, long offset, Element<? extends VkBuffer> countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
			if(capabilities.vkCmdDrawIndirectCount_==null) {
				capabilities.vkCmdDrawIndirectCount_ = capabilities.lookup("vkCmdDrawIndirectCount", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDrawIndirectCount_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), offset, (countBuffer==null?MemorySegment.NULL:countBuffer.address()), countBufferOffset, maxDrawCount, stride);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdEndRenderPass2.html">vkCmdEndRenderPass2</a>
		*/
		public void vkCmdEndRenderPass2(Element<VkSubpassEndInfo> pSubpassEndInfo) {
			if(capabilities.vkCmdEndRenderPass2_==null) {
				capabilities.vkCmdEndRenderPass2_ = capabilities.lookup("vkCmdEndRenderPass2", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdEndRenderPass2_.invoke(address(), (pSubpassEndInfo==null?MemorySegment.NULL:pSubpassEndInfo.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDrawIndexedIndirectCount.html">vkCmdDrawIndexedIndirectCount</a>
		*/
		public void vkCmdDrawIndexedIndirectCount(Element<? extends VkBuffer> buffer, long offset, Element<? extends VkBuffer> countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
			if(capabilities.vkCmdDrawIndexedIndirectCount_==null) {
				capabilities.vkCmdDrawIndexedIndirectCount_ = capabilities.lookup("vkCmdDrawIndexedIndirectCount", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDrawIndexedIndirectCount_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), offset, (countBuffer==null?MemorySegment.NULL:countBuffer.address()), countBufferOffset, maxDrawCount, stride);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkTimelineSemaphoreSubmitInfo.html">VkTimelineSemaphoreSubmitInfo</a>
	*/
	public interface VkTimelineSemaphoreSubmitInfo extends io.github.kartoffell.klvulkan.Element<VkTimelineSemaphoreSubmitInfo>{
		default VkTimelineSemaphoreSubmitInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.STYPE);
		}

		default VkTimelineSemaphoreSubmitInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PNEXT);
		}

		default VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(int waitSemaphoreValueCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT, waitSemaphoreValueCount);
			return this;
		}

		@Nullable
		default int waitSemaphoreValueCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT);
		}

		default VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(LongBuffer pWaitSemaphoreValues){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES, (pWaitSemaphoreValues==null?MemorySegment.NULL:MemorySegment.ofBuffer(pWaitSemaphoreValues)));
			return this;
		}

		@Nullable
		default LongBuffer pWaitSemaphoreValues(){
			final var pWaitSemaphoreValues_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES);
			return (pWaitSemaphoreValues_.equals(MemorySegment.NULL)?null:pWaitSemaphoreValues_.asByteBuffer().asLongBuffer());
		}

		default VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(int signalSemaphoreValueCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT, signalSemaphoreValueCount);
			return this;
		}

		@Nullable
		default int signalSemaphoreValueCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT);
		}

		default VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(LongBuffer pSignalSemaphoreValues){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES, (pSignalSemaphoreValues==null?MemorySegment.NULL:MemorySegment.ofBuffer(pSignalSemaphoreValues)));
			return this;
		}

		@Nullable
		default LongBuffer pSignalSemaphoreValues(){
			final var pSignalSemaphoreValues_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES);
			return (pSignalSemaphoreValues_.equals(MemorySegment.NULL)?null:pSignalSemaphoreValues_.asByteBuffer().asLongBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkTimelineSemaphoreSubmitInfo from the given Arena.
		*/
		public static VkTimelineSemaphoreSubmitInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkTimelineSemaphoreSubmitInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkTimelineSemaphoreSubmitInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF, (mem)->(VkTimelineSemaphoreSubmitInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceDepthStencilResolveProperties.html">VkPhysicalDeviceDepthStencilResolveProperties</a>
	*/
	public interface VkPhysicalDeviceDepthStencilResolveProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceDepthStencilResolveProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.PNEXT);
		}

		/**
		supported depth resolve modes
		*/
		default int supportedDepthResolveModes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.SUPPORTEDDEPTHRESOLVEMODES);
		}

		/**
		supported stencil resolve modes
		*/
		default int supportedStencilResolveModes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.SUPPORTEDSTENCILRESOLVEMODES);
		}

		/**
		depth and stencil resolve modes can be set independently if one of them is none
		*/
		default boolean independentResolveNone(){
			final var independentResolveNone_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.INDEPENDENTRESOLVENONE);
			return independentResolveNone_!=0;
		}

		/**
		depth and stencil resolve modes can be set independently
		*/
		default boolean independentResolve(){
			final var independentResolve_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.INDEPENDENTRESOLVE);
			return independentResolve_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceDepthStencilResolveProperties from the given Arena.
		*/
		public static VkPhysicalDeviceDepthStencilResolveProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceDepthStencilResolveProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceDepthStencilResolveProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.SIZEOF, (mem)->(VkPhysicalDeviceDepthStencilResolveProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevice8BitStorageFeatures.html">VkPhysicalDevice8BitStorageFeatures</a>
	*/
	public interface VkPhysicalDevice8BitStorageFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDevice8BitStorageFeatures>{
		default VkPhysicalDevice8BitStorageFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.STYPE);
		}

		default VkPhysicalDevice8BitStorageFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.PNEXT);
		}

		/**
		8-bit integer variables supported in StorageBuffer
		*/
		default VkPhysicalDevice8BitStorageFeatures storageBuffer8BitAccess(boolean storageBuffer8BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.STORAGEBUFFER8BITACCESS, storageBuffer8BitAccess?1:0);
			return this;
		}

		/**
		8-bit integer variables supported in StorageBuffer
		*/
		default boolean storageBuffer8BitAccess(){
			final var storageBuffer8BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.STORAGEBUFFER8BITACCESS);
			return storageBuffer8BitAccess_!=0;
		}

		/**
		8-bit integer variables supported in StorageBuffer and Uniform
		*/
		default VkPhysicalDevice8BitStorageFeatures uniformAndStorageBuffer8BitAccess(boolean uniformAndStorageBuffer8BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.UNIFORMANDSTORAGEBUFFER8BITACCESS, uniformAndStorageBuffer8BitAccess?1:0);
			return this;
		}

		/**
		8-bit integer variables supported in StorageBuffer and Uniform
		*/
		default boolean uniformAndStorageBuffer8BitAccess(){
			final var uniformAndStorageBuffer8BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.UNIFORMANDSTORAGEBUFFER8BITACCESS);
			return uniformAndStorageBuffer8BitAccess_!=0;
		}

		/**
		8-bit integer variables supported in PushConstant
		*/
		default VkPhysicalDevice8BitStorageFeatures storagePushConstant8(boolean storagePushConstant8){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.STORAGEPUSHCONSTANT8, storagePushConstant8?1:0);
			return this;
		}

		/**
		8-bit integer variables supported in PushConstant
		*/
		default boolean storagePushConstant8(){
			final var storagePushConstant8_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.STORAGEPUSHCONSTANT8);
			return storagePushConstant8_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDevice8BitStorageFeatures from the given Arena.
		*/
		public static VkPhysicalDevice8BitStorageFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDevice8BitStorageFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDevice8BitStorageFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures.SIZEOF, (mem)->(VkPhysicalDevice8BitStorageFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceHostQueryResetFeatures.html">VkPhysicalDeviceHostQueryResetFeatures</a>
	*/
	public interface VkPhysicalDeviceHostQueryResetFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceHostQueryResetFeatures>{
		default VkPhysicalDeviceHostQueryResetFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.STYPE);
		}

		default VkPhysicalDeviceHostQueryResetFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.PNEXT);
		}

		default VkPhysicalDeviceHostQueryResetFeatures hostQueryReset(boolean hostQueryReset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.HOSTQUERYRESET, hostQueryReset?1:0);
			return this;
		}

		default boolean hostQueryReset(){
			final var hostQueryReset_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.HOSTQUERYRESET);
			return hostQueryReset_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceHostQueryResetFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceHostQueryResetFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceHostQueryResetFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceHostQueryResetFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.SIZEOF, (mem)->(VkPhysicalDeviceHostQueryResetFeatures)()->mem);
		}

	}

	public interface API_Constants extends io.github.kartoffell.klvulkan.VK11.API_Constants{
		public static final int VK_MAX_DRIVER_NAME_SIZE = 256;

		public static final int VK_MAX_DRIVER_INFO_SIZE = 256;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerReductionMode.html">VkSamplerReductionMode</a>
	*/
	public interface VkSamplerReductionMode{
		public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE = 0;

		public static final int VK_SAMPLER_REDUCTION_MODE_MIN = 1;

		public static final int VK_SAMPLER_REDUCTION_MODE_MAX = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferDeviceAddressInfo.html">VkBufferDeviceAddressInfo</a>
	*/
	public interface VkBufferDeviceAddressInfo extends io.github.kartoffell.klvulkan.Element<VkBufferDeviceAddressInfo>{
		default VkBufferDeviceAddressInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferDeviceAddressInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferDeviceAddressInfo.STYPE);
		}

		default VkBufferDeviceAddressInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferDeviceAddressInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferDeviceAddressInfo.PNEXT);
		}

		default VkBufferDeviceAddressInfo buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferDeviceAddressInfo.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferDeviceAddressInfo.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferDeviceAddressInfo from the given Arena.
		*/
		public static VkBufferDeviceAddressInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferDeviceAddressInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferDeviceAddressInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferDeviceAddressInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferDeviceAddressInfo.SIZEOF, (mem)->(VkBufferDeviceAddressInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan12Features.html">VkPhysicalDeviceVulkan12Features</a>
	*/
	public interface VkPhysicalDeviceVulkan12Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan12Features>{
		default VkPhysicalDeviceVulkan12Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STYPE);
		}

		default VkPhysicalDeviceVulkan12Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.PNEXT);
		}

		default VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(boolean samplerMirrorClampToEdge){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE, samplerMirrorClampToEdge?1:0);
			return this;
		}

		default boolean samplerMirrorClampToEdge(){
			final var samplerMirrorClampToEdge_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE);
			return samplerMirrorClampToEdge_!=0;
		}

		default VkPhysicalDeviceVulkan12Features drawIndirectCount(boolean drawIndirectCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT, drawIndirectCount?1:0);
			return this;
		}

		default boolean drawIndirectCount(){
			final var drawIndirectCount_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT);
			return drawIndirectCount_!=0;
		}

		/**
		8-bit integer variables supported in StorageBuffer
		*/
		default VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(boolean storageBuffer8BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS, storageBuffer8BitAccess?1:0);
			return this;
		}

		/**
		8-bit integer variables supported in StorageBuffer
		*/
		default boolean storageBuffer8BitAccess(){
			final var storageBuffer8BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS);
			return storageBuffer8BitAccess_!=0;
		}

		/**
		8-bit integer variables supported in StorageBuffer and Uniform
		*/
		default VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(boolean uniformAndStorageBuffer8BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS, uniformAndStorageBuffer8BitAccess?1:0);
			return this;
		}

		/**
		8-bit integer variables supported in StorageBuffer and Uniform
		*/
		default boolean uniformAndStorageBuffer8BitAccess(){
			final var uniformAndStorageBuffer8BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS);
			return uniformAndStorageBuffer8BitAccess_!=0;
		}

		/**
		8-bit integer variables supported in PushConstant
		*/
		default VkPhysicalDeviceVulkan12Features storagePushConstant8(boolean storagePushConstant8){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8, storagePushConstant8?1:0);
			return this;
		}

		/**
		8-bit integer variables supported in PushConstant
		*/
		default boolean storagePushConstant8(){
			final var storagePushConstant8_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8);
			return storagePushConstant8_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(boolean shaderBufferInt64Atomics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS, shaderBufferInt64Atomics?1:0);
			return this;
		}

		default boolean shaderBufferInt64Atomics(){
			final var shaderBufferInt64Atomics_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS);
			return shaderBufferInt64Atomics_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(boolean shaderSharedInt64Atomics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS, shaderSharedInt64Atomics?1:0);
			return this;
		}

		default boolean shaderSharedInt64Atomics(){
			final var shaderSharedInt64Atomics_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS);
			return shaderSharedInt64Atomics_!=0;
		}

		/**
		16-bit floats (halfs) in shaders
		*/
		default VkPhysicalDeviceVulkan12Features shaderFloat16(boolean shaderFloat16){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERFLOAT16, shaderFloat16?1:0);
			return this;
		}

		/**
		16-bit floats (halfs) in shaders
		*/
		default boolean shaderFloat16(){
			final var shaderFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERFLOAT16);
			return shaderFloat16_!=0;
		}

		/**
		8-bit integers in shaders
		*/
		default VkPhysicalDeviceVulkan12Features shaderInt8(boolean shaderInt8){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINT8, shaderInt8?1:0);
			return this;
		}

		/**
		8-bit integers in shaders
		*/
		default boolean shaderInt8(){
			final var shaderInt8_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINT8);
			return shaderInt8_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorIndexing(boolean descriptorIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING, descriptorIndexing?1:0);
			return this;
		}

		default boolean descriptorIndexing(){
			final var descriptorIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING);
			return descriptorIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(boolean shaderInputAttachmentArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, shaderInputAttachmentArrayDynamicIndexing?1:0);
			return this;
		}

		default boolean shaderInputAttachmentArrayDynamicIndexing(){
			final var shaderInputAttachmentArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING);
			return shaderInputAttachmentArrayDynamicIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(boolean shaderUniformTexelBufferArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, shaderUniformTexelBufferArrayDynamicIndexing?1:0);
			return this;
		}

		default boolean shaderUniformTexelBufferArrayDynamicIndexing(){
			final var shaderUniformTexelBufferArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING);
			return shaderUniformTexelBufferArrayDynamicIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(boolean shaderStorageTexelBufferArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, shaderStorageTexelBufferArrayDynamicIndexing?1:0);
			return this;
		}

		default boolean shaderStorageTexelBufferArrayDynamicIndexing(){
			final var shaderStorageTexelBufferArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING);
			return shaderStorageTexelBufferArrayDynamicIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(boolean shaderUniformBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, shaderUniformBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderUniformBufferArrayNonUniformIndexing(){
			final var shaderUniformBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING);
			return shaderUniformBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(boolean shaderSampledImageArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, shaderSampledImageArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderSampledImageArrayNonUniformIndexing(){
			final var shaderSampledImageArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING);
			return shaderSampledImageArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(boolean shaderStorageBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, shaderStorageBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderStorageBufferArrayNonUniformIndexing(){
			final var shaderStorageBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING);
			return shaderStorageBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(boolean shaderStorageImageArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, shaderStorageImageArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderStorageImageArrayNonUniformIndexing(){
			final var shaderStorageImageArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING);
			return shaderStorageImageArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(boolean shaderInputAttachmentArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, shaderInputAttachmentArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderInputAttachmentArrayNonUniformIndexing(){
			final var shaderInputAttachmentArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING);
			return shaderInputAttachmentArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(boolean shaderUniformTexelBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, shaderUniformTexelBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderUniformTexelBufferArrayNonUniformIndexing(){
			final var shaderUniformTexelBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING);
			return shaderUniformTexelBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(boolean shaderStorageTexelBufferArrayNonUniformIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, shaderStorageTexelBufferArrayNonUniformIndexing?1:0);
			return this;
		}

		default boolean shaderStorageTexelBufferArrayNonUniformIndexing(){
			final var shaderStorageTexelBufferArrayNonUniformIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING);
			return shaderStorageTexelBufferArrayNonUniformIndexing_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(boolean descriptorBindingUniformBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, descriptorBindingUniformBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingUniformBufferUpdateAfterBind(){
			final var descriptorBindingUniformBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND);
			return descriptorBindingUniformBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(boolean descriptorBindingSampledImageUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, descriptorBindingSampledImageUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingSampledImageUpdateAfterBind(){
			final var descriptorBindingSampledImageUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND);
			return descriptorBindingSampledImageUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(boolean descriptorBindingStorageImageUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, descriptorBindingStorageImageUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingStorageImageUpdateAfterBind(){
			final var descriptorBindingStorageImageUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND);
			return descriptorBindingStorageImageUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(boolean descriptorBindingStorageBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, descriptorBindingStorageBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingStorageBufferUpdateAfterBind(){
			final var descriptorBindingStorageBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND);
			return descriptorBindingStorageBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(boolean descriptorBindingUniformTexelBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, descriptorBindingUniformTexelBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingUniformTexelBufferUpdateAfterBind(){
			final var descriptorBindingUniformTexelBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND);
			return descriptorBindingUniformTexelBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(boolean descriptorBindingStorageTexelBufferUpdateAfterBind){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, descriptorBindingStorageTexelBufferUpdateAfterBind?1:0);
			return this;
		}

		default boolean descriptorBindingStorageTexelBufferUpdateAfterBind(){
			final var descriptorBindingStorageTexelBufferUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND);
			return descriptorBindingStorageTexelBufferUpdateAfterBind_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(boolean descriptorBindingUpdateUnusedWhilePending){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, descriptorBindingUpdateUnusedWhilePending?1:0);
			return this;
		}

		default boolean descriptorBindingUpdateUnusedWhilePending(){
			final var descriptorBindingUpdateUnusedWhilePending_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING);
			return descriptorBindingUpdateUnusedWhilePending_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(boolean descriptorBindingPartiallyBound){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND, descriptorBindingPartiallyBound?1:0);
			return this;
		}

		default boolean descriptorBindingPartiallyBound(){
			final var descriptorBindingPartiallyBound_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND);
			return descriptorBindingPartiallyBound_!=0;
		}

		default VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(boolean descriptorBindingVariableDescriptorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, descriptorBindingVariableDescriptorCount?1:0);
			return this;
		}

		default boolean descriptorBindingVariableDescriptorCount(){
			final var descriptorBindingVariableDescriptorCount_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT);
			return descriptorBindingVariableDescriptorCount_!=0;
		}

		default VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(boolean runtimeDescriptorArray){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY, runtimeDescriptorArray?1:0);
			return this;
		}

		default boolean runtimeDescriptorArray(){
			final var runtimeDescriptorArray_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY);
			return runtimeDescriptorArray_!=0;
		}

		default VkPhysicalDeviceVulkan12Features samplerFilterMinmax(boolean samplerFilterMinmax){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX, samplerFilterMinmax?1:0);
			return this;
		}

		default boolean samplerFilterMinmax(){
			final var samplerFilterMinmax_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX);
			return samplerFilterMinmax_!=0;
		}

		default VkPhysicalDeviceVulkan12Features scalarBlockLayout(boolean scalarBlockLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT, scalarBlockLayout?1:0);
			return this;
		}

		default boolean scalarBlockLayout(){
			final var scalarBlockLayout_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT);
			return scalarBlockLayout_!=0;
		}

		default VkPhysicalDeviceVulkan12Features imagelessFramebuffer(boolean imagelessFramebuffer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER, imagelessFramebuffer?1:0);
			return this;
		}

		default boolean imagelessFramebuffer(){
			final var imagelessFramebuffer_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER);
			return imagelessFramebuffer_!=0;
		}

		default VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(boolean uniformBufferStandardLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT, uniformBufferStandardLayout?1:0);
			return this;
		}

		default boolean uniformBufferStandardLayout(){
			final var uniformBufferStandardLayout_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT);
			return uniformBufferStandardLayout_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(boolean shaderSubgroupExtendedTypes){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES, shaderSubgroupExtendedTypes?1:0);
			return this;
		}

		default boolean shaderSubgroupExtendedTypes(){
			final var shaderSubgroupExtendedTypes_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES);
			return shaderSubgroupExtendedTypes_!=0;
		}

		default VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(boolean separateDepthStencilLayouts){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS, separateDepthStencilLayouts?1:0);
			return this;
		}

		default boolean separateDepthStencilLayouts(){
			final var separateDepthStencilLayouts_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS);
			return separateDepthStencilLayouts_!=0;
		}

		default VkPhysicalDeviceVulkan12Features hostQueryReset(boolean hostQueryReset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET, hostQueryReset?1:0);
			return this;
		}

		default boolean hostQueryReset(){
			final var hostQueryReset_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET);
			return hostQueryReset_!=0;
		}

		default VkPhysicalDeviceVulkan12Features timelineSemaphore(boolean timelineSemaphore){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE, timelineSemaphore?1:0);
			return this;
		}

		default boolean timelineSemaphore(){
			final var timelineSemaphore_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE);
			return timelineSemaphore_!=0;
		}

		default VkPhysicalDeviceVulkan12Features bufferDeviceAddress(boolean bufferDeviceAddress){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS, bufferDeviceAddress?1:0);
			return this;
		}

		default boolean bufferDeviceAddress(){
			final var bufferDeviceAddress_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS);
			return bufferDeviceAddress_!=0;
		}

		default VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(boolean bufferDeviceAddressCaptureReplay){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY, bufferDeviceAddressCaptureReplay?1:0);
			return this;
		}

		default boolean bufferDeviceAddressCaptureReplay(){
			final var bufferDeviceAddressCaptureReplay_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY);
			return bufferDeviceAddressCaptureReplay_!=0;
		}

		default VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(boolean bufferDeviceAddressMultiDevice){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE, bufferDeviceAddressMultiDevice?1:0);
			return this;
		}

		default boolean bufferDeviceAddressMultiDevice(){
			final var bufferDeviceAddressMultiDevice_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE);
			return bufferDeviceAddressMultiDevice_!=0;
		}

		default VkPhysicalDeviceVulkan12Features vulkanMemoryModel(boolean vulkanMemoryModel){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL, vulkanMemoryModel?1:0);
			return this;
		}

		default boolean vulkanMemoryModel(){
			final var vulkanMemoryModel_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL);
			return vulkanMemoryModel_!=0;
		}

		default VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(boolean vulkanMemoryModelDeviceScope){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE, vulkanMemoryModelDeviceScope?1:0);
			return this;
		}

		default boolean vulkanMemoryModelDeviceScope(){
			final var vulkanMemoryModelDeviceScope_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE);
			return vulkanMemoryModelDeviceScope_!=0;
		}

		default VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(boolean vulkanMemoryModelAvailabilityVisibilityChains){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, vulkanMemoryModelAvailabilityVisibilityChains?1:0);
			return this;
		}

		default boolean vulkanMemoryModelAvailabilityVisibilityChains(){
			final var vulkanMemoryModelAvailabilityVisibilityChains_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS);
			return vulkanMemoryModelAvailabilityVisibilityChains_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(boolean shaderOutputViewportIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX, shaderOutputViewportIndex?1:0);
			return this;
		}

		default boolean shaderOutputViewportIndex(){
			final var shaderOutputViewportIndex_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX);
			return shaderOutputViewportIndex_!=0;
		}

		default VkPhysicalDeviceVulkan12Features shaderOutputLayer(boolean shaderOutputLayer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER, shaderOutputLayer?1:0);
			return this;
		}

		default boolean shaderOutputLayer(){
			final var shaderOutputLayer_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER);
			return shaderOutputLayer_!=0;
		}

		default VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(boolean subgroupBroadcastDynamicId){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID, subgroupBroadcastDynamicId?1:0);
			return this;
		}

		default boolean subgroupBroadcastDynamicId(){
			final var subgroupBroadcastDynamicId_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID);
			return subgroupBroadcastDynamicId_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan12Features from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan12Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan12Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan12Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF, (mem)->(VkPhysicalDeviceVulkan12Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderFloat16Int8Features.html">VkPhysicalDeviceShaderFloat16Int8Features</a>
	*/
	public interface VkPhysicalDeviceShaderFloat16Int8Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderFloat16Int8Features>{
		default VkPhysicalDeviceShaderFloat16Int8Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.STYPE);
		}

		default VkPhysicalDeviceShaderFloat16Int8Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.PNEXT);
		}

		/**
		16-bit floats (halfs) in shaders
		*/
		default VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16(boolean shaderFloat16){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.SHADERFLOAT16, shaderFloat16?1:0);
			return this;
		}

		/**
		16-bit floats (halfs) in shaders
		*/
		default boolean shaderFloat16(){
			final var shaderFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.SHADERFLOAT16);
			return shaderFloat16_!=0;
		}

		/**
		8-bit integers in shaders
		*/
		default VkPhysicalDeviceShaderFloat16Int8Features shaderInt8(boolean shaderInt8){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.SHADERINT8, shaderInt8?1:0);
			return this;
		}

		/**
		8-bit integers in shaders
		*/
		default boolean shaderInt8(){
			final var shaderInt8_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.SHADERINT8);
			return shaderInt8_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderFloat16Int8Features from the given Arena.
		*/
		public static VkPhysicalDeviceShaderFloat16Int8Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderFloat16Int8Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderFloat16Int8Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.SIZEOF, (mem)->(VkPhysicalDeviceShaderFloat16Int8Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceImagelessFramebufferFeatures.html">VkPhysicalDeviceImagelessFramebufferFeatures</a>
	*/
	public interface VkPhysicalDeviceImagelessFramebufferFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceImagelessFramebufferFeatures>{
		default VkPhysicalDeviceImagelessFramebufferFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.STYPE);
		}

		default VkPhysicalDeviceImagelessFramebufferFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.PNEXT);
		}

		default VkPhysicalDeviceImagelessFramebufferFeatures imagelessFramebuffer(boolean imagelessFramebuffer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.IMAGELESSFRAMEBUFFER, imagelessFramebuffer?1:0);
			return this;
		}

		default boolean imagelessFramebuffer(){
			final var imagelessFramebuffer_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.IMAGELESSFRAMEBUFFER);
			return imagelessFramebuffer_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceImagelessFramebufferFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceImagelessFramebufferFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceImagelessFramebufferFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceImagelessFramebufferFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.SIZEOF, (mem)->(VkPhysicalDeviceImagelessFramebufferFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderAtomicInt64Features.html">VkPhysicalDeviceShaderAtomicInt64Features</a>
	*/
	public interface VkPhysicalDeviceShaderAtomicInt64Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderAtomicInt64Features>{
		default VkPhysicalDeviceShaderAtomicInt64Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.STYPE);
		}

		default VkPhysicalDeviceShaderAtomicInt64Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.PNEXT);
		}

		default VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64Atomics(boolean shaderBufferInt64Atomics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.SHADERBUFFERINT64ATOMICS, shaderBufferInt64Atomics?1:0);
			return this;
		}

		default boolean shaderBufferInt64Atomics(){
			final var shaderBufferInt64Atomics_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.SHADERBUFFERINT64ATOMICS);
			return shaderBufferInt64Atomics_!=0;
		}

		default VkPhysicalDeviceShaderAtomicInt64Features shaderSharedInt64Atomics(boolean shaderSharedInt64Atomics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.SHADERSHAREDINT64ATOMICS, shaderSharedInt64Atomics?1:0);
			return this;
		}

		default boolean shaderSharedInt64Atomics(){
			final var shaderSharedInt64Atomics_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.SHADERSHAREDINT64ATOMICS);
			return shaderSharedInt64Atomics_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderAtomicInt64Features from the given Arena.
		*/
		public static VkPhysicalDeviceShaderAtomicInt64Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderAtomicInt64Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderAtomicInt64Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.SIZEOF, (mem)->(VkPhysicalDeviceShaderAtomicInt64Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFramebufferAttachmentImageInfo.html">VkFramebufferAttachmentImageInfo</a>
	*/
	public interface VkFramebufferAttachmentImageInfo extends io.github.kartoffell.klvulkan.Element<VkFramebufferAttachmentImageInfo>{
		default VkFramebufferAttachmentImageInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.STYPE);
		}

		default VkFramebufferAttachmentImageInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PNEXT);
		}

		/**
		Image creation flags
		*/
		default VkFramebufferAttachmentImageInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.FLAGS, flags);
			return this;
		}

		/**
		Image creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.FLAGS);
		}

		/**
		Image usage flags
		*/
		default VkFramebufferAttachmentImageInfo usage(int usage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.USAGE, usage);
			return this;
		}

		/**
		Image usage flags
		*/
		default int usage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.USAGE);
		}

		default VkFramebufferAttachmentImageInfo width(int width){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.WIDTH, width);
			return this;
		}

		default int width(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.WIDTH);
		}

		default VkFramebufferAttachmentImageInfo height(int height){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.HEIGHT, height);
			return this;
		}

		default int height(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.HEIGHT);
		}

		default VkFramebufferAttachmentImageInfo layerCount(int layerCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.LAYERCOUNT, layerCount);
			return this;
		}

		default int layerCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.LAYERCOUNT);
		}

		default VkFramebufferAttachmentImageInfo viewFormatCount(int viewFormatCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT, viewFormatCount);
			return this;
		}

		@Nullable
		default int viewFormatCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT);
		}

		default VkFramebufferAttachmentImageInfo pViewFormats(IntBuffer pViewFormats){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PVIEWFORMATS, (pViewFormats==null?MemorySegment.NULL:MemorySegment.ofBuffer(pViewFormats)));
			return this;
		}

		default IntBuffer pViewFormats(){
			final var pViewFormats_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PVIEWFORMATS);
			return (pViewFormats_.equals(MemorySegment.NULL)?null:pViewFormats_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkFramebufferAttachmentImageInfo from the given Arena.
		*/
		public static VkFramebufferAttachmentImageInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkFramebufferAttachmentImageInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkFramebufferAttachmentImageInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF, (mem)->(VkFramebufferAttachmentImageInfo)()->mem);
		}

	}

	public interface VkMemoryAllocateFlagBits extends io.github.kartoffell.klvulkan.VK11.VkMemoryAllocateFlagBits{
		public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT = 2;

		public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceBufferDeviceAddressFeatures.html">VkPhysicalDeviceBufferDeviceAddressFeatures</a>
	*/
	public interface VkPhysicalDeviceBufferDeviceAddressFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceBufferDeviceAddressFeatures>{
		default VkPhysicalDeviceBufferDeviceAddressFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.STYPE);
		}

		default VkPhysicalDeviceBufferDeviceAddressFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.PNEXT);
		}

		default VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddress(boolean bufferDeviceAddress){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESS, bufferDeviceAddress?1:0);
			return this;
		}

		default boolean bufferDeviceAddress(){
			final var bufferDeviceAddress_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESS);
			return bufferDeviceAddress_!=0;
		}

		default VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplay(boolean bufferDeviceAddressCaptureReplay){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSCAPTUREREPLAY, bufferDeviceAddressCaptureReplay?1:0);
			return this;
		}

		default boolean bufferDeviceAddressCaptureReplay(){
			final var bufferDeviceAddressCaptureReplay_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSCAPTUREREPLAY);
			return bufferDeviceAddressCaptureReplay_!=0;
		}

		default VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressMultiDevice(boolean bufferDeviceAddressMultiDevice){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSMULTIDEVICE, bufferDeviceAddressMultiDevice?1:0);
			return this;
		}

		default boolean bufferDeviceAddressMultiDevice(){
			final var bufferDeviceAddressMultiDevice_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSMULTIDEVICE);
			return bufferDeviceAddressMultiDevice_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceBufferDeviceAddressFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceBufferDeviceAddressFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceBufferDeviceAddressFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceBufferDeviceAddressFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.SIZEOF, (mem)->(VkPhysicalDeviceBufferDeviceAddressFeatures)()->mem);
		}

	}

	public interface VkDescriptorPoolCreateFlagBits extends io.github.kartoffell.klvulkan.VK10.VkDescriptorPoolCreateFlagBits{
		public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSamplerFilterMinmaxProperties.html">VkPhysicalDeviceSamplerFilterMinmaxProperties</a>
	*/
	public interface VkPhysicalDeviceSamplerFilterMinmaxProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceSamplerFilterMinmaxProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties.PNEXT);
		}

		default boolean filterMinmaxSingleComponentFormats(){
			final var filterMinmaxSingleComponentFormats_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties.FILTERMINMAXSINGLECOMPONENTFORMATS);
			return filterMinmaxSingleComponentFormats_!=0;
		}

		default boolean filterMinmaxImageComponentMapping(){
			final var filterMinmaxImageComponentMapping_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties.FILTERMINMAXIMAGECOMPONENTMAPPING);
			return filterMinmaxImageComponentMapping_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceSamplerFilterMinmaxProperties from the given Arena.
		*/
		public static VkPhysicalDeviceSamplerFilterMinmaxProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceSamplerFilterMinmaxProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceSamplerFilterMinmaxProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties.SIZEOF, (mem)->(VkPhysicalDeviceSamplerFilterMinmaxProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan12Properties.html">VkPhysicalDeviceVulkan12Properties</a>
	*/
	public interface VkPhysicalDeviceVulkan12Properties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan12Properties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.PNEXT);
		}

		default int driverID(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERID);
		}

		default CString driverName(){
			final var driverName_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERNAME, API_Constants.VK_MAX_DRIVER_NAME_SIZE);
			return driverName_.equals(MemorySegment.NULL)?null:CString.wrap(driverName_);
		}

		default CString driverInfo(){
			final var driverInfo_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERINFO, API_Constants.VK_MAX_DRIVER_INFO_SIZE);
			return driverInfo_.equals(MemorySegment.NULL)?null:CString.wrap(driverInfo_);
		}

		default VkConformanceVersion conformanceVersion(){
			final var conformanceVersion_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.CONFORMANCEVERSION, org.lwjgl.vulkan.VkConformanceVersion.SIZEOF);
			return (conformanceVersion_.equals(MemorySegment.NULL)?null:(VkConformanceVersion)()->conformanceVersion_);
		}

		default int denormBehaviorIndependence(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DENORMBEHAVIORINDEPENDENCE);
		}

		default int roundingModeIndependence(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ROUNDINGMODEINDEPENDENCE);
		}

		/**
		An implementation can preserve signed zero, nan, inf
		*/
		default boolean shaderSignedZeroInfNanPreserveFloat16(){
			final var shaderSignedZeroInfNanPreserveFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16);
			return shaderSignedZeroInfNanPreserveFloat16_!=0;
		}

		/**
		An implementation can preserve signed zero, nan, inf
		*/
		default boolean shaderSignedZeroInfNanPreserveFloat32(){
			final var shaderSignedZeroInfNanPreserveFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32);
			return shaderSignedZeroInfNanPreserveFloat32_!=0;
		}

		/**
		An implementation can preserve signed zero, nan, inf
		*/
		default boolean shaderSignedZeroInfNanPreserveFloat64(){
			final var shaderSignedZeroInfNanPreserveFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64);
			return shaderSignedZeroInfNanPreserveFloat64_!=0;
		}

		/**
		An implementation can preserve  denormals
		*/
		default boolean shaderDenormPreserveFloat16(){
			final var shaderDenormPreserveFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT16);
			return shaderDenormPreserveFloat16_!=0;
		}

		/**
		An implementation can preserve  denormals
		*/
		default boolean shaderDenormPreserveFloat32(){
			final var shaderDenormPreserveFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT32);
			return shaderDenormPreserveFloat32_!=0;
		}

		/**
		An implementation can preserve  denormals
		*/
		default boolean shaderDenormPreserveFloat64(){
			final var shaderDenormPreserveFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT64);
			return shaderDenormPreserveFloat64_!=0;
		}

		/**
		An implementation can flush to zero  denormals
		*/
		default boolean shaderDenormFlushToZeroFloat16(){
			final var shaderDenormFlushToZeroFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT16);
			return shaderDenormFlushToZeroFloat16_!=0;
		}

		/**
		An implementation can flush to zero  denormals
		*/
		default boolean shaderDenormFlushToZeroFloat32(){
			final var shaderDenormFlushToZeroFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT32);
			return shaderDenormFlushToZeroFloat32_!=0;
		}

		/**
		An implementation can flush to zero  denormals
		*/
		default boolean shaderDenormFlushToZeroFloat64(){
			final var shaderDenormFlushToZeroFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT64);
			return shaderDenormFlushToZeroFloat64_!=0;
		}

		/**
		An implementation can support RTE
		*/
		default boolean shaderRoundingModeRTEFloat16(){
			final var shaderRoundingModeRTEFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT16);
			return shaderRoundingModeRTEFloat16_!=0;
		}

		/**
		An implementation can support RTE
		*/
		default boolean shaderRoundingModeRTEFloat32(){
			final var shaderRoundingModeRTEFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT32);
			return shaderRoundingModeRTEFloat32_!=0;
		}

		/**
		An implementation can support RTE
		*/
		default boolean shaderRoundingModeRTEFloat64(){
			final var shaderRoundingModeRTEFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT64);
			return shaderRoundingModeRTEFloat64_!=0;
		}

		/**
		An implementation can support RTZ
		*/
		default boolean shaderRoundingModeRTZFloat16(){
			final var shaderRoundingModeRTZFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT16);
			return shaderRoundingModeRTZFloat16_!=0;
		}

		/**
		An implementation can support RTZ
		*/
		default boolean shaderRoundingModeRTZFloat32(){
			final var shaderRoundingModeRTZFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT32);
			return shaderRoundingModeRTZFloat32_!=0;
		}

		/**
		An implementation can support RTZ
		*/
		default boolean shaderRoundingModeRTZFloat64(){
			final var shaderRoundingModeRTZFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT64);
			return shaderRoundingModeRTZFloat64_!=0;
		}

		default int maxUpdateAfterBindDescriptorsInAllPools(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS);
		}

		default boolean shaderUniformBufferArrayNonUniformIndexingNative(){
			final var shaderUniformBufferArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderUniformBufferArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderSampledImageArrayNonUniformIndexingNative(){
			final var shaderSampledImageArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderSampledImageArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderStorageBufferArrayNonUniformIndexingNative(){
			final var shaderStorageBufferArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderStorageBufferArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderStorageImageArrayNonUniformIndexingNative(){
			final var shaderStorageImageArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderStorageImageArrayNonUniformIndexingNative_!=0;
		}

		default boolean shaderInputAttachmentArrayNonUniformIndexingNative(){
			final var shaderInputAttachmentArrayNonUniformIndexingNative_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE);
			return shaderInputAttachmentArrayNonUniformIndexingNative_!=0;
		}

		default boolean robustBufferAccessUpdateAfterBind(){
			final var robustBufferAccessUpdateAfterBind_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ROBUSTBUFFERACCESSUPDATEAFTERBIND);
			return robustBufferAccessUpdateAfterBind_!=0;
		}

		default boolean quadDivergentImplicitLod(){
			final var quadDivergentImplicitLod_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.QUADDIVERGENTIMPLICITLOD);
			return quadDivergentImplicitLod_!=0;
		}

		default int maxPerStageDescriptorUpdateAfterBindSamplers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS);
		}

		default int maxPerStageDescriptorUpdateAfterBindUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS);
		}

		default int maxPerStageDescriptorUpdateAfterBindStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS);
		}

		default int maxPerStageDescriptorUpdateAfterBindSampledImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES);
		}

		default int maxPerStageDescriptorUpdateAfterBindStorageImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES);
		}

		default int maxPerStageDescriptorUpdateAfterBindInputAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS);
		}

		default int maxPerStageUpdateAfterBindResources(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES);
		}

		default int maxDescriptorSetUpdateAfterBindSamplers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS);
		}

		default int maxDescriptorSetUpdateAfterBindUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS);
		}

		default int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC);
		}

		default int maxDescriptorSetUpdateAfterBindStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS);
		}

		default int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC);
		}

		default int maxDescriptorSetUpdateAfterBindSampledImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES);
		}

		default int maxDescriptorSetUpdateAfterBindStorageImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES);
		}

		default int maxDescriptorSetUpdateAfterBindInputAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS);
		}

		/**
		supported depth resolve modes
		*/
		default int supportedDepthResolveModes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SUPPORTEDDEPTHRESOLVEMODES);
		}

		/**
		supported stencil resolve modes
		*/
		default int supportedStencilResolveModes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SUPPORTEDSTENCILRESOLVEMODES);
		}

		/**
		depth and stencil resolve modes can be set independently if one of them is none
		*/
		default boolean independentResolveNone(){
			final var independentResolveNone_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVENONE);
			return independentResolveNone_!=0;
		}

		/**
		depth and stencil resolve modes can be set independently
		*/
		default boolean independentResolve(){
			final var independentResolve_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVE);
			return independentResolve_!=0;
		}

		default boolean filterMinmaxSingleComponentFormats(){
			final var filterMinmaxSingleComponentFormats_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FILTERMINMAXSINGLECOMPONENTFORMATS);
			return filterMinmaxSingleComponentFormats_!=0;
		}

		default boolean filterMinmaxImageComponentMapping(){
			final var filterMinmaxImageComponentMapping_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FILTERMINMAXIMAGECOMPONENTMAPPING);
			return filterMinmaxImageComponentMapping_!=0;
		}

		default long maxTimelineSemaphoreValueDifference(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXTIMELINESEMAPHOREVALUEDIFFERENCE);
		}

		@Nullable
		default int framebufferIntegerColorSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan12Properties from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan12Properties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan12Properties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan12Properties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF, (mem)->(VkPhysicalDeviceVulkan12Properties)()->mem);
		}

	}

	public interface VkStructureType extends io.github.kartoffell.klvulkan.VK11.VkStructureType{
		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES = 1000257000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES = 1000211000;

		public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO = 1000244001;

		public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO = 1000109006;

		public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO = 1000147000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES = 1000177000;

		public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO = 1000108001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES = 1000082000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES = 1000199000;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO = 1000161000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES = 52;

		public static final int VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO = 1000130001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES = 49;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES = 1000161002;

		public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 = 1000109001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES = 1000180000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES = 1000221000;

		public static final int VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO = 1000246000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES = 51;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT = 1000161004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES = 1000253000;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO = 1000161003;

		public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO = 1000207005;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES = 1000241000;

		public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT = 1000241002;

		public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO = 1000207004;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES = 1000161001;

		public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO = 1000257004;

		public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO = 1000207003;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES = 1000261000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES = 1000175000;

		public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 = 1000109004;

		public static final int VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO = 1000257003;

		public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE = 1000199001;

		public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT = 1000241001;

		public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO = 1000108002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES = 1000207000;

		public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO = 1000207002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES = 50;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES = 1000196000;

		public static final int VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO = 1000257002;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES = 1000197000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES = 1000207001;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES = 1000130000;

		public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 = 1000109000;

		public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES = 1000108000;

		public static final int VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO = 1000108003;

		public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 = 1000109002;

		public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO = 1000109005;

		public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 = 1000109003;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.html">VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures</a>
	*/
	public interface VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures>{
		default VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.STYPE);
		}

		default VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.PNEXT);
		}

		default VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures separateDepthStencilLayouts(boolean separateDepthStencilLayouts){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.SEPARATEDEPTHSTENCILLAYOUTS, separateDepthStencilLayouts?1:0);
			return this;
		}

		default boolean separateDepthStencilLayouts(){
			final var separateDepthStencilLayouts_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.SEPARATEDEPTHSTENCILLAYOUTS);
			return separateDepthStencilLayouts_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.SIZEOF, (mem)->(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures)()->mem);
		}

	}

	public static class VkInstance extends io.github.kartoffell.klvulkan.VK11.VkInstance{
		public VkInstance(MemorySegment address, VK12 parent) {
			super(address, parent);
		}

		protected VkInstance VkInstance(MemorySegment mem, Object parent) {
			return new VkInstance(mem, (VK12) parent); //Omega
		}

	}

	public interface VkDescriptorSetLayoutCreateFlagBits extends io.github.kartoffell.klvulkan.VK10.VkDescriptorSetLayoutCreateFlagBits{
		public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT = 2;

	}

	public interface VkFormatFeatureFlagBits extends io.github.kartoffell.klvulkan.VK11.VkFormatFeatureFlagBits{
		public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 65536;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceDriverProperties.html">VkPhysicalDeviceDriverProperties</a>
	*/
	public interface VkPhysicalDeviceDriverProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceDriverProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.PNEXT);
		}

		default int driverID(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.DRIVERID);
		}

		default CString driverName(){
			final var driverName_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.DRIVERNAME, API_Constants.VK_MAX_DRIVER_NAME_SIZE);
			return driverName_.equals(MemorySegment.NULL)?null:CString.wrap(driverName_);
		}

		default CString driverInfo(){
			final var driverInfo_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.DRIVERINFO, API_Constants.VK_MAX_DRIVER_INFO_SIZE);
			return driverInfo_.equals(MemorySegment.NULL)?null:CString.wrap(driverInfo_);
		}

		default VkConformanceVersion conformanceVersion(){
			final var conformanceVersion_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.CONFORMANCEVERSION, org.lwjgl.vulkan.VkConformanceVersion.SIZEOF);
			return (conformanceVersion_.equals(MemorySegment.NULL)?null:(VkConformanceVersion)()->conformanceVersion_);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceDriverProperties from the given Arena.
		*/
		public static VkPhysicalDeviceDriverProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceDriverProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceDriverProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties.SIZEOF, (mem)->(VkPhysicalDeviceDriverProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassDescriptionDepthStencilResolve.html">VkSubpassDescriptionDepthStencilResolve</a>
	*/
	public interface VkSubpassDescriptionDepthStencilResolve extends io.github.kartoffell.klvulkan.Element<VkSubpassDescriptionDepthStencilResolve>{
		default VkSubpassDescriptionDepthStencilResolve sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STYPE);
		}

		default VkSubpassDescriptionDepthStencilResolve pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PNEXT);
		}

		/**
		depth resolve mode
		*/
		default VkSubpassDescriptionDepthStencilResolve depthResolveMode(int depthResolveMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE, depthResolveMode);
			return this;
		}

		/**
		depth resolve mode
		*/
		default int depthResolveMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE);
		}

		/**
		stencil resolve mode
		*/
		default VkSubpassDescriptionDepthStencilResolve stencilResolveMode(int stencilResolveMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE, stencilResolveMode);
			return this;
		}

		/**
		stencil resolve mode
		*/
		default int stencilResolveMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE);
		}

		/**
		depth/stencil resolve attachment
		*/
		default VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(Element<VkAttachmentReference2> pDepthStencilResolveAttachment){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT, (pDepthStencilResolveAttachment==null?MemorySegment.NULL:pDepthStencilResolveAttachment.address()));
			return this;
		}

		/**
		depth/stencil resolve attachment
		*/
		@Nullable
		default Element<VkAttachmentReference2> pDepthStencilResolveAttachment(){
			final var pDepthStencilResolveAttachment_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT);
			return (pDepthStencilResolveAttachment_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDepthStencilResolveAttachment_, org.lwjgl.vulkan.VkAttachmentReference2.SIZEOF, (v474488818)->(v474488818.equals(MemorySegment.NULL)?null:(VkAttachmentReference2)()->v474488818)));
		}

		MemorySegment address();

		/**
		Allocates a new VkSubpassDescriptionDepthStencilResolve from the given Arena.
		*/
		public static VkSubpassDescriptionDepthStencilResolve allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubpassDescriptionDepthStencilResolve from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubpassDescriptionDepthStencilResolve> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF, (mem)->(VkSubpassDescriptionDepthStencilResolve)()->mem);
		}

	}

	public interface VkResult extends io.github.kartoffell.klvulkan.VK11.VkResult{
		public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = 1000257000;

		public static final int VK_ERROR_FRAGMENTATION = 1000161000;

	}

	public interface VkSamplerAddressMode extends io.github.kartoffell.klvulkan.VK10.VkSamplerAddressMode{
		public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.html">VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures</a>
	*/
	public interface VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures>{
		default VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.STYPE);
		}

		default VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.PNEXT);
		}

		/**
		Flag to specify whether subgroup operations with extended types are supported
		*/
		default VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures shaderSubgroupExtendedTypes(boolean shaderSubgroupExtendedTypes){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SHADERSUBGROUPEXTENDEDTYPES, shaderSubgroupExtendedTypes?1:0);
			return this;
		}

		/**
		Flag to specify whether subgroup operations with extended types are supported
		*/
		default boolean shaderSubgroupExtendedTypes(){
			final var shaderSubgroupExtendedTypes_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SHADERSUBGROUPEXTENDEDTYPES);
			return shaderSubgroupExtendedTypes_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SIZEOF, (mem)->(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreTypeCreateInfo.html">VkSemaphoreTypeCreateInfo</a>
	*/
	public interface VkSemaphoreTypeCreateInfo extends io.github.kartoffell.klvulkan.Element<VkSemaphoreTypeCreateInfo>{
		default VkSemaphoreTypeCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.STYPE);
		}

		default VkSemaphoreTypeCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.PNEXT);
		}

		default VkSemaphoreTypeCreateInfo semaphoreType(int semaphoreType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.SEMAPHORETYPE, semaphoreType);
			return this;
		}

		default int semaphoreType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.SEMAPHORETYPE);
		}

		default VkSemaphoreTypeCreateInfo initialValue(long initialValue){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.INITIALVALUE, initialValue);
			return this;
		}

		default long initialValue(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.INITIALVALUE);
		}

		MemorySegment address();

		/**
		Allocates a new VkSemaphoreTypeCreateInfo from the given Arena.
		*/
		public static VkSemaphoreTypeCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSemaphoreTypeCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSemaphoreTypeCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.SIZEOF, (mem)->(VkSemaphoreTypeCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFramebufferAttachmentsCreateInfo.html">VkFramebufferAttachmentsCreateInfo</a>
	*/
	public interface VkFramebufferAttachmentsCreateInfo extends io.github.kartoffell.klvulkan.Element<VkFramebufferAttachmentsCreateInfo>{
		default VkFramebufferAttachmentsCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.STYPE);
		}

		default VkFramebufferAttachmentsCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.PNEXT);
		}

		default VkFramebufferAttachmentsCreateInfo attachmentImageInfoCount(int attachmentImageInfoCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.ATTACHMENTIMAGEINFOCOUNT, attachmentImageInfoCount);
			return this;
		}

		@Nullable
		default int attachmentImageInfoCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.ATTACHMENTIMAGEINFOCOUNT);
		}

		default VkFramebufferAttachmentsCreateInfo pAttachmentImageInfos(Element<VkFramebufferAttachmentImageInfo> pAttachmentImageInfos){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.PATTACHMENTIMAGEINFOS, (pAttachmentImageInfos==null?MemorySegment.NULL:pAttachmentImageInfos.address()));
			return this;
		}

		default Element<VkFramebufferAttachmentImageInfo> pAttachmentImageInfos(){
			final var pAttachmentImageInfos_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.PATTACHMENTIMAGEINFOS);
			return (pAttachmentImageInfos_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pAttachmentImageInfos_, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF, (v1917025677)->(v1917025677.equals(MemorySegment.NULL)?null:(VkFramebufferAttachmentImageInfo)()->v1917025677)));
		}

		MemorySegment address();

		/**
		Allocates a new VkFramebufferAttachmentsCreateInfo from the given Arena.
		*/
		public static VkFramebufferAttachmentsCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkFramebufferAttachmentsCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkFramebufferAttachmentsCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.SIZEOF, (mem)->(VkFramebufferAttachmentsCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassBeginInfo.html">VkSubpassBeginInfo</a>
	*/
	public interface VkSubpassBeginInfo extends io.github.kartoffell.klvulkan.Element<VkSubpassBeginInfo>{
		default VkSubpassBeginInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassBeginInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassBeginInfo.STYPE);
		}

		default VkSubpassBeginInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassBeginInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassBeginInfo.PNEXT);
		}

		default VkSubpassBeginInfo contents(int contents){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassBeginInfo.CONTENTS, contents);
			return this;
		}

		default int contents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassBeginInfo.CONTENTS);
		}

		MemorySegment address();

		/**
		Allocates a new VkSubpassBeginInfo from the given Arena.
		*/
		public static VkSubpassBeginInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubpassBeginInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubpassBeginInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubpassBeginInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubpassBeginInfo.SIZEOF, (mem)->(VkSubpassBeginInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResolveModeFlagBits.html">VkResolveModeFlagBits</a>
	*/
	public interface VkResolveModeFlagBits{
		public static final int VK_RESOLVE_MODE_MAX_BIT = 8;

		public static final int VK_RESOLVE_MODE_SAMPLE_ZERO_BIT = 1;

		public static final int VK_RESOLVE_MODE_AVERAGE_BIT = 2;

		public static final int VK_RESOLVE_MODE_MIN_BIT = 4;

		public static final int VK_RESOLVE_MODE_NONE = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceTimelineSemaphoreProperties.html">VkPhysicalDeviceTimelineSemaphoreProperties</a>
	*/
	public interface VkPhysicalDeviceTimelineSemaphoreProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceTimelineSemaphoreProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.PNEXT);
		}

		default long maxTimelineSemaphoreValueDifference(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.MAXTIMELINESEMAPHOREVALUEDIFFERENCE);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceTimelineSemaphoreProperties from the given Arena.
		*/
		public static VkPhysicalDeviceTimelineSemaphoreProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceTimelineSemaphoreProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceTimelineSemaphoreProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.SIZEOF, (mem)->(VkPhysicalDeviceTimelineSemaphoreProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreWaitInfo.html">VkSemaphoreWaitInfo</a>
	*/
	public interface VkSemaphoreWaitInfo extends io.github.kartoffell.klvulkan.Element<VkSemaphoreWaitInfo>{
		default VkSemaphoreWaitInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreWaitInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreWaitInfo.STYPE);
		}

		default VkSemaphoreWaitInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreWaitInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreWaitInfo.PNEXT);
		}

		default VkSemaphoreWaitInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreWaitInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreWaitInfo.FLAGS);
		}

		default VkSemaphoreWaitInfo semaphoreCount(int semaphoreCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreWaitInfo.SEMAPHORECOUNT, semaphoreCount);
			return this;
		}

		default int semaphoreCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreWaitInfo.SEMAPHORECOUNT);
		}

		default VkSemaphoreWaitInfo pSemaphores(PointerBuffer<? extends Element<? extends VkSemaphore>> pSemaphores){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreWaitInfo.PSEMAPHORES, (pSemaphores==null?MemorySegment.NULL:pSemaphores.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkSemaphore>> pSemaphores(){
			final var pSemaphores_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreWaitInfo.PSEMAPHORES);
			return (pSemaphores_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pSemaphores_, (v462773420)->(v462773420.equals(MemorySegment.NULL)?null:(Element<? extends VkSemaphore>)()->v462773420)));
		}

		default VkSemaphoreWaitInfo pValues(LongBuffer pValues){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreWaitInfo.PVALUES, (pValues==null?MemorySegment.NULL:MemorySegment.ofBuffer(pValues)));
			return this;
		}

		default LongBuffer pValues(){
			final var pValues_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreWaitInfo.PVALUES);
			return (pValues_.equals(MemorySegment.NULL)?null:pValues_.asByteBuffer().asLongBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkSemaphoreWaitInfo from the given Arena.
		*/
		public static VkSemaphoreWaitInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSemaphoreWaitInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSemaphoreWaitInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF, (mem)->(VkSemaphoreWaitInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceMemoryOpaqueCaptureAddressInfo.html">VkDeviceMemoryOpaqueCaptureAddressInfo</a>
	*/
	public interface VkDeviceMemoryOpaqueCaptureAddressInfo extends io.github.kartoffell.klvulkan.Element<VkDeviceMemoryOpaqueCaptureAddressInfo>{
		default VkDeviceMemoryOpaqueCaptureAddressInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.STYPE);
		}

		default VkDeviceMemoryOpaqueCaptureAddressInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.PNEXT);
		}

		default VkDeviceMemoryOpaqueCaptureAddressInfo memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		MemorySegment address();

		/**
		Allocates a new VkDeviceMemoryOpaqueCaptureAddressInfo from the given Arena.
		*/
		public static VkDeviceMemoryOpaqueCaptureAddressInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDeviceMemoryOpaqueCaptureAddressInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDeviceMemoryOpaqueCaptureAddressInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.SIZEOF, (mem)->(VkDeviceMemoryOpaqueCaptureAddressInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentDescription2.html">VkAttachmentDescription2</a>
	*/
	public interface VkAttachmentDescription2 extends io.github.kartoffell.klvulkan.Element<VkAttachmentDescription2>{
		default VkAttachmentDescription2 sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STYPE);
		}

		default VkAttachmentDescription2 pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentDescription2.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAttachmentDescription2.PNEXT);
		}

		default VkAttachmentDescription2 flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.FLAGS);
		}

		default VkAttachmentDescription2 format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.FORMAT, format);
			return this;
		}

		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.FORMAT);
		}

		default VkAttachmentDescription2 samples(int samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.SAMPLES, samples);
			return this;
		}

		default int samples(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.SAMPLES);
		}

		/**
		Load operation for color or depth data
		*/
		default VkAttachmentDescription2 loadOp(int loadOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.LOADOP, loadOp);
			return this;
		}

		/**
		Load operation for color or depth data
		*/
		default int loadOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.LOADOP);
		}

		/**
		Store operation for color or depth data
		*/
		default VkAttachmentDescription2 storeOp(int storeOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STOREOP, storeOp);
			return this;
		}

		/**
		Store operation for color or depth data
		*/
		default int storeOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STOREOP);
		}

		/**
		Load operation for stencil data
		*/
		default VkAttachmentDescription2 stencilLoadOp(int stencilLoadOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STENCILLOADOP, stencilLoadOp);
			return this;
		}

		/**
		Load operation for stencil data
		*/
		default int stencilLoadOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STENCILLOADOP);
		}

		/**
		Store operation for stencil data
		*/
		default VkAttachmentDescription2 stencilStoreOp(int stencilStoreOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STENCILSTOREOP, stencilStoreOp);
			return this;
		}

		/**
		Store operation for stencil data
		*/
		default int stencilStoreOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.STENCILSTOREOP);
		}

		default VkAttachmentDescription2 initialLayout(int initialLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.INITIALLAYOUT, initialLayout);
			return this;
		}

		default int initialLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.INITIALLAYOUT);
		}

		default VkAttachmentDescription2 finalLayout(int finalLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.FINALLAYOUT, finalLayout);
			return this;
		}

		default int finalLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription2.FINALLAYOUT);
		}

		MemorySegment address();

		/**
		Allocates a new VkAttachmentDescription2 from the given Arena.
		*/
		public static VkAttachmentDescription2 allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkAttachmentDescription2 from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkAttachmentDescription2> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF, (mem)->(VkAttachmentDescription2)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetVariableDescriptorCountAllocateInfo.html">VkDescriptorSetVariableDescriptorCountAllocateInfo</a>
	*/
	public interface VkDescriptorSetVariableDescriptorCountAllocateInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorSetVariableDescriptorCountAllocateInfo>{
		default VkDescriptorSetVariableDescriptorCountAllocateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.STYPE);
		}

		default VkDescriptorSetVariableDescriptorCountAllocateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.PNEXT);
		}

		default VkDescriptorSetVariableDescriptorCountAllocateInfo descriptorSetCount(int descriptorSetCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.DESCRIPTORSETCOUNT, descriptorSetCount);
			return this;
		}

		@Nullable
		default int descriptorSetCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.DESCRIPTORSETCOUNT);
		}

		default VkDescriptorSetVariableDescriptorCountAllocateInfo pDescriptorCounts(IntBuffer pDescriptorCounts){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.PDESCRIPTORCOUNTS, (pDescriptorCounts==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDescriptorCounts)));
			return this;
		}

		default IntBuffer pDescriptorCounts(){
			final var pDescriptorCounts_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.PDESCRIPTORCOUNTS);
			return (pDescriptorCounts_.equals(MemorySegment.NULL)?null:pDescriptorCounts_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorSetVariableDescriptorCountAllocateInfo from the given Arena.
		*/
		public static VkDescriptorSetVariableDescriptorCountAllocateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorSetVariableDescriptorCountAllocateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorSetVariableDescriptorCountAllocateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.SIZEOF, (mem)->(VkDescriptorSetVariableDescriptorCountAllocateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassEndInfo.html">VkSubpassEndInfo</a>
	*/
	public interface VkSubpassEndInfo extends io.github.kartoffell.klvulkan.Element<VkSubpassEndInfo>{
		default VkSubpassEndInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassEndInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassEndInfo.STYPE);
		}

		default VkSubpassEndInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassEndInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassEndInfo.PNEXT);
		}

		MemorySegment address();

		/**
		Allocates a new VkSubpassEndInfo from the given Arena.
		*/
		public static VkSubpassEndInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubpassEndInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubpassEndInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubpassEndInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubpassEndInfo.SIZEOF, (mem)->(VkSubpassEndInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkConformanceVersion.html">VkConformanceVersion</a>
	*/
	public interface VkConformanceVersion extends io.github.kartoffell.klvulkan.Element<VkConformanceVersion>{
		default VkConformanceVersion major(byte major){
			address().set(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.MAJOR, major);
			return this;
		}

		default byte major(){
			return address().get(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.MAJOR);
		}

		default VkConformanceVersion minor(byte minor){
			address().set(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.MINOR, minor);
			return this;
		}

		default byte minor(){
			return address().get(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.MINOR);
		}

		default VkConformanceVersion subminor(byte subminor){
			address().set(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.SUBMINOR, subminor);
			return this;
		}

		default byte subminor(){
			return address().get(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.SUBMINOR);
		}

		default VkConformanceVersion patch(byte patch){
			address().set(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.PATCH, patch);
			return this;
		}

		default byte patch(){
			return address().get(ValueLayout.JAVA_BYTE, org.lwjgl.vulkan.VkConformanceVersion.PATCH);
		}

		MemorySegment address();

		/**
		Allocates a new VkConformanceVersion from the given Arena.
		*/
		public static VkConformanceVersion allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkConformanceVersion.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkConformanceVersion from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkConformanceVersion> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkConformanceVersion.SIZEOF, (mem)->(VkConformanceVersion)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryOpaqueCaptureAddressAllocateInfo.html">VkMemoryOpaqueCaptureAddressAllocateInfo</a>
	*/
	public interface VkMemoryOpaqueCaptureAddressAllocateInfo extends io.github.kartoffell.klvulkan.Element<VkMemoryOpaqueCaptureAddressAllocateInfo>{
		default VkMemoryOpaqueCaptureAddressAllocateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.STYPE);
		}

		default VkMemoryOpaqueCaptureAddressAllocateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.PNEXT);
		}

		default VkMemoryOpaqueCaptureAddressAllocateInfo opaqueCaptureAddress(long opaqueCaptureAddress){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.OPAQUECAPTUREADDRESS, opaqueCaptureAddress);
			return this;
		}

		default long opaqueCaptureAddress(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.OPAQUECAPTUREADDRESS);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryOpaqueCaptureAddressAllocateInfo from the given Arena.
		*/
		public static VkMemoryOpaqueCaptureAddressAllocateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryOpaqueCaptureAddressAllocateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryOpaqueCaptureAddressAllocateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo.SIZEOF, (mem)->(VkMemoryOpaqueCaptureAddressAllocateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreType.html">VkSemaphoreType</a>
	*/
	public interface VkSemaphoreType{
		public static final int VK_SEMAPHORE_TYPE_BINARY = 0;

		public static final int VK_SEMAPHORE_TYPE_TIMELINE = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageStencilUsageCreateInfo.html">VkImageStencilUsageCreateInfo</a>
	*/
	public interface VkImageStencilUsageCreateInfo extends io.github.kartoffell.klvulkan.Element<VkImageStencilUsageCreateInfo>{
		default VkImageStencilUsageCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.STYPE);
		}

		default VkImageStencilUsageCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.PNEXT);
		}

		default VkImageStencilUsageCreateInfo stencilUsage(int stencilUsage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.STENCILUSAGE, stencilUsage);
			return this;
		}

		default int stencilUsage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.STENCILUSAGE);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageStencilUsageCreateInfo from the given Arena.
		*/
		public static VkImageStencilUsageCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageStencilUsageCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageStencilUsageCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.SIZEOF, (mem)->(VkImageStencilUsageCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceFloatControlsProperties.html">VkPhysicalDeviceFloatControlsProperties</a>
	*/
	public interface VkPhysicalDeviceFloatControlsProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceFloatControlsProperties>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.PNEXT);
		}

		default int denormBehaviorIndependence(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.DENORMBEHAVIORINDEPENDENCE);
		}

		default int roundingModeIndependence(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ROUNDINGMODEINDEPENDENCE);
		}

		/**
		An implementation can preserve signed zero, nan, inf
		*/
		default boolean shaderSignedZeroInfNanPreserveFloat16(){
			final var shaderSignedZeroInfNanPreserveFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16);
			return shaderSignedZeroInfNanPreserveFloat16_!=0;
		}

		/**
		An implementation can preserve signed zero, nan, inf
		*/
		default boolean shaderSignedZeroInfNanPreserveFloat32(){
			final var shaderSignedZeroInfNanPreserveFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32);
			return shaderSignedZeroInfNanPreserveFloat32_!=0;
		}

		/**
		An implementation can preserve signed zero, nan, inf
		*/
		default boolean shaderSignedZeroInfNanPreserveFloat64(){
			final var shaderSignedZeroInfNanPreserveFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64);
			return shaderSignedZeroInfNanPreserveFloat64_!=0;
		}

		/**
		An implementation can preserve  denormals
		*/
		default boolean shaderDenormPreserveFloat16(){
			final var shaderDenormPreserveFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT16);
			return shaderDenormPreserveFloat16_!=0;
		}

		/**
		An implementation can preserve  denormals
		*/
		default boolean shaderDenormPreserveFloat32(){
			final var shaderDenormPreserveFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT32);
			return shaderDenormPreserveFloat32_!=0;
		}

		/**
		An implementation can preserve  denormals
		*/
		default boolean shaderDenormPreserveFloat64(){
			final var shaderDenormPreserveFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT64);
			return shaderDenormPreserveFloat64_!=0;
		}

		/**
		An implementation can flush to zero  denormals
		*/
		default boolean shaderDenormFlushToZeroFloat16(){
			final var shaderDenormFlushToZeroFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT16);
			return shaderDenormFlushToZeroFloat16_!=0;
		}

		/**
		An implementation can flush to zero  denormals
		*/
		default boolean shaderDenormFlushToZeroFloat32(){
			final var shaderDenormFlushToZeroFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT32);
			return shaderDenormFlushToZeroFloat32_!=0;
		}

		/**
		An implementation can flush to zero  denormals
		*/
		default boolean shaderDenormFlushToZeroFloat64(){
			final var shaderDenormFlushToZeroFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT64);
			return shaderDenormFlushToZeroFloat64_!=0;
		}

		/**
		An implementation can support RTE
		*/
		default boolean shaderRoundingModeRTEFloat16(){
			final var shaderRoundingModeRTEFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT16);
			return shaderRoundingModeRTEFloat16_!=0;
		}

		/**
		An implementation can support RTE
		*/
		default boolean shaderRoundingModeRTEFloat32(){
			final var shaderRoundingModeRTEFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT32);
			return shaderRoundingModeRTEFloat32_!=0;
		}

		/**
		An implementation can support RTE
		*/
		default boolean shaderRoundingModeRTEFloat64(){
			final var shaderRoundingModeRTEFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT64);
			return shaderRoundingModeRTEFloat64_!=0;
		}

		/**
		An implementation can support RTZ
		*/
		default boolean shaderRoundingModeRTZFloat16(){
			final var shaderRoundingModeRTZFloat16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT16);
			return shaderRoundingModeRTZFloat16_!=0;
		}

		/**
		An implementation can support RTZ
		*/
		default boolean shaderRoundingModeRTZFloat32(){
			final var shaderRoundingModeRTZFloat32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT32);
			return shaderRoundingModeRTZFloat32_!=0;
		}

		/**
		An implementation can support RTZ
		*/
		default boolean shaderRoundingModeRTZFloat64(){
			final var shaderRoundingModeRTZFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT64);
			return shaderRoundingModeRTZFloat64_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceFloatControlsProperties from the given Arena.
		*/
		public static VkPhysicalDeviceFloatControlsProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceFloatControlsProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceFloatControlsProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF, (mem)->(VkPhysicalDeviceFloatControlsProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreSignalInfo.html">VkSemaphoreSignalInfo</a>
	*/
	public interface VkSemaphoreSignalInfo extends io.github.kartoffell.klvulkan.Element<VkSemaphoreSignalInfo>{
		default VkSemaphoreSignalInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreSignalInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreSignalInfo.STYPE);
		}

		default VkSemaphoreSignalInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSignalInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSignalInfo.PNEXT);
		}

		default VkSemaphoreSignalInfo semaphore(Element<? extends VkSemaphore> semaphore){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSignalInfo.SEMAPHORE, (semaphore==null?MemorySegment.NULL:semaphore.address()));
			return this;
		}

		default Element<? extends VkSemaphore> semaphore(){
			final var semaphore_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreSignalInfo.SEMAPHORE);
			return (semaphore_.equals(MemorySegment.NULL)?null:(Element<? extends VkSemaphore>)()->semaphore_);
		}

		default VkSemaphoreSignalInfo value(long value){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreSignalInfo.VALUE, value);
			return this;
		}

		default long value(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSemaphoreSignalInfo.VALUE);
		}

		MemorySegment address();

		/**
		Allocates a new VkSemaphoreSignalInfo from the given Arena.
		*/
		public static VkSemaphoreSignalInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSemaphoreSignalInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSemaphoreSignalInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSemaphoreSignalInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSemaphoreSignalInfo.SIZEOF, (mem)->(VkSemaphoreSignalInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerReductionModeCreateInfo.html">VkSamplerReductionModeCreateInfo</a>
	*/
	public interface VkSamplerReductionModeCreateInfo extends io.github.kartoffell.klvulkan.Element<VkSamplerReductionModeCreateInfo>{
		default VkSamplerReductionModeCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.STYPE);
		}

		default VkSamplerReductionModeCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.PNEXT);
		}

		default VkSamplerReductionModeCreateInfo reductionMode(int reductionMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.REDUCTIONMODE, reductionMode);
			return this;
		}

		default int reductionMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.REDUCTIONMODE);
		}

		MemorySegment address();

		/**
		Allocates a new VkSamplerReductionModeCreateInfo from the given Arena.
		*/
		public static VkSamplerReductionModeCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSamplerReductionModeCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSamplerReductionModeCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.SIZEOF, (mem)->(VkSamplerReductionModeCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceUniformBufferStandardLayoutFeatures.html">VkPhysicalDeviceUniformBufferStandardLayoutFeatures</a>
	*/
	public interface VkPhysicalDeviceUniformBufferStandardLayoutFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceUniformBufferStandardLayoutFeatures>{
		default VkPhysicalDeviceUniformBufferStandardLayoutFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.STYPE);
		}

		default VkPhysicalDeviceUniformBufferStandardLayoutFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.PNEXT);
		}

		default VkPhysicalDeviceUniformBufferStandardLayoutFeatures uniformBufferStandardLayout(boolean uniformBufferStandardLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.UNIFORMBUFFERSTANDARDLAYOUT, uniformBufferStandardLayout?1:0);
			return this;
		}

		default boolean uniformBufferStandardLayout(){
			final var uniformBufferStandardLayout_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.UNIFORMBUFFERSTANDARDLAYOUT);
			return uniformBufferStandardLayout_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceUniformBufferStandardLayoutFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceUniformBufferStandardLayoutFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceUniformBufferStandardLayoutFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.SIZEOF, (mem)->(VkPhysicalDeviceUniformBufferStandardLayoutFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceVulkan11Features.html">VkPhysicalDeviceVulkan11Features</a>
	*/
	public interface VkPhysicalDeviceVulkan11Features extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceVulkan11Features>{
		default VkPhysicalDeviceVulkan11Features sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STYPE);
		}

		default VkPhysicalDeviceVulkan11Features pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.PNEXT);
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock
		*/
		default VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(boolean storageBuffer16BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STORAGEBUFFER16BITACCESS, storageBuffer16BitAccess?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock
		*/
		default boolean storageBuffer16BitAccess(){
			final var storageBuffer16BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STORAGEBUFFER16BITACCESS);
			return storageBuffer16BitAccess_!=0;
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock and Block
		*/
		default VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(boolean uniformAndStorageBuffer16BitAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.UNIFORMANDSTORAGEBUFFER16BITACCESS, uniformAndStorageBuffer16BitAccess?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in BufferBlock and Block
		*/
		default boolean uniformAndStorageBuffer16BitAccess(){
			final var uniformAndStorageBuffer16BitAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.UNIFORMANDSTORAGEBUFFER16BITACCESS);
			return uniformAndStorageBuffer16BitAccess_!=0;
		}

		/**
		16-bit integer/floating-point variables supported in PushConstant
		*/
		default VkPhysicalDeviceVulkan11Features storagePushConstant16(boolean storagePushConstant16){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STORAGEPUSHCONSTANT16, storagePushConstant16?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in PushConstant
		*/
		default boolean storagePushConstant16(){
			final var storagePushConstant16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STORAGEPUSHCONSTANT16);
			return storagePushConstant16_!=0;
		}

		/**
		16-bit integer/floating-point variables supported in shader inputs and outputs
		*/
		default VkPhysicalDeviceVulkan11Features storageInputOutput16(boolean storageInputOutput16){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STORAGEINPUTOUTPUT16, storageInputOutput16?1:0);
			return this;
		}

		/**
		16-bit integer/floating-point variables supported in shader inputs and outputs
		*/
		default boolean storageInputOutput16(){
			final var storageInputOutput16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.STORAGEINPUTOUTPUT16);
			return storageInputOutput16_!=0;
		}

		/**
		Multiple views in a render pass
		*/
		default VkPhysicalDeviceVulkan11Features multiview(boolean multiview){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.MULTIVIEW, multiview?1:0);
			return this;
		}

		/**
		Multiple views in a render pass
		*/
		default boolean multiview(){
			final var multiview_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.MULTIVIEW);
			return multiview_!=0;
		}

		/**
		Multiple views in a render pass w/ geometry shader
		*/
		default VkPhysicalDeviceVulkan11Features multiviewGeometryShader(boolean multiviewGeometryShader){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.MULTIVIEWGEOMETRYSHADER, multiviewGeometryShader?1:0);
			return this;
		}

		/**
		Multiple views in a render pass w/ geometry shader
		*/
		default boolean multiviewGeometryShader(){
			final var multiviewGeometryShader_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.MULTIVIEWGEOMETRYSHADER);
			return multiviewGeometryShader_!=0;
		}

		/**
		Multiple views in a render pass w/ tessellation shader
		*/
		default VkPhysicalDeviceVulkan11Features multiviewTessellationShader(boolean multiviewTessellationShader){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.MULTIVIEWTESSELLATIONSHADER, multiviewTessellationShader?1:0);
			return this;
		}

		/**
		Multiple views in a render pass w/ tessellation shader
		*/
		default boolean multiviewTessellationShader(){
			final var multiviewTessellationShader_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.MULTIVIEWTESSELLATIONSHADER);
			return multiviewTessellationShader_!=0;
		}

		default VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(boolean variablePointersStorageBuffer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERSSTORAGEBUFFER, variablePointersStorageBuffer?1:0);
			return this;
		}

		default boolean variablePointersStorageBuffer(){
			final var variablePointersStorageBuffer_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERSSTORAGEBUFFER);
			return variablePointersStorageBuffer_!=0;
		}

		default VkPhysicalDeviceVulkan11Features variablePointers(boolean variablePointers){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERS, variablePointers?1:0);
			return this;
		}

		default boolean variablePointers(){
			final var variablePointers_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERS);
			return variablePointers_!=0;
		}

		default VkPhysicalDeviceVulkan11Features protectedMemory(boolean protectedMemory){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.PROTECTEDMEMORY, protectedMemory?1:0);
			return this;
		}

		default boolean protectedMemory(){
			final var protectedMemory_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.PROTECTEDMEMORY);
			return protectedMemory_!=0;
		}

		/**
		Sampler color conversion supported
		*/
		default VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(boolean samplerYcbcrConversion){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.SAMPLERYCBCRCONVERSION, samplerYcbcrConversion?1:0);
			return this;
		}

		/**
		Sampler color conversion supported
		*/
		default boolean samplerYcbcrConversion(){
			final var samplerYcbcrConversion_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.SAMPLERYCBCRCONVERSION);
			return samplerYcbcrConversion_!=0;
		}

		default VkPhysicalDeviceVulkan11Features shaderDrawParameters(boolean shaderDrawParameters){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.SHADERDRAWPARAMETERS, shaderDrawParameters?1:0);
			return this;
		}

		default boolean shaderDrawParameters(){
			final var shaderDrawParameters_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.SHADERDRAWPARAMETERS);
			return shaderDrawParameters_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceVulkan11Features from the given Arena.
		*/
		public static VkPhysicalDeviceVulkan11Features allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceVulkan11Features from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceVulkan11Features> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features.SIZEOF, (mem)->(VkPhysicalDeviceVulkan11Features)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceTimelineSemaphoreFeatures.html">VkPhysicalDeviceTimelineSemaphoreFeatures</a>
	*/
	public interface VkPhysicalDeviceTimelineSemaphoreFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceTimelineSemaphoreFeatures>{
		default VkPhysicalDeviceTimelineSemaphoreFeatures sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.STYPE);
		}

		default VkPhysicalDeviceTimelineSemaphoreFeatures pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.PNEXT);
		}

		default VkPhysicalDeviceTimelineSemaphoreFeatures timelineSemaphore(boolean timelineSemaphore){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.TIMELINESEMAPHORE, timelineSemaphore?1:0);
			return this;
		}

		default boolean timelineSemaphore(){
			final var timelineSemaphore_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.TIMELINESEMAPHORE);
			return timelineSemaphore_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceTimelineSemaphoreFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceTimelineSemaphoreFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceTimelineSemaphoreFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceTimelineSemaphoreFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.SIZEOF, (mem)->(VkPhysicalDeviceTimelineSemaphoreFeatures)()->mem);
		}

	}

	public interface VkBufferCreateFlagBits extends io.github.kartoffell.klvulkan.VK11.VkBufferCreateFlagBits{
		public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 16;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetLayoutBindingFlagsCreateInfo.html">VkDescriptorSetLayoutBindingFlagsCreateInfo</a>
	*/
	public interface VkDescriptorSetLayoutBindingFlagsCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorSetLayoutBindingFlagsCreateInfo>{
		default VkDescriptorSetLayoutBindingFlagsCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.STYPE);
		}

		default VkDescriptorSetLayoutBindingFlagsCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.PNEXT);
		}

		default VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCount(int bindingCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.BINDINGCOUNT, bindingCount);
			return this;
		}

		@Nullable
		default int bindingCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.BINDINGCOUNT);
		}

		default VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlags(IntBuffer pBindingFlags){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.PBINDINGFLAGS, (pBindingFlags==null?MemorySegment.NULL:MemorySegment.ofBuffer(pBindingFlags)));
			return this;
		}

		default IntBuffer pBindingFlags(){
			final var pBindingFlags_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.PBINDINGFLAGS);
			return (pBindingFlags_.equals(MemorySegment.NULL)?null:pBindingFlags_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorSetLayoutBindingFlagsCreateInfo from the given Arena.
		*/
		public static VkDescriptorSetLayoutBindingFlagsCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorSetLayoutBindingFlagsCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorSetLayoutBindingFlagsCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.SIZEOF, (mem)->(VkDescriptorSetLayoutBindingFlagsCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageFormatListCreateInfo.html">VkImageFormatListCreateInfo</a>
	*/
	public interface VkImageFormatListCreateInfo extends io.github.kartoffell.klvulkan.Element<VkImageFormatListCreateInfo>{
		default VkImageFormatListCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatListCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatListCreateInfo.STYPE);
		}

		default VkImageFormatListCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageFormatListCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageFormatListCreateInfo.PNEXT);
		}

		default VkImageFormatListCreateInfo viewFormatCount(int viewFormatCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatListCreateInfo.VIEWFORMATCOUNT, viewFormatCount);
			return this;
		}

		@Nullable
		default int viewFormatCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatListCreateInfo.VIEWFORMATCOUNT);
		}

		default VkImageFormatListCreateInfo pViewFormats(IntBuffer pViewFormats){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageFormatListCreateInfo.PVIEWFORMATS, (pViewFormats==null?MemorySegment.NULL:MemorySegment.ofBuffer(pViewFormats)));
			return this;
		}

		default IntBuffer pViewFormats(){
			final var pViewFormats_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageFormatListCreateInfo.PVIEWFORMATS);
			return (pViewFormats_.equals(MemorySegment.NULL)?null:pViewFormats_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkImageFormatListCreateInfo from the given Arena.
		*/
		public static VkImageFormatListCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageFormatListCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageFormatListCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageFormatListCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageFormatListCreateInfo.SIZEOF, (mem)->(VkImageFormatListCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkShaderFloatControlsIndependence.html">VkShaderFloatControlsIndependence</a>
	*/
	public interface VkShaderFloatControlsIndependence{
		public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL = 1;

		public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE = 2;

		public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY = 0;

	}

	public interface VkFramebufferCreateFlagBits extends io.github.kartoffell.klvulkan.VK10.VkFramebufferCreateFlagBits{
		public static final int VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetVariableDescriptorCountLayoutSupport.html">VkDescriptorSetVariableDescriptorCountLayoutSupport</a>
	*/
	public interface VkDescriptorSetVariableDescriptorCountLayoutSupport extends io.github.kartoffell.klvulkan.Element<VkDescriptorSetVariableDescriptorCountLayoutSupport>{
		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountLayoutSupport.STYPE);
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountLayoutSupport.PNEXT);
		}

		default int maxVariableDescriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountLayoutSupport.MAXVARIABLEDESCRIPTORCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorSetVariableDescriptorCountLayoutSupport from the given Arena.
		*/
		public static VkDescriptorSetVariableDescriptorCountLayoutSupport allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountLayoutSupport.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorSetVariableDescriptorCountLayoutSupport from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorSetVariableDescriptorCountLayoutSupport> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountLayoutSupport.SIZEOF, (mem)->(VkDescriptorSetVariableDescriptorCountLayoutSupport)()->mem);
		}

	}

	protected final VkCapabilitiesGlobal capabilities = new VkCapabilitiesGlobal();

	public VkCapabilitiesGlobal capabilities() {
		return capabilities;
	}

	public static void checkError(int code) {
		VK11.checkError(code);
		switch (code) {
			case 1000257000 -> throw new VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS();
			case 1000161000 -> throw new VK_ERROR_FRAGMENTATION();

		}
	}

}
