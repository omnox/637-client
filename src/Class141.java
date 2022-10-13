/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class141 {
	int anInt1090;
	int anInt1091;
	int anInt1092;
	boolean aBoolean1093;
	short aShort1094 = 0;
	int anInt1095;
	int anInt1096;
	int anInt1097;
	private Class377 aClass377_1098;
	int anInt1099;
	int anInt1100;
	int anInt1101;
	int anInt1102;
	byte aByte1103;
	private int anInt1104;
	short[] aShortArray1105;
	boolean aBoolean1106;
	int[] anIntArray1107;
	private short[] aShortArray1108;
	int[] anIntArray1109;
	int anInt1110;
	private byte aByte1111;
	int anInt1112;
	int anInt1113;
	int anInt1114;
	int anInt1115;
	boolean aBoolean1116;
	int[] anIntArray1117;
	int anInt1118;
	private byte aByte1119;
	int anInt1120;
	private int anInt1121;
	byte aByte1122;
	int anInt1123;
	private int[][] anIntArrayArray1124;
	int anInt1125;
	boolean aBoolean1126;
	int anInt1127;
	int anInt1128;
	byte aByte1129;
	boolean aBoolean1130;
	private int anInt1131;
	int anInt1132;
	Class301 aClass301_1133;
	byte aByte1134;
	short aShort1135;
	private byte[] aByteArray1136;
	short[] aShortArray1137;
	private byte aByte1138;
	private byte aByte1139;
	boolean aBoolean1140;
	byte aByte1141;
	private int anInt1142;
	int anInt1143;
	String aString1144;
	int anInt1145; //durp
	private int anInt1146;
	int anInt1147;
	String[] aStringArray1148;
	boolean aBoolean1149;
	static float aFloat1150;
	private int anInt1151;
	int[] anIntArray1152;
	boolean aBoolean1153;
	int anInt1154;
	private short[] aShortArray1155;
	int anInt1156;

	private final void method2293(int i, RSByteBuffer class98_sub22, int i_0_) {
		try {
			if (i != 0)
				method2295((byte) 53);
			if (i_0_ == 1) {
				int i_1_ = class98_sub22.readUnsignedByte();
				this.anIntArray1107 = new int[i_1_];
				for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
					this.anIntArray1107[i_2_] = class98_sub22.readShort();
					if (this.anIntArray1107[i_2_] == 65535)
						this.anIntArray1107[i_2_] = -1;
				}
			} else if (i_0_ != 2) {
				if (i_0_ == 12)
					this.anInt1112 = class98_sub22.readUnsignedByte();
				else if (i_0_ < 30 || i_0_ >= 35) {
					if (i_0_ == 40) {
						int i_3_ = class98_sub22.readUnsignedByte();
						this.aShortArray1105 = new short[i_3_];
						aShortArray1108 = new short[i_3_];
						for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
							aShortArray1108[i_4_] = (short) class98_sub22.readShort();
							this.aShortArray1105[i_4_] = (short) class98_sub22.readShort();
						}
					} else if (i_0_ == 41) {
						int i_5_ = class98_sub22.readUnsignedByte();
						aShortArray1155 = new short[i_5_];
						this.aShortArray1137 = new short[i_5_];
						for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
							aShortArray1155[i_6_] = (short) class98_sub22.readShort();
							this.aShortArray1137[i_6_] = (short) class98_sub22.readShort();
						}
					} else if (i_0_ == 42) {
						int i_7_ = class98_sub22.readUnsignedByte();
						aByteArray1136 = new byte[i_7_];
						for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
							aByteArray1136[i_8_] = class98_sub22.readSignedByte();
					} else if (i_0_ == 60) {
						int i_9_ = class98_sub22.readUnsignedByte();
						this.anIntArray1117 = new int[i_9_];
						for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
							this.anIntArray1117[i_10_] = class98_sub22.readShort();
					} else if (i_0_ != 93) {
						if (i_0_ == 95)
							this.anInt1115 = class98_sub22.readShort();
						else if (i_0_ != 97) {
							if (i_0_ == 98)
								anInt1142 = class98_sub22.readShort();
							else if (i_0_ != 99) {
								if (i_0_ != 100) {
									if (i_0_ == 101)
										anInt1131 = class98_sub22.readSignedByte() * 5;
									else if (i_0_ == 102)
										this.anInt1113 = class98_sub22.readShort();
									else if (i_0_ != 103) {
										if (i_0_ == 106 || i_0_ == 118) {
											anInt1146 = class98_sub22.readShort();
											if (anInt1146 == 65535)
												anInt1146 = -1;
											anInt1151 = class98_sub22.readShort();
											if (anInt1151 == 65535)
												anInt1151 = -1;
											int i_11_ = -1;
											if (i_0_ == 118) {
												i_11_ = (class98_sub22.readShort());
												if (i_11_ == 65535)
													i_11_ = -1;
											}
											int i_12_ = class98_sub22.readUnsignedByte();
											this.anIntArray1109 = new int[i_12_ - -2];
											for (int i_13_ = 0; i_13_ <= i_12_; i_13_++) {
												this.anIntArray1109[i_13_] = (class98_sub22.readShort());
												if ((this.anIntArray1109[i_13_]) == 65535)
													this.anIntArray1109[i_13_] = -1;
											}
											this.anIntArray1109[1 + i_12_] = i_11_;
										} else if (i_0_ == 107)
											this.aBoolean1116 = false;
										else if (i_0_ != 109) {
											if (i_0_ != 111) {
												if (i_0_ != 113) {
													if (i_0_ == 114) {
														this.aByte1122 = (class98_sub22.readSignedByte());
														this.aByte1134 = (class98_sub22.readSignedByte());
													} else if (i_0_ == 119)
														this.aByte1103 = (class98_sub22.readSignedByte());
													else if (i_0_ == 121) {
														anIntArrayArray1124 = (new int[(this.anIntArray1107).length][]);
														int i_14_ = (class98_sub22.readUnsignedByte());
														for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
															int i_16_ = (class98_sub22.readUnsignedByte());
															int[] is = (anIntArrayArray1124[i_16_] = (new int[3]));
															is[0] = (class98_sub22.readSignedByte());
															is[1] = (class98_sub22.readSignedByte());
															is[2] = (class98_sub22.readSignedByte());
														}
													} else if (i_0_ == 122)
														this.anInt1127 = (class98_sub22.readShort());
													else if (i_0_ == 123)
														this.anInt1092 = (class98_sub22.readShort());
													else if (i_0_ == 125)
														this.aByte1141 = (class98_sub22.readSignedByte());
													else if (i_0_ == 127)
														this.anInt1145 = (class98_sub22.readShort());
													else if (i_0_ == 128)
														class98_sub22.readUnsignedByte();
													else if (i_0_ == 134) {
														this.anInt1120 = (class98_sub22.readShort());
														if ((this.anInt1120) == 65535)
															this.anInt1120 = -1;
														this.anInt1132 = (class98_sub22.readShort());
														if ((this.anInt1132) == 65535)
															this.anInt1132 = -1;
														this.anInt1102 = (class98_sub22.readShort());
														if ((this.anInt1102) == 65535)
															this.anInt1102 = -1;
														this.anInt1147 = (class98_sub22.readShort());
														if ((this.anInt1147) == 65535)
															this.anInt1147 = -1;
														this.anInt1128 = (class98_sub22.readUnsignedByte());
													} else if (i_0_ == 135) {
														this.anInt1143 = (class98_sub22.readUnsignedByte());
														this.anInt1154 = (class98_sub22.readShort());
													} else if (i_0_ == 136) {
														this.anInt1114 = (class98_sub22.readUnsignedByte());
														this.anInt1110 = (class98_sub22.readShort());
													} else if (i_0_ != 137) {
														if (i_0_ == 138)
															this.anInt1095 = (class98_sub22.readShort());
														else if (i_0_ != 139) {
															if (i_0_ != 140) {
																if (i_0_ == 141)
																	this.aBoolean1153 = true;
																else if (i_0_ == 142)
																	this.anInt1118 = (class98_sub22.readShort());
																else if (i_0_ != 143) {
																	if ((i_0_ >= 150) && (i_0_ < 155)) {
																		this.aStringArray1148[-150 + i_0_] = class98_sub22.readString();
																		if (!this.aClass301_1133.aBoolean2503)
																			this.aStringArray1148[-150 + i_0_] = null;
																	} else if (i_0_ != 155) {
																		if (i_0_ == 158)
																			this.aByte1129 = (byte) 1;
																		else if (i_0_ != 159) {
																			if (i_0_ != 160) {
																				if (i_0_ != 162) {
																					if (i_0_ != 163) {
																						if (i_0_ == 164) {
																							this.anInt1101 = class98_sub22.readShort();
																							this.anInt1090 = class98_sub22.readShort();
																						} else if (i_0_ != 165) {
																							if (i_0_ != 168) {
																								if (i_0_ == 249) {
																									int i_17_ = class98_sub22.readUnsignedByte();
																									if (aClass377_1098 == null) {
																										int i_18_ = Class48.method453(423660257, i_17_);
																										aClass377_1098 = new Class377(i_18_);
																									}
																									for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
																										boolean bool = class98_sub22.readUnsignedByte() == 1;
																										int i_20_ = class98_sub22.readMedium(-125);
																										Node class98;
																										if (!bool)
																											class98 = new Class98_Sub34(class98_sub22.readInt(-2));
																										else
																											class98 = new Class98_Sub15(class98_sub22.readString());
																										aClass377_1098.method3996(class98, i_20_, -1);
																									}
																								}
																							} else
																								this.anInt1125 = class98_sub22.readUnsignedByte();
																						} else
																							this.anInt1123 = class98_sub22.readUnsignedByte();
																					} else
																						this.anInt1096 = class98_sub22.readUnsignedByte();
																				} else
																					this.aBoolean1093 = true;
																			} else {
																				int i_21_ = class98_sub22.readUnsignedByte();
																				this.anIntArray1152 = new int[i_21_];
																				for (int i_22_ = 0; i_21_ > i_22_; i_22_++)
																					this.anIntArray1152[i_22_] = class98_sub22.readShort();
																			}
																		} else
																			this.aByte1129 = (byte) 0;
																	} else {
																		aByte1111 = class98_sub22.readSignedByte();
																		aByte1139 = class98_sub22.readSignedByte();
																		aByte1119 = class98_sub22.readSignedByte();
																		aByte1138 = class98_sub22.readSignedByte();
																	}
																} else
																	this.aBoolean1149 = true;
															} else
																this.anInt1156 = (class98_sub22.readUnsignedByte());
														} else
															this.anInt1100 = (class98_sub22.readShort());
													} else
														this.anInt1099 = (class98_sub22.readShort());
												} else {
													this.aShort1094 = (short) (class98_sub22.readShort());
													this.aShort1135 = (short) (class98_sub22.readShort());
												}
											} else
												this.aBoolean1130 = false;
										} else
											this.aBoolean1126 = false;
									} else
										this.anInt1091 = class98_sub22.readShort();
								} else
									anInt1104 = class98_sub22.readSignedByte();
							} else
								this.aBoolean1106 = true;
						} else
							anInt1121 = class98_sub22.readShort();
					} else
						this.aBoolean1140 = false;
				} else
					this.aStringArray1148[i_0_ + -30] = class98_sub22.readString();
			} else
				this.aString1144 = class98_sub22.readString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.F(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	static final void method2294(int i) {
		do {
			try {
				if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076.method564((byte) 125) == 0 && Class115.anInt963 != Class43.anInt377)
					Class251.method3170(i + -6547, Class275.anInt2047, false, Class160.anInt1258, 11);
				else {
					client.method103(i, Class265.aHa1974);
					if (Class145.anInt1170 == Class43.anInt377)
						break;
					Class135.method2264((byte) -94);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jl.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2295(byte i) {
		do {
			try {
				int i_23_ = -36 % ((-51 - i) / 48);
				if (this.anIntArray1107 == null)
					this.anIntArray1107 = new int[0];
				if (this.aByte1129 == -1) {
					if (s_Sub1.aClass279_5197 == (this.aClass301_1133.aClass279_2502)) {
						this.aByte1129 = (byte) 1;
						if (!client.aBoolean3553)
							break;
					}
					this.aByte1129 = (byte) 0;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jl.K(" + i + ')');
			}
		} while (false);
	}

	final boolean method2296(Interface6 interface6, byte i) {
		try {
			if (this.anIntArray1109 == null)
				return true;
			int i_24_ = -1;
			do {
				if (anInt1146 != -1) {
					i_24_ = interface6.method7(anInt1146, 7373);
					if (!client.aBoolean3553)
						break;
				}
				if (anInt1151 != -1)
					i_24_ = interface6.method6(anInt1151, 122);
			} while (false);
			if (i_24_ < 0 || i_24_ >= -1 + this.anIntArray1109.length || (this.anIntArray1109[i_24_] == -1)) {
				int i_25_ = (this.anIntArray1109[this.anIntArray1109.length + -1]);
				if (i_25_ == -1)
					return false;
				return true;
			}
			int i_26_ = -123 % (-i / 62);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.L(" + (interface6 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2297(RSByteBuffer class98_sub22, boolean bool) {
		try {
			if (bool != true)
				method2297(null, false);
			for (;;) {
				int i = class98_sub22.readUnsignedByte();
				if (i == 0)
					break;
				method2293(0, class98_sub22, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.A(" + (class98_sub22 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final String method2298(int i, int i_27_, String string) {
		try {
			if (i_27_ >= -14)
				method2295((byte) -67);
			if (aClass377_1098 == null)
				return string;
			Class98_Sub15 class98_sub15 = (Class98_Sub15) aClass377_1098.method3990(i, -1);
			if (class98_sub15 == null)
				return string;
			return class98_sub15.aString3917;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.J(" + i + ',' + i_27_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final AbstractModel method2299(Class97 class97, boolean bool, Interface6 interface6, int i, int i_28_, Class183 class183, int i_29_, ha var_ha, Class40 class40, int i_30_) {
		try {
			if (bool != false)
				return null;
			if (this.anIntArray1109 != null) {
				Class141 class141_31_ = method2300(interface6, (byte) 78);
				if (class141_31_ == null)
					return null;
				return class141_31_.method2299(class97, false, interface6, i, i_28_, class183, i_29_, var_ha, class40, i_30_);
			}
			if (this.anIntArray1117 == null && (class40 == null || class40.anIntArray366 == null))
				return null;
			int i_32_ = i_29_;
			if (class97 != null && i_28_ != -1)
				i_32_ = i_32_ | class97.method932(true, i_28_, !bool, i_30_);
			long l = var_ha.anInt937 << 16 | this.anInt1097;
			if (class40 != null)
				l |= class40.aLong365 << 24;
			AbstractModel class146;
			synchronized (this.aClass301_1133.aClass79_2510) {
				class146 = (AbstractModel) this.aClass301_1133.aClass79_2510.get(l);
			}
			if (class146 == null || i_32_ != (class146.ua() & i_32_)) {
				if (class146 != null)
					i_32_ |= class146.ua();
				int i_33_ = i_32_;
				int[] is = ((class40 != null && class40.anIntArray366 != null) ? class40.anIntArray366 : this.anIntArray1117);
				boolean bool_34_ = false;
				synchronized (this.aClass301_1133.aClass207_2506) {
					for (int i_35_ = 0; is.length > i_35_; i_35_++) {
						if (!this.aClass301_1133.aClass207_2506.method2751(0, is[i_35_], -6329))
							bool_34_ = true;
					}
				}
				if (bool_34_)
					return null;
				ModelDefinitions[] class178s = new ModelDefinitions[is.length];
				synchronized (this.aClass301_1133.aClass207_2506) {
					for (int i_36_ = 0; is.length > i_36_; i_36_++)
						class178s[i_36_] = Class98_Sub6.method981(0, -9252, (this.aClass301_1133.aClass207_2506), is[i_36_]);
				}
				for (int i_37_ = 0; i_37_ < is.length; i_37_++) {
					if (class178s[i_37_] != null && class178s[i_37_].anInt1387 < 13)
						class178s[i_37_].method2592(13746, 2);
				}
				ModelDefinitions class178;
				if (class178s.length != 1)
					class178 = new ModelDefinitions(class178s, class178s.length);
				else
					class178 = class178s[0];
				if (aShortArray1108 != null)
					i_33_ |= 0x4000;
				if (aShortArray1155 != null)
					i_33_ |= 0x8000;
				if (aByte1138 != 0)
					i_33_ |= 0x80000;
				class146 = var_ha.method1790(class178, i_33_, (this.aClass301_1133.anInt2511), 64, 768);
				if (aShortArray1108 != null) {
					short[] is_38_;
					if (class40 == null || class40.aShortArray370 == null)
						is_38_ = this.aShortArray1105;
					else
						is_38_ = class40.aShortArray370;
					for (int i_39_ = 0; (aShortArray1108.length > i_39_); i_39_++) {
						if (aByteArray1136 != null && aByteArray1136.length > i_39_)
							class146.ia(aShortArray1108[i_39_], (Class265.aShortArray1977[0xff & aByteArray1136[i_39_]]));
						else
							class146.ia(aShortArray1108[i_39_], is_38_[i_39_]);
					}
				}
				if (aShortArray1155 != null) {
					short[] is_40_;
					if (class40 != null && class40.aShortArray368 != null)
						is_40_ = class40.aShortArray368;
					else
						is_40_ = this.aShortArray1137;
					for (int i_41_ = 0; i_41_ < aShortArray1155.length; i_41_++)
						class146.aa(aShortArray1155[i_41_], is_40_[i_41_]);
				}
				if (aByte1138 != 0)
					class146.method2337(aByte1111, aByte1139, aByte1119, 0xff & aByte1138);
				class146.s(i_32_);
				synchronized (this.aClass301_1133.aClass79_2510) {
					this.aClass301_1133.aClass79_2510.put(l, class146);
				}
			}
			if (class97 != null && i_28_ != -1)
				class146 = class97.method937(i_30_, i, i_32_, -94, class146, i_28_);
			class146.s(i_29_);
			return class146;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.M(" + (class97 != null ? "{...}" : "null") + ',' + bool + ',' + (interface6 != null ? "{...}" : "null") + ',' + i + ',' + i_28_ + ',' + (class183 != null ? "{...}" : "null") + ',' + i_29_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class40 != null ? "{...}" : "null") + ',' + i_30_ + ')'));
		}
	}

	final Class141 method2300(Interface6 interface6, byte i) {
		try {
			int i_42_ = -1;
			do {
				if (anInt1146 != -1) {
					i_42_ = interface6.method7(anInt1146, 7373);
					if (!client.aBoolean3553)
						break;
				}
				if (anInt1151 != -1)
					i_42_ = interface6.method6(anInt1151, 28);
			} while (false);
			if (i < 19)
				return null;
			if (i_42_ < 0 || (i_42_ >= this.anIntArray1109.length - 1) || this.anIntArray1109[i_42_] == -1) {
				int i_43_ = (this.anIntArray1109[-1 + this.anIntArray1109.length]);
				if (i_43_ != -1)
					return this.aClass301_1133.method3538(i_43_);
				return null;
			}
			return this.aClass301_1133.method3538(this.anIntArray1109[i_42_]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.B(" + (interface6 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final AbstractModel method2301(int i, int i_44_, int[] is, int i_45_, byte i_46_, Class97 class97, Class226[] class226s, ha var_ha, int i_47_, int i_48_, Interface6 interface6, Class40 class40, int i_49_, Class257 class257, int i_50_, int i_51_, Class183 class183, Class97 class97_52_) {
		try {
			if (this.anIntArray1109 != null) {
				Class141 class141_53_ = method2300(interface6, (byte) 78);
				if (class141_53_ == null)
					return null;
				return class141_53_.method2301(i, i_44_, is, i_45_, (byte) 111, class97, class226s, var_ha, i_47_, i_48_, interface6, class40, i_49_, class257, i_50_, i_51_, class183, class97_52_);
			}
			int i_54_ = i_50_;
			if (anInt1142 != 128)
				i_54_ |= 0x2;
			if (anInt1121 != 128)
				i_54_ |= 0x5;
			boolean bool = class97 != null || class97_52_ != null;
			boolean bool_55_ = false;
			boolean bool_56_ = false;
			boolean bool_57_ = false;
			boolean bool_58_ = false;
			int i_59_ = class226s != null ? class226s.length : 0;
			for (int i_60_ = 0; i_59_ > i_60_; i_60_++) {
				Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_] = null;
				if (class226s[i_60_] != null) {
					Class97 class97_61_ = class183.method2623((class226s[i_60_].anInt1700), 16383);
					if (class97_61_.anIntArray818 != null) {
						bool = true;
						Class98_Sub50.aClass97Array4293[i_60_] = class97_61_;
						int i_62_ = class226s[i_60_].anInt1702;
						int i_63_ = class226s[i_60_].anInt1701;
						int i_64_ = class97_61_.anIntArray818[i_62_];
						Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_] = class183.method2624(2, i_64_ >>> 16);
						i_64_ &= 0xffff;
						Class290.anIntArray2198[i_60_] = i_64_;
						if ((Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_]) != null) {
							bool_56_ |= Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_].method1619(i_64_, 31239);
							bool_55_ |= Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_].method1617(false, i_64_);
							bool_58_ |= Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_].method1615(i_64_, false);
							bool_57_ |= class97_61_.aBoolean817;
						}
						if ((class97_61_.aBoolean825 || Class357.aBoolean3027) && i_63_ != -1 && i_63_ < class97_61_.anIntArray818.length) {
							Class32.anIntArray311[i_60_] = class97_61_.anIntArray811[i_62_];
							Class256_Sub1.anIntArray5156[i_60_] = class226s[i_60_].anInt1707;
							int i_65_ = class97_61_.anIntArray818[i_63_];
							OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_60_] = class183.method2624(2, i_65_ >>> 16);
							i_65_ &= 0xffff;
							Class265.anIntArray1981[i_60_] = i_65_;
							if ((OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_60_]) != null) {
								bool_56_ |= OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_60_].method1619(i_65_, 31239);
								bool_55_ |= OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_60_].method1617(false, i_65_);
								bool_58_ |= OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_60_].method1615(i_65_, false);
							}
						} else {
							Class32.anIntArray311[i_60_] = 0;
							Class256_Sub1.anIntArray5156[i_60_] = 0;
							OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_60_] = null;
							Class265.anIntArray1981[i_60_] = -1;
						}
					}
				}
			}
			if (i_46_ <= 91)
				return null;
			int i_66_ = -1;
			int i_67_ = -1;
			int i_68_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_69_ = null;
			int i_70_ = -1;
			int i_71_ = -1;
			int i_72_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16_73_ = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_74_ = null;
			if (bool) {
				if (class97 != null) {
					i_66_ = class97.anIntArray818[i];
					int i_75_ = i_66_ >>> 16;
					i_66_ &= 0xffff;
					class98_sub46_sub16 = class183.method2624(2, i_75_);
					if (class98_sub46_sub16 != null) {
						bool_56_ |= class98_sub46_sub16.method1619(i_66_, 31239);
						bool_55_ |= class98_sub46_sub16.method1617(false, i_66_);
						bool_58_ |= class98_sub46_sub16.method1615(i_66_, false);
						bool_57_ |= class97.aBoolean817;
					}
					if ((class97.aBoolean825 || Class357.aBoolean3027) && i_48_ != -1 && class97.anIntArray818.length > i_48_) {
						i_67_ = class97.anIntArray818[i_48_];
						i_68_ = class97.anIntArray811[i];
						int i_76_ = i_67_ >>> 16;
						if (i_75_ != i_76_)
							class98_sub46_sub16_69_ = class183.method2624(2, i_76_);
						else
							class98_sub46_sub16_69_ = class98_sub46_sub16;
						i_67_ &= 0xffff;
						if (class98_sub46_sub16_69_ != null) {
							bool_56_ |= class98_sub46_sub16_69_.method1619(i_67_, 31239);
							bool_55_ |= class98_sub46_sub16_69_.method1617(false, i_67_);
							bool_58_ |= class98_sub46_sub16_69_.method1615(i_67_, false);
						}
					}
				}
				i_54_ |= 0x20;
				if (class97_52_ != null) {
					i_70_ = class97_52_.anIntArray818[i_45_];
					int i_77_ = i_70_ >>> 16;
					i_70_ &= 0xffff;
					class98_sub46_sub16_73_ = class183.method2624(2, i_77_);
					if (class98_sub46_sub16_73_ != null) {
						bool_56_ |= class98_sub46_sub16_73_.method1619(i_70_, 31239);
						bool_55_ |= class98_sub46_sub16_73_.method1617(false, i_70_);
						bool_58_ |= class98_sub46_sub16_73_.method1615(i_70_, false);
						bool_57_ |= class97_52_.aBoolean817;
					}
					if ((class97_52_.aBoolean825 || Class357.aBoolean3027) && i_51_ != -1 && (class97_52_.anIntArray818.length > i_51_)) {
						i_72_ = class97_52_.anIntArray811[i_45_];
						i_71_ = class97_52_.anIntArray818[i_51_];
						int i_78_ = i_71_ >>> 16;
						if (i_77_ != i_78_)
							class98_sub46_sub16_74_ = class183.method2624(2, i_78_);
						else
							class98_sub46_sub16_74_ = class98_sub46_sub16_73_;
						i_71_ &= 0xffff;
						if (class98_sub46_sub16_74_ != null) {
							bool_56_ |= class98_sub46_sub16_74_.method1619(i_71_, 31239);
							bool_55_ |= class98_sub46_sub16_74_.method1617(false, i_71_);
							bool_58_ |= class98_sub46_sub16_74_.method1615(i_71_, false);
						}
					}
				}
				if (bool_56_)
					i_54_ |= 0x80;
				if (bool_55_)
					i_54_ |= 0x100;
				if (bool_57_)
					i_54_ |= 0x200;
				if (bool_58_)
					i_54_ |= 0x400;
			}
			long l = this.anInt1097 | var_ha.anInt937 << 16;
			if (class40 != null)
				l |= class40.aLong365 << 24;
			AbstractModel class146;
			synchronized (this.aClass301_1133.aClass79_2509) {
				class146 = (AbstractModel) this.aClass301_1133.aClass79_2509.get(l);
			}
			RenderAnimDefinitions class294 = null;
			if (this.anInt1145 != -1)
				class294 = class257.method3199(false, this.anInt1145);
			if (class146 == null || (i_54_ & class146.ua()) != i_54_) {
				if (class146 != null)
					i_54_ |= class146.ua();
				int i_79_ = i_54_;
				int[] is_80_ = ((class40 != null && class40.anIntArray366 != null) ? class40.anIntArray366 : this.anIntArray1107);
				boolean bool_81_ = false;
				synchronized (this.aClass301_1133.aClass207_2506) {
					for (int i_82_ = 0; i_82_ < is_80_.length; i_82_++) {
						if (is_80_[i_82_] != -1 && !this.aClass301_1133.aClass207_2506.method2751(0, is_80_[i_82_], -6329))
							bool_81_ = true;
					}
				}
				if (bool_81_)
					return null;
				ModelDefinitions[] class178s = new ModelDefinitions[is_80_.length];
				for (int i_83_ = 0; i_83_ < is_80_.length; i_83_++) {
					if (is_80_[i_83_] != -1) {
						synchronized (this.aClass301_1133.aClass207_2506) {
							class178s[i_83_] = Class98_Sub6.method981(0, -9252, (this.aClass301_1133.aClass207_2506), is_80_[i_83_]);
						}
						if (class178s[i_83_] != null) {
							if (class178s[i_83_].anInt1387 < 13)
								class178s[i_83_].method2592(13746, 2);
							if (anIntArrayArray1124 != null && anIntArrayArray1124[i_83_] != null)
								class178s[i_83_].method2597(anIntArrayArray1124[i_83_][2], anIntArrayArray1124[i_83_][0], (byte) 89, anIntArrayArray1124[i_83_][1]);
						}
					}
				}
				if (class294 != null && class294.anIntArrayArray2366 != null) {
					for (int i_84_ = 0; (i_84_ < class294.anIntArrayArray2366.length); i_84_++) {
						if (class178s.length > i_84_ && class178s[i_84_] != null) {
							int i_85_ = 0;
							int i_86_ = 0;
							int i_87_ = 0;
							int i_88_ = 0;
							int i_89_ = 0;
							int i_90_ = 0;
							if ((class294.anIntArrayArray2366[i_84_]) != null) {
								i_85_ = (class294.anIntArrayArray2366[i_84_][0]);
								i_90_ = ((class294.anIntArrayArray2366[i_84_][5]) << 3);
								i_86_ = (class294.anIntArrayArray2366[i_84_][1]);
								i_89_ = ((class294.anIntArrayArray2366[i_84_][4]) << 3);
								i_87_ = (class294.anIntArrayArray2366[i_84_][2]);
								i_88_ = ((class294.anIntArrayArray2366[i_84_][3]) << 3);
							}
							if (i_88_ != 0 || i_89_ != 0 || i_90_ != 0)
								class178s[i_84_].method2600(i_90_, i_88_, (byte) 117, i_89_);
							if (i_85_ != 0 || i_86_ != 0 || i_87_ != 0)
								class178s[i_84_].method2597(i_87_, i_85_, (byte) 60, i_86_);
						}
					}
				}
				ModelDefinitions class178;
				if (class178s.length == 1)
					class178 = class178s[0];
				else
					class178 = new ModelDefinitions(class178s, class178s.length);
				if (aShortArray1108 != null)
					i_79_ |= 0x4000;
				if (aShortArray1155 != null)
					i_79_ |= 0x8000;
				if (aByte1138 != 0)
					i_79_ |= 0x80000;
				class146 = var_ha.method1790(class178, i_79_, (this.aClass301_1133.anInt2511), 64 + anInt1104, anInt1131 + 850);
				if (aShortArray1108 != null) {
					short[] is_91_;
					if (class40 != null && class40.aShortArray370 != null)
						is_91_ = class40.aShortArray370;
					else
						is_91_ = this.aShortArray1105;
					for (int i_92_ = 0; aShortArray1108.length > i_92_; i_92_++) {
						if (aByteArray1136 != null && i_92_ < aByteArray1136.length)
							class146.ia(aShortArray1108[i_92_], (Class265.aShortArray1977[aByteArray1136[i_92_] & 0xff]));
						else
							class146.ia(aShortArray1108[i_92_], is_91_[i_92_]);
					}
				}
				if (aShortArray1155 != null) {
					short[] is_93_;
					if (class40 == null || class40.aShortArray368 == null)
						is_93_ = this.aShortArray1137;
					else
						is_93_ = class40.aShortArray368;
					for (int i_94_ = 0; i_94_ < aShortArray1155.length; i_94_++)
						class146.aa(aShortArray1155[i_94_], is_93_[i_94_]);
				}
				if (aByte1138 != 0)
					class146.method2337(aByte1111, aByte1139, aByte1119, 0xff & aByte1138);
				class146.s(i_54_);
				synchronized (this.aClass301_1133.aClass79_2509) {
					this.aClass301_1133.aClass79_2509.put(l, class146);
				}
			}
			AbstractModel class146_95_ = class146.method2341((byte) 4, i_54_, true);
			boolean bool_96_ = false;
			if (is != null) {
				for (int i_97_ = 0; i_97_ < 12; i_97_++) {
					if (is[i_97_] != -1)
						bool_96_ = true;
				}
			}
			if (!bool && !bool_96_)
				return class146_95_;
			Class111[] class111s = null;
			if (class294 != null)
				class111s = class294.method3481(var_ha, (byte) -80);
			if (bool_96_ && class111s != null) {
				for (int i_98_ = 0; i_98_ < 12; i_98_++) {
					if (class111s[i_98_] != null)
						class146_95_.method2331(class111s[i_98_], 1 << i_98_, true);
				}
			}
			int i_99_ = 0;
			int i_100_ = 1;
			for (/**/; i_59_ > i_99_; i_99_++) {
				if (Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_99_] != null)
					class146_95_.method2323(Class290.anIntArray2198[i_99_], -1 + Class256_Sub1.anIntArray5156[i_99_], OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_99_], -27033, i_100_, (Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_99_]), (Class98_Sub50.aClass97Array4293[i_99_].aBoolean817), Class265.anIntArray1981[i_99_], null, 0, Class32.anIntArray311[i_99_]);
				i_100_ <<= 1;
			}
			if (bool_96_) {
				for (int i_101_ = 0; i_101_ < 12; i_101_++) {
					if (is[i_101_] != -1) {
						int i_102_ = -i_44_ + is[i_101_];
						i_102_ &= 0x3fff;
						Class111 class111 = var_ha.method1821();
						class111.method2101(i_102_);
						class146_95_.method2331(class111, 1 << i_101_, false);
					}
				}
			}
			if (bool_96_ && class111s != null) {
				for (int i_103_ = 0; i_103_ < 12; i_103_++) {
					if (class111s[i_103_] != null)
						class146_95_.method2331(class111s[i_103_], 1 << i_103_, false);
				}
			}
			if (class98_sub46_sub16 == null || class98_sub46_sub16_73_ == null) {
				if (class98_sub46_sub16 == null) {
					if (class98_sub46_sub16_73_ != null)
						class146_95_.method2338(-1 + i_47_, class98_sub46_sub16_73_, i_70_, class98_sub46_sub16_74_, (class97_52_.aBoolean817), 0, 126, i_72_, i_71_);
				} else
					class146_95_.method2338(i_49_ - 1, class98_sub46_sub16, i_66_, class98_sub46_sub16_69_, class97.aBoolean817, 0, 112, i_68_, i_67_);
			} else
				class146_95_.method2321(i_68_, i_66_, class98_sub46_sub16, class98_sub46_sub16_69_, class97.aBooleanArray813, i_72_, 28777, i_70_, class98_sub46_sub16_73_, i_71_, i_49_ + -1, (class97.aBoolean817 | (class97_52_.aBoolean817)), class98_sub46_sub16_74_, -1 + i_47_, i_67_);
			for (int i_104_ = 0; i_104_ < i_59_; i_104_++) {
				Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_104_] = null;
				OutgoingPacket.aClass98_Sub46_Sub16Array3870[i_104_] = null;
				Class98_Sub50.aClass97Array4293[i_104_] = null;
			}
			if (anInt1121 != 128 || anInt1142 != 128)
				class146_95_.O(anInt1121, anInt1142, anInt1121);
			class146_95_.s(i_50_);
			return class146_95_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.C(" + i + ',' + i_44_ + ',' + (is != null ? "{...}" : "null") + ',' + i_45_ + ',' + i_46_ + ',' + (class97 != null ? "{...}" : "null") + ',' + (class226s != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_47_ + ',' + i_48_ + ',' + (interface6 != null ? "{...}" : "null") + ',' + (class40 != null ? "{...}" : "null") + ',' + i_49_ + ',' + (class257 != null ? "{...}" : "null") + ',' + i_50_ + ',' + i_51_ + ',' + (class183 != null ? "{...}" : "null") + ',' + (class97_52_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2302(byte i) {
		try {
			if (i < 16)
				return false;
			if (this.anIntArray1109 == null) {
				if (this.anInt1120 == -1 && this.anInt1102 == -1 && this.anInt1147 == -1)
					return false;
				return true;
			}
			for (int i_105_ = 0; i_105_ < this.anIntArray1109.length; i_105_++) {
				if (this.anIntArray1109[i_105_] != -1) {
					Class141 class141_106_ = (this.aClass301_1133.method3538(this.anIntArray1109[i_105_]));
					if ((class141_106_.anInt1120 != -1) || class141_106_.anInt1102 != -1 || (class141_106_.anInt1147 != -1))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jl.E(" + i + ')');
		}
	}

	static final void method2303(ha var_ha, byte i, RuneScapeCache class207) {
		try {
			Class324[] class324s = Class324.method3680(class207, aa.anInt51, 0);
			Class287_Sub2.aClass332Array3275 = new Class332[class324s.length];
			for (int i_107_ = 0; class324s.length > i_107_; i_107_++)
				Class287_Sub2.aClass332Array3275[i_107_] = var_ha.method1758(class324s[i_107_], true);
			class324s = Class324.method3680(class207, VarpClass.anInt3243, 0);
			Class254.aClass332Array1943 = new Class332[class324s.length];
			for (int i_108_ = 0; i_108_ < class324s.length; i_108_++)
				Class254.aClass332Array1943[i_108_] = var_ha.method1758(class324s[i_108_], true);
			class324s = Class324.method3680(class207, Class65.anInt503, 0);
			Class177.aClass332Array1382 = new Class332[class324s.length];
			for (int i_109_ = 0; i_109_ < class324s.length; i_109_++)
				Class177.aClass332Array1382[i_109_] = var_ha.method1758(class324s[i_109_], true);
			class324s = Class324.method3680(class207, Class260.anInt3259, 0);
			Class119_Sub4.aClass332Array4739 = new Class332[class324s.length];
			for (int i_110_ = 0; class324s.length > i_110_; i_110_++)
				Class119_Sub4.aClass332Array4739[i_110_] = var_ha.method1758(class324s[i_110_], true);
			class324s = Class324.method3680(class207, Class251.anInt1916, 0);
			Class2.aClass332Array72 = new Class332[class324s.length];
			for (int i_111_ = 0; i_111_ < class324s.length; i_111_++)
				Class2.aClass332Array72[i_111_] = var_ha.method1758(class324s[i_111_], true);
			class324s = Class324.method3680(class207, Class319.anInt2706, 0);
			Class306.aClass332Array2557 = new Class332[class324s.length];
			for (int i_112_ = 0; i_112_ < class324s.length; i_112_++)
				Class306.aClass332Array2557[i_112_] = var_ha.method1758(class324s[i_112_], true);
			class324s = Class324.method3680(class207, Class76_Sub2.anInt3728, 0);
			Class98_Sub46_Sub11.aClass332Array6032 = new Class332[class324s.length];
			for (int i_113_ = 0; i_113_ < class324s.length; i_113_++)
				Class98_Sub46_Sub11.aClass332Array6032[i_113_] = var_ha.method1758(class324s[i_113_], true);
			class324s = Class324.method3680(class207, Class226.anInt1706, 0);
			Class340.aClass332Array2848 = new Class332[class324s.length];
			for (int i_114_ = 0; i_114_ < class324s.length; i_114_++)
				Class340.aClass332Array2848[i_114_] = var_ha.method1758(class324s[i_114_], true);
			class324s = Class324.method3680(class207, Class39.anInt363, 0);
			Class76_Sub7.aClass332Array3764 = new Class332[class324s.length];
			for (int i_115_ = 0; class324s.length > i_115_; i_115_++)
				Class76_Sub7.aClass332Array3764[i_115_] = var_ha.method1758(class324s[i_115_], true);
			class324s = Class324.method3680(class207, OutputStream_Sub1.anInt37, 0);
			Class93.aClass332Array3512 = new Class332[class324s.length];
			for (int i_116_ = 0; class324s.length > i_116_; i_116_++)
				Class93.aClass332Array3512[i_116_] = var_ha.method1758(class324s[i_116_], true);
			class324s = Class324.method3680(class207, Collision.anInt1852, 0);
			Class64_Sub14.aClass332Array3675 = new Class332[class324s.length];
			for (int i_117_ = 0; i_117_ < class324s.length; i_117_++)
				Class64_Sub14.aClass332Array3675[i_117_] = var_ha.method1758(class324s[i_117_], true);
			class324s = Class324.method3680(class207, Class98_Sub31_Sub4.anInt5860, 0);
			Class64_Sub18.aClass332Array3689 = new Class332[class324s.length];
			int i_118_ = 0 / ((i - 21) / 56);
			for (int i_119_ = 0; class324s.length > i_119_; i_119_++)
				Class64_Sub18.aClass332Array3689[i_119_] = var_ha.method1758(class324s[i_119_], true);
			Class334.aClass332_3471 = var_ha.method1758(Class324.method3685(class207, (Class111_Sub2.anInt4695), 0), true);
			Class284_Sub2_Sub2.aClass332_6199 = var_ha.method1758(Class324.method3685(class207, Class264.anInt1972, 0), true);
			class324s = Class324.method3680(class207, Class76.anInt588, 0);
			Class352.aClass332Array3000 = new Class332[class324s.length];
			for (int i_120_ = 0; i_120_ < class324s.length; i_120_++)
				Class352.aClass332Array3000[i_120_] = var_ha.method1758(class324s[i_120_], true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.D(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static final short[] method2304(byte i, short[] is) {
		try {
			if (i < 109)
				method2294(72);
			if (is == null)
				return null;
			short[] is_121_ = new short[is.length];
			Class236.method2895(is, 0, is_121_, 0, is.length);
			return is_121_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.H(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2305(int i, int i_122_, byte i_123_) {
		try {
			if (i_123_ <= 113)
				return 85;
			if (aClass377_1098 == null)
				return i_122_;
			Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_1098.method3990(i, -1);
			if (class98_sub34 == null)
				return i_122_;
			return class98_sub34.anInt4126;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.G(" + i + ',' + i_122_ + ',' + i_123_ + ')'));
		}
	}

	public Class141() {
		this.anInt1092 = -1;
		anInt1104 = 0;
		this.anInt1112 = 1;
		this.aByte1122 = (byte) -96;
		this.anInt1128 = 0;
		this.anInt1101 = 256;
		this.aBoolean1130 = true;
		this.aByte1129 = (byte) -1;
		this.aByte1103 = (byte) 0;
		this.anInt1113 = -1;
		this.anInt1095 = -1;
		this.anInt1125 = 0;
		this.anInt1123 = 0;
		this.anInt1118 = -1;
		this.anInt1099 = -1;
		this.anInt1115 = -1;
		this.aBoolean1126 = true;
		this.aBoolean1116 = true;
		this.anInt1127 = -1;
		anInt1131 = 0;
		anInt1121 = 128;
		this.anInt1114 = -1;
		this.anInt1143 = -1;
		this.aShort1135 = (short) 0;
		anInt1142 = 128;
		this.aString1144 = "null";
		this.aBoolean1149 = false;
		this.aByte1141 = (byte) 4;
		this.aBoolean1140 = true;
		this.anInt1096 = -1;
		this.anInt1090 = 256;
		this.aByte1134 = (byte) -16;
		this.anInt1120 = -1;
		this.anInt1110 = -1;
		this.anInt1091 = 32;
		this.aBoolean1106 = false;
		this.anInt1145 = -1;
		this.anInt1102 = -1;
		this.anInt1100 = -1;
		this.aStringArray1148 = new String[5];
		this.anInt1132 = -1;
		anInt1151 = -1;
		anInt1146 = -1;
		this.anInt1147 = -1;
		aByte1138 = (byte) 0;
		this.anInt1154 = -1;
		this.aBoolean1153 = false;
		this.anInt1156 = 255;
	}
}
