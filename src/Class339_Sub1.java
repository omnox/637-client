/* Class339_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class339_Sub1 extends Class339 {
	private Class98_Sub46_Sub13 aClass98_Sub46_Sub13_5306;
	private Class377 aClass377_5307;
	static Class326 aClass326_5308;
	private int anInt5309;
	private int anInt5310;
	private int anInt5311 = 0;
	private Class253 aClass253_5312;
	private Class312 aClass312_5313;
	private Class17 aClass17_5314;
	static Class326 aClass326_5315;
	static float aFloat5316;
	private byte[] aByteArray5317;
	private Class135 aClass135_5318;
	private byte[] aByteArray5319;
	private Class17 aClass17_5320;
	private int anInt5321;
	private LinkedList aClass148_5322;
	private int anInt5323;
	private boolean aBoolean5324;
	private LinkedList aClass148_5325;
	private boolean aBoolean5326;
	private long aLong5327;
	private boolean aBoolean5328;

	final int method3791(byte i) {
		try {
			if (i > -33)
				return 42;
			if (aClass312_5313 == null)
				return 0;
			if (!aBoolean5324)
				return ((Class312) aClass312_5313).anInt2665;
			Node class98 = aClass148_5322.method2418(32);
			if (class98 == null)
				return 0;
			return (int) ((Node) class98).uid;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.R(" + i + ')');
		}
	}

	private final Class98_Sub46_Sub13 method3792(int i, int i_0_, int i_1_) {
		try {
			Class98_Sub46_Sub13 class98_sub46_sub13 = ((Class98_Sub46_Sub13) aClass377_5307.method3990((long) i_0_, i ^ 0x1));
			if (class98_sub46_sub13 != null && (i_1_ ^ 0xffffffff) == -1 && !((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6037 && ((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6038) {
				class98_sub46_sub13.remove();
				class98_sub46_sub13 = null;
			}
			if (class98_sub46_sub13 == null) {
				if ((i_1_ ^ 0xffffffff) == -1) {
					if (aClass17_5314 != null && aByteArray5317[i_0_] != -1)
						class98_sub46_sub13 = aClass253_5312.method3184(1, aClass17_5314, i_0_);
					else {
						if (aClass135_5318.method2253(69))
							return null;
						class98_sub46_sub13 = aClass135_5318.method2252(anInt5310, (byte) 2, i_0_, 119, true);
					}
				} else if (i_1_ != 1) {
					if (i_1_ != 2)
						throw new RuntimeException();
					if (aClass17_5314 == null)
						throw new RuntimeException();
					if (aByteArray5317[i_0_] != -1)
						throw new RuntimeException();
					if (aClass135_5318.method2263(20))
						return null;
					class98_sub46_sub13 = aClass135_5318.method2252(anInt5310, (byte) 2, i_0_, 108, false);
				} else {
					if (aClass17_5314 == null)
						throw new RuntimeException();
					class98_sub46_sub13 = aClass253_5312.method3176((byte) -38, i_0_, aClass17_5314);
				}
				aClass377_5307.method3996(class98_sub46_sub13, (long) i_0_, -1);
			}
			if (((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6038)
				return null;
			byte[] is = class98_sub46_sub13.method1591(90);
			if (i != -2)
				method3784((byte) -125);
			if (class98_sub46_sub13 instanceof Class98_Sub46_Sub13_Sub2) {
				try {
					if (is == null || (is.length ^ 0xffffffff) >= -3)
						throw new RuntimeException();
					Class279.aCRC32_2097.reset();
					Class279.aCRC32_2097.update(is, 0, -2 + is.length);
					int i_2_ = (int) Class279.aCRC32_2097.getValue();
					if ((i_2_ ^ 0xffffffff) != (((Class312) aClass312_5313).anIntArray2673[i_0_] ^ 0xffffffff))
						throw new RuntimeException();
					if (((Class312) aClass312_5313).aByteArrayArray2675 != null && (((Class312) aClass312_5313).aByteArrayArray2675[i_0_]) != null) {
						byte[] is_3_ = (((Class312) aClass312_5313).aByteArrayArray2675[i_0_]);
						byte[] is_4_ = Class64_Sub11.method595(0, (byte) -122, is, -2 + is.length);
						for (int i_5_ = 0; i_5_ < 64; i_5_++) {
							if (is_4_[i_5_] != is_3_[i_5_])
								throw new RuntimeException();
						}
					}
					int i_6_ = (((0xff & is[-2 + is.length]) << 1865901960) - -(0xff & is[is.length - 1]));
					if ((i_6_ ^ 0xffffffff) != (0xffff & (((Class312) aClass312_5313).anIntArray2667[i_0_]) ^ 0xffffffff))
						throw new RuntimeException();
					if ((aByteArray5317[i_0_] ^ 0xffffffff) != -2) {
						anInt5311++;
						aByteArray5317[i_0_] = (byte) 1;
					}
					if (!((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6037)
						class98_sub46_sub13.remove();
					return class98_sub46_sub13;
				} catch (Exception exception) {
					aByteArray5317[i_0_] = (byte) -1;
					class98_sub46_sub13.remove();
					if ((((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6037) && !aClass135_5318.method2253(100)) {
						Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1 = aClass135_5318.method2252(anInt5310, (byte) 2, i_0_, 122, true);
						aClass377_5307.method3996(class98_sub46_sub13_sub1, (long) i_0_, -1);
					}
					return null;
				}
			}
			try {
				if (is == null || (is.length ^ 0xffffffff) >= -3)
					throw new RuntimeException();
				Class279.aCRC32_2097.reset();
				Class279.aCRC32_2097.update(is, 0, is.length + -2);
				int i_7_ = (int) Class279.aCRC32_2097.getValue();
				if ((((Class312) aClass312_5313).anIntArray2673[i_0_] ^ 0xffffffff) != (i_7_ ^ 0xffffffff))
					throw new RuntimeException();
				if (((Class312) aClass312_5313).aByteArrayArray2675 != null && (((Class312) aClass312_5313).aByteArrayArray2675[i_0_] != null)) {
					byte[] is_8_ = (((Class312) aClass312_5313).aByteArrayArray2675[i_0_]);
					byte[] is_9_ = Class64_Sub11.method595(0, (byte) -124, is, -2 + is.length);
					for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -65; i_10_++) {
						if ((is_8_[i_10_] ^ 0xffffffff) != (is_9_[i_10_] ^ 0xffffffff))
							throw new RuntimeException();
					}
				}
				((Class135) aClass135_5318).anInt1065 = 0;
				((Class135) aClass135_5318).anInt1066 = 0;
			} catch (RuntimeException runtimeexception) {
				aClass135_5318.method2257(67);
				class98_sub46_sub13.remove();
				if (((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6037 && !aClass135_5318.method2253(88)) {
					Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1 = aClass135_5318.method2252(anInt5310, (byte) 2, i_0_, 127, true);
					aClass377_5307.method3996(class98_sub46_sub13_sub1, (long) i_0_, i ^ 0x1);
				}
				return null;
			}
			is[is.length - 2] = (byte) (((Class312) aClass312_5313).anIntArray2667[i_0_] >>> 969573768);
			is[-1 + is.length] = (byte) ((Class312) aClass312_5313).anIntArray2667[i_0_];
			if (aClass17_5314 != null) {
				aClass253_5312.method3179(is, (byte) 61, aClass17_5314, i_0_);
				if (aByteArray5317[i_0_] != 1) {
					anInt5311++;
					aByteArray5317[i_0_] = (byte) 1;
				}
			}
			if (!((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6037)
				class98_sub46_sub13.remove();
			return class98_sub46_sub13;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lw.O(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final byte[] method3786(int i, int i_11_) {
		try {
			Class98_Sub46_Sub13 class98_sub46_sub13 = method3792(i_11_ + -2, i, i_11_);
			if (class98_sub46_sub13 == null)
				return null;
			byte[] is = class98_sub46_sub13.method1591(i_11_ + 113);
			class98_sub46_sub13.remove();
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.A(" + i + ',' + i_11_ + ')');
		}
	}

	final Class312 method3784(byte i) {
		try {
			if (aClass312_5313 != null)
				return aClass312_5313;
			if (i > -102)
				method3800(-6);
			if (aClass98_Sub46_Sub13_5306 == null) {
				if (aClass135_5318.method2253(70))
					return null;
				aClass98_Sub46_Sub13_5306 = aClass135_5318.method2252(255, (byte) 0, anInt5310, 126, true);
			}
			if (((Class98_Sub46_Sub13) aClass98_Sub46_Sub13_5306).aBoolean6038)
				return null;
			byte[] is = aClass98_Sub46_Sub13_5306.method1591(25);
			if (!(aClass98_Sub46_Sub13_5306 instanceof Class98_Sub46_Sub13_Sub2)) {
				try {
					if (is == null)
						throw new RuntimeException();
					aClass312_5313 = new Class312(is, anInt5309, aByteArray5319);
				} catch (RuntimeException runtimeexception) {
					aClass135_5318.method2257(89);
					aClass312_5313 = null;
					if (aClass135_5318.method2253(92))
						aClass98_Sub46_Sub13_5306 = null;
					else
						aClass98_Sub46_Sub13_5306 = aClass135_5318.method2252(255, (byte) 0, anInt5310, 111, true);
					return null;
				}
				if (aClass17_5320 != null)
					aClass253_5312.method3179(is, (byte) 21, aClass17_5320, anInt5310);
			} else {
				try {
					if (is == null)
						throw new RuntimeException();
					aClass312_5313 = new Class312(is, anInt5309, aByteArray5319);
					if (anInt5321 != ((Class312) aClass312_5313).anInt2676)
						throw new RuntimeException();
				} catch (RuntimeException runtimeexception) {
					aClass312_5313 = null;
					if (aClass135_5318.method2253(51))
						aClass98_Sub46_Sub13_5306 = null;
					else
						aClass98_Sub46_Sub13_5306 = aClass135_5318.method2252(255, (byte) 0, anInt5310, 117, true);
					return null;
				}
			}
			aClass98_Sub46_Sub13_5306 = null;
			if (aClass17_5314 != null) {
				aByteArray5317 = new byte[((Class312) aClass312_5313).anInt2668];
				anInt5311 = 0;
			}
			return aClass312_5313;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.H(" + i + ')');
		}
	}

	final int method3790(int i, byte i_12_) {
		try {
			if (i_12_ >= -10)
				aClass326_5315 = null;
			Class98_Sub46_Sub13 class98_sub46_sub13 = ((Class98_Sub46_Sub13) aClass377_5307.method3990((long) i, -1));
			if (class98_sub46_sub13 != null)
				return class98_sub46_sub13.method1590(100);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.B(" + i + ',' + i_12_ + ')');
		}
	}

	final void method3793(int i) {
		do {
			try {
				int i_13_ = 125 / ((14 - i) / 54);
				if (aClass17_5314 != null) {
					aBoolean5326 = true;
					if (aClass148_5322 != null)
						break;
					aClass148_5322 = new LinkedList();
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "lw.L(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method3794(byte i) {
		try {
			if (i == -101) {
				aClass326_5308 = null;
				aClass326_5315 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.J(" + i + ')');
		}
	}

	final int method3795(int i) {
		try {
			if (i > -24)
				method3792(104, -12, -110);
			if (method3784((byte) -116) == null) {
				if (aClass98_Sub46_Sub13_5306 == null)
					return 0;
				return aClass98_Sub46_Sub13_5306.method1590(100);
			}
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.Q(" + i + ')');
		}
	}

	final void method3785(int i, boolean bool) {
		try {
			if (aClass17_5314 != null) {
				if (bool != false)
					method3793(51);
				for (Node class98 = aClass148_5325.method2418(32); class98 != null; class98 = aClass148_5325.method2417(97)) {
					if ((long) i == ((Node) class98).uid)
						return;
				}
				Node class98 = new Node();
				((Node) class98).uid = (long) i;
				aClass148_5325.add_last(class98, -20911);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.D(" + i + ',' + bool + ')');
		}
	}

	final void method3796(int i) {
		do {
			try {
				if (i == 7899) {
					if (aClass148_5322 != null) {
						if (method3784((byte) -128) == null)
							break;
						if (aBoolean5324) {
							boolean bool = true;
							for (Node class98 = aClass148_5322.method2418(32); class98 != null; class98 = aClass148_5322.method2417(123)) {
								int i_14_ = (int) ((Node) class98).uid;
								if ((aByteArray5317[i_14_] ^ 0xffffffff) == -1)
									method3792(-2, i_14_, 1);
								if ((aByteArray5317[i_14_] ^ 0xffffffff) != -1)
									class98.remove();
								else
									bool = false;
							}
							while (((((Class312) aClass312_5313).anIntArray2670).length ^ 0xffffffff) < (anInt5323 ^ 0xffffffff)) {
								if (((((Class312) aClass312_5313).anIntArray2670[anInt5323]) ^ 0xffffffff) == -1)
									anInt5323++;
								else {
									if ((((Class253) aClass253_5312).anInt1935 ^ 0xffffffff) <= -251) {
										bool = false;
										break;
									}
									if ((aByteArray5317[anInt5323] ^ 0xffffffff) == -1)
										method3792(-2, anInt5323, 1);
									if ((aByteArray5317[anInt5323] ^ 0xffffffff) == -1) {
										Node class98 = new Node();
										((Node) class98).uid = (long) anInt5323;
										bool = false;
										aClass148_5322.add_last(class98, -20911);
									}
									anInt5323++;
								}
							}
							if (bool) {
								anInt5323 = 0;
								aBoolean5324 = false;
							}
						} else if (!aBoolean5326)
							aClass148_5322 = null;
						else {
							boolean bool = true;
							for (Node class98 = aClass148_5322.method2418(32); class98 != null; class98 = aClass148_5322.method2417(112)) {
								int i_15_ = (int) ((Node) class98).uid;
								if ((aByteArray5317[i_15_] ^ 0xffffffff) != -2)
									method3792(-2, i_15_, 2);
								if (aByteArray5317[i_15_] == 1)
									class98.remove();
								else
									bool = false;
							}
							while (anInt5323 < (((Class312) aClass312_5313).anIntArray2670).length) {
								if (((((Class312) aClass312_5313).anIntArray2670[anInt5323]) ^ 0xffffffff) == -1)
									anInt5323++;
								else {
									if (aClass135_5318.method2263(i ^ 0x1ecf)) {
										bool = false;
										break;
									}
									if (aByteArray5317[anInt5323] != 1)
										method3792(-2, anInt5323, 2);
									if (aByteArray5317[anInt5323] != 1) {
										Node class98 = new Node();
										((Node) class98).uid = (long) anInt5323;
										aClass148_5322.add_last(class98, -20911);
										bool = false;
									}
									anInt5323++;
								}
							}
							if (bool) {
								anInt5323 = 0;
								aBoolean5326 = false;
							}
						}
					}
					if (!aBoolean5328 || ((aLong5327 ^ 0xffffffffffffffffL) < (Class343.method3819(-47) ^ 0xffffffffffffffffL)))
						break;
					for (Class98_Sub46_Sub13 class98_sub46_sub13 = ((Class98_Sub46_Sub13) aClass377_5307.start_iteration(122)); class98_sub46_sub13 != null; class98_sub46_sub13 = ((Class98_Sub46_Sub13) aClass377_5307.iterate_next(-1))) {
						if (!((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6038) {
							if (!((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6036)
								((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6036 = true;
							else {
								if (!((Class98_Sub46_Sub13) class98_sub46_sub13).aBoolean6037)
									throw new RuntimeException();
								class98_sub46_sub13.remove();
							}
						}
					}
					aLong5327 = Class343.method3819(-47) + 1000L;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "lw.N(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3797(int i) {
		try {
			if (aClass148_5322 != null && method3784((byte) -110) != null) {
				if (i != -1)
					method3790(29, (byte) -69);
				for (Node class98 = aClass148_5325.method2418(i + 33); class98 != null; class98 = aClass148_5325.method2417(117)) {
					int i_16_ = (int) ((Node) class98).uid;
					if ((i_16_ ^ 0xffffffff) > -1 || ((Class312) aClass312_5313).anInt2668 <= i_16_ || (((Class312) aClass312_5313).anIntArray2670[i_16_] == 0))
						class98.remove();
					else {
						if ((aByteArray5317[i_16_] ^ 0xffffffff) == -1)
							method3792(i + -1, i_16_, 1);
						if (aByteArray5317[i_16_] == -1)
							method3792(i ^ 0x1, i_16_, 2);
						if ((aByteArray5317[i_16_] ^ 0xffffffff) == -2)
							class98.remove();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.K(" + i + ')');
		}
	}

	final int method3798(int i) {
		try {
			if (i <= 35)
				return -57;
			return anInt5311;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.M(" + i + ')');
		}
	}

	static final void method3799(int i) {
		try {
			Class39_Sub1.anInt3594++;
			OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i + 260, Class98_Sub23.aClass171_3998, Class331.aClass117_2811);
			((OutgoingPacket) class98_sub11).packet.writeByte(i);
			Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.I(" + i + ')');
		}
	}

	final int method3800(int i) {
		try {
			if (i != 0)
				method3794((byte) 48);
			if (aClass312_5313 == null)
				return 0;
			return ((Class312) aClass312_5313).anInt2665;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lw.P(" + i + ')');
		}
	}

	Class339_Sub1(int i, Class17 class17, Class17 class17_17_, Class135 class135, Class253 class253, int i_18_, byte[] is, int i_19_, boolean bool) {
		aClass377_5307 = new Class377(16);
		anInt5323 = 0;
		aClass148_5325 = new LinkedList();
		aLong5327 = 0L;
		do {
			try {
				aClass17_5314 = class17;
				anInt5310 = i;
				do {
					if (aClass17_5314 != null) {
						aBoolean5324 = true;
						aClass148_5322 = new LinkedList();
						if (!client.aBoolean3553)
							break;
					}
					aBoolean5324 = false;
				} while (false);
				aClass135_5318 = class135;
				aClass17_5320 = class17_17_;
				aBoolean5328 = bool;
				anInt5309 = i_18_;
				aClass253_5312 = class253;
				anInt5321 = i_19_;
				aByteArray5319 = is;
				if (aClass17_5320 == null)
					break;
				aClass98_Sub46_Sub13_5306 = aClass253_5312.method3184(1, aClass17_5320, anInt5310);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lw.<init>(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + (class17_17_ != null ? "{...}" : "null") + ',' + (class135 != null ? "{...}" : "null") + ',' + (class253 != null ? "{...}" : "null") + ',' + i_18_ + ',' + (is != null ? "{...}" : "null") + ',' + i_19_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}
}
