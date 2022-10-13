/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class329 {
	int anInt2760;
	static int anInt2761;
	int anInt2762;
	int anInt2763;
	int anInt2764;
	static int anInt2765 = 0;
	int anInt2766;
	int anInt2767;
	int anInt2768 = 128;
	int anInt2769;
	int anInt2770;
	static int[] anIntArray2771;
	int anInt2772;
	int anInt2773;

	static final void method3708(int i) {
		try {
			if (Class53_Sub1.method499(i ^ ~0x800, Class177.anInt1376) || Class246_Sub3_Sub3.method3011(-6410, Class177.anInt1376))
				Class185.method2630(Class134.renderZ >> -802670004, -108, (Class98_Sub46_Sub10.renderX >> 1156493548), 5000);
			else {
				int i_0_ = ((((Mobile) Player.selfPlayer).walkQueueX[0]) >> -1272391965);
				int i_1_ = ((((Mobile) Player.selfPlayer).walkQueueZ[0]) >> -1164602557);
				if ((i_0_ ^ 0xffffffff) > -1 || GameWorld.size_x >> -310895453 <= i_0_ || (i_1_ ^ 0xffffffff) > -1 || ((i_1_ ^ 0xffffffff) <= (GameWorld.size_y >> 1384895075 ^ 0xffffffff)))
					Class185.method2630((GameWorld.size_y >> -980626748), i + -118, GameWorld.size_x >> -3353948, 0);
				else
					Class185.method2630(i_1_, i + -111, i_0_, 5000);
			}
			RuntimeException_Sub1.method4011(i + -113);
			if (i != -1)
				anInt2765 = 71;
			Class230.method2870((byte) -74);
			PlayerUpdate.method2855(-19004);
			Class96.method928((byte) -42);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.A(" + i + ')');
		}
	}

	final void method3709(Class329 class329_2_, int i) {
		try {
			((Class329) this).anInt2770 = ((Class329) class329_2_).anInt2770;
			((Class329) this).anInt2768 = ((Class329) class329_2_).anInt2768;
			((Class329) this).anInt2769 = ((Class329) class329_2_).anInt2769;
			((Class329) this).anInt2763 = ((Class329) class329_2_).anInt2763;
			((Class329) this).anInt2762 = ((Class329) class329_2_).anInt2762;
			int i_3_ = 81 % ((-39 - i) / 37);
			((Class329) this).anInt2772 = ((Class329) class329_2_).anInt2772;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uc.C(" + (class329_2_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class329 method3710(int i) {
		try {
			if (i != 28889)
				((Class329) this).anInt2762 = -34;
			return new Class329(((Class329) this).anInt2770, ((Class329) this).anInt2763, ((Class329) this).anInt2768, ((Class329) this).anInt2762, ((Class329) this).anInt2772, ((Class329) this).anInt2769);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.B(" + i + ')');
		}
	}

	static final int method3711(byte i, int i_4_) {
		try {
			if (i <= 113)
				method3708(51);
			return i_4_ >>> 367185160;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.E(" + i + ',' + i_4_ + ')');
		}
	}

	public static void method3712(byte i) {
		do {
			try {
				anIntArray2771 = null;
				if (i == 21)
					break;
				method3712((byte) 51);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uc.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3713(byte i, String string) {
		try {
			OutgoingPacket class98_sub11 = Class98_Sub46_Sub9.method1556(false);
			((OutgoingPacket) class98_sub11).packet.writeByte(((Class222) Class298.aClass222_2490).anInt1668);
			((OutgoingPacket) class98_sub11).packet.writeShort(0);
			int i_5_ = (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
			((OutgoingPacket) class98_sub11).packet.writeShort(637);
			int[] is = Class42_Sub2.method389(12206, class98_sub11);
			int i_6_ = (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
			((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
			((OutgoingPacket) class98_sub11).packet.writeByte(Class374.anInt3159);
			int i_7_ = -65 % ((-73 - i) / 33);
			((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position += 7;
			((OutgoingPacket) class98_sub11).packet.method1235(true, is, i_6_, ((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
			((OutgoingPacket) class98_sub11).packet.method1207((byte) 90, (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position) - i_5_);
			Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
			Class98_Sub26.anInt4028 = 0;
			Class55.anInt442 = -3;
			Class21_Sub4.anInt5394 = 1;
			Class372.anInt3150 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uc.F(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class329(int i) {
		((Class329) this).anInt2763 = 128;
		try {
			((Class329) this).anInt2770 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.<init>(" + i + ')');
		}
	}

	private Class329(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class329) this).anInt2763 = 128;
		try {
			((Class329) this).anInt2768 = i_9_;
			((Class329) this).anInt2770 = i;
			((Class329) this).anInt2769 = i_12_;
			((Class329) this).anInt2762 = i_10_;
			((Class329) this).anInt2763 = i_8_;
			((Class329) this).anInt2772 = i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uc.<init>(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}
}
