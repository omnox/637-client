/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class63 {
	static int[] anIntArray491 = new int[6];
	static int anInt492;
	static int anInt493;

	final int method545(int i, int i_0_, byte i_1_) {
		try {
			int i_2_ = Class39_Sub1.anInt3593 > i ? Class39_Sub1.anInt3593 : i;
			int i_3_ = 39 / ((i_1_ - -39) / 42);
			if (this == Class98_Sub35.aClass63_4151)
				return 0;
			if (this == za.aClass63_4296)
				return -i_0_ + i_2_;
			if (this == Class368.aClass63_3126)
				return (i_2_ - i_0_) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ee.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final int method546(int i, int i_4_, Random random) {
		try {
			if (i_4_ <= 0)
				throw new IllegalArgumentException();
			if (Class81.method815(i_4_, 0))
				return (int) (((0xffffffffL & (long) random.nextInt()) * (long) i_4_) >> -1163578144);
			if (i != -28737)
				method549(null, false, (byte) 77);
			int i_5_ = -(int) (4294967296L % (long) i_4_) + -2147483648;
			int i_6_;
			do
				i_6_ = random.nextInt();
			while (i_5_ <= i_6_);
			return Class198.method2678((byte) 6, i_6_, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ee.D(" + i + ',' + i_4_ + ',' + (random != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method547(int i, int i_7_, Class228 class228, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			if (i_8_ != 0)
				anInt492 = 76;
			if (!Class98_Sub17.aBoolean3942 || !Class135.aBoolean1052)
				return false;
			if ((Class4.anInt81 ^ 0xffffffff) > -101)
				return false;
			if ((i_9_ ^ 0xffffffff) == (i ^ 0xffffffff) && i_10_ == i_7_) {
				if (!Class76_Sub5.method758((byte) 105, i_11_, i_7_, i))
					return false;
				if (Class98_Sub46_Sub14.method1607(class228, (byte) 86)) {
					Class151_Sub7.anInt5006++;
					return true;
				}
				return false;
			}
			for (int i_12_ = i; (i_9_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff); i_12_++) {
				for (int i_13_ = i_7_; (i_13_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff); i_13_++) {
					if ((Class98_Sub46_Sub13_Sub2.anIntArrayArrayArray6311[i_11_][i_12_][i_13_]) == -Class356.anInt3020)
						return false;
				}
			}
			if (!Class98_Sub46_Sub14.method1607(class228, (byte) 112))
				return false;
			Class151_Sub7.anInt5006++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ee.A(" + i + ',' + i_7_ + ',' + (class228 != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	public Class63() {
		/* empty */
	}

	public static void method548(byte i) {
		try {
			if (i != -60)
				anInt492 = 107;
			anIntArray491 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ee.B(" + i + ')');
		}
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ee.toString(" + ')');
		}
	}

	static final void method549(GameInterfaceData class293, boolean bool, byte i) {
		do {
			try {
				int i_14_ = (((GameInterfaceData) class293).anInt2290 != 0 ? ((GameInterfaceData) class293).anInt2290 : ((GameInterfaceData) class293).anInt2311);
				int i_15_ = ((((GameInterfaceData) class293).anInt2228 ^ 0xffffffff) == -1 ? ((GameInterfaceData) class293).anInt2258 : ((GameInterfaceData) class293).anInt2228);
				Class224_Sub2.method2837(bool, (Class159.gameInterfaces[(((GameInterfaceData) class293).anInt2248 >> 949187376)]), i_14_, true, i_15_, ((GameInterfaceData) class293).anInt2248);
				int i_16_ = -112 % ((3 - i) / 40);
				if (((GameInterfaceData) class293).interfaceComponents != null)
					Class224_Sub2.method2837(bool, (((GameInterfaceData) class293).interfaceComponents), i_14_, true, i_15_, ((GameInterfaceData) class293).anInt2248);
				GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990((long) (((GameInterfaceData) class293).anInt2248), -1));
				if (class98_sub18 == null)
					break;
				Class378.method4005(i_14_, ((GameInterface) class98_sub18).interfaceID, -1, bool, i_15_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ee.E(" + (class293 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}
}
