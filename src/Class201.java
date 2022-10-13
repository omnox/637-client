/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class201 {
	static int anInt1544 = 0;
	static int anInt1545;

	static final void method2696(int i, GameInterfaceData class293, ha var_ha, int i_0_, int i_1_) {
		do {
			try {
				aa var_aa = class293.method3469(var_ha, i + 117);
				if (var_aa != null) {
					var_ha.KA(i_0_, i_1_, ((GameInterfaceData) class293).anInt2311 + i_0_, i_1_ + ((GameInterfaceData) class293).anInt2258);
					if ((Class333.anInt3386 ^ 0xffffffff) == -3 || Class333.anInt3386 == 5 || Class64_Sub9.aClass332_3663 == null)
						var_ha.A(-16777216, var_aa, i_0_, i_1_);
					else {
						int i_2_;
						int i_3_;
						int i_4_;
						int i_5_;
						if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -5) {
							i_3_ = Class98_Sub46_Sub2_Sub2.anInt6295;
							i_5_ = Class135.anInt1051;
							i_2_ = 4096;
							i_4_ = (0x3fff & (int) -GameWorld.cameraGetHrot);
						} else {
							i_2_ = -(16 * Class151.anInt1213) + 4096;
							i_3_ = (((AnimableEntity) Player.selfPlayer).localXPos);
							i_4_ = 0x3fff & (Class204.anInt1553 + (int) -(GameWorld.cameraGetHrot));
							i_5_ = (((AnimableEntity) Player.selfPlayer).localYPos);
						}
						int i_6_ = (-(2 * (-104 + GameWorld.size_x)) + i_3_ / 128 + 48);
						int i_7_ = (-(i_5_ / 128) + 48 - (-(GameWorld.size_y * 4) - -(2 * GameWorld.size_y) - 208));
						Class64_Sub9.aClass332_3663.method3746((float) i_0_ + (float) (((GameInterfaceData) class293).anInt2311) / 2.0F, (float) i_1_ + (float) (((GameInterfaceData) class293).anInt2258) / 2.0F, (float) i_6_, (float) i_7_, i_2_, i_4_ << 1401446114, var_aa, i_0_, i_1_);
						for (Class98_Sub34 class98_sub34 = (Class98_Sub34) Class64_Sub8.aClass148_3659.method2418(32); class98_sub34 != null; class98_sub34 = (Class98_Sub34) Class64_Sub8.aClass148_3659.method2417(i ^ 0x64)) {
							int i_8_ = ((Class98_Sub34) class98_sub34).anInt4126;
							int i_9_ = ((0x3fff & (((Class370) Class64_Sub23.aClass370_3707).anIntArray3133[i_8_]) >> -86148882) + -Class272.anInt2038);
							int i_10_ = (-aa_Sub2.anInt3562 + ((((Class370) Class64_Sub23.aClass370_3707).anIntArray3133[i_8_]) & 0x3fff));
							int i_11_ = -(i_3_ / 128) + 2 + 4 * i_9_;
							int i_12_ = 2 + i_10_ * 4 - i_5_ / 128;
							Class164.method2522(i_11_, (((Class370) Class64_Sub23.aClass370_3707).anIntArray3138[i_8_]), i_1_, var_aa, var_ha, i ^ ~0x7997ff75, class293, i_0_, i_12_);
						}
						for (int i_13_ = 0; ((i_13_ ^ 0xffffffff) > (Class98_Sub10_Sub7.anInt5577 ^ 0xffffffff)); i_13_++) {
							int i_14_ = (-(i_3_ / 128) + 4 * Class19.anIntArray3451[i_13_] + 2);
							int i_15_ = (4 * Class6.anIntArray91[i_13_] + (2 + -(i_5_ / 128)));
							Class352 class352 = (Class130.aClass302_1028.method3546(Class79.anIntArray603[i_13_], (byte) 119));
							if (((Class352) class352).anIntArray2928 != null) {
								class352 = class352.method3852((Class75.aClass140_584), (byte) -95);
								if (class352 == null || ((Class352) class352).anInt2958 == -1)
									continue;
							}
							Class164.method2522(i_14_, (((Class352) class352).anInt2958), i_1_, var_aa, var_ha, -2040004466, class293, i_0_, i_15_);
						}
						for (Class98_Sub45 class98_sub45 = ((Class98_Sub45) AbstractModel.aClass377_1180.start_iteration(97)); class98_sub45 != null; class98_sub45 = ((Class98_Sub45) AbstractModel.aClass377_1180.iterate_next(-1))) {
							int i_16_ = (int) (0x3L & (((Node) class98_sub45).uid >> 1749334492));
							if ((i_16_ ^ 0xffffffff) == (Canvas_Sub1.anInt26 ^ 0xffffffff)) {
								int i_17_ = ((int) (0x3fffL & (((Node) class98_sub45).uid)) + -Class272.anInt2038);
								int i_18_ = ((int) (0x3fffL & (((Node) class98_sub45).uid) >> 65890382) + -aa_Sub2.anInt3562);
								int i_19_ = -(i_3_ / 128) + (2 + 4 * i_17_);
								int i_20_ = -(i_5_ / 128) + 2 + 4 * i_18_;
								Class4.method173(i_1_, i_20_, i_0_, class293, var_aa, i_19_, (byte) -24, (Class93.aClass332Array3512[0]));
							}
						}
						for (int i_21_ = 0; Class150.anInt1211 > i_21_; i_21_++) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) Class325.anIntArray2726[i_21_], i + -5)));
							if (class98_sub39 != null) {
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								if (class246_sub3_sub4_sub2_sub1.method3052((byte) 106) && (((((AnimableEntity) class246_sub3_sub4_sub2_sub1).height_level) ^ 0xffffffff) == ((((AnimableEntity) (Player.selfPlayer)).height_level) ^ 0xffffffff))) {
									Class141 class141 = (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504);
									if (class141 != null && (((Class141) class141).anIntArray1109) != null)
										class141 = (class141.method2300(Class75.aClass140_584, (byte) 78));
									if (class141 != null && ((Class141) class141).aBoolean1140 && (((Class141) class141).aBoolean1116)) {
										int i_22_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos) / 128 - i_3_ / 128);
										int i_23_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos) / 128 + -(i_5_ / 128));
										if (((Class141) class141).anInt1118 == -1)
											Class4.method173(i_1_, i_23_, i_0_, class293, var_aa, i_22_, (byte) -24, (Class93.aClass332Array3512[1]));
										else
											Class164.method2522(i_22_, (((Class141) class141).anInt1118), i_1_, var_aa, var_ha, -2040004466, class293, i_0_, i_23_);
									}
								}
							}
						}
						int i_24_ = Class2.anInt71;
						int[] is = Class319.anIntArray2705;
						for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff); i_25_++) {
							Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[is[i_25_]]);
							if (class246_sub3_sub4_sub2_sub2 != null && class246_sub3_sub4_sub2_sub2.method3055((byte) 106) && !((Player) class246_sub3_sub4_sub2_sub2).cursed_orb_id && (class246_sub3_sub4_sub2_sub2 != (Player.selfPlayer)) && (((((AnimableEntity) (Player.selfPlayer)).height_level) ^ 0xffffffff) == ((((AnimableEntity) class246_sub3_sub4_sub2_sub2).height_level) ^ 0xffffffff))) {
								int i_26_ = (-(i_3_ / 128) + (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localXPos) / 128);
								int i_27_ = (-(i_5_ / 128) + (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localYPos) / 128);
								boolean bool = false;
								for (int i_28_ = 0; ((Class314.anInt2692 ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
									if ((((Player) class246_sub3_sub4_sub2_sub2).displayName.equals(Class98_Sub25.aStringArray4026[i_28_])) && (Class98_Sub26.anIntArray4030[i_28_] ^ 0xffffffff) != -1) {
										bool = true;
										break;
									}
								}
								boolean bool_29_ = false;
								for (int i_30_ = 0; Class32.anInt308 > i_30_; i_30_++) {
									if (((Player) class246_sub3_sub4_sub2_sub2).displayName.equals(((Class147) Class374.aClass147Array3157[i_30_]).aString1186)) {
										bool_29_ = true;
										break;
									}
								}
								boolean bool_31_ = false;
								if ((((Player) (Player.selfPlayer)).team) != 0 && ((((Player) class246_sub3_sub4_sub2_sub2).team) ^ 0xffffffff) != -1 && (((((Player) (Player.selfPlayer)).team) ^ 0xffffffff) == ((((Player) class246_sub3_sub4_sub2_sub2).team) ^ 0xffffffff)))
									bool_31_ = true;
								if (((Player) class246_sub3_sub4_sub2_sub2).aBoolean6534)
									Class4.method173(i_1_, i_27_, i_0_, class293, var_aa, i_26_, (byte) -24, (Class93.aClass332Array3512[6]));
								else if (bool)
									Class4.method173(i_1_, i_27_, i_0_, class293, var_aa, i_26_, (byte) -24, (Class93.aClass332Array3512[3]));
								else if (bool_29_)
									Class4.method173(i_1_, i_27_, i_0_, class293, var_aa, i_26_, (byte) -24, (Class93.aClass332Array3512[5]));
								else if (bool_31_)
									Class4.method173(i_1_, i_27_, i_0_, class293, var_aa, i_26_, (byte) -24, (Class93.aClass332Array3512[4]));
								else
									Class4.method173(i_1_, i_27_, i_0_, class293, var_aa, i_26_, (byte) -24, (Class93.aClass332Array3512[2]));
							}
						}
						Class36[] class36s = Class104.aClass36Array903;
						for (int i_32_ = 0; ((i_32_ ^ 0xffffffff) > (class36s.length ^ 0xffffffff)); i_32_++) {
							Class36 class36 = class36s[i_32_];
							if (class36 != null && ((Class36) class36).anInt346 != 0 && ((Class215.anInt1614 % 20 ^ 0xffffffff) > -11)) {
								if ((((Class36) class36).anInt346 ^ 0xffffffff) == -2) {
									Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) (((Class36) class36).anInt345), -1)));
									if (class98_sub39 != null) {
										Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
										int i_33_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos) / 128 - i_3_ / 128);
										int i_34_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos) / 128 - i_5_ / 128);
										Class98_Sub10_Sub29.method1090(((Class36) class36).anInt341, var_aa, i_34_, i_33_, class293, i_1_, 360000L, i_0_, 4);
									}
								}
								if (((Class36) class36).anInt346 == 2) {
									int i_35_ = (-(i_3_ / 128) + (((Class36) class36).anInt338 / 128));
									int i_36_ = (-(i_5_ / 128) + (((Class36) class36).anInt347 / 128));
									long l = (long) (((Class36) class36).anInt340 << 546406215);
									l *= l;
									Class98_Sub10_Sub29.method1090(((Class36) class36).anInt341, var_aa, i_36_, i_35_, class293, i_1_, l, i_0_, 4);
								}
								if (((Class36) class36).anInt346 == 10 && (((Class36) class36).anInt345 ^ 0xffffffff) <= -1 && (((Class36) class36).anInt345 < (Class151_Sub9.playerArray).length)) {
									Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[((Class36) class36).anInt345]);
									if (class246_sub3_sub4_sub2_sub2 != null) {
										int i_37_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub2).localXPos) / 128 - i_3_ / 128);
										int i_38_ = (-(i_5_ / 128) + (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localYPos) / 128);
										Class98_Sub10_Sub29.method1090(((Class36) class36).anInt341, var_aa, i_38_, i_37_, class293, i_1_, 360000L, i_0_, 4);
									}
								}
							}
						}
						if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) != -5) {
							if ((Class269.anInt2024 ^ 0xffffffff) != -1) {
								int i_39_ = (-(i_3_ / 128) + 2 + (4 * Class269.anInt2024 + (Player.selfPlayer.getSize() + -1) * 2));
								int i_40_ = (Class246_Sub3_Sub1_Sub2.anInt6251 * 4 + (2 - i_5_ / 128 - -(2 * (Player.selfPlayer.getSize() - 1))));
								Class4.method173(i_1_, i_40_, i_0_, class293, var_aa, i_39_, (byte) -24, (Class340.aClass332Array2848[(Class365.aBoolean3110 ? 1 : 0)]));
							}
							if (!((Player) Player.selfPlayer).cursed_orb_id)
								var_ha.method1760(3, 3, (-1 + ((GameInterfaceData) class293).anInt2258 / 2 + i_1_), -1, (byte) -66, i_0_ - (-(((GameInterfaceData) class293).anInt2311 / 2) - -1));
						}
					}
					if (i == 4)
						break;
					anInt1545 = 36;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("nda.B(" + i + ',' + (class293 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2697(int i, boolean bool) {
		try {
			if (i == -546) {
				int i_41_ = Class246_Sub4_Sub2.anInt6184;
				int i_42_ = Class64_Sub20.anInt3696;
				if (bool && Class239.aBoolean1839) {
					i_41_ <<= 1;
					i_42_ = -i_41_;
				}
				Class265.aHa1974.f(i_42_, i_41_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nda.A(" + i + ',' + bool + ')');
		}
	}
}
