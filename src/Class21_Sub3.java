/* Class21_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class21_Sub3 extends Class21 implements Interface4_Impl2 {
	static int anInt5389;
	static int anInt5390 = -1;
	private int anInt5391;
	private int anInt5392;

	static final void method275(boolean bool, int i, Class28 class28) {
		do {
			try {
				if (Class222.aBoolean1667) {
					Class222.aBoolean1667 = false;
					i = 0;
				}
				do {
					if (aa.aClass28_50 == null || !aa.aClass28_50.method299(true, class28)) {
						aa.aClass28_50 = class28;
						Class98_Sub46_Sub12.aLong6035 = Class343.method3819(-47);
						Class287.anInt2196 = Class98_Sub10_Sub6.anInt5570 = i;
						if (Class287.anInt2196 == 0) {
							RuntimeException_Sub1.method4011(-38);
							if (!client.aBoolean3553)
								break;
						}
						VarpClass.aClass48_3245 = Class98_Sub46_Sub4.aClass48_5962;
						Class162.anInt1271 = Class284_Sub1_Sub2.anInt6192;
						Class135.aFloat1053 = Class159.aFloat1254;
						Class346.aFloat2900 = Class260.aFloat3260;
						Class98_Sub28_Sub1.anInt5811 = Class98_Sub46_Sub6.anInt5979;
						Class98_Sub12.anInt3872 = Class263.anInt1965;
						Class234.aFloat1749 = Class141.aFloat1150;
						IOException_Sub1.aFloat31 = Class46.aFloat388;
						Class157.aFloat1249 = Class97.aFloat831;
						Class3.aFloat78 = Class215.aFloat1613;
					}
				} while (false);
				if (bool == false)
					break;
				anInt5389 = 4;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vca.A(" + bool + ',' + i + ',' + (class28 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final float method45(int i, float f) {
		try {
			if (i != -8473)
				method48(-66);
			return f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vca.J(" + i + ',' + f + ')');
		}
	}

	static final boolean method276(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ != 15123)
				method275(true, 53, null);
			return (Class98_Sub10_Sub1.method1005(i, i_1_, (byte) -23) & ((0x2000 & i) != 0 | Class373_Sub3.method3978(i_1_, i, (byte) 88) | Class21_Sub2.method271((byte) -104, i, i_1_)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class21_Sub3(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class164 class164, int i, int i_2_, byte[] is, int i_3_, int i_4_) {
		super(var_ha_Sub3_Sub2, 34037, class164, Class162.aClass162_1266, i_2_ * i, false);
		try {
			anInt5391 = i;
			anInt5392 = i_2_;
			this.aHa_Sub3_Sub2_3233.method2005(this, -123);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glPixelStorei(3314, i_4_);
			OpenGL.glTexImage2Dub(this.anInt3235, 0, this.method260(0), i, i_2_, 0, Class196.method2665(false, (this.aClass164_3237)), 5121, is, i_3_);
			OpenGL.glPixelStorei(3314, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + (class164 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public final int method47(int i) {
		try {
			if (i != 12941)
				return 31;
			return anInt5391;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vca.G(" + i + ')');
		}
	}

	public final void method41(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, byte[] is, Class164 class164, int i_10_) {
		try {
			if (i == 0)
				i = i_6_;
			this.aHa_Sub3_Sub2_3233.method2005(this, -123);
			if (i_9_ != -26946)
				method45(-63, 1.4202741F);
			OpenGL.glPixelStorei(3317, 1);
			if (i_6_ != i)
				OpenGL.glPixelStorei(3314, i);
			OpenGL.glTexSubImage2Dub(this.anInt3235, 0, i_10_, i_7_, i_6_, i_8_, Class196.method2665(false, class164), 5121, is, i_5_);
			if (i != i_6_)
				OpenGL.glPixelStorei(3314, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.M(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (is != null ? "{...}" : "null") + ',' + (class164 != null ? "{...}" : "null") + ',' + i_10_ + ')'));
		}
	}

	public final float method42(byte i, float f) {
		try {
			int i_11_ = 98 % ((i - -5) / 39);
			return f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vca.O(" + i + ',' + f + ')');
		}
	}

	public final int method43(int i) {
		try {
			if (i < 109)
				method49(15, -62, -104, null, -50, -111, -85, 115);
			return anInt5392;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vca.L(" + i + ')');
		}
	}

	public final void method46(boolean bool, boolean bool_12_, int i) {
		try {
			int i_13_ = -51 % ((i - 17) / 36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.K(" + bool + ',' + bool_12_ + ',' + i + ')'));
		}
	}

	Class21_Sub3(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i, int i_14_, int[] is, int i_15_, int i_16_) {
		super(var_ha_Sub3_Sub2, 34037, Class62.aClass164_486, Class162.aClass162_1266, i * i_14_, false);
		try {
			anInt5392 = i_14_;
			anInt5391 = i;
			this.aHa_Sub3_Sub2_3233.method2005(this, -121);
			OpenGL.glPixelStorei(3314, i_16_);
			OpenGL.glTexImage2Di(this.anInt3235, 0, 6408, anInt5391, anInt5392, 0, 32993, (this.aHa_Sub3_Sub2_3233.anInt6135), is, 4 * i_15_);
			OpenGL.glPixelStorei(3314, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ',' + (is != null ? "{...}" : "null") + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	Class21_Sub3(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class164 class164, int i, int i_17_, float[] fs, int i_18_, int i_19_) {
		super(var_ha_Sub3_Sub2, 34037, class164, Class162.aClass162_1270, i_17_ * i, false);
		try {
			anInt5392 = i_17_;
			anInt5391 = i;
			this.aHa_Sub3_Sub2_3233.method2005(this, 43);
			OpenGL.glPixelStorei(3314, i_19_);
			OpenGL.glTexImage2Df(this.anInt3235, 0, this.method260(0), i, i_17_, 0, Class196.method2665(false, (this.aClass164_3237)), 5126, fs, 4 * i_18_);
			OpenGL.glPixelStorei(3314, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + (class164 != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	public final void method44(int i, int i_20_, byte i_21_, int i_22_, int i_23_, int[] is, int i_24_) {
		try {
			int i_25_ = 46 / ((i_21_ - -48) / 59);
			int[] is_26_ = new int[anInt5391 * anInt5392];
			this.aHa_Sub3_Sub2_3233.method2005(this, 88);
			OpenGL.glGetTexImagei(this.anInt3235, 0, 32993, 5121, is_26_, 0);
			for (int i_27_ = 0; i_27_ < i_22_; i_27_++)
				Class236.method2891(is_26_, ((-i_27_ + -1 - (-i_22_ - i_24_)) * anInt5391), is, i_20_ - -(i * i_27_), i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.H(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + (is != null ? "{...}" : "null") + ',' + i_24_ + ')'));
		}
	}

	public final boolean method48(int i) {
		try {
			if (i > -22)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vca.N(" + i + ')');
		}
	}

	public final void method49(int i, int i_28_, int i_29_, int[] is, int i_30_, int i_31_, int i_32_, int i_33_) {
		do {
			try {
				if (i != 17779)
					method49(-84, 50, 115, null, 124, 55, -64, 94);
				this.aHa_Sub3_Sub2_3233.method2005(this, i + -17894);
				if (i_32_ == 0)
					i_32_ = i_33_;
				if (i_33_ != i_32_)
					OpenGL.glPixelStorei(3314, i_32_);
				OpenGL.glTexSubImage2Di(this.anInt3235, 0, i_30_, i_28_, i_33_, i_29_, 32993, (this.aHa_Sub3_Sub2_3233.anInt6135), is, i_31_);
				if (i_32_ == i_33_)
					break;
				OpenGL.glPixelStorei(3314, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vca.F(" + i + ',' + i_28_ + ',' + i_29_ + ',' + (is != null ? "{...}" : "null") + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ')'));
			}
			break;
		} while (false);
	}

	Class21_Sub3(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class164 class164, Class162 class162, int i, int i_34_) {
		super(var_ha_Sub3_Sub2, 34037, class164, class162, i_34_ * i, false);
		try {
			anInt5392 = i_34_;
			anInt5391 = i;
			this.aHa_Sub3_Sub2_3233.method2005(this, -119);
			OpenGL.glTexImage2Dub(this.anInt3235, 0, this.method260(0), i, i_34_, 0, Class196.method2665(false, this.aClass164_3237), Class98_Sub5_Sub1.method964(this.aClass162_3234, (byte) 105), null, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vca.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + (class164 != null ? "{...}" : "null") + ',' + (class162 != null ? "{...}" : "null") + ',' + i + ',' + i_34_ + ')'));
		}
	}
}
