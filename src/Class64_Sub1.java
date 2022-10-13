/* Class64_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub1 extends Class64 {
	static int[][] anIntArrayArray3638 = { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
	static int[] anIntArray3639;
	static int[] anIntArray3640;
	static RuneScapeCache aClass207_3641;

	final void method551(byte i) {
		do {
			try {
				if (i > 118) {
					if (this.anInt494 == 1 || this.anInt494 == 0)
						break;
					this.anInt494 = method552(0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "aga.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method557(int i) {
		try {
			anIntArrayArray3638 = null;
			if (i <= 79)
				anIntArray3639 = null;
			aClass207_3641 = null;
			anIntArray3640 = null;
			IncomingOpcode.aClass58_3637 = null;
			anIntArray3639 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aga.D(" + i + ')');
		}
	}

	final int method558(byte i) {
		try {
			if (i < 119)
				return -80;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aga.E(" + i + ')');
		}
	}

	final int method556(int i, int i_0_) {
		try {
			if (i_0_ != 29053)
				return 78;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aga.F(" + i + ',' + i_0_ + ')');
		}
	}

	Class64_Sub1(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				anIntArray3639 = null;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aga.A(" + i + ')');
		}
	}

	Class64_Sub1(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final void method550(int i, int i_1_) {
		try {
			int i_2_ = 20 / ((i - -26) / 41);
			this.anInt494 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aga.B(" + i + ',' + i_1_ + ')');
		}
	}
}
