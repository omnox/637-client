/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class273 {
	static int anInt2039 = 0;
	int anInt2040;
	private ha_Sub3_Sub2 aHa_Sub3_Sub2_2041;

	static final void method3280(byte i) {
		try {
			for (int i_0_ = 0; i_0_ < Class306.anInt2566; i_0_++) {
				Class338 class338 = Class245.aClass338Array1865[i_0_];
				if (class338.aByte2840 == 3) {
					if (class338.aClass98_Sub31_Sub5_2836 != null)
						Class81.aClass98_Sub31_Sub3_619.method1374(class338.aClass98_Sub31_Sub5_2836);
					else
						class338.anInt2832 = -2147483648;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qv.A(" + i + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			aHa_Sub3_Sub2_2041.method2085(true, this.anInt2040);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qv.finalize(" + ')');
		}
	}

	static final byte[] method3281(int i, File file) {
		try {
			int i_1_ = -127 % ((i - 20) / 62);
			return Class375.method3988(file, (byte) 78, (int) file.length());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qv.B(" + i + ',' + (file != null ? "{...}" : "null") + ')'));
		}
	}

	Class273(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i, int i_2_) {
		try {
			this.anInt2040 = i_2_;
			aHa_Sub3_Sub2_2041 = var_ha_Sub3_Sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qv.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')'));
		}
	}
}
