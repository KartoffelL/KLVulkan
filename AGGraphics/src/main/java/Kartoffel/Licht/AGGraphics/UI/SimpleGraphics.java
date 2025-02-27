//package Kartoffel.Licht.AGGraphics.UI;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.ByteBuffer;
//import java.nio.charset.Charset;
//
//import org.joml.Vector2f;
//import org.joml.Vector4f;
//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.vulkan.VK13;
//
//import Kartoffel.Licht.AGGraphics.AGDrawer;
//import Kartoffel.Licht.AGGraphics.AGVGraphics;
//import Kartoffel.Licht.AGGraphics.AGShader;
//import Kartoffel.Licht.AGGraphics.Vulkan.Buffer;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool;
//import Kartoffel.Licht.AGGraphics.Vulkan.ShaderModule;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool.AGDescriptorSet;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanInstance;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorData;
//
///**
// * UI Framework
// */
//public class SimpleGraphics {
//	public static VulkanInstance INSTANCE = null;
//	
//	private AGVGraphics graphics;
//	private AGShader boxShader;
//	
//	private Buffer globalUniforms;
//	private DescriptorPool pool;
//	private AGDescriptorSet boxSet;
//	
//	public static final int MAX_UI_ELEMENTS = 100;
//	
//	public static final int UI_ELEMENT_SIZE = (26)*4;
//	
//	
//	public SimpleGraphics(String name) {
//		if(!GLFW.glfwInit())
//			throw new RuntimeException("Failed to init GLFW!");
//		if(INSTANCE == null) {
//			INSTANCE = VulkanInstance.create("AGGraphicWindow", 1, 0, 0, name, 1, 0, 0);
//		}
//		this.graphics = AGVGraphics.create(0, null, INSTANCE, 0);
//		init();
//	}
//	
//	public SimpleGraphics(AGVGraphics graphics) {
//		this.graphics = graphics;
//		INSTANCE = this.graphics.getVulkaninstance();
//		this.graphics.setClearColor(0, 0.2f, 0.2f, 0.2f, 0.2f);
//		init();
//	}
//	
//	void init() {
//		this.graphics.setClearColor(0, 0.2f, 0.2f, 0.2f, 0.2f);
//		{
//			ShaderModule frag = graphics.createShaderModule(getRes("box.fs"), "box.fs", "main", VK13.VK_SHADER_STAGE_FRAGMENT_BIT);
//			ShaderModule vert = graphics.createShaderModule(getRes("box.vs"), "box.vs", "main", VK13.VK_SHADER_STAGE_VERTEX_BIT);
//			this.boxShader = graphics.createShaderPipeline(new ShaderModule[] {vert, frag},
//					new AGShader.vertexDescriptor[] {},new AGShader.vertexAttribDescriptor[] {},new AGShader.descriptor[][] {
//							{
//								new AGShader.descriptor(0, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER, VK13.VK_SHADER_STAGE_ALL_GRAPHICS)
//							}
//						},
//					VK13.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST
//					);
//		}
//		this.globalUniforms = graphics.generateUniformBuffer(UI_ELEMENT_SIZE, false);
//		this.pool = boxShader.createDescriptorPool(0, 1);
//		this.boxSet = graphics.createDescriptorSets(pool, boxShader.getDescriptorLayouts()[0])[0];
//		graphics.setDescriptorSet(boxSet, new DescriptorData[] {new ddBuffer(globalUniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER)});
//	}
//	
//	
//	public void test(AGDrawer drawer) {
//		drawBox(drawer, 0, 50, 500, 300, 1, 1, 1, 1, 25, 1);
//	}
//	
//	Vector4f position = new Vector4f(40, 160, 0, 0);
//	Vector4f color = new Vector4f(0.8f, 0.5f, 1f, 1);
//	Vector2f mul = new Vector2f();
//	Vector2f size = new Vector2f(500, 500);
//	int index = 0;
//	public void drawBox(AGDrawer drawer, float x, float y, float w, float h, float r, float g, float b, float a, float radius, float smoothness) {
//		position.set(x, y, 0, 0);
//		color.set(r, g, b, a);
//		size.set(w, h);
//		int off = index*UI_ELEMENT_SIZE;
//		ByteBuffer buffer = graphics.getBufferMemoryAccess(globalUniforms);
//		position.get(0+off, buffer);
//		color.get(64+off, buffer);
//		mul.get(80+off, buffer);
//		size.get(88+off, buffer);
//		buffer.putFloat(96+off, radius);
//		buffer.putFloat(100+off, smoothness);
//		graphics.freeBufferMemoryAccess(globalUniforms);
//		
//		drawer.bindShader(boxShader, false);
//		drawer.bindDescriptorSets(boxShader, false, 0, boxSet);
//		drawer.draw(6, 1);
//		index++;
//	}
//	public void resetCounter() {
//		index = 0;
//	}
//	public void setWindowSize(int winSizeY, int winSizeX) {
//		mul.set(winSizeX, winSizeY);
//	}
//	
//	
//	public void free(boolean everything) {
//		boxShader.free();
//		graphics.free();
//		globalUniforms.free();
//		pool.free();
//		if(everything)
//			INSTANCE.free();
//	}
//	
//	private static String getRes(String name) {
//		InputStream is = SimpleGraphics.class.getClassLoader().getResourceAsStream(name);
//		try {
//			String res = new String(is.readAllBytes(), Charset.forName("UTF-8"));
//			is.close();
//			return res;
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//		
//	}
//	
//	public AGVGraphics getGraphics() {
//		return graphics;
//	}
//
//}
