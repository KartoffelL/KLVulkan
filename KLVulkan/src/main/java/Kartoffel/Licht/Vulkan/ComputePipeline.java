package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;


/**
 * Compute pipelines consist of a single static compute {@link ShaderStage} and the {@link PipelineLayout}.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#pipelines-compute">Pipelines :: Vulkan Documentation Project</a>
 */
public class ComputePipeline implements Pipeline, VulkanFreeable{
	
	long address;
	VirtualDevice device;
	PipelineLayout layout;
	
	ComputePipeline() {
		
	}
	

	@Override
	public void free() {
		VK13.vkDestroyPipeline(device.device(), address, null);
	}

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
		return VK13.VK_PIPELINE_BIND_POINT_COMPUTE;
	}
}
