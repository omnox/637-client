/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class288 implements Interface12 {
	private ha_Sub1 aHa_Sub1_3374;
	static Class105 aClass105_3375 = new Class105("", 18);
	static int[] anIntArray3376;
	private int anInt3377;
	private Interface3[] anInterface3Array3378 = new Interface3[9];
	private int anInt3379;
	private int anInt3380;
	static Class128 aClass128_3381 = new Class128();
	private int anInt3382 = -1;
	private int anInt3383;
	private int anInt3384 = 0;

	final void method3395(int i, Class42_Sub1 class42_sub1, int i_0_) {
		do {
			try {
				method3405(0, class42_sub1, -128, i);
				if (i_0_ > 106)
					break;
				method36((byte) 25);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("rr.J(" + i + ',' + (class42_sub1 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method3396(int i, int i_1_, Class42_Sub2 class42_sub2, int i_2_, int i_3_) {
		try {
			if ((~anInt3382) == i_3_)
				throw new RuntimeException();
			int i_4_ = 1 << i_1_;
			if (((~i_4_) & anInt3377) != 0) {
				if ((anInt3379 != class42_sub2.anInt5357) || (class42_sub2.anInt5357 != anInt3380))
					throw new RuntimeException();
			} else {
				anInt3380 = class42_sub2.anInt5357;
				anInt3379 = class42_sub2.anInt5357;
			}
			class42_sub2.method391(i, Class358.anIntArray3034[i_1_], i_2_, anInt3382, (byte) -99);
			anInterface3Array3378[i_1_] = class42_sub2;
			anInt3377 |= i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rr.C(" + i + ',' + i_1_ + ',' + (class42_sub2 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final void method37(byte i) {
		try {
			OpenGL.glBindFramebufferEXT(36008, anInt3383);
			if (i == 77) {
				anInt3384 |= 0x1;
				anInt3382 = method3399(3);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.P(" + i + ')');
		}
	}

	public final void method39(byte i) {
		try {
			if (i <= 10)
				method3396(87, 67, null, -88, -66);
			OpenGL.glBindFramebufferEXT(36160, anInt3383);
			anInt3384 |= 0x4;
			anInt3382 = method3399(3);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.A(" + i + ')');
		}
	}

	public static void method3397(boolean bool) {
		do {
			try {
				aClass105_3375 = null;
				aClass128_3381 = null;
				anIntArray3376 = null;
				if (bool == true)
					break;
				method3397(false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rr.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method3398(int i, int i_5_) {
		try {
			if (i <= -20) {
				if (anInt3382 == -1)
					throw new RuntimeException();
				OpenGL.glReadBuffer(Class358.anIntArray3034[i_5_]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.N(" + i + ',' + i_5_ + ')');
		}
	}

	private final int method3399(int i) {
		try {
			if ((0x4 & anInt3384) != 0)
				return 36160;
			if ((0x2 & anInt3384) != 0)
				return 36009;
			if ((anInt3384 & 0x1) != 0)
				return 36008;
			if (i != 3)
				aClass128_3381 = null;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.O(" + i + ')');
		}
	}

	static final boolean method3400(int i, int i_6_, int i_7_, int i_8_, int i_9_, byte i_10_, int i_11_, int[] is) {
		try {
			if (i_11_ > Class64_Sub3.anInt3646)
				i_11_ = Class64_Sub3.anInt3646;
			if (i < 0)
				i = 0;
			if (i >= i_11_)
				return true;
			if (i_10_ >= -18)
				aClass128_3381 = null;
			i_9_ += i * i_6_;
			i_8_ = i_11_ - i >> 2;
			i_7_ += i - 1;
			if (Class287.anInt2190 == 1) {
				Class4.anInt81 += i_8_;
				while (--i_8_ >= 0) {
					if (i_9_ < is[++i_7_])
						is[i_7_] = i_9_;
					i_9_ += i_6_;
					if (i_9_ < is[++i_7_])
						is[i_7_] = i_9_;
					i_9_ += i_6_;
					if (is[++i_7_] > i_9_)
						is[i_7_] = i_9_;
					i_9_ += i_6_;
					if (is[++i_7_] > i_9_)
						is[i_7_] = i_9_;
					i_9_ += i_6_;
				}
				i_8_ = i_11_ - i & 0x3;
				while (--i_8_ >= 0) {
					if (is[++i_7_] > i_9_)
						is[i_7_] = i_9_;
					i_9_ += i_6_;
				}
			} else {
				i_9_ -= 38400;
				while (--i_8_ >= 0) {
					if (i_9_ < is[++i_7_])
						return false;
					i_9_ += i_6_;
					if (is[++i_7_] > i_9_)
						return false;
					i_9_ += i_6_;
					if (is[++i_7_] > i_9_)
						return false;
					i_9_ += i_6_;
					if (is[++i_7_] > i_9_)
						return false;
					i_9_ += i_6_;
				}
				i_8_ = 0x3 & -i + i_11_;
				while (--i_8_ >= 0) {
					if (is[++i_7_] > i_9_)
						return false;
					i_9_ += i_6_;
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rr.F(" + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method36(byte i) {
		try {
			OpenGL.glBindFramebufferEXT(36009, anInt3383);
			if (i > -113)
				method3399(-82);
			anInt3384 |= 0x2;
			anInt3382 = method3399(3);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.H(" + i + ')');
		}
	}

	public final void method40(byte i) {
		try {
			OpenGL.glBindFramebufferEXT(36009, 0);
			anInt3384 &= ~0x2;
			if (i != -30)
				method3400(-109, -55, 70, 87, -56, (byte) 83, 20, null);
			anInt3382 = method3399(3);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.G(" + i + ')');
		}
	}

	final void method3401(int i, boolean bool) {
		try {
			if (bool != true)
				method40((byte) 2);
			if (anInterface3Array3378[i] != null)
				anInterface3Array3378[i].method3((byte) -120);
			anInt3377 &= ~(1 << i);
			anInterface3Array3378[i] = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.E(" + i + ',' + bool + ')');
		}
	}

	final void method3402(int i, int i_12_, int i_13_, Class42_Sub2 class42_sub2) {
		try {
			method3396(i_12_, i_13_, class42_sub2, i, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rr.Q(" + i + ',' + i_12_ + ',' + i_13_ + ',' + (class42_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method38(int i) {
		try {
			if (i != -27095)
				anInt3384 = -9;
			OpenGL.glBindFramebufferEXT(36008, 0);
			anInt3384 &= ~0x1;
			anInt3382 = method3399(i ^ ~0x69d5);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.I(" + i + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			aHa_Sub1_3374.method1837((byte) -103, anInt3383);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.finalize(" + ')');
		}
	}

	final boolean method3403(byte i) {
		try {
			int i_14_ = OpenGL.glCheckFramebufferStatusEXT(anInt3382);
			if (i_14_ != 36053)
				return false;
			if (i != 74)
				method3401(-5, true);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.D(" + i + ')');
		}
	}

	final void method3404(int i, int i_15_) {
		try {
			if ((~anInt3382) == i)
				throw new RuntimeException();
			OpenGL.glDrawBuffer(Class358.anIntArray3034[i_15_]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.K(" + i + ',' + i_15_ + ')');
		}
	}

	private final void method3405(int i, Class42_Sub1 class42_sub1, int i_16_, int i_17_) {
		try {
			if (anInt3382 == -1)
				throw new RuntimeException();
			int i_18_ = 1 << i_17_;
			if ((anInt3377 & (~i_18_)) != 0) {
				if ((class42_sub1.anInt5355 != anInt3379) || (class42_sub1.anInt5352 != anInt3380))
					throw new RuntimeException();
			} else {
				anInt3379 = class42_sub1.anInt5355;
				anInt3380 = class42_sub1.anInt5352;
			}
			if (i_16_ >= -89)
				anInterface3Array3378 = null;
			class42_sub1.method382(anInt3382, true, Class358.anIntArray3034[i_17_], i);
			anInterface3Array3378[i_17_] = class42_sub1;
			anInt3377 |= i_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rr.L(" + i + ',' + (class42_sub1 != null ? "{...}" : "null") + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	final void method3406(byte i, int i_19_, Class98_Sub46_Sub14 class98_sub46_sub14) {
		try {
			if (anInt3382 == -1)
				throw new RuntimeException();
			if (i < 56)
				anInt3382 = -95;
			int i_20_ = 1 << i_19_;
			do {
				if (((~i_20_) & anInt3377) == 0) {
					anInt3380 = (class98_sub46_sub14.anInt5377);
					anInt3379 = (class98_sub46_sub14.anInt5376);
					if (!client.aBoolean3553)
						break;
				}
				if (anInt3379 != class98_sub46_sub14.anInt5376 || ((class98_sub46_sub14.anInt5377) != anInt3380))
					throw new RuntimeException();
			} while (false);
			class98_sub46_sub14.method1605(0, anInt3382, Class358.anIntArray3034[i_19_]);
			anInterface3Array3378[i_19_] = class98_sub46_sub14;
			anInt3377 |= i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rr.R(" + i + ',' + i_19_ + ',' + (class98_sub46_sub14 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method35(byte i) {
		try {
			OpenGL.glBindFramebufferEXT(36160, 0);
			if (i != 69)
				anInt3383 = 94;
			anInt3384 &= ~0x4;
			anInt3382 = method3399(i + -66);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.M(" + i + ')');
		}
	}

	Class288(ha_Sub1 var_ha_Sub1) {
		try {
			if (!var_ha_Sub1.aBoolean4460)
				throw new IllegalStateException("");
			aHa_Sub1_3374 = var_ha_Sub1;
			OpenGL.glGenFramebuffersEXT(1, Class195.anIntArray1497, 0);
			anInt3383 = Class195.anIntArray1497[0];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rr.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ')');
		}
	}
}
