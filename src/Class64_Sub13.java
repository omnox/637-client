/* Class64_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub13 extends Class64 {
	static GameInterfaceData[][] aClass293ArrayArray3674;

	static final void method601(Class185 class185, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				if ((i_1_ ^ 0xffffffff) <= -2 && i >= 1 && -2 + GameWorld.size_x >= i_1_ && (i ^ 0xffffffff) >= (-2 + GameWorld.size_y ^ 0xffffffff)) {
					if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 == null)
						break;
					Interface19 interface19 = Class146_Sub3.aClass305_Sub1_4952.method3583(i, i_2_, i_0_, i_3_ + -6094, i_1_);
					if (interface19 != null) {
						if (!(interface19 instanceof Class246_Sub3_Sub4_Sub5)) {
							if (interface19 instanceof Class246_Sub3_Sub1_Sub2)
								((Class246_Sub3_Sub1_Sub2) interface19).method3002(class185, (byte) -109);
							else if (interface19 instanceof Class246_Sub3_Sub3_Sub1)
								((Class246_Sub3_Sub3_Sub1) interface19).method3016(2048, class185);
							else if (interface19 instanceof Class246_Sub3_Sub5_Sub1)
								((Class246_Sub3_Sub5_Sub1) interface19).method3091(class185, false);
						} else
							((Class246_Sub3_Sub4_Sub5) interface19).method3083(class185, (byte) 32);
					}
				}
				if (i_3_ == 6093)
					break;
				aClass293ArrayArray3674 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("iq.G(" + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final int method602(byte i) {
		try {
			if (i <= 119)
				aClass293ArrayArray3674 = null;
			return ((Class64) this).anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iq.E(" + i + ')');
		}
	}

	Class64_Sub13(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method556(int i, int i_4_) {
		try {
			if (i_4_ != 29053)
				aClass293ArrayArray3674 = null;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iq.F(" + i + ',' + i_4_ + ')');
		}
	}

	Class64_Sub13(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	static final void method603(byte i) {
		try {
			if (!Class4.aBoolean79) {
				Class180.aFloat3405 += (-Class180.aFloat3405 + 24.0F) / 2.0F;
				Class64_Sub6.aBoolean3656 = true;
				if (i <= -93)
					Class4.aBoolean79 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iq.I(" + i + ')');
		}
	}

	final void method551(byte i) {
		try {
			if (i <= 118)
				aClass293ArrayArray3674 = null;
			if (((Class64) this).anInt494 != 1 && (((Class64) this).anInt494 ^ 0xffffffff) != -1)
				((Class64) this).anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iq.C(" + i + ')');
		}
	}

	static final void method604(int i, boolean bool, boolean bool_5_, RuneScapeCache class207, int i_6_, int i_7_, int i_8_, long l) {
		try {
			Class116.aClass98_Sub31_Sub2_965 = null;
			Class224_Sub3.anInt5037 = i_7_;
			GameInterface.anInt3951 = i_8_;
			Class257.anInt1948 = 1;
			Class269.aClass207_2025 = class207;
			Class348.anInt2911 = 10000;
			Class76_Sub8.anInt3770 = i_6_;
			Class133.aLong3455 = l;
			Class1.aBoolean66 = bool;
			if (bool_5_ == false)
				Class22.anInt219 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iq.M(" + i + ',' + bool + ',' + bool_5_ + ',' + (class207 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + l + ')'));
		}
	}

	public static void method605(int i) {
		try {
			if (i != -2)
				aClass293ArrayArray3674 = null;
			aClass293ArrayArray3674 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iq.H(" + i + ')');
		}
	}

	static final void method606(int i, int i_9_) {
		do {
			try {
				Class98_Sub10_Sub13.anInt5600 = i_9_;
				Class246_Sub4_Sub1.aClass79_6170.method794(110);
				if (i == 18279)
					break;
				method603((byte) -100);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "iq.D(" + i + ',' + i_9_ + ')');
			}
			break;
		} while (false);
	}

	final void method550(int i, int i_10_) {
		try {
			int i_11_ = -107 % ((i - -26) / 41);
			((Class64) this).anInt494 = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iq.B(" + i + ',' + i_10_ + ')');
		}
	}

	final int method552(int i) {
		try {
			if (i != 0)
				return -49;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iq.A(" + i + ')');
		}
	}
}
