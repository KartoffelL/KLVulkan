package Kartoffel.Licht.Vulkan.Impls;

import java.nio.ByteBuffer;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.vma.Vma;
import org.lwjgl.util.vma.VmaAllocationCreateInfo;
import org.lwjgl.util.vma.VmaAllocationInfo;
import org.lwjgl.util.vma.VmaAllocatorCreateInfo;
import org.lwjgl.util.vma.VmaVulkanFunctions;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkMemoryRequirements;

import Kartoffel.Licht.Vulkan.Allocator;

/**
 * {@link Allocator} Implementation using <a href="https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator">Vulkan-Memory-Allocator</a>.
 */
public class Allocator_Vma_Impl implements Allocator{
	/**
	 * {@link Memory} Implementation using <a href="https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator">Vulkan-Memory-Allocator</a>.
	 */
	public static class MemoryImpl implements Memory {
		private long address, offset, object, size;
		private Allocator allocator;
		/**
		 * Implementation of {@link Memory} from {@link Allocator_Vma_Impl}
		 * @param allocator the allocator
		 * @param address the address
		 * @param offset the offset
		 * @param object the object
		 * @param size the size
		 */
		public MemoryImpl(Allocator allocator, long address, long offset, long object, long size) {
			this.address  = address;
			this.offset = offset;
			this.object = object;
			this.size = size;
			this.allocator = allocator;
		}
		
		@Override
		public long getMemoryAddress() {
			return address;
		}

		@Override
		public long getMemoryOffset() {
			return offset;
		}
		@Override
		public long getMemorySize() {
			return size;
		}

		@Override
		public Allocator getAllocator() {
			return allocator;
		}
		
	}
	/**
	 * {@link MemoryAllocationInfo} Implementation using <a href="https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator">Vulkan-Memory-Allocator</a>.
	 */
	public static class MemoryAllocationInfoImpl implements MemoryAllocationInfo {
		VkMemoryRequirements requirements;
		int memoryUsage;
		int memorySuitableFlags;
		int memoryPreferredFlags;
		/**
		 * Implementation of {@link MemoryAllocationInfo} from {@link Allocator_Vma_Impl}
		 * @param requirements the requirements
		 * @param vkbufferusage the buffer usage
		 * @param memorySuitableFlags the memorySuitableFlags
		 * @param memoryPreferredFlags the memoryPrefferedFlags
		 */
		public MemoryAllocationInfoImpl(VkMemoryRequirements requirements, int vkbufferusage, int memorySuitableFlags,
				int memoryPreferredFlags) {
			super();
			this.requirements = requirements;
			this.memoryUsage = vkbufferusage;
			this.memorySuitableFlags = memorySuitableFlags;
			this.memoryPreferredFlags = memoryPreferredFlags;
		}
		
		
	}
	
	private long allocator;
	private VkDevice device;
	/**
	 * Creates a new Allocator
	 * @param instance the Vulkan instance
	 * @param device the device onto which to allocate memory
	 * @param apiVersion the api-Version of vulkan
	 * @param flags any flags
	 */
	public Allocator_Vma_Impl(VkInstance instance, VkDevice device, int apiVersion, int flags) {
		super();
		this.device = device;
		try(MemoryStack stack = MemoryStack.stackPush()) {
			VmaVulkanFunctions functions = new VmaVulkanFunctions(stack.calloc(VmaVulkanFunctions.SIZEOF));
			functions.set(instance, device);
			VmaAllocatorCreateInfo info = new VmaAllocatorCreateInfo(stack.calloc(88));
			info.set(flags, device.getPhysicalDevice(), device, 0, null, null, null, functions, instance, apiVersion, null);
			PointerBuffer pb = stack.pointers(1);
			int res = Vma.vmaCreateAllocator(info, pb);
			if(res != 0)
				throw new RuntimeException("Failed to create allocator! " + res);
			allocator = pb.get(0);
		}
	}
	
	public Memory allocateMemory(MemoryAllocationInfo info) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			MemoryAllocationInfoImpl inf = (MemoryAllocationInfoImpl) info;
			VmaAllocationCreateInfo cinf = new VmaAllocationCreateInfo(stack.calloc(48));
			cinf.usage(inf.memoryUsage);
			cinf.requiredFlags(inf.memorySuitableFlags);
			cinf.preferredFlags(inf.memoryPreferredFlags);
			VmaAllocationInfo info_ = new VmaAllocationInfo(stack.calloc(56));
			PointerBuffer pb = stack.callocPointer(1);
			int res = Vma.vmaAllocateMemory(allocator, inf.requirements, cinf, pb, info_);
			if(res != 0)
				throw new RuntimeException("Failed to allocate memory! " + res);
			return new MemoryImpl(this, info_.deviceMemory(), info_.offset(), pb.get(0), inf.requirements.size());
		}
	}
	@Override
	public void freeMemory(Memory memory) {
		MemoryImpl imp = (MemoryImpl) memory;
		Vma.vmaFreeMemory(allocator, imp.object);
	}
	@Override
	public void free() {
		Vma.vmaDestroyAllocator(allocator);
	}

	@Override
	public VkDevice getDevice() {
		return device;
	}

	@Override
	public ByteBuffer mapMemory(Memory memory) {
		PointerBuffer pp = MemoryUtil.memAllocPointer(1);
		Vma.vmaMapMemory(allocator, ((MemoryImpl)memory).object, pp);
		ByteBuffer res = pp.getByteBuffer((int) memory.getMemorySize());
		MemoryUtil.memFree(pp);
		return res;
	}

	@Override
	public void unmapMemory(Memory memory) {
		Vma.vmaUnmapMemory(allocator, ((MemoryImpl)memory).object);
	}

	@Override
	public void copyMemory(Memory dst, long dstOffset, ByteBuffer src, long srcOffset, long length) {
		long address = MemoryUtil.memAddress(src)+srcOffset; //Create adjusted view
		ByteBuffer srcc = MemoryUtil.memByteBuffer(address, (int) length);
		Vma.vmaCopyMemoryToAllocation(allocator, srcc, ((MemoryImpl)dst).object, dstOffset);
	}

	@Override
	public void copyMemory(ByteBuffer dst, long dstOffset, Memory src, long srcOffset, long length) {
		long address = MemoryUtil.memAddress(dst)+dstOffset; //Create adjusted view
		ByteBuffer dstt = MemoryUtil.memByteBuffer(address, (int) length);
		Vma.vmaCopyAllocationToMemory(allocator, ((MemoryImpl)src).object, srcOffset, dstt);
	}

}
