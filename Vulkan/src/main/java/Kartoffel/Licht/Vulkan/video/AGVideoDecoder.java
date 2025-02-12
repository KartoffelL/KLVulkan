package Kartoffel.Licht.Vulkan.video;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.KHRVideoDecodeH264;
import org.lwjgl.vulkan.KHRVideoQueue;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkExtensionProperties;
import org.lwjgl.vulkan.VkExtent2D;
import org.lwjgl.vulkan.VkVideoDecodeH264ProfileInfoKHR;
import org.lwjgl.vulkan.VkVideoProfileInfoKHR;
import org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR;

/**
 * Experimental
 */
@Deprecated
public class AGVideoDecoder {
	/**
	 * New 
	 * @param device a
	 * @param queueFamilyIndex a
	 * @param pictureFormat a
	 * @param referenceFormat a
	 * @param chromaSubsampling a
	 * @param lumaBitDepth a
	 * @param chromaBitDepth a
	 * @param maxActiveReferencePictures a
	 * @param maxDpbSlots a
	 */
	@Deprecated
	public AGVideoDecoder(VkDevice device, int queueFamilyIndex, int pictureFormat, int referenceFormat, int chromaSubsampling, int lumaBitDepth, int chromaBitDepth, int maxActiveReferencePictures, int maxDpbSlots) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			
			@SuppressWarnings("resource")
			VkVideoDecodeH264ProfileInfoKHR decode = new VkVideoDecodeH264ProfileInfoKHR(stack.calloc(24));
			decode.set(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR, 0, 0, 0);
			
			
			VkVideoProfileInfoKHR videoProfile = new VkVideoProfileInfoKHR(stack.calloc(32));
			videoProfile.set(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR, decode.address(), KHRVideoDecodeH264.VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, chromaSubsampling, lumaBitDepth, chromaBitDepth);
			
			
			VkExtent2D extent = new VkExtent2D(stack.calloc(8));
			extent.set(512, 512);
			VkExtensionProperties properties = new VkExtensionProperties(stack.calloc(260));
			
			VkVideoSessionCreateInfoKHR info = new VkVideoSessionCreateInfoKHR(stack.calloc(64));
			info.set(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR, 0, queueFamilyIndex, 0, videoProfile, pictureFormat, extent, referenceFormat, maxDpbSlots, maxActiveReferencePictures, properties);
			
			long[] arrl = new long[1];
			KHRVideoQueue.vkCreateVideoSessionKHR(device, info, null, arrl);
			
			
			
			
		}
	}

}
