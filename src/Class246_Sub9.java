/* Class246_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub9 extends Class246 {
	Class87 aClass87_5131;
	Class92 aClass92_5132;
	Class246_Sub5 aClass246_Sub5_5133;
	private long aLong5134;
	int anInt5135;
	Class216 aClass216_5136;
	private int anInt5137;
	static Class79 aClass79_5138;
	boolean aBoolean5139 = false;
	Class218 aClass218_5140;
	static int[][] anIntArrayArray5141 = { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	private Class216 aClass216_5142;
	private int anInt5143;
	private int anInt5144;
	private int anInt5145;
	private int anInt5146;
	private int anInt5147;
	private int anInt5148;
	private int anInt5149;
	private boolean aBoolean5150;

	final void method3134(long l, ha var_ha, byte i) {
		try {
			int i_0_ = 64 % ((i - -63) / 41);
			for (Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = (Class246_Sub4_Sub2_Sub1) this.aClass218_5140.method2803((byte) 15); class246_sub4_sub2_sub1 != null; class246_sub4_sub2_sub1 = (Class246_Sub4_Sub2_Sub1) this.aClass218_5140.method2809(false))
				class246_sub4_sub2_sub1.method3111(var_ha, l);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qba.C(" + l + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3135(ha var_ha, boolean bool, long l, int i, int i_1_) {
		try {
			if (!this.aBoolean5139) {
				if (this.aClass92_5132.anInt752 <= Class337_Sub1.anInt5497) {
					if (Class337.anIntArray3536[Class337_Sub1.anInt5497] < Class237_Sub1.anInt5047)
						bool = false;
					else if (aBoolean5150)
						bool = false;
					else if ((this.aClass92_5132.anInt762) != -1) {
						int i_2_ = (int) (-aLong5134 + l);
						if (!(this.aClass92_5132.aBoolean783) && (this.aClass92_5132.anInt762 < i_2_))
							bool = false;
						else
							i_2_ %= this.aClass92_5132.anInt762;
						if (!(this.aClass92_5132.aBoolean732) && i_2_ < this.aClass92_5132.anInt746)
							bool = false;
						if ((this.aClass92_5132.aBoolean732) && i_2_ >= this.aClass92_5132.anInt746)
							bool = false;
					}
				} else
					bool = false;
			} else
				bool = false;
			if (bool) {
				Class246_Sub3_Sub1_Sub2.anInt6252++;
				int i_3_ = (((this.aClass216_5136.anInt1619) + (this.aClass216_5136.anInt1624) - -(this.aClass216_5136.anInt1623)) / 3);
				int i_4_ = (((this.aClass216_5136.anInt1620) + (this.aClass216_5136.anInt1627) - -(this.aClass216_5136.anInt1625)) / 3);
				int i_5_ = (((this.aClass216_5136.anInt1626) + ((this.aClass216_5136.anInt1629) - -this.aClass216_5136.anInt1628)) / 3);
				if (((this.aClass216_5136.anInt1617) != i_3_) || i_4_ != this.aClass216_5136.anInt1618 || (this.aClass216_5136.anInt1621) != i_5_) {
					this.aClass216_5136.anInt1617 = i_3_;
					this.aClass216_5136.anInt1618 = i_4_;
					this.aClass216_5136.anInt1621 = i_5_;
					int i_6_ = ((this.aClass216_5136.anInt1624) - this.aClass216_5136.anInt1619);
					int i_7_ = ((this.aClass216_5136.anInt1627) + -this.aClass216_5136.anInt1620);
					int i_8_ = ((this.aClass216_5136.anInt1628) + -this.aClass216_5136.anInt1629);
					int i_9_ = (-(this.aClass216_5136.anInt1619) + this.aClass216_5136.anInt1623);
					int i_10_ = (-(this.aClass216_5136.anInt1620) + this.aClass216_5136.anInt1625);
					int i_11_ = (-(this.aClass216_5136.anInt1629) + this.aClass216_5136.anInt1626);
					anInt5144 = -(i_9_ * i_7_) + i_10_ * i_6_;
					anInt5146 = -(i_8_ * i_10_) + i_7_ * i_11_;
					for (anInt5143 = i_8_ * i_9_ - i_6_ * i_11_; (anInt5146 > 32767 || anInt5143 > 32767 || anInt5144 > 32767 || anInt5146 < -32767 || anInt5143 < -32767 || anInt5144 < -32767); anInt5143 >>= 1) {
						anInt5144 >>= 1;
						anInt5146 >>= 1;
					}
					int i_12_ = (int) Math.sqrt(anInt5144 * anInt5144 + anInt5146 * anInt5146 - -(anInt5143 * anInt5143));
					if (i_12_ <= 0)
						i_12_ = 1;
					anInt5144 = 32767 * anInt5144 / i_12_;
					anInt5143 = anInt5143 * 32767 / i_12_;
					anInt5146 = anInt5146 * 32767 / i_12_;
					if ((this.aClass92_5132.aShort786) > 0 || (this.aClass92_5132.aShort754) > 0) {
						int i_13_ = (int) (2607.5945876176133 * Math.atan2(anInt5144, anInt5146));
						int i_14_ = (int) ((Math.atan2(anInt5143, Math.sqrt((anInt5144 * anInt5144) + (anInt5146 * anInt5146)))) * 2607.5945876176133);
						anInt5148 = (-this.aClass92_5132.aShort747 + this.aClass92_5132.aShort786);
						anInt5149 = (i_13_ - -this.aClass92_5132.aShort747 + -(anInt5148 >> 1));
						anInt5145 = (this.aClass92_5132.aShort754 - this.aClass92_5132.aShort763);
						anInt5147 = (this.aClass92_5132.aShort763 + (i_14_ + -(anInt5145 >> 1)));
					}
				}
				anInt5137 += (int) ((double) i_1_ * ((Math.random() * (double) ((this.aClass92_5132.anInt790) + -this.aClass92_5132.anInt750)) + (double) (this.aClass92_5132.anInt750)));
				if (anInt5137 > 63) {
					int i_15_ = anInt5137 >> 6;
					anInt5137 &= 0x3f;
					for (int i_16_ = 0; i_15_ > i_16_; i_16_++) {
						int i_17_;
						int i_18_;
						int i_19_;
						if ((this.aClass92_5132.aShort786) > 0 || this.aClass92_5132.aShort754 > 0) {
							int i_20_ = ((int) (Math.random() * (double) anInt5148) + anInt5149);
							i_20_ &= 0x3fff;
							int i_21_ = Class284_Sub2_Sub2.anIntArray6200[i_20_];
							int i_22_ = Class284_Sub2_Sub2.anIntArray6202[i_20_];
							int i_23_ = ((int) ((double) anInt5145 * Math.random()) + anInt5147);
							i_23_ &= 0x1fff;
							int i_24_ = Class284_Sub2_Sub2.anIntArray6200[i_23_];
							int i_25_ = Class284_Sub2_Sub2.anIntArray6202[i_23_];
							int i_26_ = 13;
							i_17_ = i_22_ * i_24_ >> i_26_;
							i_18_ = (i_25_ << 1) * -1;
							i_19_ = i_21_ * i_24_ >> i_26_;
						} else {
							i_17_ = anInt5146;
							i_18_ = anInt5143;
							i_19_ = anInt5144;
						}
						float f = (float) Math.random();
						float f_27_ = (float) Math.random();
						if (f + f_27_ > 1.0F) {
							f = 1.0F - f;
							f_27_ = -f_27_ + 1.0F;
						}
						float f_28_ = 1.0F - (f_27_ + f);
						int i_29_ = (int) ((float) (this.aClass216_5136.anInt1624) * f_27_ + (float) (this.aClass216_5136.anInt1619) * f + (float) (this.aClass216_5136.anInt1623) * f_28_);
						int i_30_ = (int) (f_28_ * (float) (this.aClass216_5136.anInt1625) + (((float) this.aClass216_5136.anInt1620 * f) + (f_27_ * (float) (this.aClass216_5136.anInt1627))));
						int i_31_ = (int) (((float) this.aClass216_5136.anInt1626 * f_28_) + (((float) this.aClass216_5136.anInt1629 * f) + (float) (this.aClass216_5136.anInt1628) * f_27_));
						int i_32_ = (int) ((float) (aClass216_5142.anInt1619) * f + f_27_ * (float) (aClass216_5142.anInt1624) + f_28_ * (float) (aClass216_5142.anInt1623));
						int i_33_ = (int) (f_28_ * (float) aClass216_5142.anInt1625 + ((float) (aClass216_5142.anInt1627) * f_27_ + (float) (aClass216_5142.anInt1620) * f));
						int i_34_ = (int) (f_27_ * (float) aClass216_5142.anInt1628 + f * (float) (aClass216_5142.anInt1629) + (float) (aClass216_5142.anInt1626) * f_28_);
						int i_35_ = -i_32_ + i_29_;
						int i_36_ = -i_33_ + i_30_;
						int i_37_ = i_31_ + -i_34_;
						int i_38_ = (int) ((double) i_35_ * Math.random() + (double) i_32_);
						int i_39_ = (int) ((double) i_33_ + (double) i_36_ * Math.random());
						int i_40_ = (int) ((double) i_34_ + Math.random() * (double) i_37_);
						int i_41_ = ((int) (Math.random() * (double) (-this.aClass92_5132.anInt770 + (this.aClass92_5132.anInt731))) + this.aClass92_5132.anInt770);
						int i_42_ = ((int) (Math.random() * (double) (this.aClass92_5132.anInt787 - (this.aClass92_5132.anInt766))) + this.aClass92_5132.anInt766);
						int i_43_ = (this.aClass92_5132.anInt780 - -(int) (Math.random() * (double) ((this.aClass92_5132.anInt788) - (this.aClass92_5132.anInt780))));
						int i_44_;
						if (!this.aClass92_5132.aBoolean759)
							i_44_ = (((int) ((Math.random() * (double) (this.aClass92_5132.anInt765)) + (double) (this.aClass92_5132.anInt756)) << 24) | (((int) ((double) (this.aClass92_5132.anInt741) + (Math.random() * (double) (this.aClass92_5132.anInt730))) << 16) | ((int) ((Math.random() * (double) (this.aClass92_5132.anInt734)) + (double) (this.aClass92_5132.anInt757)) << 8) | (int) ((double) (this.aClass92_5132.anInt771) + ((double) (this.aClass92_5132.anInt737) * Math.random()))));
						else {
							double d = Math.random();
							i_44_ = (((int) ((double) this.aClass92_5132.anInt741 + d * (double) (this.aClass92_5132.anInt730)) << 16) | ((int) ((double) (this.aClass92_5132.anInt734) * d + (double) (this.aClass92_5132.anInt757)) << 8) | (int) (d * (double) (this.aClass92_5132.anInt737) + (double) (this.aClass92_5132.anInt771)) | ((int) ((Math.random() * (double) (this.aClass92_5132.anInt765)) + (double) (this.aClass92_5132.anInt756)) << 24));
						}
						int i_45_ = (this.aClass92_5132.anInt729);
						if (!var_ha.method1780() && !this.aClass92_5132.aBoolean791)
							i_45_ = -1;
						if (Class361.anInt3089 != Class351.anInt2922) {
							Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = (Class185.aClass246_Sub4_Sub2_Sub1Array1445[Class351.anInt2922]);
							Class351.anInt2922 = Class351.anInt2922 + 1 & 0x3ff;
							class246_sub4_sub2_sub1.method3112(this, i_38_, i_39_, i_40_, i_17_, i_18_, i_19_, i_41_, i_42_, i_44_, i_43_, i_45_, this.aClass92_5132.aBoolean753, this.aClass92_5132.aBoolean778);
						} else {
							Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = (new Class246_Sub4_Sub2_Sub1(this, i_38_, i_39_, i_40_, i_17_, i_18_, i_19_, i_41_, i_42_, i_44_, i_43_, i_45_, this.aClass92_5132.aBoolean753, this.aClass92_5132.aBoolean778));
						}
					}
				}
			}
			if (!this.aClass216_5136.method2795(aClass216_5142, true)) {
				Class216 class216 = aClass216_5142;
				aClass216_5142 = this.aClass216_5136;
				this.aClass216_5136 = class216;
				this.aClass216_5136.anInt1620 = (this.aClass87_5131.anInt668);
				this.aClass216_5136.anInt1626 = (this.aClass87_5131.anInt662);
				this.aClass216_5136.anInt1621 = aClass216_5142.anInt1621;
				this.aClass216_5136.anInt1623 = (this.aClass87_5131.anInt659);
				this.aClass216_5136.anInt1619 = (this.aClass87_5131.anInt670);
				this.aClass216_5136.anInt1628 = (this.aClass87_5131.anInt656);
				this.aClass216_5136.anInt1629 = (this.aClass87_5131.anInt671);
				this.aClass216_5136.anInt1627 = (this.aClass87_5131.anInt664);
				this.aClass216_5136.anInt1617 = aClass216_5142.anInt1617;
				this.aClass216_5136.anInt1625 = (this.aClass87_5131.anInt669);
				this.aClass216_5136.anInt1618 = aClass216_5142.anInt1618;
				this.aClass216_5136.anInt1624 = (this.aClass87_5131.anInt663);
			}
			if (i == -64) {
				this.anInt5135 = 0;
				for (Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = ((Class246_Sub4_Sub2_Sub1) this.aClass218_5140.method2803((byte) 15)); class246_sub4_sub2_sub1 != null; class246_sub4_sub2_sub1 = (Class246_Sub4_Sub2_Sub1) this.aClass218_5140.method2809(false)) {
					class246_sub4_sub2_sub1.method3109(l, i_1_);
					this.anInt5135++;
				}
				Class113.anInt952 += this.anInt5135;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qba.F(" + (var_ha != null ? "{...}" : "null") + ',' + bool + ',' + l + ',' + i + ',' + i_1_ + ')'));
		}
	}

	static final Class42_Sub1_Sub1 method3136(ha_Sub1 var_ha_Sub1, boolean bool, int[] is, int i, byte i_46_, int i_47_, int i_48_, int i_49_) {
		try {
			if (i_46_ != 120)
				return null;
			if (!var_ha_Sub1.aBoolean4426 && (!Class81.method815(i, i_46_ + -120) || !Class81.method815(i_49_, i_46_ + -120))) {
				if (var_ha_Sub1.aBoolean4378)
					return new Class42_Sub1_Sub1(var_ha_Sub1, 34037, i, i_49_, bool, is, i_47_, i_48_);
				return new Class42_Sub1_Sub1(var_ha_Sub1, i, i_49_, Class48.method453(423660257, i), Class48.method453(423660257, i_49_), is);
			}
			return new Class42_Sub1_Sub1(var_ha_Sub1, 3553, i, i_49_, bool, is, i_47_, i_48_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qba.B(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	public static void method3137(int i) {
		try {
			if (i == -6086) {
				aClass79_5138 = null;
				anIntArrayArray5141 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qba.A(" + i + ')');
		}
	}

	final void method3138(int i) {
		do {
			try {
				this.aClass216_5136.anInt1629 = (this.aClass87_5131.anInt671);
				this.aClass216_5136.anInt1624 = (this.aClass87_5131.anInt663);
				this.aClass216_5136.anInt1626 = (this.aClass87_5131.anInt662);
				if (i == -1) {
					this.aClass216_5136.anInt1620 = (this.aClass87_5131.anInt668);
					this.aClass216_5136.anInt1619 = (this.aClass87_5131.anInt670);
					this.aClass216_5136.anInt1627 = (this.aClass87_5131.anInt664);
					this.aClass216_5136.anInt1625 = (this.aClass87_5131.anInt669);
					this.aClass216_5136.anInt1623 = (this.aClass87_5131.anInt659);
					this.aClass216_5136.anInt1628 = (this.aClass87_5131.anInt656);
					if (((this.aClass216_5136.anInt1624) == (this.aClass216_5136.anInt1619)) && ((this.aClass216_5136.anInt1623) == this.aClass216_5136.anInt1624) && ((this.aClass216_5136.anInt1627) == this.aClass216_5136.anInt1620) && (this.aClass216_5136.anInt1625 == this.aClass216_5136.anInt1627) && (this.aClass216_5136.anInt1629 == this.aClass216_5136.anInt1628) && ((this.aClass216_5136.anInt1626) == this.aClass216_5136.anInt1628))
						aBoolean5150 = true;
					else {
						if (!aBoolean5150)
							break;
						aClass216_5142.anInt1623 = this.aClass216_5136.anInt1623;
						aClass216_5142.anInt1625 = this.aClass216_5136.anInt1625;
						aClass216_5142.anInt1624 = this.aClass216_5136.anInt1624;
						aClass216_5142.anInt1620 = this.aClass216_5136.anInt1620;
						aClass216_5142.anInt1629 = this.aClass216_5136.anInt1629;
						aClass216_5142.anInt1627 = this.aClass216_5136.anInt1627;
						aClass216_5142.anInt1626 = this.aClass216_5136.anInt1626;
						aClass216_5142.anInt1619 = this.aClass216_5136.anInt1619;
						aClass216_5142.anInt1628 = this.aClass216_5136.anInt1628;
						aBoolean5150 = false;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qba.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final GameInterfaceData method3139(byte i, int i_50_, int i_51_) {
		try {
			GameInterfaceData class293 = Class159.method2509(i_50_, -9820);
			if (i != 72)
				anIntArrayArray5141 = null;
			if (i_51_ == -1)
				return class293;
			if (class293 == null || class293.interfaceComponents == null || (class293.interfaceComponents.length <= i_51_))
				return null;
			return class293.interfaceComponents[i_51_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qba.D(" + i + ',' + i_50_ + ',' + i_51_ + ')'));
		}
	}

	Class246_Sub9(ha var_ha, Class87 class87, Class246_Sub5 class246_sub5, long l) {
		anInt5137 = 0;
		this.aClass216_5136 = new Class216();
		aClass216_5142 = new Class216();
		aBoolean5150 = false;
		try {
			this.aClass246_Sub5_5133 = class246_sub5;
			this.aClass87_5131 = class87;
			aLong5134 = l;
			this.aClass92_5132 = this.aClass87_5131.method856(0);
			if (!var_ha.method1780() && (this.aClass92_5132.anInt764 != -1))
				this.aClass92_5132 = Class98_Sub45.method1520(this.aClass92_5132.anInt764, 14883);
			this.aClass218_5140 = new Class218();
			anInt5137 += 64.0 * Math.random();
			method3138(-1);
			aClass216_5142.anInt1620 = this.aClass216_5136.anInt1620;
			aClass216_5142.anInt1619 = this.aClass216_5136.anInt1619;
			aClass216_5142.anInt1629 = this.aClass216_5136.anInt1629;
			aClass216_5142.anInt1625 = this.aClass216_5136.anInt1625;
			aClass216_5142.anInt1627 = this.aClass216_5136.anInt1627;
			aClass216_5142.anInt1623 = this.aClass216_5136.anInt1623;
			aClass216_5142.anInt1624 = this.aClass216_5136.anInt1624;
			aClass216_5142.anInt1626 = this.aClass216_5136.anInt1626;
			aClass216_5142.anInt1628 = this.aClass216_5136.anInt1628;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qba.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class87 != null ? "{...}" : "null") + ',' + (class246_sub5 != null ? "{...}" : "null") + ',' + l + ')'));
		}
	}

	static {
		aClass79_5138 = new Class79(64);
	}
}
