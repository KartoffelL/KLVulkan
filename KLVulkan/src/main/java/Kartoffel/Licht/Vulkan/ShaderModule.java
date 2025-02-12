package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;

/**
 * Shader modules contain shader code and one or more entry points. Shaders are selected from a shader module by specifying an entry point as part of <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#pipelines">pipeline</a> creation.
 *  The stages of a pipeline can use shaders that come from different modules.
 *   The shader code defining a shader module must be in the SPIR-V format, as described by the <a href="https://docs.vulkan.org/spec/latest/appendices/spirvenv.html#spirvenv">Vulkan Environment for SPIR-V</a> appendix.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/shaders.html#shader-modules">Shaders :: Vulkan Documentation Project</a>
 */
public class ShaderModule implements VulkanFreeable, VulkanObject{
	VirtualDevice device;
	long address;
	ShaderModule() {
		
	}
	/**
	 * Frees any resources held back
	 */
	public void free() {
		VK13.vkDestroyShaderModule(device.device(), address, null);
	}
	public long getAddress() {
		return address;
	}
	public VkDevice getDevice() {
		return device.device();
	}
	
}