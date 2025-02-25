package Kartoffel.Licht.Vulkan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VK11;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkPhysicalDevice;
import org.lwjgl.vulkan.VkPhysicalDeviceProperties;

/**
 * There is no global state in Vulkan and all per-application state is stored in a VkInstance object. Creating a VkInstance object initializes the Vulkan library and allows the application to pass information about itself to the implementation.
 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/initialization.html#initialization-instances">Initialization :: Vulkan Documentation Project</a>
 */
public class VulkanInstance implements VulkanFreeable{
	/**
	 * A representation of a validation-layer
	 * @see <a href="https://docs.vulkan.org/tutorial/latest/03_Drawing_a_triangle/00_Setup/02_Validation_layers.html">Validation layers :: Vulkan Documentation Project</a>
	 * @param name the name of this layer
	 * @param description the description of this layer
	 * @param implVer the implementation version of this layer
	 * @param specVer the spec-version of this layer
	 */
	public record ValidationLayer(String name, String description, int implVer, int specVer) {};
	/**
	 * A representation of a device, eg. your graphics card or some integrated graphics of your CPU
	 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/devsandqueues.html#devsandqueues-physical-device-enumeration">Devices and Queues :: Vulkan Documentation Project</a>
	 * @param p the properties of this physical device
	 * @param device the {@link VkPhysicalDevice}
	 * @param families the queue families of this device
	 * @param memory the {@link MemoryProperties} of this device
	 * @param extensions an array of available extensions
	 */
	public record Device(VkPhysicalDeviceProperties p, VkPhysicalDevice device, QueueFamily[] families, MemoryProperties memory, String[] extensions) implements VulkanFreeable{
		/**
		 * Checks if the extension is supported
		 * @param name the name of the extension
		 * @return if the extension is supported by this Device
		 */
		public boolean supportsExtension(String name) {
			for(String s : this.extensions)
				if(s.equalsIgnoreCase(name))
					return true;
			return false;
		}
		/**
		 * {@return the Name of this device}
		 */
		public String getName() {
			return p.deviceNameString();
		}
		/**
		 * {@return the Vulkan API version of this Device}
		 */
		public int getAPIVersion() {
			return p.apiVersion();
		}
		/**
		 * Tries to get the index of the best matching {@link QueueFamily}, so that all requirements are available, but the amount of extra queues and supported Queue Types are kept to a minimum.
		 * @param minQueues the minimum required amount of queue contained in the family
		 * @param requiredBits the bits required to be supported by the family
		 * @throws RuntimeException if no queue family was found satisfying the requirements
		 * @return the index of the {@link QueueFamily} of this {@link Device}
		 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/devsandqueues.html#devsandqueues-queueprops">Devices and Queues :: Vulkan Documentation Project</a>
		 */
		public int getQueueFamilyIndex(int minQueues, int requiredBits) {
			int res = -1;
			int extra = 50;
			for(int i = 0; i < families.length; i++) {
				int here = families[i].flags; //Bit-test.
				int required = requiredBits;
				int resB = required&here;
				int extraB = required^here;
				//int missingB = required-resB;
				if(resB == required && (families[i].maxQueueCount() >= minQueues)) {
					int extr = 0;
					extr += Integer.bitCount(extraB);
					extr += families[i].maxQueueCount()-minQueues;
					if(extr < extra) {
						res = i;
						extra = extr;
					}
				}
			}
			if(res == -1)
				throw new RuntimeException("No queue family found satisfying (GB,CB,TB,SB) "+Integer.toBinaryString(requiredBits)+"! Avaible: "+Arrays.toString(families));
			return res;
		}
		/**
		 * Returns a String representation of this Device, that is useful for development.
		 */
		@Override
		public final String toString() {
			String info = "";
			info += '{';
			info += "'"+getName()+"' ";
			int api = getAPIVersion();
			int driver = p.driverVersion();
			info += "API: "+VK13.VK_API_VERSION_MAJOR(api)+"."+VK13.VK_API_VERSION_MINOR(api)+"."+VK13.VK_API_VERSION_PATCH(api)+"."+VK13.VK_API_VERSION_VARIANT(api)+" ";
			info += "DRIVER: "+VK13.VK_API_VERSION_MAJOR(driver)+"."+VK13.VK_API_VERSION_MINOR(driver)+"."+VK13.VK_API_VERSION_PATCH(driver)+"."+VK13.VK_API_VERSION_VARIANT(driver)+" ";
			info += switch (p.deviceType()) {
			case VK13.VK_PHYSICAL_DEVICE_TYPE_CPU: yield "CPU";
			case VK13.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU: yield "DISCRETE_GPU";
			case VK13.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU: yield "INTEGRATED_GPU";
			case VK13.VK_PHYSICAL_DEVICE_TYPE_OTHER: yield "OTHER";
			case VK13.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU: yield "VIRTUAL_GPU";
			default: yield "UNKNOWN";
			}+" ";
			info += switch (p.vendorID()) {
			case 0x1002: yield "AMD";
			case 0x1010: yield "ImgTec";
			case 0x10DE: yield "NVIDIA";
			case 0x13B5: yield "ARM";
			case 0x5143: yield "Qualcomm";
			case 0x8086: yield "INTEL";
			default: yield "UNKNOWN("+p.vendorID()+")";
			}+" ";
			info += "}{";
			for(int i = 0; i < memory.size_bytes.length; i++) {
				info += memory.size_megabytes[i]+"mb; "+memory.type_flags[i]+" ";
			}
			info += "}{";
			info += "GameScore: "+calculateCardScore_GAME(this)+", ";
			info += "GUIScore: "+calculateCardScore_GUI(this);
			info += '}';
			return info;
		}
		@Override
		public void free() {
			p.free();
		}
	};
	/**
	 * A virtual device is create of a (physical-){@link Device} and specifies furthermore what you want to do. Most objects in Vulkan need this to be created.
	 * @see <a href="https://docs.vulkan.org/spec/latest/chapters/devsandqueues.html#devsandqueues-devices">Devices and Queues :: Vulkan Documentation Project</a>
	 * @param physicalDevice the device this {@link VirtualDevice} is based of
	 * @param device the {@link VkDevice}
	 */
	public record VirtualDevice(Device physicalDevice, VkDevice device) {
		VirtualDevice(VkDevice d) {
			this(null, d);
		}
		/**
		 * Creates a new Device. This method won't query the device properties to build a cache, so functions that depend on this functionality might crash.
		 * @param device -
		 * @return the created VirtualDevice
		 */
		public static VirtualDevice of(VkDevice device) {
			return new VirtualDevice(null, device);
		}
	};
	/**
	 * A QueueFamily, of which Queues can be created. All Queues of this family have the same properties.
	 * @param flags the flags of this Queuefamily
	 * @param flags_hasGB true if {@link VK10#VK_QUEUE_GRAPHICS_BIT} is set in flags
	 * @param flags_hasCB true if {@link VK10#VK_QUEUE_COMPUTE_BIT} is set in flags
	 * @param flags_hasTB true if {@link VK10#VK_QUEUE_TRANSFER_BIT} is set in flags
	 * @param flags_hasSB true if {@link VK10#VK_QUEUE_SPARSE_BINDING_BIT} is set in flags
	 * @param flags_hasPB true if {@link VK11#VK_QUEUE_PROTECTED_BIT} is set in flags
	 * @param maxQueueCount the amount of queues this family has
	 * @param timestampValidBits timestampValidBits
	 */
	public record QueueFamily(int flags, boolean flags_hasGB, boolean flags_hasCB, boolean flags_hasTB, boolean flags_hasSB, boolean flags_hasPB, int maxQueueCount, int timestampValidBits) {};
	/**
	 * Properties of a {@link Device}s memory. All arrays are the same size and contain a value for each Device memory
	 * @param size_bytes the sizes
	 * @param size_megabytes the sizes in megabytes
	 * @param type_index the heap index
	 * @param type_flags the propertyFlags
	 */
	public record MemoryProperties(long[] size_bytes, double[] size_megabytes, int[] type_index, int[] type_flags) {};
	
