package Kartoffel.Licht.Vulkan.video;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import Kartoffel.Licht.Vulkan.video.MP4Decoder.Box;
@Deprecated
public class MP4Structure {
	private static ThreadLocal<ByteBuffer> bb = new ThreadLocal<ByteBuffer>();
	public static int readInt(byte[] data, int index) {
		for(int i = 0; i < 4; i++)
			bb.get().put(i, data[index+i]);
		return bb.get().getInt(0);
	}
	public static short readInt(byte[] data, int index, int amount) {
		for(int i = 0; i < 4-amount; i++)
			bb.get().put(i, (byte) 0);
		for(int i = 4-amount; i < 4; i++)
			bb.get().put(i, data[index+i]);
		return bb.get().getShort(0);
	}
	public static long readLong(byte[] data, int index) {
		for(int i = 0; i < 8; i++)
			bb.get().put(i, data[index+i]);
		return bb.get().getLong(0);
	}
	public static short readShort(byte[] data, int index) {
		for(int i = 0; i < 2; i++)
			bb.get().put(i, data[index+i]);
		return bb.get().getShort(0);
	}

	
	public static class moov {
		
		public trak[] trak;
		public mvhd[] mvhd;
		public uuid[] uuid;
		public udta[] udta;

		public moov(Box box) {
			{
				Box[] bxs = box.getChildrenByName("trak");
				trak = new trak[bxs.length];
				for(int i = 0; i < bxs.length; i++)
					trak[i] = new trak(bxs[i]);
			}
			{
				Box[] bxs = box.getChildrenByName("mvhd");
				mvhd = new mvhd[bxs.length];
				for(int i = 0; i < bxs.length; i++)
					mvhd[i] = new mvhd(bxs[i]);
			}
			{
				Box[] bxs = box.getChildrenByName("uuid");
				uuid = new uuid[bxs.length];
				for(int i = 0; i < bxs.length; i++)
					uuid[i] = new uuid(bxs[i]);
			}
			{
				Box[] bxs = box.getChildrenByName("udta");
				udta = new udta[bxs.length];
				for(int i = 0; i < bxs.length; i++)
					udta[i] = new udta(bxs[i]);
			}
		}
		
	}
	
	public static class udta {
		public String data;
		public udta(Box box) {
			this.data = new String(box.data, Charset.forName("ASCII"));
		}
		
	}

	public static class uuid {
		public byte[] uuid;
		public uuid(Box box) {
			this.uuid = box.data;
		}
		
	}


	public static class mvhd {
		public int creationTime;
		public short flags;
		public byte version;
		public int modificationTime;
		public int timeScale;
		public int duration;
		public int preferredRate;
		public short prefferedVolume;
		public byte[] matrixStructure;
		public int previewTime;
		public int previewDuration;
		public int selectionTime;
		public int posterTime;
		public int selectionDuration;
		public int currentTime;
		public int nextTrackID;

		public mvhd(Box box) {
			version = box.data[0];
			flags = MP4Structure.readInt(box.data, 1, 3);
			creationTime = MP4Structure.readInt(box.data, 4);
			modificationTime = MP4Structure.readInt(box.data, 8);
			timeScale = MP4Structure.readInt(box.data, 16);
			duration = MP4Structure.readInt(box.data, 20);
			preferredRate = MP4Structure.readInt(box.data, 24);
			prefferedVolume = MP4Structure.readShort(box.data, 26);
			matrixStructure = new byte[36];
			System.arraycopy(box.data, 30, matrixStructure, 0, 36);
			previewTime = MP4Structure.readInt(box.data, 62);
			previewDuration = MP4Structure.readInt(box.data, 66);
			posterTime = MP4Structure.readInt(box.data, 70);
			selectionTime = MP4Structure.readInt(box.data, 74);
			selectionDuration = MP4Structure.readInt(box.data, 78);
			currentTime = MP4Structure.readInt(box.data, 82);
			nextTrackID = MP4Structure.readInt(box.data, 86);
		}
		
	}
	
	public static class tkhd {
		public byte version;
		public short flags;
		public int creationTime;
		public int modificationTime;
		public int trackID;
		public int reserved1;
		public int duration;
		public long reserved2;
		public short layer;
		public short alternateGroup;
		public short volume;
		public short reserved3;
		public byte[] matrixStructure;
		public int trackWidth;
		public int trackHeight;
		public tkhd(Box box) {
			version = box.data[0];
			flags = MP4Structure.readInt(box.data, 1, 3);
			creationTime = MP4Structure.readInt(box.data, 4);
			modificationTime = MP4Structure.readInt(box.data, 8);
			trackID = MP4Structure.readInt(box.data, 12);
			duration = MP4Structure.readInt(box.data, 20);
			layer = MP4Structure.readShort(box.data, 32);
			alternateGroup = MP4Structure.readShort(box.data, 34);
			volume = MP4Structure.readShort(box.data, 36);
			matrixStructure = new byte[36];
			System.arraycopy(box.data, 40, matrixStructure, 0, 36);
			trackWidth = MP4Structure.readInt(box.data, 70);
			trackHeight = MP4Structure.readShort(box.data, 74);
			System.out.println(duration + " " + trackWidth + " " + trackHeight);
		}
	}
	public static class mdia {
		public mdia(Box box) {
			
		}
	}
	
	public static class trak {
		public udta[] udta;
		public tkhd tkhd;
		public mdia mdia;
		public trak(Box box) {
			{
				Box[] bxs = box.getChildrenByName("udta");
				udta = new udta[bxs.length];
				for(int i = 0; i < bxs.length; i++)
					udta[i] = new udta(bxs[i]);
			}
			{
				Box[] bxs = box.getChildrenByName("tkhd");
				if(bxs.length != 0)
					tkhd = new tkhd(bxs[0]);
			}
			{
				Box[] bxs = box.getChildrenByName("mdia");
				if(bxs.length != 0)
					mdia = new mdia(bxs[0]);
			}
			
		}
		
		
	}
	
	public static class ftyp {
		public ftyp(Box box) {
			
		}
	}
	
	public static class mdat {
		public mdat(Box box) {
			
		}
	}
	
	public moov[] moovs;
	public uuid uuid;
	public ftyp ftyp;
	public mdat mdat;
	
	public MP4Structure(Box root) {
		bb.set(ByteBuffer.allocate(8));
		root.printChildren();
		{
			Box[] bxs = root.getChildrenByName("moov");
			moovs = new moov[bxs.length];
			for(int i = 0; i < bxs.length; i++)
				moovs[i] = new moov(bxs[i]);
		}
		{
			Box[] bxs = root.getChildrenByName("uuid");
			if(bxs.length != 0)
				uuid = new uuid(bxs[0]);
		}
		{
			Box[] bxs = root.getChildrenByName("ftyp");
			if(bxs.length != 0)
				ftyp = new ftyp(bxs[0]);
		}
		{
			Box[] bxs = root.getChildrenByName("mdat");
			if(bxs.length != 0)
				mdat = new mdat(bxs[0]);
		}
		
	}

}
