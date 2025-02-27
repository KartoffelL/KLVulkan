//package Kartoffel.Licht.AGGraphics.Utils.ImGen;
//
//import java.net.URL;
//
//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.glfw.GLFWErrorCallback;
//
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanInstance;
//import Kartoffel.Licht.AGGraphics.utils.BufferedImage;
//import Kartoffel.Licht.AGGraphics.utils.ImageDisplay;
//
//public class ImageGen {
//	
//	
//	public static void main(String[] args) throws Throwable {
//		System.out.println("Initializing..");
//		GLFWErrorCallback.createPrint(System.out).set();
//		if(!GLFW.glfwInit())
//			throw new RuntimeException("Failed to init GLFW!");
//		VulkanInstance instance = VulkanInstance.create("Engine", 1, 0, 0, "Test App", 1, 0, 0);
//		
//		BufferedImage bi = generate();
//		ImageDisplay.displayImage(bi, instance, 0, 1000, 1000);
//	}
//	
//	public static BufferedImage generate() throws Throwable {
//		//Random r = new Random();
//		@SuppressWarnings("deprecation")
//		BufferedImage b = Kartoffel.Licht.AGGraphics.utils.ImageIO.fromURL(new URL("https://img.freepik.com/free-photo/painting-mountain-lake-with-mountain-background_188544-9126.jpg"));
//		b = ImgUtil.blur(b, 2, 2);
//		return b;
//	}
//	
//
//}
