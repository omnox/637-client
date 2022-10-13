/* Class119_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119_Sub1 extends Class119 {
	static int anInt4716;
	private int anInt4717;
	static Class154 aClass154_4718;
	private int anInt4719;
	private int anInt4720;
	private int anInt4721;

	static final void method2180(int i, int i_0_) {
		try {
			if (i_0_ != 15233)
				method2181(false);
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i, -103, 1);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bp.F(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method2181(boolean bool) {
		do {
			try {
				aClass154_4718 = null;
				if (bool == true)
					break;
				anInt4716 = 12;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bp.A(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final Class197 method2182(RuneScapeCache class207, boolean bool, int i) {
		try {
			byte[] is = class207.method2733(i, -96);
			if (is == null)
				return null;
			if (bool != true)
				method2181(false);
			return new Class197(is);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bp.D(" + (class207 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	final void method2174(int i, int i_1_, int i_2_) {
		do {
			try {
				if (i_2_ == -5515)
					break;
				anInt4716 = 29;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("bp.C(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	Class119_Sub1(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		super(-1, i_6_, i_7_);
		try {
			anInt4721 = i;
			anInt4719 = i_4_;
			anInt4720 = i_5_;
			anInt4717 = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bp.<init>(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final void method2179(byte i, int i_8_, int i_9_) {
		try {
			int i_10_ = -102 % ((50 - i) / 38);
			int i_11_ = i_9_ * anInt4721 >> 12;
			int i_12_ = i_9_ * anInt4719 >> 12;
			int i_13_ = anInt4717 * i_8_ >> 12;
			int i_14_ = anInt4720 * i_8_ >> 12;
			InputStream_Sub2.method125(i_12_, this.anInt985, i_14_, i_13_, i_11_, 21597);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bp.E(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void method2178(int i, int i_15_, int i_16_) {
		try {
			int i_17_ = 26 % ((-3 - i) / 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bp.B(" + i + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}
}
