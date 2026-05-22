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
public class VkCapabilitiesInstance{
	protected final MemorySegment address;

	public static Linker linker = Linker.nativeLinker();

	public static SymbolLookup lookup = linker.defaultLookup();

	public MethodHandle vkGetPhysicalDeviceFeatures_;

	public MethodHandle vkGetPhysicalDeviceFormatProperties_;

	public MethodHandle vkEnumerateDeviceExtensionProperties_;

	public MethodHandle vkGetPhysicalDeviceSparseImageFormatProperties_;

	public MethodHandle vkEnumerateDeviceLayerProperties_;

	public MethodHandle vkGetPhysicalDeviceProperties_;

	public MethodHandle vkCreateDevice_;

	public MethodHandle vkGetInstanceProcAddr_;

	public MethodHandle vkEnumeratePhysicalDevices_;

	public MethodHandle vkDestroyInstance_;

	public MethodHandle vkGetPhysicalDeviceQueueFamilyProperties_;

	public MethodHandle vkGetPhysicalDeviceMemoryProperties_;

	public MethodHandle vkGetPhysicalDeviceImageFormatProperties_;

	public MethodHandle vkGetPhysicalDeviceQueueFamilyProperties2_;

	public MethodHandle vkGetPhysicalDeviceExternalFenceProperties_;

	public MethodHandle vkGetPhysicalDeviceMemoryProperties2_;

	public MethodHandle vkGetPhysicalDeviceFeatures2_;

	public MethodHandle vkGetPhysicalDeviceFormatProperties2_;

	public MethodHandle vkEnumeratePhysicalDeviceGroups_;

	public MethodHandle vkGetPhysicalDeviceExternalSemaphoreProperties_;

	public MethodHandle vkGetPhysicalDeviceExternalBufferProperties_;

	public MethodHandle vkGetPhysicalDeviceProperties2_;

	public MethodHandle vkGetPhysicalDeviceImageFormatProperties2_;

	public MethodHandle vkGetPhysicalDeviceSparseImageFormatProperties2_;

	public MethodHandle vkGetPhysicalDeviceToolProperties_;

	public MemorySegment address() {
		return address;
	}

	VkCapabilitiesInstance(MethodHandle vkGetInstanceProcAddr, MemorySegment address) {
		this.vkGetInstanceProcAddr_ = vkGetInstanceProcAddr;
		this.address = address;
	}

	public MethodHandle lookup(String name, FunctionDescriptor descriptor) {
		try(var arena = Arena.ofConfined()) {
			final var segment = (MemorySegment) vkGetInstanceProcAddr_.invokeExact(address, arena.allocateFrom(name));
			if(segment.address()==0) throw new IllegalStateException(String.format("Method %s not found! %s", name, descriptor));
			return linker.downcallHandle(segment, descriptor);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

}
