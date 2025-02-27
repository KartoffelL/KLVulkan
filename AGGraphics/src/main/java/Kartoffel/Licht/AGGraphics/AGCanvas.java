package Kartoffel.Licht.AGGraphics;

import org.joml.Vector4f;

import Kartoffel.Licht.Vulkan.Framebuffer;
import Kartoffel.Licht.Vulkan.RenderPass;

/**
 * An {@link AGCanvas} is an interface for handling {@link RenderPass}es and {@link Framebuffer}s, etc..
 */
public interface AGCanvas {
	
	/**
	 * {@return the RenderPass}
	 */
	public RenderPass getRenderpass();
	/**
	 * Returns the colors the destination may get cleared with.
	 * @param index the index.
	 * @return the clear colors (RGBA) of every image
	 */
	public Vector4f[] getClearColors(int index);
	/**
	 * Returns the {@link Framebuffer} this canvas links to, given the index.
	 * @param index the index
	 * @return the {@link Framebuffer} object.
	 */
	public Framebuffer getFramebuffer(int index);

}
