# KLVulkan

Generated Vulkan abstractions for Java, backed by LWJGL.

KLVulkan provides safe, object-oriented access to Vulkan core functionality from Java while remaining close to the native API.

---

## Features

* Generated Vulkan core bindings
* Object-oriented API design
* Built on top of LWJGL's Vulkan implementation
* Support for Vulkan core versions through version-specific interfaces
* Memory-safe usage patterns with Java's Foreign Function & Memory API

---

## Installation

KLVulkan is available on Maven Central:

```xml
<dependency>
    <groupId>io.github.kartoffell</groupId>
    <artifactId>klvulkan</artifactId>
    <version>0.1.0</version>
</dependency>
```

### Requirements

KLVulkan depends on LWJGL's Vulkan bindings.

If you need Vulkan extensions that are not exposed by KLVulkan, you can directly use LWJGL's Vulkan bindings alongside it.

---

## Example

```java
// Quick test to see if vulkan is supported
if (!VK.available())
    throw new IllegalStateException("Vulkan not available!");

// VK.instance() returns a singleton. If vulkan is supported, returns at least VK10, but may also return VK11, VK12, ...
final var vulkan = VK.instance();

// Let's require VK12 to be at least present
if (!(vulkan instanceof VK12 vk12))
    throw new IllegalStateException("Vulkan 1.2 not supported!");

try (final var arena = Arena.ofConfined()) {

    // Allocate and populate the instance creation structure.
    final var pCreateInfo =
            VK10.VkInstanceCreateInfo.allocateDirect(arena);

    // Allocate storage for the resulting VkInstance handle.
    final var pInstance = VK.instancePointer(
            arena,
            1,
            vk12,
            VK.VK_MAKE_API_VERSION(0, 1, 2, 0)
    );

    // Create the Vulkan instance.
    vk12.vkCreateInstance(pCreateInfo, null, pInstance);

    final var instance = (VK12.VkInstance) pInstance.get(0);

    IO.println("Created instance: " + instance);

    // Query the number of available physical devices.
    final var pPhysicalDeviceCount = arena
            .allocate(ValueLayout.JAVA_INT)
            .asByteBuffer()
            //It's important that the byteorder is set to native!
            .order(ByteOrder.nativeOrder()) 
            .asIntBuffer();

    instance.vkEnumeratePhysicalDevices(
            pPhysicalDeviceCount,
            null
    );

    // Allocate storage for the physical device handles.
    final var pPhysicalDevices =
            VK10.VkPhysicalDevice.pointer(
                    arena,
                    pPhysicalDeviceCount.get(0),
                    instance
            );

    // Retrieve all physical devices.
    instance.vkEnumeratePhysicalDevices(
            pPhysicalDeviceCount,
            pPhysicalDevices
    );

    // Print the name of each physical device.
    for (var device : pPhysicalDevices) {

        final var pProperties =
                VK10.VkPhysicalDeviceProperties.allocateDirect(arena);

        device.vkGetPhysicalDeviceProperties(pProperties);

        IO.println(
                "Physical Device: " + pProperties.deviceName()
        );
    }
}
```

---

## License

This project is licensed under the MIT License.

---

Copyright © Kareem Athamneh [k.athamneh@web.de](mailto:k.athamneh@web.de)
