package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;
/**
 * A {@link PipelineLayout} configures what {@link DescriptorSetLayout}s and push-constants are used.
 * @see <a href="https://vkguide.dev/docs/chapter-2/pipeline_walkthrough/#:~:text=Pipeline%20layouts%20contain%20the%20information,pipeline%20layout%20for%20our%20Pipeline">vkguide.dev Pipeline Walkthrough</a>
 */
public class PipelineLayout implements VulkanFreeable, VulkanObject{
	
	/**
	 * From a shader perspective, push constant are similar to a uniform buffer.
	 * @param stageFlags the flags concerning the stages
	 * @param offset the byte offset
	 * @param size the byte size
	 * @see <a href="https://docs.vulkan.org/guide/latest/push_constants.html">Push Constants :: Vulkan Documentation Project</a>
	 */
	public static record PushConstant(int stageFlags, int offset, int size) {}
	
	/**
	 * Creates a new PipelineLayout
	 * @param address the address 
	 * @param device the device
	 */
	public PipelineLayout(long address, VirtualDevice device) {
		this.address = address;
		this.device = device;
	}

	long address;
	VirtualDevice device;
	
	@Override
	public void free() {
		VK13.vkDestroyPipelineLayout(device.device(), address, null);
	}
	public long getAddress() {
		return address;
	}

	public VkDevice getDevice() {
		return device.device();
	}

}
