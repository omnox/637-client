/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class266 {
	int anInt1984 = 8;
	boolean aBoolean1985;
	static Class111 aClass111_1986;
	int anInt1987;
	static Class84 aClass84_1988 = new Class84(true);
	int anInt1989;
	int anInt1990;
	int anInt1991 = 16777215;
	int anInt1993;
	static Class98_Sub46_Sub8 aClass98_Sub46_Sub8_1994;
	int anInt1995;

	public static void method3233(int i) {
		do {
			try {
				IncomingOpcode.aClass58_1992 = null;
				aClass84_1988 = null;
				aClass98_Sub46_Sub8_1994 = null;
				aClass111_1986 = null;
				if (i >= 68)
					break;
				method3234(null, -99, null, null, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ql.G(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3234(Player class246_sub3_sub4_sub2_sub2, int i, int[] is, int[] is_0_, int[] is_1_) {
		try {
			if (i != -3433)
				method3233(100);
			for (int i_2_ = 0; is_1_.length > i_2_; i_2_++) {
				int i_3_ = is_1_[i_2_];
				int i_4_ = is[i_2_];
				int i_5_ = is_0_[i_2_];
				for (int i_6_ = 0; i_4_ != 0 && (class246_sub3_sub4_sub2_sub2.aClass226Array6387).length > i_6_; i_6_++) {
					if ((i_4_ & 0x1) != 0) {
						if (i_3_ == -1)
							class246_sub3_sub4_sub2_sub2.aClass226Array6387[i_6_] = null;
						else {
							Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_3_, 16383);
							int i_7_ = class97.anInt819;
							Class226 class226 = (class246_sub3_sub4_sub2_sub2.aClass226Array6387[i_6_]);
							if (class226 != null) {
								if (i_3_ != class226.anInt1700) {
									if (class97.anInt829 >= Class151_Sub7.aClass183_5001.method2623(class226.anInt1700, 16383).anInt829)
										class226 = class246_sub3_sub4_sub2_sub2.aClass226Array6387[i_6_] = null;
								} else if (i_7_ == 0)
									class226 = class246_sub3_sub4_sub2_sub2.aClass226Array6387[i_6_] = null;
								else if (i_7_ != 1) {
									if (i_7_ == 2)
										class226.anInt1704 = 0;
								} else {
									class226.anInt1707 = 0;
									class226.anInt1704 = 0;
									class226.anInt1703 = i_5_;
									class226.anInt1702 = 0;
									class226.anInt1701 = 1;
									if (!class246_sub3_sub4_sub2_sub2.aBoolean6371)
										Class349.method3840((byte) -128, class246_sub3_sub4_sub2_sub2, 0, class97);
								}
							}
							if (class226 == null) {
								class226 = class246_sub3_sub4_sub2_sub2.aClass226Array6387[i_6_] = new Class226();
								class226.anInt1703 = i_5_;
								class226.anInt1707 = 0;
								class226.anInt1700 = i_3_;
								class226.anInt1702 = 0;
								class226.anInt1704 = 0;
								class226.anInt1701 = 1;
								if (!class246_sub3_sub4_sub2_sub2.aBoolean6371)
									Class349.method3840((byte) -126, class246_sub3_sub4_sub2_sub2, 0, class97);
							}
						}
					}
					i_4_ >>>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ql.F(" + (class246_sub3_sub4_sub2_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_0_ != null ? "{...}" : "null") + ',' + (is_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3235(byte i) {
		try {
			if (i <= -17) {
				if (Class39_Sub1.anInterface10Array3592 != null) {
					Interface10[] interface10s = Class39_Sub1.anInterface10Array3592;
					for (int i_8_ = 0; interface10s.length > i_8_; i_8_++) {
						Interface10 interface10 = interface10s[i_8_];
						interface10.method27(-31295);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ql.A(" + i + ')');
		}
	}

	final void method3236(RSByteBuffer class98_sub22, byte i) {
		try {
			if (i != -16)
				method3239(-39, -58, -29, 127, null);
			for (;;) {
				int i_9_ = class98_sub22.readUnsignedByte();
				if (i_9_ == 0)
					break;
				method3237(false, i_9_, class98_sub22);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ql.E(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method3237(boolean bool, int i, RSByteBuffer class98_sub22) {
		do {
			try {
				if (i == 1)
					this.anInt1984 = class98_sub22.readShort();
				else if (i == 2)
					this.aBoolean1985 = true;
				else if (i == 3) {
					this.anInt1990 = class98_sub22.readUShort(bool);
					this.anInt1989 = class98_sub22.readUShort(false);
					this.anInt1987 = class98_sub22.readUShort(false);
				} else if (i != 4) {
					if (i == 5)
						this.anInt1995 = class98_sub22.readShort();
					else if (i == 6)
						this.anInt1991 = class98_sub22.readMedium(-123);
				} else
					this.anInt1993 = class98_sub22.readUnsignedByte();
				if (bool == false)
					break;
				aClass98_Sub46_Sub8_1994 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ql.C(" + bool + ',' + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method3238(int i) {
		try {
			if (Class45.aClass75_381 != null) {
				VarpClass.aClass47_3241 = new Class47();
				VarpClass.aClass47_3241.method446(Class235.aLong1753, (byte) 95, Class45.aClass75_381.anInt552, Class45.aClass75_381, Class45.aClass75_381.aClass309_560.get_text(Class374.anInt3159));
				Class76_Sub9.aThread3783 = new Thread(VarpClass.aClass47_3241, "");
				if (i == 0)
					Class76_Sub9.aThread3783.start();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ql.B(" + i + ')');
		}
	}

	static final void method3239(int i, int i_10_, int i_11_, int i_12_, Class246_Sub3_Sub2 class246_sub3_sub2) {
		Class172 class172 = Class100.method1693(i, i_10_, i_11_);
		if (class172 != null) {
			class246_sub3_sub2.localXPos = (i_10_ << Class151_Sub8.anInt5015) + RuneScapeCache.anInt1577;
			class246_sub3_sub2.anInt5089 = i_12_;
			class246_sub3_sub2.localYPos = (i_11_ << Class151_Sub8.anInt5015) + RuneScapeCache.anInt1577;
			class172.aClass246_Sub3_Sub2_1331 = class246_sub3_sub2;
			int i_13_ = Class78.activeTileHeightMap == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub2.method2978(-2)) {
				if (class246_sub3_sub2.method2987(6540)) {
					class246_sub3_sub2.aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_13_];
					Class359.aClass246_Sub3Array3056[i_13_] = class246_sub3_sub2;
				} else {
					class246_sub3_sub2.aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_13_];
					Class379.aClass246_Sub3Array3198[i_13_] = class246_sub3_sub2;
					Class358.aBoolean3033 = true;
				}
			} else {
				class246_sub3_sub2.aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_13_];
				Class130.aClass246_Sub3Array1029[i_13_] = class246_sub3_sub2;
			}
		}
	}

	public Class266() {
		/* empty */
	}
}
