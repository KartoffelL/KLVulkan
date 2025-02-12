module KLVulkan {
	requires transitive org.joml; //always required
	requires transitive org.lwjgl; //always required
	requires transitive org.lwjgl.vulkan; //always required
	requires static org.lwjgl.glfw; //optional
	requires static org.lwjgl.vma; //optional
	requires static org.lwjgl.shaderc; //optional

	exports Kartoffel.Licht.Vulkan;
	exports Kartoffel.Licht.Vulkan.Impls;
	exports Kartoffel.Licht.Vulkan.video;
	
}