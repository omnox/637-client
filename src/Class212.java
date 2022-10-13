/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class212 {
	static int[] anIntArray1597 = new int[5];
	private Class79 aClass79_1598 = new Class79(64);
	static long aLong1599;
	static int anInt1600 = 0;
	private RuneScapeCache aClass207_1601;
	private RuneScapeCache aClass207_1602;
	static RuneScapeCache aClass207_1603;

	public static void method2776(byte i) {
		try {
			if (i == -102) {
				aClass207_1603 = null;
				anIntArray1597 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "np.B(" + i + ')');
		}
	}

	final Class98_Sub46_Sub1 method2777(int i, int i_0_) {
		try {
			Class98_Sub46_Sub1 class98_sub46_sub1 = ((Class98_Sub46_Sub1) aClass79_1598.get(i_0_));
			if (class98_sub46_sub1 != null)
				return class98_sub46_sub1;
			byte[] is;
			do {
				if (i_0_ >= 32768) {
					is = aClass207_1602.readArchive(0x7fff & i_0_, 0);
					if (!client.aBoolean3553)
						break;
				}
				is = aClass207_1601.readArchive(i_0_, 0);
			} while (false);
			class98_sub46_sub1 = new Class98_Sub46_Sub1();
			if (i != 28559)
				return null;
			if (is != null)
				class98_sub46_sub1.method1532(new RSByteBuffer(is), true);
			if (i_0_ >= 32768)
				class98_sub46_sub1.method1531(i ^ 0xef8f);
			aClass79_1598.put(i_0_, class98_sub46_sub1);
			return class98_sub46_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "np.A(" + i + ',' + i_0_ + ')');
		}
	}

	Class212(int i, RuneScapeCache class207, RuneScapeCache class207_1_) {
		do {
			try {
				aClass207_1601 = class207;
				aClass207_1602 = class207_1_;
				if (aClass207_1601 != null)
					aClass207_1601.method2761(0, 0);
				if (aClass207_1602 == null)
					break;
				aClass207_1602.method2761(0, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("np.<init>(" + i + ',' + (class207 != null ? "{...}" : "null") + ',' + (class207_1_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aLong1599 = 20000000L;
	}
}
