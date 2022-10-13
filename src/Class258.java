/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class258 {
	static Class155[] aClass155Array1951;
	static int anInt1952 = 0;

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qc.toString(" + ')');
		}
	}

	public Class258() {
		/* empty */
	}

	static final Class119_Sub2 method3203(byte i, RSByteBuffer class98_sub22) {
		try {
			if (i >= -91)
				aClass155Array1951 = null;
			return new Class119_Sub2(class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readMedium(-126), class98_sub22.readMedium(-123), class98_sub22.readUnsignedByte());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qc.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3204(byte i) {
		do {
			try {
				aClass155Array1951 = null;
				if (i == -18)
					break;
				aClass155Array1951 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qc.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
