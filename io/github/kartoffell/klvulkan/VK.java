package io.github.kartoffell.klvulkan;

import org.lwjgl.system.FunctionProvider;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.util.Optional;

// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
/**
 * Utility class for the Vulkan API binding
 */
public class VK {

    /**
     * {@return true if the vulkan api is supported, false otherwise}
     */
    public static boolean available() {
        try {
            org.lwjgl.vulkan.VK.getFunctionProvider();
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
    private static int availableVersion = -1;

    /**
     * {@return the max available version of Vulkan, in the api-version format}
     */
    public static int getAvailableVersion() {
        if(!available())
            return 0;
        if(availableVersion == -1)
            availableVersion = org.lwjgl.vulkan.VK.getInstanceVersionSupported();
        return availableVersion;
    }

    private static VK10 version = null;

    /**
     * {@return the Vulkan class instance. Depending on the max supported version, this may be cast to any higher version (eg. VK13)}
     */
    public static VK10 instance() {
        if(!available())
            return null;
        if(version == null) {
            VkCapabilitiesDevice.lookup = VkCapabilitiesInstance.lookup = VkCapabilitiesGlobal.lookup = ofFunctionProvider(org.lwjgl.vulkan.VK.getFunctionProvider());
            final var ava = getAvailableVersion();
            version = switch ((VK_VERSION_MAJOR(ava)<<8)|VK_VERSION_MINOR(ava)) {
                case (1 << 8) -> new VK10();
                case (1 << 8) | 1 -> new VK11();
                case (1 << 8) | 2 -> new VK12();
                case (1 << 8) | 3 -> new VK13();
                default -> new VK14();
            };
        }
        return version;
    }

    /**
     * Returns a PointerBuffer for instances. The difference of the creation of PointerBuffers of other types is that instances and devices rely on the version they should be.
     * @param arena the Arena to use
     * @param count the capacity of the PointerBuffer
     * @param parent the parent
     * @param version the version, in the api-version format
     * @return a new PointerBuffer
     */
    public static PointerBuffer<? extends VK10.VkInstance> instancePointer(Arena arena, int count, VK10 parent, int version) {
        return PointerBuffer.allocateDirect(arena, count, switch ((VK_VERSION_MAJOR(version)<<8)|VK_VERSION_MINOR(version)) {
            case (1 << 8) -> (mem) -> new VK10.VkInstance(mem, parent);
            case (1 << 8) | 1 -> (mem) -> new VK11.VkInstance(mem, (VK11) parent);
            case (1 << 8) | 2 -> (mem) -> new VK12.VkInstance(mem, (VK12)parent);
            case (1 << 8) | 3 -> (mem) -> new VK13.VkInstance(mem, (VK13)parent);
            default -> (mem) -> new VK14.VkInstance(mem, (VK14)parent);
        });
    }
    /**
     * Returns a PointerBuffer for devices. The difference of the creation of PointerBuffers of other types is that instances and devices rely on the version they should be.
     * @param arena the Arena to use
     * @param count the capacity of the PointerBuffer
     * @param parent the parent
     * @param version the version, in the api-version format
     * @return a new PointerBuffer
     */
    public static PointerBuffer<? extends VK10.VkDevice> devicePointer(Arena arena, int count, VK10.VkPhysicalDevice parent, int version) {
        return PointerBuffer.allocateDirect(arena, count, switch ((VK_VERSION_MAJOR(version)<<8)|VK_VERSION_MINOR(version)) {
            case (1 << 8) -> (mem) -> new VK10.VkDevice(mem, parent);
            case (1 << 8) | 1 -> (mem) -> new VK11.VkDevice(mem, (VK11.VkPhysicalDevice) parent);
            case (1 << 8) | 2 -> (mem) -> new VK12.VkDevice(mem, (VK12.VkPhysicalDevice)parent);
            case (1 << 8) | 3 -> (mem) -> new VK13.VkDevice(mem, (VK13.VkPhysicalDevice)parent);
            default -> (mem) -> new VK14.VkDevice(mem, (VK14.VkPhysicalDevice)parent);
        });
    }

    /**
     * Returns the version of the given instance.
     * @param instance the instance
     * @return the version, in the api-version format
     */
    public static int instanceVersion(VK10.VkInstance instance) {
        return switch (instance) {
            case VK14.VkInstance _ -> (1 << 22) | (4 << 12);
            case VK13.VkInstance _ -> (1 << 22) | (3 << 12);
            case VK12.VkInstance _ -> (1 << 22) | (2 << 12);
            case VK11.VkInstance _ -> (1 << 22) | (1 << 12);
            case VK10.VkInstance _ -> (1 << 22) | (0);
        };
    }
    /**
     * Returns the version of the given device.
     * @param device the instance
     * @return the version, in the api-version format
     */
    public static int deviceVersion(VK10.VkDevice device) {
        return switch (device) {
            case VK14.VkDevice _ -> (1 << 22) | (4 << 12);
            case VK13.VkDevice _ -> (1 << 22) | (3 << 12);
            case VK12.VkDevice _ -> (1 << 22) | (2 << 12);
            case VK11.VkDevice _ -> (1 << 22) | (1 << 12);
            case VK10.VkDevice _ -> (1 << 22) | (0);
        };
    }

    /**
     * Constructs a new version int.
     * @param variant -
     * @param major -
     * @param minor -
     * @param patch -
     * @return the version, in the api-version format
     */
    public static int VK_MAKE_API_VERSION(int variant, int major, int minor, int patch) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }

    /**
     * Returns the variant-component of the version.
     * @param version the version in the api-version format
     * @return the variant-component
     */
    public static int VK_API_VERSION_VARIANT(int version) {
        return version >>> 29;
    }
    /**
     * Returns the major-component of the version.
     * @param version the version in the api-version format
     * @return the major-component
     */
    public static int VK_API_VERSION_MAJOR(int version) {
        return (version >>> 22) & 0x7F;
    }
    /**
     * Returns the minor-component of the version.
     * @param version the version in the api-version format
     * @return the minor-component
     */
    public static int VK_API_VERSION_MINOR(int version) {
        return (version >>> 12) & 0x3FF;
    }
    /**
     * Returns the patch-component of the version.
     * @param version the version in the api-version format
     * @return the patch-component
     */
    public static int VK_API_VERSION_PATCH(int version) {
        return version & 0xFFF;
    }

    /**
     * Constructs a new version int.
     * @param major -
     * @param minor -
     * @param patch -
     * @return the version, in the application-version format
     */
    public static int VK_MAKE_VERSION(int major, int minor, int patch) {
        return (major << 22) | (minor << 12) | patch;
    }
    /**
     * Returns the major-component of the version.
     * @param version the version in the application-version format
     * @return the major-component
     */
    public static int VK_VERSION_MAJOR(int version) {
        return version >>> 22;
    }
    /**
     * Returns the minor-component of the version.
     * @param version the version in the application-version format
     * @return the minor-component
     */
    public static int VK_VERSION_MINOR(int version) {
        return (version >>> 12) & 0x3FF;
    }
    /**
     * Returns the patch-component of the version.
     * @param version the version in the application-version format
     * @return the patch-component
     */
    public static int VK_VERSION_PATCH(int version) {
        return version & 0xFFF;
    }

    static SymbolLookup ofFunctionProvider(final FunctionProvider provider) {
        return new SymbolLookup() {

            @Override
            public Optional<MemorySegment> find(String name) {
                long l = provider.getFunctionAddress(name);
                return l == 0 ? Optional.empty() : Optional.of(MemorySegment.ofAddress(l));
            }
        };
    }

}
