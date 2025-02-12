package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.KHRRayTracingPipeline;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;

/**
 * Ray tracing pipelines consist of multiple {@link ShaderStage}s, fixed-function traversal stages, and a {@link PipelineLayout}.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#pipelines-ray-tracing">Pipelines :: Vulkan Documentation Project</a>
 */
public class RayTracePipeline implements Pipeline, VulkanFreeable{

	long address;
	VirtualDevice device;
	PipelineLayout layout;
	
	RayTracePipeline() {
		
	}
	

	@Override
	public void free() {
		VK13.vkDestroyPipeline(device.device(), address, null);
	}

	@Override
	public long getAddress() {
		return 0;
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
		return KHRRayTracingPipeline.VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR;
	}

}
