/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class48 {
	static int anInt409;
	static int anInt410 = -60;

	static final int method453(int i, int i_0_) {
		try {
			i_0_ = --i_0_ | i_0_ >>> 1;
			i_0_ |= i_0_ >>> 2;
			i_0_ |= i_0_ >>> 4;
			i_0_ |= i_0_ >>> 8;
			i_0_ |= i_0_ >>> 16;
			if (i != 423660257)
				anInt409 = -77;
			return i_0_ - -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "di.K(" + i + ',' + i_0_ + ')');
		}
	}

	public Class48() {
		/* empty */
	}

	static final String method454(int i, boolean bool) {
		try {
			if (bool != true)
				method453(94, -10);
			Class98_Sub36 class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277.method3990(i, -1));
			if (class98_sub36 != null) {
				Class98_Sub43_Sub4 class98_sub43_sub4 = class98_sub36.aClass237_Sub1_4157.method2913(1);
				if (class98_sub43_sub4 != null) {
					double d = class98_sub36.aClass237_Sub1_4157.method2901((byte) -100);
					if ((double) class98_sub43_sub4.method1511(-48) <= d && d <= (double) class98_sub43_sub4.method1509(-6085))
						return class98_sub43_sub4.method1503(22875);
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "di.L(" + i + ',' + bool + ')');
		}
	}

	static {
		anInt409 = 0;
	}
}
