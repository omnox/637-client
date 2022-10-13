/* Class246_Sub3_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub4_Sub1 extends Class246_Sub3_Sub4 implements Interface19 {
	private byte aByte6232;
	private byte aByte6233;
	private boolean aBoolean6234;
	private boolean aBoolean6235;
	private Class228 aClass228_6236;
	private boolean aBoolean6237;
	private short aShort6238;
	private boolean aBoolean6239;
	static Class279 aClass279_6240 = new Class279("game3", 2);
	static int anInt6241;
	private r aR6242;
	AbstractModel aClass146_6243;
	static boolean aBoolean6244 = false;

	final boolean method2987(int i) {
		try {
			if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 != null)
				return ((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.F();
			if (i != 6540)
				method2985(true);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.I(" + i + ')');
		}
	}

	public final void method67(int i, ha var_ha) {
		do {
			try {
				Object object = null;
				r var_r;
				if (aR6242 == null && aBoolean6239) {
					Class298 class298 = method3028(262144, (byte) 101, var_ha, true);
					var_r = (class298 == null ? null : ((Class298) class298).aR2479);
				} else {
					var_r = aR6242;
					aR6242 = null;
				}
				if (var_r != null)
					Class268.method3254(var_r, ((AnimableEntity) this).aByte5081, ((AnimableEntity) this).localXPos, ((AnimableEntity) this).localYPos, null);
				if (i == -25163)
					break;
				aBoolean6235 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mb.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 == null)
				return null;
			Class111 class111 = var_ha.method1793();
			class111.method2100(((AnimableEntity) this).localXPos, ((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localYPos);
			if (i >= -12)
				method2992((byte) -76);
			Class246_Sub1 class246_sub1 = Class94.method915(1, (byte) -47, aBoolean6234);
			do {
				if (Class239.aBoolean1839) {
					((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.method2329(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[0]), Class16.anInt197, 0);
					if (!client.aBoolean3553)
						break;
				}
				((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.method2325(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[0]), 0);
			} while (false);
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mb.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final int method64(int i) {
		try {
			if (i != 30472)
				method2981(null, (byte) 46, false, -115, null, -54, -101);
			return 0xffff & aShort6238;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.C(" + i + ')');
		}
	}

	static final void method3025(byte i) {
		do {
			try {
				if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4058.method612((byte) 125) ^ 0xffffffff) == -3) {
					byte i_0_ = (byte) (Class64_Sub15.anInt3676 + -4 & 0xff);
					int i_1_ = Class64_Sub15.anInt3676 % GameWorld.size_x;
					for (int i_2_ = 0; i_2_ < 4; i_2_++) {
						for (int i_3_ = 0; GameWorld.size_y > i_3_; i_3_++)
							OutputStream_Sub2.aByteArrayArrayArray41[i_2_][i_1_][i_3_] = i_0_;
					}
					if (Class43.anInt377 != 3) {
						int i_4_ = 0;
						if (i != 72)
							method3029(-45);
						for (/**/; (i_4_ ^ 0xffffffff) > -3; i_4_++) {
							Class204.anIntArray1551[i_4_] = -1000000;
							Class336.anIntArray2826[i_4_] = 1000000;
							Class287.anIntArray2195[i_4_] = 0;
							IncomingMessages.anIntArray5518[i_4_] = 1000000;
							Class295.anIntArray2409[i_4_] = 0;
						}
						int i_5_ = (((AnimableEntity) Player.selfPlayer).localXPos);
						int i_6_ = (((AnimableEntity) Player.selfPlayer).localYPos);
						if (((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -2) || (Class116.anInt967 ^ 0xffffffff) != 0) {
							if (Class98_Sub46_Sub20_Sub2.anInt6319 != 1) {
								i_6_ = Class64_Sub26.anInt3712;
								i_5_ = Class116.anInt967;
							}
							if (((Class281.tileSettings[Class43.anInt377][i_5_ >> 819933737][i_6_ >> -1734096311]) & 0x4) != 0)
								Class253.method3175(i_5_ >> 302605065, 0, (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948), i_6_ >> 68371017, (byte) -76, false);
							if ((GameWorld.cameraPitch ^ 0xffffffff) > -2561) {
								int i_7_ = (Class98_Sub46_Sub10.renderX >> 813546185);
								int i_8_ = Class134.renderZ >> -794721367;
								int i_9_ = i_5_ >> 847752841;
								int i_10_ = i_6_ >> -43834903;
								int i_11_;
								if ((i_9_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
									i_11_ = i_9_ + -i_7_;
								else
									i_11_ = -i_9_ + i_7_;
								int i_12_;
								if ((i_8_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff))
									i_12_ = i_8_ - i_10_;
								else
									i_12_ = -i_8_ + i_10_;
								if ((i_11_ ^ 0xffffffff) == -1 && i_12_ == 0 || ((i_11_ ^ 0xffffffff) >= (-GameWorld.size_x ^ 0xffffffff)) || ((GameWorld.size_x ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) || -GameWorld.size_y >= i_12_ || i_12_ >= GameWorld.size_y)
									Map.method3585(null, -127, ("RC: " + i_7_ + "," + i_8_ + " " + i_9_ + "," + i_10_ + " " + Class272.anInt2038 + "," + aa_Sub2.anInt3562));
								else if (i_11_ > i_12_) {
									int i_13_ = i_12_ * 65536 / i_11_;
									int i_14_ = 32768;
									while ((i_7_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff)) {
										if ((i_9_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) {
											if (i_9_ < i_7_)
												i_7_--;
										} else
											i_7_++;
										if ((0x4 & (Class281.tileSettings[Class43.anInt377][i_7_][i_8_])) != 0) {
											Class253.method3175(i_7_, 1, (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948), i_8_, (byte) -76, false);
											break;
										}
										i_14_ += i_13_;
										if ((i_14_ ^ 0xffffffff) <= -65537) {
											if ((i_10_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
												i_8_++;
											else if (i_8_ > i_10_)
												i_8_--;
											i_14_ -= 65536;
											if (((Class281.tileSettings[Class43.anInt377][i_7_][i_8_]) & 0x4) != 0) {
												Class253.method3175(i_7_, 1, (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948), i_8_, (byte) -76, false);
												break;
											}
										}
									}
								} else {
									int i_15_ = 65536 * i_11_ / i_12_;
									int i_16_ = 32768;
									while (i_10_ != i_8_) {
										if ((i_10_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) {
											if ((i_8_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
												i_8_--;
										} else
											i_8_++;
										if (((Class281.tileSettings[Class43.anInt377][i_7_][i_8_]) & 0x4) != 0) {
											Class253.method3175(i_7_, 1, (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948), i_8_, (byte) -76, false);
											break;
										}
										i_16_ += i_15_;
										if (i_16_ >= 65536) {
											if (i_9_ <= i_7_) {
												if ((i_7_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff))
													i_7_--;
											} else
												i_7_++;
											i_16_ -= 65536;
											if ((0x4 & (Class281.tileSettings[Class43.anInt377][i_7_][i_8_])) != 0) {
												Class253.method3175(i_7_, 1, (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948), i_8_, (byte) -76, false);
												break;
											}
										}
									}
								}
							}
							break;
						}
						int i_17_ = (Perspective.getTileHeight(Class43.anInt377, Class134.renderZ, Class98_Sub46_Sub10.renderX));
						if (i_17_ + -Class79.renderY >= 3200 || ((0x4 & (Class281.tileSettings[Class43.anInt377][(Class98_Sub46_Sub10.renderX >> 2064460777)][Class134.renderZ >> -1481382711])) == 0))
							break;
						Class253.method3175((Class98_Sub46_Sub10.renderX >> 1855536521), 1, (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948), Class134.renderZ >> 510517769, (byte) -76, false);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mb.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2988(ha var_ha, int i) {
		try {

		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mb.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 = null;
			if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 == null)
				return 0;
			return ((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.fa();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.J(" + i + ')');
		}
	}

	final void method2992(byte i) {
		do {
			try {
				if (i != -73)
					method2992((byte) -74);
				aBoolean6235 = false;
				if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 == null)
					break;
				((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.s(~0x10000 & ((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.ua());
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mb.DA(" + i + ')');
			}
			break;
		} while (false);
	}

	private final AbstractModel method3026(int i, int i_19_, ha var_ha) {
		try {
			if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 != null && (var_ha.c(((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.ua(), i_19_) ^ 0xffffffff) == -1)
				return ((Class246_Sub3_Sub4_Sub1) this).aClass146_6243;
			if (i >= -20)
				return null;
			Class298 class298 = method3028(i_19_, (byte) 123, var_ha, false);
			if (class298 != null)
				return ((Class298) class298).aClass146_2477;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mb.P(" + i + ',' + i_19_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				return null;
			if (aClass228_6236 == null)
				aClass228_6236 = (Class48_Sub2_Sub1.method472(((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localXPos, method3026(-128, 0, var_ha), ((AnimableEntity) this).localYPos, i ^ ~0x30));
			return aClass228_6236;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mb.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub3_Sub4_Sub1(ha var_ha, Class352 class352, int i, int i_20_, int i_21_, int i_22_, int i_23_, boolean bool, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, boolean bool_30_) {
		super(i, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, ((Class352) class352).anInt2975 == 1, Class246_Sub3_Sub4_Sub5.method3088(i_28_, (byte) -41, i_29_));
		do {
			try {
				aBoolean6235 = bool_30_;
				aBoolean6237 = bool;
				aByte6233 = (byte) i_29_;
				aShort6238 = (short) ((Class352) class352).id;
				aBoolean6234 = ((((Class352) class352).anInt2998 ^ 0xffffffff) != -1 && !bool);
				((AnimableEntity) this).aByte5081 = (byte) i_20_;
				aByte6232 = (byte) i_28_;
				aBoolean6239 = (var_ha.method1771() && ((Class352) class352).aBoolean2935 && !aBoolean6237 && (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073.method579((byte) 127) ^ 0xffffffff) != -1);
				int i_31_ = 2048;
				if (aBoolean6235)
					i_31_ |= 0x10000;
				Class298 class298 = method3028(i_31_, (byte) 95, var_ha, aBoolean6239);
				if (class298 == null)
					break;
				aR6242 = ((Class298) class298).aR2479;
				((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 = ((Class298) class298).aClass146_2477;
				if (!aBoolean6235)
					break;
				((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 = ((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.method2341((byte) 0, i_31_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mb.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class352 != null ? "{...}" : "null") + ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + bool_30_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2976(int i, ha var_ha, byte i_32_, int i_33_) {
		try {
			if (i_32_ <= 59)
				aBoolean6234 = false;
			AbstractModel class146 = method3026(-120, 131072, var_ha);
			if (class146 != null) {
				Class111 class111 = var_ha.method1793();
				class111.method2100(((AnimableEntity) this).localXPos, ((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localYPos);
				if (!Class239.aBoolean1839)
					return class146.method2339(i, i_33_, class111, false, 0);
				return class146.method2333(i, i_33_, class111, false, 0, Class16.anInt197);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mb.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_32_ + ',' + i_33_ + ')'));
		}
	}

	final boolean method2978(int i) {
		try {
			int i_34_ = 6 % ((-76 - i) / 47);
			if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 != null) {
				if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.r())
					return false;
				return true;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.H(" + i + ')');
		}
	}

	public final boolean method65(boolean bool) {
		try {
			if (bool != true)
				aClass228_6236 = null;
			return aBoolean6239;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.A(" + bool + ')');
		}
	}

	final int method3027(int i) {
		try {
			if (i <= 20)
				aClass279_6240 = null;
			if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 != null)
				return (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.na() / 4);
			return 15;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.K(" + i + ')');
		}
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				return -120;
			if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 != null)
				return ((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.ma();
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.O(" + bool + ')');
		}
	}

	final boolean method2982(byte i) {
		try {
			if (i >= -70)
				anInt6241 = -94;
			return aBoolean6235;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.HA(" + i + ')');
		}
	}

	private final Class298 method3028(int i, byte i_35_, ha var_ha, boolean bool) {
		try {
			if (i_35_ < 69)
				method61((byte) -69);
			Class352 class352 = Class130.aClass302_1028.method3546(aShort6238 & 0xffff, (byte) 119);
			s var_s;
			s var_s_36_;
			if (!aBoolean6237) {
				if ((((AnimableEntity) this).aByte5081 ^ 0xffffffff) <= -4)
					var_s = null;
				else
					var_s = (Class98_Sub46_Sub2_Sub2.aSArray6298[1 + ((AnimableEntity) this).aByte5081]);
				var_s_36_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[((AnimableEntity) this).aByte5081]);
			} else {
				var_s = Class98_Sub46_Sub2_Sub2.aSArray6298[0];
				var_s_36_ = Class81.aSArray618[((AnimableEntity) this).aByte5081];
			}
			return class352.method3851(((AnimableEntity) this).localYPos, false, var_s, ((aByte6232 ^ 0xffffffff) == -12 ? (int) (aByte6233 + 4) : aByte6233), ((AnimableEntity) this).anInt5089, bool, ((AnimableEntity) this).localXPos, i, null, var_s_36_, var_ha, aByte6232 != 11 ? aByte6232 : 10);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mb.D(" + i + ',' + i_35_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_37_, ha var_ha, int i_38_, int i_39_) {
		try {
			do {
				if (class246_sub3 instanceof Class246_Sub3_Sub3_Sub2) {
					Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2 = (Class246_Sub3_Sub3_Sub2) class246_sub3;
					if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 == null || (((Class246_Sub3_Sub3_Sub2) class246_sub3_sub3_sub2).aClass146_6285) == null)
						break;
					((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.method2332((((Class246_Sub3_Sub3_Sub2) class246_sub3_sub3_sub2).aClass146_6285), i_37_, i_38_, i_39_, bool);
					if (!client.aBoolean3553)
						break;
				}
				if (class246_sub3 instanceof Class246_Sub3_Sub4_Sub1) {
					Class246_Sub3_Sub4_Sub1 class246_sub3_sub4_sub1_40_ = (Class246_Sub3_Sub4_Sub1) class246_sub3;
					if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 != null && (((Class246_Sub3_Sub4_Sub1) class246_sub3_sub4_sub1_40_).aClass146_6243 != null))
						((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.method2332(((Class246_Sub3_Sub4_Sub1) class246_sub3_sub4_sub1_40_).aClass146_6243, i_37_, i_38_, i_39_, bool);
				}
			} while (false);
			int i_41_ = 24 % ((i - 15) / 55);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mb.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_37_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_38_ + ',' + i_39_ + ')'));
		}
	}

	public final void method62(ha var_ha, int i) {
		do {
			try {
				Object object = null;
				r var_r;
				if (aR6242 != null || !aBoolean6239) {
					var_r = aR6242;
					aR6242 = null;
				} else {
					Class298 class298 = method3028(262144, (byte) 85, var_ha, true);
					var_r = (class298 != null ? ((Class298) class298).aR2479 : null);
				}
				if (i != 24447)
					method2990(94);
				if (var_r == null)
					break;
				Class184.method2626(var_r, ((AnimableEntity) this).aByte5081, ((AnimableEntity) this).localXPos, ((AnimableEntity) this).localYPos, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mb.G(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final int method66(int i) {
		try {
			if (i != 4657)
				return 91;
			return aByte6233;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.N(" + i + ')');
		}
	}

	public final int method63(byte i) {
		try {
			if (i != 20)
				method2992((byte) 9);
			return aByte6232;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mb.B(" + i + ')');
		}
	}

	public static void method3029(int i) {
		do {
			try {
				aClass279_6240 = null;
				if (i == -1)
					break;
				method3025((byte) -65);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mb.L(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method61(byte i) {
		do {
			try {
				if (((Class246_Sub3_Sub4_Sub1) this).aClass146_6243 != null)
					((Class246_Sub3_Sub4_Sub1) this).aClass146_6243.method2326();
				if (i == -96)
					break;
				aBoolean6234 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mb.Q(" + i + ')');
			}
			break;
		} while (false);
	}
}
