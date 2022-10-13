/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class221 {
	static int anInt1664 = 0;
	static int[] anIntArray1665;
	static Class332 aClass332_1666;

	static final void method2821(File file, String string, int i) {
		try {
			Class124.aHashtable1015.put(string, file);
			if (i != -320)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oda.C(" + (file != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method2822(int i) {
		do {
			try {
				anIntArray1665 = null;
				aClass332_1666 = null;
				if (i <= -110)
					break;
				method2822(-121);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oda.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2823(byte i, int[] is, int[] is_0_, int i_1_, int i_2_) {
		do {
			try {
				if (i <= -100) {
					if (i_2_ <= i_1_)
						break;
					int i_3_ = (i_2_ + i_1_) / 2;
					int i_4_ = i_1_;
					int i_5_ = is_0_[i_3_];
					is_0_[i_3_] = is_0_[i_2_];
					is_0_[i_2_] = i_5_;
					int i_6_ = is[i_3_];
					is[i_3_] = is[i_2_];
					is[i_2_] = i_6_;
					int i_7_ = i_5_ != 2147483647 ? 1 : 0;
					for (int i_8_ = i_1_; i_2_ > i_8_; i_8_++) {
						if ((i_7_ & i_8_) + i_5_ > is_0_[i_8_]) {
							int i_9_ = is_0_[i_8_];
							is_0_[i_8_] = is_0_[i_4_];
							is_0_[i_4_] = i_9_;
							int i_10_ = is[i_8_];
							is[i_8_] = is[i_4_];
							is[i_4_++] = i_10_;
						}
					}
					is_0_[i_2_] = is_0_[i_4_];
					is_0_[i_4_] = i_5_;
					is[i_2_] = is[i_4_];
					is[i_4_] = i_6_;
					method2823((byte) -109, is, is_0_, i_1_, i_4_ - 1);
					method2823((byte) -125, is, is_0_, 1 + i_4_, i_2_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("oda.B(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_0_ != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}
}
