/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class32 {
	static int anInt303;
	static String[] aStringArray304 = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static int anInt305;
	private RuneScapeCache aClass207_306;
	static AnimableEntity[] aClass246_Sub3Array307;
	static int anInt308;
	int anInt309;
	private Class79 aClass79_310 = new Class79(64);
	static int[] anIntArray311 = new int[14];
	int anInt312 = 0;

	final void method313(byte i, int i_0_) {
		try {
			if (i == 30) {
				synchronized (aClass79_310) {
					aClass79_310.method800((byte) 62, i_0_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cfa.D(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method314(int i) {
		do {
			try {
				aStringArray304 = null;
				anIntArray311 = null;
				aClass246_Sub3Array307 = null;
				if (i == 0)
					break;
				method316(false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cfa.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method315(byte i) {
		do {
			try {
				synchronized (aClass79_310) {
					aClass79_310.method806((byte) -118);
				}
				if (i == -46)
					break;
				method318(-103, (byte) 73);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cfa.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method316(boolean bool) {
		try {
			OutputStream_Sub1.aClass240_36.method2923(bool);
			for (int i = 0; i < 32; i++)
				Class89.aLongArray709[i] = 0L;
			for (int i = 0; (i ^ 0xffffffff) > -33; i++)
				Class271.aLongArray2034[i] = 0L;
			if (bool != false)
				anInt308 = 51;
			Class42_Sub1.anInt5356 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cfa.A(" + bool + ')');
		}
	}

	final Class199 method317(int i, int i_1_) {
		try {
			Class199 class199;
			synchronized (aClass79_310) {
				class199 = (Class199) aClass79_310.get((long) i_1_);
			}
			if (class199 != null)
				return class199;
			byte[] is;
			synchronized (aClass207_306) {
				is = aClass207_306.readArchive(i_1_, i);
			}
			class199 = new Class199();
			((Class199) class199).anInt1536 = i_1_;
			((Class199) class199).aClass32_1528 = this;
			if (is != null)
				class199.method2688(i + 107, new RSByteBuffer(is));
			class199.method2691((byte) 80);
			synchronized (aClass79_310) {
				aClass79_310.put((long) i_1_, class199);
			}
			return class199;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cfa.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final int method318(int i, byte i_2_) {
		try {
			if (i_2_ > -51)
				return -16;
			return i & 0x3ff;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cfa.G(" + i + ',' + i_2_ + ')');
		}
	}

	final void method319(byte i) {
		try {
			synchronized (aClass79_310) {
				aClass79_310.method794(92);
				if (i != -117)
					((Class32) this).anInt312 = 123;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cfa.B(" + i + ')');
		}
	}

	Class32(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_306 = class207;
			((Class32) this).anInt309 = aClass207_306.method2761(0, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cfa.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt305 = 0;
	}
}
