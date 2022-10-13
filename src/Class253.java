/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class253 implements Runnable {
	static int[] anIntArray1928 = { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
	static int anInt1929;
	static boolean aBoolean1930;
	static int[] anIntArray1931 = new int[8];
	static RuneScapeCache aClass207_1932;
	private Class215 aClass215_1933 = new Class215();
	static int anInt1934;
	int anInt1935;
	private boolean aBoolean1936 = false;
	private Thread aThread1937;

	static final boolean method3175(int i, int i_0_, Class172[][][] class172s, int i_1_, byte i_2_, boolean bool) {
		try {
			byte i_3_ = bool ? (byte) 1 : (byte) (Class64_Sub15.anInt3676 & 0xff);
			if ((OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i][i_1_]) == i_3_)
				return false;
			if ((0x4 & (Class281.tileSettings[Class43.anInt377][i][i_1_])) == 0)
				return false;
			if (i_2_ != -76)
				method3180(-52, -17, -126, null, false);
			int i_4_ = 0;
			int i_5_ = 0;
			Class213.anIntArray1610[i_4_] = i;
			Class69.anIntArray3220[i_4_++] = i_1_;
			OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i][i_1_] = i_3_;
			while ((i_4_ ^ 0xffffffff) != (i_5_ ^ 0xffffffff)) {
				int i_6_ = Class213.anIntArray1610[i_5_] & 0xffff;
				int i_7_ = Class213.anIntArray1610[i_5_] >> 72865712 & 0xff;
				int i_8_ = Class213.anIntArray1610[i_5_] >> 1855655704 & 0xff;
				int i_9_ = 0xffff & Class69.anIntArray3220[i_5_];
				int i_10_ = (Class69.anIntArray3220[i_5_] & 0xff7a19) >> -1279562416;
				i_5_ = 1 + i_5_ & 0xfff;
				boolean bool_11_ = false;
				if ((0x4 & (Class281.tileSettings[Class43.anInt377][i_6_][i_9_])) == 0)
					bool_11_ = true;
				boolean bool_12_ = false;
				if (class172s != null) {
					int i_13_ = Class43.anInt377 + 1;
					while_160_: for (/**/; (i_13_ ^ 0xffffffff) >= -4; i_13_++) {
						if (class172s[i_13_] != null && (0x8 & (Class281.tileSettings[i_13_][i_6_][i_9_]) ^ 0xffffffff) == -1) {
							if (bool_11_ && class172s[i_13_][i_6_][i_9_] != null) {
								if ((((Class172) class172s[i_13_][i_6_][i_9_]).aClass246_Sub3_Sub3_1324) != null) {
									int i_14_ = Class64_Sub2.method561((byte) -95, i_7_);
									if ((((Class246_Sub3_Sub3) (((Class172) class172s[i_13_][i_6_][i_9_]).aClass246_Sub3_Sub3_1324)).aShort6153) == i_14_ || ((((Class172) class172s[i_13_][i_6_][i_9_]).aClass246_Sub3_Sub3_1333) != null && (i_14_ == (((Class246_Sub3_Sub3) (((Class172) (class172s[i_13_][i_6_][i_9_])).aClass246_Sub3_Sub3_1333)).aShort6153))))
										continue;
									if ((i_8_ ^ 0xffffffff) != -1) {
										int i_15_ = Class64_Sub2.method561((byte) -95, i_8_);
										if (((i_15_ ^ 0xffffffff) == ((((Class246_Sub3_Sub3) (((Class172) (class172s[i_13_][i_6_][i_9_])).aClass246_Sub3_Sub3_1324)).aShort6153) ^ 0xffffffff)) || (((((Class172) (class172s[i_13_][i_6_][i_9_])).aClass246_Sub3_Sub3_1333) != null) && (((((Class246_Sub3_Sub3) (((Class172) (class172s[i_13_][i_6_][i_9_])).aClass246_Sub3_Sub3_1333)).aShort6153) ^ 0xffffffff) == (i_15_ ^ 0xffffffff))))
											continue;
									}
									if (i_10_ != 0) {
										int i_16_ = (Class64_Sub2.method561((byte) -95, i_10_));
										if ((i_16_ == (((Class246_Sub3_Sub3) (((Class172) (class172s[i_13_][i_6_][i_9_])).aClass246_Sub3_Sub3_1324)).aShort6153)) || (((((Class172) (class172s[i_13_][i_6_][i_9_])).aClass246_Sub3_Sub3_1333) != null) && ((i_16_ ^ 0xffffffff) == ((((Class246_Sub3_Sub3) (((Class172) (class172s[i_13_][i_6_][i_9_])).aClass246_Sub3_Sub3_1333)).aShort6153) ^ 0xffffffff))))
											continue;
									}
								}
								Class172 class172 = class172s[i_13_][i_6_][i_9_];
								if (((Class172) class172).aClass154_1325 != null) {
									for (Class154 class154 = (((Class172) class172).aClass154_1325); class154 != null; class154 = (((Class154) class154).aClass154_1233)) {
										Class246_Sub3_Sub4 class246_sub3_sub4 = (((Class154) class154).aClass246_Sub3_Sub4_1232);
										if (class246_sub3_sub4 instanceof Interface19) {
											Interface19 interface19 = ((Interface19) class246_sub3_sub4);
											int i_17_ = interface19.method63((byte) 20);
											int i_18_ = interface19.method66(i_2_ + 4733);
											if ((i_17_ ^ 0xffffffff) == -22)
												i_17_ = 19;
											int i_19_ = i_17_ | i_18_ << 1030705638;
											if (i_7_ == i_19_ || ((i_8_ ^ 0xffffffff) != -1 && ((i_19_ ^ 0xffffffff) == (i_8_ ^ 0xffffffff))) || ((i_10_ ^ 0xffffffff) != -1 && ((i_19_ ^ 0xffffffff) == (i_10_ ^ 0xffffffff))))
												continue while_160_;
										}
									}
								}
							}
							Class172 class172 = class172s[i_13_][i_6_][i_9_];
							if (class172 != null && (((Class172) class172).aClass154_1325 != null)) {
								for (Class154 class154 = (((Class172) class172).aClass154_1325); class154 != null; class154 = (((Class154) class154).aClass154_1233)) {
									Class246_Sub3_Sub4 class246_sub3_sub4 = (((Class154) class154).aClass246_Sub3_Sub4_1232);
									if ((((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158 != ((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6160) || ((((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6159 ^ 0xffffffff) != (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157 ^ 0xffffffff))) {
										for (int i_20_ = (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158); ((((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6160 ^ 0xffffffff) <= (i_20_ ^ 0xffffffff)); i_20_++) {
											for (int i_21_ = (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157); ((i_21_ ^ 0xffffffff) >= ((((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6159) ^ 0xffffffff)); i_21_++)
												OutputStream_Sub2.aByteArrayArrayArray41[i_13_][i_20_][i_21_] = i_3_;
										}
									}
								}
							}
							OutputStream_Sub2.aByteArrayArrayArray41[i_13_][i_6_][i_9_] = i_3_;
							bool_12_ = true;
						}
					}
				}
				if (bool_12_) {
					int i_22_ = Class78.activeTileHeightMap[Class43.anInt377 + 1].method3420(i_9_, -12639, i_6_);
					if ((Class204.anIntArray1551[i_0_] ^ 0xffffffff) > (i_22_ ^ 0xffffffff))
						Class204.anIntArray1551[i_0_] = i_22_;
					int i_23_ = i_6_ << -999054935;
					int i_24_ = i_9_ << -405497975;
					if ((Class336.anIntArray2826[i_0_] ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)) {
						if (i_23_ > Class287.anIntArray2195[i_0_])
							Class287.anIntArray2195[i_0_] = i_23_;
					} else
						Class336.anIntArray2826[i_0_] = i_23_;
					if (IncomingMessages.anIntArray5518[i_0_] > i_24_)
						IncomingMessages.anIntArray5518[i_0_] = i_24_;
					else if (Class295.anIntArray2409[i_0_] < i_24_)
						Class295.anIntArray2409[i_0_] = i_24_;
				}
				if (!bool_11_) {
					if (i_6_ >= 1 && (OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_ + -1][i_9_]) != i_3_) {
						Class213.anIntArray1610[i_4_] = Class41.method366(-754974720, Class41.method366(i_6_ - 1, 1179648));
						Class69.anIntArray3220[i_4_] = Class41.method366(1245184, i_9_);
						i_4_ = 0xfff & i_4_ + 1;
						OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][-1 + i_6_][i_9_] = i_3_;
					}
					if ((++i_9_ ^ 0xffffffff) > (GameWorld.size_y ^ 0xffffffff)) {
						if (i_6_ - 1 >= 0 && i_3_ != (OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_ - 1][i_9_]) && ((Class281.tileSettings[Class43.anInt377][i_6_][i_9_]) & 0x4 ^ 0xffffffff) == -1 && (0x4 & (Class281.tileSettings[Class43.anInt377][i_6_ + -1][i_9_ + -1])) == 0) {
							Class213.anIntArray1610[i_4_] = Class41.method366(Class41.method366(1179648, (i_6_ - 1)), 1375731712);
							Class69.anIntArray3220[i_4_] = Class41.method366(i_9_, 1245184);
							OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][-1 + i_6_][i_9_] = i_3_;
							i_4_ = 0xfff & i_4_ + 1;
						}
						if (((OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_][i_9_]) ^ 0xffffffff) != (i_3_ ^ 0xffffffff)) {
							Class213.anIntArray1610[i_4_] = Class41.method366(Class41.method366(5373952, i_6_), 318767104);
							Class69.anIntArray3220[i_4_] = Class41.method366(5439488, i_9_);
							OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_][i_9_] = i_3_;
							i_4_ = 0xfff & i_4_ - -1;
						}
						if (GameWorld.size_x > i_6_ - -1 && i_3_ != (OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][1 + i_6_][i_9_]) && ((Class281.tileSettings[Class43.anInt377][i_6_][i_9_]) & 0x4 ^ 0xffffffff) == -1 && (0x4 & (Class281.tileSettings[Class43.anInt377][i_6_ - -1][-1 + i_9_])) == 0) {
							Class213.anIntArray1610[i_4_] = Class41.method366(Class41.method366(1 + i_6_, 5373952), -1845493760);
							Class69.anIntArray3220[i_4_] = Class41.method366(5439488, i_9_);
							OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][1 + i_6_][i_9_] = i_3_;
							i_4_ = 1 + i_4_ & 0xfff;
						}
					}
					i_9_--;
					if (i_6_ + 1 < GameWorld.size_x && ((OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][1 + i_6_][i_9_]) ^ 0xffffffff) != (i_3_ ^ 0xffffffff)) {
						Class213.anIntArray1610[i_4_] = Class41.method366(Class41.method366(1 + i_6_, 9568256), 1392508928);
						Class69.anIntArray3220[i_4_] = Class41.method366(9633792, i_9_);
						i_4_ = 0xfff & 1 + i_4_;
						OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_ + 1][i_9_] = i_3_;
					}
					if ((--i_9_ ^ 0xffffffff) <= -1) {
						if ((-1 + i_6_ ^ 0xffffffff) <= -1 && ((OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][-1 + i_6_][i_9_]) ^ 0xffffffff) != (i_3_ ^ 0xffffffff) && ((Class281.tileSettings[Class43.anInt377][i_6_][i_9_]) & 0x4) == 0 && (0x4 & (Class281.tileSettings[Class43.anInt377][-1 + i_6_][i_9_ - -1])) == 0) {
							Class213.anIntArray1610[i_4_] = (Class41.method366(Class41.method366(13762560, -1 + i_6_), 301989888));
							Class69.anIntArray3220[i_4_] = Class41.method366(13828096, i_9_);
							OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][-1 + i_6_][i_9_] = i_3_;
							i_4_ = 0xfff & 1 + i_4_;
						}
						if (((OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_][i_9_]) ^ 0xffffffff) != (i_3_ ^ 0xffffffff)) {
							Class213.anIntArray1610[i_4_] = (Class41.method366(Class41.method366(i_6_, 13762560), -1828716544));
							Class69.anIntArray3220[i_4_] = Class41.method366(13828096, i_9_);
							i_4_ = 0xfff & i_4_ + 1;
							OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_][i_9_] = i_3_;
						}
						if (1 + i_6_ < GameWorld.size_x && i_3_ != (OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][1 + i_6_][i_9_]) && ((Class281.tileSettings[Class43.anInt377][i_6_][i_9_]) & 0x4 ^ 0xffffffff) == -1 && ((Class281.tileSettings[Class43.anInt377][i_6_ + 1][1 + i_9_]) & 0x4 ^ 0xffffffff) == -1) {
							Class213.anIntArray1610[i_4_] = (Class41.method366(-771751936, Class41.method366(i_6_ + 1, 9568256)));
							Class69.anIntArray3220[i_4_] = Class41.method366(i_9_, 9633792);
							i_4_ = i_4_ - -1 & 0xfff;
							OutputStream_Sub2.aByteArrayArrayArray41[Class43.anInt377][i_6_ + 1][i_9_] = i_3_;
						}
					}
				}
			}
			if (Class204.anIntArray1551[i_0_] != -1000000) {
				Class204.anIntArray1551[i_0_] += 40;
				Class336.anIntArray2826[i_0_] -= 512;
				Class287.anIntArray2195[i_0_] += 512;
				Class295.anIntArray2409[i_0_] += 512;
				IncomingMessages.anIntArray5518[i_0_] -= 512;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pt.F(" + i + ',' + i_0_ + ',' + (class172s != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + bool + ')'));
		}
	}

	final Class98_Sub46_Sub13_Sub2 method3176(byte i, int i_25_, Class17 class17) {
		try {
			Class98_Sub46_Sub13_Sub2 class98_sub46_sub13_sub2 = new Class98_Sub46_Sub13_Sub2();
			((Class98_Sub46) class98_sub46_sub13_sub2).aLong4259 = (long) i_25_;
			((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).anInt6310 = 3;
			((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aClass17_6312 = class17;
			((Class98_Sub46_Sub13) class98_sub46_sub13_sub2).aBoolean6037 = false;
			int i_26_ = 124 % ((-1 - i) / 35);
			method3182(-12972, class98_sub46_sub13_sub2);
			return class98_sub46_sub13_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pt.I(" + i + ',' + i_25_ + ',' + (class17 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class246_Sub3_Sub1 method3177(int i, int i_27_, int i_28_) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_27_][i_28_];
		if (class172 == null || ((Class172) class172).aClass246_Sub3_Sub1_1332 == null)
			return null;
		return ((Class172) class172).aClass246_Sub3_Sub1_1332;
	}

	public static void method3178(byte i) {
		try {
			anIntArray1928 = null;
			if (i == 118) {
				anIntArray1931 = null;
				aClass207_1932 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pt.H(" + i + ')');
		}
	}

	final Class98_Sub46_Sub13_Sub2 method3179(byte[] is, byte i, Class17 class17, int i_29_) {
		try {
			if (i <= 14)
				return null;
			Class98_Sub46_Sub13_Sub2 class98_sub46_sub13_sub2 = new Class98_Sub46_Sub13_Sub2();
			((Class98_Sub46) class98_sub46_sub13_sub2).aLong4259 = (long) i_29_;
			((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aClass17_6312 = class17;
			((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aByteArray6313 = is;
			((Class98_Sub46_Sub13) class98_sub46_sub13_sub2).aBoolean6037 = false;
			((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).anInt6310 = 2;
			method3182(-12972, class98_sub46_sub13_sub2);
			return class98_sub46_sub13_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pt.D(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_29_ + ')'));
		}
	}

	static final void method3180(int i, int i_30_, int i_31_, GameInterfaceData class293, boolean bool) {
		do {
			try {
				int i_32_ = ((GameInterfaceData) class293).anInt2311;
				if ((((GameInterfaceData) class293).aByte2243 ^ 0xffffffff) != -1) {
					if (((GameInterfaceData) class293).aByte2243 != 1) {
						if ((((GameInterfaceData) class293).aByte2243 ^ 0xffffffff) == -3)
							((GameInterfaceData) class293).anInt2311 = (i_30_ * ((GameInterfaceData) class293).anInt2235 >> 564972174);
					} else
						((GameInterfaceData) class293).anInt2311 = i_30_ + -((GameInterfaceData) class293).anInt2235;
				} else
					((GameInterfaceData) class293).anInt2311 = ((GameInterfaceData) class293).anInt2235;
				int i_33_ = ((GameInterfaceData) class293).anInt2258;
				if (((GameInterfaceData) class293).aByte2207 == 0)
					((GameInterfaceData) class293).anInt2258 = ((GameInterfaceData) class293).anInt2242;
				else if (((GameInterfaceData) class293).aByte2207 != 1) {
					if ((((GameInterfaceData) class293).aByte2207 ^ 0xffffffff) == -3)
						((GameInterfaceData) class293).anInt2258 = i * ((GameInterfaceData) class293).anInt2242 >> 221623758;
				} else
					((GameInterfaceData) class293).anInt2258 = i - ((GameInterfaceData) class293).anInt2242;
				if ((((GameInterfaceData) class293).aByte2243 ^ 0xffffffff) == -5)
					((GameInterfaceData) class293).anInt2311 = (((GameInterfaceData) class293).anInt2321 * ((GameInterfaceData) class293).anInt2258 / ((GameInterfaceData) class293).anInt2338);
				if (((GameInterfaceData) class293).aByte2207 == 4)
					((GameInterfaceData) class293).anInt2258 = (((GameInterfaceData) class293).anInt2311 * ((GameInterfaceData) class293).anInt2338 / ((GameInterfaceData) class293).anInt2321);
				if (Class15.aBoolean169 && ((((IComponentSettings) client.getClickMask(class293)).optionMask != 0) || ((GameInterfaceData) class293).type == 0)) {
					if (((GameInterfaceData) class293).anInt2258 >= 5 || ((((GameInterfaceData) class293).anInt2311 ^ 0xffffffff) <= -6)) {
						if (((GameInterfaceData) class293).anInt2258 <= 0)
							((GameInterfaceData) class293).anInt2258 = 5;
						if (((GameInterfaceData) class293).anInt2311 <= 0)
							((GameInterfaceData) class293).anInt2311 = 5;
					} else {
						((GameInterfaceData) class293).anInt2311 = 5;
						((GameInterfaceData) class293).anInt2258 = 5;
					}
				}
				if (Class22.anInt218 == ((GameInterfaceData) class293).contentType)
					Class98_Sub32.aClass293_4107 = class293;
				if (bool && ((GameInterfaceData) class293).anObjectArray2266 != null && (((GameInterfaceData) class293).anInt2311 != i_32_ || ((((GameInterfaceData) class293).anInt2258 ^ 0xffffffff) != (i_33_ ^ 0xffffffff)))) {
					ClientScript2Event class98_sub21 = new ClientScript2Event();
					((ClientScript2Event) class98_sub21).component = class293;
					((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) class293).anObjectArray2266;
					Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
				}
				if (i_31_ == 1375731712)
					break;
				anInt1934 = -87;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pt.G(" + i + ',' + i_30_ + ',' + i_31_ + ',' + (class293 != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	static final void method3181(RuneScapeCache class207, int i) {
		do {
			try {
				ha_Sub3.aClass207_4528 = class207;
				if (i == -1)
					break;
				anInt1929 = 127;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pt.B(" + (class207 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method3182(int i, Class98_Sub46_Sub13_Sub2 class98_sub46_sub13_sub2) {
		try {
			synchronized (aClass215_1933) {
				aClass215_1933.method2785(class98_sub46_sub13_sub2, -108);
				((Class253) this).anInt1935++;
				aClass215_1933.notifyAll();
				if (i != -12972)
					anIntArray1931 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pt.C(" + i + ',' + (class98_sub46_sub13_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void run() {
		try {
			while (!aBoolean1936) {
				Class98_Sub46_Sub13_Sub2 class98_sub46_sub13_sub2;
				synchronized (aClass215_1933) {
					class98_sub46_sub13_sub2 = ((Class98_Sub46_Sub13_Sub2) aClass215_1933.method2789(-16711936));
					if (class98_sub46_sub13_sub2 != null)
						((Class253) this).anInt1935--;
					else {
						try {
							aClass215_1933.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					if (((((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).anInt6310) ^ 0xffffffff) != -3) {
						if (((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).anInt6310 == 3)
							((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aByteArray6313 = (((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aClass17_6312.method240((int) ((Class98_Sub46) class98_sub46_sub13_sub2).aLong4259, false));
					} else
						((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aClass17_6312.method245(false, ((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aByteArray6313.length, (int) (((Class98_Sub46) class98_sub46_sub13_sub2).aLong4259), ((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aByteArray6313);
				} catch (Exception exception) {
					Map.method3585(exception, -123, null);
				}
				((Class98_Sub46_Sub13) class98_sub46_sub13_sub2).aBoolean6038 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pt.run(" + ')');
		}
	}

	final void method3183(byte i) {
		try {
			if (i >= -61)
				method3178((byte) -60);
			aBoolean1936 = true;
			synchronized (aClass215_1933) {
				aClass215_1933.notifyAll();
			}
			try {
				aThread1937.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread1937 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pt.A(" + i + ')');
		}
	}

	final Class98_Sub46_Sub13_Sub2 method3184(int i, Class17 class17, int i_34_) {
		try {
			Class98_Sub46_Sub13_Sub2 class98_sub46_sub13_sub2 = new Class98_Sub46_Sub13_Sub2();
			((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).anInt6310 = i;
			synchronized (aClass215_1933) {
				for (Class98_Sub46_Sub13_Sub2 class98_sub46_sub13_sub2_35_ = ((Class98_Sub46_Sub13_Sub2) aClass215_1933.method2792(-1)); class98_sub46_sub13_sub2_35_ != null; class98_sub46_sub13_sub2_35_ = ((Class98_Sub46_Sub13_Sub2) aClass215_1933.method2787(0))) {
					if ((((long) i_34_ ^ 0xffffffffffffffffL) == ((((Class98_Sub46) class98_sub46_sub13_sub2_35_).aLong4259) ^ 0xffffffffffffffffL)) && class17 == (((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2_35_).aClass17_6312) && (((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2_35_).anInt6310 ^ 0xffffffff) == -3) {
						((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aByteArray6313 = ((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2_35_).aByteArray6313;
						((Class98_Sub46_Sub13) class98_sub46_sub13_sub2).aBoolean6038 = false;
						return class98_sub46_sub13_sub2;
					}
				}
			}
			((Class98_Sub46_Sub13_Sub2) class98_sub46_sub13_sub2).aByteArray6313 = class17.method240(i_34_, false);
			((Class98_Sub46_Sub13) class98_sub46_sub13_sub2).aBoolean6038 = false;
			((Class98_Sub46_Sub13) class98_sub46_sub13_sub2).aBoolean6037 = true;
			return class98_sub46_sub13_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pt.E(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_34_ + ')'));
		}
	}

	Class253(Class88 class88) {
		((Class253) this).anInt1935 = 0;
		try {
			Class143 class143 = class88.method858(5, this, 1);
			while (class143.anInt1163 == 0)
				Class246_Sub7.method3131(0, 10L);
			if ((class143.anInt1163 ^ 0xffffffff) == -3)
				throw new RuntimeException();
			aThread1937 = (Thread) class143.anObject1162;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pt.<init>(" + (class88 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		anInt1929 = 1;
		aBoolean1930 = false;
	}
}
