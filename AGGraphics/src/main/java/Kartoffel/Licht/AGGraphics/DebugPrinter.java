package Kartoffel.Licht.AGGraphics;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * Printer that might receive warnings/errors/details about things. Useful for debugging.
 */
public class DebugPrinter {
	/**
	 * The static DebugPrinter instance, null if disabled
	 */
	public static DebugPrinter instance = new DebugPrinter();
	
	private OutputStream out, err;
	private Charset set;
	
	/**
	 * Creates a new {@link DebugPrinter} using the standard Outs and the default Charset.
	 */
	public DebugPrinter() {
		this.out = System.out;
		this.err = System.err;
		this.set = Charset.defaultCharset();
	}
	/**
	 * Creates a new {@link DebugPrinter}
	 * @param out the out
	 * @param err the err
	 * @param set the set
	 */
	public DebugPrinter(OutputStream out, OutputStream err, Charset set) {
		this.out = out;
		this.err = err;
		this.set = set;
	}
	/**
	 * Writes a string.
	 * @param s the string to write
	 */
	public void write(String s) {
		try {
			out.write((DebugPrinter.class.getName()).getBytes(set));
			out.write(s.getBytes(set));
			out.write('\n');
			out.flush();
		} catch (IOException e) {}
	}
	/**
	 * Writes a string.
	 * @param s the string to write
	 */
	public void writeErr(String s) {
		try {
			err.write((DebugPrinter.class.getName()).getBytes(set));
			err.write(s.getBytes(set));
			err.write('\n');
			err.flush();
		} catch (IOException e) {}
	}
	/**
	 * Writes a string.
	 * @param s the string to write
	 */
	public void writeWrn(String s) {
		try {
			out.write((DebugPrinter.class.getName()).getBytes(set));
			out.write(("[WARNING] "+s).getBytes(set));
			out.write('\n');
			out.flush();
		} catch (IOException e) {}
	}
	/**
	 * If {@link DebugPrinter#instance} is not null, then write the string to out.
	 * @param s the string to write
	 */
	public static void out(String s) {
		if(instance != null)
			instance.write(s);
	} 
	/**
	 * If {@link DebugPrinter#instance} is not null, then write the string to err.
	 * @param s the string to write
	 */
	public static void err(String s) {
		if(instance != null)
			instance.writeErr(s);
	}
	/**
	 * If {@link DebugPrinter#instance} is not null, then write the string to warn.
	 * @param s the string to write
	 */
	public static void wrn(String s) {
		if(instance != null)
			instance.writeWrn(s);
	}
	/**
	 * Setter
	 * @param err the err to set
	 * @return this
	 */
	public DebugPrinter setErr(OutputStream err) {
		this.err = err;
		return this;
	}
	/**
	 * Setter
	 * @param instance the instance to set
	 *  @return this
	 */
	public static DebugPrinter setInstance(DebugPrinter instance) {
		DebugPrinter.instance = instance;
		return instance;
	}
	/**
	 * Setter
	 * @param out the out to set
	 *  @return this
	 */
	public DebugPrinter setOut(OutputStream out) {
		this.out = out;
		return this;
	}
	/**
	 * Setter
	 * @param set the set to set
	 *  @return this
	 */
	public DebugPrinter setSet(Charset set) {
		this.set = set;
		return this;
	}
	/**
	 * {@return the set}
	 */
	public Charset getSet() {
		return set;
	}
	/**
	 * {@return the err}
	 */
	public OutputStream getErr() {
		return err;
	}
	/**
	 * {@return the instance}
	 */
	public static DebugPrinter getInstance() {
		return instance;
	}
	/**
	 * {@return the out}
	 */
	public OutputStream getOut() {
		return out;
	}

}
