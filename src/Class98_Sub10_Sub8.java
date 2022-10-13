/* Class98_Sub10_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub8 extends Class98_Sub10 {
	static d aD5578;
	static boolean[] aBooleanArray5579 = new boolean[8];

	static final Class98_Sub46_Sub10 method1026(int i) {
		try {
			if (i != -3)
				return null;
			return Class278.aClass98_Sub46_Sub10_2056;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ej.B(" + i + ')');
		}
	}

	static final int method1027(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ == -1)
				return 12345678;
			i = i * (i_0_ & 0x7f) >> 7;
			do {
				if (i < 2) {
					i = 2;
					if (!client.aBoolean3553)
						break;
				}
				if (i > 126)
					i = 126;
			} while (false);
			if (i_1_ >= -73)
				aBooleanArray5579 = null;
			return i + (i_0_ & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ej.F(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int[] method990(int i, int i_2_) {
		try {
			if (i != 255)
				aBooleanArray5579 = null;
			int[] is = this.aClass16_3863.method237((byte) 98, i_2_);
			if (this.aClass16_3863.aBoolean198) {
				int i_3_ = Class352.anIntArray3001[i_2_];
				for (int i_4_ = 0; Class25.anInt268 > i_4_; i_4_++)
					is[i_4_] = method1030(Class64_Sub1.anIntArray3640[i_4_], (byte) 3, i_3_) % 4096;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ej.G(" + i + ',' + i_2_ + ')');
		}
	}

	public static void method1028(boolean bool) {
		do {
			try {
				aBooleanArray5579 = null;
				aD5578 = null;
				if (bool == false)
					break;
				aD5578 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ej.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final Class350 method1029(byte i, int i_5_) {
		try {
			Class350[] class350s = Class306.method3595((byte) 67);
			for (int i_6_ = 0; i_6_ < class350s.length; i_6_++) {
				Class350 class350 = class350s[i_6_];
				if (i_5_ == class350.anInt2920)
					return class350;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ej.E(" + i + ',' + i_5_ + ')');
		}
	}

	private final int method1030(int i, byte i_7_, int i_8_) {
		try {
			int i_9_ = 57 * i_8_ + i;
			if (i_7_ != 3)
				method1027(-5, 93, 26);
			i_9_ = i_9_ << 1 ^ i_9_;
			return (-(((789221 + i_9_ * i_9_ * 15731) * i_9_ - -1376312589 & 0x7fffffff) / 262144) + 4096);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ej.H(" + i + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public Class98_Sub10_Sub8() {
		super(0, true);
	}
}
