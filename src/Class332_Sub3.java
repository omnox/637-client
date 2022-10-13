/* Class332_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class332_Sub3 extends Class332 {
	static int anInt5425;
	private static int anInt5426;
	static int anInt5427;
	static int anInt5428;
	private static int anInt5429;
	private static int anInt5430 = 0;
	static int anInt5431;
	static int anInt5432;
	int anInt5433;
	ha_Sub2 aHa_Sub2_5434;
	static int anInt5435;
	static int anInt5436;
	private int[] anIntArray5437;
	static int anInt5438;
	int anInt5439;
	static int anInt5440;
	static int anInt5441;
	static int anInt5442 = 0;
	static int anInt5443;
	static int anInt5444;
	private static int anInt5445;
	int anInt5446;
	int anInt5447;
	static int anInt5448;
	static int anInt5449;
	static int anInt5450;
	static int anInt5451;
	private static int anInt5452;
	private static int anInt5453;
	int anInt5454;
	int anInt5455;
	static int anInt5456;
	static int anInt5457;

	abstract void method3757(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_);

	abstract void method3758(int[] is, int[] is_8_, int i, int i_9_);

	abstract void method3759(int i, int i_10_);

	final int method3737() {
		return (((Class332_Sub3) this).anInt5446 + ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
	}

	private final boolean method3760(float f, float f_11_, float f_12_, float f_13_, float f_14_, float f_15_) {
		int i = (((Class332_Sub3) this).anInt5446 + ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
		int i_16_ = (((Class332_Sub3) this).anInt5439 + ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
		if (i != ((Class332_Sub3) this).anInt5433 || i_16_ != ((Class332_Sub3) this).anInt5454) {
			float f_17_ = (f_12_ - f) / (float) i;
			float f_18_ = (f_13_ - f_11_) / (float) i;
			float f_19_ = (f_14_ - f) / (float) i_16_;
			float f_20_ = (f_15_ - f_11_) / (float) i_16_;
			float f_21_ = f_19_ * (float) ((Class332_Sub3) this).anInt5439;
			float f_22_ = f_20_ * (float) ((Class332_Sub3) this).anInt5439;
			float f_23_ = f_17_ * (float) ((Class332_Sub3) this).anInt5446;
			float f_24_ = f_18_ * (float) ((Class332_Sub3) this).anInt5446;
			float f_25_ = -f_17_ * (float) ((Class332_Sub3) this).anInt5455;
			float f_26_ = -f_18_ * (float) ((Class332_Sub3) this).anInt5455;
			float f_27_ = -f_19_ * (float) ((Class332_Sub3) this).anInt5447;
			float f_28_ = -f_20_ * (float) ((Class332_Sub3) this).anInt5447;
			f += f_23_ + f_21_;
			f_11_ += f_24_ + f_22_;
			f_12_ += f_25_ + f_21_;
			f_13_ += f_26_ + f_22_;
			f_14_ += f_23_ + f_27_;
			f_15_ += f_24_ + f_28_;
		}
		float f_29_ = f_14_ + (f_12_ - f);
		float f_30_ = f_13_ + (f_15_ - f_11_);
		float f_31_;
		float f_32_;
		if (f < f_12_) {
			f_31_ = f;
			f_32_ = f_12_;
		} else {
			f_31_ = f_12_;
			f_32_ = f;
		}
		if (f_14_ < f_31_)
			f_31_ = f_14_;
		if (f_29_ < f_31_)
			f_31_ = f_29_;
		if (f_14_ > f_32_)
			f_32_ = f_14_;
		if (f_29_ > f_32_)
			f_32_ = f_29_;
		float f_33_;
		float f_34_;
		if (f_11_ < f_13_) {
			f_33_ = f_11_;
			f_34_ = f_13_;
		} else {
			f_33_ = f_13_;
			f_34_ = f_11_;
		}
		if (f_15_ < f_33_)
			f_33_ = f_15_;
		if (f_30_ < f_33_)
			f_33_ = f_30_;
		if (f_15_ > f_34_)
			f_34_ = f_15_;
		if (f_30_ > f_34_)
			f_34_ = f_30_;
		if (f_31_ < (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4509))
			f_31_ = (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4509);
		if (f_32_ > (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4507))
			f_32_ = (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4507);
		if (f_33_ < (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4495))
			f_33_ = (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4495);
		if (f_34_ > (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4492))
			f_34_ = (float) (((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4492);
		f_32_ = f_31_ - f_32_;
		if (f_32_ >= 0.0F)
			return false;
		f_34_ = f_33_ - f_34_;
		if (f_34_ >= 0.0F)
			return false;
		anInt5438 = ((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4505;
		anInt5451 = (int) ((float) ((int) f_33_ * anInt5438) + f_31_);
		float f_35_ = (f_12_ - f) * (f_15_ - f_11_) - (f_13_ - f_11_) * (f_14_ - f);
		float f_36_ = (f_14_ - f) * (f_13_ - f_11_) - (f_15_ - f_11_) * (f_12_ - f);
		anInt5444 = (int) ((f_15_ - f_11_) * 4096.0F * (float) ((Class332_Sub3) this).anInt5433 / f_35_);
		anInt5436 = (int) ((f_13_ - f_11_) * 4096.0F * (float) ((Class332_Sub3) this).anInt5454 / f_36_);
		anInt5441 = (int) ((f_14_ - f) * 4096.0F * (float) ((Class332_Sub3) this).anInt5433 / f_36_);
		anInt5428 = (int) ((f_12_ - f) * 4096.0F * (float) ((Class332_Sub3) this).anInt5454 / f_35_);
		anInt5426 = (int) (f_31_ * 16.0F + 8.0F - (f + f_12_ + f_14_ + f_29_) / 4.0F * 16.0F);
		anInt5445 = (int) (f_33_ * 16.0F + 8.0F - (f_11_ + f_13_ + f_15_ + f_30_) / 4.0F * 16.0F);
		anInt5450 = ((((Class332_Sub3) this).anInt5433 >> 1 << 12) + (anInt5445 * anInt5441 >> 4));
		anInt5443 = ((((Class332_Sub3) this).anInt5454 >> 1 << 12) + (anInt5445 * anInt5428 >> 4));
		anInt5425 = anInt5426 * anInt5444 >> 4;
		anInt5456 = anInt5426 * anInt5436 >> 4;
		anInt5453 = (int) f_31_;
		anInt5448 = (int) f_32_;
		anInt5429 = (int) f_33_;
		anInt5431 = (int) f_34_;
		return true;
	}

	final int method3731() {
		return ((Class332_Sub3) this).anInt5454;
	}

	abstract void method3729(int i, int i_37_, aa var_aa, int i_38_, int i_39_);

	final void method3733(float f, float f_40_, float f_41_, float f_42_, float f_43_, float f_44_, int i, int i_45_, int i_46_, int i_47_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920())
			throw new IllegalStateException();
		if (method3760(f, f_40_, f_41_, f_42_, f_43_, f_44_)) {
			anInt5432 = i_45_;
			if (i != 1) {
				anInt5449 = i_45_ >>> 24;
				anInt5442 = 256 - anInt5449;
				if (i == 0) {
					anInt5435 = (i_45_ & 0xff0000) >> 16;
					anInt5457 = (i_45_ & 0xff00) >> 8;
					anInt5427 = i_45_ & 0xff;
				} else if (i == 2) {
					anInt5430 = i_45_ >>> 24;
					anInt5452 = 256 - anInt5430;
					int i_48_ = (i_45_ & 0xff00ff) * anInt5452 & ~0xff00ff;
					int i_49_ = (i_45_ & 0xff00) * anInt5452 & 0xff0000;
					anInt5440 = (i_48_ | i_49_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_46_ == 0)
					method3759(1, 0);
				else if (i_46_ == 1)
					method3759(1, 1);
				else if (i_46_ == 2)
					method3759(1, 2);
			} else if (i == 0) {
				if (i_46_ == 0)
					method3759(0, 0);
				else if (i_46_ == 1)
					method3759(0, 1);
				else if (i_46_ == 2)
					method3759(0, 2);
			} else if (i == 3) {
				if (i_46_ == 0)
					method3759(3, 0);
				else if (i_46_ == 1)
					method3759(3, 1);
				else if (i_46_ == 2)
					method3759(3, 2);
			} else if (i == 2) {
				if (i_46_ == 0)
					method3759(2, 0);
				else if (i_46_ == 1)
					method3759(2, 1);
				else if (i_46_ == 2)
					method3759(2, 2);
			}
		}
	}

	final int method3749() {
		return (((Class332_Sub3) this).anInt5439 + ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
	}

	final void method3728(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920())
			throw new IllegalStateException();
		if (anIntArray5437 == null)
			anIntArray5437 = new int[4];
		((Class332_Sub3) this).aHa_Sub2_5434.K(anIntArray5437);
		((Class332_Sub3) this).aHa_Sub2_5434.T(((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4509, ((ha_Sub2) ((Class332_Sub3) this).aHa_Sub2_5434).anInt4495, i + i_51_, i_50_ + i_52_);
		int i_56_ = method3737();
		int i_57_ = method3749();
		int i_58_ = (i_51_ + i_56_ - 1) / i_56_;
		int i_59_ = (i_52_ + i_57_ - 1) / i_57_;
		for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
			int i_61_ = i_60_ * i_57_;
			for (int i_62_ = 0; i_62_ < i_58_; i_62_++)
				method3748(i + i_62_ * i_56_, i_50_ + i_61_, i_53_, i_54_, i_55_);
		}
		((Class332_Sub3) this).aHa_Sub2_5434.KA(anIntArray5437[0], anIntArray5437[1], anIntArray5437[2], anIntArray5437[3]);
	}

	abstract void method3745(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_);

	final void method3747(float f, float f_70_, float f_71_, float f_72_, float f_73_, float f_74_, int i, aa var_aa, int i_75_, int i_76_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920())
			throw new IllegalStateException();
		if (method3760(f, f_70_, f_71_, f_72_, f_73_, f_74_)) {
			aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
			method3758(((aa_Sub1) var_aa_Sub1).anIntArray3555, ((aa_Sub1) var_aa_Sub1).anIntArray3557, anInt5453 - i_75_, -i_76_ - (anInt5431 - anInt5429));
		}
	}

	abstract void method3748(int i, int i_77_, int i_78_, int i_79_, int i_80_);

	final void method3740(int i, int i_81_, int i_82_, int i_83_) {
		((Class332_Sub3) this).anInt5446 = i;
		((Class332_Sub3) this).anInt5439 = i_81_;
		((Class332_Sub3) this).anInt5455 = i_82_;
		((Class332_Sub3) this).anInt5447 = i_83_;
	}

	Class332_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_84_) {
		((Class332_Sub3) this).aHa_Sub2_5434 = var_ha_Sub2;
		((Class332_Sub3) this).anInt5433 = i;
		((Class332_Sub3) this).anInt5454 = i_84_;
	}

	final void method3741(int[] is) {
		is[0] = ((Class332_Sub3) this).anInt5446;
		is[1] = ((Class332_Sub3) this).anInt5439;
		is[2] = ((Class332_Sub3) this).anInt5455;
		is[3] = ((Class332_Sub3) this).anInt5447;
	}

	final int method3734() {
		return ((Class332_Sub3) this).anInt5433;
	}

	static {
		anInt5440 = 0;
		anInt5449 = 0;
		anInt5427 = 0;
		anInt5452 = 0;
		anInt5435 = 0;
		anInt5457 = 0;
	}
}
