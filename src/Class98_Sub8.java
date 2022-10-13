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
			return this.aLong3267;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.B(" + i + ')');
		}
	}

	public final int method17(boolean bool) {
		try {
			if (bool != true)
				this.aLong3267 = 43L;
			return this.anInt3269;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.E(" + bool + ')');
		}
	}

	static final void method986(int i, int i_0_, GameInterfaceData class293, int i_1_) {
		do {
			try {
				if (class293.aByte2245 == 0)
					class293.anInt2299 = class293.anInt2229;
				else if (class293.aByte2245 == 1)
					class293.anInt2299 = (class293.anInt2229 + (-class293.anInt2258 + i_0_) / 2);
				else if (class293.aByte2245 != 2) {
					if (class293.aByte2245 != 3) {
						if (class293.aByte2245 != 4)
							class293.anInt2299 = (-(class293.anInt2229 * i_0_ >> 14) + (-class293.anInt2258 + i_0_));
						else
							class293.anInt2299 = ((i_0_ * class293.anInt2229 >> 14) + ((i_0_ - class293.anInt2258) / 2));
					} else
						class293.anInt2299 = (i_0_ * class293.anInt2229 >> 14);
				} else
					class293.anInt2299 = (i_0_ - class293.anInt2258 + -class293.anInt2229);
				if (class293.aByte2240 == 0)
					class293.anInt2347 = class293.anInt2283;
				else if (class293.aByte2240 == 1)
					class293.anInt2347 = (class293.anInt2283 + (i - class293.anInt2311) / 2);
				else if (class293.aByte2240 != 2) {
					if (class293.aByte2240 != 3) {
						if (class293.aByte2240 == 4)
							class293.anInt2347 = ((-class293.anInt2311 + i) / 2 + (i * class293.anInt2283 >> 14));
						else
							class293.anInt2347 = i + (-class293.anInt2311 + -(i * class293.anInt2283 >> 14));
					} else
						class293.anInt2347 = (class293.anInt2283 * i >> 14);
				} else
					class293.anInt2347 = (i - class293.anInt2311 - class293.anInt2283);
				if (i_1_ > 105) {
					if (!Class15.aBoolean169)
						break;
					if (client.getClickMask(class293).optionMask != 0 || class293.type == 0) {
						if (class293.anInt2299 < 0)
							class293.anInt2299 = 0;
						else if (i_0_ < (class293.anInt2299 + class293.anInt2258))
							class293.anInt2299 = -class293.anInt2258 + i_0_;
						if (class293.anInt2347 < 0)
							class293.anInt2347 = 0;
						else {
							if (i >= (class293.anInt2347 + class293.anInt2311))
								break;
							class293.anInt2347 = -class293.anInt2311 + i;
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
			return this.anInt3268;
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
			return this.anInt3266;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.C(" + i + ')');
		}
	}

	public final char method15(int i) {
		try {
			if (i != 13313)
				return '4';
			return this.aChar3265;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.D(" + i + ')');
		}
	}
}
