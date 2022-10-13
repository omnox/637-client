/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class250 {
	float[][] aFloatArrayArray1910;
	int[] anIntArray1911;
	int[] anIntArray1912;
	static OutgoingOpcode aClass171_1913 = new OutgoingOpcode(76, 7);
	static Class354 aClass354_1914;
	int[] anIntArray1915;

	public static void method3165(int i) {
		try {
			aClass171_1913 = null;
			if (i != 76)
				method3165(-70);
			aClass354_1914 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pl.B(" + i + ')');
		}
	}

	static final int method3166(int i, int i_0_, int i_1_, byte i_2_) {
		try {
			i_1_ &= 0x3;
			int i_3_ = 89 / ((-70 - i_2_) / 52);
			if (i_1_ == 0)
				return i_0_;
			if (i_1_ == 1)
				return -i + 7;
			if (i_1_ == 2)
				return -i_0_ + 7;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pl.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	Class250(int[] is, int[] is_4_, int[] is_5_, float[][] fs) {
		try {
			((Class250) this).anIntArray1915 = is_4_;
			((Class250) this).anIntArray1911 = is;
			((Class250) this).anIntArray1912 = is_5_;
			((Class250) this).aFloatArrayArray1910 = fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pl.<init>(" + (is != null ? "{...}" : "null") + ',' + (is_4_ != null ? "{...}" : "null") + ',' + (is_5_ != null ? "{...}" : "null") + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3167(byte i, Class98_Sub31 class98_sub31) {
		try {
			if (((Class98_Sub31) class98_sub31).aClass98_Sub24_4104 != null)
				((Class98_Sub24) ((Class98_Sub31) class98_sub31).aClass98_Sub24_4104).anInt4008 = 0;
			if (i == -32) {
				((Class98_Sub31) class98_sub31).aBoolean4102 = false;
				for (Class98_Sub31 class98_sub31_6_ = class98_sub31.method1322(); class98_sub31_6_ != null; class98_sub31_6_ = class98_sub31.method1327())
					method3167((byte) -32, class98_sub31_6_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pl.D(" + i + ',' + (class98_sub31 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3168(RuneScapeCache class207, boolean bool, d var_d) {
		do {
			try {
				Class98_Sub10_Sub39.aClass207_5773 = class207;
				Class98_Sub10_Sub8.aD5578 = var_d;
				if (bool == true)
					break;
				method3166(-101, -39, 69, (byte) -47);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pl.A(" + (class207 != null ? "{...}" : "null") + ',' + bool + ',' + (var_d != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
