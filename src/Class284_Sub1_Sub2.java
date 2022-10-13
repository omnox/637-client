/* Class284_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284_Sub1_Sub2 extends Class284_Sub1 {
	static OutgoingOpcode aClass171_6191;
	static int anInt6192;
	static int[] anIntArray6193 = new int[4];
	private byte[] aByteArray6194;

	public Class284_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	public static void method3369(byte i) {
		try {
			anIntArray6193 = null;
			if (i >= -28)
				method3371(-40);
			aClass171_6191 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tb.K(" + i + ')');
		}
	}

	static final void method3370(int i, int i_0_, Mobile class246_sub3_sub4_sub2, int i_1_, int i_2_) {
		try {
			RenderAnimDefinitions class294 = class246_sub3_sub4_sub2.getRenderAnimation(1);
			if (i_0_ != 6144)
				anIntArray6193 = null;
			int i_3_ = (((class246_sub3_sub4_sub2.anInt6415) - class246_sub3_sub4_sub2.aClass325_6399.anInt2730) & 0x3fff);
			if (i_1_ == -1) {
				if (i_3_ == 0 && (class246_sub3_sub4_sub2.anInt6408) <= 25) {
					if (!(class246_sub3_sub4_sub2.aBoolean6359) || !class294.method3480((byte) -53, (class246_sub3_sub4_sub2.anInt6385))) {
						class246_sub3_sub4_sub2.anInt6385 = class294.method3478(i_0_ ^ 0x1820);
						class246_sub3_sub4_sub2.aBoolean6359 = class246_sub3_sub4_sub2.anInt6385 != -1;
					}
				} else {
					if (i_2_ >= 0 || class294.anInt2376 == -1) {
						if (i_2_ <= 0 || class294.anInt2388 == -1)
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
						else
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2388;
					} else {
						class246_sub3_sub4_sub2.aBoolean6359 = false;
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2376;
					}
					class246_sub3_sub4_sub2.aBoolean6359 = false;
				}
			} else if ((class246_sub3_sub4_sub2.anInt6364) == -1 || i_3_ < 10240 && i_3_ > 2048) {
				if (i_3_ != 0 || (class246_sub3_sub4_sub2.anInt6408) > 25) {
					if (i_1_ != 2 || class294.anInt2389 == -1) {
						if (i_1_ == 0 && class294.anInt2368 != -1) {
							if (i_2_ < 0 && class294.anInt2405 != -1)
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2405;
							else if (i_2_ <= 0 || class294.anInt2404 == -1)
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2368;
							else
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2404;
						} else if (i_2_ >= 0 || class294.anInt2378 == -1) {
							if (i_2_ > 0 && class294.anInt2369 != -1)
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2369;
							else
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
						} else
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2378;
					} else if (i_2_ < 0 && class294.anInt2384 != -1)
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2384;
					else if (i_2_ <= 0 || class294.anInt2370 == -1)
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2389;
					else
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2370;
					class246_sub3_sub4_sub2.aBoolean6359 = false;
				} else {
					if (i_1_ == 2 && class294.anInt2389 != -1)
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2389;
					else if (i_1_ == 0 && class294.anInt2368 != -1)
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2368;
					else
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
					class246_sub3_sub4_sub2.aBoolean6359 = false;
				}
			} else {
				int i_4_ = 0x3fff & (-class246_sub3_sub4_sub2.aClass325_6399.anInt2730 + Class98_Sub43_Sub1.anIntArray5896[i]);
				if (i_1_ == 2 && class294.anInt2389 != -1) {
					if (i_4_ > 2048 && i_4_ <= 6144 && class294.anInt2402 != -1)
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2402;
					else if (i_4_ < 10240 || i_4_ >= 14336 || class294.anInt2357 == -1) {
						if (i_4_ > 6144 && i_4_ < 10240 && (class294.anInt2361 != -1))
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2361;
						else
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2389;
					} else
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2357;
				} else if (i_1_ == 0 && (class294.anInt2368 != -1)) {
					if (i_4_ > 2048 && i_4_ <= 6144 && class294.anInt2403 != -1)
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2403;
					else if (i_4_ < 10240 || i_4_ >= 14336 || (class294.anInt2377 == -1)) {
						if (i_4_ > 6144 && i_4_ < 10240 && (class294.anInt2394 != -1))
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2394;
						else
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2368;
					} else
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2377;
				} else if (i_4_ > 2048 && i_4_ <= 6144 && (class294.anInt2372 != -1))
					class246_sub3_sub4_sub2.anInt6385 = class294.anInt2372;
				else if (i_4_ < 10240 || i_4_ >= 14336 || (class294.anInt2359 == -1)) {
					if (i_4_ <= 6144 || i_4_ >= 10240 || class294.anInt2365 == -1)
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
					else
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2365;
				} else
					class246_sub3_sub4_sub2.anInt6385 = class294.anInt2359;
				class246_sub3_sub4_sub2.aBoolean6359 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tb.L(" + i + ',' + i_0_ + ',' + (class246_sub3_sub4_sub2 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3371(int i) {
		do {
			try {
				Class64_Sub22.method644(-67);
				if (i == 31398)
					break;
				aClass171_6191 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tb.N(" + i + ')');
			}
			break;
		} while (false);
	}

	final byte[] method3372(boolean bool, int i, int i_5_, int i_6_) {
		try {
			aByteArray6194 = new byte[2 * (i_5_ * i * i_6_)];
			if (bool != true)
				method3363((byte) 104, -114, (byte) 118);
			this.method3361((byte) -45, i_6_, i, i_5_);
			return aByteArray6194;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tb.J(" + bool + ',' + i + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method3363(byte i, int i_7_, byte i_8_) {
		do {
			try {
				i = (byte) (((i & 0xff) >> 1) + 127);
				int i_9_ = i_7_ * 2;
				aByteArray6194[i_9_++] = i;
				aByteArray6194[i_9_] = i;
				if (i_8_ == 42)
					break;
				aClass171_6191 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tb.M(" + i + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3373(int i, int i_10_, byte i_11_) {
		try {
			if (i_11_ <= 10)
				method3370(36, -41, null, 23, 85);
			if ((i_10_ & 0xc580) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tb.O(" + i + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static {
		aClass171_6191 = new OutgoingOpcode(37, -1);
	}
}
