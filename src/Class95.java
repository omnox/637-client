
/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class95 {
	static boolean aBoolean798 = false;
	static int anInt799;
	static int[] anIntArray800 = new int[13];

	static final void method920(byte i) throws IOException {
		do {
			try {
				if (i < 77)
					method921(true);
				if (aa_Sub1.aClass123_3561 == null || Class62.anInt490 <= 0)
					break;
				Class160.aClass98_Sub22_1257.position = 0;
				for (;;) {
					OutgoingPacket class98_sub11 = ((OutgoingPacket) Class336.aClass148_2827.method2418(32));
					if (class98_sub11 == null || (((Class160.aClass98_Sub22_1257.data).length + -(Class160.aClass98_Sub22_1257.position)) < class98_sub11.anInt3869))
						break;
					Class160.aClass98_Sub22_1257.method1217((class98_sub11.packet.data), class98_sub11.anInt3869, -1, 0);
					Class62.anInt490 -= class98_sub11.anInt3869;
					class98_sub11.remove();
					class98_sub11.packet.method1201(0);
					class98_sub11.method1125((byte) 6);
				}
				aa_Sub1.aClass123_3561.method2202(-24305, Class160.aClass98_Sub22_1257.position, (Class160.aClass98_Sub22_1257.data), 0);
				Class98_Sub50.anInt4289 += (Class160.aClass98_Sub22_1257.position);
				Class196.anInt1511 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ft.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method921(boolean bool) {
		try {
			if (bool != false)
				anInt799 = 59;
			anIntArray800 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ft.A(" + bool + ')');
		}
	}
}
