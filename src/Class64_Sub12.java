/* Class64_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub12 extends Class64 {
	static boolean aBoolean3671;
	static int anInt3672 = 0;
	static boolean[][][] aBooleanArrayArrayArray3673;

	final void method551(byte i) {
		do {
			try {
				if (((Class64) this).anInt494 < 0 || ((Class64) this).anInt494 > 4)
					((Class64) this).anInt494 = method552(0);
				if (i > 118)
					break;
				method550(-40, 88);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hp.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				aBooleanArrayArrayArray3673 = null;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hp.A(" + i + ')');
		}
	}

	Class64_Sub12(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	public static void method599(byte i) {
		do {
			try {
				aBooleanArrayArrayArray3673 = null;
				if (i == -13)
					break;
				aBooleanArrayArrayArray3673 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hp.D(" + i + ')');
			}
			break;
		} while (false);
	}

	Class64_Sub12(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final void method550(int i, int i_0_) {
		try {
			((Class64) this).anInt494 = i_0_;
			int i_1_ = -121 % ((i - -26) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hp.B(" + i + ',' + i_0_ + ')');
		}
	}

	final int method556(int i, int i_2_) {
		try {
			if (i_2_ != 29053)
				return -96;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hp.F(" + i + ',' + i_2_ + ')');
		}
	}

	final int method600(byte i) {
		try {
			if (i <= 119)
				method551((byte) -101);
			return ((Class64) this).anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hp.E(" + i + ')');
		}
	}

	static {
		aBoolean3671 = false;
	}
}
