package Kartoffel.Licht.AGGraphics;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.vulkan.KHRSurface;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkQueue;
import org.lwjgl.vulkan.VkSurfaceCapabilitiesKHR;

import Kartoffel.Licht.Vulkan.Allocator;
import Kartoffel.Licht.Vulkan.Buffer;
import Kartoffel.Licht.Vulkan.ComputePipeline;
import Kartoffel.Licht.Vulkan.Descriptor;
import Kartoffel.Licht.Vulkan.DescriptorData;
import Kartoffel.Licht.Vulkan.DescriptorData.ddBuffer;
import Kartoffel.Licht.Vulkan.DescriptorData.ddImage;
import Kartoffel.Licht.Vulkan.DescriptorPool;
import Kartoffel.Licht.Vulkan.DescriptorPool.DescriptorSet;
import Kartoffel.Licht.Vulkan.DescriptorPool.descriptorPoolSize;
import Kartoffel.Licht.Vulkan.DescriptorSetLayout;
import Kartoffel.Licht.Vulkan.GraphicsPipeline;
import Kartoffel.Licht.Vulkan.GraphicsPipeline.GraphicsPipelineInfo;
import Kartoffel.Licht.Vulkan.Image;
import Kartoffel.Licht.Vulkan.PipelineLayout;
import Kartoffel.Licht.Vulkan.PipelineLayout.PushConstant;
import Kartoffel.Licht.Vulkan.RenderPass;
import Kartoffel.Licht.Vulkan.RenderPass.renderAttachment;
import Kartoffel.Licht.Vulkan.RenderPass.subpass;
import Kartoffel.Licht.Vulkan.Sampler;
import Kartoffel.Licht.Vulkan.ShaderCompiler;
import Kartoffel.Licht.Vulkan.ShaderModule;
import Kartoffel.Licht.Vulkan.ShaderStage;
import Kartoffel.Licht.Vulkan.VulkanBufferUtils;
import Kartoffel.Licht.Vulkan.VulkanFreeable;
import Kartoffel.Licht.Vulkan.VulkanInstance;
import Kartoffel.Licht.Vulkan.VulkanInstance.Device;
import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;
import Kartoffel.Licht.Vulkan.VulkanTools;
import Kartoffel.Licht.Vulkan.Impls.Allocator_Vma_Impl;
import Kartoffel.Licht.Vulkan.Impls.ShaderCompiler_Shaderc_Impl;

/**
 * A AGVGraphics object is a simple implementation, allowing using Vulkan to draw to a surface.
 * Contains an {@link Allocator}, a {@link VirtualDevice}, a {@link VkQueue} and various other objects for displaying (eg. Semaphores and Fences), all of
 * which are governed by the AGVGraphics object.
 * Requests/Requires one queue supporting graphics and compute.
 */
public class AGVGraphics implements VulkanFreeable{
	
	private static ConcurrentHashMap<AGVGraphics, StackTraceElement[]> active = new ConcurrentHashMap<AGVGraphics, StackTraceElement[]>();
	static {
		Runtime.getRuntime().addShutdownHook(new Thread(()->{
			active.forEach((b, a)->{
				System.err.println("Warning, unclosed AGVGraphics-Object! " + b);
				for(int i = 3; i < a.length; i++)
					System.err.println(String.valueOf(new char[i])+a[i].toString());
			});
		}));
	}
	
	public class Window{
		int width; //Generally, the width and height declared here are the actual width and height, and should be used by the application.
		int height; //The width and height in the canvas might be bigger than the actual size.
		long glfwHandle;
		AGVGraphics parent;
		AGCanvasDisplay canvas;
		boolean isTransparent;
		
		Window() {
			
		}
		
