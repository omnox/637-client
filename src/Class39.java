/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class39 {
	static Class126 aClass126_361 = new Class126();
	static Class85 aClass85_362 = new Class85(14, 8);
	static int anInt363;
	static final String method349(int i, int i_0_, int i_1_, long l, boolean bool) {
		try {
			char c = ',';
			char c_2_ = '.';
			if (i == 0) {
				c_2_ = ',';
				c = '.';
			}
			if (i == 2)
				c_2_ = '\u00a0';
			boolean bool_3_ = false;
			if (i_1_ != 48)
				return null;
			if (l < 0L) {
				bool_3_ = true;
				l = -l;
			}
			StringBuffer stringbuffer = new StringBuffer(26);
			if (i_0_ > 0) {
				for (int i_4_ = 0; i_4_ < i_0_; i_4_++) {
					int i_5_ = (int) l;
					l /= 10L;
					stringbuffer.append((char) (-((int) l * 10) + 48 - -i_5_));
				}
				stringbuffer.append(c);
			}
			int i_6_ = 0;
			for (;;) {
				int i_7_ = (int) l;
				l /= 10L;
				stringbuffer.append((char) (i_7_ + (48 - 10 * (int) l)));
				if (l == 0)
					break;
				if (bool && ++i_6_ % 3 == 0)
					stringbuffer.append(c_2_);
			}
			if (bool_3_)
				stringbuffer.append('-');
			return stringbuffer.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cn.E(" + i + ',' + i_0_ + ',' + i_1_ + ',' + l + ',' + bool + ')'));
		}
	}

	static final void method350(int i, int i_8_, int i_9_, ha var_ha) {
		try {
			if (i_9_ >= 0 && i_8_ >= 0 && Class98_Sub46_Sub2.anInt5952 != 0 && Class282.anInt2132 != 0) {
				int i_10_;
				int i_11_;
				int i_12_;
				int i_13_;
				Class111 class111;
				int i_14_;
				int i_15_;
				if (za_Sub2.aBoolean6079) {
					Class98_Sub46_Sub14.method1604(false, (byte) 88);
					class111 = var_ha.method1752();
					int[] is = var_ha.Y();
					i_10_ = is[3];
					i_12_ = is[0];
					i_13_ = is[2];
					i_11_ = is[1];
					i_14_ = i_9_ - -Class98_Sub22_Sub1.method1253(false, i ^ ~0x7b40);
					i_15_ = Class364.method3932(false, (byte) -67) + i_8_;
				} else {
					var_ha.DA(Class98_Sub46_Sub11.anInt6025, Class98_Sub46_Sub20.anInt6074, Class98_Sub46_Sub2.anInt5952, Class282.anInt2132);
					i_10_ = Class282.anInt2132;
					i_11_ = Class98_Sub46_Sub20.anInt6074;
					i_12_ = Class98_Sub46_Sub11.anInt6025;
					i_13_ = Class98_Sub46_Sub2.anInt5952;
					var_ha.KA(Class98_Sub10_Sub17.anInt5623, Class64_Sub10.anInt3664, Class98_Sub46_Sub2.anInt5952, Class282.anInt2132);
					class111 = var_ha.method1821();
					class111.method2093(Class64_Sub28.anInt3717, Class98_Sub42.anInt4239, Class137.anInt1079, Class356.anInt3025, Class287_Sub2.anInt3274, Class64_Sub6.anInt3655);
					i_14_ = i_9_;
					var_ha.a(class111);
					i_15_ = i_8_;
				}
				if (i_13_ == 0)
					i_13_ = 1;
				Class201.method2697(-546, true);
				if (i_10_ == 0)
					i_10_ = 1;
				if (Class98_Sub46_Sub2_Sub2.aSArray6298 != null && (!Class98_Sub10_Sub9.aBoolean5585 || (Class98_Sub4.anInt3826 & 0x40) != 0)) {
					int i_16_ = -1;
					int i_17_ = -1;
					int i_18_ = var_ha.i();
					int i_19_ = var_ha.XA();
					int i_20_;
					int i_21_;
					int i_22_;
					int i_23_;
					if (Class239.aBoolean1839) {
						i_20_ = i_22_ = (-i_12_ + i_14_) * Class16.anInt197 / i_13_;
						i_23_ = i_21_ = Class16.anInt197 * (i_15_ - i_11_) / i_10_;
					} else {
						i_20_ = (-i_12_ + i_14_) * i_18_ / i_13_;
						i_21_ = i_19_ * (i_15_ - i_11_) / i_10_;
						i_22_ = i_19_ * (i_14_ - i_12_) / i_13_;
						i_23_ = (i_15_ + -i_11_) * i_18_ / i_10_;
					}
					int[] is = { i_20_, i_23_, i_18_ };
					int[] is_24_ = { i_22_, i_21_, i_19_ };
					class111.method2108(is);
					class111.method2108(is_24_);
					float f = RuneScapeCache.method2753(4, 10665, (float) is[2], (float) is_24_[0], (float) is_24_[1], (float) is[1], (float) is_24_[2], (float) is[0]);
					if (f > 0.0F) {
						int i_25_ = is_24_[0] + -is[0];
						int i_26_ = -is[2] + is_24_[2];
						int i_27_ = (int) ((float) i_25_ * f + (float) is[0]);
						int i_28_ = (int) ((float) is[2] + (float) i_26_ * f);
						i_16_ = i_27_ + (Player.selfPlayer.getSize() + -1 << 8) >> 9;
						i_17_ = (-1 + Player.selfPlayer.getSize() << 8) + i_28_ >> 9;
						int i_29_ = (Player.selfPlayer.height_level);
						if (i_29_ < 3 && (0x2 & (Class281.tileSettings[1][i_27_ >> 9][i_28_ >> 9])) != 0)
							i_29_++;
					}
					if (i_16_ != -1 && i_17_ != -1) {
						if (Class98_Sub10_Sub9.aBoolean5585 && (Class98_Sub4.anInt3826 & 0x40) != 0) {
							GameInterfaceData class293 = Class246_Sub9.method3139((byte) 72, Class187.anInt1450, Class310.anInt2652);
							if (class293 != null)
								GameInterfaceData.method3470(false, true, 0L, Class336.anInt2823, i_16_, " ->", true, i_17_, 46, i_16_ | i_17_, -1, false, Class287_Sub2.aString3272);
							else
								Class98_Sub10_Sub32.method1098((byte) 100);
						} else {
							if (Class98_Sub46_Sub1.aBoolean5943)
								GameInterfaceData.method3470(false, true, 0L, -1, i_16_, "", true, i_17_, 60, i_16_ | i_17_, -1, false, (TextResources.FACE_HERE.get_text(Class374.anInt3159)));
							GameInterfaceData.method3470(false, true, 0L, Class199.anInt1541, i_16_, "", true, i_17_, 6, i_16_ | i_17_, -1, false, Class218.aString1636);
						}
					}
				}
				if (za_Sub2.aBoolean6079)
					RuneScapeCache.method2765((byte) 119);
				for (int i_30_ = i; i_30_ < (!za_Sub2.aBoolean6079 ? 1 : 2); i_30_++) {
					boolean bool = i_30_ == 0;
					Class84 class84 = (bool ? Class98_Sub10_Sub27.aClass84_5692 : Class266.aClass84_1988);
					int i_31_ = i_9_;
					int i_32_ = i_8_;
					if (za_Sub2.aBoolean6079) {
						Class98_Sub46_Sub14.method1604(bool, (byte) 88);
						i_31_ += Class98_Sub22_Sub1.method1253(bool, -31553);
						i_32_ += Class364.method3932(bool, (byte) -67);
					}
					Class218 class218 = class84.aClass218_635;
					for (Class246_Sub1 class246_sub1 = (Class246_Sub1) class218.method2803((byte) 15); class246_sub1 != null; class246_sub1 = (Class246_Sub1) class218.method2809(false)) {
						if ((Class246_Sub3_Sub5_Sub2.aBoolean6272 || ((Player.selfPlayer.height_level) == class246_sub1.aClass246_Sub3_5069.height_level)) && class246_sub1.method2969(var_ha, i_31_, i_32_, -66)) {
							boolean bool_33_ = false;
							boolean bool_34_ = false;
							int i_35_;
							int i_36_;
							if ((class246_sub1.aClass246_Sub3_5069) instanceof Class246_Sub3_Sub4) {
								i_35_ = ((Class246_Sub3_Sub4) class246_sub1.aClass246_Sub3_5069).aShort6158;
								i_36_ = ((Class246_Sub3_Sub4) class246_sub1.aClass246_Sub3_5069).aShort6157;
							} else {
								i_35_ = (class246_sub1.aClass246_Sub3_5069.localXPos >> 9);
								i_36_ = (class246_sub1.aClass246_Sub3_5069.localYPos >> 9);
							}
							if ((class246_sub1.aClass246_Sub3_5069) instanceof Player) {
								Player class246_sub3_sub4_sub2_sub2 = ((Player) (class246_sub1.aClass246_Sub3_5069));
								int i_37_ = class246_sub3_sub4_sub2_sub2.getSize();
								if (((0x1 & i_37_) == 0 && (0x1ff & (class246_sub3_sub4_sub2_sub2.localXPos)) == 0 && (0x1ff & (class246_sub3_sub4_sub2_sub2.localYPos)) == 0) || ((0x1 & i_37_) == 1 && (0x1ff & (class246_sub3_sub4_sub2_sub2.localXPos)) == 256 && (0x1ff & (class246_sub3_sub4_sub2_sub2.localYPos)) == 256)) {
									int i_38_ = ((class246_sub3_sub4_sub2_sub2.localXPos) + -((-1 + class246_sub3_sub4_sub2_sub2.getSize()) << 8));
									int i_39_ = ((class246_sub3_sub4_sub2_sub2.localYPos) + -(class246_sub3_sub4_sub2_sub2.getSize() + -1 << 8));
									for (int i_40_ = 0; (Class150.anInt1211 > i_40_); i_40_++) {
										Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990(Class325.anIntArray2726[i_40_], i + -1)));
										if (class98_sub39 != null) {
											Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
											if (((class246_sub3_sub4_sub2_sub1.anInt6411) != Class215.anInt1614) && (class246_sub3_sub4_sub2_sub1.aBoolean6371)) {
												int i_41_ = (-((-1 + (class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112)) << 8) + (class246_sub3_sub4_sub2_sub1.localXPos));
												int i_42_ = (-((class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112) - 1 << 8) + (class246_sub3_sub4_sub2_sub1.localYPos));
												if ((i_38_ <= i_41_) && ((-(i_41_ - i_38_ >> 9) + (class246_sub3_sub4_sub2_sub2.getSize())) >= (class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112)) && (i_42_ >= i_39_) && ((class246_sub3_sub4_sub2_sub2.getSize() + -(-i_39_ + i_42_ >> 9)) >= (class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112))) {
													Class98_Sub10.method995(class246_sub3_sub4_sub2_sub1, (byte) 55, ((class246_sub1.aClass246_Sub3_5069.height_level) != (Player.selfPlayer.height_level)));
													class246_sub3_sub4_sub2_sub1.anInt6411 = Class215.anInt1614;
												}
											}
										}
									}
									int i_43_ = Class2.anInt71;
									int[] is = Class319.anIntArray2705;
									for (int i_44_ = 0; (i_44_ < i_43_); i_44_++) {
										Player class246_sub3_sub4_sub2_sub2_45_ = (Class151_Sub9.playerArray[is[i_44_]]);
										if ((class246_sub3_sub4_sub2_sub2_45_ != null) && ((class246_sub3_sub4_sub2_sub2_45_.anInt6411) != Class215.anInt1614) && (class246_sub3_sub4_sub2_sub2_45_ != class246_sub3_sub4_sub2_sub2) && (class246_sub3_sub4_sub2_sub2_45_.aBoolean6371)) {
											int i_46_ = ((class246_sub3_sub4_sub2_sub2_45_.localXPos) + -((-1 + class246_sub3_sub4_sub2_sub2_45_.getSize()) << 8));
											int i_47_ = ((class246_sub3_sub4_sub2_sub2_45_.localYPos) + -((-1 + class246_sub3_sub4_sub2_sub2_45_.getSize()) << 8));
											if (i_46_ >= i_38_ && (class246_sub3_sub4_sub2_sub2_45_.getSize() <= (-(i_46_ + -i_38_ >> 9) + class246_sub3_sub4_sub2_sub2.getSize())) && (i_47_ >= i_39_) && (class246_sub3_sub4_sub2_sub2_45_.getSize() <= (-(-i_39_ + i_47_ >> 9) + (class246_sub3_sub4_sub2_sub2.getSize())))) {
												Class98_Sub30.method1311(((class246_sub1.aClass246_Sub3_5069.height_level) != (Player.selfPlayer.height_level)), true, class246_sub3_sub4_sub2_sub2_45_);
												class246_sub3_sub4_sub2_sub2_45_.anInt6411 = Class215.anInt1614;
											}
										}
									}
								}
								if (Class215.anInt1614 == class246_sub3_sub4_sub2_sub2.anInt6411)
									continue;
								Class98_Sub30.method1311((class246_sub1.aClass246_Sub3_5069.height_level != (Player.selfPlayer.height_level)), true, class246_sub3_sub4_sub2_sub2);
								class246_sub3_sub4_sub2_sub2.anInt6411 = Class215.anInt1614;
							}
							if ((class246_sub1.aClass246_Sub3_5069) instanceof Class246_Sub3_Sub4_Sub2_Sub1) {
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = ((Class246_Sub3_Sub4_Sub2_Sub1) (class246_sub1.aClass246_Sub3_5069));
								if ((class246_sub3_sub4_sub2_sub1.aClass141_6504) != null) {
									if (((0x1 & class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112) == 0 && (0x1ff & (class246_sub3_sub4_sub2_sub1.localXPos)) == 0 && ((class246_sub3_sub4_sub2_sub1.localYPos) & 0x1ff) == 0) || (((0x1 & class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112) == 1) && ((class246_sub3_sub4_sub2_sub1.localXPos) & 0x1ff) == 256 && ((class246_sub3_sub4_sub2_sub1.localYPos) & 0x1ff) == 256)) {
										int i_48_ = (-((-1 + (class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112)) << 8) + (class246_sub3_sub4_sub2_sub1.localXPos));
										int i_49_ = ((class246_sub3_sub4_sub2_sub1.localYPos) + -((class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112) + -1 << 8));
										for (int i_50_ = 0; (i_50_ < Class150.anInt1211); i_50_++) {
											Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990(Class325.anIntArray2726[i_50_], -1)));
											if (class98_sub39 != null) {
												Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1_51_ = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
												if ((Class215.anInt1614 != (class246_sub3_sub4_sub2_sub1_51_.anInt6411)) && (class246_sub3_sub4_sub2_sub1 != class246_sub3_sub4_sub2_sub1_51_) && (class246_sub3_sub4_sub2_sub1_51_.aBoolean6371)) {
													int i_52_ = ((class246_sub3_sub4_sub2_sub1_51_.localXPos) - ((class246_sub3_sub4_sub2_sub1_51_.aClass141_6504.anInt1112) + -1 << 8));
													int i_53_ = ((class246_sub3_sub4_sub2_sub1_51_.localYPos) + -((-1 + (class246_sub3_sub4_sub2_sub1_51_.aClass141_6504.anInt1112)) << 8));
													if ((i_52_ >= i_48_) && (((class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112) - (-i_48_ + i_52_ >> 9)) >= (class246_sub3_sub4_sub2_sub1_51_.aClass141_6504.anInt1112)) && i_53_ >= i_49_ && ((class246_sub3_sub4_sub2_sub1_51_.aClass141_6504.anInt1112) <= (-(i_53_ - i_49_ >> 9) + (class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112)))) {
														Class98_Sub10.method995(class246_sub3_sub4_sub2_sub1_51_, (byte) 55, ((Player.selfPlayer.height_level) != (class246_sub1.aClass246_Sub3_5069.height_level)));
														class246_sub3_sub4_sub2_sub1_51_.anInt6411 = (Class215.anInt1614);
													}
												}
											}
										}
										int i_54_ = Class2.anInt71;
										int[] is = Class319.anIntArray2705;
										for (int i_55_ = 0; (i_55_ < i_54_); i_55_++) {
											Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[is[i_55_]]);
											if ((class246_sub3_sub4_sub2_sub2 != null) && (Class215.anInt1614 != (class246_sub3_sub4_sub2_sub2.anInt6411)) && (class246_sub3_sub4_sub2_sub2.aBoolean6371)) {
												int i_56_ = ((class246_sub3_sub4_sub2_sub2.localXPos) - ((class246_sub3_sub4_sub2_sub2.getSize() + -1) << 8));
												int i_57_ = ((class246_sub3_sub4_sub2_sub2.localYPos) - ((-1 + class246_sub3_sub4_sub2_sub2.getSize()) << 8));
												if (i_56_ >= i_48_ && ((-(-i_48_ + i_56_ >> 9) + (class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112)) >= class246_sub3_sub4_sub2_sub2.getSize()) && i_57_ >= i_49_ && (((class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112) + -(i_57_ - i_49_ >> 9)) >= class246_sub3_sub4_sub2_sub2.getSize())) {
													Class98_Sub30.method1311(((Player.selfPlayer.height_level) != (class246_sub1.aClass246_Sub3_5069.height_level)), true, class246_sub3_sub4_sub2_sub2);
													class246_sub3_sub4_sub2_sub2.anInt6411 = Class215.anInt1614;
												}
											}
										}
									}
									if (Class215.anInt1614 == (class246_sub3_sub4_sub2_sub1.anInt6411))
										continue;
									Class98_Sub10.method995(class246_sub3_sub4_sub2_sub1, (byte) 55, (class246_sub1.aClass246_Sub3_5069.height_level != (Player.selfPlayer.height_level)));
									class246_sub3_sub4_sub2_sub1.anInt6411 = Class215.anInt1614;
								}
							}
							if ((class246_sub1.aClass246_Sub3_5069) instanceof Class246_Sub3_Sub2_Sub1) {
								int i_58_ = Class272.anInt2038 + i_35_;
								int i_59_ = i_36_ - -aa_Sub2.anInt3562;
								Class98_Sub45 class98_sub45 = ((Class98_Sub45) (AbstractModel.aClass377_1180.method3990(i_58_ | (i_59_ << 14 | ((class246_sub1.aClass246_Sub3_5069.height_level) << 28)), -1)));
								if (class98_sub45 != null) {
									int i_60_ = 0;
									Class98_Sub26 class98_sub26 = ((Class98_Sub26) class98_sub45.aClass148_4254.method2427(i ^ ~0x6c));
									while (class98_sub26 != null) {
										ItemDefinition class297 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(class98_sub26.anInt4031));
										if (Class98_Sub10_Sub9.aBoolean5585 && ((class246_sub1.aClass246_Sub3_5069.height_level) == (Player.selfPlayer.height_level))) {
											ParamType class149 = ((Class98_Sub46_Sub1.anInt5945) != -1 ? (Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, (Class98_Sub46_Sub1.anInt5945))) : null);
											if (((Class98_Sub4.anInt3826 & 0x1) != 0) && (class149 == null || ((class297.method3494((Class98_Sub46_Sub1.anInt5945), (byte) -89, (class149.anInt1202))) != (class149.anInt1202))))
												GameInterfaceData.method3470(false, true, class98_sub26.anInt4031, Class336.anInt2823, i_35_, ((Class246_Sub3_Sub3.aString6156) + " -> <col=ff9040>" + (class297.name)), false, i_36_, 58, i_60_, -1, false, (Class287_Sub2.aString3272));
										}
										if ((Player.selfPlayer.height_level) == class246_sub1.aClass246_Sub3_5069.height_level) {
											String[] strings = (class297.itemGroundOption);
											for (int i_61_ = 4; i_61_ >= 0; i_61_--) {
												if (strings != null && (strings[i_61_] != null)) {
													int i_62_ = 0;
													if (i_61_ == 0)
														i_62_ = 13;
													int i_63_ = (Class284_Sub2.anInt5186);
													if (i_61_ == 1)
														i_62_ = 23;
													if (i_61_ == 2)
														i_62_ = 2;
													if (i_61_ == 3)
														i_62_ = 30;
													if ((class297.anInt2438) == i_61_)
														i_63_ = (class297.anInt2439);
													if (i_61_ == 4)
														i_62_ = 18;
													if (i_61_ == (class297.anInt2421))
														i_63_ = (class297.anInt2471);
													GameInterfaceData.method3470(false, true, class98_sub26.anInt4031, i_63_, i_35_, ("<col=ff9040>" + (class297.name)), false, i_36_, i_62_, i_60_, -1, false, strings[i_61_]);
												}
											}
										}
										GameInterfaceData.method3470(false, true, class98_sub26.anInt4031, Class16.anInt190, i_35_, ("<col=ff9040>" + (class297.name)), false, i_36_, 1008, i_60_, -1, ((class246_sub1.aClass246_Sub3_5069.height_level) != (Player.selfPlayer.height_level)), (TextResources.EXAMINE.get_text(Class374.anInt3159)));
										class98_sub26 = ((Class98_Sub26) class98_sub45.aClass148_4254.method2416((byte) -121));
										i_60_++;
									}
								}
							}
							if ((class246_sub1.aClass246_Sub3_5069) instanceof Interface19) {
								Interface19 interface19 = ((Interface19) (class246_sub1.aClass246_Sub3_5069));
								Class352 class352 = (Class130.aClass302_1028.method3546(interface19.method64(i ^ 0x7708), (byte) 119));
								if (class352.anIntArray2928 != null)
									class352 = class352.method3852((Class75.aClass140_584), (byte) -55);
								if (class352 != null) {
									if (Class98_Sub10_Sub9.aBoolean5585 && ((Player.selfPlayer.height_level) == class246_sub1.aClass246_Sub3_5069.height_level)) {
										ParamType class149 = (Class98_Sub46_Sub1.anInt5945 == -1 ? null : (Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, (Class98_Sub46_Sub1.anInt5945))));
										if ((0x4 & Class98_Sub4.anInt3826) != 0 && (class149 == null || ((class352.method3866((class149.anInt1202), (Class98_Sub46_Sub1.anInt5945), i ^ 0x1)) != (class149.anInt1202))))
											GameInterfaceData.method3470(false, true, (Class98_Sub10_Sub39.method1120(interface19, (byte) 113, i_35_, i_36_)), Class336.anInt2823, i_35_, ((Class246_Sub3_Sub3.aString6156) + " -> <col=00ffff>" + (class352.name)), false, i_36_, 50, interface19.hashCode(), -1, false, Class287_Sub2.aString3272);
									}
									if ((Player.selfPlayer.height_level) == class246_sub1.aClass246_Sub3_5069.height_level) {
										String[] strings = (class352.aStringArray2939);
										if (strings != null) {
											for (int i_64_ = 4; i_64_ >= 0; i_64_--) {
												if (strings[i_64_] != null) {
													int i_65_ = 0;
													if (i_64_ == 0)
														i_65_ = 15;
													int i_66_ = (Class284_Sub2.anInt5186);
													if (i_64_ == 1)
														i_65_ = 4;
													if (i_64_ == 2)
														i_65_ = 8;
													if (i_64_ == 3)
														i_65_ = 16;
													if (i_64_ == (class352.anInt3002))
														i_66_ = (class352.anInt3008);
													if (i_64_ == 4)
														i_65_ = 1007;
													if (i_64_ == (class352.anInt2933))
														i_66_ = (class352.anInt2977);
													GameInterfaceData.method3470(false, true, (Class98_Sub10_Sub39.method1120(interface19, (byte) 113, i_35_, i_36_)), i_66_, i_35_, ("<col=00ffff>" + (class352.name)), false, i_36_, i_65_, interface19.hashCode(), -1, false, strings[i_64_]);
												}
											}
										}
										GameInterfaceData.method3470(false, true, class352.id, Class16.anInt190, i_35_, ("<col=00ffff>" + (class352.name)), false, i_36_, 1009, interface19.hashCode(), -1, ((class246_sub1.aClass246_Sub3_5069.height_level) != (Player.selfPlayer.height_level)), (TextResources.EXAMINE.get_text(Class374.anInt3159)));
									}
								}
							}
						}
					}
					if (za_Sub2.aBoolean6079)
						RuneScapeCache.method2765((byte) 53);
				}
				Class201.method2697(-546, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cn.F(" + i + ',' + i_8_ + ',' + i_9_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public Class39() {
		/* empty */
	}

	public static void method351(boolean bool) {
		try {
			aClass85_362 = null;
			if (bool != true)
				anInt363 = -29;
			aClass126_361 = null;
			IncomingOpcode.aClass58_364 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cn.D(" + bool + ')');
		}
	}

	abstract void method352(int i, int i_67_, float f, int i_68_, float f_69_, int i_70_, float f_71_, float f_72_, float[] fs, int i_73_, int i_74_);

	static final void method353(byte i) {
		do {
			try {
				if (Class153.aHa1225 != null) {
					Class153.aHa1225.method1743(-1);
					Class238.aClass43_1828 = null;
					Class153.aHa1225 = null;
				}
				if (i == -79)
					break;
				aClass85_362 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cn.G(" + i + ')');
			}
			break;
		} while (false);
	}
}
