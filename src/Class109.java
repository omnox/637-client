/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.math.BigInteger;

final class Class109 {
	static int anInt926 = -1;
	private BigInteger aBigInteger927;
	private Class135 aClass135_928;
	private BigInteger aBigInteger929;
	private RSByteBuffer aClass98_Sub22_930;
	private Class339_Sub1[] aClass339_Sub1Array931;
	private Class98_Sub46_Sub13_Sub1 aClass98_Sub46_Sub13_Sub1_932;
	static boolean aBoolean933;
	static boolean aBoolean934 = false;
	private Class253 aClass253_935;

	static final ha method1732(int i, byte i_0_, int i_1_, Canvas canvas, d var_d) {
		try {
			return new oa(canvas, var_d, i, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gu.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (canvas != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class197 method1733(byte i, int i_3_, int i_4_, RuneScapeCache class207) {
		try {
			byte[] is = class207.readArchive(i_3_, i_4_);
			if (is == null)
				return null;
			if (i <= 108)
				return null;
			return new Class197(is);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gu.E(" + i + ',' + i_3_ + ',' + i_4_ + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class339_Sub1 method1734(int i, Class17 class17, Class17 class17_5_, int i_6_) {
		try {
			if (i != 72)
				return null;
			return method1738(true, class17_5_, i_6_, class17, 96);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gu.F(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + (class17_5_ != null ? "{...}" : "null") + ',' + i_6_ + ')'));
		}
	}

	final boolean method1735(int i) {
		try {
			if (aClass98_Sub22_930 != null)
				return true;
			if (aClass98_Sub46_Sub13_Sub1_932 == null) {
				if (aClass135_928.method2253(i + 108))
					return false;
				aClass98_Sub46_Sub13_Sub1_932 = aClass135_928.method2252(255, (byte) 0, 255, 112, true);
			}
			if (aClass98_Sub46_Sub13_Sub1_932.aBoolean6038)
				return false;
			RSByteBuffer class98_sub22 = new RSByteBuffer(aClass98_Sub46_Sub13_Sub1_932.method1591(87));
			class98_sub22.position = 5;
			int i_7_ = class98_sub22.readUnsignedByte();
			class98_sub22.position += 72 * i_7_;
			byte[] is = (new byte[(class98_sub22.data.length - class98_sub22.position)]);
			class98_sub22.method1190(is, true, is.length, 0);
			//	    byte[] is_8_;
			//	    if (aBigInteger927 != null && aBigInteger929 != null) {
			//		BigInteger biginteger = new BigInteger(is);
			//		BigInteger biginteger_9_
			//		    = biginteger.modPow(aBigInteger927, aBigInteger929);
			//		is_8_ = biginteger_9_.toByteArray();
			//	    } else
			//		is_8_ = is;
			/*
			 * if (is_8_.length != 65) throw new RuntimeException();
			 */
			//	    byte[] is_10_
			//		= Class64_Sub11.method595(i, (byte) -128,
			//					  (((Class98_Sub22) class98_sub22)
			//					   .aByteArray3992),
			//					  -5 + (((Class98_Sub22) class98_sub22)
			//						.anInt3991) + -is.length);
			/*
			 * for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -65; i_11_++) { if ((is_10_[i_11_]
			 * ^ 0xffffffff) != (is_8_[i_11_ - -1] ^ 0xffffffff)) throw new
			 * RuntimeException(); }
			 */
			aClass98_Sub22_930 = class98_sub22;
			aClass339_Sub1Array931 = new Class339_Sub1[i_7_];
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gu.A(" + i + ')');
		}
	}

	final void method1736(int i) {
		try {
			if (aClass339_Sub1Array931 != null) {
				for (int i_12_ = i; (i_12_ < aClass339_Sub1Array931.length); i_12_++) {
					if (aClass339_Sub1Array931[i_12_] != null)
						aClass339_Sub1Array931[i_12_].method3797(-1);
				}
				for (int i_13_ = 0; i_13_ < aClass339_Sub1Array931.length; i_13_++) {
					if (aClass339_Sub1Array931[i_13_] != null)
						aClass339_Sub1Array931[i_13_].method3796(7899);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gu.D(" + i + ')');
		}
	}

	static final Class240 method1737(int i) {
		try {
			try {
				return new Class240_Sub1();
			} catch (Throwable throwable) {
				if (i != 72)
					anInt926 = 33;
				try {
					return ((Class240) Class.forName("Class240_Sub2").newInstance());
				} catch (Throwable throwable_14_) {
					return new Class240_Sub3();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gu.C(" + i + ')');
		}
	}

	Class109(Class135 class135, Class253 class253, BigInteger biginteger, BigInteger biginteger_15_) {
		do {
			try {
				aClass135_928 = class135;
				aBigInteger929 = biginteger_15_;
				aBigInteger927 = biginteger;
				aClass253_935 = class253;
				if (aClass135_928.method2253(92))
					break;
				aClass98_Sub46_Sub13_Sub1_932 = aClass135_928.method2252(255, (byte) 0, 255, 105, true);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gu.<init>(" + (class135 != null ? "{...}" : "null") + ',' + (class253 != null ? "{...}" : "null") + ',' + (biginteger != null ? "{...}" : "null") + ',' + (biginteger_15_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final Class339_Sub1 method1738(boolean bool, Class17 class17, int i, Class17 class17_16_, int i_17_) {
		try {
			if (aClass98_Sub22_930 == null)
				throw new RuntimeException();
			if (i < 0 || aClass339_Sub1Array931.length <= i)
				throw new RuntimeException();
			if (aClass339_Sub1Array931[i] != null)
				return aClass339_Sub1Array931[i];
			aClass98_Sub22_930.position = 72 * i - -6;
			int i_18_ = aClass98_Sub22_930.readInt(-2);
			int i_19_ = aClass98_Sub22_930.readInt(-2);
			int i_20_ = 9 / ((i_17_ - 46) / 43);
			byte[] is = new byte[64];
			aClass98_Sub22_930.method1190(is, true, 64, 0);
			Class339_Sub1 class339_sub1 = new Class339_Sub1(i, class17, class17_16_, aClass135_928, aClass253_935, i_18_, is, i_19_, bool);
			aClass339_Sub1Array931[i] = class339_sub1;
			return class339_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gu.G(" + bool + ',' + (class17 != null ? "{...}" : "null") + ',' + i + ',' + (class17_16_ != null ? "{...}" : "null") + ',' + i_17_ + ')'));
		}
	}

	static {
		aBoolean933 = false;
	}
}
