/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class298 //steven
{
	AbstractModel aClass146_2477;
	static Class222 aClass222_2478 = new Class222(14, 0);
	r aR2479;
	static Class222 aClass222_2480 = new Class222(15, 4);
	static Class222 aClass222_2481 = new Class222(16, -2);
	static Class222 aClass222_2482 = new Class222(17, 0);
	static Class222 aClass222_2483 = new Class222(18, -2);
	static Class222 aClass222_2484 = new Class222(19, -2);
	static Class222 aClass222_2485 = new Class222(22, -2);
	static Class222 aClass222_2486 = new Class222(23, 4);
	static Class222 aClass222_2487 = new Class222(24, -1);
	static Class222 aClass222_2488 = new Class222(26, 0);
	static Class222 aClass222_2489 = new Class222(27, 0);
	static Class222 aClass222_2490 = new Class222(28, -2);
	private static Class222[] aClass222Array2491 = new Class222[32];
	static byte[] aByteArray2492;

	public static void method3502(int i) {
		try {
			aClass222_2488 = null;
			aClass222_2483 = null;
			aClass222_2490 = null;
			aClass222_2482 = null;
			aClass222_2489 = null;
			aClass222_2485 = null;
			aClass222_2484 = null;
			aClass222_2481 = null;
			aClass222_2487 = null;
			aClass222_2480 = null;
			aClass222_2478 = null;
			aClass222Array2491 = null;
			int i_0_ = 119 % ((-53 - i) / 55);
			aByteArray2492 = null;
			aClass222_2486 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sfa.C(" + i + ')');
		}
	}

	static final Class163 method3503(RSByteBuffer class98_sub22, int i) {
		try {
			if (i > -6)
				method3504(-127, 96, 42);
			int i_1_ = class98_sub22.readInt(-2);
			return new Class163(i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sfa.A(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method3504(int i, int i_2_, int i_3_) {
		try {
			if (i_3_ != 28)
				method3503(null, -50);
			if (!((i_2_ & 0x70000) != 0 | Class105.method1715(true, i_2_, i)) && !Class238.method2919(-116, i_2_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sfa.B(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public Class298() {
		/* empty */
	}

	static {
		Class222[] class222s = Class98_Sub43.method1484(0);
		for (int i = 0; class222s.length > i; i++)
			aClass222Array2491[class222s[i].anInt1668] = class222s[i];
	}
}
