/**
 * 
 */
package Kartoffel.Licht.Vulkan;

import java.nio.ByteBuffer;

import org.lwjgl.system.MemoryUtil;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkQueue;

/**
 * VulkanBufferUtils provides nice functions to interact with {@link Buffer}s
 */
public class VulkanBufferUtils {
	
	private Allocator allocator;
	private long commandPool;
	private VkQueue mainQueue;
	/**
	 * Creates a new {@link VulkanBufferUtils} instance with the given allocator. This instance won't be able to do any indirect operations.
	 * @param allocator the {@link Allocator} to use
	 */
	public VulkanBufferUtils(Allocator allocator) {
		this.allocator = allocator;
	}
	/**
	 * Creates a new {@link VulkanBufferUtils} instance with the given allocator.
	 * @param allocator the {@link Allocator} to use
	 * @param commandPool the commandpool to use
	 * @param queue the queue to submit the transfers to.
	 */
	public VulkanBufferUtils(Allocator allocator, long commandPool, VkQueue queue) {
		this.allocator = allocator;
		this.commandPool = commandPool;
		this.mainQueue = queue;
	}
	
	/**
	 * Creates a Buffer with certain flags making it suited
	 * @param capacity the capacity in bytes
	 * @param isStorageBuffer if this is should include the storage buffer bit
	 * @return the created Buffer
	 */
	public Buffer generateBuffer(int capacity, boolean isStorageBuffer) {
		return VulkanTools.createBuffer(allocator, capacity, VK13.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK13.VK_BUFFER_USAGE_TRANSFER_DST_BIT | (isStorageBuffer ? VK13.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT  : 0), VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT, 0);
	}
	/**
	 * Creates a Buffer with certain flags making it suited
	 * @param capacity the capacity in bytes
	 * @param usage additional bits about usage
	 * @param transferSrc if the {@link VK10#VK_BUFFER_USAGE_TRANSFER_SRC_BIT} is included
	 * @param transferDst if the {@link VK10#VK_BUFFER_USAGE_TRANSFER_DST_BIT} is included
	 * @param storage if the {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT} is included
	 * @param memoryProperties properties of the memory that should back this buffer up
	 * @param deviceLocal if the {@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT} is included
	 * @param hostVisible if the {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT} is included
	 * @param hostCoherent if the {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT} is included
	 * @return the created Buffer
	 */
	public Buffer generateBuffer(int capacity, int usage, boolean transferSrc, boolean transferDst, boolean storage, int memoryProperties, boolean deviceLocal, boolean hostVisible, boolean hostCoherent) {
		return VulkanTools.createBuffer(allocator, capacity, usage | (transferSrc ? VK13.VK_BUFFER_USAGE_TRANSFER_SRC_BIT : 0) | (transferDst ? VK13.VK_BUFFER_USAGE_TRANSFER_DST_BIT : 0) | (storage ? VK13.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT : 0), memoryProperties | (deviceLocal ? VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT : 0) | (hostVisible ? VK13.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT : 0) | (hostCoherent ? VK13.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT : 0), 0);
	}
	
	/**
	 * Creates a Buffer with certain flags making it suited
	 * @param capacity the capacity in bytes
	 * @param isStorageBuffer if this is should include the {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT}
	 * @return the created Buffer
	 */
	public Buffer generateIndexBuffer(int capacity, boolean isStorageBuffer) {
		return VulkanTools.createBuffer(allocator, capacity, VK13.VK_BUFFER_USAGE_INDEX_BUFFER_BIT | VK13.VK_BUFFER_USAGE_TRANSFER_DST_BIT  | (isStorageBuffer ? VK13.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT  : 0), VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT, 0);
	}
	
