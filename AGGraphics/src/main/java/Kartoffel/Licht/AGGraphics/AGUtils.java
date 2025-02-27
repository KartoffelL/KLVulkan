package Kartoffel.Licht.AGGraphics;

/**
 * Some utils, WOP
 */
public class AGUtils {

	/**
	 * Sleeps some time.
	 * @param milli time in milliseconds
	 * @param nano additional time in nanoseconds
	 */
	public static void sleep(int milli, int nano) {
		try {
			Thread.sleep(milli, nano);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Sleeps 0.05ms.
	 */
	public static void sleep() {
		sleep(0, 50000);
	}

}
