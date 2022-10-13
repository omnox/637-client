/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245 {
	static RuneScapeCache aClass207_1862;
	private Class218 aClass218_1863 = new Class218();
	static RuneScapeCache aClass207_1864;
	static Class338[] aClass338Array1865 = new Class338[50];
	String aString1866;
	private volatile int anInt1867;
	private Class174 aClass174_1868;

	public static void method2955(byte i) {
		try {
			if (i != 67)
				aClass207_1862 = null;
			aClass207_1862 = null;
			aClass338Array1865 = null;
			aClass207_1864 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ph.F(" + i + ')');
		}
	}

	final Class246 method2956(int i) {
		try {
			Object object = null;
			Class246 class246;
			synchronized (aClass218_1863) {
				class246 = aClass218_1863.method2803((byte) 15);
				class246.method2965((byte) 123);
				anInt1867--;
				if (i != 0)
					method2958((byte) 124, null);
			}
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ph.A(" + i + ')');
		}
	}

	final void method2957(Class174 class174, boolean bool) {
		try {
			aClass174_1868 = class174;
			if (bool != false)
				anInt1867 = -25;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ph.D(" + (class174 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method2958(byte i, AnimableEntity class246_sub3) {
		try {
			int i_0_ = 106 % ((i - -71) / 50);
			class246_sub3.aBoolean5078 = true;
			synchronized (aClass218_1863) {
				aClass218_1863.method2808(true, class246_sub3);
				anInt1867++;
			}
			if (aClass174_1868 != null) {
				synchronized (aClass174_1868) {
					aClass174_1868.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ph.B(" + i + ',' + (class246_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2959(int i) {
		try {
			if (i < 113)
				aClass338Array1865 = null;
			if (anInt1867 != 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ph.G(" + i + ')');
		}
	}

	final void method2960(AnimableEntity class246_sub3, int i) {
		try {
			class246_sub3.aBoolean5078 = false;
			synchronized (aClass218_1863) {
				aClass218_1863.method2808(true, class246_sub3);
				anInt1867++;
			}
			if (i != 0)
				method2959(22);
			if (aClass174_1868 != null) {
				synchronized (aClass174_1868) {
					aClass174_1868.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ph.E(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2961(boolean bool, Class246_Sub10 class246_sub10) {
		try {
			synchronized (aClass218_1863) {
				aClass218_1863.method2808(bool, class246_sub10);
				anInt1867++;
			}
			if (aClass174_1868 != null) {
				synchronized (aClass174_1868) {
					aClass174_1868.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ph.C(" + bool + ',' + (class246_sub10 != null ? "{...}" : "null") + ')'));
		}
	}

	Class245(String string) {
		try {
			this.aString1866 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ph.<init>(" + (string != null ? "{...}" : "null") + ')');
		}
	}
}
