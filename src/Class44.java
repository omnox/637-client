/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class44 {
	static boolean aBoolean378 = false;
	static OutgoingOpcode aClass171_380 = new OutgoingOpcode(3, 16);

	static final void method427(int i, int i_0_, int i_1_) {
		try {
			if (i != -19181)
				method427(-125, 127, -126);
			if (Class64_Sub2.aClass279_3643 == Class4.aClass279_86) {
				if (!Class76_Sub2.requestFlag(0, 0, 1, -2, 0, i_0_, i_1_, false, 1))
					Class76_Sub2.requestFlag(0, 0, 1, -3, i + 19181, i_0_, i_1_, false, 1);
			} else if (!Class76_Sub2.requestFlag(0, 0, 1, -3, i ^ ~0x4aec, i_0_, i_1_, false, 1))
				Class76_Sub2.requestFlag(0, 0, 1, -2, 0, i_0_, i_1_, false, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dca.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final String method428(int i, boolean bool, boolean bool_2_) {
		try {
			if (bool != false)
				method429((byte) -9);
			if (!bool_2_ || i < 0)
				return Integer.toString(i);
			return Class98_Sub10_Sub34.method1103(i, bool_2_, 328, 10);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dca.A(" + i + ',' + bool + ',' + bool_2_ + ')'));
		}
	}

	public static void method429(byte i) {
		do {
			try {
				IncomingOpcode.aClass58_379 = null;
				aClass171_380 = null;
				if (i > 20)
					break;
				IncomingOpcode.aClass58_379 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dca.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
