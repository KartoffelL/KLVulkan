package io.github.kartoffell.KLVulkan;
import io.github.kartoffell.KLVulkan.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import java.nio.file.*;
import java.io.*;
import org.jspecify.annotations.*;
import org.lwjgl.system.*;
import java.nio.*;
import java.util.*;
// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
public class VkCapabilitiesDevice{
	protected final MemorySegment address;

	public static Linker linker = Linker.nativeLinker();

	public static SymbolLookup lookup = linker.defaultLookup();

	public MethodHandle vkCmdDrawIndexedIndirect_;

	public MethodHandle vkResetCommandBuffer_;

	public MethodHandle vkCmdSetStencilReference_;

	public MethodHandle vkCreateQueryPool_;

	public MethodHandle vkDestroyImageView_;

	public MethodHandle vkDestroyDevice_;

	public MethodHandle vkFreeDescriptorSets_;

	public MethodHandle vkDestroyBufferView_;

	public MethodHandle vkGetImageSparseMemoryRequirements_;

	public MethodHandle vkGetEventStatus_;

	public MethodHandle vkGetDeviceQueue_;

	public MethodHandle vkSetEvent_;

	public MethodHandle vkCmdSetBlendConstants_;

	public MethodHandle vkGetBufferMemoryRequirements_;

	public MethodHandle vkCmdBindVertexBuffers_;

	public MethodHandle vkCmdClearColorImage_;

	public MethodHandle vkGetRenderAreaGranularity_;

	public MethodHandle vkMergePipelineCaches_;

	public MethodHandle vkCmdNextSubpass_;

	public MethodHandle vkCmdCopyImage_;

	public MethodHandle vkDestroyFence_;

	public MethodHandle vkMapMemory_;

	public MethodHandle vkCmdSetScissor_;

	public MethodHandle vkGetDeviceMemoryCommitment_;

	public MethodHandle vkCmdEndRenderPass_;

	public MethodHandle vkDestroyFramebuffer_;

	public MethodHandle vkCmdSetEvent_;

	public MethodHandle vkCmdClearDepthStencilImage_;

	public MethodHandle vkGetImageSubresourceLayout_;

	public MethodHandle vkCmdWaitEvents_;

	public MethodHandle vkDestroyPipelineCache_;

	public MethodHandle vkDestroyEvent_;

	public MethodHandle vkFlushMappedMemoryRanges_;

	public MethodHandle vkCmdSetStencilWriteMask_;

	public MethodHandle vkCmdDrawIndirect_;

	public MethodHandle vkCreateGraphicsPipelines_;

	public MethodHandle vkCreateDescriptorPool_;

	public MethodHandle vkCreateSampler_;

	public MethodHandle vkCmdSetDepthBounds_;

	public MethodHandle vkCreateEvent_;

	public MethodHandle vkDestroySemaphore_;

	public MethodHandle vkCmdSetDepthBias_;

	public MethodHandle vkDeviceWaitIdle_;

	public MethodHandle vkCmdPushConstants_;

	public MethodHandle vkCmdFillBuffer_;

	public MethodHandle vkCmdBlitImage_;

	public MethodHandle vkEndCommandBuffer_;

	public MethodHandle vkCreatePipelineCache_;

	public MethodHandle vkInvalidateMappedMemoryRanges_;

	public MethodHandle vkAllocateCommandBuffers_;

	public MethodHandle vkCmdEndQuery_;

	public MethodHandle vkCmdSetLineWidth_;

	public MethodHandle vkCreatePipelineLayout_;

	public MethodHandle vkCmdDispatchIndirect_;

	public MethodHandle vkDestroyRenderPass_;

	public MethodHandle vkCreateFramebuffer_;

	public MethodHandle vkResetCommandPool_;

	public MethodHandle vkCreateDescriptorSetLayout_;

	public MethodHandle vkCmdPipelineBarrier_;

	public MethodHandle vkFreeCommandBuffers_;

	public MethodHandle vkQueueWaitIdle_;

	public MethodHandle vkCmdSetStencilCompareMask_;

	public MethodHandle vkCmdCopyImageToBuffer_;

	public MethodHandle vkCmdCopyQueryPoolResults_;

	public MethodHandle vkDestroyPipelineLayout_;

	public MethodHandle vkGetQueryPoolResults_;

	public MethodHandle vkCmdClearAttachments_;

	public MethodHandle vkCmdResetEvent_;

	public MethodHandle vkDestroyCommandPool_;

