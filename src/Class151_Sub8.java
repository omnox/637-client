/* Class151_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class151_Sub8 extends Class151 {
	private boolean aBoolean5010 = false;
	private Class91 aClass91_5012;
	static Class98_Sub31_Sub2 aClass98_Sub31_Sub2_5013;
	static int[] anIntArray5014 = new int[4096];
	static int anInt5015;
	static int anInt5016;

	Class151_Sub8(ha_Sub1 var_ha_Sub1) {
		super(var_ha_Sub1);
		do {
			try {
				if (!var_ha_Sub1.aBoolean4391)
					break;
				aClass91_5012 = new Class91(var_ha_Sub1, 2);
				aClass91_5012.method887(0, -30389);
				this.aHa_Sub1_1215.method1845(1, 847872872);
				this.aHa_Sub1_1215.method1899(7681, 8960, 34165);
				this.aHa_Sub1_1215.method1840(2, 770, 86, 34168);
				this.aHa_Sub1_1215.method1886(770, 0, 34200, 34167);
				OpenGL.glTexGeni(8192, 9472, 34066);
				OpenGL.glTexGeni(8193, 9472, 34066);
				OpenGL.glTexGeni(8194, 9472, 34066);
				OpenGL.glEnable(3168);
				OpenGL.glEnable(3169);
				OpenGL.glEnable(3170);
				this.aHa_Sub1_1215.method1845(0, 847872872);
				aClass91_5012.method886((byte) 100);
				aClass91_5012.method887(1, -30389);
				this.aHa_Sub1_1215.method1845(1, 847872872);
				this.aHa_Sub1_1215.method1899(8448, 8960, 8448);
				this.aHa_Sub1_1215.method1840(2, 770, -62, 34166);
				this.aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
				OpenGL.glDisable(3168);
				OpenGL.glDisable(3169);
				OpenGL.glDisable(3170);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5888);
				this.aHa_Sub1_1215.method1845(0, 847872872);
				aClass91_5012.method886((byte) -125);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vj.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2468(byte i) {
		try {
			int i_0_ = 116 % ((i - -58) / 42);
			aClass98_Sub31_Sub2_5013 = null;
			anIntArray5014 = null;
			IncomingOpcode.aClass58_5011 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vj.B(" + i + ')');
		}
	}

	final void method2441(int i, int i_1_, int i_2_) {
		try {
			if (i_2_ > -2)
				method2445((byte) 108);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vj.G(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method2440(boolean bool, boolean bool_3_) {
		try {
			Class42_Sub2 class42_sub2 = this.aHa_Sub1_1215.method1827(-126);
			if (bool != false)
				aClass98_Sub31_Sub2_5013 = null;
			if (aClass91_5012 != null && class42_sub2 != null && bool_3_) {
				aClass91_5012.method888('\0', bool);
				this.aHa_Sub1_1215.method1845(1, 847872872);
				this.aHa_Sub1_1215.method1863(1, class42_sub2);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadMatrixf(this.aHa_Sub1_1215.aClass111_Sub1_4354.method2116(54), 0);
				OpenGL.glMatrixMode(5888);
				this.aHa_Sub1_1215.method1845(0, 847872872);
				aBoolean5010 = true;
			} else
				this.aHa_Sub1_1215.method1886(770, 0, 34200, 34168);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vj.D(" + bool + ',' + bool_3_ + ')'));
		}
	}

	final void method2442(Class42 class42, boolean bool, int i) {
		try {
			if (bool == false) {
				this.aHa_Sub1_1215.method1863(1, class42);
				this.aHa_Sub1_1215.method1896(260, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vj.F(" + (class42 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	final void method2443(boolean bool, int i) {
		do {
			try {
				this.aHa_Sub1_1215.method1899(7681, i + 8705, 8448);
				if (i == 255)
					break;
				IncomingOpcode.aClass58_5011 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vj.C(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2439(int i) {
		try {
			if (i != 31565)
				aClass98_Sub31_Sub2_5013 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vj.A(" + i + ')');
		}
	}

	final void method2445(byte i) {
		try {
			do {
				if (!aBoolean5010) {
					this.aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
					if (!client.aBoolean3553)
						break;
				}
				aClass91_5012.method888('\001', false);
				this.aHa_Sub1_1215.method1845(1, 847872872);
				this.aHa_Sub1_1215.method1863(1, null);
				this.aHa_Sub1_1215.method1845(0, 847872872);
			} while (false);
			this.aHa_Sub1_1215.method1899(8448, 8960, 8448);
			if (i <= 25)
				aClass98_Sub31_Sub2_5013 = null;
			aBoolean5010 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vj.E(" + i + ')');
		}
	}

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray5014[i] = Class222.method2825(-83, i);
		anInt5016 = 0;
	}
}
