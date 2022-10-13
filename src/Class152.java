/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class152 {
	private short[] aShortArray1217;
	private int[] anIntArray1218;
	private short[] aShortArray1219;
	Class83 aClass83_1220;
	static Class332 aClass332_1221;
	private int[] anIntArray1222 = { -1, -1, -1, -1, -1 };
	private short[] aShortArray1223;
	private short[] aShortArray1224;

	final ModelDefinitions method2473(int i) {
		try {
			if (anIntArray1218 == null)
				return null;
			ModelDefinitions[] class178s = new ModelDefinitions[anIntArray1218.length];
			synchronized (this.aClass83_1220.aClass207_631) {
				if (i != 2)
					aClass332_1221 = null;
				for (int i_0_ = 0; anIntArray1218.length > i_0_; i_0_++)
					class178s[i_0_] = Class98_Sub6.method981(0, -9252, (this.aClass83_1220.aClass207_631), anIntArray1218[i_0_]);
			}
			for (int i_1_ = 0; anIntArray1218.length > i_1_; i_1_++) {
				if (class178s[i_1_].anInt1387 < 13)
					class178s[i_1_].method2592(i ^ 0x35b0, 2);
			}
			ModelDefinitions class178;
			if (class178s.length != 1)
				class178 = new ModelDefinitions(class178s, class178s.length);
			else
				class178 = class178s[0];
			if (class178 == null)
				return null;
			if (aShortArray1219 != null) {
				for (int i_2_ = 0; (i_2_ < aShortArray1219.length); i_2_++)
					class178.method2593(0, aShortArray1219[i_2_], aShortArray1217[i_2_]);
			}
			if (aShortArray1224 != null) {
				for (int i_3_ = 0; i_3_ < aShortArray1224.length; i_3_++)
					class178.method2590(aShortArray1223[i_3_], (byte) -114, aShortArray1224[i_3_]);
			}
			return class178;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ke.F(" + i + ')');
		}
	}

	final boolean method2474(int i) {
		try {
			boolean bool = true;
			synchronized (this.aClass83_1220.aClass207_631) {
				for (int i_4_ = 0; i_4_ < 5; i_4_++) {
					if (anIntArray1222[i_4_] != -1 && !this.aClass83_1220.aClass207_631.method2751(0, anIntArray1222[i_4_], -6329))
						bool = false;
				}
			}
			if (i < 105)
				return true;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ke.A(" + i + ')');
		}
	}

	final boolean method2475(int i) {
		try {
			if (anIntArray1218 == null)
				return true;
			boolean bool = true;
			synchronized (this.aClass83_1220.aClass207_631) {
				for (int i_5_ = i; i_5_ < anIntArray1218.length; i_5_++) {
					if (!this.aClass83_1220.aClass207_631.method2751(0, anIntArray1218[i_5_], i + -6329))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ke.D(" + i + ')');
		}
	}

	final ModelDefinitions method2476(byte i) {
		try {
			ModelDefinitions[] class178s = new ModelDefinitions[5];
			int i_6_ = 0;
			synchronized (this.aClass83_1220.aClass207_631) {
				for (int i_7_ = 0; i_7_ < 5; i_7_++) {
					if (anIntArray1222[i_7_] != -1)
						class178s[i_6_++] = Class98_Sub6.method981(0, -9252, (this.aClass83_1220.aClass207_631), anIntArray1222[i_7_]);
				}
			}
			for (int i_8_ = 0; i_8_ < 5; i_8_++) {
				if (class178s[i_8_] != null && class178s[i_8_].anInt1387 < 13)
					class178s[i_8_].method2592(13746, 2);
			}
			int i_9_ = -9 % ((19 - i) / 35);
			ModelDefinitions class178 = new ModelDefinitions(class178s, i_6_);
			if (aShortArray1219 != null) {
				for (int i_10_ = 0; (aShortArray1219.length > i_10_); i_10_++)
					class178.method2593(0, aShortArray1219[i_10_], aShortArray1217[i_10_]);
			}
			if (aShortArray1224 != null) {
				for (int i_11_ = 0; aShortArray1224.length > i_11_; i_11_++)
					class178.method2590(aShortArray1223[i_11_], (byte) -93, aShortArray1224[i_11_]);
			}
			return class178;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ke.I(" + i + ')');
		}
	}

	static final String method2477(int i) {
		try {
			if (Player.aBoolean6540 || Class266.aClass98_Sub46_Sub8_1994 == null)
				return "";
			if (((Class266.aClass98_Sub46_Sub8_1994.aString5992) == null || Class266.aClass98_Sub46_Sub8_1994.aString5992.length() == 0) && (Class266.aClass98_Sub46_Sub8_1994.aString5985) != null && Class266.aClass98_Sub46_Sub8_1994.aString5985.length() > 0)
				return (Class266.aClass98_Sub46_Sub8_1994.aString5985);
			if (i != 29558)
				aClass332_1221 = null;
			return (Class266.aClass98_Sub46_Sub8_1994.aString5992);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ke.B(" + i + ')');
		}
	}

	static final void method2478(int i, int i_12_, Class185 class185, int i_13_, int i_14_, int i_15_) {
		try {
			if (i_14_ <= -1) {
				Class98_Sub33 class98_sub33 = null;
				for (Class98_Sub33 class98_sub33_16_ = ((Class98_Sub33) OutgoingPacket.aClass148_3866.method2418(32)); class98_sub33_16_ != null; class98_sub33_16_ = ((Class98_Sub33) OutgoingPacket.aClass148_3866.method2417(106))) {
					if (class98_sub33_16_.anInt4116 == i_15_ && (i_13_ == class98_sub33_16_.anInt4112) && i == class98_sub33_16_.anInt4113 && i_12_ == class98_sub33_16_.anInt4118) {
						class98_sub33 = class98_sub33_16_;
						break;
					}
				}
				if (class98_sub33 == null) {
					class98_sub33 = new Class98_Sub33();
					class98_sub33.anInt4113 = i;
					class98_sub33.anInt4118 = i_12_;
					class98_sub33.anInt4112 = i_13_;
					class98_sub33.anInt4116 = i_15_;
					OutgoingPacket.aClass148_3866.add_last(class98_sub33, -20911);
				}
				class98_sub33.aClass185_4125 = class185;
				class98_sub33.aBoolean4124 = false;
				class98_sub33.aBoolean4123 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ke.C(" + i + ',' + i_12_ + ',' + (class185 != null ? "{...}" : "null") + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	private final void method2479(RSByteBuffer class98_sub22, int i, byte i_17_) {
		try {
			int i_18_ = 6 % ((76 - i_17_) / 39);
			if (i != 1) {
				if (i != 2) {
					if (i != 3) {
						if (i == 40) {
							int i_19_ = class98_sub22.readUnsignedByte();
							aShortArray1217 = new short[i_19_];
							aShortArray1219 = new short[i_19_];
							for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
								aShortArray1219[i_20_] = (short) class98_sub22.readShort();
								aShortArray1217[i_20_] = (short) class98_sub22.readShort();
							}
						} else if (i != 41) {
							if (i >= 60 && i < 70)
								anIntArray1222[-60 + i] = class98_sub22.readShort();
						} else {
							int i_21_ = class98_sub22.readUnsignedByte();
							aShortArray1223 = new short[i_21_];
							aShortArray1224 = new short[i_21_];
							for (int i_22_ = 0; i_21_ > i_22_; i_22_++) {
								aShortArray1224[i_22_] = (short) class98_sub22.readShort();
								aShortArray1223[i_22_] = (short) class98_sub22.readShort();
							}
						}
					}
				} else {
					int i_23_ = class98_sub22.readUnsignedByte();
					anIntArray1218 = new int[i_23_];
					for (int i_24_ = 0; i_23_ > i_24_; i_24_++)
						anIntArray1218[i_24_] = class98_sub22.readShort();
				}
			} else
				class98_sub22.readUnsignedByte();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ke.G(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ')'));
		}
	}

	final void method2480(boolean bool, RSByteBuffer class98_sub22) {
		do {
			try {
				for (;;) {
					int i = class98_sub22.readUnsignedByte();
					if (i == 0)
						break;
					method2479(class98_sub22, i, (byte) 115);
				}
				if (bool == false)
					break;
				method2475(44);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ke.E(" + bool + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class152() {
		/* empty */
	}

	public static void method2481(boolean bool) {
		try {
			if (bool == false)
				aClass332_1221 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ke.H(" + bool + ')');
		}
	}

	static {
		new Class105("", 76);
	}
}
