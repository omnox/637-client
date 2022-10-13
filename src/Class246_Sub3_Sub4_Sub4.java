/* Class246_Sub3_Sub4_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub4_Sub4 extends Class246_Sub3_Sub4 {
	private Class97 aClass97_6459;
	private int anInt6460;
	private int anInt6461;
	private double aDouble6462;
	int anInt6463;
	private double aDouble6464;
	private int anInt6465 = 0;
	int anInt6466;
	private int anInt6467;
	private int anInt6468;
	private int anInt6469;
	private int anInt6470;
	private boolean aBoolean6471 = false;
	private double aDouble6472;
	private boolean aBoolean6473;
	private int anInt6474;
	private int anInt6475;
	private double aDouble6476;
	private int anInt6477;
	private double aDouble6478;
	int anInt6479;
	private double aDouble6480;
	private boolean aBoolean6481;
	int anInt6482;
	private double aDouble6483;
	private int anInt6484;
	private int anInt6485;
	private int anInt6486;
	static int anInt6488;
	private Class246_Sub5 aClass246_Sub5_6489;
	private double aDouble6490;

	final void method2988(ha var_ha, int i) {
		try {
			AbstractModel class146 = method3081((byte) -96, 0, var_ha);
			if (class146 != null) {
				Class111 class111 = var_ha.method1793();
				class111.method2107(anInt6474);
				class111.method2097(anInt6468);
				class111.method2106((int) aDouble6472, (int) aDouble6490, (int) aDouble6462);
				anInt6484 = class146.fa();
				anInt6460 = class146.ma();
				method3076(class111, var_ha, class146, (byte) 74);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				method3074(-62, -24, -14, (byte) -98, -63);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2992(byte i) {
		try {
			if (i != -73)
				this.anInt6463 = -41;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.DA(" + i + ')');
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				method2988(null, 60);
			return anInt6484;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.J(" + i + ')');
		}
	}

	final void method3074(int i, int i_1_, int i_2_, byte i_3_, int i_4_) {
		do {
			try {
				if (!aBoolean6481) {
					double d = -this.localXPos + i;
					double d_5_ = i_4_ + -this.localYPos;
					double d_6_ = Math.sqrt(d * d + d_5_ * d_5_);
					aDouble6462 = ((double) this.localYPos + (double) anInt6467 * d_5_ / d_6_);
					aDouble6472 = ((double) this.localXPos + d * (double) anInt6467 / d_6_);
					if (aBoolean6473)
						aDouble6490 = (Perspective.getTileHeight(this.height_level, (int) aDouble6462, (int) aDouble6472)) - anInt6461;
					else
						aDouble6490 = this.anInt5089;
				}
				double d = -i_2_ + 1 + this.anInt6466;
				aDouble6483 = ((double) i_4_ - aDouble6462) / d;
				aDouble6464 = (-aDouble6472 + (double) i) / d;
				aDouble6478 = Math.sqrt(aDouble6483 * aDouble6483 + aDouble6464 * aDouble6464);
				if (anInt6475 == -1)
					aDouble6480 = ((double) i_1_ - aDouble6490) / d;
				else {
					if (!aBoolean6481)
						aDouble6480 = (-aDouble6478 * Math.tan((double) anInt6475 * 0.02454369));
					aDouble6476 = 2.0 * ((double) i_1_ - aDouble6490 - aDouble6480 * d) / (d * d);
				}
				if (i_3_ == 108)
					break;
				anInt6475 = 74;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("rk.NA(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				method2976(115, null, (byte) -18, -25);
			return anInt6460;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.O(" + bool + ')');
		}
	}

	final void method3075(int i, int i_7_) {
		do {
			try {
				aDouble6462 += (double) i_7_ * aDouble6483;
				aDouble6472 += aDouble6464 * (double) i_7_;
				aBoolean6481 = true;
				if (!aBoolean6473) {
					if (anInt6475 != -1) {
						aDouble6490 += ((double) i_7_ * ((double) i_7_ * (aDouble6476 * 0.5)) + (double) i_7_ * aDouble6480);
						aDouble6480 += (double) i_7_ * aDouble6476;
					} else
						aDouble6490 += aDouble6480 * (double) i_7_;
				} else
					aDouble6490 = (Perspective.getTileHeight(this.height_level, (int) aDouble6462, (int) aDouble6472)) + -anInt6461;
				if (i == -10462) {
					anInt6468 = 8192 + (int) (2607.5945876176133 * Math.atan2(aDouble6464, aDouble6483)) & 0x3fff;
					anInt6474 = ((int) (2607.5945876176133 * Math.atan2(aDouble6480, aDouble6478)) & 0x3fff);
					if (aClass97_6459 == null)
						break;
					anInt6477 += i_7_;
					while (anInt6477 > aClass97_6459.anIntArray811[anInt6465]) {
						anInt6477 -= (aClass97_6459.anIntArray811[anInt6465]);
						anInt6465++;
						if (anInt6465 >= (aClass97_6459.anIntArray818).length) {
							anInt6465 -= aClass97_6459.anInt828;
							if (anInt6465 < 0 || anInt6465 >= (aClass97_6459.anIntArray818).length)
								anInt6465 = 0;
						}
						anInt6469 = anInt6465 - -1;
						if (aClass97_6459.anIntArray818.length <= anInt6469) {
							anInt6469 -= aClass97_6459.anInt828;
							if (anInt6469 < 0 || anInt6469 >= (aClass97_6459.anIntArray818).length)
								anInt6469 = -1;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rk.VA(" + i + ',' + i_7_ + ')');
			}
			break;
		} while (false);
	}

	private final void method3076(Class111 class111, ha var_ha, AbstractModel class146, byte i) {
		do {
			try {
				class146.method2343(class111);
				int i_8_ = -109 / ((22 - i) / 47);
				Class87[] class87s = class146.method2320();
				Class35[] class35s = class146.method2322();
				if ((aClass246_Sub5_6489 == null || aClass246_Sub5_6489.aBoolean5099) && (class87s != null || class35s != null))
					aClass246_Sub5_6489 = Class246_Sub5.method3117(Class215.anInt1614, true);
				if (aClass246_Sub5_6489 == null)
					break;
				aClass246_Sub5_6489.method3120(var_ha, Class215.anInt1614, class87s, class35s, false);
				aClass246_Sub5_6489.method3123(this.height_level, this.aShort6158, this.aShort6160, this.aShort6157, this.aShort6159);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("rk.RA(" + (class111 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class146 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method3077(byte i) {
		do {
			try {
				IncomingOpcode.aClass58_6487 = null;
				if (i == -29)
					break;
				method3077((byte) 73);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rk.SA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3078(int i) {
		do {
			try {
				if (i != -6095)
					method3077((byte) -55);
				if (aClass246_Sub5_6489 == null)
					break;
				aClass246_Sub5_6489.method3114();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rk.PA(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3079(byte i, RuneScapeCache class207, int i_9_, RuneScapeCache class207_10_) {
		try {
			int i_11_ = 121 % ((-35 - i) / 58);
			Class64_Sub15.aClass207_3679 = class207_10_;
			Class64_Sub2.aClass207_3644 = class207;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.JA(" + i + ',' + (class207 != null ? "{...}" : "null") + ',' + i_9_ + ',' + (class207_10_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2982(byte i) {
		try {
			if (i > -70)
				method3078(-85);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.HA(" + i + ')');
		}
	}

	final boolean method2978(int i) {
		try {
			int i_12_ = -87 / ((i - -76) / 47);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.H(" + i + ')');
		}
	}

	Class246_Sub3_Sub4_Sub4(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool, int i_25_) {
		super(i_13_, i_14_, i_15_, -i_17_ + Perspective.getTileHeight(i_13_, i_16_, i_15_), i_16_, i_15_ >> 9, i_15_ >> 9, i_16_ >> 9, i_16_ >> 9, false, (byte) 0);
		anInt6460 = 0;
		anInt6469 = -1;
		aBoolean6481 = false;
		anInt6477 = 0;
		anInt6484 = 0;
		try {
			anInt6461 = i_17_;
			anInt6475 = i_20_;
			anInt6467 = i_21_;
			anInt6485 = i;
			aBoolean6481 = false;
			this.anInt6463 = i_24_;
			this.anInt6479 = i_18_;
			this.anInt6482 = i_23_;
			this.anInt6466 = i_19_;
			anInt6470 = i_22_;
			aBoolean6473 = bool;
			anInt6486 = i_25_;
			int i_26_ = (Class196.aClass304_1509.method3564(2, anInt6485).anInt910);
			if (i_26_ != -1)
				aClass97_6459 = Class151_Sub7.aClass183_5001.method2623(i_26_, 16383);
			else
				aClass97_6459 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.<init>(" + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + bool + ',' + i_25_ + ')'));
		}
	}

	final boolean method2976(int i, ha var_ha, byte i_27_, int i_28_) {
		try {
			if (i_27_ < 59)
				aBoolean6471 = false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_27_ + ',' + i_28_ + ')'));
		}
	}

	final void method3080(byte i) {
		do {
			try {
				if (!aBoolean6481) {
					if (i < 72)
						anInt6485 = -118;
					if (anInt6470 == 0)
						break;
					Mobile class246_sub3_sub4_sub2 = null;
					if (anInt6470 < 0) {
						int i_29_ = -anInt6470 + -1;
						if (i_29_ == za_Sub2.anInt6080)
							class246_sub3_sub4_sub2 = Player.selfPlayer;
						else
							class246_sub3_sub4_sub2 = (Class151_Sub9.playerArray[i_29_]);
					} else {
						int i_30_ = -1 + anInt6470;
						Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_30_, -1));
						if (class98_sub39 != null)
							class246_sub3_sub4_sub2 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
					}
					if (class246_sub3_sub4_sub2 == null)
						break;
					this.localXPos = class246_sub3_sub4_sub2.localXPos;
					this.localYPos = class246_sub3_sub4_sub2.localYPos;
					this.anInt5089 = (Perspective.getTileHeight(this.height_level, (class246_sub3_sub4_sub2.localYPos), (class246_sub3_sub4_sub2.localXPos))) - anInt6461;
					if (anInt6486 < 0)
						break;
					RenderAnimDefinitions class294 = class246_sub3_sub4_sub2.getRenderAnimation(1);
					int i_31_ = 0;
					int i_32_ = 0;
					if (class294.anIntArrayArray2366 != null && (class294.anIntArrayArray2366[anInt6486]) != null) {
						i_31_ += (class294.anIntArrayArray2366[anInt6486][0]);
						i_32_ += (class294.anIntArrayArray2366[anInt6486][2]);
					}
					if (class294.anIntArrayArray2364 != null && (class294.anIntArrayArray2364[anInt6486]) != null) {
						i_32_ += (class294.anIntArrayArray2364[anInt6486][2]);
						i_31_ += (class294.anIntArrayArray2364[anInt6486][0]);
					}
					if (i_31_ != 0 || i_32_ != 0) {
						int i_33_ = class246_sub3_sub4_sub2.aClass325_6399.method3698((byte) 116);
						int i_34_ = i_33_;
						if (class246_sub3_sub4_sub2.anIntArray6370 != null && (class246_sub3_sub4_sub2.anIntArray6370[anInt6486]) != -1)
							i_34_ = (class246_sub3_sub4_sub2.anIntArray6370[anInt6486]);
						int i_35_ = 0x3fff & -i_33_ + i_34_;
						int i_36_ = Class284_Sub2_Sub2.anIntArray6200[i_35_];
						int i_37_ = Class284_Sub2_Sub2.anIntArray6202[i_35_];
						int i_38_ = i_32_ * i_36_ + i_37_ * i_31_ >> 14;
						i_32_ = i_37_ * i_32_ + -(i_36_ * i_31_) >> 14;
						i_31_ = i_38_;
						this.localXPos += i_31_;
						this.localYPos += i_32_;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rk.OA(" + i + ')');
			}
			break;
		} while (false);
	}

	private final AbstractModel method3081(byte i, int i_39_, ha var_ha) {
		try {
			if (i != -96)
				method2981(null, (byte) -125, false, -13, null, 78, -34);
			Class107 class107 = Class196.aClass304_1509.method3564(2, anInt6485);
			return class107.method1728(anInt6465, Class151_Sub7.aClass183_5001, i_39_, anInt6477, (byte) -94, anInt6469, var_ha);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.LA(" + i + ',' + i_39_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2987(int i) {
		try {
			if (i != 6540)
				anInt6470 = 62;
			return aBoolean6471;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.I(" + i + ')');
		}
	}

	static final int method3082(int i, int i_40_, int i_41_) {
		try {
			int i_42_ = (-128 + Class98_Sub5_Sub3.method971(45365 + i_41_, 91923 + i, i_40_, i_40_ + -91) - (-(Class98_Sub5_Sub3.method971(i_41_ + 10294, 37821 + i, 2, i_40_ + -98) + -128 >> 1) - (Class98_Sub5_Sub3.method971(i_41_, i, 1, -48) - 128 >> 2)));
			i_42_ = (int) ((double) i_42_ * 0.3) - -35;
			do {
				if (i_42_ >= 10) {
					if (i_42_ <= 60)
						break;
					i_42_ = 60;
					if (!client.aBoolean3553)
						break;
				}
				i_42_ = 10;
			} while (false);
			return i_42_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.UA(" + i + ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	final void method3022(int i) {
		try {
			this.aShort6157 = this.aShort6159 = (short) (int) (aDouble6462 / 512.0);
			if (i != -8675)
				aDouble6480 = 0.42551889851769525;
			this.aShort6158 = this.aShort6160 = (short) (int) (aDouble6472 / 512.0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.F(" + i + ')');
		}
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_43_, ha var_ha, int i_44_, int i_45_) {
		try {
			int i_46_ = 45 % ((15 - i) / 55);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_43_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_44_ + ',' + i_45_ + ')'));
		}
	}

	protected final void finalize() {
		try {
			if (aClass246_Sub5_6489 != null)
				aClass246_Sub5_6489.method3114();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rk.finalize(" + ')');
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			AbstractModel class146 = method3081((byte) -96, 2048, var_ha);
			if (class146 == null)
				return null;
			Class111 class111 = var_ha.method1793();
			class111.method2107(anInt6474);
			class111.method2097(anInt6468);
			class111.method2106((int) aDouble6472, (int) aDouble6490, (int) aDouble6462);
			method3076(class111, var_ha, class146, (byte) -74);
			Class246_Sub1 class246_sub1 = Class94.method915(1, (byte) -47, false);
			if (!Class239.aBoolean1839)
				class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[0]), 0);
			else
				class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[0]), Class16.anInt197, 0);
			if (aClass246_Sub5_6489 != null) {
				Class242 class242 = aClass246_Sub5_6489.method3116();
				if (!Class239.aBoolean1839)
					var_ha.method1820(class242);
				else
					var_ha.method1785(class242, Class16.anInt197);
			}
			if (i > -12)
				aDouble6476 = 0.3831954713971479;
			aBoolean6471 = class146.F();
			anInt6484 = class146.fa();
			anInt6460 = class146.ma();
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rk.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
