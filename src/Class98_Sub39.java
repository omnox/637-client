/* Class98_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub39 extends Node {
	Class246_Sub3_Sub4_Sub2_Sub1 aClass246_Sub3_Sub4_Sub2_Sub1_4187;
	static double aDouble4188;
	static float[] aFloatArray4189 = new float[4];

	public static void method1467(boolean bool) {
		do {
			try {
				aFloatArray4189 = null;
				if (bool == true)
					break;
				aDouble4188 = 0.4390183000949001;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "pw.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method1468(int i) {
		try {
			IncomingMessages.packetStream.method1256(0);
			int i_0_ = IncomingMessages.packetStream.readBits((byte) -104, 8);
			if (i_0_ < Class150.anInt1211) {
				for (int i_1_ = i_0_; i_1_ < Class150.anInt1211; i_1_++)
					Class246_Sub3_Sub4_Sub3.anIntArray6451[Class259.anInt1954++] = Class325.anIntArray2726[i_1_];
			}
			if (Class150.anInt1211 < i_0_)
				throw new RuntimeException("gnpov1");
			Class150.anInt1211 = 0;
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				int i_3_ = Class325.anIntArray2726[i_2_];
				Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) Class260.aClass377_3254.method3990(i_3_, -1)).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				int i_4_ = IncomingMessages.packetStream.readBits((byte) -74, 1);
				if (i_4_ == 0) {
					Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
					class246_sub3_sub4_sub2_sub1.anInt6406 = Class201.anInt1544;
				} else {
					int i_5_ = IncomingMessages.packetStream.readBits((byte) -117, 2);
					if (i_5_ == 0) {
						Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
						class246_sub3_sub4_sub2_sub1.anInt6406 = Class201.anInt1544;
						Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_3_;
					} else if (i_5_ == 1) {
						Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
						class246_sub3_sub4_sub2_sub1.anInt6406 = Class201.anInt1544;
						int i_6_ = IncomingMessages.packetStream.readBits((byte) -16, 3);
						class246_sub3_sub4_sub2_sub1.method3050(0, 1, i_6_);
						int i_7_ = IncomingMessages.packetStream.readBits((byte) -107, 1);
						if (i_7_ == 1)
							Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_3_;
					} else if (i_5_ == 2) {
						Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
						class246_sub3_sub4_sub2_sub1.anInt6406 = Class201.anInt1544;
						if (IncomingMessages.packetStream.readBits((byte) -42, 1) != 1) {
							int i_8_ = IncomingMessages.packetStream.readBits((byte) -36, 3);
							class246_sub3_sub4_sub2_sub1.method3050(0, 0, i_8_);
						} else {
							int i_9_ = IncomingMessages.packetStream.readBits((byte) -58, 3);
							class246_sub3_sub4_sub2_sub1.method3050(i ^ ~0x134d, 2, i_9_);
							int i_10_ = IncomingMessages.packetStream.readBits((byte) -45, 3);
							class246_sub3_sub4_sub2_sub1.method3050(0, 2, i_10_);
						}
						int i_11_ = IncomingMessages.packetStream.readBits((byte) -65, 1);
						if (i_11_ == 1)
							Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_3_;
					} else if (i_5_ == 3) {
						Class246_Sub3_Sub4_Sub3.anIntArray6451[Class259.anInt1954++] = i_3_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pw.A(" + i + ')');
		}
	}

	Class98_Sub39(Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1) {
		try {
			this.aClass246_Sub3_Sub4_Sub2_Sub1_4187 = class246_sub3_sub4_sub2_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pw.<init>(" + ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}" : "null") + ')'));
		}
	}
}
