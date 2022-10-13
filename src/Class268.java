/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

class Class268 {
	private Class98_Sub31 aClass98_Sub31_2003;
	private int anInt2004;
	int[] anIntArray2005;
	private long aLong2006;
	static int anInt2007;
	private boolean aBoolean2008 = false;
	private long aLong2009;
	int anInt2010;
	private boolean aBoolean2011;
	private int anInt2012;
	private int anInt2013;
	private int anInt2014;
	private int anInt2015;
	int anInt2016;
	private long aLong2017;
	private int anInt2018;
	private Class98_Sub31[] aClass98_Sub31Array2019;
	private Class98_Sub31[] aClass98_Sub31Array2020;

	static final void method3248(int i) {
		try {
			if (i != 0)
				anInt2007 = -86;
			Class76_Sub4.aClass377_3738.method3994(-71);
			Class98_Sub10_Sub34.aClass215_5728.method2786(16711680);
			Class367.aClass215_3545.method2786(16711680);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qn.F(" + i + ')');
		}
	}

	final synchronized void method3249(byte i) {
		try {
			aBoolean2011 = true;
			try {
				method3259();
				int i_0_ = -67 / ((-38 - i) / 34);
			} catch (Exception exception) {
				method3262();
				aLong2017 = 2000L + Class343.method3819(-47);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qn.H(" + i + ')');
		}
	}

	void method3250(int i) throws Exception {
		/* empty */
	}

	private final void method3251(int i, Class98_Sub31 class98_sub31, int i_1_) {
		do {
			try {
				int i_2_ = i_1_ >> 5;
				Class98_Sub31 class98_sub31_3_ = aClass98_Sub31Array2020[i_2_];
				do {
					if (class98_sub31_3_ == null) {
						aClass98_Sub31Array2019[i_2_] = class98_sub31;
						if (!client.aBoolean3553)
							break;
					}
					class98_sub31_3_.aClass98_Sub31_4101 = class98_sub31;
				} while (false);
				aClass98_Sub31Array2020[i_2_] = class98_sub31;
				class98_sub31.anInt4103 = i_1_;
				if (i == -16680)
					break;
				anInt2014 = 29;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qn.M(" + i + ',' + (class98_sub31 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized void method3252(int i, Class98_Sub31 class98_sub31) {
		do {
			try {
				aClass98_Sub31_2003 = class98_sub31;
				if (i == 0)
					break;
				this.anIntArray2005 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qn.A(" + i + ',' + (class98_sub31 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	void method3253(Component component) throws Exception {
		/* empty */
	}

	static final void method3254(r var_r, int i, int i_4_, int i_5_, boolean[] bools) {
		if (Class78.activeTileHeightMap != Class81.aSArray618) {
			int i_6_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i].method3417(i_4_, i_5_, true);
			for (int i_7_ = 0; i_7_ <= i; i_7_++) {
				if (bools == null || bools[i_7_]) {
					s var_s = Class98_Sub46_Sub2_Sub2.aSArray6298[i_7_];
					if (var_s != null)
						var_s.wa(var_r, i_4_, i_6_ - var_s.method3417(i_4_, i_5_, true), i_5_, 0, false);
				}
			}
		}
	}

	private final void method3255(int[] is, int i) {
		int i_8_ = i;
		if (Class151_Sub7.aBoolean5007)
			i_8_ <<= 1;
		Class236.method2893(is, 0, i_8_);
		anInt2015 -= i;
		if (aClass98_Sub31_2003 != null && anInt2015 <= 0) {
			anInt2015 += Class64_Sub15.anInt3678 >> 4;
			Class250.method3167((byte) -32, aClass98_Sub31_2003);
			method3251(-16680, aClass98_Sub31_2003, aClass98_Sub31_2003.method1323());
			int i_9_ = 0;
			int i_10_ = 255;
			int i_11_ = 7;
			while_161_: while (i_10_ != 0) {
				int i_12_;
				int i_13_;
				if (i_11_ < 0) {
					i_12_ = i_11_ & 0x3;
					i_13_ = -(i_11_ >> 2);
				} else {
					i_12_ = i_11_;
					i_13_ = 0;
				}
				for (int i_14_ = i_10_ >>> i_12_ & 0x11111111; i_14_ != 0; i_14_ >>>= 4) {
					if ((i_14_ & 0x1) != 0) {
						i_10_ &= ~(1 << i_12_);
						Class98_Sub31 class98_sub31 = null;
						Class98_Sub31 class98_sub31_15_ = aClass98_Sub31Array2019[i_12_];
						while (class98_sub31_15_ != null) {
							Class98_Sub24 class98_sub24 = (class98_sub31_15_.aClass98_Sub24_4104);
							if (class98_sub24 != null && (class98_sub24.anInt4008 > i_13_)) {
								i_10_ |= 1 << i_12_;
								class98_sub31 = class98_sub31_15_;
								class98_sub31_15_ = (class98_sub31_15_.aClass98_Sub31_4101);
							} else {
								class98_sub31_15_.aBoolean4102 = true;
								int i_16_ = class98_sub31_15_.method1326();
								i_9_ += i_16_;
								if (class98_sub24 != null)
									class98_sub24.anInt4008 += i_16_;
								if (i_9_ >= anInt2004)
									break while_161_;
								Class98_Sub31 class98_sub31_17_ = class98_sub31_15_.method1322();
								if (class98_sub31_17_ != null) {
									int i_18_ = (class98_sub31_15_.anInt4103);
									for (/**/; class98_sub31_17_ != null; class98_sub31_17_ = class98_sub31_15_.method1327())
										method3251(-16680, class98_sub31_17_, (i_18_ * class98_sub31_17_.method1323() >> 8));
								}
								Class98_Sub31 class98_sub31_19_ = (class98_sub31_15_.aClass98_Sub31_4101);
								class98_sub31_15_.aClass98_Sub31_4101 = null;
								if (class98_sub31 == null)
									aClass98_Sub31Array2019[i_12_] = class98_sub31_19_;
								else
									class98_sub31.aClass98_Sub31_4101 = class98_sub31_19_;
								if (class98_sub31_19_ == null)
									aClass98_Sub31Array2020[i_12_] = class98_sub31;
								class98_sub31_15_ = class98_sub31_19_;
							}
						}
					}
					i_12_ += 4;
					i_13_++;
				}
				i_11_--;
			}
			for (int i_20_ = 0; i_20_ < 8; i_20_++) {
				Class98_Sub31 class98_sub31 = aClass98_Sub31Array2019[i_20_];
				aClass98_Sub31Array2019[i_20_] = aClass98_Sub31Array2020[i_20_] = null;
				Class98_Sub31 class98_sub31_21_;
				for (/**/; class98_sub31 != null; class98_sub31 = class98_sub31_21_) {
					class98_sub31_21_ = class98_sub31.aClass98_Sub31_4101;
					class98_sub31.aClass98_Sub31_4101 = null;
				}
			}
		}
		if (anInt2015 < 0)
			anInt2015 = 0;
		if (aClass98_Sub31_2003 != null)
			aClass98_Sub31_2003.method1325(is, 0, i);
		aLong2006 = Class343.method3819(-47);
	}

	final synchronized void method3256(byte i) {
		do {
			try {
				if (Class177.aClass103_1375 != null) {
					boolean bool = true;
					for (int i_22_ = 0; i_22_ < 2; i_22_++) {
						if ((Class177.aClass103_1375.aClass268Array894[i_22_]) == this)
							Class177.aClass103_1375.aClass268Array894[i_22_] = null;
						if ((Class177.aClass103_1375.aClass268Array894[i_22_]) != null)
							bool = false;
					}
					if (bool) {
						Class177.aClass103_1375.aBoolean893 = true;
						while (Class177.aClass103_1375.aBoolean895)
							Class246_Sub7.method3131(0, 50L);
						Class177.aClass103_1375 = null;
					}
				}
				method3262();
				this.anIntArray2005 = null;
				aBoolean2008 = true;
				if (i > 24)
					break;
				anInt2013 = -23;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qn.G(" + i + ')');
			}
			break;
		} while (false);
	}

	void method3257() throws Exception {
		/* empty */
	}

	int method3258() throws Exception {
		try {
			return this.anInt2010;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qn.D(" + ')');
		}
	}

	void method3259() throws Exception {
		/* empty */
	}

	private final void method3260(int i, int i_23_) {
		do {
			try {
				anInt2015 -= i;
				if (anInt2015 < 0)
					anInt2015 = 0;
				int i_24_ = 23 % ((-58 - i_23_) / 48);
				if (aClass98_Sub31_2003 == null)
					break;
				aClass98_Sub31_2003.method1321(i);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qn.O(" + i + ',' + i_23_ + ')');
			}
			break;
		} while (false);
	}

	final synchronized void method3261(byte i) {
		try {
			if (!aBoolean2008) {
				long l = Class343.method3819(-47);
				try {
					if (aLong2006 + 6000L < l)
						aLong2006 = l + -6000L;
					for (/**/; 5000L + aLong2006 < l; l = Class343.method3819(-47)) {
						method3260(256, -113);
						aLong2006 += 256000 / Class64_Sub15.anInt3678;
					}
				} catch (Exception exception) {
					aLong2006 = l;
				}
				if (this.anIntArray2005 != null) {
					try {
						if (aLong2017 != 0L) {
							if (aLong2017 > l)
								return;
							method3250(this.anInt2010);
							aLong2017 = 0L;
							aBoolean2011 = true;
						}
						if (i >= -66)
							method3248(122);
						int i_25_ = method3258();
						if (anInt2012 < -i_25_ + anInt2013)
							anInt2012 = anInt2013 - i_25_;
						int i_26_ = anInt2018 + this.anInt2016;
						if (i_26_ + 256 > 16384)
							i_26_ = 16128;
						if (this.anInt2010 < i_26_ - -256) {
							this.anInt2010 += 1024;
							if (this.anInt2010 > 16384)
								this.anInt2010 = 16384;
							method3262();
							method3250(this.anInt2010);
							i_25_ = 0;
							aBoolean2011 = true;
							if (i_26_ + 256 > this.anInt2010) {
								i_26_ = this.anInt2010 - 256;
								anInt2018 = i_26_ + -this.anInt2016;
							}
						}
						for (/**/; i_26_ > i_25_; i_25_ += 256) {
							method3255(this.anIntArray2005, 256);
							method3257();
						}
						if (l > aLong2009) {
							if (!aBoolean2011) {
								if (anInt2012 == 0 && anInt2014 == 0) {
									method3262();
									aLong2017 = 2000L + l;
									return;
								}
								anInt2018 = Math.min(anInt2014, anInt2012);
								anInt2014 = anInt2012;
							} else
								aBoolean2011 = false;
							anInt2012 = 0;
							aLong2009 = l - -2000L;
						}
						anInt2013 = i_25_;
					} catch (Exception exception) {
						method3262();
						aLong2017 = l + 2000L;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qn.N(" + i + ')');
		}
	}

	void method3262() {
		/* empty */
	}

	public Class268() {
		anInt2004 = 32;
		aLong2006 = Class343.method3819(-47);
		anInt2014 = 0;
		anInt2013 = 0;
		aClass98_Sub31Array2019 = new Class98_Sub31[8];
		aLong2017 = 0L;
		anInt2012 = 0;
		aBoolean2011 = true;
		aLong2009 = 0L;
		aClass98_Sub31Array2020 = new Class98_Sub31[8];
		anInt2015 = 0;
	}
}
