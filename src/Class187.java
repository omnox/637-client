/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class187 {
	static Class143 aClass143_1449;
	static int anInt1450;
	static boolean aBoolean1451 = false;

	static final void method2634(int i, GameInterfaceData[] class293s, int i_0_) {
		try {
			int i_1_ = i;
			for (/**/; (class293s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				GameInterfaceData class293 = class293s[i_1_];
				if (class293 != null) {
					if ((((GameInterfaceData) class293).type ^ 0xffffffff) == -1) {
						if (((GameInterfaceData) class293).interfaceComponents != null)
							method2634(i, (((GameInterfaceData) class293).interfaceComponents), i_0_);
						GameInterface class98_sub18 = ((GameInterface) (Class116.aClass377_964.method3990((long) ((GameInterfaceData) class293).anInt2248, -1)));
						if (class98_sub18 != null)
							RuneScapeCache.method2764(i_0_, ((GameInterface) class98_sub18).interfaceID, -105);
					}
					if ((i_0_ ^ 0xffffffff) == -1 && ((GameInterfaceData) class293).anObjectArray2330 != null) {
						ClientScript2Event class98_sub21 = new ClientScript2Event();
						((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) class293).anObjectArray2330;
						((ClientScript2Event) class98_sub21).component = class293;
						ClientScript2Runtime.method3144(class98_sub21);
					}
					if ((i_0_ ^ 0xffffffff) == -2 && ((GameInterfaceData) class293).anObjectArray2319 != null) {
						if ((((GameInterfaceData) class293).anInt2300 ^ 0xffffffff) <= -1) {
							GameInterfaceData class293_2_ = Class159.method2509((((GameInterfaceData) class293).anInt2248), -9820);
							if (class293_2_ == null || (((GameInterfaceData) class293_2_).interfaceComponents == null) || (((((GameInterfaceData) class293_2_).interfaceComponents).length ^ 0xffffffff) >= (((GameInterfaceData) class293).anInt2300 ^ 0xffffffff)) || ((((GameInterfaceData) class293_2_).interfaceComponents[((GameInterfaceData) class293).anInt2300]) != class293))
								continue;
						}
						ClientScript2Event class98_sub21 = new ClientScript2Event();
						((ClientScript2Event) class98_sub21).component = class293;
						((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) class293).anObjectArray2319;
						ClientScript2Runtime.method3144(class98_sub21);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mh.A(" + i + ',' + (class293s != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	public static void method2635(int i) {
		try {
			if (i >= 99)
				aClass143_1449 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mh.D(" + i + ')');
		}
	}

	static final boolean method2636(int i, int i_3_, int i_4_) {
		try {
			if (i_4_ != 3)
				return true;
			if ((Class151_Sub2.method2451(i, 544, i_3_) | (i & 0x10000 ^ 0xffffffff) != -1) || Class64_Sub28.method670(i, -12294, i_3_))
				return true;
			if ((0x37 & i_3_ ^ 0xffffffff) != -1 || !Class228.method2864(55, i, i_3_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mh.B(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method2637(int i, int i_5_, int i_6_, byte[] is, byte[] is_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			int i_12_ = -(i_11_ >> 14184194);
			i_11_ = -(0x3 & i_11_);
			if (i_8_ != -18305)
				method2634(8, null, 105);
			for (int i_13_ = -i; (i_13_ ^ 0xffffffff) > -1; i_13_++) {
				for (int i_14_ = i_12_; (i_14_ ^ 0xffffffff) > -1; i_14_++) {
					is_7_[i_5_++] += -is[i_6_++];
					is_7_[i_5_++] += -is[i_6_++];
					is_7_[i_5_++] += -is[i_6_++];
					is_7_[i_5_++] += -is[i_6_++];
				}
				for (int i_15_ = i_11_; (i_15_ ^ 0xffffffff) > -1; i_15_++)
					is_7_[i_5_++] += -is[i_6_++];
				i_6_ += i_9_;
				i_5_ += i_10_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mh.C(" + i + ',' + i_5_ + ',' + i_6_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_7_ != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}
}
