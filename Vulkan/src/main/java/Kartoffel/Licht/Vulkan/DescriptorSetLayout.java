package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;

/**
 * A descriptor set layout object is defined by an array of zero or more descriptor bindings. Each individual descriptor binding is specified by a descriptor type, a count (array size) of the number of descriptors in the binding, a set of shader stages that can access the binding, and (if using immutable samplers) an array of sampler descriptors.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/descriptorsets.html#descriptorsets-setlayout">Resource Descriptors :: Vulkan Documentation Project</a>
 */
public class DescriptorSetLayout implements VulkanFreeable, VulkanObject{
	
	/**
	 * Creates a new {@link DescriptorSetLayout}
	 * @param address the address
	 * @param device the device
	 */
	public DescriptorSetLayout(long address, VirtualDevice device) {
		this.address = address;
		this.device = device;
	}

	long address;
	VirtualDevice device;
	
	@Override
	public void free() {
		VK13.vkDestroyDescriptorSetLayout(device.device(), address, null);
	}
	public long getAddress() {
		return address;
	}
	@Override
	public VkDevice getDevice() {
		return device.device();
	}

}
