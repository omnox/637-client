
/* s_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class s_Sub2 extends s {
	ha_Sub3 aHa_Sub3_5225;
	int[][][] anIntArrayArrayArray5226;
	private int anInt5227;
	private int[][][] anIntArrayArrayArray5228;
	private int anInt5229;
	short[][] aShortArrayArray5230;
	private LinkedList aClass148_5231;
	private int anInt5232;
	int anInt5233;
	private byte[][] aByteArrayArray5234;
	private Class15 aClass15_5235;
	private Class98_Sub30[][][] aClass98_Sub30ArrayArrayArray5236;
	private int anInt5237;
	private float aFloat5238 = 3.4028235E38F;
	private int[][][] anIntArrayArrayArray5239;
	int[][][] anIntArrayArrayArray5240;
	int[][][] anIntArrayArrayArray5241;
	private int[][][] anIntArrayArrayArray5242;
	private float aFloat5243 = -3.4028235E38F;
	private int anInt5244;
	private Interface2_Impl1 anInterface2_Impl1_5245;
	private Class98_Sub30[] aClass98_Sub30Array5246;
	private Class377 aClass377_5247;
	private float[][] aFloatArrayArray5248;
	private Interface2_Impl1 anInterface2_Impl1_5249;
	private int anInt5250;
	private float[][] aFloatArrayArray5251;
	Class256 aClass256_5252;
	private byte[][] aByteArrayArray5253;
	private float[][] aFloatArrayArray5254;

	private final void method3435(int i, int i_0_, int i_1_, boolean bool, boolean[][] bools, int i_2_, int i_3_, byte i_4_) {
		try {
			if (aClass98_Sub30Array5246 != null) {
				int i_5_ = 1 + (i_2_ + i_2_);
				i_5_ *= i_5_;
				if ((Class98_Sub31_Sub2.anIntArray5832.length ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
					Class98_Sub31_Sub2.anIntArray5832 = new int[i_5_];
				int i_6_ = -i_2_ + i_0_;
				int i_7_ = i_6_;
				if ((i_6_ ^ 0xffffffff) > -1)
					i_6_ = 0;
				int i_8_ = i_1_ - i_2_;
				int i_9_ = i_8_;
				if (i_8_ < 0)
					i_8_ = 0;
				int i_10_ = i_0_ + i_2_;
				if ((i_10_ ^ 0xffffffff) < (((s) this).anInt2203 - 1 ^ 0xffffffff))
					i_10_ = ((s) this).anInt2203 + -1;
				int i_11_ = i_1_ - -i_2_;
				Class337.anInt3539 = 0;
				if (-1 + ((s) this).anInt2204 < i_11_)
					i_11_ = ((s) this).anInt2204 + -1;
				for (int i_12_ = i_6_; i_10_ >= i_12_; i_12_++) {
					boolean[] bools_13_ = bools[-i_7_ + i_12_];
					for (int i_14_ = i_8_; i_11_ >= i_14_; i_14_++) {
						if (bools_13_[-i_9_ + i_14_])
							Class98_Sub31_Sub2.anIntArray5832[Class337.anInt3539++] = ((s) this).anInt2203 * i_14_ - -i_12_;
					}
				}
				if (i_3_ != -1) {
					((s_Sub2) this).aHa_Sub3_5225.method2056(117, (float) i_3_);
					((s_Sub2) this).aHa_Sub3_5225.method1937(4);
				} else
					((s_Sub2) this).aHa_Sub3_5225.method1976(-65);
				((s_Sub2) this).aHa_Sub3_5225.method1960(13951);
				((s_Sub2) this).aHa_Sub3_5225.method1979((0x7 & ((s_Sub2) this).anInt5233) != 0, -126);
				((s_Sub2) this).aHa_Sub3_5225.method2039(false, 0, -1, false);
				((s_Sub2) this).aHa_Sub3_5225.method1971(0, true, anInterface2_Impl1_5249);
				for (int i_15_ = 0; aClass98_Sub30Array5246.length > i_15_; i_15_++)
					aClass98_Sub30Array5246[i_15_].method1314(Class98_Sub31_Sub2.anIntArray5832, Class337.anInt3539, 32736);
				Class111_Sub3 class111_sub3 = ((s_Sub2) this).aHa_Sub3_5225.method1978((byte) 121);
				class111_sub3.method2100(0, -1, 0);
				((s_Sub2) this).aHa_Sub3_5225.method1935(1);
				if (!aClass148_5231.method2420(-124)) {
					int i_16_ = ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4636;
					int i_17_ = ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4581;
					((s_Sub2) this).aHa_Sub3_5225.L(0, i_17_, ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4601);
					((s_Sub2) this).aHa_Sub3_5225.method1979(false, -105);
					((s_Sub2) this).aHa_Sub3_5225.method1997(0, false);
					((s_Sub2) this).aHa_Sub3_5225.method2001(128, 70);
					((s_Sub2) this).aHa_Sub3_5225.method2039(false, 0, -2, false);
					((s_Sub2) this).aHa_Sub3_5225.method2005((((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInterface4_4586), -115);
					((s_Sub2) this).aHa_Sub3_5225.method2019((Class288.aClass128_3381), (Class249.aClass128_1903), 22831);
					((s_Sub2) this).aHa_Sub3_5225.method2051(0, -126, Class64_Sub16.aClass65_3681);
					((s_Sub2) this).aHa_Sub3_5225.method1953(-91, Class98_Sub43_Sub3.aClass65_5926, 0);
					for (Node class98 = aClass148_5231.method2418(32); class98 != null; class98 = aClass148_5231.method2417(119)) {
						Class98_Sub25 class98_sub25 = (Class98_Sub25) class98;
						class98_sub25.method1270(0, bools, i_0_, i_1_, i_2_);
					}
					((s_Sub2) this).aHa_Sub3_5225.method2051(0, -76, Class300.aClass65_2499);
					((s_Sub2) this).aHa_Sub3_5225.method1953(-103, Class300.aClass65_2499, 0);
					((s_Sub2) this).aHa_Sub3_5225.method2005(null, 69);
					((s_Sub2) this).aHa_Sub3_5225.L(i_16_, i_17_, ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4601);
				}
				if (aClass15_5235 != null) {
					((s_Sub2) this).aHa_Sub3_5225.method1971(0, true, anInterface2_Impl1_5249);
					((s_Sub2) this).aHa_Sub3_5225.method1971(1, true, anInterface2_Impl1_5245);
					((s_Sub2) this).aHa_Sub3_5225.method2042((((s_Sub2) this).aClass256_5252), (byte) 100);
					aClass15_5235.method227(i_0_, bool, bools, i_1_, i_2_, 119);
				}
			}
			if (i_4_ >= -55)
				aFloatArrayArray5248 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + bool + ',' + (bools != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void YA() {
		try {
			if (anInt5250 <= 0)
				aClass15_5235 = null;
			else {
				byte[][] is = (new byte[((s) this).anInt2203 - -1][((s) this).anInt2204 - -1]);
				for (int i = 1; (i ^ 0xffffffff) > (((s) this).anInt2203 ^ 0xffffffff); i++) {
					for (int i_18_ = 1; ((((s) this).anInt2204 ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++)
						is[i][i_18_] = (byte) ((aByteArrayArray5253[i + 1][i_18_] >> -1922706173) + ((aByteArrayArray5253[i + -1][i_18_] >> 1738188642) + (aByteArrayArray5253[i][i_18_ + -1] >> 692982306) + (aByteArrayArray5253[i][i_18_ - -1] >> -1256993341) + (aByteArrayArray5253[i][i_18_] >> 1578820961)));
				}
				Class98_Sub30[] class98_sub30s = new Class98_Sub30[aClass377_5247.method3999((byte) -6)];
				aClass377_5247.method3992(class98_sub30s, (byte) 74);
				for (int i = 0; class98_sub30s.length > i; i++)
					class98_sub30s[i].method1316(anInt5250, 4);
				int i = 20;
				if (anIntArrayArrayArray5239 != null)
					i += 4;
				if ((0x7 & ((s_Sub2) this).anInt5233 ^ 0xffffffff) != -1)
					i += 12;
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).aNativeHeap4522.a(anInt5250 * 4, false);
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_19_ = ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).aNativeHeap4522.a(anInt5250 * i, false);
				Stream stream = new Stream(nativeheapbuffer_19_);
				Stream stream_20_ = new Stream(nativeheapbuffer);
				Class98_Sub30[] class98_sub30s_21_ = new Class98_Sub30[anInt5250];
				int i_22_ = Class23.method282(68, anInt5250 / 4);
				if (i_22_ < 1)
					i_22_ = 1;
				Class377 class377 = new Class377(i_22_);
				Class98_Sub30[] class98_sub30s_23_ = new Class98_Sub30[anInt5244];
				for (int i_24_ = 0; ((s) this).anInt2203 > i_24_; i_24_++) {
					for (int i_25_ = 0; ((i_25_ ^ 0xffffffff) > (((s) this).anInt2204 ^ 0xffffffff)); i_25_++) {
						if ((((s_Sub2) this).anIntArrayArrayArray5241[i_24_][i_25_]) != null) {
							Class98_Sub30[] class98_sub30s_26_ = (aClass98_Sub30ArrayArrayArray5236[i_24_][i_25_]);
							int[] is_27_ = (((s_Sub2) this).anIntArrayArrayArray5226[i_24_][i_25_]);
							int[] is_28_ = (((s_Sub2) this).anIntArrayArrayArray5240[i_24_][i_25_]);
							int[] is_29_ = anIntArrayArrayArray5242[i_24_][i_25_];
							int[] is_30_ = (((s_Sub2) this).anIntArrayArrayArray5241[i_24_][i_25_]);
							int[] is_31_ = (anIntArrayArrayArray5228 != null ? anIntArrayArrayArray5228[i_24_][i_25_] : null);
							if (is_29_ == null)
								is_29_ = is_30_;
							int[] is_32_ = (anIntArrayArrayArray5239 == null ? null : anIntArrayArrayArray5239[i_24_][i_25_]);
							float f = aFloatArrayArray5251[i_24_][i_25_];
							float f_33_ = aFloatArrayArray5248[i_24_][i_25_];
							float f_34_ = aFloatArrayArray5254[i_24_][i_25_];
							float f_35_ = aFloatArrayArray5251[i_24_][i_25_ - -1];
							float f_36_ = aFloatArrayArray5248[i_24_][1 + i_25_];
							float f_37_ = aFloatArrayArray5254[i_24_][i_25_ + 1];
							float f_38_ = aFloatArrayArray5251[1 + i_24_][i_25_ - -1];
							float f_39_ = aFloatArrayArray5248[1 + i_24_][1 + i_25_];
							float f_40_ = aFloatArrayArray5254[i_24_ + 1][i_25_ + 1];
							float f_41_ = aFloatArrayArray5251[1 + i_24_][i_25_];
							float f_42_ = aFloatArrayArray5248[1 + i_24_][i_25_];
							float f_43_ = aFloatArrayArray5254[i_24_ - -1][i_25_];
							int i_44_ = is[i_24_][i_25_] & 0xff;
							int i_45_ = is[i_24_][1 + i_25_] & 0xff;
							int i_46_ = 0xff & is[i_24_ - -1][i_25_ - -1];
							int i_47_ = is[1 + i_24_][i_25_] & 0xff;
							int i_48_ = 0;
							while_174_: for (int i_49_ = 0; is_30_.length > i_49_; i_49_++) {
								Class98_Sub30 class98_sub30 = class98_sub30s_26_[i_49_];
								for (int i_50_ = 0; ((i_50_ ^ 0xffffffff) > (i_48_ ^ 0xffffffff)); i_50_++) {
									if (class98_sub30s_23_[i_50_] == class98_sub30)
										continue while_174_;
								}
								class98_sub30s_23_[i_48_++] = class98_sub30;
							}
							short[] is_51_ = (((s_Sub2) this).aShortArrayArray5230[i_24_ + ((s) this).anInt2203 * i_25_] = new short[is_30_.length]);
							for (int i_52_ = 0; ((is_30_.length ^ 0xffffffff) < (i_52_ ^ 0xffffffff)); i_52_++) {
								int i_53_ = ((i_24_ << ((s) this).anInt2200) - -is_27_[i_52_]);
								int i_54_ = ((i_25_ << ((s) this).anInt2200) + is_28_[i_52_]);
								int i_55_ = i_53_ >> anInt5229;
								int i_56_ = i_54_ >> anInt5229;
								int i_57_ = is_30_[i_52_];
								int i_58_ = is_29_[i_52_];
								int i_59_ = is_31_ == null ? 0 : is_31_[i_52_];
								long l = ((long) i_58_ << -2100004688 | (long) i_57_ << -684988576 | (long) (i_55_ << -2037303504) | (long) i_56_);
								int i_60_ = is_27_[i_52_];
								int i_61_ = is_28_[i_52_];
								int i_62_ = 74;
								int i_63_ = 0;
								float f_64_ = 1.0F;
								float f_65_;
								float f_66_;
								float f_67_;
								if ((i_60_ ^ 0xffffffff) == -1 && (i_61_ ^ 0xffffffff) == -1) {
									f_66_ = f;
									i_62_ -= i_44_;
									f_67_ = f_34_;
									f_65_ = f_33_;
								} else if ((i_60_ ^ 0xffffffff) != -1 || ((((s) this).anInt2206 ^ 0xffffffff) != (i_61_ ^ 0xffffffff))) {
									if (((i_60_ ^ 0xffffffff) == (((s) this).anInt2206 ^ 0xffffffff)) && ((((s) this).anInt2206 ^ 0xffffffff) == (i_61_ ^ 0xffffffff))) {
										f_65_ = f_39_;
										f_66_ = f_38_;
										i_62_ -= i_46_;
										f_67_ = f_40_;
									} else if (((((s) this).anInt2206 ^ 0xffffffff) == (i_60_ ^ 0xffffffff)) && i_61_ == 0) {
										f_65_ = f_42_;
										f_67_ = f_43_;
										i_62_ -= i_47_;
										f_66_ = f_41_;
									} else {
										float f_68_ = ((float) i_60_ / (float) ((s) this).anInt2206);
										float f_69_ = ((float) i_61_ / (float) ((s) this).anInt2206);
										float f_70_ = (f_41_ - f) * f_68_ + f;
										float f_71_ = f_68_ * (-f_33_ + f_42_) + f_33_;
										float f_72_ = (-f_34_ + f_43_) * f_68_ + f_34_;
										float f_73_ = (-f_35_ + f_38_) * f_68_ + f_35_;
										float f_74_ = f_36_ + (f_39_ - f_36_) * f_68_;
										f_65_ = f_71_ + (f_74_ - f_71_) * f_69_;
										float f_75_ = f_37_ + f_68_ * (-f_37_ + f_40_);
										f_66_ = f_69_ * (-f_70_ + f_73_) + f_70_;
										f_67_ = (-f_72_ + f_75_) * f_69_ + f_72_;
										int i_76_ = (((i_47_ - i_44_) * i_60_ >> ((s) this).anInt2200) + i_44_);
										int i_77_ = (i_45_ + ((i_46_ + -i_45_) * i_60_ >> ((s) this).anInt2200));
										i_62_ -= (i_76_ + ((i_77_ - i_76_) * i_61_ >> ((s) this).anInt2200));
									}
								} else {
									i_62_ -= i_45_;
									f_65_ = f_36_;
									f_67_ = f_37_;
									f_66_ = f_35_;
								}
								if (i_57_ != -1) {
									int i_78_ = i_62_ * (0x7f & i_57_) >> 644451911;
									if (i_78_ < 2)
										i_78_ = 2;
									else if ((i_78_ ^ 0xffffffff) < -127)
										i_78_ = 126;
									if ((0x7 & ((s_Sub2) this).anInt5233 ^ 0xffffffff) == -1) {
										f_64_ = ((((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).aFloatArray4596[0]) * f_66_ + (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloatArray4596[1]) * f_65_ + f_67_ * (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloatArray4596[2]));
										f_64_ = ((((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).aFloat4576) + f_64_ * (!(f_64_ > 0.0F) ? (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloat4594) : (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloat4630)));
									}
									i_63_ = (Class208.anIntArray1579[i_78_ | 0xff80 & i_57_]);
								}
								Node class98 = null;
								if ((i_53_ & -1 + anInt5232) == 0 && ((-1 + anInt5232 & i_54_ ^ 0xffffffff) == -1))
									class98 = class377.method3990(l, -1);
								int i_79_;
								if (class98 == null) {
									int i_80_;
									if ((i_57_ ^ 0xffffffff) != (i_58_ ^ 0xffffffff)) {
										int i_81_ = ((i_58_ & 0x7f) * i_62_ >> 2050513671);
										if (i_81_ < 2)
											i_81_ = 2;
										else if ((i_81_ ^ 0xffffffff) < -127)
											i_81_ = 126;
										i_80_ = (Class208.anIntArray1579[i_81_ | i_58_ & 0xff80]);
										if ((0x7 & ((s_Sub2) this).anInt5233) == 0) {
											float f_82_ = (((((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloatArray4596[1]) * f_65_) + (f_66_ * (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloatArray4596[0])) + (f_67_ * (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloatArray4596[2])));
											f_82_ = ((!(f_64_ > 0.0F) ? (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloat4594) : (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloat4630)) * f_64_ + (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).aFloat4576));
											int i_83_ = ((0xff85b1 & i_80_) >> -762643504);
											int i_84_ = ((i_80_ & 0xffeb) >> 1741284072);
											int i_85_ = i_80_ & 0xff;
											i_83_ *= f_82_;
											i_84_ *= f_82_;
											if (i_83_ >= 0) {
												if (i_83_ > 255)
													i_83_ = 255;
											} else
												i_83_ = 0;
											if ((i_84_ ^ 0xffffffff) <= -1) {
												if (i_84_ > 255)
													i_84_ = 255;
											} else
												i_84_ = 0;
											i_85_ *= f_82_;
											if (i_85_ >= 0) {
												if (i_85_ > 255)
													i_85_ = 255;
											} else
												i_85_ = 0;
											i_80_ = (i_84_ << 1339637864 | i_83_ << -1999932656 | i_85_);
										}
									} else
										i_80_ = i_63_;
									if (!Stream.a()) {
										stream.a((float) i_53_);
										stream.a((float) (i_59_ + (this.method3417(i_53_, i_54_, true))));
										stream.a((float) i_54_);
										stream.a((float) i_53_);
										stream.a((float) i_54_);
										if (anIntArrayArrayArray5239 != null)
											stream.a((float) (is_32_ == null ? 0 : -1 + (is_32_[i_52_])));
										if ((((s_Sub2) this).anInt5233 & 0x7) != 0) {
											stream.a(f_66_);
											stream.a(f_65_);
											stream.a(f_67_);
										}
									} else {
										stream.b((float) i_53_);
										stream.b((float) (i_59_ + (this.method3417(i_53_, i_54_, true))));
										stream.b((float) i_54_);
										stream.b((float) i_53_);
										stream.b((float) i_54_);
										if (anIntArrayArrayArray5239 != null)
											stream.b((float) (is_32_ != null ? -1 + (is_32_[i_52_]) : 0));
										if ((((s_Sub2) this).anInt5233 & 0x7) != 0) {
											stream.b(f_66_);
											stream.b(f_65_);
											stream.b(f_67_);
										}
									}
									if (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).anInt4580 == 0)
										stream_20_.f(~0xffffff | i_80_);
									else
										stream_20_.a(i_80_ | ~0xffffff);
									i_79_ = anInt5237++;
									is_51_[i_52_] = (short) i_79_;
									if ((i_57_ ^ 0xffffffff) != 0)
										class98_sub30s_21_[i_79_] = class98_sub30s_26_[i_52_];
									class377.method3996(new Class98_Sub40(is_51_[i_52_]), l, -1);
								} else {
									is_51_[i_52_] = ((Class98_Sub40) (Class98_Sub40) class98).aShort4191;
									i_79_ = 0xffff & is_51_[i_52_];
									if ((i_57_ ^ 0xffffffff) != 0 && (((Node) (class98_sub30s_26_[i_52_])).uid < ((Node) (class98_sub30s_21_[i_79_])).uid))
										class98_sub30s_21_[i_79_] = class98_sub30s_26_[i_52_];
								}
								for (int i_86_ = 0; i_48_ > i_86_; i_86_++)
									class98_sub30s_23_[i_86_].method1317(i_79_, i_62_, -1, i_63_, f_64_);
								anInt5227++;
							}
						}
					}
				}
				for (int i_87_ = 0; i_87_ < anInt5237; i_87_++) {
					Class98_Sub30 class98_sub30 = class98_sub30s_21_[i_87_];
					if (class98_sub30 != null)
						class98_sub30.method1312(i_87_, true);
				}
				for (int i_88_ = 0; ((i_88_ ^ 0xffffffff) > (((s) this).anInt2203 ^ 0xffffffff)); i_88_++) {
					for (int i_89_ = 0; ((i_89_ ^ 0xffffffff) > (((s) this).anInt2204 ^ 0xffffffff)); i_89_++) {
						short[] is_90_ = (((s_Sub2) this).aShortArrayArray5230[i_89_ * ((s) this).anInt2203 - -i_88_]);
						if (is_90_ != null) {
							int i_91_ = 0;
							int i_92_ = 0;
							while (is_90_.length > i_92_) {
								int i_93_ = 0xffff & is_90_[i_92_++];
								int i_94_ = 0xffff & is_90_[i_92_++];
								int i_95_ = 0xffff & is_90_[i_92_++];
								Class98_Sub30 class98_sub30 = class98_sub30s_21_[i_93_];
								Class98_Sub30 class98_sub30_96_ = class98_sub30s_21_[i_94_];
								Class98_Sub30 class98_sub30_97_ = class98_sub30s_21_[i_95_];
								Class98_Sub30 class98_sub30_98_ = null;
								if (class98_sub30 != null) {
									class98_sub30.method1315(i_91_, -20787, i_88_, i_89_);
									class98_sub30_98_ = class98_sub30;
								}
								if (class98_sub30_96_ != null) {
									class98_sub30_96_.method1315(i_91_, -20787, i_88_, i_89_);
									if (class98_sub30_98_ == null || ((((Node) class98_sub30_96_).uid) < (((Node) class98_sub30_98_).uid)))
										class98_sub30_98_ = class98_sub30_96_;
								}
								if (class98_sub30_97_ != null) {
									class98_sub30_97_.method1315(i_91_, -20787, i_88_, i_89_);
									if (class98_sub30_98_ == null || ((((Node) class98_sub30_97_).uid) < (((Node) class98_sub30_98_).uid)))
										class98_sub30_98_ = class98_sub30_97_;
								}
								if (class98_sub30_98_ != null) {
									if (class98_sub30 != null)
										class98_sub30_98_.method1312(i_93_, true);
									if (class98_sub30_96_ != null)
										class98_sub30_98_.method1312(i_94_, true);
									if (class98_sub30_97_ != null)
										class98_sub30_98_.method1312(i_95_, true);
									class98_sub30_98_.method1315(i_91_, -20787, i_88_, i_89_);
								}
								i_91_++;
							}
						}
					}
				}
				stream.c();
				stream_20_.c();
				anInterface2_Impl1_5245 = ((s_Sub2) this).aHa_Sub3_5225.method2060(false, 44);
				anInterface2_Impl1_5245.method73((byte) -123, anInt5237 * 4, 4, nativeheapbuffer);
				anInterface2_Impl1_5249 = ((s_Sub2) this).aHa_Sub3_5225.method2060(false, 71);
				anInterface2_Impl1_5249.method73((byte) -89, i * anInt5237, i, nativeheapbuffer_19_);
				if ((0x7 & ((s_Sub2) this).anInt5233) != 0) {
					if (anIntArrayArrayArray5239 == null)
						((s_Sub2) this).aClass256_5252 = (((s_Sub2) this).aHa_Sub3_5225.method1982((new Class49[] { new Class49(new Class169[] { Class169.aClass169_1294, Class169.aClass169_1301, Class169.aClass169_1297 }), new Class49(Class169.aClass169_1298) }), 6));
					else
						((s_Sub2) this).aClass256_5252 = (((s_Sub2) this).aHa_Sub3_5225.method1982((new Class49[] { new Class49(new Class169[] { Class169.aClass169_1294, Class169.aClass169_1301, Class169.aClass169_1299, Class169.aClass169_1297 }), new Class49(Class169.aClass169_1298) }), 6));
				} else if (anIntArrayArrayArray5239 != null)
					((s_Sub2) this).aClass256_5252 = (((s_Sub2) this).aHa_Sub3_5225.method1982((new Class49[] { new Class49(new Class169[] { Class169.aClass169_1294, Class169.aClass169_1301, Class169.aClass169_1299 }), new Class49(Class169.aClass169_1298) }), 6));
				else
					((s_Sub2) this).aClass256_5252 = (((s_Sub2) this).aHa_Sub3_5225.method1982((new Class49[] { new Class49(new Class169[] { Class169.aClass169_1294, Class169.aClass169_1301 }), new Class49(Class169.aClass169_1298) }), 6));
				int i_99_ = 0;
				for (int i_100_ = 0; ((class98_sub30s.length ^ 0xffffffff) < (i_100_ ^ 0xffffffff)); i_100_++) {
					if ((((Class98_Sub30) class98_sub30s[i_100_]).anInt4098 ^ 0xffffffff) < -1)
						class98_sub30s[i_99_++] = class98_sub30s[i_100_];
				}
				aClass98_Sub30Array5246 = new Class98_Sub30[i_99_];
				long[] ls = new long[i_99_];
				for (int i_101_ = 0; (i_101_ ^ 0xffffffff) > (i_99_ ^ 0xffffffff); i_101_++) {
					Class98_Sub30 class98_sub30 = class98_sub30s[i_101_];
					ls[i_101_] = ((Node) class98_sub30).uid;
					aClass98_Sub30Array5246[i_101_] = class98_sub30;
					class98_sub30.method1313(anInt5237, (byte) 97);
				}
				Class46.method436(aClass98_Sub30Array5246, false, ls);
				if (aClass15_5235 != null)
					aClass15_5235.method229((byte) -23);
			}
			anIntArrayArrayArray5239 = null;
			anIntArrayArrayArray5228 = null;
			aClass377_5247 = null;
			((s_Sub2) this).anIntArrayArrayArray5241 = null;
			aByteArrayArray5253 = null;
			aFloatArrayArray5251 = aFloatArrayArray5248 = aFloatArrayArray5254 = null;
			aClass98_Sub30ArrayArrayArray5236 = null;
			anIntArrayArrayArray5242 = null;
			((s_Sub2) this).anIntArrayArrayArray5226 = ((s_Sub2) this).anIntArrayArrayArray5240 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "si.YA(" + ')');
		}
	}

	final void ka(int i, int i_102_, int i_103_) {
		do {
			try {
				if (i_103_ <= (0xff & aByteArrayArray5253[i][i_102_]))
					break;
				aByteArrayArray5253[i][i_102_] = (byte) i_103_;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("si.ka(" + i + ',' + i_102_ + ',' + i_103_ + ')'));
			}
			break;
		} while (false);
	}

	final r fa(int i, int i_104_, r var_r) {
		try {
			if ((0x1 & aByteArrayArray5234[i][i_104_]) == 0)
				return null;
			int i_105_ = (((s) this).anInt2206 >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
			r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
			r_Sub2 var_r_Sub2_106_;
			do {
				if (var_r_Sub2 == null || !var_r_Sub2.method1652(i_105_, i_105_, 22657)) {
					var_r_Sub2_106_ = new r_Sub2(((s_Sub2) this).aHa_Sub3_5225, i_105_, i_105_);
					if (!client.aBoolean3553)
						break;
				}
				var_r_Sub2_106_ = var_r_Sub2;
				var_r_Sub2_106_.method1654(105);
			} while (false);
			var_r_Sub2_106_.method1651(i_105_, 0, 0, 0, i_105_);
			method3436(true, i, i_104_, var_r_Sub2_106_);
			return var_r_Sub2_106_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.fa(" + i + ',' + i_104_ + ',' + (var_r != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3424(int i, int i_107_, int[] is, int[] is_108_, int[] is_109_, int[] is_110_, int[] is_111_, int[] is_112_, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, int i_118_, int i_119_, int i_120_, boolean bool) {
		try {
			int i_121_ = is_114_.length;
			int[] is_122_ = new int[i_121_ * 3];
			int[] is_123_ = new int[i_121_ * 3];
			int[] is_124_ = new int[3 * i_121_];
			int[] is_125_ = new int[i_121_ * 3];
			int[] is_126_ = new int[3 * i_121_];
			int[] is_127_ = new int[i_121_ * 3];
			int[] is_128_ = is_108_ != null ? new int[3 * i_121_] : null;
			int[] is_129_ = is_110_ == null ? null : new int[3 * i_121_];
			int i_130_ = 0;
			for (int i_131_ = 0; i_131_ < i_121_; i_131_++) {
				int i_132_ = is_111_[i_131_];
				int i_133_ = is_112_[i_131_];
				int i_134_ = is_113_[i_131_];
				is_122_[i_130_] = is[i_132_];
				is_123_[i_130_] = is_109_[i_132_];
				is_124_[i_130_] = is_114_[i_131_];
				is_126_[i_130_] = is_116_[i_131_];
				is_127_[i_130_] = is_117_[i_131_];
				is_125_[i_130_] = is_115_ == null ? is_114_[i_131_] : is_115_[i_131_];
				if (is_108_ != null)
					is_128_[i_130_] = is_108_[i_132_];
				if (is_110_ != null)
					is_129_[i_130_] = is_110_[i_132_];
				i_130_++;
				is_122_[i_130_] = is[i_133_];
				is_123_[i_130_] = is_109_[i_133_];
				is_124_[i_130_] = is_114_[i_131_];
				is_126_[i_130_] = is_116_[i_131_];
				is_127_[i_130_] = is_117_[i_131_];
				is_125_[i_130_] = is_115_ != null ? is_115_[i_131_] : is_114_[i_131_];
				if (is_108_ != null)
					is_128_[i_130_] = is_108_[i_133_];
				if (is_110_ != null)
					is_129_[i_130_] = is_110_[i_133_];
				i_130_++;
				is_122_[i_130_] = is[i_134_];
				is_123_[i_130_] = is_109_[i_134_];
				is_124_[i_130_] = is_114_[i_131_];
				is_126_[i_130_] = is_116_[i_131_];
				is_127_[i_130_] = is_117_[i_131_];
				is_125_[i_130_] = is_115_ == null ? is_114_[i_131_] : is_115_[i_131_];
				if (is_108_ != null)
					is_128_[i_130_] = is_108_[i_134_];
				if (is_110_ != null)
					is_129_[i_130_] = is_110_[i_134_];
				i_130_++;
			}
			U(i, i_107_, is_122_, is_128_, is_123_, is_129_, is_124_, is_125_, is_126_, is_127_, i_118_, i_119_, i_120_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.H(" + i + ',' + i_107_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_108_ != null ? "{...}" : "null") + ',' + (is_109_ != null ? "{...}" : "null") + ',' + (is_110_ != null ? "{...}" : "null") + ',' + (is_111_ != null ? "{...}" : "null") + ',' + (is_112_ != null ? "{...}" : "null") + ',' + (is_113_ != null ? "{...}" : "null") + ',' + (is_114_ != null ? "{...}" : "null") + ',' + (is_115_ != null ? "{...}" : "null") + ',' + (is_116_ != null ? "{...}" : "null") + ',' + (is_117_ != null ? "{...}" : "null") + ',' + i_118_ + ',' + i_119_ + ',' + i_120_ + ',' + bool + ')'));
		}
	}

	final void CA(r var_r, int i, int i_135_, int i_136_, int i_137_, boolean bool) {
		try {
			if (aClass15_5235 != null && var_r != null) {
				int i_138_ = (i - (i_135_ * (((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4564) >> -1331666552) >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
				int i_139_ = ((i_136_ - (i_135_ * (((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4552) >> -1140973816)) >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
				aClass15_5235.method231(var_r, i_138_, (byte) 60, i_139_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.CA(" + (var_r != null ? "{...}" : "null") + ',' + i + ',' + i_135_ + ',' + i_136_ + ',' + i_137_ + ',' + bool + ')'));
		}
	}

	final void method3422(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, boolean[][] bools) {
		do {
			try {
				if (anInt5250 > 0) {
					Interface2_Impl2 interface2_impl2 = ((s_Sub2) this).aHa_Sub3_5225.method1963(71, anInt5227);
					int i_146_ = 0;
					int i_147_ = 32767;
					int i_148_ = -32768;
					for (int i_149_ = 0; i_149_ < 4; i_149_++) {
						i_146_ = 0;
						Buffer buffer = interface2_impl2.method78(true, -123);
						if (buffer != null) {
							Stream stream = ((s_Sub2) this).aHa_Sub3_5225.method2043(24022, buffer);
							if (Stream.a()) {
								for (int i_150_ = i_143_; i_150_ < i_145_; i_150_++) {
									int i_151_ = (i_142_ + ((s) this).anInt2203 * i_150_);
									for (int i_152_ = i_142_; ((i_144_ ^ 0xffffffff) < (i_152_ ^ 0xffffffff)); i_152_++) {
										if (bools[i_152_ - i_142_][-i_143_ + i_150_]) {
											short[] is = (((s_Sub2) this).aShortArrayArray5230[i_151_]);
											if (is != null) {
												for (int i_153_ = 0; i_153_ < is.length; i_153_++) {
													int i_154_ = 0xffff & is[i_153_];
													i_146_++;
													if ((i_148_ ^ 0xffffffff) > (i_154_ ^ 0xffffffff))
														i_148_ = i_154_;
													stream.c(i_154_);
													if ((i_154_ ^ 0xffffffff) > (i_147_ ^ 0xffffffff))
														i_147_ = i_154_;
												}
											}
										}
										i_151_++;
									}
								}
							} else {
								for (int i_155_ = i_143_; i_155_ < i_145_; i_155_++) {
									int i_156_ = (i_155_ * ((s) this).anInt2203 + i_142_);
									for (int i_157_ = i_142_; i_144_ > i_157_; i_157_++) {
										if (bools[i_157_ + -i_142_][-i_143_ + i_155_]) {
											short[] is = (((s_Sub2) this).aShortArrayArray5230[i_156_]);
											if (is != null) {
												for (int i_158_ = 0; ((is.length ^ 0xffffffff) < (i_158_ ^ 0xffffffff)); i_158_++) {
													int i_159_ = is[i_158_] & 0xffff;
													if ((i_148_ ^ 0xffffffff) > (i_159_ ^ 0xffffffff))
														i_148_ = i_159_;
													if ((i_147_ ^ 0xffffffff) < (i_159_ ^ 0xffffffff))
														i_147_ = i_159_;
													stream.d(i_159_);
													i_146_++;
												}
											}
										}
										i_156_++;
									}
								}
							}
							stream.c();
							if (interface2_impl2.method79((byte) 109))
								break;
						}
					}
					if ((i_146_ ^ 0xffffffff) >= -1)
						break;
					((s_Sub2) this).aHa_Sub3_5225.method1992((byte) 125);
					((s_Sub2) this).aHa_Sub3_5225.method2028(false, (byte) -101);
					((s_Sub2) this).aHa_Sub3_5225.method1979(false, -85);
					((s_Sub2) this).aHa_Sub3_5225.method2013(false, 2103);
					((s_Sub2) this).aHa_Sub3_5225.method1997(0, false);
					((s_Sub2) this).aHa_Sub3_5225.method2001(0, 74);
					((s_Sub2) this).aHa_Sub3_5225.method2039(false, 0, -2, false);
					((s_Sub2) this).aHa_Sub3_5225.method2005(null, 24);
					Class111_Sub3 class111_sub3 = ((s_Sub2) this).aHa_Sub3_5225.method1978((byte) -6);
					float[] fs = ((s_Sub2) this).aHa_Sub3_5225.method2034(-113);
					fs[0] = ((float) i_141_ / ((float) ((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).anInt4527 * (128.0F * (float) ((s) this).anInt2206)));
					fs[5] = ((float) i_141_ / ((float) ((s) this).anInt2206 * 128.0F * (float) (((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4531)));
					fs[9] = 0.0F;
					fs[6] = 0.0F;
					fs[10] = 1.0F / (aFloat5243 - aFloat5238);
					fs[14] = -aFloat5238 / (aFloat5243 - aFloat5238);
					fs[13] = 1.0F - (((float) (i_141_ * i_145_) / 128.0F + (float) (i_140_ * 2)) / (float) (((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4531));
					fs[7] = 0.0F;
					fs[2] = 0.0F;
					fs[8] = 0.0F;
					fs[11] = 0.0F;
					fs[1] = 0.0F;
					fs[15] = 1.0F;
					fs[4] = 0.0F;
					fs[3] = 0.0F;
					fs[12] = -1.0F - (((float) (i_142_ * i_141_) / 128.0F - (float) (2 * i)) / (float) (((ha_Sub3) (((s_Sub2) this).aHa_Sub3_5225)).anInt4527));
					class111_sub3.method2123(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, (byte) -110);
					((s_Sub2) this).aHa_Sub3_5225.method1940((byte) -99);
					((s_Sub2) this).aHa_Sub3_5225.method1935(1);
					if ((0x7 & ((s_Sub2) this).anInt5233 ^ 0xffffffff) == -1)
						((s_Sub2) this).aHa_Sub3_5225.method1979(false, -91);
					else {
						((s_Sub2) this).aHa_Sub3_5225.method1979(true, -116);
						((s_Sub2) this).aHa_Sub3_5225.method2065((byte) 80);
					}
					((s_Sub2) this).aHa_Sub3_5225.method2059(false, false);
					((s_Sub2) this).aHa_Sub3_5225.method1971(0, true, anInterface2_Impl1_5249);
					((s_Sub2) this).aHa_Sub3_5225.method1971(1, true, anInterface2_Impl1_5245);
					((s_Sub2) this).aHa_Sub3_5225.method2042((((s_Sub2) this).aClass256_5252), (byte) -101);
					((s_Sub2) this).aHa_Sub3_5225.method1973(Class336.aClass232_2822, -i_147_ + (i_148_ + 1), 0, 26810, interface2_impl2, i_147_, i_146_ / 3);
					((s_Sub2) this).aHa_Sub3_5225.method2059(true, false);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("si.F(" + i + ',' + i_140_ + ',' + i_141_ + ',' + i_142_ + ',' + i_143_ + ',' + i_144_ + ',' + i_145_ + ',' + (bools != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void wa(r var_r, int i, int i_160_, int i_161_, int i_162_, boolean bool) {
		try {
			if (aClass15_5235 != null && var_r != null) {
				int i_163_ = (-((((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4564 * i_160_) >> 164954408) + i >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
				int i_164_ = (i_161_ - ((((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4552) * i_160_ >> 275343208) >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
				aClass15_5235.method232(var_r, (byte) -102, i_163_, i_164_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.wa(" + (var_r != null ? "{...}" : "null") + ',' + i + ',' + i_160_ + ',' + i_161_ + ',' + i_162_ + ',' + bool + ')'));
		}
	}

	final boolean method3418(r var_r, int i, int i_165_, int i_166_, int i_167_, boolean bool) {
		try {
			if (aClass15_5235 == null || var_r == null)
				return false;
			int i_168_ = (-((((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4564 * i_165_) >> 1080435208) + i >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
			int i_169_ = (i_166_ + -((((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4552) * i_165_ >> 182333608) >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
			return aClass15_5235.method234(i_169_, var_r, 8, i_168_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.O(" + (var_r != null ? "{...}" : "null") + ',' + i + ',' + i_165_ + ',' + i_166_ + ',' + i_167_ + ',' + bool + ')'));
		}
	}

	private final void method3436(boolean bool, int i, int i_170_, r_Sub2 var_r_Sub2) {
		try {
			int[] is = ((s_Sub2) this).anIntArrayArrayArray5226[i][i_170_];
			if (bool != true)
				method3421(null, null);
			int[] is_171_ = ((s_Sub2) this).anIntArrayArrayArray5240[i][i_170_];
			int i_172_ = is.length;
			if (i_172_ > Class374.anIntArray3156.length) {
				Class224_Sub1.anIntArray5033 = new int[i_172_];
				Class374.anIntArray3156 = new int[i_172_];
			}
			for (int i_173_ = 0; i_173_ < i_172_; i_173_++) {
				Class374.anIntArray3156[i_173_] = (is[i_173_] >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
				Class224_Sub1.anIntArray5033[i_173_] = (is_171_[i_173_] >> ((ha_Sub3) ((s_Sub2) this).aHa_Sub3_5225).anInt4573);
			}
			int i_174_ = 0;
			while (i_174_ < i_172_) {
				int i_175_ = Class374.anIntArray3156[i_174_];
				int i_176_ = Class224_Sub1.anIntArray5033[i_174_++];
				int i_177_ = Class374.anIntArray3156[i_174_];
				int i_178_ = Class224_Sub1.anIntArray5033[i_174_++];
				int i_179_ = Class374.anIntArray3156[i_174_];
				int i_180_ = Class224_Sub1.anIntArray5033[i_174_++];
				if ((-((-i_176_ + i_178_) * (-i_177_ + i_179_)) + (-i_180_ + i_178_) * (i_175_ - i_177_)) > 0)
					var_r_Sub2.method1653(i_176_, i_175_, i_177_, i_179_, i_180_, (byte) -69, i_178_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.B(" + bool + ',' + i + ',' + i_170_ + ',' + (var_r_Sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3421(Class98_Sub5 class98_sub5, int[] is) {
		try {
			aClass148_5231.add_last(new Class98_Sub25((((s_Sub2) this).aHa_Sub3_5225), this, class98_sub5, is), -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.K(" + (class98_sub5 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	s_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_181_, int i_182_, int i_183_, int[][] is, int[][] is_184_, int i_185_) {
		super(i_182_, i_183_, i_185_, is);
		aClass148_5231 = new LinkedList();
		do {
			try {
				((s_Sub2) this).aHa_Sub3_5225 = var_ha_Sub3;
				anInt5229 = -2 + ((s) this).anInt2200;
				aByteArrayArray5234 = new byte[i_182_][i_183_];
				anIntArrayArrayArray5242 = new int[i_182_][i_183_][];
				anInt5232 = 1 << anInt5229;
				((s_Sub2) this).anInt5233 = i_181_;
				((s_Sub2) this).anIntArrayArrayArray5240 = new int[i_182_][i_183_][];
				aClass98_Sub30ArrayArrayArray5236 = new Class98_Sub30[i_182_][i_183_][];
				((s_Sub2) this).aShortArrayArray5230 = new short[i_182_ * i_183_][];
				aFloatArrayArray5248 = (new float[((s) this).anInt2203 - -1][((s) this).anInt2204 + 1]);
				aFloatArrayArray5251 = (new float[((s) this).anInt2203 + 1][1 + ((s) this).anInt2204]);
				anIntArrayArrayArray5228 = new int[i_182_][i_183_][];
				((s_Sub2) this).anIntArrayArrayArray5226 = new int[i_182_][i_183_][];
				aByteArrayArray5253 = new byte[1 + i_182_][i_183_ - -1];
				((s_Sub2) this).anIntArrayArrayArray5241 = new int[i_182_][i_183_][];
				aFloatArrayArray5254 = (new float[((s) this).anInt2203 - -1][((s) this).anInt2204 - -1]);
				for (int i_186_ = 0; ((i_186_ ^ 0xffffffff) >= (((s) this).anInt2204 ^ 0xffffffff)); i_186_++) {
					for (int i_187_ = 0; ((i_187_ ^ 0xffffffff) >= (((s) this).anInt2203 ^ 0xffffffff)); i_187_++) {
						int i_188_ = ((s) this).anIntArrayArray2201[i_187_][i_186_];
						if (aFloat5243 < (float) i_188_)
							aFloat5243 = (float) i_188_;
						if ((float) i_188_ < aFloat5238)
							aFloat5238 = (float) i_188_;
						if (i_187_ > 0 && (i_186_ ^ 0xffffffff) < -1 && i_187_ < ((s) this).anInt2203 && i_186_ < ((s) this).anInt2204) {
							int i_189_ = (is_184_[1 + i_187_][i_186_] - is_184_[i_187_ - 1][i_186_]);
							int i_190_ = (-is_184_[i_187_][-1 + i_186_] + is_184_[i_187_][i_186_ - -1]);
							float f = (float) (1.0 / (Math.sqrt((double) (i_189_ * i_189_ + (i_185_ * 4 * i_185_ + (i_190_ * i_190_))))));
							aFloatArrayArray5251[i_187_][i_186_] = (float) i_189_ * f;
							aFloatArrayArray5248[i_187_][i_186_] = f * (float) (2 * -i_185_);
							aFloatArrayArray5254[i_187_][i_186_] = f * (float) i_190_;
						}
					}
				}
				aFloat5238--;
				aFloat5243++;
				aClass377_5247 = new Class377(128);
				if ((0x10 & ((s_Sub2) this).anInt5233) == 0)
					break;
				aClass15_5235 = new Class15(((s_Sub2) this).aHa_Sub3_5225, this);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("si.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_181_ + ',' + i_182_ + ',' + i_183_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_184_ != null ? "{...}" : "null") + ',' + i_185_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3426(int i, int i_191_, int i_192_, boolean[][] bools, boolean bool, int i_193_) {
		try {
			method3435(i_193_, i, i_191_, bool, bools, i_192_, -1, (byte) -127);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.C(" + i + ',' + i_191_ + ',' + i_192_ + ',' + (bools != null ? "{...}" : "null") + ',' + bool + ',' + i_193_ + ')'));
		}
	}

	final void method3425(int i, int i_194_) {
		/* empty */
	}

	final void U(int i, int i_195_, int[] is, int[] is_196_, int[] is_197_, int[] is_198_, int[] is_199_, int[] is_200_, int[] is_201_, int[] is_202_, int i_203_, int i_204_, int i_205_, boolean bool) {
		try {
			d var_d = ((ha) ((s_Sub2) this).aHa_Sub3_5225).aD938;
			if (is_198_ != null && anIntArrayArrayArray5239 == null)
				anIntArrayArrayArray5239 = new int[((s) this).anInt2203][((s) this).anInt2204][];
			if (is_196_ != null && anIntArrayArrayArray5228 == null)
				anIntArrayArrayArray5228 = new int[((s) this).anInt2203][((s) this).anInt2204][];
			((s_Sub2) this).anIntArrayArrayArray5226[i][i_195_] = is;
			((s_Sub2) this).anIntArrayArrayArray5240[i][i_195_] = is_197_;
			((s_Sub2) this).anIntArrayArrayArray5241[i][i_195_] = is_199_;
			anIntArrayArrayArray5242[i][i_195_] = is_200_;
			if (anIntArrayArrayArray5239 != null)
				anIntArrayArrayArray5239[i][i_195_] = is_198_;
			if (anIntArrayArrayArray5228 != null)
				anIntArrayArrayArray5228[i][i_195_] = is_196_;
			Class98_Sub30[] class98_sub30s = (aClass98_Sub30ArrayArrayArray5236[i][i_195_] = new Class98_Sub30[is_199_.length]);
			for (int i_206_ = 0; i_206_ < is_199_.length; i_206_++) {
				int i_207_ = is_201_[i_206_];
				int i_208_ = is_202_[i_206_];
				if ((((s_Sub2) this).anInt5233 & 0x20 ^ 0xffffffff) != -1 && (i_207_ ^ 0xffffffff) != 0 && (((Class238) var_d.method11(i_207_, -28755)).aBoolean1825)) {
					i_208_ = 128;
					i_207_ = -1;
				}
				long l = ((long) i_203_ << 940517980 | ((long) i_205_ << -648515088 | (long) i_204_ << -670963670) | (long) (i_208_ << 1221309550) | (long) i_207_);
				Node class98;
				for (class98 = aClass377_5247.method3990(l, -1); class98 != null; class98 = aClass377_5247.method3993(-95)) {
					Class98_Sub30 class98_sub30 = (Class98_Sub30) class98;
					if ((((Class98_Sub30) class98_sub30).anInt4084 ^ 0xffffffff) == (i_207_ ^ 0xffffffff) && ((float) i_208_ == ((Class98_Sub30) class98_sub30).aFloat4092) && ((i_203_ ^ 0xffffffff) == (((Class98_Sub30) class98_sub30).anInt4091 ^ 0xffffffff)) && ((Class98_Sub30) class98_sub30).anInt4090 == i_204_ && i_205_ == ((Class98_Sub30) class98_sub30).anInt4086)
						break;
				}
				if (class98 == null) {
					class98_sub30s[i_206_] = new Class98_Sub30(this, i_207_, i_208_, i_203_, i_204_, i_205_);
					aClass377_5247.method3996(class98_sub30s[i_206_], l, -1);
				} else
					class98_sub30s[i_206_] = (Class98_Sub30) class98;
			}
			if (bool)
				aByteArrayArray5234[i][i_195_] = (byte) Class41.method366(aByteArrayArray5234[i][i_195_], 1);
			if (is_199_.length > anInt5244)
				anInt5244 = is_199_.length;
			anInt5250 += is_199_.length;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.U(" + i + ',' + i_195_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_196_ != null ? "{...}" : "null") + ',' + (is_197_ != null ? "{...}" : "null") + ',' + (is_198_ != null ? "{...}" : "null") + ',' + (is_199_ != null ? "{...}" : "null") + ',' + (is_200_ != null ? "{...}" : "null") + ',' + (is_201_ != null ? "{...}" : "null") + ',' + (is_202_ != null ? "{...}" : "null") + ',' + i_203_ + ',' + i_204_ + ',' + i_205_ + ',' + bool + ')'));
		}
	}

	final void method3416(int i, int i_209_, int i_210_, boolean[][] bools, boolean bool, int i_211_, int i_212_) {
		try {
			method3435(i_212_, i, i_209_, bool, bools, i_210_, i_211_, (byte) -98);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("si.N(" + i + ',' + i_209_ + ',' + i_210_ + ',' + (bools != null ? "{...}" : "null") + ',' + bool + ',' + i_211_ + ',' + i_212_ + ')'));
		}
	}
}
