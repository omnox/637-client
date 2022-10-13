/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class40 {
	long aLong365;
	int[] anIntArray366;
	static int[][] anIntArrayArray367;
	short[] aShortArray368;
	short[] aShortArray370;

	static final void method359(int i, boolean bool) {
		try {
			Class378.method4005(Class39_Sub1.anInt3593, Class15.anInt185, -1, bool, Class98_Sub25.anInt4024);
			int i_0_ = 108 / ((i - -58) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.B(" + i + ',' + bool + ')');
		}
	}

	static final void method360(byte i) {
		do {
			try {
				Class98_Sub10_Sub2.method1009(-63);
				Class128.method2224(22696);
				if (i == 79)
					break;
				anIntArrayArray367 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cr.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method361(int i, int i_1_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i, -30, 16);
			class98_sub46_sub17.method1621(i_1_ + i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.E(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method362(byte i, int i_2_) {
		try {
			Class64_Sub25.anInt3711 = 3;
			Class287.anInt2186 = 100;
			Class98_Sub5_Sub2.anInt5536 = i_2_;
			int i_3_ = 77 % ((13 - i) / 54);
			Class256.anInt1945 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.C(" + i + ',' + i_2_ + ')');
		}
	}

	public static void method363(int i) {
		try {
			if (i >= -55)
				anIntArrayArray367 = null;
			anIntArrayArray367 = null;
			IncomingOpcode.aClass58_369 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.D(" + i + ')');
		}
	}

	static final void method364(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			int i_9_ = 0;
			int i_10_ = i;
			int i_11_ = i_5_ * i_5_;
			int i_12_ = 66 / ((-17 - i_7_) / 58);
			int i_13_ = i * i;
			int i_14_ = i_13_ << 1;
			int i_15_ = i_11_ << 1;
			int i_16_ = i << 1;
			int i_17_ = i_11_ * (1 + -i_16_) - -i_14_;
			int i_18_ = i_13_ - i_15_ * (i_16_ + -1);
			int i_19_ = i_11_ << 2;
			int i_20_ = i_13_ << 2;
			int i_21_ = ((i_9_ << 1) + 3) * i_14_;
			int i_22_ = i_15_ * (-3 + (i_10_ << 1));
			int i_23_ = (1 + i_9_) * i_20_;
			if (Class98_Sub10_Sub38.anInt5753 <= i_6_ && i_6_ <= Class218.anInt1635) {
				int i_24_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_ + i_5_);
				int i_25_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, -i_5_ + i_4_);
				Class333.method3761(i_8_, Class97.anIntArrayArray814[i_6_], i_25_, i_24_, (byte) -125);
			}
			int i_26_ = (-1 + i_10_) * i_19_;
			while (i_10_ > 0) {
				if (i_17_ < 0) {
					while (i_17_ < 0) {
						i_18_ += i_23_;
						i_17_ += i_21_;
						i_21_ += i_20_;
						i_9_++;
						i_23_ += i_20_;
					}
				}
				if (i_18_ < 0) {
					i_18_ += i_23_;
					i_17_ += i_21_;
					i_21_ += i_20_;
					i_9_++;
					i_23_ += i_20_;
				}
				i_17_ += -i_26_;
				i_18_ += -i_22_;
				i_26_ -= i_19_;
				i_22_ -= i_19_;
				i_10_--;
				int i_27_ = i_6_ - i_10_;
				int i_28_ = i_10_ + i_6_;
				if (Class98_Sub10_Sub38.anInt5753 <= i_28_ && Class218.anInt1635 >= i_27_) {
					int i_29_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_ + i_9_);
					int i_30_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, -i_9_ + i_4_);
					if (Class98_Sub10_Sub38.anInt5753 <= i_27_)
						Class333.method3761(i_8_, Class97.anIntArrayArray814[i_27_], i_30_, i_29_, (byte) 90);
					if (Class218.anInt1635 >= i_28_)
						Class333.method3761(i_8_, Class97.anIntArrayArray814[i_28_], i_30_, i_29_, (byte) 2);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cr.A(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	Class40(long l, int[] is, short[] is_31_, short[] is_32_) {
		try {
			this.aShortArray368 = is_32_;
			this.aLong365 = l;
			this.aShortArray370 = is_31_;
			this.anIntArray366 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cr.<init>(" + l + ',' + (is != null ? "{...}" : "null") + ',' + (is_31_ != null ? "{...}" : "null") + ',' + (is_32_ != null ? "{...}" : "null") + ')'));
		}
	}

	protected Class40() {
		/* empty */
	}
}
