/* Class111_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111_Sub3 extends Class111 {
	static int anInt4701;
	float aFloat4702;
	float aFloat4703;
	float aFloat4704;
	float aFloat4705;
	float aFloat4706;
	static int[] anIntArray4707;
	float aFloat4708;
	float aFloat4709;
	float aFloat4710;
	float aFloat4711;
	float aFloat4712;
	float aFloat4713;
	float aFloat4714;
	static RuneScapeCache aClass207_4715;

	static final void method2118(int i) {
		do {
			try {
				Class341.method3812(1, Class255.draggedComponent);
				Class105.anInt3417++;
				if (!Class166.aBoolean1278 || !Class239.aBoolean1840) {
					if (Class105.anInt3417 > 1)
						Class255.draggedComponent = null;
				} else {
					int i_0_ = 0;
					int i_1_ = 0;
					if (za_Sub2.aBoolean6079) {
						i_0_ = Class189.method2642((byte) 42);
						i_1_ = Class335.method3765(false);
					}
					int i_2_ = Class2.aClass299_73.method3514(74) - -i_0_;
					int i_3_ = Class2.aClass299_73.method3507((byte) 125) - -i_1_;
					i_3_ -= PlayerUpdateMask.anInt526;
					if (i == 19653) {
						i_2_ -= ModelDefinitions.anInt1405;
						if (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500 > i_2_)
							i_2_ = Class246_Sub3_Sub4_Sub2_Sub1.anInt6500;
						if ((Class255.draggedComponent.anInt2311 + i_2_) > (Class189.aClass293_1457.anInt2311 + Class246_Sub3_Sub4_Sub2_Sub1.anInt6500))
							i_2_ = (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500 + ((Class189.aClass293_1457.anInt2311) + -(Class255.draggedComponent.anInt2311)));
						if (Class222.anInt1670 > i_3_)
							i_3_ = Class222.anInt1670;
						if ((Class255.draggedComponent.anInt2258 + i_3_) > (Class222.anInt1670 - -(Class189.aClass293_1457.anInt2258)))
							i_3_ = (Class222.anInt1670 - (-(Class189.aClass293_1457.anInt2258) + (Class255.draggedComponent.anInt2258)));
						int i_4_ = i_2_ - (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500 + -(Class189.aClass293_1457.anInt2246));
						int i_5_ = (-Class222.anInt1670 + (i_3_ - -(Class189.aClass293_1457.anInt2213)));
						if (!Class2.aClass299_73.method3505((byte) 22)) {
							if (!Class15.aBoolean186) {
								if ((Map.anInt5303 != 1) && !r_Sub1.method1642((byte) 125) || Class359.anInt3058 <= 2) {
									if (Class98_Sub17_Sub1.method1160(98))
										Class353.method3869((Class259.anInt1960 + (PlayerUpdateMask.anInt526)), (ModelDefinitions.anInt1405 + (Class167.anInt1286)), -2);
								} else
									Class353.method3869((PlayerUpdateMask.anInt526 - -(Class259.anInt1960)), (ModelDefinitions.anInt1405 - -(Class167.anInt1286)), -2);
							} else {
								Class98_Sub10_Sub32.method1098((byte) -49);
								if ((Class255.draggedComponent.anObjectArray2313) != null) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									class98_sub21.aClass293_3982 = Class162.draggedOnComponent;
									class98_sub21.mouse_y = i_5_;
									class98_sub21.component = Class255.draggedComponent;
									class98_sub21.cs2_params = (Class255.draggedComponent.anObjectArray2313);
									class98_sub21.anInt3985 = i_4_;
									ClientScript2Runtime.method3144(class98_sub21);
								}
								if (Class162.draggedOnComponent != null && (client.method102(Class255.draggedComponent) != null))
									Class151_Sub6.method2463((Class162.draggedOnComponent), (Class255.draggedComponent), 42);
							}
							Class255.draggedComponent = null;
						} else {
							if (Class105.anInt3417 > Class255.draggedComponent.anInt2353) {
								int i_6_ = i_2_ + -Class167.anInt1286;
								int i_7_ = i_3_ - Class259.anInt1960;
								if (i_6_ > Class255.draggedComponent.anInt2308 || -(Class255.draggedComponent.anInt2308) > i_6_ || (Class255.draggedComponent.anInt2308 < i_7_) || i_7_ < -(Class255.draggedComponent.anInt2308))
									Class15.aBoolean186 = true;
							}
							if ((Class255.draggedComponent.anObjectArray2316) == null || !Class15.aBoolean186)
								break;
							ClientScript2Event class98_sub21 = new ClientScript2Event();
							class98_sub21.cs2_params = (Class255.draggedComponent.anObjectArray2316);
							class98_sub21.component = Class255.draggedComponent;
							class98_sub21.anInt3985 = i_4_;
							class98_sub21.mouse_y = i_5_;
							ClientScript2Runtime.method3144(class98_sub21);
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "og.K(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2119(float f, int i, float f_8_, float f_9_) {
		try {
			this.aFloat4714 = this.aFloat4708 = this.aFloat4711 = this.aFloat4713 = this.aFloat4705 = this.aFloat4710 = 0.0F;
			this.aFloat4702 = f_9_;
			this.aFloat4703 = f;
			this.aFloat4712 = this.aFloat4706 = this.aFloat4704 = (float) i;
			this.aFloat4709 = f_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.IA(" + f + ',' + i + ',' + f_8_ + ',' + f_9_ + ')'));
		}
	}

	final void method2090(int i) {
		try {
			float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			float f_10_ = Class64_Sub5.aFloatArray3651[0x3fff & i];
			float f_11_ = this.aFloat4712;
			float f_12_ = this.aFloat4711;
			float f_13_ = this.aFloat4705;
			this.aFloat4712 = f * f_11_ - this.aFloat4714 * f_10_;
			float f_14_ = this.aFloat4702;
			this.aFloat4714 = this.aFloat4714 * f + f_11_ * f_10_;
			this.aFloat4711 = f * f_12_ - this.aFloat4706 * f_10_;
			this.aFloat4706 = this.aFloat4706 * f + f_10_ * f_12_;
			this.aFloat4705 = -(this.aFloat4710 * f_10_) + f * f_13_;
			this.aFloat4710 = f * this.aFloat4710 + f_13_ * f_10_;
			this.aFloat4702 = f * f_14_ - this.aFloat4709 * f_10_;
			this.aFloat4709 = f * this.aFloat4709 + f_14_ * f_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.C(" + i + ')');
		}
	}

	final void method2120(byte i, float f, float f_15_, float f_16_, float[] fs, float f_17_) {
		try {
			int i_18_ = 71 / ((-21 - i) / 35);
			fs[0] = (this.aFloat4711 * f_15_ + this.aFloat4712 * f_17_ + f * this.aFloat4705);
			float f_19_;
			float f_20_;
			float f_21_;
			if (!(f_17_ > 0.00390625F) && !(f_17_ < -0.00390625F)) {
				if (!(f_15_ > 0.00390625F) && !(f_15_ < -0.00390625F)) {
					float f_22_ = -f_16_ / f;
					f_21_ = (this.aFloat4709 + f_22_ * this.aFloat4710);
					f_19_ = (this.aFloat4703 + f_22_ * this.aFloat4704);
					f_20_ = (f_22_ * this.aFloat4705 + this.aFloat4702);
				} else {
					float f_23_ = -f_16_ / f_15_;
					f_20_ = (this.aFloat4711 * f_23_ + this.aFloat4702);
					f_21_ = (f_23_ * this.aFloat4706 + this.aFloat4709);
					f_19_ = (f_23_ * this.aFloat4713 + this.aFloat4703);
				}
			} else {
				float f_24_ = -f_16_ / f_17_;
				f_19_ = (this.aFloat4703 + f_24_ * this.aFloat4708);
				f_20_ = (this.aFloat4712 * f_24_ + this.aFloat4702);
				f_21_ = (f_24_ * this.aFloat4714 + this.aFloat4709);
			}
			fs[2] = (f_17_ * this.aFloat4708 + f_15_ * this.aFloat4713 + this.aFloat4704 * f);
			fs[1] = (this.aFloat4714 * f_17_ + this.aFloat4706 * f_15_ + f * this.aFloat4710);
			fs[3] = -(fs[1] * f_21_ + f_20_ * fs[0] + f_19_ * fs[2]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.JA(" + i + ',' + f + ',' + f_15_ + ',' + f_16_ + ',' + (fs != null ? "{...}" : "null") + ',' + f_17_ + ')'));
		}
	}

	final float[] method2121(byte i, float[] fs) {
		try {
			fs[14] = this.aFloat4703;
			fs[4] = this.aFloat4711;
			fs[0] = this.aFloat4712;
			fs[3] = 0.0F;
			fs[12] = this.aFloat4702;
			fs[11] = 0.0F;
			fs[6] = this.aFloat4713;
			fs[5] = this.aFloat4706;
			fs[7] = 0.0F;
			fs[13] = this.aFloat4709;
			fs[10] = this.aFloat4704;
			fs[8] = this.aFloat4705;
			fs[15] = 1.0F;
			if (i >= -27)
				this.aFloat4706 = 1.5727293F;
			fs[1] = this.aFloat4714;
			fs[9] = this.aFloat4710;
			fs[2] = this.aFloat4708;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.S(" + i + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2122(float[] fs, int i) {
		try {
			fs[13] = 0.0F;
			fs[6] = 0.0F;
			fs[2] = 0.0F;
			fs[9] = this.aFloat4709;
			fs[3] = 0.0F;
			fs[8] = this.aFloat4702;
			fs[14] = 0.0F;
			int i_25_ = -95 % ((i - -76) / 50);
			fs[10] = this.aFloat4703;
			fs[12] = 0.0F;
			fs[11] = 0.0F;
			fs[5] = this.aFloat4706;
			fs[7] = 0.0F;
			fs[0] = this.aFloat4712;
			fs[1] = this.aFloat4714;
			fs[4] = this.aFloat4711;
			fs[15] = 1.0F;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.D(" + (fs != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2096(int i, int i_26_, int i_27_, int[] is) {
		try {
			i -= this.aFloat4702;
			i_26_ -= this.aFloat4709;
			i_27_ -= this.aFloat4703;
			is[0] = (int) (this.aFloat4708 * (float) i_27_ + (this.aFloat4712 * (float) i + ((float) i_26_ * this.aFloat4714)));
			is[1] = (int) ((float) i_27_ * this.aFloat4713 + ((float) i_26_ * this.aFloat4706 + this.aFloat4711 * (float) i));
			is[2] = (int) ((float) i * this.aFloat4705 + (float) i_26_ * this.aFloat4710 + this.aFloat4704 * (float) i_27_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.PA(" + i + ',' + i_26_ + ',' + i_27_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2123(float f, float f_28_, float f_29_, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, float f_35_, byte i) {
		try {
			this.aFloat4708 = f_30_;
			this.aFloat4709 = 0.0F;
			this.aFloat4703 = 0.0F;
			this.aFloat4714 = f_29_;
			this.aFloat4713 = f_32_;
			this.aFloat4705 = f_35_;
			this.aFloat4702 = 0.0F;
			int i_36_ = -106 % ((i - 23) / 63);
			this.aFloat4706 = f_33_;
			this.aFloat4712 = f_34_;
			this.aFloat4710 = f_31_;
			this.aFloat4704 = f;
			this.aFloat4711 = f_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.UA(" + f + ',' + f_28_ + ',' + f_29_ + ',' + f_30_ + ',' + f_31_ + ',' + f_32_ + ',' + f_33_ + ',' + f_34_ + ',' + f_35_ + ',' + i + ')'));
		}
	}

	final void method2107(int i) {
		try {
			this.aFloat4712 = 1.0F;
			this.aFloat4706 = this.aFloat4704 = Class64_Sub5.aFloatArray3653[0x3fff & i];
			this.aFloat4713 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			this.aFloat4711 = this.aFloat4705 = this.aFloat4702 = this.aFloat4714 = this.aFloat4709 = this.aFloat4708 = this.aFloat4703 = 0.0F;
			this.aFloat4710 = -this.aFloat4713;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.N(" + i + ')');
		}
	}

	final void method2101(int i) {
		try {
			this.aFloat4706 = 1.0F;
			this.aFloat4712 = this.aFloat4704 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			this.aFloat4705 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			this.aFloat4708 = -this.aFloat4705;
			this.aFloat4711 = this.aFloat4702 = this.aFloat4714 = this.aFloat4710 = this.aFloat4709 = this.aFloat4713 = this.aFloat4703 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.F(" + i + ')');
		}
	}

	final void method2124(boolean bool, Class111 class111) {
		try {
			Class111_Sub3 class111_sub3_37_ = (Class111_Sub3) class111;
			float f = this.aFloat4712;
			float f_38_ = this.aFloat4714;
			float f_39_ = this.aFloat4711;
			float f_40_ = this.aFloat4706;
			float f_41_ = this.aFloat4705;
			float f_42_ = this.aFloat4710;
			float f_43_ = this.aFloat4702;
			float f_44_ = this.aFloat4709;
			this.aFloat4714 = ((class111_sub3_37_.aFloat4710 * this.aFloat4708) + (class111_sub3_37_.aFloat4706 * f_38_ + f * class111_sub3_37_.aFloat4714));
			this.aFloat4712 = ((this.aFloat4708 * class111_sub3_37_.aFloat4705) + (class111_sub3_37_.aFloat4711 * f_38_ + f * class111_sub3_37_.aFloat4712));
			this.aFloat4708 = ((class111_sub3_37_.aFloat4704 * this.aFloat4708) + (class111_sub3_37_.aFloat4713 * f_38_ + f * class111_sub3_37_.aFloat4708));
			if (bool != true)
				anInt4701 = 101;
			this.aFloat4711 = (class111_sub3_37_.aFloat4712 * f_39_ + f_40_ * class111_sub3_37_.aFloat4711 + (class111_sub3_37_.aFloat4705 * this.aFloat4713));
			this.aFloat4706 = (class111_sub3_37_.aFloat4706 * f_40_ + class111_sub3_37_.aFloat4714 * f_39_ + (class111_sub3_37_.aFloat4710 * this.aFloat4713));
			this.aFloat4710 = ((this.aFloat4704 * class111_sub3_37_.aFloat4710) + (class111_sub3_37_.aFloat4706 * f_42_ + (class111_sub3_37_.aFloat4714 * f_41_)));
			this.aFloat4713 = ((this.aFloat4713 * class111_sub3_37_.aFloat4704) + (f_40_ * class111_sub3_37_.aFloat4713 + (class111_sub3_37_.aFloat4708 * f_39_)));
			this.aFloat4705 = (f_41_ * class111_sub3_37_.aFloat4712 + f_42_ * class111_sub3_37_.aFloat4711 + (this.aFloat4704 * class111_sub3_37_.aFloat4705));
			this.aFloat4704 = (class111_sub3_37_.aFloat4713 * f_42_ + f_41_ * class111_sub3_37_.aFloat4708 + (class111_sub3_37_.aFloat4704 * this.aFloat4704));
			this.aFloat4709 = (class111_sub3_37_.aFloat4706 * f_44_ + class111_sub3_37_.aFloat4714 * f_43_ + (this.aFloat4703 * class111_sub3_37_.aFloat4710) + class111_sub3_37_.aFloat4709);
			this.aFloat4702 = (f_43_ * class111_sub3_37_.aFloat4712 + class111_sub3_37_.aFloat4711 * f_44_ + (class111_sub3_37_.aFloat4705 * this.aFloat4703) + class111_sub3_37_.aFloat4702);
			this.aFloat4703 = ((this.aFloat4703 * class111_sub3_37_.aFloat4704) + (class111_sub3_37_.aFloat4708 * f_43_ + f_44_ * class111_sub3_37_.aFloat4713) + class111_sub3_37_.aFloat4703);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.QA(" + bool + ',' + (class111 != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2125(float[] fs, byte i) {
		try {
			fs[0] = this.aFloat4712;
			fs[12] = 0.0F;
			fs[6] = this.aFloat4710;
			fs[4] = this.aFloat4714;
			if (i > -55)
				method2140(null, 66);
			fs[14] = 0.0F;
			fs[9] = this.aFloat4713;
			fs[1] = this.aFloat4711;
			fs[11] = 0.0F;
			fs[13] = 0.0F;
			fs[3] = 0.0F;
			fs[7] = 0.0F;
			fs[15] = 0.0F;
			fs[8] = this.aFloat4708;
			fs[2] = this.aFloat4705;
			fs[5] = this.aFloat4706;
			fs[10] = this.aFloat4704;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.B(" + (fs != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2103(int i, int i_45_, int i_46_, int[] is) {
		try {
			is[1] = (int) (this.aFloat4709 + ((float) i_46_ * this.aFloat4710 + (((float) i_45_ * this.aFloat4706) + (this.aFloat4714 * (float) i))));
			is[2] = (int) (this.aFloat4703 + (this.aFloat4704 * (float) i_46_ + (this.aFloat4708 * (float) i + ((float) i_45_ * this.aFloat4713))));
			is[0] = (int) (this.aFloat4702 + (this.aFloat4712 * (float) i + this.aFloat4711 * (float) i_45_ + (this.aFloat4705 * (float) i_46_)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.M(" + i + ',' + i_45_ + ',' + i_46_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final float method2126(float f, float f_47_, float f_48_, int i) {
		try {
			if (i <= 82)
				method2141(40, 0.2517629F, 0.044088684F, -0.25122625F);
			return (this.aFloat4702 + (f * this.aFloat4705 + (this.aFloat4711 * f_48_ + this.aFloat4712 * f_47_)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.Q(" + f + ',' + f_47_ + ',' + f_48_ + ',' + i + ')'));
		}
	}

	public static void method2127(int i) {
		try {
			if (i >= -30)
				method2127(5);
			anIntArray4707 = null;
			aClass207_4715 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.R(" + i + ')');
		}
	}

	final float[] method2128(int i, float[] fs) {
		try {
			fs[1] = this.aFloat4711;
			fs[9] = this.aFloat4713;
			fs[6] = this.aFloat4710;
			fs[14] = 0.0F;
			fs[7] = this.aFloat4709;
			if (i <= 107)
				return null;
			fs[3] = this.aFloat4702;
			fs[11] = this.aFloat4703;
			fs[10] = this.aFloat4704;
			fs[0] = this.aFloat4712;
			fs[2] = this.aFloat4705;
			fs[12] = 0.0F;
			fs[8] = this.aFloat4708;
			fs[4] = this.aFloat4714;
			fs[15] = 1.0F;
			fs[13] = 0.0F;
			fs[5] = this.aFloat4706;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.E(" + i + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2129(float[] fs, int i) {
		try {
			fs[3] = this.aFloat4702;
			fs[5] = this.aFloat4706;
			fs[i] = this.aFloat4714;
			fs[7] = this.aFloat4709;
			fs[0] = this.aFloat4712;
			fs[1] = this.aFloat4711;
			fs[6] = this.aFloat4710;
			fs[2] = this.aFloat4705;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.KA(" + (fs != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2092(Class111 class111) {
		try {
			Class111_Sub3 class111_sub3_49_ = (Class111_Sub3) class111;
			this.aFloat4708 = class111_sub3_49_.aFloat4708;
			this.aFloat4710 = class111_sub3_49_.aFloat4710;
			this.aFloat4705 = class111_sub3_49_.aFloat4705;
			this.aFloat4702 = class111_sub3_49_.aFloat4702;
			this.aFloat4704 = class111_sub3_49_.aFloat4704;
			this.aFloat4709 = class111_sub3_49_.aFloat4709;
			this.aFloat4712 = class111_sub3_49_.aFloat4712;
			this.aFloat4703 = class111_sub3_49_.aFloat4703;
			this.aFloat4714 = class111_sub3_49_.aFloat4714;
			this.aFloat4706 = class111_sub3_49_.aFloat4706;
			this.aFloat4713 = class111_sub3_49_.aFloat4713;
			this.aFloat4711 = class111_sub3_49_.aFloat4711;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.H(" + (class111 != null ? "{...}" : "null") + ')');
		}
	}

	final void method2093(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		try {
			float f = Class64_Sub5.aFloatArray3653[0x3fff & i_52_];
			float f_55_ = Class64_Sub5.aFloatArray3651[i_52_ & 0x3fff];
			float f_56_ = Class64_Sub5.aFloatArray3653[0x3fff & i_53_];
			float f_57_ = Class64_Sub5.aFloatArray3651[i_53_ & 0x3fff];
			float f_58_ = Class64_Sub5.aFloatArray3653[i_54_ & 0x3fff];
			float f_59_ = Class64_Sub5.aFloatArray3651[i_54_ & 0x3fff];
			float f_60_ = f_55_ * f_58_;
			float f_61_ = f_59_ * f_55_;
			this.aFloat4706 = f_58_ * f;
			this.aFloat4712 = f_56_ * f_58_ + f_61_ * f_57_;
			this.aFloat4710 = f_60_ * f_56_ + f_57_ * f_59_;
			this.aFloat4708 = f * f_57_;
			this.aFloat4711 = f_59_ * f;
			this.aFloat4713 = -f_55_;
			this.aFloat4714 = f_60_ * f_57_ + f_59_ * -f_56_;
			this.aFloat4705 = f_61_ * f_56_ + f_58_ * -f_57_;
			this.aFloat4704 = f * f_56_;
			this.aFloat4702 = (-(this.aFloat4705 * (float) i_51_) + (-(this.aFloat4711 * (float) i_50_) + this.aFloat4712 * (float) -i));
			this.aFloat4709 = (this.aFloat4714 * (float) -i - (float) i_50_ * this.aFloat4706 - (float) i_51_ * this.aFloat4710);
			this.aFloat4703 = (-(this.aFloat4704 * (float) i_51_) + ((float) -i * this.aFloat4708 - this.aFloat4713 * (float) i_50_));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.U(" + i + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ')'));
		}
	}

	final void method2130(Class111 class111, Class111 class111_62_) {
		try {
			Class111_Sub3 class111_sub3_63_ = (Class111_Sub3) class111;
			Class111_Sub3 class111_sub3_64_ = (Class111_Sub3) class111_62_;
			this.aFloat4712 = ((class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4712) + (class111_sub3_63_.aFloat4711 * class111_sub3_64_.aFloat4714) + (class111_sub3_63_.aFloat4705 * class111_sub3_64_.aFloat4708));
			this.aFloat4714 = ((class111_sub3_64_.aFloat4708 * class111_sub3_63_.aFloat4710) + ((class111_sub3_64_.aFloat4712 * class111_sub3_63_.aFloat4714) + (class111_sub3_63_.aFloat4706 * class111_sub3_64_.aFloat4714)));
			this.aFloat4708 = ((class111_sub3_63_.aFloat4713 * class111_sub3_64_.aFloat4714) + (class111_sub3_63_.aFloat4708 * class111_sub3_64_.aFloat4712) + (class111_sub3_63_.aFloat4704 * class111_sub3_64_.aFloat4708));
			this.aFloat4711 = ((class111_sub3_63_.aFloat4705 * class111_sub3_64_.aFloat4713) + ((class111_sub3_64_.aFloat4706 * class111_sub3_63_.aFloat4711) + (class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4711)));
			this.aFloat4706 = ((class111_sub3_63_.aFloat4714 * class111_sub3_64_.aFloat4711) + (class111_sub3_64_.aFloat4706 * class111_sub3_63_.aFloat4706) + (class111_sub3_63_.aFloat4710 * class111_sub3_64_.aFloat4713));
			this.aFloat4713 = ((class111_sub3_64_.aFloat4706 * class111_sub3_63_.aFloat4713) + (class111_sub3_63_.aFloat4708 * class111_sub3_64_.aFloat4711) + (class111_sub3_63_.aFloat4704 * class111_sub3_64_.aFloat4713));
			this.aFloat4705 = ((class111_sub3_63_.aFloat4705 * class111_sub3_64_.aFloat4704) + ((class111_sub3_64_.aFloat4710 * class111_sub3_63_.aFloat4711) + (class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4705)));
			this.aFloat4710 = ((class111_sub3_63_.aFloat4706 * class111_sub3_64_.aFloat4710) + (class111_sub3_63_.aFloat4714 * class111_sub3_64_.aFloat4705) + (class111_sub3_64_.aFloat4704 * class111_sub3_63_.aFloat4710));
			this.aFloat4702 = (class111_sub3_63_.aFloat4702 + ((class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4702) + (class111_sub3_64_.aFloat4709 * class111_sub3_63_.aFloat4711) + (class111_sub3_64_.aFloat4703 * class111_sub3_63_.aFloat4705)));
			this.aFloat4704 = ((class111_sub3_64_.aFloat4704 * class111_sub3_63_.aFloat4704) + ((class111_sub3_63_.aFloat4708 * class111_sub3_64_.aFloat4705) + (class111_sub3_64_.aFloat4710 * class111_sub3_63_.aFloat4713)));
			this.aFloat4709 = ((class111_sub3_64_.aFloat4703 * class111_sub3_63_.aFloat4710) + ((class111_sub3_63_.aFloat4714 * class111_sub3_64_.aFloat4702) + (class111_sub3_64_.aFloat4709 * class111_sub3_63_.aFloat4706)) + class111_sub3_63_.aFloat4709);
			this.aFloat4703 = ((class111_sub3_64_.aFloat4703 * class111_sub3_63_.aFloat4704) + ((class111_sub3_63_.aFloat4713 * class111_sub3_64_.aFloat4709) + (class111_sub3_64_.aFloat4702 * class111_sub3_63_.aFloat4708)) + class111_sub3_63_.aFloat4703);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.GA(" + (class111 != null ? "{...}" : "null") + ',' + (class111_62_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2131(float f, boolean bool, int i, int i_65_, float f_66_, float f_67_, int i_68_) {
		try {
			if (bool == false) {
				if (i_68_ == 0) {
					this.aFloat4709 = (float) -i_65_ + f_66_;
					this.aFloat4706 = (float) (i_65_ * 2);
					this.aFloat4702 = f - (float) i;
					this.aFloat4703 = f_67_;
					this.aFloat4714 = this.aFloat4708 = this.aFloat4711 = this.aFloat4713 = this.aFloat4705 = this.aFloat4710 = 0.0F;
					this.aFloat4704 = 1.0F;
					this.aFloat4712 = (float) (i * 2);
				} else {
					float f_69_ = Class64_Sub5.aFloatArray3653[0x3fff & i_68_];
					float f_70_ = Class64_Sub5.aFloatArray3651[i_68_ & 0x3fff];
					this.aFloat4703 = f_67_;
					this.aFloat4704 = 1.0F;
					this.aFloat4706 = (float) i_65_ * (2.0F * f_69_);
					this.aFloat4709 = ((float) (2 * i_65_) * (-0.5F * f_70_ - 0.5F * f_69_) + f_66_);
					this.aFloat4708 = this.aFloat4713 = this.aFloat4705 = this.aFloat4710 = 0.0F;
					this.aFloat4702 = f + (0.5F * f_70_ - f_69_ * 0.5F) * (float) (i * 2);
					this.aFloat4711 = (float) i_65_ * (-2.0F * f_70_);
					this.aFloat4714 = (float) i * (2.0F * f_70_);
					this.aFloat4712 = (float) i * (f_69_ * 2.0F);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.WA(" + f + ',' + bool + ',' + i + ',' + i_65_ + ',' + f_66_ + ',' + f_67_ + ',' + i_68_ + ')'));
		}
	}

	final void method2132(byte i, Class111 class111) {
		try {
			Class111_Sub3 class111_sub3_71_ = (Class111_Sub3) class111;
			this.aFloat4712 = class111_sub3_71_.aFloat4712;
			this.aFloat4711 = class111_sub3_71_.aFloat4714;
			this.aFloat4705 = class111_sub3_71_.aFloat4708;
			this.aFloat4714 = class111_sub3_71_.aFloat4711;
			this.aFloat4710 = class111_sub3_71_.aFloat4713;
			this.aFloat4706 = class111_sub3_71_.aFloat4706;
			int i_72_ = -96 / ((i - -6) / 40);
			this.aFloat4708 = class111_sub3_71_.aFloat4705;
			this.aFloat4704 = class111_sub3_71_.aFloat4704;
			this.aFloat4713 = class111_sub3_71_.aFloat4710;
			this.aFloat4702 = -((this.aFloat4712 * class111_sub3_71_.aFloat4702) + (this.aFloat4711 * class111_sub3_71_.aFloat4709) + (class111_sub3_71_.aFloat4703 * this.aFloat4705));
			this.aFloat4709 = -((class111_sub3_71_.aFloat4703 * this.aFloat4710) + ((class111_sub3_71_.aFloat4709 * this.aFloat4706) + (class111_sub3_71_.aFloat4702 * this.aFloat4714)));
			this.aFloat4703 = -((class111_sub3_71_.aFloat4702 * this.aFloat4708) + (class111_sub3_71_.aFloat4709 * this.aFloat4713) + (this.aFloat4704 * class111_sub3_71_.aFloat4703));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.DA(" + i + ',' + (class111 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2105(int i) {
		try {
			float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			float f_73_ = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			float f_74_ = this.aFloat4714;
			float f_75_ = this.aFloat4706;
			float f_76_ = this.aFloat4710;
			this.aFloat4714 = f_74_ * f - f_73_ * this.aFloat4708;
			float f_77_ = this.aFloat4709;
			this.aFloat4708 = this.aFloat4708 * f + f_74_ * f_73_;
			this.aFloat4706 = f * f_75_ - this.aFloat4713 * f_73_;
			this.aFloat4713 = this.aFloat4713 * f + f_75_ * f_73_;
			this.aFloat4710 = -(f_73_ * this.aFloat4704) + f * f_76_;
			this.aFloat4704 = f_73_ * f_76_ + this.aFloat4704 * f;
			this.aFloat4709 = -(f_73_ * this.aFloat4703) + f_77_ * f;
			this.aFloat4703 = f_73_ * f_77_ + f * this.aFloat4703;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.O(" + i + ')');
		}
	}

	final void method2097(int i) {
		try {
			float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			float f_78_ = Class64_Sub5.aFloatArray3651[0x3fff & i];
			float f_79_ = this.aFloat4712;
			float f_80_ = this.aFloat4711;
			float f_81_ = this.aFloat4705;
			this.aFloat4712 = f_79_ * f + f_78_ * this.aFloat4708;
			float f_82_ = this.aFloat4702;
			this.aFloat4711 = this.aFloat4713 * f_78_ + f_80_ * f;
			this.aFloat4708 = this.aFloat4708 * f - f_79_ * f_78_;
			this.aFloat4713 = f * this.aFloat4713 - f_78_ * f_80_;
			this.aFloat4705 = f * f_81_ + f_78_ * this.aFloat4704;
			this.aFloat4704 = f * this.aFloat4704 - f_78_ * f_81_;
			this.aFloat4702 = this.aFloat4703 * f_78_ + f * f_82_;
			this.aFloat4703 = -(f_82_ * f_78_) + this.aFloat4703 * f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.RA(" + i + ')');
		}
	}

	final void method2100(int i, int i_83_, int i_84_) {
		try {
			this.aFloat4712 = this.aFloat4706 = this.aFloat4704 = 1.0F;
			this.aFloat4709 = (float) i_83_;
			this.aFloat4703 = (float) i_84_;
			this.aFloat4714 = this.aFloat4708 = this.aFloat4711 = this.aFloat4713 = this.aFloat4705 = this.aFloat4710 = 0.0F;
			this.aFloat4702 = (float) i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.SA(" + i + ',' + i_83_ + ',' + i_84_ + ')'));
		}
	}

	static final Class142 method2133(byte i) {
		try {
			if (i != -20)
				anInt4701 = -103;
			try {
				return (Class142) Class.forName("Class142_Sub1").newInstance();
			} catch (Throwable throwable) {
				return new Class142_Sub2();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.OA(" + i + ')');
		}
	}

	final void method2104(int i) {
		try {
			this.aFloat4704 = 1.0F;
			this.aFloat4712 = this.aFloat4706 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			this.aFloat4714 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			this.aFloat4705 = this.aFloat4702 = this.aFloat4710 = this.aFloat4709 = this.aFloat4708 = this.aFloat4713 = this.aFloat4703 = 0.0F;
			this.aFloat4711 = -this.aFloat4714;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.HA(" + i + ')');
		}
	}

	final void method2134(int i, float f, float f_85_, float[] fs, float f_86_) {
		try {
			fs[0] = (f_85_ * this.aFloat4705 + (this.aFloat4711 * f_86_ + f * this.aFloat4712));
			fs[2] = (f * this.aFloat4708 + f_86_ * this.aFloat4713 + this.aFloat4704 * f_85_);
			if (i != -19890)
				method2121((byte) -27, null);
			fs[1] = (this.aFloat4710 * f_85_ + (this.aFloat4714 * f + f_86_ * this.aFloat4706));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.I(" + i + ',' + f + ',' + f_85_ + ',' + (fs != null ? "{...}" : "null") + ',' + f_86_ + ')'));
		}
	}

	final float method2135(float f, float f_87_, float f_88_, boolean bool) {
		try {
			if (bool != false)
				method2140(null, 53);
			return (this.aFloat4703 + (this.aFloat4704 * f_87_ + (this.aFloat4713 * f + this.aFloat4708 * f_88_)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.V(" + f + ',' + f_87_ + ',' + f_88_ + ',' + bool + ')'));
		}
	}

	final void method2136(boolean bool) {
		try {
			this.aFloat4714 = -this.aFloat4714;
			this.aFloat4713 = -this.aFloat4713;
			this.aFloat4706 = -this.aFloat4706;
			this.aFloat4704 = -this.aFloat4704;
			this.aFloat4708 = -this.aFloat4708;
			this.aFloat4709 = -this.aFloat4709;
			if (bool != false)
				anInt4701 = -32;
			this.aFloat4703 = -this.aFloat4703;
			this.aFloat4710 = -this.aFloat4710;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.EA(" + bool + ')');
		}
	}

	final Class111 method2102() {
		try {
			Class111_Sub3 class111_sub3_89_ = new Class111_Sub3();
			class111_sub3_89_.aFloat4703 = this.aFloat4703;
			class111_sub3_89_.aFloat4708 = this.aFloat4708;
			class111_sub3_89_.aFloat4712 = this.aFloat4712;
			class111_sub3_89_.aFloat4709 = this.aFloat4709;
			class111_sub3_89_.aFloat4704 = this.aFloat4704;
			class111_sub3_89_.aFloat4710 = this.aFloat4710;
			class111_sub3_89_.aFloat4713 = this.aFloat4713;
			class111_sub3_89_.aFloat4714 = this.aFloat4714;
			class111_sub3_89_.aFloat4711 = this.aFloat4711;
			class111_sub3_89_.aFloat4705 = this.aFloat4705;
			class111_sub3_89_.aFloat4702 = this.aFloat4702;
			class111_sub3_89_.aFloat4706 = this.aFloat4706;
			return class111_sub3_89_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.TA(" + ')');
		}
	}

	final void method2137(float f, byte i, float f_90_, float f_91_) {
		do {
			try {
				this.aFloat4712 = f_90_;
				this.aFloat4714 = 0.0F;
				this.aFloat4705 = 0.0F;
				this.aFloat4710 = 0.0F;
				this.aFloat4703 = 0.0F;
				this.aFloat4713 = 0.0F;
				this.aFloat4711 = 0.0F;
				this.aFloat4704 = f_91_;
				this.aFloat4706 = f;
				this.aFloat4709 = 0.0F;
				this.aFloat4702 = 0.0F;
				this.aFloat4708 = 0.0F;
				if (i < -108)
					break;
				method2126(0.43629217F, 1.0146681F, -0.31062412F, 60);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("og.W(" + f + ',' + i + ',' + f_90_ + ',' + f_91_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2138(float f, float f_92_, float f_93_, int i) {
		do {
			try {
				this.aFloat4708 *= f;
				this.aFloat4706 *= f_92_;
				this.aFloat4703 *= f;
				this.aFloat4705 *= f_93_;
				this.aFloat4712 *= f_93_;
				this.aFloat4702 *= f_93_;
				this.aFloat4711 *= f_93_;
				this.aFloat4704 *= f;
				this.aFloat4714 *= f_92_;
				this.aFloat4713 *= f;
				this.aFloat4710 *= f_92_;
				this.aFloat4709 *= f_92_;
				if (i <= -47)
					break;
				anInt4701 = -90;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("og.T(" + f + ',' + f_92_ + ',' + f_93_ + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2106(int i, int i_94_, int i_95_) {
		try {
			this.aFloat4702 += (float) i;
			this.aFloat4703 += (float) i_95_;
			this.aFloat4709 += (float) i_94_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.G(" + i + ',' + i_94_ + ',' + i_95_ + ')'));
		}
	}

	final void method2099(int i, int i_96_, int i_97_, int[] is) {
		try {
			is[0] = (int) ((float) i * this.aFloat4712 + this.aFloat4711 * (float) i_96_ + this.aFloat4705 * (float) i_97_);
			is[2] = (int) ((float) i_97_ * this.aFloat4704 + ((float) i * this.aFloat4708 + (this.aFloat4713 * (float) i_96_)));
			is[1] = (int) ((float) i_96_ * this.aFloat4706 + this.aFloat4714 * (float) i + this.aFloat4710 * (float) i_97_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.MA(" + i + ',' + i_96_ + ',' + i_97_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final float method2139(float f, float f_98_, float f_99_, boolean bool) {
		try {
			if (bool != true)
				return -0.64322424F;
			return (f * this.aFloat4706 + this.aFloat4714 * f_98_ + this.aFloat4710 * f_99_ + this.aFloat4709);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.BA(" + f + ',' + f_98_ + ',' + f_99_ + ',' + bool + ')'));
		}
	}

	final void method2140(Class111 class111, int i) {
		try {
			Class111_Sub3 class111_sub3_100_ = (Class111_Sub3) class111;
			this.aFloat4711 = class111_sub3_100_.aFloat4711;
			this.aFloat4708 = class111_sub3_100_.aFloat4708;
			this.aFloat4705 = class111_sub3_100_.aFloat4705;
			this.aFloat4703 = 0.0F;
			this.aFloat4702 = 0.0F;
			this.aFloat4710 = class111_sub3_100_.aFloat4710;
			this.aFloat4714 = class111_sub3_100_.aFloat4714;
			this.aFloat4709 = (float) i;
			this.aFloat4706 = class111_sub3_100_.aFloat4706;
			this.aFloat4712 = class111_sub3_100_.aFloat4712;
			this.aFloat4704 = class111_sub3_100_.aFloat4704;
			this.aFloat4713 = class111_sub3_100_.aFloat4713;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.A(" + (class111 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2108(int[] is) {
		try {
			float f = -this.aFloat4702 + (float) is[0];
			float f_101_ = (float) is[1] - this.aFloat4709;
			float f_102_ = -this.aFloat4703 + (float) is[2];
			is[1] = (int) (f_101_ * this.aFloat4706 + this.aFloat4711 * f + this.aFloat4713 * f_102_);
			is[2] = (int) (this.aFloat4704 * f_102_ + (this.aFloat4705 * f + f_101_ * this.aFloat4710));
			is[0] = (int) (this.aFloat4708 * f_102_ + (f_101_ * this.aFloat4714 + f * this.aFloat4712));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.LA(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	public Class111_Sub3() {
		try {
			method2091();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.<init>(" + ')');
		}
	}

	final void method2141(int i, float f, float f_103_, float f_104_) {
		try {
			if (i >= -90)
				anIntArray4707 = null;
			this.aFloat4702 += f_104_;
			this.aFloat4703 += f_103_;
			this.aFloat4709 += f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.L(" + i + ',' + f + ',' + f_103_ + ',' + f_104_ + ')'));
		}
	}

	final void method2091() {
		try {
			this.aFloat4714 = this.aFloat4708 = this.aFloat4711 = this.aFloat4713 = this.aFloat4705 = this.aFloat4710 = this.aFloat4702 = this.aFloat4709 = this.aFloat4703 = 0.0F;
			this.aFloat4712 = this.aFloat4706 = this.aFloat4704 = 1.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.CA(" + ')');
		}
	}
}
