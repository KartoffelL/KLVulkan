module AGGraphics {
	requires org.lwjgl.vulkan;
	requires org.joml;
	requires org.lwjgl.glfw;
	requires org.lwjgl.stb;
	requires transitive KLVulkan;
	requires imgui.binding;
	
	exports Kartoffel.Licht.AGGraphics;
	
}