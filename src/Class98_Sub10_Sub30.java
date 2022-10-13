/* Class98_Sub10_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub30 extends Class98_Sub10 {
	static ha aHa5709;
	private int anInt5710 = 0;
	private int anInt5711;
	static boolean aBoolean5712 = false;
	private int anInt5713 = 1;

	final void method1001(byte i) {
		do {
			try {
				Class98_Sub31_Sub4.method1386(0);
				if (i == 66)
					break;
				method1094(51);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qo.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method990(int i, int i_0_) {
		try {
			int[] is = this.aClass16_3863.method237((byte) 98, i_0_);
			if (this.aClass16_3863.aBoolean198) {
				int i_1_ = Class352.anIntArray3001[i_0_];
				int i_2_ = i_1_ + -2048 >> 1;
				for (int i_3_ = 0; Class25.anInt268 > i_3_; i_3_++) {
					int i_4_ = Class64_Sub1.anIntArray3640[i_3_];
					int i_5_ = i_4_ - 2048 >> 1;
					int i_6_;
					if (anInt5711 != 0) {
						int i_7_ = i_5_ * i_5_ + i_2_ * i_2_ >> 12;
						i_6_ = (int) (Math.sqrt((float) i_7_ / 4096.0F) * 4096.0);
						i_6_ = (int) (3.141592653589793 * (double) (anInt5713 * i_6_));
					} else
						i_6_ = (-i_1_ + i_4_) * anInt5713;
					i_6_ -= ~0xfff & i_6_;
					if (anInt5710 != 0) {
						if (anInt5710 == 2) {
							i_6_ -= 2048;
							if (i_6_ < 0)
								i_6_ = -i_6_;
							i_6_ = -i_6_ + 2048 << 1;
						}
					} else
						i_6_ = ((aa_Sub2.anIntArray3565[(0xff8 & i_6_) >> 4]) - -4096 >> 1);
					is[i_3_] = i_6_;
				}
			}
			if (i != 255)
				method1094(-79);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qo.G(" + i + ',' + i_0_ + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_8_) {
		do {
			try {
				int i_9_ = i;
				while_162_: do {
					do {
						if (i_9_ != 0) {
							if (i_9_ != 1) {
								if (i_9_ == 3)
									break;
								break while_162_;
							}
						} else {
							anInt5711 = class98_sub22.readUnsignedByte();
							break while_162_;
						}
						anInt5710 = class98_sub22.readUnsignedByte();
						break while_162_;
					} while (false);
					anInt5713 = class98_sub22.readUnsignedByte();
				} while (false);
				if (i_8_ <= -92)
					break;
				anInt5711 = 61;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qo.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1093(int i, int i_10_, boolean bool, int i_11_) {
		do {
			try {
				if (i != -29680)
					aBoolean5712 = false;
				if (Class156_Sub1.aClass377_3277.method3990(i_11_, -1) != null)
					break;
				if (!Class372.aBoolean3152)
					Class291.method3414(-1, bool, i_11_);
				else {
					Class98_Sub36 class98_sub36 = new Class98_Sub36(i_11_, new Class237_Sub1(4096, (Class45.aClass207_385), i_11_), i_10_, bool);
					class98_sub36.aClass237_Sub1_4157.method2909(true, Class366.aStringArray3113[Class374.anInt3159]);
					Class156_Sub1.aClass377_3277.method3996(class98_sub36, i_11_, i + 29679);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qo.B(" + i + ',' + i_10_ + ',' + bool + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub30() {
		super(0, true);
		anInt5711 = 0;
	}

	public static void method1094(int i) {
		do {
			try {
				aHa5709 = null;
				if (i == 615)
					break;
				method1094(96);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qo.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
