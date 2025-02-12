package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VkDevice;

/**
 * An Allocator allocates {@link Memory} in Vulkan using {@link MemoryAllocationInfo}.
 */
public interface Allocator extends VulkanFreeable{
	/**
	 * Memory describes some reserved Memory-Region in Vulkan.<br>
	 * Generally, Memory allocated by an {@link Allocator} has to be also freed by the same {@link Allocator}.
	 */
	public static interface Memory {
		/**
		 * {@return the address of the allocated memory.}
		 */
		public long getMemoryAddress();
		/**
		 * {@return the offset of the allocated memory.}
		 */
		public long getMemoryOffset();
		/**
		 * {@return the size of the allocated memory.}
		 */
		public long getMemorySize();
	}
	/**
	 * Provides information about the memory requirements, etc..<br>
	 * Implementation dependent.
	 */
	public static interface MemoryAllocationInfo {}
	/**
	 * Allocates some memory.
	 * @param info requirements about the memory
	 * @return the allocated Memory
	 */
	public Memory allocateMemory(MemoryAllocationInfo info);
	public void free();
	
	/**
	 * Frees some memory using this allocator.
	 * @param memory the memory to free.
	 */
	public void freeMemory(Memory memory);
	/**
	 * {@return the Device this allocator allocates on.}
	 */
	public VkDevice getDevice();

}
