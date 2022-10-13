/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class252 {
	private Class215 aClass215_1922;
	static int anInt1923 = 0;
	static int anInt1924;
	private Class98_Sub46 aClass98_Sub46_1925;
	static Class225 aClass225_1926;
	static Class172[][][] aClass172ArrayArrayArray1927;

	public static void method3172(int i) {
		try {
			if (i == 0) {
				aClass225_1926 = null;
				aClass172ArrayArrayArray1927 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pq.A(" + i + ')');
		}
	}

	final Class98_Sub46 method3173(boolean bool) {
		try {
			if (bool != true)
				return null;
			Class98_Sub46 class98_sub46 = (aClass215_1922.aClass98_Sub46_1615.aClass98_Sub46_4262);
			if (class98_sub46 == aClass215_1922.aClass98_Sub46_1615) {
				aClass98_Sub46_1925 = null;
				return null;
			}
			aClass98_Sub46_1925 = class98_sub46.aClass98_Sub46_4262;
			return class98_sub46;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pq.C(" + bool + ')');
		}
	}

	final Class98_Sub46 method3174(int i) {
		try {
			if (i != 0)
				method3172(-48);
			Class98_Sub46 class98_sub46 = aClass98_Sub46_1925;
			if (aClass215_1922.aClass98_Sub46_1615 == class98_sub46) {
				aClass98_Sub46_1925 = null;
				return null;
			}
			aClass98_Sub46_1925 = class98_sub46.aClass98_Sub46_4262;
			return class98_sub46;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pq.B(" + i + ')');
		}
	}

	public Class252() {
		/* empty */
	}

	Class252(Class215 class215) {
		try {
			aClass215_1922 = class215;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pq.<init>(" + (class215 != null ? "{...}" : "null") + ')');
		}
	}
}
