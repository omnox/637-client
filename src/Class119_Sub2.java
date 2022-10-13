/* Class119_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119_Sub2 extends Class119 {
	private int anInt4722;
	private int anInt4723;
	private int anInt4724;
	private int anInt4725;
	static RuneScapeCache aClass207_4726;
	static int[] anIntArray4727 = new int[500];

	private static final void method2183(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			do {
				if ((i_2_ ^ 0xffffffff) <= (Class76_Sub8.anInt3778 ^ 0xffffffff) && (Class3.anInt77 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff) && (i_6_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) && Class218.anInt1635 >= i_4_) {
					Class48_Sub1.method455(i_3_, i_5_, i_0_, i_2_, false, i_6_, i_4_, i_1_);
					if (!client.aBoolean3553)
						break;
				}
				r.method1641(i_3_, i_4_, i_2_, i_5_, i_0_, -18907, i_6_, i_1_);
			} while (false);
			if (i != 1701353708)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lc.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method2184(byte i) {
		try {
			aClass207_4726 = null;
			if (i != 72)
				method2184((byte) 50);
			anIntArray4727 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lc.D(" + i + ')');
		}
	}

	final void method2178(int i, int i_7_, int i_8_) {
		try {
			int i_9_ = -52 / ((-3 - i) / 32);
			int i_10_ = anInt4724 * i_7_ >> 1701353708;
			int i_11_ = anInt4722 * i_7_ >> 310827276;
			int i_12_ = i_8_ * anInt4725 >> -526500468;
			int i_13_ = i_8_ * anInt4723 >> -968048116;
			Class119.method2177(((Class119) this).anInt988, i_13_, -80, i_11_, i_10_, i_12_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lc.B(" + i + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method2179(byte i, int i_14_, int i_15_) {
		try {
			int i_16_ = 49 / ((i - 50) / 38);
			int i_17_ = i_15_ * anInt4724 >> -1259702804;
			int i_18_ = i_15_ * anInt4722 >> -611555860;
			int i_19_ = i_14_ * anInt4725 >> 1917461164;
			int i_20_ = i_14_ * anInt4723 >> -415500500;
			Class64_Sub19.method632(((Class119) this).anInt985, i_18_, (byte) -51, ((Class119) this).anInt987, i_17_, i_19_, i_20_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lc.E(" + i + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	final void method2174(int i, int i_21_, int i_22_) {
		try {
			int i_23_ = i * anInt4724 >> -1082509588;
			if (i_22_ == -5515) {
				int i_24_ = anInt4722 * i >> -2074443060;
				int i_25_ = i_21_ * anInt4725 >> 1484019436;
				int i_26_ = i_21_ * anInt4723 >> -634503956;
				method2183(1701353708, i_24_, ((Class119) this).anInt988, i_23_, ((Class119) this).anInt985, i_26_, ((Class119) this).anInt987, i_25_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lc.C(" + i + ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	Class119_Sub2(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		super(i_30_, i_31_, i_32_);
		try {
			anInt4723 = i_29_;
			anInt4725 = i_27_;
			anInt4722 = i_28_;
			anInt4724 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lc.<init>(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'));
		}
	}
}
