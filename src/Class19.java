/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class19 implements Interface18 {
	static String aString3442;
	static int[][] anIntArrayArray3443 = new int[6][];
	private Class43 aClass43_3444;
	private RuneScapeCache aClass207_3445;
	private Class315 aClass315_3446;
	static short[] aShortArray3447 = { 20, 22, 44, 47, 51, 3, 45, 19 };
	static String aString3448;
	private RuneScapeCache aClass207_3449;
	static int anInt3450;
	static int[] anIntArray3451;

	public final void method60(boolean bool, byte i) {
		try {
			if (i > -81)
				method59(-24);
			if (bool) {
				int i_0_ = ((aClass315_3446.aClass63_3528.method545(Class98_Sub17_Sub1.anInt5782, aClass315_3446.anInt3532, (byte) 41)) - -aClass315_3446.anInt3521);
				int i_1_ = ((aClass315_3446.aClass110_3522.method2088(aClass315_3446.anInt3526, Class246_Sub2.anInt5072, (byte) -56)) - -aClass315_3446.anInt3520);
				aClass43_3444.method408(i_0_, null, aClass315_3446.anInt3532, aClass315_3446.aString3519, 0, aClass315_3446.anInt3531, null, aClass315_3446.anInt3524, (byte) -67, aClass315_3446.anInt3523, null, aClass315_3446.anInt3530, 0, aClass315_3446.anInt3534, i_1_, aClass315_3446.anInt3526);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bh.B(" + bool + ',' + i + ')');
		}
	}

	public final boolean method59(int i) {
		try {
			boolean bool = true;
			if (!aClass207_3445.method2742(-79, aClass315_3446.anInt3525))
				bool = false;
			if (i != 14017)
				aClass43_3444 = null;
			if (!aClass207_3449.method2742(i + -14055, (aClass315_3446.anInt3525)))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bh.A(" + i + ')');
		}
	}

	public final void method58(byte i) {
		try {
			if (i != -43)
				method251(-62);
			Class197 class197 = Class119_Sub1.method2182(aClass207_3449, true, (aClass315_3446.anInt3525));
			aClass43_3444 = (Class265.aHa1974.method1804(class197, Class324.method3684(aClass207_3445, aClass315_3446.anInt3525), true));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bh.C(" + i + ')');
		}
	}

	public static void method251(int i) {
		try {
			if (i != 51)
				method251(-6);
			anIntArrayArray3443 = null;
			anIntArray3451 = null;
			aString3442 = null;
			aShortArray3447 = null;
			aString3448 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bh.D(" + i + ')');
		}
	}

	Class19(RuneScapeCache class207, RuneScapeCache class207_2_, Class315 class315) {
		try {
			aClass207_3445 = class207;
			aClass315_3446 = class315;
			aClass207_3449 = class207_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bh.<init>(" + (class207 != null ? "{...}" : "null") + ',' + (class207_2_ != null ? "{...}" : "null") + ',' + (class315 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString3448 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString3442 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
		anIntArray3451 = new int[1000];
	}
}
