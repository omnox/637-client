/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class16 {
	private int anInt187 = -1;
	private int anInt188;
	private LinkedList aClass148_189;
	static int anInt190 = -1;
	private int anInt192;
	private int anInt193 = 0;
	private int[][] anIntArrayArray194;
	private Class98_Sub48[] aClass98_Sub48Array195;
	static int anInt196 = 0;
	static int anInt197;
	boolean aBoolean198;
	static int anInt199 = 7000;

	public static void method235(byte i) {
		do {
			try {
				IncomingOpcode.exitToLobbyOpcode = null;
				if (i == 102)
					break;
				IncomingOpcode.exitToLobbyOpcode = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bca.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method236(int i) {
		try {
			for (int i_0_ = 0; anInt188 > i_0_; i_0_++)
				anIntArrayArray194[i_0_] = null;
			anIntArrayArray194 = null;
			aClass98_Sub48Array195 = null;
			int i_1_ = -61 % ((-49 - i) / 48);
			aClass148_189.method2422((byte) 47);
			aClass148_189 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bca.B(" + i + ')');
		}
	}

	final int[] method237(byte i, int i_2_) {
		try {
			if (i != 98)
				return null;
			if (anInt192 != anInt188) {
				if (anInt188 == 1) {
					((Class16) this).aBoolean198 = (i_2_ ^ 0xffffffff) != (anInt187 ^ 0xffffffff);
					anInt187 = i_2_;
					return anIntArrayArray194[0];
				}
				Class98_Sub48 class98_sub48 = aClass98_Sub48Array195[i_2_];
				if (class98_sub48 != null)
					((Class16) this).aBoolean198 = false;
				else {
					((Class16) this).aBoolean198 = true;
					if (anInt193 < anInt188) {
						class98_sub48 = new Class98_Sub48(i_2_, anInt193);
						anInt193++;
					} else {
						Class98_Sub48 class98_sub48_3_ = (Class98_Sub48) aClass148_189.method2427(-111);
						class98_sub48 = new Class98_Sub48(i_2_, ((Class98_Sub48) class98_sub48_3_).anInt4282);
						aClass98_Sub48Array195[((Class98_Sub48) class98_sub48_3_).anInt4278] = null;
						class98_sub48_3_.remove();
					}
					aClass98_Sub48Array195[i_2_] = class98_sub48;
				}
				aClass148_189.method2423(-2, class98_sub48);
				return (anIntArrayArray194[((Class98_Sub48) class98_sub48).anInt4282]);
			}
			((Class16) this).aBoolean198 = aClass98_Sub48Array195[i_2_] == null;
			aClass98_Sub48Array195[i_2_] = Class132.aClass98_Sub48_1048;
			return anIntArrayArray194[i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bca.C(" + i + ',' + i_2_ + ')');
		}
	}

	final int[][] method238(int i) {
		try {
			if ((anInt188 ^ 0xffffffff) != (anInt192 ^ 0xffffffff))
				throw new RuntimeException("Can only retrieve a full image cache");
			int i_4_ = 71 % ((-66 - i) / 53);
			for (int i_5_ = 0; anInt188 > i_5_; i_5_++)
				aClass98_Sub48Array195[i_5_] = Class132.aClass98_Sub48_1048;
			return anIntArrayArray194;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bca.D(" + i + ')');
		}
	}

	Class16(int i, int i_6_, int i_7_) {
		aClass148_189 = new LinkedList();
		((Class16) this).aBoolean198 = false;
		try {
			anInt192 = i_6_;
			anInt188 = i;
			anIntArrayArray194 = new int[anInt188][i_7_];
			aClass98_Sub48Array195 = new Class98_Sub48[anInt192];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bca.<init>(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	static {
		anInt197 = anInt199;
	}
}
