/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class198 {
	static OutgoingOpcode aClass171_1521;
	private RuneScapeCache aClass207_1522;
	private Class79 aClass79_1523 = new Class79(64);
	static int anInt1524 = 0;
	static long aLong1525;

	static final int method2678(byte i, int i_0_, int i_1_) {
		try {
			if (i != 6)
				aClass171_1521 = null;
			int i_2_ = -1 + i_1_ & i_0_ >> 31;
			return ((i_0_ >>> 31) + i_0_) % i_1_ + i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nb.F(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2679(int i, byte i_3_) {
		try {
			if (i_3_ > -76)
				aClass207_1522 = null;
			synchronized (aClass79_1523) {
				aClass79_1523.method794(92);
				aClass79_1523 = new Class79(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nb.E(" + i + ',' + i_3_ + ')');
		}
	}

	final Class366 method2680(int i, byte i_4_) {
		try {
			if (i_4_ < 19)
				aClass171_1521 = null;
			Class366 class366;
			synchronized (aClass79_1523) {
				class366 = (Class366) aClass79_1523.get(i);
			}
			if (class366 != null)
				return class366;
			byte[] is;
			synchronized (aClass207_1522) {
				is = aClass207_1522.readArchive(Class32.method318(i, (byte) -79), Class234.method2886(i, -123));
			}
			class366 = new Class366();
			if (is != null)
				class366.method3945(new RSByteBuffer(is), -6364);
			synchronized (aClass79_1523) {
				aClass79_1523.put(i, class366);
			}
			return class366;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nb.D(" + i + ',' + i_4_ + ')');
		}
	}

	final void method2681(byte i, int i_5_) {
		try {
			if (i >= 125) {
				synchronized (aClass79_1523) {
					aClass79_1523.method800((byte) 62, i_5_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nb.B(" + i + ',' + i_5_ + ')');
		}
	}

	public static void method2682(boolean bool) {
		try {
			if (bool != false)
				method2682(false);
			aClass171_1521 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nb.A(" + bool + ')');
		}
	}

	final void method2683(int i) {
		try {
			synchronized (aClass79_1523) {
				aClass79_1523.method806((byte) -127);
				if (i != 0)
					aClass171_1521 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nb.C(" + i + ')');
		}
	}

	Class198(Class279 class279, int i, RuneScapeCache class207) {
		do {
			try {
				aClass207_1522 = class207;
				if (aClass207_1522 == null)
					break;
				int i_6_ = aClass207_1522.method2752((byte) -11) + -1;
				aClass207_1522.method2761(0, i_6_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("nb.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method2684(int i) {
		try {
			synchronized (aClass79_1523) {
				if (i != -4742) {
					/* empty */
				} else
					aClass79_1523.method794(64);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nb.G(" + i + ')');
		}
	}

	static {
		aClass171_1521 = new OutgoingOpcode(27, 3);
	}
}