		/**
		 * Resizes the viewport Buffers, with some mercy
		 * @param width the new width
		 * @param height the new height
		 */
		public void resizeDisplayBuffers(int width, int height) {
			if(width == 0 || height == 0)
				throw new RuntimeException("Width or Height can't be 0!");
			this.width = width;
			this.height = height;
			if(!(width < canvas.getWidth()-MERCY_PIXELS*2 || height < canvas.getHeight()-MERCY_PIXELS*2 || width > canvas.getWidth() || height > canvas.getHeight()))
				return;
			VkSurfaceCapabilitiesKHR c = VkSurfaceCapabilitiesKHR.calloc();
			KHRSurface.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(canvas.getPhysicalDevice(), canvas.getWindowSurface(), c);
			int nw = Math.max(c.minImageExtent().width(), Math.min(c.maxImageExtent().width(), width+MERCY_PIXELS));
			int nh = Math.max(c.minImageExtent().height(), Math.min(c.maxImageExtent().height(), height+MERCY_PIXELS));
			c.free();
			canvas.resize(nw, nh);
		}
		
		/**
		 * {@return the width}
		 */
		public int getWidth() {
			return width;
		}
		/**
		 * {@return the height}
		 */
		public int getHeight() {
			return height;
		}
		/**
		 * {@return the canvas}
		 */
		public AGCanvasDisplay getCanvas() {
			return canvas;
		}
		/**
		 * {@return the glfwHandle}
		 */
		public long getGlfwHandle() {
			return glfwHandle;
		}
		/**
		 * {@return the parent}
		 */
		public AGVGraphics getParent() {
			return parent;
		}
		
	}
	
	/**
	 * Creates a new AGVGraphics object and all necessary components.
	 * @param window the window to bind to, creates a new window if null
	 * @param transparentWindow if true, requests Vulkan to make the window transparent
	 * @param ShaderCompiler implementation to use, uses default if null
	 * @param instance the {@link VulkanInstance}, or creates a default one if null
	 * @param deviceIndex the index of the {@link Device} of this {@link VulkanInstance} to use
	 * @param extensions any extensions to request from the {@link VirtualDevice} created
	 * @return the created AVGGraphic-instance
	 */
	public static AGVGraphics create(ShaderCompiler ShaderCompiler, VulkanInstance instance, int deviceIndex, String...extensions) {
		VulkanInstance vi = instance == null ? VulkanInstance.create("engine", 1, 0, 0, "app", 1, 0, 0) : instance;
		return new AGVGraphics(ShaderCompiler == null ? new ShaderCompiler_Shaderc_Impl(true) : ShaderCompiler, vi, vi.getDevices()[deviceIndex], extensions);
	}
	/**
	 * Shortcut, creates a new {@link ddBuffer}
	 * @param b the buffer
	 * @param type the type
	 * @return the created ddBuffer
	 */
	public static ddBuffer db(Buffer b, int type) {
		return new ddBuffer(b, 0, (int) b.memory().getMemorySize(), type);
	}
	/**
	 * Shortcut, creates a new {@link ddBuffer}.
	 * @param b the buffer
	 * @param offset the offset into the buffer
	 * @param size the buffer size, -1 for remaining size
	 * @param type the type, eg. {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER}
	 * @return the created ddBuffer
	 */
	public static ddBuffer db(Buffer b, int offset, int size, int type) {
		return new ddBuffer(b, offset, size == -1 ? ((int) b.memory().getMemorySize()-offset) : size, type);
	}
	/**
	 * Shortcut, creates a new {@link ddImage}.
	 * @param t the texture
	 * @param sampler the sampler
	 * @param type the type, eg. {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}
	 * @return the created ddImage
	 */
	public static ddImage di(AGTexture t, Sampler sampler, int type) {
		return new ddImage(t.getImage(), t.getImagelayout(), t.getImageview(), sampler, type);
	} 
	
	/**
	 * Shortcut, creates a new {@link descriptorPoolSize}.
	 * @param type the type, eg. {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER}
	 * @param size the size
	 * @return the created descriptorPoolSize
	 */
	public static descriptorPoolSize dps(int type, int size) {
		return new descriptorPoolSize(type, size);
	}
	/**
	 * Shortcut, creates a new {@link Descriptor}.
	 * @param binding the binding
	 * @param type the type, eg. {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER}
	 * @param stage the stage, eg. {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT}
	 * @return the created descriptor
	 */
	public static Descriptor d(int binding, int type, int stage) {
		return new Descriptor(binding, type, stage);
	}
	
