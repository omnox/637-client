/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
//GameObjectDefinition
final class Class352 {
	boolean aBoolean2925;
	int[] anIntArray2926;
	boolean aBoolean2927;
	int[] anIntArray2928;
	private int anInt2929;
	private byte aByte2930;
	private int anInt2931 = 0;
	private byte aByte2932;
	int anInt2933;
	int[] anIntArray2934;
	boolean aBoolean2935;
	int id;
	private int[] anIntArray2937;
	private int anInt2938;
	String[] aStringArray2939;
	private int anInt2940;
	int anInt2941;
	private byte aByte2942;
	private Class377 aClass377_2944;
	int anInt2945 = 0;
	private int anInt2946;
	boolean aBoolean2947;
	int anInt2948;
	int anInt2949;
	int anInt2950;
	int[][] anIntArrayArray2951;
	String name;
	int anInt2953;
	private int anInt2954;
	private byte[] aByteArray2955;
	int anInt2956;
	boolean aBoolean2957;
	int anInt2958;
	boolean clippingFlag;
	boolean walkable;
	boolean aBoolean2961;
	int anInt2962;
	Class302 aClass302_2963;
	private int anInt2964;
	short[] aShortArray2965;
	int anInt2966;
	private byte aByte2967;
	private int anInt2968;
	boolean aBoolean2969;
	int anInt2970;
	private byte aByte2971;
	int anInt2972;
	private int anInt2973;
	short[] aShortArray2974;
	int anInt2975;
	boolean aBoolean2976;
	int anInt2977;
	int sizeX;
	int[] anIntArray2979;
	private int anInt2980;
	int anInt2981;
	boolean aBoolean2982;
	private int anInt2983;
	boolean aBoolean2984;
	private int anInt2985;
	int anInt2986;
	int anInt2987;
	private int anInt2988;
	private int anInt2989;
	int anInt2990;
	int sizeY;
	boolean aBoolean2992;
	byte[] aByteArray2994;
	private short[] aShortArray2995;
	int anInt2996;
	private int anInt2997;
	int anInt2998;
	int actionCount;
	static Class332[] aClass332Array3000;
	static int[] anIntArray3001;
	int anInt3002;
	private short[] aShortArray3003;
	boolean aBoolean3004;
	boolean aBoolean3005;
	int anInt3006;
	boolean aBoolean3007;
	int anInt3008;

