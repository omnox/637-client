/* Class98_Sub46_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub15 extends Class98_Sub46 {
	static int anInt6039 = -1;
	short[][] aShortArrayArray6040;
	double aDouble6042;
	static Class232 aClass232_6043 = new Class232();

	final long method1608(int i) {
		try {
			if (i != 2)
				return -37L;
			return (this.aShortArrayArray6040[0]).length | (this.aShortArrayArray6040).length;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jba.A(" + i + ')');
		}
	}

	static final void method1609(int i, int i_0_) {
		try {
			if (Class85.getInterfaceData(i, 11) && i_0_ == -12889) {
				GameInterfaceData[] class293s = Class159.gameInterfaces[i];
				for (int i_1_ = 0; i_1_ < class293s.length; i_1_++) {
					GameInterfaceData class293 = class293s[i_1_];
					if (class293 != null) {
						class293.anInt2303 = 0;
						class293.anInt2312 = 0;
						class293.anInt2287 = 1;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jba.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final int method1610(boolean bool, byte i) {
		try {
			if (Class2.anIntArray70 == null)
				return 0;
			if (!bool && Class242.aClass244Array1851 != null)
				return Class2.anIntArray70.length * 2;
			int i_2_ = 0;
			for (int i_3_ = 0; (i_3_ < Class2.anIntArray70.length); i_3_++) {
				int i_4_ = Class2.anIntArray70[i_3_];
				if (Class64_Sub16.aClass207_3683.method2742(i + -161, i_4_))
					i_2_++;
				if (Class64_Sub17.aClass207_3687.method2742(i ^ ~0x4d, i_4_))
					i_2_++;
			}
			if (i != 90)
				anInt6039 = 34;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jba.E(" + bool + ',' + i + ')');
		}
	}

	static final boolean method1611(byte i, char c) {
		try {
			if (i < 117)
				method1612(false);
			if ((c < 65 || c > 90) && (c < 97 || c > 122))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jba.D(" + i + ',' + c + ')');
		}
	}

	Class98_Sub46_Sub15(short[][] is, double d) {
		try {
			this.aShortArrayArray6040 = is;
			this.aDouble6042 = d;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jba.<init>(" + (is != null ? "{...}" : "null") + ',' + d + ')'));
		}
	}

	public static void method1612(boolean bool) {
		try {
			if (bool != true)
				anInt6039 = 72;
			aClass232_6043 = null;
			IncomingOpcode.aClass58_6041 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jba.B(" + bool + ')');
		}
	}
}