	/**
	 * The pixels that will bee included as a buffer on window size increase when the current window image is too small. Window buffer will shrink when size is below buff_size-MERCY_PIXELS*2
	 */
	public static int MERCY_PIXELS = 15;
	
	private List<Window> registeredWindows = new ArrayList<AGVGraphics.Window>();
	
	private VulkanInstance vulkaninstance;
	private VirtualDevice device;
	private long commandPool;
	private VkQueue mainQueue;
	private Allocator allocator;
	private VulkanBufferUtils utils;
	private ShaderCompiler ShaderCompiler;
	
	private String deviceFeatures = "samplerAnisotropy;";
	private String extensions = "VK_KHR_swapchain;";
	
	private RenderPass defaultRenderpass; //Might be null
	
//	private int width, height;
	
	/**
	 * private constructor
	 * @param window w
	 * @param transparentWindow t
	 * @param ShaderCompiler s
	 * @param instance i
	 * @param pdevice p
	 * @param extensions e
	 */
	AGVGraphics(ShaderCompiler ShaderCompiler, VulkanInstance instance, Device pdevice, String...extensions) {
		active.put(this, Thread.currentThread().getStackTrace());
		this.vulkaninstance = instance;
		String[] ex = new String[extensions.length+1];
		System.arraycopy(extensions, 0, ex, 0, extensions.length);
		ex[extensions.length] = "VK_KHR_swapchain"; //Hardcoded Swapchain Extension
		int queueFamily = pdevice.getQueueFamilyIndex(1, VK13.VK_QUEUE_GRAPHICS_BIT|VK13.VK_QUEUE_COMPUTE_BIT); //Graphics and compute for this simple implementation.
		this.device = instance.getDevice(pdevice, new int[] {queueFamily}, deviceFeatures, ex);
		commandPool = VulkanTools.createCommandPool(device.device(), queueFamily);
		mainQueue = VulkanTools.getQueue(device.device(), queueFamily, 0);
		this.allocator = new Allocator_Vma_Impl(instance.getInstance(), this.device.device(), instance.getApiVersion(), 0);
		this.ShaderCompiler = ShaderCompiler;
		this.utils = new VulkanBufferUtils(allocator, commandPool, mainQueue);
	}
	
	public Window createWindow(long glfwHandle, boolean transparent) {
		if(defaultRenderpass == null)
			defaultRenderpass = AGCanvasDisplay.createDefaultRenderpass(device);
		return createWindow(glfwHandle, transparent, defaultRenderpass);
	}
	public Window createWindow(long glfwHandle, boolean transparent, RenderPass renderpass) {
		Window res = new Window();
		if(glfwHandle == 0) {
			GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_NO_API);
			glfwHandle = GLFW.glfwCreateWindow(512, 513, "Window#"+res.hashCode(), 0, 0);
		}
		res.isTransparent = transparent;
		res.canvas = new AGCanvasDisplay(renderpass, allocator, vulkaninstance.getInstance(), glfwHandle, device.device(), 0, 0, transparent, device.physicalDevice().device()); //Use default image formats
		int[] ai1 = new int[1];
		int[] ai2 = new int[1];
		GLFW.glfwGetWindowSize(glfwHandle, ai1, ai2);
		res.width = ai1[0];
		res.height = ai2[0];
		res.glfwHandle = glfwHandle;
		res.parent = this;
		registeredWindows.add(res);
		return res;
	}
	
	public void destroyWindow(Window window) {
		window.canvas.free();
		registeredWindows.remove(window);
	}
	
//	boolean check = false; //Check for proper WindowRenderpass usage
	
