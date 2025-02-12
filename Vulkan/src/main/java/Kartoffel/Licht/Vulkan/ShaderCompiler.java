package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK10;

/**
 * A {@link ShaderCompiler} compiles some source string (language Implementation dependent) to spir-V.
 */
public interface ShaderCompiler extends VulkanFreeable{

	/**
	 * Compiles the source code to spir-V
	 * @param source the source, language is implementation-dependent
	 * @param type the type, eg. {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT}
	 * @param fileName the name, used for debugging
	 * @param entrypoint the entrypoint
 	 * @return a byte[] containing spir-V binary code.
	 */
	public abstract byte[] compile(String source, int type, String fileName, String entrypoint);
	
	public abstract void free();

}
