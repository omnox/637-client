/* Class284_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class284_Sub1 extends Class284 {
	private int[] anIntArray5172;
	private int anInt5173;
	private byte[] aByteArray5174;
	private int anInt5175;
	static Class43 aClass43_5177;
	static int[] anIntArray5178;

	void method3363(byte i, int i_0_, byte i_1_) {
		do {
			try {
				aByteArray5174[anInt5173++] = (byte) (Class202.method2702(i >> 1624804897, 127) + 127);
				if (i_1_ == 42)
					break;
				IncomingOpcode.aClass58_5176 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gd.M(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3364(int i) {
		try {
			aClass43_5177 = null;
			anIntArray5178 = null;
			IncomingOpcode.aClass58_5176 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gd.P(" + i + ')');
		}
	}

	final void method3354(int i) {
		try {
			anInt5173 = 0;
			anInt5175 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gd.D(" + i + ')');
		}
	}

	final void method3356(int i, int i_2_, int i_3_) {
		try {
			anInt5175 += i_2_ * anIntArray5172[i] >> 460423148;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gd.G(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method3358(int i) {
		try {
			anInt5175 = Math.abs(anInt5175);
			if ((anInt5175 ^ 0xffffffff) <= -4097)
				anInt5175 = 4095;
			method3363((byte) (anInt5175 >> 1016186948), anInt5173++, (byte) 42);
			anInt5175 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gd.H(" + i + ')');
		}
	}

	Class284_Sub1(int i, int i_4_, int i_5_, int i_6_, int i_7_, float f) {
		super(i, i_4_, i_5_, i_6_, i_7_);
		try {
			anIntArray5172 = new int[((Class284) this).anInt2159];
			for (int i_8_ = 0; i_8_ < ((Class284) this).anInt2159; i_8_++)
				anIntArray5172[i_8_] = (short) (int) (4096.0 * Math.pow((double) f, (double) i_8_));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gd.<init>(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + f + ')'));
		}
	}
}
