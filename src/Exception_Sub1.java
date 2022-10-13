/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Exception_Sub1 extends Exception {
	static int anInt44;
	static char[] aCharArray45 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	static OutgoingOpcode aClass171_46 = new OutgoingOpcode(45, 15);
	static Class98_Sub35 aClass98_Sub35_47;

	public static void method133(byte i) {
		do {
			try {
				IncomingOpcode.aClass58_43 = null;
				aClass98_Sub35_47 = null;
				aClass171_46 = null;
				aCharArray45 = null;
				if (i <= -117)
					break;
				anInt44 = 109;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ak.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method134(byte i) {
		do {
			try {
				if (!PacketSender.aBoolean2575) {
					Class64_Sub6.aBoolean3656 = true;
					MapRegion.aFloat2545 += (-MapRegion.aFloat2545 + 12.0F) / 2.0F;
					PacketSender.aBoolean2575 = true;
					if (i == -87)
						break;
					method134((byte) -86);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ak.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public Exception_Sub1() {
		/* empty */
	}
}
