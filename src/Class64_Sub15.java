/* Class64_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub15 extends Class64 {
	static int anInt3676 = 0;
	static int anInt3678;
	static RuneScapeCache aClass207_3679;

	static final int[] method610(int i, int i_0_, float f, int i_1_, boolean bool, boolean bool_2_, int i_3_, int i_4_) {
		try {
			int[] is = new int[i_0_];
			Class98_Sub10_Sub35 class98_sub10_sub35 = new Class98_Sub10_Sub35();
			class98_sub10_sub35.anInt5733 = i_1_;
			class98_sub10_sub35.anInt5739 = (int) (f * 4096.0F);
			class98_sub10_sub35.aBoolean5731 = bool;
			class98_sub10_sub35.anInt5737 = i_4_;
			class98_sub10_sub35.anInt5734 = i_3_;
			class98_sub10_sub35.anInt5740 = i;
			class98_sub10_sub35.method1001((byte) 66);
			Class64_Sub2.method559(bool_2_, i_0_, 1);
			class98_sub10_sub35.method1107((byte) -76, is, 0);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lia.D(" + i + ',' + i_0_ + ',' + f + ',' + i_1_ + ',' + bool + ',' + bool_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method551(byte i) {
		try {
			if (this.aClass98_Sub27_495.aClass64_Sub18_4071.method625((byte) -123) && this.anInt494 == 2)
				this.anInt494 = 1;
			if (i >= 118) {
				if (this.anInt494 < 0 || this.anInt494 > 2)
					this.anInt494 = method552(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lia.C(" + i + ')');
		}
	}

	Class64_Sub15(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method556(int i, int i_5_) {
		try {
			if (i_5_ != 29053)
				return 21;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lia.F(" + i + ',' + i_5_ + ')');
		}
	}

	public static void method611(byte i) {
		do {
			try {
				aClass207_3679 = null;
				IncomingOpcode.aClass58_3677 = null;
				if (i == -51)
					break;
				aClass207_3679 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "lia.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method612(byte i) {
		try {
			if (i <= 119)
				method556(63, 110);
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lia.E(" + i + ')');
		}
	}

	final void method550(int i, int i_6_) {
		try {
			int i_7_ = -37 % ((-26 - i) / 41);
			this.anInt494 = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lia.B(" + i + ',' + i_6_ + ')');
		}
	}

	Class64_Sub15(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				method551((byte) 91);
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lia.A(" + i + ')');
		}
	}
}
