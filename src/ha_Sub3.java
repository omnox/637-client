
/* ha_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;

abstract class ha_Sub3 extends ha {
	NativeHeapBuffer aNativeHeapBuffer4521;
	NativeHeap aNativeHeap4522;
	private Hashtable aHashtable4523;
	private Canvas aCanvas4524;
	long aLong4525;
	NativeInterface aNativeInterface4526;
	int anInt4527;
	static RuneScapeCache aClass207_4528;
	Class195 aClass195_4529;
	Object anObject4530;
	int anInt4531;
	private LinkedList aClass148_4532 = new LinkedList();
	Canvas aCanvas4533;
	private int anInt4534;
	RuneScapeCache aClass207_4535;
	private int anInt4536;
	private Object anObject4537;
	int anInt4538;
	int anInt4539;
	boolean aBoolean4540 = true;
	int anInt4541;
	Class111_Sub3 aClass111_Sub3_4542 = new Class111_Sub3();
	Class111_Sub3 aClass111_Sub3_4543 = new Class111_Sub3();
	Class111_Sub3 aClass111_Sub3_4544 = new Class111_Sub3();
	Class111_Sub3 aClass111_Sub3_4545 = new Class111_Sub3();
	private Class111_Sub3 aClass111_Sub3_4546 = new Class111_Sub3();
	private Class111_Sub3 aClass111_Sub3_4547 = new Class111_Sub3();
	private int anInt4548;
	float aFloat4549 = 1.0F;
	private boolean aBoolean4550;
	Class204 aClass204_4551;
	int anInt4552;
	int anInt4553;
	private float aFloat4554;
	boolean aBoolean4555 = true;
	int anInt4556;
	private int anInt4557;
	int anInt4558;
	boolean aBoolean4559;
	boolean aBoolean4560;
	private float aFloat4561 = 1.0F;
	boolean aBoolean4562;
	boolean aBoolean4563;
	int anInt4564;
	int anInt4565;
	float[] aFloatArray4566;
	private boolean aBoolean4567;
	float aFloat4568;
	boolean aBoolean4569;
	private boolean aBoolean4570 = false;
	boolean aBoolean4571;
	float[] aFloatArray4572;
	int anInt4573;
	private boolean aBoolean4574;
	int anInt4575;
	float aFloat4576;
	boolean aBoolean4577;
	int anInt4578;
	int anInt4579;
	int anInt4580;
	int anInt4581;
	private float[] aFloatArray4582;
	private int anInt4583;
	float aFloat4584;
	Class128[] aClass128Array4585;
	Interface4 anInterface4_4586;
	int anInt4587;
	boolean aBoolean4588;
	int anInt4589;
	private float[] aFloatArray4590;
	float aFloat4591;
	float aFloat4592;
	int anInt4593;
	float aFloat4594;
	private int anInt4595;
	float[] aFloatArray4596;
	Class98_Sub5[] aClass98_Sub5Array4597;
	private Class76 aClass76_4598;
	boolean aBoolean4599;
	private int anInt4600;
	int anInt4601;
	int anInt4602;
	private Stream aStream4603;
	private float[] aFloatArray4604;
	int anInt4605;
	boolean aBoolean4606;
	int anInt4607;
	int anInt4608;
	Class111_Sub3[] aClass111_Sub3Array4609;
	float aFloat4610;
	float aFloat4611;
	private int anInt4612;
	private Class76[] aClass76Array4613;
	private Class48_Sub2 aClass48_Sub2_4614;
	float aFloat4615;
	int anInt4616;
	private Interface4[] anInterface4Array4617;
	private int anInt4618;
	int anInt4619;
	boolean aBoolean4620;
	private boolean aBoolean4621;
	int anInt4622;
	private int anInt4623;
	private Class319 aClass319_4624;
	Class126 aClass126_4625;
	private float aFloat4626;
	private float[] aFloatArray4627;
	int anInt4628;
	private float[] aFloatArray4629;
	float aFloat4630;
	private boolean aBoolean4631;
	private int anInt4632;
	private int anInt4633;
	private Class81 aClass81_4634;
	private int anInt4635;
	int anInt4636;
	boolean aBoolean4637;
	int anInt4638;
	Class128[] aClass128Array4639;
	int anInt4640;
	float aFloat4641;
	float aFloat4642;
	boolean aBoolean4643;
	Class258[] aClass258Array4644;
	int anInt4645;
	private float[] aFloatArray4646;
	float aFloat4647;
	int anInt4648;
	Class146_Sub3 aClass146_Sub3_4649;
	Class146_Sub3 aClass146_Sub3_4650;
	Class146_Sub3 aClass146_Sub3_4651;
	private Interface2_Impl1 anInterface2_Impl1_4652;
	private Class256 aClass256_4653;
	Class256 aClass256_4654;
	private Class256 aClass256_4655;
	Class146_Sub3 aClass146_Sub3_4656;
	Class146_Sub3 aClass146_Sub3_4657;
	Class146_Sub3 aClass146_Sub3_4658;
	Class256 aClass256_4659;
	private Interface2_Impl1 anInterface2_Impl1_4660;
	Class146_Sub3 aClass146_Sub3_4661;
	Class146_Sub3 aClass146_Sub3_4662;
	private Class111_Sub3 aClass111_Sub3_4663;
	Class256 aClass256_4664;
	Class146_Sub3 aClass146_Sub3_4665;
	private Interface2_Impl2 anInterface2_Impl2_4666;
	private Interface2_Impl1 anInterface2_Impl1_4667;
	Class256 aClass256_4668;
	private Class256 aClass256_4669;
	Class146_Sub3 aClass146_Sub3_4670;
	private int anInt4671;
	boolean aBoolean4672;

	private final void method1933(byte i) {
		do {
			try {
				if (i != -94)
					this.anInt4601 = 32;
				if (aBoolean4631)
					break;
				float[] fs = aFloatArray4646;
				float f = ((float) (this.anInt4640 * -this.anInt4645) / (float) this.anInt4593);
				float f_0_ = ((float) ((-this.anInt4645 + this.anInt4527) * this.anInt4640) / (float) this.anInt4593);
				float f_1_ = ((float) (this.anInt4587 * this.anInt4640) / (float) this.anInt4589);
				float f_2_ = ((float) ((this.anInt4587 + -this.anInt4531) * this.anInt4640) / (float) this.anInt4589);
				do {
					if (f != f_0_ && f_2_ != f_1_) {
						float f_3_ = (float) this.anInt4640 * 2.0F;
						fs[1] = 0.0F;
						fs[13] = 0.0F;
						fs[11] = -1.0F;
						fs[6] = 0.0F;
						fs[5] = f_3_ / (f_1_ - f_2_);
						fs[8] = (f + f_0_) / (-f + f_0_);
						fs[0] = f_3_ / (f_0_ - f);
						fs[2] = 0.0F;
						fs[4] = 0.0F;
						fs[9] = (f_2_ + f_1_) / (-f_2_ + f_1_);
						fs[7] = 0.0F;
						fs[14] = aFloat4554 = ((float) (this.anInt4640 * this.anInt4605) / (float) (this.anInt4640 + -this.anInt4605));
						fs[3] = 0.0F;
						fs[12] = 0.0F;
						fs[10] = aFloat4626 = ((float) this.anInt4605 / (float) (-this.anInt4605 + this.anInt4640));
						fs[15] = 0.0F;
						if (!client.aBoolean3553)
							break;
					}
					fs[13] = 0.0F;
					fs[8] = 0.0F;
					fs[2] = 0.0F;
					fs[7] = 0.0F;
					fs[3] = 0.0F;
					fs[11] = 0.0F;
					fs[5] = 1.0F;
					fs[1] = 0.0F;
					fs[0] = 1.0F;
					fs[12] = 0.0F;
					fs[9] = 0.0F;
					fs[14] = 0.0F;
					fs[6] = 0.0F;
					fs[4] = 0.0F;
					fs[10] = 1.0F;
					fs[15] = 1.0F;
				} while (false);
				method1970(-24793);
				aBoolean4631 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.LE(" + i + ')');
			}
			break;
		} while (false);
	}

	final void C(boolean bool) {
		try {
			this.aBoolean4606 = bool;
			method1972(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.C(" + bool + ')');
		}
	}

	abstract Interface4_Impl3 method1934(int i, boolean bool, int[][] is, int i_4_);

	final void method1935(int i) {
		do {
			try {
				this.aBoolean4540 = false;
				method2055(0);
				if (i == 1)
					break;
				method1974(-121);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.LI(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method1936(int i, Object object, Canvas canvas);

	final void T(int i, int i_5_, int i_6_, int i_7_) {
		do {
			try {
				boolean bool = false;
				if (i > this.anInt4602) {
					bool = true;
					this.anInt4602 = i;
				}
				if (i_6_ < this.anInt4575) {
					this.anInt4575 = i_6_;
					bool = true;
				}
				if (this.anInt4558 < i_5_) {
					this.anInt4558 = i_5_;
					bool = true;
				}
				if (i_7_ < this.anInt4638) {
					bool = true;
					this.anInt4638 = i_7_;
				}
				if (!bool)
					break;
				if (!this.aBoolean4672) {
					this.aBoolean4672 = true;
					method2030((byte) -122);
				}
				method2009(28976);
				method2048((byte) 32);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.T(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1937(int i) {
		try {
			if (i != 4)
				aFloat4626 = -0.15274778F;
			if (anInt4633 != 16) {
				method1952(2);
				method2028(true, (byte) -101);
				method2013(true, i + 2099);
				method1997(i ^ 0x4, true);
				method2001(1, 109);
				anInt4633 = 16;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.EF(" + i + ')');
		}
	}

	private final void method1938(byte i) {
		do {
			try {
				if (Class176.aClass204_1372 != this.aClass204_4551) {
					Class204 class204 = this.aClass204_4551;
					this.aClass204_4551 = Class176.aClass204_1372;
					if (!class204.method2708(94))
						method1961(107);
					method1933((byte) -94);
					this.aFloatArray4566 = aFloatArray4646;
					method1962(-108);
					anInt4633 &= ~0x7;
				}
				if (i == -20)
					break;
				this.anInt4640 = -76;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.BE(" + i + ')');
			}
			break;
		} while (false);
	}

	final Interface4_Impl3 method1939(int i) {
		try {
			if (i > -92)
				return null;
			if (aClass48_Sub2_4614 == null)
				return null;
			return aClass48_Sub2_4614.method469(109);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.EE(" + i + ')');
		}
	}

	final void method1807(int i) {
		/* empty */
	}

	final void method1940(byte i) {
		try {
			method1992((byte) 125);
			int i_8_ = 5 / ((i - -55) / 38);
			method1962(-83);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.QG(" + i + ')');
		}
	}

	void method1941(int i) {
		do {
			try {
				method1975(0);
				if (i == 1)
					break;
				method1945((byte) 115, false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.OC(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract boolean method1942(int i, Class164 class164, Class162 class162);

	private final void method1943(int i) {
		do {
			try {
				aBoolean4631 = false;
				method1933((byte) -94);
				if (i != 10886)
					pa();
				if (Class176.aClass204_1372 != this.aClass204_4551)
					break;
				method1962(i ^ ~0x2af7);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.RG(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1774(int i) {
		/* empty */
	}

	final void U(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			method1795(i, i_9_, i + i_10_, i_9_, i_11_, i_12_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.U(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	abstract void method1944(Object object, Canvas canvas, byte i);

	final void method1945(byte i, boolean bool) {
		do {
			try {
				if (bool == !this.aBoolean4571) {
					this.aBoolean4571 = bool;
					method1999((byte) 112);
				}
				if (i > 107)
					break;
				method1984(-94, 91);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.KF(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	private final void method1946(int i) {
		try {
			if (i != anInt4633) {
				method1993((byte) 103);
				method2028(false, (byte) -101);
				method1979(false, -104);
				method2013(false, 2103);
				method1997(i + -1, false);
				method2039(false, i ^ 0x1, -2, false);
				method2015(1, (byte) 40);
				method2005(this.anInterface4_4586, -128);
				anInt4633 = 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.TE(" + i + ')');
		}
	}

	final NativeHeapBuffer method1947(int i, boolean bool, int i_13_) {
		try {
			if (i_13_ != 0)
				return null;
			return this.aNativeHeap4522.a(i, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.JJ(" + i + ',' + bool + ',' + i_13_ + ')'));
		}
	}

	final void za(int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		try {
			method1946(1);
			method1984(2, i_16_);
			method2051(0, -91, Class64_Sub16.aClass65_3681);
			method1953(-119, Class64_Sub16.aClass65_3681, 0);
			method2001(i_17_, 76);
			this.aClass111_Sub3_4542.method2137((float) i_15_, (byte) -116, (float) i_15_, 1.0F);
			this.aClass111_Sub3_4542.method2106(i, i_14_, 0);
			method1935(1);
			method2059(false, false);
			method1971(0, true, anInterface2_Impl1_4652);
			method2042(aClass256_4669, (byte) 104);
			method2037(Class98_Sub46_Sub15.aClass232_6043, 0, (byte) 13, 256);
			method2059(true, false);
			method1953(-108, Class300.aClass65_2499, 0);
			method2051(0, -72, Class300.aClass65_2499);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.za(" + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	final int method1948(int i) {
		try {
			int i_18_ = -57 / ((i - 43) / 54);
			return anInt4548;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.UE(" + i + ')');
		}
	}

	final void method1949(int i) {
		do {
			try {
				if (anInt4633 != 4) {
					method1993((byte) 103);
					method2028(false, (byte) -101);
					method1979(false, -65);
					method2013(false, 2103);
					method1997(0, false);
					method2039(false, 0, -2, false);
					method2001(1, 111);
					method2015(0, (byte) -124);
					anInt4633 = 4;
				}
				if (i == 0)
					break;
				this.aBoolean4643 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.AE(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method1950(byte i);

	final void method1951(byte i, int i_19_) {
		do {
			try {
				if (i != 120)
					this.aClass146_Sub3_4661 = null;
				if (this.anInt4579 == i_19_)
					break;
				this.anInt4579 = i_19_;
				method1950((byte) 72);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.TI(" + i + ',' + i_19_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method1952(int i) {
		try {
			if (this.aClass204_4551 != ParamType.aClass204_1206) {
				Class204 class204 = this.aClass204_4551;
				this.aClass204_4551 = ParamType.aClass204_1206;
				if (!class204.method2708(103))
					method1961(-43);
				method2000((byte) -117);
				this.aFloatArray4566 = aFloatArray4604;
				method1962(-84);
				anInt4633 &= ~0x7;
			}
			if (i != 2)
				this.anInt4587 = 43;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.SG(" + i + ')');
		}
	}

	final void method1953(int i, Class65 class65, int i_20_) {
		try {
			if (i <= -66)
				method2047(i_20_, false, (byte) -42, class65);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.WG(" + i + ',' + (class65 != null ? "{...}" : "null") + ',' + i_20_ + ')'));
		}
	}

	final void method1954(int i, byte i_21_) {
		do {
			try {
				method1984(2, i_21_ | (i_21_ << 8 | (i_21_ << 24 | i_21_ << 16)));
				if (i == 4)
					break;
				method1823();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.LF(" + i + ',' + i_21_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method1788() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.KI(" + ')');
		}
	}

	final void ra(int i, int i_22_, int i_23_, int i_24_) {
		try {
			anInt4618 = i_24_;
			this.aBoolean4563 = true;
			anInt4548 = i_23_;
			anInt4557 = i_22_;
			anInt4600 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.ra(" + i + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}

	abstract void method1955(int i);

	final Class111_Sub3 method1956(byte i) {
		try {
			int i_25_ = 83 % ((-45 - i) / 45);
			return this.aClass111_Sub3_4545;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.QH(" + i + ')');
		}
	}

	final Class111_Sub3 method1957(byte i) {
		try {
			int i_26_ = 0 / ((-10 - i) / 59);
			return (this.aClass111_Sub3Array4609[this.anInt4579]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.NF(" + i + ')');
		}
	}

	final Class332 method1739(int i, int i_27_, boolean bool) {
		try {
			return new Class332_Sub2(this, i, i_27_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.EG(" + i + ',' + i_27_ + ',' + bool + ')'));
		}
	}

	final void method1816(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		/* empty */
	}

	final void f(int i, int i_34_) {
		try {
			if (i != this.anInt4640 || (i_34_ != this.anInt4605)) {
				this.anInt4640 = i;
				this.anInt4605 = i_34_;
				method1943(10886);
				method2038((byte) 119);
				method2020(-111);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.f(" + i + ',' + i_34_ + ')');
		}
	}

	abstract void method1958(byte i);

	abstract void method1959(int i);

	final void method1782(Canvas canvas, int i, int i_35_) {
		do {
			try {
				Object object = null;
				if (canvas == null || canvas == this.aCanvas4533)
					object = anObject4537;
				else if (aHashtable4523.containsKey(canvas))
					object = aHashtable4523.get(canvas);
				if (object == null)
					throw new RuntimeException();
				method1988(canvas, object, -117);
				if (canvas != aCanvas4524)
					break;
				method2003(1);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.JI(" + (canvas != null ? "{...}" : "null") + ',' + i + ',' + i_35_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1960(int i) {
		try {
			this.aClass111_Sub3_4542.method2091();
			if (i != 13951)
				method1993((byte) 54);
			this.aBoolean4540 = true;
			method2055(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.UI(" + i + ')');
		}
	}

	private final void method1961(int i) {
		try {
			int i_36_ = 19 / ((i - 34) / 60);
			aBoolean4621 = false;
			if (aClass76_4598 != null)
				aClass76_4598.method737(2899);
			method2021(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.FH(" + i + ')');
		}
	}

	private final void method1962(int i) {
		do {
			try {
				if (i <= -69) {
					method1966((byte) 48);
					if (aClass76_4598 == null)
						break;
					aClass76_4598.method740(-121);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.SI(" + i + ')');
			}
			break;
		} while (false);
	}

	final Interface2_Impl2 method1963(int i, int i_37_) {
		try {
			if (i <= 43)
				return null;
			if (anInterface2_Impl2_4666.method2(200) < 2 * i_37_)
				anInterface2_Impl2_4666.method76(i_37_, 20779);
			return anInterface2_Impl2_4666;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.RF(" + i + ',' + i_37_ + ')');
		}
	}

	final void a(za var_za) {
		try {
			this.aNativeHeap4522 = ((za_Sub1) var_za).aNativeHeap6078;
			this.aNativeHeapBuffer4521 = this.aNativeHeap4522.a(32768, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.EH(" + (var_za != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method1964(Class38 class38, byte i);

	final void method1965(boolean bool) {
		try {
			this.aClass128Array4585 = new Class128[this.anInt4608];
			this.aClass111_Sub3Array4609 = new Class111_Sub3[this.anInt4608];
			anInterface4Array4617 = new Interface4[this.anInt4608];
			this.aClass128Array4639 = new Class128[this.anInt4608];
			this.aClass258Array4644 = new Class258[this.anInt4608];
			for (int i = 0; this.anInt4608 > i; i++) {
				this.aClass128Array4639[i] = Class249.aClass128_1903;
				this.aClass128Array4585[i] = Class249.aClass128_1903;
				this.aClass258Array4644[i] = Class98_Sub46_Sub19.aClass258_6062;
				this.aClass111_Sub3Array4609[i] = new Class111_Sub3();
			}
			this.aClass98_Sub5Array4597 = new Class98_Sub5[this.anInt4565 - 2];
			this.anInterface4_4586 = method2006(1, 1, Class62.aClass164_486, (byte) 45, Class162.aClass162_1266);
			a(new za_Sub1(262144));
			this.aClass256_4664 = method1982((new Class49[] { new Class49(new Class169[] { Class169.aClass169_1294, Class169.aClass169_1301 }) }), 6);
			this.aClass256_4659 = method1982((new Class49[] { new Class49(new Class169[] { Class169.aClass169_1294, Class169.aClass169_1298 }) }), 6);
			this.aClass256_4654 = method1982((new Class49[] { new Class49(Class169.aClass169_1294), new Class49(Class169.aClass169_1298), new Class49(Class169.aClass169_1301), new Class49(Class169.aClass169_1297) }), 6);
			this.aClass256_4668 = method1982((new Class49[] { new Class49(Class169.aClass169_1294), new Class49(Class169.aClass169_1298), new Class49(Class169.aClass169_1301) }), 6);
			this.aClass146_Sub3_4656 = new Class146_Sub3(this, 0, 0, false, false);
			this.aClass146_Sub3_4665 = new Class146_Sub3(this, 0, 0, true, true);
			this.aClass146_Sub3_4658 = new Class146_Sub3(this, 0, 0, false, false);
			this.aClass146_Sub3_4651 = new Class146_Sub3(this, 0, 0, true, true);
			this.aClass146_Sub3_4661 = new Class146_Sub3(this, 0, 0, false, false);
			this.aClass146_Sub3_4657 = new Class146_Sub3(this, 0, 0, true, true);
			this.aClass146_Sub3_4649 = new Class146_Sub3(this, 0, 0, false, false);
			this.aClass146_Sub3_4650 = new Class146_Sub3(this, 0, 0, true, true);
			this.aClass146_Sub3_4670 = new Class146_Sub3(this, 0, 0, false, false);
			this.aClass146_Sub3_4662 = new Class146_Sub3(this, 0, 0, true, bool);
			aClass81_4634 = new Class81(this);
			anInterface2_Impl2_4666 = method1990((byte) 84, true);
			method2064((byte) -61);
			this.aClass195_4529 = new Class195(this);
			aClass76Array4613[1] = method2067(1, (byte) 125);
			aClass76Array4613[2] = method2067(2, (byte) -66);
			aClass76Array4613[4] = method2067(4, (byte) 126);
			aClass76Array4613[5] = method2067(5, (byte) 114);
			aClass76Array4613[6] = method2067(6, (byte) -82);
			aClass76Array4613[7] = method2067(7, (byte) 127);
			aClass76Array4613[3] = method2067(3, (byte) -80);
			aClass76Array4613[8] = method2067(8, (byte) 103);
			aClass76Array4613[9] = method2067(9, (byte) 103);
			if (!aClass76Array4613[2].method745((byte) 27))
				aClass76Array4613[2] = method2067(0, (byte) 125);
			if (!aClass76Array4613[4].method745((byte) 27))
				aClass76Array4613[4] = aClass76Array4613[2];
			if (!aClass76Array4613[8].method745((byte) 27))
				aClass76Array4613[8] = aClass76Array4613[4];
			if (!aClass76Array4613[9].method745((byte) 27))
				aClass76Array4613[9] = aClass76Array4613[8];
			method1941(1);
			la();
			this.method1817();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.LH(" + bool + ')');
		}
	}

	abstract void method1966(byte i);

	final int method1967(int i) {
		try {
			if (i <= 91)
				aBoolean4550 = false;
			return this.anInt4579;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.GE(" + i + ')');
		}
	}

	abstract Interface4_Impl2 method1968(int i, int i_38_, boolean bool, Class164 class164, int i_39_, int i_40_, int i_41_, float[] fs);

	final boolean method1780() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.FG(" + ')');
		}
	}

	final Class332 method1758(Class324 class324, boolean bool) {
		try {
			Class332 class332;
			if (class324.anInt2722 == 0 || class324.anInt2720 == 0)
				class332 = this.method1748(-7962, 0, 1, 1, new int[1], 1);
			else {
				int[] is = new int[(class324.anInt2720 * class324.anInt2722)];
				int i = 0;
				int i_42_ = 0;
				if (class324.aByteArray2723 != null) {
					for (int i_43_ = 0; (class324.anInt2720 > i_43_); i_43_++) {
						for (int i_44_ = 0; class324.anInt2722 > i_44_; i_44_++) {
							is[i_42_++] = (Class41.method366((class324.aByteArray2723[i] << 24), (class324.anIntArray2718[Class202.method2702((class324.aByteArray2717[i]), 255)])));
							i++;
						}
					}
				} else {
					for (int i_45_ = 0; i_45_ < class324.anInt2720; i_45_++) {
						for (int i_46_ = 0; class324.anInt2722 > i_46_; i_46_++) {
							int i_47_ = (class324.anIntArray2718[(class324.aByteArray2717[i++] & 0xff)]);
							is[i_42_++] = i_47_ == 0 ? 0 : Class41.method366(-16777216, i_47_);
						}
					}
				}
				class332 = this.method1748(-7962, 0, class324.anInt2722, class324.anInt2720, is, class324.anInt2722);
			}
			class332.method3740(class324.anInt2725, class324.anInt2721, class324.anInt2719, class324.anInt2724);
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.IE(" + (class324 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void aa(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		try {
			method1946(1);
			method1984(2, i_51_);
			method2051(0, -68, Class64_Sub16.aClass65_3681);
			method1953(-75, Class64_Sub16.aClass65_3681, 0);
			method2001(i_52_, 126);
			this.aClass111_Sub3_4542.method2137((float) i_50_, (byte) -119, (float) i_49_, 1.0F);
			this.aClass111_Sub3_4542.method2106(i, i_48_, 0);
			method1935(1);
			method2059(false, false);
			method2002((byte) -125);
			method2059(true, false);
			method1953(-103, Class300.aClass65_2499, 0);
			method2051(0, -87, Class300.aClass65_2499);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.aa(" + i + ',' + i_48_ + ',' + i_49_ + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ')'));
		}
	}

	private final boolean method1969(float f, float f_53_, float f_54_, float f_55_, float f_56_, float f_57_, int i) {
		try {
			Buffer buffer = anInterface2_Impl1_4667.method75(true, (byte) 27);
			if (i != 8)
				return false;
			if (buffer == null)
				return false;
			Stream stream = method2043(24022, buffer);
			do {
				if (!Stream.a()) {
					stream.a(f_54_);
					stream.a(f_53_);
					stream.a(f_57_);
					stream.a(f_56_);
					stream.a(f_55_);
					stream.a(f);
					if (!client.aBoolean3553)
						break;
				}
				stream.b(f_54_);
				stream.b(f_53_);
				stream.b(f_57_);
				stream.b(f_56_);
				stream.b(f_55_);
				stream.b(f);
			} while (false);
			stream.c();
			return anInterface2_Impl1_4667.method71(13623);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.JE(" + f + ',' + f_53_ + ',' + f_54_ + ',' + f_55_ + ',' + f_56_ + ',' + f_57_ + ',' + i + ')'));
		}
	}

	final void X(int i) {
		try {
			this.anInt4573 = 0;
			for (/**/; i > 1; i >>= 1)
				this.anInt4573++;
			this.anInt4553 = 1 << this.anInt4573;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.X(" + i + ')');
		}
	}

	private final void method1970(int i) {
		do {
			try {
				aFloatArray4646[14] = aFloat4554;
				aFloatArray4646[10] = aFloat4626;
				this.aFloat4568 = ((float) -this.anInt4605 + aFloatArray4646[14]) / aFloatArray4646[10];
				if (i == -24793)
					break;
				this.aClass126_4625 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.QF(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method1971(int i, boolean bool, Interface2_Impl1 interface2_impl1);

	abstract void method1972(int i);

	abstract void method1973(Class232 class232, int i, int i_58_, int i_59_, Interface2_Impl2 interface2_impl2, int i_60_, int i_61_);

	final int i() {
		try {
			return this.anInt4640;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.i(" + ')');
		}
	}

	final void method1750(Canvas canvas) {
		try {
			anObject4537 = null;
			aCanvas4524 = null;
			do {
				if (canvas == null || canvas == this.aCanvas4533) {
					anObject4537 = this.anObject4530;
					aCanvas4524 = this.aCanvas4533;
					if (!client.aBoolean3553)
						break;
				}
				if (aHashtable4523.containsKey(canvas)) {
					anObject4537 = aHashtable4523.get(canvas);
					aCanvas4524 = canvas;
				}
			} while (false);
			if (aCanvas4524 == null || anObject4537 == null)
				throw new RuntimeException();
			method1944(anObject4537, aCanvas4524, (byte) -34);
			method2003(1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.DH(" + (canvas != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method1974(int i);

	final za method1762(int i) {
		try {
			za_Sub1 var_za_Sub1 = new za_Sub1(i);
			aClass148_4532.add_last(var_za_Sub1, -20911);
			return var_za_Sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.ME(" + i + ')');
		}
	}

	final void pa() {
		try {
			this.aBoolean4563 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.pa(" + ')');
		}
	}

	private final void method1975(int i) {
		try {
			method1991(i + -24391);
			method2004((byte) -120);
			method1955(i + -5668);
			method2035(-14713);
			method2065((byte) 80);
			method1989(-128);
			method2025((byte) -37);
			method1974(i);
			method1972(i);
			method1999((byte) 112);
			method2007(false);
			method2033(-112);
			method2016((byte) -118);
			method2046(i);
			for (int i_62_ = -1 + this.anInt4608; i_62_ >= 0; i_62_--) {
				method1951((byte) 120, i_62_);
				method2011(2);
				method1958((byte) -48);
				method1985(i ^ 0x2);
			}
			method2057(i + 12362);
			method2036(-11155);
			method1966((byte) 57);
			method1983((byte) -47);
			method2021(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.UG(" + i + ')');
		}
	}

	final void method1976(int i) {
		do {
			try {
				if (i >= -11)
					anInterface2_Impl1_4667 = null;
				if (anInt4633 == 8)
					break;
				method1938((byte) -20);
				method2028(true, (byte) -101);
				method2013(true, 2103);
				method1997(0, true);
				method2001(1, 89);
				anInt4633 = 8;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.QJ(" + i + ')');
			}
			break;
		} while (false);
	}

	final void EA(int i, int i_63_, int i_64_, int i_65_) {
		do {
			try {
				if (!this.aBoolean4563)
					throw new RuntimeException("");
				anInt4618 = i_65_;
				anInt4548 = i_64_;
				anInt4557 = i_63_;
				anInt4600 = i;
				if (!aBoolean4567)
					break;
				aClass76Array4613[3].method747(-25684);
				aClass76Array4613[3].method738(-127);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.EA(" + i + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method1819() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.KE(" + ')');
		}
	}

	abstract boolean method1977(Class162 class162, boolean bool, Class164 class164);

	final boolean method1810() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.PH(" + ')');
		}
	}

	final boolean method1824() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.UF(" + ')');
		}
	}

	final Class111_Sub3 method1978(byte i) {
		try {
			int i_66_ = 92 % ((i - 59) / 32);
			return this.aClass111_Sub3_4542;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.TF(" + i + ')');
		}
	}

	void method1806(int i) {
		try {
			if (aClass319_4624 != null)
				aClass319_4624.method3662(-124);
			this.anInt4556 = i & 0x7fffffff;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.UB(" + i + ')');
		}
	}

	final void method1979(boolean bool, int i) {
		try {
			if (i >= -57)
				method1959(56);
			if (!bool != !this.aBoolean4643) {
				this.aBoolean4643 = bool;
				method1955(-5668);
				anInt4633 &= ~0x7;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.OI(" + bool + ',' + i + ')');
		}
	}

	final Class111 method1793() {
		try {
			return aClass111_Sub3_4663;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.RI(" + ')');
		}
	}

	private final void method1980(int i) {
		do {
			try {
				this.aFloat4642 = (float) this.anInt4605;
				if (i == -20711)
					break;
				this.anInt4593 = 47;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.WI(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1981(byte i) {
		try {
			Enumeration enumeration = aHashtable4523.keys();
			while (enumeration.hasMoreElements()) {
				Canvas canvas = (Canvas) enumeration.nextElement();
				method1936(0, aHashtable4523.get(canvas), canvas);
			}
			anInterface2_Impl1_4660.method72(false);
			if (i >= -93)
				DA(-25, -24, -97, -114);
			anInterface2_Impl1_4667.method72(false);
			anInterface2_Impl1_4652.method72(false);
			this.aClass146_Sub3_4665.method2402(-12884);
			this.aClass146_Sub3_4651.method2402(-12884);
			this.aClass146_Sub3_4657.method2402(-12884);
			this.aClass146_Sub3_4650.method2402(-12884);
			this.aClass146_Sub3_4662.method2402(-12884);
			aClass81_4634.method814((byte) 4);
			anInterface2_Impl2_4666.method72(false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.DJ(" + i + ')');
		}
	}

	abstract Class256 method1982(Class49[] class49s, int i);

	final void method1749(boolean bool) {
		/* empty */
	}

	abstract void method1983(byte i);

	final void method1984(int i, int i_67_) {
		do {
			try {
				if (this.anInt4648 != i_67_) {
					this.anInt4648 = i_67_;
					method2057(12362);
				}
				if (i == 2)
					break;
				this.aBoolean4599 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.VI(" + i + ',' + i_67_ + ')'));
			}
			break;
		} while (false);
	}

	final Class98_Sub5 method1765(int i, int i_68_, int i_69_, int i_70_, int i_71_, float f) {
		try {
			return new Class98_Sub5_Sub1(i, i_68_, i_69_, i_70_, i_71_, f);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.HG(" + i + ',' + i_68_ + ',' + i_69_ + ',' + i_70_ + ',' + i_71_ + ',' + f + ')'));
		}
	}

	final void method1985(int i) {
		try {
			if (this.aClass258Array4644[this.anInt4579] != Class98_Sub46_Sub19.aClass258_6062) {
				this.aClass258Array4644[this.anInt4579] = Class98_Sub46_Sub19.aClass258_6062;
				this.aClass111_Sub3Array4609[this.anInt4579].method2091();
				method2014(i ^ 0x3d);
			}
			if (i != 2)
				method1797(87, 53, -22, 92, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.WD(" + i + ')');
		}
	}

	final void method1986(boolean bool, byte i) {
		try {
			if (!this.aBoolean4555 == bool) {
				this.aBoolean4555 = bool;
				method2025((byte) 13);
			}
			int i_72_ = -54 % ((-75 - i) / 42);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.CI(" + bool + ',' + i + ')');
		}
	}

	private final void method1987(boolean bool) {
		try {
			method1971(0, bool, anInterface2_Impl1_4667);
			if (bool != true)
				this.anInt4638 = -70;
			method2042(aClass256_4653, (byte) 118);
			method2037(Class334.aClass232_3468, 0, (byte) 56, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.TG(" + bool + ')');
		}
	}

	abstract void method1988(Canvas canvas, Object object, int i);

	abstract void method1989(int i);

	abstract Interface2_Impl2 method1990(byte i, boolean bool);

	abstract void method1991(int i);

	final void a(Class111 class111) {
		do {
			try {
				this.aClass111_Sub3_4543 = (Class111_Sub3) class111;
				this.aClass111_Sub3_4545.method2092(this.aClass111_Sub3_4543);
				this.aClass111_Sub3_4545.method2136(false);
				aClass111_Sub3_4546.method2132((byte) -52, (this.aClass111_Sub3_4545));
				this.aClass111_Sub3_4544.method2132((byte) 101, this.aClass111_Sub3_4543);
				if (!this.aClass204_4551.method2708(102))
					break;
				method1961(124);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.QE(" + (class111 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final void method1795(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		try {
			float f = (float) i_74_ - (float) i;
			float f_78_ = (float) i_75_ - (float) i_73_;
			do {
				if (f != 0.0F || f_78_ != 0.0F) {
					float f_79_ = (float) (1.0 / Math.sqrt(f_78_ * f_78_ + f * f));
					f *= f_79_;
					f_78_ *= f_79_;
					if (!client.aBoolean3553)
						break;
				}
				f = 1.0F;
			} while (false);
			if (method1969(0.0F, (float) i_73_, (float) i, f_78_ + (float) i_75_, f + (float) i_74_, 0.0F, 8)) {
				method1946(1);
				method1984(2, i_76_);
				method2051(0, -102, Class64_Sub16.aClass65_3681);
				method1953(-116, Class64_Sub16.aClass65_3681, 0);
				method2001(i_77_, 93);
				method1960(13951);
				method2059(false, false);
				method1987(true);
				method2059(true, false);
				method1953(-118, Class300.aClass65_2499, 0);
				method2051(0, -121, Class300.aClass65_2499);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.PG(" + i + ',' + i_73_ + ',' + i_74_ + ',' + i_75_ + ',' + i_76_ + ',' + i_77_ + ')'));
		}
	}

	ha_Sub3(Canvas canvas, Object object, d var_d, RuneScapeCache class207, int i, int i_80_) {
		super(var_d);
		aBoolean4550 = false;
		this.anInt4578 = 0;
		anInt4583 = -1;
		this.aFloat4576 = 1.0F;
		anInt4548 = -1;
		aBoolean4567 = false;
		this.aClass204_4551 = Class246_Sub3_Sub1_Sub2.aClass204_6247;
		this.anInt4581 = -1;
		this.aFloatArray4596 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.anInt4558 = 0;
		anInt4612 = 0;
		this.aBoolean4560 = true;
		aBoolean4574 = false;
		this.aFloat4611 = 1.0F;
		this.anInt4573 = 3;
		this.aFloatArray4572 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		this.anInt4589 = 512;
		this.anInt4622 = 0;
		this.aBoolean4620 = false;
		this.anInt4601 = 0;
		aFloatArray4604 = new float[16];
		this.anInt4575 = 0;
		this.anInt4602 = 0;
		aClass76Array4613 = new Class76[10];
		this.aFloat4591 = 1.0F;
		this.aBoolean4606 = true;
		this.aBoolean4571 = true;
		aBoolean4621 = false;
		aFloatArray4590 = new float[16];
		aBoolean4631 = false;
		this.anInt4607 = 128;
		anInt4632 = 1;
		this.anInt4553 = 8;
		this.anInt4593 = 512;
		this.anInt4605 = 3584;
		aFloatArray4629 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.aFloat4630 = -1.0F;
		this.aClass126_4625 = Class101.aClass126_848;
		this.aFloat4594 = -1.0F;
		this.anInt4640 = 50;
		anInt4595 = 0;
		this.anInt4579 = 0;
		this.anInt4587 = 0;
		aFloatArray4627 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.aBoolean4637 = false;
		anInt4623 = 16777215;
		this.anInt4636 = -1;
		anInt4618 = 0;
		this.aBoolean4599 = true;
		this.anInt4638 = 0;
		this.aFloat4642 = 3584.0F;
		this.aFloat4568 = 3584.0F;
		anInt4635 = 0;
		aFloatArray4646 = new float[16];
		this.aBoolean4577 = false;
		anInt4557 = -1;
		aFloatArray4582 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
		this.aFloatArray4566 = aFloatArray4582;
		this.aBoolean4643 = false;
		this.anInt4645 = 0;
		aStream4603 = new Stream();
		aClass111_Sub3_4663 = new Class111_Sub3();
		try {
			try {
				anObject4537 = this.anObject4530 = object;
				this.aClass207_4535 = class207;
				aCanvas4524 = this.aCanvas4533 = canvas;
				this.anInt4616 = i;
				Dimension dimension = canvas.getSize();
				this.anInt4531 = anInt4534 = dimension.height;
				this.anInt4580 = i_80_;
				this.anInt4527 = anInt4536 = dimension.width;
				Class101.method1702(8, false, true);
				if (this.aD938 != null) {
					aClass319_4624 = new Class319(this, this.aD938);
					this.aNativeInterface4526 = new NativeInterface(this.aD938.method12(true), this.anInt4580);
					for (int i_81_ = 0; i_81_ < this.aD938.method12(true); i_81_++) {
						Class238 class238 = this.aD938.method11(i_81_, -28755);
						if (class238 != null)
							this.aNativeInterface4526.initTextureMetrics(i_81_, class238.aByte1830, class238.aByte1829);
					}
				} else {
					this.aNativeInterface4526 = new NativeInterface(0, this.anInt4580);
					aClass319_4624 = null;
				}
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				this.method1743(-1);
				throw new RuntimeException("");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.<init>(" + (canvas != null ? "{...}" : "null") + ',' + (object != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + i + ',' + i_80_ + ')'));
		}
	}

	final void method1992(byte i) {
		do {
			try {
				if (Class246_Sub3_Sub1_Sub2.aClass204_6247 != this.aClass204_4551) {
					Class204 class204 = this.aClass204_4551;
					this.aClass204_4551 = Class246_Sub3_Sub1_Sub2.aClass204_6247;
					if (class204.method2708(98))
						method1961(97);
					this.aFloatArray4566 = aFloatArray4582;
					anInt4633 &= ~0x1f;
				}
				if (i == 125)
					break;
				method1790(null, 39, -121, 10, 17);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.VH(" + i + ')');
			}
			break;
		} while (false);
	}

	final void a(int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, aa var_aa, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_) {
		/* empty */
	}

	private final void method1993(byte i) {
		do {
			try {
				if (i != 103)
					aCanvas4524 = null;
				if (this.aClass204_4551 == Class64_Sub4.aClass204_3649)
					break;
				Class204 class204 = this.aClass204_4551;
				this.aClass204_4551 = Class64_Sub4.aClass204_3649;
				if (class204.method2708(118))
					method1961(-51);
				method1996(6281);
				this.aFloatArray4566 = aFloatArray4590;
				method1962(-76);
				anInt4633 &= ~0x18;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.NJ(" + i + ')');
			}
			break;
		} while (false);
	}

	final AbstractModel method1790(ModelDefinitions class178, int i, int i_92_, int i_93_, int i_94_) {
		try {
			return new Class146_Sub3(this, class178, i, i_93_, i_94_, i_92_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.VD(" + (class178 != null ? "{...}" : "null") + ',' + i + ',' + i_92_ + ',' + i_93_ + ',' + i_94_ + ')'));
		}
	}

	abstract void method1994(byte i, int i_95_);

	final void xa(float f) {
		do {
			try {
				if (this.aFloat4576 == f)
					break;
				this.aFloat4576 = f;
				this.aNativeInterface4526.setAmbient(f);
				method1991(-24391);
				method1989(87);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.xa(" + f + ')');
			}
			break;
		} while (false);
	}

	final void method1811(int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		try {
			float f = (float) i_97_ - (float) i;
			float f_104_ = (float) i_98_ - (float) i_96_;
			if (f != 0.0F || f_104_ != 0.0F) {
				float f_105_ = (float) (1.0 / Math.sqrt(f_104_ * f_104_ + f * f));
				f_104_ *= f_105_;
				f *= f_105_;
			} else
				f = 1.0F;
			method1946(1);
			method1984(2, i_99_);
			method2051(0, -106, Class64_Sub16.aClass65_3681);
			method1953(-106, Class64_Sub16.aClass65_3681, 0);
			method2001(i_100_, 93);
			method1960(13951);
			i_103_ %= i_102_ + i_101_;
			method2059(false, false);
			float f_106_ = (float) i_101_ * f;
			float f_107_ = (float) i_101_ * f_104_;
			float f_108_ = 0.0F;
			float f_109_ = 0.0F;
			float f_110_ = f_106_;
			float f_111_ = f_107_;
			if (i_103_ <= i_101_) {
				f_110_ = (float) (i_101_ + -i_103_) * f;
				f_111_ = (float) (i_101_ + -i_103_) * f_104_;
			} else {
				f_109_ = f_104_ * (float) (i_102_ + i_101_ + -i_103_);
				f_108_ = (float) (i_101_ - (-i_102_ - -i_103_)) * f;
			}
			float f_112_ = (float) i + f_108_;
			float f_113_ = (float) i_96_ + f_109_;
			float f_114_ = f * (float) i_102_;
			float f_115_ = (float) i_102_ * f_104_;
			for (;;) {
				if (i_97_ <= i) {
					if ((float) i_97_ > f_112_)
						break;
					if ((float) i_97_ > f_110_ + f_112_)
						f_110_ = (float) i_97_ - f_112_;
				} else {
					if (f_112_ > (float) i_97_)
						break;
					if (f_112_ + f_110_ > (float) i_97_)
						f_110_ = -f_112_ + (float) i_97_;
				}
				if (i_98_ <= i_96_) {
					if ((float) i_98_ > f_113_)
						break;
					if (f_113_ + f_111_ < (float) i_98_)
						f_111_ = -f_113_ + (float) i_98_;
				} else {
					if ((float) i_98_ < f_113_)
						break;
					if ((float) i_98_ < f_111_ + f_113_)
						f_111_ = (float) i_98_ - f_113_;
				}
				if (!method1969(0.0F, f_113_, f_112_, f_113_ + f_111_, f_110_ + f_112_, 0.0F, 8))
					return;
				f_112_ += f_114_ + f_110_;
				method1987(true);
				f_113_ += f_115_ + f_111_;
				f_110_ = f_106_;
				f_111_ = f_107_;
			}
			method2059(true, false);
			method1953(-128, Class300.aClass65_2499, 0);
			method2051(0, -121, Class300.aClass65_2499);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.CF(" + i + ',' + i_96_ + ',' + i_97_ + ',' + i_98_ + ',' + i_99_ + ',' + i_100_ + ',' + i_101_ + ',' + i_102_ + ',' + i_103_ + ')'));
		}
	}

	private final void method1995(int i) {
		try {
			anInterface2_Impl1_4660 = method2060(false, 58);
			anInterface2_Impl1_4660.method74(-20279, 28, 140);
			int i_116_ = 0;
			if (i != 9)
				method1993((byte) 112);
			for (/**/; i_116_ < 4; i_116_++) {
				Buffer buffer = anInterface2_Impl1_4660.method75(true, (byte) 27);
				if (buffer != null) {
					Stream stream = method2043(i + 24013, buffer);
					if (!Stream.a()) {
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(1.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(1.0F);
						stream.a(0.0F);
						stream.a(1.0F);
						stream.a(1.0F);
						stream.a(1.0F);
						stream.a(0.0F);
						stream.a(1.0F);
						stream.a(1.0F);
						stream.a(1.0F);
						stream.a(1.0F);
						stream.a(1.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(1.0F);
						stream.a(0.0F);
						stream.a(1.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(0.0F);
					} else {
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(1.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(1.0F);
						stream.b(0.0F);
						stream.b(1.0F);
						stream.b(1.0F);
						stream.b(1.0F);
						stream.b(0.0F);
						stream.b(1.0F);
						stream.b(1.0F);
						stream.b(1.0F);
						stream.b(1.0F);
						stream.b(1.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(1.0F);
						stream.b(0.0F);
						stream.b(1.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(0.0F);
					}
					stream.c();
					if (anInterface2_Impl1_4660.method71(13623))
						break;
				}
			}
			aClass256_4655 = method1982((new Class49[] { new Class49(new Class169[] { Class169.aClass169_1294, Class169.aClass169_1301, Class169.aClass169_1301 }) }), 6);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.BG(" + i + ')');
		}
	}

	private final void method1996(int i) {
		do {
			try {
				if (i != 6281)
					method1795(114, -87, -38, -57, 16, 20);
				if (aBoolean4574)
					break;
				float[] fs = aFloatArray4590;
				aBoolean4574 = true;
				if (this.anInt4527 != 0 && this.anInt4531 != 0) {
					fs[1] = 0.0F;
					fs[3] = 0.0F;
					fs[0] = 2.0F / (float) this.anInt4527;
					fs[4] = 0.0F;
					fs[15] = 1.0F;
					fs[13] = 1.0F;
					fs[11] = 0.0F;
					fs[10] = 0.5F;
					fs[8] = 0.0F;
					fs[6] = 0.0F;
					fs[9] = 0.0F;
					fs[7] = 0.0F;
					fs[2] = 0.0F;
					fs[14] = 0.5F;
					fs[12] = -1.0F;
					fs[5] = -2.0F / (float) this.anInt4531;
				} else {
					fs[0] = 1.0F;
					fs[7] = 0.0F;
					fs[8] = 0.0F;
					fs[4] = 0.0F;
					fs[5] = 1.0F;
					fs[1] = 0.0F;
					fs[3] = 0.0F;
					fs[15] = 1.0F;
					fs[6] = 0.0F;
					fs[9] = 0.0F;
					fs[10] = 1.0F;
					fs[2] = 0.0F;
					fs[13] = 0.0F;
					fs[11] = 0.0F;
					fs[14] = 0.0F;
					fs[12] = 0.0F;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.AI(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1767() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.JF(" + ')');
		}
	}

	final void method1997(int i, boolean bool) {
		try {
			if (i != 0)
				method1996(-123);
			if (!bool != !this.aBoolean4620) {
				this.aBoolean4620 = bool;
				method1972(0);
				anInt4633 &= ~0x1f;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.IJ(" + i + ',' + bool + ')');
		}
	}

	final boolean method1800() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.RE(" + ')');
		}
	}

	final void KA(int i, int i_117_, int i_118_, int i_119_) {
		try {
			if (i <= 0 && -1 + this.anInt4527 <= i_118_ && i_117_ <= 0 && this.anInt4531 - 1 <= i_119_)
				la();
			else {
				this.anInt4602 = i >= 0 ? i : 0;
				this.anInt4575 = this.anInt4527 < i_118_ ? 0 : i_118_;
				this.anInt4558 = i_117_ < 0 ? 0 : i_117_;
				this.anInt4638 = this.anInt4527 < i_119_ ? 0 : i_119_;
				if (!this.aBoolean4672) {
					this.aBoolean4672 = true;
					method2030((byte) -122);
				}
				method2009(28976);
				method2048((byte) 32);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.KA(" + i + ',' + i_117_ + ',' + i_118_ + ',' + i_119_ + ')'));
		}
	}

	final int method1998(byte i) {
		try {
			if (i <= 88)
				method1970(22);
			return anInt4557;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.KH(" + i + ')');
		}
	}

	abstract void method1999(byte i);

	private final void method2000(byte i) {
		try {
			if (i != -117)
				aBoolean4550 = false;
			if (!aBoolean4570) {
				float[] fs = aFloatArray4604;
				float f = (float) this.anInt4640;
				float f_120_ = (float) this.anInt4605;
				float f_121_ = ((float) -this.anInt4587 * aFloat4561 / (float) this.anInt4589);
				float f_122_ = (aFloat4561 * (float) -this.anInt4645 / (float) this.anInt4593);
				float f_123_ = (aFloat4561 * (float) (-this.anInt4645 + this.anInt4527) / (float) this.anInt4593);
				float f_124_ = (aFloat4561 * (float) (this.anInt4531 - this.anInt4587) / (float) this.anInt4589);
				do {
					if (f_123_ != f_122_ && f_121_ != f_124_) {
						fs[5] = 2.0F / (-f_121_ + f_124_);
						fs[0] = 2.0F / (-f_122_ + f_123_);
						fs[10] = 1.0F / (f - f_120_);
						fs[11] = 0.0F;
						fs[2] = 0.0F;
						fs[9] = 0.0F;
						fs[4] = 0.0F;
						fs[8] = 0.0F;
						fs[7] = 0.0F;
						fs[6] = 0.0F;
						fs[3] = 0.0F;
						fs[12] = (f_123_ + f_122_) / (-f_123_ + f_122_);
						fs[14] = f / (f - f_120_);
						fs[15] = 1.0F;
						fs[1] = 0.0F;
						fs[13] = (f_121_ + f_124_) / (-f_121_ + f_124_);
						if (!client.aBoolean3553)
							break;
					}
					fs[9] = 0.0F;
					fs[15] = 1.0F;
					fs[0] = 1.0F;
					fs[7] = 0.0F;
					fs[3] = 0.0F;
					fs[13] = 0.0F;
					fs[2] = 0.0F;
					fs[12] = 0.0F;
					fs[10] = 1.0F;
					fs[11] = 0.0F;
					fs[4] = 0.0F;
					fs[8] = 0.0F;
					fs[1] = 0.0F;
					fs[5] = 1.0F;
					fs[6] = 0.0F;
					fs[14] = 0.0F;
				} while (false);
				method1980(-20711);
				aBoolean4570 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.UH(" + i + ')');
		}
	}

	final void ZA(int i, float f, float f_125_, float f_126_, float f_127_, float f_128_) {
		try {
			boolean bool = anInt4623 != i;
			if (bool || this.aFloat4630 != f || f_125_ != this.aFloat4594) {
				this.aFloat4594 = f_125_;
				anInt4623 = i;
				this.aFloat4630 = f;
				if (bool) {
					this.aFloat4611 = (float) (anInt4623 & 0xff0000) / 1.671168E7F;
					this.aFloat4549 = (float) (anInt4623 & 0xff00) / 65280.0F;
					this.aFloat4591 = (float) (anInt4623 & 0xff) / 255.0F;
					method1991(-24391);
				}
				this.aNativeInterface4526.setSunColour(this.aFloat4611, this.aFloat4549, this.aFloat4591, f, f_125_);
				method2004((byte) -103);
			}
			if (aFloatArray4627[0] != f_126_ || aFloatArray4627[1] != f_127_ || aFloatArray4627[2] != f_128_) {
				aFloatArray4627[2] = f_128_;
				aFloatArray4627[0] = f_126_;
				aFloatArray4627[1] = f_127_;
				aFloatArray4629[1] = -f_127_;
				aFloatArray4629[0] = -f_126_;
				aFloatArray4629[2] = -f_128_;
				float f_129_ = (float) (1.0 / Math.sqrt(f_127_ * f_127_ + f_126_ * f_126_ + f_128_ * f_128_));
				this.aFloatArray4596[1] = f_127_ * f_129_;
				this.aFloatArray4596[2] = f_129_ * f_128_;
				this.aFloatArray4596[0] = f_126_ * f_129_;
				this.aFloatArray4572[2] = -this.aFloatArray4596[2];
				this.aFloatArray4572[1] = -this.aFloatArray4596[1];
				this.aFloatArray4572[0] = -this.aFloatArray4596[0];
				this.aNativeInterface4526.setSunDirection(this.aFloatArray4596[0], this.aFloatArray4596[1], this.aFloatArray4596[2]);
				method2065((byte) 80);
				this.anInt4564 = (int) (256.0F * f_126_ / f_127_);
				this.anInt4552 = (int) (f_128_ * 256.0F / f_127_);
			}
			method1989(72);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.ZA(" + i + ',' + f + ',' + f_125_ + ',' + f_126_ + ',' + f_127_ + ',' + f_128_ + ')'));
		}
	}

	final void method2001(int i, int i_130_) {
		try {
			if (i_130_ > 68) {
				if (i != anInt4632) {
					Class126 class126;
					boolean bool;
					boolean bool_131_;
					if (i == 1) {
						bool_131_ = true;
						class126 = Class101.aClass126_848;
						bool = true;
					} else if (i != 2) {
						if (i == 128) {
							class126 = Class83.aClass126_632;
							bool = true;
							bool_131_ = true;
						} else {
							class126 = Class39.aClass126_361;
							bool_131_ = false;
							bool = false;
						}
					} else {
						bool_131_ = false;
						class126 = Class373_Sub1_Sub1.aClass126_6216;
						bool = true;
					}
					if (!bool_131_ == this.aBoolean4599) {
						this.aBoolean4599 = bool_131_;
						method2046(0);
					}
					if (this.aBoolean4560 != bool) {
						this.aBoolean4560 = bool;
						method2033(52);
					}
					if (this.aClass126_4625 != class126) {
						this.aClass126_4625 = class126;
						method2016((byte) -118);
					}
					anInt4633 &= ~0x1c;
					anInt4632 = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.CJ(" + i + ',' + i_130_ + ')');
		}
	}

	final void method1785(Class242 class242, int i) {
		try {
			aClass81_4634.method818((byte) -108, class242, i, this);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.CG(" + (class242 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int M() {
		try {
			return anInt4671;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.M(" + ')');
		}
	}

	final void DA(int i, int i_132_, int i_133_, int i_134_) {
		try {
			this.anInt4593 = i_133_;
			this.anInt4587 = i_132_;
			this.anInt4645 = i;
			this.anInt4589 = i_134_;
			method2038((byte) 121);
			method1943(10886);
			method1992((byte) 125);
			method2048((byte) 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.DA(" + i + ',' + i_132_ + ',' + i_133_ + ',' + i_134_ + ')'));
		}
	}

	final void method1775(Class48 class48) {
		try {
			aClass48_Sub2_4614 = (Class48_Sub2) class48;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.MH(" + (class48 != null ? "{...}" : "null") + ')');
		}
	}

	final void la() {
		try {
			this.anInt4558 = 0;
			this.anInt4602 = 0;
			this.anInt4575 = this.anInt4527;
			this.anInt4638 = this.anInt4531;
			if (this.aBoolean4672) {
				this.aBoolean4672 = false;
				method2030((byte) -122);
			}
			method2048((byte) 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.la(" + ')');
		}
	}

	final Class48 method1803(int i, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_) {
		try {
			return new Class48_Sub2_Sub1(this, i, i_135_, i_136_, i_137_, i_138_, i_139_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.II(" + i + ',' + i_135_ + ',' + i_136_ + ',' + i_137_ + ',' + i_138_ + ',' + i_139_ + ')'));
		}
	}

	final void method2002(byte i) {
		try {
			method2054(false, 2, Class98_Sub46_Sub15.aClass232_6043);
			int i_140_ = 48 % ((-22 - i) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.CE(" + i + ')');
		}
	}

	private final void method2003(int i) {
		try {
			if (i != 1)
				this.anInt4648 = 58;
			do {
				if (aCanvas4524 == null) {
					anInt4536 = anInt4534 = 1;
					if (!client.aBoolean3553)
						break;
				}
				Dimension dimension = aCanvas4524.getSize();
				anInt4536 = dimension.width;
				anInt4534 = dimension.height;
			} while (false);
			this.anInt4527 = anInt4536;
			this.anInt4531 = anInt4534;
			method2031(-12545);
			method1943(i + 10885);
			method2038((byte) 115);
			method2036(-11155);
			method2048((byte) 32);
			method1992((byte) 125);
			la();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.EJ(" + i + ')');
		}
	}

	final void method1783(int i) {
		try {
			if (i != 1)
				throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.OF(" + i + ')');
		}
	}

	abstract void method2004(byte i);

	final void method2005(Interface4 interface4, int i) {
		try {
			int i_141_ = -43 / ((-60 - i) / 51);
			if (interface4 != anInterface4Array4617[this.anInt4579]) {
				anInterface4Array4617[this.anInt4579] = interface4;
				do {
					if (interface4 != null) {
						interface4.method5(101);
						if (!client.aBoolean3553)
							break;
					}
					method1959(0);
				} while (false);
				anInt4633 &= ~0x1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.FE(" + (interface4 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	abstract Interface4_Impl2 method2006(int i, int i_142_, Class164 class164, byte i_143_, Class162 class162);

	abstract void method2007(boolean bool);

	final void method2008(Class258 class258, byte i) {
		try {
			this.aClass258Array4644[this.anInt4579] = class258;
			if (i >= 25)
				method2014(105);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.AH(" + (class258 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	abstract void method2009(int i);

	abstract void method2010(int i);

	abstract void method2011(int i);

	final s a(int i, int i_144_, int[][] is, int[][] is_145_, int i_146_, int i_147_, int i_148_) {
		try {
			return new s_Sub2(this, i_147_, i_148_, i, i_144_, is, is_145_, i_146_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.DG(" + i + ',' + i_144_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_145_ != null ? "{...}" : "null") + ',' + i_146_ + ',' + i_147_ + ',' + i_148_ + ')'));
		}
	}

	final Interface4_Impl2 method2012(int i, int i_149_, byte i_150_, int[] is, boolean bool) {
		try {
			if (i_150_ != 31)
				aClass76_4598 = null;
			return method2063(0, (byte) 126, is, bool, i, i_149_, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.BI(" + i + ',' + i_149_ + ',' + i_150_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final boolean method1823() {
		try {
			return this.aBoolean4559;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.AF(" + ')');
		}
	}

	final void L(int i, int i_151_, int i_152_) {
		try {
			if (i != this.anInt4636 || this.anInt4581 != i_151_ || (i_152_ != this.anInt4601)) {
				this.anInt4636 = i;
				this.anInt4601 = i_152_;
				this.anInt4581 = i_151_;
				method2020(-123);
				method1999((byte) 112);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.L(" + i + ',' + i_151_ + ',' + i_152_ + ')'));
		}
	}

	final void method2013(boolean bool, int i) {
		do {
			try {
				if (bool != this.aBoolean4577) {
					this.aBoolean4577 = bool;
					method1974(i + -2103);
					anInt4633 &= ~0x1f;
				}
				if (i == 2103)
					break;
				this.aFloat4642 = -1.3455139F;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.GJ(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2014(int i) {
		do {
			try {
				method2010(-107);
				if (aClass76_4598 != null)
					aClass76_4598.method749(8);
				if (i > 37)
					break;
				this.anInt4538 = 2;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.DI(" + i + ')');
			}
			break;
		} while (false);
	}

	final void HA(int i, int i_153_, int i_154_, int i_155_, int[] is) {
		try {
			float f = (this.aClass111_Sub3_4543.method2135((float) i_153_, (float) i_154_, (float) i, false));
			if ((float) this.anInt4640 > f || f > (float) this.anInt4605)
				is[0] = is[1] = is[2] = -1;
			else {
				int i_156_ = (int) ((float) this.anInt4593 * (this.aClass111_Sub3_4543.method2126((float) i_154_, (float) i, (float) i_153_, 118)) / (float) i_155_);
				int i_157_ = (int) ((float) this.anInt4589 * (this.aClass111_Sub3_4543.method2139((float) i_153_, (float) i, (float) i_154_, true)) / (float) i_155_);
				is[0] = (int) (-this.aFloat4641 + (float) i_156_);
				is[1] = (int) (-this.aFloat4610 + (float) i_157_);
				is[2] = (int) f;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.HA(" + i + ',' + i_153_ + ',' + i_154_ + ',' + i_155_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] Y() {
		try {
			return (new int[] { this.anInt4645, this.anInt4587, this.anInt4593, this.anInt4589 });
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.Y(" + ')');
		}
	}

	final void method2015(int i, byte i_158_) {
		try {
			int i_159_ = 51 % ((i_158_ - -37) / 58);
			if (i != 1) {
				if (i != 0) {
					if (i == 2)
						method2019(Class288.aClass128_3381, Class323.aClass128_2715, 22831);
					else if (i != 3) {
						if (i == 4)
							method2019(Class28.aClass128_286, Class28.aClass128_286, 22831);
					} else
						method2019(Class249.aClass128_1903, Class1.aClass128_64, 22831);
				} else
					method2019(Class249.aClass128_1903, Class249.aClass128_1903, 22831);
			} else
				method2019(Class288.aClass128_3381, Class288.aClass128_3381, 22831);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.VF(" + i + ',' + i_158_ + ')');
		}
	}

	abstract void method2016(byte i);

	final int method2017(byte i) {
		try {
			if (i != 67)
				method1773();
			return anInt4600;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.WF(" + i + ')');
		}
	}

	final int JA(int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
		try {
			int i_165_ = 0;
			float f = ((this.aClass111_Sub3_4543.aFloat4708) * (float) i + (this.aClass111_Sub3_4543.aFloat4713) * (float) i_160_ + ((float) i_161_ * (this.aClass111_Sub3_4543.aFloat4704)) + (this.aClass111_Sub3_4543.aFloat4703));
			if (f < 1.0F)
				f = 1.0F;
			float f_166_ = (((float) i_162_ * (this.aClass111_Sub3_4543.aFloat4708)) + (this.aClass111_Sub3_4543.aFloat4713) * (float) i_163_ + ((float) i_164_ * (this.aClass111_Sub3_4543.aFloat4704)) + (this.aClass111_Sub3_4543.aFloat4703));
			if (f_166_ < 1.0F)
				f_166_ = 1.0F;
			if (!(f < (float) this.anInt4640) || !(f_166_ < (float) this.anInt4640)) {
				if (f > (float) this.anInt4605 && f_166_ > (float) this.anInt4605)
					i_165_ |= 0x20;
			} else
				i_165_ |= 0x10;
			int i_167_ = (int) ((((float) i_161_ * this.aClass111_Sub3_4543.aFloat4705) + ((this.aClass111_Sub3_4543.aFloat4711 * (float) i_160_) + (this.aClass111_Sub3_4543.aFloat4712) * (float) i) + this.aClass111_Sub3_4543.aFloat4702) * (float) this.anInt4593 / f);
			int i_168_ = (int) ((float) this.anInt4593 * (((float) i_164_ * (this.aClass111_Sub3_4543.aFloat4705)) + ((this.aClass111_Sub3_4543.aFloat4712) * (float) i_162_ + ((float) i_163_ * (this.aClass111_Sub3_4543.aFloat4711))) + (this.aClass111_Sub3_4543.aFloat4702)) / f_166_);
			if (!((float) i_167_ < this.aFloat4641) || !((float) i_168_ < this.aFloat4641)) {
				if (this.aFloat4647 < (float) i_167_ && (float) i_168_ > this.aFloat4647)
					i_165_ |= 0x2;
			} else
				i_165_ |= 0x1;
			int i_169_ = (int) ((((float) i_160_ * this.aClass111_Sub3_4543.aFloat4706) + (this.aClass111_Sub3_4543.aFloat4714 * (float) i) + (this.aClass111_Sub3_4543.aFloat4710 * (float) i_161_) + this.aClass111_Sub3_4543.aFloat4709) * (float) this.anInt4589 / f);
			int i_170_ = (int) ((float) this.anInt4589 * (this.aClass111_Sub3_4543.aFloat4709 + ((this.aClass111_Sub3_4543.aFloat4710) * (float) i_164_ + ((this.aClass111_Sub3_4543.aFloat4706) * (float) i_163_ + ((float) i_162_ * (this.aClass111_Sub3_4543.aFloat4714))))) / f_166_);
			if (this.aFloat4610 > (float) i_169_ && this.aFloat4610 > (float) i_170_)
				i_165_ |= 0x4;
			else if ((float) i_169_ > this.aFloat4584 && this.aFloat4584 < (float) i_170_)
				i_165_ |= 0x8;
			return i_165_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.JA(" + i + ',' + i_160_ + ',' + i_161_ + ',' + i_162_ + ',' + i_163_ + ',' + i_164_ + ')'));
		}
	}

	final int method2018(byte i) {
		try {
			if (i < 78)
				aClass319_4624 = null;
			return anInt4618;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.WH(" + i + ')');
		}
	}

	final void method2019(Class128 class128, Class128 class128_171_, int i) {
		do {
			try {
				boolean bool = false;
				if (i == 22831) {
					if (class128_171_ != (this.aClass128Array4585[this.anInt4579])) {
						this.aClass128Array4585[(this.anInt4579)] = class128_171_;
						method2011(2);
						bool = true;
					}
					if ((this.aClass128Array4639[this.anInt4579]) != class128) {
						this.aClass128Array4639[(this.anInt4579)] = class128;
						method1958((byte) -48);
						bool = true;
					}
					if (!bool)
						break;
					anInt4633 &= ~0x1d;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.IF(" + (class128 != null ? "{...}" : "null") + ',' + (class128_171_ != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void A(int i, aa var_aa, int i_172_, int i_173_) {
		try {
			aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
			Interface4_Impl2 interface4_impl2 = var_aa_Sub2.anInterface4_Impl2_3563;
			method2052(false);
			method2005(interface4_impl2, 95);
			method2001(1, 100);
			method2019(Class288.aClass128_3381, Class288.aClass128_3381, 22831);
			method2051(0, -60, Class64_Sub16.aClass65_3681);
			method1984(2, i);
			this.aClass111_Sub3_4542.method2137((float) this.anInt4531, (byte) -110, (float) this.anInt4527, 0.0F);
			method1935(1);
			this.aClass111_Sub3Array4609[0].method2137(interface4_impl2.method45(-8473, (float) this.anInt4531), (byte) -128, interface4_impl2.method42((byte) 115, (float) this.anInt4527), 1.0F);
			this.aClass111_Sub3Array4609[0].method2141(-94, interface4_impl2.method45(-8473, (float) -i_173_), 0.0F, interface4_impl2.method42((byte) -124, (float) -i_172_));
			this.aClass258Array4644[0] = Class246_Sub3_Sub4_Sub5.aClass258_6260;
			method2014(113);
			method2002((byte) -104);
			method1985(2);
			method2051(0, -58, Class300.aClass65_2499);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.A(" + i + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_172_ + ',' + i_173_ + ')'));
		}
	}

	void method1773() {
		try {
			if (!aBoolean4550) {
				for (Node class98 = aClass148_4532.method2418(32); class98 != null; class98 = aClass148_4532.method2417(126))
					((za_Sub1) class98).method1677((byte) 41);
				Enumeration enumeration = aHashtable4523.keys();
				while (enumeration.hasMoreElements()) {
					Canvas canvas = (Canvas) enumeration.nextElement();
					method1936(0, aHashtable4523.get(canvas), canvas);
				}
				Class18.method248(true, 125, false);
				this.aNativeInterface4526.release();
				aBoolean4550 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.AB(" + ')');
		}
	}

	private final void method2020(int i) {
		do {
			try {
				if (aClass76_4598 != null)
					aClass76_4598.method738(-59);
				method2007(false);
				if (i <= -110)
					break;
				aBoolean4621 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.PJ(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method1822() {
		try {
			return this.anInt4565 + -2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.LG(" + ')');
		}
	}

	final void da(int i, int i_174_, int i_175_, int[] is) {
		try {
			float f = (this.aClass111_Sub3_4543.method2135((float) i_174_, (float) i_175_, (float) i, false));
			int i_176_;
			int i_177_;
			do {
				if (!(f < -0.0078125F) && !(f > 0.0078125F)) {
					i_176_ = this.anInt4587;
					i_177_ = this.anInt4645;
					if (!client.aBoolean3553)
						break;
				}
				i_177_ = (int) ((float) this.anInt4593 * (this.aClass111_Sub3_4543.method2126((float) i_175_, (float) i, (float) i_174_, 119)) / f);
				i_176_ = (int) ((float) this.anInt4589 * (this.aClass111_Sub3_4543.method2139((float) i_174_, (float) i, (float) i_175_, true)) / f);
			} while (false);
			is[1] = (int) ((float) i_176_ - this.aFloat4610);
			is[0] = (int) ((float) i_177_ - this.aFloat4641);
			is[2] = (int) f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.da(" + i + ',' + i_174_ + ',' + i_175_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method2021(int i);

	private final void method2022(byte i) {
		try {
			anInterface2_Impl1_4652 = method2060(false, 71);
			int i_178_ = -86 / ((i - 38) / 57);
			anInterface2_Impl1_4652.method74(-20279, 12, 3096);
			for (int i_179_ = 0; i_179_ < 4; i_179_++) {
				Buffer buffer = anInterface2_Impl1_4652.method75(true, (byte) 27);
				if (buffer != null) {
					Stream stream = method2043(24022, buffer);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					for (int i_180_ = 0; i_180_ <= 256; i_180_++) {
						double d = (3.141592653589793 * (double) (i_180_ * 2) / 256.0);
						float f = (float) Math.cos(d);
						float f_181_ = (float) Math.sin(d);
						if (!Stream.a()) {
							stream.a(f_181_);
							stream.a(f);
							stream.a(0.0F);
						} else {
							stream.b(f_181_);
							stream.b(f);
							stream.b(0.0F);
						}
					}
					stream.c();
					if (anInterface2_Impl1_4652.method71(13623))
						break;
				}
			}
			aClass256_4669 = method1982((new Class49[] { new Class49(Class169.aClass169_1294) }), 6);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.BJ(" + i + ')');
		}
	}

	final Class111_Sub3 method2023(int i) {
		try {
			if (i != 1)
				return null;
			return aClass111_Sub3_4546;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.GH(" + i + ')');
		}
	}

	public static void method2024(boolean bool) {
		try {
			if (bool == true)
				aClass207_4528 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.EI(" + bool + ')');
		}
	}

	final Class111 method1821() {
		try {
			return new Class111_Sub3();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.SE(" + ')');
		}
	}

	abstract void method2025(byte i);

	final void method1798(int i) {
		/* empty */
	}

	abstract void method2026(int i, boolean bool, byte i_182_, Class65 class65, boolean bool_183_);

	final Class111_Sub3 method2027(int i) {
		try {
			if (i != 0)
				return null;
			if (!aBoolean4621) {
				aClass111_Sub3_4547.method2130((this.aClass111_Sub3_4545), (this.aClass111_Sub3_4542));
				aBoolean4621 = true;
			}
			return aClass111_Sub3_4547;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.VE(" + i + ')');
		}
	}

	final void method2028(boolean bool, byte i) {
		do {
			try {
				if (!this.aBoolean4562 != !bool) {
					this.aBoolean4562 = bool;
					method1999((byte) 112);
					anInt4633 &= ~0x1f;
				}
				if (i == -101)
					break;
				this.anInt4578 = 35;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.OJ(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method2029(byte i, boolean bool) {
		do {
			try {
				if (i > -37)
					method2037(null, 65, (byte) 115, 56);
				if (this.aBoolean4637 != !bool)
					break;
				this.aBoolean4637 = bool;
				method1955(-5668);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.FF(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	abstract void method2030(byte i);

	private final void method2031(int i) {
		do {
			try {
				if (i == -12545) {
					aBoolean4574 = false;
					if (Class64_Sub4.aClass204_3649 != this.aClass204_4551)
						break;
					method1996(i ^ ~0x2989);
					method1962(-110);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.NI(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract Interface4_Impl2 method2032(byte[] is, boolean bool, Class164 class164, int i, int i_184_, boolean bool_185_, int i_186_, int i_187_);

	final int method1777(int i, int i_188_) {
		try {
			return i | i_188_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.HF(" + i + ',' + i_188_ + ')');
		}
	}

	final void method1778(int i) {
		try {
			if (i < 128 || i > 1024)
				throw new IllegalArgumentException();
			if (aClass319_4624 != null)
				aClass319_4624.method3659(-3);
			this.anInt4607 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.CH(" + i + ')');
		}
	}

	final void method1818(int i, Class98_Sub5[] class98_sub5s) {
		do {
			try {
				for (int i_189_ = 0; i_189_ < i; i_189_++)
					this.aClass98_Sub5Array4597[i_189_] = class98_sub5s[i_189_];
				this.anInt4619 = i;
				if (!this.aClass204_4551.method2708(100))
					break;
				method2035(-14713);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.GF(" + i + ',' + (class98_sub5s != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	abstract void method2033(int i);

	final Class332 method1770(int[] is, int i, int i_190_, int i_191_, int i_192_, boolean bool) {
		try {
			return new Class332_Sub2(this, i_191_, i_192_, is, i, i_190_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.MF(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_190_ + ',' + i_191_ + ',' + i_192_ + ',' + bool + ')'));
		}
	}

	final Class332 method1797(int i, int i_193_, int i_194_, int i_195_, boolean bool) {
		try {
			Class332_Sub2 class332_sub2 = new Class332_Sub2(this, i_194_, i_195_, bool);
			class332_sub2.method3736(0, 0, i_194_, i_195_, i, i_193_);
			return class332_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.MG(" + i + ',' + i_193_ + ',' + i_194_ + ',' + i_195_ + ',' + bool + ')'));
		}
	}

	final float[] method2034(int i) {
		try {
			if (i >= -37)
				method2062(96);
			return aFloatArray4582;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.HI(" + i + ')');
		}
	}

	final Class111 method1752() {
		try {
			return this.aClass111_Sub3_4543;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.NE(" + ')');
		}
	}

	void method2035(int i) {
		try {
			this.anInt4628 = this.anInt4619;
			if (i != -14713)
				this.aBoolean4571 = true;
			this.anInt4619 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.BC(" + i + ')');
		}
	}

	final boolean method1771() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.VG(" + ')');
		}
	}

	abstract void method2036(int i);

	abstract void method2037(Class232 class232, int i, byte i_196_, int i_197_);

	private final void method2038(byte i) {
		do {
			try {
				aBoolean4570 = false;
				if (i >= 103) {
					method2000((byte) -117);
					if (ParamType.aClass204_1206 != this.aClass204_4551)
						break;
					method1962(-107);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.GI(" + i + ')');
			}
			break;
		} while (false);
	}

	final void Q(int i, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, byte[] is, int i_203_, int i_204_) {
		/* empty */
	}

	final void method2039(boolean bool, int i, int i_205_, boolean bool_206_) {
		try {
			if (i != 0)
				this.aFloat4568 = 0.2778904F;
			if (i_205_ != anInt4583 || !aBoolean4567 != !this.aBoolean4563) {
				Interface4_Impl2 interface4_impl2 = null;
				int i_207_ = 0;
				byte i_208_ = 0;
				int i_209_ = 0;
				byte i_210_ = !this.aBoolean4563 ? (byte) 0 : (byte) 3;
				if (i_205_ >= 0) {
					interface4_impl2 = aClass319_4624.method3661(0, i_205_);
					Class238 class238 = this.aD938.method11(i_205_, i + -28755);
					if (class238.aByte1823 != 0 || (class238.aByte1837 != 0)) {
						int i_211_ = !class238.aBoolean1822 ? 128 : 64;
						int i_212_ = 50 * i_211_;
						Class111_Sub3 class111_sub3 = method1957((byte) 61);
						class111_sub3.method2119(0.0F, 1, ((float) (this.anInt4556 % i_212_ * class238.aByte1837) / (float) i_212_), ((float) (class238.aByte1823 * (this.anInt4556 % i_212_)) / (float) i_212_));
						method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260, (byte) 114);
					} else
						method1985(2);
					i_207_ = class238.anInt1821;
					if (!this.aBoolean4563) {
						i_208_ = class238.aByte1816;
						i_210_ = class238.aByte1820;
						i_209_ = class238.anInt1835;
					}
				} else
					method1985(2);
				method2045((byte) -113, i_209_, i_210_, bool, bool_206_, i_208_);
				if (aClass76_4598 == null) {
					method2005(interface4_impl2, 23);
					method2015(i_207_, (byte) 118);
				} else
					aClass76_4598.method742(6, i_207_, interface4_impl2);
				anInt4583 = i_205_;
				aBoolean4567 = this.aBoolean4563;
			}
			anInt4633 &= ~0x7;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.NH(" + bool + ',' + i + ',' + i_205_ + ',' + bool_206_ + ')'));
		}
	}

	final float[] method2040(float[] fs, int i) {
		try {
			fs[4] = this.aFloatArray4566[1];
			fs[8] = this.aFloatArray4566[2];
			fs[0] = this.aFloatArray4566[0];
			fs[12] = this.aFloatArray4566[3];
			fs[5] = this.aFloatArray4566[5];
			fs[13] = this.aFloatArray4566[7];
			if (i != 32227)
				return null;
			fs[9] = this.aFloatArray4566[6];
			fs[2] = this.aFloatArray4566[8];
			fs[1] = this.aFloatArray4566[4];
			fs[3] = this.aFloatArray4566[12];
			fs[10] = this.aFloatArray4566[10];
			fs[14] = this.aFloatArray4566[11];
			fs[6] = this.aFloatArray4566[9];
			fs[7] = this.aFloatArray4566[13];
			fs[15] = this.aFloatArray4566[15];
			fs[11] = this.aFloatArray4566[14];
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.SF(" + (fs != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method2041(int i) {
		do {
			try {
				anInterface2_Impl1_4667 = method2060(true, 117);
				anInterface2_Impl1_4667.method74(-20279, 12, 24);
				aClass256_4653 = method1982((new Class49[] { new Class49(Class169.aClass169_1294) }), 6);
				if (i < -62)
					break;
				Q(-59, -44, 25, -91, -71, -40, null, 99, 111);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.LJ(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1786(Canvas canvas) {
		do {
			try {
				if (canvas == this.aCanvas4533)
					throw new RuntimeException();
				if (!aHashtable4523.containsKey(canvas))
					break;
				method1936(0, aHashtable4523.get(canvas), canvas);
				aHashtable4523.remove(canvas);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.KG(" + (canvas != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final int XA() {
		try {
			return this.anInt4605;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.XA(" + ')');
		}
	}

	abstract void method2042(Class256 class256, byte i);

	final void K(int[] is) {
		try {
			is[0] = this.anInt4602;
			is[2] = this.anInt4575;
			is[1] = this.anInt4558;
			is[3] = this.anInt4638;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.K(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method1747() {
		try {
			return aClass76Array4613[3].method745((byte) 27);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.HJ(" + ')');
		}
	}

	final boolean method1766() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.NG(" + ')');
		}
	}

	final Stream method2043(int i, Buffer buffer) {
		try {
			aStream4603.a(buffer);
			if (i != 24022)
				this.aFloat4642 = -2.1684475F;
			return aStream4603;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.RH(" + i + ',' + (buffer != null ? "{...}" : "null") + ')'));
		}
	}

	abstract Interface4_Impl1 method2044(int i, Class164 class164, byte[] is, int i_213_, int i_214_, int i_215_);

	private final void method2045(byte i, int i_216_, int i_217_, boolean bool, boolean bool_218_, int i_219_) {
		do {
			try {
				bool &= method1747();
				if (!bool && (i_217_ == 4 || i_217_ == 8 || i_217_ == 9)) {
					i_217_ = 2;
					i_216_ = i_217_ != 4 ? 1 : 0x1 & i_219_;
					i_219_ = 0;
				}
				if (i >= -93)
					method1945((byte) 95, true);
				if (i_217_ != 0 && bool_218_)
					i_217_ |= ~0x7fffffff;
				if (anInt4612 != i_217_) {
					if (anInt4612 != 0)
						aClass76Array4613[0x7fffffff & anInt4612].method739(-2);
					do {
						if (i_217_ != 0) {
							aClass76_4598 = aClass76Array4613[0x7fffffff & i_217_];
							aClass76_4598.method748(69, bool_218_);
							aClass76_4598.method743(97, bool_218_);
							aClass76_4598.method746(i_219_, i_216_, -121);
							if (!client.aBoolean3553)
								break;
						}
						aClass76_4598 = null;
					} while (false);
					anInt4635 = i_219_;
					anInt4595 = i_216_;
					anInt4612 = i_217_;
				} else {
					if (anInt4612 == 0)
						break;
					aClass76Array4613[anInt4612 & 0x7fffffff].method743(99, bool_218_);
					if (anInt4635 != i_219_ || anInt4595 != i_216_) {
						aClass76Array4613[0x7fffffff & anInt4612].method746(i_219_, i_216_, -125);
						anInt4635 = i_219_;
						anInt4595 = i_216_;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.TH(" + i + ',' + i_216_ + ',' + i_217_ + ',' + bool + ',' + bool_218_ + ',' + i_219_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void method2046(int i);

	abstract void method2047(int i, boolean bool, byte i_220_, Class65 class65);

	private final void method2048(byte i) {
		try {
			this.aFloat4647 = (float) (this.anInt4575 - this.anInt4645);
			this.aFloat4610 = (float) (this.anInt4558 + -this.anInt4587);
			if (i != 32)
				this.aClass146_Sub3_4649 = null;
			this.aFloat4641 = (float) (this.anInt4602 - this.anInt4645);
			this.aFloat4584 = (float) (-this.anInt4587 + this.anInt4638);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.OG(" + i + ')');
		}
	}

	final void method2049(int i, Class111_Sub3 class111_sub3) {
		try {
			this.aClass111_Sub3_4542.method2092(class111_sub3);
			this.aBoolean4540 = false;
			method2055(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.HE(" + i + ',' + (class111_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	abstract float method2050(byte i);

	final void method1741(Canvas canvas, int i, int i_221_) {
		do {
			try {
				if (canvas == this.aCanvas4533)
					throw new RuntimeException();
				if (aHashtable4523.containsKey(canvas))
					break;
				if (!canvas.isShowing())
					throw new RuntimeException();
				try {
					Class var_class = Class.forName("java.awt.Canvas");
					Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
					method.invoke(canvas, new Object[] { Boolean.TRUE });
				} catch (Exception exception) {
					/* empty */
				}
				Object object = method2058(canvas, -8401);
				if (object == null)
					throw new RuntimeException();
				aHashtable4523.put(canvas, object);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uv.FI(" + (canvas != null ? "{...}" : "null") + ',' + i + ',' + i_221_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1751(int i, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_) {
		/* empty */
	}

	final void method1801(int[] is) {
		try {
			is[1] = this.anInt4531;
			is[0] = this.anInt4527;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.UD(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final Class43 method1804(Class197 class197, Class324[] class324s, boolean bool) {
		try {
			return new Class43_Sub2(this, class197, class324s, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.HH(" + (class197 != null ? "{...}" : "null") + ',' + (class324s != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method2051(int i, int i_234_, Class65 class65) {
		try {
			if (i_234_ >= -52)
				method1940((byte) 56);
			method2026(i, false, (byte) 27, class65, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.BH(" + i + ',' + i_234_ + ',' + (class65 != null ? "{...}" : "null") + ')'));
		}
	}

	final int c(int i, int i_235_) {
		try {
			return i_235_ ^ i_235_ & i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.JH(" + i + ',' + i_235_ + ')');
		}
	}

	final void method2052(boolean bool) {
		do {
			try {
				if (bool == false) {
					if (anInt4633 == 2)
						break;
					method1993((byte) 103);
					method2028(false, (byte) -101);
					method1979(false, -82);
					method2013(false, 2103);
					method1997(0, false);
					method2039(false, 0, -2, false);
					anInt4633 = 2;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.PI(" + bool + ')');
			}
			break;
		} while (false);
	}

	final Interface4_Impl2 method2053(int i, Class164 class164, byte i_236_, byte[] is, boolean bool, int i_237_) {
		try {
			if (i_236_ != 87)
				A(16, null, 0, -16);
			return method2032(is, false, class164, 0, i_237_, bool, 0, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.PE(" + i + ',' + (class164 != null ? "{...}" : "null") + ',' + i_236_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_237_ + ')'));
		}
	}

	final aa method1772(int i, int i_238_, int[] is, int[] is_239_) {
		try {
			return Canvas_Sub1.method120(i_238_, this, i, is, 107, is_239_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.AG(" + i + ',' + i_238_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_239_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1820(Class242 class242) {
		try {
			aClass81_4634.method818((byte) -108, class242, -1, this);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.DE(" + (class242 != null ? "{...}" : "null") + ')');
		}
	}

	final int E() {
		try {
			return (this.anInt4538 - -this.anInt4541 - -this.anInt4539);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.E(" + ')');
		}
	}

	private final void method2054(boolean bool, int i, Class232 class232) {
		try {
			if (bool == false) {
				method1971(0, true, anInterface2_Impl1_4660);
				method2042(aClass256_4655, (byte) -91);
				method2037(class232, 0, (byte) 44, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.GG(" + bool + ',' + i + ',' + (class232 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1812() {
		try {
			if (aClass319_4624 != null)
				aClass319_4624.method3659(-3);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.PF(" + ')');
		}
	}

	final void P(int i, int i_240_, int i_241_, int i_242_, int i_243_) {
		try {
			method1795(i, i_240_, i, i_240_ - -i_241_, i_242_, i_243_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.P(" + i + ',' + i_240_ + ',' + i_241_ + ',' + i_242_ + ',' + i_243_ + ')'));
		}
	}

	final void method1779(int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_) {
		try {
			float f = method2050((byte) 56);
			method1946(1);
			method1984(2, i_247_);
			method2051(0, -73, Class64_Sub16.aClass65_3681);
			method1953(-95, Class64_Sub16.aClass65_3681, 0);
			method2001(i_248_, 86);
			this.aClass111_Sub3_4542.method2137((float) (-1 + i_246_), (byte) -109, (float) (i_245_ - 1), 1.0F);
			this.aClass111_Sub3_4542.method2141(-108, (float) i_244_ - f, 0.0F, -f + (float) i);
			method1935(1);
			method2059(false, false);
			method2054(false, 4, Class287_Sub1.aClass232_3420);
			method2059(true, false);
			method1953(-75, Class300.aClass65_2499, 0);
			method2051(0, -106, Class300.aClass65_2499);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.OE(" + i + ',' + i_244_ + ',' + i_245_ + ',' + i_246_ + ',' + i_247_ + ',' + i_248_ + ')'));
		}
	}

	private final void method2055(int i) {
		do {
			try {
				if (Class64_Sub4.aClass204_3649 == this.aClass204_4551) {
					float f = method2050((byte) 56);
					this.aClass111_Sub3_4542.method2141(-108, f, 0.0F, f);
				}
				if (i != 0)
					aClass111_Sub3_4547 = null;
				aBoolean4621 = false;
				method1983((byte) 121);
				if (aClass76_4598 == null)
					break;
				aClass76_4598.method741((byte) -112);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.AJ(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2056(int i, float f) {
		do {
			try {
				int i_249_ = 59 / ((i - -65) / 36);
				if (f == aFloat4561)
					break;
				aFloat4561 = f;
				method2038((byte) 118);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uv.IH(" + i + ',' + f + ')');
			}
			break;
		} while (false);
	}

	final void a(int i, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_, aa var_aa, int i_255_, int i_256_) {
		/* empty */
	}

	final void H(int i, int i_257_, int i_258_, int[] is) {
		try {
			float f = (this.aClass111_Sub3_4543.method2135((float) i_257_, (float) i_258_, (float) i, false));
			int i_259_;
			int i_260_;
			do {
				if (f < -0.0078125F || f > 0.0078125F) {
					i_259_ = (int) ((float) this.anInt4593 * (this.aClass111_Sub3_4543.method2126((float) i_258_, (float) i, (float) i_257_, 119)) / f);
					i_260_ = (int) ((float) this.anInt4589 * (this.aClass111_Sub3_4543.method2139((float) i_257_, (float) i, (float) i_258_, true)) / f);
					if (!client.aBoolean3553)
						break;
				}
				i_259_ = this.anInt4645;
				i_260_ = this.anInt4587;
			} while (false);
			is[2] = (int) f;
			is[0] = (int) ((float) i_259_ - this.aFloat4641);
			is[1] = (int) (-this.aFloat4610 + (float) i_260_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.H(" + i + ',' + i_257_ + ',' + i_258_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method2057(int i);

	abstract Object method2058(Canvas canvas, int i);

	abstract void method2059(boolean bool, boolean bool_261_);

	abstract Interface2_Impl1 method2060(boolean bool, int i);

	final Class111_Sub3 method2061(int i) {
		try {
			if (i != 1)
				aClass256_4669 = null;
			return (this.aClass111_Sub3Array4609[this.anInt4579]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.MI(" + i + ')');
		}
	}

	static final boolean method2062(int i) {
		try {
			boolean bool = true;
			if (i != -4264)
				method2062(-113);
			if (Class42_Sub2.aClass324_5359 == null) {
				if (Class332_Sub2.aClass207_5423.method2742(i ^ 0x10c4, Class277.anInt2050))
					Class42_Sub2.aClass324_5359 = Class324.method3683(Class332_Sub2.aClass207_5423, Class277.anInt2050);
				else
					bool = false;
			}
			if (Class231.aClass324_1733 == null) {
				if (!Class332_Sub2.aClass207_5423.method2742(i ^ 0x10fb, Class302.anInt2524))
					bool = false;
				else
					Class231.aClass324_1733 = Class324.method3683(Class332_Sub2.aClass207_5423, Class302.anInt2524);
			}
			if (Class64_Sub26.aClass324_3713 == null) {
				if (!Class332_Sub2.aClass207_5423.method2742(-111, Class98_Sub10_Sub38.anInt5751))
					bool = false;
				else
					Class64_Sub26.aClass324_3713 = Class324.method3683(Class332_Sub2.aClass207_5423, Class98_Sub10_Sub38.anInt5751);
			}
			if (Class121.aClass197_1004 == null) {
				if (Class36.aClass207_348.method2742(-94, Class246_Sub10.anInt5153))
					Class121.aClass197_1004 = Class119_Sub1.method2182(Class36.aClass207_348, true, Class246_Sub10.anInt5153);
				else
					bool = false;
			}
			if (Class98_Sub10_Sub7.aClass324Array5575 == null) {
				if (!Class332_Sub2.aClass207_5423.method2742(-123, Class246_Sub10.anInt5153))
					bool = false;
				else
					Class98_Sub10_Sub7.aClass324Array5575 = Class324.method3684(Class332_Sub2.aClass207_5423, Class246_Sub10.anInt5153);
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.DF(" + i + ')');
		}
	}

	abstract Interface4_Impl2 method2063(int i, byte i_262_, int[] is, boolean bool, int i_263_, int i_264_, int i_265_);

	final int r(int i, int i_266_, int i_267_, int i_268_, int i_269_, int i_270_, int i_271_) {
		try {
			int i_272_ = 0;
			float f = (((float) i_267_ * (this.aClass111_Sub3_4543.aFloat4704)) + ((float) i * (this.aClass111_Sub3_4543.aFloat4708) + ((float) i_266_ * this.aClass111_Sub3_4543.aFloat4713)) + (this.aClass111_Sub3_4543.aFloat4703));
			float f_273_ = (((float) i_268_ * (this.aClass111_Sub3_4543.aFloat4708)) + ((float) i_269_ * (this.aClass111_Sub3_4543.aFloat4713)) + ((float) i_270_ * (this.aClass111_Sub3_4543.aFloat4704)) + (this.aClass111_Sub3_4543.aFloat4703));
			if (!((float) this.anInt4640 > f) || !(f_273_ < (float) this.anInt4640)) {
				if ((float) this.anInt4605 < f && f_273_ > (float) this.anInt4605)
					i_272_ |= 0x20;
			} else
				i_272_ |= 0x10;
			int i_274_ = (int) (((this.aClass111_Sub3_4543.aFloat4705 * (float) i_267_) + (((float) i_266_ * (this.aClass111_Sub3_4543.aFloat4711)) + (float) i * this.aClass111_Sub3_4543.aFloat4712) + this.aClass111_Sub3_4543.aFloat4702) * (float) this.anInt4593 / (float) i_271_);
			int i_275_ = (int) ((float) this.anInt4593 * ((this.aClass111_Sub3_4543.aFloat4712) * (float) i_268_ + ((float) i_269_ * (this.aClass111_Sub3_4543.aFloat4711)) + ((float) i_270_ * (this.aClass111_Sub3_4543.aFloat4705)) + (this.aClass111_Sub3_4543.aFloat4702)) / (float) i_271_);
			if ((float) i_274_ < this.aFloat4641 && this.aFloat4641 > (float) i_275_)
				i_272_ |= 0x1;
			else if ((float) i_274_ > this.aFloat4647 && this.aFloat4647 < (float) i_275_)
				i_272_ |= 0x2;
			int i_276_ = (int) ((float) this.anInt4589 * ((this.aClass111_Sub3_4543.aFloat4710) * (float) i_267_ + ((this.aClass111_Sub3_4543.aFloat4714) * (float) i + (this.aClass111_Sub3_4543.aFloat4706) * (float) i_266_) + (this.aClass111_Sub3_4543.aFloat4709)) / (float) i_271_);
			int i_277_ = (int) ((float) this.anInt4589 * ((this.aClass111_Sub3_4543.aFloat4710 * (float) i_270_) + (((float) i_268_ * (this.aClass111_Sub3_4543.aFloat4714)) + ((float) i_269_ * (this.aClass111_Sub3_4543.aFloat4706))) + (this.aClass111_Sub3_4543.aFloat4709)) / (float) i_271_);
			if ((float) i_276_ < this.aFloat4610 && this.aFloat4610 > (float) i_277_)
				i_272_ |= 0x4;
			else if (this.aFloat4584 < (float) i_276_ && this.aFloat4584 < (float) i_277_)
				i_272_ |= 0x8;
			return i_272_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.r(" + i + ',' + i_266_ + ',' + i_267_ + ',' + i_268_ + ',' + i_269_ + ',' + i_270_ + ',' + i_271_ + ')'));
		}
	}

	final void method2064(byte i) {
		try {
			if (i != -61)
				anInterface2_Impl1_4652 = null;
			Hashtable hashtable = new Hashtable();
			if (aHashtable4523 != null && !aHashtable4523.isEmpty()) {
				Enumeration enumeration = aHashtable4523.keys();
				while (enumeration.hasMoreElements()) {
					Canvas canvas = (Canvas) enumeration.nextElement();
					hashtable.put(canvas, method2058(canvas, -8401));
				}
			}
			aHashtable4523 = hashtable;
			method1995(i ^ ~0x35);
			method2041(i ^ 0x52);
			method2022((byte) -107);
			aClass81_4634.method812(this, (byte) 36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.WE(" + i + ')');
		}
	}

	abstract void method2065(byte i);

	final Interface4_Impl2 method2066(Class164 class164, boolean bool, float[] fs, boolean bool_278_, int i, int i_279_) {
		try {
			if (bool_278_ != false)
				this.aFloat4591 = 1.1575497F;
			return method1968(0, i, bool, class164, -8, i_279_, 0, fs);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uv.QI(" + (class164 != null ? "{...}" : "null") + ',' + bool + ',' + (fs != null ? "{...}" : "null") + ',' + bool_278_ + ',' + i + ',' + i_279_ + ')'));
		}
	}

	Class76 method2067(int i, byte i_280_) {
		try {
			int i_281_ = -120 % ((39 - i_280_) / 56);
			int i_282_ = i;
			while_231_: do {
				while_230_: do {
					while_229_: do {
						do {
							if (i_282_ != 6) {
								if (i_282_ == 1)
									break;
								if (i_282_ == 2)
									break while_229_;
								if (i_282_ != 7)
									break while_231_;
								if (!client.aBoolean3553)
									break while_230_;
							}
							return new Class76_Sub10(this);
						} while (false);
						return new Class76_Sub4(this);
					} while (false);
					return new Class76_Sub7(this, this.aClass195_4529);
				} while (false);
				return new Class76_Sub5(this);
			} while (false);
			return new Class76_Sub11(this);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uv.CD(" + i + ',' + i_280_ + ')');
		}
	}
}