	final void method3850(RSByteBuffer class98_sub22, boolean bool) {
		try {
			if (bool != false)
				((Class352) this).anIntArrayArray2951 = null;
			for (;;) {
				int i = class98_sub22.readUnsignedByte();
				if (i == 0)
					break;
				method3863(class98_sub22, i, 7);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.F(" + (class98_sub22 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final Class298 method3851(int i, boolean bool, s var_s, int i_0_, int i_1_, boolean bool_2_, int i_3_, int i_4_, Class185 class185, s var_s_5_, ha var_ha, int i_6_) {
		try {
			if (s.method3419(-95, i_6_))
				i_6_ = 4;
			long l = (long) (i_0_ + ((i_6_ << 300896803) + (((Class352) this).id << -1555969174)));
			if (bool != false)
				method3857(-75);
			l |= (long) (((ha) var_ha).anInt937 << -1993352131);
			if (class185 != null)
				l |= ((Class185) class185).aLong1448 << -2073542368;
			int i_7_ = i_4_;
			if (aByte2971 == 3)
				i_7_ |= 0x7;
			else {
				if ((aByte2971 ^ 0xffffffff) != -1 || anInt2988 != 0)
					i_7_ |= 0x2;
				if ((anInt2940 ^ 0xffffffff) != -1)
					i_7_ |= 0x1;
				if (anInt2989 != 0)
					i_7_ |= 0x4;
			}
			if (bool_2_)
				i_7_ |= 0x40000;
			Class298 class298;
			synchronized (((Class302) ((Class352) this).aClass302_2963).aClass79_2525) {
				class298 = (Class298) ((Class302) ((Class352) this).aClass302_2963).aClass79_2525.get(l);
			}
			AbstractModel class146 = (class298 != null ? ((Class298) class298).aClass146_2477 : null);
			r var_r = null;
			if (class146 != null && (var_ha.c(class146.ua(), i_7_) ^ 0xffffffff) == -1) {
				var_r = ((Class298) class298).aR2479;
				class146 = ((Class298) class298).aClass146_2477;
				if (bool_2_ && var_r == null)
					var_r = ((Class298) class298).aR2479 = class146.ba(null);
			} else {
				if (class146 != null)
					i_7_ = var_ha.method1777(i_7_, class146.ua());
				int i_8_ = i_7_;
				if (i_6_ == 10 && (i_0_ ^ 0xffffffff) < -4)
					i_8_ |= 0x5;
				class146 = method3855(i_6_, i_0_, var_ha, i_8_, class185, (byte) -75);
				if (class146 == null)
					return null;
				if ((i_6_ ^ 0xffffffff) == -11 && i_0_ > 3)
					class146.a(2048);
				if (bool_2_)
					var_r = class146.ba(null);
				class146.s(i_7_);
				class298 = new Class298();
				((Class298) class298).aR2479 = var_r;
				((Class298) class298).aClass146_2477 = class146;
				synchronized (((Class302) ((Class352) this).aClass302_2963).aClass79_2525) {
					((Class302) ((Class352) this).aClass302_2963).aClass79_2525.put(l, class298);
				}
			}
			boolean bool_9_ = ((aByte2971 ^ 0xffffffff) != -1 && (var_s_5_ != null || var_s != null));
			boolean bool_10_ = (anInt2940 != 0 || anInt2988 != 0 || (anInt2989 ^ 0xffffffff) != -1);
			if (!bool_9_ && !bool_10_)
				class146 = class146.method2341((byte) 0, i_4_, true);
			else {
				class146 = class146.method2341((byte) 0, i_7_, true);
				if (bool_9_)
					class146.p(aByte2971, anInt2985, var_s_5_, var_s, i_3_, i_1_, i);
				if (bool_10_)
					class146.H(anInt2940, anInt2988, anInt2989);
				class146.s(i_4_);
			}
			((Class298) Class224_Sub3_Sub1.aClass298_6145).aR2479 = var_r;
			((Class298) Class224_Sub3_Sub1.aClass298_6145).aClass146_2477 = class146;
			return Class224_Sub3_Sub1.aClass298_6145;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.B(" + i + ',' + bool + ',' + (var_s != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ',' + bool_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (class185 != null ? "{...}" : "null") + ',' + (var_s_5_ != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_6_ + ')'));
		}
	}

	final Class352 method3852(Interface6 interface6, byte i) {
		try {
			if (i >= -37)
				method3864((byte) 102, 45, null);
			int i_11_ = -1;
			do {
				if (anInt2983 != -1) {
					i_11_ = interface6.method7(anInt2983, 7373);
					if (!client.aBoolean3553)
						break;
				}
				if ((anInt2968 ^ 0xffffffff) != 0)
					i_11_ = interface6.method6(anInt2968, -121);
			} while (false);
			if (i_11_ < 0 || ((i_11_ ^ 0xffffffff) <= (((Class352) this).anIntArray2928.length + -1 ^ 0xffffffff)) || ((((Class352) this).anIntArray2928[i_11_] ^ 0xffffffff) == 0)) {
				int i_12_ = (((Class352) this).anIntArray2928[((Class352) this).anIntArray2928.length - 1]);
				if ((i_12_ ^ 0xffffffff) != 0)
					return ((Class352) this).aClass302_2963.method3546(i_12_, (byte) 119);
				return null;
			}
			return (((Class352) this).aClass302_2963.method3546(((Class352) this).anIntArray2928[i_11_], (byte) 119));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.K(" + (interface6 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method3853(byte i, int i_13_) {
		try {
			if (i != 49)
				((Class352) this).aClass302_2963 = null;
			if (((Class352) this).anIntArrayArray2951 == null)
				return true;
			synchronized (((Class302) ((Class352) this).aClass302_2963).aClass207_2512) {
				for (int i_14_ = 0; ((Class352) this).aByteArray2994.length > i_14_; i_14_++) {
					if ((i_13_ ^ 0xffffffff) == (((Class352) this).aByteArray2994[i_14_] ^ 0xffffffff)) {
						for (int i_15_ = 0; ((((Class352) this).anIntArrayArray2951[i_14_]).length > i_15_); i_15_++) {
							if (!((Class302) ((Class352) this).aClass302_2963).aClass207_2512.method2751(0, (((Class352) this).anIntArrayArray2951[i_14_][i_15_]), -6329))
								return false;
						}
						return true;
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vha.L(" + i + ',' + i_13_ + ')');
		}
	}

	private final void method3854(RSByteBuffer class98_sub22, int i) {
		try {
			int i_16_ = class98_sub22.readUnsignedByte();
			int i_17_ = -19 / ((i - -66) / 54);
			for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
				((RSByteBuffer) class98_sub22).position++;
				int i_19_ = class98_sub22.readUnsignedByte();
				((RSByteBuffer) class98_sub22).position += 2 * i_19_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.Q(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final AbstractModel method3855(int i, int i_20_, ha var_ha, int i_21_, Class185 class185, byte i_22_) {
		try {
			int i_23_ = 64 + anInt2931;
			int i_24_ = 850 + anInt2980;
			int i_25_ = i_21_;
			boolean bool = (((Class352) this).aBoolean2961 || (i ^ 0xffffffff) == -3 && i_20_ > 3);
			if (bool)
				i_21_ |= 0x10;
			if ((i_20_ ^ 0xffffffff) == -1) {
				if ((anInt2938 ^ 0xffffffff) != -129 || anInt2973 != 0)
					i_21_ |= 0x1;
				if ((anInt2929 ^ 0xffffffff) != -129 || anInt2946 != 0)
					i_21_ |= 0x4;
			} else
				i_21_ |= 0xd;
			if ((anInt2954 ^ 0xffffffff) != -129 || anInt2997 != 0)
				i_21_ |= 0x2;
			if (aShortArray3003 != null)
				i_21_ |= 0x4000;
			if (aShortArray2995 != null)
				i_21_ |= 0x8000;
			if ((aByte2932 ^ 0xffffffff) != -1)
				i_21_ |= 0x80000;
			AbstractModel class146 = null;
			if (((Class352) this).aByteArray2994 == null)
				return null;
			int i_26_ = -1;
			for (int i_27_ = 0; ((((Class352) this).aByteArray2994.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff)); i_27_++) {
				if ((i ^ 0xffffffff) == (((Class352) this).aByteArray2994[i_27_] ^ 0xffffffff)) {
					i_26_ = i_27_;
					break;
				}
			}
			if ((i_26_ ^ 0xffffffff) == 0)
				return null;
			int[] is = ((class185 != null && ((Class185) class185).anIntArray1446 != null) ? ((Class185) class185).anIntArray1446 : ((Class352) this).anIntArrayArray2951[i_26_]);
			int i_28_ = is.length;
			if ((i_28_ ^ 0xffffffff) < -1) {
				long l = (long) ((ha) var_ha).anInt937;
				for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
					l = (long) is[i_29_] + l * 67783L;
				synchronized (((Class302) ((Class352) this).aClass302_2963).aClass79_2522) {
					class146 = ((AbstractModel) ((Class302) ((Class352) this).aClass302_2963).aClass79_2522.get(l));
				}
				if (class146 != null) {
					if (i_23_ != class146.WA())
						i_21_ |= 0x1000;
					if (i_24_ != class146.da())
						i_21_ |= 0x2000;
				}
				if (class146 == null || ((var_ha.c(class146.ua(), i_21_) ^ 0xffffffff) != -1)) {
					int i_30_ = 0x1f01f | i_21_;
					if (class146 != null)
						i_30_ = var_ha.method1777(i_30_, class146.ua());
					ModelDefinitions class178 = null;
					synchronized (Class64_Sub20.aClass178Array3699) {
						for (int i_31_ = 0; i_31_ < i_28_; i_31_++) {
							synchronized (((Class302) ((Class352) this).aClass302_2963).aClass207_2512) {
								class178 = (Class98_Sub6.method981(0, -9252, (((Class302) (((Class352) this).aClass302_2963)).aClass207_2512), is[i_31_] & 0xffff));
							}
							if (class178 == null)
								return null;
							if (((ModelDefinitions) class178).anInt1387 < 13)
								class178.method2592(13746, 2);
							if (i_28_ > 1)
								Class64_Sub20.aClass178Array3699[i_31_] = class178;
						}
						if ((i_28_ ^ 0xffffffff) < -2)
							class178 = new ModelDefinitions((Class64_Sub20.aClass178Array3699), i_28_);
					}
					class146 = var_ha.method1790(class178, i_30_, (((Class302) ((Class352) this).aClass302_2963).anInt2528), i_23_, i_24_);
					synchronized (((Class302) ((Class352) this).aClass302_2963).aClass79_2522) {
						((Class302) ((Class352) this).aClass302_2963).aClass79_2522.put(l, class146);
					}
				}
			}
			if (class146 == null)
				return null;
			AbstractModel class146_32_ = class146.method2341((byte) 0, i_21_, true);
			if ((i_23_ ^ 0xffffffff) != (class146.WA() ^ 0xffffffff))
				class146_32_.C(i_23_);
			if ((class146.da() ^ 0xffffffff) != (i_24_ ^ 0xffffffff))
				class146_32_.LA(i_24_);
			if (bool)
				class146_32_.v();
			if (i == 4 && i_20_ > 3) {
				class146_32_.k(2048);
				class146_32_.H(180, 0, -180);
			}
			i_20_ &= 0x3;
			if (i_22_ != -75)
				return null;
			if ((i_20_ ^ 0xffffffff) != -2) {
				if (i_20_ != 2) {
					if ((i_20_ ^ 0xffffffff) == -4)
						class146_32_.k(12288);
				} else
					class146_32_.k(8192);
			} else
				class146_32_.k(4096);
			if (aShortArray3003 != null) {
				short[] is_33_;
				if (class185 == null || ((Class185) class185).aShortArray1447 == null)
					is_33_ = ((Class352) this).aShortArray2965;
				else
					is_33_ = ((Class185) class185).aShortArray1447;
				for (int i_34_ = 0; ((i_34_ ^ 0xffffffff) > (aShortArray3003.length ^ 0xffffffff)); i_34_++) {
					if (aByteArray2955 == null || (i_34_ ^ 0xffffffff) <= (aByteArray2955.length ^ 0xffffffff))
						class146_32_.ia(aShortArray3003[i_34_], is_33_[i_34_]);
					else
						class146_32_.ia(aShortArray3003[i_34_], (Class372.aShortArray3153[0xff & aByteArray2955[i_34_]]));
				}
			}
			if (aShortArray2995 != null) {
				short[] is_35_;
				if (class185 == null || ((Class185) class185).aShortArray1444 == null)
					is_35_ = ((Class352) this).aShortArray2974;
				else
					is_35_ = ((Class185) class185).aShortArray1444;
				for (int i_36_ = 0; ((aShortArray2995.length ^ 0xffffffff) < (i_36_ ^ 0xffffffff)); i_36_++)
					class146_32_.aa(aShortArray2995[i_36_], is_35_[i_36_]);
			}
			if (aByte2932 != 0)
				class146_32_.method2337(aByte2930, aByte2942, aByte2967, 0xff & aByte2932);
			if (anInt2938 != 128 || anInt2954 != 128 || anInt2929 != 128)
				class146_32_.O(anInt2938, anInt2954, anInt2929);
			if ((anInt2973 ^ 0xffffffff) != -1 || anInt2997 != 0 || (anInt2946 ^ 0xffffffff) != -1)
				class146_32_.H(anInt2973, anInt2997, anInt2946);
			class146_32_.s(i_25_);
			return class146_32_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.H(" + i + ',' + i_20_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_21_ + ',' + (class185 != null ? "{...}" : "null") + ',' + i_22_ + ')'));
		}
	}

	static final void method3856(byte i) {
		try {
			for (int i_37_ = 0; i_37_ < 5; i_37_++)
				Class217.aBooleanArray3410[i_37_] = false;
			Class98_Sub10_Sub14.anInt5613 = Class215.anInt1614;
			RtMouseListener.anInt2494 = GameWorld.cameraPitch;
			Class98_Sub4.anInt3828 = 0;
			Class98_Sub46_Sub20_Sub2.anInt6319 = 5;
			Class246_Sub3_Sub4_Sub2_Sub1.anInt6511 = Class98_Sub46_Sub10.renderX;
			Class96.anInt801 = GameWorld.cameraYaw;
			Class98_Sub41.anInt4202 = 0;
			Class98_Sub50.anInt4292 = Class134.renderZ;
			Class368.anInt3128 = -1;
			Class53_Sub1.anInt3636 = -1;
			Class363.anInt3095 = Class79.renderY;
			Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vha.E(" + i + ')');
		}
	}

	final boolean method3857(int i) {
		try {
			if (((Class352) this).anIntArrayArray2951 == null)
				return true;
			boolean bool = true;
			synchronized (((Class302) ((Class352) this).aClass302_2963).aClass207_2512) {
				for (int i_38_ = 0; ((Class352) this).anIntArrayArray2951.length > i_38_; i_38_++) {
					for (int i_39_ = 0; ((((Class352) this).anIntArrayArray2951[i_38_].length ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++)
						bool &= (((Class302) ((Class352) this).aClass302_2963).aClass207_2512.method2751(0, (((Class352) this).anIntArrayArray2951[i_38_][i_39_]), -6329));
				}
			}
			if (i != 18182)
				return true;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vha.J(" + i + ')');
		}
	}

	final boolean method3858(int i) {
		try {
			if (((Class352) this).anIntArray2928 == null) {
				if (((Class352) this).anInt2996 == -1 && ((Class352) this).anIntArray2926 == null)
					return false;
				return true;
			}
			if (i <= 91)
				return false;
			for (int i_40_ = 0; ((((Class352) this).anIntArray2928.length ^ 0xffffffff) < (i_40_ ^ 0xffffffff)); i_40_++) {
				if (((Class352) this).anIntArray2928[i_40_] != -1) {
					Class352 class352_41_ = (((Class352) this).aClass302_2963.method3546(((Class352) this).anIntArray2928[i_40_], (byte) 119));
					if (((Class352) class352_41_).anInt2996 != -1 || ((Class352) class352_41_).anIntArray2926 != null)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vha.P(" + i + ')');
		}
	}

	final AbstractModel method3859(s var_s, int i, int i_42_, byte i_43_, ha var_ha, s var_s_44_, int i_45_, int i_46_, int i_47_, int i_48_, Class185 class185, int i_49_, Class97 class97, int i_50_, int i_51_) {
		try {
			if (s.method3419(112, i_48_))
				i_48_ = 4;
			long l = (long) (i_46_ + ((((Class352) this).id << -1435947510) - -(i_48_ << -1440567773)));
			int i_52_ = i_45_;
			l |= (long) (((ha) var_ha).anInt937 << 2020858845);
			if (class185 != null)
				l |= ((Class185) class185).aLong1448 << -950504928;
			if (class97 != null)
				i_45_ |= class97.method932(false, i_49_, true, i_50_);
			do {
				if ((aByte2971 ^ 0xffffffff) != -4) {
					if (aByte2971 != 0 || (anInt2988 ^ 0xffffffff) != -1)
						i_45_ |= 0x2;
					if ((anInt2940 ^ 0xffffffff) != -1)
						i_45_ |= 0x1;
					if (anInt2989 == 0)
						break;
					i_45_ |= 0x4;
					if (!client.aBoolean3553)
						break;
				}
				i_45_ |= 0x7;
			} while (false);
			if (i_48_ == 10 && i_46_ > 3)
				i_45_ |= 0x5;
			AbstractModel class146;
			synchronized (((Class302) ((Class352) this).aClass302_2963).aClass79_2527) {
				class146 = (AbstractModel) ((Class302) ((Class352) this).aClass302_2963).aClass79_2527.get(l);
			}
			if (class146 == null || var_ha.c(class146.ua(), i_45_) != 0) {
				if (class146 != null)
					i_45_ = var_ha.method1777(i_45_, class146.ua());
				class146 = method3855(i_48_, i_46_, var_ha, i_45_, class185, (byte) -75);
				if (class146 == null)
					return null;
				synchronized (((Class302) ((Class352) this).aClass302_2963).aClass79_2527) {
					((Class302) ((Class352) this).aClass302_2963).aClass79_2527.put(l, class146);
				}
			}
			boolean bool = false;
			if (class97 != null) {
				bool = true;
				class146 = class97.method930((byte) 1, 0x3 & i_46_, i_49_, i_45_, i_50_, (byte) 86, class146, i_51_);
			}
			int i_53_ = 71 / ((i_43_ - -58) / 59);
			if (i_48_ == 10 && i_46_ > 3) {
				if (!bool) {
					bool = true;
					class146 = class146.method2341((byte) 3, i_45_, true);
				}
				class146.a(2048);
			}
			if ((aByte2971 ^ 0xffffffff) != -1) {
				if (!bool) {
					class146 = class146.method2341((byte) 3, i_45_, true);
					bool = true;
				}
				class146.p(aByte2971, anInt2985, var_s, var_s_44_, i, i_42_, i_47_);
			}
			if ((anInt2940 ^ 0xffffffff) != -1 || (anInt2988 ^ 0xffffffff) != -1 || anInt2989 != 0) {
				if (!bool) {
					bool = true;
					class146 = class146.method2341((byte) 3, i_45_, true);
				}
				class146.H(anInt2940, anInt2988, anInt2989);
			}
			if (bool)
				class146.s(i_52_);
			return class146;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.A(" + (var_s != null ? "{...}" : "null") + ',' + i + ',' + i_42_ + ',' + i_43_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (var_s_44_ != null ? "{...}" : "null") + ',' + i_45_ + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ',' + (class185 != null ? "{...}" : "null") + ',' + i_49_ + ',' + (class97 != null ? "{...}" : "null") + ',' + i_50_ + ',' + i_51_ + ')'));
		}
	}

	final boolean method3860(int i, boolean bool) {
		try {
			if (bool != true)
				anInt2929 = -32;
			if ((i ^ 0xffffffff) == 0)
				return false;
			if ((((Class352) this).anInt2941 ^ 0xffffffff) == (i ^ 0xffffffff))
				return true;
			if (((Class352) this).anIntArray2979 != null) {
				for (int i_54_ = 0; i_54_ < ((Class352) this).anIntArray2979.length; i_54_++) {
					if ((((Class352) this).anIntArray2979[i_54_] ^ 0xffffffff) == (i ^ 0xffffffff))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vha.D(" + i + ',' + bool + ')');
		}
	}

	final int method3861(int i) {
		try {
			if (i != 0)
				return 55;
			if (((Class352) this).anIntArray2979 != null) {
				int i_55_ = (int) ((double) anInt2964 * Math.random());
				int i_56_;
				for (i_56_ = 0; ((anIntArray2937[i_56_] ^ 0xffffffff) >= (i_55_ ^ 0xffffffff)); i_56_++)
					i_55_ -= anIntArray2937[i_56_];
				return ((Class352) this).anIntArray2979[i_56_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vha.C(" + i + ')');
		}
	}

	public static void method3862(int i) {
		try {
			aClass332Array3000 = null;
			IncomingOpcode.aClass58_2993 = null;
			if (i > -22)
				aClass332Array3000 = null;
			IncomingOpcode.aClass58_2943 = null;
			anIntArray3001 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vha.N(" + i + ')');
		}
	}

	private final void method3863(RSByteBuffer class98_sub22, int i, int i_57_) {
		do {
			try {
				if (i == 1 || i == 5) {
					if ((i ^ 0xffffffff) == -6 && (((Class302) ((Class352) this).aClass302_2963).aBoolean2513))
						method3854(class98_sub22, 15);
					int i_58_ = class98_sub22.readUnsignedByte();
					((Class352) this).aByteArray2994 = new byte[i_58_];
					((Class352) this).anIntArrayArray2951 = new int[i_58_][];
					for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
						((Class352) this).aByteArray2994[i_59_] = class98_sub22.readSignedByte();
						int i_60_ = class98_sub22.readUnsignedByte();
						((Class352) this).anIntArrayArray2951[i_59_] = new int[i_60_];
						for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
							((Class352) this).anIntArrayArray2951[i_59_][i_61_] = class98_sub22.readShort();
					}
					if ((i ^ 0xffffffff) == -6 && !(((Class302) ((Class352) this).aClass302_2963).aBoolean2513))
						method3854(class98_sub22, i_57_ + 67);
				} else if (i == 2)
					((Class352) this).name = class98_sub22.readString();
				else if ((i ^ 0xffffffff) == -15)
					((Class352) this).sizeY = class98_sub22.readUnsignedByte();
				else if (i != 15) {
					if ((i ^ 0xffffffff) != -18) {
						if (i != 18) {
							if (i == 19)
								((Class352) this).anInt2998 = class98_sub22.readUnsignedByte();
							else if (i != 21) {
								if ((i ^ 0xffffffff) == -23)
									((Class352) this).aBoolean3007 = true;
								else if (i == 23)
									((Class352) this).anInt2956 = 1;
								else if ((i ^ 0xffffffff) != -25) {
									if (i == 27)
										((Class352) this).actionCount = 1;
									else if (i != 28) {
										if ((i ^ 0xffffffff) == -30)
											anInt2931 = class98_sub22.readSignedByte();
										else if ((i ^ 0xffffffff) != -40) {
											if ((i ^ 0xffffffff) > -31 || i >= 35) {
												if ((i ^ 0xffffffff) == -41) {
													int i_62_ = (class98_sub22.readUnsignedByte());
													aShortArray3003 = new short[i_62_];
													((Class352) this).aShortArray2965 = new short[i_62_];
													for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
														aShortArray3003[i_63_] = (short) (class98_sub22.readShort());
														((Class352) this).aShortArray2965[i_63_] = (short) (class98_sub22.readShort());
													}
												} else if ((i ^ 0xffffffff) != -42) {
													if ((i ^ 0xffffffff) != -43) {
														if (i == 62)
															((Class352) this).aBoolean2961 = true;
														else if (i != 64) {
															if ((i ^ 0xffffffff) == -66)
																anInt2938 = (class98_sub22.readShort());
															else if ((i ^ 0xffffffff) != -67) {
																if ((i ^ 0xffffffff) == -68)
																	anInt2929 = (class98_sub22.readShort());
																else if ((i ^ 0xffffffff) != -70) {
																	if ((i ^ 0xffffffff) == -71)
																		anInt2973 = class98_sub22.readUShort(false) << -836995390;
																	else if ((i ^ 0xffffffff) == -72)
																		anInt2997 = class98_sub22.readUShort(false) << -1352000926;
																	else if ((i ^ 0xffffffff) != -73) {
																		if (i != 73) {
																			if (i != 74) {
																				if (i != 75) {
																					if ((i ^ 0xffffffff) != -78 && (i ^ 0xffffffff) != -93) {
																						if (i == 78) {
																							((Class352) this).anInt2996 = class98_sub22.readShort();
																							((Class352) this).anInt2981 = class98_sub22.readUnsignedByte();
																						} else if (i != 79) {
																							if ((i ^ 0xffffffff) != -82) {
																								if (i == 82)
																									((Class352) this).aBoolean2982 = true;
																								else if (i == 88)
																									((Class352) this).aBoolean2935 = false;
																								else if ((i ^ 0xffffffff) == -90)
																									((Class352) this).aBoolean2925 = false;
																								else if (i == 91)
																									((Class352) this).aBoolean2927 = true;
																								else if (i != 93) {
																									if (i == 94)
																										aByte2971 = (byte) 4;
																									else if ((i ^ 0xffffffff) == -96) {
																										aByte2971 = (byte) 5;
																										anInt2985 = class98_sub22.readUShort(false);
																									} else if ((i ^ 0xffffffff) == -98)
																										((Class352) this).aBoolean3004 = true;
																									else if (i == 98)
																										((Class352) this).aBoolean3005 = true;
																									else if ((i ^ 0xffffffff) != -100) {
																										if (i == 100) {
																											((Class352) this).anInt2933 = class98_sub22.readUnsignedByte();
																											((Class352) this).anInt2977 = class98_sub22.readShort();
																										} else if (i == 101)
																											((Class352) this).anInt2962 = class98_sub22.readUnsignedByte();
																										else if (i == 102)
																											((Class352) this).anInt2990 = class98_sub22.readShort();
																										else if ((i ^ 0xffffffff) != -104) {
																											if ((i ^ 0xffffffff) == -105)
																												((Class352) this).anInt2987 = class98_sub22.readUnsignedByte();
																											else if ((i ^ 0xffffffff) != -106) {
																												if (i == 106) {
																													int i_64_ = class98_sub22.readUnsignedByte();
																													anIntArray2937 = new int[i_64_];
																													((Class352) this).anIntArray2979 = new int[i_64_];
																													for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > (i_64_ ^ 0xffffffff); i_65_++) {
																														((Class352) this).anIntArray2979[i_65_] = class98_sub22.readShort();
																														int i_66_ = class98_sub22.readUnsignedByte();
																														anIntArray2937[i_65_] = i_66_;
																														anInt2964 += i_66_;
																													}
																												} else if ((i ^ 0xffffffff) != -108) {
																													if (i < 150 || (i ^ 0xffffffff) <= -156) {
																														if (i == 160) {
																															int i_67_ = class98_sub22.readUnsignedByte();
																															((Class352) this).anIntArray2934 = new int[i_67_];
																															for (int i_68_ = 0; (i_68_ ^ 0xffffffff) > (i_67_ ^ 0xffffffff); i_68_++)
																																((Class352) this).anIntArray2934[i_68_] = class98_sub22.readShort();
																														} else if (i == 162) {
																															aByte2971 = (byte) 3;
																															anInt2985 = class98_sub22.readInt(-2);
																														} else if (i == 163) {
																															aByte2930 = class98_sub22.readSignedByte();
																															aByte2942 = class98_sub22.readSignedByte();
																															aByte2967 = class98_sub22.readSignedByte();
																															aByte2932 = class98_sub22.readSignedByte();
																														} else if (i == 164)
																															anInt2940 = class98_sub22.readUShort(false);
																														else if ((i ^ 0xffffffff) != -166) {
																															if ((i ^ 0xffffffff) != -167) {
																																if ((i ^ 0xffffffff) != -168) {
																																	if ((i ^ 0xffffffff) == -169)
																																		((Class352) this).aBoolean2992 = true;
																																	else if (i == 169)
																																		((Class352) this).aBoolean2957 = true;
																																	else if ((i ^ 0xffffffff) != -171) {
																																		if ((i ^ 0xffffffff) != -172) {
																																			if (i == 173) {
																																				((Class352) this).anInt3006 = class98_sub22.readShort();
																																				((Class352) this).anInt2950 = class98_sub22.readShort();
																																			} else if ((i ^ 0xffffffff) == -178)
																																				((Class352) this).aBoolean2984 = true;
																																			else if ((i ^ 0xffffffff) == -179)
																																				((Class352) this).anInt2970 = class98_sub22.readUnsignedByte();
																																			else if (i == 249) {
																																				int i_69_ = class98_sub22.readUnsignedByte();
																																				if (aClass377_2944 == null) {
																																					int i_70_ = Class48.method453(423660257, i_69_);
																																					aClass377_2944 = new Class377(i_70_);
																																				}
																																				for (int i_71_ = 0; i_71_ < i_69_; i_71_++) {
																																					boolean bool = class98_sub22.readUnsignedByte() == 1;
																																					int i_72_ = class98_sub22.readMedium(i_57_ + -133);
																																					Node class98;
																																					if (!bool)
																																						class98 = new Class98_Sub34(class98_sub22.readInt(-2));
																																					else
																																						class98 = new Class98_Sub15(class98_sub22.readString());
																																					aClass377_2944.method3996(class98, (long) i_72_, -1);
																																				}
																																			}
																																		} else
																																			((Class352) this).anInt2953 = class98_sub22.readSmart(1689622712);
																																	} else
																																		((Class352) this).anInt2986 = class98_sub22.readSmart(1689622712);
																																} else
																																	((Class352) this).anInt2945 = class98_sub22.readShort();
																															} else
																																anInt2989 = class98_sub22.readUShort(false);
																														} else
																															anInt2988 = class98_sub22.readUShort(false);
																													} else {
																														((Class352) this).aStringArray2939[i + -150] = class98_sub22.readString();
																														if (!((Class302) ((Class352) this).aClass302_2963).aBoolean2516)
																															((Class352) this).aStringArray2939[-150 + i] = null;
																													}
																												} else
																													((Class352) this).anInt2958 = class98_sub22.readShort();
																											} else
																												((Class352) this).aBoolean2976 = true;
																										} else
																											((Class352) this).anInt2956 = 0;
																									} else {
																										((Class352) this).anInt3002 = class98_sub22.readUnsignedByte();
																										((Class352) this).anInt3008 = class98_sub22.readShort();
																									}
																								} else {
																									aByte2971 = (byte) 3;
																									anInt2985 = class98_sub22.readShort();
																								}
																							} else {
																								aByte2971 = (byte) 2;
																								anInt2985 = 256 * class98_sub22.readUnsignedByte();
																							}
																						} else {
																							((Class352) this).anInt2949 = class98_sub22.readShort();
																							((Class352) this).anInt2972 = class98_sub22.readShort();
																							((Class352) this).anInt2981 = class98_sub22.readUnsignedByte();
																							int i_73_ = class98_sub22.readUnsignedByte();
																							((Class352) this).anIntArray2926 = new int[i_73_];
																							for (int i_74_ = 0; (i_73_ ^ 0xffffffff) < (i_74_ ^ 0xffffffff); i_74_++)
																								((Class352) this).anIntArray2926[i_74_] = class98_sub22.readShort();
																						}
																					} else {
																						anInt2983 = class98_sub22.readShort();
																						if ((anInt2983 ^ 0xffffffff) == -65536)
																							anInt2983 = -1;
																						anInt2968 = class98_sub22.readShort();
																						if (anInt2968 == 65535)
																							anInt2968 = -1;
																						int i_75_ = -1;
																						if (i == 92) {
																							i_75_ = class98_sub22.readShort();
																							if (i_75_ == 65535)
																								i_75_ = -1;
																						}
																						int i_76_ = class98_sub22.readUnsignedByte();
																						((Class352) this).anIntArray2928 = new int[i_76_ + 2];
																						for (int i_77_ = 0; i_76_ >= i_77_; i_77_++) {
																							((Class352) this).anIntArray2928[i_77_] = class98_sub22.readShort();
																							if (((Class352) this).anIntArray2928[i_77_] == 65535)
																								((Class352) this).anIntArray2928[i_77_] = -1;
																						}
																						((Class352) this).anIntArray2928[1 + i_76_] = i_75_;
																					}
																				} else
																					((Class352) this).anInt2975 = class98_sub22.readUnsignedByte();
																			} else
																				((Class352) this).clippingFlag = true;
																		} else
																			((Class352) this).aBoolean2969 = true;
																	} else
																		anInt2946 = class98_sub22.readUShort(false) << -784917758;
																} else
																	((Class352) this).anInt2948 = (class98_sub22.readUnsignedByte());
															} else
																anInt2954 = (class98_sub22.readShort());
														} else
															((Class352) this).aBoolean2947 = false;
													} else {
														int i_78_ = (class98_sub22.readUnsignedByte());
														aByteArray2955 = new byte[i_78_];
														for (int i_79_ = 0; ((i_78_ ^ 0xffffffff) < (i_79_ ^ 0xffffffff)); i_79_++)
															aByteArray2955[i_79_] = (class98_sub22.readSignedByte());
													}
												} else {
													int i_80_ = (class98_sub22.readUnsignedByte());
													((Class352) this).aShortArray2974 = new short[i_80_];
													aShortArray2995 = new short[i_80_];
													for (int i_81_ = 0; i_80_ > i_81_; i_81_++) {
														aShortArray2995[i_81_] = (short) (class98_sub22.readShort());
														((Class352) this).aShortArray2974[i_81_] = (short) (class98_sub22.readShort());
													}
												}
											} else
												((Class352) this).aStringArray2939[i + -30] = (class98_sub22.readString());
										} else
											anInt2980 = (class98_sub22.readSignedByte() * 5);
									} else
										((Class352) this).anInt2966 = (class98_sub22.readUnsignedByte() << -69774750);
								} else {
									((Class352) this).anInt2941 = class98_sub22.readShort();
									if ((((Class352) this).anInt2941 ^ 0xffffffff) == -65536)
										((Class352) this).anInt2941 = -1;
								}
							} else
								aByte2971 = (byte) 1;
						} else
							((Class352) this).walkable = false;
					} else {
						((Class352) this).walkable = false;
						((Class352) this).actionCount = 0;
					}
				} else
					((Class352) this).sizeX = class98_sub22.readUnsignedByte();
				if (i_57_ == 7)
					break;
				method3857(33);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vha.I(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_57_ + ')'));
			}
			break;
		} while (false);
	}

	final String method3864(byte i, int i_82_, String string) {
		try {
			if (i <= 85)
				((Class352) this).aShortArray2965 = null;
			if (aClass377_2944 == null)
				return string;
			Class98_Sub15 class98_sub15 = (Class98_Sub15) aClass377_2944.method3990((long) i_82_, -1);
			if (class98_sub15 == null)
				return string;
			return ((Class98_Sub15) class98_sub15).aString3917;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.M(" + i + ',' + i_82_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3865(int i) {
		do {
			try {
				if ((((Class352) this).anInt2998 ^ 0xffffffff) == 0) {
					((Class352) this).anInt2998 = 0;
					if (((Class352) this).aByteArray2994 != null && (((Class352) this).aByteArray2994.length ^ 0xffffffff) == -2 && ((((Class352) this).aByteArray2994[0] ^ 0xffffffff) == -11))
						((Class352) this).anInt2998 = 1;
					for (int i_83_ = 0; i_83_ < 5; i_83_++) {
						if (((Class352) this).aStringArray2939[i_83_] != null) {
							((Class352) this).anInt2998 = 1;
							break;
						}
					}
				}
				if ((((Class352) this).anInt2941 ^ 0xffffffff) != 0 || ((Class352) this).aBoolean3005 || ((Class352) this).anIntArray2928 != null)
					((Class352) this).aBoolean2984 = true;
				if (i <= 14)
					anInt2931 = -53;
				if (((Class352) this).anInt2975 != -1)
					break;
				((Class352) this).anInt2975 = ((Class352) this).actionCount == 0 ? 0 : 1;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vha.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method3866(int i, int i_84_, int i_85_) {
		try {
			if (i_85_ != 1)
				method3865(87);
			if (aClass377_2944 == null)
				return i;
			Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_2944.method3990((long) i_84_, -1);
			if (class98_sub34 == null)
				return i;
			return ((Class98_Sub34) class98_sub34).anInt4126;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vha.O(" + i + ',' + i_84_ + ',' + i_85_ + ')'));
		}
	}

	public Class352() {
		anIntArray2937 = null;
		((Class352) this).aBoolean2925 = true;
		((Class352) this).anInt2941 = -1;
		((Class352) this).anInt2949 = 0;
		((Class352) this).aBoolean2935 = true;
		((Class352) this).aBoolean2947 = true;
		anInt2929 = 128;
		aByte2932 = (byte) 0;
		anInt2954 = 128;
		((Class352) this).aBoolean2957 = false;
		anInt2946 = 0;
		((Class352) this).clippingFlag = false;
		aByte2971 = (byte) 0;
		((Class352) this).aBoolean2927 = false;
		((Class352) this).anInt2953 = 0;
		((Class352) this).anInt2970 = 0;
		((Class352) this).aStringArray2939 = new String[5];
		((Class352) this).anInt2962 = 0;
		((Class352) this).anInt2966 = 64;
		anInt2968 = -1;
		((Class352) this).anInt2933 = -1;
		anInt2973 = 0;
		anInt2940 = 0;
		((Class352) this).anInt2977 = -1;
		((Class352) this).sizeX = 1;
		anInt2983 = -1;
		((Class352) this).name = "null";
		((Class352) this).anInt2975 = -1;
		((Class352) this).anInt2948 = 0;
		((Class352) this).anInt2958 = -1;
		((Class352) this).aBoolean2976 = false;
		((Class352) this).aBoolean2982 = false;
		anInt2938 = 128;
		anInt2988 = 0;
		((Class352) this).sizeY = 1;
		((Class352) this).aBoolean2984 = false;
		anInt2989 = 0;
		anInt2980 = 0;
		((Class352) this).anIntArray2979 = null;
		((Class352) this).anInt2990 = -1;
		((Class352) this).aBoolean2992 = false;
		((Class352) this).anInt2950 = 256;
		anInt2997 = 0;
		((Class352) this).walkable = true;
		((Class352) this).anInt2996 = -1;
		((Class352) this).aBoolean2961 = false;
		((Class352) this).anInt2986 = 960;
		anInt2964 = 0;
		((Class352) this).anInt2972 = 0;
		((Class352) this).aBoolean2969 = false;
		((Class352) this).aBoolean3004 = false;
		anInt2985 = -1;
		((Class352) this).aBoolean3005 = false;
		((Class352) this).anInt2981 = 0;
		((Class352) this).anInt2987 = 255;
		((Class352) this).aBoolean3007 = false;
		((Class352) this).anInt3002 = -1;
		((Class352) this).actionCount = 2;
		((Class352) this).anInt3006 = 256;
		((Class352) this).anInt3008 = -1;
		((Class352) this).anInt2956 = -1;
		((Class352) this).anInt2998 = -1;
	}
}
