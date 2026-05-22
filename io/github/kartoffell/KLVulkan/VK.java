package io.github.kartoffell.KLVulkan;

import org.lwjgl.system.FunctionProvider;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.util.Optional;

/**
 * Utility class for Vulkan
 */
public class VK {

    public static boolean available() {
        try {
            org.lwjgl.vulkan.VK.getFunctionProvider();
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
    private static int availableVersion = -1;
    public static int getAvailableVersion() {
        if(!available())
            return 0;
        if(availableVersion == -1)
            availableVersion = org.lwjgl.vulkan.VK.getInstanceVersionSupported();
        return availableVersion;
    }

    private static VK10 version = null;
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

    public static PointerBuffer<? extends VK10.VkInstance> instancePointer(Arena arena, int count, VK10 parent, int version) {
        return PointerBuffer.allocateDirect(arena, count, switch ((VK_VERSION_MAJOR(version)<<8)|VK_VERSION_MINOR(version)) {
            case (1 << 8) -> (mem) -> new VK10.VkInstance(mem, parent);
            case (1 << 8) | 1 -> (mem) -> new VK11.VkInstance(mem, (VK11) parent);
            case (1 << 8) | 2 -> (mem) -> new VK12.VkInstance(mem, (VK12)parent);
            case (1 << 8) | 3 -> (mem) -> new VK13.VkInstance(mem, (VK13)parent);
            default -> (mem) -> new VK14.VkInstance(mem, (VK14)parent);
        });
    }
    public static PointerBuffer<? extends VK10.VkDevice> devicePointer(Arena arena, int count, VK10.VkPhysicalDevice parent, int version) {
        return PointerBuffer.allocateDirect(arena, count, switch ((VK_VERSION_MAJOR(version)<<8)|VK_VERSION_MINOR(version)) {
            case (1 << 8) -> (mem) -> new VK10.VkDevice(mem, parent);
            case (1 << 8) | 1 -> (mem) -> new VK11.VkDevice(mem, (VK11.VkPhysicalDevice) parent);
            case (1 << 8) | 2 -> (mem) -> new VK12.VkDevice(mem, (VK12.VkPhysicalDevice)parent);
            case (1 << 8) | 3 -> (mem) -> new VK13.VkDevice(mem, (VK13.VkPhysicalDevice)parent);
            default -> (mem) -> new VK14.VkDevice(mem, (VK14.VkPhysicalDevice)parent);
        });
    }

    public static int VK_MAKE_API_VERSION(int variant, int major, int minor, int patch) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }
    public static int VK_API_VERSION_VARIANT(int version) {
        return version >>> 29;
    }
    public static int VK_API_VERSION_MAJOR(int version) {
        return (version >>> 22) & 0x7F;
    }
    public static int VK_API_VERSION_MINOR(int version) {
        return (version >>> 12) & 0x3FF;
    }
    public static int VK_API_VERSION_PATCH(int version) {
        return version & 0xFFF;
    }
    public static int VK_MAKE_VERSION(int major, int minor, int patch) {
        return (major << 22) | (minor << 12) | patch;
    }
    public static int VK_VERSION_MAJOR(int version) {
        return version >>> 22;
    }
    public static int VK_VERSION_MINOR(int version) {
        return (version >>> 12) & 0x3FF;
    }
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
