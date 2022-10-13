/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class RtKeyListener {
	static GameInterfaceData aClass293_593;
	static RtKeyListener key_listener;

	abstract void method773(byte i);

	abstract void method774(byte i);

	static final void method775(int i, RuneScapeCache class207, int[] is, RuneScapeCache class207_0_) {
		try {
			if (i != 3)
				method775(-54, null, null, null);
			if (is != null)
				Class2.anIntArray70 = is;
			Class64_Sub17.aClass207_3687 = class207;
			Class64_Sub16.aClass207_3683 = class207_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fa.G(" + i + ',' + (class207 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (class207_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	abstract Interface7 method776(byte i);

	public static void method777(byte i) {
		do {
			try {
				IncomingOpcode.aClass58_591 = null;
				IncomingOpcode.aClass58_592 = null;
				aClass293_593 = null;
				if (i == 72)
					break;
				method780(67, (byte) -65, 92);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fa.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method778(int i, int i_1_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_1_, i ^ ~0xd, 14);
			class98_sub46_sub17.method1621(i ^ i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fa.E(" + i + ',' + i_1_ + ')');
		}
	}

	public RtKeyListener() {
		/* empty */
	}

	abstract boolean is_key_down(int i, int i_2_);

	static final int method780(int i, byte i_3_, int i_4_) {
		try {
			if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -4)
				return Class373.anIntArray3479[i_4_ & 0x3];
			if (i_3_ != -72)
				return -111;
			return Class137.anIntArray1081[i_4_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fa.F(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}
}
