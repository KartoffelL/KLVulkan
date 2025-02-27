//package Kartoffel.Licht.AGGraphics.Utils.ImGen;
//
//import Kartoffel.Licht.AGGraphics.utils.BufferedImage;
//import Kartoffel.Licht.AGGraphics.utils.Color;
//import Kartoffel.Licht.AGGraphics.utils.BufferedImage.PixelFunc;
//
//public class ImgUtil {
//	
//	public final static int CT_HORIZONTAL = 0;
//	public final static int CT_VERTICAL = 1;
//	
//	public static BufferedImage generateColorTransition(Color a, Color b, int res, int direction) {
//		BufferedImage bi = new BufferedImage(res, res, 4);
//		for(int i = 0; i < res; i++) {
//			for(int l = 0; l < res; l++) {
//				float c = (float)l/(float)res;
//				Color col = new Color((int)(a.getRed()*c+b.getRed()*(1-c)), (int)(a.getGreen()*c+b.getGreen()*(1-c)), (int)(a.getBlue()*c+b.getBlue()*(1-c)), (int)(a.getAlpha()*c+b.getAlpha()*(1-c)));
//				if(direction == CT_HORIZONTAL)
//					bi.setRGBA(l, i, col.getRGBA());
//				else 
//					bi.setRGBA(i, l, col.getRGBA());
//			}
//		}
//		return bi;
//	}
//	public static BufferedImage generateCircle(Color color, int resulation, int boundry) {
//		BufferedImage bi = new BufferedImage(resulation, resulation, 4);
//		
//		double distance = 0;
//		float p = 0;
//		for(int i = 0; i < resulation; i++) {
//			for(int l = 0; l < resulation; l++) {
//				distance = Math.sqrt(Math.pow(resulation/2-i, 2)+Math.pow(resulation/2-l, 2));
//				
//				if(boundry > 0) {
//					p = (float) (-(Math.pow((distance-resulation/2), 2)/boundry)+1);
//					p = Math.max(0, Math.min(p, 1));
//				}
//				
//				Color col = new Color(color.getRGBA());
//				col = new Color(col.getRed()/255f, col.getGreen()/255f, col.getBlue()/255f, 1-p);
//				if(distance <= resulation/2)
//					bi.setRGBA(i, l, col.getRGBA());
//				else
//					bi.setRGBA(i, l, 0);
//			}
//		}
//		return bi;
//	}
//	
//	public static BufferedImage generateColorWheel(double beginn, int resulation, boolean white_center, int boundry) {
//		BufferedImage bi = new BufferedImage(resulation, resulation, 4);
//		
//		double distance = 0;
//		double rotation = 0;
//		float p = 0;
//		for(int i = 0; i < resulation; i++) {
//			for(int l = 0; l < resulation; l++) {
//				distance = Math.sqrt(Math.pow(resulation/2-i, 2)+Math.pow(resulation/2-l, 2));
//				rotation = Math.atan2(
//						resulation/2-i,
//						resulation/2-l
//						)+Math.toRadians(beginn);
//				
//				if(boundry > 0) {
//					p = (float) (-(Math.pow((distance-resulation/2), 2)/boundry)+1);
//					p = Math.max(0, Math.min(p, 1));
//				}
//				
//				Color col = Color.getHSBColor((float) (rotation/Math.PI/2), white_center ? (float) (distance/(resulation/2)) : 1, 1);
//				col = new Color(col.getRed()/255f, col.getGreen()/255f, col.getBlue()/255f, 1-p);
//				if(distance <= resulation/2)
//					bi.setRGBA(i, l, col.getRGBA());
//			}
//		}
//		
//		
//		
//		return bi;
//	}
//	
//	
//	public static BufferedImage generate3DBlock(Color a, Color b, int border, int resulationX, int resulationY) {
//		BufferedImage bi = new BufferedImage(resulationX, resulationY, 4);
//		for(int i = 0; i < resulationX; i++) {
//			for(int l = 0; l < resulationY; l++) {
//				if(i < border || i >= resulationX-border || l < border || l >= resulationY-border)
//					bi.setRGBA(i, l, a.getRGBA());
//				else
//					bi.setRGBA(i, l, b.getRGBA());
//			}
//		}
//		
//		
//		
//		return bi;
//	}
//	
//	public static BufferedImage blur(BufferedImage img, int width, int height) {
//		BufferedImage b = new BufferedImage(img.getWidth(), img.getHeight(), img.getChannels());
//		b.forEach(new PixelFunc() {
//			
//			@Override
//			public byte apply(byte value, byte channel, int x, int y) {
//				double val = 0;
//				for(int a = -width; a < width; a++) {
//					for(int b = -height; b < height; b++) {
//						val += (img.getData()[BufferedImage.mod(x+a, img.getWidth())][BufferedImage.mod(y+b, img.getHeight())][channel]&0x0FF)/255f;
//					}
//				}
//				return (byte) ((val/width/height/4)*255);
//			}
//		});
//		return b;
//	}
//	public static BufferedImage setChannel(BufferedImage img, byte val, int channel) {
//		img.forEach(new PixelFunc() {
//			
//			@Override
//			public byte apply(byte value, byte c, int x, int y) {
//				if(channel == c)
//					return val;
//				return value;
//			}
//		});
//		return img;
//	}
//
//}
