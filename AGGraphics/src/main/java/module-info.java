module AGGraphics {
	requires org.lwjgl.vulkan; //Required
	requires org.joml;  //Required
	requires static org.lwjgl.glfw;
	requires static org.lwjgl.stb;
	requires transitive KLVulkan; //Should always be there
	requires static imgui.binding;
	
	exports Kartoffel.Licht.AGGraphics;
	
}