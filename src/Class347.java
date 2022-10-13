/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class347 {
	static int[] anIntArray2906;
	static int anInt2907 = 0;
	static Class98_Sub46_Sub8 aClass98_Sub46_Sub8_2908;

	public static void method3832(byte i) {
		try {
			aClass98_Sub46_Sub8_2908 = null;
			anIntArray2906 = null;
			int i_0_ = 79 % ((29 - i) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vc.B(" + i + ')');
		}
	}

	static final void method3833(int i, int i_1_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i, -70, i_1_);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vc.A(" + i + ',' + i_1_ + ')');
		}
	}

	static final int method3834(int i, char c, byte i_2_) {
		try {
			if (i_2_ > -69)
				return -103;
			int i_3_ = c << 4;
			if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
				c = Character.toLowerCase(c);
				i_3_ = 1 + (c << 4);
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vc.D(" + i + ',' + c + ',' + i_2_ + ')'));
		}
	}

	static final Class202 method3835(int i, ha_Sub1 var_ha_Sub1, int i_4_, String string) {
		try {
			int i_5_ = OpenGL.glGenProgramARB();
			OpenGL.glBindProgramARB(i_4_, i_5_);
			OpenGL.glProgramStringARB(i_4_, 34933, string);
			OpenGL.glGetIntegerv(34379, Class11.anIntArray123, 0);
			if (Class11.anIntArray123[0] != -1) {
				OpenGL.glBindProgramARB(i_4_, 0);
				return null;
			}
			OpenGL.glBindProgramARB(i_4_, i);
			return new Class202(var_ha_Sub1, i_4_, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vc.C(" + i + ',' + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i_4_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}
}
