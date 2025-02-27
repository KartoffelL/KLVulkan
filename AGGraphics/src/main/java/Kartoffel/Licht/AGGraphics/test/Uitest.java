//package Kartoffel.Licht.AGGraphics.test;
//
//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.glfw.GLFWWindowRefreshCallbackI;
//
//import Kartoffel.Licht.AGGraphics.AGDrawer;
//import Kartoffel.Licht.AGGraphics.AGVGraphics;
//import Kartoffel.Licht.AGGraphics.UI.SimpleGraphics;
//import Kartoffel.Licht.AGGraphics.UI.TextGraphics;
//
//public class Uitest {
//
//	final static int div = 500;
//	static int[] arri = new int[1], arri2 = new int[1];
//	public static void main(String[] args) {
//		SimpleGraphics sg = new SimpleGraphics("test");
//		TextGraphics tg = new TextGraphics(sg.getGraphics());
//		TextGraphics.TextContainer text = tg.createText("𝔗 😀 hello world!m,.+µ²³46{[]]}😏🥵🐼🐔");
//		AGVGraphics g = sg.getGraphics();
//		AGDrawer drawer = g.createDrawer();
//		long window = g.getWindow();
//		GLFW.glfwSetWindowTitle(window, "test");
//		GLFW.glfwSetWindowRefreshCallback(window, new GLFWWindowRefreshCallbackI() {
//			@Override
//			public void invoke(long window) {
//				paint(sg, tg, g, window, drawer, text);
//			}
//		});
//		while(!GLFW.glfwWindowShouldClose(window)) {
//			paint(sg, tg, g, window, drawer, text);
//			GLFW.glfwPollEvents();
//		}
//	}
//	
//	static void paint(SimpleGraphics sg, TextGraphics tg, AGVGraphics g, long window, AGDrawer drawer, TextGraphics.TextContainer text) {
//		{	//Window Resizing
//			int w = arri[0]/div*div;
//			int h = arri2[0]/div*div;
//			GLFW.glfwGetWindowSize(window, arri, arri2);
//			if(w != arri[0]/div*div || h != arri2[0]/div*div)
//				g.resizeViewportBuffers(arri[0]/div*div, arri2[0]/div*div);
//		}
//		drawer.startDraw();
//		g.beginWindowRenderpass(drawer);
//		sg.setWindowSize(arri[0], arri2[0]);
////		sg.test(drawer);
//		tg.drawText(drawer, text);
//		g.endWindowRenderpass();
//		drawer.endDraw();
//		g.display();
//		sg.resetCounter();
//	}
//
//}
