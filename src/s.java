
/* s - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class s {
	int anInt2200;
	int[][] anIntArrayArray2201;
	static String aString2202 = null;
	int anInt2203;
	int anInt2204;
	static int[] anIntArray2205;
	int anInt2206;

	abstract void method3416(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool, int i_2_, int i_3_);

	final int method3417(int i, int i_4_, boolean bool) {
		try {
			int i_5_ = i >> this.anInt2200;
			if (bool != true)
				return -46;
			int i_6_ = i_4_ >> this.anInt2200;
			if (i_5_ < 0 || i_6_ < 0 || this.anInt2203 + -1 < i_5_ || i_6_ > -1 + this.anInt2204)
				return 0;
			int i_7_ = i & -1 + this.anInt2206;
			int i_8_ = i_4_ & this.anInt2206 - 1;
			int i_9_ = ((((-i_7_ + this.anInt2206) * this.anIntArrayArray2201[i_5_][i_6_]) + i_7_ * this.anIntArrayArray2201[1 + i_5_][i_6_]) >> this.anInt2200);
			int i_10_ = ((((-i_7_ + this.anInt2206) * this.anIntArrayArray2201[i_5_][1 + i_6_]) - -(this.anIntArrayArray2201[i_5_ - -1][1 + i_6_] * i_7_)) >> this.anInt2200);
			return (i_8_ * i_10_ + (this.anInt2206 - i_8_) * i_9_ >> this.anInt2200);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("s.R(" + i + ',' + i_4_ + ',' + bool + ')'));
		}
	}

	abstract boolean method3418(r var_r, int i, int i_11_, int i_12_, int i_13_, boolean bool);

	static final boolean method3419(int i, int i_14_) {
		try {
			int i_15_ = -123 % ((i - -2) / 48);
			if (i_14_ < 4 || i_14_ > 8)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "s.P(" + i + ',' + i_14_ + ')');
		}
	}

	final int method3420(int i, int i_16_, int i_17_) {
		try {
			if (i_16_ != -12639)
				method3425(110, 4);
			return this.anIntArrayArray2201[i_17_][i];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("s.Q(" + i + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	abstract void U(int i, int i_18_, int[] is, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int i_26_, int i_27_, int i_28_, boolean bool);

	abstract void method3421(Class98_Sub5 class98_sub5, int[] is);

	abstract void method3422(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, boolean[][] bools);

	abstract void wa(r var_r, int i, int i_35_, int i_36_, int i_37_, boolean bool);

	abstract void YA();

	public static void method3423(boolean bool) {
		try {
			if (bool != true)
				aString2202 = null;
			aString2202 = null;
			anIntArray2205 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "s.S(" + bool + ')');
		}
	}

	abstract void CA(r var_r, int i, int i_38_, int i_39_, int i_40_, boolean bool);

	abstract void method3424(int i, int i_41_, int[] is, int[] is_42_, int[] is_43_, int[] is_44_, int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_, int[] is_49_, int[] is_50_, int[] is_51_, int i_52_, int i_53_, int i_54_, boolean bool);

	abstract void method3425(int i, int i_55_);

	abstract r fa(int i, int i_56_, r var_r);

	s(int i, int i_57_, int i_58_, int[][] is) {
		try {
			this.anInt2203 = i;
			this.anInt2204 = i_57_;
			int i_59_ = 0;
			for (/**/; i_58_ > 1; i_58_ >>= 1)
				i_59_++;
			this.anInt2206 = 1 << i_59_;
			this.anIntArrayArray2201 = is;
			this.anInt2200 = i_59_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("s.<init>(" + i + ',' + i_57_ + ',' + i_58_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method3426(int i, int i_60_, int i_61_, boolean[][] bools, boolean bool, int i_62_);

	abstract void ka(int i, int i_63_, int i_64_);
}
