/**
 * 
 */
package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK10;

/**
 * Descriptors specify, where and what kind of data is accessible in shaders, without actually needing to specify the buffers/images that will be sampled.
 * @see Kartoffel.Licht.AGGraphics.Vulkan.DescriptorData
 * @param binding the binding index
 * @param type the type, eg. {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER}
 * @param stage the stage where this is accessible.
 */
public record Descriptor(int binding, int type, int stage) {}