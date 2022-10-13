/* Class64_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub11 extends Class64 {
	static int anInt3668 = 0;
	static double aDouble3669;
	static byte[][] aByteArrayArray3670 = new byte[50][];

	static final byte[] method595(int i, byte i_0_, byte[] is, int i_1_) {
		try {
			if (i_0_ >= -116)
				method598(-74);
			byte[] is_2_;
			if (i <= 0)
				is_2_ = is;
			else {
				is_2_ = new byte[i_1_];
				for (int i_3_ = 0; i_1_ > i_3_; i_3_++)
					is_2_[i_3_] = is[i_3_ + i];
			}
			Class374 class374 = new Class374();
			class374.method3983((byte) -77);
			class374.method3981(is_2_, 64, i_1_ * 8);
			byte[] is_4_ = new byte[64];
			class374.method3982((byte) -111, 0, is_4_);
			return is_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hn.D(" + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final int method556(int i, int i_5_) {
		try {
			if (i_5_ != 29053)
				return -66;
			if (this.aClass98_Sub27_495.method1291((byte) 121))
				return 3;
			if (this.aClass98_Sub27_495.method1286((byte) 104) == s_Sub1.aClass279_5197)
				return 1;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hn.F(" + i + ',' + i_5_ + ')');
		}
	}

	final void method551(byte i) {
		do {
			try {
				if (i >= 118) {
					do {
						if (this.aClass98_Sub27_495.method1286((byte) 104) != s_Sub1.aClass279_5197) {
							this.anInt494 = 1;
							if (!client.aBoolean3553)
								break;
						}
						if (this.aClass98_Sub27_495.method1291((byte) 112))
							this.anInt494 = 0;
					} while (false);
					if (this.anInt494 == 0 || this.anInt494 == 1)
						break;
					this.anInt494 = method552(0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hn.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method596(byte i) {
		try {
			if (i < 119)
				aDouble3669 = 0.8269233149088107;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hn.E(" + i + ')');
		}
	}

	final boolean method597(int i) {
		try {
			if (this.aClass98_Sub27_495.method1291((byte) 117))
				return false;
			if (this.aClass98_Sub27_495.method1286((byte) 104) == s_Sub1.aClass279_5197)
				return true;
			if (i != -1)
				method595(-108, (byte) 43, null, -37);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hn.G(" + i + ')');
		}
	}

	public static void method598(int i) {
		do {
			try {
				aByteArrayArray3670 = null;
				if (i == 0)
					break;
				aDouble3669 = -0.004191568579013829;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hn.H(" + i + ')');
			}
			break;
		} while (false);
	}

	Class64_Sub11(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				return 13;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hn.A(" + i + ')');
		}
	}

	Class64_Sub11(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final void method550(int i, int i_6_) {
		try {
			this.anInt494 = i_6_;
			int i_7_ = -32 % ((-26 - i) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hn.B(" + i + ',' + i_6_ + ')');
		}
	}
}
