/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class17 {
	private int anInt200;
	private Class225 aClass225_201 = null;
	static OutgoingOpcode aClass171_202 = new OutgoingOpcode(82, 8);
	static int anInt203;
	private Class225 aClass225_204 = null;
	static Class198 aClass198_205;
	private int anInt206 = 65000;

	static final void method239(int i, int i_0_) {
		try {
			Node class98 = Class168.aClass377_1287.start_iteration(97);
			if (i <= 11)
				anInt203 = -119;
			for (/**/; class98 != null; class98 = Class168.aClass377_1287.iterate_next(-1)) {
				if ((((Node) class98).uid >> -1444989456 & 0xffffL ^ 0xffffffffffffffffL) == ((long) i_0_ ^ 0xffffffffffffffffL))
					class98.remove();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bg.G(" + i + ',' + i_0_ + ')');
		}
	}

	final byte[] method240(int i, boolean bool) {
		try {
			if (bool != false)
				aClass198_205 = null;
			synchronized (aClass225_204) {
				try {
					if ((long) (i * 6 + 6) > aClass225_201.method2847(!bool))
						return null;
					aClass225_201.method2846((long) (6 * i), 0);
					aClass225_201.method2849(0, Class159.aByteArray1255, -12913, 6);
					int i_1_ = ((0xff & Class159.aByteArray1255[2]) + ((Class159.aByteArray1255[1] & 0xff) << 1688022760) + ((0xff & Class159.aByteArray1255[0]) << 1168448688));
					int i_2_ = ((0xff & Class159.aByteArray1255[5]) + (((Class159.aByteArray1255[3] & 0xff) << 2124255056) - -(0xff00 & (Class159.aByteArray1255[4] << 1644622216))));
					if (i_1_ < 0 || i_1_ > anInt206)
						return null;
					if ((i_2_ ^ 0xffffffff) >= -1 || ((aClass225_204.method2847(!bool) / 520L ^ 0xffffffffffffffffL) > ((long) i_2_ ^ 0xffffffffffffffffL)))
						return null;
					byte[] is = new byte[i_1_];
					int i_3_ = 0;
					int i_4_ = 0;
					while ((i_1_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
						if (i_2_ == 0)
							return null;
						aClass225_204.method2846((long) (520 * i_2_), 0);
						int i_5_ = -i_3_ + i_1_;
						if ((i_5_ ^ 0xffffffff) < -513)
							i_5_ = 512;
						aClass225_204.method2849(0, Class159.aByteArray1255, -12913, 8 + i_5_);
						int i_6_ = (((0xff & Class159.aByteArray1255[0]) << -1312835672) - -(0xff & Class159.aByteArray1255[1]));
						int i_7_ = ((0xff00 & Class159.aByteArray1255[2] << -96038520) + (Class159.aByteArray1255[3] & 0xff));
						int i_8_ = (((Class159.aByteArray1255[5] & 0xff) << -657785976) + ((Class159.aByteArray1255[4] << -142719632 & 0xff0000) + (Class159.aByteArray1255[6] & 0xff)));
						int i_9_ = Class159.aByteArray1255[7] & 0xff;
						if ((i ^ 0xffffffff) != (i_6_ ^ 0xffffffff) || i_4_ != i_7_ || anInt200 != i_9_)
							return null;
						if (i_8_ < 0 || ((aClass225_204.method2847(true) / 520L ^ 0xffffffffffffffffL) > ((long) i_8_ ^ 0xffffffffffffffffL)))
							return null;
						i_4_++;
						for (int i_10_ = 0; i_5_ > i_10_; i_10_++)
							is[i_3_++] = Class159.aByteArray1255[8 + i_10_];
						i_2_ = i_8_;
					}
					return is;
				} catch (java.io.IOException ioexception) {
					return null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bg.B(" + i + ',' + bool + ')');
		}
	}

	static final void method241(int i, ha var_ha, int i_11_, int i_12_, byte i_13_, int i_14_, int i_15_, String string) {
		do {
			try {
				if (Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508 == null || Class300.aClass332_2500 == null) {
					if (!Class332_Sub2.aClass207_5423.method2742(-71, Class38.anInt360) || !Class332_Sub2.aClass207_5423.method2742(-48, Class222.anInt1672))
						var_ha.aa(i_14_, i_15_, i_11_, i, (-Class355.anInt3017 + 255 << 544186680 | Class260.anInt3261), 1);
					else {
						Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508 = var_ha.method1758((Class324.method3685(Class332_Sub2.aClass207_5423, Class38.anInt360, 0)), true);
						Class324 class324 = Class324.method3685(Class332_Sub2.aClass207_5423, Class222.anInt1672, 0);
						Class300.aClass332_2500 = var_ha.method1758(class324, true);
						class324.method3691();
						Class76_Sub11.aClass332_3795 = var_ha.method1758(class324, true);
					}
				}
				if (Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508 != null && Class300.aClass332_2500 != null) {
					int i_16_ = ((i_11_ - Class300.aClass332_2500.method3734() * 2) / Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508.method3734());
					for (int i_17_ = 0; (i_16_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++)
						Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508.method3735((Class300.aClass332_2500.method3734() + i_14_ + i_17_ * Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508.method3734()), i_15_);
					Class300.aClass332_2500.method3735(i_14_, i_15_);
					Class76_Sub11.aClass332_3795.method3735(i_14_ + (i_11_ - Class76_Sub11.aClass332_3795.method3734()), i_15_);
				}
				Class98_Sub10_Sub34.aClass43_5730.method411((byte) 114, 14 + i_15_, string, (Class147.anInt1194 | ~0xffffff), -1, 3 + i_14_);
				var_ha.aa(i_14_, i + i_15_, i_11_, i_12_ + -i, (-Class355.anInt3017 + 255 << 738306488 | Class260.anInt3261), 1);
				if (i_13_ == 58)
					break;
				aClass198_205 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("bg.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + (string != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final boolean method242(boolean bool, int i, byte i_18_, byte[] is, int i_19_) {
		try {
			synchronized (aClass225_204) {
				try {
					int i_20_;
					if (!bool) {
						i_20_ = (int) ((519L + aClass225_204.method2847(true)) / 520L);
						if ((i_20_ ^ 0xffffffff) == -1)
							i_20_ = 1;
					} else {
						if (((long) (6 * i_19_ - -6) ^ 0xffffffffffffffffL) < (aClass225_201.method2847(true) ^ 0xffffffffffffffffL))
							return false;
						aClass225_201.method2846((long) (6 * i_19_), 0);
						aClass225_201.method2849(0, Class159.aByteArray1255, -12913, 6);
						i_20_ = ((Class159.aByteArray1255[5] & 0xff) + ((0xff & Class159.aByteArray1255[4]) << -1769789464) + (Class159.aByteArray1255[3] << 233682064 & 0xff0000));
						if (i_20_ <= 0 || ((aClass225_204.method2847(true) / 520L ^ 0xffffffffffffffffL) > ((long) i_20_ ^ 0xffffffffffffffffL)))
							return false;
					}
					Class159.aByteArray1255[2] = (byte) i;
					Class159.aByteArray1255[0] = (byte) (i >> 555589968);
					Class159.aByteArray1255[3] = (byte) (i_20_ >> -111684720);
					Class159.aByteArray1255[1] = (byte) (i >> -1570816984);
					Class159.aByteArray1255[5] = (byte) i_20_;
					Class159.aByteArray1255[4] = (byte) (i_20_ >> -423385592);
					aClass225_201.method2846((long) (i_19_ * 6), 0);
					aClass225_201.method2852(6, 0, -1, Class159.aByteArray1255);
					if (i_18_ != -41)
						return true;
					int i_21_ = 0;
					int i_22_ = 0;
					int i_23_;
					for (/**/; i > i_21_; i_21_ += i_23_) {
						int i_24_ = 0;
						if (bool) {
							aClass225_204.method2846((long) (520 * i_20_), 0);
							try {
								aClass225_204.method2849(0, (Class159.aByteArray1255), -12913, 8);
							} catch (java.io.EOFException eofexception) {
								break;
							}
							i_23_ = ((0xff & Class159.aByteArray1255[1]) + ((Class159.aByteArray1255[0] & 0xff) << -2029480344));
							i_24_ = ((0xff & Class159.aByteArray1255[6]) + ((Class159.aByteArray1255[5] & 0xff) << -2069346712) + (0xff0000 & (Class159.aByteArray1255[4] << -94230768)));
							int i_25_ = ((Class159.aByteArray1255[3] & 0xff) + (Class159.aByteArray1255[2] << -1770629848 & 0xff00));
							int i_26_ = Class159.aByteArray1255[7] & 0xff;
							if (i_23_ != i_19_ || (i_22_ ^ 0xffffffff) != (i_25_ ^ 0xffffffff) || anInt200 != i_26_)
								return false;
							if ((i_24_ ^ 0xffffffff) > -1 || ((long) i_24_ > aClass225_204.method2847(true) / 520L))
								return false;
						}
						if (i_24_ == 0) {
							bool = false;
							i_24_ = (int) ((519L + aClass225_204.method2847(true)) / 520L);
							if ((i_24_ ^ 0xffffffff) == -1)
								i_24_++;
							if (i_20_ == i_24_)
								i_24_++;
						}
						Class159.aByteArray1255[0] = (byte) (i_19_ >> 1054699720);
						if (i + -i_21_ <= 512)
							i_24_ = 0;
						Class159.aByteArray1255[2] = (byte) (i_22_ >> -272228248);
						Class159.aByteArray1255[3] = (byte) i_22_;
						Class159.aByteArray1255[1] = (byte) i_19_;
						Class159.aByteArray1255[7] = (byte) anInt200;
						Class159.aByteArray1255[5] = (byte) (i_24_ >> 1720878632);
						Class159.aByteArray1255[4] = (byte) (i_24_ >> -559801072);
						Class159.aByteArray1255[6] = (byte) i_24_;
						aClass225_204.method2846((long) (i_20_ * 520), i_18_ + 41);
						aClass225_204.method2852(8, 0, i_18_ + 40, Class159.aByteArray1255);
						i_23_ = -i_21_ + i;
						if ((i_23_ ^ 0xffffffff) < -513)
							i_23_ = 512;
						aClass225_204.method2852(i_23_, i_21_, -1, is);
						i_20_ = i_24_;
						i_22_++;
					}
					return true;
				} catch (java.io.IOException ioexception) {
					return false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bg.D(" + bool + ',' + i + ',' + i_18_ + ',' + (is != null ? "{...}" : "null") + ',' + i_19_ + ')'));
		}
	}

	public final String toString() {
		try {
			return "Cache:" + anInt200;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bg.toString(" + ')');
		}
	}

	static final void method243(int i, int i_27_, int i_28_, int i_29_, Mobile class246_sub3_sub4_sub2, int i_30_, int i_31_) {
		try {
			Class168.method2533(i_27_, ((AnimableEntity) class246_sub3_sub4_sub2).localXPos, i_30_, 0, (byte) 111, ((AnimableEntity) class246_sub3_sub4_sub2).localYPos, i_31_, ((AnimableEntity) class246_sub3_sub4_sub2).height_level, i_29_, i);
			int i_32_ = 35 % ((-13 - i_28_) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bg.C(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + (class246_sub3_sub4_sub2 != null ? "{...}" : "null") + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	public static void method244(int i) {
		do {
			try {
				aClass198_205 = null;
				aClass171_202 = null;
				if (i == -24652)
					break;
				anInt203 = -28;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bg.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method245(boolean bool, int i, int i_33_, byte[] is) {
		try {
			synchronized (aClass225_204) {
				if ((i ^ 0xffffffff) > -1 || i > anInt206)
					throw new IllegalArgumentException();
				if (bool != false)
					method240(29, false);
				boolean bool_34_ = method242(true, i, (byte) -41, is, i_33_);
				if (!bool_34_)
					bool_34_ = method242(false, i, (byte) -41, is, i_33_);
				return bool_34_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bg.A(" + bool + ',' + i + ',' + i_33_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class17(int i, Class225 class225, Class225 class225_35_, int i_36_) {
		try {
			aClass225_201 = class225_35_;
			anInt206 = i_36_;
			anInt200 = i;
			aClass225_204 = class225;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bg.<init>(" + i + ',' + (class225 != null ? "{...}" : "null") + ',' + (class225_35_ != null ? "{...}" : "null") + ',' + i_36_ + ')'));
		}
	}
}
