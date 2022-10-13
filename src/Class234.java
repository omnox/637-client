/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class234 {
	static OutgoingOpcode aClass171_1747 = new OutgoingOpcode(15, 8);
	static RuneScapeCache runescapeCache;
	static float aFloat1749;
	static boolean aBoolean1750 = false;
	static RuneScapeCache aClass207_1751;

	public static void method2885(byte i) {
		try {
			int i_0_ = 60 % ((25 - i) / 58);
			aClass207_1751 = null;
			runescapeCache = null;
			aClass171_1747 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ot.C(" + i + ')');
		}
	}

	static final int method2886(int i, int i_1_) {
		try {
			if (i_1_ > -101)
				return -25;
			return i >>> -2139410934;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ot.B(" + i + ',' + i_1_ + ')');
		}
	}

	static final boolean method2887(int i, byte i_2_, int i_3_) {
		try {
			if (i_2_ != 46)
				method2886(36, 120);
			if ((i_3_ & 0xc580) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ot.A(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}
}
