/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class21 implements Interface4 {
	static int[] anIntArray3232 = new int[4];
	ha_Sub3_Sub2 aHa_Sub3_Sub2_3233;
	Class162 aClass162_3234;
	int anInt3235;
	private int anInt3236;
	Class164 aClass164_3237;
	private int anInt3238;
	private Class200 aClass200_3239 = Class284_Sub1_Sub1.aClass200_6187;
	private boolean aBoolean3240;

	final void method256(int i, float[] fs, boolean bool, int i_0_, int i_1_) {
		try {
			if (i > 0 && !Class81.method815(i, 0))
				throw new IllegalArgumentException("");
			if (i_0_ > 0 && !Class81.method815(i_0_, 0))
				throw new IllegalArgumentException("");
			int i_2_ = this.aClass164_3237.anInt1275;
			if (bool == false) {
				int i_3_ = 0;
				int i_4_ = i < i_0_ ? i : i_0_;
				int i_5_ = i >> 1;
				int i_6_ = i_0_ >> 1;
				float[] fs_7_ = fs;
				float[] fs_8_ = new float[i_5_ * i_6_ * i_2_];
				for (;;) {
					OpenGL.glTexImage2Df(i_1_, i_3_, method260(0), i, i_0_, 0, Class196.method2665(false, this.aClass164_3237), 5126, fs_7_, 0);
					if (i_4_ <= 1)
						break;
					int i_9_ = i * i_2_;
					for (int i_10_ = 0; i_2_ > i_10_; i_10_++) {
						int i_11_ = i_10_;
						int i_12_ = i_10_;
						int i_13_ = i_12_ - -i_9_;
						for (int i_14_ = 0; i_6_ > i_14_; i_14_++) {
							for (int i_15_ = 0; i_15_ < i_5_; i_15_++) {
								float f = fs_7_[i_12_];
								i_12_ += i_2_;
								f += fs_7_[i_12_];
								i_12_ += i_2_;
								f += fs_7_[i_13_];
								i_13_ += i_2_;
								f += fs_7_[i_13_];
								fs_8_[i_11_] = 0.25F * f;
								i_13_ += i_2_;
								i_11_ += i_2_;
							}
							i_13_ += i_9_;
							i_12_ += i_9_;
						}
					}
					float[] fs_16_ = fs_8_;
					fs_8_ = fs_7_;
					i = i_5_;
					i_0_ = i_6_;
					fs_7_ = fs_16_;
					i_3_++;
					i_4_ >>= 1;
					i_6_ >>= 1;
					i_5_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bj.AA(" + i + ',' + (fs != null ? "{...}" : "null") + ',' + bool + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method257(int i) {
		do {
			try {
				anIntArray3232 = null;
				if (i == 0)
					break;
				method263(-76, -123);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bj.S(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method5(int i) {
		try {
			if (i > 14) {
				int i_17_ = this.aHa_Sub3_Sub2_3233.method1967(109);
				int i_18_ = (this.aHa_Sub3_Sub2_3233.anIntArray6139[i_17_]);
				if (this.anInt3235 != i_18_) {
					if (i_18_ != 0) {
						OpenGL.glBindTexture(i_18_, 0);
						OpenGL.glDisable(i_18_);
					}
					OpenGL.glEnable(this.anInt3235);
					this.aHa_Sub3_Sub2_3233.anIntArray6139[i_17_] = this.anInt3235;
				}
				OpenGL.glBindTexture(this.anInt3235, anInt3238);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bj.I(" + i + ')');
		}
	}

	private final void method258(byte i) {
		do {
			try {
				if (i != -75)
					aBoolean3240 = false;
				if (anInt3238 <= 0)
					break;
				this.aHa_Sub3_Sub2_3233.method2083(-80, anInt3238, method261((byte) -95));
				anInt3238 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bj.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() throws Throwable {
		try {
			method258((byte) -75);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bj.finalize(" + ')');
		}
	}

	public final void method4(byte i, Class200 class200) {
		do {
			try {
				if (i == -81) {
					if (aClass200_3239 == class200)
						break;
					aClass200_3239 = class200;
					method265(14093);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("bj.B(" + i + ',' + (class200 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method259(byte[] is, int i, int i_19_, int i_20_, int i_21_) {
		try {
			if (i_20_ > 0 && !Class81.method815(i_20_, 0))
				throw new IllegalArgumentException("");
			if (i_19_ > 0 && !Class81.method815(i_19_, 0))
				throw new IllegalArgumentException("");
			int i_22_ = this.aClass164_3237.anInt1275;
			int i_23_ = 0;
			if (i <= 0)
				this.aClass164_3237 = null;
			int i_24_ = i_19_ <= i_20_ ? i_19_ : i_20_;
			int i_25_ = i_20_ >> 1;
			int i_26_ = i_19_ >> 1;
			byte[] is_27_ = is;
			byte[] is_28_ = new byte[i_25_ * (i_26_ * i_22_)];
			for (;;) {
				OpenGL.glTexImage2Dub(i_21_, i_23_, method260(0), i_20_, i_19_, 0, Class196.method2665(false, (this.aClass164_3237)), 5121, is_27_, 0);
				if (i_24_ <= 1)
					break;
				int i_29_ = i_20_ * i_22_;
				byte[] is_30_ = is_28_;
				for (int i_31_ = 0; i_22_ > i_31_; i_31_++) {
					int i_32_ = i_31_;
					int i_33_ = i_31_;
					int i_34_ = i_29_ + i_33_;
					for (int i_35_ = 0; i_26_ > i_35_; i_35_++) {
						for (int i_36_ = 0; i_36_ < i_25_; i_36_++) {
							int i_37_ = is_27_[i_33_];
							i_33_ += i_22_;
							i_37_ += is_27_[i_33_];
							i_37_ += is_27_[i_34_];
							i_33_ += i_22_;
							i_34_ += i_22_;
							i_37_ += is_27_[i_34_];
							i_34_ += i_22_;
							is_28_[i_32_] = (byte) (i_37_ >> 2);
							i_32_ += i_22_;
						}
						i_33_ += i_29_;
						i_34_ += i_29_;
					}
				}
				is_28_ = is_27_;
				is_27_ = is_30_;
				i_20_ = i_25_;
				i_19_ = i_26_;
				i_26_ >>= 1;
				i_23_++;
				i_25_ >>= 1;
				i_24_ >>= 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bj.U(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ')'));
		}
	}

	final int method260(int i) {
		try {
			if (i != 0)
				method266(94, (byte) -47);
			if (Class162.aClass162_1266 == this.aClass162_3234) {
				if (Class98_Sub40.aClass164_4190 == this.aClass164_3237)
					return 6407;
				if (this.aClass164_3237 != Class62.aClass164_486) {
					if (Class53_Sub1.aClass164_3633 == this.aClass164_3237)
						return 6406;
					if (this.aClass164_3237 != Class98_Sub30.aClass164_4088) {
						if (this.aClass164_3237 != Class74.aClass164_547) {
							if (this.aClass164_3237 == Class280.aClass164_2101)
								return 6145;
						} else
							return 6410;
					} else
						return 6409;
				} else
					return 6408;
			} else if (Class162.aClass162_1269 == this.aClass162_3234) {
				if (this.aClass164_3237 != Class98_Sub40.aClass164_4190) {
					if (Class62.aClass164_486 == this.aClass164_3237)
						return 34842;
					if (this.aClass164_3237 == Class53_Sub1.aClass164_3633)
						return 34844;
					if (this.aClass164_3237 == Class98_Sub30.aClass164_4088)
						return 34846;
					if (this.aClass164_3237 == Class74.aClass164_547)
						return 34847;
					if (Class280.aClass164_2101 == this.aClass164_3237)
						return 6145;
				} else
					return 34843;
			} else if (Class162.aClass162_1270 == this.aClass162_3234) {
				if (Class98_Sub40.aClass164_4190 != this.aClass164_3237) {
					if (Class62.aClass164_486 == this.aClass164_3237)
						return 34836;
					if (Class53_Sub1.aClass164_3633 == this.aClass164_3237)
						return 34838;
					if (Class98_Sub30.aClass164_4088 == this.aClass164_3237)
						return 34840;
					if (Class74.aClass164_547 == this.aClass164_3237)
						return 34841;
					if (this.aClass164_3237 == Class280.aClass164_2101)
						return 6145;
				} else
					return 34837;
			}
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bj.P(" + i + ')');
		}
	}

	private final int method261(byte i) {
		try {
			int i_38_ = 119 % ((-56 - i) / 35);
			int i_39_ = (this.aClass162_3234.anInt1263 * (this.aClass164_3237.anInt1275 * anInt3236));
			if (aBoolean3240)
				return i_39_ * 4 / 3;
			return i_39_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bj.CA(" + i + ')');
		}
	}

	static final String method262(Class98_Sub46_Sub9 class98_sub46_sub9, byte i) {
		try {
			if (i <= 11)
				anIntArray3232 = null;
			return (class98_sub46_sub9.aString5998 + " <col=ffffff>>");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bj.T(" + (class98_sub46_sub9 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final Class66 method263(int i, int i_40_) {
		try {
			if (i_40_ != 31866)
				method263(20, 98);
			Class66 class66 = (Class66) RuntimeException_Sub1.aClass79_3204.get(i);
			if (class66 != null)
				return class66;
			byte[] is = Class64_Sub3.aClass207_3648.readArchive(i, 1);
			class66 = new Class66();
			class66.anInt509 = i;
			if (is != null)
				class66.method682(new RSByteBuffer(is), i_40_ + -14739);
			class66.method685(i_40_ + -31865);
			if (class66.anInt508 == 2 && RenderAnimDefinitions.aClass377_2397.method3990(i, -1) == null) {
				RenderAnimDefinitions.aClass377_2397.method3996(new Class98_Sub34(Class64_Sub19.anInt3693), i, -1);
				Class336.aClass66Array2828[Class64_Sub19.anInt3693++] = class66;
			}
			RuntimeException_Sub1.aClass79_3204.put(i, class66);
			return class66;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bj.BA(" + i + ',' + i_40_ + ')');
		}
	}

	final void method264(int i, int[] is, int i_41_, int i_42_, int i_43_) {
		try {
			if (i > 0 && !Class81.method815(i, 0))
				throw new IllegalArgumentException("");
			if (i_41_ > 0 && !Class81.method815(i_41_, 0))
				throw new IllegalArgumentException("");
			if (this.aClass164_3237 != Class62.aClass164_486)
				throw new IllegalArgumentException("");
			int i_44_ = 0;
			int i_45_ = i < i_41_ ? i : i_41_;
			int i_46_ = i >> 1;
			int i_47_ = i_41_ >> 1;
			if (i_42_ != 526364520)
				method264(-17, null, 58, 71, 102);
			int[] is_48_ = is;
			int[] is_49_ = new int[i_47_ * i_46_];
			for (;;) {
				OpenGL.glTexImage2Di(i_43_, i_44_, method260(0), i, i_41_, 0, 32993, (this.aHa_Sub3_Sub2_3233.anInt6135), is_48_, 0);
				if (i_45_ <= 1)
					break;
				int i_50_ = 0;
				int i_51_ = 0;
				int i_52_ = i_51_ + i;
				for (int i_53_ = 0; i_53_ < i_47_; i_53_++) {
					for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
						int i_55_ = is_48_[i_51_++];
						int i_56_ = is_48_[i_51_++];
						int i_57_ = is_48_[i_52_++];
						int i_58_ = 0xff & i_55_ >> 8;
						int i_59_ = i_55_ & 0xff;
						int i_60_ = 0xff & i_55_ >> 16;
						int i_61_ = 0xff & i_55_ >> 24;
						int i_62_ = is_48_[i_52_++];
						i_60_ += (0xff9127 & i_56_) >> 16;
						i_58_ += i_56_ >> 8 & 0xff;
						i_61_ += i_56_ >> 24 & 0xff;
						i_59_ += 0xff & i_56_;
						i_59_ += i_57_ & 0xff;
						i_58_ += 0xff & i_57_ >> 8;
						i_61_ += 0xff & i_57_ >> 24;
						i_60_ += (i_57_ & 0xff9e4b) >> 16;
						i_59_ += 0xff & i_62_;
						i_58_ += (0xff51 & i_62_) >> 8;
						i_61_ += 0xff & i_62_ >> 24;
						i_60_ += 0xff & i_62_ >> 16;
						is_49_[i_50_++] = (Class41.method366((Class202.method2702(1020, i_59_) >> 2), (Class41.method366(Class41.method366((Class202.method2702(1020, i_61_) << 22), (Class202.method2702(1020, i_60_) << 14)), (Class202.method2702(1020, i_58_) << 6)))));
					}
					i_51_ += i;
					i_52_ += i;
				}
				int[] is_63_ = is_49_;
				is_49_ = is_48_;
				i = i_46_;
				i_41_ = i_47_;
				is_48_ = is_63_;
				i_47_ >>= 1;
				i_46_ >>= 1;
				i_45_ >>= 1;
				i_44_++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bj.W(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ')'));
		}
	}

	private final void method265(int i) {
		try {
			this.aHa_Sub3_Sub2_3233.method2005(this, -122);
			if (i == 14093) {
				if (Class284_Sub1_Sub1.aClass200_6187 != aClass200_3239) {
					OpenGL.glTexParameteri(this.anInt3235, 10241, !aBoolean3240 ? 9728 : 9984);
					OpenGL.glTexParameteri(this.anInt3235, 10240, 9728);
				} else {
					OpenGL.glTexParameteri(this.anInt3235, 10241, aBoolean3240 ? 9987 : 9729);
					OpenGL.glTexParameteri(this.anInt3235, 10240, 9729);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bj.R(" + i + ')');
		}
	}

	Class21(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i, Class164 class164, Class162 class162, int i_64_, boolean bool) {
		try {
			this.anInt3235 = i;
			this.aClass164_3237 = class164;
			this.aClass162_3234 = class162;
			aBoolean3240 = bool;
			this.aHa_Sub3_Sub2_3233 = var_ha_Sub3_Sub2;
			anInt3236 = i_64_;
			OpenGL.glGenTextures(1, Class342.anIntArray2860, 0);
			anInt3238 = Class342.anIntArray2860[0];
			method265(14093);
			method266(0, (byte) 123);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bj.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (class164 != null ? "{...}" : "null") + ',' + (class162 != null ? "{...}" : "null") + ',' + i_64_ + ',' + bool + ')'));
		}
	}

	private final void method266(int i, byte i_65_) {
		try {
			if (i_65_ <= 107)
				this.aClass162_3234 = null;
			this.aHa_Sub3_Sub2_3233.anInt4541 -= i;
			this.aHa_Sub3_Sub2_3233.anInt4541 += method261((byte) -91);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bj.V(" + i + ',' + i_65_ + ')');
		}
	}
}
