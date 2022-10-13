
/* Class76_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Dimension;

final class Class76_Sub11 extends Class76 {
	static Class332 aClass332_3795;
	static int[] anIntArray3796 = new int[250];
	static Class79 aClass79_3797 = new Class79(8);
	static int anInt3798;
	static Applet anApplet3799;
	static int anInt3800;

	final void method739(int i) {
		try {
			if (i != -2)
				method745((byte) -106);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wk.C(" + i + ')');
		}
	}

	static final ha method771(int i, Canvas canvas, int i_0_, d var_d, int i_1_, RuneScapeCache class207) {
		try {
			if (i_0_ <= 21)
				return null;
			int i_2_ = 0;
			int i_3_ = 0;
			if (canvas != null) {
				Dimension dimension = canvas.getSize();
				i_2_ = dimension.width;
				i_3_ = dimension.height;
			}
			return ha.method1742((byte) 64, i, canvas, var_d, i_2_, class207, i_1_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wk.F(" + i + ',' + (canvas != null ? "{...}" : "null") + ',' + i_0_ + ',' + (var_d != null ? "{...}" : "null") + ',' + i_1_ + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method743(int i, boolean bool) {
		try {
			if (i <= 93)
				method771(-78, null, 97, null, 28, null);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wk.D(" + i + ',' + bool + ')');
		}
	}

	final void method748(int i, boolean bool) {
		try {
			if (i != 69)
				aClass332_3795 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wk.B(" + i + ',' + bool + ')');
		}
	}

	Class76_Sub11(ha_Sub3 var_ha_Sub3) {
		super(var_ha_Sub3);
	}

	public static void method772(byte i) {
		try {
			aClass332_3795 = null;
			anApplet3799 = null;
			if (i >= 64) {
				aClass79_3797 = null;
				anIntArray3796 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wk.A(" + i + ')');
		}
	}

	final void method746(int i, int i_4_, int i_5_) {
		do {
			try {
				if (i_5_ < -75)
					break;
				aClass332_3795 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("wk.E(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method745(byte i) {
		try {
			if (i != 27)
				anApplet3799 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wk.H(" + i + ')');
		}
	}

	final void method742(int i, int i_6_, Interface4 interface4) {
		try {
			if (i != 6)
				anInt3798 = 101;
			this.aHa_Sub3_585.method2005(interface4, -123);
			this.aHa_Sub3_585.method2015(i_6_, (byte) 117);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wk.I(" + i + ',' + i_6_ + ',' + (interface4 != null ? "{...}" : "null") + ')'));
		}
	}
}
