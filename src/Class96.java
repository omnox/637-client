
/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class96 {
	static int anInt801;
	static int anInt802;
	static int anInt803 = 0;
	static int anInt804 = 1339;
	/* synthetic */ static Class aClass805;

	static final void method922(boolean bool, int i) {
		do {
			try {
				if (bool) {
					if ((Class15.anInt185 ^ 0xffffffff) != 0)
						Class246.method2964(false, Class15.anInt185);
					for (GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.start_iteration(122)); class98_sub18 != null; class98_sub18 = (GameInterface) Class116.aClass377_964.iterate_next(-1)) {
						if (!class98_sub18.method941((byte) 78)) {
							class98_sub18 = ((GameInterface) Class116.aClass377_964.start_iteration(104));
							if (class98_sub18 == null)
								break;
						}
						Class196.method2666(i + 16399, false, class98_sub18, true);
					}
					Class15.anInt185 = -1;
					Class116.aClass377_964 = new Class377(8);
					Class76_Sub9.method768(118);
					Class15.anInt185 = Class19.anInt3450;
					Class40.method359(39, false);
					Class98_Sub43.method1481(2);
					ClientScript2Runtime.method3155(Class15.anInt185);
				}
				aa_Sub3.aBoolean3569 = true;
				if (i == -1)
					break;
				anInt804 = 122;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fv.B(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final void method923(int i, int i_0_) {
		try {
			GameInterface.anInt3951 = -1;
			Class257.anInt1948 = 1;
			Class1.aBoolean66 = false;
			Class76_Sub8.anInt3770 = -1;
			Class348.anInt2911 = i_0_;
			Class224_Sub3.anInt5037 = 0;
			Class269.aClass207_2025 = null;
			Class116.aClass98_Sub31_Sub2_965 = null;
			int i_1_ = -83 / ((i - 47) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fv.D(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method924(byte i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			int i_6_ = 0;
			int i_7_ = i_3_;
			if (i == -109) {
				int i_8_ = -i_3_;
				int i_9_ = -1;
				int i_10_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_ + i_3_);
				int i_11_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_ - i_3_);
				Class333.method3761(i_5_, Class97.anIntArrayArray814[i_2_], i_11_, i_10_, (byte) -125);
				while (i_7_ > i_6_) {
					i_9_ += 2;
					i_8_ += i_9_;
					if (i_8_ > 0) {
						i_7_--;
						i_8_ -= i_7_ << 1928097217;
						int i_12_ = -i_7_ + i_2_;
						int i_13_ = i_2_ + i_7_;
						if (i_13_ >= Class98_Sub10_Sub38.anInt5753 && ((Class218.anInt1635 ^ 0xffffffff) <= (i_12_ ^ 0xffffffff))) {
							int i_14_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_ - -i_6_);
							int i_15_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_ + -i_6_);
							if ((i_13_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff))
								Class333.method3761(i_5_, (Class97.anIntArrayArray814[i_13_]), i_15_, i_14_, (byte) -127);
							if (Class98_Sub10_Sub38.anInt5753 <= i_12_)
								Class333.method3761(i_5_, (Class97.anIntArrayArray814[i_12_]), i_15_, i_14_, (byte) -125);
						}
					}
					int i_16_ = -++i_6_ + i_2_;
					int i_17_ = i_6_ + i_2_;
					if (((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) && Class218.anInt1635 >= i_16_) {
						int i_18_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_7_ + i_4_);
						int i_19_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_ - i_7_);
						if (i_17_ <= Class218.anInt1635)
							Class333.method3761(i_5_, (Class97.anIntArrayArray814[i_17_]), i_19_, i_18_, (byte) -124);
						if (Class98_Sub10_Sub38.anInt5753 <= i_16_)
							Class333.method3761(i_5_, (Class97.anIntArrayArray814[i_16_]), i_19_, i_18_, (byte) -125);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fv.F(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final int method925(int i, int i_20_, int i_21_, boolean bool) {
		try {
			Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i, bool, 6);
			int i_22_ = -50 % ((-58 - i_20_) / 49);
			if (class98_sub3 == null)
				return -1;
			if (i_21_ < 0 || (((Class98_Sub3) class98_sub3).anIntArray3824.length ^ 0xffffffff) >= (i_21_ ^ 0xffffffff))
				return -1;
			return ((Class98_Sub3) class98_sub3).anIntArray3824[i_21_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fv.A(" + i + ',' + i_20_ + ',' + i_21_ + ',' + bool + ')'));
		}
	}

	static final void method926(int i, ha var_ha) {
		do {
			try {
				if ((i <= Class359.anInt3058 || Class98_Sub10_Sub9.aBoolean5585) && Class255.draggedComponent == null) {
					String string;
					if (!Class98_Sub10_Sub9.aBoolean5585 || (Class359.anInt3058 ^ 0xffffffff) <= -3) {
						if (Class109.aBoolean934 && RtKeyListener.key_listener.is_key_down(81, 5503) && Class359.anInt3058 > 2)
							string = (Class86.method845((byte) -124, Class266.aClass98_Sub46_Sub8_1994));
						else {
							Class98_Sub46_Sub8 class98_sub46_sub8 = Class266.aClass98_Sub46_Sub8_1994;
							if (class98_sub46_sub8 == null)
								break;
							string = Class86.method845((byte) -124, class98_sub46_sub8);
							int[] is = null;
							if (Class299_Sub2.method3526(127, (((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990)))
								is = ((ItemDefinition) (Class98_Sub46_Sub19.getItemDefs.getItemDefs((int) ((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987))).campaigns;
							else if ((((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5988 ^ 0xffffffff) != 0)
								is = ((ItemDefinition) (Class98_Sub46_Sub19.getItemDefs.getItemDefs(((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5988))).campaigns;
							else if (!Class36.method340((((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990), (byte) -61)) {
								if (Class98_Sub10_Sub21.method1064((((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990), false)) {
									Object object = null;
									Class352 class352;
									if (((Class98_Sub46_Sub8) class98_sub46_sub8).anInt5990 == 1009)
										class352 = (Class130.aClass302_1028.method3546((int) (((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987), (byte) 119));
									else
										class352 = (Class130.aClass302_1028.method3546((int) (((((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987) >>> -584445664) & 0x7fffffffL), (byte) 119));
									if (((Class352) class352).anIntArray2928 != null)
										class352 = (class352.method3852(Class75.aClass140_584, (byte) -48));
									if (class352 != null)
										is = (((Class352) class352).anIntArray2934);
								}
							} else {
								Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) (int) (((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5987), i + -3)));
								if (class98_sub39 != null) {
									Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
									Class141 class141 = (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504);
									if (((Class141) class141).anIntArray1109 != null)
										class141 = (class141.method2300(Class75.aClass140_584, (byte) 72));
									if (class141 != null)
										is = (((Class141) class141).anIntArray1152);
								}
							}
							if (is != null)
								string += Class64_Sub25.method653(0, is);
						}
					} else
						string = (Class287_Sub2.aString3272 + TextResources.aClass309_2618.get_text(Class374.anInt3159) + Class246_Sub3_Sub3.aString6156 + " ->");
					if (Class359.anInt3058 > 2)
						string += ("<col=ffffff> / " + (Class359.anInt3058 + -2) + (TextResources.MORE_OPTIONS.get_text(Class374.anInt3159)));
					if (Class282.aClass293_2129 != null) {
						Class43 class43 = Class282.aClass293_2129.method3460(-47, var_ha);
						if (class43 == null)
							class43 = Class98_Sub10_Sub34.aClass43_5730;
						class43.method416(Class341.anInt2858, ((GameInterfaceData) Class282.aClass293_2129).anInt2236, Class39_Sub1.anInt3591, ((GameInterfaceData) Class282.aClass293_2129).anInt2355, ((GameInterfaceData) Class282.aClass293_2129).anInt2258, Class76_Sub8.aRandom3767, ((GameInterfaceData) Class282.aClass293_2129).anInt2341, Class284_Sub1_Sub2.anIntArray6193, ((GameInterfaceData) Class282.aClass293_2129).anInt2311, string, ((GameInterfaceData) Class282.aClass293_2129).anInt2296, Class64_Sub5.anIntArray3652, -121, Class217.aClass332Array3408, Class314.anInt2690);
						Class246_Sub3_Sub4_Sub3.method3071(Class284_Sub1_Sub2.anIntArray6193[3], -1, Class284_Sub1_Sub2.anIntArray6193[2], Class284_Sub1_Sub2.anIntArray6193[0], Class284_Sub1_Sub2.anIntArray6193[1]);
					} else {
						if (Class265.aClass293_1979 == null || s_Sub1.aClass279_5197 != Class4.aClass279_86)
							break;
						int i_23_ = (Class98_Sub10_Sub34.aClass43_5730.method407(0, 16777215, 16 + Class64_Sub10.anInt3664, string, Class76_Sub8.aRandom3767, Class64_Sub5.anIntArray3652, Class39_Sub1.anInt3591, Class98_Sub10_Sub17.anInt5623 + 4, Class217.aClass332Array3408, -70));
						Class246_Sub3_Sub4_Sub3.method3071(16, -1, (Class42_Sub1.aClass197_5354.method2674(string, i + 106) - -i_23_), Class98_Sub10_Sub17.anInt5623 + 4, Class64_Sub10.anInt3664);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fv.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method927(int i) {
		do {
			try {
				int i_24_ = -1 % ((i - 46) / 46);
				if (!((Class88) Class98_Sub43_Sub2.aClass88_5907).aBoolean675) {
					try {
						Method method = (aClass805 != null ? aClass805 : (aClass805 = method929("java.lang.Runtime"))).getMethod("maxMemory", new Class[0]);
						if (method != null) {
							try {
								Runtime runtime = Runtime.getRuntime();
								Long var_long = (Long) method.invoke(runtime);
								Class292.anInt3359 = 1 + (int) (var_long.longValue() / 1048576L);
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						break;
					} catch (Exception exception) {
						break;
					}
				}
				Class292.anInt3359 = 96;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fv.C(" + i + ')');
			}
		} while (false);
	}

	static final void method928(byte i) {
		do {
			try {
				Class98_Sub37.aHa4185.L(Class284_Sub1_Sub2.anInt6192, ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub14_4049.method609((byte) 122) ^ 0xffffffff) == -2 ? Class263.anInt1965 - -256 << 1972322498 : -1), 0);
				if (i == -42)
					break;
				anInt803 = 54;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fv.G(" + i + ')');
			}
			break;
		} while (false);
	}

	/* synthetic */ static Class method929(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
