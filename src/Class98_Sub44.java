/* Class98_Sub44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub44 extends Node {
	Class98_Sub24_Sub1[] aClass98_Sub24_Sub1Array4244;
	static Class113 aClass113_4245 = new Class113(3, 2);
	private int[] anIntArray4246;
	byte[] aByteArray4247;
	short[] aShortArray4248;
	int anInt4249;
	byte[] aByteArray4250;
	Class89[] aClass89Array4251;
	byte[] aByteArray4252;

	static final void method1512(boolean bool) {
		try {
			for (Class246_Sub2 class246_sub2 = ((Class246_Sub2) Class151_Sub2.aClass218_4973.method2805((byte) -72)); class246_sub2 != null; class246_sub2 = (Class246_Sub2) Class151_Sub2.aClass218_4973.method2805((byte) -72))
				MapRegion.method3572(20, class246_sub2);
			if (bool != true)
				method1512(false);
			int i;
			int i_0_;
			if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076.method564((byte) 120) != 1)
				i_0_ = i = Class115.anInt963;
			else {
				i = 3;
				i_0_ = 0;
			}
			client.method114();
			for (int i_1_ = i_0_; i >= i_1_; i_1_++) {
				client.method101();
				client.method105(i_1_);
				client.method110(i_1_);
			}
			client.method113();
			client.method115();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tba.D(" + bool + ')');
		}
	}

	final void method1513(boolean bool) {
		try {
			if (bool != true)
				method1515(-105);
			anIntArray4246 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tba.E(" + bool + ')');
		}
	}

	static final boolean method1514(int i, int i_2_) {
		try {
			if (i >= -127)
				aClass113_4245 = null;
			for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315.method2418(32)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315.method2417(96))) {
				if (Class36.method340(class98_sub46_sub8.anInt5990, (byte) -38) && (class98_sub46_sub8.aLong5987 == (long) i_2_))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tba.F(" + i + ',' + i_2_ + ')');
		}
	}

	static final void method1515(int i) {
		try {
			Class301.method3543(16535);
			if (i != 2)
				method1514(-31, -6);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tba.B(" + i + ')');
		}
	}

	public Class98_Sub44() {
		/* empty */
	}

	public static void method1516(int i) {
		try {
			if (i == 0)
				aClass113_4245 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tba.C(" + i + ')');
		}
	}

	Class98_Sub44(byte[] is) {
		try {
			anIntArray4246 = new int[128];
			this.aByteArray4250 = new byte[128];
			this.aClass98_Sub24_Sub1Array4244 = new Class98_Sub24_Sub1[128];
			this.aByteArray4247 = new byte[128];
			this.aByteArray4252 = new byte[128];
			this.aShortArray4248 = new short[128];
			this.aClass89Array4251 = new Class89[128];
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			int i;
			for (i = 0; ((class98_sub22.data[i + class98_sub22.position]) != 0); i++) {
				/* empty */
			}
			byte[] is_3_ = new byte[i];
			for (int i_4_ = 0; i > i_4_; i_4_++)
				is_3_[i_4_] = class98_sub22.readSignedByte();
			i++;
			class98_sub22.position++;
			int i_5_ = class98_sub22.position;
			class98_sub22.position += i;
			int i_6_;
			for (i_6_ = 0; ((class98_sub22.data[i_6_ + class98_sub22.position]) != 0); i_6_++) {
				/* empty */
			}
			byte[] is_7_ = new byte[i_6_];
			for (int i_8_ = 0; i_6_ > i_8_; i_8_++)
				is_7_[i_8_] = class98_sub22.readSignedByte();
			i_6_++;
			class98_sub22.position++;
			int i_9_ = class98_sub22.position;
			class98_sub22.position += i_6_;
			int i_10_;
			for (i_10_ = 0; ((class98_sub22.data[i_10_ + class98_sub22.position]) != 0); i_10_++) {
				/* empty */
			}
			byte[] is_11_ = new byte[i_10_];
			for (int i_12_ = 0; i_10_ > i_12_; i_12_++)
				is_11_[i_12_] = class98_sub22.readSignedByte();
			class98_sub22.position++;
			byte[] is_13_ = new byte[++i_10_];
			int i_14_;
			if (i_10_ <= 1)
				i_14_ = i_10_;
			else {
				is_13_[1] = (byte) 1;
				i_14_ = 2;
				int i_15_ = 1;
				for (int i_16_ = 2; i_10_ > i_16_; i_16_++) {
					int i_17_ = class98_sub22.readUnsignedByte();
					if (i_17_ != 0) {
						if (i_17_ <= i_15_)
							i_17_--;
						i_15_ = i_17_;
					} else
						i_15_ = i_14_++;
					is_13_[i_16_] = (byte) i_15_;
				}
			}
			Class89[] class89s = new Class89[i_14_];
			for (int i_18_ = 0; i_18_ < class89s.length; i_18_++) {
				Class89 class89 = class89s[i_18_] = new Class89();
				int i_19_ = class98_sub22.readUnsignedByte();
				if (i_19_ > 0)
					class89.aByteArray714 = new byte[2 * i_19_];
				i_19_ = class98_sub22.readUnsignedByte();
				if (i_19_ > 0) {
					class89.aByteArray713 = new byte[i_19_ * 2 + 2];
					class89.aByteArray713[1] = (byte) 64;
				}
			}
			int i_20_ = class98_sub22.readUnsignedByte();
			byte[] is_21_ = i_20_ > 0 ? new byte[i_20_ * 2] : null;
			i_20_ = class98_sub22.readUnsignedByte();
			byte[] is_22_ = i_20_ > 0 ? new byte[2 * i_20_] : null;
			int i_23_;
			for (i_23_ = 0; ((class98_sub22.data[class98_sub22.position - -i_23_]) != 0); i_23_++) {
				/* empty */
			}
			byte[] is_24_ = new byte[i_23_];
			for (int i_25_ = 0; i_25_ < i_23_; i_25_++)
				is_24_[i_25_] = class98_sub22.readSignedByte();
			i_23_++;
			class98_sub22.position++;
			int i_26_ = 0;
			for (int i_27_ = 0; i_27_ < 128; i_27_++) {
				i_26_ += class98_sub22.readUnsignedByte();
				this.aShortArray4248[i_27_] = (short) i_26_;
			}
			i_26_ = 0;
			for (int i_28_ = 0; i_28_ < 128; i_28_++) {
				i_26_ += class98_sub22.readUnsignedByte();
				this.aShortArray4248[i_28_] += i_26_ << 8;
			}
			int i_29_ = 0;
			int i_30_ = 0;
			int i_31_ = 0;
			for (int i_32_ = 0; i_32_ < 128; i_32_++) {
				if (i_29_ == 0) {
					if (i_30_ >= is_24_.length)
						i_29_ = -1;
					else
						i_29_ = is_24_[i_30_++];
					i_31_ = class98_sub22.method1240((byte) -20);
				}
				this.aShortArray4248[i_32_] += Class202.method2702(32768, -1 + i_31_ << 14);
				anIntArray4246[i_32_] = i_31_;
				i_29_--;
			}
			i_29_ = 0;
			i_30_ = 0;
			int i_33_ = 0;
			for (int i_34_ = 0; i_34_ < 128; i_34_++) {
				if (anIntArray4246[i_34_] != 0) {
					if (i_29_ == 0) {
						i_33_ = -1 + (class98_sub22.data[i_5_++]);
						if (i_30_ >= is_3_.length)
							i_29_ = -1;
						else
							i_29_ = is_3_[i_30_++];
					}
					this.aByteArray4250[i_34_] = (byte) i_33_;
					i_29_--;
				}
			}
			i_29_ = 0;
			i_30_ = 0;
			int i_35_ = 0;
			for (int i_36_ = 0; i_36_ < 128; i_36_++) {
				if (anIntArray4246[i_36_] != 0) {
					if (i_29_ == 0) {
						i_35_ = (class98_sub22.data[i_9_++]) + 16 << 2;
						if (is_7_.length > i_30_)
							i_29_ = is_7_[i_30_++];
						else
							i_29_ = -1;
					}
					i_29_--;
					this.aByteArray4247[i_36_] = (byte) i_35_;
				}
			}
			i_29_ = 0;
			i_30_ = 0;
			Class89 class89 = null;
			for (int i_37_ = 0; i_37_ < 128; i_37_++) {
				if (anIntArray4246[i_37_] != 0) {
					if (i_29_ == 0) {
						class89 = class89s[is_13_[i_30_]];
						if (is_11_.length <= i_30_)
							i_29_ = -1;
						else
							i_29_ = is_11_[i_30_++];
					}
					i_29_--;
					this.aClass89Array4251[i_37_] = class89;
				}
			}
			i_30_ = 0;
			i_29_ = 0;
			int i_38_ = 0;
			for (int i_39_ = 0; i_39_ < 128; i_39_++) {
				if (i_29_ == 0) {
					if (is_24_.length <= i_30_)
						i_29_ = -1;
					else
						i_29_ = is_24_[i_30_++];
					if (anIntArray4246[i_39_] > 0)
						i_38_ = class98_sub22.readUnsignedByte() - -1;
				}
				this.aByteArray4252[i_39_] = (byte) i_38_;
				i_29_--;
			}
			this.anInt4249 = 1 + class98_sub22.readUnsignedByte();
			for (int i_40_ = 0; i_14_ > i_40_; i_40_++) {
				Class89 class89_41_ = class89s[i_40_];
				if (class89_41_.aByteArray714 != null) {
					for (int i_42_ = 1; class89_41_.aByteArray714.length > i_42_; i_42_ += 2)
						class89_41_.aByteArray714[i_42_] = class98_sub22.readSignedByte();
				}
				if (class89_41_.aByteArray713 != null) {
					for (int i_43_ = 3; (i_43_ < class89_41_.aByteArray713.length - 2); i_43_ += 2)
						class89_41_.aByteArray713[i_43_] = class98_sub22.readSignedByte();
				}
			}
			if (is_21_ != null) {
				for (int i_44_ = 1; i_44_ < is_21_.length; i_44_ += 2)
					is_21_[i_44_] = class98_sub22.readSignedByte();
			}
			if (is_22_ != null) {
				for (int i_45_ = 1; i_45_ < is_22_.length; i_45_ += 2)
					is_22_[i_45_] = class98_sub22.readSignedByte();
			}
			for (int i_46_ = 0; i_14_ > i_46_; i_46_++) {
				Class89 class89_47_ = class89s[i_46_];
				if (class89_47_.aByteArray713 != null) {
					i_26_ = 0;
					for (int i_48_ = 2; class89_47_.aByteArray713.length > i_48_; i_48_ += 2) {
						i_26_ = class98_sub22.readUnsignedByte() + (i_26_ - -1);
						class89_47_.aByteArray713[i_48_] = (byte) i_26_;
					}
				}
			}
			for (int i_49_ = 0; i_49_ < i_14_; i_49_++) {
				Class89 class89_50_ = class89s[i_49_];
				if (class89_50_.aByteArray714 != null) {
					i_26_ = 0;
					for (int i_51_ = 2; (i_51_ < class89_50_.aByteArray714.length); i_51_ += 2) {
						i_26_ -= -1 - class98_sub22.readUnsignedByte();
						class89_50_.aByteArray714[i_51_] = (byte) i_26_;
					}
				}
			}
			if (is_21_ != null) {
				i_26_ = class98_sub22.readUnsignedByte();
				is_21_[0] = (byte) i_26_;
				for (int i_52_ = 2; is_21_.length > i_52_; i_52_ += 2) {
					i_26_ = class98_sub22.readUnsignedByte() + 1 + i_26_;
					is_21_[i_52_] = (byte) i_26_;
				}
				int i_53_ = is_21_[0];
				int i_54_ = is_21_[1];
				for (int i_55_ = 0; i_55_ < i_53_; i_55_++)
					this.aByteArray4252[i_55_] = (byte) ((this.aByteArray4252[i_55_] * i_54_) - -32 >> 6);
				int i_56_ = 2;
				while (is_21_.length > i_56_) {
					int i_57_ = is_21_[i_56_];
					int i_58_ = is_21_[i_56_ - -1];
					int i_59_ = (i_57_ - i_53_) * i_54_ - -((-i_53_ + i_57_) / 2);
					for (int i_60_ = i_53_; i_60_ < i_57_; i_60_++) {
						int i_61_ = Class64_Sub26.method658(749908671, i_59_, i_57_ - i_53_);
						this.aByteArray4252[i_60_] = (byte) (i_61_ * (this.aByteArray4252[i_60_]) - -32 >> 6);
						i_59_ += -i_54_ + i_58_;
					}
					i_56_ += 2;
					i_54_ = i_58_;
					i_53_ = i_57_;
				}
				Object object = null;
				for (int i_62_ = i_53_; i_62_ < 128; i_62_++)
					this.aByteArray4252[i_62_] = (byte) ((this.aByteArray4252[i_62_] * i_54_) + 32 >> 6);
			}
			if (is_22_ != null) {
				i_26_ = class98_sub22.readUnsignedByte();
				is_22_[0] = (byte) i_26_;
				for (int i_63_ = 2; is_22_.length > i_63_; i_63_ += 2) {
					i_26_ = i_26_ - -1 - -class98_sub22.readUnsignedByte();
					is_22_[i_63_] = (byte) i_26_;
				}
				int i_64_ = is_22_[0];
				int i_65_ = is_22_[1] << 1;
				for (int i_66_ = 0; i_64_ > i_66_; i_66_++) {
					int i_67_ = ((0xff & this.aByteArray4247[i_66_]) + i_65_);
					if (i_67_ < 0)
						i_67_ = 0;
					if (i_67_ > 128)
						i_67_ = 128;
					this.aByteArray4247[i_66_] = (byte) i_67_;
				}
				int i_68_ = 2;
				while (i_68_ < is_22_.length) {
					int i_69_ = is_22_[i_68_];
					int i_70_ = is_22_[1 + i_68_] << 1;
					int i_71_ = (-i_64_ + i_69_) / 2 + i_65_ * (-i_64_ + i_69_);
					for (int i_72_ = i_64_; i_69_ > i_72_; i_72_++) {
						int i_73_ = Class64_Sub26.method658(749908671, i_71_, i_69_ - i_64_);
						int i_74_ = (i_73_ + (this.aByteArray4247[i_72_] & 0xff));
						if (i_74_ < 0)
							i_74_ = 0;
						if (i_74_ > 128)
							i_74_ = 128;
						this.aByteArray4247[i_72_] = (byte) i_74_;
						i_71_ += i_70_ + -i_65_;
					}
					i_68_ += 2;
					i_65_ = i_70_;
					i_64_ = i_69_;
				}
				for (int i_75_ = i_64_; i_75_ < 128; i_75_++) {
					int i_76_ = i_65_ + (0xff & (this.aByteArray4247[i_75_]));
					if (i_76_ < 0)
						i_76_ = 0;
					if (i_76_ > 128)
						i_76_ = 128;
					this.aByteArray4247[i_75_] = (byte) i_76_;
				}
				Object object = null;
			}
			for (int i_77_ = 0; i_14_ > i_77_; i_77_++)
				class89s[i_77_].anInt707 = class98_sub22.readUnsignedByte();
			for (int i_78_ = 0; i_78_ < i_14_; i_78_++) {
				Class89 class89_79_ = class89s[i_78_];
				if (class89_79_.aByteArray714 != null)
					class89_79_.anInt711 = class98_sub22.readUnsignedByte();
				if (class89_79_.aByteArray713 != null)
					class89_79_.anInt715 = class98_sub22.readUnsignedByte();
				if (class89_79_.anInt707 > 0)
					class89_79_.anInt712 = class98_sub22.readUnsignedByte();
			}
			for (int i_80_ = 0; i_14_ > i_80_; i_80_++)
				class89s[i_80_].anInt710 = class98_sub22.readUnsignedByte();
			for (int i_81_ = 0; i_14_ > i_81_; i_81_++) {
				Class89 class89_82_ = class89s[i_81_];
				if (class89_82_.anInt710 > 0)
					class89_82_.anInt708 = class98_sub22.readUnsignedByte();
			}
			for (int i_83_ = 0; i_83_ < i_14_; i_83_++) {
				Class89 class89_84_ = class89s[i_83_];
				if (class89_84_.anInt708 > 0)
					class89_84_.anInt717 = class98_sub22.readUnsignedByte();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tba.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method1517(byte[] is, Class308 class308, byte i, int[] is_85_) {
		try {
			boolean bool = true;
			if (i > -116)
				return false;
			int i_86_ = 0;
			Class98_Sub24_Sub1 class98_sub24_sub1 = null;
			for (int i_87_ = 0; i_87_ < 128; i_87_++) {
				if (is == null || is[i_87_] != 0) {
					int i_88_ = anIntArray4246[i_87_];
					if (i_88_ != 0) {
						if (i_86_ != i_88_) {
							i_86_ = i_88_;
							i_88_--;
							if ((0x1 & i_88_) != 0)
								class98_sub24_sub1 = class308.method3613(i_88_ >> 2, true, is_85_);
							else
								class98_sub24_sub1 = class308.method3611(-2, i_88_ >> 2, is_85_);
							if (class98_sub24_sub1 == null)
								bool = false;
						}
						if (class98_sub24_sub1 != null) {
							this.aClass98_Sub24_Sub1Array4244[i_87_] = class98_sub24_sub1;
							anIntArray4246[i_87_] = 0;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tba.A(" + (is != null ? "{...}" : "null") + ',' + (class308 != null ? "{...}" : "null") + ',' + i + ',' + (is_85_ != null ? "{...}" : "null") + ')'));
		}
	}
}
