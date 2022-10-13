/* Class98_Sub10_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub20 extends Class98_Sub10 {
	private boolean aBoolean5636;
	private int anInt5637 = 4096;
	static boolean[] aBooleanArray5639 = new boolean[100];
	static int anInt5640 = 0;

	public Class98_Sub10_Sub20() {
		super(1, false);
		aBoolean5636 = true;
	}

	static final void method1060(int i, int i_0_, Class98_Sub22_Sub1 class98_sub22_sub1) {
		do {
			try {
				boolean bool = class98_sub22_sub1.readBits((byte) -110, 1) == 1;
				if (bool)
					Class65.anIntArray501[Class38.anInt354++] = i;
				int i_1_ = class98_sub22_sub1.readBits((byte) -48, 2);
				Player class246_sub3_sub4_sub2_sub2 = Class151_Sub9.playerArray[i];
				if (i_1_ == 0) {
					if (bool)
						class246_sub3_sub4_sub2_sub2.aBoolean6532 = false;
					else {
						if (za_Sub2.anInt6080 == i)
							throw new RuntimeException("s:lr");
						Class376 class376 = Class306.aClass376Array2562[i] = new Class376();
						class376.anInt3176 = (((aa_Sub2.anInt3562 + (class246_sub3_sub4_sub2_sub2.walkQueueZ[0])) >> 6) + ((class246_sub3_sub4_sub2_sub2.walkQueueX[0]) + Class272.anInt2038 >> 6 << 14) + (class246_sub3_sub4_sub2_sub2.height_level << 28));
						if (class246_sub3_sub4_sub2_sub2.anInt6512 != -1)
							class376.anInt3172 = class246_sub3_sub4_sub2_sub2.anInt6512;
						else
							class376.anInt3172 = class246_sub3_sub4_sub2_sub2.aClass325_6399.method3698((byte) 116);
						class376.aBoolean3175 = class246_sub3_sub4_sub2_sub2.aBoolean6534;
						class376.anInt3177 = class246_sub3_sub4_sub2_sub2.anInt6364;
						if (class246_sub3_sub4_sub2_sub2.ambientSoundHearDistance > 0)
							Class213.removePlayerAmbientSound(true, class246_sub3_sub4_sub2_sub2);
						Class151_Sub9.playerArray[i] = null;
						if (class98_sub22_sub1.readBits((byte) -105, 1) != 0)
							Class351.method3845(i_0_ + -14, i, class98_sub22_sub1);
					}
				} else if (i_1_ == 1) {
					int i_2_ = class98_sub22_sub1.readBits((byte) -46, 3);
					int i_3_ = (class246_sub3_sub4_sub2_sub2.walkQueueX[0]);
					int i_4_ = (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]);
					if (i_2_ == 0) {
						i_3_--;
						i_4_--;
					} else if (i_2_ != 1) {
						if (i_2_ != 2) {
							if (i_2_ == 3)
								i_3_--;
							else if (i_2_ == 4)
								i_3_++;
							else if (i_2_ == 5) {
								i_4_++;
								i_3_--;
							} else if (i_2_ != 6) {
								if (i_2_ == 7) {
									i_3_++;
									i_4_++;
								}
							} else
								i_4_++;
						} else {
							i_4_--;
							i_3_++;
						}
					} else
						i_4_--;
					if (!bool)
						class246_sub3_sub4_sub2_sub2.method3057(i_3_, i_4_, Class98_Sub10_Sub21.aByteArray5642[i], i_0_ ^ ~0xc);
					else {
						class246_sub3_sub4_sub2_sub2.anInt6541 = i_4_;
						class246_sub3_sub4_sub2_sub2.aBoolean6532 = true;
						class246_sub3_sub4_sub2_sub2.anInt6521 = i_3_;
					}
				} else if (i_1_ == 2) {
					int dir = class98_sub22_sub1.readBits((byte) -85, 4);
					int dx = (class246_sub3_sub4_sub2_sub2.walkQueueX[0]);
					int dy = (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]);
					if (dir != 0) {
						if (dir == 1) {
							dx--;
							dy -= 2;
						} else if (dir != 2) {
							if (dir == 3) {
								dx++;
								dy -= 2;
							} else if (dir == 4) {
								dy -= 2;
								dx += 2;
							} else if (dir != 5) {
								if (dir != 6) {
									if (dir != 7) {
										if (dir == 8)
											dx += 2;
										else if (dir == 9) {
											dx -= 2;
											dy++;
										} else if (dir != 10) {
											if (dir == 11) {
												dx -= 2;
												dy += 2;
											} else if (dir == 12) {
												dx--;
												dy += 2;
											} else if (dir == 13)
												dy += 2;
											else if (dir != 14) {
												if (dir == 15) {
													dy += 2;
													dx += 2;
												}
											} else {
												dy += 2;
												dx++;
											}
										} else {
											dy++;
											dx += 2;
										}
									} else
										dx -= 2;
								} else {
									dy--;
									dx += 2;
								}
							} else {
								dy--;
								dx -= 2;
							}
						} else
							dy -= 2;
					} else {
						dx -= 2;
						dy -= 2;
					}
					if (!bool)
						class246_sub3_sub4_sub2_sub2.method3057(dx, dy, Class98_Sub10_Sub21.aByteArray5642[i], i_0_ + -13);
					else {
						class246_sub3_sub4_sub2_sub2.anInt6541 = dy;
						class246_sub3_sub4_sub2_sub2.aBoolean6532 = true;
						class246_sub3_sub4_sub2_sub2.anInt6521 = dx;
					}
				} else {
					int i_8_ = class98_sub22_sub1.readBits((byte) -53, 1);
					if (i_8_ == 0) {
						int i_9_ = class98_sub22_sub1.readBits((byte) -102, 12);
						int i_10_ = i_9_ >> 10;
						int i_11_ = (i_9_ & 0x3e0) >> 5;
						if (i_11_ > 15)
							i_11_ -= 32;
						int i_12_ = i_9_ & 0x1f;
						if (i_12_ > 15)
							i_12_ -= 32;
						int i_13_ = i_11_ + (class246_sub3_sub4_sub2_sub2.walkQueueX[0]);
						int i_14_ = (class246_sub3_sub4_sub2_sub2.walkQueueZ[0] - -i_12_);
						if (bool) {
							class246_sub3_sub4_sub2_sub2.anInt6521 = i_13_;
							class246_sub3_sub4_sub2_sub2.aBoolean6532 = true;
							class246_sub3_sub4_sub2_sub2.anInt6541 = i_14_;
						} else
							class246_sub3_sub4_sub2_sub2.method3057(i_13_, i_14_, Class98_Sub10_Sub21.aByteArray5642[i], -1);
						class246_sub3_sub4_sub2_sub2.height_level = class246_sub3_sub4_sub2_sub2.aByte5081 = (byte) (0x3 & i_10_ + (class246_sub3_sub4_sub2_sub2.height_level));
						if (Class1.method162(i_14_, (byte) -102, i_13_))
							class246_sub3_sub4_sub2_sub2.aByte5081++;
						if (za_Sub2.anInt6080 == i) {
							if ((class246_sub3_sub4_sub2_sub2.height_level) != Class43.anInt377)
								Class358.aBoolean3033 = true;
							Class43.anInt377 = class246_sub3_sub4_sub2_sub2.height_level;
						}
					} else {
						int i_15_ = class98_sub22_sub1.readBits((byte) -103, 30);
						int i_16_ = i_15_ >> 28;
						int i_17_ = 0x3fff & i_15_ >> 14;
						int i_18_ = i_15_ & 0x3fff;
						int i_19_ = i_17_ - Class272.anInt2038;
						int i_20_ = i_18_ - aa_Sub2.anInt3562;
						if (bool) {
							class246_sub3_sub4_sub2_sub2.anInt6541 = i_20_;
							class246_sub3_sub4_sub2_sub2.anInt6521 = i_19_;
							class246_sub3_sub4_sub2_sub2.aBoolean6532 = true;
						} else
							class246_sub3_sub4_sub2_sub2.method3057(i_19_, i_20_, Class98_Sub10_Sub21.aByteArray5642[i], -1);
						class246_sub3_sub4_sub2_sub2.height_level = (byte) i_16_;

						if (Class1.method162(i_20_, (byte) -95, i_19_))
							class246_sub3_sub4_sub2_sub2.aByte5081++;
						if (i == za_Sub2.anInt6080)
							Class43.anInt377 = class246_sub3_sub4_sub2_sub2.height_level;
						if (i_0_ == 12)
							break;
						IncomingOpcode.aClass58_5635 = null;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ma.D(" + i + ',' + i_0_ + ',' + (class98_sub22_sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_21_) {
		do {
			try {
				int i_22_ = i;
				do {
					if (i_22_ != 0) {
						if (i_22_ != 1)
							break;
					} else {
						anInt5637 = class98_sub22.readShort();
						break;
					}
					aBoolean5636 = class98_sub22.readUnsignedByte() == 1;
				} while (false);
				if (i_21_ <= -92)
					break;
				method991(124, null, (byte) 77);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ma.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_21_ + ')'));
			}
			break;
		} while (false);
	}

	static final byte[] method1061(int i, int i_23_, int i_24_, Object object) {
		try {
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				return Class98_Sub23.method1268(i_23_, i_24_, is, (byte) 50);
			}
			if (i != 2)
				method1061(-113, -64, 86, null);
			if (object instanceof Class317) {
				Class317 class317 = (Class317) object;
				return class317.method3653(i_24_, i_23_, false);
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ma.E(" + i + ',' + i_23_ + ',' + i_24_ + ',' + (object != null ? "{...}" : "null") + ')'));
		}
	}

	final int[][] method997(int i, int i_25_) {
		try {
			if (i > -76)
				return null;
			int[][] is = this.aClass223_3859.method2828(i_25_, 0);
			if (this.aClass223_3859.aBoolean1683) {
				int[] is_26_ = this.method1000(i_25_ + -1 & za_Sub1.anInt6075, 0, 0);
				int[] is_27_ = this.method1000(i_25_, 0, 0);
				int[] is_28_ = this.method1000(za_Sub1.anInt6075 & i_25_ + 1, 0, 0);
				int[] is_29_ = is[0];
				int[] is_30_ = is[1];
				int[] is_31_ = is[2];
				for (int i_32_ = 0; i_32_ < Class25.anInt268; i_32_++) {
					int i_33_ = anInt5637 * (is_28_[i_32_] - is_26_[i_32_]);
					int i_34_ = ((-is_27_[i_32_ - 1 & Class329.anInt2761] + is_27_[1 + i_32_ & Class329.anInt2761]) * anInt5637);
					int i_35_ = i_34_ >> 12;
					int i_36_ = i_33_ >> 12;
					int i_37_ = i_35_ * i_35_ >> 12;
					int i_38_ = i_36_ * i_36_ >> 12;
					int i_39_ = (int) (Math.sqrt((float) (4096 + (i_38_ + i_37_)) / 4096.0F) * 4096.0);
					int i_40_;
					int i_41_;
					int i_42_;
					if (i_39_ != 0) {
						i_41_ = i_34_ / i_39_;
						i_40_ = 16777216 / i_39_;
						i_42_ = i_33_ / i_39_;
					} else {
						i_40_ = 0;
						i_41_ = 0;
						i_42_ = 0;
					}
					if (aBoolean5636) {
						i_41_ = 2048 - -(i_41_ >> 1);
						i_42_ = (i_42_ >> 1) + 2048;
						i_40_ = (i_40_ >> 1) + 2048;
					}
					is_29_[i_32_] = i_41_;
					is_30_[i_32_] = i_42_;
					is_31_[i_32_] = i_40_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ma.C(" + i + ',' + i_25_ + ')');
		}
	}

	public static void method1062(int i) {
		do {
			try {
				IncomingOpcode.aClass58_5635 = null;
				aBooleanArray5639 = null;
				IncomingOpcode.aClass58_5638 = null;
				if (i == 0)
					break;
				method1062(97);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ma.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
