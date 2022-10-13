/* Class98_Sub10_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub13 extends Class98_Sub10 {
	static int anInt5600;
	private int anInt5601 = 4096;
	static int anInt5602 = 0;
	static int[] anIntArray5603 = new int[5];

	public Class98_Sub10_Sub13() {
		this(4096);
	}

	static final int method1041(Mobile class246_sub3_sub4_sub2, int i) {
		try {
			if ((((Mobile) class246_sub3_sub4_sub2).anInt6414 ^ 0xffffffff) == -1)
				return 0;
			if ((((Mobile) class246_sub3_sub4_sub2).anInt6364 ^ 0xffffffff) != i) {
				Mobile class246_sub3_sub4_sub2_0_ = null;
				if (((((Mobile) class246_sub3_sub4_sub2).anInt6364) ^ 0xffffffff) > -32769) {
					Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) ((Mobile) class246_sub3_sub4_sub2).anInt6364, i + -1)));
					if (class98_sub39 != null)
						class246_sub3_sub4_sub2_0_ = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				} else if ((((Mobile) class246_sub3_sub4_sub2).anInt6364 ^ 0xffffffff) <= -32769)
					class246_sub3_sub4_sub2_0_ = (Class151_Sub9.playerArray[((Mobile) class246_sub3_sub4_sub2).anInt6364 + -32768]);
				if (class246_sub3_sub4_sub2_0_ != null) {
					int i_1_ = (-(((AnimableEntity) class246_sub3_sub4_sub2_0_).localXPos) + (((AnimableEntity) class246_sub3_sub4_sub2).localXPos));
					int i_2_ = (-(((AnimableEntity) class246_sub3_sub4_sub2_0_).localYPos) + (((AnimableEntity) class246_sub3_sub4_sub2).localYPos));
					if ((i_1_ ^ 0xffffffff) != -1 || i_2_ != 0)
						class246_sub3_sub4_sub2.method3042(0x3fff & (int) (2607.5945876176133 * Math.atan2((double) i_1_, (double) i_2_)), -8193);
				}
			}
			do {
				if (!(class246_sub3_sub4_sub2 instanceof Player)) {
					if (!(class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub1))
						break;
					Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2);
					if (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6510 == -1 || (((Mobile) class246_sub3_sub4_sub2_sub1).anInt6434 != 0 && (((Mobile) class246_sub3_sub4_sub2_sub1).anInt6433 ^ 0xffffffff) >= -1))
						break;
					int i_3_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos) - (-Class272.anInt2038 + ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6510 + -Class272.anInt2038) * 256);
					int i_4_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos) - (-aa_Sub2.anInt3562 + (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6505 - aa_Sub2.anInt3562)) * 256);
					if ((i_3_ ^ 0xffffffff) != -1 || i_4_ != 0)
						class246_sub3_sub4_sub2_sub1.method3042((int) (2607.5945876176133 * Math.atan2((double) i_3_, (double) i_4_)) & 0x3fff, i ^ ~0x2000);
					((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6510 = -1;
					if (!client.aBoolean3553)
						break;
				}
				Player class246_sub3_sub4_sub2_sub2 = (Player) class246_sub3_sub4_sub2;
				if (((Player) class246_sub3_sub4_sub2_sub2).anInt6512 != -1 && (((Mobile) class246_sub3_sub4_sub2_sub2).anInt6434 == 0 || (((Mobile) class246_sub3_sub4_sub2_sub2).anInt6433 ^ 0xffffffff) < -1)) {
					class246_sub3_sub4_sub2_sub2.method3042(((Player) class246_sub3_sub4_sub2_sub2).anInt6512, -8193);
					((Player) class246_sub3_sub4_sub2_sub2).anInt6512 = -1;
				}
			} while (false);
			return class246_sub3_sub4_sub2.method3033((byte) -39);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hb.E(" + (class246_sub3_sub4_sub2 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method1042(int i) {
		try {
			if (i > 126)
				anIntArray5603 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hb.D(" + i + ')');
		}
	}

	Class98_Sub10_Sub13(int i) {
		super(0, true);
		try {
			anInt5601 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hb.<init>(" + i + ')');
		}
	}

	final int[] method990(int i, int i_5_) {
		try {
			if (i != 255)
				method1043((byte) 117);
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237((byte) 98, i_5_);
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198)
				Class236.method2896(is, 0, Class25.anInt268, anInt5601);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hb.G(" + i + ',' + i_5_ + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_6_) {
		try {
			if (i_6_ > -92)
				anIntArray5603 = null;
			int i_7_ = i;
			if ((i_7_ ^ 0xffffffff) == -1)
				anInt5601 = (class98_sub22.readUnsignedByte() << -1329303188) / 255;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hb.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_6_ + ')'));
		}
	}

	static final void method1043(byte i) {
		try {
			if ((Class151_Sub9.anInt5028 ^ 0xffffffff) == -2 || (Class151_Sub9.anInt5028 ^ 0xffffffff) == -4 || (((Class118.anInt978 ^ 0xffffffff) != (Class151_Sub9.anInt5028 ^ 0xffffffff)) && (Class151_Sub9.anInt5028 == 0 || Class118.anInt978 == 0))) {
				Class150.anInt1211 = 0;
				Class98_Sub10_Sub20.anInt5640 = 0;
				Class260.aClass377_3254.method3994(-67);
			}
			int i_8_ = 103 % ((i - -6) / 46);
			Class118.anInt978 = Class151_Sub9.anInt5028;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hb.B(" + i + ')');
		}
	}

	static final void method1044(byte i, String[] strings) {
		try {
			if ((strings.length ^ 0xffffffff) >= -2) {
				Class45.aString382 += (String) strings[0];
				Class198.anInt1524 += strings[0].length();
			} else {
				for (int i_9_ = 0; i_9_ < strings.length; i_9_++) {
					if (!strings[i_9_].startsWith("pause")) {
						Class45.aString382 = strings[i_9_];
						Class295.method3484(false, false);
					} else {
						int i_10_ = 5;
						try {
							i_10_ = Integer.parseInt(strings[i_9_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						Class98_Sub46.method1525(("Pausing for " + i_10_ + " seconds..."), 101);
						Class169.anInt1306 = i_9_ - -1;
						Class147.aStringArray1189 = strings;
						Class198.aLong1525 = Class343.method3819(-47) - -(long) (i_10_ * 1000);
						return;
					}
				}
			}
			int i_11_ = -6 / ((i - -10) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hb.F(" + i + ',' + (strings != null ? "{...}" : "null") + ')'));
		}
	}
}
