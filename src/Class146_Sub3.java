/* Class146_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class146_Sub3 extends AbstractModel {
	private ha_Sub3 aHa_Sub3_4899;
	static OutgoingOpcode aClass171_4900 = new OutgoingOpcode(52, 1);
	private short[] aShortArray4901;
	private short aShort4902;
	private int[][] anIntArrayArray4903;
	private short[] aShortArray4904;
	private short aShort4905;
	private int[] anIntArray4906;
	private int[] anIntArray4907;
	private boolean aBoolean4908;
	private int anInt4909 = 0;
	private int anInt4910;
	private int anInt4911;
	private int anInt4912;
	private Class181[] aClass181Array4913;
	private float[] aFloatArray4914;
	private short[] aShortArray4915;
	private boolean aBoolean4916;
	private short[] aShortArray4917;
	private int[] anIntArray4918;
	private Class35[] aClass35Array4919;
	private Class189 aClass189_4920;
	private int anInt4921;
	private boolean aBoolean4922 = false;
	private Class168 aClass168_4923;
	private int anInt4924;
	private int[][] anIntArrayArray4925;
	static boolean aBoolean4926 = false;
	private Class189 aClass189_4927;
	private byte[] aByteArray4928;
	private int anInt4929;
	private Class189 aClass189_4930;
	private Class18 aClass18_4931;
	private int[] anIntArray4932;
	private Class189 aClass189_4933;
	private int[][] anIntArrayArray4934;
	private int[] anIntArray4935;
	private int anInt4936;
	private int anInt4937;
	private boolean aBoolean4938;
	private int anInt4939;
	private boolean aBoolean4940;
	private Class281[] aClass281Array4941;
	private int anInt4942;
	private int anInt4943;
	private short[] aShortArray4944;
	private int[] anIntArray4945;
	private short[] aShortArray4946;
	private short[] aShortArray4947;
	private int anInt4948;
	static Class213 aClass213_4949;
	private int anInt4950;
	private Class87[] aClass87Array4951;
	static Map aClass305_Sub1_4952;
	private short[] aShortArray4953;
	private short[] aShortArray4954;
	private float[] aFloatArray4955;
	private int anInt4956;
	private short[] aShortArray4957;
	private byte[] aByteArray4958;
	private int[] anIntArray4959;
	private short[] aShortArray4960;
	private short[] aShortArray4961;
	private short[] aShortArray4962;
	private int anInt4963;

	private final void method2392(int i) {
		try {
			if (aClass189_4920 != null)
				((Class189) aClass189_4920).aBoolean1458 = false;
			int i_0_ = -64 % ((10 - i) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.K(" + i + ')');
		}
	}

	final int fa() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4956;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.fa(" + ')');
		}
	}

	final void method2325(Class111 class111, Class246_Sub6 class246_sub6, int i) {
		try {
			if (anInt4936 != 0) {
				Class111_Sub3 class111_sub3 = ((ha_Sub3) aHa_Sub3_4899).aClass111_Sub3_4543;
				if (!aBoolean4922)
					method2401(-21065);
				Class111_Sub3 class111_sub3_1_ = (Class111_Sub3) class111;
				Class64_Sub18.aFloat3691 = ((((Class111_Sub3) class111_sub3).aFloat4713 * ((Class111_Sub3) class111_sub3_1_).aFloat4706) + (((Class111_Sub3) class111_sub3).aFloat4708 * ((Class111_Sub3) class111_sub3_1_).aFloat4711) + (((Class111_Sub3) class111_sub3_1_).aFloat4713 * ((Class111_Sub3) class111_sub3).aFloat4704));
				Class322.aFloat2712 = (((Class111_Sub3) class111_sub3).aFloat4703 + ((((Class111_Sub3) class111_sub3_1_).aFloat4702 * ((Class111_Sub3) class111_sub3).aFloat4708) + (((Class111_Sub3) class111_sub3_1_).aFloat4709 * ((Class111_Sub3) class111_sub3).aFloat4713) + (((Class111_Sub3) class111_sub3_1_).aFloat4703 * ((Class111_Sub3) class111_sub3).aFloat4704)));
				float f = (Class322.aFloat2712 + (float) anInt4956 * Class64_Sub18.aFloat3691);
				float f_2_ = ((float) anInt4950 * Class64_Sub18.aFloat3691 + Class322.aFloat2712);
				float f_3_;
				float f_4_;
				if (f > f_2_) {
					f_3_ = (float) -anInt4939 + f_2_;
					f_4_ = f + (float) anInt4939;
				} else {
					f_3_ = (float) -anInt4939 + f;
					f_4_ = f_2_ + (float) anInt4939;
				}
				if (!(f_3_ >= ((ha_Sub3) aHa_Sub3_4899).aFloat4568) && !(f_4_ <= (float) ((ha_Sub3) aHa_Sub3_4899).anInt4640)) {
					Class98_Sub43_Sub2.aFloat5909 = (((Class111_Sub3) class111_sub3).aFloat4702 + ((((Class111_Sub3) class111_sub3_1_).aFloat4703 * ((Class111_Sub3) class111_sub3).aFloat4705) + ((((Class111_Sub3) class111_sub3_1_).aFloat4709 * ((Class111_Sub3) class111_sub3).aFloat4711) + ((((Class111_Sub3) class111_sub3_1_).aFloat4702) * (((Class111_Sub3) class111_sub3).aFloat4712)))));
					Class98_Sub42.aFloat4234 = ((((Class111_Sub3) class111_sub3_1_).aFloat4713 * ((Class111_Sub3) class111_sub3).aFloat4705) + ((((Class111_Sub3) class111_sub3).aFloat4711 * ((Class111_Sub3) class111_sub3_1_).aFloat4706) + (((Class111_Sub3) class111_sub3_1_).aFloat4711 * (((Class111_Sub3) class111_sub3).aFloat4712))));
					float f_5_ = (Class98_Sub42.aFloat4234 * (float) anInt4956 + Class98_Sub43_Sub2.aFloat5909);
					float f_6_ = (Class98_Sub42.aFloat4234 * (float) anInt4950 + Class98_Sub43_Sub2.aFloat5909);
					float f_7_;
					float f_8_;
					if (!(f_6_ < f_5_)) {
						f_7_ = ((f_6_ + (float) anInt4939) * (float) ((ha_Sub3) aHa_Sub3_4899).anInt4593);
						f_8_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4593 * ((float) -anInt4939 + f_5_));
					} else {
						f_7_ = ((f_5_ + (float) anInt4939) * (float) ((ha_Sub3) aHa_Sub3_4899).anInt4593);
						f_8_ = ((f_6_ - (float) anInt4939) * (float) ((ha_Sub3) aHa_Sub3_4899).anInt4593);
					}
					if (!(((ha_Sub3) aHa_Sub3_4899).aFloat4647 <= f_8_ / f_4_) && !(((ha_Sub3) aHa_Sub3_4899).aFloat4641 >= f_7_ / f_4_)) {
						Class366.aFloat3120 = ((((Class111_Sub3) class111_sub3).aFloat4714 * (((Class111_Sub3) class111_sub3_1_).aFloat4711)) + (((Class111_Sub3) class111_sub3).aFloat4706 * (((Class111_Sub3) class111_sub3_1_).aFloat4706)) + (((Class111_Sub3) class111_sub3_1_).aFloat4713 * (((Class111_Sub3) class111_sub3).aFloat4710)));
						Class339_Sub1.aFloat5316 = (((Class111_Sub3) class111_sub3).aFloat4709 + (((((Class111_Sub3) class111_sub3_1_).aFloat4703) * (((Class111_Sub3) class111_sub3).aFloat4710)) + (((((Class111_Sub3) class111_sub3_1_).aFloat4702) * (((Class111_Sub3) class111_sub3).aFloat4714)) + ((((Class111_Sub3) class111_sub3).aFloat4706) * (((Class111_Sub3) class111_sub3_1_).aFloat4709)))));
						float f_9_ = (Class339_Sub1.aFloat5316 + (float) anInt4956 * Class366.aFloat3120);
						float f_10_ = (Class339_Sub1.aFloat5316 + Class366.aFloat3120 * (float) anInt4950);
						float f_11_;
						float f_12_;
						if (!(f_10_ < f_9_)) {
							f_11_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4589 * (f_9_ - (float) anInt4939));
							f_12_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4589 * ((float) anInt4939 + f_10_));
						} else {
							f_11_ = ((f_10_ - (float) anInt4939) * (float) (((ha_Sub3) aHa_Sub3_4899).anInt4589));
							f_12_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4589 * ((float) anInt4939 + f_9_));
						}
						if (!(((ha_Sub3) aHa_Sub3_4899).aFloat4584 <= f_11_ / f_4_) && !(((ha_Sub3) aHa_Sub3_4899).aFloat4610 >= f_12_ / f_4_)) {
							if (class246_sub6 != null || aClass281Array4941 != null) {
								Class373_Sub2.aFloat5472 = (((((Class111_Sub3) class111_sub3).aFloat4712) * (((Class111_Sub3) class111_sub3_1_).aFloat4705)) + ((((Class111_Sub3) class111_sub3_1_).aFloat4710) * (((Class111_Sub3) class111_sub3).aFloat4711)) + ((((Class111_Sub3) class111_sub3_1_).aFloat4704) * (((Class111_Sub3) class111_sub3).aFloat4705)));
								Class64_Sub17.aFloat3686 = (((((Class111_Sub3) class111_sub3).aFloat4708) * (((Class111_Sub3) class111_sub3_1_).aFloat4712)) + ((((Class111_Sub3) class111_sub3_1_).aFloat4714) * (((Class111_Sub3) class111_sub3).aFloat4713)) + ((((Class111_Sub3) class111_sub3_1_).aFloat4708) * (((Class111_Sub3) class111_sub3).aFloat4704)));
								Canvas_Sub1.aFloat25 = (((((Class111_Sub3) class111_sub3).aFloat4711) * (((Class111_Sub3) class111_sub3_1_).aFloat4714)) + ((((Class111_Sub3) class111_sub3_1_).aFloat4712) * (((Class111_Sub3) class111_sub3).aFloat4712)) + ((((Class111_Sub3) class111_sub3).aFloat4705) * (((Class111_Sub3) class111_sub3_1_).aFloat4708)));
								GameInterface.aFloat3948 = (((((Class111_Sub3) class111_sub3).aFloat4706) * (((Class111_Sub3) class111_sub3_1_).aFloat4714)) + ((((Class111_Sub3) class111_sub3).aFloat4714) * (((Class111_Sub3) class111_sub3_1_).aFloat4712)) + ((((Class111_Sub3) class111_sub3_1_).aFloat4708) * (((Class111_Sub3) class111_sub3).aFloat4710)));
								Class100.aFloat845 = (((((Class111_Sub3) class111_sub3_1_).aFloat4704) * (((Class111_Sub3) class111_sub3).aFloat4710)) + (((((Class111_Sub3) class111_sub3).aFloat4714) * ((Class111_Sub3) class111_sub3_1_).aFloat4705) + (((Class111_Sub3) class111_sub3_1_).aFloat4710 * (((Class111_Sub3) class111_sub3).aFloat4706))));
								Class134.aFloat3463 = (((((Class111_Sub3) class111_sub3).aFloat4713) * (((Class111_Sub3) class111_sub3_1_).aFloat4710)) + ((((Class111_Sub3) class111_sub3).aFloat4708) * (((Class111_Sub3) class111_sub3_1_).aFloat4705)) + ((((Class111_Sub3) class111_sub3).aFloat4704) * (((Class111_Sub3) class111_sub3_1_).aFloat4704)));
							}
							if (class246_sub6 != null) {
								boolean bool = false;
								boolean bool_13_ = true;
								int i_14_ = anInt4910 + anInt4924 >> -394601631;
								int i_15_ = anInt4937 + anInt4921 >> -732566495;
								int i_16_ = (int) ((Class373_Sub2.aFloat5472 * (float) i_15_) + (((float) anInt4956 * Class98_Sub42.aFloat4234) + (((float) i_14_ * Canvas_Sub1.aFloat25) + (Class98_Sub43_Sub2.aFloat5909))));
								int i_17_ = (int) (((float) anInt4956 * Class366.aFloat3120) + (Class339_Sub1.aFloat5316 + (GameInterface.aFloat3948 * (float) i_14_)) + ((float) i_15_ * Class100.aFloat845));
								int i_18_ = (int) (Class322.aFloat2712 + ((float) i_14_ * Class64_Sub17.aFloat3686) + ((float) anInt4956 * Class64_Sub18.aFloat3691) + ((float) i_15_ * Class134.aFloat3463));
								if ((i_18_ ^ 0xffffffff) > (((ha_Sub3) aHa_Sub3_4899).anInt4640 ^ 0xffffffff))
									bool = true;
								else {
									((Class246_Sub6) class246_sub6).anInt5111 = (((ha_Sub3) aHa_Sub3_4899).anInt4645 + (((ha_Sub3) aHa_Sub3_4899).anInt4593) * i_16_ / i_18_);
									((Class246_Sub6) class246_sub6).anInt5113 = (((ha_Sub3) aHa_Sub3_4899).anInt4587 + (((ha_Sub3) aHa_Sub3_4899).anInt4589) * i_17_ / i_18_);
								}
								int i_19_ = (int) ((Class373_Sub2.aFloat5472 * (float) i_15_) + (((float) i_14_ * Canvas_Sub1.aFloat25) + Class98_Sub43_Sub2.aFloat5909 + ((float) anInt4950 * (Class98_Sub42.aFloat4234))));
								int i_20_ = (int) ((float) i_15_ * Class100.aFloat845 + (((float) i_14_ * GameInterface.aFloat3948) + Class339_Sub1.aFloat5316 + ((float) anInt4950 * Class366.aFloat3120)));
								int i_21_ = (int) (((float) i_14_ * Class64_Sub17.aFloat3686) + Class322.aFloat2712 + ((float) anInt4950 * Class64_Sub18.aFloat3691) + ((float) i_15_ * Class134.aFloat3463));
								if ((i_21_ ^ 0xffffffff) > (((ha_Sub3) aHa_Sub3_4899).anInt4640 ^ 0xffffffff))
									bool = true;
								else {
									((Class246_Sub6) class246_sub6).anInt5110 = (((ha_Sub3) aHa_Sub3_4899).anInt4645 - -(i_19_ * (((ha_Sub3) aHa_Sub3_4899).anInt4593) / i_21_));
									((Class246_Sub6) class246_sub6).anInt5112 = (((ha_Sub3) aHa_Sub3_4899).anInt4587 - -((((ha_Sub3) aHa_Sub3_4899).anInt4589) * i_20_ / i_21_));
								}
								if (bool) {
									if ((((ha_Sub3) aHa_Sub3_4899).anInt4640 ^ 0xffffffff) < (i_18_ ^ 0xffffffff) && (((ha_Sub3) aHa_Sub3_4899).anInt4640 > i_21_))
										bool_13_ = false;
									else if (i_18_ < (((ha_Sub3) aHa_Sub3_4899).anInt4640)) {
										int i_22_ = ((i_21_ - (((ha_Sub3) aHa_Sub3_4899).anInt4640) << 328899056) / (-i_18_ + i_21_));
										int i_23_ = i_19_ + ((-i_16_ + i_19_) * i_22_ >> 829085296);
										int i_24_ = ((i_22_ * (i_20_ - i_17_) >> 530982992) + i_20_);
										((Class246_Sub6) class246_sub6).anInt5111 = ((i_23_ * (((ha_Sub3) aHa_Sub3_4899).anInt4593) / (((ha_Sub3) aHa_Sub3_4899).anInt4640)) + (((ha_Sub3) aHa_Sub3_4899).anInt4645));
										((Class246_Sub6) class246_sub6).anInt5113 = ((((ha_Sub3) aHa_Sub3_4899).anInt4587) + ((((ha_Sub3) aHa_Sub3_4899).anInt4589) * i_24_ / (((ha_Sub3) aHa_Sub3_4899).anInt4640)));
									} else if (((((ha_Sub3) aHa_Sub3_4899).anInt4640) ^ 0xffffffff) < (i_21_ ^ 0xffffffff)) {
										int i_25_ = ((-(((ha_Sub3) aHa_Sub3_4899).anInt4640) + i_18_ << -1759208752) / (i_18_ + -i_21_));
										int i_26_ = i_16_ + ((-i_19_ + i_16_) * i_25_ >> 20455536);
										((Class246_Sub6) class246_sub6).anInt5111 = (((((ha_Sub3) aHa_Sub3_4899).anInt4593) * i_26_ / (((ha_Sub3) aHa_Sub3_4899).anInt4640)) + (((ha_Sub3) aHa_Sub3_4899).anInt4645));
										int i_27_ = i_17_ - -(i_25_ * (-i_20_ + i_17_) >> 1506998864);
										((Class246_Sub6) class246_sub6).anInt5113 = ((((ha_Sub3) aHa_Sub3_4899).anInt4587) + ((((ha_Sub3) aHa_Sub3_4899).anInt4589) * i_27_ / (((ha_Sub3) aHa_Sub3_4899).anInt4640)));
									}
								}
								if (bool_13_) {
									if (i_21_ >= i_18_)
										((Class246_Sub6) class246_sub6).anInt5109 = ((((ha_Sub3) aHa_Sub3_4899).anInt4645) - (-((((ha_Sub3) aHa_Sub3_4899).anInt4593) * (i_19_ - -anInt4939) / i_21_) - -(((Class246_Sub6) class246_sub6).anInt5110)));
									else
										((Class246_Sub6) class246_sub6).anInt5109 = (-((Class246_Sub6) class246_sub6).anInt5111 + ((((ha_Sub3) aHa_Sub3_4899).anInt4593) * (i_16_ - -anInt4939) / i_18_) + (((ha_Sub3) aHa_Sub3_4899).anInt4645));
									((Class246_Sub6) class246_sub6).aBoolean5114 = true;
								}
							}
							aHa_Sub3_4899.method1976(-112);
							aHa_Sub3_4899.method2049(0, class111_sub3_1_);
							method2407(29084);
							method2393(-29619);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.D(" + (class111 != null ? "{...}" : "null") + ',' + (class246_sub6 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void C(int i) {
		try {
			aShort4902 = (short) i;
			method2392(105);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.C(" + i + ')');
		}
	}

	final boolean r() {
		try {
			return aBoolean4940;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.r(" + ')');
		}
	}

	private final void method2393(int i) {
		do {
			try {
				if (i != -29619)
					ua();
				if (aClass281Array4941 == null)
					break;
				aHa_Sub3_4899.C(!aBoolean4938);
				aHa_Sub3_4899.method1979(false, -71);
				aHa_Sub3_4899.method2051(1, -79, Class64_Sub16.aClass65_3681);
				aHa_Sub3_4899.method1953(-90, Class64_Sub16.aClass65_3681, 1);
				for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff); i_28_++) {
					Class281 class281 = aClass281Array4941[i_28_];
					Class181 class181 = aClass181Array4913[i_28_];
					if (!((Class281) class281).aBoolean2118 || !aHa_Sub3_4899.method1768()) {
						float f = ((float) ((anIntArray4906[((Class281) class281).anInt2120]) + ((anIntArray4906[((Class281) class281).anInt2122]) + (anIntArray4906[(((Class281) class281).anInt2115)]))) * 0.3333333F);
						float f_29_ = ((float) ((anIntArray4959[((Class281) class281).anInt2122]) + (anIntArray4959[((Class281) class281).anInt2120]) - -(anIntArray4959[((Class281) class281).anInt2115])) * 0.3333333F);
						float f_30_ = (0.3333333F * (float) ((anIntArray4935[((Class281) class281).anInt2115]) + (anIntArray4935[((Class281) class281).anInt2122]) - -(anIntArray4935[(((Class281) class281).anInt2120)])));
						float f_31_ = (Class98_Sub43_Sub2.aFloat5909 + (f_30_ * Class373_Sub2.aFloat5472 + (f_29_ * Class98_Sub42.aFloat4234 + Canvas_Sub1.aFloat25 * f)));
						float f_32_ = (Class339_Sub1.aFloat5316 + (f * GameInterface.aFloat3948 + Class366.aFloat3120 * f_29_ + Class100.aFloat845 * f_30_));
						float f_33_ = (Class134.aFloat3463 * f_30_ + (Class64_Sub17.aFloat3686 * f + Class64_Sub18.aFloat3691 * f_29_) + Class322.aFloat2712);
						float f_34_ = ((float) (1.0 / (Math.sqrt((double) (f_33_ * f_33_ + (f_31_ * f_31_ + f_32_ * f_32_))))) * (float) ((Class281) class281).anInt2116);
						Class111_Sub3 class111_sub3 = aHa_Sub3_4899.method1978((byte) 108);
						class111_sub3.method2131((f_31_ + (float) ((Class181) class181).anInt1426 - f_31_ * f_34_), false, ((((Class281) class281).aShort2123 * ((Class181) class181).anInt1429) >> -2068583673), ((((Class181) class181).anInt1425 * ((Class281) class281).aShort2119) >> -808665913), (f_32_ + (float) ((Class181) class181).anInt1427 - f_34_ * f_32_), -(f_33_ * f_34_) + f_33_, ((Class181) class181).anInt1431);
						class111_sub3.method2124(true, (((ha_Sub3) aHa_Sub3_4899).aClass111_Sub3_4544));
						aHa_Sub3_4899.method1935(1);
						int i_35_ = ((Class181) class181).anInt1428;
						aHa_Sub3_4899.method2039(false, 0, (((Class281) class281).aShort2114), false);
						aHa_Sub3_4899.method2001(((Class281) class281).aByte2113, 112);
						aHa_Sub3_4899.method1984(i + 29621, i_35_);
						aHa_Sub3_4899.method2002((byte) 96);
					}
				}
				aHa_Sub3_4899.method1953(-87, IncomingOpcode.aClass65_459, 1);
				aHa_Sub3_4899.method2051(1, i ^ 0x73dc, IncomingOpcode.aClass65_459);
				aHa_Sub3_4899.C(true);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qw.JA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void wa() {
		try {
			for (int i = 0; (anInt4929 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				anIntArray4906[i] = 7 + anIntArray4906[i] >> -1178229788;
				anIntArray4959[i] = 7 + anIntArray4959[i] >> 1103469156;
				anIntArray4935[i] = 7 + anIntArray4935[i] >> -1541879036;
			}
			method2410(-54);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.wa(" + ')');
		}
	}

	private final boolean method2394(int i, int i_36_, int i_37_, int i_38_, boolean bool, int i_39_, Class111 class111) {
		try {
			int i_40_ = -112 % ((-33 - i) / 57);
			Class111_Sub3 class111_sub3 = (Class111_Sub3) class111;
			Class111_Sub3 class111_sub3_41_ = ((ha_Sub3) aHa_Sub3_4899).aClass111_Sub3_4543;
			float f = (((Class111_Sub3) class111_sub3_41_).aFloat4702 + ((((Class111_Sub3) class111_sub3).aFloat4703 * ((Class111_Sub3) class111_sub3_41_).aFloat4705) + ((((Class111_Sub3) class111_sub3).aFloat4702 * ((Class111_Sub3) class111_sub3_41_).aFloat4712) + (((Class111_Sub3) class111_sub3_41_).aFloat4711 * ((Class111_Sub3) class111_sub3).aFloat4709))));
			float f_42_ = (((Class111_Sub3) class111_sub3_41_).aFloat4709 + ((((Class111_Sub3) class111_sub3_41_).aFloat4714 * ((Class111_Sub3) class111_sub3).aFloat4702) + (((Class111_Sub3) class111_sub3_41_).aFloat4706 * ((Class111_Sub3) class111_sub3).aFloat4709) + (((Class111_Sub3) class111_sub3_41_).aFloat4710 * ((Class111_Sub3) class111_sub3).aFloat4703)));
			Class366.aFloat3120 = ((((Class111_Sub3) class111_sub3).aFloat4706 * ((Class111_Sub3) class111_sub3_41_).aFloat4706) + (((Class111_Sub3) class111_sub3_41_).aFloat4714 * ((Class111_Sub3) class111_sub3).aFloat4711) + (((Class111_Sub3) class111_sub3_41_).aFloat4710 * ((Class111_Sub3) class111_sub3).aFloat4713));
			Class100.aFloat845 = ((((Class111_Sub3) class111_sub3_41_).aFloat4710 * ((Class111_Sub3) class111_sub3).aFloat4704) + ((((Class111_Sub3) class111_sub3_41_).aFloat4706 * ((Class111_Sub3) class111_sub3).aFloat4710) + (((Class111_Sub3) class111_sub3_41_).aFloat4714 * ((Class111_Sub3) class111_sub3).aFloat4705)));
			Class64_Sub17.aFloat3686 = ((((Class111_Sub3) class111_sub3_41_).aFloat4704 * ((Class111_Sub3) class111_sub3).aFloat4708) + ((((Class111_Sub3) class111_sub3_41_).aFloat4708 * ((Class111_Sub3) class111_sub3).aFloat4712) + (((Class111_Sub3) class111_sub3_41_).aFloat4713 * ((Class111_Sub3) class111_sub3).aFloat4714)));
			Class98_Sub42.aFloat4234 = ((((Class111_Sub3) class111_sub3).aFloat4713 * ((Class111_Sub3) class111_sub3_41_).aFloat4705) + ((((Class111_Sub3) class111_sub3).aFloat4706 * ((Class111_Sub3) class111_sub3_41_).aFloat4711) + (((Class111_Sub3) class111_sub3_41_).aFloat4712 * ((Class111_Sub3) class111_sub3).aFloat4711)));
			Class64_Sub18.aFloat3691 = ((((Class111_Sub3) class111_sub3_41_).aFloat4704 * ((Class111_Sub3) class111_sub3).aFloat4713) + ((((Class111_Sub3) class111_sub3).aFloat4711 * ((Class111_Sub3) class111_sub3_41_).aFloat4708) + (((Class111_Sub3) class111_sub3).aFloat4706 * ((Class111_Sub3) class111_sub3_41_).aFloat4713)));
			Class134.aFloat3463 = ((((Class111_Sub3) class111_sub3).aFloat4710 * ((Class111_Sub3) class111_sub3_41_).aFloat4713) + (((Class111_Sub3) class111_sub3).aFloat4705 * ((Class111_Sub3) class111_sub3_41_).aFloat4708) + (((Class111_Sub3) class111_sub3_41_).aFloat4704 * ((Class111_Sub3) class111_sub3).aFloat4704));
			Canvas_Sub1.aFloat25 = ((((Class111_Sub3) class111_sub3_41_).aFloat4705 * ((Class111_Sub3) class111_sub3).aFloat4708) + ((((Class111_Sub3) class111_sub3_41_).aFloat4712 * ((Class111_Sub3) class111_sub3).aFloat4712) + (((Class111_Sub3) class111_sub3_41_).aFloat4711 * ((Class111_Sub3) class111_sub3).aFloat4714)));
			float f_43_ = ((((Class111_Sub3) class111_sub3).aFloat4709 * ((Class111_Sub3) class111_sub3_41_).aFloat4713) + (((Class111_Sub3) class111_sub3).aFloat4702 * ((Class111_Sub3) class111_sub3_41_).aFloat4708) + (((Class111_Sub3) class111_sub3_41_).aFloat4704 * ((Class111_Sub3) class111_sub3).aFloat4703) + ((Class111_Sub3) class111_sub3_41_).aFloat4703);
			Class373_Sub2.aFloat5472 = ((((Class111_Sub3) class111_sub3).aFloat4704 * ((Class111_Sub3) class111_sub3_41_).aFloat4705) + ((((Class111_Sub3) class111_sub3).aFloat4705 * ((Class111_Sub3) class111_sub3_41_).aFloat4712) + (((Class111_Sub3) class111_sub3).aFloat4710 * ((Class111_Sub3) class111_sub3_41_).aFloat4711)));
			GameInterface.aFloat3948 = ((((Class111_Sub3) class111_sub3).aFloat4712 * ((Class111_Sub3) class111_sub3_41_).aFloat4714) + (((Class111_Sub3) class111_sub3).aFloat4714 * ((Class111_Sub3) class111_sub3_41_).aFloat4706) + (((Class111_Sub3) class111_sub3_41_).aFloat4710 * ((Class111_Sub3) class111_sub3).aFloat4708));
			boolean bool_44_ = false;
			float f_45_ = 3.4028235E38F;
			float f_46_ = -3.4028235E38F;
			float f_47_ = 3.4028235E38F;
			float f_48_ = -3.4028235E38F;
			int i_49_ = ((ha_Sub3) aHa_Sub3_4899).anInt4593;
			int i_50_ = ((ha_Sub3) aHa_Sub3_4899).anInt4589;
			if (!aBoolean4922)
				method2401(-21065);
			int i_51_ = -anInt4924 + anInt4910 >> -2118794815;
			int i_52_ = anInt4950 - anInt4956 >> 1361878209;
			int i_53_ = anInt4937 + -anInt4921 >> 1312818657;
			int i_54_ = i_51_ + anInt4924;
			int i_55_ = i_52_ + anInt4956;
			int i_56_ = anInt4921 + i_53_;
			int i_57_ = i_54_ - (i_51_ << i_39_);
			int i_58_ = -(i_52_ << i_39_) + i_55_;
			int i_59_ = i_56_ - (i_53_ << i_39_);
			int i_60_ = i_54_ + (i_51_ << i_39_);
			int i_61_ = i_55_ - -(i_52_ << i_39_);
			Class246_Sub3_Sub1_Sub2.anIntArray6245[0] = i_57_;
			int i_62_ = (i_53_ << i_39_) + i_56_;
			Class208.anIntArray1580[0] = i_58_;
			Class246_Sub3_Sub1_Sub2.anIntArray6245[1] = i_60_;
			Class253.anIntArray1931[0] = i_59_;
			Class208.anIntArray1580[1] = i_58_;
			Class246_Sub3_Sub1_Sub2.anIntArray6245[2] = i_57_;
			Class253.anIntArray1931[1] = i_59_;
			Class208.anIntArray1580[2] = i_61_;
			Class253.anIntArray1931[2] = i_59_;
			Class246_Sub3_Sub1_Sub2.anIntArray6245[3] = i_60_;
			Class208.anIntArray1580[3] = i_61_;
			Class246_Sub3_Sub1_Sub2.anIntArray6245[4] = i_57_;
			Class253.anIntArray1931[3] = i_59_;
			Class208.anIntArray1580[4] = i_58_;
			Class253.anIntArray1931[4] = i_62_;
			Class246_Sub3_Sub1_Sub2.anIntArray6245[5] = i_60_;
			Class208.anIntArray1580[5] = i_58_;
			Class253.anIntArray1931[5] = i_62_;
			Class246_Sub3_Sub1_Sub2.anIntArray6245[6] = i_57_;
			Class208.anIntArray1580[6] = i_61_;
			Class246_Sub3_Sub1_Sub2.anIntArray6245[7] = i_60_;
			Class253.anIntArray1931[6] = i_62_;
			Class208.anIntArray1580[7] = i_61_;
			Class253.anIntArray1931[7] = i_62_;
			for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > -9; i_63_++) {
				float f_64_ = (float) Class208.anIntArray1580[i_63_];
				float f_65_ = (float) Class246_Sub3_Sub1_Sub2.anIntArray6245[i_63_];
				float f_66_ = (float) Class253.anIntArray1931[i_63_];
				float f_67_ = (Class134.aFloat3463 * f_66_ + (Class64_Sub17.aFloat3686 * f_65_ + f_64_ * Class64_Sub18.aFloat3691) + f_43_);
				float f_68_ = (f_66_ * Class373_Sub2.aFloat5472 + (Class98_Sub42.aFloat4234 * f_64_ + Canvas_Sub1.aFloat25 * f_65_) + f);
				float f_69_ = (f_66_ * Class100.aFloat845 + (f_65_ * GameInterface.aFloat3948 + Class366.aFloat3120 * f_64_) + f_42_);
				if ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4640 <= f_67_) {
					if (i_37_ > 0)
						f_67_ = (float) i_37_;
					float f_70_ = (f_68_ * (float) i_49_ / f_67_ + (float) ((ha_Sub3) aHa_Sub3_4899).anInt4645);
					if (f_45_ > f_70_)
						f_45_ = f_70_;
					float f_71_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4587 + (float) i_50_ * f_69_ / f_67_);
					if (f_46_ < f_70_)
						f_46_ = f_70_;
					if (f_48_ < f_71_)
						f_48_ = f_71_;
					if (f_47_ > f_71_)
						f_47_ = f_71_;
					bool_44_ = true;
				}
			}
			if (bool_44_ && (float) i_36_ > f_45_ && f_46_ > (float) i_36_ && f_47_ < (float) i_38_ && f_48_ > (float) i_38_) {
				if (bool)
					return true;
				if ((anInt4936 ^ 0xffffffff) < (RuntimeException_Sub1.anIntArray3200.length ^ 0xffffffff)) {
					Class57.anIntArray458 = new int[anInt4936];
					RuntimeException_Sub1.anIntArray3200 = new int[anInt4936];
				}
				for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > (anInt4912 ^ 0xffffffff); i_72_++) {
					float f_73_ = (float) anIntArray4935[i_72_];
					float f_74_ = (float) anIntArray4906[i_72_];
					float f_75_ = (float) anIntArray4959[i_72_];
					float f_76_ = (f_75_ * Class64_Sub18.aFloat3691 + Class64_Sub17.aFloat3686 * f_74_ + Class134.aFloat3463 * f_73_ + f_43_);
					float f_77_ = f + (f_75_ * Class98_Sub42.aFloat4234 + f_74_ * Canvas_Sub1.aFloat25 + f_73_ * Class373_Sub2.aFloat5472);
					float f_78_ = (f_73_ * Class100.aFloat845 + (GameInterface.aFloat3948 * f_74_ + Class366.aFloat3120 * f_75_) + f_42_);
					if (f_76_ >= (float) ((ha_Sub3) aHa_Sub3_4899).anInt4640) {
						if (i_37_ > 0)
							f_76_ = (float) i_37_;
						int i_79_ = (int) ((float) i_49_ * f_77_ / f_76_ + (float) (((ha_Sub3) aHa_Sub3_4899).anInt4645));
						int i_80_ = (int) (f_78_ * (float) i_50_ / f_76_ + (float) (((ha_Sub3) aHa_Sub3_4899).anInt4587));
						int i_81_ = anIntArray4932[i_72_];
						int i_82_ = anIntArray4932[i_72_ - -1];
						for (int i_83_ = i_81_; (i_83_ ^ 0xffffffff) > (i_82_ ^ 0xffffffff); i_83_++) {
							int i_84_ = aShortArray4960[i_83_] + -1;
							if (i_84_ == -1)
								break;
							RuntimeException_Sub1.anIntArray3200[i_84_] = i_79_;
							Class57.anIntArray458[i_84_] = i_80_;
						}
					} else {
						int i_85_ = anIntArray4932[i_72_];
						int i_86_ = anIntArray4932[i_72_ + 1];
						for (int i_87_ = i_85_; (i_87_ ^ 0xffffffff) > (i_86_ ^ 0xffffffff); i_87_++) {
							int i_88_ = aShortArray4960[i_87_] - 1;
							if ((i_88_ ^ 0xffffffff) == 0)
								break;
							RuntimeException_Sub1.anIntArray3200[-1 + aShortArray4960[i_87_]] = -999999;
						}
					}
				}
				for (int i_89_ = 0; (i_89_ ^ 0xffffffff) > (anInt4948 ^ 0xffffffff); i_89_++) {
					if (((RuntimeException_Sub1.anIntArray3200[aShortArray4947[i_89_]]) ^ 0xffffffff) != 999998 && (RuntimeException_Sub1.anIntArray3200[aShortArray4915[i_89_]]) != -999999 && ((RuntimeException_Sub1.anIntArray3200[aShortArray4961[i_89_]]) ^ 0xffffffff) != 999998 && (method2398(i_38_, (RuntimeException_Sub1.anIntArray3200[aShortArray4961[i_89_]]), i_36_, Class57.anIntArray458[aShortArray4947[i_89_]], 73, Class57.anIntArray458[aShortArray4915[i_89_]], (RuntimeException_Sub1.anIntArray3200[aShortArray4947[i_89_]]), Class57.anIntArray458[aShortArray4961[i_89_]], (RuntimeException_Sub1.anIntArray3200[aShortArray4915[i_89_]]))))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.R(" + i + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + bool + ',' + i_39_ + ',' + (class111 != null ? "{...}" : "null") + ')'));
		}
	}

	final int na() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4939;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.na(" + ')');
		}
	}

	private final AbstractModel method2395(Class146_Sub3 class146_sub3_90_, int i, boolean bool, boolean bool_91_, int i_92_, Class146_Sub3 class146_sub3_93_) {
		try {
			class146_sub3_93_.anInt4942 = i;
			class146_sub3_93_.anInt4909 = anInt4909;
			class146_sub3_93_.aShort4902 = aShort4902;
			class146_sub3_93_.aBoolean4940 = aBoolean4940;
			class146_sub3_93_.aShort4905 = aShort4905;
			class146_sub3_93_.anInt4929 = anInt4929;
			class146_sub3_93_.anInt4936 = anInt4936;
			class146_sub3_93_.anInt4963 = anInt4963;
			if ((0x100 & i ^ 0xffffffff) != -1)
				class146_sub3_93_.aBoolean4938 = true;
			else
				class146_sub3_93_.aBoolean4938 = aBoolean4938;
			class146_sub3_93_.anInt4912 = anInt4912;
			class146_sub3_93_.anInt4911 = anInt4911;
			class146_sub3_93_.anInt4948 = anInt4948;
			boolean bool_94_ = IncomingOpcode.method523(anInt4963, -1, i);
			boolean bool_95_ = Class105.method1715(true, i, anInt4963);
			boolean bool_96_ = Class76_Sub9.method766(-124, anInt4963, i);
			boolean bool_97_ = bool_95_ | bool_94_ | bool_96_;
			if (bool_97_) {
				if (bool_94_) {
					if (class146_sub3_90_.anIntArray4906 == null || ((anInt4929 ^ 0xffffffff) < (class146_sub3_90_.anIntArray4906.length ^ 0xffffffff)))
						class146_sub3_93_.anIntArray4906 = class146_sub3_90_.anIntArray4906 = new int[anInt4929];
					else
						class146_sub3_93_.anIntArray4906 = class146_sub3_90_.anIntArray4906;
				} else
					class146_sub3_93_.anIntArray4906 = anIntArray4906;
				if (bool_95_) {
					if (class146_sub3_90_.anIntArray4959 != null && (class146_sub3_90_.anIntArray4959.length ^ 0xffffffff) <= (anInt4929 ^ 0xffffffff))
						class146_sub3_93_.anIntArray4959 = class146_sub3_90_.anIntArray4959;
					else
						class146_sub3_93_.anIntArray4959 = class146_sub3_90_.anIntArray4959 = new int[anInt4929];
				} else
					class146_sub3_93_.anIntArray4959 = anIntArray4959;
				if (bool_96_) {
					if (class146_sub3_90_.anIntArray4935 == null || ((anInt4929 ^ 0xffffffff) < (class146_sub3_90_.anIntArray4935.length ^ 0xffffffff)))
						class146_sub3_93_.anIntArray4935 = class146_sub3_90_.anIntArray4935 = new int[anInt4929];
					else
						class146_sub3_93_.anIntArray4935 = class146_sub3_90_.anIntArray4935;
				} else
					class146_sub3_93_.anIntArray4935 = anIntArray4935;
				for (int i_98_ = 0; i_98_ < anInt4929; i_98_++) {
					if (bool_94_)
						class146_sub3_93_.anIntArray4906[i_98_] = anIntArray4906[i_98_];
					if (bool_95_)
						class146_sub3_93_.anIntArray4959[i_98_] = anIntArray4959[i_98_];
					if (bool_96_)
						class146_sub3_93_.anIntArray4935[i_98_] = anIntArray4935[i_98_];
				}
			} else {
				class146_sub3_93_.anIntArray4906 = anIntArray4906;
				class146_sub3_93_.anIntArray4959 = anIntArray4959;
				class146_sub3_93_.anIntArray4935 = anIntArray4935;
			}
			if (Class238.method2919(-68, i, anInt4963)) {
				class146_sub3_93_.aClass189_4933 = class146_sub3_90_.aClass189_4933;
				((Class189) class146_sub3_93_.aClass189_4933).aBoolean1459 = true;
				((Class189) class146_sub3_93_.aClass189_4933).aBoolean1458 = ((Class189) aClass189_4933).aBoolean1458;
				((Class189) class146_sub3_93_.aClass189_4933).anInterface2_Impl1_1456 = ((Class189) aClass189_4933).anInterface2_Impl1_1456;
			} else if (!Class93.method901(anInt4963, i, -112))
				class146_sub3_93_.aClass189_4933 = null;
			else
				class146_sub3_93_.aClass189_4933 = aClass189_4933;
			if (Class349.method3842(anInt4963, i, -18021)) {
				if (class146_sub3_90_.aShortArray4946 != null && anInt4948 <= class146_sub3_90_.aShortArray4946.length)
					class146_sub3_93_.aShortArray4946 = class146_sub3_90_.aShortArray4946;
				else
					class146_sub3_93_.aShortArray4946 = class146_sub3_90_.aShortArray4946 = new short[anInt4948];
				for (int i_99_ = 0; anInt4948 > i_99_; i_99_++)
					class146_sub3_93_.aShortArray4946[i_99_] = aShortArray4946[i_99_];
			} else
				class146_sub3_93_.aShortArray4946 = aShortArray4946;
			if (RSByteBuffer.method1241(false, anInt4963, i)) {
				if (class146_sub3_90_.aByteArray4958 != null && ((class146_sub3_90_.aByteArray4958.length ^ 0xffffffff) <= (anInt4948 ^ 0xffffffff)))
					class146_sub3_93_.aByteArray4958 = class146_sub3_90_.aByteArray4958;
				else
					class146_sub3_93_.aByteArray4958 = class146_sub3_90_.aByteArray4958 = new byte[anInt4948];
				for (int i_100_ = 0; i_100_ < anInt4948; i_100_++)
					class146_sub3_93_.aByteArray4958[i_100_] = aByteArray4958[i_100_];
			} else
				class146_sub3_93_.aByteArray4958 = aByteArray4958;
			if (Class98_Sub27.method1292(anInt4963, (byte) 122, i)) {
				class146_sub3_93_.aClass189_4920 = class146_sub3_90_.aClass189_4920;
				((Class189) class146_sub3_93_.aClass189_4920).aBoolean1458 = ((Class189) aClass189_4920).aBoolean1458;
				((Class189) class146_sub3_93_.aClass189_4920).aBoolean1459 = true;
				((Class189) class146_sub3_93_.aClass189_4920).anInterface2_Impl1_1456 = ((Class189) aClass189_4920).anInterface2_Impl1_1456;
			} else if (Class53_Sub1.method502(anInt4963, i, (byte) 125))
				class146_sub3_93_.aClass189_4920 = aClass189_4920;
			else
				class146_sub3_93_.aClass189_4920 = null;
			if (!Class373_Sub3.method3978(anInt4963, i, (byte) 112)) {
				class146_sub3_93_.aShortArray4957 = aShortArray4957;
				class146_sub3_93_.aShortArray4962 = aShortArray4962;
				class146_sub3_93_.aClass168_4923 = aClass168_4923;
				class146_sub3_93_.aByteArray4928 = aByteArray4928;
				class146_sub3_93_.aShortArray4953 = aShortArray4953;
			} else {
				if (class146_sub3_90_.aShortArray4953 != null && ((class146_sub3_90_.aShortArray4953.length ^ 0xffffffff) <= (anInt4936 ^ 0xffffffff))) {
					class146_sub3_93_.aShortArray4953 = class146_sub3_90_.aShortArray4953;
					class146_sub3_93_.aShortArray4957 = class146_sub3_90_.aShortArray4957;
					class146_sub3_93_.aShortArray4962 = class146_sub3_90_.aShortArray4962;
				} else {
					int i_101_ = anInt4936;
					class146_sub3_93_.aShortArray4953 = class146_sub3_90_.aShortArray4953 = new short[i_101_];
					class146_sub3_93_.aShortArray4957 = class146_sub3_90_.aShortArray4957 = new short[i_101_];
					class146_sub3_93_.aShortArray4962 = class146_sub3_90_.aShortArray4962 = new short[i_101_];
				}
				if (aClass168_4923 != null) {
					if (class146_sub3_90_.aClass168_4923 == null)
						class146_sub3_90_.aClass168_4923 = new Class168();
					Class168 class168 = (class146_sub3_93_.aClass168_4923 = class146_sub3_90_.aClass168_4923);
					if (((Class168) class168).aShortArray1288 == null || (((Class168) class168).aShortArray1288.length < anInt4936)) {
						int i_102_ = anInt4936;
						((Class168) class168).aByteArray1289 = new byte[i_102_];
						((Class168) class168).aShortArray1292 = new short[i_102_];
						((Class168) class168).aShortArray1288 = new short[i_102_];
						((Class168) class168).aShortArray1291 = new short[i_102_];
					}
					for (int i_103_ = 0; anInt4936 > i_103_; i_103_++) {
						class146_sub3_93_.aShortArray4953[i_103_] = aShortArray4953[i_103_];
						class146_sub3_93_.aShortArray4957[i_103_] = aShortArray4957[i_103_];
						class146_sub3_93_.aShortArray4962[i_103_] = aShortArray4962[i_103_];
						((Class168) class168).aShortArray1288[i_103_] = (((Class168) aClass168_4923).aShortArray1288[i_103_]);
						((Class168) class168).aShortArray1291[i_103_] = (((Class168) aClass168_4923).aShortArray1291[i_103_]);
						((Class168) class168).aShortArray1292[i_103_] = (((Class168) aClass168_4923).aShortArray1292[i_103_]);
						((Class168) class168).aByteArray1289[i_103_] = (((Class168) aClass168_4923).aByteArray1289[i_103_]);
					}
				} else {
					class146_sub3_93_.aClass168_4923 = null;
					for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > (anInt4936 ^ 0xffffffff); i_104_++) {
						class146_sub3_93_.aShortArray4953[i_104_] = aShortArray4953[i_104_];
						class146_sub3_93_.aShortArray4957[i_104_] = aShortArray4957[i_104_];
						class146_sub3_93_.aShortArray4962[i_104_] = aShortArray4962[i_104_];
					}
				}
				class146_sub3_93_.aByteArray4928 = aByteArray4928;
			}
			if (Class21_Sub3.method276(i, 15123, anInt4963)) {
				class146_sub3_93_.aClass189_4927 = class146_sub3_90_.aClass189_4927;
				((Class189) class146_sub3_93_.aClass189_4927).anInterface2_Impl1_1456 = ((Class189) aClass189_4927).anInterface2_Impl1_1456;
				((Class189) class146_sub3_93_.aClass189_4927).aBoolean1459 = true;
				((Class189) class146_sub3_93_.aClass189_4927).aBoolean1458 = ((Class189) aClass189_4927).aBoolean1458;
			} else if (Class98_Sub10_Sub1.method1005(i, anInt4963, (byte) -23))
				class146_sub3_93_.aClass189_4927 = aClass189_4927;
			else
				class146_sub3_93_.aClass189_4927 = null;
			if (!s_Sub1.method3432(i, (byte) -104, anInt4963)) {
				class146_sub3_93_.aFloatArray4955 = aFloatArray4955;
				class146_sub3_93_.aFloatArray4914 = aFloatArray4914;
			} else {
				if (class146_sub3_90_.aFloatArray4955 != null && ((class146_sub3_90_.aFloatArray4955.length ^ 0xffffffff) <= (anInt4948 ^ 0xffffffff))) {
					class146_sub3_93_.aFloatArray4914 = class146_sub3_90_.aFloatArray4914;
					class146_sub3_93_.aFloatArray4955 = class146_sub3_90_.aFloatArray4955;
				} else {
					int i_105_ = anInt4936;
					class146_sub3_93_.aFloatArray4914 = class146_sub3_90_.aFloatArray4914 = new float[i_105_];
					class146_sub3_93_.aFloatArray4955 = class146_sub3_90_.aFloatArray4955 = new float[i_105_];
				}
				for (int i_106_ = 0; i_106_ < anInt4936; i_106_++) {
					class146_sub3_93_.aFloatArray4955[i_106_] = aFloatArray4955[i_106_];
					class146_sub3_93_.aFloatArray4914[i_106_] = aFloatArray4914[i_106_];
				}
			}
			if (r_Sub2.method1655(i, (byte) -128, anInt4963)) {
				class146_sub3_93_.aClass189_4930 = class146_sub3_90_.aClass189_4930;
				((Class189) class146_sub3_93_.aClass189_4930).anInterface2_Impl1_1456 = ((Class189) aClass189_4930).anInterface2_Impl1_1456;
				((Class189) class146_sub3_93_.aClass189_4930).aBoolean1459 = true;
				((Class189) class146_sub3_93_.aClass189_4930).aBoolean1458 = ((Class189) aClass189_4930).aBoolean1458;
			} else if (!Class5.method176(24578, i, anInt4963))
				class146_sub3_93_.aClass189_4930 = null;
			else
				class146_sub3_93_.aClass189_4930 = aClass189_4930;
			if (!Class98_Sub10_Sub9.method1033(i, anInt4963, 16)) {
				class146_sub3_93_.aShortArray4961 = aShortArray4961;
				class146_sub3_93_.aShortArray4947 = aShortArray4947;
				class146_sub3_93_.aShortArray4915 = aShortArray4915;
			} else {
				if (class146_sub3_90_.aShortArray4947 == null || ((class146_sub3_90_.aShortArray4947.length ^ 0xffffffff) > (anInt4948 ^ 0xffffffff))) {
					int i_107_ = anInt4948;
					class146_sub3_93_.aShortArray4947 = class146_sub3_90_.aShortArray4947 = new short[i_107_];
					class146_sub3_93_.aShortArray4915 = class146_sub3_90_.aShortArray4915 = new short[i_107_];
					class146_sub3_93_.aShortArray4961 = class146_sub3_90_.aShortArray4961 = new short[i_107_];
				} else {
					class146_sub3_93_.aShortArray4961 = class146_sub3_90_.aShortArray4961;
					class146_sub3_93_.aShortArray4915 = class146_sub3_90_.aShortArray4915;
					class146_sub3_93_.aShortArray4947 = class146_sub3_90_.aShortArray4947;
				}
				for (int i_108_ = 0; (i_108_ ^ 0xffffffff) > (anInt4948 ^ 0xffffffff); i_108_++) {
					class146_sub3_93_.aShortArray4947[i_108_] = aShortArray4947[i_108_];
					class146_sub3_93_.aShortArray4915[i_108_] = aShortArray4915[i_108_];
					class146_sub3_93_.aShortArray4961[i_108_] = aShortArray4961[i_108_];
				}
			}
			if (!Class276.method3286((byte) 22, i, anInt4963)) {
				if (VarpClass.method2287(i, anInt4963, 2048))
					class146_sub3_93_.aClass18_4931 = aClass18_4931;
				else
					class146_sub3_93_.aClass18_4931 = null;
			} else {
				class146_sub3_93_.aClass18_4931 = class146_sub3_90_.aClass18_4931;
				((Class18) class146_sub3_93_.aClass18_4931).aBoolean209 = true;
				((Class18) class146_sub3_93_.aClass18_4931).anInterface2_Impl2_211 = ((Class18) aClass18_4931).anInterface2_Impl2_211;
				((Class18) class146_sub3_93_.aClass18_4931).aBoolean207 = ((Class18) aClass18_4931).aBoolean207;
			}
			if (Class206.method2725(32768, i, anInt4963)) {
				if (class146_sub3_90_.aShortArray4954 == null || anInt4948 > class146_sub3_90_.aShortArray4954.length) {
					int i_109_ = anInt4948;
					class146_sub3_93_.aShortArray4954 = class146_sub3_90_.aShortArray4954 = new short[i_109_];
				} else
					class146_sub3_93_.aShortArray4954 = class146_sub3_90_.aShortArray4954;
				for (int i_110_ = 0; i_110_ < anInt4948; i_110_++)
					class146_sub3_93_.aShortArray4954[i_110_] = aShortArray4954[i_110_];
			} else
				class146_sub3_93_.aShortArray4954 = aShortArray4954;
			if (i_92_ > -81)
				ma();
			if (!Class234.method2887(anInt4963, (byte) 46, i))
				class146_sub3_93_.aClass181Array4913 = aClass181Array4913;
			else if (class146_sub3_90_.aClass181Array4913 != null && (class146_sub3_90_.aClass181Array4913.length ^ 0xffffffff) <= (anInt4911 ^ 0xffffffff)) {
				class146_sub3_93_.aClass181Array4913 = class146_sub3_90_.aClass181Array4913;
				for (int i_111_ = 0; (anInt4911 ^ 0xffffffff) < (i_111_ ^ 0xffffffff); i_111_++)
					class146_sub3_93_.aClass181Array4913[i_111_].method2609(aClass181Array4913[i_111_], (byte) -100);
			} else {
				int i_112_ = anInt4911;
				class146_sub3_93_.aClass181Array4913 = class146_sub3_90_.aClass181Array4913 = new Class181[i_112_];
				for (int i_113_ = 0; anInt4911 > i_113_; i_113_++)
					class146_sub3_93_.aClass181Array4913[i_113_] = aClass181Array4913[i_113_].method2611(-1);
			}
			class146_sub3_93_.anIntArray4932 = anIntArray4932;
			class146_sub3_93_.anIntArrayArray4925 = anIntArrayArray4925;
			class146_sub3_93_.anIntArray4918 = anIntArray4918;
			class146_sub3_93_.aShortArray4904 = aShortArray4904;
			class146_sub3_93_.aShortArray4917 = aShortArray4917;
			class146_sub3_93_.aShortArray4901 = aShortArray4901;
			if (!aBoolean4922)
				class146_sub3_93_.aBoolean4922 = false;
			else {
				class146_sub3_93_.aBoolean4922 = true;
				class146_sub3_93_.anInt4924 = anInt4924;
				class146_sub3_93_.anInt4939 = anInt4939;
				class146_sub3_93_.anInt4950 = anInt4950;
				class146_sub3_93_.anInt4937 = anInt4937;
				class146_sub3_93_.anInt4956 = anInt4956;
				class146_sub3_93_.anInt4910 = anInt4910;
				class146_sub3_93_.anInt4921 = anInt4921;
				class146_sub3_93_.anInt4943 = anInt4943;
			}
			class146_sub3_93_.aShortArray4944 = aShortArray4944;
			class146_sub3_93_.anIntArrayArray4903 = anIntArrayArray4903;
			class146_sub3_93_.aClass87Array4951 = aClass87Array4951;
			class146_sub3_93_.aClass35Array4919 = aClass35Array4919;
			class146_sub3_93_.aClass281Array4941 = aClass281Array4941;
			class146_sub3_93_.anIntArray4945 = anIntArray4945;
			class146_sub3_93_.anIntArrayArray4934 = anIntArrayArray4934;
			class146_sub3_93_.anIntArray4907 = anIntArray4907;
			class146_sub3_93_.aShortArray4960 = aShortArray4960;
			return class146_sub3_93_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.N(" + (class146_sub3_90_ != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + bool_91_ + ',' + i_92_ + ',' + (class146_sub3_93_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void ia(short i, short i_114_) {
		try {
			for (int i_115_ = 0; anInt4948 > i_115_; i_115_++) {
				if ((aShortArray4946[i_115_] ^ 0xffffffff) == (i ^ 0xffffffff))
					aShortArray4946[i_115_] = i_114_;
			}
			if (aClass281Array4941 != null) {
				for (int i_116_ = 0; (i_116_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff); i_116_++) {
					Class281 class281 = aClass281Array4941[i_116_];
					Class181 class181 = aClass181Array4913[i_116_];
					((Class181) class181).anInt1428 = (((Class181) class181).anInt1428 & ~0xffffff | ((Class208.anIntArray1579[0xffff & (aShortArray4946[((Class281) class281).anInt2121])]) & 0xffffff));
				}
			}
			method2392(76);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.ia(" + i + ',' + i_114_ + ')');
		}
	}

	final r ba(r var_r) {
		try {
			if (anInt4936 == 0)
				return null;
			if (!aBoolean4922)
				method2401(-21065);
			int i;
			int i_117_;
			if (((ha_Sub3) aHa_Sub3_4899).anInt4564 > 0) {
				i = ((anInt4924 + -(((ha_Sub3) aHa_Sub3_4899).anInt4564 * anInt4950 >> -1885074200)) >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
				i_117_ = (-(anInt4956 * ((ha_Sub3) aHa_Sub3_4899).anInt4564 >> -1369730328) + anInt4910 >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
			} else {
				i = (-(((ha_Sub3) aHa_Sub3_4899).anInt4564 * anInt4956 >> -1397541176) + anInt4924 >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
				i_117_ = (-(anInt4950 * ((ha_Sub3) aHa_Sub3_4899).anInt4564 >> -854634200) + anInt4910 >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
			}
			int i_118_;
			int i_119_;
			if ((((ha_Sub3) aHa_Sub3_4899).anInt4552 ^ 0xffffffff) >= -1) {
				i_118_ = ((anInt4921 + -(((ha_Sub3) aHa_Sub3_4899).anInt4552 * anInt4956 >> 1942279688)) >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
				i_119_ = ((anInt4937 - (((ha_Sub3) aHa_Sub3_4899).anInt4552 * anInt4950 >> -1505360600)) >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
			} else {
				i_118_ = ((anInt4921 - (anInt4950 * ((ha_Sub3) aHa_Sub3_4899).anInt4552 >> 470725096)) >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
				i_119_ = (-(((ha_Sub3) aHa_Sub3_4899).anInt4552 * anInt4956 >> -959976984) + anInt4937 >> ((ha_Sub3) aHa_Sub3_4899).anInt4573);
			}
			int i_120_ = i_117_ - (i + -1);
			int i_121_ = i_119_ - i_118_ - -1;
			r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
			r_Sub2 var_r_Sub2_122_;
			if (var_r_Sub2 == null || !var_r_Sub2.method1652(i_120_, i_121_, 22657))
				var_r_Sub2_122_ = new r_Sub2(aHa_Sub3_4899, i_120_, i_121_);
			else {
				var_r_Sub2_122_ = var_r_Sub2;
				var_r_Sub2_122_.method1654(106);
			}
			var_r_Sub2_122_.method1651(i_119_, i_118_, 0, i, i_117_);
			method2397(8192, var_r_Sub2_122_);
			return var_r_Sub2_122_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.ba(" + (var_r != null ? "{...}" : "null") + ')');
		}
	}

	final int ma() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4943;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.ma(" + ')');
		}
	}

	final void v() {
		try {
			for (int i = 0; anInt4912 > i; i++)
				anIntArray4935[i] = -anIntArray4935[i];
			for (int i = 0; i < anInt4936; i++)
				aShortArray4962[i] = (short) -aShortArray4962[i];
			for (int i = 0; (anInt4948 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				short i_123_ = aShortArray4947[i];
				aShortArray4947[i] = aShortArray4961[i];
				aShortArray4961[i] = i_123_;
			}
			method2410(-83);
			method2404((byte) -64);
			method2406(-14204);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.v(" + ')');
		}
	}

	final Class87[] method2320() {
		try {
			return aClass87Array4951;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.IB(" + ')');
		}
	}

	final int EA() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4950;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.EA(" + ')');
		}
	}

	final void s(int i) {
		try {
			if (aClass189_4933 != null)
				((Class189) aClass189_4933).aBoolean1459 = Class238.method2919(-104, i, anInt4963);
			if (aClass189_4930 != null)
				((Class189) aClass189_4930).aBoolean1459 = r_Sub2.method1655(i, (byte) -128, anInt4963);
			if (aClass189_4920 != null)
				((Class189) aClass189_4920).aBoolean1459 = Class98_Sub27.method1292(anInt4963, (byte) 118, i);
			if (aClass189_4927 != null)
				((Class189) aClass189_4927).aBoolean1459 = Class21_Sub3.method276(i, 15123, anInt4963);
			anInt4942 = i;
			aBoolean4908 = true;
			if (aClass168_4923 != null && (anInt4942 & 0x10000 ^ 0xffffffff) == -1) {
				aShortArray4962 = ((Class168) aClass168_4923).aShortArray1292;
				aShortArray4953 = ((Class168) aClass168_4923).aShortArray1288;
				aShortArray4957 = ((Class168) aClass168_4923).aShortArray1291;
				aByteArray4928 = ((Class168) aClass168_4923).aByteArray1289;
				aClass168_4923 = null;
			}
			method2396(8);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.s(" + i + ')');
		}
	}

	private final void method2396(int i) {
		do {
			try {
				if (aBoolean4908) {
					aBoolean4908 = false;
					if (aClass87Array4951 == null && aClass35Array4919 == null && aClass281Array4941 == null) {
						if (anIntArray4906 != null && !Class93_Sub1.method905(anInt4942, -87, anInt4963)) {
							if (aClass189_4933 == null || aClass189_4933.method2640(13156520)) {
								if (!aBoolean4922)
									method2401(i + -21073);
								anIntArray4906 = null;
							} else
								aBoolean4908 = true;
						}
						if (anIntArray4959 != null && !Class298.method3504(anInt4963, anInt4942, 28)) {
							if (aClass189_4933 == null || aClass189_4933.method2640(13156520)) {
								if (!aBoolean4922)
									method2401(-21065);
								anIntArray4959 = null;
							} else
								aBoolean4908 = true;
						}
						if (anIntArray4935 != null && !Class64_Sub25.method656(anInt4963, (byte) -123, anInt4942)) {
							if (aClass189_4933 != null && !aClass189_4933.method2640(13156520))
								aBoolean4908 = true;
							else {
								if (!aBoolean4922)
									method2401(-21065);
								anIntArray4935 = null;
							}
						}
					}
					if (aShortArray4960 != null && anIntArray4906 == null && anIntArray4959 == null && anIntArray4935 == null) {
						anIntArray4932 = null;
						aShortArray4960 = null;
					}
					if (i != 8)
						fa();
					if (aByteArray4928 != null && !Class133.method2239(anInt4963, anInt4942, (byte) 100)) {
						if (!((0x37 & anInt4963) != 0 ? (aClass189_4927 == null || aClass189_4927.method2640(i ^ 0xc8c0a0)) : (aClass189_4920 == null || aClass189_4920.method2640(13156520))))
							aBoolean4908 = true;
						else {
							aByteArray4928 = null;
							aShortArray4953 = aShortArray4957 = aShortArray4962 = null;
						}
					}
					if (aShortArray4946 != null && !Class13.method224(8, anInt4942, anInt4963)) {
						if (aClass189_4920 == null || aClass189_4920.method2640(13156520))
							aShortArray4946 = null;
						else
							aBoolean4908 = true;
					}
					if (aByteArray4958 != null && !Class241.method2931(anInt4963, 262144, anInt4942)) {
						if (aClass189_4920 == null || aClass189_4920.method2640(13156520))
							aByteArray4958 = null;
						else
							aBoolean4908 = true;
					}
					if (aFloatArray4955 != null && !Class15.method228(anInt4963, 1, anInt4942)) {
						if (aClass189_4930 == null || aClass189_4930.method2640(13156520))
							aFloatArray4955 = aFloatArray4914 = null;
						else
							aBoolean4908 = true;
					}
					if (aShortArray4954 != null && !Class99.method1686(anInt4942, anInt4963, false)) {
						if (aClass189_4920 != null && !aClass189_4920.method2640(13156520))
							aBoolean4908 = true;
						else
							aShortArray4954 = null;
					}
					if (aShortArray4947 != null && !Class98_Sub20.method1172((byte) 1, anInt4942, anInt4963)) {
						if ((aClass18_4931 == null || aClass18_4931.method250((byte) -57)) && (aClass189_4920 == null || aClass189_4920.method2640(13156520)))
							aShortArray4947 = aShortArray4915 = aShortArray4961 = null;
						else
							aBoolean4908 = true;
					}
					if (aShortArray4901 != null) {
						if (aClass189_4933 != null && !aClass189_4933.method2640(13156520))
							aBoolean4908 = true;
						else
							aShortArray4901 = null;
					}
					if (aShortArray4904 != null) {
						if (aClass189_4920 == null || aClass189_4920.method2640(13156520))
							aShortArray4904 = null;
						else
							aBoolean4908 = true;
					}
					if (anIntArrayArray4903 != null && !Class128.method2223(anInt4963, (byte) -67, anInt4942)) {
						aShortArray4917 = null;
						anIntArrayArray4903 = null;
					}
					if (anIntArrayArray4925 != null && !Class98_Sub10_Sub29.method1092(anInt4942, anInt4963, (byte) -114)) {
						aShortArray4944 = null;
						anIntArrayArray4925 = null;
					}
					if (anIntArrayArray4934 != null && !Class2.method169(false, anInt4942, anInt4963))
						anIntArrayArray4934 = null;
					if (anIntArray4907 == null || (0x800 & anInt4942 ^ 0xffffffff) != -1 || (0x40000 & anInt4942) != 0)
						break;
					anIntArray4918 = null;
					anIntArray4945 = null;
					anIntArray4907 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qw.W(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2397(int i, r_Sub2 var_r_Sub2) {
		try {
			if ((anInt4936 ^ 0xffffffff) < (RuntimeException_Sub1.anIntArray3200.length ^ 0xffffffff)) {
				Class57.anIntArray458 = new int[anInt4936];
				RuntimeException_Sub1.anIntArray3200 = new int[anInt4936];
			}
			if (i != 8192)
				aShortArray4901 = null;
			for (int i_124_ = 0; (i_124_ ^ 0xffffffff) > (anInt4912 ^ 0xffffffff); i_124_++) {
				int i_125_ = ((-((anIntArray4959[i_124_] * ((ha_Sub3) aHa_Sub3_4899).anInt4564) >> 1103211464) + anIntArray4906[i_124_] >> ((ha_Sub3) aHa_Sub3_4899).anInt4573) + -((r_Sub2) var_r_Sub2).anInt6329);
				int i_126_ = (-((r_Sub2) var_r_Sub2).anInt6327 + ((anIntArray4935[i_124_] - ((anIntArray4959[i_124_] * ((ha_Sub3) aHa_Sub3_4899).anInt4552) >> 1203490792)) >> ((ha_Sub3) aHa_Sub3_4899).anInt4573));
				int i_127_ = anIntArray4932[i_124_];
				int i_128_ = anIntArray4932[1 + i_124_];
				for (int i_129_ = i_127_; (i_129_ ^ 0xffffffff) > (i_128_ ^ 0xffffffff); i_129_++) {
					int i_130_ = -1 + aShortArray4960[i_129_];
					if ((i_130_ ^ 0xffffffff) == 0)
						break;
					RuntimeException_Sub1.anIntArray3200[i_130_] = i_125_;
					Class57.anIntArray458[i_130_] = i_126_;
				}
			}
			for (int i_131_ = 0; (i_131_ ^ 0xffffffff) > (anInt4909 ^ 0xffffffff); i_131_++) {
				if (aByteArray4958 == null || aByteArray4958[i_131_] <= 128) {
					short i_132_ = aShortArray4947[i_131_];
					short i_133_ = aShortArray4915[i_131_];
					short i_134_ = aShortArray4961[i_131_];
					int i_135_ = RuntimeException_Sub1.anIntArray3200[i_132_];
					int i_136_ = RuntimeException_Sub1.anIntArray3200[i_133_];
					int i_137_ = RuntimeException_Sub1.anIntArray3200[i_134_];
					int i_138_ = Class57.anIntArray458[i_132_];
					int i_139_ = Class57.anIntArray458[i_133_];
					int i_140_ = Class57.anIntArray458[i_134_];
					if ((-((-i_138_ + i_139_) * (i_137_ + -i_136_)) + (i_139_ - i_140_) * (i_135_ - i_136_)) > 0)
						var_r_Sub2.method1653(i_138_, i_135_, i_136_, i_137_, i_140_, (byte) -69, i_139_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.CA(" + i + ',' + (var_r_Sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	private final boolean method2398(int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_) {
		try {
			if (i < i_143_ && i < i_145_ && (i ^ 0xffffffff) > (i_147_ ^ 0xffffffff))
				return false;
			if (i_144_ < 20)
				method2392(86);
			if (i > i_143_ && (i_145_ ^ 0xffffffff) > (i ^ 0xffffffff) && i_147_ < i)
				return false;
			if (i_146_ > i_142_ && i_142_ < i_148_ && (i_141_ ^ 0xffffffff) < (i_142_ ^ 0xffffffff))
				return false;
			if (i_146_ < i_142_ && i_148_ < i_142_ && i_142_ > i_141_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.GA(" + i + ',' + i_141_ + ',' + i_142_ + ',' + i_143_ + ',' + i_144_ + ',' + i_145_ + ',' + i_146_ + ',' + i_147_ + ',' + i_148_ + ')'));
		}
	}

	final int RA() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4910;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.RA(" + ')');
		}
	}

	final void method2332(AbstractModel class146, int i, int i_149_, int i_150_, boolean bool) {
		try {
			Class146_Sub3 class146_sub3_151_ = (Class146_Sub3) class146;
			if (anInt4948 != 0 && (class146_sub3_151_.anInt4948 ^ 0xffffffff) != -1) {
				int i_152_ = class146_sub3_151_.anInt4912;
				int[] is = class146_sub3_151_.anIntArray4906;
				int[] is_153_ = class146_sub3_151_.anIntArray4959;
				int[] is_154_ = class146_sub3_151_.anIntArray4935;
				short[] is_155_ = class146_sub3_151_.aShortArray4953;
				short[] is_156_ = class146_sub3_151_.aShortArray4957;
				short[] is_157_ = class146_sub3_151_.aShortArray4962;
				byte[] is_158_ = class146_sub3_151_.aByteArray4928;
				short[] is_159_;
				byte[] is_160_;
				short[] is_161_;
				short[] is_162_;
				if (aClass168_4923 != null) {
					is_161_ = ((Class168) aClass168_4923).aShortArray1292;
					is_162_ = ((Class168) aClass168_4923).aShortArray1288;
					is_160_ = ((Class168) aClass168_4923).aByteArray1289;
					is_159_ = ((Class168) aClass168_4923).aShortArray1291;
				} else {
					is_159_ = null;
					is_160_ = null;
					is_161_ = null;
					is_162_ = null;
				}
				byte[] is_163_;
				short[] is_164_;
				short[] is_165_;
				short[] is_166_;
				if (class146_sub3_151_.aClass168_4923 != null) {
					is_165_ = (((Class168) class146_sub3_151_.aClass168_4923).aShortArray1288);
					is_163_ = (((Class168) class146_sub3_151_.aClass168_4923).aByteArray1289);
					is_164_ = (((Class168) class146_sub3_151_.aClass168_4923).aShortArray1291);
					is_166_ = (((Class168) class146_sub3_151_.aClass168_4923).aShortArray1292);
				} else {
					is_163_ = null;
					is_164_ = null;
					is_165_ = null;
					is_166_ = null;
				}
				int[] is_167_ = class146_sub3_151_.anIntArray4932;
				short[] is_168_ = class146_sub3_151_.aShortArray4960;
				if (!class146_sub3_151_.aBoolean4922)
					class146_sub3_151_.method2401(-21065);
				int i_169_ = class146_sub3_151_.anInt4956;
				int i_170_ = class146_sub3_151_.anInt4950;
				int i_171_ = class146_sub3_151_.anInt4924;
				int i_172_ = class146_sub3_151_.anInt4910;
				int i_173_ = class146_sub3_151_.anInt4921;
				int i_174_ = class146_sub3_151_.anInt4937;
				for (int i_175_ = 0; anInt4912 > i_175_; i_175_++) {
					int i_176_ = anIntArray4959[i_175_] + -i_149_;
					if (i_169_ <= i_176_ && i_176_ <= i_170_) {
						int i_177_ = anIntArray4906[i_175_] + -i;
						if (i_171_ <= i_177_ && (i_177_ ^ 0xffffffff) >= (i_172_ ^ 0xffffffff)) {
							int i_178_ = anIntArray4935[i_175_] - i_150_;
							if ((i_173_ ^ 0xffffffff) >= (i_178_ ^ 0xffffffff) && i_178_ <= i_174_) {
								int i_179_ = -1;
								int i_180_ = anIntArray4932[i_175_];
								int i_181_ = anIntArray4932[i_175_ + 1];
								for (int i_182_ = i_180_; ((i_182_ ^ 0xffffffff) > (i_181_ ^ 0xffffffff)); i_182_++) {
									i_179_ = aShortArray4960[i_182_] + -1;
									if (i_179_ == -1 || (aByteArray4928[i_179_] ^ 0xffffffff) != -1)
										break;
								}
								if ((i_179_ ^ 0xffffffff) != 0) {
									for (int i_183_ = 0; i_152_ > i_183_; i_183_++) {
										if (((is[i_183_] ^ 0xffffffff) == (i_177_ ^ 0xffffffff)) && ((i_178_ ^ 0xffffffff) == (is_154_[i_183_] ^ 0xffffffff)) && i_176_ == is_153_[i_183_]) {
											i_181_ = is_167_[i_183_ + 1];
											int i_184_ = -1;
											i_180_ = is_167_[i_183_];
											for (int i_185_ = i_180_; i_185_ < i_181_; i_185_++) {
												i_184_ = is_168_[i_185_] + -1;
												if ((i_184_ ^ 0xffffffff) == 0 || (is_158_[i_184_] ^ 0xffffffff) != -1)
													break;
											}
											if ((i_184_ ^ 0xffffffff) != 0) {
												if (is_162_ == null) {
													aClass168_4923 = new Class168();
													is_162_ = ((Class168) aClass168_4923).aShortArray1288 = (Class141.method2304((byte) 123, aShortArray4953));
													is_159_ = ((Class168) aClass168_4923).aShortArray1291 = (Class141.method2304((byte) 113, aShortArray4957));
													is_161_ = ((Class168) aClass168_4923).aShortArray1292 = (Class141.method2304((byte) 115, aShortArray4962));
													is_160_ = ((Class168) aClass168_4923).aByteArray1289 = (Class98_Sub10_Sub24.method1075(aByteArray4928, true));
												}
												if (is_165_ == null) {
													Class168 class168 = (class146_sub3_151_.aClass168_4923 = new Class168());
													is_165_ = ((Class168) class168).aShortArray1288 = (Class141.method2304((byte) 114, is_155_));
													is_164_ = ((Class168) class168).aShortArray1291 = (Class141.method2304((byte) 120, is_156_));
													is_166_ = ((Class168) class168).aShortArray1292 = (Class141.method2304((byte) 114, is_157_));
													is_163_ = ((Class168) class168).aByteArray1289 = (Class98_Sub10_Sub24.method1075(is_158_, true));
												}
												short i_186_ = aShortArray4953[i_179_];
												short i_187_ = aShortArray4957[i_179_];
												short i_188_ = aShortArray4962[i_179_];
												byte i_189_ = aByteArray4928[i_179_];
												i_180_ = is_167_[i_183_];
												i_181_ = is_167_[1 + i_183_];
												for (int i_190_ = i_180_; i_181_ > i_190_; i_190_++) {
													int i_191_ = is_168_[i_190_] - 1;
													if (i_191_ == -1)
														break;
													if (is_163_[i_191_] != 0) {
														is_165_[i_191_] += i_186_;
														is_164_[i_191_] += i_187_;
														is_166_[i_191_] += i_188_;
														is_163_[i_191_] += i_189_;
													}
												}
												i_189_ = is_158_[i_184_];
												i_180_ = anIntArray4932[i_175_];
												i_188_ = is_157_[i_184_];
												i_186_ = is_155_[i_184_];
												i_181_ = (anIntArray4932[i_175_ - -1]);
												i_187_ = is_156_[i_184_];
												for (int i_192_ = i_180_; ((i_181_ ^ 0xffffffff) < (i_192_ ^ 0xffffffff)); i_192_++) {
													int i_193_ = ((aShortArray4960[i_192_]) - 1);
													if (i_193_ == -1)
														break;
													if ((is_160_[i_193_] ^ 0xffffffff) != -1) {
														is_162_[i_193_] += i_186_;
														is_159_[i_193_] += i_187_;
														is_161_[i_193_] += i_188_;
														is_160_[i_193_] += i_189_;
													}
												}
												class146_sub3_151_.method2404((byte) -64);
												method2404((byte) -64);
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
			throw Class64_Sub27.method667(runtimeexception, ("qw.AA(" + (class146 != null ? "{...}" : "null") + ',' + i + ',' + i_149_ + ',' + i_150_ + ',' + bool + ')'));
		}
	}

	private final boolean method2399(int i) {
		try {
			if (((Class18) aClass18_4931).aBoolean207)
				return true;
			if (((Class18) aClass18_4931).anInterface2_Impl2_208 == null)
				((Class18) aClass18_4931).anInterface2_Impl2_208 = aHa_Sub3_4899.method1990((byte) 84, aBoolean4916);
			Interface2_Impl2 interface2_impl2 = ((Class18) aClass18_4931).anInterface2_Impl2_208;
			interface2_impl2.method76(anInt4909 * 6, 20779);
			Buffer buffer = interface2_impl2.method78(true, -89);
			if (buffer != null) {
				Stream stream = aHa_Sub3_4899.method2043(24022, buffer);
				if (Stream.a()) {
					for (int i_194_ = 0; (i_194_ ^ 0xffffffff) > (anInt4909 ^ 0xffffffff); i_194_++) {
						stream.c(aShortArray4947[i_194_]);
						stream.c(aShortArray4915[i_194_]);
						stream.c(aShortArray4961[i_194_]);
					}
				} else {
					for (int i_195_ = 0; (anInt4909 ^ 0xffffffff) < (i_195_ ^ 0xffffffff); i_195_++) {
						stream.d(aShortArray4947[i_195_]);
						stream.d(aShortArray4915[i_195_]);
						stream.d(aShortArray4961[i_195_]);
					}
				}
				stream.c();
				if (interface2_impl2.method79((byte) -87)) {
					aBoolean4908 = true;
					((Class18) aClass18_4931).anInterface2_Impl2_211 = interface2_impl2;
					((Class18) aClass18_4931).aBoolean207 = true;
					return true;
				}
			}
			if (i <= 80)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.IA(" + i + ')');
		}
	}

	final void method2331(Class111 class111, int i, boolean bool) {
		try {
			if (aShortArray4944 != null) {
				int[] is = new int[3];
				for (int i_196_ = 0; anInt4912 > i_196_; i_196_++) {
					if ((aShortArray4944[i_196_] & i ^ 0xffffffff) != -1) {
						if (!bool)
							class111.method2103(anIntArray4906[i_196_], anIntArray4959[i_196_], anIntArray4935[i_196_], is);
						else
							class111.method2096(anIntArray4906[i_196_], anIntArray4959[i_196_], anIntArray4935[i_196_], is);
						anIntArray4906[i_196_] = is[0];
						anIntArray4959[i_196_] = is[1];
						anIntArray4935[i_196_] = is[2];
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.za(" + (class111 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
		}
	}

	public static void method2400(int i) {
		try {
			if (i == -1) {
				aClass213_4949 = null;
				aClass305_Sub1_4952 = null;
				aClass171_4900 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.L(" + i + ')');
		}
	}

	final void method2337(int i, int i_197_, int i_198_, int i_199_) {
		try {
			for (int i_200_ = 0; anInt4948 > i_200_; i_200_++) {
				int i_201_ = aShortArray4946[i_200_] & 0xffff;
				int i_202_ = 0x3f & i_201_ >> -1348210774;
				int i_203_ = (i_201_ & 0x3c0) >> 999663239;
				int i_204_ = 0x7f & i_201_;
				if ((i ^ 0xffffffff) != 0)
					i_202_ -= -(i_199_ * (-i_202_ + i) >> -1413349625);
				if ((i_197_ ^ 0xffffffff) != 0)
					i_203_ -= -((i_197_ + -i_203_) * i_199_ >> -289480537);
				if (i_198_ != -1)
					i_204_ = ((i_198_ - i_204_) * i_199_ >> 428093351) + i_204_;
				aShortArray4946[i_200_] = (short) (Class41.method366(Class41.method366(i_203_ << 1530379783, i_202_ << -1910424694), i_204_));
			}
			if (aClass281Array4941 != null) {
				for (int i_205_ = 0; (anInt4911 ^ 0xffffffff) < (i_205_ ^ 0xffffffff); i_205_++) {
					Class281 class281 = aClass281Array4941[i_205_];
					Class181 class181 = aClass181Array4913[i_205_];
					((Class181) class181).anInt1428 = (~0xffffff & ((Class181) class181).anInt1428 | ((Class208.anIntArray1579[(aShortArray4946[((Class281) class281).anInt2121]) & 0xffff]) & 0xffffff));
				}
			}
			method2392(108);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.HB(" + i + ',' + i_197_ + ',' + i_198_ + ',' + i_199_ + ')'));
		}
	}

	final void aa(short i, short i_206_) {
		do {
			try {
				d var_d = ((ha) aHa_Sub3_4899).aD938;
				for (int i_207_ = 0; (i_207_ ^ 0xffffffff) > (anInt4948 ^ 0xffffffff); i_207_++) {
					if ((i ^ 0xffffffff) == (aShortArray4954[i_207_] ^ 0xffffffff))
						aShortArray4954[i_207_] = i_206_;
				}
				byte i_208_ = 0;
				byte i_209_ = 0;
				if ((i ^ 0xffffffff) != 0) {
					Class238 class238 = var_d.method11(i & 0xffff, -28755);
					i_209_ = ((Class238) class238).aByte1829;
					i_208_ = ((Class238) class238).aByte1830;
				}
				byte i_210_ = 0;
				byte i_211_ = 0;
				if ((i_206_ ^ 0xffffffff) != 0) {
					Class238 class238 = var_d.method11(i_206_ & 0xffff, -28755);
					i_211_ = ((Class238) class238).aByte1829;
					i_210_ = ((Class238) class238).aByte1830;
					if (((Class238) class238).aByte1823 != 0 || ((Class238) class238).aByte1837 != 0)
						aBoolean4940 = true;
				}
				if (!((i_209_ ^ 0xffffffff) != (i_211_ ^ 0xffffffff) | (i_210_ ^ 0xffffffff) != (i_208_ ^ 0xffffffff)))
					break;
				if (aClass281Array4941 != null) {
					for (int i_212_ = 0; i_212_ < anInt4911; i_212_++) {
						Class281 class281 = aClass281Array4941[i_212_];
						Class181 class181 = aClass181Array4913[i_212_];
						((Class181) class181).anInt1428 = (~0xffffff & ((Class181) class181).anInt1428 | 0xffffff & (Class208.anIntArray1579[(aShortArray4946[(((Class281) class281).anInt2121)]) & 0xffff]));
					}
				}
				method2392(73);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qw.aa(" + i + ',' + i_206_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2344(int i, int[] is, int i_213_, int i_214_, int i_215_, int i_216_, boolean bool) {
		try {
			int i_217_ = is.length;
			if (i == 0) {
				i_214_ <<= 4;
				i_213_ <<= 4;
				i_215_ <<= 4;
				Class271.anInt2035 = 0;
				int i_218_ = 0;
				Class159.anInt1256 = 0;
				Class48_Sub1.anInt3628 = 0;
				for (int i_219_ = 0; (i_219_ ^ 0xffffffff) > (i_217_ ^ 0xffffffff); i_219_++) {
					int i_220_ = is[i_219_];
					if (anIntArrayArray4925.length > i_220_) {
						int[] is_221_ = anIntArrayArray4925[i_220_];
						for (int i_222_ = 0; ((is_221_.length ^ 0xffffffff) < (i_222_ ^ 0xffffffff)); i_222_++) {
							int i_223_ = is_221_[i_222_];
							Class159.anInt1256 += anIntArray4906[i_223_];
							Class48_Sub1.anInt3628 += anIntArray4959[i_223_];
							i_218_++;
							Class271.anInt2035 += anIntArray4935[i_223_];
						}
					}
				}
				if ((i_218_ ^ 0xffffffff) < -1) {
					Class48_Sub1.anInt3628 = Class48_Sub1.anInt3628 / i_218_ + i_214_;
					Class271.anInt2035 = Class271.anInt2035 / i_218_ + i_215_;
					Class159.anInt1256 = Class159.anInt1256 / i_218_ - -i_213_;
				} else {
					Class271.anInt2035 = i_215_;
					Class159.anInt1256 = i_213_;
					Class48_Sub1.anInt3628 = i_214_;
				}
			} else if (i == 1) {
				i_215_ <<= 4;
				i_214_ <<= 4;
				i_213_ <<= 4;
				for (int i_224_ = 0; (i_224_ ^ 0xffffffff) > (i_217_ ^ 0xffffffff); i_224_++) {
					int i_225_ = is[i_224_];
					if ((i_225_ ^ 0xffffffff) > (anIntArrayArray4925.length ^ 0xffffffff)) {
						int[] is_226_ = anIntArrayArray4925[i_225_];
						for (int i_227_ = 0; is_226_.length > i_227_; i_227_++) {
							int i_228_ = is_226_[i_227_];
							anIntArray4906[i_228_] += i_213_;
							anIntArray4959[i_228_] += i_214_;
							anIntArray4935[i_228_] += i_215_;
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -3) {
				for (int i_229_ = 0; i_229_ < i_217_; i_229_++) {
					int i_230_ = is[i_229_];
					if ((anIntArrayArray4925.length ^ 0xffffffff) < (i_230_ ^ 0xffffffff)) {
						int[] is_231_ = anIntArrayArray4925[i_230_];
						if ((0x1 & i_216_ ^ 0xffffffff) != -1) {
							for (int i_232_ = 0; i_232_ < is_231_.length; i_232_++) {
								int i_233_ = is_231_[i_232_];
								anIntArray4906[i_233_] -= Class159.anInt1256;
								anIntArray4959[i_233_] -= Class48_Sub1.anInt3628;
								anIntArray4935[i_233_] -= Class271.anInt2035;
								if ((i_213_ ^ 0xffffffff) != -1) {
									int i_234_ = (Class284_Sub2_Sub2.anIntArray6200[i_213_]);
									int i_235_ = (Class284_Sub2_Sub2.anIntArray6202[i_213_]);
									int i_236_ = ((-(i_234_ * anIntArray4935[i_233_]) + (i_235_ * anIntArray4959[i_233_] - -16383)) >> 445579438);
									anIntArray4935[i_233_] = ((16383 + anIntArray4959[i_233_] * i_234_ - -(i_235_ * anIntArray4935[i_233_])) >> -461350130);
									anIntArray4959[i_233_] = i_236_;
								}
								if ((i_215_ ^ 0xffffffff) != -1) {
									int i_237_ = (Class284_Sub2_Sub2.anIntArray6200[i_215_]);
									int i_238_ = (Class284_Sub2_Sub2.anIntArray6202[i_215_]);
									int i_239_ = ((16383 + (anIntArray4959[i_233_] * i_237_ - -(anIntArray4906[i_233_] * i_238_))) >> -65447186);
									anIntArray4959[i_233_] = (16383 + (-(i_237_ * anIntArray4906[i_233_]) + i_238_ * (anIntArray4959[i_233_])) >> 2069505006);
									anIntArray4906[i_233_] = i_239_;
								}
								if ((i_214_ ^ 0xffffffff) != -1) {
									int i_240_ = (Class284_Sub2_Sub2.anIntArray6200[i_214_]);
									int i_241_ = (Class284_Sub2_Sub2.anIntArray6202[i_214_]);
									int i_242_ = ((anIntArray4906[i_233_] * i_241_ + i_240_ * anIntArray4935[i_233_] + 16383) >> -932225298);
									anIntArray4935[i_233_] = (anIntArray4935[i_233_] * i_241_ - anIntArray4906[i_233_] * i_240_ - -16383) >> 525091886;
									anIntArray4906[i_233_] = i_242_;
								}
								anIntArray4906[i_233_] += Class159.anInt1256;
								anIntArray4959[i_233_] += Class48_Sub1.anInt3628;
								anIntArray4935[i_233_] += Class271.anInt2035;
							}
						} else {
							for (int i_243_ = 0; is_231_.length > i_243_; i_243_++) {
								int i_244_ = is_231_[i_243_];
								anIntArray4906[i_244_] -= Class159.anInt1256;
								anIntArray4959[i_244_] -= Class48_Sub1.anInt3628;
								anIntArray4935[i_244_] -= Class271.anInt2035;
								if (i_215_ != 0) {
									int i_245_ = (Class284_Sub2_Sub2.anIntArray6200[i_215_]);
									int i_246_ = (Class284_Sub2_Sub2.anIntArray6202[i_215_]);
									int i_247_ = ((i_245_ * anIntArray4959[i_244_] - (-(i_246_ * anIntArray4906[i_244_]) - 16383)) >> 879518286);
									anIntArray4959[i_244_] = (i_246_ * anIntArray4959[i_244_] - anIntArray4906[i_244_] * i_245_ - -16383) >> -1200220562;
									anIntArray4906[i_244_] = i_247_;
								}
								if ((i_213_ ^ 0xffffffff) != -1) {
									int i_248_ = (Class284_Sub2_Sub2.anIntArray6200[i_213_]);
									int i_249_ = (Class284_Sub2_Sub2.anIntArray6202[i_213_]);
									int i_250_ = ((16383 + (anIntArray4959[i_244_] * i_249_ + -(i_248_ * anIntArray4935[i_244_]))) >> -185481874);
									anIntArray4935[i_244_] = ((16383 + (anIntArray4935[i_244_] * i_249_ + (i_248_ * anIntArray4959[i_244_]))) >> -752676850);
									anIntArray4959[i_244_] = i_250_;
								}
								if ((i_214_ ^ 0xffffffff) != -1) {
									int i_251_ = (Class284_Sub2_Sub2.anIntArray6200[i_214_]);
									int i_252_ = (Class284_Sub2_Sub2.anIntArray6202[i_214_]);
									int i_253_ = ((16383 + i_251_ * anIntArray4935[i_244_] + i_252_ * anIntArray4906[i_244_]) >> 400648174);
									anIntArray4935[i_244_] = (-(i_251_ * anIntArray4906[i_244_]) + anIntArray4935[i_244_] * i_252_ + 16383) >> -1184273010;
									anIntArray4906[i_244_] = i_253_;
								}
								anIntArray4906[i_244_] += Class159.anInt1256;
								anIntArray4959[i_244_] += Class48_Sub1.anInt3628;
								anIntArray4935[i_244_] += Class271.anInt2035;
							}
						}
					}
				}
				if (bool) {
					for (int i_254_ = 0; (i_254_ ^ 0xffffffff) > (i_217_ ^ 0xffffffff); i_254_++) {
						int i_255_ = is[i_254_];
						if ((i_255_ ^ 0xffffffff) > (anIntArrayArray4925.length ^ 0xffffffff)) {
							int[] is_256_ = anIntArrayArray4925[i_255_];
							for (int i_257_ = 0; is_256_.length > i_257_; i_257_++) {
								int i_258_ = is_256_[i_257_];
								int i_259_ = anIntArray4932[i_258_];
								int i_260_ = anIntArray4932[1 + i_258_];
								for (int i_261_ = i_259_; ((i_261_ ^ 0xffffffff) > (i_260_ ^ 0xffffffff)); i_261_++) {
									int i_262_ = -1 + aShortArray4960[i_261_];
									if (i_262_ == -1)
										break;
									if ((i_215_ ^ 0xffffffff) != -1) {
										int i_263_ = (Class284_Sub2_Sub2.anIntArray6200[i_215_]);
										int i_264_ = (Class284_Sub2_Sub2.anIntArray6202[i_215_]);
										int i_265_ = (aShortArray4953[i_262_] * i_264_ + ((aShortArray4957[i_262_] * i_263_) - -16383)) >> 1290072302;
										aShortArray4957[i_262_] = (short) (((i_264_ * (aShortArray4957[i_262_])) + (-(i_263_ * (aShortArray4953[i_262_])) + 16383)) >> 2047821486);
										aShortArray4953[i_262_] = (short) i_265_;
									}
									if (i_213_ != 0) {
										int i_266_ = (Class284_Sub2_Sub2.anIntArray6200[i_213_]);
										int i_267_ = (Class284_Sub2_Sub2.anIntArray6202[i_213_]);
										int i_268_ = ((-(i_266_ * aShortArray4962[i_262_]) + (aShortArray4957[i_262_] * i_267_) + 16383) >> 133029902);
										aShortArray4962[i_262_] = (short) (((aShortArray4962[i_262_]) * i_267_ + (i_266_ * (aShortArray4957[i_262_])) - -16383) >> 1259097230);
										aShortArray4957[i_262_] = (short) i_268_;
									}
									if ((i_214_ ^ 0xffffffff) != -1) {
										int i_269_ = (Class284_Sub2_Sub2.anIntArray6200[i_214_]);
										int i_270_ = (Class284_Sub2_Sub2.anIntArray6202[i_214_]);
										int i_271_ = ((16383 + ((i_269_ * aShortArray4962[i_262_]) + i_270_ * (aShortArray4953[i_262_]))) >> -1016981842);
										aShortArray4962[i_262_] = (short) (((i_270_ * (aShortArray4962[i_262_])) + -((aShortArray4953[i_262_]) * i_269_) - -16383) >> -2113965746);
										aShortArray4953[i_262_] = (short) i_271_;
									}
								}
							}
						}
					}
					method2404((byte) -64);
				}
			} else if (i == 3) {
				for (int i_272_ = 0; i_217_ > i_272_; i_272_++) {
					int i_273_ = is[i_272_];
					if ((anIntArrayArray4925.length ^ 0xffffffff) < (i_273_ ^ 0xffffffff)) {
						int[] is_274_ = anIntArrayArray4925[i_273_];
						for (int i_275_ = 0; i_275_ < is_274_.length; i_275_++) {
							int i_276_ = is_274_[i_275_];
							anIntArray4906[i_276_] -= Class159.anInt1256;
							anIntArray4959[i_276_] -= Class48_Sub1.anInt3628;
							anIntArray4935[i_276_] -= Class271.anInt2035;
							anIntArray4906[i_276_] = (anIntArray4906[i_276_] * i_213_ >> 1618522887);
							anIntArray4959[i_276_] = anIntArray4959[i_276_] * i_214_ >> 375917447;
							anIntArray4935[i_276_] = anIntArray4935[i_276_] * i_215_ >> 81062407;
							anIntArray4906[i_276_] += Class159.anInt1256;
							anIntArray4959[i_276_] += Class48_Sub1.anInt3628;
							anIntArray4935[i_276_] += Class271.anInt2035;
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -6) {
				if (anIntArrayArray4903 != null) {
					boolean bool_277_ = false;
					for (int i_278_ = 0; (i_217_ ^ 0xffffffff) < (i_278_ ^ 0xffffffff); i_278_++) {
						int i_279_ = is[i_278_];
						if ((i_279_ ^ 0xffffffff) > (anIntArrayArray4903.length ^ 0xffffffff)) {
							int[] is_280_ = anIntArrayArray4903[i_279_];
							for (int i_281_ = 0; ((i_281_ ^ 0xffffffff) > (is_280_.length ^ 0xffffffff)); i_281_++) {
								int i_282_ = is_280_[i_281_];
								int i_283_ = ((aByteArray4958[i_282_] & 0xff) + i_213_ * 8);
								if ((i_283_ ^ 0xffffffff) > -1)
									i_283_ = 0;
								else if ((i_283_ ^ 0xffffffff) < -256)
									i_283_ = 255;
								aByteArray4958[i_282_] = (byte) i_283_;
							}
							bool_277_ = (bool_277_ | (is_280_.length ^ 0xffffffff) < -1);
						}
					}
					if (bool_277_) {
						if (aClass281Array4941 != null) {
							for (int i_284_ = 0; ((i_284_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff)); i_284_++) {
								Class281 class281 = aClass281Array4941[i_284_];
								Class181 class181 = aClass181Array4913[i_284_];
								((Class181) class181).anInt1428 = ((255 - (0xff & (aByteArray4958[(((Class281) class281).anInt2121)])) << 11083608) | (0xffffff & ((Class181) class181).anInt1428));
							}
						}
						method2392(80);
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				if (anIntArrayArray4903 != null) {
					boolean bool_285_ = false;
					for (int i_286_ = 0; (i_217_ ^ 0xffffffff) < (i_286_ ^ 0xffffffff); i_286_++) {
						int i_287_ = is[i_286_];
						if ((i_287_ ^ 0xffffffff) > (anIntArrayArray4903.length ^ 0xffffffff)) {
							int[] is_288_ = anIntArrayArray4903[i_287_];
							for (int i_289_ = 0; ((is_288_.length ^ 0xffffffff) < (i_289_ ^ 0xffffffff)); i_289_++) {
								int i_290_ = is_288_[i_289_];
								int i_291_ = 0xffff & aShortArray4946[i_290_];
								int i_292_ = i_291_ >> 1037371370 & 0x3f;
								int i_293_ = i_291_ >> 552003367 & 0x7;
								int i_294_ = i_291_ & 0x7f;
								i_292_ = i_213_ + i_292_ & 0x3f;
								i_293_ += i_214_ / 4;
								i_294_ += i_215_;
								if (i_293_ >= 0) {
									if ((i_293_ ^ 0xffffffff) < -8)
										i_293_ = 7;
								} else
									i_293_ = 0;
								if ((i_294_ ^ 0xffffffff) > -1)
									i_294_ = 0;
								else if ((i_294_ ^ 0xffffffff) < -128)
									i_294_ = 127;
								aShortArray4946[i_290_] = (short) (Class41.method366((Class41.method366(i_293_ << -1356462873, i_292_ << 967582634)), i_294_));
							}
							bool_285_ = bool_285_ | is_288_.length > 0;
						}
					}
					if (bool_285_) {
						if (aClass281Array4941 != null) {
							for (int i_295_ = 0; anInt4911 > i_295_; i_295_++) {
								Class281 class281 = aClass281Array4941[i_295_];
								Class181 class181 = aClass181Array4913[i_295_];
								((Class181) class181).anInt1428 = ((Class208.anIntArray1579[((aShortArray4946[((Class281) class281).anInt2121]) & 0xffff)]) & 0xffffff | (((Class181) class181).anInt1428 & ~0xffffff));
							}
						}
						method2392(75);
					}
				}
			} else if ((i ^ 0xffffffff) == -9) {
				if (anIntArrayArray4934 != null) {
					for (int i_296_ = 0; i_296_ < i_217_; i_296_++) {
						int i_297_ = is[i_296_];
						if (i_297_ < anIntArrayArray4934.length) {
							int[] is_298_ = anIntArrayArray4934[i_297_];
							for (int i_299_ = 0; i_299_ < is_298_.length; i_299_++) {
								Class181 class181 = aClass181Array4913[is_298_[i_299_]];
								((Class181) class181).anInt1427 += i_214_;
								((Class181) class181).anInt1426 += i_213_;
							}
						}
					}
				}
			} else if (i == 10) {
				if (anIntArrayArray4934 != null) {
					for (int i_300_ = 0; (i_217_ ^ 0xffffffff) < (i_300_ ^ 0xffffffff); i_300_++) {
						int i_301_ = is[i_300_];
						if ((i_301_ ^ 0xffffffff) > (anIntArrayArray4934.length ^ 0xffffffff)) {
							int[] is_302_ = anIntArrayArray4934[i_301_];
							for (int i_303_ = 0; is_302_.length > i_303_; i_303_++) {
								Class181 class181 = aClass181Array4913[is_302_[i_303_]];
								((Class181) class181).anInt1425 = (((Class181) class181).anInt1425 * i_214_ >> 993080359);
								((Class181) class181).anInt1429 = (((Class181) class181).anInt1429 * i_213_ >> -1056891193);
							}
						}
					}
				}
			} else if (i == 9) {
				if (anIntArrayArray4934 != null) {
					for (int i_304_ = 0; i_217_ > i_304_; i_304_++) {
						int i_305_ = is[i_304_];
						if ((anIntArrayArray4934.length ^ 0xffffffff) < (i_305_ ^ 0xffffffff)) {
							int[] is_306_ = anIntArrayArray4934[i_305_];
							for (int i_307_ = 0; i_307_ < is_306_.length; i_307_++) {
								Class181 class181 = aClass181Array4913[is_306_[i_307_]];
								((Class181) class181).anInt1431 = (((Class181) class181).anInt1431 + i_213_ & 0x3fff);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.BA(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_213_ + ',' + i_214_ + ',' + i_215_ + ',' + i_216_ + ',' + bool + ')'));
		}
	}

	final int G() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4937;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.G(" + ')');
		}
	}

	final AbstractModel method2341(byte i, int i_308_, boolean bool) {
		try {
			Class146_Sub3 class146_sub3_309_;
			Class146_Sub3 class146_sub3_310_;
			if (i != 1) {
				if ((i ^ 0xffffffff) != -3) {
					if (i == 3) {
						class146_sub3_310_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4661;
						class146_sub3_309_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4657;
					} else if ((i ^ 0xffffffff) != -5) {
						if (i != 5)
							class146_sub3_310_ = class146_sub3_309_ = new Class146_Sub3(aHa_Sub3_4899, 0, 0, true, false);
						else {
							class146_sub3_309_ = (((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4662);
							class146_sub3_310_ = (((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4670);
						}
					} else {
						class146_sub3_309_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4650;
						class146_sub3_310_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4649;
					}
				} else {
					class146_sub3_309_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4651;
					class146_sub3_310_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4658;
				}
			} else {
				class146_sub3_309_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4665;
				class146_sub3_310_ = ((ha_Sub3) aHa_Sub3_4899).aClass146_Sub3_4656;
			}
			return method2395(class146_sub3_309_, i_308_, bool, i != 0, -83, class146_sub3_310_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.T(" + i + ',' + i_308_ + ',' + bool + ')'));
		}
	}

	final int ua() {
		try {
			return anInt4942;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.ua(" + ')');
		}
	}

	final void FA(int i) {
		try {
			int i_311_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_312_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_313_ = 0; (anInt4912 ^ 0xffffffff) < (i_313_ ^ 0xffffffff); i_313_++) {
				int i_314_ = ((i_312_ * anIntArray4959[i_313_] + -(i_311_ * anIntArray4935[i_313_])) >> -721294770);
				anIntArray4935[i_313_] = (i_312_ * anIntArray4935[i_313_] + i_311_ * anIntArray4959[i_313_]) >> -1169103346;
				anIntArray4959[i_313_] = i_314_;
			}
			method2410(-127);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.FA(" + i + ')');
		}
	}

	final void O(int i, int i_315_, int i_316_) {
		try {
			for (int i_317_ = 0; (i_317_ ^ 0xffffffff) > (anInt4912 ^ 0xffffffff); i_317_++) {
				if ((i ^ 0xffffffff) != -129)
					anIntArray4906[i_317_] = i * anIntArray4906[i_317_] >> 1387855815;
				if (i_315_ != 128)
					anIntArray4959[i_317_] = anIntArray4959[i_317_] * i_315_ >> 1950580391;
				if (i_316_ != 128)
					anIntArray4935[i_317_] = anIntArray4935[i_317_] * i_316_ >> 1112352167;
			}
			method2410(-57);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.O(" + i + ',' + i_315_ + ',' + i_316_ + ')'));
		}
	}

	final int da() {
		try {
			return aShort4905;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.da(" + ')');
		}
	}

	final Class35[] method2322() {
		try {
			return aClass35Array4919;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.PB(" + ')');
		}
	}

	final void method2329(Class111 class111, Class246_Sub6 class246_sub6, int i, int i_318_) {
		try {
			if ((anInt4936 ^ 0xffffffff) != -1) {
				Class111_Sub3 class111_sub3 = ((ha_Sub3) aHa_Sub3_4899).aClass111_Sub3_4543;
				Class111_Sub3 class111_sub3_319_ = (Class111_Sub3) class111;
				if (!aBoolean4922)
					method2401(-21065);
				Class322.aFloat2712 = ((((Class111_Sub3) class111_sub3).aFloat4708 * ((Class111_Sub3) class111_sub3_319_).aFloat4702) + (((Class111_Sub3) class111_sub3_319_).aFloat4709 * ((Class111_Sub3) class111_sub3).aFloat4713) + (((Class111_Sub3) class111_sub3_319_).aFloat4703 * ((Class111_Sub3) class111_sub3).aFloat4704) + ((Class111_Sub3) class111_sub3).aFloat4703);
				Class64_Sub18.aFloat3691 = ((((Class111_Sub3) class111_sub3).aFloat4704 * ((Class111_Sub3) class111_sub3_319_).aFloat4713) + ((((Class111_Sub3) class111_sub3).aFloat4713 * ((Class111_Sub3) class111_sub3_319_).aFloat4706) + (((Class111_Sub3) class111_sub3_319_).aFloat4711 * ((Class111_Sub3) class111_sub3).aFloat4708)));
				float f = ((float) anInt4956 * Class64_Sub18.aFloat3691 + Class322.aFloat2712);
				float f_320_ = ((float) anInt4950 * Class64_Sub18.aFloat3691 + Class322.aFloat2712);
				float f_321_;
				float f_322_;
				if (!(f_320_ < f)) {
					f_321_ = (float) -anInt4939 + f;
					f_322_ = (float) anInt4939 + f_320_;
				} else {
					f_321_ = (float) -anInt4939 + f_320_;
					f_322_ = (float) anInt4939 + f;
				}
				if (!(((ha_Sub3) aHa_Sub3_4899).aFloat4642 <= f_321_) && !((float) ((ha_Sub3) aHa_Sub3_4899).anInt4640 >= f_322_)) {
					Class98_Sub42.aFloat4234 = ((((Class111_Sub3) class111_sub3_319_).aFloat4713 * ((Class111_Sub3) class111_sub3).aFloat4705) + ((((Class111_Sub3) class111_sub3_319_).aFloat4706 * ((Class111_Sub3) class111_sub3).aFloat4711) + ((((Class111_Sub3) class111_sub3_319_).aFloat4711) * (((Class111_Sub3) class111_sub3).aFloat4712))));
					Class98_Sub43_Sub2.aFloat5909 = (((Class111_Sub3) class111_sub3).aFloat4702 + ((((Class111_Sub3) class111_sub3_319_).aFloat4703 * ((Class111_Sub3) class111_sub3).aFloat4705) + (((((Class111_Sub3) class111_sub3_319_).aFloat4709) * ((Class111_Sub3) class111_sub3).aFloat4711) + ((((Class111_Sub3) class111_sub3_319_).aFloat4702) * (((Class111_Sub3) class111_sub3).aFloat4712)))));
					float f_323_ = (Class98_Sub42.aFloat4234 * (float) anInt4956 + Class98_Sub43_Sub2.aFloat5909);
					float f_324_ = (Class98_Sub43_Sub2.aFloat5909 + (float) anInt4950 * Class98_Sub42.aFloat4234);
					float f_325_;
					float f_326_;
					if (!(f_324_ < f_323_)) {
						f_326_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4593 * (f_324_ + (float) anInt4939));
						f_325_ = (((float) -anInt4939 + f_323_) * (float) ((ha_Sub3) aHa_Sub3_4899).anInt4593);
					} else {
						f_325_ = (((float) -anInt4939 + f_324_) * (float) ((ha_Sub3) aHa_Sub3_4899).anInt4593);
						f_326_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4593 * (f_323_ + (float) anInt4939));
					}
					if (!(f_325_ / (float) i >= ((ha_Sub3) aHa_Sub3_4899).aFloat4647) && !(((ha_Sub3) aHa_Sub3_4899).aFloat4641 >= f_326_ / (float) i)) {
						Class366.aFloat3120 = ((((Class111_Sub3) class111_sub3_319_).aFloat4706 * ((Class111_Sub3) class111_sub3).aFloat4706) + ((((Class111_Sub3) class111_sub3_319_).aFloat4711) * ((Class111_Sub3) class111_sub3).aFloat4714) + ((((Class111_Sub3) class111_sub3_319_).aFloat4713) * (((Class111_Sub3) class111_sub3).aFloat4710)));
						Class339_Sub1.aFloat5316 = (((Class111_Sub3) class111_sub3).aFloat4709 + (((((Class111_Sub3) class111_sub3_319_).aFloat4709) * (((Class111_Sub3) class111_sub3).aFloat4706)) + (((Class111_Sub3) class111_sub3).aFloat4714 * (((Class111_Sub3) class111_sub3_319_).aFloat4702)) + ((((Class111_Sub3) class111_sub3_319_).aFloat4703) * (((Class111_Sub3) class111_sub3).aFloat4710))));
						float f_327_ = (Class339_Sub1.aFloat5316 + (float) anInt4956 * Class366.aFloat3120);
						float f_328_ = (Class339_Sub1.aFloat5316 + Class366.aFloat3120 * (float) anInt4950);
						float f_329_;
						float f_330_;
						if (!(f_328_ < f_327_)) {
							f_330_ = (((float) -anInt4939 + f_327_) * (float) (((ha_Sub3) aHa_Sub3_4899).anInt4589));
							f_329_ = (((float) anInt4939 + f_328_) * (float) (((ha_Sub3) aHa_Sub3_4899).anInt4589));
						} else {
							f_329_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4589 * ((float) anInt4939 + f_327_));
							f_330_ = ((float) ((ha_Sub3) aHa_Sub3_4899).anInt4589 * (f_328_ - (float) anInt4939));
						}
						if (!(((ha_Sub3) aHa_Sub3_4899).aFloat4584 <= f_330_ / (float) i) && !(f_329_ / (float) i <= ((ha_Sub3) aHa_Sub3_4899).aFloat4610)) {
							if (class246_sub6 != null || aClass281Array4941 != null) {
								Class134.aFloat3463 = (((((Class111_Sub3) class111_sub3_319_).aFloat4704) * (((Class111_Sub3) class111_sub3).aFloat4704)) + ((((Class111_Sub3) class111_sub3_319_).aFloat4705 * (((Class111_Sub3) class111_sub3).aFloat4708)) + ((((Class111_Sub3) class111_sub3).aFloat4713) * (((Class111_Sub3) class111_sub3_319_).aFloat4710))));
								Class373_Sub2.aFloat5472 = (((((Class111_Sub3) class111_sub3_319_).aFloat4705) * (((Class111_Sub3) class111_sub3).aFloat4712)) + ((((Class111_Sub3) class111_sub3_319_).aFloat4710) * (((Class111_Sub3) class111_sub3).aFloat4711)) + ((((Class111_Sub3) class111_sub3_319_).aFloat4704) * (((Class111_Sub3) class111_sub3).aFloat4705)));
								Canvas_Sub1.aFloat25 = (((((Class111_Sub3) class111_sub3_319_).aFloat4712) * (((Class111_Sub3) class111_sub3).aFloat4712)) + ((((Class111_Sub3) class111_sub3).aFloat4711) * ((Class111_Sub3) class111_sub3_319_).aFloat4714) + ((((Class111_Sub3) class111_sub3).aFloat4705) * ((Class111_Sub3) class111_sub3_319_).aFloat4708));
								GameInterface.aFloat3948 = (((((Class111_Sub3) class111_sub3).aFloat4706) * (((Class111_Sub3) class111_sub3_319_).aFloat4714)) + ((((Class111_Sub3) class111_sub3).aFloat4714) * ((Class111_Sub3) class111_sub3_319_).aFloat4712) + ((((Class111_Sub3) class111_sub3).aFloat4710) * ((Class111_Sub3) class111_sub3_319_).aFloat4708));
								Class64_Sub17.aFloat3686 = (((((Class111_Sub3) class111_sub3).aFloat4713) * (((Class111_Sub3) class111_sub3_319_).aFloat4714)) + ((((Class111_Sub3) class111_sub3).aFloat4708) * ((Class111_Sub3) class111_sub3_319_).aFloat4712) + ((((Class111_Sub3) class111_sub3).aFloat4704) * ((Class111_Sub3) class111_sub3_319_).aFloat4708));
								Class100.aFloat845 = (((((Class111_Sub3) class111_sub3_319_).aFloat4704) * (((Class111_Sub3) class111_sub3).aFloat4710)) + (((((Class111_Sub3) class111_sub3).aFloat4706) * ((Class111_Sub3) class111_sub3_319_).aFloat4710) + (((Class111_Sub3) class111_sub3_319_).aFloat4705 * (((Class111_Sub3) class111_sub3).aFloat4714))));
							}
							if (class246_sub6 != null) {
								int i_331_ = anInt4910 + anInt4924 >> -185387967;
								int i_332_ = anInt4921 + anInt4937 >> 683245665;
								int i_333_ = (int) ((Class373_Sub2.aFloat5472 * (float) i_332_) + (((float) anInt4956 * Class98_Sub42.aFloat4234) + ((Class98_Sub43_Sub2.aFloat5909) + ((float) i_331_ * (Canvas_Sub1.aFloat25)))));
								int i_334_ = (int) ((Class366.aFloat3120 * (float) anInt4956) + (Class339_Sub1.aFloat5316 + ((float) i_331_ * GameInterface.aFloat3948)) + (Class100.aFloat845 * (float) i_332_));
								int i_335_ = (int) (((float) i_331_ * Class64_Sub17.aFloat3686) + Class322.aFloat2712 + (Class64_Sub18.aFloat3691 * (float) anInt4956) + ((float) i_332_ * Class134.aFloat3463));
								int i_336_ = (int) (((float) i_332_ * Class373_Sub2.aFloat5472) + ((Class98_Sub42.aFloat4234 * (float) anInt4950) + ((Class98_Sub43_Sub2.aFloat5909) + ((float) i_331_ * (Canvas_Sub1.aFloat25)))));
								int i_337_ = (int) (Class339_Sub1.aFloat5316 + ((float) i_331_ * GameInterface.aFloat3948) + (Class366.aFloat3120 * (float) anInt4950) + ((float) i_332_ * Class100.aFloat845));
								((Class246_Sub6) class246_sub6).anInt5112 = (((ha_Sub3) aHa_Sub3_4899).anInt4587 - -(((ha_Sub3) aHa_Sub3_4899).anInt4589 * i_337_ / i));
								int i_338_ = (int) ((Class134.aFloat3463 * (float) i_332_) + (((float) anInt4950 * Class64_Sub18.aFloat3691) + (Class322.aFloat2712 + ((float) i_331_ * (Class64_Sub17.aFloat3686)))));
								((Class246_Sub6) class246_sub6).anInt5110 = ((((ha_Sub3) aHa_Sub3_4899).anInt4593 * i_336_ / i) + ((ha_Sub3) aHa_Sub3_4899).anInt4645);
								((Class246_Sub6) class246_sub6).anInt5111 = ((i_333_ * ((ha_Sub3) aHa_Sub3_4899).anInt4593 / i) + ((ha_Sub3) aHa_Sub3_4899).anInt4645);
								((Class246_Sub6) class246_sub6).anInt5113 = (((ha_Sub3) aHa_Sub3_4899).anInt4587 - -(i_334_ * (((ha_Sub3) aHa_Sub3_4899).anInt4589) / i));
								if (((i_335_ ^ 0xffffffff) <= (((ha_Sub3) aHa_Sub3_4899).anInt4640 ^ 0xffffffff)) || ((i_338_ ^ 0xffffffff) <= (((ha_Sub3) aHa_Sub3_4899).anInt4640 ^ 0xffffffff))) {
									((Class246_Sub6) class246_sub6).aBoolean5114 = true;
									((Class246_Sub6) class246_sub6).anInt5109 = (((ha_Sub3) aHa_Sub3_4899).anInt4645 + (((i_333_ - -anInt4939) * (((ha_Sub3) aHa_Sub3_4899).anInt4593) / i) + -((Class246_Sub6) class246_sub6).anInt5111));
								}
							}
							aHa_Sub3_4899.method2056(-123, (float) i);
							aHa_Sub3_4899.method1937(4);
							aHa_Sub3_4899.method2049(0, class111_sub3_319_);
							method2407(29084);
							method2393(-29619);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.U(" + (class111 != null ? "{...}" : "null") + ',' + (class246_sub6 != null ? "{...}" : "null") + ',' + i + ',' + i_318_ + ')'));
		}
	}

	final int WA() {
		try {
			return aShort4902;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.WA(" + ')');
		}
	}

	final void I(int i, int[] is, int i_339_, int i_340_, int i_341_, boolean bool, int i_342_, int[] is_343_) {
		try {
			int i_344_ = is.length;
			if (i == 0) {
				i_340_ <<= 4;
				i_339_ <<= 4;
				i_341_ <<= 4;
				Class159.anInt1256 = 0;
				int i_345_ = 0;
				Class271.anInt2035 = 0;
				Class48_Sub1.anInt3628 = 0;
				for (int i_346_ = 0; (i_346_ ^ 0xffffffff) > (i_344_ ^ 0xffffffff); i_346_++) {
					int i_347_ = is[i_346_];
					if ((i_347_ ^ 0xffffffff) > (anIntArrayArray4925.length ^ 0xffffffff)) {
						int[] is_348_ = anIntArrayArray4925[i_347_];
						for (int i_349_ = 0; ((is_348_.length ^ 0xffffffff) < (i_349_ ^ 0xffffffff)); i_349_++) {
							int i_350_ = is_348_[i_349_];
							if (aShortArray4944 == null || (i_342_ & aShortArray4944[i_350_] ^ 0xffffffff) != -1) {
								Class159.anInt1256 += anIntArray4906[i_350_];
								Class48_Sub1.anInt3628 += anIntArray4959[i_350_];
								i_345_++;
								Class271.anInt2035 += anIntArray4935[i_350_];
							}
						}
					}
				}
				if ((i_345_ ^ 0xffffffff) >= -1) {
					Class159.anInt1256 = i_339_;
					Class48_Sub1.anInt3628 = i_340_;
					Class271.anInt2035 = i_341_;
				} else {
					Class271.anInt2035 = i_341_ + Class271.anInt2035 / i_345_;
					Class98_Sub10.aBoolean3862 = true;
					Class48_Sub1.anInt3628 = Class48_Sub1.anInt3628 / i_345_ - -i_340_;
					Class159.anInt1256 = i_339_ + Class159.anInt1256 / i_345_;
				}
			} else if ((i ^ 0xffffffff) == -2) {
				if (is_343_ != null) {
					int i_351_ = ((is_343_[1] * i_340_ + i_339_ * is_343_[0] + (i_341_ * is_343_[2] - -8192)) >> -297975666);
					int i_352_ = ((i_341_ * is_343_[5] + i_340_ * is_343_[4] + is_343_[3] * i_339_ + 8192) >> -450194290);
					int i_353_ = (i_340_ * is_343_[7] + (is_343_[6] * i_339_ + i_341_ * is_343_[8]) - -8192) >> -717041778;
					i_339_ = i_351_;
					i_340_ = i_352_;
					i_341_ = i_353_;
				}
				i_341_ <<= 4;
				i_340_ <<= 4;
				i_339_ <<= 4;
				for (int i_354_ = 0; i_354_ < i_344_; i_354_++) {
					int i_355_ = is[i_354_];
					if (i_355_ < anIntArrayArray4925.length) {
						int[] is_356_ = anIntArrayArray4925[i_355_];
						for (int i_357_ = 0; ((i_357_ ^ 0xffffffff) > (is_356_.length ^ 0xffffffff)); i_357_++) {
							int i_358_ = is_356_[i_357_];
							if (aShortArray4944 == null || (aShortArray4944[i_358_] & i_342_) != 0) {
								anIntArray4906[i_358_] += i_339_;
								anIntArray4959[i_358_] += i_340_;
								anIntArray4935[i_358_] += i_341_;
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -3) {
				if (is_343_ != null) {
					int i_359_ = is_343_[9] << -2057775004;
					int i_360_ = is_343_[10] << -1149619324;
					int i_361_ = is_343_[11] << -314860284;
					int i_362_ = is_343_[12] << 65193988;
					int i_363_ = is_343_[13] << 230320484;
					int i_364_ = is_343_[14] << -2013413692;
					if (Class98_Sub10.aBoolean3862) {
						int i_365_ = ((8192 + is_343_[3] * Class48_Sub1.anInt3628 + Class159.anInt1256 * is_343_[0] + is_343_[6] * Class271.anInt2035) >> -546007570);
						int i_366_ = ((8192 + Class159.anInt1256 * is_343_[1] + (is_343_[4] * Class48_Sub1.anInt3628 - -(Class271.anInt2035 * is_343_[7]))) >> -1553249426);
						i_365_ += i_362_;
						i_366_ += i_363_;
						int i_367_ = ((is_343_[8] * Class271.anInt2035 + (Class159.anInt1256 * is_343_[2] + Class48_Sub1.anInt3628 * is_343_[5] + 8192)) >> -1809377138);
						Class159.anInt1256 = i_365_;
						Class48_Sub1.anInt3628 = i_366_;
						i_367_ += i_364_;
						Class98_Sub10.aBoolean3862 = false;
						Class271.anInt2035 = i_367_;
					}
					int[] is_368_ = new int[9];
					int i_369_ = Class284_Sub2_Sub2.anIntArray6202[i_339_];
					int i_370_ = Class284_Sub2_Sub2.anIntArray6200[i_339_];
					int i_371_ = Class284_Sub2_Sub2.anIntArray6202[i_340_];
					int i_372_ = Class284_Sub2_Sub2.anIntArray6200[i_340_];
					int i_373_ = Class284_Sub2_Sub2.anIntArray6202[i_341_];
					int i_374_ = Class284_Sub2_Sub2.anIntArray6200[i_341_];
					int i_375_ = 8192 + i_370_ * i_373_ >> 1770356814;
					int i_376_ = 8192 + i_374_ * i_370_ >> -51726738;
					is_368_[3] = 8192 + i_374_ * i_369_ >> 1062155310;
					is_368_[5] = -i_370_;
					is_368_[2] = i_369_ * i_372_ - -8192 >> 55094222;
					is_368_[1] = (-i_371_ * i_374_ + (i_375_ * i_372_ + 8192) >> -708894034);
					is_368_[8] = i_369_ * i_371_ - -8192 >> -1650781618;
					is_368_[6] = (i_373_ * -i_372_ - -(i_371_ * i_376_) - -8192 >> 21669550);
					is_368_[0] = (i_371_ * i_373_ - -(i_376_ * i_372_) + 8192 >> -1363422290);
					is_368_[7] = (8192 + (i_372_ * i_374_ - -(i_371_ * i_375_)) >> 942796078);
					is_368_[4] = 8192 + i_369_ * i_373_ >> -1801107186;
					int i_377_ = ((-Class159.anInt1256 * is_368_[0] + (-Class48_Sub1.anInt3628 * is_368_[1] + (-Class271.anInt2035 * is_368_[2] + 8192))) >> -249354002);
					int i_378_ = ((8192 + is_368_[5] * -Class271.anInt2035 + (is_368_[3] * -Class159.anInt1256 + is_368_[4] * -Class48_Sub1.anInt3628)) >> 2119544014);
					int i_379_ = ((8192 + is_368_[7] * -Class48_Sub1.anInt3628 + (-Class159.anInt1256 * is_368_[6] - -(is_368_[8] * -Class271.anInt2035))) >> 709762958);
					int i_380_ = i_377_ + Class159.anInt1256;
					int i_381_ = Class48_Sub1.anInt3628 + i_378_;
					int i_382_ = Class271.anInt2035 + i_379_;
					int[] is_383_ = new int[9];
					for (int i_384_ = 0; i_384_ < 3; i_384_++) {
						for (int i_385_ = 0; (i_385_ ^ 0xffffffff) > -4; i_385_++) {
							int i_386_ = 0;
							for (int i_387_ = 0; i_387_ < 3; i_387_++)
								i_386_ += (is_343_[i_385_ * 3 + i_387_] * is_368_[i_384_ * 3 - -i_387_]);
							is_383_[i_384_ * 3 - -i_385_] = 8192 + i_386_ >> 537558350;
						}
					}
					int i_388_ = (8192 + (is_368_[1] * i_363_ + is_368_[0] * i_362_ - -(i_364_ * is_368_[2])) >> 38009454);
					int i_389_ = ((8192 + is_368_[3] * i_362_ + is_368_[4] * i_363_ - -(i_364_ * is_368_[5])) >> -860146482);
					i_388_ += i_380_;
					i_389_ += i_381_;
					int i_390_ = ((8192 + i_363_ * is_368_[7] + (i_362_ * is_368_[6] - -(is_368_[8] * i_364_))) >> 1426342734);
					i_390_ += i_382_;
					int[] is_391_ = new int[9];
					for (int i_392_ = 0; (i_392_ ^ 0xffffffff) > -4; i_392_++) {
						for (int i_393_ = 0; (i_393_ ^ 0xffffffff) > -4; i_393_++) {
							int i_394_ = 0;
							for (int i_395_ = 0; (i_395_ ^ 0xffffffff) > -4; i_395_++)
								i_394_ += (is_383_[i_395_ * 3 + i_393_] * is_343_[i_395_ + i_392_ * 3]);
							is_391_[i_392_ * 3 + i_393_] = 8192 + i_394_ >> -1909840882;
						}
					}
					int i_396_ = (i_390_ * is_343_[2] + (i_389_ * is_343_[1] + (is_343_[0] * i_388_ - -8192)) >> -1669380050);
					int i_397_ = (8192 + i_388_ * is_343_[3] + (is_343_[4] * i_389_ + i_390_ * is_343_[5]) >> 2007613838);
					i_396_ += i_359_;
					i_397_ += i_360_;
					int i_398_ = (8192 + (i_388_ * is_343_[6] - -(is_343_[7] * i_389_) - -(i_390_ * is_343_[8])) >> -243383218);
					i_398_ += i_361_;
					for (int i_399_ = 0; (i_399_ ^ 0xffffffff) > (i_344_ ^ 0xffffffff); i_399_++) {
						int i_400_ = is[i_399_];
						if (anIntArrayArray4925.length > i_400_) {
							int[] is_401_ = anIntArrayArray4925[i_400_];
							for (int i_402_ = 0; ((i_402_ ^ 0xffffffff) > (is_401_.length ^ 0xffffffff)); i_402_++) {
								int i_403_ = is_401_[i_402_];
								if (aShortArray4944 == null || (aShortArray4944[i_403_] & i_342_ ^ 0xffffffff) != -1) {
									int i_404_ = ((8192 + (anIntArray4935[i_403_] * is_391_[2]) + ((anIntArray4959[i_403_] * is_391_[1]) + (is_391_[0] * anIntArray4906[i_403_]))) >> 1946774638);
									int i_405_ = ((8192 + ((is_391_[5] * anIntArray4935[i_403_]) + (anIntArray4959[i_403_] * is_391_[4])) + (is_391_[3] * anIntArray4906[i_403_])) >> 673886830);
									int i_406_ = ((is_391_[8] * anIntArray4935[i_403_] + (is_391_[7] * anIntArray4959[i_403_]) + (is_391_[6] * anIntArray4906[i_403_]) + 8192) >> 1381701934);
									i_404_ += i_396_;
									i_405_ += i_397_;
									anIntArray4906[i_403_] = i_404_;
									i_406_ += i_398_;
									anIntArray4959[i_403_] = i_405_;
									anIntArray4935[i_403_] = i_406_;
								}
							}
						}
					}
				} else {
					for (int i_407_ = 0; i_344_ > i_407_; i_407_++) {
						int i_408_ = is[i_407_];
						if ((i_408_ ^ 0xffffffff) > (anIntArrayArray4925.length ^ 0xffffffff)) {
							int[] is_409_ = anIntArrayArray4925[i_408_];
							for (int i_410_ = 0; is_409_.length > i_410_; i_410_++) {
								int i_411_ = is_409_[i_410_];
								if (aShortArray4944 == null || (aShortArray4944[i_411_] & i_342_ ^ 0xffffffff) != -1) {
									anIntArray4906[i_411_] -= Class159.anInt1256;
									anIntArray4959[i_411_] -= Class48_Sub1.anInt3628;
									anIntArray4935[i_411_] -= Class271.anInt2035;
									if (i_341_ != 0) {
										int i_412_ = (Class284_Sub2_Sub2.anIntArray6200[i_341_]);
										int i_413_ = (Class284_Sub2_Sub2.anIntArray6202[i_341_]);
										int i_414_ = ((16383 + ((i_413_ * anIntArray4906[i_411_]) + (anIntArray4959[i_411_] * i_412_))) >> 1282326286);
										anIntArray4959[i_411_] = (-(anIntArray4906[i_411_] * i_412_) + ((i_413_ * anIntArray4959[i_411_]) - -16383)) >> 335810830;
										anIntArray4906[i_411_] = i_414_;
									}
									if (i_339_ != 0) {
										int i_415_ = (Class284_Sub2_Sub2.anIntArray6200[i_339_]);
										int i_416_ = (Class284_Sub2_Sub2.anIntArray6202[i_339_]);
										int i_417_ = ((16383 + (anIntArray4959[i_411_] * i_416_) - (i_415_ * anIntArray4935[i_411_])) >> -1366478770);
										anIntArray4935[i_411_] = (anIntArray4959[i_411_] * i_415_ + ((anIntArray4935[i_411_] * i_416_) - -16383)) >> 1555507054;
										anIntArray4959[i_411_] = i_417_;
									}
									if (i_340_ != 0) {
										int i_418_ = (Class284_Sub2_Sub2.anIntArray6200[i_340_]);
										int i_419_ = (Class284_Sub2_Sub2.anIntArray6202[i_340_]);
										int i_420_ = ((i_418_ * anIntArray4935[i_411_] + (anIntArray4906[i_411_] * i_419_) - -16383) >> 1223188654);
										anIntArray4935[i_411_] = ((16383 + -(i_418_ * anIntArray4906[i_411_]) + (i_419_ * anIntArray4935[i_411_])) >> 1779323214);
										anIntArray4906[i_411_] = i_420_;
									}
									anIntArray4906[i_411_] += Class159.anInt1256;
									anIntArray4959[i_411_] += Class48_Sub1.anInt3628;
									anIntArray4935[i_411_] += Class271.anInt2035;
								}
							}
						}
					}
					if (bool) {
						for (int i_421_ = 0; i_344_ > i_421_; i_421_++) {
							int i_422_ = is[i_421_];
							if (anIntArrayArray4925.length > i_422_) {
								int[] is_423_ = anIntArrayArray4925[i_422_];
								for (int i_424_ = 0; ((is_423_.length ^ 0xffffffff) < (i_424_ ^ 0xffffffff)); i_424_++) {
									int i_425_ = is_423_[i_424_];
									if (aShortArray4944 == null || ((i_342_ & aShortArray4944[i_425_]) != 0)) {
										int i_426_ = anIntArray4932[i_425_];
										int i_427_ = anIntArray4932[1 + i_425_];
										for (int i_428_ = i_426_; ((i_427_ ^ 0xffffffff) < (i_428_ ^ 0xffffffff)); i_428_++) {
											int i_429_ = aShortArray4960[i_428_] + -1;
											if ((i_429_ ^ 0xffffffff) == 0)
												break;
											if ((i_341_ ^ 0xffffffff) != -1) {
												int i_430_ = (Class284_Sub2_Sub2.anIntArray6200[i_341_]);
												int i_431_ = (Class284_Sub2_Sub2.anIntArray6202[i_341_]);
												int i_432_ = (((i_430_ * (aShortArray4957[i_429_])) - -((aShortArray4953[i_429_]) * i_431_) + 16383) >> -343227890);
												aShortArray4957[i_429_] = (short) ((-(i_430_ * (aShortArray4953[i_429_])) + ((i_431_ * (aShortArray4957[i_429_])) + 16383)) >> -125577522);
												aShortArray4953[i_429_] = (short) i_432_;
											}
											if (i_339_ != 0) {
												int i_433_ = (Class284_Sub2_Sub2.anIntArray6200[i_339_]);
												int i_434_ = (Class284_Sub2_Sub2.anIntArray6202[i_339_]);
												int i_435_ = ((16383 + -(i_433_ * (aShortArray4962[i_429_])) + (aShortArray4957[i_429_]) * i_434_) >> 133625070);
												aShortArray4962[i_429_] = (short) ((16383 + (((aShortArray4962[i_429_]) * i_434_) + (i_433_ * (aShortArray4957[i_429_])))) >> -1117990962);
												aShortArray4957[i_429_] = (short) i_435_;
											}
											if ((i_340_ ^ 0xffffffff) != -1) {
												int i_436_ = (Class284_Sub2_Sub2.anIntArray6200[i_340_]);
												int i_437_ = (Class284_Sub2_Sub2.anIntArray6202[i_340_]);
												int i_438_ = ((16383 + (i_437_ * (aShortArray4953[i_429_])) + (i_436_ * (aShortArray4962[i_429_]))) >> -153226066);
												aShortArray4962[i_429_] = (short) ((16383 + (-((aShortArray4953[i_429_]) * i_436_) + (i_437_ * (aShortArray4962[i_429_])))) >> -1863313682);
												aShortArray4953[i_429_] = (short) i_438_;
											}
										}
									}
								}
							}
						}
						method2404((byte) -64);
					}
				}
			} else if (i == 3) {
				if (is_343_ == null) {
					for (int i_439_ = 0; (i_344_ ^ 0xffffffff) < (i_439_ ^ 0xffffffff); i_439_++) {
						int i_440_ = is[i_439_];
						if (anIntArrayArray4925.length > i_440_) {
							int[] is_441_ = anIntArrayArray4925[i_440_];
							for (int i_442_ = 0; ((is_441_.length ^ 0xffffffff) < (i_442_ ^ 0xffffffff)); i_442_++) {
								int i_443_ = is_441_[i_442_];
								if (aShortArray4944 == null || (i_342_ & aShortArray4944[i_443_] ^ 0xffffffff) != -1) {
									anIntArray4906[i_443_] -= Class159.anInt1256;
									anIntArray4959[i_443_] -= Class48_Sub1.anInt3628;
									anIntArray4935[i_443_] -= Class271.anInt2035;
									anIntArray4906[i_443_] = (i_339_ * anIntArray4906[i_443_] >> 1857229127);
									anIntArray4959[i_443_] = (i_340_ * anIntArray4959[i_443_] >> 762693767);
									anIntArray4935[i_443_] = (anIntArray4935[i_443_] * i_341_ >> 1319107975);
									anIntArray4906[i_443_] += Class159.anInt1256;
									anIntArray4959[i_443_] += Class48_Sub1.anInt3628;
									anIntArray4935[i_443_] += Class271.anInt2035;
								}
							}
						}
					}
				} else {
					int i_444_ = is_343_[9] << -1072485180;
					int i_445_ = is_343_[10] << 637504484;
					int i_446_ = is_343_[11] << -1464152764;
					int i_447_ = is_343_[12] << -1062932860;
					int i_448_ = is_343_[13] << -197946108;
					int i_449_ = is_343_[14] << -685372828;
					if (Class98_Sub10.aBoolean3862) {
						int i_450_ = ((is_343_[6] * Class271.anInt2035 + is_343_[3] * Class48_Sub1.anInt3628 + is_343_[0] * Class159.anInt1256 - -8192) >> -1799677650);
						int i_451_ = ((is_343_[1] * Class159.anInt1256 - (-(Class48_Sub1.anInt3628 * is_343_[4]) - (is_343_[7] * Class271.anInt2035 + 8192))) >> -20248434);
						int i_452_ = ((8192 + (Class159.anInt1256 * is_343_[2] - -(Class48_Sub1.anInt3628 * is_343_[5])) + is_343_[8] * Class271.anInt2035) >> -197121842);
						i_450_ += i_447_;
						i_451_ += i_448_;
						Class159.anInt1256 = i_450_;
						Class48_Sub1.anInt3628 = i_451_;
						i_452_ += i_449_;
						Class271.anInt2035 = i_452_;
						Class98_Sub10.aBoolean3862 = false;
					}
					int i_453_ = i_339_ << 1807961519 >> -1359455193;
					int i_454_ = i_340_ << -564514769 >> 1703037991;
					int i_455_ = i_341_ << 1273318895 >> -1071031225;
					int i_456_ = 8192 + i_453_ * -Class159.anInt1256 >> 1156571662;
					int i_457_ = (8192 + i_454_ * -Class48_Sub1.anInt3628 >> -1000051794);
					int i_458_ = i_455_ * -Class271.anInt2035 - -8192 >> -1345521650;
					int i_459_ = i_456_ + Class159.anInt1256;
					int i_460_ = Class48_Sub1.anInt3628 + i_457_;
					int i_461_ = Class271.anInt2035 + i_458_;
					int[] is_462_ = new int[9];
					is_462_[0] = 8192 + is_343_[0] * i_453_ >> -336975890;
					is_462_[1] = is_343_[3] * i_453_ + 8192 >> 1498779438;
					is_462_[2] = 8192 + is_343_[6] * i_453_ >> -818202482;
					is_462_[5] = i_454_ * is_343_[7] - -8192 >> -233195602;
					is_462_[4] = is_343_[4] * i_454_ + 8192 >> -1337425842;
					is_462_[3] = 8192 + i_454_ * is_343_[1] >> 226619886;
					is_462_[6] = is_343_[2] * i_455_ - -8192 >> -1014771922;
					is_462_[7] = i_455_ * is_343_[5] + 8192 >> -1214480882;
					is_462_[8] = i_455_ * is_343_[8] + 8192 >> 1063705422;
					int i_463_ = 8192 + i_447_ * i_453_ >> 238722798;
					int i_464_ = i_454_ * i_448_ - -8192 >> -713218354;
					i_463_ += i_459_;
					i_464_ += i_460_;
					int i_465_ = 8192 + i_449_ * i_455_ >> -312558418;
					i_465_ += i_461_;
					int[] is_466_ = new int[9];
					for (int i_467_ = 0; (i_467_ ^ 0xffffffff) > -4; i_467_++) {
						for (int i_468_ = 0; (i_468_ ^ 0xffffffff) > -4; i_468_++) {
							int i_469_ = 0;
							for (int i_470_ = 0; i_470_ < 3; i_470_++)
								i_469_ += (is_462_[3 * i_470_ + i_468_] * is_343_[3 * i_467_ - -i_470_]);
							is_466_[3 * i_467_ + i_468_] = i_469_ - -8192 >> 1291562030;
						}
					}
					int i_471_ = ((8192 + i_465_ * is_343_[2] + (i_463_ * is_343_[0] - -(is_343_[1] * i_464_))) >> -864140018);
					int i_472_ = (i_465_ * is_343_[5] + (is_343_[3] * i_463_ - -(is_343_[4] * i_464_) + 8192) >> -807391858);
					int i_473_ = (8192 + (is_343_[8] * i_465_ + is_343_[6] * i_463_ + is_343_[7] * i_464_) >> -645651762);
					i_472_ += i_445_;
					i_471_ += i_444_;
					i_473_ += i_446_;
					for (int i_474_ = 0; i_344_ > i_474_; i_474_++) {
						int i_475_ = is[i_474_];
						if ((i_475_ ^ 0xffffffff) > (anIntArrayArray4925.length ^ 0xffffffff)) {
							int[] is_476_ = anIntArrayArray4925[i_475_];
							for (int i_477_ = 0; i_477_ < is_476_.length; i_477_++) {
								int i_478_ = is_476_[i_477_];
								if (aShortArray4944 == null || (aShortArray4944[i_478_] & i_342_ ^ 0xffffffff) != -1) {
									int i_479_ = ((8192 + ((is_466_[2] * anIntArray4935[i_478_]) + (is_466_[0] * anIntArray4906[i_478_])) + (is_466_[1] * anIntArray4959[i_478_])) >> 1301391278);
									int i_480_ = ((8192 + (is_466_[5] * anIntArray4935[i_478_]) + ((is_466_[4] * anIntArray4959[i_478_]) + (is_466_[3] * anIntArray4906[i_478_]))) >> 1577473550);
									int i_481_ = ((8192 + (is_466_[8] * anIntArray4935[i_478_]) + ((anIntArray4959[i_478_] * is_466_[7]) + (is_466_[6] * anIntArray4906[i_478_]))) >> -1810234034);
									i_480_ += i_472_;
									i_479_ += i_471_;
									i_481_ += i_473_;
									anIntArray4906[i_478_] = i_479_;
									anIntArray4959[i_478_] = i_480_;
									anIntArray4935[i_478_] = i_481_;
								}
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -6) {
				if (anIntArrayArray4903 != null) {
					boolean bool_482_ = false;
					for (int i_483_ = 0; i_483_ < i_344_; i_483_++) {
						int i_484_ = is[i_483_];
						if ((i_484_ ^ 0xffffffff) > (anIntArrayArray4903.length ^ 0xffffffff)) {
							int[] is_485_ = anIntArrayArray4903[i_484_];
							for (int i_486_ = 0; is_485_.length > i_486_; i_486_++) {
								int i_487_ = is_485_[i_486_];
								if (aShortArray4917 == null || ((aShortArray4917[i_487_] & i_342_) != 0)) {
									int i_488_ = (8 * i_339_ + (0xff & aByteArray4958[i_487_]));
									if ((i_488_ ^ 0xffffffff) > -1)
										i_488_ = 0;
									else if ((i_488_ ^ 0xffffffff) < -256)
										i_488_ = 255;
									aByteArray4958[i_487_] = (byte) i_488_;
								}
							}
							bool_482_ = bool_482_ | is_485_.length > 0;
						}
					}
					if (bool_482_) {
						if (aClass281Array4941 != null) {
							for (int i_489_ = 0; ((anInt4911 ^ 0xffffffff) < (i_489_ ^ 0xffffffff)); i_489_++) {
								Class281 class281 = aClass281Array4941[i_489_];
								Class181 class181 = aClass181Array4913[i_489_];
								((Class181) class181).anInt1428 = ((0xffffff & ((Class181) class181).anInt1428) | 255 - ((aByteArray4958[(((Class281) class281).anInt2121)]) & 0xff) << 782787288);
							}
						}
						method2392(-66);
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				if (anIntArrayArray4903 != null) {
					boolean bool_490_ = false;
					for (int i_491_ = 0; i_491_ < i_344_; i_491_++) {
						int i_492_ = is[i_491_];
						if (i_492_ < anIntArrayArray4903.length) {
							int[] is_493_ = anIntArrayArray4903[i_492_];
							for (int i_494_ = 0; i_494_ < is_493_.length; i_494_++) {
								int i_495_ = is_493_[i_494_];
								if (aShortArray4917 == null || ((i_342_ & aShortArray4917[i_495_]) != 0)) {
									int i_496_ = aShortArray4946[i_495_] & 0xffff;
									int i_497_ = (i_496_ & 0xfc7b) >> -2230550;
									int i_498_ = 0x7 & i_496_ >> 2065558343;
									i_497_ = i_497_ - -i_339_ & 0x3f;
									i_498_ += i_340_ / 4;
									int i_499_ = 0x7f & i_496_;
									i_499_ += i_341_;
									if ((i_498_ ^ 0xffffffff) <= -1) {
										if (i_498_ > 7)
											i_498_ = 7;
									} else
										i_498_ = 0;
									if ((i_499_ ^ 0xffffffff) > -1)
										i_499_ = 0;
									else if ((i_499_ ^ 0xffffffff) < -128)
										i_499_ = 127;
									aShortArray4946[i_495_] = (short) (Class41.method366((Class41.method366(i_497_ << 13076682, i_498_ << 1033198727)), i_499_));
								}
							}
							bool_490_ = bool_490_ | is_493_.length > 0;
						}
					}
					if (bool_490_) {
						if (aClass281Array4941 != null) {
							for (int i_500_ = 0; ((i_500_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff)); i_500_++) {
								Class281 class281 = aClass281Array4941[i_500_];
								Class181 class181 = aClass181Array4913[i_500_];
								((Class181) class181).anInt1428 = ((0xffffff & (Class208.anIntArray1579[0xffff & (aShortArray4946[(((Class281) class281).anInt2121)])])) | (~0xffffff & ((Class181) class181).anInt1428));
							}
						}
						method2392(81);
					}
				}
			} else if (i == 8) {
				if (anIntArrayArray4934 != null) {
					for (int i_501_ = 0; (i_344_ ^ 0xffffffff) < (i_501_ ^ 0xffffffff); i_501_++) {
						int i_502_ = is[i_501_];
						if ((anIntArrayArray4934.length ^ 0xffffffff) < (i_502_ ^ 0xffffffff)) {
							int[] is_503_ = anIntArrayArray4934[i_502_];
							for (int i_504_ = 0; i_504_ < is_503_.length; i_504_++) {
								Class181 class181 = aClass181Array4913[is_503_[i_504_]];
								((Class181) class181).anInt1426 += i_339_;
								((Class181) class181).anInt1427 += i_340_;
							}
						}
					}
				}
			} else if (i == 10) {
				if (anIntArrayArray4934 != null) {
					for (int i_505_ = 0; (i_344_ ^ 0xffffffff) < (i_505_ ^ 0xffffffff); i_505_++) {
						int i_506_ = is[i_505_];
						if (anIntArrayArray4934.length > i_506_) {
							int[] is_507_ = anIntArrayArray4934[i_506_];
							for (int i_508_ = 0; is_507_.length > i_508_; i_508_++) {
								Class181 class181 = aClass181Array4913[is_507_[i_508_]];
								((Class181) class181).anInt1425 = (i_340_ * ((Class181) class181).anInt1425 >> -1545119353);
								((Class181) class181).anInt1429 = (i_339_ * ((Class181) class181).anInt1429 >> 980544551);
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -10) {
				if (anIntArrayArray4934 != null) {
					for (int i_509_ = 0; i_344_ > i_509_; i_509_++) {
						int i_510_ = is[i_509_];
						if ((anIntArrayArray4934.length ^ 0xffffffff) < (i_510_ ^ 0xffffffff)) {
							int[] is_511_ = anIntArrayArray4934[i_510_];
							for (int i_512_ = 0; ((is_511_.length ^ 0xffffffff) < (i_512_ ^ 0xffffffff)); i_512_++) {
								Class181 class181 = aClass181Array4913[is_511_[i_512_]];
								((Class181) class181).anInt1431 = 0x3fff & i_339_ + (((Class181) class181).anInt1431);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.I(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_339_ + ',' + i_340_ + ',' + i_341_ + ',' + bool + ',' + i_342_ + ',' + (is_343_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean F() {
		try {
			return aBoolean4938;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.F(" + ')');
		}
	}

	final void P(int i, int i_513_, int i_514_, int i_515_) {
		try {
			if (i == 0) {
				Class271.anInt2035 = 0;
				Class159.anInt1256 = 0;
				int i_516_ = 0;
				Class48_Sub1.anInt3628 = 0;
				for (int i_517_ = 0; i_517_ < anInt4912; i_517_++) {
					Class159.anInt1256 += anIntArray4906[i_517_];
					Class48_Sub1.anInt3628 += anIntArray4959[i_517_];
					Class271.anInt2035 += anIntArray4935[i_517_];
					i_516_++;
				}
				if ((i_516_ ^ 0xffffffff) < -1) {
					Class48_Sub1.anInt3628 = i_514_ + Class48_Sub1.anInt3628 / i_516_;
					Class271.anInt2035 = Class271.anInt2035 / i_516_ + i_515_;
					Class159.anInt1256 = i_513_ + Class159.anInt1256 / i_516_;
				} else {
					Class159.anInt1256 = i_513_;
					Class271.anInt2035 = i_515_;
					Class48_Sub1.anInt3628 = i_514_;
				}
			} else if (i == 1) {
				for (int i_518_ = 0; (anInt4912 ^ 0xffffffff) < (i_518_ ^ 0xffffffff); i_518_++) {
					anIntArray4906[i_518_] += i_513_;
					anIntArray4959[i_518_] += i_514_;
					anIntArray4935[i_518_] += i_515_;
				}
			} else if (i == 2) {
				for (int i_519_ = 0; i_519_ < anInt4912; i_519_++) {
					anIntArray4906[i_519_] -= Class159.anInt1256;
					anIntArray4959[i_519_] -= Class48_Sub1.anInt3628;
					anIntArray4935[i_519_] -= Class271.anInt2035;
					if (i_515_ != 0) {
						int i_520_ = Class284_Sub2_Sub2.anIntArray6200[i_515_];
						int i_521_ = Class284_Sub2_Sub2.anIntArray6202[i_515_];
						int i_522_ = ((16383 + i_521_ * anIntArray4906[i_519_] + anIntArray4959[i_519_] * i_520_) >> -74393330);
						anIntArray4959[i_519_] = ((-(i_520_ * anIntArray4906[i_519_]) + anIntArray4959[i_519_] * i_521_ + 16383) >> 2052943790);
						anIntArray4906[i_519_] = i_522_;
					}
					if ((i_513_ ^ 0xffffffff) != -1) {
						int i_523_ = Class284_Sub2_Sub2.anIntArray6200[i_513_];
						int i_524_ = Class284_Sub2_Sub2.anIntArray6202[i_513_];
						int i_525_ = (16383 + (-(i_523_ * anIntArray4935[i_519_]) + i_524_ * anIntArray4959[i_519_]) >> 1855147406);
						anIntArray4935[i_519_] = ((16383 + anIntArray4959[i_519_] * i_523_ - -(anIntArray4935[i_519_] * i_524_)) >> 1727674158);
						anIntArray4959[i_519_] = i_525_;
					}
					if (i_514_ != 0) {
						int i_526_ = Class284_Sub2_Sub2.anIntArray6200[i_514_];
						int i_527_ = Class284_Sub2_Sub2.anIntArray6202[i_514_];
						int i_528_ = ((anIntArray4935[i_519_] * i_526_ + anIntArray4906[i_519_] * i_527_ + 16383) >> 1740414926);
						anIntArray4935[i_519_] = ((16383 + -(i_526_ * anIntArray4906[i_519_]) + i_527_ * anIntArray4935[i_519_]) >> 1673869102);
						anIntArray4906[i_519_] = i_528_;
					}
					anIntArray4906[i_519_] += Class159.anInt1256;
					anIntArray4959[i_519_] += Class48_Sub1.anInt3628;
					anIntArray4935[i_519_] += Class271.anInt2035;
				}
			} else if ((i ^ 0xffffffff) == -4) {
				for (int i_529_ = 0; (i_529_ ^ 0xffffffff) > (anInt4912 ^ 0xffffffff); i_529_++) {
					anIntArray4906[i_529_] -= Class159.anInt1256;
					anIntArray4959[i_529_] -= Class48_Sub1.anInt3628;
					anIntArray4935[i_529_] -= Class271.anInt2035;
					anIntArray4906[i_529_] = i_513_ * anIntArray4906[i_529_] / 128;
					anIntArray4959[i_529_] = anIntArray4959[i_529_] * i_514_ / 128;
					anIntArray4935[i_529_] = anIntArray4935[i_529_] * i_515_ / 128;
					anIntArray4906[i_529_] += Class159.anInt1256;
					anIntArray4959[i_529_] += Class48_Sub1.anInt3628;
					anIntArray4935[i_529_] += Class271.anInt2035;
				}
			} else if (i == 5) {
				for (int i_530_ = 0; (anInt4948 ^ 0xffffffff) < (i_530_ ^ 0xffffffff); i_530_++) {
					int i_531_ = 8 * i_513_ + (aByteArray4958[i_530_] & 0xff);
					if ((i_531_ ^ 0xffffffff) <= -1) {
						if (i_531_ > 255)
							i_531_ = 255;
					} else
						i_531_ = 0;
					aByteArray4958[i_530_] = (byte) i_531_;
				}
				if (aClass281Array4941 != null) {
					for (int i_532_ = 0; (i_532_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff); i_532_++) {
						Class281 class281 = aClass281Array4941[i_532_];
						Class181 class181 = aClass181Array4913[i_532_];
						((Class181) class181).anInt1428 = (((Class181) class181).anInt1428 & 0xffffff | (255 + -(0xff & (aByteArray4958[(((Class281) class281).anInt2121)])) << 830117720));
					}
				}
				method2392(-111);
			} else if (i == 7) {
				for (int i_533_ = 0; (anInt4948 ^ 0xffffffff) < (i_533_ ^ 0xffffffff); i_533_++) {
					int i_534_ = aShortArray4946[i_533_] & 0xffff;
					int i_535_ = (0xfd09 & i_534_) >> 1967714794;
					int i_536_ = i_534_ >> -1093201017 & 0x7;
					i_535_ = i_513_ + i_535_ & 0x3f;
					int i_537_ = 0x7f & i_534_;
					i_536_ += i_514_ / 4;
					i_537_ += i_515_;
					if (i_536_ >= 0) {
						if (i_536_ > 7)
							i_536_ = 7;
					} else
						i_536_ = 0;
					if (i_537_ < 0)
						i_537_ = 0;
					else if ((i_537_ ^ 0xffffffff) < -128)
						i_537_ = 127;
					aShortArray4946[i_533_] = (short) (Class41.method366(Class41.method366(i_535_ << 1201630634, i_536_ << -754765017), i_537_));
				}
				if (aClass281Array4941 != null) {
					for (int i_538_ = 0; (i_538_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff); i_538_++) {
						Class281 class281 = aClass281Array4941[i_538_];
						Class181 class181 = aClass181Array4913[i_538_];
						((Class181) class181).anInt1428 = (((Class181) class181).anInt1428 & ~0xffffff | 0xffffff & (Class208.anIntArray1579[(aShortArray4946[(((Class281) class281).anInt2121)]) & 0xffff]));
					}
				}
				method2392(74);
			} else if ((i ^ 0xffffffff) == -9) {
				for (int i_539_ = 0; (anInt4911 ^ 0xffffffff) < (i_539_ ^ 0xffffffff); i_539_++) {
					Class181 class181 = aClass181Array4913[i_539_];
					((Class181) class181).anInt1426 += i_513_;
					((Class181) class181).anInt1427 += i_514_;
				}
			} else if ((i ^ 0xffffffff) == -11) {
				for (int i_540_ = 0; (i_540_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff); i_540_++) {
					Class181 class181 = aClass181Array4913[i_540_];
					((Class181) class181).anInt1425 = (i_514_ * ((Class181) class181).anInt1425 >> 1678400263);
					((Class181) class181).anInt1429 = (i_513_ * ((Class181) class181).anInt1429 >> 2032678311);
				}
			} else if (i == 9) {
				for (int i_541_ = 0; i_541_ < anInt4911; i_541_++) {
					Class181 class181 = aClass181Array4913[i_541_];
					((Class181) class181).anInt1431 = ((Class181) class181).anInt1431 - -i_513_ & 0x3fff;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.P(" + i + ',' + i_513_ + ',' + i_514_ + ',' + i_515_ + ')'));
		}
	}

	final void H(int i, int i_542_, int i_543_) {
		try {
			for (int i_544_ = 0; i_544_ < anInt4912; i_544_++) {
				if (i != 0)
					anIntArray4906[i_544_] += i;
				if ((i_542_ ^ 0xffffffff) != -1)
					anIntArray4959[i_544_] += i_542_;
				if ((i_543_ ^ 0xffffffff) != -1)
					anIntArray4935[i_544_] += i_543_;
			}
			method2410(-67);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.H(" + i + ',' + i_542_ + ',' + i_543_ + ')'));
		}
	}

	final void LA(int i) {
		try {
			aShort4905 = (short) i;
			method2410(-115);
			method2404((byte) -64);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.LA(" + i + ')');
		}
	}

	private final void method2401(int i) {
		try {
			int i_545_ = 32767;
			int i_546_ = 32767;
			int i_547_ = 32767;
			int i_548_ = -32768;
			int i_549_ = -32768;
			if (i == -21065) {
				int i_550_ = -32768;
				int i_551_ = 0;
				int i_552_ = 0;
				for (int i_553_ = 0; anInt4912 > i_553_; i_553_++) {
					int i_554_ = anIntArray4906[i_553_];
					int i_555_ = anIntArray4959[i_553_];
					if ((i_549_ ^ 0xffffffff) > (i_555_ ^ 0xffffffff))
						i_549_ = i_555_;
					if (i_546_ > i_555_)
						i_546_ = i_555_;
					if (i_554_ < i_545_)
						i_545_ = i_554_;
					int i_556_ = anIntArray4935[i_553_];
					if (i_554_ > i_548_)
						i_548_ = i_554_;
					if ((i_550_ ^ 0xffffffff) > (i_556_ ^ 0xffffffff))
						i_550_ = i_556_;
					if ((i_556_ ^ 0xffffffff) > (i_547_ ^ 0xffffffff))
						i_547_ = i_556_;
					int i_557_ = i_554_ * i_554_ + i_556_ * i_556_;
					if (i_557_ > i_551_)
						i_551_ = i_557_;
					i_557_ = i_555_ * i_555_ + i_556_ * i_556_ + i_554_ * i_554_;
					if ((i_557_ ^ 0xffffffff) < (i_552_ ^ 0xffffffff))
						i_552_ = i_557_;
				}
				anInt4937 = i_550_;
				anInt4924 = i_545_;
				anInt4950 = i_549_;
				anInt4956 = i_546_;
				anInt4910 = i_548_;
				anInt4921 = i_547_;
				anInt4939 = (int) (0.99 + Math.sqrt((double) i_551_));
				anInt4943 = (int) (0.99 + Math.sqrt((double) i_552_));
				aBoolean4922 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.S(" + i + ')');
		}
	}

	final void p(int i, int i_558_, s var_s, s var_s_559_, int i_560_, int i_561_, int i_562_) {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			int i_563_ = anInt4924 + i_560_;
			int i_564_ = anInt4910 + i_560_;
			int i_565_ = anInt4921 + i_562_;
			int i_566_ = anInt4937 + i_562_;
			if ((i ^ 0xffffffff) != -2 && i != 2 && i != 3 && i != 5 || (i_563_ >= 0 && ((s) var_s).anInt2203 > (((s) var_s).anInt2206 + i_564_ >> ((s) var_s).anInt2200) && i_565_ >= 0 && ((s) var_s).anInt2204 > (((s) var_s).anInt2206 + i_566_ >> ((s) var_s).anInt2200))) {
				if (i != 4 && i != 5) {
					i_563_ >>= ((s) var_s).anInt2200;
					i_564_ = (i_564_ - 1 - -((s) var_s).anInt2206 >> ((s) var_s).anInt2200);
					i_565_ >>= ((s) var_s).anInt2200;
					i_566_ = (((s) var_s).anInt2206 - 1 + i_566_ >> ((s) var_s).anInt2200);
					if (((i_561_ ^ 0xffffffff) == (var_s.method3420(i_565_, -12639, i_563_) ^ 0xffffffff)) && ((i_561_ ^ 0xffffffff) == (var_s.method3420(i_565_, -12639, i_564_) ^ 0xffffffff)) && i_561_ == var_s.method3420(i_566_, -12639, i_563_) && ((i_561_ ^ 0xffffffff) == (var_s.method3420(i_566_, -12639, i_564_) ^ 0xffffffff)))
						return;
				} else if (var_s_559_ == null || ((i_563_ ^ 0xffffffff) > -1 || ((i_564_ - -((s) var_s_559_).anInt2206 >> ((s) var_s_559_).anInt2200) >= ((s) var_s_559_).anInt2203) || (i_565_ ^ 0xffffffff) > -1 || ((((s) var_s_559_).anInt2206 + i_566_ >> ((s) var_s_559_).anInt2200) >= ((s) var_s_559_).anInt2204)))
					return;
				if ((i ^ 0xffffffff) != -2) {
					if (i != 2) {
						if ((i ^ 0xffffffff) == -4) {
							int i_567_ = 4 * (i_558_ & 0xff);
							int i_568_ = ((i_558_ & 0xff0b) >> 103369544) * 4;
							int i_569_ = ((i_558_ & 0xffe75b) >> 1134887344 << -1934264058);
							int i_570_ = (i_558_ >> 1827617464 & 0xff) << -1400773210;
							if ((i_560_ + -(i_567_ >> -219452191) ^ 0xffffffff) > -1 || ((((s) var_s).anInt2203 << ((s) var_s).anInt2200) <= (i_560_ + (i_567_ >> 893641537) - -((s) var_s).anInt2206)) || -(i_568_ >> 618172321) + i_562_ < 0 || ((((s) var_s).anInt2204 << ((s) var_s).anInt2200) <= ((i_568_ >> -91386751) + (i_562_ - -((s) var_s).anInt2206))))
								return;
							this.method2336(i_568_, i_567_, var_s, i_561_, i_560_, i_562_, i_569_, 2, i_570_);
						} else if (i != 4) {
							if ((i ^ 0xffffffff) == -6) {
								int i_571_ = anInt4950 + -anInt4956;
								for (int i_572_ = 0; anInt4912 > i_572_; i_572_++) {
									int i_573_ = i_560_ + anIntArray4906[i_572_];
									int i_574_ = i_562_ + anIntArray4935[i_572_];
									int i_575_ = var_s.method3417(i_573_, i_574_, true);
									int i_576_ = var_s_559_.method3417(i_573_, i_574_, true);
									int i_577_ = -i_558_ + (-i_576_ + i_575_);
									anIntArray4959[i_572_] = (((anIntArray4959[i_572_] << -2012164056) / i_571_ * i_577_ >> -1838068312) + (i_575_ + -i_561_));
								}
							}
						} else {
							int i_578_ = anInt4950 - anInt4956;
							for (int i_579_ = 0; ((anInt4912 ^ 0xffffffff) < (i_579_ ^ 0xffffffff)); i_579_++)
								anIntArray4959[i_579_] = (anIntArray4959[i_579_] + -i_561_ + ((var_s_559_.method3417(i_560_ + anIntArray4906[i_579_], i_562_ + anIntArray4935[i_579_], true)) + i_578_));
						}
					} else {
						int i_580_ = anInt4956;
						if ((i_580_ ^ 0xffffffff) == -1)
							return;
						for (int i_581_ = 0; (i_581_ ^ 0xffffffff) > (anInt4912 ^ 0xffffffff); i_581_++) {
							int i_582_ = ((anIntArray4959[i_581_] << 1047081552) / i_580_);
							if ((i_582_ ^ 0xffffffff) > (i_558_ ^ 0xffffffff))
								anIntArray4959[i_581_] = (anIntArray4959[i_581_] - -(((var_s.method3417(i_560_ + anIntArray4906[i_581_], anIntArray4935[i_581_] - -i_562_, true)) + -i_561_) * (-i_582_ + i_558_) / i_558_));
						}
					}
				} else {
					for (int i_583_ = 0; i_583_ < anInt4912; i_583_++)
						anIntArray4959[i_583_] = (anIntArray4959[i_583_] + (var_s.method3417((i_560_ + anIntArray4906[i_583_]), (i_562_ + anIntArray4935[i_583_]), true) - i_561_));
				}
				method2410(-128);
				aBoolean4922 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.p(" + i + ',' + i_558_ + ',' + (var_s != null ? "{...}" : "null") + ',' + (var_s_559_ != null ? "{...}" : "null") + ',' + i_560_ + ',' + i_561_ + ',' + i_562_ + ')'));
		}
	}

	final void method2402(int i) {
		do {
			try {
				if (aClass189_4933 != null)
					aClass189_4933.method2639(true);
				if (aClass189_4930 != null)
					aClass189_4930.method2639(true);
				if (aClass189_4920 != null)
					aClass189_4920.method2639(true);
				if (aClass189_4927 != null)
					aClass189_4927.method2639(true);
				if (i != -12884)
					method2405(null, (byte) 0, 91, 115);
				if (aClass18_4931 == null)
					break;
				aClass18_4931.method249(0);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qw.MA(" + i + ')');
			}
			break;
		} while (false);
	}

	private final boolean method2403(byte i) {
		try {
			boolean bool = !((Class189) aClass189_4920).aBoolean1458;
			boolean bool_584_ = ((0x37 & anInt4963 ^ 0xffffffff) != -1 && !((Class189) aClass189_4927).aBoolean1458);
			boolean bool_585_ = !((Class189) aClass189_4933).aBoolean1458;
			if (i != -127)
				HA();
			boolean bool_586_ = !((Class189) aClass189_4930).aBoolean1458;
			if (!bool_585_ && !bool && !bool_584_ && !bool_586_)
				return true;
			boolean bool_587_ = true;
			if (bool_585_) {
				if (((Class189) aClass189_4933).anInterface2_Impl1_1454 == null)
					((Class189) aClass189_4933).anInterface2_Impl1_1454 = aHa_Sub3_4899.method2060(aBoolean4916, 82);
				Interface2_Impl1 interface2_impl1 = ((Class189) aClass189_4933).anInterface2_Impl1_1454;
				interface2_impl1.method74(-20279, 12, anInt4936 * 12);
				Buffer buffer = interface2_impl1.method75(true, (byte) 27);
				if (buffer == null)
					bool_587_ = false;
				else {
					((ha_Sub3) aHa_Sub3_4899).aNativeInterface4526.copyPositions(anIntArray4906, anIntArray4959, anIntArray4935, aShortArray4901, 0, 12, anInt4936, buffer.getAddress());
					if (interface2_impl1.method71(13623)) {
						((Class189) aClass189_4933).aBoolean1458 = true;
						((Class189) aClass189_4933).anInterface2_Impl1_1456 = interface2_impl1;
					} else
						bool_587_ = false;
				}
			}
			if (bool) {
				if (((Class189) aClass189_4920).anInterface2_Impl1_1454 == null)
					((Class189) aClass189_4920).anInterface2_Impl1_1454 = aHa_Sub3_4899.method2060(aBoolean4916, 57);
				Interface2_Impl1 interface2_impl1 = ((Class189) aClass189_4920).anInterface2_Impl1_1454;
				interface2_impl1.method74(-20279, 4, 4 * anInt4936);
				Buffer buffer = interface2_impl1.method75(true, (byte) 27);
				if (buffer != null) {
					if ((0x37 & anInt4963) != 0)
						((ha_Sub3) aHa_Sub3_4899).aNativeInterface4526.copyColours(aShortArray4946, aByteArray4958, aShortArray4954, aShort4902, aShortArray4904, 0, 4, anInt4936, buffer.getAddress());
					else {
						short[] is;
						byte[] is_588_;
						short[] is_589_;
						short[] is_590_;
						if (aClass168_4923 != null) {
							is_590_ = ((Class168) aClass168_4923).aShortArray1291;
							is = ((Class168) aClass168_4923).aShortArray1288;
							is_588_ = ((Class168) aClass168_4923).aByteArray1289;
							is_589_ = ((Class168) aClass168_4923).aShortArray1292;
						} else {
							is = aShortArray4953;
							is_588_ = aByteArray4928;
							is_589_ = aShortArray4962;
							is_590_ = aShortArray4957;
						}
						((ha_Sub3) aHa_Sub3_4899).aNativeInterface4526.copyLighting(aShortArray4946, aByteArray4958, aShortArray4954, is, is_590_, is_589_, is_588_, aShort4902, aShort4905, aShortArray4904, 0, 4, anInt4936, buffer.getAddress());
					}
					if (interface2_impl1.method71(13623)) {
						((Class189) aClass189_4920).aBoolean1458 = true;
						((Class189) aClass189_4920).anInterface2_Impl1_1456 = interface2_impl1;
					} else
						bool_587_ = false;
				} else
					bool_587_ = false;
			}
			if (bool_584_) {
				if (((Class189) aClass189_4927).anInterface2_Impl1_1454 == null)
					((Class189) aClass189_4927).anInterface2_Impl1_1454 = aHa_Sub3_4899.method2060(aBoolean4916, 59);
				Interface2_Impl1 interface2_impl1 = ((Class189) aClass189_4927).anInterface2_Impl1_1454;
				interface2_impl1.method74(-20279, 12, anInt4936 * 12);
				Buffer buffer = interface2_impl1.method75(true, (byte) 27);
				if (buffer != null) {
					byte[] is;
					short[] is_591_;
					short[] is_592_;
					short[] is_593_;
					if (aClass168_4923 == null) {
						is_591_ = aShortArray4962;
						is_592_ = aShortArray4953;
						is = aByteArray4928;
						is_593_ = aShortArray4957;
					} else {
						is = ((Class168) aClass168_4923).aByteArray1289;
						is_591_ = ((Class168) aClass168_4923).aShortArray1292;
						is_592_ = ((Class168) aClass168_4923).aShortArray1288;
						is_593_ = ((Class168) aClass168_4923).aShortArray1291;
					}
					((ha_Sub3) aHa_Sub3_4899).aNativeInterface4526.copyNormals(is_592_, is_593_, is_591_, is, 3.0F / (float) aShort4905, 3.0F / (float) (aShort4905 + aShort4905 / 2), 0, 12, anInt4936, buffer.getAddress());
					if (interface2_impl1.method71(i + 13750)) {
						((Class189) aClass189_4927).anInterface2_Impl1_1456 = interface2_impl1;
						((Class189) aClass189_4927).aBoolean1458 = true;
					} else
						bool_587_ = false;
				} else
					bool_587_ = false;
			}
			if (bool_586_) {
				if (((Class189) aClass189_4930).anInterface2_Impl1_1454 == null)
					((Class189) aClass189_4930).anInterface2_Impl1_1454 = aHa_Sub3_4899.method2060(aBoolean4916, 45);
				Interface2_Impl1 interface2_impl1 = ((Class189) aClass189_4930).anInterface2_Impl1_1454;
				interface2_impl1.method74(-20279, 8, anInt4936 * 8);
				Buffer buffer = interface2_impl1.method75(true, (byte) 27);
				if (buffer != null) {
					((ha_Sub3) aHa_Sub3_4899).aNativeInterface4526.copyTexCoords(aFloatArray4955, aFloatArray4914, 0, 8, anInt4936, buffer.getAddress());
					if (interface2_impl1.method71(13623)) {
						((Class189) aClass189_4930).anInterface2_Impl1_1456 = interface2_impl1;
						((Class189) aClass189_4930).aBoolean1458 = true;
					} else
						bool_587_ = false;
				} else
					bool_587_ = false;
			}
			return bool_587_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.QA(" + i + ')');
		}
	}

	private final void method2404(byte i) {
		try {
			do {
				if ((0x37 & anInt4963 ^ 0xffffffff) == -1) {
					if (aClass189_4920 == null)
						break;
					((Class189) aClass189_4920).aBoolean1458 = false;
					if (!client.aBoolean3553)
						break;
				}
				if (aClass189_4927 != null)
					((Class189) aClass189_4927).aBoolean1458 = false;
			} while (false);
			if (i != -64)
				method2324();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.E(" + i + ')');
		}
	}

	final void VA(int i) {
		try {
			int i_594_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_595_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_596_ = 0; i_596_ < anInt4912; i_596_++) {
				int i_597_ = ((anIntArray4906[i_596_] * i_595_ + i_594_ * anIntArray4959[i_596_]) >> 850249230);
				anIntArray4959[i_596_] = (i_595_ * anIntArray4959[i_596_] + -(anIntArray4906[i_596_] * i_594_)) >> 1646329358;
				anIntArray4906[i_596_] = i_597_;
			}
			method2410(-79);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.VA(" + i + ')');
		}
	}

	final boolean NA() {
		try {
			if (anIntArrayArray4925 == null)
				return false;
			for (int i = 0; (i ^ 0xffffffff) > (anInt4929 ^ 0xffffffff); i++) {
				anIntArray4906[i] <<= 4;
				anIntArray4959[i] <<= 4;
				anIntArray4935[i] <<= 4;
			}
			Class271.anInt2035 = 0;
			Class48_Sub1.anInt3628 = 0;
			Class159.anInt1256 = 0;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.NA(" + ')');
		}
	}

	final void method2342() {
		/* empty */
	}

	final void a(int i) {
		try {
			int i_598_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_599_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_600_ = 0; anInt4912 > i_600_; i_600_++) {
				int i_601_ = ((anIntArray4935[i_600_] * i_598_ + anIntArray4906[i_600_] * i_599_) >> 1158693806);
				anIntArray4935[i_600_] = (i_599_ * anIntArray4935[i_600_] + -(anIntArray4906[i_600_] * i_598_)) >> 1012277390;
				anIntArray4906[i_600_] = i_601_;
			}
			method2410(-72);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.a(" + i + ')');
		}
	}

	final boolean method2324() {
		try {
			if (aShortArray4954 == null)
				return true;
			for (int i = 0; i < aShortArray4954.length; i++) {
				if ((aShortArray4954[i] ^ 0xffffffff) != 0 && !((ha) aHa_Sub3_4899).aD938.method8(-121, aShortArray4954[i]))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.J(" + ')');
		}
	}

	final boolean method2339(int i, int i_602_, Class111 class111, boolean bool, int i_603_) {
		try {
			return method2394(68, i, -1, i_602_, bool, i_603_, class111);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.CB(" + i + ',' + i_602_ + ',' + (class111 != null ? "{...}" : "null") + ',' + bool + ',' + i_603_ + ')'));
		}
	}

	static final void method2405(GameInterfaceData class293, byte i, int i_604_, int i_605_) {
		try {
			if (Class255.draggedComponent == null && !Player.aBoolean6540 && (class293 != null && Class365.method3939(4456, class293) != null)) {
				if (i < 11)
					aClass213_4949 = null;
				Class255.draggedComponent = class293;
				Class189.aClass293_1457 = Class365.method3939(4456, class293);
				PlayerUpdateMask.anInt526 = i_605_;
				Class15.aBoolean186 = false;
				Class105.anInt3417 = 0;
				ModelDefinitions.anInt1405 = i_604_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.OA(" + (class293 != null ? "{...}" : "null") + ',' + i + ',' + i_604_ + ',' + i_605_ + ')'));
		}
	}

	private final void method2406(int i) {
		do {
			try {
				if (aClass18_4931 != null)
					((Class18) aClass18_4931).aBoolean207 = false;
				if (i == -14204)
					break;
				P(-41, 55, -103, 64);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qw.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2407(int i) {
		try {
			if ((anInt4909 ^ 0xffffffff) != -1) {
				if (method2403((byte) -127) && method2399(i ^ 0x71f3)) {
					aHa_Sub3_4899.method1971(0, true, (((Class189) aClass189_4933).anInterface2_Impl1_1456));
					aHa_Sub3_4899.method1971(1, true, (((Class189) aClass189_4920).anInterface2_Impl1_1456));
					aHa_Sub3_4899.method1971(2, true, (((Class189) aClass189_4930).anInterface2_Impl1_1456));
					boolean bool;
					if ((0x37 & anInt4963 ^ 0xffffffff) == -1) {
						aHa_Sub3_4899.method1979(false, -90);
						bool = false;
						aHa_Sub3_4899.method2042((((ha_Sub3) aHa_Sub3_4899).aClass256_4668), (byte) 57);
					} else {
						bool = true;
						aHa_Sub3_4899.method1979(true, -127);
						aHa_Sub3_4899.method1971(3, true, (((Class189) aClass189_4927).anInterface2_Impl1_1456));
						aHa_Sub3_4899.method2042((((ha_Sub3) aHa_Sub3_4899).aClass256_4654), (byte) 78);
					}
					for (int i_606_ = 0; i_606_ < anIntArray4945.length; i_606_++) {
						int i_607_ = anIntArray4907[i_606_];
						int i_608_ = anIntArray4907[1 + i_606_];
						int i_609_ = aShortArray4954[i_607_] & 0xffff;
						if ((i_609_ ^ 0xffffffff) == -65536)
							i_609_ = -1;
						aHa_Sub3_4899.method2039(true, 0, i_609_, bool);
						aHa_Sub3_4899.method1973(Class336.aClass232_2822, anIntArray4918[i_606_], 3 * i_607_, 26810, (((Class18) aClass18_4931).anInterface2_Impl2_211), anIntArray4945[i_606_], i_608_ - i_607_);
					}
				}
				if (i != 29084)
					aBoolean4926 = false;
				method2396(8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.B(" + i + ')');
		}
	}

	Class146_Sub3(ha_Sub3 var_ha_Sub3, ModelDefinitions class178, int i, int i_610_, int i_611_, int i_612_) {
		this(var_ha_Sub3, i, i_612_, true, false);
		do {
			try {
				d var_d = ((ha) var_ha_Sub3).aD938;
				int[] is = new int[((ModelDefinitions) class178).anInt1391];
				anIntArray4932 = new int[((ModelDefinitions) class178).anInt1406 - -1];
				for (int i_613_ = 0; i_613_ < ((ModelDefinitions) class178).anInt1391; i_613_++) {
					if (((ModelDefinitions) class178).aByteArray1414 == null || (((ModelDefinitions) class178).aByteArray1414[i_613_] ^ 0xffffffff) != -3) {
						if (((ModelDefinitions) class178).aShortArray1409 != null && (((ModelDefinitions) class178).aShortArray1409[i_613_] != -1)) {
							Class238 class238 = var_d.method11((0xffff & (((ModelDefinitions) class178).aShortArray1409[i_613_])), -28755);
							if (((0x40 & anInt4963 ^ 0xffffffff) == -1 || !((Class238) class238).aBoolean1825) && ((Class238) class238).aBoolean1833)
								continue;
						}
						is[anInt4948++] = i_613_;
						anIntArray4932[(((ModelDefinitions) class178).aShortArray1393[i_613_])]++;
						anIntArray4932[(((ModelDefinitions) class178).aShortArray1410[i_613_])]++;
						anIntArray4932[(((ModelDefinitions) class178).aShortArray1392[i_613_])]++;
					}
				}
				anInt4909 = anInt4948;
				long[] ls = new long[anInt4948];
				boolean bool = (anInt4942 & 0x100 ^ 0xffffffff) != -1;
				for (int i_614_ = 0; anInt4948 > i_614_; i_614_++) {
					int i_615_ = is[i_614_];
					Class238 class238 = null;
					int i_616_ = 0;
					int i_617_ = 0;
					int i_618_ = 0;
					int i_619_ = 0;
					if (((ModelDefinitions) class178).aClass106Array1419 != null) {
						boolean bool_620_ = false;
						for (int i_621_ = 0; ((i_621_ ^ 0xffffffff) > ((((ModelDefinitions) class178).aClass106Array1419).length ^ 0xffffffff)); i_621_++) {
							Class106 class106 = (((ModelDefinitions) class178).aClass106Array1419[i_621_]);
							if ((i_615_ ^ 0xffffffff) == (((Class106) class106).anInt906 ^ 0xffffffff)) {
								Class177 class177 = Class67.method689((((Class106) class106).anInt905), (byte) -116);
								if (((Class177) class177).aBoolean1377)
									bool_620_ = true;
								if ((((Class177) class177).anInt1373 ^ 0xffffffff) != 0) {
									Class238 class238_622_ = var_d.method11((((Class177) class177).anInt1373), -28755);
									if ((((Class238) class238_622_).anInt1818 ^ 0xffffffff) == -3)
										aBoolean4938 = true;
								}
							}
						}
						if (bool_620_) {
							ls[i_614_] = 9223372036854775807L;
							anInt4909--;
							continue;
						}
					}
					int i_623_ = -1;
					if (((ModelDefinitions) class178).aShortArray1409 != null) {
						i_623_ = ((ModelDefinitions) class178).aShortArray1409[i_615_];
						if ((i_623_ ^ 0xffffffff) != 0) {
							class238 = var_d.method11(i_623_ & 0xffff, -28755);
							if ((0x40 & anInt4963 ^ 0xffffffff) == -1 || !((Class238) class238).aBoolean1825) {
								i_618_ = ((Class238) class238).aByte1820;
								i_619_ = ((Class238) class238).aByte1816;
							} else {
								class238 = null;
								i_623_ = -1;
							}
						}
					}
					boolean bool_624_ = ((((ModelDefinitions) class178).aByteArray1411 != null && (((ModelDefinitions) class178).aByteArray1411[i_615_] ^ 0xffffffff) != -1) || (class238 != null && (((Class238) class238).anInt1818 ^ 0xffffffff) != -1));
					if ((bool || bool_624_) && ((ModelDefinitions) class178).aByteArray1402 != null)
						i_616_ += (((ModelDefinitions) class178).aByteArray1402[i_615_] << 154322641);
					if (bool_624_)
						i_616_ += 65536;
					i_616_ += 0xff00 & i_618_ << 294684808;
					i_617_ += ~0xffff & i_623_ << -1322021104;
					i_616_ += i_619_ & 0xff;
					i_617_ += i_614_ & 0xffff;
					ls[i_614_] = (long) i_617_ + ((long) i_616_ << 2126130144);
					aBoolean4938 |= bool_624_;
					Class146_Sub3 class146_sub3_625_ = this;
					class146_sub3_625_.aBoolean4940 = (class146_sub3_625_.aBoolean4940 | (class238 != null && ((((Class238) class238).aByte1823 ^ 0xffffffff) != -1 || (((Class238) class238).aByte1837 ^ 0xffffffff) != -1)));
				}
				Class90.method882(is, ls, (byte) 118);
				aShortArray4944 = ((ModelDefinitions) class178).aShortArray1408;
				anIntArray4959 = ((ModelDefinitions) class178).anIntArray1400;
				anInt4912 = ((ModelDefinitions) class178).anInt1406;
				anIntArray4906 = ((ModelDefinitions) class178).anIntArray1416;
				anIntArray4935 = ((ModelDefinitions) class178).anIntArray1418;
				anInt4929 = ((ModelDefinitions) class178).anInt1407;
				aClass35Array4919 = ((ModelDefinitions) class178).aClass35Array1398;
				Class251[] class251s = new Class251[anInt4912];
				aClass87Array4951 = ((ModelDefinitions) class178).aClass87Array1413;
				if (((ModelDefinitions) class178).aClass106Array1419 != null) {
					anInt4911 = ((ModelDefinitions) class178).aClass106Array1419.length;
					aClass181Array4913 = new Class181[anInt4911];
					aClass281Array4941 = new Class281[anInt4911];
					for (int i_626_ = 0; (i_626_ ^ 0xffffffff) > (anInt4911 ^ 0xffffffff); i_626_++) {
						Class106 class106 = ((ModelDefinitions) class178).aClass106Array1419[i_626_];
						Class177 class177 = Class67.method689(((Class106) class106).anInt905, (byte) -117);
						int i_627_ = -1;
						for (int i_628_ = 0; (anInt4948 ^ 0xffffffff) < (i_628_ ^ 0xffffffff); i_628_++) {
							if ((is[i_628_] ^ 0xffffffff) == (((Class106) class106).anInt906 ^ 0xffffffff)) {
								i_627_ = i_628_;
								break;
							}
						}
						if (i_627_ == -1)
							throw new RuntimeException();
						int i_629_ = ((Class208.anIntArray1579[(((ModelDefinitions) class178).aShortArray1415[((Class106) class106).anInt906]) & 0xffff]) & 0xffffff);
						i_629_ = (i_629_ | 255 + -((((ModelDefinitions) class178).aByteArray1411 != null) ? (((ModelDefinitions) class178).aByteArray1411[((Class106) class106).anInt906]) : 0) << 2107284952);
						aClass281Array4941[i_626_] = new Class281(i_627_, (((ModelDefinitions) class178).aShortArray1393[((Class106) class106).anInt906]), (((ModelDefinitions) class178).aShortArray1410[((Class106) class106).anInt906]), (((ModelDefinitions) class178).aShortArray1392[((Class106) class106).anInt906]), ((Class177) class177).anInt1374, ((Class177) class177).anInt1380, ((Class177) class177).anInt1373, ((Class177) class177).anInt1384, ((Class177) class177).anInt1379, ((Class177) class177).aBoolean1377, ((Class177) class177).aBoolean1383, ((Class106) class106).anInt907);
						aClass181Array4913[i_626_] = new Class181(i_629_);
					}
				}
				int i_630_ = 3 * anInt4948;
				Class60.aLongArray475 = new long[i_630_];
				aShortArray4901 = new short[i_630_];
				aShortArray4960 = new short[i_630_];
				aShortArray4946 = new short[anInt4948];
				aShortArray4953 = new short[i_630_];
				aShortArray4904 = new short[i_630_];
				aShort4905 = (short) i_611_;
				aShortArray4915 = new short[anInt4948];
				aByteArray4928 = new byte[i_630_];
				aShortArray4947 = new short[anInt4948];
				aShortArray4961 = new short[anInt4948];
				aFloatArray4914 = new float[i_630_];
				if (((ModelDefinitions) class178).aShortArray1394 != null)
					aShortArray4917 = new short[anInt4948];
				aShortArray4957 = new short[i_630_];
				aFloatArray4955 = new float[i_630_];
				aShort4902 = (short) i_610_;
				aShortArray4962 = new short[i_630_];
				aShortArray4954 = new short[anInt4948];
				aByteArray4958 = new byte[anInt4948];
				int i_631_ = 0;
				for (int i_632_ = 0; ((i_632_ ^ 0xffffffff) > (((ModelDefinitions) class178).anInt1406 ^ 0xffffffff)); i_632_++) {
					int i_633_ = anIntArray4932[i_632_];
					anIntArray4932[i_632_] = i_631_;
					class251s[i_632_] = new Class251();
					i_631_ += i_633_;
				}
				anIntArray4932[((ModelDefinitions) class178).anInt1406] = i_631_;
				Class250 class250 = Class224_Sub2.method2836(is, true, class178, anInt4948);
				Class378[] class378s = new Class378[((ModelDefinitions) class178).anInt1391];
				for (int i_634_ = 0; ((i_634_ ^ 0xffffffff) > (((ModelDefinitions) class178).anInt1391 ^ 0xffffffff)); i_634_++) {
					short i_635_ = ((ModelDefinitions) class178).aShortArray1393[i_634_];
					short i_636_ = ((ModelDefinitions) class178).aShortArray1410[i_634_];
					short i_637_ = ((ModelDefinitions) class178).aShortArray1392[i_634_];
					int i_638_ = anIntArray4906[i_636_] + -anIntArray4906[i_635_];
					int i_639_ = anIntArray4959[i_636_] - anIntArray4959[i_635_];
					int i_640_ = anIntArray4935[i_636_] - anIntArray4935[i_635_];
					int i_641_ = -anIntArray4906[i_635_] + anIntArray4906[i_637_];
					int i_642_ = anIntArray4959[i_637_] - anIntArray4959[i_635_];
					int i_643_ = -anIntArray4935[i_635_] + anIntArray4935[i_637_];
					int i_644_ = -(i_640_ * i_642_) + i_639_ * i_643_;
					int i_645_ = i_641_ * i_640_ - i_638_ * i_643_;
					int i_646_;
					for (i_646_ = -(i_641_ * i_639_) + i_638_ * i_642_; ((i_644_ ^ 0xffffffff) < -8193 || i_645_ > 8192 || (i_646_ ^ 0xffffffff) < -8193 || (i_644_ ^ 0xffffffff) > 8191 || i_645_ < -8192 || (i_646_ ^ 0xffffffff) > 8191); i_646_ >>= 1) {
						i_645_ >>= 1;
						i_644_ >>= 1;
					}
					int i_647_ = (int) Math.sqrt((double) (i_644_ * i_644_ - (-(i_645_ * i_645_) - i_646_ * i_646_)));
					if ((i_647_ ^ 0xffffffff) >= -1)
						i_647_ = 1;
					i_645_ = i_645_ * 256 / i_647_;
					i_646_ = i_646_ * 256 / i_647_;
					i_644_ = 256 * i_644_ / i_647_;
					byte i_648_ = (((ModelDefinitions) class178).aByteArray1414 != null ? ((ModelDefinitions) class178).aByteArray1414[i_634_] : (byte) 0);
					if ((i_648_ ^ 0xffffffff) != -1) {
						if ((i_648_ ^ 0xffffffff) == -2) {
							Class378 class378 = class378s[i_634_] = new Class378();
							((Class378) class378).anInt3191 = i_646_;
							((Class378) class378).anInt3187 = i_645_;
							((Class378) class378).anInt3188 = i_644_;
						}
					} else {
						Class251 class251 = class251s[i_635_];
						((Class251) class251).anInt1920++;
						((Class251) class251).anInt1918 += i_644_;
						((Class251) class251).anInt1917 += i_646_;
						((Class251) class251).anInt1919 += i_645_;
						class251 = class251s[i_636_];
						((Class251) class251).anInt1919 += i_645_;
						((Class251) class251).anInt1918 += i_644_;
						((Class251) class251).anInt1920++;
						((Class251) class251).anInt1917 += i_646_;
						class251 = class251s[i_637_];
						((Class251) class251).anInt1917 += i_646_;
						((Class251) class251).anInt1919 += i_645_;
						((Class251) class251).anInt1918 += i_644_;
						((Class251) class251).anInt1920++;
					}
				}
				for (int i_649_ = 0; (anInt4948 ^ 0xffffffff) < (i_649_ ^ 0xffffffff); i_649_++) {
					int i_650_ = is[i_649_];
					int i_651_ = (((ModelDefinitions) class178).aShortArray1415[i_650_] & 0xffff);
					int i_652_;
					if (((ModelDefinitions) class178).aByteArray1420 != null)
						i_652_ = ((ModelDefinitions) class178).aByteArray1420[i_650_];
					else
						i_652_ = -1;
					int i_653_;
					if (((ModelDefinitions) class178).aByteArray1411 != null)
						i_653_ = (((ModelDefinitions) class178).aByteArray1411[i_650_] & 0xff);
					else
						i_653_ = 0;
					short i_654_ = (((ModelDefinitions) class178).aShortArray1409 != null ? ((ModelDefinitions) class178).aShortArray1409[i_650_] : (short) -1);
					if ((i_654_ ^ 0xffffffff) != 0 && (anInt4963 & 0x40) != 0) {
						Class238 class238 = var_d.method11(i_654_ & 0xffff, -28755);
						if (((Class238) class238).aBoolean1825)
							i_654_ = (short) -1;
					}
					float f = 0.0F;
					float f_655_ = 0.0F;
					float f_656_ = 0.0F;
					float f_657_ = 0.0F;
					float f_658_ = 0.0F;
					float f_659_ = 0.0F;
					int i_660_ = 0;
					int i_661_ = 0;
					int i_662_ = 0;
					if (i_654_ != -1) {
						if ((i_652_ ^ 0xffffffff) != 0) {
							i_652_ &= 0xff;
							byte i_663_ = ((ModelDefinitions) class178).aByteArray1388[i_652_];
							if (i_663_ != 0) {
								short i_664_ = (((ModelDefinitions) class178).aShortArray1393[i_650_]);
								short i_665_ = (((ModelDefinitions) class178).aShortArray1410[i_650_]);
								short i_666_ = (((ModelDefinitions) class178).aShortArray1392[i_650_]);
								int i_667_ = (((Class250) class250).anIntArray1911[i_652_]);
								int i_668_ = (((Class250) class250).anIntArray1915[i_652_]);
								int i_669_ = (((Class250) class250).anIntArray1912[i_652_]);
								float[] fs = (((Class250) class250).aFloatArrayArray1910[i_652_]);
								byte i_670_ = (((ModelDefinitions) class178).aByteArray1399[i_652_]);
								float f_671_ = ((float) (((ModelDefinitions) class178).anIntArray1412[i_652_]) / 256.0F);
								if (i_663_ != 1) {
									if (i_663_ == 2) {
										float f_672_ = ((float) (((ModelDefinitions) class178).anIntArray1397[i_652_]) / 256.0F);
										float f_673_ = ((float) (((ModelDefinitions) class178).anIntArray1386[i_652_]) / 256.0F);
										int i_674_ = (-(((ModelDefinitions) class178).anIntArray1416[i_664_]) + (((ModelDefinitions) class178).anIntArray1416[i_665_]));
										int i_675_ = (-(((ModelDefinitions) class178).anIntArray1400[i_664_]) + (((ModelDefinitions) class178).anIntArray1400[i_665_]));
										int i_676_ = (-(((ModelDefinitions) class178).anIntArray1418[i_664_]) + (((ModelDefinitions) class178).anIntArray1418[i_665_]));
										int i_677_ = (-(((ModelDefinitions) class178).anIntArray1416[i_664_]) + (((ModelDefinitions) class178).anIntArray1416[i_666_]));
										int i_678_ = ((((ModelDefinitions) class178).anIntArray1400[i_666_]) + -(((ModelDefinitions) class178).anIntArray1400[i_664_]));
										int i_679_ = (-(((ModelDefinitions) class178).anIntArray1418[i_664_]) + (((ModelDefinitions) class178).anIntArray1418[i_666_]));
										int i_680_ = (-(i_676_ * i_678_) + i_675_ * i_679_);
										int i_681_ = (-(i_674_ * i_679_) + i_676_ * i_677_);
										int i_682_ = (i_678_ * i_674_ - i_677_ * i_675_);
										float f_683_ = (64.0F / (float) (((ModelDefinitions) class178).anIntArray1389[i_652_]));
										float f_684_ = (64.0F / (float) (((ModelDefinitions) class178).anIntArray1404[i_652_]));
										float f_685_ = (64.0F / (float) (((ModelDefinitions) class178).anIntArray1390[i_652_]));
										float f_686_ = (((float) i_681_ * fs[1] + fs[0] * (float) i_680_ + fs[2] * (float) i_682_) / f_683_);
										float f_687_ = ((fs[4] * (float) i_681_ + (float) i_680_ * fs[3] + fs[5] * (float) i_682_) / f_684_);
										float f_688_ = ((fs[6] * (float) i_680_ + (float) i_681_ * fs[7] + fs[8] * (float) i_682_) / f_685_);
										i_662_ = Class69.method696(f_686_, f_688_, (byte) -77, f_687_);
										Class48_Sub1_Sub1.method461((((ModelDefinitions) class178).anIntArray1400[i_664_]), f_673_, i_670_, i_668_, f_671_, 127, f_672_, fs, i_662_, Class76_Sub9.aFloatArray3784, i_669_, (((ModelDefinitions) class178).anIntArray1418[i_664_]), i_667_, (((ModelDefinitions) class178).anIntArray1416[i_664_]));
										f_655_ = Class76_Sub9.aFloatArray3784[1];
										f = Class76_Sub9.aFloatArray3784[0];
										Class48_Sub1_Sub1.method461((((ModelDefinitions) class178).anIntArray1400[i_665_]), f_673_, i_670_, i_668_, f_671_, 125, f_672_, fs, i_662_, Class76_Sub9.aFloatArray3784, i_669_, (((ModelDefinitions) class178).anIntArray1418[i_665_]), i_667_, (((ModelDefinitions) class178).anIntArray1416[i_665_]));
										f_656_ = Class76_Sub9.aFloatArray3784[0];
										f_657_ = Class76_Sub9.aFloatArray3784[1];
										Class48_Sub1_Sub1.method461((((ModelDefinitions) class178).anIntArray1400[i_666_]), f_673_, i_670_, i_668_, f_671_, 122, f_672_, fs, i_662_, Class76_Sub9.aFloatArray3784, i_669_, (((ModelDefinitions) class178).anIntArray1418[i_666_]), i_667_, (((ModelDefinitions) class178).anIntArray1416[i_666_]));
										f_658_ = Class76_Sub9.aFloatArray3784[0];
										f_659_ = Class76_Sub9.aFloatArray3784[1];
									} else if ((i_663_ ^ 0xffffffff) == -4) {
										Collision.method2943(Class76_Sub9.aFloatArray3784, (((ModelDefinitions) class178).anIntArray1400[i_664_]), i_670_, i_669_, fs, (((ModelDefinitions) class178).anIntArray1418[i_664_]), i_668_, f_671_, (((ModelDefinitions) class178).anIntArray1416[i_664_]), i_667_, 113);
										f_655_ = Class76_Sub9.aFloatArray3784[1];
										f = Class76_Sub9.aFloatArray3784[0];
										Collision.method2943(Class76_Sub9.aFloatArray3784, (((ModelDefinitions) class178).anIntArray1400[i_665_]), i_670_, i_669_, fs, (((ModelDefinitions) class178).anIntArray1418[i_665_]), i_668_, f_671_, (((ModelDefinitions) class178).anIntArray1416[i_665_]), i_667_, 103);
										f_657_ = Class76_Sub9.aFloatArray3784[1];
										f_656_ = Class76_Sub9.aFloatArray3784[0];
										Collision.method2943(Class76_Sub9.aFloatArray3784, (((ModelDefinitions) class178).anIntArray1400[i_666_]), i_670_, i_669_, fs, (((ModelDefinitions) class178).anIntArray1418[i_666_]), i_668_, f_671_, (((ModelDefinitions) class178).anIntArray1416[i_666_]), i_667_, 103);
										f_659_ = Class76_Sub9.aFloatArray3784[1];
										f_658_ = Class76_Sub9.aFloatArray3784[0];
										if ((i_670_ & 0x1 ^ 0xffffffff) == -1) {
											if (!(f_658_ - f > 0.5F)) {
												if (f - f_658_ > 0.5F) {
													i_661_ = 2;
													f_658_++;
												}
											} else {
												i_661_ = 1;
												f_658_--;
											}
											if (!(f_656_ - f > 0.5F)) {
												if (f - f_656_ > 0.5F) {
													i_660_ = 2;
													f_656_++;
												}
											} else {
												f_656_--;
												i_660_ = 1;
											}
										} else {
											if (!(-f_655_ + f_659_ > 0.5F)) {
												if (-f_659_ + f_655_ > 0.5F) {
													f_659_++;
													i_661_ = 2;
												}
											} else {
												i_661_ = 1;
												f_659_--;
											}
											if (!(f_657_ - f_655_ > 0.5F)) {
												if (-f_657_ + f_655_ > 0.5F) {
													i_660_ = 2;
													f_657_++;
												}
											} else {
												i_660_ = 1;
												f_657_--;
											}
										}
									}
								} else {
									float f_689_ = ((float) (((ModelDefinitions) class178).anIntArray1390[i_652_]) / 1024.0F);
									Class98_Sub37.method1460((((ModelDefinitions) class178).anIntArray1416[i_664_]), i_669_, 8, (((ModelDefinitions) class178).anIntArray1418[i_664_]), i_668_, (((ModelDefinitions) class178).anIntArray1400[i_664_]), fs, f_689_, i_670_, i_667_, f_671_, Class76_Sub9.aFloatArray3784);
									f_655_ = Class76_Sub9.aFloatArray3784[1];
									f = Class76_Sub9.aFloatArray3784[0];
									Class98_Sub37.method1460((((ModelDefinitions) class178).anIntArray1416[i_665_]), i_669_, 8, (((ModelDefinitions) class178).anIntArray1418[i_665_]), i_668_, (((ModelDefinitions) class178).anIntArray1400[i_665_]), fs, f_689_, i_670_, i_667_, f_671_, Class76_Sub9.aFloatArray3784);
									f_657_ = Class76_Sub9.aFloatArray3784[1];
									f_656_ = Class76_Sub9.aFloatArray3784[0];
									Class98_Sub37.method1460((((ModelDefinitions) class178).anIntArray1416[i_666_]), i_669_, 8, (((ModelDefinitions) class178).anIntArray1418[i_666_]), i_668_, (((ModelDefinitions) class178).anIntArray1400[i_666_]), fs, f_689_, i_670_, i_667_, f_671_, Class76_Sub9.aFloatArray3784);
									f_658_ = Class76_Sub9.aFloatArray3784[0];
									f_659_ = Class76_Sub9.aFloatArray3784[1];
									float f_690_ = f_689_ / 2.0F;
									if ((i_670_ & 0x1) == 0) {
										if (-f + f_656_ > f_690_) {
											i_660_ = 1;
											f_656_ -= f_689_;
										} else if (f_690_ < f - f_656_) {
											i_660_ = 2;
											f_656_ += f_689_;
										}
										if (f_690_ < -f + f_658_) {
											i_661_ = 1;
											f_658_ -= f_689_;
										} else if (f_690_ < f - f_658_) {
											f_658_ += f_689_;
											i_661_ = 2;
										}
									} else {
										if (!(f_690_ < -f_655_ + f_659_)) {
											if (f_690_ < f_655_ - f_659_) {
												i_661_ = 2;
												f_659_ += f_689_;
											}
										} else {
											f_659_ -= f_689_;
											i_661_ = 1;
										}
										if (!(f_690_ < f_657_ - f_655_)) {
											if (f_690_ < f_655_ - f_657_) {
												f_657_ += f_689_;
												i_660_ = 2;
											}
										} else {
											f_657_ -= f_689_;
											i_660_ = 1;
										}
									}
								}
							} else {
								short i_691_ = (((ModelDefinitions) class178).aShortArray1393[i_650_]);
								short i_692_ = (((ModelDefinitions) class178).aShortArray1410[i_650_]);
								short i_693_ = (((ModelDefinitions) class178).aShortArray1392[i_650_]);
								short i_694_ = (((ModelDefinitions) class178).aShortArray1403[i_652_]);
								short i_695_ = (((ModelDefinitions) class178).aShortArray1421[i_652_]);
								short i_696_ = (((ModelDefinitions) class178).aShortArray1385[i_652_]);
								float f_697_ = (float) (((ModelDefinitions) class178).anIntArray1416[i_694_]);
								float f_698_ = (float) (((ModelDefinitions) class178).anIntArray1400[i_694_]);
								float f_699_ = (float) (((ModelDefinitions) class178).anIntArray1418[i_694_]);
								float f_700_ = ((float) (((ModelDefinitions) class178).anIntArray1416[i_695_]) - f_697_);
								float f_701_ = (-f_698_ + (float) (((ModelDefinitions) class178).anIntArray1400[i_695_]));
								float f_702_ = (-f_699_ + (float) (((ModelDefinitions) class178).anIntArray1418[i_695_]));
								float f_703_ = (-f_697_ + (float) (((ModelDefinitions) class178).anIntArray1416[i_696_]));
								float f_704_ = ((float) (((ModelDefinitions) class178).anIntArray1400[i_696_]) - f_698_);
								float f_705_ = (-f_699_ + (float) (((ModelDefinitions) class178).anIntArray1418[i_696_]));
								float f_706_ = ((float) (((ModelDefinitions) class178).anIntArray1416[i_691_]) - f_697_);
								float f_707_ = ((float) (((ModelDefinitions) class178).anIntArray1400[i_691_]) - f_698_);
								float f_708_ = (-f_699_ + (float) (((ModelDefinitions) class178).anIntArray1418[i_691_]));
								float f_709_ = ((float) (((ModelDefinitions) class178).anIntArray1416[i_692_]) - f_697_);
								float f_710_ = (-f_698_ + (float) (((ModelDefinitions) class178).anIntArray1400[i_692_]));
								float f_711_ = (-f_699_ + (float) (((ModelDefinitions) class178).anIntArray1418[i_692_]));
								float f_712_ = ((float) (((ModelDefinitions) class178).anIntArray1416[i_693_]) - f_697_);
								float f_713_ = ((float) (((ModelDefinitions) class178).anIntArray1400[i_693_]) - f_698_);
								float f_714_ = ((float) (((ModelDefinitions) class178).anIntArray1418[i_693_]) - f_699_);
								float f_715_ = f_701_ * f_705_ - f_704_ * f_702_;
								float f_716_ = -(f_700_ * f_705_) + f_702_ * f_703_;
								float f_717_ = f_700_ * f_704_ - f_701_ * f_703_;
								float f_718_ = f_704_ * f_717_ - f_716_ * f_705_;
								float f_719_ = f_705_ * f_715_ - f_717_ * f_703_;
								float f_720_ = f_716_ * f_703_ - f_704_ * f_715_;
								float f_721_ = 1.0F / (f_720_ * f_702_ + (f_700_ * f_718_ + f_701_ * f_719_));
								f_658_ = (f_714_ * f_720_ + (f_713_ * f_719_ + f_712_ * f_718_)) * f_721_;
								f_656_ = (f_718_ * f_709_ + f_710_ * f_719_ + f_720_ * f_711_) * f_721_;
								f = f_721_ * (f_707_ * f_719_ + f_706_ * f_718_ + f_708_ * f_720_);
								f_720_ = -(f_701_ * f_715_) + f_716_ * f_700_;
								f_718_ = f_701_ * f_717_ - f_716_ * f_702_;
								f_719_ = -(f_700_ * f_717_) + f_702_ * f_715_;
								f_721_ = 1.0F / (f_704_ * f_719_ + f_718_ * f_703_ + f_720_ * f_705_);
								f_657_ = (f_719_ * f_710_ + f_718_ * f_709_ + f_711_ * f_720_) * f_721_;
								f_655_ = (f_708_ * f_720_ + (f_707_ * f_719_ + f_718_ * f_706_)) * f_721_;
								f_659_ = (f_719_ * f_713_ + f_712_ * f_718_ + f_720_ * f_714_) * f_721_;
							}
						} else {
							f_656_ = 1.0F;
							f_659_ = 0.0F;
							f = 0.0F;
							f_657_ = 1.0F;
							f_658_ = 0.0F;
							f_655_ = 1.0F;
							i_660_ = 1;
							i_661_ = 2;
						}
					}
					byte i_722_;
					if (((ModelDefinitions) class178).aByteArray1414 == null)
						i_722_ = (byte) 0;
					else
						i_722_ = ((ModelDefinitions) class178).aByteArray1414[i_650_];
					if ((i_722_ ^ 0xffffffff) != -1) {
						if (i_722_ == 1) {
							Class378 class378 = class378s[i_650_];
							long l = ((((long) i_653_ + (long) (i_662_ << 655766264) + (long) (i_651_ << -1296898200)) << 279144352) + (long) (((((Class378) class378).anInt3191 - -256) << 1427014102) + (i_652_ << 1210213378) + ((((((Class378) class378).anInt3188) ^ 0xffffffff) >= -1 ? 2048 : 1024) + ((((Class378) class378).anInt3187) - -256 << 643845708))));
							aShortArray4947[i_649_] = method2409(f, i_649_, l, ((Class378) class378).anInt3188, (((ModelDefinitions) class178).aShortArray1393[i_650_]), ((Class378) class378).anInt3187, ((Class378) class378).anInt3191, class178, 0, 1, f_655_);
							aShortArray4915[i_649_] = method2409(f_656_, i_649_, (long) i_660_ + l, ((Class378) class378).anInt3188, (((ModelDefinitions) class178).aShortArray1410[i_650_]), ((Class378) class378).anInt3187, ((Class378) class378).anInt3191, class178, 0, 1, f_657_);
							aShortArray4961[i_649_] = method2409(f_658_, i_649_, l + (long) i_661_, ((Class378) class378).anInt3188, (((ModelDefinitions) class178).aShortArray1392[i_650_]), ((Class378) class378).anInt3187, ((Class378) class378).anInt3191, class178, 0, 1, f_659_);
						}
					} else {
						long l = ((long) (i_652_ << 1829690562) + (((long) (i_662_ << -292347432) - (-(long) (i_651_ << -747595384) - (long) i_653_)) << -365996704));
						short i_723_ = ((ModelDefinitions) class178).aShortArray1393[i_650_];
						short i_724_ = ((ModelDefinitions) class178).aShortArray1410[i_650_];
						short i_725_ = ((ModelDefinitions) class178).aShortArray1392[i_650_];
						Class251 class251 = class251s[i_723_];
						aShortArray4947[i_649_] = method2409(f, i_649_, l, ((Class251) class251).anInt1918, i_723_, ((Class251) class251).anInt1919, ((Class251) class251).anInt1917, class178, ((Class251) class251).anInt1920, 1, f_655_);
						class251 = class251s[i_724_];
						aShortArray4915[i_649_] = method2409(f_656_, i_649_, l + (long) i_660_, ((Class251) class251).anInt1918, i_724_, ((Class251) class251).anInt1919, ((Class251) class251).anInt1917, class178, ((Class251) class251).anInt1920, 1, f_657_);
						class251 = class251s[i_725_];
						aShortArray4961[i_649_] = method2409(f_658_, i_649_, (long) i_661_ + l, ((Class251) class251).anInt1918, i_725_, ((Class251) class251).anInt1919, ((Class251) class251).anInt1917, class178, ((Class251) class251).anInt1920, 1, f_659_);
					}
					if (((ModelDefinitions) class178).aByteArray1411 != null)
						aByteArray4958[i_649_] = ((ModelDefinitions) class178).aByteArray1411[i_650_];
					if (((ModelDefinitions) class178).aShortArray1394 != null)
						aShortArray4917[i_649_] = ((ModelDefinitions) class178).aShortArray1394[i_650_];
					aShortArray4946[i_649_] = ((ModelDefinitions) class178).aShortArray1415[i_650_];
					aShortArray4954[i_649_] = i_654_;
				}
				if ((anInt4909 ^ 0xffffffff) < -1) {
					int i_726_ = 1;
					short i_727_ = aShortArray4954[0];
					for (int i_728_ = 0; anInt4909 > i_728_; i_728_++) {
						short i_729_ = aShortArray4954[i_728_];
						if (i_729_ != i_727_) {
							i_727_ = i_729_;
							i_726_++;
						}
					}
					anIntArray4945 = new int[i_726_];
					anIntArray4918 = new int[i_726_];
					anIntArray4907 = new int[i_726_ - -1];
					anIntArray4907[0] = 0;
					int i_730_ = anInt4936;
					int i_731_ = 0;
					i_727_ = aShortArray4954[0];
					i_726_ = 0;
					for (int i_732_ = 0; i_732_ < anInt4909; i_732_++) {
						short i_733_ = aShortArray4954[i_732_];
						if (i_727_ != i_733_) {
							anIntArray4945[i_726_] = i_730_;
							anIntArray4918[i_726_] = i_731_ - i_730_ - -1;
							anIntArray4907[++i_726_] = i_732_;
							i_727_ = i_733_;
							i_730_ = anInt4936;
							i_731_ = 0;
						}
						int i_734_ = aShortArray4947[i_732_];
						if ((i_731_ ^ 0xffffffff) > (i_734_ ^ 0xffffffff))
							i_731_ = i_734_;
						if ((i_730_ ^ 0xffffffff) < (i_734_ ^ 0xffffffff))
							i_730_ = i_734_;
						i_734_ = aShortArray4915[i_732_];
						if (i_734_ > i_731_)
							i_731_ = i_734_;
						if ((i_730_ ^ 0xffffffff) < (i_734_ ^ 0xffffffff))
							i_730_ = i_734_;
						i_734_ = aShortArray4961[i_732_];
						if (i_734_ < i_730_)
							i_730_ = i_734_;
						if (i_734_ > i_731_)
							i_731_ = i_734_;
					}
					anIntArray4945[i_726_] = i_730_;
					anIntArray4918[i_726_] = 1 + i_731_ - i_730_;
					anIntArray4907[++i_726_] = anInt4909;
				}
				Class60.aLongArray475 = null;
				aShortArray4901 = Class223.method2829(aShortArray4901, anInt4936, 26813);
				aShortArray4904 = Class223.method2829(aShortArray4904, anInt4936, 26813);
				aShortArray4953 = Class223.method2829(aShortArray4953, anInt4936, 26813);
				aShortArray4957 = Class223.method2829(aShortArray4957, anInt4936, 26813);
				aShortArray4962 = Class223.method2829(aShortArray4962, anInt4936, 26813);
				aByteArray4928 = Class69_Sub2.method705(anInt4936, 81, aByteArray4928);
				aFloatArray4955 = Class246_Sub3_Sub3_Sub2.method3021(-65537, anInt4936, aFloatArray4955);
				aFloatArray4914 = Class246_Sub3_Sub3_Sub2.method3021(-65537, anInt4936, aFloatArray4914);
				if (((ModelDefinitions) class178).anIntArray1417 != null && Class98_Sub10_Sub29.method1092(i, anInt4963, (byte) -116))
					anIntArrayArray4925 = class178.method2595(31, false);
				if (((ModelDefinitions) class178).aClass106Array1419 != null && Class2.method169(false, i, anInt4963))
					anIntArrayArray4934 = class178.method2596(21517);
				if (((ModelDefinitions) class178).anIntArray1395 == null || !Class128.method2223(anInt4963, (byte) -67, i))
					break;
				int i_735_ = 0;
				int[] is_736_ = new int[256];
				for (int i_737_ = 0; (i_737_ ^ 0xffffffff) > (anInt4948 ^ 0xffffffff); i_737_++) {
					int i_738_ = ((ModelDefinitions) class178).anIntArray1395[is[i_737_]];
					if (i_738_ >= 0) {
						is_736_[i_738_]++;
						if (i_735_ < i_738_)
							i_735_ = i_738_;
					}
				}
				anIntArrayArray4903 = new int[1 + i_735_][];
				for (int i_739_ = 0; (i_739_ ^ 0xffffffff) >= (i_735_ ^ 0xffffffff); i_739_++) {
					anIntArrayArray4903[i_739_] = new int[is_736_[i_739_]];
					is_736_[i_739_] = 0;
				}
				for (int i_740_ = 0; (anInt4948 ^ 0xffffffff) < (i_740_ ^ 0xffffffff); i_740_++) {
					int i_741_ = ((ModelDefinitions) class178).anIntArray1395[is[i_740_]];
					if ((i_741_ ^ 0xffffffff) <= -1)
						anIntArrayArray4903[i_741_][is_736_[i_741_]++] = i_740_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qw.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + (class178 != null ? "{...}" : "null") + ',' + i + ',' + i_610_ + ',' + i_611_ + ',' + i_612_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method2408(byte i) {
		try {
			if ((Class177.anInt1376 ^ 0xffffffff) > -2)
				return false;
			if (i != 57)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.DA(" + i + ')');
		}
	}

	final int V() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4924;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.V(" + ')');
		}
	}

	final void method2327() {
		/* empty */
	}

	private final short method2409(float f, int i, long l, int i_742_, int i_743_, int i_744_, int i_745_, ModelDefinitions class178, int i_746_, int i_747_, float f_748_) {
		try {
			int i_749_ = anIntArray4932[i_743_];
			int i_750_ = anIntArray4932[i_747_ + i_743_];
			int i_751_ = 0;
			for (int i_752_ = i_749_; (i_752_ ^ 0xffffffff) > (i_750_ ^ 0xffffffff); i_752_++) {
				short i_753_ = aShortArray4960[i_752_];
				if (i_753_ == 0) {
					i_751_ = i_752_;
					break;
				}
				if (Class60.aLongArray475[i_752_] == l)
					return (short) (i_753_ - 1);
			}
			aShortArray4960[i_751_] = (short) (1 + anInt4936);
			Class60.aLongArray475[i_751_] = l;
			aShortArray4904[anInt4936] = (short) i;
			aShortArray4901[anInt4936] = (short) i_743_;
			aShortArray4953[anInt4936] = (short) i_742_;
			aShortArray4957[anInt4936] = (short) i_744_;
			aShortArray4962[anInt4936] = (short) i_745_;
			aByteArray4928[anInt4936] = (byte) i_746_;
			aFloatArray4955[anInt4936] = f;
			aFloatArray4914[anInt4936] = f_748_;
			return (short) anInt4936++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.PA(" + f + ',' + i + ',' + l + ',' + i_742_ + ',' + i_743_ + ',' + i_744_ + ',' + i_745_ + ',' + (class178 != null ? "{...}" : "null") + ',' + i_746_ + ',' + i_747_ + ',' + f_748_ + ')'));
		}
	}

	final boolean method2333(int i, int i_754_, Class111 class111, boolean bool, int i_755_, int i_756_) {
		try {
			return method2394(-121, i, i_756_, i_754_, bool, i_755_, class111);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.KB(" + i + ',' + i_754_ + ',' + (class111 != null ? "{...}" : "null") + ',' + bool + ',' + i_755_ + ',' + i_756_ + ')'));
		}
	}

	private final void method2410(int i) {
		do {
			try {
				if (aClass189_4933 != null)
					((Class189) aClass189_4933).aBoolean1458 = false;
				if (i <= -51)
					break;
				ua();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qw.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class146_Sub3(ha_Sub3 var_ha_Sub3, int i, int i_757_, boolean bool, boolean bool_758_) {
		anInt4912 = 0;
		anInt4929 = 0;
		aBoolean4916 = false;
		aBoolean4908 = true;
		anInt4948 = 0;
		anInt4936 = 0;
		aBoolean4940 = false;
		aBoolean4938 = false;
		try {
			aBoolean4916 = bool_758_;
			anInt4963 = i_757_;
			anInt4942 = i;
			aHa_Sub3_4899 = var_ha_Sub3;
			if (bool || Class93.method901(anInt4963, anInt4942, -125))
				aClass189_4933 = new Class189(Class238.method2919(-84, anInt4942, anInt4963));
			if (bool || Class5.method176(24578, anInt4942, anInt4963))
				aClass189_4930 = new Class189(r_Sub2.method1655(anInt4942, (byte) -121, anInt4963));
			if (bool || Class53_Sub1.method502(anInt4963, anInt4942, (byte) 115))
				aClass189_4920 = new Class189(Class98_Sub27.method1292(anInt4963, (byte) 114, anInt4942));
			if (bool || Class98_Sub10_Sub1.method1005(anInt4942, anInt4963, (byte) -23))
				aClass189_4927 = new Class189(Class21_Sub3.method276(anInt4942, 15123, anInt4963));
			if (bool || VarpClass.method2287(anInt4942, anInt4963, 2048))
				aClass18_4931 = new Class18(Class276.method3286((byte) 127, anInt4942, anInt4963));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qw.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_757_ + ',' + bool + ',' + bool_758_ + ')'));
		}
	}

	final void method2326() {
		try {
			if (anInt4936 > 0 && anInt4909 > 0) {
				method2403((byte) -127);
				method2399(103);
				method2396(8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.M(" + ')');
		}
	}

	final int HA() {
		try {
			if (!aBoolean4922)
				method2401(-21065);
			return anInt4921;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.HA(" + ')');
		}
	}

	final void k(int i) {
		try {
			int i_759_ = Class284_Sub2_Sub2.anIntArray6200[i];
			int i_760_ = Class284_Sub2_Sub2.anIntArray6202[i];
			for (int i_761_ = 0; anInt4912 > i_761_; i_761_++) {
				int i_762_ = ((anIntArray4906[i_761_] * i_760_ + anIntArray4935[i_761_] * i_759_) >> -1407988562);
				anIntArray4935[i_761_] = (-(i_759_ * anIntArray4906[i_761_]) + i_760_ * anIntArray4935[i_761_]) >> 818672142;
				anIntArray4906[i_761_] = i_762_;
			}
			for (int i_763_ = 0; anInt4936 > i_763_; i_763_++) {
				int i_764_ = ((aShortArray4962[i_763_] * i_759_ - -(i_760_ * aShortArray4953[i_763_])) >> 1571333358);
				aShortArray4962[i_763_] = (short) ((i_760_ * aShortArray4962[i_763_] + -(i_759_ * aShortArray4953[i_763_])) >> -715830066);
				aShortArray4953[i_763_] = (short) i_764_;
			}
			method2410(-81);
			method2404((byte) -64);
			aBoolean4922 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qw.k(" + i + ')');
		}
	}

	final void method2343(Class111 class111) {
		do {
			try {
				Class111_Sub3 class111_sub3 = (Class111_Sub3) class111;
				if (aClass87Array4951 != null) {
					for (int i = 0; ((aClass87Array4951.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
						Class87 class87 = aClass87Array4951[i];
						Class87 class87_765_ = class87;
						if (((Class87) class87).aClass87_657 != null)
							class87_765_ = ((Class87) class87).aClass87_657;
						((Class87) class87_765_).anInt670 = (int) (((float) (anIntArray4959[((Class87) class87).anInt666]) * (((Class111_Sub3) class111_sub3).aFloat4711)) + ((((Class111_Sub3) class111_sub3).aFloat4712) * (float) (anIntArray4906[(((Class87) class87).anInt666)])) + ((float) (anIntArray4935[(((Class87) class87).anInt666)]) * (((Class111_Sub3) class111_sub3).aFloat4705)) + (((Class111_Sub3) class111_sub3).aFloat4702));
						((Class87) class87_765_).anInt668 = (int) (((float) (anIntArray4959[((Class87) class87).anInt666]) * (((Class111_Sub3) class111_sub3).aFloat4706)) + ((float) (anIntArray4906[(((Class87) class87).anInt666)]) * (((Class111_Sub3) class111_sub3).aFloat4714)) + ((float) (anIntArray4935[(((Class87) class87).anInt666)]) * (((Class111_Sub3) class111_sub3).aFloat4710)) + (((Class111_Sub3) class111_sub3).aFloat4709));
						((Class87) class87_765_).anInt671 = (int) (((float) (anIntArray4935[((Class87) class87).anInt666]) * (((Class111_Sub3) class111_sub3).aFloat4704)) + (((((Class111_Sub3) class111_sub3).aFloat4713) * (float) (anIntArray4959[(((Class87) class87).anInt666)])) + ((((Class111_Sub3) class111_sub3).aFloat4708) * (float) (anIntArray4906[(((Class87) class87).anInt666)]))) + (((Class111_Sub3) class111_sub3).aFloat4703));
						((Class87) class87_765_).anInt663 = (int) (((Class111_Sub3) class111_sub3).aFloat4702 + (((((Class111_Sub3) class111_sub3).aFloat4711) * (float) (anIntArray4959[(((Class87) class87).anInt661)])) + ((((Class111_Sub3) class111_sub3).aFloat4712) * (float) (anIntArray4906[(((Class87) class87).anInt661)])) + ((((Class111_Sub3) class111_sub3).aFloat4705) * (float) (anIntArray4935[(((Class87) class87).anInt661)]))));
						((Class87) class87_765_).anInt664 = (int) (((Class111_Sub3) class111_sub3).aFloat4709 + (((((Class111_Sub3) class111_sub3).aFloat4710) * (float) (anIntArray4935[(((Class87) class87).anInt661)])) + (((((Class111_Sub3) class111_sub3).aFloat4714) * (float) (anIntArray4906[(((Class87) class87).anInt661)])) + ((float) (anIntArray4959[(((Class87) class87).anInt661)]) * ((Class111_Sub3) class111_sub3).aFloat4706))));
						((Class87) class87_765_).anInt656 = (int) (((((Class111_Sub3) class111_sub3).aFloat4708) * (float) (anIntArray4906[(((Class87) class87).anInt661)])) + ((((Class111_Sub3) class111_sub3).aFloat4713) * (float) (anIntArray4959[(((Class87) class87).anInt661)])) + ((((Class111_Sub3) class111_sub3).aFloat4704) * (float) (anIntArray4935[(((Class87) class87).anInt661)])) + (((Class111_Sub3) class111_sub3).aFloat4703));
						((Class87) class87_765_).anInt659 = (int) (((float) (anIntArray4935[((Class87) class87).anInt674]) * (((Class111_Sub3) class111_sub3).aFloat4705)) + (((((Class111_Sub3) class111_sub3).aFloat4711) * (float) (anIntArray4959[(((Class87) class87).anInt674)])) + ((float) (anIntArray4906[(((Class87) class87).anInt674)]) * (((Class111_Sub3) class111_sub3).aFloat4712))) + (((Class111_Sub3) class111_sub3).aFloat4702));
						((Class87) class87_765_).anInt669 = (int) (((Class111_Sub3) class111_sub3).aFloat4709 + (((((Class111_Sub3) class111_sub3).aFloat4706) * (float) (anIntArray4959[(((Class87) class87).anInt674)])) + ((float) (anIntArray4906[(((Class87) class87).anInt674)]) * (((Class111_Sub3) class111_sub3).aFloat4714)) + ((((Class111_Sub3) class111_sub3).aFloat4710) * (float) (anIntArray4935[(((Class87) class87).anInt674)]))));
						((Class87) class87_765_).anInt662 = (int) (((Class111_Sub3) class111_sub3).aFloat4703 + (((((Class111_Sub3) class111_sub3).aFloat4713) * (float) (anIntArray4959[(((Class87) class87).anInt674)])) + ((float) (anIntArray4906[(((Class87) class87).anInt674)]) * (((Class111_Sub3) class111_sub3).aFloat4708)) + ((((Class111_Sub3) class111_sub3).aFloat4704) * (float) (anIntArray4935[(((Class87) class87).anInt674)]))));
					}
				}
				if (aClass35Array4919 == null)
					break;
				for (int i = 0; ((aClass35Array4919.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
					Class35 class35 = aClass35Array4919[i];
					Class35 class35_766_ = class35;
					if (((Class35) class35).aClass35_328 != null)
						class35_766_ = ((Class35) class35).aClass35_328;
					if (((Class35) class35).aClass111_334 == null)
						((Class35) class35).aClass111_334 = class111_sub3.method2102();
					else
						((Class35) class35).aClass111_334.method2092(class111_sub3);
					((Class35) class35_766_).anInt331 = (int) (((Class111_Sub3) class111_sub3).aFloat4702 + ((((Class111_Sub3) class111_sub3).aFloat4705 * (float) (anIntArray4935[(((Class35) class35).anInt327)])) + (((((Class111_Sub3) class111_sub3).aFloat4712) * (float) (anIntArray4906[(((Class35) class35).anInt327)])) + ((float) (anIntArray4959[(((Class35) class35).anInt327)]) * (((Class111_Sub3) class111_sub3).aFloat4711)))));
					((Class35) class35_766_).anInt330 = (int) (((Class111_Sub3) class111_sub3).aFloat4709 + (((float) (anIntArray4935[((Class35) class35).anInt327]) * (((Class111_Sub3) class111_sub3).aFloat4710)) + (((float) (anIntArray4906[(((Class35) class35).anInt327)]) * (((Class111_Sub3) class111_sub3).aFloat4714)) + ((float) (anIntArray4959[(((Class35) class35).anInt327)]) * (((Class111_Sub3) class111_sub3).aFloat4706)))));
					((Class35) class35_766_).anInt337 = (int) (((Class111_Sub3) class111_sub3).aFloat4703 + (((float) (anIntArray4935[((Class35) class35).anInt327]) * (((Class111_Sub3) class111_sub3).aFloat4704)) + (((float) (anIntArray4959[(((Class35) class35).anInt327)]) * (((Class111_Sub3) class111_sub3).aFloat4713)) + ((float) (anIntArray4906[(((Class35) class35).anInt327)]) * (((Class111_Sub3) class111_sub3).aFloat4708)))));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qw.DB(" + (class111 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}
}
