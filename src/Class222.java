/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class222 {
	static boolean aBoolean1667 = false;
	int anInt1668;
	static OutgoingOpcode aClass171_1669 = new OutgoingOpcode(22, 7);
	static int anInt1670 = -1;
	static float[] aFloatArray1671 = { 0.0F, -1.0F, 0.0F, 0.0F };
	static int anInt1672;

	static final int method2824(byte i, Class98_Sub46_Sub8 class98_sub46_sub8) {
		try {
			String string = Class86.method845((byte) -124, class98_sub46_sub8);
			int[] is = null;
			if (Class299_Sub2.method3526(124, ((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990))
				is = ((ItemDefinition) (Class98_Sub46_Sub19.getItemDefs.getItemDefs((int) ((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987))).campaigns;
			else if ((((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5988 ^ 0xffffffff) != 0)
				is = ((ItemDefinition) (Class98_Sub46_Sub19.getItemDefs.getItemDefs(((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5988))).campaigns;
			else if (!Class36.method340(((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990, (byte) -70)) {
				if (Class98_Sub10_Sub21.method1064((((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990), false)) {
					Object object = null;
					Class352 class352;
					if (((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990 == 1009)
						class352 = (Class130.aClass302_1028.method3546((int) ((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987, (byte) 119));
					else
						class352 = (Class130.aClass302_1028.method3546((int) ((((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987 >>> 762669664) & 0x7fffffffL), (byte) 119));
					if (((Class352) class352).anIntArray2928 != null)
						class352 = class352.method3852(Class75.aClass140_584, (byte) -38);
					if (class352 != null)
						is = ((Class352) class352).anIntArray2934;
				}
			} else {
				Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) (int) ((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987, -1)));
				if (class98_sub39 != null) {
					Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
					Class141 class141 = (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504);
					if (((Class141) class141).anIntArray1109 != null)
						class141 = class141.method2300(Class75.aClass140_584, (byte) 55);
					if (class141 != null)
						is = ((Class141) class141).anIntArray1152;
				}
			}
			int i_0_ = -22 / ((i - 5) / 60);
			if (is != null)
				string += Class64_Sub25.method653(0, is);
			int i_1_ = Class42_Sub1.aClass197_5354.method2676((byte) -126, (Class217.aClass332Array3408), string);
			if (((Class98_Sub46_Sub8) class98_sub46_sub8).aBoolean5983)
				i_1_ += Class284_Sub2_Sub2.aClass332_6199.method3734() + 4;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oe.D(" + i + ',' + (class98_sub46_sub8 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2825(int i, int i_2_) {
		try {
			if (i >= -31)
				return -69;
			int i_3_ = i_2_ * (i_2_ * i_2_ >> -1546827604) >> -2091093524;
			int i_4_ = i_2_ * 6 - 61440;
			int i_5_ = (i_2_ * i_4_ >> -1680263604) + 40960;
			return i_3_ * i_5_ >> -94375156;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oe.B(" + i + ',' + i_2_ + ')');
		}
	}

	static final boolean method2826(Class246_Sub3_Sub4 class246_sub3_sub4, boolean bool) {
		boolean bool_6_ = Class78.activeTileHeightMap == Class81.aSArray618;
		int i = 0;
		short i_7_ = 0;
		byte i_8_ = 0;
		class246_sub3_sub4.method3022(-8675);
		if (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158 < 0 || ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157 < 0 || (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6160 >= Class366.anInt3112) || (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6159 >= Class64_Sub9.anInt3662))
			return false;
		short i_9_ = 0;
		for (int i_10_ = ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158; i_10_ <= ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6160; i_10_++) {
			for (int i_11_ = ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157; i_11_ <= ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6159; i_11_++) {
				Class172 class172 = Class100.method1693((((AnimableEntity) class246_sub3_sub4).height_level), i_10_, i_11_);
				if (class172 != null) {
					Class154 class154 = Class299_Sub2.method3524((byte) -90, class246_sub3_sub4);
					Class154 class154_12_ = ((Class172) class172).aClass154_1325;
					if (class154_12_ == null)
						((Class172) class172).aClass154_1325 = class154;
					else {
						for (/**/; ((Class154) class154_12_).aClass154_1233 != null; class154_12_ = ((Class154) class154_12_).aClass154_1233) {
							/* empty */
						}
						((Class154) class154_12_).aClass154_1233 = class154;
					}
					if (bool_6_ && (Class40.anIntArrayArray367[i_10_][i_11_] & ~0xffffff) != 0) {
						i = Class40.anIntArrayArray367[i_10_][i_11_];
						i_7_ = Class304.aShortArrayArray2534[i_10_][i_11_];
						i_8_ = Class299_Sub2.aByteArrayArray5291[i_10_][i_11_];
					}
					if (!bool && (((Class172) class172).aClass246_Sub3_Sub1_1332 != null) && (((Class246_Sub3_Sub1) ((Class172) class172).aClass246_Sub3_Sub1_1332).aShort6149) > i_9_)
						i_9_ = (((Class246_Sub3_Sub1) ((Class172) class172).aClass246_Sub3_Sub1_1332).aShort6149);
				}
			}
		}
		if (bool_6_ && (i & ~0xffffff) != 0) {
			for (int i_13_ = ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158; i_13_ <= ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6160; i_13_++) {
				for (int i_14_ = (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157); (i_14_ <= ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6159); i_14_++) {
					if ((Class40.anIntArrayArray367[i_13_][i_14_] & ~0xffffff) == 0) {
						Class40.anIntArrayArray367[i_13_][i_14_] = i;
						Class304.aShortArrayArray2534[i_13_][i_14_] = i_7_;
						Class299_Sub2.aByteArrayArray5291[i_13_][i_14_] = i_8_;
					}
				}
			}
		}
		if (bool)
			Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[Class347.anInt2907++] = class246_sub3_sub4;
		else {
			int i_15_ = Class78.activeTileHeightMap == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub4.method2978(-127)) {
				if (class246_sub3_sub4.method2987(6540)) {
					((AnimableEntity) class246_sub3_sub4).aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_15_];
					Class359.aClass246_Sub3Array3056[i_15_] = class246_sub3_sub4;
				} else {
					((AnimableEntity) class246_sub3_sub4).aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_15_];
					Class379.aClass246_Sub3Array3198[i_15_] = class246_sub3_sub4;
					Class358.aBoolean3033 = true;
				}
			} else {
				((AnimableEntity) class246_sub3_sub4).aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_15_];
				Class130.aClass246_Sub3Array1029[i_15_] = class246_sub3_sub4;
			}
		}
		if (bool)
			((AnimableEntity) class246_sub3_sub4).anInt5089 -= i_9_;
		return true;
	}

	public static void method2827(byte i) {
		try {
			if (i > -7)
				method2826(null, true);
			aClass171_1669 = null;
			aFloatArray1671 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oe.A(" + i + ')');
		}
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oe.toString(" + ')');
		}
	}

	Class222(int i, int i_16_) {
		try {
			((Class222) this).anInt1668 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oe.<init>(" + i + ',' + i_16_ + ')'));
		}
	}
}
