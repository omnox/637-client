/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class369 {
	static int anInt3129 = 0;
	static boolean aBoolean3130 = false;
	static float aFloat3131;
	static final void method3952(int i, byte i_0_) {
		do {
			try {
				do {
					if (Class98_Sub46_Sub20_Sub2.anInt6317 == 1) {
						Class257.anInt1946 = i;
						if (!client.aBoolean3553)
							break;
					}
					if ((Class98_Sub46_Sub20_Sub2.anInt6317 ^ 0xffffffff) == -3)
						Class31.anInt300 = i;
				} while (false);
				if (i_0_ == -55)
					break;
				method3952(27, (byte) -126);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wea.C(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	static int method3953(int i, int i_1_) {
		try {
			return i ^ i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wea.A(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method3954(int i) {
		do {
			try {
				if (Class76.aClass28ArrayArray586 != null) {
					for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (Class76.aClass28ArrayArray586.length ^ 0xffffffff)); i_2_++) {
						for (int i_3_ = 0; i_3_ < Class76.aClass28ArrayArray586[i_2_].length; i_3_++)
							Class76.aClass28ArrayArray586[i_2_][i_3_] = Class91.aClass28_722;
					}
				}
				if (i == 0)
					break;
				method3954(-48);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wea.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method3955(int i) {
		do {
			try {
				IncomingOpcode.aClass58_3132 = null;
				if (i > 75)
					break;
				method3954(91);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wea.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
