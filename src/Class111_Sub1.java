/* Class111_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111_Sub1 extends Class111 {
	float aFloat4673;
	float aFloat4674;
	float aFloat4675;
	float aFloat4676;
	float aFloat4677;
	float aFloat4678;
	float aFloat4679;
	float aFloat4680;
	static int[] anIntArray4681;
	static int[] anIntArray4682 = new int[32];
	float aFloat4683;
	float aFloat4684;
	static Class239 aClass239_4685;
	float aFloat4686;
	float aFloat4687;

	final void method2100(int i, int i_0_, int i_1_) {
		try {
			this.aFloat4674 = (float) i;
			this.aFloat4677 = (float) i_1_;
			this.aFloat4683 = (float) i_0_;
			this.aFloat4678 = this.aFloat4684 = this.aFloat4679 = this.aFloat4676 = this.aFloat4680 = this.aFloat4687 = 0.0F;
			this.aFloat4686 = this.aFloat4675 = this.aFloat4673 = 1.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.SA(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2109(int i, float f, float f_2_, float f_3_, float f_4_, float[] fs) {
		try {
			fs[0] = (f_4_ * this.aFloat4679 + f_3_ * this.aFloat4686 + this.aFloat4680 * f);
			float f_5_;
			float f_6_;
			float f_7_;
			if (f_3_ > 0.00390625F || f_3_ < -0.00390625F) {
				float f_8_ = -f_2_ / f_3_;
				f_5_ = (this.aFloat4683 + this.aFloat4678 * f_8_);
				f_7_ = (this.aFloat4677 + this.aFloat4684 * f_8_);
				f_6_ = (f_8_ * this.aFloat4686 + this.aFloat4674);
			} else if (!(f_4_ > 0.00390625F) && !(f_4_ < -0.00390625F)) {
				float f_9_ = -f_2_ / f;
				f_5_ = (f_9_ * this.aFloat4687 + this.aFloat4683);
				f_6_ = (this.aFloat4674 + this.aFloat4680 * f_9_);
				f_7_ = (this.aFloat4673 * f_9_ + this.aFloat4677);
			} else {
				float f_10_ = -f_2_ / f_4_;
				f_6_ = (this.aFloat4674 + f_10_ * this.aFloat4679);
				f_5_ = (this.aFloat4683 + f_10_ * this.aFloat4675);
				f_7_ = (f_10_ * this.aFloat4676 + this.aFloat4677);
			}
			if (i == -29834) {
				fs[2] = (f * this.aFloat4673 + (f_3_ * this.aFloat4684 + this.aFloat4676 * f_4_));
				fs[1] = (this.aFloat4687 * f + (f_3_ * this.aFloat4678 + f_4_ * this.aFloat4675));
				fs[3] = -(fs[0] * f_6_ + f_5_ * fs[1] + f_7_ * fs[2]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.J(" + i + ',' + f + ',' + f_2_ + ',' + f_3_ + ',' + f_4_ + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2096(int i, int i_11_, int i_12_, int[] is) {
		try {
			i -= this.aFloat4674;
			i_11_ -= this.aFloat4683;
			i_12_ -= this.aFloat4677;
			is[1] = (int) ((float) i_12_ * this.aFloat4676 + ((float) i * this.aFloat4679 + (this.aFloat4675 * (float) i_11_)));
			is[0] = (int) ((float) i_11_ * this.aFloat4678 + (float) i * this.aFloat4686 + this.aFloat4684 * (float) i_12_);
			is[2] = (int) ((float) i_12_ * this.aFloat4673 + ((float) i * this.aFloat4680 + ((float) i_11_ * this.aFloat4687)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.PA(" + i + ',' + i_11_ + ',' + i_12_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2110(float f, int i, int i_13_, float f_14_, int i_15_, byte i_16_, float f_17_) {
		do {
			try {
				do {
					if (i_13_ != 0) {
						float f_18_ = (Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i_13_]);
						float f_19_ = (Class98_Sub10_Sub36.aFloatArray5742[i_13_ & 0x3fff]);
						this.aFloat4686 = f_18_ * (float) i_15_;
						this.aFloat4679 = -f_19_ * (float) i;
						this.aFloat4678 = f_19_ * (float) i_15_;
						this.aFloat4684 = this.aFloat4676 = this.aFloat4680 = this.aFloat4687 = 0.0F;
						this.aFloat4675 = f_18_ * (float) i;
						this.aFloat4673 = 1.0F;
						if (!client.aBoolean3553)
							break;
					}
					this.aFloat4686 = (float) i_15_;
					this.aFloat4678 = this.aFloat4684 = this.aFloat4679 = this.aFloat4676 = this.aFloat4680 = this.aFloat4687 = 0.0F;
					this.aFloat4675 = (float) i;
					this.aFloat4673 = 1.0F;
				} while (false);
				this.aFloat4683 = f;
				this.aFloat4674 = f_17_;
				this.aFloat4677 = f_14_;
				if (i_16_ == 63)
					break;
				method2092(null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gca.K(" + f + ',' + i + ',' + i_13_ + ',' + f_14_ + ',' + i_15_ + ',' + i_16_ + ',' + f_17_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2090(int i) {
		try {
			float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			float f_20_ = Class98_Sub10_Sub36.aFloatArray5742[0x3fff & i];
			float f_21_ = this.aFloat4686;
			float f_22_ = this.aFloat4679;
			float f_23_ = this.aFloat4680;
			float f_24_ = this.aFloat4674;
			this.aFloat4686 = f * f_21_ - f_20_ * this.aFloat4678;
			this.aFloat4678 = f_20_ * f_21_ + f * this.aFloat4678;
			this.aFloat4679 = f_22_ * f - this.aFloat4675 * f_20_;
			this.aFloat4680 = f_23_ * f - f_20_ * this.aFloat4687;
			this.aFloat4675 = f * this.aFloat4675 + f_22_ * f_20_;
			this.aFloat4687 = f_23_ * f_20_ + this.aFloat4687 * f;
			this.aFloat4674 = f * f_24_ - f_20_ * this.aFloat4683;
			this.aFloat4683 = this.aFloat4683 * f + f_24_ * f_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.C(" + i + ')');
		}
	}

	final void method2093(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		try {
			float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i_27_];
			float f_30_ = Class98_Sub10_Sub36.aFloatArray5742[i_27_ & 0x3fff];
			float f_31_ = Class98_Sub10_Sub36.aFloatArray5741[i_28_ & 0x3fff];
			float f_32_ = Class98_Sub10_Sub36.aFloatArray5742[i_28_ & 0x3fff];
			float f_33_ = Class98_Sub10_Sub36.aFloatArray5741[i_29_ & 0x3fff];
			float f_34_ = Class98_Sub10_Sub36.aFloatArray5742[0x3fff & i_29_];
			float f_35_ = f_33_ * f_30_;
			float f_36_ = f_34_ * f_30_;
			this.aFloat4684 = f_32_ * f;
			this.aFloat4676 = -f_30_;
			this.aFloat4679 = f * f_34_;
			this.aFloat4673 = f_31_ * f;
			this.aFloat4686 = f_33_ * f_31_ + f_36_ * f_32_;
			this.aFloat4687 = f_34_ * f_32_ + f_31_ * f_35_;
			this.aFloat4678 = f_32_ * f_35_ + -f_31_ * f_34_;
			this.aFloat4680 = -f_32_ * f_33_ + f_36_ * f_31_;
			this.aFloat4675 = f * f_33_;
			this.aFloat4677 = (-((float) i_26_ * this.aFloat4673) + (-((float) i_25_ * this.aFloat4676) + this.aFloat4684 * (float) -i));
			this.aFloat4683 = (-((float) i_26_ * this.aFloat4687) + (-(this.aFloat4675 * (float) i_25_) + this.aFloat4678 * (float) -i));
			this.aFloat4674 = (this.aFloat4686 * (float) -i - this.aFloat4679 * (float) i_25_ - (float) i_26_ * this.aFloat4680);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.U(" + i + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ')'));
		}
	}

	final void method2105(int i) {
		try {
			float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			float f_37_ = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			float f_38_ = this.aFloat4678;
			float f_39_ = this.aFloat4675;
			float f_40_ = this.aFloat4687;
			float f_41_ = this.aFloat4683;
			this.aFloat4678 = -(f_37_ * this.aFloat4684) + f_38_ * f;
			this.aFloat4684 = f_38_ * f_37_ + f * this.aFloat4684;
			this.aFloat4675 = -(this.aFloat4676 * f_37_) + f * f_39_;
			this.aFloat4687 = -(f_37_ * this.aFloat4673) + f_40_ * f;
			this.aFloat4676 = f_39_ * f_37_ + f * this.aFloat4676;
			this.aFloat4683 = f_41_ * f - f_37_ * this.aFloat4677;
			this.aFloat4673 = f_37_ * f_40_ + f * this.aFloat4673;
			this.aFloat4677 = this.aFloat4677 * f + f_41_ * f_37_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.O(" + i + ')');
		}
	}

	final void method2091() {
		try {
			this.aFloat4678 = this.aFloat4684 = this.aFloat4679 = this.aFloat4676 = this.aFloat4680 = this.aFloat4687 = this.aFloat4674 = this.aFloat4683 = this.aFloat4677 = 0.0F;
			this.aFloat4686 = this.aFloat4675 = this.aFloat4673 = 1.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.CA(" + ')');
		}
	}

	final void method2111(int i) {
		try {
			this.aFloat4684 = -this.aFloat4684;
			this.aFloat4683 = -this.aFloat4683;
			this.aFloat4687 = -this.aFloat4687;
			if (i != 2)
				this.aFloat4679 = -1.6680864F;
			this.aFloat4676 = -this.aFloat4676;
			this.aFloat4677 = -this.aFloat4677;
			this.aFloat4678 = -this.aFloat4678;
			this.aFloat4673 = -this.aFloat4673;
			this.aFloat4675 = -this.aFloat4675;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.B(" + i + ')');
		}
	}

	final void method2112(Class111 class111, byte i) {
		try {
			Class111_Sub1 class111_sub1_42_ = (Class111_Sub1) class111;
			this.aFloat4686 = class111_sub1_42_.aFloat4686;
			this.aFloat4680 = class111_sub1_42_.aFloat4684;
			this.aFloat4679 = class111_sub1_42_.aFloat4678;
			this.aFloat4684 = class111_sub1_42_.aFloat4680;
			this.aFloat4675 = class111_sub1_42_.aFloat4675;
			this.aFloat4678 = class111_sub1_42_.aFloat4679;
			if (i > -83)
				this.aFloat4684 = 0.61483526F;
			this.aFloat4687 = class111_sub1_42_.aFloat4676;
			this.aFloat4676 = class111_sub1_42_.aFloat4687;
			this.aFloat4673 = class111_sub1_42_.aFloat4673;
			this.aFloat4674 = -((class111_sub1_42_.aFloat4677 * this.aFloat4680) + ((this.aFloat4686 * class111_sub1_42_.aFloat4674) + (class111_sub1_42_.aFloat4683 * this.aFloat4679)));
			this.aFloat4683 = -((class111_sub1_42_.aFloat4677 * this.aFloat4687) + ((this.aFloat4675 * class111_sub1_42_.aFloat4683) + (this.aFloat4678 * class111_sub1_42_.aFloat4674)));
			this.aFloat4677 = -((class111_sub1_42_.aFloat4677 * this.aFloat4673) + ((this.aFloat4676 * class111_sub1_42_.aFloat4683) + (class111_sub1_42_.aFloat4674 * this.aFloat4684)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.E(" + (class111 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2099(int i, int i_43_, int i_44_, int[] is) {
		try {
			is[1] = (int) ((float) i_44_ * this.aFloat4687 + (this.aFloat4675 * (float) i_43_ + (float) i * this.aFloat4678));
			is[0] = (int) ((float) i_44_ * this.aFloat4680 + (this.aFloat4679 * (float) i_43_ + this.aFloat4686 * (float) i));
			is[2] = (int) (this.aFloat4673 * (float) i_44_ + (this.aFloat4684 * (float) i + ((float) i_43_ * this.aFloat4676)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.MA(" + i + ',' + i_43_ + ',' + i_44_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2104(int i) {
		try {
			this.aFloat4673 = 1.0F;
			this.aFloat4686 = this.aFloat4675 = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			this.aFloat4678 = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			this.aFloat4680 = this.aFloat4674 = this.aFloat4687 = this.aFloat4683 = this.aFloat4684 = this.aFloat4676 = this.aFloat4677 = 0.0F;
			this.aFloat4679 = -this.aFloat4678;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.HA(" + i + ')');
		}
	}

	final float[] method2113(int i) {
		try {
			Class269.aFloatArray2023[4] = this.aFloat4679;
			if (i > -102)
				this.aFloat4675 = -1.0382957F;
			Class269.aFloatArray2023[8] = this.aFloat4680;
			Class269.aFloatArray2023[14] = this.aFloat4677;
			Class269.aFloatArray2023[10] = this.aFloat4673;
			Class269.aFloatArray2023[6] = this.aFloat4676;
			Class269.aFloatArray2023[1] = this.aFloat4678;
			Class269.aFloatArray2023[13] = this.aFloat4683;
			Class269.aFloatArray2023[2] = this.aFloat4684;
			Class269.aFloatArray2023[0] = this.aFloat4686;
			Class269.aFloatArray2023[5] = this.aFloat4675;
			Class269.aFloatArray2023[9] = this.aFloat4687;
			Class269.aFloatArray2023[12] = this.aFloat4674;
			return Class269.aFloatArray2023;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.L(" + i + ')');
		}
	}

	final void method2107(int i) {
		try {
			this.aFloat4686 = 1.0F;
			this.aFloat4675 = this.aFloat4673 = Class98_Sub10_Sub36.aFloatArray5741[i & 0x3fff];
			this.aFloat4676 = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			this.aFloat4687 = -this.aFloat4676;
			this.aFloat4679 = this.aFloat4680 = this.aFloat4674 = this.aFloat4678 = this.aFloat4683 = this.aFloat4684 = this.aFloat4677 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.N(" + i + ')');
		}
	}

	public static void method2114(byte i) {
		try {
			aClass239_4685 = null;
			if (i != 66)
				method2114((byte) -98);
			anIntArray4681 = null;
			anIntArray4682 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.A(" + i + ')');
		}
	}

	static final Class98_Sub31_Sub2 method2115(int i, Class98_Sub31_Sub2 class98_sub31_sub2) {
		try {
			int i_45_ = -51 / ((57 - i) / 57);
			Class98_Sub31_Sub2 class98_sub31_sub2_46_ = (class98_sub31_sub2 != null ? new Class98_Sub31_Sub2(class98_sub31_sub2) : new Class98_Sub31_Sub2());
			class98_sub31_sub2_46_.method1357(26377, 128, 9);
			return class98_sub31_sub2_46_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.I(" + i + ',' + (class98_sub31_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2101(int i) {
		try {
			this.aFloat4675 = 1.0F;
			this.aFloat4686 = this.aFloat4673 = Class98_Sub10_Sub36.aFloatArray5741[i & 0x3fff];
			this.aFloat4680 = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			this.aFloat4679 = this.aFloat4674 = this.aFloat4678 = this.aFloat4687 = this.aFloat4683 = this.aFloat4676 = this.aFloat4677 = 0.0F;
			this.aFloat4684 = -this.aFloat4680;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.F(" + i + ')');
		}
	}

	final void method2097(int i) {
		try {
			float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			float f_47_ = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			float f_48_ = this.aFloat4686;
			float f_49_ = this.aFloat4679;
			float f_50_ = this.aFloat4680;
			this.aFloat4686 = this.aFloat4684 * f_47_ + f_48_ * f;
			float f_51_ = this.aFloat4674;
			this.aFloat4679 = f_49_ * f + f_47_ * this.aFloat4676;
			this.aFloat4684 = -(f_47_ * f_48_) + this.aFloat4684 * f;
			this.aFloat4676 = f * this.aFloat4676 - f_47_ * f_49_;
			this.aFloat4680 = f_50_ * f + f_47_ * this.aFloat4673;
			this.aFloat4674 = this.aFloat4677 * f_47_ + f_51_ * f;
			this.aFloat4673 = this.aFloat4673 * f - f_50_ * f_47_;
			this.aFloat4677 = -(f_47_ * f_51_) + this.aFloat4677 * f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.RA(" + i + ')');
		}
	}

	final void method2106(int i, int i_52_, int i_53_) {
		try {
			this.aFloat4683 += (float) i_52_;
			this.aFloat4677 += (float) i_53_;
			this.aFloat4674 += (float) i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.G(" + i + ',' + i_52_ + ',' + i_53_ + ')'));
		}
	}

	final void method2092(Class111 class111) {
		try {
			Class111_Sub1 class111_sub1_54_ = (Class111_Sub1) class111;
			this.aFloat4680 = class111_sub1_54_.aFloat4680;
			this.aFloat4678 = class111_sub1_54_.aFloat4678;
			this.aFloat4687 = class111_sub1_54_.aFloat4687;
			this.aFloat4674 = class111_sub1_54_.aFloat4674;
			this.aFloat4686 = class111_sub1_54_.aFloat4686;
			this.aFloat4683 = class111_sub1_54_.aFloat4683;
			this.aFloat4677 = class111_sub1_54_.aFloat4677;
			this.aFloat4676 = class111_sub1_54_.aFloat4676;
			this.aFloat4675 = class111_sub1_54_.aFloat4675;
			this.aFloat4673 = class111_sub1_54_.aFloat4673;
			this.aFloat4684 = class111_sub1_54_.aFloat4684;
			this.aFloat4679 = class111_sub1_54_.aFloat4679;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.H(" + (class111 != null ? "{...}" : "null") + ')');
		}
	}

	final void method2108(int[] is) {
		try {
			float f = -this.aFloat4674 + (float) is[0];
			float f_55_ = -this.aFloat4683 + (float) is[1];
			float f_56_ = -this.aFloat4677 + (float) is[2];
			is[1] = (int) (f_56_ * this.aFloat4676 + (this.aFloat4675 * f_55_ + this.aFloat4679 * f));
			is[0] = (int) (f * this.aFloat4686 + f_55_ * this.aFloat4678 + f_56_ * this.aFloat4684);
			is[2] = (int) (this.aFloat4673 * f_56_ + (f_55_ * this.aFloat4687 + this.aFloat4680 * f));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.LA(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method2103(int i, int i_57_, int i_58_, int[] is) {
		try {
			is[0] = (int) ((float) i_58_ * this.aFloat4680 + ((float) i_57_ * this.aFloat4679 + this.aFloat4686 * (float) i) + this.aFloat4674);
			is[1] = (int) (this.aFloat4683 + (this.aFloat4687 * (float) i_58_ + ((this.aFloat4675 * (float) i_57_) + (this.aFloat4678 * (float) i))));
			is[2] = (int) (this.aFloat4673 * (float) i_58_ + ((float) i * this.aFloat4684 + ((float) i_57_ * this.aFloat4676)) + this.aFloat4677);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.M(" + i + ',' + i_57_ + ',' + i_58_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final Class111 method2102() {
		try {
			Class111_Sub1 class111_sub1_59_ = new Class111_Sub1();
			class111_sub1_59_.aFloat4677 = this.aFloat4677;
			class111_sub1_59_.aFloat4683 = this.aFloat4683;
			class111_sub1_59_.aFloat4674 = this.aFloat4674;
			class111_sub1_59_.aFloat4676 = this.aFloat4676;
			class111_sub1_59_.aFloat4675 = this.aFloat4675;
			class111_sub1_59_.aFloat4684 = this.aFloat4684;
			class111_sub1_59_.aFloat4686 = this.aFloat4686;
			class111_sub1_59_.aFloat4680 = this.aFloat4680;
			class111_sub1_59_.aFloat4678 = this.aFloat4678;
			class111_sub1_59_.aFloat4673 = this.aFloat4673;
			class111_sub1_59_.aFloat4679 = this.aFloat4679;
			class111_sub1_59_.aFloat4687 = this.aFloat4687;
			return class111_sub1_59_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.TA(" + ')');
		}
	}

	final float[] method2116(int i) {
		try {
			Class269.aFloatArray2023[13] = 0.0F;
			Class269.aFloatArray2023[8] = this.aFloat4680;
			Class269.aFloatArray2023[2] = this.aFloat4684;
			if (i <= 45)
				aClass239_4685 = null;
			Class269.aFloatArray2023[10] = this.aFloat4673;
			Class269.aFloatArray2023[9] = this.aFloat4687;
			Class269.aFloatArray2023[1] = this.aFloat4678;
			Class269.aFloatArray2023[14] = 0.0F;
			Class269.aFloatArray2023[0] = this.aFloat4686;
			Class269.aFloatArray2023[4] = this.aFloat4679;
			Class269.aFloatArray2023[6] = this.aFloat4676;
			Class269.aFloatArray2023[12] = 0.0F;
			Class269.aFloatArray2023[5] = this.aFloat4675;
			return Class269.aFloatArray2023;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.D(" + i + ')');
		}
	}

	public Class111_Sub1() {
		try {
			method2091();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.<init>(" + ')');
		}
	}
}
