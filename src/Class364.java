/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class364 {
	private d aD3101;
	static int[] anIntArray3102;
	static int anInt3103;
	static Class88 aClass88_3104;
	private ha_Sub1 aHa_Sub1_3105;
	private Class79 aClass79_3106 = new Class79(256);

	final Class42_Sub1 method3931(int i, int i_0_) {
		try {
			Object object = aClass79_3106.get((long) i_0_);
			if (object != null)
				return (Class42_Sub1) object;
			if (!aD3101.method8(-117, i_0_))
				return null;
			if (i <= 122)
				anIntArray3102 = null;
			Class238 class238 = aD3101.method11(i_0_, -28755);
			int i_1_ = (!((Class238) class238).aBoolean1822 ? ((ha_Sub1) aHa_Sub1_3105).anInt4309 : 64);
			Class42_Sub1 class42_sub1;
			if (((Class238) class238).aBoolean1817 && aHa_Sub1_3105.method1768()) {
				float[] fs = aD3101.method10((byte) -126, false, i_0_, i_1_, 0.7F, i_1_);
				class42_sub1 = new Class42_Sub1(aHa_Sub1_3105, 3553, 34842, i_1_, i_1_, (((Class238) class238).aByte1832 ^ 0xffffffff) != -1, fs, 6408);
			} else {
				int[] is;
				if ((((Class238) class238).anInt1818 ^ 0xffffffff) == -3 || !Class98_Sub10_Sub7.method1023(1, ((Class238) class238).aByte1820))
					is = aD3101.method13(127, i_1_, i_0_, 0.7F, false, i_1_);
				else
					is = aD3101.method9(i_0_, (byte) -120, i_1_, 0.7F, true, i_1_);
				class42_sub1 = new Class42_Sub1(aHa_Sub1_3105, 3553, 6408, i_1_, i_1_, ((Class238) class238).aByte1832 != 0, is, 0, 0, false);
			}
			class42_sub1.method383(((Class238) class238).aBoolean1819, 10242, ((Class238) class238).aBoolean1826);
			aClass79_3106.put((long) i_0_, class42_sub1);
			return class42_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vw.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final int method3932(boolean bool, byte i) {
		try {
			if (i != -67)
				aClass88_3104 = null;
			int i_2_ = Class98_Sub46.anInt4261;
			while_245_: do {
				while_244_: do {
					do {
						if (i_2_ != 0) {
							if (i_2_ == 1)
								break;
							if (i_2_ != 2)
								break while_245_;
							if (!client.aBoolean3553)
								break while_244_;
						}
						if (bool)
							return 0;
						return Class272.anInt2037;
					} while (false);
					return Class272.anInt2037;
				} while (false);
				return 0;
			} while (false);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vw.E(" + bool + ',' + i + ')');
		}
	}

	final void method3933(int i) {
		try {
			if (i != 0)
				aClass88_3104 = null;
			aClass79_3106.method800((byte) 62, 5);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vw.B(" + i + ')');
		}
	}

	final void method3934(byte i) {
		try {
			if (i != 100)
				aHa_Sub1_3105 = null;
			aClass79_3106.method794(i + 13);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vw.F(" + i + ')');
		}
	}

	static final void method3935() {
		Class314.method3644(1, anInt3103);
	}

	public static void method3936(byte i) {
		try {
			anIntArray3102 = null;
			int i_3_ = -19 / ((i - 62) / 47);
			aClass88_3104 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vw.D(" + i + ')');
		}
	}

	Class364(ha_Sub1 var_ha_Sub1, d var_d) {
		try {
			aD3101 = var_d;
			aHa_Sub1_3105 = var_ha_Sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vw.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
		}
	}
}
