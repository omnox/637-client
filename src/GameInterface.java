
/* Class98_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class GameInterface extends Node {
	int interfaceID;
	int interfaceClickThrough;
	static float aFloat3948;
	static Class215 aClass215_3949 = new Class215();
	static Frame aFrame3950;
	static int anInt3951;
	static int anInt3952 = 0;

	public static void method1161(int i) {
		try {
			IncomingOpcode.CS2StringOpcode = null;
			aClass215_3949 = null;
			if (i != 0)
				method1161(-120);
			aFrame3950 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hr.B(" + i + ')');
		}
	}

	static final void method1162(int i, int i_0_, int i_1_, Class var_class) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_];
		if (class172 != null) {
			for (Class154 class154 = ((Class172) class172).aClass154_1325; class154 != null; class154 = ((Class154) class154).aClass154_1233) {
				Class246_Sub3_Sub4 class246_sub3_sub4 = ((Class154) class154).aClass246_Sub3_Sub4_1232;
				if (var_class.isAssignableFrom(class246_sub3_sub4.getClass()) && (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158 == i_0_) && (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157 == i_1_)) {
					Class99.method1687(class246_sub3_sub4, false);
					break;
				}
			}
		}
	}

	static boolean method1163(boolean bool, boolean bool_2_) {
		try {
			return bool | bool_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hr.C(" + bool + ',' + bool_2_ + ')'));
		}
	}

	public GameInterface() {
		/* empty */
	}
}
