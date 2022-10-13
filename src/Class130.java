/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130 {
	static Class302 aClass302_1028;
	static AnimableEntity[] aClass246_Sub3Array1029;
	static Object anObject1030;
	static int anInt1031 = 0;

	static final boolean method2230(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte[] is, int i_4_) {
		try {
			int i_5_ = i_3_ % i;
			int i_6_;
			if (i_5_ != 0)
				i_6_ = i - i_5_;
			else
				i_6_ = 0;
			int i_7_ = -((-1 + i + i_4_) / i);
			int i_8_ = -((i + (i_3_ - i_1_)) / i);
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				for (int i_10_ = i_8_; i_10_ < 0; i_10_++) {
					if (is[i_0_] == 0)
						return true;
					i_0_ += i;
				}
				i_0_ -= i_6_;
				if (is[-1 + i_0_] == 0)
					return true;
				i_0_ += i_2_;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ip.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ',' + i_4_ + ')'));
		}
	}

	public static void method2231(int i) {
		do {
			try {
				aClass302_1028 = null;
				aClass246_Sub3Array1029 = null;
				anObject1030 = null;
				if (i == 0)
					break;
				anInt1031 = 29;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ip.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
