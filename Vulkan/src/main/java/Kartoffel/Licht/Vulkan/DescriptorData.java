package Kartoffel.Licht.Vulkan;

import org.lwjgl.vulkan.VkDescriptorBufferInfo;
import org.lwjgl.vulkan.VkDescriptorImageInfo;

/**
 * Describes how and what data (like Uniforms or Textures) are passed to the shader. Either a {@link ddBuffer} or a {@link ddImage} with a corresponding type.
 * {@link Descriptor}
 */
public class DescriptorData {
	/**
	 * {@link DescriptorData} that describes a Buffer. 
	 * @see VkDescriptorBufferInfo
	 */
	public static class ddBuffer extends DescriptorData {
		private Buffer buffer;
		private int offset;
		private int range;
		/**
		 * Creates a new ddBuffer.
		 * @param buffer the buffer to reference.
		 * @param offset the offset
		 * @param range the range
		 * @param dtype the type
		 */
		public ddBuffer(Buffer buffer, int offset, int range, int dtype) {
			super(dtype);
			this.buffer = buffer;
			this.offset = offset;
			this.range = range;
		}
		/**
		 * {@return the referenced Buffer}
		 */
		public Buffer getBuffer() {
			return buffer;
		}
		/**
		 * {@return the offset}
		 */
		public int getOffset() {
			return offset;
		}
		/**
		 * {@return the range}
		 */
		public int getRange() {
			return range;
		}
	}
	/**
	 * {@link DescriptorData} that describes a Buffer. 
	 * {@link VkDescriptorImageInfo}
	 */
	public static class ddImage extends DescriptorData {
		private Image image;
		private long imageLayout;
		private long imageView;
		private Sampler sampler;
		/**
		 * Creates a new ddImage.
		 * @param image the texture to reference
		 * @param imagelayout the imagelayout
		 * @param imageView the imageView
		 * @param sampler the sampler to use
		 * @param type the type
		 */
		public ddImage(Image image, long imagelayout, long imageView, Sampler sampler, int type) {
			super(type);
			this.image = image;
			this.sampler = sampler;
			this.imageLayout = imagelayout;
			this.imageView = imageView;
		}
		/**
		 * {@return the Sampler}
		 */
		public Sampler getSampler() {
			return sampler;
		}
		/**
		 * {@return the image}
		 */
		public Image getImage() {
			return image;
		}
		/**
		 * {@return the imageLayout}
		 */
		public long getImageLayout() {
			return imageLayout;
		}
		/**
		 * {@return the imageView}
		 */
		public long getImageView() {
			return imageView;
		}
	}
	/**
	 * The type
	 */
	public final int type;
	/**
	 * Constructor
	 * @param type type
	 */
	public DescriptorData(int type) {
		this.type = type;
	};
}