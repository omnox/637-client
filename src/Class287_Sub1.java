/* Class287_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class Class287_Sub1 extends Class287 implements Interface16 {
	private int anInt3418;
	static int[] anIntArray3419 = new int[256];
	static Class232 aClass232_3420;
	static int[] anIntArray3421;

	Class287_Sub1(ha_Sub1 var_ha_Sub1, int i, Buffer buffer, int i_0_, boolean bool) {
		super(var_ha_Sub1, 34962, buffer, i_0_, bool);
		try {
			anInt3418 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iv.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + (buffer != null ? "{...}" : "null") + ',' + i_0_ + ',' + bool + ')'));
		}
	}

	public static void method3390(int i) {
		do {
			try {
				anIntArray3421 = null;
				aClass232_3420 = null;
				anIntArray3419 = null;
				if (i == -28614)
					break;
				aClass232_3420 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "iv.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method54(int i, int i_1_, byte[] is, int i_2_) {
		do {
			try {
				this.method3389(0, i, is);
				anInt3418 = i_2_;
				if (i_1_ == 7896)
					break;
				anInt3418 = -39;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("iv.F(" + i + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	public final long method52(int i) {
		try {
			if (i != 24582)
				anIntArray3421 = null;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iv.E(" + i + ')');
		}
	}

	public final int method55(int i) {
		try {
			int i_3_ = -96 / ((i - -19) / 45);
			return anInt3418;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iv.C(" + i + ')');
		}
	}

	Class287_Sub1(ha_Sub1 var_ha_Sub1, int i, byte[] is, int i_4_, boolean bool) {
		super(var_ha_Sub1, 34962, is, i_4_, bool);
		try {
			anInt3418 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iv.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_4_ + ',' + bool + ')'));
		}
	}

	public final int method53(int i) {
		try {
			if (i != -14112)
				return 57;
			return ((Class287) this).anInt2191;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iv.B(" + i + ')');
		}
	}

	final void method3384(int i) {
		do {
			try {
				((Class287) this).aHa_Sub1_2185.method1887(this, i + 34962);
				if (i == 0)
					break;
				method53(-28);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "iv.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_5_ = i;
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -9; i_6_++) {
				if ((i_5_ & 0x1) == 1)
					i_5_ = ~0x12477cdf ^ i_5_ >>> 1453156353;
				else
					i_5_ >>>= 1;
			}
			anIntArray3419[i] = i_5_;
		}
		aClass232_3420 = new Class232();
	}
}
