/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class375 {
	static RuneScapeCache aClass207_3167;
	static int anInt3168 = 328;
	static int anInt3169;
	static boolean aBoolean3170 = false;

	static final boolean method3986(int i, byte i_0_) {
		try {
			if (i_0_ != -108)
				method3988(null, (byte) -13, -123);
			if ((i ^ 0xffffffff) != -3 && (i ^ 0xffffffff) != -4)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wp.B(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method3987(byte i) {
		try {
			if (i != -73)
				anInt3168 = -23;
			aClass207_3167 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wp.C(" + i + ')');
		}
	}

	static final byte[] method3988(File file, byte i, int i_1_) {
		try {
			if (i != 78)
				aBoolean3170 = true;
			try {
				byte[] is = new byte[i_1_];
				Class261.method3211(is, 124, i_1_, file);
				return is;
			} catch (java.io.IOException ioexception) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wp.A(" + (file != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
		}
	}
}
