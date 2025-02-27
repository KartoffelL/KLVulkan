#version 450 core
	
layout(location = 0) out vec4 outColor;
layout(location = 0) in vec2 tex_coords;

layout(binding = 1) uniform sampler2D fsmpl;

float median(vec3 a) {
    return max(min(a.r, a.g), min(max(a.r, a.g), a.b));
}

vec4 getColor(vec3 col, float w, float e, vec2 offset) {
	float distance = median(texture(fsmpl, tex_coords).rgb)+0.6;
	float opacity = pow(smoothstep(0, w, distance), e);
	return vec4(col, opacity);
}

void main() {
	vec3 msd = texture(fsmpl, tex_coords).rgb;
    float sd = median(msd);
    //float screenPxDistance = 4.5*(sd - 0.5);
    //float opacity = clamp(screenPxDistance + 0.5, 0.0, 1.0);
    //outColor = mix(vec4(0), vec4(1), opacity);
    outColor = sd >= 0.5 ? vec4(1) : vec4(0);
    //outColor = getColor(vec3(1), 1, 2, vec2(0));
}