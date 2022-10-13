/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class333 implements Interface13 {
	static int anInt3385;
	static int anInt3386 = 0;
	int anInt3387;
	int anInt3388;
	float[] aFloatArray3389;
	static int anInt3390 = 0;

	static final void method3761(int i, int[] is, int i_0_, int i_1_, byte i_2_) {
		try {
			int i_3_ = -97 % ((-66 - i_2_) / 57);
			i_0_--;
			int i_4_ = --i_1_ + -7;
			while (i_4_ > i_0_) {
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
			}
			while (i_0_ < i_1_)
				is[++i_0_] = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uh.B(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3762(byte i, boolean bool, Mobile class246_sub3_sub4_sub2) {
		do {
			try {
				RenderAnimDefinitions class294 = class246_sub3_sub4_sub2.getRenderAnimation(1);
				if ((class246_sub3_sub4_sub2.anInt6434) == 0) {
					Class64_Sub23.anInt3708 = -1;
					Class366.anInt3121 = 0;
					class246_sub3_sub4_sub2.anInt6433 = 0;
				} else {
					if ((class246_sub3_sub4_sub2.anInt6413) != -1 && (class246_sub3_sub4_sub2.anInt6400) == 0) {
						Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class246_sub3_sub4_sub2.anInt6413, 16383));
						if (class246_sub3_sub4_sub2.anInt6436 > 0 && class97.anInt821 == 0) {
							class246_sub3_sub4_sub2.anInt6433++;
							Class64_Sub23.anInt3708 = -1;
							Class366.anInt3121 = 0;
							break;
						}
						if (class246_sub3_sub4_sub2.anInt6436 <= 0 && (class97.anInt816 == 0)) {
							Class366.anInt3121 = 0;
							class246_sub3_sub4_sub2.anInt6433++;
							Class64_Sub23.anInt3708 = -1;
							break;
						}
					}
					if ((class246_sub3_sub4_sub2.anInt6379) != -1 && (class246_sub3_sub4_sub2.anInt6391) <= Class215.anInt1614) {
						Class107 class107 = (Class196.aClass304_1509.method3564(2, class246_sub3_sub4_sub2.anInt6379));
						if (class107.aBoolean909 && class107.anInt910 != -1) {
							Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383));
							if (class246_sub3_sub4_sub2.anInt6436 > 0 && class97.anInt821 == 0) {
								class246_sub3_sub4_sub2.anInt6433++;
								Class366.anInt3121 = 0;
								Class64_Sub23.anInt3708 = -1;
								break;
							}
							if (class246_sub3_sub4_sub2.anInt6436 <= 0 && (class97.anInt816 == 0)) {
								class246_sub3_sub4_sub2.anInt6433++;
								Class64_Sub23.anInt3708 = -1;
								Class366.anInt3121 = 0;
								break;
							}
						}
					}
					int i_5_ = -69 / ((-55 - i) / 50);
					if ((class246_sub3_sub4_sub2.anInt6379) != -1 && Class215.anInt1614 >= (class246_sub3_sub4_sub2.anInt6391)) {
						Class107 class107 = (Class196.aClass304_1509.method3564(2, class246_sub3_sub4_sub2.anInt6379));
						if (class107.aBoolean909 && class107.anInt910 != -1) {
							Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383));
							if (class246_sub3_sub4_sub2.anInt6436 > 0 && class97.anInt821 == 0) {
								Class366.anInt3121 = 0;
								class246_sub3_sub4_sub2.anInt6433++;
								Class64_Sub23.anInt3708 = -1;
								break;
							}
							if (class246_sub3_sub4_sub2.anInt6436 <= 0 && (class97.anInt816 == 0)) {
								class246_sub3_sub4_sub2.anInt6433++;
								Class64_Sub23.anInt3708 = -1;
								Class366.anInt3121 = 0;
								break;
							}
						}
					}
					int i_6_ = class246_sub3_sub4_sub2.localXPos;
					int i_7_ = class246_sub3_sub4_sub2.localYPos;
					int i_8_ = (512 * (class246_sub3_sub4_sub2.walkQueueX[-1 + class246_sub3_sub4_sub2.anInt6434]) + 256 * class246_sub3_sub4_sub2.getSize());
					int i_9_ = ((class246_sub3_sub4_sub2.walkQueueZ[-1 + class246_sub3_sub4_sub2.anInt6434]) * 512 - -(class246_sub3_sub4_sub2.getSize() * 256));
					if (i_6_ < i_8_) {
						if (i_7_ >= i_9_) {
							if (i_9_ < i_7_)
								class246_sub3_sub4_sub2.method3042(14336, -8193);
							else
								class246_sub3_sub4_sub2.method3042(12288, -8193);
						} else
							class246_sub3_sub4_sub2.method3042(10240, -8193);
					} else if (i_8_ < i_6_) {
						if (i_7_ < i_9_)
							class246_sub3_sub4_sub2.method3042(6144, -8193);
						else if (i_9_ >= i_7_)
							class246_sub3_sub4_sub2.method3042(4096, -8193);
						else
							class246_sub3_sub4_sub2.method3042(2048, -8193);
					} else if (i_9_ <= i_7_) {
						if (i_9_ < i_7_)
							class246_sub3_sub4_sub2.method3042(0, -8193);
					} else
						class246_sub3_sub4_sub2.method3042(8192, -8193);
					byte i_10_ = (class246_sub3_sub4_sub2.aByteArray6443[class246_sub3_sub4_sub2.anInt6434 + -1]);
					if (!bool && (i_8_ + -i_6_ > 1024 || i_8_ + -i_6_ < -1024 || -i_7_ + i_9_ > 1024 || -i_7_ + i_9_ < -1024)) {
						class246_sub3_sub4_sub2.localXPos = i_8_;
						class246_sub3_sub4_sub2.localYPos = i_9_;
						class246_sub3_sub4_sub2.method3047(class246_sub3_sub4_sub2.anInt6415, false, 75);
						Class64_Sub23.anInt3708 = -1;
						if (class246_sub3_sub4_sub2.anInt6436 > 0)
							class246_sub3_sub4_sub2.anInt6436--;
						class246_sub3_sub4_sub2.anInt6434--;
						Class366.anInt3121 = 0;
					} else {
						int i_11_ = 16;
						boolean bool_12_ = true;
						if (class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub1)
							bool_12_ = ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2).aClass141_6504.aBoolean1126;
						if (!bool_12_) {
							if (!bool && class246_sub3_sub4_sub2.anInt6434 > 1)
								i_11_ = 24;
							if (!bool && class246_sub3_sub4_sub2.anInt6434 > 2)
								i_11_ = 32;
						} else {
							int i_13_ = (-class246_sub3_sub4_sub2.aClass325_6399.anInt2730 + class246_sub3_sub4_sub2.anInt6415);
							if (i_13_ != 0 && class246_sub3_sub4_sub2.anInt6364 == -1 && class246_sub3_sub4_sub2.anInt6414 != 0)
								i_11_ = 8;
							if (!bool && class246_sub3_sub4_sub2.anInt6434 > 2)
								i_11_ = 24;
							if (!bool && class246_sub3_sub4_sub2.anInt6434 > 3)
								i_11_ = 32;
						}
						if (class246_sub3_sub4_sub2.anInt6433 > 0 && class246_sub3_sub4_sub2.anInt6434 > 1) {
							i_11_ = 32;
							class246_sub3_sub4_sub2.anInt6433--;
						}
						if (i_10_ == 2)
							i_11_ <<= 1;
						else if (i_10_ == 0)
							i_11_ >>= 1;
						if (class294.anInt2401 != -1) {
							i_11_ <<= 9;
							if (class246_sub3_sub4_sub2.anInt6434 == 1) {
								int i_14_ = (class246_sub3_sub4_sub2.anInt6435 * class246_sub3_sub4_sub2.anInt6435);
								int i_15_ = ((i_8_ >= class246_sub3_sub4_sub2.localXPos ? i_8_ + -(class246_sub3_sub4_sub2.localXPos) : (class246_sub3_sub4_sub2.localXPos - i_8_)) << 9);
								int i_16_ = ((i_9_ < (class246_sub3_sub4_sub2.localYPos) ? (class246_sub3_sub4_sub2.localYPos + -i_9_) : i_9_ + -(class246_sub3_sub4_sub2.localYPos)) << 9);
								int i_17_ = (i_16_ < i_15_ ? i_15_ : i_16_);
								int i_18_ = (class294.anInt2401 * 2 * i_17_);
								if (i_18_ >= i_14_) {
									if (i_17_ < i_14_ / 2) {
										class246_sub3_sub4_sub2.anInt6435 -= class294.anInt2401;
										if ((class246_sub3_sub4_sub2.anInt6435) < 0)
											class246_sub3_sub4_sub2.anInt6435 = 0;
									} else if (i_11_ > (class246_sub3_sub4_sub2.anInt6435)) {
										class246_sub3_sub4_sub2.anInt6435 += class294.anInt2401;
										if ((class246_sub3_sub4_sub2.anInt6435) > i_11_)
											class246_sub3_sub4_sub2.anInt6435 = i_11_;
									}
								} else
									class246_sub3_sub4_sub2.anInt6435 /= 2;
							} else if (class246_sub3_sub4_sub2.anInt6435 >= i_11_) {
								if (class246_sub3_sub4_sub2.anInt6435 > 0) {
									class246_sub3_sub4_sub2.anInt6435 -= class294.anInt2401;
									if (class246_sub3_sub4_sub2.anInt6435 < 0)
										class246_sub3_sub4_sub2.anInt6435 = 0;
								}
							} else {
								class246_sub3_sub4_sub2.anInt6435 += class294.anInt2401;
								if (i_11_ < class246_sub3_sub4_sub2.anInt6435)
									class246_sub3_sub4_sub2.anInt6435 = i_11_;
							}
							i_11_ = (class246_sub3_sub4_sub2.anInt6435 >> 9);
							if (i_11_ < 1)
								i_11_ = 1;
						}
						Class366.anInt3121 = 0;
						if (i_8_ != i_6_ || i_9_ != i_7_) {
							if (i_6_ < i_8_) {
								class246_sub3_sub4_sub2.localXPos += i_11_;
								Class366.anInt3121 |= 0x4;
								if (class246_sub3_sub4_sub2.localXPos > i_8_)
									class246_sub3_sub4_sub2.localXPos = i_8_;
							} else if (i_6_ > i_8_) {
								Class366.anInt3121 |= 0x8;
								class246_sub3_sub4_sub2.localXPos -= i_11_;
								if ((class246_sub3_sub4_sub2.localXPos) < i_8_)
									class246_sub3_sub4_sub2.localXPos = i_8_;
							}
							if (i_11_ < 32)
								Class64_Sub23.anInt3708 = i_10_;
							else
								Class64_Sub23.anInt3708 = 2;
							if (i_7_ >= i_9_) {
								if (i_7_ > i_9_) {
									Class366.anInt3121 |= 0x2;
									class246_sub3_sub4_sub2.localYPos -= i_11_;
									if (i_9_ > class246_sub3_sub4_sub2.localYPos)
										class246_sub3_sub4_sub2.localYPos = i_9_;
								}
							} else {
								Class366.anInt3121 |= 0x1;
								class246_sub3_sub4_sub2.localYPos += i_11_;
								if (i_9_ < class246_sub3_sub4_sub2.localYPos)
									class246_sub3_sub4_sub2.localYPos = i_9_;
							}
						} else
							Class64_Sub23.anInt3708 = -1;
						if (i_8_ != (class246_sub3_sub4_sub2.localXPos) || i_9_ != (class246_sub3_sub4_sub2.localYPos))
							break;
						if (class246_sub3_sub4_sub2.anInt6436 > 0)
							class246_sub3_sub4_sub2.anInt6436--;
						class246_sub3_sub4_sub2.anInt6434--;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uh.A(" + i + ',' + bool + ',' + ((class246_sub3_sub4_sub2 != null) ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class333(int i, int i_19_) {
		try {
			this.anInt3387 = i_19_;
			this.aFloatArray3389 = new float[i_19_ * i];
			this.anInt3388 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uh.<init>(" + i + ',' + i_19_ + ')'));
		}
	}
}
