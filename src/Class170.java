/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class170 {
	byte aByte1308;
	short aShort1309;
	short aShort1310;
	static int[][][] anIntArrayArrayArray1311;
	byte aByte1312;
	static boolean aBoolean1313 = false;
	boolean aBoolean1314;
	int anInt1315;
	int anInt1316;
	short aShort1317;

	static final String method2538(int i, GameInterfaceData class293) {
		try {
			if (client.getClickMask(class293).method1668(i) == 0)
				return null;
			if (class293.aString2214 == null || class293.aString2214.trim().length() == 0) {
				if (Class15.aBoolean169)
					return "Hidden-use";
				return null;
			}
			return class293.aString2214;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lfa.A(" + i + ',' + (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2539(byte i) {
		try {
			if (i != 13)
				aBoolean1313 = true;
			anIntArrayArrayArray1311 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lfa.B(" + i + ')');
		}
	}

	Class170(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
		try {
			this.aByte1312 = (byte) i_7_;
			this.aShort1317 = (short) i_3_;
			this.aShort1310 = (short) i_5_;
			this.aByte1308 = (byte) i_6_;
			this.anInt1316 = i_8_;
			this.aShort1309 = (short) i_4_;
			this.anInt1315 = i;
			this.aBoolean1314 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lfa.<init>(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + i_8_ + ')'));
		}
	}
}
