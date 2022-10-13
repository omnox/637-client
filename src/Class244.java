/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class244 {
	Class197 aClass197_1858;
	Class43 aClass43_1859 = null;
	static int anInt1860;
	static Class6 aClass6_1861 = new Class6("WIP", 2);

	static final void method2953(byte i, int minimapX, int minimapY) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(0, -71, 15);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6051 = minimapY;
			class98_sub46_sub17.anInt6054 = minimapX;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pga.B(" + i + ',' + minimapX + ',' + minimapY + ')'));
		}
	}

	Class244(Class43 class43) {
		this.aClass197_1858 = null;
		try {
			this.aClass43_1859 = class43;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pga.<init>(" + (class43 != null ? "{...}" : "null") + ')');
		}
	}

	Class244(Class43 class43, Class197 class197) {
		this.aClass197_1858 = null;
		try {
			this.aClass197_1858 = class197;
			this.aClass43_1859 = class43;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pga.<init>(" + (class43 != null ? "{...}" : "null") + ',' + (class197 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2954(int i) {
		try {
			if (i <= 125)
				aClass6_1861 = null;
			aClass6_1861 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pga.A(" + i + ')');
		}
	}
}