//	/**
//	 * Begins the Window {@link RenderPass}. In this pass, things will be rendered to the display.
//	 * @param drawer the drawer to use
//	 */
//	public void beginWindowRenderpass(AGDrawer drawer) {
//		if(check)
//			throw new RuntimeException("Display already in use!");
//		if(drawer.recordingRenderpassType != 0)
//			throw new RuntimeException("Drawer already in use!");
//		check = true;
//		display.bindToWindow((AGDrawer) drawer);
//	}
//	/**
//	 * Ends the Window {@link RenderPass}. In this pass, things will be rendered to the display.
//	 */
//	public void endWindowRenderpass() {
//		if(!check)
//			throw new RuntimeException("Display not in use!");
//		display.endBindToWindow();
//		check = false;
//	}
	
	
	/**
	 * Displays the rendered Image.
	 */
//	public void display() {
//		if(!check)
//			throw new RuntimeException("endRender called before beginRender(). Did you forget to call beginRender()?");
//		check = false;
//		display.submitDisplay(mainQueue);
//	}
	
	/**
	 * {@return a new {@link AGDrawer}}
	 */
	public AGDrawer createDrawer() {
		return new AGDrawer(device.device(), mainQueue, VulkanTools.createFence(device.device(), true), VulkanTools.createCommandBuffer(device.device(), commandPool), commandPool);
	}
	
	
