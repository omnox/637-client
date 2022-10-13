/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class111 {
	static byte aByte947;

	static final boolean method2089(byte i, char c) {
		try {
			if (c > 0 && c < 128 || c >= 160 && c <= 255)
				return true;
			if (c != 0) {
				char[] cs = Class65.aCharArray497;
				for (int i_0_ = 0; i_0_ < cs.length; i_0_++) {
					int i_1_ = cs[i_0_];
					if (c == i_1_)
						return true;
				}
			}
			if (i <= 47)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hba.CB(" + i + ',' + c + ')');
		}
	}

	abstract void method2090(int i);

	abstract void method2091();

	abstract void method2092(Class111 class111_2_);

	abstract void method2093(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_);

	static final int method2094(String string, int i) {
		try {
			if (i >= -95)
				aByte947 = (byte) -46;
			if (string == null)
				return -1;
			for (int i_8_ = 0; i_8_ < Class314.anInt2692; i_8_++) {
				if (string.equalsIgnoreCase(Class98_Sub25.aStringArray4026[i_8_]))
					return i_8_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hba.BB(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method2095(int i, int i_9_, byte i_10_) {
		try {
			if (i_10_ > -84)
				method2095(67, 68, (byte) 112);
			if ((i_9_ & 0x20) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hba.DB(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	abstract void method2096(int i, int i_11_, int i_12_, int[] is);

	abstract void method2097(int i);

	static final void method2098(AnimableEntity class246_sub3) {
		Class98_Sub10_Sub30.aHa5709.H(class246_sub3.localXPos, (class246_sub3.anInt5089 + (class246_sub3.method2990(0) >> 1)), class246_sub3.localYPos, Class226.anIntArray1699);
		class246_sub3.anInt5085 = Class226.anIntArray1699[0];
		class246_sub3.anInt5080 = Class226.anIntArray1699[1];
		class246_sub3.anInt5083 = Class226.anIntArray1699[2];
	}

	abstract void method2099(int i, int i_13_, int i_14_, int[] is);

	public Class111() {
		/* empty */
	}

	abstract void method2100(int i, int i_15_, int i_16_);

	abstract void method2101(int i);

	abstract Class111 method2102();

	abstract void method2103(int i, int i_17_, int i_18_, int[] is);

	abstract void method2104(int i);

	abstract void method2105(int i);

	abstract void method2106(int i, int i_19_, int i_20_);

	abstract void method2107(int i);

	abstract void method2108(int[] is);
}
