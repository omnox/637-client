/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class145 {
	static int anInt1170 = -1;
	private int anInt1171;
	static int anInt1172 = 0;
	static Class268 aClass268_1173;
	private boolean aBoolean1174;
	static int[] anIntArray1175;
	private boolean aBoolean1176;
	static int[] anIntArray1177 = new int[2];
	private int anInt1178;

	static final long method2313(byte i, String string) {
		try {
			int i_0_ = string.length();
			long l = 0L;
			if (i > -118)
				return 54L;
			for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
				l = (long) string.charAt(i_1_) + (l << -470840507) + -l;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.B(" + i + ',' + (string != null ? "{...}" : "null") + ')');
		}
	}

	public static void method2314(int i) {
		try {
			if (i != -1)
				method2315(-27, null);
			aClass268_1173 = null;
			anIntArray1175 = null;
			anIntArray1177 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.F(" + i + ')');
		}
	}

	static final String method2315(int i, String string) {
		try {
			if (Class19.aString3448.startsWith("win"))
				return string + ".dll";
			if (!Class19.aString3448.startsWith("linux")) {
				if (Class19.aString3448.startsWith("mac"))
					return "lib" + string + ".dylib";
			} else
				return "lib" + string + ".so";
			int i_2_ = -104 / ((-5 - i) / 50);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.E(" + i + ',' + (string != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method2316(boolean bool) {
		try {
			if (bool != true)
				method2316(false);
			return aBoolean1176;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.D(" + bool + ')');
		}
	}

	final boolean method2317(boolean bool) {
		try {
			if (bool != false)
				aClass268_1173 = null;
			return aBoolean1174;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.A(" + bool + ')');
		}
	}

	final int method2318(int i) {
		try {
			if (i != -1)
				return 72;
			return anInt1178;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.G(" + i + ')');
		}
	}

	final int method2319(int i) {
		try {
			if (i != 32755)
				anIntArray1175 = null;
			return anInt1171;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.C(" + i + ')');
		}
	}

	Class145(boolean bool, int i, int i_3_, boolean bool_4_) {
		try {
			anInt1171 = i_3_;
			aBoolean1174 = bool;
			aBoolean1176 = bool_4_;
			anInt1178 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("k.<init>(" + bool + ',' + i + ',' + i_3_ + ',' + bool_4_ + ')'));
		}
	}
}
