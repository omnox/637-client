/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class241 {
	static int anInt1845;
	static int[] anIntArray1846 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	static Object anObject1847;

	static final boolean method2931(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ != 262144)
				anInt1845 = 31;
			if (!(RSByteBuffer.method1241(false, i, i_1_) | (0x40000 & i_1_) != 0) && !Class98_Sub27.method1292(i, (byte) 116, i_1_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pe.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2932(int i) {
		try {
			if (i != 14441)
				anIntArray1846 = null;
			anIntArray1846 = null;
			anObject1847 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pe.A(" + i + ')');
		}
	}
}
