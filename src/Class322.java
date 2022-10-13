/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class322 {
	Interface8 anInterface8_2711;
	static float aFloat2712;
	static RuneScapeCache aClass207_2714;

	public static void method3669(int i) {
		do {
			try {
				aClass207_2714 = null;
				IncomingOpcode.sendInterfaceOpcode = null;
				aFloat2712 = -1.0144556F;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tr.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final String method3670(RSByteBuffer class98_sub22, byte i) {
		try {
			return Class98_Sub10_Sub26.method1084(false, class98_sub22, 32767);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tr.C(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3671(int i, int i_0_, int i_1_, Class246_Sub3_Sub1 class246_sub3_sub1) {
		Class172 class172 = Class100.method1693(i, i_0_, i_1_);
		if (class172 != null) {
			class172.aClass246_Sub3_Sub1_1332 = class246_sub3_sub1;
			int i_2_ = Class78.activeTileHeightMap == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub1.method2978(-127)) {
				if (class246_sub3_sub1.method2987(6540)) {
					class246_sub3_sub1.aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_2_];
					Class359.aClass246_Sub3Array3056[i_2_] = class246_sub3_sub1;
				} else {
					class246_sub3_sub1.aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_2_];
					Class379.aClass246_Sub3Array3198[i_2_] = class246_sub3_sub1;
					Class358.aBoolean3033 = true;
				}
			} else {
				class246_sub3_sub1.aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_2_];
				Class130.aClass246_Sub3Array1029[i_2_] = class246_sub3_sub1;
			}
		}
	}

	static final boolean method3672(int i, int i_3_, int i_4_) {
		try {
			if (i_4_ != 2048)
				return true;
			if ((0x800 & i_3_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tr.D(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method3673(int i, int i_5_, int i_6_, boolean bool) {
		try {
			Class281.tileSettings = new byte[i_6_][i_5_][i];
			if (bool != true)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tr.E(" + i + ',' + i_5_ + ',' + i_6_ + ',' + bool + ')'));
		}
	}

	static final void method3674(int i, Player class246_sub3_sub4_sub2_sub2) {
		try {
			Class98_Sub42 class98_sub42 = ((Class98_Sub42) (Class98_Sub10_Sub14.aClass377_5612.method3990(class246_sub3_sub4_sub2_sub2.anInt6369, -1)));
			if (class98_sub42 == null)
				Class98_Sub31_Sub4.method1383(class246_sub3_sub4_sub2_sub2, null, (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), 0, i + 3, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), class246_sub3_sub4_sub2_sub2.height_level, null);
			else
				class98_sub42.method1478(true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tr.A(" + i + ',' + ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}" : "null") + ')'));
		}
	}
}
