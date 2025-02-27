#version 460 core

layout(binding = 0) uniform UniformBufferObject {float time;mat4 view;} ubo;

layout (local_size_x = 1, local_size_y = 1, local_size_z = 1) in;

void main() {
	
}