/* Class98_Sub46_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class98_Sub46_Sub20 extends Class98_Sub46 {
	static int[] anIntArray6070 = new int[32];
	Interface20 anInterface20_6071;
	int anInt6072;
	static String[] aStringArray6073;
	static int anInt6074;

	abstract Object method1635(int i);

	public static void method1636(boolean bool) {
		try {
			if (bool == true) {
				anIntArray6070 = null;
				aStringArray6073 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "naa.C(" + bool + ')');
		}
	}

	static final int method1637(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (i_0_ >= -39)
				return 26;
			if (i_2_ == i_1_)
				return i_1_;
			int i_3_ = -i + 128;
			int i_4_ = i * (0x7f & i_2_) + i_3_ * (0x7f & i_1_) >> 7;
			int i_5_ = i_3_ * (0x380 & i_1_) + (0x380 & i_2_) * i >> 7;
			int i_6_ = (0xfc00 & i_2_) * i + (i_1_ & 0xfc00) * i_3_ >> 7;
			return i_5_ & 0x380 | 0xfc00 & i_6_ | i_4_ & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("naa.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	abstract boolean method1638(int i);

	static final int method1639(int i, int i_7_) {
		if (Class299_Sub2.aByteArrayArray5291 != null)
			return Class299_Sub2.aByteArrayArray5291[i][i_7_] & 0xff;
		return 0;
	}

	Class98_Sub46_Sub20(Interface20 interface20, int i) {
		try {
			this.anInt6072 = i;
			this.anInterface20_6071 = interface20;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("naa.<init>(" + (interface20 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		int i = 2;
		for (int i_8_ = 0; i_8_ < 32; i_8_++) {
			anIntArray6070[i_8_] = -1 + i;
			i += i;
		}
	}
}
