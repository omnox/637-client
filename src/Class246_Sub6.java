/* Class246_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub6 extends Class246 {
	int anInt5109;
	int anInt5110;
	int anInt5111;
	int anInt5112;
	int anInt5113;
	boolean aBoolean5114 = false;

	final boolean method3130(int i, int i_0_) {
		if (!this.aBoolean5114)
			return false;
		int i_1_ = (this.anInt5110 - this.anInt5111);
		int i_2_ = (this.anInt5112 - this.anInt5113);
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = (i * i_1_ + i_0_ * i_2_ - (this.anInt5111 * i_1_ + this.anInt5113 * i_2_));
		if (i_4_ <= 0) {
			int i_5_ = this.anInt5111 - i;
			int i_6_ = this.anInt5113 - i_0_;
			if (i_5_ * i_5_ + i_6_ * i_6_ >= (this.anInt5109 * this.anInt5109))
				return false;
			return true;
		}
		if (i_4_ > i_3_) {
			int i_7_ = this.anInt5110 - i;
			int i_8_ = this.anInt5112 - i_0_;
			if (i_7_ * i_7_ + i_8_ * i_8_ >= (this.anInt5109 * this.anInt5109))
				return false;
			return true;
		}
		i_4_ = (i_4_ << 10) / i_3_;
		int i_9_ = this.anInt5111 + (i_1_ * i_4_ >> 10) - i;
		int i_10_ = this.anInt5113 + (i_2_ * i_4_ >> 10) - i_0_;
		if (i_9_ * i_9_ + i_10_ * i_10_ >= (this.anInt5109 * this.anInt5109))
			return false;
		return true;
	}

	public Class246_Sub6() {
		/* empty */
	}
}
