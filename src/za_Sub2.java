
/* za_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class za_Sub2 extends za {
	static boolean aBoolean6079 = false;
	static int anInt6080 = -1;
	static double aDouble6081;
	NativeHeap aNativeHeap6082;

	static final void method1680(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ == 9767) {
				Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_0_, -68, 6);
				class98_sub46_sub17.method1626((byte) -103);
				((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ig.D(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1681(byte i) {
		do {
			try {
				((za_Sub2) this).aNativeHeap6082.b();
				if (i == 36)
					break;
				method1682(-128, -23, -19);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ig.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1682(int i, int i_2_, int i_3_) {
		try {
			if (i_2_ != 0)
				method1683(-45, 78);
			if ((i & 0x800) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ig.I(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	za_Sub2(int i) {
		try {
			((za_Sub2) this).aNativeHeap6082 = new NativeHeap(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ig.<init>(" + i + ')');
		}
	}

	static final boolean method1683(int i, int i_4_) {
		try {
			if (i != -11297)
				return false;
			if (i_4_ != 10 && (i_4_ ^ 0xffffffff) != -12 && i_4_ != 12)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ig.G(" + i + ',' + i_4_ + ')');
		}
	}

	static final void method1684(String string, int i, byte i_5_) {
		try {
			int i_6_ = -7 / ((i_5_ - 5) / 32);
			Class98_Sub45.add_message((byte) 122, i, string, 0, "", "", "");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ig.E(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ')'));
		}
	}

	static final void method1685(int i, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		do {
			try {
				do {
					if (i_7_ >= Class76_Sub8.anInt3778 && Class3.anInt77 >= i_7_ && ((Class76_Sub8.anInt3778 ^ 0xffffffff) >= (i ^ 0xffffffff)) && (i ^ 0xffffffff) >= (Class3.anInt77 ^ 0xffffffff) && ((Class76_Sub8.anInt3778 ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) && (Class3.anInt77 ^ 0xffffffff) <= (i_8_ ^ 0xffffffff) && i_14_ >= Class76_Sub8.anInt3778 && (Class3.anInt77 ^ 0xffffffff) <= (i_14_ ^ 0xffffffff) && i_13_ >= Class98_Sub10_Sub38.anInt5753 && (i_13_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff) && Class98_Sub10_Sub38.anInt5753 <= i_10_ && (i_10_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff) && i_9_ >= Class98_Sub10_Sub38.anInt5753 && Class218.anInt1635 >= i_9_ && ((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) && ((Class218.anInt1635 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff))) {
						Class176.method2579(i_13_, i_9_, i_11_, i, i_7_, i_12_, i_8_, i_14_, i_10_, 22024);
						if (!client.aBoolean3553)
							break;
					}
					Class339.method3788(i_7_, i_12_, i_9_, i, (byte) -67, i_14_, i_8_, i_11_, i_13_, i_10_);
				} while (false);
				if (bool == true)
					break;
				method1682(87, 47, -5);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ig.H(" + i + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}
}
