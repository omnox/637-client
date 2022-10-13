/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Dimension;

abstract class Class277 {
	static int[] anIntArray2049 = new int[13];
	static int anInt2050;
	static OutgoingOpcode aClass171_2051 = new OutgoingOpcode(68, 3);
	/* synthetic */ static Class aClass2053;

	static final void method3288(boolean bool, int i, String string, int i_0_, String string_1_, boolean bool_2_, int i_3_) {
		try {
			Class208.aClass207_1581.anInt1575 = 1;
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_4_ = -1;
			String string_5_ = null;
			if (i != -1) {
				ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i);
				if (class149 == null || !bool_2_ == class149.method2433(false))
					return;
				if (class149.method2433(false))
					string_5_ = class149.aString1203;
				else
					i_4_ = class149.anInt1202;
			}
			int i_6_ = 0;
			for (int i_7_ = 0; (i_7_ < Class98_Sub46_Sub19.getItemDefs.anInt1554); i_7_++) {
				ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_7_);
				if ((!bool || class297.stockmarket) && class297.anInt2414 == -1 && class297.anInt2459 == -1 && class297.anInt2464 == 0 && class297.name.toLowerCase().indexOf(string) != -1) {
					if (i != -1) {
						if (bool_2_) {
							if (!string_1_.equals(class297.method3495(string_5_, -1, i)))
								continue;
						} else if (class297.method3494(i, (byte) -90, i_4_) != i_3_)
							continue;
					}
					if (i_6_ >= 250) {
						Class64_Sub16.aShortArray3682 = null;
						Class18.anInt214 = -1;
						return;
					}
					if (is.length <= i_6_) {
						short[] is_8_ = new short[is.length * 2];
						for (int i_9_ = 0; i_6_ > i_9_; i_9_++)
							is_8_[i_9_] = is[i_9_];
						is = is_8_;
					}
					is[i_6_++] = (short) i_7_;
				}
			}
			Class64_Sub16.aShortArray3682 = is;
			Class18.anInt214 = i_6_;
			Class85.anInt638 = 0;
			String[] strings = new String[Class18.anInt214];
			for (int i_10_ = 0; i_10_ < Class18.anInt214; i_10_++)
				strings[i_10_] = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(is[i_10_]).name);
			OutgoingPacket.method1126(true, Class64_Sub16.aShortArray3682, strings);
			Class208.aClass207_1581.method2760((byte) -116);
			Class208.aClass207_1581.anInt1575 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rfa.E(" + bool + ',' + i + ',' + (string != null ? "{...}" : "null") + ',' + i_0_ + ',' + (string_1_ != null ? "{...}" : "null") + ',' + bool_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method3289(int i, int i_11_, int i_12_, int i_13_, ha var_ha, int i_14_, boolean bool, int i_15_, int i_16_) {
		do {
			try {
				Interface19 interface19 = (Interface19) Class21_Sub1.method268(i, i_15_, i_12_);
				if (interface19 != null) {
					Class352 class352 = (Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119));
					int i_17_ = 0x3 & interface19.method66(4657);
					int i_18_ = interface19.method63((byte) 20);
					if (class352.anInt2990 != -1)
						Class122.method2201(i_17_, class352, i_11_, var_ha, i_14_, (byte) 70);
					else {
						int i_19_ = i_16_;
						if (class352.anInt2998 > 0)
							i_19_ = i_13_;
						if (i_18_ == 0 || i_18_ == 2) {
							if (i_17_ != 0) {
								if (i_17_ != 1) {
									if (i_17_ == 2)
										var_ha.method1755(8479, i_14_, 3 + i_11_, i_19_, 4);
									else if (i_17_ == 3)
										var_ha.method1753(22294, 4, i_19_, i_14_ - -3, i_11_);
								} else
									var_ha.method1753(22294, 4, i_19_, i_14_, i_11_);
							} else
								var_ha.method1755(8479, i_14_, i_11_, i_19_, 4);
						}
						if (i_18_ == 3) {
							if (i_17_ == 0)
								var_ha.method1760(1, 1, i_14_, i_19_, (byte) -66, i_11_);
							else if (i_17_ == 1)
								var_ha.method1760(1, 1, i_14_, i_19_, (byte) -66, 3 + i_11_);
							else if (i_17_ != 2) {
								if (i_17_ == 3)
									var_ha.method1760(1, 1, i_14_ - -3, i_19_, (byte) -66, i_11_);
							} else
								var_ha.method1760(1, 1, i_14_ - -3, i_19_, (byte) -66, i_11_ - -3);
						}
						if (i_18_ == 2) {
							if (i_17_ != 0) {
								if (i_17_ == 1)
									var_ha.method1755(8479, i_14_, i_11_ + 3, i_19_, 4);
								else if (i_17_ == 2)
									var_ha.method1753(22294, 4, i_19_, 3 + i_14_, i_11_);
								else if (i_17_ == 3)
									var_ha.method1755(8479, i_14_, i_11_, i_19_, 4);
							} else
								var_ha.method1753(22294, 4, i_19_, i_14_, i_11_);
						}
					}
				}
				interface19 = ((Interface19) Class97.method931(i, i_15_, i_12_, (aClass2053 != null ? aClass2053 : (aClass2053 = method3294("Interface19")))));
				if (interface19 != null) {
					Class352 class352 = (Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119));
					int i_20_ = 0x3 & interface19.method66(4657);
					int i_21_ = interface19.method63((byte) 20);
					if (class352.anInt2990 != -1)
						Class122.method2201(i_20_, class352, i_11_, var_ha, i_14_, (byte) 70);
					else if (i_21_ == 9) {
						int i_22_ = -1118482;
						if (class352.anInt2998 > 0)
							i_22_ = -1179648;
						if (i_20_ == 0 || i_20_ == 2)
							var_ha.method1789(3 + i_14_, i_22_, i_14_, 3 + i_11_, -10550, i_11_);
						else
							var_ha.method1789(i_14_, i_22_, 3 + i_14_, i_11_ + 3, -10550, i_11_);
					}
				}
				interface19 = (Interface19) Class253.method3177(i, i_15_, i_12_);
				if (bool != true)
					anInt2050 = -91;
				if (interface19 == null)
					break;
				Class352 class352 = Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119);
				int i_23_ = interface19.method66(4657) & 0x3;
				if (class352.anInt2990 == -1)
					break;
				Class122.method2201(i_23_, class352, i_11_, var_ha, i_14_, (byte) 70);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("rfa.F(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_14_ + ',' + bool + ',' + i_15_ + ',' + i_16_ + ')'));
			}
			break;
		} while (false);
	}

	abstract Class98_Sub46_Sub20 method3290(Class98_Sub46_Sub20 class98_sub46_sub20, byte i);

	public static void method3291(int i) {
		do {
			try {
				IncomingOpcode.aClass58_2052 = null;
				aClass171_2051 = null;
				anIntArray2049 = null;
				if (i >= 113)
					break;
				aClass171_2051 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rfa.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3292(byte i) {
		try {
			int i_24_ = 90 / ((i - 19) / 47);
			if (!Class265.aHa1974.method1766())
				Class76_Sub4.method754(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 123), false, 65);
			else {
				Class265.aHa1974.method1786(Class42_Sub3.aCanvas5361);
				Class98_Sub43_Sub4.method1510(28837);
				if (!za_Sub2.aBoolean6079) {
					Dimension dimension = Class42_Sub3.aCanvas5361.getSize();
					Class265.aHa1974.method1741(Class42_Sub3.aCanvas5361, dimension.width, dimension.height);
				} else
					Class101.method1699(Class42_Sub3.aCanvas5361, 7);
				Class265.aHa1974.method1750(Class42_Sub3.aCanvas5361);
			}
			Class98_Sub43.method1481(2);
			Class358.aBoolean3033 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rfa.B(" + i + ')');
		}
	}

	static final int method3293(int i, Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1) {
		try {
			Class141 class141 = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
			if (i <= 119)
				anIntArray2049 = null;
			if (class141.anIntArray1109 != null) {
				class141 = class141.method2300(Class75.aClass140_584, (byte) 64);
				if (class141 == null)
					return -1;
			}
			int i_25_ = class141.anInt1102;
			RenderAnimDefinitions class294 = class246_sub3_sub4_sub2_sub1.getRenderAnimation(1);
			if ((class246_sub3_sub4_sub2_sub1.anInt6385) == -1 || (class246_sub3_sub4_sub2_sub1.aBoolean6359))
				i_25_ = class141.anInt1120;
			else if ((class246_sub3_sub4_sub2_sub1.anInt6385 != class294.anInt2389) && (class294.anInt2361 != class246_sub3_sub4_sub2_sub1.anInt6385) && (class246_sub3_sub4_sub2_sub1.anInt6385 != class294.anInt2402) && (class246_sub3_sub4_sub2_sub1.anInt6385 != class294.anInt2357)) {
				if ((class246_sub3_sub4_sub2_sub1.anInt6385 == class294.anInt2368) || (class294.anInt2394 == class246_sub3_sub4_sub2_sub1.anInt6385) || (class246_sub3_sub4_sub2_sub1.anInt6385 == class294.anInt2403) || (class246_sub3_sub4_sub2_sub1.anInt6385 == class294.anInt2377))
					i_25_ = class141.anInt1132;
			} else
				i_25_ = class141.anInt1147;
			return i_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rfa.C(" + i + ',' + ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}" : "null") + ')'));
		}
	}

	/* synthetic */
	static Class method3294(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
