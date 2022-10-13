/* Class98_Sub10_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub10 extends Class98_Sub10 {
	private int anInt5588;
	static int[] anIntArray5589;
	static int[] anIntArray5590 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };
	private int anInt5591 = 1024;
	private int anInt5592;
	static String aString5593 = null;

	final int[] method990(int i, int i_0_) {
		try {
			if (i != 255)
				method1001((byte) -46);
			int[] is = this.aClass16_3863.method237((byte) 98, i_0_);
			if (this.aClass16_3863.aBoolean198) {
				int[] is_1_ = this.method1000(i_0_, 0, 0);
				for (int i_2_ = 0; i_2_ < Class25.anInt268; i_2_++)
					is[i_2_] = anInt5591 + (is_1_[i_2_] * anInt5588 >> 12);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ev.G(" + i + ',' + i_0_ + ')');
		}
	}

	static final Class method1037(int i, String string) throws ClassNotFoundException {
		try {
			if (string.equals("B"))
				return Byte.TYPE;
			if (string.equals("I"))
				return Integer.TYPE;
			if (string.equals("S"))
				return Short.TYPE;
			int i_3_ = -24 % ((-20 - i) / 59);
			if (string.equals("J"))
				return Long.TYPE;
			if (string.equals("Z"))
				return Boolean.TYPE;
			if (string.equals("F"))
				return Float.TYPE;
			if (string.equals("D"))
				return Double.TYPE;
			if (string.equals("C"))
				return Character.TYPE;
			return Class.forName(string);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ev.E(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1038(Mobile class246_sub3_sub4_sub2, int i, int i_4_) {
		try {
			int i_5_ = -1;
			int i_6_ = 0;
			if ((class246_sub3_sub4_sub2.anInt6390) <= Class215.anInt1614) {
				if ((class246_sub3_sub4_sub2.anInt6424) >= Class215.anInt1614)
					GameInterfaceData.method3466((byte) 20, class246_sub3_sub4_sub2);
				else {
					Class333.method3762((byte) 38, false, class246_sub3_sub4_sub2);
					i_6_ = Class366.anInt3121;
					i_5_ = Class64_Sub23.anInt3708;
				}
			} else
				Class165.method2523(i_4_ + 24500, class246_sub3_sub4_sub2);
			if (class246_sub3_sub4_sub2.localXPos < 512 || class246_sub3_sub4_sub2.localYPos < 512 || (class246_sub3_sub4_sub2.localXPos >= -512 + 512 * GameWorld.size_x) || (512 * GameWorld.size_y - 512 <= class246_sub3_sub4_sub2.localYPos)) {
				class246_sub3_sub4_sub2.anInt6379 = -1;
				class246_sub3_sub4_sub2.anIntArray6373 = null;
				class246_sub3_sub4_sub2.anInt6365 = -1;
				i_5_ = -1;
				i_6_ = 0;
				class246_sub3_sub4_sub2.anInt6424 = 0;
				class246_sub3_sub4_sub2.anInt6413 = -1;
				class246_sub3_sub4_sub2.anInt6390 = 0;
				class246_sub3_sub4_sub2.localXPos = ((class246_sub3_sub4_sub2.walkQueueX[0]) * 512 - -(256 * class246_sub3_sub4_sub2.getSize()));
				class246_sub3_sub4_sub2.localYPos = ((class246_sub3_sub4_sub2.walkQueueZ[0]) * 512 + 256 * class246_sub3_sub4_sub2.getSize());
				class246_sub3_sub4_sub2.method3031(0);
			}
			if (i_4_ != -12212)
				anIntArray5589 = null;
			if ((class246_sub3_sub4_sub2 == Player.selfPlayer) && (class246_sub3_sub4_sub2.localXPos < 6144 || class246_sub3_sub4_sub2.localYPos < 6144 || (class246_sub3_sub4_sub2.localXPos >= (-12 + GameWorld.size_x) * 512) || ((-12 + GameWorld.size_y) * 512 <= (class246_sub3_sub4_sub2.localYPos)))) {
				class246_sub3_sub4_sub2.anIntArray6373 = null;
				class246_sub3_sub4_sub2.anInt6424 = 0;
				i_5_ = -1;
				class246_sub3_sub4_sub2.anInt6413 = -1;
				class246_sub3_sub4_sub2.anInt6379 = -1;
				class246_sub3_sub4_sub2.anInt6365 = -1;
				i_6_ = 0;
				class246_sub3_sub4_sub2.anInt6390 = 0;
				class246_sub3_sub4_sub2.localXPos = (512 * class246_sub3_sub4_sub2.walkQueueX[0] + 256 * class246_sub3_sub4_sub2.getSize());
				class246_sub3_sub4_sub2.localYPos = (512 * class246_sub3_sub4_sub2.walkQueueZ[0] + 256 * class246_sub3_sub4_sub2.getSize());
				class246_sub3_sub4_sub2.method3031(0);
			}
			int i_7_ = Class98_Sub10_Sub13.method1041(class246_sub3_sub4_sub2, 0);
			Class108.method1729(i_4_ + 12114, class246_sub3_sub4_sub2);
			Class284_Sub1_Sub2.method3370(i_6_, i_4_ + 18356, class246_sub3_sub4_sub2, i_5_, i_7_);
			Class282.method3334((byte) 37, i_5_, class246_sub3_sub4_sub2);
			Class340.method3801(class246_sub3_sub4_sub2, -28111);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ev.D(" + (class246_sub3_sub4_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ')'));
		}
	}

	public Class98_Sub10_Sub10() {
		super(1, false);
		anInt5588 = 2048;
		anInt5592 = 3072;
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_8_) {
		while_79_: do {
			try {
				if (i_8_ > -92)
					method997(64, -121);
				int i_9_ = i;
				do {
					if (i_9_ != 0) {
						if (i_9_ != 1) {
							if (i_9_ == 2)
								break;
							break while_79_;
						}
					} else {
						anInt5591 = class98_sub22.readShort();
						break while_79_;
					}
					anInt5592 = class98_sub22.readShort();
					break while_79_;
				} while (false);
				this.aBoolean3861 = class98_sub22.readUnsignedByte() == 1;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ev.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_8_ + ')'));
			}
		} while (false);
	}

	public static void method1039(int i) {
		try {
			anIntArray5589 = null;
			int i_10_ = -70 % ((-39 - i) / 52);
			aString5593 = null;
			anIntArray5590 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ev.B(" + i + ')');
		}
	}

	final int[][] method997(int i, int i_11_) {
		try {
			int[][] is = this.aClass223_3859.method2828(i_11_, 0);
			if (this.aClass223_3859.aBoolean1683) {
				int[][] is_12_ = this.method994(i_11_, 24431, 0);
				int[] is_13_ = is_12_[0];
				int[] is_14_ = is_12_[1];
				int[] is_15_ = is_12_[2];
				int[] is_16_ = is[0];
				int[] is_17_ = is[1];
				int[] is_18_ = is[2];
				for (int i_19_ = 0; Class25.anInt268 > i_19_; i_19_++) {
					is_16_[i_19_] = anInt5591 - -(is_13_[i_19_] * anInt5588 >> 12);
					is_17_[i_19_] = ((anInt5588 * is_14_[i_19_] >> 12) + anInt5591);
					is_18_[i_19_] = (is_15_[i_19_] * anInt5588 >> 12) + anInt5591;
				}
			}
			if (i >= -76)
				method1038(null, 10, -90);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ev.C(" + i + ',' + i_11_ + ')');
		}
	}

	final void method1001(byte i) {
		do {
			try {
				anInt5588 = -anInt5591 + anInt5592;
				if (i == 66)
					break;
				method990(-42, 80);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ev.I(" + i + ')');
			}
			break;
		} while (false);
	}
}
