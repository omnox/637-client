/* Class98_Sub10_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class98_Sub10_Sub5 extends Class98_Sub10 {
	int[] anIntArray5552;
	private int anInt5553 = -1;
	static int anInt5554 = 0;
	int anInt5555;
	int anInt5556;
	/* synthetic */ static Class aClass5557;

	public Class98_Sub10_Sub5() {
		super(0, false);
	}

	static final float method1014(float f, byte i, float f_0_, float f_1_) {
		try {
			int i_2_ = -124 % ((-31 - i) / 48);
			return f + (f_0_ - f) * f_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cp.F(" + f + ',' + i + ',' + f_0_ + ',' + f_1_ + ')'));
		}
	}

	int[][] method997(int i, int i_3_) {
		try {
			int[][] is = ((Class98_Sub10) this).aClass223_3859.method2828(i_3_, 0);
			if (((Class223) ((Class98_Sub10) this).aClass223_3859).aBoolean1683 && method1016(-1)) {
				int[] is_4_ = is[0];
				int[] is_5_ = is[1];
				int[] is_6_ = is[2];
				int i_7_ = (((Class98_Sub10_Sub5) this).anInt5556 * ((Class63.anInt492 != ((Class98_Sub10_Sub5) this).anInt5555) ? (i_3_ * ((Class98_Sub10_Sub5) this).anInt5555 / Class63.anInt492) : i_3_));
				if ((((Class98_Sub10_Sub5) this).anInt5556 ^ 0xffffffff) == (Class25.anInt268 ^ 0xffffffff)) {
					for (int i_8_ = 0; i_8_ < Class25.anInt268; i_8_++) {
						int i_9_ = (((Class98_Sub10_Sub5) this).anIntArray5552[i_7_++]);
						is_6_[i_8_] = Class202.method2702(4080, i_9_ << -1987589340);
						is_5_[i_8_] = Class202.method2702(4080, i_9_ >> 1948667748);
						is_4_[i_8_] = Class202.method2702(4080, i_9_ >> 1591355276);
					}
				} else {
					for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)); i_10_++) {
						int i_11_ = (i_10_ * ((Class98_Sub10_Sub5) this).anInt5556 / Class25.anInt268);
						int i_12_ = (((Class98_Sub10_Sub5) this).anIntArray5552[i_7_ + i_11_]);
						is_6_[i_10_] = Class202.method2702(4080, i_12_ << -1398173052);
						is_5_[i_10_] = Class202.method2702(i_12_, 65280) >> -678736348;
						is_4_[i_10_] = Class202.method2702(4080, i_12_ >> -415498644);
					}
				}
			}
			if (i >= -76)
				((Class98_Sub10_Sub5) this).anInt5555 = -123;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cp.C(" + i + ',' + i_3_ + ')');
		}
	}

	final int method996(byte i) {
		try {
			if (i > -119)
				anInt5554 = 39;
			return anInt5553;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cp.M(" + i + ')');
		}
	}

	final void method993(int i) {
		try {
			super.method993((short) i);
			((Class98_Sub10_Sub5) this).anIntArray5552 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cp.P(" + i + ')');
		}
	}

	static final boolean method1015(ha var_ha, int i, int i_13_) {
		try {
			int i_14_ = (GameWorld.size_x + -104) / 2;
			int i_15_ = (-104 + GameWorld.size_y) / 2;
			boolean bool = true;
			for (int i_16_ = i_14_; (i_16_ ^ 0xffffffff) > (104 + i_14_ ^ 0xffffffff); i_16_++) {
				for (int i_17_ = i_15_; (i_15_ + 104 ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
					for (int i_18_ = i; i_18_ <= 3; i_18_++) {
						if (RenderAnimDefinitions.method3477(i_17_, i_18_, i_16_, i, i_13_ ^ 0x22be)) {
							int i_19_ = i_18_;
							if (Class1.method162(i_17_, (byte) -92, i_16_))
								i_19_--;
							if ((i_19_ ^ 0xffffffff) <= -1)
								bool &= Class65.method679(i_16_, i_19_, (byte) 112, i_17_);
						}
					}
				}
			}
			if (!bool)
				return false;
			int[] is = new int[262144];
			for (int i_20_ = 0; (is.length ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++)
				is[i_20_] = -16777216;
			Class64_Sub9.aClass332_3663 = var_ha.method1748(-7962, 0, 512, 512, is, 512);
			Class98_Sub35.method1452(0);
			int i_21_ = ~0xffffff | (238 + (int) (20.0 * Math.random()) - (10 - ((int) (Math.random() * 20.0) + 238 - 10 << -599914896)) + (238 + (int) (20.0 * Math.random()) - 10 << 975075624));
			int i_22_ = (~0xffffff | -10 + ((int) (Math.random() * 20.0) + 238) << 2084461680);
			int i_23_ = ((int) (Math.random() * 8.0) | ((int) (Math.random() * 8.0) << -36704600 | (int) (8.0 * Math.random()) << -1428728144));
			boolean[][] bools = (new boolean[1 + Class55.anInt443 - -2][1 + (Class55.anInt443 - -2)]);
			for (int i_24_ = i_14_; (104 + i_14_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_ += Class55.anInt443) {
				for (int i_25_ = i_15_; i_25_ < 104 + i_15_; i_25_ += Class55.anInt443) {
					int i_26_ = 0;
					int i_27_ = 0;
					int i_28_ = i_24_;
					if (i_28_ > 0) {
						i_26_ += 4;
						i_28_--;
					}
					int i_29_ = i_25_;
					if (i_29_ > 0)
						i_29_--;
					int i_30_ = Class55.anInt443 + i_24_;
					if ((i_30_ ^ 0xffffffff) > -105)
						i_30_++;
					int i_31_ = Class55.anInt443 + i_25_;
					if (i_31_ < 104) {
						i_27_ += 4;
						i_31_++;
					}
					var_ha.KA(0, 0, Class55.anInt443 * 4 + i_26_, i_27_ + 4 * Class55.anInt443);
					var_ha.GA(-16777216);
					for (int i_32_ = i; (i_32_ ^ 0xffffffff) >= -4; i_32_++) {
						for (int i_33_ = 0; Class55.anInt443 >= i_33_; i_33_++) {
							for (int i_34_ = 0; ((Class55.anInt443 ^ 0xffffffff) <= (i_34_ ^ 0xffffffff)); i_34_++)
								bools[i_33_][i_34_] = RenderAnimDefinitions.method3477(i_29_ - -i_34_, i_32_, i_28_ - -i_33_, i, 107);
						}
						Class98_Sub46_Sub2_Sub2.aSArray6298[i_32_].method3422(0, 0, 1024, i_28_, i_29_, i_30_, i_31_, bools);
						if (!Class44.aBoolean378) {
							for (int i_35_ = -4; ((Class55.anInt443 ^ 0xffffffff) < (i_35_ ^ 0xffffffff)); i_35_++) {
								for (int i_36_ = -4; ((i_36_ ^ 0xffffffff) > (Class55.anInt443 ^ 0xffffffff)); i_36_++) {
									int i_37_ = i_24_ + i_35_;
									int i_38_ = i_36_ + i_25_;
									if (i_14_ <= i_37_ && i_15_ <= i_38_ && RenderAnimDefinitions.method3477(i_38_, i_32_, i_37_, i, 56)) {
										int i_39_ = i_32_;
										if (Class1.method162(i_38_, (byte) -101, i_37_))
											i_39_--;
										if (i_39_ >= 0)
											Class277.method3289(i_39_, i_26_ + 4 * i_35_, i_38_, i_22_, var_ha, (-4 + i_27_ + 4 * (Class55.anInt443 - i_36_)), true, i_37_, i_21_);
									}
								}
							}
						}
					}
					if (Class44.aBoolean378) {
						Collision class243 = Class167.aClass243Array1281[i];
						for (int i_40_ = 0; ((i_40_ ^ 0xffffffff) > (Class55.anInt443 ^ 0xffffffff)); i_40_++) {
							for (int i_41_ = 0; Class55.anInt443 > i_41_; i_41_++) {
								int i_42_ = i_24_ - -i_40_;
								int i_43_ = i_25_ - -i_41_;
								int i_44_ = (((Collision) class243).flags[(-((Collision) class243).anInt1854 + i_42_)][i_43_ + -(((Collision) class243).anInt1855)]);
								if ((0x40240000 & i_44_) == 0) {
									if ((0x800000 & i_44_ ^ 0xffffffff) != -1)
										var_ha.method1753(22294, 4, -1713569622, ((4 * (Class55.anInt443 - i_41_)) + (i_27_ - 4)), 4 * i_40_ + i_26_);
									else if ((0x2000000 & i_44_) == 0) {
										if ((i_44_ & 0x8000000) != 0)
											var_ha.method1753(22294, 4, -1713569622, -4 + (4 * (-i_41_ + Class55.anInt443) + i_27_) - -3, 4 * i_40_ + i_26_);
										else if ((i_44_ & 0x20000000 ^ 0xffffffff) != -1)
											var_ha.method1755(i_13_ + -460, -4 + (4 * (-i_41_ + Class55.anInt443) + i_27_), i_40_ * 4 + i_26_, -1713569622, 4);
									} else
										var_ha.method1755(8479, i_27_ - (-((-i_41_ + Class55.anInt443) * 4) - -4), 3 + i_40_ * 4 + i_26_, -1713569622, 4);
								} else
									var_ha.method1760(4, 4, -4 + (4 * (-i_41_ + (Class55.anInt443)) + i_27_), -1713569622, (byte) -66, i_40_ * 4 + i_26_);
							}
						}
					}
					var_ha.aa(i_26_, i_27_, 4 * Class55.anInt443, 4 * Class55.anInt443, i_23_, 2);
					Class64_Sub9.aClass332_3663.method3736(48 + 4 * (-i_14_ + i_24_), -(4 * Class55.anInt443) + (464 - (i_25_ + -i_15_) * 4), Class55.anInt443 * 4, Class55.anInt443 * 4, i_26_, i_27_);
				}
			}
			var_ha.la();
			var_ha.GA(-16777215);
			if (i_13_ != 8939)
				method1015(null, 43, 57);
			Class98_Sub43.method1481(2);
			Class98_Sub10_Sub7.anInt5577 = 0;
			Class64_Sub8.aClass148_3659.method2422((byte) 47);
			if (!Class44.aBoolean378) {
				for (int i_45_ = i_14_; i_45_ < 104 + i_14_; i_45_++) {
					for (int i_46_ = i_15_; (i_46_ ^ 0xffffffff) > (i_15_ - -104 ^ 0xffffffff); i_46_++) {
						for (int i_47_ = i; ((1 + i ^ 0xffffffff) <= (i_47_ ^ 0xffffffff) && (i_47_ ^ 0xffffffff) >= -4); i_47_++) {
							if (RenderAnimDefinitions.method3477(i_46_, i_47_, i_45_, i, i_13_ + -9060)) {
								Interface19 interface19 = ((Interface19) Class253.method3177(i_47_, i_45_, i_46_));
								if (interface19 == null)
									interface19 = ((Interface19) (Class97.method931(i_47_, i_45_, i_46_, (aClass5557 != null ? aClass5557 : (aClass5557 = (method1017("Interface19")))))));
								if (interface19 == null)
									interface19 = ((Interface19) Class21_Sub1.method268(i_47_, i_45_, i_46_));
								if (interface19 == null)
									interface19 = ((Interface19) Class101.method1701(i_47_, i_45_, i_46_));
								if (interface19 != null) {
									Class352 class352 = (Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119));
									if (!((Class352) class352).aBoolean2927 || Class79.aBoolean602) {
										int i_48_ = ((Class352) class352).anInt2958;
										if ((((Class352) class352).anIntArray2928) != null) {
											for (int i_49_ = 0; ((i_49_ ^ 0xffffffff) > ((((Class352) class352).anIntArray2928).length ^ 0xffffffff)); i_49_++) {
												if ((((Class352) class352).anIntArray2928[i_49_]) != -1) {
													Class352 class352_50_ = (Class130.aClass302_1028.method3546((((Class352) class352).anIntArray2928[i_49_]), (byte) 119));
													if (((((Class352) class352_50_).anInt2958) ^ 0xffffffff) <= -1)
														i_48_ = (((Class352) class352_50_).anInt2958);
												}
											}
										}
										if ((i_48_ ^ 0xffffffff) <= -1) {
											boolean bool_51_ = false;
											if ((i_48_ ^ 0xffffffff) <= -1) {
												Class24 class24 = (Class216.aClass341_1622.method3807(-70, i_48_));
												if (class24 != null && (((Class24) class24).aBoolean261))
													bool_51_ = true;
											}
											int i_52_ = i_45_;
											int i_53_ = i_46_;
											if (bool_51_) {
												int[][] is_54_ = (((Collision) (Class167.aClass243Array1281[i_47_])).flags);
												int i_55_ = (((Collision) (Class167.aClass243Array1281[i_47_])).anInt1854);
												int i_56_ = (((Collision) (Class167.aClass243Array1281[i_47_])).anInt1855);
												for (int i_57_ = 0; i_57_ < 10; i_57_++) {
													int i_58_ = (int) (Math.random() * 4.0);
													if (i_58_ == 0 && ((i_14_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff)) && ((-3 + i_45_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff)) && ((((is_54_[(-i_55_ + (-1 + i_52_))][(-i_56_ + i_53_)]) & 0x2c0108) ^ 0xffffffff) == -1))
														i_52_--;
													if (((i_58_ ^ 0xffffffff) == -2) && ((i_52_ ^ 0xffffffff) > (-1 + (104 + i_14_) ^ 0xffffffff)) && i_52_ < 3 + i_45_ && ((0x2c0180 & (is_54_[(-i_55_ + 1 + i_52_)][(i_53_ - i_56_)])) == 0))
														i_52_++;
													if (i_58_ == 2 && ((i_53_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) && i_53_ > i_46_ - 3 && ((((is_54_[i_52_ - i_55_][(-i_56_ + -1 + i_53_)]) & 0x2c0102) ^ 0xffffffff) == -1))
														i_53_--;
													if (((i_58_ ^ 0xffffffff) == -4) && ((i_53_ ^ 0xffffffff) > (103 + i_15_ ^ 0xffffffff)) && ((i_53_ ^ 0xffffffff) > (i_46_ - -3 ^ 0xffffffff)) && ((((is_54_[-i_55_ + i_52_][1 + (i_53_ - i_56_)]) & 0x2c0120) ^ 0xffffffff) == -1))
														i_53_++;
												}
											}
											Class79.anIntArray603[Class98_Sub10_Sub7.anInt5577] = (((Class352) class352).id);
											Class19.anIntArray3451[Class98_Sub10_Sub7.anInt5577] = i_52_;
											Class6.anIntArray91[Class98_Sub10_Sub7.anInt5577] = i_53_;
											Class98_Sub10_Sub7.anInt5577++;
										}
									}
								}
							}
						}
					}
				}
				if (Class64_Sub23.aClass370_3707 != null) {
					((RuneScapeCache) client.aClass207_3549).anInt1575 = 1;
					Class216.aClass341_1622.method3809(64, -30502, 1024);
					for (int i_59_ = 0; ((((Class370) Class64_Sub23.aClass370_3707).anInt3137 ^ 0xffffffff) < (i_59_ ^ 0xffffffff)); i_59_++) {
						int i_60_ = (((Class370) Class64_Sub23.aClass370_3707).anIntArray3133[i_59_]);
						if (((((AnimableEntity) Player.selfPlayer).height_level) ^ 0xffffffff) == (i_60_ >> 2135781756 ^ 0xffffffff)) {
							int i_61_ = (-Class272.anInt2038 + (i_60_ >> 32300910 & 0x3fff));
							int i_62_ = -aa_Sub2.anInt3562 + (i_60_ & 0x3fff);
							if ((i_61_ ^ 0xffffffff) <= -1 && ((GameWorld.size_x ^ 0xffffffff) < (i_61_ ^ 0xffffffff)) && (i_62_ ^ 0xffffffff) <= -1 && ((GameWorld.size_y ^ 0xffffffff) < (i_62_ ^ 0xffffffff)))
								Class64_Sub8.aClass148_3659.add_last(new Class98_Sub34(i_59_), -20911);
							else {
								Class24 class24 = (Class216.aClass341_1622.method3807(-25, (((Class370) Class64_Sub23.aClass370_3707).anIntArray3138[i_59_])));
								if (((Class24) class24).anIntArray265 != null && (((Class24) class24).anInt247 + i_61_ >= 0) && (GameWorld.size_x > i_61_ + ((Class24) class24).anInt244) && (i_62_ + ((Class24) class24).anInt262 >= 0) && ((GameWorld.size_y ^ 0xffffffff) < (((Class24) class24).anInt248 + i_62_ ^ 0xffffffff)))
									Class64_Sub8.aClass148_3659.add_last(new Class98_Sub34(i_59_), -20911);
							}
						}
					}
					Class216.aClass341_1622.method3809(64, -30502, 128);
					((RuneScapeCache) client.aClass207_3549).anInt1575 = 2;
					client.aClass207_3549.method2760((byte) -120);
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cp.E(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_13_ + ')'));
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_63_) {
		try {
			if (i == 0)
				anInt5553 = class98_sub22.readShort();
			if (i_63_ >= -92)
				anInt5553 = -74;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cp.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_63_ + ')'));
		}
	}

	final boolean method1016(int i) {
		try {
			if (((Class98_Sub10_Sub5) this).anIntArray5552 != null)
				return true;
			if (anInt5553 >= 0) {
				Class324 class324 = ((Class98_Sub10_Sub26.anInt5683 ^ 0xffffffff) <= -1 ? Class324.method3685(Class127.aClass207_1019, Class98_Sub10_Sub26.anInt5683, anInt5553) : Class324.method3683(Class127.aClass207_1019, anInt5553));
				class324.method3692();
				((Class98_Sub10_Sub5) this).anIntArray5552 = class324.method3686();
				((Class98_Sub10_Sub5) this).anInt5555 = ((Class324) class324).anInt2720;
				((Class98_Sub10_Sub5) this).anInt5556 = ((Class324) class324).anInt2722;
				return true;
			}
			if (i != -1)
				method1016(22);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cp.D(" + i + ')');
		}
	}

	/* synthetic */ static Class method1017(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
