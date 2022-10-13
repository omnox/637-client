/* Class64_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub24 extends Class64 {
	static Object anObject3709;
	static boolean aBoolean3710 = false;

	public static void method650(int i) {
		try {
			int i_0_ = -2 / ((28 - i) / 57);
			anObject3709 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.G(" + i + ')');
		}
	}

	final int method552(int i) {
		try {
			if (i != 0)
				return -68;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.A(" + i + ')');
		}
	}

	Class64_Sub24(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	Class64_Sub24(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final void method550(int i, int i_1_) {
		try {
			int i_2_ = -14 / ((-26 - i) / 41);
			this.anInt494 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.B(" + i + ',' + i_1_ + ')');
		}
	}

	final int method651(byte i) {
		try {
			if (i <= 119)
				anObject3709 = null;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.E(" + i + ')');
		}
	}

	final int method556(int i, int i_3_) {
		try {
			if (i_3_ != 29053)
				return -97;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.F(" + i + ',' + i_3_ + ')');
		}
	}

	static final int method652(int i, int i_4_) {
		try {
			if (i_4_ <= 66)
				return 62;
			if (i == 16711935)
				return -1;
			return Class38.method348(i, -24);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.D(" + i + ',' + i_4_ + ')');
		}
	}

	final void method551(byte i) {
		try {
			if (this.aClass98_Sub27_495.method1286((byte) 104) == Class64_Sub2.aClass279_3643)
				this.anInt494 = 2;
			if (i >= 118) {
				if (this.anInt494 < 0 || this.anInt494 > 2)
					this.anInt494 = method552(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.C(" + i + ')');
		}
	}
}
