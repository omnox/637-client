/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class126 {
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iia.toString(" + ')');
		}
	}

	static final int method2216(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ < 27)
				return 3;
			if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
				int i_2_ = i;
				i = i_1_;
				i_1_ = i_2_;
			}
			int i_3_;
			for (/**/; (i_1_ ^ 0xffffffff) != -1; i_1_ = i_3_) {
				i_3_ = i % i_1_;
				i = i_1_;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iia.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public Class126() {
		/* empty */
	}

	static final void method2217(byte i, Class98_Sub47 class98_sub47, int i_4_, ha var_ha, Class326 class326, int i_5_, Class24 class24, int i_6_, int i_7_) {
		try {
			if (i >= 6) {
				int i_8_ = i_7_ - (i_4_ / 2 - -5);
				int i_9_ = i_5_ - -2;
				if (((Class24) class24).anInt226 != 0)
					var_ha.method1760(10 + i_4_, (-i_9_ + i_5_ - -(i_6_ * class326.method3705()) + 1), i_9_, ((Class24) class24).anInt226, (byte) -66, i_8_);
				if (((Class24) class24).anInt239 != 0)
					var_ha.method1781(true, (-i_9_ + i_6_ * class326.method3705() + i_5_ + 1), 10 + i_4_, ((Class24) class24).anInt239, i_8_, i_9_);
				int i_10_ = ((Class24) class24).anInt257;
				if (((Class98_Sub47) class98_sub47).aBoolean4275 && ((Class24) class24).anInt238 != -1)
					i_10_ = ((Class24) class24).anInt238;
				for (int i_11_ = 0; (i_6_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
					String string = Class35.aStringArray335[i_11_];
					if ((i_6_ + -1 ^ 0xffffffff) < (i_11_ ^ 0xffffffff))
						string = string.substring(0, -4 + string.length());
					class326.method3706(var_ha, string, i_7_, i_5_, i_10_, true);
					i_5_ += class326.method3705();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iia.B(" + i + ',' + (class98_sub47 != null ? "{...}" : "null") + ',' + i_4_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class326 != null ? "{...}" : "null") + ',' + i_5_ + ',' + (class24 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}
}
