package Kartoffel.Licht.Vulkan;

import java.nio.IntBuffer;

import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;

/**
 * Graphics pipelines consist of multiple {@link ShaderStage}s, multiple fixed-function <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#_valid_combinations_of_stages_for_graphics_pipelines">pipeline stages</a> (by default all included), and a {@link PipelineLayout}.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#pipelines-graphics">Pipelines :: Vulkan Documentation Project</a>
 */
public class GraphicsPipeline implements Pipeline, VulkanFreeable{
	
	/**
	 * Holds information about the Graphics pipeline. All components included.
	 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#pipelines-graphics">Pipelines :: Vulkan Documentation Project</a>
	 */
	public static class GraphicsPipelineInfo {
		/**
		 * A representation of a viewport.
		 * @param x the x
		 * @param y the y
		 * @param width the width
		 * @param height the height
		 * @param minDepth the minDepth
		 * @param maxDepth the maxDepth
		 */
		public static record Viewport(float x, float y, float width, float height, float minDepth, float maxDepth) {
			/**
			 * new Viewport
			 */
			public Viewport() {
				this(0, 0, 1, 1, 0, 1);
			}
		}
		/**
		 * A representation of a scissor.
		 * @param x the x
		 * @param y the y
		 * @param width the width
		 * @param height the height
		 */
		public static record Scissor(int x, int y, int width, int height) {
			/**
			 * new Scissor
			 */
			public Scissor() {
				this(0, 0, 1, 1);
			}
		}
		/**the inputAssembly_topology*/
		public int inputAssembly_topology;
		/**the dynamicStates*/
		public int[] dynamicStates;
		/**the viewports*/
		public Viewport[] viewports;
		/**the scissors*/
		public Scissor[] scissors;
		/**the vertexDescriptors*/
		public VertexDescriptor[] vertexDescriptors;
		/**the attribDescriptors*/
		public VertexAttribDescriptor[] attribDescriptors;
		/**the inputAssembly_primitiveRestartEnabled*/
		public boolean inputAssembly_primitiveRestartEnabled = false;
		/**the rasterization_depthClampEnable*/
		public boolean rasterization_depthClampEnable = false;
		/**the rasterization_rasterizerDiscardEnable*/
		public boolean rasterization_rasterizerDiscardEnable = false;
		/**the rasterization_polygonMode*/
		public int rasterization_polygonMode = VK13.VK_POLYGON_MODE_FILL;
		/**the rasterization_lineWidth*/
		public int rasterization_lineWidth = 1;
		/**the rasterization_cullMode*/
		public int rasterization_cullMode = VK13.VK_CULL_MODE_BACK_BIT;
		/**the rasterization_frontFace*/
		public int rasterization_frontFace = VK13.VK_FRONT_FACE_CLOCKWISE;
		/**the rasterization_depthBiasEnable*/
		public boolean rasterization_depthBiasEnable = false;
		/**the rasterization_depthBiasClamp*/
		public int rasterization_depthBiasClamp = 0;
		/**the multisample_sampleShadingEnable*/
		public boolean multisample_sampleShadingEnable = false;
		/**the multisample_rasterizationSamples*/
		public int multisample_rasterizationSamples = VK13.VK_SAMPLE_COUNT_1_BIT;
		/**the multisample_minSampleShading*/
		public int multisample_minSampleShading = 1;
		/**the pSampleMask*/
		public IntBuffer pSampleMask = null;
		/**the multisample_alphaToCoverageEnable*/
		public boolean multisample_alphaToCoverageEnable = false;
		/**the multisample_alphaToOneEnable*/
		public boolean multisample_alphaToOneEnable = false;
		/**the depthStencil_depthTestEnable*/
		public boolean depthStencil_depthTestEnable = true;
		/**the depthStencil_depthWriteEnable*/
		public boolean depthStencil_depthWriteEnable = true;
		/**the depthStencil_depthCompareOp*/
		public int depthStencil_depthCompareOp = VK13.VK_COMPARE_OP_LESS;
		/**the depthStencil_depthBoundsTestEnable*/
		public boolean depthStencil_depthBoundsTestEnable = false;
		/**the depthStencil_minDepthBounds*/
		public float depthStencil_minDepthBounds = 0f;
		/**the depthStencil_maxDepthBounds*/
		public float depthStencil_maxDepthBounds = 1f;
		/**the depthStencil_stencilTestEnable*/
		public boolean depthStencil_stencilTestEnable = false;
		/**
		 * Creates a new {@link GraphicsPipelineInfo}
		 * @param topology the topology
		 * @param dynamicStates an array of dymanic States
		 * @param viewports an array of viewports
		 * @param scissors an array of scissors
		 * @param vertexDescriptors an array of {@link VertexDescriptor}s
		 * @param attribDescriptors an array of {@link VertexAttribDescriptor}s
		 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#pipelines-graphics">Pipelines :: Vulkan Documentation Project</a>
		 */
		public GraphicsPipelineInfo(int topology, int[] dynamicStates, Viewport[] viewports, Scissor[] scissors,
				VertexDescriptor[] vertexDescriptors, VertexAttribDescriptor[] attribDescriptors) {
			super();
			this.inputAssembly_topology = topology;
			this.dynamicStates = dynamicStates;
			this.viewports = viewports;
			this.scissors = scissors;
			this.vertexDescriptors = vertexDescriptors;
			this.attribDescriptors = attribDescriptors;
		}
		/**
		 * Creates a new {@link GraphicsPipelineInfo}. The vertexDescriptors is inferred of the attribDescriptors.
		 * @param topology the topology
		 * @param dynamicStates an array of dymanic States
		 * @param viewports an array of viewports
		 * @param scissors an array of scissors
		 * @param attribDescriptors an array of {@link VertexAttribDescriptor}s
		 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/pipelines.html#pipelines-graphics">Pipelines :: Vulkan Documentation Project</a>
		 */
		public GraphicsPipelineInfo(int topology, int[] dynamicStates, Viewport[] viewports, Scissor[] scissors, VertexAttribDescriptor[] attribDescriptors) {
			super();
			this.inputAssembly_topology = topology;
			this.dynamicStates = dynamicStates;
			this.viewports = viewports;
			this.scissors = scissors;
			this.attribDescriptors = attribDescriptors;
		}
		/**
		 * Setter
		 *  @return this
		 * @param attribDescriptors the attribDescriptors to set
		 */
		public GraphicsPipelineInfo setAttribDescriptors(VertexAttribDescriptor[] attribDescriptors) {
			this.attribDescriptors = attribDescriptors;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param depthStencil_depthBoundsTestEnable the depthStencil_depthBoundsTestEnable to set
		 */
		public GraphicsPipelineInfo setDepthStencil_depthBoundsTestEnable(boolean depthStencil_depthBoundsTestEnable) {
			this.depthStencil_depthBoundsTestEnable = depthStencil_depthBoundsTestEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param depthStencil_depthCompareOp the depthStencil_depthCompareOp to set
		 */
		public GraphicsPipelineInfo setDepthStencil_depthCompareOp(int depthStencil_depthCompareOp) {
			this.depthStencil_depthCompareOp = depthStencil_depthCompareOp;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param depthStencil_depthTestEnable the depthStencil_depthTestEnable to set
		 */
		public GraphicsPipelineInfo setDepthStencil_depthTestEnable(boolean depthStencil_depthTestEnable) {
			this.depthStencil_depthTestEnable = depthStencil_depthTestEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param depthStencil_depthWriteEnable the depthStencil_depthWriteEnable to set
		 */
		public GraphicsPipelineInfo setDepthStencil_depthWriteEnable(boolean depthStencil_depthWriteEnable) {
			this.depthStencil_depthWriteEnable = depthStencil_depthWriteEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param depthStencil_maxDepthBounds the depthStencil_maxDepthBounds to set
		 */
		public GraphicsPipelineInfo setDepthStencil_maxDepthBounds(float depthStencil_maxDepthBounds) {
			this.depthStencil_maxDepthBounds = depthStencil_maxDepthBounds;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param depthStencil_minDepthBounds the depthStencil_minDepthBounds to set
		 */
		public GraphicsPipelineInfo setDepthStencil_minDepthBounds(float depthStencil_minDepthBounds) {
			this.depthStencil_minDepthBounds = depthStencil_minDepthBounds;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param depthStencil_stencilTestEnable the depthStencil_stencilTestEnable to set
		 */
		public GraphicsPipelineInfo setDepthStencil_stencilTestEnable(boolean depthStencil_stencilTestEnable) {
			this.depthStencil_stencilTestEnable = depthStencil_stencilTestEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param dynamicStates the dynamicStates to set
		 */
		public GraphicsPipelineInfo setDynamicStates(int[] dynamicStates) {
			this.dynamicStates = dynamicStates;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param inputAssembly_primitiveRestartEnabled the inputAssembly_primitiveRestartEnabled to set
		 */
		public GraphicsPipelineInfo setInputAssembly_primitiveRestartEnabled(boolean inputAssembly_primitiveRestartEnabled) {
			this.inputAssembly_primitiveRestartEnabled = inputAssembly_primitiveRestartEnabled;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param inputAssembly_topology the inputAssembly_topology to set
		 */
		public GraphicsPipelineInfo setInputAssembly_topology(int inputAssembly_topology) {
			this.inputAssembly_topology = inputAssembly_topology;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param multisample_alphaToCoverageEnable the multisample_alphaToCoverageEnable to set
		 */
		public GraphicsPipelineInfo setMultisample_alphaToCoverageEnable(boolean multisample_alphaToCoverageEnable) {
			this.multisample_alphaToCoverageEnable = multisample_alphaToCoverageEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param multisample_alphaToOneEnable the multisample_alphaToOneEnable to set
		 */
		public GraphicsPipelineInfo setMultisample_alphaToOneEnable(boolean multisample_alphaToOneEnable) {
			this.multisample_alphaToOneEnable = multisample_alphaToOneEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param multisample_minSampleShading the multisample_minSampleShading to set
		 */
		public GraphicsPipelineInfo setMultisample_minSampleShading(int multisample_minSampleShading) {
			this.multisample_minSampleShading = multisample_minSampleShading;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param multisample_rasterizationSamples the multisample_rasterizationSamples to set
		 */
		public GraphicsPipelineInfo setMultisample_rasterizationSamples(int multisample_rasterizationSamples) {
			this.multisample_rasterizationSamples = multisample_rasterizationSamples;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param multisample_sampleShadingEnable the multisample_sampleShadingEnable to set
		 */
		public GraphicsPipelineInfo setMultisample_sampleShadingEnable(boolean multisample_sampleShadingEnable) {
			this.multisample_sampleShadingEnable = multisample_sampleShadingEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param pSampleMask the pSampleMask to set
		 */
		public GraphicsPipelineInfo setpSampleMask(IntBuffer pSampleMask) {
			this.pSampleMask = pSampleMask;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_cullMode the rasterization_cullMode to set
		 */
		public GraphicsPipelineInfo setRasterization_cullMode(int rasterization_cullMode) {
			this.rasterization_cullMode = rasterization_cullMode;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_depthBiasClamp the rasterization_depthBiasClamp to set
		 */
		public GraphicsPipelineInfo setRasterization_depthBiasClamp(int rasterization_depthBiasClamp) {
			this.rasterization_depthBiasClamp = rasterization_depthBiasClamp;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_depthBiasEnable the rasterization_depthBiasEnable to set
		 */
		public GraphicsPipelineInfo setRasterization_depthBiasEnable(boolean rasterization_depthBiasEnable) {
			this.rasterization_depthBiasEnable = rasterization_depthBiasEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_depthClampEnable the rasterization_depthClampEnable to set
		 */
		public GraphicsPipelineInfo setRasterization_depthClampEnable(boolean rasterization_depthClampEnable) {
			this.rasterization_depthClampEnable = rasterization_depthClampEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_frontFace the rasterization_frontFace to set
		 */
		public GraphicsPipelineInfo setRasterization_frontFace(int rasterization_frontFace) {
			this.rasterization_frontFace = rasterization_frontFace;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_lineWidth the rasterization_lineWidth to set
		 */
		public GraphicsPipelineInfo setRasterization_lineWidth(int rasterization_lineWidth) {
			this.rasterization_lineWidth = rasterization_lineWidth;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_polygonMode the rasterization_polygonMode to set
		 */
		public GraphicsPipelineInfo setRasterization_polygonMode(int rasterization_polygonMode) {
			this.rasterization_polygonMode = rasterization_polygonMode;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param rasterization_rasterizerDiscardEnable the rasterization_rasterizerDiscardEnable to set
		 */
		public GraphicsPipelineInfo setRasterization_rasterizerDiscardEnable(boolean rasterization_rasterizerDiscardEnable) {
			this.rasterization_rasterizerDiscardEnable = rasterization_rasterizerDiscardEnable;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param scissors the scissors to set
		 */
		public GraphicsPipelineInfo setScissors(Scissor[] scissors) {
			this.scissors = scissors;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param vertexDescriptors the vertexDescriptors to set
		 */
		public GraphicsPipelineInfo setVertexDescriptors(VertexDescriptor[] vertexDescriptors) {
			this.vertexDescriptors = vertexDescriptors;
			return this;
		}
		/**
		 * Setter 
		 * @return this
		 * @param viewports the viewports to set
		 */
		public GraphicsPipelineInfo setViewports(Viewport[] viewports) {
			this.viewports = viewports;
			return this;
		}
	}
	
	long address;
	VirtualDevice device;
	PipelineLayout layout;
	DescriptorSetLayout layouts[];
	
	GraphicsPipeline() {
		
	}
	

	@Override
	public void free() {
		VK13.vkDestroyPipeline(device.device(), address, null);
	}

	@Override
	public long getAddress() {
		return address;
	}


	/**
	 * {@return the {@link DescriptorSetLayout}s used in creation.}
	 */
	public DescriptorSetLayout[] getDescriptorSetLayouts() {
		return layouts;
	}


	@Override
	public VkDevice getDevice() {
		return device.device();
	}
	@Override
	public PipelineLayout getLayout() {
		return layout;
	}

	@Override
	public int getVkPipelineBindPoint() {
		return VK13.VK_PIPELINE_BIND_POINT_GRAPHICS;
	}

}
