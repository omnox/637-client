/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class370 {
	int[] anIntArray3133;
	static int[] anIntArray3135 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	static Class257 aClass257_3136;
	int anInt3137;
	int[] anIntArray3138;
	static int anInt3139;
	static int anInt3140;

	public static void method3956(int i) {
		try {
			anIntArray3135 = null;
			aClass257_3136 = null;
			if (i <= -118)
				IncomingOpcode.aClass58_3134 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wf.A(" + i + ')');
		}
	}

	Class370(int i) {
		try {
			((Class370) this).anInt3137 = i;
			((Class370) this).anIntArray3133 = new int[((Class370) this).anInt3137];
			((Class370) this).anIntArray3138 = new int[((Class370) this).anInt3137];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wf.<init>(" + i + ')');
		}
	}
}
