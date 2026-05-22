package io.github.kartoffell.KLVulkan;

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
}
