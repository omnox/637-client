/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class162 {
	static Class162 aClass162_1262 = new Class162(1);
	int anInt1263;
	static Class162 aClass162_1264 = new Class162(2);
	static Class162 aClass162_1265 = new Class162(4);
	static Class162 aClass162_1266 = new Class162(1);
	static Class162 aClass162_1267 = new Class162(2);
	static Class162 aClass162_1268 = new Class162(4);
	static Class162 aClass162_1269 = new Class162(2);
	static Class162 aClass162_1270 = new Class162(4);
	static int anInt1271;
	static GameInterfaceData draggedOnComponent = null;

	static final void method2516(int i) {
		try {
			if (i >= -86)
				method2518(-36, -66, -17, -34);
			Class331.aClass98_Sub46_Sub8_2803 = new Class98_Sub46_Sub8((TextResources.CANCEL.get_text(Class374.anInt3159)), "", Class21_Sub2.anInt5387, 1012, -1, 0L, 0, 0, true, false, 0L, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kq.A(" + i + ')');
		}
	}

	public static void method2517(int i) {
		try {
			aClass162_1265 = null;
			aClass162_1264 = null;
			aClass162_1266 = null;
			aClass162_1269 = null;
			aClass162_1268 = null;
			aClass162_1267 = null;
			draggedOnComponent = null;
			aClass162_1262 = null;
			int i_0_ = 62 / ((34 - i) / 51);
			aClass162_1270 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kq.B(" + i + ')');
		}
	}

	static final void method2518(int i, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				if (i_1_ != 1011) {
					if (i_1_ == 1003)
						ClientScript2Runtime.method3152(Class336.aClass105_2829, i_3_, i_2_);
					else if (i_1_ == 1001)
						ClientScript2Runtime.method3152(Class98_Sub46_Sub2.aClass105_5951, i_3_, i_2_);
					else if (i_1_ == 1010)
						ClientScript2Runtime.method3152(Class60.aClass105_474, i_3_, i_2_);
					else if (i_1_ == 1004)
						ClientScript2Runtime.method3152(Class308.aClass105_2576, i_3_, i_2_);
				} else
					ClientScript2Runtime.method3152(Class142.aClass105_1159, i_3_, i_2_);
				if (i == -1004)
					break;
				aClass162_1270 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kq.C(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kq.toString(" + ')');
		}
	}

	private Class162(int i) {
		try {
			this.anInt1263 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kq.<init>(" + i + ')');
		}
	}
}
