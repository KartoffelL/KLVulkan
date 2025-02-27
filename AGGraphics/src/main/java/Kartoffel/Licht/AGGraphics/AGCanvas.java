package Kartoffel.Licht.AGGraphics;

import org.joml.Vector4f;

import Kartoffel.Licht.Vulkan.Framebuffer;
import Kartoffel.Licht.Vulkan.RenderPass;

/**
 * 
 */
public interface AGCanvas {
	
	
	public RenderPass getRenderpass();
	public Vector4f[] getClearColors(int index);
	public Framebuffer getFramebuffer(int index);

}
