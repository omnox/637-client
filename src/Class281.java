/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;

final class Class281 {
	byte aByte2113;
	short aShort2114;
	int anInt2115;
	int anInt2116;
	static byte[][][] tileSettings;
	boolean aBoolean2118;
	short aShort2119;
	int anInt2120;
	int anInt2121;
	int anInt2122;
	short aShort2123;

	static final void method3331(boolean bool, Frame frame, Class88 class88) {
		try {
			for (;;) {
				Class143 class143 = class88.method862(-3470, frame);
				while (class143.anInt1163 == 0)
					Class246_Sub7.method3131(0, 10L);
				if (class143.anInt1163 == 1)
					break;
				Class246_Sub7.method3131(0, 100L);
			}
			frame.setVisible(bool);
			frame.dispose();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ri.C(" + bool + ',' + (frame != null ? "{...}" : "null") + ',' + (class88 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3332(int i) {
		try {
			if (i != 22011)
				tileSettings = null;
			tileSettings = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ri.B(" + i + ')');
		}
	}

	Class281(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, boolean bool_8_, int i_9_) {
		try {
			this.aShort2119 = (short) i_4_;
			this.anInt2115 = i_2_;
			this.anInt2122 = i_0_;
			this.aByte2113 = (byte) i_7_;
			this.aShort2114 = (short) i_5_;
			this.anInt2121 = i;
			this.aBoolean2118 = bool_8_;
			this.aShort2123 = (short) i_3_;
			this.anInt2120 = i_1_;
			this.anInt2116 = i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ri.<init>(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + bool_8_ + ',' + i_9_ + ')'));
		}
	}

	static final Class246_Sub3_Sub2 method3333(int i, int i_10_, int i_11_) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_10_][i_11_];
		if (class172 == null)
			return null;
		Class246_Sub3_Sub2 class246_sub3_sub2 = class172.aClass246_Sub3_Sub2_1331;
		class172.aClass246_Sub3_Sub2_1331 = null;
		Class129.method2227(class246_sub3_sub2);
		return class246_sub3_sub2;
	}
}
