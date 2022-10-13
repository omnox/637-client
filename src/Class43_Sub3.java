/* Class43_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43_Sub3 extends Class43 {
	private int[] anIntArray3609;
	private int[] anIntArray3610;
	private int[] anIntArray3611;
	private byte[][] aByteArrayArray3612;
	private int[] anIntArray3613;
	private ha_Sub2 aHa_Sub2_3614;

	Class43_Sub3(ha_Sub2 var_ha_Sub2, Class197 class197, Class324[] class324s, int[] is, int[] is_0_) {
		super(var_ha_Sub2, class197);
		aHa_Sub2_3614 = var_ha_Sub2;
		aHa_Sub2_3614 = var_ha_Sub2;
		anIntArray3610 = is;
		anIntArray3609 = is_0_;
		aByteArrayArray3612 = new byte[class324s.length][];
		anIntArray3613 = new int[class324s.length];
		anIntArray3611 = new int[class324s.length];
		for (int i = 0; i < class324s.length; i++) {
			Class324 class324 = class324s[i];
			if (((Class324) class324).aByteArray2723 != null)
				aByteArrayArray3612[i] = ((Class324) class324).aByteArray2723;
			else {
				byte[] is_1_ = ((Class324) class324).aByteArray2717;
				byte[] is_2_ = aByteArrayArray3612[i] = new byte[is_1_.length];
				for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++)
					is_2_[i_3_] = (byte) (is_1_[i_3_] == 0 ? 0 : -1);
			}
			anIntArray3613[i] = ((Class324) class324).anInt2721;
			anIntArray3611[i] = ((Class324) class324).anInt2725;
		}
	}

	final void fa(char c, int i, int i_4_, int i_5_, boolean bool) {
		i += anIntArray3611[c];
		i_4_ += anIntArray3613[c];
		int i_6_ = anIntArray3610[c];
		int i_7_ = anIntArray3609[c];
		int i_8_ = ((ha_Sub2) aHa_Sub2_3614).anInt4505;
		int i_9_ = i + i_4_ * i_8_;
		int i_10_ = i_8_ - i_6_;
		int i_11_ = 0;
		int i_12_ = 0;
		if (i_4_ < ((ha_Sub2) aHa_Sub2_3614).anInt4495) {
			int i_13_ = ((ha_Sub2) aHa_Sub2_3614).anInt4495 - i_4_;
			i_7_ -= i_13_;
			i_4_ = ((ha_Sub2) aHa_Sub2_3614).anInt4495;
			i_12_ += i_13_ * i_6_;
			i_9_ += i_13_ * i_8_;
		}
		if (i_4_ + i_7_ > ((ha_Sub2) aHa_Sub2_3614).anInt4492)
			i_7_ -= i_4_ + i_7_ - ((ha_Sub2) aHa_Sub2_3614).anInt4492;
		if (i < ((ha_Sub2) aHa_Sub2_3614).anInt4509) {
			int i_14_ = ((ha_Sub2) aHa_Sub2_3614).anInt4509 - i;
			i_6_ -= i_14_;
			i = ((ha_Sub2) aHa_Sub2_3614).anInt4509;
			i_12_ += i_14_;
			i_9_ += i_14_;
			i_11_ += i_14_;
			i_10_ += i_14_;
		}
		if (i + i_6_ > ((ha_Sub2) aHa_Sub2_3614).anInt4507) {
			int i_15_ = i + i_6_ - ((ha_Sub2) aHa_Sub2_3614).anInt4507;
			i_6_ -= i_15_;
			i_11_ += i_15_;
			i_10_ += i_15_;
		}
		if (i_6_ > 0 && i_7_ > 0)
			method417(aByteArrayArray3612[c], ((ha_Sub2) aHa_Sub2_3614).anIntArray4504, i_5_, i_12_, i_9_, i_6_, i_7_, i_10_, i_11_);
	}

	private final void method417(byte[] is, int[] is_16_, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		for (int i_23_ = -i_20_; i_23_ < 0; i_23_++) {
			for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
				int i_25_ = is[i_17_++] & 0xff;
				if (i_25_ != 0) {
					int i_26_ = ((((i & 0xff00ff) * i_25_ & ~0xff00ff) + ((i & 0xff00) * i_25_ & 0xff0000)) >> 8);
					i_25_ = 256 - i_25_;
					int i_27_ = is_16_[i_18_];
					is_16_[i_18_++] = ((((i_27_ & 0xff00ff) * i_25_ & ~0xff00ff) + ((i_27_ & 0xff00) * i_25_ & 0xff0000)) >> 8) + i_26_;
				} else
					i_18_++;
			}
			i_18_ += i_21_;
			i_17_ += i_22_;
		}
	}

	private final void method418(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, aa var_aa, int i_38_, int i_39_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is_40_ = ((aa_Sub1) var_aa_Sub1).anIntArray3555;
		int[] is_41_ = ((aa_Sub1) var_aa_Sub1).anIntArray3557;
		int i_42_ = i_35_ - ((ha_Sub2) aHa_Sub2_3614).anInt4509;
		int i_43_ = i_36_;
		if (i_39_ > i_43_) {
			i_43_ = i_39_;
			i_30_ += (i_39_ - i_36_) * ((ha_Sub2) aHa_Sub2_3614).anInt4505;
			i_29_ += (i_39_ - i_36_) * i_37_;
		}
		int i_44_ = (i_39_ + is_40_.length < i_36_ + i_32_ ? i_39_ + is_40_.length : i_36_ + i_32_);
		for (int i_45_ = i_43_; i_45_ < i_44_; i_45_++) {
			int i_46_ = is_40_[i_45_ - i_39_] + i_38_;
			int i_47_ = is_41_[i_45_ - i_39_];
			int i_48_ = i_31_;
			if (i_42_ > i_46_) {
				int i_49_ = i_42_ - i_46_;
				if (i_49_ >= i_47_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_31_ + i_33_;
					continue;
				}
				i_47_ -= i_49_;
			} else {
				int i_50_ = i_46_ - i_42_;
				if (i_50_ >= i_31_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_31_ + i_33_;
					continue;
				}
				i_29_ += i_50_;
				i_48_ -= i_50_;
				i_30_ += i_50_;
			}
			int i_51_ = 0;
			if (i_48_ < i_47_)
				i_47_ = i_48_;
			else
				i_51_ = i_48_ - i_47_;
			for (int i_52_ = -i_47_; i_52_ < 0; i_52_++) {
				int i_53_ = is[i_29_++] & 0xff;
				if (i_53_ != 0) {
					int i_54_ = ((((i & 0xff00ff) * i_53_ & ~0xff00ff) + ((i & 0xff00) * i_53_ & 0xff0000)) >> 8);
					i_53_ = 256 - i_53_;
					int i_55_ = is_28_[i_30_];
					is_28_[i_30_++] = ((((i_55_ & 0xff00ff) * i_53_ & ~0xff00ff) + ((i_55_ & 0xff00) * i_53_ & 0xff0000)) >> 8) + i_54_;
				} else
					i_30_++;
			}
			i_29_ += i_51_ + i_34_;
			i_30_ += i_51_ + i_33_;
		}
	}

	final void method409(char c, int i, int i_56_, int i_57_, boolean bool, aa var_aa, int i_58_, int i_59_) {
		if (var_aa == null)
			fa(c, i, i_56_, i_57_, bool);
		else {
			i += anIntArray3611[c];
			i_56_ += anIntArray3613[c];
			int i_60_ = anIntArray3610[c];
			int i_61_ = anIntArray3609[c];
			int i_62_ = ((ha_Sub2) aHa_Sub2_3614).anInt4505;
			int i_63_ = i + i_56_ * i_62_;
			int i_64_ = i_62_ - i_60_;
			int i_65_ = 0;
			int i_66_ = 0;
			if (i_56_ < ((ha_Sub2) aHa_Sub2_3614).anInt4495) {
				int i_67_ = ((ha_Sub2) aHa_Sub2_3614).anInt4495 - i_56_;
				i_61_ -= i_67_;
				i_56_ = ((ha_Sub2) aHa_Sub2_3614).anInt4495;
				i_66_ += i_67_ * i_60_;
				i_63_ += i_67_ * i_62_;
			}
			if (i_56_ + i_61_ > ((ha_Sub2) aHa_Sub2_3614).anInt4492)
				i_61_ -= i_56_ + i_61_ - ((ha_Sub2) aHa_Sub2_3614).anInt4492;
			if (i < ((ha_Sub2) aHa_Sub2_3614).anInt4509) {
				int i_68_ = ((ha_Sub2) aHa_Sub2_3614).anInt4509 - i;
				i_60_ -= i_68_;
				i = ((ha_Sub2) aHa_Sub2_3614).anInt4509;
				i_66_ += i_68_;
				i_63_ += i_68_;
				i_65_ += i_68_;
				i_64_ += i_68_;
			}
			if (i + i_60_ > ((ha_Sub2) aHa_Sub2_3614).anInt4507) {
				int i_69_ = i + i_60_ - ((ha_Sub2) aHa_Sub2_3614).anInt4507;
				i_60_ -= i_69_;
				i_65_ += i_69_;
				i_64_ += i_69_;
			}
			if (i_60_ > 0 && i_61_ > 0)
				method418(aByteArrayArray3612[c], ((ha_Sub2) aHa_Sub2_3614).anIntArray4504, i_57_, i_66_, i_63_, i_60_, i_61_, i_64_, i_65_, i, i_56_, anIntArray3610[c], var_aa, i_58_, i_59_);
		}
	}
}
