/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class334 implements Interface18 {
	private Class363 aClass363_3467;
	static Class232 aClass232_3468 = new Class232();
	private Class52 aClass52_3469;
	static OutgoingOpcode aClass171_3470 = new OutgoingOpcode(28, 3);
	static Class332 aClass332_3471;

	public final boolean method59(int i) {
		try {
			if (i != 14017)
				aClass232_3468 = null;
			return aClass363_3467.method3928(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uha.A(" + i + ')');
		}
	}

	public static void method3763(boolean bool) {
		do {
			try {
				aClass171_3470 = null;
				aClass332_3471 = null;
				aClass232_3468 = null;
				if (bool == true)
					break;
				aClass171_3470 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uha.E(" + bool + ')');
			}
			break;
		} while (false);
	}

	public final void method58(byte i) {
		try {
			if (i != -43)
				aClass52_3469 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uha.C(" + i + ')');
		}
	}

	public final void method60(boolean bool, byte i) {
		do {
			try {
				if (i >= -81)
					aClass332_3471 = null;
				Class368 class368 = aClass363_3467.method3929(23885, (((Class52) aClass52_3469).anInt3501));
				if (class368 == null)
					break;
				int i_0_ = ((((Class52) aClass52_3469).aClass63_3502.method545(Class98_Sub17_Sub1.anInt5782, ((Class52) aClass52_3469).anInt3496, (byte) 110)) - -((Class52) aClass52_3469).anInt3498);
				int i_1_ = ((((Class52) aClass52_3469).aClass110_3499.method2088(((Class52) aClass52_3469).anInt3497, Class246_Sub2.anInt5072, (byte) -56)) + ((Class52) aClass52_3469).anInt3490);
				if (((Class52) aClass52_3469).aBoolean3495)
					Class265.aHa1974.method1779(i_0_, i_1_, ((Class52) aClass52_3469).anInt3496, ((Class52) aClass52_3469).anInt3497, ((Class52) aClass52_3469).anInt3489, 0);
				i_1_ += method3764(5, i_1_, Class98_Sub10_Sub34.aClass43_5730, ((Class368) class368).aString3127, true, i_0_) * 12;
				i_1_ += 8;
				if (((Class52) aClass52_3469).aBoolean3495)
					Class265.aHa1974.method1795(i_0_, i_1_, i_0_ + (((Class52) aClass52_3469).anInt3496 - 1), i_1_, ((Class52) aClass52_3469).anInt3489, 0);
				i_1_ = (++i_1_ + 12 * method3764(5, i_1_, Class98_Sub10_Sub34.aClass43_5730, ((Class368) class368).aString3123, true, i_0_));
				i_1_ += 5;
				i_1_ += method3764(5, i_1_, Class98_Sub10_Sub34.aClass43_5730, ((Class368) class368).aString3125, true, i_0_) * 12;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uha.B(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	private final int method3764(int i, int i_2_, Class43 class43, String string, boolean bool, int i_3_) {
		try {
			if (bool != true)
				aClass363_3467 = null;
			return (class43.method408(i + i_3_, null, -(i * 2) + ((Class52) aClass52_3469).anInt3496, string, 0, ((Class52) aClass52_3469).anInt3491, null, 0, (byte) -119, ((Class52) aClass52_3469).anInt3492, null, 0, 0, 0, i + i_2_, -(i * 2) + ((Class52) aClass52_3469).anInt3497));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uha.D(" + i + ',' + i_2_ + ',' + (class43 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + bool + ',' + i_3_ + ')'));
		}
	}

	Class334(Class363 class363, Class52 class52) {
		try {
			aClass363_3467 = class363;
			aClass52_3469 = class52;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uha.<init>(" + (class363 != null ? "{...}" : "null") + ',' + (class52 != null ? "{...}" : "null") + ')'));
		}
	}
}
