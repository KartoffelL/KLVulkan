package Kartoffel.Licht.AGGraphics;


import org.lwjgl.vulkan.VK13;
import org.lwjgl.vulkan.VkDevice;

import Kartoffel.Licht.Vulkan.Image;
import Kartoffel.Licht.Vulkan.VulkanFreeable;

/**
 * Contains an Image and an {@link ImageView}
 */
public class AGTexture implements VulkanFreeable{

	private Image image;
	private long imageview;
	private int accessMask = 0;
	private int stage = VK13.VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;
	private int imagelayout;
	private VkDevice device;
	private int width;
	private int height;
	/**
	 * new
	 * @param image a
	 * @param imageView a
	 * @param imagelayout a
	 * @param device a
	 * @param width the width of the texture
	 * @param height the height of the texture
	 */
	public AGTexture(Image image, long imageView, int imagelayout, VkDevice device, int width, int height) {
		super();
		this.image = image;
		this.device = device;
		this.imageview = imageView;
		this.imagelayout = imagelayout;
		this.width = width;
		this.height = height;
	}

	/**
	 * {@return the address of the image}
	 */
	public long address() {
		return image.address();
	}
	/**
	 * {@return the address of the accessMask}
	 */
	public int getAccessMask() {
		return accessMask;
	}
	/**
	 * {@return the device}
	 */
	public VkDevice getDevice() {
		return device;
	}
	/**
	 * {@return the Image}
	 */
	public Image getImage() {
		return image;
	}
	/**
	 * {@return the address of the Image layout}
	 */
	public int getImagelayout() {
		return imagelayout;
	}
	/**
	 * {@return the address of the Image view}
	 */
	public long getImageview() {
		return imageview;
	}
	/**
	 * {@return the address of the stage}
	 */
	public int getStage() {
		return stage;
	}
	/**
	 * setter
	 * @param accessMask new mask
	 */
	void setAccessMask(int accessMask) {
		this.accessMask = accessMask;
	}
	/**
	 * setter
	 * @param imagelayout new imagelayout
	 */
	void setImagelayout(int imagelayout) {
		this.imagelayout = imagelayout;
	}
	/**
	 * setter
	 * @param stage new stage
	 */
	void setStage(int stage) {
		this.stage = stage;
	}
	/**
	 * {@return the height}
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * {@return the width}
	 */
	public int getWidth() {
		return width;
	}
	

	public void free() {
		image.free();
		VK13.vkDestroyImageView(device, imageview, null);
	}
	

}
