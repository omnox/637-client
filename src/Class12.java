/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class12 {
	private int anInt127;
	int anInt128;
	int anInt129;
	boolean aBoolean130 = false;
	private ha_Sub2 aHa_Sub2_131;
	private float[] aFloatArray132;
	int[] anIntArray133 = new int[4096];
	boolean aBoolean134;
	boolean aBoolean135;
	int anInt136;
	int anInt137 = 0;
	private Class235 aClass235_138;
	private int[] anIntArray139;
	private boolean aBoolean140;
	int anInt141;
	private boolean aBoolean142;
	private int[] anIntArray143;
	private int anInt144;
	private int[] anIntArray145;
	private int anInt146;
	private int anInt147;
	private int anInt148;
	private float aFloat149;
	private float aFloat150;
	private int anInt151;
	private int anInt152;
	private int anInt153;
	private boolean aBoolean154;
	private int anInt155;
	private int[] anIntArray156;
	private float aFloat157;
	private int anInt158;
	private int anInt159;
	private int anInt160;

	private final void method204(int[] is, float[] fs, int i, int i_0_, int i_1_, int i_2_, int i_3_, float f, float f_4_, float f_5_, float f_6_) {
		if (((Class12) this).aBoolean135) {
			if (i_3_ > ((Class12) this).anInt141)
				i_3_ = ((Class12) this).anInt141;
			if (i_2_ < 0)
				i_2_ = 0;
		}
		if (i_2_ < i_3_) {
			i += i_2_ - 1;
			f += f_4_ * (float) i_2_;
			f_5_ += f_6_ * (float) i_2_;
			if (((Class235) aClass235_138).aBoolean1762) {
				do {
					if (((Class12) this).aBoolean134) {
						i_1_ = i_3_ - i_2_ >> 2;
						f_4_ *= 4.0F;
						if (((Class12) this).anInt137 == 0) {
							if (i_1_ > 0) {
								do {
									i_0_ = Class221.anIntArray1665[(int) f];
									f += f_4_;
									if (f_5_ < fs[++i]) {
										is[i] = i_0_;
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										is[i] = i_0_;
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										is[i] = i_0_;
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										is[i] = i_0_;
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
								} while (--i_1_ > 0);
							}
							i_1_ = i_3_ - i_2_ & 0x3;
							if (i_1_ > 0) {
								i_0_ = Class221.anIntArray1665[(int) f];
								do {
									if (f_5_ < fs[++i]) {
										is[i] = i_0_;
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
								} while (--i_1_ > 0);
							}
						} else {
							int i_7_ = ((Class12) this).anInt137;
							int i_8_ = 256 - ((Class12) this).anInt137;
							if (i_1_ > 0) {
								do {
									i_0_ = Class221.anIntArray1665[(int) f];
									f += f_4_;
									i_0_ = (((i_0_ & 0xff00ff) * i_8_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_8_ >> 8 & 0xff00));
									if (f_5_ < fs[++i]) {
										int i_9_ = is[i];
										is[i] = (i_0_ + ((i_9_ & 0xff00ff) * i_7_ >> 8 & 0xff00ff) + ((i_9_ & 0xff00) * i_7_ >> 8 & 0xff00));
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										int i_10_ = is[i];
										is[i] = (i_0_ + (((i_10_ & 0xff00ff) * i_7_ >> 8) & 0xff00ff) + ((i_10_ & 0xff00) * i_7_ >> 8 & 0xff00));
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										int i_11_ = is[i];
										is[i] = (i_0_ + (((i_11_ & 0xff00ff) * i_7_ >> 8) & 0xff00ff) + ((i_11_ & 0xff00) * i_7_ >> 8 & 0xff00));
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										int i_12_ = is[i];
										is[i] = (i_0_ + (((i_12_ & 0xff00ff) * i_7_ >> 8) & 0xff00ff) + ((i_12_ & 0xff00) * i_7_ >> 8 & 0xff00));
										fs[i] = f_5_;
									}
									f_5_ += f_6_;
								} while (--i_1_ > 0);
							}
							i_1_ = i_3_ - i_2_ & 0x3;
							if (i_1_ <= 0)
								break;
							i_0_ = Class221.anIntArray1665[(int) f];
							i_0_ = (((i_0_ & 0xff00ff) * i_8_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_8_ >> 8 & 0xff00));
							do {
								if (f_5_ < fs[++i]) {
									int i_13_ = is[i];
									is[i] = (i_0_ + ((i_13_ & 0xff00ff) * i_7_ >> 8 & 0xff00ff) + ((i_13_ & 0xff00) * i_7_ >> 8 & 0xff00));
									fs[i] = f_5_;
								}
								f_5_ += f_6_;
							} while (--i_1_ > 0);
						}
						break;
					}
					i_1_ = i_3_ - i_2_;
					if (((Class12) this).anInt137 == 0) {
						do {
							if (f_5_ < fs[++i]) {
								is[i] = Class221.anIntArray1665[(int) f];
								fs[i] = f_5_;
							}
							f_5_ += f_6_;
							f += f_4_;
						} while (--i_1_ > 0);
						break;
					}
					int i_14_ = ((Class12) this).anInt137;
					int i_15_ = 256 - ((Class12) this).anInt137;
					do {
						if (f_5_ < fs[++i]) {
							i_0_ = Class221.anIntArray1665[(int) f];
							i_0_ = (((i_0_ & 0xff00ff) * i_15_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_15_ >> 8 & 0xff00));
							int i_16_ = is[i];
							is[i] = (i_0_ + ((i_16_ & 0xff00ff) * i_14_ >> 8 & 0xff00ff) + ((i_16_ & 0xff00) * i_14_ >> 8 & 0xff00));
							fs[i] = f_5_;
						}
						f += f_4_;
						f_5_ += f_6_;
					} while (--i_1_ > 0);
				} while (false);
			} else {
				do {
					if (((Class12) this).aBoolean134) {
						i_1_ = i_3_ - i_2_ >> 2;
						f_4_ *= 4.0F;
						if (((Class12) this).anInt137 == 0) {
							if (i_1_ > 0) {
								do {
									i_0_ = Class221.anIntArray1665[(int) f];
									f += f_4_;
									if (f_5_ < fs[++i])
										is[i] = i_0_;
									f_5_ += f_6_;
									if (f_5_ < fs[++i])
										is[i] = i_0_;
									f_5_ += f_6_;
									if (f_5_ < fs[++i])
										is[i] = i_0_;
									f_5_ += f_6_;
									if (f_5_ < fs[++i])
										is[i] = i_0_;
									f_5_ += f_6_;
								} while (--i_1_ > 0);
							}
							i_1_ = i_3_ - i_2_ & 0x3;
							if (i_1_ > 0) {
								i_0_ = Class221.anIntArray1665[(int) f];
								do {
									if (f_5_ < fs[++i])
										is[i] = i_0_;
									f_5_ += f_6_;
								} while (--i_1_ > 0);
							}
						} else {
							int i_17_ = ((Class12) this).anInt137;
							int i_18_ = 256 - ((Class12) this).anInt137;
							if (i_1_ > 0) {
								do {
									i_0_ = Class221.anIntArray1665[(int) f];
									f += f_4_;
									i_0_ = (((i_0_ & 0xff00ff) * i_18_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_18_ >> 8 & 0xff00));
									if (f_5_ < fs[++i]) {
										int i_19_ = is[i];
										is[i] = (i_0_ + (((i_19_ & 0xff00ff) * i_17_ >> 8) & 0xff00ff) + ((i_19_ & 0xff00) * i_17_ >> 8 & 0xff00));
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										int i_20_ = is[i];
										is[i] = (i_0_ + (((i_20_ & 0xff00ff) * i_17_ >> 8) & 0xff00ff) + ((i_20_ & 0xff00) * i_17_ >> 8 & 0xff00));
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										int i_21_ = is[i];
										is[i] = (i_0_ + (((i_21_ & 0xff00ff) * i_17_ >> 8) & 0xff00ff) + ((i_21_ & 0xff00) * i_17_ >> 8 & 0xff00));
									}
									f_5_ += f_6_;
									if (f_5_ < fs[++i]) {
										int i_22_ = is[i];
										is[i] = (i_0_ + (((i_22_ & 0xff00ff) * i_17_ >> 8) & 0xff00ff) + ((i_22_ & 0xff00) * i_17_ >> 8 & 0xff00));
									}
									f_5_ += f_6_;
								} while (--i_1_ > 0);
							}
							i_1_ = i_3_ - i_2_ & 0x3;
							if (i_1_ <= 0)
								break;
							i_0_ = Class221.anIntArray1665[(int) f];
							i_0_ = (((i_0_ & 0xff00ff) * i_18_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_18_ >> 8 & 0xff00));
							do {
								if (f_5_ < fs[++i]) {
									int i_23_ = is[i];
									is[i] = (i_0_ + ((i_23_ & 0xff00ff) * i_17_ >> 8 & 0xff00ff) + ((i_23_ & 0xff00) * i_17_ >> 8 & 0xff00));
								}
								f_5_ += f_6_;
							} while (--i_1_ > 0);
						}
						break;
					}
					i_1_ = i_3_ - i_2_;
					if (((Class12) this).anInt137 == 0) {
						do {
							if (f_5_ < fs[++i])
								is[i] = Class221.anIntArray1665[(int) f];
							f_5_ += f_6_;
							f += f_4_;
						} while (--i_1_ > 0);
						break;
					}
					int i_24_ = ((Class12) this).anInt137;
					int i_25_ = 256 - ((Class12) this).anInt137;
					do {
						if (f_5_ < fs[++i]) {
							i_0_ = Class221.anIntArray1665[(int) f];
							i_0_ = (((i_0_ & 0xff00ff) * i_25_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_25_ >> 8 & 0xff00));
							int i_26_ = is[i];
							is[i] = (i_0_ + ((i_26_ & 0xff00ff) * i_24_ >> 8 & 0xff00ff) + ((i_26_ & 0xff00) * i_24_ >> 8 & 0xff00));
						}
						f += f_4_;
						f_5_ += f_6_;
					} while (--i_1_ > 0);
				} while (false);
			}
		}
	}

	private final void method205(int[] is, int[] is_27_, int i, int i_28_, int i_29_, float f, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_, float f_38_, float f_39_, float f_40_, float f_41_, float f_42_, float f_43_, float f_44_) {
		int i_45_ = i_29_ - i_28_;
		float f_46_ = 1.0F / (float) i_45_;
		float f_47_ = (f_30_ - f) * f_46_;
		float f_48_ = (f_32_ - f_31_) * f_46_;
		float f_49_ = (f_34_ - f_33_) * f_46_;
		float f_50_ = (f_36_ - f_35_) * f_46_;
		float f_51_ = (f_38_ - f_37_) * f_46_;
		float f_52_ = (f_40_ - f_39_) * f_46_;
		float f_53_ = (f_42_ - f_41_) * f_46_;
		float f_54_ = (f_44_ - f_43_) * f_46_;
		if (((Class12) this).aBoolean135) {
			if (i_29_ > ((Class12) this).anInt141)
				i_29_ = ((Class12) this).anInt141;
			if (i_28_ < 0) {
				f -= f_47_ * (float) i_28_;
				f_31_ -= f_48_ * (float) i_28_;
				f_33_ -= f_49_ * (float) i_28_;
				f_35_ -= f_50_ * (float) i_28_;
				f_37_ -= f_51_ * (float) i_28_;
				f_39_ -= f_52_ * (float) i_28_;
				f_41_ -= f_53_ * (float) i_28_;
				f_43_ -= f_54_ * (float) i_28_;
				i_28_ = 0;
			}
		}
		if (i_28_ < i_29_) {
			i_45_ = i_29_ - i_28_;
			i += i_28_;
			while (i_45_-- > 0) {
				float f_55_ = 1.0F / f;
				if (f_55_ < aFloatArray132[i]) {
					int i_56_ = (int) (f_31_ * f_55_ * (float) anInt151);
					if (aBoolean154)
						i_56_ &= anInt146;
					else if (i_56_ < 0)
						i_56_ = 0;
					else if (i_56_ > anInt146)
						i_56_ = anInt146;
					int i_57_ = (int) (f_33_ * f_55_ * (float) anInt151);
					if (aBoolean154)
						i_57_ &= anInt146;
					else if (i_57_ < 0)
						i_57_ = 0;
					else if (i_57_ > anInt146)
						i_57_ = anInt146;
					int i_58_ = anIntArray143[i_57_ * anInt151 + i_56_];
					int i_59_ = 255;
					if (anInt147 == 2)
						i_59_ = i_58_ >> 24 & 0xff;
					else if (anInt147 == 1)
						i_59_ = i_58_ == 0 ? 0 : 255;
					else
						i_59_ = (int) f_37_;
					if (i_59_ != 0) {
						if (i_59_ != 255) {
							int i_60_ = (~0xffffff | ((int) (f_39_ * (float) (i_58_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_41_ * (float) (i_58_ >> 8 & 0xff)) & 0xff00 | ((int) (f_43_ * (float) (i_58_ & 0xff)) >> 8));
							if (f_35_ != 0.0F) {
								int i_61_ = (int) (255.0F - f_35_);
								int i_62_ = ((((anInt155 & 0xff00ff) * (int) f_35_ & ~0xff00ff) | ((anInt155 & 0xff00) * (int) f_35_ & 0xff0000)) >>> 8);
								i_60_ = (((i_60_ & 0xff00ff) * i_61_ & ~0xff00ff | (i_60_ & 0xff00) * i_61_ & 0xff0000) >>> 8) + i_62_;
							}
							int i_63_ = is[i];
							int i_64_ = 255 - i_59_;
							i_60_ = ((((i_63_ & 0xff00ff) * i_64_ + (i_60_ & 0xff00ff) * i_59_) & ~0xff00ff) + (((i_63_ & 0xff00) * i_64_ + (i_60_ & 0xff00) * i_59_) & 0xff0000)) >> 8;
							is[i] = i_60_;
							aFloatArray132[i] = f_55_;
						} else {
							int i_65_ = (~0xffffff | ((int) (f_39_ * (float) (i_58_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_41_ * (float) (i_58_ >> 8 & 0xff)) & 0xff00 | ((int) (f_43_ * (float) (i_58_ & 0xff)) >> 8));
							if (f_35_ != 0.0F) {
								int i_66_ = (int) (255.0F - f_35_);
								int i_67_ = ((((anInt155 & 0xff00ff) * (int) f_35_ & ~0xff00ff) | ((anInt155 & 0xff00) * (int) f_35_ & 0xff0000)) >>> 8);
								i_65_ = (((i_65_ & 0xff00ff) * i_66_ & ~0xff00ff | (i_65_ & 0xff00) * i_66_ & 0xff0000) >>> 8) + i_67_;
							}
							is[i] = i_65_;
							aFloatArray132[i] = f_55_;
						}
					}
				}
				i++;
				f += f_47_;
				f_31_ += f_48_;
				f_33_ += f_49_;
				f_35_ += f_50_;
				f_37_ += f_51_;
				f_39_ += f_52_;
				f_41_ += f_53_;
				f_43_ += f_54_;
			}
		}
	}

	final void method206(float f, float f_68_, float f_69_, float f_70_, float f_71_, float f_72_, float f_73_, float f_74_, float f_75_, int i, int i_76_, int i_77_) {
		if (aBoolean142) {
			aHa_Sub2_131.method1789((int) f, ~0xffffff | i, (int) f_68_, (int) f_71_, -10550, (int) f_70_);
			aHa_Sub2_131.method1789((int) f_68_, ~0xffffff | i, (int) f_69_, (int) f_72_, -10550, (int) f_71_);
			aHa_Sub2_131.method1789((int) f_69_, ~0xffffff | i, (int) f, (int) f_70_, -10550, (int) f_72_);
		} else {
			float f_78_ = f_71_ - f_70_;
			float f_79_ = f_68_ - f;
			float f_80_ = f_72_ - f_70_;
			float f_81_ = f_69_ - f;
			float f_82_ = f_74_ - f_73_;
			float f_83_ = f_75_ - f_73_;
			float f_84_ = (float) ((i_76_ & 0xff0000) - (i & 0xff0000));
			float f_85_ = (float) ((i_77_ & 0xff0000) - (i & 0xff0000));
			float f_86_ = (float) ((i_76_ & 0xff00) - (i & 0xff00));
			float f_87_ = (float) ((i_77_ & 0xff00) - (i & 0xff00));
			float f_88_ = (float) ((i_76_ & 0xff) - (i & 0xff));
			float f_89_ = (float) ((i_77_ & 0xff) - (i & 0xff));
			float f_90_;
			if (f_69_ != f_68_)
				f_90_ = (f_72_ - f_71_) / (f_69_ - f_68_);
			else
				f_90_ = 0.0F;
			float f_91_;
			if (f_68_ != f)
				f_91_ = f_78_ / f_79_;
			else
				f_91_ = 0.0F;
			float f_92_;
			if (f_69_ != f)
				f_92_ = f_80_ / f_81_;
			else
				f_92_ = 0.0F;
			float f_93_ = f_78_ * f_81_ - f_80_ * f_79_;
			if (f_93_ != 0.0F) {
				float f_94_ = (f_82_ * f_81_ - f_83_ * f_79_) / f_93_;
				float f_95_ = (f_83_ * f_78_ - f_82_ * f_80_) / f_93_;
				float f_96_ = (f_84_ * f_81_ - f_85_ * f_79_) / f_93_;
				float f_97_ = (f_85_ * f_78_ - f_84_ * f_80_) / f_93_;
				float f_98_ = (f_86_ * f_81_ - f_87_ * f_79_) / f_93_;
				float f_99_ = (f_87_ * f_78_ - f_86_ * f_80_) / f_93_;
				float f_100_ = (f_88_ * f_81_ - f_89_ * f_79_) / f_93_;
				float f_101_ = (f_89_ * f_78_ - f_88_ * f_80_) / f_93_;
				if (f <= f_68_ && f <= f_69_) {
					if (!(f >= (float) ((Class12) this).anInt129)) {
						if (f_68_ > (float) ((Class12) this).anInt129)
							f_68_ = (float) ((Class12) this).anInt129;
						if (f_69_ > (float) ((Class12) this).anInt129)
							f_69_ = (float) ((Class12) this).anInt129;
						f_73_ = f_73_ - f_94_ * f_70_ + f_94_;
						float f_102_ = (float) (i & 0xff0000) - f_96_ * f_70_ + f_96_;
						float f_103_ = (float) (i & 0xff00) - f_98_ * f_70_ + f_98_;
						float f_104_ = (float) (i & 0xff) - f_100_ * f_70_ + f_100_;
						if (f_68_ < f_69_) {
							f_72_ = f_70_;
							if (f < 0.0F) {
								f_72_ -= f_92_ * f;
								f_70_ -= f_91_ * f;
								f_73_ -= f_95_ * f;
								f_102_ -= f_97_ * f;
								f_103_ -= f_99_ * f;
								f_104_ -= f_101_ * f;
								f = 0.0F;
							}
							if (f_68_ < 0.0F) {
								f_71_ -= f_90_ * f_68_;
								f_68_ = 0.0F;
							}
							if (f != f_68_ && f_92_ < f_91_ || f == f_68_ && f_92_ > f_90_) {
								f_69_ -= f_68_;
								f_68_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_68_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_72_, (int) f_70_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_72_ += f_92_;
									f_70_ += f_91_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_72_, (int) f_71_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_72_ += f_92_;
									f_71_ += f_90_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
							} else {
								f_69_ -= f_68_;
								f_68_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_68_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_70_, (int) f_72_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_72_ += f_92_;
									f_70_ += f_91_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_71_, (int) f_72_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_72_ += f_92_;
									f_71_ += f_90_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
							}
						} else {
							f_71_ = f_70_;
							if (f < 0.0F) {
								f_71_ -= f_92_ * f;
								f_70_ -= f_91_ * f;
								f_73_ -= f_95_ * f;
								f_102_ -= f_97_ * f;
								f_103_ -= f_99_ * f;
								f_104_ -= f_101_ * f;
								f = 0.0F;
							}
							if (f_69_ < 0.0F) {
								f_72_ -= f_90_ * f_69_;
								f_69_ = 0.0F;
							}
							if (f != f_69_ && f_92_ < f_91_ || f == f_69_ && f_90_ > f_91_) {
								f_68_ -= f_69_;
								f_69_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_71_, (int) f_70_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_71_ += f_92_;
									f_70_ += f_91_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
								while (--f_68_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_72_, (int) f_70_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_72_ += f_90_;
									f_70_ += f_91_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
							} else {
								f_68_ -= f_69_;
								f_69_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_70_, (int) f_71_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_71_ += f_92_;
									f_70_ += f_91_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
								while (--f_68_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_70_, (int) f_72_, f_73_, f_94_, f_102_, f_96_, f_103_, f_98_, f_104_, f_100_);
									f_72_ += f_90_;
									f_70_ += f_91_;
									f_73_ += f_95_;
									f_102_ += f_97_;
									f_103_ += f_99_;
									f_104_ += f_101_;
									f += (float) anInt127;
								}
							}
						}
					}
				} else if (f_68_ <= f_69_) {
					if (!(f_68_ >= (float) ((Class12) this).anInt129)) {
						if (f_69_ > (float) ((Class12) this).anInt129)
							f_69_ = (float) ((Class12) this).anInt129;
						if (f > (float) ((Class12) this).anInt129)
							f = (float) ((Class12) this).anInt129;
						f_74_ = f_74_ - f_94_ * f_71_ + f_94_;
						float f_105_ = ((float) (i_76_ & 0xff0000) - f_96_ * f_71_ + f_96_);
						float f_106_ = (float) (i_76_ & 0xff00) - f_98_ * f_71_ + f_98_;
						float f_107_ = (float) (i_76_ & 0xff) - f_100_ * f_71_ + f_100_;
						if (f_69_ < f) {
							f_70_ = f_71_;
							if (f_68_ < 0.0F) {
								f_70_ -= f_91_ * f_68_;
								f_71_ -= f_90_ * f_68_;
								f_74_ -= f_95_ * f_68_;
								f_105_ -= f_97_ * f_68_;
								f_106_ -= f_99_ * f_68_;
								f_107_ -= f_101_ * f_68_;
								f_68_ = 0.0F;
							}
							if (f_69_ < 0.0F) {
								f_72_ -= f_92_ * f_69_;
								f_69_ = 0.0F;
							}
							if (f_68_ != f_69_ && f_91_ < f_90_ || f_68_ == f_69_ && f_91_ > f_92_) {
								f -= f_69_;
								f_69_ -= f_68_;
								f_68_ = (float) (((Class12) this).anIntArray133[(int) f_68_]);
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_70_, (int) f_71_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_70_ += f_91_;
									f_71_ += f_90_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
								while (--f >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_70_, (int) f_72_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_70_ += f_91_;
									f_72_ += f_92_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
							} else {
								f -= f_69_;
								f_69_ -= f_68_;
								f_68_ = (float) (((Class12) this).anIntArray133[(int) f_68_]);
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_71_, (int) f_70_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_70_ += f_91_;
									f_71_ += f_90_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
								while (--f >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_72_, (int) f_70_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_70_ += f_91_;
									f_72_ += f_92_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
							}
						} else {
							f_72_ = f_71_;
							if (f_68_ < 0.0F) {
								f_72_ -= f_91_ * f_68_;
								f_71_ -= f_90_ * f_68_;
								f_74_ -= f_95_ * f_68_;
								f_105_ -= f_97_ * f_68_;
								f_106_ -= f_99_ * f_68_;
								f_107_ -= f_101_ * f_68_;
								f_68_ = 0.0F;
							}
							if (f < 0.0F) {
								f_70_ -= f_92_ * f;
								f = 0.0F;
							}
							if (f_91_ < f_90_) {
								f_69_ -= f;
								f -= f_68_;
								f_68_ = (float) (((Class12) this).anIntArray133[(int) f_68_]);
								while (--f >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_72_, (int) f_71_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_72_ += f_91_;
									f_71_ += f_90_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_70_, (int) f_71_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_70_ += f_92_;
									f_71_ += f_90_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
							} else {
								f_69_ -= f;
								f -= f_68_;
								f_68_ = (float) (((Class12) this).anIntArray133[(int) f_68_]);
								while (--f >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_71_, (int) f_72_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_72_ += f_91_;
									f_71_ += f_90_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
								while (--f_69_ >= 0.0F) {
									method214(anIntArray139, aFloatArray132, (int) f_68_, 0, 0, (int) f_71_, (int) f_70_, f_74_, f_94_, f_105_, f_96_, f_106_, f_98_, f_107_, f_100_);
									f_70_ += f_92_;
									f_71_ += f_90_;
									f_74_ += f_95_;
									f_105_ += f_97_;
									f_106_ += f_99_;
									f_107_ += f_101_;
									f_68_ += (float) anInt127;
								}
							}
						}
					}
				} else if (!(f_69_ >= (float) ((Class12) this).anInt129)) {
					if (f > (float) ((Class12) this).anInt129)
						f = (float) ((Class12) this).anInt129;
					if (f_68_ > (float) ((Class12) this).anInt129)
						f_68_ = (float) ((Class12) this).anInt129;
					f_75_ = f_75_ - f_94_ * f_72_ + f_94_;
					float f_108_ = (float) (i_77_ & 0xff0000) - f_96_ * f_72_ + f_96_;
					float f_109_ = (float) (i_77_ & 0xff00) - f_98_ * f_72_ + f_98_;
					float f_110_ = (float) (i_77_ & 0xff) - f_100_ * f_72_ + f_100_;
					if (f < f_68_) {
						f_71_ = f_72_;
						if (f_69_ < 0.0F) {
							f_71_ -= f_90_ * f_69_;
							f_72_ -= f_92_ * f_69_;
							f_75_ -= f_95_ * f_69_;
							f_108_ -= f_97_ * f_69_;
							f_109_ -= f_99_ * f_69_;
							f_110_ -= f_101_ * f_69_;
							f_69_ = 0.0F;
						}
						if (f < 0.0F) {
							f_70_ -= f_91_ * f;
							f = 0.0F;
						}
						if (f_90_ < f_92_) {
							f_68_ -= f;
							f -= f_69_;
							f_69_ = (float) (((Class12) this).anIntArray133[(int) f_69_]);
							while (--f >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_71_, (int) f_72_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_71_ += f_90_;
								f_72_ += f_92_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
							while (--f_68_ >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_71_, (int) f_70_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_71_ += f_90_;
								f_70_ += f_91_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
						} else {
							f_68_ -= f;
							f -= f_69_;
							f_69_ = (float) (((Class12) this).anIntArray133[(int) f_69_]);
							while (--f >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_72_, (int) f_71_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_71_ += f_90_;
								f_72_ += f_92_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
							while (--f_68_ >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_70_, (int) f_71_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_71_ += f_90_;
								f_70_ += f_91_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
						}
					} else {
						f_70_ = f_72_;
						if (f_69_ < 0.0F) {
							f_70_ -= f_90_ * f_69_;
							f_72_ -= f_92_ * f_69_;
							f_75_ -= f_95_ * f_69_;
							f_108_ -= f_97_ * f_69_;
							f_109_ -= f_99_ * f_69_;
							f_110_ -= f_101_ * f_69_;
							f_69_ = 0.0F;
						}
						if (f_68_ < 0.0F) {
							f_71_ -= f_91_ * f_68_;
							f_68_ = 0.0F;
						}
						if (f_90_ < f_92_) {
							f -= f_68_;
							f_68_ -= f_69_;
							f_69_ = (float) (((Class12) this).anIntArray133[(int) f_69_]);
							while (--f_68_ >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_70_, (int) f_72_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_70_ += f_90_;
								f_72_ += f_92_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
							while (--f >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_71_, (int) f_72_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_71_ += f_91_;
								f_72_ += f_92_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
						} else {
							f -= f_68_;
							f_68_ -= f_69_;
							f_69_ = (float) (((Class12) this).anIntArray133[(int) f_69_]);
							while (--f_68_ >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_72_, (int) f_70_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_70_ += f_90_;
								f_72_ += f_92_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
							while (--f >= 0.0F) {
								method214(anIntArray139, aFloatArray132, (int) f_69_, 0, 0, (int) f_72_, (int) f_71_, f_75_, f_94_, f_108_, f_96_, f_109_, f_98_, f_110_, f_100_);
								f_71_ += f_91_;
								f_72_ += f_92_;
								f_75_ += f_95_;
								f_108_ += f_97_;
								f_109_ += f_99_;
								f_110_ += f_101_;
								f_69_ += (float) anInt127;
							}
						}
					}
				}
			}
		}
	}

	final int method207() {
		return ((Class12) this).anIntArray133[0] % anInt127;
	}

	final void method208(float f, float f_111_, float f_112_, float f_113_, float f_114_, float f_115_, float f_116_, float f_117_, float f_118_, int i) {
		if (aBoolean142) {
			aHa_Sub2_131.method1789((int) f, i, (int) f_111_, (int) f_114_, -10550, (int) f_113_);
			aHa_Sub2_131.method1789((int) f_111_, i, (int) f_112_, (int) f_115_, -10550, (int) f_114_);
			aHa_Sub2_131.method1789((int) f_112_, i, (int) f, (int) f_113_, -10550, (int) f_115_);
		} else {
			float f_119_ = f_114_ - f_113_;
			float f_120_ = f_111_ - f;
			float f_121_ = f_115_ - f_113_;
			float f_122_ = f_112_ - f;
			float f_123_ = f_117_ - f_116_;
			float f_124_ = f_118_ - f_116_;
			float f_125_ = 0.0F;
			if (f_111_ != f)
				f_125_ = (f_114_ - f_113_) / (f_111_ - f);
			float f_126_ = 0.0F;
			if (f_112_ != f_111_)
				f_126_ = (f_115_ - f_114_) / (f_112_ - f_111_);
			float f_127_ = 0.0F;
			if (f_112_ != f)
				f_127_ = (f_113_ - f_115_) / (f - f_112_);
			float f_128_ = f_119_ * f_122_ - f_121_ * f_120_;
			if (f_128_ != 0.0F) {
				float f_129_ = (f_123_ * f_122_ - f_124_ * f_120_) / f_128_;
				float f_130_ = (f_124_ * f_119_ - f_123_ * f_121_) / f_128_;
				if (f <= f_111_ && f <= f_112_) {
					if (!(f >= (float) ((Class12) this).anInt129)) {
						if (f_111_ > (float) ((Class12) this).anInt129)
							f_111_ = (float) ((Class12) this).anInt129;
						if (f_112_ > (float) ((Class12) this).anInt129)
							f_112_ = (float) ((Class12) this).anInt129;
						f_116_ = f_116_ - f_129_ * f_113_ + f_129_;
						if (f_111_ < f_112_) {
							f_115_ = f_113_;
							if (f < 0.0F) {
								f_115_ -= f_127_ * f;
								f_113_ -= f_125_ * f;
								f_116_ -= f_130_ * f;
								f = 0.0F;
							}
							if (f_111_ < 0.0F) {
								f_114_ -= f_126_ * f_111_;
								f_111_ = 0.0F;
							}
							if (f != f_111_ && f_127_ < f_125_ || f == f_111_ && f_127_ > f_126_) {
								f_112_ -= f_111_;
								f_111_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_111_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_115_, (int) f_113_, f_116_, f_129_);
									f_115_ += f_127_;
									f_113_ += f_125_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_115_, (int) f_114_, f_116_, f_129_);
									f_115_ += f_127_;
									f_114_ += f_126_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
							} else {
								f_112_ -= f_111_;
								f_111_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_111_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_113_, (int) f_115_, f_116_, f_129_);
									f_115_ += f_127_;
									f_113_ += f_125_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_114_, (int) f_115_, f_116_, f_129_);
									f_115_ += f_127_;
									f_114_ += f_126_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
							}
						} else {
							f_114_ = f_113_;
							if (f < 0.0F) {
								f_114_ -= f_127_ * f;
								f_113_ -= f_125_ * f;
								f_116_ -= f_130_ * f;
								f = 0.0F;
							}
							if (f_112_ < 0.0F) {
								f_115_ -= f_126_ * f_112_;
								f_112_ = 0.0F;
							}
							if (f != f_112_ && f_127_ < f_125_ || f == f_112_ && f_126_ > f_125_) {
								f_111_ -= f_112_;
								f_112_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_114_, (int) f_113_, f_116_, f_129_);
									f_114_ += f_127_;
									f_113_ += f_125_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
								while (--f_111_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_115_, (int) f_113_, f_116_, f_129_);
									f_115_ += f_126_;
									f_113_ += f_125_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
							} else {
								f_111_ -= f_112_;
								f_112_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_113_, (int) f_114_, f_116_, f_129_);
									f_114_ += f_127_;
									f_113_ += f_125_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
								while (--f_111_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f, i, 0, (int) f_113_, (int) f_115_, f_116_, f_129_);
									f_115_ += f_126_;
									f_113_ += f_125_;
									f_116_ += f_130_;
									f += (float) anInt127;
								}
							}
						}
					}
				} else if (f_111_ <= f_112_) {
					if (!(f_111_ >= (float) ((Class12) this).anInt129)) {
						if (f_112_ > (float) ((Class12) this).anInt129)
							f_112_ = (float) ((Class12) this).anInt129;
						if (f > (float) ((Class12) this).anInt129)
							f = (float) ((Class12) this).anInt129;
						f_117_ = f_117_ - f_129_ * f_114_ + f_129_;
						if (f_112_ < f) {
							f_113_ = f_114_;
							if (f_111_ < 0.0F) {
								f_113_ -= f_125_ * f_111_;
								f_114_ -= f_126_ * f_111_;
								f_117_ -= f_130_ * f_111_;
								f_111_ = 0.0F;
							}
							if (f_112_ < 0.0F) {
								f_115_ -= f_127_ * f_112_;
								f_112_ = 0.0F;
							}
							if (f_111_ != f_112_ && f_125_ < f_126_ || f_111_ == f_112_ && f_125_ > f_127_) {
								f -= f_112_;
								f_112_ -= f_111_;
								f_111_ = (float) (((Class12) this).anIntArray133[(int) f_111_]);
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_113_, (int) f_114_, f_117_, f_129_);
									f_113_ += f_125_;
									f_114_ += f_126_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
								while (--f >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_113_, (int) f_115_, f_117_, f_129_);
									f_113_ += f_125_;
									f_115_ += f_127_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
							} else {
								f -= f_112_;
								f_112_ -= f_111_;
								f_111_ = (float) (((Class12) this).anIntArray133[(int) f_111_]);
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_114_, (int) f_113_, f_117_, f_129_);
									f_113_ += f_125_;
									f_114_ += f_126_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
								while (--f >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_115_, (int) f_113_, f_117_, f_129_);
									f_113_ += f_125_;
									f_115_ += f_127_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
							}
						} else {
							f_115_ = f_114_;
							if (f_111_ < 0.0F) {
								f_115_ -= f_125_ * f_111_;
								f_114_ -= f_126_ * f_111_;
								f_117_ -= f_130_ * f_111_;
								f_111_ = 0.0F;
							}
							if (f < 0.0F) {
								f_113_ -= f_127_ * f;
								f = 0.0F;
							}
							if (f_125_ < f_126_) {
								f_112_ -= f;
								f -= f_111_;
								f_111_ = (float) (((Class12) this).anIntArray133[(int) f_111_]);
								while (--f >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_115_, (int) f_114_, f_117_, f_129_);
									f_115_ += f_125_;
									f_114_ += f_126_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_113_, (int) f_114_, f_117_, f_129_);
									f_113_ += f_127_;
									f_114_ += f_126_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
							} else {
								f_112_ -= f;
								f -= f_111_;
								f_111_ = (float) (((Class12) this).anIntArray133[(int) f_111_]);
								while (--f >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_114_, (int) f_115_, f_117_, f_129_);
									f_115_ += f_125_;
									f_114_ += f_126_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
								while (--f_112_ >= 0.0F) {
									method211(anIntArray139, aFloatArray132, (int) f_111_, i, 0, (int) f_114_, (int) f_113_, f_117_, f_129_);
									f_113_ += f_127_;
									f_114_ += f_126_;
									f_117_ += f_130_;
									f_111_ += (float) anInt127;
								}
							}
						}
					}
				} else if (!(f_112_ >= (float) ((Class12) this).anInt129)) {
					if (f > (float) ((Class12) this).anInt129)
						f = (float) ((Class12) this).anInt129;
					if (f_111_ > (float) ((Class12) this).anInt129)
						f_111_ = (float) ((Class12) this).anInt129;
					f_118_ = f_118_ - f_129_ * f_115_ + f_129_;
					if (f < f_111_) {
						f_114_ = f_115_;
						if (f_112_ < 0.0F) {
							f_114_ -= f_126_ * f_112_;
							f_115_ -= f_127_ * f_112_;
							f_118_ -= f_130_ * f_112_;
							f_112_ = 0.0F;
						}
						if (f < 0.0F) {
							f_113_ -= f_125_ * f;
							f = 0.0F;
						}
						if (f_126_ < f_127_) {
							f_111_ -= f;
							f -= f_112_;
							f_112_ = (float) (((Class12) this).anIntArray133[(int) f_112_]);
							while (--f >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_114_, (int) f_115_, f_118_, f_129_);
								f_114_ += f_126_;
								f_115_ += f_127_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
							while (--f_111_ >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_114_, (int) f_113_, f_118_, f_129_);
								f_114_ += f_126_;
								f_113_ += f_125_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
						} else {
							f_111_ -= f;
							f -= f_112_;
							f_112_ = (float) (((Class12) this).anIntArray133[(int) f_112_]);
							while (--f >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_115_, (int) f_114_, f_118_, f_129_);
								f_114_ += f_126_;
								f_115_ += f_127_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
							while (--f_111_ >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_113_, (int) f_114_, f_118_, f_129_);
								f_114_ += f_126_;
								f_113_ += f_125_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
						}
					} else {
						f_113_ = f_115_;
						if (f_112_ < 0.0F) {
							f_113_ -= f_126_ * f_112_;
							f_115_ -= f_127_ * f_112_;
							f_118_ -= f_130_ * f_112_;
							f_112_ = 0.0F;
						}
						if (f_111_ < 0.0F) {
							f_114_ -= f_125_ * f_111_;
							f_111_ = 0.0F;
						}
						if (f_126_ < f_127_) {
							f -= f_111_;
							f_111_ -= f_112_;
							f_112_ = (float) (((Class12) this).anIntArray133[(int) f_112_]);
							while (--f_111_ >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_113_, (int) f_115_, f_118_, f_129_);
								f_113_ += f_126_;
								f_115_ += f_127_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
							while (--f >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_114_, (int) f_115_, f_118_, f_129_);
								f_114_ += f_125_;
								f_115_ += f_127_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
						} else {
							f -= f_111_;
							f_111_ -= f_112_;
							f_112_ = (float) (((Class12) this).anIntArray133[(int) f_112_]);
							while (--f_111_ >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_115_, (int) f_113_, f_118_, f_129_);
								f_113_ += f_126_;
								f_115_ += f_127_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
							while (--f >= 0.0F) {
								method211(anIntArray139, aFloatArray132, (int) f_112_, i, 0, (int) f_115_, (int) f_114_, f_118_, f_129_);
								f_114_ += f_125_;
								f_115_ += f_127_;
								f_118_ += f_130_;
								f_112_ += (float) anInt127;
							}
						}
					}
				}
			}
		}
	}

	final void method209(float f, float f_131_, float f_132_, float f_133_, float f_134_, float f_135_, float f_136_, float f_137_, float f_138_, float f_139_, float f_140_, float f_141_, float f_142_, float f_143_, float f_144_, int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, float f_152_, int i_153_, float f_154_, int i_155_, float f_156_) {
		if (i_151_ != anInt158) {
			anIntArray143 = aHa_Sub2_131.method1919(i_151_);
			if (anIntArray143 == null) {
				method206((float) (int) f, (float) (int) f_131_, (float) (int) f_132_, (float) (int) f_133_, (float) (int) f_134_, (float) (int) f_135_, (float) (int) f_136_, (float) (int) f_137_, (float) (int) f_138_, Class98_Sub46_Sub5.method1544(i_147_ | i_148_ << 24, (byte) 117, i), Class98_Sub46_Sub5.method1544(i_147_ | i_149_ << 24, (byte) 122, i_145_), Class98_Sub46_Sub5.method1544(i_147_ | i_150_ << 24, (byte) 125, i_146_));
				return;
			}
			anInt151 = (aHa_Sub2_131.method1925(i_151_) ? 64 : ((ha_Sub2) aHa_Sub2_131).anInt4482);
			anInt146 = anInt151 - 1;
			anInt147 = aHa_Sub2_131.method1912(i_151_);
		}
		aFloat157 = f_152_;
		if (i_153_ != anInt144) {
			anIntArray145 = aHa_Sub2_131.method1919(i_153_);
			if (anIntArray145 == null) {
				method206((float) (int) f, (float) (int) f_131_, (float) (int) f_132_, (float) (int) f_133_, (float) (int) f_134_, (float) (int) f_135_, (float) (int) f_136_, (float) (int) f_137_, (float) (int) f_138_, Class98_Sub46_Sub5.method1544(i_147_ | i_148_ << 24, (byte) 104, i), Class98_Sub46_Sub5.method1544(i_147_ | i_149_ << 24, (byte) 115, i_145_), Class98_Sub46_Sub5.method1544(i_147_ | i_150_ << 24, (byte) 110, i_146_));
				return;
			}
			anInt153 = (aHa_Sub2_131.method1925(i_153_) ? 64 : ((ha_Sub2) aHa_Sub2_131).anInt4482);
			anInt152 = anInt153 - 1;
		}
		aFloat149 = f_154_;
		if (i_155_ != anInt159) {
			anIntArray156 = aHa_Sub2_131.method1919(i_155_);
			if (anIntArray156 == null) {
				method206((float) (int) f, (float) (int) f_131_, (float) (int) f_132_, (float) (int) f_133_, (float) (int) f_134_, (float) (int) f_135_, (float) (int) f_136_, (float) (int) f_137_, (float) (int) f_138_, Class98_Sub46_Sub5.method1544(i_147_ | i_148_ << 24, (byte) 117, i), Class98_Sub46_Sub5.method1544(i_147_ | i_149_ << 24, (byte) 122, i_145_), Class98_Sub46_Sub5.method1544(i_147_ | i_150_ << 24, (byte) 105, i_146_));
				return;
			}
			anInt160 = (aHa_Sub2_131.method1925(i_155_) ? 64 : ((ha_Sub2) aHa_Sub2_131).anInt4482);
			anInt148 = anInt160 - 1;
		}
		aFloat150 = f_156_;
		anInt155 = i_147_;
		float f_157_ = (float) (i >> 24 & 0xff);
		float f_158_ = (float) (i_145_ >> 24 & 0xff);
		float f_159_ = (float) (i_146_ >> 24 & 0xff);
		float f_160_ = (float) (i >> 16 & 0xff);
		float f_161_ = (float) (i_145_ >> 16 & 0xff);
		float f_162_ = (float) (i_146_ >> 16 & 0xff);
		float f_163_ = (float) (i >> 8 & 0xff);
		float f_164_ = (float) (i_145_ >> 8 & 0xff);
		float f_165_ = (float) (i_146_ >> 8 & 0xff);
		float f_166_ = (float) (i & 0xff);
		float f_167_ = (float) (i_145_ & 0xff);
		float f_168_ = (float) (i_146_ & 0xff);
		f_139_ /= f_136_;
		f_140_ /= f_137_;
		f_141_ /= f_138_;
		f_142_ /= f_136_;
		f_143_ /= f_137_;
		f_144_ /= f_138_;
		f_136_ = 1.0F / f_136_;
		f_137_ = 1.0F / f_137_;
		f_138_ = 1.0F / f_138_;
		float f_169_ = 1.0F;
		float f_170_ = 0.0F;
		float f_171_ = 0.0F;
		float f_172_ = 0.0F;
		float f_173_ = 1.0F;
		float f_174_ = 0.0F;
		float f_175_ = 0.0F;
		float f_176_ = 0.0F;
		float f_177_ = 0.0F;
		float f_178_ = 0.0F;
		float f_179_ = 0.0F;
		float f_180_ = 0.0F;
		float f_181_ = 0.0F;
		float f_182_ = 0.0F;
		float f_183_ = 0.0F;
		float f_184_ = 0.0F;
		float f_185_ = 0.0F;
		if (f_131_ != f) {
			float f_186_ = f_131_ - f;
			f_175_ = (f_134_ - f_133_) / f_186_;
			f_176_ = (f_137_ - f_136_) / f_186_;
			f_177_ = (f_140_ - f_139_) / f_186_;
			f_178_ = (f_143_ - f_142_) / f_186_;
			f_179_ = (float) (i_149_ - i_148_) / f_186_;
			f_180_ = (f_158_ - f_157_) / f_186_;
			f_181_ = (f_161_ - f_160_) / f_186_;
			f_182_ = (f_164_ - f_163_) / f_186_;
			f_183_ = (f_167_ - f_166_) / f_186_;
			f_184_ = (f_170_ - f_169_) / f_186_;
			f_185_ = (f_173_ - f_172_) / f_186_;
		}
		float f_187_ = 0.0F;
		float f_188_ = 0.0F;
		float f_189_ = 0.0F;
		float f_190_ = 0.0F;
		float f_191_ = 0.0F;
		float f_192_ = 0.0F;
		float f_193_ = 0.0F;
		float f_194_ = 0.0F;
		float f_195_ = 0.0F;
		float f_196_ = 0.0F;
		float f_197_ = 0.0F;
		if (f_132_ != f_131_) {
			float f_198_ = f_132_ - f_131_;
			f_187_ = (f_135_ - f_134_) / f_198_;
			f_188_ = (f_138_ - f_137_) / f_198_;
			f_189_ = (f_141_ - f_140_) / f_198_;
			f_190_ = (f_144_ - f_143_) / f_198_;
			f_191_ = (float) (i_150_ - i_149_) / f_198_;
			f_192_ = (f_159_ - f_158_) / f_198_;
			f_193_ = (f_162_ - f_161_) / f_198_;
			f_194_ = (f_165_ - f_164_) / f_198_;
			f_195_ = (f_168_ - f_167_) / f_198_;
			f_196_ = (f_171_ - f_170_) / f_198_;
			f_197_ = (f_174_ - f_173_) / f_198_;
		}
		float f_199_ = 0.0F;
		float f_200_ = 0.0F;
		float f_201_ = 0.0F;
		float f_202_ = 0.0F;
		float f_203_ = 0.0F;
		float f_204_ = 0.0F;
		float f_205_ = 0.0F;
		float f_206_ = 0.0F;
		float f_207_ = 0.0F;
		float f_208_ = 0.0F;
		float f_209_ = 0.0F;
		if (f != f_132_) {
			float f_210_ = f - f_132_;
			f_199_ = (f_133_ - f_135_) / f_210_;
			f_200_ = (f_136_ - f_138_) / f_210_;
			f_201_ = (f_139_ - f_141_) / f_210_;
			f_202_ = (f_142_ - f_144_) / f_210_;
			f_203_ = (float) (i_148_ - i_150_) / f_210_;
			f_204_ = (f_157_ - f_159_) / f_210_;
			f_205_ = (f_160_ - f_162_) / f_210_;
			f_206_ = (f_163_ - f_165_) / f_210_;
			f_207_ = (f_166_ - f_168_) / f_210_;
			f_208_ = (f_169_ - f_171_) / f_210_;
			f_209_ = (f_172_ - f_174_) / f_210_;
		}
		if (f <= f_131_ && f <= f_132_) {
			if (!(f >= (float) ((Class12) this).anInt129)) {
				if (f_131_ > (float) ((Class12) this).anInt129)
					f_131_ = (float) ((Class12) this).anInt129;
				if (f_132_ > (float) ((Class12) this).anInt129)
					f_132_ = (float) ((Class12) this).anInt129;
				if (f_131_ < f_132_) {
					f_135_ = f_133_;
					f_138_ = f_136_;
					f_141_ = f_139_;
					f_144_ = f_142_;
					i_150_ = i_148_;
					f_159_ = f_157_;
					f_162_ = f_160_;
					f_165_ = f_163_;
					f_168_ = f_166_;
					f_171_ = f_169_;
					f_174_ = f_172_;
					if (f < 0.0F) {
						f_133_ -= f_175_ * f;
						f_135_ -= f_199_ * f;
						f_136_ -= f_176_ * f;
						f_138_ -= f_200_ * f;
						f_139_ -= f_177_ * f;
						f_141_ -= f_201_ * f;
						f_142_ -= f_178_ * f;
						f_144_ -= f_202_ * f;
						i_148_ -= f_179_ * f;
						i_150_ -= f_203_ * f;
						f_157_ -= f_180_ * f;
						f_159_ -= f_204_ * f;
						f_160_ -= f_181_ * f;
						f_162_ -= f_205_ * f;
						f_163_ -= f_182_ * f;
						f_165_ -= f_206_ * f;
						f_166_ -= f_183_ * f;
						f_168_ -= f_207_ * f;
						f_169_ -= f_184_ * f;
						f_171_ -= f_208_ * f;
						f_172_ -= f_185_ * f;
						f_174_ -= f_209_ * f;
						f = 0.0F;
					}
					if (f_131_ < 0.0F) {
						f_134_ -= f_187_ * f_131_;
						f_137_ -= f_188_ * f_131_;
						f_140_ -= f_189_ * f_131_;
						f_143_ -= f_190_ * f_131_;
						i_149_ -= f_191_ * f_131_;
						f_158_ -= f_192_ * f_131_;
						f_161_ -= f_193_ * f_131_;
						f_164_ -= f_194_ * f_131_;
						f_167_ -= f_195_ * f_131_;
						f_170_ -= f_196_ * f_131_;
						f_173_ -= f_197_ * f_131_;
						f_131_ = 0.0F;
					}
					if (f != f_131_ && f_199_ < f_175_ || f == f_131_ && f_199_ > f_187_) {
						f_132_ -= f_131_;
						f_131_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_131_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_135_, (int) f_133_, f_138_, f_136_, f_141_, f_139_, f_144_, f_142_, (float) i_150_, (float) i_148_, f_159_, f_157_, f_162_, f_160_, f_165_, f_163_, f_168_, f_166_, f_171_, f_169_, f_174_, f_172_);
							f_133_ += f_175_;
							f_135_ += f_199_;
							f_136_ += f_176_;
							f_138_ += f_200_;
							f_139_ += f_177_;
							f_141_ += f_201_;
							f_142_ += f_178_;
							f_144_ += f_202_;
							i_148_ += f_179_;
							i_150_ += f_203_;
							f_157_ += f_180_;
							f_159_ += f_204_;
							f_160_ += f_181_;
							f_162_ += f_205_;
							f_163_ += f_182_;
							f_165_ += f_206_;
							f_166_ += f_183_;
							f_168_ += f_207_;
							f_169_ += f_184_;
							f_171_ += f_208_;
							f_172_ += f_185_;
							f_174_ += f_185_;
							f += (float) anInt127;
						}
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_135_, (int) f_134_, f_138_, f_137_, f_141_, f_140_, f_144_, f_143_, (float) i_150_, (float) i_149_, f_159_, f_158_, f_162_, f_161_, f_165_, f_164_, f_168_, f_167_, f_171_, f_170_, f_174_, f_173_);
							f_134_ += f_187_;
							f_135_ += f_199_;
							f_137_ += f_188_;
							f_138_ += f_200_;
							f_140_ += f_189_;
							f_141_ += f_201_;
							f_143_ += f_190_;
							f_144_ += f_202_;
							i_149_ += f_191_;
							i_150_ += f_203_;
							f_158_ += f_192_;
							f_159_ += f_204_;
							f_161_ += f_193_;
							f_162_ += f_205_;
							f_164_ += f_194_;
							f_165_ += f_206_;
							f_167_ += f_195_;
							f_168_ += f_207_;
							f_170_ += f_196_;
							f_171_ += f_208_;
							f_173_ += f_197_;
							f_174_ += f_209_;
							f += (float) anInt127;
						}
					} else {
						f_132_ -= f_131_;
						f_131_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_131_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_133_, (int) f_135_, f_136_, f_138_, f_139_, f_141_, f_142_, f_144_, (float) i_148_, (float) i_150_, f_157_, f_159_, f_160_, f_162_, f_163_, f_165_, f_166_, f_168_, f_169_, f_171_, f_172_, f_174_);
							f_133_ += f_175_;
							f_135_ += f_199_;
							f_136_ += f_176_;
							f_138_ += f_200_;
							f_139_ += f_177_;
							f_141_ += f_201_;
							f_142_ += f_178_;
							f_144_ += f_202_;
							i_148_ += f_179_;
							i_150_ += f_203_;
							f_157_ += f_180_;
							f_159_ += f_204_;
							f_160_ += f_181_;
							f_162_ += f_205_;
							f_163_ += f_182_;
							f_165_ += f_206_;
							f_166_ += f_183_;
							f_168_ += f_207_;
							f_169_ += f_184_;
							f_171_ += f_208_;
							f_172_ += f_185_;
							f_174_ += f_209_;
							f += (float) anInt127;
						}
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_134_, (int) f_135_, f_137_, f_138_, f_140_, f_141_, f_143_, f_144_, (float) i_149_, (float) i_150_, f_158_, f_159_, f_161_, f_162_, f_164_, f_165_, f_167_, f_168_, f_170_, f_171_, f_173_, f_174_);
							f_134_ += f_187_;
							f_135_ += f_199_;
							f_137_ += f_188_;
							f_138_ += f_200_;
							f_140_ += f_189_;
							f_141_ += f_201_;
							f_143_ += f_190_;
							f_144_ += f_202_;
							i_149_ += f_191_;
							i_150_ += f_203_;
							f_158_ += f_192_;
							f_159_ += f_204_;
							f_161_ += f_193_;
							f_162_ += f_205_;
							f_164_ += f_194_;
							f_165_ += f_206_;
							f_167_ += f_195_;
							f_168_ += f_207_;
							f_170_ += f_196_;
							f_171_ += f_208_;
							f_173_ += f_197_;
							f_174_ += f_209_;
							f += (float) anInt127;
						}
					}
				} else {
					f_134_ = f_133_;
					f_137_ = f_136_;
					f_140_ = f_139_;
					f_143_ = f_142_;
					i_149_ = i_148_;
					f_158_ = f_157_;
					f_161_ = f_160_;
					f_164_ = f_163_;
					f_167_ = f_166_;
					f_170_ = f_169_;
					f_173_ = f_172_;
					if (f < 0.0F) {
						f_133_ -= f_175_ * f;
						f_134_ -= f_199_ * f;
						f_136_ -= f_176_ * f;
						f_137_ -= f_200_ * f;
						f_139_ -= f_177_ * f;
						f_140_ -= f_201_ * f;
						f_142_ -= f_178_ * f;
						f_143_ -= f_202_ * f;
						i_148_ -= f_179_ * f;
						i_149_ -= f_203_ * f;
						f_157_ -= f_180_ * f;
						f_158_ -= f_204_ * f;
						f_160_ -= f_181_ * f;
						f_161_ -= f_205_ * f;
						f_163_ -= f_182_ * f;
						f_164_ -= f_206_ * f;
						f_166_ -= f_183_ * f;
						f_167_ -= f_207_ * f;
						f_169_ -= f_184_ * f;
						f_170_ -= f_208_ * f;
						f_172_ -= f_185_ * f;
						f_173_ -= f_209_ * f;
						f = 0.0F;
					}
					if (f_132_ < 0.0F) {
						f_135_ -= f_187_ * f_132_;
						f_138_ -= f_188_ * f_132_;
						f_141_ -= f_189_ * f_132_;
						f_144_ -= f_190_ * f_132_;
						i_150_ -= f_191_ * f_132_;
						f_159_ -= f_192_ * f_132_;
						f_162_ -= f_193_ * f_132_;
						f_165_ -= f_194_ * f_132_;
						f_168_ -= f_195_ * f_132_;
						f_171_ -= f_196_ * f_132_;
						f_174_ -= f_197_ * f_132_;
						f_132_ = 0.0F;
					}
					if (f != f_132_ && f_199_ < f_175_ || f == f_132_ && f_187_ > f_175_) {
						f_131_ -= f_132_;
						f_132_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_134_, (int) f_133_, f_137_, f_136_, f_140_, f_139_, f_143_, f_142_, (float) i_149_, (float) i_148_, f_158_, f_157_, f_161_, f_160_, f_164_, f_163_, f_167_, f_166_, f_170_, f_169_, f_173_, f_172_);
							f_133_ += f_175_;
							f_134_ += f_199_;
							f_136_ += f_176_;
							f_137_ += f_200_;
							f_139_ += f_177_;
							f_140_ += f_201_;
							f_142_ += f_178_;
							f_143_ += f_202_;
							i_148_ += f_179_;
							i_149_ += f_203_;
							f_157_ += f_180_;
							f_158_ += f_204_;
							f_160_ += f_181_;
							f_161_ += f_205_;
							f_163_ += f_182_;
							f_164_ += f_206_;
							f_166_ += f_183_;
							f_167_ += f_207_;
							f_169_ += f_184_;
							f_170_ += f_208_;
							f_172_ += f_185_;
							f_173_ += f_209_;
							f += (float) anInt127;
						}
						while (--f_131_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_135_, (int) f_133_, f_138_, f_136_, f_141_, f_139_, f_144_, f_142_, (float) i_150_, (float) i_148_, f_159_, f_157_, f_162_, f_160_, f_165_, f_163_, f_168_, f_166_, f_171_, f_169_, f_174_, f_172_);
							f_135_ += f_187_;
							f_133_ += f_175_;
							f_138_ += f_188_;
							f_136_ += f_176_;
							f_141_ += f_189_;
							f_139_ += f_177_;
							f_144_ += f_190_;
							f_142_ += f_178_;
							i_150_ += f_191_;
							i_148_ += f_179_;
							f_159_ += f_192_;
							f_157_ += f_180_;
							f_162_ += f_193_;
							f_160_ += f_181_;
							f_165_ += f_194_;
							f_163_ += f_182_;
							f_168_ += f_195_;
							f_166_ += f_183_;
							f_171_ += f_196_;
							f_169_ += f_184_;
							f_174_ += f_197_;
							f_172_ += f_185_;
							f += (float) anInt127;
						}
					} else {
						f_131_ -= f_132_;
						f_132_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_133_, (int) f_134_, f_136_, f_137_, f_139_, f_140_, f_142_, f_143_, (float) i_148_, (float) i_149_, f_157_, f_158_, f_160_, f_161_, f_163_, f_164_, f_166_, f_167_, f_169_, f_170_, f_172_, f_173_);
							f_134_ += f_199_;
							f_133_ += f_175_;
							f_137_ += f_200_;
							f_136_ += f_176_;
							f_140_ += f_201_;
							f_139_ += f_177_;
							f_143_ += f_202_;
							f_142_ += f_178_;
							i_149_ += f_203_;
							i_148_ += f_179_;
							f_158_ += f_204_;
							f_157_ += f_180_;
							f_161_ += f_205_;
							f_160_ += f_181_;
							f_164_ += f_206_;
							f_163_ += f_182_;
							f_167_ += f_207_;
							f_166_ += f_183_;
							f_170_ += f_208_;
							f_169_ += f_184_;
							f_173_ += f_209_;
							f_172_ += f_185_;
							f += (float) anInt127;
						}
						while (--f_131_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f, (int) f_133_, (int) f_135_, f_136_, f_138_, f_139_, f_141_, f_142_, f_144_, (float) i_148_, (float) i_150_, f_157_, f_159_, f_160_, f_162_, f_163_, f_165_, f_166_, f_168_, f_169_, f_171_, f_172_, f_174_);
							f_133_ += f_175_;
							f_135_ += f_187_;
							f_136_ += f_176_;
							f_138_ += f_188_;
							f_139_ += f_177_;
							f_141_ += f_189_;
							f_142_ += f_178_;
							f_144_ += f_190_;
							i_148_ += f_179_;
							i_150_ += f_191_;
							f_157_ += f_180_;
							f_159_ += f_192_;
							f_160_ += f_181_;
							f_162_ += f_193_;
							f_163_ += f_182_;
							f_165_ += f_194_;
							f_166_ += f_183_;
							f_168_ += f_195_;
							f_169_ += f_184_;
							f_171_ += f_196_;
							f_172_ += f_185_;
							f_174_ += f_197_;
							f += (float) anInt127;
						}
					}
				}
			}
		} else if (f_131_ <= f_132_) {
			if (!(f_131_ >= (float) ((Class12) this).anInt129)) {
				if (f_132_ > (float) ((Class12) this).anInt129)
					f_132_ = (float) ((Class12) this).anInt129;
				if (f > (float) ((Class12) this).anInt129)
					f = (float) ((Class12) this).anInt129;
				if (f_132_ < f) {
					f_133_ = f_134_;
					f_136_ = f_137_;
					f_139_ = f_140_;
					f_142_ = f_143_;
					i_148_ = i_149_;
					f_157_ = f_158_;
					f_160_ = f_161_;
					f_163_ = f_164_;
					f_166_ = f_167_;
					f_169_ = f_170_;
					f_172_ = f_173_;
					if (f_131_ < 0.0F) {
						f_133_ -= f_175_ * f_131_;
						f_134_ -= f_187_ * f_131_;
						f_136_ -= f_176_ * f_131_;
						f_137_ -= f_188_ * f_131_;
						f_139_ -= f_177_ * f_131_;
						f_140_ -= f_189_ * f_131_;
						f_142_ -= f_178_ * f_131_;
						f_143_ -= f_190_ * f_131_;
						i_148_ -= f_179_ * f_131_;
						i_149_ -= f_191_ * f_131_;
						f_157_ -= f_180_ * f_131_;
						f_158_ -= f_192_ * f_131_;
						f_160_ -= f_181_ * f_131_;
						f_161_ -= f_193_ * f_131_;
						f_163_ -= f_182_ * f_131_;
						f_164_ -= f_194_ * f_131_;
						f_166_ -= f_183_ * f_131_;
						f_167_ -= f_195_ * f_131_;
						f_169_ -= f_184_ * f_131_;
						f_170_ -= f_196_ * f_131_;
						f_172_ -= f_185_ * f_131_;
						f_173_ -= f_197_ * f_131_;
						f_131_ = 0.0F;
					}
					if (f_132_ < 0.0F) {
						f_135_ -= f_199_ * f_132_;
						f_138_ -= f_200_ * f_132_;
						f_141_ -= f_201_ * f_132_;
						f_144_ -= f_202_ * f_132_;
						i_150_ -= f_203_ * f_132_;
						f_159_ -= f_204_ * f_132_;
						f_162_ -= f_205_ * f_132_;
						f_165_ -= f_206_ * f_132_;
						f_168_ -= f_207_ * f_132_;
						f_171_ -= f_208_ * f_132_;
						f_174_ -= f_209_ * f_132_;
						f_132_ = 0.0F;
					}
					if (f_131_ != f_132_ && f_175_ < f_187_ || f_131_ == f_132_ && f_175_ > f_199_) {
						f -= f_132_;
						f_132_ -= f_131_;
						f_131_ = (float) (((Class12) this).anIntArray133[(int) f_131_]);
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_133_, (int) f_134_, f_136_, f_137_, f_139_, f_140_, f_142_, f_143_, (float) i_148_, (float) i_149_, f_157_, f_158_, f_160_, f_161_, f_163_, f_164_, f_166_, f_167_, f_169_, f_170_, f_172_, f_173_);
							f_133_ += f_175_;
							f_134_ += f_187_;
							f_136_ += f_176_;
							f_137_ += f_188_;
							f_139_ += f_177_;
							f_140_ += f_189_;
							f_142_ += f_178_;
							f_143_ += f_190_;
							i_148_ += f_179_;
							i_149_ += f_191_;
							f_157_ += f_180_;
							f_158_ += f_192_;
							f_160_ += f_181_;
							f_161_ += f_193_;
							f_163_ += f_182_;
							f_164_ += f_194_;
							f_166_ += f_183_;
							f_167_ += f_195_;
							f_169_ += f_184_;
							f_170_ += f_196_;
							f_172_ += f_185_;
							f_173_ += f_197_;
							f_131_ += (float) anInt127;
						}
						while (--f >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_133_, (int) f_135_, f_136_, f_138_, f_139_, f_141_, f_142_, f_144_, (float) i_148_, (float) i_150_, f_157_, f_159_, f_160_, f_162_, f_163_, f_165_, f_166_, f_168_, f_169_, f_171_, f_172_, f_174_);
							f_133_ += f_175_;
							f_135_ += f_199_;
							f_136_ += f_176_;
							f_138_ += f_200_;
							f_139_ += f_177_;
							f_141_ += f_201_;
							f_142_ += f_178_;
							f_144_ += f_202_;
							i_148_ += f_179_;
							i_150_ += f_203_;
							f_157_ += f_180_;
							f_159_ += f_204_;
							f_160_ += f_181_;
							f_162_ += f_205_;
							f_163_ += f_182_;
							f_165_ += f_206_;
							f_166_ += f_183_;
							f_168_ += f_207_;
							f_169_ += f_184_;
							f_171_ += f_208_;
							f_172_ += f_185_;
							f_174_ += f_209_;
							f_131_ += (float) anInt127;
						}
					} else {
						f -= f_132_;
						f_132_ -= f_131_;
						f_131_ = (float) (((Class12) this).anIntArray133[(int) f_131_]);
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_134_, (int) f_133_, f_137_, f_136_, f_140_, f_139_, f_143_, f_142_, (float) i_149_, (float) i_148_, f_158_, f_157_, f_161_, f_160_, f_164_, f_163_, f_167_, f_166_, f_170_, f_169_, f_173_, f_172_);
							f_134_ += f_187_;
							f_133_ += f_175_;
							f_137_ += f_188_;
							f_136_ += f_176_;
							f_140_ += f_189_;
							f_139_ += f_177_;
							f_143_ += f_190_;
							f_142_ += f_178_;
							i_149_ += f_191_;
							i_148_ += f_179_;
							f_158_ += f_192_;
							f_157_ += f_180_;
							f_161_ += f_193_;
							f_160_ += f_181_;
							f_164_ += f_194_;
							f_163_ += f_182_;
							f_167_ += f_195_;
							f_166_ += f_183_;
							f_171_ += f_196_;
							f_169_ += f_184_;
							f_173_ += f_197_;
							f_172_ += f_185_;
							f_131_ += (float) anInt127;
						}
						while (--f >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_135_, (int) f_133_, f_138_, f_136_, f_141_, f_139_, f_144_, f_142_, (float) i_150_, (float) i_148_, f_159_, f_157_, f_162_, f_160_, f_165_, f_163_, f_168_, f_166_, f_171_, f_169_, f_174_, f_172_);
							f_135_ += f_199_;
							f_133_ += f_175_;
							f_138_ += f_200_;
							f_136_ += f_176_;
							f_141_ += f_201_;
							f_139_ += f_177_;
							f_144_ += f_202_;
							f_142_ += f_178_;
							i_150_ += f_203_;
							i_148_ += f_179_;
							f_159_ += f_204_;
							f_157_ += f_180_;
							f_162_ += f_205_;
							f_160_ += f_181_;
							f_165_ += f_206_;
							f_163_ += f_182_;
							f_168_ += f_207_;
							f_166_ += f_183_;
							f_171_ += f_208_;
							f_169_ += f_184_;
							f_174_ += f_209_;
							f_172_ += f_185_;
							f_131_ += (float) anInt127;
						}
					}
				} else {
					f_135_ = f_134_;
					f_138_ = f_137_;
					f_141_ = f_140_;
					f_144_ = f_143_;
					i_150_ = i_149_;
					f_159_ = f_158_;
					f_162_ = f_161_;
					f_165_ = f_164_;
					f_168_ = f_167_;
					f_171_ = f_170_;
					f_174_ = f_173_;
					if (f_131_ < 0.0F) {
						f_135_ -= f_175_ * f_131_;
						f_134_ -= f_187_ * f_131_;
						f_138_ -= f_176_ * f_131_;
						f_137_ -= f_188_ * f_131_;
						f_141_ -= f_177_ * f_131_;
						f_140_ -= f_189_ * f_131_;
						f_144_ -= f_178_ * f_131_;
						f_143_ -= f_190_ * f_131_;
						i_150_ -= f_179_ * f_131_;
						i_149_ -= f_191_ * f_131_;
						f_159_ -= f_180_ * f_131_;
						f_158_ -= f_192_ * f_131_;
						f_162_ -= f_181_ * f_131_;
						f_161_ -= f_193_ * f_131_;
						f_165_ -= f_182_ * f_131_;
						f_164_ -= f_194_ * f_131_;
						f_168_ -= f_183_ * f_131_;
						f_167_ -= f_195_ * f_131_;
						f_171_ -= f_184_ * f_131_;
						f_170_ -= f_196_ * f_131_;
						f_174_ -= f_185_ * f_131_;
						f_173_ -= f_197_ * f_131_;
						f_131_ = 0.0F;
					}
					if (f < 0.0F) {
						f_133_ -= f_199_ * f;
						f_136_ -= f_200_ * f;
						f_139_ -= f_201_ * f;
						f_142_ -= f_202_ * f;
						i_148_ -= f_203_ * f;
						f_157_ -= f_204_ * f;
						f_160_ -= f_205_ * f;
						f_163_ -= f_206_ * f;
						f_166_ -= f_207_ * f;
						f_169_ -= f_208_ * f;
						f_172_ -= f_209_ * f;
						f = 0.0F;
					}
					f_132_ -= f;
					f -= f_131_;
					f_131_ = (float) ((Class12) this).anIntArray133[(int) f_131_];
					if (f_175_ < f_187_) {
						while (--f >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_135_, (int) f_134_, f_138_, f_137_, f_141_, f_140_, f_144_, f_143_, (float) i_150_, (float) i_149_, f_159_, f_158_, f_162_, f_161_, f_165_, f_164_, f_168_, f_167_, f_171_, f_170_, f_174_, f_173_);
							f_135_ += f_175_;
							f_134_ += f_187_;
							f_138_ += f_176_;
							f_137_ += f_188_;
							f_141_ += f_177_;
							f_140_ += f_189_;
							f_144_ += f_178_;
							f_143_ += f_190_;
							i_150_ += f_179_;
							i_149_ += f_191_;
							f_159_ += f_180_;
							f_158_ += f_192_;
							f_162_ += f_181_;
							f_161_ += f_193_;
							f_165_ += f_182_;
							f_164_ += f_194_;
							f_168_ += f_183_;
							f_167_ += f_195_;
							f_171_ += f_184_;
							f_170_ += f_196_;
							f_174_ += f_185_;
							f_173_ += f_197_;
							f_131_ += (float) anInt127;
						}
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_133_, (int) f_134_, f_136_, f_137_, f_139_, f_140_, f_142_, f_143_, (float) i_148_, (float) i_149_, f_157_, f_158_, f_160_, f_161_, f_163_, f_164_, f_166_, f_167_, f_169_, f_170_, f_172_, f_173_);
							f_133_ += f_199_;
							f_134_ += f_187_;
							f_136_ += f_200_;
							f_137_ += f_188_;
							f_139_ += f_201_;
							f_140_ += f_189_;
							f_142_ += f_202_;
							f_143_ += f_190_;
							i_148_ += f_203_;
							i_149_ += f_191_;
							f_157_ += f_204_;
							f_158_ += f_192_;
							f_160_ += f_205_;
							f_161_ += f_193_;
							f_163_ += f_206_;
							f_164_ += f_194_;
							f_166_ += f_207_;
							f_167_ += f_195_;
							f_169_ += f_208_;
							f_170_ += f_196_;
							f_172_ += f_209_;
							f_173_ += f_197_;
							f_131_ += (float) anInt127;
						}
					} else {
						while (--f >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_134_, (int) f_135_, f_137_, f_138_, f_140_, f_141_, f_143_, f_144_, (float) i_149_, (float) i_150_, f_158_, f_159_, f_161_, f_162_, f_164_, f_165_, f_167_, f_168_, f_170_, f_171_, f_173_, f_174_);
							f_134_ += f_187_;
							f_135_ += f_175_;
							f_137_ += f_188_;
							f_138_ += f_176_;
							f_140_ += f_189_;
							f_141_ += f_177_;
							f_143_ += f_190_;
							f_144_ += f_178_;
							i_149_ += f_191_;
							i_150_ += f_179_;
							f_158_ += f_192_;
							f_159_ += f_180_;
							f_161_ += f_193_;
							f_162_ += f_181_;
							f_164_ += f_194_;
							f_165_ += f_182_;
							f_167_ += f_195_;
							f_168_ += f_183_;
							f_170_ += f_196_;
							f_171_ += f_184_;
							f_173_ += f_197_;
							f_174_ += f_185_;
							f_131_ += (float) anInt127;
						}
						while (--f_132_ >= 0.0F) {
							method215(anIntArray139, anIntArray143, (int) f_131_, (int) f_134_, (int) f_133_, f_137_, f_136_, f_140_, f_139_, f_143_, f_142_, (float) i_149_, (float) i_148_, f_158_, f_157_, f_161_, f_160_, f_164_, f_163_, f_167_, f_166_, f_170_, f_169_, f_173_, f_172_);
							f_134_ += f_187_;
							f_133_ += f_199_;
							f_137_ += f_188_;
							f_136_ += f_200_;
							f_140_ += f_189_;
							f_139_ += f_201_;
							f_143_ += f_190_;
							f_142_ += f_202_;
							i_149_ += f_191_;
							i_148_ += f_203_;
							f_158_ += f_192_;
							f_157_ += f_204_;
							f_161_ += f_193_;
							f_160_ += f_205_;
							f_164_ += f_194_;
							f_163_ += f_206_;
							f_167_ += f_195_;
							f_166_ += f_207_;
							f_170_ += f_196_;
							f_169_ += f_208_;
							f_173_ += f_197_;
							f_172_ += f_209_;
							f_131_ += (float) anInt127;
						}
					}
				}
			}
		} else if (!(f_132_ >= (float) ((Class12) this).anInt129)) {
			if (f > (float) ((Class12) this).anInt129)
				f = (float) ((Class12) this).anInt129;
			if (f_131_ > (float) ((Class12) this).anInt129)
				f_131_ = (float) ((Class12) this).anInt129;
			if (f < f_131_) {
				f_134_ = f_135_;
				f_137_ = f_138_;
				f_140_ = f_141_;
				f_143_ = f_144_;
				i_149_ = i_150_;
				f_158_ = f_159_;
				f_161_ = f_162_;
				f_164_ = f_165_;
				f_167_ = f_168_;
				f_170_ = f_171_;
				f_173_ = f_174_;
				if (f_132_ < 0.0F) {
					f_135_ -= f_199_ * f_132_;
					f_134_ -= f_187_ * f_132_;
					f_138_ -= f_200_ * f_132_;
					f_137_ -= f_188_ * f_132_;
					f_141_ -= f_201_ * f_132_;
					f_140_ -= f_189_ * f_132_;
					f_144_ -= f_202_ * f_132_;
					f_143_ -= f_190_ * f_132_;
					i_150_ -= f_203_ * 3.0F;
					i_149_ -= f_191_ * f_132_;
					f_159_ -= f_204_ * f_132_;
					f_158_ -= f_192_ * f_132_;
					f_162_ -= f_205_ * f_132_;
					f_161_ -= f_193_ * f_132_;
					f_165_ -= f_206_ * f_132_;
					f_164_ -= f_194_ * f_132_;
					f_168_ -= f_207_ * f_132_;
					f_167_ -= f_195_ * f_132_;
					f_171_ -= f_208_ * f_132_;
					f_170_ -= f_196_ * f_132_;
					f_174_ -= f_209_ * f_132_;
					f_173_ -= f_197_ * f_132_;
					f_132_ = 0.0F;
				}
				if (f < 0.0F) {
					f_133_ -= f_175_ * f;
					f_136_ -= f_176_ * f;
					f_139_ -= f_177_ * f;
					f_142_ -= f_178_ * f;
					i_148_ -= f_179_ * f;
					f_157_ -= f_180_ * f;
					f_160_ -= f_181_ * f;
					f_163_ -= f_182_ * f;
					f_166_ -= f_183_ * f;
					f_169_ -= f_184_ * f;
					f_172_ -= f_185_ * f;
					f = 0.0F;
				}
				if (f_187_ < f_199_) {
					f_131_ -= f;
					f -= f_132_;
					f_132_ = (float) ((Class12) this).anIntArray133[(int) f_132_];
					while (--f >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_134_, (int) f_135_, f_137_, f_138_, f_140_, f_141_, f_143_, f_144_, (float) i_149_, (float) i_150_, f_158_, f_159_, f_161_, f_162_, f_164_, f_165_, f_167_, f_168_, f_170_, f_171_, f_173_, f_174_);
						f_134_ += f_187_;
						f_135_ += f_199_;
						f_137_ += f_188_;
						f_138_ += f_200_;
						f_140_ += f_189_;
						f_141_ += f_201_;
						f_143_ += f_190_;
						f_144_ += f_202_;
						i_149_ += f_191_;
						i_150_ += f_203_;
						f_158_ += f_192_;
						f_159_ += f_204_;
						f_161_ += f_193_;
						f_162_ += f_205_;
						f_164_ += f_194_;
						f_165_ += f_206_;
						f_167_ += f_195_;
						f_168_ += f_207_;
						f_170_ += f_196_;
						f_171_ += f_208_;
						f_173_ += f_197_;
						f_174_ += f_209_;
						f_132_ += (float) anInt127;
					}
					while (--f_131_ >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_134_, (int) f_133_, f_137_, f_136_, f_140_, f_139_, f_143_, f_142_, (float) i_149_, (float) i_148_, f_158_, f_157_, f_161_, f_160_, f_164_, f_163_, f_167_, f_166_, f_170_, f_169_, f_173_, f_172_);
						f_134_ += f_187_;
						f_133_ += f_175_;
						f_137_ += f_188_;
						f_136_ += f_176_;
						f_140_ += f_189_;
						f_139_ += f_177_;
						f_143_ += f_190_;
						f_142_ += f_178_;
						i_149_ += f_191_;
						i_148_ += f_179_;
						f_158_ += f_192_;
						f_157_ += f_180_;
						f_161_ += f_193_;
						f_160_ += f_181_;
						f_164_ += f_194_;
						f_163_ += f_182_;
						f_167_ += f_195_;
						f_166_ += f_183_;
						f_170_ += f_196_;
						f_169_ += f_184_;
						f_173_ += f_197_;
						f_172_ += f_185_;
						f_132_ += (float) anInt127;
					}
				} else {
					f_131_ -= f;
					f -= f_132_;
					f_132_ = (float) ((Class12) this).anIntArray133[(int) f_132_];
					while (--f >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_135_, (int) f_134_, f_138_, f_137_, f_141_, f_140_, f_144_, f_143_, (float) i_150_, (float) i_149_, f_159_, f_158_, f_162_, f_161_, f_165_, f_164_, f_168_, f_167_, f_171_, f_170_, f_174_, f_173_);
						f_135_ += f_199_;
						f_134_ += f_187_;
						f_138_ += f_200_;
						f_137_ += f_188_;
						f_141_ += f_201_;
						f_140_ += f_189_;
						f_144_ += f_202_;
						f_143_ += f_190_;
						i_150_ += f_203_;
						i_149_ += f_191_;
						f_159_ += f_204_;
						f_158_ += f_192_;
						f_162_ += f_205_;
						f_161_ += f_193_;
						f_165_ += f_206_;
						f_164_ += f_194_;
						f_168_ += f_207_;
						f_167_ += f_195_;
						f_171_ += f_208_;
						f_170_ += f_196_;
						f_174_ += f_209_;
						f_173_ += f_197_;
						f_132_ += (float) anInt127;
					}
					while (--f_131_ >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_133_, (int) f_134_, f_136_, f_137_, f_139_, f_140_, f_142_, f_143_, (float) i_148_, (float) i_149_, f_157_, f_158_, f_160_, f_161_, f_163_, f_164_, f_166_, f_167_, f_169_, f_170_, f_172_, f_173_);
						f_133_ += f_175_;
						f_134_ += f_187_;
						f_136_ += f_176_;
						f_137_ += f_188_;
						f_139_ += f_177_;
						f_140_ += f_189_;
						f_142_ += f_178_;
						f_143_ += f_190_;
						i_148_ += f_179_;
						i_149_ += f_191_;
						f_157_ += f_180_;
						f_158_ += f_192_;
						f_160_ += f_181_;
						f_161_ += f_193_;
						f_163_ += f_182_;
						f_164_ += f_194_;
						f_166_ += f_183_;
						f_167_ += f_195_;
						f_169_ += f_184_;
						f_170_ += f_196_;
						f_172_ += f_185_;
						f_173_ += f_197_;
						f_132_ += (float) anInt127;
					}
				}
			} else {
				f_133_ = f_135_;
				f_136_ = f_138_;
				f_139_ = f_141_;
				f_142_ = f_144_;
				i_148_ = i_150_;
				f_157_ = f_159_;
				f_160_ = f_162_;
				f_163_ = f_165_;
				f_166_ = f_168_;
				f_169_ = f_171_;
				f_172_ = f_174_;
				if (f_132_ < 0.0F) {
					f_135_ -= f_199_ * f_132_;
					f_133_ -= f_187_ * f_132_;
					f_138_ -= f_200_ * f_132_;
					f_136_ -= f_188_ * f_132_;
					f_141_ -= f_201_ * f_132_;
					f_139_ -= f_189_ * f_132_;
					f_144_ -= f_202_ * f_132_;
					f_142_ -= f_190_ * f_132_;
					i_150_ -= f_203_ * 3.0F;
					i_148_ -= f_191_ * f_132_;
					f_159_ -= f_204_ * f_132_;
					f_157_ -= f_192_ * f_132_;
					f_162_ -= f_205_ * f_132_;
					f_160_ -= f_193_ * f_132_;
					f_165_ -= f_206_ * f_132_;
					f_163_ -= f_194_ * f_132_;
					f_168_ -= f_207_ * f_132_;
					f_166_ -= f_195_ * f_132_;
					f_171_ -= f_208_ * f_132_;
					f_169_ -= f_196_ * f_132_;
					f_174_ -= f_209_ * f_132_;
					f_172_ -= f_197_ * f_132_;
					f_132_ = 0.0F;
				}
				if (f_131_ < 0.0F) {
					f_134_ -= f_175_ * f_131_;
					f_137_ -= f_176_ * f_131_;
					f_140_ -= f_177_ * f_131_;
					f_143_ -= f_178_ * f_131_;
					i_149_ -= f_179_ * f_131_;
					f_158_ -= f_180_ * f_131_;
					f_161_ -= f_181_ * f_131_;
					f_164_ -= f_182_ * f_131_;
					f_167_ -= f_183_ * f_131_;
					f_170_ -= f_184_ * f_131_;
					f_173_ -= f_185_ * f_131_;
					f_131_ = 0.0F;
				}
				if (f_187_ < f_199_) {
					f -= f_131_;
					f_131_ -= f_132_;
					f_132_ = (float) ((Class12) this).anIntArray133[(int) f_132_];
					while (--f_131_ >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_133_, (int) f_135_, f_136_, f_138_, f_139_, f_141_, f_142_, f_144_, (float) i_148_, (float) i_150_, f_157_, f_159_, f_160_, f_162_, f_163_, f_165_, f_166_, f_168_, f_169_, f_171_, f_172_, f_174_);
						f_133_ += f_187_;
						f_135_ += f_199_;
						f_136_ += f_188_;
						f_138_ += f_200_;
						f_139_ += f_189_;
						f_141_ += f_201_;
						f_142_ += f_190_;
						f_144_ += f_202_;
						i_148_ += f_191_;
						i_150_ += f_203_;
						f_157_ += f_192_;
						f_159_ += f_204_;
						f_160_ += f_193_;
						f_162_ += f_205_;
						f_163_ += f_194_;
						f_165_ += f_206_;
						f_166_ += f_195_;
						f_168_ += f_207_;
						f_169_ += f_196_;
						f_171_ += f_208_;
						f_172_ += f_197_;
						f_174_ += f_209_;
						f_132_ += (float) anInt127;
					}
					while (--f >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_134_, (int) f_135_, f_137_, f_138_, f_140_, f_141_, f_143_, f_144_, (float) i_149_, (float) i_150_, f_158_, f_159_, f_161_, f_162_, f_164_, f_165_, f_167_, f_168_, f_170_, f_171_, f_173_, f_174_);
						f_134_ += f_175_;
						f_135_ += f_199_;
						f_137_ += f_176_;
						f_138_ += f_200_;
						f_140_ += f_177_;
						f_141_ += f_201_;
						f_143_ += f_178_;
						f_144_ += f_202_;
						i_149_ += f_179_;
						i_150_ += f_203_;
						f_158_ += f_180_;
						f_159_ += f_204_;
						f_161_ += f_181_;
						f_162_ += f_205_;
						f_164_ += f_182_;
						f_165_ += f_206_;
						f_167_ += f_183_;
						f_168_ += f_207_;
						f_170_ += f_184_;
						f_171_ += f_208_;
						f_173_ += f_185_;
						f_174_ += f_209_;
						f_132_ += (float) anInt127;
					}
				} else {
					f -= f_131_;
					f_131_ -= f_132_;
					f_132_ = (float) ((Class12) this).anIntArray133[(int) f_132_];
					while (--f_131_ >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_135_, (int) f_133_, f_138_, f_136_, f_141_, f_139_, f_144_, f_142_, (float) i_150_, (float) i_148_, f_159_, f_157_, f_162_, f_160_, f_165_, f_163_, f_168_, f_166_, f_171_, f_169_, f_174_, f_172_);
						f_135_ += f_199_;
						f_133_ += f_187_;
						f_138_ += f_200_;
						f_136_ += f_188_;
						f_141_ += f_201_;
						f_139_ += f_189_;
						f_144_ += f_202_;
						f_142_ += f_190_;
						i_150_ += f_203_;
						i_148_ += f_191_;
						f_159_ += f_204_;
						f_157_ += f_192_;
						f_162_ += f_205_;
						f_160_ += f_193_;
						f_165_ += f_206_;
						f_163_ += f_194_;
						f_168_ += f_207_;
						f_166_ += f_195_;
						f_171_ += f_208_;
						f_169_ += f_196_;
						f_174_ += f_209_;
						f_172_ += f_197_;
						f_132_ += (float) anInt127;
					}
					while (--f >= 0.0F) {
						method215(anIntArray139, anIntArray143, (int) f_132_, (int) f_135_, (int) f_134_, f_138_, f_137_, f_141_, f_140_, f_144_, f_143_, (float) i_150_, (float) i_149_, f_159_, f_158_, f_162_, f_161_, f_165_, f_164_, f_168_, f_167_, f_171_, f_170_, f_174_, f_173_);
						f_135_ += f_199_;
						f_134_ += f_175_;
						f_138_ += f_200_;
						f_137_ += f_176_;
						f_141_ += f_201_;
						f_140_ += f_177_;
						f_144_ += f_202_;
						f_143_ += f_178_;
						i_150_ += f_203_;
						i_149_ += f_179_;
						f_159_ += f_204_;
						f_158_ += f_180_;
						f_162_ += f_205_;
						f_161_ += f_181_;
						f_165_ += f_206_;
						f_164_ += f_182_;
						f_168_ += f_207_;
						f_167_ += f_183_;
						f_171_ += f_208_;
						f_170_ += f_184_;
						f_174_ += f_209_;
						f_173_ += f_185_;
						f_132_ += (float) anInt127;
					}
				}
			}
		}
	}

	final int method210() {
		return ((Class12) this).anIntArray133[0] / anInt127;
	}

	private final void method211(int[] is, float[] fs, int i, int i_211_, int i_212_, int i_213_, int i_214_, float f, float f_215_) {
		if (((Class12) this).aBoolean135) {
			if (i_214_ > ((Class12) this).anInt141)
				i_214_ = ((Class12) this).anInt141;
			if (i_213_ < 0)
				i_213_ = 0;
		}
		if (i_213_ < i_214_) {
			i += i_213_ - 1;
			i_212_ = i_214_ - i_213_ >> 2;
			f += f_215_ * (float) i_213_;
			if (((Class235) aClass235_138).aBoolean1762) {
				if (((Class12) this).anInt137 == 0) {
					while (--i_212_ >= 0) {
						if (f < fs[++i]) {
							is[i] = i_211_;
							fs[i] = f;
						}
						f += f_215_;
						if (f < fs[++i]) {
							is[i] = i_211_;
							fs[i] = f;
						}
						f += f_215_;
						if (f < fs[++i]) {
							is[i] = i_211_;
							fs[i] = f;
						}
						f += f_215_;
						if (f < fs[++i]) {
							is[i] = i_211_;
							fs[i] = f;
						}
						f += f_215_;
					}
					i_212_ = i_214_ - i_213_ & 0x3;
					while (--i_212_ >= 0) {
						if (f < fs[++i]) {
							is[i] = i_211_;
							fs[i] = f;
						}
						f += f_215_;
					}
				} else if (((Class12) this).anInt137 == 254) {
					if (i_213_ != 0 && i_214_ <= ((Class12) this).anInt141 - 1) {
						while (--i_212_ >= 0) {
							if (f < fs[++i])
								is[i - 1] = is[i];
							f += f_215_;
							if (f < fs[++i])
								is[i - 1] = is[i];
							f += f_215_;
							if (f < fs[++i])
								is[i - 1] = is[i];
							f += f_215_;
							if (f < fs[++i])
								is[i - 1] = is[i];
							f += f_215_;
						}
						i_212_ = i_214_ - i_213_ & 0x3;
						while (--i_212_ >= 0) {
							if (f < fs[++i])
								is[i - 1] = is[i];
							f += f_215_;
						}
					}
				} else {
					int i_216_ = ((Class12) this).anInt137;
					int i_217_ = 256 - ((Class12) this).anInt137;
					i_211_ = (((i_211_ & 0xff00ff) * i_217_ >> 8 & 0xff00ff) + ((i_211_ & 0xff00) * i_217_ >> 8 & 0xff00));
					while (--i_212_ >= 0) {
						if (f < fs[++i]) {
							int i_218_ = is[i];
							is[i] = (i_211_ + ((i_218_ & 0xff00ff) * i_216_ >> 8 & 0xff00ff) + ((i_218_ & 0xff00) * i_216_ >> 8 & 0xff00));
							fs[i] = f;
						}
						f += f_215_;
						if (f < fs[++i]) {
							int i_219_ = is[i];
							is[i] = (i_211_ + ((i_219_ & 0xff00ff) * i_216_ >> 8 & 0xff00ff) + ((i_219_ & 0xff00) * i_216_ >> 8 & 0xff00));
							fs[i] = f;
						}
						f += f_215_;
						if (f < fs[++i]) {
							int i_220_ = is[i];
							is[i] = (i_211_ + ((i_220_ & 0xff00ff) * i_216_ >> 8 & 0xff00ff) + ((i_220_ & 0xff00) * i_216_ >> 8 & 0xff00));
							fs[i] = f;
						}
						f += f_215_;
						if (f < fs[++i]) {
							int i_221_ = is[i];
							is[i] = (i_211_ + ((i_221_ & 0xff00ff) * i_216_ >> 8 & 0xff00ff) + ((i_221_ & 0xff00) * i_216_ >> 8 & 0xff00));
							fs[i] = f;
						}
						f += f_215_;
					}
					i_212_ = i_214_ - i_213_ & 0x3;
					while (--i_212_ >= 0) {
						if (f < fs[++i]) {
							int i_222_ = is[i];
							is[i] = (i_211_ + ((i_222_ & 0xff00ff) * i_216_ >> 8 & 0xff00ff) + ((i_222_ & 0xff00) * i_216_ >> 8 & 0xff00));
							fs[i] = f;
						}
						f += f_215_;
					}
				}
			} else if (((Class12) this).anInt137 == 0) {
				while (--i_212_ >= 0) {
					if (f < fs[++i])
						is[i] = i_211_;
					f += f_215_;
					if (f < fs[++i])
						is[i] = i_211_;
					f += f_215_;
					if (f < fs[++i])
						is[i] = i_211_;
					f += f_215_;
					if (f < fs[++i])
						is[i] = i_211_;
					f += f_215_;
				}
				i_212_ = i_214_ - i_213_ & 0x3;
				while (--i_212_ >= 0) {
					if (f < fs[++i])
						is[i] = i_211_;
					f += f_215_;
				}
			} else if (((Class12) this).anInt137 == 254) {
				if (i_213_ != 0 && i_214_ <= ((Class12) this).anInt141 - 1) {
					while (--i_212_ >= 0) {
						if (f < fs[++i])
							is[i - 1] = is[i];
						f += f_215_;
						if (f < fs[++i])
							is[i - 1] = is[i];
						f += f_215_;
						if (f < fs[++i])
							is[i - 1] = is[i];
						f += f_215_;
						if (f < fs[++i])
							is[i - 1] = is[i];
						f += f_215_;
					}
					i_212_ = i_214_ - i_213_ & 0x3;
					while (--i_212_ >= 0) {
						if (f < fs[++i])
							is[i - 1] = is[i];
						f += f_215_;
					}
				}
			} else {
				int i_223_ = ((Class12) this).anInt137;
				int i_224_ = 256 - ((Class12) this).anInt137;
				i_211_ = (((i_211_ & 0xff00ff) * i_224_ >> 8 & 0xff00ff) + ((i_211_ & 0xff00) * i_224_ >> 8 & 0xff00));
				while (--i_212_ >= 0) {
					if (f < fs[++i]) {
						int i_225_ = is[i];
						is[i] = (i_211_ + ((i_225_ & 0xff00ff) * i_223_ >> 8 & 0xff00ff) + ((i_225_ & 0xff00) * i_223_ >> 8 & 0xff00));
					}
					f += f_215_;
					if (f < fs[++i]) {
						int i_226_ = is[i];
						is[i] = (i_211_ + ((i_226_ & 0xff00ff) * i_223_ >> 8 & 0xff00ff) + ((i_226_ & 0xff00) * i_223_ >> 8 & 0xff00));
					}
					f += f_215_;
					if (f < fs[++i]) {
						int i_227_ = is[i];
						is[i] = (i_211_ + ((i_227_ & 0xff00ff) * i_223_ >> 8 & 0xff00ff) + ((i_227_ & 0xff00) * i_223_ >> 8 & 0xff00));
					}
					f += f_215_;
					if (f < fs[++i]) {
						int i_228_ = is[i];
						is[i] = (i_211_ + ((i_228_ & 0xff00ff) * i_223_ >> 8 & 0xff00ff) + ((i_228_ & 0xff00) * i_223_ >> 8 & 0xff00));
					}
					f += f_215_;
				}
				i_212_ = i_214_ - i_213_ & 0x3;
				while (--i_212_ >= 0) {
					if (f < fs[++i]) {
						int i_229_ = is[i];
						is[i] = (i_211_ + ((i_229_ & 0xff00ff) * i_223_ >> 8 & 0xff00ff) + ((i_229_ & 0xff00) * i_223_ >> 8 & 0xff00));
					}
					f += f_215_;
				}
			}
		}
	}

	final void method212(float f, float f_230_, float f_231_, float f_232_, float f_233_, float f_234_, float f_235_, float f_236_, float f_237_, float f_238_, float f_239_, float f_240_, float f_241_, float f_242_, float f_243_, int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_) {
		if (i_250_ != anInt158) {
			anIntArray143 = aHa_Sub2_131.method1915(i_250_);
			if (anIntArray143 == null) {
				method206((float) (int) f, (float) (int) f_230_, (float) (int) f_231_, (float) (int) f_232_, (float) (int) f_233_, (float) (int) f_234_, (float) (int) f_235_, (float) (int) f_236_, (float) (int) f_237_, Class98_Sub46_Sub5.method1544(i_246_ | i_247_ << 24, (byte) 114, i), Class98_Sub46_Sub5.method1544(i_246_ | i_248_ << 24, (byte) 110, i_244_), Class98_Sub46_Sub5.method1544(i_246_ | i_249_ << 24, (byte) 108, i_245_));
				return;
			}
			anInt151 = (aHa_Sub2_131.method1925(i_250_) ? 64 : ((ha_Sub2) aHa_Sub2_131).anInt4482);
			anInt146 = anInt151 - 1;
			anInt147 = aHa_Sub2_131.method1912(i_250_);
			aBoolean154 = aHa_Sub2_131.method1922(i_250_);
		}
		anInt155 = i_246_;
		float f_251_ = (float) (i >> 24 & 0xff);
		float f_252_ = (float) (i_244_ >> 24 & 0xff);
		float f_253_ = (float) (i_245_ >> 24 & 0xff);
		float f_254_ = (float) (i >> 16 & 0xff);
		float f_255_ = (float) (i_244_ >> 16 & 0xff);
		float f_256_ = (float) (i_245_ >> 16 & 0xff);
		float f_257_ = (float) (i >> 8 & 0xff);
		float f_258_ = (float) (i_244_ >> 8 & 0xff);
		float f_259_ = (float) (i_245_ >> 8 & 0xff);
		float f_260_ = (float) (i & 0xff);
		float f_261_ = (float) (i_244_ & 0xff);
		float f_262_ = (float) (i_245_ & 0xff);
		f_238_ /= f_235_;
		f_239_ /= f_236_;
		f_240_ /= f_237_;
		f_241_ /= f_235_;
		f_242_ /= f_236_;
		f_243_ /= f_237_;
		f_235_ = 1.0F / f_235_;
		f_236_ = 1.0F / f_236_;
		f_237_ = 1.0F / f_237_;
		float f_263_ = 0.0F;
		float f_264_ = 0.0F;
		float f_265_ = 0.0F;
		float f_266_ = 0.0F;
		float f_267_ = 0.0F;
		float f_268_ = 0.0F;
		float f_269_ = 0.0F;
		float f_270_ = 0.0F;
		float f_271_ = 0.0F;
		if (f_230_ != f) {
			float f_272_ = f_230_ - f;
			f_263_ = (f_233_ - f_232_) / f_272_;
			f_264_ = (f_236_ - f_235_) / f_272_;
			f_265_ = (f_239_ - f_238_) / f_272_;
			f_266_ = (f_242_ - f_241_) / f_272_;
			f_267_ = (float) (i_248_ - i_247_) / f_272_;
			f_268_ = (f_252_ - f_251_) / f_272_;
			f_269_ = (f_255_ - f_254_) / f_272_;
			f_270_ = (f_258_ - f_257_) / f_272_;
			f_271_ = (f_261_ - f_260_) / f_272_;
		}
		float f_273_ = 0.0F;
		float f_274_ = 0.0F;
		float f_275_ = 0.0F;
		float f_276_ = 0.0F;
		float f_277_ = 0.0F;
		float f_278_ = 0.0F;
		float f_279_ = 0.0F;
		float f_280_ = 0.0F;
		float f_281_ = 0.0F;
		if (f_231_ != f_230_) {
			float f_282_ = f_231_ - f_230_;
			f_273_ = (f_234_ - f_233_) / f_282_;
			f_274_ = (f_237_ - f_236_) / f_282_;
			f_275_ = (f_240_ - f_239_) / f_282_;
			f_276_ = (f_243_ - f_242_) / f_282_;
			f_277_ = (float) (i_249_ - i_248_) / f_282_;
			f_278_ = (f_253_ - f_252_) / f_282_;
			f_279_ = (f_256_ - f_255_) / f_282_;
			f_280_ = (f_259_ - f_258_) / f_282_;
			f_281_ = (f_262_ - f_261_) / f_282_;
		}
		float f_283_ = 0.0F;
		float f_284_ = 0.0F;
		float f_285_ = 0.0F;
		float f_286_ = 0.0F;
		float f_287_ = 0.0F;
		float f_288_ = 0.0F;
		float f_289_ = 0.0F;
		float f_290_ = 0.0F;
		float f_291_ = 0.0F;
		if (f != f_231_) {
			float f_292_ = f - f_231_;
			f_283_ = (f_232_ - f_234_) / f_292_;
			f_284_ = (f_235_ - f_237_) / f_292_;
			f_285_ = (f_238_ - f_240_) / f_292_;
			f_286_ = (f_241_ - f_243_) / f_292_;
			f_287_ = (float) (i_247_ - i_249_) / f_292_;
			f_288_ = (f_251_ - f_253_) / f_292_;
			f_289_ = (f_254_ - f_256_) / f_292_;
			f_290_ = (f_257_ - f_259_) / f_292_;
			f_291_ = (f_260_ - f_262_) / f_292_;
		}
		if (f <= f_230_ && f <= f_231_) {
			if (!(f >= (float) ((Class12) this).anInt129)) {
				if (f_230_ > (float) ((Class12) this).anInt129)
					f_230_ = (float) ((Class12) this).anInt129;
				if (f_231_ > (float) ((Class12) this).anInt129)
					f_231_ = (float) ((Class12) this).anInt129;
				if (f_230_ < f_231_) {
					f_234_ = f_232_;
					f_237_ = f_235_;
					f_240_ = f_238_;
					f_243_ = f_241_;
					i_249_ = i_247_;
					f_253_ = f_251_;
					f_256_ = f_254_;
					f_259_ = f_257_;
					f_262_ = f_260_;
					if (f < 0.0F) {
						f_232_ -= f_263_ * f;
						f_234_ -= f_283_ * f;
						f_235_ -= f_264_ * f;
						f_237_ -= f_284_ * f;
						f_238_ -= f_265_ * f;
						f_240_ -= f_285_ * f;
						f_241_ -= f_266_ * f;
						f_243_ -= f_286_ * f;
						i_247_ -= f_267_ * f;
						i_249_ -= f_287_ * f;
						f_251_ -= f_268_ * f;
						f_253_ -= f_288_ * f;
						f_254_ -= f_268_ * f;
						f_256_ -= f_288_ * f;
						f_257_ -= f_268_ * f;
						f_259_ -= f_288_ * f;
						f_260_ -= f_268_ * f;
						f_262_ -= f_288_ * f;
						f = 0.0F;
					}
					if (f_230_ < 0.0F) {
						f_233_ -= f_273_ * f_230_;
						f_236_ -= f_274_ * f_230_;
						f_239_ -= f_275_ * f_230_;
						f_242_ -= f_276_ * f_230_;
						i_248_ -= f_277_ * f_230_;
						f_252_ -= f_278_ * f_230_;
						f_255_ -= f_279_ * f_230_;
						f_258_ -= f_280_ * f_230_;
						f_261_ -= f_281_ * f_230_;
						f_230_ = 0.0F;
					}
					if (f != f_230_ && f_283_ < f_263_ || f == f_230_ && f_283_ > f_273_) {
						f_231_ -= f_230_;
						f_230_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_230_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_234_, (int) f_232_, f_237_, f_235_, f_240_, f_238_, f_243_, f_241_, (float) i_249_, (float) i_247_, f_253_, f_251_, f_256_, f_254_, f_259_, f_257_, f_262_, f_260_);
							f_232_ += f_263_;
							f_234_ += f_283_;
							f_235_ += f_264_;
							f_237_ += f_284_;
							f_238_ += f_265_;
							f_240_ += f_285_;
							f_241_ += f_266_;
							f_243_ += f_286_;
							i_247_ += f_267_;
							i_249_ += f_287_;
							f_251_ += f_268_;
							f_253_ += f_288_;
							f_254_ += f_269_;
							f_256_ += f_289_;
							f_257_ += f_270_;
							f_259_ += f_290_;
							f_260_ += f_271_;
							f_262_ += f_291_;
							f += (float) anInt127;
						}
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_234_, (int) f_233_, f_237_, f_236_, f_240_, f_239_, f_243_, f_242_, (float) i_249_, (float) i_248_, f_253_, f_252_, f_256_, f_255_, f_259_, f_258_, f_262_, f_261_);
							f_233_ += f_273_;
							f_234_ += f_283_;
							f_236_ += f_274_;
							f_237_ += f_284_;
							f_239_ += f_275_;
							f_240_ += f_285_;
							f_242_ += f_276_;
							f_243_ += f_286_;
							i_248_ += f_277_;
							i_249_ += f_287_;
							f_252_ += f_278_;
							f_253_ += f_288_;
							f_255_ += f_279_;
							f_256_ += f_289_;
							f_258_ += f_280_;
							f_259_ += f_290_;
							f_261_ += f_281_;
							f_262_ += f_291_;
							f += (float) anInt127;
						}
					} else {
						f_231_ -= f_230_;
						f_230_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_230_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_232_, (int) f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, (float) i_247_, (float) i_249_, f_251_, f_253_, f_254_, f_256_, f_257_, f_259_, f_260_, f_262_);
							f_232_ += f_263_;
							f_234_ += f_283_;
							f_235_ += f_264_;
							f_237_ += f_284_;
							f_238_ += f_265_;
							f_240_ += f_285_;
							f_241_ += f_266_;
							f_243_ += f_286_;
							i_247_ += f_267_;
							i_249_ += f_287_;
							f_251_ += f_268_;
							f_253_ += f_288_;
							f_254_ += f_269_;
							f_256_ += f_289_;
							f_257_ += f_270_;
							f_259_ += f_290_;
							f_260_ += f_271_;
							f_262_ += f_291_;
							f += (float) anInt127;
						}
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_233_, (int) f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, (float) i_248_, (float) i_249_, f_252_, f_253_, f_255_, f_256_, f_258_, f_259_, f_261_, f_262_);
							f_233_ += f_273_;
							f_234_ += f_283_;
							f_236_ += f_274_;
							f_237_ += f_284_;
							f_239_ += f_275_;
							f_240_ += f_285_;
							f_242_ += f_276_;
							f_243_ += f_286_;
							i_248_ += f_277_;
							i_249_ += f_287_;
							f_252_ += f_278_;
							f_253_ += f_288_;
							f_255_ += f_279_;
							f_256_ += f_289_;
							f_258_ += f_280_;
							f_259_ += f_290_;
							f_261_ += f_281_;
							f_262_ += f_291_;
							f += (float) anInt127;
						}
					}
				} else {
					f_233_ = f_232_;
					f_236_ = f_235_;
					f_239_ = f_238_;
					f_242_ = f_241_;
					i_248_ = i_247_;
					f_252_ = f_251_;
					f_255_ = f_254_;
					f_258_ = f_257_;
					f_261_ = f_260_;
					if (f < 0.0F) {
						f_232_ -= f_263_ * f;
						f_233_ -= f_283_ * f;
						f_235_ -= f_264_ * f;
						f_236_ -= f_284_ * f;
						f_238_ -= f_265_ * f;
						f_239_ -= f_285_ * f;
						f_241_ -= f_266_ * f;
						f_242_ -= f_286_ * f;
						i_247_ -= f_267_ * f;
						i_248_ -= f_287_ * f;
						f_251_ -= f_268_ * f;
						f_252_ -= f_288_ * f;
						f_254_ -= f_268_ * f;
						f_255_ -= f_288_ * f;
						f_257_ -= f_268_ * f;
						f_258_ -= f_288_ * f;
						f_260_ -= f_268_ * f;
						f_261_ -= f_288_ * f;
						f = 0.0F;
					}
					if (f_231_ < 0.0F) {
						f_234_ -= f_273_ * f_231_;
						f_237_ -= f_274_ * f_231_;
						f_240_ -= f_275_ * f_231_;
						f_243_ -= f_276_ * f_231_;
						i_249_ -= f_277_ * f_231_;
						f_253_ -= f_278_ * f_231_;
						f_256_ -= f_279_ * f_231_;
						f_259_ -= f_280_ * f_231_;
						f_262_ -= f_281_ * f_231_;
						f_231_ = 0.0F;
					}
					if (f != f_231_ && f_283_ < f_263_ || f == f_231_ && f_273_ > f_263_) {
						f_230_ -= f_231_;
						f_231_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_233_, (int) f_232_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, (float) i_248_, (float) i_247_, f_252_, f_251_, f_255_, f_254_, f_258_, f_257_, f_261_, f_260_);
							f_232_ += f_263_;
							f_233_ += f_283_;
							f_235_ += f_264_;
							f_236_ += f_284_;
							f_238_ += f_265_;
							f_239_ += f_285_;
							f_241_ += f_266_;
							f_242_ += f_286_;
							i_247_ += f_267_;
							i_248_ += f_287_;
							f_251_ += f_268_;
							f_252_ += f_288_;
							f_254_ += f_269_;
							f_255_ += f_289_;
							f_257_ += f_270_;
							f_258_ += f_290_;
							f_260_ += f_271_;
							f_261_ += f_291_;
							f += (float) anInt127;
						}
						while (--f_230_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_234_, (int) f_232_, f_237_, f_235_, f_240_, f_238_, f_243_, f_241_, (float) i_249_, (float) i_247_, f_253_, f_251_, f_256_, f_254_, f_259_, f_257_, f_262_, f_260_);
							f_234_ += f_273_;
							f_232_ += f_263_;
							f_237_ += f_274_;
							f_235_ += f_264_;
							f_240_ += f_275_;
							f_238_ += f_265_;
							f_243_ += f_276_;
							f_241_ += f_266_;
							i_249_ += f_277_;
							i_247_ += f_267_;
							f_253_ += f_278_;
							f_251_ += f_268_;
							f_256_ += f_279_;
							f_254_ += f_269_;
							f_259_ += f_280_;
							f_257_ += f_270_;
							f_262_ += f_281_;
							f_260_ += f_271_;
							f += (float) anInt127;
						}
					} else {
						f_230_ -= f_231_;
						f_231_ -= f;
						f = (float) ((Class12) this).anIntArray133[(int) f];
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_232_, (int) f_233_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, (float) i_247_, (float) i_248_, f_251_, f_252_, f_254_, f_255_, f_257_, f_258_, f_260_, f_261_);
							f_233_ += f_283_;
							f_232_ += f_263_;
							f_236_ += f_284_;
							f_235_ += f_264_;
							f_239_ += f_285_;
							f_238_ += f_265_;
							f_242_ += f_286_;
							f_241_ += f_266_;
							i_248_ += f_287_;
							i_247_ += f_267_;
							f_252_ += f_288_;
							f_251_ += f_268_;
							f_255_ += f_289_;
							f_254_ += f_269_;
							f_258_ += f_290_;
							f_257_ += f_270_;
							f_261_ += f_291_;
							f_260_ += f_271_;
							f += (float) anInt127;
						}
						while (--f_230_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f, (int) f_232_, (int) f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, (float) i_247_, (float) i_249_, f_251_, f_253_, f_254_, f_256_, f_257_, f_259_, f_260_, f_262_);
							f_232_ += f_263_;
							f_234_ += f_273_;
							f_235_ += f_264_;
							f_237_ += f_274_;
							f_238_ += f_265_;
							f_240_ += f_275_;
							f_241_ += f_266_;
							f_243_ += f_276_;
							i_247_ += f_267_;
							i_249_ += f_277_;
							f_251_ += f_268_;
							f_253_ += f_278_;
							f_254_ += f_269_;
							f_256_ += f_279_;
							f_257_ += f_270_;
							f_259_ += f_280_;
							f_260_ += f_271_;
							f_262_ += f_281_;
							f += (float) anInt127;
						}
					}
				}
			}
		} else if (f_230_ <= f_231_) {
			if (!(f_230_ >= (float) ((Class12) this).anInt129)) {
				if (f_231_ > (float) ((Class12) this).anInt129)
					f_231_ = (float) ((Class12) this).anInt129;
				if (f > (float) ((Class12) this).anInt129)
					f = (float) ((Class12) this).anInt129;
				if (f_231_ < f) {
					f_232_ = f_233_;
					f_235_ = f_236_;
					f_238_ = f_239_;
					f_241_ = f_242_;
					i_247_ = i_248_;
					f_251_ = f_252_;
					f_254_ = f_255_;
					f_257_ = f_258_;
					f_260_ = f_261_;
					if (f_230_ < 0.0F) {
						f_232_ -= f_263_ * f_230_;
						f_233_ -= f_273_ * f_230_;
						f_235_ -= f_264_ * f_230_;
						f_236_ -= f_274_ * f_230_;
						f_238_ -= f_265_ * f_230_;
						f_239_ -= f_275_ * f_230_;
						f_241_ -= f_266_ * f_230_;
						f_242_ -= f_276_ * f_230_;
						i_247_ -= f_267_ * f_230_;
						i_248_ -= f_277_ * f_230_;
						f_251_ -= f_268_ * f_230_;
						f_252_ -= f_278_ * f_230_;
						f_254_ -= f_269_ * f_230_;
						f_255_ -= f_279_ * f_230_;
						f_257_ -= f_270_ * f_230_;
						f_258_ -= f_280_ * f_230_;
						f_260_ -= f_271_ * f_230_;
						f_261_ -= f_281_ * f_230_;
						f_230_ = 0.0F;
					}
					if (f_231_ < 0.0F) {
						f_234_ -= f_283_ * f_231_;
						f_237_ -= f_284_ * f_231_;
						f_240_ -= f_285_ * f_231_;
						f_243_ -= f_286_ * f_231_;
						i_249_ -= f_287_ * f_231_;
						f_253_ -= f_288_ * f_231_;
						f_256_ -= f_289_ * f_231_;
						f_259_ -= f_290_ * f_231_;
						f_262_ -= f_291_ * f_231_;
						f_231_ = 0.0F;
					}
					if (f_230_ != f_231_ && f_263_ < f_273_ || f_230_ == f_231_ && f_263_ > f_283_) {
						f -= f_231_;
						f_231_ -= f_230_;
						f_230_ = (float) (((Class12) this).anIntArray133[(int) f_230_]);
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_232_, (int) f_233_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, (float) i_247_, (float) i_248_, f_251_, f_252_, f_254_, f_255_, f_257_, f_258_, f_260_, f_261_);
							f_232_ += f_263_;
							f_233_ += f_273_;
							f_235_ += f_264_;
							f_236_ += f_274_;
							f_238_ += f_265_;
							f_239_ += f_275_;
							f_241_ += f_266_;
							f_242_ += f_276_;
							i_247_ += f_267_;
							i_248_ += f_277_;
							f_251_ += f_268_;
							f_252_ += f_278_;
							f_254_ += f_269_;
							f_255_ += f_279_;
							f_257_ += f_270_;
							f_258_ += f_280_;
							f_260_ += f_271_;
							f_261_ += f_281_;
							f_230_ += (float) anInt127;
						}
						while (--f >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_232_, (int) f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, (float) i_247_, (float) i_249_, f_251_, f_253_, f_254_, f_256_, f_257_, f_259_, f_260_, f_262_);
							f_232_ += f_263_;
							f_234_ += f_283_;
							f_235_ += f_264_;
							f_237_ += f_284_;
							f_238_ += f_265_;
							f_240_ += f_285_;
							f_241_ += f_266_;
							f_243_ += f_286_;
							i_247_ += f_267_;
							i_249_ += f_287_;
							f_251_ += f_268_;
							f_253_ += f_288_;
							f_254_ += f_269_;
							f_256_ += f_289_;
							f_257_ += f_270_;
							f_259_ += f_290_;
							f_260_ += f_271_;
							f_262_ += f_291_;
							f_230_ += (float) anInt127;
						}
					} else {
						f -= f_231_;
						f_231_ -= f_230_;
						f_230_ = (float) (((Class12) this).anIntArray133[(int) f_230_]);
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_233_, (int) f_232_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, (float) i_248_, (float) i_247_, f_252_, f_251_, f_255_, f_254_, f_258_, f_257_, f_261_, f_260_);
							f_233_ += f_273_;
							f_232_ += f_263_;
							f_236_ += f_274_;
							f_235_ += f_264_;
							f_239_ += f_275_;
							f_238_ += f_265_;
							f_242_ += f_276_;
							f_241_ += f_266_;
							i_248_ += f_277_;
							i_247_ += f_267_;
							f_252_ += f_278_;
							f_251_ += f_268_;
							f_255_ += f_279_;
							f_254_ += f_269_;
							f_258_ += f_280_;
							f_257_ += f_270_;
							f_261_ += f_281_;
							f_260_ += f_271_;
							f_230_ += (float) anInt127;
						}
						while (--f >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_234_, (int) f_232_, f_237_, f_235_, f_240_, f_238_, f_243_, f_241_, (float) i_249_, (float) i_247_, f_253_, f_251_, f_256_, f_254_, f_259_, f_257_, f_262_, f_260_);
							f_234_ += f_283_;
							f_232_ += f_263_;
							f_237_ += f_284_;
							f_235_ += f_264_;
							f_240_ += f_285_;
							f_238_ += f_265_;
							f_243_ += f_286_;
							f_241_ += f_266_;
							i_249_ += f_287_;
							i_247_ += f_267_;
							f_253_ += f_288_;
							f_251_ += f_268_;
							f_256_ += f_289_;
							f_254_ += f_269_;
							f_259_ += f_290_;
							f_257_ += f_270_;
							f_262_ += f_291_;
							f_260_ += f_271_;
							f_230_ += (float) anInt127;
						}
					}
				} else {
					f_234_ = f_233_;
					f_237_ = f_236_;
					f_240_ = f_239_;
					f_243_ = f_242_;
					i_249_ = i_248_;
					f_253_ = f_252_;
					f_256_ = f_255_;
					f_259_ = f_258_;
					f_262_ = f_261_;
					if (f_230_ < 0.0F) {
						f_234_ -= f_263_ * f_230_;
						f_233_ -= f_273_ * f_230_;
						f_237_ -= f_264_ * f_230_;
						f_236_ -= f_274_ * f_230_;
						f_240_ -= f_265_ * f_230_;
						f_239_ -= f_275_ * f_230_;
						f_243_ -= f_266_ * f_230_;
						f_242_ -= f_276_ * f_230_;
						i_249_ -= f_267_ * f_230_;
						i_248_ -= f_277_ * f_230_;
						f_253_ -= f_268_ * f_230_;
						f_252_ -= f_278_ * f_230_;
						f_256_ -= f_269_ * f_230_;
						f_255_ -= f_279_ * f_230_;
						f_259_ -= f_270_ * f_230_;
						f_258_ -= f_280_ * f_230_;
						f_262_ -= f_271_ * f_230_;
						f_261_ -= f_281_ * f_230_;
						f_230_ = 0.0F;
					}
					if (f < 0.0F) {
						f_232_ -= f_283_ * f;
						f_235_ -= f_284_ * f;
						f_238_ -= f_285_ * f;
						f_241_ -= f_286_ * f;
						i_247_ -= f_287_ * f;
						f_251_ -= f_288_ * f;
						f_254_ -= f_289_ * f;
						f_257_ -= f_290_ * f;
						f_260_ -= f_291_ * f;
						f = 0.0F;
					}
					f_231_ -= f;
					f -= f_230_;
					f_230_ = (float) ((Class12) this).anIntArray133[(int) f_230_];
					if (f_263_ < f_273_) {
						while (--f >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_234_, (int) f_233_, f_237_, f_236_, f_240_, f_239_, f_243_, f_242_, (float) i_249_, (float) i_248_, f_253_, f_252_, f_256_, f_255_, f_259_, f_258_, f_262_, f_261_);
							f_234_ += f_263_;
							f_233_ += f_273_;
							f_237_ += f_264_;
							f_236_ += f_274_;
							f_240_ += f_265_;
							f_239_ += f_275_;
							f_243_ += f_266_;
							f_242_ += f_276_;
							i_249_ += f_267_;
							i_248_ += f_277_;
							f_253_ += f_268_;
							f_252_ += f_278_;
							f_256_ += f_269_;
							f_255_ += f_279_;
							f_259_ += f_270_;
							f_258_ += f_280_;
							f_262_ += f_271_;
							f_261_ += f_281_;
							f_230_ += (float) anInt127;
						}
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_232_, (int) f_233_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, (float) i_247_, (float) i_248_, f_251_, f_252_, f_254_, f_255_, f_257_, f_258_, f_260_, f_261_);
							f_232_ += f_283_;
							f_233_ += f_273_;
							f_235_ += f_284_;
							f_236_ += f_274_;
							f_238_ += f_285_;
							f_239_ += f_275_;
							f_241_ += f_286_;
							f_242_ += f_276_;
							i_247_ += f_287_;
							i_248_ += f_277_;
							f_251_ += f_288_;
							f_252_ += f_278_;
							f_254_ += f_289_;
							f_255_ += f_279_;
							f_257_ += f_290_;
							f_258_ += f_280_;
							f_260_ += f_291_;
							f_261_ += f_281_;
							f_230_ += (float) anInt127;
						}
					} else {
						while (--f >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_233_, (int) f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, (float) i_248_, (float) i_249_, f_252_, f_253_, f_255_, f_256_, f_258_, f_259_, f_261_, f_262_);
							f_233_ += f_273_;
							f_234_ += f_263_;
							f_236_ += f_274_;
							f_237_ += f_264_;
							f_239_ += f_275_;
							f_240_ += f_265_;
							f_242_ += f_276_;
							f_243_ += f_266_;
							i_248_ += f_277_;
							i_249_ += f_267_;
							f_252_ += f_278_;
							f_253_ += f_268_;
							f_255_ += f_279_;
							f_256_ += f_269_;
							f_258_ += f_280_;
							f_259_ += f_270_;
							f_261_ += f_281_;
							f_262_ += f_271_;
							f_230_ += (float) anInt127;
						}
						while (--f_231_ >= 0.0F) {
							method205(anIntArray139, anIntArray143, (int) f_230_, (int) f_233_, (int) f_232_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, (float) i_248_, (float) i_247_, f_252_, f_251_, f_255_, f_254_, f_258_, f_257_, f_261_, f_260_);
							f_233_ += f_273_;
							f_232_ += f_283_;
							f_236_ += f_274_;
							f_235_ += f_284_;
							f_239_ += f_275_;
							f_238_ += f_285_;
							f_242_ += f_276_;
							f_241_ += f_286_;
							i_248_ += f_277_;
							i_247_ += f_287_;
							f_252_ += f_278_;
							f_251_ += f_288_;
							f_255_ += f_279_;
							f_254_ += f_289_;
							f_258_ += f_280_;
							f_257_ += f_290_;
							f_261_ += f_281_;
							f_260_ += f_291_;
							f_230_ += (float) anInt127;
						}
					}
				}
			}
		} else if (!(f_231_ >= (float) ((Class12) this).anInt129)) {
			if (f > (float) ((Class12) this).anInt129)
				f = (float) ((Class12) this).anInt129;
			if (f_230_ > (float) ((Class12) this).anInt129)
				f_230_ = (float) ((Class12) this).anInt129;
			if (f < f_230_) {
				f_233_ = f_234_;
				f_236_ = f_237_;
				f_239_ = f_240_;
				f_242_ = f_243_;
				i_248_ = i_249_;
				f_252_ = f_253_;
				f_255_ = f_256_;
				f_258_ = f_259_;
				f_261_ = f_262_;
				if (f_231_ < 0.0F) {
					f_234_ -= f_283_ * f_231_;
					f_233_ -= f_273_ * f_231_;
					f_237_ -= f_284_ * f_231_;
					f_236_ -= f_274_ * f_231_;
					f_240_ -= f_285_ * f_231_;
					f_239_ -= f_275_ * f_231_;
					f_243_ -= f_286_ * f_231_;
					f_242_ -= f_276_ * f_231_;
					i_249_ -= f_287_ * 3.0F;
					i_248_ -= f_277_ * f_231_;
					f_253_ -= f_288_ * f_231_;
					f_252_ -= f_278_ * f_231_;
					f_256_ -= f_289_ * f_231_;
					f_255_ -= f_279_ * f_231_;
					f_259_ -= f_290_ * f_231_;
					f_258_ -= f_280_ * f_231_;
					f_262_ -= f_291_ * f_231_;
					f_261_ -= f_281_ * f_231_;
					f_231_ = 0.0F;
				}
				if (f < 0.0F) {
					f_232_ -= f_263_ * f;
					f_235_ -= f_264_ * f;
					f_238_ -= f_265_ * f;
					f_241_ -= f_266_ * f;
					i_247_ -= f_267_ * f;
					f_251_ -= f_268_ * f;
					f_254_ -= f_269_ * f;
					f_257_ -= f_270_ * f;
					f_260_ -= f_271_ * f;
					f = 0.0F;
				}
				if (f_273_ < f_283_) {
					f_230_ -= f;
					f -= f_231_;
					f_231_ = (float) ((Class12) this).anIntArray133[(int) f_231_];
					while (--f >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_233_, (int) f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, (float) i_248_, (float) i_249_, f_252_, f_253_, f_255_, f_256_, f_258_, f_259_, f_261_, f_262_);
						f_233_ += f_273_;
						f_234_ += f_283_;
						f_236_ += f_274_;
						f_237_ += f_284_;
						f_239_ += f_275_;
						f_240_ += f_285_;
						f_242_ += f_276_;
						f_243_ += f_286_;
						i_248_ += f_277_;
						i_249_ += f_287_;
						f_252_ += f_278_;
						f_253_ += f_288_;
						f_255_ += f_279_;
						f_256_ += f_289_;
						f_258_ += f_280_;
						f_259_ += f_290_;
						f_261_ += f_281_;
						f_262_ += f_291_;
						f_231_ += (float) anInt127;
					}
					while (--f_230_ >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_233_, (int) f_232_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, (float) i_248_, (float) i_247_, f_252_, f_251_, f_255_, f_254_, f_258_, f_257_, f_261_, f_260_);
						f_233_ += f_273_;
						f_232_ += f_263_;
						f_236_ += f_274_;
						f_235_ += f_264_;
						f_239_ += f_275_;
						f_238_ += f_265_;
						f_242_ += f_276_;
						f_241_ += f_266_;
						i_248_ += f_277_;
						i_247_ += f_267_;
						f_252_ += f_278_;
						f_251_ += f_268_;
						f_255_ += f_279_;
						f_254_ += f_269_;
						f_258_ += f_280_;
						f_257_ += f_270_;
						f_261_ += f_281_;
						f_260_ += f_271_;
						f_231_ += (float) anInt127;
					}
				} else {
					f_230_ -= f;
					f -= f_231_;
					f_231_ = (float) ((Class12) this).anIntArray133[(int) f_231_];
					while (--f >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_234_, (int) f_233_, f_237_, f_236_, f_240_, f_239_, f_243_, f_242_, (float) i_249_, (float) i_248_, f_253_, f_252_, f_256_, f_255_, f_259_, f_258_, f_262_, f_261_);
						f_234_ += f_283_;
						f_233_ += f_273_;
						f_237_ += f_284_;
						f_236_ += f_274_;
						f_240_ += f_285_;
						f_239_ += f_275_;
						f_243_ += f_286_;
						f_242_ += f_276_;
						i_249_ += f_287_;
						i_248_ += f_277_;
						f_253_ += f_288_;
						f_252_ += f_278_;
						f_256_ += f_289_;
						f_255_ += f_279_;
						f_259_ += f_290_;
						f_258_ += f_280_;
						f_262_ += f_291_;
						f_261_ += f_281_;
						f_231_ += (float) anInt127;
					}
					while (--f_230_ >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_232_, (int) f_233_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, (float) i_247_, (float) i_248_, f_251_, f_252_, f_254_, f_255_, f_257_, f_258_, f_260_, f_261_);
						f_232_ += f_263_;
						f_233_ += f_273_;
						f_235_ += f_264_;
						f_236_ += f_274_;
						f_238_ += f_265_;
						f_239_ += f_275_;
						f_241_ += f_266_;
						f_242_ += f_276_;
						i_247_ += f_267_;
						i_248_ += f_277_;
						f_251_ += f_268_;
						f_252_ += f_278_;
						f_254_ += f_269_;
						f_255_ += f_279_;
						f_257_ += f_270_;
						f_258_ += f_280_;
						f_260_ += f_271_;
						f_261_ += f_281_;
						f_231_ += (float) anInt127;
					}
				}
			} else {
				f_232_ = f_234_;
				f_235_ = f_237_;
				f_238_ = f_240_;
				f_241_ = f_243_;
				i_247_ = i_249_;
				f_251_ = f_253_;
				f_254_ = f_256_;
				f_257_ = f_259_;
				f_260_ = f_262_;
				if (f_231_ < 0.0F) {
					f_234_ -= f_283_ * f_231_;
					f_232_ -= f_273_ * f_231_;
					f_237_ -= f_284_ * f_231_;
					f_235_ -= f_274_ * f_231_;
					f_240_ -= f_285_ * f_231_;
					f_238_ -= f_275_ * f_231_;
					f_243_ -= f_286_ * f_231_;
					f_241_ -= f_276_ * f_231_;
					i_249_ -= f_287_ * 3.0F;
					i_247_ -= f_277_ * f_231_;
					f_253_ -= f_288_ * f_231_;
					f_251_ -= f_278_ * f_231_;
					f_256_ -= f_289_ * f_231_;
					f_254_ -= f_279_ * f_231_;
					f_259_ -= f_290_ * f_231_;
					f_257_ -= f_280_ * f_231_;
					f_262_ -= f_291_ * f_231_;
					f_260_ -= f_281_ * f_231_;
					f_231_ = 0.0F;
				}
				if (f_230_ < 0.0F) {
					f_233_ -= f_263_ * f_230_;
					f_236_ -= f_264_ * f_230_;
					f_239_ -= f_265_ * f_230_;
					f_242_ -= f_266_ * f_230_;
					i_248_ -= f_267_ * f_230_;
					f_252_ -= f_268_ * f_230_;
					f_255_ -= f_269_ * f_230_;
					f_258_ -= f_270_ * f_230_;
					f_261_ -= f_271_ * f_230_;
					f_230_ = 0.0F;
				}
				if (f_273_ < f_283_) {
					f -= f_230_;
					f_230_ -= f_231_;
					f_231_ = (float) ((Class12) this).anIntArray133[(int) f_231_];
					while (--f_230_ >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_232_, (int) f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, (float) i_247_, (float) i_249_, f_251_, f_253_, f_254_, f_256_, f_257_, f_259_, f_260_, f_262_);
						f_232_ += f_273_;
						f_234_ += f_283_;
						f_235_ += f_274_;
						f_237_ += f_284_;
						f_238_ += f_275_;
						f_240_ += f_285_;
						f_241_ += f_276_;
						f_243_ += f_286_;
						i_247_ += f_277_;
						i_249_ += f_287_;
						f_251_ += f_278_;
						f_253_ += f_288_;
						f_254_ += f_279_;
						f_256_ += f_289_;
						f_257_ += f_280_;
						f_259_ += f_290_;
						f_260_ += f_281_;
						f_262_ += f_291_;
						f_231_ += (float) anInt127;
					}
					while (--f >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_233_, (int) f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, (float) i_248_, (float) i_249_, f_252_, f_253_, f_255_, f_256_, f_258_, f_259_, f_261_, f_262_);
						f_233_ += f_263_;
						f_234_ += f_283_;
						f_236_ += f_264_;
						f_237_ += f_284_;
						f_239_ += f_265_;
						f_240_ += f_285_;
						f_242_ += f_266_;
						f_243_ += f_286_;
						i_248_ += f_267_;
						i_249_ += f_287_;
						f_252_ += f_268_;
						f_253_ += f_288_;
						f_255_ += f_269_;
						f_256_ += f_289_;
						f_258_ += f_270_;
						f_259_ += f_290_;
						f_261_ += f_271_;
						f_262_ += f_291_;
						f_231_ += (float) anInt127;
					}
				} else {
					f -= f_230_;
					f_230_ -= f_231_;
					f_231_ = (float) ((Class12) this).anIntArray133[(int) f_231_];
					while (--f_230_ >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_234_, (int) f_232_, f_237_, f_235_, f_240_, f_238_, f_243_, f_241_, (float) i_249_, (float) i_247_, f_253_, f_251_, f_256_, f_254_, f_259_, f_257_, f_262_, f_260_);
						f_234_ += f_283_;
						f_232_ += f_273_;
						f_237_ += f_284_;
						f_235_ += f_274_;
						f_240_ += f_285_;
						f_238_ += f_275_;
						f_243_ += f_286_;
						f_241_ += f_276_;
						i_249_ += f_287_;
						i_247_ += f_277_;
						f_253_ += f_288_;
						f_251_ += f_278_;
						f_256_ += f_289_;
						f_254_ += f_279_;
						f_259_ += f_290_;
						f_257_ += f_280_;
						f_262_ += f_291_;
						f_260_ += f_281_;
						f_231_ += (float) anInt127;
					}
					while (--f >= 0.0F) {
						method205(anIntArray139, anIntArray143, (int) f_231_, (int) f_234_, (int) f_233_, f_237_, f_236_, f_240_, f_239_, f_243_, f_242_, (float) i_249_, (float) i_248_, f_253_, f_252_, f_256_, f_255_, f_259_, f_258_, f_262_, f_261_);
						f_234_ += f_283_;
						f_233_ += f_263_;
						f_237_ += f_284_;
						f_236_ += f_264_;
						f_240_ += f_285_;
						f_239_ += f_265_;
						f_243_ += f_286_;
						f_242_ += f_266_;
						i_249_ += f_287_;
						i_248_ += f_267_;
						f_253_ += f_288_;
						f_252_ += f_268_;
						f_256_ += f_289_;
						f_255_ += f_269_;
						f_259_ += f_290_;
						f_258_ += f_270_;
						f_262_ += f_291_;
						f_261_ += f_271_;
						f_231_ += (float) anInt127;
					}
				}
			}
		}
	}

	final void method213(boolean bool) {
		aBoolean142 = bool;
	}

	private final void method214(int[] is, float[] fs, int i, int i_293_, int i_294_, int i_295_, int i_296_, float f, float f_297_, float f_298_, float f_299_, float f_300_, float f_301_, float f_302_, float f_303_) {
		if (((Class12) this).aBoolean135) {
			if (i_296_ > ((Class12) this).anInt141)
				i_296_ = ((Class12) this).anInt141;
			if (i_295_ < 0)
				i_295_ = 0;
		}
		if (i_295_ < i_296_) {
			if (aBoolean140) {
				i += i_295_;
				f_298_ += f_299_ * (float) i_295_;
				f_300_ += f_301_ * (float) i_295_;
				f_302_ += f_303_ * (float) i_295_;
				if (((Class12) this).aBoolean134) {
					i_294_ = i_296_ - i_295_ >> 2;
					f_299_ *= 4.0F;
					f_301_ *= 4.0F;
					f_303_ *= 4.0F;
					if (((Class12) this).anInt137 == 0) {
						if (i_294_ > 0) {
							do {
								i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
								is[i++] = i_293_;
								is[i++] = i_293_;
								is[i++] = i_293_;
								is[i++] = i_293_;
							} while (--i_294_ > 0);
						}
						i_294_ = i_296_ - i_295_ & 0x3;
						if (i_294_ > 0) {
							i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							do
								is[i++] = i_293_;
							while (--i_294_ > 0);
						}
					} else if (!((Class12) this).aBoolean130) {
						int i_304_ = ((Class12) this).anInt137;
						int i_305_ = 256 - ((Class12) this).anInt137;
						if (i_294_ > 0) {
							do {
								i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
								i_293_ = (((i_293_ & 0xff00ff) * i_305_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_305_ >> 8 & 0xff00));
								int i_306_ = is[i];
								is[i++] = (i_293_ + ((i_306_ & 0xff00ff) * i_304_ >> 8 & 0xff00ff) + ((i_306_ & 0xff00) * i_304_ >> 8 & 0xff00));
								i_306_ = is[i];
								is[i++] = (i_293_ + ((i_306_ & 0xff00ff) * i_304_ >> 8 & 0xff00ff) + ((i_306_ & 0xff00) * i_304_ >> 8 & 0xff00));
								i_306_ = is[i];
								is[i++] = (i_293_ + ((i_306_ & 0xff00ff) * i_304_ >> 8 & 0xff00ff) + ((i_306_ & 0xff00) * i_304_ >> 8 & 0xff00));
								i_306_ = is[i];
								is[i++] = (i_293_ + ((i_306_ & 0xff00ff) * i_304_ >> 8 & 0xff00ff) + ((i_306_ & 0xff00) * i_304_ >> 8 & 0xff00));
							} while (--i_294_ > 0);
						}
						i_294_ = i_296_ - i_295_ & 0x3;
						if (i_294_ > 0) {
							i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							i_293_ = (((i_293_ & 0xff00ff) * i_305_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_305_ >> 8 & 0xff00));
							do {
								int i_307_ = is[i];
								is[i++] = (i_293_ + ((i_307_ & 0xff00ff) * i_304_ >> 8 & 0xff00ff) + ((i_307_ & 0xff00) * i_304_ >> 8 & 0xff00));
							} while (--i_294_ > 0);
						}
					} else {
						if (i_294_ > 0) {
							do {
								i_293_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
								int[] is_308_ = is;
								int i_309_ = i++;
								int i_310_ = i_293_;
								int i_311_ = is_308_[i_309_];
								int i_312_ = i_310_ + i_311_;
								int i_313_ = ((i_310_ & 0xff00ff) + (i_311_ & 0xff00ff));
								i_311_ = (i_313_ & 0x1000100) + (i_312_ - i_313_ & 0x10000);
								is_308_[i_309_] = (~0xffffff | i_312_ - i_311_ | i_311_ - (i_311_ >>> 8));
								int[] is_314_ = is;
								int i_315_ = i++;
								int i_316_ = i_293_;
								int i_317_ = is_314_[i_315_];
								int i_318_ = i_316_ + i_317_;
								int i_319_ = ((i_316_ & 0xff00ff) + (i_317_ & 0xff00ff));
								i_317_ = (i_319_ & 0x1000100) + (i_318_ - i_319_ & 0x10000);
								is_314_[i_315_] = (~0xffffff | i_318_ - i_317_ | i_317_ - (i_317_ >>> 8));
								int[] is_320_ = is;
								int i_321_ = i++;
								int i_322_ = i_293_;
								int i_323_ = is_320_[i_321_];
								int i_324_ = i_322_ + i_323_;
								int i_325_ = ((i_322_ & 0xff00ff) + (i_323_ & 0xff00ff));
								i_323_ = (i_325_ & 0x1000100) + (i_324_ - i_325_ & 0x10000);
								is_320_[i_321_] = (~0xffffff | i_324_ - i_323_ | i_323_ - (i_323_ >>> 8));
								int[] is_326_ = is;
								int i_327_ = i++;
								int i_328_ = i_293_;
								int i_329_ = is_326_[i_327_];
								int i_330_ = i_328_ + i_329_;
								int i_331_ = ((i_328_ & 0xff00ff) + (i_329_ & 0xff00ff));
								i_329_ = (i_331_ & 0x1000100) + (i_330_ - i_331_ & 0x10000);
								is_326_[i_327_] = (~0xffffff | i_330_ - i_329_ | i_329_ - (i_329_ >>> 8));
							} while (--i_294_ > 0);
						}
						i_294_ = i_296_ - i_295_ & 0x3;
						if (i_294_ > 0) {
							i_293_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							do {
								int[] is_332_ = is;
								int i_333_ = i++;
								int i_334_ = i_293_;
								int i_335_ = is_332_[i_333_];
								int i_336_ = i_334_ + i_335_;
								int i_337_ = ((i_334_ & 0xff00ff) + (i_335_ & 0xff00ff));
								i_335_ = (i_337_ & 0x1000100) + (i_336_ - i_337_ & 0x10000);
								is_332_[i_333_] = (~0xffffff | i_336_ - i_335_ | i_335_ - (i_335_ >>> 8));
							} while (--i_294_ > 0);
						}
					}
				} else {
					i_294_ = i_296_ - i_295_;
					if (((Class12) this).anInt137 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							f_298_ += f_299_;
							f_300_ += f_301_;
							f_302_ += f_303_;
						} while (--i_294_ > 0);
					} else if (!((Class12) this).aBoolean130) {
						int i_338_ = ((Class12) this).anInt137;
						int i_339_ = 256 - ((Class12) this).anInt137;
						do {
							i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							f_298_ += f_299_;
							f_300_ += f_301_;
							f_302_ += f_303_;
							i_293_ = (((i_293_ & 0xff00ff) * i_339_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_339_ >> 8 & 0xff00));
							int i_340_ = is[i];
							is[i++] = (i_293_ + ((i_340_ & 0xff00ff) * i_338_ >> 8 & 0xff00ff) + ((i_340_ & 0xff00) * i_338_ >> 8 & 0xff00));
						} while (--i_294_ > 0);
					} else {
						do {
							int[] is_341_ = is;
							int i_342_ = i++;
							int i_343_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							int i_344_ = is_341_[i_342_];
							int i_345_ = i_343_ + i_344_;
							int i_346_ = (i_343_ & 0xff00ff) + (i_344_ & 0xff00ff);
							i_344_ = (i_346_ & 0x1000100) + (i_345_ - i_346_ & 0x10000);
							is_341_[i_342_] = (~0xffffff | i_345_ - i_344_ | i_344_ - (i_344_ >>> 8));
							f_298_ += f_299_;
							f_300_ += f_301_;
							f_302_ += f_303_;
						} while (--i_294_ > 0);
					}
				}
			} else {
				i += i_295_ - 1;
				f += f_297_ * (float) i_295_;
				f_298_ += f_299_ * (float) i_295_;
				f_300_ += f_301_ * (float) i_295_;
				f_302_ += f_303_ * (float) i_295_;
				if (((Class235) aClass235_138).aBoolean1762) {
					if (((Class12) this).aBoolean134) {
						i_294_ = i_296_ - i_295_ >> 2;
						f_299_ *= 4.0F;
						f_301_ *= 4.0F;
						f_303_ *= 4.0F;
						if (((Class12) this).anInt137 == 0) {
							if (i_294_ > 0) {
								do {
									i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
									f_298_ += f_299_;
									f_300_ += f_301_;
									f_302_ += f_303_;
									if (f < fs[++i]) {
										is[i] = i_293_;
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										is[i] = i_293_;
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										is[i] = i_293_;
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										is[i] = i_293_;
										fs[i] = f;
									}
									f += f_297_;
								} while (--i_294_ > 0);
							}
							i_294_ = i_296_ - i_295_ & 0x3;
							if (i_294_ > 0) {
								i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								do {
									if (f < fs[++i]) {
										is[i] = i_293_;
										fs[i] = f;
									}
									f += f_297_;
								} while (--i_294_ > 0);
							}
						} else if (!((Class12) this).aBoolean130) {
							int i_347_ = ((Class12) this).anInt137;
							int i_348_ = 256 - ((Class12) this).anInt137;
							if (i_294_ > 0) {
								do {
									i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
									f_298_ += f_299_;
									f_300_ += f_301_;
									f_302_ += f_303_;
									i_293_ = (((i_293_ & 0xff00ff) * i_348_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_348_ >> 8 & 0xff00));
									if (f < fs[++i]) {
										int i_349_ = is[i];
										is[i] = (i_293_ + (((i_349_ & 0xff00ff) * i_347_ >> 8) & 0xff00ff) + (((i_349_ & 0xff00) * i_347_ >> 8) & 0xff00));
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										int i_350_ = is[i];
										is[i] = (i_293_ + (((i_350_ & 0xff00ff) * i_347_ >> 8) & 0xff00ff) + (((i_350_ & 0xff00) * i_347_ >> 8) & 0xff00));
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										int i_351_ = is[i];
										is[i] = (i_293_ + (((i_351_ & 0xff00ff) * i_347_ >> 8) & 0xff00ff) + (((i_351_ & 0xff00) * i_347_ >> 8) & 0xff00));
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										int i_352_ = is[i];
										is[i] = (i_293_ + (((i_352_ & 0xff00ff) * i_347_ >> 8) & 0xff00ff) + (((i_352_ & 0xff00) * i_347_ >> 8) & 0xff00));
										fs[i] = f;
									}
									f += f_297_;
								} while (--i_294_ > 0);
							}
							i_294_ = i_296_ - i_295_ & 0x3;
							if (i_294_ > 0) {
								i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								i_293_ = (((i_293_ & 0xff00ff) * i_348_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_348_ >> 8 & 0xff00));
								do {
									if (f < fs[++i]) {
										int i_353_ = is[i];
										is[i] = (i_293_ + (((i_353_ & 0xff00ff) * i_347_ >> 8) & 0xff00ff) + (((i_353_ & 0xff00) * i_347_ >> 8) & 0xff00));
										fs[i] = f;
									}
									f += f_297_;
								} while (--i_294_ > 0);
							}
						} else {
							if (i_294_ > 0) {
								do {
									i_293_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
									f_298_ += f_299_;
									f_300_ += f_301_;
									f_302_ += f_303_;
									if (f < fs[++i]) {
										int[] is_354_ = is;
										int i_355_ = i;
										int i_356_ = i_293_;
										int i_357_ = is_354_[i_355_];
										int i_358_ = i_356_ + i_357_;
										int i_359_ = ((i_356_ & 0xff00ff) + (i_357_ & 0xff00ff));
										i_357_ = ((i_359_ & 0x1000100) + (i_358_ - i_359_ & 0x10000));
										is_354_[i_355_] = (~0xffffff | i_358_ - i_357_ | i_357_ - (i_357_ >>> 8));
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										int[] is_360_ = is;
										int i_361_ = i;
										int i_362_ = i_293_;
										int i_363_ = is_360_[i_361_];
										int i_364_ = i_362_ + i_363_;
										int i_365_ = ((i_362_ & 0xff00ff) + (i_363_ & 0xff00ff));
										i_363_ = ((i_365_ & 0x1000100) + (i_364_ - i_365_ & 0x10000));
										is_360_[i_361_] = (~0xffffff | i_364_ - i_363_ | i_363_ - (i_363_ >>> 8));
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										int[] is_366_ = is;
										int i_367_ = i;
										int i_368_ = i_293_;
										int i_369_ = is_366_[i_367_];
										int i_370_ = i_368_ + i_369_;
										int i_371_ = ((i_368_ & 0xff00ff) + (i_369_ & 0xff00ff));
										i_369_ = ((i_371_ & 0x1000100) + (i_370_ - i_371_ & 0x10000));
										is_366_[i_367_] = (~0xffffff | i_370_ - i_369_ | i_369_ - (i_369_ >>> 8));
										fs[i] = f;
									}
									f += f_297_;
									if (f < fs[++i]) {
										int[] is_372_ = is;
										int i_373_ = i;
										int i_374_ = i_293_;
										int i_375_ = is_372_[i_373_];
										int i_376_ = i_374_ + i_375_;
										int i_377_ = ((i_374_ & 0xff00ff) + (i_375_ & 0xff00ff));
										i_375_ = ((i_377_ & 0x1000100) + (i_376_ - i_377_ & 0x10000));
										is_372_[i_373_] = (~0xffffff | i_376_ - i_375_ | i_375_ - (i_375_ >>> 8));
										fs[i] = f;
									}
									f += f_297_;
								} while (--i_294_ > 0);
							}
							i_294_ = i_296_ - i_295_ & 0x3;
							if (i_294_ > 0) {
								i_293_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								do {
									if (f < fs[++i]) {
										int[] is_378_ = is;
										int i_379_ = i;
										int i_380_ = i_293_;
										int i_381_ = is_378_[i_379_];
										int i_382_ = i_380_ + i_381_;
										int i_383_ = ((i_380_ & 0xff00ff) + (i_381_ & 0xff00ff));
										i_381_ = ((i_383_ & 0x1000100) + (i_382_ - i_383_ & 0x10000));
										is_378_[i_379_] = (~0xffffff | i_382_ - i_381_ | i_381_ - (i_381_ >>> 8));
										fs[i] = f;
									}
									f += f_297_;
								} while (--i_294_ > 0);
							}
						}
					} else {
						i_294_ = i_296_ - i_295_;
						if (((Class12) this).anInt137 == 0) {
							do {
								if (f < fs[++i]) {
									is[i] = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
									fs[i] = f;
								}
								f += f_297_;
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
							} while (--i_294_ > 0);
						} else if (!((Class12) this).aBoolean130) {
							int i_384_ = ((Class12) this).anInt137;
							int i_385_ = 256 - ((Class12) this).anInt137;
							do {
								if (f < fs[++i]) {
									i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
									i_293_ = (((i_293_ & 0xff00ff) * i_385_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_385_ >> 8 & 0xff00));
									int i_386_ = is[i];
									is[i] = (i_293_ + ((i_386_ & 0xff00ff) * i_384_ >> 8 & 0xff00ff) + ((i_386_ & 0xff00) * i_384_ >> 8 & 0xff00));
									fs[i] = f;
								}
								f += f_297_;
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
							} while (--i_294_ > 0);
						} else {
							do {
								if (f < fs[++i]) {
									int[] is_387_ = is;
									int i_388_ = i;
									int i_389_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
									int i_390_ = is_387_[i_388_];
									int i_391_ = i_389_ + i_390_;
									int i_392_ = ((i_389_ & 0xff00ff) + (i_390_ & 0xff00ff));
									i_390_ = ((i_392_ & 0x1000100) + (i_391_ - i_392_ & 0x10000));
									is_387_[i_388_] = (~0xffffff | i_391_ - i_390_ | i_390_ - (i_390_ >>> 8));
									fs[i] = f;
								}
								f += f_297_;
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
							} while (--i_294_ > 0);
						}
					}
				} else if (((Class12) this).aBoolean134) {
					i_294_ = i_296_ - i_295_ >> 2;
					f_299_ *= 4.0F;
					f_301_ *= 4.0F;
					f_303_ *= 4.0F;
					if (((Class12) this).anInt137 == 0) {
						if (i_294_ > 0) {
							do {
								i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
								if (f < fs[++i])
									is[i] = i_293_;
								f += f_297_;
								if (f < fs[++i])
									is[i] = i_293_;
								f += f_297_;
								if (f < fs[++i])
									is[i] = i_293_;
								f += f_297_;
								if (f < fs[++i])
									is[i] = i_293_;
								f += f_297_;
							} while (--i_294_ > 0);
						}
						i_294_ = i_296_ - i_295_ & 0x3;
						if (i_294_ > 0) {
							i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							do {
								if (f < fs[++i])
									is[i] = i_293_;
								f += f_297_;
							} while (--i_294_ > 0);
						}
					} else if (!((Class12) this).aBoolean130) {
						int i_393_ = ((Class12) this).anInt137;
						int i_394_ = 256 - ((Class12) this).anInt137;
						if (i_294_ > 0) {
							do {
								i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
								i_293_ = (((i_293_ & 0xff00ff) * i_394_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_394_ >> 8 & 0xff00));
								if (f < fs[++i]) {
									int i_395_ = is[i];
									is[i] = (i_293_ + ((i_395_ & 0xff00ff) * i_393_ >> 8 & 0xff00ff) + ((i_395_ & 0xff00) * i_393_ >> 8 & 0xff00));
								}
								f += f_297_;
								if (f < fs[++i]) {
									int i_396_ = is[i];
									is[i] = (i_293_ + ((i_396_ & 0xff00ff) * i_393_ >> 8 & 0xff00ff) + ((i_396_ & 0xff00) * i_393_ >> 8 & 0xff00));
								}
								f += f_297_;
								if (f < fs[++i]) {
									int i_397_ = is[i];
									is[i] = (i_293_ + ((i_397_ & 0xff00ff) * i_393_ >> 8 & 0xff00ff) + ((i_397_ & 0xff00) * i_393_ >> 8 & 0xff00));
								}
								f += f_297_;
								if (f < fs[++i]) {
									int i_398_ = is[i];
									is[i] = (i_293_ + ((i_398_ & 0xff00ff) * i_393_ >> 8 & 0xff00ff) + ((i_398_ & 0xff00) * i_393_ >> 8 & 0xff00));
								}
								f += f_297_;
							} while (--i_294_ > 0);
						}
						i_294_ = i_296_ - i_295_ & 0x3;
						if (i_294_ > 0) {
							i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							i_293_ = (((i_293_ & 0xff00ff) * i_394_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_394_ >> 8 & 0xff00));
							do {
								if (f < fs[++i]) {
									int i_399_ = is[i];
									is[i] = (i_293_ + ((i_399_ & 0xff00ff) * i_393_ >> 8 & 0xff00ff) + ((i_399_ & 0xff00) * i_393_ >> 8 & 0xff00));
								}
								f += f_297_;
							} while (--i_294_ > 0);
						}
					} else {
						if (i_294_ > 0) {
							do {
								i_293_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								f_298_ += f_299_;
								f_300_ += f_301_;
								f_302_ += f_303_;
								if (f < fs[++i]) {
									int[] is_400_ = is;
									int i_401_ = i;
									int i_402_ = i_293_;
									int i_403_ = is_400_[i_401_];
									int i_404_ = i_402_ + i_403_;
									int i_405_ = ((i_402_ & 0xff00ff) + (i_403_ & 0xff00ff));
									i_403_ = ((i_405_ & 0x1000100) + (i_404_ - i_405_ & 0x10000));
									is_400_[i_401_] = (~0xffffff | i_404_ - i_403_ | i_403_ - (i_403_ >>> 8));
								}
								f += f_297_;
								if (f < fs[++i]) {
									int[] is_406_ = is;
									int i_407_ = i;
									int i_408_ = i_293_;
									int i_409_ = is_406_[i_407_];
									int i_410_ = i_408_ + i_409_;
									int i_411_ = ((i_408_ & 0xff00ff) + (i_409_ & 0xff00ff));
									i_409_ = ((i_411_ & 0x1000100) + (i_410_ - i_411_ & 0x10000));
									is_406_[i_407_] = (~0xffffff | i_410_ - i_409_ | i_409_ - (i_409_ >>> 8));
								}
								f += f_297_;
								if (f < fs[++i]) {
									int[] is_412_ = is;
									int i_413_ = i;
									int i_414_ = i_293_;
									int i_415_ = is_412_[i_413_];
									int i_416_ = i_414_ + i_415_;
									int i_417_ = ((i_414_ & 0xff00ff) + (i_415_ & 0xff00ff));
									i_415_ = ((i_417_ & 0x1000100) + (i_416_ - i_417_ & 0x10000));
									is_412_[i_413_] = (~0xffffff | i_416_ - i_415_ | i_415_ - (i_415_ >>> 8));
								}
								f += f_297_;
								if (f < fs[++i]) {
									int[] is_418_ = is;
									int i_419_ = i;
									int i_420_ = i_293_;
									int i_421_ = is_418_[i_419_];
									int i_422_ = i_420_ + i_421_;
									int i_423_ = ((i_420_ & 0xff00ff) + (i_421_ & 0xff00ff));
									i_421_ = ((i_423_ & 0x1000100) + (i_422_ - i_423_ & 0x10000));
									is_418_[i_419_] = (~0xffffff | i_422_ - i_421_ | i_421_ - (i_421_ >>> 8));
								}
								f += f_297_;
							} while (--i_294_ > 0);
						}
						i_294_ = i_296_ - i_295_ & 0x3;
						if (i_294_ > 0) {
							i_293_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							do {
								if (f < fs[++i]) {
									int[] is_424_ = is;
									int i_425_ = i;
									int i_426_ = i_293_;
									int i_427_ = is_424_[i_425_];
									int i_428_ = i_426_ + i_427_;
									int i_429_ = ((i_426_ & 0xff00ff) + (i_427_ & 0xff00ff));
									i_427_ = ((i_429_ & 0x1000100) + (i_428_ - i_429_ & 0x10000));
									is_424_[i_425_] = (~0xffffff | i_428_ - i_427_ | i_427_ - (i_427_ >>> 8));
								}
								f += f_297_;
							} while (--i_294_ > 0);
						}
					}
				} else {
					i_294_ = i_296_ - i_295_;
					if (((Class12) this).anInt137 == 0) {
						do {
							if (f < fs[++i])
								is[i] = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
							f += f_297_;
							f_298_ += f_299_;
							f_300_ += f_301_;
							f_302_ += f_303_;
						} while (--i_294_ > 0);
					} else if (!((Class12) this).aBoolean130) {
						int i_430_ = ((Class12) this).anInt137;
						int i_431_ = 256 - ((Class12) this).anInt137;
						do {
							if (f < fs[++i]) {
								i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								i_293_ = (((i_293_ & 0xff00ff) * i_431_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_431_ >> 8 & 0xff00));
								int i_432_ = is[i];
								is[i] = (i_293_ + ((i_432_ & 0xff00ff) * i_430_ >> 8 & 0xff00ff) + ((i_432_ & 0xff00) * i_430_ >> 8 & 0xff00));
							}
							f += f_297_;
							f_298_ += f_299_;
							f_300_ += f_301_;
							f_302_ += f_303_;
						} while (--i_294_ > 0);
					} else {
						do {
							if (f < fs[++i]) {
								int[] is_433_ = is;
								int i_434_ = i;
								int i_435_ = ((int) f_298_ & 0xff0000 | (int) f_300_ & 0xff00 | (int) f_302_ & 0xff);
								int i_436_ = is_433_[i_434_];
								int i_437_ = i_435_ + i_436_;
								int i_438_ = ((i_435_ & 0xff00ff) + (i_436_ & 0xff00ff));
								i_436_ = (i_438_ & 0x1000100) + (i_437_ - i_438_ & 0x10000);
								is_433_[i_434_] = (~0xffffff | i_437_ - i_436_ | i_436_ - (i_436_ >>> 8));
							}
							f += f_297_;
							f_298_ += f_299_;
							f_300_ += f_301_;
							f_302_ += f_303_;
						} while (--i_294_ > 0);
					}
				}
			}
		}
	}

	private final void method215(int[] is, int[] is_439_, int i, int i_440_, int i_441_, float f, float f_442_, float f_443_, float f_444_, float f_445_, float f_446_, float f_447_, float f_448_, float f_449_, float f_450_, float f_451_, float f_452_, float f_453_, float f_454_, float f_455_, float f_456_, float f_457_, float f_458_, float f_459_, float f_460_) {
		int i_461_ = i_441_ - i_440_;
		float f_462_ = 1.0F / (float) i_461_;
		float f_463_ = (f_442_ - f) * f_462_;
		float f_464_ = (f_444_ - f_443_) * f_462_;
		float f_465_ = (f_446_ - f_445_) * f_462_;
		float f_466_ = (f_448_ - f_447_) * f_462_;
		float f_467_ = (f_452_ - f_451_) * f_462_;
		float f_468_ = (f_454_ - f_453_) * f_462_;
		float f_469_ = (f_456_ - f_455_) * f_462_;
		float f_470_ = (f_458_ - f_457_) * f_462_;
		float f_471_ = (f_460_ - f_459_) * f_462_;
		if (((Class12) this).aBoolean135) {
			if (i_441_ > ((Class12) this).anInt141)
				i_441_ = ((Class12) this).anInt141;
			if (i_440_ < 0) {
				f -= f_463_ * (float) i_440_;
				f_443_ -= f_464_ * (float) i_440_;
				f_445_ -= f_465_ * (float) i_440_;
				f_447_ -= f_466_ * (float) i_440_;
				f_451_ -= f_467_ * (float) i_440_;
				f_453_ -= f_468_ * (float) i_440_;
				f_455_ -= f_469_ * (float) i_440_;
				f_457_ -= f_470_ * (float) i_440_;
				f_459_ -= f_471_ * (float) i_440_;
				i_440_ = 0;
			}
		}
		if (i_440_ < i_441_) {
			i_461_ = i_441_ - i_440_;
			i += i_440_;
			while (i_461_-- > 0) {
				float f_472_ = 1.0F / f;
				if (f_472_ < aFloatArray132[i]) {
					float f_473_ = f_443_ * f_472_;
					float f_474_ = f_445_ * f_472_;
					int i_475_ = ((int) (f_473_ * (float) anInt151 * aFloat157) & anInt146);
					int i_476_ = ((int) (f_474_ * (float) anInt151 * aFloat157) & anInt146);
					int i_477_ = anIntArray143[i_476_ * anInt151 + i_475_];
					i_475_ = ((int) (f_473_ * (float) anInt153 * aFloat149) & anInt152);
					i_476_ = ((int) (f_474_ * (float) anInt153 * aFloat149) & anInt152);
					int i_478_ = anIntArray145[i_476_ * anInt153 + i_475_];
					i_475_ = ((int) (f_473_ * (float) anInt160 * aFloat150) & anInt148);
					i_476_ = ((int) (f_474_ * (float) anInt160 * aFloat150) & anInt148);
					int i_479_ = anIntArray156[i_476_ * anInt160 + i_475_];
					float f_480_ = 1.0F - (f_457_ + f_459_);
					i_477_ = (~0xffffff | ((int) (f_457_ * (float) (i_477_ >> 16 & 0xff)) << 16) | (int) (f_457_ * (float) (i_477_ >> 8 & 0xff)) << 8 | (int) (f_457_ * (float) (i_477_ & 0xff)));
					i_478_ = (~0xffffff | ((int) (f_459_ * (float) (i_478_ >> 16 & 0xff)) << 16) | (int) (f_459_ * (float) (i_478_ >> 8 & 0xff)) << 8 | (int) (f_459_ * (float) (i_478_ & 0xff)));
					i_479_ = (~0xffffff | ((int) (f_480_ * (float) (i_479_ >> 16 & 0xff)) << 16) | (int) (f_480_ * (float) (i_479_ >> 8 & 0xff)) << 8 | (int) (f_480_ * (float) (i_479_ & 0xff)));
					int i_481_ = i_477_ + i_478_ + i_479_;
					int i_482_ = (~0xffffff | ((int) (f_451_ * (float) (i_481_ >> 16 & 0xff)) << 8) & 0xff0000 | ((int) (f_453_ * (float) (i_481_ >> 8 & 0xff)) & 0xff00) | (int) (f_455_ * (float) (i_481_ & 0xff)) >> 8);
					if (f_447_ != 0.0F) {
						int i_483_ = (int) (255.0F - f_447_);
						int i_484_ = ((anInt155 & 0xff00ff) * (int) f_447_ & ~0xff00ff | ((anInt155 & 0xff00) * (int) f_447_ & 0xff0000)) >>> 8;
						i_482_ = (((i_482_ & 0xff00ff) * i_483_ & ~0xff00ff | (i_482_ & 0xff00) * i_483_ & 0xff0000) >>> 8) + i_484_;
					}
					is[i] = i_482_;
					aFloatArray132[i] = f_472_;
				}
				i++;
				f += f_463_;
				f_443_ += f_464_;
				f_445_ += f_465_;
				f_447_ += f_466_;
				f_451_ += f_467_;
				f_453_ += f_468_;
				f_455_ += f_469_;
				f_457_ += f_470_;
				f_459_ += f_471_;
			}
		}
	}

	final void method216(float f, float f_485_, float f_486_, float f_487_, float f_488_, float f_489_, float f_490_, float f_491_, float f_492_, float f_493_, float f_494_, float f_495_) {
		if (aBoolean142) {
			aHa_Sub2_131.method1789((int) f, Class221.anIntArray1665[(int) f_493_], (int) f_485_, (int) f_488_, -10550, (int) f_487_);
			aHa_Sub2_131.method1789((int) f_485_, Class221.anIntArray1665[(int) f_493_], (int) f_486_, (int) f_489_, -10550, (int) f_488_);
			aHa_Sub2_131.method1789((int) f_486_, Class221.anIntArray1665[(int) f_493_], (int) f, (int) f_487_, -10550, (int) f_489_);
		} else {
			float f_496_ = f_488_ - f_487_;
			float f_497_ = f_485_ - f;
			float f_498_ = f_489_ - f_487_;
			float f_499_ = f_486_ - f;
			float f_500_ = f_494_ - f_493_;
			float f_501_ = f_495_ - f_493_;
			float f_502_ = f_491_ - f_490_;
			float f_503_ = f_492_ - f_490_;
			float f_504_;
			if (f_486_ != f_485_)
				f_504_ = (f_489_ - f_488_) / (f_486_ - f_485_);
			else
				f_504_ = 0.0F;
			float f_505_;
			if (f_485_ != f)
				f_505_ = f_496_ / f_497_;
			else
				f_505_ = 0.0F;
			float f_506_;
			if (f_486_ != f)
				f_506_ = f_498_ / f_499_;
			else
				f_506_ = 0.0F;
			float f_507_ = f_496_ * f_499_ - f_498_ * f_497_;
			if (f_507_ != 0.0F) {
				float f_508_ = (f_500_ * f_499_ - f_501_ * f_497_) / f_507_;
				float f_509_ = (f_501_ * f_496_ - f_500_ * f_498_) / f_507_;
				float f_510_ = (f_502_ * f_499_ - f_503_ * f_497_) / f_507_;
				float f_511_ = (f_503_ * f_496_ - f_502_ * f_498_) / f_507_;
				if (f <= f_485_ && f <= f_486_) {
					if (!(f >= (float) ((Class12) this).anInt129)) {
						if (f_485_ > (float) ((Class12) this).anInt129)
							f_485_ = (float) ((Class12) this).anInt129;
						if (f_486_ > (float) ((Class12) this).anInt129)
							f_486_ = (float) ((Class12) this).anInt129;
						f_493_ = f_493_ - f_508_ * f_487_ + f_508_;
						f_490_ = f_490_ - f_510_ * f_487_ + f_510_;
						if (f_485_ < f_486_) {
							f_489_ = f_487_;
							if (f < 0.0F) {
								f_489_ -= f_506_ * f;
								f_487_ -= f_505_ * f;
								f_493_ -= f_509_ * f;
								f_490_ -= f_511_ * f;
								f = 0.0F;
							}
							if (f_485_ < 0.0F) {
								f_488_ -= f_504_ * f_485_;
								f_485_ = 0.0F;
							}
							if (f != f_485_ && f_506_ < f_505_ || f == f_485_ && f_506_ > f_504_) {
								f_486_ -= f_485_;
								f_485_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_485_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_489_, (int) f_487_, f_493_, f_508_, f_490_, f_510_);
									f_489_ += f_506_;
									f_487_ += f_505_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_489_, (int) f_488_, f_493_, f_508_, f_490_, f_510_);
									f_489_ += f_506_;
									f_488_ += f_504_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
							} else {
								f_486_ -= f_485_;
								f_485_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_485_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_487_, (int) f_489_, f_493_, f_508_, f_490_, f_510_);
									f_489_ += f_506_;
									f_487_ += f_505_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_488_, (int) f_489_, f_493_, f_508_, f_490_, f_510_);
									f_489_ += f_506_;
									f_488_ += f_504_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
							}
						} else {
							f_488_ = f_487_;
							if (f < 0.0F) {
								f_488_ -= f_506_ * f;
								f_487_ -= f_505_ * f;
								f_493_ -= f_509_ * f;
								f_490_ -= f_511_ * f;
								f = 0.0F;
							}
							if (f_486_ < 0.0F) {
								f_489_ -= f_504_ * f_486_;
								f_486_ = 0.0F;
							}
							if (f != f_486_ && f_506_ < f_505_ || f == f_486_ && f_504_ > f_505_) {
								f_485_ -= f_486_;
								f_486_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_488_, (int) f_487_, f_493_, f_508_, f_490_, f_510_);
									f_488_ += f_506_;
									f_487_ += f_505_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
								while (--f_485_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_489_, (int) f_487_, f_493_, f_508_, f_490_, f_510_);
									f_489_ += f_504_;
									f_487_ += f_505_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
							} else {
								f_485_ -= f_486_;
								f_486_ -= f;
								f = (float) (((Class12) this).anIntArray133[(int) f]);
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_487_, (int) f_488_, f_493_, f_508_, f_490_, f_510_);
									f_488_ += f_506_;
									f_487_ += f_505_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
								while (--f_485_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f, 0, 0, (int) f_487_, (int) f_489_, f_493_, f_508_, f_490_, f_510_);
									f_489_ += f_504_;
									f_487_ += f_505_;
									f_493_ += f_509_;
									f_490_ += f_511_;
									f += (float) anInt127;
								}
							}
						}
					}
				} else if (f_485_ <= f_486_) {
					if (!(f_485_ >= (float) ((Class12) this).anInt129)) {
						if (f_486_ > (float) ((Class12) this).anInt129)
							f_486_ = (float) ((Class12) this).anInt129;
						if (f > (float) ((Class12) this).anInt129)
							f = (float) ((Class12) this).anInt129;
						f_494_ = f_494_ - f_508_ * f_488_ + f_508_;
						f_491_ = f_491_ - f_510_ * f_488_ + f_510_;
						if (f_486_ < f) {
							f_487_ = f_488_;
							if (f_485_ < 0.0F) {
								f_487_ -= f_505_ * f_485_;
								f_488_ -= f_504_ * f_485_;
								f_494_ -= f_509_ * f_485_;
								f_491_ -= f_511_ * f_485_;
								f_485_ = 0.0F;
							}
							if (f_486_ < 0.0F) {
								f_489_ -= f_506_ * f_486_;
								f_486_ = 0.0F;
							}
							if (f_485_ != f_486_ && f_505_ < f_504_ || f_485_ == f_486_ && f_505_ > f_506_) {
								f -= f_486_;
								f_486_ -= f_485_;
								f_485_ = (float) (((Class12) this).anIntArray133[(int) f_485_]);
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_487_, (int) f_488_, f_494_, f_508_, f_491_, f_510_);
									f_487_ += f_505_;
									f_488_ += f_504_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
								while (--f >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_487_, (int) f_489_, f_494_, f_508_, f_491_, f_510_);
									f_487_ += f_505_;
									f_489_ += f_506_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
							} else {
								f -= f_486_;
								f_486_ -= f_485_;
								f_485_ = (float) (((Class12) this).anIntArray133[(int) f_485_]);
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_488_, (int) f_487_, f_494_, f_508_, f_491_, f_510_);
									f_487_ += f_505_;
									f_488_ += f_504_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
								while (--f >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_489_, (int) f_487_, f_494_, f_508_, f_491_, f_510_);
									f_487_ += f_505_;
									f_489_ += f_506_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
							}
						} else {
							f_489_ = f_488_;
							if (f_485_ < 0.0F) {
								f_489_ -= f_505_ * f_485_;
								f_488_ -= f_504_ * f_485_;
								f_494_ -= f_509_ * f_485_;
								f_491_ -= f_511_ * f_485_;
								f_485_ = 0.0F;
							}
							if (f < 0.0F) {
								f_487_ -= f_506_ * f;
								f = 0.0F;
							}
							if (f_505_ < f_504_) {
								f_486_ -= f;
								f -= f_485_;
								f_485_ = (float) (((Class12) this).anIntArray133[(int) f_485_]);
								while (--f >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_489_, (int) f_488_, f_494_, f_508_, f_491_, f_510_);
									f_489_ += f_505_;
									f_488_ += f_504_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_487_, (int) f_488_, f_494_, f_508_, f_491_, f_510_);
									f_487_ += f_506_;
									f_488_ += f_504_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
							} else {
								f_486_ -= f;
								f -= f_485_;
								f_485_ = (float) (((Class12) this).anIntArray133[(int) f_485_]);
								while (--f >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_488_, (int) f_489_, f_494_, f_508_, f_491_, f_510_);
									f_489_ += f_505_;
									f_488_ += f_504_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
								while (--f_486_ >= 0.0F) {
									method204(anIntArray139, aFloatArray132, (int) f_485_, 0, 0, (int) f_488_, (int) f_487_, f_494_, f_508_, f_491_, f_510_);
									f_487_ += f_506_;
									f_488_ += f_504_;
									f_494_ += f_509_;
									f_491_ += f_511_;
									f_485_ += (float) anInt127;
								}
							}
						}
					}
				} else if (!(f_486_ >= (float) ((Class12) this).anInt129)) {
					if (f > (float) ((Class12) this).anInt129)
						f = (float) ((Class12) this).anInt129;
					if (f_485_ > (float) ((Class12) this).anInt129)
						f_485_ = (float) ((Class12) this).anInt129;
					f_495_ = f_495_ - f_508_ * f_489_ + f_508_;
					f_492_ = f_492_ - f_510_ * f_489_ + f_510_;
					if (f < f_485_) {
						f_488_ = f_489_;
						if (f_486_ < 0.0F) {
							f_488_ -= f_504_ * f_486_;
							f_489_ -= f_506_ * f_486_;
							f_495_ -= f_509_ * f_486_;
							f_492_ -= f_511_ * f_486_;
							f_486_ = 0.0F;
						}
						if (f < 0.0F) {
							f_487_ -= f_505_ * f;
							f = 0.0F;
						}
						if (f_504_ < f_506_) {
							f_485_ -= f;
							f -= f_486_;
							f_486_ = (float) (((Class12) this).anIntArray133[(int) f_486_]);
							while (--f >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_488_, (int) f_489_, f_495_, f_508_, f_492_, f_510_);
								f_488_ += f_504_;
								f_489_ += f_506_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
							while (--f_485_ >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_488_, (int) f_487_, f_495_, f_508_, f_492_, f_510_);
								f_488_ += f_504_;
								f_487_ += f_505_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
						} else {
							f_485_ -= f;
							f -= f_486_;
							f_486_ = (float) (((Class12) this).anIntArray133[(int) f_486_]);
							while (--f >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_489_, (int) f_488_, f_495_, f_508_, f_492_, f_510_);
								f_488_ += f_504_;
								f_489_ += f_506_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
							while (--f_485_ >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_487_, (int) f_488_, f_495_, f_508_, f_492_, f_510_);
								f_488_ += f_504_;
								f_487_ += f_505_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
						}
					} else {
						f_487_ = f_489_;
						if (f_486_ < 0.0F) {
							f_487_ -= f_504_ * f_486_;
							f_489_ -= f_506_ * f_486_;
							f_495_ -= f_509_ * f_486_;
							f_492_ -= f_511_ * f_486_;
							f_486_ = 0.0F;
						}
						if (f_485_ < 0.0F) {
							f_488_ -= f_505_ * f_485_;
							f_485_ = 0.0F;
						}
						if (f_504_ < f_506_) {
							f -= f_485_;
							f_485_ -= f_486_;
							f_486_ = (float) (((Class12) this).anIntArray133[(int) f_486_]);
							while (--f_485_ >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_487_, (int) f_489_, f_495_, f_508_, f_492_, f_510_);
								f_487_ += f_504_;
								f_489_ += f_506_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
							while (--f >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_488_, (int) f_489_, f_495_, f_508_, f_492_, f_510_);
								f_488_ += f_505_;
								f_489_ += f_506_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
						} else {
							f -= f_485_;
							f_485_ -= f_486_;
							f_486_ = (float) (((Class12) this).anIntArray133[(int) f_486_]);
							while (--f_485_ >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_489_, (int) f_487_, f_495_, f_508_, f_492_, f_510_);
								f_487_ += f_504_;
								f_489_ += f_506_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
							while (--f >= 0.0F) {
								method204(anIntArray139, aFloatArray132, (int) f_486_, 0, 0, (int) f_489_, (int) f_488_, f_495_, f_508_, f_492_, f_510_);
								f_488_ += f_505_;
								f_489_ += f_506_;
								f_495_ += f_509_;
								f_492_ += f_511_;
								f_486_ += (float) anInt127;
							}
						}
					}
				}
			}
		}
	}

	Class12(ha_Sub2 var_ha_Sub2, Class235 class235) {
		((Class12) this).aBoolean134 = true;
		aBoolean140 = false;
		((Class12) this).aBoolean135 = false;
		aBoolean142 = false;
		anInt144 = -1;
		anInt146 = 0;
		aFloat149 = 0.0F;
		anIntArray145 = null;
		anInt147 = 0;
		aFloat150 = 0.0F;
		anIntArray143 = null;
		anInt148 = 0;
		anInt151 = 0;
		anInt152 = 0;
		anInt153 = 0;
		anIntArray156 = null;
		aFloat157 = 0.0F;
		aBoolean154 = true;
		anInt158 = -1;
		anInt159 = -1;
		anInt160 = 0;
		aHa_Sub2_131 = var_ha_Sub2;
		aClass235_138 = class235;
		anInt127 = ((ha_Sub2) aHa_Sub2_131).anInt4505;
		anIntArray139 = ((ha_Sub2) aHa_Sub2_131).anIntArray4504;
		aFloatArray132 = ((ha_Sub2) aHa_Sub2_131).aFloatArray4487;
	}
}
