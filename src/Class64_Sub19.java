/* Class64_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub19 extends Class64 {
	static short aShort3692;
	static int anInt3693 = 0;

	final int method630(byte i) {
		try {
			if (i < 119)
				method551((byte) -70);
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ra.E(" + i + ')');
		}
	}

	final void method550(int i, int i_0_) {
		try {
			int i_1_ = 62 % ((-26 - i) / 41);
			this.anInt494 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ra.B(" + i + ',' + i_0_ + ')');
		}
	}

	static final boolean method631(int i, int i_2_, int i_3_) {
		try {
			if (i_3_ != -2)
				return true;
			return (s_Sub1.method3433(i_2_, i_3_ ^ ~0x3de8, i) & za_Sub2.method1682(i_2_, 0, i));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ra.G(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final int method552(int i) {
		try {
			if (i != 0)
				return -63;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ra.A(" + i + ')');
		}
	}

	Class64_Sub19(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	Class64_Sub19(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method556(int i, int i_4_) {
		try {
			if (i_4_ != 29053)
				method550(-113, 77);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ra.F(" + i + ',' + i_4_ + ')');
		}
	}

	static final void method632(int i, int i_5_, byte i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		do {
			try {
				if (i_8_ >= Class76_Sub8.anInt3778 && Class3.anInt77 >= i_5_ && Class98_Sub10_Sub38.anInt5753 <= i_9_ && Class218.anInt1635 >= i_10_) {
					if (i_7_ == 1)
						Class64_Sub3.method565(i_9_, i_10_, i_5_, i_8_, i, -10194);
					else
						Class98_Sub26.method1279(i_9_, i_5_, i_7_, i, i_10_, i_8_, true);
				} else if (i_7_ != 1)
					Class98_Sub10_Sub19.method1059(false, i_8_, i, i_9_, i_7_, i_5_, i_10_);
				else
					RuntimeException_Sub1.method4010(-31085, i_10_, i_8_, i_9_, i_5_, i);
				if (i_6_ == -51)
					break;
				aShort3692 = (short) 74;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ra.D(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}

	final void method551(byte i) {
		try {
			if (i < 118)
				method632(5, 122, (byte) 12, -14, -80, 53, -39);
			if (this.anInt494 < 0 || this.anInt494 > 4)
				this.anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ra.C(" + i + ')');
		}
	}

	static {
		aShort3692 = (short) 256;
	}
}
