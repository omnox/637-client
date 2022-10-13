
/* Class98_Sub32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Class98_Sub32_Sub1 extends Class98_Sub32 implements ImageProducer {
	private Canvas aCanvas5884;
	private ImageConsumer anImageConsumer5885;
	static float aFloat5886;
	static OutgoingOpcode aClass171_5887 = new OutgoingOpcode(84, 4);
	private ColorModel aColorModel5888;
	static Class155[] aClass155Array5889;
	private Image anImage5890;

	public static void method1442(boolean bool) {
		try {
			if (bool != true)
				method1442(true);
			IncomingOpcode.hideComponentOpcode = null;
			aClass155Array5889 = null;
			aClass171_5887 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fu.L(" + bool + ')');
		}
	}

	private final synchronized void method1443(byte i) {
		try {
			if (anImageConsumer5885 != null) {
				anImageConsumer5885.setPixels(0, 0, ((Class98_Sub32) this).anInt4105, ((Class98_Sub32) this).anInt4110, aColorModel5888, ((Class98_Sub32) this).anIntArray4108, 0, ((Class98_Sub32) this).anInt4105);
				anImageConsumer5885.imageComplete(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fu.K(" + i + ')');
		}
	}

	final void method1434(Graphics graphics, int i, byte i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			method1444((byte) -75, i_3_, i_2_, i_1_, i_4_);
			if (i_0_ != -125)
				method1443((byte) 87);
			Shape shape = graphics.getClip();
			graphics.clipRect(i, i_5_, i_2_, i_4_);
			graphics.drawImage(anImage5890, i - i_1_, -i_3_ + i_5_, aCanvas5884);
			graphics.setClip(shape);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.A(" + (graphics != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method1441(int i, int i_6_, int i_7_, Canvas canvas) {
		try {
			((Class98_Sub32) this).anInt4105 = i_6_;
			((Class98_Sub32) this).anInt4110 = i;
			aCanvas5884 = canvas;
			((Class98_Sub32) this).anIntArray4108 = new int[(((Class98_Sub32) this).anInt4110 * ((Class98_Sub32) this).anInt4105)];
			aColorModel5888 = new DirectColorModel(32, 16711680, 65280, 255);
			anImage5890 = aCanvas5884.createImage(this);
			method1443((byte) 115);
			if (i_7_ != 4095)
				method1443((byte) 120);
			aCanvas5884.prepareImage(anImage5890, aCanvas5884);
			method1443((byte) 115);
			aCanvas5884.prepareImage(anImage5890, aCanvas5884);
			method1443((byte) 115);
			aCanvas5884.prepareImage(anImage5890, aCanvas5884);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.B(" + i + ',' + i_6_ + ',' + i_7_ + ',' + (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	public final void startProduction(ImageConsumer imageconsumer) {
		try {
			addConsumer(imageconsumer);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.startProduction(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	private final synchronized void method1444(byte i, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			if (i != -75)
				addConsumer(null);
			if (anImageConsumer5885 != null) {
				anImageConsumer5885.setPixels(i_10_, i_8_, i_9_, i_11_, aColorModel5888, ((Class98_Sub32) this).anIntArray4108, ((Class98_Sub32) this).anInt4105 * i_8_ - -i_10_, ((Class98_Sub32) this).anInt4105);
				anImageConsumer5885.imageComplete(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.J(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	public final synchronized void addConsumer(ImageConsumer imageconsumer) {
		try {
			anImageConsumer5885 = imageconsumer;
			imageconsumer.setDimensions(((Class98_Sub32) this).anInt4105, ((Class98_Sub32) this).anInt4110);
			imageconsumer.setProperties(null);
			imageconsumer.setColorModel(aColorModel5888);
			imageconsumer.setHints(14);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.addConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		try {
			if (anImageConsumer5885 != imageconsumer)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.isConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void removeConsumer(ImageConsumer imageconsumer) {
		try {
			if (imageconsumer == anImageConsumer5885)
				anImageConsumer5885 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.removeConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		/* empty */
	}
}
