/* Class98_Sub46_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub6 extends Class98_Sub46 {
	Class35 aClass35_5971;
	int anInt5972;
	Class66 aClass66_5973;
	int anInt5974;
	int anInt5976;
	int anInt5977;
	int anInt5978;
	static int anInt5979;
	static int[] anIntArray5980 = new int[3];

	static final String method1546(int i, int i_0_, byte i_1_, byte[] is) {
		try {
			char[] cs = new char[i];
			int i_2_ = 0;
			if (i_1_ >= -49)
				method1548(-78, 47, 80, 103, (byte) -48, -72, 123);
			for (int i_3_ = 0; i > i_3_; i_3_++) {
				int i_4_ = is[i_0_ + i_3_] & 0xff;
				if (i_4_ != 0) {
					if (i_4_ >= 128 && i_4_ < 160) {
						int i_5_ = Class65.aCharArray497[-128 + i_4_];
						if (i_5_ == 0)
							i_5_ = 63;
						i_4_ = i_5_;
					}
					cs[i_2_++] = (char) i_4_;
				}
			}
			return new String(cs, 0, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dh.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1547(int i) {
		try {
			this.anInt5974 = (this.aClass35_5971.anInt330);
			this.anInt5978 = (this.aClass35_5971.anInt337);
			int i_6_ = 87 % ((i - -1) / 44);
			this.anInt5972 = (this.aClass35_5971.anInt331);
			if ((this.aClass35_5971.aClass111_334) != null)
				this.aClass35_5971.aClass111_334.method2099((this.aClass66_5973.anInt506), (this.aClass66_5973.anInt511), (this.aClass66_5973.anInt505), Class210.anIntArray3329);
			this.anInt5977 = Class210.anIntArray3329[2];
			this.anInt5976 = Class210.anIntArray3329[0];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dh.D(" + i + ')');
		}
	}

	static final void method1548(int i, int i_7_, int i_8_, int i_9_, byte i_10_, int i_11_, int i_12_) {
		try {
			if (i_10_ != -78)
				anIntArray5980 = null;
			Class64_Sub28.anInt3717 = i_12_;
			Class64_Sub6.anInt3655 = i_9_;
			Class287_Sub2.anInt3274 = i;
			Class356.anInt3025 = i_8_;
			Class137.anInt1079 = i_11_;
			Class98_Sub42.anInt4239 = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dh.E(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	public static void method1549(byte i) {
		try {
			anIntArray5980 = null;
			if (i == -112)
				IncomingOpcode.aClass58_5975 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dh.C(" + i + ')');
		}
	}

	static final Class197 method1550(int i, int i_13_, ha var_ha) {
		try {
			if (i_13_ != 18361)
				method1550(59, 118, null);
			Class244 class244 = Class114.method2151(i, true, var_ha, true);
			if (class244 == null)
				return null;
			return class244.aClass197_1858;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dh.B(" + i + ',' + i_13_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	Class98_Sub46_Sub6(Class35 class35, Class246_Sub5 class246_sub5) {
		try {
			this.aClass35_5971 = class35;
			this.aClass66_5973 = this.aClass35_5971.method331((byte) 93);
			method1547(-102);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dh.<init>(" + (class35 != null ? "{...}" : "null") + ',' + (class246_sub5 != null ? "{...}" : "null") + ')'));
		}
	}
}
