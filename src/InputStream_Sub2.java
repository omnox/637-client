
/* InputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStream_Sub2 extends InputStream {
	static int anInt29 = -50;

	static final aa_Sub3 method123(int i, int[] is, ha_Sub1 var_ha_Sub1, int i_0_, int[] is_1_, byte i_2_) {
		try {
			if (i_2_ != 111)
				anInt29 = -5;
			byte[] is_3_ = new byte[i * i_0_];
			for (int i_4_ = 0; i > i_4_; i_4_++) {
				int i_5_ = i_0_ * i_4_ + is[i_4_];
				for (int i_6_ = 0; is_1_[i_4_] > i_6_; i_6_++)
					is_3_[i_5_++] = (byte) -1;
			}
			return new aa_Sub3(var_ha_Sub1, i_0_, i, is_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rca.B(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i_0_ + ',' + (is_1_ != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	public final int read() {
		try {
			Class246_Sub7.method3131(0, 30000L);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rca.read(" + ')');
		}
	}

	static final void method124(int i) {
		try {
			Class64_Sub9.aClass332_3663 = null;
			int i_7_ = -24 / ((-12 - i) / 63);
			Canvas_Sub1.anInt26 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rca.A(" + i + ')');
		}
	}

	static final void method125(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			int i_13_ = i + -i_11_;
			if (i_12_ != 21597)
				anInt29 = 22;
			int i_14_ = i_9_ + -i_10_;
			if (i_13_ != 0) {
				if (i_14_ == 0) {
					Class318.method3656(i_8_, i_11_, (byte) 85, i, i_10_);
					return;
				}
			} else {
				if (i_14_ != 0)
					Class98_Sub50.method1671(i_11_, (byte) 0, i_10_, i_9_, i_8_);
				return;
			}
			int i_15_ = (i_14_ << 12) / i_13_;
			int i_16_ = i_10_ + -(i_15_ * i_11_ >> 12);
			int i_17_;
			int i_18_;
			if (Class76_Sub8.anInt3778 > i) {
				i_18_ = i_16_ + (i_15_ * Class76_Sub8.anInt3778 >> 12);
				i_17_ = Class76_Sub8.anInt3778;
			} else if (i > Class3.anInt77) {
				i_17_ = Class3.anInt77;
				i_18_ = i_16_ + (Class3.anInt77 * i_15_ >> 12);
			} else {
				i_17_ = i;
				i_18_ = i_9_;
			}
			int i_19_;
			int i_20_;
			if (Class76_Sub8.anInt3778 > i_11_) {
				i_19_ = i_16_ - -(i_15_ * Class76_Sub8.anInt3778 >> 12);
				i_20_ = Class76_Sub8.anInt3778;
			} else if (Class3.anInt77 < i_11_) {
				i_19_ = i_16_ + (i_15_ * Class3.anInt77 >> 12);
				i_20_ = Class3.anInt77;
			} else {
				i_19_ = i_10_;
				i_20_ = i_11_;
			}
			if (Class98_Sub10_Sub38.anInt5753 > i_18_) {
				i_18_ = Class98_Sub10_Sub38.anInt5753;
				i_17_ = ((-i_16_ + Class98_Sub10_Sub38.anInt5753 << 12) / i_15_);
			} else if (i_18_ > Class218.anInt1635) {
				i_17_ = (-i_16_ + Class218.anInt1635 << 12) / i_15_;
				i_18_ = Class218.anInt1635;
			}
			if (i_19_ >= Class98_Sub10_Sub38.anInt5753) {
				if (Class218.anInt1635 < i_19_) {
					i_19_ = Class218.anInt1635;
					i_20_ = (-i_16_ + Class218.anInt1635 << 12) / i_15_;
				}
			} else {
				i_19_ = Class98_Sub10_Sub38.anInt5753;
				i_20_ = ((-i_16_ + Class98_Sub10_Sub38.anInt5753 << 12) / i_15_);
			}
			Class91.method890(i_8_, i_19_, i_18_, i_17_, (byte) -126, i_20_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rca.C(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}
}
