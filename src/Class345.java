/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class345 {
	static Class132 aClass132_2889;
	private ha_Sub1 aHa_Sub1_2890;
	long aLong2891;

	static final void method3824(String string, int i) {
		try {
			if (i == 2 && !string.equals("")) {
				Class39_Sub1.anInt3594++;
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i ^ 0x106, (Class98_Sub23.aClass171_3998), Class331.aClass117_2811);
				class98_sub11.packet.writeByte(r_Sub2.method1650(string, (byte) 74));
				class98_sub11.packet.method1188(string, (byte) 113);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "v.B(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method3825(int i, int i_0_, byte i_1_) {
		try {
			if (i_0_ == -2)
				return 12345678;
			if (i_1_ != -21)
				method3826(-112);
			if (i_0_ == -1) {
				if (i < 2)
					i = 2;
				else if (i > 126)
					i = 126;
				return i;
			}
			i = (0x7f & i_0_) * i >> 7;
			if (i >= 2) {
				if (i > 126)
					i = 126;
			} else
				i = 2;
			return (0xff80 & i_0_) + i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("v.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	protected final void finalize() throws Throwable {
		try {
			aHa_Sub1_2890.method1855(false, this.aLong2891);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "v.finalize(" + ')');
		}
	}

	public static void method3826(int i) {
		do {
			try {
				aClass132_2889 = null;
				if (i <= -68)
					break;
				aClass132_2889 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "v.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class345(ha_Sub1 var_ha_Sub1, long l, int i) {
		try {
			this.aLong2891 = l;
			aHa_Sub1_2890 = var_ha_Sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("v.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
		}
	}
}