//	/**
//	 * Sets the Clear color of the Display
//	 * @param index the index, normally 0
//	 * @param clearColor a {@link Vector4f} (xyzw corresponding to rgba)
//	 */
//	public void setClearColor(int index, Vector4f clearColor) {
//		display.getClearColors()[index].set(clearColor);
//	}
//	/**
//	 * Sets the Clear color of the Display
//	 * @param index the index, normally 0
//	 * @param r the red component, from 0-1
//	 * @param g the green component, from 0-1
//	 * @param b the blue component, from 0-1
//	 * @param a the alpha component, from 0-1
//	 */
//	public void setClearColor(int index, float r, float g, float b, float a) {
//		display.getClearColors()[index].set(r, g, b, a);
//	}
	
	@Override
	public void free() {
		waitUntilIdle();
		VK13.vkDestroyCommandPool(device.device(), commandPool, null);
		while(!registeredWindows.isEmpty())
			destroyWindow(registeredWindows.get(0));
		defaultRenderpass.free();
		allocator.free();
		ShaderCompiler.free();
		active.remove(this);
	}
	/**
	 * Waits until the device is idle.
	 */
	public void waitUntilIdle() {
		VK13.vkDeviceWaitIdle(device.device());
	}
	
	/**
	 * Creates a new Shader Module.
	 * @param source the source code of the compilers language
	 * @param name the name of the shader
	 * @param entrypoint the entrypoint of the shader
	 * @param type the type of the shader, eg. {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT}
	 * @return the created {@link ShaderModule}
	 * @see #getShaderCompiler()
	 */
	public ShaderModule createShaderModule(String source, String name, String entrypoint, int type) {
		byte[] data = ShaderCompiler.compile(source, type, name, entrypoint);
		if(data == null)
			throw new NullPointerException("ShaderCompiler returned null!");
		var res = VulkanTools.createShaderModule(device, data);
		return res;
	}
	/**
	 * Creates a new Shader Module.
	 * @param data the spir-V binary data
	 * @param name the name of this shader
	 * @return the created {@link ShaderModule}
	 */
	public ShaderModule createShaderModule(byte[] data, String name) {
		if(data == null)
			throw new NullPointerException("Data is null!");
		var res = VulkanTools.createShaderModule(device, data);
		return res;
	}
	/**
	 * Creates a new (Graphics-)Pipeline (Shader).
	 * @param modules the modules to include
	 * @param descriptors the descriptors of this shader
	 * @param info information about the Graphics pipeline
	 * @param renderPass the {@link RenderPass} this pipeline will use (how to output pixels, etc..)
	 * @return the created shader
	 */
	public AGShader createShaderPipeline(ShaderStage[] modules, Descriptor[][] descriptors, PushConstant[] constants, GraphicsPipelineInfo info, RenderPass renderPass) {
		DescriptorSetLayout[] dlayouts = new DescriptorSetLayout[descriptors.length];
		for(int set = 0; set < descriptors.length; set++) {
			int[] binding = new int[descriptors[set].length];
			int[] type = new int[descriptors[set].length];
			int[] stage = new int[descriptors[set].length];
			for(int b = 0; b < descriptors[set].length; b++) {
				binding[b] = descriptors[set][b].binding();
				type[b] = descriptors[set][b].type();
				stage[b] = descriptors[set][b].stage();
			}
				
			dlayouts[set] = VulkanTools.createDescriptorSetLayout(device, binding, type, stage);
		}
		GraphicsPipeline graphicspipeline = VulkanTools.createGraphicsPipeline(modules, device, dlayouts, constants, info, renderPass, 0);
		return new AGShader(graphicspipeline, device, dlayouts, descriptors);
	}
	
	/**
	 * Creates a new (Graphics-)Shader.
	 * @param vertexSource the vertex source
	 * @param fragmentSource the fragment source
	 * @param descriptors the descriptors of this shader
	 * @param info information about the Graphics pipeline
	 * @param renderPass the {@link RenderPass} this pipeline will use (how to output pixels, etc..)
	 * @return the created shader
	 */
	public AGShader createShaderPipeline(String vertexSource, String fragmentSource, Descriptor[][] descriptors, PushConstant[] constants, GraphicsPipelineInfo info, RenderPass renderPass) {
		ShaderModule vertex = createShaderModule(vertexSource, "(Vertex)", "main", VK13.VK_SHADER_STAGE_VERTEX_BIT);
		ShaderModule fragment = createShaderModule(fragmentSource, "(Fragment)", "main", VK13.VK_SHADER_STAGE_FRAGMENT_BIT);
		AGShader shader = createShaderPipeline(new ShaderStage[] {ShaderStage.of(vertex, "main", VK13.VK_SHADER_STAGE_VERTEX_BIT), ShaderStage.of(fragment, "main", VK13.VK_SHADER_STAGE_FRAGMENT_BIT)}, descriptors, constants, info, renderPass);
		vertex.free();
		fragment.free();
		return shader;
	}
	/**
	 * Creates a compute Shader.
	 * @param module the module
	 * @param descriptors the descriptors of this shader
	 * @return the created shader
	 */
	public AGShader createComputeShaderPipeline(ShaderStage module, Descriptor[][] descriptors, PushConstant[] constants) {
		DescriptorSetLayout[] dlayouts = new DescriptorSetLayout[descriptors.length];
		for(int set = 0; set < descriptors.length; set++) {
			int[] binding = new int[descriptors[set].length];
			int[] type = new int[descriptors[set].length];
			int[] stage = new int[descriptors[set].length];
			for(int b = 0; b < descriptors[set].length; b++) {
				binding[b] = descriptors[set][b].binding();
				type[b] = descriptors[set][b].type();
				stage[b] = descriptors[set][b].stage();
			}
				
			dlayouts[set] = VulkanTools.createDescriptorSetLayout(device, binding, type, stage);
		}
		PipelineLayout pipelineLayout = VulkanTools.createPipeLineLayout(device, dlayouts, constants);
		ComputePipeline computepipeline = VulkanTools.createComputePipeline(module, device, pipelineLayout);
		return new AGShader(computepipeline, device, dlayouts, descriptors);
	}
	/**
	 * Creates a new Canvas
	 * @param width the width
	 * @param height the height
	 * @param attachmentInfos attachmentInfos
	 * @param attachements attachements
	 * @param subpasses subpasses
	 * @return the created Canvas
	 */
	public AGCanvasImage createCanvas(int width, int height, renderAttachment[] attachmentInfos, AGTexture[][] attachements, subpass[] subpasses) {
		return new AGCanvasImage(vulkaninstance.getInstance(), device.device(), width, height, attachmentInfos, subpasses, attachements);
	}
	/**
	 * Creates a new {@link DescriptorPool}
	 * @param sizes the sizes
	 * @param maxSets the amount of sets this pool will be supporting
	 * @return the created DescriptorPool
	 */
	public DescriptorPool createDescriptorPool(DescriptorPool.descriptorPoolSize[] sizes, int maxSets) {
		int[] types = new int[sizes.length];
		int[] counts = new int[sizes.length];
		for(int i = 0; i < sizes.length; i++) {
			types[i] = sizes[i].type();
			counts[i] = sizes[i].count();
		}
		var pool = VulkanTools.createDescriptorPool(device, types, counts, maxSets);
		return pool;
	}
	/**
	 * Creates a descriptor set for each layout.
	 * @param pool the pool to create them from
	 * @param descriptorLayouts the layouts of each
	 * @return a descriptor set array for each
	 */
	public DescriptorSet[] createDescriptorSets(DescriptorPool pool, DescriptorSetLayout...descriptorLayouts) {
		long[] ids = VulkanTools.allocateDescriptorSets(device.device(), pool, descriptorLayouts);
		DescriptorSet[] sets = new DescriptorSet[ids.length];
		for(int i = 0; i < ids.length; i++)
			sets[i] = new DescriptorSet(ids[i]);
		return sets;
	}
	/**
	 * Sets the {@link DescriptorSet}
	 * @param set the set to set
	 * @param descriptors the data to set
	 */
	public void setDataOfDescriptorSet(DescriptorSet set, DescriptorData...descriptors) {
		VulkanTools.setDescriptorSets(device, new DescriptorSet[] {set}, new DescriptorData[][] {descriptors});
	}
	
	/**
	 * Initial layout is VK_IMAGE_LAYOUT_UNDEFINED
	 * @param type the type
	 * @param sizeX the width
	 * @param sizeY the height
	 * @return the created {@link AGTexture}
	 */
	public AGTexture generateTexture2D(int type, int sizeX, int sizeY) {
		Image image = VulkanTools.createImage(allocator, sizeX, sizeY, 1, 1, 1, type, VK13.VK_IMAGE_TILING_OPTIMAL, VK13.VK_IMAGE_LAYOUT_UNDEFINED,
				VK13.VK_IMAGE_USAGE_SAMPLED_BIT | VK13.VK_IMAGE_USAGE_TRANSFER_DST_BIT, VK13.VK_SHARING_MODE_EXCLUSIVE, 0,
				VK13.VK_SAMPLE_COUNT_1_BIT, VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT,0); //VK13.VK_FORMAT_R8G8B8A8_SRGB
		long imageView = VulkanTools.createImageView(image, type, VK13.VK_IMAGE_VIEW_TYPE_2D, VK13.VK_IMAGE_ASPECT_COLOR_BIT);
		return new AGTexture(image, imageView, VK13.VK_IMAGE_LAYOUT_UNDEFINED, device.device(), sizeX, sizeY);
	}
