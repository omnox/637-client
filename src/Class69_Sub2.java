
/* Class69_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;

final class Class69_Sub2 extends Class69 implements Interface2_Impl1 {
	private byte aByte5332;
	static Class79 aClass79_5334;
	static int anInt5335 = 0;
	static Class43 aClass43_5336;

	final int method704(byte i) {
		try {
			if (i != -22)
				method705(-35, -56, null);
			return aByte5332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "va.Q(" + i + ')');
		}
	}

	static final byte[] method705(int i, int i_0_, byte[] is) {
		try {
			byte[] is_1_ = new byte[i];
			Class236.method2894(is, 0, is_1_, 0, i);
			if (i_0_ < 58)
				aClass79_5334 = null;
			return is_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("va.P(" + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class53_Sub1 method706(int i) {
		try {
			if (i != 200)
				IncomingOpcode.aClass58_5333 = null;
			if (Class239.anInt1843 < Class98_Sub28_Sub1.aClass53_Sub1Array5805.length)
				return (Class98_Sub28_Sub1.aClass53_Sub1Array5805[Class239.anInt1843++]);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "va.O(" + i + ')');
		}
	}

	public final boolean method71(int i) {
		try {
			if (i != 13623)
				method2(94);
			return super.method703((byte) -68, (this.aHa_Sub3_Sub2_3217.aMapBuffer6128));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "va.N(" + i + ')');
		}
	}

	Class69_Sub2(ha_Sub3_Sub2 var_ha_Sub3_Sub2, boolean bool) {
		super(var_ha_Sub3_Sub2, 34962, bool);
	}

	public final boolean method74(int i, int i_2_, int i_3_) {
		try {
			aByte5332 = (byte) i_2_;
			if (i != -20279)
				method73((byte) 58, 121, 8, null);
			super.method76(i_3_, i + 41058);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("va.S(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final void method72(boolean bool) {
		try {
			super.method72(bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "va.L(" + bool + ')');
		}
	}

	static final String method707(byte[] is, boolean bool) {
		try {
			if (bool != true)
				IncomingOpcode.aClass58_5333 = null;
			return Class98_Sub46_Sub6.method1546(is.length, 0, (byte) -110, is);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("va.V(" + (is != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	public static void method708(int i) {
		try {
			if (i != 7315)
				aClass79_5334 = null;
			aClass79_5334 = null;
			aClass43_5336 = null;
			IncomingOpcode.aClass58_5333 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "va.R(" + i + ')');
		}
	}

	public final boolean method73(byte i, int i_4_, int i_5_, Source source) {
		try {
			aByte5332 = (byte) i_5_;
			super.method697(source, 1, i_4_);
			if (i > -79)
				aClass43_5336 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("va.T(" + i + ',' + i_4_ + ',' + i_5_ + ',' + (source != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method2(int i) {
		try {
			if (i != 200)
				aByte5332 = (byte) 44;
			return super.method2(200);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "va.E(" + i + ')');
		}
	}

	public final Buffer method75(boolean bool, byte i) {
		try {
			if (i != 27)
				return null;
			return super.method694(bool, (this.aHa_Sub3_Sub2_3217.aMapBuffer6128), -15793);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "va.U(" + bool + ',' + i + ')');
		}
	}

	static {
		aClass79_5334 = new Class79(3000000, 200);
	}
}