	/**
	 * Creates a Buffer with certain flags making it suited
	 * @param capacity the capacity in bytes
	 * @return the created Buffer
	 */
	public Buffer generateTempBuffer(int capacity) {
		return VulkanTools.createBuffer(allocator, capacity, VK13.VK_BUFFER_USAGE_TRANSFER_SRC_BIT , VK13.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK13.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT, 0);
	}
	/**
	 * Creates a Buffer with certain flags making it suited
	 * @param capacity the capacity in bytes
	 * @param isStorageBuffer if this is should include the {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT}
	 * @return the created Buffer
	 */
	public Buffer generateUniformBuffer(int capacity, boolean isStorageBuffer) {
		return VulkanTools.createBuffer(allocator, capacity, VK13.VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT | VK13.VK_BUFFER_USAGE_TRANSFER_DST_BIT  | (isStorageBuffer ? VK13.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT  : 0), VK13.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT  | VK13.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT | VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT, 0);
	}
	
	/**
	 * Puts the specified data into the Buffer by first copying it to a temporal Buffer, then from the temporal buffer to the destination Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBuffer(Buffer buffer, byte[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length);
		bb.put(0, data, srcOff, length);
		putBuffer(buffer, bb, 0, dstOff, length);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer by first copying it to a temporal Buffer, then from the temporal buffer to the destination Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBuffer(Buffer buffer, ByteBuffer data, int srcOff, int dstOff, int length) {
		if(mainQueue == null)
			throw new IllegalStateException("VulkanBufferUtils not initialized with commandpool and Queue! This is required for indirect Buffer operations since transferring data from the src buffer to an accesable Buffer and vice-versa is done via commands!");
		Buffer tempBuff = VulkanTools.createBuffer(allocator, length, VK13.VK_BUFFER_USAGE_TRANSFER_SRC_BIT, VK13.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK13.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT, 0);
		VulkanTools.fillBuffer(tempBuff, data, srcOff, 0, length);
		VulkanTools.copyBuffer(tempBuff, (Buffer) buffer, 0, dstOff, length, commandPool, mainQueue);
		tempBuff.free();
	}
	/**
	 * Puts the specified data into the Buffer by first copying it to a temporal Buffer, then from the temporal buffer to the destination Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBuffer(Buffer buffer, double[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*8);
		bb.asDoubleBuffer().put(0, data, srcOff, length);
		putBuffer(buffer, bb, 0, dstOff*8, length*8);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer by first copying it to a temporal Buffer, then from the temporal buffer to the destination Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBuffer(Buffer buffer, float[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*4);
		bb.asFloatBuffer().put(0, data, srcOff, length);
		putBuffer(buffer, bb, 0, dstOff*4, length*4);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer by first copying it to a temporal Buffer, then from the temporal buffer to the destination Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBuffer(Buffer buffer, int[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*4);
		bb.asIntBuffer().put(0, data, srcOff, length);
		putBuffer(buffer, bb, 0, dstOff*4, length*4);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer by first copying it to a temporal Buffer, then from the temporal buffer to the destination Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBuffer(Buffer buffer, long[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*8);
		bb.asLongBuffer().put(0, data, srcOff, length);
		putBuffer(buffer, bb, 0, dstOff*8, length*8);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer by first copying it to a temporal Buffer, then from the temporal buffer to the destination Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBuffer(Buffer buffer, short[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*2);
		bb.asShortBuffer().put(0, data, srcOff, length);
		putBuffer(buffer, bb, 0, dstOff*2, length*2);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer without usage of a temporal Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBufferDirect(Buffer buffer, byte[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length);
		bb.put(0, data, srcOff, length);
		putBufferDirect(buffer, bb, 0, dstOff, length);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer without usage of a temporal Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBufferDirect(Buffer buffer, ByteBuffer data, int srcOff, int dstOff, int length) {
		VulkanTools.fillBuffer(buffer, data, srcOff, dstOff, length);
	}
	/**
	 * Puts the specified data into the Buffer without usage of a temporal Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBufferDirect(Buffer buffer, double[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*8);
		bb.asDoubleBuffer().put(0, data, srcOff, length);
		putBufferDirect(buffer, bb, 0, dstOff*8, length*8);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer without usage of a temporal Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBufferDirect(Buffer buffer, float[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*4);
		bb.asFloatBuffer().put(0, data, srcOff, length);
		putBufferDirect(buffer, bb, 0, dstOff*4, length*4);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer without usage of a temporal Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBufferDirect(Buffer buffer, int[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*4);
		bb.asIntBuffer().put(0, data, srcOff, length);
		putBufferDirect(buffer, bb, 0, dstOff*4, length*4);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer without usage of a temporal Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBufferDirect(Buffer buffer, long[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*8);
		bb.asLongBuffer().put(0, data, srcOff, length);
		putBufferDirect(buffer, bb, 0, dstOff*8, length*8);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Puts the specified data into the Buffer without usage of a temporal Buffer.
	 * @param buffer the buffer
	 * @param data the data
	 * @param srcOff source offset
	 * @param dstOff destination offset
	 * @param length amount of data to copy. (not byte size!)
	 */
	public void putBufferDirect(Buffer buffer, short[] data, int srcOff, int dstOff, int length) {
		ByteBuffer bb = MemoryUtil.memAlloc(length*2);
		bb.asShortBuffer().put(0, data, srcOff, length);
		putBufferDirect(buffer, bb, 0, dstOff*2, length*2);
		MemoryUtil.memFree(bb);
	}
	/**
	 * Wraps the data into an {@link Buffer}.
	 * @param buffer the data
	 * @param usage the usage
	 * @param suitable the memory-Suitable flags
	 * @return the created Buffer
	 */
	public Buffer wrap(byte[] buffer, int usage, int suitable) {
		Buffer buff = VulkanTools.createBuffer(allocator, buffer.length, usage, suitable, 0);
		putBuffer(buff, buffer, 0, 0, buffer.length);
		return buff;
	}
	/**
	 * Wraps the data into an {@link Buffer}.
	 * @param buffer the data
	 * @param usage the usage
	 * @param suitable the memory-Suitable flags
	 * @return the created Buffer
	 */
	public Buffer wrap(double[] buffer, int usage, int suitable) {
		Buffer buff = VulkanTools.createBuffer(allocator, buffer.length*8, usage, suitable, 0);
		putBuffer(buff, buffer, 0, 0, buffer.length);
		return buff;
	}
	/**
	 * Wraps the data into an {@link Buffer}.
	 * @param buffer the data
	 * @param usage the usage
	 * @param suitable the memory-Suitable flags
	 * @return the created Buffer
	 */
	public Buffer wrap(float[] buffer, int usage, int suitable) {
		Buffer buff = VulkanTools.createBuffer(allocator, buffer.length*4, usage, suitable, 0);
		putBuffer(buff, buffer, 0, 0, buffer.length);
		return buff;
	}
	/**
	 * Wraps the data into an {@link Buffer}.
	 * @param buffer the data
	 * @param usage the usage
	 * @param suitable the memory-Suitable flags
	 * @return the created Buffer
	 */
	public Buffer wrap(int[] buffer, int usage, int suitable) {
		Buffer buff = VulkanTools.createBuffer(allocator, buffer.length*4, usage, suitable, 0);
		putBuffer(buff, buffer, 0, 0, buffer.length);
		return buff;
	}
	/**
	 * Wraps the data into an {@link Buffer}.
	 * @param buffer the data
	 * @param usage the usage
	 * @param suitable the memory-Suitable flags
	 * @return the created Buffer
	 */
	public Buffer wrap(long[] buffer, int usage, int suitable) {
		Buffer buff = VulkanTools.createBuffer(allocator, buffer.length*8, usage, suitable, 0);
		putBuffer(buff, buffer, 0, 0, buffer.length);
		return buff;
	}
	/**
	 * Wraps the data into an {@link Buffer}.
	 * @param buffer the data
	 * @param usage the usage
	 * @param suitable the memory-Suitable flags
	 * @return the created Buffer
	 */
	public Buffer wrap(short[] buffer, int usage, int suitable) {
		Buffer buff = VulkanTools.createBuffer(allocator, buffer.length*2, usage, suitable, 0);
		putBuffer(buff, buffer, 0, 0, buffer.length);
		return buff;
	}
	

}
