//package Kartoffel.Licht.AGGraphics.UI;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.ByteBuffer;
//import java.nio.IntBuffer;
//import java.nio.charset.Charset;
//
//import org.lwjgl.PointerBuffer;
//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.system.MemoryStack;
//import org.lwjgl.system.MemoryUtil;
//import org.lwjgl.util.freetype.FT_Bitmap;
//import org.lwjgl.util.freetype.FT_Face;
//import org.lwjgl.util.freetype.FreeType;
//import org.lwjgl.util.harfbuzz.HarfBuzz;
//import org.lwjgl.util.harfbuzz.hb_glyph_extents_t;
//import org.lwjgl.util.harfbuzz.hb_glyph_info_t;
//import org.lwjgl.util.harfbuzz.hb_glyph_position_t;
//import org.lwjgl.vulkan.VK13;
//
//import Kartoffel.Licht.AGGraphics.AGVGraphics;
//import Kartoffel.Licht.AGGraphics.Vulkan.AGVBuffer;
//import Kartoffel.Licht.AGGraphics.Vulkan.AGVDrawer;
//import Kartoffel.Licht.AGGraphics.Vulkan.AGVShader;
//import Kartoffel.Licht.AGGraphics.Vulkan.AGVShader.ShaderModule;
//import Kartoffel.Licht.AGGraphics.Vulkan.AGVShader.descriptorData;
//import Kartoffel.Licht.AGGraphics.Vulkan.AGVShader.descriptorData.ddBuffer;
//import Kartoffel.Licht.AGGraphics.Vulkan.AGVTexture;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanDescriptorPool;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanDescriptorPool.AGDescriptorSet;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanInstance;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanSampler;
//
//public class TextGraphics {
//	
//	public static class TextContainer {
//		public static final int CHAR_SIZE_BYTES = 8;
//		public AGVBuffer data;
//		public AGVGraphics graphics;
//		public final int size;
//		public VulkanDescriptorPool pool;
//		public AGDescriptorSet boxSet;
//		public AGVTexture fontMap;
//		public VulkanSampler sampler;
//		public int offsetX, offsetY;
//		
//		public TextContainer(TextGraphics t, String str) {
//			this.graphics = t.graphics;
//			String fontF = "C:\\Users\\Anwender\\eclipse-workspace\\Games\\AGLIB\\AGGraphics\\resources\\NotoColorEmoji-Regular.ttf";
//			fontF = "C:\\Windows\\Fonts\\seguiemj.ttf";
//			
//			long blob = HarfBuzz.hb_blob_create_from_file(fontF);
//			long face = HarfBuzz.hb_face_create(blob, 0);
//			long font = HarfBuzz.hb_font_create(face);
////			IntBuffer ib =; //TODO propper font scaling: then colored fonts!! Emojis?
//			HarfBuzz.hb_font_get_scale(font, null, null);
//			HarfBuzz.hb_font_set_scale(font, 5000, 5000);
//			
//			long time = System.nanoTime();
//			long buffer = HarfBuzz.hb_buffer_create();
//			HarfBuzz.hb_buffer_add_utf16(buffer, str, 0, str.length());
//			HarfBuzz.hb_buffer_set_direction(buffer, HarfBuzz.HB_DIRECTION_LTR);
//			HarfBuzz.hb_buffer_set_script(buffer, HarfBuzz.HB_SCRIPT_ARABIC);
//			HarfBuzz.hb_buffer_set_language(buffer, HarfBuzz.hb_language_from_string("en"));
//			HarfBuzz.hb_shape(font, buffer, null);
//			
//			hb_glyph_info_t.Buffer buff = HarfBuzz.hb_buffer_get_glyph_infos(buffer);
//			hb_glyph_position_t.Buffer buff_p = HarfBuzz.hb_buffer_get_glyph_positions(buffer);
//			
//			try (MemoryStack stack = MemoryStack.stackPush()){
//				PointerBuffer pb = stack.callocPointer(1);
//				FreeType.FT_Init_FreeType(pb);
//				long library = pb.get(0);
//				FreeType.FT_New_Face(library, fontF, 0, pb);
//				FT_Face Fface = new FT_Face(MemoryUtil.memByteBuffer(pb.get(0), FT_Face.SIZEOF));
////				FreeType.FT_Set_Pixel_Sizes(Fface, 100, 100);
//				int px = 0;
//				int py = 0;
//				int w = 1;
//				int h = 1;
//				offsetX = 0;
//				offsetY = 0;
//				for(int i = 0; i < buff.capacity(); i++) {
//					hb_glyph_info_t c = buff.get(i);
//					hb_glyph_position_t p = buff_p.get(i);
//					hb_glyph_extents_t extent = new hb_glyph_extents_t(stack.calloc(16));
//					HarfBuzz.hb_font_get_glyph_extents(font, c.codepoint(), extent);
//					int x = ((px+p.x_offset()+extent.x_bearing())>>6);
//					int y = -((py+p.y_offset()+extent.y_bearing())>>6);
//					int width = extent.width()>>6;
//					int height = -(extent.height()>>6);
//					offsetX = Math.min(offsetX, x);
//					offsetY = Math.min(offsetY, y);
//					w = Math.max(w, x+width);
//					h = Math.max(h, y+height);
//					px += p.x_advance();
//					py += p.y_advance();
//				}
//				fontMap = graphics.generateTexture2D(VK13.VK_FORMAT_R8G8B8A8_SRGB, (w+offsetX)+1, (h-offsetY)+1, 1);
//				px = 0;
//				py = 0;
//				for(int i = 0; i < buff.capacity(); i++) {
//					hb_glyph_info_t c = buff.get(i);
//					hb_glyph_position_t p = buff_p.get(i);
//					hb_glyph_extents_t extent = new hb_glyph_extents_t(stack.calloc(16));
//					
//					
//					HarfBuzz.hb_font_get_glyph_extents(font, c.codepoint(), extent);
//					
//					uploadChar(Fface, c.codepoint(), ((px+p.x_offset()+extent.x_bearing())>>6)+offsetX, -((py+p.y_offset()+extent.y_bearing())>>6)-offsetY);
//					px += p.x_advance();
//					py += p.y_advance();
//				}
//				
//			}
//			
//			time = System.nanoTime()-time;
//			System.out.println("@"+(time/1000000.0) + "ms");
//			
//			
//			size = buff.capacity();
//			
//			this.data = graphics.generateBuffer(size*CHAR_SIZE_BYTES*4, false);
//			float[] f = new float[size*CHAR_SIZE_BYTES];
//			for(int i = 0; i < buff.capacity(); i++) {
////				hb_glyph_info_t c = buff.get(i);
////				int cp = c.codepoint();
//				f[i*8+0] = 1f;
//				f[i*8+1] = 1f;
//				f[i*8+2] = 0;
//				f[i*8+3] = 0;
//			}
//			graphics.putBuffer(data, f, 0, 0, f.length);
//			this.pool = t.boxShader.createDescriptorPool(0, 1);
//			this.boxSet = graphics.createDescriptorSets(pool, t.boxShader.getDescriptorLayouts()[0])[0];
//			this.sampler = graphics.generateTextureSampler(false, false, VK13.VK_SAMPLER_ADDRESS_MODE_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_REPEAT, 0);
//			graphics.setDescriptorSet(boxSet, new descriptorData[] {new ddBuffer(t.globalUniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER), new AGVShader.descriptorData.ddImage(fontMap, sampler, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)});
//		
//		}
//		
//		private void check(int code) {
//			if(code != 0)
//				throw new RuntimeException("CODE " + code);
//		}
//		
//		public void uploadChar(FT_Face Fface, int codepoint, int x, int y) {
//			check(FreeType.FT_Load_Glyph(Fface, codepoint, FreeType.FT_LOAD_RENDER));
//			check(FreeType.FT_Render_Glyph(Fface.glyph(), FreeType.FT_RENDER_MODE_NORMAL));
//			FT_Bitmap map = Fface.glyph().bitmap();
//			if(map.width() == 0 || map.rows() == 0)
//				return;
//			ByteBuffer fdata = MemoryUtil.memCalloc(map.rows()*map.width()*4);
//			if(map.pixel_mode() == 2) {
//				ByteBuffer data = map.buffer(map.rows()*map.width());
//				for(int i = 0; i < map.rows()*map.width(); i++) {
//					byte g = data.get(i);
//					fdata.put(i*4+0, (byte) -1);
//					fdata.put(i*4+1, (byte) -1);
//					fdata.put(i*4+2, (byte) -1);
//					fdata.put(i*4+3, g);
//				}
//			}
//			else if(map.pixel_mode() == 7) {
//				System.out.println("gsd");
//				ByteBuffer data = map.buffer(map.rows()*map.width()*4);
//				for(int i = 0; i < map.rows()*map.width(); i++) {
//					fdata.put(i*4+0, data.get(i*4+2));
//					fdata.put(i*4+1, data.get(i*4+1));
//					fdata.put(i*4+2, data.get(i*4+0));
//					fdata.put(i*4+3, (byte) -1);
//				}
//			}
//			graphics.putTexture2D(fontMap, fdata, map.width(), map.rows(), x, y);
//			MemoryUtil.memFree(fdata);
//			}
//		
//		public void free() {
//			this.data.free();
//			this.pool.free();
//			this.sampler.free();
//			this.fontMap.free();
//		}
//		
//	}
//	
//	public static VulkanInstance INSTANCE = null;
//	
//	private AGVGraphics graphics;
//	private AGVShader boxShader;
//	
//	private AGVBuffer globalUniforms;
//	
//	public static final int MAX_UI_ELEMENTS = 100;
//	
//	
//	public TextGraphics(String name) {
//		if(!GLFW.glfwInit())
//			throw new RuntimeException("Failed to init GLFW!");
//		if(INSTANCE == null) {
//			INSTANCE = VulkanInstance.create("AGGraphicWindow", 1, 0, 0, name, 1, 0, 0);
//		}
//		this.graphics = AGVGraphics.create(0, null, INSTANCE, 0);
//		init();
//	}
//	
//	public TextGraphics(AGVGraphics graphics) {
//		this.graphics = graphics;
//		INSTANCE = this.graphics.getVulkaninstance();
//		this.graphics.setClearColor(0, 0.2f, 0.2f, 0.2f, 0.2f);
//		init();
//	}
//	
//	void init() {
//		this.graphics.setClearColor(0, 0.2f, 0.2f, 0.2f, 0.2f);
//		{
//			ShaderModule frag = graphics.createShaderModule(getRes("text.fs"), "text.fs", "main", VK13.VK_SHADER_STAGE_FRAGMENT_BIT);
//			ShaderModule vert = graphics.createShaderModule(getRes("text.vs"), "text.vs", "main", VK13.VK_SHADER_STAGE_VERTEX_BIT);
//			this.boxShader = graphics.createShaderPipeline(new AGVShader.ShaderModule[] {vert, frag},
//					new AGVShader.vertexDescriptor[] {
//							new AGVShader.vertexDescriptor(0, TextContainer.CHAR_SIZE_BYTES*4, true)
//						},
//					new AGVShader.vertexAttribDescriptor[] {
//							new AGVShader.vertexAttribDescriptor(0, 0, VK13.VK_FORMAT_R32G32B32A32_SFLOAT, 0),
//							new AGVShader.vertexAttribDescriptor(0, 1, VK13.VK_FORMAT_R32G32B32A32_SFLOAT, 16)
//						},
//					new AGVShader.descriptor[][] {{
//							new AGVShader.descriptor(0, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER, VK13.VK_SHADER_STAGE_ALL_GRAPHICS),
//							new AGVShader.descriptor(1, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, VK13.VK_SHADER_STAGE_FRAGMENT_BIT)
//						}},
//					VK13.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST
//					);
//		}
//		this.globalUniforms = graphics.generateUniformBuffer((26)*4, false);
//	}
//	
//	public TextContainer createText(String str) {
//		return new TextContainer(this, str);
//	}
//	
//	public void drawText(AGVDrawer drawer, TextContainer text) {
//		drawer.bindShader(boxShader, false);
//		drawer.bindDescriptorSets(boxShader, false, text.boxSet);
//		drawer.bindBuffers(text.data);
//		drawer.draw(6, text.size);
//	}
//	
//	
//	public void free(boolean everything) {
//		boxShader.free();
//		graphics.free();
//		globalUniforms.free();
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
