/* Class246_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub10 extends Class246 {
	int anInt5151;
	static volatile boolean aBoolean5152 = true;
	static int anInt5153;
	static int anInt5154;

	static final byte[] method3140(byte[] is, int i) {
		try {
			int i_0_ = is.length;
			byte[] is_1_ = new byte[i_0_];
			Class236.method2894(is, i, is_1_, 0, i_0_);
			return is_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qe.B(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final Class93_Sub3 method3141(RSByteBuffer class98_sub22, int i) {
		try {
			Class93 class93 = Class105.method1716(-1, class98_sub22);
			int i_2_ = class98_sub22.readInt(-2);
			int i_3_ = -102 / ((-42 - i) / 35);
			int i_4_ = class98_sub22.readInt(-2);
			return new Class93_Sub3(((Class93) class93).aClass63_3509, ((Class93) class93).aClass110_3511, ((Class93) class93).anInt3505, ((Class93) class93).anInt3507, ((Class93) class93).anInt3514, ((Class93) class93).anInt3504, ((Class93) class93).anInt3508, ((Class93) class93).anInt3506, ((Class93) class93).anInt3513, i_2_, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qe.A(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	Class246_Sub10(int i) {
		try {
			((Class246_Sub10) this).anInt5151 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qe.<init>(" + i + ')');
		}
	}
}
