/* Class246_Sub3_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Rectangle;

final class Class246_Sub3_Sub4_Sub3 extends Class246_Sub3_Sub4 {
	private int anInt6444;
	int anInt6445;
	static OutgoingOpcode aClass171_6446;
	private int anInt6447 = 0;
	private Class246_Sub5 aClass246_Sub5_6448;
	private boolean aBoolean6449 = true;
	boolean aBoolean6450;
	static int[] anIntArray6451 = new int[1000];
	private int anInt6452;
	private int anInt6453;
	private int anInt6454;
	private int anInt6455;
	private int anInt6456;
	private Class97 aClass97_6458;

	Class246_Sub3_Sub4_Sub3(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, false, (byte) 0);
		anInt6444 = 0;
		anInt6454 = -1;
		anInt6456 = 0;
		this.aBoolean6450 = false;
		anInt6452 = 0;
		anInt6453 = 0;
		do {
			try {
				anInt6453 = i_11_;
				this.anInt6445 = i_1_ - -i_0_;
				anInt6455 = i;
				Class107 class107 = Class196.aClass304_1509.method3564(2, anInt6455);
				int i_12_ = class107.anInt910;
				do {
					if (i_12_ != -1) {
						aClass97_6458 = Class151_Sub7.aClass183_5001.method2623(i_12_, 16383);
						this.aBoolean6450 = false;
						if (!client.aBoolean3553)
							break;
					}
					this.aBoolean6450 = true;
				} while (false);
				if (this.anInt6445 != i_1_)
					break;
				Class349.method3840((byte) -127, this, anInt6456, aClass97_6458);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("or.<init>(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2982(byte i) {
		try {
			if (i >= -70)
				anInt6453 = -72;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.HA(" + i + ')');
		}
	}

	final void method3067(int i) {
		try {
			if (aClass246_Sub5_6448 != null)
				aClass246_Sub5_6448.method3114();
			if (i <= 71)
				method2981(null, (byte) -50, false, 126, null, 99, 56);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.B(" + i + ')');
		}
	}

	private final void method3068(AbstractModel class146, ha var_ha, int i, Class111 class111) {
		do {
			try {
				class146.method2343(class111);
				Class87[] class87s = class146.method2320();
				Class35[] class35s = class146.method2322();
				if ((aClass246_Sub5_6448 == null || aClass246_Sub5_6448.aBoolean5099) && (class87s != null || class35s != null))
					aClass246_Sub5_6448 = Class246_Sub5.method3117(Class215.anInt1614, true);
				if (i != -17770)
					method2975(null, 84);
				if (aClass246_Sub5_6448 == null)
					break;
				aClass246_Sub5_6448.method3120(var_ha, Class215.anInt1614, class87s, class35s, false);
				aClass246_Sub5_6448.method3123(this.height_level, this.aShort6158, this.aShort6160, this.aShort6157, this.aShort6159);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("or.E(" + (class146 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + (class111 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final AbstractModel method3069(ha var_ha, int i, int i_13_, int i_14_) {
		try {
			Class107 class107 = Class196.aClass304_1509.method3564(2, i_14_);
			s var_s = (Class98_Sub46_Sub2_Sub2.aSArray6298[this.height_level]);
			s var_s_15_ = (this.aByte5081 < 3 ? (Class98_Sub46_Sub2_Sub2.aSArray6298[this.aByte5081 + 1]) : null);
			if (i_13_ != -18981)
				method3067(92);
			if (this.aBoolean6450)
				return class107.method1722(var_ha, Class151_Sub7.aClass183_5001, -1, i, this.localXPos, true, var_s_15_, this.anInt5089, 0, var_s, this.localYPos, -1, (byte) 2);
			return class107.method1722(var_ha, Class151_Sub7.aClass183_5001, anInt6456, i, this.localXPos, true, var_s_15_, this.anInt5089, anInt6452, var_s, this.localYPos, anInt6454, (byte) 2);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("or.C(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_16_, ha var_ha, int i_17_, int i_18_) {
		try {
			int i_19_ = -72 % ((i - 15) / 55);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("or.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_16_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	protected final void finalize() {
		do {
			try {
				if (aClass246_Sub5_6448 == null)
					break;
				aClass246_Sub5_6448.method3114();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "or.finalize(" + ')');
			}
			break;
		} while (false);
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				return -58;
			return anInt6444;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.J(" + i + ')');
		}
	}

	static final void method3070(int i) {
		try {
			if (i > -2)
				aClass171_6446 = null;
			Class98_Sub17 class98_sub17 = (Class98_Sub17) Class167.aClass148_1284.method2418(32);
			boolean bool = (Class255.draggedComponent != null || Class156_Sub2.anInt3423 > 0);
			int i_20_ = class98_sub17.method1155(-115);
			int i_21_ = class98_sub17.method1151(112);
			if (bool)
				Class21_Sub4.anInt5396 = 1;
			if (bool)
				Class347.aClass98_Sub46_Sub8_2908 = Class266.aClass98_Sub46_Sub8_1994;
			else
				PacketSender.method3604(i_21_, (byte) 78, i_20_, Class266.aClass98_Sub46_Sub8_1994);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.D(" + i + ')');
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			AbstractModel class146 = method3069(var_ha, 0x800 | (anInt6453 != 0 ? 5 : 0), -18981, anInt6455);
			if (class146 == null)
				return null;
			if (anInt6453 != 0)
				class146.a(2048 * anInt6453);
			if (i > -12)
				anInt6452 = -121;
			Class111 class111 = var_ha.method1793();
			class111.method2100(this.localXPos, this.anInt5089, this.localYPos);
			method3068(class146, var_ha, -17770, class111);
			Class246_Sub1 class246_sub1 = Class94.method915(1, (byte) -47, false);
			if (Class239.aBoolean1839)
				class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[0]), Class16.anInt197, 0);
			else
				class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[0]), 0);
			if (aClass246_Sub5_6448 != null) {
				Class242 class242 = aClass246_Sub5_6448.method3116();
				if (!Class239.aBoolean1839)
					var_ha.method1820(class242);
				else
					var_ha.method1785(class242, Class16.anInt197);
			}
			aBoolean6449 = class146.F();
			anInt6444 = class146.fa();
			anInt6447 = class146.ma();
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("or.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3071(int i, int i_22_, int i_23_, int i_24_, int i_25_) {
		try {
			if (i_22_ == -1) {
				for (int i_26_ = 0; (i_26_ < Class69_Sub2.anInt5335); i_26_++) {
					Rectangle rectangle = Class98_Sub35.aRectangleArray4144[i_26_];
					if (i_24_ < rectangle.width + rectangle.x && i_23_ + i_24_ > rectangle.x && (rectangle.y - -rectangle.height > i_25_) && i + i_25_ > rectangle.y)
						aa_Sub3.aBooleanArray3574[i_26_] = true;
				}
				Class93_Sub1_Sub1.method908(i + i_25_, i_25_, false, i_24_, i_23_ + i_24_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("or.A(" + i + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				anInt6447 = 45;
			return anInt6447;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.O(" + bool + ')');
		}
	}

	final boolean method2976(int i, ha var_ha, byte i_27_, int i_28_) {
		try {
			if (i_27_ < 59)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("or.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_27_ + ',' + i_28_ + ')'));
		}
	}

	public static void method3072(int i) {
		do {
			try {
				aClass171_6446 = null;
				anIntArray6451 = null;
				IncomingOpcode.aClass58_6457 = null;
				if (i == 0)
					break;
				IncomingOpcode.aClass58_6457 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "or.K(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3073(byte i, int i_29_) {
		do {
			try {
				if (!this.aBoolean6450) {
					anInt6452 += i_29_;
					while ((aClass97_6458.anIntArray811[anInt6456]) < anInt6452) {
						anInt6452 -= (aClass97_6458.anIntArray811[anInt6456]);
						anInt6456++;
						if (anInt6456 >= (aClass97_6458.anIntArray818).length) {
							this.aBoolean6450 = true;
							break;
						}
					}
					if (this.aBoolean6450)
						break;
					Class349.method3840((byte) -126, this, anInt6456, aClass97_6458);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "or.G(" + i + ',' + i_29_ + ')');
			}
			break;
		} while (false);
	}

	final void method2988(ha var_ha, int i) {
		do {
			try {
				AbstractModel class146 = method3069(var_ha, 0, -18981, anInt6455);
				if (class146 == null)
					break;
				Class111 class111 = var_ha.method1793();
				class111.method2100(this.localXPos, this.anInt5089, this.localYPos);
				method3068(class146, var_ha, -17770, class111);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("or.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2978(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.H(" + i + ')');
		}
	}

	final void method2992(byte i) {
		try {
			if (i == -73)
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.DA(" + i + ')');
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				anIntArray6451 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("or.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2987(int i) {
		try {
			return aBoolean6449;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "or.I(" + i + ')');
		}
	}

	static {
		aClass171_6446 = new OutgoingOpcode(2, -1);
	}
}
