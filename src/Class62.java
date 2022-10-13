/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62 {
	int anInt483;
	int anInt484;
	long aLong485;
	static Class164 aClass164_486 = new Class164(4);
	static Class264 aClass264_487;
	String aString488;
	String aString489;
	static int anInt490 = 0;

	public static void method543(int i) {
		do {
			try {
				aClass164_486 = null;
				aClass264_487 = null;
				if (i == 0)
					break;
				aClass264_487 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "eca.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method544(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		do {
			try {
				if (Class85.getInterfaceData(i_1_, 48)) {
					do {
						if (Class64_Sub13.aClass293ArrayArray3674[i_1_] == null) {
							client.method104((Class159.gameInterfaces[i_1_]), -1, i_10_, i_0_, i_2_, i_4_, i_5_, i_9_, i_6_, i_7_, i, i_8_);
							if (!client.aBoolean3553)
								break;
						}
						client.method104((Class64_Sub13.aClass293ArrayArray3674[i_1_]), -1, i_10_, i_0_, i_2_, i_4_, i_5_, i_9_, i_6_, i_7_, i, i_8_);
					} while (false);
					if (i_3_ == 0)
						break;
					method543(-60);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eca.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}

	Class62(int i, String string, int i_11_, String string_12_, long l) {
		try {
			((Class62) this).aString488 = string_12_;
			((Class62) this).aString489 = string;
			((Class62) this).anInt484 = i;
			((Class62) this).aLong485 = l;
			((Class62) this).anInt483 = i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eca.<init>(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_11_ + ',' + (string_12_ != null ? "{...}" : "null") + ',' + l + ')'));
		}
	}
}
