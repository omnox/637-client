
/* Class98_Sub10_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class98_Sub10_Sub19 extends Class98_Sub10 {
	private int anInt5628;
	private int anInt5629;
	static int anInt5630;
	static long aLong5631 = 0L;
	private int anInt5632;
	private int anInt5633 = 0;
	private int anInt5634;

	static final void method1057(int i, int i_0_) {
		try {
			if (i_0_ != 1024)
				method1057(93, 113);
			if (Class257.anInt1948 == 0)
				Class366.aClass98_Sub31_Sub2_3122.method1366(i, (byte) 58);
			else
				Class224_Sub3.anInt5037 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lp.B(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1058(byte i, ha var_ha) {
		try {
			if (i < -35) {
				Class242.aClass244Array1851 = new Class244[Class2.anIntArray70.length];
				for (int i_1_ = 0; ((Class2.anIntArray70.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
					int i_2_ = Class2.anIntArray70[i_1_];
					Class197 class197 = Class119_Sub1.method2182((Class64_Sub17.aClass207_3687), true, i_2_);
					Class43 class43 = (var_ha.method1804(class197, Class324.method3684(Class64_Sub16.aClass207_3683, i_2_), true));
					Class242.aClass244Array1851[i_1_] = new Class244(class43, class197);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lp.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_3_) {
		do {
			try {
				int i_4_ = i;
				while_117_: do {
					while_116_: do {
						while_115_: do {
							do {
								if (i_4_ != 0) {
									if (i_4_ != 1) {
										if (i_4_ != 2) {
											if ((i_4_ ^ 0xffffffff) != -4) {
												if ((i_4_ ^ 0xffffffff) == -5)
													break while_116_;
												break while_117_;
											}
										} else
											break;
										break while_115_;
									}
								} else {
									anInt5628 = class98_sub22.readUnsignedByte();
									break while_117_;
								}
								anInt5632 = class98_sub22.readShort();
								break while_117_;
							} while (false);
							anInt5629 = class98_sub22.readUnsignedByte();
							break while_117_;
						} while (false);
						anInt5633 = class98_sub22.readShort();
						break while_117_;
					} while (false);
					anInt5634 = class98_sub22.readShort();
				} while (false);
				if (i_3_ < -92)
					break;
				method1057(-103, -126);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lp.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final int[] method990(int i, int i_5_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237((byte) 98, i_5_);
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
				int i_6_ = anInt5634 >> 471123713;
				int[][] is_7_ = ((Class98_Sub10) this).aClass16_3863.method238(-4);
				Random random = new Random((long) anInt5628);
				for (int i_8_ = 0; (anInt5632 ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
					int i_9_ = (anInt5634 <= 0 ? anInt5633 : (anInt5633 + -i_6_ + Class63.method546(-28737, anInt5634, random)));
					i_9_ = (0xffb & i_9_) >> -745670044;
					int i_10_ = Class63.method546(-28737, Class25.anInt268, random);
					int i_11_ = Class63.method546(i ^ ~0x70bf, Class63.anInt492, random);
					int i_12_ = (anInt5629 * Class278_Sub1.anIntArray5168[i_9_] >> 1421866124) + i_10_;
					int i_13_ = i_11_ + (aa_Sub2.anIntArray3565[i_9_] * anInt5629 >> -8291220);
					int i_14_ = -i_11_ + i_13_;
					int i_15_ = -i_10_ + i_12_;
					if (i_15_ != 0 || (i_14_ ^ 0xffffffff) != -1) {
						if (i_14_ < 0)
							i_14_ = -i_14_;
						if ((i_15_ ^ 0xffffffff) > -1)
							i_15_ = -i_15_;
						boolean bool = i_15_ < i_14_;
						if (bool) {
							int i_16_ = i_10_;
							i_10_ = i_11_;
							int i_17_ = i_12_;
							i_12_ = i_13_;
							i_11_ = i_16_;
							i_13_ = i_17_;
						}
						if (i_10_ > i_12_) {
							int i_18_ = i_10_;
							int i_19_ = i_11_;
							i_10_ = i_12_;
							i_11_ = i_13_;
							i_12_ = i_18_;
							i_13_ = i_19_;
						}
						int i_20_ = i_11_;
						int i_21_ = -i_10_ + i_12_;
						int i_22_ = i_13_ - i_11_;
						int i_23_ = -i_21_ / 2;
						int i_24_ = 2048 / i_21_;
						int i_25_ = (-(Class63.method546(-28737, 4096, random) >> -951063678) + 1024);
						if ((i_22_ ^ 0xffffffff) > -1)
							i_22_ = -i_22_;
						int i_26_ = i_13_ > i_11_ ? 1 : -1;
						for (int i_27_ = i_10_; i_27_ < i_12_; i_27_++) {
							int i_28_ = (i_27_ - i_10_) * i_24_ + i_25_ - -1024;
							int i_29_ = Class329.anInt2761 & i_27_;
							int i_30_ = i_20_ & za_Sub1.anInt6075;
							i_23_ += i_22_;
							if (bool)
								is_7_[i_30_][i_29_] = i_28_;
							else
								is_7_[i_29_][i_30_] = i_28_;
							if ((i_23_ ^ 0xffffffff) < -1) {
								i_20_ -= -i_26_;
								i_23_ = -i_21_ + i_23_;
							}
						}
					}
				}
			}
			if (i != 255)
				method1001((byte) -38);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lp.G(" + i + ',' + i_5_ + ')');
		}
	}

	public Class98_Sub10_Sub19() {
		super(0, true);
		anInt5628 = 0;
		anInt5629 = 16;
		anInt5634 = 4096;
		anInt5632 = 2000;
	}

	final void method1001(byte i) {
		try {
			if (i == 66)
				Class98_Sub31_Sub4.method1386(i + -66);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lp.I(" + i + ')');
		}
	}

	static final void method1059(boolean bool, int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		try {
			int i_36_ = Class263.method3219(false, Class218.anInt1635, Class98_Sub10_Sub38.anInt5753, i_32_);
			int i_37_ = Class263.method3219(bool, Class218.anInt1635, Class98_Sub10_Sub38.anInt5753, i_35_);
			int i_38_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i);
			int i_39_ = Class263.method3219(bool, Class3.anInt77, Class76_Sub8.anInt3778, i_34_);
			int i_40_ = Class263.method3219(bool, Class218.anInt1635, Class98_Sub10_Sub38.anInt5753, i_33_ + i_32_);
			int i_41_ = Class263.method3219(bool, Class218.anInt1635, Class98_Sub10_Sub38.anInt5753, -i_33_ + i_35_);
			for (int i_42_ = i_36_; i_40_ > i_42_; i_42_++)
				Class333.method3761(i_31_, Class97.anIntArrayArray814[i_42_], i_38_, i_39_, (byte) -123);
			for (int i_43_ = i_37_; i_43_ > i_41_; i_43_--)
				Class333.method3761(i_31_, Class97.anIntArrayArray814[i_43_], i_38_, i_39_, (byte) -128);
			int i_44_ = Class263.method3219(bool, Class3.anInt77, Class76_Sub8.anInt3778, i_33_ + i);
			int i_45_ = Class263.method3219(false, Class3.anInt77, Class76_Sub8.anInt3778, i_34_ - i_33_);
			for (int i_46_ = i_40_; (i_41_ ^ 0xffffffff) <= (i_46_ ^ 0xffffffff); i_46_++) {
				int[] is = Class97.anIntArrayArray814[i_46_];
				Class333.method3761(i_31_, is, i_38_, i_44_, (byte) -124);
				Class333.method3761(i_31_, is, i_45_, i_39_, (byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lp.D(" + bool + ',' + i + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}
}