	/**
	 * When creating a new VulkanInstance, the current API-version is used. If you ever wish to select a specific API-version, you can set it here.
	 * Default is '-1'
	 */
	public static int VULKAN_API_VERSION_OVERWRITE = -1;
	
	/**
	 * A list of all {@link VirtualDevice}s that have been created using {@link #getDevice(Device, int[], String, String)}. They will be destroyed with this instance.
	 */
	public final List<VirtualDevice> cachedDevices = new ArrayList<>();
	
	/**
	 * Creates a new {@link VirtualDevice}. This device will be governed by this instance.
	 * @param device the base device
	 * @param queueFamilyIndex the index of the queueFamily
	 * @param features the features
	 * @param Extensions any extensions
	 * @return the created VirtualDevice.
	 */
	public VirtualDevice getDevice(Device device, int[] queueFamilyIndex, String features, String...Extensions) {
		var d = VulkanTools.createDevice(device, queueFamilyIndex, features, Extensions);
		cachedDevices.add(d);
		return d;
	}
	
	/**
	 * Higher means presumably better performance
	 * @param d the device
	 * @return the score, higher means better suited
	 */
	public static double calculateCardScore_GAME(Device d) {
		double score = 0;
		for(int l = 0; l < d.memory.size_bytes.length; l++)
			score += d.memory.size_megabytes[l]*0.01;
		score += d.p.apiVersion()*0.0001;
		score += switch(d.p.deviceType()) {
		case VK13.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU: yield 5000;
		case VK13.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU: yield 2000;
		case VK13.VK_PHYSICAL_DEVICE_TYPE_CPU: yield -16000;
		default:yield 0;};
		return score;
	}
	/**
	 * Higher means presumably better for GUI-applications, etc..
	 * @param d the device
	 * @return the score, higher means better suited
	 */
	public static double calculateCardScore_GUI(Device d) {
		double score = 0;
		for(int l = 0; l < d.memory.size_bytes.length; l++)
			score += d.memory.size_megabytes[l]*0.001;
		score += d.p.apiVersion()*0.00001;
		score += switch(d.p.deviceType()) {
		case VK13.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU: yield -5000;
		case VK13.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU: yield 4000;
		case VK13.VK_PHYSICAL_DEVICE_TYPE_CPU: yield -16000;
		default:yield 0;};
		return score;
	}
	/**
	 * Creates a new VulkanInstance, which is the way you interact with Vulkan.
	 * The API-version is the instance-version. Set 'VulkanInstance.VULKAN_API_VERSION_OVERWRITE' to change that behavior.
	 * You should need only one VulkanInstance for your application. By default GLFWs required instance extensions are included.
	 * @param engineName the name of the Engine
	 * @param engineVersionMayor mayor version
	 * @param engineVersionMinor minor version
	 * @param engineVersionPatch patch
	 * @param appName name of the Application
	 * @param appVersionMayor mayor version
	 * @param appVersionMinor minor version
	 * @param appVersionPatch patch
	 * @param extensions requested extensions
	 * @return the newly created VulkanInstance
	 */
	public static VulkanInstance create(String engineName, int engineVersionMayor, int engineVersionMinor, int engineVersionPatch, String appName, int appVersionMayor, int appVersionMinor, int appVersionPatch, String...extensions) {
		int[] res = new int[1];
		VK13.vkEnumerateInstanceVersion(res);
		return VulkanTools.createVulkanInstance(appName, engineVersionMayor, engineVersionMinor, engineVersionPatch, engineName, appVersionMayor, appVersionMinor, appVersionPatch, extensions, true, VULKAN_API_VERSION_OVERWRITE == -1 ? res[0]:VULKAN_API_VERSION_OVERWRITE);
	}
	ValidationLayer[] ValidationLayers;
	