	public MethodHandle vkBindImageMemory_;

	public MethodHandle vkWaitForFences_;

	public MethodHandle vkCmdBindPipeline_;

	public MethodHandle vkCreateRenderPass_;

	public MethodHandle vkAllocateMemory_;

	public MethodHandle vkBeginCommandBuffer_;

	public MethodHandle vkCreateFence_;

	public MethodHandle vkCmdExecuteCommands_;

	public MethodHandle vkBindBufferMemory_;

	public MethodHandle vkCreateImageView_;

	public MethodHandle vkCmdCopyBuffer_;

	public MethodHandle vkCmdBeginQuery_;

	public MethodHandle vkResetDescriptorPool_;

	public MethodHandle vkCreateShaderModule_;

	public MethodHandle vkAllocateDescriptorSets_;

	public MethodHandle vkGetFenceStatus_;

	public MethodHandle vkCreateSemaphore_;

	public MethodHandle vkCmdCopyBufferToImage_;

	public MethodHandle vkDestroyDescriptorPool_;

	public MethodHandle vkCmdSetViewport_;

	public MethodHandle vkCreateBuffer_;

	public MethodHandle vkGetImageMemoryRequirements_;

	public MethodHandle vkUpdateDescriptorSets_;

	public MethodHandle vkFreeMemory_;

	public MethodHandle vkQueueSubmit_;

	public MethodHandle vkCmdBindDescriptorSets_;

	public MethodHandle vkCreateComputePipelines_;

	public MethodHandle vkCmdWriteTimestamp_;

	public MethodHandle vkCmdBindIndexBuffer_;

	public MethodHandle vkCmdUpdateBuffer_;

	public MethodHandle vkDestroyPipeline_;

	public MethodHandle vkResetFences_;

	public MethodHandle vkUnmapMemory_;

	public MethodHandle vkCmdBeginRenderPass_;

	public MethodHandle vkCreateCommandPool_;

	public MethodHandle vkCmdResolveImage_;

	public MethodHandle vkCreateBufferView_;

	public MethodHandle vkCmdDispatch_;

	public MethodHandle vkCmdResetQueryPool_;

	public MethodHandle vkGetPipelineCacheData_;

	public MethodHandle vkDestroyShaderModule_;

	public MethodHandle vkCreateImage_;

	public MethodHandle vkCmdDraw_;

	public MethodHandle vkDestroyDescriptorSetLayout_;

	public MethodHandle vkGetDeviceProcAddr_;

	public MethodHandle vkDestroyQueryPool_;

	public MethodHandle vkDestroyBuffer_;

	public MethodHandle vkCmdDrawIndexed_;

	public MethodHandle vkResetEvent_;

	public MethodHandle vkDestroyImage_;

	public MethodHandle vkDestroySampler_;

	public MethodHandle vkQueueBindSparse_;

	public MethodHandle vkGetBufferMemoryRequirements2_;

	public MethodHandle vkDestroySamplerYcbcrConversion_;

	public MethodHandle vkBindImageMemory2_;

	public MethodHandle vkCreateSamplerYcbcrConversion_;

	public MethodHandle vkTrimCommandPool_;

	public MethodHandle vkCreateDescriptorUpdateTemplate_;

	public MethodHandle vkUpdateDescriptorSetWithTemplate_;

	public MethodHandle vkBindBufferMemory2_;

	public MethodHandle vkCmdSetDeviceMask_;

	public MethodHandle vkGetImageMemoryRequirements2_;

	public MethodHandle vkGetDeviceQueue2_;

	public MethodHandle vkGetImageSparseMemoryRequirements2_;

	public MethodHandle vkGetDeviceGroupPeerMemoryFeatures_;

	public MethodHandle vkDestroyDescriptorUpdateTemplate_;

	public MethodHandle vkCmdDispatchBase_;

	public MethodHandle vkGetDescriptorSetLayoutSupport_;

	public MethodHandle vkGetSemaphoreCounterValue_;

	public MethodHandle vkGetBufferOpaqueCaptureAddress_;

	public MethodHandle vkCmdNextSubpass2_;

	public MethodHandle vkResetQueryPool_;

	public MethodHandle vkGetBufferDeviceAddress_;

	public MethodHandle vkGetDeviceMemoryOpaqueCaptureAddress_;

	public MethodHandle vkWaitSemaphores_;

	public MethodHandle vkCmdBeginRenderPass2_;

	public MethodHandle vkCmdDrawIndirectCount_;

