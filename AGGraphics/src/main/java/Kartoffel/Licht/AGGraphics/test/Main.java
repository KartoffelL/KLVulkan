//package Kartoffel.Licht.AGGraphics.test;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URISyntaxException;
//import java.nio.ByteBuffer;
//
//import org.joml.Matrix4f;
//import org.joml.Vector3f;
//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.glfw.GLFWErrorCallback;
//import org.lwjgl.glfw.GLFWWindowRefreshCallbackI;
//import org.lwjgl.system.MemoryUtil;
//import org.lwjgl.vulkan.VK13;
//
//import Kartoffel.Licht.AGGraphics.AGDrawer;
//import Kartoffel.Licht.AGGraphics.AGVGraphics;
//import Kartoffel.Licht.AGGraphics.ProjectionBox;
//import Kartoffel.Licht.AGGraphics.AGShader;
//import Kartoffel.Licht.AGGraphics.AGTexture;
//import Kartoffel.Licht.AGGraphics.Vulkan.Buffer;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool.AGDescriptorSet;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorPool.descriptorPoolSize;
//import Kartoffel.Licht.AGGraphics.Vulkan.VulkanInstance;
//import Kartoffel.Licht.AGGraphics.Vulkan.DescriptorData;
//import Kartoffel.Licht.AGGraphics.Vulkan.Sampler;
//import Kartoffel.Licht.AGGraphics.Vulkan.ShaderModule;
//
//public class Main {
//
//	private static VulkanInstance instance;
//	private static AGVGraphics g;
//	private static long window;
//	private static Buffer indices;
//	private static Buffer vertices;
//	private static Buffer uniforms;
//	private static Buffer positions;
//	private static Buffer particleMeta;
//	private static AGShader shader;
//	private static AGShader shaderCompute;
//	private static AGTexture texture;
//	private static AGTexture map;
//	private static Sampler sampler;
//	private static AGDrawer drawer;
//	private static Camera cam;
//	private static AGDescriptorSet shaderDescriptorSet;
//	private static AGDescriptorSet shaderDescriptorSet2;
//	private static AGDescriptorSet shaderComputeDescriptorSets;
//	
//	private static final int UNIFORMSIZE = 256;
//	private static ByteBuffer uniformTemp = MemoryUtil.memCalloc(UNIFORMSIZE);
//	
//	private static final int AMOUNTPARTICLES = 256*5000;
//
//	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException, URISyntaxException {
//		//For testing
//		GLFWErrorCallback.createPrint(System.out).set();
//		if(!GLFW.glfwInit())
//			throw new RuntimeException("Failed to init GLFW!");
//		instance = VulkanInstance.create("Engine", 1, 0, 0, "Test App", 1, 0, 0);
//		g = AGVGraphics.create(0, null, instance, 0);
//		window = g.getWindow();
//		g.setClearColor(0, 0.2f, 0.2f, 0.2f, 0.2f);
//		indices = g.generateIndexBuffer(6*4, false);
//		g.putBuffer(indices, new int[] {0, 1, 2, 2, 1, 3}, 0, 0, 6);
//		vertices = g.generateBuffer(5*4*4, false);
//		g.putBuffer(vertices, new float[] {
//				0, 0, 0, 0, 0,
//				1, 0, 0, 0, 1,
//				0, 1, 0, 1, 0,
//				1, 1, 0, 1, 1
//				}, 0, 0, 5*4);
//		positions = g.generateBuffer(AMOUNTPARTICLES*12, VK13.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT, true, false, true, 0, true, false, false);
//		particleMeta = g.generateBuffer(AMOUNTPARTICLES*4, 0, true, false, true, 0, true, false, false);
//		uniforms = g.generateBuffer(UNIFORMSIZE, VK13.VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT, false, true, false, 0, true, true, true);
//		texture = g.generateTexture2D(VK13.VK_FORMAT_B8G8R8A8_SRGB, 100, 100, 4);
//		g.transitionTexture(texture, VK13.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL,
//				VK13.VK_ACCESS_SHADER_READ_BIT, 
//				VK13.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);
//		sampler = g.generateTextureSampler(false, false, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, VK13.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT, instance.graphicsDevices[0].p().limits().maxSamplerAnisotropy());
//		map = g.generateTexture2D(VK13.VK_FORMAT_R32G32B32A32_SFLOAT, 100, 100, 4, VK13.VK_IMAGE_USAGE_STORAGE_BIT | VK13.VK_IMAGE_USAGE_SAMPLED_BIT | VK13.VK_IMAGE_USAGE_TRANSFER_SRC_BIT, 0, true, true, true);
//		g.transitionTexture(map, VK13.VK_IMAGE_LAYOUT_GENERAL,
//				VK13.VK_ACCESS_SHADER_READ_BIT, 
//				VK13.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT|VK13.VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT);
//		ShaderModule vertex = g.createShaderModule(new String(Main.class.getClassLoader().getResourceAsStream("test.vs").readAllBytes()), "test (Vertex)", "main", VK13.VK_SHADER_STAGE_VERTEX_BIT);
//		ShaderModule fragment = g.createShaderModule(new String(Main.class.getClassLoader().getResourceAsStream("test.fs").readAllBytes()), "test (Fragment)", "main", VK13.VK_SHADER_STAGE_FRAGMENT_BIT);
//		shader = g.createShaderPipeline(new ShaderModule[] {vertex, fragment},
//				new AGShader.vertexDescriptor[] {
//						new AGShader.vertexDescriptor(0, 20, false)
//					},new AGShader.vertexAttribDescriptor[] {
//						new AGShader.vertexAttribDescriptor(0, 0, VK13.VK_FORMAT_R32G32B32_SFLOAT, 0),
//						new AGShader.vertexAttribDescriptor(0, 1, VK13.VK_FORMAT_R32G32_SFLOAT, 12)
//					},new AGShader.descriptor[][] {{
//						new AGShader.descriptor(0, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER, VK13.VK_SHADER_STAGE_ALL_GRAPHICS),
//						new AGShader.descriptor(1, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, VK13.VK_SHADER_STAGE_FRAGMENT_BIT)
//					}},
//				VK13.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST
//				);
//		vertex.free();
//		fragment.free();
//		DescriptorPool dpool = shader.createDescriptorPool(0, 2);
//		DescriptorData[] data = new DescriptorData[] {new DescriptorData.ddBuffer(uniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER), new DescriptorData.ddImage(texture, sampler, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)};
//		shaderDescriptorSet = g.createDescriptorSets(dpool, shader.getDescriptorLayouts())[0];
//		g.setDescriptorSet(shaderDescriptorSet, data);
//		data = new DescriptorData[] {new DescriptorData.ddBuffer(uniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER), new DescriptorData.ddImage(map, sampler, VK13.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)};
//		shaderDescriptorSet2 = g.createDescriptorSets(dpool, shader.getDescriptorLayouts())[0];
//		g.setDescriptorSet(shaderDescriptorSet2, data);
//		System.out.println("a");
//		ShaderModule compute = g.createShaderModule(new String(Main.class.getClassLoader().getResourceAsStream("test.cs").readAllBytes()), "test (Compute)", "main", VK13.VK_SHADER_STAGE_COMPUTE_BIT);
//		shaderCompute = g.createComputeShaderPipeline(compute, new AGShader.descriptor[][] {{
//							new AGShader.descriptor(0, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER, VK13.VK_SHADER_STAGE_COMPUTE_BIT),
//							new AGShader.descriptor(1, VK13.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER, VK13.VK_SHADER_STAGE_COMPUTE_BIT),
//							new AGShader.descriptor(2, VK13.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER, VK13.VK_SHADER_STAGE_COMPUTE_BIT),
//							new AGShader.descriptor(3, VK13.VK_DESCRIPTOR_TYPE_STORAGE_IMAGE, VK13.VK_SHADER_STAGE_COMPUTE_BIT)
//					}});
//		
//		compute.free();
//		DescriptorPool dpool2 = g.createDescriptorPool(new descriptorPoolSize[] {
//				new descriptorPoolSize(VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER, 1),
//				new descriptorPoolSize(VK13.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER, 2),
//				new descriptorPoolSize(VK13.VK_DESCRIPTOR_TYPE_STORAGE_IMAGE, 1)}, 1);
//		{
//			data = new DescriptorData[] {
//				new DescriptorData.ddBuffer(uniforms, 0, -1, VK13.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER),
//				new DescriptorData.ddBuffer(positions, 0, -1, VK13.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER),
//				new DescriptorData.ddBuffer(particleMeta, 0, -1, VK13.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER),
//				new DescriptorData.ddImage(map, sampler, VK13.VK_DESCRIPTOR_TYPE_STORAGE_IMAGE)
//				};
//			shaderComputeDescriptorSets = g.createDescriptorSets(dpool2, shaderCompute.getDescriptorLayouts())[0];
//			g.setDescriptorSet(shaderComputeDescriptorSets, data);
//		}
//		System.out.println("e");
//		//////////////////////////////'''''''''''''''''''''
//		drawer = g.createDrawer();
//		g.resizeViewportBuffers(1000, 1000);
//		cam = new Camera();
//		int[] arri = new int[1];
//		int[] arri2 = new int[2];
//		GLFW.glfwSetWindowRefreshCallback(window, new GLFWWindowRefreshCallbackI() {
//			
//			@Override
//			public void invoke(long window) {
//				draw();
//			}
//		});
//		while(!GLFW.glfwWindowShouldClose(window)) {
//			{	//Window Resizing
//				int w = arri[0];
//				int h = arri2[0];
//				GLFW.glfwGetWindowSize(window, arri, arri2);
//				if(w != arri[0] || h != arri2[0])
//					g.resizeViewportBuffers(arri[0], arri2[0]);
//			}
//			GLFW.glfwPollEvents();
//			draw();
//			System.gc();
//		}
//		g.prepareShutdown();
//		drawer.free();
//		indices.free();
//		vertices.free();
//		texture.free();
//		positions.free();
//		particleMeta.free();
//		sampler.free();
//		map.free();
//		shader.free();
//		shaderCompute.free();
//		dpool.free();
//		dpool2.free();
//		uniforms.free();
//		g.free();
//		GLFW.glfwDestroyWindow(window);
//		GLFW.glfwTerminate();
//	}
//	private static long t = System.nanoTime();
//	public static void draw() {
//		if(!drawer.ready())
//			return;
//		drawer.startDraw();
//		{
//			g.beginWindowRenderpass(drawer);
//			{
//				cam.getPosition().z = 2;
//				cam.getViewMatrix().setLookAt(0, -1, 2, 0, 0, 0, 0, 1, 0);
//				int[] w = new int[1];
//				int[] h = new int[1];
//				GLFW.glfwGetWindowSize(window, w, h);
//				cam.getProjectionBox().setAspectRatio((float)w[0]/h[0]);
//				cam.update(false, true);
//				uniformTemp.asFloatBuffer().put(4, cam.getProViewMatrix().get(new float[16]));
//				double delta = (System.nanoTime()-t)/1000000000.0;
//				t = System.nanoTime();
//				uniformTemp.putFloat(0, (float) delta);
//				g.putBufferDirect(uniforms, uniformTemp, 0, 0, UNIFORMSIZE);
//			}
//			drawer.bindShader(shader, false);
//			drawer.bindIndexBuffer(indices);
//			drawer.bindBuffers(vertices);
//			drawer.bindDescriptorSets(shader, false, shaderDescriptorSet2);
//			drawer.drawIndexed(6, 1);
//			g.endWindowRenderpass();
//		}
//		drawer.endDraw();
//		
//		g.display();
//		
//		drawer.startDraw();
//		drawer.bindShader(shaderCompute, true);
//		drawer.bindDescriptorSets(shaderCompute, true, shaderComputeDescriptorSets);
//		drawer.dispatchCompute(AMOUNTPARTICLES/256, 1, 1);
//		drawer.endDraw();
//		
//		drawer.submitAll();
//		drawer.join();
//	}
//	
//	static class Camera {
//		
//		/**Global Up Vector, normally [0, 1, 0]*/
//		public static final Vector3f Up = new Vector3f(0, 1, 0);
//		
//		protected Vector3f position;
//		protected Vector3f rotation;
//		protected ProjectionBox projectionBox;
//		
//		protected Matrix4f viewMatrix;
//		protected Matrix4f viewMatrixInverse;
//		protected Vector3f[] rotvec;
//		
//		protected Matrix4f ProViewMatrix;
//		
//		protected float distance = 0;
//		
//		protected boolean isOrtho = false;
//		
//		public static final boolean doPositionOffset = false;
//		
//		/**
//		 * Creates a new perspective camera with the default ProjectionBox
//		 */
//		public Camera() {
//			position = new Vector3f(0, 0, 0);
//			rotation = new Vector3f(0, 0, 0);
//			projectionBox = new ProjectionBox();
//			 viewMatrix = new Matrix4f();
//			 viewMatrixInverse = new Matrix4f();
//			 ProViewMatrix = new Matrix4f();
//			 rotvec = new Vector3f[3];
//			 rotvec[0] = new Vector3f(1, 0, 0);
//			 rotvec[1] = new Vector3f(0, 1, 0);
//			 rotvec[2] = new Vector3f(0, 0, 1);
//		}
//		/**
//		 * Creates a new orthogonal camera viewing from -planeSize to planesize
//		 * @param PlaneSize
//		 */
//		public Camera(float PlaneSize) {
//			position = new Vector3f(0, 0, 0);
//			rotation = new Vector3f(0, 0, 0);
//			projectionBox = new ProjectionBox(PlaneSize);
//			 viewMatrix = new Matrix4f();
//			 viewMatrixInverse = new Matrix4f();
//			 ProViewMatrix = new Matrix4f();
//			 rotvec = new Vector3f[3];
//			 rotvec[0] = new Vector3f(1, 0, 0);
//			 rotvec[1] = new Vector3f(0, 1, 0);
//			 rotvec[2] = new Vector3f(0, 0, 1);
//			 this.setOrtho(true);
//		}
//		
//		/**
//		 * Creates a new copy of the given camera
//		 * @param cam
//		 */
//		public Camera(Camera cam) {
//			position = new Vector3f(0, 0, 1);
//			rotation = new Vector3f(0, 0, 0);
//			projectionBox = new ProjectionBox();
//			 viewMatrix = new Matrix4f();
//			 viewMatrixInverse = new Matrix4f();
//			 ProViewMatrix = new Matrix4f();
//			 rotvec = new Vector3f[3];
//			 rotvec[0] = new Vector3f(1, 0, 0);
//			 rotvec[1] = new Vector3f(0, 1, 0);
//			 rotvec[2] = new Vector3f(0, 0, 1);
//			this.set(cam);
//		}
//		
//		/**
//		 * Sets the position Vector of the camera. Any updates to the given vector will be reflected to the cameras position.<br>
//		 * Use 'getPosition().set(position)' to only copy the position
//		 * @param position
//		 */
//		public void setPosition(Vector3f position) {
//			this.position = position;
//		}
//		/**
//		 * Adds the offset to the position of the camera
//		 * @param position
//		 */
//		public void addPosition(Vector3f offset) {
//			this.position.add(offset);
//		}
//		
//		/**
//		 * Returns the position vector
//		 * @return
//		 */
//		public Vector3f getPosition() {
//			return position;
//		}
//		/**
//		 * Returns the position moved back by the eye-vector times distance
//		 * @return
//		 */
//		public Vector3f getPositionDistanced() {
//			return new Vector3f(viewMatrix.get(0, 2), viewMatrix.get(1, 2), viewMatrix.get(2, 2)).mul(distance).sub(position).negate();
//		}
//		
//		/**
//		 * Sets the rotation Vector of the camera (degrees). Any updates to the given vector will be reflected to the cameras rotation.<br>
//		 * Use 'getRotation().set(rotation)' to only copy the rotation
//		 * @param rotation in degrees
//		 */
//		public void setRotation(Vector3f rotation) {
//			this.rotation = rotation;
//		}
//		/**
//		 * Adds the offset to the rotation of the camera
//		 * @param offset in degrees
//		 */
//		public void addRotation(Vector3f offset) {
//			this.rotation.add(offset);
//		}
//		/**
//		 * Returns the rotation vector (degrees) of the camera
//		 * @return
//		 */
//		public Vector3f getRotation() {
//			return rotation;
//		}
//		/**
//		 * Returns the Projection Matrix of the camera. Effectively equivalent to 'getProjectionBox().getProjection()'
//		 * @return
//		 */
//		public Matrix4f getProjection() {
//			return projectionBox.getProjection();
//		}
//		/**
//		 * Returns the projectionBox of the camera.
//		 * @return
//		 */
//		public ProjectionBox getProjectionBox() {
//			return projectionBox;
//		}
//		
//		/**
//		 * Updates the viewMatrix and calculates the inverse of it. Also updates the projectionBox, after thus the proViewMatrix is calculated.<br>
//		 *  Use 'updateWithViewMatrix' to avoid recalculating the viewMatrix if its already calculated externally
//		 */
//		public void update() {
//			
//			if(!isOrtho)
//				projectionBox.update();
//			else
//				projectionBox.updateOrtho();
//			
//			getViewMatrixNew(viewMatrix);
//			viewMatrix.get(viewMatrixInverse);
//			viewMatrixInverse.invert();
//			projectionBox.getProjection().mul(viewMatrix, ProViewMatrix);
//		}
//		
//		/**
//		 * Calculates the inverse of the viewMatrix, updates the projectionBox and calculates the ProViewMatrix.<br>
//		 * Use if the viewMatrix is calculated externally
//		 */
//		public void update(boolean updateViewMatrix, boolean updateProjectionMatrix) {
//			if(updateViewMatrix)
//				getViewMatrixNew(viewMatrix);
//			if(updateProjectionMatrix)
//				if(!isOrtho)
//					projectionBox.update();
//				else
//					projectionBox.updateOrtho();
//			viewMatrix.get(viewMatrixInverse);
//			viewMatrixInverse.invert();
//			projectionBox.getProjection().mul(viewMatrix, ProViewMatrix);
//		}
//		
//		/**Use 'setDistance(float distance)' instead*/
//		@Deprecated
//		public void updateP(float distance) {
//			getViewMatrixNew(viewMatrix);
//			double hd = Math.cos(Math.toRadians(rotation.x));
//			double vd = Math.sin(Math.toRadians(rotation.x));
//			
//			
//			viewMatrix.translate(
//					(float)(hd*Math.cos(Math.toRadians(rotation.y-90)))*distance,
//					-(float)(vd)*distance,
//					(float)(hd*Math.sin(Math.toRadians(rotation.y-90)))*distance
//						);
//			
//			viewMatrix.get(viewMatrixInverse);
//			viewMatrixInverse.invert();
//
//			projectionBox.getProjection().mul(viewMatrix, ProViewMatrix);
//		}
//		/**
//		 * Returns the viewMatrix
//		 * @return
//		 */
//		public Matrix4f getViewMatrix() {
//			return viewMatrix;
//		}
//		/**
//		 * Returns the inverse of the viewMatrix
//		 * @return
//		 */
//		public Matrix4f getViewMatrixInv() {
//			return viewMatrixInverse;
//		}
//		/**
//		 * Calculates the new viewMatrix using position, rotation, etc... contained in the camera
//		 * @param dest
//		 * @return
//		 */
//		public Matrix4f getViewMatrixNew(Matrix4f dest) {
//			dest.identity();
//			dest.rotate((float) Math.toRadians(rotation.x), rotvec[0])
//			.rotate((float) Math.toRadians(rotation.y), rotvec[1])
//			.rotate((float) Math.toRadians(rotation.z), rotvec[2]);
//			if(doPositionOffset)
//				dest.translate(-position.x % 1, -position.y % 1, -position.z % 1);
//			else
//				dest.translate(-position.x, -position.y, -position.z);
//			if(distance != 0)
//				dest.translate(viewMatrix.get(0, 2)*distance, viewMatrix.get(1, 2)*distance, viewMatrix.get(2, 2)*distance);
//			return dest;
//		}
//		/**
//		 * Returns the eye vector of the viewMatrix
//		 * @return
//		 */
//		public Vector3f getOutDirection() {
//			return new Vector3f(viewMatrix.get(0, 2), viewMatrix.get(1, 2), viewMatrix.get(2, 2));
//		}
//		/**
//		 * Returns the up vector of the viewMatrix
//		 * @return
//		 */
//		public Vector3f getOutUp() {
//			return new Vector3f(viewMatrix.get(0, 1), viewMatrix.get(1, 1), viewMatrix.get(2, 1));
//		}
//		/**
//		 * Returns the proViewMatrix (The product of the projection- and viewMatrix (P * V))
//		 * @return
//		 */
//		public Matrix4f getProViewMatrix() {
//			return ProViewMatrix;
//		}
//		/**
//		 * If this Camera has an orthogonal projection
//		 * @return
//		 */
//		public boolean isOrtho() {
//			return isOrtho;
//		}
//		/**
//		 * Sets whenever this Camera should have an orthogonal projection
//		 * @param isOrtho
//		 */
//		public void setOrtho(boolean isOrtho) {
//			this.isOrtho = isOrtho;
//		}
//		/**
//		 * Sets the distance the viewMatrix is, along the eye vector, offset by
//		 * @param distance
//		 */
//		public void setDistance(float distance) {
//			this.distance = distance;
//		}
//		/**
//		 * Returns the distance the viewMatrix is, along the eye vector, offset by
//		 * @return
//		 */
//		public float getDistance() {
//			return distance;
//		}
//		/**
//		 * Makes this camera instance to a clone of the given one
//		 * @param cam
//		 */
//		public void set(Camera cam) {
//			this.isOrtho = cam.isOrtho;
//			this.position.set(cam.position);
//			this.rotation.set(cam.rotation);
//			this.projectionBox.set(cam.projectionBox);
//			this.ProViewMatrix.set(cam.ProViewMatrix);
//			this.viewMatrix.set(cam.viewMatrix);
//			this.viewMatrixInverse.set(cam.viewMatrixInverse);
//			this.distance = cam.distance;
//			this.rotvec[0] = cam.rotvec[0];
//			this.rotvec[1] = cam.rotvec[1];
//			this.rotvec[2] = cam.rotvec[2];
//		}
//		
//		@Override
//		public String toString() {
//			return "[" + position.toString() + " " + rotation.toString() + " " + isOrtho + "]";
//		}
//	}
//}
