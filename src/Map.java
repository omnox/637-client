/* Class305_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataInputStream;
import java.net.URL;

final class Map extends MapRegion {
	
	int anInt5302 = 99;
	static int anInt5303 = 0;
	/* synthetic */static Class aClass5304;

	Map(int i, int i_0_, int i_1_, boolean bool) {
		super(i, i_0_, i_1_, bool, Class199.aClass32_1531, Class82.aClass153_630);
	}

	final void method3582(int i, int i_2_, int i_3_, ha var_ha, RSByteBuffer class98_sub22, int[] is) {
		do {
			try {
				if (!this.aBoolean2544) {
					boolean bool = false;
					if (i != 17685)
						this.anInt5302 = 114;
					Class28 class28 = null;
					if (is != null)
						is[0] = -1;
					while ((class98_sub22.data).length > class98_sub22.position) {
						int i_4_ = class98_sub22.readUnsignedByte();
						if (i_4_ != 0) {
							if (i_4_ != 1) {
								if (i_4_ == 2) {
									if (class28 == null)
										class28 = new Class28();
									class28.method297(-50, class98_sub22);
								} else if (i_4_ != 128) {
									if (i_4_ == 129) {
										if ((this.cameraAdjusts) == null)
											this.cameraAdjusts = new byte[4][][];
										bool = true;
										for (int i_5_ = 0; i_5_ < 4; i_5_++) {
											byte i_6_ = class98_sub22.readSignedByte();
											if (i_6_ != 0 || (this.cameraAdjusts[i_5_]) == null) {
												if (i_6_ == 1) {
													if ((this.cameraAdjusts[i_5_]) == null)
														this.cameraAdjusts[i_5_] = (new byte[((this.anInt2543) - -1)][(1 + (this.anInt2542))]);
													for (int i_7_ = 0; (i_7_ < 64); i_7_ += 4) {
														for (int i_8_ = 0; (i_8_ < 64); i_8_ += 4) {
															byte i_9_ = (class98_sub22.readSignedByte());
															for (int i_10_ = (i_7_ + i_3_); ((i_7_ - (-i_3_ + -4)) > i_10_); i_10_++) {
																for (int i_11_ = (i_8_ - -i_2_); (i_11_ < (i_2_ + i_8_ + 4)); i_11_++) {
																	if ((i_10_ >= 0) && (this.anInt2543 > i_10_) && (i_11_ >= 0) && (this.anInt2542 > i_11_))
																		this.cameraAdjusts[i_5_][i_10_][i_11_] = i_9_;
																}
															}
														}
													}
												} else if (i_6_ == 2) {
													if ((this.cameraAdjusts[i_5_]) == null)
														this.cameraAdjusts[i_5_] = (new byte[(1 + (this.anInt2543))][(1 + (this.anInt2542))]);
													if (i_5_ > 0) {
														int i_12_ = i_3_;
														int i_13_ = i_3_ - -64;
														int i_14_ = i_2_;
														if (i_14_ < 0)
															i_14_ = 0;
														else if ((this.anInt2542) <= i_14_)
															i_14_ = (this.anInt2542);
														if (i_13_ >= 0) {
															if (i_13_ >= (this.anInt2543))
																i_13_ = (this.anInt2543);
														} else
															i_13_ = 0;
														int i_15_ = i_2_ - -64;
														if (i_12_ < 0)
															i_12_ = 0;
														else if ((this.anInt2543) <= i_12_)
															i_12_ = (this.anInt2543);
														if (i_15_ >= 0) {
															if ((this.anInt2542) <= i_15_)
																i_15_ = (this.anInt2542);
														} else
															i_15_ = 0;
														for (/**/; (i_13_ > i_12_); i_12_++) {
															for (/**/; (i_14_ < i_15_); i_14_++)
																this.cameraAdjusts[i_5_][i_12_][i_14_] = (this.cameraAdjusts[(i_5_ + -1)][i_12_][i_14_]);
														}
													}
												}
											} else {
												int i_16_ = i_3_;
												int i_17_ = 64 + i_3_;
												int i_18_ = i_2_;
												if (i_16_ >= 0) {
													if (i_16_ >= (this.anInt2543))
														i_16_ = this.anInt2543;
												} else
													i_16_ = 0;
												if (i_18_ >= 0) {
													if (i_18_ >= (this.anInt2542))
														i_18_ = this.anInt2542;
												} else
													i_18_ = 0;
												int i_19_ = 64 + i_2_;
												if (i_17_ >= 0) {
													if (i_17_ >= (this.anInt2543))
														i_17_ = this.anInt2543;
												} else
													i_17_ = 0;
												if (i_19_ >= 0) {
													if (i_19_ >= (this.anInt2542))
														i_19_ = this.anInt2542;
												} else
													i_19_ = 0;
												for (/**/; i_17_ > i_16_; i_16_++) {
													for (/**/; (i_18_ < i_19_); i_18_++)
														this.cameraAdjusts[i_5_][i_16_][i_18_] = (byte) 0;
												}
											}
										}
									} else
										throw new IllegalStateException("");
								} else if (is != null) {
									is[0] = class98_sub22.readShort();
									is[1] = class98_sub22.readUShort(false);
									is[2] = class98_sub22.readUShort(false);
									is[3] = class98_sub22.readUShort(false);
									is[4] = class98_sub22.readShort();
								} else
									class98_sub22.position += 10;
							} else {
								int i_20_ = class98_sub22.readUnsignedByte();
								if (i_20_ > 0) {
									for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
										Class1 class1 = new Class1(var_ha, class98_sub22, 2);
										if (class1.anInt62 == 31) {
											Class379 class379 = (Class21_Sub1.aClass269_5383.method3268(i ^ ~0x4531, (class98_sub22.readShort())));
											class1.method166((class379.anInt3197), (class379.anInt3194), (class379.anInt3193), (byte) -103, (class379.anInt3195));
										}
										if (var_ha.method1822() > 0) {
											Class98_Sub5 class98_sub5 = (class1.aClass98_Sub5_55);
											int i_22_ = ((i_3_ << 9) + class98_sub5.method954(7019));
											int i_23_ = (class98_sub5.method962(28699) - -(i_2_ << 9));
											int i_24_ = i_22_ >> 9;
											int i_25_ = i_23_ >> 9;
											if (i_24_ >= 0 && i_25_ >= 0 && ((this.anInt2543) > i_24_) && ((this.anInt2542) > i_25_)) {
												class98_sub5.method955(i_23_, (byte) -123, i_22_, ((this.anIntArrayArrayArray2549[(class1.anInt57)][i_24_][i_25_]) + -(class98_sub5.method963((byte) 96))));
												Class64_Sub17.method619(class1);
											}
										}
									}
								}
							}
						} else
							class28 = new Class28(class98_sub22);
					}
					if (class28 != null) {
						for (int i_26_ = 0; i_26_ < 8; i_26_++) {
							for (int i_27_ = 0; i_27_ < 8; i_27_++) {
								int i_28_ = (i_3_ >> 3) - -i_26_;
								int i_29_ = (i_2_ >> 3) - -i_27_;
								if (i_28_ >= 0 && (this.anInt2543 >> 3) > i_28_ && i_29_ >= 0 && i_29_ < (this.anInt2542 >> 3))
									Class246_Sub3_Sub3.method3015(i_29_, i_28_, (byte) 71, class28);
							}
						}
					}
					if (bool || this.cameraAdjusts == null)
						break;
					for (int i_30_ = 0; i_30_ < 4; i_30_++) {
						if (this.cameraAdjusts[i_30_] != null) {
							for (int i_31_ = 0; i_31_ < 16; i_31_++) {
								for (int i_32_ = 0; i_32_ < 16; i_32_++) {
									int i_33_ = (i_3_ >> 2) + i_31_;
									int i_34_ = (i_2_ >> 2) - -i_32_;
									if (i_33_ >= 0 && i_33_ < 26 && i_34_ >= 0 && i_34_ < 26)
										this.cameraAdjusts[i_30_][i_33_][i_34_] = (byte) 0;
								}
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ms.R(" + i + ',' + i_2_ + ',' + i_3_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Interface19 method3583(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		try {
			Interface19 interface19 = null;
			if ((~i_35_) == i_37_)
				interface19 = (Interface19) Class21_Sub1.method268(i_36_, i_38_, i);
			if (i_35_ == 1)
				interface19 = (Interface19) Class101.method1701(i_36_, i_38_, i);
			if (i_35_ == 2)
				interface19 = ((Interface19) Class97.method931(i_36_, i_38_, i, (aClass5304 != null ? aClass5304 : (aClass5304 = method3592("Interface19")))));
			if (i_35_ == 3)
				interface19 = (Interface19) Class253.method3177(i_36_, i_38_, i);
			return interface19;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ms.S(" + i + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ')'));
		}
	}

	final void method3584(Collision[] class243s, int i, int i_39_, byte[] is, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, ha var_ha, int i_45_) {//important
		try {
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			int i_46_ = -5 % ((i_45_ - -7) / 41);
			int i_47_ = -1;
			for (;;) {
				int i_48_ = class98_sub22.method1208(3893);
				if (i_48_ == 0)
					break;
				i_47_ += i_48_;
				int i_49_ = 0;
				for (;;) {
					int i_50_ = class98_sub22.readSmart(1689622712);
					if (i_50_ == 0)
						break;
					i_49_ += i_50_ - 1;
					int i_51_ = i_49_ & 0x3f;
					int i_52_ = (i_49_ & 0xfe7) >> 6;
					int i_53_ = i_49_ >> 12;
					int i_54_ = class98_sub22.readUnsignedByte();
					int i_55_ = i_54_ >> 2;
					int i_56_ = i_54_ & 0x3;
					if (i_39_ == i_53_ && i_52_ >= i_42_ && i_42_ - -8 > i_52_ && i_43_ <= i_51_ && i_51_ < i_43_ + 8) {
						Class352 class352 = Class130.aClass302_1028.method3546(i_47_, (byte) 119);
						int i_57_ = (Class292.method3451(i_52_ & 0x7, i_56_, false, i_51_ & 0x7, i_44_, (class352.sizeY), (class352.sizeX)) + i_41_);
						int i_58_ = Class35.method338((class352.sizeX), i_44_, i_56_, 0x7 & i_52_, 0x7 & i_51_, (class352.sizeY), (byte) -23) + i_40_;
						if (i_57_ > 0 && i_58_ > 0 && (i_57_ < -1 + this.anInt2543) && i_58_ < this.anInt2542 - 1) {
							Collision class243 = null;
							if (!this.aBoolean2544) {
								int i_59_ = i;
								if (((Class281.tileSettings[1][i_57_][i_58_]) & 0x2) == 2)
									i_59_--;
								if (i_59_ >= 0)
									class243 = class243s[i_59_];
							}
							method3588(i_47_, i_58_, -1, i, false, i_57_, var_ha, 0x3 & i_44_ + i_56_, i_55_, i, class243);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ms.P(" + (class243s != null ? "{...}" : "null") + ',' + i + ',' + i_39_ + ',' + (is != null ? "{...}" : "null") + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_45_ + ')'));
		}
	}

	static final void method3585(Throwable throwable, int i, String string) {
		do {
			try {
				try {
					String string_60_ = "";
					if (throwable != null)
						string_60_ = Class13.method222(throwable, (byte) -24);
					if (i > -120)
						anInt5303 = 20;
					if (string != null) {
						if (throwable != null)
							string_60_ += " | ";
						string_60_ += string;
					}
					Class199.method2686(string_60_, (byte) -80);
					string_60_ = Class76_Sub9.method765("%3a", 4185, ":", string_60_);
					string_60_ = Class76_Sub9.method765("%40", 4185, "@", string_60_);
					string_60_ = Class76_Sub9.method765("%26", 4185, "&", string_60_);
					string_60_ = Class76_Sub9.method765("%23", 4185, "#", string_60_);
					if (Class131.anApplet1038 != null) {
						Class143 class143 = (Class98_Sub40.aClass88_4192.method866(-108, new URL(Class131.anApplet1038.getCodeBase(), ("clienterror.ws?c=" + Class164.anInt1273 + "&u=" + (Class256_Sub1.aString5157 == null ? String.valueOf(Class106.aLong904) : Class256_Sub1.aString5157) + "&v1=" + Class88.aString696 + "&v2=" + Class88.aString692 + "&e=" + string_60_))));
						while (class143.anInt1163 == 0)
							Class246_Sub7.method3131(0, 1L);
						if (class143.anInt1163 != 1)
							break;
						DataInputStream datainputstream = (DataInputStream) class143.anObject1162;
						datainputstream.read();
						datainputstream.close();
					}
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
		} while (false);
	}

	final void method3586(int i, int i_61_, int[] is, int i_62_, int i_63_, RSByteBuffer class98_sub22, ha var_ha, int i_64_, boolean bool, int i_65_, int i_66_) {
		do {
			try {
				if (!this.aBoolean2544) {
					if (bool != true)
						this.anInt5302 = -44;
					boolean bool_67_ = false;
					Class28 class28 = null;
					if (is != null)
						is[0] = -1;
					int i_68_ = (0x7 & i) * 8;
					int i_69_ = 8 * (i_61_ & 0x7);
					while (class98_sub22.position < (class98_sub22.data).length) {
						int i_70_ = class98_sub22.readUnsignedByte();
						if (i_70_ == 0)
							class28 = new Class28(class98_sub22);
						else if (i_70_ == 1) {
							int i_71_ = class98_sub22.readUnsignedByte();
							if (i_71_ > 0) {
								for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
									Class1 class1 = new Class1(var_ha, class98_sub22, 2);
									if (class1.anInt62 == 31) {
										Class379 class379 = (Class21_Sub1.aClass269_5383.method3268(-37, class98_sub22.readShort()));
										class1.method166(class379.anInt3197, class379.anInt3194, class379.anInt3193, (byte) -98, class379.anInt3195);
									}
									if (var_ha.method1822() > 0) {
										Class98_Sub5 class98_sub5 = (class1.aClass98_Sub5_55);
										int i_73_ = (class98_sub5.method954(7019) >> 9);
										int i_74_ = (class98_sub5.method962(28699) >> 9);
										if (class1.anInt57 == i_65_ && (i_68_ <= i_73_) && i_73_ < 8 + i_68_ && (i_69_ <= i_74_) && i_69_ + 8 > i_74_) {
											int i_75_ = ((i_62_ << 9) + (Class98_Sub32.method1433(0xfff & (class98_sub5.method962(28699)), i_64_, (class98_sub5.method954(7019) & 0xfff), -7175)));
											i_73_ = i_75_ >> 9;
											int i_76_ = ((i_63_ << 9) - -(Class107.method1724(7, i_64_, 0xfff & (class98_sub5.method962(28699)), 0xfff & (class98_sub5.method954(7019)))));
											i_74_ = i_76_ >> 9;
											if (i_73_ >= 0 && i_74_ >= 0 && (i_73_ < (this.anInt2543)) && (this.anInt2542 > i_74_)) {
												class98_sub5.method955(i_76_, (byte) -122, i_75_, ((this.anIntArrayArrayArray2549[i_65_][i_73_][i_74_]) - (class98_sub5.method963((byte) 72))));
												Class64_Sub17.method619(class1);
											}
										}
									}
								}
							}
						} else if (i_70_ != 2) {
							if (i_70_ == 128) {
								if (is != null) {
									is[0] = class98_sub22.readShort();
									is[1] = class98_sub22.readUShort(!bool);
									is[2] = class98_sub22.readUShort(false);
									is[3] = class98_sub22.readUShort(false);
									is[4] = class98_sub22.readShort();
								} else
									class98_sub22.position += 10;
							} else if (i_70_ == 129) {
								if (this.cameraAdjusts == null)
									this.cameraAdjusts = new byte[4][][];
								for (int i_77_ = 0; i_77_ < 4; i_77_++) {
									byte i_78_ = class98_sub22.readSignedByte();
									if (i_78_ != 0 || ((this.cameraAdjusts[i_66_]) == null)) {
										if (i_78_ == 1) {
											if ((this.cameraAdjusts[i_66_]) == null)
												this.cameraAdjusts[i_66_] = (new byte[1 + (this.anInt2543)][1 + (this.anInt2542)]);
											for (int i_79_ = 0; i_79_ < 64; i_79_ += 4) {
												for (int i_80_ = 0; (i_80_ < 64); i_80_ += 4) {
													byte i_81_ = (class98_sub22.readSignedByte());
													if (i_77_ <= i_65_) {
														for (int i_82_ = i_79_; (i_79_ - -4 > i_82_); i_82_++) {
															for (int i_83_ = i_80_; (i_83_ < i_80_ + 4); i_83_++) {
																if ((i_82_ >= i_68_) && (i_82_ < 8 + i_68_) && (i_69_ <= i_83_) && ((i_69_ + 8) > i_69_)) {
																	int i_84_ = (i_62_ - -Class107.method1720(0x7 & i_82_, 0, 0x7 & i_83_, i_64_));
																	int i_85_ = (Class250.method3166((i_82_ & 0x7), (i_83_ & 0x7), i_64_, (byte) -122)) + i_63_;
																	if ((i_84_ >= 0) && (i_84_ < this.anInt2543) && (i_85_ >= 0) && (i_85_ < this.anInt2542))
																		this.cameraAdjusts[i_66_][i_84_][i_85_] = i_81_;
																}
															}
														}
													}
												}
											}
										}
									} else if (i_77_ <= i_65_) {
										int i_86_ = i_62_;
										int i_87_ = i_62_ + 7;
										int i_88_ = i_63_;
										if (i_88_ < 0)
											i_88_ = 0;
										else if (i_88_ >= (this.anInt2542))
											i_88_ = this.anInt2542;
										int i_89_ = 7 + i_63_;
										if (i_86_ < 0)
											i_86_ = 0;
										else if (i_86_ >= (this.anInt2543))
											i_86_ = this.anInt2543;
										if (i_87_ >= 0) {
											if (i_87_ >= this.anInt2543)
												i_87_ = (this.anInt2543);
										} else
											i_87_ = 0;
										if (i_89_ >= 0) {
											if (i_89_ >= this.anInt2542)
												i_89_ = (this.anInt2542);
										} else
											i_89_ = 0;
										for (/**/; (i_86_ < i_87_); i_86_++) {
											for (/**/; (i_89_ > i_88_); i_88_++)
												this.cameraAdjusts[i_66_][i_86_][i_88_] = (byte) 0;
										}
									}
								}
							} else
								throw new IllegalStateException("");
						} else {
							if (class28 == null)
								class28 = new Class28();
							class28.method297(-50, class98_sub22);
						}
					}
					if (class28 != null)
						Class246_Sub3_Sub3.method3015(i_63_ >> 3, i_62_ >> 3, (byte) 31, class28);
					if (bool_67_ || this.cameraAdjusts == null || (this.cameraAdjusts[i_66_] == null))
						break;
					int i_90_ = 7 + i_62_;
					int i_91_ = i_63_ - -7;
					for (int i_92_ = i_62_; i_90_ > i_92_; i_92_++) {
						for (int i_93_ = i_63_; i_93_ < i_91_; i_93_++)
							this.cameraAdjusts[i_66_][i_92_][i_93_] = (byte) 0;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ms.Q(" + i + ',' + i_61_ + ',' + (is != null ? "{...}" : "null") + ',' + i_62_ + ',' + i_63_ + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_64_ + ',' + bool + ',' + i_65_ + ',' + i_66_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3587(int i, int i_94_, int i_95_) {
		try {
			if (i_94_ < -1) {
				Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_95_, -101, 7);
				class98_sub46_sub17.method1626((byte) -103);
				class98_sub46_sub17.anInt6054 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ms.T(" + i + ',' + i_94_ + ',' + i_95_ + ')'));
		}
	}

	final void method3588(int i, int i_96_, int i_97_, int i_98_, boolean bool, int i_99_, ha var_ha, int i_100_, int i_101_, int i_102_, Collision class243) {// IMPORTANT
		try {
			if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076.method564((byte) 120) != 0 || RenderAnimDefinitions.method3477(i_96_, i_98_, i_99_, Class115.anInt963, 55)) {
				if (i_102_ < this.anInt5302)
					this.anInt5302 = i_102_;
				Class352 class352 = Class130.aClass302_1028.method3546(i, (byte) 119);
				if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub20_4056.method634((byte) 121) != 0 || !class352.aBoolean2982) {
					int i_103_;
					int i_104_;
					if (i_100_ == 1 || i_100_ == 3) {
						i_103_ = class352.sizeX;
						i_104_ = class352.sizeY;
					} else {
						i_103_ = class352.sizeY;
						i_104_ = class352.sizeX;
					}
					int i_105_;
					int i_106_;
					if (this.anInt2543 < i_99_ - -i_103_) {
						i_106_ = i_99_ - -1;
						i_105_ = i_99_;
					} else {
						i_105_ = (i_103_ >> 1) + i_99_;
						i_106_ = i_99_ + (i_103_ - -1 >> 1);
					}
					int i_107_;
					int i_108_;
					if (i_96_ - -i_104_ <= this.anInt2542) {
						i_108_ = (i_104_ >> 1) + i_96_;
						i_107_ = i_96_ - -(i_104_ + 1 >> 1);
					} else {
						i_107_ = 1 + i_96_;
						i_108_ = i_96_;
					}
					s var_s = Class78.activeTileHeightMap[i_98_];
					int i_109_ = ((var_s.method3420(i_108_, -12639, i_105_) + (var_s.method3420(i_108_, -12639, i_106_) + var_s.method3420(i_107_, -12639, i_105_) - -var_s.method3420(i_107_, -12639, i_106_))) >> 2);
					int i_110_ = (i_103_ << 8) + (i_99_ << 9);
					if (bool != false)
						method3591(null, 36, (byte) -79, null, null, 13);
					int i_111_ = (i_96_ << 9) + (i_104_ << 8);
					boolean bool_112_ = (Class98_Sub9.aBoolean3851 && !this.aBoolean2544 && class352.aBoolean3007);
					if (class352.method3858(103))
						Class98_Sub31_Sub4.method1383(null, class352, i_99_, i_100_, 3, i_96_, i_102_, null);
					boolean bool_113_ = (i_97_ == -1 && (class352.anInt2941 == -1) && class352.anIntArray2979 == null && class352.anIntArray2928 == null && !class352.aBoolean3005 && !class352.aBoolean2984);
					if (!Class99.aBoolean838 || ((!Class360.method3909(-4, i_101_) || class352.anInt2956 == 1) && (!Class246_Sub4.method3100(i_101_, (byte) 85) || class352.anInt2956 != 0))) {
						if (i_101_ == 22) {
							if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038.method596((byte) 121) != 0) || class352.anInt2998 != 0 || class352.actionCount == 1 || class352.aBoolean2969) {
								Class246_Sub3_Sub1 class246_sub3_sub1;
								if (bool_113_) {
									Class246_Sub3_Sub1_Sub1 class246_sub3_sub1_sub1 = (new Class246_Sub3_Sub1_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_100_, bool_112_));
									class246_sub3_sub1 = class246_sub3_sub1_sub1;
									if (class246_sub3_sub1_sub1.method65(!bool))
										class246_sub3_sub1_sub1.method62(var_ha, 24447);
								} else
									class246_sub3_sub1 = (new Class246_Sub3_Sub1_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_100_, i_97_));
								Class322.method3671(i_102_, i_99_, i_96_, class246_sub3_sub1);
								if (class352.actionCount == 1 && class243 != null)
									class243.method2946(i_99_, (byte) -14, i_96_);
							}
						} else if (i_101_ == 10 || i_101_ == 11) {
							Class246_Sub3_Sub4_Sub1 class246_sub3_sub4_sub1 = null;
							Class246_Sub3_Sub4 class246_sub3_sub4;
							int i_114_;
							if (bool_113_) {
								Class246_Sub3_Sub4_Sub1 class246_sub3_sub4_sub1_115_ = (new Class246_Sub3_Sub4_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_99_, -1 + (i_103_ + i_99_), i_96_, -1 + i_104_ + i_96_, i_101_, i_100_, bool_112_));
								i_114_ = class246_sub3_sub4_sub1_115_.method3027(94);
								class246_sub3_sub4 = class246_sub3_sub4_sub1_115_;
								class246_sub3_sub4_sub1 = class246_sub3_sub4_sub1_115_;
							} else {
								class246_sub3_sub4 = (new Class246_Sub3_Sub4_Sub5(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_99_, -1 + i_99_ - -i_103_, i_96_, -1 + i_104_ + i_96_, i_101_, i_100_, i_97_));
								i_114_ = 15;
							}
							if (Class222.method2826(class246_sub3_sub4, false)) {
								if (class246_sub3_sub4_sub1 != null && class246_sub3_sub4_sub1.method65(true))
									class246_sub3_sub4_sub1.method62(var_ha, 24447);
								if (class352.aBoolean2947 && Class98_Sub9.aBoolean3851) {
									if (i_114_ > 30)
										i_114_ = 30;
									for (int i_116_ = 0; (i_103_ >= i_116_); i_116_++) {
										for (int i_117_ = 0; i_117_ <= i_104_; i_117_++)
											var_s.ka(i_99_ + i_116_, i_96_ + i_117_, i_114_);
									}
								}
							}
							if (class352.actionCount != 0 && class243 != null)
								class243.method2949(0, !(class352.clippingFlag), i_99_, i_104_, i_103_, (class352.walkable), i_96_);
						} else if (i_101_ >= 12 && i_101_ <= 17 || (i_101_ >= 18 && i_101_ <= 21)) {
							Class246_Sub3_Sub4 class246_sub3_sub4;
							if (!bool_113_)
								class246_sub3_sub4 = (new Class246_Sub3_Sub4_Sub5(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_99_, i_103_ + (i_99_ + -1), i_96_, i_104_ + (i_96_ + -1), i_101_, i_100_, i_97_));
							else {
								Class246_Sub3_Sub4_Sub1 class246_sub3_sub4_sub1 = (new Class246_Sub3_Sub4_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_99_, -1 + i_99_ + i_103_, i_96_, i_96_ - (-i_104_ - -1), i_101_, i_100_, bool_112_));
								if (class246_sub3_sub4_sub1.method65(!bool))
									class246_sub3_sub4_sub1.method62(var_ha, 24447);
								class246_sub3_sub4 = class246_sub3_sub4_sub1;
							}
							Class222.method2826(class246_sub3_sub4, false);
							if (Class98_Sub9.aBoolean3851 && !this.aBoolean2544 && i_101_ >= 12 && i_101_ <= 17 && i_101_ != 13 && i_102_ > 0 && class352.anInt2956 != 0)
								this.aByteArrayArrayArray2550[i_102_][i_99_][i_96_] = (byte) (Class41.method366((this.aByteArrayArrayArray2550[i_102_][i_99_][i_96_]), 4));
							if (class352.actionCount != 0 && class243 != null)
								class243.method2949(0, !(class352.clippingFlag), i_99_, i_104_, i_103_, (class352.walkable), i_96_);
						} else if (i_101_ == 0) {
							int i_118_ = class352.anInt2956;
							if (Class98_Sub42.aBoolean4218 && class352.anInt2956 == -1)
								i_118_ = 1;
							Class246_Sub3_Sub3 class246_sub3_sub3;
							if (!bool_113_)
								class246_sub3_sub3 = (new Class246_Sub3_Sub3_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_100_, i_97_));
							else {
								Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2 = (new Class246_Sub3_Sub3_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_100_, bool_112_));
								class246_sub3_sub3 = class246_sub3_sub3_sub2;
								if (class246_sub3_sub3_sub2.method65(true))
									class246_sub3_sub3_sub2.method62(var_ha, 24447);
							}
							Class78.method790(i_102_, i_99_, i_96_, class246_sub3_sub3, null);
							if (i_100_ == 0) {
								if (Class98_Sub9.aBoolean3851 && class352.aBoolean2947) {
									var_s.ka(i_99_, i_96_, 50);
									var_s.ka(i_99_, 1 + i_96_, 50);
								}
								if (i_118_ == 1 && !this.aBoolean2544)
									Class239.method2921(i_99_, i_102_, i_96_, (class352.anInt2953), (class352.anInt2986), 1, 8);
							} else if (i_100_ != 1) {
								if (i_100_ != 2) {
									if (i_100_ == 3) {
										if (Class98_Sub9.aBoolean3851 && (class352.aBoolean2947)) {
											var_s.ka(i_99_, i_96_, 50);
											var_s.ka(i_99_ + 1, i_96_, 50);
										}
										if (i_118_ == 1 && !this.aBoolean2544)
											Class239.method2921(i_99_, i_102_, i_96_, (class352.anInt2953), (class352.anInt2986), 2, 8);
									}
								} else {
									if (Class98_Sub9.aBoolean3851 && (class352.aBoolean2947)) {
										var_s.ka(i_99_ + 1, i_96_, 50);
										var_s.ka(1 + i_99_, i_96_ - -1, 50);
									}
									if (i_118_ == 1 && !this.aBoolean2544)
										Class239.method2921(i_99_ + 1, i_102_, i_96_, -class352.anInt2953, class352.anInt2986, 1, 8);
								}
							} else {
								if (Class98_Sub9.aBoolean3851 && class352.aBoolean2947) {
									var_s.ka(i_99_, i_96_ - -1, 50);
									var_s.ka(i_99_ + 1, i_96_ - -1, 50);
								}
								if (i_118_ == 1 && !this.aBoolean2544)
									Class239.method2921(i_99_, i_102_, 1 + i_96_, -(class352.anInt2953), (class352.anInt2986), 2, 8);
							}
							if (class352.actionCount != 0 && class243 != null)
								class243.method2945(i_96_, class352.walkable, !class352.clippingFlag, i_100_, i_99_, i_101_, (byte) 122);
							if (class352.anInt2966 != 64)
								Class98_Sub32.method1439(i_102_, i_99_, i_96_, (class352.anInt2966));
						} else if (i_101_ == 1) {
							Class246_Sub3_Sub3 class246_sub3_sub3;
							if (!bool_113_)
								class246_sub3_sub3 = (new Class246_Sub3_Sub3_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_100_, i_97_));
							else {
								Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2 = (new Class246_Sub3_Sub3_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_100_, bool_112_));
								if (class246_sub3_sub3_sub2.method65(!bool))
									class246_sub3_sub3_sub2.method62(var_ha, 24447);
								class246_sub3_sub3 = class246_sub3_sub3_sub2;
							}
							Class78.method790(i_102_, i_99_, i_96_, class246_sub3_sub3, null);
							if (class352.aBoolean2947 && Class98_Sub9.aBoolean3851) {
								if (i_100_ == 0)
									var_s.ka(i_99_, 1 + i_96_, 50);
								else if (i_100_ != 1) {
									if (i_100_ == 2)
										var_s.ka(i_99_ + 1, i_96_, 50);
									else if (i_100_ == 3)
										var_s.ka(i_99_, i_96_, 50);
								} else
									var_s.ka(1 + i_99_, i_96_ - -1, 50);
							}
							if ((class352.actionCount != 0) && class243 != null)
								class243.method2945(i_96_, class352.walkable, !class352.clippingFlag, i_100_, i_99_, i_101_, (byte) 104);
						} else if (i_101_ == 2) {
							int i_119_ = 0x3 & 1 + i_100_;
							Class246_Sub3_Sub3 class246_sub3_sub3;
							Class246_Sub3_Sub3 class246_sub3_sub3_120_;
							if (bool_113_) {
								Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2 = (new Class246_Sub3_Sub3_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, 4 + i_100_, bool_112_));
								Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2_121_ = (new Class246_Sub3_Sub3_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_119_, bool_112_));
								if (class246_sub3_sub3_sub2.method65(true))
									class246_sub3_sub3_sub2.method62(var_ha, 24447);
								class246_sub3_sub3 = class246_sub3_sub3_sub2;
								if (class246_sub3_sub3_sub2_121_.method65(true))
									class246_sub3_sub3_sub2_121_.method62(var_ha, 24447);
								class246_sub3_sub3_120_ = class246_sub3_sub3_sub2_121_;
							} else {
								class246_sub3_sub3 = (new Class246_Sub3_Sub3_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_100_ + 4, i_97_));
								class246_sub3_sub3_120_ = (new Class246_Sub3_Sub3_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_119_, i_97_));
							}
							Class78.method790(i_102_, i_99_, i_96_, class246_sub3_sub3, class246_sub3_sub3_120_);
							if ((class352.anInt2956 == 1 || (Class98_Sub42.aBoolean4218 && class352.anInt2956 == -1)) && !this.aBoolean2544) {
								if (i_100_ == 0) {
									Class239.method2921(i_99_, i_102_, i_96_, (class352.anInt2953), (class352.anInt2986), 1, 8);
									Class239.method2921(i_99_, i_102_, i_96_ - -1, (class352.anInt2953), (class352.anInt2986), 2, 8);
								} else if (i_100_ != 1) {
									if (i_100_ != 2) {
										if (i_100_ == 3) {
											Class239.method2921(i_99_, i_102_, i_96_, (class352.anInt2953), (class352.anInt2986), 1, 8);
											Class239.method2921(i_99_, i_102_, i_96_, (class352.anInt2953), (class352.anInt2986), 2, 8);
										}
									} else {
										Class239.method2921(i_99_ - -1, i_102_, i_96_, class352.anInt2953, class352.anInt2986, 1, 8);
										Class239.method2921(i_99_, i_102_, i_96_, class352.anInt2953, class352.anInt2986, 2, 8);
									}
								} else {
									Class239.method2921(1 + i_99_, i_102_, i_96_, (class352.anInt2953), (class352.anInt2986), 1, 8);
									Class239.method2921(i_99_, i_102_, i_96_ + 1, (class352.anInt2953), (class352.anInt2986), 2, 8);
								}
							}
							if ((class352.actionCount != 0) && class243 != null)
								class243.method2945(i_96_, class352.walkable, !class352.clippingFlag, i_100_, i_99_, i_101_, (byte) 70);
							if (class352.anInt2966 != 64)
								Class98_Sub32.method1439(i_102_, i_99_, i_96_, (class352.anInt2966));
						} else if (i_101_ == 3) {
							Class246_Sub3_Sub3 class246_sub3_sub3;
							if (!bool_113_)
								class246_sub3_sub3 = (new Class246_Sub3_Sub3_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_100_, i_97_));
							else {
								Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2 = (new Class246_Sub3_Sub3_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_101_, i_100_, bool_112_));
								class246_sub3_sub3 = class246_sub3_sub3_sub2;
								if (class246_sub3_sub3_sub2.method65(true))
									class246_sub3_sub3_sub2.method62(var_ha, 24447);
							}
							Class78.method790(i_102_, i_99_, i_96_, class246_sub3_sub3, null);
							if (class352.aBoolean2947 && Class98_Sub9.aBoolean3851) {
								if (i_100_ != 0) {
									if (i_100_ == 1)
										var_s.ka(1 + i_99_, 1 + i_96_, 50);
									else if (i_100_ == 2)
										var_s.ka(1 + i_99_, i_96_, 50);
									else if (i_100_ == 3)
										var_s.ka(i_99_, i_96_, 50);
								} else
									var_s.ka(i_99_, 1 + i_96_, 50);
							}
							if ((class352.actionCount != 0) && class243 != null)
								class243.method2945(i_96_, class352.walkable, !class352.clippingFlag, i_100_, i_99_, i_101_, (byte) 126);
						} else if (i_101_ == 9) {
							Class246_Sub3_Sub4 class246_sub3_sub4;
							if (bool_113_) {
								Class246_Sub3_Sub4_Sub1 class246_sub3_sub4_sub1 = (new Class246_Sub3_Sub4_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_99_, i_99_, i_96_, i_96_, i_101_, i_100_, bool_112_));
								class246_sub3_sub4 = class246_sub3_sub4_sub1;
								if (class246_sub3_sub4_sub1.method65(true))
									class246_sub3_sub4_sub1.method62(var_ha, 24447);
							} else
								class246_sub3_sub4 = (new Class246_Sub3_Sub4_Sub5(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_99_, i_103_ + i_99_ + -1, i_96_, -1 + i_104_ + i_96_, i_101_, i_100_, i_97_));
							Class222.method2826(class246_sub3_sub4, false);
							if ((class352.anInt2956 == 1) && !this.aBoolean2544) {
								int i_122_;
								if ((0x1 & i_100_) == 0)
									i_122_ = 8;
								else
									i_122_ = 16;
								Class239.method2921(i_99_, i_102_, i_96_, 0, (class352.anInt2986), i_122_, 8);
							}
							if ((class352.actionCount != 0) && class243 != null)
								class243.method2949(0, !(class352.clippingFlag), i_99_, i_104_, i_103_, (class352.walkable), i_96_);
							if (class352.anInt2966 != 64)
								Class98_Sub32.method1439(i_102_, i_99_, i_96_, (class352.anInt2966));
						} else if (i_101_ == 4) {
							Class246_Sub3_Sub5 class246_sub3_sub5;
							if (!bool_113_)
								class246_sub3_sub5 = (new Class246_Sub3_Sub5_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, 0, 0, i_101_, i_100_, i_97_));
							else {
								Class246_Sub3_Sub5_Sub2 class246_sub3_sub5_sub2 = (new Class246_Sub3_Sub5_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, 0, 0, i_101_, i_100_));
								if (class246_sub3_sub5_sub2.method65(!bool))
									class246_sub3_sub5_sub2.method62(var_ha, 24447);
								class246_sub3_sub5 = class246_sub3_sub5_sub2;
							}
							Class246_Sub3_Sub1.method2995(i_102_, i_99_, i_96_, class246_sub3_sub5, null);
						} else if (i_101_ == 5) {
							int i_123_ = 65;
							Interface19 interface19 = ((Interface19) Class21_Sub1.method268(i_102_, i_99_, i_96_));
							if (interface19 != null)
								i_123_ = 1 + Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119).anInt2966;
							Class246_Sub3_Sub5 class246_sub3_sub5;
							if (!bool_113_)
								class246_sub3_sub5 = (new Class246_Sub3_Sub5_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, (i_123_ * Class351.anIntArray2923[i_100_]), (i_123_ * Class113.anIntArray951[i_100_]), i_101_, i_100_, i_97_));
							else {
								Class246_Sub3_Sub5_Sub2 class246_sub3_sub5_sub2 = (new Class246_Sub3_Sub5_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, (Class351.anIntArray2923[i_100_] * i_123_), (i_123_ * Class113.anIntArray951[i_100_]), i_101_, i_100_));
								if (class246_sub3_sub5_sub2.method65(true))
									class246_sub3_sub5_sub2.method62(var_ha, 24447);
								class246_sub3_sub5 = class246_sub3_sub5_sub2;
							}
							Class246_Sub3_Sub1.method2995(i_102_, i_99_, i_96_, class246_sub3_sub5, null);
						} else if (i_101_ == 6) {
							int i_124_ = 33;
							Interface19 interface19 = ((Interface19) Class21_Sub1.method268(i_102_, i_99_, i_96_));
							if (interface19 != null)
								i_124_ = 1 + Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119).anInt2966 / 2;
							Class246_Sub3_Sub5 class246_sub3_sub5;
							if (bool_113_) {
								Class246_Sub3_Sub5_Sub2 class246_sub3_sub5_sub2 = (new Class246_Sub3_Sub5_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, (Class351.anIntArray2923[i_100_] * i_124_), (Class113.anIntArray951[i_100_] * i_124_), i_101_, 4 + i_100_));
								class246_sub3_sub5 = class246_sub3_sub5_sub2;
								if (class246_sub3_sub5_sub2.method65(true))
									class246_sub3_sub5_sub2.method62(var_ha, 24447);
							} else
								class246_sub3_sub5 = (new Class246_Sub3_Sub5_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, (Class64_Sub18.anIntArray3688[i_100_] * i_124_), i_124_ * Class78.anIntArray595[i_100_], i_101_, 4 + i_100_, i_97_));
							Class246_Sub3_Sub1.method2995(i_102_, i_99_, i_96_, class246_sub3_sub5, null);
						} else if (i_101_ == 7) {
							int i_125_ = 0x3 & i_100_ - -2;
							Class246_Sub3_Sub5 class246_sub3_sub5;
							if (!bool_113_)
								class246_sub3_sub5 = (new Class246_Sub3_Sub5_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, 0, 0, i_101_, 4 + i_125_, i_97_));
							else {
								Class246_Sub3_Sub5_Sub2 class246_sub3_sub5_sub2 = (new Class246_Sub3_Sub5_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, 0, 0, i_101_, 4 + i_125_));
								class246_sub3_sub5 = class246_sub3_sub5_sub2;
								if (class246_sub3_sub5_sub2.method65(true))
									class246_sub3_sub5_sub2.method62(var_ha, 24447);
							}
							Class246_Sub3_Sub1.method2995(i_102_, i_99_, i_96_, class246_sub3_sub5, null);
						} else if (i_101_ == 8) {
							int i_126_ = 0x3 & 2 + i_100_;
							int i_127_ = 33;
							Interface19 interface19 = ((Interface19) Class21_Sub1.method268(i_102_, i_99_, i_96_));
							if (interface19 != null)
								i_127_ = Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119).anInt2966 / 2 - -1;
							Class246_Sub3_Sub5 class246_sub3_sub5;
							Class246_Sub3_Sub5 class246_sub3_sub5_128_;
							if (!bool_113_) {
								Class246_Sub3_Sub5_Sub1 class246_sub3_sub5_sub1 = (new Class246_Sub3_Sub5_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, (Class64_Sub18.anIntArray3688[i_100_] * i_127_), Class78.anIntArray595[i_100_] * i_127_, i_101_, 4 + i_100_, i_97_));
								Class246_Sub3_Sub5_Sub1 class246_sub3_sub5_sub1_129_ = (new Class246_Sub3_Sub5_Sub1(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, 0, 0, i_101_, i_126_ + 4, i_97_));
								class246_sub3_sub5 = class246_sub3_sub5_sub1;
								class246_sub3_sub5_128_ = class246_sub3_sub5_sub1_129_;
							} else {
								Class246_Sub3_Sub5_Sub2 class246_sub3_sub5_sub2 = (new Class246_Sub3_Sub5_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, i_127_ * (Class64_Sub18.anIntArray3688[i_100_]), i_127_ * Class78.anIntArray595[i_100_], i_101_, 4 + i_100_));
								Class246_Sub3_Sub5_Sub2 class246_sub3_sub5_sub2_130_ = (new Class246_Sub3_Sub5_Sub2(var_ha, class352, i_102_, i_98_, i_110_, i_109_, i_111_, this.aBoolean2544, 0, 0, i_101_, 4 + i_126_));
								if (class246_sub3_sub5_sub2.method65(true))
									class246_sub3_sub5_sub2.method62(var_ha, 24447);
								if (class246_sub3_sub5_sub2_130_.method65(true))
									class246_sub3_sub5_sub2_130_.method62(var_ha, 24447);
								class246_sub3_sub5 = class246_sub3_sub5_sub2;
								class246_sub3_sub5_128_ = class246_sub3_sub5_sub2_130_;
							}
							Class246_Sub3_Sub1.method2995(i_102_, i_99_, i_96_, class246_sub3_sub5, class246_sub3_sub5_128_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ms.AA(" + i + ',' + i_96_ + ',' + i_97_ + ',' + i_98_ + ',' + bool + ',' + i_99_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_100_ + ',' + i_101_ + ',' + i_102_ + ',' + (class243 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3589(boolean bool, byte i, ha var_ha) {
		try {
			Class262.method3213();
			if (i == 105) {
				if (!bool) {
					if (this.anInt2547 > 1) {
						for (int i_131_ = 0; i_131_ < this.anInt2543; i_131_++) {
							for (int i_132_ = 0; (i_132_ < this.anInt2542); i_132_++) {
								if ((0x2 & (Class281.tileSettings[1][i_131_][i_132_])) == 2)
									Class206.method2723(i_131_, i_132_);
							}
						}
					}
					for (int i_133_ = 0; this.anInt2547 > i_133_; i_133_++) {
						for (int i_134_ = 0; (this.anInt2542 >= i_134_); i_134_++) {
							for (int i_135_ = 0; i_135_ <= this.anInt2543; i_135_++) {
								if (((this.aByteArrayArrayArray2550[i_133_][i_135_][i_134_]) & 0x4) != 0) {
									int i_136_ = i_135_;
									int i_137_ = i_135_;
									int i_138_ = i_134_;
									int i_139_ = i_134_;
									for (/**/; (i_138_ > 0 && (0x4 & (this.aByteArrayArrayArray2550[i_133_][i_135_][-1 + i_138_])) != 0); i_138_--) {
										if (-i_138_ + i_139_ >= 10)
											break;
									}
									for (/**/; (i_139_ < this.anInt2542 && (0x4 & (this.aByteArrayArrayArray2550[i_133_][i_135_][i_139_ + 1])) != 0); i_139_++) {
										if (-i_138_ + i_139_ >= 10)
											break;
									}
									while_128_: for (/**/; i_136_ > 0; i_136_--) {
										if (i_137_ + -i_136_ >= 10)
											break;
										for (int i_140_ = i_138_; i_140_ <= i_139_; i_140_++) {
											if (((this.aByteArrayArrayArray2550[i_133_][-1 + i_136_][i_140_]) & 0x4) == 0)
												break while_128_;
										}
									}
									while_129_: for (/**/; (i_137_ < this.anInt2543 && (i_137_ + -i_136_ < 10)); i_137_++) {
										for (int i_141_ = i_138_; (i_139_ >= i_141_); i_141_++) {
											if (((this.aByteArrayArrayArray2550[i_133_][1 + i_137_][i_141_]) & 0x4) == 0)
												break while_129_;
										}
									}
									if (((1 + (-i_136_ + i_137_)) * (i_139_ + -i_138_ + 1)) >= 4) {
										int i_142_ = (this.anIntArrayArrayArray2549[i_133_][i_136_][i_138_]);
										Class98_Sub46_Sub10.method1565(i_136_ << 9, 512 + (i_139_ << 9), false, 4, i_133_, 512 + (i_137_ << 9), i_142_, i_138_ << 9, i_142_);
										for (int i_143_ = i_136_; i_137_ >= i_143_; i_143_++) {
											for (int i_144_ = i_138_; i_144_ <= i_139_; i_144_++)
												this.aByteArrayArrayArray2550[i_133_][i_143_][i_144_] = (byte) (Class202.method2702((this.aByteArrayArrayArray2550[i_133_][i_143_][i_144_]), -5));
										}
									}
								}
							}
						}
					}
					Class284_Sub1_Sub2.method3371(31398);
				}
				this.aByteArrayArrayArray2550 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ms.BA(" + bool + ',' + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3590(int i, int i_145_, ha var_ha, Collision class243, int i_146_, int i_147_, int i_148_) {
		do {
			try {
				Interface19 interface19 = method3583(i, i_147_, i_145_, -1, i_148_);
				if (interface19 != null) {
					Class352 class352 = (Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119));
					int i_149_ = interface19.method63((byte) 20);
					int i_150_ = interface19.method66(4657);
					if (class352.method3858(95))
						Class312.method3620(class352, -22015, i, i_145_, i_148_);
					if (interface19.method65(true))
						interface19.method67(-25163, var_ha);
					if (i_147_ == 0) {
						Class373_Sub1_Sub1.method3972(i_145_, i_148_, i);
						if (class352.actionCount != 0)
							class243.applyObjectCollision(i_149_, (class352.walkable), (byte) 84, !(class352.clippingFlag), i_148_, i_150_, i);
						if (class352.anInt2956 == 1) {
							if (i_150_ != 0) {
								if (i_150_ == 1)
									Class100.method1692(2, i_145_, i_148_, 1 + i, 64);
								else if (i_150_ != 2) {
									if (i_150_ == 3)
										Class100.method1692(2, i_145_, i_148_, i, i_146_ + 63);
								} else
									Class100.method1692(1, i_145_, i_148_ - -1, i, i_146_ ^ 0x41);
							} else
								Class100.method1692(1, i_145_, i_148_, i, 64);
						}
					} else if (i_147_ == 1)
						Class218.method2807(i_145_, i_148_, i);
					else if (i_147_ != 2) {
						if (i_147_ == 3) {
							Class98_Sub46_Sub14.method1602(i_145_, i_148_, i);
							if (class352.actionCount == 1)
								class243.method2948(false, i_148_, i);
						}
					} else {
						GameInterface.method1162(i_145_, i_148_, i, (aClass5304 != null ? aClass5304 : (aClass5304 = method3592("Interface19"))));
						if ((class352.actionCount != 0) && (i_148_ - -class352.sizeY < this.anInt2543) && (this.anInt2542 > i + class352.sizeY) && (this.anInt2543 > class352.sizeX + i_148_) && (this.anInt2542 > i - -class352.sizeX))
							class243.method2951(class352.sizeY, class352.walkable, i_150_, class352.sizeX, i, !class352.clippingFlag, 131072, i_148_);
						if (i_149_ == 9) {
							if ((i_150_ & 0x1) == 0)
								Class100.method1692(8, i_145_, i_148_, i, 64);
							else
								Class100.method1692(16, i_145_, i_148_, i, 64);
						}
					}
				}
				if (i_146_ == 1)
					break;
				anInt5303 = 81;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ms.W(" + i + ',' + i_145_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class243 != null ? "{...}" : "null") + ',' + i_146_ + ',' + i_147_ + ',' + i_148_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3591(Collision[] class243s, int i, byte i_151_, byte[] is, ha var_ha, int i_152_) {// IMPORTANT
		try {
			if (i_151_ >= -13)
				method3582(-109, 44, -116, null, null, null);
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			int i_153_ = -1;
			for (;;) {
				int i_154_ = class98_sub22.method1208(3893);
				if (i_154_ == 0)
					break;
				i_153_ += i_154_;
				int i_155_ = 0;
				for (;;) {
					int i_156_ = class98_sub22.readSmart(1689622712);
					if (i_156_ == 0)
						break;
					i_155_ += -1 + i_156_;
					int i_157_ = 0x3f & i_155_;
					int i_158_ = (0xfea & i_155_) >> 6;
					int i_159_ = i_155_ >> 12;
					int i_160_ = class98_sub22.readUnsignedByte();
					int i_161_ = i_160_ >> 2;
					int i_162_ = 0x3 & i_160_;
					int i_163_ = i_152_ + i_158_;
					int i_164_ = i_157_ + i;
					if (i_163_ > 0 && i_164_ > 0 && (this.anInt2543 - 1 > i_163_) && -1 + this.anInt2542 > i_164_) {
						Collision class243 = null;
						if (!this.aBoolean2544) {
							int i_165_ = i_159_;
							if (((Class281.tileSettings[1][i_163_][i_164_]) & 0x2) == 2)
								i_165_--;
							if (i_165_ >= 0)
								class243 = class243s[i_165_];
						}
						//int absX = Class272.anInt2038 + i_163_;
						//int absY = aa_Sub2.anInt3562 + i_164_;
						// try {
						// BufferedWriter writer = new BufferedWriter(new
						// FileWriter("regiondump", true));
						// writer.write(i_153_ + "," + absX + "," + absY + "," +
						// i_159_ + "," + i_161_ + "," + i_162_);
						// writer.newLine();
						// writer.flush();
						// } catch(Exception e) {
						// e.printStackTrace();
						// }
						method3588(i_153_, i_164_, -1, i_159_, false, i_163_, var_ha, i_162_, i_161_, i_159_, class243);
					}
				}
			}
		} catch (Exception runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ms.U(" + (class243s != null ? "{...}" : "null") + ',' + i + ',' + i_151_ + ',' + (is != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_152_ + ')'));
		}
	}

	/* synthetic */
	static Class method3592(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
