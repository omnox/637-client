/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348 {
	int anInt2909;
	int anInt2910;
	static int anInt2911;
	int anInt2913;
	static boolean aBoolean2914;
	int anInt2915;

	static final void method3836(int i, int i_0_, int i_1_, int i_2_, boolean bool, boolean bool_3_, byte i_4_) {
		do {
			try {
				if (i_0_ < i_1_) {
					int i_5_ = (i_0_ + i_1_) / 2;
					int i_6_ = i_0_;
					Class53_Sub1 class53_sub1 = Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_5_];
					Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_5_] = Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_1_];
					Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_1_] = class53_sub1;
					for (int i_7_ = i_0_; (i_1_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
						if ((Class283.method3348((Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_7_]), 17, bool, class53_sub1, bool_3_, i_2_, i) ^ 0xffffffff) >= -1) {
							Class53_Sub1 class53_sub1_8_ = (Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_7_]);
							Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_7_] = (Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_6_]);
							Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_6_++] = class53_sub1_8_;
						}
					}
					Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_1_] = Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_6_];
					Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_6_] = class53_sub1;
					method3836(i, i_0_, i_6_ - 1, i_2_, bool, bool_3_, (byte) 93);
					method3836(i, 1 + i_6_, i_1_, i_2_, bool, bool_3_, (byte) 53);
				}
				if (i_4_ > 52)
					break;
				aBoolean2914 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vea.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ',' + bool_3_ + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vea.toString(" + ')');
		}
	}

	public static void method3837(int i) {
		do {
			try {
				IncomingOpcode.aClass58_2912 = null;
				if (i == 2)
					break;
				aBoolean2914 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vea.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class348(int i, int i_9_, int i_10_, int i_11_) {
		try {
			((Class348) this).anInt2909 = i;
			((Class348) this).anInt2910 = i_10_;
			((Class348) this).anInt2915 = i_11_;
			((Class348) this).anInt2913 = i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vea.<init>(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}
}
