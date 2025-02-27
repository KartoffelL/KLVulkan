package Kartoffel.Licht.AGGraphics;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import org.lwjgl.glfw.GLFWNativeWin32;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;
import org.lwjgl.system.windows.User32;

public class WindowsWindowUtil {
	
	public static final int
			ACCENT_DISABLED = 0,
			ACCENT_ENABLE_GRADIENT = 1,
			ACCENT_ENABLE_TRANSPARENTGRADIENT = 2,
			ACCENT_ENABLE_BLURBEHIND = 3,
			ACCENT_ENABLE_ACRYLICBLURBEHIND = 4,
			ACCENT_ENABLE_HOSTBACKDROP = 5,
			ACCENT_INVALID_STATE = 6;
	
	public static final int 
			ACCENT_ENABLE_BLUR_COLORED_BIT = 2,
			ACCENT_ENABLE_FULLSCREEN_BIT = 4,
			ACCENT_ENABLE_BLUR_BORDER_LEFT_BIT = 32,
			ACCENT_ENABLE_BLUR_BORDER_UP_BIT = 64,
			ACCENT_ENABLE_BLUR_BORDER_RIGHT_BIT = 128,
			ACCENT_ENABLE_GRADIENT_KEEP_COLOR = 2,
			ACCENT_ENABLE_GRADIENT_FULLSCREEN = 4;
	
	public static final int 
				WCA_UNDEFINED = 0,
				WCA_NCRENDERING_ENABLED = 1,
				WCA_NCRENDERING_POLICY = 2,
				WCA_TRANSITIONS_FORCEDISABLED = 3,
				WCA_ALLOW_NCPAINT = 4,
				WCA_CAPTION_BUTTON_BOUNDS = 5,
				WCA_NONCLIENT_RTL_LAYOUT = 6,
				WCA_FORCE_ICONIC_REPRESENTATION = 7,
				WCA_EXTENDED_FRAME_BOUNDS = 8,
				WCA_HAS_ICONIC_BITMAP = 9,
				WCA_THEME_ATTRIBUTES = 10,
				WCA_NCRENDERING_EXILED = 11,
				WCA_NCADORNMENTINFO = 12,
				WCA_EXCLUDED_FROM_LIVEPREVIEW = 13,
				WCA_VIDEO_OVERLAY_ACTIVE = 14,
				WCA_FORCE_ACTIVEWINDOW_APPEARANCE = 15,
				WCA_DISALLOW_PEEK = 16,
				WCA_CLOAK = 17,
				WCA_CLOAKED = 18,
				WCA_ACCENT_POLICY = 19,
				WCA_FREEZE_REPRESENTATION = 20,
				WCA_EVER_UNCLOAKED = 21,
				WCA_VISUAL_OWNER = 22,
				WCA_HOLOGRAPHIC = 23,
				WCA_EXCLUDED_FROM_DDA = 24,
				WCA_PASSIVEUPDATEMODE = 25,
				WCA_USEDARKMODECOLORS = 26,
				WCA_CORNER_STYLE = 27,
				WCA_PART_COLOR = 28,
				WCA_DISABLE_MOVESIZE_FEEDBACK = 29,
				WCA_LAST = 30;
	
	public static class Native {
		public static long SetWindowCompositionAttribute_address = User32.getLibrary().getFunctionAddress("SetWindowCompositionAttribute");
	    public static boolean SetWindowCompositionAttribute(int hwnd, ByteBuffer l) {
	    	try(MemoryStack stack = MemoryStack.stackPush()) {
	    		FFICIF f = new FFICIF(stack.calloc(32));
	    		LibFFI.ffi_prep_cif(f, LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_sint, stack.pointers(LibFFI.ffi_type_sint32, LibFFI.ffi_type_pointer));
			    ByteBuffer rvalue = stack.calloc(4); //Return value is defined as sint (BOOL = sint).
			    LibFFI.ffi_call(f, SetWindowCompositionAttribute_address, rvalue, stack.pointers(MemoryUtil.memAddress(stack.ints(hwnd)), stack.pointers(l).address()));
			    return rvalue.get(0) != 0;
	    	}
	    }
	}
	
	private static byte toByte(float v) {
		return (byte) (Math.max(0, Math.min(1, v))*255);
	}
	
	public static boolean setAccentGLFW(long window, int policy, int flags, float r, float g, float b, float a) {
		return setAccent((int) GLFWNativeWin32.glfwGetWin32Window(window), policy, flags, r, g, b, a);
	}
	
	public static void setAccentAcrylicGLFW(long window, int flags, float r, float g, float b, float a) {
		setAccentAcrylic((int) GLFWNativeWin32.glfwGetWin32Window(window), flags, r, g, b, a);
	}
	
	public static boolean setDarkModeGLFW(long window, boolean val) {
		return setDarkMode((int) GLFWNativeWin32.glfwGetWin32Window(window), val);
	}
	
	
	public static boolean setAccent(int hwnd, int policy, int flags, float r, float g, float b, float a) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			int rgb = ((toByte(a)&0x0ff)<<24)|((toByte(b)&0x0ff)<<16)|((toByte(g)&0x0ff)<<8)|(toByte(r)&0x0ff);
			return setWCAttribute(hwnd, WCA_ACCENT_POLICY, stack.ints(policy, flags, rgb, 1), 16);//0x20 | 0x40 | 0x80 | 0x100
		}
	}
	public static void setAccentAcrylic(int hwnd, int flags, float r, float g, float b, float a) {
		WindowsWindowUtil.setAccent(hwnd, WindowsWindowUtil.ACCENT_ENABLE_ACRYLICBLURBEHIND, flags, r, g, b, a);
		WindowsWindowUtil.setAccent(hwnd, WindowsWindowUtil.ACCENT_ENABLE_HOSTBACKDROP, 0, 0, 0, 0, 0);
	}
	
	public static boolean setDarkMode(int hwnd, boolean val) {
		try(MemoryStack stack = MemoryStack.stackPush()) {
			return setWCAttribute(hwnd, WCA_USEDARKMODECOLORS, stack.ints(val ? 1 : 0), 4);
		}
	}
	
	public static boolean setWCAttribute(int hwnd, int attribute, Buffer data, int byteSize) {
		ByteBuffer datal = MemoryUtil.memCalloc(24);
		datal.putInt(0, attribute);
		datal.putLong(8, MemoryUtil.memAddress(data));
		datal.putInt(16, byteSize);
		boolean res = Native.SetWindowCompositionAttribute(hwnd, datal);
		MemoryUtil.memFree(datal);
		return res;
	}
}
