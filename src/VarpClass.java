/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class VarpClass implements Interface6 {
	static Class47 aClass47_3241;
	private Class377 aClass377_3242 = new Class377(128);
	static int anInt3243;
	int[] anIntArray3244;
	static Class48 aClass48_3245;
	static boolean[] aBooleanArray3246;
	private int[] varps;
	static OutgoingOpcode aClass171_3248 = new OutgoingOpcode(42, 4);

	public static void method2285(int i) {
		try {
			aClass171_3248 = null;
			aClass48_3245 = null;
			if (i != -4492)
				method2287(-125, -67, -94);
			aBooleanArray3246 = null;
			aClass47_3241 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jk.B(" + i + ')');
		}
	}

	final void setVarp(int i, int varbitValue, int varpIndex) {
		try {
			varps[varpIndex] = varbitValue;
			Class98_Sub50 class98_sub50 = (Class98_Sub50) aClass377_3242.method3990((long) varpIndex, -1);
			if (class98_sub50 != null) {
				if ((((Class98_Sub50) class98_sub50).aLong4288 ^ 0xffffffffffffffffL) != -4611686018427387906L)
					((Class98_Sub50) class98_sub50).aLong4288 = (0x4000000000000000L | Class343.method3819(-47) - -500L);
			} else {
				class98_sub50 = new Class98_Sub50(4611686018427387905L);
				aClass377_3242.method3996(class98_sub50, (long) varpIndex, -1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jk.G(" + i + ',' + varbitValue + ',' + varpIndex + ')'));
		}
	}

	public final int method6(int i, int i_2_) {
		try {
			return ((VarpClass) this).anIntArray3244[i];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jk.H(" + i + ',' + i_2_ + ')');
		}
	}

	public final int method7(int i, int i_4_) {
		try {
			Class366 class366 = Class17.aClass198_205.method2680(i, (byte) 40);
			int i_5_ = ((Class366) class366).anInt3115;
			int i_6_ = ((Class366) class366).anInt3116;
			int i_7_ = ((Class366) class366).anInt3118;
			if (i_4_ != 7373)
				return -48;
			int i_8_ = Class98_Sub46_Sub20.anIntArray6070[i_7_ + -i_6_];
			return ((VarpClass) this).anIntArray3244[i_5_] >> i_6_ & i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jk.I(" + i + ',' + i_4_ + ')');
		}
	}

	static final boolean method2287(int i, int i_9_, int i_10_) {
		try {
			if (i_10_ != 2048)
				return false;
			if ((0x800 & i ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jk.D(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method2288(byte i) {
		try {
			int i_11_ = 0;
			for (/**/; ((((Class139) Class134.aClass139_3465).anInt1086 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
				Class167 class167 = Class134.aClass139_3465.method2282(i_11_, 16);
				if (class167 != null && ((Class167) class167).anInt1283 == 0) {
					varps[i_11_] = 0;
					((VarpClass) this).anIntArray3244[i_11_] = 0;
				}
			}
			aClass377_3242 = new Class377(128);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jk.F(" + i + ')');
		}
	}

	final void method2289(int i, int i_13_, int i_14_) {
		try {
			Class366 class366 = Class17.aClass198_205.method2680(i_13_, (byte) 68);
			int i_15_ = ((Class366) class366).anInt3115;
			int i_16_ = ((Class366) class366).anInt3116;
			int i_17_ = ((Class366) class366).anInt3118;
			int i_18_ = Class98_Sub46_Sub20.anIntArray6070[i_17_ - i_16_];
			if (i < i_14_ || (i ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
				i = 0;
			i_18_ <<= i_16_;
			method2291(i_15_, 86, (i_18_ & i << i_16_ | ((i_18_ ^ 0xffffffff) & ((VarpClass) this).anIntArray3244[i_15_])));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jk.E(" + i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final int method2290(int i, boolean bool) {
		try {
			long l = Class343.method3819(-47);
			Class98_Sub50 class98_sub50 = (!bool ? (Class98_Sub50) aClass377_3242.iterate_next(-1) : (Class98_Sub50) aClass377_3242.start_iteration(117));
			for (/**/; class98_sub50 != null; class98_sub50 = (Class98_Sub50) aClass377_3242.iterate_next(-1)) {
				if (((0x3fffffffffffffffL & ((Class98_Sub50) class98_sub50).aLong4288) ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
					if ((0x4000000000000000L & ((Class98_Sub50) class98_sub50).aLong4288) == 0L)
						class98_sub50.remove();
					else {
						int i_20_ = (int) ((Node) class98_sub50).uid;
						((VarpClass) this).anIntArray3244[i_20_] = varps[i_20_];
						class98_sub50.remove();
						return i_20_;
					}
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jk.A(" + i + ',' + bool + ')');
		}
	}

	public VarpClass() {
		try {
			((VarpClass) this).anIntArray3244 = new int[((Class139) Class134.aClass139_3465).anInt1086];
			varps = new int[((Class139) Class134.aClass139_3465).anInt1086];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jk.<init>(" + ')');
		}
	}

	final void method2291(int i, int i_21_, int i_22_) {
		do {
			try {
				((VarpClass) this).anIntArray3244[i] = i_22_;
				Class98_Sub50 class98_sub50 = (Class98_Sub50) aClass377_3242.method3990((long) i, -1);
				do {
					if (class98_sub50 == null) {
						class98_sub50 = new Class98_Sub50(500L + Class343.method3819(-47));
						aClass377_3242.method3996(class98_sub50, (long) i, -1);
						if (!client.aBoolean3553)
							break;
					}
					((Class98_Sub50) class98_sub50).aLong4288 = Class343.method3819(-47) - -500L;
				} while (false);
				if (i_21_ > 58)
					break;
				setVarp(36, 108, 47);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jk.J(" + i + ',' + i_21_ + ',' + i_22_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2292(int i, int i_23_, int i_24_) {
		try {
			Class366 class366 = Class17.aClass198_205.method2680(i, (byte) 98);
			int i_25_ = ((Class366) class366).anInt3115;
			if (i_24_ == -32727) {
				int i_26_ = ((Class366) class366).anInt3116;
				int i_27_ = ((Class366) class366).anInt3118;
				int i_28_ = Class98_Sub46_Sub20.anIntArray6070[i_27_ + -i_26_];
				if ((i_23_ ^ 0xffffffff) > -1 || i_28_ < i_23_)
					i_23_ = 0;
				i_28_ <<= i_26_;
				setVarp(i_24_ + 25258, (i_23_ << i_26_ & i_28_ | varps[i_25_] & (i_28_ ^ 0xffffffff)), i_25_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jk.C(" + i + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}
}
