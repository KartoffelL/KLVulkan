package Kartoffel.Licht.AGGraphics;

import org.joml.Vector4f;
import org.lwjgl.glfw.GLFWVulkan;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.KHRSurface;
import org.lwjgl.vulkan.KHRSwapchain;
import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkPhysicalDevice;
import org.lwjgl.vulkan.VkPresentInfoKHR;
import org.lwjgl.vulkan.VkQueue;
import org.lwjgl.vulkan.VkSurfaceCapabilitiesKHR;

import Kartoffel.Licht.Vulkan.Allocator;
import Kartoffel.Licht.Vulkan.Framebuffer;
import Kartoffel.Licht.Vulkan.Image;
import Kartoffel.Licht.Vulkan.RenderPass;
import Kartoffel.Licht.Vulkan.RenderPass.renderAttachment;
import Kartoffel.Licht.Vulkan.RenderPass.subpass;
import Kartoffel.Licht.Vulkan.RenderPass.subpass.Reference;
import Kartoffel.Licht.Vulkan.VulkanFreeable;
import Kartoffel.Licht.Vulkan.VulkanInstance.VirtualDevice;
import Kartoffel.Licht.Vulkan.VulkanTools;


/**
 * An AGDisplay handles everything concerning the swapchain and displaying to a window.
 * Used by AGVGraphics.
 */
public class AGCanvasDisplay implements VulkanFreeable, AGCanvas{
	
	public static RenderPass createDefaultRenderpass(VirtualDevice device) {
		return VulkanTools.createRenderPass(device.device(), new renderAttachment[] {new renderAttachment(colorFormat), new renderAttachment(depthFormat)}, new subpass[] {new subpass(new Reference[] {new Reference(0)}, new Reference(1, VK13.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL))});
	}
	
	/**
	 * The default color format
	 */
	public static int colorFormat = VK13.VK_FORMAT_R8G8B8A8_SRGB;
	/**
	 * The default depth format
	 */
	public static int depthFormat = VK13.VK_FORMAT_D32_SFLOAT;
	
	private int width, height;
	private long swapChain;
	private long[] swapchainImages;
	private Image imageDepthStencil;
	private long[] imageViews;
	private long imageViewDepthStencil;
	private Framebuffer[] frameBuffers;
	private RenderPass renderpass;
	private long semaphoreA;
	private long semaphoreB;
	private long windowSurface;
	private VkDevice device;
	private VkPhysicalDevice mainGPU;
	private VkInstance instance;
	private volatile int curentImage = 0;
	
	private Vector4f[] clearColors = new Vector4f[] {new Vector4f(0, 0, 0, 0.0f), new Vector4f(1)}; //For color and depth
	
