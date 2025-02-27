package Kartoffel.Licht.AGGraphics;

import org.joml.Vector4f;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkPhysicalDevice;

import Kartoffel.Licht.Vulkan.Framebuffer;
import Kartoffel.Licht.Vulkan.RenderPass;
import Kartoffel.Licht.Vulkan.RenderPass.renderAttachment;
import Kartoffel.Licht.Vulkan.RenderPass.subpass;
import Kartoffel.Licht.Vulkan.VulkanFreeable;
import Kartoffel.Licht.Vulkan.VulkanInstance.Device;
import Kartoffel.Licht.Vulkan.VulkanTools;

/**
 * An AGCanvas is a destination for your rendered image, eg. if you want to either render to some texture or the window.
 * It handles color attachments, depth-buffer, etc..
 */
public class AGCanvasImage implements VulkanFreeable, AGCanvas{

	
	private int width, height;
	private Framebuffer[] frameBuffers;
	private RenderPass renderpass;
	private VkDevice device;
	private VkPhysicalDevice mainGPU;
	private VkInstance instance;
	private Vector4f[][] clearColors; //For color and depth
	
	
	/**
	 * Creates a new Canvas
	 * @param instance the instance
	 * @param device the device
	 * @param width the width
	 * @param height the height
	 * @param attachmentInfos the attachmentInformation
	 * @param attachements the actual attachments
	 * @param subpasses subpasses
	 */
	public AGCanvasImage(VkInstance instance, VkDevice device, int width, int height, renderAttachment[] attachmentInfos, subpass[] subpasses, AGTexture[][] attachements) {
		renderpass = VulkanTools.createRenderPass(device, attachmentInfos, subpasses);
		{
			frameBuffers = new Framebuffer[attachements.length];
			clearColors = new Vector4f[attachements.length][];
			for(int i = 0; i < attachements.length; i++) {
				clearColors[i] = new Vector4f[attachements[i].length];
				long[] imageViews = new long[attachements[i].length];
				for(int l = 0; l < attachements[i].length; l++) {
					if(attachements[i][l].getWidth() < width)
						throw new RuntimeException("All attachments have to have the same size, or greater than the framebuffer! Attachment " + i + "_" + l + " has dimensions " + attachements[i][l].getWidth() + "x" + attachements[i][l].getHeight() + ", but framebuffer has dimensions " + width+"x"+height);
					imageViews[l] = attachements[i][l].getImageview();
					clearColors[i][l] = new Vector4f();
				}
				frameBuffers[0] = VulkanTools.createFrameBuffer(renderpass.getAddress(), width, height, device, imageViews);
			}
		}
		this.device = device;
		this.instance = instance;
		this.width = width;
		this.height = height;
	}
//	/**
//	 * Binds the {@link RenderPass} that will then be displayed to the Screen.
//	 * @param buffer the buffer
//	 * @param frameBuffer the {@link Framebuffer} index.
//	 */
//	public void bind(AGDrawer buffer, int frameBuffer) {
//		VulkanTools.cmdBeginRenderPass(buffer.getCommandBuffer(), renderpass.getAddress(), frameBuffers[frameBuffer], 0, 0, width, height, clearColors[frameBuffer]);
//		currentDrawer = buffer;
//	}
	/**
	 * {@return the width of this canvas}
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * {@return the height of this canvas}
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * {@return the {@link RenderPass}}
	 */
	public RenderPass getRenderpass() {
		return renderpass;
	}
	/**
	 * Returns the clear colors.
	 * @param framebuffer the {@link Framebuffer} index
	 * @return the clearColor array
	 */
	public Vector4f[] getClearColors(int framebuffer) {
		return clearColors[framebuffer];
	}
	/**
	 * {@return the number of {@link Framebuffer}s}
	 */
	public int getNumFramebuffers() {
		return frameBuffers.length;
	}
	/**
	 * {@return the {@link Device}}
	 */
	public VkDevice getDevice() {
		return device;
	}
	/**
	 * {@return the physical device}
	 */
	public VkPhysicalDevice getPhysicalDevice() {
		return mainGPU;
	}
	/**
	 * {@return the {@link VkInstance}}
	 */
	public VkInstance getInstance() {
		return instance;
	}
	/**
	 * {@return the {@link Framebuffer}s}
	 */
	public Framebuffer[] getFrameBuffers() {
		return frameBuffers;
	}
	public void free() {
		for(Framebuffer fb : frameBuffers)
			fb.free();
		renderpass.free();
	}
	@Override
	public Framebuffer getFramebuffer(int index) {
		return frameBuffers[index];
	}
	
	
	
	
	
	

}
