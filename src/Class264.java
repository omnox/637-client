/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.FileOutputStream;

final class Class264 {
	private Class79 aClass79_1968 = new Class79(256);
	static FileOutputStream aFileOutputStream1969;
	private RuneScapeCache aClass207_1970;
	static int anInt1971;
	static int anInt1972;

	static final void method3222(byte i) {
		try {
			Class253.anInt1934 = (((Class197) Class98_Sub46_Sub10.aClass197_6019).anInt1517 - (-(((Class197) Class98_Sub46_Sub10.aClass197_6019).anInt1514) - 2));
			Class98_Sub46_Sub20.aStringArray6073 = new String[500];
			Class98_Sub10_Sub12.anInt5598 = (2 + ((Class197) Class42_Sub1.aClass197_5354).anInt1517 + ((Class197) Class42_Sub1.aClass197_5354).anInt1514);
			int i_0_ = 0;
			if (i != -43)
				anInt1971 = 15;
			for (/**/; ((Class98_Sub46_Sub20.aStringArray6073.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++)
				Class98_Sub46_Sub20.aStringArray6073[i_0_] = "";
			Class98_Sub46.method1525(TextResources.aClass309_2586.get_text(Class374.anInt3159), i ^ ~0x7b);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qi.C(" + i + ')');
		}
	}

	final void method3223(byte i) {
		try {
			if (i != 17)
				method3223((byte) 86);
			synchronized (aClass79_1968) {
				aClass79_1968.method794(i + 58);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qi.D(" + i + ')');
		}
	}

	final Class98_Sub46_Sub12 method3224(int i, int i_1_) {
		try {
			Class98_Sub46_Sub12 class98_sub46_sub12;
			synchronized (aClass79_1968) {
				class98_sub46_sub12 = ((Class98_Sub46_Sub12) aClass79_1968.get((long) i_1_));
			}
			if (class98_sub46_sub12 != null)
				return class98_sub46_sub12;
			byte[] is;
			synchronized (aClass207_1970) {
				is = aClass207_1970.readArchive(i_1_, i);
			}
			class98_sub46_sub12 = new Class98_Sub46_Sub12();
			if (is != null)
				class98_sub46_sub12.method1588(0, new RSByteBuffer(is));
			synchronized (aClass79_1968) {
				aClass79_1968.put((long) i_1_, class98_sub46_sub12);
			}
			return class98_sub46_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qi.E(" + i + ',' + i_1_ + ')');
		}
	}

	public static void method3225(boolean bool) {
		do {
			try {
				aFileOutputStream1969 = null;
				if (bool == true)
					break;
				anInt1971 = 51;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qi.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method3226(int i) {
		try {
			int i_2_ = 7 / ((-48 - i) / 57);
			synchronized (aClass79_1968) {
				aClass79_1968.method806((byte) -115);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qi.A(" + i + ')');
		}
	}

	final void method3227(int i, int i_3_) {
		do {
			try {
				synchronized (aClass79_1968) {
					aClass79_1968.method800((byte) 62, i);
				}
				if (i_3_ <= -28)
					break;
				aClass207_1970 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qi.F(" + i + ',' + i_3_ + ')');
			}
			break;
		} while (false);
	}

	Class264(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_1970 = class207;
			aClass207_1970.method2761(0, 26);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qi.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
