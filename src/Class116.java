/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116 {
	static Class377 aClass377_964 = new Class377(8);
	static Class98_Sub31_Sub2 aClass98_Sub31_Sub2_965;
	static String[] aStringArray966;
	static int anInt967;

	static final void method2159(byte i, ha var_ha) {
		try {
			do {
				if (!Class98_Sub5_Sub3.aBoolean5539) {
					Class98_Sub46_Sub9.method1561(var_ha, -256);
					if (!client.aBoolean3553)
						break;
				}
				Class163.method2519(6, var_ha);
			} while (false);
			if (i <= 31)
				anInt967 = -116;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hha.B(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2160(int i) {
		try {
			aClass377_964 = null;
			if (i != -25882)
				method2160(-43);
			aClass98_Sub31_Sub2_965 = null;
			aStringArray966 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hha.A(" + i + ')');
		}
	}

	static final void setVarc(int varcValue, int varcIndex, byte i_1_) {
		try {
			if (i_1_ == -120) {
				Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(varcIndex, -124, 1);
				class98_sub46_sub17.method1626((byte) -103);
				class98_sub46_sub17.anInt6054 = varcValue;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hha.D(" + varcValue + ',' + varcIndex + ',' + i_1_ + ')'));
		}
	}

	static final boolean method2162(boolean bool) {
		try {
			try {
				if (bool != false)
					return true;
				Class263 class263 = new Class263();
				byte[] is = class263.method3220((byte) 126, Class74.aByteArray546);
				Class271.method3277(is, 1);
				return true;
			} catch (Exception exception) {
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hha.C(" + bool + ')');
		}
	}
}
