/* Class98_Sub10_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub35 extends Class98_Sub10 {
	boolean aBoolean5731 = true;
	static boolean aBoolean5732 = false;
	int anInt5733;
	int anInt5734;
	private byte[] aByteArray5735 = new byte[512];
	private short[] aShortArray5736;
	int anInt5737;
	private short[] aShortArray5738;
	int anInt5739;
	int anInt5740;

	public Class98_Sub10_Sub35() {
		super(0, true);
		this.anInt5734 = 4;
		this.anInt5733 = 4;
		this.anInt5739 = 1638;
		this.anInt5737 = 4;
		this.anInt5740 = 0;
	}

	final void method1001(byte i) {
		while_217_: do {
			try {
				aByteArray5735 = Class279.method3323((this.anInt5740), 512);
				method1108(-49);
				if (i != 66)
					aByteArray5735 = null;
				for (int i_0_ = this.anInt5733 + -1; i_0_ >= 1; i_0_--) {
					short i_1_ = aShortArray5736[i_0_];
					if (i_1_ > 8)
						break while_217_;
					if (i_1_ < -8)
						break;
					this.anInt5733--;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "u.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1107(byte i, int[] is, int i_2_) {
		try {
			int i_3_ = (this.anInt5737 * Class352.anIntArray3001[i_2_]);
			if (i > -65)
				method1001((byte) 102);
			if (this.anInt5733 == 1) {
				int i_4_ = aShortArray5736[0];
				int i_5_ = aShortArray5738[0] << 12;
				int i_6_ = (i_5_ * this.anInt5734 >> 12);
				int i_7_ = (this.anInt5737 * i_5_ >> 12);
				int i_8_ = i_5_ * i_3_ >> 12;
				int i_9_ = i_8_ >> 12;
				int i_10_ = i_9_ + 1;
				if (i_7_ <= i_10_)
					i_10_ = 0;
				i_8_ &= 0xfff;
				int i_11_ = 0xff & aByteArray5735[0xff & i_9_];
				int i_12_ = Class151_Sub8.anIntArray5014[i_8_];
				int i_13_ = aByteArray5735[i_10_ & 0xff] & 0xff;
				if (!this.aBoolean5731) {
					for (int i_14_ = 0; i_14_ < Class25.anInt268; i_14_++) {
						int i_15_ = (Class64_Sub1.anIntArray3640[i_14_] * this.anInt5734);
						int i_16_ = method1109(i_12_, i_6_, 2471, i_15_ * i_5_ >> 12, i_13_, i_11_, i_8_);
						is[i_14_] = i_16_ * i_4_ >> 12;
					}
				} else {
					for (int i_17_ = 0; (i_17_ < Class25.anInt268); i_17_++) {
						int i_18_ = (Class64_Sub1.anIntArray3640[i_17_] * this.anInt5734);
						int i_19_ = method1109(i_12_, i_6_, 2471, i_18_ * i_5_ >> 12, i_13_, i_11_, i_8_);
						i_19_ = i_4_ * i_19_ >> 12;
						is[i_17_] = (i_19_ >> 1) + 2048;
					}
				}
			} else {
				int i_20_ = aShortArray5736[0];
				if (i_20_ > 8 || i_20_ < -8) {
					int i_21_ = aShortArray5738[0] << 12;
					int i_22_ = (this.anInt5734 * i_21_ >> 12);
					int i_23_ = (i_21_ * this.anInt5737 >> 12);
					int i_24_ = i_3_ * i_21_ >> 12;
					int i_25_ = i_24_ >> 12;
					int i_26_ = 1 + i_25_;
					i_24_ &= 0xfff;
					if (i_23_ <= i_26_)
						i_26_ = 0;
					int i_27_ = aByteArray5735[0xff & i_25_] & 0xff;
					int i_28_ = Class151_Sub8.anIntArray5014[i_24_];
					int i_29_ = 0xff & aByteArray5735[0xff & i_26_];
					for (int i_30_ = 0; (Class25.anInt268 > i_30_); i_30_++) {
						int i_31_ = (this.anInt5734 * Class64_Sub1.anIntArray3640[i_30_]);
						int i_32_ = method1109(i_28_, i_22_, 2471, i_31_ * i_21_ >> 12, i_29_, i_27_, i_24_);
						is[i_30_] = i_32_ * i_20_ >> 12;
					}
				}
				for (int i_33_ = 1; (this.anInt5733 > i_33_); i_33_++) {
					i_20_ = aShortArray5736[i_33_];
					if (i_20_ > 8 || i_20_ < -8) {
						int i_34_ = aShortArray5738[i_33_] << 12;
						int i_35_ = (i_34_ * this.anInt5734 >> 12);
						int i_36_ = i_34_ * i_3_ >> 12;
						int i_37_ = (this.anInt5737 * i_34_ >> 12);
						int i_38_ = i_36_ >> 12;
						int i_39_ = i_38_ + 1;
						i_36_ &= 0xfff;
						if (i_37_ <= i_39_)
							i_39_ = 0;
						int i_40_ = 0xff & aByteArray5735[0xff & i_39_];
						int i_41_ = Class151_Sub8.anIntArray5014[i_36_];
						int i_42_ = 0xff & aByteArray5735[i_38_ & 0xff];
						if (this.aBoolean5731 && (-1 + this.anInt5733 == i_33_)) {
							for (int i_43_ = 0; (i_43_ < Class25.anInt268); i_43_++) {
								int i_44_ = (this.anInt5734 * Class64_Sub1.anIntArray3640[i_43_]);
								int i_45_ = method1109(i_41_, i_35_, 2471, i_34_ * i_44_ >> 12, i_40_, i_42_, i_36_);
								i_45_ = is[i_43_] - -(i_45_ * i_20_ >> 12);
								is[i_43_] = 2048 + (i_45_ >> 1);
							}
						} else {
							for (int i_46_ = 0; (Class25.anInt268 > i_46_); i_46_++) {
								int i_47_ = (Class64_Sub1.anIntArray3640[i_46_] * (this.anInt5734));
								int i_48_ = method1109(i_41_, i_35_, 2471, i_47_ * i_34_ >> 12, i_40_, i_42_, i_36_);
								is[i_46_] += i_20_ * i_48_ >> 12;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("u.H(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_49_) {
		do {
			try {
				int i_50_ = i;
				while_222_: do {
					while_221_: do {
						while_220_: do {
							while_219_: do {
								while_218_: do {
									do {
										if (i_50_ != 0) {
											if (i_50_ != 1) {
												if (i_50_ != 2) {
													if (i_50_ != 3) {
														if (i_50_ != 4) {
															if (i_50_ != 5) {
																if (i_50_ == 6)
																	break while_221_;
																break while_222_;
															}
														} else
															break while_219_;
														break while_220_;
													}
												} else
													break;
												break while_218_;
											}
										} else {
											this.aBoolean5731 = class98_sub22.readUnsignedByte() == 1;
											break while_222_;
										}
										this.anInt5733 = class98_sub22.readUnsignedByte();
										break while_222_;
									} while (false);
									this.anInt5739 = class98_sub22.readUShort(false);
									if (this.anInt5739 < 0) {
										aShortArray5736 = new short[this.anInt5733];
										for (i_50_ = 0; ((this.anInt5733) > i_50_); i_50_++)
											aShortArray5736[i_50_] = (short) (class98_sub22.readUShort(false));
									}
									break while_222_;
								} while (false);
								this.anInt5734 = this.anInt5737 = class98_sub22.readUnsignedByte();
								break while_222_;
							} while (false);
							this.anInt5740 = class98_sub22.readUnsignedByte();
							break while_222_;
						} while (false);
						this.anInt5734 = class98_sub22.readUnsignedByte();
						break while_222_;
					} while (false);
					this.anInt5737 = class98_sub22.readUnsignedByte();
				} while (false);
				if (i_49_ <= -92)
					break;
				aByteArray5735 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("u.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_49_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method1108(int i) {
		try {
			int i_51_ = -124 % ((i - 9) / 49);
			if (this.anInt5739 <= 0) {
				if (aShortArray5736 != null && (aShortArray5736.length == this.anInt5733)) {
					aShortArray5738 = new short[this.anInt5733];
					for (int i_52_ = 0; i_52_ < this.anInt5733; i_52_++)
						aShortArray5738[i_52_] = (short) (int) Math.pow(2.0, i_52_);
				}
			} else {
				aShortArray5736 = new short[this.anInt5733];
				aShortArray5738 = new short[this.anInt5733];
				for (int i_53_ = 0; this.anInt5733 > i_53_; i_53_++) {
					aShortArray5736[i_53_] = (short) (int) (4096.0 * (Math.pow((float) this.anInt5739 / 4096.0F, i_53_)));
					aShortArray5738[i_53_] = (short) (int) Math.pow(2.0, i_53_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "u.K(" + i + ')');
		}
	}

	final int[] method990(int i, int i_54_) {
		try {
			if (i != 255)
				aByteArray5735 = null;
			int[] is = this.aClass16_3863.method237((byte) 98, i_54_);
			if (this.aClass16_3863.aBoolean198)
				method1107((byte) -81, is, i_54_);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "u.G(" + i + ',' + i_54_ + ')');
		}
	}

	private final int method1109(int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
		try {
			int i_61_ = i_57_ >> 12;
			int i_62_ = 1 + i_61_;
			if (i_55_ <= i_62_)
				i_62_ = 0;
			i_61_ &= 0xff;
			i_57_ &= 0xfff;
			int i_63_ = i_57_ - 4096;
			if (i_56_ != 2471)
				method1109(63, -5, -64, -95, -78, -54, -54);
			int i_64_ = i_60_ - 4096;
			i_62_ &= 0xff;
			int i_65_ = Class151_Sub8.anIntArray5014[i_57_];
			int i_66_ = 0x3 & aByteArray5735[i_61_ + i_59_];
			int i_67_;
			if (i_66_ <= 1)
				i_67_ = i_66_ != 0 ? -i_57_ + i_60_ : i_57_ - -i_60_;
			else
				i_67_ = i_66_ == 2 ? i_57_ - i_60_ : -i_60_ + -i_57_;
			i_66_ = 0x3 & aByteArray5735[i_62_ + i_59_];
			int i_68_;
			if (i_66_ <= 1)
				i_68_ = (i_66_ != 0 ? -i_63_ + i_60_ : i_63_ + i_60_);
			else
				i_68_ = i_66_ != 2 ? -i_63_ + -i_60_ : i_63_ - i_60_;
			int i_69_ = (i_65_ * (i_68_ - i_67_) >> 12) + i_67_;
			i_66_ = aByteArray5735[i_58_ + i_61_] & 0x3;
			if (i_66_ <= 1)
				i_67_ = (i_66_ != 0 ? i_64_ - i_57_ : i_57_ + i_64_);
			else
				i_67_ = i_66_ == 2 ? i_57_ - i_64_ : -i_64_ + -i_57_;
			i_66_ = 0x3 & aByteArray5735[i_62_ + i_58_];
			if (i_66_ > 1)
				i_68_ = i_66_ != 2 ? -i_63_ + -i_64_ : i_63_ - i_64_;
			else
				i_68_ = i_66_ != 0 ? i_64_ - i_63_ : i_63_ + i_64_;
			int i_70_ = i_67_ + ((i_68_ - i_67_) * i_65_ >> 12);
			return i_69_ + (i * (i_70_ - i_69_) >> 12);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("u.J(" + i + ',' + i_55_ + ',' + i_56_ + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ')'));
		}
	}
}
