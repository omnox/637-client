/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class228 {
	int anInt1708;
	int anInt1709;
	private int anInt1710;
	private int anInt1711;
	int anInt1712;
	int anInt1713;
	int anInt1714;
	int anInt1715;
	private int anInt1716;
	private int anInt1717;

	final void method2860(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			anInt1711 = i;
			anInt1716 = i_2_ * i_2_;
			anInt1710 = i_9_;
			anInt1717 = i_5_;
			((Class228) this).anInt1708 = i_8_ + anInt1710;
			((Class228) this).anInt1714 = anInt1711 + i_1_;
			((Class228) this).anInt1713 = i_3_ + anInt1710;
			if (i_0_ != -7409)
				anInt1717 = 79;
			((Class228) this).anInt1715 = i_7_ + anInt1717;
			((Class228) this).anInt1712 = anInt1711 - -i_4_;
			((Class228) this).anInt1709 = anInt1717 - -i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oia.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final void method2861(int i, int i_10_, int i_11_, int i_12_) {
		do {
			try {
				if (i_12_ == 18596) {
					i_10_ = i_10_ * ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4069.method641((byte) 127) >> -1412563832;
					if ((i_10_ ^ 0xffffffff) == -1 || (i_11_ ^ 0xffffffff) == 0)
						break;
					if (!Class151_Sub5.aBoolean4991 && (Class144.anInt1169 ^ 0xffffffff) != 0 && Class8.method188(false) && !Class168.method2534((byte) -128)) {
						Class151_Sub8.aClass98_Sub31_Sub2_5013 = Class83.method831(-59);
						Class98_Sub31_Sub2 class98_sub31_sub2 = (Class111_Sub1.method2115(116, Class151_Sub8.aClass98_Sub31_Sub2_5013));
						Class246_Sub3_Sub5_Sub2.method3098(class98_sub31_sub2, true, 28643);
					}
					s_Sub1.method3434(Class61.aClass207_481, false, i_10_, i_11_, 0, i_12_ ^ ~0x82e);
					Class299_Sub2.method3523(255, -1, 0);
					Class151_Sub5.aBoolean4991 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("oia.D(" + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2862(int i) {
		try {
			Class191.anInt1480 = Class76_Sub5.anInt3748 = Class181.anInt1432 = Class98_Sub10_Sub13.anInt5602 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oia.B(" + i + ')');
		}
	}

	final boolean method2863(int i, int i_14_, int i_15_, int i_16_) {
		try {
			if (((Class228) this).anInt1712 > i || (i ^ 0xffffffff) < (((Class228) this).anInt1714 ^ 0xffffffff))
				return false;
			if ((i_14_ ^ 0xffffffff) > (((Class228) this).anInt1713 ^ 0xffffffff) || (i_14_ ^ 0xffffffff) < (((Class228) this).anInt1708 ^ 0xffffffff))
				return false;
			if (((Class228) this).anInt1715 > i_15_ || (i_15_ ^ 0xffffffff) < (((Class228) this).anInt1709 ^ 0xffffffff))
				return false;
			if (i_16_ != 0)
				method2860(69, -4, -88, -91, -62, 109, -98, 2, -57, 18, -119);
			int i_17_ = i - anInt1711;
			int i_18_ = -anInt1717 + i_15_;
			if ((i_17_ * i_17_ - -(i_18_ * i_18_) ^ 0xffffffff) <= (anInt1716 ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oia.E(" + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	static final boolean method2864(int i, int i_19_, int i_20_) {
		try {
			if (!Class87.method854(i_20_, i + 28678, i_19_))
				return false;
			if (Class98_Sub5_Sub2.method969(i_20_, i_19_, 123) | (i_19_ & 0xb000) != 0 | Class64_Sub10.method594(i_19_, 6, i_20_))
				return true;
			if (i != 55)
				return true;
			return ((i_20_ & 0x37) == 0 & (Class151_Sub2.method2451(i_19_, 544, i_20_) | Class246_Sub1.method2967(i_20_, i_19_, (byte) 91)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oia.A(" + i + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	Class228(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		try {
			anInt1711 = i;
			anInt1717 = i_22_;
			anInt1716 = i_23_ * i_23_;
			anInt1710 = i_21_;
			((Class228) this).anInt1713 = anInt1710 - -i_26_;
			((Class228) this).anInt1715 = i_28_ + anInt1717;
			((Class228) this).anInt1709 = anInt1717 - -i_29_;
			((Class228) this).anInt1714 = anInt1711 - -i_25_;
			((Class228) this).anInt1708 = i_27_ + anInt1710;
			((Class228) this).anInt1712 = i_24_ + anInt1711;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oia.<init>(" + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ')'));
		}
	}
}
