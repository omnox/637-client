/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class18 {
	boolean aBoolean207;
	Interface2_Impl2 anInterface2_Impl2_208;
	boolean aBoolean209;
	static Class113 aClass113_210 = new Class113(9, 2);
	Interface2_Impl2 anInterface2_Impl2_211;
	static int anInt212 = 1;
	static Class11 aClass11_213;
	static int anInt214;
	public static void method246(byte i) {
		try {
			IncomingOpcode.aClass58_215 = null;
			if (i < -101) {
				aClass11_213 = null;
				aClass113_210 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bga.B(" + i + ')');
		}
	}

	static final String method247(long l, int i) {
		try {
			if (l <= 0 || l >= 6582952005840035281L)
				return null;
			if (l % 37L == 0)
				return null;
			int i_0_ = 0;
			if (i > -59)
				aClass11_213 = null;
			for (long l_1_ = l; l_1_ != 0L; l_1_ /= 37L)
				i_0_++;
			StringBuffer stringbuffer = new StringBuffer(i_0_);
			while (l != 0L) {
				long l_2_ = l;
				l /= 37L;
				char c = Exception_Sub1.aCharArray45[(int) (l_2_ + -(l * 37L))];
				if (c == 95) {
					int i_3_ = stringbuffer.length() - 1;
					stringbuffer.setCharAt(i_3_, Character.toUpperCase(stringbuffer.charAt(i_3_)));
					c = '\u00a0';
				}
				stringbuffer.append(c);
			}
			stringbuffer.reverse();
			stringbuffer.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bga.A(" + l + ',' + i + ')');
		}
	}

	Class18(boolean bool) {
		try {
			this.aBoolean209 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bga.<init>(" + bool + ')');
		}
	}

	static final void method248(boolean bool, int i, boolean bool_4_) {
		try {
			if (bool) {
				Class98_Sub10_Sub9.anInt5580--;
				if (Class98_Sub10_Sub9.anInt5580 == 0)
					Class208.anIntArray1579 = null;
			}
			if (bool_4_) {
				GameInterface.anInt3952--;
				if (GameInterface.anInt3952 == 0)
					Class221.anIntArray1665 = null;
			}
			if (i <= 33)
				method248(false, -122, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bga.C(" + bool + ',' + i + ',' + bool_4_ + ')'));
		}
	}

	final void method249(int i) {
		do {
			try {
				if (this.anInterface2_Impl2_208 != null)
					this.anInterface2_Impl2_208.method72(false);
				this.aBoolean207 = false;
				if (i == 0)
					break;
				this.anInterface2_Impl2_208 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bga.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method250(byte i) {
		try {
			if (i >= -19)
				method248(false, 117, true);
			if (!this.aBoolean207 || this.aBoolean209)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bga.D(" + i + ')');
		}
	}
}
