# KLVulkan
(KartoffelLicht's Vulkan [abstractions])

KLVulkan is a small Project of mine trying to make Vulkan more accessible (mainly for myself), by adding various abstractions on multiple layers.
Its current Goal is to be like a scaffold: adding structure without adding walls.

Currently there are 3 Layers you could make use of

#### 1. LWJGL's functions and structs
[LWJGL](https://www.lwjgl.org/) makes calling Vulkan functions possible and implements many helpfull structs. We get to see almost the same as a c++ developer would. ([see Vulkan-Headers](https://github.com/KhronosGroup/Vulkan-Headers/tree/main))
Thanks to java its a bit more bloated, but defenetly not limiting. Its a great foundation!

#### 2. Kartoffel.Licht.Vulkan
This package (+and its subpackages) build on top of that and implement a ton of helper functions and classes, eg.:

```java
Buffer b = VulkanTools.createBuffer(allocator, sizeBytes, VK13.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT, VK13.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT, 0);
```
(usage/name be subject to change)

#### 3. Kartoffel.Licht.AGGraphics
This package (+and its subpackages) build on top of Kartoffel.Licht.Vulkan and starts adding its own structures, eg.:

```java
drawer2 = g.createDrawer();
{
	drawer2.startDraw();
	drawer2.bindShader(shaderCompute);
	drawer2.bindDescriptorSets(shaderCompute, shaderComputeDescriptorSets);
	drawer2.dispatchCompute(AMOUNTPARTICLES/256, 1, 1);
	drawer2.endDraw();
}
```
(usage/name be subject to change)


