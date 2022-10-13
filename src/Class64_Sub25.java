/* Class64_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub25 extends Class64 {
	static int anInt3711;

	final int method556(int i, int i_0_) {
		try {
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 119))
				return 3;
			if (i_0_ != 29053)
				anInt3711 = 101;
			if (((Class64) this).aClass98_Sub27_495.method1286((byte) 104) == s_Sub1.aClass279_5197) {
				if (i == 0) {
					if ((((Class98_Sub27) ((Class64) this).aClass98_Sub27_495).aClass64_Sub14_4049.method609((byte) 124) ^ 0xffffffff) == -2)
						return 2;
					if ((((Class98_Sub27) ((Class64) this).aClass98_Sub27_495).aClass64_Sub20_4056.method634((byte) 124) ^ 0xffffffff) == -2)
						return 2;
					if ((((Class98_Sub27) ((Class64) this).aClass98_Sub27_495).aClass64_Sub28_4064.method668((byte) 125) ^ 0xffffffff) < -1)
						return 2;
				}
				return 1;
			}
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vba.F(" + i + ',' + i_0_ + ')');
		}
	}

	static final String method653(int i, int[] is) {
		try {
			StringBuffer stringbuffer = new StringBuffer();
			int i_1_ = RuntimeException_Sub1.anInt3201;
			for (int i_2_ = i; (is.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				Class220 class220 = Class303.aClass13_2529.method220(is[i_2_], -11180);
				if ((((Class220) class220).anInt1649 ^ 0xffffffff) != 0) {
					Class332 class332 = ((Class332) (Class98_Sub6.aClass79_3847.get((long) ((Class220) class220).anInt1649)));
					if (class332 == null) {
						Class324 class324 = Class324.method3685(Class332_Sub2.aClass207_5423, (((Class220) class220).anInt1649), 0);
						if (class324 != null) {
							class332 = Class265.aHa1974.method1758(class324, true);
							Class98_Sub6.aClass79_3847.put((long) ((Class220) class220).anInt1649, class332);
						}
					}
					if (class332 != null) {
						Class217.aClass332Array3408[i_1_] = class332;
						stringbuffer.append(" <img=").append(i_1_).append(">");
						i_1_++;
					}
				}
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vba.D(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class64_Sub25(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	static final Object method654(int i, byte[] is, boolean bool) {
		try {
			if (i != 2)
				anInt3711 = 82;
			if (is == null)
				return null;
			if (is.length > 136 && !PlayerUpdate.aBoolean3413) {
				try {
					Class317 class317 = ((Class317) Class.forName("Class317_Sub1").newInstance());
					class317.method3652((byte) -101, is);
					return class317;
				} catch (Throwable throwable) {
					PlayerUpdate.aBoolean3413 = true;
				}
			}
			if (bool)
				return Class246_Sub10.method3140(is, 0);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vba.H(" + i + ',' + (is != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method551(byte i) {
		do {
			try {
				if (i <= 118)
					method556(69, 53);
				do {
					if (((Class64) this).aClass98_Sub27_495.method1286((byte) 104) != s_Sub1.aClass279_5197) {
						((Class64) this).anInt494 = 1;
						if (!client.aBoolean3553)
							break;
					}
					if (((Class64) this).aClass98_Sub27_495.method1291((byte) 106))
						((Class64) this).anInt494 = 0;
				} while (false);
				if (((Class64) this).anInt494 == 0 || ((Class64) this).anInt494 == 1)
					break;
				((Class64) this).anInt494 = method552(0);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vba.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method655(byte i) {
		try {
			if (i <= 119)
				return 124;
			return ((Class64) this).anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vba.E(" + i + ')');
		}
	}

	static final boolean method656(int i, byte i_3_, int i_4_) {
		try {
			if (i_3_ != -123)
				method656(11, (byte) -48, 84);
			if (!(Class76_Sub9.method766(-91, i, i_4_) | (0x70000 & i_4_) != 0) && !Class238.method2919(-120, i_4_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vba.I(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method550(int i, int i_5_) {
		try {
			((Class64) this).anInt494 = i_5_;
			int i_6_ = 31 / ((-26 - i) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vba.B(" + i + ',' + i_5_ + ')');
		}
	}

	final int method552(int i) {
		try {
			if (i != 0)
				method655((byte) 4);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vba.A(" + i + ')');
		}
	}

	final boolean method657(int i) {
		try {
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 112))
				return false;
			if (i != -1)
				anInt3711 = -25;
			if (((Class64) this).aClass98_Sub27_495.method1286((byte) 104) == s_Sub1.aClass279_5197)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vba.G(" + i + ')');
		}
	}

	Class64_Sub25(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}
}
