/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166 {
	static boolean aBoolean1278 = false;
	static int anInt1279;
	static RuneScapeCache aClass207_1280;

	public Class166() {
		/* empty */
	}

	static final void method2525(int i) {
		try {
			Class259.anInt1954 = 0;
			Class201.anInt1544++;
			Class65.anInt502 = 0;
			Class98_Sub39.method1468(-4942);
			Class341.method3810((byte) 121);
			Class21_Sub2.method273((byte) -61);
			boolean bool = false;
			for (int i_0_ = 0; i_0_ < Class259.anInt1954; i_0_++) {
				int i_1_ = Class246_Sub3_Sub4_Sub3.anIntArray6451[i_0_];
				Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_1_, -1));
				Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				if (Player.aBoolean6540 && Class98_Sub44.method1514(-128, i_1_))
					Class317.method3651((byte) -53);
				if (class246_sub3_sub4_sub2_sub1.anInt6406 != Class201.anInt1544) {
					if (class246_sub3_sub4_sub2_sub1.aClass141_6504.method2302((byte) 117))
						Class98_Sub43_Sub4.method1504(class246_sub3_sub4_sub2_sub1, -16255);
					class246_sub3_sub4_sub2_sub1.method3054(null, 1);
					class98_sub39.remove();
					bool = true;
				}
			}
			if (bool) {
				Class98_Sub10_Sub20.anInt5640 = Class260.aClass377_3254.method3999((byte) -6);
				Class260.aClass377_3254.method3992(Class163.aClass98_Sub39Array3516, (byte) 74);
			}
			if ((IncomingMessages.packetStream.position) != Class65.anInt496)
				throw new RuntimeException("gnp1 pos:" + (IncomingMessages.packetStream.position) + " psize:" + Class65.anInt496);
			for (int i_2_ = 0; i_2_ < Class150.anInt1211; i_2_++) {
				if (Class260.aClass377_3254.method3990(Class325.anIntArray2726[i_2_], -1) == null)
					throw new RuntimeException("gnp2 pos:" + i_2_ + " size:" + Class150.anInt1211);
			}
			if (-Class150.anInt1211 + Class98_Sub10_Sub20.anInt5640 != i)
				throw new RuntimeException("gnp3 mis:" + (Class98_Sub10_Sub20.anInt5640 + -Class150.anInt1211));
			for (int i_3_ = 0; i_3_ < Class98_Sub10_Sub20.anInt5640; i_3_++) {
				if (Class163.aClass98_Sub39Array3516[i_3_].aClass246_Sub3_Sub4_Sub2_Sub1_4187.anInt6406 != Class201.anInt1544)
					throw new RuntimeException("gnp4 uk:" + (Class163.aClass98_Sub39Array3516[i_3_].aClass246_Sub3_Sub4_Sub2_Sub1_4187.anInt6369));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method2526(int i) {
		do {
			try {
				aClass207_1280 = null;
				if (i == -19351)
					break;
				method2526(-23);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "l.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
