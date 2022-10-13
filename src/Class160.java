/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class160 {
	static RSByteBuffer aClass98_Sub22_1257 = new RSByteBuffer(1350);
	static int anInt1258;
	static OutgoingOpcode aClass171_1259 = new OutgoingOpcode(78, 11);

	static final void method2511(int i) {
		try {
			synchronized (Class98_Sub46_Sub20_Sub2.aClass218Array6316) {
				if (i != 1350) {
					/* empty */
				} else {
					for (int i_0_ = 0; (Class98_Sub46_Sub20_Sub2.aClass218Array6316.length > i_0_); i_0_++) {
						Class98_Sub46_Sub20_Sub2.aClass218Array6316[i_0_] = new Class218();
						Class1.anIntArray65[i_0_] = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ko.C(" + i + ')');
		}
	}

	public static void method2512(byte i) {
		try {
			aClass171_1259 = null;
			if (i == -119)
				aClass98_Sub22_1257 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ko.B(" + i + ')');
		}
	}

	static final void method2513(byte i, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			do {
				if ((i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					Class333.method3761(i_1_, Class97.anIntArrayArray814[i_4_], i_3_, i_2_, (byte) 65);
					if (!client.aBoolean3553)
						break;
				}
				Class333.method3761(i_1_, Class97.anIntArrayArray814[i_4_], i_2_, i_3_, (byte) -127);
			} while (false);
			if (i >= -66)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ko.A(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}
}
