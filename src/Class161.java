/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class161 {
	static boolean[][] aBooleanArrayArray1260 = { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };
	static Class109 aClass109_1261;

	static final boolean method2514(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ != 16)
				aBooleanArrayArray1260 = null;
			if ((0x10 & i) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kp.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2515(int i) {
		try {
			aClass109_1261 = null;
			if (i != 1)
				aBooleanArrayArray1260 = null;
			aBooleanArrayArray1260 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kp.A(" + i + ')');
		}
	}
}
