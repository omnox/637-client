/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class41 {
	static OutgoingOpcode aClass171_371 = new OutgoingOpcode(31, 3);

	public static void method365(int i) {
		do {
			try {
				aClass171_371 = null;
				if (i == 0)
					break;
				aClass171_371 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cs.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static int method366(int i, int i_0_) {
		try {
			return i | i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cs.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method367(double d, int i) {
		try {
			Class42_Sub3.aClass111_5364.method2092(Class98_Sub5_Sub3.aClass111_5540);
			Class42_Sub3.aClass111_5364.method2106(0, 0, (int) d);
			if (i != 14794)
				method365(-123);
			Class154.aHa1231.a(Class42_Sub3.aClass111_5364);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cs.A(" + d + ',' + i + ')');
		}
	}
}