	public MethodHandle vkCmdEndRenderPass2_;

	public MethodHandle vkCmdDrawIndexedIndirectCount_;

	public MethodHandle vkSignalSemaphore_;

	public MethodHandle vkCreateRenderPass2_;

	public MethodHandle vkDestroyPrivateDataSlot_;

	public MethodHandle vkCmdSetScissorWithCount_;

	public MethodHandle vkCmdCopyImage2_;

	public MethodHandle vkCmdSetRasterizerDiscardEnable_;

	public MethodHandle vkCmdResetEvent2_;

	public MethodHandle vkCmdSetEvent2_;

	public MethodHandle vkGetDeviceImageSparseMemoryRequirements_;

	public MethodHandle vkCmdSetDepthTestEnable_;

	public MethodHandle vkCmdSetPrimitiveRestartEnable_;

	public MethodHandle vkCmdCopyBufferToImage2_;

	public MethodHandle vkCmdPipelineBarrier2_;

	public MethodHandle vkCmdResolveImage2_;

	public MethodHandle vkQueueSubmit2_;

	public MethodHandle vkCmdSetStencilOp_;

	public MethodHandle vkCmdSetDepthWriteEnable_;

	public MethodHandle vkCmdSetFrontFace_;

	public MethodHandle vkCmdSetDepthBiasEnable_;

	public MethodHandle vkCmdSetDepthBoundsTestEnable_;

	public MethodHandle vkCmdBlitImage2_;

	public MethodHandle vkCmdSetCullMode_;

	public MethodHandle vkCmdSetDepthCompareOp_;

	public MethodHandle vkCmdEndRendering_;

	public MethodHandle vkCmdBindVertexBuffers2_;

	public MethodHandle vkCmdSetPrimitiveTopology_;

	public MethodHandle vkCmdCopyImageToBuffer2_;

	public MethodHandle vkCmdBeginRendering_;

	public MethodHandle vkGetPrivateData_;

	public MethodHandle vkCmdSetViewportWithCount_;

	public MethodHandle vkCmdCopyBuffer2_;

	public MethodHandle vkCreatePrivateDataSlot_;

	public MethodHandle vkGetDeviceBufferMemoryRequirements_;

	public MethodHandle vkCmdWaitEvents2_;

	public MethodHandle vkCmdSetStencilTestEnable_;

	public MethodHandle vkSetPrivateData_;

	public MethodHandle vkCmdWriteTimestamp2_;

	public MethodHandle vkGetDeviceImageMemoryRequirements_;

	public MethodHandle vkCmdPushDescriptorSet_;

	public MethodHandle vkCmdPushConstants2_;

	public MethodHandle vkTransitionImageLayout_;

	public MethodHandle vkMapMemory2_;

	public MethodHandle vkCopyImageToMemory_;

	public MethodHandle vkCmdBindIndexBuffer2_;

	public MethodHandle vkCopyImageToImage_;

	public MethodHandle vkCmdSetLineStipple_;

	public MethodHandle vkCopyMemoryToImage_;

	public MethodHandle vkCmdPushDescriptorSetWithTemplate2_;

	public MethodHandle vkCmdPushDescriptorSetWithTemplate_;

	public MethodHandle vkCmdPushDescriptorSet2_;

	public MethodHandle vkCmdBindDescriptorSets2_;

	public MethodHandle vkUnmapMemory2_;

	public MethodHandle vkGetDeviceImageSubresourceLayout_;

	public MethodHandle vkCmdSetRenderingInputAttachmentIndices_;

	public MethodHandle vkGetImageSubresourceLayout2_;

	public MethodHandle vkGetRenderingAreaGranularity_;

	public MethodHandle vkCmdSetRenderingAttachmentLocations_;

	public MemorySegment address() {
		return address;
	}

	VkCapabilitiesDevice(MethodHandle vkGetDeviceProcAddr, MemorySegment address) {
		this.vkGetDeviceProcAddr_ = vkGetDeviceProcAddr;
		this.address = address;
	}

	public MethodHandle lookup(String name, FunctionDescriptor descriptor) {
		try(var arena = Arena.ofConfined()) {
			final var segment = (MemorySegment) vkGetDeviceProcAddr_.invokeExact(address, arena.allocateFrom(name));
			if(segment.address()==0) throw new IllegalStateException(String.format("Method %s not found! %s", name, descriptor));
			return linker.downcallHandle(segment, descriptor);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

}
