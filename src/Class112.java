/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class112 {
	static short aShort948 = 32767;
	static int anInt949;

	static final String[] method2142(String string, char c, boolean bool) {
		try {
			int i = Class73.method721(string, 72, c);
			String[] strings = new String[i + 1];
			int i_0_ = 0;
			int i_1_ = 0;
			for (int i_2_ = 0; i > i_2_; i_2_++) {
				int i_3_;
				for (i_3_ = i_1_; c != string.charAt(i_3_); i_3_++) {
					/* empty */
				}
				strings[i_0_++] = string.substring(i_1_, i_3_);
				i_1_ = 1 + i_3_;
			}
			strings[i] = string.substring(i_1_);
			if (bool != false)
				anInt949 = 105;
			return strings;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hca.A(" + (string != null ? "{...}" : "null") + ',' + c + ',' + bool + ')'));
		}
	}
}
