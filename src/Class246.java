/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class246 {
	static short[] aShortArray1869;
	static boolean aBoolean1870 = false;
	static int anInt1871;
	static int anInt1872 = 0;
	Class246 aClass246_1873;
	Class246 aClass246_1874;

	static final void method2962(boolean bool) {
		try {
			Class154.aHa1231 = null;
			Class98_Sub5_Sub3.aClass111_5540 = null;
			Class224_Sub2_Sub1.anInt6141 = -1;
			if (bool == false) {
				aa_Sub1.anInt3558 = -1;
				Class98_Sub46.anInt4261 = -1;
				Class31.anInterface17_301 = null;
				Class146_Sub2.anIntArray4873 = null;
				Class42_Sub3.aClass111_5364 = null;
				Class109.anInt926 = -1;
				Class200.aClass111_1543 = null;
				Class172.anInterface17Array1327 = null;
				Class266.aClass84_1988.method833(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pha.HB(" + bool + ')');
		}
	}

	public static void method2963(int i) {
		try {
			if (i != -1)
				aBoolean1870 = true;
			aShortArray1869 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pha.JB(" + i + ')');
		}
	}

	public Class246() {
		/* empty */
	}

	static final void method2964(boolean bool, int i) {
		try {
			if (i != -1 && Class246_Sub3_Sub3_Sub1.loadedInterfaceFlags[i]) {
				Class98_Sub17_Sub1.aClass207_5783.method2754(-53, i);
				Class159.gameInterfaces[i] = null;
				Class64_Sub13.aClass293ArrayArray3674[i] = null;
				Class246_Sub3_Sub3_Sub1.loadedInterfaceFlags[i] = bool;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pha.KB(" + bool + ',' + i + ')');
		}
	}

	final void method2965(byte i) {
		try {
			if (((Class246) this).aClass246_1873 != null) {
				((Class246) ((Class246) this).aClass246_1873).aClass246_1874 = ((Class246) this).aClass246_1874;
				((Class246) ((Class246) this).aClass246_1874).aClass246_1873 = ((Class246) this).aClass246_1873;
				((Class246) this).aClass246_1874 = null;
				((Class246) this).aClass246_1873 = null;
				int i_0_ = 77 % ((89 - i) / 32);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pha.IB(" + i + ')');
		}
	}
}
