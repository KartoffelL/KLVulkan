package Kartoffel.Licht.Vulkan;

import java.nio.ByteBuffer;

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
		/**
		 * {@return the allocator of the memory.}
		 */
		public Allocator getAllocator();
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
	 * Maps the memory to a {@link ByteBuffer}.
	 * @param memory -
	 * @return -
	 */
	public ByteBuffer mapMemory(Memory memory);
	/**
	 * Unmaps and flushes the memory. The ByteBuffer mapping will be invalidated!
	 * @param memory -
	 */
	public void unmapMemory(Memory memory);
	/**
	 * Copies some memory into an ByteBuffer.
	 * @param dst the destination
	 * @param dstOffset the destination offset
	 * @param src the source
	 * @param srcOffset the source offset
	 * @param length the length
	 */
	public void copyMemory(Memory dst, long dstOffset, ByteBuffer src, long srcOffset, long length);
	/**
	 * Copies data from the ByteBuffer into memory.
	 * @param dst the destination
	 * @param dstOffset the destination offset
	 * @param src the source
	 * @param srcOffset the source offset
	 * @param length the length
	 */
	public void copyMemory(ByteBuffer dst, long dstOffset, Memory src, long srcOffset, long length);
	/**
	 * {@return the Device this allocator allocates on.}
	 */
	public VkDevice getDevice();

}
