/* Class64_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub17 extends Class64 {
	static int anInt3684 = 0;
	static int[] anIntArray3685 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static float aFloat3686;
	static RuneScapeCache aClass207_3687;

	public static void method616(int i) {
		try {
			anIntArray3685 = null;
			aClass207_3687 = null;
			int i_0_ = -56 % ((i - -52) / 45);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nm.D(" + i + ')');
		}
	}

	final int method617(byte i) {
		try {
			if (i <= 119)
				return -123;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nm.E(" + i + ')');
		}
	}

	Class64_Sub17(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				return -93;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nm.A(" + i + ')');
		}
	}

	final void method551(byte i) {
		try {
			int i_1_ = this.aClass98_Sub27_495.method1289(-101).method2318(-1);
			if (i_1_ < 96)
				this.anInt494 = 0;
			if (i < 118)
				aFloat3686 = 0.5277947F;
			if (this.anInt494 > 1 && i_1_ < 128)
				this.anInt494 = 1;
			if (this.anInt494 > 2 && i_1_ < 192)
				this.anInt494 = 2;
			if (this.anInt494 < 0 || this.anInt494 > 3)
				this.anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nm.C(" + i + ')');
		}
	}

	static final void method618(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			int i_7_ = Class263.method3219(false, Class218.anInt1635, Class98_Sub10_Sub38.anInt5753, i_6_);
			int i_8_ = Class263.method3219(false, Class218.anInt1635, Class98_Sub10_Sub38.anInt5753, i);
			int i_9_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_2_);
			int i_10_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_4_);
			if (i_3_ != -21327)
				aClass207_3687 = null;
			for (int i_11_ = i_7_; i_8_ >= i_11_; i_11_++)
				Class333.method3761(i_5_, Class97.anIntArrayArray814[i_11_], i_9_, i_10_, (byte) 13);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nm.M(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	Class64_Sub17(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final void method550(int i, int i_12_) {
		try {
			int i_13_ = -60 / ((-26 - i) / 41);
			this.anInt494 = i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nm.B(" + i + ',' + i_12_ + ')');
		}
	}

	static final void method619(Class1 class1) {
		if (Class226.anInt1705 < 65535) {
			Class98_Sub5 class98_sub5 = class1.aClass98_Sub5_55;
			Class98_Sub10_Sub31.aClass1Array5717[Class226.anInt1705] = class1;
			Class21_Sub4.aBooleanArray5399[Class226.anInt1705] = false;
			Class226.anInt1705++;
			int i = class1.anInt57;
			if (class1.aBoolean54)
				i = 0;
			int i_14_ = class1.anInt57;
			if (class1.aBoolean58)
				i_14_ = Class364.anInt3103 - 1;
			for (int i_15_ = i; i_15_ <= i_14_; i_15_++) {
				int i_16_ = 0;
				int i_17_ = ((class98_sub5.method962(28699) - class98_sub5.method958(-96) + RuneScapeCache.anInt1577) >> Class151_Sub8.anInt5015);
				if (i_17_ < 0) {
					i_16_ -= i_17_;
					i_17_ = 0;
				}
				int i_18_ = ((class98_sub5.method962(28699) + class98_sub5.method958(127) - RuneScapeCache.anInt1577) >> Class151_Sub8.anInt5015);
				if (i_18_ >= Class64_Sub9.anInt3662)
					i_18_ = Class64_Sub9.anInt3662 - 1;
				for (int i_19_ = i_17_; i_19_ <= i_18_; i_19_++) {
					int i_20_ = class1.aShortArray59[i_16_++];
					int i_21_ = ((class98_sub5.method954(7019) - class98_sub5.method958(126) + RuneScapeCache.anInt1577) >> Class151_Sub8.anInt5015) + (i_20_ >>> 8);
					int i_22_ = i_21_ + (i_20_ & 0xff) - 1;
					if (i_21_ < 0)
						i_21_ = 0;
					if (i_22_ >= Class366.anInt3112)
						i_22_ = Class366.anInt3112 - 1;
					for (int i_23_ = i_21_; i_23_ <= i_22_; i_23_++) {
						long l = (Class373_Sub3.aLongArrayArrayArray5476[i_15_][i_23_][i_19_]);
						if ((l & 0xffffL) == 0L)
							Class373_Sub3.aLongArrayArrayArray5476[i_15_][i_23_][i_19_] = l | (long) Class226.anInt1705;
						else if ((l & 0xffff0000L) == 0L)
							Class373_Sub3.aLongArrayArrayArray5476[i_15_][i_23_][i_19_] = l | (long) Class226.anInt1705 << 16;
						else if ((l & 0xffff00000000L) == 0L)
							Class373_Sub3.aLongArrayArrayArray5476[i_15_][i_23_][i_19_] = l | (long) Class226.anInt1705 << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							Class373_Sub3.aLongArrayArrayArray5476[i_15_][i_23_][i_19_] = l | (long) Class226.anInt1705 << 48;
					}
				}
			}
		}
	}

	final int method556(int i, int i_24_) {
		try {
			int i_25_ = this.aClass98_Sub27_495.method1289(-108).method2318(-1);
			if (i_25_ < 96)
				return 3;
			if (i > 1 && i_25_ < 128)
				return 3;
			if (i_24_ != 29053)
				method621(125);
			if (i > 3 && i_25_ < 192)
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nm.F(" + i + ',' + i_24_ + ')');
		}
	}

	static final void method620(int i, int i_26_, boolean bool, int i_27_, int i_28_) {
		try {
			do {
				if (-i_26_ + i_27_ < Class76_Sub8.anInt3778 || i_26_ + i_27_ > Class3.anInt77 || Class98_Sub10_Sub38.anInt5753 > i - i_26_ || i - -i_26_ > Class218.anInt1635) {
					Class96.method924((byte) -109, i, i_26_, i_27_, i_28_);
					if (!client.aBoolean3553)
						break;
				}
				Class151_Sub1.method2446((byte) -127, i_27_, i_28_, i_26_, i);
			} while (false);
			if (bool != true)
				method616(-17);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nm.H(" + i + ',' + i_26_ + ',' + bool + ',' + i_27_ + ',' + i_28_ + ')'));
		}
	}

	final boolean method621(int i) {
		try {
			if (i != -1)
				method619(null);
			int i_29_ = this.aClass98_Sub27_495.method1289(-103).method2318(i);
			if (i_29_ < 96)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nm.G(" + i + ')');
		}
	}
}
