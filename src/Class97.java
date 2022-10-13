/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class97 {
	static Class232 aClass232_806;
	int anInt807;
	int[] anIntArray808;
	int anInt809 = -1;
	int[] anIntArray810;
	int[] anIntArray811;
	boolean aBoolean812 = false;
	boolean[] aBooleanArray813;
	static int[][] anIntArrayArray814;
	int[] anIntArray815;
	int anInt816;
	boolean aBoolean817;
	int[] anIntArray818;
	int anInt819;
	int anInt820;
	int anInt821;
	int[][] anIntArrayArray822;
	boolean aBoolean823;
	Class183 aClass183_824;
	boolean aBoolean825;
	int anInt826;
	private int[] anIntArray827;
	int anInt828;
	int anInt829;
	static boolean aBoolean830 = false;
	static float aFloat831;

	final AbstractModel method930(byte i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_, AbstractModel class146, int i_5_) {
		try {
			if (i_4_ <= 73)
				return null;
			int i_6_ = this.anIntArray811[i_1_];
			i_1_ = this.anIntArray818[i_1_];
			Class98_Sub46_Sub16 class98_sub46_sub16 = this.aClass183_824.method2624(2, i_1_ >> 16);
			i_1_ &= 0xffff;
			if (class98_sub46_sub16 == null)
				return class146.method2341(i, i_2_, true);
			Class98_Sub46_Sub16 class98_sub46_sub16_7_ = null;
			if ((this.aBoolean825 || Class357.aBoolean3027) && i_3_ != -1 && this.anIntArray818.length > i_3_) {
				i_3_ = this.anIntArray818[i_3_];
				class98_sub46_sub16_7_ = this.aClass183_824.method2624(2, i_3_ >> 16);
				i_3_ &= 0xffff;
			}
			if (this.aBoolean817)
				i_2_ |= 0x200;
			if (class98_sub46_sub16.method1619(i_1_, 31239))
				i_2_ |= 0x80;
			if (class98_sub46_sub16.method1617(false, i_1_))
				i_2_ |= 0x100;
			if (class98_sub46_sub16.method1615(i_1_, false))
				i_2_ |= 0x400;
			if (class98_sub46_sub16_7_ != null) {
				if (class98_sub46_sub16_7_.method1619(i_3_, 31239))
					i_2_ |= 0x80;
				if (class98_sub46_sub16_7_.method1617(false, i_3_))
					i_2_ |= 0x100;
				if (class98_sub46_sub16_7_.method1615(i_3_, false))
					i_2_ |= 0x400;
			}
			i_2_ |= 0x20;
			AbstractModel class146_8_ = class146.method2341(i, i_2_, true);
			class146_8_.method2338(i_5_ - 1, class98_sub46_sub16, i_1_, class98_sub46_sub16_7_, this.aBoolean817, i_0_, -107, i_6_, i_3_);
			return class146_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gaa.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (class146 != null ? "{...}" : "null") + ',' + i_5_ + ')'));
		}
	}

	static final Class246_Sub3_Sub4 method931(int i, int i_9_, int i_10_, Class var_class) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_9_][i_10_];
		if (class172 == null)
			return null;
		for (Class154 class154 = class172.aClass154_1325; class154 != null; class154 = class154.aClass154_1233) {
			Class246_Sub3_Sub4 class246_sub3_sub4 = class154.aClass246_Sub3_Sub4_1232;
			if (var_class.isAssignableFrom(class246_sub3_sub4.getClass()) && class246_sub3_sub4.aShort6158 == i_9_ && (class246_sub3_sub4.aShort6157 == i_10_))
				return class246_sub3_sub4;
		}
		return null;
	}

	final int method932(boolean bool, int i, boolean bool_11_, int i_12_) {
		try {
			int i_13_ = 0;
			int i_14_ = 0;
			int i_15_ = this.anIntArray818[i];
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_16_ = this.aClass183_824.method2624(2, i_15_ >> 16);
			i_15_ &= 0xffff;
			if (class98_sub46_sub16_16_ == null)
				return i_13_;
			if (bool_11_ != true)
				return -128;
			if ((this.aBoolean825 || Class357.aBoolean3027) && i_12_ != -1 && this.anIntArray818.length > i_12_) {
				i_14_ = this.anIntArray818[i_12_];
				class98_sub46_sub16 = this.aClass183_824.method2624(2, i_14_ >> 16);
				i_14_ &= 0xffff;
			}
			if (this.aBoolean817)
				i_13_ |= 0x200;
			if (class98_sub46_sub16_16_.method1619(i_15_, 31239))
				i_13_ |= 0x80;
			if (class98_sub46_sub16_16_.method1617(false, i_15_))
				i_13_ |= 0x100;
			if (class98_sub46_sub16_16_.method1615(i_15_, false))
				i_13_ |= 0x400;
			if (class98_sub46_sub16 != null) {
				if (class98_sub46_sub16.method1619(i_14_, 31239))
					i_13_ |= 0x80;
				if (class98_sub46_sub16.method1617(false, i_14_))
					i_13_ |= 0x100;
				if (class98_sub46_sub16.method1615(i_14_, false))
					i_13_ |= 0x400;
			}
			if (anIntArray827 != null && bool) {
				if (anIntArray827.length > i) {
					int i_17_ = anIntArray827[i];
					if (i_17_ != 65535) {
						Class98_Sub46_Sub16 class98_sub46_sub16_18_ = this.aClass183_824.method2624(2, i_17_ >> 16);
						i_17_ &= 0xffff;
						if (class98_sub46_sub16_18_ != null) {
							if (class98_sub46_sub16_18_.method1619(i_17_, 31239))
								i_13_ |= 0x80;
							if (class98_sub46_sub16_18_.method1617(false, i_17_))
								i_13_ |= 0x100;
							if (class98_sub46_sub16_18_.method1615(i_17_, false))
								i_13_ |= 0x400;
						}
					}
				}
				if ((this.aBoolean825 || Class357.aBoolean3027) && i_12_ != -1 && i_12_ < anIntArray827.length) {
					int i_19_ = anIntArray827[i_12_];
					if (i_19_ != 65535) {
						Class98_Sub46_Sub16 class98_sub46_sub16_20_ = this.aClass183_824.method2624(2, i_19_ >> 16);
						i_19_ &= 0xffff;
						if (class98_sub46_sub16_20_ != null) {
							if (class98_sub46_sub16_20_.method1619(i_19_, 31239))
								i_13_ |= 0x80;
							if (class98_sub46_sub16_20_.method1617(false, i_19_))
								i_13_ |= 0x100;
							if (class98_sub46_sub16_20_.method1615(i_19_, false))
								i_13_ |= 0x400;
						}
					}
				}
			}
			return 0x20 | i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gaa.J(" + bool + ',' + i + ',' + bool_11_ + ',' + i_12_ + ')'));
		}
	}

	final void method933(RSByteBuffer class98_sub22, int i) {
		do {
			try {
				for (;;) {
					int i_21_ = class98_sub22.readUnsignedByte();
					if (i_21_ == 0)
						break;
					method939(i_21_, class98_sub22, 14735);
				}
				if (i < -92)
					break;
				method938(-54);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gaa.C(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method934(byte i) {
		try {
			aClass232_806 = null;
			if (i == -26)
				anIntArrayArray814 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gaa.E(" + i + ')');
		}
	}

	static final boolean method935(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		try {
			if (i_24_ <= 45)
				return false;
			for (int i_27_ = i_23_; i_27_ <= i_22_; i_27_++) {
				for (int i_28_ = i_25_; i_28_ <= i; i_28_++) {
					if (i_26_ == Class372.anIntArrayArray3149[i_27_][i_28_] && Class64_Sub28.anIntArrayArray3719[i_27_][i_28_] <= 1)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gaa.B(" + i + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	static final void method936(int i, int i_29_) {
		try {
			if (i_29_ == 1024) {
				za_Sub1.anInt6076 = i;
				synchronized (RtMouseListener.aClass79_2493) {
					RtMouseListener.aClass79_2493.method794(87);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gaa.D(" + i + ',' + i_29_ + ')');
		}
	}

	final AbstractModel method937(int i, int i_30_, int i_31_, int i_32_, AbstractModel class146, int i_33_) {
		try {
			int i_34_ = this.anIntArray811[i_33_];
			int i_35_ = this.anIntArray818[i_33_];
			Class98_Sub46_Sub16 class98_sub46_sub16 = this.aClass183_824.method2624(2, i_35_ >> 16);
			i_35_ &= 0xffff;
			if (class98_sub46_sub16 == null)
				return class146.method2341((byte) 1, i_31_, true);
			Class98_Sub46_Sub16 class98_sub46_sub16_36_ = null;
			if ((this.aBoolean825 || Class357.aBoolean3027) && i != -1 && (i < this.anIntArray818.length)) {
				i = this.anIntArray818[i];
				class98_sub46_sub16_36_ = this.aClass183_824.method2624(2, i >> 16);
				i &= 0xffff;
			}
			Class98_Sub46_Sub16 class98_sub46_sub16_37_ = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_38_ = null;
			int i_39_ = 0;
			int i_40_ = 0;
			if (anIntArray827 != null) {
				if (i_33_ < anIntArray827.length) {
					i_39_ = anIntArray827[i_33_];
					if (i_39_ != 65535) {
						class98_sub46_sub16_37_ = this.aClass183_824.method2624(2, i_39_ >> 16);
						i_39_ &= 0xffff;
					}
				}
				if ((this.aBoolean825 || Class357.aBoolean3027) && i != -1 && i < anIntArray827.length) {
					i_40_ = anIntArray827[i];
					if (i_40_ != 65535) {
						class98_sub46_sub16_38_ = this.aClass183_824.method2624(2, i_40_ >> 16);
						i_40_ &= 0xffff;
					}
				}
			}
			if (this.aBoolean817)
				i_31_ |= 0x200;
			if (class98_sub46_sub16.method1619(i_35_, 31239))
				i_31_ |= 0x80;
			if (class98_sub46_sub16.method1617(false, i_35_))
				i_31_ |= 0x100;
			int i_41_ = -53 / ((i_32_ - 6) / 32);
			if (class98_sub46_sub16.method1615(i_35_, false))
				i_31_ |= 0x400;
			if (class98_sub46_sub16_37_ != null) {
				if (class98_sub46_sub16_37_.method1619(i_39_, 31239))
					i_31_ |= 0x80;
				if (class98_sub46_sub16_37_.method1617(false, i_39_))
					i_31_ |= 0x100;
				if (class98_sub46_sub16_37_.method1615(i_39_, false))
					i_31_ |= 0x400;
			}
			if (class98_sub46_sub16_36_ != null) {
				if (class98_sub46_sub16_36_.method1619(i, 31239))
					i_31_ |= 0x80;
				if (class98_sub46_sub16_36_.method1617(false, i))
					i_31_ |= 0x100;
				if (class98_sub46_sub16_36_.method1615(i, false))
					i_31_ |= 0x400;
			}
			if (class98_sub46_sub16_38_ != null) {
				if (class98_sub46_sub16_38_.method1619(i_40_, 31239))
					i_31_ |= 0x80;
				if (class98_sub46_sub16_38_.method1617(false, i_40_))
					i_31_ |= 0x100;
				if (class98_sub46_sub16_38_.method1615(i_40_, false))
					i_31_ |= 0x400;
			}
			i_31_ |= 0x20;
			AbstractModel class146_42_ = class146.method2341((byte) 1, i_31_, true);
			class146_42_.method2338(i_30_ - 1, class98_sub46_sub16, i_35_, class98_sub46_sub16_36_, this.aBoolean817, 0, 119, i_34_, i);
			if (class98_sub46_sub16_37_ != null)
				class146_42_.method2338(-1 + i_30_, class98_sub46_sub16_37_, i_39_, class98_sub46_sub16_38_, this.aBoolean817, 0, -106, i_34_, i_40_);
			return class146_42_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gaa.A(" + i + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + (class146 != null ? "{...}" : "null") + ',' + i_33_ + ')'));
		}
	}

	final void method938(int i) {
		do {
			try {
				do {
					if (this.anInt821 == -1) {
						if (this.aBooleanArray813 == null) {
							this.anInt821 = 0;
							if (!client.aBoolean3553)
								break;
						}
						this.anInt821 = 2;
					}
				} while (false);
				int i_43_ = 79 / ((-52 - i) / 50);
				if (this.anInt816 != -1)
					break;
				if (this.aBooleanArray813 == null)
					this.anInt816 = 0;
				else
					this.anInt816 = 2;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "gaa.I(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method939(int i, RSByteBuffer class98_sub22, int i_44_) {
		try {
			if (i == 1) {
				int i_45_ = class98_sub22.readShort();
				this.anIntArray811 = new int[i_45_];
				for (int i_46_ = 0; i_45_ > i_46_; i_46_++)
					this.anIntArray811[i_46_] = class98_sub22.readShort();
				this.anIntArray818 = new int[i_45_];
				for (int i_47_ = 0; i_47_ < i_45_; i_47_++)
					this.anIntArray818[i_47_] = class98_sub22.readShort();
				for (int i_48_ = 0; i_48_ < i_45_; i_48_++)
					this.anIntArray818[i_48_] = ((class98_sub22.readShort() << 16) - -this.anIntArray818[i_48_]);
			} else if (i == 2)
				this.anInt828 = class98_sub22.readShort();
			else if (i != 3) {
				if (i == 5)
					this.anInt829 = class98_sub22.readUnsignedByte();
				else if (i == 6)
					this.anInt820 = class98_sub22.readShort();
				else if (i != 7) {
					if (i != 8) {
						if (i == 9)
							this.anInt821 = class98_sub22.readUnsignedByte();
						else if (i == 10)
							this.anInt816 = class98_sub22.readUnsignedByte();
						else if (i != 11) {
							if (i != 12) {
								if (i != 13) {
									if (i != 14) {
										if (i == 15)
											this.aBoolean825 = true;
										else if (i != 16) {
											if (i != 18) {
												if (i != 19) {
													if (i == 20) {
														if (((this.anIntArray810) == null) || ((this.anIntArray815) == null)) {
															this.anIntArray810 = (new int[(this.anIntArrayArray822).length]);
															this.anIntArray815 = (new int[(this.anIntArrayArray822).length]);
															for (int i_49_ = 0; ((this.anIntArrayArray822).length > i_49_); i_49_++) {
																this.anIntArray810[i_49_] = 256;
																this.anIntArray815[i_49_] = 256;
															}
														}
														int i_50_ = (class98_sub22.readUnsignedByte());
														this.anIntArray810[i_50_] = (class98_sub22.readShort());
														this.anIntArray815[i_50_] = (class98_sub22.readShort());
													}
												} else {
													if ((this.anIntArray808) == null) {
														this.anIntArray808 = (new int[(this.anIntArrayArray822).length]);
														for (int i_51_ = 0; (i_51_ < (this.anIntArrayArray822).length); i_51_++)
															this.anIntArray808[i_51_] = 255;
													}
													this.anIntArray808[(class98_sub22.readUnsignedByte())] = (class98_sub22.readUnsignedByte());
												}
											} else
												this.aBoolean812 = true;
										} else
											this.aBoolean823 = true;
									} else
										this.aBoolean817 = true;
								} else {
									int i_52_ = class98_sub22.readShort();
									this.anIntArrayArray822 = new int[i_52_][];
									for (int i_53_ = 0; (i_52_ > i_53_); i_53_++) {
										int i_54_ = class98_sub22.readUnsignedByte();
										if (i_54_ > 0) {
											this.anIntArrayArray822[i_53_] = new int[i_54_];
											this.anIntArrayArray822[i_53_][0] = (class98_sub22.readMedium(Class369.method3953(i_44_, -14837)));
											for (int i_55_ = 1; (i_54_ > i_55_); i_55_++)
												this.anIntArrayArray822[i_53_][i_55_] = (class98_sub22.readShort());
										}
									}
								}
							} else {
								int i_56_ = class98_sub22.readUnsignedByte();
								anIntArray827 = new int[i_56_];
								for (int i_57_ = 0; i_57_ < i_56_; i_57_++)
									anIntArray827[i_57_] = class98_sub22.readShort();
								for (int i_58_ = 0; i_58_ < i_56_; i_58_++)
									anIntArray827[i_58_] = ((class98_sub22.readShort() << 16) - -anIntArray827[i_58_]);
							}
						} else
							this.anInt819 = class98_sub22.readUnsignedByte();
					} else
						this.anInt807 = class98_sub22.readUnsignedByte();
				} else
					this.anInt809 = class98_sub22.readShort();
			} else {
				this.aBooleanArray813 = new boolean[256];
				int i_59_ = class98_sub22.readUnsignedByte();
				for (int i_60_ = 0; i_59_ > i_60_; i_60_++)
					this.aBooleanArray813[class98_sub22.readUnsignedByte()] = true;
			}
			if (i_44_ != 14735)
				method938(-80);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gaa.H(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_44_ + ')'));
		}
	}

	public Class97() {
		this.anInt807 = 99;
		this.anInt821 = -1;
		this.anInt819 = 2;
		this.anInt820 = -1;
		this.anInt816 = -1;
		this.aBoolean817 = false;
		this.aBoolean823 = false;
		this.aBoolean825 = false;
		this.anInt829 = 5;
		this.anInt828 = -1;
	}

	static {
		aClass232_806 = new Class232();
	}
}
