
/* Class98_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class98_Sub12 extends Node {
	int anInt3871;
	static int anInt3872;
	int anInt3873;
	int anInt3874;
	int anInt3875;
	int anInt3876;
	boolean aBoolean3878;
	static int anInt3879;

	static final int method1128(Class65 class65, int i) {
		try {
			if (Class300.aClass65_2499 != class65) {
				if (Class98_Sub43_Sub3.aClass65_5926 != class65) {
					if (IncomingOpcode.aClass65_459 == class65)
						return 34168;
					if (class65 == Class64_Sub16.aClass65_3681)
						return 34166;
				} else
					return 34167;
			} else
				return 5890;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("er.A(" + (class65 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method1129(boolean bool) {
		try {
			if (bool != false)
				method1129(false);
			IncomingOpcode.aClass58_3877 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "er.B(" + bool + ')');
		}
	}

	static final void method1130(int i) {
		do {
			try {
				if (Class177.anInt1376 != 9) {
					if (Class177.anInt1376 == 5 || Class177.anInt1376 == 6)
						Class61.method538(3, false);
					else if (Class177.anInt1376 == 12)
						Class61.method538(3, false);
				} else
					Class61.method538(5, false);
				if (i == 27089)
					break;
				method1130(-66);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "er.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1131(int i, int i_1_, String string) {
		try {
			if (Class98_Sub43_Sub2.aClass88_5907.aBoolean682) {
				Class98_Sub46_Sub10.aClass354_6011 = new Class354();
				Class98_Sub46_Sub10.aClass354_6011.aString3016 = string;
				Class98_Sub46_Sub10.aClass354_6011.anInt3011 = i_1_;
				if (Class43.aClass196_375 != Class64_Sub29.aClass196_3720) {
					Class98_Sub46_Sub10.aClass354_6011.anInt3012 = (Class98_Sub46_Sub10.aClass354_6011.anInt3011) + 50000;
					Class98_Sub46_Sub10.aClass354_6011.anInt3015 = (Class98_Sub46_Sub10.aClass354_6011.anInt3011) + 40000;
				}
				if (Class98_Sub28_Sub1.aClass53_Sub1Array5805.length > i_1_ && Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_1_] != null)
					Class98_Sub46.anInt4260 = Class98_Sub28_Sub1.aClass53_Sub1Array5805[i_1_].anInt427;
				return true;
			}
			String string_2_ = "";
			if (Class64_Sub29.aClass196_3720 != Class43.aClass196_375)
				string_2_ = ":" + (i_1_ - -7000);
			String string_3_ = "";
			if (Class89.aString716 != null)
				string_3_ = "/p=" + Class89.aString716;
			String string_4_ = ("http://" + string + string_2_ + "/l=" + Class374.anInt3159 + "/a=" + Class98_Sub10_Sub15.anInt5619 + string_3_ + "/j" + (!Class76_Sub7.aBoolean3761 ? "0" : "1") + ",o" + (!Class133.aBoolean3456 ? "0" : "1") + ",a2");
			if (i != -8804)
				method1129(false);
			try {
				Class315.aClient3529.getAppletContext().showDocument(new URL(string_4_), "_self");
			} catch (Exception exception) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("er.C(" + i + ',' + i_1_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class98_Sub12(int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool) {
		try {
			this.aBoolean3878 = bool;
			this.anInt3876 = i;
			this.anInt3875 = i_7_;
			this.anInt3873 = i_6_;
			this.anInt3871 = i_8_;
			this.anInt3874 = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("er.<init>(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ')'));
		}
	}
}
