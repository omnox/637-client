
/* Class98_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class98_Sub25 extends Node {
	private Interface2_Impl2 anInterface2_Impl2_4009;
	private int anInt4010;
	private int anInt4011;
	private Class98_Sub5 aClass98_Sub5_4012;
	private int anInt4013;
	private int anInt4014;
	private ha_Sub3 aHa_Sub3_4015;
	private Stream aStream4016;
	private Interface2_Impl1 anInterface2_Impl1_4017;
	private int anInt4018;
	private float[][] aFloatArrayArray4019;
	private Stream aStream4020;
	private int anInt4021;
	private Class377 aClass377_4022;
	private float[][] aFloatArrayArray4023;
	static int anInt4024;
	private float[][] aFloatArrayArray4025;
	static String[] aStringArray4026 = new String[200];
	private s_Sub2 aS_Sub2_4027;

	final void method1270(int i, boolean[][] bools, int i_0_, int i_1_, int i_2_) {
		try {
			if (anInterface2_Impl2_4009 != null && i_0_ - -i_2_ >= anInt4010 && anInt4014 >= i_0_ - i_2_ && anInt4013 <= i_1_ - -i_2_ && -i_2_ + i_1_ <= anInt4021) {
				if (i != 0)
					anInt4018 = -100;
				for (int i_3_ = anInt4013; i_3_ <= anInt4021; i_3_++) {
					for (int i_4_ = anInt4010; i_4_ <= anInt4014; i_4_++) {
						int i_5_ = -i_0_ + i_4_;
						int i_6_ = i_3_ - i_1_;
						if (-i_2_ < i_5_ && i_2_ > i_5_ && i_6_ > -i_2_ && i_6_ < i_2_ && bools[i_2_ + i_5_][i_2_ + i_6_]) {
							aHa_Sub3_4015.method1954(4, (byte) (int) (255.0F * aClass98_Sub5_4012.method956(false)));
							aHa_Sub3_4015.method1971(0, true, anInterface2_Impl1_4017);
							aHa_Sub3_4015.method2042((aHa_Sub3_4015.aClass256_4659), (byte) 86);
							aHa_Sub3_4015.method1973(Class336.aClass232_2822, anInt4011, 0, 26810, anInterface2_Impl2_4009, 0, anInt4018 / 3);
							return;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jq.E(" + i + ',' + (bools != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method1271(int i) {
		try {
			aStringArray4026 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jq.A(" + i + ')');
		}
	}

	private final void method1272(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			long l = -1L;
			int i_13_ = i_12_ - -(i_7_ << aS_Sub2_4027.anInt2200);
			int i_14_ = (i_8_ << aS_Sub2_4027.anInt2200) + i_10_;
			int i_15_ = aS_Sub2_4027.method3417(i_13_, i_14_, true);
			if ((0x7f & i_12_) == 0 || (0x7f & i_10_) == 0) {
				l = ((long) i_14_ << 16 & 65535L << 16 | (long) i_13_ & 0xffffL);
				Node class98 = aClass377_4022.method3990(l, -1);
				if (class98 != null) {
					method1273((((Class98_Sub40) class98).aShort4191), -29314);
					return;
				}
			}
			short i_16_ = (short) anInt4011++;
			if (l != -1)
				aClass377_4022.method3996(new Class98_Sub40(i_16_), l, i_9_ + -1);
			float f;
			float f_17_;
			float f_18_;
			if (i_12_ == 0 && i_10_ == 0) {
				f_18_ = aFloatArrayArray4023[i_11_][i];
				f = aFloatArrayArray4025[i_11_][i];
				f_17_ = aFloatArrayArray4019[i_11_][i];
			} else if ((i_12_ != aS_Sub2_4027.anInt2206) || i_10_ != 0) {
				if (i_12_ != aS_Sub2_4027.anInt2206 || i_10_ != aS_Sub2_4027.anInt2206) {
					if (i_12_ != 0 || aS_Sub2_4027.anInt2206 != i_10_) {
						float f_19_ = ((float) i_12_ / (float) aS_Sub2_4027.anInt2206);
						float f_20_ = ((float) i_10_ / (float) aS_Sub2_4027.anInt2206);
						float f_21_ = aFloatArrayArray4019[i_11_][i];
						float f_22_ = aFloatArrayArray4025[i_11_][i];
						float f_23_ = aFloatArrayArray4023[i_11_][i];
						float f_24_ = aFloatArrayArray4019[1 + i_11_][i];
						float f_25_ = aFloatArrayArray4025[1 + i_11_][i];
						f_23_ += f_19_ * (-f_23_ + aFloatArrayArray4023[i_11_][1 + i]);
						f_22_ += f_19_ * (-f_22_ + aFloatArrayArray4025[i_11_][1 + i]);
						f_21_ += f_19_ * (aFloatArrayArray4019[i_11_][1 + i] - f_21_);
						float f_26_ = aFloatArrayArray4023[i_11_ + 1][i];
						f_25_ += f_19_ * (-f_25_ + (aFloatArrayArray4025[1 + i_11_][1 + i]));
						f_24_ += (aFloatArrayArray4019[1 + i_11_][1 + i] - f_24_) * f_19_;
						f = f_22_ + f_20_ * (-f_22_ + f_25_);
						f_26_ += f_19_ * (aFloatArrayArray4023[1 + i_11_][1 + i] - f_26_);
						f_17_ = f_21_ + (-f_21_ + f_24_) * f_20_;
						f_18_ = f_23_ + (-f_23_ + f_26_) * f_20_;
					} else {
						f_18_ = aFloatArrayArray4023[i_11_][1 + i];
						f_17_ = aFloatArrayArray4019[i_11_][1 + i];
						f = aFloatArrayArray4025[i_11_][1 + i];
					}
				} else {
					f_18_ = aFloatArrayArray4023[1 + i_11_][i - -1];
					f_17_ = aFloatArrayArray4019[1 + i_11_][1 + i];
					f = aFloatArrayArray4025[1 + i_11_][i + 1];
				}
			} else {
				f = aFloatArrayArray4025[i_11_ - -1][i];
				f_18_ = aFloatArrayArray4023[1 + i_11_][i];
				f_17_ = aFloatArrayArray4019[i_11_ - -1][i];
			}
			float f_27_ = (float) (aClass98_Sub5_4012.method954(i_9_ + 7019) - i_13_);
			float f_28_ = (float) (-i_15_ + aClass98_Sub5_4012.method963((byte) 103));
			float f_29_ = (float) (aClass98_Sub5_4012.method962(i_9_ ^ 0x701b) + -i_14_);
			float f_30_ = (float) Math.sqrt(f_28_ * f_28_ + f_27_ * f_27_ + f_29_ * f_29_);
			float f_31_ = 1.0F / f_30_;
			f_27_ *= f_31_;
			f_29_ *= f_31_;
			f_28_ *= f_31_;
			float f_32_ = f_30_ / (float) aClass98_Sub5_4012.method958(125);
			float f_33_ = 1.0F - f_32_ * f_32_;
			if (f_33_ < 0.0F)
				f_33_ = 0.0F;
			float f_34_ = f_29_ * f_18_ + (f_27_ * f_17_ + f_28_ * f);
			if ((float) i_9_ > f_34_)
				f_34_ = 0.0F;
			float f_35_ = f_34_ * f_33_ * 2.0F;
			if (f_35_ > 1.0F)
				f_35_ = 1.0F;
			int i_36_ = aClass98_Sub5_4012.method961((byte) -78);
			int i_37_ = (int) (f_35_ * (float) ((i_36_ & 0xffd717) >> 16));
			if (i_37_ > 255)
				i_37_ = 255;
			int i_38_ = (int) ((float) (0xff & i_36_ >> 8) * f_35_);
			if (i_38_ > 255)
				i_38_ = 255;
			int i_39_ = (int) (f_35_ * (float) (i_36_ & 0xff));
			if (i_39_ > 255)
				i_39_ = 255;
			if (Stream.a()) {
				aStream4016.b((float) i_13_);
				aStream4016.b((float) i_15_);
				aStream4016.b((float) i_14_);
			} else {
				aStream4016.a((float) i_13_);
				aStream4016.a((float) i_15_);
				aStream4016.a((float) i_14_);
			}
			if (aHa_Sub3_4015.anInt4580 == 0) {
				aStream4016.e(i_39_);
				aStream4016.e(i_38_);
				aStream4016.e(i_37_);
			} else {
				aStream4016.e(i_37_);
				aStream4016.e(i_38_);
				aStream4016.e(i_39_);
			}
			aStream4016.e(255);
			method1273(i_16_, -29314);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jq.D(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	private final void method1273(short i, int i_40_) {
		do {
			try {
				if (Stream.a()) {
					aStream4020.c(i);
					if (!client.aBoolean3553)
						break;
				}
				aStream4020.d(i);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jq.C(" + i + ',' + i_40_ + ')');
			}
		} while (false);
	}

	static final boolean method1274(int i) {
		try {
			Class75.anInt581++;
			Class76_Sub8.aBoolean3771 = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jq.B(" + i + ')');
		}
	}

	Class98_Sub25(ha_Sub3 var_ha_Sub3, s_Sub2 var_s_Sub2, Class98_Sub5 class98_sub5, int[] is) {
		try {
			aS_Sub2_4027 = var_s_Sub2;
			aHa_Sub3_4015 = var_ha_Sub3;
			aClass98_Sub5_4012 = class98_sub5;
			int i = (aClass98_Sub5_4012.method958(-75) + -(var_s_Sub2.anInt2206 >> 1));
			anInt4010 = (-i + aClass98_Sub5_4012.method954(7019) >> var_s_Sub2.anInt2200);
			anInt4014 = (i + aClass98_Sub5_4012.method954(7019) >> var_s_Sub2.anInt2200);
			anInt4013 = (-i + aClass98_Sub5_4012.method962(28699) >> var_s_Sub2.anInt2200);
			anInt4021 = (aClass98_Sub5_4012.method962(28699) + i >> var_s_Sub2.anInt2200);
			int i_41_ = 1 + (anInt4014 + -anInt4010);
			int i_42_ = 1 + -anInt4013 + anInt4021;
			aFloatArrayArray4023 = new float[1 + i_41_][1 + i_42_];
			aFloatArrayArray4019 = new float[i_41_ + 1][1 + i_42_];
			aFloatArrayArray4025 = new float[1 + i_41_][i_42_ + 1];
			for (int i_43_ = 0; i_42_ >= i_43_; i_43_++) {
				int i_44_ = anInt4013 + i_43_;
				if (i_44_ > 0 && aS_Sub2_4027.anInt2204 + -1 > i_44_) {
					for (int i_45_ = 0; i_41_ >= i_45_; i_45_++) {
						int i_46_ = i_45_ + anInt4010;
						if (i_46_ > 0 && aS_Sub2_4027.anInt2203 - 1 > i_46_) {
							int i_47_ = (var_s_Sub2.method3420(i_44_, -12639, 1 + i_46_) + -var_s_Sub2.method3420(i_44_, -12639, -1 + i_46_));
							int i_48_ = (var_s_Sub2.method3420(1 + i_44_, -12639, i_46_) + -var_s_Sub2.method3420(i_44_ - 1, -12639, i_46_));
							float f = (float) (1.0 / (Math.sqrt(65536 + i_47_ * i_47_ + i_48_ * i_48_)));
							aFloatArrayArray4019[i_45_][i_43_] = (float) i_47_ * f;
							aFloatArrayArray4025[i_45_][i_43_] = f * -256.0F;
							aFloatArrayArray4023[i_45_][i_43_] = (float) i_48_ * f;
						}
					}
				}
			}
			int i_49_ = 0;
			for (int i_50_ = anInt4013; i_50_ <= anInt4021; i_50_++) {
				if (i_50_ < 0 || i_50_ >= var_s_Sub2.anInt2204)
					i_49_ += anInt4014 - anInt4010;
				else {
					for (int i_51_ = anInt4010; anInt4014 >= i_51_; i_51_++) {
						if (i_51_ >= 0 && var_s_Sub2.anInt2203 > i_51_) {
							int i_52_ = is[i_49_];
							int[] is_53_ = (var_s_Sub2.anIntArrayArrayArray5241[i_51_][i_50_]);
							if (is_53_ != null && i_52_ != 0) {
								if (i_52_ == 1) {
									int i_54_ = 0;
									while (is_53_.length > i_54_) {
										if (is_53_[i_54_++] != -1 && is_53_[i_54_++] != -1 && is_53_[i_54_++] != -1)
											anInt4018 += 3;
									}
								} else
									anInt4018 += 3;
							}
						}
						i_49_++;
					}
				}
			}
			if (anInt4018 <= 0) {
				anInterface2_Impl1_4017 = null;
				anInterface2_Impl2_4009 = null;
			} else {
				aClass377_4022 = new Class377(Class48.method453(423660257, anInt4018));
				anInterface2_Impl2_4009 = aHa_Sub3_4015.method1990((byte) 84, false);
				anInterface2_Impl2_4009.method76(anInt4018, 20779);
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = aHa_Sub3_4015.method1947(16 * anInt4018, false, 0);
				aStream4016 = new Stream(nativeheapbuffer);
				for (;;) {
					Buffer buffer = anInterface2_Impl2_4009.method78(true, -90);
					if (buffer != null) {
						aStream4020 = new Stream(buffer);
						i_49_ = 0;
						int i_55_ = 0;
						for (int i_56_ = anInt4013; anInt4021 >= i_56_; i_56_++) {
							if (i_56_ >= 0 && var_s_Sub2.anInt2204 > i_56_) {
								int i_57_ = 0;
								for (int i_58_ = anInt4010; i_58_ <= anInt4014; i_58_++) {
									if (i_58_ >= 0 && (var_s_Sub2.anInt2203 > i_58_)) {
										int i_59_ = is[i_49_];
										int[] is_60_ = (var_s_Sub2.anIntArrayArrayArray5241[i_58_][i_56_]);
										if (is_60_ != null && i_59_ != 0) {
											if (i_59_ != 1) {
												if (i_59_ != 3) {
													if (i_59_ == 2) {
														method1272(i_55_, i_58_, i_56_, 0, 0, i_57_, (var_s_Sub2.anInt2206));
														method1272(i_55_, i_58_, i_56_, 0, (var_s_Sub2.anInt2206), i_57_, (var_s_Sub2.anInt2206));
														method1272(i_55_, i_58_, i_56_, 0, 0, i_57_, 0);
													} else if (i_59_ == 5) {
														method1272(i_55_, i_58_, i_56_, 0, (var_s_Sub2.anInt2206), i_57_, (var_s_Sub2.anInt2206));
														method1272(i_55_, i_58_, i_56_, 0, (var_s_Sub2.anInt2206), i_57_, 0);
														method1272(i_55_, i_58_, i_56_, 0, 0, i_57_, (var_s_Sub2.anInt2206));
													} else if (i_59_ == 4) {
														method1272(i_55_, i_58_, i_56_, 0, (var_s_Sub2.anInt2206), i_57_, 0);
														method1272(i_55_, i_58_, i_56_, 0, 0, i_57_, 0);
														method1272(i_55_, i_58_, i_56_, 0, (var_s_Sub2.anInt2206), i_57_, (var_s_Sub2.anInt2206));
													}
												} else {
													method1272(i_55_, i_58_, i_56_, 0, 0, i_57_, 0);
													method1272(i_55_, i_58_, i_56_, 0, 0, i_57_, (var_s_Sub2.anInt2206));
													method1272(i_55_, i_58_, i_56_, 0, (var_s_Sub2.anInt2206), i_57_, 0);
												}
											} else {
												int[] is_61_ = (var_s_Sub2.anIntArrayArrayArray5226[i_58_][i_56_]);
												int[] is_62_ = (var_s_Sub2.anIntArrayArrayArray5240[i_58_][i_56_]);
												int i_63_ = 0;
												while (is_60_.length > i_63_) {
													if (is_60_[i_63_] != -1 && (is_60_[1 + i_63_] != -1) && (is_60_[2 + i_63_] != -1)) {
														method1272(i_55_, i_58_, i_56_, 0, (is_62_[i_63_]), i_57_, (is_61_[i_63_]));
														i_63_++;
														method1272(i_55_, i_58_, i_56_, 0, (is_62_[i_63_]), i_57_, (is_61_[i_63_]));
														i_63_++;
														method1272(i_55_, i_58_, i_56_, 0, (is_62_[i_63_]), i_57_, (is_61_[i_63_]));
														i_63_++;
													} else
														i_63_ += 3;
												}
											}
										}
									}
									i_57_++;
									i_49_++;
								}
							} else
								i_49_ += -anInt4010 + anInt4014;
							i_55_++;
						}
						aStream4020.c();
						if (anInterface2_Impl2_4009.method79((byte) -96))
							break;
						aStream4016.b(0);
						aClass377_4022.method3994(-64);
					}
				}
				aStream4016.c();
				anInterface2_Impl1_4017 = aHa_Sub3_4015.method2060(false, 65);
				anInterface2_Impl1_4017.method73((byte) -112, anInt4011 * 16, 16, nativeheapbuffer);
			}
			aFloatArrayArray4019 = aFloatArrayArray4025 = aFloatArrayArray4023 = null;
			aStream4016 = null;
			aClass377_4022 = null;
			aStream4020 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jq.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + (var_s_Sub2 != null ? "{...}" : "null") + ',' + (class98_sub5 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
