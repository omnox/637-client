/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class114 {
	int anInt956;
	String aString957;
	static int[] anIntArray958 = new int[3];

	static final boolean method2147(char c, int i) {
		try {
			if (i <= 104)
				return true;
			if (((c ^ 0xffffffff) > -49 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hga.A(" + c + ',' + i + ')');
		}
	}

	static final void method2148() {
		for (int i = 0; i < Class347.anInt2907; i++) {
			Class246_Sub3_Sub4 class246_sub3_sub4 = Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i];
			Class99.method1687(class246_sub3_sub4, true);
			Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i] = null;
		}
		Class347.anInt2907 = 0;
	}

	static final Class267 method2149(int i, int i_0_) {
		try {
			int i_1_ = 101 / ((3 - i_0_) / 47);
			Class267 class267 = new Class267(i, false);
			return class267;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hga.C(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method2150(int i) {
		do {
			try {
				anIntArray958 = null;
				if (i == 0)
					break;
				anIntArray958 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hga.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class244 method2151(int i, boolean bool, ha var_ha, boolean bool_2_) {
		try {
			if ((i ^ 0xffffffff) == 0)
				return null;
			if (Class2.anIntArray70 != null) {
				for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class2.anIntArray70.length ^ 0xffffffff)); i_3_++) {
					if (Class2.anIntArray70[i_3_] == i)
						return Class242.aClass244Array1851[i_3_];
				}
			}
			Class244 class244 = (Class244) Class232.aClass79_1740.get((long) i);
			if (class244 != null) {
				if (bool && ((Class244) class244).aClass197_1858 == null) {
					Class197 class197 = Class119_Sub1.method2182((Class64_Sub17.aClass207_3687), true, i);
					if (class197 == null)
						return null;
					((Class244) class244).aClass197_1858 = class197;
				}
				return class244;
			}
			Class324[] class324s = Class324.method3684(Class64_Sub16.aClass207_3683, i);
			if (class324s == null)
				return null;
			if (bool_2_ != true)
				method2149(-104, 72);
			Class197 class197 = Class119_Sub1.method2182(Class64_Sub17.aClass207_3687, true, i);
			if (class197 == null)
				return null;
			if (!bool)
				class244 = new Class244(var_ha.method1804(class197, class324s, true));
			else
				class244 = new Class244(var_ha.method1804(class197, class324s, true), class197);
			Class232.aClass79_1740.put((long) i, class244);
			return class244;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hga.B(" + i + ',' + bool + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool_2_ + ')'));
		}
	}
}
