/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class89 {
	int anInt707;
	int anInt708;
	static long[] aLongArray709 = new long[32];
	int anInt710;
	int anInt711;
	int anInt712;
	byte[] aByteArray713;
	byte[] aByteArray714;
	int anInt715;
	static String aString716 = null;
	int anInt717;

	public static void method879(boolean bool) {
		try {
			if (bool != true)
				method879(false);
			aString716 = null;
			aLongArray709 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fm.A(" + bool + ')');
		}
	}

	static final void method880(int i, RuneScapeCache class207) {
		try {
			if (i == -13258)
				Class64_Sub3.aClass207_3648 = class207;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fm.B(" + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class89() {
		/* empty */
	}
}
