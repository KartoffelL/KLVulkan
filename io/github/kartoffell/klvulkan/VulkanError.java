package io.github.kartoffell.klvulkan;

/**
 * Represents any kind of Vulkan Error.
 */
public class VulkanError extends RuntimeException {

    final int value;

    public VulkanError() {
        super();
        this.value = Integer.MIN_VALUE;
    }
    public VulkanError(int value) {
        super();
        this.value = value;
    }

    /**
     * {@return the vulkan error code}
     */
    public int getValue() {
        return value;
    }
}
