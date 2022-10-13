/* Class246_Sub3_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub5_Sub2 extends Class246_Sub3_Sub5 implements Interface19 {
	private r aR6266;
	private byte aByte6267;
	static int anInt6268;
	private boolean aBoolean6269;
	private boolean aBoolean6270;
	static Applet_Sub1 anApplet_Sub1_6271 = null;
	static boolean aBoolean6272 = true;
	static Class246_Sub3_Sub4[] aClass246_Sub3_Sub4Array6273;
	private Class228 aClass228_6274;
	private byte aByte6275;
	private short aShort6276;
	private AbstractModel aClass146_6277;
	private boolean aBoolean6278;

	public final int method66(int i) {
		try {
			if (i != 4657)
				method2988(null, 86);
			return aByte6267;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.N(" + i + ')');
		}
	}

	final boolean method2976(int i, ha var_ha, byte i_0_, int i_1_) {
		try {
			AbstractModel class146 = method3095(0, 131072, var_ha);
			if (i_0_ < 59)
				aR6266 = null;
			if (class146 != null) {
				Class111 class111 = var_ha.method1793();
				class111.method2100(this.localXPos, this.anInt5089, this.localYPos);
				if (!Class239.aBoolean1839)
					return class146.method2339(i, i_1_, class111, false, 0);
				return class146.method2333(i, i_1_, class111, false, 0, Class16.anInt197);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tv.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method3093(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, byte i_8_, int i_9_) {
		do {
			try {
				if (!Class85.getInterfaceData(i_4_, 68)) {
					if (i_2_ == -1) {
						for (int i_10_ = 0; i_10_ < 100; i_10_++)
							aa_Sub3.aBooleanArray3574[i_10_] = true;
					} else
						aa_Sub3.aBooleanArray3574[i_2_] = true;
				} else {
					int i_11_ = 0;
					int i_12_ = 0;
					int i_13_ = 0;
					int i_14_ = 0;
					int i_15_ = -10 / ((i_8_ - 50) / 37);
					int i_16_ = 0;
					if (za_Sub2.aBoolean6079) {
						i_13_ = Class98_Sub19.anInt3956;
						i_16_ = Class98_Sub10_Sub5.anInt5554;
						i_14_ = Class82.anInt629;
						i_11_ = Class64_Sub27.anInt3716;
						i_12_ = Applet_Sub1.anInt2;
						Class98_Sub10_Sub5.anInt5554 = 1;
					}
					if (Class64_Sub13.aClass293ArrayArray3674[i_4_] == null)
						Class98_Sub10_Sub24.method1077(-1, true, i_6_, i_9_, i_3_, i_2_, Class159.gameInterfaces[i_4_], i_7_, i, i_2_ < 0, i_5_);
					else
						Class98_Sub10_Sub24.method1077(-1, true, i_6_, i_9_, i_3_, i_2_, Class64_Sub13.aClass293ArrayArray3674[i_4_], i_7_, i, i_2_ < 0, i_5_);
					if (!za_Sub2.aBoolean6079)
						break;
					if (i_2_ >= 0 && Class98_Sub10_Sub5.anInt5554 == 2)
						Class93_Sub1_Sub1.method908(Class82.anInt629, Applet_Sub1.anInt2, false, Class64_Sub27.anInt3716, Class98_Sub19.anInt3956);
					Class98_Sub10_Sub5.anInt5554 = i_16_;
					Applet_Sub1.anInt2 = i_12_;
					Class82.anInt629 = i_14_;
					Class64_Sub27.anInt3716 = i_11_;
					Class98_Sub19.anInt3956 = i_13_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tv.M(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	public final void method62(ha var_ha, int i) {
		do {
			try {
				Object object = null;
				r var_r;
				if (aR6266 != null || !aBoolean6269) {
					var_r = aR6266;
					aR6266 = null;
				} else {
					Class298 class298 = method3094(262144, 0, true, var_ha);
					var_r = (class298 == null ? null : class298.aR2479);
				}
				if (var_r != null)
					Class184.method2626(var_r, this.aByte5081, this.localXPos, this.localYPos, null);
				if (i == 24447)
					break;
				method3096(-28, 5, -60);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tv.G(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final boolean method65(boolean bool) {
		try {
			if (bool != true)
				aByte6275 = (byte) -120;
			return aBoolean6269;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.A(" + bool + ')');
		}
	}

	final boolean method2987(int i) {
		try {
			if (i != 6540)
				aClass246_Sub3_Sub4Array6273 = null;
			if (aClass146_6277 != null)
				return aClass146_6277.F();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.I(" + i + ')');
		}
	}

	public final void method61(byte i) {
		try {
			if (aClass146_6277 != null)
				aClass146_6277.method2326();
			if (i != -96)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.Q(" + i + ')');
		}
	}

	private final Class298 method3094(int i, int i_17_, boolean bool, ha var_ha) {
		try {
			Class352 class352 = Class130.aClass302_1028.method3546(aShort6276 & 0xffff, (byte) 119);
			if (i_17_ != 0)
				return null;
			s var_s;
			s var_s_18_;
			if (!aBoolean6278) {
				var_s = (Class98_Sub46_Sub2_Sub2.aSArray6298[this.aByte5081]);
				if (this.aByte5081 >= 3)
					var_s_18_ = null;
				else
					var_s_18_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[1 + this.aByte5081]);
			} else {
				var_s = Class81.aSArray618[this.aByte5081];
				var_s_18_ = Class98_Sub46_Sub2_Sub2.aSArray6298[0];
			}
			return class352.method3851(this.localYPos, false, var_s_18_, aByte6267, this.anInt5089, bool, this.localXPos, i, null, var_s, var_ha, aByte6275);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tv.K(" + i + ',' + i_17_ + ',' + bool + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2978(int i) {
		try {
			int i_19_ = 10 / ((i - -76) / 47);
			if (aClass146_6277 != null) {
				if (aClass146_6277.r())
					return false;
				return true;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.H(" + i + ')');
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			if (aClass146_6277 == null)
				return null;
			Class111 class111 = var_ha.method1793();
			if (i > -12)
				aClass146_6277 = null;
			class111.method2100((this.localXPos - -this.aShort6165), this.anInt5089, (this.aShort6163 + this.localYPos));
			Class246_Sub1 class246_sub1 = Class94.method915(1, (byte) -47, aBoolean6270);
			do {
				if (Class239.aBoolean1839) {
					aClass146_6277.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[0]), Class16.anInt197, 0);
					if (!client.aBoolean3553)
						break;
				}
				aClass146_6277.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[0]), 0);
			} while (false);
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tv.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final int method63(byte i) {
		try {
			if (i != 20)
				anInt6268 = -124;
			return aByte6275;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.B(" + i + ')');
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				return 33;
			if (aClass146_6277 == null)
				return 0;
			return aClass146_6277.fa();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.J(" + i + ')');
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				aBoolean6272 = true;
			if (aClass228_6274 == null)
				aClass228_6274 = (Class48_Sub2_Sub1.method472(this.anInt5089, this.localXPos, method3095(0, 0, var_ha), this.localYPos, 4));
			return aClass228_6274;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tv.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub3_Sub5_Sub2(ha var_ha, Class352 class352, int i, int i_20_, int i_21_, int i_22_, int i_23_, boolean bool, int i_24_, int i_25_, int i_26_, int i_27_) {
		super(i_21_, i_22_, i_23_, i, i_20_, i_24_, i_25_);
		do {
			try {
				this.localXPos = i_21_;
				this.localYPos = i_23_;
				aByte6275 = (byte) i_26_;
				aByte6267 = (byte) i_27_;
				aBoolean6278 = bool;
				aShort6276 = (short) class352.id;
				aBoolean6270 = class352.anInt2998 != 0 && !bool;
				aBoolean6269 = (var_ha.method1771() && class352.aBoolean2935 && !aBoolean6278 && Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073.method579((byte) 120) != 0);
				Class298 class298 = method3094(2048, 0, aBoolean6269, var_ha);
				if (class298 == null)
					break;
				aClass146_6277 = class298.aClass146_2477;
				aR6266 = class298.aR2479;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tv.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class352 != null ? "{...}" : "null") + ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ')'));
			}
			break;
		} while (false);
	}

	public final int method64(int i) {
		try {
			if (i != 30472)
				anInt6268 = 40;
			return aShort6276 & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.C(" + i + ')');
		}
	}

	public final void method67(int i, ha var_ha) {
		do {
			try {
				Object object = null;
				if (i != -25163)
					method63((byte) 113);
				r var_r;
				if (aR6266 != null || !aBoolean6269) {
					var_r = aR6266;
					aR6266 = null;
				} else {
					Class298 class298 = method3094(262144, 0, true, var_ha);
					var_r = (class298 != null ? class298.aR2479 : null);
				}
				if (var_r == null)
					break;
				Class268.method3254(var_r, this.aByte5081, this.localXPos, this.localYPos, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tv.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final AbstractModel method3095(int i, int i_28_, ha var_ha) {
		try {
			if (aClass146_6277 != null && var_ha.c(aClass146_6277.ua(), i_28_) == 0)
				return aClass146_6277;
			Class298 class298 = method3094(i_28_, i, false, var_ha);
			if (class298 == null)
				return null;
			return class298.aClass146_2477;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tv.P(" + i + ',' + i_28_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method3096(int i, int i_29_, int i_30_) {
		try {
			if (i != -27984)
				method3098(null, false, 3);
			if ((0x800 & i_30_) == 0 || (0x37 & i_29_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tv.L(" + i + ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	final void method2988(ha var_ha, int i) {
		try {
			int i_31_ = 14 / ((i - 53) / 46);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tv.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3097(int i) {
		try {
			if (i != 0)
				aClass246_Sub3_Sub4Array6273 = null;
			aClass246_Sub3_Sub4Array6273 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.F(" + i + ')');
		}
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				aByte6275 = (byte) 100;
			if (aClass146_6277 == null)
				return 0;
			return aClass146_6277.ma();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tv.O(" + bool + ')');
		}
	}

	static final void method3098(Class98_Sub31_Sub2 class98_sub31_sub2, boolean bool, int i) {
		do {
			try {
				if (i != 28643)
					method3093(41, -106, -106, 7, 104, 23, 118, (byte) 62, 77);
				Class145.aClass268_1173.method3252(0, class98_sub31_sub2);
				if (!bool)
					break;
				aa_Sub3.method159(Class119_Sub2.aClass207_4726, -25233, class98_sub31_sub2, Class145.aClass268_1173, Class196.aClass207_1512, Class76_Sub2.aClass207_3733);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tv.D(" + (class98_sub31_sub2 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}
}
