//package Kartoffel.Licht.AGGraphics;
//
//import java.io.IOException;
//
//import org.lwjgl.vulkan.VK13;
//
//import Kartoffel.Licht.AGGraphics.Vulkan.Buffer;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool.AGDescriptorSet;
//import Kartoffel.Licht.AGGraphics.Vulkan.Sampler;
//import Kartoffel.Licht.AGGraphics.Vulkan.ShaderModule;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanFreeable;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorData;
//
//public class AGTextDrawer implements VulkanFreeable{
//	
//	private Buffer glyphInfo, textUniforms;
//	private AGTexture glyphMap;
//	private Sampler glyphSampler;
//	private AGDrawer drawer;
//	private AGShader shader;
//	private AGShader shaderCompute;
//	private DescriptorPool descriptorPool;
//	private DescriptorPool computeDescriptorPool;
//	private AGDescriptorSet shaderDescriptorSet;
//	private AGDescriptorSet computeShaderDescriptorSet;
//	
//	AGTextDrawer(AGVGraphics g, AGCanvas display) throws IOException {
//		glyphInfo = g.generateBuffer(10, true);
//		textUniforms = g.generateUniformBuffer(10, true);
//		
//		glyphMap = g.generateTexture2D(VK13.VK_FORMAT_R8G8B8A8_SRGB, 256, 256, 4);
//		g.transitionTexture(glyphMap, VK13.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL,
//				VK13.VK_ACCESS_SHADER_READ_BIT, 
//			VK13.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);
//		glyphSampler = g.generateTextureSampler(true, true, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, g.getDevice().physicalDevice().p().limits().maxSamplerAnisotropy());
//		
//		drawer = g.createDrawer();
//		
//		
//		
//		ShaderModule vertex = g.createShaderModule(new String(AGTextDrawer.class.getClassLoader().getResourceAsStream("test.vs").readAllBytes()), "text (Vertex)", "main", VK13.VK_SHADER_STAGE_VERTEX_BIT);
//		ShaderModule fragment = g.createShaderModule(new String(AGTextDrawer.class.getClassLoader().getResourceAsStream("test.fs").readAllBytes()), "text (Fragment)", "main", VK13.VK_SHADER_STAGE_FRAGMENT_BIT);
//		ShaderModule compute = g.createShaderModule(new String(AGTextDrawer.class.getClassLoader().getResourceAsStream("text.cs").readAllBytes()), "text (Compute)", "main", VK13.VK_SHADER_STAGE_COMPUTE_BIT);
//		shader = g.createShaderPipeline(new ShaderModule[] {vertex, fragment},
//				new AGShader.vertexDescriptor[] {
//						new AGShader.vertexDescriptor(0, 20, false)
//					},new AGShader.vertexAttribDescriptor[] {
//						new AGShader.vertexAttribDescriptor(0, 0, VK13.VK_FORMAT_R32G32B32_SFLOAT, 0),
//						new AGShader.vertexAttribDescriptor(0, 1, VK13.VK_FORMAT_R32G32_SFLOAT, 12)
//					},new AGShader.descriptor[][] {{
//						new AGShader.descriptor(0, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER, VK13.VK_SHADER_STAGE_ALL_GRAPHICS),
//						new AGShader.descriptor(1, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, VK13.VK_SHADER_STAGE_FRAGMENT_BIT)
//					}},
//				VK13.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST,
//				new int[] {VK13.VK_DYNAMIC_STATE_VIEWPORT, VK13.VK_DYNAMIC_STATE_SCISSOR}
//				);
//		vertex.free();
//		fragment.free();
//		descriptorPool = shader.createDescriptorPool(0, 2);
//		//Set #1
//		DescriptorData[] data = new DescriptorData[] {new DescriptorData.ddBuffer(textUniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER), new DescriptorData.ddImage(glyphMap, glyphSampler, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)};
//		shaderDescriptorSet = g.createDescriptorSets(descriptorPool, shader.getDescriptorLayouts())[0];
//		g.setDescriptorSet(shaderDescriptorSet, data);
//		
//		
//		
//		shaderCompute = g.createComputeShaderPipeline(compute, new AGShader.descriptor[][] {{
//							new AGShader.descriptor(0, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER, VK13.VK_SHADER_STAGE_COMPUTE_BIT)
//					}});
//		
//		compute.free();
//		computeDescriptorPool = shaderCompute.createDescriptorPool(0, 1);
//		{
//			data = new DescriptorData[] {
//				new DescriptorData.ddBuffer(textUniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER)
//				};
//			computeShaderDescriptorSet = g.createDescriptorSets(computeDescriptorPool, shaderCompute.getDescriptorLayouts())[0];
//			g.setDescriptorSet(computeShaderDescriptorSet, data);
//		}
//		
//		//Recording
//		
//		drawer.startDraw();
//		drawer.setViewport(0, 0, 100, 100, 0, 1);
//		drawer.setScissor(0, 0, 100, 100);
//		drawer.beginRenderpass(display, 0);
//		drawer.bindShader(shader, false);
//		drawer.bindDescriptorSets(shader, false, 0, shaderDescriptorSet);
//		drawer.draw(6, 1);
//		drawer.endRenderpass();
//		drawer.endDraw();
//		
//	}
//	
//	public void submitAll() {
//		drawer.submitAll();
//	}
//	public boolean ready() {
//		return drawer.ready();
//	}
//
//	@Override
//	public void free() {
//		glyphInfo.free();
//		textUniforms.free();
//		glyphMap.free();
//		glyphSampler.free();
//		shader.free();
//		shaderCompute.free();
//		descriptorPool.free();
//		computeDescriptorPool.free();
//		drawer.free();
//	}
//
//}
