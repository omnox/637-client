/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class182 {
	private int[][][] anIntArrayArrayArray1433 = new int[2][2][4];
	private int[][][] anIntArrayArrayArray1434 = new int[2][2][4];
	private static float[][] aFloatArrayArray1435 = new float[2][8];
	private static float aFloat1436;
	int[] anIntArray1437 = new int[2];
	static int[][] anIntArrayArray1438 = new int[2][8];
	static int anInt1439;
	private int[] anIntArray1440 = new int[2];

	final void method2612(RSByteBuffer class98_sub22, Class209 class209) {
		int i = class98_sub22.readUnsignedByte();
		this.anIntArray1437[0] = i >> 4;
		this.anIntArray1437[1] = i & 0xf;
		if (i != 0) {
			anIntArray1440[0] = class98_sub22.readShort();
			anIntArray1440[1] = class98_sub22.readShort();
			int i_0_ = class98_sub22.readUnsignedByte();
			for (int i_1_ = 0; i_1_ < 2; i_1_++) {
				for (int i_2_ = 0; i_2_ < this.anIntArray1437[i_1_]; i_2_++) {
					anIntArrayArrayArray1433[i_1_][0][i_2_] = class98_sub22.readShort();
					anIntArrayArrayArray1434[i_1_][0][i_2_] = class98_sub22.readShort();
				}
			}
			for (int i_3_ = 0; i_3_ < 2; i_3_++) {
				for (int i_4_ = 0; i_4_ < this.anIntArray1437[i_3_]; i_4_++) {
					if ((i_0_ & 1 << i_3_ * 4 << i_4_) != 0) {
						anIntArrayArrayArray1433[i_3_][1][i_4_] = class98_sub22.readShort();
						anIntArrayArrayArray1434[i_3_][1][i_4_] = class98_sub22.readShort();
					} else {
						anIntArrayArrayArray1433[i_3_][1][i_4_] = anIntArrayArrayArray1433[i_3_][0][i_4_];
						anIntArrayArrayArray1434[i_3_][1][i_4_] = anIntArrayArrayArray1434[i_3_][0][i_4_];
					}
				}
			}
			if (i_0_ != 0 || anIntArray1440[1] != anIntArray1440[0])
				class209.method2772(class98_sub22);
		} else
			anIntArray1440[0] = anIntArray1440[1] = 0;
	}

	final int method2613(int i, float f) {
		if (i == 0) {
			float f_5_ = ((float) anIntArray1440[0] + (float) (anIntArray1440[1] - anIntArray1440[0]) * f);
			f_5_ *= 0.0030517578F;
			aFloat1436 = (float) Math.pow(0.1, f_5_ / 20.0F);
			anInt1439 = (int) (aFloat1436 * 65536.0F);
		}
		if (this.anIntArray1437[i] == 0)
			return 0;
		float f_6_ = method2617(i, 0, f);
		aFloatArrayArray1435[i][0] = -2.0F * f_6_ * (float) Math.cos(method2615(i, 0, f));
		aFloatArrayArray1435[i][1] = f_6_ * f_6_;
		for (int i_7_ = 1; i_7_ < this.anIntArray1437[i]; i_7_++) {
			f_6_ = method2617(i, i_7_, f);
			float f_8_ = (-2.0F * f_6_ * (float) Math.cos(method2615(i, i_7_, f)));
			float f_9_ = f_6_ * f_6_;
			aFloatArrayArray1435[i][i_7_ * 2 + 1] = aFloatArrayArray1435[i][i_7_ * 2 - 1] * f_9_;
			aFloatArrayArray1435[i][i_7_ * 2] = (aFloatArrayArray1435[i][i_7_ * 2 - 1] * f_8_ + aFloatArrayArray1435[i][i_7_ * 2 - 2] * f_9_);
			for (int i_10_ = i_7_ * 2 - 1; i_10_ >= 2; i_10_--)
				aFloatArrayArray1435[i][i_10_] += (aFloatArrayArray1435[i][i_10_ - 1] * f_8_ + aFloatArrayArray1435[i][i_10_ - 2] * f_9_);
			aFloatArrayArray1435[i][1] += aFloatArrayArray1435[i][0] * f_8_ + f_9_;
			aFloatArrayArray1435[i][0] += f_8_;
		}
		if (i == 0) {
			for (int i_11_ = 0; i_11_ < this.anIntArray1437[0] * 2; i_11_++)
				aFloatArrayArray1435[0][i_11_] *= aFloat1436;
		}
		for (int i_12_ = 0; i_12_ < this.anIntArray1437[i] * 2; i_12_++)
			anIntArrayArray1438[i][i_12_] = (int) (aFloatArrayArray1435[i][i_12_] * 65536.0F);
		return this.anIntArray1437[i] * 2;
	}

	public static void method2614() {
		aFloatArrayArray1435 = null;
		anIntArrayArray1438 = null;
	}

	private final float method2615(int i, int i_13_, float f) {
		float f_14_ = ((float) anIntArrayArrayArray1433[i][0][i_13_] + f * (float) (anIntArrayArrayArray1433[i][1][i_13_] - anIntArrayArrayArray1433[i][0][i_13_]));
		f_14_ *= 1.2207031E-4F;
		return method2616(f_14_);
	}

	private static final float method2616(float f) {
		float f_15_ = 32.703197F * (float) Math.pow(2.0, f);
		return f_15_ * 3.1415927F / 11025.0F;
	}

	private final float method2617(int i, int i_16_, float f) {
		float f_17_ = ((float) anIntArrayArrayArray1434[i][0][i_16_] + f * (float) (anIntArrayArrayArray1434[i][1][i_16_] - anIntArrayArrayArray1434[i][0][i_16_]));
		f_17_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, -f_17_ / 20.0F);
	}

	public Class182() {
		/* empty */
	}
}
