package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;
/**
 * VkSampler objects represent the state of an image sampler which is used by the implementation to read image data and apply filtering and other transformations for the shader.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/samplers.html">Samplers :: Vulkan Documentation Project</a>
 */
public class Sampler implements VulkanFreeable, VulkanObject{
	
	long sampler;
	VkDevice device;
	/**
	 * Creates a new Sampler
	 * @param device the device
	 * @param sampler the address of the sampler
	 */
	public Sampler(VkDevice device, long sampler) {
		this.sampler = sampler;
		this.device = device;
	}
	@Override
	public void free() {
		VK13.vkDestroySampler(device, sampler, null);
	}
	@Override
	public long getAddress() {
		return sampler;
	}
	@Override
	public VkDevice getDevice() {
		return device;
	}

}
