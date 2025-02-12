package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;

/**
 * Pipelines are the way of doing work on the GPU, either by a {@link GraphicsPipeline}, a {@link RayTracePipeline}, or a {@link ComputePipeline}.<br>
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html">Pipelines :: Vulkan Documentation Project</a>
 */
public interface Pipeline extends VulkanFreeable, VulkanObject{
	
	/**
	 * Creates a new {@link Pipeline} with the specified address. Calling {@link #free()} on this instance will do nothing.
	 * @param device the device
	 * @param layout the layout
	 * @param address the address
	 * @param bindPoint the bindPoint
	 * @return the created Pipeline
	 */
	public static Pipeline of(VirtualDevice device, PipelineLayout layout, long address, int bindPoint) {
		return new Pipeline() {
			
			@Override
			public void free() {}

			@Override
			public long getAddress() {
				return address;
			}

			@Override
			public VkDevice getDevice() {
				return device.device();
			}

			@Override
			public PipelineLayout getLayout() {
				return layout;
			}

			@Override
			public int getVkPipelineBindPoint() {
				return bindPoint;
			}
		};
	}
	/**
	 * {@return the address of the pipeline}}
	 */
	public long getAddress();
	/**
	 * {@return the device}}
	 */
	public VkDevice getDevice();
	/**
	 * {@return the PipelineLayout}}
	 */
	public PipelineLayout getLayout();
	/**
	 * {@return the Pipeline BindPoint}}
	 */
	public int getVkPipelineBindPoint();
}
