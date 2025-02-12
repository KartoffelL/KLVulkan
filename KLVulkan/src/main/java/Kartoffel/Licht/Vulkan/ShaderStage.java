package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK10;

/**
 * A shader specifies programmable operations that execute for each vertex, control point, tessellated vertex, primitive, fragment, or workgroup in the corresponding stage(s) of the graphics and compute pipelines.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/shaders.html">Shaders :: Vulkan Documentation Project</a>
 */
public class ShaderStage {
	/**
	 * Creates a new ShaderStage.
	 * @param module the module containing the actual shader code
	 * @param entrypoint the entry point name, conventionally 'main'
	 * @param bits the bits, eg {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT}
	 * @return the created ShaderStage
	 */
	public static ShaderStage of(ShaderModule module, String entrypoint, int bits) {
		var res = new ShaderStage();
		res.module = module;
		res.entrypoint = entrypoint;
		res.bits = bits;
		return res;
	}
	
	ShaderModule module;
	String entrypoint;
	int bits;
	
	ShaderStage() {}
	/**
	 * {@return the bits}
	 */
	public int getBits() {
		return bits;
	}
	/**
	 * {@return the entrypoint name}
	 */
	public String getEntrypoint() {
		return entrypoint;
	}
	/**
	 * {@return the {@link ShaderModule} used}
	 */
	public ShaderModule getModule() {
		return module;
	}

}
