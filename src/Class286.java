/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class286 {
	int anInt2180;
	int anInt2181;
	static float aFloat2182;
	int anInt2183;
	int anInt2184;

	static final void method3380(int i, int i_0_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_0_, i + -72, i);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rp.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method3381(int i, int i_1_, int i_2_, int i_3_, Mobile class246_sub3_sub4_sub2, int i_4_, Mobile class246_sub3_sub4_sub2_5_, int i_6_, int i_7_, int i_8_) {
		try {
			int i_9_ = class246_sub3_sub4_sub2_5_.method3035(28213);
			if (i_9_ != -1) {
				Object object = null;
				Class332 class332 = ((Class332) Class378.aClass79_3189.get(i_9_));
				if (class332 == null) {
					Class324[] class324s = Class324.method3680(Class332_Sub2.aClass207_5423, i_9_, 0);
					if (class324s == null)
						return;
					class332 = Class265.aHa1974.method1758(class324s[0], true);
					Class378.aClass79_3189.put(i_9_, class332);
				}
				Class168.method2533(i_7_ >> 1, class246_sub3_sub4_sub2.localXPos, i_8_ >> 1, 256 * class246_sub3_sub4_sub2.getSize(), (byte) 94, class246_sub3_sub4_sub2.localYPos, i, class246_sub3_sub4_sub2.height_level, i_2_, 0);
				int i_10_ = i_1_ - -Class259.anIntArray1957[0] + -18;
				int i_11_ = -70 + (Class259.anIntArray1957[1] + i_4_);
				i_10_ += i_6_ / 4 * 18;
				i_11_ += 18 * (i_6_ % 4);
				class332.method3735(i_10_, i_11_);
				if (class246_sub3_sub4_sub2_5_ == class246_sub3_sub4_sub2)
					Class265.aHa1974.method1781(true, 18, 18, -256, i_10_ - 1, -1 + i_11_);
				Class93_Sub1_Sub1.method908(i_11_ + 18, -1 + i_11_, false, i_10_ - 1, 18 + i_10_);
				Class246_Sub2 class246_sub2 = Class90.method883(-90);
				if (i_3_ > 15) {
					class246_sub2.anInt5071 = i_11_;
					class246_sub2.aClass246_Sub3_Sub4_Sub2_5076 = class246_sub3_sub4_sub2_5_;
					class246_sub2.anInt5075 = i_11_ - -16;
					class246_sub2.anInt5073 = 16 + i_10_;
					class246_sub2.anInt5074 = i_10_;
					Class151_Sub2.aClass218_4973.method2808(true, class246_sub2);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rp.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (class246_sub3_sub4_sub2 != null ? "{...}" : "null") + ',' + i_4_ + ',' + ((class246_sub3_sub4_sub2_5_ != null) ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method3382(int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		if (Class40.anIntArrayArray367 != null)
			Class40.anIntArrayArray367[i][i_12_] = ~0xffffff | i_13_;
		if (Class304.aShortArrayArray2534 != null)
			Class304.aShortArrayArray2534[i][i_12_] = (short) i_14_;
		if (Class299_Sub2.aByteArrayArray5291 != null)
			Class299_Sub2.aByteArrayArray5291[i][i_12_] = (byte) i_15_;
	}

	static final int method3383(Player class246_sub3_sub4_sub2_sub2, boolean bool) {
		try {
			if (bool != true)
				return -121;
			int i = (class246_sub3_sub4_sub2_sub2.anInt6522);
			RenderAnimDefinitions class294 = class246_sub3_sub4_sub2_sub2.getRenderAnimation(1);
			if ((class246_sub3_sub4_sub2_sub2.anInt6385) == -1 || (class246_sub3_sub4_sub2_sub2.aBoolean6359))
				i = class246_sub3_sub4_sub2_sub2.anInt6527;
			else if ((class294.anInt2389 != class246_sub3_sub4_sub2_sub2.anInt6385) && (class246_sub3_sub4_sub2_sub2.anInt6385 != class294.anInt2361) && (class294.anInt2402 != class246_sub3_sub4_sub2_sub2.anInt6385) && (class294.anInt2357 != class246_sub3_sub4_sub2_sub2.anInt6385)) {
				if ((class294.anInt2368 == (class246_sub3_sub4_sub2_sub2.anInt6385)) || (class246_sub3_sub4_sub2_sub2.anInt6385 == class294.anInt2394) || (class246_sub3_sub4_sub2_sub2.anInt6385 == class294.anInt2403) || (class294.anInt2377 == class246_sub3_sub4_sub2_sub2.anInt6385))
					i = class246_sub3_sub4_sub2_sub2.anInt6524;
			} else
				i = class246_sub3_sub4_sub2_sub2.anInt6517;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rp.B(" + ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	public Class286() {
		/* empty */
	}
}
