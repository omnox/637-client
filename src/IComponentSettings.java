/* Class98_Sub49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IComponentSettings extends Node {
	static Class100 aClass100_4283;
	int optionMask;
	int anInt4285;
	static int anInt4286 = 0;

	static final int method1662(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ != -1)
				anInt4286 = -117;
			int i_2_ = 1;
			while (i_1_ > 1) {
				if ((i_1_ & 0x1) != 0)
					i_2_ *= i;
				i_1_ >>= 1;
				i *= i;
			}
			if (i_1_ == 1)
				return i * i_2_;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("waa.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int method1663(int i) {
		try {
			if (i != 1)
				return 24;
			return (0x1df9b4 & this.optionMask) >> 18;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "waa.F(" + i + ')');
		}
	}

	final boolean canDrag(int i) {
		try {
			if (i != -1)
				canDrag(-109);
			if ((this.optionMask & 0x325ce0) >> 21 == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "waa.H(" + i + ')');
		}
	}

	public static void method1665(byte i) {
		try {
			if (i != 116)
				method1665((byte) 30);
			aClass100_4283 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "waa.C(" + i + ')');
		}
	}

	final boolean method1666(byte i, int i_3_) {
		try {
			if (i != -72)
				return false;
			if ((0x1 & this.optionMask >> 1 + i_3_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "waa.G(" + i + ',' + i_3_ + ')');
		}
	}

	final boolean method1667(byte i) {
		try {
			int i_4_ = -125 % ((i - -72) / 42);
			if ((0x1 & this.optionMask >> 22) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "waa.A(" + i + ')');
		}
	}

	final int method1668(int i) {
		try {
			if (i != -1)
				method1669(-124);
			return aa_Sub3.method157(this.optionMask, (byte) 64);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "waa.D(" + i + ')');
		}
	}

	final boolean method1669(int i) {
		try {
			if (i != 1964468)
				return false;
			if ((0x1 & this.optionMask) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "waa.E(" + i + ')');
		}
	}

	IComponentSettings(int i, int i_5_) {
		try {
			this.anInt4285 = i_5_;
			this.optionMask = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("waa.<init>(" + i + ',' + i_5_ + ')'));
		}
	}

	static {
		aClass100_4283 = new Class100(64);
	}
}
