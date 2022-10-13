/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class210 implements Interface10 {
	private Class124 aClass124_3327;
	private ha aHa3328;
	static int[] anIntArray3329 = new int[3];
	private boolean aBoolean3330;
	private Interface18[] anInterface18Array3331;

	public final int method25(int i) {
		try {
			if (i != -24591)
				return -30;
			return aClass124_3327.anInt1014;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.D(" + i + ')');
		}
	}

	public final void method27(int i) {
		do {
			try {
				if (Class265.aHa1974 != aHa3328) {
					aBoolean3330 = true;
					aHa3328 = Class265.aHa1974;
				}
				aHa3328.GA(0);
				Interface18[] interface18s = anInterface18Array3331;
				for (int i_0_ = 0; i_0_ < interface18s.length; i_0_++) {
					Interface18 interface18 = interface18s[i_0_];
					if (interface18 != null)
						interface18.method58((byte) -43);
				}
				if (i == -31295)
					break;
				method24(75);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nk.H(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method23(int i, boolean bool) {
		try {
			bool = true;
			Interface18[] interface18s = anInterface18Array3331;
			int i_1_ = 0;
			if (i != 32210)
				aHa3328 = null;
			for (/**/; interface18s.length > i_1_; i_1_++) {
				Interface18 interface18 = interface18s[i_1_];
				if (interface18 != null)
					interface18.method60(bool || aBoolean3330, (byte) -124);
			}
			aBoolean3330 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.I(" + i + ',' + bool + ')');
		}
	}

	public final boolean method28(int i, long l) {
		try {
			int i_2_ = -16 / ((-13 - i) / 50);
			if ((long) aClass124_3327.anInt1012 + l > Class343.method3819(-47))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.N(" + i + ',' + l + ')');
		}
	}

	public final int method26(int i) {
		try {
			int i_3_ = 0;
			Interface18[] interface18s = anInterface18Array3331;
			for (int i_4_ = 0; i_4_ < interface18s.length; i_4_++) {
				Interface18 interface18 = interface18s[i_4_];
				if (interface18 == null || interface18.method59(14017))
					i_3_++;
			}
			if (i != -794)
				anInterface18Array3331 = null;
			return i_3_ * 100 / anInterface18Array3331.length;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.F(" + i + ')');
		}
	}

	public final void method24(int i) {
		try {
			if (i != -26363)
				method23(-118, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.K(" + i + ')');
		}
	}

	Class210(Class124 class124, Class362 class362) {
		try {
			aClass124_3327 = class124;
			anInterface18Array3331 = new Interface18[(aClass124_3327.anInterface21Array1013).length];
			for (int i = 0; (i < anInterface18Array3331.length); i++)
				anInterface18Array3331[i] = class362.method3927((byte) 62, (aClass124_3327.anInterface21Array1013[i]));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nk.<init>(" + (class124 != null ? "{...}" : "null") + ',' + (class362 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2773(int i) {
		do {
			try {
				anIntArray3329 = null;
				if (i == 3)
					break;
				method2773(-119);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nk.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
