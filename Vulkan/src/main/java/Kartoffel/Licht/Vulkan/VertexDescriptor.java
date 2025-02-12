/**
 * 
 */
package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VkVertexInputBindingDescription;

import Kartoffel.Licht.Vulkan.DescriptorPool.DescriptorSet;

/**
 * A {@link VertexDescriptor} describes the data of the vertex inside one buffer, as in "this part of the buffer is that vertexes data, etc..".<br>
 * A {@link VertexAttribDescriptor} then describes how this data is split and how its accessed in shaders.<br>
 * Example:<br><br>
 * A buffer is filled with elements, each 3xfloats (position) + 2xfloats (UV-coordinates)
 * <br>
 * 
 * <table border="1">
 * <tr>
 * <td> <span style="color:green;">1.3|2.0|5.3|0|0</span>|<span style="color:yellow;">4.2|2.0|4.3|1|0</span>|<span style="color:orange;">1.6|0.0|2.3|1|1</span>|<span style="color:lightblue;">3.3|1.5|3.8|0|1</span>|</td>
 * </tr>
 * <caption>a</caption>
 * </table>
 * 
 * <br>
 * A float is 4 bytes, so one element is 4*5 (20) bytes in size!<br><br>
 * That means the vertexDescriptor for this Buffer would be:<br>
 * vertexDescriptor(<br>
 * <table border="">
 * <tr>
 * <td>{@link VertexDescriptor#binding}=0,</td><td>//Later when binding the actual {@link DescriptorSet}s (which link to the actual {@link Buffer}), the first one will be our position/UV buffer.</td>
 * </tr>
 * <tr>
 * <td>{@link VertexDescriptor#elementSizeBytes}=20,</td><td>//Here is the size of our element</td>
 * </tr>
 * <tr>
 * <td>{@link VertexDescriptor#instanced}=false</td><td>//If the elements should change every instance, not every vertex. (thats why it's called <i>elements</i>, not <i>vertices</i> here)</td>
 * </tr>
 * <caption>a</caption>
 * </table>
 * )
 * <br>
 * Now we need to describe how the shader will access the element's data.<br>
 * We do this by describing two more {@link VertexAttribDescriptor}s (for the position and for the UV):<br>
 * For the position:<br><br>
 * vertexDescriptor(<br>
 * <table border="">
 * <tr>
 * <td>{@link VertexAttribDescriptor#binding}=0,</td><td>//This should be set to the binding index that the buffer has (like with the vertexDescriptor)</td>
 * </tr>
 * <tr>
 * <td>{@link VertexAttribDescriptor#attrib}=0,</td><td>//What attribute this data will be accessible from</td>
 * </tr>
 * <tr>
 * <td>{@link VertexAttribDescriptor#type}=VK13.VK_FORMAT_R32G32B32_SFLOAT</td><td>//the format, there are plenty.</td>
 * </tr>
 * <tr>
 * <td>{@link VertexAttribDescriptor#offsetBytes}=0</td><td>//the offset into the element</td>
 * </tr>
 * <caption>a</caption>
 * </table>
 * )<br>
 * and for the UV:<br><br>
 * vertexDescriptor(<br>
 * <table border="">
 *  <tr>
 * <td>{@link VertexAttribDescriptor#binding}=0,</td><td></td>
 * </tr>
 * <tr>
 * <td>{@link VertexAttribDescriptor#attrib}=1,</td><td></td>
 * </tr>
 * <tr>
 * <td>{@link VertexAttribDescriptor#type}=VK13.VK_FORMAT_R32G32_SFLOAT</td><td></td>
 * </tr>
 * <tr>
 * <td>{@link VertexAttribDescriptor#offsetBytes}=12</td><td></td>
 * </tr>
 * <caption>a</caption>
 * </table>
 * )
 * @param binding the binding point
 * @param elementSizeBytes the element size in bytes
 * @param instanced if elements will be on a per-Instance basis instead of the per-Vertex one.
 * @see VkVertexInputBindingDescription
 * @see <a href="https://docs.vulkan.org/guide/latest/vertex_input_data_processing.html">Vertex Input Data Processing :: Vulkan Documentation Project</a>
 */
public record VertexDescriptor(int binding, int elementSizeBytes, boolean instanced) {}