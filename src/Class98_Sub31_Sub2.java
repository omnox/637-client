
/* Class98_Sub31_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class98_Sub31_Sub2 extends Class98_Sub31 {
	private int[] anIntArray5819;
	private Class377 aClass377_5820;
	private int[] anIntArray5821;
	static int anInt5822;
	private Class173 aClass173_5823;
	static int anInt5824;
	private Class98_Sub16[][] aClass98_Sub16ArrayArray5825;
	private int[] anIntArray5826;
	private int anInt5827;
	private Class98_Sub16[][] aClass98_Sub16ArrayArray5828;
	private int[] anIntArray5829;
	private int[] anIntArray5830;
	private int[] anIntArray5831;
	static int[] anIntArray5832 = new int[1];
	private int[] anIntArray5833;
	private int[] anIntArray5834;
	private int[] anIntArray5835;
	private int anInt5836;
	private int[] anIntArray5837;
	private int[] anIntArray5839;
	int[] anIntArray5840;
	private int[] anIntArray5841;
	int[] anIntArray5842;
	int[] anIntArray5843;
	private int[] anIntArray5844;
	private int anInt5845;
	private Class98_Sub31_Sub1 aClass98_Sub31_Sub1_5846;
	private long aLong5847;
	private boolean aBoolean5848;
	private long aLong5849;
	private int anInt5850;
	private Class98_Sub7 aClass98_Sub7_5851;
	private boolean aBoolean5852;
	private int anInt5853;

	private final void method1331(boolean bool, int i) {
		try {
			if (!bool)
				method1335(-1, 0);
			else
				method1355(false, -1);
			method1342(0, -1);
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -17; i_0_++)
				anIntArray5834[i_0_] = anIntArray5830[i_0_];
			for (int i_1_ = i; (i_1_ ^ 0xffffffff) > -17; i_1_++)
				anIntArray5841[i_1_] = Class202.method2702(-128, anIntArray5830[i_1_]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.QA(" + bool + ',' + i + ')');
		}
	}

	final synchronized void method1332(boolean bool, Class98_Sub7 class98_sub7, byte i) {
		do {
			try {
				method1343(class98_sub7, true, bool, i ^ ~0x52);
				if (i == -4)
					break;
				anIntArray5837 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.Q(" + bool + ',' + (class98_sub7 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method1333(int i) {
		try {
			anIntArray5832 = null;
			if (i != 0)
				anInt5822 = -88;
			IncomingOpcode.aClass58_5838 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.E(" + i + ')');
		}
	}

	private final int method1334(int i, Class98_Sub16 class98_sub16) {
		try {
			if (anIntArray5844[((Class98_Sub16) class98_sub16).anInt3940] == 0)
				return 0;
			Class89 class89 = ((Class98_Sub16) class98_sub16).aClass89_3935;
			int i_2_ = ((anIntArray5831[((Class98_Sub16) class98_sub16).anInt3940] * (anIntArray5826[((Class98_Sub16) class98_sub16).anInt3940])) - -4096 >> -2144255443);
			i_2_ = 16384 + i_2_ * i_2_ >> 1838107727;
			i_2_ = (16384 + ((Class98_Sub16) class98_sub16).anInt3925 * i_2_ >> 755612303);
			i_2_ = anInt5836 * i_2_ - -128 >> 1177580712;
			i_2_ = 128 + i_2_ * anIntArray5844[(((Class98_Sub16) class98_sub16).anInt3940)] >> -273066168;
			if ((((Class89) class89).anInt707 ^ 0xffffffff) < -1)
				i_2_ = (int) (0.5 + (Math.pow(0.5, ((double) ((Class98_Sub16) class98_sub16).anInt3932 * 1.953125E-5 * (double) (((Class89) class89).anInt707))) * (double) i_2_));
			if (((Class89) class89).aByteArray714 != null) {
				int i_3_ = ((Class98_Sub16) class98_sub16).anInt3920;
				int i_4_ = (((Class89) class89).aByteArray714[1 + ((Class98_Sub16) class98_sub16).anInt3937]);
				if (((Class89) class89).aByteArray714.length + -2 > ((Class98_Sub16) class98_sub16).anInt3937) {
					int i_5_ = 0xff00 & (((Class89) class89).aByteArray714[(((Class98_Sub16) class98_sub16).anInt3937)]) << 814996168;
					int i_6_ = (((((Class89) class89).aByteArray714[2 + ((Class98_Sub16) class98_sub16).anInt3937]) << -603738584) & 0xff00);
					i_4_ += ((((Class89) class89).aByteArray714[3 + ((Class98_Sub16) class98_sub16).anInt3937]) - i_4_) * (i_3_ - i_5_) / (i_6_ - i_5_);
				}
				i_2_ = i_4_ * i_2_ + 32 >> 559368486;
			}
			if (((Class98_Sub16) class98_sub16).anInt3930 > 0 && ((Class89) class89).aByteArray713 != null) {
				int i_7_ = ((Class98_Sub16) class98_sub16).anInt3930;
				int i_8_ = (((Class89) class89).aByteArray713[1 + ((Class98_Sub16) class98_sub16).anInt3922]);
				if (((Class98_Sub16) class98_sub16).anInt3922 < -2 + ((Class89) class89).aByteArray713.length) {
					int i_9_ = (((((Class89) class89).aByteArray713[((Class98_Sub16) class98_sub16).anInt3922]) << -624556984) & 0xff00);
					int i_10_ = ((0xff & (((Class89) class89).aByteArray713[2 + (((Class98_Sub16) class98_sub16).anInt3922)])) << -1122491128);
					i_8_ += ((-i_9_ + i_7_) * (-i_8_ + (((Class89) class89).aByteArray713[(((Class98_Sub16) class98_sub16).anInt3922 - -3)])) / (i_10_ + -i_9_));
				}
				i_2_ = 32 + i_8_ * i_2_ >> 139934694;
			}
			if (i != 255)
				return -41;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.DA(" + i + ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1335(int i, int i_11_) {
		try {
			if (i_11_ != 0)
				method1359((byte) -87, -124L);
			for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2417(104))) {
				if ((i < 0 || ((Class98_Sub16) class98_sub16).anInt3940 == i) && ((Class98_Sub16) class98_sub16).anInt3930 < 0) {
					aClass98_Sub16ArrayArray5825[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3936] = null;
					((Class98_Sub16) class98_sub16).anInt3930 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.I(" + i + ',' + i_11_ + ')');
		}
	}

	static final void method1336(byte i) {
		try {
			synchronized (Class315.aClient3529) {
				if (GameInterface.aFrame3950 != null) {
					/* empty */
				} else {
					java.awt.Container container;
					if (Class284.aFrame2168 == null) {
						if (Class76_Sub11.anApplet3799 != null)
							container = Class76_Sub11.anApplet3799;
						else
							container = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
					} else
						container = Class284.aFrame2168;
					Class188.anInt1453 = container.getSize().width;
					Class123_Sub1.anInt4744 = container.getSize().height;
					if (Class284.aFrame2168 == container) {
						Insets insets = Class284.aFrame2168.getInsets();
						Class123_Sub1.anInt4744 -= insets.bottom + insets.top;
						Class188.anInt1453 -= insets.left - -insets.right;
					}
					if (Class146_Sub2.method2391((byte) 118) == 1) {
						Class191.anInt1479 = 0;
						Class39_Sub1.anInt3593 = Class98_Sub17_Sub1.anInt5782;
						Class98_Sub25.anInt4024 = Class246_Sub2.anInt5072;
						Class98_Sub46_Sub10.anInt6022 = (Class188.anInt1453 + -Class98_Sub17_Sub1.anInt5782) / 2;
					} else
						RtMouseListener.method3513(false);
					if (Class43.aClass196_375 != Class64_Sub29.aClass196_3720) {
						if ((Class39_Sub1.anInt3593 ^ 0xffffffff) > -1025 && Class98_Sub25.anInt4024 < 768) {
							/* empty */
						}
					}
					Class42_Sub3.aCanvas5361.setSize(Class39_Sub1.anInt3593, Class98_Sub25.anInt4024);
					if (Class265.aHa1974 != null) {
						if (!za_Sub2.aBoolean6079)
							Class265.aHa1974.method1782((Class42_Sub3.aCanvas5361), Class39_Sub1.anInt3593, (Class98_Sub25.anInt4024));
						else
							GameInterfaceData.method3471(Class42_Sub3.aCanvas5361, 0);
					}
					if (i > -41)
						method1333(94);
					if (container == Class284.aFrame2168) {
						Insets insets = Class284.aFrame2168.getInsets();
						Class42_Sub3.aCanvas5361.setLocation(insets.left + Class98_Sub46_Sub10.anInt6022, Class191.anInt1479 + insets.top);
					} else
						Class42_Sub3.aCanvas5361.setLocation(Class98_Sub46_Sub10.anInt6022, Class191.anInt1479);
					if ((Class15.anInt185 ^ 0xffffffff) != 0)
						Class40.method359(-1, true);
					Class263.method3216(14059);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.J(" + i + ')');
		}
	}

	private final void method1337(int i, byte i_12_) {
		try {
			int i_13_ = -87 / ((i_12_ - 70) / 55);
			int i_14_ = 0xf0 & i;
			if (i_14_ == 128) {
				int i_15_ = i & 0xf;
				int i_16_ = 0x7f & i >> 374811400;
				int i_17_ = (0x7f5ce4 & i) >> 907280592;
				method1353(i_16_, i_15_, i_17_, 42);
			} else if (i_14_ == 144) {
				int i_18_ = i & 0xf;
				int i_19_ = i >> 1952651336 & 0x7f;
				int i_20_ = i >> 1968912016 & 0x7f;
				if ((i_20_ ^ 0xffffffff) >= -1)
					method1353(i_19_, i_18_, 64, 19);
				else
					method1346(98, i_19_, i_20_, i_18_);
			} else if ((i_14_ ^ 0xffffffff) == -161) {
				int i_21_ = 0xf & i;
				int i_22_ = i >> 1959226056 & 0x7f;
				int i_23_ = (0x7f67e2 & i) >> -805171600;
				method1338(i_22_, i_21_, true, i_23_);
			} else if ((i_14_ ^ 0xffffffff) == -177) {
				int i_24_ = 0xf & i;
				int i_25_ = (0x7f65 & i) >> -1760183224;
				int i_26_ = 0x7f & i >> -428057136;
				if ((i_25_ ^ 0xffffffff) == -1)
					anIntArray5841[i_24_] = ((i_26_ << -243849874) + Class202.method2702(anIntArray5841[i_24_], -2080769));
				if ((i_25_ ^ 0xffffffff) == -33)
					anIntArray5841[i_24_] = ((i_26_ << 1679403687) + Class202.method2702(anIntArray5841[i_24_], -16257));
				if ((i_25_ ^ 0xffffffff) == -2)
					anIntArray5821[i_24_] = (Class202.method2702(anIntArray5821[i_24_], -16257) - -(i_26_ << 231051687));
				if (i_25_ == 33)
					anIntArray5821[i_24_] = i_26_ + Class202.method2702(anIntArray5821[i_24_], -128);
				if (i_25_ == 5)
					anIntArray5835[i_24_] = ((i_26_ << -324226233) + Class202.method2702(-16257, anIntArray5835[i_24_]));
				if ((i_25_ ^ 0xffffffff) == -38)
					anIntArray5835[i_24_] = (Class202.method2702(-128, anIntArray5835[i_24_]) - -i_26_);
				if (i_25_ == 7)
					anIntArray5831[i_24_] = (Class202.method2702(-16257, anIntArray5831[i_24_]) + (i_26_ << 1142330119));
				if (i_25_ == 39)
					anIntArray5831[i_24_] = (Class202.method2702(anIntArray5831[i_24_], -128) + i_26_);
				if (i_25_ == 10)
					anIntArray5839[i_24_] = (Class202.method2702(anIntArray5839[i_24_], -16257) - -(i_26_ << 1026620103));
				if ((i_25_ ^ 0xffffffff) == -43)
					anIntArray5839[i_24_] = (Class202.method2702(-128, anIntArray5839[i_24_]) + i_26_);
				if (i_25_ == 11)
					anIntArray5826[i_24_] = (Class202.method2702(anIntArray5826[i_24_], -16257) + (i_26_ << -1493630745));
				if ((i_25_ ^ 0xffffffff) == -44)
					anIntArray5826[i_24_] = (Class202.method2702(-128, anIntArray5826[i_24_]) + i_26_);
				if (i_25_ == 64) {
					if ((i_26_ ^ 0xffffffff) > -65)
						((Class98_Sub31_Sub2) this).anIntArray5840[i_24_] = Class202.method2702((((Class98_Sub31_Sub2) this).anIntArray5840[i_24_]), -2);
					else
						((Class98_Sub31_Sub2) this).anIntArray5840[i_24_] = Class41.method366((((Class98_Sub31_Sub2) this).anIntArray5840[i_24_]), 1);
				}
				if ((i_25_ ^ 0xffffffff) == -66) {
					if (i_26_ < 64) {
						method1369(i_24_, -114);
						((Class98_Sub31_Sub2) this).anIntArray5840[i_24_] = Class202.method2702((((Class98_Sub31_Sub2) this).anIntArray5840[i_24_]), -3);
					} else
						((Class98_Sub31_Sub2) this).anIntArray5840[i_24_] = Class41.method366((((Class98_Sub31_Sub2) this).anIntArray5840[i_24_]), 2);
				}
				if ((i_25_ ^ 0xffffffff) == -100)
					anIntArray5829[i_24_] = (Class202.method2702(anIntArray5829[i_24_], 127) - -(i_26_ << -107977913));
				if (i_25_ == 98)
					anIntArray5829[i_24_] = i_26_ + Class202.method2702(anIntArray5829[i_24_], 16256);
				if ((i_25_ ^ 0xffffffff) == -102)
					anIntArray5829[i_24_] = (Class202.method2702(anIntArray5829[i_24_], 127) + (16384 + (i_26_ << -1693120281)));
				if ((i_25_ ^ 0xffffffff) == -101)
					anIntArray5829[i_24_] = (i_26_ + Class202.method2702(16256, anIntArray5829[i_24_]) + 16384);
				if ((i_25_ ^ 0xffffffff) == -121)
					method1355(false, i_24_);
				if ((i_25_ ^ 0xffffffff) == -122)
					method1342(0, i_24_);
				if ((i_25_ ^ 0xffffffff) == -124)
					method1335(i_24_, 0);
				if (i_25_ == 6) {
					int i_27_ = anIntArray5829[i_24_];
					if ((i_27_ ^ 0xffffffff) == -16385)
						anIntArray5819[i_24_] = (Class202.method2702(-16257, anIntArray5819[i_24_]) + (i_26_ << 1255328263));
				}
				if (i_25_ == 38) {
					int i_28_ = anIntArray5829[i_24_];
					if ((i_28_ ^ 0xffffffff) == -16385)
						anIntArray5819[i_24_] = (Class202.method2702(-128, anIntArray5819[i_24_]) + i_26_);
				}
				if (i_25_ == 16)
					((Class98_Sub31_Sub2) this).anIntArray5842[i_24_] = (Class202.method2702((((Class98_Sub31_Sub2) this).anIntArray5842[i_24_]), -16257) - -(i_26_ << -1160099449));
				if ((i_25_ ^ 0xffffffff) == -49)
					((Class98_Sub31_Sub2) this).anIntArray5842[i_24_] = (i_26_ + Class202.method2702((((Class98_Sub31_Sub2) this).anIntArray5842[i_24_]), -128));
				if (i_25_ == 81) {
					if ((i_26_ ^ 0xffffffff) <= -65)
						((Class98_Sub31_Sub2) this).anIntArray5840[i_24_] = Class41.method366((((Class98_Sub31_Sub2) this).anIntArray5840[i_24_]), 4);
					else {
						method1368(103, i_24_);
						((Class98_Sub31_Sub2) this).anIntArray5840[i_24_] = Class202.method2702((((Class98_Sub31_Sub2) this).anIntArray5840[i_24_]), -5);
					}
				}
				if ((i_25_ ^ 0xffffffff) == -18)
					method1348(103, i_24_, ((~0x3f80 & anIntArray5837[i_24_]) - -(i_26_ << -1302433305)));
				if ((i_25_ ^ 0xffffffff) == -50)
					method1348(111, i_24_, (~0x7f & anIntArray5837[i_24_]) + i_26_);
			} else if ((i_14_ ^ 0xffffffff) == -193) {
				int i_29_ = i & 0xf;
				int i_30_ = (i & 0x7fc6) >> -889995320;
				method1347((byte) -128, anIntArray5841[i_29_] + i_30_, i_29_);
			} else if (i_14_ == 208) {
				int i_31_ = i & 0xf;
				int i_32_ = i >> -966108184 & 0x7f;
				method1365(i_32_, i_31_, 15);
			} else if (i_14_ == 224) {
				int i_33_ = i & 0xf;
				int i_34_ = (((i & 0x7f94) >> -1491268920) + ((i & 0x7f0001) >> 1964066633));
				method1362(i_33_, 1, i_34_);
			} else {
				i_14_ = i & 0xff;
				if (i_14_ == 255)
					method1331(true, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.P(" + i + ',' + i_12_ + ')');
		}
	}

	private final void method1338(int i, int i_35_, boolean bool, int i_36_) {
		try {
			if (bool != true)
				anIntArray5819 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.C(" + i + ',' + i_35_ + ',' + bool + ',' + i_36_ + ')'));
		}
	}

	static final int method1339(int i, int i_37_) {
		try {
			if (i == 6407 || (i ^ 0xffffffff) == -34844 || i == 34837)
				return 6407;
			if ((i ^ 0xffffffff) == -6409 || (i ^ 0xffffffff) == -34843 || (i ^ 0xffffffff) == -34837)
				return 6408;
			if (i == 6406 || (i ^ 0xffffffff) == -34845)
				return 6406;
			if (i == 6409 || (i ^ 0xffffffff) == -34847)
				return 6409;
			if ((i ^ 0xffffffff) == -6411 || (i ^ 0xffffffff) == -34848)
				return 6410;
			if (i_37_ < 123)
				method1333(-1);
			if (i == 6402)
				return 6402;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.FB(" + i + ',' + i_37_ + ')');
		}
	}

	final boolean method1340(int i, int[] is, int i_38_, int i_39_, Class98_Sub16 class98_sub16) {
		try {
			((Class98_Sub16) class98_sub16).anInt3923 = Class64_Sub15.anInt3678 / 100;
			if (((Class98_Sub16) class98_sub16).anInt3930 >= 0 && ((((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 == null) || ((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1401())) {
				class98_sub16.method1148(-1);
				class98_sub16.remove();
				if (((Class98_Sub16) class98_sub16).anInt3931 > 0 && ((aClass98_Sub16ArrayArray5828[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3931]) == class98_sub16))
					aClass98_Sub16ArrayArray5828[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3931] = null;
				return true;
			}
			int i_40_ = ((Class98_Sub16) class98_sub16).anInt3929;
			if (i_40_ > 0) {
				i_40_ -= (int) (0.5 + (Math.pow(2.0, (4.921259842519685E-4 * (double) (anIntArray5835[(((Class98_Sub16) class98_sub16).anInt3940)]))) * 16.0));
				if (i_40_ < 0)
					i_40_ = 0;
				((Class98_Sub16) class98_sub16).anInt3929 = i_40_;
			}
			((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1407(method1350(i_38_, class98_sub16));
			Class89 class89 = ((Class98_Sub16) class98_sub16).aClass89_3935;
			((Class98_Sub16) class98_sub16).anInt3921++;
			boolean bool = false;
			((Class98_Sub16) class98_sub16).anInt3941 += ((Class89) class89).anInt710;
			double d = ((double) ((-60 + ((Class98_Sub16) class98_sub16).anInt3936 << -498361240) + ((((Class98_Sub16) class98_sub16).anInt3938 * ((Class98_Sub16) class98_sub16).anInt3929) >> -147636500)) * 5.086263020833333E-6);
			if (((Class89) class89).anInt707 > 0) {
				if ((((Class89) class89).anInt712 ^ 0xffffffff) >= -1)
					((Class98_Sub16) class98_sub16).anInt3932 += 128;
				else
					((Class98_Sub16) class98_sub16).anInt3932 += (int) (0.5 + (128.0 * Math.pow(2.0, (double) (((Class89) class89).anInt712) * d)));
				if ((((Class89) class89).anInt707 * ((Class98_Sub16) class98_sub16).anInt3932) >= 819200)
					bool = true;
			}
			if (((Class89) class89).aByteArray714 != null) {
				if ((((Class89) class89).anInt711 ^ 0xffffffff) >= -1)
					((Class98_Sub16) class98_sub16).anInt3920 += 128;
				else
					((Class98_Sub16) class98_sub16).anInt3920 += (int) (0.5 + (Math.pow(2.0, d * (double) (((Class89) class89).anInt711)) * 128.0));
				for (/**/; (((((Class89) class89).aByteArray714.length + -2 ^ 0xffffffff) < (((Class98_Sub16) class98_sub16).anInt3937 ^ 0xffffffff)) && (((Class98_Sub16) class98_sub16).anInt3920 > (0xff & (((Class89) class89).aByteArray714[2 + (((Class98_Sub16) class98_sub16).anInt3937)])) << 2116910312)); ((Class98_Sub16) class98_sub16).anInt3937 += 2) {
					/* empty */
				}
				if (((((Class98_Sub16) class98_sub16).anInt3937 ^ 0xffffffff) == (-2 + ((Class89) class89).aByteArray714.length ^ 0xffffffff)) && ((((Class89) class89).aByteArray714[1 + ((Class98_Sub16) class98_sub16).anInt3937]) ^ 0xffffffff) == -1)
					bool = true;
			}
			if ((((Class98_Sub16) class98_sub16).anInt3930 ^ 0xffffffff) <= -1 && ((Class89) class89).aByteArray713 != null && (0x1 & (((Class98_Sub31_Sub2) this).anIntArray5840[((Class98_Sub16) class98_sub16).anInt3940]) ^ 0xffffffff) == -1 && (((Class98_Sub16) class98_sub16).anInt3931 < 0 || (class98_sub16 != (aClass98_Sub16ArrayArray5828[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3931])))) {
				if ((((Class89) class89).anInt715 ^ 0xffffffff) >= -1)
					((Class98_Sub16) class98_sub16).anInt3930 += 128;
				else
					((Class98_Sub16) class98_sub16).anInt3930 += (int) ((128.0 * Math.pow(2.0, d * (double) (((Class89) class89).anInt715))) + 0.5);
				for (/**/; (((-2 + ((Class89) class89).aByteArray713.length ^ 0xffffffff) < (((Class98_Sub16) class98_sub16).anInt3922 ^ 0xffffffff)) && (((0xff & (((Class89) class89).aByteArray713[2 + (((Class98_Sub16) class98_sub16).anInt3922)])) << -865703064 ^ 0xffffffff) > (((Class98_Sub16) class98_sub16).anInt3930 ^ 0xffffffff))); ((Class98_Sub16) class98_sub16).anInt3922 += 2) {
					/* empty */
				}
				if ((((Class89) class89).aByteArray713.length - 2 ^ 0xffffffff) == (((Class98_Sub16) class98_sub16).anInt3922 ^ 0xffffffff))
					bool = true;
			}
			if (bool) {
				((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1423(((Class98_Sub16) class98_sub16).anInt3923);
				if (is != null)
					((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1325(is, i_39_, i);
				else
					((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1321(i);
				if (((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1425())
					((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass98_Sub31_Sub3_5818.method1371(((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939);
				class98_sub16.method1148(i_38_ ^ ~0x2);
				if (((Class98_Sub16) class98_sub16).anInt3930 >= 0) {
					class98_sub16.remove();
					if (((Class98_Sub16) class98_sub16).anInt3931 > 0 && (class98_sub16 == (aClass98_Sub16ArrayArray5828[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3931])))
						aClass98_Sub16ArrayArray5828[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3931] = null;
				}
				return true;
			}
			((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1412(((Class98_Sub16) class98_sub16).anInt3923, method1334(255, class98_sub16), method1351(class98_sub16, i_38_ + -114));
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.O(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_38_ + ',' + i_39_ + ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	final synchronized void method1341(boolean bool, boolean bool_41_, Class98_Sub7 class98_sub7, long l, int i) {
		do {
			try {
				method1343(class98_sub7, bool, bool_41_, 113);
				method1359((byte) -117, (long) ((Class173) aClass173_5823).anInt1340 * l);
				if (i == -3)
					break;
				anIntArray5844 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.AB(" + bool + ',' + bool_41_ + ',' + (class98_sub7 != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method1342(int i, int i_42_) {
		try {
			if ((i_42_ ^ 0xffffffff) > -1) {
				for (i_42_ = 0; i_42_ < 16; i_42_++)
					method1342(i, i_42_);
			} else {
				anIntArray5831[i_42_] = 12800;
				anIntArray5839[i_42_] = 8192;
				anIntArray5826[i_42_] = 16383;
				anIntArray5833[i_42_] = 8192;
				anIntArray5821[i_42_] = i;
				anIntArray5835[i_42_] = 8192;
				method1369(i_42_, i ^ 0x12);
				method1368(98, i_42_);
				((Class98_Sub31_Sub2) this).anIntArray5840[i_42_] = 0;
				anIntArray5829[i_42_] = 32767;
				anIntArray5819[i_42_] = 256;
				((Class98_Sub31_Sub2) this).anIntArray5842[i_42_] = 0;
				method1348(71, i_42_, 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.EA(" + i + ',' + i_42_ + ')');
		}
	}

	private final synchronized void method1343(Class98_Sub7 class98_sub7, boolean bool, boolean bool_43_, int i) {
		try {
			if (i < 76)
				method1346(-76, 125, -76, 76);
			method1344(95, bool);
			aClass173_5823.method2557(((Class98_Sub7) class98_sub7).aByteArray3850);
			aBoolean5848 = bool_43_;
			aLong5847 = 0L;
			int i_44_ = aClass173_5823.method2558();
			for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
				aClass173_5823.method2555(i_45_);
				aClass173_5823.method2556(i_45_);
				aClass173_5823.method2552(i_45_);
			}
			anInt5845 = aClass173_5823.method2551();
			anInt5850 = ((Class173) aClass173_5823).anIntArray1343[anInt5845];
			aLong5849 = aClass173_5823.method2547(anInt5850);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.IA(" + (class98_sub7 != null ? "{...}" : "null") + ',' + bool + ',' + bool_43_ + ',' + i + ')'));
		}
	}

	private final synchronized void method1344(int i, boolean bool) {
		try {
			aClass173_5823.method2545();
			int i_46_ = 107 % ((-62 - i) / 45);
			aClass98_Sub7_5851 = null;
			method1331(bool, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.F(" + i + ',' + bool + ')');
		}
	}

	final boolean method1345(int i, Class98_Sub16 class98_sub16) {
		try {
			if (i != 1816)
				aClass377_5820 = null;
			if (((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 == null) {
				if (((Class98_Sub16) class98_sub16).anInt3930 >= 0) {
					class98_sub16.remove();
					if ((((Class98_Sub16) class98_sub16).anInt3931 ^ 0xffffffff) < -1 && (class98_sub16 == (aClass98_Sub16ArrayArray5828[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3931])))
						aClass98_Sub16ArrayArray5828[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3931] = null;
				}
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.OA(" + i + ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1346(int i, int i_47_, int i_48_, int i_49_) {
		try {
			method1353(i_47_, i_49_, 64, 104);
			if ((0x2 & ((Class98_Sub31_Sub2) this).anIntArray5840[i_49_] ^ 0xffffffff) != -1) {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2427(-125)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2416((byte) 5))) {
					if (((i_49_ ^ 0xffffffff) == (((Class98_Sub16) class98_sub16).anInt3940 ^ 0xffffffff)) && ((Class98_Sub16) class98_sub16).anInt3930 < 0) {
						aClass98_Sub16ArrayArray5825[i_49_][((Class98_Sub16) class98_sub16).anInt3936] = null;
						aClass98_Sub16ArrayArray5825[i_49_][i_47_] = class98_sub16;
						int i_50_ = (((Class98_Sub16) class98_sub16).anInt3926 + ((((Class98_Sub16) class98_sub16).anInt3938 * ((Class98_Sub16) class98_sub16).anInt3929) >> 805761964));
						((Class98_Sub16) class98_sub16).anInt3926 += i_47_ + -(((Class98_Sub16) class98_sub16).anInt3936) << 308353096;
						((Class98_Sub16) class98_sub16).anInt3938 = (-((Class98_Sub16) class98_sub16).anInt3926 + i_50_);
						((Class98_Sub16) class98_sub16).anInt3936 = i_47_;
						((Class98_Sub16) class98_sub16).anInt3929 = 4096;
						return;
					}
				}
			}
			int i_51_ = -81 / ((26 - i) / 51);
			Class98_Sub44 class98_sub44 = ((Class98_Sub44) aClass377_5820.method3990((long) anIntArray5834[i_49_], -1));
			if (class98_sub44 != null) {
				Class98_Sub24_Sub1 class98_sub24_sub1 = (((Class98_Sub44) class98_sub44).aClass98_Sub24_Sub1Array4244[i_47_]);
				if (class98_sub24_sub1 != null) {
					Class98_Sub16 class98_sub16 = new Class98_Sub16();
					((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934 = class98_sub24_sub1;
					((Class98_Sub16) class98_sub16).anInt3940 = i_49_;
					((Class98_Sub16) class98_sub16).aClass98_Sub44_3918 = class98_sub44;
					((Class98_Sub16) class98_sub16).aClass89_3935 = (((Class98_Sub44) class98_sub44).aClass89Array4251[i_47_]);
					((Class98_Sub16) class98_sub16).anInt3931 = (((Class98_Sub44) class98_sub44).aByteArray4250[i_47_]);
					((Class98_Sub16) class98_sub16).anInt3936 = i_47_;
					((Class98_Sub16) class98_sub16).anInt3925 = (1024 + (((Class98_Sub44) class98_sub44).anInt4249 * i_48_ * (i_48_ * (((Class98_Sub44) class98_sub44).aByteArray4252[i_47_]))) >> 622064875);
					((Class98_Sub16) class98_sub16).anInt3924 = (((Class98_Sub44) class98_sub44).aByteArray4247[i_47_]) & 0xff;
					((Class98_Sub16) class98_sub16).anInt3926 = ((i_47_ << 1695782120) + -(0x7fff & (((Class98_Sub44) class98_sub44).aShortArray4248[i_47_])));
					((Class98_Sub16) class98_sub16).anInt3932 = 0;
					((Class98_Sub16) class98_sub16).anInt3937 = 0;
					((Class98_Sub16) class98_sub16).anInt3920 = 0;
					((Class98_Sub16) class98_sub16).anInt3922 = 0;
					((Class98_Sub16) class98_sub16).anInt3930 = -1;
					if (((Class98_Sub31_Sub2) this).anIntArray5842[i_49_] == 0)
						((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5.method1402(class98_sub24_sub1, method1350(2, class98_sub16), method1334(255, class98_sub16), method1351(class98_sub16, 20)));
					else {
						((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5.method1402(class98_sub24_sub1, method1350(2, class98_sub16), 0, method1351(class98_sub16, -103)));
						method1361(1, (((Class98_Sub44) class98_sub44).aShortArray4248[i_47_]) < 0, class98_sub16);
					}
					if ((((Class98_Sub44) class98_sub44).aShortArray4248[i_47_] ^ 0xffffffff) > -1)
						((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1422(-1);
					if (((Class98_Sub16) class98_sub16).anInt3931 >= 0) {
						Class98_Sub16 class98_sub16_52_ = (aClass98_Sub16ArrayArray5828[i_49_][((Class98_Sub16) class98_sub16).anInt3931]);
						if (class98_sub16_52_ != null && (((Class98_Sub16) class98_sub16_52_).anInt3930 ^ 0xffffffff) > -1) {
							aClass98_Sub16ArrayArray5825[i_49_][((Class98_Sub16) class98_sub16_52_).anInt3936] = null;
							((Class98_Sub16) class98_sub16_52_).anInt3930 = 0;
						}
						aClass98_Sub16ArrayArray5828[i_49_][((Class98_Sub16) class98_sub16).anInt3931] = class98_sub16;
					}
					((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.add_last(class98_sub16, -20911);
					aClass98_Sub16ArrayArray5825[i_49_][i_47_] = class98_sub16;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.JA(" + i + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	private final void method1347(byte i, int i_53_, int i_54_) {
		do {
			try {
				if (i >= -127)
					aBoolean5852 = true;
				if (anIntArray5834[i_54_] == i_53_)
					break;
				anIntArray5834[i_54_] = i_53_;
				for (int i_55_ = 0; i_55_ < 128; i_55_++)
					aClass98_Sub16ArrayArray5828[i_54_][i_55_] = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.R(" + i + ',' + i_53_ + ',' + i_54_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method1348(int i, int i_56_, int i_57_) {
		try {
			if (i >= 40) {
				anIntArray5837[i_56_] = i_57_;
				((Class98_Sub31_Sub2) this).anIntArray5843[i_56_] = (int) (0.5 + (Math.pow(2.0, 5.4931640625E-4 * (double) i_57_) * 2097152.0));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.FA(" + i + ',' + i_56_ + ',' + i_57_ + ')'));
		}
	}

	final synchronized void method1349(int i) {
		try {
			if (i == -1) {
				for (Class98_Sub44 class98_sub44 = (Class98_Sub44) aClass377_5820.start_iteration(i + 96); class98_sub44 != null; class98_sub44 = (Class98_Sub44) aClass377_5820.iterate_next(-1))
					class98_sub44.remove();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.HA(" + i + ')');
		}
	}

	private final int method1350(int i, Class98_Sub16 class98_sub16) {
		try {
			int i_58_ = (((((Class98_Sub16) class98_sub16).anInt3938 * ((Class98_Sub16) class98_sub16).anInt3929) >> 94082348) + ((Class98_Sub16) class98_sub16).anInt3926);
			i_58_ += ((-8192 + (anIntArray5833[((Class98_Sub16) class98_sub16).anInt3940])) * anIntArray5819[(((Class98_Sub16) class98_sub16).anInt3940)]) >> -1798455636;
			Class89 class89 = ((Class98_Sub16) class98_sub16).aClass89_3935;
			if ((((Class89) class89).anInt710 ^ 0xffffffff) < -1 && (((Class89) class89).anInt708 > 0 || ((anIntArray5821[((Class98_Sub16) class98_sub16).anInt3940]) ^ 0xffffffff) < -1)) {
				int i_59_ = ((Class89) class89).anInt708 << 789514338;
				int i_60_ = ((Class89) class89).anInt717 << 1268741473;
				if ((((Class98_Sub16) class98_sub16).anInt3921 ^ 0xffffffff) > (i_60_ ^ 0xffffffff))
					i_59_ = (((Class98_Sub16) class98_sub16).anInt3921 * i_59_ / i_60_);
				i_59_ += anIntArray5821[(((Class98_Sub16) class98_sub16).anInt3940)] >> 677293351;
				double d = Math.sin(0.01227184630308513 * (double) (0x1ff & (((Class98_Sub16) class98_sub16).anInt3941)));
				i_58_ += (int) ((double) i_59_ * d);
			}
			int i_61_ = (int) (((double) (((Class98_Sub24_Sub1) (((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934)).anInt5795 * 256) * Math.pow((double) i, 3.255208333333333E-4 * (double) i_58_) / (double) Class64_Sub15.anInt3678) + 0.5);
			if ((i_61_ ^ 0xffffffff) <= -2)
				return i_61_;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.LA(" + i + ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	private final int method1351(Class98_Sub16 class98_sub16, int i) {
		try {
			int i_62_ = -60 % ((i - -46) / 37);
			int i_63_ = anIntArray5839[((Class98_Sub16) class98_sub16).anInt3940];
			if (i_63_ < 8192)
				return (((Class98_Sub16) class98_sub16).anInt3924 * i_63_ - -32 >> 1741690950);
			return (16384 - (32 + ((128 + -((Class98_Sub16) class98_sub16).anInt3924) * (16384 + -i_63_)) >> -526683354));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.BB(" + (class98_sub16 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final synchronized boolean method1352(Class98_Sub7 class98_sub7, int i, Class308 class308, RuneScapeCache class207, boolean bool) {
		try {
			class98_sub7.method984();
			boolean bool_64_ = true;
			int[] is = null;
			if ((i ^ 0xffffffff) < -1)
				is = new int[] { i };
			if (bool != false)
				return false;
			for (Class98_Sub14 class98_sub14 = (Class98_Sub14) ((Class98_Sub7) class98_sub7).aClass377_3849.start_iteration(117); class98_sub14 != null; class98_sub14 = (Class98_Sub14) ((Class98_Sub7) class98_sub7).aClass377_3849.iterate_next(-1)) {
				int i_65_ = (int) ((Node) class98_sub14).uid;
				Class98_Sub44 class98_sub44 = ((Class98_Sub44) aClass377_5820.method3990((long) i_65_, -1));
				if (class98_sub44 == null) {
					class98_sub44 = Class355.method3875(i_65_, class207, -118);
					if (class98_sub44 == null) {
						bool_64_ = false;
						continue;
					}
					aClass377_5820.method3996(class98_sub44, (long) i_65_, -1);
				}
				if (!class98_sub44.method1517((((Class98_Sub14) class98_sub14).aByteArray3914), class308, (byte) -121, is))
					bool_64_ = false;
			}
			if (bool_64_)
				class98_sub7.method983();
			return bool_64_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.PA(" + (class98_sub7 != null ? "{...}" : "null") + ',' + i + ',' + (class308 != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method1353(int i, int i_66_, int i_67_, int i_68_) {
		try {
			if (i_68_ <= 5)
				aLong5847 = -45L;
			Class98_Sub16 class98_sub16 = aClass98_Sub16ArrayArray5825[i_66_][i];
			if (class98_sub16 != null) {
				aClass98_Sub16ArrayArray5825[i_66_][i] = null;
				if ((0x2 & ((Class98_Sub31_Sub2) this).anIntArray5840[i_66_] ^ 0xffffffff) == -1)
					((Class98_Sub16) class98_sub16).anInt3930 = 0;
				else {
					for (Class98_Sub16 class98_sub16_69_ = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2418(32)); class98_sub16_69_ != null; class98_sub16_69_ = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2417(97))) {
						if (((((Class98_Sub16) class98_sub16_69_).anInt3940 ^ 0xffffffff) == (((Class98_Sub16) class98_sub16).anInt3940 ^ 0xffffffff)) && (((Class98_Sub16) class98_sub16_69_).anInt3930 < 0) && class98_sub16 != class98_sub16_69_) {
							((Class98_Sub16) class98_sub16).anInt3930 = 0;
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.NA(" + i + ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ')'));
		}
	}

	final synchronized void method1321(int i) {
		try {
			if (aClass173_5823.method2546()) {
				int i_70_ = (anInt5827 * ((Class173) aClass173_5823).anInt1340 / Class64_Sub15.anInt3678);
				do {
					long l = aLong5847 - -((long) i_70_ * (long) i);
					if (aLong5849 - l >= 0L) {
						aLong5847 = l;
						break;
					}
					int i_71_ = (int) ((-1L + (long) i_70_ + (-aLong5847 + aLong5849)) / (long) i_70_);
					aLong5847 += (long) i_70_ * (long) i_71_;
					i -= i_71_;
					aClass98_Sub31_Sub1_5846.method1321(i_71_);
					method1370(121);
				} while (aClass173_5823.method2546());
			}
			aClass98_Sub31_Sub1_5846.method1321(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.M(" + i + ')');
		}
	}

	final synchronized boolean method1354(int i) {
		try {
			if (i != -3619)
				method1356(17, 42, false);
			return aClass173_5823.method2546();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.TA(" + i + ')');
		}
	}

	private final void method1355(boolean bool, int i) {
		do {
			try {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2417(102))) {
					if ((i ^ 0xffffffff) > -1 || ((Class98_Sub16) class98_sub16).anInt3940 == i) {
						if ((((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939) != null) {
							((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1423(Class64_Sub15.anInt3678 / 100);
							if (((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1425())
								((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass98_Sub31_Sub3_5818.method1371(((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939);
							class98_sub16.method1148(-1);
						}
						if ((((Class98_Sub16) class98_sub16).anInt3930 ^ 0xffffffff) > -1)
							aClass98_Sub16ArrayArray5825[((Class98_Sub16) class98_sub16).anInt3940][((Class98_Sub16) class98_sub16).anInt3936] = null;
						class98_sub16.remove();
					}
				}
				if (bool == false)
					break;
				method1348(-2, -56, -43);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.GA(" + bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final synchronized Class98_Sub31 method1327() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.D(" + ')');
		}
	}

	private final void method1356(int i, int i_72_, boolean bool) {
		try {
			anIntArray5830[i] = i_72_;
			anIntArray5841[i] = Class202.method2702(i_72_, -128);
			if (bool != false)
				aClass98_Sub31_Sub1_5846 = null;
			method1347((byte) -128, i_72_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.H(" + i + ',' + i_72_ + ',' + bool + ')'));
		}
	}

	final synchronized void method1357(int i, int i_73_, int i_74_) {
		do {
			try {
				method1356(i_74_, i_73_, false);
				if (i == 26377)
					break;
				method1337(102, (byte) 85);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.UA(" + i + ',' + i_73_ + ',' + i_74_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized void method1358(byte i) {
		try {
			if (i != 23)
				((Class98_Sub31_Sub2) this).anIntArray5842 = null;
			for (Class98_Sub44 class98_sub44 = (Class98_Sub44) aClass377_5820.start_iteration(123); class98_sub44 != null; class98_sub44 = (Class98_Sub44) aClass377_5820.iterate_next(-1))
				class98_sub44.method1513(true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.MA(" + i + ')');
		}
	}

	private final void method1359(byte i, long l) {
		try {
			while (l >= aLong5849) {
				int i_75_ = anInt5845;
				int i_76_ = anInt5850;
				long l_77_ = aLong5849;
				while (anInt5850 == i_76_) {
					while ((i_76_ ^ 0xffffffff) == ((((Class173) aClass173_5823).anIntArray1343[i_75_]) ^ 0xffffffff)) {
						aClass173_5823.method2555(i_75_);
						int i_78_ = aClass173_5823.method2559(i_75_);
						if (i_78_ == 1) {
							aClass173_5823.method2553();
							aClass173_5823.method2552(i_75_);
							if (aClass173_5823.method2550()) {
								if (aBoolean5848 && (i_76_ ^ 0xffffffff) != -1)
									aClass173_5823.method2548(l_77_);
								else {
									method1331(true, 0);
									aClass173_5823.method2545();
									return;
								}
							}
							break;
						}
						if ((i_78_ & 0x80 ^ 0xffffffff) != -1 && (i_78_ & 0xf0 ^ 0xffffffff) != -145)
							method1337(i_78_, (byte) 126);
						aClass173_5823.method2556(i_75_);
						aClass173_5823.method2552(i_75_);
					}
					aLong5847 = l_77_;
					i_75_ = aClass173_5823.method2551();
					i_76_ = ((Class173) aClass173_5823).anIntArray1343[i_75_];
					l_77_ = aClass173_5823.method2547(i_76_);
				}
				aLong5849 = l_77_;
				anInt5850 = i_76_;
				anInt5845 = i_75_;
			}
			int i_79_ = 9 % ((-48 - i) / 63);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.WA(" + i + ',' + l + ')');
		}
	}

	final int method1360(int i) {
		try {
			if (i != -16257)
				return -118;
			return anInt5836;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.RA(" + i + ')');
		}
	}

	final void method1361(int i, boolean bool, Class98_Sub16 class98_sub16) {
		do {
			try {
				int i_80_ = (((Class98_Sub24_Sub1) (((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934)).aByteArray5799).length;
				int i_81_;
				do {
					if (bool && ((Class98_Sub24_Sub1) (((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934)).aBoolean5797) {
						int i_82_ = (-((Class98_Sub24_Sub1) (((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934)).anInt5798 + (i_80_ + i_80_));
						i_81_ = (int) ((long) (((Class98_Sub31_Sub2) this).anIntArray5842[(((Class98_Sub16) class98_sub16).anInt3940)]) * (long) i_82_ >> -261318330);
						i_80_ <<= 8;
						if (i_81_ < i_80_)
							break;
						i_81_ = -i_81_ + (i_80_ + i_80_) - 1;
						((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1411(true);
						if (!client.aBoolean3553)
							break;
					}
					i_81_ = (int) ((long) (((Class98_Sub31_Sub2) this).anIntArray5842[(((Class98_Sub16) class98_sub16).anInt3940)]) * (long) i_80_ >> 1204742342);
				} while (false);
				((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1399(i_81_);
				if (i == 1)
					break;
				aBoolean5852 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.L(" + i + ',' + bool + ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method1362(int i, int i_83_, int i_84_) {
		try {
			anIntArray5833[i] = i_84_;
			if (i_83_ != 1)
				method1333(-63);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.S(" + i + ',' + i_83_ + ',' + i_84_ + ')'));
		}
	}

	final synchronized Class98_Sub31 method1322() {
		try {
			return aClass98_Sub31_Sub1_5846;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.B(" + ')');
		}
	}

	final synchronized void method1363(int i, int i_85_, int i_86_) {
		try {
			if (i_85_ >= 0)
				anIntArray5844[i_85_] = i_86_;
			else {
				for (int i_87_ = 0; (i_87_ ^ 0xffffffff) > -17; i_87_++)
					anIntArray5844[i_87_] = i_86_;
			}
			if (i != -17)
				anInt5824 = -115;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.EB(" + i + ',' + i_85_ + ',' + i_86_ + ')'));
		}
	}

	final synchronized void method1364(int i) {
		try {
			if (i <= 84)
				anIntArray5830 = null;
			method1344(-123, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.DB(" + i + ')');
		}
	}

	private final void method1365(int i, int i_88_, int i_89_) {
		try {
			if (i_89_ != 15)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.CB(" + i + ',' + i_88_ + ',' + i_89_ + ')'));
		}
	}

	final synchronized void method1366(int i, byte i_90_) {
		try {
			if (i_90_ <= 7)
				method1337(-49, (byte) -22);
			anInt5836 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.N(" + i + ',' + i_90_ + ')');
		}
	}

	static final void method1367(byte i) {
		try {
			if (!Class4.aBoolean79) {
				Class180.aFloat3405 += (-24.0F - Class180.aFloat3405) / 2.0F;
				if (i == 83) {
					Class64_Sub6.aBoolean3656 = true;
					Class4.aBoolean79 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.VA(" + i + ')');
		}
	}

	private final void method1368(int i, int i_91_) {
		try {
			int i_92_ = 113 / ((i - 30) / 45);
			if ((((Class98_Sub31_Sub2) this).anIntArray5840[i_91_] & 0x4 ^ 0xffffffff) != -1) {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2417(101))) {
					if (i_91_ == ((Class98_Sub16) class98_sub16).anInt3940)
						((Class98_Sub16) class98_sub16).anInt3919 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.SA(" + i + ',' + i_91_ + ')');
		}
	}

	final synchronized void method1325(int[] is, int i, int i_93_) {
		try {
			if (aClass173_5823.method2546()) {
				int i_94_ = (anInt5827 * ((Class173) aClass173_5823).anInt1340 / Class64_Sub15.anInt3678);
				do {
					long l = (long) i_93_ * (long) i_94_ + aLong5847;
					if ((-l + aLong5849 ^ 0xffffffffffffffffL) <= -1L) {
						aLong5847 = l;
						break;
					}
					int i_95_ = (int) ((-1L + (-aLong5847 + (aLong5849 - -(long) i_94_))) / (long) i_94_);
					aLong5847 += (long) i_94_ * (long) i_95_;
					aClass98_Sub31_Sub1_5846.method1325(is, i, i_95_);
					i += i_95_;
					i_93_ -= i_95_;
					method1370(115);
				} while (aClass173_5823.method2546());
			}
			aClass98_Sub31_Sub1_5846.method1325(is, i, i_93_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_93_ + ')'));
		}
	}

	private final void method1369(int i, int i_96_) {
		try {
			if ((0x2 & ((Class98_Sub31_Sub2) this).anIntArray5840[i]) != 0) {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) aClass98_Sub31_Sub1_5846).aClass148_5817.method2417(110))) {
					if (((Class98_Sub16) class98_sub16).anInt3940 == i && ((aClass98_Sub16ArrayArray5825[i][((Class98_Sub16) class98_sub16).anInt3936]) == null) && (((Class98_Sub16) class98_sub16).anInt3930 ^ 0xffffffff) > -1)
						((Class98_Sub16) class98_sub16).anInt3930 = 0;
				}
			}
			int i_97_ = -112 % ((i_96_ - -46) / 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.K(" + i + ',' + i_96_ + ')');
		}
	}

	private final void method1370(int i) {
		do {
			try {
				int i_98_ = anInt5845;
				if (i <= 112)
					method1344(-33, false);
				int i_99_ = anInt5850;
				long l = aLong5849;
				if (aClass98_Sub7_5851 != null && (i_99_ ^ 0xffffffff) == (anInt5853 ^ 0xffffffff)) {
					method1343(aClass98_Sub7_5851, aBoolean5852, aBoolean5848, 90);
					method1370(124);
				} else {
					while ((i_99_ ^ 0xffffffff) == (anInt5850 ^ 0xffffffff)) {
						while (((((Class173) aClass173_5823).anIntArray1343[i_98_]) ^ 0xffffffff) == (i_99_ ^ 0xffffffff)) {
							aClass173_5823.method2555(i_98_);
							int i_100_ = aClass173_5823.method2559(i_98_);
							if (i_100_ == 1) {
								aClass173_5823.method2553();
								aClass173_5823.method2552(i_98_);
								if (aClass173_5823.method2550()) {
									if (aClass98_Sub7_5851 != null) {
										method1332(aBoolean5848, aClass98_Sub7_5851, (byte) -4);
										method1370(119);
										return;
									}
									if (aBoolean5848 && i_99_ != 0)
										aClass173_5823.method2548(l);
									else {
										method1331(true, 0);
										aClass173_5823.method2545();
										return;
									}
								}
								break;
							}
							if ((0x80 & i_100_) != 0)
								method1337(i_100_, (byte) 127);
							aClass173_5823.method2556(i_98_);
							aClass173_5823.method2552(i_98_);
						}
						i_98_ = aClass173_5823.method2551();
						i_99_ = (((Class173) aClass173_5823).anIntArray1343[i_98_]);
						l = aClass173_5823.method2547(i_99_);
					}
					anInt5850 = i_99_;
					anInt5845 = i_98_;
					aLong5849 = l;
					if (aClass98_Sub7_5851 == null || anInt5853 >= i_99_)
						break;
					anInt5845 = -1;
					anInt5850 = anInt5853;
					aLong5849 = aClass173_5823.method2547(anInt5850);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jga.KA(" + i + ')');
			}
			break;
		} while (false);
	}

	final synchronized int method1326() {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.G(" + ')');
		}
	}

	public Class98_Sub31_Sub2() {
		anIntArray5821 = new int[16];
		aClass98_Sub16ArrayArray5825 = new Class98_Sub16[16][128];
		aClass98_Sub16ArrayArray5828 = new Class98_Sub16[16][128];
		anIntArray5830 = new int[16];
		anIntArray5826 = new int[16];
		anIntArray5831 = new int[16];
		anIntArray5833 = new int[16];
		anIntArray5834 = new int[16];
		anIntArray5829 = new int[16];
		anIntArray5837 = new int[16];
		anInt5827 = 1000000;
		((Class98_Sub31_Sub2) this).anIntArray5840 = new int[16];
		anIntArray5839 = new int[16];
		anInt5836 = 256;
		((Class98_Sub31_Sub2) this).anIntArray5842 = new int[16];
		anIntArray5841 = new int[16];
		((Class98_Sub31_Sub2) this).anIntArray5843 = new int[16];
		anIntArray5819 = new int[16];
		anIntArray5844 = new int[16];
		anIntArray5835 = new int[16];
		aClass173_5823 = new Class173();
		aClass98_Sub31_Sub1_5846 = new Class98_Sub31_Sub1(this);
		try {
			aClass377_5820 = new Class377(128);
			method1363(-17, -1, 256);
			method1331(true, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.<init>(" + ')');
		}
	}

	Class98_Sub31_Sub2(Class98_Sub31_Sub2 class98_sub31_sub2_101_) {
		anIntArray5821 = new int[16];
		aClass98_Sub16ArrayArray5825 = new Class98_Sub16[16][128];
		aClass98_Sub16ArrayArray5828 = new Class98_Sub16[16][128];
		anIntArray5830 = new int[16];
		anIntArray5826 = new int[16];
		anIntArray5831 = new int[16];
		anIntArray5833 = new int[16];
		anIntArray5834 = new int[16];
		anIntArray5829 = new int[16];
		anIntArray5837 = new int[16];
		anInt5827 = 1000000;
		((Class98_Sub31_Sub2) this).anIntArray5840 = new int[16];
		anIntArray5839 = new int[16];
		anInt5836 = 256;
		((Class98_Sub31_Sub2) this).anIntArray5842 = new int[16];
		anIntArray5841 = new int[16];
		((Class98_Sub31_Sub2) this).anIntArray5843 = new int[16];
		anIntArray5819 = new int[16];
		anIntArray5844 = new int[16];
		anIntArray5835 = new int[16];
		aClass173_5823 = new Class173();
		aClass98_Sub31_Sub1_5846 = new Class98_Sub31_Sub1(this);
		try {
			aClass377_5820 = class98_sub31_sub2_101_.aClass377_5820;
			method1363(-17, -1, 256);
			method1331(true, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.<init>(" + (class98_sub31_sub2_101_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt5824 = 0;
		anInt5822 = 0;
	}
}
