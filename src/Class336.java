/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class336 {
	static int anInt2820;
	long aLong2821;
	static Class232 aClass232_2822 = new Class232();
	static int anInt2823;
	private ha_Sub1 aHa_Sub1_2824;
	static int[] anIntArray2826 = new int[2];
	static LinkedList aClass148_2827;
	static Class66[] aClass66Array2828;
	static Class105 aClass105_2829;

	static final int method3772(String string, String string_0_, int i, int i_1_) {
		try {
			int i_2_ = string.length();
			int i_3_ = string_0_.length();
			int i_4_ = 0;
			int i_5_ = 0;
			char c = '\0';
			char c_6_ = '\0';
			while_225_: do {
				char c_7_;
				char c_8_;
				for (;;) {
					if (i_2_ <= -c + i_4_ && (i_3_ ^ 0xffffffff) >= (-c_6_ + i_5_ ^ 0xffffffff))
						break while_225_;
					if (i_2_ <= i_4_ - c)
						return -1;
					if (i_5_ + -c_6_ >= i_3_)
						return 1;
					if ((c ^ 0xffffffff) == -1)
						c_7_ = string.charAt(i_4_++);
					else {
						c_7_ = c;
						boolean bool = false;
					}
					if (c_6_ == 0)
						c_8_ = string_0_.charAt(i_5_++);
					else {
						c_8_ = c_6_;
						boolean bool = false;
					}
					c = Class263.method3217(14561, c_7_);
					c_6_ = Class263.method3217(14561, c_8_);
					c_7_ = Class76_Sub10.method769(c_7_, i, (byte) -85);
					c_8_ = Class76_Sub10.method769(c_8_, i, (byte) -123);
					if ((c_7_ ^ 0xffffffff) != (c_8_ ^ 0xffffffff) && ((Character.toUpperCase(c_7_) ^ 0xffffffff) != (Character.toUpperCase(c_8_) ^ 0xffffffff))) {
						c_7_ = Character.toLowerCase(c_7_);
						c_8_ = Character.toLowerCase(c_8_);
						if ((c_8_ ^ 0xffffffff) != (c_7_ ^ 0xffffffff))
							break;
					}
				}
				return (Class347.method3834(i, c_7_, (byte) -127) - Class347.method3834(i, c_8_, (byte) -106));
			} while (false);
			int i_9_ = Math.min(i_2_, i_3_);
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				if (i == 2) {
					i_5_ = -1 + i_3_ + -i_10_;
					i_4_ = -i_10_ + (i_2_ - 1);
				} else
					i_4_ = i_5_ = i_10_;
				char c_11_ = string.charAt(i_4_);
				char c_12_ = string_0_.charAt(i_5_);
				if ((c_11_ ^ 0xffffffff) != (c_12_ ^ 0xffffffff) && ((Character.toUpperCase(c_11_) ^ 0xffffffff) != (Character.toUpperCase(c_12_) ^ 0xffffffff))) {
					c_11_ = Character.toLowerCase(c_11_);
					c_12_ = Character.toLowerCase(c_12_);
					if ((c_12_ ^ 0xffffffff) != (c_11_ ^ 0xffffffff))
						return (Class347.method3834(i, c_11_, (byte) -106) + -Class347.method3834(i, c_12_, (byte) -103));
				}
			}
			if (i_1_ != 1166845806)
				method3772(null, null, 8, 52);
			int i_13_ = -i_3_ + i_2_;
			if (i_13_ != 0)
				return i_13_;
			for (int i_14_ = 0; i_9_ > i_14_; i_14_++) {
				char c_15_ = string.charAt(i_14_);
				char c_16_ = string_0_.charAt(i_14_);
				if (c_16_ != c_15_)
					return (Class347.method3834(i, c_15_, (byte) -113) + -Class347.method3834(i, c_16_, (byte) -94));
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uj.B(" + (string != null ? "{...}" : "null") + ',' + (string_0_ != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
		}
	}

	static final void method3773(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int[] is) {
		try {
			if (i_20_ > 0 && !Class81.method815(i_20_, 0))
				throw new IllegalArgumentException("");
			if ((i_22_ ^ 0xffffffff) < -1 && !Class81.method815(i_22_, 0))
				throw new IllegalArgumentException("");
			if (i_21_ != 32993)
				throw new IllegalArgumentException("");
			int i_23_ = 0;
			int i_24_ = i_20_ >= i_22_ ? i_22_ : i_20_;
			int i_26_ = i_20_ >> 197585345;
			int i_27_ = i_22_ >> 1631935457;
			int[] is_28_ = is;
			int[] is_29_ = new int[i_26_ * i_27_];
			for (;;) {
				OpenGL.glTexImage2Di(i_19_, i_23_, i, i_20_, i_22_, 0, i_21_, i_18_, is_28_, 0);
				if ((i_24_ ^ 0xffffffff) >= -2)
					break;
				int i_30_ = 0;
				int i_31_ = 0;
				int i_32_ = i_20_ + i_31_;
				int[] is_33_ = is_29_;
				for (int i_34_ = 0; i_27_ > i_34_; i_34_++) {
					for (int i_35_ = 0; (i_26_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
						int i_36_ = is_28_[i_31_++];
						int i_37_ = is_28_[i_31_++];
						int i_38_ = is_28_[i_32_++];
						int i_39_ = is_28_[i_32_++];
						int i_40_ = (0xff9f & i_36_) >> -421974616;
						int i_41_ = 0xff & i_36_ >> -43327976;
						int i_42_ = 0xff & i_36_;
						int i_43_ = (0xff69b8 & i_36_) >> -776339632;
						i_40_ += (i_37_ & 0xff1c) >> 812194376;
						i_42_ += 0xff & i_37_;
						i_43_ += 0xff & i_37_ >> 1557675760;
						i_41_ += i_37_ >> 243371288 & 0xff;
						i_42_ += i_38_ & 0xff;
						i_43_ += (0xff241e & i_38_) >> -1634852208;
						i_40_ += 0xff & i_38_ >> -531512024;
						i_41_ += i_38_ >> 458737752 & 0xff;
						i_43_ += 0xff & i_39_ >> -1828159344;
						i_42_ += i_39_ & 0xff;
						i_41_ += i_39_ >> -1038206792 & 0xff;
						i_40_ += (0xff74 & i_39_) >> -1994009752;
						is_29_[i_30_++] = (Class41.method366((Class41.method366((Class202.method2702(i_40_, 1020) << 2110065190), (Class41.method366((Class202.method2702(i_43_, 1020) << 1166845806), Class202.method2702(-16777216, (i_41_ << -1269502378)))))), Class202.method2702(255, i_42_ >> 786651458)));
					}
					i_31_ += i_20_;
					i_32_ += i_20_;
				}
				is_29_ = is_28_;
				i_22_ = i_27_;
				is_28_ = is_33_;
				i_20_ = i_26_;
				i_26_ >>= 1;
				i_23_++;
				i_27_ >>= 1;
				i_24_ >>= 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uj.C(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	protected final void finalize() throws Throwable {
		try {
			aHa_Sub1_2824.method1855(false, ((Class336) this).aLong2821);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uj.finalize(" + ')');
		}
	}

	public static void method3774(int i) {
		try {
			if (i == -43327976) {
				aClass66Array2828 = null;
				IncomingOpcode.aClass58_2825 = null;
				anIntArray2826 = null;
				aClass232_2822 = null;
				aClass148_2827 = null;
				aClass105_2829 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uj.A(" + i + ')');
		}
	}

	Class336(ha_Sub1 var_ha_Sub1, long l, Class345[] class345s) {
		try {
			((Class336) this).aLong2821 = l;
			aHa_Sub1_2824 = var_ha_Sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uj.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + l + ',' + (class345s != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass148_2827 = new LinkedList();
		aClass66Array2828 = new Class66[16];
		aClass105_2829 = new Class105("", 11);
	}
}
