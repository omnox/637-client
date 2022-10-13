/* Class98_Sub10_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub34 extends Class98_Sub10 {
	private int anInt5725 = 0;
	private int anInt5726;
	private int anInt5727 = 0;
	static Class215 aClass215_5728 = new Class215();
	private int anInt5729 = 20;
	static Class43 aClass43_5730;

	public Class98_Sub10_Sub34() {
		super(0, true);
		anInt5726 = 1365;
	}

	static final String method1103(int i, boolean bool, int i_0_, int i_1_) {
		try {
			if (i_1_ < 2 || i_1_ > 36)
				throw new IllegalArgumentException("Invalid radix:" + i_1_);
			if (!bool || i < 0)
				return Integer.toString(i, i_1_);
			int i_2_ = 2;
			for (int i_3_ = i / i_1_; i_3_ != 0; i_3_ /= i_1_)
				i_2_++;
			if (i_0_ != 328)
				return null;
			char[] cs = new char[i_2_];
			cs[0] = '+';
			for (int i_4_ = i_2_ - 1; i_4_ > 0; i_4_--) {
				int i_5_ = i;
				i /= i_1_;
				int i_6_ = -(i_1_ * i) + i_5_;
				if (i_6_ >= 10)
					cs[i_4_] = (char) (87 + i_6_);
				else
					cs[i_4_] = (char) (48 + i_6_);
			}
			return new String(cs);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ta.D(" + i + ',' + bool + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1104(int i) {
		try {
			if (i <= 78)
				method1103(-104, true, 77, -76);
			Class246_Sub4_Sub2.anInt6184 = (int) ((double) GameWorld.size_x * 34.46);
			Class64_Sub20.anInt3696 = 200;
			Class246_Sub4_Sub2.anInt6184 <<= 2;
			if (Class265.aHa1974.method1788())
				Class246_Sub4_Sub2.anInt6184 += 512;
			Class201.method2697(-546, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ta.F(" + i + ')');
		}
	}

	public static void method1105(int i) {
		try {
			aClass43_5730 = null;
			aClass215_5728 = null;
			int i_7_ = 12 / ((i - 43) / 37);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ta.E(" + i + ')');
		}
	}

	static final void method1106(byte i) {
		try {
			if (i == -61)
				Class142.aClass377_1157.method3994(-95);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ta.B(" + i + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_8_) {
		while_177_: do {
			try {
				if (i_8_ > -92)
					method1106((byte) 111);
				int i_9_ = i;
				while_176_: do {
					while_175_: do {
						do {
							if (i_9_ != 0) {
								if (i_9_ == 1)
									break;
								if (i_9_ == 2)
									break while_175_;
								if (i_9_ != 3)
									break while_177_;
								if (!client.aBoolean3553)
									break while_176_;
							}
							anInt5726 = class98_sub22.readShort();
							return;
						} while (false);
						anInt5729 = class98_sub22.readShort();
						return;
					} while (false);
					anInt5727 = class98_sub22.readShort();
					return;
				} while (false);
				anInt5725 = class98_sub22.readShort();
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ta.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_8_ + ')'));
			}
		} while (false);
	}

	final int[] method990(int i, int i_10_) {
		try {
			if (i != 255)
				return null;
			int[] is = this.aClass16_3863.method237((byte) 98, i_10_);
			if (this.aClass16_3863.aBoolean198) {
				for (int i_11_ = 0; i_11_ < Class25.anInt268; i_11_++) {
					int i_12_ = ((Class64_Sub1.anIntArray3640[i_11_] << 12) / anInt5726 + anInt5727);
					int i_13_ = anInt5725 + (Class352.anIntArray3001[i_10_] << 12) / anInt5726;
					int i_14_ = i_12_;
					int i_15_ = i_13_;
					int i_16_ = i_12_;
					int i_17_ = i_13_;
					int i_18_ = i_12_ * i_12_ >> 12;
					int i_19_ = i_13_ * i_13_ >> 12;
					int i_20_;
					for (i_20_ = 0; (i_19_ + i_18_ < 16384 && anInt5729 > i_20_); i_19_ = i_17_ * i_17_ >> 12) {
						i_17_ = (i_16_ * i_17_ >> 12) * 2 + i_15_;
						i_16_ = i_14_ + (i_18_ - i_19_);
						i_18_ = i_16_ * i_16_ >> 12;
						i_20_++;
					}
					is[i_11_] = (i_20_ < anInt5729 + -1 ? (i_20_ << 12) / anInt5729 : 0);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ta.G(" + i + ',' + i_10_ + ')');
		}
	}
}
