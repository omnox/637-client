/* Class98_Sub10_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub12 extends Class98_Sub10 {
	static int anInt5598;
	static boolean aBoolean5599 = true;

	final int[][] method997(int i, int i_0_) {
		try {
			int[][] is = ((Class98_Sub10) this).aClass223_3859.method2828(i_0_, 0);
			if (((Class223) ((Class98_Sub10) this).aClass223_3859).aBoolean1683) {
				int[] is_1_ = this.method1000(i_0_, 2, 0);
				int[][] is_2_ = this.method994(i_0_, 24431, 0);
				int[][] is_3_ = this.method994(i_0_, 24431, 1);
				int[] is_4_ = is[0];
				int[] is_5_ = is[1];
				int[] is_6_ = is[2];
				int[] is_7_ = is_2_[0];
				int[] is_8_ = is_2_[1];
				int[] is_9_ = is_2_[2];
				int[] is_10_ = is_3_[0];
				int[] is_11_ = is_3_[1];
				int[] is_12_ = is_3_[2];
				for (int i_13_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
					int i_14_ = is_1_[i_13_];
					if (i_14_ != 4096) {
						if (i_14_ == 0) {
							is_4_[i_13_] = is_10_[i_13_];
							is_5_[i_13_] = is_11_[i_13_];
							is_6_[i_13_] = is_12_[i_13_];
						} else {
							int i_15_ = -i_14_ + 4096;
							is_4_[i_13_] = (i_14_ * is_7_[i_13_] - -(is_10_[i_13_] * i_15_) >> 327350924);
							is_5_[i_13_] = (is_8_[i_13_] * i_14_ + i_15_ * is_11_[i_13_] >> 428197644);
							is_6_[i_13_] = (is_12_[i_13_] * i_15_ + is_9_[i_13_] * i_14_ >> 1391664972);
						}
					} else {
						is_4_[i_13_] = is_7_[i_13_];
						is_5_[i_13_] = is_8_[i_13_];
						is_6_[i_13_] = is_9_[i_13_];
					}
				}
			}
			if (i > -76)
				aBoolean5599 = false;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gr.C(" + i + ',' + i_0_ + ')');
		}
	}

	final int[] method990(int i, int i_16_) {
		try {
			if (i != 255)
				method991(92, null, (byte) -19);
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237((byte) 98, i_16_);
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
				int[] is_17_ = this.method1000(i_16_, 0, 0);
				int[] is_18_ = this.method1000(i_16_, 1, 0);
				int[] is_19_ = this.method1000(i_16_, 2, 0);
				for (int i_20_ = 0; Class25.anInt268 > i_20_; i_20_++) {
					int i_21_ = is_19_[i_20_];
					if (i_21_ != 4096) {
						if (i_21_ != 0)
							is[i_20_] = (is_18_[i_20_] * (4096 - i_21_) + i_21_ * is_17_[i_20_]) >> 1486833164;
						else
							is[i_20_] = is_18_[i_20_];
					} else
						is[i_20_] = is_17_[i_20_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gr.G(" + i + ',' + i_16_ + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_22_) {
		do {
			try {
				if (i_22_ >= -92)
					aBoolean5599 = false;
				if ((i ^ 0xffffffff) != -1)
					break;
				((Class98_Sub10) this).aBoolean3861 = ((class98_sub22.readUnsignedByte() ^ 0xffffffff) == -2);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gr.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_22_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub12() {
		super(3, false);
	}
}
