/* Class64_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub2 extends Class64 {
	static Class279 aClass279_3643 = new Class279("stellardawn", 1);
	static RuneScapeCache aClass207_3644;
	final int method552(int i) {
		try {
			if (i != 0)
				method551((byte) 21);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "av.A(" + i + ')');
		}
	}

	final void method551(byte i) {
		do {
			try {
				if (this.anInt494 != 1 && this.anInt494 != 0)
					this.anInt494 = method552(0);
				if (i >= 118)
					break;
				method562(null, -99, -101, -104, -34, -85);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "av.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method559(boolean bool, int i, int i_0_) {
		do {
			try {
				if (bool != true)
					IncomingOpcode.aClass58_3642 = null;
				if (i != Class25.anInt268) {
					Class64_Sub1.anIntArray3640 = new int[i];
					for (int i_1_ = 0; i_1_ < i; i_1_++)
						Class64_Sub1.anIntArray3640[i_1_] = (i_1_ << 12) / i;
					Class329.anInt2761 = -1 + i;
					Class246_Sub3_Sub4_Sub1.anInt6241 = i * 32;
					Class25.anInt268 = i;
				}
				if (i_0_ == Class63.anInt492)
					break;
				if (i_0_ != Class25.anInt268) {
					Class352.anIntArray3001 = new int[i_0_];
					for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
						Class352.anIntArray3001[i_2_] = (i_2_ << 12) / i_0_;
				} else
					Class352.anIntArray3001 = Class64_Sub1.anIntArray3640;
				Class63.anInt492 = i_0_;
				za_Sub1.anInt6075 = -1 + i_0_;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("av.H(" + bool + ',' + i + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	Class64_Sub2(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method560(byte i) {
		try {
			if (i <= 119)
				method556(-57, 123);
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "av.E(" + i + ')');
		}
	}

	Class64_Sub2(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	static final int method561(byte i, int i_3_) {
		try {
			if (i != -95)
				method562(null, -47, -58, -94, -118, -95);
			int i_4_ = i_3_ & 0x3f;
			int i_5_ = 0x3 & i_3_ >> 6;
			if (i_4_ == 18) {
				if (i_5_ == 0)
					return 1;
				if (i_5_ == 1)
					return 2;
				if (i_5_ == 2)
					return 4;
				if (i_5_ == 3)
					return 8;
			} else if (i_4_ == 19 || i_4_ == 21) {
				if (i_5_ == 0)
					return 16;
				if (i_5_ == 1)
					return 32;
				if (i_5_ == 2)
					return 64;
				if (i_5_ == 3)
					return 128;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "av.I(" + i + ',' + i_3_ + ')');
		}
	}

	static final void method562(AnimableEntity class246_sub3, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		boolean bool = true;
		int i_10_ = i_6_;
		int i_11_ = i_6_ + i_8_;
		int i_12_ = i_7_ - 1;
		int i_13_ = i_7_ + i_9_;
		for (int i_14_ = i; i_14_ <= i + 1; i_14_++) {
			if (i_14_ != Class364.anInt3103) {
				for (int i_15_ = i_10_; i_15_ <= i_11_; i_15_++) {
					if (i_15_ >= 0 && i_15_ < Class366.anInt3112) {
						for (int i_16_ = i_12_; i_16_ <= i_13_; i_16_++) {
							if (i_16_ >= 0 && i_16_ < Class64_Sub9.anInt3662 && (!bool || i_15_ >= i_11_ || i_16_ >= i_13_ || i_16_ < i_7_ && i_15_ != i_6_)) {
								Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_14_][i_15_][i_16_]);
								if (class172 != null) {
									int i_17_ = (((Class78.activeTileHeightMap[i_14_].method3420(i_16_, -12639, i_15_)) + (Class78.activeTileHeightMap[i_14_].method3420(i_16_, -12639, i_15_ + 1)) + (Class78.activeTileHeightMap[i_14_].method3420(i_16_ + 1, -12639, i_15_)) + (Class78.activeTileHeightMap[i_14_].method3420(i_16_ + 1, -12639, i_15_ + 1))) / 4 - ((Class78.activeTileHeightMap[i].method3420(i_7_, -12639, i_6_)) + (Class78.activeTileHeightMap[i].method3420(i_7_, -12639, i_6_ + 1)) + (Class78.activeTileHeightMap[i].method3420(i_7_ + 1, -12639, i_6_)) + (Class78.activeTileHeightMap[i].method3420(i_7_ + 1, -12639, i_6_ + 1))) / 4);
									Class246_Sub3_Sub3 class246_sub3_sub3 = (class172.aClass246_Sub3_Sub3_1324);
									Class246_Sub3_Sub3 class246_sub3_sub3_18_ = (class172.aClass246_Sub3_Sub3_1333);
									if (class246_sub3_sub3 != null && class246_sub3_sub3.method2982((byte) -84))
										class246_sub3.method2981(class246_sub3_sub3, (byte) -124, bool, ((i_15_ - i_6_) * r_Sub2.anInt6333 + ((1 - i_8_) * RuneScapeCache.anInt1577)), Class98_Sub10_Sub30.aHa5709, i_17_, ((i_16_ - i_7_) * r_Sub2.anInt6333 + ((1 - i_9_) * RuneScapeCache.anInt1577)));
									if (class246_sub3_sub3_18_ != null && class246_sub3_sub3_18_.method2982((byte) -71))
										class246_sub3.method2981(class246_sub3_sub3_18_, (byte) 88, bool, ((i_15_ - i_6_) * r_Sub2.anInt6333 + ((1 - i_8_) * RuneScapeCache.anInt1577)), Class98_Sub10_Sub30.aHa5709, i_17_, ((i_16_ - i_7_) * r_Sub2.anInt6333 + ((1 - i_9_) * RuneScapeCache.anInt1577)));
									for (Class154 class154 = (class172.aClass154_1325); class154 != null; class154 = (class154.aClass154_1233)) {
										Class246_Sub3_Sub4 class246_sub3_sub4 = (class154.aClass246_Sub3_Sub4_1232);
										if (class246_sub3_sub4 != null && class246_sub3_sub4.method2982((byte) -125) && (i_15_ == (class246_sub3_sub4.aShort6158) || i_15_ == i_10_) && (i_16_ == (class246_sub3_sub4.aShort6157) || i_16_ == i_12_)) {
											int i_19_ = ((class246_sub3_sub4.aShort6160) - (class246_sub3_sub4.aShort6158) + 1);
											int i_20_ = ((class246_sub3_sub4.aShort6159) - (class246_sub3_sub4.aShort6157) + 1);
											class246_sub3.method2981(class246_sub3_sub4, (byte) -126, bool, (((class246_sub3_sub4.aShort6158) - i_6_) * r_Sub2.anInt6333 + ((i_19_ - i_8_) * RuneScapeCache.anInt1577)), Class98_Sub10_Sub30.aHa5709, i_17_, (((class246_sub3_sub4.aShort6157) - i_7_) * r_Sub2.anInt6333 + ((i_20_ - i_9_) * RuneScapeCache.anInt1577)));
										}
									}
								}
							}
						}
					}
				}
				i_10_--;
				bool = false;
			}
		}
	}

	final void method550(int i, int i_21_) {
		try {
			this.anInt494 = i_21_;
			int i_22_ = -24 / ((-26 - i) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "av.B(" + i + ',' + i_21_ + ')');
		}
	}

	public static void method563(byte i) {
		try {
			IncomingOpcode.aClass58_3642 = null;
			if (i != 122)
				IncomingOpcode.aClass58_3642 = null;
			IncomingOpcode.aClass58_3645 = null;
			aClass207_3644 = null;
			aClass279_3643 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "av.G(" + i + ')');
		}
	}

	final int method556(int i, int i_23_) {
		try {
			if (i_23_ != 29053)
				return -104;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "av.F(" + i + ',' + i_23_ + ')');
		}
	}
}
