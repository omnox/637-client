/* Class98_Sub10_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub11 extends Class98_Sub10 {
	private boolean aBoolean5594 = true;
	private boolean aBoolean5595 = true;
	static LinkedList aClass148_5596 = new LinkedList();
	static short[][] aShortArrayArray5597;

	public static void method1040(int i) {
		try {
			aShortArrayArray5597 = null;
			int i_0_ = 62 % ((-2 - i) / 59);
			aClass148_5596 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fia.B(" + i + ')');
		}
	}

	final int[][] method997(int i, int i_1_) {
		try {
			int[][] is = this.aClass223_3859.method2828(i_1_, 0);
			if (i > -76)
				return null;
			if (this.aClass223_3859.aBoolean1683) {
				int[][] is_2_ = this.method994((!aBoolean5595 ? i_1_ : za_Sub1.anInt6075 - i_1_), 24431, 0);
				int[] is_3_ = is_2_[0];
				int[] is_4_ = is_2_[1];
				int[] is_5_ = is_2_[2];
				int[] is_6_ = is[0];
				int[] is_7_ = is[1];
				int[] is_8_ = is[2];
				if (!aBoolean5594) {
					for (int i_9_ = 0; i_9_ < Class25.anInt268; i_9_++) {
						is_6_[i_9_] = is_3_[i_9_];
						is_7_[i_9_] = is_4_[i_9_];
						is_8_[i_9_] = is_5_[i_9_];
					}
				} else {
					for (int i_10_ = 0; (i_10_ < Class25.anInt268); i_10_++) {
						is_6_[i_10_] = is_3_[Class329.anInt2761 - i_10_];
						is_7_[i_10_] = is_4_[-i_10_ + Class329.anInt2761];
						is_8_[i_10_] = is_5_[-i_10_ + Class329.anInt2761];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fia.C(" + i + ',' + i_1_ + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_11_) {
		do {
			try {
				int i_12_ = i;
				while_80_: do {
					do {
						if (i_12_ != 0) {
							if (i_12_ != 1) {
								if (i_12_ == 2)
									break;
								break while_80_;
							}
						} else {
							aBoolean5594 = class98_sub22.readUnsignedByte() == 1;
							break while_80_;
						}
						aBoolean5595 = class98_sub22.readUnsignedByte() == 1;
						break while_80_;
					} while (false);
					this.aBoolean3861 = class98_sub22.readUnsignedByte() == 1;
				} while (false);
				if (i_11_ <= -92)
					break;
				method991(7, null, (byte) -105);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fia.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub11() {
		super(1, false);
	}

	final int[] method990(int i, int i_13_) {
		try {
			if (i != 255)
				aBoolean5594 = true;
			int[] is = this.aClass16_3863.method237((byte) 98, i_13_);
			if (this.aClass16_3863.aBoolean198) {
				int[] is_14_ = this.method1000((!aBoolean5595 ? i_13_ : za_Sub1.anInt6075 - i_13_), 0, i ^ 0xff);
				if (aBoolean5594) {
					for (int i_15_ = 0; (Class25.anInt268 > i_15_); i_15_++)
						is[i_15_] = is_14_[-i_15_ + Class329.anInt2761];
				} else
					Class236.method2891(is_14_, 0, is, 0, Class25.anInt268);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fia.G(" + i + ',' + i_13_ + ')');
		}
	}
}
