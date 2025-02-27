package Kartoffel.Licht.AGGraphics;

import java.util.ArrayList;
import java.util.List;

import Kartoffel.Licht.Vulkan.Descriptor;
import Kartoffel.Licht.Vulkan.DescriptorPool;
import Kartoffel.Licht.Vulkan.DescriptorSetLayout;
import Kartoffel.Licht.Vulkan.Pipeline;
import Kartoffel.Licht.Vulkan.VulkanFreeable;
import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;
import Kartoffel.Licht.Vulkan.VulkanTools;

/**
 * A Shader contains a Pipeline and some meta
 */
public class AGShader implements VulkanFreeable{
	
	private Pipeline pipeline;
	private VirtualDevice device;
	private DescriptorSetLayout[] dlayouts;
	private Descriptor[][] descriptorInfo;
	private int[][] dcounts;
	private int[][] dtypes;
	/**
	 * Creates a new shader
	 * @param pipeline the pipeline
	 * @param device the device
	 * @param dlayouts the {@link DescriptorSetLayout}s
	 * @param descriptorInfo the {@link Descriptor}s
	 */
	public AGShader(Pipeline pipeline, VirtualDevice device, DescriptorSetLayout[] dlayouts, Descriptor[][] descriptorInfo){
		this.pipeline = pipeline;
		this.device = device;
		this.dlayouts = dlayouts;
		this.descriptorInfo = descriptorInfo;
		this.dcounts = new int[descriptorInfo.length][];
		this.dtypes = new int[descriptorInfo.length][];
		for(int bb = 0; bb < descriptorInfo.length; bb++) {
			Descriptor[] d = descriptorInfo[bb];
			List<Integer> types = new ArrayList<>();
			for(Descriptor dd : d)
				types.add(dd.type());
			List<Integer> typesB = new ArrayList<>();
			List<Integer> countsB = new ArrayList<Integer>();
			while(types.size() != 0) {
				int ref = types.get(0);
				int count = 0;
				for(int l = 0; l < types.size(); l++)
					if(types.get(l) == ref)
						count++;
				types.removeIf(a->a==ref);
				typesB.add(ref);
				countsB.add(count);
			}
			this.dtypes[bb] = new int[typesB.size()];
			this.dcounts[bb] = new int[countsB.size()];
			for(int i = 0; i < typesB.size(); i++) {
				this.dtypes[bb][i] = typesB.get(i);
				this.dcounts[bb][i] = countsB.get(i);
			}
		}
	}
	/**
	 * {@return the address of the pipeline}
	 */
	public long address() {
		return pipeline.getAddress();
	}
	/**
	 * Creates a Descriptor pool compatible with this pipeline
	 * @param setLayoutIndex the index
	 * @param maxSets the amount of sets the pool will support
	 * @return the created {@link DescriptorPool}
	 */
	public DescriptorPool createDescriptorPool(int setLayoutIndex, int maxSets) {
		var pool = VulkanTools.createDescriptorPool(device, dtypes[setLayoutIndex], dcounts[setLayoutIndex], maxSets);
		return pool;
	}
	
	public void free() {
		pipeline.free();
		pipeline.getLayout().free();
		for(int i = 0; i < dlayouts.length; i++)
			dlayouts[i].free();
	}
	/**
	 * {@return the device}
	 */
	public VirtualDevice getDevice() {
		return device;
	}
	/**
	 * {@return the Pipeline}
	 */
	public Pipeline getPipeline() {
		return pipeline;
	}

	/**
	 * {@return the DescriptorSetLayouts}
	 */
	public DescriptorSetLayout[] getDescriptorLayouts() {
		return dlayouts;
	}
	/**
	 * {@return the Descriptor[] array}
	 */
	public Descriptor[][] getDescriptorInfo() {
		return descriptorInfo;
	}

	@Override
	public void close() throws Exception {
		free();
	}

}
