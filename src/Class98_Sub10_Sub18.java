/* Class98_Sub10_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub18 extends Class98_Sub10 {
	static int anInt5626;
	static long aLong5627 = 0L;

	static final boolean method1054(int i) {
		try {
			if (Class76_Sub7.aBoolean3761) {
				try {
					if (((Boolean) Class203.method2704("showingVideoAd", Class76_Sub11.anApplet3799, -26978)).booleanValue())
						return false;
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			if (i <= 67)
				anInt5626 = 88;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ll.D(" + i + ')');
		}
	}

	static final boolean method1055(int i, int i_0_, byte i_1_) {
		try {
			if (i_1_ != -11)
				aLong5627 = -40L;
			if (!(Class373_Sub2.method3974(i_0_, i, i_1_ + -101) | (0x70000 & i ^ 0xffffffff) != -1) && !Class76_Sub7.method763(i, i_0_, false))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ll.E(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1056(byte i, int i_2_) {
		try {
			if (i == 97) {
				Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_2_, i ^ ~0x59, 7);
				class98_sub46_sub17.method1621(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ll.B(" + i + ',' + i_2_ + ')');
		}
	}

	final int[] method990(int i, int i_3_) {
		try {
			if (i != 255)
				aLong5627 = -124L;
			return Class64_Sub1.anIntArray3640;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ll.G(" + i + ',' + i_3_ + ')');
		}
	}

	public Class98_Sub10_Sub18() {
		super(0, true);
	}
}
