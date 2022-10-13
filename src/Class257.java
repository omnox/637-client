/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class257 {
	static int anInt1946;
	static RuneScapeCache aClass207_1947;
	static int anInt1948 = 0;
	private RuneScapeCache aClass207_1949;
	private Class79 aClass79_1950 = new Class79(64);

	final void method3197(byte i, int i_0_) {
		try {
			synchronized (aClass79_1950) {
				if (i != 30)
					method3199(true, 112);
				aClass79_1950.method800((byte) 62, i_0_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qb.D(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method3198(int i) {
		try {
			if (i < 48)
				anInt1946 = -4;
			aClass207_1947 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qb.C(" + i + ')');
		}
	}

	final RenderAnimDefinitions method3199(boolean bool, int i) {
		try {
			RenderAnimDefinitions class294;
			synchronized (aClass79_1950) {
				class294 = (RenderAnimDefinitions) aClass79_1950.get((long) i);
			}
			if (class294 != null)
				return class294;
			byte[] is;
			synchronized (aClass207_1949) {
				is = aClass207_1949.readArchive(i, 32);
			}
			class294 = new RenderAnimDefinitions();
			if (is != null)
				class294.method3475(-22400, new RSByteBuffer(is));
			synchronized (aClass79_1950) {
				aClass79_1950.put((long) i, class294);
			}
			return class294;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qb.A(" + bool + ',' + i + ')');
		}
	}

	final void method3200(byte i) {
		try {
			synchronized (aClass79_1950) {
				aClass79_1950.method794(102);
			}
			int i_1_ = 123 % ((-39 - i) / 60);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qb.F(" + i + ')');
		}
	}

	static final void method3201(byte i, boolean bool) {
		try {
			Class128.method2224(22696);
			if (za_Sub2.method1683(-11297, Class177.anInt1376)) {
				Class196.anInt1511++;
				if ((Class196.anInt1511 ^ 0xffffffff) <= -51 || bool) {
					if (i < 45)
						method3198(75);
					Class196.anInt1511 = 0;
					if (!Class76_Sub9.aBoolean3788 && aa_Sub1.aClass123_3561 != null) {
						Class76_Sub5.anInt3746++;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class98_Sub40.aClass171_4193), (Class331.aClass117_2811));
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						try {
							Class95.method920((byte) 81);
						} catch (java.io.IOException ioexception) {
							Class76_Sub9.aBoolean3788 = true;
						}
					}
					Class128.method2224(22696);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qb.E(" + i + ',' + bool + ')');
		}
	}

	final void method3202(byte i) {
		try {
			synchronized (aClass79_1950) {
				if (i != 96)
					aClass207_1949 = null;
				aClass79_1950.method806((byte) -121);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qb.B(" + i + ')');
		}
	}

	Class257(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_1949 = class207;
			aClass207_1949.method2761(0, 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qb.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt1946 = -2;
	}
}
