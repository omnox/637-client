/* Class64_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub21 extends Class64 {
	static int anInt3700 = 0;
	static int[] anIntArray3701 = new int[25];
	static int anInt3702;
	static LinkedList aClass148_3703;
	static int anInt3704 = 1407;

	public static void method638(int i) {
		do {
			try {
				anIntArray3701 = null;
				aClass148_3703 = null;
				if (i == 4)
					break;
				method638(3);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rha.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method550(int i, int i_0_) {
		try {
			((Class64) this).anInt494 = i_0_;
			int i_1_ = -51 / ((i - -26) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rha.B(" + i + ',' + i_0_ + ')');
		}
	}

	final void method551(byte i) {
		try {
			if (((Class64) this).anInt494 < 0 && ((Class64) this).anInt494 > 4)
				((Class64) this).anInt494 = method552(0);
			if (i < 118)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rha.C(" + i + ')');
		}
	}

	final int method639(byte i) {
		try {
			if (i < 119)
				method639((byte) 43);
			return ((Class64) this).anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rha.E(" + i + ')');
		}
	}

	Class64_Sub21(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	Class64_Sub21(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				anInt3700 = 51;
			if (((Class64) this).aClass98_Sub27_495.method1289(-108).method2319(32755) > 1)
				return 4;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rha.A(" + i + ')');
		}
	}

	final int method556(int i, int i_2_) {
		try {
			if (i_2_ != 29053)
				anInt3704 = -17;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rha.F(" + i + ',' + i_2_ + ')');
		}
	}

	static {
		anInt3702 = 0;
		aClass148_3703 = new LinkedList();
	}
}
