/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class349 {
	int[] anIntArray2916;
	String[] aStringArray2917;
	Class98_Sub46_Sub4 aClass98_Sub46_Sub4_2918;
	int anInt2919 = -1;

	static final void method3838(int i, int i_0_) {
		do {
			try {
				Class292.method3446(3);
				int i_1_ = (((Class167) Class134.aClass139_3465.method2282(i, 16)).anInt1283);
				if (i_1_ != 0) {
					int i_2_ = ((VarpClass) Class75.aClass140_584).anIntArray3244[i];
					if (i_0_ == 1864) {
						if ((i_1_ ^ 0xffffffff) == -7)
							Class129.anInt1026 = i_2_;
						if ((i_1_ ^ 0xffffffff) != -6)
							break;
						Map.anInt5303 = i_2_;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vf.F(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	static final float[] method3839(byte i, int i_3_, float f, float f_4_, int i_5_, int i_6_, float f_7_, int i_8_) {
		try {
			float[] fs = new float[9];
			float[] fs_9_ = new float[9];
			float f_10_ = (float) Math.cos((double) ((float) i_3_ * 0.024543693F));
			float f_11_ = (float) Math.sin((double) ((float) i_3_ * 0.024543693F));
			fs[4] = 1.0F;
			fs[1] = 0.0F;
			fs[0] = f_10_;
			fs[8] = f_10_;
			fs[5] = 0.0F;
			float f_12_ = 1.0F - f_10_;
			fs[2] = f_11_;
			fs[6] = -f_11_;
			fs[7] = 0.0F;
			fs[3] = 0.0F;
			float[] fs_13_ = new float[9];
			float f_14_ = 1.0F;
			f_10_ = (float) i_6_ / 32767.0F;
			float f_15_ = 0.0F;
			f_11_ = -(float) Math.sqrt((double) (-(f_10_ * f_10_) + 1.0F));
			f_12_ = 1.0F - f_10_;
			float f_16_ = (float) Math.sqrt((double) (i_5_ * i_5_ + i_8_ * i_8_));
			do {
				if (f_16_ != 0.0F || f_10_ != 0.0F) {
					if (f_16_ != 0.0F) {
						f_14_ = (float) -i_5_ / f_16_;
						f_15_ = (float) i_8_ / f_16_;
					}
					fs_13_[7] = f_11_ * -f_14_;
					fs_13_[3] = f_11_ * -f_15_;
					fs_13_[8] = f_10_ + f_12_ * (f_15_ * f_15_);
					fs_13_[0] = f_10_ + f_14_ * f_14_ * f_12_;
					fs_13_[1] = f_15_ * f_11_;
					fs_13_[6] = f_12_ * (f_14_ * f_15_);
					fs_13_[2] = f_12_ * (f_14_ * f_15_);
					fs_13_[5] = f_11_ * f_14_;
					fs_13_[4] = f_10_;
					fs_9_[0] = (fs[1] * fs_13_[3] + fs[0] * fs_13_[0] + fs_13_[6] * fs[2]);
					fs_9_[1] = fs_13_[7] * fs[2] + (fs_13_[1] * fs[0] + fs_13_[4] * fs[1]);
					fs_9_[2] = fs[2] * fs_13_[8] + (fs_13_[2] * fs[0] + fs_13_[5] * fs[1]);
					fs_9_[3] = fs_13_[6] * fs[5] + (fs[4] * fs_13_[3] + fs[3] * fs_13_[0]);
					fs_9_[4] = fs[5] * fs_13_[7] + (fs[4] * fs_13_[4] + fs[3] * fs_13_[1]);
					fs_9_[6] = fs[8] * fs_13_[6] + (fs_13_[3] * fs[7] + fs[6] * fs_13_[0]);
					fs_9_[5] = fs[5] * fs_13_[8] + (fs_13_[2] * fs[3] + fs[4] * fs_13_[5]);
					fs_9_[7] = (fs[6] * fs_13_[1] + fs[7] * fs_13_[4] + fs[8] * fs_13_[7]);
					fs_9_[8] = fs_13_[8] * fs[8] + (fs_13_[2] * fs[6] + fs_13_[5] * fs[7]);
					if (!client.aBoolean3553)
						break;
				}
				fs_9_ = fs;
			} while (false);
			fs_9_[5] *= f_4_;
			fs_9_[6] *= f_7_;
			fs_9_[1] *= f;
			int i_17_ = 30 % ((17 - i) / 57);
			fs_9_[3] *= f_4_;
			fs_9_[7] *= f_7_;
			fs_9_[2] *= f;
			fs_9_[0] *= f;
			fs_9_[4] *= f_4_;
			fs_9_[8] *= f_7_;
			return fs_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vf.A(" + i + ',' + i_3_ + ',' + f + ',' + f_4_ + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method3840(byte i, AnimableEntity class246_sub3, int i_18_, Class97 class97) {
		try {
			if ((Class306.anInt2566 ^ 0xffffffff) > -51 && (class97 != null && ((Class97) class97).anIntArrayArray822 != null && (((Class97) class97).anIntArrayArray822.length ^ 0xffffffff) < (i_18_ ^ 0xffffffff) && (((Class97) class97).anIntArrayArray822[i_18_] != null))) {
				int i_19_ = ((Class97) class97).anIntArrayArray822[i_18_][0];
				int i_20_ = i_19_ >> -2042241208;
				int i_21_ = (i_19_ & 0xec) >> 515939717;
				int i_22_ = i_19_ & 0x1f;
				if ((((Class97) class97).anIntArrayArray822[i_18_].length ^ 0xffffffff) < -2) {
					int i_23_ = (int) (Math.random() * (double) (((Class97) class97).anIntArrayArray822[i_18_]).length);
					if ((i_23_ ^ 0xffffffff) < -1)
						i_20_ = (((Class97) class97).anIntArrayArray822[i_18_][i_23_]);
				}
				int i_24_ = 256;
				if (((Class97) class97).anIntArray810 != null && ((Class97) class97).anIntArray815 != null)
					i_24_ = (((Class97) class97).anIntArray810[i_18_] + (int) (Math.random() * (double) ((((Class97) class97).anIntArray815[i_18_]) - (((Class97) class97).anIntArray810[i_18_]))));
				int i_25_ = (((Class97) class97).anIntArray808 == null ? 255 : ((Class97) class97).anIntArray808[i_18_]);
				if ((i_22_ ^ 0xffffffff) == -1) {
					if (class246_sub3 == Player.selfPlayer) {
						if (!((Class97) class97).aBoolean812)
							Class301.method3537(i_24_, (byte) 1, i_20_, i_21_, 0, i_25_);
						else
							Class98_Sub10_Sub9.method1036(-1962608884, i_25_, i_21_, i_20_, false, 0, i_24_);
					}
				} else if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4051.method641((byte) 126) ^ 0xffffffff) != -1) {
					int i_26_ = (((AnimableEntity) class246_sub3).localXPos + -256 >> -1601312791);
					if (i < -125) {
						int i_27_ = (((AnimableEntity) class246_sub3).localYPos + -256 >> -1198437175);
						int i_28_ = ((Player.selfPlayer != class246_sub3) ? (i_22_ + (i_26_ << -746666992) + ((((AnimableEntity) class246_sub3).height_level << -1286442696) + (i_27_ << -86127768))) : 0);
						Class245.aClass338Array1865[Class306.anInt2566++] = new Class338((!((Class97) class97).aBoolean812 ? (byte) 1 : (byte) 2), i_20_, i_21_, 0, i_25_, i_28_, i_24_, class246_sub3);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vf.C(" + i + ',' + (class246_sub3 != null ? "{...}" : "null") + ',' + i_18_ + ',' + (class97 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3841(boolean bool, int i, int i_29_, int i_30_, int i_31_, int i_32_) {
		try {
			if (i_29_ == 3113) {
				long l = (long) ((bool ? -2147483648 : 0) | i_30_);
				Class98_Sub3 class98_sub3 = (Class98_Sub3) Class142.aClass377_1157.method3990(l, -1);
				if (class98_sub3 == null) {
					class98_sub3 = new Class98_Sub3();
					Class142.aClass377_1157.method3996(class98_sub3, l, -1);
				}
				if (((Class98_Sub3) class98_sub3).anIntArray3824.length <= i_32_) {
					int[] is = new int[i_32_ + 1];
					int[] is_33_ = new int[1 + i_32_];
					for (int i_34_ = 0; (((Class98_Sub3) class98_sub3).anIntArray3824.length > i_34_); i_34_++) {
						is[i_34_] = (((Class98_Sub3) class98_sub3).anIntArray3824[i_34_]);
						is_33_[i_34_] = (((Class98_Sub3) class98_sub3).anIntArray3823[i_34_]);
					}
					for (int i_35_ = (((Class98_Sub3) class98_sub3).anIntArray3824).length; i_35_ < i_32_; i_35_++) {
						is[i_35_] = -1;
						is_33_[i_35_] = 0;
					}
					((Class98_Sub3) class98_sub3).anIntArray3824 = is;
					((Class98_Sub3) class98_sub3).anIntArray3823 = is_33_;
				}
				((Class98_Sub3) class98_sub3).anIntArray3824[i_32_] = i_31_;
				((Class98_Sub3) class98_sub3).anIntArray3823[i_32_] = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vf.E(" + bool + ',' + i + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'));
		}
	}

	static final boolean method3842(int i, int i_36_, int i_37_) {
		try {
			if (i_37_ != -18021)
				return false;
			if ((0x84080 & i_36_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vf.D(" + i + ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}

	static final byte method3843(byte i, char c) {
		try {
			if (i != 88)
				method3841(false, -74, -7, 18, 107, -123);
			byte i_38_;
			if ((c <= 0 || (c ^ 0xffffffff) <= -129) && (c < 160 || (c ^ 0xffffffff) < -256)) {
				if (c != 8364) {
					if ((c ^ 0xffffffff) == -8219)
						i_38_ = (byte) -126;
					else if (c != 402) {
						if ((c ^ 0xffffffff) == -8223)
							i_38_ = (byte) -124;
						else if ((c ^ 0xffffffff) == -8231)
							i_38_ = (byte) -123;
						else if (c == 8224)
							i_38_ = (byte) -122;
						else if ((c ^ 0xffffffff) == -8226)
							i_38_ = (byte) -121;
						else if (c == 710)
							i_38_ = (byte) -120;
						else if (c != 8240) {
							if (c == 352)
								i_38_ = (byte) -118;
							else if ((c ^ 0xffffffff) == -8250)
								i_38_ = (byte) -117;
							else if ((c ^ 0xffffffff) == -339)
								i_38_ = (byte) -116;
							else if ((c ^ 0xffffffff) == -382)
								i_38_ = (byte) -114;
							else if ((c ^ 0xffffffff) != -8217) {
								if (c != 8217) {
									if (c == 8220)
										i_38_ = (byte) -109;
									else if ((c ^ 0xffffffff) != -8222) {
										if ((c ^ 0xffffffff) == -8227)
											i_38_ = (byte) -107;
										else if (c == 8211)
											i_38_ = (byte) -106;
										else if (c == 8212)
											i_38_ = (byte) -105;
										else if (c != 732) {
											if ((c ^ 0xffffffff) != -8483) {
												if (c != 353) {
													if (c != 8250) {
														if ((c ^ 0xffffffff) != -340) {
															if ((c ^ 0xffffffff) != -383) {
																if (c != 376)
																	i_38_ = (byte) 63;
																else
																	i_38_ = (byte) -97;
															} else
																i_38_ = (byte) -98;
														} else
															i_38_ = (byte) -100;
													} else
														i_38_ = (byte) -101;
												} else
													i_38_ = (byte) -102;
											} else
												i_38_ = (byte) -103;
										} else
											i_38_ = (byte) -104;
									} else
										i_38_ = (byte) -108;
								} else
									i_38_ = (byte) -110;
							} else
								i_38_ = (byte) -111;
						} else
							i_38_ = (byte) -119;
					} else
						i_38_ = (byte) -125;
				} else
					i_38_ = (byte) -128;
			} else
				i_38_ = (byte) c;
			return i_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vf.B(" + i + ',' + c + ')');
		}
	}
}
