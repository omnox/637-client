/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Hashtable;

final class Class10 {
	@SuppressWarnings("rawtypes")
	static Hashtable aHashtable118;
	static int anInt119 = 0;

	static final void method196(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			Class231.method2875(256, i_1_);
			int i_6_ = 0;
			int i_7_ = -i_4_ + i_1_;
			if (i_7_ < 0)
				i_7_ = 0;
			int i_8_ = i_1_;
			int i_9_ = -i_1_;
			int i_10_ = i_7_;
			if (i < -16) {
				int i_11_ = -i_7_;
				int i_12_ = -1;
				int i_13_ = -1;
				int[] is = Class97.anIntArrayArray814[i_5_];
				int i_14_ = -i_7_ + i_2_;
				int i_15_ = i_7_ + i_2_;
				Class333.method3761(i_3_, is, i_2_ + -i_1_, i_14_, (byte) -125);
				Class333.method3761(i_0_, is, i_14_, i_15_, (byte) 116);
				Class333.method3761(i_3_, is, i_15_, i_2_ - -i_1_, (byte) 53);
				while (i_8_ > i_6_) {
					i_12_ += 2;
					i_13_ += 2;
					i_11_ += i_13_;
					i_9_ += i_12_;
					if (i_11_ >= 0 && i_10_ >= 1) {
						Class331.anIntArray2810[i_10_] = i_6_;
						i_10_--;
						i_11_ -= i_10_ << 251598881;
					}
					i_6_++;
					if ((i_9_ ^ 0xffffffff) <= -1) {
						i_8_--;
						i_9_ -= i_8_ << 1376638529;
						if ((i_8_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)) {
							int[] is_16_ = Class97.anIntArrayArray814[i_8_ + i_5_];
							int[] is_17_ = Class97.anIntArrayArray814[i_5_ + -i_8_];
							int i_18_ = i_2_ + i_6_;
							int i_19_ = i_2_ + -i_6_;
							Class333.method3761(i_3_, is_16_, i_19_, i_18_, (byte) 94);
							Class333.method3761(i_3_, is_17_, i_19_, i_18_, (byte) 93);
						} else {
							int[] is_20_ = Class97.anIntArrayArray814[i_8_ + i_5_];
							int[] is_21_ = Class97.anIntArrayArray814[-i_8_ + i_5_];
							int i_22_ = Class331.anIntArray2810[i_8_];
							int i_23_ = i_2_ + i_6_;
							int i_24_ = -i_6_ + i_2_;
							int i_25_ = i_22_ + i_2_;
							int i_26_ = -i_22_ + i_2_;
							Class333.method3761(i_3_, is_20_, i_24_, i_26_, (byte) -128);
							Class333.method3761(i_0_, is_20_, i_26_, i_25_, (byte) -123);
							Class333.method3761(i_3_, is_20_, i_25_, i_23_, (byte) -127);
							Class333.method3761(i_3_, is_21_, i_24_, i_26_, (byte) -124);
							Class333.method3761(i_0_, is_21_, i_26_, i_25_, (byte) -126);
							Class333.method3761(i_3_, is_21_, i_25_, i_23_, (byte) 33);
						}
					}
					int[] is_27_ = Class97.anIntArrayArray814[i_5_ - -i_6_];
					int[] is_28_ = Class97.anIntArrayArray814[i_5_ + -i_6_];
					int i_29_ = i_8_ + i_2_;
					int i_30_ = i_2_ - i_8_;
					if ((i_7_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff)) {
						Class333.method3761(i_3_, is_27_, i_30_, i_29_, (byte) 100);
						Class333.method3761(i_3_, is_28_, i_30_, i_29_, (byte) -123);
					} else {
						int i_31_ = ((i_10_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff) ? i_10_ : Class331.anIntArray2810[i_6_]);
						int i_32_ = i_31_ + i_2_;
						int i_33_ = -i_31_ + i_2_;
						Class333.method3761(i_3_, is_27_, i_30_, i_33_, (byte) -123);
						Class333.method3761(i_0_, is_27_, i_33_, i_32_, (byte) -126);
						Class333.method3761(i_3_, is_27_, i_32_, i_29_, (byte) -123);
						Class333.method3761(i_3_, is_28_, i_30_, i_33_, (byte) -126);
						Class333.method3761(i_0_, is_28_, i_33_, i_32_, (byte) 44);
						Class333.method3761(i_3_, is_28_, i_32_, i_29_, (byte) -128);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ao.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final void method197(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_) {
		try {
			int i_39_ = 26 % ((i_38_ - 74) / 42);
			for (int i_40_ = i_35_; (i_40_ ^ 0xffffffff) >= (i_36_ ^ 0xffffffff); i_40_++)
				Class333.method3761(i, Class97.anIntArrayArray814[i_40_], i_37_, i_34_, (byte) -125);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ao.C(" + i + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ')'));
		}
	}

	public static void method198(byte i) {
		do {
			try {
				aHashtable118 = null;
				if (i == -47)
					break;
				method196(21, -124, -34, -45, 31, -40, -29);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ao.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aHashtable118 = new Hashtable();
	}
}
