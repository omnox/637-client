/* Class98_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub8 extends Node implements Interface7 {
	static OutgoingOpcode aClass171_3264 = new OutgoingOpcode(74, -1);
	char aChar3265;
	int anInt3266;
	long aLong3267;
	int anInt3268;
	int anInt3269;

	public final long method18(int i) {
		try {
			if (i >= -20)
				method987(53);
			return ((Class98_Sub8) this).aLong3267;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.B(" + i + ')');
		}
	}

	public final int method17(boolean bool) {
		try {
			if (bool != true)
				((Class98_Sub8) this).aLong3267 = 43L;
			return ((Class98_Sub8) this).anInt3269;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.E(" + bool + ')');
		}
	}

	static final void method986(int i, int i_0_, GameInterfaceData class293, int i_1_) {
		do {
			try {
				if ((((GameInterfaceData) class293).aByte2245 ^ 0xffffffff) == -1)
					((GameInterfaceData) class293).anInt2299 = ((GameInterfaceData) class293).anInt2229;
				else if ((((GameInterfaceData) class293).aByte2245 ^ 0xffffffff) == -2)
					((GameInterfaceData) class293).anInt2299 = (((GameInterfaceData) class293).anInt2229 + (-((GameInterfaceData) class293).anInt2258 + i_0_) / 2);
				else if (((GameInterfaceData) class293).aByte2245 != 2) {
					if ((((GameInterfaceData) class293).aByte2245 ^ 0xffffffff) != -4) {
						if ((((GameInterfaceData) class293).aByte2245 ^ 0xffffffff) != -5)
							((GameInterfaceData) class293).anInt2299 = (-(((GameInterfaceData) class293).anInt2229 * i_0_ >> -1245136754) + (-((GameInterfaceData) class293).anInt2258 + i_0_));
						else
							((GameInterfaceData) class293).anInt2299 = ((i_0_ * ((GameInterfaceData) class293).anInt2229 >> 925133390) + ((i_0_ - ((GameInterfaceData) class293).anInt2258) / 2));
					} else
						((GameInterfaceData) class293).anInt2299 = (i_0_ * ((GameInterfaceData) class293).anInt2229 >> -1820578994);
				} else
					((GameInterfaceData) class293).anInt2299 = (i_0_ - ((GameInterfaceData) class293).anInt2258 + -((GameInterfaceData) class293).anInt2229);
				if ((((GameInterfaceData) class293).aByte2240 ^ 0xffffffff) == -1)
					((GameInterfaceData) class293).anInt2347 = ((GameInterfaceData) class293).anInt2283;
				else if (((GameInterfaceData) class293).aByte2240 == 1)
					((GameInterfaceData) class293).anInt2347 = (((GameInterfaceData) class293).anInt2283 + (i - ((GameInterfaceData) class293).anInt2311) / 2);
				else if (((GameInterfaceData) class293).aByte2240 != 2) {
					if (((GameInterfaceData) class293).aByte2240 != 3) {
						if ((((GameInterfaceData) class293).aByte2240 ^ 0xffffffff) == -5)
							((GameInterfaceData) class293).anInt2347 = ((-((GameInterfaceData) class293).anInt2311 + i) / 2 + (i * ((GameInterfaceData) class293).anInt2283 >> 853340622));
						else
							((GameInterfaceData) class293).anInt2347 = i + (-((GameInterfaceData) class293).anInt2311 + -(i * ((GameInterfaceData) class293).anInt2283 >> -1549429234));
					} else
						((GameInterfaceData) class293).anInt2347 = (((GameInterfaceData) class293).anInt2283 * i >> 1647618894);
				} else
					((GameInterfaceData) class293).anInt2347 = (i - ((GameInterfaceData) class293).anInt2311 - ((GameInterfaceData) class293).anInt2283);
				if (i_1_ > 105) {
					if (!Class15.aBoolean169)
						break;
					if ((((IComponentSettings) client.getClickMask(class293)).optionMask ^ 0xffffffff) != -1 || ((GameInterfaceData) class293).type == 0) {
						if ((((GameInterfaceData) class293).anInt2299 ^ 0xffffffff) > -1)
							((GameInterfaceData) class293).anInt2299 = 0;
						else if (i_0_ < (((GameInterfaceData) class293).anInt2299 + ((GameInterfaceData) class293).anInt2258))
							((GameInterfaceData) class293).anInt2299 = -((GameInterfaceData) class293).anInt2258 + i_0_;
						if (((GameInterfaceData) class293).anInt2347 < 0)
							((GameInterfaceData) class293).anInt2347 = 0;
						else {
							if (i >= (((GameInterfaceData) class293).anInt2347 + ((GameInterfaceData) class293).anInt2311))
								break;
							((GameInterfaceData) class293).anInt2347 = -((GameInterfaceData) class293).anInt2311 + i;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("cja.F(" + i + ',' + i_0_ + ',' + (class293 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	public final int method14(int i) {
		try {
			int i_2_ = -77 % ((i - 40) / 50);
			return ((Class98_Sub8) this).anInt3268;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.A(" + i + ')');
		}
	}

	public static void method987(int i) {
		do {
			try {
				aClass171_3264 = null;
				if (i >= 103)
					break;
				method986(38, -44, null, 87);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cja.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public final int method16(byte i) {
		try {
			if (i != 82)
				return -4;
			return ((Class98_Sub8) this).anInt3266;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.C(" + i + ')');
		}
	}

	public final char method15(int i) {
		try {
			if (i != 13313)
				return '4';
			return ((Class98_Sub8) this).aChar3265;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.D(" + i + ')');
		}
	}
}
