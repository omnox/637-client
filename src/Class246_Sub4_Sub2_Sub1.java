/* Class246_Sub4_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub4_Sub2_Sub1 extends Class246_Sub4_Sub2 {
	private short aShort6491;
	Class246_Sub9 aClass246_Sub9_6492;
	private short aShort6493;
	private short aShort6494;
	private int anInt6495;
	private short aShort6496;
	private short aShort6497;
	private int anInt6498;
	private short aShort6499;

	final void method3109(long l, int i) {
		aShort6497 -= i;
		if (aShort6497 <= 0)
			method3113();
		else {
			int i_0_ = this.anInt6176 >> 12;
			int i_1_ = this.anInt6177 >> 12;
			int i_2_ = this.anInt6175 >> 12;
			Class246_Sub5 class246_sub5 = (this.aClass246_Sub9_6492.aClass246_Sub5_5133);
			Class92 class92 = (this.aClass246_Sub9_6492.aClass92_5132);
			if (class92.anInt760 != 0) {
				if (aShort6493 - aShort6497 <= class92.anInt761) {
					int i_3_ = ((this.anInt6178 >> 8 & 0xff00) + (anInt6495 >> 16 & 0xff) + class92.anInt743 * i);
					int i_4_ = ((this.anInt6178 & 0xff00) + (anInt6495 >> 8 & 0xff) + class92.anInt733 * i);
					int i_5_ = ((this.anInt6178 << 8 & 0xff00) + (anInt6495 & 0xff) + class92.anInt727 * i);
					if (i_3_ < 0)
						i_3_ = 0;
					else if (i_3_ > 65535)
						i_3_ = 65535;
					if (i_4_ < 0)
						i_4_ = 0;
					else if (i_4_ > 65535)
						i_4_ = 65535;
					if (i_5_ < 0)
						i_5_ = 0;
					else if (i_5_ > 65535)
						i_5_ = 65535;
					this.anInt6178 &= ~0xffffff;
					this.anInt6178 |= (((i_3_ & 0xff00) << 8) + (i_4_ & 0xff00) + ((i_5_ & 0xff00) >> 8));
					anInt6495 &= ~0xffffff;
					anInt6495 |= (((i_3_ & 0xff) << 16) + ((i_4_ & 0xff) << 8) + (i_5_ & 0xff));
				}
				if (aShort6493 - aShort6497 <= class92.anInt758) {
					int i_6_ = ((this.anInt6178 >> 16 & 0xff00) + (anInt6495 >> 24 & 0xff) + class92.anInt779 * i);
					if (i_6_ < 0)
						i_6_ = 0;
					else if (i_6_ > 65535)
						i_6_ = 65535;
					this.anInt6178 &= 0xffffff;
					this.anInt6178 |= (i_6_ & 0xff00) << 16;
					anInt6495 &= 0xffffff;
					anInt6495 |= (i_6_ & 0xff) << 24;
				}
			}
			if (class92.anInt745 != -1 && aShort6493 - aShort6497 <= class92.anInt785)
				anInt6498 += class92.anInt781 * i;
			if (class92.anInt775 != -1 && aShort6493 - aShort6497 <= class92.anInt777)
				this.anInt6179 += class92.anInt742 * i;
			double d = aShort6496;
			double d_7_ = aShort6491;
			double d_8_ = aShort6494;
			boolean bool = false;
			if (class92.anInt739 == 1) {
				int i_9_ = i_0_ - this.aClass246_Sub9_6492.aClass216_5136.anInt1617;
				int i_10_ = i_1_ - this.aClass246_Sub9_6492.aClass216_5136.anInt1618;
				int i_11_ = i_2_ - this.aClass246_Sub9_6492.aClass216_5136.anInt1621;
				int i_12_ = ((int) Math.sqrt(i_9_ * i_9_ + i_10_ * i_10_ + i_11_ * i_11_) >> 2);
				long l_13_ = class92.anInt792 * i_12_ * i;
				anInt6498 -= (long) anInt6498 * l_13_ >> 18;
			} else if (class92.anInt739 == 2) {
				int i_14_ = i_0_ - this.aClass246_Sub9_6492.aClass216_5136.anInt1617;
				int i_15_ = i_1_ - this.aClass246_Sub9_6492.aClass216_5136.anInt1618;
				int i_16_ = i_2_ - this.aClass246_Sub9_6492.aClass216_5136.anInt1621;
				int i_17_ = i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_;
				long l_18_ = class92.anInt792 * i_17_ * i;
				anInt6498 -= (long) anInt6498 * l_18_ >> 28;
			}
			if (class92.anIntArray728 != null) {
				Node class98 = (class246_sub5.aClass148_5102.aClass98_1198);
				for (Node class98_19_ = class98.aClass98_836; class98_19_ != class98; class98_19_ = class98_19_.aClass98_836) {
					Class98_Sub46_Sub6 class98_sub46_sub6 = (Class98_Sub46_Sub6) class98_19_;
					Class66 class66 = (class98_sub46_sub6.aClass66_5973);
					if (class66.anInt508 != 1) {
						boolean bool_20_ = false;
						for (int i_21_ = 0; i_21_ < class92.anIntArray728.length; i_21_++) {
							if (class92.anIntArray728[i_21_] == class66.anInt509) {
								bool_20_ = true;
								break;
							}
						}
						if (bool_20_) {
							double d_22_ = i_0_ - class98_sub46_sub6.anInt5972;
							double d_23_ = i_1_ - class98_sub46_sub6.anInt5974;
							double d_24_ = i_2_ - class98_sub46_sub6.anInt5978;
							double d_25_ = (d_22_ * d_22_ + d_23_ * d_23_ + d_24_ * d_24_);
							if (!(d_25_ > (double) class66.aLong516)) {
								double d_26_ = Math.sqrt(d_25_);
								if (d_26_ == 0.0)
									d_26_ = 1.0;
								double d_27_ = ((d_22_ * (double) (class98_sub46_sub6.anInt5976) + d_23_ * (double) (class66.anInt511) + (d_24_ * (double) (class98_sub46_sub6.anInt5977))) * 65535.0 / ((double) class66.anInt517 * d_26_));
								if (!(d_27_ < (double) (class66.anInt514))) {
									double d_28_ = 0.0;
									if (class66.anInt518 == 1)
										d_28_ = (d_26_ / 16.0 * (double) (class66.anInt512));
									else if (class66.anInt518 == 2)
										d_28_ = (d_26_ / 16.0 * (d_26_ / 16.0) * (double) (class66.anInt512));
									if (class66.anInt515 == 0) {
										if (class66.anInt513 == 0) {
											d += ((double) (class98_sub46_sub6.anInt5976) - d_28_) * (double) i;
											d_7_ += ((double) class66.anInt511 - d_28_) * (double) i;
											d_8_ += ((double) (class98_sub46_sub6.anInt5977) - d_28_) * (double) i;
											bool = true;
										} else {
											this.anInt6176 += ((double) (class98_sub46_sub6.anInt5976) - d_28_) * (double) i;
											this.anInt6177 += ((double) class66.anInt511 - d_28_) * (double) i;
											this.anInt6175 += ((double) (class98_sub46_sub6.anInt5977) - d_28_) * (double) i;
										}
									} else {
										double d_29_ = (d_22_ / d_26_ * (double) (class66.anInt517));
										double d_30_ = (d_23_ / d_26_ * (double) (class66.anInt517));
										double d_31_ = (d_24_ / d_26_ * (double) (class66.anInt517));
										if (class66.anInt513 == 0) {
											d += d_29_ * (double) i;
											d_7_ += d_30_ * (double) i;
											d_8_ += d_31_ * (double) i;
											bool = true;
										} else {
											this.anInt6176 += d_29_ * (double) i;
											this.anInt6177 += d_30_ * (double) i;
											this.anInt6175 += d_31_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class92.anIntArray735 != null) {
				for (int i_32_ = 0; i_32_ < class92.anIntArray735.length; i_32_++) {
					Class98_Sub46_Sub6 class98_sub46_sub6 = ((Class98_Sub46_Sub6) (Class246_Sub3_Sub3.aClass254_6152.method3189(class92.anIntArray735[i_32_], (byte) -91)));
					while (class98_sub46_sub6 != null) {
						Class66 class66 = (class98_sub46_sub6.aClass66_5973);
						double d_33_ = i_0_ - class98_sub46_sub6.anInt5972;
						double d_34_ = i_1_ - class98_sub46_sub6.anInt5974;
						double d_35_ = i_2_ - class98_sub46_sub6.anInt5978;
						double d_36_ = d_33_ * d_33_ + d_34_ * d_34_ + d_35_ * d_35_;
						if (d_36_ > (double) class66.aLong516)
							class98_sub46_sub6 = (Class98_Sub46_Sub6) Class246_Sub3_Sub3.aClass254_6152.method3190(false);
						else {
							double d_37_ = Math.sqrt(d_36_);
							if (d_37_ == 0.0)
								d_37_ = 1.0;
							double d_38_ = ((d_33_ * (double) (class98_sub46_sub6.anInt5976) + (d_34_ * (double) class66.anInt511) + d_35_ * (double) (class98_sub46_sub6.anInt5977)) * 65535.0 / ((double) class66.anInt517 * d_37_));
							if (d_38_ < (double) class66.anInt514)
								class98_sub46_sub6 = ((Class98_Sub46_Sub6) Class246_Sub3_Sub3.aClass254_6152.method3190(false));
							else {
								double d_39_ = 0.0;
								if (class66.anInt518 == 1)
									d_39_ = (d_37_ / 16.0 * (double) (class66.anInt512));
								else if (class66.anInt518 == 2)
									d_39_ = (d_37_ / 16.0 * (d_37_ / 16.0) * (double) (class66.anInt512));
								if (class66.anInt515 == 0) {
									if (class66.anInt513 == 0) {
										d += ((double) (class98_sub46_sub6.anInt5976) - d_39_) * (double) i;
										d_7_ += ((double) (class66.anInt511) - d_39_) * (double) i;
										d_8_ += ((double) (class98_sub46_sub6.anInt5977) - d_39_) * (double) i;
										bool = true;
									} else {
										this.anInt6176 += ((double) (class98_sub46_sub6.anInt5976) - d_39_) * (double) i;
										this.anInt6177 += ((double) (class66.anInt511) - d_39_) * (double) i;
										this.anInt6175 += ((double) (class98_sub46_sub6.anInt5977) - d_39_) * (double) i;
									}
								} else {
									double d_40_ = (d_33_ / d_37_ * (double) (class66.anInt517));
									double d_41_ = (d_34_ / d_37_ * (double) (class66.anInt517));
									double d_42_ = (d_35_ / d_37_ * (double) (class66.anInt517));
									if (class66.anInt513 == 0) {
										d += d_40_ * (double) i;
										d_7_ += d_41_ * (double) i;
										d_8_ += d_42_ * (double) i;
										bool = true;
									} else {
										this.anInt6176 += d_40_ * (double) i;
										this.anInt6177 += d_41_ * (double) i;
										this.anInt6175 += d_42_ * (double) i;
									}
								}
								class98_sub46_sub6 = ((Class98_Sub46_Sub6) Class246_Sub3_Sub3.aClass254_6152.method3190(false));
							}
						}
					}
				}
			}
			if (class92.anIntArray772 != null) {
				if (class92.anIntArray768 == null) {
					class92.anIntArray768 = new int[class92.anIntArray772.length];
					for (int i_43_ = 0; i_43_ < class92.anIntArray772.length; i_43_++) {
						Class21.method263((class92.anIntArray772[i_43_]), 31866);
						class92.anIntArray768[i_43_] = ((Class98_Sub34) RenderAnimDefinitions.aClass377_2397.method3990(class92.anIntArray772[i_43_], -1)).anInt4126;
					}
				}
				for (int i_44_ = 0; i_44_ < class92.anIntArray768.length; i_44_++) {
					Class66 class66 = (Class336.aClass66Array2828[class92.anIntArray768[i_44_]]);
					if (class66.anInt513 == 0) {
						d += class66.anInt506 * i;
						d_7_ += class66.anInt511 * i;
						d_8_ += class66.anInt505 * i;
						bool = true;
					} else {
						this.anInt6176 += class66.anInt506 * i;
						this.anInt6177 += class66.anInt511 * i;
						this.anInt6175 += class66.anInt505 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_7_ > 32767.0 || d_8_ > 32767.0 || d < -32767.0 || d_7_ < -32767.0 || d_8_ < -32767.0) {
					d /= 2.0;
					d_7_ /= 2.0;
					d_8_ /= 2.0;
					anInt6498 <<= 1;
				}
				aShort6496 = (short) (int) d;
				aShort6491 = (short) (int) d_7_;
				aShort6494 = (short) (int) d_8_;
			}
			this.anInt6176 += (((long) aShort6496 * (long) (anInt6498 << 2) >> 23) * (long) i);
			this.anInt6177 += (((long) aShort6491 * (long) (anInt6498 << 2) >> 23) * (long) i);
			this.anInt6175 += (((long) aShort6494 * (long) (anInt6498 << 2) >> 23) * (long) i);
		}
	}

	private final void method3110() {
		int i = (this.aClass246_Sub9_6492.aClass246_Sub5_5133.anInt5093);
		if ((this.aClass246_Sub9_6492.aClass246_Sub5_5133.aClass246_Sub4_Sub2_Sub1Array5095[i]) != null)
			this.aClass246_Sub9_6492.aClass246_Sub5_5133.aClass246_Sub4_Sub2_Sub1Array5095[i].method3113();
		this.aClass246_Sub9_6492.aClass246_Sub5_5133.aClass246_Sub4_Sub2_Sub1Array5095[i] = this;
		aShort6499 = (short) this.aClass246_Sub9_6492.aClass246_Sub5_5133.anInt5093;
		this.aClass246_Sub9_6492.aClass246_Sub5_5133.anInt5093 = i + 1 & 0x1fff;
		this.aClass246_Sub9_6492.aClass218_5140.method2808(true, this);
	}

	final void method3111(ha var_ha, long l) {
		int i = (this.anInt6176 >> 12 + Class151_Sub8.anInt5015);
		int i_45_ = (this.anInt6175 >> 12 + Class151_Sub8.anInt5015);
		int i_46_ = this.anInt6177 >> 12;
		if (i_46_ > 0 || i_46_ < -262144 || i < 0 || i >= Class366.anInt3112 || i_45_ < 0 || i_45_ >= Class64_Sub9.anInt3662)
			method3113();
		else {
			Class246_Sub5 class246_sub5 = (this.aClass246_Sub9_6492.aClass246_Sub5_5133);
			Class92 class92 = (this.aClass246_Sub9_6492.aClass92_5132);
			s[] var_ses = Class78.activeTileHeightMap;
			int i_47_ = class246_sub5.anInt5106;
			Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[class246_sub5.anInt5106][i][i_45_]);
			if (class172 != null)
				i_47_ = class172.aByte1322;
			int i_48_ = var_ses[i_47_].method3420(i_45_, -12639, i);
			int i_49_;
			if (i_47_ < Class364.anInt3103 - 1)
				i_49_ = var_ses[i_47_ + 1].method3420(i_45_, -12639, i);
			else
				i_49_ = i_48_ - (8 << Class151_Sub8.anInt5015);
			if (class92.aBoolean736) {
				if (class92.anInt774 == -1 && i_46_ > i_48_) {
					method3113();
					return;
				}
				if (class92.anInt774 >= 0 && i_46_ > var_ses[class92.anInt774].method3420(i_45_, -12639, i)) {
					method3113();
					return;
				}
				if (class92.anInt782 == -1 && i_46_ < i_49_) {
					method3113();
					return;
				}
				if (class92.anInt782 >= 0 && i_46_ < var_ses[class92.anInt782 + 1].method3420(i_45_, -12639, i)) {
					method3113();
					return;
				}
			}
			int i_50_;
			for (i_50_ = Class364.anInt3103 - 1; (i_50_ > 0 && i_46_ > var_ses[i_50_].method3420(i_45_, -12639, i)); i_50_--) {
				/* empty */
			}
			if (class92.aBoolean776 && i_50_ == 0 && i_46_ > var_ses[0].method3420(i_45_, -12639, i))
				method3113();
			else if (i_50_ == Class364.anInt3103 - 1 && (var_ses[i_50_].method3420(i_45_, -12639, i) - i_46_ > 8 << Class151_Sub8.anInt5015))
				method3113();
			else {
				class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_50_][i][i_45_]);
				if (class172 == null) {
					if (i_50_ == 0 || (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_45_]) == null)
						class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_45_] = new Class172(0);
					boolean bool = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_45_].aClass172_1330 != null);
					if (i_50_ == 3 && bool) {
						method3113();
						return;
					}
					for (int i_51_ = 1; i_51_ <= i_50_; i_51_++) {
						if ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_51_][i][i_45_]) == null) {
							class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_51_][i][i_45_] = new Class172(i_51_);
							if (bool)
								class172.aByte1322++;
						}
					}
				}
				if (class92.aBoolean789) {
					int i_52_ = this.anInt6176 >> 12;
					int i_53_ = this.anInt6175 >> 12;
					if (class172.aClass246_Sub3_Sub3_1324 != null) {
						Class228 class228 = class172.aClass246_Sub3_Sub3_1324.method2974((byte) -53, var_ha);
						if (class228 != null && class228.method2863(i_52_, i_46_, i_53_, 0)) {
							method3113();
							return;
						}
					}
					if (class172.aClass246_Sub3_Sub3_1333 != null) {
						Class228 class228 = class172.aClass246_Sub3_Sub3_1333.method2974((byte) -53, var_ha);
						if (class228 != null && class228.method2863(i_52_, i_46_, i_53_, 0)) {
							method3113();
							return;
						}
					}
					if (class172.aClass246_Sub3_Sub1_1332 != null) {
						Class228 class228 = class172.aClass246_Sub3_Sub1_1332.method2974((byte) -53, var_ha);
						if (class228 != null && class228.method2863(i_52_, i_46_, i_53_, 0)) {
							method3113();
							return;
						}
					}
					for (Class154 class154 = class172.aClass154_1325; class154 != null; class154 = class154.aClass154_1233) {
						Class228 class228 = class154.aClass246_Sub3_Sub4_1232.method2974((byte) -53, var_ha);
						if (class228 != null && class228.method2863(i_52_, i_46_, i_53_, 0)) {
							method3113();
							return;
						}
					}
				}
				class246_sub5.aClass242_5104.aClass358_1850.method3891(this, 8);
			}
		}
	}

	final void method3112(Class246_Sub9 class246_sub9, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, boolean bool, boolean bool_64_) {
		this.aClass246_Sub9_6492 = class246_sub9;
		this.anInt6176 = i << 12;
		this.anInt6177 = i_54_ << 12;
		this.anInt6175 = i_55_ << 12;
		this.anInt6178 = i_61_;
		aShort6493 = aShort6497 = (short) i_60_;
		this.anInt6179 = i_62_;
		this.anInt6180 = i_63_;
		this.aBoolean6174 = bool_64_;
		aShort6496 = (short) i_56_;
		aShort6491 = (short) i_57_;
		aShort6494 = (short) i_58_;
		anInt6498 = i_59_;
		this.aByte6183 = this.aClass246_Sub9_6492.aClass87_5131.aByte658;
		method3110();
	}

	final void method3113() {
		this.aClass246_Sub9_6492.aClass246_Sub5_5133.aClass246_Sub4_Sub2_Sub1Array5095[aShort6499] = null;
		Class185.aClass246_Sub4_Sub2_Sub1Array1445[Class361.anInt3089] = this;
		Class361.anInt3089 = Class361.anInt3089 + 1 & 0x3ff;
		this.method2965((byte) -75);
		this.method3101(-37);
	}

	Class246_Sub4_Sub2_Sub1(Class246_Sub9 class246_sub9, int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool, boolean bool_75_) {
		this.aClass246_Sub9_6492 = class246_sub9;
		this.anInt6176 = i << 12;
		this.anInt6177 = i_65_ << 12;
		this.anInt6175 = i_66_ << 12;
		this.anInt6178 = i_72_;
		aShort6493 = aShort6497 = (short) i_71_;
		this.anInt6179 = i_73_;
		this.anInt6180 = i_74_;
		this.aBoolean6174 = bool_75_;
		aShort6496 = (short) i_67_;
		aShort6491 = (short) i_68_;
		aShort6494 = (short) i_69_;
		anInt6498 = i_70_;
		this.aByte6183 = this.aClass246_Sub9_6492.aClass87_5131.aByte658;
		method3110();
	}
}
