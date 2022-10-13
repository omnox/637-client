/* Class98_Sub10_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub23 extends Class98_Sub10 {
	private int anInt5657;
	private int[] anIntArray5658;
	static int anInt5659;
	private int[] anIntArray5660;
	static int anInt5661 = 0;
	static Class335 aClass335_5662;
	private int anInt5663 = 0;
	private int anInt5664 = 10;

	public Class98_Sub10_Sub23() {
		super(0, true);
		anInt5657 = 2048;
	}

	final void method1001(byte i) {
		do {
			try {
				method1074((byte) -6);
				if (i == 66)
					break;
				aClass335_5662 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nu.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_0_) {
		do {
			try {
				int i_1_ = i;
				while_132_: do {
					do {
						if (i_1_ != 0) {
							if (i_1_ != 1) {
								if (i_1_ == 2)
									break;
								break while_132_;
							}
						} else {
							anInt5664 = class98_sub22.readUnsignedByte();
							break while_132_;
						}
						anInt5657 = class98_sub22.readShort();
						break while_132_;
					} while (false);
					anInt5663 = class98_sub22.readUnsignedByte();
				} while (false);
				if (i_0_ < -92)
					break;
				method1001((byte) 102);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("nu.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1073(int i) {
		do {
			try {
				aClass335_5662 = null;
				if (i == 4096)
					break;
				method1073(45);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nu.B(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1074(byte i) {
		try {
			anIntArray5658 = new int[1 + anInt5664];
			anIntArray5660 = new int[1 + anInt5664];
			int i_2_ = 0;
			int i_3_ = 4096 / anInt5664;
			int i_4_ = i_3_ * anInt5657 >> 12;
			int i_5_ = 0;
			if (i != -6)
				anInt5657 = -68;
			for (/**/; i_5_ < anInt5664; i_5_++) {
				anIntArray5660[i_5_] = i_2_;
				anIntArray5658[i_5_] = i_4_ + i_2_;
				i_2_ += i_3_;
			}
			anIntArray5660[anInt5664] = 4096;
			anIntArray5658[anInt5664] = anIntArray5658[0] + 4096;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nu.D(" + i + ')');
		}
	}

	final int[] method990(int i, int i_6_) {
		try {
			int[] is = this.aClass16_3863.method237((byte) 98, i_6_);
			if (this.aClass16_3863.aBoolean198) {
				int i_7_ = Class352.anIntArray3001[i_6_];
				if (anInt5663 == 0) {
					int i_8_ = 0;
					for (int i_9_ = 0; anInt5664 > i_9_; i_9_++) {
						if (anIntArray5660[i_9_] <= i_7_ && (i_7_ < anIntArray5660[1 + i_9_])) {
							if (i_7_ < anIntArray5658[i_9_])
								i_8_ = 4096;
							break;
						}
					}
					Class236.method2896(is, 0, Class25.anInt268, i_8_);
				} else {
					for (int i_10_ = 0; i_10_ < Class25.anInt268; i_10_++) {
						int i_11_ = 0;
						int i_12_ = 0;
						int i_13_ = Class64_Sub1.anIntArray3640[i_10_];
						int i_14_ = anInt5663;
						while_133_: do {
							do {
								if (i_14_ != 1) {
									if (i_14_ != 2) {
										if (i_14_ == 3)
											break;
										break while_133_;
									}
								} else {
									i_11_ = i_13_;
									break while_133_;
								}
								i_11_ = 2048 + (i_13_ + -4096 + i_7_ >> 1);
								break while_133_;
							} while (false);
							i_11_ = (i_13_ + -i_7_ >> 1) + 2048;
						} while (false);
						for (i_14_ = 0; i_14_ < anInt5664; i_14_++) {
							if ((i_11_ >= anIntArray5660[i_14_]) && (i_11_ < anIntArray5660[i_14_ - -1])) {
								if (i_11_ < anIntArray5658[i_14_])
									i_12_ = 4096;
								break;
							}
						}
						is[i_10_] = i_12_;
					}
				}
			}
			if (i != 255)
				anInt5661 = -81;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nu.G(" + i + ',' + i_6_ + ')');
		}
	}
}
