/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

abstract class Class31 {
	String aString299;
	static int anInt300 = -2;
	static Interface17 anInterface17_301;
	int anInt302;

	abstract Socket method305(int i) throws IOException;

	static final void method306(int i, RSByteBuffer class98_sub22) {
		try {
			if ((-class98_sub22.position + class98_sub22.data.length) >= 1) {
				int i_0_ = class98_sub22.readUnsignedByte();
				if (i_0_ >= 0 && i_0_ <= 1 && i == 10090 && (class98_sub22.data.length - class98_sub22.position) >= 2) {
					int i_1_ = class98_sub22.readShort();
					if (i_1_ * 6 <= (class98_sub22.data.length - class98_sub22.position)) {
						for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
							int i_3_ = class98_sub22.readShort();
							int i_4_ = class98_sub22.readInt(-2);
							if (i_3_ < Class76_Sub5.anIntArray3744.length && VarpClass.aBooleanArray3246[i_3_] && ((Class345.aClass132_2889.method2237(i_3_, 101).aChar720) != 49 || i_4_ >= -1 && i_4_ <= 1))
								Class76_Sub5.anIntArray3744[i_3_] = i_4_;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cda.B(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method307(boolean bool) {
		do {
			try {
				anInterface17_301 = null;
				if (bool == true)
					break;
				method307(false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cda.E(" + bool + ')');
			}
			break;
		} while (false);
	}

	final Socket method308(byte i) throws IOException {
		try {
			if (i != -53)
				anInterface17_301 = null;
			return new Socket(this.aString299, this.anInt302);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cda.D(" + i + ')');
		}
	}

	static final int method309(int i, byte[] is, int i_5_) {
		try {
			if (i_5_ != -30091)
				anInterface17_301 = null;
			return Class365.method3937(i, is, 0, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cda.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_5_ + ')'));
		}
	}

	public Class31() {
		/* empty */
	}
}
