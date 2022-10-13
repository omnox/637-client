/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class196 {
	static OutgoingOpcode aClass171_1508;
	static Class304 aClass304_1509;
	int anInt1510;
	static int anInt1511 = 0;
	static RuneScapeCache aClass207_1512;

	static final int method2665(boolean bool, Class164 class164) {
		try {
			if (Class98_Sub40.aClass164_4190 == class164)
				return 6407;
			if (Class62.aClass164_486 != class164) {
				if (Class53_Sub1.aClass164_3633 != class164) {
					if (Class98_Sub30.aClass164_4088 != class164) {
						if (Class74.aClass164_547 != class164) {
							if (class164 == Class280.aClass164_2101)
								return 6145;
						} else
							return 6410;
					} else
						return 6409;
				} else
					return 6406;
			} else
				return 6408;
			if (bool != false)
				IncomingOpcode.aClass58_1507 = null;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mu.D(" + bool + ',' + (class164 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2666(int i, boolean bool, GameInterface class98_sub18, boolean bool_0_) {
		do {
			try {
				int i_1_ = class98_sub18.interfaceID;
				int i_2_ = (int) class98_sub18.uid;
				class98_sub18.remove();
				if (bool_0_)
					Class246.method2964(false, i_1_);
				Class17.method239(i ^ 0x4016, i_1_);
				GameInterfaceData class293 = Class159.method2509(i_2_, -9820);
				if (class293 != null)
					Class341.method3812(1, class293);
				Class230.method2869(106);
				if (!bool && Class15.anInt185 != -1)
					RuneScapeCache.method2764(1, Class15.anInt185, -44);
				Class61 class61 = new Class61(Class116.aClass377_964);
				for (GameInterface class98_sub18_3_ = (GameInterface) class61.method541(0); class98_sub18_3_ != null; class98_sub18_3_ = (GameInterface) class61.method539(i + -16396)) {
					if (!class98_sub18_3_.method941((byte) 78)) {
						class98_sub18_3_ = (GameInterface) class61.method541(0);
						if (class98_sub18_3_ == null)
							break;
					}
					if (class98_sub18_3_.interfaceClickThrough == 3) {
						int i_4_ = (int) class98_sub18_3_.uid;
						if (i_4_ >>> 16 == i_1_)
							method2666(16398, bool, class98_sub18_3_, true);
					}
				}
				if (i == 16398)
					break;
				method2666(-42, true, null, true);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mu.C(" + i + ',' + bool + ',' + (class98_sub18 != null ? "{...}" : "null") + ',' + bool_0_ + ')'));
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mu.toString(" + ')');
		}
	}

	public static void method2667(byte i) {
		try {
			aClass207_1512 = null;
			aClass171_1508 = null;
			aClass304_1509 = null;
			if (i == -112)
				IncomingOpcode.aClass58_1507 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mu.A(" + i + ')');
		}
	}

	static final Class123 method2668(Socket socket, byte i, int i_5_) throws IOException {
		try {
			if (i != 11)
				method2667((byte) 24);
			//System.out.println(socket);
			return new Class123_Sub1(socket, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mu.B(" + (socket != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ')'));
		}
	}

	Class196(String string, String string_6_, String string_7_, int i) {
		try {
			this.anInt1510 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mu.<init>(" + (string != null ? "{...}" : "null") + ',' + (string_6_ != null ? "{...}" : "null") + ',' + (string_7_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		aClass171_1508 = new OutgoingOpcode(81, 7);
	}
}
