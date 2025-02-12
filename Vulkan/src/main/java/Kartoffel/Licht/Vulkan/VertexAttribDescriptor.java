package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VkVertexInputBindingDescription;

/**
 * A {@link VertexDescriptor} describes the data of the vertex inside one buffer, as in "this part of the buffer is that vertexes data, etc..".<br>
 * A {@link VertexAttribDescriptor} then describes how this data is split and how its accessed in shaders.<br>
 * An example can be viewed at {@link VertexDescriptor}.
 * @param binding the binding point
 * @param attrib the attrib index
 * @param type the type, eg. {@link VK10#VK_FORMAT_R32G32_SFLOAT}
 * @param offsetBytes the offset into the element
 * @see VkVertexInputBindingDescription
 * @see <a href="https://docs.vulkan.org/guide/latest/vertex_input_data_processing.html">Vertex Input Data Processing :: Vulkan Documentation Project</a>
 */
public record VertexAttribDescriptor(int binding, int attrib, int type, int offsetBytes) {}