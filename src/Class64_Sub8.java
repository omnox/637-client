/* Class64_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub8 extends Class64 {
	boolean aBoolean3658 = false;
	static LinkedList aClass148_3659 = new LinkedList();
	private boolean aBoolean3660 = true;
	static OutgoingOpcode aClass171_3661 = new OutgoingOpcode(70, 3);

	final void method582(boolean bool, boolean bool_0_) {
		do {
			try {
				aBoolean3660 = bool;
				if (bool_0_ == false)
					break;
				method584(-106);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eg.I(" + bool + ',' + bool_0_ + ')'));
			}
			break;
		} while (false);
	}

	Class64_Sub8(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	Class64_Sub8(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method583(byte i) {
		try {
			if (i <= 119)
				aBoolean3660 = false;
			return ((Class64) this).anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eg.E(" + i + ')');
		}
	}

	final void method550(int i, int i_1_) {
		try {
			((Class64) this).anInt494 = i_1_;
			int i_2_ = 93 / ((-26 - i) / 41);
			((Class64_Sub8) this).aBoolean3658 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eg.B(" + i + ',' + i_1_ + ')');
		}
	}

	final int method556(int i, int i_3_) {
		try {
			if (i_3_ != 29053)
				aClass171_3661 = null;
			if (!((Class64) this).aClass98_Sub27_495.method1289(i_3_ + -29179).method2317(false))
				return 3;
			if (i == 3 && !Class48_Sub1_Sub1.method463(-1, "jagdx"))
				return 3;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eg.F(" + i + ',' + i_3_ + ')');
		}
	}

	final int method552(int i) {
		try {
			((Class64_Sub8) this).aBoolean3658 = true;
			if (i != 0)
				return 108;
			if (!((Class64) this).aClass98_Sub27_495.method1289(-125).method2317(false))
				return 0;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eg.A(" + i + ')');
		}
	}

	final void method551(byte i) {
		try {
			if (i < 118)
				((Class64_Sub8) this).aBoolean3658 = false;
			if (!((Class64) this).aClass98_Sub27_495.method1289(-117).method2317(false))
				((Class64) this).anInt494 = 0;
			if (((Class64) this).anInt494 < 0 || (((Class64) this).anInt494 ^ 0xffffffff) < -6)
				((Class64) this).anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eg.C(" + i + ')');
		}
	}

	public static void method584(int i) {
		do {
			try {
				aClass148_3659 = null;
				aClass171_3661 = null;
				if (i == 0)
					break;
				method585(45, (byte) -105, -121);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "eg.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method585(int i, byte i_4_, int i_5_) {
		do {
			try {
				Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_5_, -49, 12);
				class98_sub46_sub17.method1626((byte) -103);
				((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054 = i;
				if (i_4_ == -85)
					break;
				method584(-109);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eg.M(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method586(boolean bool) {
		try {
			return aBoolean3660;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eg.D(" + bool + ')');
		}
	}

	final boolean method587(int i) {
		try {
			if (!((Class64) this).aClass98_Sub27_495.method1289(-114).method2317(false))
				return false;
			if (i != -1)
				method551((byte) 5);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eg.G(" + i + ')');
		}
	}
}
