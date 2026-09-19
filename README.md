# KLVulkan

Generated Vulkan abstractions for Java.

KLVulkan provides safe, object-oriented access to Vulkan functionality from Java while remaining close to the native API.
It does not have any external dependencies and builds upon the java FFI API.

NOTE: the bindings are still in-development and lack testing. There **might** still be some serious bugs or performance problems.


Sources
---

Since the bindings are generated (see [the Tool](https://github.com/KartoffelL/JavaBindingsGenTool)), no sources are (still) contained in this repo.
But you can always download them at [Maven Central](https://repo1.maven.org/maven2/io/github/kartoffell/klvulkan) (Make sure you find the right version)

Usage
---

KLVulkan is available on Maven Central:

```xml
<dependency>
    <groupId>io.github.kartoffell</groupId>
    <artifactId>klvulkan</artifactId>
    <version>0.3.0</version>
</dependency>
```
And then you could start like this:

```java
// VK.instance() returns a singleton. If vulkan is supported, returns at least VK10, but may also return VK11, VK12, ...
//  Throws an exception if no vulkan could be found
final var vulkan = VK.vulkan();

// Let's require VK12 to be at least present
if (!(vulkan instanceof VK12 vk12))
    throw new IllegalStateException("Vulkan 1.2 not supported!");

try (final var stack = StackAllocator.push()) {
    // Allocate and populate the instance creation structure.
    final var pCreateInfo =
        VK10.VkInstanceCreateInfo.allocateDirect(stack);
    // Initialize pCreateInfo here

    // Allocate storage for the resulting VkInstance handle.
    final var pInstance = VK.instancePointer(
            stack,
            1,
            vk12,
            VK.VK_MAKE_API_VERSION(0, 1, 2, 0),
            Set.of() //A set of extension names that are used
        );

    // Create the Vulkan instance.
    vk12.vkCreateInstance(pCreateInfo, null, pInstance);

    final var instance = (VK12.VkInstance) pInstance.get(0);

    IO.println("Created instance: " + instance);

    // Query the number of available physical devices.
    final var pPhysicalDeviceCount = stack.allocateInt(1);

    instance.vkEnumeratePhysicalDevices(
            pPhysicalDeviceCount,
            null
    );

    // Allocate storage for the physical device handles.
    final var pPhysicalDevices =
            VK10.VkPhysicalDevice.pointer(
                stack,
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
            VK10.VkPhysicalDeviceProperties.allocateDirect(stack);

        device.vkGetPhysicalDeviceProperties(pProperties);

        IO.println(
            "Physical Device: " + pProperties.deviceName()
        );
    }
}
```

License
---

This project is licensed under the MIT License.
Copyright © Kareem Athamneh [k.athamneh@web.de](mailto:k.athamneh@web.de)
