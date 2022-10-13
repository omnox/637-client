/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class267 {
	private String[] aStringArray1996 = new String[0];
	private int anInt1997 = -1;
	static long aLong1998;
	private int anInt1999;
	static OutgoingOpcode aClass171_2000 = new OutgoingOpcode(83, 12);
	private boolean aBoolean2001 = false;
	static Class218 aClass218_2002;

	public static void method3240(int i) {
		do {
			try {
				aClass171_2000 = null;
				aClass218_2002 = null;
				if (i == 1)
					break;
				aClass218_2002 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qm.H(" + i + ')');
			}
			break;
		} while (false);
	}

	private final int method3241(int i, byte i_0_) {
		try {
			int i_1_ = 119 % ((19 - i_0_) / 62);
			int i_2_ = aStringArray1996.length;
			while (i >= i_2_) {
				if (aBoolean2001) {
					if (i_2_ == 0)
						i_2_ = 1;
					else
						i_2_ *= anInt1999;
				} else
					i_2_ += anInt1999;
			}
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qm.D(" + i + ',' + i_0_ + ')');
		}
	}

	public final String toString() {
		try {
			StringBuffer stringbuffer = new StringBuffer();
			stringbuffer.append("[");
			for (int i = 0; anInt1997 > i; i++) {
				if (i != 0)
					stringbuffer.append(", ");
				stringbuffer.append(aStringArray1996[i]);
			}
			stringbuffer.append("]");
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qm.toString(" + ')');
		}
	}

	private final void method3242(int i, int i_3_) {
		try {
			if (i <= 43)
				aBoolean2001 = true;
			String[] strings = new String[method3241(i_3_, (byte) 89)];
			Class236.method2892(aStringArray1996, 0, strings, 0, aStringArray1996.length);
			aStringArray1996 = strings;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qm.F(" + i + ',' + i_3_ + ')');
		}
	}

	static final boolean method3243(int i, int i_4_, byte i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			if (i_8_ > 2000 || i_10_ > 2000 || i_7_ > 2000 || i_4_ > 2000 || i > 2000 || i_9_ > 2000)
				return false;
			if (i_8_ < -2000 || i_10_ < -2000 || i_7_ < -2000 || i_4_ < -2000 || i < -2000 || i_9_ < -2000)
				return false;
			if (Class287.anInt2190 == 2) {
				int i_13_ = i_8_ * Class64_Sub3.anInt3646 + i_4_;
				if (i_13_ >= 0 && (i_13_ < Class111_Sub3.anIntArray4707.length) && (Class111_Sub3.anIntArray4707[i_13_] > (i_11_ << 8) - 38400))
					return false;
				i_13_ = i - -(i_10_ * Class64_Sub3.anInt3646);
				if (i_13_ >= 0 && (i_13_ < Class111_Sub3.anIntArray4707.length) && (Class111_Sub3.anIntArray4707[i_13_] > (i_6_ << 8) - 38400))
					return false;
				i_13_ = i_9_ + i_7_ * Class64_Sub3.anInt3646;
				if (i_13_ >= 0 && i_13_ < Class111_Sub3.anIntArray4707.length && ((i_12_ << 8) - 38400 < Class111_Sub3.anIntArray4707[i_13_]))
					return false;
			}
			int i_14_ = i - i_4_;
			int i_15_ = -i_8_ + i_10_;
			if (i_5_ <= 70)
				return false;
			int i_16_ = i_9_ + -i_4_;
			int i_17_ = i_7_ + -i_8_;
			int i_18_ = i_6_ + -i_11_;
			int i_19_ = -i_11_ + i_12_;
			if (i_10_ <= i_8_ || i_7_ <= i_7_) {
				if (i_10_ < i_7_) {
					if (i_8_ <= i_7_)
						i_7_++;
					else
						i_8_++;
					i_10_--;
				} else {
					if (i_10_ >= i_8_)
						i_10_++;
					else
						i_8_++;
					i_7_--;
				}
			} else {
				i_8_--;
				if (i_10_ <= i_7_)
					i_7_++;
				else
					i_10_++;
			}
			int i_20_ = 0;
			if (i_8_ != i_10_)
				i_20_ = (-i_4_ + i << 12) / (i_10_ - i_8_);
			int i_21_ = 0;
			if (i_7_ != i_10_)
				i_21_ = (i_9_ - i << 12) / (-i_10_ + i_7_);
			int i_22_ = 0;
			if (i_8_ != i_7_)
				i_22_ = (-i_9_ + i_4_ << 12) / (i_8_ + -i_7_);
			int i_23_ = -(i_16_ * i_15_) + i_17_ * i_14_;
			if (i_23_ == 0)
				return false;
			int i_24_ = (i_18_ * i_17_ + -(i_15_ * i_19_) << 8) / i_23_;
			int i_25_ = (i_14_ * i_19_ + -(i_16_ * i_18_) << 8) / i_23_;
			if (i_10_ >= i_8_ && i_8_ <= i_7_) {
				if (IncomingOpcode.anInt461 <= i_8_)
					return true;
				if (i_7_ > IncomingOpcode.anInt461)
					i_7_ = IncomingOpcode.anInt461;
				i_11_ = i_24_ + ((i_11_ << 8) - i_4_ * i_24_);
				if (IncomingOpcode.anInt461 < i_10_)
					i_10_ = IncomingOpcode.anInt461;
				if (i_7_ <= i_10_) {
					i = i_4_ <<= 1146700236;
					if (i_8_ < 0) {
						i_4_ -= i_8_ * i_20_;
						i_11_ -= i_25_ * i_8_;
						i -= i_8_ * i_22_;
						i_8_ = 0;
					}
					i_9_ <<= 1975846892;
					if (i_7_ < 0) {
						i_9_ -= i_21_ * i_7_;
						i_7_ = 0;
					}
					if (i_8_ != i_7_ && i_22_ < i_20_ || (i_8_ == i_7_ && i_21_ > i_20_)) {
						i_10_ -= i_7_;
						i_7_ -= i_8_;
						i_8_ = Class64_Sub3.anInt3646 * i_8_;
						while (--i_7_ >= 0) {
							if (!Class288.method3400((i >> 12) + -1, i_24_, i_8_, 0, i_11_, (byte) -119, (i_4_ >> 12) + 1, (Class111_Sub3.anIntArray4707)))
								return false;
							i_11_ += i_25_;
							i_4_ += i_20_;
							i += i_22_;
							i_8_ += Class64_Sub3.anInt3646;
						}
						while (--i_10_ >= 0) {
							if (!Class288.method3400((i_9_ >> 12) + -1, i_24_, i_8_, 0, i_11_, (byte) -108, (i_4_ >> 12) + 1, (Class111_Sub3.anIntArray4707)))
								return false;
							i_9_ += i_21_;
							i_11_ += i_25_;
							i_4_ += i_20_;
							i_8_ += Class64_Sub3.anInt3646;
						}
						return true;
					}
					i_10_ -= i_7_;
					i_7_ -= i_8_;
					i_8_ = Class64_Sub3.anInt3646 * i_8_;
					while (--i_7_ >= 0) {
						if (!Class288.method3400(-1 + (i_4_ >> 12), i_24_, i_8_, 0, i_11_, (byte) -30, (i >> 12) + 1, Class111_Sub3.anIntArray4707))
							return false;
						i_4_ += i_20_;
						i += i_22_;
						i_11_ += i_25_;
						i_8_ += Class64_Sub3.anInt3646;
					}
					while (--i_10_ >= 0) {
						if (!Class288.method3400((i_4_ >> 12) - 1, i_24_, i_8_, 0, i_11_, (byte) -38, (i_9_ >> 12) + 1, Class111_Sub3.anIntArray4707))
							return false;
						i_4_ += i_20_;
						i_11_ += i_25_;
						i_9_ += i_21_;
						i_8_ += Class64_Sub3.anInt3646;
					}
					return true;
				}
				i_9_ = i_4_ <<= -2042674164;
				i <<= 589237868;
				if (i_8_ < 0) {
					i_4_ -= i_20_ * i_8_;
					i_9_ -= i_22_ * i_8_;
					i_11_ -= i_25_ * i_8_;
					i_8_ = 0;
				}
				if (i_10_ < 0) {
					i -= i_21_ * i_10_;
					i_10_ = 0;
				}
				if ((i_10_ != i_8_ && i_20_ > i_22_) || (i_8_ == i_10_ && i_21_ < i_22_)) {
					i_7_ -= i_10_;
					i_10_ -= i_8_;
					i_8_ = Class64_Sub3.anInt3646 * i_8_;
					while (--i_10_ >= 0) {
						if (!Class288.method3400(-1 + (i_9_ >> 12), i_24_, i_8_, 0, i_11_, (byte) -104, 1 + (i_4_ >> 12), Class111_Sub3.anIntArray4707))
							return false;
						i_4_ += i_20_;
						i_9_ += i_22_;
						i_8_ += Class64_Sub3.anInt3646;
						i_11_ += i_25_;
					}
					while (--i_7_ >= 0) {
						if (!Class288.method3400(-1 + (i_9_ >> 12), i_24_, i_8_, 0, i_11_, (byte) -59, 1 + (i >> 12), Class111_Sub3.anIntArray4707))
							return false;
						i += i_21_;
						i_8_ += Class64_Sub3.anInt3646;
						i_11_ += i_25_;
						i_9_ += i_22_;
					}
					return true;
				}
				i_7_ -= i_10_;
				i_10_ -= i_8_;
				i_8_ = Class64_Sub3.anInt3646 * i_8_;
				while (--i_10_ >= 0) {
					if (!Class288.method3400(-1 + (i_4_ >> 12), i_24_, i_8_, 0, i_11_, (byte) -70, 1 + (i_9_ >> 12), Class111_Sub3.anIntArray4707))
						return false;
					i_11_ += i_25_;
					i_8_ += Class64_Sub3.anInt3646;
					i_4_ += i_20_;
					i_9_ += i_22_;
				}
				while (--i_7_ >= 0) {
					if (!Class288.method3400(-1 + (i >> 12), i_24_, i_8_, 0, i_11_, (byte) -32, 1 + (i_9_ >> 12), Class111_Sub3.anIntArray4707))
						return false;
					i_9_ += i_22_;
					i_11_ += i_25_;
					i += i_21_;
					i_8_ += Class64_Sub3.anInt3646;
				}
				return true;
			}
			if (i_10_ > i_7_) {
				if (IncomingOpcode.anInt461 <= i_7_)
					return true;
				if (IncomingOpcode.anInt461 < i_10_)
					i_10_ = IncomingOpcode.anInt461;
				i_12_ = (i_12_ << 8) - i_9_ * i_24_ + i_24_;
				if (i_8_ > IncomingOpcode.anInt461)
					i_8_ = IncomingOpcode.anInt461;
				if (i_8_ >= i_10_) {
					i_4_ = i_9_ <<= -1618820564;
					if (i_7_ < 0) {
						i_4_ -= i_7_ * i_21_;
						i_9_ -= i_7_ * i_22_;
						i_12_ -= i_25_ * i_7_;
						i_7_ = 0;
					}
					i <<= 1191847468;
					if (i_10_ < 0) {
						i -= i_10_ * i_20_;
						i_10_ = 0;
					}
					if (i_22_ <= i_21_) {
						i_8_ -= i_10_;
						i_10_ -= i_7_;
						i_7_ = Class64_Sub3.anInt3646 * i_7_;
						while (--i_10_ >= 0) {
							if (!Class288.method3400(-1 + (i_9_ >> 12), i_24_, i_7_, 0, i_12_, (byte) -62, 1 + (i_4_ >> 12), (Class111_Sub3.anIntArray4707)))
								return false;
							i_7_ += Class64_Sub3.anInt3646;
							i_12_ += i_25_;
							i_4_ += i_21_;
							i_9_ += i_22_;
						}
						while (--i_8_ >= 0) {
							if (!Class288.method3400(-1 + (i_9_ >> 12), i_24_, i_7_, 0, i_12_, (byte) -104, (i >> 12) + 1, (Class111_Sub3.anIntArray4707)))
								return false;
							i += i_20_;
							i_9_ += i_22_;
							i_12_ += i_25_;
							i_7_ += Class64_Sub3.anInt3646;
						}
						return true;
					}
					i_8_ -= i_10_;
					i_10_ -= i_7_;
					i_7_ = Class64_Sub3.anInt3646 * i_7_;
					while (--i_10_ >= 0) {
						if (!Class288.method3400(-1 + (i_4_ >> 12), i_24_, i_7_, 0, i_12_, (byte) -24, 1 + (i_9_ >> 12), Class111_Sub3.anIntArray4707))
							return false;
						i_12_ += i_25_;
						i_9_ += i_22_;
						i_4_ += i_21_;
						i_7_ += Class64_Sub3.anInt3646;
					}
					while (--i_8_ >= 0) {
						if (!Class288.method3400(-1 + (i >> 12), i_24_, i_7_, 0, i_12_, (byte) -31, 1 + (i_9_ >> 12), Class111_Sub3.anIntArray4707))
							return false;
						i_12_ += i_25_;
						i_7_ += Class64_Sub3.anInt3646;
						i_9_ += i_22_;
						i += i_20_;
					}
					return true;
				}
				i = i_9_ <<= 771320364;
				if (i_7_ < 0) {
					i -= i_21_ * i_7_;
					i_12_ -= i_25_ * i_7_;
					i_9_ -= i_7_ * i_22_;
					i_7_ = 0;
				}
				i_4_ <<= -162226260;
				if (i_8_ < 0) {
					i_4_ -= i_8_ * i_20_;
					i_8_ = 0;
				}
				if (i_21_ >= i_22_) {
					i_10_ -= i_8_;
					i_8_ -= i_7_;
					i_7_ = Class64_Sub3.anInt3646 * i_7_;
					while (--i_8_ >= 0) {
						if (!Class288.method3400(-1 + (i_9_ >> 12), i_24_, i_7_, 0, i_12_, (byte) -57, 1 + (i >> 12), Class111_Sub3.anIntArray4707))
							return false;
						i_9_ += i_22_;
						i_12_ += i_25_;
						i_7_ += Class64_Sub3.anInt3646;
						i += i_21_;
					}
					while (--i_10_ >= 0) {
						if (!Class288.method3400(-1 + (i_4_ >> 12), i_24_, i_7_, 0, i_12_, (byte) -76, 1 + (i >> 12), Class111_Sub3.anIntArray4707))
							return false;
						i_4_ += i_20_;
						i_7_ += Class64_Sub3.anInt3646;
						i_12_ += i_25_;
						i += i_21_;
					}
					return true;
				}
				i_10_ -= i_8_;
				i_8_ -= i_7_;
				i_7_ *= Class64_Sub3.anInt3646;
				while (--i_8_ >= 0) {
					if (!Class288.method3400(-1 + (i >> 12), i_24_, i_7_, 0, i_12_, (byte) -85, 1 + (i_9_ >> 12), Class111_Sub3.anIntArray4707))
						return false;
					i_12_ += i_25_;
					i += i_21_;
					i_9_ += i_22_;
					i_7_ += Class64_Sub3.anInt3646;
				}
				while (--i_10_ >= 0) {
					if (!Class288.method3400((i >> 12) + -1, i_24_, i_7_, 0, i_12_, (byte) -21, (i_4_ >> 12) - -1, Class111_Sub3.anIntArray4707))
						return false;
					i += i_21_;
					i_12_ += i_25_;
					i_7_ += Class64_Sub3.anInt3646;
					i_4_ += i_20_;
				}
				return true;
			}
			if (i_10_ >= IncomingOpcode.anInt461)
				return true;
			if (IncomingOpcode.anInt461 < i_8_)
				i_8_ = IncomingOpcode.anInt461;
			i_6_ = -(i * i_24_) + ((i_6_ << 8) + i_24_);
			if (IncomingOpcode.anInt461 < i_7_)
				i_7_ = IncomingOpcode.anInt461;
			if (i_7_ < i_8_) {
				i_4_ = i <<= -975458356;
				if (i_10_ < 0) {
					i_4_ -= i_20_ * i_10_;
					i_6_ -= i_10_ * i_25_;
					i -= i_21_ * i_10_;
					i_10_ = 0;
				}
				i_9_ <<= -704552628;
				if (i_7_ < 0) {
					i_9_ -= i_22_ * i_7_;
					i_7_ = 0;
				}
				if ((i_7_ == i_10_ || i_20_ >= i_21_) && (i_10_ != i_7_ || i_20_ <= i_22_)) {
					i_8_ -= i_7_;
					i_7_ -= i_10_;
					i_10_ *= Class64_Sub3.anInt3646;
					while (--i_7_ >= 0) {
						if (!Class288.method3400(-1 + (i >> 12), i_24_, i_10_, 0, i_6_, (byte) -87, (i_4_ >> 12) - -1, Class111_Sub3.anIntArray4707))
							return false;
						i_10_ += Class64_Sub3.anInt3646;
						i_6_ += i_25_;
						i_4_ += i_20_;
						i += i_21_;
					}
					while (--i_8_ >= 0) {
						if (!Class288.method3400((i_9_ >> 12) + -1, i_24_, i_10_, 0, i_6_, (byte) -74, (i_4_ >> 12) - -1, Class111_Sub3.anIntArray4707))
							return false;
						i_6_ += i_25_;
						i_9_ += i_22_;
						i_4_ += i_20_;
						i_10_ += Class64_Sub3.anInt3646;
					}
					return true;
				}
				i_8_ -= i_7_;
				i_7_ -= i_10_;
				i_10_ *= Class64_Sub3.anInt3646;
				while (--i_7_ >= 0) {
					if (!Class288.method3400((i_4_ >> 12) + -1, i_24_, i_10_, 0, i_6_, (byte) -113, (i >> 12) - -1, Class111_Sub3.anIntArray4707))
						return false;
					i_10_ += Class64_Sub3.anInt3646;
					i += i_21_;
					i_6_ += i_25_;
					i_4_ += i_20_;
				}
				while (--i_8_ >= 0) {
					if (!Class288.method3400(-1 + (i_4_ >> 12), i_24_, i_10_, 0, i_6_, (byte) -123, 1 + (i_9_ >> 12), Class111_Sub3.anIntArray4707))
						return false;
					i_10_ += Class64_Sub3.anInt3646;
					i_6_ += i_25_;
					i_9_ += i_22_;
					i_4_ += i_20_;
				}
				return true;
			}
			i_9_ = i <<= 1287486668;
			if (i_10_ < 0) {
				i -= i_21_ * i_10_;
				i_9_ -= i_20_ * i_10_;
				i_6_ -= i_25_ * i_10_;
				i_10_ = 0;
			}
			i_4_ <<= 1244265292;
			if (i_8_ < 0) {
				i_4_ -= i_22_ * i_8_;
				i_8_ = 0;
			}
			if (i_20_ >= i_21_) {
				i_7_ -= i_8_;
				i_8_ -= i_10_;
				i_10_ *= Class64_Sub3.anInt3646;
				while (--i_8_ >= 0) {
					if (!Class288.method3400(-1 + (i >> 12), i_24_, i_10_, 0, i_6_, (byte) -126, 1 + (i_9_ >> 12), Class111_Sub3.anIntArray4707))
						return false;
					i += i_21_;
					i_9_ += i_20_;
					i_10_ += Class64_Sub3.anInt3646;
					i_6_ += i_25_;
				}
				while (--i_7_ >= 0) {
					if (!Class288.method3400((i >> 12) + -1, i_24_, i_10_, 0, i_6_, (byte) -96, 1 + (i_4_ >> 12), Class111_Sub3.anIntArray4707))
						return false;
					i += i_21_;
					i_10_ += Class64_Sub3.anInt3646;
					i_6_ += i_25_;
					i_4_ += i_22_;
				}
				return true;
			}
			i_7_ -= i_8_;
			i_8_ -= i_10_;
			i_10_ = Class64_Sub3.anInt3646 * i_10_;
			while (--i_8_ >= 0) {
				if (!Class288.method3400((i_9_ >> 12) + -1, i_24_, i_10_, 0, i_6_, (byte) -87, 1 + (i >> 12), Class111_Sub3.anIntArray4707))
					return false;
				i_9_ += i_20_;
				i_6_ += i_25_;
				i_10_ += Class64_Sub3.anInt3646;
				i += i_21_;
			}
			while (--i_7_ >= 0) {
				if (!Class288.method3400(-1 + (i_4_ >> 12), i_24_, i_10_, 0, i_6_, (byte) -95, 1 + (i >> 12), Class111_Sub3.anIntArray4707))
					return false;
				i_4_ += i_22_;
				i_6_ += i_25_;
				i += i_21_;
				i_10_ += Class64_Sub3.anInt3646;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qm.A(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	final String[] method3244(int i) {
		try {
			String[] strings = new String[1 + anInt1997];
			Class236.method2892(aStringArray1996, 0, strings, 0, anInt1997 + 1);
			if (i != 20780)
				method3242(11, 74);
			return strings;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qm.C(" + i + ')');
		}
	}

	final void method3245(String string, int i) {
		do {
			try {
				method3246(string, 1 + anInt1997, i ^ 0x1);
				if (i == 0)
					break;
				method3246(null, -34, -116);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qm.E(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method3246(String string, int i, int i_26_) {
		try {
			if (i > anInt1997)
				anInt1997 = i;
			if (i_26_ == 1) {
				if (aStringArray1996.length <= i)
					method3242(104, i);
				aStringArray1996[i] = string;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qm.G(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ')'));
		}
	}

	static final void method3247(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		do {
			try {
				do {
					if ((-i_30_ + i_28_ >= Class76_Sub8.anInt3778) && Class3.anInt77 >= i_28_ + i_30_ && (Class98_Sub10_Sub38.anInt5753 <= i + -i_30_) && (i - -i_30_ <= Class218.anInt1635)) {
						Class10.method196(-119, i_27_, i_30_, i_28_, i_29_, i_31_, i);
						if (!client.aBoolean3553)
							break;
					}
					Class29.method303(i_30_, i_29_, i_27_, (byte) 93, i, i_28_, i_31_);
				} while (false);
				if (i_32_ == 1333849452)
					break;
				method3240(-70);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qm.B(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'));
			}
			break;
		} while (false);
	}

	Class267(int i, boolean bool) {
		try {
			anInt1999 = i;
			aBoolean2001 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qm.<init>(" + i + ',' + bool + ')');
		}
	}
}
