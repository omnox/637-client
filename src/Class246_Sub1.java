/* Class246_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1 extends Class246 {
	Class246_Sub6[] aClass246_Sub6Array5067;
	static OutgoingOpcode aClass171_5068 = new OutgoingOpcode(66, -1);
	AnimableEntity aClass246_Sub3_5069;
	boolean aBoolean5070;

	static final void method2966(int i) {
		try {
			if (i == 66) {
				for (Class98_Sub46_Sub3 class98_sub46_sub3 = ((Class98_Sub46_Sub3) Class98_Sub10_Sub11.aClass148_5596.method2418(32)); class98_sub46_sub3 != null; class98_sub46_sub3 = (Class98_Sub46_Sub3) Class98_Sub10_Sub11.aClass148_5596.method2417(i ^ 0x39)) {
					Class246_Sub3_Sub4_Sub3 class246_sub3_sub4_sub3 = (((Class98_Sub46_Sub3) class98_sub46_sub3).aClass246_Sub3_Sub4_Sub3_5954);
					if (((Class246_Sub3_Sub4_Sub3) class246_sub3_sub4_sub3).aBoolean6450) {
						class98_sub46_sub3.remove();
						class246_sub3_sub4_sub3.method3067(120);
					} else if ((((Class246_Sub3_Sub4_Sub3) class246_sub3_sub4_sub3).anInt6445 ^ 0xffffffff) >= (Class215.anInt1614 ^ 0xffffffff)) {
						class246_sub3_sub4_sub3.method3073((byte) 31, Class279.anInt2099);
						if (((Class246_Sub3_Sub4_Sub3) class246_sub3_sub4_sub3).aBoolean6450)
							class98_sub46_sub3.remove();
						else
							Class222.method2826(class246_sub3_sub4_sub3, true);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bd.B(" + i + ')');
		}
	}

	static final boolean method2967(int i, int i_0_, byte i_1_) {
		try {
			if (i_1_ != 91)
				return true;
			if ((i_0_ & 0x10000 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bd.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2968(byte i) {
		do {
			try {
				aClass171_5068 = null;
				if (i < -76)
					break;
				method2968((byte) -4);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bd.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2969(ha var_ha, int i, int i_2_, int i_3_) {
		try {
			if (i_3_ > -51)
				method2967(117, -111, (byte) -10);
			int i_4_ = ((Class246_Sub1) this).aClass246_Sub3_5069.method2986(-14240);
			if (((Class246_Sub1) this).aClass246_Sub6Array5067 != null) {
				for (int i_5_ = 0; (i_5_ < ((Class246_Sub1) this).aClass246_Sub6Array5067.length); i_5_++) {
					((Class246_Sub6) (((Class246_Sub1) this).aClass246_Sub6Array5067[i_5_])).anInt5109 <<= i_4_;
					if (((Class246_Sub1) this).aClass246_Sub6Array5067[i_5_].method3130(i, i_2_) && ((Class246_Sub1) this).aClass246_Sub3_5069.method2976(i, var_ha, (byte) 79, i_2_)) {
						((Class246_Sub6) (((Class246_Sub1) this).aClass246_Sub6Array5067[i_5_])).anInt5109 >>= i_4_;
						return true;
					}
					((Class246_Sub6) (((Class246_Sub1) this).aClass246_Sub6Array5067[i_5_])).anInt5109 >>= i_4_;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bd.D(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}
}
