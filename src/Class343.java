/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class343 {
	static String aString2863;

	static final boolean method3817(byte i, int i_0_) {
		try {
			int i_1_ = -25 % ((i - 54) / 38);
			if (i_0_ != 46 && i_0_ != 50 && i_0_ != 48 && i_0_ != 58 && i_0_ != 5 && i_0_ != 57 && i_0_ != 59)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ur.B(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method3818(int i) {
		do {
			try {
				aString2863 = null;
				if (i == -59)
					break;
				method3819(-110);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ur.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final synchronized long method3819(int i) {
		try {
			if (i != -47)
				method3818(-90);
			long l = System.currentTimeMillis();
			if (Class342.aLong2862 > l)
				Class360.aLong3070 += Class342.aLong2862 - l;
			Class342.aLong2862 = l;
			return Class360.aLong3070 + l;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ur.A(" + i + ')');
		}
	}
}
