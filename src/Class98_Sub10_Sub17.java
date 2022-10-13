/* Class98_Sub10_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub17 extends Class98_Sub10 {
	private int anInt5622 = 585;
	static int anInt5623 = -1;
	static int[] anIntArray5624 = new int[14];
	static String[] aStringArray5625 = new String[200];

	public Class98_Sub10_Sub17() {
		super(0, true);
	}

	public static void method1053(byte i) {
		do {
			try {
				aStringArray5625 = null;
				anIntArray5624 = null;
				if (i == 40)
					break;
				method1053((byte) 11);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ks.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method990(int i, int i_0_) {
		try {
			int[] is = this.aClass16_3863.method237((byte) 98, i_0_);
			if (i != 255)
				return null;
			if (this.aClass16_3863.aBoolean198) {
				int i_1_ = Class352.anIntArray3001[i_0_];
				for (int i_2_ = 0; Class25.anInt268 > i_2_; i_2_++) {
					int i_3_ = Class64_Sub1.anIntArray3640[i_2_];
					if (i_3_ > anInt5622 && i_3_ < 4096 - anInt5622 && -anInt5622 + 2048 < i_1_ && i_1_ < anInt5622 + 2048) {
						int i_4_ = -i_3_ + 2048;
						i_4_ = i_4_ >= 0 ? i_4_ : -i_4_;
						i_4_ <<= 12;
						i_4_ /= 2048 + -anInt5622;
						is[i_2_] = -i_4_ + 4096;
					} else if (2048 - anInt5622 < i_3_ && i_3_ < 2048 + anInt5622) {
						int i_5_ = i_1_ + -2048;
						i_5_ = i_5_ < 0 ? -i_5_ : i_5_;
						i_5_ -= anInt5622;
						i_5_ <<= 12;
						is[i_2_] = i_5_ / (2048 + -anInt5622);
					} else if (i_1_ < anInt5622 || -anInt5622 + 4096 < i_1_) {
						int i_6_ = -2048 + i_3_;
						i_6_ = i_6_ < 0 ? -i_6_ : i_6_;
						i_6_ -= anInt5622;
						i_6_ <<= 12;
						is[i_2_] = i_6_ / (2048 + -anInt5622);
					} else if (anInt5622 > i_3_ || (i_3_ > 4096 + -anInt5622)) {
						int i_7_ = -i_1_ + 2048;
						i_7_ = i_7_ < 0 ? -i_7_ : i_7_;
						i_7_ <<= 12;
						i_7_ /= 2048 + -anInt5622;
						is[i_2_] = 4096 + -i_7_;
					} else
						is[i_2_] = 0;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ks.G(" + i + ',' + i_0_ + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_8_) {
		try {
			if (i_8_ > -92)
				anInt5623 = -16;
			int i_9_ = i;
			if (i_9_ == 0)
				anInt5622 = class98_sub22.readShort();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ks.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_8_ + ')'));
		}
	}
}
