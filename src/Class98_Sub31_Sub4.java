/* Class98_Sub31_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub31_Sub4 extends Class98_Sub31 {
	private int anInt5858;
	private LinkedList aClass148_5859 = new LinkedList();
	static int anInt5860;
	static int[] anIntArray5861 = { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
	private int anInt5862;
	private int anInt5863;
	private boolean aBoolean5864;
	private int anInt5865 = 256;
	private int anInt5866;
	private boolean aBoolean5867;

	final synchronized void method1379(int i) {
		try {
			if (i != 0)
				aBoolean5867 = false;
			aBoolean5867 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.R(" + i + ')');
		}
	}

	final synchronized void method1321(int i) {
		try {
			if (!aBoolean5864) {
				for (;;) {
					Class98_Sub46_Sub15 class98_sub46_sub15 = method1381(-95);
					if (class98_sub46_sub15 == null) {
						if (aBoolean5867) {
							this.remove();
							IComponentSettings.aClass100_4283.method1690(1);
						}
						break;
					}
					if (i < (-anInt5862 + (((Class98_Sub46_Sub15) class98_sub46_sub15).aShortArrayArray6040[0]).length)) {
						anInt5862 += i;
						break;
					}
					i -= (-anInt5862 + (((Class98_Sub46_Sub15) class98_sub46_sub15).aShortArrayArray6040[0]).length);
					method1388((byte) 100);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.M(" + i + ')');
		}
	}

	final synchronized void method1380(byte i, Class98_Sub46_Sub15 class98_sub46_sub15) {
		try {
			for (/**/; anInt5863 >= 100; anInt5863--)
				aClass148_5859.method2421(6494);
			if (i <= 10)
				method1383(null, null, -103, 19, -21, 97, 127, null);
			aClass148_5859.add_last(class98_sub46_sub15, -20911);
			anInt5863++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wb.P(" + i + ',' + (class98_sub46_sub15 != null ? "{...}" : "null") + ')'));
		}
	}

	private final synchronized Class98_Sub46_Sub15 method1381(int i) {
		try {
			if (i > -26)
				anInt5860 = 119;
			return (Class98_Sub46_Sub15) aClass148_5859.method2418(32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.N(" + i + ')');
		}
	}

	final synchronized double method1382(boolean bool) {
		try {
			if ((anInt5863 ^ 0xffffffff) > -2)
				return -1.0;
			if (bool != false)
				aBoolean5864 = true;
			Class98_Sub46_Sub15 class98_sub46_sub15 = (Class98_Sub46_Sub15) aClass148_5859.method2418(32);
			if (class98_sub46_sub15 == null)
				return -1.0;
			return (((Class98_Sub46_Sub15) class98_sub46_sub15).aDouble6042 - (double) ((float) (((Class98_Sub46_Sub15) class98_sub46_sub15).aShortArrayArray6040[0]).length / (float) Class64_Sub15.anInt3678));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.S(" + bool + ')');
		}
	}

	static final void method1383(Player class246_sub3_sub4_sub2_sub2, Class352 class352, int i, int i_0_, int i_1_, int i_2_, int i_3_, Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1) {
		try {
			if (i_1_ != 3)
				method1386(40);
			Class98_Sub42 class98_sub42 = new Class98_Sub42();
			((Class98_Sub42) class98_sub42).anInt4220 = i_3_;
			((Class98_Sub42) class98_sub42).anInt4225 = i_2_ << 988015593;
			((Class98_Sub42) class98_sub42).anInt4229 = i << -1906491031;
			if (class352 == null) {
				if (class246_sub3_sub4_sub2_sub1 != null) {
					((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209 = class246_sub3_sub4_sub2_sub1;
					Class141 class141 = (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504);
					if (((Class141) class141).anIntArray1109 != null) {
						((Class98_Sub42) class98_sub42).aBoolean4207 = true;
						class141 = class141.method2300(Class75.aClass140_584, (byte) 95);
					}
					if (class141 != null) {
						((Class98_Sub42) class98_sub42).anInt4224 = (i - -((Class141) class141).anInt1112 << -602009655);
						((Class98_Sub42) class98_sub42).anInt4216 = (i_2_ - -((Class141) class141).anInt1112 << 1128804969);
						((Class98_Sub42) class98_sub42).anInt4210 = (Class277.method3293(i_1_ + 119, class246_sub3_sub4_sub2_sub1));
						((Class98_Sub42) class98_sub42).anInt4236 = ((Class141) class141).anInt1156;
						((Class98_Sub42) class98_sub42).aBoolean4215 = ((Class141) class141).aBoolean1093;
						((Class98_Sub42) class98_sub42).anInt4228 = ((Class141) class141).anInt1128 << 46162057;
						((Class98_Sub42) class98_sub42).anInt4223 = ((Class141) class141).anInt1101;
						((Class98_Sub42) class98_sub42).anInt4217 = ((Class141) class141).anInt1125 << -1887902231;
						((Class98_Sub42) class98_sub42).anInt4237 = ((Class141) class141).anInt1090;
					}
					Class358.aClass148_3032.add_last(class98_sub42, -20911);
				} else if (class246_sub3_sub4_sub2_sub2 != null) {
					((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206 = class246_sub3_sub4_sub2_sub2;
					((Class98_Sub42) class98_sub42).anInt4224 = i - -class246_sub3_sub4_sub2_sub2.getSize() << 255186825;
					((Class98_Sub42) class98_sub42).anInt4216 = (i_2_ + class246_sub3_sub4_sub2_sub2.getSize() << -58758775);
					((Class98_Sub42) class98_sub42).anInt4210 = Class286.method3383(class246_sub3_sub4_sub2_sub2, true);
					((Class98_Sub42) class98_sub42).anInt4237 = 256;
					((Class98_Sub42) class98_sub42).anInt4228 = (((Player) class246_sub3_sub4_sub2_sub2).ambientSoundHearDistance << -78927831);
					((Class98_Sub42) class98_sub42).anInt4217 = 0;
					((Class98_Sub42) class98_sub42).aBoolean4215 = ((Player) class246_sub3_sub4_sub2_sub2).hasDisplayName;
					((Class98_Sub42) class98_sub42).anInt4223 = 256;
					((Class98_Sub42) class98_sub42).anInt4236 = ((Player) class246_sub3_sub4_sub2_sub2).anInt6514;
					Class98_Sub10_Sub14.aClass377_5612.method3996(class98_sub42, (long) ((Mobile) class246_sub3_sub4_sub2_sub2).anInt6369, -1);
				}
			} else {
				((Class98_Sub42) class98_sub42).aClass352_4233 = class352;
				int i_4_ = ((Class352) class352).sizeY;
				int i_5_ = ((Class352) class352).sizeX;
				if (i_0_ == 1 || (i_0_ ^ 0xffffffff) == -4) {
					i_5_ = ((Class352) class352).sizeY;
					i_4_ = ((Class352) class352).sizeX;
				}
				((Class98_Sub42) class98_sub42).anInt4205 = ((Class352) class352).anInt2972;
				((Class98_Sub42) class98_sub42).aBoolean4226 = ((Class352) class352).aBoolean2957;
				((Class98_Sub42) class98_sub42).anInt4219 = ((Class352) class352).anInt2949;
				((Class98_Sub42) class98_sub42).aBoolean4215 = ((Class352) class352).aBoolean2992;
				((Class98_Sub42) class98_sub42).anInt4217 = ((Class352) class352).anInt2970 << 1467122217;
				((Class98_Sub42) class98_sub42).anInt4216 = i_5_ + i_2_ << 636122729;
				((Class98_Sub42) class98_sub42).anInt4236 = ((Class352) class352).anInt2987;
				((Class98_Sub42) class98_sub42).anInt4224 = i_4_ + i << 531390185;
				((Class98_Sub42) class98_sub42).anInt4237 = ((Class352) class352).anInt2950;
				((Class98_Sub42) class98_sub42).anIntArray4208 = ((Class352) class352).anIntArray2926;
				((Class98_Sub42) class98_sub42).anInt4228 = ((Class352) class352).anInt2981 << 998368073;
				((Class98_Sub42) class98_sub42).anInt4223 = ((Class352) class352).anInt3006;
				((Class98_Sub42) class98_sub42).anInt4210 = ((Class352) class352).anInt2996;
				if (((Class352) class352).anIntArray2928 != null) {
					((Class98_Sub42) class98_sub42).aBoolean4207 = true;
					class98_sub42.method1478(true);
				}
				if (((Class98_Sub42) class98_sub42).anIntArray4208 != null)
					((Class98_Sub42) class98_sub42).anInt4221 = ((int) ((double) (-(((Class98_Sub42) class98_sub42).anInt4219) + (((Class98_Sub42) class98_sub42).anInt4205)) * Math.random()) + ((Class98_Sub42) class98_sub42).anInt4219);
				Class98_Sub10_Sub37.aClass148_5748.add_last(class98_sub42, -20911);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wb.Q(" + (class246_sub3_sub4_sub2_sub2 != null ? "{...}" : "null") + ',' + (class352 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (class246_sub3_sub4_sub2_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1326() {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.G(" + ')');
		}
	}

	static final Class98_Sub46_Sub17 method1384(int i) {
		try {
			int i_6_ = 110 % ((9 - i) / 51);
			Class98_Sub46_Sub17 class98_sub46_sub17 = (Class98_Sub46_Sub17) Class367.aClass215_3545.method2792(-1);
			if (class98_sub46_sub17 != null) {
				class98_sub46_sub17.remove();
				class98_sub46_sub17.method1524((byte) -90);
				return class98_sub46_sub17;
			}
			do {
				class98_sub46_sub17 = ((Class98_Sub46_Sub17) Class98_Sub10_Sub34.aClass215_5728.method2792(-1));
				if (class98_sub46_sub17 == null)
					return null;
				if ((class98_sub46_sub17.method1620((byte) -108) ^ 0xffffffffffffffffL) < (Class343.method3819(-47) ^ 0xffffffffffffffffL))
					return null;
				class98_sub46_sub17.remove();
				class98_sub46_sub17.method1524((byte) -90);
			} while (((~0x7fffffffffffffffL & ((Class98_Sub46) class98_sub46_sub17).aLong4259) ^ 0xffffffffffffffffL) == -1L);
			return class98_sub46_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.K(" + i + ')');
		}
	}

	final Class98_Sub46_Sub15 method1385(double d, int i, int i_7_) {
		try {
			int i_8_ = -23 % ((-46 - i_7_) / 34);
			long l = (long) (anInt5858 << 336243488 | i);
			Class98_Sub46_Sub15 class98_sub46_sub15 = ((Class98_Sub46_Sub15) IComponentSettings.aClass100_4283.method1694((byte) 120, l));
			do {
				if (class98_sub46_sub15 == null) {
					class98_sub46_sub15 = new Class98_Sub46_Sub15(new short[anInt5858][i], d);
					if (!client.aBoolean3553)
						break;
				}
				((Class98_Sub46_Sub15) class98_sub46_sub15).aDouble6042 = d;
				IComponentSettings.aClass100_4283.method1689(l, (byte) 58);
			} while (false);
			return class98_sub46_sub15;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wb.E(" + d + ',' + i + ',' + i_7_ + ')'));
		}
	}

	static final void method1386(int i) {
		try {
			if (aa_Sub2.anIntArray3565 == null || Class278_Sub1.anIntArray5168 == null) {
				Class278_Sub1.anIntArray5168 = new int[256];
				aa_Sub2.anIntArray3565 = new int[256];
				for (int i_9_ = 0; i_9_ < 256; i_9_++) {
					double d = 6.283185307179586 * ((double) i_9_ / 255.0);
					aa_Sub2.anIntArray3565[i_9_] = (int) (4096.0 * Math.sin(d));
					Class278_Sub1.anIntArray5168[i_9_] = (int) (4096.0 * Math.cos(d));
				}
			}
			if (i != 0)
				method1383(null, null, 15, 74, -18, 45, 82, null);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.H(" + i + ')');
		}
	}

	final synchronized int method1387(boolean bool) {
		try {
			if (bool != true)
				method1388((byte) 32);
			return anInt5863;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.C(" + bool + ')');
		}
	}

	private final synchronized void method1388(byte i) {
		try {
			if (i != 100)
				method1385(1.413056312553466, -73, -59);
			Class98_Sub46_Sub15 class98_sub46_sub15 = method1381(-92);
			if (class98_sub46_sub15 != null) {
				class98_sub46_sub15.remove();
				anInt5862 = 0;
				anInt5863--;
				IComponentSettings.aClass100_4283.method1695(26404, class98_sub46_sub15, class98_sub46_sub15.method1608(2));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.F(" + i + ')');
		}
	}

	final synchronized void method1325(int[] is, int i, int i_10_) {
		try {
			if (!aBoolean5864) {
				if (method1381(-67) == null) {
					if (aBoolean5867) {
						this.remove();
						IComponentSettings.aClass100_4283.method1690(1);
					}
				} else {
					int i_11_ = i_10_ + i;
					if (Class151_Sub7.aBoolean5007)
						i_11_ <<= 1;
					int i_12_ = 0;
					int i_13_ = 0;
					if (anInt5858 == 2)
						i_13_ = 1;
					while (i_11_ > i) {
						Class98_Sub46_Sub15 class98_sub46_sub15 = method1381(-54);
						if (class98_sub46_sub15 == null)
							break;
						short[][] is_14_;
						for (is_14_ = (((Class98_Sub46_Sub15) class98_sub46_sub15).aShortArrayArray6040); ((i ^ 0xffffffff) > (i_11_ ^ 0xffffffff) && ((is_14_[0].length ^ 0xffffffff) < (anInt5862 ^ 0xffffffff))); anInt5862++) {
							if (!Class151_Sub7.aBoolean5007)
								is[i++] += (anInt5865 * is_14_[i_13_][anInt5862] + (anInt5866 * is_14_[i_12_][anInt5862]));
							else {
								is[i++] = anInt5866 * is_14_[i_12_][anInt5862];
								is[i++] = anInt5865 * is_14_[i_13_][anInt5862];
							}
						}
						if (anInt5862 >= is_14_[0].length)
							method1388((byte) 100);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wb.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ')'));
		}
	}

	public static void method1389(int i) {
		try {
			if (i != -18925)
				anIntArray5861 = null;
			anIntArray5861 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.J(" + i + ')');
		}
	}

	static final int method1390(int i, int i_15_, int i_16_, int i_17_) {
		try {
			if (i_17_ != -8941)
				return -107;
			if ((0x8 & Class281.tileSettings[i_15_][i_16_][i] ^ 0xffffffff) != -1)
				return 0;
			if ((i_15_ ^ 0xffffffff) < -1 && (Class281.tileSettings[1][i_16_][i] & 0x2 ^ 0xffffffff) != -1)
				return i_15_ - 1;
			return i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wb.I(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	final synchronized void method1391(boolean bool, int i) {
		try {
			if (i == -58758775)
				aBoolean5864 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.L(" + bool + ',' + i + ')');
		}
	}

	final Class98_Sub31 method1322() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.B(" + ')');
		}
	}

	final void method1392(int i, int i_18_) {
		do {
			try {
				anInt5866 = i_18_;
				anInt5865 = i_18_;
				if (i == 255186825)
					break;
				method1326();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wb.O(" + i + ',' + i_18_ + ')');
			}
			break;
		} while (false);
	}

	final Class98_Sub31 method1327() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.D(" + ')');
		}
	}

	Class98_Sub31_Sub4(int i) {
		anInt5863 = 0;
		anInt5866 = 256;
		try {
			anInt5858 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wb.<init>(" + i + ')');
		}
	}
}
