
/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub1 extends OutputStream {
	static int anInt32;
	static GameInterfaceData aClass293_33 = null;
	static OutgoingOpcode aClass171_34;
	static boolean aBoolean35;
	static Class240 aClass240_36;
	static int anInt37;
	static int[] anIntArray38;

	public final void write(int i) throws IOException {
		try {
			throw new IOException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dg.write(" + i + ')');
		}
	}

	static final ha method128(d var_d, int i, int i_0_, Canvas canvas, int i_1_) {
		try {
			if (i_1_ != 500)
				anIntArray38 = null;
			return new ha_Sub2(canvas, var_d, i_0_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dg.A(" + (var_d != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (canvas != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	static final void method129(int i, int i_2_, Class63 class63, int i_3_, int i_4_, boolean bool, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, Class110 class110) {
		try {
			Class64_Sub26.aClass324_3713 = null;
			Class42_Sub2.aClass324_5359 = null;
			Class45.anInt384 = i_6_;
			Class76_Sub10.anInt3793 = i_2_;
			Class231.aClass324_1733 = null;
			Class98_Sub10_Sub38.anInt5751 = i_5_;
			Class98_Sub10_Sub18.anInt5626 = i_3_;
			Class98_Sub27.anInt4060 = i_9_;
			Class151.aClass63_1216 = class63;
			if (bool != false)
				anInt32 = 118;
			Class277.anInt2050 = i_7_;
			Class15.anInt170 = i_4_;
			Class302.anInt2524 = i_8_;
			Class246_Sub10.anInt5153 = i;
			Class202.aClass110_1547 = class110;
			ha_Sub3.method2062(-4264);
			Class98_Sub10.aBoolean3858 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dg.D(" + i + ',' + i_2_ + ',' + (class63 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (class110 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method130(int i, int i_10_, int i_11_) {
		try {
			Class299_Sub2.method3523(i_11_, i, i_10_ ^ i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dg.B(" + i + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	public static void method131(byte i) {
		do {
			try {
				aClass171_34 = null;
				aClass240_36 = null;
				aClass293_33 = null;
				anIntArray38 = null;
				if (i == 4)
					break;
				anInt32 = -72;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dg.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		anInt32 = 500;
		aClass171_34 = new OutgoingOpcode(8, 3);
		aBoolean35 = false;
		anIntArray38 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	}
}
