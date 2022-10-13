/* Class111_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111_Sub2 extends Class111 {
	float aFloat4688;
	float aFloat4689;
	float aFloat4690;
	float aFloat4691;
	float aFloat4692;
	float aFloat4693;
	float aFloat4694;
	static int anInt4695;
	float aFloat4696;
	float aFloat4697;
	float aFloat4698;
	float aFloat4699;
	float aFloat4700;

	final void method2107(int i) {
		try {
			((Class111_Sub2) this).aFloat4700 = 1.0F;
			((Class111_Sub2) this).aFloat4688 = ((Class111_Sub2) this).aFloat4694 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			((Class111_Sub2) this).aFloat4698 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			((Class111_Sub2) this).aFloat4699 = ((Class111_Sub2) this).aFloat4690 = ((Class111_Sub2) this).aFloat4697 = ((Class111_Sub2) this).aFloat4692 = ((Class111_Sub2) this).aFloat4691 = ((Class111_Sub2) this).aFloat4693 = ((Class111_Sub2) this).aFloat4689 = 0.0F;
			((Class111_Sub2) this).aFloat4696 = -((Class111_Sub2) this).aFloat4698;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.N(" + i + ')');
		}
	}

	final void method2091() {
		try {
			((Class111_Sub2) this).aFloat4700 = ((Class111_Sub2) this).aFloat4688 = ((Class111_Sub2) this).aFloat4694 = 1.0F;
			((Class111_Sub2) this).aFloat4692 = ((Class111_Sub2) this).aFloat4693 = ((Class111_Sub2) this).aFloat4699 = ((Class111_Sub2) this).aFloat4698 = ((Class111_Sub2) this).aFloat4690 = ((Class111_Sub2) this).aFloat4696 = ((Class111_Sub2) this).aFloat4697 = ((Class111_Sub2) this).aFloat4691 = ((Class111_Sub2) this).aFloat4689 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.CA(" + ')');
		}
	}

	final void method2096(int i, int i_0_, int i_1_, int[] is) {
		try {
			i -= ((Class111_Sub2) this).aFloat4697;
			i_0_ -= ((Class111_Sub2) this).aFloat4691;
			i_1_ -= ((Class111_Sub2) this).aFloat4689;
			is[0] = (int) (((Class111_Sub2) this).aFloat4693 * (float) i_1_ + ((float) i * ((Class111_Sub2) this).aFloat4700 + (((Class111_Sub2) this).aFloat4692 * (float) i_0_)));
			is[2] = (int) (((Class111_Sub2) this).aFloat4696 * (float) i_0_ + ((Class111_Sub2) this).aFloat4690 * (float) i + (float) i_1_ * ((Class111_Sub2) this).aFloat4694);
			is[1] = (int) (((Class111_Sub2) this).aFloat4698 * (float) i_1_ + (((Class111_Sub2) this).aFloat4688 * (float) i_0_ + ((Class111_Sub2) this).aFloat4699 * (float) i));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ho.PA(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2100(int i, int i_2_, int i_3_) {
		try {
			((Class111_Sub2) this).aFloat4697 = (float) i;
			((Class111_Sub2) this).aFloat4700 = ((Class111_Sub2) this).aFloat4688 = ((Class111_Sub2) this).aFloat4694 = 1.0F;
			((Class111_Sub2) this).aFloat4691 = (float) i_2_;
			((Class111_Sub2) this).aFloat4689 = (float) i_3_;
			((Class111_Sub2) this).aFloat4692 = ((Class111_Sub2) this).aFloat4693 = ((Class111_Sub2) this).aFloat4699 = ((Class111_Sub2) this).aFloat4698 = ((Class111_Sub2) this).aFloat4690 = ((Class111_Sub2) this).aFloat4696 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ho.SA(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method2093(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			float f = Class64_Sub5.aFloatArray3653[0x3fff & i_6_];
			float f_9_ = Class64_Sub5.aFloatArray3651[0x3fff & i_6_];
			float f_10_ = Class64_Sub5.aFloatArray3653[0x3fff & i_7_];
			float f_11_ = Class64_Sub5.aFloatArray3651[i_7_ & 0x3fff];
			float f_12_ = Class64_Sub5.aFloatArray3653[i_8_ & 0x3fff];
			float f_13_ = Class64_Sub5.aFloatArray3651[0x3fff & i_8_];
			float f_14_ = f_12_ * f_9_;
			float f_15_ = f_9_ * f_13_;
			((Class111_Sub2) this).aFloat4699 = f * f_13_;
			((Class111_Sub2) this).aFloat4692 = f_13_ * -f_10_ + f_14_ * f_11_;
			((Class111_Sub2) this).aFloat4688 = f * f_12_;
			((Class111_Sub2) this).aFloat4698 = -f_9_;
			((Class111_Sub2) this).aFloat4696 = f_10_ * f_14_ + f_13_ * f_11_;
			((Class111_Sub2) this).aFloat4693 = f * f_11_;
			((Class111_Sub2) this).aFloat4700 = f_11_ * f_15_ + f_12_ * f_10_;
			((Class111_Sub2) this).aFloat4690 = f_15_ * f_10_ + f_12_ * -f_11_;
			((Class111_Sub2) this).aFloat4694 = f * f_10_;
			((Class111_Sub2) this).aFloat4691 = (-(((Class111_Sub2) this).aFloat4688 * (float) i_4_) + ((Class111_Sub2) this).aFloat4692 * (float) -i - ((Class111_Sub2) this).aFloat4696 * (float) i_5_);
			((Class111_Sub2) this).aFloat4689 = (-((float) i_4_ * ((Class111_Sub2) this).aFloat4698) + (float) -i * ((Class111_Sub2) this).aFloat4693 - (float) i_5_ * ((Class111_Sub2) this).aFloat4694);
			((Class111_Sub2) this).aFloat4697 = (((Class111_Sub2) this).aFloat4700 * (float) -i - (float) i_4_ * ((Class111_Sub2) this).aFloat4699 - (float) i_5_ * ((Class111_Sub2) this).aFloat4690);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ho.U(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method2101(int i) {
		try {
			((Class111_Sub2) this).aFloat4688 = 1.0F;
			((Class111_Sub2) this).aFloat4700 = ((Class111_Sub2) this).aFloat4694 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			((Class111_Sub2) this).aFloat4690 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			((Class111_Sub2) this).aFloat4699 = ((Class111_Sub2) this).aFloat4697 = ((Class111_Sub2) this).aFloat4692 = ((Class111_Sub2) this).aFloat4696 = ((Class111_Sub2) this).aFloat4691 = ((Class111_Sub2) this).aFloat4698 = ((Class111_Sub2) this).aFloat4689 = 0.0F;
			((Class111_Sub2) this).aFloat4693 = -((Class111_Sub2) this).aFloat4690;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.F(" + i + ')');
		}
	}

	final void method2108(int[] is) {
		try {
			float f = -((Class111_Sub2) this).aFloat4697 + (float) is[0];
			float f_16_ = -((Class111_Sub2) this).aFloat4691 + (float) is[1];
			float f_17_ = (float) is[2] - ((Class111_Sub2) this).aFloat4689;
			is[0] = (int) (f_16_ * ((Class111_Sub2) this).aFloat4692 + f * ((Class111_Sub2) this).aFloat4700 + f_17_ * ((Class111_Sub2) this).aFloat4693);
			is[2] = (int) (((Class111_Sub2) this).aFloat4694 * f_17_ + (f * ((Class111_Sub2) this).aFloat4690 + ((Class111_Sub2) this).aFloat4696 * f_16_));
			is[1] = (int) (((Class111_Sub2) this).aFloat4688 * f_16_ + ((Class111_Sub2) this).aFloat4699 * f + ((Class111_Sub2) this).aFloat4698 * f_17_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.LA(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method2097(int i) {
		try {
			float f = Class64_Sub5.aFloatArray3653[0x3fff & i];
			float f_18_ = Class64_Sub5.aFloatArray3651[0x3fff & i];
			float f_19_ = ((Class111_Sub2) this).aFloat4700;
			float f_20_ = ((Class111_Sub2) this).aFloat4699;
			float f_21_ = ((Class111_Sub2) this).aFloat4690;
			float f_22_ = ((Class111_Sub2) this).aFloat4697;
			((Class111_Sub2) this).aFloat4700 = f_18_ * ((Class111_Sub2) this).aFloat4693 + f_19_ * f;
			((Class111_Sub2) this).aFloat4699 = ((Class111_Sub2) this).aFloat4698 * f_18_ + f * f_20_;
			((Class111_Sub2) this).aFloat4693 = -(f_18_ * f_19_) + f * ((Class111_Sub2) this).aFloat4693;
			((Class111_Sub2) this).aFloat4698 = -(f_20_ * f_18_) + f * ((Class111_Sub2) this).aFloat4698;
			((Class111_Sub2) this).aFloat4690 = f_18_ * ((Class111_Sub2) this).aFloat4694 + f_21_ * f;
			((Class111_Sub2) this).aFloat4694 = ((Class111_Sub2) this).aFloat4694 * f - f_18_ * f_21_;
			((Class111_Sub2) this).aFloat4697 = f_22_ * f + ((Class111_Sub2) this).aFloat4689 * f_18_;
			((Class111_Sub2) this).aFloat4689 = -(f_18_ * f_22_) + ((Class111_Sub2) this).aFloat4689 * f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.RA(" + i + ')');
		}
	}

	final void method2104(int i) {
		try {
			((Class111_Sub2) this).aFloat4694 = 1.0F;
			((Class111_Sub2) this).aFloat4700 = ((Class111_Sub2) this).aFloat4688 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			((Class111_Sub2) this).aFloat4692 = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			((Class111_Sub2) this).aFloat4690 = ((Class111_Sub2) this).aFloat4697 = ((Class111_Sub2) this).aFloat4696 = ((Class111_Sub2) this).aFloat4691 = ((Class111_Sub2) this).aFloat4693 = ((Class111_Sub2) this).aFloat4698 = ((Class111_Sub2) this).aFloat4689 = 0.0F;
			((Class111_Sub2) this).aFloat4699 = -((Class111_Sub2) this).aFloat4692;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.HA(" + i + ')');
		}
	}

	static final short method2117(int i, int i_23_) {
		try {
			int i_24_ = (i & 0xfcc8) >> 1122429642;
			int i_25_ = -63 % ((i_23_ - 5) / 40);
			int i_26_ = 0x70 & i >> -544476509;
			int i_27_ = 0x7f & i;
			i_26_ = ((i_27_ ^ 0xffffffff) < -65 ? (127 - i_27_) * i_26_ >> -1227528857 : i_26_ * i_27_ >> -1204704377);
			int i_28_ = i_27_ + i_26_;
			int i_29_;
			do {
				if ((i_28_ ^ 0xffffffff) != -1) {
					i_29_ = (i_26_ << 1992475560) / i_28_;
					if (!client.aBoolean3553)
						break;
				}
				i_29_ = i_26_ << 1259684257;
			} while (false);
			int i_30_ = i_28_;
			return (short) (i_24_ << 450770282 | i_29_ >> 45825476 << -224459065 | i_30_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.A(" + i + ',' + i_23_ + ')');
		}
	}

	final void method2092(Class111 class111) {
		try {
			Class111_Sub2 class111_sub2_31_ = (Class111_Sub2) class111;
			((Class111_Sub2) this).aFloat4696 = ((Class111_Sub2) class111_sub2_31_).aFloat4696;
			((Class111_Sub2) this).aFloat4694 = ((Class111_Sub2) class111_sub2_31_).aFloat4694;
			((Class111_Sub2) this).aFloat4689 = ((Class111_Sub2) class111_sub2_31_).aFloat4689;
			((Class111_Sub2) this).aFloat4688 = ((Class111_Sub2) class111_sub2_31_).aFloat4688;
			((Class111_Sub2) this).aFloat4691 = ((Class111_Sub2) class111_sub2_31_).aFloat4691;
			((Class111_Sub2) this).aFloat4700 = ((Class111_Sub2) class111_sub2_31_).aFloat4700;
			((Class111_Sub2) this).aFloat4693 = ((Class111_Sub2) class111_sub2_31_).aFloat4693;
			((Class111_Sub2) this).aFloat4690 = ((Class111_Sub2) class111_sub2_31_).aFloat4690;
			((Class111_Sub2) this).aFloat4699 = ((Class111_Sub2) class111_sub2_31_).aFloat4699;
			((Class111_Sub2) this).aFloat4692 = ((Class111_Sub2) class111_sub2_31_).aFloat4692;
			((Class111_Sub2) this).aFloat4698 = ((Class111_Sub2) class111_sub2_31_).aFloat4698;
			((Class111_Sub2) this).aFloat4697 = ((Class111_Sub2) class111_sub2_31_).aFloat4697;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.H(" + (class111 != null ? "{...}" : "null") + ')');
		}
	}

	final void method2105(int i) {
		try {
			float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			float f_32_ = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			float f_33_ = ((Class111_Sub2) this).aFloat4692;
			float f_34_ = ((Class111_Sub2) this).aFloat4688;
			float f_35_ = ((Class111_Sub2) this).aFloat4696;
			((Class111_Sub2) this).aFloat4692 = -(f_32_ * ((Class111_Sub2) this).aFloat4693) + f * f_33_;
			float f_36_ = ((Class111_Sub2) this).aFloat4691;
			((Class111_Sub2) this).aFloat4688 = -(((Class111_Sub2) this).aFloat4698 * f_32_) + f_34_ * f;
			((Class111_Sub2) this).aFloat4693 = f * ((Class111_Sub2) this).aFloat4693 + f_33_ * f_32_;
			((Class111_Sub2) this).aFloat4698 = f_34_ * f_32_ + f * ((Class111_Sub2) this).aFloat4698;
			((Class111_Sub2) this).aFloat4696 = -(((Class111_Sub2) this).aFloat4694 * f_32_) + f_35_ * f;
			((Class111_Sub2) this).aFloat4691 = -(f_32_ * ((Class111_Sub2) this).aFloat4689) + f * f_36_;
			((Class111_Sub2) this).aFloat4694 = f_35_ * f_32_ + f * ((Class111_Sub2) this).aFloat4694;
			((Class111_Sub2) this).aFloat4689 = f * ((Class111_Sub2) this).aFloat4689 + f_32_ * f_36_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.O(" + i + ')');
		}
	}

	final Class111 method2102() {
		try {
			Class111_Sub2 class111_sub2_37_ = new Class111_Sub2();
			((Class111_Sub2) class111_sub2_37_).aFloat4690 = ((Class111_Sub2) this).aFloat4690;
			((Class111_Sub2) class111_sub2_37_).aFloat4689 = ((Class111_Sub2) this).aFloat4689;
			((Class111_Sub2) class111_sub2_37_).aFloat4694 = ((Class111_Sub2) this).aFloat4694;
			((Class111_Sub2) class111_sub2_37_).aFloat4698 = ((Class111_Sub2) this).aFloat4698;
			((Class111_Sub2) class111_sub2_37_).aFloat4692 = ((Class111_Sub2) this).aFloat4692;
			((Class111_Sub2) class111_sub2_37_).aFloat4696 = ((Class111_Sub2) this).aFloat4696;
			((Class111_Sub2) class111_sub2_37_).aFloat4700 = ((Class111_Sub2) this).aFloat4700;
			((Class111_Sub2) class111_sub2_37_).aFloat4691 = ((Class111_Sub2) this).aFloat4691;
			((Class111_Sub2) class111_sub2_37_).aFloat4693 = ((Class111_Sub2) this).aFloat4693;
			((Class111_Sub2) class111_sub2_37_).aFloat4697 = ((Class111_Sub2) this).aFloat4697;
			((Class111_Sub2) class111_sub2_37_).aFloat4699 = ((Class111_Sub2) this).aFloat4699;
			((Class111_Sub2) class111_sub2_37_).aFloat4688 = ((Class111_Sub2) this).aFloat4688;
			return class111_sub2_37_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.TA(" + ')');
		}
	}

	final void method2099(int i, int i_38_, int i_39_, int[] is) {
		try {
			is[2] = (int) (((Class111_Sub2) this).aFloat4698 * (float) i_38_ + ((Class111_Sub2) this).aFloat4693 * (float) i + (float) i_39_ * ((Class111_Sub2) this).aFloat4694);
			is[1] = (int) ((float) i_39_ * ((Class111_Sub2) this).aFloat4696 + (((Class111_Sub2) this).aFloat4688 * (float) i_38_ + (float) i * ((Class111_Sub2) this).aFloat4692));
			is[0] = (int) ((float) i_39_ * ((Class111_Sub2) this).aFloat4690 + ((float) i * ((Class111_Sub2) this).aFloat4700 + (((Class111_Sub2) this).aFloat4699 * (float) i_38_)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ho.MA(" + i + ',' + i_38_ + ',' + i_39_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2106(int i, int i_40_, int i_41_) {
		try {
			((Class111_Sub2) this).aFloat4697 += (float) i;
			((Class111_Sub2) this).aFloat4691 += (float) i_40_;
			((Class111_Sub2) this).aFloat4689 += (float) i_41_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ho.G(" + i + ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	final void method2090(int i) {
		try {
			float f = Class64_Sub5.aFloatArray3653[0x3fff & i];
			float f_42_ = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			float f_43_ = ((Class111_Sub2) this).aFloat4700;
			float f_44_ = ((Class111_Sub2) this).aFloat4699;
			float f_45_ = ((Class111_Sub2) this).aFloat4690;
			((Class111_Sub2) this).aFloat4700 = f_43_ * f - f_42_ * ((Class111_Sub2) this).aFloat4692;
			float f_46_ = ((Class111_Sub2) this).aFloat4697;
			((Class111_Sub2) this).aFloat4699 = f_44_ * f - ((Class111_Sub2) this).aFloat4688 * f_42_;
			((Class111_Sub2) this).aFloat4692 = f_42_ * f_43_ + f * ((Class111_Sub2) this).aFloat4692;
			((Class111_Sub2) this).aFloat4690 = f_45_ * f - f_42_ * ((Class111_Sub2) this).aFloat4696;
			((Class111_Sub2) this).aFloat4688 = ((Class111_Sub2) this).aFloat4688 * f + f_42_ * f_44_;
			((Class111_Sub2) this).aFloat4697 = f_46_ * f - ((Class111_Sub2) this).aFloat4691 * f_42_;
			((Class111_Sub2) this).aFloat4696 = ((Class111_Sub2) this).aFloat4696 * f + f_45_ * f_42_;
			((Class111_Sub2) this).aFloat4691 = f_46_ * f_42_ + f * ((Class111_Sub2) this).aFloat4691;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.C(" + i + ')');
		}
	}

	final void method2103(int i, int i_47_, int i_48_, int[] is) {
		try {
			is[2] = (int) (((Class111_Sub2) this).aFloat4689 + (((Class111_Sub2) this).aFloat4693 * (float) i + ((Class111_Sub2) this).aFloat4698 * (float) i_47_ + (((Class111_Sub2) this).aFloat4694 * (float) i_48_)));
			is[1] = (int) (((Class111_Sub2) this).aFloat4691 + (((Class111_Sub2) this).aFloat4696 * (float) i_48_ + (((Class111_Sub2) this).aFloat4692 * (float) i + (((Class111_Sub2) this).aFloat4688 * (float) i_47_))));
			is[0] = (int) (((Class111_Sub2) this).aFloat4697 + (((Class111_Sub2) this).aFloat4700 * (float) i + (float) i_47_ * ((Class111_Sub2) this).aFloat4699 + ((float) i_48_ * ((Class111_Sub2) this).aFloat4690)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ho.M(" + i + ',' + i_47_ + ',' + i_48_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public Class111_Sub2() {
		try {
			method2091();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ho.<init>(" + ')');
		}
	}
}
