package Kartoffel.Licht.Vulkan.video;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
@Deprecated
public class MP4Decoder {
	
	public static class Box {
		public long size;
		public long address;
		public long payloadAddress;
		public String type;
		public List<Box> children;
		public byte[] data;
		public Box parent;
		public Box(long size, long address, long payloadAddress, String type, Box parent) {
			this.size = size;
			this.address = address;
			this.type = type;
			this.parent = parent;
			this.children = new ArrayList<MP4Decoder.Box>();
		}
		public static boolean isNameOfInterest(String name) {
			return name.matches("[a-z]+"); //All lower case letters
		}
		public Box getCurrent(long pointer) {
			for(Box b : children) {
				if(pointer >= b.address && pointer < (b.address+b.size))
					return b.getCurrent(pointer);
			}
			return this;
		}
		public int getDepth() {
			Box current = this;
			int d = 0;
			while(current.parent != null) {
				d++;
				current = current.parent;
			}
			return d;
		}
		public String getPath() {
			Box current = this;
			String path = "";
			while(current != null) {
				path = "/"+current.type+path;
				current = current.parent;
			}
			return path;
		}
		public boolean isLeaf() {
			return data != null; //when data != null, children.size() has to be 0!
		}
		public Box[] getChildrenByName(String type) {
			int count = 0;
			for(Box c : children)
				if(c.type.equals(type))
					count++;
			Box[] b = new Box[count];
			count = 0;
			for(Box c : children)
				if(c.type.equals(type)) {
					b[count] = c;
					count++;
				}
			return b;
		}
		public void printChildren() {
			for(Box b : children)
				System.out.print(b.type+";");
			System.out.println();
		}
	}
	
	public class reader {
		private InputStream is;
		private long pointer;
		public reader(InputStream is) {
			this.is = is;
		}
		public long getPointer() {
			return pointer;
		}
		public int getAvaible() throws IOException {
			return is.available();
		}
		private ByteBuffer bb = ByteBuffer.allocate(8);
		public int read() throws IOException {
			int r = is.read();
			if(r == -1)
				throw new RuntimeException("End of Stream!");
			pointer++;
			return r;
		}
		public int readInt() throws IOException {
			for(int i = 0; i < 4; i++)
				bb.put(i, (byte) read());
			return bb.getInt(0);
		}
		public void skp(int bytes) throws IOException {
			is.readNBytes(bytes);
			pointer += bytes;
		}
		public byte[] readData(int bytes) throws IOException {
			pointer += bytes;
			return is.readNBytes(bytes);
		}
		public long readLong() throws IOException {
			for(int i = 0; i < 8; i++)
				bb.put(i, (byte) read());
			return bb.getLong(0);
		}
		public short readShort() throws IOException {
			for(int i = 0; i < 2; i++)
				bb.put(i, (byte) read());
			return bb.getShort(0);
		}
		public String readBoxID() throws IOException {
			return new String(new byte[] {(byte) read(), (byte) read(), (byte) read(), (byte) read()}, Charset.forName("ASCII"));
		}
		
	}
	
	public static MP4Decoder create(File f) throws IOException {
		FileInputStream fis = new FileInputStream(f);
		MP4Decoder dec = new MP4Decoder(fis);
		fis.close();
		return dec;
	}
	
	public static String get(int depth) {
		String r = "";
		for(int i = 0; i < depth; i++)
			r += "-";
		return r;
	}

	public MP4Decoder(InputStream is) throws IOException {
		reader reader = new reader(is);
		Box root = new Box(0, 0, 0, "root", null);
		List<Box> leaf = new ArrayList<MP4Decoder.Box>();
		while(is.available() > 0) {
			Box current = root.getCurrent(reader.getPointer());
			int headerSize = 8;
			long size = reader.readInt();
			String name = reader.readBoxID();
			if(Box.isNameOfInterest(name)) {
				if(size == 0) {
					if(current != root)
						throw new RuntimeException("Corrupt File! Size of box is 0, but box isint top-level!");
					size = reader.getAvaible();
				} else if(size == 1) {
					size = reader.readLong();
					headerSize = 16;
				}
				Box b = new Box(size, reader.getPointer()-headerSize, reader.getPointer(), name, current);
				current.children.add(b);
				b.parent = current;
			}
			else {
				if(current.parent == null) {
					throw new RuntimeException("Ended stream sooner than expected!");
				}
				current.data = reader.readData((int) (current.address+current.size-reader.pointer));
				leaf.add(current);
			}
			
		}
		tprint(root);
		
//		MP4Structure structure = new MP4Structure(root);
		
	}
	
	static void tprint(Box box) {
		System.out.println(box.getPath() + " " + box.size + " " + box.isLeaf());
		for(Box b : box.children)
			tprint(b);
	}

}
