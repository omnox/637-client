/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class159 {
	static GameInterfaceData[][] gameInterfaces;
	static float aFloat1254;
	static byte[] aByteArray1255 = new byte[520];
	static int anInt1256;

	static final void method2508(int i, int i_0_, byte i_1_, ha var_ha) {
		do {
			try {
				Class98_Sub37.aHa4185 = var_ha;
				Class76.aClass28ArrayArray586 = new Class28[i][i_0_];
				if (Class50.anIntArray417 != null)
					Class246_Sub7.aClass48_5119 = Class13.method217(5, Class50.anIntArray417[3], Class50.anIntArray417[5], Class50.anIntArray417[4], Class50.anIntArray417[2], Class50.anIntArray417[0], Class50.anIntArray417[1]);
				Class91.aClass28_722 = new Class28();
				Class369.method3954(0);
				if (i_1_ == -50)
					break;
				aFloat1254 = 0.79444367F;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("km.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final GameInterfaceData method2509(int interfaceMask, int i_2_) {
		try {
			int interfaceParentID = interfaceMask >> 1456192752;
			if (i_2_ != -9820)
				gameInterfaces = null;
			int interfacePosition = interfaceMask & 0xffff;
			if (gameInterfaces[interfaceParentID] == null || gameInterfaces[interfaceParentID][interfacePosition] == null) {
				boolean bool = Class85.getInterfaceData(interfaceParentID, 85);
				if (!bool)
					return null;
			}
			return gameInterfaces[interfaceParentID][interfacePosition];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "km.A(" + interfaceMask + ',' + i_2_ + ')');
		}
	}

	public static void method2510(int i) {
		try {
			IncomingOpcode.ignoreOpcode = null;
			if (i != 4)
				method2509(21, -77);
			aByteArray1255 = null;
			gameInterfaces = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "km.C(" + i + ')');
		}
	}
}
