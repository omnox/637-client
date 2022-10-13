/* Class98_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub37 extends Node {
	private Class98_Sub5 aClass98_Sub5_4163;
	private ha_Sub1 aHa_Sub1_4164;
	private float[][] aFloatArrayArray4165;
	private Class98_Sub22_Sub2 aClass98_Sub22_Sub2_4166;
	private int anInt4167;
	static OutgoingOpcode aClass171_4168 = new OutgoingOpcode(80, 3);
	private Interface8 anInterface8_4169;
	private RSByteBuffer aClass98_Sub22_4170;
	private float[][] aFloatArrayArray4171;
	private int anInt4172;
	private int anInt4173;
	private int anInt4174;
	private int anInt4175;
	private Interface16 anInterface16_4176;
	private float[][] aFloatArrayArray4177;
	static Class225 aClass225_4178;
	private Class377 aClass377_4179;
	private Class104 aClass104_4180;
	private int anInt4181;
	private s_Sub1 aS_Sub1_4182;
	private Class104 aClass104_4183;
	static int anInt4184;
	static ha aHa4185;

	static final void method1460(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, float[] fs, float f, int i_5_, int i_6_, float f_7_, float[] fs_8_) {
		try {
			i_4_ -= i_3_;
			i_2_ -= i_0_;
			i -= i_6_;
			float f_9_ = (fs[0] * (float) i + (float) i_4_ * fs[1] + (float) i_2_ * fs[2]);
			float f_10_ = (fs[5] * (float) i_2_ + ((float) i_4_ * fs[4] + fs[3] * (float) i));
			float f_11_ = ((float) i_4_ * fs[7] + fs[6] * (float) i + (float) i_2_ * fs[i_1_]);
			float f_12_ = (((float) Math.atan2(f_9_, f_11_) / 6.2831855F) + 0.5F);
			if (f != 1.0F)
				f_12_ *= f;
			float f_13_ = 0.5F + f_10_ + f_7_;
			if (i_5_ == 1) {
				float f_14_ = f_12_;
				f_12_ = -f_13_;
				f_13_ = f_14_;
			} else if (i_5_ != 2) {
				if (i_5_ == 3) {
					float f_15_ = f_12_;
					f_12_ = f_13_;
					f_13_ = -f_15_;
				}
			} else {
				f_12_ = -f_12_;
				f_13_ = -f_13_;
			}
			fs_8_[0] = f_12_;
			fs_8_[1] = f_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pp.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (fs != null ? "{...}" : "null") + ',' + f + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + (fs_8_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1461(int i, int i_16_, int i_17_, boolean[][] bools, byte i_18_) {
		try {
			if (anInterface8_4169 != null && anInt4181 <= i_17_ + i_16_ && -i_16_ + i_17_ <= anInt4172 && i_18_ >= 31 && i_16_ + i >= anInt4174 && anInt4173 >= i - i_16_) {
				for (int i_19_ = anInt4174; i_19_ <= anInt4173; i_19_++) {
					for (int i_20_ = anInt4181; i_20_ <= anInt4172; i_20_++) {
						int i_21_ = -i_17_ + i_20_;
						int i_22_ = -i + i_19_;
						if (-i_16_ < i_21_ && i_16_ > i_21_ && i_22_ > -i_16_ && i_16_ > i_22_ && bools[i_21_ + i_16_][i_16_ + i_22_]) {
							aHa_Sub1_4164.method1882(((int) (255.0F * aClass98_Sub5_4163.method956(false)) << 24), -120);
							aHa_Sub1_4164.method1868(aClass104_4183, null, null, aClass104_4180, 0);
							aHa_Sub1_4164.method1865(anInt4167, 4, anInterface8_4169, false, 0);
							return;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pp.B(" + i + ',' + i_16_ + ',' + i_17_ + ',' + (bools != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	private final void method1462(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		do {
			try {
				long l = -1L;
				int i_29_ = i_26_ - -(i_27_ << aS_Sub1_4182.anInt2200);
				int i_30_ = (i_25_ << aS_Sub1_4182.anInt2200) + i_23_;
				int i_31_ = aS_Sub1_4182.method3417(i_29_, i_30_, true);
				if ((i_26_ & 0x7f) == 0 || (i_23_ & 0x7f) == 0) {
					l = ((0xffffL & (long) i_30_) << 16 | 0xffffL & (long) i_29_);
					Node class98 = aClass377_4179.method3990(l, -1);
					if (class98 != null) {
						method1464(1522918928, (((Class98_Sub40) class98).aShort4191));
						break;
					}
				}
				short i_32_ = (short) anInt4175++;
				if (l != -1L)
					aClass377_4179.method3996(new Class98_Sub40(i_32_), l, -1);
				float f;
				float f_33_;
				float f_34_;
				if (i_26_ != 0 || i_23_ != 0) {
					if (aS_Sub1_4182.anInt2206 != i_26_ || i_23_ != 0) {
						if ((aS_Sub1_4182.anInt2206 != i_26_) || i_23_ != aS_Sub1_4182.anInt2206) {
							if (i_26_ != 0 || aS_Sub1_4182.anInt2206 != i_23_) {
								float f_35_ = ((float) i_26_ / (float) aS_Sub1_4182.anInt2206);
								float f_36_ = ((float) i_23_ / (float) aS_Sub1_4182.anInt2206);
								float f_37_ = aFloatArrayArray4165[i_28_][i_24_];
								float f_38_ = aFloatArrayArray4171[i_28_][i_24_];
								float f_39_ = aFloatArrayArray4177[i_28_][i_24_];
								float f_40_ = aFloatArrayArray4165[1 + i_28_][i_24_];
								float f_41_ = aFloatArrayArray4171[i_28_ + 1][i_24_];
								float f_42_ = aFloatArrayArray4177[1 + i_28_][i_24_];
								f_37_ += (aFloatArrayArray4165[i_28_][i_24_ - -1] - f_37_) * f_35_;
								f_41_ += f_35_ * (-f_41_ + (aFloatArrayArray4171[i_28_ - -1][i_24_ + 1]));
								f_39_ += (-f_39_ + (aFloatArrayArray4177[i_28_][i_24_ + 1])) * f_35_;
								f_40_ += f_35_ * (-f_40_ + (aFloatArrayArray4165[1 + i_28_][i_24_ + 1]));
								f_38_ += f_35_ * ((aFloatArrayArray4171[i_28_][i_24_ - -1]) - f_38_);
								f_42_ += f_35_ * ((aFloatArrayArray4177[1 + i_28_][i_24_ - -1]) - f_42_);
								f_33_ = (-f_38_ + f_41_) * f_36_ + f_38_;
								f = f_37_ + (-f_37_ + f_40_) * f_36_;
								f_34_ = f_39_ + f_36_ * (f_42_ - f_39_);
							} else {
								f_33_ = aFloatArrayArray4171[i_28_][1 + i_24_];
								f_34_ = aFloatArrayArray4177[i_28_][i_24_ + 1];
								f = aFloatArrayArray4165[i_28_][1 + i_24_];
							}
						} else {
							f_33_ = aFloatArrayArray4171[1 + i_28_][1 + i_24_];
							f = aFloatArrayArray4165[1 + i_28_][i_24_ + 1];
							f_34_ = aFloatArrayArray4177[1 + i_28_][1 + i_24_];
						}
					} else {
						f_33_ = aFloatArrayArray4171[i_28_ - -1][i_24_];
						f = aFloatArrayArray4165[1 + i_28_][i_24_];
						f_34_ = aFloatArrayArray4177[1 + i_28_][i_24_];
					}
				} else {
					f = aFloatArrayArray4165[i_28_][i_24_];
					f_33_ = aFloatArrayArray4171[i_28_][i_24_];
					f_34_ = aFloatArrayArray4177[i_28_][i_24_];
				}
				float f_43_ = (float) (aClass98_Sub5_4163.method954(7019) + -i_29_);
				float f_44_ = (float) (-i_31_ + aClass98_Sub5_4163.method963((byte) 73));
				float f_45_ = (float) (aClass98_Sub5_4163.method962(28699) - i_30_);
				float f_46_ = (float) Math.sqrt(f_43_ * f_43_ + f_44_ * f_44_ + f_45_ * f_45_);
				float f_47_ = 1.0F / f_46_;
				f_44_ *= f_47_;
				f_45_ *= f_47_;
				f_43_ *= f_47_;
				float f_48_ = f_46_ / (float) aClass98_Sub5_4163.method958(127);
				float f_49_ = 1.0F - f_48_ * f_48_;
				if (f_49_ < 0.0F)
					f_49_ = 0.0F;
				float f_50_ = f_34_ * f_45_ + (f_33_ * f_44_ + f * f_43_);
				if (f_50_ < 0.0F)
					f_50_ = 0.0F;
				float f_51_ = 2.0F * (f_49_ * f_50_);
				if (f_51_ > 1.0F)
					f_51_ = 1.0F;
				int i_52_ = aClass98_Sub5_4163.method961((byte) -78);
				int i_53_ = (int) ((float) ((i_52_ & 0xff1301) >> 16) * f_51_);
				if (i_53_ > 255)
					i_53_ = 255;
				int i_54_ = (int) (f_51_ * (float) (0xff & i_52_ >> 8));
				if (i_54_ > 255)
					i_54_ = 255;
				int i_55_ = (int) (f_51_ * (float) (i_52_ & 0xff));
				if (i_55_ > 255)
					i_55_ = 255;
				if (!aHa_Sub1_4164.aBoolean4397) {
					aClass98_Sub22_Sub2_4166.method1265((byte) -52, (float) i_29_);
					aClass98_Sub22_Sub2_4166.method1265((byte) -52, (float) i_31_);
					aClass98_Sub22_Sub2_4166.method1265((byte) -52, (float) i_30_);
				} else {
					aClass98_Sub22_Sub2_4166.method1264((byte) -126, (float) i_29_);
					aClass98_Sub22_Sub2_4166.method1264((byte) 7, (float) i_31_);
					aClass98_Sub22_Sub2_4166.method1264((byte) -116, (float) i_30_);
				}
				aClass98_Sub22_Sub2_4166.writeByte(i_53_);
				aClass98_Sub22_Sub2_4166.writeByte(i_54_);
				aClass98_Sub22_Sub2_4166.writeByte(i_55_);
				aClass98_Sub22_Sub2_4166.writeByte(255);
				method1464(1522918928, i_32_);
				if (i >= 85)
					break;
				method1463((byte) -76);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pp.E(" + i + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1463(byte i) {
		try {
			aClass171_4168 = null;
			if (i != 119)
				aClass171_4168 = null;
			aClass225_4178 = null;
			aHa4185 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pp.A(" + i + ')');
		}
	}

	private final void method1464(int i, short i_56_) {
		try {
			do {
				if (!aHa_Sub1_4164.aBoolean4397) {
					aClass98_Sub22_4170.method1247(i_56_, 4);
					if (!client.aBoolean3553)
						break;
				}
				aClass98_Sub22_4170.writeShort(i_56_);
			} while (false);
			if (i != 1522918928)
				aClass171_4168 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pp.D(" + i + ',' + i_56_ + ')');
		}
	}

	Class98_Sub37(ha_Sub1 var_ha_Sub1, s_Sub1 var_s_Sub1, Class98_Sub5 class98_sub5, int[] is) {
		try {
			aHa_Sub1_4164 = var_ha_Sub1;
			aS_Sub1_4182 = var_s_Sub1;
			aClass98_Sub5_4163 = class98_sub5;
			int i = (aClass98_Sub5_4163.method958(-33) - (var_s_Sub1.anInt2206 >> 1));
			anInt4181 = (aClass98_Sub5_4163.method954(7019) - i >> var_s_Sub1.anInt2200);
			anInt4172 = (aClass98_Sub5_4163.method954(7019) - -i >> var_s_Sub1.anInt2200);
			anInt4174 = (aClass98_Sub5_4163.method962(28699) + -i >> var_s_Sub1.anInt2200);
			anInt4173 = (i + aClass98_Sub5_4163.method962(28699) >> var_s_Sub1.anInt2200);
			int i_57_ = anInt4172 + (-anInt4181 - -1);
			int i_58_ = -anInt4174 + anInt4173 + 1;
			aFloatArrayArray4165 = new float[1 + i_57_][1 + i_58_];
			aFloatArrayArray4171 = new float[1 + i_57_][1 + i_58_];
			aFloatArrayArray4177 = new float[i_57_ + 1][1 + i_58_];
			for (int i_59_ = 0; i_59_ <= i_58_; i_59_++) {
				int i_60_ = anInt4174 + i_59_;
				if (i_60_ > 0 && aS_Sub1_4182.anInt2204 - 1 > i_60_) {
					for (int i_61_ = 0; i_57_ >= i_61_; i_61_++) {
						int i_62_ = i_61_ + anInt4181;
						if (i_62_ > 0 && i_62_ < -1 + aS_Sub1_4182.anInt2203) {
							int i_63_ = (var_s_Sub1.method3420(i_60_, -12639, i_62_ + 1) + -var_s_Sub1.method3420(i_60_, -12639, -1 + i_62_));
							int i_64_ = (var_s_Sub1.method3420(i_60_ + 1, -12639, i_62_) + -var_s_Sub1.method3420(i_60_ - 1, -12639, i_62_));
							float f = (float) (1.0 / (Math.sqrt(i_64_ * i_64_ + 65536 + i_63_ * i_63_)));
							aFloatArrayArray4165[i_61_][i_59_] = (float) i_63_ * f;
							aFloatArrayArray4171[i_61_][i_59_] = -256.0F * f;
							aFloatArrayArray4177[i_61_][i_59_] = (float) i_64_ * f;
						}
					}
				}
			}
			int i_65_ = 0;
			for (int i_66_ = anInt4174; anInt4173 >= i_66_; i_66_++) {
				if (i_66_ >= 0 && var_s_Sub1.anInt2204 > i_66_) {
					for (int i_67_ = anInt4181; i_67_ <= anInt4172; i_67_++) {
						if (i_67_ >= 0 && (i_67_ < var_s_Sub1.anInt2203)) {
							int i_68_ = is[i_65_];
							int[] is_69_ = (var_s_Sub1.anIntArrayArrayArray5210[i_67_][i_66_]);
							if (is_69_ != null && i_68_ != 0) {
								if (i_68_ == 1) {
									int i_70_ = 0;
									while (is_69_.length > i_70_) {
										if (is_69_[i_70_++] != -1 && is_69_[i_70_++] != -1 && (is_69_[i_70_++] != -1))
											anInt4167 += 3;
									}
								} else
									anInt4167 += 3;
							}
						}
						i_65_++;
					}
				} else
					i_65_ += anInt4172 - anInt4181;
			}
			if (anInt4167 > 0) {
				aClass98_Sub22_4170 = new RSByteBuffer(anInt4167 * 2);
				aClass98_Sub22_Sub2_4166 = new Class98_Sub22_Sub2(16 * anInt4167);
				aClass377_4179 = new Class377(Class48.method453(423660257, anInt4167));
				i_65_ = 0;
				int i_71_ = 0;
				for (int i_72_ = anInt4174; anInt4173 >= i_72_; i_72_++) {
					if (i_72_ >= 0 && var_s_Sub1.anInt2204 > i_72_) {
						int i_73_ = 0;
						for (int i_74_ = anInt4181; i_74_ <= anInt4172; i_74_++) {
							if (i_74_ >= 0 && (i_74_ < var_s_Sub1.anInt2203)) {
								int i_75_ = is[i_65_];
								int[] is_76_ = (var_s_Sub1.anIntArrayArrayArray5210[i_74_][i_72_]);
								if (is_76_ != null && i_75_ != 0) {
									if (i_75_ == 1) {
										int[] is_77_ = (var_s_Sub1.anIntArrayArrayArray5192[i_74_][i_72_]);
										int[] is_78_ = (var_s_Sub1.anIntArrayArrayArray5194[i_74_][i_72_]);
										int i_79_ = 0;
										while (i_79_ < is_76_.length) {
											if ((is_76_[i_79_] != -1) && is_76_[1 + i_79_] != -1 && is_76_[2 + i_79_] != -1) {
												method1462(101, is_78_[i_79_], i_71_, i_72_, is_77_[i_79_], i_74_, i_73_);
												i_79_++;
												method1462(97, is_78_[i_79_], i_71_, i_72_, is_77_[i_79_], i_74_, i_73_);
												i_79_++;
												method1462(106, is_78_[i_79_], i_71_, i_72_, is_77_[i_79_], i_74_, i_73_);
												i_79_++;
											} else
												i_79_ += 3;
										}
									} else if (i_75_ != 3) {
										if (i_75_ != 2) {
											if (i_75_ == 5) {
												method1462(122, (var_s_Sub1.anInt2206), i_71_, i_72_, (var_s_Sub1.anInt2206), i_74_, i_73_);
												method1462(90, (var_s_Sub1.anInt2206), i_71_, i_72_, 0, i_74_, i_73_);
												method1462(102, 0, i_71_, i_72_, (var_s_Sub1.anInt2206), i_74_, i_73_);
											} else if (i_75_ == 4) {
												method1462(116, (var_s_Sub1.anInt2206), i_71_, i_72_, 0, i_74_, i_73_);
												method1462(105, 0, i_71_, i_72_, 0, i_74_, i_73_);
												method1462(92, (var_s_Sub1.anInt2206), i_71_, i_72_, (var_s_Sub1.anInt2206), i_74_, i_73_);
											}
										} else {
											method1462(91, 0, i_71_, i_72_, (var_s_Sub1.anInt2206), i_74_, i_73_);
											method1462(122, (var_s_Sub1.anInt2206), i_71_, i_72_, (var_s_Sub1.anInt2206), i_74_, i_73_);
											method1462(120, 0, i_71_, i_72_, 0, i_74_, i_73_);
										}
									} else {
										method1462(117, 0, i_71_, i_72_, 0, i_74_, i_73_);
										method1462(118, 0, i_71_, i_72_, var_s_Sub1.anInt2206, i_74_, i_73_);
										method1462(98, var_s_Sub1.anInt2206, i_71_, i_72_, 0, i_74_, i_73_);
									}
								}
							}
							i_65_++;
							i_73_++;
						}
					} else
						i_65_ += -anInt4181 + anInt4172;
					i_71_++;
				}
				anInterface8_4169 = (aHa_Sub1_4164.method1838(5123, aClass98_Sub22_4170.data, 7, false, aClass98_Sub22_4170.position));
				anInterface16_4176 = aHa_Sub1_4164.method1878((aClass98_Sub22_Sub2_4166.position), false, 16, -55, (aClass98_Sub22_Sub2_4166.data));
				aClass104_4180 = new Class104(anInterface16_4176, 5126, 3, 0);
				aClass104_4183 = new Class104(anInterface16_4176, 5121, 4, 12);
			} else {
				aClass104_4183 = null;
				anInterface8_4169 = null;
				aClass104_4180 = null;
				anInterface16_4176 = null;
			}
			aFloatArrayArray4165 = aFloatArrayArray4171 = aFloatArrayArray4177 = null;
			aClass98_Sub22_Sub2_4166 = null;
			aClass377_4179 = null;
			aClass98_Sub22_4170 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pp.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + (var_s_Sub1 != null ? "{...}" : "null") + ',' + (class98_sub5 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
