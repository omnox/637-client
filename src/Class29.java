/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29 {
	private RuneScapeCache aClass207_296;
	private Class79 aClass79_297 = new Class79(128);
	static Class17 aClass17_298;

	static final boolean method300(boolean bool, int i, int i_0_) {
		try {
			if (bool != false)
				aClass17_298 = null;
			if (!Class98_Sub5_Sub2.method969(i, i_0_, 83) && !Class228.method2864(55, i_0_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cc.A(" + bool + ',' + i + ',' + i_0_ + ')'));
		}
	}

	public static void method301(int i) {
		try {
			if (i != -23881)
				method301(-97);
			aClass17_298 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cc.D(" + i + ')');
		}
	}

	final Class306 method302(int i, int i_1_) {
		try {
			Class306 class306;
			synchronized (aClass79_297) {
				class306 = (Class306) aClass79_297.get((long) i);
			}
			if (class306 != null)
				return class306;
			byte[] is = aClass207_296.readArchive(Class98_Sub10_Sub9.method1032(i, (byte) 39), Class153.method2490(i, false));
			class306 = new Class306();
			if (is != null)
				class306.method3593(new RSByteBuffer(is), 4);
			synchronized (aClass79_297) {
				aClass79_297.put((long) i, class306);
				if (i_1_ != 1028602529)
					method303(46, 67, -18, (byte) 67, 54, 98, -114);
			}
			return class306;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cc.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method303(int i, int i_2_, int i_3_, byte i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			Class231.method2875(256, i);
			int i_8_ = 0;
			int i_9_ = -i_7_ + i;
			if (i_9_ < 0)
				i_9_ = 0;
			int i_10_ = i;
			int i_11_ = -i;
			int i_12_ = i_9_;
			int i_13_ = -i_9_;
			int i_14_ = 28 / ((i_4_ - 17) / 58);
			int i_15_ = -1;
			int i_16_ = -1;
			if ((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i_5_ ^ 0xffffffff) && (Class218.anInt1635 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)) {
				int[] is = Class97.anIntArrayArray814[i_5_];
				int i_17_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ + -i);
				int i_18_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i + i_6_);
				int i_19_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, -i_9_ + i_6_);
				int i_20_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ + i_9_);
				Class333.method3761(i_2_, is, i_17_, i_19_, (byte) -126);
				Class333.method3761(i_3_, is, i_19_, i_20_, (byte) -123);
				Class333.method3761(i_2_, is, i_20_, i_18_, (byte) -125);
			}
			while (i_10_ > i_8_) {
				i_16_ += 2;
				i_15_ += 2;
				i_13_ += i_16_;
				i_11_ += i_15_;
				if ((i_13_ ^ 0xffffffff) <= -1 && (i_12_ ^ 0xffffffff) <= -2) {
					i_12_--;
					i_13_ -= i_12_ << 1028602529;
					Class331.anIntArray2810[i_12_] = i_8_;
				}
				i_8_++;
				if (i_11_ >= 0) {
					i_10_--;
					i_11_ -= i_10_ << 173127649;
					int i_21_ = i_5_ + -i_10_;
					int i_22_ = i_10_ + i_5_;
					if (Class98_Sub10_Sub38.anInt5753 <= i_22_ && Class218.anInt1635 >= i_21_) {
						if (i_9_ <= i_10_) {
							int i_23_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ - -i_8_);
							int i_24_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ - i_8_);
							if ((i_22_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff))
								Class333.method3761(i_2_, (Class97.anIntArrayArray814[i_22_]), i_24_, i_23_, (byte) 50);
							if ((i_21_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff))
								Class333.method3761(i_2_, (Class97.anIntArrayArray814[i_21_]), i_24_, i_23_, (byte) 14);
						} else {
							int i_25_ = Class331.anIntArray2810[i_10_];
							int i_26_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ - -i_8_);
							int i_27_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ + -i_8_);
							int i_28_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_25_ + i_6_);
							int i_29_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, -i_25_ + i_6_);
							if (Class218.anInt1635 >= i_22_) {
								int[] is = Class97.anIntArrayArray814[i_22_];
								Class333.method3761(i_2_, is, i_27_, i_29_, (byte) -127);
								Class333.method3761(i_3_, is, i_29_, i_28_, (byte) 24);
								Class333.method3761(i_2_, is, i_28_, i_26_, (byte) -127);
							}
							if ((i_21_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff)) {
								int[] is = Class97.anIntArrayArray814[i_21_];
								Class333.method3761(i_2_, is, i_27_, i_29_, (byte) -123);
								Class333.method3761(i_3_, is, i_29_, i_28_, (byte) 81);
								Class333.method3761(i_2_, is, i_28_, i_26_, (byte) -126);
							}
						}
					}
				}
				int i_30_ = i_5_ + -i_8_;
				int i_31_ = i_8_ + i_5_;
				if (i_31_ >= Class98_Sub10_Sub38.anInt5753 && (Class218.anInt1635 ^ 0xffffffff) <= (i_30_ ^ 0xffffffff)) {
					int i_32_ = i_6_ - -i_10_;
					int i_33_ = -i_10_ + i_6_;
					if (Class76_Sub8.anInt3778 <= i_32_ && (i_33_ ^ 0xffffffff) >= (Class3.anInt77 ^ 0xffffffff)) {
						i_32_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_32_);
						i_33_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_33_);
						if ((i_8_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff)) {
							if ((i_31_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff))
								Class333.method3761(i_2_, (Class97.anIntArrayArray814[i_31_]), i_33_, i_32_, (byte) 122);
							if (Class98_Sub10_Sub38.anInt5753 <= i_30_)
								Class333.method3761(i_2_, (Class97.anIntArrayArray814[i_30_]), i_33_, i_32_, (byte) -128);
						} else {
							int i_34_ = (i_8_ <= i_12_ ? i_12_ : Class331.anIntArray2810[i_8_]);
							int i_35_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ + i_34_);
							int i_36_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_6_ + -i_34_);
							if ((Class218.anInt1635 ^ 0xffffffff) <= (i_31_ ^ 0xffffffff)) {
								int[] is = Class97.anIntArrayArray814[i_31_];
								Class333.method3761(i_2_, is, i_33_, i_36_, (byte) -123);
								Class333.method3761(i_3_, is, i_36_, i_35_, (byte) -127);
								Class333.method3761(i_2_, is, i_35_, i_32_, (byte) 57);
							}
							if (i_30_ >= Class98_Sub10_Sub38.anInt5753) {
								int[] is = Class97.anIntArrayArray814[i_30_];
								Class333.method3761(i_2_, is, i_33_, i_36_, (byte) -128);
								Class333.method3761(i_3_, is, i_36_, i_35_, (byte) 15);
								Class333.method3761(i_2_, is, i_35_, i_32_, (byte) 73);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cc.B(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	Class29(Class279 class279, int i, RuneScapeCache class207) {
		do {
			try {
				aClass207_296 = class207;
				if (aClass207_296 == null)
					break;
				int i_37_ = -1 + aClass207_296.method2752((byte) -11);
				aClass207_296.method2761(0, i_37_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("cc.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
