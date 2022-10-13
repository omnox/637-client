/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115 {
	private Class79 aClass79_959 = new Class79(16);
	static int anInt960;
	static float[] aFloatArray961 = new float[4];
	private RuneScapeCache aClass207_962;
	static int anInt963;

	final void method2152(int i) {
		try {
			synchronized (aClass79_959) {
				aClass79_959.method794(97);
			}
			if (i != 21185)
				method2155();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.G(" + i + ')');
		}
	}

	final void method2153(int i, byte i_0_) {
		do {
			try {
				synchronized (aClass79_959) {
					aClass79_959.method800((byte) 62, i);
				}
				if (i_0_ < -117)
					break;
				method2154((byte) -111);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hh.C(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	public static void method2154(byte i) {
		try {
			if (i == -67)
				aFloatArray961 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.A(" + i + ')');
		}
	}

	static final void method2155() {
		Class98_Sub10_Sub27.aClass84_5692 = Class98_Sub10_Sub27.aClass84_5693;
	}

	static final void method2156(boolean bool, String string, int i) {
		try {
			Class57.method519(bool, string, -1, -1, -1);
			if (i > -61)
				method2156(false, null, 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hh.E(" + bool + ',' + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class266 method2157(int i, byte i_1_) {
		try {
			Class266 class266;
			synchronized (aClass79_959) {
				class266 = (Class266) aClass79_959.get(i);
			}
			if (class266 != null)
				return class266;
			if (i_1_ != -87)
				aClass207_962 = null;
			byte[] is;
			synchronized (aClass207_962) {
				is = aClass207_962.readArchive(i, 30);
			}
			class266 = new Class266();
			if (is != null)
				class266.method3236(new RSByteBuffer(is), (byte) -16);
			synchronized (aClass79_959) {
				aClass79_959.put(i, class266);
			}
			return class266;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.B(" + i + ',' + i_1_ + ')');
		}
	}

	final void method2158(boolean bool) {
		try {
			if (bool == true) {
				synchronized (aClass79_959) {
					aClass79_959.method806((byte) -104);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.D(" + bool + ')');
		}
	}

	Class115(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_962 = class207;
			aClass207_962.method2761(0, 30);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hh.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt960 = -1;
		anInt963 = 0;
	}
}
