/* Class246_Sub3_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Mobile extends Class246_Sub3_Sub4 {
	int anInt6347;
	boolean aBoolean6348 = false;
	int anInt6349;
	int anInt6350;
	int anInt6351;
	int anInt6352;
	int anInt6353 = -1;
	int anInt6354;
	private byte aByte6355;
	int anInt6356;
	int anInt6358 = 0;
	boolean aBoolean6359;
	int anInt6360;
	int anInt6361 = -1;
	int anInt6362;
	int anInt6363;
	int anInt6364;
	int anInt6365;
	int anInt6366 = 0;
	int anInt6367;
	byte aByte6368;
	int anInt6369;
	int[] anIntArray6370;
	boolean aBoolean6371;
	int anInt6372;
	int[] anIntArray6373;
	String aString6374;
	int[] anIntArray6375;
	int anInt6376;
	int anInt6377;
	int anInt6378;
	int anInt6379;
	int anInt6380;
	byte aByte6381;
	int anInt6382;
	int[] anIntArray6383;
	int anInt6384;
	int anInt6385;
	int[] anIntArray6386;
	Class226[] aClass226Array6387;
	int anInt6388;
	int anInt6389;
	int anInt6390;
	int anInt6391;
	int anInt6392;
	int anInt6393;
	int anInt6394;
	private int anInt6395;
	int anInt6396;
	int[] anIntArray6397;
	int anInt6398;
	Class325 aClass325_6399;
	int anInt6400;
	int anInt6401;
	int anInt6402;
	int anInt6403;
	byte aByte6404;
	int anInt6405;
	int anInt6406;
	int anInt6407;
	int anInt6408;
	int anInt6409;
	int anInt6410;
	int anInt6411;
	int anInt6412;
	int anInt6413;
	int anInt6414;
	int anInt6415;
	int anInt6416;
	int anInt6417;
	int anInt6418;
	int anInt6419;
	int anInt6420;
	int anInt6421;
	byte aByte6422;
	int[] anIntArray6423;
	int anInt6424;
	int[] anIntArray6425;
	int anInt6426;
	int anInt6427;
	int anInt6428;
	int anInt6429;
	int[] anIntArray6430;
	private Class325 aClass325_6431;
	private Class325 aClass325_6432;
	int anInt6433;
	int anInt6434;
	int anInt6435;
	int anInt6436;
	int[] walkQueueX;
	int[] walkQueueZ;
	Class246_Sub5 aClass246_Sub5_6439;
	boolean aBoolean6440;
	AbstractModel[] aClass146Array6441;
	boolean aBoolean6442;
	byte[] aByteArray6443;

	final boolean method2987(int i) {
		try {
			if (i != 6540)
				method3045((byte) -59, 60);
			return this.aBoolean6442;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.I(" + i + ')');
		}
	}

	final void method3022(int i) {
		try {
			if (i != -8675)
				method3037(-16, true, -64, 100, -58, -61, -88, 24);
			int i_0_ = (-1 + anInt6395 << 8) + 240;
			this.aShort6159 = (short) (i_0_ + this.localYPos >> 9);
			this.aShort6160 = (short) (this.localXPos + i_0_ >> 9);
			this.aShort6157 = (short) (this.localYPos + -i_0_ >> 9);
			this.aShort6158 = (short) (-i_0_ + this.localXPos >> 9);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.F(" + i + ')');
		}
	}

	abstract int method3030(byte i);

	final void method3031(int i) {
		try {
			this.anInt6436 = i;
			this.anInt6434 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.R(" + i + ')');
		}
	}

	final void method3032(int i, boolean bool, int i_1_, int i_2_, int i_3_, int i_4_) {
		do {
			try {
				int i_5_ = (bool ? this.anInt6365 : this.anInt6379);
				if (i_3_ != -1 && i_5_ != -1) {
					if (i_5_ != i_3_) {
						Class107 class107 = Class196.aClass304_1509.method3564(2, i_3_);
						Class107 class107_6_ = Class196.aClass304_1509.method3564(2, i_5_);
						if (class107.anInt910 != -1 && class107_6_.anInt910 != -1) {
							Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383));
							Class97 class97_7_ = (Class151_Sub7.aClass183_5001.method2623(class107_6_.anInt910, 16383));
							if (class97_7_.anInt829 > class97.anInt829)
								break;
						}
					} else {
						Class107 class107 = Class196.aClass304_1509.method3564(2, i_3_);
						if (class107.aBoolean909 && class107.anInt910 != -1) {
							Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383));
							int i_8_ = class97.anInt819;
							if (i_8_ == 0)
								break;
							if (i_8_ == 2) {
								if (!bool)
									this.anInt6356 = 0;
								else {
									this.anInt6380 = 0;
									break;
								}
								break;
							}
						}
					}
				}
				if (i_4_ >= -69)
					method3035(-115);
				int i_9_ = Class215.anInt1614;
				if (bool) {
					this.anInt6421 = 1;
					this.anInt6426 = i_9_ - -(i_1_ & 0xffff);
					this.anInt6427 = 0;
					this.anInt6365 = i_3_;
					this.anInt6363 = i_1_ >> 16;
					this.anInt6428 = 0;
					this.anInt6353 = i;
					this.anInt6360 = i_2_;
					if (i_9_ < this.anInt6426)
						this.anInt6428 = -1;
					if (this.anInt6365 != -1 && (i_9_ == this.anInt6426)) {
						int i_10_ = (Class196.aClass304_1509.method3564(2, this.anInt6365).anInt910);
						if (i_10_ != -1) {
							Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_10_, 16383);
							if (class97 != null && class97.anIntArray818 != null && !(this.aBoolean6371))
								Class349.method3840((byte) -128, this, 0, class97);
						}
					}
				} else {
					this.anInt6396 = 0;
					this.anInt6367 = 1;
					this.anInt6379 = i_3_;
					this.anInt6410 = i;
					this.anInt6389 = i_2_;
					this.anInt6391 = i_9_ + (i_1_ & 0xffff);
					this.anInt6382 = i_1_ >> 16;
					this.anInt6376 = 0;
					if (this.anInt6391 > i_9_)
						this.anInt6376 = -1;
					if (this.anInt6379 == -1 || this.anInt6391 != i_9_)
						break;
					int i_11_ = (Class196.aClass304_1509.method3564(2, this.anInt6379).anInt910);
					if (i_11_ == -1)
						break;
					Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_11_, 16383);
					if (class97 == null || class97.anIntArray818 == null || this.aBoolean6371)
						break;
					Class349.method3840((byte) -128, this, 0, class97);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("oi.S(" + i + ',' + bool + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final int method3033(byte i) {
		try {
			RenderAnimDefinitions class294 = getRenderAnimation(1);
			int i_12_ = -77 % ((-85 - i) / 40);
			int i_13_ = (this.aClass325_6399.anInt2730);
			boolean bool;
			if (class294.anInt2398 == 0)
				bool = (this.aClass325_6399.method3699(4201, this.anInt6414, this.anInt6415, this.anInt6414));
			else
				bool = (this.aClass325_6399.method3699(4201, class294.anInt2383, this.anInt6415, class294.anInt2398));
			int i_14_ = -i_13_ + this.aClass325_6399.anInt2730;
			if (i_14_ != 0)
				this.anInt6408++;
			else {
				this.anInt6408 = 0;
				this.aClass325_6399.method3697(true, this.anInt6415);
			}
			if (bool) {
				if (class294.anInt2390 != 0) {
					if (i_14_ > 0)
						aClass325_6431.method3699(4201, class294.anInt2392, class294.anInt2393, class294.anInt2390);
					else
						aClass325_6431.method3699(4201, class294.anInt2392, -class294.anInt2393, class294.anInt2390);
				}
				if (class294.anInt2375 != 0)
					aClass325_6432.method3699(4201, class294.anInt2380, class294.anInt2363, class294.anInt2375);
			} else {
				if (class294.anInt2390 == 0)
					aClass325_6431.method3697(true, 0);
				else
					aClass325_6431.method3699(4201, class294.anInt2392, 0, class294.anInt2390);
				if (class294.anInt2375 != 0)
					aClass325_6432.method3699(4201, class294.anInt2380, 0, class294.anInt2375);
				else
					aClass325_6432.method3697(true, 0);
			}
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.L(" + i + ')');
		}
	}

	int getSize() {
		try {
			return anInt6395;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.A(");
		}
	}

	abstract int method3035(int i);

	final void method3036(ha var_ha, boolean bool, byte i, Class111 class111, AbstractModel[] class146s) {
		do {
			try {
				if (i <= -118) {
					do {
						if (bool) {
							if ((this.aClass246_Sub5_6439) == null)
								break;
							this.aClass246_Sub5_6439.method3126(Class215.anInt1614);
							if (!client.aBoolean3553)
								break;
						}
						AbstractModel class146 = class146s[0];
						AbstractModel class146_15_ = class146s[1];
						AbstractModel class146_16_ = class146s[2];
						if (class146 != null) {
							class146.method2343(class111);
							int i_17_ = 0;
							int i_18_ = 0;
							int i_19_ = 0;
							int i_20_ = 0;
							Class87[] class87s = class146.method2320();
							Class35[] class35s = class146.method2322();
							if (class35s != null) {
								i_20_++;
								i_19_ += class35s.length;
							}
							if (class87s != null) {
								i_18_++;
								i_17_ += class87s.length;
							}
							Class87[] class87s_21_ = null;
							Class35[] class35s_22_ = null;
							if (class146_15_ != null) {
								class146_15_.method2343(class111);
								class87s_21_ = class146_15_.method2320();
								class35s_22_ = class146_15_.method2322();
							}
							if (class35s_22_ != null) {
								i_19_ += class35s_22_.length;
								i_20_++;
							}
							if (class87s_21_ != null) {
								i_17_ += class87s_21_.length;
								i_18_++;
							}
							Class87[] class87s_23_ = null;
							Class35[] class35s_24_ = null;
							if (class146_16_ != null) {
								class146_16_.method2343(class111);
								class87s_23_ = class146_16_.method2320();
								class35s_24_ = class146_16_.method2322();
							}
							if (class35s_24_ != null) {
								i_19_ += class35s_24_.length;
								i_20_++;
							}
							if (class87s_23_ != null) {
								i_18_++;
								i_17_ += class87s_23_.length;
							}
							if (((this.aClass246_Sub5_6439) == null || this.aClass246_Sub5_6439.aBoolean5099) && (i_18_ > 0 || i_20_ > 0))
								this.aClass246_Sub5_6439 = Class246_Sub5.method3117((Class215.anInt1614), true);
							if ((this.aClass246_Sub5_6439) != null) {
								Object object = null;
								Class87[] class87s_25_;
								if (i_18_ == 1) {
									if (class87s_21_ == null) {
										if (class87s_23_ != null)
											class87s_25_ = class87s_23_;
										else
											class87s_25_ = class87s;
									} else
										class87s_25_ = class87s_21_;
								} else {
									class87s_25_ = new Class87[i_17_];
									int i_26_ = 0;
									if (class87s != null) {
										Class236.method2892(class87s, 0, class87s_25_, i_26_, class87s.length);
										i_26_ += class87s.length;
									}
									if (class87s_21_ != null) {
										Class236.method2892(class87s_21_, 0, class87s_25_, i_26_, class87s_21_.length);
										i_26_ += class87s_21_.length;
									}
									if (class87s_23_ != null)
										Class236.method2892(class87s_23_, 0, class87s_25_, i_26_, class87s_23_.length);
								}
								Object object_27_ = null;
								Class35[] class35s_28_;
								if (i_20_ != 1) {
									class35s_28_ = new Class35[i_19_];
									int i_29_ = 0;
									if (class35s != null) {
										Class236.method2892(class35s, 0, class35s_28_, i_29_, class35s.length);
										i_29_ += class35s.length;
									}
									if (class35s_22_ != null) {
										Class236.method2892(class35s_22_, 0, class35s_28_, i_29_, class35s_22_.length);
										i_29_ += class35s_22_.length;
									}
									if (class35s_24_ != null)
										Class236.method2892(class35s_24_, 0, class35s_28_, i_29_, class35s_24_.length);
								} else if (class35s_22_ != null)
									class35s_28_ = class35s_22_;
								else if (class35s_24_ == null)
									class35s_28_ = class35s;
								else
									class35s_28_ = class35s_24_;
								this.aClass246_Sub5_6439.method3120(var_ha, Class215.anInt1614, class87s_25_, class35s_28_, false);
							}
							this.aBoolean6440 = true;
						}
					} while (false);
					if (this.aClass246_Sub5_6439 == null)
						break;
					this.aClass246_Sub5_6439.method3123(this.height_level, this.aShort6158, this.aShort6160, this.aShort6157, this.aShort6159);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("oi.N(" + (var_ha != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + (class111 != null ? "{...}" : "null") + ',' + (class146s != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3037(int i, boolean bool, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		try {
			boolean bool_36_ = true;
			boolean bool_37_ = true;
			for (int i_38_ = 0; i_38_ < Class362.anInt3090; i_38_++) {
				if (i_32_ < this.anIntArray6375[i_38_])
					bool_36_ = false;
				else
					bool_37_ = false;
			}
			int i_39_ = -1;
			int i_40_ = -1;
			int i_41_ = 0;
			if (i_31_ >= 0) {
				Class86 class86 = Class246_Sub3_Sub1.aClass121_6150.method2194(-62, i_31_);
				i_40_ = class86.anInt642;
				i_41_ = class86.anInt651;
			}
			if (bool == false) {
				if (bool_37_) {
					if (i_40_ == -1)
						return;
					i_39_ = 0;
					int i_42_ = 0;
					if (i_40_ != 0) {
						if (i_40_ == 1)
							i_42_ = (this.anIntArray6425[0]);
					} else
						i_42_ = (this.anIntArray6375[0]);
					for (int i_43_ = 1; (i_43_ < Class362.anInt3090); i_43_++) {
						if (i_40_ == 0) {
							if ((this.anIntArray6375[i_43_]) < i_42_) {
								i_39_ = i_43_;
								i_42_ = (this.anIntArray6375[i_43_]);
							}
						} else if (i_40_ == 1 && i_42_ > (this.anIntArray6425[i_43_])) {
							i_39_ = i_43_;
							i_42_ = (this.anIntArray6425[i_43_]);
						}
					}
					if (i_40_ == 1 && i_42_ >= i_30_)
						return;
				} else {
					if (bool_36_)
						aByte6355 = (byte) 0;
					for (int i_44_ = 0; (Class362.anInt3090 > i_44_); i_44_++) {
						int i_45_ = aByte6355;
						aByte6355 = (byte) ((aByte6355 + 1) % Class362.anInt3090);
						if ((this.anIntArray6375[i_45_]) <= i_32_) {
							i_39_ = i_45_;
							break;
						}
					}
				}
				if (i_39_ >= 0) {
					this.anIntArray6430[i_39_] = i_31_;
					this.anIntArray6425[i_39_] = i_30_;
					this.anIntArray6386[i_39_] = i_35_;
					this.anIntArray6423[i_39_] = i_33_;
					this.anIntArray6375[i_39_] = i_41_ + (i_32_ + i_34_);
					this.anIntArray6397[i_39_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oi.V(" + i + ',' + bool + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				this.anInt6362 = -77;
			return this.anInt6354;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.O(" + bool + ')');
		}
	}

	final void method3038(int[] is, int[] is_46_, boolean bool) {
		try {
			if (bool != true)
				this.anInt6352 = -44;
			if (this.anIntArray6383 != null || is_46_ == null) {
				if (is_46_ == null) {
					this.anIntArray6383 = null;
					return;
				}
			} else
				this.anIntArray6383 = new int[12];
			for (int i = 0; this.anIntArray6383.length > i; i++)
				this.anIntArray6383[i] = -1;
			for (int i = 0; is_46_.length > i; i++) {
				int i_47_ = is[i];
				int i_48_ = 0;
				while (i_48_ < this.anIntArray6383.length) {
					if ((i_47_ & 0x1) != 0)
						this.anIntArray6383[i_48_] = is_46_[i];
					i_48_++;
					i_47_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oi.M(" + (is != null ? "{...}" : "null") + ',' + (is_46_ != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				return 30;
			if (this.anInt6352 == -32768)
				return 0;
			return this.anInt6352;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.J(" + i + ')');
		}
	}

	final RenderAnimDefinitions getRenderAnimation(int i) {
		try {
			if (i != 1)
				method3032(125, false, -5, 97, 58, -63);
			int i_49_ = method3030((byte) 70);
			if (i_49_ != -1)
				return Class370.aClass257_3136.method3199(false, i_49_);
			return Class64_Sub22.aClass294_3706;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.U(" + i + ')');
		}
	}

	final void method3040(boolean bool, int i, int i_50_, int i_51_, int i_52_, int i_53_) {
		try {
			int i_54_ = ((this.aShort6158 + this.aShort6160) >> 1);
			int i_55_ = ((this.aShort6157 + this.aShort6159) >> 1);
			int i_56_ = Class284_Sub2_Sub2.anIntArray6200[i_52_];
			int i_57_ = Class284_Sub2_Sub2.anIntArray6202[i_52_];
			int i_58_ = -i_50_ / 2;
			int i_59_ = -i_51_ / 2;
			int i_60_ = i_58_ * i_57_ + i_59_ * i_56_ >> 14;
			int i_61_ = i_57_ * i_59_ - i_56_ * i_58_ >> 14;
			if (bool != false)
				getRenderAnimation(126);
			int i_62_ = (Class64_Sub27.method664(this.localYPos + i_61_, i_55_, 109, this.height_level, this.localXPos + i_60_, i_54_));
			int i_63_ = i_50_ / 2;
			int i_64_ = -i_51_ / 2;
			int i_65_ = i_64_ * i_56_ - -(i_57_ * i_63_) >> 14;
			int i_66_ = i_57_ * i_64_ - i_63_ * i_56_ >> 14;
			int i_67_ = (Class64_Sub27.method664(this.localYPos - -i_66_, i_55_, 125, this.height_level, i_65_ + this.localXPos, i_54_));
			int i_68_ = -i_50_ / 2;
			int i_69_ = i_51_ / 2;
			int i_70_ = i_56_ * i_69_ + i_68_ * i_57_ >> 14;
			int i_71_ = i_69_ * i_57_ - i_56_ * i_68_ >> 14;
			int i_72_ = (Class64_Sub27.method664(i_71_ + this.localYPos, i_55_, 89, this.height_level, i_70_ + this.localXPos, i_54_));
			int i_73_ = i_50_ / 2;
			int i_74_ = i_51_ / 2;
			int i_75_ = i_73_ * i_57_ + i_56_ * i_74_ >> 14;
			int i_76_ = -(i_56_ * i_73_) + i_57_ * i_74_ >> 14;
			int i_77_ = (Class64_Sub27.method664(i_76_ + this.localYPos, i_55_, 111, this.height_level, i_75_ + this.localXPos, i_54_));
			int i_78_ = i_67_ > i_62_ ? i_62_ : i_67_;
			int i_79_ = i_77_ <= i_72_ ? i_77_ : i_72_;
			int i_80_ = i_77_ <= i_67_ ? i_77_ : i_67_;
			int i_81_ = i_72_ > i_62_ ? i_62_ : i_72_;
			this.anInt6388 = 0x3fff & (int) (2607.5945876176133 * Math.atan2(-i_79_ + i_78_, i_51_));
			this.anInt6377 = 0x3fff & (int) (Math.atan2(i_81_ + -i_80_, i_50_) * 2607.5945876176133);
			if (this.anInt6388 != 0 && i != 0) {
				int i_82_ = 16384 - i;
				if (this.anInt6388 <= 8192) {
					if (i < this.anInt6388)
						this.anInt6388 = i;
				} else if (this.anInt6388 < i_82_)
					this.anInt6388 = i_82_;
			}
			if (this.anInt6377 != 0 && i_53_ != 0) {
				int i_83_ = -i_53_ + 16384;
				if (this.anInt6377 > 8192) {
					if (i_83_ > this.anInt6377)
						this.anInt6377 = i_83_;
				} else if (this.anInt6377 > i_53_)
					this.anInt6377 = i_53_;
			}
			this.anInt6416 = i_62_ - -i_77_;
			if (this.anInt6416 > i_72_ + i_67_)
				this.anInt6416 = i_67_ - -i_72_;
			this.anInt6416 = (-this.anInt5089 + (this.anInt6416 >> 1));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oi.C(" + bool + ',' + i + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ')'));
		}
	}

	static final void method3041(int i, Class88 class88, RSByteBuffer class98_sub22, int i_84_) {
		try {
			Class98_Sub19 class98_sub19 = new Class98_Sub19();
			class98_sub19.anInt3960 = class98_sub22.readUnsignedByte();
			class98_sub19.anInt3954 = class98_sub22.readInt(-2);
			class98_sub19.aByteArrayArrayArray3958 = new byte[class98_sub19.anInt3960][][];
			class98_sub19.aClass143Array3962 = new Class143[class98_sub19.anInt3960];
			class98_sub19.anIntArray3957 = new int[class98_sub19.anInt3960];
			class98_sub19.anIntArray3953 = new int[class98_sub19.anInt3960];
			class98_sub19.aClass143Array3961 = new Class143[class98_sub19.anInt3960];
			class98_sub19.anIntArray3959 = new int[class98_sub19.anInt3960];
			for (int i_85_ = i; (i_85_ < class98_sub19.anInt3960); i_85_++) {
				try {
					int i_86_ = class98_sub22.readUnsignedByte();
					if (i_86_ != 0 && i_86_ != 1 && i_86_ != 2) {
						if (i_86_ == 3 || i_86_ == 4) {
							String string = class98_sub22.readString();
							String string_87_ = class98_sub22.readString();
							int i_88_ = class98_sub22.readUnsignedByte();
							String[] strings = new String[i_88_];
							for (int i_89_ = 0; i_88_ > i_89_; i_89_++)
								strings[i_89_] = class98_sub22.readString();
							byte[][] is = new byte[i_88_][];
							if (i_86_ == 3) {
								for (int i_90_ = 0; i_90_ < i_88_; i_90_++) {
									int i_91_ = class98_sub22.readInt(-2);
									is[i_90_] = new byte[i_91_];
									class98_sub22.method1190(is[i_90_], true, i_91_, 0);
								}
							}
							class98_sub19.anIntArray3953[i_85_] = i_86_;
							Class[] var_classes = new Class[i_88_];
							for (int i_92_ = 0; i_92_ < i_88_; i_92_++)
								var_classes[i_92_] = Class98_Sub10_Sub10.method1037(107, strings[i_92_]);
							class98_sub19.aClass143Array3961[i_85_] = (class88.method870(string_87_, Class98_Sub10_Sub10.method1037(-113, string), Class369.method3953(i, 0), var_classes));
							class98_sub19.aByteArrayArrayArray3958[i_85_] = is;
						}
					} else {
						String string = class98_sub22.readString();
						String string_93_ = class98_sub22.readString();
						int i_94_ = 0;
						if (i_86_ == 1)
							i_94_ = class98_sub22.readInt(i + -2);
						class98_sub19.anIntArray3953[i_85_] = i_86_;
						class98_sub19.anIntArray3959[i_85_] = i_94_;
						class98_sub19.aClass143Array3962[i_85_] = class88.method873(string_93_, Class98_Sub10_Sub10.method1037(-128, string), -27303);
					}
				} catch (ClassNotFoundException classnotfoundexception) {
					class98_sub19.anIntArray3957[i_85_] = -1;
				} catch (SecurityException securityexception) {
					class98_sub19.anIntArray3957[i_85_] = -2;
				} catch (NullPointerException nullpointerexception) {
					class98_sub19.anIntArray3957[i_85_] = -3;
				} catch (Exception exception) {
					class98_sub19.anIntArray3957[i_85_] = -4;
				} catch (Throwable throwable) {
					class98_sub19.anIntArray3957[i_85_] = -5;
				}
			}
			Class186.aClass148_3428.add_last(class98_sub19, -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oi.D(" + i + ',' + (class88 != null ? "{...}" : "null") + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_84_ + ')'));
		}
	}

	final boolean method2978(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.H(" + i + ')');
		}
	}

	public Mobile() {
		super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		this.aBoolean6359 = false;
		this.anInt6356 = 0;
		this.anInt6351 = 0;
		this.anInt6354 = 0;
		this.anInt6379 = -1;
		this.anInt6352 = -32768;
		this.anInt6385 = -1;
		this.anInt6367 = -1;
		aByte6355 = (byte) 0;
		this.anInt6380 = 0;
		this.aClass226Array6387 = new Class226[12];
		this.anInt6396 = 0;
		this.anInt6349 = -1;
		this.anIntArray6397 = new int[Class362.anInt3090];
		this.anInt6350 = 0;
		this.aString6374 = null;
		this.anIntArray6375 = new int[Class362.anInt3090];
		this.anInt6364 = -1;
		this.aBoolean6371 = true;
		this.anInt6406 = 0;
		this.anInt6403 = -1;
		this.anInt6405 = 0;
		this.anInt6376 = 0;
		this.anInt6410 = -1;
		this.anInt6414 = 256;
		this.anIntArray6373 = null;
		this.anInt6402 = 0;
		this.anInt6384 = 100;
		this.anIntArray6386 = new int[Class362.anInt3090];
		this.anInt6398 = 0;
		this.anInt6412 = -1000;
		this.anInt6409 = 0;
		this.anInt6419 = -1;
		this.anInt6413 = -1;
		this.anInt6418 = -1000;
		this.anInt6408 = 0;
		this.anIntArray6423 = new int[Class362.anInt3090];
		this.anInt6372 = 0;
		this.anInt6427 = 0;
		this.anInt6365 = -1;
		this.anInt6400 = 0;
		this.anInt6421 = -1;
		this.anIntArray6425 = new int[Class362.anInt3090];
		this.aByte6422 = (byte) 0;
		this.anInt6411 = -1;
		this.anInt6393 = 0;
		this.anInt6428 = 0;
		anInt6395 = 1;
		this.anIntArray6430 = new int[Class362.anInt3090];
		this.aClass325_6399 = new Class325();
		aClass325_6431 = new Class325();
		aClass325_6432 = new Class325();
		this.anInt6434 = 0;
		this.walkQueueX = new int[10];
		this.walkQueueZ = new int[10];
		this.anInt6433 = 0;
		this.aClass146Array6441 = new AbstractModel[3];
		this.anInt6435 = 0;
		this.anInt6436 = 0;
		this.aBoolean6442 = false;
		this.aBoolean6440 = false;
		this.aByteArray6443 = new byte[10];
	}

	final void method3042(int i, int i_96_) {
		try {
			RenderAnimDefinitions class294 = getRenderAnimation(1);
			if (class294.anInt2398 != 0 || (this.anInt6414 != 0)) {
				this.aClass325_6399.method3695(i_96_ + 452);
				int i_97_ = (-this.aClass325_6399.anInt2730 + i & 0x3fff);
				if ((~i_97_) < i_96_)
					this.anInt6415 = -16384 - (-i_97_ - this.aClass325_6399.anInt2730);
				else
					this.anInt6415 = this.aClass325_6399.anInt2730 - -i_97_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.P(" + i + ',' + i_96_ + ')');
		}
	}

	final boolean method3043(int i, int i_98_, int i_99_) {
		try {
			if (this.anIntArray6370 == null) {
				if (i_99_ == -1)
					return true;
				this.anIntArray6370 = new int[12];
				for (int i_100_ = 0; i_100_ < 12; i_100_++)
					this.anIntArray6370[i_100_] = -1;
			}
			RenderAnimDefinitions class294 = getRenderAnimation(1);
			if (i != 12)
				method3045((byte) 34, 119);
			int i_101_ = 256;
			if (class294.anIntArray2373 != null && class294.anIntArray2373[i_98_] > 0)
				i_101_ = class294.anIntArray2373[i_98_];
			if (i_99_ == -1) {
				if (this.anIntArray6370[i_98_] == -1)
					return true;
				int i_102_ = this.aClass325_6399.method3698((byte) 116);
				int i_103_ = this.anIntArray6370[i_98_];
				int i_104_ = -i_103_ + i_102_;
				if (-i_101_ <= i_104_ && i_104_ <= i_101_) {
					this.anIntArray6370[i_98_] = -1;
					for (int i_105_ = 0; i_105_ < 12; i_105_++) {
						if ((this.anIntArray6370[i_105_]) != -1)
							return true;
					}
					this.anIntArray6370 = null;
					return true;
				}
				if ((i_104_ <= 0 || i_104_ > 8192) && i_104_ > -8192)
					this.anIntArray6370[i_98_] = Class202.method2702(16383, -i_101_ + i_103_);
				else
					this.anIntArray6370[i_98_] = Class202.method2702(i_101_ + i_103_, 16383);
				return false;
			}
			if (this.anIntArray6370[i_98_] == -1)
				this.anIntArray6370[i_98_] = this.aClass325_6399.method3698((byte) 116);
			int i_106_ = this.anIntArray6370[i_98_];
			int i_107_ = i_99_ + -i_106_;
			if (-i_101_ <= i_107_ && i_107_ <= i_101_) {
				this.anIntArray6370[i_98_] = i_99_;
				return true;
			}
			if ((i_107_ <= 0 || i_107_ > 8192) && i_107_ > -8192)
				this.anIntArray6370[i_98_] = Class202.method2702(16383, i_106_ - i_101_);
			else
				this.anIntArray6370[i_98_] = Class202.method2702(i_101_ + i_106_, 16383);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oi.K(" + i + ',' + i_98_ + ',' + i_99_ + ')'));
		}
	}

	int method3044(boolean bool) {
		try {
			RenderAnimDefinitions class294 = getRenderAnimation(1);
			if (class294.anInt2385 != -1)
				return class294.anInt2385;
			if (this.anInt6352 == -32768)
				return 200;
			if (bool != false)
				return 122;
			return -this.anInt6352;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.B(" + bool + ')');
		}
	}

	final void method3045(byte i, int i_108_) {
		try {
			if (i > 66)
				anInt6395 = i_108_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.E(" + i + ',' + i_108_ + ')');
		}
	}

	final void method3046(int i, AbstractModel class146) {
		try {
			if (i != 758)
				this.anInt6384 = -63;
			int i_109_ = aClass325_6431.anInt2730;
			int i_110_ = aClass325_6432.anInt2730;
			if (i_109_ != 0 || i_110_ != 0) {
				int i_111_ = class146.fa() / 2;
				class146.H(0, -i_111_, 0);
				class146.VA(i_109_ & 0x3fff);
				class146.FA(i_110_ & 0x3fff);
				class146.H(0, i_111_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oi.Q(" + i + ',' + (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3047(int i, boolean bool, int i_112_) {
		try {
			RenderAnimDefinitions class294 = getRenderAnimation(1);
			if (bool || class294.anInt2398 != 0 || (this.anInt6414 != 0)) {
				if (i_112_ < 9)
					this.anInt6391 = 107;
				this.anInt6415 = i & 0x3fff;
				this.aClass325_6399.method3697(true, this.anInt6415);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oi.W(" + i + ',' + bool + ',' + i_112_ + ')'));
		}
	}

	protected final void finalize() {
		try {
			if (this.aClass246_Sub5_6439 != null)
				this.aClass246_Sub5_6439.method3114();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oi.finalize(" + ')');
		}
	}
}
