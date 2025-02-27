//package Kartoffel.Licht.AGGraphics.Utils;
//
//import java.nio.ByteBuffer;
//
//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
//import org.lwjgl.system.MemoryUtil;
//import org.lwjgl.vulkan.VK13;
//
//import Kartoffel.Licht.AGGraphics.AGDrawer;
//import Kartoffel.Licht.AGGraphics.AGVGraphics;
//import Kartoffel.Licht.AGGraphics.AGShader;
//import Kartoffel.Licht.AGGraphics.AGTexture;
//import Kartoffel.Licht.AGGraphics.Vulkan.Buffer;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool.AGDescriptorSet;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanInstance;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorData;
//import Kartoffel.Licht.AGGraphics.Vulkan.Sampler;
//import Kartoffel.Licht.AGGraphics.Vulkan.ShaderModule;
//
//public class ImageDisplay {
//	
//	
//	
////	public static AutoCloseable displayImageAsync(BufferedImage image, VulkanInstance instance, long window, int width, int height) { //TODO implement multithreaded GLFW
////		return new AutoCloseable() {
////			public boolean running = true;
////			{
////				new Thread() {
////					public void run() {
////						ImageDisplay d = new ImageDisplay().main(instance, image, window);
////						while(!GLFW.glfwWindowShouldClose(d.getGraphics().getWindow()) && running) {
////							d.draw(width, height);
////						}
////						d.free();
////					};
////				}.start();
////			}
////			
////			@Override
////			public void close() throws Exception {
////				running = false;
////			}
////		};
////	}
//	
//	
//	
//	public static void displayImage(BufferedImage image, VulkanInstance instance, long window, int width, int height) {
//		ImageDisplay d = new ImageDisplay().main(instance, image, window);
//		window = d.getGraphics().getWindow();
//		GLFW.glfwSetMouseButtonCallback(window, new GLFWMouseButtonCallbackI() {
//			
//			@Override
//			public void invoke(long window, int button, int action, int mods) {
//				ByteBuffer b = d.getGraphics().getBufferMemoryAccess(d.uniforms);
//				b.put(0, (byte) (b.get(0) != 0 ? 0 : 1));
//				d.getGraphics().freeBufferMemoryAccess(d.uniforms);
//			}
//		});
//		int[] a = new int[1];
//		int[] b = new int[1];
//		while(!GLFW.glfwWindowShouldClose(window)) {
//			GLFW.glfwPollEvents();
//			d.draw(width, height);
//			GLFW.glfwGetWindowSize(window, a, b);
//			width = a[0];
//			height = b[0];
//		}
//		d.free();
//	}
//	
//	
//	
//	
//
//	private AGVGraphics g;
//	private Buffer indices;
//	private Buffer vertices;
//	private Buffer uniforms;
//	private AGShader shader;
//	private AGTexture texture;
//	private Sampler sampler;
//	private AGDrawer drawer;
//	private AGDescriptorSet shaderDescriptorSet;
//	private DescriptorPool dpool;
//	
//	public ImageDisplay main(VulkanInstance instance, BufferedImage image, long window){
//		g = AGVGraphics.create(window, false, null, instance, 0);
//		window = g.getWindow();
//		g.setClearColor(0, 0.2f, 0.2f, 0.2f, 0.2f);
//		indices = g.generateIndexBuffer(6*4, false);
//		g.putBuffer(indices, new int[] {0, 1, 2, 2, 1, 3}, 0, 0, 6);
//		vertices = g.generateBuffer(5*4*4, false);
//		g.putBuffer(vertices, new float[] {
//				-1, -1, 0, 0, 0,
//				1, -1, 0, 0, 1,
//				-1, 1, 0, 1, 0,
//				1, 1, 0, 1, 1
//				}, 0, 0, 5*4);
//		uniforms = g.generateUniformBuffer(1, false);
//		texture = g.generateTexture2D(VK13.VK_FORMAT_R8G8B8A8_SRGB, image.getWidth(), image.getHeight(), 4);
//		byte[] imgData = image.toByteArray(4); //Always 4 channels
//		ByteBuffer imgDataBuff = MemoryUtil.memAlloc(imgData.length);
//		imgDataBuff.put(0, imgData);
//		g.putTexture2D(texture, imgDataBuff, image.getWidth(), image.getHeight(), 0, 0);
//		MemoryUtil.memFree(imgDataBuff);
//		sampler = g.generateTextureSampler(false, false, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, instance.getDevices()[0].p().limits().maxSamplerAnisotropy());
//		ShaderModule vertex = g.createShaderModule(
//				  "#version 450 core\r\n"
//				+ "layout(location = 0) in vec3 vertices;\r\n"
//				+ "layout(location = 1) in vec2 textures;\r\n"
//				+ "layout(location = 0) out vec2 tex_coords;\r\n"
//				+ "\r\n"
//				+ "\r\n"
//				+ "void main() {\r\n"
//				+ "	tex_coords = textures;\r\n"
//				+ "	gl_Position = vec4(vertices, 1);\r\n"
//				+ "}",
//				"test (Vertex)", "main", VK13.VK_SHADER_STAGE_VERTEX_BIT);
//		ShaderModule fragment = g.createShaderModule(
//				"#version 450 core\r\n"
//				+ "	\r\n"
//				+ "layout(location = 0) out vec4 outColor;\r\n"
//				+ "layout(location = 0) in vec2 tex_coords;\r\n"
//				+ "layout(binding = 0) uniform UniformBufferObject {bool a;} ubo;\r\n"
//				+ "\r\n"
//				+ "layout(binding = 1) uniform sampler2D fsmpl;\r\n"
//				+ "\r\n"
//				+ "void main() {\r\n"
//				+ "	outColor = texture(fsmpl, tex_coords.yx);\r\n"
//				+ " if(!ubo.a)"
//				+ " outColor.rgb = mix(mod(floor(tex_coords.x*17), 2) - mod(ceil(tex_coords.y*17), 2) == 0 ? vec3(0) : vec3(1), outColor.rgb, outColor.a);"
//				+ "	outColor.a = 1;\r\n"
//				+ "}",
//				"test (Fragment)", "main", VK13.VK_SHADER_STAGE_FRAGMENT_BIT);
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
//				new int[] {VK13.VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT}
//				);
//		vertex.free();
//		fragment.free();
//		
//		dpool = shader.createDescriptorPool(0, 2);
//		DescriptorData[] data = new DescriptorData[] {new DescriptorData.ddBuffer(uniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER), new DescriptorData.ddImage(texture, sampler, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)};
//		shaderDescriptorSet = g.createDescriptorSets(dpool, shader.getDescriptorLayouts())[0];
//		g.setDescriptorSet(shaderDescriptorSet, data);
//		drawer = g.createDrawer();
//		return this;
//	}
//	public void free() {
//		g.prepareShutdown();
//		drawer.free();
//		indices.free();
//		vertices.free();
//		texture.free();
//		sampler.free();
//		shader.free();
//		dpool.free();
//		uniforms.free();
//		g.free();
//	}
//	private int px = 0, py = 0;
//	public void draw(int width, int height) {
//		if(!drawer.ready())
//			return;
//		if(px != width || py != height) {
//			px = width;
//			py = height;
//			g.resizeViewportBuffers(px, py);
//		}
//		drawer.startDraw();
//		{
//			g.beginWindowRenderpass(drawer);
//			drawer.bindShader(shader, false);
//			drawer.bindIndexBuffer(indices);
//			drawer.bindBuffers(vertices);
//			drawer.bindDescriptorSets(shader, false, shaderDescriptorSet);
//			drawer.drawIndexed(6, 1);
//			g.endWindowRenderpass();
//		}
//		drawer.endDraw();
//		
//		g.display();
//	}
//	public AGDrawer getDrawer() {
//		return drawer;
//	}
//	public AGVGraphics getGraphics() {
//		return g;
//	}
//	public Buffer getUniforms() {
//		return uniforms;
//	}
//}
