/* Class246_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3_Sub3 extends AnimableEntity {
	static Class254 aClass254_6152 = new Class254(8);
	short aShort6153;
	static Class206 aClass206_6154 = Class64_Sub20.method636((byte) 5);
	static Class143 aClass143_6155;
	static String aString6156 = null;

	final int method2980(int i, Class98_Sub5[] class98_sub5s) {
		try {
			int i_0_ = ((AnimableEntity) this).localXPos >> Class151_Sub8.anInt5015;
			int i_1_ = ((AnimableEntity) this).localYPos >> Class151_Sub8.anInt5015;
			int i_2_ = 0;
			if (i_0_ != Class241.anInt1845) {
				if (Class241.anInt1845 < i_0_)
					i_2_ += 2;
			} else
				i_2_++;
			if ((Class64_Sub26.anInt3714 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
				if ((i_1_ ^ 0xffffffff) > (Class64_Sub26.anInt3714 ^ 0xffffffff))
					i_2_ += 6;
			} else
				i_2_ += 3;
			int i_3_ = Class241.anIntArray1846[i_2_];
			if ((((Class246_Sub3_Sub3) this).aShort6153 & i_3_ ^ 0xffffffff) != -1)
				return this.method2989(i_0_, false, class98_sub5s, i_1_);
			if ((((Class246_Sub3_Sub3) this).aShort6153 ^ 0xffffffff) == -2 && i_0_ > 0)
				return this.method2989(-1 + i_0_, false, class98_sub5s, i_1_);
			if ((((Class246_Sub3_Sub3) this).aShort6153 ^ 0xffffffff) == -5 && i_0_ <= Class366.anInt3112)
				return this.method2989(1 + i_0_, false, class98_sub5s, i_1_);
			if (((Class246_Sub3_Sub3) this).aShort6153 == 8 && i_1_ > 0)
				return this.method2989(i_0_, false, class98_sub5s, -1 + i_1_);
			if (((Class246_Sub3_Sub3) this).aShort6153 == 2 && (Class64_Sub9.anInt3662 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
				return this.method2989(i_0_, false, class98_sub5s, 1 + i_1_);
			if (((Class246_Sub3_Sub3) this).aShort6153 == 16 && i_0_ > 0 && (i_1_ ^ 0xffffffff) >= (Class64_Sub9.anInt3662 ^ 0xffffffff))
				return this.method2989(-1 + i_0_, false, class98_sub5s, 1 + i_1_);
			if ((((Class246_Sub3_Sub3) this).aShort6153 ^ 0xffffffff) == -33 && (Class366.anInt3112 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff) && Class64_Sub9.anInt3662 >= i_1_)
				return this.method2989(i_0_ + 1, false, class98_sub5s, 1 + i_1_);
			if (((Class246_Sub3_Sub3) this).aShort6153 == 128 && (i_0_ ^ 0xffffffff) < -1 && (i_1_ ^ 0xffffffff) < -1)
				return this.method2989(i_0_ + -1, false, class98_sub5s, i_1_ - 1);
			int i_4_ = 124 % ((i - 29) / 62);
			if ((((Class246_Sub3_Sub3) this).aShort6153 ^ 0xffffffff) == -65 && i_0_ <= Class366.anInt3112 && (i_1_ ^ 0xffffffff) < -1)
				return this.method2989(i_0_ + 1, false, class98_sub5s, i_1_ - 1);
			throw new RuntimeException("");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jn.GA(" + i + ',' + (class98_sub5s != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2991(boolean bool) {
		try {
			if (bool != false)
				aString6156 = null;
			return (Class74.aBooleanArrayArray551[((((AnimableEntity) this).localXPos >> Class151_Sub8.anInt5015) + (-Class241.anInt1845 - -Class259.anInt1959))][(-Class64_Sub26.anInt3714 + ((((AnimableEntity) this).localYPos >> Class151_Sub8.anInt5015) + Class259.anInt1959))]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.FA(" + bool + ')');
		}
	}

	static final boolean method3011(int i, int i_5_) {
		try {
			if (i != -6410)
				return false;
			if ((i_5_ ^ 0xffffffff) != -8 && i_5_ != 8 && i_5_ != 9)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.L(" + i + ',' + i_5_ + ')');
		}
	}

	static final void method3012(Mobile class246_sub3_sub4_sub2, byte i) {
		do {
			try {
				if (i >= -105)
					method3012(null, (byte) 25);
				if (!(class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub1)) {
					if (class246_sub3_sub4_sub2 instanceof Player) {
						Player class246_sub3_sub4_sub2_sub2 = ((Player) class246_sub3_sub4_sub2);
						Class98_Sub30.method1311((((((AnimableEntity) class246_sub3_sub4_sub2_sub2).height_level) ^ 0xffffffff) != ((((AnimableEntity) Player.selfPlayer).height_level) ^ 0xffffffff)), true, class246_sub3_sub4_sub2_sub2);
					}
				} else {
					Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2);
					if (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504 == null)
						break;
					Class98_Sub10.method995(class246_sub3_sub4_sub2_sub1, (byte) 55, ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).height_level) != (((AnimableEntity) Player.selfPlayer).height_level)));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jn.D(" + ((class246_sub3_sub4_sub2 != null) ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method3013(byte i) {
		try {
			if (i != -93)
				aClass143_6155 = null;
			aClass206_6154 = null;
			aString6156 = null;
			aClass254_6152 = null;
			aClass143_6155 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.F(" + i + ')');
		}
	}

	final boolean method2977(ha var_ha, byte i) {
		try {
			if (i != 77)
				return false;
			return Class100.method1688(((AnimableEntity) this).aByte5081, (((AnimableEntity) this).localXPos >> Class151_Sub8.anInt5015), (((AnimableEntity) this).localYPos >> Class151_Sub8.anInt5015), this, (byte) 112);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jn.AA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final int method3014(int i, int i_6_) {
		try {
			if (i != 1)
				method3013((byte) -80);
			if (i_6_ != 6406) {
				if ((i_6_ ^ 0xffffffff) != -6410) {
					if (i_6_ != 32841) {
						if (i_6_ != 6410) {
							if (i_6_ == 6407)
								return 3;
							if ((i_6_ ^ 0xffffffff) == -6409)
								return 4;
						} else
							return 2;
					} else
						return 1;
				} else
					return 1;
			} else
				return 1;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.K(" + i + ',' + i_6_ + ')');
		}
	}

	static final void method3015(int i, int i_7_, byte i_8_, Class28 class28) {
		do {
			try {
				Class76.aClass28ArrayArray586[i_7_][i] = class28;
				if (i_8_ > 20)
					break;
				method3013((byte) -29);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jn.M(" + i + ',' + i_7_ + ',' + i_8_ + ',' + (class28 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class246_Sub3_Sub3(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		try {
			((Class246_Sub3_Sub3) this).aShort6153 = (short) i_13_;
			((AnimableEntity) this).localXPos = i;
			((AnimableEntity) this).height_level = (byte) i_11_;
			((AnimableEntity) this).aByte5081 = (byte) i_12_;
			((AnimableEntity) this).anInt5089 = i_9_;
			((AnimableEntity) this).localYPos = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jn.<init>(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}
}
