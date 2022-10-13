/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ItemDefinition {
	int anInt2414;
	private int anInt2415;
	int anInt2416;
	private int anInt2417;
	int anInt2418;
	ItemDefinitionList itemList;
	boolean isMembersItem;
	int anInt2421;
	private int anInt2422 = 0;
	private int anInt2423;
	private int anInt2424;
	private int anInt2425;
	private int anInt2426;
	private int anInt2427;
	int[] anIntArray2428;
	private int anInt2429;
	private short[] recolorModified;
	private int anInt2431;
	private int anInt2432;
	int anInt2433;
	int anInt2434;
	int team;
	int[] campaigns;
	int anInt2437;
	int anInt2438;
	int anInt2439;
	int anInt2440;
	int anInt2441;
	private short[] recolorOriginal;
	Class377 params;
	private int anInt2444;
	int anInt2445;
	String[] itemGroundOption;
	int anInt2447;
	private int anInt2448;
	private int anInt2449;
	String name;
	private int anInt2451;
	private int anInt2452;
	private int anInt2453;
	int[] anIntArray2454;
	private int anInt2455;
	private short[] retextureModified;
	private byte[] recolorPalette;
	int anInt2458;
	int anInt2459;
	private short[] retextureOriginal;
	boolean stockmarket;
	int anInt2462;
	int anInt2463;
	int anInt2464;
	int anInt2465;
	int anInt2466;
	private int anInt2467;
	int id;
	int anInt2469;
	static int anInt2470;
	int anInt2471;
	int anInt2472;
	String[] inventoryOptions;
	private int anInt2474;
	int anInt2475;
	int anInt2476;

	final void method3485(int i) {
		do {
			try {
				if (i == 850)
					break;
				((ItemDefinition) this).campaigns = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sea.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final ModelDefinitions method3486(boolean bool, int i) {
		try {
			int i_0_ = anInt2417;
			int i_1_ = anInt2449;
			if (bool) {
				i_1_ = anInt2455;
				i_0_ = anInt2453;
			}
			if (i_0_ == -1)
				return null;
			ModelDefinitions class178 = Class98_Sub6.method981(i, i ^ ~0x2423, (((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5), i_0_);
			if (((ModelDefinitions) class178).anInt1387 < 13)
				class178.method2592(13746, 2);
			if (i_1_ != -1) {
				ModelDefinitions class178_2_ = Class98_Sub6.method981(0, -9252, (((ItemDefinitionList) (((ItemDefinition) this).itemList)).itemsJs5), i_1_);
				if (((ModelDefinitions) class178_2_).anInt1387 < 13)
					class178_2_.method2592(13746, 2);
				ModelDefinitions[] class178s = { class178, class178_2_ };
				class178 = new ModelDefinitions(class178s, 2);
			}
			if (recolorModified != null) {
				for (int i_3_ = 0; recolorModified.length > i_3_; i_3_++)
					class178.method2593(0, recolorModified[i_3_], recolorOriginal[i_3_]);
			}
			if (retextureOriginal != null) {
				for (int i_4_ = 0; i_4_ < retextureOriginal.length; i_4_++)
					class178.method2590(retextureModified[i_4_], (byte) 115, retextureOriginal[i_4_]);
			}
			return class178;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sea.L(" + bool + ',' + i + ')');
		}
	}

	final void method3487(ItemDefinition class297_5_, int i, ItemDefinition class297_6_) {
		try {
			retextureModified = class297_6_.retextureModified;
			((ItemDefinition) this).anInt2437 = ((ItemDefinition) class297_6_).anInt2437;
			((ItemDefinition) this).anInt2441 = ((ItemDefinition) class297_6_).anInt2441;
			recolorModified = class297_6_.recolorModified;
			((ItemDefinition) this).anInt2447 = ((ItemDefinition) class297_6_).anInt2447;
			((ItemDefinition) this).name = ((ItemDefinition) class297_5_).name;
			((ItemDefinition) this).anInt2476 = ((ItemDefinition) class297_6_).anInt2476;
			((ItemDefinition) this).anInt2469 = 1;
			retextureOriginal = class297_6_.retextureOriginal;
			anInt2431 = class297_6_.anInt2431;
			recolorPalette = class297_6_.recolorPalette;
			((ItemDefinition) this).anInt2416 = ((ItemDefinition) class297_6_).anInt2416;
			((ItemDefinition) this).anInt2475 = ((ItemDefinition) class297_5_).anInt2475;
			recolorOriginal = class297_6_.recolorOriginal;
			((ItemDefinition) this).isMembersItem = ((ItemDefinition) class297_5_).isMembersItem;
			((ItemDefinition) this).anInt2465 = ((ItemDefinition) class297_6_).anInt2465;
			int i_7_ = 49 / ((i - -25) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.I(" + (class297_5_ != null ? "{...}" : "null") + ',' + i + ',' + (class297_6_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method3488(int i, int i_8_, boolean bool, int i_9_, int i_10_, ha var_ha, ha var_ha_11_, byte i_12_, PlayerAppearance class313, Class43 class43) {
		try {
			ModelDefinitions class178 = Class98_Sub6.method981(0, -9252, (((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5), anInt2431);
			if (class178 == null)
				return null;
			if (((ModelDefinitions) class178).anInt1387 < 13)
				class178.method2592(13746, 2);
			if (recolorModified != null) {
				for (int i_13_ = 0; ((recolorModified.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
					if (recolorPalette != null && (i_13_ ^ 0xffffffff) > (recolorPalette.length ^ 0xffffffff))
						class178.method2593(0, recolorModified[i_13_], (Class338.aShortArray2833[0xff & recolorPalette[i_13_]]));
					else
						class178.method2593(i_12_ + 125, recolorModified[i_13_], recolorOriginal[i_13_]);
				}
			}
			if (retextureOriginal != null) {
				for (int i_14_ = 0; ((retextureOriginal.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++)
					class178.method2590(retextureModified[i_14_], (byte) -99, retextureOriginal[i_14_]);
			}
			if (class313 != null) {
				for (int i_15_ = 0; i_15_ < 5; i_15_++) {
					for (int i_16_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++) {
						if ((Class61.aShortArrayArrayArray478[i_16_][i_15_]).length > ((PlayerAppearance) class313).anIntArray2683[i_15_])
							class178.method2593(0, (Class98_Sub10_Sub11.aShortArrayArray5597[i_16_][i_15_]), (Class61.aShortArrayArrayArray478[i_16_][i_15_][(((PlayerAppearance) class313).anIntArray2683[i_15_])]));
					}
				}
			}
			int i_17_ = 2048;
			boolean bool_18_ = false;
			if (anInt2451 != 128 || anInt2429 != 128 || anInt2415 != 128) {
				bool_18_ = true;
				i_17_ |= 0x7;
			}
			AbstractModel class146 = var_ha_11_.method1790(class178, i_17_, 64, 64 - -anInt2452, anInt2422 + 768);
			if (!class146.method2324())
				return null;
			if (bool_18_)
				class146.O(anInt2451, anInt2429, anInt2415);
			Class332 class332 = null;
			if (((ItemDefinition) this).anInt2414 != -1) {
				class332 = (((ItemDefinition) this).itemList.method2722(class43, false, ((ItemDefinition) this).anInt2433, 1, 0, class313, var_ha_11_, 0, true, 10, var_ha, true));
				if (class332 == null)
					return null;
			} else if ((((ItemDefinition) this).anInt2459 ^ 0xffffffff) != 0) {
				class332 = (((ItemDefinition) this).itemList.method2722(class43, false, ((ItemDefinition) this).anInt2472, i_10_, i, class313, var_ha_11_, 0, true, i_9_, var_ha, false));
				if (class332 == null)
					return null;
			}
			int i_19_;
			if (bool)
				i_19_ = ((int) ((double) ((ItemDefinition) this).anInt2465 * 1.5) << -21057662);
			else if (i_10_ == 2)
				i_19_ = ((int) (1.04 * (double) ((ItemDefinition) this).anInt2465) << 839018274);
			else
				i_19_ = ((ItemDefinition) this).anInt2465 << -512379550;
			var_ha_11_.DA(16, 16, 512, 512);
			Class111 class111 = var_ha_11_.method1821();
			class111.method2091();
			var_ha_11_.a(class111);
			var_ha_11_.xa(1.0F);
			var_ha_11_.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
			Class111 class111_20_ = var_ha_11_.method1793();
			class111_20_.method2104(-((ItemDefinition) this).anInt2441 << -384263997);
			class111_20_.method2097(((ItemDefinition) this).anInt2476 << 857131171);
			class111_20_.method2106(((ItemDefinition) this).anInt2437 << 1252715202, ((i_19_ * (Class284_Sub2_Sub2.anIntArray6200[((ItemDefinition) this).anInt2416 << -664636093]) >> -1954445778) + -(class146.fa() / 2) + (((ItemDefinition) this).anInt2447 << -1632893918)), ((i_19_ * (Class284_Sub2_Sub2.anIntArray6202[((ItemDefinition) this).anInt2416 << 769335843]) >> -1078595890) - -(((ItemDefinition) this).anInt2447 << -772037790)));
			class111_20_.method2105(((ItemDefinition) this).anInt2416 << 1743842275);
			int i_21_ = var_ha_11_.i();
			int i_22_ = var_ha_11_.XA();
			var_ha_11_.f(50, 2147483647);
			var_ha_11_.ya();
			if (i_12_ != -125)
				return null;
			var_ha_11_.la();
			var_ha_11_.aa(0, 0, 36, 32, 0, 0);
			class146.method2325(class111_20_, null, 1);
			var_ha_11_.f(i_21_, i_22_);
			int[] is = var_ha_11_.na(0, 0, 36, 32);
			if ((i_10_ ^ 0xffffffff) <= -2) {
				is = method3491(is, i_12_ + 3, -16777214);
				if (i_10_ >= 2)
					is = method3491(is, -109, -1);
			}
			if ((i ^ 0xffffffff) != -1)
				method3499(-76, i, is);
			var_ha_11_.method1748(-7962, 0, 36, 32, is, 36).method3735(0, 0);
			if (((ItemDefinition) this).anInt2414 == -1) {
				if (((ItemDefinition) this).anInt2459 != -1)
					class332.method3735(0, 0);
			} else
				class332.method3735(0, 0);
			if ((i_8_ ^ 0xffffffff) == -2 || i_8_ == 2 && (((ItemDefinition) this).anInt2469 == 1 || i_9_ != 1) && (i_9_ ^ 0xffffffff) != 0)
				class43.method411((byte) 76, 9, method3490((byte) -93, i_9_), -256, -16777215, 0);
			is = var_ha_11_.na(0, 0, 36, 32);
			for (int i_23_ = 0; (is.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
				if ((0xffffff & is[i_23_]) == 0)
					is[i_23_] = 0;
				else
					is[i_23_] = Class41.method366(is[i_23_], -16777216);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.H(" + i + ',' + i_8_ + ',' + bool + ',' + i_9_ + ',' + i_10_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (var_ha_11_ != null ? "{...}" : "null") + ',' + i_12_ + ',' + (class313 != null ? "{...}" : "null") + ',' + (class43 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3489(boolean bool, int i) {
		try {
			int i_24_ = -6 / ((i - -44) / 61);
			int i_25_ = anInt2417;
			int i_26_ = anInt2449;
			if (bool) {
				i_25_ = anInt2453;
				i_26_ = anInt2455;
			}
			if ((i_25_ ^ 0xffffffff) == 0)
				return true;
			boolean bool_27_ = true;
			if (!((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5.method2751(0, i_25_, -6329))
				bool_27_ = false;
			if (i_26_ != -1 && !((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5.method2751(0, i_26_, -6329))
				bool_27_ = false;
			return bool_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sea.B(" + bool + ',' + i + ')');
		}
	}

	private final String method3490(byte i, int i_28_) { //Amount to String
		try {
			if (i != -93)
				((ItemDefinition) this).anInt2459 = 107;
			if (i_28_ < 100000)
				return "<col=ffff00>" + i_28_ + "</col>";
			if ((i_28_ ^ 0xffffffff) > -10000001)
				return ("<col=ffffff>" + i_28_ / 1000 + (TextResources.aClass309_2622.get_text((((ItemDefinitionList) ((ItemDefinition) this).itemList).language))) + "</col>");
			return ("<col=00ff80>" + i_28_ / 1000000 + TextResources.aClass309_2620.get_text((((ItemDefinitionList) (((ItemDefinition) this).itemList)).language)) + "</col>");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sea.J(" + i + ',' + i_28_ + ')');
		}
	}

	private final int[] method3491(int[] is, int i, int i_29_) {
		try {
			if (i > -36)
				return null;
			int[] is_30_ = new int[1152];
			int i_31_ = 0;
			for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > -33; i_32_++) {
				for (int i_33_ = 0; i_33_ < 36; i_33_++) {
					int i_34_ = is[i_31_];
					if ((i_34_ ^ 0xffffffff) == -1) {
						if (i_33_ <= 0 || (is[-1 + i_31_] ^ 0xffffffff) == -1) {
							if ((i_32_ ^ 0xffffffff) >= -1 || (is[-36 + i_31_] ^ 0xffffffff) == -1) {
								if (i_33_ < 35 && is[i_31_ + 1] != 0)
									i_34_ = i_29_;
								else if (i_32_ < 31 && (is[36 + i_31_] ^ 0xffffffff) != -1)
									i_34_ = i_29_;
							} else
								i_34_ = i_29_;
						} else
							i_34_ = i_29_;
					}
					is_30_[i_31_++] = i_34_;
				}
			}
			return is_30_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_29_ + ')'));
		}
	}

	final boolean method3492(int i, boolean bool) {
		try {
			int i_35_ = ((ItemDefinition) this).anInt2458;
			int i_36_ = anInt2444;
			int i_37_ = anInt2424;
			if (bool) {
				i_36_ = anInt2423;
				i_35_ = ((ItemDefinition) this).anInt2466;
				i_37_ = anInt2432;
			}
			if ((i_35_ ^ 0xffffffff) == 0)
				return true;
			boolean bool_38_ = true;
			if (!((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5.method2751(i, i_35_, -6329))
				bool_38_ = false;
			if (i_36_ != -1 && !((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5.method2751(0, i_36_, -6329))
				bool_38_ = false;
			if ((i_37_ ^ 0xffffffff) != 0 && !((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5.method2751(0, i_37_, -6329))
				bool_38_ = false;
			return bool_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sea.D(" + i + ',' + bool + ')');
		}
	}

	final ItemDefinition method3493(byte i, int i_39_) {
		try {
			int i_40_ = -25 % ((i - 26) / 56);
			if (((ItemDefinition) this).anIntArray2428 != null && (i_39_ ^ 0xffffffff) < -2) {
				int i_41_ = -1;
				for (int i_42_ = 0; i_42_ < 10; i_42_++) {
					if (((ItemDefinition) this).anIntArray2454[i_42_] <= i_39_ && ((ItemDefinition) this).anIntArray2454[i_42_] != 0)
						i_41_ = ((ItemDefinition) this).anIntArray2428[i_42_];
				}
				if ((i_41_ ^ 0xffffffff) != 0)
					return ((ItemDefinition) this).itemList.getItemDefs(i_41_);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sea.P(" + i + ',' + i_39_ + ')');
		}
	}

	final int method3494(int i, byte i_43_, int i_44_) {
		try {
			if (i_43_ > -75)
				return -30;
			if (((ItemDefinition) this).params == null)
				return i_44_;
			Class98_Sub34 class98_sub34 = ((Class98_Sub34) ((ItemDefinition) this).params.method3990((long) i, -1));
			if (class98_sub34 == null)
				return i_44_;
			return ((Class98_Sub34) class98_sub34).anInt4126;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.G(" + i + ',' + i_43_ + ',' + i_44_ + ')'));
		}
	}

	final String method3495(String string, int i, int i_45_) {
		try {
			if (((ItemDefinition) this).params == null)
				return string;
			Class98_Sub15 class98_sub15 = ((Class98_Sub15) ((ItemDefinition) this).params.method3990((long) i_45_, i));
			if (class98_sub15 == null)
				return string;
			return ((Class98_Sub15) class98_sub15).aString3917;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.F(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_45_ + ')'));
		}
	}

	private final void decode(int i, RSByteBuffer class98_sub22, int i_46_) {
		do {
			try {
				if (i != 1) {
					if ((i ^ 0xffffffff) == -3) {
						((ItemDefinition) this).name = class98_sub22.readString();
					} else if (i != 4) {
						if (i == 5)
							((ItemDefinition) this).anInt2416 = class98_sub22.readShort();
						else if (i == 6)
							((ItemDefinition) this).anInt2476 = class98_sub22.readShort();
						else if (i != 7) {
							if (i != 8) {
								if (i != 11) {
									if ((i ^ 0xffffffff) == -13)
										((ItemDefinition) this).anInt2475 = class98_sub22.readInt(-2);
									else if (i == 16)
										((ItemDefinition) this).isMembersItem = true;
									else if ((i ^ 0xffffffff) != -19) {
										if ((i ^ 0xffffffff) != -24) {
											if (i == 24)
												anInt2444 = (class98_sub22.readShort());
											else if ((i ^ 0xffffffff) == -26)
												((ItemDefinition) this).anInt2466 = (class98_sub22.readShort());
											else if (i != 26) {
												if (i < 30 || i >= 35) {
													if ((i ^ 0xffffffff) > -36 || i >= 40) {
														if (i != 40) {
															if ((i ^ 0xffffffff) == -42) {
																int i_47_ = (class98_sub22.readUnsignedByte());
																retextureOriginal = (new short[i_47_]);
																retextureModified = (new short[i_47_]);
																for (int i_48_ = 0; (i_47_ > i_48_); i_48_++) {
																	retextureOriginal[i_48_] = (short) class98_sub22.readShort();
																	retextureModified[i_48_] = (short) class98_sub22.readShort();
																}
															} else if ((i ^ 0xffffffff) != -43) {
																if (i == 65)
																	((ItemDefinition) this).stockmarket = true;
																else if (i == 78)
																	anInt2424 = (class98_sub22.readShort());
																else if ((i ^ 0xffffffff) != -80) {
																	if (i != 90) {
																		if (i != 91) {
																			if ((i ^ 0xffffffff) == -93)
																				anInt2449 = class98_sub22.readShort();
																			else if ((i ^ 0xffffffff) != -94) {
																				if ((i ^ 0xffffffff) == -96)
																					((ItemDefinition) this).anInt2441 = class98_sub22.readShort();
																				else if (i != 96) {
																					if (i != 97) {
																						if ((i ^ 0xffffffff) == -99)
																							((ItemDefinition) this).anInt2414 = class98_sub22.readShort();
																						else if (i < 100 || (i ^ 0xffffffff) <= -111) {
																							if (i != 110) {
																								if ((i ^ 0xffffffff) == -112)
																									anInt2429 = class98_sub22.readShort();
																								else if (i == 112)
																									anInt2415 = class98_sub22.readShort();
																								else if (i == 113)
																									anInt2452 = class98_sub22.readSignedByte();
																								else if ((i ^ 0xffffffff) != -115) {
																									if ((i ^ 0xffffffff) == -116)
																										((ItemDefinition) this).team = class98_sub22.readUnsignedByte();
																									else if (i != 121) {
																										if ((i ^ 0xffffffff) != -123) {
																											if ((i ^ 0xffffffff) == -126) {
																												anInt2448 = class98_sub22.readSignedByte() << 119149218;
																												anInt2426 = class98_sub22.readSignedByte() << -1266678398;
																												anInt2425 = class98_sub22.readSignedByte() << 1583045954;
																											} else if ((i ^ 0xffffffff) != -127) {
																												if (i == 127) {
																													((ItemDefinition) this).anInt2438 = class98_sub22.readUnsignedByte();
																													((ItemDefinition) this).anInt2439 = class98_sub22.readShort();
																												} else if ((i ^ 0xffffffff) != -129) {
																													if ((i ^ 0xffffffff) != -130) {
																														if ((i ^ 0xffffffff) != -131) {
																															if (i != 132) {
																																if (i == 134)
																																	((ItemDefinition) this).anInt2445 = class98_sub22.readUnsignedByte();
																																else if ((i ^ 0xffffffff) == -250) {
																																	int i_49_ = class98_sub22.readUnsignedByte();
																																	if (((ItemDefinition) this).params == null) {
																																		int i_50_ = Class48.method453(423660257, i_49_);
																																		((ItemDefinition) this).params = new Class377(i_50_);
																																	}
																																	for (int i_51_ = 0; (i_49_ ^ 0xffffffff) < (i_51_ ^ 0xffffffff); i_51_++) {
																																		boolean bool = (class98_sub22.readUnsignedByte() ^ 0xffffffff) == -2;
																																		int i_52_ = class98_sub22.readMedium(i_46_ ^ ~0xf8);

																																		Node class98;
																																		if (!bool)
																																			class98 = new Class98_Sub34(class98_sub22.readInt(-2));
																																		else
																																			class98 = new Class98_Sub15(class98_sub22.readString());
																																		((ItemDefinition) this).params.method3996(class98, (long) i_52_, -1);
																																	}
																																}
																															} else {
																																int i_53_ = class98_sub22.readUnsignedByte();
																																((ItemDefinition) this).campaigns = new int[i_53_];
																																for (int i_54_ = 0; i_53_ > i_54_; i_54_++)
																																	((ItemDefinition) this).campaigns[i_54_] = class98_sub22.readShort();
																															}
																														} else {
																															((ItemDefinition) this).anInt2434 = class98_sub22.readUnsignedByte();
																															((ItemDefinition) this).anInt2462 = class98_sub22.readShort();
																														}
																													} else {
																														((ItemDefinition) this).anInt2463 = class98_sub22.readUnsignedByte();
																														((ItemDefinition) this).anInt2440 = class98_sub22.readShort();
																													}
																												} else {
																													((ItemDefinition) this).anInt2421 = class98_sub22.readUnsignedByte();
																													((ItemDefinition) this).anInt2471 = class98_sub22.readShort();
																												}
																											} else {
																												anInt2474 = class98_sub22.readSignedByte() << 1304107298;
																												anInt2427 = class98_sub22.readSignedByte() << 294608354;
																												anInt2467 = class98_sub22.readSignedByte() << -629362526;
																											}
																										} else
																											((ItemDefinition) this).anInt2459 = class98_sub22.readShort();
																									} else
																										((ItemDefinition) this).anInt2472 = class98_sub22.readShort();
																								} else
																									anInt2422 = 5 * class98_sub22.readSignedByte();
																							} else
																								anInt2451 = class98_sub22.readShort();
																						} else {
																							if (((ItemDefinition) this).anIntArray2428 == null) {
																								((ItemDefinition) this).anIntArray2428 = new int[10];
																								((ItemDefinition) this).anIntArray2454 = new int[10];
																							}
																							((ItemDefinition) this).anIntArray2428[-100 + i] = class98_sub22.readShort();
																							((ItemDefinition) this).anIntArray2454[-100 + i] = class98_sub22.readShort();
																						}
																					} else
																						((ItemDefinition) this).anInt2433 = class98_sub22.readShort();
																				} else
																					((ItemDefinition) this).anInt2464 = class98_sub22.readUnsignedByte();
																			} else
																				anInt2455 = class98_sub22.readShort();
																		} else
																			anInt2453 = class98_sub22.readShort();
																	} else
																		anInt2417 = class98_sub22.readShort();
																} else
																	anInt2432 = (class98_sub22.readShort());
															} else {
																int i_55_ = (class98_sub22.readUnsignedByte());
																recolorPalette = (new byte[i_55_]);
																for (int i_56_ = 0; (i_55_ > i_56_); i_56_++)
																	recolorPalette[i_56_] = (class98_sub22.readSignedByte());
															}
														} else {
															int i_57_ = (class98_sub22.readUnsignedByte());
															recolorOriginal = (new short[i_57_]);
															recolorModified = (new short[i_57_]);
															for (int i_58_ = 0; ((i_58_ ^ 0xffffffff) > (i_57_ ^ 0xffffffff)); i_58_++) {
																recolorModified[i_58_] = (short) class98_sub22.readShort();
																recolorOriginal[i_58_] = (short) class98_sub22.readShort();
															}
														}
													} else
														((ItemDefinition) this).inventoryOptions[-35 + i] = (class98_sub22.readString());
												} else
													((ItemDefinition) this).itemGroundOption[i - 30] = (class98_sub22.readString());
											} else
												anInt2423 = (class98_sub22.readShort());
										} else
											((ItemDefinition) this).anInt2458 = class98_sub22.readShort();
									} else
										((ItemDefinition) this).anInt2418 = class98_sub22.readShort();
								} else
									((ItemDefinition) this).anInt2469 = 1;
							} else {
								((ItemDefinition) this).anInt2447 = class98_sub22.readShort();
								if (((ItemDefinition) this).anInt2447 > 32767)
									((ItemDefinition) this).anInt2447 -= 65536;
							}
						} else {
							((ItemDefinition) this).anInt2437 = class98_sub22.readShort();
							if (((ItemDefinition) this).anInt2437 > 32767)
								((ItemDefinition) this).anInt2437 -= 65536;
						}
					} else
						((ItemDefinition) this).anInt2465 = class98_sub22.readShort();
				} else
					anInt2431 = class98_sub22.readShort();
				if (i_46_ == 132)
					break;
				((ItemDefinition) this).anInt2437 = 117;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sea.K(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_46_ + ')'));
			}
			break;
		} while (false);
	}

	final void decode(RSByteBuffer stream) {
		do {
			try {
				for (;;) {
					int opcode = stream.readUnsignedByte();
					if ((opcode ^ 0xffffffff) == -1)
						break;
					decode(opcode, stream, 132);
				}
				((ItemDefinition) this).params = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sea.O(" + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3498(ItemDefinition class297_60_, ItemDefinition class297_61_, int i) {
		try {
			((ItemDefinition) this).anInt2475 = 0;
			recolorModified = class297_60_.recolorModified;
			anInt2432 = class297_60_.anInt2432;
			anInt2424 = class297_60_.anInt2424;
			anInt2474 = class297_60_.anInt2474;
			((ItemDefinition) this).isMembersItem = ((ItemDefinition) class297_60_).isMembersItem;
			anInt2425 = class297_60_.anInt2425;
			anInt2455 = class297_60_.anInt2455;
			anInt2423 = class297_60_.anInt2423;
			anInt2448 = class297_60_.anInt2448;
			((ItemDefinition) this).anInt2437 = ((ItemDefinition) class297_61_).anInt2437;
			anInt2417 = class297_60_.anInt2417;
			anInt2467 = class297_60_.anInt2467;
			((ItemDefinition) this).inventoryOptions = new String[5];
			((ItemDefinition) this).anInt2465 = ((ItemDefinition) class297_61_).anInt2465;
			recolorPalette = class297_60_.recolorPalette;
			anInt2444 = class297_60_.anInt2444;
			((ItemDefinition) this).anInt2476 = ((ItemDefinition) class297_61_).anInt2476;
			anInt2449 = class297_60_.anInt2449;
			((ItemDefinition) this).name = ((ItemDefinition) class297_60_).name;
			((ItemDefinition) this).params = ((ItemDefinition) class297_60_).params;
			anInt2431 = class297_61_.anInt2431;
			anInt2426 = class297_60_.anInt2426;
			retextureModified = class297_60_.retextureModified;
			((ItemDefinition) this).anInt2458 = ((ItemDefinition) class297_60_).anInt2458;
			anInt2453 = class297_60_.anInt2453;
			recolorOriginal = class297_60_.recolorOriginal;
			((ItemDefinition) this).anInt2441 = ((ItemDefinition) class297_61_).anInt2441;
			((ItemDefinition) this).anInt2416 = ((ItemDefinition) class297_61_).anInt2416;
			((ItemDefinition) this).anInt2466 = ((ItemDefinition) class297_60_).anInt2466;
			((ItemDefinition) this).itemGroundOption = ((ItemDefinition) class297_60_).itemGroundOption;
			retextureOriginal = class297_60_.retextureOriginal;
			anInt2427 = class297_60_.anInt2427;
			((ItemDefinition) this).anInt2447 = ((ItemDefinition) class297_61_).anInt2447;
			((ItemDefinition) this).team = ((ItemDefinition) class297_60_).team;
			if (((ItemDefinition) class297_60_).inventoryOptions != null) {
				for (int i_62_ = 0; i_62_ < 4; i_62_++)
					((ItemDefinition) this).inventoryOptions[i_62_] = ((ItemDefinition) class297_60_).inventoryOptions[i_62_];
			}
			int i_63_ = 59 % ((i - -79) / 44);
			((ItemDefinition) this).inventoryOptions[4] = TextResources.DISCARD.get_text((((ItemDefinitionList) (((ItemDefinition) this).itemList)).language));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.Q(" + (class297_60_ != null ? "{...}" : "null") + ',' + (class297_61_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method3499(int i, int i_64_, int[] is) {
		try {
			int i_65_ = 31;
			if (i > -53)
				anInt2452 = -82;
			for (/**/; i_65_ > 0; i_65_--) {
				int i_66_ = i_65_ * 36;
				for (int i_67_ = 35; (i_67_ ^ 0xffffffff) < -1; i_67_--) {
					if ((is[i_67_ + i_66_] ^ 0xffffffff) == -1 && (is[i_67_ + (i_66_ - 37)] ^ 0xffffffff) != -1)
						is[i_67_ + i_66_] = i_64_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.C(" + i + ',' + i_64_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final ModelDefinitions method3500(boolean bool, int i) {
		try {
			if (i <= 42)
				method3487(null, 70, null);
			int i_68_ = ((ItemDefinition) this).anInt2458;
			int i_69_ = anInt2444;
			int i_70_ = anInt2424;
			if (bool) {
				i_68_ = ((ItemDefinition) this).anInt2466;
				i_70_ = anInt2432;
				i_69_ = anInt2423;
			}
			if (i_68_ == -1)
				return null;
			ModelDefinitions class178 = Class98_Sub6.method981(0, -9252, (((ItemDefinitionList) ((ItemDefinition) this).itemList).itemsJs5), i_68_);
			if ((((ModelDefinitions) class178).anInt1387 ^ 0xffffffff) > -14)
				class178.method2592(13746, 2);
			if ((i_69_ ^ 0xffffffff) != 0) {
				ModelDefinitions class178_71_ = Class98_Sub6.method981(0, -9252, (((ItemDefinitionList) (((ItemDefinition) this).itemList)).itemsJs5), i_69_);
				if (((ModelDefinitions) class178_71_).anInt1387 < 13)
					class178_71_.method2592(13746, 2);
				if (i_70_ != -1) {
					ModelDefinitions class178_72_ = Class98_Sub6.method981(0, -9252, (((ItemDefinitionList) (((ItemDefinition) this).itemList)).itemsJs5), i_70_);
					if (((ModelDefinitions) class178_72_).anInt1387 < 13)
						class178_72_.method2592(13746, 2);
					ModelDefinitions[] class178s = { class178, class178_71_, class178_72_ };
					class178 = new ModelDefinitions(class178s, 3);
				} else {
					ModelDefinitions[] class178s = { class178, class178_71_ };
					class178 = new ModelDefinitions(class178s, 2);
				}
			}
			if (class178 == null)
				return null;
			if (!bool && (anInt2448 != 0 || (anInt2426 ^ 0xffffffff) != -1 || anInt2425 != 0))
				class178.method2597(anInt2425, anInt2448, (byte) 122, anInt2426);
			if (bool && ((anInt2474 ^ 0xffffffff) != -1 || (anInt2427 ^ 0xffffffff) != -1 || (anInt2467 ^ 0xffffffff) != -1))
				class178.method2597(anInt2467, anInt2474, (byte) 63, anInt2427);
			if (recolorModified != null) {
				for (int i_73_ = 0; ((i_73_ ^ 0xffffffff) > (recolorModified.length ^ 0xffffffff)); i_73_++)
					class178.method2593(0, recolorModified[i_73_], recolorOriginal[i_73_]);
			}
			if (retextureOriginal != null) {
				for (int i_74_ = 0; i_74_ < retextureOriginal.length; i_74_++)
					class178.method2590(retextureModified[i_74_], (byte) 107, retextureOriginal[i_74_]);
			}
			return class178;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sea.E(" + bool + ',' + i + ')');
		}
	}

	final AbstractModel method3501(int i, int i_75_, int i_76_, Class97 class97, int i_77_, ha var_ha, int i_78_, int i_79_, PlayerAppearance class313) {
		try {
			if (((ItemDefinition) this).anIntArray2428 != null && i_78_ > 1) {
				int i_80_ = -1;
				for (int i_81_ = 0; (i_81_ ^ 0xffffffff) > -11; i_81_++) {
					if (((i_78_ ^ 0xffffffff) <= (((ItemDefinition) this).anIntArray2454[i_81_] ^ 0xffffffff)) && (((ItemDefinition) this).anIntArray2454[i_81_] ^ 0xffffffff) != -1)
						i_80_ = ((ItemDefinition) this).anIntArray2428[i_81_];
				}
				if ((i_80_ ^ 0xffffffff) != 0)
					return (((ItemDefinition) this).itemList.getItemDefs(i_80_).method3501(i, i_75_, i_76_, class97, i_77_, var_ha, 1, i_79_, class313));
			}
			int i_82_ = i_75_;
			if (class97 != null)
				i_82_ |= class97.method932(true, i_76_, true, i_77_);
			AbstractModel class146;
			synchronized (((ItemDefinitionList) ((ItemDefinition) this).itemList).aClass79_1560) {
				class146 = (AbstractModel) (((ItemDefinitionList) ((ItemDefinition) this).itemList).aClass79_1560.get((long) (((ItemDefinition) this).id | (((ha) var_ha).anInt937 << -1658708323))));
				if (i_79_ != 128)
					((ItemDefinition) this).anInt2434 = -112;
			}
			if (class146 == null || (var_ha.c(class146.ua(), i_82_) ^ 0xffffffff) != -1) {
				if (class146 != null)
					i_82_ = var_ha.method1777(i_82_, class146.ua());
				int i_83_ = i_82_;
				if (retextureOriginal != null)
					i_83_ |= 0x8000;
				if (recolorModified != null || class313 != null)
					i_83_ |= 0x4000;
				if (anInt2451 != 128)
					i_83_ |= 0x1;
				if ((anInt2451 ^ 0xffffffff) != -129)
					i_83_ |= 0x2;
				if ((anInt2451 ^ 0xffffffff) != -129)
					i_83_ |= 0x4;
				ModelDefinitions class178 = Class98_Sub6.method981(0, -9252, (((ItemDefinitionList) (((ItemDefinition) this).itemList)).itemsJs5), anInt2431);
				if (class178 == null)
					return null;
				if ((((ModelDefinitions) class178).anInt1387 ^ 0xffffffff) > -14)
					class178.method2592(13746, 2);
				class146 = var_ha.method1790(class178, i_83_, (((ItemDefinitionList) (((ItemDefinition) this).itemList)).anInt1564), anInt2452 + 64, 850 - -anInt2422);
				if (anInt2451 != 128 || anInt2429 != 128 || (anInt2415 ^ 0xffffffff) != -129)
					class146.O(anInt2451, anInt2429, anInt2415);
				if (recolorModified != null) {
					for (int i_84_ = 0; recolorModified.length > i_84_; i_84_++) {
						if (recolorPalette == null || ((recolorPalette.length ^ 0xffffffff) >= (i_84_ ^ 0xffffffff)))
							class146.ia(recolorModified[i_84_], recolorOriginal[i_84_]);
						else
							class146.ia(recolorModified[i_84_], (Class338.aShortArray2833[recolorPalette[i_84_] & 0xff]));
					}
				}
				if (retextureOriginal != null) {
					for (int i_85_ = 0; ((retextureOriginal.length ^ 0xffffffff) < (i_85_ ^ 0xffffffff)); i_85_++)
						class146.aa(retextureOriginal[i_85_], retextureModified[i_85_]);
				}
				if (class313 != null) {
					for (int i_86_ = 0; (i_86_ ^ 0xffffffff) > -6; i_86_++) {
						for (int i_87_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_87_ ^ 0xffffffff)); i_87_++) {
							if ((((PlayerAppearance) class313).anIntArray2683[i_86_] ^ 0xffffffff) > ((Class61.aShortArrayArrayArray478[i_87_][i_86_]).length ^ 0xffffffff))
								class146.ia((Class98_Sub10_Sub11.aShortArrayArray5597[i_87_][i_86_]), (Class61.aShortArrayArrayArray478[i_87_][i_86_][(((PlayerAppearance) class313).anIntArray2683[i_86_])]));
						}
					}
				}
				class146.s(i_82_);
				synchronized (((ItemDefinitionList) ((ItemDefinition) this).itemList).aClass79_1560) {
					((ItemDefinitionList) ((ItemDefinition) this).itemList).aClass79_1560.put((long) (((ItemDefinition) this).id | ((ha) var_ha).anInt937 << -1883478627), class146);
				}
			}
			if (class97 != null)
				class146 = class97.method937(i_77_, i, i_82_, 42, class146, i_76_);
			class146.s(i_75_);
			return class146;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sea.N(" + i + ',' + i_75_ + ',' + i_76_ + ',' + (class97 != null ? "{...}" : "null") + ',' + i_77_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_78_ + ',' + i_79_ + ',' + (class313 != null ? "{...}" : "null") + ')'));
		}
	}

	public ItemDefinition() {
		((ItemDefinition) this).anInt2414 = -1;
		((ItemDefinition) this).anInt2433 = -1;
		((ItemDefinition) this).anInt2434 = -1;
		anInt2423 = -1;
		((ItemDefinition) this).team = 0;
		((ItemDefinition) this).anInt2437 = 0;
		anInt2417 = -1;
		anInt2424 = -1;
		((ItemDefinition) this).anInt2440 = -1;
		anInt2451 = 128;
		anInt2448 = 0;
		anInt2429 = 128;
		((ItemDefinition) this).anInt2439 = -1;
		((ItemDefinition) this).anInt2416 = 0;
		((ItemDefinition) this).anInt2418 = -1;
		((ItemDefinition) this).anInt2458 = -1;
		((ItemDefinition) this).anInt2421 = -1;
		((ItemDefinition) this).anInt2438 = -1;
		((ItemDefinition) this).anInt2445 = 0;
		anInt2415 = 128;
		((ItemDefinition) this).anInt2441 = 0;
		anInt2455 = -1;
		((ItemDefinition) this).anInt2459 = -1;
		((ItemDefinition) this).isMembersItem = false;
		anInt2452 = 0;
		anInt2425 = 0;
		((ItemDefinition) this).stockmarket = false;
		((ItemDefinition) this).anInt2462 = -1;
		anInt2444 = -1;
		anInt2449 = -1;
		((ItemDefinition) this).anInt2465 = 2000;
		((ItemDefinition) this).name = "null";
		((ItemDefinition) this).anInt2469 = 0;
		((ItemDefinition) this).anInt2463 = -1;
		anInt2453 = -1;
		((ItemDefinition) this).anInt2466 = -1;
		((ItemDefinition) this).anInt2447 = 0;
		anInt2426 = 0;
		((ItemDefinition) this).anInt2471 = -1;
		anInt2427 = 0;
		anInt2432 = -1;
		anInt2474 = 0;
		((ItemDefinition) this).anInt2464 = 0;
		anInt2467 = 0;
		((ItemDefinition) this).anInt2475 = 1;
		((ItemDefinition) this).anInt2476 = 0;
		((ItemDefinition) this).anInt2472 = -1;
	}
}
