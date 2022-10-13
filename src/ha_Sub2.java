
/* ha_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

final class ha_Sub2 extends ha {
	private boolean aBoolean4472;
	private boolean aBoolean4473 = false;
	private int anInt4474;
	private int anInt4475;
	private Class377 aClass377_4476;
	private int anInt4477;
	Class98_Sub32 aClass98_Sub32_4478;
	private Canvas aCanvas4479;
	private int anInt4480;
	int anInt4481;
	int anInt4482;
	private Class235[] aClass235Array4483;
	int anInt4484;
	private int anInt4485;
	int anInt4486;
	float[] aFloatArray4487;
	float[] aFloatArray4488;
	int anInt4489;
	int anInt4490;
	private boolean aBoolean4491;
	int anInt4492;
	private int anInt4493;
	private Class79 aClass79_4494;
	int anInt4495;
	private int anInt4496;
	private Class79 aClass79_4497;
	private int anInt4498;
	private Class186 aClass186_4499;
	int anInt4500;
	int anInt4501;
	int anInt4502;
	private int anInt4503;
	int[] anIntArray4504;
	int anInt4505;
	int anInt4506;
	int anInt4507;
	int anInt4508;
	int anInt4509;
	int anInt4510;
	int anInt4511;
	private int anInt4512;
	Class111_Sub2 aClass111_Sub2_4513;
	int anInt4514;
	int anInt4515;
	int anInt4516;
	int anInt4517;
	int anInt4518;
	private Class332 aClass332_4519;
	private int anInt4520;

	final boolean method1767() {
		return false;
	}

	final Class98_Sub5 method1765(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
		return null;
	}

	final void method1791(float f, float f_4_, float f_5_) {
		/* empty */
	}

	final void ZA(int i, float f, float f_6_, float f_7_, float f_8_, float f_9_) {
		this.anInt4501 = (int) (f * 65535.0F);
		this.anInt4489 = (int) (f_6_ * 65535.0F);
		float f_10_ = (float) Math.sqrt(f_7_ * f_7_ + f_8_ * f_8_ + f_9_ * f_9_);
		this.anInt4481 = (int) (f_7_ * 65535.0F / f_10_);
		this.anInt4515 = (int) (f_8_ * 65535.0F / f_10_);
		this.anInt4500 = (int) (f_9_ * 65535.0F / f_10_);
	}

	final void a(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, aa var_aa, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is = var_aa_Sub1.anIntArray3555;
		int[] is_21_ = var_aa_Sub1.anIntArray3557;
		int i_22_ = (this.anInt4495 > i_17_ ? this.anInt4495 : i_17_);
		int i_23_ = (this.anInt4492 < i_17_ + is.length ? this.anInt4492 : i_17_ + is.length);
		i_20_ <<= 8;
		i_18_ <<= 8;
		i_19_ <<= 8;
		int i_24_ = i_18_ + i_19_;
		i_20_ %= i_24_;
		i_12_ -= i;
		i_13_ -= i_11_;
		if (i_12_ + i_13_ < 0) {
			int i_25_ = (int) (Math.sqrt(i_12_ * i_12_ + i_13_ * i_13_) * 256.0);
			int i_26_ = i_25_ % i_24_;
			i_20_ = i_24_ + i_18_ - i_20_ - i_26_;
			i_20_ %= i_24_;
			if (i_20_ < 0)
				i_20_ += i_24_;
			i += i_12_;
			i_12_ = -i_12_;
			i_11_ += i_13_;
			i_13_ = -i_13_;
		}
		if (i_12_ > i_13_) {
			i_11_ <<= 16;
			i_11_ += 32768;
			i_13_ <<= 16;
			int i_27_ = (int) Math.floor((double) i_13_ / (double) i_12_ + 0.5);
			i_12_ += i;
			int i_28_ = i_14_ >>> 24;
			int i_29_ = (int) Math.sqrt(65536 + (i_27_ >> 8) * (i_27_ >> 8));
			if (i_15_ == 0 || i_15_ == 1 && i_28_ == 255) {
				while (i <= i_12_) {
					int i_30_ = i_11_ >> 16;
					int i_31_ = i_30_ - i_17_;
					if (i >= this.anInt4509 && i < this.anInt4507 && i_30_ >= i_22_ && i_30_ < i_23_ && i_20_ < i_18_) {
						int i_32_ = i_16_ + is[i_31_];
						if (i >= i_32_ && i < i_32_ + is_21_[i_31_])
							this.anIntArray4504[i + i_30_ * this.anInt4505] = i_14_;
					}
					i_11_ += i_27_;
					i++;
					i_20_ += i_29_;
					i_20_ %= i_24_;
				}
				return;
			}
			if (i_15_ == 1) {
				i_14_ = (((i_14_ & 0xff00ff) * i_28_ >> 8 & 0xff00ff) + ((i_14_ & 0xff00) * i_28_ >> 8 & 0xff00) + (i_28_ << 24));
				int i_33_ = 256 - i_28_;
				while (i <= i_12_) {
					int i_34_ = i_11_ >> 16;
					int i_35_ = i_34_ - i_17_;
					if (i >= this.anInt4509 && i < this.anInt4507 && i_34_ >= i_22_ && i_34_ < i_23_ && i_20_ < i_18_) {
						int i_36_ = i_16_ + is[i_35_];
						if (i >= i_36_ && i < i_36_ + is_21_[i_35_]) {
							int i_37_ = i + i_34_ * this.anInt4505;
							int i_38_ = this.anIntArray4504[i_37_];
							i_38_ = (((i_38_ & 0xff00ff) * i_33_ >> 8 & 0xff00ff) + ((i_38_ & 0xff00) * i_33_ >> 8 & 0xff00));
							this.anIntArray4504[i_37_] = i_14_ + i_38_;
						}
					}
					i_11_ += i_27_;
					i++;
					i_20_ += i_29_;
					i_20_ %= i_24_;
				}
				return;
			}
			if (i_15_ == 2) {
				while (i <= i_12_) {
					int i_39_ = i_11_ >> 16;
					int i_40_ = i_39_ - i_17_;
					if (i >= this.anInt4509 && i < this.anInt4507 && i_39_ >= i_22_ && i_39_ < i_23_ && i_20_ < i_18_) {
						int i_41_ = i_16_ + is[i_40_];
						if (i >= i_41_ && i < i_41_ + is_21_[i_40_]) {
							int i_42_ = i + i_39_ * this.anInt4505;
							int i_43_ = this.anIntArray4504[i_42_];
							int i_44_ = i_14_ + i_43_;
							int i_45_ = (i_14_ & 0xff00ff) + (i_43_ & 0xff00ff);
							i_43_ = (i_45_ & 0x1000100) + (i_44_ - i_45_ & 0x10000);
							this.anIntArray4504[i_42_] = i_44_ - i_43_ | i_43_ - (i_43_ >>> 8);
						}
					}
					i_11_ += i_27_;
					i++;
					i_20_ += i_29_;
					i_20_ %= i_24_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_12_ <<= 16;
		int i_46_ = (int) Math.floor((double) i_12_ / (double) i_13_ + 0.5);
		int i_47_ = (int) Math.sqrt(65536 + (i_46_ >> 8) * (i_46_ >> 8));
		i_13_ += i_11_;
		int i_48_ = i_14_ >>> 24;
		if (i_15_ == 0 || i_15_ == 1 && i_48_ == 255) {
			while (i_11_ <= i_13_) {
				int i_49_ = i >> 16;
				int i_50_ = i_11_ - i_17_;
				if (i_11_ >= i_22_ && i_11_ < i_23_ && i_49_ >= this.anInt4509 && i_49_ < this.anInt4507 && i_20_ < i_18_ && i_49_ >= i_16_ + is[i_50_] && i_49_ < i_16_ + is[i_50_] + is_21_[i_50_])
					this.anIntArray4504[i_49_ + i_11_ * this.anInt4505] = i_14_;
				i += i_46_;
				i_11_++;
				i_20_ += i_47_;
				i_20_ %= i_24_;
			}
		} else if (i_15_ == 1) {
			i_14_ = (((i_14_ & 0xff00ff) * i_48_ >> 8 & 0xff00ff) + ((i_14_ & 0xff00) * i_48_ >> 8 & 0xff00) + (i_48_ << 24));
			int i_51_ = 256 - i_48_;
			while (i_11_ <= i_13_) {
				int i_52_ = i >> 16;
				int i_53_ = i_11_ - i_17_;
				if (i_11_ >= i_22_ && i_11_ < i_23_ && i_52_ >= this.anInt4509 && i_52_ < this.anInt4507 && i_20_ < i_18_ && i_52_ >= i_16_ + is[i_53_] && i_52_ < i_16_ + is[i_53_] + is_21_[i_53_]) {
					int i_54_ = i_52_ + i_11_ * this.anInt4505;
					int i_55_ = this.anIntArray4504[i_54_];
					i_55_ = (((i_55_ & 0xff00ff) * i_51_ >> 8 & 0xff00ff) + ((i_55_ & 0xff00) * i_51_ >> 8 & 0xff00));
					this.anIntArray4504[i_52_ + i_11_ * this.anInt4505] = i_14_ + i_55_;
				}
				i += i_46_;
				i_11_++;
				i_20_ += i_47_;
				i_20_ %= i_24_;
			}
		} else if (i_15_ == 2) {
			while (i_11_ <= i_13_) {
				int i_56_ = i >> 16;
				int i_57_ = i_11_ - i_17_;
				if (i_11_ >= i_22_ && i_11_ < i_23_ && i_56_ >= this.anInt4509 && i_56_ < this.anInt4507 && i_20_ < i_18_ && i_56_ >= i_16_ + is[i_57_] && i_56_ < i_16_ + is[i_57_] + is_21_[i_57_]) {
					int i_58_ = i_56_ + i_11_ * this.anInt4505;
					int i_59_ = this.anIntArray4504[i_58_];
					int i_60_ = i_14_ + i_59_;
					int i_61_ = (i_14_ & 0xff00ff) + (i_59_ & 0xff00ff);
					i_59_ = (i_61_ & 0x1000100) + (i_60_ - i_61_ & 0x10000);
					this.anIntArray4504[i_58_] = i_60_ - i_59_ | i_59_ - (i_59_ >>> 8);
				}
				i += i_46_;
				i_11_++;
				i_20_ += i_47_;
				i_20_ %= i_24_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final void HA(int i, int i_62_, int i_63_, int i_64_, int[] is) {
		float f = ((this.aClass111_Sub2_4513.aFloat4689) + ((this.aClass111_Sub2_4513.aFloat4693) * (float) i + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_62_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_63_));
		if (f < (float) this.anInt4502 || f > (float) this.anInt4484)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_65_ = (int) ((float) this.anInt4514 * (this.aClass111_Sub2_4513.aFloat4697 + ((this.aClass111_Sub2_4513.aFloat4700) * (float) i + (this.aClass111_Sub2_4513.aFloat4699) * (float) i_62_ + (this.aClass111_Sub2_4513.aFloat4690) * (float) i_63_)) / (float) i_64_);
			int i_66_ = (int) ((float) this.anInt4490 * (this.aClass111_Sub2_4513.aFloat4691 + ((this.aClass111_Sub2_4513.aFloat4692) * (float) i + (this.aClass111_Sub2_4513.aFloat4688) * (float) i_62_ + (this.aClass111_Sub2_4513.aFloat4696) * (float) i_63_)) / (float) i_64_);
			if (i_65_ >= this.anInt4486 && i_65_ <= this.anInt4517 && i_66_ >= this.anInt4518 && i_66_ <= this.anInt4506) {
				is[0] = i_65_ - this.anInt4486;
				is[1] = i_66_ - this.anInt4518;
				is[2] = (int) f;
			} else
				is[0] = is[1] = is[2] = -1;
		}
	}

	final void xa(float f) {
		this.anInt4516 = (int) (f * 65535.0F);
	}

	final void P(int i, int i_67_, int i_68_, int i_69_, int i_70_) {
		if (i >= this.anInt4509 && i < this.anInt4507) {
			if (i_67_ < this.anInt4495) {
				i_68_ -= this.anInt4495 - i_67_;
				i_67_ = this.anInt4495;
			}
			if (i_67_ + i_68_ > this.anInt4492)
				i_68_ = this.anInt4492 - i_67_;
			int i_71_ = i + i_67_ * this.anInt4505;
			int i_72_ = i_69_ >>> 24;
			if (i_70_ == 0 || i_70_ == 1 && i_72_ == 255) {
				for (int i_73_ = 0; i_73_ < i_68_; i_73_++)
					this.anIntArray4504[i_71_ + i_73_ * this.anInt4505] = i_69_;
			} else if (i_70_ == 1) {
				i_69_ = (((i_69_ & 0xff00ff) * i_72_ >> 8 & 0xff00ff) + ((i_69_ & 0xff00) * i_72_ >> 8 & 0xff00) + (i_72_ << 24));
				int i_74_ = 256 - i_72_;
				for (int i_75_ = 0; i_75_ < i_68_; i_75_++) {
					int i_76_ = i_71_ + i_75_ * this.anInt4505;
					int i_77_ = this.anIntArray4504[i_76_];
					i_77_ = (((i_77_ & 0xff00ff) * i_74_ >> 8 & 0xff00ff) + ((i_77_ & 0xff00) * i_74_ >> 8 & 0xff00));
					this.anIntArray4504[i_76_] = i_69_ + i_77_;
				}
			} else if (i_70_ == 2) {
				for (int i_78_ = 0; i_78_ < i_68_; i_78_++) {
					int i_79_ = i_71_ + i_78_ * this.anInt4505;
					int i_80_ = this.anIntArray4504[i_79_];
					int i_81_ = i_69_ + i_80_;
					int i_82_ = (i_69_ & 0xff00ff) + (i_80_ & 0xff00ff);
					i_80_ = (i_82_ & 0x1000100) + (i_81_ - i_82_ & 0x10000);
					this.anIntArray4504[i_79_] = i_81_ - i_80_ | i_80_ - (i_80_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final boolean method1802() {
		return false;
	}

	final void ra(int i, int i_83_, int i_84_, int i_85_) {
		for (int i_86_ = 0; i_86_ < aClass235Array4483.length; i_86_++) {
			aClass235Array4483[i_86_].anInt1755 = aClass235Array4483[i_86_].anInt1763;
			aClass235Array4483[i_86_].anInt1754 = i;
			aClass235Array4483[i_86_].anInt1763 = i_83_;
			aClass235Array4483[i_86_].anInt1757 = i_84_;
			aClass235Array4483[i_86_].aBoolean1759 = true;
		}
	}

	final void method1801(int[] is) {
		is[0] = this.anInt4505;
		is[1] = anInt4480;
	}

	final void method1786(Canvas canvas) {
		if (aCanvas4479 == canvas)
			method1750(null);
		Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476.method3990(canvas.hashCode(), -1));
		if (class98_sub32 != null)
			class98_sub32.remove();
	}

	private ha_Sub2(d var_d) {
		super(var_d);
		aBoolean4472 = false;
		aClass377_4476 = new Class377(4);
		this.anInt4495 = 0;
		this.anInt4484 = 3500;
		aBoolean4491 = false;
		this.anInt4501 = 45823;
		anInt4498 = 0;
		this.anInt4509 = 0;
		this.anInt4482 = 128;
		this.anInt4492 = 0;
		anInt4493 = 0;
		this.anInt4516 = 75518;
		this.anInt4507 = 0;
		this.anInt4502 = 50;
		this.anInt4489 = 78642;
		this.anInt4490 = 512;
		this.anInt4514 = 512;
		aClass79_4497 = new Class79(16);
		anInt4520 = -1;
		try {
			aClass79_4494 = new Class79(256);
			this.aClass111_Sub2_4513 = new Class111_Sub2();
			method1783(1);
			method1807(0);
			Class101.method1702(8, true, true);
			aBoolean4473 = true;
			anInt4475 = (int) Class343.method3819(-47);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1743(-1);
			throw new RuntimeException("");
		}
	}

	final boolean method1766() {
		return true;
	}

	private final void method1911() {
		for (int i = 0; i < this.anInt4508; i++)
			aClass235Array4483[i].method2888((byte) -60);
		la();
	}

	final Interface5 method1813(int i, int i_87_) {
		return method1739(i, i_87_, false);
	}

	final Interface17 method1815(Interface5 interface5, Interface13 interface13) {
		return new Class186(this, (Class332) interface5, (Class333) interface13);
	}

	final void method1783(int i) {
		this.anInt4508 = i;
		aClass235Array4483 = new Class235[this.anInt4508];
		for (int i_88_ = 0; i_88_ < this.anInt4508; i_88_++)
			aClass235Array4483[i_88_] = new Class235(this);
	}

	final void method1816(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_) {
		Class235 class235 = method1921(Thread.currentThread());
		Class12 class12 = class235.aClass12_1767;
		int i_95_ = i_90_ - i;
		int i_96_ = i_91_ - i_89_;
		int i_97_ = i_95_ >= 0 ? i_95_ : -i_95_;
		int i_98_ = i_96_ >= 0 ? i_96_ : -i_96_;
		int i_99_ = i_97_;
		if (i_99_ < i_98_)
			i_99_ = i_98_;
		if (i_99_ != 0) {
			int i_100_ = (i_95_ << 16) / i_99_;
			int i_101_ = (i_96_ << 16) / i_99_;
			i_95_ += i_100_ >> 16;
			i_96_ += i_101_ >> 16;
			if (i_101_ <= i_100_)
				i_100_ = -i_100_;
			else
				i_101_ = -i_101_;
			int i_102_ = i_93_ * i_101_ >> 17;
			int i_103_ = i_93_ * i_101_ + 1 >> 17;
			int i_104_ = i_93_ * i_100_ >> 17;
			int i_105_ = i_93_ * i_100_ + 1 >> 17;
			i -= class12.method207();
			i_89_ -= class12.method210();
			int i_106_ = i + i_102_;
			int i_107_ = i - i_103_;
			int i_108_ = i + i_95_ - i_103_;
			int i_109_ = i + i_95_ + i_102_;
			int i_110_ = i_89_ + i_104_;
			int i_111_ = i_89_ - i_105_;
			int i_112_ = i_89_ + i_96_ - i_105_;
			int i_113_ = i_89_ + i_96_ + i_104_;
			if (i_94_ == 0)
				class12.anInt137 = 0;
			else if (i_94_ == 1)
				class12.anInt137 = 255 - (i_92_ >>> 24);
			else
				throw new IllegalArgumentException();
			C(false);
			class12.aBoolean135 = (i_106_ < 0 || i_106_ > class12.anInt141 || i_107_ < 0 || i_107_ > class12.anInt141 || i_108_ < 0 || i_108_ > class12.anInt141);
			class12.method208((float) i_110_, (float) i_111_, (float) i_112_, (float) i_106_, (float) i_107_, (float) i_108_, 100.0F, 100.0F, 100.0F, i_92_);
			class12.aBoolean135 = (i_106_ < 0 || i_106_ > class12.anInt141 || i_108_ < 0 || i_108_ > class12.anInt141 || i_109_ < 0 || i_109_ > class12.anInt141);
			class12.method208((float) i_110_, (float) i_112_, (float) i_113_, (float) i_106_, (float) i_108_, (float) i_109_, 100.0F, 100.0F, 100.0F, i_92_);
			C(true);
		}
	}

	ha_Sub2(Canvas canvas, d var_d, int i, int i_114_) {
		this(var_d);
		try {
			method1741(canvas, i, i_114_);
			method1750(canvas);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1743(-1);
			throw new RuntimeException("");
		}
	}

	final boolean method1819() {
		return false;
	}

	final void method1798(int i) {
		Class146_Sub1.anInt4810 = Class146_Sub1.anInt4825 = i;
		if (this.anInt4508 > 1)
			throw new IllegalStateException("No MT");
		method1783(this.anInt4508);
		method1807(0);
	}

	final int M() {
		int i = anInt4493;
		anInt4493 = 0;
		return i;
	}

	final int method1777(int i, int i_115_) {
		return i | i_115_;
	}

	final int method1822() {
		return 0;
	}

	final int method1912(int i) {
		return this.aD938.method11(i, -28755).anInt1818;
	}

	final void method1756() {
		/* empty */
	}

	final int I() {
		int i = anInt4498;
		anInt4498 = 0;
		return i;
	}

	final Class332 method1770(int[] is, int i, int i_116_, int i_117_, int i_118_, boolean bool) {
		boolean bool_119_ = false;
		int i_120_ = i;
		while_100_: for (int i_121_ = 0; i_121_ < i_118_; i_121_++) {
			for (int i_122_ = 0; i_122_ < i_117_; i_122_++) {
				int i_123_ = is[i_120_++] >>> 24;
				if (i_123_ != 0 && i_123_ != 255) {
					bool_119_ = true;
					break while_100_;
				}
			}
		}
		if (bool_119_)
			return new Class332_Sub3_Sub1(this, is, i, i_116_, i_117_, i_118_, bool);
		return new Class332_Sub3_Sub2(this, is, i, i_116_, i_117_, i_118_, bool);
	}

	private final void method1913() {
		this.anInt4486 = this.anInt4509 - this.anInt4510;
		this.anInt4517 = this.anInt4507 - this.anInt4510;
		this.anInt4518 = this.anInt4495 - this.anInt4511;
		this.anInt4506 = this.anInt4492 - this.anInt4511;
		for (int i = 0; i < this.anInt4508; i++) {
			Class12 class12 = aClass235Array4483[i].aClass12_1767;
			class12.anInt136 = this.anInt4510 - this.anInt4509;
			class12.anInt128 = this.anInt4511 - this.anInt4495;
			class12.anInt141 = this.anInt4507 - this.anInt4509;
			class12.anInt129 = this.anInt4492 - this.anInt4495;
		}
		int i = (this.anInt4495 * this.anInt4505 + this.anInt4509);
		for (int i_124_ = this.anInt4495; i_124_ < this.anInt4492; i_124_++) {
			for (int i_125_ = 0; i_125_ < this.anInt4508; i_125_++)
				aClass235Array4483[i_125_].aClass12_1767.anIntArray133[i_124_ - this.anInt4495] = i;
			i += this.anInt4505;
		}
	}

	final int r(int i, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_) {
		float f = ((this.aClass111_Sub2_4513.aFloat4693) * (float) i + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_126_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_127_ + (this.aClass111_Sub2_4513.aFloat4689));
		float f_132_ = ((this.aClass111_Sub2_4513.aFloat4693) * (float) i_128_ + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_129_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_130_ + (this.aClass111_Sub2_4513.aFloat4689));
		int i_133_ = 0;
		if (f < (float) this.anInt4502 && f_132_ < (float) this.anInt4502)
			i_133_ |= 0x10;
		else if (f > (float) this.anInt4484 && f_132_ > (float) this.anInt4484)
			i_133_ |= 0x20;
		int i_134_ = (int) ((float) this.anInt4514 * ((this.aClass111_Sub2_4513.aFloat4700) * (float) i + (this.aClass111_Sub2_4513.aFloat4699 * (float) i_126_) + (this.aClass111_Sub2_4513.aFloat4690 * (float) i_127_) + this.aClass111_Sub2_4513.aFloat4697) / (float) i_131_);
		int i_135_ = (int) ((float) this.anInt4514 * ((this.aClass111_Sub2_4513.aFloat4700) * (float) i_128_ + (this.aClass111_Sub2_4513.aFloat4699 * (float) i_129_) + (this.aClass111_Sub2_4513.aFloat4690 * (float) i_130_) + this.aClass111_Sub2_4513.aFloat4697) / (float) i_131_);
		if (i_134_ < this.anInt4486 && i_135_ < this.anInt4486)
			i_133_ |= 0x1;
		else if (i_134_ > this.anInt4517 && i_135_ > this.anInt4517)
			i_133_ |= 0x2;
		int i_136_ = (int) ((float) this.anInt4490 * ((this.aClass111_Sub2_4513.aFloat4692) * (float) i + (this.aClass111_Sub2_4513.aFloat4688 * (float) i_126_) + (this.aClass111_Sub2_4513.aFloat4696 * (float) i_127_) + this.aClass111_Sub2_4513.aFloat4691) / (float) i_131_);
		int i_137_ = (int) ((float) this.anInt4490 * ((this.aClass111_Sub2_4513.aFloat4692) * (float) i_128_ + (this.aClass111_Sub2_4513.aFloat4688 * (float) i_129_) + (this.aClass111_Sub2_4513.aFloat4696 * (float) i_130_) + this.aClass111_Sub2_4513.aFloat4691) / (float) i_131_);
		if (i_136_ < this.anInt4518 && i_137_ < this.anInt4518)
			i_133_ |= 0x4;
		else if (i_136_ > this.anInt4506 && i_137_ > this.anInt4506)
			i_133_ |= 0x8;
		return i_133_;
	}

	private final void method1914(Class246_Sub4_Sub2 class246_sub4_sub2, int i, int i_138_, int i_139_, int i_140_) {
		int i_141_ = class246_sub4_sub2.anInt6180;
		int i_142_ = i_140_;
		i_140_ <<= 1;
		if (i_141_ == -1)
			method1916(i, i_138_, i_139_, i_142_, class246_sub4_sub2.anInt6178, 1);
		else {
			if (anInt4520 != i_141_) {
				Class332 class332 = (Class332) aClass79_4497.get(i_141_);
				if (class332 == null) {
					int[] is = method1915(i_141_);
					if (is != null) {
						int i_143_ = (method1925(i_141_) ? 64 : this.anInt4482);
						class332 = this.method1748(-7962, 0, i_143_, i_143_, is, i_143_);
						aClass79_4497.put(i_141_, class332);
					} else
						return;
				}
				anInt4520 = i_141_;
				aClass332_4519 = class332;
			}
			i_140_++;
			((Class332_Sub3) aClass332_4519).method3757(i - i_142_, i_138_ - i_142_, i_139_, i_140_, i_140_, 0, class246_sub4_sub2.anInt6178, 1, 1);
		}
	}

	final boolean method1824() {
		return false;
	}

	final int[] method1915(int i) {
		Class98_Sub2 class98_sub2;
		synchronized (aClass79_4494) {
			class98_sub2 = ((Class98_Sub2) aClass79_4494.get((long) i | ~0x7fffffffffffffffL));
			if (class98_sub2 == null) {
				if (!this.aD938.method8(-119, i))
					return null;
				Class238 class238 = this.aD938.method11(i, -28755);
				int i_144_ = (class238.aBoolean1822 || aBoolean4491 ? 64 : this.anInt4482);
				class98_sub2 = new Class98_Sub2(i, i_144_, this.aD938.method13(115, i_144_, i, 0.7F, true, i_144_), class238.anInt1818 != 1);
				aClass79_4494.put((long) i | ~0x7fffffffffffffffL, class98_sub2);
			}
		}
		class98_sub2.aBoolean3817 = true;
		return class98_sub2.method948();
	}

	final void za(int i, int i_145_, int i_146_, int i_147_, int i_148_) {
		if (i_146_ < 0)
			i_146_ = -i_146_;
		int i_149_ = i_145_ - i_146_;
		if (i_149_ < this.anInt4495)
			i_149_ = this.anInt4495;
		int i_150_ = i_145_ + i_146_ + 1;
		if (i_150_ > this.anInt4492)
			i_150_ = this.anInt4492;
		int i_151_ = i_149_;
		int i_152_ = i_146_ * i_146_;
		int i_153_ = 0;
		int i_154_ = i_145_ - i_151_;
		int i_155_ = i_154_ * i_154_;
		int i_156_ = i_155_ - i_154_;
		if (i_145_ > i_150_)
			i_145_ = i_150_;
		int i_157_ = i_147_ >>> 24;
		if (i_148_ == 0 || i_148_ == 1 && i_157_ == 255) {
			while (i_151_ < i_145_) {
				for (/**/; i_156_ <= i_152_ || i_155_ <= i_152_; i_156_ += i_153_++ + i_153_)
					i_155_ += i_153_ + i_153_;
				int i_158_ = i - i_153_ + 1;
				if (i_158_ < this.anInt4509)
					i_158_ = this.anInt4509;
				int i_159_ = i + i_153_;
				if (i_159_ > this.anInt4507)
					i_159_ = this.anInt4507;
				int i_160_ = i_158_ + i_151_ * this.anInt4505;
				for (int i_161_ = i_158_; i_161_ < i_159_; i_161_++)
					this.anIntArray4504[i_160_++] = i_147_;
				i_151_++;
				i_155_ -= i_154_-- + i_154_;
				i_156_ -= i_154_ + i_154_;
			}
			i_153_ = i_146_;
			i_154_ = i_151_ - i_145_;
			i_156_ = i_154_ * i_154_ + i_152_;
			i_155_ = i_156_ - i_153_;
			i_156_ -= i_154_;
			while (i_151_ < i_150_) {
				for (/**/; i_156_ > i_152_ && i_155_ > i_152_; i_155_ -= i_153_ + i_153_)
					i_156_ -= i_153_-- + i_153_;
				int i_162_ = i - i_153_;
				if (i_162_ < this.anInt4509)
					i_162_ = this.anInt4509;
				int i_163_ = i + i_153_;
				if (i_163_ > this.anInt4507 - 1)
					i_163_ = this.anInt4507 - 1;
				int i_164_ = i_162_ + i_151_ * this.anInt4505;
				for (int i_165_ = i_162_; i_165_ <= i_163_; i_165_++)
					this.anIntArray4504[i_164_++] = i_147_;
				i_151_++;
				i_156_ += i_154_ + i_154_;
				i_155_ += i_154_++ + i_154_;
			}
		} else if (i_148_ == 1) {
			i_147_ = (((i_147_ & 0xff00ff) * i_157_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_157_ >> 8 & 0xff00) + (i_157_ << 24));
			int i_166_ = 256 - i_157_;
			while (i_151_ < i_145_) {
				for (/**/; i_156_ <= i_152_ || i_155_ <= i_152_; i_156_ += i_153_++ + i_153_)
					i_155_ += i_153_ + i_153_;
				int i_167_ = i - i_153_ + 1;
				if (i_167_ < this.anInt4509)
					i_167_ = this.anInt4509;
				int i_168_ = i + i_153_;
				if (i_168_ > this.anInt4507)
					i_168_ = this.anInt4507;
				int i_169_ = i_167_ + i_151_ * this.anInt4505;
				for (int i_170_ = i_167_; i_170_ < i_168_; i_170_++) {
					int i_171_ = this.anIntArray4504[i_169_];
					i_171_ = (((i_171_ & 0xff00ff) * i_166_ >> 8 & 0xff00ff) + ((i_171_ & 0xff00) * i_166_ >> 8 & 0xff00));
					this.anIntArray4504[i_169_++] = i_147_ + i_171_;
				}
				i_151_++;
				i_155_ -= i_154_-- + i_154_;
				i_156_ -= i_154_ + i_154_;
			}
			i_153_ = i_146_;
			i_154_ = -i_154_;
			i_156_ = i_154_ * i_154_ + i_152_;
			i_155_ = i_156_ - i_153_;
			i_156_ -= i_154_;
			while (i_151_ < i_150_) {
				for (/**/; i_156_ > i_152_ && i_155_ > i_152_; i_155_ -= i_153_ + i_153_)
					i_156_ -= i_153_-- + i_153_;
				int i_172_ = i - i_153_;
				if (i_172_ < this.anInt4509)
					i_172_ = this.anInt4509;
				int i_173_ = i + i_153_;
				if (i_173_ > this.anInt4507 - 1)
					i_173_ = this.anInt4507 - 1;
				int i_174_ = i_172_ + i_151_ * this.anInt4505;
				for (int i_175_ = i_172_; i_175_ <= i_173_; i_175_++) {
					int i_176_ = this.anIntArray4504[i_174_];
					i_176_ = (((i_176_ & 0xff00ff) * i_166_ >> 8 & 0xff00ff) + ((i_176_ & 0xff00) * i_166_ >> 8 & 0xff00));
					this.anIntArray4504[i_174_++] = i_147_ + i_176_;
				}
				i_151_++;
				i_156_ += i_154_ + i_154_;
				i_155_ += i_154_++ + i_154_;
			}
		} else if (i_148_ == 2) {
			while (i_151_ < i_145_) {
				for (/**/; i_156_ <= i_152_ || i_155_ <= i_152_; i_156_ += i_153_++ + i_153_)
					i_155_ += i_153_ + i_153_;
				int i_177_ = i - i_153_ + 1;
				if (i_177_ < this.anInt4509)
					i_177_ = this.anInt4509;
				int i_178_ = i + i_153_;
				if (i_178_ > this.anInt4507)
					i_178_ = this.anInt4507;
				int i_179_ = i_177_ + i_151_ * this.anInt4505;
				for (int i_180_ = i_177_; i_180_ < i_178_; i_180_++) {
					int i_181_ = this.anIntArray4504[i_179_];
					int i_182_ = i_147_ + i_181_;
					int i_183_ = (i_147_ & 0xff00ff) + (i_181_ & 0xff00ff);
					i_181_ = (i_183_ & 0x1000100) + (i_182_ - i_183_ & 0x10000);
					this.anIntArray4504[i_179_++] = i_182_ - i_181_ | i_181_ - (i_181_ >>> 8);
				}
				i_151_++;
				i_155_ -= i_154_-- + i_154_;
				i_156_ -= i_154_ + i_154_;
			}
			i_153_ = i_146_;
			i_154_ = -i_154_;
			i_156_ = i_154_ * i_154_ + i_152_;
			i_155_ = i_156_ - i_153_;
			i_156_ -= i_154_;
			while (i_151_ < i_150_) {
				for (/**/; i_156_ > i_152_ && i_155_ > i_152_; i_155_ -= i_153_ + i_153_)
					i_156_ -= i_153_-- + i_153_;
				int i_184_ = i - i_153_;
				if (i_184_ < this.anInt4509)
					i_184_ = this.anInt4509;
				int i_185_ = i + i_153_;
				if (i_185_ > this.anInt4507 - 1)
					i_185_ = this.anInt4507 - 1;
				int i_186_ = i_184_ + i_151_ * this.anInt4505;
				for (int i_187_ = i_184_; i_187_ <= i_185_; i_187_++) {
					int i_188_ = this.anIntArray4504[i_186_];
					int i_189_ = i_147_ + i_188_;
					int i_190_ = (i_147_ & 0xff00ff) + (i_188_ & 0xff00ff);
					i_188_ = (i_190_ & 0x1000100) + (i_189_ - i_190_ & 0x10000);
					this.anIntArray4504[i_186_++] = i_189_ - i_188_ | i_188_ - (i_188_ >>> 8);
				}
				i_151_++;
				i_156_ += i_154_ + i_154_;
				i_155_ += i_154_++ + i_154_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final void method1740(Interface17 interface17) {
		Class186 class186 = (Class186) interface17;
		this.anInt4505 = class186.anInt3426;
		anInt4480 = class186.anInt3430;
		this.anIntArray4504 = class186.anIntArray3427;
		aClass186_4499 = class186;
		anInt4512 = class186.anInt3426;
		anInt4485 = class186.anInt3430;
		this.aFloatArray4487 = class186.aFloatArray3429;
		method1911();
	}

	private final void method1916(int i, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_) {
		if (i_193_ < 0)
			i_193_ = -i_193_;
		int i_196_ = i_191_ - i_193_;
		if (i_196_ < this.anInt4495)
			i_196_ = this.anInt4495;
		int i_197_ = i_191_ + i_193_ + 1;
		if (i_197_ > this.anInt4492)
			i_197_ = this.anInt4492;
		int i_198_ = i_196_;
		int i_199_ = i_193_ * i_193_;
		int i_200_ = 0;
		int i_201_ = i_191_ - i_198_;
		int i_202_ = i_201_ * i_201_;
		int i_203_ = i_202_ - i_201_;
		if (i_191_ > i_197_)
			i_191_ = i_197_;
		int i_204_ = i_194_ >>> 24;
		if (i_195_ == 0 || i_195_ == 1 && i_204_ == 255) {
			while (i_198_ < i_191_) {
				for (/**/; i_203_ <= i_199_ || i_202_ <= i_199_; i_203_ += i_200_++ + i_200_)
					i_202_ += i_200_ + i_200_;
				int i_205_ = i - i_200_ + 1;
				if (i_205_ < this.anInt4509)
					i_205_ = this.anInt4509;
				int i_206_ = i + i_200_;
				if (i_206_ > this.anInt4507)
					i_206_ = this.anInt4507;
				int i_207_ = i_205_ + i_198_ * this.anInt4505;
				for (int i_208_ = i_205_; i_208_ < i_206_; i_208_++) {
					if ((float) i_192_ < this.aFloatArray4487[i_207_])
						this.anIntArray4504[i_207_] = i_194_;
					i_207_++;
				}
				i_198_++;
				i_202_ -= i_201_-- + i_201_;
				i_203_ -= i_201_ + i_201_;
			}
			i_200_ = i_193_;
			i_201_ = i_198_ - i_191_;
			i_203_ = i_201_ * i_201_ + i_199_;
			i_202_ = i_203_ - i_200_;
			i_203_ -= i_201_;
			while (i_198_ < i_197_) {
				for (/**/; i_203_ > i_199_ && i_202_ > i_199_; i_202_ -= i_200_ + i_200_)
					i_203_ -= i_200_-- + i_200_;
				int i_209_ = i - i_200_;
				if (i_209_ < this.anInt4509)
					i_209_ = this.anInt4509;
				int i_210_ = i + i_200_;
				if (i_210_ > this.anInt4507 - 1)
					i_210_ = this.anInt4507 - 1;
				int i_211_ = i_209_ + i_198_ * this.anInt4505;
				for (int i_212_ = i_209_; i_212_ <= i_210_; i_212_++) {
					if ((float) i_192_ < this.aFloatArray4487[i_211_])
						this.anIntArray4504[i_211_] = i_194_;
					i_211_++;
				}
				i_198_++;
				i_203_ += i_201_ + i_201_;
				i_202_ += i_201_++ + i_201_;
			}
		} else if (i_195_ == 1) {
			i_194_ = (((i_194_ & 0xff00ff) * i_204_ >> 8 & 0xff00ff) + ((i_194_ & 0xff00) * i_204_ >> 8 & 0xff00) + (i_204_ << 24));
			int i_213_ = 256 - i_204_;
			while (i_198_ < i_191_) {
				for (/**/; i_203_ <= i_199_ || i_202_ <= i_199_; i_203_ += i_200_++ + i_200_)
					i_202_ += i_200_ + i_200_;
				int i_214_ = i - i_200_ + 1;
				if (i_214_ < this.anInt4509)
					i_214_ = this.anInt4509;
				int i_215_ = i + i_200_;
				if (i_215_ > this.anInt4507)
					i_215_ = this.anInt4507;
				int i_216_ = i_214_ + i_198_ * this.anInt4505;
				for (int i_217_ = i_214_; i_217_ < i_215_; i_217_++) {
					if ((float) i_192_ < this.aFloatArray4487[i_216_]) {
						int i_218_ = this.anIntArray4504[i_216_];
						i_218_ = (((i_218_ & 0xff00ff) * i_213_ >> 8 & 0xff00ff) + ((i_218_ & 0xff00) * i_213_ >> 8 & 0xff00));
						this.anIntArray4504[i_216_] = i_194_ + i_218_;
					}
					i_216_++;
				}
				i_198_++;
				i_202_ -= i_201_-- + i_201_;
				i_203_ -= i_201_ + i_201_;
			}
			i_200_ = i_193_;
			i_201_ = -i_201_;
			i_203_ = i_201_ * i_201_ + i_199_;
			i_202_ = i_203_ - i_200_;
			i_203_ -= i_201_;
			while (i_198_ < i_197_) {
				for (/**/; i_203_ > i_199_ && i_202_ > i_199_; i_202_ -= i_200_ + i_200_)
					i_203_ -= i_200_-- + i_200_;
				int i_219_ = i - i_200_;
				if (i_219_ < this.anInt4509)
					i_219_ = this.anInt4509;
				int i_220_ = i + i_200_;
				if (i_220_ > this.anInt4507 - 1)
					i_220_ = this.anInt4507 - 1;
				int i_221_ = i_219_ + i_198_ * this.anInt4505;
				for (int i_222_ = i_219_; i_222_ <= i_220_; i_222_++) {
					if ((float) i_192_ < this.aFloatArray4487[i_221_]) {
						int i_223_ = this.anIntArray4504[i_221_];
						i_223_ = (((i_223_ & 0xff00ff) * i_213_ >> 8 & 0xff00ff) + ((i_223_ & 0xff00) * i_213_ >> 8 & 0xff00));
						this.anIntArray4504[i_221_] = i_194_ + i_223_;
					}
					i_221_++;
				}
				i_198_++;
				i_203_ += i_201_ + i_201_;
				i_202_ += i_201_++ + i_201_;
			}
		} else if (i_195_ == 2) {
			while (i_198_ < i_191_) {
				for (/**/; i_203_ <= i_199_ || i_202_ <= i_199_; i_203_ += i_200_++ + i_200_)
					i_202_ += i_200_ + i_200_;
				int i_224_ = i - i_200_ + 1;
				if (i_224_ < this.anInt4509)
					i_224_ = this.anInt4509;
				int i_225_ = i + i_200_;
				if (i_225_ > this.anInt4507)
					i_225_ = this.anInt4507;
				int i_226_ = i_224_ + i_198_ * this.anInt4505;
				for (int i_227_ = i_224_; i_227_ < i_225_; i_227_++) {
					if ((float) i_192_ < this.aFloatArray4487[i_226_]) {
						int i_228_ = this.anIntArray4504[i_226_];
						int i_229_ = i_194_ + i_228_;
						int i_230_ = (i_194_ & 0xff00ff) + (i_228_ & 0xff00ff);
						i_228_ = (i_230_ & 0x1000100) + (i_229_ - i_230_ & 0x10000);
						this.anIntArray4504[i_226_] = i_229_ - i_228_ | i_228_ - (i_228_ >>> 8);
					}
					i_226_++;
				}
				i_198_++;
				i_202_ -= i_201_-- + i_201_;
				i_203_ -= i_201_ + i_201_;
			}
			i_200_ = i_193_;
			i_201_ = -i_201_;
			i_203_ = i_201_ * i_201_ + i_199_;
			i_202_ = i_203_ - i_200_;
			i_203_ -= i_201_;
			while (i_198_ < i_197_) {
				for (/**/; i_203_ > i_199_ && i_202_ > i_199_; i_202_ -= i_200_ + i_200_)
					i_203_ -= i_200_-- + i_200_;
				int i_231_ = i - i_200_;
				if (i_231_ < this.anInt4509)
					i_231_ = this.anInt4509;
				int i_232_ = i + i_200_;
				if (i_232_ > this.anInt4507 - 1)
					i_232_ = this.anInt4507 - 1;
				int i_233_ = i_231_ + i_198_ * this.anInt4505;
				for (int i_234_ = i_231_; i_234_ <= i_232_; i_234_++) {
					if ((float) i_192_ < this.aFloatArray4487[i_233_]) {
						int i_235_ = this.anIntArray4504[i_233_];
						int i_236_ = i_194_ + i_235_;
						int i_237_ = (i_194_ & 0xff00ff) + (i_235_ & 0xff00ff);
						i_235_ = (i_237_ & 0x1000100) + (i_236_ - i_237_ & 0x10000);
						this.anIntArray4504[i_233_] = i_236_ - i_235_ | i_235_ - (i_235_ >>> 8);
					}
					i_233_++;
				}
				i_198_++;
				i_203_ += i_201_ + i_201_;
				i_202_ += i_201_++ + i_201_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final Interface13 method1744(int i, int i_238_) {
		return new Class333(i, i_238_);
	}

	final void method1807(int i) {
		aClass235Array4483[i].method2889((byte) 34, Thread.currentThread());
	}

	final AbstractModel method1790(ModelDefinitions class178, int i, int i_239_, int i_240_, int i_241_) {
		return new Class146_Sub1(this, class178, i, i_240_, i_241_, i_239_);
	}

	final Class332 method1739(int i, int i_242_, boolean bool) {
		if (bool)
			return new Class332_Sub3_Sub1(this, i, i_242_);
		return new Class332_Sub3_Sub2(this, i, i_242_);
	}

	final void L(int i, int i_243_, int i_244_) {
		for (int i_245_ = 0; i_245_ < aClass235Array4483.length; i_245_++) {
			Class235 class235 = aClass235Array4483[i_245_];
			class235.anInt1763 = i & 0xffffff;
			int i_246_ = class235.anInt1763 >>> 16 & 0xff;
			if (i_246_ < 2)
				i_246_ = 2;
			int i_247_ = class235.anInt1763 >> 8 & 0xff;
			if (i_247_ < 2)
				i_247_ = 2;
			int i_248_ = class235.anInt1763 & 0xff;
			if (i_248_ < 2)
				i_248_ = 2;
			class235.anInt1763 = i_246_ << 16 | i_247_ << 8 | i_248_;
			if (i_243_ < 0)
				class235.aBoolean1758 = false;
			else
				class235.aBoolean1758 = true;
		}
	}

	final Class43 method1804(Class197 class197, Class324[] class324s, boolean bool) {
		int[] is = new int[class324s.length];
		int[] is_249_ = new int[class324s.length];
		boolean bool_250_ = false;
		for (int i = 0; i < class324s.length; i++) {
			is[i] = class324s[i].anInt2722;
			is_249_[i] = class324s[i].anInt2720;
			if (class324s[i].aByteArray2723 != null)
				bool_250_ = true;
		}
		if (bool) {
			if (bool_250_)
				return new Class43_Sub3(this, class197, class324s, is, is_249_);
			return new Class43_Sub5(this, class197, class324s, is, is_249_);
		}
		if (bool_250_)
			throw new IllegalArgumentException("");
		return new Class43_Sub4(this, class197, class324s, is, is_249_);
	}

	final void method1746(int i, int i_251_, int i_252_, int i_253_) {
		/* empty */
	}

	private final void method1917(int i, int i_254_, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_) {
		if (i >= this.anInt4509 && i < this.anInt4507) {
			int i_261_ = i + i_254_ * this.anInt4505;
			int i_262_ = i_256_ >>> 24;
			int i_263_ = i_258_ + i_259_;
			int i_264_ = i_260_ % i_263_;
			if (i_257_ == 0 || i_257_ == 1 && i_262_ == 255) {
				int i_265_ = 0;
				while (i_265_ < i_255_) {
					if (i_254_ + i_265_ >= this.anInt4495 && i_254_ + i_265_ < this.anInt4492 && i_264_ < i_258_)
						this.anIntArray4504[i_261_ + i_265_ * this.anInt4505] = i_256_;
					i_265_++;
					i_264_ = ++i_264_ % i_263_;
				}
			} else if (i_257_ == 1) {
				i_256_ = (((i_256_ & 0xff00ff) * i_262_ >> 8 & 0xff00ff) + ((i_256_ & 0xff00) * i_262_ >> 8 & 0xff00) + (i_262_ << 24));
				int i_266_ = 256 - i_262_;
				int i_267_ = 0;
				while (i_267_ < i_255_) {
					if (i_254_ + i_267_ >= this.anInt4495 && i_254_ + i_267_ < this.anInt4492 && i_264_ < i_258_) {
						int i_268_ = i_261_ + i_267_ * this.anInt4505;
						int i_269_ = this.anIntArray4504[i_268_];
						i_269_ = (((i_269_ & 0xff00ff) * i_266_ >> 8 & 0xff00ff) + ((i_269_ & 0xff00) * i_266_ >> 8 & 0xff00));
						this.anIntArray4504[i_268_] = i_256_ + i_269_;
					}
					i_267_++;
					i_264_ = ++i_264_ % i_263_;
				}
			} else if (i_257_ == 2) {
				int i_270_ = 0;
				while (i_270_ < i_255_) {
					if (i_254_ + i_270_ >= this.anInt4495 && i_254_ + i_270_ < this.anInt4492 && i_264_ < i_258_) {
						int i_271_ = i_261_ + i_270_ * this.anInt4505;
						int i_272_ = this.anIntArray4504[i_271_];
						int i_273_ = i_256_ + i_272_;
						int i_274_ = (i_256_ & 0xff00ff) + (i_272_ & 0xff00ff);
						i_272_ = (i_274_ & 0x1000100) + (i_273_ - i_274_ & 0x10000);
						this.anIntArray4504[i_271_] = i_273_ - i_272_ | i_272_ - (i_272_ >>> 8);
					}
					i_270_++;
					i_264_ = ++i_264_ % i_263_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void method1775(Class48 class48) {
		/* empty */
	}

	final void ya() {
		if (this.anInt4509 == 0 && this.anInt4507 == this.anInt4505 && this.anInt4495 == 0 && this.anInt4492 == anInt4480) {
			int i = this.aFloatArray4487.length;
			int i_275_ = i - (i & 0x7);
			int i_276_ = 0;
			while (i_276_ < i_275_) {
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
			}
			while (i_276_ < i)
				this.aFloatArray4487[i_276_++] = 2.14748365E9F;
		} else {
			int i = this.anInt4507 - this.anInt4509;
			int i_277_ = this.anInt4492 - this.anInt4495;
			int i_278_ = this.anInt4505 - i;
			int i_279_ = (this.anInt4509 + this.anInt4495 * this.anInt4505);
			int i_280_ = i >> 3;
			int i_281_ = i & 0x7;
			i = i_279_ - 1;
			for (int i_282_ = -i_277_; i_282_ < 0; i_282_++) {
				if (i_280_ > 0) {
					int i_283_ = i_280_;
					do {
						this.aFloatArray4487[++i] = 2.14748365E9F;
						this.aFloatArray4487[++i] = 2.14748365E9F;
						this.aFloatArray4487[++i] = 2.14748365E9F;
						this.aFloatArray4487[++i] = 2.14748365E9F;
						this.aFloatArray4487[++i] = 2.14748365E9F;
						this.aFloatArray4487[++i] = 2.14748365E9F;
						this.aFloatArray4487[++i] = 2.14748365E9F;
						this.aFloatArray4487[++i] = 2.14748365E9F;
					} while (--i_283_ > 0);
				}
				if (i_281_ > 0) {
					int i_284_ = i_281_;
					do
						this.aFloatArray4487[++i] = 2.14748365E9F;
					while (--i_284_ > 0);
				}
				i += i_278_;
			}
		}
	}

	final boolean method1771() {
		return false;
	}

	final boolean method1768() {
		return false;
	}

	final boolean method1918(int i) {
		return this.aD938.method8(-14, i);
	}

	final Class111 method1821() {
		return new Class111_Sub2();
	}

	final void f(int i, int i_285_) {
		Class235 class235 = method1921(Thread.currentThread());
		this.anInt4502 = i;
		this.anInt4484 = i_285_;
		class235.anInt1761 = this.anInt4484 - 255;
	}

	final void C(boolean bool) {
		Class235 class235 = method1921(Thread.currentThread());
		class235.aBoolean1762 = bool;
	}

	final void A(int i, aa var_aa, int i_286_, int i_287_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is = var_aa_Sub1.anIntArray3555;
		int[] is_288_ = var_aa_Sub1.anIntArray3557;
		int i_289_;
		if (this.anInt4492 < i_287_ + is.length)
			i_289_ = this.anInt4492 - i_287_;
		else
			i_289_ = is.length;
		int i_290_;
		if (this.anInt4495 > i_287_) {
			i_290_ = this.anInt4495 - i_287_;
			i_287_ = this.anInt4495;
		} else
			i_290_ = 0;
		if (i_289_ - i_290_ > 0) {
			int i_291_ = i_287_ * this.anInt4505;
			for (int i_292_ = i_290_; i_292_ < i_289_; i_292_++) {
				int i_293_ = i_286_ + is[i_292_];
				int i_294_ = is_288_[i_292_];
				if (this.anInt4509 > i_293_) {
					i_294_ -= this.anInt4509 - i_293_;
					i_293_ = this.anInt4509;
				}
				if (this.anInt4507 < i_293_ + i_294_)
					i_294_ = this.anInt4507 - i_293_;
				i_293_ += i_291_;
				for (int i_295_ = -i_294_; i_295_ < 0; i_295_++)
					this.anIntArray4504[i_293_++] = i;
				i_291_ += this.anInt4505;
			}
		}
	}

	final boolean method1823() {
		return false;
	}

	final void K(int[] is) {
		is[0] = this.anInt4509;
		is[1] = this.anInt4495;
		is[2] = this.anInt4507;
		is[3] = this.anInt4492;
	}

	final Class111 method1793() {
		Class235 class235 = method1921(Thread.currentThread());
		return class235.aClass111_Sub2_1760;
	}

	final void method1776() {
		if (aCanvas4479 != null) {
			this.anIntArray4504 = (this.aClass98_Sub32_4478.anIntArray4108);
			this.anInt4505 = (this.aClass98_Sub32_4478.anInt4105);
			anInt4480 = (this.aClass98_Sub32_4478.anInt4110);
			this.aFloatArray4487 = this.aFloatArray4488;
			anInt4512 = anInt4496;
			anInt4485 = anInt4503;
		} else {
			this.anInt4505 = 1;
			anInt4480 = 1;
			this.anIntArray4504 = null;
			anInt4512 = 1;
			anInt4485 = 1;
			this.aFloatArray4487 = null;
		}
		aClass186_4499 = null;
		method1911();
	}

	final Class62 method1799() {
		return new Class62(0, "Pure Java", 1, "CPU", 0L);
	}

	final int[] Y() {
		return (new int[] { this.anInt4510, this.anInt4511, this.anInt4514, this.anInt4490 });
	}

	final boolean method1747() {
		return true;
	}

	final void pa() {
		for (int i = 0; i < aClass235Array4483.length; i++) {
			aClass235Array4483[i].anInt1763 = aClass235Array4483[i].anInt1755;
			aClass235Array4483[i].aBoolean1759 = false;
		}
	}

	final void X(int i) {
		/* empty */
	}

	final void method1741(Canvas canvas, int i, int i_296_) {
		Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476.method3990(canvas.hashCode(), -1));
		if (class98_sub32 == null) {
			class98_sub32 = Class64_Sub23.method646(i_296_, i, canvas, (byte) -128);
			aClass377_4476.method3996(class98_sub32, canvas.hashCode(), -1);
		} else if (class98_sub32.anInt4105 != i || class98_sub32.anInt4110 != i_296_)
			method1782(canvas, i, i_296_);
	}

	final za method1762(int i) {
		return null;
	}

	final int E() {
		return 0;
	}

	final s a(int i, int i_297_, int[][] is, int[][] is_298_, int i_299_, int i_300_, int i_301_) {
		return new s_Sub3(this, i_300_, i_301_, i, i_297_, is, is_298_, i_299_);
	}

	final int[] method1919(int i) {
		Class98_Sub2 class98_sub2;
		synchronized (aClass79_4494) {
			class98_sub2 = (Class98_Sub2) aClass79_4494.get(i);
			if (class98_sub2 == null) {
				if (!this.aD938.method8(71, i))
					return null;
				Class238 class238 = this.aD938.method11(i, -28755);
				int i_302_ = (class238.aBoolean1822 || aBoolean4491 ? 64 : this.anInt4482);
				class98_sub2 = new Class98_Sub2(i, i_302_, this.aD938.method9(i, (byte) -125, i_302_, 0.7F, true, i_302_), class238.anInt1818 != 1);
				aClass79_4494.put(i, class98_sub2);
			}
		}
		class98_sub2.aBoolean3817 = true;
		return class98_sub2.method948();
	}

	final boolean method1920() {
		return aBoolean4472;
	}

	final void method1750(Canvas canvas) {
		if (canvas != null) {
			Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476.method3990(canvas.hashCode(), -1));
			if (class98_sub32 != null) {
				aCanvas4479 = canvas;
				Dimension dimension = canvas.getSize();
				anInt4474 = dimension.width;
				anInt4477 = dimension.height;
				this.aClass98_Sub32_4478 = class98_sub32;
				if (aClass186_4499 == null) {
					this.anIntArray4504 = class98_sub32.anIntArray4108;
					this.anInt4505 = class98_sub32.anInt4105;
					anInt4480 = class98_sub32.anInt4110;
					if (this.anInt4505 != anInt4512 || anInt4480 != anInt4485) {
						anInt4496 = anInt4512 = this.anInt4505;
						anInt4503 = anInt4485 = anInt4480;
						this.aFloatArray4488 = this.aFloatArray4487 = new float[anInt4512 * anInt4485];
					}
					method1911();
				}
			}
		} else {
			aCanvas4479 = null;
			this.aClass98_Sub32_4478 = null;
			if (aClass186_4499 == null) {
				this.anIntArray4504 = null;
				this.anInt4505 = anInt4480 = 1;
				anInt4512 = anInt4485 = 1;
				method1911();
			}
		}
	}

	final void method1761(boolean bool) {
		/* empty */
	}

	final void method1817() {
		/* empty */
	}

	final Class235 method1921(Runnable runnable) {
		for (int i = 0; i < this.anInt4508; i++) {
			if (aClass235Array4483[i].aRunnable1752 == runnable)
				return aClass235Array4483[i];
		}
		return null;
	}

	final int JA(int i, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_) {
		int i_308_ = 0;
		float f = ((this.aClass111_Sub2_4513.aFloat4693) * (float) i + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_303_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_304_ + (this.aClass111_Sub2_4513.aFloat4689));
		if (f < 1.0F)
			f = 1.0F;
		float f_309_ = ((this.aClass111_Sub2_4513.aFloat4693) * (float) i_305_ + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_306_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_307_ + (this.aClass111_Sub2_4513.aFloat4689));
		if (f_309_ < 1.0F)
			f_309_ = 1.0F;
		if (f < (float) this.anInt4502 && f_309_ < (float) this.anInt4502)
			i_308_ |= 0x10;
		else if (f > (float) this.anInt4484 && f_309_ > (float) this.anInt4484)
			i_308_ |= 0x20;
		int i_310_ = (int) ((float) this.anInt4514 * ((this.aClass111_Sub2_4513.aFloat4700) * (float) i + (this.aClass111_Sub2_4513.aFloat4699 * (float) i_303_) + (this.aClass111_Sub2_4513.aFloat4690 * (float) i_304_) + this.aClass111_Sub2_4513.aFloat4697) / f);
		int i_311_ = (int) ((float) this.anInt4514 * ((this.aClass111_Sub2_4513.aFloat4700) * (float) i_305_ + (this.aClass111_Sub2_4513.aFloat4699 * (float) i_306_) + (this.aClass111_Sub2_4513.aFloat4690 * (float) i_307_) + this.aClass111_Sub2_4513.aFloat4697) / f_309_);
		if (i_310_ < this.anInt4486 && i_311_ < this.anInt4486)
			i_308_ |= 0x1;
		else if (i_310_ > this.anInt4517 && i_311_ > this.anInt4517)
			i_308_ |= 0x2;
		int i_312_ = (int) ((float) this.anInt4490 * ((this.aClass111_Sub2_4513.aFloat4692) * (float) i + (this.aClass111_Sub2_4513.aFloat4688 * (float) i_303_) + (this.aClass111_Sub2_4513.aFloat4696 * (float) i_304_) + this.aClass111_Sub2_4513.aFloat4691) / f);
		int i_313_ = (int) ((float) this.anInt4490 * ((this.aClass111_Sub2_4513.aFloat4692) * (float) i_305_ + (this.aClass111_Sub2_4513.aFloat4688 * (float) i_306_) + (this.aClass111_Sub2_4513.aFloat4696 * (float) i_307_) + this.aClass111_Sub2_4513.aFloat4691) / f_309_);
		if (i_312_ < this.anInt4518 && i_313_ < this.anInt4518)
			i_308_ |= 0x4;
		else if (i_312_ > this.anInt4506 && i_313_ > this.anInt4506)
			i_308_ |= 0x8;
		return i_308_;
	}

	final void a(Class111 class111) {
		this.aClass111_Sub2_4513 = (Class111_Sub2) class111;
	}

	final boolean method1922(int i) {
		if (!this.aD938.method11(i, -28755).aBoolean1826 && !(this.aD938.method11(i, -28755).aBoolean1819))
			return false;
		return true;
	}

	final Class48 method1769(Class48 class48, Class48 class48_314_, float f, Class48 class48_315_) {
		return null;
	}

	final void T(int i, int i_316_, int i_317_, int i_318_) {
		if (this.anInt4509 < i)
			this.anInt4509 = i;
		if (this.anInt4495 < i_316_)
			this.anInt4495 = i_316_;
		if (this.anInt4507 > i_317_)
			this.anInt4507 = i_317_;
		if (this.anInt4492 > i_318_)
			this.anInt4492 = i_318_;
		method1913();
	}

	final void method1811(int i, int i_319_, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_) {
		i_320_ -= i;
		i_321_ -= i_319_;
		if (i_321_ == 0) {
			if (i_320_ >= 0)
				method1924(i, i_319_, i_320_ + 1, i_322_, i_323_, i_324_, i_325_, i_326_);
			else {
				int i_327_ = i_324_ + i_325_;
				i_326_ %= i_327_;
				i_326_ = i_327_ + i_324_ - i_326_ - (-i_320_ + 1) % i_327_;
				i_326_ %= i_327_;
				if (i_326_ < 0)
					i_326_ += i_327_;
				method1924(i + i_320_, i_319_, -i_320_ + 1, i_322_, i_323_, i_324_, i_325_, i_326_);
			}
		} else if (i_320_ == 0) {
			if (i_321_ >= 0)
				method1917(i, i_319_, i_321_ + 1, i_322_, i_323_, i_324_, i_325_, i_326_);
			else {
				int i_328_ = i_324_ + i_325_;
				i_326_ %= i_328_;
				i_326_ = i_328_ + i_324_ - i_326_ - (-i_321_ + 1) % i_328_;
				i_326_ %= i_328_;
				if (i_326_ < 0)
					i_326_ += i_328_;
				method1917(i, i_319_ + i_321_, -i_321_ + 1, i_322_, i_323_, i_324_, i_325_, i_326_);
			}
		} else {
			i_326_ <<= 8;
			i_324_ <<= 8;
			i_325_ <<= 8;
			int i_329_ = i_324_ + i_325_;
			i_326_ %= i_329_;
			if (i_320_ + i_321_ < 0) {
				int i_330_ = (int) (Math.sqrt(i_320_ * i_320_ + i_321_ * i_321_) * 256.0);
				int i_331_ = i_330_ % i_329_;
				i_326_ = i_329_ + i_324_ - i_326_ - i_331_;
				i_326_ %= i_329_;
				if (i_326_ < 0)
					i_326_ += i_329_;
				i += i_320_;
				i_320_ = -i_320_;
				i_319_ += i_321_;
				i_321_ = -i_321_;
			}
			if (i_320_ > i_321_) {
				i_319_ <<= 16;
				i_319_ += 32768;
				i_321_ <<= 16;
				int i_332_ = (int) Math.floor((double) i_321_ / (double) i_320_ + 0.5);
				i_320_ += i;
				int i_333_ = i_322_ >>> 24;
				int i_334_ = (int) Math.sqrt(65536 + (i_332_ >> 8) * (i_332_ >> 8));
				if (i_323_ == 0 || i_323_ == 1 && i_333_ == 255) {
					while (i <= i_320_) {
						int i_335_ = i_319_ >> 16;
						if (i >= this.anInt4509 && i < this.anInt4507 && i_335_ >= this.anInt4495 && i_335_ < this.anInt4492 && i_326_ < i_324_)
							this.anIntArray4504[i + i_335_ * this.anInt4505] = i_322_;
						i_319_ += i_332_;
						i++;
						i_326_ += i_334_;
						i_326_ %= i_329_;
					}
					return;
				}
				if (i_323_ == 1) {
					i_322_ = (((i_322_ & 0xff00ff) * i_333_ >> 8 & 0xff00ff) + ((i_322_ & 0xff00) * i_333_ >> 8 & 0xff00) + (i_333_ << 24));
					int i_336_ = 256 - i_333_;
					while (i <= i_320_) {
						int i_337_ = i_319_ >> 16;
						if (i >= this.anInt4509 && i < this.anInt4507 && i_337_ >= this.anInt4495 && i_337_ < this.anInt4492 && i_326_ < i_324_) {
							int i_338_ = i + i_337_ * this.anInt4505;
							int i_339_ = this.anIntArray4504[i_338_];
							i_339_ = (((i_339_ & 0xff00ff) * i_336_ >> 8 & 0xff00ff) + ((i_339_ & 0xff00) * i_336_ >> 8 & 0xff00));
							this.anIntArray4504[i_338_] = i_322_ + i_339_;
						}
						i_319_ += i_332_;
						i++;
						i_326_ += i_334_;
						i_326_ %= i_329_;
					}
					return;
				}
				if (i_323_ == 2) {
					while (i <= i_320_) {
						int i_340_ = i_319_ >> 16;
						if (i >= this.anInt4509 && i < this.anInt4507 && i_340_ >= this.anInt4495 && i_340_ < this.anInt4492 && i_326_ < i_324_) {
							int i_341_ = i + i_340_ * this.anInt4505;
							int i_342_ = this.anIntArray4504[i_341_];
							int i_343_ = i_322_ + i_342_;
							int i_344_ = (i_322_ & 0xff00ff) + (i_342_ & 0xff00ff);
							i_342_ = (i_344_ & 0x1000100) + (i_343_ - i_344_ & 0x10000);
							this.anIntArray4504[i_341_] = i_343_ - i_342_ | i_342_ - (i_342_ >>> 8);
						}
						i_319_ += i_332_;
						i++;
						i_326_ += i_334_;
						i_326_ %= i_329_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_320_ <<= 16;
			int i_345_ = (int) Math.floor((double) i_320_ / (double) i_321_ + 0.5);
			i_321_ += i_319_;
			int i_346_ = i_322_ >>> 24;
			int i_347_ = (int) Math.sqrt(65536 + (i_345_ >> 8) * (i_345_ >> 8));
			if (i_323_ == 0 || i_323_ == 1 && i_346_ == 255) {
				while (i_319_ <= i_321_) {
					int i_348_ = i >> 16;
					if (i_319_ >= this.anInt4495 && i_319_ < this.anInt4492 && i_348_ >= this.anInt4509 && i_348_ < this.anInt4507 && i_326_ < i_324_)
						this.anIntArray4504[i_348_ + i_319_ * this.anInt4505] = i_322_;
					i += i_345_;
					i_319_++;
					i_326_ += i_347_;
					i_326_ %= i_329_;
				}
			} else if (i_323_ == 1) {
				i_322_ = (((i_322_ & 0xff00ff) * i_346_ >> 8 & 0xff00ff) + ((i_322_ & 0xff00) * i_346_ >> 8 & 0xff00) + (i_346_ << 24));
				int i_349_ = 256 - i_346_;
				while (i_319_ <= i_321_) {
					int i_350_ = i >> 16;
					if (i_319_ >= this.anInt4495 && i_319_ < this.anInt4492 && i_350_ >= this.anInt4509 && i_350_ < this.anInt4507 && i_326_ < i_324_) {
						int i_351_ = i_350_ + i_319_ * this.anInt4505;
						int i_352_ = this.anIntArray4504[i_351_];
						i_352_ = (((i_352_ & 0xff00ff) * i_349_ >> 8 & 0xff00ff) + ((i_352_ & 0xff00) * i_349_ >> 8 & 0xff00));
						this.anIntArray4504[i_350_ + i_319_ * this.anInt4505] = i_322_ + i_352_;
					}
					i += i_345_;
					i_319_++;
					i_326_ += i_347_;
					i_326_ %= i_329_;
				}
			} else if (i_323_ == 2) {
				while (i_319_ <= i_321_) {
					int i_353_ = i >> 16;
					if (i_319_ >= this.anInt4495 && i_319_ < this.anInt4492 && i_353_ >= this.anInt4509 && i_353_ < this.anInt4507 && i_326_ < i_324_) {
						int i_354_ = i_353_ + i_319_ * this.anInt4505;
						int i_355_ = this.anIntArray4504[i_354_];
						int i_356_ = i_322_ + i_355_;
						int i_357_ = (i_322_ & 0xff00ff) + (i_355_ & 0xff00ff);
						i_355_ = (i_357_ & 0x1000100) + (i_356_ - i_357_ & 0x10000);
						this.anIntArray4504[i_354_] = i_356_ - i_355_ | i_355_ - (i_355_ >>> 8);
					}
					i += i_345_;
					i_319_++;
					i_326_ += i_347_;
					i_326_ %= i_329_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void method1923(int i, int i_358_, int i_359_, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_, int i_365_, int i_366_) {
		if (i_360_ != 0 && i_361_ != 0) {
			if (i_363_ != 65535 && !(this.aD938.method11(i_363_, -28755).aBoolean1825)) {
				if (anInt4520 != i_363_) {
					Class332 class332 = ((Class332) aClass79_4497.get(i_363_));
					if (class332 == null) {
						int[] is = method1915(i_363_);
						if (is == null)
							return;
						int i_367_ = (method1925(i_363_) ? 64 : this.anInt4482);
						class332 = this.method1748(-7962, 0, i_367_, i_367_, is, i_367_);
						aClass79_4497.put(i_363_, class332);
					}
					anInt4520 = i_363_;
					aClass332_4519 = class332;
				}
				((Class332_Sub3) aClass332_4519).method3757(i - i_360_, i_358_ - i_361_, i_359_, i_360_ << 1, i_361_ << 1, i_365_, i_364_, i_366_, 1);
			} else
				method1916(i, i_358_, i_359_, i_360_, i_364_, i_366_);
		}
	}

	private final void method1924(int i, int i_368_, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_, int i_374_) {
		if (i_368_ >= this.anInt4495 && i_368_ < this.anInt4492) {
			int i_375_ = i + i_368_ * this.anInt4505;
			int i_376_ = i_370_ >>> 24;
			int i_377_ = i_372_ + i_373_;
			int i_378_ = i_374_ % i_377_;
			if (i_371_ == 0 || i_371_ == 1 && i_376_ == 255) {
				int i_379_ = 0;
				while (i_379_ < i_369_) {
					if (i + i_379_ >= this.anInt4509 && i + i_379_ < this.anInt4507 && i_378_ < i_372_)
						this.anIntArray4504[i_375_ + i_379_] = i_370_;
					i_379_++;
					i_378_ = ++i_378_ % i_377_;
				}
			} else if (i_371_ == 1) {
				i_370_ = (((i_370_ & 0xff00ff) * i_376_ >> 8 & 0xff00ff) + ((i_370_ & 0xff00) * i_376_ >> 8 & 0xff00) + (i_376_ << 24));
				int i_380_ = 256 - i_376_;
				int i_381_ = 0;
				while (i_381_ < i_369_) {
					if (i + i_381_ >= this.anInt4509 && i + i_381_ < this.anInt4507 && i_378_ < i_372_) {
						int i_382_ = this.anIntArray4504[i_375_ + i_381_];
						i_382_ = (((i_382_ & 0xff00ff) * i_380_ >> 8 & 0xff00ff) + ((i_382_ & 0xff00) * i_380_ >> 8 & 0xff00));
						this.anIntArray4504[i_375_ + i_381_] = i_370_ + i_382_;
					}
					i_381_++;
					i_378_ = ++i_378_ % i_377_;
				}
			} else if (i_371_ == 2) {
				int i_383_ = 0;
				while (i_383_ < i_369_) {
					if (i + i_383_ >= this.anInt4509 && i + i_383_ < this.anInt4507 && i_378_ < i_372_) {
						int i_384_ = this.anIntArray4504[i_375_ + i_383_];
						int i_385_ = i_370_ + i_384_;
						int i_386_ = (i_370_ & 0xff00ff) + (i_384_ & 0xff00ff);
						i_384_ = (i_386_ & 0x1000100) + (i_385_ - i_386_ & 0x10000);
						this.anIntArray4504[i_375_ + i_383_] = i_385_ - i_384_ | i_384_ - (i_384_ >>> 8);
					}
					i_383_++;
					i_378_ = ++i_378_ % i_377_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void EA(int i, int i_387_, int i_388_, int i_389_) {
		Class235 class235 = method1921(Thread.currentThread());
		class235.anInt1754 = i;
		class235.anInt1763 = i_387_;
		class235.anInt1757 = i_388_;
	}

	final void a(int i, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, aa var_aa, int i_395_, int i_396_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is = var_aa_Sub1.anIntArray3555;
		int[] is_397_ = var_aa_Sub1.anIntArray3557;
		int i_398_ = (this.anInt4495 > i_396_ ? this.anInt4495 : i_396_);
		int i_399_ = (this.anInt4492 < i_396_ + is.length ? this.anInt4492 : i_396_ + is.length);
		i_391_ -= i;
		i_392_ -= i_390_;
		if (i_391_ + i_392_ < 0) {
			i += i_391_;
			i_391_ = -i_391_;
			i_390_ += i_392_;
			i_392_ = -i_392_;
		}
		if (i_391_ > i_392_) {
			i_390_ <<= 16;
			i_390_ += 32768;
			i_392_ <<= 16;
			int i_400_ = (int) Math.floor((double) i_392_ / (double) i_391_ + 0.5);
			i_391_ += i;
			if (i < this.anInt4509) {
				i_390_ += i_400_ * (this.anInt4509 - i);
				i = this.anInt4509;
			}
			if (i_391_ >= this.anInt4507)
				i_391_ = this.anInt4507 - 1;
			int i_401_ = i_393_ >>> 24;
			if (i_394_ == 0 || i_394_ == 1 && i_401_ == 255) {
				for (/**/; i <= i_391_; i++) {
					int i_402_ = i_390_ >> 16;
					int i_403_ = i_402_ - i_396_;
					if (i_402_ >= i_398_ && i_402_ < i_399_) {
						int i_404_ = i_395_ + is[i_403_];
						if (i >= i_404_ && i < i_404_ + is_397_[i_403_])
							this.anIntArray4504[i + i_402_ * this.anInt4505] = i_393_;
					}
					i_390_ += i_400_;
				}
				return;
			}
			if (i_394_ == 1) {
				i_393_ = (((i_393_ & 0xff00ff) * i_401_ >> 8 & 0xff00ff) + ((i_393_ & 0xff00) * i_401_ >> 8 & 0xff00) + (i_401_ << 24));
				int i_405_ = 256 - i_401_;
				for (/**/; i <= i_391_; i++) {
					int i_406_ = i_390_ >> 16;
					int i_407_ = i_406_ - i_396_;
					if (i_406_ >= i_398_ && i_406_ < i_399_) {
						int i_408_ = i_395_ + is[i_407_];
						if (i >= i_408_ && i < i_408_ + is_397_[i_407_]) {
							int i_409_ = i + i_406_ * this.anInt4505;
							int i_410_ = this.anIntArray4504[i_409_];
							i_410_ = (((i_410_ & 0xff00ff) * i_405_ >> 8 & 0xff00ff) + ((i_410_ & 0xff00) * i_405_ >> 8 & 0xff00));
							this.anIntArray4504[i_409_] = i_393_ + i_410_;
						}
					}
					i_390_ += i_400_;
				}
				return;
			}
			if (i_394_ == 2) {
				for (/**/; i <= i_391_; i++) {
					int i_411_ = i_390_ >> 16;
					int i_412_ = i_411_ - i_396_;
					if (i_411_ >= i_398_ && i_411_ < i_399_) {
						int i_413_ = i_395_ + is[i_412_];
						if (i >= i_413_ && i < i_413_ + is_397_[i_412_]) {
							int i_414_ = i + i_411_ * this.anInt4505;
							int i_415_ = this.anIntArray4504[i_414_];
							int i_416_ = i_393_ + i_415_;
							int i_417_ = (i_393_ & 0xff00ff) + (i_415_ & 0xff00ff);
							i_415_ = (i_417_ & 0x1000100) + (i_416_ - i_417_ & 0x10000);
							this.anIntArray4504[i_414_] = i_416_ - i_415_ | i_415_ - (i_415_ >>> 8);
						}
					}
					i_390_ += i_400_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_391_ <<= 16;
		int i_418_ = (int) Math.floor((double) i_391_ / (double) i_392_ + 0.5);
		i_392_ += i_390_;
		if (i_390_ < i_398_) {
			i += i_418_ * (i_398_ - i_390_);
			i_390_ = i_398_;
		}
		if (i_392_ >= i_399_)
			i_392_ = i_399_ - 1;
		int i_419_ = i_393_ >>> 24;
		if (i_394_ == 0 || i_394_ == 1 && i_419_ == 255) {
			for (/**/; i_390_ <= i_392_; i_390_++) {
				int i_420_ = i >> 16;
				int i_421_ = i_390_ - i_396_;
				int i_422_ = i_395_ + is[i_421_];
				if (i_420_ >= this.anInt4509 && i_420_ < this.anInt4507 && i_420_ >= i_422_ && i_420_ < i_422_ + is_397_[i_421_])
					this.anIntArray4504[i_420_ + i_390_ * this.anInt4505] = i_393_;
				i += i_418_;
			}
		} else if (i_394_ == 1) {
			i_393_ = (((i_393_ & 0xff00ff) * i_419_ >> 8 & 0xff00ff) + ((i_393_ & 0xff00) * i_419_ >> 8 & 0xff00) + (i_419_ << 24));
			int i_423_ = 256 - i_419_;
			for (/**/; i_390_ <= i_392_; i_390_++) {
				int i_424_ = i >> 16;
				int i_425_ = i_390_ - i_396_;
				int i_426_ = i_395_ + is[i_425_];
				if (i_424_ >= this.anInt4509 && i_424_ < this.anInt4507 && i_424_ >= i_426_ && i_424_ < i_426_ + is_397_[i_425_]) {
					int i_427_ = i_424_ + i_390_ * this.anInt4505;
					int i_428_ = this.anIntArray4504[i_427_];
					i_428_ = (((i_428_ & 0xff00ff) * i_423_ >> 8 & 0xff00ff) + ((i_428_ & 0xff00) * i_423_ >> 8 & 0xff00));
					this.anIntArray4504[i_424_ + i_390_ * this.anInt4505] = i_393_ + i_428_;
				}
				i += i_418_;
			}
		} else if (i_394_ == 2) {
			for (/**/; i_390_ <= i_392_; i_390_++) {
				int i_429_ = i >> 16;
				int i_430_ = i_390_ - i_396_;
				int i_431_ = i_395_ + is[i_430_];
				if (i_429_ >= this.anInt4509 && i_429_ < this.anInt4507 && i_429_ >= i_431_ && i_429_ < i_431_ + is_397_[i_430_]) {
					int i_432_ = i_429_ + i_390_ * this.anInt4505;
					int i_433_ = this.anIntArray4504[i_432_];
					int i_434_ = i_393_ + i_433_;
					int i_435_ = (i_393_ & 0xff00ff) + (i_433_ & 0xff00ff);
					i_433_ = (i_435_ & 0x1000100) + (i_434_ - i_435_ & 0x10000);
					this.anIntArray4504[i_432_] = i_434_ - i_433_ | i_433_ - (i_433_ >>> 8);
				}
				i += i_418_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final boolean method1925(int i) {
		if (aBoolean4491 || this.aD938.method11(i, -28755).aBoolean1822)
			return true;
		return false;
	}

	final int XA() {
		return this.anInt4484;
	}

	final void method1785(Class242 class242, int i) {
		Class235 class235 = method1921(Thread.currentThread());
		Class246_Sub4 class246_sub4 = (class242.aClass358_1850.aClass246_Sub4_3028);
		for (Class246_Sub4 class246_sub4_436_ = class246_sub4.aClass246_Sub4_5091; class246_sub4_436_ != class246_sub4; class246_sub4_436_ = class246_sub4_436_.aClass246_Sub4_5091) {
			Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_436_;
			int i_437_ = class246_sub4_sub2.anInt6176 >> 12;
			int i_438_ = class246_sub4_sub2.anInt6177 >> 12;
			int i_439_ = class246_sub4_sub2.anInt6175 >> 12;
			float f = ((this.aClass111_Sub2_4513.aFloat4689) + ((this.aClass111_Sub2_4513.aFloat4693) * (float) i_437_ + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_438_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_439_));
			if (!(f < (float) this.anInt4502) && !(f > (float) class235.anInt1761)) {
				int i_440_ = (this.anInt4510 + (int) ((float) this.anInt4514 * ((this.aClass111_Sub2_4513.aFloat4697) + ((this.aClass111_Sub2_4513.aFloat4700) * (float) i_437_ + (this.aClass111_Sub2_4513.aFloat4699) * (float) i_438_ + (this.aClass111_Sub2_4513.aFloat4690) * (float) i_439_)) / (float) i));
				int i_441_ = (this.anInt4511 + (int) ((float) this.anInt4490 * ((this.aClass111_Sub2_4513.aFloat4691) + ((this.aClass111_Sub2_4513.aFloat4692) * (float) i_437_ + (this.aClass111_Sub2_4513.aFloat4688) * (float) i_438_ + (this.aClass111_Sub2_4513.aFloat4696) * (float) i_439_)) / (float) i));
				if (i_440_ >= this.anInt4509 && i_440_ <= this.anInt4507 && i_441_ >= this.anInt4495 && i_441_ <= this.anInt4492) {
					if (f == 0.0F)
						f = 1.0F;
					method1914(class246_sub4_sub2, i_440_, i_441_, (int) f, ((class246_sub4_sub2.anInt6179) * this.anInt4514 >> 12) / i);
				}
			}
		}
	}

	final int[] na(int i, int i_442_, int i_443_, int i_444_) {
		int[] is = new int[i_443_ * i_444_];
		int i_445_ = 0;
		for (int i_446_ = 0; i_446_ < i_444_; i_446_++) {
			int i_447_ = (i_442_ + i_446_) * this.anInt4505 + i;
			for (int i_448_ = 0; i_448_ < i_443_; i_448_++)
				is[i_445_++] = this.anIntArray4504[i_447_ + i_448_];
		}
		return is;
	}

	final void b(int i, int i_449_, int i_450_, int i_451_, double d) {
		int i_452_ = anInt4512 - i_450_;
		int i_453_ = i_449_ * anInt4512 + i;
		float[] fs = this.aFloatArray4487;
		int i_454_ = 0;
		while (i_454_ < i_451_) {
			int i_455_ = 0;
			while (i_455_ < i_450_) {
				float f = fs[i_453_];
				if (f != 2.14748365E9F)
					fs[i_453_] = (float) ((double) f + d);
				i_455_++;
				i_453_++;
			}
			i_454_++;
			i_453_ += i_452_;
		}
	}

	final Class332 method1797(int i, int i_456_, int i_457_, int i_458_, boolean bool) {
		int[] is = new int[i_457_ * i_458_];
		int i_459_ = i_456_ * this.anInt4505 + i;
		int i_460_ = this.anInt4505 - i_457_;
		for (int i_461_ = 0; i_461_ < i_458_; i_461_++) {
			int i_462_ = i_461_ * i_457_;
			for (int i_463_ = 0; i_463_ < i_457_; i_463_++)
				is[i_462_ + i_463_] = this.anIntArray4504[i_459_++];
			i_459_ += i_460_;
		}
		if (bool)
			return new Class332_Sub3_Sub1(this, is, i_457_, i_458_);
		return new Class332_Sub3_Sub2(this, is, i_457_, i_458_);
	}

	final void la() {
		this.anInt4509 = 0;
		this.anInt4495 = 0;
		this.anInt4507 = this.anInt4505;
		this.anInt4492 = anInt4480;
		method1913();
	}

	final int method1926(int i) {
		return (this.aD938.method11(i, -28755).aShort1831 & 0xffff);
	}

	final void GA(int i) {
		aa(0, 0, this.anInt4505, anInt4480, i, 0);
	}

	final boolean method1810() {
		return true;
	}

	final int i() {
		return this.anInt4502;
	}

	final void KA(int i, int i_464_, int i_465_, int i_466_) {
		if (i < 0)
			i = 0;
		if (i_464_ < 0)
			i_464_ = 0;
		if (i_465_ > this.anInt4505)
			i_465_ = this.anInt4505;
		if (i_466_ > anInt4480)
			i_466_ = anInt4480;
		this.anInt4509 = i;
		this.anInt4507 = i_465_;
		this.anInt4495 = i_464_;
		this.anInt4492 = i_466_;
		method1913();
	}

	final Class111 method1752() {
		return this.aClass111_Sub2_4513;
	}

	final void a(Rectangle[] rectangles, int i, int i_467_, int i_468_) throws Exception_Sub1 {
		if (aCanvas4479 == null || this.aClass98_Sub32_4478 == null)
			throw new IllegalStateException("off");
		try {
			Graphics graphics = aCanvas4479.getGraphics();
			for (int i_469_ = 0; i_469_ < i; i_469_++) {
				Rectangle rectangle = rectangles[i_469_];
				if (rectangle.x + i_467_ <= this.anInt4505 && rectangle.y + i_468_ <= anInt4480 && rectangle.x + i_467_ + rectangle.width > 0 && rectangle.y + i_468_ + rectangle.height > 0)
					this.aClass98_Sub32_4478.method1434(graphics, rectangle.x, (byte) -125, rectangle.x + i_467_, rectangle.width, rectangle.y + i_468_, rectangle.height, rectangle.y);
			}
		} catch (Exception exception) {
			aCanvas4479.repaint();
		}
	}

	final void method1774(int i) {
		aClass235Array4483[i].method2889((byte) 34, null);
	}

	final void method1751(int i, int i_470_, int i_471_, int i_472_, int i_473_, int i_474_, int i_475_, int i_476_, int i_477_, int i_478_, int i_479_, int i_480_, int i_481_) {
		Class235 class235 = method1921(Thread.currentThread());
		Class12 class12 = class235.aClass12_1767;
		class12.aBoolean134 = false;
		i -= this.anInt4486;
		i_472_ -= this.anInt4486;
		i_475_ -= this.anInt4486;
		i_470_ -= this.anInt4518;
		i_473_ -= this.anInt4518;
		i_476_ -= this.anInt4518;
		class12.aBoolean135 = (i < 0 || i > class12.anInt141 || i_472_ < 0 || i_472_ > class12.anInt141 || i_475_ < 0 || i_475_ > class12.anInt141);
		int i_482_ = i_478_ >>> 24;
		if (i_481_ == 0 || i_481_ == 1 && i_482_ == 255) {
			class12.anInt137 = 0;
			class12.aBoolean130 = false;
			class12.method206((float) i_470_, (float) i_473_, (float) i_476_, (float) i, (float) i_472_, (float) i_475_, (float) i_471_, (float) i_474_, (float) i_477_, i_478_, i_479_, i_480_);
		} else if (i_481_ == 1) {
			class12.anInt137 = 255 - i_482_;
			class12.aBoolean130 = false;
			class12.method206((float) i_470_, (float) i_473_, (float) i_476_, (float) i, (float) i_472_, (float) i_475_, (float) i_471_, (float) i_474_, (float) i_477_, i_478_, i_479_, i_480_);
		} else if (i_481_ == 2) {
			class12.anInt137 = 128;
			class12.aBoolean130 = true;
			class12.method206((float) i_470_, (float) i_473_, (float) i_476_, (float) i, (float) i_472_, (float) i_475_, (float) i_471_, (float) i_474_, (float) i_477_, i_478_, i_479_, i_480_);
		} else
			throw new IllegalArgumentException();
		class12.aBoolean134 = true;
	}

	final void method1779(int i, int i_483_, int i_484_, int i_485_, int i_486_, int i_487_) {
		U(i, i_483_, i_484_, i_486_, i_487_);
		U(i, i_483_ + i_485_ - 1, i_484_, i_486_, i_487_);
		P(i, i_483_ + 1, i_485_ - 2, i_486_, i_487_);
		P(i + i_484_ - 1, i_483_ + 1, i_485_ - 2, i_486_, i_487_);
	}

	final void da(int i, int i_488_, int i_489_, int[] is) {
		float f = ((this.aClass111_Sub2_4513.aFloat4689) + ((this.aClass111_Sub2_4513.aFloat4693) * (float) i + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_488_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_489_));
		if (f < (float) this.anInt4502 || f > (float) this.anInt4484)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_490_ = (int) ((float) this.anInt4514 * (this.aClass111_Sub2_4513.aFloat4697 + ((this.aClass111_Sub2_4513.aFloat4700) * (float) i + (this.aClass111_Sub2_4513.aFloat4699) * (float) i_488_ + (this.aClass111_Sub2_4513.aFloat4690) * (float) i_489_)) / f);
			int i_491_ = (int) ((float) this.anInt4490 * (this.aClass111_Sub2_4513.aFloat4691 + ((this.aClass111_Sub2_4513.aFloat4692) * (float) i + (this.aClass111_Sub2_4513.aFloat4688) * (float) i_488_ + (this.aClass111_Sub2_4513.aFloat4696) * (float) i_489_)) / f);
			if (i_490_ >= this.anInt4486 && i_490_ <= this.anInt4517 && i_491_ >= this.anInt4518 && i_491_ <= this.anInt4506) {
				is[0] = i_490_ - this.anInt4486;
				is[1] = i_491_ - this.anInt4518;
				is[2] = (int) f;
			} else
				is[0] = is[1] = is[2] = -1;
		}
	}

	final void method1820(Class242 class242) {
		Class235 class235 = method1921(Thread.currentThread());
		Class246_Sub4 class246_sub4 = (class242.aClass358_1850.aClass246_Sub4_3028);
		for (Class246_Sub4 class246_sub4_492_ = class246_sub4.aClass246_Sub4_5091; class246_sub4_492_ != class246_sub4; class246_sub4_492_ = class246_sub4_492_.aClass246_Sub4_5091) {
			Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_492_;
			int i = class246_sub4_sub2.anInt6176 >> 12;
			int i_493_ = class246_sub4_sub2.anInt6177 >> 12;
			int i_494_ = class246_sub4_sub2.anInt6175 >> 12;
			float f = ((this.aClass111_Sub2_4513.aFloat4689) + ((this.aClass111_Sub2_4513.aFloat4693) * (float) i + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_493_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_494_));
			if (!(f < (float) this.anInt4502) && !(f > (float) class235.anInt1761)) {
				int i_495_ = (this.anInt4510 + (int) ((float) this.anInt4514 * ((this.aClass111_Sub2_4513.aFloat4697) + ((this.aClass111_Sub2_4513.aFloat4700) * (float) i + (this.aClass111_Sub2_4513.aFloat4699) * (float) i_493_ + (this.aClass111_Sub2_4513.aFloat4690) * (float) i_494_)) / f));
				int i_496_ = (this.anInt4511 + (int) ((float) this.anInt4490 * ((this.aClass111_Sub2_4513.aFloat4691) + ((this.aClass111_Sub2_4513.aFloat4692) * (float) i + (this.aClass111_Sub2_4513.aFloat4688) * (float) i_493_ + (this.aClass111_Sub2_4513.aFloat4696) * (float) i_494_)) / f));
				if (i_495_ >= this.anInt4509 && i_495_ <= this.anInt4507 && i_496_ >= this.anInt4495 && i_496_ <= this.anInt4492) {
					if (f == 0.0F)
						f = 1.0F;
					method1914(class246_sub4_sub2, i_495_, i_496_, (int) f, (int) ((float) ((class246_sub4_sub2.anInt6179 * this.anInt4514) >> 12) / f));
				}
			}
		}
	}

	final int c(int i, int i_497_) {
		i |= 0x20800;
		return i & i_497_ ^ i_497_;
	}

	final void aa(int i, int i_498_, int i_499_, int i_500_, int i_501_, int i_502_) {
		if (i < this.anInt4509) {
			i_499_ -= this.anInt4509 - i;
			i = this.anInt4509;
		}
		if (i_498_ < this.anInt4495) {
			i_500_ -= this.anInt4495 - i_498_;
			i_498_ = this.anInt4495;
		}
		if (i + i_499_ > this.anInt4507)
			i_499_ = this.anInt4507 - i;
		if (i_498_ + i_500_ > this.anInt4492)
			i_500_ = this.anInt4492 - i_498_;
		if (i_499_ > 0 && i_500_ > 0 && i <= this.anInt4507 && i_498_ <= this.anInt4492) {
			int i_503_ = this.anInt4505 - i_499_;
			int i_504_ = i + i_498_ * this.anInt4505;
			int i_505_ = i_501_ >>> 24;
			if (i_502_ == 0 || i_502_ == 1 && i_505_ == 255) {
				int i_506_ = i_499_ >> 3;
				int i_507_ = i_499_ & 0x7;
				i_499_ = i_504_ - 1;
				for (int i_508_ = -i_500_; i_508_ < 0; i_508_++) {
					if (i_506_ > 0) {
						i = i_506_;
						do {
							this.anIntArray4504[++i_499_] = i_501_;
							this.anIntArray4504[++i_499_] = i_501_;
							this.anIntArray4504[++i_499_] = i_501_;
							this.anIntArray4504[++i_499_] = i_501_;
							this.anIntArray4504[++i_499_] = i_501_;
							this.anIntArray4504[++i_499_] = i_501_;
							this.anIntArray4504[++i_499_] = i_501_;
							this.anIntArray4504[++i_499_] = i_501_;
						} while (--i > 0);
					}
					if (i_507_ > 0) {
						i = i_507_;
						do
							this.anIntArray4504[++i_499_] = i_501_;
						while (--i > 0);
					}
					i_499_ += i_503_;
				}
			} else if (i_502_ == 1) {
				i_501_ = (((i_501_ & 0xff00ff) * i_505_ >> 8 & 0xff00ff) + (((i_501_ & ~0xff00ff) >>> 8) * i_505_ & ~0xff00ff));
				int i_509_ = 256 - i_505_;
				for (int i_510_ = 0; i_510_ < i_500_; i_510_++) {
					for (int i_511_ = -i_499_; i_511_ < 0; i_511_++) {
						int i_512_ = this.anIntArray4504[i_504_];
						i_512_ = (((i_512_ & 0xff00ff) * i_509_ >> 8 & 0xff00ff) + (((i_512_ & ~0xff00ff) >>> 8) * i_509_ & ~0xff00ff));
						this.anIntArray4504[i_504_++] = i_501_ + i_512_;
					}
					i_504_ += i_503_;
				}
			} else if (i_502_ == 2) {
				for (int i_513_ = 0; i_513_ < i_500_; i_513_++) {
					for (int i_514_ = -i_499_; i_514_ < 0; i_514_++) {
						int i_515_ = this.anIntArray4504[i_504_];
						int i_516_ = i_501_ + i_515_;
						int i_517_ = (i_501_ & 0xff00ff) + (i_515_ & 0xff00ff);
						i_515_ = (i_517_ & 0x1000100) + (i_516_ - i_517_ & 0x10000);
						this.anIntArray4504[i_504_++] = i_516_ - i_515_ | i_515_ - (i_515_ >>> 8);
					}
					i_504_ += i_503_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final Class48 method1803(int i, int i_518_, int i_519_, int i_520_, int i_521_, int i_522_) {
		return null;
	}

	final aa method1772(int i, int i_523_, int[] is, int[] is_524_) {
		return new aa_Sub1(i, i_523_, is, is_524_);
	}

	final void method1825() {
		/* empty */
	}

	final void method1764(int i, int i_525_) throws Exception_Sub1 {
		if (aCanvas4479 == null || this.aClass98_Sub32_4478 == null)
			throw new IllegalStateException("off");
		try {
			Graphics graphics = aCanvas4479.getGraphics();
			this.aClass98_Sub32_4478.method1434(graphics, 0, (byte) -125, i, anInt4474, i_525_, anInt4477, 0);
		} catch (Exception exception) {
			aCanvas4479.repaint();
		}
	}

	final void Q(int i, int i_526_, int i_527_, int i_528_, int i_529_, int i_530_, byte[] is, int i_531_, int i_532_) {
		if (i_527_ > 0 && i_528_ > 0) {
			int i_533_ = 0;
			int i_534_ = 0;
			int i_535_ = (i_531_ << 16) / i_527_;
			int i_536_ = (is.length / i_531_ << 16) / i_528_;
			int i_537_ = i + i_526_ * this.anInt4505;
			int i_538_ = this.anInt4505 - i_527_;
			if (i_526_ + i_528_ > this.anInt4492)
				i_528_ -= i_526_ + i_528_ - this.anInt4492;
			if (i_526_ < this.anInt4495) {
				int i_539_ = this.anInt4495 - i_526_;
				i_528_ -= i_539_;
				i_537_ += i_539_ * this.anInt4505;
				i_534_ += i_536_ * i_539_;
			}
			if (i + i_527_ > this.anInt4507) {
				int i_540_ = i + i_527_ - this.anInt4507;
				i_527_ -= i_540_;
				i_538_ += i_540_;
			}
			if (i < this.anInt4509) {
				int i_541_ = this.anInt4509 - i;
				i_527_ -= i_541_;
				i_537_ += i_541_;
				i_533_ += i_535_ * i_541_;
				i_538_ += i_541_;
			}
			int i_542_ = i_529_ >>> 24;
			int i_543_ = i_530_ >>> 24;
			if (i_532_ == 0 || i_532_ == 1 && i_542_ == 255 && i_543_ == 255) {
				int i_544_ = i_533_;
				for (int i_545_ = -i_528_; i_545_ < 0; i_545_++) {
					int i_546_ = (i_534_ >> 16) * i_531_;
					for (int i_547_ = -i_527_; i_547_ < 0; i_547_++) {
						if (is[(i_533_ >> 16) + i_546_] != 0)
							this.anIntArray4504[i_537_++] = i_530_;
						else
							this.anIntArray4504[i_537_++] = i_529_;
						i_533_ += i_535_;
					}
					i_534_ += i_536_;
					i_533_ = i_544_;
					i_537_ += i_538_;
				}
			} else if (i_532_ == 1) {
				int i_548_ = i_533_;
				for (int i_549_ = -i_528_; i_549_ < 0; i_549_++) {
					int i_550_ = (i_534_ >> 16) * i_531_;
					for (int i_551_ = -i_527_; i_551_ < 0; i_551_++) {
						int i_552_ = i_529_;
						if (is[(i_533_ >> 16) + i_550_] != 0)
							i_552_ = i_530_;
						int i_553_ = i_552_ >>> 24;
						int i_554_ = 255 - i_553_;
						int i_555_ = this.anIntArray4504[i_537_];
						this.anIntArray4504[i_537_++] = ((((i_552_ & 0xff00ff) * i_553_ + (i_555_ & 0xff00ff) * i_554_) & ~0xff00ff) + (((i_552_ & 0xff00) * i_553_ + (i_555_ & 0xff00) * i_554_) & 0xff0000)) >> 8;
						i_533_ += i_535_;
					}
					i_534_ += i_536_;
					i_533_ = i_548_;
					i_537_ += i_538_;
				}
			} else if (i_532_ == 2) {
				int i_556_ = i_533_;
				for (int i_557_ = -i_528_; i_557_ < 0; i_557_++) {
					int i_558_ = (i_534_ >> 16) * i_531_;
					for (int i_559_ = -i_527_; i_559_ < 0; i_559_++) {
						int i_560_ = i_529_;
						if (is[(i_533_ >> 16) + i_558_] != 0)
							i_560_ = i_530_;
						if (i_560_ != 0) {
							int i_561_ = this.anIntArray4504[i_537_];
							int i_562_ = i_560_ + i_561_;
							int i_563_ = (i_560_ & 0xff00ff) + (i_561_ & 0xff00ff);
							i_561_ = (i_563_ & 0x1000100) + (i_562_ - i_563_ & 0x10000);
							this.anIntArray4504[i_537_++] = i_562_ - i_561_ | i_561_ - (i_561_ >>> 8);
						} else
							i_537_++;
						i_533_ += i_535_;
					}
					i_534_ += i_536_;
					i_533_ = i_556_;
					i_537_ += i_538_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void H(int i, int i_564_, int i_565_, int[] is) {
		float f = ((this.aClass111_Sub2_4513.aFloat4689) + ((this.aClass111_Sub2_4513.aFloat4693) * (float) i + (this.aClass111_Sub2_4513.aFloat4698) * (float) i_564_ + (this.aClass111_Sub2_4513.aFloat4694) * (float) i_565_));
		if (f == 0.0F)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_566_ = (int) ((float) this.anInt4514 * (this.aClass111_Sub2_4513.aFloat4697 + ((this.aClass111_Sub2_4513.aFloat4700) * (float) i + (this.aClass111_Sub2_4513.aFloat4699) * (float) i_564_ + (this.aClass111_Sub2_4513.aFloat4690) * (float) i_565_)) / f);
			int i_567_ = (int) ((float) this.anInt4490 * (this.aClass111_Sub2_4513.aFloat4691 + ((this.aClass111_Sub2_4513.aFloat4692) * (float) i + (this.aClass111_Sub2_4513.aFloat4688) * (float) i_564_ + (this.aClass111_Sub2_4513.aFloat4696) * (float) i_565_)) / f);
			is[0] = i_566_ - this.anInt4486;
			is[1] = i_567_ - this.anInt4518;
			is[2] = (int) f;
		}
	}

	final boolean method1800() {
		return true;
	}

	final void method1818(int i, Class98_Sub5[] class98_sub5s) {
		/* empty */
	}

	final void method1795(int i, int i_568_, int i_569_, int i_570_, int i_571_, int i_572_) {
		i_569_ -= i;
		i_570_ -= i_568_;
		if (i_570_ == 0) {
			if (i_569_ >= 0)
				U(i, i_568_, i_569_ + 1, i_571_, i_572_);
			else
				U(i + i_569_, i_568_, -i_569_ + 1, i_571_, i_572_);
		} else if (i_569_ == 0) {
			if (i_570_ >= 0)
				P(i, i_568_, i_570_ + 1, i_571_, i_572_);
			else
				P(i, i_568_ + i_570_, -i_570_ + 1, i_571_, i_572_);
		} else {
			if (i_569_ + i_570_ < 0) {
				i += i_569_;
				i_569_ = -i_569_;
				i_568_ += i_570_;
				i_570_ = -i_570_;
			}
			if (i_569_ > i_570_) {
				i_568_ <<= 16;
				i_568_ += 32768;
				i_570_ <<= 16;
				int i_573_ = (int) Math.floor((double) i_570_ / (double) i_569_ + 0.5);
				i_569_ += i;
				if (i < this.anInt4509) {
					i_568_ += i_573_ * (this.anInt4509 - i);
					i = this.anInt4509;
				}
				if (i_569_ >= this.anInt4507)
					i_569_ = this.anInt4507 - 1;
				int i_574_ = i_571_ >>> 24;
				if (i_572_ == 0 || i_572_ == 1 && i_574_ == 255) {
					for (/**/; i <= i_569_; i++) {
						int i_575_ = i_568_ >> 16;
						if (i_575_ >= this.anInt4495 && i_575_ < this.anInt4492)
							this.anIntArray4504[i + i_575_ * this.anInt4505] = i_571_;
						i_568_ += i_573_;
					}
					return;
				}
				if (i_572_ == 1) {
					i_571_ = (((i_571_ & 0xff00ff) * i_574_ >> 8 & 0xff00ff) + ((i_571_ & 0xff00) * i_574_ >> 8 & 0xff00) + (i_574_ << 24));
					int i_576_ = 256 - i_574_;
					for (/**/; i <= i_569_; i++) {
						int i_577_ = i_568_ >> 16;
						if (i_577_ >= this.anInt4495 && i_577_ < this.anInt4492) {
							int i_578_ = i + i_577_ * this.anInt4505;
							int i_579_ = this.anIntArray4504[i_578_];
							i_579_ = (((i_579_ & 0xff00ff) * i_576_ >> 8 & 0xff00ff) + ((i_579_ & 0xff00) * i_576_ >> 8 & 0xff00));
							this.anIntArray4504[i_578_] = i_571_ + i_579_;
						}
						i_568_ += i_573_;
					}
					return;
				}
				if (i_572_ == 2) {
					for (/**/; i <= i_569_; i++) {
						int i_580_ = i_568_ >> 16;
						if (i_580_ >= this.anInt4495 && i_580_ < this.anInt4492) {
							int i_581_ = i + i_580_ * this.anInt4505;
							int i_582_ = this.anIntArray4504[i_581_];
							int i_583_ = i_571_ + i_582_;
							int i_584_ = (i_571_ & 0xff00ff) + (i_582_ & 0xff00ff);
							i_582_ = (i_584_ & 0x1000100) + (i_583_ - i_584_ & 0x10000);
							this.anIntArray4504[i_581_] = i_583_ - i_582_ | i_582_ - (i_582_ >>> 8);
						}
						i_568_ += i_573_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_569_ <<= 16;
			int i_585_ = (int) Math.floor((double) i_569_ / (double) i_570_ + 0.5);
			i_570_ += i_568_;
			if (i_568_ < this.anInt4495) {
				i += i_585_ * (this.anInt4495 - i_568_);
				i_568_ = this.anInt4495;
			}
			if (i_570_ >= this.anInt4492)
				i_570_ = this.anInt4492 - 1;
			int i_586_ = i_571_ >>> 24;
			if (i_572_ == 0 || i_572_ == 1 && i_586_ == 255) {
				for (/**/; i_568_ <= i_570_; i_568_++) {
					int i_587_ = i >> 16;
					if (i_587_ >= this.anInt4509 && i_587_ < this.anInt4507)
						this.anIntArray4504[i_587_ + i_568_ * this.anInt4505] = i_571_;
					i += i_585_;
				}
			} else if (i_572_ == 1) {
				i_571_ = (((i_571_ & 0xff00ff) * i_586_ >> 8 & 0xff00ff) + ((i_571_ & 0xff00) * i_586_ >> 8 & 0xff00) + (i_586_ << 24));
				int i_588_ = 256 - i_586_;
				for (/**/; i_568_ <= i_570_; i_568_++) {
					int i_589_ = i >> 16;
					if (i_589_ >= this.anInt4509 && i_589_ < this.anInt4507) {
						int i_590_ = i_589_ + i_568_ * this.anInt4505;
						int i_591_ = this.anIntArray4504[i_590_];
						i_591_ = (((i_591_ & 0xff00ff) * i_588_ >> 8 & 0xff00ff) + ((i_591_ & 0xff00) * i_588_ >> 8 & 0xff00));
						this.anIntArray4504[i_589_ + i_568_ * this.anInt4505] = i_571_ + i_591_;
					}
					i += i_585_;
				}
			} else if (i_572_ == 2) {
				for (/**/; i_568_ <= i_570_; i_568_++) {
					int i_592_ = i >> 16;
					if (i_592_ >= this.anInt4509 && i_592_ < this.anInt4507) {
						int i_593_ = i_592_ + i_568_ * this.anInt4505;
						int i_594_ = this.anIntArray4504[i_593_];
						int i_595_ = i_571_ + i_594_;
						int i_596_ = (i_571_ & 0xff00ff) + (i_594_ & 0xff00ff);
						i_594_ = (i_596_ & 0x1000100) + (i_595_ - i_596_ & 0x10000);
						this.anIntArray4504[i_593_] = i_595_ - i_594_ | i_594_ - (i_594_ >>> 8);
					}
					i += i_585_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final Class332 method1758(Class324 class324, boolean bool) {
		int[] is = class324.anIntArray2718;
		byte[] is_597_ = class324.aByteArray2717;
		int i = class324.anInt2722;
		int i_598_ = class324.anInt2720;
		Class332_Sub3 class332_sub3;
		if (bool && class324.aByteArray2723 == null) {
			int[] is_599_ = new int[is.length];
			byte[] is_600_ = new byte[i * i_598_];
			for (int i_601_ = 0; i_601_ < i_598_; i_601_++) {
				int i_602_ = i_601_ * i;
				for (int i_603_ = 0; i_603_ < i; i_603_++)
					is_600_[i_602_ + i_603_] = is_597_[i_602_ + i_603_];
			}
			for (int i_604_ = 0; i_604_ < is.length; i_604_++)
				is_599_[i_604_] = is[i_604_];
			class332_sub3 = new Class332_Sub3_Sub3(this, is_600_, is_599_, i, i_598_);
		} else {
			int[] is_605_ = new int[i * i_598_];
			byte[] is_606_ = class324.aByteArray2723;
			if (is_606_ != null) {
				for (int i_607_ = 0; i_607_ < i_598_; i_607_++) {
					int i_608_ = i_607_ * i;
					for (int i_609_ = 0; i_609_ < i; i_609_++)
						is_605_[i_608_ + i_609_] = (is[is_597_[i_608_ + i_609_] & 0xff] | is_606_[i_608_ + i_609_] << 24);
				}
				class332_sub3 = new Class332_Sub3_Sub1(this, is_605_, i, i_598_);
			} else {
				for (int i_610_ = 0; i_610_ < i_598_; i_610_++) {
					int i_611_ = i_610_ * i;
					for (int i_612_ = 0; i_612_ < i; i_612_++) {
						int i_613_ = is[is_597_[i_611_ + i_612_] & 0xff];
						is_605_[i_611_ + i_612_] = i_613_ != 0 ? ~0xffffff | i_613_ : 0;
					}
				}
				class332_sub3 = new Class332_Sub3_Sub2(this, is_605_, i, i_598_);
			}
		}
		class332_sub3.method3740(class324.anInt2725, class324.anInt2721, class324.anInt2719, class324.anInt2724);
		return class332_sub3;
	}

	final boolean method1788() {
		return false;
	}

	final void a(za var_za) {
		/* empty */
	}

	final void method1806(int i) {
		int i_614_ = i - anInt4475;
		for (Object object = aClass79_4494.method803(false); object != null; object = aClass79_4494.method804(false)) {
			Class98_Sub2 class98_sub2 = (Class98_Sub2) object;
			if (class98_sub2.aBoolean3817) {
				class98_sub2.anInt3818 += i_614_;
				int i_615_ = class98_sub2.anInt3818 / 20;
				if (i_615_ > 0) {
					Class238 class238 = this.aD938.method11(class98_sub2.anInt3820, -28755);
					class98_sub2.method949((class238.aByte1823 * i_614_ * 50 / 1000), (class238.aByte1837 * i_614_ * 50 / 1000));
					class98_sub2.anInt3818 -= i_615_ * 20;
				}
				class98_sub2.aBoolean3817 = false;
			}
		}
		anInt4475 = i;
		aClass79_4497.method800((byte) 62, 5);
		aClass79_4494.method800((byte) 62, 5);
	}

	final void method1814() {
		/* empty */
	}

	final void method1778(int i) {
		this.anInt4482 = i;
		aClass79_4494.method794(31);
	}

	final void method1773() {
		if (aBoolean4473) {
			Class18.method248(false, 37, true);
			aBoolean4473 = false;
		}
		this.aClass98_Sub32_4478 = null;
		aCanvas4479 = null;
		anInt4474 = 0;
		anInt4477 = 0;
		aClass377_4476 = null;
		aBoolean4472 = true;
	}

	final void method1782(Canvas canvas, int i, int i_616_) {
		Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476.method3990(canvas.hashCode(), -1));
		if (class98_sub32 != null) {
			class98_sub32.remove();
			class98_sub32 = Class64_Sub23.method646(i_616_, i, canvas, (byte) -111);
			aClass377_4476.method3996(class98_sub32, canvas.hashCode(), -1);
			if (aCanvas4479 == canvas && aClass186_4499 == null) {
				Dimension dimension = canvas.getSize();
				anInt4474 = dimension.width;
				anInt4477 = dimension.height;
				this.aClass98_Sub32_4478 = class98_sub32;
				this.anIntArray4504 = class98_sub32.anIntArray4108;
				this.anInt4505 = class98_sub32.anInt4105;
				anInt4480 = class98_sub32.anInt4110;
				if (this.anInt4505 != anInt4512 || anInt4480 != anInt4485) {
					anInt4496 = anInt4512 = this.anInt4505;
					anInt4503 = anInt4485 = anInt4480;
					this.aFloatArray4488 = this.aFloatArray4487 = new float[anInt4512 * anInt4485];
				}
				method1911();
			}
		}
	}

	final void method1812() {
		aClass79_4494.method794(82);
		aClass79_4497.method794(62);
	}

	final void DA(int i, int i_617_, int i_618_, int i_619_) {
		this.anInt4510 = i;
		this.anInt4511 = i_617_;
		this.anInt4514 = i_618_;
		this.anInt4490 = i_619_;
		method1913();
	}

	final void U(int i, int i_620_, int i_621_, int i_622_, int i_623_) {
		if (i_620_ >= this.anInt4495 && i_620_ < this.anInt4492) {
			if (i < this.anInt4509) {
				i_621_ -= this.anInt4509 - i;
				i = this.anInt4509;
			}
			if (i + i_621_ > this.anInt4507)
				i_621_ = this.anInt4507 - i;
			int i_624_ = i + i_620_ * this.anInt4505;
			int i_625_ = i_622_ >>> 24;
			if (i_623_ == 0 || i_623_ == 1 && i_625_ == 255) {
				for (int i_626_ = 0; i_626_ < i_621_; i_626_++)
					this.anIntArray4504[i_624_ + i_626_] = i_622_;
			} else if (i_623_ == 1) {
				i_622_ = (((i_622_ & 0xff00ff) * i_625_ >> 8 & 0xff00ff) + ((i_622_ & 0xff00) * i_625_ >> 8 & 0xff00) + (i_625_ << 24));
				int i_627_ = 256 - i_625_;
				for (int i_628_ = 0; i_628_ < i_621_; i_628_++) {
					int i_629_ = this.anIntArray4504[i_624_ + i_628_];
					i_629_ = (((i_629_ & 0xff00ff) * i_627_ >> 8 & 0xff00ff) + ((i_629_ & 0xff00) * i_627_ >> 8 & 0xff00));
					this.anIntArray4504[i_624_ + i_628_] = i_622_ + i_629_;
				}
			} else if (i_623_ == 2) {
				for (int i_630_ = 0; i_630_ < i_621_; i_630_++) {
					int i_631_ = this.anIntArray4504[i_624_ + i_630_];
					int i_632_ = i_622_ + i_631_;
					int i_633_ = (i_622_ & 0xff00ff) + (i_631_ & 0xff00ff);
					i_631_ = (i_633_ & 0x1000100) + (i_632_ - i_633_ & 0x10000);
					this.anIntArray4504[i_624_ + i_630_] = i_632_ - i_631_ | i_631_ - (i_631_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void F(int i, int i_634_) {
		int i_635_ = i_634_ * this.anInt4505 + i;
		int i_636_ = i_634_ * anInt4512 + i;
		if (i_635_ != 0 || i_636_ != 0) {
			int[] is = this.anIntArray4504;
			float[] fs = this.aFloatArray4487;
			if (i_635_ < 0) {
				int i_637_ = is.length + i_635_;
				Class236.method2891(is, -i_635_, is, 0, i_637_);
			} else if (i_635_ > 0) {
				int i_638_ = is.length - i_635_;
				Class236.method2891(is, 0, is, i_635_, i_638_);
			}
			if (i_636_ < 0) {
				int i_639_ = fs.length + i_636_;
				Class236.method2897(fs, -i_636_, fs, 0, i_639_);
			} else if (i_636_ > 0) {
				int i_640_ = fs.length - i_636_;
				Class236.method2897(fs, 0, fs, i_636_, i_640_);
			}
		}
	}

	final void method1749(boolean bool) {
		aBoolean4491 = bool;
		aClass79_4494.method794(120);
	}

	final boolean method1780() {
		return false;
	}
}
