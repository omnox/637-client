/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class150 {
	static OutgoingOpcode aClass171_1209 = new OutgoingOpcode(19, 2);
	static int anInt1211 = 0;
	public static void method2436(boolean bool) {
		try {
			IncomingOpcode.minimapFlagOpcode = null;
			aClass171_1209 = null;
			IncomingOpcode.aClass58_1212 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kca.A(" + bool + ')');
		}
	}

	static final int readFile(int fileId) {
		try {
			return fileId >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kca.B(" + fileId + ')');
		}
	}
}
