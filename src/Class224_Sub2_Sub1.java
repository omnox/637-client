/* Class224_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class224_Sub2_Sub1 extends Class224_Sub2 {
	static int anInt6141 = -1;
	static volatile boolean aBoolean6142 = false;
	static int anInt6143;

	static final void method2838(int i, int i_0_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_0_, i + -139, i);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jm.A(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method2839(int i, int i_1_, int i_2_) {
		boolean bool = ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_1_][i_2_] != null) && ((Class172) (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_1_][i_2_])).aClass172_1330 != null);
		for (int i_3_ = i; i_3_ >= 0; i_3_--) {
			if ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_3_][i_1_][i_2_]) == null) {
				Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_3_][i_1_][i_2_] = new Class172(i_3_));
				if (bool)
					((Class172) class172).aByte1322++;
			}
		}
	}
}
