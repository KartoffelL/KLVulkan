package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

/**
 * Render passes operate in conjunction with framebuffers. Framebuffers represent a collection of specific memory attachments that a render pass instance uses.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/renderpass.html#_framebuffers">Subpasses :: Vulkan Documentation Project</a>
 */
public class Framebuffer implements VulkanFreeable, VulkanObject{

	private long address;
	private long renderPass;
	private VkDevice device;
	/**
	 * Constructor
	 * @param device d
	 * @param address a
	 * @param renderPass r
	 */
	public Framebuffer(VkDevice device, long address, long renderPass) {
		this.address = address;
		this.renderPass = renderPass;
		this.device = device;
	}
	@Override
	public void free() {
		VK13.vkDestroyFramebuffer(device, address, null);
	}
	@Override
	public long getAddress() {
		return address;
	}
	@Override
	public VkDevice getDevice() {
		return device;
	}
	/**
	 * {@return the Renderpass}
	 */
	public long getRenderPass() {
		return renderPass;
	}
}
