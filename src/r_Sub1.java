
/* r_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class r_Sub1 extends r {
	int anInt6320;
	static Class79 aClass79_6321;
	static long aLong6322 = -1L;
	int anInt6323;
	int anInt6324;
	byte[] aByteArray6325;
	int anInt6326;

	static final boolean method1642(byte i) {
		try {
			if (Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066 == null)
				return false;
			if (Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066.anInt5990 >= 2000)
				Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066.anInt5990 -= 2000;
			if (Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066.anInt5990 == 1006)
				return true;
			if (i <= 121)
				aClass79_6321 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "en.E(" + i + ')');
		}
	}

	final void method1643(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			this.anInt6326 = -i_2_ + i_0_;
			this.anInt6320 = i_2_;
			if (i_3_ == -1) {
				this.anInt6323 = -i + i_1_;
				this.anInt6324 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method1644(int i) {
		do {
			try {
				aClass79_6321 = null;
				if (i == 9949)
					break;
				aLong6322 = -46L;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "en.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1645(int i) {
		try {
			OutputStream_Sub2.anIntArray42 = null;
			Class145.anIntArray1175 = null;
			int i_4_ = -102 % ((-49 - i) / 54);
			Class98_Sub9.aBoolean3851 = false;
			Class284_Sub1.anIntArray5178 = null;
			Class138.anIntArray1083 = null;
			RenderAnimDefinitions.anIntArray2406 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "en.B(" + i + ')');
		}
	}

	final void method1646(int i) {
		try {
			int i_5_ = -1;
			int i_6_ = 43 % ((-16 - i) / 62);
			int i_7_ = this.aByteArray6325.length - 8;
			while (i_5_ < i_7_) {
				this.aByteArray6325[++i_5_] = (byte) 0;
				this.aByteArray6325[++i_5_] = (byte) 0;
				this.aByteArray6325[++i_5_] = (byte) 0;
				this.aByteArray6325[++i_5_] = (byte) 0;
				this.aByteArray6325[++i_5_] = (byte) 0;
				this.aByteArray6325[++i_5_] = (byte) 0;
				this.aByteArray6325[++i_5_] = (byte) 0;
				this.aByteArray6325[++i_5_] = (byte) 0;
			}
			while (i_5_ < this.aByteArray6325.length + -1)
				this.aByteArray6325[++i_5_] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "en.D(" + i + ')');
		}
	}

	final boolean method1647(int i, byte i_8_, int i_9_) {
		try {
			if (i_8_ > -114)
				return true;
			if (i * i_9_ > this.aByteArray6325.length)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.F(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	r_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_10_) {
		try {
			this.aByteArray6325 = new byte[i_10_ * i];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ')'));
		}
	}

	final void method1648(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			int i_17_ = 9 % ((-36 - i_15_) / 42);
			int i_18_ = 0;
			if (i != i_14_)
				i_18_ = (i_11_ + -i_12_ << 16) / (-i + i_14_);
			int i_19_ = 0;
			if (i_13_ != i_14_)
				i_19_ = (-i_11_ + i_16_ << 16) / (-i_14_ + i_13_);
			int i_20_ = 0;
			if (i != i_13_)
				i_20_ = (i_12_ + -i_16_ << 16) / (-i_13_ + i);
			if (i_14_ >= i && i <= i_13_) {
				if (i_13_ > i_14_) {
					i_16_ = i_12_ <<= 1202729712;
					if (i < 0) {
						i_12_ -= i_18_ * i;
						i_16_ -= i * i_20_;
						i = 0;
					}
					i_11_ <<= 132460240;
					if (i_14_ < 0) {
						i_11_ -= i_19_ * i_14_;
						i_14_ = 0;
					}
					if ((i_14_ != i && i_18_ > i_20_) || (i_14_ == i && i_19_ < i_20_)) {
						i_13_ -= i_14_;
						i_14_ -= i;
						i *= this.anInt6323;
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i, i_16_ >> 16);
							i += this.anInt6323;
							i_16_ += i_20_;
							i_12_ += i_18_;
						}
						while (--i_13_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i, i_16_ >> 16);
							i_16_ += i_20_;
							i_11_ += i_19_;
							i += this.anInt6323;
						}
					} else {
						i_13_ -= i_14_;
						i_14_ -= i;
						i *= this.anInt6323;
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i, i_12_ >> 16);
							i_12_ += i_18_;
							i += this.anInt6323;
							i_16_ += i_20_;
						}
						while (--i_13_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i, i_11_ >> 16);
							i_11_ += i_19_;
							i_16_ += i_20_;
							i += this.anInt6323;
						}
					}
				} else {
					i_11_ = i_12_ <<= -2138871568;
					i_16_ <<= -1328825456;
					if (i < 0) {
						i_11_ -= i_20_ * i;
						i_12_ -= i_18_ * i;
						i = 0;
					}
					if (i_13_ < 0) {
						i_16_ -= i_13_ * i_19_;
						i_13_ = 0;
					}
					if ((i_13_ == i || i_20_ >= i_18_) && (i != i_13_ || i_18_ >= i_19_)) {
						i_14_ -= i_13_;
						i_13_ -= i;
						i *= this.anInt6323;
						while (--i_13_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i, i_12_ >> 16);
							i_11_ += i_20_;
							i += this.anInt6323;
							i_12_ += i_18_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i, i_12_ >> 16);
							i_16_ += i_19_;
							i_12_ += i_18_;
							i += this.anInt6323;
						}
					} else {
						i_14_ -= i_13_;
						i_13_ -= i;
						i *= this.anInt6323;
						while (--i_13_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i, i_11_ >> 16);
							i_11_ += i_20_;
							i += this.anInt6323;
							i_12_ += i_18_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i, i_16_ >> 16);
							i_12_ += i_18_;
							i_16_ += i_19_;
							i += this.anInt6323;
						}
					}
				}
			} else if (i_13_ < i_14_) {
				if (i >= i_14_) {
					i_12_ = i_16_ <<= 374585904;
					i_11_ <<= 1905005264;
					if (i_13_ < 0) {
						i_12_ -= i_19_ * i_13_;
						i_16_ -= i_20_ * i_13_;
						i_13_ = 0;
					}
					if (i_14_ < 0) {
						i_11_ -= i_14_ * i_18_;
						i_14_ = 0;
					}
					if (i_19_ >= i_20_) {
						i -= i_14_;
						i_14_ -= i_13_;
						i_13_ *= this.anInt6323;
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i_13_, i_16_ >> 16);
							i_16_ += i_20_;
							i_12_ += i_19_;
							i_13_ += this.anInt6323;
						}
						while (--i >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i_13_, i_16_ >> 16);
							i_16_ += i_20_;
							i_11_ += i_18_;
							i_13_ += this.anInt6323;
						}
					} else {
						i -= i_14_;
						i_14_ -= i_13_;
						i_13_ *= this.anInt6323;
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i_13_, i_12_ >> 16);
							i_16_ += i_20_;
							i_13_ += this.anInt6323;
							i_12_ += i_19_;
						}
						while (--i >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i_13_, i_11_ >> 16);
							i_16_ += i_20_;
							i_13_ += this.anInt6323;
							i_11_ += i_18_;
						}
					}
				} else {
					i_11_ = i_16_ <<= 800608624;
					if (i_13_ < 0) {
						i_16_ -= i_20_ * i_13_;
						i_11_ -= i_19_ * i_13_;
						i_13_ = 0;
					}
					i_12_ <<= 1504634480;
					if (i < 0) {
						i_12_ -= i_18_ * i;
						i = 0;
					}
					if (i_19_ < i_20_) {
						i_14_ -= i;
						i -= i_13_;
						i_13_ = this.anInt6323 * i_13_;
						while (--i >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i_13_, i_11_ >> 16);
							i_13_ += this.anInt6323;
							i_11_ += i_19_;
							i_16_ += i_20_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i_13_, i_11_ >> 16);
							i_11_ += i_19_;
							i_13_ += this.anInt6323;
							i_12_ += i_18_;
						}
					} else {
						i_14_ -= i;
						i -= i_13_;
						i_13_ = this.anInt6323 * i_13_;
						while (--i >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i_13_, i_16_ >> 16);
							i_13_ += this.anInt6323;
							i_16_ += i_20_;
							i_11_ += i_19_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i_13_, i_12_ >> 16);
							i_13_ += this.anInt6323;
							i_11_ += i_19_;
							i_12_ += i_18_;
						}
					}
				}
			} else if (i > i_13_) {
				i_12_ = i_11_ <<= 1231068944;
				i_16_ <<= 1066666256;
				if (i_14_ < 0) {
					i_11_ -= i_19_ * i_14_;
					i_12_ -= i_14_ * i_18_;
					i_14_ = 0;
				}
				if (i_13_ < 0) {
					i_16_ -= i_13_ * i_20_;
					i_13_ = 0;
				}
				if (i_13_ != i_14_ && i_19_ > i_18_ || i_13_ == i_14_ && i_20_ < i_18_) {
					i -= i_13_;
					i_13_ -= i_14_;
					i_14_ = this.anInt6323 * i_14_;
					while (--i_13_ >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i_14_, i_12_ >> 16);
						i_12_ += i_18_;
						i_14_ += this.anInt6323;
						i_11_ += i_19_;
					}
					while (--i >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i_14_, i_12_ >> 16);
						i_12_ += i_18_;
						i_16_ += i_20_;
						i_14_ += this.anInt6323;
					}
				} else {
					i -= i_13_;
					i_13_ -= i_14_;
					i_14_ *= this.anInt6323;
					while (--i_13_ >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i_14_, i_11_ >> 16);
						i_14_ += this.anInt6323;
						i_11_ += i_19_;
						i_12_ += i_18_;
					}
					while (--i >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i_14_, i_16_ >> 16);
						i_14_ += this.anInt6323;
						i_12_ += i_18_;
						i_16_ += i_20_;
					}
				}
			} else {
				i_16_ = i_11_ <<= -1766173488;
				if (i_14_ < 0) {
					i_11_ -= i_14_ * i_19_;
					i_16_ -= i_14_ * i_18_;
					i_14_ = 0;
				}
				i_12_ <<= -1121160880;
				if (i < 0) {
					i_12_ -= i * i_20_;
					i = 0;
				}
				if (i_18_ >= i_19_) {
					i_13_ -= i;
					i -= i_14_;
					i_14_ *= this.anInt6323;
					while (--i >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_16_ >> 16, i_14_, i_11_ >> 16);
						i_11_ += i_19_;
						i_14_ += this.anInt6323;
						i_16_ += i_18_;
					}
					while (--i_13_ >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_12_ >> 16, i_14_, i_11_ >> 16);
						i_14_ += this.anInt6323;
						i_12_ += i_20_;
						i_11_ += i_19_;
					}
				} else {
					i_13_ -= i;
					i -= i_14_;
					i_14_ *= this.anInt6323;
					while (--i >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i_14_, i_16_ >> 16);
						i_11_ += i_19_;
						i_14_ += this.anInt6323;
						i_16_ += i_18_;
					}
					while (--i_13_ >= 0) {
						Class261.method3210((byte) -104, this.aByteArray6325, 0, i_11_ >> 16, i_14_, i_12_ >> 16);
						i_11_ += i_19_;
						i_14_ += this.anInt6323;
						i_12_ += i_20_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.M(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	static {
		aClass79_6321 = new Class79(10);
	}
}
