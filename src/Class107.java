/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107 {
	boolean aBoolean909;
	int anInt910 = -1;
	private short[] aShortArray911;
	static String aString912;
	private short[] aShortArray913;
	private int anInt914;
	private int anInt915;
	private int anInt916;
	private int anInt917;
	private int anInt918;
	private short[] aShortArray919;
	private int anInt920;
	Class304 aClass304_921;
	private short[] aShortArray922;
	byte aByte923;
	private int anInt924;
	int anInt925;

	static final int method1720(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i_2_ &= 0x3;
			if (i_2_ == 0)
				return i;
			if (i_2_ == 1)
				return i_1_;
			if (i_0_ != 0)
				aString912 = null;
			if (i_2_ == 2)
				return -i + 7;
			return -i_1_ + 7;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final AbstractModel method1721(ha var_ha, int i, int i_3_, int i_4_, Class183 class183, int i_5_, int i_6_) {
		try {
			if (i_3_ != 21945)
				method1724(49, -89, -82, -97);
			return method1723(i_4_, i_6_, 0, i, null, null, 0, (byte) 5, class183, false, var_ha, false, 0, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.D(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + (class183 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final AbstractModel method1722(ha var_ha, Class183 class183, int i, int i_7_, int i_8_, boolean bool, s var_s, int i_9_, int i_10_, s var_s_11_, int i_12_, int i_13_, byte i_14_) {
		try {
			if (i_14_ != 2)
				return null;
			return method1723(i_7_, i, i_9_, i_13_, var_s_11_, var_s, i_8_, (byte) 2, class183, false, var_ha, bool, i_12_, i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.B(" + (var_ha != null ? "{...}" : "null") + ',' + (class183 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + (var_s != null ? "{...}" : "null") + ',' + i_9_ + ',' + i_10_ + ',' + (var_s_11_ != null ? "{...}" : "null") + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	private final AbstractModel method1723(int i, int i_15_, int i_16_, int i_17_, s var_s, s var_s_18_, int i_19_, byte i_20_, Class183 class183, boolean bool, ha var_ha, boolean bool_21_, int i_22_, int i_23_) {
		try {
			int i_24_ = i;
			Class97 class97 = ((this.anInt910 == -1 || i_15_ == -1) ? null : class183.method2623(this.anInt910, 16383));
			bool_21_ = bool_21_ & this.aByte923 != 0;
			if (bool != false)
				anInt918 = 18;
			if (class97 != null)
				i_24_ |= class97.method932(false, i_15_, true, i_17_);
			if (bool_21_)
				i_24_ = i_24_ | (this.aByte923 != 3 ? 2 : 7);
			if (anInt916 != 128)
				i_24_ |= 0x2;
			if (anInt920 != 128 || anInt924 != 0)
				i_24_ |= 0x5;
			AbstractModel class146;
			synchronized (this.aClass304_921.aClass79_2537) {
				class146 = (AbstractModel) (this.aClass304_921.aClass79_2537.get(this.anInt925 |= (var_ha.anInt937 << 29)));
			}
			if (class146 == null || var_ha.c(class146.ua(), i_24_) != 0) {
				if (class146 != null)
					i_24_ = var_ha.method1777(i_24_, class146.ua());
				int i_25_ = i_24_;
				if (aShortArray922 != null)
					i_25_ |= 0x4000;
				if (aShortArray913 != null)
					i_25_ |= 0x8000;
				ModelDefinitions class178 = Class98_Sub6.method981(0, -9252, (this.aClass304_921.aClass207_2536), anInt914);
				if (class178 == null)
					return null;
				if (class178.anInt1387 < 13)
					class178.method2592(13746, 2);
				class146 = var_ha.method1790(class178, i_25_, (this.aClass304_921.anInt2539), 64 + anInt915, 850 + anInt917);
				if (aShortArray922 != null) {
					for (int i_26_ = 0; i_26_ < aShortArray922.length; i_26_++)
						class146.ia(aShortArray922[i_26_], aShortArray919[i_26_]);
				}
				if (aShortArray913 != null) {
					for (int i_27_ = 0; aShortArray913.length > i_27_; i_27_++)
						class146.aa(aShortArray913[i_27_], aShortArray911[i_27_]);
				}
				class146.s(i_24_);
				synchronized (this.aClass304_921.aClass79_2537) {
					this.aClass304_921.aClass79_2537.put(this.anInt925 |= var_ha.anInt937 << 29, class146);
				}
			}
			AbstractModel class146_28_ = (class97 != null ? class97.method930(i_20_, 0, i_15_, i_24_, i_17_, (byte) 86, class146, i_23_) : class146.method2341(i_20_, i_24_, true));
			if (anInt920 != 128 || anInt916 != 128)
				class146_28_.O(anInt920, anInt916, anInt920);
			if (anInt924 != 0) {
				if (anInt924 == 90)
					class146_28_.a(4096);
				if (anInt924 == 180)
					class146_28_.a(8192);
				if (anInt924 == 270)
					class146_28_.a(12288);
			}
			if (bool_21_)
				class146_28_.p(this.aByte923, anInt918, var_s, var_s_18_, i_19_, i_16_, i_22_);
			class146_28_.s(i);
			return class146_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.C(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + (var_s != null ? "{...}" : "null") + ',' + (var_s_18_ != null ? "{...}" : "null") + ',' + i_19_ + ',' + i_20_ + ',' + (class183 != null ? "{...}" : "null") + ',' + bool + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	static final int method1724(int i, int i_29_, int i_30_, int i_31_) {
		try {
			i_29_ &= 0x3;
			if (i_29_ == 0)
				return i_30_;
			if (i != 7)
				return -123;
			if (i_29_ == 1)
				return 4095 - i_31_;
			if (i_29_ == 2)
				return -i_30_ + 4095;
			return i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.G(" + i + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	final void method1725(int i, RSByteBuffer class98_sub22) {
		try {
			if (i != 0)
				method1722(null, null, -47, 65, -101, false, null, 26, 120, null, -16, -44, (byte) -122);
			for (;;) {
				int i_32_ = class98_sub22.readUnsignedByte();
				if (i_32_ == 0)
					break;
				method1727(i + -120, class98_sub22, i_32_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1726(boolean bool) {
		try {
			if (bool == false)
				aString912 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gp.E(" + bool + ')');
		}
	}

	private final void method1727(int i, RSByteBuffer class98_sub22, int i_33_) {
		try {
			if (i_33_ == 1)
				anInt914 = class98_sub22.readShort();
			else if (i_33_ == 2)
				this.anInt910 = class98_sub22.readShort();
			else if (i_33_ == 4)
				anInt920 = class98_sub22.readShort();
			else if (i_33_ != 5) {
				if (i_33_ == 6)
					anInt924 = class98_sub22.readShort();
				else if (i_33_ == 7)
					anInt915 = class98_sub22.readUnsignedByte();
				else if (i_33_ == 8)
					anInt917 = class98_sub22.readUnsignedByte();
				else if (i_33_ == 9) {
					anInt918 = 8224;
					this.aByte923 = (byte) 3;
				} else if (i_33_ == 10)
					this.aBoolean909 = true;
				else if (i_33_ != 11) {
					if (i_33_ == 12)
						this.aByte923 = (byte) 4;
					else if (i_33_ != 13) {
						if (i_33_ == 14) {
							this.aByte923 = (byte) 2;
							anInt918 = 256 * class98_sub22.readUnsignedByte();
						} else if (i_33_ == 15) {
							this.aByte923 = (byte) 3;
							anInt918 = class98_sub22.readShort();
						} else if (i_33_ == 16) {
							this.aByte923 = (byte) 3;
							anInt918 = class98_sub22.readInt(-2);
						} else if (i_33_ != 40) {
							if (i_33_ == 41) {
								int i_34_ = class98_sub22.readUnsignedByte();
								aShortArray913 = new short[i_34_];
								aShortArray911 = new short[i_34_];
								for (int i_35_ = 0; i_34_ > i_35_; i_35_++) {
									aShortArray913[i_35_] = (short) class98_sub22.readShort();
									aShortArray911[i_35_] = (short) class98_sub22.readShort();
								}
							}
						} else {
							int i_36_ = class98_sub22.readUnsignedByte();
							aShortArray919 = new short[i_36_];
							aShortArray922 = new short[i_36_];
							for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
								aShortArray922[i_37_] = (short) class98_sub22.readShort();
								aShortArray919[i_37_] = (short) class98_sub22.readShort();
							}
						}
					} else
						this.aByte923 = (byte) 5;
				} else
					this.aByte923 = (byte) 1;
			} else
				anInt916 = class98_sub22.readShort();
			if (i >= -49)
				anInt920 = 7;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.H(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_33_ + ')'));
		}
	}

	final AbstractModel method1728(int i, Class183 class183, int i_38_, int i_39_, byte i_40_, int i_41_, ha var_ha) {
		try {
			return method1723(i_38_, i, 0, i_41_, null, null, 0, (byte) 2, class183, false, var_ha, false, 0, i_39_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.I(" + i + ',' + (class183 != null ? "{...}" : "null") + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public Class107() {
		this.aBoolean909 = false;
		anInt917 = 0;
		anInt916 = 128;
		anInt918 = -1;
		anInt924 = 0;
		this.aByte923 = (byte) 0;
		anInt915 = 0;
		anInt920 = 128;
	}
}
