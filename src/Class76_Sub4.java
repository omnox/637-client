/* Class76_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76_Sub4 extends Class76 {
	static Class377 aClass377_3738 = new Class377(16);
	private boolean aBoolean3739;
	private Interface4_Impl3[] anInterface4_Impl3Array3740;
	private boolean aBoolean3741 = false;

	public static void method753(int i) {
		try {
			int i_0_ = 45 % ((i - 41) / 34);
			aClass377_3738 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iea.O(" + i + ')');
		}
	}

	static final void method754(int i, boolean bool, int i_1_) {
		try {
			int i_2_ = -109 % ((-57 - i_1_) / 58);
			Class151_Sub9.method2472(true, TextResources.LOADING_PLEASE_WAIT.get_text(Class374.anInt3159), i, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iea.F(" + i + ',' + bool + ',' + i_1_ + ')'));
		}
	}

	Class76_Sub4(ha_Sub3 var_ha_Sub3) {
		super(var_ha_Sub3);
		do {
			try {
				if (!((ha_Sub3) var_ha_Sub3).aBoolean4569)
					break;
				aBoolean3739 = (((ha_Sub3) var_ha_Sub3).anInt4608 ^ 0xffffffff) > -4;
				int i = !aBoolean3739 ? 127 : 48;
				int[][] is = new int[6][4096];
				int[][] is_3_ = new int[6][4096];
				int[][] is_4_ = new int[6][4096];
				int i_5_ = 0;
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -65; i_6_++) {
					for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -65; i_7_++) {
						float f = -1.0F + 2.0F * (float) i_7_ / 64.0F;
						float f_8_ = 2.0F * (float) i_6_ / 64.0F - 1.0F;
						float f_9_ = (float) (1.0 / Math.sqrt((double) (1.0F + f * f + f_8_ * f_8_)));
						f *= f_9_;
						f_8_ *= f_9_;
						for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -7; i_10_++) {
							float f_11_;
							if ((i_10_ ^ 0xffffffff) == -1)
								f_11_ = -f;
							else if (i_10_ == 1)
								f_11_ = f;
							else if ((i_10_ ^ 0xffffffff) == -3)
								f_11_ = f_8_;
							else if ((i_10_ ^ 0xffffffff) == -4)
								f_11_ = -f_8_;
							else if (i_10_ == 4)
								f_11_ = f_9_;
							else
								f_11_ = -f_9_;
							int i_12_;
							int i_13_;
							int i_14_;
							if (f_11_ > 0.0F) {
								i_12_ = (int) (Math.pow((double) f_11_, 96.0) * (double) i);
								i_13_ = (int) (Math.pow((double) f_11_, 36.0) * (double) i);
								i_14_ = (int) (Math.pow((double) f_11_, 12.0) * (double) i);
							} else
								i_12_ = i_13_ = i_14_ = 0;
							is_3_[i_10_][i_5_] = i_12_ << -1449782824;
							is_4_[i_10_][i_5_] = i_13_ << 1473485688;
							is[i_10_][i_5_] = i_14_ << -11137256;
						}
						i_5_++;
					}
				}
				anInterface4_Impl3Array3740 = new Interface4_Impl3[3];
				anInterface4_Impl3Array3740[0] = ((Class76) this).aHa_Sub3_585.method1934(8, false, is_3_, 64);
				anInterface4_Impl3Array3740[1] = ((Class76) this).aHa_Sub3_585.method1934(8, false, is_4_, 64);
				anInterface4_Impl3Array3740[2] = ((Class76) this).aHa_Sub3_585.method1934(8, false, is, 64);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("iea.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final int method755(boolean bool, String string) {
		try {
			int i = 0;
			if (bool != false)
				return -79;
			for (/**/; ((Class366.aStringArray3113.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
				if (Class366.aStringArray3113[i].equalsIgnoreCase(string))
					return i;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iea.A(" + bool + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method748(int i, boolean bool) {
		try {
			if (i != 69)
				aBoolean3741 = true;
			if (anInterface4_Impl3Array3740 == null || !bool)
				((Class76) this).aHa_Sub3_585.method1953(-74, Class98_Sub43_Sub3.aClass65_5926, 0);
			else {
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
				((Class76) this).aHa_Sub3_585.method1964(Class357.aClass38_3026, (byte) 26);
				Class111_Sub3 class111_sub3 = ((Class76) this).aHa_Sub3_585.method1957((byte) -92);
				class111_sub3.method2107(1024);
				((Class76) this).aHa_Sub3_585.method2008(Class144.aClass258_1168, (byte) 125);
				do {
					if (!aBoolean3739) {
						((Class76) this).aHa_Sub3_585.method2019(Class249.aClass128_1903, Class288.aClass128_3381, 22831);
						((Class76) this).aHa_Sub3_585.method2051(0, -60, IncomingOpcode.aClass65_459);
						((Class76) this).aHa_Sub3_585.method1951((byte) 120, 2);
						((Class76) this).aHa_Sub3_585.method2019(Class288.aClass128_3381, Class1.aClass128_64, 22831);
						((Class76) this).aHa_Sub3_585.method2051(0, i + -183, IncomingOpcode.aClass65_459);
						((Class76) this).aHa_Sub3_585.method2026(1, true, (byte) 27, IncomingOpcode.aClass65_459, false);
						((Class76) this).aHa_Sub3_585.method1953(i + -177, Class98_Sub43_Sub3.aClass65_5926, 0);
						((Class76) this).aHa_Sub3_585.method2005((((ha_Sub3) ((Class76) this).aHa_Sub3_585).anInterface4_4586), -114);
						if (!client.aBoolean3553)
							break;
					}
					((Class76) this).aHa_Sub3_585.method2019(Class288.aClass128_3381, Class1.aClass128_64, 22831);
					((Class76) this).aHa_Sub3_585.method2026(0, true, (byte) 27, (Class300.aClass65_2499), false);
					((Class76) this).aHa_Sub3_585.method1953(-123, Class98_Sub43_Sub3.aClass65_5926, 0);
				} while (false);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
				aBoolean3741 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iea.B(" + i + ',' + bool + ')');
		}
	}

	final void method743(int i, boolean bool) {
		try {
			if (i <= 93)
				method755(false, null);
			((Class76) this).aHa_Sub3_585.method2019(Class288.aClass128_3381, Class249.aClass128_1903, 22831);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iea.D(" + i + ',' + bool + ')');
		}
	}

	final void method742(int i, int i_15_, Interface4 interface4) {
		try {
			((Class76) this).aHa_Sub3_585.method2005(interface4, 89);
			if (i != 6)
				method753(49);
			((Class76) this).aHa_Sub3_585.method2015(i_15_, (byte) 36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iea.I(" + i + ',' + i_15_ + ',' + (interface4 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method739(int i) {
		try {
			if (i != -2)
				aBoolean3741 = true;
			if (aBoolean3741) {
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
				((Class76) this).aHa_Sub3_585.method2005(null, i ^ 0x7c);
				((Class76) this).aHa_Sub3_585.method1964(r_Sub2.aClass38_6334, (byte) 26);
				((Class76) this).aHa_Sub3_585.method1985(2);
				if (!aBoolean3739) {
					((Class76) this).aHa_Sub3_585.method2019((Class249.aClass128_1903), (Class249.aClass128_1903), 22831);
					((Class76) this).aHa_Sub3_585.method2051(0, -55, Class300.aClass65_2499);
					((Class76) this).aHa_Sub3_585.method1951((byte) 120, 2);
					((Class76) this).aHa_Sub3_585.method2019((Class249.aClass128_1903), (Class249.aClass128_1903), 22831);
					((Class76) this).aHa_Sub3_585.method2051(0, -110, Class300.aClass65_2499);
					((Class76) this).aHa_Sub3_585.method2051(1, -56, IncomingOpcode.aClass65_459);
					((Class76) this).aHa_Sub3_585.method1953(i ^ 0x56, Class300.aClass65_2499, 0);
					((Class76) this).aHa_Sub3_585.method2005(null, -120);
				} else {
					((Class76) this).aHa_Sub3_585.method2019((Class249.aClass128_1903), (Class249.aClass128_1903), 22831);
					((Class76) this).aHa_Sub3_585.method2051(0, -114, Class300.aClass65_2499);
					((Class76) this).aHa_Sub3_585.method1953(-120, Class300.aClass65_2499, 0);
				}
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
				aBoolean3741 = false;
			} else
				((Class76) this).aHa_Sub3_585.method1953(i + -83, Class300.aClass65_2499, 0);
			((Class76) this).aHa_Sub3_585.method2019(Class249.aClass128_1903, Class249.aClass128_1903, i + 22833);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iea.C(" + i + ')');
		}
	}

	final void method746(int i, int i_16_, int i_17_) {
		try {
			if (i_17_ >= -75)
				aBoolean3741 = false;
			if (aBoolean3741) {
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
				((Class76) this).aHa_Sub3_585.method2005(anInterface4_Impl3Array3740[i + -1], -125);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iea.E(" + i + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	final boolean method745(byte i) {
		try {
			if (i != 27)
				method746(56, 65, -40);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iea.H(" + i + ')');
		}
	}

	static final void method756(int i, String string) {
		try {
			if (Class374.aClass147Array3157 != null) {
				if (i >= -60)
					aClass377_3738 = null;
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, Class59.aClass171_468, Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte(r_Sub2.method1650(string, (byte) 98));
				((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iea.G(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}
}
