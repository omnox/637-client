/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class55 {
	Class151_Sub9 aClass151_Sub9_432;
	private int anInt434;
	private ha_Sub1 aHa_Sub1_435;
	private int anInt436 = 0;
	private Class151[] aClass151Array437;
	private int anInt438 = 0;
	private Class51 aClass51_439;
	static int anInt440 = 0;
	static String[][] aStringArrayArray441 = { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };
	static int anInt442;
	static int anInt443;
	static Class225[] aClass225Array444;

	public static void method506(boolean bool) {
		try {
			aClass225Array444 = null;
			if (bool != false)
				method506(false);
			aStringArrayArray441 = null;
			IncomingOpcode.aClass58_433 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dq.B(" + bool + ')');
		}
	}

	final boolean method507(int i, int i_0_) {
		try {
			if (i_0_ != -6634)
				return true;
			return aClass151Array437[i].method2439(31565);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dq.D(" + i + ',' + i_0_ + ')');
		}
	}

	final void method508(boolean bool, boolean bool_1_, int i, int i_2_, boolean bool_3_, int i_4_) {
		try {
			bool_1_ &= aHa_Sub1_435.method1747();
			if (bool_3_ == true) {
				if (!bool_1_ && (i_4_ == 4 || i_4_ == 8 || i_4_ == 9)) {
					if (i_4_ == 4)
						i = i_2_;
					i_4_ = 2;
				}
				if (i_4_ != 0 && bool)
					i_4_ |= ~0x7fffffff;
				if (anInt436 == i_4_) {
					if (anInt436 != 0) {
						aClass151Array437[0x7fffffff & anInt436].method2443(bool, 255);
						if (i_2_ != anInt434 || i != anInt438) {
							aClass151Array437[0x7fffffff & anInt436].method2441(i_2_, i, -57);
							anInt438 = i;
							anInt434 = i_2_;
						}
					}
				} else {
					if (anInt436 != 0)
						aClass151Array437[anInt436 & 0x7fffffff].method2445((byte) 61);
					if (i_4_ != 0) {
						aClass151Array437[i_4_ & 0x7fffffff].method2440(!bool_3_, bool);
						aClass151Array437[0x7fffffff & i_4_].method2443(bool, 255);
						aClass151Array437[0x7fffffff & i_4_].method2441(i_2_, i, -51);
					}
					anInt434 = i_2_;
					anInt438 = i;
					anInt436 = i_4_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dq.A(" + bool + ',' + bool_1_ + ',' + i + ',' + i_2_ + ',' + bool_3_ + ',' + i_4_ + ')'));
		}
	}

	final boolean method509(Class42 class42, boolean bool, int i) {
		try {
			if (anInt436 == 0)
				return false;
			aClass151Array437[0x7fffffff & anInt436].method2442(class42, bool, i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dq.C(" + (class42 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	Class55(ha_Sub1 var_ha_Sub1) {
		anInt434 = 0;
		do {
			try {
				aHa_Sub1_435 = var_ha_Sub1;
				aClass51_439 = new Class51(var_ha_Sub1);
				aClass151Array437 = new Class151[10];
				aClass151Array437[1] = new Class151_Sub6(var_ha_Sub1);
				aClass151Array437[2] = new Class151_Sub3(var_ha_Sub1, aClass51_439);
				aClass151Array437[4] = new Class151_Sub1(var_ha_Sub1, aClass51_439);
				aClass151Array437[5] = new Class151_Sub7(var_ha_Sub1, aClass51_439);
				aClass151Array437[6] = new Class151_Sub5(var_ha_Sub1);
				aClass151Array437[7] = new Class151_Sub8(var_ha_Sub1);
				aClass151Array437[3] = this.aClass151_Sub9_432 = new Class151_Sub9(var_ha_Sub1);
				aClass151Array437[8] = new Class151_Sub4(var_ha_Sub1, aClass51_439);
				aClass151Array437[9] = new Class151_Sub2(var_ha_Sub1, aClass51_439);
				if (!aClass151Array437[8].method2439(31565))
					aClass151Array437[8] = aClass151Array437[4];
				if (aClass151Array437[9].method2439(31565))
					break;
				aClass151Array437[9] = aClass151Array437[8];
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("dq.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		anInt442 = -2;
		anInt443 = 52;
		aClass225Array444 = new Class225[37];
	}
}
