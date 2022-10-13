/* Class246_Sub3_Sub4_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub4_Sub2_Sub1 extends Mobile {
	static int anInt6500 = -1;
	int anInt6501 = 1;
	Class40 aClass40_6502;
	int anInt6503 = 1;
	Class141 aClass141_6504;
	int anInt6505 = -1;
	static OutgoingOpcode aClass171_6506 = new OutgoingOpcode(5, 2);
	static String aString6507;
	static Class332 aClass332_6508;
	static int anInt6509;
	int anInt6510 = -1;
	static int anInt6511;

	final void method2988(ha var_ha, int i) {
		try {
			if (this.aClass141_6504 != null && (this.aBoolean6440 || method3048(var_ha, 255, 0))) {
				Class111 class111 = var_ha.method1793();
				class111.method2101(this.aClass325_6399.method3698((byte) 116));
				class111.method2106(this.localXPos, this.anInt5089 - 20, this.localYPos);
				this.method3036(var_ha, this.aBoolean6440, (byte) -119, class111, (this.aClass146Array6441));
				this.aClass146Array6441[0] = this.aClass146Array6441[1] = this.aClass146Array6441[2] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cea.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final boolean method3048(ha var_ha, int i, int i_1_) {
		try {
			int i_2_ = i_1_;
			RenderAnimDefinitions class294 = this.getRenderAnimation(1);
			if (i != 255)
				aString6507 = null;
			Class97 class97 = ((this.anInt6413 != -1 && this.anInt6400 == 0) ? (Class151_Sub7.aClass183_5001.method2623(this.anInt6413, i ^ 0x3f00)) : null);
			Class97 class97_3_ = (((this.anInt6385 == -1) || (this.aBoolean6359 && class97 != null)) ? null : (Class151_Sub7.aClass183_5001.method2623(this.anInt6385, 16383)));
			int i_4_ = class294.anInt2362;
			int i_5_ = class294.anInt2382;
			if (i_4_ != 0 || i_5_ != 0 || class294.anInt2393 != 0 || class294.anInt2363 != 0)
				i_1_ |= 0x7;
			boolean bool = (this.aByte6422 != 0 && (Class215.anInt1614 >= this.anInt6403) && (this.anInt6349 > Class215.anInt1614));
			if (bool)
				i_1_ |= 0x80000;
			int i_6_ = this.aClass325_6399.method3698((byte) 116);
			AbstractModel class146 = (this.aClass146Array6441[0] = (this.aClass141_6504.method2301(this.anInt6393, i_6_, this.anIntArray6370, this.anInt6350, (byte) 100, class97, this.aClass226Array6387, var_ha, this.anInt6409, this.anInt6361, Class75.aClass140_584, this.aClass40_6502, this.anInt6366, Class370.aClass257_3136, i_1_, this.anInt6419, Class151_Sub7.aClass183_5001, class97_3_)));
			if (class146 == null)
				return false;
			this.anInt6352 = class146.fa();
			this.anInt6354 = class146.ma();
			this.method3046(758, class146);
			if (i_4_ != 0 || i_5_ != 0) {
				this.method3040(false, class294.anInt2360, i_4_, i_5_, i_6_, class294.anInt2391);
				if (this.anInt6388 != 0)
					this.aClass146Array6441[0].FA(this.anInt6388);
				if (this.anInt6377 != 0)
					this.aClass146Array6441[0].VA(this.anInt6377);
				if (this.anInt6416 != 0)
					this.aClass146Array6441[0].H(0, this.anInt6416, 0);
			} else
				this.method3040(false, 0, this.getSize() << 9, this.getSize() << 9, i_6_, 0);
			if (bool)
				class146.method2337(this.aByte6404, this.aByte6381, this.aByte6368, (this.aByte6422 & 0xff));
			if (this.anInt6379 == -1 || (this.anInt6376 == -1))
				this.aClass146Array6441[1] = null;
			else {
				Class107 class107 = (Class196.aClass304_1509.method3564(i + -253, this.anInt6379));
				boolean bool_7_ = (class107.aByte923 == 3 && (i_4_ != 0 || i_5_ != 0));
				int i_8_ = i_2_;
				if (!bool_7_) {
					if (this.anInt6389 != 0)
						i_8_ |= 0x5;
					if (this.anInt6382 != 0)
						i_8_ |= 0x2;
					if (this.anInt6410 >= 0)
						i_8_ |= 0x7;
				} else
					i_8_ |= 0x7;
				AbstractModel class146_9_ = (this.aClass146Array6441[1] = (class107.method1728(this.anInt6376, Class151_Sub7.aClass183_5001, i_8_, this.anInt6396, (byte) 66, this.anInt6367, var_ha)));
				if (class146_9_ != null) {
					if (this.anInt6410 < 0) {
						if (this.anInt6389 != 0)
							class146_9_.a(2048 * this.anInt6389);
					} else {
						int i_10_ = 0;
						int i_11_ = 0;
						int i_12_ = 0;
						if (class294.anIntArrayArray2366 != null && ((class294.anIntArrayArray2366[this.anInt6410]) != null)) {
							i_11_ += (class294.anIntArrayArray2366[(this.anInt6410)][1]);
							i_12_ += (class294.anIntArrayArray2366[(this.anInt6410)][2]);
							i_10_ += (class294.anIntArrayArray2366[(this.anInt6410)][0]);
						}
						if (class294.anIntArrayArray2364 != null && ((class294.anIntArrayArray2364[this.anInt6410]) != null)) {
							i_10_ += (class294.anIntArrayArray2364[(this.anInt6410)][0]);
							i_11_ += (class294.anIntArrayArray2364[(this.anInt6410)][1]);
							i_12_ += (class294.anIntArrayArray2364[(this.anInt6410)][2]);
						}
						if (i_12_ != 0 || i_10_ != 0) {
							int i_13_ = i_6_;
							if ((this.anIntArray6370) != null && (this.anIntArray6370[(this.anInt6410)]) != -1)
								i_13_ = (this.anIntArray6370[(this.anInt6410)]);
							int i_14_ = (i_13_ + (2048 * this.anInt6389 - i_6_) & 0x3fff);
							if (i_14_ != 0)
								class146_9_.a(i_14_);
							int i_15_ = Class284_Sub2_Sub2.anIntArray6200[i_14_];
							int i_16_ = Class284_Sub2_Sub2.anIntArray6202[i_14_];
							int i_17_ = i_10_ * i_16_ + i_15_ * i_12_ >> 14;
							i_12_ = (-(i_10_ * i_15_) + i_12_ * i_16_ >> 14);
							i_10_ = i_17_;
						}
						class146_9_.H(i_10_, i_11_, i_12_);
					}
					if (this.anInt6382 != 0)
						class146_9_.H(0, -(this.anInt6382) << 2, 0);
					if (bool_7_) {
						if (this.anInt6388 != 0)
							class146_9_.FA(this.anInt6388);
						if (this.anInt6377 != 0)
							class146_9_.VA(this.anInt6377);
						if (this.anInt6416 != 0)
							class146_9_.H(0, (this.anInt6416), 0);
					}
				}
			}
			if (this.anInt6365 == -1 || this.anInt6428 == -1)
				this.aClass146Array6441[2] = null;
			else {
				Class107 class107 = (Class196.aClass304_1509.method3564(2, this.anInt6365));
				boolean bool_18_ = (class107.aByte923 == 3 && (i_4_ != 0 || i_5_ != 0));
				int i_19_ = i_2_;
				if (!bool_18_) {
					if (this.anInt6360 != 0)
						i_19_ |= 0x5;
					if (this.anInt6363 != 0)
						i_19_ |= 0x2;
					if (this.anInt6353 >= 0)
						i_19_ |= 0x7;
				} else
					i_19_ |= 0x7;
				AbstractModel class146_20_ = (this.aClass146Array6441[2] = (class107.method1721(var_ha, this.anInt6421, 21945, i_19_, Class151_Sub7.aClass183_5001, this.anInt6427, this.anInt6428)));
				if (class146_20_ != null) {
					if (this.anInt6353 < 0 || class294.anIntArrayArray2366 == null || ((class294.anIntArrayArray2366[this.anInt6353]) == null)) {
						if (this.anInt6360 != 0)
							class146_20_.a(2048 * this.anInt6360);
					} else {
						int i_21_ = 0;
						int i_22_ = 0;
						int i_23_ = 0;
						if (class294.anIntArrayArray2366 != null && ((class294.anIntArrayArray2366[this.anInt6353]) != null)) {
							i_21_ += (class294.anIntArrayArray2366[(this.anInt6353)][0]);
							i_22_ += (class294.anIntArrayArray2366[(this.anInt6353)][1]);
							i_23_ += (class294.anIntArrayArray2366[(this.anInt6353)][2]);
						}
						if (class294.anIntArrayArray2364 != null && ((class294.anIntArrayArray2364[this.anInt6353]) != null)) {
							i_22_ += (class294.anIntArrayArray2364[(this.anInt6353)][1]);
							i_21_ += (class294.anIntArrayArray2364[(this.anInt6353)][0]);
							i_23_ += (class294.anIntArrayArray2364[(this.anInt6353)][2]);
						}
						if (i_23_ != 0 || i_21_ != 0) {
							int i_24_ = i_6_;
							if ((this.anIntArray6370) != null && (this.anIntArray6370[(this.anInt6353)]) != -1)
								i_24_ = (this.anIntArray6370[(this.anInt6353)]);
							int i_25_ = (0x3fff & i_24_ + (this.anInt6360) * 2048 - i_6_);
							if (i_25_ != 0)
								class146_20_.a(i_25_);
							int i_26_ = Class284_Sub2_Sub2.anIntArray6200[i_25_];
							int i_27_ = Class284_Sub2_Sub2.anIntArray6202[i_25_];
							int i_28_ = i_23_ * i_26_ + i_21_ * i_27_ >> 14;
							i_23_ = i_27_ * i_23_ - i_21_ * i_26_ >> 14;
							i_21_ = i_28_;
						}
						class146_20_.H(i_21_, i_22_, i_23_);
					}
					if (this.anInt6363 != 0)
						class146_20_.H(0, -(this.anInt6363) << 2, 0);
					if (bool_18_) {
						if (this.anInt6388 != 0)
							class146_20_.FA(this.anInt6388);
						if (this.anInt6377 != 0)
							class146_20_.VA(this.anInt6377);
						if (this.anInt6416 != 0)
							class146_20_.H(0, (this.anInt6416), 0);
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cea.CB(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
		}
	}

	final void method3049(int i, int i_29_, boolean bool, byte i_30_, int i_31_, int i_32_) {
		do {
			try {
				this.height_level = this.aByte5081 = (byte) i_32_;
				if (Class1.method162(i_31_, (byte) -99, i_29_))
					this.aByte5081++;
				if ((this.anInt6413 != -1) && Class151_Sub7.aClass183_5001.method2623(this.anInt6413, 16383).anInt816 == 1) {
					this.anIntArray6373 = null;
					this.anInt6413 = -1;
				}
				if (this.anInt6379 != -1) {
					Class107 class107 = (Class196.aClass304_1509.method3564(2, this.anInt6379));
					if (class107.aBoolean909 && class107.anInt910 != -1 && Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383).anInt816 == 1)
						this.anInt6379 = -1;
				}
				if (this.anInt6365 != -1) {
					Class107 class107 = (Class196.aClass304_1509.method3564(2, this.anInt6365));
					if (class107.aBoolean909 && class107.anInt910 != -1 && Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383).anInt816 == 1)
						this.anInt6365 = -1;
				}
				if (!bool) {
					int i_33_ = (-this.walkQueueX[0] + i_29_);
					int i_34_ = i_31_ + -(this.walkQueueZ[0]);
					if (i_33_ >= -8 && i_33_ <= 8 && i_34_ >= -8 && i_34_ <= 8) {
						if (this.anInt6434 < 9)
							this.anInt6434++;
						for (int i_35_ = this.anInt6434; i_35_ > 0; i_35_--) {
							this.walkQueueX[i_35_] = (this.walkQueueX[-1 + i_35_]);
							this.walkQueueZ[i_35_] = (this.walkQueueZ[i_35_ + -1]);
							this.aByteArray6443[i_35_] = (this.aByteArray6443[-1 + i_35_]);
						}
						this.walkQueueX[0] = i_29_;
						this.aByteArray6443[0] = (byte) 1;
						this.walkQueueZ[0] = i_31_;
						break;
					}
				}
				this.anInt6434 = 0;
				this.walkQueueX[0] = i_29_;
				this.anInt6436 = 0;
				this.anInt6433 = 0;
				this.walkQueueZ[0] = i_31_;
				this.localYPos = ((i << 8) + (this.walkQueueZ[0] << 9));
				this.localXPos = (this.walkQueueX[0] << 9) + (i << 8);
				if (i_30_ >= -105)
					this.anInt6501 = -54;
				if (this.aClass246_Sub5_6439 == null)
					break;
				this.aClass246_Sub5_6439.method3127();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("cea.GB(" + i + ',' + i_29_ + ',' + bool + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3050(int i, int i_36_, int i_37_) {
		try {
			int i_38_ = this.walkQueueX[0];
			int i_39_ = this.walkQueueZ[0];
			if (i_37_ == 0)
				i_39_++;
			if (i_37_ == 1) {
				i_38_++;
				i_39_++;
			}
			if (i_37_ == 2)
				i_38_++;
			if (i_37_ == 3) {
				i_38_++;
				i_39_--;
			}
			if (i_37_ == 4)
				i_39_--;
			if (i_37_ == 5) {
				i_38_--;
				i_39_--;
			}
			if (i_37_ == 6)
				i_38_--;
			if (i_37_ == 7) {
				i_39_++;
				i_38_--;
			}
			if (this.anInt6413 != -1 && Class151_Sub7.aClass183_5001.method2623(this.anInt6413, 16383).anInt816 == 1) {
				this.anInt6413 = -1;
				this.anIntArray6373 = null;
			}
			if ((~((Mobile) this).anInt6379) != i) {
				Class107 class107 = (Class196.aClass304_1509.method3564(i + 2, this.anInt6379));
				if (class107.aBoolean909 && class107.anInt910 != -1 && (Class151_Sub7.aClass183_5001.method2623((class107.anInt910), 16383).anInt816) == 1)
					this.anInt6379 = -1;
			}
			if (this.anInt6365 != -1) {
				Class107 class107 = (Class196.aClass304_1509.method3564(i + 2, this.anInt6365));
				if (class107.aBoolean909 && class107.anInt910 != -1 && (Class151_Sub7.aClass183_5001.method2623((class107.anInt910), 16383).anInt816) == 1)
					this.anInt6365 = -1;
			}
			if (this.anInt6434 < 9)
				this.anInt6434++;
			for (int i_40_ = this.anInt6434; i_40_ > 0; i_40_--) {
				this.walkQueueX[i_40_] = (this.walkQueueX[-1 + i_40_]);
				this.walkQueueZ[i_40_] = (this.walkQueueZ[-1 + i_40_]);
				this.aByteArray6443[i_40_] = (this.aByteArray6443[-1 + i_40_]);
			}
			this.walkQueueX[0] = i_38_;
			this.walkQueueZ[0] = i_39_;
			this.aByteArray6443[0] = (byte) i_36_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cea.EB(" + i + ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}

	final int method3044(boolean bool) {
		try {
			if (bool != false)
				this.aClass141_6504 = null;
			if (this.aClass141_6504.anIntArray1109 != null) {
				Class141 class141 = this.aClass141_6504.method2300(Class75.aClass140_584, (byte) 70);
				if (class141 != null && class141.anInt1092 != -1)
					return class141.anInt1092;
			}
			if (this.aClass141_6504.anInt1092 == -1)
				return super.method3044(false);
			return (this.aClass141_6504.anInt1092);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.B(" + bool + ')');
		}
	}

	private final boolean method3051(int i) {
		try {
			if (i != 2)
				this.anInt6503 = -16;
			return (this.aClass141_6504.aBoolean1116);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.DB(" + i + ')');
		}
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_41_, ha var_ha, int i_42_, int i_43_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cea.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_41_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ')'));
		}
	}

	final boolean method2976(int i, ha var_ha, byte i_45_, int i_46_) {
		try {
			if (this.aClass141_6504 == null || !method3048(var_ha, 255, 131072))
				return false;
			Class111 class111 = var_ha.method1793();
			int i_47_ = this.aClass325_6399.method3698((byte) 116);
			class111.method2101(i_47_);
			if (i_45_ <= 59)
				method2975(null, -17);
			class111.method2106(this.localXPos, this.anInt5089, this.localYPos);
			boolean bool = false;
			for (int i_48_ = 0; i_48_ < (this.aClass146Array6441).length; i_48_++) {
				if (this.aClass146Array6441[i_48_] != null) {
					boolean bool_49_ = (this.aClass141_6504.anInt1123 > 0 || (this.aClass141_6504.anInt1096 == -1 ? (this.aClass141_6504.anInt1112 == 1) : this.aClass141_6504.anInt1096 == 1));
					boolean bool_50_;
					if (!Class239.aBoolean1839)
						bool_50_ = (this.aClass146Array6441[i_48_].method2339(i, i_46_, class111, bool_49_, this.aClass141_6504.anInt1123));
					else
						bool_50_ = (this.aClass146Array6441[i_48_].method2333(i, i_46_, class111, bool_49_, this.aClass141_6504.anInt1123, Class16.anInt197));
					if (bool_50_) {
						bool = true;
						break;
					}
				}
			}
			this.aClass146Array6441[0] = this.aClass146Array6441[1] = this.aClass146Array6441[2] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cea.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_45_ + ',' + i_46_ + ')'));
		}
	}

	final int method3035(int i) {
		try {
			if (this.aClass141_6504.anIntArray1109 != null) {
				Class141 class141 = this.aClass141_6504.method2300(Class75.aClass140_584, (byte) 82);
				if (class141 != null && class141.anInt1095 != -1)
					return class141.anInt1095;
			}
			if (i != 28213)
				aClass171_6506 = null;
			return (this.aClass141_6504.anInt1095);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.T(" + i + ')');
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cea.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3052(byte i) {
		try {
			if (this.aClass141_6504 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.WA(" + i + ')');
		}
	}

	public static void method3053(boolean bool) {
		try {
			aClass171_6506 = null;
			aClass332_6508 = null;
			aString6507 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.BB(" + bool + ')');
		}
	}

	final void method3054(Class141 class141, int i) {
		do {
			try {
				this.aClass141_6504 = class141;
				if (i != 1)
					this.anInt6510 = -51;
				if (this.aClass246_Sub5_6439 == null)
					break;
				this.aClass246_Sub5_6439.method3127();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("cea.AB(" + (class141 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final int method3030(byte i) {
		try {
			if (this.aClass141_6504.anIntArray1109 != null) {
				Class141 class141 = this.aClass141_6504.method2300(Class75.aClass140_584, (byte) 121);
				if (class141 != null && class141.anInt1145 != -1)
					return class141.anInt1145;
			}
			return (this.aClass141_6504.anInt1145);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.G(" + i + ')');
		}
	}

	final boolean method2982(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.HA(" + i + ')');
		}
	}

	final int method2986(int i) {
		try {
			if (this.aClass141_6504 == null)
				return 0;
			return (this.aClass141_6504.anInt1123);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.FB(" + i + ')');
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			if (this.aClass141_6504 == null || !method3048(var_ha, 255, 2048))
				return null;
			Class111 class111 = var_ha.method1793();
			int i_51_ = this.aClass325_6399.method3698((byte) 116);
			class111.method2101(i_51_);
			Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[this.height_level][(this.localXPos >> Class151_Sub8.anInt5015)][(this.localYPos >> Class151_Sub8.anInt5015)]);
			if (class172 == null || class172.aClass246_Sub3_Sub1_1332 == null)
				this.anInt6351 -= ((float) this.anInt6351 / 10.0F);
			else {
				int i_52_ = (-(class172.aClass246_Sub3_Sub1_1332.aShort6149) + this.anInt6351);
				this.anInt6351 -= (float) i_52_ / 10.0F;
			}
			class111.method2106(this.localXPos, (-this.anInt6351 + this.anInt5089 + -20), this.localYPos);
			RenderAnimDefinitions class294 = this.getRenderAnimation(1);
			Class141 class141 = (this.aClass141_6504.anIntArray1109 != null ? this.aClass141_6504.method2300(Class75.aClass140_584, (byte) 70) : this.aClass141_6504);
			this.aBoolean6442 = false;
			Class246_Sub1 class246_sub1 = null;
			if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035.method662((byte) 123) == 1 && class141.aBoolean1130 && class294.aBoolean2400) {
				Class97 class97 = ((this.anInt6413 == -1 || this.anInt6400 != 0) ? null : (Class151_Sub7.aClass183_5001.method2623(this.anInt6413, 16383)));
				Class97 class97_53_ = ((this.anInt6385 == -1 || (this.aBoolean6359 && class97 != null)) ? null : (Class151_Sub7.aClass183_5001.method2623(this.anInt6385, 16383)));
				AbstractModel class146 = (Class102.method1703(class97_53_ == null ? class97 : class97_53_, this.anInt6377, this.aClass141_6504.anInt1112, this.aClass141_6504.aByte1134 & 0xff, this.aClass146Array6441[0], this.anInt6388, i_51_, 121, 0xff & this.aClass141_6504.aByte1122, this.aClass141_6504.aShort1135 & 0xffff, (class97_53_ != null ? this.anInt6350 : this.anInt6393), var_ha, this.aClass141_6504.aShort1094 & 0xffff, this.anInt6416));
				if (class146 != null) {
					class246_sub1 = Class94.method915(1 + (this.aClass146Array6441).length, (byte) -47, method3051(2));
					this.aBoolean6442 = true;
					var_ha.C(false);
					if (Class239.aBoolean1839)
						class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[(this.aClass146Array6441).length]), Class16.anInt197, 0);
					else
						class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[(this.aClass146Array6441).length]), 0);
					var_ha.C(true);
				}
			}
			class111.method2101(i_51_);
			class111.method2106(this.localXPos, (this.anInt5089 - 5 + -(this.anInt6351)), this.localYPos);
			if (class246_sub1 == null)
				class246_sub1 = Class94.method915((this.aClass146Array6441).length, (byte) -47, method3051(2));
			this.method3036(var_ha, false, (byte) -124, class111, (this.aClass146Array6441));
			if (Class239.aBoolean1839) {
				for (int i_54_ = 0; i_54_ < (this.aClass146Array6441).length; i_54_++) {
					if ((this.aClass146Array6441[i_54_]) != null)
						this.aClass146Array6441[i_54_].method2329(class111, (class246_sub1.aClass246_Sub6Array5067[i_54_]), Class16.anInt197, 0);
				}
			} else {
				for (int i_55_ = 0; (this.aClass146Array6441).length > i_55_; i_55_++) {
					if ((this.aClass146Array6441[i_55_]) != null)
						this.aClass146Array6441[i_55_].method2325(class111, (class246_sub1.aClass246_Sub6Array5067[i_55_]), 0);
				}
			}
			if (this.aClass246_Sub5_6439 != null) {
				Class242 class242 = this.aClass246_Sub5_6439.method3116();
				if (!Class239.aBoolean1839)
					var_ha.method1820(class242);
				else
					var_ha.method1785(class242, Class16.anInt197);
			}
			for (int i_56_ = 0; (this.aClass146Array6441.length > i_56_); i_56_++) {
				if (this.aClass146Array6441[i_56_] != null)
					this.aBoolean6442 |= this.aClass146Array6441[i_56_].F();
			}
			this.aClass146Array6441[0] = this.aClass146Array6441[1] = this.aClass146Array6441[2] = null;
			this.anInt6417 = Class64_Sub15.anInt3676;
			if (i > -12)
				method2982((byte) -72);
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cea.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public Class246_Sub3_Sub4_Sub2_Sub1() {
		/* empty */
	}

	final void method2992(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cea.DA(" + i + ')');
		}
	}
}
