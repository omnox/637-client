/* Class98_Sub10_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub4 extends Class98_Sub10 {
	static int[] anIntArray5547 = new int[13];
	private int anInt5548;
	private int anInt5549 = 4096;
	static String[] aStringArray5550 = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private int anInt5551;

	public static void method1013(int i) {
		try {
			anIntArray5547 = null;
			int i_0_ = 78 % ((i - 58) / 60);
			aStringArray5550 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bu.B(" + i + ')');
		}
	}

	final int[][] method997(int i, int i_1_) {
		try {
			int[][] is = ((Class98_Sub10) this).aClass223_3859.method2828(i_1_, 0);
			if (i > -76)
				return null;
			if (((Class223) ((Class98_Sub10) this).aClass223_3859).aBoolean1683) {
				int[][] is_2_ = this.method994(i_1_, 24431, 0);
				int[] is_3_ = is_2_[0];
				int[] is_4_ = is_2_[1];
				int[] is_5_ = is_2_[2];
				int[] is_6_ = is[0];
				int[] is_7_ = is[1];
				int[] is_8_ = is[2];
				for (int i_9_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
					int i_10_ = is_3_[i_9_];
					int i_11_ = is_5_[i_9_];
					int i_12_ = is_4_[i_9_];
					if ((i_10_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff) || (i_11_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff)) {
						is_6_[i_9_] = anInt5548;
						is_7_[i_9_] = anInt5551;
						is_8_[i_9_] = anInt5549;
					} else {
						is_6_[i_9_] = anInt5548 * i_10_ >> 761727308;
						is_7_[i_9_] = i_11_ * anInt5551 >> 1764240204;
						is_8_[i_9_] = i_12_ * anInt5549 >> 92417804;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bu.C(" + i + ',' + i_1_ + ')');
		}
	}

	public Class98_Sub10_Sub4() {
		super(1, false);
		anInt5548 = 4096;
		anInt5551 = 4096;
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_13_) {
		try {
			int i_14_ = i;
			while_33_: do {
				do {
					if (i_14_ != 0) {
						if (i_14_ != 1) {
							if (i_14_ == 2)
								break;
							break while_33_;
						}
					} else {
						anInt5548 = class98_sub22.readShort();
						break while_33_;
					}
					anInt5551 = class98_sub22.readShort();
					break while_33_;
				} while (false);
				anInt5549 = class98_sub22.readShort();
			} while (false);
			if (i_13_ > -92)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bu.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_13_ + ')'));
		}
	}
}
