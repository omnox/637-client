import java.awt.event.ActionEvent;

/* PlayerUpdate - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlayerUpdate implements Interface14 {
	static Class79 aClass79_3411 = new Class79(5);
	private RuneScapeCache aClass207_3412;
	static boolean aBoolean3413 = false;

	static final void method2855(int i) {
		do {
			try {
				Class98_Sub37.aHa4185.method1791(Class46.aFloat388, Class260.aFloat3260, Class97.aFloat831);
				if (i == -19004)
					break;
				aBoolean3413 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oh.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2856(int i) {
		do {
			try {
				aClass79_3411 = null;
				if (i == 0)
					break;
				aClass79_3411 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oh.G(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2857(Class88 class88, int i, Object object) {
		do {
			try {
				if (((Class88) class88).anEventQueue698 != null) {
					for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > -51 && (((Class88) class88).anEventQueue698.peekEvent() != null)); i_0_++)
						Class246_Sub7.method3131(0, 1L);
					try {
						if (i == 31668) {
							if (object == null)
								break;
							((Class88) class88).anEventQueue698.postEvent(new ActionEvent(object, 1001, "dummy"));
						}
					} catch (Exception exception) {
						/* empty */
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("oh.D(" + (class88 != null ? "{...}" : "null") + ',' + i + ',' + (object != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	static final void method2858(Class98_Sub22_Sub1 class98_sub22_sub1, int i) {
		try {
			class98_sub22_sub1.method1256(0);
			boolean bool = class98_sub22_sub1.readBits((byte) -106, 1) == 1;
			if (bool) {
				Class98_Sub10_Sub20.method1060(za_Sub2.anInt6080, 12, class98_sub22_sub1);
			}
			for (int i_2_ = 0; i_2_ < Class2.anInt71 - 1; i_2_++) {
				boolean bool_2_ = class98_sub22_sub1.readBits((byte) -106, 1) == 1;
				if (bool_2_) {
					int i_4_ = class98_sub22_sub1.readBits((byte) -106, 11);
					Class98_Sub10_Sub20.method1060(i_4_, 12, class98_sub22_sub1);
				}
			}
			while (class98_sub22_sub1.readBits((byte) -106, 1) != 0) {
				int playerIndex = class98_sub22_sub1.readBits((byte) -106, 11);
				Class351.method3845(-2, playerIndex, class98_sub22_sub1);
			}
			class98_sub22_sub1.method1254((byte) 120);
			Class373_Sub2.anInt5473 = 0;
			Class2.anInt71 = 0;
			for (int i_14_ = 1; (i_14_ ^ 0xffffffff) > -2049; i_14_++) {
				Class98_Sub27.aByteArray4075[i_14_] >>= 1;
				Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_14_]);
				if (class246_sub3_sub4_sub2_sub2 == null)
					Class76_Sub9.anIntArray3791[Class373_Sub2.anInt5473++] = i_14_;
				else
					Class319.anIntArray2705[Class2.anInt71++] = i_14_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oh.C(" + (class98_sub22_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final Class191 method50(int i) {
		try {
			if (i != 15763)
				method2855(61);
			return Class191.aClass191_1473;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oh.B(" + i + ')');
		}
	}

	static final int method2859(int i, boolean bool, String string, int i_15_) {
		try {
			if (i < 2 || (i ^ 0xffffffff) < -37)
				throw new IllegalArgumentException("Invalid radix:" + i);
			boolean bool_16_ = false;
			if (i_15_ != -21972)
				method2859(-69, true, null, 22);
			boolean bool_17_ = false;
			int i_18_ = 0;
			int i_19_ = string.length();
			for (int i_20_ = 0; (i_19_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
				int i_21_ = string.charAt(i_20_);
				if (i_20_ == 0) {
					if (i_21_ == 45) {
						bool_16_ = true;
						continue;
					}
					if (i_21_ == 43 && bool)
						continue;
				}
				if (i_21_ >= 48 && (i_21_ ^ 0xffffffff) >= -58)
					i_21_ -= 48;
				else if ((i_21_ ^ 0xffffffff) <= -66 && i_21_ <= 90)
					i_21_ -= 55;
				else if (i_21_ >= 97 && (i_21_ ^ 0xffffffff) >= -123)
					i_21_ -= 87;
				else
					throw new NumberFormatException();
				if (i <= i_21_)
					throw new NumberFormatException();
				if (bool_16_)
					i_21_ = -i_21_;
				int i_22_ = i_18_ * i - -i_21_;
				if (i_22_ / i != i_18_)
					throw new NumberFormatException();
				i_18_ = i_22_;
				bool_17_ = true;
			}
			if (!bool_17_)
				throw new NumberFormatException();
			return i_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oh.F(" + i + ',' + bool + ',' + (string != null ? "{...}" : "null") + ',' + i_15_ + ')'));
		}
	}

	public final int method51(byte i) {
		try {
			if (i <= 126)
				aClass207_3412 = null;
			if (aClass207_3412.method2730((byte) 78))
				return 100;
			return aClass207_3412.method2762((byte) -114);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oh.E(" + i + ')');
		}
	}

	PlayerUpdate(RuneScapeCache class207) {
		try {
			aClass207_3412 = class207;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oh.<init>(" + (class207 != null ? "{...}" : "null") + ')');
		}
	}
}
