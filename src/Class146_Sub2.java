/* Class146_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaggl.OpenGL;

final class Class146_Sub2 extends AbstractModel {
	private int anInt4837;
	private Class322 aClass322_4838;
	private Interface16 anInterface16_4839;
	static boolean[] aBooleanArray4840 = new boolean[8];
	private short[] aShortArray4841;
	private short[] aShortArray4842;
	private int[] anIntArray4843;
	private short aShort4844;
	private short aShort4845;
	private int anInt4846 = 0;
	private boolean aBoolean4847 = false;
	private boolean aBoolean4848;
	private short[] aShortArray4849;
	private int[] anIntArray4850;
	private int[] anIntArray4851;
	private short[] aShortArray4852;
	private int anInt4853;
	private Class104 aClass104_4854;
	static int anInt4855 = -1;
	private int[] anIntArray4856;
	private boolean aBoolean4857;
	private byte[] aByteArray4858;
	private Class104 aClass104_4859;
	private short[] aShortArray4860;
	private Class219[] aClass219Array4861;
	private short aShort4862;
	private Class35[] aClass35Array4863;
	private short[] aShortArray4864;
	private ha_Sub1 aHa_Sub1_4865;
	private int anInt4866;
	private short aShort4867;
	private short aShort4868;
	private short[] aShortArray4869;
	private int[][] anIntArrayArray4870;
	private boolean aBoolean4871 = true;
	private short aShort4872;
	static int[] anIntArray4873;
	private Class104 aClass104_4874;
	private int[][] anIntArrayArray4875;
	private short aShort4876;
	private Class249[] aClass249Array4877;
	private short[] aShortArray4878;
	private short aShort4879;
	private Interface8 anInterface8_4880;
	private Class87[] aClass87Array4881;
	private byte[] aByteArray4882;
	private int anInt4883 = 0;
	private short[] aShortArray4884;
	private byte aByte4885;
	private int[] anIntArray4886;
	private short[] aShortArray4887;
	private int[][] anIntArrayArray4888;
	private Class104 aClass104_4889;
	private float[] aFloatArray4890;
	private short aShort4891;
	private short aShort4892;
	private int anInt4893;
	private int anInt4894;
	private short[] aShortArray4895;
	private int anInt4896;
	private float[] aFloatArray4897;
	private Class14 aClass14_4898;

	private final boolean method2377(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (i_6_ != 18818)
				anInt4866 = 66;
			if ((i_1_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff) && (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff) && i_1_ < i)
				return false;
			if ((i_5_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff) && i_0_ < i_1_ && (i_1_ ^ 0xffffffff) < (i ^ 0xffffffff))
				return false;
			if ((i_4_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff) && (i_7_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff) && i_7_ < i_2_)
				return false;
			if ((i_7_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff) && (i_3_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff) && i_2_ < i_7_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.K(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final int RA() {
		try {
			if (!aBoolean4847)
				method2380(-128);
			return aShort4862;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.RA(" + ')');
		}
	}

	final int V() {
		try {
			if (!aBoolean4847)
				method2380(-102);
			return aShort4845;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.V(" + ')');
		}
	}

	final int na() {
		try {
			if (!aBoolean4847)
				method2380(-118);
			return aShort4876;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.na(" + ')');
		}
	}

	final int ua() {
		try {
			return anInt4894;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.ua(" + ')');
		}
	}

	public static void method2378(int i) {
		try {
			anIntArray4873 = null;
			if (i != 0)
				findPathForDoubleSize(null, 93, -2, -11, 41, 13, 96, 27, -66, 57, -56);
			aBooleanArray4840 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.L(" + i + ')');
		}
	}

	final void aa(short i, short i_8_) {
		do {
			try {
				d var_d = ((ha) aHa_Sub1_4865).aD938;
				for (int i_9_ = 0; anInt4853 > i_9_; i_9_++) {
					if ((i ^ 0xffffffff) == (aShortArray4869[i_9_] ^ 0xffffffff))
						aShortArray4869[i_9_] = i_8_;
				}
				byte i_10_ = 0;
				byte i_11_ = 0;
				if (i != -1) {
					Class238 class238 = var_d.method11(i & 0xffff, -28755);
					i_10_ = ((Class238) class238).aByte1830;
					i_11_ = ((Class238) class238).aByte1829;
				}
				byte i_12_ = 0;
				byte i_13_ = 0;
				if (i_8_ != -1) {
					Class238 class238 = var_d.method11(i_8_ & 0xffff, -28755);
					i_13_ = ((Class238) class238).aByte1829;
					i_12_ = ((Class238) class238).aByte1830;
					if (((Class238) class238).aByte1823 != 0 || ((Class238) class238).aByte1837 != 0)
						aBoolean4848 = true;
				}
				if (!(i_12_ != i_10_ | (i_13_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff)))
					break;
				if (aClass249Array4877 != null) {
					for (int i_14_ = 0; i_14_ < anInt4866; i_14_++) {
						Class249 class249 = aClass249Array4877[i_14_];
						Class219 class219 = aClass219Array4861[i_14_];
						((Class219) class219).anInt1643 = ((Class208.anIntArray1579[(0xffff & aShortArray4842[(((Class249) class249).anInt1905)])]) & 0xffffff | ((Class219) class219).anInt1643 & ~0xffffff);
					}
				}
				if (aClass104_4854 == null)
					break;
				((Class104) aClass104_4854).anInterface16_902 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.aa(" + i + ',' + i_8_ + ')');
			}
			break;
		} while (false);
	}

	private final AbstractModel method2379(int i, boolean bool, boolean bool_15_, int i_16_, Class146_Sub2 class146_sub2_17_, Class146_Sub2 class146_sub2_18_) {
		try {
			class146_sub2_17_.anInt4846 = anInt4846;
			class146_sub2_17_.anInt4893 = anInt4893;
			class146_sub2_17_.anInt4883 = anInt4883;
			class146_sub2_17_.anInt4896 = anInt4896;
			if ((0x100 & i_16_ ^ 0xffffffff) == -1)
				class146_sub2_17_.aBoolean4857 = aBoolean4857;
			else
				class146_sub2_17_.aBoolean4857 = true;
			class146_sub2_17_.anInt4837 = anInt4837;
			class146_sub2_17_.anInt4866 = anInt4866;
			class146_sub2_17_.aShort4872 = aShort4872;
			class146_sub2_17_.anInt4853 = anInt4853;
			class146_sub2_17_.aShort4867 = aShort4867;
			class146_sub2_17_.aByte4885 = (byte) 0;
			class146_sub2_17_.aBoolean4848 = aBoolean4848;
			class146_sub2_17_.anInt4894 = i_16_;
			boolean bool_19_ = Class373_Sub2.method3974(anInt4837, i_16_, 86);
			boolean bool_20_ = Node.method944(i_16_, anInt4837, (byte) 85);
			boolean bool_21_ = Class195.method2663(i_16_, anInt4837, false);
			boolean bool_22_ = bool_19_ | bool_20_ | bool_21_;
			if (bool_22_) {
				if (!bool_19_)
					class146_sub2_17_.anIntArray4886 = anIntArray4886;
				else if (class146_sub2_18_.anIntArray4886 != null && (class146_sub2_18_.anIntArray4886.length ^ 0xffffffff) <= (anInt4893 ^ 0xffffffff))
					class146_sub2_17_.anIntArray4886 = class146_sub2_18_.anIntArray4886;
				else
					class146_sub2_17_.anIntArray4886 = class146_sub2_18_.anIntArray4886 = new int[anInt4893];
				if (bool_20_) {
					if (class146_sub2_18_.anIntArray4856 == null || (class146_sub2_18_.anIntArray4856.length ^ 0xffffffff) > (anInt4893 ^ 0xffffffff))
						class146_sub2_17_.anIntArray4856 = class146_sub2_18_.anIntArray4856 = new int[anInt4893];
					else
						class146_sub2_17_.anIntArray4856 = class146_sub2_18_.anIntArray4856;
				} else
					class146_sub2_17_.anIntArray4856 = anIntArray4856;
				if (bool_21_) {
					if (class146_sub2_18_.anIntArray4843 != null && (class146_sub2_18_.anIntArray4843.length ^ 0xffffffff) <= (anInt4893 ^ 0xffffffff))
						class146_sub2_17_.anIntArray4843 = class146_sub2_18_.anIntArray4843;
					else
						class146_sub2_17_.anIntArray4843 = class146_sub2_18_.anIntArray4843 = new int[anInt4893];
				} else
					class146_sub2_17_.anIntArray4843 = anIntArray4843;
				for (int i_23_ = 0; anInt4893 > i_23_; i_23_++) {
					if (bool_19_)
						class146_sub2_17_.anIntArray4886[i_23_] = anIntArray4886[i_23_];
					if (bool_20_)
						class146_sub2_17_.anIntArray4856[i_23_] = anIntArray4856[i_23_];
					if (bool_21_)
						class146_sub2_17_.anIntArray4843[i_23_] = anIntArray4843[i_23_];
				}
			} else {
				class146_sub2_17_.anIntArray4886 = anIntArray4886;
				class146_sub2_17_.anIntArray4843 = anIntArray4843;
				class146_sub2_17_.anIntArray4856 = anIntArray4856;
			}
			if (Class76_Sub7.method763(i_16_, anInt4837, false)) {
				if (bool_15_)
					class146_sub2_17_.aByte4885 |= 0x1;
				class146_sub2_17_.aClass104_4889 = class146_sub2_18_.aClass104_4889;
				((Class104) class146_sub2_17_.aClass104_4889).aByte898 = ((Class104) aClass104_4889).aByte898;
				((Class104) class146_sub2_17_.aClass104_4889).anInterface16_902 = ((Class104) aClass104_4889).anInterface16_902;
			} else if (!Class246_Sub2.method2973(i_16_, anInt4837, (byte) -112))
				class146_sub2_17_.aClass104_4889 = null;
			else
				class146_sub2_17_.aClass104_4889 = aClass104_4889;
			if (Class98_Sub5_Sub2.method969(anInt4837, i_16_, 124)) {
				if (class146_sub2_18_.aShortArray4842 != null && ((anInt4853 ^ 0xffffffff) >= (class146_sub2_18_.aShortArray4842.length ^ 0xffffffff)))
					class146_sub2_17_.aShortArray4842 = class146_sub2_18_.aShortArray4842;
				else
					class146_sub2_17_.aShortArray4842 = class146_sub2_18_.aShortArray4842 = new short[anInt4853];
				for (int i_24_ = 0; (anInt4853 ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
					class146_sub2_17_.aShortArray4842[i_24_] = aShortArray4842[i_24_];
			} else
				class146_sub2_17_.aShortArray4842 = aShortArray4842;
			if (!Class64_Sub10.method594(i_16_, 6, anInt4837))
				class146_sub2_17_.aByteArray4882 = aByteArray4882;
			else {
				if (class146_sub2_18_.aByteArray4882 != null && ((class146_sub2_18_.aByteArray4882.length ^ 0xffffffff) <= (anInt4853 ^ 0xffffffff)))
					class146_sub2_17_.aByteArray4882 = class146_sub2_18_.aByteArray4882;
				else
					class146_sub2_17_.aByteArray4882 = class146_sub2_18_.aByteArray4882 = new byte[anInt4853];
				for (int i_25_ = 0; (anInt4853 ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++)
					class146_sub2_17_.aByteArray4882[i_25_] = aByteArray4882[i_25_];
			}
			if (Class228.method2864(55, i_16_, anInt4837)) {
				class146_sub2_17_.aClass104_4854 = class146_sub2_18_.aClass104_4854;
				if (bool_15_)
					class146_sub2_17_.aByte4885 |= 0x2;
				((Class104) class146_sub2_17_.aClass104_4854).anInterface16_902 = ((Class104) aClass104_4854).anInterface16_902;
				((Class104) class146_sub2_17_.aClass104_4854).aByte898 = ((Class104) aClass104_4854).aByte898;
			} else if (!Class87.method854(anInt4837, 28733, i_16_))
				class146_sub2_17_.aClass104_4854 = null;
			else
				class146_sub2_17_.aClass104_4854 = aClass104_4854;
			if (Class151_Sub2.method2451(i_16_, 544, anInt4837)) {
				if (class146_sub2_18_.aShortArray4860 == null || ((anInt4846 ^ 0xffffffff) < (class146_sub2_18_.aShortArray4860.length ^ 0xffffffff))) {
					int i_26_ = anInt4846;
					class146_sub2_17_.aShortArray4860 = class146_sub2_18_.aShortArray4860 = new short[i_26_];
					class146_sub2_17_.aShortArray4849 = class146_sub2_18_.aShortArray4849 = new short[i_26_];
					class146_sub2_17_.aShortArray4884 = class146_sub2_18_.aShortArray4884 = new short[i_26_];
				} else {
					class146_sub2_17_.aShortArray4884 = class146_sub2_18_.aShortArray4884;
					class146_sub2_17_.aShortArray4849 = class146_sub2_18_.aShortArray4849;
					class146_sub2_17_.aShortArray4860 = class146_sub2_18_.aShortArray4860;
				}
				if (aClass14_4898 == null) {
					for (int i_27_ = 0; anInt4846 > i_27_; i_27_++) {
						class146_sub2_17_.aShortArray4860[i_27_] = aShortArray4860[i_27_];
						class146_sub2_17_.aShortArray4884[i_27_] = aShortArray4884[i_27_];
						class146_sub2_17_.aShortArray4849[i_27_] = aShortArray4849[i_27_];
					}
				} else {
					if (class146_sub2_18_.aClass14_4898 == null)
						class146_sub2_18_.aClass14_4898 = new Class14();
					Class14 class14 = (class146_sub2_17_.aClass14_4898 = class146_sub2_18_.aClass14_4898);
					if (((Class14) class14).aShortArray166 == null || (((Class14) class14).aShortArray166.length ^ 0xffffffff) > (anInt4846 ^ 0xffffffff)) {
						int i_28_ = anInt4846;
						((Class14) class14).aShortArray167 = new short[i_28_];
						((Class14) class14).aShortArray166 = new short[i_28_];
						((Class14) class14).aShortArray165 = new short[i_28_];
						((Class14) class14).aByteArray168 = new byte[i_28_];
					}
					for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (anInt4846 ^ 0xffffffff); i_29_++) {
						class146_sub2_17_.aShortArray4860[i_29_] = aShortArray4860[i_29_];
						class146_sub2_17_.aShortArray4884[i_29_] = aShortArray4884[i_29_];
						class146_sub2_17_.aShortArray4849[i_29_] = aShortArray4849[i_29_];
						((Class14) class14).aShortArray166[i_29_] = ((Class14) aClass14_4898).aShortArray166[i_29_];
						((Class14) class14).aShortArray165[i_29_] = ((Class14) aClass14_4898).aShortArray165[i_29_];
						((Class14) class14).aShortArray167[i_29_] = ((Class14) aClass14_4898).aShortArray167[i_29_];
						((Class14) class14).aByteArray168[i_29_] = ((Class14) aClass14_4898).aByteArray168[i_29_];
					}
				}
				class146_sub2_17_.aByteArray4858 = aByteArray4858;
			} else {
				class146_sub2_17_.aClass14_4898 = aClass14_4898;
				class146_sub2_17_.aByteArray4858 = aByteArray4858;
				class146_sub2_17_.aShortArray4849 = aShortArray4849;
				class146_sub2_17_.aShortArray4860 = aShortArray4860;
				class146_sub2_17_.aShortArray4884 = aShortArray4884;
			}
			if (!Class64_Sub28.method670(i_16_, i ^ ~0x30fa, anInt4837)) {
				if (Class246_Sub3_Sub5_Sub2.method3096(-27984, anInt4837, i_16_))
					class146_sub2_17_.aClass104_4859 = aClass104_4859;
				else
					class146_sub2_17_.aClass104_4859 = null;
			} else {
				class146_sub2_17_.aClass104_4859 = class146_sub2_18_.aClass104_4859;
				if (bool_15_)
					class146_sub2_17_.aByte4885 |= 0x4;
				((Class104) class146_sub2_17_.aClass104_4859).aByte898 = ((Class104) aClass104_4859).aByte898;
				((Class104) class146_sub2_17_.aClass104_4859).anInterface16_902 = ((Class104) aClass104_4859).anInterface16_902;
			}
			if (i != 255)
				aShortArray4864 = null;
			if (!s_Sub1.method3433(i_16_, 15849, anInt4837)) {
				class146_sub2_17_.aFloatArray4890 = aFloatArray4890;
				class146_sub2_17_.aFloatArray4897 = aFloatArray4897;
			} else {
				if (class146_sub2_18_.aFloatArray4897 == null || ((class146_sub2_18_.aFloatArray4897.length ^ 0xffffffff) > (anInt4853 ^ 0xffffffff))) {
					int i_30_ = anInt4846;
					class146_sub2_17_.aFloatArray4897 = class146_sub2_18_.aFloatArray4897 = new float[i_30_];
					class146_sub2_17_.aFloatArray4890 = class146_sub2_18_.aFloatArray4890 = new float[i_30_];
				} else {
					class146_sub2_17_.aFloatArray4897 = class146_sub2_18_.aFloatArray4897;
					class146_sub2_17_.aFloatArray4890 = class146_sub2_18_.aFloatArray4890;
				}
				for (int i_31_ = 0; i_31_ < anInt4846; i_31_++) {
					class146_sub2_17_.aFloatArray4897[i_31_] = aFloatArray4897[i_31_];
					class146_sub2_17_.aFloatArray4890[i_31_] = aFloatArray4890[i_31_];
				}
			}
			if (!Class64_Sub19.method631(anInt4837, i_16_, -2)) {
				if (!za_Sub2.method1682(i_16_, i ^ 0xff, anInt4837))
					class146_sub2_17_.aClass104_4874 = null;
				else
					class146_sub2_17_.aClass104_4874 = aClass104_4874;
			} else {
				class146_sub2_17_.aClass104_4874 = class146_sub2_18_.aClass104_4874;
				if (bool_15_)
					class146_sub2_17_.aByte4885 |= 0x8;
				((Class104) class146_sub2_17_.aClass104_4874).aByte898 = ((Class104) aClass104_4874).aByte898;
				((Class104) class146_sub2_17_.aClass104_4874).anInterface16_902 = ((Class104) aClass104_4874).anInterface16_902;
			}
			if (!Class161.method2514(i_16_, 16, anInt4837)) {
				class146_sub2_17_.aShortArray4895 = aShortArray4895;
				class146_sub2_17_.aShortArray4852 = aShortArray4852;
				class146_sub2_17_.aShortArray4878 = aShortArray4878;
			} else {
				if (class146_sub2_18_.aShortArray4895 == null || ((anInt4853 ^ 0xffffffff) < (class146_sub2_18_.aShortArray4895.length ^ 0xffffffff))) {
					int i_32_ = anInt4853;
					class146_sub2_17_.aShortArray4852 = class146_sub2_18_.aShortArray4852 = new short[i_32_];
					class146_sub2_17_.aShortArray4878 = class146_sub2_18_.aShortArray4878 = new short[i_32_];
					class146_sub2_17_.aShortArray4895 = class146_sub2_18_.aShortArray4895 = new short[i_32_];
				} else {
					class146_sub2_17_.aShortArray4878 = class146_sub2_18_.aShortArray4878;
					class146_sub2_17_.aShortArray4852 = class146_sub2_18_.aShortArray4852;
					class146_sub2_17_.aShortArray4895 = class146_sub2_18_.aShortArray4895;
				}
				for (int i_33_ = 0; (anInt4853 ^ 0xffffffff) < (i_33_ ^ 0xffffffff); i_33_++) {
					class146_sub2_17_.aShortArray4895[i_33_] = aShortArray4895[i_33_];
					class146_sub2_17_.aShortArray4852[i_33_] = aShortArray4852[i_33_];
					class146_sub2_17_.aShortArray4878[i_33_] = aShortArray4878[i_33_];
				}
			}
			if (!Class216.method2793(anInt4837, (byte) -115, i_16_)) {
				if (!Class322.method3672(anInt4837, i_16_, 2048))
					class146_sub2_17_.aClass322_4838 = null;
				else
					class146_sub2_17_.aClass322_4838 = aClass322_4838;
			} else {
				class146_sub2_17_.aClass322_4838 = class146_sub2_18_.aClass322_4838;
				if (bool_15_)
					class146_sub2_17_.aByte4885 |= 0x10;
				((Class322) class146_sub2_17_.aClass322_4838).anInterface8_2711 = ((Class322) aClass322_4838).anInterface8_2711;
			}
			if (!Class360.method3905(123, i_16_, anInt4837))
				class146_sub2_17_.aShortArray4869 = aShortArray4869;
			else {
				if (class146_sub2_18_.aShortArray4869 != null && ((class146_sub2_18_.aShortArray4869.length ^ 0xffffffff) <= (anInt4853 ^ 0xffffffff)))
					class146_sub2_17_.aShortArray4869 = class146_sub2_18_.aShortArray4869;
				else {
					int i_34_ = anInt4853;
					class146_sub2_17_.aShortArray4869 = class146_sub2_18_.aShortArray4869 = new short[i_34_];
				}
				for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (anInt4853 ^ 0xffffffff); i_35_++)
					class146_sub2_17_.aShortArray4869[i_35_] = aShortArray4869[i_35_];
			}
			if (!Class284_Sub1_Sub2.method3373(anInt4837, i_16_, (byte) 76))
				class146_sub2_17_.aClass219Array4861 = aClass219Array4861;
			else if (class146_sub2_18_.aClass219Array4861 != null && (anInt4866 <= class146_sub2_18_.aClass219Array4861.length)) {
				class146_sub2_17_.aClass219Array4861 = class146_sub2_18_.aClass219Array4861;
				for (int i_36_ = 0; i_36_ < anInt4866; i_36_++)
					class146_sub2_17_.aClass219Array4861[i_36_].method2814(aClass219Array4861[i_36_], 6);
			} else {
				int i_37_ = anInt4866;
				class146_sub2_17_.aClass219Array4861 = class146_sub2_18_.aClass219Array4861 = new Class219[i_37_];
				for (int i_38_ = 0; (anInt4866 ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++)
					class146_sub2_17_.aClass219Array4861[i_38_] = aClass219Array4861[i_38_].method2815(128);
			}
			class146_sub2_17_.anIntArrayArray4888 = anIntArrayArray4888;
			class146_sub2_17_.anIntArray4850 = anIntArray4850;
			if (!aBoolean4847)
				class146_sub2_17_.aBoolean4847 = false;
			else {
				class146_sub2_17_.aBoolean4847 = true;
				class146_sub2_17_.aShort4876 = aShort4876;
				class146_sub2_17_.aShort4868 = aShort4868;
				class146_sub2_17_.aShort4844 = aShort4844;
				class146_sub2_17_.aShort4892 = aShort4892;
				class146_sub2_17_.aShort4845 = aShort4845;
				class146_sub2_17_.aShort4879 = aShort4879;
				class146_sub2_17_.aShort4891 = aShort4891;
				class146_sub2_17_.aShort4862 = aShort4862;
			}
			class146_sub2_17_.anIntArrayArray4875 = anIntArrayArray4875;
			class146_sub2_17_.anIntArray4851 = anIntArray4851;
			class146_sub2_17_.aShortArray4887 = aShortArray4887;
			class146_sub2_17_.aShortArray4864 = aShortArray4864;
			class146_sub2_17_.aClass87Array4881 = aClass87Array4881;
			class146_sub2_17_.aClass35Array4863 = aClass35Array4863;
			class146_sub2_17_.aClass249Array4877 = aClass249Array4877;
			class146_sub2_17_.anIntArrayArray4870 = anIntArrayArray4870;
			class146_sub2_17_.aShortArray4841 = aShortArray4841;
			return class146_sub2_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.R(" + i + ',' + bool + ',' + bool_15_ + ',' + i_16_ + ',' + (class146_sub2_17_ != null ? "{...}" : "null") + ',' + (class146_sub2_18_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void k(int i) {
		try {
			int i_39_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_40_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_41_ = 0; i_41_ < anInt4883; i_41_++) {
				int i_42_ = ((anIntArray4886[i_41_] * i_40_ + i_39_ * anIntArray4843[i_41_]) >> -977928274);
				anIntArray4843[i_41_] = (-(anIntArray4886[i_41_] * i_39_) + i_40_ * anIntArray4843[i_41_]) >> 581937774;
				anIntArray4886[i_41_] = i_42_;
			}
			for (int i_43_ = 0; (anInt4846 ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++) {
				int i_44_ = ((i_39_ * aShortArray4849[i_43_] - -(i_40_ * aShortArray4860[i_43_])) >> -1933154578);
				aShortArray4849[i_43_] = (short) ((-(aShortArray4860[i_43_] * i_39_) + aShortArray4849[i_43_] * i_40_) >> -1887631314);
				aShortArray4860[i_43_] = (short) i_44_;
			}
			if (aClass104_4859 == null && aClass104_4854 != null)
				((Class104) aClass104_4854).anInterface16_902 = null;
			if (aClass104_4859 != null)
				((Class104) aClass104_4859).anInterface16_902 = null;
			if (aClass104_4889 != null)
				((Class104) aClass104_4889).anInterface16_902 = null;
			aBoolean4847 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.k(" + i + ')');
		}
	}

	final void a(int i) {
		try {
			int i_45_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_46_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_47_ = 0; anInt4883 > i_47_; i_47_++) {
				int i_48_ = ((i_46_ * anIntArray4886[i_47_] + anIntArray4843[i_47_] * i_45_) >> 757700622);
				anIntArray4843[i_47_] = (anIntArray4843[i_47_] * i_46_ + -(i_45_ * anIntArray4886[i_47_])) >> 158104590;
				anIntArray4886[i_47_] = i_48_;
			}
			if (aClass104_4889 != null)
				((Class104) aClass104_4889).anInterface16_902 = null;
			aBoolean4847 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.a(" + i + ')');
		}
	}

	final boolean method2324() {
		try {
			if (aShortArray4869 == null)
				return true;
			for (int i = 0; (i ^ 0xffffffff) > (aShortArray4869.length ^ 0xffffffff); i++) {
				if ((aShortArray4869[i] ^ 0xffffffff) != 0 && !((ha) aHa_Sub1_4865).aD938.method8(-25, aShortArray4869[i]))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.J(" + ')');
		}
	}

	private final void method2380(int i) {
		try {
			int i_49_ = 32767;
			int i_50_ = 32767;
			int i_51_ = 32767;
			int i_52_ = -32768;
			int i_53_ = -32768;
			int i_54_ = -32768;
			int i_55_ = 0;
			int i_56_ = 0;
			int i_57_ = 0;
			if (i >= -85)
				O(-79, 52, 0);
			for (/**/; anInt4883 > i_57_; i_57_++) {
				int i_58_ = anIntArray4886[i_57_];
				int i_59_ = anIntArray4856[i_57_];
				if (i_50_ > i_59_)
					i_50_ = i_59_;
				int i_60_ = anIntArray4843[i_57_];
				if (i_58_ > i_52_)
					i_52_ = i_58_;
				if ((i_49_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff))
					i_49_ = i_58_;
				if (i_59_ > i_53_)
					i_53_ = i_59_;
				if ((i_51_ ^ 0xffffffff) < (i_60_ ^ 0xffffffff))
					i_51_ = i_60_;
				if ((i_60_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff))
					i_54_ = i_60_;
				int i_61_ = i_58_ * i_58_ - -(i_60_ * i_60_);
				if ((i_55_ ^ 0xffffffff) > (i_61_ ^ 0xffffffff))
					i_55_ = i_61_;
				i_61_ = i_59_ * i_59_ + i_60_ * i_60_ + i_58_ * i_58_;
				if ((i_61_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff))
					i_56_ = i_61_;
			}
			aShort4845 = (short) i_49_;
			aShort4879 = (short) i_53_;
			aShort4868 = (short) i_50_;
			aShort4862 = (short) i_52_;
			aShort4891 = (short) i_54_;
			aShort4892 = (short) i_51_;
			aShort4876 = (short) (int) (0.99 + Math.sqrt((double) i_55_));
			aShort4844 = (short) (int) (0.99 + Math.sqrt((double) i_56_));
			aBoolean4847 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.JA(" + i + ')');
		}
	}

	final void method2343(Class111 class111) {
		do {
			try {
				Class111_Sub1 class111_sub1 = (Class111_Sub1) class111;
				if (aClass87Array4881 != null) {
					for (int i = 0; ((i ^ 0xffffffff) > (aClass87Array4881.length ^ 0xffffffff)); i++) {
						Class87 class87 = aClass87Array4881[i];
						Class87 class87_62_ = class87;
						if (((Class87) class87).aClass87_657 != null)
							class87_62_ = ((Class87) class87).aClass87_657;
						((Class87) class87_62_).anInt670 = (int) (((Class111_Sub1) class111_sub1).aFloat4674 + (((((Class111_Sub1) class111_sub1).aFloat4680) * (float) (anIntArray4843[(((Class87) class87).anInt666)])) + (((float) (anIntArray4886[(((Class87) class87).anInt666)]) * (((Class111_Sub1) class111_sub1).aFloat4686)) + ((float) (anIntArray4856[(((Class87) class87).anInt666)]) * ((Class111_Sub1) class111_sub1).aFloat4679))));
						((Class87) class87_62_).anInt668 = (int) (((((Class111_Sub1) class111_sub1).aFloat4678) * (float) (anIntArray4886[(((Class87) class87).anInt666)])) + ((((Class111_Sub1) class111_sub1).aFloat4675) * (float) (anIntArray4856[(((Class87) class87).anInt666)])) + ((((Class111_Sub1) class111_sub1).aFloat4687) * (float) (anIntArray4843[(((Class87) class87).anInt666)])) + (((Class111_Sub1) class111_sub1).aFloat4683));
						((Class87) class87_62_).anInt671 = (int) (((float) (anIntArray4856[((Class87) class87).anInt666]) * (((Class111_Sub1) class111_sub1).aFloat4676)) + ((((Class111_Sub1) class111_sub1).aFloat4684) * (float) (anIntArray4886[(((Class87) class87).anInt666)])) + ((float) (anIntArray4843[(((Class87) class87).anInt666)]) * (((Class111_Sub1) class111_sub1).aFloat4673)) + (((Class111_Sub1) class111_sub1).aFloat4677));
						((Class87) class87_62_).anInt663 = (int) (((((Class111_Sub1) class111_sub1).aFloat4686) * (float) (anIntArray4886[(((Class87) class87).anInt661)])) + ((float) (anIntArray4856[(((Class87) class87).anInt661)]) * (((Class111_Sub1) class111_sub1).aFloat4679)) + ((float) (anIntArray4843[(((Class87) class87).anInt661)]) * (((Class111_Sub1) class111_sub1).aFloat4680)) + (((Class111_Sub1) class111_sub1).aFloat4674));
						((Class87) class87_62_).anInt664 = (int) (((float) (anIntArray4856[((Class87) class87).anInt661]) * (((Class111_Sub1) class111_sub1).aFloat4675)) + ((float) (anIntArray4886[(((Class87) class87).anInt661)]) * (((Class111_Sub1) class111_sub1).aFloat4678)) + ((float) (anIntArray4843[(((Class87) class87).anInt661)]) * (((Class111_Sub1) class111_sub1).aFloat4687)) + (((Class111_Sub1) class111_sub1).aFloat4683));
						((Class87) class87_62_).anInt656 = (int) (((Class111_Sub1) class111_sub1).aFloat4677 + (((float) (anIntArray4856[(((Class87) class87).anInt661)]) * (((Class111_Sub1) class111_sub1).aFloat4676)) + ((((Class111_Sub1) class111_sub1).aFloat4684) * (float) (anIntArray4886[(((Class87) class87).anInt661)])) + ((((Class111_Sub1) class111_sub1).aFloat4673) * (float) (anIntArray4843[(((Class87) class87).anInt661)]))));
						((Class87) class87_62_).anInt659 = (int) (((float) (anIntArray4886[((Class87) class87).anInt674]) * (((Class111_Sub1) class111_sub1).aFloat4686)) + ((((Class111_Sub1) class111_sub1).aFloat4679) * (float) (anIntArray4856[(((Class87) class87).anInt674)])) + ((float) (anIntArray4843[(((Class87) class87).anInt674)]) * (((Class111_Sub1) class111_sub1).aFloat4680)) + (((Class111_Sub1) class111_sub1).aFloat4674));
						((Class87) class87_62_).anInt669 = (int) (((((Class111_Sub1) class111_sub1).aFloat4678) * (float) (anIntArray4886[(((Class87) class87).anInt674)])) + ((((Class111_Sub1) class111_sub1).aFloat4675) * (float) (anIntArray4856[(((Class87) class87).anInt674)])) + ((float) (anIntArray4843[(((Class87) class87).anInt674)]) * (((Class111_Sub1) class111_sub1).aFloat4687)) + (((Class111_Sub1) class111_sub1).aFloat4683));
						((Class87) class87_62_).anInt662 = (int) (((Class111_Sub1) class111_sub1).aFloat4677 + (((float) (anIntArray4843[(((Class87) class87).anInt674)]) * (((Class111_Sub1) class111_sub1).aFloat4673)) + (((float) (anIntArray4886[(((Class87) class87).anInt674)]) * (((Class111_Sub1) class111_sub1).aFloat4684)) + ((float) (anIntArray4856[(((Class87) class87).anInt674)]) * ((Class111_Sub1) class111_sub1).aFloat4676))));
					}
				}
				if (aClass35Array4863 == null)
					break;
				for (int i = 0; i < aClass35Array4863.length; i++) {
					Class35 class35 = aClass35Array4863[i];
					Class35 class35_63_ = class35;
					if (((Class35) class35).aClass35_328 != null)
						class35_63_ = ((Class35) class35).aClass35_328;
					if (((Class35) class35).aClass111_334 != null)
						((Class35) class35).aClass111_334.method2092(class111_sub1);
					else
						((Class35) class35).aClass111_334 = class111_sub1.method2102();
					((Class35) class35_63_).anInt331 = (int) (((Class111_Sub1) class111_sub1).aFloat4674 + ((((Class111_Sub1) class111_sub1).aFloat4680 * (float) (anIntArray4843[(((Class35) class35).anInt327)])) + (((float) (anIntArray4886[(((Class35) class35).anInt327)]) * (((Class111_Sub1) class111_sub1).aFloat4686)) + ((float) (anIntArray4856[(((Class35) class35).anInt327)]) * (((Class111_Sub1) class111_sub1).aFloat4679)))));
					((Class35) class35_63_).anInt330 = (int) ((((Class111_Sub1) class111_sub1).aFloat4675 * (float) (anIntArray4856[((Class35) class35).anInt327])) + (((Class111_Sub1) class111_sub1).aFloat4678 * (float) (anIntArray4886[((Class35) class35).anInt327])) + ((float) (anIntArray4843[((Class35) class35).anInt327]) * (((Class111_Sub1) class111_sub1).aFloat4687)) + ((Class111_Sub1) class111_sub1).aFloat4683);
					((Class35) class35_63_).anInt337 = (int) (((Class111_Sub1) class111_sub1).aFloat4677 + ((((Class111_Sub1) class111_sub1).aFloat4676 * (float) (anIntArray4856[(((Class35) class35).anInt327)])) + ((float) (anIntArray4886[((Class35) class35).anInt327]) * (((Class111_Sub1) class111_sub1).aFloat4684)) + ((float) (anIntArray4843[((Class35) class35).anInt327]) * (((Class111_Sub1) class111_sub1).aFloat4673))));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.DB(" + (class111 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final void VA(int i) {
		try {
			int i_64_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_65_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_66_ = 0; (anInt4883 ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++) {
				int i_67_ = ((anIntArray4886[i_66_] * i_65_ + i_64_ * anIntArray4856[i_66_]) >> 552246990);
				anIntArray4856[i_66_] = (-(i_64_ * anIntArray4886[i_66_]) + anIntArray4856[i_66_] * i_65_) >> -424979762;
				anIntArray4886[i_66_] = i_67_;
			}
			if (aClass104_4889 != null)
				((Class104) aClass104_4889).anInterface16_902 = null;
			aBoolean4847 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.VA(" + i + ')');
		}
	}

	final void method2344(int i, int[] is, int i_68_, int i_69_, int i_70_, int i_71_, boolean bool) {
		try {
			int i_72_ = is.length;
			if (i == 0) {
				i_69_ <<= 4;
				i_68_ <<= 4;
				i_70_ <<= 4;
				Class78.anInt596 = 0;
				int i_73_ = 0;
				Class98_Sub40.anInt4196 = 0;
				Class76_Sub11.anInt3800 = 0;
				for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
					int i_75_ = is[i_74_];
					if (i_75_ < anIntArrayArray4888.length) {
						int[] is_76_ = anIntArrayArray4888[i_75_];
						for (int i_77_ = 0; ((i_77_ ^ 0xffffffff) > (is_76_.length ^ 0xffffffff)); i_77_++) {
							int i_78_ = is_76_[i_77_];
							Class76_Sub11.anInt3800 += anIntArray4886[i_78_];
							Class98_Sub40.anInt4196 += anIntArray4856[i_78_];
							i_73_++;
							Class78.anInt596 += anIntArray4843[i_78_];
						}
					}
				}
				if (i_73_ <= 0) {
					Class76_Sub11.anInt3800 = i_68_;
					Class98_Sub40.anInt4196 = i_69_;
					Class78.anInt596 = i_70_;
				} else {
					Class98_Sub40.anInt4196 = Class98_Sub40.anInt4196 / i_73_ - -i_69_;
					Class78.anInt596 = Class78.anInt596 / i_73_ - -i_70_;
					Class76_Sub11.anInt3800 = Class76_Sub11.anInt3800 / i_73_ + i_68_;
				}
			} else if (i == 1) {
				i_69_ <<= 4;
				i_70_ <<= 4;
				i_68_ <<= 4;
				for (int i_79_ = 0; i_72_ > i_79_; i_79_++) {
					int i_80_ = is[i_79_];
					if (i_80_ < anIntArrayArray4888.length) {
						int[] is_81_ = anIntArrayArray4888[i_80_];
						for (int i_82_ = 0; ((i_82_ ^ 0xffffffff) > (is_81_.length ^ 0xffffffff)); i_82_++) {
							int i_83_ = is_81_[i_82_];
							anIntArray4886[i_83_] += i_68_;
							anIntArray4856[i_83_] += i_69_;
							anIntArray4843[i_83_] += i_70_;
						}
					}
				}
			} else if (i == 2) {
				for (int i_84_ = 0; (i_72_ ^ 0xffffffff) < (i_84_ ^ 0xffffffff); i_84_++) {
					int i_85_ = is[i_84_];
					if ((anIntArrayArray4888.length ^ 0xffffffff) < (i_85_ ^ 0xffffffff)) {
						int[] is_86_ = anIntArrayArray4888[i_85_];
						if ((0x1 & i_71_) == 0) {
							for (int i_87_ = 0; is_86_.length > i_87_; i_87_++) {
								int i_88_ = is_86_[i_87_];
								anIntArray4886[i_88_] -= Class76_Sub11.anInt3800;
								anIntArray4856[i_88_] -= Class98_Sub40.anInt4196;
								anIntArray4843[i_88_] -= Class78.anInt596;
								if (i_70_ != 0) {
									int i_89_ = (Class284_Sub2_Sub2.anIntArray6200[i_70_]);
									int i_90_ = (Class284_Sub2_Sub2.anIntArray6202[i_70_]);
									int i_91_ = ((16383 + (i_90_ * anIntArray4886[i_88_] + (anIntArray4856[i_88_] * i_89_))) >> -551742322);
									anIntArray4856[i_88_] = ((16383 + -(i_89_ * anIntArray4886[i_88_]) + i_90_ * anIntArray4856[i_88_]) >> 33016206);
									anIntArray4886[i_88_] = i_91_;
								}
								if (i_68_ != 0) {
									int i_92_ = (Class284_Sub2_Sub2.anIntArray6200[i_68_]);
									int i_93_ = (Class284_Sub2_Sub2.anIntArray6202[i_68_]);
									int i_94_ = ((16383 + -(anIntArray4843[i_88_] * i_92_) + i_93_ * anIntArray4856[i_88_]) >> 955755278);
									anIntArray4843[i_88_] = ((16383 + i_92_ * anIntArray4856[i_88_] - -(i_93_ * anIntArray4843[i_88_])) >> -1079794578);
									anIntArray4856[i_88_] = i_94_;
								}
								if ((i_69_ ^ 0xffffffff) != -1) {
									int i_95_ = (Class284_Sub2_Sub2.anIntArray6200[i_69_]);
									int i_96_ = (Class284_Sub2_Sub2.anIntArray6202[i_69_]);
									int i_97_ = ((16383 + (anIntArray4886[i_88_] * i_96_ + (i_95_ * anIntArray4843[i_88_]))) >> -716111698);
									anIntArray4843[i_88_] = ((16383 + anIntArray4843[i_88_] * i_96_ + -(i_95_ * anIntArray4886[i_88_])) >> 935777710);
									anIntArray4886[i_88_] = i_97_;
								}
								anIntArray4886[i_88_] += Class76_Sub11.anInt3800;
								anIntArray4856[i_88_] += Class98_Sub40.anInt4196;
								anIntArray4843[i_88_] += Class78.anInt596;
							}
						} else {
							for (int i_98_ = 0; is_86_.length > i_98_; i_98_++) {
								int i_99_ = is_86_[i_98_];
								anIntArray4886[i_99_] -= Class76_Sub11.anInt3800;
								anIntArray4856[i_99_] -= Class98_Sub40.anInt4196;
								anIntArray4843[i_99_] -= Class78.anInt596;
								if (i_68_ != 0) {
									int i_100_ = (Class284_Sub2_Sub2.anIntArray6200[i_68_]);
									int i_101_ = (Class284_Sub2_Sub2.anIntArray6202[i_68_]);
									int i_102_ = ((16383 + (anIntArray4856[i_99_] * i_101_ - (i_100_ * anIntArray4843[i_99_]))) >> 687877998);
									anIntArray4843[i_99_] = (16383 + (anIntArray4856[i_99_] * i_100_ - -(anIntArray4843[i_99_] * i_101_))) >> -2103580978;
									anIntArray4856[i_99_] = i_102_;
								}
								if (i_70_ != 0) {
									int i_103_ = (Class284_Sub2_Sub2.anIntArray6200[i_70_]);
									int i_104_ = (Class284_Sub2_Sub2.anIntArray6202[i_70_]);
									int i_105_ = ((anIntArray4856[i_99_] * i_103_ - -(anIntArray4886[i_99_] * i_104_) - -16383) >> -1145146098);
									anIntArray4856[i_99_] = 16383 + (-(anIntArray4886[i_99_] * i_103_) + (anIntArray4856[i_99_] * i_104_)) >> 428947982;
									anIntArray4886[i_99_] = i_105_;
								}
								if (i_69_ != 0) {
									int i_106_ = (Class284_Sub2_Sub2.anIntArray6200[i_69_]);
									int i_107_ = (Class284_Sub2_Sub2.anIntArray6202[i_69_]);
									int i_108_ = ((i_107_ * anIntArray4886[i_99_] + (i_106_ * anIntArray4843[i_99_] - -16383)) >> 1947306446);
									anIntArray4843[i_99_] = (-(anIntArray4886[i_99_] * i_106_) + (anIntArray4843[i_99_] * i_107_ - -16383)) >> -1064959730;
									anIntArray4886[i_99_] = i_108_;
								}
								anIntArray4886[i_99_] += Class76_Sub11.anInt3800;
								anIntArray4856[i_99_] += Class98_Sub40.anInt4196;
								anIntArray4843[i_99_] += Class78.anInt596;
							}
						}
					}
				}
				if (bool) {
					for (int i_109_ = 0; (i_72_ ^ 0xffffffff) < (i_109_ ^ 0xffffffff); i_109_++) {
						int i_110_ = is[i_109_];
						if (i_110_ < anIntArrayArray4888.length) {
							int[] is_111_ = anIntArrayArray4888[i_110_];
							for (int i_112_ = 0; ((i_112_ ^ 0xffffffff) > (is_111_.length ^ 0xffffffff)); i_112_++) {
								int i_113_ = is_111_[i_112_];
								int i_114_ = anIntArray4851[i_113_];
								int i_115_ = anIntArray4851[1 + i_113_];
								for (int i_116_ = i_114_; ((i_116_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff)); i_116_++) {
									int i_117_ = aShortArray4887[i_116_] + -1;
									if ((i_117_ ^ 0xffffffff) == 0)
										break;
									if (i_70_ != 0) {
										int i_118_ = (Class284_Sub2_Sub2.anIntArray6200[i_70_]);
										int i_119_ = (Class284_Sub2_Sub2.anIntArray6202[i_70_]);
										int i_120_ = ((16383 + (aShortArray4884[i_117_] * i_118_) + (aShortArray4860[i_117_] * i_119_)) >> 522988174);
										aShortArray4884[i_117_] = (short) ((16383 + ((aShortArray4884[i_117_]) * i_119_ + -((aShortArray4860[i_117_]) * i_118_))) >> -296680690);
										aShortArray4860[i_117_] = (short) i_120_;
									}
									if (i_68_ != 0) {
										int i_121_ = (Class284_Sub2_Sub2.anIntArray6200[i_68_]);
										int i_122_ = (Class284_Sub2_Sub2.anIntArray6202[i_68_]);
										int i_123_ = ((16383 + (-(i_121_ * aShortArray4849[i_117_]) + i_122_ * (aShortArray4884[i_117_]))) >> 1602858094);
										aShortArray4849[i_117_] = (short) (((aShortArray4849[i_117_]) * i_122_ + ((aShortArray4884[i_117_]) * i_121_ + 16383)) >> -468229682);
										aShortArray4884[i_117_] = (short) i_123_;
									}
									if ((i_69_ ^ 0xffffffff) != -1) {
										int i_124_ = (Class284_Sub2_Sub2.anIntArray6200[i_69_]);
										int i_125_ = (Class284_Sub2_Sub2.anIntArray6202[i_69_]);
										int i_126_ = ((16383 + (aShortArray4849[i_117_] * i_124_) + (aShortArray4860[i_117_] * i_125_)) >> -852219346);
										aShortArray4849[i_117_] = (short) ((16383 + (i_125_ * (aShortArray4849[i_117_])) + -((aShortArray4860[i_117_]) * i_124_)) >> -1234967890);
										aShortArray4860[i_117_] = (short) i_126_;
									}
								}
							}
						}
					}
					if (aClass104_4859 == null && aClass104_4854 != null)
						((Class104) aClass104_4854).anInterface16_902 = null;
					if (aClass104_4859 != null)
						((Class104) aClass104_4859).anInterface16_902 = null;
				}
			} else if (i == 3) {
				for (int i_127_ = 0; (i_72_ ^ 0xffffffff) < (i_127_ ^ 0xffffffff); i_127_++) {
					int i_128_ = is[i_127_];
					if (i_128_ < anIntArrayArray4888.length) {
						int[] is_129_ = anIntArrayArray4888[i_128_];
						for (int i_130_ = 0; ((i_130_ ^ 0xffffffff) > (is_129_.length ^ 0xffffffff)); i_130_++) {
							int i_131_ = is_129_[i_130_];
							anIntArray4886[i_131_] -= Class76_Sub11.anInt3800;
							anIntArray4856[i_131_] -= Class98_Sub40.anInt4196;
							anIntArray4843[i_131_] -= Class78.anInt596;
							anIntArray4886[i_131_] = (i_68_ * anIntArray4886[i_131_] >> -1733137977);
							anIntArray4856[i_131_] = i_69_ * anIntArray4856[i_131_] >> 1319952583;
							anIntArray4843[i_131_] = anIntArray4843[i_131_] * i_70_ >> 1161471879;
							anIntArray4886[i_131_] += Class76_Sub11.anInt3800;
							anIntArray4856[i_131_] += Class98_Sub40.anInt4196;
							anIntArray4843[i_131_] += Class78.anInt596;
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -6) {
				if (anIntArrayArray4870 != null) {
					for (int i_132_ = 0; i_132_ < i_72_; i_132_++) {
						int i_133_ = is[i_132_];
						if ((i_133_ ^ 0xffffffff) > (anIntArrayArray4870.length ^ 0xffffffff)) {
							int[] is_134_ = anIntArrayArray4870[i_133_];
							for (int i_135_ = 0; ((is_134_.length ^ 0xffffffff) < (i_135_ ^ 0xffffffff)); i_135_++) {
								int i_136_ = is_134_[i_135_];
								int i_137_ = (i_68_ * 8 + (0xff & aByteArray4882[i_136_]));
								if (i_137_ >= 0) {
									if (i_137_ > 255)
										i_137_ = 255;
								} else
									i_137_ = 0;
								aByteArray4882[i_136_] = (byte) i_137_;
							}
							if (is_134_.length > 0 && aClass104_4854 != null)
								((Class104) aClass104_4854).anInterface16_902 = null;
						}
					}
					if (aClass249Array4877 != null) {
						for (int i_138_ = 0; anInt4866 > i_138_; i_138_++) {
							Class249 class249 = aClass249Array4877[i_138_];
							Class219 class219 = aClass219Array4861[i_138_];
							((Class219) class219).anInt1643 = (0xffffff & ((Class219) class219).anInt1643 | (255 - (0xff & (aByteArray4882[(((Class249) class249).anInt1905)])) << -836739592));
						}
					}
				}
			} else if (i == 7) {
				if (anIntArrayArray4870 != null) {
					for (int i_139_ = 0; (i_72_ ^ 0xffffffff) < (i_139_ ^ 0xffffffff); i_139_++) {
						int i_140_ = is[i_139_];
						if ((anIntArrayArray4870.length ^ 0xffffffff) < (i_140_ ^ 0xffffffff)) {
							int[] is_141_ = anIntArrayArray4870[i_140_];
							for (int i_142_ = 0; ((i_142_ ^ 0xffffffff) > (is_141_.length ^ 0xffffffff)); i_142_++) {
								int i_143_ = is_141_[i_142_];
								int i_144_ = aShortArray4842[i_143_] & 0xffff;
								int i_145_ = (i_144_ & 0xfec7) >> -1874195350;
								int i_146_ = (0x3d9 & i_144_) >> -509954521;
								int i_147_ = 0x7f & i_144_;
								i_146_ += i_69_ / 4;
								i_145_ = 0x3f & i_68_ + i_145_;
								i_147_ += i_70_;
								if ((i_146_ ^ 0xffffffff) <= -1) {
									if (i_146_ > 7)
										i_146_ = 7;
								} else
									i_146_ = 0;
								if (i_147_ < 0)
									i_147_ = 0;
								else if ((i_147_ ^ 0xffffffff) < -128)
									i_147_ = 127;
								aShortArray4842[i_143_] = (short) (Class41.method366(i_147_, (Class41.method366(i_145_ << 125681194, i_146_ << -23400089))));
							}
							if (is_141_.length > 0 && aClass104_4854 != null)
								((Class104) aClass104_4854).anInterface16_902 = null;
						}
					}
					if (aClass249Array4877 != null) {
						for (int i_148_ = 0; i_148_ < anInt4866; i_148_++) {
							Class249 class249 = aClass249Array4877[i_148_];
							Class219 class219 = aClass219Array4861[i_148_];
							((Class219) class219).anInt1643 = (~0xffffff & ((Class219) class219).anInt1643 | (Class208.anIntArray1579[0xffff & (aShortArray4842[(((Class249) class249).anInt1905)])]) & 0xffffff);
						}
					}
				}
			} else if (i == 8) {
				if (anIntArrayArray4875 != null) {
					for (int i_149_ = 0; (i_149_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff); i_149_++) {
						int i_150_ = is[i_149_];
						if (anIntArrayArray4875.length > i_150_) {
							int[] is_151_ = anIntArrayArray4875[i_150_];
							for (int i_152_ = 0; is_151_.length > i_152_; i_152_++) {
								Class219 class219 = aClass219Array4861[is_151_[i_152_]];
								((Class219) class219).anInt1644 += i_69_;
								((Class219) class219).anInt1638 += i_68_;
							}
						}
					}
				}
			} else if (i == 10) {
				if (anIntArrayArray4875 != null) {
					for (int i_153_ = 0; i_72_ > i_153_; i_153_++) {
						int i_154_ = is[i_153_];
						if ((i_154_ ^ 0xffffffff) > (anIntArrayArray4875.length ^ 0xffffffff)) {
							int[] is_155_ = anIntArrayArray4875[i_154_];
							for (int i_156_ = 0; is_155_.length > i_156_; i_156_++) {
								Class219 class219 = aClass219Array4861[is_155_[i_156_]];
								((Class219) class219).anInt1637 = (i_68_ * ((Class219) class219).anInt1637 >> -2059272249);
								((Class219) class219).anInt1645 = (((Class219) class219).anInt1645 * i_69_ >> 883722311);
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -10) {
				if (anIntArrayArray4875 != null) {
					for (int i_157_ = 0; (i_157_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff); i_157_++) {
						int i_158_ = is[i_157_];
						if (i_158_ < anIntArrayArray4875.length) {
							int[] is_159_ = anIntArrayArray4875[i_158_];
							for (int i_160_ = 0; i_160_ < is_159_.length; i_160_++) {
								Class219 class219 = aClass219Array4861[is_159_[i_160_]];
								((Class219) class219).anInt1639 = 0x3fff & i_68_ + (((Class219) class219).anInt1639);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.BA(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_68_ + ',' + i_69_ + ',' + i_70_ + ',' + i_71_ + ',' + bool + ')'));
		}
	}

	final void method2331(Class111 class111, int i, boolean bool) {
		try {
			if (aShortArray4841 != null) {
				int[] is = new int[3];
				for (int i_161_ = 0; (anInt4883 ^ 0xffffffff) < (i_161_ ^ 0xffffffff); i_161_++) {
					if ((i & aShortArray4841[i_161_]) != 0) {
						if (!bool)
							class111.method2103(anIntArray4886[i_161_], anIntArray4856[i_161_], anIntArray4843[i_161_], is);
						else
							class111.method2096(anIntArray4886[i_161_], anIntArray4856[i_161_], anIntArray4843[i_161_], is);
						anIntArray4886[i_161_] = is[0];
						anIntArray4856[i_161_] = is[1];
						anIntArray4843[i_161_] = is[2];
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.za(" + (class111 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
		}
	}

	final boolean NA() {
		try {
			if (anIntArrayArray4888 == null)
				return false;
			for (int i = 0; (anInt4893 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				anIntArray4886[i] <<= 4;
				anIntArray4856[i] <<= 4;
				anIntArray4843[i] <<= 4;
			}
			Class98_Sub40.anInt4196 = 0;
			Class78.anInt596 = 0;
			Class76_Sub11.anInt3800 = 0;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.NA(" + ')');
		}
	}

	final void O(int i, int i_162_, int i_163_) {
		try {
			for (int i_164_ = 0; (i_164_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff); i_164_++) {
				if (i != 128)
					anIntArray4886[i_164_] = anIntArray4886[i_164_] * i >> 831042567;
				if (i_162_ != 128)
					anIntArray4856[i_164_] = anIntArray4856[i_164_] * i_162_ >> 907250759;
				if (i_163_ != 128)
					anIntArray4843[i_164_] = anIntArray4843[i_164_] * i_163_ >> 390930887;
			}
			if (aClass104_4889 != null)
				((Class104) aClass104_4889).anInterface16_902 = null;
			aBoolean4847 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.O(" + i + ',' + i_162_ + ',' + i_163_ + ')'));
		}
	}

	final r ba(r var_r) {
		try {
			if ((anInt4846 ^ 0xffffffff) == -1)
				return null;
			if (!aBoolean4847)
				method2380(-107);
			int i;
			int i_165_;
			if ((((ha_Sub1) aHa_Sub1_4865).anInt4398 ^ 0xffffffff) >= -1) {
				i = ((aShort4845 + -(aShort4868 * ((ha_Sub1) aHa_Sub1_4865).anInt4398 >> 1213595304)) >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
				i_165_ = ((aShort4862 - (aShort4879 * ((ha_Sub1) aHa_Sub1_4865).anInt4398 >> -212745912)) >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
			} else {
				i = (-(aShort4879 * ((ha_Sub1) aHa_Sub1_4865).anInt4398 >> -1677247256) + aShort4845 >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
				i_165_ = (-(aShort4868 * ((ha_Sub1) aHa_Sub1_4865).anInt4398 >> 2093540680) + aShort4862 >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
			}
			int i_166_;
			int i_167_;
			if ((((ha_Sub1) aHa_Sub1_4865).anInt4377 ^ 0xffffffff) >= -1) {
				i_166_ = ((aShort4892 - (((ha_Sub1) aHa_Sub1_4865).anInt4377 * aShort4868 >> -751195736)) >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
				i_167_ = ((aShort4891 + -(((ha_Sub1) aHa_Sub1_4865).anInt4377 * aShort4879 >> -1860997272)) >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
			} else {
				i_166_ = ((aShort4892 - (aShort4879 * ((ha_Sub1) aHa_Sub1_4865).anInt4377 >> -1732321272)) >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
				i_167_ = (-(aShort4868 * ((ha_Sub1) aHa_Sub1_4865).anInt4377 >> -759437880) + aShort4891 >> ((ha_Sub1) aHa_Sub1_4865).anInt4319);
			}
			int i_168_ = -i + (i_165_ + 1);
			int i_169_ = -i_166_ + i_167_ + 1;
			r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
			r_Sub1 var_r_Sub1_170_;
			if (var_r_Sub1 == null || !var_r_Sub1.method1647(i_169_, (byte) -125, i_168_))
				var_r_Sub1_170_ = new r_Sub1(aHa_Sub1_4865, i_168_, i_169_);
			else {
				var_r_Sub1_170_ = var_r_Sub1;
				var_r_Sub1_170_.method1646(92);
			}
			var_r_Sub1_170_.method1643(i, i_167_, i_165_, i_166_, -1);
			method2386(var_r_Sub1_170_, 0);
			return var_r_Sub1_170_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.ba(" + (var_r != null ? "{...}" : "null") + ')');
		}
	}

	final void I(int i, int[] is, int i_171_, int i_172_, int i_173_, boolean bool, int i_174_, int[] is_175_) {
		try {
			int i_176_ = is.length;
			if (i == 0) {
				i_172_ <<= 4;
				i_173_ <<= 4;
				i_171_ <<= 4;
				Class76_Sub11.anInt3800 = 0;
				Class78.anInt596 = 0;
				int i_177_ = 0;
				Class98_Sub40.anInt4196 = 0;
				for (int i_178_ = 0; (i_178_ ^ 0xffffffff) > (i_176_ ^ 0xffffffff); i_178_++) {
					int i_179_ = is[i_178_];
					if (i_179_ < anIntArrayArray4888.length) {
						int[] is_180_ = anIntArrayArray4888[i_179_];
						for (int i_181_ = 0; is_180_.length > i_181_; i_181_++) {
							int i_182_ = is_180_[i_181_];
							if (aShortArray4841 == null || (i_174_ & aShortArray4841[i_182_] ^ 0xffffffff) != -1) {
								Class76_Sub11.anInt3800 += anIntArray4886[i_182_];
								Class98_Sub40.anInt4196 += anIntArray4856[i_182_];
								i_177_++;
								Class78.anInt596 += anIntArray4843[i_182_];
							}
						}
					}
				}
				if ((i_177_ ^ 0xffffffff) >= -1) {
					Class76_Sub11.anInt3800 = i_171_;
					Class98_Sub40.anInt4196 = i_172_;
					Class78.anInt596 = i_173_;
				} else {
					Class98_Sub40.anInt4196 = i_172_ + Class98_Sub40.anInt4196 / i_177_;
					Class76_Sub11.anInt3800 = i_171_ + Class76_Sub11.anInt3800 / i_177_;
					Class379.aBoolean3192 = true;
					Class78.anInt596 = Class78.anInt596 / i_177_ + i_173_;
				}
			} else if (i == 1) {
				if (is_175_ != null) {
					int i_183_ = ((i_173_ * is_175_[2] + is_175_[0] * i_171_ - -(i_172_ * is_175_[1]) + 8192) >> -1369318770);
					int i_184_ = ((i_171_ * is_175_[3] - (-(is_175_[4] * i_172_) - is_175_[5] * i_173_) - -8192) >> -809105682);
					int i_185_ = (i_171_ * is_175_[6] - (-(is_175_[7] * i_172_) + (-(i_173_ * is_175_[8]) + -8192)) >> 1496036366);
					i_173_ = i_185_;
					i_172_ = i_184_;
					i_171_ = i_183_;
				}
				i_173_ <<= 4;
				i_172_ <<= 4;
				i_171_ <<= 4;
				for (int i_186_ = 0; (i_176_ ^ 0xffffffff) < (i_186_ ^ 0xffffffff); i_186_++) {
					int i_187_ = is[i_186_];
					if (i_187_ < anIntArrayArray4888.length) {
						int[] is_188_ = anIntArrayArray4888[i_187_];
						for (int i_189_ = 0; i_189_ < is_188_.length; i_189_++) {
							int i_190_ = is_188_[i_189_];
							if (aShortArray4841 == null || (aShortArray4841[i_190_] & i_174_) != 0) {
								anIntArray4886[i_190_] += i_171_;
								anIntArray4856[i_190_] += i_172_;
								anIntArray4843[i_190_] += i_173_;
							}
						}
					}
				}
			} else if (i == 2) {
				if (is_175_ != null) {
					int i_191_ = is_175_[9] << 1804536932;
					int i_192_ = is_175_[10] << 70535332;
					int i_193_ = is_175_[11] << 1336128228;
					int i_194_ = is_175_[12] << 122316772;
					int i_195_ = is_175_[13] << 1984453732;
					int i_196_ = is_175_[14] << 75103652;
					if (Class379.aBoolean3192) {
						int i_197_ = (8192 + (is_175_[6] * Class78.anInt596 + Class98_Sub40.anInt4196 * is_175_[3] + Class76_Sub11.anInt3800 * is_175_[0]) >> -260387954);
						int i_198_ = ((is_175_[7] * Class78.anInt596 + (is_175_[4] * Class98_Sub40.anInt4196 + is_175_[1] * Class76_Sub11.anInt3800) + 8192) >> -1260143058);
						i_198_ += i_195_;
						int i_199_ = (8192 + (is_175_[8] * Class78.anInt596 + is_175_[5] * Class98_Sub40.anInt4196 + is_175_[2] * Class76_Sub11.anInt3800) >> -1756543602);
						i_197_ += i_194_;
						Class76_Sub11.anInt3800 = i_197_;
						Class98_Sub40.anInt4196 = i_198_;
						i_199_ += i_196_;
						Class379.aBoolean3192 = false;
						Class78.anInt596 = i_199_;
					}
					int[] is_200_ = new int[9];
					int i_201_ = Class284_Sub2_Sub2.anIntArray6202[i_171_];
					int i_202_ = Class284_Sub2_Sub2.anIntArray6200[i_171_];
					int i_203_ = Class284_Sub2_Sub2.anIntArray6202[i_172_];
					int i_204_ = Class284_Sub2_Sub2.anIntArray6200[i_172_];
					int i_205_ = Class284_Sub2_Sub2.anIntArray6202[i_173_];
					int i_206_ = Class284_Sub2_Sub2.anIntArray6200[i_173_];
					int i_207_ = i_202_ * i_205_ + 8192 >> -1956467730;
					int i_208_ = i_202_ * i_206_ - -8192 >> 1810406222;
					is_200_[1] = (8192 + (i_207_ * i_204_ + -i_203_ * i_206_) >> -66052562);
					is_200_[4] = i_205_ * i_201_ - -8192 >> 1658775406;
					is_200_[8] = 8192 + i_201_ * i_203_ >> 2032809038;
					is_200_[7] = (i_207_ * i_203_ + (i_206_ * i_204_ + 8192) >> 1319882350);
					is_200_[5] = -i_202_;
					is_200_[2] = i_204_ * i_201_ + 8192 >> -430059570;
					is_200_[6] = (i_203_ * i_208_ + -i_204_ * i_205_ - -8192 >> 44494510);
					is_200_[3] = i_206_ * i_201_ + 8192 >> 210044366;
					is_200_[0] = (i_204_ * i_208_ + i_205_ * i_203_ + 8192 >> 969621742);
					int i_209_ = ((8192 + -Class78.anInt596 * is_200_[2] + (-Class76_Sub11.anInt3800 * is_200_[0] + is_200_[1] * -Class98_Sub40.anInt4196)) >> -1090313586);
					int i_210_ = ((8192 + is_200_[3] * -Class76_Sub11.anInt3800 - (-(-Class98_Sub40.anInt4196 * is_200_[4]) - -Class78.anInt596 * is_200_[5])) >> 699878862);
					int i_211_ = ((is_200_[6] * -Class76_Sub11.anInt3800 - -(-Class98_Sub40.anInt4196 * is_200_[7]) - (-(is_200_[8] * -Class78.anInt596) - 8192)) >> -1007244018);
					int i_212_ = i_209_ + Class76_Sub11.anInt3800;
					int i_213_ = Class98_Sub40.anInt4196 + i_210_;
					int i_214_ = Class78.anInt596 + i_211_;
					int[] is_215_ = new int[9];
					for (int i_216_ = 0; (i_216_ ^ 0xffffffff) > -4; i_216_++) {
						for (int i_217_ = 0; (i_217_ ^ 0xffffffff) > -4; i_217_++) {
							int i_218_ = 0;
							for (int i_219_ = 0; (i_219_ ^ 0xffffffff) > -4; i_219_++)
								i_218_ += (is_175_[i_219_ + 3 * i_217_] * is_200_[i_219_ + i_216_ * 3]);
							is_215_[i_217_ + i_216_ * 3] = i_218_ - -8192 >> -299473234;
						}
					}
					int i_220_ = (is_200_[0] * i_194_ + (i_195_ * is_200_[1] - (-(is_200_[2] * i_196_) + -8192)) >> -529690482);
					int i_221_ = (i_196_ * is_200_[5] + (is_200_[3] * i_194_ + (i_195_ * is_200_[4] + 8192)) >> 2084162126);
					int i_222_ = (8192 + (i_195_ * is_200_[7] + (i_194_ * is_200_[6] + is_200_[8] * i_196_)) >> -1963320882);
					i_220_ += i_212_;
					i_221_ += i_213_;
					i_222_ += i_214_;
					int[] is_223_ = new int[9];
					for (int i_224_ = 0; (i_224_ ^ 0xffffffff) > -4; i_224_++) {
						for (int i_225_ = 0; (i_225_ ^ 0xffffffff) > -4; i_225_++) {
							int i_226_ = 0;
							for (int i_227_ = 0; i_227_ < 3; i_227_++)
								i_226_ += (is_175_[i_227_ + 3 * i_224_] * is_215_[i_227_ * 3 + i_225_]);
							is_223_[i_225_ + 3 * i_224_] = 8192 + i_226_ >> -1789420530;
						}
					}
					int i_228_ = (is_175_[0] * i_220_ + (is_175_[1] * i_221_ - -(is_175_[2] * i_222_)) - -8192 >> 1589548206);
					int i_229_ = ((8192 + (i_222_ * is_175_[5] + is_175_[3] * i_220_) + i_221_ * is_175_[4]) >> -1450281138);
					i_228_ += i_191_;
					i_229_ += i_192_;
					int i_230_ = ((8192 + i_222_ * is_175_[8] + i_221_ * is_175_[7] + i_220_ * is_175_[6]) >> -514594002);
					i_230_ += i_193_;
					for (int i_231_ = 0; i_176_ > i_231_; i_231_++) {
						int i_232_ = is[i_231_];
						if ((i_232_ ^ 0xffffffff) > (anIntArrayArray4888.length ^ 0xffffffff)) {
							int[] is_233_ = anIntArrayArray4888[i_232_];
							for (int i_234_ = 0; ((i_234_ ^ 0xffffffff) > (is_233_.length ^ 0xffffffff)); i_234_++) {
								int i_235_ = is_233_[i_234_];
								if (aShortArray4841 == null || (aShortArray4841[i_235_] & i_174_ ^ 0xffffffff) != -1) {
									int i_236_ = ((is_223_[2] * anIntArray4843[i_235_] + (is_223_[1] * anIntArray4856[i_235_]) + ((anIntArray4886[i_235_] * is_223_[0]) - -8192)) >> -574783666);
									int i_237_ = ((8192 + ((anIntArray4843[i_235_] * is_223_[5]) + (anIntArray4886[i_235_] * is_223_[3])) - -(anIntArray4856[i_235_] * is_223_[4])) >> -257899250);
									int i_238_ = ((is_223_[8] * anIntArray4843[i_235_] + (anIntArray4856[i_235_] * is_223_[7]) + ((anIntArray4886[i_235_] * is_223_[6]) + 8192)) >> -1400239762);
									i_237_ += i_229_;
									i_236_ += i_228_;
									i_238_ += i_230_;
									anIntArray4886[i_235_] = i_236_;
									anIntArray4856[i_235_] = i_237_;
									anIntArray4843[i_235_] = i_238_;
								}
							}
						}
					}
				} else {
					for (int i_239_ = 0; i_176_ > i_239_; i_239_++) {
						int i_240_ = is[i_239_];
						if (anIntArrayArray4888.length > i_240_) {
							int[] is_241_ = anIntArrayArray4888[i_240_];
							for (int i_242_ = 0; ((i_242_ ^ 0xffffffff) > (is_241_.length ^ 0xffffffff)); i_242_++) {
								int i_243_ = is_241_[i_242_];
								if (aShortArray4841 == null || (i_174_ & aShortArray4841[i_243_] ^ 0xffffffff) != -1) {
									anIntArray4886[i_243_] -= Class76_Sub11.anInt3800;
									anIntArray4856[i_243_] -= Class98_Sub40.anInt4196;
									anIntArray4843[i_243_] -= Class78.anInt596;
									if ((i_173_ ^ 0xffffffff) != -1) {
										int i_244_ = (Class284_Sub2_Sub2.anIntArray6200[i_173_]);
										int i_245_ = (Class284_Sub2_Sub2.anIntArray6202[i_173_]);
										int i_246_ = (16383 + ((anIntArray4856[i_243_] * i_244_) + (anIntArray4886[i_243_]) * i_245_) >> -1906016466);
										anIntArray4856[i_243_] = ((16383 + (-(i_244_ * anIntArray4886[i_243_]) + (anIntArray4856[i_243_] * i_245_))) >> -1259465906);
										anIntArray4886[i_243_] = i_246_;
									}
									if (i_171_ != 0) {
										int i_247_ = (Class284_Sub2_Sub2.anIntArray6200[i_171_]);
										int i_248_ = (Class284_Sub2_Sub2.anIntArray6202[i_171_]);
										int i_249_ = ((-(i_247_ * anIntArray4843[i_243_]) + ((i_248_ * anIntArray4856[i_243_]) + 16383)) >> 1084813326);
										anIntArray4843[i_243_] = ((16383 + (i_247_ * anIntArray4856[i_243_]) - -(i_248_ * anIntArray4843[i_243_])) >> 1681901230);
										anIntArray4856[i_243_] = i_249_;
									}
									if (i_172_ != 0) {
										int i_250_ = (Class284_Sub2_Sub2.anIntArray6200[i_172_]);
										int i_251_ = (Class284_Sub2_Sub2.anIntArray6202[i_172_]);
										int i_252_ = ((16383 + ((i_250_ * anIntArray4843[i_243_]) - -(anIntArray4886[i_243_] * i_251_))) >> 2144723758);
										anIntArray4843[i_243_] = (-(i_250_ * anIntArray4886[i_243_]) + ((i_251_ * anIntArray4843[i_243_]) + 16383)) >> -1849580242;
										anIntArray4886[i_243_] = i_252_;
									}
									anIntArray4886[i_243_] += Class76_Sub11.anInt3800;
									anIntArray4856[i_243_] += Class98_Sub40.anInt4196;
									anIntArray4843[i_243_] += Class78.anInt596;
								}
							}
						}
					}
					if (bool) {
						for (int i_253_ = 0; (i_253_ ^ 0xffffffff) > (i_176_ ^ 0xffffffff); i_253_++) {
							int i_254_ = is[i_253_];
							if (i_254_ < anIntArrayArray4888.length) {
								int[] is_255_ = anIntArrayArray4888[i_254_];
								for (int i_256_ = 0; ((is_255_.length ^ 0xffffffff) < (i_256_ ^ 0xffffffff)); i_256_++) {
									int i_257_ = is_255_[i_256_];
									if (aShortArray4841 == null || (aShortArray4841[i_257_] & i_174_ ^ 0xffffffff) != -1) {
										int i_258_ = anIntArray4851[i_257_];
										int i_259_ = anIntArray4851[1 + i_257_];
										for (int i_260_ = i_258_; ((i_260_ ^ 0xffffffff) > (i_259_ ^ 0xffffffff)); i_260_++) {
											int i_261_ = aShortArray4887[i_260_] + -1;
											if ((i_261_ ^ 0xffffffff) == 0)
												break;
											if ((i_173_ ^ 0xffffffff) != -1) {
												int i_262_ = (Class284_Sub2_Sub2.anIntArray6200[i_173_]);
												int i_263_ = (Class284_Sub2_Sub2.anIntArray6202[i_173_]);
												int i_264_ = ((16383 + ((i_263_ * (aShortArray4860[i_261_])) + (i_262_ * (aShortArray4884[i_261_])))) >> -154209298);
												aShortArray4884[i_261_] = (short) ((16383 + ((i_263_ * (aShortArray4884[i_261_])) + -((aShortArray4860[i_261_]) * i_262_))) >> -1945765714);
												aShortArray4860[i_261_] = (short) i_264_;
											}
											if ((i_171_ ^ 0xffffffff) != -1) {
												int i_265_ = (Class284_Sub2_Sub2.anIntArray6200[i_171_]);
												int i_266_ = (Class284_Sub2_Sub2.anIntArray6202[i_171_]);
												int i_267_ = ((16383 + -((aShortArray4849[i_261_]) * i_265_) + (aShortArray4884[i_261_]) * i_266_) >> -1773313042);
												aShortArray4849[i_261_] = (short) ((16383 + ((aShortArray4884[i_261_]) * i_265_) + (i_266_ * (aShortArray4849[i_261_]))) >> -2139001330);
												aShortArray4884[i_261_] = (short) i_267_;
											}
											if ((i_172_ ^ 0xffffffff) != -1) {
												int i_268_ = (Class284_Sub2_Sub2.anIntArray6200[i_172_]);
												int i_269_ = (Class284_Sub2_Sub2.anIntArray6202[i_172_]);
												int i_270_ = ((16383 + (aShortArray4849[i_261_]) * i_268_ + (i_269_ * (aShortArray4860[i_261_]))) >> -541471954);
												aShortArray4849[i_261_] = (short) (((i_269_ * (aShortArray4849[i_261_])) + (-((aShortArray4860[i_261_]) * i_268_) + 16383)) >> 1560966254);
												aShortArray4860[i_261_] = (short) i_270_;
											}
										}
									}
								}
							}
						}
						if (aClass104_4859 == null && aClass104_4854 != null)
							((Class104) aClass104_4854).anInterface16_902 = null;
						if (aClass104_4859 != null)
							((Class104) aClass104_4859).anInterface16_902 = null;
					}
				}
			} else if (i == 3) {
				if (is_175_ == null) {
					for (int i_271_ = 0; i_176_ > i_271_; i_271_++) {
						int i_272_ = is[i_271_];
						if ((anIntArrayArray4888.length ^ 0xffffffff) < (i_272_ ^ 0xffffffff)) {
							int[] is_273_ = anIntArrayArray4888[i_272_];
							for (int i_274_ = 0; ((is_273_.length ^ 0xffffffff) < (i_274_ ^ 0xffffffff)); i_274_++) {
								int i_275_ = is_273_[i_274_];
								if (aShortArray4841 == null || ((i_174_ & aShortArray4841[i_275_]) != 0)) {
									anIntArray4886[i_275_] -= Class76_Sub11.anInt3800;
									anIntArray4856[i_275_] -= Class98_Sub40.anInt4196;
									anIntArray4843[i_275_] -= Class78.anInt596;
									anIntArray4886[i_275_] = (anIntArray4886[i_275_] * i_171_ >> 1015972295);
									anIntArray4856[i_275_] = (anIntArray4856[i_275_] * i_172_ >> -176902617);
									anIntArray4843[i_275_] = (i_173_ * anIntArray4843[i_275_] >> 364093863);
									anIntArray4886[i_275_] += Class76_Sub11.anInt3800;
									anIntArray4856[i_275_] += Class98_Sub40.anInt4196;
									anIntArray4843[i_275_] += Class78.anInt596;
								}
							}
						}
					}
				} else {
					int i_276_ = is_175_[9] << 868159748;
					int i_277_ = is_175_[10] << -1220373788;
					int i_278_ = is_175_[11] << -468521148;
					int i_279_ = is_175_[12] << -277205308;
					int i_280_ = is_175_[13] << -1570544540;
					int i_281_ = is_175_[14] << 916366532;
					if (Class379.aBoolean3192) {
						int i_282_ = (8192 + (is_175_[0] * Class76_Sub11.anInt3800 - (-(is_175_[3] * Class98_Sub40.anInt4196) - is_175_[6] * Class78.anInt596)) >> -183007474);
						int i_283_ = ((Class78.anInt596 * is_175_[7] + Class76_Sub11.anInt3800 * is_175_[1] + is_175_[4] * Class98_Sub40.anInt4196 + 8192) >> -390869586);
						i_282_ += i_279_;
						int i_284_ = ((is_175_[5] * Class98_Sub40.anInt4196 + (is_175_[2] * Class76_Sub11.anInt3800 - -(is_175_[8] * Class78.anInt596)) + 8192) >> -780469330);
						i_283_ += i_280_;
						i_284_ += i_281_;
						Class76_Sub11.anInt3800 = i_282_;
						Class98_Sub40.anInt4196 = i_283_;
						Class78.anInt596 = i_284_;
						Class379.aBoolean3192 = false;
					}
					int i_285_ = i_171_ << -1994066449 >> 2020993959;
					int i_286_ = i_172_ << -359400753 >> -1057023961;
					int i_287_ = i_173_ << 351861295 >> 279282855;
					int i_288_ = (i_285_ * -Class76_Sub11.anInt3800 + 8192 >> -703746386);
					int i_289_ = (8192 + i_286_ * -Class98_Sub40.anInt4196 >> 985376366);
					int i_290_ = 8192 + -Class78.anInt596 * i_287_ >> 1544249166;
					int i_291_ = i_288_ + Class76_Sub11.anInt3800;
					int i_292_ = Class98_Sub40.anInt4196 + i_289_;
					int i_293_ = i_290_ + Class78.anInt596;
					int[] is_294_ = new int[9];
					is_294_[0] = is_175_[0] * i_285_ - -8192 >> 1681969838;
					is_294_[1] = is_175_[3] * i_285_ - -8192 >> -1106414194;
					is_294_[2] = 8192 + i_285_ * is_175_[6] >> -930718354;
					is_294_[5] = i_286_ * is_175_[7] + 8192 >> -2135603986;
					is_294_[3] = 8192 + is_175_[1] * i_286_ >> -1263801714;
					is_294_[4] = is_175_[4] * i_286_ - -8192 >> -915008530;
					is_294_[6] = 8192 + i_287_ * is_175_[2] >> 648234030;
					is_294_[7] = i_287_ * is_175_[5] - -8192 >> 568971278;
					is_294_[8] = 8192 + i_287_ * is_175_[8] >> 2111175182;
					int i_295_ = i_285_ * i_279_ - -8192 >> -2075031634;
					int i_296_ = 8192 + i_286_ * i_280_ >> 1259859758;
					int i_297_ = i_281_ * i_287_ - -8192 >> 1650775566;
					i_296_ += i_292_;
					i_295_ += i_291_;
					i_297_ += i_293_;
					int[] is_298_ = new int[9];
					for (int i_299_ = 0; (i_299_ ^ 0xffffffff) > -4; i_299_++) {
						for (int i_300_ = 0; (i_300_ ^ 0xffffffff) > -4; i_300_++) {
							int i_301_ = 0;
							for (int i_302_ = 0; (i_302_ ^ 0xffffffff) > -4; i_302_++)
								i_301_ += (is_294_[3 * i_302_ + i_300_] * is_175_[3 * i_299_ + i_302_]);
							is_298_[3 * i_299_ + i_300_] = i_301_ - -8192 >> -453481650;
						}
					}
					int i_303_ = ((8192 + i_296_ * is_175_[1] + is_175_[0] * i_295_ - -(i_297_ * is_175_[2])) >> 1333433646);
					int i_304_ = (is_175_[3] * i_295_ + (is_175_[4] * i_296_ + i_297_ * is_175_[5] + 8192) >> -125666770);
					int i_305_ = ((i_296_ * is_175_[7] + i_295_ * is_175_[6] - -(is_175_[8] * i_297_) + 8192) >> -860132626);
					i_303_ += i_276_;
					i_304_ += i_277_;
					i_305_ += i_278_;
					for (int i_306_ = 0; i_306_ < i_176_; i_306_++) {
						int i_307_ = is[i_306_];
						if ((anIntArrayArray4888.length ^ 0xffffffff) < (i_307_ ^ 0xffffffff)) {
							int[] is_308_ = anIntArrayArray4888[i_307_];
							for (int i_309_ = 0; is_308_.length > i_309_; i_309_++) {
								int i_310_ = is_308_[i_309_];
								if (aShortArray4841 == null || ((i_174_ & aShortArray4841[i_310_]) != 0)) {
									int i_311_ = ((is_298_[2] * anIntArray4843[i_310_] + ((anIntArray4886[i_310_] * is_298_[0]) + (anIntArray4856[i_310_] * is_298_[1])) - -8192) >> -1957392594);
									int i_312_ = ((anIntArray4843[i_310_] * is_298_[5] + ((anIntArray4886[i_310_] * is_298_[3]) + (anIntArray4856[i_310_] * is_298_[4]) - -8192)) >> -1223485906);
									int i_313_ = ((anIntArray4856[i_310_] * is_298_[7] + ((anIntArray4886[i_310_] * is_298_[6]) + ((is_298_[8] * anIntArray4843[i_310_]) - -8192))) >> 1209563310);
									i_311_ += i_303_;
									i_312_ += i_304_;
									i_313_ += i_305_;
									anIntArray4886[i_310_] = i_311_;
									anIntArray4856[i_310_] = i_312_;
									anIntArray4843[i_310_] = i_313_;
								}
							}
						}
					}
				}
			} else if (i == 5) {
				if (anIntArrayArray4870 != null) {
					for (int i_314_ = 0; (i_176_ ^ 0xffffffff) < (i_314_ ^ 0xffffffff); i_314_++) {
						int i_315_ = is[i_314_];
						if ((anIntArrayArray4870.length ^ 0xffffffff) < (i_315_ ^ 0xffffffff)) {
							int[] is_316_ = anIntArrayArray4870[i_315_];
							for (int i_317_ = 0; ((i_317_ ^ 0xffffffff) > (is_316_.length ^ 0xffffffff)); i_317_++) {
								int i_318_ = is_316_[i_317_];
								if (aShortArray4864 == null || (aShortArray4864[i_318_] & i_174_ ^ 0xffffffff) != -1) {
									int i_319_ = (i_171_ * 8 + (0xff & aByteArray4882[i_318_]));
									if ((i_319_ ^ 0xffffffff) > -1)
										i_319_ = 0;
									else if (i_319_ > 255)
										i_319_ = 255;
									aByteArray4882[i_318_] = (byte) i_319_;
									if (aClass104_4854 != null)
										((Class104) aClass104_4854).anInterface16_902 = null;
								}
							}
						}
					}
					if (aClass249Array4877 != null) {
						for (int i_320_ = 0; anInt4866 > i_320_; i_320_++) {
							Class249 class249 = aClass249Array4877[i_320_];
							Class219 class219 = aClass219Array4861[i_320_];
							((Class219) class219).anInt1643 = (-((aByteArray4882[((Class249) class249).anInt1905]) & 0xff) + 255 << -573778056 | (((Class219) class219).anInt1643 & 0xffffff));
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				if (anIntArrayArray4870 != null) {
					for (int i_321_ = 0; (i_176_ ^ 0xffffffff) < (i_321_ ^ 0xffffffff); i_321_++) {
						int i_322_ = is[i_321_];
						if ((anIntArrayArray4870.length ^ 0xffffffff) < (i_322_ ^ 0xffffffff)) {
							int[] is_323_ = anIntArrayArray4870[i_322_];
							for (int i_324_ = 0; ((i_324_ ^ 0xffffffff) > (is_323_.length ^ 0xffffffff)); i_324_++) {
								int i_325_ = is_323_[i_324_];
								if (aShortArray4864 == null || (i_174_ & aShortArray4864[i_325_] ^ 0xffffffff) != -1) {
									int i_326_ = 0xffff & aShortArray4842[i_325_];
									int i_327_ = (i_326_ & 0xfd5b) >> -360939670;
									int i_328_ = (0x3fc & i_326_) >> -1854591289;
									i_327_ = i_171_ + i_327_ & 0x3f;
									int i_329_ = i_326_ & 0x7f;
									i_328_ += i_172_ / 4;
									if (i_328_ >= 0) {
										if ((i_328_ ^ 0xffffffff) < -8)
											i_328_ = 7;
									} else
										i_328_ = 0;
									i_329_ += i_173_;
									if ((i_329_ ^ 0xffffffff) > -1)
										i_329_ = 0;
									else if (i_329_ > 127)
										i_329_ = 127;
									aShortArray4842[i_325_] = (short) (Class41.method366((Class41.method366(i_328_ << 2014646919, i_327_ << -1621533334)), i_329_));
									if (aClass104_4854 != null)
										((Class104) aClass104_4854).anInterface16_902 = null;
								}
							}
						}
					}
					if (aClass249Array4877 != null) {
						for (int i_330_ = 0; i_330_ < anInt4866; i_330_++) {
							Class249 class249 = aClass249Array4877[i_330_];
							Class219 class219 = aClass219Array4861[i_330_];
							((Class219) class219).anInt1643 = (((Class219) class219).anInt1643 & ~0xffffff | (0xffffff & (Class208.anIntArray1579[0xffff & (aShortArray4842[(((Class249) class249).anInt1905)])])));
						}
					}
				}
			} else if (i == 8) {
				if (anIntArrayArray4875 != null) {
					for (int i_331_ = 0; (i_176_ ^ 0xffffffff) < (i_331_ ^ 0xffffffff); i_331_++) {
						int i_332_ = is[i_331_];
						if ((i_332_ ^ 0xffffffff) > (anIntArrayArray4875.length ^ 0xffffffff)) {
							int[] is_333_ = anIntArrayArray4875[i_332_];
							for (int i_334_ = 0; ((is_333_.length ^ 0xffffffff) < (i_334_ ^ 0xffffffff)); i_334_++) {
								Class219 class219 = aClass219Array4861[is_333_[i_334_]];
								((Class219) class219).anInt1644 += i_172_;
								((Class219) class219).anInt1638 += i_171_;
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -11) {
				if (anIntArrayArray4875 != null) {
					for (int i_335_ = 0; (i_176_ ^ 0xffffffff) < (i_335_ ^ 0xffffffff); i_335_++) {
						int i_336_ = is[i_335_];
						if ((anIntArrayArray4875.length ^ 0xffffffff) < (i_336_ ^ 0xffffffff)) {
							int[] is_337_ = anIntArrayArray4875[i_336_];
							for (int i_338_ = 0; ((i_338_ ^ 0xffffffff) > (is_337_.length ^ 0xffffffff)); i_338_++) {
								Class219 class219 = aClass219Array4861[is_337_[i_338_]];
								((Class219) class219).anInt1637 = (i_171_ * ((Class219) class219).anInt1637 >> 1902593511);
								((Class219) class219).anInt1645 = (((Class219) class219).anInt1645 * i_172_ >> -404777401);
							}
						}
					}
				}
			} else if (i == 9) {
				if (anIntArrayArray4875 != null) {
					for (int i_339_ = 0; (i_339_ ^ 0xffffffff) > (i_176_ ^ 0xffffffff); i_339_++) {
						int i_340_ = is[i_339_];
						if (anIntArrayArray4875.length > i_340_) {
							int[] is_341_ = anIntArrayArray4875[i_340_];
							for (int i_342_ = 0; ((i_342_ ^ 0xffffffff) > (is_341_.length ^ 0xffffffff)); i_342_++) {
								Class219 class219 = aClass219Array4861[is_341_[i_342_]];
								((Class219) class219).anInt1639 = (i_171_ + ((Class219) class219).anInt1639 & 0x3fff);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.I(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_171_ + ',' + i_172_ + ',' + i_173_ + ',' + bool + ',' + i_174_ + ',' + (is_175_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final short method2381(byte i, float f, int i_343_, int i_344_, int i_345_, long l, float f_346_, int i_347_, ModelDefinitions class178, int i_348_) {
		try {
			int i_349_ = anIntArray4851[i_343_];
			int i_350_ = anIntArray4851[1 + i_343_];
			int i_351_ = 0;
			for (int i_352_ = i_349_; i_352_ < i_350_; i_352_++) {
				short i_353_ = aShortArray4887[i_352_];
				if ((i_353_ ^ 0xffffffff) == -1) {
					i_351_ = i_352_;
					break;
				}
				if (Class151_Sub1.aLongArray4970[i_352_] == l)
					return (short) (-1 + i_353_);
			}
			aShortArray4887[i_351_] = (short) (anInt4846 - -1);
			Class151_Sub1.aLongArray4970[i_351_] = l;
			aShortArray4860[anInt4846] = (short) i_345_;
			aShortArray4884[anInt4846] = (short) i_347_;
			aShortArray4849[anInt4846] = (short) i_348_;
			aByteArray4858[anInt4846] = (byte) i_344_;
			aFloatArray4897[anInt4846] = f_346_;
			if (i < 14)
				return (short) 39;
			aFloatArray4890[anInt4846] = f;
			return (short) anInt4846++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.E(" + i + ',' + f + ',' + i_343_ + ',' + i_344_ + ',' + i_345_ + ',' + l + ',' + f_346_ + ',' + i_347_ + ',' + (class178 != null ? "{...}" : "null") + ',' + i_348_ + ')'));
		}
	}

	final void C(int i) {
		do {
			try {
				aShort4867 = (short) i;
				if (aClass104_4854 == null)
					break;
				((Class104) aClass104_4854).anInterface16_902 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void P(int i, int i_354_, int i_355_, int i_356_) {
		try {
			if (i == 0) {
				Class76_Sub11.anInt3800 = 0;
				Class78.anInt596 = 0;
				Class98_Sub40.anInt4196 = 0;
				int i_357_ = 0;
				for (int i_358_ = 0; (anInt4883 ^ 0xffffffff) < (i_358_ ^ 0xffffffff); i_358_++) {
					Class76_Sub11.anInt3800 += anIntArray4886[i_358_];
					Class98_Sub40.anInt4196 += anIntArray4856[i_358_];
					Class78.anInt596 += anIntArray4843[i_358_];
					i_357_++;
				}
				if ((i_357_ ^ 0xffffffff) < -1) {
					Class76_Sub11.anInt3800 = Class76_Sub11.anInt3800 / i_357_ + i_354_;
					Class78.anInt596 = i_356_ + Class78.anInt596 / i_357_;
					Class98_Sub40.anInt4196 = Class98_Sub40.anInt4196 / i_357_ - -i_355_;
				} else {
					Class78.anInt596 = i_356_;
					Class76_Sub11.anInt3800 = i_354_;
					Class98_Sub40.anInt4196 = i_355_;
				}
			} else if (i == 1) {
				for (int i_359_ = 0; (i_359_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff); i_359_++) {
					anIntArray4886[i_359_] += i_354_;
					anIntArray4856[i_359_] += i_355_;
					anIntArray4843[i_359_] += i_356_;
				}
			} else if ((i ^ 0xffffffff) == -3) {
				for (int i_360_ = 0; (anInt4883 ^ 0xffffffff) < (i_360_ ^ 0xffffffff); i_360_++) {
					anIntArray4886[i_360_] -= Class76_Sub11.anInt3800;
					anIntArray4856[i_360_] -= Class98_Sub40.anInt4196;
					anIntArray4843[i_360_] -= Class78.anInt596;
					if ((i_356_ ^ 0xffffffff) != -1) {
						int i_361_ = Class284_Sub2_Sub2.anIntArray6200[i_356_];
						int i_362_ = Class284_Sub2_Sub2.anIntArray6202[i_356_];
						int i_363_ = ((anIntArray4886[i_360_] * i_362_ + (i_361_ * anIntArray4856[i_360_] - -16383)) >> 1144997998);
						anIntArray4856[i_360_] = ((16383 + -(anIntArray4886[i_360_] * i_361_) + i_362_ * anIntArray4856[i_360_]) >> -1527810002);
						anIntArray4886[i_360_] = i_363_;
					}
					if ((i_354_ ^ 0xffffffff) != -1) {
						int i_364_ = Class284_Sub2_Sub2.anIntArray6200[i_354_];
						int i_365_ = Class284_Sub2_Sub2.anIntArray6202[i_354_];
						int i_366_ = ((-(anIntArray4843[i_360_] * i_364_) + anIntArray4856[i_360_] * i_365_ + 16383) >> 1585191406);
						anIntArray4843[i_360_] = ((i_364_ * anIntArray4856[i_360_] + (anIntArray4843[i_360_] * i_365_ - -16383)) >> 914709166);
						anIntArray4856[i_360_] = i_366_;
					}
					if (i_355_ != 0) {
						int i_367_ = Class284_Sub2_Sub2.anIntArray6200[i_355_];
						int i_368_ = Class284_Sub2_Sub2.anIntArray6202[i_355_];
						int i_369_ = ((i_367_ * anIntArray4843[i_360_] - (-(anIntArray4886[i_360_] * i_368_) - 16383)) >> 1825413646);
						anIntArray4843[i_360_] = ((anIntArray4843[i_360_] * i_368_ + -(i_367_ * anIntArray4886[i_360_]) + 16383) >> 575486126);
						anIntArray4886[i_360_] = i_369_;
					}
					anIntArray4886[i_360_] += Class76_Sub11.anInt3800;
					anIntArray4856[i_360_] += Class98_Sub40.anInt4196;
					anIntArray4843[i_360_] += Class78.anInt596;
				}
			} else if (i == 3) {
				for (int i_370_ = 0; (anInt4883 ^ 0xffffffff) < (i_370_ ^ 0xffffffff); i_370_++) {
					anIntArray4886[i_370_] -= Class76_Sub11.anInt3800;
					anIntArray4856[i_370_] -= Class98_Sub40.anInt4196;
					anIntArray4843[i_370_] -= Class78.anInt596;
					anIntArray4886[i_370_] = anIntArray4886[i_370_] * i_354_ / 128;
					anIntArray4856[i_370_] = anIntArray4856[i_370_] * i_355_ / 128;
					anIntArray4843[i_370_] = i_356_ * anIntArray4843[i_370_] / 128;
					anIntArray4886[i_370_] += Class76_Sub11.anInt3800;
					anIntArray4856[i_370_] += Class98_Sub40.anInt4196;
					anIntArray4843[i_370_] += Class78.anInt596;
				}
			} else if ((i ^ 0xffffffff) == -6) {
				for (int i_371_ = 0; (i_371_ ^ 0xffffffff) > (anInt4853 ^ 0xffffffff); i_371_++) {
					int i_372_ = i_354_ * 8 + (0xff & aByteArray4882[i_371_]);
					if ((i_372_ ^ 0xffffffff) > -1)
						i_372_ = 0;
					else if (i_372_ > 255)
						i_372_ = 255;
					aByteArray4882[i_371_] = (byte) i_372_;
				}
				if (aClass104_4854 != null)
					((Class104) aClass104_4854).anInterface16_902 = null;
				if (aClass249Array4877 != null) {
					for (int i_373_ = 0; i_373_ < anInt4866; i_373_++) {
						Class249 class249 = aClass249Array4877[i_373_];
						Class219 class219 = aClass219Array4861[i_373_];
						((Class219) class219).anInt1643 = ((-(0xff & aByteArray4882[(((Class249) class249).anInt1905)]) + 255 << 512722744) | 0xffffff & ((Class219) class219).anInt1643);
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				for (int i_374_ = 0; anInt4853 > i_374_; i_374_++) {
					int i_375_ = aShortArray4842[i_374_] & 0xffff;
					int i_376_ = i_375_ >> 108096874 & 0x3f;
					int i_377_ = 0x7 & i_375_ >> -1933036857;
					i_376_ = 0x3f & i_354_ + i_376_;
					i_377_ += i_355_ / 4;
					int i_378_ = i_375_ & 0x7f;
					if (i_377_ < 0)
						i_377_ = 0;
					else if (i_377_ > 7)
						i_377_ = 7;
					i_378_ += i_356_;
					if (i_378_ < 0)
						i_378_ = 0;
					else if ((i_378_ ^ 0xffffffff) < -128)
						i_378_ = 127;
					aShortArray4842[i_374_] = (short) (Class41.method366(Class41.method366(i_376_ << -1704472598, i_377_ << -1983873977), i_378_));
				}
				if (aClass104_4854 != null)
					((Class104) aClass104_4854).anInterface16_902 = null;
				if (aClass249Array4877 != null) {
					for (int i_379_ = 0; (anInt4866 ^ 0xffffffff) < (i_379_ ^ 0xffffffff); i_379_++) {
						Class249 class249 = aClass249Array4877[i_379_];
						Class219 class219 = aClass219Array4861[i_379_];
						((Class219) class219).anInt1643 = (~0xffffff & ((Class219) class219).anInt1643 | ((Class208.anIntArray1579[aShortArray4842[(((Class249) class249).anInt1905)] & 0xffff]) & 0xffffff));
					}
				}
			} else if ((i ^ 0xffffffff) == -9) {
				for (int i_380_ = 0; i_380_ < anInt4866; i_380_++) {
					Class219 class219 = aClass219Array4861[i_380_];
					((Class219) class219).anInt1644 += i_355_;
					((Class219) class219).anInt1638 += i_354_;
				}
			} else if ((i ^ 0xffffffff) == -11) {
				for (int i_381_ = 0; anInt4866 > i_381_; i_381_++) {
					Class219 class219 = aClass219Array4861[i_381_];
					((Class219) class219).anInt1637 = (i_354_ * ((Class219) class219).anInt1637 >> -113609817);
					((Class219) class219).anInt1645 = (i_355_ * ((Class219) class219).anInt1645 >> 559966631);
				}
			} else if (i == 9) {
				for (int i_382_ = 0; (anInt4866 ^ 0xffffffff) < (i_382_ ^ 0xffffffff); i_382_++) {
					Class219 class219 = aClass219Array4861[i_382_];
					((Class219) class219).anInt1639 = 0x3fff & i_354_ + ((Class219) class219).anInt1639;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.P(" + i + ',' + i_354_ + ',' + i_355_ + ',' + i_356_ + ')'));
		}
	}

	final int fa() {
		try {
			if (!aBoolean4847)
				method2380(-89);
			return aShort4868;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.fa(" + ')');
		}
	}

	final Class87[] method2320() {
		try {
			return aClass87Array4881;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.IB(" + ')');
		}
	}

	private final void method2382(byte i) {
		do {
			try {
				if ((anInt4896 ^ 0xffffffff) != -1) {
					if ((aByte4885 ^ 0xffffffff) != -1)
						method2390(33, true);
					method2390(114, false);
					if (aClass322_4838 != null) {
						if (((Class322) aClass322_4838).anInterface8_2711 == null)
							method2388((aByte4885 & 0x10 ^ 0xffffffff) != -1, -256);
						if (((Class322) aClass322_4838).anInterface8_2711 != null) {
							aHa_Sub1_4865.method1851(aClass104_4859 != null, false);
							aHa_Sub1_4865.method1868(aClass104_4854, aClass104_4859, aClass104_4874, aClass104_4889, 0);
							int i_383_ = anIntArray4850.length - 1;
							for (int i_384_ = 0; (i_383_ ^ 0xffffffff) < (i_384_ ^ 0xffffffff); i_384_++) {
								int i_385_ = anIntArray4850[i_384_];
								int i_386_ = anIntArray4850[1 + i_384_];
								int i_387_ = aShortArray4869[i_385_] & 0xffff;
								if ((i_387_ ^ 0xffffffff) == -65536)
									i_387_ = -1;
								aHa_Sub1_4865.method1908((aClass104_4859 != null), -90, i_387_);
								aHa_Sub1_4865.method1865(3 * (-i_385_ + i_386_), 4, (((Class322) aClass322_4838).anInterface8_2711), false, 3 * i_385_);
							}
						}
					}
					method2383(-49);
					if (i == -104)
						break;
					aClass14_4898 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.IA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void LA(int i) {
		do {
			try {
				aShort4872 = (short) i;
				if (aClass104_4854 != null)
					((Class104) aClass104_4854).anInterface16_902 = null;
				if (aClass104_4859 == null)
					break;
				((Class104) aClass104_4859).anInterface16_902 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.LA(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2383(int i) {
		do {
			try {
				if (aBoolean4871) {
					aBoolean4871 = false;
					if (i >= -48)
						EA();
					if (aClass87Array4881 == null && aClass35Array4863 == null && aClass249Array4877 == null) {
						if (anIntArray4886 != null && !Class98_Sub10_Sub18.method1055(anInt4894, anInt4837, (byte) -11)) {
							if (aClass104_4889 == null || (((Class104) aClass104_4889).anInterface16_902) != null) {
								if (!aBoolean4847)
									method2380(-87);
								anIntArray4886 = null;
							} else
								aBoolean4871 = true;
						}
						if (anIntArray4856 != null && !Class287.method3386(anInt4894, anInt4837, (byte) 120)) {
							if (aClass104_4889 != null && (((Class104) aClass104_4889).anInterface16_902) == null)
								aBoolean4871 = true;
							else {
								if (!aBoolean4847)
									method2380(-102);
								anIntArray4856 = null;
							}
						}
						if (anIntArray4843 != null && !Class94.method917((byte) -95, anInt4837, anInt4894)) {
							if (aClass104_4889 != null && (((Class104) aClass104_4889).anInterface16_902) == null)
								aBoolean4871 = true;
							else {
								if (!aBoolean4847)
									method2380(-111);
								anIntArray4843 = null;
							}
						}
					}
					if (aShortArray4887 != null && anIntArray4886 == null && anIntArray4856 == null && anIntArray4843 == null) {
						aShortArray4887 = null;
						anIntArray4851 = null;
					}
					if (aByteArray4858 != null && !Class187.method2636(anInt4894, anInt4837, 3)) {
						if (aClass104_4859 != null) {
							if (((Class104) aClass104_4859).anInterface16_902 == null)
								aBoolean4871 = true;
							else {
								aByteArray4858 = null;
								aShortArray4860 = aShortArray4884 = aShortArray4849 = null;
							}
						} else if (aClass104_4854 != null && (((Class104) aClass104_4854).anInterface16_902) == null)
							aBoolean4871 = true;
						else {
							aByteArray4858 = null;
							aShortArray4860 = aShortArray4884 = aShortArray4849 = null;
						}
					}
					if (aShortArray4842 != null && !Class29.method300(false, anInt4837, anInt4894)) {
						if (aClass104_4854 != null && (((Class104) aClass104_4854).anInterface16_902 == null))
							aBoolean4871 = true;
						else
							aShortArray4842 = null;
					}
					if (aByteArray4882 != null && !Class246_Sub3_Sub2_Sub1.method3007(anInt4894, anInt4837, (byte) -15)) {
						if (aClass104_4854 != null && (((Class104) aClass104_4854).anInterface16_902 == null))
							aBoolean4871 = true;
						else
							aByteArray4882 = null;
					}
					if (aFloatArray4897 != null && !Class98_Sub10_Sub14.method1047(anInt4837, (byte) 70, anInt4894)) {
						if (aClass104_4874 == null || (((Class104) aClass104_4874).anInterface16_902 != null))
							aFloatArray4897 = aFloatArray4890 = null;
						else
							aBoolean4871 = true;
					}
					if (aShortArray4869 != null && !Class59.method524(anInt4894, anInt4837, 113)) {
						if (aClass104_4854 == null || (((Class104) aClass104_4854).anInterface16_902 != null))
							aShortArray4869 = null;
						else
							aBoolean4871 = true;
					}
					if (aShortArray4895 != null && !Class373_Sub1_Sub1.method3973(anInt4894, anInt4837, 48)) {
						if ((aClass322_4838 != null && (((Class322) aClass322_4838).anInterface8_2711 == null)) || (aClass104_4854 != null && (((Class104) aClass104_4854).anInterface16_902) == null))
							aBoolean4871 = true;
						else
							aShortArray4895 = aShortArray4852 = aShortArray4878 = null;
					}
					if (anIntArrayArray4870 != null && !Class98_Sub46_Sub9.method1554(anInt4894, 22251, anInt4837)) {
						aShortArray4864 = null;
						anIntArrayArray4870 = null;
					}
					if (anIntArrayArray4888 != null && !Class111.method2095(anInt4837, anInt4894, (byte) -88)) {
						aShortArray4841 = null;
						anIntArrayArray4888 = null;
					}
					if (anIntArrayArray4875 != null && !Class64.method555(anInt4837, anInt4894, -86))
						anIntArrayArray4875 = null;
					if (anIntArray4850 == null || (0x800 & anInt4894) != 0 || (anInt4894 & 0x40000) != 0)
						break;
					anIntArray4850 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2339(int i, int i_388_, Class111 class111, boolean bool, int i_389_) {
		try {
			return method2389(i_389_, i_388_, i, class111, false, -1, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.CB(" + i + ',' + i_388_ + ',' + (class111 != null ? "{...}" : "null") + ',' + bool + ',' + i_389_ + ')'));
		}
	}

	final int ma() {
		try {
			if (!aBoolean4847)
				method2380(-97);
			return aShort4844;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.ma(" + ')');
		}
	}

	final void method2325(Class111 class111, Class246_Sub6 class246_sub6, int i) {
		try {
			if ((anInt4846 ^ 0xffffffff) != -1) {
				Class111_Sub1 class111_sub1 = ((ha_Sub1) aHa_Sub1_4865).aClass111_Sub1_4348;
				if (!aBoolean4847)
					method2380(-126);
				Class111_Sub1 class111_sub1_390_ = (Class111_Sub1) class111;
				Class151_Sub4.aFloat4989 = ((((Class111_Sub1) class111_sub1).aFloat4684 * ((Class111_Sub1) class111_sub1_390_).aFloat4679) + (((Class111_Sub1) class111_sub1).aFloat4676 * ((Class111_Sub1) class111_sub1_390_).aFloat4675) + (((Class111_Sub1) class111_sub1_390_).aFloat4676 * ((Class111_Sub1) class111_sub1).aFloat4673));
				Class48_Sub1_Sub1.aFloat5505 = ((((Class111_Sub1) class111_sub1_390_).aFloat4683 * ((Class111_Sub1) class111_sub1).aFloat4676) + (((Class111_Sub1) class111_sub1).aFloat4684 * ((Class111_Sub1) class111_sub1_390_).aFloat4674) + (((Class111_Sub1) class111_sub1_390_).aFloat4677 * ((Class111_Sub1) class111_sub1).aFloat4673) + ((Class111_Sub1) class111_sub1).aFloat4677);
				float f = (Class151_Sub4.aFloat4989 * (float) aShort4868 + Class48_Sub1_Sub1.aFloat5505);
				float f_391_ = (Class48_Sub1_Sub1.aFloat5505 + Class151_Sub4.aFloat4989 * (float) aShort4879);
				float f_392_;
				float f_393_;
				if (f_391_ < f) {
					f_392_ = f_391_ - (float) aShort4876;
					f_393_ = f + (float) aShort4876;
				} else {
					f_392_ = f - (float) aShort4876;
					f_393_ = f_391_ + (float) aShort4876;
				}
				if (!(((ha_Sub1) aHa_Sub1_4865).aFloat4401 <= f_392_) && !((float) ((ha_Sub1) aHa_Sub1_4865).anInt4404 >= f_393_)) {
					Class50.aFloat419 = ((((Class111_Sub1) class111_sub1).aFloat4686 * ((Class111_Sub1) class111_sub1_390_).aFloat4674) + (((Class111_Sub1) class111_sub1).aFloat4679 * (((Class111_Sub1) class111_sub1_390_).aFloat4683)) + (((Class111_Sub1) class111_sub1_390_).aFloat4677 * ((Class111_Sub1) class111_sub1).aFloat4680) + ((Class111_Sub1) class111_sub1).aFloat4674);
					Class286.aFloat2182 = ((((Class111_Sub1) class111_sub1_390_).aFloat4676 * ((Class111_Sub1) class111_sub1).aFloat4680) + ((((Class111_Sub1) class111_sub1).aFloat4686 * (((Class111_Sub1) class111_sub1_390_).aFloat4679)) + (((Class111_Sub1) class111_sub1).aFloat4679 * (((Class111_Sub1) class111_sub1_390_).aFloat4675))));
					float f_394_ = (Class50.aFloat419 + Class286.aFloat2182 * (float) aShort4868);
					float f_395_ = ((float) aShort4879 * Class286.aFloat2182 + Class50.aFloat419);
					float f_396_;
					float f_397_;
					if (!(f_395_ < f_394_)) {
						f_397_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4419 * (f_395_ + (float) aShort4876));
						f_396_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4419 * ((float) -aShort4876 + f_394_));
					} else {
						f_396_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4419 * ((float) -aShort4876 + f_395_));
						f_397_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4419 * (f_394_ + (float) aShort4876));
					}
					if (!(((ha_Sub1) aHa_Sub1_4865).aFloat4364 <= f_396_ / f_393_) && !(f_397_ / f_393_ <= ((ha_Sub1) aHa_Sub1_4865).aFloat4421)) {
						Class376.aFloat3171 = (((Class111_Sub1) class111_sub1).aFloat4683 + (((((Class111_Sub1) class111_sub1_390_).aFloat4683) * (((Class111_Sub1) class111_sub1).aFloat4675)) + (((Class111_Sub1) class111_sub1).aFloat4678 * (((Class111_Sub1) class111_sub1_390_).aFloat4674)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4677) * (((Class111_Sub1) class111_sub1).aFloat4687))));
						IncomingMessages.aFloat5515 = ((((Class111_Sub1) class111_sub1).aFloat4678 * (((Class111_Sub1) class111_sub1_390_).aFloat4679)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4675) * ((Class111_Sub1) class111_sub1).aFloat4675) + (((Class111_Sub1) class111_sub1).aFloat4687 * (((Class111_Sub1) class111_sub1_390_).aFloat4676)));
						float f_398_ = (((float) aShort4868 * IncomingMessages.aFloat5515) + Class376.aFloat3171);
						float f_399_ = ((IncomingMessages.aFloat5515 * (float) aShort4879) + Class376.aFloat3171);
						float f_400_;
						float f_401_;
						if (!(f_398_ > f_399_)) {
							f_401_ = ((f_399_ + (float) aShort4876) * (float) (((ha_Sub1) aHa_Sub1_4865).anInt4381));
							f_400_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4381 * (f_398_ - (float) aShort4876));
						} else {
							f_400_ = ((f_399_ - (float) aShort4876) * (float) (((ha_Sub1) aHa_Sub1_4865).anInt4381));
							f_401_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4381 * ((float) aShort4876 + f_398_));
						}
						if (!(((ha_Sub1) aHa_Sub1_4865).aFloat4437 <= f_400_ / f_393_) && !(((ha_Sub1) aHa_Sub1_4865).aFloat4359 >= f_401_ / f_393_)) {
							if (class246_sub6 != null || aClass249Array4877 != null) {
								Class372.aFloat3151 = (((((Class111_Sub1) class111_sub1_390_).aFloat4686) * (((Class111_Sub1) class111_sub1).aFloat4684)) + ((((Class111_Sub1) class111_sub1).aFloat4676) * ((Class111_Sub1) class111_sub1_390_).aFloat4678) + ((((Class111_Sub1) class111_sub1_390_).aFloat4684) * (((Class111_Sub1) class111_sub1).aFloat4673)));
								Class287_Sub2.aFloat3273 = (((((Class111_Sub1) class111_sub1_390_).aFloat4687) * (((Class111_Sub1) class111_sub1).aFloat4676)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4680) * (((Class111_Sub1) class111_sub1).aFloat4684)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4673) * (((Class111_Sub1) class111_sub1).aFloat4673)));
								Class369.aFloat3131 = (((((Class111_Sub1) class111_sub1_390_).aFloat4678) * (((Class111_Sub1) class111_sub1).aFloat4679)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4686) * (((Class111_Sub1) class111_sub1).aFloat4686)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4684) * (((Class111_Sub1) class111_sub1).aFloat4680)));
								aa_Sub3.aFloat3567 = (((((Class111_Sub1) class111_sub1_390_).aFloat4673) * (((Class111_Sub1) class111_sub1).aFloat4680)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4687 * (((Class111_Sub1) class111_sub1).aFloat4679)) + (((Class111_Sub1) class111_sub1_390_).aFloat4680 * (((Class111_Sub1) class111_sub1).aFloat4686))));
								Class98_Sub41.aFloat4204 = (((((Class111_Sub1) class111_sub1).aFloat4678) * (((Class111_Sub1) class111_sub1_390_).aFloat4686)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4678) * (((Class111_Sub1) class111_sub1).aFloat4675)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4684) * (((Class111_Sub1) class111_sub1).aFloat4687)));
								Class378.aFloat3190 = (((((Class111_Sub1) class111_sub1).aFloat4675) * (((Class111_Sub1) class111_sub1_390_).aFloat4687)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4680) * (((Class111_Sub1) class111_sub1).aFloat4678)) + ((((Class111_Sub1) class111_sub1_390_).aFloat4673) * (((Class111_Sub1) class111_sub1).aFloat4687)));
							}
							if (class246_sub6 != null) {
								boolean bool = false;
								boolean bool_402_ = true;
								int i_403_ = aShort4845 - -aShort4862 >> 1291996065;
								int i_404_ = aShort4892 + aShort4891 >> -564686943;
								int i_405_ = (int) (Class50.aFloat419 + (Class369.aFloat3131 * (float) i_403_) + (Class286.aFloat2182 * (float) aShort4868) + ((float) i_404_ * aa_Sub3.aFloat3567));
								int i_406_ = (int) ((Class378.aFloat3190 * (float) i_404_) + (Class376.aFloat3171 + (Class98_Sub41.aFloat4204 * (float) i_403_) + (IncomingMessages.aFloat5515 * (float) aShort4868)));
								int i_407_ = (int) ((Class287_Sub2.aFloat3273 * (float) i_404_) + (((float) aShort4868 * Class151_Sub4.aFloat4989) + (Class48_Sub1_Sub1.aFloat5505 + (Class372.aFloat3151 * (float) i_403_))));
								if (i_407_ >= ((ha_Sub1) aHa_Sub1_4865).anInt4404) {
									((Class246_Sub6) class246_sub6).anInt5113 = (i_406_ * (((ha_Sub1) aHa_Sub1_4865).anInt4381) / i_407_ + (((ha_Sub1) aHa_Sub1_4865).anInt4394));
									((Class246_Sub6) class246_sub6).anInt5111 = ((((ha_Sub1) aHa_Sub1_4865).anInt4419 * i_405_ / i_407_) + (((ha_Sub1) aHa_Sub1_4865).anInt4451));
								} else
									bool = true;
								int i_408_ = (int) (((float) i_404_ * aa_Sub3.aFloat3567) + ((Class286.aFloat2182 * (float) aShort4879) + ((Class369.aFloat3131 * (float) i_403_) + Class50.aFloat419)));
								int i_409_ = (int) ((IncomingMessages.aFloat5515 * (float) aShort4879) + (((float) i_403_ * Class98_Sub41.aFloat4204) + Class376.aFloat3171) + ((float) i_404_ * Class378.aFloat3190));
								int i_410_ = (int) (Class48_Sub1_Sub1.aFloat5505 + (Class372.aFloat3151 * (float) i_403_) + (Class151_Sub4.aFloat4989 * (float) aShort4879) + ((float) i_404_ * Class287_Sub2.aFloat3273));
								if ((i_410_ ^ 0xffffffff) <= (((ha_Sub1) aHa_Sub1_4865).anInt4404 ^ 0xffffffff)) {
									((Class246_Sub6) class246_sub6).anInt5110 = (((ha_Sub1) aHa_Sub1_4865).anInt4451 + (((ha_Sub1) aHa_Sub1_4865).anInt4419) * i_408_ / i_410_);
									((Class246_Sub6) class246_sub6).anInt5112 = (((ha_Sub1) aHa_Sub1_4865).anInt4394 - -(i_409_ * (((ha_Sub1) aHa_Sub1_4865).anInt4381) / i_410_));
								} else
									bool = true;
								if (bool) {
									if (i_407_ >= (((ha_Sub1) aHa_Sub1_4865).anInt4404) || (((ha_Sub1) aHa_Sub1_4865).anInt4404 <= i_410_)) {
										if (((((ha_Sub1) aHa_Sub1_4865).anInt4404) ^ 0xffffffff) >= (i_407_ ^ 0xffffffff)) {
											if (((((ha_Sub1) aHa_Sub1_4865).anInt4404) ^ 0xffffffff) < (i_410_ ^ 0xffffffff)) {
												int i_411_ = ((-(((ha_Sub1) aHa_Sub1_4865).anInt4404) + i_407_ << -366469360) / (i_407_ - i_410_));
												int i_412_ = (i_405_ + (((i_405_ - i_408_) * i_411_) >> -1023004720));
												int i_413_ = (i_406_ - -(((i_406_ + -i_409_) * i_411_) >> 442579920));
												((Class246_Sub6) class246_sub6).anInt5111 = (((((ha_Sub1) aHa_Sub1_4865).anInt4419) * i_412_ / (((ha_Sub1) aHa_Sub1_4865).anInt4404)) + (((ha_Sub1) aHa_Sub1_4865).anInt4451));
												((Class246_Sub6) class246_sub6).anInt5113 = (((((ha_Sub1) aHa_Sub1_4865).anInt4381) * i_413_ / (((ha_Sub1) aHa_Sub1_4865).anInt4404)) + (((ha_Sub1) aHa_Sub1_4865).anInt4394));
											}
										} else {
											int i_414_ = ((-(((ha_Sub1) aHa_Sub1_4865).anInt4404) + i_410_ << 1651158576) / (i_410_ + -i_407_));
											int i_415_ = i_408_ + (((i_408_ + -i_405_) * i_414_) >> 235791984);
											int i_416_ = ((i_414_ * (-i_406_ + i_409_) >> 1877857744) + i_409_);
											((Class246_Sub6) class246_sub6).anInt5111 = ((((ha_Sub1) aHa_Sub1_4865).anInt4451) - -(i_415_ * (((ha_Sub1) aHa_Sub1_4865).anInt4419) / (((ha_Sub1) aHa_Sub1_4865).anInt4404)));
											((Class246_Sub6) class246_sub6).anInt5113 = ((i_416_ * ((ha_Sub1) aHa_Sub1_4865).anInt4381 / (((ha_Sub1) aHa_Sub1_4865).anInt4404)) + (((ha_Sub1) aHa_Sub1_4865).anInt4394));
										}
									} else
										bool_402_ = false;
								}
								if (bool_402_) {
									if ((i_410_ ^ 0xffffffff) > (i_407_ ^ 0xffffffff))
										((Class246_Sub6) class246_sub6).anInt5109 = (-((Class246_Sub6) class246_sub6).anInt5111 + ((((ha_Sub1) aHa_Sub1_4865).anInt4451) + ((i_405_ + aShort4876) * (((ha_Sub1) aHa_Sub1_4865).anInt4419) / i_407_)));
									else
										((Class246_Sub6) class246_sub6).anInt5109 = (((((ha_Sub1) aHa_Sub1_4865).anInt4419) * (i_408_ + aShort4876) / i_410_) + ((((ha_Sub1) aHa_Sub1_4865).anInt4451) + -(((Class246_Sub6) class246_sub6).anInt5110)));
									((Class246_Sub6) class246_sub6).aBoolean5114 = true;
								}
							}
							aHa_Sub1_4865.method1861(19330);
							aHa_Sub1_4865.method1883(class111_sub1_390_, (byte) -128);
							method2382((byte) -104);
							aHa_Sub1_4865.method1902((byte) 60);
							method2387(-32768);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.D(" + (class111 != null ? "{...}" : "null") + ',' + (class246_sub6 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean findPathForDoubleSize(Collision class243, int i, int i_417_, int i_418_, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, int i_424_, int i_425_) {
		try {
			if (i_422_ != 702412290)
				anInt4855 = 35;
			int i_426_ = i_421_;
			int i_427_ = i_425_;
			int i_428_ = 64;
			int i_429_ = 64;
			int i_430_ = -i_428_ + i_421_;
			int i_431_ = i_425_ - i_429_;
			PlayerUpdateMask.pathDirections[i_428_][i_429_] = 99;
			Class339.pathCosts[i_428_][i_429_] = 0;
			int i_432_ = 0;
			int i_433_ = 0;
			Class359.pathBufferX[i_432_] = i_426_;
			Class75.pathBufferY[i_432_++] = i_427_;
			int[][] is = ((Collision) class243).flags;
			while (i_432_ != i_433_) {
				i_427_ = Class75.pathBufferY[i_433_];
				i_426_ = Class359.pathBufferX[i_433_];
				i_433_ = 1 + i_433_ & 0xfff;
				i_429_ = -i_431_ + i_427_;
				i_428_ = -i_430_ + i_426_;
				int i_434_ = i_426_ + -((Collision) class243).anInt1854;
				int i_435_ = i_427_ - ((Collision) class243).anInt1855;
				int i_436_ = i_419_;
				while_114_: do {
					while_113_: do {
						while_112_: do {
							while_111_: do {
								do {
									if (i_436_ != -4) {
										if ((i_436_ ^ 0xffffffff) != 2) {
											if (i_436_ != -2) {
												if ((i_436_ ^ 0xffffffff) != 0) {
													if (i_436_ == 0 || i_436_ == 1 || (i_436_ ^ 0xffffffff) == -3 || i_436_ == 3 || i_436_ == 9)
														break while_112_;
													break while_113_;
												}
											} else
												break;
											break while_111_;
										}
									} else {
										if (((i_426_ ^ 0xffffffff) == (i_424_ ^ 0xffffffff)) && i_427_ == i_423_) {
											Class22.pathEndY = i_427_;
											Class199.pathEndX = i_426_;
											return true;
										}
										break while_114_;
									}
									if (Class98_Sub5.method960(i_424_, i_417_, -112, i_427_, i, i_426_, i_423_, 2, 2)) {
										Class22.pathEndY = i_427_;
										Class199.pathEndX = i_426_;
										return true;
									}
									break while_114_;
								} while (false);
								if (class243.method2936(i_424_, i, i_423_, -1, i_427_, i_417_, 2, i_426_, 2, i_418_)) {
									Class22.pathEndY = i_427_;
									Class199.pathEndX = i_426_;
									return true;
								}
								break while_114_;
							} while (false);
							if (class243.method2939(i_417_, i_424_, i_427_, 14672, 2, i_423_, i_418_, i_426_, i)) {
								Class199.pathEndX = i_426_;
								Class22.pathEndY = i_427_;
								return true;
							}
							break while_114_;
						} while (false);
						if (class243.method2952(i_423_, i_426_, (byte) 98, 2, i_427_, i_420_, i_424_, i_419_)) {
							Class199.pathEndX = i_426_;
							Class22.pathEndY = i_427_;
							return true;
						}
						break while_114_;
					} while (false);
					if (class243.method2938(i_424_, i_420_, i_427_, i_423_, i_419_, 17761, 2, i_426_)) {
						Class199.pathEndX = i_426_;
						Class22.pathEndY = i_427_;
						return true;
					}
				} while (false);
				i_436_ = Class339.pathCosts[i_428_][i_429_] - -1;
				if ((i_428_ ^ 0xffffffff) < -1 && PlayerUpdateMask.pathDirections[i_428_ - 1][i_429_] == 0 && (0x43a40000 & is[i_434_ + -1][i_435_]) == 0 && ((0x4e240000 & is[i_434_ - 1][1 + i_435_] ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[i_432_] = i_426_ + -1;
					Class75.pathBufferY[i_432_] = i_427_;
					i_432_ = 0xfff & i_432_ + 1;
					PlayerUpdateMask.pathDirections[-1 + i_428_][i_429_] = 2;
					Class339.pathCosts[-1 + i_428_][i_429_] = i_436_;
				}
				if ((i_428_ ^ 0xffffffff) > -127 && (PlayerUpdateMask.pathDirections[1 + i_428_][i_429_] ^ 0xffffffff) == -1 && (is[2 + i_434_][i_435_] & 0x60e40000 ^ 0xffffffff) == -1 && ((0x78240000 & is[i_434_ + 2][i_435_ + 1] ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[i_432_] = i_426_ + 1;
					Class75.pathBufferY[i_432_] = i_427_;
					PlayerUpdateMask.pathDirections[i_428_ + 1][i_429_] = 8;
					i_432_ = 0xfff & i_432_ - -1;
					Class339.pathCosts[i_428_ - -1][i_429_] = i_436_;
				}
				if (i_429_ > 0 && PlayerUpdateMask.pathDirections[i_428_][-1 + i_429_] == 0 && (0x43a40000 & is[i_434_][i_435_ + -1]) == 0 && ((is[i_434_ - -1][i_435_ - 1] & 0x60e40000 ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[i_432_] = i_426_;
					Class75.pathBufferY[i_432_] = i_427_ + -1;
					i_432_ = 1 + i_432_ & 0xfff;
					PlayerUpdateMask.pathDirections[i_428_][i_429_ + -1] = 1;
					Class339.pathCosts[i_428_][-1 + i_429_] = i_436_;
				}
				if (i_429_ < 126 && PlayerUpdateMask.pathDirections[i_428_][i_429_ - -1] == 0 && (is[i_434_][2 + i_435_] & 0x4e240000) == 0 && ((0x78240000 & is[1 + i_434_][i_435_ - -2] ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[i_432_] = i_426_;
					Class75.pathBufferY[i_432_] = i_427_ - -1;
					PlayerUpdateMask.pathDirections[i_428_][i_429_ + 1] = 4;
					i_432_ = 0xfff & 1 + i_432_;
					Class339.pathCosts[i_428_][i_429_ + 1] = i_436_;
				}
				if (i_428_ > 0 && i_429_ > 0 && (PlayerUpdateMask.pathDirections[-1 + i_428_][i_429_ + -1] ^ 0xffffffff) == -1 && (is[-1 + i_434_][i_435_] & 0x4fa40000) == 0 && (0x43a40000 & is[i_434_ + -1][-1 + i_435_]) == 0 && ((is[i_434_][-1 + i_435_] & 0x63e40000 ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[i_432_] = -1 + i_426_;
					Class75.pathBufferY[i_432_] = -1 + i_427_;
					PlayerUpdateMask.pathDirections[i_428_ - 1][i_429_ - 1] = 3;
					i_432_ = 0xfff & i_432_ + 1;
					Class339.pathCosts[-1 + i_428_][i_429_ + -1] = i_436_;
				}
				if (i_428_ < 126 && (i_429_ ^ 0xffffffff) < -1 && (PlayerUpdateMask.pathDirections[1 + i_428_][-1 + i_429_] ^ 0xffffffff) == -1 && ((0x63e40000 & is[i_434_ + 1][-1 + i_435_] ^ 0xffffffff) == -1) && (is[i_434_ - -2][i_435_ + -1] & 0x60e40000 ^ 0xffffffff) == -1 && ((is[2 + i_434_][i_435_] & 0x78e40000 ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[i_432_] = i_426_ - -1;
					Class75.pathBufferY[i_432_] = i_427_ - 1;
					PlayerUpdateMask.pathDirections[1 + i_428_][-1 + i_429_] = 9;
					i_432_ = 0xfff & 1 + i_432_;
					Class339.pathCosts[1 + i_428_][-1 + i_429_] = i_436_;
				}
				if (i_428_ > 0 && (i_429_ ^ 0xffffffff) > -127 && (PlayerUpdateMask.pathDirections[-1 + i_428_][i_429_ - -1] == 0) && (is[-1 + i_434_][i_435_ - -1] & 0x4fa40000 ^ 0xffffffff) == -1 && ((is[-1 + i_434_][2 + i_435_] & 0x4e240000 ^ 0xffffffff) == -1) && (is[i_434_][i_435_ + 2] & 0x7e240000) == 0) {
					Class359.pathBufferX[i_432_] = i_426_ - 1;
					Class75.pathBufferY[i_432_] = 1 + i_427_;
					PlayerUpdateMask.pathDirections[i_428_ + -1][1 + i_429_] = 6;
					i_432_ = 1 + i_432_ & 0xfff;
					Class339.pathCosts[i_428_ - 1][1 + i_429_] = i_436_;
				}
				if (i_428_ < 126 && (i_429_ ^ 0xffffffff) > -127 && (PlayerUpdateMask.pathDirections[1 + i_428_][1 + i_429_] ^ 0xffffffff) == -1 && (0x7e240000 & is[i_434_ + 1][2 + i_435_]) == 0 && (is[i_434_ - -2][i_435_ + 2] & 0x78240000) == 0 && (is[i_434_ + 2][i_435_ + 1] & 0x78e40000) == 0) {
					Class359.pathBufferX[i_432_] = 1 + i_426_;
					Class75.pathBufferY[i_432_] = 1 + i_427_;
					i_432_ = i_432_ - -1 & 0xfff;
					PlayerUpdateMask.pathDirections[i_428_ + 1][1 + i_429_] = 12;
					Class339.pathCosts[1 + i_428_][i_429_ - -1] = i_436_;
				}
			}
			Class22.pathEndY = i_427_;
			Class199.pathEndX = i_426_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.Q(" + (class243 != null ? "{...}" : "null") + ',' + i + ',' + i_417_ + ',' + i_418_ + ',' + i_419_ + ',' + i_420_ + ',' + i_421_ + ',' + i_422_ + ',' + i_423_ + ',' + i_424_ + ',' + i_425_ + ')'));
		}
	}

	private final int method2385(int i, byte i_437_, short i_438_, int i_439_, byte i_440_) {
		try {
			if (i_440_ != -97)
				return 31;
			int i_441_ = (Class208.anIntArray1579[Class98_Sub10_Sub38.method1116(i, 1391, i_439_)]);
			if ((i_438_ ^ 0xffffffff) != 0) {
				Class238 class238 = ((ha) aHa_Sub1_4865).aD938.method11(i_438_ & 0xffff, -28755);
				int i_442_ = 0xff & ((Class238) class238).aByte1830;
				if ((i_442_ ^ 0xffffffff) != -1) {
					int i_443_;
					if ((i_439_ ^ 0xffffffff) <= -1) {
						if ((i_439_ ^ 0xffffffff) >= -128)
							i_443_ = i_439_ * 131586;
						else
							i_443_ = 16777215;
					} else
						i_443_ = 0;
					if (i_442_ == 256)
						i_441_ = i_443_;
					else {
						int i_444_ = i_442_;
						int i_445_ = 256 + -i_442_;
						i_441_ = ((0xff0000 & (i_444_ * (i_443_ & 0xff00) + (i_441_ & 0xff00) * i_445_)) + (((0xff00ff & i_441_) * i_445_ + i_444_ * (i_443_ & 0xff00ff)) & ~0xff00ff)) >> -1338784344;
					}
				}
				int i_446_ = 0xff & ((Class238) class238).aByte1829;
				if ((i_446_ ^ 0xffffffff) != -1) {
					i_446_ += 256;
					int i_447_ = (i_441_ >> -308840432 & 0xff) * i_446_;
					if ((i_447_ ^ 0xffffffff) < -65536)
						i_447_ = 65535;
					int i_448_ = ((0xff00 & i_441_) >> -1614119960) * i_446_;
					if (i_448_ > 65535)
						i_448_ = 65535;
					int i_449_ = i_446_ * (i_441_ & 0xff);
					if ((i_449_ ^ 0xffffffff) < -65536)
						i_449_ = 65535;
					i_441_ = ((i_449_ >> -515286264) + (i_447_ << 927867336 & 0xff0092) + (0xff00 & i_448_));
				}
			}
			return 255 - (i_437_ & 0xff) + (i_441_ << -272243000);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.A(" + i + ',' + i_437_ + ',' + i_438_ + ',' + i_439_ + ',' + i_440_ + ')'));
		}
	}

	final void ia(short i, short i_450_) {
		do {
			try {
				for (int i_451_ = 0; i_451_ < anInt4853; i_451_++) {
					if ((i ^ 0xffffffff) == (aShortArray4842[i_451_] ^ 0xffffffff))
						aShortArray4842[i_451_] = i_450_;
				}
				if (aClass249Array4877 != null) {
					for (int i_452_ = 0; (anInt4866 ^ 0xffffffff) < (i_452_ ^ 0xffffffff); i_452_++) {
						Class249 class249 = aClass249Array4877[i_452_];
						Class219 class219 = aClass219Array4861[i_452_];
						((Class219) class219).anInt1643 = ((Class208.anIntArray1579[(0xffff & aShortArray4842[(((Class249) class249).anInt1905)])]) & 0xffffff | ~0xffffff & ((Class219) class219).anInt1643);
					}
				}
				if (aClass104_4854 == null)
					break;
				((Class104) aClass104_4854).anInterface16_902 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ln.ia(" + i + ',' + i_450_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method2386(r_Sub1 var_r_Sub1, int i) {
		try {
			if (((ha_Sub1) aHa_Sub1_4865).anIntArray4471.length < anInt4846) {
				((ha_Sub1) aHa_Sub1_4865).anIntArray4471 = new int[anInt4846];
				((ha_Sub1) aHa_Sub1_4865).anIntArray4470 = new int[anInt4846];
			}
			int[] is = ((ha_Sub1) aHa_Sub1_4865).anIntArray4471;
			int[] is_453_ = ((ha_Sub1) aHa_Sub1_4865).anIntArray4470;
			for (int i_454_ = i; (i_454_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff); i_454_++) {
				int i_455_ = (-((r_Sub1) var_r_Sub1).anInt6324 + ((anIntArray4886[i_454_] - ((((ha_Sub1) aHa_Sub1_4865).anInt4398 * anIntArray4856[i_454_]) >> -138980216)) >> ((ha_Sub1) aHa_Sub1_4865).anInt4319));
				int i_456_ = ((-((((ha_Sub1) aHa_Sub1_4865).anInt4377 * anIntArray4856[i_454_]) >> -65265720) + anIntArray4843[i_454_] >> ((ha_Sub1) aHa_Sub1_4865).anInt4319) + -((r_Sub1) var_r_Sub1).anInt6320);
				int i_457_ = anIntArray4851[i_454_];
				int i_458_ = anIntArray4851[i_454_ + 1];
				for (int i_459_ = i_457_; i_459_ < i_458_; i_459_++) {
					int i_460_ = -1 + aShortArray4887[i_459_];
					if ((i_460_ ^ 0xffffffff) == 0)
						break;
					is[i_460_] = i_455_;
					is_453_[i_460_] = i_456_;
				}
			}
			for (int i_461_ = 0; anInt4896 > i_461_; i_461_++) {
				if (aByteArray4882 == null || aByteArray4882[i_461_] <= 128) {
					short i_462_ = aShortArray4895[i_461_];
					short i_463_ = aShortArray4852[i_461_];
					short i_464_ = aShortArray4878[i_461_];
					int i_465_ = is[i_462_];
					int i_466_ = is[i_463_];
					int i_467_ = is[i_464_];
					int i_468_ = is_453_[i_462_];
					int i_469_ = is_453_[i_463_];
					int i_470_ = is_453_[i_464_];
					if ((-((-i_468_ + i_469_) * (i_467_ - i_466_)) + (i_465_ + -i_466_) * (-i_470_ + i_469_)) > 0)
						var_r_Sub1.method1648(i_468_, i_466_, i_465_, i_470_, i_469_, i ^ 0x59, i_467_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.DA(" + (var_r_Sub1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int G() {
		try {
			if (!aBoolean4847)
				method2380(-103);
			return aShort4891;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.G(" + ')');
		}
	}

	final boolean r() {
		try {
			return aBoolean4848;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.r(" + ')');
		}
	}

	private final void method2387(int i) {
		do {
			try {
				if (i != -32768)
					EA();
				if (aClass249Array4877 == null)
					break;
				Class111_Sub1 class111_sub1 = ((ha_Sub1) aHa_Sub1_4865).aClass111_Sub1_4316;
				aHa_Sub1_4865.method1841(34167);
				aHa_Sub1_4865.C(!aBoolean4857);
				aHa_Sub1_4865.method1851(false, false);
				aHa_Sub1_4865.method1868(null, null, ((ha_Sub1) aHa_Sub1_4865).aClass104_4436, ((ha_Sub1) aHa_Sub1_4865).aClass104_4365, 0);
				for (int i_471_ = 0; anInt4866 > i_471_; i_471_++) {
					Class249 class249 = aClass249Array4877[i_471_];
					Class219 class219 = aClass219Array4861[i_471_];
					if (!((Class249) class249).aBoolean1904 || !aHa_Sub1_4865.method1768()) {
						float f = (0.3333333F * (float) ((anIntArray4886[((Class249) class249).anInt1900]) + ((anIntArray4886[(((Class249) class249).anInt1909)]) - -(anIntArray4886[(((Class249) class249).anInt1907)]))));
						float f_472_ = (0.3333333F * (float) ((anIntArray4856[((Class249) class249).anInt1900]) + (anIntArray4856[((Class249) class249).anInt1909]) - -(anIntArray4856[(((Class249) class249).anInt1907)])));
						float f_473_ = ((float) ((anIntArray4843[((Class249) class249).anInt1909]) + (anIntArray4843[((Class249) class249).anInt1900]) + (anIntArray4843[((Class249) class249).anInt1907])) * 0.3333333F);
						float f_474_ = (Class50.aFloat419 + (f_473_ * aa_Sub3.aFloat3567 + (Class369.aFloat3131 * f + Class286.aFloat2182 * f_472_)));
						float f_475_ = (f_473_ * Class378.aFloat3190 + (IncomingMessages.aFloat5515 * f_472_ + Class98_Sub41.aFloat4204 * f) + Class376.aFloat3171);
						float f_476_ = (Class287_Sub2.aFloat3273 * f_473_ + (Class151_Sub4.aFloat4989 * f_472_ + f * Class372.aFloat3151) + Class48_Sub1_Sub1.aFloat5505);
						float f_477_ = ((float) (1.0 / Math.sqrt((double) (f_474_ * f_474_ + f_475_ * f_475_ + (f_476_ * f_476_)))) * (float) ((Class249) class249).anInt1899);
						class111_sub1.method2110(((float) ((Class219) class219).anInt1644 - f_475_ + f_477_ * f_475_), ((((Class219) class219).anInt1645 * ((Class249) class249).aShort1901) >> -1969977785), ((Class219) class219).anInt1639, -f_476_ + f_476_ * f_477_, ((((Class219) class219).anInt1637 * ((Class249) class249).aShort1908) >> 1962723783), (byte) 63, (-(f_474_ * f_477_) + (f_474_ + (float) ((Class219) class219).anInt1638)));
						aHa_Sub1_4865.method1909(-32076, class111_sub1);
						int i_478_ = ((Class219) class219).anInt1643;
						OpenGL.glColor4ub((byte) (i_478_ >> -738445168), (byte) (i_478_ >> 358941736), (byte) i_478_, (byte) (i_478_ >> 1425434648));
						aHa_Sub1_4865.method1834(72, ((Class249) class249).aShort1902);
						aHa_Sub1_4865.method1870((byte) -56, (((Class249) class249).aByte1906));
						aHa_Sub1_4865.method1910(7, 4, false, 0);
					}
				}
				aHa_Sub1_4865.C(true);
				aHa_Sub1_4865.method1902((byte) 60);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.N(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2388(boolean bool, int i) {
		do {
			try {
				if ((anInt4896 * 6 ^ 0xffffffff) < ((((RSByteBuffer) ((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446).data).length ^ 0xffffffff))
					((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446 = new Class98_Sub22_Sub2(anInt4896 * 6 + 600);
				else
					((RSByteBuffer) (((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446)).position = 0;
				Class98_Sub22_Sub2 class98_sub22_sub2 = ((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446;
				if (!((ha_Sub1) aHa_Sub1_4865).aBoolean4397) {
					for (int i_479_ = 0; (i_479_ ^ 0xffffffff) > (anInt4896 ^ 0xffffffff); i_479_++) {
						class98_sub22_sub2.method1247(aShortArray4895[i_479_], 4);
						class98_sub22_sub2.method1247(aShortArray4852[i_479_], i + 260);
						class98_sub22_sub2.method1247(aShortArray4878[i_479_], 4);
					}
				} else {
					for (int i_480_ = 0; (anInt4896 ^ 0xffffffff) < (i_480_ ^ 0xffffffff); i_480_++) {
						class98_sub22_sub2.writeShort(aShortArray4895[i_480_]);
						class98_sub22_sub2.writeShort(aShortArray4852[i_480_]);
						class98_sub22_sub2.writeShort(aShortArray4878[i_480_]);
					}
				}
				if (((RSByteBuffer) class98_sub22_sub2).position != 0) {
					if (i != -256)
						aByteArray4882 = null;
					if (bool) {
						if (anInterface8_4880 != null)
							anInterface8_4880.method20((byte) -47, (((RSByteBuffer) class98_sub22_sub2).data), (((RSByteBuffer) class98_sub22_sub2).position), 5123);
						else
							anInterface8_4880 = (aHa_Sub1_4865.method1838(5123, (((RSByteBuffer) class98_sub22_sub2).data), i + 263, true, (((RSByteBuffer) class98_sub22_sub2).position)));
						((Class322) aClass322_4838).anInterface8_2711 = anInterface8_4880;
					} else
						((Class322) aClass322_4838).anInterface8_2711 = aHa_Sub1_4865.method1838(5123, (((RSByteBuffer) class98_sub22_sub2).data), 7, false, (((RSByteBuffer) class98_sub22_sub2).position));
					if (bool)
						break;
					aBoolean4871 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.W(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void p(int i, int i_481_, s var_s, s var_s_482_, int i_483_, int i_484_, int i_485_) {
		do {
			try {
				if (!aBoolean4847)
					method2380(-102);
				int i_486_ = i_483_ + aShort4845;
				int i_487_ = i_483_ - -aShort4862;
				int i_488_ = aShort4892 + i_485_;
				int i_489_ = aShort4891 + i_485_;
				if ((i != 1 && i != 2 && (i ^ 0xffffffff) != -4 && (i ^ 0xffffffff) != -6) || ((i_486_ ^ 0xffffffff) <= -1 && (i_487_ + ((s) var_s).anInt2206 >> ((s) var_s).anInt2200) < ((s) var_s).anInt2203 && i_488_ >= 0 && (((i_489_ - -((s) var_s).anInt2206 >> ((s) var_s).anInt2200) ^ 0xffffffff) > (((s) var_s).anInt2204 ^ 0xffffffff)))) {
					if ((i ^ 0xffffffff) != -5 && i != 5) {
						i_486_ >>= ((s) var_s).anInt2200;
						i_487_ = (-1 - -((s) var_s).anInt2206 + i_487_ >> ((s) var_s).anInt2200);
						i_488_ >>= ((s) var_s).anInt2200;
						i_489_ = (i_489_ + (((s) var_s).anInt2206 + -1) >> ((s) var_s).anInt2200);
						if (((i_484_ ^ 0xffffffff) == (var_s.method3420(i_488_, -12639, i_486_) ^ 0xffffffff)) && ((i_484_ ^ 0xffffffff) == (var_s.method3420(i_488_, -12639, i_487_) ^ 0xffffffff)) && (var_s.method3420(i_489_, -12639, i_486_) ^ 0xffffffff) == (i_484_ ^ 0xffffffff) && ((i_484_ ^ 0xffffffff) == (var_s.method3420(i_489_, -12639, i_487_) ^ 0xffffffff)))
							break;
					} else if (var_s_482_ == null || (i_486_ < 0 || ((((s) var_s_482_).anInt2203 ^ 0xffffffff) >= ((i_487_ + ((s) var_s_482_).anInt2206 >> ((s) var_s_482_).anInt2200) ^ 0xffffffff)) || (i_488_ ^ 0xffffffff) > -1 || ((((s) var_s_482_).anInt2204 ^ 0xffffffff) >= ((((s) var_s_482_).anInt2206 + i_489_ >> ((s) var_s_482_).anInt2200) ^ 0xffffffff))))
						break;
					if (i != 1) {
						if (i == 2) {
							int i_490_ = aShort4868;
							if ((i_490_ ^ 0xffffffff) == -1)
								break;
							for (int i_491_ = 0; ((i_491_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff)); i_491_++) {
								int i_492_ = ((anIntArray4856[i_491_] << 817688464) / i_490_);
								if (i_481_ > i_492_)
									anIntArray4856[i_491_] = (anIntArray4856[i_491_] - -((-i_492_ + i_481_) * ((var_s.method3417((anIntArray4886[i_491_] + i_483_), (i_485_ + anIntArray4843[i_491_]), true)) - i_484_) / i_481_));
							}
						} else if (i != 3) {
							if ((i ^ 0xffffffff) == -5) {
								int i_493_ = -aShort4868 + aShort4879;
								for (int i_494_ = 0; anInt4883 > i_494_; i_494_++)
									anIntArray4856[i_494_] = i_493_ + (anIntArray4856[i_494_] + -i_484_ + (var_s_482_.method3417((anIntArray4886[i_494_] + i_483_), (anIntArray4843[i_494_] - -i_485_), true)));
							} else if (i == 5) {
								int i_495_ = aShort4879 + -aShort4868;
								for (int i_496_ = 0; ((i_496_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff)); i_496_++) {
									int i_497_ = i_483_ + anIntArray4886[i_496_];
									int i_498_ = anIntArray4843[i_496_] + i_485_;
									int i_499_ = var_s.method3417(i_497_, i_498_, true);
									int i_500_ = var_s_482_.method3417(i_497_, i_498_, true);
									int i_501_ = -i_481_ + -i_500_ + i_499_;
									anIntArray4856[i_496_] = i_499_ + (-i_484_ + (((anIntArray4856[i_496_] << -126482776) / i_495_ * i_501_) >> -1901372472));
								}
							}
						} else {
							int i_502_ = (0xff & i_481_) * 4;
							int i_503_ = 4 * ((i_481_ & 0xff4f) >> -297654872);
							int i_504_ = ((i_481_ >> -1359051408 & 0xff) << -2089313818);
							int i_505_ = (0xff & i_481_ >> 2080117048) << -1664080666;
							if (-(i_502_ >> -1692679999) + i_483_ < 0 || (((((s) var_s).anInt2203 << ((s) var_s).anInt2200) ^ 0xffffffff) >= ((((s) var_s).anInt2206 + (i_502_ >> -2043148255) + i_483_) ^ 0xffffffff)) || i_485_ - (i_503_ >> -1686934975) < 0 || (((i_503_ >> 750312321) + (i_485_ + ((s) var_s).anInt2206)) >= (((s) var_s).anInt2204 << ((s) var_s).anInt2200)))
								break;
							this.method2336(i_503_, i_502_, var_s, i_484_, i_483_, i_485_, i_504_, 2, i_505_);
						}
					} else {
						for (int i_506_ = 0; i_506_ < anInt4883; i_506_++)
							anIntArray4856[i_506_] = (anIntArray4856[i_506_] + var_s.method3417(i_483_ + (anIntArray4886[i_506_]), (anIntArray4843[i_506_] + i_485_), true) + -i_484_);
					}
					aBoolean4847 = false;
					if (aClass104_4889 == null)
						break;
					((Class104) aClass104_4889).anInterface16_902 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ln.p(" + i + ',' + i_481_ + ',' + (var_s != null ? "{...}" : "null") + ',' + (var_s_482_ != null ? "{...}" : "null") + ',' + i_483_ + ',' + i_484_ + ',' + i_485_ + ')'));
			}
			break;
		} while (false);
	}

	private final boolean method2389(int i, int i_507_, int i_508_, Class111 class111, boolean bool, int i_509_, boolean bool_510_) {
		try {
			Class111_Sub1 class111_sub1 = (Class111_Sub1) class111;
			Class111_Sub1 class111_sub1_511_ = ((ha_Sub1) aHa_Sub1_4865).aClass111_Sub1_4348;
			float f = ((((Class111_Sub1) class111_sub1_511_).aFloat4680 * ((Class111_Sub1) class111_sub1).aFloat4677) + ((((Class111_Sub1) class111_sub1_511_).aFloat4686 * ((Class111_Sub1) class111_sub1).aFloat4674) + (((Class111_Sub1) class111_sub1).aFloat4683 * ((Class111_Sub1) class111_sub1_511_).aFloat4679)) + ((Class111_Sub1) class111_sub1_511_).aFloat4674);
			float f_512_ = (((Class111_Sub1) class111_sub1_511_).aFloat4683 + ((((Class111_Sub1) class111_sub1_511_).aFloat4687 * ((Class111_Sub1) class111_sub1).aFloat4677) + ((((Class111_Sub1) class111_sub1_511_).aFloat4675 * ((Class111_Sub1) class111_sub1).aFloat4683) + (((Class111_Sub1) class111_sub1_511_).aFloat4678 * ((Class111_Sub1) class111_sub1).aFloat4674))));
			Class287_Sub2.aFloat3273 = ((((Class111_Sub1) class111_sub1).aFloat4687 * ((Class111_Sub1) class111_sub1_511_).aFloat4676) + (((Class111_Sub1) class111_sub1_511_).aFloat4684 * ((Class111_Sub1) class111_sub1).aFloat4680) + (((Class111_Sub1) class111_sub1).aFloat4673 * ((Class111_Sub1) class111_sub1_511_).aFloat4673));
			Class372.aFloat3151 = ((((Class111_Sub1) class111_sub1).aFloat4684 * ((Class111_Sub1) class111_sub1_511_).aFloat4673) + ((((Class111_Sub1) class111_sub1).aFloat4678 * ((Class111_Sub1) class111_sub1_511_).aFloat4676) + (((Class111_Sub1) class111_sub1_511_).aFloat4684 * ((Class111_Sub1) class111_sub1).aFloat4686)));
			aa_Sub3.aFloat3567 = ((((Class111_Sub1) class111_sub1).aFloat4680 * ((Class111_Sub1) class111_sub1_511_).aFloat4686) + (((Class111_Sub1) class111_sub1).aFloat4687 * ((Class111_Sub1) class111_sub1_511_).aFloat4679) + (((Class111_Sub1) class111_sub1).aFloat4673 * ((Class111_Sub1) class111_sub1_511_).aFloat4680));
			Class98_Sub41.aFloat4204 = ((((Class111_Sub1) class111_sub1_511_).aFloat4678 * ((Class111_Sub1) class111_sub1).aFloat4686) + (((Class111_Sub1) class111_sub1_511_).aFloat4675 * ((Class111_Sub1) class111_sub1).aFloat4678) + (((Class111_Sub1) class111_sub1_511_).aFloat4687 * ((Class111_Sub1) class111_sub1).aFloat4684));
			float f_513_ = ((((Class111_Sub1) class111_sub1_511_).aFloat4684 * ((Class111_Sub1) class111_sub1).aFloat4674) + (((Class111_Sub1) class111_sub1).aFloat4683 * ((Class111_Sub1) class111_sub1_511_).aFloat4676) + (((Class111_Sub1) class111_sub1_511_).aFloat4673 * ((Class111_Sub1) class111_sub1).aFloat4677) + ((Class111_Sub1) class111_sub1_511_).aFloat4677);
			IncomingMessages.aFloat5515 = ((((Class111_Sub1) class111_sub1).aFloat4676 * ((Class111_Sub1) class111_sub1_511_).aFloat4687) + ((((Class111_Sub1) class111_sub1).aFloat4679 * ((Class111_Sub1) class111_sub1_511_).aFloat4678) + (((Class111_Sub1) class111_sub1_511_).aFloat4675 * ((Class111_Sub1) class111_sub1).aFloat4675)));
			Class286.aFloat2182 = ((((Class111_Sub1) class111_sub1).aFloat4676 * ((Class111_Sub1) class111_sub1_511_).aFloat4680) + ((((Class111_Sub1) class111_sub1_511_).aFloat4686 * ((Class111_Sub1) class111_sub1).aFloat4679) + (((Class111_Sub1) class111_sub1).aFloat4675 * ((Class111_Sub1) class111_sub1_511_).aFloat4679)));
			Class369.aFloat3131 = ((((Class111_Sub1) class111_sub1).aFloat4684 * ((Class111_Sub1) class111_sub1_511_).aFloat4680) + ((((Class111_Sub1) class111_sub1_511_).aFloat4686 * ((Class111_Sub1) class111_sub1).aFloat4686) + (((Class111_Sub1) class111_sub1).aFloat4678 * ((Class111_Sub1) class111_sub1_511_).aFloat4679)));
			Class151_Sub4.aFloat4989 = ((((Class111_Sub1) class111_sub1_511_).aFloat4673 * ((Class111_Sub1) class111_sub1).aFloat4676) + ((((Class111_Sub1) class111_sub1_511_).aFloat4676 * ((Class111_Sub1) class111_sub1).aFloat4675) + (((Class111_Sub1) class111_sub1).aFloat4679 * ((Class111_Sub1) class111_sub1_511_).aFloat4684)));
			Class378.aFloat3190 = ((((Class111_Sub1) class111_sub1).aFloat4673 * ((Class111_Sub1) class111_sub1_511_).aFloat4687) + ((((Class111_Sub1) class111_sub1_511_).aFloat4675 * ((Class111_Sub1) class111_sub1).aFloat4687) + (((Class111_Sub1) class111_sub1_511_).aFloat4678 * ((Class111_Sub1) class111_sub1).aFloat4680)));
			boolean bool_514_ = bool;
			float f_515_ = 3.4028235E38F;
			float f_516_ = -3.4028235E38F;
			float f_517_ = 3.4028235E38F;
			float f_518_ = -3.4028235E38F;
			int i_519_ = ((ha_Sub1) aHa_Sub1_4865).anInt4419;
			int i_520_ = ((ha_Sub1) aHa_Sub1_4865).anInt4381;
			if (!aBoolean4847)
				method2380(-125);
			int i_521_ = -aShort4845 + aShort4862 >> -1556790271;
			int i_522_ = aShort4879 - aShort4868 >> -1820982719;
			int i_523_ = -aShort4892 + aShort4891 >> -1363969407;
			int i_524_ = aShort4845 - -i_521_;
			int i_525_ = aShort4868 + i_522_;
			int i_526_ = aShort4892 - -i_523_;
			int i_527_ = -(i_521_ << i) + i_524_;
			int i_528_ = i_525_ + -(i_522_ << i);
			int i_529_ = i_526_ - (i_523_ << i);
			int i_530_ = i_524_ - -(i_521_ << i);
			int i_531_ = (i_522_ << i) + i_525_;
			int i_532_ = i_526_ + (i_523_ << i);
			Class342.anIntArray2859[0] = i_527_;
			Class27.anIntArray278[0] = i_528_;
			MapRegion.anIntArray2541[0] = i_529_;
			Class342.anIntArray2859[1] = i_530_;
			Class27.anIntArray278[1] = i_528_;
			MapRegion.anIntArray2541[1] = i_529_;
			Class342.anIntArray2859[2] = i_527_;
			Class27.anIntArray278[2] = i_531_;
			MapRegion.anIntArray2541[2] = i_529_;
			Class342.anIntArray2859[3] = i_530_;
			Class27.anIntArray278[3] = i_531_;
			MapRegion.anIntArray2541[3] = i_529_;
			Class342.anIntArray2859[4] = i_527_;
			Class27.anIntArray278[4] = i_528_;
			Class342.anIntArray2859[5] = i_530_;
			MapRegion.anIntArray2541[4] = i_532_;
			Class27.anIntArray278[5] = i_528_;
			MapRegion.anIntArray2541[5] = i_532_;
			Class342.anIntArray2859[6] = i_527_;
			Class27.anIntArray278[6] = i_531_;
			Class342.anIntArray2859[7] = i_530_;
			MapRegion.anIntArray2541[6] = i_532_;
			Class27.anIntArray278[7] = i_531_;
			MapRegion.anIntArray2541[7] = i_532_;
			for (int i_533_ = 0; (i_533_ ^ 0xffffffff) > -9; i_533_++) {
				float f_534_ = (float) MapRegion.anIntArray2541[i_533_];
				float f_535_ = (float) Class27.anIntArray278[i_533_];
				float f_536_ = (float) Class342.anIntArray2859[i_533_];
				float f_537_ = f_513_ + (f_535_ * Class151_Sub4.aFloat4989 + Class372.aFloat3151 * f_536_ + Class287_Sub2.aFloat3273 * f_534_);
				float f_538_ = f_512_ + (Class378.aFloat3190 * f_534_ + (Class98_Sub41.aFloat4204 * f_536_ + IncomingMessages.aFloat5515 * f_535_));
				float f_539_ = (Class369.aFloat3131 * f_536_ + Class286.aFloat2182 * f_535_ + aa_Sub3.aFloat3567 * f_534_ + f);
				if ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4404 <= f_537_) {
					if (i_509_ > 0)
						f_537_ = (float) i_509_;
					float f_540_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4451 + f_539_ * (float) i_519_ / f_537_);
					if (f_516_ < f_540_)
						f_516_ = f_540_;
					float f_541_ = ((float) i_520_ * f_538_ / f_537_ + (float) ((ha_Sub1) aHa_Sub1_4865).anInt4394);
					if (f_515_ > f_540_)
						f_515_ = f_540_;
					if (f_541_ < f_517_)
						f_517_ = f_541_;
					if (f_518_ < f_541_)
						f_518_ = f_541_;
					bool_514_ = true;
				}
			}
			if (bool_514_ && (float) i_508_ > f_515_ && (float) i_508_ < f_516_ && (float) i_507_ > f_517_ && f_518_ > (float) i_507_) {
				if (bool_510_)
					return true;
				if ((anInt4846 ^ 0xffffffff) < (((ha_Sub1) aHa_Sub1_4865).anIntArray4471.length ^ 0xffffffff)) {
					((ha_Sub1) aHa_Sub1_4865).anIntArray4471 = new int[anInt4846];
					((ha_Sub1) aHa_Sub1_4865).anIntArray4470 = new int[anInt4846];
				}
				int[] is = ((ha_Sub1) aHa_Sub1_4865).anIntArray4471;
				int[] is_542_ = ((ha_Sub1) aHa_Sub1_4865).anIntArray4470;
				for (int i_543_ = 0; (anInt4883 ^ 0xffffffff) < (i_543_ ^ 0xffffffff); i_543_++) {
					float f_544_ = (float) anIntArray4856[i_543_];
					float f_545_ = (float) anIntArray4886[i_543_];
					float f_546_ = (float) anIntArray4843[i_543_];
					float f_547_ = (Class286.aFloat2182 * f_544_ + f_545_ * Class369.aFloat3131 + aa_Sub3.aFloat3567 * f_546_ + f);
					float f_548_ = (Class378.aFloat3190 * f_546_ + (Class98_Sub41.aFloat4204 * f_545_ + IncomingMessages.aFloat5515 * f_544_) + f_512_);
					float f_549_ = (f_545_ * Class372.aFloat3151 + Class151_Sub4.aFloat4989 * f_544_ + Class287_Sub2.aFloat3273 * f_546_ + f_513_);
					if (!(f_549_ >= (float) ((ha_Sub1) aHa_Sub1_4865).anInt4404)) {
						int i_550_ = anIntArray4851[i_543_];
						int i_551_ = anIntArray4851[i_543_ + 1];
						for (int i_552_ = i_550_; i_551_ > i_552_; i_552_++) {
							int i_553_ = aShortArray4887[i_552_] + -1;
							if ((i_553_ ^ 0xffffffff) == 0)
								break;
							is[-1 + aShortArray4887[i_552_]] = -999999;
						}
					} else {
						if ((i_509_ ^ 0xffffffff) < -1)
							f_549_ = (float) i_509_;
						int i_554_ = (int) ((float) i_519_ * f_547_ / f_549_ + (float) (((ha_Sub1) aHa_Sub1_4865).anInt4451));
						int i_555_ = (int) (f_548_ * (float) i_520_ / f_549_ + (float) (((ha_Sub1) aHa_Sub1_4865).anInt4394));
						int i_556_ = anIntArray4851[i_543_];
						int i_557_ = anIntArray4851[i_543_ + 1];
						for (int i_558_ = i_556_; (i_558_ ^ 0xffffffff) > (i_557_ ^ 0xffffffff); i_558_++) {
							int i_559_ = -1 + aShortArray4887[i_558_];
							if ((i_559_ ^ 0xffffffff) == 0)
								break;
							is[i_559_] = i_554_;
							is_542_[i_559_] = i_555_;
						}
					}
				}
				for (int i_560_ = 0; (anInt4853 ^ 0xffffffff) < (i_560_ ^ 0xffffffff); i_560_++) {
					if (is[aShortArray4895[i_560_]] != -999999 && (is[aShortArray4852[i_560_]] ^ 0xffffffff) != 999998 && (is[aShortArray4878[i_560_]] ^ 0xffffffff) != 999998 && method2377(is_542_[aShortArray4878[i_560_]], is_542_[aShortArray4852[i_560_]], i_507_, is[aShortArray4878[i_560_]], is[aShortArray4852[i_560_]], is[aShortArray4895[i_560_]], is_542_[aShortArray4895[i_560_]], 18818, i_508_))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.GA(" + i + ',' + i_507_ + ',' + i_508_ + ',' + (class111 != null ? "{...}" : "null") + ',' + bool + ',' + i_509_ + ',' + bool_510_ + ')'));
		}
	}

	final void FA(int i) {
		try {
			int i_561_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_562_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_563_ = 0; (i_563_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff); i_563_++) {
				int i_564_ = ((-(anIntArray4843[i_563_] * i_561_) + anIntArray4856[i_563_] * i_562_) >> -2129883186);
				anIntArray4843[i_563_] = (anIntArray4843[i_563_] * i_562_ + anIntArray4856[i_563_] * i_561_) >> 526561358;
				anIntArray4856[i_563_] = i_564_;
			}
			if (aClass104_4889 != null)
				((Class104) aClass104_4889).anInterface16_902 = null;
			aBoolean4847 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.FA(" + i + ')');
		}
	}

	final void method2337(int i, int i_565_, int i_566_, int i_567_) {
		do {
			try {
				for (int i_568_ = 0; (i_568_ ^ 0xffffffff) > (anInt4853 ^ 0xffffffff); i_568_++) {
					int i_569_ = aShortArray4842[i_568_] & 0xffff;
					int i_570_ = i_569_ >> -607227062 & 0x3f;
					int i_571_ = (i_569_ & 0x3ce) >> 1208626503;
					if (i_565_ != -1)
						i_571_ += (-i_571_ + i_565_) * i_567_ >> 264868455;
					int i_572_ = 0x7f & i_569_;
					if ((i ^ 0xffffffff) != 0)
						i_570_ += i_567_ * (i + -i_570_) >> -1575875737;
					if ((i_566_ ^ 0xffffffff) != 0)
						i_572_ = (((i_566_ + -i_572_) * i_567_ >> 174512807) + i_572_);
					aShortArray4842[i_568_] = (short) (Class41.method366(Class41.method366(i_570_ << -1196647414, i_571_ << 1527891239), i_572_));
				}
				if (aClass249Array4877 != null) {
					for (int i_573_ = 0; anInt4866 > i_573_; i_573_++) {
						Class249 class249 = aClass249Array4877[i_573_];
						Class219 class219 = aClass219Array4861[i_573_];
						((Class219) class219).anInt1643 = (((Class219) class219).anInt1643 & ~0xffffff | (Class208.anIntArray1579[0xffff & (aShortArray4842[(((Class249) class249).anInt1905)])]) & 0xffffff);
					}
				}
				if (aClass104_4854 == null)
					break;
				((Class104) aClass104_4854).anInterface16_902 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ln.HB(" + i + ',' + i_565_ + ',' + i_566_ + ',' + i_567_ + ')'));
			}
			break;
		} while (false);
	}

	final int WA() {
		try {
			return aShort4867;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.WA(" + ')');
		}
	}

	final void H(int i, int i_574_, int i_575_) {
		do {
			try {
				for (int i_576_ = 0; (i_576_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff); i_576_++) {
					if (i != 0)
						anIntArray4886[i_576_] += i;
					if (i_574_ != 0)
						anIntArray4856[i_576_] += i_574_;
					if ((i_575_ ^ 0xffffffff) != -1)
						anIntArray4843[i_576_] += i_575_;
				}
				aBoolean4847 = false;
				if (aClass104_4889 == null)
					break;
				((Class104) aClass104_4889).anInterface16_902 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ln.H(" + i + ',' + i_574_ + ',' + i_575_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean F() {
		try {
			return aBoolean4857;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.F(" + ')');
		}
	}

	final int HA() {
		try {
			if (!aBoolean4847)
				method2380(-88);
			return aShort4892;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.HA(" + ')');
		}
	}

	final void method2329(Class111 class111, Class246_Sub6 class246_sub6, int i, int i_577_) {
		try {
			if (anInt4846 != 0) {
				Class111_Sub1 class111_sub1 = ((ha_Sub1) aHa_Sub1_4865).aClass111_Sub1_4348;
				Class111_Sub1 class111_sub1_578_ = (Class111_Sub1) class111;
				if (!aBoolean4847)
					method2380(-124);
				Class48_Sub1_Sub1.aFloat5505 = ((((Class111_Sub1) class111_sub1_578_).aFloat4677 * ((Class111_Sub1) class111_sub1).aFloat4673) + ((((Class111_Sub1) class111_sub1).aFloat4684 * ((Class111_Sub1) class111_sub1_578_).aFloat4674) + (((Class111_Sub1) class111_sub1).aFloat4676 * (((Class111_Sub1) class111_sub1_578_).aFloat4683))) + ((Class111_Sub1) class111_sub1).aFloat4677);
				Class151_Sub4.aFloat4989 = ((((Class111_Sub1) class111_sub1_578_).aFloat4679 * ((Class111_Sub1) class111_sub1).aFloat4684) + (((Class111_Sub1) class111_sub1).aFloat4676 * ((Class111_Sub1) class111_sub1_578_).aFloat4675) + (((Class111_Sub1) class111_sub1).aFloat4673 * ((Class111_Sub1) class111_sub1_578_).aFloat4676));
				float f = (Class48_Sub1_Sub1.aFloat5505 + Class151_Sub4.aFloat4989 * (float) aShort4868);
				float f_579_ = (Class151_Sub4.aFloat4989 * (float) aShort4879 + Class48_Sub1_Sub1.aFloat5505);
				float f_580_;
				float f_581_;
				if (f_579_ < f) {
					f_581_ = f_579_ - (float) aShort4876;
					f_580_ = (float) aShort4876 + f;
				} else {
					f_580_ = (float) aShort4876 + f_579_;
					f_581_ = (float) -aShort4876 + f;
				}
				if (!(((ha_Sub1) aHa_Sub1_4865).aFloat4379 <= f_581_) && !((float) ((ha_Sub1) aHa_Sub1_4865).anInt4404 >= f_580_)) {
					Class50.aFloat419 = (((Class111_Sub1) class111_sub1).aFloat4674 + ((((Class111_Sub1) class111_sub1).aFloat4686 * (((Class111_Sub1) class111_sub1_578_).aFloat4674)) + (((Class111_Sub1) class111_sub1).aFloat4679 * (((Class111_Sub1) class111_sub1_578_).aFloat4683)) + (((Class111_Sub1) class111_sub1).aFloat4680 * (((Class111_Sub1) class111_sub1_578_).aFloat4677))));
					Class286.aFloat2182 = ((((Class111_Sub1) class111_sub1).aFloat4686 * ((Class111_Sub1) class111_sub1_578_).aFloat4679) + (((Class111_Sub1) class111_sub1_578_).aFloat4675 * ((Class111_Sub1) class111_sub1).aFloat4679) + (((Class111_Sub1) class111_sub1_578_).aFloat4676 * ((Class111_Sub1) class111_sub1).aFloat4680));
					float f_582_ = ((float) aShort4868 * Class286.aFloat2182 + Class50.aFloat419);
					float f_583_ = ((float) aShort4879 * Class286.aFloat2182 + Class50.aFloat419);
					float f_584_;
					float f_585_;
					if (f_582_ > f_583_) {
						f_584_ = ((f_582_ + (float) aShort4876) * (float) ((ha_Sub1) aHa_Sub1_4865).anInt4419);
						f_585_ = ((f_583_ - (float) aShort4876) * (float) ((ha_Sub1) aHa_Sub1_4865).anInt4419);
					} else {
						f_584_ = ((f_583_ + (float) aShort4876) * (float) ((ha_Sub1) aHa_Sub1_4865).anInt4419);
						f_585_ = ((f_582_ - (float) aShort4876) * (float) ((ha_Sub1) aHa_Sub1_4865).anInt4419);
					}
					if (!(((ha_Sub1) aHa_Sub1_4865).aFloat4364 <= f_585_ / (float) i) && !(((ha_Sub1) aHa_Sub1_4865).aFloat4421 >= f_584_ / (float) i)) {
						IncomingMessages.aFloat5515 = ((((Class111_Sub1) class111_sub1_578_).aFloat4676 * ((Class111_Sub1) class111_sub1).aFloat4687) + (((((Class111_Sub1) class111_sub1_578_).aFloat4675) * (((Class111_Sub1) class111_sub1).aFloat4675)) + (((Class111_Sub1) class111_sub1).aFloat4678 * (((Class111_Sub1) class111_sub1_578_).aFloat4679))));
						Class376.aFloat3171 = (((Class111_Sub1) class111_sub1).aFloat4683 + (((((Class111_Sub1) class111_sub1_578_).aFloat4677) * (((Class111_Sub1) class111_sub1).aFloat4687)) + (((((Class111_Sub1) class111_sub1).aFloat4675) * (((Class111_Sub1) class111_sub1_578_).aFloat4683)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4674) * (((Class111_Sub1) class111_sub1).aFloat4678)))));
						float f_586_ = (Class376.aFloat3171 + ((float) aShort4868 * IncomingMessages.aFloat5515));
						float f_587_ = (Class376.aFloat3171 + (IncomingMessages.aFloat5515 * (float) aShort4879));
						float f_588_;
						float f_589_;
						if (!(f_586_ > f_587_)) {
							f_589_ = ((f_587_ + (float) aShort4876) * (float) (((ha_Sub1) aHa_Sub1_4865).anInt4381));
							f_588_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4381 * (f_586_ - (float) aShort4876));
						} else {
							f_588_ = ((float) ((ha_Sub1) aHa_Sub1_4865).anInt4381 * (f_587_ - (float) aShort4876));
							f_589_ = (((float) aShort4876 + f_586_) * (float) (((ha_Sub1) aHa_Sub1_4865).anInt4381));
						}
						if (!(f_588_ / (float) i >= ((ha_Sub1) aHa_Sub1_4865).aFloat4437) && !(f_589_ / (float) i <= ((ha_Sub1) aHa_Sub1_4865).aFloat4359)) {
							if (class246_sub6 != null || aClass249Array4877 != null) {
								aa_Sub3.aFloat3567 = (((((Class111_Sub1) class111_sub1).aFloat4686) * (((Class111_Sub1) class111_sub1_578_).aFloat4680)) + ((((Class111_Sub1) class111_sub1).aFloat4679) * ((Class111_Sub1) class111_sub1_578_).aFloat4687) + ((((Class111_Sub1) class111_sub1_578_).aFloat4673) * (((Class111_Sub1) class111_sub1).aFloat4680)));
								Class98_Sub41.aFloat4204 = (((((Class111_Sub1) class111_sub1_578_).aFloat4686) * (((Class111_Sub1) class111_sub1).aFloat4678)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4678) * (((Class111_Sub1) class111_sub1).aFloat4675)) + ((((Class111_Sub1) class111_sub1).aFloat4687) * ((Class111_Sub1) class111_sub1_578_).aFloat4684));
								Class287_Sub2.aFloat3273 = (((((Class111_Sub1) class111_sub1_578_).aFloat4687) * (((Class111_Sub1) class111_sub1).aFloat4676)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4680) * (((Class111_Sub1) class111_sub1).aFloat4684)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4673) * (((Class111_Sub1) class111_sub1).aFloat4673)));
								Class372.aFloat3151 = (((((Class111_Sub1) class111_sub1).aFloat4673) * (((Class111_Sub1) class111_sub1_578_).aFloat4684)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4686 * (((Class111_Sub1) class111_sub1).aFloat4684)) + ((((Class111_Sub1) class111_sub1).aFloat4676) * (((Class111_Sub1) class111_sub1_578_).aFloat4678))));
								Class369.aFloat3131 = (((((Class111_Sub1) class111_sub1).aFloat4686) * (((Class111_Sub1) class111_sub1_578_).aFloat4686)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4678) * (((Class111_Sub1) class111_sub1).aFloat4679)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4684) * (((Class111_Sub1) class111_sub1).aFloat4680)));
								Class378.aFloat3190 = (((((Class111_Sub1) class111_sub1_578_).aFloat4673) * (((Class111_Sub1) class111_sub1).aFloat4687)) + ((((Class111_Sub1) class111_sub1_578_).aFloat4687 * (((Class111_Sub1) class111_sub1).aFloat4675)) + ((((Class111_Sub1) class111_sub1).aFloat4678) * (((Class111_Sub1) class111_sub1_578_).aFloat4680))));
							}
							if (class246_sub6 != null) {
								int i_590_ = aShort4845 - -aShort4862 >> 1682073089;
								int i_591_ = aShort4892 - -aShort4891 >> 1604314785;
								int i_592_ = (int) ((aa_Sub3.aFloat3567 * (float) i_591_) + ((Class286.aFloat2182 * (float) aShort4868) + ((Class369.aFloat3131 * (float) i_590_) + Class50.aFloat419)));
								int i_593_ = (int) (((float) i_591_ * Class378.aFloat3190) + (((float) i_590_ * Class98_Sub41.aFloat4204) + Class376.aFloat3171 + (IncomingMessages.aFloat5515 * (float) aShort4868)));
								int i_594_ = (int) ((Class287_Sub2.aFloat3273 * (float) i_591_) + (Class48_Sub1_Sub1.aFloat5505 + ((float) i_590_ * Class372.aFloat3151) + (Class151_Sub4.aFloat4989 * (float) aShort4868)));
								int i_595_ = (int) (((float) i_591_ * aa_Sub3.aFloat3567) + ((Class369.aFloat3131 * (float) i_590_) + Class50.aFloat419 + ((float) aShort4879 * Class286.aFloat2182)));
								int i_596_ = (int) (Class376.aFloat3171 + (Class98_Sub41.aFloat4204 * (float) i_590_) + ((float) aShort4879 * IncomingMessages.aFloat5515) + ((float) i_591_ * Class378.aFloat3190));
								int i_597_ = (int) ((Class151_Sub4.aFloat4989 * (float) aShort4879) + ((Class372.aFloat3151 * (float) i_590_) + Class48_Sub1_Sub1.aFloat5505) + (Class287_Sub2.aFloat3273 * (float) i_591_));
								((Class246_Sub6) class246_sub6).anInt5112 = ((((ha_Sub1) aHa_Sub1_4865).anInt4381 * i_596_ / i) + ((ha_Sub1) aHa_Sub1_4865).anInt4394);
								((Class246_Sub6) class246_sub6).anInt5110 = (((ha_Sub1) aHa_Sub1_4865).anInt4451 + (((ha_Sub1) aHa_Sub1_4865).anInt4419 * i_595_ / i));
								((Class246_Sub6) class246_sub6).anInt5113 = (((ha_Sub1) aHa_Sub1_4865).anInt4394 + (((ha_Sub1) aHa_Sub1_4865).anInt4381 * i_593_ / i));
								((Class246_Sub6) class246_sub6).anInt5111 = (((ha_Sub1) aHa_Sub1_4865).anInt4451 - -(i_592_ * (((ha_Sub1) aHa_Sub1_4865).anInt4419) / i));
								if ((((ha_Sub1) aHa_Sub1_4865).anInt4404 ^ 0xffffffff) >= (i_594_ ^ 0xffffffff) || ((i_597_ ^ 0xffffffff) <= (((ha_Sub1) aHa_Sub1_4865).anInt4404 ^ 0xffffffff))) {
									((Class246_Sub6) class246_sub6).aBoolean5114 = true;
									((Class246_Sub6) class246_sub6).anInt5109 = (((ha_Sub1) aHa_Sub1_4865).anInt4451 + ((((ha_Sub1) aHa_Sub1_4865).anInt4419) * (aShort4876 + i_592_) / i) - (((Class246_Sub6) class246_sub6).anInt5111));
								}
							}
							aHa_Sub1_4865.method1890((float) i, true);
							aHa_Sub1_4865.method1901((byte) -35);
							aHa_Sub1_4865.method1883(class111_sub1_578_, (byte) -125);
							method2382((byte) -104);
							aHa_Sub1_4865.method1902((byte) 60);
							method2387(-32768);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.U(" + (class111 != null ? "{...}" : "null") + ',' + (class246_sub6 != null ? "{...}" : "null") + ',' + i + ',' + i_577_ + ')'));
		}
	}

	final boolean method2333(int i, int i_598_, Class111 class111, boolean bool, int i_599_, int i_600_) {
		try {
			return method2389(i_599_, i_598_, i, class111, false, i_600_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.KB(" + i + ',' + i_598_ + ',' + (class111 != null ? "{...}" : "null") + ',' + bool + ',' + i_599_ + ',' + i_600_ + ')'));
		}
	}

	final void method2342() {
		/* empty */
	}

	final void method2327() {
		/* empty */
	}

	final Class35[] method2322() {
		try {
			return aClass35Array4863;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.PB(" + ')');
		}
	}

	final void s(int i) {
		try {
			anInt4894 = i;
			if (aClass14_4898 != null && (anInt4894 & 0x10000) == 0) {
				aByteArray4858 = ((Class14) aClass14_4898).aByteArray168;
				aShortArray4860 = ((Class14) aClass14_4898).aShortArray166;
				aShortArray4884 = ((Class14) aClass14_4898).aShortArray165;
				aShortArray4849 = ((Class14) aClass14_4898).aShortArray167;
				aClass14_4898 = null;
			}
			aBoolean4871 = true;
			method2383(-122);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.s(" + i + ')');
		}
	}

	private final void method2390(int i, boolean bool) {
		do {
			try {
				if (i >= 9) {
					boolean bool_601_ = (aClass104_4854 != null && (((Class104) aClass104_4854).anInterface16_902 == null));
					boolean bool_602_ = (aClass104_4859 != null && (((Class104) aClass104_4859).anInterface16_902 == null));
					boolean bool_603_ = (aClass104_4889 != null && (((Class104) aClass104_4889).anInterface16_902 == null));
					boolean bool_604_ = (aClass104_4874 != null && (((Class104) aClass104_4874).anInterface16_902 == null));
					if (bool) {
						bool_604_ = bool_604_ & (0x8 & aByte4885 ^ 0xffffffff) != -1;
						bool_601_ = bool_601_ & (aByte4885 & 0x2 ^ 0xffffffff) != -1;
						bool_602_ = bool_602_ & (0x4 & aByte4885) != 0;
						bool_603_ = bool_603_ & (0x1 & aByte4885) != 0;
					}
					byte i_605_ = 0;
					byte i_606_ = 0;
					byte i_607_ = 0;
					byte i_608_ = 0;
					if (bool_603_) {
						i_606_ = i_605_;
						i_605_ += 12;
					}
					byte i_609_ = 0;
					if (bool_601_) {
						i_607_ = i_605_;
						i_605_ += 4;
					}
					if (bool_602_) {
						i_608_ = i_605_;
						i_605_ += 12;
					}
					if (bool_604_) {
						i_609_ = i_605_;
						i_605_ += 8;
					}
					if ((i_605_ ^ 0xffffffff) != -1) {
						if ((anInt4846 * i_605_ ^ 0xffffffff) < ((((RSByteBuffer) (((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446)).data).length ^ 0xffffffff))
							((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446 = new Class98_Sub22_Sub2(i_605_ * (100 + anInt4846));
						else
							((RSByteBuffer) (((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446)).position = 0;
						Class98_Sub22_Sub2 class98_sub22_sub2 = (((ha_Sub1) aHa_Sub1_4865).aClass98_Sub22_Sub2_4446);
						if (bool_603_) {
							if (((ha_Sub1) aHa_Sub1_4865).aBoolean4397) {
								for (int i_610_ = 0; ((i_610_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff)); i_610_++) {
									int i_611_ = (Stream.floatToRawIntBits((float) anIntArray4886[i_610_]));
									int i_612_ = (Stream.floatToRawIntBits((float) anIntArray4856[i_610_]));
									int i_613_ = (Stream.floatToRawIntBits((float) anIntArray4843[i_610_]));
									int i_614_ = anIntArray4851[i_610_];
									int i_615_ = anIntArray4851[i_610_ + 1];
									for (int i_616_ = i_614_; ((i_615_ ^ 0xffffffff) < (i_616_ ^ 0xffffffff)); i_616_++) {
										int i_617_ = -1 + aShortArray4887[i_616_];
										if (i_617_ == -1)
											break;
										((RSByteBuffer) class98_sub22_sub2).position = i_617_ * i_605_;
										class98_sub22_sub2.writeInt(1571862888, i_611_);
										class98_sub22_sub2.writeInt(1571862888, i_612_);
										class98_sub22_sub2.writeInt(1571862888, i_613_);
									}
								}
							} else {
								for (int i_618_ = 0; anInt4883 > i_618_; i_618_++) {
									int i_619_ = (Stream.floatToRawIntBits((float) anIntArray4886[i_618_]));
									int i_620_ = (Stream.floatToRawIntBits((float) anIntArray4856[i_618_]));
									int i_621_ = (Stream.floatToRawIntBits((float) anIntArray4843[i_618_]));
									int i_622_ = anIntArray4851[i_618_];
									int i_623_ = anIntArray4851[1 + i_618_];
									for (int i_624_ = i_622_; i_624_ < i_623_; i_624_++) {
										int i_625_ = aShortArray4887[i_624_] - 1;
										if ((i_625_ ^ 0xffffffff) == 0)
											break;
										((RSByteBuffer) class98_sub22_sub2).position = i_625_ * i_605_;
										class98_sub22_sub2.method1218(i_619_, 1489446952);
										class98_sub22_sub2.method1218(i_620_, 1489446952);
										class98_sub22_sub2.method1218(i_621_, 1489446952);
									}
								}
							}
						}
						if (bool_601_) {
							if (aClass104_4859 != null) {
								for (int i_626_ = 0; ((i_626_ ^ 0xffffffff) > (anInt4853 ^ 0xffffffff)); i_626_++) {
									int i_627_ = method2385(aShortArray4842[i_626_], aByteArray4882[i_626_], aShortArray4869[i_626_], aShort4867, (byte) -97);
									((RSByteBuffer) class98_sub22_sub2).position = (aShortArray4895[i_626_] * i_605_ + i_607_);
									class98_sub22_sub2.writeInt(1571862888, i_627_);
									((RSByteBuffer) class98_sub22_sub2).position = (i_605_ * aShortArray4852[i_626_] + i_607_);
									class98_sub22_sub2.writeInt(1571862888, i_627_);
									((RSByteBuffer) class98_sub22_sub2).position = (aShortArray4878[i_626_] * i_605_ + i_607_);
									class98_sub22_sub2.writeInt(1571862888, i_627_);
								}
							} else {
								short[] is;
								byte[] is_628_;
								short[] is_629_;
								short[] is_630_;
								if (aClass14_4898 == null) {
									is_629_ = aShortArray4849;
									is_628_ = aByteArray4858;
									is_630_ = aShortArray4860;
									is = aShortArray4884;
								} else {
									is = (((Class14) aClass14_4898).aShortArray165);
									is_628_ = (((Class14) aClass14_4898).aByteArray168);
									is_629_ = (((Class14) aClass14_4898).aShortArray167);
									is_630_ = (((Class14) aClass14_4898).aShortArray166);
								}
								float f = (((ha_Sub1) aHa_Sub1_4865).aFloatArray4438[0]);
								float f_631_ = (((ha_Sub1) aHa_Sub1_4865).aFloatArray4438[1]);
								float f_632_ = (((ha_Sub1) aHa_Sub1_4865).aFloatArray4438[2]);
								float f_633_ = ((ha_Sub1) aHa_Sub1_4865).aFloat4413;
								float f_634_ = (768.0F * ((ha_Sub1) aHa_Sub1_4865).aFloat4435 / (float) aShort4872);
								float f_635_ = (768.0F * ((ha_Sub1) aHa_Sub1_4865).aFloat4407 / (float) aShort4872);
								for (int i_636_ = 0; i_636_ < anInt4853; i_636_++) {
									int i_637_ = method2385(aShortArray4842[i_636_], aByteArray4882[i_636_], aShortArray4869[i_636_], aShort4867, (byte) -97);
									float f_638_ = ((float) (0xff & i_637_ >> -2032468944) * (((ha_Sub1) aHa_Sub1_4865).aFloat4420));
									int i_639_ = aShortArray4895[i_636_];
									float f_640_ = ((float) (0xff & i_637_ >> -1878108920) * (((ha_Sub1) aHa_Sub1_4865).aFloat4458));
									float f_641_ = (((ha_Sub1) aHa_Sub1_4865).aFloat4433 * (float) (i_637_ >>> -4756936));
									short i_642_ = (short) is_628_[i_639_];
									float f_643_;
									if ((i_642_ ^ 0xffffffff) == -1)
										f_643_ = (((float) is[i_639_] * f_631_ + f * (float) is_630_[i_639_] + (f_632_ * (float) is_629_[i_639_])) * 0.0026041667F);
									else
										f_643_ = (((float) is_630_[i_639_] * f + f_631_ * (float) is[i_639_] + ((float) is_629_[i_639_] * f_632_)) / (float) (i_642_ * 256));
									float f_644_ = f_633_ + (f_643_ < 0.0F ? f_635_ : f_634_) * f_643_;
									int i_645_ = (int) (f_641_ * f_644_);
									if ((i_645_ ^ 0xffffffff) > -1)
										i_645_ = 0;
									else if ((i_645_ ^ 0xffffffff) < -256)
										i_645_ = 255;
									int i_646_ = (int) (f_644_ * f_638_);
									int i_647_ = (int) (f_644_ * f_640_);
									if (i_646_ >= 0) {
										if ((i_646_ ^ 0xffffffff) < -256)
											i_646_ = 255;
									} else
										i_646_ = 0;
									((RSByteBuffer) class98_sub22_sub2).position = i_607_ - -(i_605_ * i_639_);
									if (i_647_ < 0)
										i_647_ = 0;
									else if (i_647_ > 255)
										i_647_ = 255;
									class98_sub22_sub2.writeByte(i_645_);
									class98_sub22_sub2.writeByte(i_646_);
									class98_sub22_sub2.writeByte(i_647_);
									class98_sub22_sub2.writeByte((-(0xff & aByteArray4882[i_636_]) + 255));
									i_639_ = aShortArray4852[i_636_];
									i_642_ = (short) is_628_[i_639_];
									if ((i_642_ ^ 0xffffffff) == -1)
										f_643_ = (f_631_ * (float) is[i_639_] + f * (float) is_630_[i_639_] + ((float) is_629_[i_639_] * f_632_)) * 0.0026041667F;
									else
										f_643_ = ((((float) is_629_[i_639_] * f_632_) + ((float) is_630_[i_639_] * f + (f_631_ * (float) is[i_639_]))) / (float) (i_642_ * 256));
									f_644_ = f_633_ + (f_643_ < 0.0F ? f_635_ : f_634_) * f_643_;
									i_645_ = (int) (f_644_ * f_641_);
									if ((i_645_ ^ 0xffffffff) <= -1) {
										if ((i_645_ ^ 0xffffffff) < -256)
											i_645_ = 255;
									} else
										i_645_ = 0;
									i_646_ = (int) (f_644_ * f_638_);
									i_647_ = (int) (f_640_ * f_644_);
									if (i_646_ >= 0) {
										if (i_646_ > 255)
											i_646_ = 255;
									} else
										i_646_ = 0;
									((RSByteBuffer) class98_sub22_sub2).position = i_607_ - -(i_605_ * i_639_);
									if (i_647_ >= 0) {
										if ((i_647_ ^ 0xffffffff) < -256)
											i_647_ = 255;
									} else
										i_647_ = 0;
									class98_sub22_sub2.writeByte(i_645_);
									class98_sub22_sub2.writeByte(i_646_);
									class98_sub22_sub2.writeByte(i_647_);
									class98_sub22_sub2.writeByte(255 - (0xff & aByteArray4882[i_636_]));
									i_639_ = aShortArray4878[i_636_];
									i_642_ = (short) is_628_[i_639_];
									if ((i_642_ ^ 0xffffffff) != -1)
										f_643_ = ((((float) is_629_[i_639_] * f_632_) + ((float) is[i_639_] * f_631_ + f * (float) (is_630_[i_639_]))) / (float) (256 * i_642_));
									else
										f_643_ = (0.0026041667F * ((f_632_ * (float) is_629_[i_639_]) + ((f_631_ * (float) is[i_639_]) + ((float) is_630_[i_639_] * f))));
									f_644_ = f_633_ + f_643_ * (f_643_ < 0.0F ? f_635_ : f_634_);
									i_645_ = (int) (f_644_ * f_641_);
									i_646_ = (int) (f_638_ * f_644_);
									if (i_645_ >= 0) {
										if ((i_645_ ^ 0xffffffff) < -256)
											i_645_ = 255;
									} else
										i_645_ = 0;
									i_647_ = (int) (f_640_ * f_644_);
									if ((i_646_ ^ 0xffffffff) <= -1) {
										if ((i_646_ ^ 0xffffffff) < -256)
											i_646_ = 255;
									} else
										i_646_ = 0;
									if ((i_647_ ^ 0xffffffff) <= -1) {
										if (i_647_ > 255)
											i_647_ = 255;
									} else
										i_647_ = 0;
									((RSByteBuffer) class98_sub22_sub2).position = i_607_ + i_605_ * i_639_;
									class98_sub22_sub2.writeByte(i_645_);
									class98_sub22_sub2.writeByte(i_646_);
									class98_sub22_sub2.writeByte(i_647_);
									class98_sub22_sub2.writeByte(255 - (aByteArray4882[i_636_] & 0xff));
								}
							}
						}
						if (bool_602_) {
							byte[] is;
							short[] is_648_;
							short[] is_649_;
							short[] is_650_;
							if (aClass14_4898 != null) {
								is = ((Class14) aClass14_4898).aByteArray168;
								is_650_ = ((Class14) aClass14_4898).aShortArray167;
								is_648_ = ((Class14) aClass14_4898).aShortArray166;
								is_649_ = ((Class14) aClass14_4898).aShortArray165;
							} else {
								is = aByteArray4858;
								is_648_ = aShortArray4860;
								is_649_ = aShortArray4884;
								is_650_ = aShortArray4849;
							}
							float f = 3.0F / (float) aShort4872;
							((RSByteBuffer) class98_sub22_sub2).position = i_608_;
							float f_651_ = 3.0F / (float) (aShort4872 + aShort4872 / 2);
							if (((ha_Sub1) aHa_Sub1_4865).aBoolean4397) {
								for (int i_652_ = 0; i_652_ < anInt4846; i_652_++) {
									int i_653_ = is[i_652_] & 0xff;
									if ((i_653_ ^ 0xffffffff) != -1) {
										float f_654_ = f / (float) i_653_;
										class98_sub22_sub2.method1264((byte) -103, (float) is_648_[i_652_] * f_654_);
										class98_sub22_sub2.method1264((byte) 71, f_654_ * (float) is_649_[i_652_]);
										class98_sub22_sub2.method1264((byte) -94, (float) is_650_[i_652_] * f_654_);
									} else {
										class98_sub22_sub2.method1264((byte) 71, f_651_ * (float) is_648_[i_652_]);
										class98_sub22_sub2.method1264((byte) -1, (float) is_649_[i_652_] * f_651_);
										class98_sub22_sub2.method1264((byte) 123, (float) is_650_[i_652_] * f_651_);
									}
									((RSByteBuffer) class98_sub22_sub2).position += i_605_ + -12;
								}
							} else {
								for (int i_655_ = 0; i_655_ < anInt4846; i_655_++) {
									int i_656_ = is[i_655_] & 0xff;
									if ((i_656_ ^ 0xffffffff) == -1) {
										class98_sub22_sub2.method1265((byte) -52, (float) is_648_[i_655_] * f_651_);
										class98_sub22_sub2.method1265((byte) -52, (float) is_649_[i_655_] * f_651_);
										class98_sub22_sub2.method1265((byte) -52, (float) is_650_[i_655_] * f_651_);
									} else {
										float f_657_ = f / (float) i_656_;
										class98_sub22_sub2.method1265((byte) -52, f_657_ * (float) is_648_[i_655_]);
										class98_sub22_sub2.method1265((byte) -52, (float) is_649_[i_655_] * f_657_);
										class98_sub22_sub2.method1265((byte) -52, (float) is_650_[i_655_] * f_657_);
									}
									((RSByteBuffer) class98_sub22_sub2).position += -12 + i_605_;
								}
							}
						}
						if (bool_604_) {
							((RSByteBuffer) class98_sub22_sub2).position = i_609_;
							if (!((ha_Sub1) aHa_Sub1_4865).aBoolean4397) {
								for (int i_658_ = 0; anInt4846 > i_658_; i_658_++) {
									class98_sub22_sub2.method1265((byte) -52, aFloatArray4897[i_658_]);
									class98_sub22_sub2.method1265((byte) -52, aFloatArray4890[i_658_]);
									((RSByteBuffer) class98_sub22_sub2).position += i_605_ + -8;
								}
							} else {
								for (int i_659_ = 0; i_659_ < anInt4846; i_659_++) {
									class98_sub22_sub2.method1264((byte) -95, aFloatArray4897[i_659_]);
									class98_sub22_sub2.method1264((byte) 42, aFloatArray4890[i_659_]);
									((RSByteBuffer) class98_sub22_sub2).position += i_605_ - 8;
								}
							}
						}
						((RSByteBuffer) class98_sub22_sub2).position = i_605_ * anInt4846;
						Interface16 interface16;
						if (!bool) {
							interface16 = (aHa_Sub1_4865.method1878((((RSByteBuffer) class98_sub22_sub2).position), false, i_605_, -85, (((RSByteBuffer) class98_sub22_sub2).data)));
							aBoolean4871 = true;
						} else {
							if (anInterface16_4839 == null)
								anInterface16_4839 = (aHa_Sub1_4865.method1878((((RSByteBuffer) class98_sub22_sub2).position), true, i_605_, -119, (((RSByteBuffer) class98_sub22_sub2).data)));
							else
								anInterface16_4839.method54((((RSByteBuffer) class98_sub22_sub2).position), 7896, (((RSByteBuffer) class98_sub22_sub2).data), i_605_);
							interface16 = anInterface16_4839;
							aByte4885 = (byte) 0;
						}
						if (bool_603_) {
							((Class104) aClass104_4889).aByte898 = i_606_;
							((Class104) aClass104_4889).anInterface16_902 = interface16;
						}
						if (bool_604_) {
							((Class104) aClass104_4874).aByte898 = i_609_;
							((Class104) aClass104_4874).anInterface16_902 = interface16;
						}
						if (bool_601_) {
							((Class104) aClass104_4854).aByte898 = i_607_;
							((Class104) aClass104_4854).anInterface16_902 = interface16;
						}
						if (!bool_602_)
							break;
						((Class104) aClass104_4859).anInterface16_902 = interface16;
						((Class104) aClass104_4859).aByte898 = i_608_;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.CA(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final void method2326() {
		try {
			if (anInt4846 > 0 && (anInt4896 ^ 0xffffffff) < -1) {
				method2390(108, false);
				if ((aByte4885 & 0x10 ^ 0xffffffff) == -1 && ((Class322) aClass322_4838).anInterface8_2711 == null)
					method2388(false, -256);
				method2383(-54);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.M(" + ')');
		}
	}

	final AbstractModel method2341(byte i, int i_660_, boolean bool) {
		try {
			Class146_Sub2 class146_sub2_661_;
			Class146_Sub2 class146_sub2_662_;
			if ((i ^ 0xffffffff) != -2) {
				if (i == 2) {
					class146_sub2_662_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4461;
					class146_sub2_661_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4393;
				} else if ((i ^ 0xffffffff) == -4) {
					class146_sub2_661_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4462;
					class146_sub2_662_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4361;
				} else if ((i ^ 0xffffffff) != -5) {
					if (i != 5)
						class146_sub2_661_ = class146_sub2_662_ = new Class146_Sub2(aHa_Sub1_4865);
					else {
						class146_sub2_662_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4382;
						class146_sub2_661_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4386;
					}
				} else {
					class146_sub2_661_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4456;
					class146_sub2_662_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4355;
				}
			} else {
				class146_sub2_661_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4428;
				class146_sub2_662_ = ((ha_Sub1) aHa_Sub1_4865).aClass146_Sub2_4369;
			}
			return method2379(255, bool, i != 0, i_660_, class146_sub2_661_, class146_sub2_662_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.T(" + i + ',' + i_660_ + ',' + bool + ')'));
		}
	}

	final void wa() {
		do {
			try {
				for (int i = 0; anInt4893 > i; i++) {
					anIntArray4886[i] = anIntArray4886[i] + 7 >> -1281677276;
					anIntArray4856[i] = 7 + anIntArray4856[i] >> 115076868;
					anIntArray4843[i] = anIntArray4843[i] + 7 >> -463795676;
				}
				aBoolean4847 = false;
				if (aClass104_4889 == null)
					break;
				((Class104) aClass104_4889).anInterface16_902 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ln.wa(" + ')');
			}
			break;
		} while (false);
	}

	final void method2332(AbstractModel class146, int i, int i_663_, int i_664_, boolean bool) {
		try {
			Class146_Sub2 class146_sub2_665_ = (Class146_Sub2) class146;
			if ((anInt4853 ^ 0xffffffff) != -1 && (class146_sub2_665_.anInt4853 ^ 0xffffffff) != -1) {
				int i_666_ = class146_sub2_665_.anInt4883;
				int[] is = class146_sub2_665_.anIntArray4886;
				int[] is_667_ = class146_sub2_665_.anIntArray4856;
				int[] is_668_ = class146_sub2_665_.anIntArray4843;
				short[] is_669_ = class146_sub2_665_.aShortArray4860;
				short[] is_670_ = class146_sub2_665_.aShortArray4884;
				short[] is_671_ = class146_sub2_665_.aShortArray4849;
				byte[] is_672_ = class146_sub2_665_.aByteArray4858;
				short[] is_673_;
				short[] is_674_;
				short[] is_675_;
				byte[] is_676_;
				if (aClass14_4898 != null) {
					is_674_ = ((Class14) aClass14_4898).aShortArray165;
					is_673_ = ((Class14) aClass14_4898).aShortArray166;
					is_676_ = ((Class14) aClass14_4898).aByteArray168;
					is_675_ = ((Class14) aClass14_4898).aShortArray167;
				} else {
					is_673_ = null;
					is_674_ = null;
					is_675_ = null;
					is_676_ = null;
				}
				byte[] is_677_;
				short[] is_678_;
				short[] is_679_;
				short[] is_680_;
				if (class146_sub2_665_.aClass14_4898 == null) {
					is_680_ = null;
					is_679_ = null;
					is_677_ = null;
					is_678_ = null;
				} else {
					is_677_ = (((Class14) class146_sub2_665_.aClass14_4898).aByteArray168);
					is_678_ = (((Class14) class146_sub2_665_.aClass14_4898).aShortArray165);
					is_679_ = (((Class14) class146_sub2_665_.aClass14_4898).aShortArray167);
					is_680_ = (((Class14) class146_sub2_665_.aClass14_4898).aShortArray166);
				}
				int[] is_681_ = class146_sub2_665_.anIntArray4851;
				short[] is_682_ = class146_sub2_665_.aShortArray4887;
				if (!class146_sub2_665_.aBoolean4847)
					class146_sub2_665_.method2380(-113);
				int i_683_ = class146_sub2_665_.aShort4868;
				int i_684_ = class146_sub2_665_.aShort4879;
				int i_685_ = class146_sub2_665_.aShort4845;
				int i_686_ = class146_sub2_665_.aShort4862;
				int i_687_ = class146_sub2_665_.aShort4892;
				int i_688_ = class146_sub2_665_.aShort4891;
				for (int i_689_ = 0; (i_689_ ^ 0xffffffff) > (anInt4883 ^ 0xffffffff); i_689_++) {
					int i_690_ = anIntArray4856[i_689_] - i_663_;
					if ((i_690_ ^ 0xffffffff) <= (i_683_ ^ 0xffffffff) && i_684_ >= i_690_) {
						int i_691_ = -i + anIntArray4886[i_689_];
						if (i_685_ <= i_691_ && i_691_ <= i_686_) {
							int i_692_ = anIntArray4843[i_689_] + -i_664_;
							if (i_687_ <= i_692_ && i_692_ <= i_688_) {
								int i_693_ = -1;
								int i_694_ = anIntArray4851[i_689_];
								int i_695_ = anIntArray4851[i_689_ + 1];
								for (int i_696_ = i_694_; i_695_ > i_696_; i_696_++) {
									i_693_ = -1 + aShortArray4887[i_696_];
									if ((i_693_ ^ 0xffffffff) == 0 || (aByteArray4858[i_693_] ^ 0xffffffff) != -1)
										break;
								}
								if (i_693_ != -1) {
									for (int i_697_ = 0; i_697_ < i_666_; i_697_++) {
										if (i_691_ == is[i_697_] && i_692_ == is_668_[i_697_] && is_667_[i_697_] == i_690_) {
											i_694_ = is_681_[i_697_];
											int i_698_ = -1;
											i_695_ = is_681_[i_697_ + 1];
											for (int i_699_ = i_694_; i_699_ < i_695_; i_699_++) {
												i_698_ = is_682_[i_699_] + -1;
												if ((i_698_ ^ 0xffffffff) == 0 || is_672_[i_698_] != 0)
													break;
											}
											if (i_698_ != -1) {
												if (is_673_ == null) {
													aClass14_4898 = new Class14();
													is_673_ = ((Class14) aClass14_4898).aShortArray166 = (Class141.method2304((byte) 110, aShortArray4860));
													is_674_ = ((Class14) aClass14_4898).aShortArray165 = (Class141.method2304((byte) 116, aShortArray4884));
													is_675_ = ((Class14) aClass14_4898).aShortArray167 = (Class141.method2304((byte) 120, aShortArray4849));
													is_676_ = ((Class14) aClass14_4898).aByteArray168 = (Class98_Sub10_Sub24.method1075(aByteArray4858, true));
												}
												if (is_680_ == null) {
													Class14 class14 = (class146_sub2_665_.aClass14_4898 = new Class14());
													is_680_ = ((Class14) class14).aShortArray166 = (Class141.method2304((byte) 110, is_669_));
													is_678_ = ((Class14) class14).aShortArray165 = (Class141.method2304((byte) 123, is_670_));
													is_679_ = ((Class14) class14).aShortArray167 = (Class141.method2304((byte) 114, is_671_));
													is_677_ = ((Class14) class14).aByteArray168 = (Class98_Sub10_Sub24.method1075(is_672_, true));
												}
												short i_700_ = aShortArray4860[i_693_];
												short i_701_ = aShortArray4884[i_693_];
												short i_702_ = aShortArray4849[i_693_];
												i_695_ = is_681_[1 + i_697_];
												i_694_ = is_681_[i_697_];
												byte i_703_ = aByteArray4858[i_693_];
												for (int i_704_ = i_694_; ((i_704_ ^ 0xffffffff) > (i_695_ ^ 0xffffffff)); i_704_++) {
													int i_705_ = -1 + is_682_[i_704_];
													if (i_705_ == -1)
														break;
													if (is_677_[i_705_] != 0) {
														is_680_[i_705_] += i_700_;
														is_678_[i_705_] += i_701_;
														is_679_[i_705_] += i_702_;
														is_677_[i_705_] += i_703_;
													}
												}
												i_702_ = is_671_[i_698_];
												i_700_ = is_669_[i_698_];
												i_694_ = anIntArray4851[i_689_];
												i_703_ = is_672_[i_698_];
												i_701_ = is_670_[i_698_];
												i_695_ = (anIntArray4851[i_689_ - -1]);
												for (int i_706_ = i_694_; i_695_ > i_706_; i_706_++) {
													int i_707_ = -1 + (aShortArray4887[i_706_]);
													if (i_707_ == -1)
														break;
													if (is_676_[i_707_] != 0) {
														is_673_[i_707_] += i_700_;
														is_674_[i_707_] += i_701_;
														is_675_[i_707_] += i_702_;
														is_676_[i_707_] += i_703_;
													}
												}
												if (aClass104_4859 == null && aClass104_4854 != null)
													((Class104) aClass104_4854).anInterface16_902 = null;
												if (aClass104_4859 != null)
													((Class104) aClass104_4859).anInterface16_902 = null;
												if ((class146_sub2_665_.aClass104_4859) == null && ((class146_sub2_665_.aClass104_4854) != null))
													((Class104) (class146_sub2_665_.aClass104_4854)).anInterface16_902 = null;
												if ((class146_sub2_665_.aClass104_4859) != null)
													((Class104) (class146_sub2_665_.aClass104_4859)).anInterface16_902 = null;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ln.AA(" + (class146 != null ? "{...}" : "null") + ',' + i + ',' + i_663_ + ',' + i_664_ + ',' + bool + ')'));
		}
	}

	final int da() {
		try {
			return aShort4872;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.da(" + ')');
		}
	}

	static final int method2391(byte i) {
		try {
			if (GameInterface.aFrame3950 != null)
				return 3;
			int i_708_ = -2 / ((i - 56) / 44);
			if (!Class134.aBoolean3457)
				return 1;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.S(" + i + ')');
		}
	}

	final int EA() {
		try {
			if (!aBoolean4847)
				method2380(-96);
			return aShort4879;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.EA(" + ')');
		}
	}

	final void v() {
		try {
			for (int i = 0; i < anInt4883; i++)
				anIntArray4843[i] = -anIntArray4843[i];
			for (int i = 0; anInt4846 > i; i++)
				aShortArray4849[i] = (short) -aShortArray4849[i];
			for (int i = 0; (anInt4853 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				short i_709_ = aShortArray4895[i];
				aShortArray4895[i] = aShortArray4878[i];
				aShortArray4878[i] = i_709_;
			}
			if (aClass104_4859 == null && aClass104_4854 != null)
				((Class104) aClass104_4854).anInterface16_902 = null;
			if (aClass104_4859 != null)
				((Class104) aClass104_4859).anInterface16_902 = null;
			if (aClass104_4889 != null)
				((Class104) aClass104_4889).anInterface16_902 = null;
			if (aClass322_4838 != null)
				((Class322) aClass322_4838).anInterface8_2711 = null;
			aBoolean4847 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.v(" + ')');
		}
	}

	Class146_Sub2(ha_Sub1 var_ha_Sub1) {
		aBoolean4848 = false;
		aBoolean4857 = false;
		anInt4893 = 0;
		anInt4853 = 0;
		anInt4896 = 0;
		try {
			aHa_Sub1_4865 = var_ha_Sub1;
			aClass104_4889 = new Class104(null, 5126, 3, 0);
			aClass104_4874 = new Class104(null, 5126, 2, 0);
			aClass104_4859 = new Class104(null, 5126, 3, 0);
			aClass104_4854 = new Class104(null, 5121, 4, 0);
			aClass322_4838 = new Class322();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ln.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ')');
		}
	}

	Class146_Sub2(ha_Sub1 var_ha_Sub1, ModelDefinitions class178, int i, int i_710_, int i_711_, int i_712_) {
		aBoolean4848 = false;
		aBoolean4857 = false;
		anInt4893 = 0;
		anInt4853 = 0;
		anInt4896 = 0;
		do {
			try {
				aHa_Sub1_4865 = var_ha_Sub1;
				anInt4894 = i;
				anInt4837 = i_712_;
				if (Class246_Sub2.method2973(i, i_712_, (byte) 2))
					aClass104_4889 = new Class104(null, 5126, 3, 0);
				if (za_Sub2.method1682(i, 0, i_712_))
					aClass104_4874 = new Class104(null, 5126, 2, 0);
				if (Class246_Sub3_Sub5_Sub2.method3096(-27984, i_712_, i))
					aClass104_4859 = new Class104(null, 5126, 3, 0);
				if (Class87.method854(i_712_, 28733, i))
					aClass104_4854 = new Class104(null, 5121, 4, 0);
				if (Class322.method3672(i_712_, i, 2048))
					aClass322_4838 = new Class322();
				d var_d = ((ha) var_ha_Sub1).aD938;
				anIntArray4851 = new int[1 + ((ModelDefinitions) class178).anInt1406];
				int[] is = new int[((ModelDefinitions) class178).anInt1391];
				for (int i_713_ = 0; ((i_713_ ^ 0xffffffff) > (((ModelDefinitions) class178).anInt1391 ^ 0xffffffff)); i_713_++) {
					if (((ModelDefinitions) class178).aByteArray1414 == null || ((ModelDefinitions) class178).aByteArray1414[i_713_] != 2) {
						if (((ModelDefinitions) class178).aShortArray1409 != null && (((ModelDefinitions) class178).aShortArray1409[i_713_] ^ 0xffffffff) != 0) {
							Class238 class238 = var_d.method11(((((ModelDefinitions) class178).aShortArray1409[i_713_]) & 0xffff), -28755);
							if (((anInt4837 & 0x40) == 0 || !((Class238) class238).aBoolean1825) && ((Class238) class238).aBoolean1833)
								continue;
						}
						is[anInt4853++] = i_713_;
						anIntArray4851[(((ModelDefinitions) class178).aShortArray1393[i_713_])]++;
						anIntArray4851[(((ModelDefinitions) class178).aShortArray1410[i_713_])]++;
						anIntArray4851[(((ModelDefinitions) class178).aShortArray1392[i_713_])]++;
					}
				}
				anInt4896 = anInt4853;
				long[] ls = new long[anInt4853];
				boolean bool = (0x100 & anInt4894 ^ 0xffffffff) != -1;
				for (int i_714_ = 0; (anInt4853 ^ 0xffffffff) < (i_714_ ^ 0xffffffff); i_714_++) {
					int i_715_ = is[i_714_];
					Class238 class238 = null;
					int i_716_ = 0;
					int i_717_ = 0;
					int i_718_ = 0;
					int i_719_ = 0;
					if (((ModelDefinitions) class178).aClass106Array1419 != null) {
						boolean bool_720_ = false;
						for (int i_721_ = 0; ((((ModelDefinitions) class178).aClass106Array1419.length ^ 0xffffffff) < (i_721_ ^ 0xffffffff)); i_721_++) {
							Class106 class106 = (((ModelDefinitions) class178).aClass106Array1419[i_721_]);
							if (((Class106) class106).anInt906 == i_715_) {
								Class177 class177 = Class67.method689((((Class106) class106).anInt905), (byte) -124);
								if (((Class177) class177).aBoolean1377)
									bool_720_ = true;
								if ((((Class177) class177).anInt1373 ^ 0xffffffff) != 0) {
									Class238 class238_722_ = var_d.method11((((Class177) class177).anInt1373), -28755);
									if (((Class238) class238_722_).anInt1818 == 2)
										aBoolean4857 = true;
								}
							}
						}
						if (bool_720_) {
							ls[i_714_] = 9223372036854775807L;
							anInt4896--;
							continue;
						}
					}
					int i_723_ = -1;
					if (((ModelDefinitions) class178).aShortArray1409 != null) {
						i_723_ = ((ModelDefinitions) class178).aShortArray1409[i_715_];
						if ((i_723_ ^ 0xffffffff) != 0) {
							class238 = var_d.method11(0xffff & i_723_, -28755);
							if ((0x40 & anInt4837) == 0 || !((Class238) class238).aBoolean1825) {
								i_718_ = ((Class238) class238).aByte1820;
								i_719_ = ((Class238) class238).aByte1816;
								if (((Class238) class238).aByte1823 != 0 || (((Class238) class238).aByte1837 ^ 0xffffffff) != -1)
									aBoolean4848 = true;
							} else {
								class238 = null;
								i_723_ = -1;
							}
						}
					}
					boolean bool_724_ = ((((ModelDefinitions) class178).aByteArray1411 != null && (((ModelDefinitions) class178).aByteArray1411[i_715_] ^ 0xffffffff) != -1) || (class238 != null && (((Class238) class238).anInt1818 ^ 0xffffffff) != -1));
					if ((bool || bool_724_) && ((ModelDefinitions) class178).aByteArray1402 != null)
						i_716_ += (((ModelDefinitions) class178).aByteArray1402[i_715_] << -491835247);
					if (bool_724_)
						i_716_ += 65536;
					i_716_ += (i_718_ & 0xff) << 1866327528;
					i_716_ += i_719_ & 0xff;
					i_717_ += (i_723_ & 0xffff) << 955492592;
					i_717_ += i_714_ & 0xffff;
					ls[i_714_] = (long) i_717_ + ((long) i_716_ << -1611155616);
					Class146_Sub2 class146_sub2_725_ = this;
					class146_sub2_725_.aBoolean4848 = (class146_sub2_725_.aBoolean4848 | (class238 != null && (((Class238) class238).aByte1823 != 0 || ((Class238) class238).aByte1837 != 0)));
					aBoolean4857 |= bool_724_;
				}
				Class90.method882(is, ls, (byte) 118);
				anIntArray4843 = ((ModelDefinitions) class178).anIntArray1418;
				anInt4893 = ((ModelDefinitions) class178).anInt1407;
				aShortArray4841 = ((ModelDefinitions) class178).aShortArray1408;
				anIntArray4886 = ((ModelDefinitions) class178).anIntArray1416;
				anIntArray4856 = ((ModelDefinitions) class178).anIntArray1400;
				anInt4883 = ((ModelDefinitions) class178).anInt1406;
				aClass87Array4881 = ((ModelDefinitions) class178).aClass87Array1413;
				aClass35Array4863 = ((ModelDefinitions) class178).aClass35Array1398;
				Class286[] class286s = new Class286[anInt4883];
				if (((ModelDefinitions) class178).aClass106Array1419 != null) {
					anInt4866 = ((ModelDefinitions) class178).aClass106Array1419.length;
					aClass249Array4877 = new Class249[anInt4866];
					aClass219Array4861 = new Class219[anInt4866];
					for (int i_726_ = 0; (anInt4866 ^ 0xffffffff) < (i_726_ ^ 0xffffffff); i_726_++) {
						Class106 class106 = ((ModelDefinitions) class178).aClass106Array1419[i_726_];
						Class177 class177 = Class67.method689(((Class106) class106).anInt905, (byte) -95);
						int i_727_ = -1;
						for (int i_728_ = 0; (i_728_ ^ 0xffffffff) > (anInt4853 ^ 0xffffffff); i_728_++) {
							if ((is[i_728_] ^ 0xffffffff) == (((Class106) class106).anInt906 ^ 0xffffffff)) {
								i_727_ = i_728_;
								break;
							}
						}
						if (i_727_ == -1)
							throw new RuntimeException();
						int i_729_ = ((Class208.anIntArray1579[0xffff & (((ModelDefinitions) class178).aShortArray1415[((Class106) class106).anInt906])]) & 0xffffff);
						i_729_ = (i_729_ | (255 - ((((ModelDefinitions) class178).aByteArray1411 == null) ? (int) 0 : (((ModelDefinitions) class178).aByteArray1411[((Class106) class106).anInt906])) << -1137441576));
						aClass249Array4877[i_726_] = new Class249(i_727_, (((ModelDefinitions) class178).aShortArray1393[((Class106) class106).anInt906]), (((ModelDefinitions) class178).aShortArray1410[((Class106) class106).anInt906]), (((ModelDefinitions) class178).aShortArray1392[((Class106) class106).anInt906]), ((Class177) class177).anInt1374, ((Class177) class177).anInt1380, ((Class177) class177).anInt1373, ((Class177) class177).anInt1384, ((Class177) class177).anInt1379, ((Class177) class177).aBoolean1377, ((Class177) class177).aBoolean1383, ((Class106) class106).anInt907);
						aClass219Array4861[i_726_] = new Class219(i_729_);
					}
				}
				int i_730_ = 3 * anInt4853;
				aShortArray4842 = new short[anInt4853];
				aShortArray4869 = new short[anInt4853];
				aShortArray4895 = new short[anInt4853];
				aShortArray4852 = new short[anInt4853];
				Class151_Sub1.aLongArray4970 = new long[i_730_];
				aFloatArray4897 = new float[i_730_];
				aShortArray4878 = new short[anInt4853];
				if (((ModelDefinitions) class178).aShortArray1394 != null)
					aShortArray4864 = new short[anInt4853];
				aShort4872 = (short) i_711_;
				aShort4867 = (short) i_710_;
				aShortArray4849 = new short[i_730_];
				aByteArray4882 = new byte[anInt4853];
				aFloatArray4890 = new float[i_730_];
				aShortArray4884 = new short[i_730_];
				aByteArray4858 = new byte[i_730_];
				aShortArray4887 = new short[i_730_];
				aShortArray4860 = new short[i_730_];
				int i_731_ = 0;
				for (int i_732_ = 0; i_732_ < ((ModelDefinitions) class178).anInt1406; i_732_++) {
					int i_733_ = anIntArray4851[i_732_];
					anIntArray4851[i_732_] = i_731_;
					i_731_ += i_733_;
					class286s[i_732_] = new Class286();
				}
				anIntArray4851[((ModelDefinitions) class178).anInt1406] = i_731_;
				Class250 class250 = Class224_Sub2.method2836(is, true, class178, anInt4853);
				Class372[] class372s = new Class372[((ModelDefinitions) class178).anInt1391];
				for (int i_734_ = 0; ((ModelDefinitions) class178).anInt1391 > i_734_; i_734_++) {
					short i_735_ = ((ModelDefinitions) class178).aShortArray1393[i_734_];
					short i_736_ = ((ModelDefinitions) class178).aShortArray1410[i_734_];
					short i_737_ = ((ModelDefinitions) class178).aShortArray1392[i_734_];
					int i_738_ = anIntArray4886[i_736_] - anIntArray4886[i_735_];
					int i_739_ = -anIntArray4856[i_735_] + anIntArray4856[i_736_];
					int i_740_ = -anIntArray4843[i_735_] + anIntArray4843[i_736_];
					int i_741_ = -anIntArray4886[i_735_] + anIntArray4886[i_737_];
					int i_742_ = -anIntArray4856[i_735_] + anIntArray4856[i_737_];
					int i_743_ = anIntArray4843[i_737_] + -anIntArray4843[i_735_];
					int i_744_ = i_743_ * i_739_ - i_742_ * i_740_;
					int i_745_ = i_741_ * i_740_ - i_738_ * i_743_;
					int i_746_;
					for (i_746_ = -(i_739_ * i_741_) + i_742_ * i_738_; (i_744_ > 8192 || i_745_ > 8192 || (i_746_ ^ 0xffffffff) < -8193 || (i_744_ ^ 0xffffffff) > 8191 || (i_745_ ^ 0xffffffff) > 8191 || (i_746_ ^ 0xffffffff) > 8191); i_744_ >>= 1) {
						i_745_ >>= 1;
						i_746_ >>= 1;
					}
					int i_747_ = (int) Math.sqrt((double) (i_746_ * i_746_ + i_744_ * i_744_ + i_745_ * i_745_));
					if (i_747_ <= 0)
						i_747_ = 1;
					i_745_ = 256 * i_745_ / i_747_;
					i_746_ = 256 * i_746_ / i_747_;
					i_744_ = i_744_ * 256 / i_747_;
					byte i_748_ = (((ModelDefinitions) class178).aByteArray1414 != null ? ((ModelDefinitions) class178).aByteArray1414[i_734_] : (byte) 0);
					if (i_748_ != 0) {
						if ((i_748_ ^ 0xffffffff) == -2) {
							Class372 class372 = class372s[i_734_] = new Class372();
							((Class372) class372).anInt3148 = i_745_;
							((Class372) class372).anInt3145 = i_744_;
							((Class372) class372).anInt3146 = i_746_;
						}
					} else {
						Class286 class286 = class286s[i_735_];
						((Class286) class286).anInt2181++;
						((Class286) class286).anInt2184 += i_745_;
						((Class286) class286).anInt2183 += i_746_;
						((Class286) class286).anInt2180 += i_744_;
						class286 = class286s[i_736_];
						((Class286) class286).anInt2181++;
						((Class286) class286).anInt2180 += i_744_;
						((Class286) class286).anInt2184 += i_745_;
						((Class286) class286).anInt2183 += i_746_;
						class286 = class286s[i_737_];
						((Class286) class286).anInt2181++;
						((Class286) class286).anInt2180 += i_744_;
						((Class286) class286).anInt2183 += i_746_;
						((Class286) class286).anInt2184 += i_745_;
					}
				}
				for (int i_749_ = 0; i_749_ < anInt4853; i_749_++) {
					int i_750_ = is[i_749_];
					int i_751_ = (0xffff & ((ModelDefinitions) class178).aShortArray1415[i_750_]);
					int i_752_;
					if (((ModelDefinitions) class178).aByteArray1420 != null)
						i_752_ = ((ModelDefinitions) class178).aByteArray1420[i_750_];
					else
						i_752_ = -1;
					int i_753_;
					if (((ModelDefinitions) class178).aByteArray1411 == null)
						i_753_ = 0;
					else
						i_753_ = 0xff & (((ModelDefinitions) class178).aByteArray1411[i_750_]);
					short i_754_ = (((ModelDefinitions) class178).aShortArray1409 == null ? (short) -1 : ((ModelDefinitions) class178).aShortArray1409[i_750_]);
					if (i_754_ != -1 && (0x40 & anInt4837 ^ 0xffffffff) != -1) {
						Class238 class238 = var_d.method11(i_754_ & 0xffff, -28755);
						if (((Class238) class238).aBoolean1825)
							i_754_ = (short) -1;
					}
					float f = 0.0F;
					float f_755_ = 0.0F;
					float f_756_ = 0.0F;
					float f_757_ = 0.0F;
					float f_758_ = 0.0F;
					float f_759_ = 0.0F;
					int i_760_ = 0;
					int i_761_ = 0;
					int i_762_ = 0;
					if (i_754_ != -1) {
						if ((i_752_ ^ 0xffffffff) == 0) {
							f_758_ = 0.0F;
							f_755_ = 1.0F;
							f_756_ = 1.0F;
							f = 0.0F;
							f_757_ = 1.0F;
							i_761_ = 2;
							f_759_ = 0.0F;
							i_760_ = 1;
						} else {
							i_752_ &= 0xff;
							byte i_763_ = ((ModelDefinitions) class178).aByteArray1388[i_752_];
							if (i_763_ == 0) {
								short i_764_ = (((ModelDefinitions) class178).aShortArray1393[i_750_]);
								short i_765_ = (((ModelDefinitions) class178).aShortArray1410[i_750_]);
								short i_766_ = (((ModelDefinitions) class178).aShortArray1392[i_750_]);
								short i_767_ = (((ModelDefinitions) class178).aShortArray1403[i_752_]);
								short i_768_ = (((ModelDefinitions) class178).aShortArray1421[i_752_]);
								short i_769_ = (((ModelDefinitions) class178).aShortArray1385[i_752_]);
								float f_770_ = (float) (((ModelDefinitions) class178).anIntArray1416[i_767_]);
								float f_771_ = (float) (((ModelDefinitions) class178).anIntArray1400[i_767_]);
								float f_772_ = (float) (((ModelDefinitions) class178).anIntArray1418[i_767_]);
								float f_773_ = (-f_770_ + (float) (((ModelDefinitions) class178).anIntArray1416[i_768_]));
								float f_774_ = (-f_771_ + (float) (((ModelDefinitions) class178).anIntArray1400[i_768_]));
								float f_775_ = ((float) (((ModelDefinitions) class178).anIntArray1418[i_768_]) - f_772_);
								float f_776_ = ((float) (((ModelDefinitions) class178).anIntArray1416[i_769_]) - f_770_);
								float f_777_ = ((float) (((ModelDefinitions) class178).anIntArray1400[i_769_]) - f_771_);
								float f_778_ = ((float) (((ModelDefinitions) class178).anIntArray1418[i_769_]) - f_772_);
								float f_779_ = ((float) (((ModelDefinitions) class178).anIntArray1416[i_764_]) - f_770_);
								float f_780_ = (-f_771_ + (float) (((ModelDefinitions) class178).anIntArray1400[i_764_]));
								float f_781_ = ((float) (((ModelDefinitions) class178).anIntArray1418[i_764_]) - f_772_);
								float f_782_ = ((float) (((ModelDefinitions) class178).anIntArray1416[i_765_]) - f_770_);
								float f_783_ = ((float) (((ModelDefinitions) class178).anIntArray1400[i_765_]) - f_771_);
								float f_784_ = (-f_772_ + (float) (((ModelDefinitions) class178).anIntArray1418[i_765_]));
								float f_785_ = (-f_770_ + (float) (((ModelDefinitions) class178).anIntArray1416[i_766_]));
								float f_786_ = ((float) (((ModelDefinitions) class178).anIntArray1400[i_766_]) - f_771_);
								float f_787_ = (-f_772_ + (float) (((ModelDefinitions) class178).anIntArray1418[i_766_]));
								float f_788_ = -(f_775_ * f_777_) + f_778_ * f_774_;
								float f_789_ = -(f_773_ * f_778_) + f_776_ * f_775_;
								float f_790_ = -(f_776_ * f_774_) + f_773_ * f_777_;
								float f_791_ = f_777_ * f_790_ - f_778_ * f_789_;
								float f_792_ = f_778_ * f_788_ - f_790_ * f_776_;
								float f_793_ = f_789_ * f_776_ - f_777_ * f_788_;
								float f_794_ = 1.0F / (f_793_ * f_775_ + (f_773_ * f_791_ + f_774_ * f_792_));
								f = ((f_781_ * f_793_ + (f_792_ * f_780_ + f_791_ * f_779_)) * f_794_);
								f_758_ = f_794_ * (f_791_ * f_785_ + f_792_ * f_786_ + f_787_ * f_793_);
								f_756_ = f_794_ * (f_793_ * f_784_ + (f_783_ * f_792_ + f_782_ * f_791_));
								f_792_ = f_775_ * f_788_ - f_773_ * f_790_;
								f_793_ = -(f_774_ * f_788_) + f_773_ * f_789_;
								f_791_ = f_774_ * f_790_ - f_775_ * f_789_;
								f_794_ = 1.0F / (f_778_ * f_793_ + (f_776_ * f_791_ + f_777_ * f_792_));
								f_759_ = f_794_ * (f_793_ * f_787_ + (f_786_ * f_792_ + f_791_ * f_785_));
								f_755_ = (f_779_ * f_791_ + f_780_ * f_792_ + f_781_ * f_793_) * f_794_;
								f_757_ = (f_783_ * f_792_ + f_791_ * f_782_ + f_784_ * f_793_) * f_794_;
							} else {
								short i_795_ = (((ModelDefinitions) class178).aShortArray1393[i_750_]);
								short i_796_ = (((ModelDefinitions) class178).aShortArray1410[i_750_]);
								short i_797_ = (((ModelDefinitions) class178).aShortArray1392[i_750_]);
								int i_798_ = (((Class250) class250).anIntArray1911[i_752_]);
								int i_799_ = (((Class250) class250).anIntArray1915[i_752_]);
								int i_800_ = (((Class250) class250).anIntArray1912[i_752_]);
								float[] fs = (((Class250) class250).aFloatArrayArray1910[i_752_]);
								byte i_801_ = (((ModelDefinitions) class178).aByteArray1399[i_752_]);
								float f_802_ = ((float) (((ModelDefinitions) class178).anIntArray1412[i_752_]) / 256.0F);
								if (i_763_ == 1) {
									float f_803_ = ((float) (((ModelDefinitions) class178).anIntArray1390[i_752_]) / 1024.0F);
									Class98_Sub37.method1460((((ModelDefinitions) class178).anIntArray1416[i_795_]), i_800_, 8, (((ModelDefinitions) class178).anIntArray1418[i_795_]), i_799_, (((ModelDefinitions) class178).anIntArray1400[i_795_]), fs, f_803_, i_801_, i_798_, f_802_, Class28.aFloatArray294);
									f_755_ = Class28.aFloatArray294[1];
									f = Class28.aFloatArray294[0];
									Class98_Sub37.method1460((((ModelDefinitions) class178).anIntArray1416[i_796_]), i_800_, 8, (((ModelDefinitions) class178).anIntArray1418[i_796_]), i_799_, (((ModelDefinitions) class178).anIntArray1400[i_796_]), fs, f_803_, i_801_, i_798_, f_802_, Class28.aFloatArray294);
									f_757_ = Class28.aFloatArray294[1];
									f_756_ = Class28.aFloatArray294[0];
									Class98_Sub37.method1460((((ModelDefinitions) class178).anIntArray1416[i_797_]), i_800_, 8, (((ModelDefinitions) class178).anIntArray1418[i_797_]), i_799_, (((ModelDefinitions) class178).anIntArray1400[i_797_]), fs, f_803_, i_801_, i_798_, f_802_, Class28.aFloatArray294);
									f_758_ = Class28.aFloatArray294[0];
									f_759_ = Class28.aFloatArray294[1];
									float f_804_ = f_803_ / 2.0F;
									if ((0x1 & i_801_ ^ 0xffffffff) == -1) {
										if (!(-f + f_756_ > f_804_)) {
											if (f - f_756_ > f_804_) {
												f_756_ += f_803_;
												i_760_ = 2;
											}
										} else {
											i_760_ = 1;
											f_756_ -= f_803_;
										}
										if (-f + f_758_ > f_804_) {
											i_761_ = 1;
											f_758_ -= f_803_;
										} else if (f - f_758_ > f_804_) {
											i_761_ = 2;
											f_758_ += f_803_;
										}
									} else {
										if (f_759_ - f_755_ > f_804_) {
											f_759_ -= f_803_;
											i_761_ = 1;
										} else if (f_804_ < -f_759_ + f_755_) {
											i_761_ = 2;
											f_759_ += f_803_;
										}
										if (!(f_757_ - f_755_ > f_804_)) {
											if (f_804_ < f_755_ - f_757_) {
												i_760_ = 2;
												f_757_ += f_803_;
											}
										} else {
											f_757_ -= f_803_;
											i_760_ = 1;
										}
									}
								} else if ((i_763_ ^ 0xffffffff) != -3) {
									if ((i_763_ ^ 0xffffffff) == -4) {
										Collision.method2943(Class28.aFloatArray294, (((ModelDefinitions) class178).anIntArray1400[i_795_]), i_801_, i_800_, fs, (((ModelDefinitions) class178).anIntArray1418[i_795_]), i_799_, f_802_, (((ModelDefinitions) class178).anIntArray1416[i_795_]), i_798_, 113);
										f = Class28.aFloatArray294[0];
										f_755_ = Class28.aFloatArray294[1];
										Collision.method2943(Class28.aFloatArray294, (((ModelDefinitions) class178).anIntArray1400[i_796_]), i_801_, i_800_, fs, (((ModelDefinitions) class178).anIntArray1418[i_796_]), i_799_, f_802_, (((ModelDefinitions) class178).anIntArray1416[i_796_]), i_798_, 102);
										f_756_ = Class28.aFloatArray294[0];
										f_757_ = Class28.aFloatArray294[1];
										Collision.method2943(Class28.aFloatArray294, (((ModelDefinitions) class178).anIntArray1400[i_797_]), i_801_, i_800_, fs, (((ModelDefinitions) class178).anIntArray1418[i_797_]), i_799_, f_802_, (((ModelDefinitions) class178).anIntArray1416[i_797_]), i_798_, 125);
										f_759_ = Class28.aFloatArray294[1];
										f_758_ = Class28.aFloatArray294[0];
										if ((0x1 & i_801_) == 0) {
											if (f_756_ - f > 0.5F) {
												i_760_ = 1;
												f_756_--;
											} else if (-f_756_ + f > 0.5F) {
												i_760_ = 2;
												f_756_++;
											}
											if (-f + f_758_ > 0.5F) {
												f_758_--;
												i_761_ = 1;
											} else if (f - f_758_ > 0.5F) {
												i_761_ = 2;
												f_758_++;
											}
										} else {
											if (!(-f_755_ + f_759_ > 0.5F)) {
												if (-f_759_ + f_755_ > 0.5F) {
													f_759_++;
													i_761_ = 2;
												}
											} else {
												i_761_ = 1;
												f_759_--;
											}
											if (f_757_ - f_755_ > 0.5F) {
												i_760_ = 1;
												f_757_--;
											} else if (f_755_ - f_757_ > 0.5F) {
												i_760_ = 2;
												f_757_++;
											}
										}
									}
								} else {
									float f_805_ = ((float) (((ModelDefinitions) class178).anIntArray1397[i_752_]) / 256.0F);
									float f_806_ = ((float) (((ModelDefinitions) class178).anIntArray1386[i_752_]) / 256.0F);
									int i_807_ = ((((ModelDefinitions) class178).anIntArray1416[i_796_]) - (((ModelDefinitions) class178).anIntArray1416[i_795_]));
									int i_808_ = ((((ModelDefinitions) class178).anIntArray1400[i_796_]) + -(((ModelDefinitions) class178).anIntArray1400[i_795_]));
									int i_809_ = ((((ModelDefinitions) class178).anIntArray1418[i_796_]) + -(((ModelDefinitions) class178).anIntArray1418[i_795_]));
									int i_810_ = (-(((ModelDefinitions) class178).anIntArray1416[i_795_]) + (((ModelDefinitions) class178).anIntArray1416[i_797_]));
									int i_811_ = ((((ModelDefinitions) class178).anIntArray1400[i_797_]) + -(((ModelDefinitions) class178).anIntArray1400[i_795_]));
									int i_812_ = ((((ModelDefinitions) class178).anIntArray1418[i_797_]) + -(((ModelDefinitions) class178).anIntArray1418[i_795_]));
									int i_813_ = i_812_ * i_808_ + -(i_809_ * i_811_);
									int i_814_ = i_809_ * i_810_ + -(i_807_ * i_812_);
									int i_815_ = -(i_808_ * i_810_) + i_807_ * i_811_;
									float f_816_ = (64.0F / (float) (((ModelDefinitions) class178).anIntArray1389[i_752_]));
									float f_817_ = (64.0F / (float) (((ModelDefinitions) class178).anIntArray1404[i_752_]));
									float f_818_ = (64.0F / (float) (((ModelDefinitions) class178).anIntArray1390[i_752_]));
									float f_819_ = (((float) i_815_ * fs[2] + ((float) i_813_ * fs[0] + fs[1] * (float) i_814_)) / f_816_);
									float f_820_ = (((float) i_813_ * fs[3] + fs[4] * (float) i_814_ + (float) i_815_ * fs[5]) / f_817_);
									float f_821_ = ((fs[7] * (float) i_814_ + (float) i_813_ * fs[6] + (float) i_815_ * fs[8]) / f_818_);
									i_762_ = Class69.method696(f_819_, f_821_, (byte) -92, f_820_);
									Class48_Sub1_Sub1.method461((((ModelDefinitions) class178).anIntArray1400[i_795_]), f_806_, i_801_, i_799_, f_802_, 119, f_805_, fs, i_762_, Class28.aFloatArray294, i_800_, (((ModelDefinitions) class178).anIntArray1418[i_795_]), i_798_, (((ModelDefinitions) class178).anIntArray1416[i_795_]));
									f = Class28.aFloatArray294[0];
									f_755_ = Class28.aFloatArray294[1];
									Class48_Sub1_Sub1.method461((((ModelDefinitions) class178).anIntArray1400[i_796_]), f_806_, i_801_, i_799_, f_802_, 116, f_805_, fs, i_762_, Class28.aFloatArray294, i_800_, (((ModelDefinitions) class178).anIntArray1418[i_796_]), i_798_, (((ModelDefinitions) class178).anIntArray1416[i_796_]));
									f_756_ = Class28.aFloatArray294[0];
									f_757_ = Class28.aFloatArray294[1];
									Class48_Sub1_Sub1.method461((((ModelDefinitions) class178).anIntArray1400[i_797_]), f_806_, i_801_, i_799_, f_802_, 111, f_805_, fs, i_762_, Class28.aFloatArray294, i_800_, (((ModelDefinitions) class178).anIntArray1418[i_797_]), i_798_, (((ModelDefinitions) class178).anIntArray1416[i_797_]));
									f_758_ = Class28.aFloatArray294[0];
									f_759_ = Class28.aFloatArray294[1];
								}
							}
						}
					}
					byte i_822_;
					if (((ModelDefinitions) class178).aByteArray1414 != null)
						i_822_ = ((ModelDefinitions) class178).aByteArray1414[i_750_];
					else
						i_822_ = (byte) 0;
					if (i_822_ == 0) {
						long l = ((((long) (i_762_ << 1989611512) - -(long) (i_751_ << 1846998088) + (long) i_753_) << -1370244896) + (long) (i_752_ << 702412290));
						short i_823_ = ((ModelDefinitions) class178).aShortArray1393[i_750_];
						short i_824_ = ((ModelDefinitions) class178).aShortArray1410[i_750_];
						short i_825_ = ((ModelDefinitions) class178).aShortArray1392[i_750_];
						Class286 class286 = class286s[i_823_];
						aShortArray4895[i_749_] = method2381((byte) 72, f_755_, i_823_, ((Class286) class286).anInt2181, ((Class286) class286).anInt2180, l, f, ((Class286) class286).anInt2184, class178, ((Class286) class286).anInt2183);
						class286 = class286s[i_824_];
						aShortArray4852[i_749_] = method2381((byte) 68, f_757_, i_824_, ((Class286) class286).anInt2181, ((Class286) class286).anInt2180, l + (long) i_760_, f_756_, ((Class286) class286).anInt2184, class178, ((Class286) class286).anInt2183);
						class286 = class286s[i_825_];
						aShortArray4878[i_749_] = method2381((byte) 93, f_759_, i_825_, ((Class286) class286).anInt2181, ((Class286) class286).anInt2180, l + (long) i_761_, f_758_, ((Class286) class286).anInt2184, class178, ((Class286) class286).anInt2183);
					} else if ((i_822_ ^ 0xffffffff) == -2) {
						Class372 class372 = class372s[i_750_];
						long l = ((long) ((256 + ((Class372) class372).anInt3146 << -872592426) + (((256 + ((Class372) class372).anInt3148) << 1126719788) + (((((Class372) class372).anInt3145 <= 0) ? 2048 : 1024) + (i_752_ << 1620530146)))) + ((long) i_753_ + ((long) (i_762_ << 690027832) - -(long) (i_751_ << 310122824)) << -484684768));
						aShortArray4895[i_749_] = method2381((byte) 43, f_755_, (((ModelDefinitions) class178).aShortArray1393[i_750_]), 0, ((Class372) class372).anInt3145, l, f, ((Class372) class372).anInt3148, class178, ((Class372) class372).anInt3146);
						aShortArray4852[i_749_] = method2381((byte) 83, f_757_, (((ModelDefinitions) class178).aShortArray1410[i_750_]), 0, ((Class372) class372).anInt3145, l + (long) i_760_, f_756_, ((Class372) class372).anInt3148, class178, ((Class372) class372).anInt3146);
						aShortArray4878[i_749_] = method2381((byte) 74, f_759_, (((ModelDefinitions) class178).aShortArray1392[i_750_]), 0, ((Class372) class372).anInt3145, (long) i_761_ + l, f_758_, ((Class372) class372).anInt3148, class178, ((Class372) class372).anInt3146);
					}
					if (((ModelDefinitions) class178).aByteArray1411 != null)
						aByteArray4882[i_749_] = ((ModelDefinitions) class178).aByteArray1411[i_750_];
					if (((ModelDefinitions) class178).aShortArray1394 != null)
						aShortArray4864[i_749_] = ((ModelDefinitions) class178).aShortArray1394[i_750_];
					aShortArray4842[i_749_] = ((ModelDefinitions) class178).aShortArray1415[i_750_];
					aShortArray4869[i_749_] = i_754_;
				}
				int i_826_ = 0;
				short i_827_ = -10000;
				for (int i_828_ = 0; anInt4896 > i_828_; i_828_++) {
					short i_829_ = aShortArray4869[i_828_];
					if ((i_829_ ^ 0xffffffff) != (i_827_ ^ 0xffffffff)) {
						i_827_ = i_829_;
						i_826_++;
					}
				}
				anIntArray4850 = new int[i_826_ + 1];
				i_826_ = 0;
				i_827_ = (short) -10000;
				for (int i_830_ = 0; (anInt4896 ^ 0xffffffff) < (i_830_ ^ 0xffffffff); i_830_++) {
					short i_831_ = aShortArray4869[i_830_];
					if (i_827_ != i_831_) {
						i_827_ = i_831_;
						anIntArray4850[i_826_++] = i_830_;
					}
				}
				anIntArray4850[i_826_] = anInt4896;
				Class151_Sub1.aLongArray4970 = null;
				aShortArray4860 = Class123.method2209(anInt4846, 21119, aShortArray4860);
				aShortArray4884 = Class123.method2209(anInt4846, 21119, aShortArray4884);
				aShortArray4849 = Class123.method2209(anInt4846, 21119, aShortArray4849);
				aByteArray4858 = Class183.method2622(aByteArray4858, (byte) -109, anInt4846);
				aFloatArray4897 = Class59.method526((byte) -64, anInt4846, aFloatArray4897);
				aFloatArray4890 = Class59.method526((byte) -64, anInt4846, aFloatArray4890);
				if (((ModelDefinitions) class178).anIntArray1417 != null && Class111.method2095(anInt4837, i, (byte) -96))
					anIntArrayArray4888 = class178.method2595(91, false);
				if (((ModelDefinitions) class178).aClass106Array1419 != null && Class64.method555(anInt4837, i, -56))
					anIntArrayArray4875 = class178.method2596(21517);
				if (((ModelDefinitions) class178).anIntArray1395 == null || !Class98_Sub46_Sub9.method1554(i, 22251, anInt4837))
					break;
				int i_832_ = 0;
				int[] is_833_ = new int[256];
				for (int i_834_ = 0; (i_834_ ^ 0xffffffff) > (anInt4853 ^ 0xffffffff); i_834_++) {
					int i_835_ = ((ModelDefinitions) class178).anIntArray1395[is[i_834_]];
					if (i_835_ >= 0) {
						if (i_835_ > i_832_)
							i_832_ = i_835_;
						is_833_[i_835_]++;
					}
				}
				anIntArrayArray4870 = new int[i_832_ + 1][];
				for (int i_836_ = 0; (i_832_ ^ 0xffffffff) <= (i_836_ ^ 0xffffffff); i_836_++) {
					anIntArrayArray4870[i_836_] = new int[is_833_[i_836_]];
					is_833_[i_836_] = 0;
				}
				for (int i_837_ = 0; anInt4853 > i_837_; i_837_++) {
					int i_838_ = ((ModelDefinitions) class178).anIntArray1395[is[i_837_]];
					if (i_838_ >= 0)
						anIntArrayArray4870[i_838_][is_833_[i_838_]++] = i_837_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ln.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + (class178 != null ? "{...}" : "null") + ',' + i + ',' + i_710_ + ',' + i_711_ + ',' + i_712_ + ')'));
			}
			break;
		} while (false);
	}
}
