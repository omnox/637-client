/* Class64_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub5 extends Class64 {
	static Class79 aClass79_3650 = new Class79(50);
	static float[] aFloatArray3651 = new float[16384];
	static int[] anIntArray3652;
	static float[] aFloatArray3653 = new float[16384];
	static int anInt3654;

	final void method551(byte i) {
		do {
			try {
				if (this.aClass98_Sub27_495.aClass64_Sub8_4042.method586(true) && !Class144.method2311(false, this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 124)))
					this.anInt494 = 0;
				if (this.anInt494 < 0 || this.anInt494 > 1)
					this.anInt494 = method552(0);
				if (i > 118)
					break;
				aClass79_3650 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dda.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method550(int i, int i_0_) {
		try {
			this.anInt494 = i_0_;
			int i_1_ = 60 / ((i - -26) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.B(" + i + ',' + i_0_ + ')');
		}
	}

	final int method552(int i) {
		try {
			if (i != 0)
				method556(-22, 33);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.A(" + i + ')');
		}
	}

	Class64_Sub5(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method556(int i, int i_2_) {
		try {
			if (!Class144.method2311(false, this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 125)))
				return 3;
			if (i_2_ != 29053)
				anIntArray3652 = null;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.F(" + i + ',' + i_2_ + ')');
		}
	}

	Class64_Sub5(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	public static void method569(boolean bool) {
		try {
			anIntArray3652 = null;
			if (bool != true)
				method569(true);
			aFloatArray3651 = null;
			aFloatArray3653 = null;
			aClass79_3650 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.D(" + bool + ')');
		}
	}

	final int method570(byte i) {
		try {
			if (i <= 119)
				return -44;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.E(" + i + ')');
		}
	}

	final boolean method571(int i) {
		try {
			if (i != -1)
				return false;
			if (!Class144.method2311(false, this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 124)))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.G(" + i + ')');
		}
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray3651[i] = (float) Math.sin((double) i * d);
			aFloatArray3653[i] = (float) Math.cos((double) i * d);
		}
	}
}
