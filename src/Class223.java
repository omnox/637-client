/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class223 {
	private LinkedList aClass148_1673;
	private int anInt1674;
	private int anInt1675 = -1;
	static int anInt1676 = 0;
	private int anInt1677;
	private Class98_Sub9[] aClass98_Sub9Array1678;
	static boolean aBoolean1679 = false;
	private int[][][] anIntArrayArrayArray1680;
	static RuneScapeCache aClass207_1681;
	private int anInt1682 = 0;
	boolean aBoolean1683;

	final int[][] method2828(int i, int i_0_) {
		try {
			if (i_0_ != 0)
				return null;
			if ((anInt1674 ^ 0xffffffff) == (anInt1677 ^ 0xffffffff)) {
				((Class223) this).aBoolean1683 = aClass98_Sub9Array1678[i] == null;
				aClass98_Sub9Array1678[i] = Class354.aClass98_Sub9_3014;
				return anIntArrayArrayArray1680[i];
			}
			if (anInt1677 == 1) {
				((Class223) this).aBoolean1683 = (anInt1675 ^ 0xffffffff) != (i ^ 0xffffffff);
				anInt1675 = i;
				return anIntArrayArrayArray1680[0];
			}
			Class98_Sub9 class98_sub9 = aClass98_Sub9Array1678[i];
			if (class98_sub9 == null) {
				((Class223) this).aBoolean1683 = true;
				if ((anInt1677 ^ 0xffffffff) < (anInt1682 ^ 0xffffffff)) {
					class98_sub9 = new Class98_Sub9(i, anInt1682);
					anInt1682++;
				} else {
					Class98_Sub9 class98_sub9_1_ = (Class98_Sub9) aClass148_1673.method2427(i_0_ + -52);
					class98_sub9 = new Class98_Sub9(i, (((Class98_Sub9) class98_sub9_1_).anInt3853));
					aClass98_Sub9Array1678[(((Class98_Sub9) class98_sub9_1_).anInt3852)] = null;
					class98_sub9_1_.remove();
				}
				aClass98_Sub9Array1678[i] = class98_sub9;
			} else
				((Class223) this).aBoolean1683 = false;
			aClass148_1673.method2423(-2, class98_sub9);
			return (anIntArrayArrayArray1680[((Class98_Sub9) class98_sub9).anInt3853]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oea.E(" + i + ',' + i_0_ + ')');
		}
	}

	static final short[] method2829(short[] is, int i, int i_2_) {
		try {
			short[] is_3_ = new short[i];
			Class236.method2895(is, 0, is_3_, 0, i);
			if (i_2_ != 26813)
				return null;
			return is_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oea.D(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')'));
		}
	}

	final int[][][] method2830(int i) {
		try {
			if (i != 26279)
				method2828(-62, -13);
			if ((anInt1674 ^ 0xffffffff) != (anInt1677 ^ 0xffffffff))
				throw new RuntimeException("Can only retrieve a full image cache");
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (anInt1677 ^ 0xffffffff); i_4_++)
				aClass98_Sub9Array1678[i_4_] = Class354.aClass98_Sub9_3014;
			return anIntArrayArrayArray1680;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oea.B(" + i + ')');
		}
	}

	final void method2831(int i) {
		try {
			for (int i_5_ = i; i_5_ < anInt1677; i_5_++) {
				anIntArrayArrayArray1680[i_5_][0] = null;
				anIntArrayArrayArray1680[i_5_][1] = null;
				anIntArrayArrayArray1680[i_5_][2] = null;
				anIntArrayArrayArray1680[i_5_] = null;
			}
			anIntArrayArrayArray1680 = null;
			aClass98_Sub9Array1678 = null;
			aClass148_1673.method2422((byte) 47);
			aClass148_1673 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oea.C(" + i + ')');
		}
	}

	public static void method2832(byte i) {
		try {
			if (i <= 45)
				aClass207_1681 = null;
			aClass207_1681 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oea.A(" + i + ')');
		}
	}

	Class223(int i, int i_6_, int i_7_) {
		aClass148_1673 = new LinkedList();
		((Class223) this).aBoolean1683 = false;
		try {
			anInt1674 = i_6_;
			anInt1677 = i;
			anIntArrayArrayArray1680 = new int[anInt1677][3][i_7_];
			aClass98_Sub9Array1678 = new Class98_Sub9[anInt1674];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oea.<init>(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}
}
