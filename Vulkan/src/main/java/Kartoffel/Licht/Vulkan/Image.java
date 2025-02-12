package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;
/**
 * Images represent multidimensional - up to 3 - arrays of data which can be used for various purposes (e.g. attachments, textures), by binding them to a graphics or compute pipeline via descriptor sets, or by directly specifying them as parameters to certain commands.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/resources.html#resources-images">Resource Creation :: Vulkan Documentation Project</a>
 * @param address the address of the image
 * @param allocator the {@link Allocator} used to create this Image
 * @param memory the memory backing this Image up
 * @param device the device this Image was created on
 */
public record Image(long address, Allocator allocator, Allocator.Memory memory, VkDevice device) implements VulkanFreeable, VulkanObject{
	
	/**
	 * Creates a new Image-Object with the specified address and {@link VkDevice}
	 * @param address the address
	 * @param device the device
	 * @return the created Image
	 */
	public static Image of(long address, VkDevice device) {
		return new Image(address, null, null, device);
	}
	
	public void free() {
		allocator.freeMemory(memory);
		VK13.vkDestroyImage(device, address, null);
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
