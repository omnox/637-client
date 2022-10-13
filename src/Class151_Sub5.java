/* Class151_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151_Sub5 extends Class151 {
	static int anInt4990;
	static boolean aBoolean4991 = false;
	static int anInt4993;

	final void method2441(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ > -2)
				method2445((byte) -119);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mca.G(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final boolean method2439(int i) {
		try {
			if (i != 31565)
				method2461(-54);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.A(" + i + ')');
		}
	}

	public static void method2461(int i) {
		do {
			try {
				IncomingOpcode.aClass58_4992 = null;
				if (i == -3)
					break;
				anInt4993 = -98;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mca.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2442(Class42 class42, boolean bool, int i) {
		try {
			if (bool != false)
				method2440(false, false);
			this.aHa_Sub1_1215.method1863(1, class42);
			this.aHa_Sub1_1215.method1896(260, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mca.F(" + (class42 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	Class151_Sub5(ha_Sub1 var_ha_Sub1) {
		super(var_ha_Sub1);
	}

	final void method2440(boolean bool, boolean bool_2_) {
		try {
			if (bool != false)
				IncomingOpcode.aClass58_4992 = null;
			this.aHa_Sub1_1215.method1905(true, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mca.D(" + bool + ',' + bool_2_ + ')'));
		}
	}

	final void method2443(boolean bool, int i) {
		try {
			if (i != 255)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.C(" + bool + ',' + i + ')');
		}
	}

	static final boolean method2462(int i, byte i_3_) {
		try {
			int i_4_ = -111 / ((-43 - i_3_) / 52);
			if (i != 0 && i != 2)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.H(" + i + ',' + i_3_ + ')');
		}
	}

	final void method2445(byte i) {
		try {
			this.aHa_Sub1_1215.method1905(false, 0);
			if (i < 25)
				aBoolean4991 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.E(" + i + ')');
		}
	}
}
