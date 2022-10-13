/* Class64_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

final class Class64_Sub23 extends Class64 {
	static Class370 aClass370_3707;
	static int anInt3708;

	static final Class98_Sub32 method646(int i, int i_0_, Canvas canvas, byte i_1_) {
		try {
			try {
				Class var_class = Class.forName("Class98_Sub32_Sub2");
				Class98_Sub32 class98_sub32 = (Class98_Sub32) var_class.newInstance();
				class98_sub32.method1441(i, i_0_, 4095, canvas);
				if (i_1_ >= -28)
					anInt3708 = 90;
				return class98_sub32;
			} catch (Throwable throwable) {
				Class98_Sub32_Sub1 class98_sub32_sub1 = new Class98_Sub32_Sub1();
				class98_sub32_sub1.method1441(i, i_0_, 4095, canvas);
				return class98_sub32_sub1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("saa.H(" + i + ',' + i_0_ + ',' + (canvas != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final boolean method647(int i) {
		try {
			if (!Class144.method2311(false, this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 127)))
				return false;
			if (i != -1)
				method649(78);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.G(" + i + ')');
		}
	}

	final void method550(int i, int i_2_) {
		try {
			this.anInt494 = i_2_;
			int i_3_ = 93 / ((-26 - i) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.B(" + i + ',' + i_2_ + ')');
		}
	}

	Class64_Sub23(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final void method551(byte i) {
		try {
			if (i < 118)
				aClass370_3707 = null;
			if (this.aClass98_Sub27_495.aClass64_Sub8_4042.method586(true) && !Class144.method2311(false, this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 120)))
				this.anInt494 = 0;
			if (this.anInt494 < 0 || this.anInt494 > 2)
				this.anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.C(" + i + ')');
		}
	}

	final int method552(int i) {
		try {
			if (i != 0)
				return 77;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.A(" + i + ')');
		}
	}

	final int method648(byte i) {
		try {
			if (i < 119)
				return -112;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.E(" + i + ')');
		}
	}

	Class64_Sub23(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	public static void method649(int i) {
		do {
			try {
				aClass370_3707 = null;
				if (i < -50)
					break;
				method646(76, 110, null, (byte) -57);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "saa.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method556(int i, int i_4_) {
		try {
			if (i_4_ != 29053)
				method551((byte) -94);
			if (!Class144.method2311(false, this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 125)))
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.F(" + i + ',' + i_4_ + ')');
		}
	}
}
