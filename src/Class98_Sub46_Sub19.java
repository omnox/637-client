/* Class98_Sub46_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub19 extends Class98_Sub46 {
	private int[] anIntArray6058;
	private Class98_Sub10 aClass98_Sub10_6059;
	private Class98_Sub10 aClass98_Sub10_6060;
	private Class98_Sub10[] aClass98_Sub10Array6061;
	static Class258 aClass258_6062 = new Class258();
	private int[] anIntArray6063;
	private Class98_Sub10 aClass98_Sub10_6064;
	static int anInt6065 = 1;
	static Class98_Sub46_Sub8 aClass98_Sub46_Sub8_6066;
	static RuneScapeCache aClass207_6067;
	static ItemDefinitionList getItemDefs;
	static int anInt6069;

	final boolean method1629(int i, RuneScapeCache class207, d var_d) {
		try {
			if (Class98_Sub10_Sub26.anInt5683 < 0) {
				for (int i_0_ = 0; anIntArray6063.length > i_0_; i_0_++) {
					if (!class207.method2742(-117, anIntArray6063[i_0_]))
						return false;
				}
			} else {
				for (int i_1_ = 0; i_1_ < anIntArray6063.length; i_1_++) {
					if (!class207.method2751(anIntArray6063[i_1_], Class98_Sub10_Sub26.anInt5683, -6329))
						return false;
				}
			}
			for (int i_2_ = i; anIntArray6058.length > i_2_; i_2_++) {
				if (!var_d.method8(43, anIntArray6058[i_2_]))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mp.E(" + i + ',' + (class207 != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method1630(d var_d, RuneScapeCache class207, byte i, int i_3_, int i_4_, boolean bool) {
		try {
			Class38.aD356 = var_d;
			Class127.aClass207_1019 = class207;
			int i_5_ = -119 / ((i - 30) / 45);
			for (int i_6_ = 0; i_6_ < aClass98_Sub10Array6061.length; i_6_++)
				aClass98_Sub10Array6061[i_6_].method998(i_4_, i_3_, -256);
			Class64_Sub2.method559(true, i_3_, i_4_);
			float[] fs = new float[4 * i_3_ * i_4_];
			int i_7_ = 0;
			for (int i_8_ = 0; i_4_ > i_8_; i_8_++) {
				int[] is;
				int[] is_9_;
				int[] is_10_;
				if (aClass98_Sub10_6064.aBoolean3861) {
					int[] is_11_ = aClass98_Sub10_6064.method990(255, i_8_);
					is_10_ = is_11_;
					is = is_11_;
					is_9_ = is_11_;
				} else {
					int[][] is_12_ = aClass98_Sub10_6064.method997(-94, i_8_);
					is = is_12_[2];
					is_9_ = is_12_[1];
					is_10_ = is_12_[0];
				}
				int[] is_13_;
				if (aClass98_Sub10_6059.aBoolean3861)
					is_13_ = aClass98_Sub10_6059.method990(255, i_8_);
				else
					is_13_ = aClass98_Sub10_6059.method997(-119, i_8_)[0];
				int[] is_14_;
				if (!aClass98_Sub10_6060.aBoolean3861)
					is_14_ = aClass98_Sub10_6060.method997(-115, i_8_)[0];
				else
					is_14_ = aClass98_Sub10_6060.method990(255, i_8_);
				if (bool)
					i_7_ = i_8_ << 2;
				for (int i_15_ = -1 + i_3_; i_15_ >= 0; i_15_--) {
					float f = (float) is_13_[i_15_] / 4096.0F;
					if (!(f < 0.0F)) {
						if (f > 1.0F)
							f = 1.0F;
					} else
						f = 0.0F;
					float f_16_ = ((1.0F + 31.0F * (float) is_14_[i_15_] / 4096.0F) / 4096.0F);
					fs[i_7_++] = f_16_ * (float) is_10_[i_15_];
					fs[i_7_++] = f_16_ * (float) is_9_[i_15_];
					fs[i_7_++] = (float) is[i_15_] * f_16_;
					fs[i_7_++] = f;
					if (bool)
						i_7_ += (i_3_ << 2) - 4;
				}
			}
			for (int i_17_ = 0; (aClass98_Sub10Array6061.length > i_17_); i_17_++)
				aClass98_Sub10Array6061[i_17_].method993(1002);
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mp.F(" + (var_d != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + bool + ')'));
		}
	}

	final int[] method1631(int i, boolean bool, d var_d, double d, boolean bool_18_, RuneScapeCache class207, int i_19_, byte i_20_) {
		try {
			Class127.aClass207_1019 = class207;
			Class38.aD356 = var_d;
			for (int i_21_ = 0; (i_21_ < aClass98_Sub10Array6061.length); i_21_++)
				aClass98_Sub10Array6061[i_21_].method998(i, i_19_, -256);
			Class64_Sub22.method640(d, 0);
			Class64_Sub2.method559(true, i_19_, i);
			int[] is = new int[i * i_19_];
			int i_22_;
			int i_23_;
			int i_24_;
			if (bool) {
				i_24_ = -1;
				i_22_ = -1;
				i_23_ = i_19_ + -1;
			} else {
				i_22_ = 1;
				i_23_ = 0;
				i_24_ = i_19_;
			}
			int i_25_ = 0;
			for (int i_26_ = 0; i_26_ < i; i_26_++) {
				if (bool_18_)
					i_25_ = i_26_;
				int[] is_27_;
				int[] is_28_;
				int[] is_29_;
				if (!aClass98_Sub10_6064.aBoolean3861) {
					int[][] is_30_ = aClass98_Sub10_6064.method997(-91, i_26_);
					is_29_ = is_30_[0];
					is_28_ = is_30_[2];
					is_27_ = is_30_[1];
				} else {
					int[] is_31_ = aClass98_Sub10_6064.method990(255, i_26_);
					is_27_ = is_31_;
					is_28_ = is_31_;
					is_29_ = is_31_;
				}
				for (int i_32_ = i_23_; i_32_ != i_24_; i_32_ += i_22_) {
					int i_33_ = is_29_[i_32_] >> 4;
					if (i_33_ > 255)
						i_33_ = 255;
					if (i_33_ < 0)
						i_33_ = 0;
					int i_34_ = is_27_[i_32_] >> 4;
					if (i_34_ > 255)
						i_34_ = 255;
					if (i_34_ < 0)
						i_34_ = 0;
					int i_35_ = is_28_[i_32_] >> 4;
					if (i_35_ > 255)
						i_35_ = 255;
					if (i_35_ < 0)
						i_35_ = 0;
					i_33_ = Class151_Sub4.anIntArray4985[i_33_];
					i_34_ = Class151_Sub4.anIntArray4985[i_34_];
					i_35_ = Class151_Sub4.anIntArray4985[i_35_];
					int i_36_ = ((i_33_ << 16) - (-(i_34_ << 8) - i_35_));
					if (i_36_ != 0)
						i_36_ |= ~0xffffff;
					is[i_25_++] = i_36_;
					if (bool_18_)
						i_25_ += i_19_ - 1;
				}
			}
			for (int i_37_ = 0; aClass98_Sub10Array6061.length > i_37_; i_37_++)
				aClass98_Sub10Array6061[i_37_].method993(1002);
			int i_38_ = 84 / ((i_20_ - 52) / 51);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mp.B(" + i + ',' + bool + ',' + (var_d != null ? "{...}" : "null") + ',' + d + ',' + bool_18_ + ',' + (class207 != null ? "{...}" : "null") + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	public static void method1632(byte i) {
		try {
			if (i != 37)
				anInt6069 = 43;
			IncomingOpcode.aClass58_6057 = null;
			aClass258_6062 = null;
			getItemDefs = null;
			aClass207_6067 = null;
			aClass98_Sub46_Sub8_6066 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mp.A(" + i + ')');
		}
	}

	final int[] method1633(boolean bool, double d, int i, d var_d, RuneScapeCache class207, byte i_39_, int i_40_) {
		try {
			Class127.aClass207_1019 = class207;
			Class38.aD356 = var_d;
			for (int i_41_ = 0; (aClass98_Sub10Array6061.length > i_41_); i_41_++)
				aClass98_Sub10Array6061[i_41_].method998(i, i_40_, i_39_ ^ ~0xb0);
			Class64_Sub22.method640(d, i_39_ + -79);
			Class64_Sub2.method559(true, i_40_, i);
			int[] is = new int[i_40_ * i];
			int i_42_ = 0;
			for (int i_43_ = 0; i > i_43_; i_43_++) {
				int[] is_44_;
				int[] is_45_;
				int[] is_46_;
				if (!aClass98_Sub10_6064.aBoolean3861) {
					int[][] is_47_ = aClass98_Sub10_6064.method997(-106, i_43_);
					is_44_ = is_47_[0];
					is_45_ = is_47_[1];
					is_46_ = is_47_[2];
				} else {
					int[] is_48_ = aClass98_Sub10_6064.method990(255, i_43_);
					is_44_ = is_48_;
					is_45_ = is_48_;
					is_46_ = is_48_;
				}
				if (bool)
					i_42_ = i_43_;
				int[] is_49_;
				if (aClass98_Sub10_6059.aBoolean3861)
					is_49_ = aClass98_Sub10_6059.method990(255, i_43_);
				else
					is_49_ = aClass98_Sub10_6059.method997(-118, i_43_)[0];
				for (int i_50_ = -1 + i_40_; i_50_ >= 0; i_50_--) {
					int i_51_ = is_44_[i_50_] >> 4;
					if (i_51_ > 255)
						i_51_ = 255;
					if (i_51_ < 0)
						i_51_ = 0;
					int i_52_ = is_45_[i_50_] >> 4;
					if (i_52_ > 255)
						i_52_ = 255;
					if (i_52_ < 0)
						i_52_ = 0;
					int i_53_ = is_46_[i_50_] >> 4;
					if (i_53_ > 255)
						i_53_ = 255;
					i_52_ = Class151_Sub4.anIntArray4985[i_52_];
					if (i_53_ < 0)
						i_53_ = 0;
					i_51_ = Class151_Sub4.anIntArray4985[i_51_];
					i_53_ = Class151_Sub4.anIntArray4985[i_53_];
					int i_54_;
					if (i_51_ == 0 && i_52_ == 0 && i_53_ == 0)
						i_54_ = 0;
					else {
						i_54_ = is_49_[i_50_] >> 4;
						if (i_54_ > 255)
							i_54_ = 255;
						if (i_54_ < 0)
							i_54_ = 0;
					}
					is[i_42_++] = ((i_52_ << 8) + (i_51_ << 16) + ((i_54_ << 24) - -i_53_));
					if (bool)
						i_42_ += i_40_ + -1;
				}
			}
			if (i_39_ != 79)
				aClass258_6062 = null;
			for (int i_55_ = 0; i_55_ < aClass98_Sub10Array6061.length; i_55_++)
				aClass98_Sub10Array6061[i_55_].method993(1002);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mp.D(" + bool + ',' + d + ',' + i + ',' + (var_d != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + i_39_ + ',' + i_40_ + ')'));
		}
	}

	static final Class367 method1634(RSByteBuffer class98_sub22, int i) {
		try {
			if (i < 79)
				aClass258_6062 = null;
			int i_56_ = class98_sub22.readShort();
			return new Class367(i_56_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mp.C(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public Class98_Sub46_Sub19() {
		try {
			anIntArray6063 = new int[0];
			anIntArray6058 = new int[0];
			aClass98_Sub10_6060 = new Class98_Sub10_Sub13(0);
			aClass98_Sub10_6060.anInt3860 = 1;
			aClass98_Sub10_6064 = new Class98_Sub10_Sub13();
			aClass98_Sub10_6064.anInt3860 = 1;
			aClass98_Sub10_6059 = new Class98_Sub10_Sub13();
			aClass98_Sub10Array6061 = new Class98_Sub10[] { aClass98_Sub10_6064, aClass98_Sub10_6059, aClass98_Sub10_6060 };
			aClass98_Sub10_6059.anInt3860 = 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mp.<init>(" + ')');
		}
	}

	Class98_Sub46_Sub19(RSByteBuffer class98_sub22) {
		try {
			int i = class98_sub22.readUnsignedByte();
			int i_57_ = 0;
			int i_58_ = 0;
			aClass98_Sub10Array6061 = new Class98_Sub10[i];
			int[][] is = new int[i][];
			for (int i_59_ = 0; i_59_ < i; i_59_++) {
				Class98_Sub10 class98_sub10 = Class98_Sub46_Sub11.method1581((byte) -71, class98_sub22);
				if (class98_sub10.method996((byte) -127) >= 0)
					i_57_++;
				if (class98_sub10.method992(16) >= 0)
					i_58_++;
				int i_60_ = (class98_sub10.aClass98_Sub10Array3857).length;
				is[i_59_] = new int[i_60_];
				for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
					is[i_59_][i_61_] = class98_sub22.readUnsignedByte();
				aClass98_Sub10Array6061[i_59_] = class98_sub10;
			}
			anIntArray6063 = new int[i_57_];
			i_57_ = 0;
			anIntArray6058 = new int[i_58_];
			i_58_ = 0;
			for (int i_62_ = 0; i > i_62_; i_62_++) {
				Class98_Sub10 class98_sub10 = aClass98_Sub10Array6061[i_62_];
				int i_63_ = (class98_sub10.aClass98_Sub10Array3857).length;
				for (int i_64_ = 0; i_63_ > i_64_; i_64_++)
					class98_sub10.aClass98_Sub10Array3857[i_64_] = aClass98_Sub10Array6061[is[i_62_][i_64_]];
				int i_65_ = class98_sub10.method996((byte) -124);
				int i_66_ = class98_sub10.method992(62);
				if (i_65_ > 0)
					anIntArray6063[i_57_++] = i_65_;
				if (i_66_ > 0)
					anIntArray6058[i_58_++] = i_66_;
				is[i_62_] = null;
			}
			aClass98_Sub10_6064 = (aClass98_Sub10Array6061[class98_sub22.readUnsignedByte()]);
			aClass98_Sub10_6059 = (aClass98_Sub10Array6061[class98_sub22.readUnsignedByte()]);
			Object object = null;
			aClass98_Sub10_6060 = (aClass98_Sub10Array6061[class98_sub22.readUnsignedByte()]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mp.<init>(" + (class98_sub22 != null ? "{...}" : "null") + ')');
		}
	}
}
