/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class249 {
	static long aLong1898;
	int anInt1899;
	int anInt1900;
	short aShort1901;
	short aShort1902;
	static Class128 aClass128_1903 = new Class128();
	boolean aBoolean1904;
	int anInt1905;
	byte aByte1906;
	int anInt1907;
	short aShort1908;
	int anInt1909;

	static final String method3160(String string, int i) {
		try {
			int i_0_ = string.length();
			int i_1_ = 0;
			for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
				int i_3_ = string.charAt(i_2_);
				if (i_3_ == 60 || i_3_ == 62)
					i_1_ += 3;
			}
			StringBuffer stringbuffer = new StringBuffer(i_1_ + i_0_);
			for (int i_4_ = 0; i_0_ > i_4_; i_4_++) {
				char c = string.charAt(i_4_);
				if (c != 60) {
					if (c != 62)
						stringbuffer.append(c);
					else
						stringbuffer.append("<gt>");
				} else
					stringbuffer.append("<lt>");
			}
			if (i != 62)
				method3162();
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pk.C(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final int method3161(int i, int i_5_, boolean bool, int i_6_) {
		try {
			Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i, bool, 6);
			if (class98_sub3 == null)
				return 0;
			if (i_6_ == -1)
				return 0;
			int i_7_ = 0;
			int i_8_ = -61 % ((-78 - i_5_) / 35);
			for (int i_9_ = 0; (class98_sub3.anIntArray3823.length > i_9_); i_9_++) {
				if (class98_sub3.anIntArray3824[i_9_] == i_6_)
					i_7_ += class98_sub3.anIntArray3823[i_9_];
			}
			return i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pk.D(" + i + ',' + i_5_ + ',' + bool + ',' + i_6_ + ')'));
		}
	}

	static final void method3162() {
		for (int i = 0; i < Class98_Sub46_Sub5.aClass174Array5970.length; i++)
			Class98_Sub46_Sub5.aClass174Array5970[i].method2565();
		Class98_Sub46_Sub5.aClass174Array5970 = null;
	}

	public static void method3163(byte i) {
		try {
			if (i <= 34)
				method3161(-115, -43, false, -122);
			aClass128_1903 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pk.E(" + i + ')');
		}
	}

	static final void method3164(int i, int i_10_, ha var_ha, int i_11_, int i_12_, int i_13_, int i_14_) {
		do {
			try {
				if (i_13_ != -22275)
					aClass128_1903 = null;
				if ((Class98_Sub47.aClass332_4273 == null || Class98_Sub10_Sub28.aClass332_5704 == null || Class45.aClass332_383 == null) && Class332_Sub2.aClass207_5423.method2742(-69, Class25.anInt267) && Class332_Sub2.aClass207_5423.method2742(i_13_ + 22240, Class95.anInt799) && Class332_Sub2.aClass207_5423.method2742(-39, AbstractModel.anInt1183)) {
					Class324 class324 = Class324.method3685(Class332_Sub2.aClass207_5423, Class95.anInt799, 0);
					Class98_Sub10_Sub28.aClass332_5704 = var_ha.method1758(class324, true);
					class324.method3691();
					Class221.aClass332_1666 = var_ha.method1758(class324, true);
					Class98_Sub47.aClass332_4273 = (var_ha.method1758(Class324.method3685(Class332_Sub2.aClass207_5423, Class25.anInt267, 0), true));
					Class324 class324_15_ = Class324.method3685(Class332_Sub2.aClass207_5423, AbstractModel.anInt1183, 0);
					Class45.aClass332_383 = var_ha.method1758(class324_15_, true);
					class324_15_.method3691();
					Class98_Sub50.aClass332_4287 = var_ha.method1758(class324_15_, true);
				}
				if (Class98_Sub47.aClass332_4273 == null || Class98_Sub10_Sub28.aClass332_5704 == null || Class45.aClass332_383 == null)
					break;
				int i_16_ = ((i + -(2 * Class45.aClass332_383.method3734())) / Class98_Sub47.aClass332_4273.method3734());
				for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
					Class98_Sub47.aClass332_4273.method3735((i_12_ + Class45.aClass332_383.method3734() + Class98_Sub47.aClass332_4273.method3734() * i_17_), (-Class98_Sub47.aClass332_4273.method3731() + (i_11_ + i_14_)));
				int i_18_ = ((-i_10_ + i_14_ - Class45.aClass332_383.method3731()) / Class98_Sub10_Sub28.aClass332_5704.method3731());
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					Class98_Sub10_Sub28.aClass332_5704.method3735(i_12_, i_10_ + i_11_ + Class98_Sub10_Sub28.aClass332_5704.method3731() * i_19_);
					Class221.aClass332_1666.method3735(-Class221.aClass332_1666.method3734() + (i + i_12_), i_19_ * Class98_Sub10_Sub28.aClass332_5704.method3731() + i_10_ + i_11_);
				}
				Class45.aClass332_383.method3735(i_12_, (-Class45.aClass332_383.method3731() + (i_11_ - -i_14_)));
				Class98_Sub50.aClass332_4287.method3735(i + i_12_ - Class45.aClass332_383.method3734(), i_11_ - (-i_14_ + Class45.aClass332_383.method3731()));
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pk.B(" + i + ',' + i_10_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}

	Class249(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, boolean bool, boolean bool_28_, int i_29_) {
		try {
			this.anInt1899 = i_29_;
			this.anInt1909 = i_20_;
			this.aBoolean1904 = bool_28_;
			this.anInt1905 = i;
			this.anInt1907 = i_22_;
			this.anInt1900 = i_21_;
			this.aShort1908 = (short) i_23_;
			this.aShort1901 = (short) i_24_;
			this.aShort1902 = (short) i_25_;
			this.aByte1906 = (byte) i_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pk.<init>(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + bool + ',' + bool_28_ + ',' + i_29_ + ')'));
		}
	}
}
