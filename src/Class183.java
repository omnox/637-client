/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class183 {
	private RuneScapeCache aClass207_1441;
	private Class79 aClass79_1442 = new Class79(64);
	private Class79 aClass79_1443 = new Class79(100);

	final void method2618(boolean bool) {
		try {
			synchronized (aClass79_1442) {
				aClass79_1442.method794(109);
			}
			synchronized (aClass79_1443) {
				if (bool != true)
					method2624(-55, 58);
				aClass79_1443.method794(86);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.B(" + bool + ')');
		}
	}

	final void method2619(int i) {
		try {
			synchronized (aClass79_1442) {
				aClass79_1442.method806((byte) 18);
			}
			synchronized (aClass79_1443) {
				aClass79_1443.method806((byte) 109);
				if (i != -2118)
					aClass79_1443 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.G(" + i + ')');
		}
	}

	static final void method2620(int i) {
		try {
			if (Class368.anInt3128 != -1 && Class53_Sub1.anInt3636 != -1) {
				int i_0_ = (Class246.anInt1872 + (Class54.anInt3394 * (-Class246.anInt1872 + Class98_Sub10_Sub32.anInt5718) >> 16));
				Class54.anInt3394 += i_0_;
				if (Class54.anInt3394 >= 65535) {
					if (!Class319.aBoolean2700)
						Class187.aBoolean1451 = true;
					else
						Class187.aBoolean1451 = false;
					Class54.anInt3394 = 65535;
					Class319.aBoolean2700 = true;
				} else {
					Class187.aBoolean1451 = false;
					Class319.aBoolean2700 = false;
				}
				float f = (float) Class54.anInt3394 / 65535.0F;
				float[] fs = new float[3];
				int i_1_ = 2 * Class50.anInt418;
				for (int i_2_ = 0; i_2_ < 3; i_2_++) {
					int i_3_ = 3 * (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][i_2_]);
					int i_4_ = 3 * (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ + 1][i_2_]);
					int i_5_ = 3 * ((InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ + 2][i_2_]) - (-(InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ - -2][i_2_]) + (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ - -3][i_2_])));
					int i_6_ = (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][i_2_]);
					int i_7_ = i_4_ + -i_3_;
					int i_8_ = i_5_ + (i_3_ - 2 * i_4_);
					int i_9_ = (i_4_ + -i_6_ + ((InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ + 2][i_2_]) - i_5_));
					fs[i_2_] = (((float) i_7_ + f * ((float) i_8_ + f * (float) i_9_)) * f + (float) i_6_);
				}
				Class79.renderY = -1 * (int) fs[1];
				Class134.renderZ = (int) fs[2] - 512 * aa_Sub2.anInt3562;
				Class98_Sub46_Sub10.renderX = -(Class272.anInt2038 * 512) + (int) fs[0];
				float[] fs_10_ = new float[3];
				int i_11_ = 2 * ha.anInt943;
				for (int i_12_ = 0; i_12_ < 3; i_12_++) {
					int i_13_ = ((InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_][i_12_]) * 3);
					int i_14_ = 3 * (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_ + 1][i_12_]);
					int i_15_ = 3 * ((InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_ + 2][i_12_]) - ((InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_ - -3][i_12_]) + -(InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_ + 2][i_12_])));
					int i_16_ = (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_][i_12_]);
					int i_17_ = i_14_ - i_13_;
					int i_18_ = i_15_ + (-(i_14_ * 2) + i_13_);
					int i_19_ = (-i_15_ + (i_14_ + (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][2 + i_11_][i_12_]) + -i_16_));
					fs_10_[i_12_] = ((float) i_16_ + ((float) i_17_ + (f * (float) i_19_ + (float) i_18_) * f) * f);
				}
				float f_20_ = fs_10_[0] - fs[i];
				float f_21_ = (-fs[1] + fs_10_[1]) * -1.0F;
				float f_22_ = fs_10_[2] - fs[2];
				double d = Math.sqrt(f_22_ * f_22_ + f_20_ * f_20_);
				GameWorld.cameraPitch = (int) (2607.5945876176133 * Math.atan2(f_21_, d)) & 0x3fff;
				GameWorld.cameraYaw = 0x3fff & (int) (2607.5945876176133 * -Math.atan2(f_20_, f_22_));
				Class308.anInt2584 = ((InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][3]) - -(((-(InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][3]) + (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][2 + i_1_][3])) * Class54.anInt3394) >> 16));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.C(" + i + ')');
		}
	}

	final void method2621(int i, int i_23_) {
		try {
			synchronized (aClass79_1442) {
				aClass79_1442.method800((byte) 62, i);
			}
			if (i_23_ == 3) {
				synchronized (aClass79_1443) {
					aClass79_1443.method800((byte) 62, i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.F(" + i + ',' + i_23_ + ')');
		}
	}

	static final byte[] method2622(byte[] is, byte i, int i_24_) {
		try {
			byte[] is_25_ = new byte[i_24_];
			Class236.method2894(is, 0, is_25_, 0, i_24_);
			if (i > -100)
				method2622(null, (byte) 61, 124);
			return is_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("me.D(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_24_ + ')'));
		}
	}

	final Class97 method2623(int i, int i_26_) {
		try {
			Class97 class97;
			synchronized (aClass79_1442) {
				class97 = (Class97) aClass79_1442.get(i);
			}
			if (class97 != null)
				return class97;
			byte[] is;
			synchronized (aClass207_1441) {
				is = (aClass207_1441.readArchive(Class98_Sub10_Sub32.method1096(i, 127), Class299_Sub2.method3527(i, i_26_ ^ 0x2dea8938)));
			}
			class97 = new Class97();
			if (i_26_ != 16383)
				return null;
			class97.aClass183_824 = this;
			class97.anInt826 = i;
			if (is != null)
				class97.method933(new RSByteBuffer(is), -125);
			class97.method938(i_26_ + -16508);
			synchronized (aClass79_1442) {
				aClass79_1442.put(i, class97);
			}
			return class97;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.E(" + i + ',' + i_26_ + ')');
		}
	}

	final Class98_Sub46_Sub16 method2624(int i, int i_27_) {
		try {
			if (i != 2)
				method2623(20, 104);
			Class98_Sub46_Sub16 class98_sub46_sub16;
			synchronized (aClass79_1443) {
				class98_sub46_sub16 = ((Class98_Sub46_Sub16) aClass79_1443.get(i_27_));
				if (class98_sub46_sub16 == null) {
					class98_sub46_sub16 = new Class98_Sub46_Sub16(i_27_);
					aClass79_1443.put(i_27_, class98_sub46_sub16);
				}
				if (!class98_sub46_sub16.method1614((byte) 66))
					return null;
			}
			return class98_sub46_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.H(" + i + ',' + i_27_ + ')');
		}
	}

	static final void method2625(boolean bool, int i) {
		try {
			if (bool != false)
				method2620(104);
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i, -105, 4);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.A(" + bool + ',' + i + ')');
		}
	}

	Class183(Class279 class279, int i, RuneScapeCache class207, RuneScapeCache class207_28_, RuneScapeCache class207_29_) {
		try {
			aClass207_1441 = class207;
			if (aClass207_1441 != null) {
				int i_30_ = aClass207_1441.method2752((byte) -11) - 1;
				aClass207_1441.method2761(0, i_30_);
			}
			Class246_Sub3_Sub4_Sub4.method3079((byte) 33, class207_29_, 2, class207_28_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("me.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ',' + (class207_28_ != null ? "{...}" : "null") + ',' + (class207_29_ != null ? "{...}" : "null") + ')'));
		}
	}
}
