/* Class224_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class224_Sub2 extends Class224 {
	static final Class250 method2836(int[] is, boolean bool, ModelDefinitions class178, int i) {
		try {
			if (bool != true)
				return null;
			int[] is_0_ = null;
			int[] is_1_ = null;
			int[] is_2_ = null;
			float[][] fs = null;
			if (class178.aByteArray1420 != null) {
				int i_3_ = class178.anInt1396;
				int[] is_4_ = new int[i_3_];
				int[] is_5_ = new int[i_3_];
				int[] is_6_ = new int[i_3_];
				int[] is_7_ = new int[i_3_];
				int[] is_8_ = new int[i_3_];
				int[] is_9_ = new int[i_3_];
				for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
					is_4_[i_10_] = 2147483647;
					is_5_[i_10_] = -2147483647;
					is_6_[i_10_] = 2147483647;
					is_7_[i_10_] = -2147483647;
					is_8_[i_10_] = 2147483647;
					is_9_[i_10_] = -2147483647;
				}
				for (int i_11_ = 0; i_11_ < i; i_11_++) {
					int i_12_ = is[i_11_];
					if (class178.aByteArray1420[i_12_] != -1) {
						int i_13_ = (0xff & class178.aByteArray1420[i_12_]);
						for (int i_14_ = 0; i_14_ < 3; i_14_++) {
							short i_15_;
							if (i_14_ != 0) {
								if (i_14_ != 1)
									i_15_ = (class178.aShortArray1392[i_12_]);
								else
									i_15_ = (class178.aShortArray1410[i_12_]);
							} else
								i_15_ = (class178.aShortArray1393[i_12_]);
							int i_16_ = class178.anIntArray1416[i_15_];
							int i_17_ = class178.anIntArray1400[i_15_];
							int i_18_ = class178.anIntArray1418[i_15_];
							if (is_4_[i_13_] > i_16_)
								is_4_[i_13_] = i_16_;
							if (i_16_ > is_5_[i_13_])
								is_5_[i_13_] = i_16_;
							if (is_6_[i_13_] > i_17_)
								is_6_[i_13_] = i_17_;
							if (is_7_[i_13_] < i_17_)
								is_7_[i_13_] = i_17_;
							if (i_18_ < is_8_[i_13_])
								is_8_[i_13_] = i_18_;
							if (i_18_ > is_9_[i_13_])
								is_9_[i_13_] = i_18_;
						}
					}
				}
				fs = new float[i_3_][];
				is_0_ = new int[i_3_];
				is_1_ = new int[i_3_];
				is_2_ = new int[i_3_];
				for (int i_19_ = 0; i_19_ < i_3_; i_19_++) {
					byte i_20_ = class178.aByteArray1388[i_19_];
					if (i_20_ > 0) {
						is_0_[i_19_] = (is_5_[i_19_] + is_4_[i_19_]) / 2;
						is_1_[i_19_] = (is_6_[i_19_] + is_7_[i_19_]) / 2;
						is_2_[i_19_] = (is_8_[i_19_] + is_9_[i_19_]) / 2;
						float f;
						float f_21_;
						float f_22_;
						if (i_20_ == 1) {
							int i_23_ = class178.anIntArray1389[i_19_];
							f = 64.0F / (float) (class178.anIntArray1404[i_19_]);
							if (i_23_ != 0) {
								if (i_23_ > 0) {
									f_22_ = (float) i_23_ / 1024.0F;
									f_21_ = 1.0F;
								} else {
									f_21_ = (float) -i_23_ / 1024.0F;
									f_22_ = 1.0F;
								}
							} else {
								f_22_ = 1.0F;
								f_21_ = 1.0F;
							}
						} else if (i_20_ != 2) {
							f = (float) (class178.anIntArray1404[i_19_]) / 1024.0F;
							f_21_ = (float) (class178.anIntArray1389[i_19_]) / 1024.0F;
							f_22_ = (float) (class178.anIntArray1390[i_19_]) / 1024.0F;
						} else {
							f = 64.0F / (float) (class178.anIntArray1404[i_19_]);
							f_21_ = 64.0F / (float) (class178.anIntArray1389[i_19_]);
							f_22_ = 64.0F / (float) (class178.anIntArray1390[i_19_]);
						}
						fs[i_19_] = (Class349.method3839((byte) 123, Class202.method2702((class178.aByteArray1423[i_19_]), 255), f_21_, f, class178.aShortArray1385[i_19_], class178.aShortArray1421[i_19_], f_22_, class178.aShortArray1403[i_19_]));
					}
				}
			}
			return new Class250(is_0_, is_1_, is_2_, fs);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ih.D(" + (is != null ? "{...}" : "null") + ',' + bool + ',' + (class178 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2837(boolean bool, GameInterfaceData[] class293s, int i, boolean bool_24_, int i_25_, int i_26_) {
		try {
			if (bool_24_ == true) {
				for (int i_27_ = 0; class293s.length > i_27_; i_27_++) {
					GameInterfaceData class293 = class293s[i_27_];
					if (class293 != null && (i_26_ == class293.anInt2234)) {
						Class253.method3180(i_25_, i, 1375731712, class293, bool);
						Class98_Sub8.method986(i, i_25_, class293, 119);
						if (class293.anInt2246 > (-class293.anInt2311 + class293.anInt2290))
							class293.anInt2246 = (-class293.anInt2311 + class293.anInt2290);
						if ((-class293.anInt2258 + class293.anInt2228) < class293.anInt2213)
							class293.anInt2213 = (class293.anInt2228 + -class293.anInt2258);
						if (class293.anInt2246 < 0)
							class293.anInt2246 = 0;
						if (class293.anInt2213 < 0)
							class293.anInt2213 = 0;
						if (class293.type == 0)
							Class63.method549(class293, bool, (byte) 61);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ih.C(" + bool + ',' + (class293s != null ? "{...}" : "null") + ',' + i + ',' + bool_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}
}
