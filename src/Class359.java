/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class359 {
	private int anInt3035;
	private boolean[] aBooleanArray3036;
	private boolean aBoolean3037;
	int anInt3038;
	private byte aByte3039;
	private byte aByte3040;
	private int anInt3041;
	private int anInt3042;
	private int anInt3043 = -1;
	private Class185 aClass185_3044;
	private Class97 aClass97_3045;
	static Class348 aClass348_3046 = new Class348(10, 2, 2, 0);
	private boolean aBoolean3047 = false;
	private int anInt3048;
	private AnimableEntity aClass246_Sub3_3049;
	private int anInt3050;
	private r aR3051;
	int anInt3052;
	private int anInt3053;
	private boolean aBoolean3054;
	private int anInt3055;
	static AnimableEntity[] aClass246_Sub3Array3056;
	private AbstractModel aClass146_3057;
	static int anInt3058 = 0;
	int anInt3059;
	static int[] pathBufferX = new int[4096];
	private int anInt3061;
	Class246_Sub5 aClass246_Sub5_3062;

	protected final void finalize() {
		do {
			try {
				if (((Class359) this).aClass246_Sub5_3062 == null)
					break;
				((Class359) this).aClass246_Sub5_3062.method3114();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vo.finalize(" + ')');
			}
			break;
		} while (false);
	}

	final void method3892(ha var_ha, int i) {
		do {
			try {
				method3897(-1, true, 262144, var_ha, true);
				if (i >= 101)
					break;
				method3899((byte) -109);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vo.H(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method3893(AnimableEntity class246_sub3, int i) {
		try {
			if (i != -23137)
				aBoolean3047 = true;
			int i_0_;
			while_243_: for (;;) {
				if (aClass97_3045 == null) {
					if (aBoolean3047)
						return;
					method3902(-1, (byte) 101);
					if (aClass97_3045 == null)
						return;
				}
				i_0_ = Class215.anInt1614 - anInt3048;
				if (i_0_ > 100 && ((Class97) aClass97_3045).anInt828 > 0) {
					int i_1_;
					for (i_1_ = (-((Class97) aClass97_3045).anInt828 + (((Class97) aClass97_3045).anIntArray818).length); ((i_1_ ^ 0xffffffff) < (anInt3050 ^ 0xffffffff) && ((((Class97) aClass97_3045).anIntArray811[anInt3050]) ^ 0xffffffff) > (i_0_ ^ 0xffffffff)); anInt3050++)
						i_0_ -= (((Class97) aClass97_3045).anIntArray811[anInt3050]);
					if ((anInt3050 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
						int i_2_ = 0;
						for (int i_3_ = i_1_; i_3_ < (((Class97) aClass97_3045).anIntArray818).length; i_3_++)
							i_2_ += (((Class97) aClass97_3045).anIntArray811[i_3_]);
						i_0_ %= i_2_;
					}
					anInt3035 = anInt3050 + 1;
					if (anInt3035 >= ((Class97) aClass97_3045).anIntArray818.length) {
						anInt3035 -= ((Class97) aClass97_3045).anInt828;
						if (anInt3035 < 0 || (((Class97) aClass97_3045).anIntArray818.length ^ 0xffffffff) >= (anInt3035 ^ 0xffffffff))
							anInt3035 = -1;
					}
				}
				for (;;) {
					if ((((Class97) aClass97_3045).anIntArray811[anInt3050] ^ 0xffffffff) <= (i_0_ ^ 0xffffffff))
						break while_243_;
					Class349.method3840((byte) -127, class246_sub3, anInt3050, aClass97_3045);
					i_0_ -= ((Class97) aClass97_3045).anIntArray811[anInt3050];
					anInt3050++;
					if (((Class97) aClass97_3045).anIntArray818.length <= anInt3050) {
						anInt3050 -= ((Class97) aClass97_3045).anInt828;
						if ((anInt3050 ^ 0xffffffff) > -1 || (((Class97) aClass97_3045).anIntArray818.length ^ 0xffffffff) >= (anInt3050 ^ 0xffffffff)) {
							aClass97_3045 = null;
							break;
						}
					}
					anInt3035 = anInt3050 - -1;
					if (anInt3035 >= ((Class97) aClass97_3045).anIntArray818.length) {
						anInt3035 -= ((Class97) aClass97_3045).anInt828;
						if ((anInt3035 ^ 0xffffffff) > -1 || (((Class97) aClass97_3045).anIntArray818.length <= anInt3035))
							anInt3035 = -1;
					}
				}
			}
			anInt3048 = -i_0_ + Class215.anInt1614;
			anInt3042 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vo.C(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3894(byte i, ha var_ha) {
		try {
			if (aR3051 != null) {
				Class268.method3254(aR3051, aByte3040, (((AnimableEntity) aClass246_Sub3_3049).localXPos), (((AnimableEntity) aClass246_Sub3_3049).localYPos), aBooleanArray3036);
				aR3051 = null;
				aBooleanArray3036 = null;
			}
			int i_4_ = 124 % ((74 - i) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vo.G(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3895(AbstractModel class146, int i, int i_5_, Class111 class111, boolean bool, int i_6_, ha var_ha, boolean bool_7_, int i_8_) {
		do {
			try {
				Class87[] class87s = class146.method2320();
				Class35[] class35s = class146.method2322();
				if ((((Class359) this).aClass246_Sub5_3062 == null || ((Class246_Sub5) ((Class359) this).aClass246_Sub5_3062).aBoolean5099) && (class87s != null || class35s != null)) {
					Class352 class352 = Class130.aClass302_1028.method3546((((Class359) this).anInt3052), (byte) 119);
					if (((Class352) class352).anIntArray2928 != null)
						class352 = class352.method3852(Class75.aClass140_584, (byte) -116);
					if (class352 != null)
						((Class359) this).aClass246_Sub5_3062 = Class246_Sub5.method3117(Class215.anInt1614, true);
				}
				if (bool_7_ != false)
					aByte3040 = (byte) -118;
				if (((Class359) this).aClass246_Sub5_3062 == null)
					break;
				class146.method2343(class111);
				do {
					if (!bool) {
						((Class359) this).aClass246_Sub5_3062.method3126((long) Class215.anInt1614);
						if (!client.aBoolean3553)
							break;
					}
					((Class359) this).aClass246_Sub5_3062.method3120(var_ha, (long) Class215.anInt1614, class87s, class35s, false);
				} while (false);
				((Class359) this).aClass246_Sub5_3062.method3123(aByte3039, i_6_, i, i_5_, i_8_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vo.D(" + (class146 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ',' + (class111 != null ? "{...}" : "null") + ',' + bool + ',' + i_6_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3896(int i) {
		try {
			if (i == 11) {
				aClass246_Sub3Array3056 = null;
				aClass348_3046 = null;
				pathBufferX = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vo.K(" + i + ')');
		}
	}

	final AbstractModel method3897(int i, boolean bool, int i_9_, ha var_ha, boolean bool_10_) {
		try {
			if (i != -1)
				return null;
			Class352 class352 = Class130.aClass302_1028.method3546(((Class359) this).anInt3052, (byte) 119);
			if (((Class352) class352).anIntArray2928 != null)
				class352 = class352.method3852(Class75.aClass140_584, (byte) -118);
			if (class352 == null) {
				method3894((byte) -80, var_ha);
				anInt3055 = -1;
				anInt3061 = -1;
				anInt3043 = -1;
				return null;
			}
			if (!aBoolean3047 && ((Class352) class352).id != anInt3061) {
				aClass146_3057 = null;
				method3902(-1, (byte) 101);
			}
			method3893(aClass246_Sub3_3049, -23137);
			if (bool_10_) {
				bool_10_ = bool_10_ & (aBoolean3037 & ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073.method579((byte) 120) != 0);
				bool_10_ = (bool_10_ & (((Class352) class352).id != anInt3043 || (aClass97_3045 != null && (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073.method579((byte) 121) >= 2) && ((anInt3050 ^ 0xffffffff) != (anInt3055 ^ 0xffffffff) || ((((Class97) aClass97_3045).aBoolean823 || Class357.aBoolean3027) && anInt3035 != anInt3050)))));
			}
			if (bool && !bool_10_) {
				anInt3061 = ((Class352) class352).id;
				return null;
			}
			if (bool_10_) {
				Class268.method3254(aR3051, aByte3040, (((AnimableEntity) aClass246_Sub3_3049).localXPos), (((AnimableEntity) aClass246_Sub3_3049).localYPos), aBooleanArray3036);
				anInt3043 = -1;
				anInt3055 = -1;
			}
			s var_s = Class78.activeTileHeightMap[aByte3040];
			s var_s_11_;
			if (aBoolean3054)
				var_s_11_ = Class98_Sub46_Sub2_Sub2.aSArray6298[0];
			else
				var_s_11_ = aByte3040 < 3 ? Class78.activeTileHeightMap[aByte3040 + 1] : null;
			AbstractModel class146 = null;
			if (aClass97_3045 == null) {
				if (aClass146_3057 != null && (i_9_ & aClass146_3057.ua()) == i_9_ && anInt3061 == ((Class352) class352).id)
					class146 = aClass146_3057;
				else {
					if (aClass146_3057 != null)
						i_9_ |= aClass146_3057.ua();
					Class298 class298 = (class352.method3851(((AnimableEntity) aClass246_Sub3_3049).localYPos, false, var_s_11_, (((Class359) this).anInt3038 != 11 ? ((Class359) this).anInt3059 : 4 - -((Class359) this).anInt3059), var_s.method3417(((AnimableEntity) aClass246_Sub3_3049).localXPos, ((AnimableEntity) aClass246_Sub3_3049).localYPos, true), bool_10_, ((AnimableEntity) aClass246_Sub3_3049).localXPos, i_9_, aClass185_3044, var_s, var_ha, ((((Class359) this).anInt3038 ^ 0xffffffff) == -12 ? 10 : ((Class359) this).anInt3038)));
					if (class298 == null) {
						anInt3053 = 0;
						aR3051 = null;
						anInt3041 = 0;
						aClass146_3057 = null;
						aBooleanArray3036 = null;
					} else {
						aClass146_3057 = class146 = ((Class298) class298).aClass146_2477;
						if (bool_10_) {
							aR3051 = ((Class298) class298).aR2479;
							aBooleanArray3036 = null;
							Class184.method2626(aR3051, aByte3040, (((AnimableEntity) aClass246_Sub3_3049).localXPos), (((AnimableEntity) aClass246_Sub3_3049).localYPos), null);
							anInt3055 = -1;
							anInt3043 = ((Class352) class352).id;
						}
						anInt3041 = class146.fa();
						anInt3053 = class146.ma();
					}
				}
			} else {
				if (bool_10_)
					i_9_ |= 0x40000;
				class146 = (class352.method3859(var_s, ((AnimableEntity) aClass246_Sub3_3049).localXPos, var_s.method3417((((AnimableEntity) aClass246_Sub3_3049).localXPos), (((AnimableEntity) aClass246_Sub3_3049).localYPos), true), (byte) -125, var_ha, var_s_11_, i_9_, ((((Class359) this).anInt3038 ^ 0xffffffff) == -12 ? ((Class359) this).anInt3059 + 4 : ((Class359) this).anInt3059), ((AnimableEntity) aClass246_Sub3_3049).localYPos, (((Class359) this).anInt3038 == 11 ? 10 : ((Class359) this).anInt3038), aClass185_3044, anInt3050, aClass97_3045, anInt3035, anInt3042));
				if (class146 == null) {
					anInt3053 = 0;
					anInt3041 = 0;
					aR3051 = null;
					aBooleanArray3036 = null;
				} else {
					if (bool_10_) {
						if (aBooleanArray3036 == null)
							aBooleanArray3036 = new boolean[4];
						aR3051 = class146.ba(aR3051);
						Class184.method2626(aR3051, aByte3040, ((AnimableEntity) aClass246_Sub3_3049).localXPos, ((AnimableEntity) aClass246_Sub3_3049).localYPos, aBooleanArray3036);
						anInt3043 = ((Class352) class352).id;
						anInt3055 = anInt3050;
					}
					anInt3041 = class146.fa();
					anInt3053 = class146.ma();
				}
				aClass146_3057 = null;
			}
			anInt3061 = ((Class352) class352).id;
			return class146;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vo.B(" + i + ',' + bool + ',' + i_9_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool_10_ + ')'));
		}
	}

	final boolean method3898(int i) {
		try {
			if (i < 17)
				((Class359) this).anInt3038 = -60;
			return aBoolean3037;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vo.A(" + i + ')');
		}
	}

	final int method3899(byte i) {
		try {
			if (i < 124)
				return 32;
			return anInt3041;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vo.L(" + i + ')');
		}
	}

	final void method3900(int i, int i_12_) {
		try {
			aBoolean3047 = true;
			if (i_12_ >= -41)
				((Class359) this).aClass246_Sub5_3062 = null;
			method3902(i, (byte) 101);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vo.F(" + i + ',' + i_12_ + ')');
		}
	}

	final void method3901(Class185 class185, int i) {
		try {
			aClass185_3044 = class185;
			if (i < -106)
				aClass146_3057 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vo.I(" + (class185 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method3902(int i, byte i_13_) {
		try {
			int i_14_ = i;
			boolean bool = false;
			if (i_14_ == -1) {
				Class352 class352 = Class130.aClass302_1028.method3546(((Class359) this).anInt3052, (byte) 119);
				Class352 class352_15_ = class352;
				if (((Class352) class352).anIntArray2928 != null)
					class352 = class352.method3852(Class75.aClass140_584, (byte) -44);
				if (class352 == null)
					return;
				if (class352_15_ == class352)
					class352_15_ = null;
				if (((Class352) class352).anIntArray2979 == null) {
					if (((Class352) class352).anInt2941 == -1) {
						if (class352_15_ != null && (((Class352) class352_15_).anIntArray2979 != null)) {
							if (aClass97_3045 != null && class352_15_.method3860((((Class97) aClass97_3045).anInt826), true))
								return;
							i_14_ = class352_15_.method3861(0);
							if (anInt3061 != ((Class352) class352_15_).id)
								bool = ((Class352) class352_15_).aBoolean2925;
						} else if (class352_15_ != null && (((Class352) class352_15_).anInt2941 ^ 0xffffffff) != 0 && anInt3061 != (((Class352) class352_15_).id)) {
							bool = ((Class352) class352_15_).aBoolean2925;
							i_14_ = ((Class352) class352_15_).anInt2941;
						}
					} else if ((((Class352) class352).id ^ 0xffffffff) != (anInt3061 ^ 0xffffffff)) {
						bool = ((Class352) class352).aBoolean2925;
						i_14_ = ((Class352) class352).anInt2941;
					}
				} else {
					if (aClass97_3045 != null && class352.method3860((((Class97) aClass97_3045).anInt826), true))
						return;
					i_14_ = class352.method3861(0);
					if (((Class352) class352).id != anInt3061)
						bool = ((Class352) class352).aBoolean2925;
				}
			}
			if (i_14_ == -1)
				aClass97_3045 = null;
			else {
				aClass146_3057 = null;
				if (aClass97_3045 != null && ((Class97) aClass97_3045).anInt826 == i_14_) {
					if ((((Class97) aClass97_3045).anInt819 ^ 0xffffffff) == -1)
						return;
				} else
					aClass97_3045 = Class151_Sub7.aClass183_5001.method2623(i_14_, 16383);
				if (((Class97) aClass97_3045).anIntArray818 == null)
					aClass97_3045 = null;
				else {
					if (!bool) {
						anInt3042 = 1;
						anInt3050 = 0;
					} else {
						anInt3050 = (int) (Math.random() * (double) (((Class97) aClass97_3045).anIntArray818).length);
						anInt3042 = (int) ((double) (((Class97) aClass97_3045).anIntArray811[anInt3050]) * Math.random()) + 1;
					}
					if (i_13_ == 101) {
						anInt3035 = 1 + anInt3050;
						if (anInt3035 < 0 || (((Class97) aClass97_3045).anIntArray818.length ^ 0xffffffff) >= (anInt3035 ^ 0xffffffff))
							anInt3035 = -1;
						anInt3048 = Class215.anInt1614 + -anInt3042;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vo.J(" + i + ',' + i_13_ + ')');
		}
	}

	final int method3903(byte i) {
		try {
			int i_16_ = 64 % ((i - -29) / 45);
			return anInt3053;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vo.E(" + i + ')');
		}
	}

	Class359(ha var_ha, Class352 class352, int i, int i_17_, int i_18_, int i_19_, AnimableEntity class246_sub3, boolean bool, int i_20_) {
		anInt3041 = 0;
		anInt3055 = -1;
		anInt3053 = 0;
		anInt3061 = -1;
		aBoolean3054 = false;
		try {
			aByte3039 = (byte) i_18_;
			((Class359) this).anInt3038 = i;
			((Class359) this).anInt3059 = i_17_;
			aByte3040 = (byte) i_19_;
			((Class359) this).anInt3052 = ((Class352) class352).id;
			aBoolean3054 = bool;
			aClass246_Sub3_3049 = class246_sub3;
			aBoolean3037 = (var_ha.method1771() && ((Class352) class352).aBoolean2935 && !aBoolean3054);
			if (i_20_ != -1)
				aBoolean3047 = true;
			method3902(i_20_, (byte) 101);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vo.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class352 != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (class246_sub3 != null ? "{...}" : "null") + ',' + bool + ',' + i_20_ + ')'));
		}
	}
}
