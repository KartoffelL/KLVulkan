#version 450 core

layout(location = 0) in vec4 vertices;
layout(location = 1) in vec2 textures;
layout(location = 0) out vec2 tex_coords;

const vec2[] rectangle = {vec2(0, 0), vec2(0, 1), vec2(1, 1), vec2(1, 0)};


void main() {
	tex_coords = textures;
	gl_Position = vec4((vertices-vec3(0.5, 0.5, 0))*2, 1);
}
