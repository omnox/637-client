/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class165 {
	static int[] anIntArray1277 = new int[1];

	static final void method2523(int i, Mobile class246_sub3_sub4_sub2) {
		do {
			try {
				int i_0_ = (-Class215.anInt1614 + (class246_sub3_sub4_sub2.anInt6390));
				int i_1_ = ((class246_sub3_sub4_sub2.anInt6378) * 512 + 256 * class246_sub3_sub4_sub2.getSize());
				int i_2_ = ((class246_sub3_sub4_sub2.anInt6347) * 512 + 256 * class246_sub3_sub4_sub2.getSize());
				class246_sub3_sub4_sub2.localYPos += (-class246_sub3_sub4_sub2.localYPos + i_2_) / i_0_;
				class246_sub3_sub4_sub2.localXPos += (-class246_sub3_sub4_sub2.localXPos + i_1_) / i_0_;
				class246_sub3_sub4_sub2.anInt6433 = 0;
				if ((class246_sub3_sub4_sub2.anInt6407) == 0)
					class246_sub3_sub4_sub2.method3042(8192, i + -20481);
				if ((class246_sub3_sub4_sub2.anInt6407) == 1)
					class246_sub3_sub4_sub2.method3042(12288, -8193);
				if ((class246_sub3_sub4_sub2.anInt6407) == 2)
					class246_sub3_sub4_sub2.method3042(0, -8193);
				if ((class246_sub3_sub4_sub2.anInt6407) != 3)
					break;
				class246_sub3_sub4_sub2.method3042(4096, -8193);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kv.A(" + i + ',' + ((class246_sub3_sub4_sub2 != null) ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2524(byte i) {
		try {
			if (i > -103)
				method2524((byte) 15);
			anIntArray1277 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kv.B(" + i + ')');
		}
	}
}
