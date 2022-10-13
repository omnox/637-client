/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class36 {
	int anInt338;
	int anInt339 = -1;
	int anInt340;
	int anInt341;
	int anInt342;
	int anInt343;
	int anInt345;
	int anInt346;
	int anInt347;
	static RuneScapeCache aClass207_348;
	static int anInt349;
	static int anInt350 = 2;

	public static void method339(int i) {
		try {
			if (i == -13) {
				aClass207_348 = null;
				IncomingOpcode.aClass58_344 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ck.A(" + i + ')');
		}
	}

	static final boolean method340(int i, byte i_0_) {
		try {
			if (i_0_ > -23)
				method341(34, -5);
			if ((i ^ 0xffffffff) == -11 || i == 25 || (i ^ 0xffffffff) == -12 || (i ^ 0xffffffff) == -13 || i == 17)
				return true;
			if ((i ^ 0xffffffff) == -49 || (i ^ 0xffffffff) == -1003)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ck.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method341(int i, int i_1_) {
		try {
			Class287.anIntArray2195 = new int[i];
			Class295.anIntArray2409 = new int[i];
			if (i_1_ != -1003)
				anInt349 = 113;
			Class204.anIntArray1551 = new int[i];
			Class336.anIntArray2826 = new int[i];
			IncomingMessages.anIntArray5518 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ck.B(" + i + ',' + i_1_ + ')');
		}
	}

	public Class36() {
		/* empty */
	}
}
