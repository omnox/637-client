/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class319 {
	static int mouse_scroll_delta;
	static boolean aBoolean2700 = false;
	private d aD2701;
	static boolean[][] aBooleanArrayArray2702;
	private Class79 aClass79_2703 = new Class79(256);
	private ha_Sub3 aHa_Sub3_2704;
	static int[] anIntArray2705;
	static int anInt2706;
	static boolean aBoolean2707;

	public static void method3658(byte i) {
		do {
			try {
				anIntArray2705 = null;
				aBooleanArrayArray2702 = null;
				if (i >= 79)
					break;
				method3658((byte) -66);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tl.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3659(int i) {
		try {
			if (i != -3)
				method3658((byte) 47);
			aClass79_2703.method794(i + 80);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tl.B(" + i + ')');
		}
	}

	Class319(ha_Sub3 var_ha_Sub3, d var_d) {
		try {
			aHa_Sub3_2704 = var_ha_Sub3;
			aD2701 = var_d;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tl.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method3660(boolean bool) {
		try {
			if (!Class134_Sub1.method2246("jaclib", (byte) -36))
				return false;
			if (bool != true)
				method3658((byte) 113);
			return Class134_Sub1.method2246("hw3d", (byte) -36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tl.A(" + bool + ')');
		}
	}

	final Interface4_Impl2 method3661(int i, int i_0_) {
		try {
			Object object = aClass79_2703.get((long) i_0_);
			if (object != null)
				return (Interface4_Impl2) object;
			if (!aD2701.method8(-5, i_0_))
				return null;
			if (i != 0)
				return null;
			Class238 class238 = aD2701.method11(i_0_, i + -28755);
			int i_1_ = (!((Class238) class238).aBoolean1822 ? ((ha_Sub3) aHa_Sub3_2704).anInt4607 : 64);
			Interface4_Impl2 interface4_impl2;
			if (((Class238) class238).aBoolean1817 && aHa_Sub3_2704.method1768()) {
				float[] fs = aD2701.method10((byte) -117, false, i_0_, i_1_, 0.7F, i_1_);
				interface4_impl2 = aHa_Sub3_2704.method2066(Class62.aClass164_486, (((Class238) class238).aByte1832 ^ 0xffffffff) != -1, fs, false, i_1_, i_1_);
			} else {
				int[] is;
				if ((((Class238) class238).anInt1818 ^ 0xffffffff) == -3 || !Class98_Sub10_Sub7.method1023(i ^ 0x1, (((Class238) class238).aByte1820)))
					is = aD2701.method13(i + 115, i_1_, i_0_, 0.7F, false, i_1_);
				else
					is = aD2701.method9(i_0_, (byte) -116, i_1_, 0.7F, true, i_1_);
				interface4_impl2 = aHa_Sub3_2704.method2012(i_1_, i_1_, (byte) 31, is, (((Class238) class238).aByte1832 != 0));
			}
			interface4_impl2.method46(((Class238) class238).aBoolean1826, ((Class238) class238).aBoolean1819, -97);
			aClass79_2703.put((long) i_0_, interface4_impl2);
			return interface4_impl2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tl.D(" + i + ',' + i_0_ + ')');
		}
	}

	final void method3662(int i) {
		try {
			aClass79_2703.method800((byte) 62, 5);
			if (i >= -112)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tl.E(" + i + ')');
		}
	}

	static {
		mouse_scroll_delta = 0;
		anIntArray2705 = new int[2048];
		aBoolean2707 = false;
	}
}
