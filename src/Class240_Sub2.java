/* Class240_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class240_Sub2 extends Class240 {
	private long aLong5055 = 0L;
	private long aLong5056 = 0L;
	private long[] aLongArray5057 = new long[10];
	private int anInt5058;
	private int anInt5059 = 1;
	private long aLong5060;

	final void method2923(boolean bool) {
		do {
			try {
				aLong5060 = 0L;
				if (aLong5055 > aLong5056)
					aLong5056 += aLong5055 + -aLong5056;
				if (!bool)
					break;
				method2924((byte) -114);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final long method2922(byte i) {
		long l;
		try {
			aLong5056 += method2929(-123);
			if (aLong5056 < aLong5055)
				return (-aLong5056 + aLong5055) / 1000000L;
			if (i >= -80)
				method2926(73, -115L);
			l = 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	final int method2926(int i, long l) {
		int i_0_;
		try {
			if (i <= 117)
				aLong5056 = -7L;
			if (aLong5056 < aLong5055) {
				aLong5060 += aLong5055 + -aLong5056;
				aLong5056 += aLong5055 - aLong5056;
				aLong5055 += l;
				return 1;
			}
			int i_1_ = 0;
			do {
				i_1_++;
				aLong5055 += l;
			} while (10 > i_1_ && (aLong5056 > aLong5055));
			if (aLong5055 < aLong5056)
				aLong5055 = aLong5056;
			i_0_ = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	final long method2924(byte i) {
		long l;
		try {
			if (i <= 12)
				return 126L;
			l = aLong5056;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	private final long method2929(int i) {
		long l;
		try {
			long l_2_ = System.nanoTime();
			long l_3_ = -aLong5060 + l_2_;
			aLong5060 = l_2_;
			if (l_3_ > -5000000000L && 5000000000L > l_3_) {
				aLongArray5057[anInt5058] = l_3_;
				anInt5058 = (1 + anInt5058) % 10;
				if (anInt5059 < 1)
					anInt5059++;
			}
			long l_4_ = 0L;
			for (int i_5_ = 1; i_5_ <= anInt5059; i_5_++)
				l_4_ += aLongArray5057[(10 + anInt5058 + -i_5_) % 10];
			int i_6_ = 28 / ((i - -84) / 38);
			l = l_4_ / (long) anInt5059;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	Class240_Sub2() {
		anInt5058 = 0;
		aLong5060 = 0L;
		try {
			aLong5056 = System.nanoTime();
			aLong5055 = System.nanoTime();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
