/* Class98_Sub10_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub14 extends Class98_Sub10 {
	private int anInt5604;
	private int anInt5605;
	private int anInt5607 = 4096;
	private int[] anIntArray5609 = new int[3];
	static int anInt5610 = 0;
	private int anInt5611;
	static Class377 aClass377_5612;
	static int anInt5613;
	static int anInt5614;

	static final void method1045(int i, int i_0_) {
		try {
			Class98_Sub46_Sub20_Sub2.anInt6317 = 2;
			Class146_Sub2.anInt4855 = i;
			long l = 0L;
			do {
				if (Class98_Sub10_Sub10.aString5593 != null) {
					RSByteBuffer class98_sub22 = new RSByteBuffer(Class167.method2531((Class378.method4006(Class98_Sub10_Sub10.aString5593, -1)), i_0_ + 18887));
					l = class98_sub22.method1246(-101);
					Class98_Sub10_Sub19.aLong5631 = class98_sub22.method1246(-90);
					if (!client.aBoolean3553)
						break;
				}
				Class369.method3952(35, (byte) -55);
				return;
			} while (false);
			if (i_0_ != -6182)
				IncomingOpcode.aClass58_5606 = null;
			Class342.method3814(true, Class98_Sub28.method1305(-68, l), 73, "");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "he.E(" + i + ',' + i_0_ + ')');
		}
	}

	static final Class119_Sub3 method1046(boolean bool, RSByteBuffer class98_sub22) {
		try {
			if (bool != false)
				anInt5610 = 113;
			return new Class119_Sub3(class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(bool), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readMedium(-124), class98_sub22.readUnsignedByte());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("he.B(" + bool + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final int[][] method997(int i, int i_1_) {
		try {
			int[][] is = ((Class98_Sub10) this).aClass223_3859.method2828(i_1_, 0);
			if (((Class223) ((Class98_Sub10) this).aClass223_3859).aBoolean1683) {
				int[][] is_2_ = this.method994(i_1_, 24431, 0);
				int[] is_3_ = is_2_[0];
				int[] is_4_ = is_2_[1];
				int[] is_5_ = is_2_[2];
				int[] is_6_ = is[0];
				int[] is_7_ = is[1];
				int[] is_8_ = is[2];
				for (int i_9_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
					int i_10_ = is_3_[i_9_];
					int i_11_ = -anIntArray5609[0] + i_10_;
					if ((i_11_ ^ 0xffffffff) > -1)
						i_11_ = -i_11_;
					if (anInt5604 < i_11_) {
						is_6_[i_9_] = i_10_;
						is_7_[i_9_] = is_4_[i_9_];
						is_8_[i_9_] = is_5_[i_9_];
					} else {
						int i_12_ = is_4_[i_9_];
						i_11_ = i_12_ + -anIntArray5609[1];
						if ((i_11_ ^ 0xffffffff) > -1)
							i_11_ = -i_11_;
						if (anInt5604 < i_11_) {
							is_6_[i_9_] = i_10_;
							is_7_[i_9_] = i_12_;
							is_8_[i_9_] = is_5_[i_9_];
						} else {
							int i_13_ = is_5_[i_9_];
							i_11_ = i_13_ - anIntArray5609[2];
							if ((i_11_ ^ 0xffffffff) > -1)
								i_11_ = -i_11_;
							if ((i_11_ ^ 0xffffffff) < (anInt5604 ^ 0xffffffff)) {
								is_6_[i_9_] = i_10_;
								is_7_[i_9_] = i_12_;
								is_8_[i_9_] = i_13_;
							} else {
								is_6_[i_9_] = i_10_ * anInt5605 >> -5198036;
								is_7_[i_9_] = i_12_ * anInt5607 >> 949873324;
								is_8_[i_9_] = anInt5611 * i_13_ >> -1314808852;
							}
						}
					}
				}
			}
			if (i >= -76)
				IncomingOpcode.aClass58_5606 = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "he.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final boolean method1047(int i, byte i_14_, int i_15_) {
		try {
			if (i_14_ <= 21)
				return false;
			if (!s_Sub1.method3433(i_15_, 15849, i) && !Class64_Sub19.method631(i, i_15_, -2))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("he.D(" + i + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_16_) {
		try {
			int i_17_ = i;
			while_96_: do {
				while_95_: do {
					while_94_: do {
						do {
							if (i_17_ != 0) {
								if (i_17_ != 1) {
									if ((i_17_ ^ 0xffffffff) != -3) {
										if (i_17_ != 3) {
											if (i_17_ == 4)
												break while_95_;
											break while_96_;
										}
									} else
										break;
									break while_94_;
								}
							} else {
								anInt5604 = class98_sub22.readShort();
								break while_96_;
							}
							anInt5611 = class98_sub22.readShort();
							break while_96_;
						} while (false);
						anInt5607 = class98_sub22.readShort();
						break while_96_;
					} while (false);
					anInt5605 = class98_sub22.readShort();
					break while_96_;
				} while (false);
				int i_18_ = class98_sub22.readMedium(-127);
				anIntArray5609[0] = Class202.method2702(i_18_, 16711680) << 324143748;
				anIntArray5609[2] = Class202.method2702(255, i_18_) >> -296948276;
				anIntArray5609[1] = Class202.method2702(i_18_, 65280) >> 374537476;
			} while (false);
			if (i_16_ >= -92)
				anInt5611 = 115;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("he.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_16_ + ')'));
		}
	}

	public static void method1048(byte i) {
		do {
			try {
				IncomingOpcode.aClass58_5606 = null;
				IncomingOpcode.aClass58_5608 = null;
				aClass377_5612 = null;
				if (i == -100)
					break;
				anInt5610 = -12;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "he.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub14() {
		super(1, false);
		anInt5604 = 409;
		anInt5605 = 4096;
		anInt5611 = 4096;
	}

	static {
		aClass377_5612 = new Class377(16);
		anInt5614 = 0;
		anInt5613 = 0;
	}
}
