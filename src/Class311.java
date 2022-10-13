/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class311 {
	private int anInt2654;
	private int anInt2655;
	private int anInt2656 = Class98_Sub13.method1138(16);
	private int[] anIntArray2657;
	private int anInt2658 = Class98_Sub13.method1138(24);
	private int anInt2659;
	private int anInt2660 = Class98_Sub13.method1138(24);

	final void method3619(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = (((Class71) Class98_Sub13.aClass71Array3885[anInt2655]).anInt530);
			int i_2_ = anInt2660 - anInt2658;
			int i_3_ = i_2_ / anInt2659;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class98_Sub13.aClass71Array3885[anInt2655].method714();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_)
								is[i_5_ + i_7_] = i_6_ % anInt2654;
							i_6_ /= anInt2654;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = anIntArray2657[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							int i_11_ = anInt2658 + i_5_ * anInt2659;
							Class71 class71 = Class98_Sub13.aClass71Array3885[i_10_];
							if (anInt2656 == 0) {
								int i_12_ = anInt2659 / ((Class71) class71).anInt530;
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = class71.method715();
									for (int i_15_ = 0; i_15_ < ((Class71) class71).anInt530; i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < anInt2659) {
									float[] fs_17_ = class71.method715();
									for (int i_18_ = 0; i_18_ < ((Class71) class71).anInt530; i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_)
							break;
					}
				}
			}
		}
	}

	Class311() {
		anInt2659 = Class98_Sub13.method1138(24) + 1;
		anInt2654 = Class98_Sub13.method1138(6) + 1;
		anInt2655 = Class98_Sub13.method1138(8);
		int[] is = new int[anInt2654];
		for (int i = 0; i < anInt2654; i++) {
			int i_19_ = 0;
			int i_20_ = Class98_Sub13.method1138(3);
			boolean bool = Class98_Sub13.method1134() != 0;
			if (bool)
				i_19_ = Class98_Sub13.method1138(5);
			is[i] = i_19_ << 3 | i_20_;
		}
		anIntArray2657 = new int[anInt2654 * 8];
		for (int i = 0; i < anInt2654 * 8; i++)
			anIntArray2657[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class98_Sub13.method1138(8) : -1);
	}
}
