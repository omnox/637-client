/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class23 {
	static boolean aBoolean220 = false;
	static int anInt221 = 0;
	static int[] anIntArray222 = new int[1];

	public static void method281(byte i) {
		try {
			anIntArray222 = null;
			int i_0_ = 79 % ((i - -87) / 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bm.A(" + i + ')');
		}
	}

	static final int method282(int i, int i_1_) {
		try {
			int i_2_ = i_1_ >>> 1;
			i_2_ |= i_2_ >>> 1;
			i_2_ |= i_2_ >>> 2;
			i_2_ |= i_2_ >>> 4;
			i_2_ |= i_2_ >>> 8;
			i_2_ |= i_2_ >>> 16;
			int i_3_ = 44 / ((-35 - i) / 61);
			return (~i_2_) & i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bm.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method283(byte i) {
		try {
			int i_4_ = 20 / ((47 - i) / 50);
			Class356 class356 = null;
			try {
				class356 = Class88.method865(-106, "2");
				RSByteBuffer class98_sub22 = new RSByteBuffer(6 * Class64_Sub21.anInt3700 + 3);
				class98_sub22.writeByte(1);
				class98_sub22.writeShort(Class64_Sub21.anInt3700);
				for (int i_5_ = 0; Class76_Sub5.anIntArray3744.length > i_5_; i_5_++) {
					if (VarpClass.aBooleanArray3246[i_5_]) {
						class98_sub22.writeShort(i_5_);
						class98_sub22.writeInt(1571862888, (Class76_Sub5.anIntArray3744[i_5_]));
					}
				}
				class356.method3882((class98_sub22.data), 4657, 0, class98_sub22.position);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (class356 != null)
					class356.method3880(true);
			} catch (Exception exception) {
				/* empty */
			}
			r_Sub1.aLong6322 = Class343.method3819(-47);
			Class66.aBoolean507 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bm.B(" + i + ')');
		}
	}
}
