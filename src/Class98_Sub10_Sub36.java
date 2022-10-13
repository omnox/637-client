/* Class98_Sub10_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub36 extends Class98_Sub10 {
	static float[] aFloatArray5741;
	static float[] aFloatArray5742 = new float[16384];
	private Class119[] aClass119Array5743;
	static Class114[] aClass114Array5744;
	static Class143 aClass143_5745;

	final void method991(int i, RSByteBuffer class98_sub22, byte i_0_) {
		try {
			if (i == 0) {
				aClass119Array5743 = new Class119[class98_sub22.readUnsignedByte()];
				while_228_: for (int i_1_ = 0; (i_1_ < aClass119Array5743.length); i_1_++) {
					int i_2_ = class98_sub22.readUnsignedByte();
					int i_3_ = i_2_;
					while_226_: do {
						do {
							if (i_3_ != 0) {
								if (i_3_ != 1) {
									if (i_3_ != 2) {
										if (i_3_ != 3)
											continue while_228_;
									} else
										break;
									break while_226_;
								}
							} else {
								aClass119Array5743[i_1_] = Class255.method3192(-120, class98_sub22);
								continue while_228_;
							}
							aClass119Array5743[i_1_] = Class98_Sub10_Sub14.method1046(false, class98_sub22);
							continue while_228_;
						} while (false);
						aClass119Array5743[i_1_] = Class258.method3203((byte) -121, class98_sub22);
						continue while_228_;
					} while (false);
					aClass119Array5743[i_1_] = Class300.method3533(class98_sub22, (byte) 51);
				}
			} else if (i == 1)
				this.aBoolean3861 = class98_sub22.readUnsignedByte() == 1;
			if (i_0_ >= -92)
				aClass119Array5743 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("us.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final int[][] method997(int i, int i_4_) {
		try {
			if (i > -76)
				method997(-3, -64);
			int[][] is = this.aClass223_3859.method2828(i_4_, 0);
			if (this.aClass223_3859.aBoolean1683) {
				int i_5_ = Class25.anInt268;
				int i_6_ = Class63.anInt492;
				int[][] is_7_ = new int[i_6_][i_5_];
				int[][][] is_8_ = this.aClass223_3859.method2830(26279);
				method1111(true, is_7_);
				for (int i_9_ = 0; Class63.anInt492 > i_9_; i_9_++) {
					int[] is_10_ = is_7_[i_9_];
					int[][] is_11_ = is_8_[i_9_];
					int[] is_12_ = is_11_[0];
					int[] is_13_ = is_11_[1];
					int[] is_14_ = is_11_[2];
					for (int i_15_ = 0; i_15_ < Class25.anInt268; i_15_++) {
						int i_16_ = is_10_[i_15_];
						is_14_[i_15_] = Class202.method2702(i_16_, 255) << 4;
						is_13_[i_15_] = Class202.method2702(4080, i_16_ >> 4);
						is_12_[i_15_] = Class202.method2702(i_16_ >> 12, 4080);
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "us.C(" + i + ',' + i_4_ + ')');
		}
	}

	static final int method1110(byte i) {
		try {
			if (i <= 49)
				aClass143_5745 = null;
			if (Class98_Sub46.anInt4261 == 1)
				return aa_Sub1.anInt3556;
			return Class151_Sub7.anInt5005;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "us.D(" + i + ')');
		}
	}

	private final void method1111(boolean bool, int[][] is) {
		do {
			try {
				if (bool == true) {
					int i = Class25.anInt268;
					int i_17_ = Class63.anInt492;
					Class76_Sub5.method759((byte) -102, is);
					Class237.method2898(Class329.anInt2761, (byte) -118, za_Sub1.anInt6075, 0, 0);
					if (aClass119Array5743 == null)
						break;
					for (int i_18_ = 0; (aClass119Array5743.length > i_18_); i_18_++) {
						Class119 class119 = aClass119Array5743[i_18_];
						int i_19_ = class119.anInt988;
						int i_20_ = class119.anInt985;
						if (i_19_ < 0) {
							if (i_20_ >= 0)
								class119.method2179((byte) -96, i_17_, i);
						} else if (i_20_ >= 0)
							class119.method2174(i, i_17_, -5515);
						else
							class119.method2178(82, i, i_17_);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("us.B(" + bool + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[] method990(int i, int i_21_) {
		try {
			int[] is = this.aClass16_3863.method237((byte) 98, i_21_);
			if (i != 255)
				aClass114Array5744 = null;
			if (this.aClass16_3863.aBoolean198)
				method1111(true, this.aClass16_3863.method238(-124));
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "us.G(" + i + ',' + i_21_ + ')');
		}
	}

	public static void method1112(int i) {
		try {
			if (i == 0) {
				aClass114Array5744 = null;
				aClass143_5745 = null;
				aFloatArray5742 = null;
				aFloatArray5741 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "us.E(" + i + ')');
		}
	}

	public Class98_Sub10_Sub36() {
		super(0, true);
	}

	static {
		aFloatArray5741 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray5742[i] = (float) Math.sin(d * (double) i);
			aFloatArray5741[i] = (float) Math.cos(d * (double) i);
		}
	}
}
