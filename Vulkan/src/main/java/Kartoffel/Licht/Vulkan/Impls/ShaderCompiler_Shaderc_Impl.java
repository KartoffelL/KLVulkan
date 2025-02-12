package Kartoffel.Licht.Vulkan.Impls;

import java.nio.ByteBuffer;

import org.lwjgl.util.shaderc.Shaderc;
import org.lwjgl.vulkan.VK13;

import Kartoffel.Licht.Vulkan.ShaderCompiler;

/**
 * {@link Shaderc} implementation of {@link ShaderCompiler}
 */
public class ShaderCompiler_Shaderc_Impl implements ShaderCompiler{

	private long compiler = 0;
	private boolean warn = false;
	
	/**
	 * Different shaderc shader types
	 */
    public static final int
				    shaderc_vertex_shader                       = 0,
				    shaderc_fragment_shader                     = 1,
				    shaderc_compute_shader                      = 2,
				    shaderc_geometry_shader                     = 3,
				    shaderc_tess_control_shader                 = 4,
				    shaderc_tess_evaluation_shader              = 5;
    /**
     * Creates a mew Shaderc compiler.
     * @param warn if warnings should be written to {@link System#out}
     */
    public ShaderCompiler_Shaderc_Impl(boolean warn) {
    	this.compiler = Shaderc.shaderc_compiler_initialize();
    	this.warn = warn;
    }
    /**
     * Translates from Vulkan shader stage bits to Shaderc shader type
     * @param vulkan -
     * @return -
     */
    public static int translate(int vulkan) {
    	switch (vulkan) {
    	case VK13.VK_SHADER_STAGE_VERTEX_BIT:
			return Shaderc.shaderc_vertex_shader;
    	case VK13.VK_SHADER_STAGE_FRAGMENT_BIT:
			return Shaderc.shaderc_fragment_shader;
    	case VK13.VK_SHADER_STAGE_GEOMETRY_BIT:
			return Shaderc.shaderc_geometry_shader;
    	case VK13.VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT:
			return Shaderc.shaderc_glsl_tess_control_shader;
    	case VK13.VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT:
			return Shaderc.shaderc_glsl_tess_evaluation_shader;
    	case VK13.VK_SHADER_STAGE_COMPUTE_BIT:
			return Shaderc.shaderc_compute_shader;
			//TODO raytracing stuff
		default:
			throw new RuntimeException("No Shader Stage " + vulkan);
		}
    }
    
	@Override
	public byte[] compile(String source, int type, String filename, String entrypoint) {
		long result = Shaderc.shaderc_compile_into_spv(compiler, source, translate(type), filename, entrypoint, 0);
		int status = Shaderc.shaderc_result_get_compilation_status(result);
		if(status != Shaderc.shaderc_compilation_status_success)
			throw new RuntimeException("Failed to Compile! " + status + " " + Shaderc.shaderc_result_get_error_message(result));
		if(Shaderc.shaderc_result_get_num_warnings(result) != 0 &&  warn) {
			System.err.println(Shaderc.shaderc_result_get_error_message(result));
		}
		ByteBuffer buff = Shaderc.shaderc_result_get_bytes(result);
		byte[] res = new byte[buff.capacity()];
		buff.get(res);
		Shaderc.shaderc_result_release(result);
		return res;
	}
	@Override
	public void free() {
		Shaderc.shaderc_compiler_release(compiler);
	}

}
