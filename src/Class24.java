/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
	static int anInt223;
	int anInt224;
	int anInt225;
	int anInt226;
	private int anInt227;
	int anInt228;
	byte[] aByteArray229;
	boolean aBoolean230;
	private int anInt231;
	String aString232;
	Class341 aClass341_233;
	int[] anIntArray234;
	int anInt235;
	private int anInt236;
	String[] aStringArray237;
	int anInt238;
	int anInt239;
	private int anInt240 = -1;
	boolean aBoolean241;
	static int anInt242;
	private int anInt243;
	int anInt244 = 2147483647;
	int anInt245;
	int anInt246 = -1;
	int anInt247;
	int anInt248;
	int anInt249;
	int anInt250;
	private int anInt251;
	int anInt252;
	int anInt253;
	private int anInt254;
	static int carriedWeight = 0;
	private Class377 aClass377_256;
	int anInt257;
	boolean aBoolean258;
	private int anInt259;
	private int anInt260;
	boolean aBoolean261;
	int anInt262;
	String aString263;
	int anInt264;
	int[] anIntArray265;

	final boolean method284(int i, Interface6 interface6) {
		try {
			int i_0_;
			if (anInt260 == -1) {
				if ((anInt259 ^ 0xffffffff) == 0)
					return true;
				i_0_ = interface6.method7(anInt259, 7373);
			} else
				i_0_ = interface6.method6(anInt260, 83);
			if ((i_0_ ^ 0xffffffff) > (anInt251 ^ 0xffffffff) || anInt227 < i_0_)
				return false;
			if (i < 6)
				((Class24) this).anInt225 = -120;
			boolean bool = false;
			int i_1_;
			if (anInt243 == -1) {
				if (anInt240 != -1)
					i_1_ = interface6.method7(anInt240, 7373);
				else
					return true;
			} else
				i_1_ = interface6.method6(anInt243, 63);
			if ((i_1_ ^ 0xffffffff) > (anInt254 ^ 0xffffffff) || (i_1_ ^ 0xffffffff) < (anInt236 ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.G(" + i + ',' + (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method285(int i, int i_2_, int i_3_) {
		try {
			if (aClass377_256 == null)
				return i_3_;
			if (i < 47)
				method289(67, null, 54);
			Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_256.method3990((long) i_2_, -1);
			if (class98_sub34 == null)
				return i_3_;
			return ((Class98_Sub34) class98_sub34).anInt4126;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.D(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final Class332 method286(ha var_ha, byte i) {
		try {
			Class332 class332 = ((Class332) (((Class341) ((Class24) this).aClass341_233).aClass79_2857.get((long) (0x20000 | anInt231 | ((ha) var_ha).anInt937 << 947659261))));
			if (class332 != null)
				return class332;
			((Class341) ((Class24) this).aClass341_233).aClass207_2852.method2742(-84, anInt231);
			Class324 class324 = Class324.method3685((((Class341) ((Class24) this).aClass341_233).aClass207_2852), anInt231, 0);
			if (class324 != null) {
				class332 = var_ha.method1758(class324, true);
				((Class341) ((Class24) this).aClass341_233).aClass79_2857.put((long) (anInt231 | 0x20000 | ((ha) var_ha).anInt937 << 160002877), class332);
			}
			if (i != 92)
				method290(null, -73);
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.B(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class332 method287(byte i, ha var_ha, boolean bool) {
		try {
			int i_4_ = bool ? ((Class24) this).anInt225 : ((Class24) this).anInt245;
			int i_5_ = ((ha) var_ha).anInt937 << 548917245 | i_4_;
			if (i != 92)
				((Class24) this).anInt257 = 107;
			Class332 class332 = ((Class332) ((Class341) ((Class24) this).aClass341_233).aClass79_2857.get((long) i_5_));
			if (class332 != null)
				return class332;
			if (!((Class341) ((Class24) this).aClass341_233).aClass207_2852.method2742(-52, i_4_))
				return null;
			Class324 class324 = Class324.method3685((((Class341) ((Class24) this).aClass341_233).aClass207_2852), i_4_, 0);
			if (class324 != null) {
				class332 = var_ha.method1758(class324, true);
				((Class341) ((Class24) this).aClass341_233).aClass79_2857.put((long) i_5_, class332);
			}
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.H(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method288(int i, int i_6_, RSByteBuffer class98_sub22) {
		try {
			if (i == 27177) {
				if (i_6_ != 1) {
					if ((i_6_ ^ 0xffffffff) != -3) {
						if (i_6_ != 3) {
							if (i_6_ != 4) {
								if (i_6_ != 5) {
									if ((i_6_ ^ 0xffffffff) != -7) {
										if (i_6_ != 7) {
											if (i_6_ == 8)
												((Class24) this).aBoolean261 = (class98_sub22.readUnsignedByte()) == 1;
											else if ((i_6_ ^ 0xffffffff) == -10) {
												anInt259 = (class98_sub22.readShort());
												if (anInt259 == 65535)
													anInt259 = -1;
												anInt260 = (class98_sub22.readShort());
												if ((anInt260 ^ 0xffffffff) == -65536)
													anInt260 = -1;
												anInt251 = class98_sub22.readInt(-2);
												anInt227 = class98_sub22.readInt(-2);
											} else if (i_6_ >= 10 && i_6_ <= 14)
												((Class24) this).aStringArray237[-10 + i_6_] = (class98_sub22.readString());
											else if ((i_6_ ^ 0xffffffff) != -16) {
												if ((i_6_ ^ 0xffffffff) == -17)
													((Class24) this).aBoolean241 = false;
												else if (i_6_ != 17) {
													if (i_6_ == 18)
														anInt231 = (class98_sub22.readShort());
													else if ((i_6_ ^ 0xffffffff) != -20) {
														if ((i_6_ ^ 0xffffffff) == -21) {
															anInt240 = (class98_sub22.readShort());
															if ((anInt240 ^ 0xffffffff) == -65536)
																anInt240 = -1;
															anInt243 = (class98_sub22.readShort());
															if (anInt243 == 65535)
																anInt243 = -1;
															anInt254 = (class98_sub22.readInt(-2));
															anInt236 = (class98_sub22.readInt(-2));
														} else if ((i_6_ ^ 0xffffffff) != -22) {
															if ((i_6_ ^ 0xffffffff) != -23) {
																if (i_6_ != 23) {
																	if ((i_6_ ^ 0xffffffff) == -25) {
																		((Class24) this).anInt235 = class98_sub22.readUShort(false);
																		((Class24) this).anInt252 = class98_sub22.readUShort(false);
																	} else if ((i_6_ ^ 0xffffffff) == -250) {
																		int i_7_ = class98_sub22.readUnsignedByte();
																		if (aClass377_256 == null) {
																			int i_8_ = Class48.method453(423660257, i_7_);
																			aClass377_256 = new Class377(i_8_);
																		}
																		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
																			boolean bool = class98_sub22.readUnsignedByte() == 1;
																			int i_10_ = class98_sub22.readMedium(i ^ ~0x6a52);
																			Node class98;
																			if (bool)
																				class98 = new Class98_Sub15(class98_sub22.readString());
																			else
																				class98 = new Class98_Sub34(class98_sub22.readInt(-2));
																			aClass377_256.method3996(class98, (long) i_10_, -1);
																		}
																	}
																} else {
																	((Class24) this).anInt250 = (class98_sub22.readUnsignedByte());
																	((Class24) this).anInt253 = (class98_sub22.readUnsignedByte());
																	((Class24) this).anInt224 = (class98_sub22.readUnsignedByte());
																}
															} else
																((Class24) this).anInt226 = (class98_sub22.readInt(-2));
														} else
															((Class24) this).anInt239 = (class98_sub22.readInt(-2));
													} else
														((Class24) this).anInt246 = (class98_sub22.readShort());
												} else
													((Class24) this).aString232 = (class98_sub22.readString());
											} else {
												int i_11_ = (class98_sub22.readUnsignedByte());
												((Class24) this).anIntArray265 = new int[i_11_ * 2];
												for (int i_12_ = 0; ((2 * i_11_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++)
													((Class24) this).anIntArray265[i_12_] = (class98_sub22.readUShort(false));
												((Class24) this).anInt249 = class98_sub22.readInt(-2);
												int i_13_ = (class98_sub22.readUnsignedByte());
												((Class24) this).anIntArray234 = new int[i_13_];
												for (int i_14_ = 0; (((((Class24) this).anIntArray234).length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++)
													((Class24) this).anIntArray234[i_14_] = (class98_sub22.readInt(i + -27179));
												((Class24) this).aByteArray229 = new byte[i_11_];
												for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)); i_15_++)
													((Class24) this).aByteArray229[i_15_] = (class98_sub22.readSignedByte());
											}
										} else {
											int i_16_ = class98_sub22.readUnsignedByte();
											if ((0x2 & i_16_) == 2)
												((Class24) this).aBoolean230 = true;
											if ((0x1 & i_16_) == 0)
												((Class24) this).aBoolean258 = false;
										}
									} else
										((Class24) this).anInt264 = class98_sub22.readUnsignedByte();
								} else
									((Class24) this).anInt238 = class98_sub22.readMedium(-128);
							} else
								((Class24) this).anInt257 = class98_sub22.readMedium(-124);
						} else
							((Class24) this).aString263 = class98_sub22.readString();
					} else
						((Class24) this).anInt225 = class98_sub22.readShort();
				} else
					((Class24) this).anInt245 = class98_sub22.readShort();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.E(" + i + ',' + i_6_ + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final String method289(int i, String string, int i_17_) {
		try {
			if (aClass377_256 == null)
				return string;
			Class98_Sub15 class98_sub15 = (Class98_Sub15) aClass377_256.method3990((long) i_17_, -1);
			if (class98_sub15 == null)
				return string;
			if (i != -5911)
				((Class24) this).anInt248 = 76;
			return ((Class98_Sub15) class98_sub15).aString3917;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.A(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_17_ + ')'));
		}
	}

	final void method290(RSByteBuffer class98_sub22, int i) {
		do {
			try {
				for (;;) {
					int i_18_ = class98_sub22.readUnsignedByte();
					if ((i_18_ ^ 0xffffffff) == -1)
						break;
					method288(i + 27172, i_18_, class98_sub22);
				}
				if (i == 5)
					break;
				method289(-65, null, 33);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("bq.F(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method291(int i) {
		do {
			try {
				if (((Class24) this).anIntArray265 != null) {
					for (int i_19_ = 0; ((((Class24) this).anIntArray265.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_ += 2) {
						if (((Class24) this).anIntArray265[i_19_] >= ((Class24) this).anInt244) {
							if (((Class24) this).anIntArray265[i_19_] > ((Class24) this).anInt247)
								((Class24) this).anInt247 = ((Class24) this).anIntArray265[i_19_];
						} else
							((Class24) this).anInt244 = ((Class24) this).anIntArray265[i_19_];
						if ((((Class24) this).anIntArray265[1 + i_19_] ^ 0xffffffff) <= (((Class24) this).anInt248 ^ 0xffffffff)) {
							if (((Class24) this).anInt262 < ((Class24) this).anIntArray265[i_19_ - -1])
								((Class24) this).anInt262 = (((Class24) this).anIntArray265[i_19_ + 1]);
						} else
							((Class24) this).anInt248 = ((Class24) this).anIntArray265[i_19_ + 1];
					}
				}
				if (i == -25798)
					break;
				method289(10, null, -15);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bq.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class24() {
		((Class24) this).anInt245 = -1;
		((Class24) this).anInt224 = -1;
		((Class24) this).anInt248 = 2147483647;
		anInt243 = -1;
		anInt231 = -1;
		((Class24) this).anInt247 = -2147483648;
		((Class24) this).anInt238 = -1;
		((Class24) this).anInt225 = -1;
		((Class24) this).aBoolean230 = false;
		((Class24) this).aBoolean261 = true;
		((Class24) this).aBoolean258 = true;
		((Class24) this).anInt253 = -1;
		anInt259 = -1;
		((Class24) this).aBoolean241 = true;
		anInt260 = -1;
		((Class24) this).anInt262 = -2147483648;
		((Class24) this).anInt264 = 0;
		((Class24) this).anInt250 = -1;
		((Class24) this).aStringArray237 = new String[5];
	}

	static {
		anInt242 = 1;
	}
}
