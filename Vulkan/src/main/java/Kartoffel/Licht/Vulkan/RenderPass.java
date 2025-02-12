package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.KHRSwapchain;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.RenderPass.subpass.Reference;

/**
 * <a href="https://docs.vulkan.org/spec/latest/chapters/drawing.html#drawing">Draw commands</a> must be recorded within a render pass instance. Each render pass instance defines a set of image resources, referred to as attachments, used during rendering.
 * <br>
 * <br>
 * In Vulkan, a {@link RenderPass} is divided up into multiple {@link subpass}es. Subpasses can each operate only on their own pixel, eg. it could be used for deferred rendering, but not for effects like bloom.<br>
 * Each subpass has a list of {@link Reference}s for color attachments, and one reference for depth/stencil. Those mainly contain an index to an attachment.
 * 
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/renderpass.html">Render Pass :: Vulkan Documentation Project</a>
 */
public class RenderPass implements VulkanFreeable, VulkanObject{
	
	/**
	 * An attachment description describes the properties of an attachment including its format, sample count, and how its contents are treated at the beginning and end of each render pass instance.
	 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/renderpass.html#renderpass-objects">Render Pass :: Vulkan Documentation Project</a>
	 */
	public static class renderAttachment {
		/**
		 * 
		 */
		int format = 0;
		int samples = VK13.VK_SAMPLE_COUNT_1_BIT;
		int loadOp = VK13.VK_ATTACHMENT_LOAD_OP_CLEAR;
		int storeOp = VK13.VK_ATTACHMENT_STORE_OP_STORE;
		int stencilLoadOp = VK13.VK_ATTACHMENT_LOAD_OP_DONT_CARE;
		int stencilStoreOp = VK13.VK_ATTACHMENT_STORE_OP_DONT_CARE;
		int initialLayout = VK13.VK_IMAGE_LAYOUT_UNDEFINED;
		int finalLayout = KHRSwapchain.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR;
		/**
		 * Creates a new {@link renderAttachment}
		 * @param format the format
		 */
		public renderAttachment(int format) {
			this.format = format;
		}
		/**
		 * Setter
		 * @param format the format to set
		 * @return this
		 */
		public renderAttachment setFormat(int format) {
			this.format = format;
			return this;
		}
		/**
		 * Setter
		 * @param samples the samples to set
		 * @return this
		 */
		public renderAttachment setSamples(int samples) {
			this.samples = samples;
			return this;
		}
		/**
		 * Setter
		 * @param loadOp the loadOp to set
		 * @return this
		 */
		public renderAttachment setLoadOp(int loadOp) {
			this.loadOp = loadOp;
			return this;
		}
		/**
		 * Setter
		 * @param storeOp the storeOp to set
		 * @return this
		 */
		public renderAttachment setStoreOp(int storeOp) {
			this.storeOp = storeOp;
			return this;
		}
		/**
		 * Setter
		 * @param stencilLoadOp the stencilLoadOp to set
		 * @return this
		 */
		public renderAttachment setStencilLoadOp(int stencilLoadOp) {
			this.stencilLoadOp = stencilLoadOp;
			return this;
		}
		/**
		 * Setter
		 * @param stencilStoreOp the stencilStoreOp to set
		 * @return this
		 */
		public renderAttachment setStencilStoreOp(int stencilStoreOp) {
			this.stencilStoreOp = stencilStoreOp;
			return this;
		}
		/**
		 * Setter
		 * @param initialLayout the initialLayout to set
		 * @return this
		 */
		public renderAttachment setInitialLayout(int initialLayout) {
			this.initialLayout = initialLayout;
			return this;
		}
		/**
		 * Setter
		 * @param finalLayout the finalLayout to set
		 * @return this
		 */
		public renderAttachment setFinalLayout(int finalLayout) {
			this.finalLayout = finalLayout;
			return this;
		}
		
	}
	/**
	 * A subpass represents a phase of rendering that reads and writes a subset of the attachments in a render pass. Rendering commands are recorded into a particular subpass of a render pass instance.
	 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/renderpass.html#renderpass-objects">Subpasses :: Vulkan Documentation Project</a>
	 */
	public static class subpass {
		/**
		 * A Reference referencing an attachment index, and a layout.
		 * @param attachment the attachment index
		 * @param layout the layout of this attachment
		 */
		public static record Reference(int attachment, int layout) {
			/**
			 * Creates a new reference, the layout will be set to {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}
			 * @param attachment the attachment index
			 */
			public Reference(int attachment) {
				this(attachment, VK13.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);
			}
		}
		/**
		 * Array of references
		 */
		public Reference[] references;
		/**
		 * Depthstencil reference
		 */
		public Reference depthStencil;
		/**
		 * The bindpoint
		 */
		public int bindingPoint = VK13.VK_PIPELINE_BIND_POINT_GRAPHICS;
		/**
		 * Creates a new subpass
		 * @param references the references for the color attachments
		 * @param depthStencil the reference for the depth/stencil attachment
		 */
		public subpass(Reference[] references, Reference depthStencil) {
			this.references = references;
			this.depthStencil = depthStencil;
		}
	}
	
	
	private long address;
	private VkDevice device;
	/**
	 * Creates a new {@link RenderPass}
	 * @param address the address of the Renderpass
	 * @param device the device
	 */
	public RenderPass(long address, VkDevice device) {
		this.address = address;
		this.device = device;
	}
	
	@Override
	public void free() {
		VK13.vkDestroyRenderPass(device, address, null);
	}
	@Override
	public long getAddress() {
		return address;
	}


	@Override
	public VkDevice getDevice() {
		return device;
	}
	
}
