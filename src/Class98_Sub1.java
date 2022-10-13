/* Class98_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub1 extends Node {
	int anInt3809;
	boolean[] aBooleanArray3810;
	static OutgoingOpcode aClass171_3811 = new OutgoingOpcode(67, 8);
	int[] anIntArray3812;
	int anInt3813;
	static int anInt3814;
	int[] anIntArray3815;
	int[][] anIntArrayArray3816;

	static final Class43 method945(int i, ha var_ha, byte i_0_, boolean bool) {
		try {
			if (i_0_ < 74)
				return null;
			Class244 class244 = Class114.method2151(i, bool, var_ha, true);
			if (class244 == null)
				return null;
			return ((Class244) class244).aClass43_1859;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ah.C(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_0_ + ',' + bool + ')'));
		}
	}

	static final void method946(int i, int i_1_, int i_2_, GameInterfaceData class293) {
		try {
			Class265.aClass293_1979 = class293;
			if (i_1_ <= -104) {
				Class64_Sub10.anInt3664 = i_2_;
				Class98_Sub10_Sub17.anInt5623 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ah.B(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method947(int i) {
		do {
			try {
				aClass171_3811 = null;
				if (i == -20899)
					break;
				aClass171_3811 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ah.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class98_Sub1(int i, byte[] is) {
		try {
			((Class98_Sub1) this).anInt3813 = i;
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			((Class98_Sub1) this).anInt3809 = class98_sub22.readUnsignedByte();
			((Class98_Sub1) this).anIntArray3815 = new int[((Class98_Sub1) this).anInt3809];
			((Class98_Sub1) this).anIntArray3812 = new int[((Class98_Sub1) this).anInt3809];
			((Class98_Sub1) this).aBooleanArray3810 = new boolean[((Class98_Sub1) this).anInt3809];
			((Class98_Sub1) this).anIntArrayArray3816 = new int[((Class98_Sub1) this).anInt3809][];
			for (int i_3_ = 0; i_3_ < ((Class98_Sub1) this).anInt3809; i_3_++) {
				((Class98_Sub1) this).anIntArray3812[i_3_] = class98_sub22.readUnsignedByte();
				if (((Class98_Sub1) this).anIntArray3812[i_3_] == 6)
					((Class98_Sub1) this).anIntArray3812[i_3_] = 2;
			}
			for (int i_4_ = 0; ((((Class98_Sub1) this).anInt3809 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++)
				((Class98_Sub1) this).aBooleanArray3810[i_4_] = ((class98_sub22.readUnsignedByte() ^ 0xffffffff) == -2);
			for (int i_5_ = 0; ((((Class98_Sub1) this).anInt3809 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++)
				((Class98_Sub1) this).anIntArray3815[i_5_] = class98_sub22.readShort();
			for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (((Class98_Sub1) this).anInt3809 ^ 0xffffffff)); i_6_++)
				((Class98_Sub1) this).anIntArrayArray3816[i_6_] = new int[class98_sub22.readUnsignedByte()];
			for (int i_7_ = 0; ((((Class98_Sub1) this).anInt3809 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
				for (int i_8_ = 0; (((Class98_Sub1) this).anIntArrayArray3816[i_7_].length > i_8_); i_8_++)
					((Class98_Sub1) this).anIntArrayArray3816[i_7_][i_8_] = class98_sub22.readUnsignedByte();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ah.<init>(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
