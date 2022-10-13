/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11 {
	static GameInterfaceData aClass293_120;
	static long aLong121;
	private RuneScapeCache aClass207_122;
	static int[] anIntArray123 = new int[1];
	RuneScapeCache aClass207_124;
	private Class79 aClass79_125 = new Class79(64);
	Class79 aClass79_126 = new Class79(2);

	public static void method199(byte i) {
		try {
			int i_0_ = -118 % ((-83 - i) / 34);
			aClass293_120 = null;
			anIntArray123 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aq.E(" + i + ')');
		}
	}

	final void method200(int i) {
		try {
			synchronized (aClass79_125) {
				aClass79_125.method806((byte) -108);
			}
			synchronized (((Class11) this).aClass79_126) {
				((Class11) this).aClass79_126.method806((byte) -100);
			}
			if (i != 1)
				method203(false, 10);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aq.B(" + i + ')');
		}
	}

	final void method201(byte i) {
		try {
			synchronized (aClass79_125) {
				aClass79_125.method794(123);
			}
			synchronized (((Class11) this).aClass79_126) {
				((Class11) this).aClass79_126.method794(42);
			}
			if (i <= 121)
				method199((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aq.A(" + i + ')');
		}
	}

	final Class231 method202(int i, int i_1_) {
		try {
			if (i_1_ != 25930)
				aClass207_122 = null;
			Class231 class231;
			synchronized (aClass79_125) {
				class231 = (Class231) aClass79_125.get((long) i);
			}
			if (class231 != null)
				return class231;
			byte[] is;
			synchronized (aClass207_122) {
				is = aClass207_122.readArchive(i, 33);
			}
			class231 = new Class231();
			((Class231) class231).aClass11_1737 = this;
			if (is != null)
				class231.method2880(true, new RSByteBuffer(is));
			synchronized (aClass79_125) {
				aClass79_125.put((long) i, class231);
			}
			return class231;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aq.D(" + i + ',' + i_1_ + ')');
		}
	}

	final void method203(boolean bool, int i) {
		try {
			synchronized (aClass79_125) {
				aClass79_125.method800((byte) 62, i);
			}
			if (bool != false)
				method203(true, 93);
			synchronized (((Class11) this).aClass79_126) {
				((Class11) this).aClass79_126.method800((byte) 62, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aq.C(" + bool + ',' + i + ')');
		}
	}

	Class11(Class279 class279, int i, RuneScapeCache class207, RuneScapeCache class207_2_) {
		try {
			aClass207_122 = class207;
			((Class11) this).aClass207_124 = class207_2_;
			aClass207_122.method2761(0, 33);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("aq.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ',' + (class207_2_ != null ? "{...}" : "null") + ')'));
		}
	}
}
