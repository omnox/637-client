/* Class64_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub16 extends Class64 {
	static int anInt3680 = 0;
	static Class65 aClass65_3681 = new Class65();
	static short[] aShortArray3682;
	static RuneScapeCache aClass207_3683;

	final int method552(int i) {
		try {
			if (i != 0)
				return 97;
			if (!((Class64) this).aClass98_Sub27_495.method1291((byte) 118)) {
				if (((Class98_Sub27) ((Class64) this).aClass98_Sub27_495).aClass64_Sub8_4042.method586(true) && Class151_Sub5.method2462(((Class98_Sub27) (((Class64) this).aClass98_Sub27_495)).aClass64_Sub8_4042.method583((byte) 124), (byte) 20))
					return 1;
				return 0;
			}
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mf.A(" + i + ')');
		}
	}

	final int method556(int i, int i_0_) {
		try {
			if (i_0_ != 29053)
				aClass65_3681 = null;
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 117))
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mf.F(" + i + ',' + i_0_ + ')');
		}
	}

	Class64_Sub16(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final void method550(int i, int i_1_) {
		try {
			int i_2_ = -57 / ((-26 - i) / 41);
			((Class64) this).anInt494 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mf.B(" + i + ',' + i_1_ + ')');
		}
	}

	final boolean method613(int i) {
		try {
			if (i != -1)
				method614((byte) -99);
			if (!((Class64) this).aClass98_Sub27_495.method1291((byte) 122))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mf.G(" + i + ')');
		}
	}

	Class64_Sub16(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method614(byte i) {
		try {
			if (i <= 119)
				anInt3680 = -41;
			return ((Class64) this).anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mf.E(" + i + ')');
		}
	}

	final void method551(byte i) {
		try {
			if (i <= 118)
				aClass207_3683 = null;
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 117))
				((Class64) this).anInt494 = 2;
			if ((((Class64) this).anInt494 ^ 0xffffffff) > -1 || ((Class64) this).anInt494 > 2)
				((Class64) this).anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mf.C(" + i + ')');
		}
	}

	public static void method615(int i) {
		do {
			try {
				aShortArray3682 = null;
				aClass65_3681 = null;
				aClass207_3683 = null;
				if (i == 3)
					break;
				method615(19);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mf.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
