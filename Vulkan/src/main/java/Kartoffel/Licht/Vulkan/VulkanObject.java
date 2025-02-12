package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VkDevice;

/**
 * Represents an object in Vulkan, having an address and a device the object resides on.
 */
public interface VulkanObject {
	/**
	 * {@return the address of this object}
	 */
	public long getAddress();
	/**
	 * {@return the device this object was created on}
	 */
	public VkDevice getDevice();

}
