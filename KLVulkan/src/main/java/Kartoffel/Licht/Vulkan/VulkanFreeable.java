package Kartoffel.Licht.Vulkan;
/**
 * An object holding back some kind of resources from Vulkan
 */
public interface VulkanFreeable extends AutoCloseable{
	
	
	
	@Override
	default void close() throws Exception {
		free();
	}
	
	/**
	 * Frees any resources held back by this object
	 */
	void free();
	
}