//	/**
//	 * Initial layout is VK_IMAGE_LAYOUT_UNDEFINED
//	 * @param type the type
//	 * @param sizeX the width
//	 * @param sizeY the height
//	 * @param usage the usage
//	 * @param memProp the memory properties
//	 * @param deviceLocal if the texture should be device local
//	 * @param hostCoherent if the texture should be host coherent
//	 * @param hostVisible if the texture should be host visible
//	 * @return the created {@link AGTexture}
//	 */
//	public AGTexture generateTexture2D(int type, int sizeX, int sizeY, int usage, int memProp, boolean deviceLocal, boolean hostCoherent, boolean hostVisible) {
//		Image image = VulkanTools.createImage(allocator, sizeX, sizeY, type, usage, memProp| (deviceLocal ? VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT : 0) | (hostVisible ? VK13.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT : 0) | (hostCoherent ? VK13.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT : 0),0); //VK13.VK_FORMAT_R8G8B8A8_SRGB
//		long imageView = VulkanTools.createImageView(image, type, VK13.VK_IMAGE_VIEW_TYPE_2D, VK13.VK_IMAGE_ASPECT_COLOR_BIT);
//		return new AGTexture(image, imageView, VK13.VK_IMAGE_LAYOUT_UNDEFINED, device.device(), sizeX, sizeY);
//	}
	/**
	 * Initial layout is VK_IMAGE_LAYOUT_UNDEFINED
	 * @param type the type
	 * @param sizeX the width
	 * @param sizeY the height
	 * @param usage the usage
	 * @param memProp the memory properties
	 * @param memPropPreffered the preferred memory properties
	 * @param aspectBit the aspect Bit of the imageView, eg {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT}
	 * @return the created {@link AGTexture}
	 */
	public AGTexture generateTexture2D(int type, int sizeX, int sizeY, int usage, int memProp, int memPropPreferred, int aspectBit) {
		Image image = VulkanTools.createImage(allocator, sizeX, sizeY, 1, 1, 1, type, VK13.VK_IMAGE_TILING_OPTIMAL, VK13.VK_IMAGE_LAYOUT_UNDEFINED, usage, VK13.VK_SHARING_MODE_EXCLUSIVE, 0, VK13.VK_SAMPLE_COUNT_1_BIT, memProp, memPropPreferred); //VK13.VK_FORMAT_R8G8B8A8_SRGB
		long imageView = VulkanTools.createImageView(image, type, VK13.VK_IMAGE_VIEW_TYPE_2D, aspectBit);
		return new AGTexture(image, imageView, VK13.VK_IMAGE_LAYOUT_UNDEFINED, device.device(), sizeX, sizeY);
	}
	/**
	 * Creates a new Texture sampler
	 * @param magfLin if true, the magnification is 'linear', 'closest' otherwise
	 * @param minfLin if true, the magnification is 'linear', 'closest' otherwise
	 * @param addressModeU eg. {@link VK10#VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT}
	 * @param addressModeV eg. {@link VK10#VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT}
	 * @param addressModeW eg. {@link VK10#VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT}
	 * @param anistrophy the anistrophy
	 * @return the created Sampler
	 */
	public Sampler generateTextureSampler(boolean magfLin, boolean minfLin, int addressModeU, int addressModeV, int addressModeW, float anistrophy) {
		long address = VulkanTools.createImageSampler(device.device(), magfLin, minfLin, addressModeU, addressModeV, addressModeW, anistrophy);
		return new Sampler(device.device(), address); 
	}
	
	/**
	 * Fills the given region with the given data.<br>
	 * -Transitions the texture to appropriate format
	 * -Copies the data to the texture
	 * -Transitions the texture back to original format
	 * @param texture2d the destination
	 * @param data the data
	 * @param width the width
	 * @param height the height
	 * @param x the x
	 * @param y the y
	 */
	public void putTexture2D(AGTexture texture2d, ByteBuffer data, int width, int height, int x, int y) {
		int oa = (int) texture2d.getImagelayout();
		int ob = texture2d.getAccessMask();
		int oc = texture2d.getStage();
		
		Buffer tempBuff = VulkanTools.createBuffer(allocator, data.capacity(), VK13.VK_BUFFER_USAGE_TRANSFER_SRC_BIT, VK13.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK13.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT, 0);
		utils.fillBuffer(tempBuff, data, 0, 0, data.capacity());
		
		VulkanTools.transitionImageLayout(texture2d.getImage(), 0, (int) texture2d.getImagelayout(), VK13.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, commandPool, mainQueue, texture2d.getAccessMask(),
				VK13.VK_ACCESS_TRANSFER_WRITE_BIT, texture2d.getStage(), VK13.VK_PIPELINE_STAGE_TRANSFER_BIT);
		VulkanTools.copyBuffer2Image(tempBuff, texture2d.getImage(), x, y, width, height, commandPool, mainQueue);
		VulkanTools.transitionImageLayout(texture2d.getImage(), 0, VK13.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, oa, commandPool, mainQueue,
				VK13.VK_ACCESS_TRANSFER_WRITE_BIT, ob, VK13.VK_PIPELINE_STAGE_TRANSFER_BIT, oc);
		
		tempBuff.free();
	}
	/**
	 * Fills the given region with the given data.<br>
	 * -Transitions the texture to appropriate format
	 * -Copies the data to the texture
	 * -Transitions the texture back to original format
	 * @param texture2d the texture
	 * @param data the data
	 * @param width the width
	 * @param height the height
	 * @param x the x
	 * @param y the y
	 */
	public void putTexture2D(AGTexture texture2d, Buffer data, int width, int height, int x, int y) {
		int oa = (int) texture2d.getImagelayout();
		int ob = texture2d.getAccessMask();
		int oc = texture2d.getStage();
		VulkanTools.transitionImageLayout(texture2d.getImage(), 0, (int) texture2d.getImagelayout(), VK13.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, commandPool, mainQueue, texture2d.getAccessMask(),
				VK13.VK_ACCESS_TRANSFER_WRITE_BIT, texture2d.getStage(), VK13.VK_PIPELINE_STAGE_TRANSFER_BIT);
		VulkanTools.copyBuffer2Image(data, texture2d.getImage(), x, y, width, height, commandPool, mainQueue);
		VulkanTools.transitionImageLayout(texture2d.getImage(), 0, VK13.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, oa, commandPool, mainQueue,
				VK13.VK_ACCESS_TRANSFER_WRITE_BIT, ob, VK13.VK_PIPELINE_STAGE_TRANSFER_BIT, oc);
	}
	/**
	 * Transitions the texture using a single-use command buffer to the new format.
	 * @param texture2d the texture
	 * @param newLayout the layout
	 * @param newAccessMask the accessMask
	 * @param newStage the new stage
	 */
	public void transitionTexture(AGTexture texture2d, int newLayout, int newAccessMask, int newStage) {
		VulkanTools.transitionImageLayout(texture2d.getImage(), 0, (int) texture2d.getImagelayout(), newLayout, commandPool, mainQueue, texture2d.getAccessMask(), newAccessMask, texture2d.getStage(), newStage);
		texture2d.setImagelayout(newLayout);
		texture2d.setAccessMask(newAccessMask);
		texture2d.setStage(newStage);
	}
	
	/**
	 * {@return a unmodifiable set containing all currently active windows}
	 */
	public Set<Window> getWindows() {
		return Set.copyOf(registeredWindows);
	}
	
	/**
	 * Sets the device features
	 * @param deviceFeatures the features to set
	 */
	public void setDeviceFeatures(String deviceFeatures) {
		this.deviceFeatures = deviceFeatures;
	}
	/**
	 * {@return the Device Features}
	 */
	public String getDeviceFeatures() {
		return deviceFeatures;
	}
	/**
	 * Appends a feature to the list of required device features
	 * @param feature the feature to add
	 */
	public void addDeviceFeature(String feature) {
		deviceFeatures += feature+";";
	}
	/**
	 * Sets the required extensions.
	 * @param extensions the extensions to set
	 */
	public void setExtensions(String extensions) {
		this.extensions = extensions;
	}
	/**
	 * {@return a list of required extensions}
	 */
	public String getExtensions() {
		return extensions;
	}
	/**
	 * Appends an extension to the list of required extensions.
	 * @param extension the extension to add
	 */
	public void addExtension(String extension) {
		extensions += extension+";";
	}
	/**
	 * {@return the {@link VulkanInstance}}
	 */
	public VulkanInstance getVulkaninstance() {
		return vulkaninstance;
	}

	/**
	 * {@return the {@link Device}}
	 */
	public VirtualDevice getDevice() {
		return device;
	}

	/**
	 * {@return the command pool.}
	 */
	public long getCommandPool() {
		return commandPool;
	}

	/**
	 * {@return the Main {@link VkQueue}. Guaranteed to support Graphics and Compute.}
	 */
	public VkQueue getMainQueue() {
		return mainQueue;
	}

	/**
	 * {@return the compiler for shader source code.}
	 */
	public ShaderCompiler getShaderCompiler() {
		return ShaderCompiler;
	}
	/**
	 * {@return the {@link Allocator} used}
	 */
	public Allocator getAllocator() {
		return allocator;
	}
	/**
	 * Sets the {@link Allocator}. Generally, don't do that since things may already got allocated with the old one.
	 * @param allocator the allocator to use
	 */
	public void setAllocator(Allocator allocator) {
		this.allocator = allocator;
	}
	/**
	 * {@return the utils}
	 */
	public VulkanBufferUtils getUtils() {
		return utils;
	}
	
	@Override
	public void close() throws Exception {
		free();
	}

}