	private int compositeAlphaBits = 0;
	private Allocator allocator;
	/**
	 * {@link AGCanvasDisplay} constructor
	 * @param allocator the allocator
	 * @param instance the instance
	 * @param window the window (GLFW)
	 * @param device the device
	 * @param colorFormat the colorFormat, 0 to use the default color format
	 * @param requestTransparentFB the Framebuffer
	 * @param mainGPU the physical device
	 */
	public AGCanvasDisplay(RenderPass renderpasss, Allocator allocator, VkInstance instance, long window, VkDevice device, int colorFormat, int depthFormat, boolean requestTransparentFB, VkPhysicalDevice mainGPU) {
		this.allocator = allocator;
		if(colorFormat == 0)
			colorFormat = AGCanvasDisplay.colorFormat;
		if(depthFormat == 0)
			depthFormat = AGCanvasDisplay.depthFormat;
		
		long[] arrl = new long[1];
		int i = GLFWVulkan.glfwCreateWindowSurface(instance, window, null, arrl);
		if(i != 0) 
			throw new RuntimeException("GLFW Window Surface creation failed! " + i);
		windowSurface = arrl[0];
		renderpass = renderpasss;
		VkSurfaceCapabilitiesKHR c = VkSurfaceCapabilitiesKHR.calloc();
		KHRSurface.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(mainGPU, windowSurface, c);
		this.width = c.currentExtent().width();
		this.height = c.currentExtent().height();
		compositeAlphaBits = c.supportedCompositeAlpha();
		{
			swapChain = VulkanTools.createSwapChain(windowSurface, device, windowSurface, colorFormat, width, height, compositeAlphaBits, 0, 1);
			swapchainImages = VulkanTools.getSwapchainImages(swapChain, device);
			//Depth/Stencil image
			imageDepthStencil = VulkanTools.createImage(allocator, width, height, 1, 1, 1, depthFormat, VK13.VK_IMAGE_TILING_OPTIMAL, VK13.VK_IMAGE_LAYOUT_UNDEFINED, VK13.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, VK13.VK_SHARING_MODE_EXCLUSIVE, 0, VK13.VK_SAMPLE_COUNT_1_BIT, VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT, 0);
			imageViewDepthStencil = VulkanTools.createImageView(imageDepthStencil, depthFormat, VK13.VK_IMAGE_VIEW_TYPE_2D, VK13.VK_IMAGE_ASPECT_DEPTH_BIT);
			//All imageviews
			imageViews = new long[swapchainImages.length];
			for(int d = 0; d < swapchainImages.length; d++)
				imageViews[d] = VulkanTools.createImageView(Image.of(swapchainImages[d], device), colorFormat, VK13.VK_IMAGE_VIEW_TYPE_2D, VK13.VK_IMAGE_ASPECT_COLOR_BIT);
			//All framebuffers
			frameBuffers = new Framebuffer[swapchainImages.length];
			for(int d = 0; d < swapchainImages.length; d++)
				frameBuffers[d] = VulkanTools.createFrameBuffer(renderpass.getAddress(), width, height, device, imageViews[d], imageViewDepthStencil);
		}
		semaphoreA = VulkanTools.createSemaphore(device);
		semaphoreB = VulkanTools.createSemaphore(device);
		this.device = device;
		this.instance = instance;
		this.mainGPU = mainGPU;
		c.free();
	}
	/**
	 * Resizes the display
	 * @param width the width
	 * @param height the height
	 */
	public void resize(int width, int height) { //Does not recreate renderpass, so bugs will appear if the color format changes.
		this.width = width;
		this.height = height;
		{
			VK13.vkDestroyImageView(device, imageViews[0], null);
			VK13.vkDestroyImageView(device, imageViews[1], null);
			VK13.vkDestroyImageView(device, imageViewDepthStencil, null);
			frameBuffers[0].free();
			frameBuffers[1].free();
			imageDepthStencil.free();
			KHRSwapchain.vkDestroySwapchainKHR(device, swapChain, null);
		}
		{
			swapChain = VulkanTools.createSwapChain(windowSurface, device, windowSurface, colorFormat, width, height, compositeAlphaBits, 0, 1);
			swapchainImages = VulkanTools.getSwapchainImages(swapChain, device);
			//Depth/Stencil image
			imageDepthStencil = VulkanTools.createImage(allocator, width, height, 1, 1, 1, depthFormat, VK13.VK_IMAGE_TILING_OPTIMAL, VK13.VK_IMAGE_LAYOUT_UNDEFINED, VK13.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, VK13.VK_SHARING_MODE_EXCLUSIVE, 0, VK13.VK_SAMPLE_COUNT_1_BIT, VK13.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT, 0);
			imageViewDepthStencil = VulkanTools.createImageView(imageDepthStencil, depthFormat, VK13.VK_IMAGE_VIEW_TYPE_2D, VK13.VK_IMAGE_ASPECT_DEPTH_BIT);
			//All imageviews
			imageViews = new long[swapchainImages.length];
			for(int d = 0; d < swapchainImages.length; d++)
				imageViews[d] = VulkanTools.createImageView(Image.of(swapchainImages[d], device), colorFormat, VK13.VK_IMAGE_VIEW_TYPE_2D, VK13.VK_IMAGE_ASPECT_COLOR_BIT);
			//All framebuffers
			frameBuffers = new Framebuffer[swapchainImages.length];
			for(int d = 0; d < swapchainImages.length; d++)
				frameBuffers[d] = VulkanTools.createFrameBuffer(renderpass.getAddress(), width, height, device, imageViews[d], imageViewDepthStencil);
		}
	}
	/**
	 * Tries to acquire the swapchain image. Returns a positive number on success, signaling that the application may continue with the displaying. If negative, the application may try again.
	 * @param timeout the amount of time to wait, setting this to 0 makes this function return instantly. Setting this to Long.MAX_VALUE makes this function wait until a new swapchain image is avaible. Will return the current image index if still valid.
	 * @return the checked image index, -1 if none available
	 */
	public int updateImageIndex(long timeout) {
//		if(curentImage != -1)
//			return curentImage;
		int[] arr = new int[1];
		int res = KHRSwapchain.vkAcquireNextImageKHR(device, swapChain, timeout, semaphoreA, 0, arr);
		if(res == VK13.VK_NOT_READY || res == VK13.VK_TIMEOUT)
			return -1;
//		VulkanTools.check("Could not get next presentable image! ", res);
		curentImage = arr[0];
		return curentImage;
	}
	/**
	 * Submits the {@link AGDrawer} and queues the presentation of the drawn image to the display.
	 * @param mainQueue the queue to use
	 * @throws IllegalStateException if no image is currently active
	 * @return the nanotime passed since the last submit.
	 */
	public long submitDisplay(AGDrawer drawer, VkQueue mainQueue) {
		if(curentImage == -1)
			throw new IllegalStateException("No current image! Did you forget to call updateImageIndex(long)?");
		long res = drawer.submitCommandBuffer(0, new long[] {semaphoreA}, new long[] {semaphoreB}); //Waits till semaphoreA is finished, then signals semaphoreB
		try(MemoryStack stack = MemoryStack.stackPush()) { //Displaying the new Image
			//Presenting
			VkPresentInfoKHR info_present = new VkPresentInfoKHR(stack.calloc(64));
			info_present.sType(KHRSwapchain.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
			info_present.pWaitSemaphores(stack.longs(semaphoreB));
			info_present.pSwapchains(stack.longs(swapChain));
			info_present.swapchainCount(1);
			info_present.pImageIndices(stack.ints(curentImage));
			KHRSwapchain.vkQueuePresentKHR(mainQueue, info_present); //Runs when semaphoreB is signaled (after the commandBuffer is finished)
			curentImage = -1;
		}
		return res;
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
	 * {@return the RenderPass}
	 */
	public RenderPass getRenderpass() {
		return renderpass;
	}
	/**
	 * {@return the Window Surface (GLFW)}
	 */
	public long getWindowSurface() {
		return windowSurface;
	}
	/**
	 * {@return the VkDevice}
	 */
	public VkDevice getDevice() {
		return device;
	}
	/**
	 * {@return the VkPhysicalDevice}
	 */
	public VkPhysicalDevice getPhysicalDevice() {
		return mainGPU;
	}
	/**
	 * {@return the current image}
	 */
	int getCurentImage() { //Not accessible to avoid confusion
		return curentImage;
	}
	/**
	 * {@return the clear colors}
	 */
	public Vector4f[] getClearColors() {
		return clearColors;
	}
	public void free() {
		VK13.vkDestroyImageView(device, imageViews[0], null);
		VK13.vkDestroyImageView(device, imageViews[1], null);
		VK13.vkDestroyImageView(device, imageViewDepthStencil, null);
		frameBuffers[0].free();
		frameBuffers[1].free();
		VK13.vkDestroySemaphore(device, semaphoreA, null);
		VK13.vkDestroySemaphore(device, semaphoreB, null);
		KHRSwapchain.vkDestroySwapchainKHR(device, swapChain, null);
		KHRSurface.vkDestroySurfaceKHR(instance, windowSurface, null);
		imageDepthStencil.free();
	}
	@Override
	public Vector4f[] getClearColors(int index) {
		return clearColors; //Same clearColors for all indexes
	}
	@Override
	public Framebuffer getFramebuffer(int index) {
		return frameBuffers[index];
	}

}
