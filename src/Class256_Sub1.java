/* Class256_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class256_Sub1 extends Class256 {
	static int[] anIntArray5156 = new int[14];
	static String aString5157;
	static int[] anIntArray5158 = new int[25];
	Class49[] aClass49Array5159;

	public static void method3194(int i) {
		try {
			if (i != 0)
				method3195(116, null);
			aString5157 = null;
			anIntArray5156 = null;
			anIntArray5158 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "su.D(" + i + ')');
		}
	}

	static final boolean method3195(int i, String string) {
		try {
			if (string == null)
				return false;
			for (int i_0_ = i; i_0_ < Class314.anInt2692; i_0_++) {
				if (string.equalsIgnoreCase(Class98_Sub25.aStringArray4026[i_0_]))
					return true;
			}
			if (string.equalsIgnoreCase(Player.selfPlayer.displayName))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("su.B(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class98_Sub47 method3196(byte i) {
		try {
			if (Class278.aClass148_2065 == null || Class98_Sub5.aClass157_3835 == null)
				return null;
			Class98_Sub5.aClass157_3835.method2505((byte) 26, Class278.aClass148_2065);
			Class98_Sub47 class98_sub47 = ((Class98_Sub47) Class98_Sub5.aClass157_3835.method2504((byte) -116));
			if (class98_sub47 == null)
				return null;
			Class24 class24 = Class278.aClass341_2057.method3807(-88, (class98_sub47.anInt4268));
			if (i >= -68)
				method3196((byte) -25);
			if (class24 != null && class24.aBoolean241 && class24.method284(124, Class278.anInterface6_2060))
				return class98_sub47;
			return AnimableEntity.method2979(-76);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "su.C(" + i + ')');
		}
	}

	Class256_Sub1(Class49[] class49s) {
		try {
			this.aClass49Array5159 = class49s;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "su.<init>(" + (class49s != null ? "{...}" : "null") + ')');
		}
	}
}
