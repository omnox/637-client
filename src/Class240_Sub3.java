/* Class240_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class240_Sub3 extends Class240 {
	private long aLong5061 = 0L;
	private long[] aLongArray5062 = new long[10];
	private int anInt5063 = 1;
	private int anInt5064;
	private long aLong5065 = 0L;
	private long aLong5066 = 0L;

	private final long method2930(int i) {
		try {
			long l = Class343.method3819(-47) * 1000000L;
			long l_0_ = l + -aLong5066;
			aLong5066 = l;
			if ((l_0_ ^ 0xffffffffffffffffL) < 4999999999L && l_0_ < 5000000000L) {
				aLongArray5062[anInt5064] = l_0_;
				anInt5064 = (1 + anInt5064) % 10;
				if ((anInt5063 ^ 0xffffffff) > -11)
					anInt5063++;
			}
			long l_1_ = (long) i;
			for (int i_2_ = 1; (i_2_ ^ 0xffffffff) >= (anInt5063 ^ 0xffffffff); i_2_++)
				l_1_ += aLongArray5062[(-i_2_ + (anInt5064 + 10)) % 10];
			return l_1_ / (long) anInt5063;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final long method2922(byte i) {
		try {
			if (i >= -80)
				aLong5066 = 38L;
			aLong5065 += method2930(0);
			if ((aLong5065 ^ 0xffffffffffffffffL) > (aLong5061 ^ 0xffffffffffffffffL))
				return (-aLong5065 + aLong5061) / 1000000L;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2923(boolean bool) {
		do {
			try {
				aLong5066 = 0L;
				if ((aLong5065 ^ 0xffffffffffffffffL) > (aLong5061 ^ 0xffffffffffffffffL))
					aLong5065 += -aLong5065 + aLong5061;
				if (bool == false)
					break;
				method2924((byte) 9);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final int method2926(int i, long l) {
		try {
			if (i <= 117)
				return 55;
			if (aLong5065 >= aLong5061) {
				int i_3_ = 0;
				do
					aLong5061 += l;
				while (++i_3_ < 10 && ((aLong5065 ^ 0xffffffffffffffffL) < (aLong5061 ^ 0xffffffffffffffffL)));
				if ((aLong5065 ^ 0xffffffffffffffffL) < (aLong5061 ^ 0xffffffffffffffffL))
					aLong5061 = aLong5065;
				return i_3_;
			}
			aLong5066 += -aLong5065 + aLong5061;
			aLong5065 += aLong5061 - aLong5065;
			aLong5061 += l;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final long method2924(byte i) {
		try {
			if (i <= 12)
				return 77L;
			return aLong5065;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class240_Sub3() {
		anInt5064 = 0;
	}
}
