/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class197 {
	static int anInt1513;
	int anInt1514;
	static long aLong1515 = 0L;
	private byte[][] aByteArrayArray1516;
	int anInt1517;
	int anInt1518;
	private byte[] aByteArray1519;
	static int anInt1520 = 2;

	final int method2669(int i, int i_0_, String string, Class332[] class332s) {
		try {
			if (i_0_ != 0)
				return 121;
			return method2675(string, Class54.aStringArray3393, new int[] { i }, class332s, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.A(" + i + ',' + i_0_ + ',' + (string != null ? "{...}" : "null") + ',' + (class332s != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2670(int i, String string, Class332[] class332s, byte i_1_) {
		try {
			int i_2_ = -79 % ((-55 - i_1_) / 58);
			int i_3_ = method2675(string, Class54.aStringArray3393, new int[] { i }, class332s, -1);
			int i_4_ = 0;
			for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
				int i_6_ = method2676((byte) 64, class332s, Class54.aStringArray3393[i_5_]);
				if (i_6_ > i_4_)
					i_4_ = i_6_;
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.F(" + i + ',' + (string != null ? "{...}" : "null") + ',' + (class332s != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final int method2671(byte i, char c, int i_7_) {
		try {
			if (i != -50)
				method2673((byte) -79, 29);
			if (aByteArrayArray1516 != null)
				return aByteArrayArray1516[i_7_][c];
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.H(" + i + ',' + c + ',' + i_7_ + ')'));
		}
	}

	final int method2672(Class332[] class332s, int i, int i_8_, String string, boolean bool) {
		try {
			if (bool != true)
				return 61;
			if (i_8_ == 0)
				i_8_ = this.anInt1518;
			int i_9_ = method2675(string, Class54.aStringArray3393, new int[] { i }, class332s, -1);
			int i_10_ = (i_9_ - 1) * i_8_;
			return (this.anInt1514 + this.anInt1517 - -i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.C(" + (class332s != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ',' + (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final int method2673(byte i, int i_11_) {
		try {
			int i_12_ = -43 % ((i - -77) / 37);
			return 0xff & aByteArray1519[i_11_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mv.B(" + i + ',' + i_11_ + ')');
		}
	}

	final int method2674(String string, int i) {
		try {
			if (i < 98)
				method2670(-112, null, null, (byte) 87);
			return method2676((byte) 118, null, string);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.I(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method2675(String string, String[] strings, int[] is, Class332[] class332s, int i) {
		try {
			if (string == null)
				return 0;
			int i_13_ = 0;
			int i_14_ = 0;
			int i_15_ = -1;
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = i;
			int i_19_ = -1;
			int i_20_ = 0;
			int i_21_ = string.length();
			for (int i_22_ = 0; i_21_ > i_22_; i_22_++) {
				int i_23_ = 0xff & Class349.method3843((byte) 88, string.charAt(i_22_));
				int i_24_ = 0;
				if (i_23_ == 60)
					i_18_ = i_22_;
				else {
					int i_25_;
					if (i_18_ == -1) {
						i_25_ = i_22_;
						i_24_ += method2673((byte) -117, i_23_);
						if (aByteArrayArray1516 != null && i_19_ != -1)
							i_24_ += aByteArrayArray1516[i_19_][i_23_];
						i_19_ = i_23_;
					} else {
						if (i_23_ != 62)
							continue;
						i_25_ = i_18_;
						String string_26_ = string.substring(i_18_ - -1, i_22_);
						i_18_ = -1;
						if (!string_26_.equals("br")) {
							if (string_26_.equals("lt")) {
								i_24_ += method2673((byte) 49, 60);
								if (aByteArrayArray1516 != null && i_19_ != -1)
									i_24_ += aByteArrayArray1516[i_19_][60];
								i_19_ = 60;
							} else if (!string_26_.equals("gt")) {
								if (!string_26_.equals("nbsp")) {
									if (!string_26_.equals("shy")) {
										if (string_26_.equals("times")) {
											i_24_ += method2673((byte) 77, 215);
											if (aByteArrayArray1516 != null && i_19_ != -1)
												i_24_ += (aByteArrayArray1516[i_19_][215]);
											i_19_ = 215;
										} else if (string_26_.equals("euro")) {
											i_24_ += method2673((byte) -124, 8364);
											if (aByteArrayArray1516 != null && i_19_ != -1)
												i_24_ += (aByteArrayArray1516[i_19_][8364]);
											i_19_ = 8364;
										} else if (!string_26_.equals("copy")) {
											if (!string_26_.equals("reg")) {
												if (string_26_.startsWith("img=") && class332s != null) {
													try {
														int i_27_ = (PacketSender.method3607(48, (string_26_.substring(4))));
														i_24_ += (class332s[i_27_].method3737());
														i_19_ = -1;
													} catch (Exception exception) {
														/* empty */
													}
												}
											} else {
												i_24_ += method2673((byte) 5, 174);
												if (aByteArrayArray1516 != null && (i_19_ != -1))
													i_24_ += (aByteArrayArray1516[i_19_][174]);
												i_19_ = 174;
											}
										} else {
											i_24_ += method2673((byte) -126, 169);
											if (aByteArrayArray1516 != null && i_19_ != -1)
												i_24_ += (aByteArrayArray1516[i_19_][169]);
											i_19_ = 169;
										}
									} else {
										i_24_ += method2673((byte) -114, 173);
										if (aByteArrayArray1516 != null && i_19_ != -1)
											i_24_ += (aByteArrayArray1516[i_19_][173]);
										i_19_ = 173;
									}
								} else {
									i_24_ += method2673((byte) 9, 160);
									if (aByteArrayArray1516 != null && i_19_ != -1)
										i_24_ += aByteArrayArray1516[i_19_][160];
									i_19_ = 160;
								}
							} else {
								i_24_ += method2673((byte) 51, 62);
								if (aByteArrayArray1516 != null && i_19_ != -1)
									i_24_ += aByteArrayArray1516[i_19_][62];
								i_19_ = 62;
							}
						} else {
							strings[i_20_] = string.substring(i_14_, i_22_ - -1);
							if (++i_20_ >= strings.length)
								return 0;
							i_15_ = -1;
							i_13_ = 0;
							i_19_ = -1;
							i_14_ = i_22_ + 1;
							continue;
						}
						i_23_ = -1;
					}
					if (i_24_ > 0) {
						i_13_ += i_24_;
						if (is != null) {
							if (i_23_ == 32) {
								i_17_ = 1;
								i_16_ = i_13_;
								i_15_ = i_22_;
							}
							if (i_13_ > is[(is.length > i_20_ ? i_20_ : is.length - 1)]) {
								if (i_15_ < 0) {
									strings[i_20_] = string.substring(i_14_, i_25_);
									if (++i_20_ >= strings.length)
										return 0;
									i_15_ = -1;
									i_14_ = i_25_;
									i_19_ = -1;
									i_13_ = i_24_;
								} else {
									strings[i_20_] = string.substring(i_14_, -i_17_ + 1 + i_15_);
									i_20_++;
									if (strings.length <= i_20_)
										return 0;
									i_14_ = i_15_ - -1;
									i_13_ -= i_16_;
									i_15_ = -1;
									i_19_ = -1;
								}
							}
							if (i_23_ == 45) {
								i_16_ = i_13_;
								i_17_ = 0;
								i_15_ = i_22_;
							}
						}
					}
				}
			}
			if (i_14_ < string.length()) {
				strings[i_20_] = string.substring(i_14_, string.length());
				i_20_++;
			}
			return i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.D(" + (string != null ? "{...}" : "null") + ',' + (strings != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (class332s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	Class197(byte[] is) {
		try {
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			int i = class98_sub22.readUnsignedByte();
			if (i != 0)
				throw new RuntimeException("");
			boolean bool = class98_sub22.readUnsignedByte() == 1;
			aByteArray1519 = new byte[256];
			class98_sub22.method1190(aByteArray1519, true, 256, 0);
			if (bool) {
				int[] is_28_ = new int[256];
				int[] is_29_ = new int[256];
				for (int i_30_ = 0; i_30_ < 256; i_30_++)
					is_28_[i_30_] = class98_sub22.readUnsignedByte();
				for (int i_31_ = 0; i_31_ < 256; i_31_++)
					is_29_[i_31_] = class98_sub22.readUnsignedByte();
				byte[][] is_32_ = new byte[256][];
				for (int i_33_ = 0; i_33_ < 256; i_33_++) {
					is_32_[i_33_] = new byte[is_28_[i_33_]];
					byte i_34_ = 0;
					for (int i_35_ = 0; i_35_ < is_32_[i_33_].length; i_35_++) {
						i_34_ += class98_sub22.readSignedByte();
						is_32_[i_33_][i_35_] = i_34_;
					}
				}
				byte[][] is_36_ = new byte[256][];
				for (int i_37_ = 0; i_37_ < 256; i_37_++) {
					is_36_[i_37_] = new byte[is_28_[i_37_]];
					byte i_38_ = 0;
					for (int i_39_ = 0; i_39_ < is_36_[i_37_].length; i_39_++) {
						i_38_ += class98_sub22.readSignedByte();
						is_36_[i_37_][i_39_] = i_38_;
					}
				}
				aByteArrayArray1516 = new byte[256][256];
				for (int i_40_ = 0; i_40_ < 256; i_40_++) {
					if (i_40_ != 32 && i_40_ != 160) {
						for (int i_41_ = 0; i_41_ < 256; i_41_++) {
							if (i_41_ != 32 && i_41_ != 160)
								aByteArrayArray1516[i_40_][i_41_] = (byte) (Class378.method4003(i_41_, i_40_, is_32_, false, is_28_, is_36_, is_29_, aByteArray1519));
						}
					}
				}
				this.anInt1518 = is_28_[32] + is_29_[32];
			} else
				this.anInt1518 = class98_sub22.readUnsignedByte();
			class98_sub22.readUnsignedByte();
			class98_sub22.readUnsignedByte();
			this.anInt1517 = class98_sub22.readUnsignedByte();
			this.anInt1514 = class98_sub22.readUnsignedByte();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mv.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final int method2676(byte i, Class332[] class332s, String string) {
		try {
			if (string == null)
				return 0;
			int i_42_ = -1;
			int i_43_ = -1;
			int i_44_ = 0;
			int i_45_ = string.length();
			int i_46_ = 0;
			int i_47_ = 75 / ((i - 7) / 57);
			for (/**/; i_45_ > i_46_; i_46_++) {
				char c = string.charAt(i_46_);
				if (c == 60)
					i_42_ = i_46_;
				else {
					if (c == 62 && i_42_ != -1) {
						String string_48_ = string.substring(i_42_ + 1, i_46_);
						i_42_ = -1;
						if (string_48_.equals("lt"))
							c = '<';
						else if (string_48_.equals("gt"))
							c = '>';
						else if (string_48_.equals("nbsp"))
							c = '\u00a0';
						else if (!string_48_.equals("shy")) {
							if (string_48_.equals("times"))
								c = '\u00d7';
							else if (!string_48_.equals("euro")) {
								if (!string_48_.equals("copy")) {
									if (!string_48_.equals("reg")) {
										if (string_48_.startsWith("img=") && class332s != null) {
											try {
												int i_49_ = (PacketSender.method3607(-51, string_48_.substring(4)));
												i_43_ = -1;
												i_44_ += class332s[i_49_].method3737();
											} catch (Exception exception) {
												/* empty */
											}
										}
										continue;
									}
									c = '\u00ae';
								} else
									c = '\u00a9';
							} else
								c = '\u20ac';
						} else
							c = '\u00ad';
					}
					if (i_42_ == -1) {
						i_44_ += 0xff & (aByteArray1519[(Class349.method3843((byte) 88, c) & 0xff)]);
						if (aByteArrayArray1516 != null && i_43_ != -1)
							i_44_ += aByteArrayArray1516[i_43_][c];
						i_43_ = c;
					}
				}
			}
			return i_44_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.G(" + i + ',' + (class332s != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final String method2677(String string, boolean bool, Class332[] class332s, int i) {
		try {
			if (method2676((byte) -110, class332s, string) <= i)
				return string;
			i -= method2676((byte) 87, null, "...");
			int i_50_ = -1;
			int i_51_ = -1;
			int i_52_ = 0;
			if (bool != false)
				aByteArrayArray1516 = null;
			int i_53_ = string.length();
			String string_54_ = "";
			for (int i_55_ = 0; i_53_ > i_55_; i_55_++) {
				char c = string.charAt(i_55_);
				if (c == 60)
					i_50_ = i_55_;
				else {
					if (c == 62 && i_50_ != -1) {
						String string_56_ = string.substring(i_50_ - -1, i_55_);
						i_50_ = -1;
						if (!string_56_.equals("lt")) {
							if (!string_56_.equals("gt")) {
								if (string_56_.equals("nbsp"))
									c = '\u00a0';
								else if (string_56_.equals("shy"))
									c = '\u00ad';
								else if (string_56_.equals("times"))
									c = '\u00d7';
								else if (!string_56_.equals("euro")) {
									if (string_56_.equals("copy"))
										c = '\u00a9';
									else {
										if (!string_56_.equals("reg")) {
											if (string_56_.startsWith("img=") && class332s != null) {
												try {
													int i_57_ = (PacketSender.method3607(-96, (string_56_.substring(4))));
													i_51_ = -1;
													i_52_ += class332s[i_57_].method3737();
													if (i_52_ > i)
														return (string_54_ + "...");
													string_54_ = (string.substring(0, 1 + i_55_));
												} catch (Exception exception) {
													/* empty */
												}
											}
											continue;
										}
										c = '\u00ae';
									}
								} else
									c = '\u20ac';
							} else
								c = '>';
						} else
							c = '<';
					}
					if (i_50_ == -1) {
						i_52_ += 0xff & (aByteArray1519[0xff & Class349.method3843((byte) 88, c)]);
						if (aByteArrayArray1516 != null && i_51_ != -1)
							i_52_ += aByteArrayArray1516[i_51_][c];
						i_51_ = c;
						int i_58_ = i_52_;
						if (aByteArrayArray1516 != null)
							i_58_ += aByteArrayArray1516[c][46];
						if (i < i_58_)
							return string_54_ + "...";
						string_54_ = string.substring(0, i_55_ + 1);
					}
				}
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mv.E(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + (class332s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
