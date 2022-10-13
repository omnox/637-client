
/* s_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

final class s_Sub1 extends s {
	private Class98_Sub20[][][] aClass98_Sub20ArrayArrayArray5190;
	private int anInt5191;
	int[][][] anIntArrayArrayArray5192;
	private int[][][] anIntArrayArrayArray5193;
	int[][][] anIntArrayArrayArray5194;
	private int[][][] anIntArrayArrayArray5195;
	short[][] aShortArrayArray5196;
	static Class279 aClass279_5197 = new Class279("runescape", 0);
	int anInt5198;
	private LinkedList aClass148_5199 = new LinkedList();
	static boolean aBoolean5200;
	private byte[][] aByteArrayArray5201;
	static Class346 aClass346_5202;
	private int anInt5203;
	private int anInt5204;
	ha_Sub1 aHa_Sub1_5206;
	static boolean aBoolean5207 = true;
	private int[][][] anIntArrayArrayArray5208;
	private Class33 aClass33_5209;
	int[][][] anIntArrayArrayArray5210;
	private int anInt5211;
	private byte[][] aByteArrayArray5212;
	private int anInt5213;
	private float[][] aFloatArrayArray5214;
	Class104 aClass104_5215;
	private Class104 aClass104_5216;
	private int anInt5217;
	private float[][] aFloatArrayArray5218;
	private Class377 aClass377_5219;
	private Interface16 anInterface16_5220;
	private Class98_Sub20[] aClass98_Sub20Array5221;
	Class104 aClass104_5222;
	private float[][] aFloatArrayArray5223;
	Class104 aClass104_5224;

	final void ka(int i, int i_0_, int i_1_) {
		do {
			try {
				if ((aByteArrayArray5212[i][i_0_] & 0xff) >= i_1_)
					break;
				aByteArrayArray5212[i][i_0_] = (byte) i_1_;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ok.ka(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	final void wa(r var_r, int i, int i_2_, int i_3_, int i_4_, boolean bool) {
		try {
			if (aClass33_5209 != null && var_r != null) {
				int i_5_ = (i - ((this.aHa_Sub1_5206.anInt4398) * i_2_ >> 8) >> this.aHa_Sub1_5206.anInt4319);
				int i_6_ = (i_3_ + -(i_2_ * this.aHa_Sub1_5206.anInt4377 >> 8) >> this.aHa_Sub1_5206.anInt4319);
				aClass33_5209.method322(i_6_, i_5_, false, var_r);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.wa(" + (var_r != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + bool + ')'));
		}
	}

	final void method3424(int i, int i_7_, int[] is, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int i_18_, int i_19_, int i_20_, boolean bool) {
		try {
			int i_21_ = is_14_.length;
			int[] is_22_ = new int[3 * i_21_];
			int[] is_23_ = new int[i_21_ * 3];
			int[] is_24_ = new int[3 * i_21_];
			int[] is_25_ = new int[i_21_ * 3];
			int[] is_26_ = new int[3 * i_21_];
			int[] is_27_ = new int[3 * i_21_];
			int[] is_28_ = is_8_ == null ? null : new int[3 * i_21_];
			int[] is_29_ = is_10_ == null ? null : new int[i_21_ * 3];
			int i_30_ = 0;
			for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
				int i_32_ = is_11_[i_31_];
				int i_33_ = is_12_[i_31_];
				int i_34_ = is_13_[i_31_];
				is_22_[i_30_] = is[i_32_];
				is_23_[i_30_] = is_9_[i_32_];
				is_24_[i_30_] = is_14_[i_31_];
				is_26_[i_30_] = is_16_[i_31_];
				is_27_[i_30_] = is_17_[i_31_];
				is_25_[i_30_] = is_15_ == null ? is_14_[i_31_] : is_15_[i_31_];
				if (is_8_ != null)
					is_28_[i_30_] = is_8_[i_32_];
				if (is_10_ != null)
					is_29_[i_30_] = is_10_[i_32_];
				i_30_++;
				is_22_[i_30_] = is[i_33_];
				is_23_[i_30_] = is_9_[i_33_];
				is_24_[i_30_] = is_14_[i_31_];
				is_26_[i_30_] = is_16_[i_31_];
				is_27_[i_30_] = is_17_[i_31_];
				is_25_[i_30_] = is_15_ != null ? is_15_[i_31_] : is_14_[i_31_];
				if (is_8_ != null)
					is_28_[i_30_] = is_8_[i_33_];
				if (is_10_ != null)
					is_29_[i_30_] = is_10_[i_33_];
				i_30_++;
				is_22_[i_30_] = is[i_34_];
				is_23_[i_30_] = is_9_[i_34_];
				is_24_[i_30_] = is_14_[i_31_];
				is_26_[i_30_] = is_16_[i_31_];
				is_27_[i_30_] = is_17_[i_31_];
				is_25_[i_30_] = is_15_ != null ? is_15_[i_31_] : is_14_[i_31_];
				if (is_8_ != null)
					is_28_[i_30_] = is_8_[i_34_];
				if (is_10_ != null)
					is_29_[i_30_] = is_10_[i_34_];
				i_30_++;
			}
			U(i, i_7_, is_22_, is_28_, is_23_, is_29_, is_24_, is_25_, is_26_, is_27_, i_18_, i_19_, i_20_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.H(" + i + ',' + i_7_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_8_ != null ? "{...}" : "null") + ',' + (is_9_ != null ? "{...}" : "null") + ',' + (is_10_ != null ? "{...}" : "null") + ',' + (is_11_ != null ? "{...}" : "null") + ',' + (is_12_ != null ? "{...}" : "null") + ',' + (is_13_ != null ? "{...}" : "null") + ',' + (is_14_ != null ? "{...}" : "null") + ',' + (is_15_ != null ? "{...}" : "null") + ',' + (is_16_ != null ? "{...}" : "null") + ',' + (is_17_ != null ? "{...}" : "null") + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + bool + ')'));
		}
	}

	static final boolean method3427(int i, int i_35_, int i_36_, int i_37_, byte i_38_, int i_39_, int i_40_) {
		try {
			int i_41_ = i_35_ + i_40_;
			int i_42_ = i - -i_36_;
			int i_43_ = i_37_ + i_39_;
			if (!Class254.method3187(i_42_, i_40_, i_39_, (byte) 82, i_42_, i_43_, i_42_, i_43_, i_41_, i_40_))
				return false;
			if (!Class254.method3187(i_42_, i_41_, i_39_, (byte) 82, i_42_, i_43_, i_42_, i_39_, i_41_, i_40_))
				return false;
			if (i_40_ < Class127.anInt1018) {
				if (!Class254.method3187(i_42_, i_40_, i_43_, (byte) 82, i, i_43_, i_42_, i_39_, i_40_, i_40_))
					return false;
				if (!Class254.method3187(i, i_40_, i_43_, (byte) 82, i, i_39_, i_42_, i_39_, i_40_, i_40_))
					return false;
			} else {
				if (!Class254.method3187(i_42_, i_41_, i_43_, (byte) 82, i, i_43_, i_42_, i_39_, i_41_, i_41_))
					return false;
				if (!Class254.method3187(i, i_41_, i_43_, (byte) 82, i, i_39_, i_42_, i_39_, i_41_, i_41_))
					return false;
			}
			if (i_38_ != 16)
				return true;
			if (Class98_Sub48.anInt4280 <= i_39_) {
				if (!Class254.method3187(i_42_, i_40_, i_43_, (byte) 82, i, i_43_, i_42_, i_43_, i_41_, i_40_))
					return false;
				if (!Class254.method3187(i, i_41_, i_43_, (byte) 82, i, i_43_, i_42_, i_43_, i_41_, i_40_))
					return false;
			} else {
				if (!Class254.method3187(i_42_, i_40_, i_39_, (byte) 82, i, i_39_, i_42_, i_39_, i_41_, i_40_))
					return false;
				if (!Class254.method3187(i, i_41_, i_39_, (byte) 82, i, i_39_, i_42_, i_39_, i_41_, i_40_))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.J(" + i + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ')'));
		}
	}

	private final void method3428(int i, int i_44_, boolean bool, int i_45_, int i_46_, boolean[][] bools, int i_47_, int i_48_) {
		do {
			try {
				if (aClass98_Sub20Array5221 != null) {
					int i_49_ = 1 + i_45_ + i_45_;
					i_49_ *= i_49_;
					if ((this.aHa_Sub1_5206.anIntArray4468).length < i_49_)
						this.aHa_Sub1_5206.anIntArray4468 = new int[i_49_];
					if (anInt5211 * 2 > this.aHa_Sub1_5206.aClass98_Sub22_Sub2_4446.data.length)
						this.aHa_Sub1_5206.aClass98_Sub22_Sub2_4446 = new Class98_Sub22_Sub2(2 * anInt5211);
					int i_50_ = -i_45_ + i_46_;
					int i_51_ = i_50_;
					if (i_50_ < 0)
						i_50_ = 0;
					int i_52_ = i_48_ - i_45_;
					int i_53_ = i_52_;
					if (i_52_ < 0)
						i_52_ = 0;
					int i_54_ = i_46_ + i_45_;
					if (i_54_ > -1 + this.anInt2203)
						i_54_ = -1 + this.anInt2203;
					int i_55_ = i_45_ + i_48_;
					if (this.anInt2204 - 1 < i_55_)
						i_55_ = this.anInt2204 + -1;
					int i_56_ = 0;
					int[] is = (this.aHa_Sub1_5206.anIntArray4468);
					for (int i_57_ = i_50_; i_57_ <= i_54_; i_57_++) {
						boolean[] bools_58_ = bools[i_57_ - i_51_];
						for (int i_59_ = i_52_; i_59_ <= i_55_; i_59_++) {
							if (bools_58_[-i_53_ + i_59_])
								is[i_56_++] = i_59_ * this.anInt2203 - -i_57_;
						}
					}
					if (i_44_ == -1)
						this.aHa_Sub1_5206.method1861(19330);
					else {
						this.aHa_Sub1_5206.method1890((float) i_44_, true);
						this.aHa_Sub1_5206.method1901((byte) -35);
					}
					this.aHa_Sub1_5206.method1851((this.anInt5198 & 0x7) != 0, false);
					for (int i_60_ = 0; (aClass98_Sub20Array5221.length > i_60_); i_60_++)
						aClass98_Sub20Array5221[i_60_].method1169(is, (byte) 98, i_56_);
					if (!aClass148_5199.method2420(-126)) {
						int i_61_ = (this.aHa_Sub1_5206.anInt4455);
						int i_62_ = (this.aHa_Sub1_5206.anInt4441);
						this.aHa_Sub1_5206.L(0, i_62_, (this.aHa_Sub1_5206.anInt4427));
						this.aHa_Sub1_5206.method1851(false, false);
						this.aHa_Sub1_5206.method1875((byte) -123, false);
						this.aHa_Sub1_5206.method1870((byte) -58, 128);
						this.aHa_Sub1_5206.method1834(-99, -2);
						this.aHa_Sub1_5206.method1863(1, (this.aHa_Sub1_5206.aClass42_Sub1_4358));
						this.aHa_Sub1_5206.method1899(7681, i_47_ ^ 0xfe2, 8448);
						this.aHa_Sub1_5206.method1840(0, 770, 116, 34166);
						this.aHa_Sub1_5206.method1886(770, 0, 34200, 34167);
						for (Node class98 = aClass148_5199.method2418(32); class98 != null; class98 = aClass148_5199.method2417(91)) {
							Class98_Sub37 class98_sub37 = (Class98_Sub37) class98;
							class98_sub37.method1461(i_48_, i_45_, i_46_, bools, (byte) 38);
						}
						this.aHa_Sub1_5206.method1840(0, 768, i_47_ ^ 0x2c88, 5890);
						this.aHa_Sub1_5206.method1886(770, 0, 34200, 5890);
						this.aHa_Sub1_5206.method1863(1, null);
						this.aHa_Sub1_5206.L(i_61_, i_62_, (this.aHa_Sub1_5206.anInt4427));
					}
					if (aClass33_5209 != null) {
						OpenGL.glPushMatrix();
						OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
						this.aHa_Sub1_5206.method1868(null, null, this.aClass104_5224, this.aClass104_5222, i_47_ + -11490);
						aClass33_5209.method320(bool, i_45_, i_46_, bools, (byte) 93, i_48_);
						OpenGL.glPopMatrix();
					}
				}
				if (i_47_ == 11490)
					break;
				aBoolean5200 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ok.A(" + i + ',' + i_44_ + ',' + bool + ',' + i_45_ + ',' + i_46_ + ',' + (bools != null ? "{...}" : "null") + ',' + i_47_ + ',' + i_48_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3422(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, boolean[][] bools) {
		do {
			try {
				if (anInt5217 > 0) {
					this.aHa_Sub1_5206.method1867(29458);
					this.aHa_Sub1_5206.method1856(false, 6914);
					this.aHa_Sub1_5206.method1851(false, false);
					this.aHa_Sub1_5206.method1881(false, false);
					this.aHa_Sub1_5206.method1875((byte) 27, false);
					this.aHa_Sub1_5206.method1870((byte) -35, 0);
					this.aHa_Sub1_5206.method1834(-62, -2);
					this.aHa_Sub1_5206.method1863(1, null);
					Class86.aFloatArray640[4] = 0.0F;
					Class86.aFloatArray640[13] = 1.0F - (((float) (i_63_ * 2) + (float) (i_64_ * i_68_) / 128.0F) / (float) (this.aHa_Sub1_5206.anInt4304));
					Class86.aFloatArray640[9] = 0.0F;
					Class86.aFloatArray640[3] = 0.0F;
					Class86.aFloatArray640[7] = 0.0F;
					Class86.aFloatArray640[11] = 0.0F;
					Class86.aFloatArray640[12] = -1.0F - (((float) -(2 * i) + (float) (i_65_ * i_64_) / 128.0F) / (float) (this.aHa_Sub1_5206.anInt4305));
					Class86.aFloatArray640[15] = 1.0F;
					Class86.aFloatArray640[14] = 0.0F;
					Class86.aFloatArray640[10] = 0.0F;
					Class86.aFloatArray640[0] = ((float) i_64_ / ((float) this.aHa_Sub1_5206.anInt4305 * (128.0F * (float) this.anInt2206)));
					Class86.aFloatArray640[6] = 0.0F;
					Class86.aFloatArray640[8] = 0.0F;
					Class86.aFloatArray640[1] = 0.0F;
					Class86.aFloatArray640[2] = 0.0F;
					Class86.aFloatArray640[5] = ((float) i_64_ / ((float) this.anInt2206 * 128.0F * (float) (this.aHa_Sub1_5206.anInt4304)));
					OpenGL.glMatrixMode(5889);
					OpenGL.glLoadMatrixf(Class86.aFloatArray640, 0);
					Class86.aFloatArray640[10] = 0.0F;
					Class86.aFloatArray640[7] = 0.0F;
					Class86.aFloatArray640[12] = 0.0F;
					Class86.aFloatArray640[15] = 1.0F;
					Class86.aFloatArray640[4] = 0.0F;
					Class86.aFloatArray640[5] = 0.0F;
					Class86.aFloatArray640[14] = 0.0F;
					Class86.aFloatArray640[11] = 0.0F;
					Class86.aFloatArray640[2] = 0.0F;
					Class86.aFloatArray640[8] = 0.0F;
					Class86.aFloatArray640[3] = 0.0F;
					Class86.aFloatArray640[0] = 1.0F;
					Class86.aFloatArray640[6] = 1.0F;
					Class86.aFloatArray640[1] = 0.0F;
					Class86.aFloatArray640[9] = 1.0F;
					Class86.aFloatArray640[13] = 0.0F;
					OpenGL.glMatrixMode(5888);
					OpenGL.glLoadMatrixf(Class86.aFloatArray640, 0);
					if ((this.anInt5198 & 0x7) != 0) {
						this.aHa_Sub1_5206.method1851(true, false);
						this.aHa_Sub1_5206.method1831(126);
					} else
						this.aHa_Sub1_5206.method1851(false, false);
					this.aHa_Sub1_5206.method1868(aClass104_5216, this.aClass104_5215, this.aClass104_5224, this.aClass104_5222, 0);
					if (this.aHa_Sub1_5206.aClass98_Sub22_Sub2_4446.data.length < anInt5211 * 2)
						this.aHa_Sub1_5206.aClass98_Sub22_Sub2_4446 = new Class98_Sub22_Sub2(anInt5211 * 2);
					else
						this.aHa_Sub1_5206.aClass98_Sub22_Sub2_4446.position = 0;
					int i_69_ = 0;
					Class98_Sub22_Sub2 class98_sub22_sub2 = (this.aHa_Sub1_5206.aClass98_Sub22_Sub2_4446);
					if (this.aHa_Sub1_5206.aBoolean4397) {
						for (int i_70_ = i_66_; i_70_ < i_68_; i_70_++) {
							int i_71_ = this.anInt2203 * i_70_ - -i_65_;
							for (int i_72_ = i_65_; i_67_ > i_72_; i_72_++) {
								if (bools[-i_65_ + i_72_][-i_66_ + i_70_]) {
									short[] is = (this.aShortArrayArray5196[i_71_]);
									if (is != null) {
										for (int i_73_ = 0; (i_73_ < is.length); i_73_++) {
											i_69_++;
											class98_sub22_sub2.writeShort(is[i_73_] & 0xffff);
										}
									}
								}
								i_71_++;
							}
						}
					} else {
						for (int i_74_ = i_66_; i_68_ > i_74_; i_74_++) {
							int i_75_ = i_65_ + i_74_ * this.anInt2203;
							for (int i_76_ = i_65_; i_67_ > i_76_; i_76_++) {
								if (bools[i_76_ + -i_65_][-i_66_ + i_74_]) {
									short[] is = (this.aShortArrayArray5196[i_75_]);
									if (is != null) {
										for (int i_77_ = 0; is.length > i_77_; i_77_++) {
											class98_sub22_sub2.method1247(is[i_77_] & 0xffff, 4);
											i_69_++;
										}
									}
								}
								i_75_++;
							}
						}
					}
					if (i_69_ <= 0)
						break;
					Class156_Sub1 class156_sub1 = (new Class156_Sub1(this.aHa_Sub1_5206, 5123, (class98_sub22_sub2.data), class98_sub22_sub2.position));
					this.aHa_Sub1_5206.method1865(i_69_, 4, class156_sub1, false, 0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ok.F(" + i + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ',' + (bools != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	s_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_78_, int i_79_, int i_80_, int[][] is, int[][] is_81_, int i_82_) {
		super(i_79_, i_80_, i_82_, is);
		do {
			try {
				anInt5191 = -2 + this.anInt2200;
				this.aHa_Sub1_5206 = var_ha_Sub1;
				this.anIntArrayArrayArray5194 = new int[i_79_][i_80_][];
				this.anIntArrayArrayArray5210 = new int[i_79_][i_80_][];
				this.anIntArrayArrayArray5192 = new int[i_79_][i_80_][];
				this.aShortArrayArray5196 = new short[i_80_ * i_79_][];
				aByteArrayArray5212 = new byte[1 + i_79_][1 + i_80_];
				anIntArrayArrayArray5193 = new int[i_79_][i_80_][];
				anInt5204 = 1 << anInt5191;
				anIntArrayArrayArray5195 = new int[i_79_][i_80_][];
				aFloatArrayArray5218 = (new float[this.anInt2203 - -1][this.anInt2204 - -1]);
				this.anInt5198 = i_78_;
				aFloatArrayArray5214 = (new float[this.anInt2203 + 1][this.anInt2204 - -1]);
				aClass98_Sub20ArrayArrayArray5190 = new Class98_Sub20[i_79_][i_80_][];
				aByteArrayArray5201 = new byte[i_79_][i_80_];
				aFloatArrayArray5223 = (new float[this.anInt2203 - -1][1 + this.anInt2204]);
				for (int i_83_ = 1; this.anInt2204 > i_83_; i_83_++) {
					for (int i_84_ = 1; (this.anInt2203 > i_84_); i_84_++) {
						int i_85_ = (-is_81_[-1 + i_84_][i_83_] + is_81_[1 + i_84_][i_83_]);
						int i_86_ = (is_81_[i_84_][1 + i_83_] + -is_81_[i_84_][-1 + i_83_]);
						float f = (float) (1.0 / (Math.sqrt(i_86_ * i_86_ + (4 * i_82_ * i_82_ + i_85_ * i_85_))));
						aFloatArrayArray5218[i_84_][i_83_] = f * (float) i_85_;
						aFloatArrayArray5214[i_84_][i_83_] = (float) (2 * -i_82_) * f;
						aFloatArrayArray5223[i_84_][i_83_] = (float) i_86_ * f;
					}
				}
				aClass377_5219 = new Class377(128);
				if ((this.anInt5198 & 0x10) == 0)
					break;
				aClass33_5209 = new Class33(this.aHa_Sub1_5206, this);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ok.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_78_ + ',' + i_79_ + ',' + i_80_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_81_ != null ? "{...}" : "null") + ',' + i_82_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method3418(r var_r, int i, int i_87_, int i_88_, int i_89_, boolean bool) {
		try {
			if (aClass33_5209 == null || var_r == null)
				return false;
			int i_90_ = (i - ((i_87_ * this.aHa_Sub1_5206.anInt4398) >> 8) >> this.aHa_Sub1_5206.anInt4319);
			int i_91_ = (i_88_ + -(i_87_ * (this.aHa_Sub1_5206.anInt4377) >> 8) >> this.aHa_Sub1_5206.anInt4319);
			return aClass33_5209.method325(var_r, -115, i_90_, i_91_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.O(" + (var_r != null ? "{...}" : "null") + ',' + i + ',' + i_87_ + ',' + i_88_ + ',' + i_89_ + ',' + bool + ')'));
		}
	}

	final void CA(r var_r, int i, int i_92_, int i_93_, int i_94_, boolean bool) {
		try {
			if (aClass33_5209 != null && var_r != null) {
				int i_95_ = (-((this.aHa_Sub1_5206.anInt4398 * i_92_) >> 8) + i >> this.aHa_Sub1_5206.anInt4319);
				int i_96_ = (i_93_ - (i_92_ * this.aHa_Sub1_5206.anInt4377 >> 8) >> this.aHa_Sub1_5206.anInt4319);
				aClass33_5209.method324((byte) 94, i_96_, i_95_, var_r);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.CA(" + (var_r != null ? "{...}" : "null") + ',' + i + ',' + i_92_ + ',' + i_93_ + ',' + i_94_ + ',' + bool + ')'));
		}
	}

	private final void method3429(int i, int i_97_, int i_98_, r_Sub1 var_r_Sub1) {
		try {
			int[] is = this.anIntArrayArrayArray5192[i][i_97_];
			int[] is_99_ = this.anIntArrayArrayArray5194[i][i_97_];
			int i_100_ = is.length;
			if ((this.aHa_Sub1_5206.anIntArray4471).length < i_100_) {
				this.aHa_Sub1_5206.anIntArray4471 = new int[i_100_];
				this.aHa_Sub1_5206.anIntArray4470 = new int[i_100_];
			}
			int[] is_101_ = this.aHa_Sub1_5206.anIntArray4471;
			int[] is_102_ = this.aHa_Sub1_5206.anIntArray4470;
			for (int i_103_ = 0; i_100_ > i_103_; i_103_++) {
				is_101_[i_103_] = (is[i_103_] >> this.aHa_Sub1_5206.anInt4319);
				is_102_[i_103_] = (is_99_[i_103_] >> this.aHa_Sub1_5206.anInt4319);
			}
			int i_104_ = i_98_;
			while (i_100_ > i_104_) {
				int i_105_ = is_101_[i_104_];
				int i_106_ = is_102_[i_104_++];
				int i_107_ = is_101_[i_104_];
				int i_108_ = is_102_[i_104_++];
				int i_109_ = is_101_[i_104_];
				int i_110_ = is_102_[i_104_++];
				if (((-i_107_ + i_105_) * (-i_110_ + i_108_) - (i_109_ - i_107_) * (-i_106_ + i_108_)) > 0)
					var_r_Sub1.method1648(i_106_, i_107_, i_105_, i_110_, i_108_, i_98_ + -119, i_109_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.B(" + i + ',' + i_97_ + ',' + i_98_ + ',' + (var_r_Sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3430(String string, int i) {
		try {
			if (string != null) {
				if (string.startsWith("*"))
					string = string.substring(1);
				String string_111_ = Class353.method3867(-1, string);
				if (string_111_ != null) {
					if (i != -23995)
						method3430(null, 68);
					for (int i_112_ = 0; i_112_ < Class248.anInt1897; i_112_++) {
						String string_113_ = Class246_Sub4_Sub1.aStringArray6171[i_112_];
						if (string_113_.startsWith("*"))
							string_113_ = string_113_.substring(1);
						string_113_ = Class353.method3867(-1, string_113_);
						if (string_113_ != null && string_113_.equals(string_111_)) {
							Class248.anInt1897--;
							for (int i_114_ = i_112_; (i_114_ < Class248.anInt1897); i_114_++) {
								Class246_Sub4_Sub1.aStringArray6171[i_114_] = (Class246_Sub4_Sub1.aStringArray6171[1 + i_114_]);
								Class255.aStringArray3209[i_114_] = Class255.aStringArray3209[1 + i_114_];
								Class98_Sub45.aStringArray4255[i_114_] = (Class98_Sub45.aStringArray4255[i_114_ + 1]);
								Class110.aStringArray945[i_114_] = Class110.aStringArray945[1 + i_114_];
								Class98_Sub10_Sub38.aBooleanArray5759[i_114_] = (Class98_Sub10_Sub38.aBooleanArray5759[i_114_ + 1]);
							}
							Class363.anInt3099 = Class24.anInt242;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(i + 24255, Class179.aClass171_1424, Class331.aClass117_2811));
							class98_sub11.packet.writeByte(r_Sub2.method1650(string, (byte) 106));
							class98_sub11.packet.method1188(string, (byte) 113);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.L(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3421(Class98_Sub5 class98_sub5, int[] is) {
		try {
			aClass148_5199.add_last(new Class98_Sub37((this.aHa_Sub1_5206), this, class98_sub5, is), -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.K(" + (class98_sub5 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3431(int i) {
		do {
			try {
				aClass279_5197 = null;
				IncomingOpcode.aClass58_5205 = null;
				aClass346_5202 = null;
				if (i < -116)
					break;
				aBoolean5207 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ok.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final r fa(int i, int i_115_, r var_r) {
		try {
			if ((0x1 & aByteArrayArray5201[i][i_115_]) == 0)
				return null;
			int i_116_ = (this.anInt2206 >> this.aHa_Sub1_5206.anInt4319);
			r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
			r_Sub1 var_r_Sub1_117_;
			do {
				if (var_r_Sub1 != null && var_r_Sub1.method1647(i_116_, (byte) -122, i_116_)) {
					var_r_Sub1_117_ = var_r_Sub1;
					var_r_Sub1_117_.method1646(93);
					if (!client.aBoolean3553)
						break;
				}
				var_r_Sub1_117_ = new r_Sub1(this.aHa_Sub1_5206, i_116_, i_116_);
			} while (false);
			var_r_Sub1_117_.method1643(0, i_116_, i_116_, 0, -1);
			method3429(i, i_115_, 0, var_r_Sub1_117_);
			return var_r_Sub1_117_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.fa(" + i + ',' + i_115_ + ',' + (var_r != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3416(int i, int i_118_, int i_119_, boolean[][] bools, boolean bool, int i_120_, int i_121_) {
		try {
			method3428(i_121_, i_120_, bool, i_119_, i, bools, 11490, i_118_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.N(" + i + ',' + i_118_ + ',' + i_119_ + ',' + (bools != null ? "{...}" : "null") + ',' + bool + ',' + i_120_ + ',' + i_121_ + ')'));
		}
	}

	final void YA() {
		try {
			if (anInt5217 <= 0)
				aClass33_5209 = null;
			else {
				byte[][] is = (new byte[1 + this.anInt2203][this.anInt2204 - -1]);
				for (int i = 1; this.anInt2203 > i; i++) {
					for (int i_122_ = 1; (this.anInt2204 > i_122_); i_122_++)
						is[i][i_122_] = (byte) ((aByteArrayArray5212[i][i_122_] >> 1) + (aByteArrayArray5212[i][1 + i_122_] >> 3) + ((aByteArrayArray5212[i][i_122_ - 1] >> 2) + (aByteArrayArray5212[1 + i][i_122_] >> 3) + (aByteArrayArray5212[i + -1][i_122_] >> 2)));
				}
				aClass98_Sub20Array5221 = new Class98_Sub20[aClass377_5219.method3999((byte) -6)];
				aClass377_5219.method3992(aClass98_Sub20Array5221, (byte) 74);
				for (int i = 0; (i < aClass98_Sub20Array5221.length); i++)
					aClass98_Sub20Array5221[i].method1175(anInt5217, (byte) -64);
				int i = 24;
				if (anIntArrayArrayArray5208 != null)
					i += 4;
				if ((this.anInt5198 & 0x7) != 0)
					i += 12;
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = this.aHa_Sub1_5206.aNativeHeap4323.a(i * anInt5217, false);
				Stream stream = new Stream(nativeheapbuffer);
				Class98_Sub20[] class98_sub20s = new Class98_Sub20[anInt5217];
				int i_123_ = Class23.method282(47, anInt5217 / 4);
				if (i_123_ < 1)
					i_123_ = 1;
				Class377 class377 = new Class377(i_123_);
				Class98_Sub20[] class98_sub20s_124_ = new Class98_Sub20[anInt5213];
				for (int i_125_ = 0; this.anInt2203 > i_125_; i_125_++) {
					for (int i_126_ = 0; i_126_ < this.anInt2204; i_126_++) {
						if ((this.anIntArrayArrayArray5210[i_125_][i_126_]) != null) {
							Class98_Sub20[] class98_sub20s_127_ = (aClass98_Sub20ArrayArrayArray5190[i_125_][i_126_]);
							int[] is_128_ = (this.anIntArrayArrayArray5192[i_125_][i_126_]);
							int[] is_129_ = (this.anIntArrayArrayArray5194[i_125_][i_126_]);
							int[] is_130_ = anIntArrayArrayArray5195[i_125_][i_126_];
							int[] is_131_ = (this.anIntArrayArrayArray5210[i_125_][i_126_]);
							int[] is_132_ = (anIntArrayArrayArray5193 == null ? null : anIntArrayArrayArray5193[i_125_][i_126_]);
							int[] is_133_ = (anIntArrayArrayArray5208 == null ? null : anIntArrayArrayArray5208[i_125_][i_126_]);
							if (is_130_ == null)
								is_130_ = is_131_;
							float f = aFloatArrayArray5218[i_125_][i_126_];
							float f_134_ = aFloatArrayArray5214[i_125_][i_126_];
							float f_135_ = aFloatArrayArray5223[i_125_][i_126_];
							float f_136_ = aFloatArrayArray5218[i_125_][1 + i_126_];
							float f_137_ = aFloatArrayArray5214[i_125_][i_126_ - -1];
							float f_138_ = aFloatArrayArray5223[i_125_][1 + i_126_];
							float f_139_ = (aFloatArrayArray5218[1 + i_125_][i_126_ - -1]);
							float f_140_ = aFloatArrayArray5214[i_125_ + 1][1 + i_126_];
							float f_141_ = (aFloatArrayArray5223[i_125_ - -1][i_126_ - -1]);
							float f_142_ = aFloatArrayArray5218[1 + i_125_][i_126_];
							float f_143_ = aFloatArrayArray5214[1 + i_125_][i_126_];
							float f_144_ = aFloatArrayArray5223[i_125_ - -1][i_126_];
							int i_145_ = 0xff & is[i_125_][i_126_];
							int i_146_ = 0xff & is[i_125_][i_126_ - -1];
							int i_147_ = is[1 + i_125_][i_126_ + 1] & 0xff;
							int i_148_ = is[i_125_ - -1][i_126_] & 0xff;
							int i_149_ = 0;
							while_137_: for (int i_150_ = 0; (is_131_.length > i_150_); i_150_++) {
								Class98_Sub20 class98_sub20 = class98_sub20s_127_[i_150_];
								for (int i_151_ = 0; i_149_ > i_151_; i_151_++) {
									if (class98_sub20 == class98_sub20s_124_[i_151_])
										continue while_137_;
								}
								class98_sub20s_124_[i_149_++] = class98_sub20;
							}
							short[] is_152_ = (this.aShortArrayArray5196[(this.anInt2203 * i_126_ - -i_125_)] = new short[is_131_.length]);
							for (int i_153_ = 0; (i_153_ < is_131_.length); i_153_++) {
								int i_154_ = ((i_125_ << this.anInt2200) + is_128_[i_153_]);
								int i_155_ = ((i_126_ << this.anInt2200) - -is_129_[i_153_]);
								int i_156_ = i_154_ >> anInt5191;
								int i_157_ = i_155_ >> anInt5191;
								int i_158_ = is_131_[i_153_];
								int i_159_ = is_130_[i_153_];
								int i_160_ = is_132_ != null ? is_132_[i_153_] : 0;
								long l = ((long) i_157_ | ((long) i_159_ << 48 | (long) i_158_ << 32 | (long) (i_156_ << 16)));
								int i_161_ = is_128_[i_153_];
								int i_162_ = is_129_[i_153_];
								int i_163_ = 74;
								int i_164_ = 0;
								float f_165_ = 1.0F;
								float f_166_;
								float f_167_;
								float f_168_;
								if (i_161_ != 0 || i_162_ != 0) {
									if (i_161_ != 0 || (this.anInt2206 != i_162_)) {
										if ((i_161_ != this.anInt2206) || (this.anInt2206 != i_162_)) {
											if (i_161_ == this.anInt2206 && i_162_ == 0) {
												f_168_ = f_142_;
												i_163_ -= i_148_;
												f_167_ = f_144_;
												f_166_ = f_143_;
											} else {
												float f_169_ = ((float) i_161_ / (float) (this.anInt2206));
												float f_170_ = ((float) i_162_ / (float) (this.anInt2206));
												float f_171_ = f + ((-f + f_142_) * f_169_);
												float f_172_ = (f_169_ * (f_143_ - f_134_) + f_134_);
												float f_173_ = (((f_144_ - f_135_) * f_169_) + f_135_);
												float f_174_ = (f_169_ * (f_139_ - f_136_) + f_136_);
												float f_175_ = (f_137_ + ((f_140_ - f_137_) * f_169_));
												float f_176_ = (((-f_138_ + f_141_) * f_169_) + f_138_);
												f_166_ = ((f_175_ - f_172_) * f_170_) + f_172_;
												f_168_ = (f_170_ * (-f_171_ + f_174_) + f_171_);
												f_167_ = ((f_176_ - f_173_) * f_170_) + f_173_;
												int i_177_ = (i_145_ + (i_161_ * (-i_145_ + i_148_) >> (this.anInt2200)));
												int i_178_ = (i_146_ + (i_161_ * (i_147_ - i_146_) >> (this.anInt2200)));
												i_163_ -= (i_177_ - -(((-i_177_ + i_178_) * i_162_) >> (this.anInt2200)));
											}
										} else {
											f_166_ = f_140_;
											f_167_ = f_141_;
											i_163_ -= i_147_;
											f_168_ = f_139_;
										}
									} else {
										f_166_ = f_137_;
										f_168_ = f_136_;
										f_167_ = f_138_;
										i_163_ -= i_146_;
									}
								} else {
									f_166_ = f_134_;
									i_163_ -= i_145_;
									f_167_ = f_135_;
									f_168_ = f;
								}
								if (i_158_ != -1) {
									int i_179_ = ((0x7f & i_158_) * i_163_ >> 7);
									if (i_179_ < 2)
										i_179_ = 2;
									else if (i_179_ > 126)
										i_179_ = 126;
									if ((this.anInt5198 & 0x7) == 0) {
										f_165_ = ((f_167_ * (this.aHa_Sub1_5206.aFloatArray4438[2])) + (f_168_ * (this.aHa_Sub1_5206.aFloatArray4438[0]) + (f_166_ * (this.aHa_Sub1_5206.aFloatArray4438[1]))));
										f_165_ = ((f_165_ > 0.0F ? (this.aHa_Sub1_5206.aFloat4435) : (this.aHa_Sub1_5206.aFloat4407)) * f_165_ + (this.aHa_Sub1_5206.aFloat4413));
									}
									i_164_ = (Class208.anIntArray1579[i_179_ | 0xff80 & i_158_]);
								}
								Node class98 = null;
								if (((i_154_ & -1 + anInt5204) == 0) && ((i_155_ & -1 + anInt5204) == 0))
									class98 = class377.method3990(l, -1);
								int i_180_;
								if (class98 != null) {
									is_152_[i_153_] = ((Class98_Sub40) class98).aShort4191;
									i_180_ = 0xffff & is_152_[i_153_];
									if (i_158_ != -1 && ((class98_sub20s[i_180_].uid) > class98_sub20s_127_[i_153_].uid))
										class98_sub20s[i_180_] = class98_sub20s_127_[i_153_];
								} else {
									int i_181_;
									if (i_159_ != i_158_) {
										int i_182_ = ((0x7f & i_159_) * i_163_ >> 7);
										if (i_182_ < 2)
											i_182_ = 2;
										else if (i_182_ > 126)
											i_182_ = 126;
										i_181_ = (Class208.anIntArray1579[i_159_ & 0xff80 | i_182_]);
										if ((0x7 & this.anInt5198) == 0) {
											float f_183_ = (f_166_ * (this.aHa_Sub1_5206.aFloatArray4438[1]) + ((this.aHa_Sub1_5206.aFloatArray4438[0]) * f_168_) + (f_167_ * (this.aHa_Sub1_5206.aFloatArray4438[2])));
											f_183_ = ((f_165_ * (!(f_165_ > 0.0F) ? (this.aHa_Sub1_5206.aFloat4407) : (this.aHa_Sub1_5206.aFloat4435))) + (this.aHa_Sub1_5206.aFloat4413));
											int i_184_ = ((0xff0cb1 & i_181_) >> 16);
											int i_185_ = ((i_181_ & 0xffc7) >> 8);
											int i_186_ = 0xff & i_181_;
											i_184_ *= f_183_;
											if (i_184_ >= 0) {
												if (i_184_ > 255)
													i_184_ = 255;
											} else
												i_184_ = 0;
											i_185_ *= f_183_;
											i_186_ *= f_183_;
											if (i_185_ < 0)
												i_185_ = 0;
											else if (i_185_ > 255)
												i_185_ = 255;
											if (i_186_ >= 0) {
												if (i_186_ > 255)
													i_186_ = 255;
											} else
												i_186_ = 0;
											i_181_ = (i_184_ << 16 | i_185_ << 8 | i_186_);
										}
									} else
										i_181_ = i_164_;
									if (this.aHa_Sub1_5206.aBoolean4397) {
										stream.b((float) i_154_);
										stream.b((float) (i_160_ + (this.method3417(i_154_, i_155_, true))));
										stream.b((float) i_155_);
										stream.e((byte) (i_181_ >> 16));
										stream.e((byte) (i_181_ >> 8));
										stream.e((byte) i_181_);
										stream.e(-1);
										stream.b((float) i_154_);
										stream.b((float) i_155_);
										if (anIntArrayArrayArray5208 != null)
											stream.b((float) (is_133_ != null ? -1 + (is_133_[i_153_]) : 0));
										if ((0x7 & this.anInt5198) != 0) {
											stream.b(f_168_);
											stream.b(f_166_);
											stream.b(f_167_);
										}
									} else {
										stream.a((float) i_154_);
										stream.a((float) (i_160_ + (this.method3417(i_154_, i_155_, true))));
										stream.a((float) i_155_);
										stream.e((byte) (i_181_ >> 16));
										stream.e((byte) (i_181_ >> 8));
										stream.e((byte) i_181_);
										stream.e(-1);
										stream.a((float) i_154_);
										stream.a((float) i_155_);
										if (anIntArrayArrayArray5208 != null)
											stream.a((float) (is_133_ == null ? 0 : -1 + (is_133_[i_153_])));
										if ((this.anInt5198 & 0x7) != 0) {
											stream.a(f_168_);
											stream.a(f_166_);
											stream.a(f_167_);
										}
									}
									i_180_ = anInt5203++;
									is_152_[i_153_] = (short) i_180_;
									if (i_158_ != -1)
										class98_sub20s[i_180_] = class98_sub20s_127_[i_153_];
									class377.method3996(new Class98_Sub40(is_152_[i_153_]), l, -1);
								}
								for (int i_187_ = 0; (i_187_ < i_149_); i_187_++)
									class98_sub20s_124_[i_187_].method1168(i_163_, (byte) 77, f_165_, i_164_, i_180_);
								anInt5211++;
							}
						}
					}
				}
				for (int i_188_ = 0; i_188_ < anInt5203; i_188_++) {
					Class98_Sub20 class98_sub20 = class98_sub20s[i_188_];
					if (class98_sub20 != null)
						class98_sub20.method1167(i_188_, true);
				}
				for (int i_189_ = 0; (i_189_ < this.anInt2203); i_189_++) {
					for (int i_190_ = 0; this.anInt2204 > i_190_; i_190_++) {
						short[] is_191_ = (this.aShortArrayArray5196[i_189_ + this.anInt2203 * i_190_]);
						if (is_191_ != null) {
							int i_192_ = 0;
							int i_193_ = 0;
							while (i_193_ < is_191_.length) {
								int i_194_ = is_191_[i_193_++] & 0xffff;
								int i_195_ = 0xffff & is_191_[i_193_++];
								int i_196_ = is_191_[i_193_++] & 0xffff;
								Class98_Sub20 class98_sub20 = class98_sub20s[i_194_];
								Class98_Sub20 class98_sub20_197_ = class98_sub20s[i_195_];
								Class98_Sub20 class98_sub20_198_ = class98_sub20s[i_196_];
								Class98_Sub20 class98_sub20_199_ = null;
								if (class98_sub20 != null) {
									class98_sub20.method1174(i_192_, (byte) 118, i_190_, i_189_);
									class98_sub20_199_ = class98_sub20;
								}
								if (class98_sub20_197_ != null) {
									class98_sub20_197_.method1174(i_192_, (byte) 123, i_190_, i_189_);
									if (class98_sub20_199_ == null || ((class98_sub20_197_.uid) < (class98_sub20_199_.uid)))
										class98_sub20_199_ = class98_sub20_197_;
								}
								if (class98_sub20_198_ != null) {
									class98_sub20_198_.method1174(i_192_, (byte) 125, i_190_, i_189_);
									if (class98_sub20_199_ == null || ((class98_sub20_198_.uid) < (class98_sub20_199_.uid)))
										class98_sub20_199_ = class98_sub20_198_;
								}
								if (class98_sub20_199_ != null) {
									if (class98_sub20 != null)
										class98_sub20_199_.method1167(i_194_, true);
									if (class98_sub20_197_ != null)
										class98_sub20_199_.method1167(i_195_, true);
									if (class98_sub20_198_ != null)
										class98_sub20_199_.method1167(i_196_, true);
									class98_sub20_199_.method1174(i_192_, (byte) 126, i_190_, i_189_);
								}
								i_192_++;
							}
						}
					}
				}
				stream.c();
				anInterface16_5220 = (this.aHa_Sub1_5206.method1843(i, (byte) 86, nativeheapbuffer, false, stream.b()));
				this.aClass104_5222 = new Class104(anInterface16_5220, 5126, 3, 0);
				aClass104_5216 = new Class104(anInterface16_5220, 5121, 4, 12);
				int i_200_;
				if (anIntArrayArrayArray5208 == null) {
					this.aClass104_5224 = new Class104(anInterface16_5220, 5126, 2, 16);
					i_200_ = 24;
				} else {
					this.aClass104_5224 = new Class104(anInterface16_5220, 5126, 3, 16);
					i_200_ = 28;
				}
				if ((this.anInt5198 & 0x7) != 0)
					this.aClass104_5215 = new Class104(anInterface16_5220, 5126, 3, i_200_);
				long[] ls = new long[aClass98_Sub20Array5221.length];
				for (int i_201_ = 0; (i_201_ < aClass98_Sub20Array5221.length); i_201_++) {
					Class98_Sub20 class98_sub20 = aClass98_Sub20Array5221[i_201_];
					ls[i_201_] = class98_sub20.uid;
					class98_sub20.method1170(true, anInt5203);
				}
				Class46.method436(aClass98_Sub20Array5221, false, ls);
				if (aClass33_5209 != null)
					aClass33_5209.method321(119);
			}
			this.anIntArrayArrayArray5210 = null;
			aByteArrayArray5212 = null;
			anIntArrayArrayArray5208 = null;
			anIntArrayArrayArray5195 = null;
			this.anIntArrayArrayArray5192 = this.anIntArrayArrayArray5194 = null;
			anIntArrayArrayArray5193 = null;
			aClass98_Sub20ArrayArrayArray5190 = null;
			aClass377_5219 = null;
			aFloatArrayArray5218 = aFloatArrayArray5214 = aFloatArrayArray5223 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ok.YA(" + ')');
		}
	}

	final void method3425(int i, int i_202_) {
		/* empty */
	}

	final void U(int i, int i_203_, int[] is, int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, int[] is_208_, int[] is_209_, int[] is_210_, int i_211_, int i_212_, int i_213_, boolean bool) {
		try {
			d var_d = this.aHa_Sub1_5206.aD938;
			if (is_204_ != null && anIntArrayArrayArray5193 == null)
				anIntArrayArrayArray5193 = new int[this.anInt2203][this.anInt2204][];
			if (is_206_ != null && anIntArrayArrayArray5208 == null)
				anIntArrayArrayArray5208 = new int[this.anInt2203][this.anInt2204][];
			this.anIntArrayArrayArray5192[i][i_203_] = is;
			this.anIntArrayArrayArray5194[i][i_203_] = is_205_;
			this.anIntArrayArrayArray5210[i][i_203_] = is_207_;
			anIntArrayArrayArray5195[i][i_203_] = is_208_;
			if (anIntArrayArrayArray5208 != null)
				anIntArrayArrayArray5208[i][i_203_] = is_206_;
			if (anIntArrayArrayArray5193 != null)
				anIntArrayArrayArray5193[i][i_203_] = is_204_;
			Class98_Sub20[] class98_sub20s = (aClass98_Sub20ArrayArrayArray5190[i][i_203_] = new Class98_Sub20[is_207_.length]);
			for (int i_214_ = 0; i_214_ < is_207_.length; i_214_++) {
				int i_215_ = is_209_[i_214_];
				int i_216_ = is_210_[i_214_];
				if ((this.anInt5198 & 0x20) != 0 && i_215_ != -1 && (var_d.method11(i_215_, -28755).aBoolean1825)) {
					i_215_ = -1;
					i_216_ = 128;
				}
				long l = ((long) i_212_ << 42 | (long) i_213_ << 48 | (long) i_211_ << 28 | (long) (i_216_ << 14) | (long) i_215_);
				Node class98;
				for (class98 = aClass377_5219.method3990(l, -1); class98 != null; class98 = aClass377_5219.method3993(122)) {
					Class98_Sub20 class98_sub20 = (Class98_Sub20) class98;
					if (i_215_ == class98_sub20.anInt3968 && (class98_sub20.aFloat3972 == (float) i_216_) && class98_sub20.anInt3971 == i_211_ && (class98_sub20.anInt3974 == i_212_) && (class98_sub20.anInt3975 == i_213_))
						break;
				}
				if (class98 != null)
					class98_sub20s[i_214_] = (Class98_Sub20) class98;
				else {
					class98_sub20s[i_214_] = new Class98_Sub20(this, i_215_, i_216_, i_211_, i_212_, i_213_);
					aClass377_5219.method3996(class98_sub20s[i_214_], l, -1);
				}
			}
			if (bool)
				aByteArrayArray5201[i][i_203_] = (byte) Class41.method366(aByteArrayArray5201[i][i_203_], 1);
			if (anInt5213 < is_207_.length)
				anInt5213 = is_207_.length;
			anInt5217 += is_207_.length;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.U(" + i + ',' + i_203_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_204_ != null ? "{...}" : "null") + ',' + (is_205_ != null ? "{...}" : "null") + ',' + (is_206_ != null ? "{...}" : "null") + ',' + (is_207_ != null ? "{...}" : "null") + ',' + (is_208_ != null ? "{...}" : "null") + ',' + (is_209_ != null ? "{...}" : "null") + ',' + (is_210_ != null ? "{...}" : "null") + ',' + i_211_ + ',' + i_212_ + ',' + i_213_ + ',' + bool + ')'));
		}
	}

	static final boolean method3432(int i, byte i_217_, int i_218_) {
		try {
			int i_219_ = 30 / ((i_217_ - 46) / 55);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.I(" + i + ',' + i_217_ + ',' + i_218_ + ')'));
		}
	}

	static final boolean method3433(int i, int i_220_, int i_221_) {
		try {
			if (i_220_ != 15849)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.E(" + i + ',' + i_220_ + ',' + i_221_ + ')'));
		}
	}

	static final void method3434(RuneScapeCache class207, boolean bool, int i, int i_222_, int i_223_, int i_224_) {
		do {
			try {
				Class98_Sub15.method1144(i, i_224_ + 16527, bool, i_223_, class207, i_222_, 0L);
				if (i_224_ == -16523)
					break;
				method3427(26, 118, -88, -119, (byte) -81, -59, -59);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ok.G(" + (class207 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_222_ + ',' + i_223_ + ',' + i_224_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3426(int i, int i_225_, int i_226_, boolean[][] bools, boolean bool, int i_227_) {
		try {
			method3428(i_227_, -1, bool, i_226_, i, bools, 11490, i_225_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ok.C(" + i + ',' + i_225_ + ',' + i_226_ + ',' + (bools != null ? "{...}" : "null") + ',' + bool + ',' + i_227_ + ')'));
		}
	}
}
