/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class142 {
	static Class377 aClass377_1157 = new Class377(32);
	static Class79 aClass79_1158 = new Class79(64);
	static Class105 aClass105_1159;
	static int anInt1160 = 0;

	public static void method2306(int i) {
		do {
			try {
				aClass79_1158 = null;
				aClass105_1159 = null;
				aClass377_1157 = null;
				if (i == -1)
					break;
				anInt1160 = 44;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jp.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method2307(int i, int i_0_, int i_1_) {
		try {
			double d = Math.log((double) i_0_) / Math.log(2.0);
			double d_2_ = Math.log((double) i) / Math.log(2.0);
			int i_3_ = 107 % ((i_1_ - -33) / 52);
			double d_4_ = d_2_ + Math.random() * (-d_2_ + d);
			return (int) (0.5 + Math.pow(2.0, d_4_));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jp.D(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	abstract long method2308(byte i);

	static final void method2309(int i, String string) {
		try {
			Class89.aString716 = string;
			if (Class76_Sub11.anApplet3799 != null) {
				try {
					String string_5_ = Class76_Sub11.anApplet3799.getParameter("cookieprefix");
					String string_6_ = Class76_Sub11.anApplet3799.getParameter("cookiehost");
					String string_7_ = (string_5_ + "settings=" + string + "; version=1; path=/; domain=" + string_6_);
					if (i != 19208)
						aClass105_1159 = null;
					do {
						if ((string.length() ^ 0xffffffff) == -1) {
							string_7_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
							if (!client.aBoolean3553)
								break;
						}
						string_7_ += ("; Expires=" + (Class98_Sub40.method1471(5090, (94608000000L + Class343.method3819(i + -19255)))) + "; Max-Age=" + 94608000L);
					} while (false);
					Class203.method2706(Class76_Sub11.anApplet3799, ("document.cookie=\"" + string_7_ + "\""), 9202);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jp.E(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public Class142() {
		/* empty */
	}

	static final void method2310(byte i) {
		try {
			Class232.aClass79_1740.method794(18);
			int i_8_ = 80 % ((i - 38) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jp.B(" + i + ')');
		}
	}

	static {
		aClass105_1159 = new Class105("", 10);
	}
}
