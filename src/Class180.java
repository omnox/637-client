/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class180 implements Interface14 {
	static short[][][] aShortArrayArrayArray3397;
	private RuneScapeCache aClass207_3399;
	private String aString3400;
	private static short[][] aShortArrayArray3401 = { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };
	private static short[][] aShortArrayArray3402 = { new short[0], new short[0], new short[0], new short[0], new short[0] };
	private static short[][] aShortArrayArray3403 = { new short[0], new short[0], new short[0], new short[0], new short[0] };
	static long aLong3404;
	static float aFloat3405;

	static final boolean method2603(byte i, Interface19 interface19) {
		try {
			Class352 class352 = Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119);
			if ((((Class352) class352).anInt2990 ^ 0xffffffff) == 0)
				return true;
			Class9 class9 = Class98_Sub10_Sub23.aClass335_5662.method3766(((Class352) class352).anInt2990, (byte) -73);
			if ((((Class9) class9).anInt114 ^ 0xffffffff) == 0)
				return true;
			if (i != 76)
				return true;
			return class9.method191(-87);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("maa.C(" + i + ',' + (interface19 != null ? "{...}" : "null") + ')'));
		}
	}

	public final Class191 method50(int i) {
		try {
			if (i != 15763)
				return null;
			return Class191.aClass191_1474;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "maa.B(" + i + ')');
		}
	}

	static final void method2604(int i, int i_0_, int i_1_, int i_2_, OutgoingPacket class98_sub11) {
		try {
			if (i_0_ != -21568)
				aShortArrayArray3402 = null;
			((OutgoingPacket) class98_sub11).packet.writeInt(1571862888, i_1_);
			((OutgoingPacket) class98_sub11).packet.writeLEShortA(i, i_0_ + 21696);
			((OutgoingPacket) class98_sub11).packet.writeShort(i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("maa.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (class98_sub11 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method51(byte i) {
		try {
			if (aClass207_3399.method2734(aString3400, false))
				return 100;
			if (i <= 126)
				return -21;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "maa.E(" + i + ')');
		}
	}

	public static void method2605(byte i) {
		try {
			aShortArrayArray3401 = null;
			IncomingOpcode.aClass58_3398 = null;
			aShortArrayArrayArray3397 = null;
			if (i >= -5)
				aShortArrayArray3403 = null;
			aShortArrayArray3403 = null;
			aShortArrayArray3402 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "maa.D(" + i + ')');
		}
	}

	Class180(RuneScapeCache class207, String string) {
		try {
			aClass207_3399 = class207;
			aString3400 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("maa.<init>(" + (class207 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aShortArrayArrayArray3397 = new short[][][] { aShortArrayArray3401, aShortArrayArray3402, aShortArrayArray3403 };
		aLong3404 = 0L;
		aFloat3405 = 0.0F;
	}
}
