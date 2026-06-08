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
// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
/**
Vulkan core API interface definitions (merged)
*/
public class VK10{
	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassDescription.html">VkSubpassDescription</a>
	*/
	public interface VkSubpassDescription extends io.github.kartoffell.klvulkan.Element<VkSubpassDescription>{
		default VkSubpassDescription flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.FLAGS);
		}

		/**
		Must be VK_PIPELINE_BIND_POINT_GRAPHICS for now
		*/
		default VkSubpassDescription pipelineBindPoint(int pipelineBindPoint){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.PIPELINEBINDPOINT, pipelineBindPoint);
			return this;
		}

		/**
		Must be VK_PIPELINE_BIND_POINT_GRAPHICS for now
		*/
		default int pipelineBindPoint(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.PIPELINEBINDPOINT);
		}

		default VkSubpassDescription inputAttachmentCount(int inputAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.INPUTATTACHMENTCOUNT, inputAttachmentCount);
			return this;
		}

		@Nullable
		default int inputAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.INPUTATTACHMENTCOUNT);
		}

		default VkSubpassDescription pInputAttachments(Element<VkAttachmentReference> pInputAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PINPUTATTACHMENTS, (pInputAttachments==null?MemorySegment.NULL:pInputAttachments.address()));
			return this;
		}

		default Element<VkAttachmentReference> pInputAttachments(){
			final var pInputAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PINPUTATTACHMENTS);
			return (pInputAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pInputAttachments_, org.lwjgl.vulkan.VkAttachmentReference.SIZEOF, (v851912430)->(v851912430.equals(MemorySegment.NULL)?null:(VkAttachmentReference)()->v851912430)));
		}

		default VkSubpassDescription colorAttachmentCount(int colorAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.COLORATTACHMENTCOUNT, colorAttachmentCount);
			return this;
		}

		@Nullable
		default int colorAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.COLORATTACHMENTCOUNT);
		}

		default VkSubpassDescription pColorAttachments(Element<VkAttachmentReference> pColorAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PCOLORATTACHMENTS, (pColorAttachments==null?MemorySegment.NULL:pColorAttachments.address()));
			return this;
		}

		default Element<VkAttachmentReference> pColorAttachments(){
			final var pColorAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PCOLORATTACHMENTS);
			return (pColorAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pColorAttachments_, org.lwjgl.vulkan.VkAttachmentReference.SIZEOF, (v586358252)->(v586358252.equals(MemorySegment.NULL)?null:(VkAttachmentReference)()->v586358252)));
		}

		default VkSubpassDescription pResolveAttachments(Element<VkAttachmentReference> pResolveAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PRESOLVEATTACHMENTS, (pResolveAttachments==null?MemorySegment.NULL:pResolveAttachments.address()));
			return this;
		}

		@Nullable
		default Element<VkAttachmentReference> pResolveAttachments(){
			final var pResolveAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PRESOLVEATTACHMENTS);
			return (pResolveAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pResolveAttachments_, org.lwjgl.vulkan.VkAttachmentReference.SIZEOF, (v885002305)->(v885002305.equals(MemorySegment.NULL)?null:(VkAttachmentReference)()->v885002305)));
		}

		default VkSubpassDescription pDepthStencilAttachment(Element<VkAttachmentReference> pDepthStencilAttachment){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PDEPTHSTENCILATTACHMENT, (pDepthStencilAttachment==null?MemorySegment.NULL:pDepthStencilAttachment.address()));
			return this;
		}

		@Nullable
		default Element<VkAttachmentReference> pDepthStencilAttachment(){
			final var pDepthStencilAttachment_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PDEPTHSTENCILATTACHMENT);
			return (pDepthStencilAttachment_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDepthStencilAttachment_, org.lwjgl.vulkan.VkAttachmentReference.SIZEOF, (v124734309)->(v124734309.equals(MemorySegment.NULL)?null:(VkAttachmentReference)()->v124734309)));
		}

		default VkSubpassDescription preserveAttachmentCount(int preserveAttachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.PRESERVEATTACHMENTCOUNT, preserveAttachmentCount);
			return this;
		}

		@Nullable
		default int preserveAttachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDescription.PRESERVEATTACHMENTCOUNT);
		}

		default VkSubpassDescription pPreserveAttachments(IntBuffer pPreserveAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PPRESERVEATTACHMENTS, (pPreserveAttachments==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPreserveAttachments)));
			return this;
		}

		default IntBuffer pPreserveAttachments(){
			final var pPreserveAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubpassDescription.PPRESERVEATTACHMENTS);
			return (pPreserveAttachments_.equals(MemorySegment.NULL)?null:pPreserveAttachments_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkSubpassDescription from the given Arena.
		*/
		public static VkSubpassDescription allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubpassDescription.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubpassDescription from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubpassDescription> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubpassDescription.SIZEOF, (mem)->(VkSubpassDescription)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkOffset2D.html">VkOffset2D</a>
	*/
	public interface VkOffset2D extends io.github.kartoffell.klvulkan.Element<VkOffset2D>{
		default VkOffset2D x(int x){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset2D.X, x);
			return this;
		}

		default int x(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset2D.X);
		}

		default VkOffset2D y(int y){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset2D.Y, y);
			return this;
		}

		default int y(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset2D.Y);
		}

		MemorySegment address();

		/**
		Allocates a new VkOffset2D from the given Arena.
		*/
		public static VkOffset2D allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkOffset2D.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkOffset2D from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkOffset2D> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkOffset2D.SIZEOF, (mem)->(VkOffset2D)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferView.html">VkBufferView</a>
	*/
	public static record VkBufferView(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkBufferView>{
		public static PointerBuffer<? extends VkBufferView> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkBufferView(mem, parent)); //VkBufferView
		}

		public static PointerBuffer<? extends VkBufferView> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkColorComponentFlagBits.html">VkColorComponentFlagBits</a>
	*/
	public interface VkColorComponentFlagBits{
		public static final int VK_COLOR_COMPONENT_B_BIT = 4;

		public static final int VK_COLOR_COMPONENT_R_BIT = 1;

		public static final int VK_COLOR_COMPONENT_A_BIT = 8;

		public static final int VK_COLOR_COMPONENT_G_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSampleCountFlagBits.html">VkSampleCountFlagBits</a>
	*/
	public interface VkSampleCountFlagBits{
		public static final int VK_SAMPLE_COUNT_2_BIT = 2;

		public static final int VK_SAMPLE_COUNT_4_BIT = 4;

		public static final int VK_SAMPLE_COUNT_16_BIT = 16;

		public static final int VK_SAMPLE_COUNT_8_BIT = 8;

		public static final int VK_SAMPLE_COUNT_32_BIT = 32;

		public static final int VK_SAMPLE_COUNT_1_BIT = 1;

		public static final int VK_SAMPLE_COUNT_64_BIT = 64;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageCreateFlagBits.html">VkImageCreateFlagBits</a>
	*/
	public interface VkImageCreateFlagBits{
		public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 1;

		public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 8;

		public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 2;

		public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 16;

		public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageViewCreateInfo.html">VkImageViewCreateInfo</a>
	*/
	public interface VkImageViewCreateInfo extends io.github.kartoffell.klvulkan.Element<VkImageViewCreateInfo>{
		default VkImageViewCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.STYPE);
		}

		default VkImageViewCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageViewCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageViewCreateInfo.PNEXT);
		}

		default VkImageViewCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.FLAGS);
		}

		default VkImageViewCreateInfo image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageViewCreateInfo.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageViewCreateInfo.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		default VkImageViewCreateInfo viewType(int viewType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.VIEWTYPE, viewType);
			return this;
		}

		default int viewType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.VIEWTYPE);
		}

		default VkImageViewCreateInfo format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.FORMAT, format);
			return this;
		}

		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageViewCreateInfo.FORMAT);
		}

		default VkComponentMapping components(){
			final var components_ = address().asSlice(org.lwjgl.vulkan.VkImageViewCreateInfo.COMPONENTS, org.lwjgl.vulkan.VkComponentMapping.SIZEOF);
			return (components_.equals(MemorySegment.NULL)?null:(VkComponentMapping)()->components_);
		}

		default VkImageSubresourceRange subresourceRange(){
			final var subresourceRange_ = address().asSlice(org.lwjgl.vulkan.VkImageViewCreateInfo.SUBRESOURCERANGE, org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF);
			return (subresourceRange_.equals(MemorySegment.NULL)?null:(VkImageSubresourceRange)()->subresourceRange_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageViewCreateInfo from the given Arena.
		*/
		public static VkImageViewCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageViewCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageViewCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF, (mem)->(VkImageViewCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDynamicState.html">VkDynamicState</a>
	*/
	public interface VkDynamicState{
		public static final int VK_DYNAMIC_STATE_VIEWPORT = 0;

		public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4;

		public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 2;

		public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 3;

		public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8;

		public static final int VK_DYNAMIC_STATE_SCISSOR = 1;

		public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5;

		public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6;

		public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorPoolSize.html">VkDescriptorPoolSize</a>
	*/
	public interface VkDescriptorPoolSize extends io.github.kartoffell.klvulkan.Element<VkDescriptorPoolSize>{
		default VkDescriptorPoolSize type(int type){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolSize.TYPE, type);
			return this;
		}

		default int type(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolSize.TYPE);
		}

		default VkDescriptorPoolSize descriptorCount(int descriptorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolSize.DESCRIPTORCOUNT, descriptorCount);
			return this;
		}

		default int descriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolSize.DESCRIPTORCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorPoolSize from the given Arena.
		*/
		public static VkDescriptorPoolSize allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorPoolSize.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorPoolSize from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorPoolSize> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorPoolSize.SIZEOF, (mem)->(VkDescriptorPoolSize)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageMemoryBarrier.html">VkImageMemoryBarrier</a>
	*/
	public interface VkImageMemoryBarrier extends io.github.kartoffell.klvulkan.Element<VkImageMemoryBarrier>{
		default VkImageMemoryBarrier sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.STYPE);
		}

		default VkImageMemoryBarrier pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier.PNEXT);
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		default VkImageMemoryBarrier srcAccessMask(int srcAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		default int srcAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.SRCACCESSMASK);
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		default VkImageMemoryBarrier dstAccessMask(int dstAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		default int dstAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.DSTACCESSMASK);
		}

		/**
		Current layout of the image
		*/
		default VkImageMemoryBarrier oldLayout(int oldLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.OLDLAYOUT, oldLayout);
			return this;
		}

		/**
		Current layout of the image
		*/
		default int oldLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.OLDLAYOUT);
		}

		/**
		New layout to transition the image to
		*/
		default VkImageMemoryBarrier newLayout(int newLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.NEWLAYOUT, newLayout);
			return this;
		}

		/**
		New layout to transition the image to
		*/
		default int newLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.NEWLAYOUT);
		}

		/**
		Queue family to transition ownership from
		*/
		default VkImageMemoryBarrier srcQueueFamilyIndex(int srcQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX, srcQueueFamilyIndex);
			return this;
		}

		/**
		Queue family to transition ownership from
		*/
		default int srcQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX);
		}

		/**
		Queue family to transition ownership to
		*/
		default VkImageMemoryBarrier dstQueueFamilyIndex(int dstQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX, dstQueueFamilyIndex);
			return this;
		}

		/**
		Queue family to transition ownership to
		*/
		default int dstQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX);
		}

		/**
		Image to sync
		*/
		default VkImageMemoryBarrier image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		/**
		Image to sync
		*/
		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageMemoryBarrier.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		/**
		Subresource range to sync
		*/
		default VkImageSubresourceRange subresourceRange(){
			final var subresourceRange_ = address().asSlice(org.lwjgl.vulkan.VkImageMemoryBarrier.SUBRESOURCERANGE, org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF);
			return (subresourceRange_.equals(MemorySegment.NULL)?null:(VkImageSubresourceRange)()->subresourceRange_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageMemoryBarrier from the given Arena.
		*/
		public static VkImageMemoryBarrier allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageMemoryBarrier from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageMemoryBarrier> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF, (mem)->(VkImageMemoryBarrier)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentReference.html">VkAttachmentReference</a>
	*/
	public interface VkAttachmentReference extends io.github.kartoffell.klvulkan.Element<VkAttachmentReference>{
		default VkAttachmentReference attachment(int attachment){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference.ATTACHMENT, attachment);
			return this;
		}

		default int attachment(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference.ATTACHMENT);
		}

		default VkAttachmentReference layout(int layout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference.LAYOUT, layout);
			return this;
		}

		default int layout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentReference.LAYOUT);
		}

		MemorySegment address();

		/**
		Allocates a new VkAttachmentReference from the given Arena.
		*/
		public static VkAttachmentReference allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkAttachmentReference.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkAttachmentReference from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkAttachmentReference> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkAttachmentReference.SIZEOF, (mem)->(VkAttachmentReference)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueryPoolCreateFlagBits.html">VkQueryPoolCreateFlagBits</a>
	*/
	public interface VkQueryPoolCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDevice.html">VkDevice</a>
	*/
	public static class VkDevice implements io.github.kartoffell.klvulkan.Element<VkDevice>{
		protected final MemorySegment address;

		protected final VkPhysicalDevice parent;

		protected final VkCapabilitiesDevice capabilities;

		public MemorySegment address() {
			return address;
		}

		public VkPhysicalDevice parent() {
			return parent;
		}

		public VkCapabilitiesDevice capabilities() {
			return capabilities;
		}

		public VkDevice(MemorySegment address, VkPhysicalDevice parent) {
			this.address = address;
			this.parent = parent;
			this.capabilities = new VkCapabilitiesDevice(parent.capabilities.lookup("vkGetDeviceProcAddr", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)), this.address);
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateQueryPool.html">vkCreateQueryPool</a>
		*/
		public void vkCreateQueryPool(Element<VkQueryPoolCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkQueryPool>> pQueryPool) {
			if(capabilities.vkCreateQueryPool_==null) {
				capabilities.vkCreateQueryPool_ = capabilities.lookup("vkCreateQueryPool", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateQueryPool_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pQueryPool==null?MemorySegment.NULL:pQueryPool.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyImageView.html">vkDestroyImageView</a>
		*/
		public void vkDestroyImageView(@Nullable Element<? extends VkImageView> imageView, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyImageView_==null) {
				capabilities.vkDestroyImageView_ = capabilities.lookup("vkDestroyImageView", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyImageView_.invoke(address(), (imageView==null?MemorySegment.NULL:imageView.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyDevice.html">vkDestroyDevice</a>
		*/
		public void vkDestroyDevice(@Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyDevice_==null) {
				capabilities.vkDestroyDevice_ = capabilities.lookup("vkDestroyDevice", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyDevice_.invoke(address(), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkFreeDescriptorSets.html">vkFreeDescriptorSets</a>
		*/
		public void vkFreeDescriptorSets(Element<? extends VkDescriptorPool> descriptorPool, int descriptorSetCount, PointerBuffer<? extends Element<? extends VkDescriptorSet>> pDescriptorSets) {
			if(capabilities.vkFreeDescriptorSets_==null) {
				capabilities.vkFreeDescriptorSets_ = capabilities.lookup("vkFreeDescriptorSets", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkFreeDescriptorSets_.invoke(address(), (descriptorPool==null?MemorySegment.NULL:descriptorPool.address()), descriptorSetCount, (pDescriptorSets==null?MemorySegment.NULL:pDescriptorSets.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyBufferView.html">vkDestroyBufferView</a>
		*/
		public void vkDestroyBufferView(@Nullable Element<? extends VkBufferView> bufferView, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyBufferView_==null) {
				capabilities.vkDestroyBufferView_ = capabilities.lookup("vkDestroyBufferView", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyBufferView_.invoke(address(), (bufferView==null?MemorySegment.NULL:bufferView.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetImageSparseMemoryRequirements.html">vkGetImageSparseMemoryRequirements</a>
		*/
		public void vkGetImageSparseMemoryRequirements(Element<? extends VkImage> image, IntBuffer pSparseMemoryRequirementCount, @Nullable Element<VkSparseImageMemoryRequirements> pSparseMemoryRequirements) {
			if(capabilities.vkGetImageSparseMemoryRequirements_==null) {
				capabilities.vkGetImageSparseMemoryRequirements_ = capabilities.lookup("vkGetImageSparseMemoryRequirements", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetImageSparseMemoryRequirements_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), (pSparseMemoryRequirementCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pSparseMemoryRequirementCount)), (pSparseMemoryRequirements==null?MemorySegment.NULL:pSparseMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_EVENT_SET} {@link VkResult#VK_EVENT_RESET} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetEventStatus.html">vkGetEventStatus</a>
		*/
		public int vkGetEventStatus(Element<? extends VkEvent> event) {
			if(capabilities.vkGetEventStatus_==null) {
				capabilities.vkGetEventStatus_ = capabilities.lookup("vkGetEventStatus", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkGetEventStatus_.invoke(address(), (event==null?MemorySegment.NULL:event.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceQueue.html">vkGetDeviceQueue</a>
		*/
		public void vkGetDeviceQueue(int queueFamilyIndex, int queueIndex, PointerBuffer<? extends Element<? extends VkQueue>> pQueue) {
			if(capabilities.vkGetDeviceQueue_==null) {
				capabilities.vkGetDeviceQueue_ = capabilities.lookup("vkGetDeviceQueue", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceQueue_.invoke(address(), queueFamilyIndex, queueIndex, (pQueue==null?MemorySegment.NULL:pQueue.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkSetEvent.html">vkSetEvent</a>
		*/
		public void vkSetEvent(Element<? extends VkEvent> event) {
			if(capabilities.vkSetEvent_==null) {
				capabilities.vkSetEvent_ = capabilities.lookup("vkSetEvent", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkSetEvent_.invoke(address(), (event==null?MemorySegment.NULL:event.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetBufferMemoryRequirements.html">vkGetBufferMemoryRequirements</a>
		*/
		public void vkGetBufferMemoryRequirements(Element<? extends VkBuffer> buffer, Element<VkMemoryRequirements> pMemoryRequirements) {
			if(capabilities.vkGetBufferMemoryRequirements_==null) {
				capabilities.vkGetBufferMemoryRequirements_ = capabilities.lookup("vkGetBufferMemoryRequirements", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetBufferMemoryRequirements_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), (pMemoryRequirements==null?MemorySegment.NULL:pMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetRenderAreaGranularity.html">vkGetRenderAreaGranularity</a>
		*/
		public void vkGetRenderAreaGranularity(Element<? extends VkRenderPass> renderPass, Element<VkExtent2D> pGranularity) {
			if(capabilities.vkGetRenderAreaGranularity_==null) {
				capabilities.vkGetRenderAreaGranularity_ = capabilities.lookup("vkGetRenderAreaGranularity", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetRenderAreaGranularity_.invoke(address(), (renderPass==null?MemorySegment.NULL:renderPass.address()), (pGranularity==null?MemorySegment.NULL:pGranularity.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkMergePipelineCaches.html">vkMergePipelineCaches</a>
		*/
		public void vkMergePipelineCaches(Element<? extends VkPipelineCache> dstCache, int srcCacheCount, PointerBuffer<? extends Element<? extends VkPipelineCache>> pSrcCaches) {
			if(capabilities.vkMergePipelineCaches_==null) {
				capabilities.vkMergePipelineCaches_ = capabilities.lookup("vkMergePipelineCaches", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkMergePipelineCaches_.invoke(address(), (dstCache==null?MemorySegment.NULL:dstCache.address()), srcCacheCount, (pSrcCaches==null?MemorySegment.NULL:pSrcCaches.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyFence.html">vkDestroyFence</a>
		*/
		public void vkDestroyFence(@Nullable Element<? extends VkFence> fence, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyFence_==null) {
				capabilities.vkDestroyFence_ = capabilities.lookup("vkDestroyFence", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyFence_.invoke(address(), (fence==null?MemorySegment.NULL:fence.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_MEMORY_MAP_FAILED ->{@value VkResult#VK_ERROR_MEMORY_MAP_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkMapMemory.html">vkMapMemory</a>
		*/
		public void vkMapMemory(Element<? extends VkDeviceMemory> memory, long offset, long size, @Nullable int flags, PointerBuffer<? extends MemorySegment> ppData) {
			if(capabilities.vkMapMemory_==null) {
				capabilities.vkMapMemory_ = capabilities.lookup("vkMapMemory", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkMapMemory_.invoke(address(), (memory==null?MemorySegment.NULL:memory.address()), offset, size, flags, (ppData==null?MemorySegment.NULL:ppData.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceMemoryCommitment.html">vkGetDeviceMemoryCommitment</a>
		*/
		public void vkGetDeviceMemoryCommitment(Element<? extends VkDeviceMemory> memory, LongBuffer pCommittedMemoryInBytes) {
			if(capabilities.vkGetDeviceMemoryCommitment_==null) {
				capabilities.vkGetDeviceMemoryCommitment_ = capabilities.lookup("vkGetDeviceMemoryCommitment", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetDeviceMemoryCommitment_.invoke(address(), (memory==null?MemorySegment.NULL:memory.address()), (pCommittedMemoryInBytes==null?MemorySegment.NULL:MemorySegment.ofBuffer(pCommittedMemoryInBytes)));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyFramebuffer.html">vkDestroyFramebuffer</a>
		*/
		public void vkDestroyFramebuffer(@Nullable Element<? extends VkFramebuffer> framebuffer, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyFramebuffer_==null) {
				capabilities.vkDestroyFramebuffer_ = capabilities.lookup("vkDestroyFramebuffer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyFramebuffer_.invoke(address(), (framebuffer==null?MemorySegment.NULL:framebuffer.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetImageSubresourceLayout.html">vkGetImageSubresourceLayout</a>
		*/
		public void vkGetImageSubresourceLayout(Element<? extends VkImage> image, Element<VkImageSubresource> pSubresource, Element<VkSubresourceLayout> pLayout) {
			if(capabilities.vkGetImageSubresourceLayout_==null) {
				capabilities.vkGetImageSubresourceLayout_ = capabilities.lookup("vkGetImageSubresourceLayout", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetImageSubresourceLayout_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), (pSubresource==null?MemorySegment.NULL:pSubresource.address()), (pLayout==null?MemorySegment.NULL:pLayout.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyPipelineCache.html">vkDestroyPipelineCache</a>
		*/
		public void vkDestroyPipelineCache(@Nullable Element<? extends VkPipelineCache> pipelineCache, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyPipelineCache_==null) {
				capabilities.vkDestroyPipelineCache_ = capabilities.lookup("vkDestroyPipelineCache", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyPipelineCache_.invoke(address(), (pipelineCache==null?MemorySegment.NULL:pipelineCache.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyEvent.html">vkDestroyEvent</a>
		*/
		public void vkDestroyEvent(@Nullable Element<? extends VkEvent> event, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyEvent_==null) {
				capabilities.vkDestroyEvent_ = capabilities.lookup("vkDestroyEvent", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyEvent_.invoke(address(), (event==null?MemorySegment.NULL:event.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkFlushMappedMemoryRanges.html">vkFlushMappedMemoryRanges</a>
		*/
		public void vkFlushMappedMemoryRanges(int memoryRangeCount, Element<VkMappedMemoryRange> pMemoryRanges) {
			if(capabilities.vkFlushMappedMemoryRanges_==null) {
				capabilities.vkFlushMappedMemoryRanges_ = capabilities.lookup("vkFlushMappedMemoryRanges", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkFlushMappedMemoryRanges_.invoke(address(), memoryRangeCount, (pMemoryRanges==null?MemorySegment.NULL:pMemoryRanges.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS}  or any of [VK_PIPELINE_COMPILE_REQUIRED_EXT], <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_SHADER_NV, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateGraphicsPipelines.html">vkCreateGraphicsPipelines</a>
		*/
		public int vkCreateGraphicsPipelines(@Nullable Element<? extends VkPipelineCache> pipelineCache, int createInfoCount, Element<VkGraphicsPipelineCreateInfo> pCreateInfos, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkPipeline>> pPipelines) {
			if(capabilities.vkCreateGraphicsPipelines_==null) {
				capabilities.vkCreateGraphicsPipelines_ = capabilities.lookup("vkCreateGraphicsPipelines", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateGraphicsPipelines_.invoke(address(), (pipelineCache==null?MemorySegment.NULL:pipelineCache.address()), createInfoCount, (pCreateInfos==null?MemorySegment.NULL:pCreateInfos.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pPipelines==null?MemorySegment.NULL:pPipelines.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_FRAGMENTATION_EXT, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateDescriptorPool.html">vkCreateDescriptorPool</a>
		*/
		public void vkCreateDescriptorPool(Element<VkDescriptorPoolCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkDescriptorPool>> pDescriptorPool) {
			if(capabilities.vkCreateDescriptorPool_==null) {
				capabilities.vkCreateDescriptorPool_ = capabilities.lookup("vkCreateDescriptorPool", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateDescriptorPool_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pDescriptorPool==null?MemorySegment.NULL:pDescriptorPool.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateSampler.html">vkCreateSampler</a>
		*/
		public void vkCreateSampler(Element<VkSamplerCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkSampler>> pSampler) {
			if(capabilities.vkCreateSampler_==null) {
				capabilities.vkCreateSampler_ = capabilities.lookup("vkCreateSampler", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateSampler_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pSampler==null?MemorySegment.NULL:pSampler.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateEvent.html">vkCreateEvent</a>
		*/
		public void vkCreateEvent(Element<VkEventCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkEvent>> pEvent) {
			if(capabilities.vkCreateEvent_==null) {
				capabilities.vkCreateEvent_ = capabilities.lookup("vkCreateEvent", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateEvent_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pEvent==null?MemorySegment.NULL:pEvent.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroySemaphore.html">vkDestroySemaphore</a>
		*/
		public void vkDestroySemaphore(@Nullable Element<? extends VkSemaphore> semaphore, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroySemaphore_==null) {
				capabilities.vkDestroySemaphore_ = capabilities.lookup("vkDestroySemaphore", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroySemaphore_.invoke(address(), (semaphore==null?MemorySegment.NULL:semaphore.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDeviceWaitIdle.html">vkDeviceWaitIdle</a>
		*/
		public void vkDeviceWaitIdle() {
			if(capabilities.vkDeviceWaitIdle_==null) {
				capabilities.vkDeviceWaitIdle_ = capabilities.lookup("vkDeviceWaitIdle", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkDeviceWaitIdle_.invoke(address());
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreatePipelineCache.html">vkCreatePipelineCache</a>
		*/
		public void vkCreatePipelineCache(Element<VkPipelineCacheCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkPipelineCache>> pPipelineCache) {
			if(capabilities.vkCreatePipelineCache_==null) {
				capabilities.vkCreatePipelineCache_ = capabilities.lookup("vkCreatePipelineCache", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreatePipelineCache_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pPipelineCache==null?MemorySegment.NULL:pPipelineCache.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkInvalidateMappedMemoryRanges.html">vkInvalidateMappedMemoryRanges</a>
		*/
		public void vkInvalidateMappedMemoryRanges(int memoryRangeCount, Element<VkMappedMemoryRange> pMemoryRanges) {
			if(capabilities.vkInvalidateMappedMemoryRanges_==null) {
				capabilities.vkInvalidateMappedMemoryRanges_ = capabilities.lookup("vkInvalidateMappedMemoryRanges", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkInvalidateMappedMemoryRanges_.invoke(address(), memoryRangeCount, (pMemoryRanges==null?MemorySegment.NULL:pMemoryRanges.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkAllocateCommandBuffers.html">vkAllocateCommandBuffers</a>
		*/
		public void vkAllocateCommandBuffers(Element<VkCommandBufferAllocateInfo> pAllocateInfo, PointerBuffer<? extends Element<? extends VkCommandBuffer>> pCommandBuffers) {
			if(capabilities.vkAllocateCommandBuffers_==null) {
				capabilities.vkAllocateCommandBuffers_ = capabilities.lookup("vkAllocateCommandBuffers", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkAllocateCommandBuffers_.invoke(address(), (pAllocateInfo==null?MemorySegment.NULL:pAllocateInfo.address()), (pCommandBuffers==null?MemorySegment.NULL:pCommandBuffers.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreatePipelineLayout.html">vkCreatePipelineLayout</a>
		*/
		public void vkCreatePipelineLayout(Element<VkPipelineLayoutCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkPipelineLayout>> pPipelineLayout) {
			if(capabilities.vkCreatePipelineLayout_==null) {
				capabilities.vkCreatePipelineLayout_ = capabilities.lookup("vkCreatePipelineLayout", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreatePipelineLayout_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pPipelineLayout==null?MemorySegment.NULL:pPipelineLayout.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyRenderPass.html">vkDestroyRenderPass</a>
		*/
		public void vkDestroyRenderPass(@Nullable Element<? extends VkRenderPass> renderPass, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyRenderPass_==null) {
				capabilities.vkDestroyRenderPass_ = capabilities.lookup("vkDestroyRenderPass", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyRenderPass_.invoke(address(), (renderPass==null?MemorySegment.NULL:renderPass.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateFramebuffer.html">vkCreateFramebuffer</a>
		*/
		public void vkCreateFramebuffer(Element<VkFramebufferCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkFramebuffer>> pFramebuffer) {
			if(capabilities.vkCreateFramebuffer_==null) {
				capabilities.vkCreateFramebuffer_ = capabilities.lookup("vkCreateFramebuffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateFramebuffer_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pFramebuffer==null?MemorySegment.NULL:pFramebuffer.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkResetCommandPool.html">vkResetCommandPool</a>
		*/
		public void vkResetCommandPool(Element<? extends VkCommandPool> commandPool, @Nullable int flags) {
			if(capabilities.vkResetCommandPool_==null) {
				capabilities.vkResetCommandPool_ = capabilities.lookup("vkResetCommandPool", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				final var return_ = (int) capabilities.vkResetCommandPool_.invoke(address(), (commandPool==null?MemorySegment.NULL:commandPool.address()), flags);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateDescriptorSetLayout.html">vkCreateDescriptorSetLayout</a>
		*/
		public void vkCreateDescriptorSetLayout(Element<VkDescriptorSetLayoutCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkDescriptorSetLayout>> pSetLayout) {
			if(capabilities.vkCreateDescriptorSetLayout_==null) {
				capabilities.vkCreateDescriptorSetLayout_ = capabilities.lookup("vkCreateDescriptorSetLayout", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateDescriptorSetLayout_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pSetLayout==null?MemorySegment.NULL:pSetLayout.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkFreeCommandBuffers.html">vkFreeCommandBuffers</a>
		*/
		public void vkFreeCommandBuffers(Element<? extends VkCommandPool> commandPool, int commandBufferCount, PointerBuffer<? extends Element<? extends VkCommandBuffer>> pCommandBuffers) {
			if(capabilities.vkFreeCommandBuffers_==null) {
				capabilities.vkFreeCommandBuffers_ = capabilities.lookup("vkFreeCommandBuffers", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkFreeCommandBuffers_.invoke(address(), (commandPool==null?MemorySegment.NULL:commandPool.address()), commandBufferCount, (pCommandBuffers==null?MemorySegment.NULL:pCommandBuffers.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyPipelineLayout.html">vkDestroyPipelineLayout</a>
		*/
		public void vkDestroyPipelineLayout(@Nullable Element<? extends VkPipelineLayout> pipelineLayout, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyPipelineLayout_==null) {
				capabilities.vkDestroyPipelineLayout_ = capabilities.lookup("vkDestroyPipelineLayout", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyPipelineLayout_.invoke(address(), (pipelineLayout==null?MemorySegment.NULL:pipelineLayout.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_NOT_READY} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetQueryPoolResults.html">vkGetQueryPoolResults</a>
		*/
		public int vkGetQueryPoolResults(Element<? extends VkQueryPool> queryPool, int firstQuery, int queryCount, long dataSize, MemorySegment pData, long stride, @Nullable int flags) {
			if(capabilities.vkGetQueryPoolResults_==null) {
				capabilities.vkGetQueryPoolResults_ = capabilities.lookup("vkGetQueryPoolResults", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
			}
			try {
				final var return_ = (int) capabilities.vkGetQueryPoolResults_.invoke(address(), (queryPool==null?MemorySegment.NULL:queryPool.address()), firstQuery, queryCount, MemorySegment.ofAddress(dataSize), pData, stride, flags);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyCommandPool.html">vkDestroyCommandPool</a>
		*/
		public void vkDestroyCommandPool(@Nullable Element<? extends VkCommandPool> commandPool, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyCommandPool_==null) {
				capabilities.vkDestroyCommandPool_ = capabilities.lookup("vkDestroyCommandPool", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyCommandPool_.invoke(address(), (commandPool==null?MemorySegment.NULL:commandPool.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkBindImageMemory.html">vkBindImageMemory</a>
		*/
		public void vkBindImageMemory(Element<? extends VkImage> image, Element<? extends VkDeviceMemory> memory, long memoryOffset) {
			if(capabilities.vkBindImageMemory_==null) {
				capabilities.vkBindImageMemory_ = capabilities.lookup("vkBindImageMemory", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
			}
			try {
				final var return_ = (int) capabilities.vkBindImageMemory_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), (memory==null?MemorySegment.NULL:memory.address()), memoryOffset);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_TIMEOUT} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkWaitForFences.html">vkWaitForFences</a>
		*/
		public int vkWaitForFences(int fenceCount, PointerBuffer<? extends Element<? extends VkFence>> pFences, boolean waitAll, long timeout) {
			if(capabilities.vkWaitForFences_==null) {
				capabilities.vkWaitForFences_ = capabilities.lookup("vkWaitForFences", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
			}
			try {
				final var return_ = (int) capabilities.vkWaitForFences_.invoke(address(), fenceCount, (pFences==null?MemorySegment.NULL:pFences.address()), waitAll?1:0, timeout);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateRenderPass.html">vkCreateRenderPass</a>
		*/
		public void vkCreateRenderPass(Element<VkRenderPassCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkRenderPass>> pRenderPass) {
			if(capabilities.vkCreateRenderPass_==null) {
				capabilities.vkCreateRenderPass_ = capabilities.lookup("vkCreateRenderPass", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateRenderPass_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pRenderPass==null?MemorySegment.NULL:pRenderPass.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_EXTERNAL_HANDLE, VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkAllocateMemory.html">vkAllocateMemory</a>
		*/
		public void vkAllocateMemory(Element<VkMemoryAllocateInfo> pAllocateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkDeviceMemory>> pMemory) {
			if(capabilities.vkAllocateMemory_==null) {
				capabilities.vkAllocateMemory_ = capabilities.lookup("vkAllocateMemory", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkAllocateMemory_.invoke(address(), (pAllocateInfo==null?MemorySegment.NULL:pAllocateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pMemory==null?MemorySegment.NULL:pMemory.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateFence.html">vkCreateFence</a>
		*/
		public void vkCreateFence(Element<VkFenceCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkFence>> pFence) {
			if(capabilities.vkCreateFence_==null) {
				capabilities.vkCreateFence_ = capabilities.lookup("vkCreateFence", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateFence_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pFence==null?MemorySegment.NULL:pFence.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkBindBufferMemory.html">vkBindBufferMemory</a>
		*/
		public void vkBindBufferMemory(Element<? extends VkBuffer> buffer, Element<? extends VkDeviceMemory> memory, long memoryOffset) {
			if(capabilities.vkBindBufferMemory_==null) {
				capabilities.vkBindBufferMemory_ = capabilities.lookup("vkBindBufferMemory", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
			}
			try {
				final var return_ = (int) capabilities.vkBindBufferMemory_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), (memory==null?MemorySegment.NULL:memory.address()), memoryOffset);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateImageView.html">vkCreateImageView</a>
		*/
		public void vkCreateImageView(Element<VkImageViewCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkImageView>> pView) {
			if(capabilities.vkCreateImageView_==null) {
				capabilities.vkCreateImageView_ = capabilities.lookup("vkCreateImageView", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateImageView_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pView==null?MemorySegment.NULL:pView.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkResetDescriptorPool.html">vkResetDescriptorPool</a>
		*/
		public void vkResetDescriptorPool(Element<? extends VkDescriptorPool> descriptorPool, @Nullable int flags) {
			if(capabilities.vkResetDescriptorPool_==null) {
				capabilities.vkResetDescriptorPool_ = capabilities.lookup("vkResetDescriptorPool", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				final var return_ = (int) capabilities.vkResetDescriptorPool_.invoke(address(), (descriptorPool==null?MemorySegment.NULL:descriptorPool.address()), flags);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_SHADER_NV, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateShaderModule.html">vkCreateShaderModule</a>
		*/
		public void vkCreateShaderModule(Element<VkShaderModuleCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkShaderModule>> pShaderModule) {
			if(capabilities.vkCreateShaderModule_==null) {
				capabilities.vkCreateShaderModule_ = capabilities.lookup("vkCreateShaderModule", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateShaderModule_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pShaderModule==null?MemorySegment.NULL:pShaderModule.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_FRAGMENTED_POOL ->{@value VkResult#VK_ERROR_FRAGMENTED_POOL}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_OUT_OF_POOL_MEMORY, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkAllocateDescriptorSets.html">vkAllocateDescriptorSets</a>
		*/
		public void vkAllocateDescriptorSets(Element<VkDescriptorSetAllocateInfo> pAllocateInfo, PointerBuffer<? extends Element<? extends VkDescriptorSet>> pDescriptorSets) {
			if(capabilities.vkAllocateDescriptorSets_==null) {
				capabilities.vkAllocateDescriptorSets_ = capabilities.lookup("vkAllocateDescriptorSets", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkAllocateDescriptorSets_.invoke(address(), (pAllocateInfo==null?MemorySegment.NULL:pAllocateInfo.address()), (pDescriptorSets==null?MemorySegment.NULL:pDescriptorSets.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_NOT_READY} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetFenceStatus.html">vkGetFenceStatus</a>
		*/
		public int vkGetFenceStatus(Element<? extends VkFence> fence) {
			if(capabilities.vkGetFenceStatus_==null) {
				capabilities.vkGetFenceStatus_ = capabilities.lookup("vkGetFenceStatus", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkGetFenceStatus_.invoke(address(), (fence==null?MemorySegment.NULL:fence.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateSemaphore.html">vkCreateSemaphore</a>
		*/
		public void vkCreateSemaphore(Element<VkSemaphoreCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkSemaphore>> pSemaphore) {
			if(capabilities.vkCreateSemaphore_==null) {
				capabilities.vkCreateSemaphore_ = capabilities.lookup("vkCreateSemaphore", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateSemaphore_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pSemaphore==null?MemorySegment.NULL:pSemaphore.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyDescriptorPool.html">vkDestroyDescriptorPool</a>
		*/
		public void vkDestroyDescriptorPool(@Nullable Element<? extends VkDescriptorPool> descriptorPool, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyDescriptorPool_==null) {
				capabilities.vkDestroyDescriptorPool_ = capabilities.lookup("vkDestroyDescriptorPool", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyDescriptorPool_.invoke(address(), (descriptorPool==null?MemorySegment.NULL:descriptorPool.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateBuffer.html">vkCreateBuffer</a>
		*/
		public void vkCreateBuffer(Element<VkBufferCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkBuffer>> pBuffer) {
			if(capabilities.vkCreateBuffer_==null) {
				capabilities.vkCreateBuffer_ = capabilities.lookup("vkCreateBuffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateBuffer_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pBuffer==null?MemorySegment.NULL:pBuffer.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetImageMemoryRequirements.html">vkGetImageMemoryRequirements</a>
		*/
		public void vkGetImageMemoryRequirements(Element<? extends VkImage> image, Element<VkMemoryRequirements> pMemoryRequirements) {
			if(capabilities.vkGetImageMemoryRequirements_==null) {
				capabilities.vkGetImageMemoryRequirements_ = capabilities.lookup("vkGetImageMemoryRequirements", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetImageMemoryRequirements_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), (pMemoryRequirements==null?MemorySegment.NULL:pMemoryRequirements.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkUpdateDescriptorSets.html">vkUpdateDescriptorSets</a>
		*/
		public void vkUpdateDescriptorSets(@Nullable int descriptorWriteCount, Element<VkWriteDescriptorSet> pDescriptorWrites, @Nullable int descriptorCopyCount, Element<VkCopyDescriptorSet> pDescriptorCopies) {
			if(capabilities.vkUpdateDescriptorSets_==null) {
				capabilities.vkUpdateDescriptorSets_ = capabilities.lookup("vkUpdateDescriptorSets", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkUpdateDescriptorSets_.invoke(address(), descriptorWriteCount, (pDescriptorWrites==null?MemorySegment.NULL:pDescriptorWrites.address()), descriptorCopyCount, (pDescriptorCopies==null?MemorySegment.NULL:pDescriptorCopies.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkFreeMemory.html">vkFreeMemory</a>
		*/
		public void vkFreeMemory(@Nullable Element<? extends VkDeviceMemory> memory, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkFreeMemory_==null) {
				capabilities.vkFreeMemory_ = capabilities.lookup("vkFreeMemory", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkFreeMemory_.invoke(address(), (memory==null?MemorySegment.NULL:memory.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS}  or any of [VK_PIPELINE_COMPILE_REQUIRED_EXT], <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_SHADER_NV, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateComputePipelines.html">vkCreateComputePipelines</a>
		*/
		public int vkCreateComputePipelines(@Nullable Element<? extends VkPipelineCache> pipelineCache, int createInfoCount, Element<VkComputePipelineCreateInfo> pCreateInfos, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkPipeline>> pPipelines) {
			if(capabilities.vkCreateComputePipelines_==null) {
				capabilities.vkCreateComputePipelines_ = capabilities.lookup("vkCreateComputePipelines", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateComputePipelines_.invoke(address(), (pipelineCache==null?MemorySegment.NULL:pipelineCache.address()), createInfoCount, (pCreateInfos==null?MemorySegment.NULL:pCreateInfos.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pPipelines==null?MemorySegment.NULL:pPipelines.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyPipeline.html">vkDestroyPipeline</a>
		*/
		public void vkDestroyPipeline(@Nullable Element<? extends VkPipeline> pipeline, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyPipeline_==null) {
				capabilities.vkDestroyPipeline_ = capabilities.lookup("vkDestroyPipeline", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyPipeline_.invoke(address(), (pipeline==null?MemorySegment.NULL:pipeline.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkResetFences.html">vkResetFences</a>
		*/
		public void vkResetFences(int fenceCount, PointerBuffer<? extends Element<? extends VkFence>> pFences) {
			if(capabilities.vkResetFences_==null) {
				capabilities.vkResetFences_ = capabilities.lookup("vkResetFences", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkResetFences_.invoke(address(), fenceCount, (pFences==null?MemorySegment.NULL:pFences.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkUnmapMemory.html">vkUnmapMemory</a>
		*/
		public void vkUnmapMemory(Element<? extends VkDeviceMemory> memory) {
			if(capabilities.vkUnmapMemory_==null) {
				capabilities.vkUnmapMemory_ = capabilities.lookup("vkUnmapMemory", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkUnmapMemory_.invoke(address(), (memory==null?MemorySegment.NULL:memory.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateCommandPool.html">vkCreateCommandPool</a>
		*/
		public void vkCreateCommandPool(Element<VkCommandPoolCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkCommandPool>> pCommandPool) {
			if(capabilities.vkCreateCommandPool_==null) {
				capabilities.vkCreateCommandPool_ = capabilities.lookup("vkCreateCommandPool", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateCommandPool_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pCommandPool==null?MemorySegment.NULL:pCommandPool.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateBufferView.html">vkCreateBufferView</a>
		*/
		public void vkCreateBufferView(Element<VkBufferViewCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkBufferView>> pView) {
			if(capabilities.vkCreateBufferView_==null) {
				capabilities.vkCreateBufferView_ = capabilities.lookup("vkCreateBufferView", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateBufferView_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pView==null?MemorySegment.NULL:pView.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPipelineCacheData.html">vkGetPipelineCacheData</a>
		*/
		public int vkGetPipelineCacheData(Element<? extends VkPipelineCache> pipelineCache, ByteBuffer pDataSize, @Nullable MemorySegment pData) {
			if(capabilities.vkGetPipelineCacheData_==null) {
				capabilities.vkGetPipelineCacheData_ = capabilities.lookup("vkGetPipelineCacheData", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkGetPipelineCacheData_.invoke(address(), (pipelineCache==null?MemorySegment.NULL:pipelineCache.address()), (pDataSize==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDataSize)), pData);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyShaderModule.html">vkDestroyShaderModule</a>
		*/
		public void vkDestroyShaderModule(@Nullable Element<? extends VkShaderModule> shaderModule, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyShaderModule_==null) {
				capabilities.vkDestroyShaderModule_ = capabilities.lookup("vkDestroyShaderModule", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyShaderModule_.invoke(address(), (shaderModule==null?MemorySegment.NULL:shaderModule.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_COMPRESSION_EXHAUSTED_EXT, VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateImage.html">vkCreateImage</a>
		*/
		public void vkCreateImage(Element<VkImageCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkImage>> pImage) {
			if(capabilities.vkCreateImage_==null) {
				capabilities.vkCreateImage_ = capabilities.lookup("vkCreateImage", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateImage_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pImage==null?MemorySegment.NULL:pImage.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyDescriptorSetLayout.html">vkDestroyDescriptorSetLayout</a>
		*/
		public void vkDestroyDescriptorSetLayout(@Nullable Element<? extends VkDescriptorSetLayout> descriptorSetLayout, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyDescriptorSetLayout_==null) {
				capabilities.vkDestroyDescriptorSetLayout_ = capabilities.lookup("vkDestroyDescriptorSetLayout", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyDescriptorSetLayout_.invoke(address(), (descriptorSetLayout==null?MemorySegment.NULL:descriptorSetLayout.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return (PFN_vkVoidFunction)
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetDeviceProcAddr.html">vkGetDeviceProcAddr</a>
		*/
		public Element<? extends PFN_vkVoidFunction> vkGetDeviceProcAddr(CString pName) {
			if(capabilities.vkGetDeviceProcAddr_==null) {
				capabilities.vkGetDeviceProcAddr_ = capabilities.lookup("vkGetDeviceProcAddr", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (MemorySegment) capabilities.vkGetDeviceProcAddr_.invoke(address(), pName==null?MemorySegment.NULL:pName.address());
				return (return_.equals(MemorySegment.NULL)?null:(Element<? extends PFN_vkVoidFunction>)()->return_);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyQueryPool.html">vkDestroyQueryPool</a>
		*/
		public void vkDestroyQueryPool(@Nullable Element<? extends VkQueryPool> queryPool, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyQueryPool_==null) {
				capabilities.vkDestroyQueryPool_ = capabilities.lookup("vkDestroyQueryPool", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyQueryPool_.invoke(address(), (queryPool==null?MemorySegment.NULL:queryPool.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyBuffer.html">vkDestroyBuffer</a>
		*/
		public void vkDestroyBuffer(@Nullable Element<? extends VkBuffer> buffer, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyBuffer_==null) {
				capabilities.vkDestroyBuffer_ = capabilities.lookup("vkDestroyBuffer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyBuffer_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkResetEvent.html">vkResetEvent</a>
		*/
		public void vkResetEvent(Element<? extends VkEvent> event) {
			if(capabilities.vkResetEvent_==null) {
				capabilities.vkResetEvent_ = capabilities.lookup("vkResetEvent", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkResetEvent_.invoke(address(), (event==null?MemorySegment.NULL:event.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyImage.html">vkDestroyImage</a>
		*/
		public void vkDestroyImage(@Nullable Element<? extends VkImage> image, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyImage_==null) {
				capabilities.vkDestroyImage_ = capabilities.lookup("vkDestroyImage", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyImage_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroySampler.html">vkDestroySampler</a>
		*/
		public void vkDestroySampler(@Nullable Element<? extends VkSampler> sampler, @Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroySampler_==null) {
				capabilities.vkDestroySampler_ = capabilities.lookup("vkDestroySampler", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroySampler_.invoke(address(), (sampler==null?MemorySegment.NULL:sampler.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		protected VkBufferView VkBufferView(MemorySegment mem, Object parent) {
			return new VkBufferView(mem, (VkDevice) parent);
		}

		protected VkImage VkImage(MemorySegment mem, Object parent) {
			return new VkImage(mem, (VkDevice) parent);
		}

		protected VkDescriptorPool VkDescriptorPool(MemorySegment mem, Object parent) {
			return new VkDescriptorPool(mem, (VkDevice) parent);
		}

		protected VkFence VkFence(MemorySegment mem, Object parent) {
			return new VkFence(mem, (VkDevice) parent);
		}

		protected VkDescriptorSet VkDescriptorSet(MemorySegment mem, Object parent) {
			return new VkDescriptorSet(mem, (VkDescriptorPool) parent);
		}

		protected VkImageView VkImageView(MemorySegment mem, Object parent) {
			return new VkImageView(mem, (VkDevice) parent);
		}

		protected VkEvent VkEvent(MemorySegment mem, Object parent) {
			return new VkEvent(mem, (VkDevice) parent);
		}

		protected VkBuffer VkBuffer(MemorySegment mem, Object parent) {
			return new VkBuffer(mem, (VkDevice) parent);
		}

		protected VkQueryPool VkQueryPool(MemorySegment mem, Object parent) {
			return new VkQueryPool(mem, (VkDevice) parent);
		}

		protected VkFramebuffer VkFramebuffer(MemorySegment mem, Object parent) {
			return new VkFramebuffer(mem, (VkDevice) parent);
		}

		protected VkDescriptorSetLayout VkDescriptorSetLayout(MemorySegment mem, Object parent) {
			return new VkDescriptorSetLayout(mem, (VkDevice) parent);
		}

		protected VkPipelineCache VkPipelineCache(MemorySegment mem, Object parent) {
			return new VkPipelineCache(mem, (VkDevice) parent);
		}

		protected VkCommandBuffer VkCommandBuffer(MemorySegment mem, Object parent) {
			return new VkCommandBuffer(mem, (VkCommandPool) parent);
		}

		protected VkSemaphore VkSemaphore(MemorySegment mem, Object parent) {
			return new VkSemaphore(mem, (VkDevice) parent);
		}

		protected VkQueue VkQueue(MemorySegment mem, Object parent) {
			return new VkQueue(mem, (VkDevice) parent);
		}

		protected VkSampler VkSampler(MemorySegment mem, Object parent) {
			return new VkSampler(mem, (VkDevice) parent);
		}

		protected VkDevice VkDevice(MemorySegment mem, Object parent) {
			return new VkDevice(mem, (VkPhysicalDevice) parent);
		}

		protected VkPipeline VkPipeline(MemorySegment mem, Object parent) {
			return new VkPipeline(mem, (VkDevice) parent);
		}

		protected VkPipelineLayout VkPipelineLayout(MemorySegment mem, Object parent) {
			return new VkPipelineLayout(mem, (VkDevice) parent);
		}

		protected VkShaderModule VkShaderModule(MemorySegment mem, Object parent) {
			return new VkShaderModule(mem, (VkDevice) parent);
		}

		protected VkRenderPass VkRenderPass(MemorySegment mem, Object parent) {
			return new VkRenderPass(mem, (VkDevice) parent);
		}

		protected VkDeviceMemory VkDeviceMemory(MemorySegment mem, Object parent) {
			return new VkDeviceMemory(mem, (VkDevice) parent);
		}

		protected VkCommandPool VkCommandPool(MemorySegment mem, Object parent) {
			return new VkCommandPool(mem, (VkDevice) parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkOffset3D.html">VkOffset3D</a>
	*/
	public interface VkOffset3D extends io.github.kartoffell.klvulkan.Element<VkOffset3D>{
		default VkOffset3D x(int x){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset3D.X, x);
			return this;
		}

		default int x(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset3D.X);
		}

		default VkOffset3D y(int y){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset3D.Y, y);
			return this;
		}

		default int y(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset3D.Y);
		}

		default VkOffset3D z(int z){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset3D.Z, z);
			return this;
		}

		default int z(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkOffset3D.Z);
		}

		MemorySegment address();

		/**
		Allocates a new VkOffset3D from the given Arena.
		*/
		public static VkOffset3D allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkOffset3D from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkOffset3D> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkOffset3D.SIZEOF, (mem)->(VkOffset3D)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceLimits.html">VkPhysicalDeviceLimits</a>
	*/
	public interface VkPhysicalDeviceLimits extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceLimits>{
		/**
		max 1D image dimension
		*/
		default int maxImageDimension1D(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXIMAGEDIMENSION1D);
		}

		/**
		max 2D image dimension
		*/
		default int maxImageDimension2D(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXIMAGEDIMENSION2D);
		}

		/**
		max 3D image dimension
		*/
		default int maxImageDimension3D(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXIMAGEDIMENSION3D);
		}

		/**
		max cube map image dimension
		*/
		default int maxImageDimensionCube(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXIMAGEDIMENSIONCUBE);
		}

		/**
		max layers for image arrays
		*/
		default int maxImageArrayLayers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXIMAGEARRAYLAYERS);
		}

		/**
		max texel buffer size (fstexels)
		*/
		default int maxTexelBufferElements(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTEXELBUFFERELEMENTS);
		}

		/**
		max uniform buffer range (bytes)
		*/
		default int maxUniformBufferRange(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXUNIFORMBUFFERRANGE);
		}

		/**
		max storage buffer range (bytes)
		*/
		default int maxStorageBufferRange(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXSTORAGEBUFFERRANGE);
		}

		/**
		max size of the push constants pool (bytes)
		*/
		default int maxPushConstantsSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPUSHCONSTANTSSIZE);
		}

		/**
		max number of device memory allocations supported
		*/
		default int maxMemoryAllocationCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXMEMORYALLOCATIONCOUNT);
		}

		/**
		max number of samplers that can be allocated on a device
		*/
		default int maxSamplerAllocationCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXSAMPLERALLOCATIONCOUNT);
		}

		/**
		Granularity (in bytes) at which buffers and images can be bound to adjacent memory for simultaneous usage
		*/
		default long bufferImageGranularity(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.BUFFERIMAGEGRANULARITY);
		}

		/**
		Total address space available for sparse allocations (bytes)
		*/
		default long sparseAddressSpaceSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SPARSEADDRESSSPACESIZE);
		}

		/**
		max number of descriptors sets that can be bound to a pipeline
		*/
		default int maxBoundDescriptorSets(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXBOUNDDESCRIPTORSETS);
		}

		/**
		max number of samplers allowed per-stage in a descriptor set
		*/
		default int maxPerStageDescriptorSamplers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLERS);
		}

		/**
		max number of uniform buffers allowed per-stage in a descriptor set
		*/
		default int maxPerStageDescriptorUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS);
		}

		/**
		max number of storage buffers allowed per-stage in a descriptor set
		*/
		default int maxPerStageDescriptorStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS);
		}

		/**
		max number of sampled images allowed per-stage in a descriptor set
		*/
		default int maxPerStageDescriptorSampledImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES);
		}

		/**
		max number of storage images allowed per-stage in a descriptor set
		*/
		default int maxPerStageDescriptorStorageImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEIMAGES);
		}

		/**
		max number of input attachments allowed per-stage in a descriptor set
		*/
		default int maxPerStageDescriptorInputAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS);
		}

		/**
		max number of resources allowed by a single stage
		*/
		default int maxPerStageResources(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXPERSTAGERESOURCES);
		}

		/**
		max number of samplers allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetSamplers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLERS);
		}

		/**
		max number of uniform buffers allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetUniformBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERS);
		}

		/**
		max number of dynamic uniform buffers allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetUniformBuffersDynamic(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC);
		}

		/**
		max number of storage buffers allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetStorageBuffers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERS);
		}

		/**
		max number of dynamic storage buffers allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetStorageBuffersDynamic(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC);
		}

		/**
		max number of sampled images allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetSampledImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLEDIMAGES);
		}

		/**
		max number of storage images allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetStorageImages(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEIMAGES);
		}

		/**
		max number of input attachments allowed in all stages in a descriptor set
		*/
		default int maxDescriptorSetInputAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDESCRIPTORSETINPUTATTACHMENTS);
		}

		/**
		max number of vertex input attribute slots
		*/
		default int maxVertexInputAttributes(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTES);
		}

		/**
		max number of vertex input binding slots
		*/
		default int maxVertexInputBindings(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGS);
		}

		/**
		max vertex input attribute offset added to vertex buffer offset
		*/
		default int maxVertexInputAttributeOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTEOFFSET);
		}

		/**
		max vertex input binding stride
		*/
		default int maxVertexInputBindingStride(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGSTRIDE);
		}

		/**
		max number of output components written by vertex shader
		*/
		default int maxVertexOutputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXVERTEXOUTPUTCOMPONENTS);
		}

		/**
		max level supported by tessellation primitive generator
		*/
		default int maxTessellationGenerationLevel(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONGENERATIONLEVEL);
		}

		/**
		max patch size (vertices)
		*/
		default int maxTessellationPatchSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONPATCHSIZE);
		}

		/**
		max number of input components per-vertex in TCS
		*/
		default int maxTessellationControlPerVertexInputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS);
		}

		/**
		max number of output components per-vertex in TCS
		*/
		default int maxTessellationControlPerVertexOutputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS);
		}

		/**
		max number of output components per-patch in TCS
		*/
		default int maxTessellationControlPerPatchOutputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS);
		}

		/**
		max total number of per-vertex and per-patch output components in TCS
		*/
		default int maxTessellationControlTotalOutputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS);
		}

		/**
		max number of input components per vertex in TES
		*/
		default int maxTessellationEvaluationInputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS);
		}

		/**
		max number of output components per vertex in TES
		*/
		default int maxTessellationEvaluationOutputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS);
		}

		/**
		max invocation count supported in geometry shader
		*/
		default int maxGeometryShaderInvocations(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXGEOMETRYSHADERINVOCATIONS);
		}

		/**
		max number of input components read in geometry stage
		*/
		default int maxGeometryInputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXGEOMETRYINPUTCOMPONENTS);
		}

		/**
		max number of output components written in geometry stage
		*/
		default int maxGeometryOutputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTCOMPONENTS);
		}

		/**
		max number of vertices that can be emitted in geometry stage
		*/
		default int maxGeometryOutputVertices(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTVERTICES);
		}

		/**
		max total number of components (all vertices) written in geometry stage
		*/
		default int maxGeometryTotalOutputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXGEOMETRYTOTALOUTPUTCOMPONENTS);
		}

		/**
		max number of input components read in fragment stage
		*/
		default int maxFragmentInputComponents(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXFRAGMENTINPUTCOMPONENTS);
		}

		/**
		max number of output attachments written in fragment stage
		*/
		default int maxFragmentOutputAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXFRAGMENTOUTPUTATTACHMENTS);
		}

		/**
		max number of output attachments written when using dual source blending
		*/
		default int maxFragmentDualSrcAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXFRAGMENTDUALSRCATTACHMENTS);
		}

		/**
		max total number of storage buffers, storage images and output buffers
		*/
		default int maxFragmentCombinedOutputResources(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXFRAGMENTCOMBINEDOUTPUTRESOURCES);
		}

		/**
		max total storage size of work group local storage (bytes)
		*/
		default int maxComputeSharedMemorySize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCOMPUTESHAREDMEMORYSIZE);
		}

		/**
		max num of compute work groups that may be dispatched by a single command (x,y,z)
		*/
		default IntBuffer maxComputeWorkGroupCount(){
			final var maxComputeWorkGroupCount_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPCOUNT, 4*3);
			return (maxComputeWorkGroupCount_.equals(MemorySegment.NULL)?null:maxComputeWorkGroupCount_.asByteBuffer().asIntBuffer());
		}

		/**
		max total compute invocations in a single local work group
		*/
		default int maxComputeWorkGroupInvocations(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPINVOCATIONS);
		}

		/**
		max local size of a compute work group (x,y,z)
		*/
		default IntBuffer maxComputeWorkGroupSize(){
			final var maxComputeWorkGroupSize_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPSIZE, 4*3);
			return (maxComputeWorkGroupSize_.equals(MemorySegment.NULL)?null:maxComputeWorkGroupSize_.asByteBuffer().asIntBuffer());
		}

		/**
		number bits of subpixel precision in screen x and y
		*/
		default int subPixelPrecisionBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SUBPIXELPRECISIONBITS);
		}

		/**
		number bits of precision for selecting texel weights
		*/
		default int subTexelPrecisionBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SUBTEXELPRECISIONBITS);
		}

		/**
		number bits of precision for selecting mipmap weights
		*/
		default int mipmapPrecisionBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MIPMAPPRECISIONBITS);
		}

		/**
		max index value for indexed draw calls (for 32-bit indices)
		*/
		default int maxDrawIndexedIndexValue(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDRAWINDEXEDINDEXVALUE);
		}

		/**
		max draw count for indirect drawing calls
		*/
		default int maxDrawIndirectCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXDRAWINDIRECTCOUNT);
		}

		/**
		max absolute sampler LOD bias
		*/
		default float maxSamplerLodBias(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXSAMPLERLODBIAS);
		}

		/**
		max degree of sampler anisotropy
		*/
		default float maxSamplerAnisotropy(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXSAMPLERANISOTROPY);
		}

		/**
		max number of active viewports
		*/
		default int maxViewports(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXVIEWPORTS);
		}

		/**
		max viewport dimensions (x,y)
		*/
		default IntBuffer maxViewportDimensions(){
			final var maxViewportDimensions_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXVIEWPORTDIMENSIONS, 4*2);
			return (maxViewportDimensions_.equals(MemorySegment.NULL)?null:maxViewportDimensions_.asByteBuffer().asIntBuffer());
		}

		/**
		viewport bounds range (min,max)
		*/
		default FloatBuffer viewportBoundsRange(){
			final var viewportBoundsRange_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceLimits.VIEWPORTBOUNDSRANGE, 4*2);
			return (viewportBoundsRange_.equals(MemorySegment.NULL)?null:viewportBoundsRange_.asByteBuffer().asFloatBuffer());
		}

		/**
		number bits of subpixel precision for viewport
		*/
		default int viewportSubPixelBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.VIEWPORTSUBPIXELBITS);
		}

		/**
		min required alignment of pointers returned by MapMemory (bytes)
		*/
		default long minMemoryMapAlignment(){
			final var minMemoryMapAlignment_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MINMEMORYMAPALIGNMENT);
			return minMemoryMapAlignment_.address();
		}

		/**
		min required alignment for texel buffer offsets (bytes)
		*/
		default long minTexelBufferOffsetAlignment(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MINTEXELBUFFEROFFSETALIGNMENT);
		}

		/**
		min required alignment for uniform buffer sizes and offsets (bytes)
		*/
		default long minUniformBufferOffsetAlignment(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MINUNIFORMBUFFEROFFSETALIGNMENT);
		}

		/**
		min required alignment for storage buffer offsets (bytes)
		*/
		default long minStorageBufferOffsetAlignment(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MINSTORAGEBUFFEROFFSETALIGNMENT);
		}

		/**
		min texel offset for OpTextureSampleOffset
		*/
		default int minTexelOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MINTEXELOFFSET);
		}

		/**
		max texel offset for OpTextureSampleOffset
		*/
		default int maxTexelOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTEXELOFFSET);
		}

		/**
		min texel offset for OpTextureGatherOffset
		*/
		default int minTexelGatherOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MINTEXELGATHEROFFSET);
		}

		/**
		max texel offset for OpTextureGatherOffset
		*/
		default int maxTexelGatherOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXTEXELGATHEROFFSET);
		}

		/**
		furthest negative offset for interpolateAtOffset
		*/
		default float minInterpolationOffset(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MININTERPOLATIONOFFSET);
		}

		/**
		furthest positive offset for interpolateAtOffset
		*/
		default float maxInterpolationOffset(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXINTERPOLATIONOFFSET);
		}

		/**
		number of subpixel bits for interpolateAtOffset
		*/
		default int subPixelInterpolationOffsetBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SUBPIXELINTERPOLATIONOFFSETBITS);
		}

		/**
		max width for a framebuffer
		*/
		default int maxFramebufferWidth(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXFRAMEBUFFERWIDTH);
		}

		/**
		max height for a framebuffer
		*/
		default int maxFramebufferHeight(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXFRAMEBUFFERHEIGHT);
		}

		/**
		max layer count for a layered framebuffer
		*/
		default int maxFramebufferLayers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXFRAMEBUFFERLAYERS);
		}

		/**
		supported color sample counts for a framebuffer
		*/
		@Nullable
		default int framebufferColorSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.FRAMEBUFFERCOLORSAMPLECOUNTS);
		}

		/**
		supported depth sample counts for a framebuffer
		*/
		@Nullable
		default int framebufferDepthSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.FRAMEBUFFERDEPTHSAMPLECOUNTS);
		}

		/**
		supported stencil sample counts for a framebuffer
		*/
		@Nullable
		default int framebufferStencilSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.FRAMEBUFFERSTENCILSAMPLECOUNTS);
		}

		/**
		supported sample counts for a subpass which uses no attachments
		*/
		@Nullable
		default int framebufferNoAttachmentsSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS);
		}

		/**
		max number of color attachments per subpass
		*/
		default int maxColorAttachments(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCOLORATTACHMENTS);
		}

		/**
		supported color sample counts for a non-integer sampled image
		*/
		@Nullable
		default int sampledImageColorSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SAMPLEDIMAGECOLORSAMPLECOUNTS);
		}

		/**
		supported sample counts for an integer image
		*/
		@Nullable
		default int sampledImageIntegerSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SAMPLEDIMAGEINTEGERSAMPLECOUNTS);
		}

		/**
		supported depth sample counts for a sampled image
		*/
		@Nullable
		default int sampledImageDepthSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SAMPLEDIMAGEDEPTHSAMPLECOUNTS);
		}

		/**
		supported stencil sample counts for a sampled image
		*/
		@Nullable
		default int sampledImageStencilSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SAMPLEDIMAGESTENCILSAMPLECOUNTS);
		}

		/**
		supported sample counts for a storage image
		*/
		@Nullable
		default int storageImageSampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.STORAGEIMAGESAMPLECOUNTS);
		}

		/**
		max number of sample mask words
		*/
		default int maxSampleMaskWords(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXSAMPLEMASKWORDS);
		}

		/**
		timestamps on graphics and compute queues
		*/
		default boolean timestampComputeAndGraphics(){
			final var timestampComputeAndGraphics_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.TIMESTAMPCOMPUTEANDGRAPHICS);
			return timestampComputeAndGraphics_!=0;
		}

		/**
		number of nanoseconds it takes for timestamp query value to increment by 1
		*/
		default float timestampPeriod(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.TIMESTAMPPERIOD);
		}

		/**
		max number of clip distances
		*/
		default int maxClipDistances(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCLIPDISTANCES);
		}

		/**
		max number of cull distances
		*/
		default int maxCullDistances(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCULLDISTANCES);
		}

		/**
		max combined number of user clipping
		*/
		default int maxCombinedClipAndCullDistances(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.MAXCOMBINEDCLIPANDCULLDISTANCES);
		}

		/**
		distinct queue priorities available
		*/
		default int discreteQueuePriorities(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.DISCRETEQUEUEPRIORITIES);
		}

		/**
		range (min,max) of supported point sizes
		*/
		default FloatBuffer pointSizeRange(){
			final var pointSizeRange_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceLimits.POINTSIZERANGE, 4*2);
			return (pointSizeRange_.equals(MemorySegment.NULL)?null:pointSizeRange_.asByteBuffer().asFloatBuffer());
		}

		/**
		range (min,max) of supported line widths
		*/
		default FloatBuffer lineWidthRange(){
			final var lineWidthRange_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceLimits.LINEWIDTHRANGE, 4*2);
			return (lineWidthRange_.equals(MemorySegment.NULL)?null:lineWidthRange_.asByteBuffer().asFloatBuffer());
		}

		/**
		granularity of supported point sizes
		*/
		default float pointSizeGranularity(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.POINTSIZEGRANULARITY);
		}

		/**
		granularity of supported line widths
		*/
		default float lineWidthGranularity(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.LINEWIDTHGRANULARITY);
		}

		/**
		line rasterization follows preferred rules
		*/
		default boolean strictLines(){
			final var strictLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.STRICTLINES);
			return strictLines_!=0;
		}

		/**
		supports standard sample locations for all supported sample counts
		*/
		default boolean standardSampleLocations(){
			final var standardSampleLocations_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceLimits.STANDARDSAMPLELOCATIONS);
			return standardSampleLocations_!=0;
		}

		/**
		optimal offset of buffer copies
		*/
		default long optimalBufferCopyOffsetAlignment(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYOFFSETALIGNMENT);
		}

		/**
		optimal pitch of buffer copies
		*/
		default long optimalBufferCopyRowPitchAlignment(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYROWPITCHALIGNMENT);
		}

		/**
		minimum size and alignment for non-coherent host-mapped device memory access
		*/
		default long nonCoherentAtomSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkPhysicalDeviceLimits.NONCOHERENTATOMSIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceLimits from the given Arena.
		*/
		public static VkPhysicalDeviceLimits allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceLimits.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceLimits from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceLimits> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SIZEOF, (mem)->(VkPhysicalDeviceLimits)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkVertexInputAttributeDescription.html">VkVertexInputAttributeDescription</a>
	*/
	public interface VkVertexInputAttributeDescription extends io.github.kartoffell.klvulkan.Element<VkVertexInputAttributeDescription>{
		/**
		location of the shader vertex attrib
		*/
		default VkVertexInputAttributeDescription location(int location){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.LOCATION, location);
			return this;
		}

		/**
		location of the shader vertex attrib
		*/
		default int location(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.LOCATION);
		}

		/**
		Vertex buffer binding id
		*/
		default VkVertexInputAttributeDescription binding(int binding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.BINDING, binding);
			return this;
		}

		/**
		Vertex buffer binding id
		*/
		default int binding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.BINDING);
		}

		/**
		format of source data
		*/
		default VkVertexInputAttributeDescription format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.FORMAT, format);
			return this;
		}

		/**
		format of source data
		*/
		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.FORMAT);
		}

		/**
		Offset of first element in bytes from base of vertex
		*/
		default VkVertexInputAttributeDescription offset(int offset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.OFFSET, offset);
			return this;
		}

		/**
		Offset of first element in bytes from base of vertex
		*/
		default int offset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputAttributeDescription.OFFSET);
		}

		MemorySegment address();

		/**
		Allocates a new VkVertexInputAttributeDescription from the given Arena.
		*/
		public static VkVertexInputAttributeDescription allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkVertexInputAttributeDescription.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkVertexInputAttributeDescription from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkVertexInputAttributeDescription> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkVertexInputAttributeDescription.SIZEOF, (mem)->(VkVertexInputAttributeDescription)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueueFlagBits.html">VkQueueFlagBits</a>
	*/
	public interface VkQueueFlagBits{
		public static final int VK_QUEUE_GRAPHICS_BIT = 1;

		public static final int VK_QUEUE_TRANSFER_BIT = 4;

		public static final int VK_QUEUE_COMPUTE_BIT = 2;

		public static final int VK_QUEUE_SPARSE_BINDING_BIT = 8;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPassBeginInfo.html">VkRenderPassBeginInfo</a>
	*/
	public interface VkRenderPassBeginInfo extends io.github.kartoffell.klvulkan.Element<VkRenderPassBeginInfo>{
		default VkRenderPassBeginInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassBeginInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassBeginInfo.STYPE);
		}

		default VkRenderPassBeginInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.PNEXT);
		}

		default VkRenderPassBeginInfo renderPass(Element<? extends VkRenderPass> renderPass){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERPASS, (renderPass==null?MemorySegment.NULL:renderPass.address()));
			return this;
		}

		default Element<? extends VkRenderPass> renderPass(){
			final var renderPass_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERPASS);
			return (renderPass_.equals(MemorySegment.NULL)?null:(Element<? extends VkRenderPass>)()->renderPass_);
		}

		default VkRenderPassBeginInfo framebuffer(Element<? extends VkFramebuffer> framebuffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.FRAMEBUFFER, (framebuffer==null?MemorySegment.NULL:framebuffer.address()));
			return this;
		}

		default Element<? extends VkFramebuffer> framebuffer(){
			final var framebuffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.FRAMEBUFFER);
			return (framebuffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkFramebuffer>)()->framebuffer_);
		}

		default VkRect2D renderArea(){
			final var renderArea_ = address().asSlice(org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERAREA, org.lwjgl.vulkan.VkRect2D.SIZEOF);
			return (renderArea_.equals(MemorySegment.NULL)?null:(VkRect2D)()->renderArea_);
		}

		default VkRenderPassBeginInfo clearValueCount(int clearValueCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassBeginInfo.CLEARVALUECOUNT, clearValueCount);
			return this;
		}

		@Nullable
		default int clearValueCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassBeginInfo.CLEARVALUECOUNT);
		}

		default VkRenderPassBeginInfo pClearValues(Element<VkClearValue> pClearValues){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.PCLEARVALUES, (pClearValues==null?MemorySegment.NULL:pClearValues.address()));
			return this;
		}

		default Element<VkClearValue> pClearValues(){
			final var pClearValues_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassBeginInfo.PCLEARVALUES);
			return (pClearValues_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pClearValues_, org.lwjgl.vulkan.VkClearValue.SIZEOF, (v1105628551)->(v1105628551.equals(MemorySegment.NULL)?null:(VkClearValue)()->v1105628551)));
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderPassBeginInfo from the given Arena.
		*/
		public static VkRenderPassBeginInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderPassBeginInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderPassBeginInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF, (mem)->(VkRenderPassBeginInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineLayout.html">VkPipelineLayout</a>
	*/
	public static record VkPipelineLayout(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkPipelineLayout>{
		public static PointerBuffer<? extends VkPipelineLayout> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkPipelineLayout(mem, parent)); //VkPipelineLayout
		}

		public static PointerBuffer<? extends VkPipelineLayout> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkClearValue.html">VkClearValue</a>
	*/
	public interface VkClearValue extends io.github.kartoffell.klvulkan.Element<VkClearValue>{
		default VkClearColorValue color(){
			final var color_ = address().asSlice(org.lwjgl.vulkan.VkClearValue.COLOR, org.lwjgl.vulkan.VkClearColorValue.SIZEOF);
			return (color_.equals(MemorySegment.NULL)?null:(VkClearColorValue)()->color_);
		}

		default VkClearDepthStencilValue depthStencil(){
			final var depthStencil_ = address().asSlice(org.lwjgl.vulkan.VkClearValue.DEPTHSTENCIL, org.lwjgl.vulkan.VkClearDepthStencilValue.SIZEOF);
			return (depthStencil_.equals(MemorySegment.NULL)?null:(VkClearDepthStencilValue)()->depthStencil_);
		}

		MemorySegment address();

		public static VkClearValue allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkClearValue.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkClearValue> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkClearValue.SIZEOF, (mem)->(VkClearValue)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageFormatProperties.html">VkSparseImageFormatProperties</a>
	*/
	public interface VkSparseImageFormatProperties extends io.github.kartoffell.klvulkan.Element<VkSparseImageFormatProperties>{
		@Nullable
		default int aspectMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageFormatProperties.ASPECTMASK);
		}

		default VkExtent3D imageGranularity(){
			final var imageGranularity_ = address().asSlice(org.lwjgl.vulkan.VkSparseImageFormatProperties.IMAGEGRANULARITY, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (imageGranularity_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->imageGranularity_);
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageFormatProperties.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkSparseImageFormatProperties from the given Arena.
		*/
		public static VkSparseImageFormatProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseImageFormatProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSparseImageFormatProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSparseImageFormatProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseImageFormatProperties.SIZEOF, (mem)->(VkSparseImageFormatProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPass.html">VkRenderPass</a>
	*/
	public static record VkRenderPass(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkRenderPass>{
		public static PointerBuffer<? extends VkRenderPass> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkRenderPass(mem, parent)); //VkRenderPass
		}

		public static PointerBuffer<? extends VkRenderPass> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerCreateInfo.html">VkSamplerCreateInfo</a>
	*/
	public interface VkSamplerCreateInfo extends io.github.kartoffell.klvulkan.Element<VkSamplerCreateInfo>{
		default VkSamplerCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.STYPE);
		}

		default VkSamplerCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSamplerCreateInfo.PNEXT);
		}

		default VkSamplerCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.FLAGS);
		}

		/**
		Filter mode for magnification
		*/
		default VkSamplerCreateInfo magFilter(int magFilter){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.MAGFILTER, magFilter);
			return this;
		}

		/**
		Filter mode for magnification
		*/
		default int magFilter(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.MAGFILTER);
		}

		/**
		Filter mode for minifiation
		*/
		default VkSamplerCreateInfo minFilter(int minFilter){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.MINFILTER, minFilter);
			return this;
		}

		/**
		Filter mode for minifiation
		*/
		default int minFilter(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.MINFILTER);
		}

		/**
		Mipmap selection mode
		*/
		default VkSamplerCreateInfo mipmapMode(int mipmapMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.MIPMAPMODE, mipmapMode);
			return this;
		}

		/**
		Mipmap selection mode
		*/
		default int mipmapMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.MIPMAPMODE);
		}

		default VkSamplerCreateInfo addressModeU(int addressModeU){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEU, addressModeU);
			return this;
		}

		default int addressModeU(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEU);
		}

		default VkSamplerCreateInfo addressModeV(int addressModeV){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEV, addressModeV);
			return this;
		}

		default int addressModeV(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEV);
		}

		default VkSamplerCreateInfo addressModeW(int addressModeW){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEW, addressModeW);
			return this;
		}

		default int addressModeW(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEW);
		}

		default VkSamplerCreateInfo mipLodBias(float mipLodBias){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MIPLODBIAS, mipLodBias);
			return this;
		}

		default float mipLodBias(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MIPLODBIAS);
		}

		default VkSamplerCreateInfo anisotropyEnable(boolean anisotropyEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ANISOTROPYENABLE, anisotropyEnable?1:0);
			return this;
		}

		default boolean anisotropyEnable(){
			final var anisotropyEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.ANISOTROPYENABLE);
			return anisotropyEnable_!=0;
		}

		default VkSamplerCreateInfo maxAnisotropy(float maxAnisotropy){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MAXANISOTROPY, maxAnisotropy);
			return this;
		}

		default float maxAnisotropy(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MAXANISOTROPY);
		}

		default VkSamplerCreateInfo compareEnable(boolean compareEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREENABLE, compareEnable?1:0);
			return this;
		}

		default boolean compareEnable(){
			final var compareEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREENABLE);
			return compareEnable_!=0;
		}

		default VkSamplerCreateInfo compareOp(int compareOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREOP, compareOp);
			return this;
		}

		default int compareOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREOP);
		}

		default VkSamplerCreateInfo minLod(float minLod){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MINLOD, minLod);
			return this;
		}

		default float minLod(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MINLOD);
		}

		default VkSamplerCreateInfo maxLod(float maxLod){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MAXLOD, maxLod);
			return this;
		}

		default float maxLod(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkSamplerCreateInfo.MAXLOD);
		}

		default VkSamplerCreateInfo borderColor(int borderColor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.BORDERCOLOR, borderColor);
			return this;
		}

		default int borderColor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.BORDERCOLOR);
		}

		default VkSamplerCreateInfo unnormalizedCoordinates(boolean unnormalizedCoordinates){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES, unnormalizedCoordinates?1:0);
			return this;
		}

		default boolean unnormalizedCoordinates(){
			final var unnormalizedCoordinates_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES);
			return unnormalizedCoordinates_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkSamplerCreateInfo from the given Arena.
		*/
		public static VkSamplerCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSamplerCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSamplerCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF, (mem)->(VkSamplerCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetLayoutCreateInfo.html">VkDescriptorSetLayoutCreateInfo</a>
	*/
	public interface VkDescriptorSetLayoutCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorSetLayoutCreateInfo>{
		default VkDescriptorSetLayoutCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.STYPE);
		}

		default VkDescriptorSetLayoutCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.PNEXT);
		}

		default VkDescriptorSetLayoutCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.FLAGS);
		}

		/**
		Number of bindings in the descriptor set layout
		*/
		default VkDescriptorSetLayoutCreateInfo bindingCount(int bindingCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT, bindingCount);
			return this;
		}

		/**
		Number of bindings in the descriptor set layout
		*/
		@Nullable
		default int bindingCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT);
		}

		/**
		Array of descriptor set layout bindings
		*/
		default VkDescriptorSetLayoutCreateInfo pBindings(Element<VkDescriptorSetLayoutBinding> pBindings){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.PBINDINGS, (pBindings==null?MemorySegment.NULL:pBindings.address()));
			return this;
		}

		/**
		Array of descriptor set layout bindings
		*/
		default Element<VkDescriptorSetLayoutBinding> pBindings(){
			final var pBindings_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.PBINDINGS);
			return (pBindings_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pBindings_, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.SIZEOF, (v1241480588)->(v1241480588.equals(MemorySegment.NULL)?null:(VkDescriptorSetLayoutBinding)()->v1241480588)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorSetLayoutCreateInfo from the given Arena.
		*/
		public static VkDescriptorSetLayoutCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorSetLayoutCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorSetLayoutCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.SIZEOF, (mem)->(VkDescriptorSetLayoutCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageViewCreateFlagBits.html">VkImageViewCreateFlagBits</a>
	*/
	public interface VkImageViewCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFormatFeatureFlagBits.html">VkFormatFeatureFlagBits</a>
	*/
	public interface VkFormatFeatureFlagBits{
		public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 2048;

		public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32;

		public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 1024;

		public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096;

		public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 2;

		public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 128;

		public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 512;

		public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 8;

		public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 1;

		public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 64;

		public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 4;

		public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 16;

		public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 256;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkClearDepthStencilValue.html">VkClearDepthStencilValue</a>
	*/
	public interface VkClearDepthStencilValue extends io.github.kartoffell.klvulkan.Element<VkClearDepthStencilValue>{
		default VkClearDepthStencilValue depth(float depth){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkClearDepthStencilValue.DEPTH, depth);
			return this;
		}

		default float depth(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkClearDepthStencilValue.DEPTH);
		}

		default VkClearDepthStencilValue stencil(int stencil){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearDepthStencilValue.STENCIL, stencil);
			return this;
		}

		default int stencil(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearDepthStencilValue.STENCIL);
		}

		MemorySegment address();

		/**
		Allocates a new VkClearDepthStencilValue from the given Arena.
		*/
		public static VkClearDepthStencilValue allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkClearDepthStencilValue.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkClearDepthStencilValue from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkClearDepthStencilValue> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkClearDepthStencilValue.SIZEOF, (mem)->(VkClearDepthStencilValue)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCopyDescriptorSet.html">VkCopyDescriptorSet</a>
	*/
	public interface VkCopyDescriptorSet extends io.github.kartoffell.klvulkan.Element<VkCopyDescriptorSet>{
		default VkCopyDescriptorSet sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.STYPE);
		}

		default VkCopyDescriptorSet pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyDescriptorSet.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyDescriptorSet.PNEXT);
		}

		/**
		Source descriptor set
		*/
		default VkCopyDescriptorSet srcSet(Element<? extends VkDescriptorSet> srcSet){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyDescriptorSet.SRCSET, (srcSet==null?MemorySegment.NULL:srcSet.address()));
			return this;
		}

		/**
		Source descriptor set
		*/
		default Element<? extends VkDescriptorSet> srcSet(){
			final var srcSet_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyDescriptorSet.SRCSET);
			return (srcSet_.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorSet>)()->srcSet_);
		}

		/**
		Binding within the source descriptor set to copy from
		*/
		default VkCopyDescriptorSet srcBinding(int srcBinding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.SRCBINDING, srcBinding);
			return this;
		}

		/**
		Binding within the source descriptor set to copy from
		*/
		default int srcBinding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.SRCBINDING);
		}

		/**
		Array element within the source binding to copy from
		*/
		default VkCopyDescriptorSet srcArrayElement(int srcArrayElement){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.SRCARRAYELEMENT, srcArrayElement);
			return this;
		}

		/**
		Array element within the source binding to copy from
		*/
		default int srcArrayElement(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.SRCARRAYELEMENT);
		}

		/**
		Destination descriptor set
		*/
		default VkCopyDescriptorSet dstSet(Element<? extends VkDescriptorSet> dstSet){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyDescriptorSet.DSTSET, (dstSet==null?MemorySegment.NULL:dstSet.address()));
			return this;
		}

		/**
		Destination descriptor set
		*/
		default Element<? extends VkDescriptorSet> dstSet(){
			final var dstSet_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCopyDescriptorSet.DSTSET);
			return (dstSet_.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorSet>)()->dstSet_);
		}

		/**
		Binding within the destination descriptor set to copy to
		*/
		default VkCopyDescriptorSet dstBinding(int dstBinding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.DSTBINDING, dstBinding);
			return this;
		}

		/**
		Binding within the destination descriptor set to copy to
		*/
		default int dstBinding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.DSTBINDING);
		}

		/**
		Array element within the destination binding to copy to
		*/
		default VkCopyDescriptorSet dstArrayElement(int dstArrayElement){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.DSTARRAYELEMENT, dstArrayElement);
			return this;
		}

		/**
		Array element within the destination binding to copy to
		*/
		default int dstArrayElement(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.DSTARRAYELEMENT);
		}

		/**
		Number of descriptors to write (determines the size of the array pointed by pDescriptors)
		*/
		default VkCopyDescriptorSet descriptorCount(int descriptorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.DESCRIPTORCOUNT, descriptorCount);
			return this;
		}

		/**
		Number of descriptors to write (determines the size of the array pointed by pDescriptors)
		*/
		default int descriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCopyDescriptorSet.DESCRIPTORCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkCopyDescriptorSet from the given Arena.
		*/
		public static VkCopyDescriptorSet allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCopyDescriptorSet from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCopyDescriptorSet> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF, (mem)->(VkCopyDescriptorSet)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageSubresourceRange.html">VkImageSubresourceRange</a>
	*/
	public interface VkImageSubresourceRange extends io.github.kartoffell.klvulkan.Element<VkImageSubresourceRange>{
		default VkImageSubresourceRange aspectMask(int aspectMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.ASPECTMASK, aspectMask);
			return this;
		}

		default int aspectMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.ASPECTMASK);
		}

		default VkImageSubresourceRange baseMipLevel(int baseMipLevel){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.BASEMIPLEVEL, baseMipLevel);
			return this;
		}

		default int baseMipLevel(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.BASEMIPLEVEL);
		}

		default VkImageSubresourceRange levelCount(int levelCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.LEVELCOUNT, levelCount);
			return this;
		}

		default int levelCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.LEVELCOUNT);
		}

		default VkImageSubresourceRange baseArrayLayer(int baseArrayLayer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.BASEARRAYLAYER, baseArrayLayer);
			return this;
		}

		default int baseArrayLayer(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.BASEARRAYLAYER);
		}

		default VkImageSubresourceRange layerCount(int layerCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.LAYERCOUNT, layerCount);
			return this;
		}

		default int layerCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceRange.LAYERCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageSubresourceRange from the given Arena.
		*/
		public static VkImageSubresourceRange allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageSubresourceRange from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageSubresourceRange> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF, (mem)->(VkImageSubresourceRange)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCullModeFlagBits.html">VkCullModeFlagBits</a>
	*/
	public interface VkCullModeFlagBits{
		public static final int VK_CULL_MODE_NONE = 1;

		public static final int VK_CULL_MODE_FRONT_BIT = 1;

		public static final int VK_CULL_MODE_BACK_BIT = 2;

		public static final int VK_CULL_MODE_FRONT_AND_BACK = 8;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceSparseProperties.html">VkPhysicalDeviceSparseProperties</a>
	*/
	public interface VkPhysicalDeviceSparseProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceSparseProperties>{
		/**
		Sparse resources support: GPU will access all 2D (single sample) sparse resources using the standard sparse image block shapes (based on pixel format)
		*/
		default boolean residencyStandard2DBlockShape(){
			final var residencyStandard2DBlockShape_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DBLOCKSHAPE);
			return residencyStandard2DBlockShape_!=0;
		}

		/**
		Sparse resources support: GPU will access all 2D (multisample) sparse resources using the standard sparse image block shapes (based on pixel format)
		*/
		default boolean residencyStandard2DMultisampleBlockShape(){
			final var residencyStandard2DMultisampleBlockShape_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE);
			return residencyStandard2DMultisampleBlockShape_!=0;
		}

		/**
		Sparse resources support: GPU will access all 3D sparse resources using the standard sparse image block shapes (based on pixel format)
		*/
		default boolean residencyStandard3DBlockShape(){
			final var residencyStandard3DBlockShape_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD3DBLOCKSHAPE);
			return residencyStandard3DBlockShape_!=0;
		}

		/**
		Sparse resources support: Images with mip level dimensions that are NOT a multiple of the sparse image block dimensions will be placed in the mip tail
		*/
		default boolean residencyAlignedMipSize(){
			final var residencyAlignedMipSize_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.RESIDENCYALIGNEDMIPSIZE);
			return residencyAlignedMipSize_!=0;
		}

		/**
		Sparse resources support: GPU can consistently access non-resident regions of a resource, all reads return as if data is 0, writes are discarded
		*/
		default boolean residencyNonResidentStrict(){
			final var residencyNonResidentStrict_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.RESIDENCYNONRESIDENTSTRICT);
			return residencyNonResidentStrict_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceSparseProperties from the given Arena.
		*/
		public static VkPhysicalDeviceSparseProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceSparseProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceSparseProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.SIZEOF, (mem)->(VkPhysicalDeviceSparseProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassDependency.html">VkSubpassDependency</a>
	*/
	public interface VkSubpassDependency extends io.github.kartoffell.klvulkan.Element<VkSubpassDependency>{
		default VkSubpassDependency srcSubpass(int srcSubpass){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.SRCSUBPASS, srcSubpass);
			return this;
		}

		default int srcSubpass(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.SRCSUBPASS);
		}

		default VkSubpassDependency dstSubpass(int dstSubpass){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DSTSUBPASS, dstSubpass);
			return this;
		}

		default int dstSubpass(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DSTSUBPASS);
		}

		default VkSubpassDependency srcStageMask(int srcStageMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.SRCSTAGEMASK, srcStageMask);
			return this;
		}

		@Nullable
		default int srcStageMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.SRCSTAGEMASK);
		}

		default VkSubpassDependency dstStageMask(int dstStageMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DSTSTAGEMASK, dstStageMask);
			return this;
		}

		@Nullable
		default int dstStageMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DSTSTAGEMASK);
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		default VkSubpassDependency srcAccessMask(int srcAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		@Nullable
		default int srcAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.SRCACCESSMASK);
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		default VkSubpassDependency dstAccessMask(int dstAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		@Nullable
		default int dstAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DSTACCESSMASK);
		}

		default VkSubpassDependency dependencyFlags(int dependencyFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DEPENDENCYFLAGS, dependencyFlags);
			return this;
		}

		@Nullable
		default int dependencyFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubpassDependency.DEPENDENCYFLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkSubpassDependency from the given Arena.
		*/
		public static VkSubpassDependency allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubpassDependency.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubpassDependency from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubpassDependency> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubpassDependency.SIZEOF, (mem)->(VkSubpassDependency)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageMemoryBind.html">VkSparseImageMemoryBind</a>
	*/
	public interface VkSparseImageMemoryBind extends io.github.kartoffell.klvulkan.Element<VkSparseImageMemoryBind>{
		default VkImageSubresource subresource(){
			final var subresource_ = address().asSlice(org.lwjgl.vulkan.VkSparseImageMemoryBind.SUBRESOURCE, org.lwjgl.vulkan.VkImageSubresource.SIZEOF);
			return (subresource_.equals(MemorySegment.NULL)?null:(VkImageSubresource)()->subresource_);
		}

		default VkOffset3D offset(){
			final var offset_ = address().asSlice(org.lwjgl.vulkan.VkSparseImageMemoryBind.OFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (offset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->offset_);
		}

		default VkExtent3D extent(){
			final var extent_ = address().asSlice(org.lwjgl.vulkan.VkSparseImageMemoryBind.EXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (extent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->extent_);
		}

		default VkSparseImageMemoryBind memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageMemoryBind.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageMemoryBind.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		/**
		Specified in bytes
		*/
		default VkSparseImageMemoryBind memoryOffset(long memoryOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseImageMemoryBind.MEMORYOFFSET, memoryOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long memoryOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseImageMemoryBind.MEMORYOFFSET);
		}

		default VkSparseImageMemoryBind flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageMemoryBind.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageMemoryBind.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkSparseImageMemoryBind from the given Arena.
		*/
		public static VkSparseImageMemoryBind allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseImageMemoryBind.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSparseImageMemoryBind from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSparseImageMemoryBind> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseImageMemoryBind.SIZEOF, (mem)->(VkSparseImageMemoryBind)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassDescriptionFlagBits.html">VkSubpassDescriptionFlagBits</a>
	*/
	public interface VkSubpassDescriptionFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineBindPoint.html">VkPipelineBindPoint</a>
	*/
	public interface VkPipelineBindPoint{
		public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;

		public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceFeatures.html">VkPhysicalDeviceFeatures</a>
	*/
	public interface VkPhysicalDeviceFeatures extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceFeatures>{
		/**
		out of bounds buffer accesses are well defined
		*/
		default VkPhysicalDeviceFeatures robustBufferAccess(boolean robustBufferAccess){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS, robustBufferAccess?1:0);
			return this;
		}

		/**
		out of bounds buffer accesses are well defined
		*/
		default boolean robustBufferAccess(){
			final var robustBufferAccess_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS);
			return robustBufferAccess_!=0;
		}

		/**
		full 32-bit range of indices for indexed draw calls
		*/
		default VkPhysicalDeviceFeatures fullDrawIndexUint32(boolean fullDrawIndexUint32){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32, fullDrawIndexUint32?1:0);
			return this;
		}

		/**
		full 32-bit range of indices for indexed draw calls
		*/
		default boolean fullDrawIndexUint32(){
			final var fullDrawIndexUint32_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32);
			return fullDrawIndexUint32_!=0;
		}

		/**
		image views which are arrays of cube maps
		*/
		default VkPhysicalDeviceFeatures imageCubeArray(boolean imageCubeArray){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.IMAGECUBEARRAY, imageCubeArray?1:0);
			return this;
		}

		/**
		image views which are arrays of cube maps
		*/
		default boolean imageCubeArray(){
			final var imageCubeArray_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.IMAGECUBEARRAY);
			return imageCubeArray_!=0;
		}

		/**
		blending operations are controlled per-attachment
		*/
		default VkPhysicalDeviceFeatures independentBlend(boolean independentBlend){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.INDEPENDENTBLEND, independentBlend?1:0);
			return this;
		}

		/**
		blending operations are controlled per-attachment
		*/
		default boolean independentBlend(){
			final var independentBlend_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.INDEPENDENTBLEND);
			return independentBlend_!=0;
		}

		/**
		geometry stage
		*/
		default VkPhysicalDeviceFeatures geometryShader(boolean geometryShader){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.GEOMETRYSHADER, geometryShader?1:0);
			return this;
		}

		/**
		geometry stage
		*/
		default boolean geometryShader(){
			final var geometryShader_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.GEOMETRYSHADER);
			return geometryShader_!=0;
		}

		/**
		tessellation control and evaluation stage
		*/
		default VkPhysicalDeviceFeatures tessellationShader(boolean tessellationShader){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TESSELLATIONSHADER, tessellationShader?1:0);
			return this;
		}

		/**
		tessellation control and evaluation stage
		*/
		default boolean tessellationShader(){
			final var tessellationShader_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TESSELLATIONSHADER);
			return tessellationShader_!=0;
		}

		/**
		per-sample shading and interpolation
		*/
		default VkPhysicalDeviceFeatures sampleRateShading(boolean sampleRateShading){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SAMPLERATESHADING, sampleRateShading?1:0);
			return this;
		}

		/**
		per-sample shading and interpolation
		*/
		default boolean sampleRateShading(){
			final var sampleRateShading_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SAMPLERATESHADING);
			return sampleRateShading_!=0;
		}

		/**
		blend operations which take two sources
		*/
		default VkPhysicalDeviceFeatures dualSrcBlend(boolean dualSrcBlend){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DUALSRCBLEND, dualSrcBlend?1:0);
			return this;
		}

		/**
		blend operations which take two sources
		*/
		default boolean dualSrcBlend(){
			final var dualSrcBlend_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DUALSRCBLEND);
			return dualSrcBlend_!=0;
		}

		/**
		logic operations
		*/
		default VkPhysicalDeviceFeatures logicOp(boolean logicOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.LOGICOP, logicOp?1:0);
			return this;
		}

		/**
		logic operations
		*/
		default boolean logicOp(){
			final var logicOp_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.LOGICOP);
			return logicOp_!=0;
		}

		/**
		multi draw indirect
		*/
		default VkPhysicalDeviceFeatures multiDrawIndirect(boolean multiDrawIndirect){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT, multiDrawIndirect?1:0);
			return this;
		}

		/**
		multi draw indirect
		*/
		default boolean multiDrawIndirect(){
			final var multiDrawIndirect_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT);
			return multiDrawIndirect_!=0;
		}

		/**
		indirect drawing can use non-zero firstInstance
		*/
		default VkPhysicalDeviceFeatures drawIndirectFirstInstance(boolean drawIndirectFirstInstance){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE, drawIndirectFirstInstance?1:0);
			return this;
		}

		/**
		indirect drawing can use non-zero firstInstance
		*/
		default boolean drawIndirectFirstInstance(){
			final var drawIndirectFirstInstance_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE);
			return drawIndirectFirstInstance_!=0;
		}

		/**
		depth clamping
		*/
		default VkPhysicalDeviceFeatures depthClamp(boolean depthClamp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DEPTHCLAMP, depthClamp?1:0);
			return this;
		}

		/**
		depth clamping
		*/
		default boolean depthClamp(){
			final var depthClamp_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DEPTHCLAMP);
			return depthClamp_!=0;
		}

		/**
		depth bias clamping
		*/
		default VkPhysicalDeviceFeatures depthBiasClamp(boolean depthBiasClamp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DEPTHBIASCLAMP, depthBiasClamp?1:0);
			return this;
		}

		/**
		depth bias clamping
		*/
		default boolean depthBiasClamp(){
			final var depthBiasClamp_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DEPTHBIASCLAMP);
			return depthBiasClamp_!=0;
		}

		/**
		point and wireframe fill modes
		*/
		default VkPhysicalDeviceFeatures fillModeNonSolid(boolean fillModeNonSolid){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.FILLMODENONSOLID, fillModeNonSolid?1:0);
			return this;
		}

		/**
		point and wireframe fill modes
		*/
		default boolean fillModeNonSolid(){
			final var fillModeNonSolid_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.FILLMODENONSOLID);
			return fillModeNonSolid_!=0;
		}

		/**
		depth bounds test
		*/
		default VkPhysicalDeviceFeatures depthBounds(boolean depthBounds){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DEPTHBOUNDS, depthBounds?1:0);
			return this;
		}

		/**
		depth bounds test
		*/
		default boolean depthBounds(){
			final var depthBounds_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.DEPTHBOUNDS);
			return depthBounds_!=0;
		}

		/**
		lines with width greater than 1
		*/
		default VkPhysicalDeviceFeatures wideLines(boolean wideLines){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.WIDELINES, wideLines?1:0);
			return this;
		}

		/**
		lines with width greater than 1
		*/
		default boolean wideLines(){
			final var wideLines_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.WIDELINES);
			return wideLines_!=0;
		}

		/**
		points with size greater than 1
		*/
		default VkPhysicalDeviceFeatures largePoints(boolean largePoints){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.LARGEPOINTS, largePoints?1:0);
			return this;
		}

		/**
		points with size greater than 1
		*/
		default boolean largePoints(){
			final var largePoints_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.LARGEPOINTS);
			return largePoints_!=0;
		}

		/**
		the fragment alpha component can be forced to maximum representable alpha value
		*/
		default VkPhysicalDeviceFeatures alphaToOne(boolean alphaToOne){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.ALPHATOONE, alphaToOne?1:0);
			return this;
		}

		/**
		the fragment alpha component can be forced to maximum representable alpha value
		*/
		default boolean alphaToOne(){
			final var alphaToOne_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.ALPHATOONE);
			return alphaToOne_!=0;
		}

		/**
		viewport arrays
		*/
		default VkPhysicalDeviceFeatures multiViewport(boolean multiViewport){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.MULTIVIEWPORT, multiViewport?1:0);
			return this;
		}

		/**
		viewport arrays
		*/
		default boolean multiViewport(){
			final var multiViewport_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.MULTIVIEWPORT);
			return multiViewport_!=0;
		}

		/**
		anisotropic sampler filtering
		*/
		default VkPhysicalDeviceFeatures samplerAnisotropy(boolean samplerAnisotropy){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SAMPLERANISOTROPY, samplerAnisotropy?1:0);
			return this;
		}

		/**
		anisotropic sampler filtering
		*/
		default boolean samplerAnisotropy(){
			final var samplerAnisotropy_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SAMPLERANISOTROPY);
			return samplerAnisotropy_!=0;
		}

		/**
		ETC texture compression formats
		*/
		default VkPhysicalDeviceFeatures textureCompressionETC2(boolean textureCompressionETC2){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2, textureCompressionETC2?1:0);
			return this;
		}

		/**
		ETC texture compression formats
		*/
		default boolean textureCompressionETC2(){
			final var textureCompressionETC2_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2);
			return textureCompressionETC2_!=0;
		}

		/**
		ASTC LDR texture compression formats
		*/
		default VkPhysicalDeviceFeatures textureCompressionASTC_LDR(boolean textureCompressionASTC_LDR){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR, textureCompressionASTC_LDR?1:0);
			return this;
		}

		/**
		ASTC LDR texture compression formats
		*/
		default boolean textureCompressionASTC_LDR(){
			final var textureCompressionASTC_LDR_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR);
			return textureCompressionASTC_LDR_!=0;
		}

		/**
		BC1-7 texture compressed formats
		*/
		default VkPhysicalDeviceFeatures textureCompressionBC(boolean textureCompressionBC){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC, textureCompressionBC?1:0);
			return this;
		}

		/**
		BC1-7 texture compressed formats
		*/
		default boolean textureCompressionBC(){
			final var textureCompressionBC_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC);
			return textureCompressionBC_!=0;
		}

		/**
		precise occlusion queries returning actual sample counts
		*/
		default VkPhysicalDeviceFeatures occlusionQueryPrecise(boolean occlusionQueryPrecise){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE, occlusionQueryPrecise?1:0);
			return this;
		}

		/**
		precise occlusion queries returning actual sample counts
		*/
		default boolean occlusionQueryPrecise(){
			final var occlusionQueryPrecise_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE);
			return occlusionQueryPrecise_!=0;
		}

		/**
		pipeline statistics query
		*/
		default VkPhysicalDeviceFeatures pipelineStatisticsQuery(boolean pipelineStatisticsQuery){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY, pipelineStatisticsQuery?1:0);
			return this;
		}

		/**
		pipeline statistics query
		*/
		default boolean pipelineStatisticsQuery(){
			final var pipelineStatisticsQuery_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY);
			return pipelineStatisticsQuery_!=0;
		}

		/**
		stores and atomic ops on storage buffers and images are supported in vertex, tessellation, and geometry stages
		*/
		default VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(boolean vertexPipelineStoresAndAtomics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS, vertexPipelineStoresAndAtomics?1:0);
			return this;
		}

		/**
		stores and atomic ops on storage buffers and images are supported in vertex, tessellation, and geometry stages
		*/
		default boolean vertexPipelineStoresAndAtomics(){
			final var vertexPipelineStoresAndAtomics_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS);
			return vertexPipelineStoresAndAtomics_!=0;
		}

		/**
		stores and atomic ops on storage buffers and images are supported in the fragment stage
		*/
		default VkPhysicalDeviceFeatures fragmentStoresAndAtomics(boolean fragmentStoresAndAtomics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS, fragmentStoresAndAtomics?1:0);
			return this;
		}

		/**
		stores and atomic ops on storage buffers and images are supported in the fragment stage
		*/
		default boolean fragmentStoresAndAtomics(){
			final var fragmentStoresAndAtomics_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS);
			return fragmentStoresAndAtomics_!=0;
		}

		/**
		tessellation and geometry stages can export point size
		*/
		default VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(boolean shaderTessellationAndGeometryPointSize){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE, shaderTessellationAndGeometryPointSize?1:0);
			return this;
		}

		/**
		tessellation and geometry stages can export point size
		*/
		default boolean shaderTessellationAndGeometryPointSize(){
			final var shaderTessellationAndGeometryPointSize_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE);
			return shaderTessellationAndGeometryPointSize_!=0;
		}

		/**
		image gather with runtime values and independent offsets
		*/
		default VkPhysicalDeviceFeatures shaderImageGatherExtended(boolean shaderImageGatherExtended){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED, shaderImageGatherExtended?1:0);
			return this;
		}

		/**
		image gather with runtime values and independent offsets
		*/
		default boolean shaderImageGatherExtended(){
			final var shaderImageGatherExtended_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED);
			return shaderImageGatherExtended_!=0;
		}

		/**
		the extended set of formats can be used for storage images
		*/
		default VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(boolean shaderStorageImageExtendedFormats){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS, shaderStorageImageExtendedFormats?1:0);
			return this;
		}

		/**
		the extended set of formats can be used for storage images
		*/
		default boolean shaderStorageImageExtendedFormats(){
			final var shaderStorageImageExtendedFormats_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS);
			return shaderStorageImageExtendedFormats_!=0;
		}

		/**
		multisample images can be used for storage images
		*/
		default VkPhysicalDeviceFeatures shaderStorageImageMultisample(boolean shaderStorageImageMultisample){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE, shaderStorageImageMultisample?1:0);
			return this;
		}

		/**
		multisample images can be used for storage images
		*/
		default boolean shaderStorageImageMultisample(){
			final var shaderStorageImageMultisample_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE);
			return shaderStorageImageMultisample_!=0;
		}

		/**
		read from storage image does not require format qualifier
		*/
		default VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(boolean shaderStorageImageReadWithoutFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT, shaderStorageImageReadWithoutFormat?1:0);
			return this;
		}

		/**
		read from storage image does not require format qualifier
		*/
		default boolean shaderStorageImageReadWithoutFormat(){
			final var shaderStorageImageReadWithoutFormat_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT);
			return shaderStorageImageReadWithoutFormat_!=0;
		}

		/**
		write to storage image does not require format qualifier
		*/
		default VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(boolean shaderStorageImageWriteWithoutFormat){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT, shaderStorageImageWriteWithoutFormat?1:0);
			return this;
		}

		/**
		write to storage image does not require format qualifier
		*/
		default boolean shaderStorageImageWriteWithoutFormat(){
			final var shaderStorageImageWriteWithoutFormat_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT);
			return shaderStorageImageWriteWithoutFormat_!=0;
		}

		/**
		arrays of uniform buffers can be accessed with dynamically uniform indices
		*/
		default VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(boolean shaderUniformBufferArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING, shaderUniformBufferArrayDynamicIndexing?1:0);
			return this;
		}

		/**
		arrays of uniform buffers can be accessed with dynamically uniform indices
		*/
		default boolean shaderUniformBufferArrayDynamicIndexing(){
			final var shaderUniformBufferArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING);
			return shaderUniformBufferArrayDynamicIndexing_!=0;
		}

		/**
		arrays of sampled images can be accessed with dynamically uniform indices
		*/
		default VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(boolean shaderSampledImageArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING, shaderSampledImageArrayDynamicIndexing?1:0);
			return this;
		}

		/**
		arrays of sampled images can be accessed with dynamically uniform indices
		*/
		default boolean shaderSampledImageArrayDynamicIndexing(){
			final var shaderSampledImageArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING);
			return shaderSampledImageArrayDynamicIndexing_!=0;
		}

		/**
		arrays of storage buffers can be accessed with dynamically uniform indices
		*/
		default VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(boolean shaderStorageBufferArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING, shaderStorageBufferArrayDynamicIndexing?1:0);
			return this;
		}

		/**
		arrays of storage buffers can be accessed with dynamically uniform indices
		*/
		default boolean shaderStorageBufferArrayDynamicIndexing(){
			final var shaderStorageBufferArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING);
			return shaderStorageBufferArrayDynamicIndexing_!=0;
		}

		/**
		arrays of storage images can be accessed with dynamically uniform indices
		*/
		default VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(boolean shaderStorageImageArrayDynamicIndexing){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING, shaderStorageImageArrayDynamicIndexing?1:0);
			return this;
		}

		/**
		arrays of storage images can be accessed with dynamically uniform indices
		*/
		default boolean shaderStorageImageArrayDynamicIndexing(){
			final var shaderStorageImageArrayDynamicIndexing_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING);
			return shaderStorageImageArrayDynamicIndexing_!=0;
		}

		/**
		clip distance in shaders
		*/
		default VkPhysicalDeviceFeatures shaderClipDistance(boolean shaderClipDistance){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE, shaderClipDistance?1:0);
			return this;
		}

		/**
		clip distance in shaders
		*/
		default boolean shaderClipDistance(){
			final var shaderClipDistance_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE);
			return shaderClipDistance_!=0;
		}

		/**
		cull distance in shaders
		*/
		default VkPhysicalDeviceFeatures shaderCullDistance(boolean shaderCullDistance){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERCULLDISTANCE, shaderCullDistance?1:0);
			return this;
		}

		/**
		cull distance in shaders
		*/
		default boolean shaderCullDistance(){
			final var shaderCullDistance_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERCULLDISTANCE);
			return shaderCullDistance_!=0;
		}

		/**
		64-bit floats (doubles) in shaders
		*/
		default VkPhysicalDeviceFeatures shaderFloat64(boolean shaderFloat64){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERFLOAT64, shaderFloat64?1:0);
			return this;
		}

		/**
		64-bit floats (doubles) in shaders
		*/
		default boolean shaderFloat64(){
			final var shaderFloat64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERFLOAT64);
			return shaderFloat64_!=0;
		}

		/**
		64-bit integers in shaders
		*/
		default VkPhysicalDeviceFeatures shaderInt64(boolean shaderInt64){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERINT64, shaderInt64?1:0);
			return this;
		}

		/**
		64-bit integers in shaders
		*/
		default boolean shaderInt64(){
			final var shaderInt64_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERINT64);
			return shaderInt64_!=0;
		}

		/**
		16-bit integers in shaders
		*/
		default VkPhysicalDeviceFeatures shaderInt16(boolean shaderInt16){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERINT16, shaderInt16?1:0);
			return this;
		}

		/**
		16-bit integers in shaders
		*/
		default boolean shaderInt16(){
			final var shaderInt16_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERINT16);
			return shaderInt16_!=0;
		}

		/**
		shader can use texture operations that return resource residency information (requires sparseNonResident support)
		*/
		default VkPhysicalDeviceFeatures shaderResourceResidency(boolean shaderResourceResidency){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY, shaderResourceResidency?1:0);
			return this;
		}

		/**
		shader can use texture operations that return resource residency information (requires sparseNonResident support)
		*/
		default boolean shaderResourceResidency(){
			final var shaderResourceResidency_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY);
			return shaderResourceResidency_!=0;
		}

		/**
		shader can use texture operations that specify minimum resource LOD
		*/
		default VkPhysicalDeviceFeatures shaderResourceMinLod(boolean shaderResourceMinLod){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD, shaderResourceMinLod?1:0);
			return this;
		}

		/**
		shader can use texture operations that specify minimum resource LOD
		*/
		default boolean shaderResourceMinLod(){
			final var shaderResourceMinLod_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD);
			return shaderResourceMinLod_!=0;
		}

		/**
		Sparse resources support: Resource memory can be managed at opaque page level rather than object level
		*/
		default VkPhysicalDeviceFeatures sparseBinding(boolean sparseBinding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSEBINDING, sparseBinding?1:0);
			return this;
		}

		/**
		Sparse resources support: Resource memory can be managed at opaque page level rather than object level
		*/
		default boolean sparseBinding(){
			final var sparseBinding_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSEBINDING);
			return sparseBinding_!=0;
		}

		/**
		Sparse resources support: GPU can access partially resident buffers
		*/
		default VkPhysicalDeviceFeatures sparseResidencyBuffer(boolean sparseResidencyBuffer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER, sparseResidencyBuffer?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can access partially resident buffers
		*/
		default boolean sparseResidencyBuffer(){
			final var sparseResidencyBuffer_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER);
			return sparseResidencyBuffer_!=0;
		}

		/**
		Sparse resources support: GPU can access partially resident 2D (non-MSAA non-depth/stencil) images
		*/
		default VkPhysicalDeviceFeatures sparseResidencyImage2D(boolean sparseResidencyImage2D){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D, sparseResidencyImage2D?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can access partially resident 2D (non-MSAA non-depth/stencil) images
		*/
		default boolean sparseResidencyImage2D(){
			final var sparseResidencyImage2D_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D);
			return sparseResidencyImage2D_!=0;
		}

		/**
		Sparse resources support: GPU can access partially resident 3D images
		*/
		default VkPhysicalDeviceFeatures sparseResidencyImage3D(boolean sparseResidencyImage3D){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D, sparseResidencyImage3D?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can access partially resident 3D images
		*/
		default boolean sparseResidencyImage3D(){
			final var sparseResidencyImage3D_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D);
			return sparseResidencyImage3D_!=0;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 2 samples
		*/
		default VkPhysicalDeviceFeatures sparseResidency2Samples(boolean sparseResidency2Samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES, sparseResidency2Samples?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 2 samples
		*/
		default boolean sparseResidency2Samples(){
			final var sparseResidency2Samples_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES);
			return sparseResidency2Samples_!=0;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 4 samples
		*/
		default VkPhysicalDeviceFeatures sparseResidency4Samples(boolean sparseResidency4Samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES, sparseResidency4Samples?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 4 samples
		*/
		default boolean sparseResidency4Samples(){
			final var sparseResidency4Samples_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES);
			return sparseResidency4Samples_!=0;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 8 samples
		*/
		default VkPhysicalDeviceFeatures sparseResidency8Samples(boolean sparseResidency8Samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES, sparseResidency8Samples?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 8 samples
		*/
		default boolean sparseResidency8Samples(){
			final var sparseResidency8Samples_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES);
			return sparseResidency8Samples_!=0;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 16 samples
		*/
		default VkPhysicalDeviceFeatures sparseResidency16Samples(boolean sparseResidency16Samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES, sparseResidency16Samples?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can access partially resident MSAA 2D images with 16 samples
		*/
		default boolean sparseResidency16Samples(){
			final var sparseResidency16Samples_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES);
			return sparseResidency16Samples_!=0;
		}

		/**
		Sparse resources support: GPU can correctly access data aliased into multiple locations (opt-in)
		*/
		default VkPhysicalDeviceFeatures sparseResidencyAliased(boolean sparseResidencyAliased){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED, sparseResidencyAliased?1:0);
			return this;
		}

		/**
		Sparse resources support: GPU can correctly access data aliased into multiple locations (opt-in)
		*/
		default boolean sparseResidencyAliased(){
			final var sparseResidencyAliased_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED);
			return sparseResidencyAliased_!=0;
		}

		/**
		multisample rate must be the same for all pipelines in a subpass
		*/
		default VkPhysicalDeviceFeatures variableMultisampleRate(boolean variableMultisampleRate){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE, variableMultisampleRate?1:0);
			return this;
		}

		/**
		multisample rate must be the same for all pipelines in a subpass
		*/
		default boolean variableMultisampleRate(){
			final var variableMultisampleRate_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE);
			return variableMultisampleRate_!=0;
		}

		/**
		Queries may be inherited from primary to secondary command buffers
		*/
		default VkPhysicalDeviceFeatures inheritedQueries(boolean inheritedQueries){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.INHERITEDQUERIES, inheritedQueries?1:0);
			return this;
		}

		/**
		Queries may be inherited from primary to secondary command buffers
		*/
		default boolean inheritedQueries(){
			final var inheritedQueries_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.INHERITEDQUERIES);
			return inheritedQueries_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceFeatures from the given Arena.
		*/
		public static VkPhysicalDeviceFeatures allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceFeatures from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceFeatures> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SIZEOF, (mem)->(VkPhysicalDeviceFeatures)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBuffer.html">VkBuffer</a>
	*/
	public static record VkBuffer(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkBuffer>{
		public static PointerBuffer<? extends VkBuffer> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkBuffer(mem, parent)); //VkBuffer
		}

		public static PointerBuffer<? extends VkBuffer> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCacheHeaderVersionOne.html">VkPipelineCacheHeaderVersionOne</a>
	*/
	public interface VkPipelineCacheHeaderVersionOne extends io.github.kartoffell.klvulkan.Element<VkPipelineCacheHeaderVersionOne>{
		default VkPipelineCacheHeaderVersionOne headerSize(int headerSize){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.HEADERSIZE, headerSize);
			return this;
		}

		default int headerSize(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.HEADERSIZE);
		}

		default VkPipelineCacheHeaderVersionOne headerVersion(int headerVersion){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.HEADERVERSION, headerVersion);
			return this;
		}

		default int headerVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.HEADERVERSION);
		}

		default VkPipelineCacheHeaderVersionOne vendorID(int vendorID){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.VENDORID, vendorID);
			return this;
		}

		default int vendorID(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.VENDORID);
		}

		default VkPipelineCacheHeaderVersionOne deviceID(int deviceID){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.DEVICEID, deviceID);
			return this;
		}

		default int deviceID(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.DEVICEID);
		}

		default ByteBuffer pipelineCacheUUID(){
			final var pipelineCacheUUID_ = address().asSlice(org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID, 1*API_Constants.VK_UUID_SIZE);
			return (pipelineCacheUUID_.equals(MemorySegment.NULL)?null:pipelineCacheUUID_.asByteBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineCacheHeaderVersionOne from the given Arena.
		*/
		public static VkPipelineCacheHeaderVersionOne allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineCacheHeaderVersionOne from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineCacheHeaderVersionOne> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineCacheHeaderVersionOne.SIZEOF, (mem)->(VkPipelineCacheHeaderVersionOne)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFrontFace.html">VkFrontFace</a>
	*/
	public interface VkFrontFace{
		public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;

		public static final int VK_FRONT_FACE_CLOCKWISE = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandPool.html">VkCommandPool</a>
	*/
	public static record VkCommandPool(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkCommandPool>{
		public static PointerBuffer<? extends VkCommandPool> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkCommandPool(mem, parent)); //VkCommandPool
		}

		public static PointerBuffer<? extends VkCommandPool> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkObjectType.html">VkObjectType</a>
	*/
	public interface VkObjectType{
		public static final int VK_OBJECT_TYPE_QUEUE = 4;

		public static final int VK_OBJECT_TYPE_FENCE = 7;

		public static final int VK_OBJECT_TYPE_IMAGE = 10;

		public static final int VK_OBJECT_TYPE_INSTANCE = 1;

		public static final int VK_OBJECT_TYPE_DEVICE_MEMORY = 8;

		public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT = 20;

		public static final int VK_OBJECT_TYPE_FRAMEBUFFER = 24;

		public static final int VK_OBJECT_TYPE_UNKNOWN = 0;

		public static final int VK_OBJECT_TYPE_EVENT = 11;

		public static final int VK_OBJECT_TYPE_COMMAND_BUFFER = 6;

		public static final int VK_OBJECT_TYPE_RENDER_PASS = 18;

		public static final int VK_OBJECT_TYPE_PIPELINE_LAYOUT = 17;

		public static final int VK_OBJECT_TYPE_PIPELINE = 19;

		public static final int VK_OBJECT_TYPE_COMMAND_POOL = 25;

		public static final int VK_OBJECT_TYPE_IMAGE_VIEW = 14;

		public static final int VK_OBJECT_TYPE_PIPELINE_CACHE = 16;

		public static final int VK_OBJECT_TYPE_PHYSICAL_DEVICE = 2;

		public static final int VK_OBJECT_TYPE_DESCRIPTOR_POOL = 22;

		public static final int VK_OBJECT_TYPE_SEMAPHORE = 5;

		public static final int VK_OBJECT_TYPE_DEVICE = 3;

		public static final int VK_OBJECT_TYPE_BUFFER = 9;

		public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET = 23;

		public static final int VK_OBJECT_TYPE_SHADER_MODULE = 15;

		public static final int VK_OBJECT_TYPE_SAMPLER = 21;

		public static final int VK_OBJECT_TYPE_QUERY_POOL = 12;

		public static final int VK_OBJECT_TYPE_BUFFER_VIEW = 13;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineColorBlendStateCreateFlagBits.html">VkPipelineColorBlendStateCreateFlagBits</a>
	*/
	public interface VkPipelineColorBlendStateCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipeline.html">VkPipeline</a>
	*/
	public static record VkPipeline(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkPipeline>{
		public static PointerBuffer<? extends VkPipeline> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkPipeline(mem, parent)); //VkPipeline
		}

		public static PointerBuffer<? extends VkPipeline> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCacheCreateInfo.html">VkPipelineCacheCreateInfo</a>
	*/
	public interface VkPipelineCacheCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineCacheCreateInfo>{
		default VkPipelineCacheCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.STYPE);
		}

		default VkPipelineCacheCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.PNEXT);
		}

		default VkPipelineCacheCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.FLAGS);
		}

		/**
		Size of initial data to populate cache, in bytes
		*/
		default VkPipelineCacheCreateInfo initialDataSize(long initialDataSize){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.INITIALDATASIZE, MemorySegment.ofAddress(initialDataSize));;
			return this;
		}

		/**
		Size of initial data to populate cache, in bytes
		*/
		@Nullable
		default long initialDataSize(){
			final var initialDataSize_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.INITIALDATASIZE);
			return initialDataSize_.address();
		}

		/**
		Initial data to populate cache
		*/
		default VkPipelineCacheCreateInfo pInitialData(MemorySegment pInitialData){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.PINITIALDATA, pInitialData);
			return this;
		}

		/**
		Initial data to populate cache
		*/
		default MemorySegment pInitialData(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.PINITIALDATA);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineCacheCreateInfo from the given Arena.
		*/
		public static VkPipelineCacheCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineCacheCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineCacheCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineCacheCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineCacheCreateInfo.SIZEOF, (mem)->(VkPipelineCacheCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkInstanceCreateFlagBits.html">VkInstanceCreateFlagBits</a>
	*/
	public interface VkInstanceCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExtent2D.html">VkExtent2D</a>
	*/
	public interface VkExtent2D extends io.github.kartoffell.klvulkan.Element<VkExtent2D>{
		default VkExtent2D width(int width){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent2D.WIDTH, width);
			return this;
		}

		default int width(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent2D.WIDTH);
		}

		default VkExtent2D height(int height){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent2D.HEIGHT, height);
			return this;
		}

		default int height(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent2D.HEIGHT);
		}

		MemorySegment address();

		/**
		Allocates a new VkExtent2D from the given Arena.
		*/
		public static VkExtent2D allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExtent2D.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkExtent2D from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkExtent2D> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExtent2D.SIZEOF, (mem)->(VkExtent2D)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandPoolCreateInfo.html">VkCommandPoolCreateInfo</a>
	*/
	public interface VkCommandPoolCreateInfo extends io.github.kartoffell.klvulkan.Element<VkCommandPoolCreateInfo>{
		default VkCommandPoolCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandPoolCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandPoolCreateInfo.STYPE);
		}

		default VkCommandPoolCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandPoolCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandPoolCreateInfo.PNEXT);
		}

		/**
		Command pool creation flags
		*/
		default VkCommandPoolCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandPoolCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Command pool creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandPoolCreateInfo.FLAGS);
		}

		default VkCommandPoolCreateInfo queueFamilyIndex(int queueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandPoolCreateInfo.QUEUEFAMILYINDEX, queueFamilyIndex);
			return this;
		}

		default int queueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandPoolCreateInfo.QUEUEFAMILYINDEX);
		}

		MemorySegment address();

		/**
		Allocates a new VkCommandPoolCreateInfo from the given Arena.
		*/
		public static VkCommandPoolCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCommandPoolCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCommandPoolCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCommandPoolCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCommandPoolCreateInfo.SIZEOF, (mem)->(VkCommandPoolCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkClearColorValue.html">VkClearColorValue</a>
	*/
	public interface VkClearColorValue extends io.github.kartoffell.klvulkan.Element<VkClearColorValue>{
		default FloatBuffer float32(){
			final var float32_ = address().asSlice(org.lwjgl.vulkan.VkClearColorValue.FLOAT32, 4*4);
			return (float32_.equals(MemorySegment.NULL)?null:float32_.asByteBuffer().asFloatBuffer());
		}

		default IntBuffer int32(){
			final var int32_ = address().asSlice(org.lwjgl.vulkan.VkClearColorValue.INT32, 4*4);
			return (int32_.equals(MemorySegment.NULL)?null:int32_.asByteBuffer().asIntBuffer());
		}

		default IntBuffer uint32(){
			final var uint32_ = address().asSlice(org.lwjgl.vulkan.VkClearColorValue.UINT32, 4*4);
			return (uint32_.equals(MemorySegment.NULL)?null:uint32_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		public static VkClearColorValue allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkClearColorValue.SIZEOF);
			return ()->mem;
		}

		public static ElementBuffer<VkClearColorValue> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkClearColorValue.SIZEOF, (mem)->(VkClearColorValue)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCacheHeaderVersion.html">VkPipelineCacheHeaderVersion</a>
	*/
	public interface VkPipelineCacheHeaderVersion{
		public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferCreateFlagBits.html">VkBufferCreateFlagBits</a>
	*/
	public interface VkBufferCreateFlagBits{
		public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 1;

		public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 2;

		public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetLayoutBinding.html">VkDescriptorSetLayoutBinding</a>
	*/
	public interface VkDescriptorSetLayoutBinding extends io.github.kartoffell.klvulkan.Element<VkDescriptorSetLayoutBinding>{
		/**
		Binding number for this entry
		*/
		default VkDescriptorSetLayoutBinding binding(int binding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.BINDING, binding);
			return this;
		}

		/**
		Binding number for this entry
		*/
		default int binding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.BINDING);
		}

		/**
		Type of the descriptors in this binding
		*/
		default VkDescriptorSetLayoutBinding descriptorType(int descriptorType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.DESCRIPTORTYPE, descriptorType);
			return this;
		}

		/**
		Type of the descriptors in this binding
		*/
		default int descriptorType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.DESCRIPTORTYPE);
		}

		/**
		Number of descriptors in this binding
		*/
		default VkDescriptorSetLayoutBinding descriptorCount(int descriptorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT, descriptorCount);
			return this;
		}

		/**
		Number of descriptors in this binding
		*/
		@Nullable
		default int descriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT);
		}

		/**
		Shader stages this binding is visible to
		*/
		default VkDescriptorSetLayoutBinding stageFlags(int stageFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.STAGEFLAGS, stageFlags);
			return this;
		}

		/**
		Shader stages this binding is visible to
		*/
		default int stageFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.STAGEFLAGS);
		}

		/**
		Immutable samplers (used if descriptor type is SAMPLER or COMBINED_IMAGE_SAMPLER, is either NULL or contains count number of elements)
		*/
		default VkDescriptorSetLayoutBinding pImmutableSamplers(PointerBuffer<? extends Element<? extends VkSampler>> pImmutableSamplers){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS, (pImmutableSamplers==null?MemorySegment.NULL:pImmutableSamplers.address()));
			return this;
		}

		/**
		Immutable samplers (used if descriptor type is SAMPLER or COMBINED_IMAGE_SAMPLER, is either NULL or contains count number of elements)
		*/
		@Nullable
		default PointerBuffer<? extends Element<? extends VkSampler>> pImmutableSamplers(){
			final var pImmutableSamplers_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS);
			return (pImmutableSamplers_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pImmutableSamplers_, (v693267461)->(v693267461.equals(MemorySegment.NULL)?null:(Element<? extends VkSampler>)()->v693267461)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorSetLayoutBinding from the given Arena.
		*/
		public static VkDescriptorSetLayoutBinding allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorSetLayoutBinding from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorSetLayoutBinding> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorSetLayoutBinding.SIZEOF, (mem)->(VkDescriptorSetLayoutBinding)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorType.html">VkDescriptorType</a>
	*/
	public interface VkDescriptorType{
		public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 6;

		public static final int VK_DESCRIPTOR_TYPE_SAMPLER = 0;

		public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8;

		public static final int VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 3;

		public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 7;

		public static final int VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 10;

		public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9;

		public static final int VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1;

		public static final int VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 2;

		public static final int VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 5;

		public static final int VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentDescriptionFlagBits.html">VkAttachmentDescriptionFlagBits</a>
	*/
	public interface VkAttachmentDescriptionFlagBits{
		public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkLayerProperties.html">VkLayerProperties</a>
	*/
	public interface VkLayerProperties extends io.github.kartoffell.klvulkan.Element<VkLayerProperties>{
		/**
		layer name
		*/
		default CString layerName(){
			final var layerName_ = address().asSlice(org.lwjgl.vulkan.VkLayerProperties.LAYERNAME, API_Constants.VK_MAX_EXTENSION_NAME_SIZE);
			return layerName_.equals(MemorySegment.NULL)?null:CString.wrap(layerName_);
		}

		/**
		version of the layer specification implemented
		*/
		default int specVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkLayerProperties.SPECVERSION);
		}

		/**
		build or release version of the layer's library
		*/
		default int implementationVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkLayerProperties.IMPLEMENTATIONVERSION);
		}

		/**
		Free-form description of the layer
		*/
		default CString description(){
			final var description_ = address().asSlice(org.lwjgl.vulkan.VkLayerProperties.DESCRIPTION, API_Constants.VK_MAX_DESCRIPTION_SIZE);
			return description_.equals(MemorySegment.NULL)?null:CString.wrap(description_);
		}

		MemorySegment address();

		/**
		Allocates a new VkLayerProperties from the given Arena.
		*/
		public static VkLayerProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkLayerProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkLayerProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkLayerProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkLayerProperties.SIZEOF, (mem)->(VkLayerProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageTiling.html">VkImageTiling</a>
	*/
	public interface VkImageTiling{
		public static final int VK_IMAGE_TILING_OPTIMAL = 0;

		public static final int VK_IMAGE_TILING_LINEAR = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageCopy.html">VkImageCopy</a>
	*/
	public interface VkImageCopy extends io.github.kartoffell.klvulkan.Element<VkImageCopy>{
		default VkImageSubresourceLayers srcSubresource(){
			final var srcSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy.SRCSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (srcSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->srcSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkOffset3D srcOffset(){
			final var srcOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy.SRCOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (srcOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->srcOffset_);
		}

		default VkImageSubresourceLayers dstSubresource(){
			final var dstSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy.DSTSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (dstSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->dstSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkOffset3D dstOffset(){
			final var dstOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy.DSTOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (dstOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->dstOffset_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkExtent3D extent(){
			final var extent_ = address().asSlice(org.lwjgl.vulkan.VkImageCopy.EXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (extent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->extent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageCopy from the given Arena.
		*/
		public static VkImageCopy allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageCopy.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageCopy from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageCopy> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageCopy.SIZEOF, (mem)->(VkImageCopy)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkStencilOp.html">VkStencilOp</a>
	*/
	public interface VkStencilOp{
		public static final int VK_STENCIL_OP_REPLACE = 2;

		public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;

		public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;

		public static final int VK_STENCIL_OP_KEEP = 0;

		public static final int VK_STENCIL_OP_ZERO = 1;

		public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;

		public static final int VK_STENCIL_OP_INVERT = 5;

		public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFormat.html">VkFormat</a>
	*/
	public interface VkFormat{
		public static final int VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = 123;

		public static final int VK_FORMAT_D16_UNORM = 124;

		public static final int VK_FORMAT_R8G8B8A8_USCALED = 39;

		public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = 170;

		public static final int VK_FORMAT_R16G16_USCALED = 79;

		public static final int VK_FORMAT_R8G8B8A8_SNORM = 38;

		public static final int VK_FORMAT_R8G8_SINT = 21;

		public static final int VK_FORMAT_R16_SSCALED = 73;

		public static final int VK_FORMAT_B8G8R8_SINT = 35;

		public static final int VK_FORMAT_A2B10G10R10_UINT_PACK32 = 68;

		public static final int VK_FORMAT_BC1_RGB_UNORM_BLOCK = 131;

		public static final int VK_FORMAT_R8_UINT = 13;

		public static final int VK_FORMAT_R8G8B8A8_SINT = 42;

		public static final int VK_FORMAT_R64G64B64_UINT = 116;

		public static final int VK_FORMAT_R32G32B32_SFLOAT = 106;

		public static final int VK_FORMAT_R8G8B8_SINT = 28;

		public static final int VK_FORMAT_R8G8B8_UNORM = 23;

		public static final int VK_FORMAT_D24_UNORM_S8_UINT = 129;

		public static final int VK_FORMAT_BC6H_SFLOAT_BLOCK = 144;

		public static final int VK_FORMAT_EAC_R11_SNORM_BLOCK = 154;

		public static final int VK_FORMAT_R32G32B32A32_UINT = 107;

		public static final int VK_FORMAT_B8G8R8_UNORM = 30;

		public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = 162;

		public static final int VK_FORMAT_B8G8R8A8_USCALED = 46;

		public static final int VK_FORMAT_R16G16_SFLOAT = 83;

		public static final int VK_FORMAT_R8G8B8A8_SRGB = 43;

		public static final int VK_FORMAT_R8_SRGB = 15;

		public static final int VK_FORMAT_BC5_UNORM_BLOCK = 141;

		public static final int VK_FORMAT_BC7_UNORM_BLOCK = 145;

		public static final int VK_FORMAT_R8G8B8A8_UNORM = 37;

		public static final int VK_FORMAT_BC4_UNORM_BLOCK = 139;

		public static final int VK_FORMAT_R4G4B4A4_UNORM_PACK16 = 2;

		public static final int VK_FORMAT_R8_USCALED = 11;

		public static final int VK_FORMAT_R8G8_SRGB = 22;

		public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = 179;

		public static final int VK_FORMAT_R8G8B8_SRGB = 29;

		public static final int VK_FORMAT_A8B8G8R8_USCALED_PACK32 = 53;

		public static final int VK_FORMAT_B8G8R8_SRGB = 36;

		public static final int VK_FORMAT_A2R10G10B10_UINT_PACK32 = 62;

		public static final int VK_FORMAT_EAC_R11G11_UNORM_BLOCK = 155;

		public static final int VK_FORMAT_A2R10G10B10_SNORM_PACK32 = 59;

		public static final int VK_FORMAT_R16_SFLOAT = 76;

		public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = 174;

		public static final int VK_FORMAT_R16G16B16A16_SNORM = 92;

		public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = 182;

		public static final int VK_FORMAT_A1R5G5B5_UNORM_PACK16 = 8;

		public static final int VK_FORMAT_R64G64_UINT = 113;

		public static final int VK_FORMAT_R8G8B8_SNORM = 24;

		public static final int VK_FORMAT_R16G16B16A16_UINT = 95;

		public static final int VK_FORMAT_R16G16B16_USCALED = 86;

		public static final int VK_FORMAT_BC2_UNORM_BLOCK = 135;

		public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = 165;

		public static final int VK_FORMAT_BC3_UNORM_BLOCK = 137;

		public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = 163;

		public static final int VK_FORMAT_R64G64B64A64_UINT = 119;

		public static final int VK_FORMAT_B8G8R8_SNORM = 31;

		public static final int VK_FORMAT_R16G16B16_UINT = 88;

		public static final int VK_FORMAT_R32G32B32_UINT = 104;

		public static final int VK_FORMAT_A8B8G8R8_SNORM_PACK32 = 52;

		public static final int VK_FORMAT_X8_D24_UNORM_PACK32 = 125;

		public static final int VK_FORMAT_R32G32_UINT = 101;

		public static final int VK_FORMAT_R8G8_UINT = 20;

		public static final int VK_FORMAT_R16G16B16A16_USCALED = 93;

		public static final int VK_FORMAT_R8_UNORM = 9;

		public static final int VK_FORMAT_R64G64B64_SINT = 117;

		public static final int VK_FORMAT_BC7_SRGB_BLOCK = 146;

		public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = 168;

		public static final int VK_FORMAT_B4G4R4A4_UNORM_PACK16 = 3;

		public static final int VK_FORMAT_BC2_SRGB_BLOCK = 136;

		public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = 164;

		public static final int VK_FORMAT_R16_USCALED = 72;

		public static final int VK_FORMAT_R32_SFLOAT = 100;

		public static final int VK_FORMAT_D32_SFLOAT = 126;

		public static final int VK_FORMAT_B8G8R8A8_SRGB = 50;

		public static final int VK_FORMAT_A8B8G8R8_UINT_PACK32 = 55;

		public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = 180;

		public static final int VK_FORMAT_R32G32B32A32_SFLOAT = 109;

		public static final int VK_FORMAT_EAC_R11G11_SNORM_BLOCK = 156;

		public static final int VK_FORMAT_R8G8_USCALED = 18;

		public static final int VK_FORMAT_R32_UINT = 98;

		public static final int VK_FORMAT_R64G64_SINT = 114;

		public static final int VK_FORMAT_R16_UINT = 74;

		public static final int VK_FORMAT_A2R10G10B10_UNORM_PACK32 = 58;

		public static final int VK_FORMAT_R8_SNORM = 10;

		public static final int VK_FORMAT_R8G8_SNORM = 17;

		public static final int VK_FORMAT_R16G16_UNORM = 77;

		public static final int VK_FORMAT_R8G8B8_USCALED = 25;

		public static final int VK_FORMAT_R64G64B64A64_SINT = 120;

		public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = 171;

		public static final int VK_FORMAT_A8B8G8R8_UNORM_PACK32 = 51;

		public static final int VK_FORMAT_BC1_RGBA_SRGB_BLOCK = 134;

		public static final int VK_FORMAT_B8G8R8A8_SINT = 49;

		public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = 167;

		public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = 169;

		public static final int VK_FORMAT_R16G16B16A16_SFLOAT = 97;

		public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = 172;

		public static final int VK_FORMAT_R32G32B32_SINT = 105;

		public static final int VK_FORMAT_R64_UINT = 110;

		public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = 178;

		public static final int VK_FORMAT_R64G64B64_SFLOAT = 118;

		public static final int VK_FORMAT_R64G64_SFLOAT = 115;

		public static final int VK_FORMAT_R32G32_SINT = 102;

		public static final int VK_FORMAT_B10G11R11_UFLOAT_PACK32 = 122;

		public static final int VK_FORMAT_R8G8B8_SSCALED = 26;

		public static final int VK_FORMAT_R5G6B5_UNORM_PACK16 = 4;

		public static final int VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = 151;

		public static final int VK_FORMAT_BC3_SRGB_BLOCK = 138;

		public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = 166;

		public static final int VK_FORMAT_R8G8_UNORM = 16;

		public static final int VK_FORMAT_BC1_RGBA_UNORM_BLOCK = 133;

		public static final int VK_FORMAT_R16G16_SNORM = 78;

		public static final int VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = 148;

		public static final int VK_FORMAT_R16G16_UINT = 81;

		public static final int VK_FORMAT_A8B8G8R8_SRGB_PACK32 = 57;

		public static final int VK_FORMAT_R16_SNORM = 71;

		public static final int VK_FORMAT_R64_SFLOAT = 112;

		public static final int VK_FORMAT_B5G6R5_UNORM_PACK16 = 5;

		public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = 176;

		public static final int VK_FORMAT_D32_SFLOAT_S8_UINT = 130;

		public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = 159;

		public static final int VK_FORMAT_R32G32_SFLOAT = 103;

		public static final int VK_FORMAT_UNDEFINED = 0;

		public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = 161;

		public static final int VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = 150;

		public static final int VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = 152;

		public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = 160;

		public static final int VK_FORMAT_R16_SINT = 75;

		public static final int VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = 147;

		public static final int VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = 54;

		public static final int VK_FORMAT_R32_SINT = 99;

		public static final int VK_FORMAT_S8_UINT = 127;

		public static final int VK_FORMAT_A2B10G10R10_UNORM_PACK32 = 64;

		public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = 158;

		public static final int VK_FORMAT_R16_UNORM = 70;

		public static final int VK_FORMAT_D16_UNORM_S8_UINT = 128;

		public static final int VK_FORMAT_R64_SINT = 111;

		public static final int VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = 149;

		public static final int VK_FORMAT_B8G8R8A8_UINT = 48;

		public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = 177;

		public static final int VK_FORMAT_R16G16_SSCALED = 80;

		public static final int VK_FORMAT_R16G16B16A16_SSCALED = 94;

		public static final int VK_FORMAT_B8G8R8_USCALED = 32;

		public static final int VK_FORMAT_R8_SINT = 14;

		public static final int VK_FORMAT_B8G8R8_SSCALED = 33;

		public static final int VK_FORMAT_R8G8B8A8_UINT = 41;

		public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = 173;

		public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = 181;

		public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = 175;

		public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = 183;

		public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = 184;

		public static final int VK_FORMAT_EAC_R11_UNORM_BLOCK = 153;

		public static final int VK_FORMAT_R8G8B8_UINT = 27;

		public static final int VK_FORMAT_A2B10G10R10_SNORM_PACK32 = 65;

		public static final int VK_FORMAT_R4G4_UNORM_PACK8 = 1;

		public static final int VK_FORMAT_B8G8R8A8_SSCALED = 47;

		public static final int VK_FORMAT_B8G8R8_UINT = 34;

		public static final int VK_FORMAT_R8G8B8A8_SSCALED = 40;

		public static final int VK_FORMAT_R8G8_SSCALED = 19;

		public static final int VK_FORMAT_R16G16B16A16_UNORM = 91;

		public static final int VK_FORMAT_R32G32B32A32_SINT = 108;

		public static final int VK_FORMAT_R16G16_SINT = 82;

		public static final int VK_FORMAT_B8G8R8A8_SNORM = 45;

		public static final int VK_FORMAT_A2B10G10R10_SINT_PACK32 = 69;

		public static final int VK_FORMAT_R16G16B16_SFLOAT = 90;

		public static final int VK_FORMAT_R64G64B64A64_SFLOAT = 121;

		public static final int VK_FORMAT_R8_SSCALED = 12;

		public static final int VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 60;

		public static final int VK_FORMAT_R16G16B16A16_SINT = 96;

		public static final int VK_FORMAT_R16G16B16_SNORM = 85;

		public static final int VK_FORMAT_A8B8G8R8_SINT_PACK32 = 56;

		public static final int VK_FORMAT_B5G5R5A1_UNORM_PACK16 = 7;

		public static final int VK_FORMAT_BC1_RGB_SRGB_BLOCK = 132;

		public static final int VK_FORMAT_R5G5B5A1_UNORM_PACK16 = 6;

		public static final int VK_FORMAT_R16G16B16_SSCALED = 87;

		public static final int VK_FORMAT_BC4_SNORM_BLOCK = 140;

		public static final int VK_FORMAT_BC6H_UFLOAT_BLOCK = 143;

		public static final int VK_FORMAT_A2R10G10B10_SINT_PACK32 = 63;

		public static final int VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 66;

		public static final int VK_FORMAT_R16G16B16_UNORM = 84;

		public static final int VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 67;

		public static final int VK_FORMAT_R16G16B16_SINT = 89;

		public static final int VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 61;

		public static final int VK_FORMAT_BC5_SNORM_BLOCK = 142;

		public static final int VK_FORMAT_B8G8R8A8_UNORM = 44;

		public static final int VK_FORMAT_ASTC_4x4_UNORM_BLOCK = 157;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineInputAssemblyStateCreateInfo.html">VkPipelineInputAssemblyStateCreateInfo</a>
	*/
	public interface VkPipelineInputAssemblyStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineInputAssemblyStateCreateInfo>{
		default VkPipelineInputAssemblyStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.STYPE);
		}

		default VkPipelineInputAssemblyStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.PNEXT);
		}

		default VkPipelineInputAssemblyStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.FLAGS);
		}

		default VkPipelineInputAssemblyStateCreateInfo topology(int topology){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY, topology);
			return this;
		}

		default int topology(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY);
		}

		default VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(boolean primitiveRestartEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE, primitiveRestartEnable?1:0);
			return this;
		}

		default boolean primitiveRestartEnable(){
			final var primitiveRestartEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE);
			return primitiveRestartEnable_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineInputAssemblyStateCreateInfo from the given Arena.
		*/
		public static VkPipelineInputAssemblyStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineInputAssemblyStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineInputAssemblyStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.SIZEOF, (mem)->(VkPipelineInputAssemblyStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryHeapFlagBits.html">VkMemoryHeapFlagBits</a>
	*/
	public interface VkMemoryHeapFlagBits{
		public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPrimitiveTopology.html">VkPrimitiveTopology</a>
	*/
	public interface VkPrimitiveTopology{
		public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0;

		public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1;

		public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3;

		public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4;

		public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5;

		public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8;

		public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2;

		public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10;

		public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7;

		public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9;

		public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCompareOp.html">VkCompareOp</a>
	*/
	public interface VkCompareOp{
		public static final int VK_COMPARE_OP_NEVER = 0;

		public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;

		public static final int VK_COMPARE_OP_EQUAL = 2;

		public static final int VK_COMPARE_OP_GREATER = 4;

		public static final int VK_COMPARE_OP_ALWAYS = 7;

		public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;

		public static final int VK_COMPARE_OP_LESS = 1;

		public static final int VK_COMPARE_OP_NOT_EQUAL = 5;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageViewType.html">VkImageViewType</a>
	*/
	public interface VkImageViewType{
		public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

		public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;

		public static final int VK_IMAGE_VIEW_TYPE_1D = 0;

		public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;

		public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;

		public static final int VK_IMAGE_VIEW_TYPE_3D = 2;

		public static final int VK_IMAGE_VIEW_TYPE_2D = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferBeginInfo.html">VkCommandBufferBeginInfo</a>
	*/
	public interface VkCommandBufferBeginInfo extends io.github.kartoffell.klvulkan.Element<VkCommandBufferBeginInfo>{
		default VkCommandBufferBeginInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferBeginInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferBeginInfo.STYPE);
		}

		default VkCommandBufferBeginInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferBeginInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferBeginInfo.PNEXT);
		}

		/**
		Command buffer usage flags
		*/
		default VkCommandBufferBeginInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferBeginInfo.FLAGS, flags);
			return this;
		}

		/**
		Command buffer usage flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferBeginInfo.FLAGS);
		}

		/**
		Pointer to inheritance info for secondary command buffers
		*/
		default VkCommandBufferBeginInfo pInheritanceInfo(Element<VkCommandBufferInheritanceInfo> pInheritanceInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferBeginInfo.PINHERITANCEINFO, (pInheritanceInfo==null?MemorySegment.NULL:pInheritanceInfo.address()));
			return this;
		}

		/**
		Pointer to inheritance info for secondary command buffers
		*/
		@Nullable
		default Element<VkCommandBufferInheritanceInfo> pInheritanceInfo(){
			final var pInheritanceInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferBeginInfo.PINHERITANCEINFO);
			return (pInheritanceInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pInheritanceInfo_, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF, (v49222910)->(v49222910.equals(MemorySegment.NULL)?null:(VkCommandBufferInheritanceInfo)()->v49222910)));
		}

		MemorySegment address();

		/**
		Allocates a new VkCommandBufferBeginInfo from the given Arena.
		*/
		public static VkCommandBufferBeginInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCommandBufferBeginInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCommandBufferBeginInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCommandBufferBeginInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCommandBufferBeginInfo.SIZEOF, (mem)->(VkCommandBufferBeginInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineDynamicStateCreateInfo.html">VkPipelineDynamicStateCreateInfo</a>
	*/
	public interface VkPipelineDynamicStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineDynamicStateCreateInfo>{
		default VkPipelineDynamicStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.STYPE);
		}

		default VkPipelineDynamicStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.PNEXT);
		}

		default VkPipelineDynamicStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.FLAGS);
		}

		default VkPipelineDynamicStateCreateInfo dynamicStateCount(int dynamicStateCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.DYNAMICSTATECOUNT, dynamicStateCount);
			return this;
		}

		@Nullable
		default int dynamicStateCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.DYNAMICSTATECOUNT);
		}

		default VkPipelineDynamicStateCreateInfo pDynamicStates(IntBuffer pDynamicStates){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.PDYNAMICSTATES, (pDynamicStates==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDynamicStates)));
			return this;
		}

		default IntBuffer pDynamicStates(){
			final var pDynamicStates_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.PDYNAMICSTATES);
			return (pDynamicStates_.equals(MemorySegment.NULL)?null:pDynamicStates_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineDynamicStateCreateInfo from the given Arena.
		*/
		public static VkPipelineDynamicStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineDynamicStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineDynamicStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.SIZEOF, (mem)->(VkPipelineDynamicStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineMultisampleStateCreateInfo.html">VkPipelineMultisampleStateCreateInfo</a>
	*/
	public interface VkPipelineMultisampleStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineMultisampleStateCreateInfo>{
		default VkPipelineMultisampleStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.STYPE);
		}

		default VkPipelineMultisampleStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.PNEXT);
		}

		default VkPipelineMultisampleStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.FLAGS);
		}

		/**
		Number of samples used for rasterization
		*/
		default VkPipelineMultisampleStateCreateInfo rasterizationSamples(int rasterizationSamples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.RASTERIZATIONSAMPLES, rasterizationSamples);
			return this;
		}

		/**
		Number of samples used for rasterization
		*/
		default int rasterizationSamples(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.RASTERIZATIONSAMPLES);
		}

		/**
		optional (GL45)
		*/
		default VkPipelineMultisampleStateCreateInfo sampleShadingEnable(boolean sampleShadingEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.SAMPLESHADINGENABLE, sampleShadingEnable?1:0);
			return this;
		}

		/**
		optional (GL45)
		*/
		default boolean sampleShadingEnable(){
			final var sampleShadingEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.SAMPLESHADINGENABLE);
			return sampleShadingEnable_!=0;
		}

		/**
		optional (GL45)
		*/
		default VkPipelineMultisampleStateCreateInfo minSampleShading(float minSampleShading){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.MINSAMPLESHADING, minSampleShading);
			return this;
		}

		/**
		optional (GL45)
		*/
		default float minSampleShading(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.MINSAMPLESHADING);
		}

		/**
		Array of sampleMask words
		*/
		default VkPipelineMultisampleStateCreateInfo pSampleMask(IntBuffer pSampleMask){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.PSAMPLEMASK, (pSampleMask==null?MemorySegment.NULL:MemorySegment.ofBuffer(pSampleMask)));
			return this;
		}

		/**
		Array of sampleMask words
		*/
		@Nullable
		default IntBuffer pSampleMask(){
			final var pSampleMask_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.PSAMPLEMASK);
			return (pSampleMask_.equals(MemorySegment.NULL)?null:pSampleMask_.asByteBuffer().asIntBuffer());
		}

		default VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(boolean alphaToCoverageEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.ALPHATOCOVERAGEENABLE, alphaToCoverageEnable?1:0);
			return this;
		}

		default boolean alphaToCoverageEnable(){
			final var alphaToCoverageEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.ALPHATOCOVERAGEENABLE);
			return alphaToCoverageEnable_!=0;
		}

		default VkPipelineMultisampleStateCreateInfo alphaToOneEnable(boolean alphaToOneEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.ALPHATOONEENABLE, alphaToOneEnable?1:0);
			return this;
		}

		default boolean alphaToOneEnable(){
			final var alphaToOneEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.ALPHATOONEENABLE);
			return alphaToOneEnable_!=0;
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineMultisampleStateCreateInfo from the given Arena.
		*/
		public static VkPipelineMultisampleStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineMultisampleStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineMultisampleStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.SIZEOF, (mem)->(VkPipelineMultisampleStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineDepthStencilStateCreateFlagBits.html">VkPipelineDepthStencilStateCreateFlagBits</a>
	*/
	public interface VkPipelineDepthStencilStateCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueueFamilyProperties.html">VkQueueFamilyProperties</a>
	*/
	public interface VkQueueFamilyProperties extends io.github.kartoffell.klvulkan.Element<VkQueueFamilyProperties>{
		/**
		Queue flags
		*/
		@Nullable
		default int queueFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueueFamilyProperties.QUEUEFLAGS);
		}

		default int queueCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueueFamilyProperties.QUEUECOUNT);
		}

		default int timestampValidBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueueFamilyProperties.TIMESTAMPVALIDBITS);
		}

		/**
		Minimum alignment requirement for image transfers
		*/
		default VkExtent3D minImageTransferGranularity(){
			final var minImageTransferGranularity_ = address().asSlice(org.lwjgl.vulkan.VkQueueFamilyProperties.MINIMAGETRANSFERGRANULARITY, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (minImageTransferGranularity_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->minImageTransferGranularity_);
		}

		MemorySegment address();

		/**
		Allocates a new VkQueueFamilyProperties from the given Arena.
		*/
		public static VkQueueFamilyProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkQueueFamilyProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkQueueFamilyProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF, (mem)->(VkQueueFamilyProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBuffer.html">VkCommandBuffer</a>
	*/
	public static class VkCommandBuffer implements io.github.kartoffell.klvulkan.Element<VkCommandBuffer>{
		protected final MemorySegment address;

		protected final VkCommandPool parent;

		protected final VkCapabilitiesDevice capabilities;

		public MemorySegment address() {
			return address;
		}

		public VkCommandPool parent() {
			return parent;
		}

		public VkCapabilitiesDevice capabilities() {
			return capabilities;
		}

		public VkCommandBuffer(MemorySegment address, VkCommandPool parent) {
			this.address = address;
			this.parent = parent;
			this.capabilities = parent.parent.capabilities;
		}

		public static PointerBuffer<? extends VkCommandBuffer> pointer(Arena arena, int count, VkCommandPool parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent.parent).VkCommandBuffer(mem, parent)); //VkCommandBuffer
		}

		public static PointerBuffer<? extends VkCommandBuffer> pointer(Arena arena, VkCommandPool parent) {
			return pointer(arena, 1, parent);
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDrawIndexedIndirect.html">vkCmdDrawIndexedIndirect</a>
		*/
		public void vkCmdDrawIndexedIndirect(Element<? extends VkBuffer> buffer, long offset, int drawCount, int stride) {
			if(capabilities.vkCmdDrawIndexedIndirect_==null) {
				capabilities.vkCmdDrawIndexedIndirect_ = capabilities.lookup("vkCmdDrawIndexedIndirect", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDrawIndexedIndirect_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), offset, drawCount, stride);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkResetCommandBuffer.html">vkResetCommandBuffer</a>
		*/
		public void vkResetCommandBuffer(@Nullable int flags) {
			if(capabilities.vkResetCommandBuffer_==null) {
				capabilities.vkResetCommandBuffer_ = capabilities.lookup("vkResetCommandBuffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				final var return_ = (int) capabilities.vkResetCommandBuffer_.invoke(address(), flags);
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetStencilReference.html">vkCmdSetStencilReference</a>
		*/
		public void vkCmdSetStencilReference(int faceMask, int reference) {
			if(capabilities.vkCmdSetStencilReference_==null) {
				capabilities.vkCmdSetStencilReference_ = capabilities.lookup("vkCmdSetStencilReference", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetStencilReference_.invoke(address(), faceMask, reference);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetBlendConstants.html">vkCmdSetBlendConstants</a>
		*/
		public void vkCmdSetBlendConstants(FloatBuffer blendConstants) {
			if(capabilities.vkCmdSetBlendConstants_==null) {
				capabilities.vkCmdSetBlendConstants_ = capabilities.lookup("vkCmdSetBlendConstants", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetBlendConstants_.invoke(address(), (blendConstants==null?MemorySegment.NULL:MemorySegment.ofBuffer(blendConstants)));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBindVertexBuffers.html">vkCmdBindVertexBuffers</a>
		*/
		public void vkCmdBindVertexBuffers(int firstBinding, int bindingCount, PointerBuffer<? extends Element<? extends VkBuffer>> pBuffers, LongBuffer pOffsets) {
			if(capabilities.vkCmdBindVertexBuffers_==null) {
				capabilities.vkCmdBindVertexBuffers_ = capabilities.lookup("vkCmdBindVertexBuffers", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBindVertexBuffers_.invoke(address(), firstBinding, bindingCount, (pBuffers==null?MemorySegment.NULL:pBuffers.address()), (pOffsets==null?MemorySegment.NULL:MemorySegment.ofBuffer(pOffsets)));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdClearColorImage.html">vkCmdClearColorImage</a>
		*/
		public void vkCmdClearColorImage(Element<? extends VkImage> image, int imageLayout, Element<VkClearColorValue> pColor, int rangeCount, Element<VkImageSubresourceRange> pRanges) {
			if(capabilities.vkCmdClearColorImage_==null) {
				capabilities.vkCmdClearColorImage_ = capabilities.lookup("vkCmdClearColorImage", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdClearColorImage_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), imageLayout, (pColor==null?MemorySegment.NULL:pColor.address()), rangeCount, (pRanges==null?MemorySegment.NULL:pRanges.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdNextSubpass.html">vkCmdNextSubpass</a>
		*/
		public void vkCmdNextSubpass(int contents) {
			if(capabilities.vkCmdNextSubpass_==null) {
				capabilities.vkCmdNextSubpass_ = capabilities.lookup("vkCmdNextSubpass", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdNextSubpass_.invoke(address(), contents);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyImage.html">vkCmdCopyImage</a>
		*/
		public void vkCmdCopyImage(Element<? extends VkImage> srcImage, int srcImageLayout, Element<? extends VkImage> dstImage, int dstImageLayout, int regionCount, Element<VkImageCopy> pRegions) {
			if(capabilities.vkCmdCopyImage_==null) {
				capabilities.vkCmdCopyImage_ = capabilities.lookup("vkCmdCopyImage", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyImage_.invoke(address(), (srcImage==null?MemorySegment.NULL:srcImage.address()), srcImageLayout, (dstImage==null?MemorySegment.NULL:dstImage.address()), dstImageLayout, regionCount, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetScissor.html">vkCmdSetScissor</a>
		*/
		public void vkCmdSetScissor(int firstScissor, int scissorCount, Element<VkRect2D> pScissors) {
			if(capabilities.vkCmdSetScissor_==null) {
				capabilities.vkCmdSetScissor_ = capabilities.lookup("vkCmdSetScissor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetScissor_.invoke(address(), firstScissor, scissorCount, (pScissors==null?MemorySegment.NULL:pScissors.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdEndRenderPass.html">vkCmdEndRenderPass</a>
		*/
		public void vkCmdEndRenderPass() {
			if(capabilities.vkCmdEndRenderPass_==null) {
				capabilities.vkCmdEndRenderPass_ = capabilities.lookup("vkCmdEndRenderPass", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdEndRenderPass_.invoke(address());
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetEvent.html">vkCmdSetEvent</a>
		*/
		public void vkCmdSetEvent(Element<? extends VkEvent> event, @Nullable int stageMask) {
			if(capabilities.vkCmdSetEvent_==null) {
				capabilities.vkCmdSetEvent_ = capabilities.lookup("vkCmdSetEvent", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetEvent_.invoke(address(), (event==null?MemorySegment.NULL:event.address()), stageMask);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdClearDepthStencilImage.html">vkCmdClearDepthStencilImage</a>
		*/
		public void vkCmdClearDepthStencilImage(Element<? extends VkImage> image, int imageLayout, Element<VkClearDepthStencilValue> pDepthStencil, int rangeCount, Element<VkImageSubresourceRange> pRanges) {
			if(capabilities.vkCmdClearDepthStencilImage_==null) {
				capabilities.vkCmdClearDepthStencilImage_ = capabilities.lookup("vkCmdClearDepthStencilImage", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdClearDepthStencilImage_.invoke(address(), (image==null?MemorySegment.NULL:image.address()), imageLayout, (pDepthStencil==null?MemorySegment.NULL:pDepthStencil.address()), rangeCount, (pRanges==null?MemorySegment.NULL:pRanges.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdWaitEvents.html">vkCmdWaitEvents</a>
		*/
		public void vkCmdWaitEvents(int eventCount, PointerBuffer<? extends Element<? extends VkEvent>> pEvents, @Nullable int srcStageMask, @Nullable int dstStageMask, @Nullable int memoryBarrierCount, Element<VkMemoryBarrier> pMemoryBarriers, @Nullable int bufferMemoryBarrierCount, Element<VkBufferMemoryBarrier> pBufferMemoryBarriers, @Nullable int imageMemoryBarrierCount, Element<VkImageMemoryBarrier> pImageMemoryBarriers) {
			if(capabilities.vkCmdWaitEvents_==null) {
				capabilities.vkCmdWaitEvents_ = capabilities.lookup("vkCmdWaitEvents", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdWaitEvents_.invoke(address(), eventCount, (pEvents==null?MemorySegment.NULL:pEvents.address()), srcStageMask, dstStageMask, memoryBarrierCount, (pMemoryBarriers==null?MemorySegment.NULL:pMemoryBarriers.address()), bufferMemoryBarrierCount, (pBufferMemoryBarriers==null?MemorySegment.NULL:pBufferMemoryBarriers.address()), imageMemoryBarrierCount, (pImageMemoryBarriers==null?MemorySegment.NULL:pImageMemoryBarriers.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetStencilWriteMask.html">vkCmdSetStencilWriteMask</a>
		*/
		public void vkCmdSetStencilWriteMask(int faceMask, int writeMask) {
			if(capabilities.vkCmdSetStencilWriteMask_==null) {
				capabilities.vkCmdSetStencilWriteMask_ = capabilities.lookup("vkCmdSetStencilWriteMask", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetStencilWriteMask_.invoke(address(), faceMask, writeMask);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDrawIndirect.html">vkCmdDrawIndirect</a>
		*/
		public void vkCmdDrawIndirect(Element<? extends VkBuffer> buffer, long offset, int drawCount, int stride) {
			if(capabilities.vkCmdDrawIndirect_==null) {
				capabilities.vkCmdDrawIndirect_ = capabilities.lookup("vkCmdDrawIndirect", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDrawIndirect_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), offset, drawCount, stride);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDepthBounds.html">vkCmdSetDepthBounds</a>
		*/
		public void vkCmdSetDepthBounds(float minDepthBounds, float maxDepthBounds) {
			if(capabilities.vkCmdSetDepthBounds_==null) {
				capabilities.vkCmdSetDepthBounds_ = capabilities.lookup("vkCmdSetDepthBounds", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
			}
			try {
				capabilities.vkCmdSetDepthBounds_.invoke(address(), minDepthBounds, maxDepthBounds);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetDepthBias.html">vkCmdSetDepthBias</a>
		*/
		public void vkCmdSetDepthBias(float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
			if(capabilities.vkCmdSetDepthBias_==null) {
				capabilities.vkCmdSetDepthBias_ = capabilities.lookup("vkCmdSetDepthBias", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
			}
			try {
				capabilities.vkCmdSetDepthBias_.invoke(address(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPushConstants.html">vkCmdPushConstants</a>
		*/
		public void vkCmdPushConstants(Element<? extends VkPipelineLayout> layout, int stageFlags, int offset, int size, MemorySegment pValues) {
			if(capabilities.vkCmdPushConstants_==null) {
				capabilities.vkCmdPushConstants_ = capabilities.lookup("vkCmdPushConstants", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPushConstants_.invoke(address(), (layout==null?MemorySegment.NULL:layout.address()), stageFlags, offset, size, pValues);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdFillBuffer.html">vkCmdFillBuffer</a>
		*/
		public void vkCmdFillBuffer(Element<? extends VkBuffer> dstBuffer, long dstOffset, long size, int data) {
			if(capabilities.vkCmdFillBuffer_==null) {
				capabilities.vkCmdFillBuffer_ = capabilities.lookup("vkCmdFillBuffer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdFillBuffer_.invoke(address(), (dstBuffer==null?MemorySegment.NULL:dstBuffer.address()), dstOffset, size, data);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBlitImage.html">vkCmdBlitImage</a>
		*/
		public void vkCmdBlitImage(Element<? extends VkImage> srcImage, int srcImageLayout, Element<? extends VkImage> dstImage, int dstImageLayout, int regionCount, Element<VkImageBlit> pRegions, int filter) {
			if(capabilities.vkCmdBlitImage_==null) {
				capabilities.vkCmdBlitImage_ = capabilities.lookup("vkCmdBlitImage", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdBlitImage_.invoke(address(), (srcImage==null?MemorySegment.NULL:srcImage.address()), srcImageLayout, (dstImage==null?MemorySegment.NULL:dstImage.address()), dstImageLayout, regionCount, (pRegions==null?MemorySegment.NULL:pRegions.address()), filter);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@throws VulkanError VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR, <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">see</a>
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEndCommandBuffer.html">vkEndCommandBuffer</a>
		*/
		public void vkEndCommandBuffer() {
			if(capabilities.vkEndCommandBuffer_==null) {
				capabilities.vkEndCommandBuffer_ = capabilities.lookup("vkEndCommandBuffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkEndCommandBuffer_.invoke(address());
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdEndQuery.html">vkCmdEndQuery</a>
		*/
		public void vkCmdEndQuery(Element<? extends VkQueryPool> queryPool, int query) {
			if(capabilities.vkCmdEndQuery_==null) {
				capabilities.vkCmdEndQuery_ = capabilities.lookup("vkCmdEndQuery", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdEndQuery_.invoke(address(), (queryPool==null?MemorySegment.NULL:queryPool.address()), query);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetLineWidth.html">vkCmdSetLineWidth</a>
		*/
		public void vkCmdSetLineWidth(float lineWidth) {
			if(capabilities.vkCmdSetLineWidth_==null) {
				capabilities.vkCmdSetLineWidth_ = capabilities.lookup("vkCmdSetLineWidth", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
			}
			try {
				capabilities.vkCmdSetLineWidth_.invoke(address(), lineWidth);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDispatchIndirect.html">vkCmdDispatchIndirect</a>
		*/
		public void vkCmdDispatchIndirect(Element<? extends VkBuffer> buffer, long offset) {
			if(capabilities.vkCmdDispatchIndirect_==null) {
				capabilities.vkCmdDispatchIndirect_ = capabilities.lookup("vkCmdDispatchIndirect", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
			}
			try {
				capabilities.vkCmdDispatchIndirect_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), offset);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdPipelineBarrier.html">vkCmdPipelineBarrier</a>
		*/
		public void vkCmdPipelineBarrier(@Nullable int srcStageMask, @Nullable int dstStageMask, @Nullable int dependencyFlags, @Nullable int memoryBarrierCount, Element<VkMemoryBarrier> pMemoryBarriers, @Nullable int bufferMemoryBarrierCount, Element<VkBufferMemoryBarrier> pBufferMemoryBarriers, @Nullable int imageMemoryBarrierCount, Element<VkImageMemoryBarrier> pImageMemoryBarriers) {
			if(capabilities.vkCmdPipelineBarrier_==null) {
				capabilities.vkCmdPipelineBarrier_ = capabilities.lookup("vkCmdPipelineBarrier", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdPipelineBarrier_.invoke(address(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, (pMemoryBarriers==null?MemorySegment.NULL:pMemoryBarriers.address()), bufferMemoryBarrierCount, (pBufferMemoryBarriers==null?MemorySegment.NULL:pBufferMemoryBarriers.address()), imageMemoryBarrierCount, (pImageMemoryBarriers==null?MemorySegment.NULL:pImageMemoryBarriers.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetStencilCompareMask.html">vkCmdSetStencilCompareMask</a>
		*/
		public void vkCmdSetStencilCompareMask(int faceMask, int compareMask) {
			if(capabilities.vkCmdSetStencilCompareMask_==null) {
				capabilities.vkCmdSetStencilCompareMask_ = capabilities.lookup("vkCmdSetStencilCompareMask", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdSetStencilCompareMask_.invoke(address(), faceMask, compareMask);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyImageToBuffer.html">vkCmdCopyImageToBuffer</a>
		*/
		public void vkCmdCopyImageToBuffer(Element<? extends VkImage> srcImage, int srcImageLayout, Element<? extends VkBuffer> dstBuffer, int regionCount, Element<VkBufferImageCopy> pRegions) {
			if(capabilities.vkCmdCopyImageToBuffer_==null) {
				capabilities.vkCmdCopyImageToBuffer_ = capabilities.lookup("vkCmdCopyImageToBuffer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyImageToBuffer_.invoke(address(), (srcImage==null?MemorySegment.NULL:srcImage.address()), srcImageLayout, (dstBuffer==null?MemorySegment.NULL:dstBuffer.address()), regionCount, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyQueryPoolResults.html">vkCmdCopyQueryPoolResults</a>
		*/
		public void vkCmdCopyQueryPoolResults(Element<? extends VkQueryPool> queryPool, int firstQuery, int queryCount, Element<? extends VkBuffer> dstBuffer, long dstOffset, long stride, @Nullable int flags) {
			if(capabilities.vkCmdCopyQueryPoolResults_==null) {
				capabilities.vkCmdCopyQueryPoolResults_ = capabilities.lookup("vkCmdCopyQueryPoolResults", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdCopyQueryPoolResults_.invoke(address(), (queryPool==null?MemorySegment.NULL:queryPool.address()), firstQuery, queryCount, (dstBuffer==null?MemorySegment.NULL:dstBuffer.address()), dstOffset, stride, flags);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdClearAttachments.html">vkCmdClearAttachments</a>
		*/
		public void vkCmdClearAttachments(int attachmentCount, Element<VkClearAttachment> pAttachments, int rectCount, Element<VkClearRect> pRects) {
			if(capabilities.vkCmdClearAttachments_==null) {
				capabilities.vkCmdClearAttachments_ = capabilities.lookup("vkCmdClearAttachments", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdClearAttachments_.invoke(address(), attachmentCount, (pAttachments==null?MemorySegment.NULL:pAttachments.address()), rectCount, (pRects==null?MemorySegment.NULL:pRects.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdResetEvent.html">vkCmdResetEvent</a>
		*/
		public void vkCmdResetEvent(Element<? extends VkEvent> event, @Nullable int stageMask) {
			if(capabilities.vkCmdResetEvent_==null) {
				capabilities.vkCmdResetEvent_ = capabilities.lookup("vkCmdResetEvent", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdResetEvent_.invoke(address(), (event==null?MemorySegment.NULL:event.address()), stageMask);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBindPipeline.html">vkCmdBindPipeline</a>
		*/
		public void vkCmdBindPipeline(int pipelineBindPoint, Element<? extends VkPipeline> pipeline) {
			if(capabilities.vkCmdBindPipeline_==null) {
				capabilities.vkCmdBindPipeline_ = capabilities.lookup("vkCmdBindPipeline", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBindPipeline_.invoke(address(), pipelineBindPoint, (pipeline==null?MemorySegment.NULL:pipeline.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkBeginCommandBuffer.html">vkBeginCommandBuffer</a>
		*/
		public void vkBeginCommandBuffer(Element<VkCommandBufferBeginInfo> pBeginInfo) {
			if(capabilities.vkBeginCommandBuffer_==null) {
				capabilities.vkBeginCommandBuffer_ = capabilities.lookup("vkBeginCommandBuffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkBeginCommandBuffer_.invoke(address(), (pBeginInfo==null?MemorySegment.NULL:pBeginInfo.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdExecuteCommands.html">vkCmdExecuteCommands</a>
		*/
		public void vkCmdExecuteCommands(int commandBufferCount, PointerBuffer<? extends Element<? extends VkCommandBuffer>> pCommandBuffers) {
			if(capabilities.vkCmdExecuteCommands_==null) {
				capabilities.vkCmdExecuteCommands_ = capabilities.lookup("vkCmdExecuteCommands", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdExecuteCommands_.invoke(address(), commandBufferCount, (pCommandBuffers==null?MemorySegment.NULL:pCommandBuffers.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyBuffer.html">vkCmdCopyBuffer</a>
		*/
		public void vkCmdCopyBuffer(Element<? extends VkBuffer> srcBuffer, Element<? extends VkBuffer> dstBuffer, int regionCount, Element<VkBufferCopy> pRegions) {
			if(capabilities.vkCmdCopyBuffer_==null) {
				capabilities.vkCmdCopyBuffer_ = capabilities.lookup("vkCmdCopyBuffer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyBuffer_.invoke(address(), (srcBuffer==null?MemorySegment.NULL:srcBuffer.address()), (dstBuffer==null?MemorySegment.NULL:dstBuffer.address()), regionCount, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBeginQuery.html">vkCmdBeginQuery</a>
		*/
		public void vkCmdBeginQuery(Element<? extends VkQueryPool> queryPool, int query, @Nullable int flags) {
			if(capabilities.vkCmdBeginQuery_==null) {
				capabilities.vkCmdBeginQuery_ = capabilities.lookup("vkCmdBeginQuery", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdBeginQuery_.invoke(address(), (queryPool==null?MemorySegment.NULL:queryPool.address()), query, flags);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdCopyBufferToImage.html">vkCmdCopyBufferToImage</a>
		*/
		public void vkCmdCopyBufferToImage(Element<? extends VkBuffer> srcBuffer, Element<? extends VkImage> dstImage, int dstImageLayout, int regionCount, Element<VkBufferImageCopy> pRegions) {
			if(capabilities.vkCmdCopyBufferToImage_==null) {
				capabilities.vkCmdCopyBufferToImage_ = capabilities.lookup("vkCmdCopyBufferToImage", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdCopyBufferToImage_.invoke(address(), (srcBuffer==null?MemorySegment.NULL:srcBuffer.address()), (dstImage==null?MemorySegment.NULL:dstImage.address()), dstImageLayout, regionCount, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdSetViewport.html">vkCmdSetViewport</a>
		*/
		public void vkCmdSetViewport(int firstViewport, int viewportCount, Element<VkViewport> pViewports) {
			if(capabilities.vkCmdSetViewport_==null) {
				capabilities.vkCmdSetViewport_ = capabilities.lookup("vkCmdSetViewport", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdSetViewport_.invoke(address(), firstViewport, viewportCount, (pViewports==null?MemorySegment.NULL:pViewports.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBindDescriptorSets.html">vkCmdBindDescriptorSets</a>
		*/
		public void vkCmdBindDescriptorSets(int pipelineBindPoint, Element<? extends VkPipelineLayout> layout, int firstSet, int descriptorSetCount, PointerBuffer<? extends Element<? extends VkDescriptorSet>> pDescriptorSets, @Nullable int dynamicOffsetCount, IntBuffer pDynamicOffsets) {
			if(capabilities.vkCmdBindDescriptorSets_==null) {
				capabilities.vkCmdBindDescriptorSets_ = capabilities.lookup("vkCmdBindDescriptorSets", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdBindDescriptorSets_.invoke(address(), pipelineBindPoint, (layout==null?MemorySegment.NULL:layout.address()), firstSet, descriptorSetCount, (pDescriptorSets==null?MemorySegment.NULL:pDescriptorSets.address()), dynamicOffsetCount, (pDynamicOffsets==null?MemorySegment.NULL:MemorySegment.ofBuffer(pDynamicOffsets)));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdWriteTimestamp.html">vkCmdWriteTimestamp</a>
		*/
		public void vkCmdWriteTimestamp(int pipelineStage, Element<? extends VkQueryPool> queryPool, int query) {
			if(capabilities.vkCmdWriteTimestamp_==null) {
				capabilities.vkCmdWriteTimestamp_ = capabilities.lookup("vkCmdWriteTimestamp", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdWriteTimestamp_.invoke(address(), pipelineStage, (queryPool==null?MemorySegment.NULL:queryPool.address()), query);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBindIndexBuffer.html">vkCmdBindIndexBuffer</a>
		*/
		public void vkCmdBindIndexBuffer(@Nullable Element<? extends VkBuffer> buffer, long offset, int indexType) {
			if(capabilities.vkCmdBindIndexBuffer_==null) {
				capabilities.vkCmdBindIndexBuffer_ = capabilities.lookup("vkCmdBindIndexBuffer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdBindIndexBuffer_.invoke(address(), (buffer==null?MemorySegment.NULL:buffer.address()), offset, indexType);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdUpdateBuffer.html">vkCmdUpdateBuffer</a>
		*/
		public void vkCmdUpdateBuffer(Element<? extends VkBuffer> dstBuffer, long dstOffset, long dataSize, MemorySegment pData) {
			if(capabilities.vkCmdUpdateBuffer_==null) {
				capabilities.vkCmdUpdateBuffer_ = capabilities.lookup("vkCmdUpdateBuffer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdUpdateBuffer_.invoke(address(), (dstBuffer==null?MemorySegment.NULL:dstBuffer.address()), dstOffset, dataSize, pData);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdBeginRenderPass.html">vkCmdBeginRenderPass</a>
		*/
		public void vkCmdBeginRenderPass(Element<VkRenderPassBeginInfo> pRenderPassBegin, int contents) {
			if(capabilities.vkCmdBeginRenderPass_==null) {
				capabilities.vkCmdBeginRenderPass_ = capabilities.lookup("vkCmdBeginRenderPass", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdBeginRenderPass_.invoke(address(), (pRenderPassBegin==null?MemorySegment.NULL:pRenderPassBegin.address()), contents);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdResolveImage.html">vkCmdResolveImage</a>
		*/
		public void vkCmdResolveImage(Element<? extends VkImage> srcImage, int srcImageLayout, Element<? extends VkImage> dstImage, int dstImageLayout, int regionCount, Element<VkImageResolve> pRegions) {
			if(capabilities.vkCmdResolveImage_==null) {
				capabilities.vkCmdResolveImage_ = capabilities.lookup("vkCmdResolveImage", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkCmdResolveImage_.invoke(address(), (srcImage==null?MemorySegment.NULL:srcImage.address()), srcImageLayout, (dstImage==null?MemorySegment.NULL:dstImage.address()), dstImageLayout, regionCount, (pRegions==null?MemorySegment.NULL:pRegions.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDispatch.html">vkCmdDispatch</a>
		*/
		public void vkCmdDispatch(int groupCountX, int groupCountY, int groupCountZ) {
			if(capabilities.vkCmdDispatch_==null) {
				capabilities.vkCmdDispatch_ = capabilities.lookup("vkCmdDispatch", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDispatch_.invoke(address(), groupCountX, groupCountY, groupCountZ);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdResetQueryPool.html">vkCmdResetQueryPool</a>
		*/
		public void vkCmdResetQueryPool(Element<? extends VkQueryPool> queryPool, int firstQuery, int queryCount) {
			if(capabilities.vkCmdResetQueryPool_==null) {
				capabilities.vkCmdResetQueryPool_ = capabilities.lookup("vkCmdResetQueryPool", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdResetQueryPool_.invoke(address(), (queryPool==null?MemorySegment.NULL:queryPool.address()), firstQuery, queryCount);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDraw.html">vkCmdDraw</a>
		*/
		public void vkCmdDraw(int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
			if(capabilities.vkCmdDraw_==null) {
				capabilities.vkCmdDraw_ = capabilities.lookup("vkCmdDraw", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDraw_.invoke(address(), vertexCount, instanceCount, firstVertex, firstInstance);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		Conditional rendering
		Cmdbuffer levels: [primary, secondary]
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCmdDrawIndexed.html">vkCmdDrawIndexed</a>
		*/
		public void vkCmdDrawIndexed(int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
			if(capabilities.vkCmdDrawIndexed_==null) {
				capabilities.vkCmdDrawIndexed_ = capabilities.lookup("vkCmdDrawIndexed", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
			}
			try {
				capabilities.vkCmdDrawIndexed_.invoke(address(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandPoolResetFlagBits.html">VkCommandPoolResetFlagBits</a>
	*/
	public interface VkCommandPoolResetFlagBits{
		public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryMapFlagBits.html">VkMemoryMapFlagBits</a>
	*/
	public interface VkMemoryMapFlagBits{
	}

	public interface API_Constants{
		public static final int VK_MAX_EXTENSION_NAME_SIZE = 256;

		public static final int VK_SUBPASS_EXTERNAL = (~0);

		public static final int VK_MAX_MEMORY_TYPES = 32;

		public static final int VK_QUEUE_FAMILY_IGNORED = (~0);

		public static final int VK_ATTACHMENT_UNUSED = (~0);

		public static final float VK_LOD_CLAMP_NONE = 1000.0F;

		public static final long VK_WHOLE_SIZE = (~0L);

		public static final int VK_MAX_MEMORY_HEAPS = 16;

		public static final int VK_FALSE = 0;

		public static final int VK_REMAINING_ARRAY_LAYERS = (~0);

		public static final int VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;

		public static final int VK_TRUE = 1;

		public static final int VK_REMAINING_MIP_LEVELS = (~0);

		public static final int VK_MAX_DESCRIPTION_SIZE = 256;

		public static final int VK_UUID_SIZE = 16;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueryPipelineStatisticFlagBits.html">VkQueryPipelineStatisticFlagBits</a>
	*/
	public interface VkQueryPipelineStatisticFlagBits{
		public static final int VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = 4;

		public static final int VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = 1024;

		public static final int VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = 128;

		public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 1;

		public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = 2;

		public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = 8;

		public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = 32;

		public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = 64;

		public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 512;

		public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = 16;

		public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = 256;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferViewCreateInfo.html">VkBufferViewCreateInfo</a>
	*/
	public interface VkBufferViewCreateInfo extends io.github.kartoffell.klvulkan.Element<VkBufferViewCreateInfo>{
		default VkBufferViewCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferViewCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferViewCreateInfo.STYPE);
		}

		default VkBufferViewCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferViewCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferViewCreateInfo.PNEXT);
		}

		default VkBufferViewCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferViewCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferViewCreateInfo.FLAGS);
		}

		default VkBufferViewCreateInfo buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferViewCreateInfo.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferViewCreateInfo.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		/**
		Optionally specifies format of elements
		*/
		default VkBufferViewCreateInfo format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferViewCreateInfo.FORMAT, format);
			return this;
		}

		/**
		Optionally specifies format of elements
		*/
		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferViewCreateInfo.FORMAT);
		}

		/**
		Specified in bytes
		*/
		default VkBufferViewCreateInfo offset(long offset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferViewCreateInfo.OFFSET, offset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long offset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferViewCreateInfo.OFFSET);
		}

		/**
		View size specified in bytes
		*/
		default VkBufferViewCreateInfo range(long range){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferViewCreateInfo.RANGE, range);
			return this;
		}

		/**
		View size specified in bytes
		*/
		default long range(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferViewCreateInfo.RANGE);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferViewCreateInfo from the given Arena.
		*/
		public static VkBufferViewCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferViewCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferViewCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferViewCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferViewCreateInfo.SIZEOF, (mem)->(VkBufferViewCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSystemAllocationScope.html">VkSystemAllocationScope</a>
	*/
	public interface VkSystemAllocationScope{
		public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;

		public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

		public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;

		public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;

		public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFenceCreateFlagBits.html">VkFenceCreateFlagBits</a>
	*/
	public interface VkFenceCreateFlagBits{
		public static final int VK_FENCE_CREATE_SIGNALED_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineDepthStencilStateCreateInfo.html">VkPipelineDepthStencilStateCreateInfo</a>
	*/
	public interface VkPipelineDepthStencilStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineDepthStencilStateCreateInfo>{
		default VkPipelineDepthStencilStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.STYPE);
		}

		default VkPipelineDepthStencilStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.PNEXT);
		}

		default VkPipelineDepthStencilStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.FLAGS);
		}

		default VkPipelineDepthStencilStateCreateInfo depthTestEnable(boolean depthTestEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHTESTENABLE, depthTestEnable?1:0);
			return this;
		}

		default boolean depthTestEnable(){
			final var depthTestEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHTESTENABLE);
			return depthTestEnable_!=0;
		}

		default VkPipelineDepthStencilStateCreateInfo depthWriteEnable(boolean depthWriteEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHWRITEENABLE, depthWriteEnable?1:0);
			return this;
		}

		default boolean depthWriteEnable(){
			final var depthWriteEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHWRITEENABLE);
			return depthWriteEnable_!=0;
		}

		default VkPipelineDepthStencilStateCreateInfo depthCompareOp(int depthCompareOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHCOMPAREOP, depthCompareOp);
			return this;
		}

		default int depthCompareOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHCOMPAREOP);
		}

		/**
		optional (depth_bounds_test)
		*/
		default VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(boolean depthBoundsTestEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHBOUNDSTESTENABLE, depthBoundsTestEnable?1:0);
			return this;
		}

		/**
		optional (depth_bounds_test)
		*/
		default boolean depthBoundsTestEnable(){
			final var depthBoundsTestEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.DEPTHBOUNDSTESTENABLE);
			return depthBoundsTestEnable_!=0;
		}

		default VkPipelineDepthStencilStateCreateInfo stencilTestEnable(boolean stencilTestEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.STENCILTESTENABLE, stencilTestEnable?1:0);
			return this;
		}

		default boolean stencilTestEnable(){
			final var stencilTestEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.STENCILTESTENABLE);
			return stencilTestEnable_!=0;
		}

		default VkStencilOpState front(){
			final var front_ = address().asSlice(org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.FRONT, org.lwjgl.vulkan.VkStencilOpState.SIZEOF);
			return (front_.equals(MemorySegment.NULL)?null:(VkStencilOpState)()->front_);
		}

		default VkStencilOpState back(){
			final var back_ = address().asSlice(org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.BACK, org.lwjgl.vulkan.VkStencilOpState.SIZEOF);
			return (back_.equals(MemorySegment.NULL)?null:(VkStencilOpState)()->back_);
		}

		default VkPipelineDepthStencilStateCreateInfo minDepthBounds(float minDepthBounds){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.MINDEPTHBOUNDS, minDepthBounds);
			return this;
		}

		default float minDepthBounds(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.MINDEPTHBOUNDS);
		}

		default VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float maxDepthBounds){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.MAXDEPTHBOUNDS, maxDepthBounds);
			return this;
		}

		default float maxDepthBounds(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.MAXDEPTHBOUNDS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineDepthStencilStateCreateInfo from the given Arena.
		*/
		public static VkPipelineDepthStencilStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineDepthStencilStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineDepthStencilStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.SIZEOF, (mem)->(VkPipelineDepthStencilStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkInstance.html">VkInstance</a>
	*/
	public static class VkInstance implements io.github.kartoffell.klvulkan.Element<VkInstance>{
		protected final MemorySegment address;

		protected final VK10 parent;

		protected final VkCapabilitiesInstance capabilities;

		public MemorySegment address() {
			return address;
		}

		public VK10 parent() {
			return parent;
		}

		public VkCapabilitiesInstance capabilities() {
			return capabilities;
		}

		public VkInstance(MemorySegment address, VK10 parent) {
			this.address = address;
			this.parent = parent;
			this.capabilities = new VkCapabilitiesInstance(parent.capabilities.vkGetInstanceProcAddr_, this.address);
		}

		/**
		@return (PFN_vkVoidFunction)
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetInstanceProcAddr.html">vkGetInstanceProcAddr</a>
		*/
		public Element<? extends PFN_vkVoidFunction> vkGetInstanceProcAddr(CString pName) {
			if(capabilities.vkGetInstanceProcAddr_==null) {
				capabilities.vkGetInstanceProcAddr_ = capabilities.lookup("vkGetInstanceProcAddr", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (MemorySegment) capabilities.vkGetInstanceProcAddr_.invoke(address(), pName==null?MemorySegment.NULL:pName.address());
				return (return_.equals(MemorySegment.NULL)?null:(Element<? extends PFN_vkVoidFunction>)()->return_);
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEnumeratePhysicalDevices.html">vkEnumeratePhysicalDevices</a>
		*/
		public int vkEnumeratePhysicalDevices(IntBuffer pPhysicalDeviceCount, @Nullable PointerBuffer<? extends Element<? extends VkPhysicalDevice>> pPhysicalDevices) {
			if(capabilities.vkEnumeratePhysicalDevices_==null) {
				capabilities.vkEnumeratePhysicalDevices_ = capabilities.lookup("vkEnumeratePhysicalDevices", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkEnumeratePhysicalDevices_.invoke(address(), (pPhysicalDeviceCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPhysicalDeviceCount)), (pPhysicalDevices==null?MemorySegment.NULL:pPhysicalDevices.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkDestroyInstance.html">vkDestroyInstance</a>
		*/
		public void vkDestroyInstance(@Nullable Element<VkAllocationCallbacks> pAllocator) {
			if(capabilities.vkDestroyInstance_==null) {
				capabilities.vkDestroyInstance_ = capabilities.lookup("vkDestroyInstance", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkDestroyInstance_.invoke(address(), (pAllocator==null?MemorySegment.NULL:pAllocator.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		protected VkInstance VkInstance(MemorySegment mem, Object parent) {
			return new VkInstance(mem, (VK10) parent);
		}

		protected VkPhysicalDevice VkPhysicalDevice(MemorySegment mem, Object parent) {
			return new VkPhysicalDevice(mem, (VkInstance) parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetLayoutCreateFlagBits.html">VkDescriptorSetLayoutCreateFlagBits</a>
	*/
	public interface VkDescriptorSetLayoutCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkInternalAllocationNotification.html">PFN_vkInternalAllocationNotification</a>
	*/
	public static abstract class PFN_vkInternalAllocationNotification implements io.github.kartoffell.klvulkan.Element<PFN_vkInternalAllocationNotification>{
		protected final MemorySegment address;

		public final MethodHandle handle_;

		public final FunctionDescriptor descriptor_ = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);

		public MemorySegment address() {
			return address;
		}

		MethodHandle PFN_vkInternalAllocationNotification_;
		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkInternalAllocationNotification.html">PFN_vkInternalAllocationNotification</a>
		*/
		public abstract void PFN_vkInternalAllocationNotification(MemorySegment pUserData, long size, int allocationType, int allocationScope);

		 {
			try {
				handle_ =  MethodHandles.lookup().findVirtual(PFN_vkInternalAllocationNotification.class, "PFN_vkInternalAllocationNotification_", MethodType.methodType(void.class, MemorySegment.class, MemorySegment.class, int.class, int.class));
			} catch(Exception e) {throw new IllegalStateException(e);}
		}

		public PFN_vkInternalAllocationNotification(Arena arena) {
			this.address = Linker.nativeLinker().upcallStub(handle_, descriptor_, arena);
		}

		protected void PFN_vkInternalAllocationNotification_(MemorySegment pUserData, MemorySegment size, int allocationType, int allocationScope) {
			PFN_vkInternalAllocationNotification(pUserData, size.address(), allocationType, allocationScope);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkResult.html">VkResult</a>
	*/
	public interface VkResult{
		public static final int VK_EVENT_SET = 3;

		public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;

		public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;

		public static final int VK_ERROR_DEVICE_LOST = -4;

		public static final int VK_INCOMPLETE = 5;

		public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;

		public static final int VK_ERROR_UNKNOWN = -13;

		public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;

		public static final int VK_SUCCESS = 0;

		public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;

		public static final int VK_TIMEOUT = 2;

		public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;

		public static final int VK_ERROR_FRAGMENTED_POOL = -12;

		public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;

		public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;

		public static final int VK_EVENT_RESET = 4;

		public static final int VK_ERROR_INITIALIZATION_FAILED = -3;

		public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;

		public static final int VK_NOT_READY = 1;

		public static final int VK_ERROR_VALIDATION_FAILED = 1000011001;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceMemory.html">VkDeviceMemory</a>
	*/
	public static record VkDeviceMemory(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkDeviceMemory>{
		public static PointerBuffer<? extends VkDeviceMemory> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkDeviceMemory(mem, parent)); //VkDeviceMemory
		}

		public static PointerBuffer<? extends VkDeviceMemory> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryBarrier.html">VkMemoryBarrier</a>
	*/
	public interface VkMemoryBarrier extends io.github.kartoffell.klvulkan.Element<VkMemoryBarrier>{
		default VkMemoryBarrier sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier.STYPE);
		}

		default VkMemoryBarrier pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryBarrier.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryBarrier.PNEXT);
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		default VkMemoryBarrier srcAccessMask(int srcAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		@Nullable
		default int srcAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier.SRCACCESSMASK);
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		default VkMemoryBarrier dstAccessMask(int dstAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		@Nullable
		default int dstAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryBarrier.DSTACCESSMASK);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryBarrier from the given Arena.
		*/
		public static VkMemoryBarrier allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryBarrier.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryBarrier from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryBarrier> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryBarrier.SIZEOF, (mem)->(VkMemoryBarrier)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDrawIndexedIndirectCommand.html">VkDrawIndexedIndirectCommand</a>
	*/
	public interface VkDrawIndexedIndirectCommand extends io.github.kartoffell.klvulkan.Element<VkDrawIndexedIndirectCommand>{
		default VkDrawIndexedIndirectCommand indexCount(int indexCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.INDEXCOUNT, indexCount);
			return this;
		}

		default int indexCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.INDEXCOUNT);
		}

		default VkDrawIndexedIndirectCommand instanceCount(int instanceCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.INSTANCECOUNT, instanceCount);
			return this;
		}

		default int instanceCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.INSTANCECOUNT);
		}

		default VkDrawIndexedIndirectCommand firstIndex(int firstIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.FIRSTINDEX, firstIndex);
			return this;
		}

		default int firstIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.FIRSTINDEX);
		}

		default VkDrawIndexedIndirectCommand vertexOffset(int vertexOffset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.VERTEXOFFSET, vertexOffset);
			return this;
		}

		default int vertexOffset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.VERTEXOFFSET);
		}

		default VkDrawIndexedIndirectCommand firstInstance(int firstInstance){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.FIRSTINSTANCE, firstInstance);
			return this;
		}

		default int firstInstance(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.FIRSTINSTANCE);
		}

		MemorySegment address();

		/**
		Allocates a new VkDrawIndexedIndirectCommand from the given Arena.
		*/
		public static VkDrawIndexedIndirectCommand allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDrawIndexedIndirectCommand from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDrawIndexedIndirectCommand> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDrawIndexedIndirectCommand.SIZEOF, (mem)->(VkDrawIndexedIndirectCommand)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentStoreOp.html">VkAttachmentStoreOp</a>
	*/
	public interface VkAttachmentStoreOp{
		public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;

		public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferInheritanceInfo.html">VkCommandBufferInheritanceInfo</a>
	*/
	public interface VkCommandBufferInheritanceInfo extends io.github.kartoffell.klvulkan.Element<VkCommandBufferInheritanceInfo>{
		default VkCommandBufferInheritanceInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.STYPE);
		}

		default VkCommandBufferInheritanceInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PNEXT);
		}

		/**
		Render pass for secondary command buffers
		*/
		default VkCommandBufferInheritanceInfo renderPass(Element<? extends VkRenderPass> renderPass){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.RENDERPASS, (renderPass==null?MemorySegment.NULL:renderPass.address()));
			return this;
		}

		/**
		Render pass for secondary command buffers
		*/
		@Nullable
		default Element<? extends VkRenderPass> renderPass(){
			final var renderPass_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.RENDERPASS);
			return (renderPass_.equals(MemorySegment.NULL)?null:(Element<? extends VkRenderPass>)()->renderPass_);
		}

		default VkCommandBufferInheritanceInfo subpass(int subpass){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SUBPASS, subpass);
			return this;
		}

		default int subpass(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SUBPASS);
		}

		/**
		Framebuffer for secondary command buffers
		*/
		default VkCommandBufferInheritanceInfo framebuffer(Element<? extends VkFramebuffer> framebuffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.FRAMEBUFFER, (framebuffer==null?MemorySegment.NULL:framebuffer.address()));
			return this;
		}

		/**
		Framebuffer for secondary command buffers
		*/
		@Nullable
		default Element<? extends VkFramebuffer> framebuffer(){
			final var framebuffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.FRAMEBUFFER);
			return (framebuffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkFramebuffer>)()->framebuffer_);
		}

		/**
		Whether this secondary command buffer may be executed during an occlusion query
		*/
		default VkCommandBufferInheritanceInfo occlusionQueryEnable(boolean occlusionQueryEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE, occlusionQueryEnable?1:0);
			return this;
		}

		/**
		Whether this secondary command buffer may be executed during an occlusion query
		*/
		default boolean occlusionQueryEnable(){
			final var occlusionQueryEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE);
			return occlusionQueryEnable_!=0;
		}

		/**
		Query flags used by this secondary command buffer, if executed during an occlusion query
		*/
		default VkCommandBufferInheritanceInfo queryFlags(int queryFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.QUERYFLAGS, queryFlags);
			return this;
		}

		/**
		Query flags used by this secondary command buffer, if executed during an occlusion query
		*/
		@Nullable
		default int queryFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.QUERYFLAGS);
		}

		/**
		Pipeline statistics that may be counted for this secondary command buffer
		*/
		default VkCommandBufferInheritanceInfo pipelineStatistics(int pipelineStatistics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PIPELINESTATISTICS, pipelineStatistics);
			return this;
		}

		/**
		Pipeline statistics that may be counted for this secondary command buffer
		*/
		@Nullable
		default int pipelineStatistics(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PIPELINESTATISTICS);
		}

		MemorySegment address();

		/**
		Allocates a new VkCommandBufferInheritanceInfo from the given Arena.
		*/
		public static VkCommandBufferInheritanceInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCommandBufferInheritanceInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCommandBufferInheritanceInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF, (mem)->(VkCommandBufferInheritanceInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExtensionProperties.html">VkExtensionProperties</a>
	*/
	public interface VkExtensionProperties extends io.github.kartoffell.klvulkan.Element<VkExtensionProperties>{
		/**
		extension name
		*/
		default CString extensionName(){
			final var extensionName_ = address().asSlice(org.lwjgl.vulkan.VkExtensionProperties.EXTENSIONNAME, API_Constants.VK_MAX_EXTENSION_NAME_SIZE);
			return extensionName_.equals(MemorySegment.NULL)?null:CString.wrap(extensionName_);
		}

		/**
		version of the extension specification implemented
		*/
		default int specVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtensionProperties.SPECVERSION);
		}

		MemorySegment address();

		/**
		Allocates a new VkExtensionProperties from the given Arena.
		*/
		public static VkExtensionProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExtensionProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkExtensionProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkExtensionProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExtensionProperties.SIZEOF, (mem)->(VkExtensionProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageAspectFlagBits.html">VkImageAspectFlagBits</a>
	*/
	public interface VkImageAspectFlagBits{
		public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 4;

		public static final int VK_IMAGE_ASPECT_METADATA_BIT = 8;

		public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 2;

		public static final int VK_IMAGE_ASPECT_COLOR_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentLoadOp.html">VkAttachmentLoadOp</a>
	*/
	public interface VkAttachmentLoadOp{
		public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;

		public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;

		public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSet.html">VkDescriptorSet</a>
	*/
	public static record VkDescriptorSet(MemorySegment address, VkDescriptorPool parent) implements io.github.kartoffell.klvulkan.Element<VkDescriptorSet>{
		public static PointerBuffer<? extends VkDescriptorSet> pointer(Arena arena, int count, VkDescriptorPool parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent.parent).VkDescriptorSet(mem, parent)); //VkDescriptorSet
		}

		public static PointerBuffer<? extends VkDescriptorSet> pointer(Arena arena, VkDescriptorPool parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMappedMemoryRange.html">VkMappedMemoryRange</a>
	*/
	public interface VkMappedMemoryRange extends io.github.kartoffell.klvulkan.Element<VkMappedMemoryRange>{
		default VkMappedMemoryRange sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMappedMemoryRange.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMappedMemoryRange.STYPE);
		}

		default VkMappedMemoryRange pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMappedMemoryRange.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMappedMemoryRange.PNEXT);
		}

		/**
		Mapped memory object
		*/
		default VkMappedMemoryRange memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMappedMemoryRange.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		/**
		Mapped memory object
		*/
		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMappedMemoryRange.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		/**
		Offset within the memory object where the range starts
		*/
		default VkMappedMemoryRange offset(long offset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMappedMemoryRange.OFFSET, offset);
			return this;
		}

		/**
		Offset within the memory object where the range starts
		*/
		default long offset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMappedMemoryRange.OFFSET);
		}

		/**
		Size of the range within the memory object
		*/
		default VkMappedMemoryRange size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMappedMemoryRange.SIZE, size);
			return this;
		}

		/**
		Size of the range within the memory object
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMappedMemoryRange.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkMappedMemoryRange from the given Arena.
		*/
		public static VkMappedMemoryRange allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMappedMemoryRange.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMappedMemoryRange from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMappedMemoryRange> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMappedMemoryRange.SIZEOF, (mem)->(VkMappedMemoryRange)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPassCreateFlagBits.html">VkRenderPassCreateFlagBits</a>
	*/
	public interface VkRenderPassCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDependencyFlagBits.html">VkDependencyFlagBits</a>
	*/
	public interface VkDependencyFlagBits{
		public static final int VK_DEPENDENCY_BY_REGION_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueryPool.html">VkQueryPool</a>
	*/
	public static record VkQueryPool(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkQueryPool>{
		public static PointerBuffer<? extends VkQueryPool> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkQueryPool(mem, parent)); //VkQueryPool
		}

		public static PointerBuffer<? extends VkQueryPool> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkWriteDescriptorSet.html">VkWriteDescriptorSet</a>
	*/
	public interface VkWriteDescriptorSet extends io.github.kartoffell.klvulkan.Element<VkWriteDescriptorSet>{
		default VkWriteDescriptorSet sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.STYPE);
		}

		default VkWriteDescriptorSet pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PNEXT);
		}

		/**
		Destination descriptor set
		*/
		default VkWriteDescriptorSet dstSet(Element<? extends VkDescriptorSet> dstSet){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.DSTSET, (dstSet==null?MemorySegment.NULL:dstSet.address()));
			return this;
		}

		/**
		Destination descriptor set
		*/
		default Element<? extends VkDescriptorSet> dstSet(){
			final var dstSet_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.DSTSET);
			return (dstSet_.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorSet>)()->dstSet_);
		}

		/**
		Binding within the destination descriptor set to write
		*/
		default VkWriteDescriptorSet dstBinding(int dstBinding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DSTBINDING, dstBinding);
			return this;
		}

		/**
		Binding within the destination descriptor set to write
		*/
		default int dstBinding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DSTBINDING);
		}

		/**
		Array element within the destination binding to write
		*/
		default VkWriteDescriptorSet dstArrayElement(int dstArrayElement){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DSTARRAYELEMENT, dstArrayElement);
			return this;
		}

		/**
		Array element within the destination binding to write
		*/
		default int dstArrayElement(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DSTARRAYELEMENT);
		}

		/**
		Number of descriptors to write (determines the size of the array pointed by pDescriptors)
		*/
		default VkWriteDescriptorSet descriptorCount(int descriptorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORCOUNT, descriptorCount);
			return this;
		}

		/**
		Number of descriptors to write (determines the size of the array pointed by pDescriptors)
		*/
		default int descriptorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORCOUNT);
		}

		/**
		Descriptor type to write (determines which members of the array pointed by pDescriptors are going to be used)
		*/
		default VkWriteDescriptorSet descriptorType(int descriptorType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORTYPE, descriptorType);
			return this;
		}

		/**
		Descriptor type to write (determines which members of the array pointed by pDescriptors are going to be used)
		*/
		default int descriptorType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORTYPE);
		}

		/**
		Sampler, image view, and layout for SAMPLER, COMBINED_IMAGE_SAMPLER, {SAMPLED,STORAGE}_IMAGE, and INPUT_ATTACHMENT descriptor types.
		*/
		default VkWriteDescriptorSet pImageInfo(Element<VkDescriptorImageInfo> pImageInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PIMAGEINFO, (pImageInfo==null?MemorySegment.NULL:pImageInfo.address()));
			return this;
		}

		/**
		Sampler, image view, and layout for SAMPLER, COMBINED_IMAGE_SAMPLER, {SAMPLED,STORAGE}_IMAGE, and INPUT_ATTACHMENT descriptor types.
		*/
		default Element<VkDescriptorImageInfo> pImageInfo(){
			final var pImageInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PIMAGEINFO);
			return (pImageInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pImageInfo_, org.lwjgl.vulkan.VkDescriptorImageInfo.SIZEOF, (v1160850402)->(v1160850402.equals(MemorySegment.NULL)?null:(VkDescriptorImageInfo)()->v1160850402)));
		}

		/**
		Raw buffer, size, and offset for {UNIFORM,STORAGE}_BUFFER[_DYNAMIC] descriptor types.
		*/
		default VkWriteDescriptorSet pBufferInfo(Element<VkDescriptorBufferInfo> pBufferInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PBUFFERINFO, (pBufferInfo==null?MemorySegment.NULL:pBufferInfo.address()));
			return this;
		}

		/**
		Raw buffer, size, and offset for {UNIFORM,STORAGE}_BUFFER[_DYNAMIC] descriptor types.
		*/
		default Element<VkDescriptorBufferInfo> pBufferInfo(){
			final var pBufferInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PBUFFERINFO);
			return (pBufferInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pBufferInfo_, org.lwjgl.vulkan.VkDescriptorBufferInfo.SIZEOF, (v2142852357)->(v2142852357.equals(MemorySegment.NULL)?null:(VkDescriptorBufferInfo)()->v2142852357)));
		}

		/**
		Buffer view to write to the descriptor for {UNIFORM,STORAGE}_TEXEL_BUFFER descriptor types.
		*/
		default VkWriteDescriptorSet pTexelBufferView(PointerBuffer<? extends Element<? extends VkBufferView>> pTexelBufferView){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PTEXELBUFFERVIEW, (pTexelBufferView==null?MemorySegment.NULL:pTexelBufferView.address()));
			return this;
		}

		/**
		Buffer view to write to the descriptor for {UNIFORM,STORAGE}_TEXEL_BUFFER descriptor types.
		*/
		default PointerBuffer<? extends Element<? extends VkBufferView>> pTexelBufferView(){
			final var pTexelBufferView_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkWriteDescriptorSet.PTEXELBUFFERVIEW);
			return (pTexelBufferView_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pTexelBufferView_, (v93054696)->(v93054696.equals(MemorySegment.NULL)?null:(Element<? extends VkBufferView>)()->v93054696)));
		}

		MemorySegment address();

		/**
		Allocates a new VkWriteDescriptorSet from the given Arena.
		*/
		public static VkWriteDescriptorSet allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkWriteDescriptorSet from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkWriteDescriptorSet> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF, (mem)->(VkWriteDescriptorSet)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkViewport.html">VkViewport</a>
	*/
	public interface VkViewport extends io.github.kartoffell.klvulkan.Element<VkViewport>{
		default VkViewport x(float x){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.X, x);
			return this;
		}

		default float x(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.X);
		}

		default VkViewport y(float y){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.Y, y);
			return this;
		}

		default float y(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.Y);
		}

		default VkViewport width(float width){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.WIDTH, width);
			return this;
		}

		default float width(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.WIDTH);
		}

		default VkViewport height(float height){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.HEIGHT, height);
			return this;
		}

		default float height(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.HEIGHT);
		}

		default VkViewport minDepth(float minDepth){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.MINDEPTH, minDepth);
			return this;
		}

		default float minDepth(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.MINDEPTH);
		}

		default VkViewport maxDepth(float maxDepth){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.MAXDEPTH, maxDepth);
			return this;
		}

		default float maxDepth(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkViewport.MAXDEPTH);
		}

		MemorySegment address();

		/**
		Allocates a new VkViewport from the given Arena.
		*/
		public static VkViewport allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkViewport.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkViewport from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkViewport> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkViewport.SIZEOF, (mem)->(VkViewport)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineRasterizationStateCreateInfo.html">VkPipelineRasterizationStateCreateInfo</a>
	*/
	public interface VkPipelineRasterizationStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineRasterizationStateCreateInfo>{
		default VkPipelineRasterizationStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.STYPE);
		}

		default VkPipelineRasterizationStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.PNEXT);
		}

		default VkPipelineRasterizationStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FLAGS);
		}

		default VkPipelineRasterizationStateCreateInfo depthClampEnable(boolean depthClampEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE, depthClampEnable?1:0);
			return this;
		}

		default boolean depthClampEnable(){
			final var depthClampEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE);
			return depthClampEnable_!=0;
		}

		default VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(boolean rasterizerDiscardEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE, rasterizerDiscardEnable?1:0);
			return this;
		}

		default boolean rasterizerDiscardEnable(){
			final var rasterizerDiscardEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE);
			return rasterizerDiscardEnable_!=0;
		}

		/**
		optional (GL45)
		*/
		default VkPipelineRasterizationStateCreateInfo polygonMode(int polygonMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.POLYGONMODE, polygonMode);
			return this;
		}

		/**
		optional (GL45)
		*/
		default int polygonMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.POLYGONMODE);
		}

		default VkPipelineRasterizationStateCreateInfo cullMode(int cullMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.CULLMODE, cullMode);
			return this;
		}

		@Nullable
		default int cullMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.CULLMODE);
		}

		default VkPipelineRasterizationStateCreateInfo frontFace(int frontFace){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FRONTFACE, frontFace);
			return this;
		}

		default int frontFace(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FRONTFACE);
		}

		default VkPipelineRasterizationStateCreateInfo depthBiasEnable(boolean depthBiasEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE, depthBiasEnable?1:0);
			return this;
		}

		default boolean depthBiasEnable(){
			final var depthBiasEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE);
			return depthBiasEnable_!=0;
		}

		default VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float depthBiasConstantFactor){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR, depthBiasConstantFactor);
			return this;
		}

		default float depthBiasConstantFactor(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR);
		}

		default VkPipelineRasterizationStateCreateInfo depthBiasClamp(float depthBiasClamp){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP, depthBiasClamp);
			return this;
		}

		default float depthBiasClamp(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP);
		}

		default VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float depthBiasSlopeFactor){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR, depthBiasSlopeFactor);
			return this;
		}

		default float depthBiasSlopeFactor(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR);
		}

		default VkPipelineRasterizationStateCreateInfo lineWidth(float lineWidth){
			address().set(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.LINEWIDTH, lineWidth);
			return this;
		}

		default float lineWidth(){
			return address().get(ValueLayout.JAVA_FLOAT, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.LINEWIDTH);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineRasterizationStateCreateInfo from the given Arena.
		*/
		public static VkPipelineRasterizationStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineRasterizationStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineRasterizationStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF, (mem)->(VkPipelineRasterizationStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkLogicOp.html">VkLogicOp</a>
	*/
	public interface VkLogicOp{
		public static final int VK_LOGIC_OP_INVERT = 10;

		public static final int VK_LOGIC_OP_CLEAR = 0;

		public static final int VK_LOGIC_OP_AND = 1;

		public static final int VK_LOGIC_OP_EQUIVALENT = 9;

		public static final int VK_LOGIC_OP_OR_INVERTED = 13;

		public static final int VK_LOGIC_OP_NAND = 14;

		public static final int VK_LOGIC_OP_XOR = 6;

		public static final int VK_LOGIC_OP_AND_INVERTED = 4;

		public static final int VK_LOGIC_OP_COPY_INVERTED = 12;

		public static final int VK_LOGIC_OP_SET = 15;

		public static final int VK_LOGIC_OP_AND_REVERSE = 2;

		public static final int VK_LOGIC_OP_COPY = 3;

		public static final int VK_LOGIC_OP_NO_OP = 5;

		public static final int VK_LOGIC_OP_OR = 7;

		public static final int VK_LOGIC_OP_NOR = 8;

		public static final int VK_LOGIC_OP_OR_REVERSE = 11;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPolygonMode.html">VkPolygonMode</a>
	*/
	public interface VkPolygonMode{
		public static final int VK_POLYGON_MODE_LINE = 1;

		public static final int VK_POLYGON_MODE_POINT = 2;

		public static final int VK_POLYGON_MODE_FILL = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryType.html">VkMemoryType</a>
	*/
	public interface VkMemoryType extends io.github.kartoffell.klvulkan.Element<VkMemoryType>{
		/**
		Memory properties of this memory type
		*/
		@Nullable
		default int propertyFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryType.PROPERTYFLAGS);
		}

		/**
		Index of the memory heap allocations of this memory type are taken from
		*/
		default int heapIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryType.HEAPINDEX);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryType from the given Arena.
		*/
		public static VkMemoryType allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryType.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryType from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryType> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryType.SIZEOF, (mem)->(VkMemoryType)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBlendOp.html">VkBlendOp</a>
	*/
	public interface VkBlendOp{
		public static final int VK_BLEND_OP_SUBTRACT = 1;

		public static final int VK_BLEND_OP_ADD = 0;

		public static final int VK_BLEND_OP_MIN = 3;

		public static final int VK_BLEND_OP_MAX = 4;

		public static final int VK_BLEND_OP_REVERSE_SUBTRACT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFramebufferCreateFlagBits.html">VkFramebufferCreateFlagBits</a>
	*/
	public interface VkFramebufferCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkIndexType.html">VkIndexType</a>
	*/
	public interface VkIndexType{
		public static final int VK_INDEX_TYPE_UINT16 = 0;

		public static final int VK_INDEX_TYPE_UINT32 = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageBlit.html">VkImageBlit</a>
	*/
	public interface VkImageBlit extends io.github.kartoffell.klvulkan.Element<VkImageBlit>{
		default VkImageSubresourceLayers srcSubresource(){
			final var srcSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit.SRCSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (srcSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->srcSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default Element<VkOffset3D> srcOffsets(){
			final var srcOffsets_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit.SRCOFFSETS, org.lwjgl.vulkan.VkOffset3D.SIZEOF*2);
			return (srcOffsets_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(srcOffsets_, org.lwjgl.vulkan.VkOffset3D.SIZEOF, (v1932597611)->(v1932597611.equals(MemorySegment.NULL)?null:(VkOffset3D)()->v1932597611)));
		}

		default VkImageSubresourceLayers dstSubresource(){
			final var dstSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit.DSTSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (dstSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->dstSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default Element<VkOffset3D> dstOffsets(){
			final var dstOffsets_ = address().asSlice(org.lwjgl.vulkan.VkImageBlit.DSTOFFSETS, org.lwjgl.vulkan.VkOffset3D.SIZEOF*2);
			return (dstOffsets_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(dstOffsets_, org.lwjgl.vulkan.VkOffset3D.SIZEOF, (v1066615508)->(v1066615508.equals(MemorySegment.NULL)?null:(VkOffset3D)()->v1066615508)));
		}

		MemorySegment address();

		/**
		Allocates a new VkImageBlit from the given Arena.
		*/
		public static VkImageBlit allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageBlit.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageBlit from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageBlit> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageBlit.SIZEOF, (mem)->(VkImageBlit)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageSubresourceLayers.html">VkImageSubresourceLayers</a>
	*/
	public interface VkImageSubresourceLayers extends io.github.kartoffell.klvulkan.Element<VkImageSubresourceLayers>{
		default VkImageSubresourceLayers aspectMask(int aspectMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.ASPECTMASK, aspectMask);
			return this;
		}

		default int aspectMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.ASPECTMASK);
		}

		default VkImageSubresourceLayers mipLevel(int mipLevel){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.MIPLEVEL, mipLevel);
			return this;
		}

		default int mipLevel(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.MIPLEVEL);
		}

		default VkImageSubresourceLayers baseArrayLayer(int baseArrayLayer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.BASEARRAYLAYER, baseArrayLayer);
			return this;
		}

		default int baseArrayLayer(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.BASEARRAYLAYER);
		}

		default VkImageSubresourceLayers layerCount(int layerCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.LAYERCOUNT, layerCount);
			return this;
		}

		default int layerCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresourceLayers.LAYERCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageSubresourceLayers from the given Arena.
		*/
		public static VkImageSubresourceLayers allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageSubresourceLayers from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageSubresourceLayers> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF, (mem)->(VkImageSubresourceLayers)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSampler.html">VkSampler</a>
	*/
	public static record VkSampler(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkSampler>{
		public static PointerBuffer<? extends VkSampler> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkSampler(mem, parent)); //VkSampler
		}

		public static PointerBuffer<? extends VkSampler> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphoreCreateInfo.html">VkSemaphoreCreateInfo</a>
	*/
	public interface VkSemaphoreCreateInfo extends io.github.kartoffell.klvulkan.Element<VkSemaphoreCreateInfo>{
		default VkSemaphoreCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreCreateInfo.STYPE);
		}

		default VkSemaphoreCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSemaphoreCreateInfo.PNEXT);
		}

		/**
		Semaphore creation flags
		*/
		default VkSemaphoreCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Semaphore creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSemaphoreCreateInfo.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkSemaphoreCreateInfo from the given Arena.
		*/
		public static VkSemaphoreCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSemaphoreCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSemaphoreCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSemaphoreCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSemaphoreCreateInfo.SIZEOF, (mem)->(VkSemaphoreCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineLayoutCreateFlagBits.html">VkPipelineLayoutCreateFlagBits</a>
	*/
	public interface VkPipelineLayoutCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageLayout.html">VkImageLayout</a>
	*/
	public interface VkImageLayout{
		public static final int VK_IMAGE_LAYOUT_GENERAL = 1;

		public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0;

		public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5;

		public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2;

		public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6;

		public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7;

		public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 8;

		public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;

		public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkClearAttachment.html">VkClearAttachment</a>
	*/
	public interface VkClearAttachment extends io.github.kartoffell.klvulkan.Element<VkClearAttachment>{
		default VkClearAttachment aspectMask(int aspectMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearAttachment.ASPECTMASK, aspectMask);
			return this;
		}

		default int aspectMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearAttachment.ASPECTMASK);
		}

		default VkClearAttachment colorAttachment(int colorAttachment){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearAttachment.COLORATTACHMENT, colorAttachment);
			return this;
		}

		default int colorAttachment(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearAttachment.COLORATTACHMENT);
		}

		default VkClearValue clearValue(){
			final var clearValue_ = address().asSlice(org.lwjgl.vulkan.VkClearAttachment.CLEARVALUE, org.lwjgl.vulkan.VkClearValue.SIZEOF);
			return (clearValue_.equals(MemorySegment.NULL)?null:(VkClearValue)()->clearValue_);
		}

		MemorySegment address();

		/**
		Allocates a new VkClearAttachment from the given Arena.
		*/
		public static VkClearAttachment allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkClearAttachment.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkClearAttachment from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkClearAttachment> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkClearAttachment.SIZEOF, (mem)->(VkClearAttachment)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAccessFlagBits.html">VkAccessFlagBits</a>
	*/
	public interface VkAccessFlagBits{
		public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512;

		public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 4;

		public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 16;

		public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 256;

		public static final int VK_ACCESS_HOST_WRITE_BIT = 16384;

		public static final int VK_ACCESS_SHADER_READ_BIT = 32;

		public static final int VK_ACCESS_SHADER_WRITE_BIT = 64;

		public static final int VK_ACCESS_TRANSFER_READ_BIT = 2048;

		public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 1;

		public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 128;

		public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 4096;

		public static final int VK_ACCESS_MEMORY_WRITE_BIT = 65536;

		public static final int VK_ACCESS_HOST_READ_BIT = 8192;

		public static final int VK_ACCESS_INDEX_READ_BIT = 2;

		public static final int VK_ACCESS_UNIFORM_READ_BIT = 8;

		public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024;

		public static final int VK_ACCESS_MEMORY_READ_BIT = 32768;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineStageFlagBits.html">VkPipelineStageFlagBits</a>
	*/
	public interface VkPipelineStageFlagBits{
		public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 8;

		public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 16;

		public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 128;

		public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 64;

		public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 512;

		public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 65536;

		public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 1024;

		public static final int VK_PIPELINE_STAGE_HOST_BIT = 16384;

		public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 4;

		public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 32768;

		public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 2048;

		public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 2;

		public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 4096;

		public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 8192;

		public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 1;

		public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 256;

		public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 32;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceCreateInfo.html">VkDeviceCreateInfo</a>
	*/
	public interface VkDeviceCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDeviceCreateInfo>{
		default VkDeviceCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.STYPE);
		}

		default VkDeviceCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PNEXT);
		}

		default VkDeviceCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.FLAGS);
		}

		default VkDeviceCreateInfo queueCreateInfoCount(int queueCreateInfoCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.QUEUECREATEINFOCOUNT, queueCreateInfoCount);
			return this;
		}

		@Nullable
		default int queueCreateInfoCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.QUEUECREATEINFOCOUNT);
		}

		default VkDeviceCreateInfo pQueueCreateInfos(Element<VkDeviceQueueCreateInfo> pQueueCreateInfos){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PQUEUECREATEINFOS, (pQueueCreateInfos==null?MemorySegment.NULL:pQueueCreateInfos.address()));
			return this;
		}

		default Element<VkDeviceQueueCreateInfo> pQueueCreateInfos(){
			final var pQueueCreateInfos_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PQUEUECREATEINFOS);
			return (pQueueCreateInfos_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pQueueCreateInfos_, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.SIZEOF, (v179779934)->(v179779934.equals(MemorySegment.NULL)?null:(VkDeviceQueueCreateInfo)()->v179779934)));
		}

		default VkDeviceCreateInfo enabledLayerCount(int enabledLayerCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDLAYERCOUNT, enabledLayerCount);
			return this;
		}

		default int enabledLayerCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDLAYERCOUNT);
		}

		/**
		Ordered list of layer names to be enabled
		*/
		default VkDeviceCreateInfo ppEnabledLayerNames(PointerBuffer<? extends CString> ppEnabledLayerNames){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDLAYERNAMES, (ppEnabledLayerNames==null?MemorySegment.NULL:ppEnabledLayerNames.address()));
			return this;
		}

		/**
		Ordered list of layer names to be enabled
		*/
		default PointerBuffer<? extends CString> ppEnabledLayerNames(){
			final var ppEnabledLayerNames_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDLAYERNAMES);
			return (ppEnabledLayerNames_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(ppEnabledLayerNames_, (v1355887174)->v1355887174.equals(MemorySegment.NULL)?null:CString.wrap(v1355887174)));
		}

		default VkDeviceCreateInfo enabledExtensionCount(int enabledExtensionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT, enabledExtensionCount);
			return this;
		}

		@Nullable
		default int enabledExtensionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT);
		}

		default VkDeviceCreateInfo ppEnabledExtensionNames(PointerBuffer<? extends CString> ppEnabledExtensionNames){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES, (ppEnabledExtensionNames==null?MemorySegment.NULL:ppEnabledExtensionNames.address()));
			return this;
		}

		default PointerBuffer<? extends CString> ppEnabledExtensionNames(){
			final var ppEnabledExtensionNames_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES);
			return (ppEnabledExtensionNames_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(ppEnabledExtensionNames_, (v735085430)->v735085430.equals(MemorySegment.NULL)?null:CString.wrap(v735085430)));
		}

		default VkDeviceCreateInfo pEnabledFeatures(Element<VkPhysicalDeviceFeatures> pEnabledFeatures){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PENABLEDFEATURES, (pEnabledFeatures==null?MemorySegment.NULL:pEnabledFeatures.address()));
			return this;
		}

		@Nullable
		default Element<VkPhysicalDeviceFeatures> pEnabledFeatures(){
			final var pEnabledFeatures_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceCreateInfo.PENABLEDFEATURES);
			return (pEnabledFeatures_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pEnabledFeatures_, org.lwjgl.vulkan.VkPhysicalDeviceFeatures.SIZEOF, (v242282810)->(v242282810.equals(MemorySegment.NULL)?null:(VkPhysicalDeviceFeatures)()->v242282810)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDeviceCreateInfo from the given Arena.
		*/
		public static VkDeviceCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDeviceCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDeviceCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF, (mem)->(VkDeviceCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferAllocateInfo.html">VkCommandBufferAllocateInfo</a>
	*/
	public interface VkCommandBufferAllocateInfo extends io.github.kartoffell.klvulkan.Element<VkCommandBufferAllocateInfo>{
		default VkCommandBufferAllocateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.STYPE);
		}

		default VkCommandBufferAllocateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.PNEXT);
		}

		default VkCommandBufferAllocateInfo commandPool(Element<? extends VkCommandPool> commandPool){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.COMMANDPOOL, (commandPool==null?MemorySegment.NULL:commandPool.address()));
			return this;
		}

		default Element<? extends VkCommandPool> commandPool(){
			final var commandPool_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.COMMANDPOOL);
			return (commandPool_.equals(MemorySegment.NULL)?null:(Element<? extends VkCommandPool>)()->commandPool_);
		}

		default VkCommandBufferAllocateInfo level(int level){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.LEVEL, level);
			return this;
		}

		default int level(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.LEVEL);
		}

		default VkCommandBufferAllocateInfo commandBufferCount(int commandBufferCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT, commandBufferCount);
			return this;
		}

		default int commandBufferCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkCommandBufferAllocateInfo from the given Arena.
		*/
		public static VkCommandBufferAllocateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkCommandBufferAllocateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkCommandBufferAllocateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkCommandBufferAllocateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkCommandBufferAllocateInfo.SIZEOF, (mem)->(VkCommandBufferAllocateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkEventCreateInfo.html">VkEventCreateInfo</a>
	*/
	public interface VkEventCreateInfo extends io.github.kartoffell.klvulkan.Element<VkEventCreateInfo>{
		default VkEventCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkEventCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkEventCreateInfo.STYPE);
		}

		default VkEventCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkEventCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkEventCreateInfo.PNEXT);
		}

		/**
		Event creation flags
		*/
		default VkEventCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkEventCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Event creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkEventCreateInfo.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkEventCreateInfo from the given Arena.
		*/
		public static VkEventCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkEventCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkEventCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkEventCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkEventCreateInfo.SIZEOF, (mem)->(VkEventCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkStencilFaceFlagBits.html">VkStencilFaceFlagBits</a>
	*/
	public interface VkStencilFaceFlagBits{
		public static final int VK_STENCIL_FACE_FRONT_AND_BACK = 8;

		public static final int VK_STENCIL_FACE_BACK_BIT = 2;

		public static final int VK_STENCIL_FRONT_AND_BACK = 8;

		public static final int VK_STENCIL_FACE_FRONT_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkVertexInputRate.html">VkVertexInputRate</a>
	*/
	public interface VkVertexInputRate{
		public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

		public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseMemoryBindFlagBits.html">VkSparseMemoryBindFlagBits</a>
	*/
	public interface VkSparseMemoryBindFlagBits{
		public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceType.html">VkPhysicalDeviceType</a>
	*/
	public interface VkPhysicalDeviceType{
		public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;

		public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;

		public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;

		public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;

		public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkInternalAllocationType.html">VkInternalAllocationType</a>
	*/
	public interface VkInternalAllocationType{
		public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubpassContents.html">VkSubpassContents</a>
	*/
	public interface VkSubpassContents{
		public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

		public static final int VK_SUBPASS_CONTENTS_INLINE = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryHeap.html">VkMemoryHeap</a>
	*/
	public interface VkMemoryHeap extends io.github.kartoffell.klvulkan.Element<VkMemoryHeap>{
		/**
		Available memory in the heap
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryHeap.SIZE);
		}

		/**
		Flags for the heap
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryHeap.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryHeap from the given Arena.
		*/
		public static VkMemoryHeap allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryHeap.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryHeap from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryHeap> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryHeap.SIZEOF, (mem)->(VkMemoryHeap)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageFormatFlagBits.html">VkSparseImageFormatFlagBits</a>
	*/
	public interface VkSparseImageFormatFlagBits{
		public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 1;

		public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 2;

		public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferCopy.html">VkBufferCopy</a>
	*/
	public interface VkBufferCopy extends io.github.kartoffell.klvulkan.Element<VkBufferCopy>{
		/**
		Specified in bytes
		*/
		default VkBufferCopy srcOffset(long srcOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy.SRCOFFSET, srcOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long srcOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy.SRCOFFSET);
		}

		/**
		Specified in bytes
		*/
		default VkBufferCopy dstOffset(long dstOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy.DSTOFFSET, dstOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long dstOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy.DSTOFFSET);
		}

		/**
		Specified in bytes
		*/
		default VkBufferCopy size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy.SIZE, size);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCopy.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferCopy from the given Arena.
		*/
		public static VkBufferCopy allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferCopy.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferCopy from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferCopy> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferCopy.SIZEOF, (mem)->(VkBufferCopy)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkVoidFunction.html">PFN_vkVoidFunction</a>
	*/
	public static abstract class PFN_vkVoidFunction implements io.github.kartoffell.klvulkan.Element<PFN_vkVoidFunction>{
		protected final MemorySegment address;

		public final MethodHandle handle_;

		public final FunctionDescriptor descriptor_ = FunctionDescriptor.ofVoid();

		public MemorySegment address() {
			return address;
		}

		MethodHandle PFN_vkVoidFunction_;
		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkVoidFunction.html">PFN_vkVoidFunction</a>
		*/
		public abstract void PFN_vkVoidFunction();

		 {
			try {
				handle_ =  MethodHandles.lookup().findVirtual(PFN_vkVoidFunction.class, "PFN_vkVoidFunction_", MethodType.methodType(void.class));
			} catch(Exception e) {throw new IllegalStateException(e);}
		}

		public PFN_vkVoidFunction(Arena arena) {
			this.address = Linker.nativeLinker().upcallStub(handle_, descriptor_, arena);
		}

		protected void PFN_vkVoidFunction_() {
			PFN_vkVoidFunction();
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkComputePipelineCreateInfo.html">VkComputePipelineCreateInfo</a>
	*/
	public interface VkComputePipelineCreateInfo extends io.github.kartoffell.klvulkan.Element<VkComputePipelineCreateInfo>{
		default VkComputePipelineCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComputePipelineCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComputePipelineCreateInfo.STYPE);
		}

		default VkComputePipelineCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkComputePipelineCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkComputePipelineCreateInfo.PNEXT);
		}

		/**
		Pipeline creation flags
		*/
		default VkComputePipelineCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComputePipelineCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Pipeline creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComputePipelineCreateInfo.FLAGS);
		}

		default VkPipelineShaderStageCreateInfo stage(){
			final var stage_ = address().asSlice(org.lwjgl.vulkan.VkComputePipelineCreateInfo.STAGE, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.SIZEOF);
			return (stage_.equals(MemorySegment.NULL)?null:(VkPipelineShaderStageCreateInfo)()->stage_);
		}

		/**
		Interface layout of the pipeline
		*/
		default VkComputePipelineCreateInfo layout(Element<? extends VkPipelineLayout> layout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkComputePipelineCreateInfo.LAYOUT, (layout==null?MemorySegment.NULL:layout.address()));
			return this;
		}

		/**
		Interface layout of the pipeline
		*/
		@Nullable
		default Element<? extends VkPipelineLayout> layout(){
			final var layout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkComputePipelineCreateInfo.LAYOUT);
			return (layout_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipelineLayout>)()->layout_);
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is nonzero, it specifies the handle of the base pipeline this is a derivative of
		*/
		default VkComputePipelineCreateInfo basePipelineHandle(Element<? extends VkPipeline> basePipelineHandle){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEHANDLE, (basePipelineHandle==null?MemorySegment.NULL:basePipelineHandle.address()));
			return this;
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is nonzero, it specifies the handle of the base pipeline this is a derivative of
		*/
		@Nullable
		default Element<? extends VkPipeline> basePipelineHandle(){
			final var basePipelineHandle_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEHANDLE);
			return (basePipelineHandle_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipeline>)()->basePipelineHandle_);
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is not -1, it specifies an index into pCreateInfos of the base pipeline this is a derivative of
		*/
		default VkComputePipelineCreateInfo basePipelineIndex(int basePipelineIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEINDEX, basePipelineIndex);
			return this;
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is not -1, it specifies an index into pCreateInfos of the base pipeline this is a derivative of
		*/
		default int basePipelineIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEINDEX);
		}

		MemorySegment address();

		/**
		Allocates a new VkComputePipelineCreateInfo from the given Arena.
		*/
		public static VkComputePipelineCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkComputePipelineCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkComputePipelineCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF, (mem)->(VkComputePipelineCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageMemoryRequirements.html">VkSparseImageMemoryRequirements</a>
	*/
	public interface VkSparseImageMemoryRequirements extends io.github.kartoffell.klvulkan.Element<VkSparseImageMemoryRequirements>{
		default VkSparseImageFormatProperties formatProperties(){
			final var formatProperties_ = address().asSlice(org.lwjgl.vulkan.VkSparseImageMemoryRequirements.FORMATPROPERTIES, org.lwjgl.vulkan.VkSparseImageFormatProperties.SIZEOF);
			return (formatProperties_.equals(MemorySegment.NULL)?null:(VkSparseImageFormatProperties)()->formatProperties_);
		}

		default int imageMipTailFirstLod(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageMemoryRequirements.IMAGEMIPTAILFIRSTLOD);
		}

		/**
		Specified in bytes, must be a multiple of sparse block size in bytes / alignment
		*/
		default long imageMipTailSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseImageMemoryRequirements.IMAGEMIPTAILSIZE);
		}

		/**
		Specified in bytes, must be a multiple of sparse block size in bytes / alignment
		*/
		default long imageMipTailOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseImageMemoryRequirements.IMAGEMIPTAILOFFSET);
		}

		/**
		Specified in bytes, must be a multiple of sparse block size in bytes / alignment
		*/
		default long imageMipTailStride(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseImageMemoryRequirements.IMAGEMIPTAILSTRIDE);
		}

		MemorySegment address();

		/**
		Allocates a new VkSparseImageMemoryRequirements from the given Arena.
		*/
		public static VkSparseImageMemoryRequirements allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseImageMemoryRequirements.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSparseImageMemoryRequirements from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSparseImageMemoryRequirements> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseImageMemoryRequirements.SIZEOF, (mem)->(VkSparseImageMemoryRequirements)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCacheCreateFlagBits.html">VkPipelineCacheCreateFlagBits</a>
	*/
	public interface VkPipelineCacheCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerCreateFlagBits.html">VkSamplerCreateFlagBits</a>
	*/
	public interface VkSamplerCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetAllocateInfo.html">VkDescriptorSetAllocateInfo</a>
	*/
	public interface VkDescriptorSetAllocateInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorSetAllocateInfo>{
		default VkDescriptorSetAllocateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.STYPE);
		}

		default VkDescriptorSetAllocateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.PNEXT);
		}

		default VkDescriptorSetAllocateInfo descriptorPool(Element<? extends VkDescriptorPool> descriptorPool){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.DESCRIPTORPOOL, (descriptorPool==null?MemorySegment.NULL:descriptorPool.address()));
			return this;
		}

		default Element<? extends VkDescriptorPool> descriptorPool(){
			final var descriptorPool_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.DESCRIPTORPOOL);
			return (descriptorPool_.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorPool>)()->descriptorPool_);
		}

		default VkDescriptorSetAllocateInfo descriptorSetCount(int descriptorSetCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.DESCRIPTORSETCOUNT, descriptorSetCount);
			return this;
		}

		default int descriptorSetCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.DESCRIPTORSETCOUNT);
		}

		default VkDescriptorSetAllocateInfo pSetLayouts(PointerBuffer<? extends Element<? extends VkDescriptorSetLayout>> pSetLayouts){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.PSETLAYOUTS, (pSetLayouts==null?MemorySegment.NULL:pSetLayouts.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkDescriptorSetLayout>> pSetLayouts(){
			final var pSetLayouts_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.PSETLAYOUTS);
			return (pSetLayouts_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pSetLayouts_, (v1027495011)->(v1027495011.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorSetLayout>)()->v1027495011)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorSetAllocateInfo from the given Arena.
		*/
		public static VkDescriptorSetAllocateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorSetAllocateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorSetAllocateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.SIZEOF, (mem)->(VkDescriptorSetAllocateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkEvent.html">VkEvent</a>
	*/
	public static record VkEvent(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkEvent>{
		public static PointerBuffer<? extends VkEvent> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkEvent(mem, parent)); //VkEvent
		}

		public static PointerBuffer<? extends VkEvent> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBlendFactor.html">VkBlendFactor</a>
	*/
	public interface VkBlendFactor{
		public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;

		public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;

		public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;

		public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;

		public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;

		public static final int VK_BLEND_FACTOR_ZERO = 0;

		public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;

		public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;

		public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;

		public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;

		public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;

		public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;

		public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;

		public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;

		public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;

		public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;

		public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;

		public static final int VK_BLEND_FACTOR_ONE = 1;

		public static final int VK_BLEND_FACTOR_DST_COLOR = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineShaderStageCreateFlagBits.html">VkPipelineShaderStageCreateFlagBits</a>
	*/
	public interface VkPipelineShaderStageCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageCreateInfo.html">VkImageCreateInfo</a>
	*/
	public interface VkImageCreateInfo extends io.github.kartoffell.klvulkan.Element<VkImageCreateInfo>{
		default VkImageCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.STYPE);
		}

		default VkImageCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageCreateInfo.PNEXT);
		}

		/**
		Image creation flags
		*/
		default VkImageCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Image creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.FLAGS);
		}

		default VkImageCreateInfo imageType(int imageType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.IMAGETYPE, imageType);
			return this;
		}

		default int imageType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.IMAGETYPE);
		}

		default VkImageCreateInfo format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.FORMAT, format);
			return this;
		}

		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.FORMAT);
		}

		default VkExtent3D extent(){
			final var extent_ = address().asSlice(org.lwjgl.vulkan.VkImageCreateInfo.EXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (extent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->extent_);
		}

		default VkImageCreateInfo mipLevels(int mipLevels){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.MIPLEVELS, mipLevels);
			return this;
		}

		default int mipLevels(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.MIPLEVELS);
		}

		default VkImageCreateInfo arrayLayers(int arrayLayers){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.ARRAYLAYERS, arrayLayers);
			return this;
		}

		default int arrayLayers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.ARRAYLAYERS);
		}

		default VkImageCreateInfo samples(int samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.SAMPLES, samples);
			return this;
		}

		default int samples(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.SAMPLES);
		}

		default VkImageCreateInfo tiling(int tiling){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.TILING, tiling);
			return this;
		}

		default int tiling(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.TILING);
		}

		/**
		Image usage flags
		*/
		default VkImageCreateInfo usage(int usage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.USAGE, usage);
			return this;
		}

		/**
		Image usage flags
		*/
		default int usage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.USAGE);
		}

		/**
		Cross-queue-family sharing mode
		*/
		default VkImageCreateInfo sharingMode(int sharingMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.SHARINGMODE, sharingMode);
			return this;
		}

		/**
		Cross-queue-family sharing mode
		*/
		default int sharingMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.SHARINGMODE);
		}

		/**
		Number of queue families to share across
		*/
		default VkImageCreateInfo queueFamilyIndexCount(int queueFamilyIndexCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT, queueFamilyIndexCount);
			return this;
		}

		/**
		Number of queue families to share across
		*/
		@Nullable
		default int queueFamilyIndexCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT);
		}

		/**
		Array of queue family indices to share across
		*/
		default VkImageCreateInfo pQueueFamilyIndices(IntBuffer pQueueFamilyIndices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageCreateInfo.PQUEUEFAMILYINDICES, (pQueueFamilyIndices==null?MemorySegment.NULL:MemorySegment.ofBuffer(pQueueFamilyIndices)));
			return this;
		}

		/**
		Array of queue family indices to share across
		*/
		default IntBuffer pQueueFamilyIndices(){
			final var pQueueFamilyIndices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkImageCreateInfo.PQUEUEFAMILYINDICES);
			return (pQueueFamilyIndices_.equals(MemorySegment.NULL)?null:pQueueFamilyIndices_.asByteBuffer().asIntBuffer());
		}

		/**
		Initial image layout for all subresources
		*/
		default VkImageCreateInfo initialLayout(int initialLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.INITIALLAYOUT, initialLayout);
			return this;
		}

		/**
		Initial image layout for all subresources
		*/
		default int initialLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageCreateInfo.INITIALLAYOUT);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageCreateInfo from the given Arena.
		*/
		public static VkImageCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF, (mem)->(VkImageCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkInstanceCreateInfo.html">VkInstanceCreateInfo</a>
	*/
	public interface VkInstanceCreateInfo extends io.github.kartoffell.klvulkan.Element<VkInstanceCreateInfo>{
		default VkInstanceCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.STYPE);
		}

		default VkInstanceCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PNEXT);
		}

		default VkInstanceCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.FLAGS);
		}

		default VkInstanceCreateInfo pApplicationInfo(Element<VkApplicationInfo> pApplicationInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PAPPLICATIONINFO, (pApplicationInfo==null?MemorySegment.NULL:pApplicationInfo.address()));
			return this;
		}

		@Nullable
		default Element<VkApplicationInfo> pApplicationInfo(){
			final var pApplicationInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PAPPLICATIONINFO);
			return (pApplicationInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pApplicationInfo_, org.lwjgl.vulkan.VkApplicationInfo.SIZEOF, (v1688470144)->(v1688470144.equals(MemorySegment.NULL)?null:(VkApplicationInfo)()->v1688470144)));
		}

		default VkInstanceCreateInfo enabledLayerCount(int enabledLayerCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDLAYERCOUNT, enabledLayerCount);
			return this;
		}

		@Nullable
		default int enabledLayerCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDLAYERCOUNT);
		}

		/**
		Ordered list of layer names to be enabled
		*/
		default VkInstanceCreateInfo ppEnabledLayerNames(PointerBuffer<? extends CString> ppEnabledLayerNames){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDLAYERNAMES, (ppEnabledLayerNames==null?MemorySegment.NULL:ppEnabledLayerNames.address()));
			return this;
		}

		/**
		Ordered list of layer names to be enabled
		*/
		default PointerBuffer<? extends CString> ppEnabledLayerNames(){
			final var ppEnabledLayerNames_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDLAYERNAMES);
			return (ppEnabledLayerNames_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(ppEnabledLayerNames_, (v1262548561)->v1262548561.equals(MemorySegment.NULL)?null:CString.wrap(v1262548561)));
		}

		default VkInstanceCreateInfo enabledExtensionCount(int enabledExtensionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT, enabledExtensionCount);
			return this;
		}

		@Nullable
		default int enabledExtensionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT);
		}

		/**
		Extension names to be enabled
		*/
		default VkInstanceCreateInfo ppEnabledExtensionNames(PointerBuffer<? extends CString> ppEnabledExtensionNames){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES, (ppEnabledExtensionNames==null?MemorySegment.NULL:ppEnabledExtensionNames.address()));
			return this;
		}

		/**
		Extension names to be enabled
		*/
		default PointerBuffer<? extends CString> ppEnabledExtensionNames(){
			final var ppEnabledExtensionNames_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES);
			return (ppEnabledExtensionNames_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(ppEnabledExtensionNames_, (v1118840610)->v1118840610.equals(MemorySegment.NULL)?null:CString.wrap(v1118840610)));
		}

		MemorySegment address();

		/**
		Allocates a new VkInstanceCreateInfo from the given Arena.
		*/
		public static VkInstanceCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkInstanceCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkInstanceCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF, (mem)->(VkInstanceCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageType.html">VkImageType</a>
	*/
	public interface VkImageType{
		public static final int VK_IMAGE_TYPE_1D = 0;

		public static final int VK_IMAGE_TYPE_3D = 2;

		public static final int VK_IMAGE_TYPE_2D = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerAddressMode.html">VkSamplerAddressMode</a>
	*/
	public interface VkSamplerAddressMode{
		public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;

		public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;

		public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;

		public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBorderColor.html">VkBorderColor</a>
	*/
	public interface VkBorderColor{
		public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;

		public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;

		public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;

		public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;

		public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;

		public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineColorBlendAttachmentState.html">VkPipelineColorBlendAttachmentState</a>
	*/
	public interface VkPipelineColorBlendAttachmentState extends io.github.kartoffell.klvulkan.Element<VkPipelineColorBlendAttachmentState>{
		default VkPipelineColorBlendAttachmentState blendEnable(boolean blendEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.BLENDENABLE, blendEnable?1:0);
			return this;
		}

		default boolean blendEnable(){
			final var blendEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.BLENDENABLE);
			return blendEnable_!=0;
		}

		default VkPipelineColorBlendAttachmentState srcColorBlendFactor(int srcColorBlendFactor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR, srcColorBlendFactor);
			return this;
		}

		default int srcColorBlendFactor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR);
		}

		default VkPipelineColorBlendAttachmentState dstColorBlendFactor(int dstColorBlendFactor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR, dstColorBlendFactor);
			return this;
		}

		default int dstColorBlendFactor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR);
		}

		default VkPipelineColorBlendAttachmentState colorBlendOp(int colorBlendOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.COLORBLENDOP, colorBlendOp);
			return this;
		}

		default int colorBlendOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.COLORBLENDOP);
		}

		default VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(int srcAlphaBlendFactor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR, srcAlphaBlendFactor);
			return this;
		}

		default int srcAlphaBlendFactor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR);
		}

		default VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(int dstAlphaBlendFactor){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR, dstAlphaBlendFactor);
			return this;
		}

		default int dstAlphaBlendFactor(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR);
		}

		default VkPipelineColorBlendAttachmentState alphaBlendOp(int alphaBlendOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.ALPHABLENDOP, alphaBlendOp);
			return this;
		}

		default int alphaBlendOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.ALPHABLENDOP);
		}

		default VkPipelineColorBlendAttachmentState colorWriteMask(int colorWriteMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.COLORWRITEMASK, colorWriteMask);
			return this;
		}

		@Nullable
		default int colorWriteMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.COLORWRITEMASK);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineColorBlendAttachmentState from the given Arena.
		*/
		public static VkPipelineColorBlendAttachmentState allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineColorBlendAttachmentState from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineColorBlendAttachmentState> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.SIZEOF, (mem)->(VkPipelineColorBlendAttachmentState)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkShaderModule.html">VkShaderModule</a>
	*/
	public static record VkShaderModule(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkShaderModule>{
		public static PointerBuffer<? extends VkShaderModule> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkShaderModule(mem, parent)); //VkShaderModule
		}

		public static PointerBuffer<? extends VkShaderModule> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDeviceQueueCreateInfo.html">VkDeviceQueueCreateInfo</a>
	*/
	public interface VkDeviceQueueCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDeviceQueueCreateInfo>{
		default VkDeviceQueueCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.STYPE);
		}

		default VkDeviceQueueCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.PNEXT);
		}

		default VkDeviceQueueCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.FLAGS);
		}

		default VkDeviceQueueCreateInfo queueFamilyIndex(int queueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX, queueFamilyIndex);
			return this;
		}

		default int queueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX);
		}

		default VkDeviceQueueCreateInfo queueCount(int queueCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.QUEUECOUNT, queueCount);
			return this;
		}

		default int queueCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.QUEUECOUNT);
		}

		default VkDeviceQueueCreateInfo pQueuePriorities(FloatBuffer pQueuePriorities){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.PQUEUEPRIORITIES, (pQueuePriorities==null?MemorySegment.NULL:MemorySegment.ofBuffer(pQueuePriorities)));
			return this;
		}

		default FloatBuffer pQueuePriorities(){
			final var pQueuePriorities_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.PQUEUEPRIORITIES);
			return (pQueuePriorities_.equals(MemorySegment.NULL)?null:pQueuePriorities_.asByteBuffer().asFloatBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkDeviceQueueCreateInfo from the given Arena.
		*/
		public static VkDeviceQueueCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDeviceQueueCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDeviceQueueCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDeviceQueueCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.SIZEOF, (mem)->(VkDeviceQueueCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineLayoutCreateInfo.html">VkPipelineLayoutCreateInfo</a>
	*/
	public interface VkPipelineLayoutCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineLayoutCreateInfo>{
		default VkPipelineLayoutCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.STYPE);
		}

		default VkPipelineLayoutCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PNEXT);
		}

		default VkPipelineLayoutCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.FLAGS);
		}

		/**
		Number of descriptor sets interfaced by the pipeline
		*/
		default VkPipelineLayoutCreateInfo setLayoutCount(int setLayoutCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT, setLayoutCount);
			return this;
		}

		/**
		Number of descriptor sets interfaced by the pipeline
		*/
		@Nullable
		default int setLayoutCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT);
		}

		/**
		Array of setCount number of descriptor set layout objects defining the layout of the
		*/
		default VkPipelineLayoutCreateInfo pSetLayouts(PointerBuffer<? extends Element<? extends VkDescriptorSetLayout>> pSetLayouts){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PSETLAYOUTS, (pSetLayouts==null?MemorySegment.NULL:pSetLayouts.address()));
			return this;
		}

		/**
		Array of setCount number of descriptor set layout objects defining the layout of the
		*/
		default PointerBuffer<? extends Element<? extends VkDescriptorSetLayout>> pSetLayouts(){
			final var pSetLayouts_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PSETLAYOUTS);
			return (pSetLayouts_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pSetLayouts_, (v224591451)->(v224591451.equals(MemorySegment.NULL)?null:(Element<? extends VkDescriptorSetLayout>)()->v224591451)));
		}

		/**
		Number of push-constant ranges used by the pipeline
		*/
		default VkPipelineLayoutCreateInfo pushConstantRangeCount(int pushConstantRangeCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT, pushConstantRangeCount);
			return this;
		}

		/**
		Number of push-constant ranges used by the pipeline
		*/
		@Nullable
		default int pushConstantRangeCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT);
		}

		/**
		Array of pushConstantRangeCount number of ranges used by various shader stages
		*/
		default VkPipelineLayoutCreateInfo pPushConstantRanges(Element<VkPushConstantRange> pPushConstantRanges){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES, (pPushConstantRanges==null?MemorySegment.NULL:pPushConstantRanges.address()));
			return this;
		}

		/**
		Array of pushConstantRangeCount number of ranges used by various shader stages
		*/
		default Element<VkPushConstantRange> pPushConstantRanges(){
			final var pPushConstantRanges_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES);
			return (pPushConstantRanges_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pPushConstantRanges_, org.lwjgl.vulkan.VkPushConstantRange.SIZEOF, (v1234586997)->(v1234586997.equals(MemorySegment.NULL)?null:(VkPushConstantRange)()->v1234586997)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineLayoutCreateInfo from the given Arena.
		*/
		public static VkPipelineLayoutCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineLayoutCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineLayoutCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.SIZEOF, (mem)->(VkPipelineLayoutCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkClearRect.html">VkClearRect</a>
	*/
	public interface VkClearRect extends io.github.kartoffell.klvulkan.Element<VkClearRect>{
		default VkRect2D rect(){
			final var rect_ = address().asSlice(org.lwjgl.vulkan.VkClearRect.RECT, org.lwjgl.vulkan.VkRect2D.SIZEOF);
			return (rect_.equals(MemorySegment.NULL)?null:(VkRect2D)()->rect_);
		}

		default VkClearRect baseArrayLayer(int baseArrayLayer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearRect.BASEARRAYLAYER, baseArrayLayer);
			return this;
		}

		default int baseArrayLayer(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearRect.BASEARRAYLAYER);
		}

		default VkClearRect layerCount(int layerCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearRect.LAYERCOUNT, layerCount);
			return this;
		}

		default int layerCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkClearRect.LAYERCOUNT);
		}

		MemorySegment address();

		/**
		Allocates a new VkClearRect from the given Arena.
		*/
		public static VkClearRect allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkClearRect.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkClearRect from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkClearRect> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkClearRect.SIZEOF, (mem)->(VkClearRect)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkVertexInputBindingDescription.html">VkVertexInputBindingDescription</a>
	*/
	public interface VkVertexInputBindingDescription extends io.github.kartoffell.klvulkan.Element<VkVertexInputBindingDescription>{
		/**
		Vertex buffer binding id
		*/
		default VkVertexInputBindingDescription binding(int binding){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDescription.BINDING, binding);
			return this;
		}

		/**
		Vertex buffer binding id
		*/
		default int binding(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDescription.BINDING);
		}

		/**
		Distance between vertices in bytes (0 = no advancement)
		*/
		default VkVertexInputBindingDescription stride(int stride){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDescription.STRIDE, stride);
			return this;
		}

		/**
		Distance between vertices in bytes (0 = no advancement)
		*/
		default int stride(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDescription.STRIDE);
		}

		/**
		The rate at which the vertex data is consumed
		*/
		default VkVertexInputBindingDescription inputRate(int inputRate){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDescription.INPUTRATE, inputRate);
			return this;
		}

		/**
		The rate at which the vertex data is consumed
		*/
		default int inputRate(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkVertexInputBindingDescription.INPUTRATE);
		}

		MemorySegment address();

		/**
		Allocates a new VkVertexInputBindingDescription from the given Arena.
		*/
		public static VkVertexInputBindingDescription allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkVertexInputBindingDescription.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkVertexInputBindingDescription from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkVertexInputBindingDescription> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkVertexInputBindingDescription.SIZEOF, (mem)->(VkVertexInputBindingDescription)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageFormatProperties.html">VkImageFormatProperties</a>
	*/
	public interface VkImageFormatProperties extends io.github.kartoffell.klvulkan.Element<VkImageFormatProperties>{
		/**
		max image dimensions for this resource type
		*/
		default VkExtent3D maxExtent(){
			final var maxExtent_ = address().asSlice(org.lwjgl.vulkan.VkImageFormatProperties.MAXEXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (maxExtent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->maxExtent_);
		}

		/**
		max number of mipmap levels for this resource type
		*/
		default int maxMipLevels(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatProperties.MAXMIPLEVELS);
		}

		/**
		max array size for this resource type
		*/
		default int maxArrayLayers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatProperties.MAXARRAYLAYERS);
		}

		/**
		supported sample counts for this resource type
		*/
		@Nullable
		default int sampleCounts(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageFormatProperties.SAMPLECOUNTS);
		}

		/**
		max size (in bytes) of this resource type
		*/
		default long maxResourceSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkImageFormatProperties.MAXRESOURCESIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageFormatProperties from the given Arena.
		*/
		public static VkImageFormatProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageFormatProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageFormatProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageFormatProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageFormatProperties.SIZEOF, (mem)->(VkImageFormatProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryRequirements.html">VkMemoryRequirements</a>
	*/
	public interface VkMemoryRequirements extends io.github.kartoffell.klvulkan.Element<VkMemoryRequirements>{
		/**
		Specified in bytes
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryRequirements.SIZE);
		}

		/**
		Specified in bytes
		*/
		default long alignment(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryRequirements.ALIGNMENT);
		}

		/**
		Bitmask of the allowed memory type indices into memoryTypes[] for this object
		*/
		default int memoryTypeBits(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryRequirements.MEMORYTYPEBITS);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryRequirements from the given Arena.
		*/
		public static VkMemoryRequirements allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryRequirements.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryRequirements from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryRequirements> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryRequirements.SIZEOF, (mem)->(VkMemoryRequirements)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubresourceLayout.html">VkSubresourceLayout</a>
	*/
	public interface VkSubresourceLayout extends io.github.kartoffell.klvulkan.Element<VkSubresourceLayout>{
		/**
		Specified in bytes
		*/
		default VkSubresourceLayout offset(long offset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.OFFSET, offset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long offset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.OFFSET);
		}

		/**
		Specified in bytes
		*/
		default VkSubresourceLayout size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.SIZE, size);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.SIZE);
		}

		/**
		Specified in bytes
		*/
		default VkSubresourceLayout rowPitch(long rowPitch){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.ROWPITCH, rowPitch);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long rowPitch(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.ROWPITCH);
		}

		/**
		Specified in bytes
		*/
		default VkSubresourceLayout arrayPitch(long arrayPitch){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.ARRAYPITCH, arrayPitch);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long arrayPitch(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.ARRAYPITCH);
		}

		/**
		Specified in bytes
		*/
		default VkSubresourceLayout depthPitch(long depthPitch){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.DEPTHPITCH, depthPitch);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long depthPitch(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSubresourceLayout.DEPTHPITCH);
		}

		MemorySegment address();

		/**
		Allocates a new VkSubresourceLayout from the given Arena.
		*/
		public static VkSubresourceLayout allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubresourceLayout.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubresourceLayout from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubresourceLayout> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubresourceLayout.SIZEOF, (mem)->(VkSubresourceLayout)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkVendorId.html">VkVendorId</a>
	*/
	public interface VkVendorId{
		public static final int VK_VENDOR_ID_VSI = 65538;

		public static final int VK_VENDOR_ID_KAZAN = 65539;

		public static final int VK_VENDOR_ID_MESA = 65541;

		public static final int VK_VENDOR_ID_MOBILEYE = 65543;

		public static final int VK_VENDOR_ID_VIV = 65537;

		public static final int VK_VENDOR_ID_KHRONOS = 65536;

		public static final int VK_VENDOR_ID_CODEPLAY = 65540;

		public static final int VK_VENDOR_ID_POCL = 65542;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkInternalFreeNotification.html">PFN_vkInternalFreeNotification</a>
	*/
	public static abstract class PFN_vkInternalFreeNotification implements io.github.kartoffell.klvulkan.Element<PFN_vkInternalFreeNotification>{
		protected final MemorySegment address;

		public final MethodHandle handle_;

		public final FunctionDescriptor descriptor_ = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);

		public MemorySegment address() {
			return address;
		}

		MethodHandle PFN_vkInternalFreeNotification_;
		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkInternalFreeNotification.html">PFN_vkInternalFreeNotification</a>
		*/
		public abstract void PFN_vkInternalFreeNotification(MemorySegment pUserData, long size, int allocationType, int allocationScope);

		 {
			try {
				handle_ =  MethodHandles.lookup().findVirtual(PFN_vkInternalFreeNotification.class, "PFN_vkInternalFreeNotification_", MethodType.methodType(void.class, MemorySegment.class, MemorySegment.class, int.class, int.class));
			} catch(Exception e) {throw new IllegalStateException(e);}
		}

		public PFN_vkInternalFreeNotification(Arena arena) {
			this.address = Linker.nativeLinker().upcallStub(handle_, descriptor_, arena);
		}

		protected void PFN_vkInternalFreeNotification_(MemorySegment pUserData, MemorySegment size, int allocationType, int allocationScope) {
			PFN_vkInternalFreeNotification(pUserData, size.address(), allocationType, allocationScope);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFormatProperties.html">VkFormatProperties</a>
	*/
	public interface VkFormatProperties extends io.github.kartoffell.klvulkan.Element<VkFormatProperties>{
		/**
		Format features in case of linear tiling
		*/
		@Nullable
		default int linearTilingFeatures(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFormatProperties.LINEARTILINGFEATURES);
		}

		/**
		Format features in case of optimal tiling
		*/
		@Nullable
		default int optimalTilingFeatures(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFormatProperties.OPTIMALTILINGFEATURES);
		}

		/**
		Format features supported by buffers
		*/
		@Nullable
		default int bufferFeatures(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFormatProperties.BUFFERFEATURES);
		}

		MemorySegment address();

		/**
		Allocates a new VkFormatProperties from the given Arena.
		*/
		public static VkFormatProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkFormatProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkFormatProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkFormatProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkFormatProperties.SIZEOF, (mem)->(VkFormatProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkShaderModuleCreateInfo.html">VkShaderModuleCreateInfo</a>
	*/
	public interface VkShaderModuleCreateInfo extends io.github.kartoffell.klvulkan.Element<VkShaderModuleCreateInfo>{
		default VkShaderModuleCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkShaderModuleCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkShaderModuleCreateInfo.STYPE);
		}

		/**
		noautovalidity because this structure can be either an explicit parameter, or passed in a pNext chain
		*/
		default VkShaderModuleCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkShaderModuleCreateInfo.PNEXT, pNext);
			return this;
		}

		/**
		noautovalidity because this structure can be either an explicit parameter, or passed in a pNext chain
		*/
		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkShaderModuleCreateInfo.PNEXT);
		}

		default VkShaderModuleCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkShaderModuleCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkShaderModuleCreateInfo.FLAGS);
		}

		/**
		Specified in bytes
		*/
		default VkShaderModuleCreateInfo codeSize(long codeSize){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkShaderModuleCreateInfo.CODESIZE, MemorySegment.ofAddress(codeSize));;
			return this;
		}

		/**
		Specified in bytes
		*/
		default long codeSize(){
			final var codeSize_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkShaderModuleCreateInfo.CODESIZE);
			return codeSize_.address();
		}

		/**
		Binary code of size codeSize
		*/
		default VkShaderModuleCreateInfo pCode(IntBuffer pCode){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkShaderModuleCreateInfo.PCODE, (pCode==null?MemorySegment.NULL:MemorySegment.ofBuffer(pCode)));
			return this;
		}

		/**
		Binary code of size codeSize
		*/
		default IntBuffer pCode(){
			final var pCode_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkShaderModuleCreateInfo.PCODE);
			return (pCode_.equals(MemorySegment.NULL)?null:pCode_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkShaderModuleCreateInfo from the given Arena.
		*/
		public static VkShaderModuleCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkShaderModuleCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkShaderModuleCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkShaderModuleCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkShaderModuleCreateInfo.SIZEOF, (mem)->(VkShaderModuleCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorPool.html">VkDescriptorPool</a>
	*/
	public static record VkDescriptorPool(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkDescriptorPool>{
		public static PointerBuffer<? extends VkDescriptorPool> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkDescriptorPool(mem, parent)); //VkDescriptorPool
		}

		public static PointerBuffer<? extends VkDescriptorPool> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferLevel.html">VkCommandBufferLevel</a>
	*/
	public interface VkCommandBufferLevel{
		public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

		public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFenceCreateInfo.html">VkFenceCreateInfo</a>
	*/
	public interface VkFenceCreateInfo extends io.github.kartoffell.klvulkan.Element<VkFenceCreateInfo>{
		default VkFenceCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFenceCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFenceCreateInfo.STYPE);
		}

		default VkFenceCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFenceCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFenceCreateInfo.PNEXT);
		}

		/**
		Fence creation flags
		*/
		default VkFenceCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFenceCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Fence creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFenceCreateInfo.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkFenceCreateInfo from the given Arena.
		*/
		public static VkFenceCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkFenceCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkFenceCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkFenceCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkFenceCreateInfo.SIZEOF, (mem)->(VkFenceCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineVertexInputStateCreateInfo.html">VkPipelineVertexInputStateCreateInfo</a>
	*/
	public interface VkPipelineVertexInputStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineVertexInputStateCreateInfo>{
		default VkPipelineVertexInputStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.STYPE);
		}

		default VkPipelineVertexInputStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.PNEXT);
		}

		default VkPipelineVertexInputStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.FLAGS);
		}

		/**
		number of bindings
		*/
		default VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCount(int vertexBindingDescriptionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.VERTEXBINDINGDESCRIPTIONCOUNT, vertexBindingDescriptionCount);
			return this;
		}

		/**
		number of bindings
		*/
		@Nullable
		default int vertexBindingDescriptionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.VERTEXBINDINGDESCRIPTIONCOUNT);
		}

		default VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(Element<VkVertexInputBindingDescription> pVertexBindingDescriptions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.PVERTEXBINDINGDESCRIPTIONS, (pVertexBindingDescriptions==null?MemorySegment.NULL:pVertexBindingDescriptions.address()));
			return this;
		}

		default Element<VkVertexInputBindingDescription> pVertexBindingDescriptions(){
			final var pVertexBindingDescriptions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.PVERTEXBINDINGDESCRIPTIONS);
			return (pVertexBindingDescriptions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pVertexBindingDescriptions_, org.lwjgl.vulkan.VkVertexInputBindingDescription.SIZEOF, (v86558824)->(v86558824.equals(MemorySegment.NULL)?null:(VkVertexInputBindingDescription)()->v86558824)));
		}

		/**
		number of attributes
		*/
		default VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCount(int vertexAttributeDescriptionCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.VERTEXATTRIBUTEDESCRIPTIONCOUNT, vertexAttributeDescriptionCount);
			return this;
		}

		/**
		number of attributes
		*/
		@Nullable
		default int vertexAttributeDescriptionCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.VERTEXATTRIBUTEDESCRIPTIONCOUNT);
		}

		default VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(Element<VkVertexInputAttributeDescription> pVertexAttributeDescriptions){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.PVERTEXATTRIBUTEDESCRIPTIONS, (pVertexAttributeDescriptions==null?MemorySegment.NULL:pVertexAttributeDescriptions.address()));
			return this;
		}

		default Element<VkVertexInputAttributeDescription> pVertexAttributeDescriptions(){
			final var pVertexAttributeDescriptions_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.PVERTEXATTRIBUTEDESCRIPTIONS);
			return (pVertexAttributeDescriptions_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pVertexAttributeDescriptions_, org.lwjgl.vulkan.VkVertexInputAttributeDescription.SIZEOF, (v1180858072)->(v1180858072.equals(MemorySegment.NULL)?null:(VkVertexInputAttributeDescription)()->v1180858072)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineVertexInputStateCreateInfo from the given Arena.
		*/
		public static VkPipelineVertexInputStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineVertexInputStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineVertexInputStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.SIZEOF, (mem)->(VkPipelineVertexInputStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkEventCreateFlagBits.html">VkEventCreateFlagBits</a>
	*/
	public interface VkEventCreateFlagBits{
	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorPoolCreateInfo.html">VkDescriptorPoolCreateInfo</a>
	*/
	public interface VkDescriptorPoolCreateInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorPoolCreateInfo>{
		default VkDescriptorPoolCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.STYPE);
		}

		default VkDescriptorPoolCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.PNEXT);
		}

		default VkDescriptorPoolCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.FLAGS);
		}

		default VkDescriptorPoolCreateInfo maxSets(int maxSets){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.MAXSETS, maxSets);
			return this;
		}

		default int maxSets(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.MAXSETS);
		}

		default VkDescriptorPoolCreateInfo poolSizeCount(int poolSizeCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.POOLSIZECOUNT, poolSizeCount);
			return this;
		}

		@Nullable
		default int poolSizeCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.POOLSIZECOUNT);
		}

		default VkDescriptorPoolCreateInfo pPoolSizes(Element<VkDescriptorPoolSize> pPoolSizes){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.PPOOLSIZES, (pPoolSizes==null?MemorySegment.NULL:pPoolSizes.address()));
			return this;
		}

		default Element<VkDescriptorPoolSize> pPoolSizes(){
			final var pPoolSizes_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.PPOOLSIZES);
			return (pPoolSizes_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pPoolSizes_, org.lwjgl.vulkan.VkDescriptorPoolSize.SIZEOF, (v1558763625)->(v1558763625.equals(MemorySegment.NULL)?null:(VkDescriptorPoolSize)()->v1558763625)));
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorPoolCreateInfo from the given Arena.
		*/
		public static VkDescriptorPoolCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorPoolCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorPoolCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.SIZEOF, (mem)->(VkDescriptorPoolCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAllocationCallbacks.html">VkAllocationCallbacks</a>
	*/
	public interface VkAllocationCallbacks extends io.github.kartoffell.klvulkan.Element<VkAllocationCallbacks>{
		default VkAllocationCallbacks pUserData(MemorySegment pUserData){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PUSERDATA, pUserData);
			return this;
		}

		@Nullable
		default MemorySegment pUserData(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PUSERDATA);
		}

		default VkAllocationCallbacks pfnAllocation(Element<? extends PFN_vkAllocationFunction> pfnAllocation){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNALLOCATION, (pfnAllocation==null?MemorySegment.NULL:pfnAllocation.address()));
			return this;
		}

		default Element<? extends PFN_vkAllocationFunction> pfnAllocation(){
			final var pfnAllocation_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNALLOCATION);
			return (pfnAllocation_.equals(MemorySegment.NULL)?null:(Element<? extends PFN_vkAllocationFunction>)()->pfnAllocation_);
		}

		default VkAllocationCallbacks pfnReallocation(Element<? extends PFN_vkReallocationFunction> pfnReallocation){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNREALLOCATION, (pfnReallocation==null?MemorySegment.NULL:pfnReallocation.address()));
			return this;
		}

		default Element<? extends PFN_vkReallocationFunction> pfnReallocation(){
			final var pfnReallocation_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNREALLOCATION);
			return (pfnReallocation_.equals(MemorySegment.NULL)?null:(Element<? extends PFN_vkReallocationFunction>)()->pfnReallocation_);
		}

		default VkAllocationCallbacks pfnFree(Element<? extends PFN_vkFreeFunction> pfnFree){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNFREE, (pfnFree==null?MemorySegment.NULL:pfnFree.address()));
			return this;
		}

		default Element<? extends PFN_vkFreeFunction> pfnFree(){
			final var pfnFree_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNFREE);
			return (pfnFree_.equals(MemorySegment.NULL)?null:(Element<? extends PFN_vkFreeFunction>)()->pfnFree_);
		}

		default VkAllocationCallbacks pfnInternalAllocation(Element<? extends PFN_vkInternalAllocationNotification> pfnInternalAllocation){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNINTERNALALLOCATION, (pfnInternalAllocation==null?MemorySegment.NULL:pfnInternalAllocation.address()));
			return this;
		}

		@Nullable
		default Element<? extends PFN_vkInternalAllocationNotification> pfnInternalAllocation(){
			final var pfnInternalAllocation_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNINTERNALALLOCATION);
			return (pfnInternalAllocation_.equals(MemorySegment.NULL)?null:(Element<? extends PFN_vkInternalAllocationNotification>)()->pfnInternalAllocation_);
		}

		default VkAllocationCallbacks pfnInternalFree(Element<? extends PFN_vkInternalFreeNotification> pfnInternalFree){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNINTERNALFREE, (pfnInternalFree==null?MemorySegment.NULL:pfnInternalFree.address()));
			return this;
		}

		@Nullable
		default Element<? extends PFN_vkInternalFreeNotification> pfnInternalFree(){
			final var pfnInternalFree_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkAllocationCallbacks.PFNINTERNALFREE);
			return (pfnInternalFree_.equals(MemorySegment.NULL)?null:(Element<? extends PFN_vkInternalFreeNotification>)()->pfnInternalFree_);
		}

		MemorySegment address();

		/**
		Allocates a new VkAllocationCallbacks from the given Arena.
		*/
		public static VkAllocationCallbacks allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkAllocationCallbacks.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkAllocationCallbacks from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkAllocationCallbacks> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkAllocationCallbacks.SIZEOF, (mem)->(VkAllocationCallbacks)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSpecializationInfo.html">VkSpecializationInfo</a>
	*/
	public interface VkSpecializationInfo extends io.github.kartoffell.klvulkan.Element<VkSpecializationInfo>{
		/**
		Number of entries in the map
		*/
		default VkSpecializationInfo mapEntryCount(int mapEntryCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSpecializationInfo.MAPENTRYCOUNT, mapEntryCount);
			return this;
		}

		/**
		Number of entries in the map
		*/
		@Nullable
		default int mapEntryCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSpecializationInfo.MAPENTRYCOUNT);
		}

		/**
		Array of map entries
		*/
		default VkSpecializationInfo pMapEntries(Element<VkSpecializationMapEntry> pMapEntries){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationInfo.PMAPENTRIES, (pMapEntries==null?MemorySegment.NULL:pMapEntries.address()));
			return this;
		}

		/**
		Array of map entries
		*/
		default Element<VkSpecializationMapEntry> pMapEntries(){
			final var pMapEntries_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationInfo.PMAPENTRIES);
			return (pMapEntries_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pMapEntries_, org.lwjgl.vulkan.VkSpecializationMapEntry.SIZEOF, (v669965156)->(v669965156.equals(MemorySegment.NULL)?null:(VkSpecializationMapEntry)()->v669965156)));
		}

		/**
		Size in bytes of pData
		*/
		default VkSpecializationInfo dataSize(long dataSize){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationInfo.DATASIZE, MemorySegment.ofAddress(dataSize));;
			return this;
		}

		/**
		Size in bytes of pData
		*/
		@Nullable
		default long dataSize(){
			final var dataSize_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationInfo.DATASIZE);
			return dataSize_.address();
		}

		/**
		Pointer to SpecConstant data
		*/
		default VkSpecializationInfo pData(MemorySegment pData){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationInfo.PDATA, pData);
			return this;
		}

		/**
		Pointer to SpecConstant data
		*/
		default MemorySegment pData(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationInfo.PDATA);
		}

		MemorySegment address();

		/**
		Allocates a new VkSpecializationInfo from the given Arena.
		*/
		public static VkSpecializationInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSpecializationInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSpecializationInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSpecializationInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSpecializationInfo.SIZEOF, (mem)->(VkSpecializationInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageUsageFlagBits.html">VkImageUsageFlagBits</a>
	*/
	public interface VkImageUsageFlagBits{
		public static final int VK_IMAGE_USAGE_STORAGE_BIT = 8;

		public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 32;

		public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 1;

		public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 4;

		public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 64;

		public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 2;

		public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 16;

		public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 128;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRenderPassCreateInfo.html">VkRenderPassCreateInfo</a>
	*/
	public interface VkRenderPassCreateInfo extends io.github.kartoffell.klvulkan.Element<VkRenderPassCreateInfo>{
		default VkRenderPassCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.STYPE);
		}

		default VkRenderPassCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PNEXT);
		}

		default VkRenderPassCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.FLAGS);
		}

		default VkRenderPassCreateInfo attachmentCount(int attachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.ATTACHMENTCOUNT, attachmentCount);
			return this;
		}

		@Nullable
		default int attachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.ATTACHMENTCOUNT);
		}

		default VkRenderPassCreateInfo pAttachments(Element<VkAttachmentDescription> pAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PATTACHMENTS, (pAttachments==null?MemorySegment.NULL:pAttachments.address()));
			return this;
		}

		default Element<VkAttachmentDescription> pAttachments(){
			final var pAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PATTACHMENTS);
			return (pAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pAttachments_, org.lwjgl.vulkan.VkAttachmentDescription.SIZEOF, (v1690713209)->(v1690713209.equals(MemorySegment.NULL)?null:(VkAttachmentDescription)()->v1690713209)));
		}

		default VkRenderPassCreateInfo subpassCount(int subpassCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.SUBPASSCOUNT, subpassCount);
			return this;
		}

		default int subpassCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.SUBPASSCOUNT);
		}

		default VkRenderPassCreateInfo pSubpasses(Element<VkSubpassDescription> pSubpasses){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PSUBPASSES, (pSubpasses==null?MemorySegment.NULL:pSubpasses.address()));
			return this;
		}

		default Element<VkSubpassDescription> pSubpasses(){
			final var pSubpasses_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PSUBPASSES);
			return (pSubpasses_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pSubpasses_, org.lwjgl.vulkan.VkSubpassDescription.SIZEOF, (v835146383)->(v835146383.equals(MemorySegment.NULL)?null:(VkSubpassDescription)()->v835146383)));
		}

		default VkRenderPassCreateInfo dependencyCount(int dependencyCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.DEPENDENCYCOUNT, dependencyCount);
			return this;
		}

		@Nullable
		default int dependencyCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkRenderPassCreateInfo.DEPENDENCYCOUNT);
		}

		default VkRenderPassCreateInfo pDependencies(Element<VkSubpassDependency> pDependencies){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PDEPENDENCIES, (pDependencies==null?MemorySegment.NULL:pDependencies.address()));
			return this;
		}

		default Element<VkSubpassDependency> pDependencies(){
			final var pDependencies_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkRenderPassCreateInfo.PDEPENDENCIES);
			return (pDependencies_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDependencies_, org.lwjgl.vulkan.VkSubpassDependency.SIZEOF, (v729218894)->(v729218894.equals(MemorySegment.NULL)?null:(VkSubpassDependency)()->v729218894)));
		}

		MemorySegment address();

		/**
		Allocates a new VkRenderPassCreateInfo from the given Arena.
		*/
		public static VkRenderPassCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRenderPassCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRenderPassCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRenderPassCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRenderPassCreateInfo.SIZEOF, (mem)->(VkRenderPassCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkAttachmentDescription.html">VkAttachmentDescription</a>
	*/
	public interface VkAttachmentDescription extends io.github.kartoffell.klvulkan.Element<VkAttachmentDescription>{
		default VkAttachmentDescription flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.FLAGS);
		}

		default VkAttachmentDescription format(int format){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.FORMAT, format);
			return this;
		}

		default int format(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.FORMAT);
		}

		default VkAttachmentDescription samples(int samples){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.SAMPLES, samples);
			return this;
		}

		default int samples(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.SAMPLES);
		}

		/**
		Load operation for color or depth data
		*/
		default VkAttachmentDescription loadOp(int loadOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.LOADOP, loadOp);
			return this;
		}

		/**
		Load operation for color or depth data
		*/
		default int loadOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.LOADOP);
		}

		/**
		Store operation for color or depth data
		*/
		default VkAttachmentDescription storeOp(int storeOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.STOREOP, storeOp);
			return this;
		}

		/**
		Store operation for color or depth data
		*/
		default int storeOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.STOREOP);
		}

		/**
		Load operation for stencil data
		*/
		default VkAttachmentDescription stencilLoadOp(int stencilLoadOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.STENCILLOADOP, stencilLoadOp);
			return this;
		}

		/**
		Load operation for stencil data
		*/
		default int stencilLoadOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.STENCILLOADOP);
		}

		/**
		Store operation for stencil data
		*/
		default VkAttachmentDescription stencilStoreOp(int stencilStoreOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.STENCILSTOREOP, stencilStoreOp);
			return this;
		}

		/**
		Store operation for stencil data
		*/
		default int stencilStoreOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.STENCILSTOREOP);
		}

		default VkAttachmentDescription initialLayout(int initialLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.INITIALLAYOUT, initialLayout);
			return this;
		}

		default int initialLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.INITIALLAYOUT);
		}

		default VkAttachmentDescription finalLayout(int finalLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.FINALLAYOUT, finalLayout);
			return this;
		}

		default int finalLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkAttachmentDescription.FINALLAYOUT);
		}

		MemorySegment address();

		/**
		Allocates a new VkAttachmentDescription from the given Arena.
		*/
		public static VkAttachmentDescription allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkAttachmentDescription.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkAttachmentDescription from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkAttachmentDescription> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkAttachmentDescription.SIZEOF, (mem)->(VkAttachmentDescription)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineViewportStateCreateInfo.html">VkPipelineViewportStateCreateInfo</a>
	*/
	public interface VkPipelineViewportStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineViewportStateCreateInfo>{
		default VkPipelineViewportStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.STYPE);
		}

		default VkPipelineViewportStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PNEXT);
		}

		default VkPipelineViewportStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.FLAGS);
		}

		default VkPipelineViewportStateCreateInfo viewportCount(int viewportCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT, viewportCount);
			return this;
		}

		@Nullable
		default int viewportCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT);
		}

		default VkPipelineViewportStateCreateInfo pViewports(Element<VkViewport> pViewports){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PVIEWPORTS, (pViewports==null?MemorySegment.NULL:pViewports.address()));
			return this;
		}

		@Nullable
		default Element<VkViewport> pViewports(){
			final var pViewports_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PVIEWPORTS);
			return (pViewports_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pViewports_, org.lwjgl.vulkan.VkViewport.SIZEOF, (v2048013503)->(v2048013503.equals(MemorySegment.NULL)?null:(VkViewport)()->v2048013503)));
		}

		default VkPipelineViewportStateCreateInfo scissorCount(int scissorCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SCISSORCOUNT, scissorCount);
			return this;
		}

		@Nullable
		default int scissorCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SCISSORCOUNT);
		}

		default VkPipelineViewportStateCreateInfo pScissors(Element<VkRect2D> pScissors){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PSCISSORS, (pScissors==null?MemorySegment.NULL:pScissors.address()));
			return this;
		}

		@Nullable
		default Element<VkRect2D> pScissors(){
			final var pScissors_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PSCISSORS);
			return (pScissors_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pScissors_, org.lwjgl.vulkan.VkRect2D.SIZEOF, (v795011696)->(v795011696.equals(MemorySegment.NULL)?null:(VkRect2D)()->v795011696)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineViewportStateCreateInfo from the given Arena.
		*/
		public static VkPipelineViewportStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineViewportStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineViewportStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF, (mem)->(VkPipelineViewportStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryAllocateInfo.html">VkMemoryAllocateInfo</a>
	*/
	public interface VkMemoryAllocateInfo extends io.github.kartoffell.klvulkan.Element<VkMemoryAllocateInfo>{
		default VkMemoryAllocateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateInfo.STYPE);
		}

		default VkMemoryAllocateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryAllocateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkMemoryAllocateInfo.PNEXT);
		}

		/**
		Size of memory allocation
		*/
		default VkMemoryAllocateInfo allocationSize(long allocationSize){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryAllocateInfo.ALLOCATIONSIZE, allocationSize);
			return this;
		}

		/**
		Size of memory allocation
		*/
		default long allocationSize(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkMemoryAllocateInfo.ALLOCATIONSIZE);
		}

		/**
		Index of the of the memory type to allocate from
		*/
		default VkMemoryAllocateInfo memoryTypeIndex(int memoryTypeIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateInfo.MEMORYTYPEINDEX, memoryTypeIndex);
			return this;
		}

		/**
		Index of the of the memory type to allocate from
		*/
		default int memoryTypeIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkMemoryAllocateInfo.MEMORYTYPEINDEX);
		}

		MemorySegment address();

		/**
		Allocates a new VkMemoryAllocateInfo from the given Arena.
		*/
		public static VkMemoryAllocateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkMemoryAllocateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkMemoryAllocateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkMemoryAllocateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkMemoryAllocateInfo.SIZEOF, (mem)->(VkMemoryAllocateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkExtent3D.html">VkExtent3D</a>
	*/
	public interface VkExtent3D extends io.github.kartoffell.klvulkan.Element<VkExtent3D>{
		default VkExtent3D width(int width){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent3D.WIDTH, width);
			return this;
		}

		default int width(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent3D.WIDTH);
		}

		default VkExtent3D height(int height){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent3D.HEIGHT, height);
			return this;
		}

		default int height(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent3D.HEIGHT);
		}

		default VkExtent3D depth(int depth){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent3D.DEPTH, depth);
			return this;
		}

		default int depth(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkExtent3D.DEPTH);
		}

		MemorySegment address();

		/**
		Allocates a new VkExtent3D from the given Arena.
		*/
		public static VkExtent3D allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkExtent3D from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkExtent3D> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkExtent3D.SIZEOF, (mem)->(VkExtent3D)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseBufferMemoryBindInfo.html">VkSparseBufferMemoryBindInfo</a>
	*/
	public interface VkSparseBufferMemoryBindInfo extends io.github.kartoffell.klvulkan.Element<VkSparseBufferMemoryBindInfo>{
		default VkSparseBufferMemoryBindInfo buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		default VkSparseBufferMemoryBindInfo bindCount(int bindCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.BINDCOUNT, bindCount);
			return this;
		}

		default int bindCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.BINDCOUNT);
		}

		default VkSparseBufferMemoryBindInfo pBinds(Element<VkSparseMemoryBind> pBinds){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.PBINDS, (pBinds==null?MemorySegment.NULL:pBinds.address()));
			return this;
		}

		default Element<VkSparseMemoryBind> pBinds(){
			final var pBinds_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.PBINDS);
			return (pBinds_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pBinds_, org.lwjgl.vulkan.VkSparseMemoryBind.SIZEOF, (v616207929)->(v616207929.equals(MemorySegment.NULL)?null:(VkSparseMemoryBind)()->v616207929)));
		}

		MemorySegment address();

		/**
		Allocates a new VkSparseBufferMemoryBindInfo from the given Arena.
		*/
		public static VkSparseBufferMemoryBindInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSparseBufferMemoryBindInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSparseBufferMemoryBindInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.SIZEOF, (mem)->(VkSparseBufferMemoryBindInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueryType.html">VkQueryType</a>
	*/
	public interface VkQueryType{
		public static final int VK_QUERY_TYPE_OCCLUSION = 0;

		public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;

		public static final int VK_QUERY_TYPE_TIMESTAMP = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkComponentSwizzle.html">VkComponentSwizzle</a>
	*/
	public interface VkComponentSwizzle{
		public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;

		public static final int VK_COMPONENT_SWIZZLE_R = 3;

		public static final int VK_COMPONENT_SWIZZLE_B = 5;

		public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;

		public static final int VK_COMPONENT_SWIZZLE_ONE = 2;

		public static final int VK_COMPONENT_SWIZZLE_A = 6;

		public static final int VK_COMPONENT_SWIZZLE_G = 4;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueryPoolCreateInfo.html">VkQueryPoolCreateInfo</a>
	*/
	public interface VkQueryPoolCreateInfo extends io.github.kartoffell.klvulkan.Element<VkQueryPoolCreateInfo>{
		default VkQueryPoolCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.STYPE);
		}

		default VkQueryPoolCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkQueryPoolCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkQueryPoolCreateInfo.PNEXT);
		}

		default VkQueryPoolCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.FLAGS);
		}

		default VkQueryPoolCreateInfo queryType(int queryType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYTYPE, queryType);
			return this;
		}

		default int queryType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYTYPE);
		}

		default VkQueryPoolCreateInfo queryCount(int queryCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYCOUNT, queryCount);
			return this;
		}

		default int queryCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYCOUNT);
		}

		/**
		Optional
		*/
		default VkQueryPoolCreateInfo pipelineStatistics(int pipelineStatistics){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.PIPELINESTATISTICS, pipelineStatistics);
			return this;
		}

		/**
		Optional
		*/
		@Nullable
		default int pipelineStatistics(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkQueryPoolCreateInfo.PIPELINESTATISTICS);
		}

		MemorySegment address();

		/**
		Allocates a new VkQueryPoolCreateInfo from the given Arena.
		*/
		public static VkQueryPoolCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkQueryPoolCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkQueryPoolCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF, (mem)->(VkQueryPoolCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDevice.html">VkPhysicalDevice</a>
	*/
	public static class VkPhysicalDevice implements io.github.kartoffell.klvulkan.Element<VkPhysicalDevice>{
		protected final MemorySegment address;

		protected final VkInstance parent;

		protected final VkCapabilitiesInstance capabilities;

		public MemorySegment address() {
			return address;
		}

		public VkInstance parent() {
			return parent;
		}

		public VkCapabilitiesInstance capabilities() {
			return capabilities;
		}

		public VkPhysicalDevice(MemorySegment address, VkInstance parent) {
			this.address = address;
			this.parent = parent;
			this.capabilities = parent.capabilities;
		}

		public static PointerBuffer<? extends VkPhysicalDevice> pointer(Arena arena, int count, VkInstance parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkInstance)parent).VkPhysicalDevice(mem, parent)); //VkPhysicalDevice
		}

		public static PointerBuffer<? extends VkPhysicalDevice> pointer(Arena arena, VkInstance parent) {
			return pointer(arena, 1, parent);
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceFeatures.html">vkGetPhysicalDeviceFeatures</a>
		*/
		public void vkGetPhysicalDeviceFeatures(Element<VkPhysicalDeviceFeatures> pFeatures) {
			if(capabilities.vkGetPhysicalDeviceFeatures_==null) {
				capabilities.vkGetPhysicalDeviceFeatures_ = capabilities.lookup("vkGetPhysicalDeviceFeatures", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceFeatures_.invoke(address(), (pFeatures==null?MemorySegment.NULL:pFeatures.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceFormatProperties.html">vkGetPhysicalDeviceFormatProperties</a>
		*/
		public void vkGetPhysicalDeviceFormatProperties(int format, Element<VkFormatProperties> pFormatProperties) {
			if(capabilities.vkGetPhysicalDeviceFormatProperties_==null) {
				capabilities.vkGetPhysicalDeviceFormatProperties_ = capabilities.lookup("vkGetPhysicalDeviceFormatProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceFormatProperties_.invoke(address(), format, (pFormatProperties==null?MemorySegment.NULL:pFormatProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_LAYER_NOT_PRESENT ->{@value VkResult#VK_ERROR_LAYER_NOT_PRESENT}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEnumerateDeviceExtensionProperties.html">vkEnumerateDeviceExtensionProperties</a>
		*/
		public int vkEnumerateDeviceExtensionProperties(@Nullable CString pLayerName, IntBuffer pPropertyCount, @Nullable Element<VkExtensionProperties> pProperties) {
			if(capabilities.vkEnumerateDeviceExtensionProperties_==null) {
				capabilities.vkEnumerateDeviceExtensionProperties_ = capabilities.lookup("vkEnumerateDeviceExtensionProperties", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkEnumerateDeviceExtensionProperties_.invoke(address(), pLayerName==null?MemorySegment.NULL:pLayerName.address(), (pPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPropertyCount)), (pProperties==null?MemorySegment.NULL:pProperties.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceSparseImageFormatProperties.html">vkGetPhysicalDeviceSparseImageFormatProperties</a>
		*/
		public void vkGetPhysicalDeviceSparseImageFormatProperties(int format, int type, int samples, int usage, int tiling, IntBuffer pPropertyCount, @Nullable Element<VkSparseImageFormatProperties> pProperties) {
			if(capabilities.vkGetPhysicalDeviceSparseImageFormatProperties_==null) {
				capabilities.vkGetPhysicalDeviceSparseImageFormatProperties_ = capabilities.lookup("vkGetPhysicalDeviceSparseImageFormatProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceSparseImageFormatProperties_.invoke(address(), format, type, samples, usage, tiling, (pPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPropertyCount)), (pProperties==null?MemorySegment.NULL:pProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEnumerateDeviceLayerProperties.html">vkEnumerateDeviceLayerProperties</a>
		*/
		@Deprecated(since = "legacy-devicelayers:")
		public int vkEnumerateDeviceLayerProperties(IntBuffer pPropertyCount, @Nullable Element<VkLayerProperties> pProperties) {
			if(capabilities.vkEnumerateDeviceLayerProperties_==null) {
				capabilities.vkEnumerateDeviceLayerProperties_ = capabilities.lookup("vkEnumerateDeviceLayerProperties", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkEnumerateDeviceLayerProperties_.invoke(address(), (pPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPropertyCount)), (pProperties==null?MemorySegment.NULL:pProperties.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
				return return_;
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceProperties.html">vkGetPhysicalDeviceProperties</a>
		*/
		public void vkGetPhysicalDeviceProperties(Element<VkPhysicalDeviceProperties> pProperties) {
			if(capabilities.vkGetPhysicalDeviceProperties_==null) {
				capabilities.vkGetPhysicalDeviceProperties_ = capabilities.lookup("vkGetPhysicalDeviceProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceProperties_.invoke(address(), (pProperties==null?MemorySegment.NULL:pProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
		@throws VK_ERROR_EXTENSION_NOT_PRESENT ->{@value VkResult#VK_ERROR_EXTENSION_NOT_PRESENT}
		@throws VK_ERROR_FEATURE_NOT_PRESENT ->{@value VkResult#VK_ERROR_FEATURE_NOT_PRESENT}
		@throws VK_ERROR_TOO_MANY_OBJECTS ->{@value VkResult#VK_ERROR_TOO_MANY_OBJECTS}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateDevice.html">vkCreateDevice</a>
		*/
		public void vkCreateDevice(Element<VkDeviceCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkDevice>> pDevice) {
			if(capabilities.vkCreateDevice_==null) {
				capabilities.vkCreateDevice_ = capabilities.lookup("vkCreateDevice", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkCreateDevice_.invoke(address(), (pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pDevice==null?MemorySegment.NULL:pDevice.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceQueueFamilyProperties.html">vkGetPhysicalDeviceQueueFamilyProperties</a>
		*/
		public void vkGetPhysicalDeviceQueueFamilyProperties(IntBuffer pQueueFamilyPropertyCount, @Nullable Element<VkQueueFamilyProperties> pQueueFamilyProperties) {
			if(capabilities.vkGetPhysicalDeviceQueueFamilyProperties_==null) {
				capabilities.vkGetPhysicalDeviceQueueFamilyProperties_ = capabilities.lookup("vkGetPhysicalDeviceQueueFamilyProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceQueueFamilyProperties_.invoke(address(), (pQueueFamilyPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pQueueFamilyPropertyCount)), (pQueueFamilyProperties==null?MemorySegment.NULL:pQueueFamilyProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceMemoryProperties.html">vkGetPhysicalDeviceMemoryProperties</a>
		*/
		public void vkGetPhysicalDeviceMemoryProperties(Element<VkPhysicalDeviceMemoryProperties> pMemoryProperties) {
			if(capabilities.vkGetPhysicalDeviceMemoryProperties_==null) {
				capabilities.vkGetPhysicalDeviceMemoryProperties_ = capabilities.lookup("vkGetPhysicalDeviceMemoryProperties", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				capabilities.vkGetPhysicalDeviceMemoryProperties_.invoke(address(), (pMemoryProperties==null?MemorySegment.NULL:pMemoryProperties.address()));
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_FORMAT_NOT_SUPPORTED ->{@value VkResult#VK_ERROR_FORMAT_NOT_SUPPORTED}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkGetPhysicalDeviceImageFormatProperties.html">vkGetPhysicalDeviceImageFormatProperties</a>
		*/
		public void vkGetPhysicalDeviceImageFormatProperties(int format, int type, int tiling, int usage, @Nullable int flags, Element<VkImageFormatProperties> pImageFormatProperties) {
			if(capabilities.vkGetPhysicalDeviceImageFormatProperties_==null) {
				capabilities.vkGetPhysicalDeviceImageFormatProperties_ = capabilities.lookup("vkGetPhysicalDeviceImageFormatProperties", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkGetPhysicalDeviceImageFormatProperties_.invoke(address(), format, type, tiling, usage, flags, (pImageFormatProperties==null?MemorySegment.NULL:pImageFormatProperties.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferImageCopy.html">VkBufferImageCopy</a>
	*/
	public interface VkBufferImageCopy extends io.github.kartoffell.klvulkan.Element<VkBufferImageCopy>{
		/**
		Specified in bytes
		*/
		default VkBufferImageCopy bufferOffset(long bufferOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferImageCopy.BUFFEROFFSET, bufferOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long bufferOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferImageCopy.BUFFEROFFSET);
		}

		/**
		Specified in texels
		*/
		default VkBufferImageCopy bufferRowLength(int bufferRowLength){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy.BUFFERROWLENGTH, bufferRowLength);
			return this;
		}

		/**
		Specified in texels
		*/
		default int bufferRowLength(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy.BUFFERROWLENGTH);
		}

		default VkBufferImageCopy bufferImageHeight(int bufferImageHeight){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy.BUFFERIMAGEHEIGHT, bufferImageHeight);
			return this;
		}

		default int bufferImageHeight(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferImageCopy.BUFFERIMAGEHEIGHT);
		}

		default VkImageSubresourceLayers imageSubresource(){
			final var imageSubresource_ = address().asSlice(org.lwjgl.vulkan.VkBufferImageCopy.IMAGESUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (imageSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->imageSubresource_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkOffset3D imageOffset(){
			final var imageOffset_ = address().asSlice(org.lwjgl.vulkan.VkBufferImageCopy.IMAGEOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (imageOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->imageOffset_);
		}

		/**
		Specified in pixels for both compressed and uncompressed images
		*/
		default VkExtent3D imageExtent(){
			final var imageExtent_ = address().asSlice(org.lwjgl.vulkan.VkBufferImageCopy.IMAGEEXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (imageExtent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->imageExtent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferImageCopy from the given Arena.
		*/
		public static VkBufferImageCopy allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferImageCopy.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferImageCopy from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferImageCopy> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferImageCopy.SIZEOF, (mem)->(VkBufferImageCopy)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBindSparseInfo.html">VkBindSparseInfo</a>
	*/
	public interface VkBindSparseInfo extends io.github.kartoffell.klvulkan.Element<VkBindSparseInfo>{
		default VkBindSparseInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.STYPE);
		}

		default VkBindSparseInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PNEXT);
		}

		default VkBindSparseInfo waitSemaphoreCount(int waitSemaphoreCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.WAITSEMAPHORECOUNT, waitSemaphoreCount);
			return this;
		}

		@Nullable
		default int waitSemaphoreCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.WAITSEMAPHORECOUNT);
		}

		default VkBindSparseInfo pWaitSemaphores(PointerBuffer<? extends Element<? extends VkSemaphore>> pWaitSemaphores){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PWAITSEMAPHORES, (pWaitSemaphores==null?MemorySegment.NULL:pWaitSemaphores.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkSemaphore>> pWaitSemaphores(){
			final var pWaitSemaphores_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PWAITSEMAPHORES);
			return (pWaitSemaphores_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pWaitSemaphores_, (v1408695561)->(v1408695561.equals(MemorySegment.NULL)?null:(Element<? extends VkSemaphore>)()->v1408695561)));
		}

		default VkBindSparseInfo bufferBindCount(int bufferBindCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.BUFFERBINDCOUNT, bufferBindCount);
			return this;
		}

		@Nullable
		default int bufferBindCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.BUFFERBINDCOUNT);
		}

		default VkBindSparseInfo pBufferBinds(Element<VkSparseBufferMemoryBindInfo> pBufferBinds){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PBUFFERBINDS, (pBufferBinds==null?MemorySegment.NULL:pBufferBinds.address()));
			return this;
		}

		default Element<VkSparseBufferMemoryBindInfo> pBufferBinds(){
			final var pBufferBinds_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PBUFFERBINDS);
			return (pBufferBinds_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pBufferBinds_, org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.SIZEOF, (v1811922029)->(v1811922029.equals(MemorySegment.NULL)?null:(VkSparseBufferMemoryBindInfo)()->v1811922029)));
		}

		default VkBindSparseInfo imageOpaqueBindCount(int imageOpaqueBindCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT, imageOpaqueBindCount);
			return this;
		}

		@Nullable
		default int imageOpaqueBindCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT);
		}

		default VkBindSparseInfo pImageOpaqueBinds(Element<VkSparseImageOpaqueMemoryBindInfo> pImageOpaqueBinds){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEOPAQUEBINDS, (pImageOpaqueBinds==null?MemorySegment.NULL:pImageOpaqueBinds.address()));
			return this;
		}

		default Element<VkSparseImageOpaqueMemoryBindInfo> pImageOpaqueBinds(){
			final var pImageOpaqueBinds_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEOPAQUEBINDS);
			return (pImageOpaqueBinds_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pImageOpaqueBinds_, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.SIZEOF, (v461698165)->(v461698165.equals(MemorySegment.NULL)?null:(VkSparseImageOpaqueMemoryBindInfo)()->v461698165)));
		}

		default VkBindSparseInfo imageBindCount(int imageBindCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.IMAGEBINDCOUNT, imageBindCount);
			return this;
		}

		@Nullable
		default int imageBindCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.IMAGEBINDCOUNT);
		}

		default VkBindSparseInfo pImageBinds(Element<VkSparseImageMemoryBindInfo> pImageBinds){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEBINDS, (pImageBinds==null?MemorySegment.NULL:pImageBinds.address()));
			return this;
		}

		default Element<VkSparseImageMemoryBindInfo> pImageBinds(){
			final var pImageBinds_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEBINDS);
			return (pImageBinds_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pImageBinds_, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.SIZEOF, (v2001321875)->(v2001321875.equals(MemorySegment.NULL)?null:(VkSparseImageMemoryBindInfo)()->v2001321875)));
		}

		default VkBindSparseInfo signalSemaphoreCount(int signalSemaphoreCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.SIGNALSEMAPHORECOUNT, signalSemaphoreCount);
			return this;
		}

		@Nullable
		default int signalSemaphoreCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBindSparseInfo.SIGNALSEMAPHORECOUNT);
		}

		default VkBindSparseInfo pSignalSemaphores(PointerBuffer<? extends Element<? extends VkSemaphore>> pSignalSemaphores){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PSIGNALSEMAPHORES, (pSignalSemaphores==null?MemorySegment.NULL:pSignalSemaphores.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkSemaphore>> pSignalSemaphores(){
			final var pSignalSemaphores_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBindSparseInfo.PSIGNALSEMAPHORES);
			return (pSignalSemaphores_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pSignalSemaphores_, (v322112198)->(v322112198.equals(MemorySegment.NULL)?null:(Element<? extends VkSemaphore>)()->v322112198)));
		}

		MemorySegment address();

		/**
		Allocates a new VkBindSparseInfo from the given Arena.
		*/
		public static VkBindSparseInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBindSparseInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBindSparseInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF, (mem)->(VkBindSparseInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueryControlFlagBits.html">VkQueryControlFlagBits</a>
	*/
	public interface VkQueryControlFlagBits{
		public static final int VK_QUERY_CONTROL_PRECISE_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCreateFlagBits.html">VkPipelineCreateFlagBits</a>
	*/
	public interface VkPipelineCreateFlagBits{
		public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 4;

		public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 2;

		public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferUsageFlagBits.html">VkBufferUsageFlagBits</a>
	*/
	public interface VkBufferUsageFlagBits{
		public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 256;

		public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 2;

		public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 8;

		public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 4;

		public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 64;

		public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 128;

		public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 1;

		public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 32;

		public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 16;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageSubresource.html">VkImageSubresource</a>
	*/
	public interface VkImageSubresource extends io.github.kartoffell.klvulkan.Element<VkImageSubresource>{
		default VkImageSubresource aspectMask(int aspectMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource.ASPECTMASK, aspectMask);
			return this;
		}

		default int aspectMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource.ASPECTMASK);
		}

		default VkImageSubresource mipLevel(int mipLevel){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource.MIPLEVEL, mipLevel);
			return this;
		}

		default int mipLevel(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource.MIPLEVEL);
		}

		default VkImageSubresource arrayLayer(int arrayLayer){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource.ARRAYLAYER, arrayLayer);
			return this;
		}

		default int arrayLayer(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkImageSubresource.ARRAYLAYER);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageSubresource from the given Arena.
		*/
		public static VkImageSubresource allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageSubresource.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageSubresource from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageSubresource> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageSubresource.SIZEOF, (mem)->(VkImageSubresource)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSemaphore.html">VkSemaphore</a>
	*/
	public static record VkSemaphore(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkSemaphore>{
		public static PointerBuffer<? extends VkSemaphore> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkSemaphore(mem, parent)); //VkSemaphore
		}

		public static PointerBuffer<? extends VkSemaphore> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImage.html">VkImage</a>
	*/
	public static record VkImage(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkImage>{
		public static PointerBuffer<? extends VkImage> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkImage(mem, parent)); //VkImage
		}

		public static PointerBuffer<? extends VkImage> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSamplerMipmapMode.html">VkSamplerMipmapMode</a>
	*/
	public interface VkSamplerMipmapMode{
		public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;

		public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFence.html">VkFence</a>
	*/
	public static record VkFence(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkFence>{
		public static PointerBuffer<? extends VkFence> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkFence(mem, parent)); //VkFence
		}

		public static PointerBuffer<? extends VkFence> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageResolve.html">VkImageResolve</a>
	*/
	public interface VkImageResolve extends io.github.kartoffell.klvulkan.Element<VkImageResolve>{
		default VkImageSubresourceLayers srcSubresource(){
			final var srcSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve.SRCSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (srcSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->srcSubresource_);
		}

		default VkOffset3D srcOffset(){
			final var srcOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve.SRCOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (srcOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->srcOffset_);
		}

		default VkImageSubresourceLayers dstSubresource(){
			final var dstSubresource_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve.DSTSUBRESOURCE, org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF);
			return (dstSubresource_.equals(MemorySegment.NULL)?null:(VkImageSubresourceLayers)()->dstSubresource_);
		}

		default VkOffset3D dstOffset(){
			final var dstOffset_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve.DSTOFFSET, org.lwjgl.vulkan.VkOffset3D.SIZEOF);
			return (dstOffset_.equals(MemorySegment.NULL)?null:(VkOffset3D)()->dstOffset_);
		}

		default VkExtent3D extent(){
			final var extent_ = address().asSlice(org.lwjgl.vulkan.VkImageResolve.EXTENT, org.lwjgl.vulkan.VkExtent3D.SIZEOF);
			return (extent_.equals(MemorySegment.NULL)?null:(VkExtent3D)()->extent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkImageResolve from the given Arena.
		*/
		public static VkImageResolve allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkImageResolve.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkImageResolve from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkImageResolve> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkImageResolve.SIZEOF, (mem)->(VkImageResolve)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueue.html">VkQueue</a>
	*/
	public static class VkQueue implements io.github.kartoffell.klvulkan.Element<VkQueue>{
		protected final MemorySegment address;

		protected final VkDevice parent;

		protected final VkCapabilitiesDevice capabilities;

		public MemorySegment address() {
			return address;
		}

		public VkDevice parent() {
			return parent;
		}

		public VkCapabilitiesDevice capabilities() {
			return capabilities;
		}

		public VkQueue(MemorySegment address, VkDevice parent) {
			this.address = address;
			this.parent = parent;
			this.capabilities = parent.capabilities;
		}

		public static PointerBuffer<? extends VkQueue> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkQueue(mem, parent)); //VkQueue
		}

		public static PointerBuffer<? extends VkQueue> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkQueueWaitIdle.html">vkQueueWaitIdle</a>
		*/
		public void vkQueueWaitIdle() {
			if(capabilities.vkQueueWaitIdle_==null) {
				capabilities.vkQueueWaitIdle_ = capabilities.lookup("vkQueueWaitIdle", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkQueueWaitIdle_.invoke(address());
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkQueueSubmit.html">vkQueueSubmit</a>
		*/
		public void vkQueueSubmit(@Nullable int submitCount, Element<VkSubmitInfo> pSubmits, @Nullable Element<? extends VkFence> fence) {
			if(capabilities.vkQueueSubmit_==null) {
				capabilities.vkQueueSubmit_ = capabilities.lookup("vkQueueSubmit", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkQueueSubmit_.invoke(address(), submitCount, (pSubmits==null?MemorySegment.NULL:pSubmits.address()), (fence==null?MemorySegment.NULL:fence.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

		/**
		@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
		@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
		@throws VK_ERROR_DEVICE_LOST ->{@value VkResult#VK_ERROR_DEVICE_LOST}
		@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
		@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkQueueBindSparse.html">vkQueueBindSparse</a>
		*/
		public void vkQueueBindSparse(@Nullable int bindInfoCount, Element<VkBindSparseInfo> pBindInfo, @Nullable Element<? extends VkFence> fence) {
			if(capabilities.vkQueueBindSparse_==null) {
				capabilities.vkQueueBindSparse_ = capabilities.lookup("vkQueueBindSparse", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
			}
			try {
				final var return_ = (int) capabilities.vkQueueBindSparse_.invoke(address(), bindInfoCount, (pBindInfo==null?MemorySegment.NULL:pBindInfo.address()), (fence==null?MemorySegment.NULL:fence.address()));
				if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDrawIndirectCommand.html">VkDrawIndirectCommand</a>
	*/
	public interface VkDrawIndirectCommand extends io.github.kartoffell.klvulkan.Element<VkDrawIndirectCommand>{
		default VkDrawIndirectCommand vertexCount(int vertexCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.VERTEXCOUNT, vertexCount);
			return this;
		}

		default int vertexCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.VERTEXCOUNT);
		}

		default VkDrawIndirectCommand instanceCount(int instanceCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.INSTANCECOUNT, instanceCount);
			return this;
		}

		default int instanceCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.INSTANCECOUNT);
		}

		default VkDrawIndirectCommand firstVertex(int firstVertex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.FIRSTVERTEX, firstVertex);
			return this;
		}

		default int firstVertex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.FIRSTVERTEX);
		}

		default VkDrawIndirectCommand firstInstance(int firstInstance){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.FIRSTINSTANCE, firstInstance);
			return this;
		}

		default int firstInstance(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDrawIndirectCommand.FIRSTINSTANCE);
		}

		MemorySegment address();

		/**
		Allocates a new VkDrawIndirectCommand from the given Arena.
		*/
		public static VkDrawIndirectCommand allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDrawIndirectCommand.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDrawIndirectCommand from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDrawIndirectCommand> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDrawIndirectCommand.SIZEOF, (mem)->(VkDrawIndirectCommand)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSpecializationMapEntry.html">VkSpecializationMapEntry</a>
	*/
	public interface VkSpecializationMapEntry extends io.github.kartoffell.klvulkan.Element<VkSpecializationMapEntry>{
		/**
		The SpecConstant ID specified in the BIL
		*/
		default VkSpecializationMapEntry constantID(int constantID){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSpecializationMapEntry.CONSTANTID, constantID);
			return this;
		}

		/**
		The SpecConstant ID specified in the BIL
		*/
		default int constantID(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSpecializationMapEntry.CONSTANTID);
		}

		/**
		Offset of the value in the data block
		*/
		default VkSpecializationMapEntry offset(int offset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSpecializationMapEntry.OFFSET, offset);
			return this;
		}

		/**
		Offset of the value in the data block
		*/
		default int offset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSpecializationMapEntry.OFFSET);
		}

		/**
		Size in bytes of the SpecConstant
		*/
		default VkSpecializationMapEntry size(long size){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationMapEntry.SIZE, MemorySegment.ofAddress(size));;
			return this;
		}

		/**
		Size in bytes of the SpecConstant
		*/
		default long size(){
			final var size_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSpecializationMapEntry.SIZE);
			return size_.address();
		}

		MemorySegment address();

		/**
		Allocates a new VkSpecializationMapEntry from the given Arena.
		*/
		public static VkSpecializationMapEntry allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSpecializationMapEntry.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSpecializationMapEntry from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSpecializationMapEntry> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSpecializationMapEntry.SIZEOF, (mem)->(VkSpecializationMapEntry)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPushConstantRange.html">VkPushConstantRange</a>
	*/
	public interface VkPushConstantRange extends io.github.kartoffell.klvulkan.Element<VkPushConstantRange>{
		/**
		Which stages use the range
		*/
		default VkPushConstantRange stageFlags(int stageFlags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantRange.STAGEFLAGS, stageFlags);
			return this;
		}

		/**
		Which stages use the range
		*/
		default int stageFlags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantRange.STAGEFLAGS);
		}

		/**
		Start of the range, in bytes
		*/
		default VkPushConstantRange offset(int offset){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantRange.OFFSET, offset);
			return this;
		}

		/**
		Start of the range, in bytes
		*/
		default int offset(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantRange.OFFSET);
		}

		/**
		Size of the range, in bytes
		*/
		default VkPushConstantRange size(int size){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantRange.SIZE, size);
			return this;
		}

		/**
		Size of the range, in bytes
		*/
		default int size(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPushConstantRange.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkPushConstantRange from the given Arena.
		*/
		public static VkPushConstantRange allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPushConstantRange.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPushConstantRange from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPushConstantRange> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPushConstantRange.SIZEOF, (mem)->(VkPushConstantRange)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDispatchIndirectCommand.html">VkDispatchIndirectCommand</a>
	*/
	public interface VkDispatchIndirectCommand extends io.github.kartoffell.klvulkan.Element<VkDispatchIndirectCommand>{
		default VkDispatchIndirectCommand x(int x){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDispatchIndirectCommand.X, x);
			return this;
		}

		default int x(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDispatchIndirectCommand.X);
		}

		default VkDispatchIndirectCommand y(int y){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDispatchIndirectCommand.Y, y);
			return this;
		}

		default int y(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDispatchIndirectCommand.Y);
		}

		default VkDispatchIndirectCommand z(int z){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDispatchIndirectCommand.Z, z);
			return this;
		}

		default int z(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDispatchIndirectCommand.Z);
		}

		MemorySegment address();

		/**
		Allocates a new VkDispatchIndirectCommand from the given Arena.
		*/
		public static VkDispatchIndirectCommand allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDispatchIndirectCommand.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDispatchIndirectCommand from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDispatchIndirectCommand> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDispatchIndirectCommand.SIZEOF, (mem)->(VkDispatchIndirectCommand)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkFreeFunction.html">PFN_vkFreeFunction</a>
	*/
	public static abstract class PFN_vkFreeFunction implements io.github.kartoffell.klvulkan.Element<PFN_vkFreeFunction>{
		protected final MemorySegment address;

		public final MethodHandle handle_;

		public final FunctionDescriptor descriptor_ = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);

		public MemorySegment address() {
			return address;
		}

		MethodHandle PFN_vkFreeFunction_;
		/**
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkFreeFunction.html">PFN_vkFreeFunction</a>
		*/
		public abstract void PFN_vkFreeFunction(MemorySegment pUserData, MemorySegment pMemory);

		 {
			try {
				handle_ =  MethodHandles.lookup().findVirtual(PFN_vkFreeFunction.class, "PFN_vkFreeFunction_", MethodType.methodType(void.class, MemorySegment.class, MemorySegment.class));
			} catch(Exception e) {throw new IllegalStateException(e);}
		}

		public PFN_vkFreeFunction(Arena arena) {
			this.address = Linker.nativeLinker().upcallStub(handle_, descriptor_, arena);
		}

		protected void PFN_vkFreeFunction_(MemorySegment pUserData, MemorySegment pMemory) {
			PFN_vkFreeFunction(pUserData, pMemory);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceMemoryProperties.html">VkPhysicalDeviceMemoryProperties</a>
	*/
	public interface VkPhysicalDeviceMemoryProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceMemoryProperties>{
		default int memoryTypeCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties.MEMORYTYPECOUNT);
		}

		default Element<VkMemoryType> memoryTypes(){
			final var memoryTypes_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties.MEMORYTYPES, org.lwjgl.vulkan.VkMemoryType.SIZEOF*API_Constants.VK_MAX_MEMORY_TYPES);
			return (memoryTypes_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(memoryTypes_, org.lwjgl.vulkan.VkMemoryType.SIZEOF, (v87674905)->(v87674905.equals(MemorySegment.NULL)?null:(VkMemoryType)()->v87674905)));
		}

		default int memoryHeapCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties.MEMORYHEAPCOUNT);
		}

		default Element<VkMemoryHeap> memoryHeaps(){
			final var memoryHeaps_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties.MEMORYHEAPS, org.lwjgl.vulkan.VkMemoryHeap.SIZEOF*API_Constants.VK_MAX_MEMORY_HEAPS);
			return (memoryHeaps_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(memoryHeaps_, org.lwjgl.vulkan.VkMemoryHeap.SIZEOF, (v966966167)->(v966966167.equals(MemorySegment.NULL)?null:(VkMemoryHeap)()->v966966167)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceMemoryProperties from the given Arena.
		*/
		public static VkPhysicalDeviceMemoryProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceMemoryProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceMemoryProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties.SIZEOF, (mem)->(VkPhysicalDeviceMemoryProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineCache.html">VkPipelineCache</a>
	*/
	public static record VkPipelineCache(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkPipelineCache>{
		public static PointerBuffer<? extends VkPipelineCache> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkPipelineCache(mem, parent)); //VkPipelineCache
		}

		public static PointerBuffer<? extends VkPipelineCache> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkApplicationInfo.html">VkApplicationInfo</a>
	*/
	public interface VkApplicationInfo extends io.github.kartoffell.klvulkan.Element<VkApplicationInfo>{
		default VkApplicationInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.STYPE);
		}

		default VkApplicationInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkApplicationInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkApplicationInfo.PNEXT);
		}

		default VkApplicationInfo pApplicationName(CString pApplicationName){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkApplicationInfo.PAPPLICATIONNAME, pApplicationName==null?MemorySegment.NULL:pApplicationName.address());
			return this;
		}

		@Nullable
		default CString pApplicationName(){
			final var pApplicationName_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkApplicationInfo.PAPPLICATIONNAME);
			return pApplicationName_.equals(MemorySegment.NULL)?null:CString.wrap(pApplicationName_);
		}

		default VkApplicationInfo applicationVersion(int applicationVersion){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.APPLICATIONVERSION, applicationVersion);
			return this;
		}

		default int applicationVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.APPLICATIONVERSION);
		}

		default VkApplicationInfo pEngineName(CString pEngineName){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkApplicationInfo.PENGINENAME, pEngineName==null?MemorySegment.NULL:pEngineName.address());
			return this;
		}

		@Nullable
		default CString pEngineName(){
			final var pEngineName_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkApplicationInfo.PENGINENAME);
			return pEngineName_.equals(MemorySegment.NULL)?null:CString.wrap(pEngineName_);
		}

		default VkApplicationInfo engineVersion(int engineVersion){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.ENGINEVERSION, engineVersion);
			return this;
		}

		default int engineVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.ENGINEVERSION);
		}

		default VkApplicationInfo apiVersion(int apiVersion){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.APIVERSION, apiVersion);
			return this;
		}

		default int apiVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkApplicationInfo.APIVERSION);
		}

		MemorySegment address();

		/**
		Allocates a new VkApplicationInfo from the given Arena.
		*/
		public static VkApplicationInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkApplicationInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkApplicationInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkApplicationInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkApplicationInfo.SIZEOF, (mem)->(VkApplicationInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorPoolCreateFlagBits.html">VkDescriptorPoolCreateFlagBits</a>
	*/
	public interface VkDescriptorPoolCreateFlagBits{
		public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandPoolCreateFlagBits.html">VkCommandPoolCreateFlagBits</a>
	*/
	public interface VkCommandPoolCreateFlagBits{
		public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 2;

		public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkStructureType.html">VkStructureType</a>
	*/
	public interface VkStructureType{
		public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = 19;

		public static final int VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = 7;

		public static final int VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = 6;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = 22;

		public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = 2;

		public static final int VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = 9;

		public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = 42;

		public static final int VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = 3;

		public static final int VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = 14;

		public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = 16;

		public static final int VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = 36;

		public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO = 4;

		public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = 41;

		public static final int VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = 39;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = 23;

		public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = 11;

		public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER = 46;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = 17;

		public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = 44;

		public static final int VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = 10;

		public static final int VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = 12;

		public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = 28;

		public static final int VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = 1;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = 18;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = 25;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = 34;

		public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = 38;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 20;

		public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = 40;

		public static final int VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = 48;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = 21;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = 26;

		public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = 29;

		public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = 5;

		public static final int VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = 47;

		public static final int VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = 13;

		public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = 15;

		public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = 35;

		public static final int VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = 31;

		public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = 45;

		public static final int VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = 8;

		public static final int VK_STRUCTURE_TYPE_APPLICATION_INFO = 0;

		public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = 37;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = 33;

		public static final int VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = 43;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = 30;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = 24;

		public static final int VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = 27;

		public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = 32;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorBufferInfo.html">VkDescriptorBufferInfo</a>
	*/
	public interface VkDescriptorBufferInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorBufferInfo>{
		/**
		Buffer used for this descriptor slot.
		*/
		default VkDescriptorBufferInfo buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorBufferInfo.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		/**
		Buffer used for this descriptor slot.
		*/
		@Nullable
		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorBufferInfo.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		/**
		Base offset from buffer start in bytes to update in the descriptor set.
		*/
		default VkDescriptorBufferInfo offset(long offset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkDescriptorBufferInfo.OFFSET, offset);
			return this;
		}

		/**
		Base offset from buffer start in bytes to update in the descriptor set.
		*/
		default long offset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkDescriptorBufferInfo.OFFSET);
		}

		/**
		Size in bytes of the buffer resource for this descriptor update.
		*/
		default VkDescriptorBufferInfo range(long range){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkDescriptorBufferInfo.RANGE, range);
			return this;
		}

		/**
		Size in bytes of the buffer resource for this descriptor update.
		*/
		default long range(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkDescriptorBufferInfo.RANGE);
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorBufferInfo from the given Arena.
		*/
		public static VkDescriptorBufferInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorBufferInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorBufferInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorBufferInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorBufferInfo.SIZEOF, (mem)->(VkDescriptorBufferInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferMemoryBarrier.html">VkBufferMemoryBarrier</a>
	*/
	public interface VkBufferMemoryBarrier extends io.github.kartoffell.klvulkan.Element<VkBufferMemoryBarrier>{
		default VkBufferMemoryBarrier sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.STYPE);
		}

		default VkBufferMemoryBarrier pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier.PNEXT);
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		default VkBufferMemoryBarrier srcAccessMask(int srcAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.SRCACCESSMASK, srcAccessMask);
			return this;
		}

		/**
		Memory accesses from the source of the dependency to synchronize
		*/
		default int srcAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.SRCACCESSMASK);
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		default VkBufferMemoryBarrier dstAccessMask(int dstAccessMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.DSTACCESSMASK, dstAccessMask);
			return this;
		}

		/**
		Memory accesses from the destination of the dependency to synchronize
		*/
		default int dstAccessMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.DSTACCESSMASK);
		}

		/**
		Queue family to transition ownership from
		*/
		default VkBufferMemoryBarrier srcQueueFamilyIndex(int srcQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.SRCQUEUEFAMILYINDEX, srcQueueFamilyIndex);
			return this;
		}

		/**
		Queue family to transition ownership from
		*/
		default int srcQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.SRCQUEUEFAMILYINDEX);
		}

		/**
		Queue family to transition ownership to
		*/
		default VkBufferMemoryBarrier dstQueueFamilyIndex(int dstQueueFamilyIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.DSTQUEUEFAMILYINDEX, dstQueueFamilyIndex);
			return this;
		}

		/**
		Queue family to transition ownership to
		*/
		default int dstQueueFamilyIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferMemoryBarrier.DSTQUEUEFAMILYINDEX);
		}

		/**
		Buffer to sync
		*/
		default VkBufferMemoryBarrier buffer(Element<? extends VkBuffer> buffer){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier.BUFFER, (buffer==null?MemorySegment.NULL:buffer.address()));
			return this;
		}

		/**
		Buffer to sync
		*/
		default Element<? extends VkBuffer> buffer(){
			final var buffer_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferMemoryBarrier.BUFFER);
			return (buffer_.equals(MemorySegment.NULL)?null:(Element<? extends VkBuffer>)()->buffer_);
		}

		/**
		Offset within the buffer to sync
		*/
		default VkBufferMemoryBarrier offset(long offset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier.OFFSET, offset);
			return this;
		}

		/**
		Offset within the buffer to sync
		*/
		default long offset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier.OFFSET);
		}

		/**
		Amount of bytes to sync
		*/
		default VkBufferMemoryBarrier size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier.SIZE, size);
			return this;
		}

		/**
		Amount of bytes to sync
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferMemoryBarrier.SIZE);
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferMemoryBarrier from the given Arena.
		*/
		public static VkBufferMemoryBarrier allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferMemoryBarrier.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferMemoryBarrier from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferMemoryBarrier> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferMemoryBarrier.SIZEOF, (mem)->(VkBufferMemoryBarrier)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBaseInStructure.html">VkBaseInStructure</a>
	*/
	public interface VkBaseInStructure extends io.github.kartoffell.klvulkan.Element<VkBaseInStructure>{
		default VkBaseInStructure sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBaseInStructure.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBaseInStructure.STYPE);
		}

		default VkBaseInStructure pNext(Element<VkBaseInStructure> pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBaseInStructure.PNEXT, (pNext==null?MemorySegment.NULL:pNext.address()));
			return this;
		}

		@Nullable
		default Element<VkBaseInStructure> pNext(){
			final var pNext_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBaseInStructure.PNEXT);
			return (pNext_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pNext_, org.lwjgl.vulkan.VkBaseInStructure.SIZEOF, (v61681175)->(v61681175.equals(MemorySegment.NULL)?null:(VkBaseInStructure)()->v61681175)));
		}

		MemorySegment address();

		/**
		Allocates a new VkBaseInStructure from the given Arena.
		*/
		public static VkBaseInStructure allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBaseInStructure.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBaseInStructure from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBaseInStructure> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBaseInStructure.SIZEOF, (mem)->(VkBaseInStructure)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseMemoryBind.html">VkSparseMemoryBind</a>
	*/
	public interface VkSparseMemoryBind extends io.github.kartoffell.klvulkan.Element<VkSparseMemoryBind>{
		/**
		Specified in bytes
		*/
		default VkSparseMemoryBind resourceOffset(long resourceOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseMemoryBind.RESOURCEOFFSET, resourceOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long resourceOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseMemoryBind.RESOURCEOFFSET);
		}

		/**
		Specified in bytes
		*/
		default VkSparseMemoryBind size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseMemoryBind.SIZE, size);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseMemoryBind.SIZE);
		}

		default VkSparseMemoryBind memory(Element<? extends VkDeviceMemory> memory){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseMemoryBind.MEMORY, (memory==null?MemorySegment.NULL:memory.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkDeviceMemory> memory(){
			final var memory_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseMemoryBind.MEMORY);
			return (memory_.equals(MemorySegment.NULL)?null:(Element<? extends VkDeviceMemory>)()->memory_);
		}

		/**
		Specified in bytes
		*/
		default VkSparseMemoryBind memoryOffset(long memoryOffset){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseMemoryBind.MEMORYOFFSET, memoryOffset);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long memoryOffset(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkSparseMemoryBind.MEMORYOFFSET);
		}

		default VkSparseMemoryBind flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseMemoryBind.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseMemoryBind.FLAGS);
		}

		MemorySegment address();

		/**
		Allocates a new VkSparseMemoryBind from the given Arena.
		*/
		public static VkSparseMemoryBind allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseMemoryBind.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSparseMemoryBind from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSparseMemoryBind> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseMemoryBind.SIZEOF, (mem)->(VkSparseMemoryBind)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageOpaqueMemoryBindInfo.html">VkSparseImageOpaqueMemoryBindInfo</a>
	*/
	public interface VkSparseImageOpaqueMemoryBindInfo extends io.github.kartoffell.klvulkan.Element<VkSparseImageOpaqueMemoryBindInfo>{
		default VkSparseImageOpaqueMemoryBindInfo image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		default VkSparseImageOpaqueMemoryBindInfo bindCount(int bindCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT, bindCount);
			return this;
		}

		default int bindCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT);
		}

		default VkSparseImageOpaqueMemoryBindInfo pBinds(Element<VkSparseMemoryBind> pBinds){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.PBINDS, (pBinds==null?MemorySegment.NULL:pBinds.address()));
			return this;
		}

		default Element<VkSparseMemoryBind> pBinds(){
			final var pBinds_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.PBINDS);
			return (pBinds_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pBinds_, org.lwjgl.vulkan.VkSparseMemoryBind.SIZEOF, (v147022238)->(v147022238.equals(MemorySegment.NULL)?null:(VkSparseMemoryBind)()->v147022238)));
		}

		MemorySegment address();

		/**
		Allocates a new VkSparseImageOpaqueMemoryBindInfo from the given Arena.
		*/
		public static VkSparseImageOpaqueMemoryBindInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSparseImageOpaqueMemoryBindInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSparseImageOpaqueMemoryBindInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.SIZEOF, (mem)->(VkSparseImageOpaqueMemoryBindInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkStencilOpState.html">VkStencilOpState</a>
	*/
	public interface VkStencilOpState extends io.github.kartoffell.klvulkan.Element<VkStencilOpState>{
		default VkStencilOpState failOp(int failOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.FAILOP, failOp);
			return this;
		}

		default int failOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.FAILOP);
		}

		default VkStencilOpState passOp(int passOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.PASSOP, passOp);
			return this;
		}

		default int passOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.PASSOP);
		}

		default VkStencilOpState depthFailOp(int depthFailOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.DEPTHFAILOP, depthFailOp);
			return this;
		}

		default int depthFailOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.DEPTHFAILOP);
		}

		default VkStencilOpState compareOp(int compareOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.COMPAREOP, compareOp);
			return this;
		}

		default int compareOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.COMPAREOP);
		}

		default VkStencilOpState compareMask(int compareMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.COMPAREMASK, compareMask);
			return this;
		}

		default int compareMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.COMPAREMASK);
		}

		default VkStencilOpState writeMask(int writeMask){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.WRITEMASK, writeMask);
			return this;
		}

		default int writeMask(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.WRITEMASK);
		}

		default VkStencilOpState reference(int reference){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.REFERENCE, reference);
			return this;
		}

		default int reference(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkStencilOpState.REFERENCE);
		}

		MemorySegment address();

		/**
		Allocates a new VkStencilOpState from the given Arena.
		*/
		public static VkStencilOpState allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkStencilOpState.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkStencilOpState from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkStencilOpState> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkStencilOpState.SIZEOF, (mem)->(VkStencilOpState)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferUsageFlagBits.html">VkCommandBufferUsageFlagBits</a>
	*/
	public interface VkCommandBufferUsageFlagBits{
		public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 1;

		public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 4;

		public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineTessellationStateCreateInfo.html">VkPipelineTessellationStateCreateInfo</a>
	*/
	public interface VkPipelineTessellationStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineTessellationStateCreateInfo>{
		default VkPipelineTessellationStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.STYPE);
		}

		default VkPipelineTessellationStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.PNEXT);
		}

		default VkPipelineTessellationStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.FLAGS);
		}

		default VkPipelineTessellationStateCreateInfo patchControlPoints(int patchControlPoints){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.PATCHCONTROLPOINTS, patchControlPoints);
			return this;
		}

		default int patchControlPoints(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.PATCHCONTROLPOINTS);
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineTessellationStateCreateInfo from the given Arena.
		*/
		public static VkPipelineTessellationStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineTessellationStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineTessellationStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.SIZEOF, (mem)->(VkPipelineTessellationStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkShaderStageFlagBits.html">VkShaderStageFlagBits</a>
	*/
	public interface VkShaderStageFlagBits{
		public static final int VK_SHADER_STAGE_COMPUTE_BIT = 32;

		public static final int VK_SHADER_STAGE_ALL_GRAPHICS = -2147483648;

		public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 16;

		public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 8;

		public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 4;

		public static final int VK_SHADER_STAGE_VERTEX_BIT = 1;

		public static final int VK_SHADER_STAGE_ALL = -2147483648;

		public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 2;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBufferCreateInfo.html">VkBufferCreateInfo</a>
	*/
	public interface VkBufferCreateInfo extends io.github.kartoffell.klvulkan.Element<VkBufferCreateInfo>{
		default VkBufferCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.STYPE);
		}

		default VkBufferCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferCreateInfo.PNEXT);
		}

		/**
		Buffer creation flags
		*/
		default VkBufferCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Buffer creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.FLAGS);
		}

		/**
		Specified in bytes
		*/
		default VkBufferCreateInfo size(long size){
			address().set(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCreateInfo.SIZE, size);
			return this;
		}

		/**
		Specified in bytes
		*/
		default long size(){
			return address().get(ValueLayout.JAVA_LONG, org.lwjgl.vulkan.VkBufferCreateInfo.SIZE);
		}

		/**
		Buffer usage flags
		*/
		default VkBufferCreateInfo usage(int usage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.USAGE, usage);
			return this;
		}

		/**
		Buffer usage flags
		*/
		default int usage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.USAGE);
		}

		default VkBufferCreateInfo sharingMode(int sharingMode){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.SHARINGMODE, sharingMode);
			return this;
		}

		default int sharingMode(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.SHARINGMODE);
		}

		default VkBufferCreateInfo queueFamilyIndexCount(int queueFamilyIndexCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT, queueFamilyIndexCount);
			return this;
		}

		@Nullable
		default int queueFamilyIndexCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT);
		}

		default VkBufferCreateInfo pQueueFamilyIndices(IntBuffer pQueueFamilyIndices){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferCreateInfo.PQUEUEFAMILYINDICES, (pQueueFamilyIndices==null?MemorySegment.NULL:MemorySegment.ofBuffer(pQueueFamilyIndices)));
			return this;
		}

		default IntBuffer pQueueFamilyIndices(){
			final var pQueueFamilyIndices_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBufferCreateInfo.PQUEUEFAMILYINDICES);
			return (pQueueFamilyIndices_.equals(MemorySegment.NULL)?null:pQueueFamilyIndices_.asByteBuffer().asIntBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkBufferCreateInfo from the given Arena.
		*/
		public static VkBufferCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBufferCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBufferCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF, (mem)->(VkBufferCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFramebuffer.html">VkFramebuffer</a>
	*/
	public static record VkFramebuffer(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkFramebuffer>{
		public static PointerBuffer<? extends VkFramebuffer> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkFramebuffer(mem, parent)); //VkFramebuffer
		}

		public static PointerBuffer<? extends VkFramebuffer> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkCommandBufferResetFlagBits.html">VkCommandBufferResetFlagBits</a>
	*/
	public interface VkCommandBufferResetFlagBits{
		public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSubmitInfo.html">VkSubmitInfo</a>
	*/
	public interface VkSubmitInfo extends io.github.kartoffell.klvulkan.Element<VkSubmitInfo>{
		default VkSubmitInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.STYPE);
		}

		default VkSubmitInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PNEXT);
		}

		default VkSubmitInfo waitSemaphoreCount(int waitSemaphoreCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.WAITSEMAPHORECOUNT, waitSemaphoreCount);
			return this;
		}

		@Nullable
		default int waitSemaphoreCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.WAITSEMAPHORECOUNT);
		}

		default VkSubmitInfo pWaitSemaphores(PointerBuffer<? extends Element<? extends VkSemaphore>> pWaitSemaphores){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PWAITSEMAPHORES, (pWaitSemaphores==null?MemorySegment.NULL:pWaitSemaphores.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkSemaphore>> pWaitSemaphores(){
			final var pWaitSemaphores_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PWAITSEMAPHORES);
			return (pWaitSemaphores_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pWaitSemaphores_, (v1127338375)->(v1127338375.equals(MemorySegment.NULL)?null:(Element<? extends VkSemaphore>)()->v1127338375)));
		}

		default VkSubmitInfo pWaitDstStageMask(IntBuffer pWaitDstStageMask){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PWAITDSTSTAGEMASK, (pWaitDstStageMask==null?MemorySegment.NULL:MemorySegment.ofBuffer(pWaitDstStageMask)));
			return this;
		}

		default IntBuffer pWaitDstStageMask(){
			final var pWaitDstStageMask_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PWAITDSTSTAGEMASK);
			return (pWaitDstStageMask_.equals(MemorySegment.NULL)?null:pWaitDstStageMask_.asByteBuffer().asIntBuffer());
		}

		default VkSubmitInfo commandBufferCount(int commandBufferCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.COMMANDBUFFERCOUNT, commandBufferCount);
			return this;
		}

		@Nullable
		default int commandBufferCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.COMMANDBUFFERCOUNT);
		}

		default VkSubmitInfo pCommandBuffers(PointerBuffer<? extends Element<? extends VkCommandBuffer>> pCommandBuffers){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PCOMMANDBUFFERS, (pCommandBuffers==null?MemorySegment.NULL:pCommandBuffers.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkCommandBuffer>> pCommandBuffers(){
			final var pCommandBuffers_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PCOMMANDBUFFERS);
			return (pCommandBuffers_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pCommandBuffers_, (v1868805237)->(v1868805237.equals(MemorySegment.NULL)?null:(Element<? extends VkCommandBuffer>)()->v1868805237)));
		}

		default VkSubmitInfo signalSemaphoreCount(int signalSemaphoreCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.SIGNALSEMAPHORECOUNT, signalSemaphoreCount);
			return this;
		}

		@Nullable
		default int signalSemaphoreCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSubmitInfo.SIGNALSEMAPHORECOUNT);
		}

		default VkSubmitInfo pSignalSemaphores(PointerBuffer<? extends Element<? extends VkSemaphore>> pSignalSemaphores){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PSIGNALSEMAPHORES, (pSignalSemaphores==null?MemorySegment.NULL:pSignalSemaphores.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkSemaphore>> pSignalSemaphores(){
			final var pSignalSemaphores_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSubmitInfo.PSIGNALSEMAPHORES);
			return (pSignalSemaphores_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pSignalSemaphores_, (v89448984)->(v89448984.equals(MemorySegment.NULL)?null:(Element<? extends VkSemaphore>)()->v89448984)));
		}

		MemorySegment address();

		/**
		Allocates a new VkSubmitInfo from the given Arena.
		*/
		public static VkSubmitInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSubmitInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSubmitInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSubmitInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSubmitInfo.SIZEOF, (mem)->(VkSubmitInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPhysicalDeviceProperties.html">VkPhysicalDeviceProperties</a>
	*/
	public interface VkPhysicalDeviceProperties extends io.github.kartoffell.klvulkan.Element<VkPhysicalDeviceProperties>{
		default int apiVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProperties.APIVERSION);
		}

		default int driverVersion(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProperties.DRIVERVERSION);
		}

		default int vendorID(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProperties.VENDORID);
		}

		default int deviceID(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICEID);
		}

		default int deviceType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICETYPE);
		}

		default CString deviceName(){
			final var deviceName_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICENAME, API_Constants.VK_MAX_PHYSICAL_DEVICE_NAME_SIZE);
			return deviceName_.equals(MemorySegment.NULL)?null:CString.wrap(deviceName_);
		}

		default ByteBuffer pipelineCacheUUID(){
			final var pipelineCacheUUID_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceProperties.PIPELINECACHEUUID, 1*API_Constants.VK_UUID_SIZE);
			return (pipelineCacheUUID_.equals(MemorySegment.NULL)?null:pipelineCacheUUID_.asByteBuffer());
		}

		default VkPhysicalDeviceLimits limits(){
			final var limits_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceProperties.LIMITS, org.lwjgl.vulkan.VkPhysicalDeviceLimits.SIZEOF);
			return (limits_.equals(MemorySegment.NULL)?null:(VkPhysicalDeviceLimits)()->limits_);
		}

		default VkPhysicalDeviceSparseProperties sparseProperties(){
			final var sparseProperties_ = address().asSlice(org.lwjgl.vulkan.VkPhysicalDeviceProperties.SPARSEPROPERTIES, org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.SIZEOF);
			return (sparseProperties_.equals(MemorySegment.NULL)?null:(VkPhysicalDeviceSparseProperties)()->sparseProperties_);
		}

		MemorySegment address();

		/**
		Allocates a new VkPhysicalDeviceProperties from the given Arena.
		*/
		public static VkPhysicalDeviceProperties allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPhysicalDeviceProperties from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPhysicalDeviceProperties> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF, (mem)->(VkPhysicalDeviceProperties)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkRect2D.html">VkRect2D</a>
	*/
	public interface VkRect2D extends io.github.kartoffell.klvulkan.Element<VkRect2D>{
		default VkOffset2D offset(){
			final var offset_ = address().asSlice(org.lwjgl.vulkan.VkRect2D.OFFSET, org.lwjgl.vulkan.VkOffset2D.SIZEOF);
			return (offset_.equals(MemorySegment.NULL)?null:(VkOffset2D)()->offset_);
		}

		default VkExtent2D extent(){
			final var extent_ = address().asSlice(org.lwjgl.vulkan.VkRect2D.EXTENT, org.lwjgl.vulkan.VkExtent2D.SIZEOF);
			return (extent_.equals(MemorySegment.NULL)?null:(VkExtent2D)()->extent_);
		}

		MemorySegment address();

		/**
		Allocates a new VkRect2D from the given Arena.
		*/
		public static VkRect2D allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkRect2D.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkRect2D from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkRect2D> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkRect2D.SIZEOF, (mem)->(VkRect2D)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFilter.html">VkFilter</a>
	*/
	public interface VkFilter{
		public static final int VK_FILTER_NEAREST = 0;

		public static final int VK_FILTER_LINEAR = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkGraphicsPipelineCreateInfo.html">VkGraphicsPipelineCreateInfo</a>
	*/
	public interface VkGraphicsPipelineCreateInfo extends io.github.kartoffell.klvulkan.Element<VkGraphicsPipelineCreateInfo>{
		default VkGraphicsPipelineCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STYPE);
		}

		default VkGraphicsPipelineCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PNEXT);
		}

		/**
		Pipeline creation flags
		*/
		default VkGraphicsPipelineCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.FLAGS, flags);
			return this;
		}

		/**
		Pipeline creation flags
		*/
		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.FLAGS);
		}

		default VkGraphicsPipelineCreateInfo stageCount(int stageCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STAGECOUNT, stageCount);
			return this;
		}

		@Nullable
		default int stageCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STAGECOUNT);
		}

		/**
		One entry for each active shader stage
		*/
		default VkGraphicsPipelineCreateInfo pStages(Element<VkPipelineShaderStageCreateInfo> pStages){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PSTAGES, (pStages==null?MemorySegment.NULL:pStages.address()));
			return this;
		}

		/**
		One entry for each active shader stage
		*/
		@Nullable
		default Element<VkPipelineShaderStageCreateInfo> pStages(){
			final var pStages_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PSTAGES);
			return (pStages_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pStages_, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.SIZEOF, (v369671357)->(v369671357.equals(MemorySegment.NULL)?null:(VkPipelineShaderStageCreateInfo)()->v369671357)));
		}

		default VkGraphicsPipelineCreateInfo pVertexInputState(Element<VkPipelineVertexInputStateCreateInfo> pVertexInputState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE, (pVertexInputState==null?MemorySegment.NULL:pVertexInputState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineVertexInputStateCreateInfo> pVertexInputState(){
			final var pVertexInputState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE);
			return (pVertexInputState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pVertexInputState_, org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.SIZEOF, (v1543043602)->(v1543043602.equals(MemorySegment.NULL)?null:(VkPipelineVertexInputStateCreateInfo)()->v1543043602)));
		}

		default VkGraphicsPipelineCreateInfo pInputAssemblyState(Element<VkPipelineInputAssemblyStateCreateInfo> pInputAssemblyState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE, (pInputAssemblyState==null?MemorySegment.NULL:pInputAssemblyState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineInputAssemblyStateCreateInfo> pInputAssemblyState(){
			final var pInputAssemblyState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE);
			return (pInputAssemblyState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pInputAssemblyState_, org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.SIZEOF, (v701119748)->(v701119748.equals(MemorySegment.NULL)?null:(VkPipelineInputAssemblyStateCreateInfo)()->v701119748)));
		}

		default VkGraphicsPipelineCreateInfo pTessellationState(Element<VkPipelineTessellationStateCreateInfo> pTessellationState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE, (pTessellationState==null?MemorySegment.NULL:pTessellationState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineTessellationStateCreateInfo> pTessellationState(){
			final var pTessellationState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE);
			return (pTessellationState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pTessellationState_, org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.SIZEOF, (v187457031)->(v187457031.equals(MemorySegment.NULL)?null:(VkPipelineTessellationStateCreateInfo)()->v187457031)));
		}

		default VkGraphicsPipelineCreateInfo pViewportState(Element<VkPipelineViewportStateCreateInfo> pViewportState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE, (pViewportState==null?MemorySegment.NULL:pViewportState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineViewportStateCreateInfo> pViewportState(){
			final var pViewportState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE);
			return (pViewportState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pViewportState_, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF, (v1477637771)->(v1477637771.equals(MemorySegment.NULL)?null:(VkPipelineViewportStateCreateInfo)()->v1477637771)));
		}

		default VkGraphicsPipelineCreateInfo pRasterizationState(Element<VkPipelineRasterizationStateCreateInfo> pRasterizationState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE, (pRasterizationState==null?MemorySegment.NULL:pRasterizationState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineRasterizationStateCreateInfo> pRasterizationState(){
			final var pRasterizationState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE);
			return (pRasterizationState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pRasterizationState_, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF, (v1143390193)->(v1143390193.equals(MemorySegment.NULL)?null:(VkPipelineRasterizationStateCreateInfo)()->v1143390193)));
		}

		default VkGraphicsPipelineCreateInfo pMultisampleState(Element<VkPipelineMultisampleStateCreateInfo> pMultisampleState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE, (pMultisampleState==null?MemorySegment.NULL:pMultisampleState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineMultisampleStateCreateInfo> pMultisampleState(){
			final var pMultisampleState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE);
			return (pMultisampleState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pMultisampleState_, org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.SIZEOF, (v1014794348)->(v1014794348.equals(MemorySegment.NULL)?null:(VkPipelineMultisampleStateCreateInfo)()->v1014794348)));
		}

		default VkGraphicsPipelineCreateInfo pDepthStencilState(Element<VkPipelineDepthStencilStateCreateInfo> pDepthStencilState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE, (pDepthStencilState==null?MemorySegment.NULL:pDepthStencilState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineDepthStencilStateCreateInfo> pDepthStencilState(){
			final var pDepthStencilState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE);
			return (pDepthStencilState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDepthStencilState_, org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.SIZEOF, (v1430861186)->(v1430861186.equals(MemorySegment.NULL)?null:(VkPipelineDepthStencilStateCreateInfo)()->v1430861186)));
		}

		default VkGraphicsPipelineCreateInfo pColorBlendState(Element<VkPipelineColorBlendStateCreateInfo> pColorBlendState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE, (pColorBlendState==null?MemorySegment.NULL:pColorBlendState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineColorBlendStateCreateInfo> pColorBlendState(){
			final var pColorBlendState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE);
			return (pColorBlendState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pColorBlendState_, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF, (v438314766)->(v438314766.equals(MemorySegment.NULL)?null:(VkPipelineColorBlendStateCreateInfo)()->v438314766)));
		}

		default VkGraphicsPipelineCreateInfo pDynamicState(Element<VkPipelineDynamicStateCreateInfo> pDynamicState){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDYNAMICSTATE, (pDynamicState==null?MemorySegment.NULL:pDynamicState.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineDynamicStateCreateInfo> pDynamicState(){
			final var pDynamicState_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDYNAMICSTATE);
			return (pDynamicState_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pDynamicState_, org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.SIZEOF, (v1804126860)->(v1804126860.equals(MemorySegment.NULL)?null:(VkPipelineDynamicStateCreateInfo)()->v1804126860)));
		}

		/**
		Interface layout of the pipeline
		*/
		default VkGraphicsPipelineCreateInfo layout(Element<? extends VkPipelineLayout> layout){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.LAYOUT, (layout==null?MemorySegment.NULL:layout.address()));
			return this;
		}

		/**
		Interface layout of the pipeline
		*/
		@Nullable
		default Element<? extends VkPipelineLayout> layout(){
			final var layout_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.LAYOUT);
			return (layout_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipelineLayout>)()->layout_);
		}

		default VkGraphicsPipelineCreateInfo renderPass(Element<? extends VkRenderPass> renderPass){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.RENDERPASS, (renderPass==null?MemorySegment.NULL:renderPass.address()));
			return this;
		}

		@Nullable
		default Element<? extends VkRenderPass> renderPass(){
			final var renderPass_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.RENDERPASS);
			return (renderPass_.equals(MemorySegment.NULL)?null:(Element<? extends VkRenderPass>)()->renderPass_);
		}

		default VkGraphicsPipelineCreateInfo subpass(int subpass){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SUBPASS, subpass);
			return this;
		}

		default int subpass(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SUBPASS);
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is nonzero, it specifies the handle of the base pipeline this is a derivative of
		*/
		default VkGraphicsPipelineCreateInfo basePipelineHandle(Element<? extends VkPipeline> basePipelineHandle){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE, (basePipelineHandle==null?MemorySegment.NULL:basePipelineHandle.address()));
			return this;
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is nonzero, it specifies the handle of the base pipeline this is a derivative of
		*/
		@Nullable
		default Element<? extends VkPipeline> basePipelineHandle(){
			final var basePipelineHandle_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE);
			return (basePipelineHandle_.equals(MemorySegment.NULL)?null:(Element<? extends VkPipeline>)()->basePipelineHandle_);
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is not -1, it specifies an index into pCreateInfos of the base pipeline this is a derivative of
		*/
		default VkGraphicsPipelineCreateInfo basePipelineIndex(int basePipelineIndex){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX, basePipelineIndex);
			return this;
		}

		/**
		If VK_PIPELINE_CREATE_DERIVATIVE_BIT is set and this value is not -1, it specifies an index into pCreateInfos of the base pipeline this is a derivative of
		*/
		default int basePipelineIndex(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX);
		}

		MemorySegment address();

		/**
		Allocates a new VkGraphicsPipelineCreateInfo from the given Arena.
		*/
		public static VkGraphicsPipelineCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkGraphicsPipelineCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkGraphicsPipelineCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF, (mem)->(VkGraphicsPipelineCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorImageInfo.html">VkDescriptorImageInfo</a>
	*/
	public interface VkDescriptorImageInfo extends io.github.kartoffell.klvulkan.Element<VkDescriptorImageInfo>{
		/**
		Sampler to write to the descriptor in case it is a SAMPLER or COMBINED_IMAGE_SAMPLER descriptor. Ignored otherwise.
		*/
		default VkDescriptorImageInfo sampler(Element<? extends VkSampler> sampler){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorImageInfo.SAMPLER, (sampler==null?MemorySegment.NULL:sampler.address()));
			return this;
		}

		/**
		Sampler to write to the descriptor in case it is a SAMPLER or COMBINED_IMAGE_SAMPLER descriptor. Ignored otherwise.
		*/
		default Element<? extends VkSampler> sampler(){
			final var sampler_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorImageInfo.SAMPLER);
			return (sampler_.equals(MemorySegment.NULL)?null:(Element<? extends VkSampler>)()->sampler_);
		}

		/**
		Image view to write to the descriptor in case it is a SAMPLED_IMAGE, STORAGE_IMAGE, COMBINED_IMAGE_SAMPLER, or INPUT_ATTACHMENT descriptor. Ignored otherwise.
		*/
		default VkDescriptorImageInfo imageView(Element<? extends VkImageView> imageView){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorImageInfo.IMAGEVIEW, (imageView==null?MemorySegment.NULL:imageView.address()));
			return this;
		}

		/**
		Image view to write to the descriptor in case it is a SAMPLED_IMAGE, STORAGE_IMAGE, COMBINED_IMAGE_SAMPLER, or INPUT_ATTACHMENT descriptor. Ignored otherwise.
		*/
		default Element<? extends VkImageView> imageView(){
			final var imageView_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkDescriptorImageInfo.IMAGEVIEW);
			return (imageView_.equals(MemorySegment.NULL)?null:(Element<? extends VkImageView>)()->imageView_);
		}

		/**
		Layout the image is expected to be in when accessed using this descriptor (only used if imageView is not VK_NULL_HANDLE).
		*/
		default VkDescriptorImageInfo imageLayout(int imageLayout){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorImageInfo.IMAGELAYOUT, imageLayout);
			return this;
		}

		/**
		Layout the image is expected to be in when accessed using this descriptor (only used if imageView is not VK_NULL_HANDLE).
		*/
		default int imageLayout(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkDescriptorImageInfo.IMAGELAYOUT);
		}

		MemorySegment address();

		/**
		Allocates a new VkDescriptorImageInfo from the given Arena.
		*/
		public static VkDescriptorImageInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkDescriptorImageInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkDescriptorImageInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkDescriptorImageInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkDescriptorImageInfo.SIZEOF, (mem)->(VkDescriptorImageInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkImageView.html">VkImageView</a>
	*/
	public static record VkImageView(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkImageView>{
		public static PointerBuffer<? extends VkImageView> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkImageView(mem, parent)); //VkImageView
		}

		public static PointerBuffer<? extends VkImageView> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkBaseOutStructure.html">VkBaseOutStructure</a>
	*/
	public interface VkBaseOutStructure extends io.github.kartoffell.klvulkan.Element<VkBaseOutStructure>{
		default VkBaseOutStructure sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBaseOutStructure.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkBaseOutStructure.STYPE);
		}

		default VkBaseOutStructure pNext(Element<VkBaseOutStructure> pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBaseOutStructure.PNEXT, (pNext==null?MemorySegment.NULL:pNext.address()));
			return this;
		}

		@Nullable
		default Element<VkBaseOutStructure> pNext(){
			final var pNext_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkBaseOutStructure.PNEXT);
			return (pNext_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pNext_, org.lwjgl.vulkan.VkBaseOutStructure.SIZEOF, (v862916729)->(v862916729.equals(MemorySegment.NULL)?null:(VkBaseOutStructure)()->v862916729)));
		}

		MemorySegment address();

		/**
		Allocates a new VkBaseOutStructure from the given Arena.
		*/
		public static VkBaseOutStructure allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkBaseOutStructure.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkBaseOutStructure from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkBaseOutStructure> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkBaseOutStructure.SIZEOF, (mem)->(VkBaseOutStructure)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSparseImageMemoryBindInfo.html">VkSparseImageMemoryBindInfo</a>
	*/
	public interface VkSparseImageMemoryBindInfo extends io.github.kartoffell.klvulkan.Element<VkSparseImageMemoryBindInfo>{
		default VkSparseImageMemoryBindInfo image(Element<? extends VkImage> image){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.IMAGE, (image==null?MemorySegment.NULL:image.address()));
			return this;
		}

		default Element<? extends VkImage> image(){
			final var image_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.IMAGE);
			return (image_.equals(MemorySegment.NULL)?null:(Element<? extends VkImage>)()->image_);
		}

		default VkSparseImageMemoryBindInfo bindCount(int bindCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.BINDCOUNT, bindCount);
			return this;
		}

		default int bindCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.BINDCOUNT);
		}

		default VkSparseImageMemoryBindInfo pBinds(Element<VkSparseImageMemoryBind> pBinds){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.PBINDS, (pBinds==null?MemorySegment.NULL:pBinds.address()));
			return this;
		}

		default Element<VkSparseImageMemoryBind> pBinds(){
			final var pBinds_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.PBINDS);
			return (pBinds_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pBinds_, org.lwjgl.vulkan.VkSparseImageMemoryBind.SIZEOF, (v790021811)->(v790021811.equals(MemorySegment.NULL)?null:(VkSparseImageMemoryBind)()->v790021811)));
		}

		MemorySegment address();

		/**
		Allocates a new VkSparseImageMemoryBindInfo from the given Arena.
		*/
		public static VkSparseImageMemoryBindInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkSparseImageMemoryBindInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkSparseImageMemoryBindInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.SIZEOF, (mem)->(VkSparseImageMemoryBindInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkMemoryPropertyFlagBits.html">VkMemoryPropertyFlagBits</a>
	*/
	public interface VkMemoryPropertyFlagBits{
		public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 4;

		public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 1;

		public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 2;

		public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 8;

		public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 16;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkAllocationFunction.html">PFN_vkAllocationFunction</a>
	*/
	public static abstract class PFN_vkAllocationFunction implements io.github.kartoffell.klvulkan.Element<PFN_vkAllocationFunction>{
		protected final MemorySegment address;

		public final MethodHandle handle_;

		public final FunctionDescriptor descriptor_ = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);

		public MemorySegment address() {
			return address;
		}

		MethodHandle PFN_vkAllocationFunction_;
		/**
		@return (*(void))
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkAllocationFunction.html">PFN_vkAllocationFunction</a>
		*/
		public abstract MemorySegment PFN_vkAllocationFunction(MemorySegment pUserData, long size, long alignment, int allocationScope);

		 {
			try {
				handle_ =  MethodHandles.lookup().findVirtual(PFN_vkAllocationFunction.class, "PFN_vkAllocationFunction_", MethodType.methodType(MemorySegment.class, MemorySegment.class, MemorySegment.class, MemorySegment.class, int.class));
			} catch(Exception e) {throw new IllegalStateException(e);}
		}

		public PFN_vkAllocationFunction(Arena arena) {
			this.address = Linker.nativeLinker().upcallStub(handle_, descriptor_, arena);
		}

		protected MemorySegment PFN_vkAllocationFunction_(MemorySegment pUserData, MemorySegment size, MemorySegment alignment, int allocationScope) {
			return PFN_vkAllocationFunction(pUserData, size.address(), alignment.address(), allocationScope);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkComponentMapping.html">VkComponentMapping</a>
	*/
	public interface VkComponentMapping extends io.github.kartoffell.klvulkan.Element<VkComponentMapping>{
		default VkComponentMapping r(int r){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.R, r);
			return this;
		}

		default int r(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.R);
		}

		default VkComponentMapping g(int g){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.G, g);
			return this;
		}

		default int g(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.G);
		}

		default VkComponentMapping b(int b){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.B, b);
			return this;
		}

		default int b(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.B);
		}

		default VkComponentMapping a(int a){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.A, a);
			return this;
		}

		default int a(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkComponentMapping.A);
		}

		MemorySegment address();

		/**
		Allocates a new VkComponentMapping from the given Arena.
		*/
		public static VkComponentMapping allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkComponentMapping.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkComponentMapping from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkComponentMapping> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkComponentMapping.SIZEOF, (mem)->(VkComponentMapping)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkDescriptorSetLayout.html">VkDescriptorSetLayout</a>
	*/
	public static record VkDescriptorSetLayout(MemorySegment address, VkDevice parent) implements io.github.kartoffell.klvulkan.Element<VkDescriptorSetLayout>{
		public static PointerBuffer<? extends VkDescriptorSetLayout> pointer(Arena arena, int count, VkDevice parent) {
			return PointerBuffer.allocateDirect(arena, count, (mem) -> ((VkDevice)parent).VkDescriptorSetLayout(mem, parent)); //VkDescriptorSetLayout
		}

		public static PointerBuffer<? extends VkDescriptorSetLayout> pointer(Arena arena, VkDevice parent) {
			return pointer(arena, 1, parent);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkSharingMode.html">VkSharingMode</a>
	*/
	public interface VkSharingMode{
		public static final int VK_SHARING_MODE_EXCLUSIVE = 0;

		public static final int VK_SHARING_MODE_CONCURRENT = 1;

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkFramebufferCreateInfo.html">VkFramebufferCreateInfo</a>
	*/
	public interface VkFramebufferCreateInfo extends io.github.kartoffell.klvulkan.Element<VkFramebufferCreateInfo>{
		default VkFramebufferCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.STYPE);
		}

		default VkFramebufferCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferCreateInfo.PNEXT);
		}

		default VkFramebufferCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.FLAGS);
		}

		default VkFramebufferCreateInfo renderPass(Element<? extends VkRenderPass> renderPass){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferCreateInfo.RENDERPASS, (renderPass==null?MemorySegment.NULL:renderPass.address()));
			return this;
		}

		default Element<? extends VkRenderPass> renderPass(){
			final var renderPass_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferCreateInfo.RENDERPASS);
			return (renderPass_.equals(MemorySegment.NULL)?null:(Element<? extends VkRenderPass>)()->renderPass_);
		}

		default VkFramebufferCreateInfo attachmentCount(int attachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.ATTACHMENTCOUNT, attachmentCount);
			return this;
		}

		@Nullable
		default int attachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.ATTACHMENTCOUNT);
		}

		default VkFramebufferCreateInfo pAttachments(PointerBuffer<? extends Element<? extends VkImageView>> pAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferCreateInfo.PATTACHMENTS, (pAttachments==null?MemorySegment.NULL:pAttachments.address()));
			return this;
		}

		default PointerBuffer<? extends Element<? extends VkImageView>> pAttachments(){
			final var pAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkFramebufferCreateInfo.PATTACHMENTS);
			return (pAttachments_.equals(MemorySegment.NULL)?null:PointerBuffer.wrap(pAttachments_, (v873827336)->(v873827336.equals(MemorySegment.NULL)?null:(Element<? extends VkImageView>)()->v873827336)));
		}

		default VkFramebufferCreateInfo width(int width){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.WIDTH, width);
			return this;
		}

		default int width(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.WIDTH);
		}

		default VkFramebufferCreateInfo height(int height){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.HEIGHT, height);
			return this;
		}

		default int height(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.HEIGHT);
		}

		default VkFramebufferCreateInfo layers(int layers){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.LAYERS, layers);
			return this;
		}

		default int layers(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkFramebufferCreateInfo.LAYERS);
		}

		MemorySegment address();

		/**
		Allocates a new VkFramebufferCreateInfo from the given Arena.
		*/
		public static VkFramebufferCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkFramebufferCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkFramebufferCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkFramebufferCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkFramebufferCreateInfo.SIZEOF, (mem)->(VkFramebufferCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineShaderStageCreateInfo.html">VkPipelineShaderStageCreateInfo</a>
	*/
	public interface VkPipelineShaderStageCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineShaderStageCreateInfo>{
		default VkPipelineShaderStageCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.STYPE);
		}

		default VkPipelineShaderStageCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.PNEXT);
		}

		default VkPipelineShaderStageCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.FLAGS);
		}

		/**
		Shader stage
		*/
		default VkPipelineShaderStageCreateInfo stage(int stage){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.STAGE, stage);
			return this;
		}

		/**
		Shader stage
		*/
		default int stage(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.STAGE);
		}

		/**
		Module containing entry point
		*/
		default VkPipelineShaderStageCreateInfo module(Element<? extends VkShaderModule> module){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.MODULE, (module==null?MemorySegment.NULL:module.address()));
			return this;
		}

		/**
		Module containing entry point
		*/
		@Nullable
		default Element<? extends VkShaderModule> module(){
			final var module_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.MODULE);
			return (module_.equals(MemorySegment.NULL)?null:(Element<? extends VkShaderModule>)()->module_);
		}

		/**
		Null-terminated entry point name
		*/
		default VkPipelineShaderStageCreateInfo pName(CString pName){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.PNAME, pName==null?MemorySegment.NULL:pName.address());
			return this;
		}

		/**
		Null-terminated entry point name
		*/
		default CString pName(){
			final var pName_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.PNAME);
			return pName_.equals(MemorySegment.NULL)?null:CString.wrap(pName_);
		}

		default VkPipelineShaderStageCreateInfo pSpecializationInfo(Element<VkSpecializationInfo> pSpecializationInfo){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO, (pSpecializationInfo==null?MemorySegment.NULL:pSpecializationInfo.address()));
			return this;
		}

		@Nullable
		default Element<VkSpecializationInfo> pSpecializationInfo(){
			final var pSpecializationInfo_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO);
			return (pSpecializationInfo_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pSpecializationInfo_, org.lwjgl.vulkan.VkSpecializationInfo.SIZEOF, (v434437292)->(v434437292.equals(MemorySegment.NULL)?null:(VkSpecializationInfo)()->v434437292)));
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineShaderStageCreateInfo from the given Arena.
		*/
		public static VkPipelineShaderStageCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineShaderStageCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineShaderStageCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.SIZEOF, (mem)->(VkPipelineShaderStageCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkReallocationFunction.html">PFN_vkReallocationFunction</a>
	*/
	public static abstract class PFN_vkReallocationFunction implements io.github.kartoffell.klvulkan.Element<PFN_vkReallocationFunction>{
		protected final MemorySegment address;

		public final MethodHandle handle_;

		public final FunctionDescriptor descriptor_ = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);

		public MemorySegment address() {
			return address;
		}

		MethodHandle PFN_vkReallocationFunction_;
		/**
		@return (*(void))
		@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/PFN_vkReallocationFunction.html">PFN_vkReallocationFunction</a>
		*/
		public abstract MemorySegment PFN_vkReallocationFunction(MemorySegment pUserData, MemorySegment pOriginal, long size, long alignment, int allocationScope);

		 {
			try {
				handle_ =  MethodHandles.lookup().findVirtual(PFN_vkReallocationFunction.class, "PFN_vkReallocationFunction_", MethodType.methodType(MemorySegment.class, MemorySegment.class, MemorySegment.class, MemorySegment.class, MemorySegment.class, int.class));
			} catch(Exception e) {throw new IllegalStateException(e);}
		}

		public PFN_vkReallocationFunction(Arena arena) {
			this.address = Linker.nativeLinker().upcallStub(handle_, descriptor_, arena);
		}

		protected MemorySegment PFN_vkReallocationFunction_(MemorySegment pUserData, MemorySegment pOriginal, MemorySegment size, MemorySegment alignment, int allocationScope) {
			return PFN_vkReallocationFunction(pUserData, pOriginal, size.address(), alignment.address(), allocationScope);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkPipelineColorBlendStateCreateInfo.html">VkPipelineColorBlendStateCreateInfo</a>
	*/
	public interface VkPipelineColorBlendStateCreateInfo extends io.github.kartoffell.klvulkan.Element<VkPipelineColorBlendStateCreateInfo>{
		default VkPipelineColorBlendStateCreateInfo sType(int sType){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.STYPE, sType);
			return this;
		}

		default int sType(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.STYPE);
		}

		default VkPipelineColorBlendStateCreateInfo pNext(MemorySegment pNext){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PNEXT, pNext);
			return this;
		}

		@Nullable
		default MemorySegment pNext(){
			return address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PNEXT);
		}

		default VkPipelineColorBlendStateCreateInfo flags(int flags){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.FLAGS, flags);
			return this;
		}

		@Nullable
		default int flags(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.FLAGS);
		}

		default VkPipelineColorBlendStateCreateInfo logicOpEnable(boolean logicOpEnable){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE, logicOpEnable?1:0);
			return this;
		}

		default boolean logicOpEnable(){
			final var logicOpEnable_ = address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE);
			return logicOpEnable_!=0;
		}

		default VkPipelineColorBlendStateCreateInfo logicOp(int logicOp){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOP, logicOp);
			return this;
		}

		default int logicOp(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOP);
		}

		/**
		# of pAttachments
		*/
		default VkPipelineColorBlendStateCreateInfo attachmentCount(int attachmentCount){
			address().set(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT, attachmentCount);
			return this;
		}

		/**
		# of pAttachments
		*/
		@Nullable
		default int attachmentCount(){
			return address().get(ValueLayout.JAVA_INT, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT);
		}

		default VkPipelineColorBlendStateCreateInfo pAttachments(Element<VkPipelineColorBlendAttachmentState> pAttachments){
			address().set(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PATTACHMENTS, (pAttachments==null?MemorySegment.NULL:pAttachments.address()));
			return this;
		}

		@Nullable
		default Element<VkPipelineColorBlendAttachmentState> pAttachments(){
			final var pAttachments_ = address().get(ValueLayout.ADDRESS, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PATTACHMENTS);
			return (pAttachments_.equals(MemorySegment.NULL)?null:ElementBuffer.wrap(pAttachments_, org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.SIZEOF, (v1388563249)->(v1388563249.equals(MemorySegment.NULL)?null:(VkPipelineColorBlendAttachmentState)()->v1388563249)));
		}

		default FloatBuffer blendConstants(){
			final var blendConstants_ = address().asSlice(org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS, 4*4);
			return (blendConstants_.equals(MemorySegment.NULL)?null:blendConstants_.asByteBuffer().asFloatBuffer());
		}

		MemorySegment address();

		/**
		Allocates a new VkPipelineColorBlendStateCreateInfo from the given Arena.
		*/
		public static VkPipelineColorBlendStateCreateInfo allocateDirect(Arena arena) {
			final var mem = arena.allocate(org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF);
			return ()->mem;
		}

		/**
		Allocates a new ElementBuffer of Element type VkPipelineColorBlendStateCreateInfo from the given Arena with a capacity of count.
		*/
		public static ElementBuffer<VkPipelineColorBlendStateCreateInfo> allocateDirect(Arena arena, int count) {
			return ElementBuffer.allocateDirect(arena, count, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF, (mem)->(VkPipelineColorBlendStateCreateInfo)()->mem);
		}

	}

	/**
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/VkQueryResultFlagBits.html">VkQueryResultFlagBits</a>
	*/
	public interface VkQueryResultFlagBits{
		public static final int VK_QUERY_RESULT_PARTIAL_BIT = 8;

		public static final int VK_QUERY_RESULT_64_BIT = 1;

		public static final int VK_QUERY_RESULT_WAIT_BIT = 2;

		public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 4;

	}

	protected final VkCapabilitiesGlobal capabilities = new VkCapabilitiesGlobal();

	public VkCapabilitiesGlobal capabilities() {
		return capabilities;
	}

	/**
	@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
	@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
	@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
	@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEnumerateInstanceLayerProperties.html">vkEnumerateInstanceLayerProperties</a>
	*/
	public int vkEnumerateInstanceLayerProperties(IntBuffer pPropertyCount, @Nullable Element<VkLayerProperties> pProperties) {
		if(capabilities.vkEnumerateInstanceLayerProperties_==null) {
			capabilities.vkEnumerateInstanceLayerProperties_ = capabilities.lookup("vkEnumerateInstanceLayerProperties", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
		}
		try {
			final var return_ = (int) capabilities.vkEnumerateInstanceLayerProperties_.invoke((pPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPropertyCount)), (pProperties==null?MemorySegment.NULL:pProperties.address()));
			if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			return return_;
		} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
	}

	/**
	@return {@link VkResult#VK_SUCCESS} {@link VkResult#VK_INCOMPLETE} @throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
	@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
	@throws VK_ERROR_LAYER_NOT_PRESENT ->{@value VkResult#VK_ERROR_LAYER_NOT_PRESENT}
	@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
	@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkEnumerateInstanceExtensionProperties.html">vkEnumerateInstanceExtensionProperties</a>
	*/
	public int vkEnumerateInstanceExtensionProperties(@Nullable CString pLayerName, IntBuffer pPropertyCount, @Nullable Element<VkExtensionProperties> pProperties) {
		if(capabilities.vkEnumerateInstanceExtensionProperties_==null) {
			capabilities.vkEnumerateInstanceExtensionProperties_ = capabilities.lookup("vkEnumerateInstanceExtensionProperties", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
		}
		try {
			final var return_ = (int) capabilities.vkEnumerateInstanceExtensionProperties_.invoke(pLayerName==null?MemorySegment.NULL:pLayerName.address(), (pPropertyCount==null?MemorySegment.NULL:MemorySegment.ofBuffer(pPropertyCount)), (pProperties==null?MemorySegment.NULL:pProperties.address()));
			if(return_<0) {checkError(return_); throw new VulkanError(return_);}
			return return_;
		} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
	}

	/**
	@throws VK_ERROR_OUT_OF_HOST_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_HOST_MEMORY}
	@throws VK_ERROR_OUT_OF_DEVICE_MEMORY ->{@value VkResult#VK_ERROR_OUT_OF_DEVICE_MEMORY}
	@throws VK_ERROR_INITIALIZATION_FAILED ->{@value VkResult#VK_ERROR_INITIALIZATION_FAILED}
	@throws VK_ERROR_LAYER_NOT_PRESENT ->{@value VkResult#VK_ERROR_LAYER_NOT_PRESENT}
	@throws VK_ERROR_EXTENSION_NOT_PRESENT ->{@value VkResult#VK_ERROR_EXTENSION_NOT_PRESENT}
	@throws VK_ERROR_INCOMPATIBLE_DRIVER ->{@value VkResult#VK_ERROR_INCOMPATIBLE_DRIVER}
	@throws VK_ERROR_UNKNOWN ->{@value VkResult#VK_ERROR_UNKNOWN}
	@throws VK_ERROR_VALIDATION_FAILED ->{@value VkResult#VK_ERROR_VALIDATION_FAILED}
	@see <a href="https://docs.vulkan.org/refpages/latest/refpages/source/vkCreateInstance.html">vkCreateInstance</a>
	*/
	public void vkCreateInstance(Element<VkInstanceCreateInfo> pCreateInfo, @Nullable Element<VkAllocationCallbacks> pAllocator, PointerBuffer<? extends Element<? extends VkInstance>> pInstance) {
		if(capabilities.vkCreateInstance_==null) {
			capabilities.vkCreateInstance_ = capabilities.lookup("vkCreateInstance", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
		}
		try {
			final var return_ = (int) capabilities.vkCreateInstance_.invoke((pCreateInfo==null?MemorySegment.NULL:pCreateInfo.address()), (pAllocator==null?MemorySegment.NULL:pAllocator.address()), (pInstance==null?MemorySegment.NULL:pInstance.address()));
			if(return_<0) {checkError(return_); throw new VulkanError(return_);}
		} catch (RuntimeException e) {throw e;} catch (Throwable e) {throw new Error(e);}
	}

	public static void checkError(int code) {
		switch (code) {
			case 3 -> throw new VK_EVENT_SET();
			case -5 -> throw new VK_ERROR_MEMORY_MAP_FAILED();
			case -8 -> throw new VK_ERROR_FEATURE_NOT_PRESENT();
			case -4 -> throw new VK_ERROR_DEVICE_LOST();
			case 5 -> throw new VK_INCOMPLETE();
			case -10 -> throw new VK_ERROR_TOO_MANY_OBJECTS();
			case -13 -> throw new VK_ERROR_UNKNOWN();
			case -9 -> throw new VK_ERROR_INCOMPATIBLE_DRIVER();
			case 0 -> throw new VK_SUCCESS();
			case -6 -> throw new VK_ERROR_LAYER_NOT_PRESENT();
			case 2 -> throw new VK_TIMEOUT();
			case -1 -> throw new VK_ERROR_OUT_OF_HOST_MEMORY();
			case -12 -> throw new VK_ERROR_FRAGMENTED_POOL();
			case -11 -> throw new VK_ERROR_FORMAT_NOT_SUPPORTED();
			case -2 -> throw new VK_ERROR_OUT_OF_DEVICE_MEMORY();
			case 4 -> throw new VK_EVENT_RESET();
			case -3 -> throw new VK_ERROR_INITIALIZATION_FAILED();
			case -7 -> throw new VK_ERROR_EXTENSION_NOT_PRESENT();
			case 1 -> throw new VK_NOT_READY();
			case 1000011001 -> throw new VK_ERROR_VALIDATION_FAILED();

		}
	}

}
