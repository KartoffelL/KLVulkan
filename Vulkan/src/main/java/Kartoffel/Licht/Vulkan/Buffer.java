package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;
/**
 * Buffers represent linear arrays of data which are used for various purposes by binding them to a graphics or compute pipeline via descriptor sets or certain commands, or by directly specifying them as parameters to certain commands.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/resources.html#resources-buffers">Resource Creation :: Vulkan Documentation Project</a>
 * @param address the address of the buffer
 * @param allocator the {@link Allocator} used to create this Buffer
 * @param memory the memory backing this buffer up
 * @param device the device this Buffer was created on
 */
public record Buffer(long address, Allocator allocator, Allocator.Memory memory, VkDevice device) implements VulkanFreeable, VulkanObject{

	/**
	 * Creates a new Buffer-Object with the specified address and {@link VkDevice}
	 * @param address the address
	 * @param device the device
	 * @return the created Buffer
	 */
	public static Buffer of(long address, VkDevice device) {
		return new Buffer(address, null, null, device);
	}
	
	public void free() {
		allocator.freeMemory(memory);
		VK13.vkDestroyBuffer(device, address, null);
	}

	@Override
	public VkDevice getDevice() {
		return device;
	}

	@Override
	public long getAddress() {
		return address;
	}

}
