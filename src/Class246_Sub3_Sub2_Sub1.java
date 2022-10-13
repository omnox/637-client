/* Class246_Sub3_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub2_Sub1 extends Class246_Sub3_Sub2 {
	private boolean aBoolean6336 = false;
	int anInt6337;
	int anInt6338;
	int anInt6339 = 0;
	int anInt6340;
	int anInt6341;
	static OutgoingOpcode aClass171_6342 = new OutgoingOpcode(73, 8);
	int anInt6343 = -1;
	private int anInt6344 = 0;
	static int anInt6345 = 0;
	int anInt6346;

	final boolean method2978(int i) {
		try {
			int i_0_ = -91 % ((-76 - i) / 47);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iha.H(" + i + ')');
		}
	}

	static final Class31 method3006(String string, int i, int i_1_) {
		try {
			Class31 class31;
			try {
				class31 = (Class31) Class.forName("Class31_Sub2").newInstance();
			} catch (Throwable throwable) {
				class31 = new Class31_Sub1();
			}
			class31.anInt302 = i_1_;
			if (i != 0)
				return null;
			class31.aString299 = string;
			return class31;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iha.B(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
		}
	}

	static final boolean method3007(int i, int i_2_, byte i_3_) {
		try {
			if (i_3_ != -15)
				return false;
			if (!((0x40000 & i) != 0 | Class64_Sub10.method594(i, 6, i_2_)) && !Class228.method2864(55, i, i_2_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iha.C(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final boolean method2987(int i) {
		try {
			if (i != 6540)
				return true;
			return aBoolean6336;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iha.I(" + i + ')');
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			Class154 class154 = Class94.method914(this.height_level, (this.localXPos >> Class151_Sub8.anInt5015), (this.localYPos >> Class151_Sub8.anInt5015));
			if (class154 != null && (class154.aClass246_Sub3_Sub4_1232.aBoolean6162)) {
				int i_4_ = class154.aClass246_Sub3_Sub4_1232.method2990(0);
				if (this.anInt6339 != i_4_) {
					this.anInt5089 -= this.anInt6339;
					this.anInt5089 += i_4_;
					this.anInt6339 = i_4_;
				}
			}
			Class111 class111 = var_ha.method1793();
			class111.method2091();
			if (i > -12)
				return null;
			if (class154 == null || !(class154.aClass246_Sub3_Sub4_1232.aBoolean6162)) {
				boolean bool = false;
				boolean bool_5_ = false;
				boolean bool_6_ = false;
				s var_s = Class78.activeTileHeightMap[this.aByte5081];
				int i_7_ = anInt6344 << 1;
				int i_8_ = i_7_;
				int i_9_ = -i_7_ / 2;
				int i_10_ = -i_8_ / 2;
				int i_11_ = var_s.method3417((this.localXPos - -i_9_), (this.localYPos - -i_10_), true);
				int i_12_ = i_7_ / 2;
				int i_13_ = -i_8_ / 2;
				int i_14_ = var_s.method3417((this.localXPos + i_12_), (this.localYPos - -i_13_), true);
				int i_15_ = -i_7_ / 2;
				int i_16_ = i_8_ / 2;
				int i_17_ = var_s.method3417((this.localXPos - -i_15_), (this.localYPos - -i_16_), true);
				int i_18_ = i_7_ / 2;
				int i_19_ = i_8_ / 2;
				int i_20_ = var_s.method3417(i_18_ + (this.localXPos), i_19_ + (this.localYPos), true);
				int i_21_ = i_14_ <= i_11_ ? i_14_ : i_11_;
				int i_22_ = (i_17_ >= i_20_ ? i_20_ : i_17_);
				int i_23_ = (i_20_ > i_14_ ? i_14_ : i_20_);
				int i_24_ = (i_17_ > i_11_ ? i_11_ : i_17_);
				if (i_8_ != 0) {
					int i_25_ = (0x3fff & (int) (2607.5945876176133 * Math.atan2(i_21_ - i_22_, i_8_)));
					if (i_25_ != 0)
						class111.method2105(i_25_);
				}
				if (i_7_ != 0) {
					int i_26_ = (0x3fff & (int) (2607.5945876176133 * Math.atan2(-i_23_ + i_24_, i_7_)));
					if (i_26_ != 0)
						class111.method2090(-i_26_);
				}
				int i_27_ = i_20_ + i_11_;
				if (i_14_ + i_17_ < i_27_)
					i_27_ = i_17_ + i_14_;
				i_27_ = (i_27_ >> 1) - this.anInt5089;
				if (i_27_ != 0)
					class111.method2106(0, i_27_, 0);
			}
			class111.method2106(this.localXPos, -10 + this.anInt5089, this.localYPos);
			Class246_Sub1 class246_sub1 = Class94.method915(3, (byte) -47, true);
			aBoolean6336 = false;
			anInt6344 = 0;
			if (this.anInt6343 != -1) {
				AbstractModel class146 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6343).method3501(0, 2048, 0, null, -1, var_ha, this.anInt6337, 128, null));
				if (class146 != null) {
					if (!Class239.aBoolean1839)
						class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[2]), 0);
					else
						class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[2]), Class16.anInt197, 0);
					aBoolean6336 |= class146.F();
					anInt6344 = class146.ma();
				}
			}
			if (this.anInt6341 != -1) {
				AbstractModel class146 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6341).method3501(0, 2048, 0, null, -1, var_ha, this.anInt6346, 128, null));
				if (class146 != null) {
					if (!Class239.aBoolean1839)
						class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[1]), 0);
					else
						class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[1]), Class16.anInt197, 0);
					aBoolean6336 |= class146.F();
					if (class146.ma() > anInt6344)
						anInt6344 = class146.ma();
				}
			}
			AbstractModel class146 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6340).method3501(0, 2048, 0, null, -1, var_ha, this.anInt6338, 128, null));
			if (class146 != null) {
				if (Class239.aBoolean1839)
					class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[0]), Class16.anInt197, 0);
				else
					class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[0]), 0);
				aBoolean6336 |= class146.F();
				if (anInt6344 < class146.ma())
					anInt6344 = class146.ma();
			}
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iha.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				aClass171_6342 = null;
			return anInt6344;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iha.O(" + bool + ')');
		}
	}

	static final void method3008(byte i) {
		try {
			synchronized (RtMouseListener.aClass79_2493) {
				if (i != 60) {
					/* empty */
				} else
					RtMouseListener.aClass79_2493.method806((byte) -114);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iha.E(" + i + ')');
		}
	}

	final int method2986(int i) {
		try {
			if (i != -14240)
				return 114;
			ItemDefinition class297 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6340));
			int i_28_ = class297.anInt2445;
			if (this.anInt6341 != -1) {
				ItemDefinition class297_29_ = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6341));
				if (i_28_ < class297_29_.anInt2445)
					i_28_ = class297_29_.anInt2445;
			}
			if (this.anInt6343 != -1) {
				ItemDefinition class297_30_ = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6343));
				if (class297_30_.anInt2445 > i_28_)
					i_28_ = class297_30_.anInt2445;
			}
			return i_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iha.FB(" + i + ')');
		}
	}

	final boolean method2976(int i, ha var_ha, byte i_31_, int i_32_) {
		try {
			if (i_31_ < 59)
				method2990(-84);
			Class111 class111 = var_ha.method1793();
			class111.method2100(this.localXPos, this.anInt5089 + -10, this.localYPos);
			ItemDefinition class297 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6340));
			AbstractModel class146 = class297.method3501(0, 131072, 0, null, -1, var_ha, (this.anInt6338), 128, null);
			if (class146 != null && (Class239.aBoolean1839 ? class146.method2333(i, i_32_, class111, true, class297.anInt2445, Class16.anInt197) : class146.method2339(i, i_32_, class111, true, class297.anInt2445)))
				return true;
			if (this.anInt6341 != -1) {
				ItemDefinition class297_33_ = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6341));
				class146 = class297_33_.method3501(0, 131072, 0, null, -1, var_ha, (this.anInt6346), 128, null);
				if (class146 != null && (Class239.aBoolean1839 ? class146.method2333(i, i_32_, class111, true, (class297_33_.anInt2445), Class16.anInt197) : class146.method2339(i, i_32_, class111, true, (class297_33_.anInt2445))))
					return true;
			}
			if (this.anInt6343 != -1) {
				ItemDefinition class297_34_ = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(this.anInt6343));
				class146 = class297_34_.method3501(0, 131072, 0, null, -1, var_ha, (this.anInt6337), 128, null);
				if (class146 != null && (Class239.aBoolean1839 ? class146.method2333(i, i_32_, class111, true, (class297_34_.anInt2445), Class16.anInt197) : class146.method2339(i, i_32_, class111, true, (class297_34_.anInt2445))))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iha.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_31_ + ',' + i_32_ + ')'));
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				this.anInt6343 = 51;
			return -10;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iha.J(" + i + ')');
		}
	}

	static final void method3009(int i, Class98_Sub46_Sub8 class98_sub46_sub8, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, ha var_ha, int i_40_, int i_41_, int i_42_, int i_43_) {
		do {
			try {
				if (i_43_ < i_39_ && i_39_ < i_36_ + i_43_ && i_40_ > -13 + i_37_ && i_40_ < 3 + i_37_ && class98_sub46_sub8.aBoolean5984)
					i_42_ = i_35_;
				int[] is = null;
				if (!Class299_Sub2.method3526(119, (class98_sub46_sub8.anInt5990))) {
					if (class98_sub46_sub8.anInt5988 == -1) {
						if (!Class36.method340(class98_sub46_sub8.anInt5990, (byte) -87)) {
							if (Class98_Sub10_Sub21.method1064((class98_sub46_sub8.anInt5990), false)) {
								Object object = null;
								Class352 class352;
								if ((class98_sub46_sub8.anInt5990) == 1009)
									class352 = (Class130.aClass302_1028.method3546((int) (class98_sub46_sub8.aLong5987), (byte) 119));
								else
									class352 = (Class130.aClass302_1028.method3546((int) (0x7fffffffL & ((class98_sub46_sub8.aLong5987) >>> 32)), (byte) 119));
								if (class352.anIntArray2928 != null)
									class352 = class352.method3852((Class75.aClass140_584), (byte) -66);
								if (class352 != null)
									is = class352.anIntArray2934;
							}
						} else {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((int) (class98_sub46_sub8.aLong5987), -1)));
							if (class98_sub39 != null) {
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								Class141 class141 = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
								if (class141.anIntArray1109 != null)
									class141 = class141.method2300((Class75.aClass140_584), (byte) 32);
								if (class141 != null)
									is = class141.anIntArray1152;
							}
						}
					} else
						is = Class98_Sub46_Sub19.getItemDefs.getItemDefs((class98_sub46_sub8.anInt5988)).campaigns;
				} else
					is = Class98_Sub46_Sub19.getItemDefs.getItemDefs((int) (class98_sub46_sub8.aLong5987)).campaigns;
				String string = Class86.method845((byte) -124, class98_sub46_sub8);
				if (is != null)
					string += Class64_Sub25.method653(0, is);
				Class98_Sub10_Sub34.aClass43_5730.method413(i_37_, Class64_Sub5.anIntArray3652, i_41_, string, i_42_, 3 + i_43_, (byte) 18, Class217.aClass332Array3408);
				if (!class98_sub46_sub8.aBoolean5983)
					break;
				Class284_Sub2_Sub2.aClass332_6199.method3735((Class42_Sub1.aClass197_5354.method2674(string, 118) + i_43_ - -5), -12 + i_37_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("iha.D(" + i + ',' + (class98_sub46_sub8 != null ? "{...}" : "null") + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ')'));
			}
			break;
		} while (false);
	}

	Class246_Sub3_Sub2_Sub1(int i, int i_44_, int i_45_, int i_46_, int i_47_) {
		super(i, i_44_, i_45_, i_46_, i_47_);
		this.anInt6341 = -1;
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				method2974((byte) -91, null);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iha.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3010(byte i) {
		try {
			if (i == -37) {
				IncomingOpcode.aClass58_6335 = null;
				aClass171_6342 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iha.A(" + i + ')');
		}
	}

	final void method2988(ha var_ha, int i) {
		try {
			int i_48_ = 5 % ((53 - i) / 46);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iha.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
