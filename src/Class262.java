/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class262 {
	static int[] anIntArray1961 = { 32, 39, 44, 47 };
	static int[] anIntArray1962 = new int[3];

	static final void method3213() {
		for (int i = Class32.anInt305; i < Class364.anInt3103; i++) {
			for (int i_0_ = 0; i_0_ < Class366.anInt3112; i_0_++) {
				for (int i_1_ = 0; i_1_ < Class64_Sub9.anInt3662; i_1_++) {
					Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_]);
					if (class172 != null) {
						Class246_Sub3_Sub3 class246_sub3_sub3 = ((Class172) class172).aClass246_Sub3_Sub3_1324;
						Class246_Sub3_Sub3 class246_sub3_sub3_2_ = ((Class172) class172).aClass246_Sub3_Sub3_1333;
						if (class246_sub3_sub3 != null && class246_sub3_sub3.method2982((byte) -105)) {
							Class64_Sub2.method562(class246_sub3_sub3, i, i_0_, i_1_, 1, 1);
							if (class246_sub3_sub3_2_ != null && class246_sub3_sub3_2_.method2982((byte) -90)) {
								Class64_Sub2.method562(class246_sub3_sub3_2_, i, i_0_, i_1_, 1, 1);
								class246_sub3_sub3_2_.method2981(class246_sub3_sub3, (byte) -106, false, 0, Class98_Sub10_Sub30.aHa5709, 0, 0);
								class246_sub3_sub3_2_.method2992((byte) -73);
							}
							class246_sub3_sub3.method2992((byte) -73);
						}
						for (Class154 class154 = ((Class172) class172).aClass154_1325; class154 != null; class154 = ((Class154) class154).aClass154_1233) {
							Class246_Sub3_Sub4 class246_sub3_sub4 = (((Class154) class154).aClass246_Sub3_Sub4_1232);
							if (class246_sub3_sub4 != null && class246_sub3_sub4.method2982((byte) -128)) {
								Class64_Sub2.method562(class246_sub3_sub4, i, i_0_, i_1_, (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6160 - ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158 + 1), (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6159 - ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157 + 1));
								class246_sub3_sub4.method2992((byte) -73);
							}
						}
						Class246_Sub3_Sub1 class246_sub3_sub1 = ((Class172) class172).aClass246_Sub3_Sub1_1332;
						if (class246_sub3_sub1 != null && class246_sub3_sub1.method2982((byte) -93)) {
							Class98_Sub46_Sub9.method1553(class246_sub3_sub1, i, i_0_, i_1_);
							class246_sub3_sub1.method2992((byte) -73);
						}
					}
				}
			}
		}
	}

	public static void method3214(int i) {
		do {
			try {
				anIntArray1961 = null;
				anIntArray1962 = null;
				if (i <= -118)
					break;
				method3214(-8);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qh.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3215(int i, int[] is, int[] is_3_, Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1, int[] is_4_) {
		try {
			if (i == 26256) {
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (is_4_.length ^ 0xffffffff); i_5_++) {
					int i_6_ = is_4_[i_5_];
					int i_7_ = is_3_[i_5_];
					int i_8_ = is[i_5_];
					for (int i_9_ = 0; i_7_ != 0 && ((i_9_ ^ 0xffffffff) > ((((Mobile) class246_sub3_sub4_sub2_sub1).aClass226Array6387).length ^ 0xffffffff)); i_9_++) {
						if ((0x1 & i_7_ ^ 0xffffffff) != -1) {
							if ((i_6_ ^ 0xffffffff) != 0) {
								Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_6_, 16383);
								int i_10_ = ((Class97) class97).anInt819;
								Class226 class226 = (((Mobile) class246_sub3_sub4_sub2_sub1).aClass226Array6387[i_9_]);
								if (class226 != null) {
									if (((Class226) class226).anInt1700 != i_6_) {
										if ((((Class97) class97).anInt829 ^ 0xffffffff) <= (((Class97) (Class151_Sub7.aClass183_5001.method2623((((Class226) class226).anInt1700), i ^ 0x596f))).anInt829 ^ 0xffffffff))
											class226 = ((Mobile) class246_sub3_sub4_sub2_sub1).aClass226Array6387[i_9_] = null;
									} else if ((i_10_ ^ 0xffffffff) != -1) {
										if ((i_10_ ^ 0xffffffff) == -2) {
											((Class226) class226).anInt1707 = 0;
											((Class226) class226).anInt1702 = 0;
											((Class226) class226).anInt1704 = 0;
											((Class226) class226).anInt1703 = i_8_;
											((Class226) class226).anInt1701 = 1;
											if (!((Mobile) class246_sub3_sub4_sub2_sub1).aBoolean6371)
												Class349.method3840((byte) -127, class246_sub3_sub4_sub2_sub1, 0, class97);
										} else if ((i_10_ ^ 0xffffffff) == -3)
											((Class226) class226).anInt1704 = 0;
									} else
										class226 = ((Mobile) class246_sub3_sub4_sub2_sub1).aClass226Array6387[i_9_] = null;
								}
								if (class226 == null) {
									class226 = ((Mobile) class246_sub3_sub4_sub2_sub1).aClass226Array6387[i_9_] = new Class226();
									((Class226) class226).anInt1703 = i_8_;
									((Class226) class226).anInt1704 = 0;
									((Class226) class226).anInt1700 = i_6_;
									((Class226) class226).anInt1707 = 0;
									((Class226) class226).anInt1702 = 0;
									((Class226) class226).anInt1701 = 1;
									if (!((Mobile) class246_sub3_sub4_sub2_sub1).aBoolean6371)
										Class349.method3840((byte) -126, class246_sub3_sub4_sub2_sub1, 0, class97);
								}
							} else
								((Mobile) class246_sub3_sub4_sub2_sub1).aClass226Array6387[i_9_] = null;
						}
						i_7_ >>>= 1;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qh.A(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_3_ != null ? "{...}" : "null") + ',' + (class246_sub3_sub4_sub2_sub1 != null ? "{...}" : "null") + ',' + (is_4_ != null ? "{...}" : "null") + ')'));
		}
	}
}
