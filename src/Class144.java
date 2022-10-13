/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class144 {
	static Class258 aClass258_1168 = new Class258();
	static int anInt1169 = -1;

	static final boolean method2311(boolean bool, int i) {
		try {
			if (bool != false)
				return true;
			if ((i ^ 0xffffffff) != -2 && (i ^ 0xffffffff) != -4 && (i ^ 0xffffffff) != -6)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jw.A(" + bool + ',' + i + ')');
		}
	}

	public static void method2312(int i) {
		try {
			if (i != -6569)
				aClass258_1168 = null;
			aClass258_1168 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jw.B(" + i + ')');
		}
	}
}
