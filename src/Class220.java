/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class220 {
	private int[] anIntArray1646;
	private int[] anIntArray1647;
	private int[][] anIntArrayArray1648;
	int anInt1649 = -1;
	private Class377 aClass377_1650;
	private int[] anIntArray1651;
	private int[] anIntArray1652;
	private int[] anIntArray1653;
	private String aString1654;
	private int[] anIntArray1655;
	private String[] aStringArray1656;
	static Class98_Sub4 aClass98_Sub4_1657 = null;
	private int[][] anIntArrayArray1658;
	private int[][] anIntArrayArray1659;
	private int[] anIntArray1660;
	private int[] anIntArray1661;
	private String[] aStringArray1662;
	private String aString1663;

	final void method2816(byte i, RSByteBuffer class98_sub22) {
		do {
			try {
				for (;;) {
					int i_0_ = class98_sub22.readUnsignedByte();
					if ((i_0_ ^ 0xffffffff) == -1)
						break;
					method2818(class98_sub22, i_0_, 98);
				}
				if (i <= -106)
					break;
				aString1663 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("oba.E(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2817(int i) {
		try {
			aClass98_Sub4_1657 = null;
			int i_1_ = 102 % ((i - 23) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oba.D(" + i + ')');
		}
	}

	private final void method2818(RSByteBuffer class98_sub22, int i, int i_2_) {
		try {
			if (i != 1) {
				if (i != 2) {
					if (i != 3) {
						if (i == 4) {
							int i_3_ = class98_sub22.readUnsignedByte();
							anIntArrayArray1648 = new int[i_3_][3];
							for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
								anIntArrayArray1648[i_4_][0] = class98_sub22.readShort();
								anIntArrayArray1648[i_4_][1] = class98_sub22.readInt(-2);
								anIntArrayArray1648[i_4_][2] = class98_sub22.readInt(-2);
							}
						} else if (i != 5) {
							if (i != 6) {
								if (i != 7) {
									if (i != 8) {
										if ((i ^ 0xffffffff) != -10) {
											if (i == 10) {
												int i_5_ = (class98_sub22.readUnsignedByte());
												anIntArray1652 = new int[i_5_];
												for (int i_6_ = 0; ((i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++)
													anIntArray1652[i_6_] = class98_sub22.readInt(-2);
											} else if (i != 12) {
												if (i == 13) {
													int i_7_ = (class98_sub22.readUnsignedByte());
													anIntArray1651 = new int[i_7_];
													for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)); i_8_++)
														anIntArray1651[i_8_] = (class98_sub22.readShort());
												} else if ((i ^ 0xffffffff) == -15) {
													int i_9_ = (class98_sub22.readUnsignedByte());
													anIntArrayArray1658 = new int[i_9_][2];
													for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
														anIntArrayArray1658[i_10_][0] = (class98_sub22.readUnsignedByte());
														anIntArrayArray1658[i_10_][1] = (class98_sub22.readUnsignedByte());
													}
												} else if (i != 15) {
													if (i == 17)
														((Class220) this).anInt1649 = (class98_sub22.readShort());
													else if ((i ^ 0xffffffff) == -19) {
														int i_11_ = (class98_sub22.readUnsignedByte());
														anIntArray1653 = new int[i_11_];
														anIntArray1647 = new int[i_11_];
														aStringArray1662 = (new String[i_11_]);
														anIntArray1661 = new int[i_11_];
														for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)); i_12_++) {
															anIntArray1647[i_12_] = (class98_sub22.readInt(-2));
															anIntArray1653[i_12_] = (class98_sub22.readInt(-2));
															anIntArray1661[i_12_] = (class98_sub22.readInt(-2));
															aStringArray1662[i_12_] = (class98_sub22.readString());
														}
													} else if ((i ^ 0xffffffff) != -20) {
														if (i == 249) {
															int i_13_ = (class98_sub22.readUnsignedByte());
															if (aClass377_1650 == null) {
																int i_14_ = (Class48.method453(423660257, i_13_));
																aClass377_1650 = (new Class377(i_14_));
															}
															for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
																boolean bool = ((class98_sub22.readUnsignedByte()) == 1);
																int i_16_ = (class98_sub22.readMedium(-125));
																Node class98;
																if (bool)
																	class98 = (new Class98_Sub15(class98_sub22.readString()));
																else
																	class98 = (new Class98_Sub34(class98_sub22.readInt(-2)));
																aClass377_1650.method3996(class98, (long) i_16_, -1);
															}
														}
													} else {
														int i_17_ = (class98_sub22.readUnsignedByte());
														anIntArray1655 = new int[i_17_];
														aStringArray1656 = (new String[i_17_]);
														anIntArray1646 = new int[i_17_];
														anIntArray1660 = new int[i_17_];
														for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)); i_18_++) {
															anIntArray1646[i_18_] = (class98_sub22.readInt(-2));
															anIntArray1655[i_18_] = (class98_sub22.readInt(-2));
															anIntArray1660[i_18_] = (class98_sub22.readInt(-2));
															aStringArray1656[i_18_] = (class98_sub22.readString());
														}
													}
												} else
													class98_sub22.readShort();
											} else
												class98_sub22.readInt(-2);
										} else
											class98_sub22.readUnsignedByte();
									}
								} else
									class98_sub22.readUnsignedByte();
							} else
								class98_sub22.readUnsignedByte();
						} else
							class98_sub22.readShort();
					} else {
						int i_19_ = class98_sub22.readUnsignedByte();
						anIntArrayArray1659 = new int[i_19_][3];
						for (int i_20_ = 0; (i_19_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
							anIntArrayArray1659[i_20_][0] = class98_sub22.readShort();
							anIntArrayArray1659[i_20_][1] = class98_sub22.readInt(-2);
							anIntArrayArray1659[i_20_][2] = class98_sub22.readInt(-2);
						}
					}
				} else {
					aString1654 = class98_sub22.method1223(-1);
				}
			} else {
				aString1663 = class98_sub22.method1223(-1);
			}
			int i_21_ = 36 % ((i_2_ - 6) / 48);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oba.A(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')'));
		}
	}

	final void method2819(int i) {
		do {
			try {
				if (i != -9639)
					anIntArray1651 = null;
				if (aString1654 != null)
					break;
				aString1654 = aString1663;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oba.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2820(byte i) {
		try {
			Class245.aClass338Array1865 = new Class338[50];
			Class306.anInt2566 = 0;
			if (i <= 117)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oba.B(" + i + ')');
		}
	}

	public Class220() {
		/* empty */
	}
}
