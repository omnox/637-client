/* Class48_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48_Sub1_Sub1 extends Class48_Sub1 {
	private int anInt5501;
	private int anInt5502;
	static short[][] aShortArrayArray5503;
	private Class42_Sub2 aClass42_Sub2_5504;
	static float aFloat5505;
	private static short[] aShortArray5506;
	private int anInt5507;
	private int anInt5508;
	private int anInt5509;
	private ha_Sub1 aHa_Sub1_5510;
	private int anInt5511;
	private static short[] aShortArray5512 = { 6798, 8741, 25238, 4626, 4550 };
	private static short[] aShortArray5513;

	final Class42_Sub2 method456(byte i) {
		try {
			if (aClass42_Sub2_5504 == null) {
				Class63.anIntArray491[2] = anInt5501;
				Class63.anIntArray491[0] = anInt5509;
				Class63.anIntArray491[3] = anInt5502;
				Class63.anIntArray491[1] = anInt5511;
				d var_d = ((ha) aHa_Sub1_5510).aD938;
				Class63.anIntArray491[5] = anInt5507;
				Class63.anIntArray491[4] = anInt5508;
				int i_0_ = 0;
				int i_1_ = 0;
				for (int i_2_ = 0; i_2_ < 6; i_2_++) {
					if (!var_d.method8(-119, Class63.anIntArray491[i_2_]))
						return null;
					Class238 class238 = var_d.method11(Class63.anIntArray491[i_2_], -28755);
					int i_3_ = !((Class238) class238).aBoolean1822 ? 128 : 64;
					if (((Class238) class238).aByte1832 > 0)
						i_0_ = 1;
					if ((i_3_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
						i_1_ = i_3_;
				}
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -7; i_4_++)
					Class248.anIntArrayArray1895[i_4_] = var_d.method9(Class63.anIntArray491[i_4_], (byte) -126, i_1_, 1.0F, false, i_1_);
				aClass42_Sub2_5504 = new Class42_Sub2(aHa_Sub1_5510, 6407, i_1_, (i_0_ ^ 0xffffffff) != -1, Class248.anIntArrayArray1895);
			}
			if (i < 119)
				aShortArray5512 = null;
			return aClass42_Sub2_5504;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bja.E(" + i + ')');
		}
	}

	public static void method460(boolean bool) {
		try {
			if (bool != true)
				aShortArray5513 = null;
			aShortArray5512 = null;
			aShortArray5506 = null;
			aShortArray5513 = null;
			aShortArrayArray5503 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bja.G(" + bool + ')');
		}
	}

	static final void method461(int i, float f, int i_5_, int i_6_, float f_7_, int i_8_, float f_9_, float[] fs, int i_10_, float[] fs_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			i_13_ -= i_12_;
			i -= i_6_;
			i_15_ -= i_14_;
			float f_16_ = ((float) i_13_ * fs[2] + ((float) i_15_ * fs[0] + (float) i * fs[1]));
			if (i_8_ < 109)
				method460(false);
			float f_17_ = ((float) i_15_ * fs[3] + fs[4] * (float) i + (float) i_13_ * fs[5]);
			float f_18_ = (fs[8] * (float) i_13_ + ((float) i * fs[7] + (float) i_15_ * fs[6]));
			float f_19_;
			float f_20_;
			if (i_10_ != 0) {
				if ((i_10_ ^ 0xffffffff) != -2) {
					if (i_10_ != 2) {
						if ((i_10_ ^ 0xffffffff) == -4) {
							f_20_ = 0.5F + (f_16_ + f_7_);
							f_19_ = -f_17_ + f_9_ + 0.5F;
						} else if ((i_10_ ^ 0xffffffff) != -5) {
							f_20_ = f + -f_18_ + 0.5F;
							f_19_ = f_9_ + -f_17_ + 0.5F;
						} else {
							f_19_ = -f_17_ + f_9_ + 0.5F;
							f_20_ = 0.5F + (f_18_ + f);
						}
					} else {
						f_19_ = f_9_ + -f_17_ + 0.5F;
						f_20_ = f_7_ + -f_16_ + 0.5F;
					}
				} else {
					f_20_ = f_16_ + f_7_ + 0.5F;
					f_19_ = 0.5F + (f_18_ + f);
				}
			} else {
				f_19_ = 0.5F + (-f_18_ + f);
				f_20_ = f_16_ + f_7_ + 0.5F;
			}
			if (i_5_ != 1) {
				if ((i_5_ ^ 0xffffffff) == -3) {
					f_20_ = -f_20_;
					f_19_ = -f_19_;
				} else if ((i_5_ ^ 0xffffffff) == -4) {
					float f_21_ = f_20_;
					f_20_ = f_19_;
					f_19_ = -f_21_;
				}
			} else {
				float f_22_ = f_20_;
				f_20_ = -f_19_;
				f_19_ = f_22_;
			}
			fs_11_[0] = f_20_;
			fs_11_[1] = f_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bja.I(" + i + ',' + f + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + i_8_ + ',' + f_9_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_10_ + ',' + (fs_11_ != null ? "{...}" : "null") + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	static final boolean method462(int i, int i_23_) {
		try {
			if (i_23_ < 125)
				aShortArrayArray5503 = null;
			if ((i ^ 0xffffffff) != -1 && (i ^ 0xffffffff) != -2 && (i ^ 0xffffffff) != -3)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bja.H(" + i + ',' + i_23_ + ')');
		}
	}

	static final boolean method463(int i, String string) {
		try {
			if (i != -1)
				aFloat5505 = 1.2700646F;
			return Class124.aHashtable1015.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bja.F(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class48_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		try {
			anInt5502 = i_26_;
			anInt5511 = i_24_;
			anInt5507 = i_28_;
			anInt5509 = i;
			anInt5508 = i_27_;
			anInt5501 = i_25_;
			aHa_Sub1_5510 = var_ha_Sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bja.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ')'));
		}
	}

	static {
		aShortArray5506 = new short[] { -1, -1, -1, -1, -1 };
		aShortArray5513 = new short[] { -1, -1, -1, -1, -1 };
		aShortArrayArray5503 = new short[][] { aShortArray5512, aShortArray5513, aShortArray5506 };
	}
}
