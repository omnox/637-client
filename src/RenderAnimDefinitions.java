/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RenderAnimDefinitions {
	int anInt2357;
	private int anInt2358 = -1;
	int anInt2359;
	int anInt2360;
	int anInt2361 = -1;
	int anInt2362;
	int anInt2363;
	int[][] anIntArrayArray2364;
	int anInt2365;
	int[][] anIntArrayArray2366;
	private int anInt2367;
	int anInt2368;
	int anInt2369;
	int anInt2370;
	static int anInt2371 = 1405;
	int anInt2372;
	int[] anIntArray2373;
	int anInt2374;
	int anInt2375;
	int anInt2376;
	int anInt2377;
	int anInt2378;
	int[] anIntArray2379;
	int anInt2380;
	int anInt2381;
	int anInt2382;
	int anInt2383;
	int anInt2384;
	int anInt2385;
	int[] anIntArray2386;
	private Class111[] aClass111Array2387;
	int anInt2388;
	int anInt2389;
	int anInt2390;
	int anInt2391;
	int anInt2392;
	int anInt2393;
	int anInt2394;
	int[] anIntArray2395;
	int anInt2396;
	static Class377 aClass377_2397 = new Class377(16);
	int anInt2398;
	int anInt2399;
	boolean aBoolean2400;
	int anInt2401;
	int anInt2402;
	int anInt2403;
	int anInt2404;
	int anInt2405;
	static int[] anIntArray2406;
	static int anInt2407;
	static int[] anIntArray2408 = new int[1000];

	final void method3475(int i, RSByteBuffer class98_sub22) {
		try {
			if (i == -22400) {
				for (;;) {
					int i_0_ = class98_sub22.readUnsignedByte();
					if (i_0_ == 0)
						break;
					method3476(class98_sub22, i_0_, 91);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sc.F(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3476(RSByteBuffer class98_sub22, int i, int i_1_) {
		do {
			try {
				if (i_1_ > 76) {
					if (i != 1) {
						if (i != 2) {
							if (i != 3) {
								if (i != 4) {
									if (i != 5) {
										if (i == 6)
											this.anInt2389 = class98_sub22.readShort();
										else if (i == 7)
											this.anInt2361 = class98_sub22.readShort();
										else if (i != 8) {
											if (i != 9) {
												if (i == 26) {
													this.anInt2362 = (short) ((class98_sub22.readUnsignedByte()) * 4);
													this.anInt2382 = (short) ((class98_sub22.readUnsignedByte()) * 4);
												} else if (i == 27) {
													if ((this.anIntArrayArray2366) == null)
														this.anIntArrayArray2366 = new int[12][];
													int i_2_ = (class98_sub22.readUnsignedByte());
													this.anIntArrayArray2366[i_2_] = new int[6];
													for (int i_3_ = 0; i_3_ < 6; i_3_++)
														this.anIntArrayArray2366[i_2_][i_3_] = (class98_sub22.readUShort(false));
												} else if (i == 28) {
													this.anIntArray2379 = new int[12];
													for (int i_4_ = 0; i_4_ < 12; i_4_++) {
														this.anIntArray2379[i_4_] = (class98_sub22.readUnsignedByte());
														if ((this.anIntArray2379[i_4_]) == 255)
															this.anIntArray2379[i_4_] = -1;
													}
												} else if (i == 29)
													this.anInt2398 = (class98_sub22.readUnsignedByte());
												else if (i != 30) {
													if (i == 31)
														this.anInt2390 = (class98_sub22.readUnsignedByte());
													else if (i != 32) {
														if (i == 33)
															this.anInt2393 = (class98_sub22.readUShort(false));
														else if (i != 34) {
															if (i != 35) {
																if (i != 36) {
																	if (i == 37)
																		this.anInt2401 = class98_sub22.readUnsignedByte();
																	else if (i == 38)
																		this.anInt2376 = class98_sub22.readShort();
																	else if (i != 39) {
																		if (i != 40) {
																			if (i != 41) {
																				if (i != 42) {
																					if (i != 43) {
																						if (i == 44)
																							this.anInt2374 = class98_sub22.readShort();
																						else if (i == 45)
																							this.anInt2385 = class98_sub22.readShort();
																						else if (i != 46) {
																							if (i != 47) {
																								if (i == 48)
																									this.anInt2384 = class98_sub22.readShort();
																								else if (i == 49)
																									this.anInt2370 = class98_sub22.readShort();
																								else if (i == 50)
																									this.anInt2378 = class98_sub22.readShort();
																								else if (i != 51) {
																									if (i != 52) {
																										if (i == 53)
																											this.aBoolean2400 = false;
																										else if (i == 54) {
																											this.anInt2360 = class98_sub22.readUnsignedByte() << 6;
																											this.anInt2391 = class98_sub22.readUnsignedByte() << 6;
																										} else if (i == 55) {
																											if (this.anIntArray2373 == null)
																												this.anIntArray2373 = new int[12];
																											int i_5_ = class98_sub22.readUnsignedByte();
																											this.anIntArray2373[i_5_] = class98_sub22.readShort();
																										} else if (i == 56) {
																											if (this.anIntArrayArray2364 == null)
																												this.anIntArrayArray2364 = new int[12][];
																											int i_6_ = class98_sub22.readUnsignedByte();
																											this.anIntArrayArray2364[i_6_] = new int[3];
																											for (int i_7_ = 0; i_7_ < 3; i_7_++)
																												this.anIntArrayArray2364[i_6_][i_7_] = class98_sub22.readUShort(false);
																										}
																									} else {
																										int i_8_ = class98_sub22.readUnsignedByte();
																										this.anIntArray2395 = new int[i_8_];
																										this.anIntArray2386 = new int[i_8_];
																										for (int i_9_ = 0; i_8_ > i_9_; i_9_++) {
																											this.anIntArray2395[i_9_] = class98_sub22.readShort();
																											int i_10_ = class98_sub22.readUnsignedByte();
																											this.anIntArray2386[i_9_] = i_10_;
																											anInt2367 += i_10_;
																										}
																									}
																								} else
																									this.anInt2369 = class98_sub22.readShort();
																							} else
																								this.anInt2404 = class98_sub22.readShort();
																						} else
																							this.anInt2405 = class98_sub22.readShort();
																					} else
																						this.anInt2381 = class98_sub22.readShort();
																				} else
																					this.anInt2372 = class98_sub22.readShort();
																			} else
																				this.anInt2359 = class98_sub22.readShort();
																		} else
																			this.anInt2365 = class98_sub22.readShort();
																	} else
																		this.anInt2388 = class98_sub22.readShort();
																} else
																	this.anInt2363 = (class98_sub22.readUShort(false));
															} else
																this.anInt2380 = (class98_sub22.readShort());
														} else
															this.anInt2375 = (class98_sub22.readUnsignedByte());
													} else
														this.anInt2392 = (class98_sub22.readShort());
												} else
													this.anInt2383 = (class98_sub22.readShort());
											} else
												this.anInt2402 = (class98_sub22.readShort());
										} else
											this.anInt2357 = class98_sub22.readShort();
									} else
										this.anInt2403 = class98_sub22.readShort();
								} else
									this.anInt2377 = class98_sub22.readShort();
							} else
								this.anInt2394 = class98_sub22.readShort();
						} else
							this.anInt2368 = class98_sub22.readShort();
					} else {
						this.anInt2396 = class98_sub22.readShort();
						this.anInt2399 = class98_sub22.readShort();
						if (this.anInt2396 == 65535)
							this.anInt2396 = -1;
						if (this.anInt2399 != 65535)
							break;
						this.anInt2399 = -1;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sc.H(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3477(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			if ((Class281.tileSettings[0][i_12_][i] & 0x2) != 0)
				return true;
			if ((Class281.tileSettings[i_11_][i_12_][i] & 0x10) != 0)
				return false;
			if (Class98_Sub31_Sub4.method1390(i, i_11_, i_12_, -8941) == i_13_)
				return true;
			int i_15_ = -61 % ((2 - i_14_) / 49);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sc.B(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final int method3478(int i) {
		try {
			if (this.anInt2396 != -1)
				return this.anInt2396;
			int i_16_ = 79 % ((i - -28) / 59);
			if (this.anIntArray2395 != null) {
				int i_17_ = (int) (Math.random() * (double) anInt2367);
				int i_18_;
				for (i_18_ = 0; this.anIntArray2386[i_18_] <= i_17_; i_18_++)
					i_17_ -= this.anIntArray2386[i_18_];
				return this.anIntArray2395[i_18_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sc.D(" + i + ')');
		}
	}

	static final void method3479(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		try {
			Class36[] class36s = Class104.aClass36Array903;
			int i_25_ = 0;
			if (i_20_ == -7957) {
				for (/**/; i_25_ < class36s.length; i_25_++) {
					Class36 class36 = class36s[i_25_];
					if (class36 != null && class36.anInt346 == 2) {
						Class42_Sub1.method385(i_24_, class36.anInt342, class36.anInt338, i_20_ + 7956, i, 2 * (class36.anInt343), class36.anInt347, i_21_ >> 1, i_19_ >> 1);
						if (Class259.anIntArray1957[0] > -1 && Class215.anInt1614 % 20 < 10) {
							Class332 class332 = (Class306.aClass332Array2557[class36.anInt341]);
							int i_26_ = -12 + (Class259.anIntArray1957[0] + i_22_);
							int i_27_ = -28 + (i_23_ + Class259.anIntArray1957[1]);
							class332.method3735(i_26_, i_27_);
							Class93_Sub1_Sub1.method908(i_27_ - -class332.method3749(), i_27_, false, i_26_, i_26_ - -class332.method3737());
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sc.E(" + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}

	final boolean method3480(byte i, int i_28_) {
		try {
			int i_29_ = -87 / ((24 - i) / 53);
			if (i_28_ == -1)
				return false;
			if (i_28_ == this.anInt2396)
				return true;
			if (this.anIntArray2395 != null) {
				for (int i_30_ = 0; this.anIntArray2395.length > i_30_; i_30_++) {
					if (i_28_ == this.anIntArray2395[i_30_])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sc.G(" + i + ',' + i_28_ + ')');
		}
	}

	final Class111[] method3481(ha var_ha, byte i) {
		try {
			if (aClass111Array2387 != null && var_ha.anInt937 == anInt2358)
				return aClass111Array2387;
			if (this.anIntArrayArray2366 == null)
				return null;
			int i_31_ = -6 / ((i - -9) / 32);
			aClass111Array2387 = new Class111[this.anIntArrayArray2366.length];
			for (int i_32_ = 0; (i_32_ < this.anIntArrayArray2366.length); i_32_++) {
				int i_33_ = 0;
				int i_34_ = 0;
				int i_35_ = 0;
				int i_36_ = 0;
				int i_37_ = 0;
				int i_38_ = 0;
				if (this.anIntArrayArray2366[i_32_] != null) {
					i_36_ = (this.anIntArrayArray2366[i_32_][3] << 3);
					i_35_ = this.anIntArrayArray2366[i_32_][2];
					i_38_ = (this.anIntArrayArray2366[i_32_][5] << 3);
					i_37_ = (this.anIntArrayArray2366[i_32_][4] << 3);
					i_34_ = this.anIntArrayArray2366[i_32_][1];
					i_33_ = this.anIntArrayArray2366[i_32_][0];
				}
				if (i_33_ != 0 || i_34_ != 0 || i_35_ != 0 || i_36_ != 0 || i_37_ != 0 || i_38_ != 0) {
					Class111 class111 = aClass111Array2387[i_32_] = var_ha.method1821();
					if (i_38_ != 0)
						class111.method2090(i_38_);
					if (i_36_ != 0)
						class111.method2105(i_36_);
					if (i_37_ != 0)
						class111.method2097(i_37_);
					class111.method2106(i_33_, i_34_, i_35_);
				}
			}
			return aClass111Array2387;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sc.C(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3482(int i) {
		try {
			if (i == -10494) {
				anIntArray2408 = null;
				aClass377_2397 = null;
				anIntArray2406 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sc.A(" + i + ')');
		}
	}

	public RenderAnimDefinitions() {
		this.anInt2359 = -1;
		this.anInt2362 = 0;
		this.anInt2368 = -1;
		this.anInt2370 = -1;
		this.anInt2357 = -1;
		this.anInt2380 = 0;
		this.anInt2360 = 0;
		this.anInt2374 = -1;
		this.anInt2372 = -1;
		this.anIntArray2386 = null;
		this.anInt2376 = -1;
		this.anInt2378 = -1;
		this.anInt2382 = 0;
		this.anInt2375 = 0;
		this.anInt2369 = -1;
		this.anInt2383 = 0;
		anInt2367 = 0;
		this.anInt2381 = -1;
		this.anInt2377 = -1;
		this.anInt2363 = 0;
		this.anInt2384 = -1;
		this.anInt2365 = -1;
		this.anInt2388 = -1;
		this.anInt2389 = -1;
		this.anInt2396 = -1;
		this.anInt2385 = -1;
		this.anInt2391 = 0;
		this.anInt2393 = 0;
		this.anInt2394 = -1;
		this.anInt2390 = 0;
		this.anInt2399 = -1;
		this.anIntArray2395 = null;
		this.anInt2392 = 0;
		this.anInt2398 = 0;
		this.anInt2401 = -1;
		this.anInt2404 = -1;
		this.aBoolean2400 = true;
		this.anInt2403 = -1;
		this.anInt2405 = -1;
		this.anInt2402 = -1;
	}
}
