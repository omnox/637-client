/* Class98_Sub10_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub5_Sub1 extends Class98_Sub10_Sub5 {
	static int anInt6292 = -1;

	static final void method1018(float f, boolean bool, int i, float f_0_, int i_1_, float f_2_, Class39 class39, int i_3_, float f_4_, int i_5_, byte[] is, float f_6_, int i_7_, int i_8_) {
		do {
			try {
				int i_9_ = i_7_ * i_5_;
				float[] fs = new float[i_9_];
				for (int i_10_ = 0; i_3_ > i_10_; i_10_++) {
					int i_11_ = i;
					class39.method352(i_1_, i_5_, f_2_ / (float) i_1_, i_8_, f_4_ * 127.0F, 0, f / (float) i_7_, f_6_ / (float) i_5_, fs, i_7_, 1);
					f_6_ *= 2.0F;
					f_2_ *= 2.0F;
					f_4_ *= f_0_;
					f *= 2.0F;
					for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
						is[i_11_] += fs[i_12_];
						i_11_++;
					}
				}
				int i_13_ = i;
				for (int i_14_ = 0; i_9_ > i_14_; i_14_++) {
					is[i_13_] = (byte) (is[i_13_] + 127);
					i_13_++;
				}
				if (bool == false)
					break;
				method1018(-1.6836507F, true, 101, -0.5326127F, 104, -0.6777266F, null, -49, -1.3125609F, 51, null, 0.05877325F, -34, -101);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("dc.B(" + f + ',' + bool + ',' + i + ',' + f_0_ + ',' + i_1_ + ',' + f_2_ + ',' + (class39 != null ? "{...}" : "null") + ',' + i_3_ + ',' + f_4_ + ',' + i_5_ + ',' + (is != null ? "{...}" : "null") + ',' + f_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub5_Sub1() {
		/* empty */
	}

	final int[][] method997(int i, int i_15_) {
		try {
			int[][] is = this.aClass223_3859.method2828(i_15_, 0);
			if (this.aClass223_3859.aBoolean1683 && this.method1016(-1)) {
				int[] is_16_ = is[0];
				int[] is_17_ = is[1];
				int[] is_18_ = is[2];
				int i_19_ = (this.anInt5555 * (i_15_ % this.anInt5555));
				for (int i_20_ = 0; Class25.anInt268 > i_20_; i_20_++) {
					int i_21_ = (this.anIntArray5552[(i_20_ % this.anInt5556 + i_19_)]);
					is_18_[i_20_] = Class202.method2702(i_21_ << 4, 4080);
					is_17_[i_20_] = Class202.method2702(4080, i_21_ >> 4);
					is_16_[i_20_] = Class202.method2702(i_21_, 16711680) >> 12;
				}
			}
			if (i >= -76)
				method997(54, -2);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dc.C(" + i + ',' + i_15_ + ')');
		}
	}
}
