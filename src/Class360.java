/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class360 {
	private Class98_Sub22_Sub2 aClass98_Sub22_Sub2_3063;
	static String aString3064 = "";
	private float[] aFloatArray3065 = new float[16];
	private Interface16 anInterface16_3066;
	private Class104 aClass104_3067;
	private Class104 aClass104_3068;
	private Class104 aClass104_3069;
	static long aLong3070;
	private int anInt3071;
	private Class246_Sub4_Sub2[][] aClass246_Sub4_Sub2ArrayArray3072;
	private Class246_Sub4_Sub2[][] aClass246_Sub4_Sub2ArrayArray3073;
	private int[] anIntArray3074;
	private int[] anIntArray3075;
	private int anInt3076;
	private int[] anIntArray3077;

	private final void method3904(int i, ha_Sub1 var_ha_Sub1, byte i_0_) {
		do {
			try {
				OpenGL.glGetFloatv(2982, aFloatArray3065, 0);
				float f = aFloatArray3065[0];
				float f_1_ = aFloatArray3065[4];
				float f_2_ = aFloatArray3065[8];
				float f_3_ = aFloatArray3065[1];
				float f_4_ = aFloatArray3065[5];
				float f_5_ = aFloatArray3065[9];
				float f_6_ = f + f_3_;
				float f_7_ = f_4_ + f_1_;
				float f_8_ = f_5_ + f_2_;
				float f_9_ = f - f_3_;
				float f_10_ = -f_4_ + f_1_;
				if (i_0_ == 52) {
					float f_11_ = f_2_ - f_5_;
					float f_12_ = f_3_ - f;
					float f_13_ = f_4_ - f_1_;
					float f_14_ = -f_2_ + f_5_;
					aClass98_Sub22_Sub2_3063.position = 0;
					if (var_ha_Sub1.aBoolean4397) {
						for (int i_15_ = -1 + i; i_15_ >= 0; i_15_--) {
							int i_16_ = (anIntArray3075[i_15_] <= 64 ? anIntArray3075[i_15_] : 64);
							if (i_16_ > 0) {
								for (int i_17_ = -1 + i_16_; i_17_ >= 0; i_17_--) {
									Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray3072[i_15_][i_17_]);
									int i_18_ = (class246_sub4_sub2.anInt6178);
									byte i_19_ = (byte) (i_18_ >> 16);
									byte i_20_ = (byte) (i_18_ >> 8);
									byte i_21_ = (byte) i_18_;
									byte i_22_ = (byte) (i_18_ >>> 24);
									float f_23_ = (float) ((class246_sub4_sub2.anInt6176) >> 12);
									float f_24_ = (float) ((class246_sub4_sub2.anInt6177) >> 12);
									float f_25_ = (float) ((class246_sub4_sub2.anInt6175) >> 12);
									int i_26_ = (class246_sub4_sub2.anInt6179 >> 12);
									aClass98_Sub22_Sub2_3063.method1264((byte) -118, 0.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) -123, 0.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) -96, (float) -i_26_ * f_6_ + f_23_);
									aClass98_Sub22_Sub2_3063.method1264((byte) -1, f_7_ * (float) -i_26_ + f_24_);
									aClass98_Sub22_Sub2_3063.method1264((byte) -96, f_25_ + f_8_ * (float) -i_26_);
									aClass98_Sub22_Sub2_3063.writeByte(i_19_);
									aClass98_Sub22_Sub2_3063.writeByte(i_20_);
									aClass98_Sub22_Sub2_3063.writeByte(i_21_);
									aClass98_Sub22_Sub2_3063.writeByte(i_22_);
									aClass98_Sub22_Sub2_3063.method1264((byte) 81, 1.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) -121, 0.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) 73, (float) i_26_ * f_9_ + f_23_);
									aClass98_Sub22_Sub2_3063.method1264((byte) 81, f_10_ * (float) i_26_ + f_24_);
									aClass98_Sub22_Sub2_3063.method1264((byte) -102, f_11_ * (float) i_26_ + f_25_);
									aClass98_Sub22_Sub2_3063.writeByte(i_19_);
									aClass98_Sub22_Sub2_3063.writeByte(i_20_);
									aClass98_Sub22_Sub2_3063.writeByte(i_21_);
									aClass98_Sub22_Sub2_3063.writeByte(i_22_);
									aClass98_Sub22_Sub2_3063.method1264((byte) -104, 1.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) -98, 1.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) 66, (float) i_26_ * f_6_ + f_23_);
									aClass98_Sub22_Sub2_3063.method1264((byte) 45, f_7_ * (float) i_26_ + f_24_);
									aClass98_Sub22_Sub2_3063.method1264((byte) 126, f_25_ + f_8_ * (float) i_26_);
									aClass98_Sub22_Sub2_3063.writeByte(i_19_);
									aClass98_Sub22_Sub2_3063.writeByte(i_20_);
									aClass98_Sub22_Sub2_3063.writeByte(i_21_);
									aClass98_Sub22_Sub2_3063.writeByte(i_22_);
									aClass98_Sub22_Sub2_3063.method1264((byte) -111, 0.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) -126, 1.0F);
									aClass98_Sub22_Sub2_3063.method1264((byte) 88, (float) i_26_ * f_12_ + f_23_);
									aClass98_Sub22_Sub2_3063.method1264((byte) 86, (float) i_26_ * f_13_ + f_24_);
									aClass98_Sub22_Sub2_3063.method1264((byte) 103, (float) i_26_ * f_14_ + f_25_);
									aClass98_Sub22_Sub2_3063.writeByte(i_19_);
									aClass98_Sub22_Sub2_3063.writeByte(i_20_);
									aClass98_Sub22_Sub2_3063.writeByte(i_21_);
									aClass98_Sub22_Sub2_3063.writeByte(i_22_);
								}
								if (anIntArray3075[i_15_] > 64) {
									int i_27_ = -65 + anIntArray3075[i_15_];
									for (int i_28_ = anIntArray3077[i_27_] - 1; i_28_ >= 0; i_28_--) {
										Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray3073[i_27_][i_28_]);
										int i_29_ = (class246_sub4_sub2.anInt6178);
										byte i_30_ = (byte) (i_29_ >> 16);
										byte i_31_ = (byte) (i_29_ >> 8);
										byte i_32_ = (byte) i_29_;
										byte i_33_ = (byte) (i_29_ >>> 24);
										float f_34_ = (float) ((class246_sub4_sub2.anInt6176) >> 12);
										float f_35_ = (float) ((class246_sub4_sub2.anInt6177) >> 12);
										float f_36_ = (float) ((class246_sub4_sub2.anInt6175) >> 12);
										int i_37_ = (class246_sub4_sub2.anInt6179 >> 12);
										aClass98_Sub22_Sub2_3063.method1264((byte) 95, 0.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) 30, 0.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) -113, f_34_ + f_6_ * (float) -i_37_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 43, (float) -i_37_ * f_7_ + f_35_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 32, f_8_ * (float) -i_37_ + f_36_);
										aClass98_Sub22_Sub2_3063.writeByte(i_30_);
										aClass98_Sub22_Sub2_3063.writeByte(i_31_);
										aClass98_Sub22_Sub2_3063.writeByte(i_32_);
										aClass98_Sub22_Sub2_3063.writeByte(i_33_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 44, 1.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) -113, 0.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) -125, f_34_ + f_9_ * (float) i_37_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 29, f_10_ * (float) i_37_ + f_35_);
										aClass98_Sub22_Sub2_3063.method1264((byte) -100, f_11_ * (float) i_37_ + f_36_);
										aClass98_Sub22_Sub2_3063.writeByte(i_30_);
										aClass98_Sub22_Sub2_3063.writeByte(i_31_);
										aClass98_Sub22_Sub2_3063.writeByte(i_32_);
										aClass98_Sub22_Sub2_3063.writeByte(i_33_);
										aClass98_Sub22_Sub2_3063.method1264((byte) -117, 1.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) 115, 1.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) 9, f_34_ + f_6_ * (float) i_37_);
										aClass98_Sub22_Sub2_3063.method1264((byte) -103, f_35_ + (float) i_37_ * f_7_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 57, f_36_ + (float) i_37_ * f_8_);
										aClass98_Sub22_Sub2_3063.writeByte(i_30_);
										aClass98_Sub22_Sub2_3063.writeByte(i_31_);
										aClass98_Sub22_Sub2_3063.writeByte(i_32_);
										aClass98_Sub22_Sub2_3063.writeByte(i_33_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 30, 0.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) -127, 1.0F);
										aClass98_Sub22_Sub2_3063.method1264((byte) 51, f_34_ + f_12_ * (float) i_37_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 42, (float) i_37_ * f_13_ + f_35_);
										aClass98_Sub22_Sub2_3063.method1264((byte) 80, f_36_ + f_14_ * (float) i_37_);
										aClass98_Sub22_Sub2_3063.writeByte(i_30_);
										aClass98_Sub22_Sub2_3063.writeByte(i_31_);
										aClass98_Sub22_Sub2_3063.writeByte(i_32_);
										aClass98_Sub22_Sub2_3063.writeByte(i_33_);
									}
								}
							}
						}
					} else {
						for (int i_38_ = i - 1; i_38_ >= 0; i_38_--) {
							int i_39_ = (anIntArray3075[i_38_] > 64 ? 64 : anIntArray3075[i_38_]);
							if (i_39_ > 0) {
								for (int i_40_ = i_39_ - 1; i_40_ >= 0; i_40_--) {
									Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray3072[i_38_][i_40_]);
									int i_41_ = (class246_sub4_sub2.anInt6178);
									byte i_42_ = (byte) (i_41_ >> 16);
									byte i_43_ = (byte) (i_41_ >> 8);
									byte i_44_ = (byte) i_41_;
									byte i_45_ = (byte) (i_41_ >>> 24);
									float f_46_ = (float) ((class246_sub4_sub2.anInt6176) >> 12);
									float f_47_ = (float) ((class246_sub4_sub2.anInt6177) >> 12);
									float f_48_ = (float) ((class246_sub4_sub2.anInt6175) >> 12);
									int i_49_ = (class246_sub4_sub2.anInt6179 >> 12);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_46_ + f_6_ * (float) -i_49_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_47_ + f_7_ * (float) -i_49_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_48_ + (float) -i_49_ * f_8_);
									aClass98_Sub22_Sub2_3063.writeByte(i_42_);
									aClass98_Sub22_Sub2_3063.writeByte(i_43_);
									aClass98_Sub22_Sub2_3063.writeByte(i_44_);
									aClass98_Sub22_Sub2_3063.writeByte(i_45_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, (float) i_49_ * f_9_ + f_46_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, (float) i_49_ * f_10_ + f_47_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, (float) i_49_ * f_11_ + f_48_);
									aClass98_Sub22_Sub2_3063.writeByte(i_42_);
									aClass98_Sub22_Sub2_3063.writeByte(i_43_);
									aClass98_Sub22_Sub2_3063.writeByte(i_44_);
									aClass98_Sub22_Sub2_3063.writeByte(i_45_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_46_ + f_6_ * (float) i_49_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_7_ * (float) i_49_ + f_47_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_48_ + (float) i_49_ * f_8_);
									aClass98_Sub22_Sub2_3063.writeByte(i_42_);
									aClass98_Sub22_Sub2_3063.writeByte(i_43_);
									aClass98_Sub22_Sub2_3063.writeByte(i_44_);
									aClass98_Sub22_Sub2_3063.writeByte(i_45_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_46_ + f_12_ * (float) i_49_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_13_ * (float) i_49_ + f_47_);
									aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_14_ * (float) i_49_ + f_48_);
									aClass98_Sub22_Sub2_3063.writeByte(i_42_);
									aClass98_Sub22_Sub2_3063.writeByte(i_43_);
									aClass98_Sub22_Sub2_3063.writeByte(i_44_);
									aClass98_Sub22_Sub2_3063.writeByte(i_45_);
								}
								if (anIntArray3075[i_38_] > 64) {
									int i_50_ = -64 + (anIntArray3075[i_38_] + -1);
									for (int i_51_ = anIntArray3077[i_50_] + -1; i_51_ >= 0; i_51_--) {
										Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray3073[i_50_][i_51_]);
										int i_52_ = (class246_sub4_sub2.anInt6178);
										byte i_53_ = (byte) (i_52_ >> 16);
										byte i_54_ = (byte) (i_52_ >> 8);
										byte i_55_ = (byte) i_52_;
										byte i_56_ = (byte) (i_52_ >>> 24);
										float f_57_ = (float) ((class246_sub4_sub2.anInt6176) >> 12);
										float f_58_ = (float) ((class246_sub4_sub2.anInt6177) >> 12);
										float f_59_ = (float) ((class246_sub4_sub2.anInt6175) >> 12);
										int i_60_ = (class246_sub4_sub2.anInt6179 >> 12);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_6_ * (float) -i_60_ + f_57_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_7_ * (float) -i_60_ + f_58_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_8_ * (float) -i_60_ + f_59_);
										aClass98_Sub22_Sub2_3063.writeByte(i_53_);
										aClass98_Sub22_Sub2_3063.writeByte(i_54_);
										aClass98_Sub22_Sub2_3063.writeByte(i_55_);
										aClass98_Sub22_Sub2_3063.writeByte(i_56_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, (float) i_60_ * f_9_ + f_57_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_10_ * (float) i_60_ + f_58_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_59_ + (float) i_60_ * f_11_);
										aClass98_Sub22_Sub2_3063.writeByte(i_53_);
										aClass98_Sub22_Sub2_3063.writeByte(i_54_);
										aClass98_Sub22_Sub2_3063.writeByte(i_55_);
										aClass98_Sub22_Sub2_3063.writeByte(i_56_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_57_ + (float) i_60_ * f_6_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_58_ + f_7_ * (float) i_60_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_8_ * (float) i_60_ + f_59_);
										aClass98_Sub22_Sub2_3063.writeByte(i_53_);
										aClass98_Sub22_Sub2_3063.writeByte(i_54_);
										aClass98_Sub22_Sub2_3063.writeByte(i_55_);
										aClass98_Sub22_Sub2_3063.writeByte(i_56_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 0.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, 1.0F);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_57_ + (float) i_60_ * f_12_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, f_58_ + f_13_ * (float) i_60_);
										aClass98_Sub22_Sub2_3063.method1265((byte) -52, (float) i_60_ * f_14_ + f_59_);
										aClass98_Sub22_Sub2_3063.writeByte(i_53_);
										aClass98_Sub22_Sub2_3063.writeByte(i_54_);
										aClass98_Sub22_Sub2_3063.writeByte(i_55_);
										aClass98_Sub22_Sub2_3063.writeByte(i_56_);
									}
								}
							}
						}
					}
					if (aClass98_Sub22_Sub2_3063.position == 0)
						break;
					anInterface16_3066.method54(aClass98_Sub22_Sub2_3063.position, 7896, (aClass98_Sub22_Sub2_3063.data), 24);
					var_ha_Sub1.method1868(aClass104_3068, null, aClass104_3067, aClass104_3069, 0);
					var_ha_Sub1.method1910(7, (aClass98_Sub22_Sub2_3063.position) / 24, false, 0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vq.B(" + i + ',' + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3905(int i, int i_61_, int i_62_) {
		try {
			int i_63_ = 46 % ((43 - i) / 32);
			if ((i_61_ & 0x8000) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vq.E(" + i + ',' + i_61_ + ',' + i_62_ + ')'));
		}
	}

	final void method3906(Class242 class242, int i, int i_64_, ha_Sub1 var_ha_Sub1) {
		try {
			if (var_ha_Sub1.aClass111_Sub1_4348 != null) {
				if (i_64_ < 0)
					method3908(var_ha_Sub1, 5228);
				else
					method3911(var_ha_Sub1, true, i_64_);
				float f = (var_ha_Sub1.aClass111_Sub1_4348.aFloat4684);
				float f_65_ = (var_ha_Sub1.aClass111_Sub1_4348.aFloat4676);
				float f_66_ = (var_ha_Sub1.aClass111_Sub1_4348.aFloat4673);
				float f_67_ = (var_ha_Sub1.aClass111_Sub1_4348.aFloat4677);
				try {
					int i_68_ = 0;
					int i_69_ = 2147483647;
					int i_70_ = 0;
					Class246_Sub4 class246_sub4 = (class242.aClass358_1850.aClass246_Sub4_3028);
					if (i > -40)
						return;
					for (Class246_Sub4 class246_sub4_71_ = (class246_sub4.aClass246_Sub4_5091); class246_sub4_71_ != class246_sub4; class246_sub4_71_ = (class246_sub4_71_.aClass246_Sub4_5091)) {
						Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_71_;
						int i_72_ = (int) ((float) (class246_sub4_sub2.anInt6175 >> 12) * f_66_ + ((float) (class246_sub4_sub2.anInt6176 >> 12) * f + (float) ((class246_sub4_sub2.anInt6177) >> 12) * f_65_) + f_67_);
						anIntArray3074[i_68_++] = i_72_;
						if (i_72_ < i_69_)
							i_69_ = i_72_;
						if (i_72_ > i_70_)
							i_70_ = i_72_;
					}
					int i_73_ = -i_69_ + i_70_;
					int i_74_;
					if (i_73_ + 2 > 1600) {
						i_74_ = 1 - (-Class48_Sub2_Sub1.method474(i_73_, (byte) 31) + anInt3071);
						i_73_ = (i_73_ >> i_74_) - -2;
					} else {
						i_73_ += 2;
						i_74_ = 0;
					}
					i_68_ = 0;
					Class246_Sub4 class246_sub4_75_ = class246_sub4.aClass246_Sub4_5091;
					int i_76_ = -2;
					boolean bool = true;
					boolean bool_77_ = true;
					while (class246_sub4_75_ != class246_sub4) {
						anInt3076 = 0;
						for (int i_78_ = 0; i_73_ > i_78_; i_78_++)
							anIntArray3075[i_78_] = 0;
						for (int i_79_ = 0; i_79_ < 64; i_79_++)
							anIntArray3077[i_79_] = 0;
						for (/**/; class246_sub4 != class246_sub4_75_; class246_sub4_75_ = (class246_sub4_75_.aClass246_Sub4_5091)) {
							Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_75_;
							if (bool_77_) {
								i_76_ = class246_sub4_sub2.anInt6180;
								bool = class246_sub4_sub2.aBoolean6174;
								bool_77_ = false;
							}
							if (i_68_ > 0 && (i_76_ != (class246_sub4_sub2.anInt6180) || !bool == (class246_sub4_sub2.aBoolean6174))) {
								bool_77_ = true;
								break;
							}
							int i_80_ = -i_69_ + anIntArray3074[i_68_++] >> i_74_;
							if (i_80_ < 1600) {
								if (anIntArray3075[i_80_] >= 64) {
									if (anIntArray3075[i_80_] == 64) {
										if (anInt3076 == 64)
											continue;
										anIntArray3075[i_80_] += 1 - -anInt3076++;
									}
									aClass246_Sub4_Sub2ArrayArray3073[anIntArray3075[i_80_] - 65][anIntArray3077[(-1 + anIntArray3075[i_80_] + -64)]++] = class246_sub4_sub2;
								} else
									aClass246_Sub4_Sub2ArrayArray3072[i_80_][anIntArray3075[i_80_]++] = class246_sub4_sub2;
							}
						}
						if (i_76_ < 0)
							var_ha_Sub1.method1834(-43, -1);
						else
							var_ha_Sub1.method1834(-84, i_76_);
						if (bool && (Class49.aFloat416 != var_ha_Sub1.aFloat4413))
							var_ha_Sub1.xa(Class49.aFloat416);
						else if (var_ha_Sub1.aFloat4413 != 1.0F)
							var_ha_Sub1.xa(1.0F);
						method3904(i_73_, var_ha_Sub1, (byte) 52);
					}
				} catch (Exception exception) {
					/* empty */
				}
				method3907(var_ha_Sub1, -124);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vq.J(" + (class242 != null ? "{...}" : "null") + ',' + i + ',' + i_64_ + ',' + (var_ha_Sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3907(ha_Sub1 var_ha_Sub1, int i) {
		do {
			try {
				var_ha_Sub1.method1875((byte) -127, true);
				OpenGL.glEnable(16384);
				if (i >= -5)
					aLong3070 = -102L;
				OpenGL.glEnable(16385);
				if (var_ha_Sub1.aFloat4413 == Class49.aFloat416)
					break;
				var_ha_Sub1.xa(Class49.aFloat416);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vq.C(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method3908(ha_Sub1 var_ha_Sub1, int i) {
		try {
			Class49.aFloat416 = var_ha_Sub1.aFloat4413;
			var_ha_Sub1.method1861(19330);
			if (i != 5228)
				aClass246_Sub4_Sub2ArrayArray3072 = null;
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
			var_ha_Sub1.method1875((byte) -127, false);
			OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vq.D(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method3909(int i, int i_81_) {
		try {
			if (i != -4)
				aString3064 = null;
			if ((i_81_ < 0 || i_81_ > 3) && i_81_ != 9)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vq.H(" + i + ',' + i_81_ + ')');
		}
	}

	static final GameInterfaceData method3910(boolean bool, GameInterfaceData class293) {
		try {
			if (class293.anInt2234 != -1)
				return Class159.method2509(class293.anInt2234, -9820);
			if (bool != true)
				return null;
			int i = class293.anInt2248 >>> 16;
			Class61 class61 = new Class61(Class116.aClass377_964);
			for (GameInterface class98_sub18 = (GameInterface) class61.method541(0); class98_sub18 != null; class98_sub18 = (GameInterface) class61.method539(2)) {
				if (i == class98_sub18.interfaceID)
					return Class159.method2509((int) (class98_sub18.uid), -9820);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vq.A(" + bool + ',' + (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3911(ha_Sub1 var_ha_Sub1, boolean bool, int i) {
		try {
			Class49.aFloat416 = var_ha_Sub1.aFloat4413;
			var_ha_Sub1.method1890((float) i, bool);
			var_ha_Sub1.method1901((byte) -35);
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
			var_ha_Sub1.method1875((byte) -125, false);
			OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vq.G(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	final void method3912(ha_Sub1 var_ha_Sub1, int i) {
		try {
			anInterface16_3066 = var_ha_Sub1.method1878(i, true, 24, -51, null);
			aClass104_3067 = new Class104(anInterface16_3066, 5126, 2, 0);
			aClass104_3069 = new Class104(anInterface16_3066, 5126, 3, 8);
			aClass104_3068 = new Class104(anInterface16_3066, 5121, 4, 20);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vq.F(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3913(byte i) {
		do {
			try {
				aString3064 = null;
				if (i >= 25)
					break;
				aLong3070 = 55L;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vq.I(" + i + ')');
			}
			break;
		} while (false);
	}

	Class360() {
		aClass98_Sub22_Sub2_3063 = new Class98_Sub22_Sub2(786336);
		anInt3071 = Class48_Sub2_Sub1.method474(1600, (byte) 31);
		aClass246_Sub4_Sub2ArrayArray3072 = new Class246_Sub4_Sub2[1600][64];
		anIntArray3075 = new int[1600];
		anIntArray3077 = new int[64];
		anIntArray3074 = new int[8191];
		aClass246_Sub4_Sub2ArrayArray3073 = new Class246_Sub4_Sub2[64][768];
		anInt3076 = 0;
	}
}
