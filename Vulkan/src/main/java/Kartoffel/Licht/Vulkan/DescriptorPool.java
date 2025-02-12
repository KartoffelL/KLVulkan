package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;

/**
 * A Descriptor Pool holds some amount of {@link Descriptor}s.
 */
public class DescriptorPool implements VulkanFreeable, VulkanObject{

	/**
	 * Can be freed when either reseting or freeing the pool this was created from
	 */
	public static class DescriptorSet {
		/**
		 * The set address
		 */
		public long set;
		/**
		 * new
		 * @param set the address
		 */
		public DescriptorSet(long set) {
			this.set = set;
		}
	};
	/**
	 * Helper record
	 * @param type the type
	 * @param count the count
	 */
	public record descriptorPoolSize(int type, int count) {}
	
	long address;
	VirtualDevice device;
	int maxSets;
	/**
	 * constructor
	 */
	DescriptorPool() {}
	
	public void free() {
		VK13.vkDestroyDescriptorPool(device.device(), address, null);
	}
	/**
	 * {@return the address}
	 */
	public long getAddress() {
		return address;
	}
	/**
	 * {@return the device}
	 */
	public VkDevice getDevice() {
		return device.device();
	}
	/**
	 * {@return the max amount of sets}
	 */
	public int getMaxSets() {
		return maxSets;
	}
	/**
	 * Resets the pool
	 */
	public void reset() {
		VK13.vkResetDescriptorPool(device.device(), address, 0); //Flags reserved for future use
	}
	
	
}
