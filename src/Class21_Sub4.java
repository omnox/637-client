/* Class21_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class21_Sub4 extends Class21 implements Interface4_Impl1 {
	private int anInt5393;
	static int anInt5394 = 0;
	private int anInt5395;
	static int anInt5396 = 0;
	private int anInt5397;
	static OutgoingOpcode aClass171_5398 = new OutgoingOpcode(53, 3);
	static boolean[] aBooleanArray5399;

	public static void method277(byte i) {
		try {
			if (i == 0) {
				aBooleanArray5399 = null;
				aClass171_5398 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wha.D(" + i + ')');
		}
	}

	static final void method278(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_, int i_5_) {
		do {
			try {
				if (i_4_ != 65)
					method278(-57, -60, 38, -120, -43, (byte) 53, 87);
				if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4066.method641((byte) 127) == 0 || i_2_ == 0 || Class306.anInt2566 >= 50 || i_1_ == -1)
					break;
				Class245.aClass338Array1865[Class306.anInt2566++] = new Class338((byte) 1, i_1_, i_2_, i_3_, i, i_5_, i_0_, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("wha.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	Class21_Sub4(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class164 class164, int i, int i_6_, int i_7_, byte[] is) {
		super(var_ha_Sub3_Sub2, 32879, class164, Class162.aClass162_1266, i * (i_6_ * i_7_), false);
		try {
			anInt5395 = i_6_;
			anInt5393 = i;
			anInt5397 = i_7_;
			this.aHa_Sub3_Sub2_3233.method2005(this, -8);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage3Dub(this.anInt3235, 0, this.method260(0), anInt5393, anInt5395, anInt5397, 0, Class196.method2665(false, (this.aClass164_3237)), 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wha.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + (class164 != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ',' + i_7_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method279(int i, int i_8_) {
		try {
			if (i != 16953)
				method278(13, -128, 94, 94, 86, (byte) -31, -92);
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_8_, i ^ ~0x4261, 12);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wha.A(" + i + ',' + i_8_ + ')');
		}
	}
}
