/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class106 {
	static long aLong904;
	int anInt905;
	int anInt906;
	int anInt907;
	int anInt908;

	final Class106 method1719(int i, int i_0_) {
		try {
			if (i_0_ > -100)
				return null;
			return new Class106(((Class106) this).anInt905, i, ((Class106) this).anInt908, ((Class106) this).anInt907);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gn.A(" + i + ',' + i_0_ + ')');
		}
	}

	Class106(int i, int i_1_, int i_2_, int i_3_) {
		try {
			((Class106) this).anInt906 = i_1_;
			((Class106) this).anInt907 = i_3_;
			((Class106) this).anInt908 = i_2_;
			((Class106) this).anInt905 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gn.<init>(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}
}