	Device[] graphicsDevices;
	VkInstance instance;
	int apiVersion;
	
	VulkanInstance() {
		
	}
	/**
	 * Frees any resources held back by this VulkanInstance
	 */
	public void free() {
		for(VirtualDevice d : cachedDevices)
			VK13.vkDestroyDevice(d.device(), null);
		for(Device d : graphicsDevices)
			d.free();
		VK13.vkDestroyInstance(instance, null);
	}
	
	/**
	 * {@return the API-version of this VulkanInstance}
	 */
	public int getApiVersion() {
		return apiVersion;
	}
	/**
	 * {@return an array of {@link Device}s that are available for use}
	 */
	public Device[] getDevices() {
		return graphicsDevices;
	}
	/**
	 * {@return lwjgl's VkInstance}
	 */
	public VkInstance getInstance() {
		return instance;
	}
	/**
	 * Finds the corresponding {@link Device}.
	 * @param device -
	 * @return the device, null if not found (should never be the case!)
	 */
	public Device getMatching(VkDevice device) {
		for(int i = 0; i < graphicsDevices.length; i++) {
			if(device.getPhysicalDevice().equals(graphicsDevices[i].device))
				return graphicsDevices[i];
		}
		return null;
	}
	/**
	 * {@return an array of {@link ValidationLayer}s that are available for use}
	 */
	public ValidationLayer[] getValidationLayers() {
		return ValidationLayers;
	}
	/**
	 * Tries to guess the best Device for heavy Graphics applications like Games, etc..
	 * @return the index of the Device
	 */
	public int guessDevice_GAME() {
		int res = 0;
		for(int i = 1; i < graphicsDevices.length; i++) {
			Device current = graphicsDevices[res];
			Device prop = graphicsDevices[i];
			if(calculateCardScore_GAME(current)<calculateCardScore_GAME(prop))
				res = i;
		}
		return res;
	}
	/**
	 * Tries to guess the best Device for things like User-Interfaces, etc..
	 * @return the index of the Device.
	 */
	public int guessDevice_GUI() {
		int res = 0;
		for(int i = 1; i < graphicsDevices.length; i++) {
			Device current = graphicsDevices[res];
			Device prop = graphicsDevices[i];
			if(calculateCardScore_GUI(current)<calculateCardScore_GUI(prop))
				res = i;
		}
		return res;
	}

}
