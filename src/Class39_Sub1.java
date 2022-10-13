/* Class39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class39_Sub1 extends Class39 {
	static Class277 aClass277_3590 = Class354.method3872((byte) 83);
	public static int anInt3591;
	static Interface10[] anInterface10Array3592;
	static int anInt3593;
	static int anInt3594;
	private int[] anIntArray3595 = new int[512];

	final void method352(int i, int i_0_, float f, int i_1_, float f_2_, int i_3_, float f_4_, float f_5_, float[] fs, int i_6_, int i_7_) {
		try {
			int i_8_ = (int) ((float) i_6_ * f_4_ - (float) i_7_);
			i_8_ &= 0xff;
			int i_9_ = (int) (-1.0F + f_5_ * (float) i_0_);
			i_9_ &= 0xff;
			int i_10_ = (int) (-1.0F + (float) i * f);
			i_10_ &= 0xff;
			float f_11_ = (float) i_1_ * f;
			int i_12_ = (int) f_11_;
			int i_13_ = 1 + i_12_;
			float f_14_ = f_11_ - (float) i_12_;
			float f_15_ = 1.0F - f_14_;
			i_12_ &= i_10_;
			i_13_ &= i_10_;
			float f_16_ = Class119_Sub4.method2188(f_14_, 1024);
			int i_17_ = anIntArray3595[i_12_];
			int i_18_ = anIntArray3595[i_13_];
			for (int i_19_ = 0; i_0_ > i_19_; i_19_++) {
				float f_20_ = (float) i_19_ * f_5_;
				int i_21_ = (int) f_20_;
				int i_22_ = i_21_ + 1;
				float f_23_ = (float) -i_21_ + f_20_;
				float f_24_ = -f_23_ + 1.0F;
				float f_25_ = Class119_Sub4.method2188(f_23_, i_7_ + 1023);
				i_22_ &= i_9_;
				i_21_ &= i_9_;
				int i_26_ = anIntArray3595[i_17_ + i_21_];
				int i_27_ = anIntArray3595[i_17_ + i_22_];
				int i_28_ = anIntArray3595[i_21_ - -i_18_];
				int i_29_ = anIntArray3595[i_18_ + i_22_];
				for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_30_++) {
					float f_31_ = f_4_ * (float) i_30_;
					int i_32_ = (int) f_31_;
					int i_33_ = i_32_ - -1;
					float f_34_ = f_31_ - (float) i_32_;
					float f_35_ = -f_34_ + 1.0F;
					float f_36_ = Class119_Sub4.method2188(f_34_, 1024);
					i_32_ &= i_8_;
					i_33_ &= i_8_;
					fs[i_3_++] = (Class98_Sub10_Sub5.method1014((Class98_Sub10_Sub5.method1014((Class98_Sub10_Sub5.method1014((ModelDefinitions.method2588(f_35_, Class202.method2702((anIntArray3595[i_26_ + i_32_]), 7), -24576, f_24_, f_15_)), (byte) 112, (ModelDefinitions.method2588(f_34_, Class202.method2702(7, (anIntArray3595[i_26_ + i_33_])), -24576, f_24_, f_15_)), f_36_)), (byte) -107, (Class98_Sub10_Sub5.method1014((ModelDefinitions.method2588(f_35_, Class202.method2702(7, (anIntArray3595[i_27_ + i_32_])), -24576, f_23_, f_15_)), (byte) 107, (ModelDefinitions.method2588(f_34_, Class202.method2702(7, (anIntArray3595[i_33_ - -i_27_])), -24576, f_23_, f_15_)), f_36_)), f_25_)), (byte) -124, (Class98_Sub10_Sub5.method1014((Class98_Sub10_Sub5.method1014((ModelDefinitions.method2588(f_35_, Class202.method2702((anIntArray3595[i_32_ + i_28_]), 7), -24576, f_24_, f_14_)), (byte) -89, (ModelDefinitions.method2588(f_34_, Class202.method2702(7, (anIntArray3595[i_28_ + i_33_])), i_7_ + -24577, f_24_, f_14_)), f_36_)), (byte) -103, (Class98_Sub10_Sub5.method1014((ModelDefinitions.method2588(f_35_, Class202.method2702(7, (anIntArray3595[i_29_ + i_32_])), -24576, f_23_, f_14_)), (byte) -108, (ModelDefinitions.method2588(f_34_, Class202.method2702(7, (anIntArray3595[i_33_ - -i_29_])), -24576, f_23_, f_14_)), f_36_)), f_25_)), f_16_)) * f_2_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kga.C(" + i + ',' + i_0_ + ',' + f + ',' + i_1_ + ',' + f_2_ + ',' + i_3_ + ',' + f_4_ + ',' + f_5_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public static void method354(byte i) {
		try {
			if (i != -107)
				method354((byte) 65);
			aClass277_3590 = null;
			anInterface10Array3592 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kga.A(" + i + ')');
		}
	}

	static final void method355(int i) {
		try {
			Class373.method3962((byte) 0);
			int i_37_ = -3 % ((-69 - i) / 32);
			Class246_Sub7.aClass48_5119 = null;
			VarpClass.aClass48_3245 = null;
			Class98_Sub46_Sub4.aClass48_5962 = null;
			Class76.aClass28ArrayArray586 = null;
			Class98_Sub37.aHa4185 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kga.B(" + i + ')');
		}
	}

	Class39_Sub1(int i) {
		try {
			Random random = new Random((long) i);
			for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -257; i_38_++)
				anIntArray3595[i_38_] = anIntArray3595[i_38_ + 256] = i_38_;
			for (int i_39_ = 0; i_39_ < 256; i_39_++) {
				int i_40_ = random.nextInt() & 0xff;
				int i_41_ = anIntArray3595[i_40_];
				anIntArray3595[i_40_] = anIntArray3595[256 + i_40_] = anIntArray3595[i_39_];
				anIntArray3595[i_39_] = anIntArray3595[i_39_ + 256] = i_41_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kga.<init>(" + i + ')');
		}
	}
}
