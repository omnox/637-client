/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108 {
	static final void method1729(int i, Mobile class246_sub3_sub4_sub2) {
		do {
			try {
				if (i < -89 && ((((Mobile) class246_sub3_sub4_sub2).anIntArray6383) != null || (((Mobile) class246_sub3_sub4_sub2).anIntArray6370) != null)) {
					boolean bool = true;
					for (int i_0_ = 0; ((((Mobile) class246_sub3_sub4_sub2).anIntArray6383).length > i_0_); i_0_++) {
						int i_1_ = -1;
						if (((Mobile) class246_sub3_sub4_sub2).anIntArray6383 != null)
							i_1_ = (((Mobile) class246_sub3_sub4_sub2).anIntArray6383[i_0_]);
						if (i_1_ == -1) {
							if (!class246_sub3_sub4_sub2.method3043(12, i_0_, -1))
								bool = false;
						} else {
							bool = false;
							boolean bool_2_ = false;
							boolean bool_3_ = false;
							int i_4_;
							int i_5_;
							if ((i_1_ & ~0x3fffffff ^ 0xffffffff) == 1073741823) {
								int i_6_ = 0xfffffff & i_1_;
								int i_7_ = i_6_ >> 9673934;
								i_5_ = (((AnimableEntity) class246_sub3_sub4_sub2).localXPos + -256 + -((i_7_ + -Class272.anInt2038) * 512));
								int i_8_ = 0x3fff & i_6_;
								i_4_ = -256 - ((-aa_Sub2.anInt3562 + i_8_) * 512 - (((AnimableEntity) class246_sub3_sub4_sub2).localYPos));
							} else if ((0x8000 & i_1_ ^ 0xffffffff) != -1) {
								int i_9_ = 0x7fff & i_1_;
								Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_9_]);
								if (class246_sub3_sub4_sub2_sub2 != null) {
									i_4_ = (((AnimableEntity) class246_sub3_sub4_sub2).localYPos - (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localYPos));
									i_5_ = (-(((AnimableEntity) class246_sub3_sub4_sub2_sub2).localXPos) + (((AnimableEntity) class246_sub3_sub4_sub2).localXPos));
								} else {
									class246_sub3_sub4_sub2.method3043(12, i_0_, -1);
									continue;
								}
							} else {
								Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990((long) i_1_, -1));
								if (class98_sub39 != null) {
									Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
									i_4_ = (((AnimableEntity) class246_sub3_sub4_sub2).localYPos + -(((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos));
									i_5_ = (((AnimableEntity) class246_sub3_sub4_sub2).localXPos + -(((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos));
								} else {
									class246_sub3_sub4_sub2.method3043(12, i_0_, -1);
									continue;
								}
							}
							if ((i_5_ ^ 0xffffffff) != -1 || (i_4_ ^ 0xffffffff) != -1)
								class246_sub3_sub4_sub2.method3043(12, i_0_, (0x3fff & (int) (2607.5945876176133 * Math.atan2((double) i_5_, (double) i_4_))));//mystic
						}
					}
					if (!bool)
						break;
					((Mobile) class246_sub3_sub4_sub2).anIntArray6370 = null;
					((Mobile) class246_sub3_sub4_sub2).anIntArray6383 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gs.B(" + i + ',' + ((class246_sub3_sub4_sub2 != null) ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final String method1730(int i, int i_10_, int i_11_) {
		try {
			if (i_11_ != 16383)
				return null;
			int i_12_ = -i_10_ + i;
			if (i_12_ < -9)
				return "<col=ff0000>";
			if ((i_12_ ^ 0xffffffff) > 5)
				return "<col=ff3000>";
			if (i_12_ < -3)
				return "<col=ff7000>";
			if ((i_12_ ^ 0xffffffff) > -1)
				return "<col=ffb000>";
			if (i_12_ > 9)
				return "<col=00ff00>";
			if ((i_12_ ^ 0xffffffff) < -7)
				return "<col=40ff00>";
			if ((i_12_ ^ 0xffffffff) < -4)
				return "<col=80ff00>";
			if ((i_12_ ^ 0xffffffff) < -1)
				return "<col=c0ff00>";
			return "<col=ffff00>";
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gs.C(" + i + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final void method1731(int i, Class98_Sub22_Sub1 class98_sub22_sub1, int i_13_) {//steven
		try {
			Class64_Sub24.aBoolean3710 = false;
			Class38.anInt354 = i_13_;
			PlayerUpdate.method2858(class98_sub22_sub1, i_13_ ^ 0xffffffff);
			Class147.method2413(class98_sub22_sub1, 8429);
			if (Class64_Sub24.aBoolean3710)
				System.out.println("---endgpp---");
			if (i != ((RSByteBuffer) class98_sub22_sub1).position)
				throw new RuntimeException("gpi1 pos:" + ((RSByteBuffer) class98_sub22_sub1).position + " psize:" + i);
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
		}
	}
}
