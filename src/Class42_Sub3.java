/* Class42_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

import jaggl.OpenGL;

final class Class42_Sub3 extends Class42 {
	static Canvas aCanvas5361;
	private int anInt5362;
	static Class348 aClass348_5363 = new Class348(6, 0, 4, 2);
	static Class111 aClass111_5364;
	static int anInt5365 = 0;
	static int anInt5366;

	public final void method3(byte i) {
		try {
			if (i > -117)
				aCanvas5361 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pea.B(" + i + ')');
		}
	}

	public static void method392(int i) {
		try {
			aClass111_5364 = null;
			int i_0_ = -100 / ((i - 72) / 39);
			aCanvas5361 = null;
			aClass348_5363 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pea.D(" + i + ')');
		}
	}

	final void method393(int i, boolean bool) {
		try {
			if (i == 3552) {
				((Class42) this).aHa_Sub1_3227.method1863(1, this);
				OpenGL.glTexParameteri(((Class42) this).anInt3226, 10242, !bool ? 33071 : 10497);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pea.C(" + i + ',' + bool + ')');
		}
	}

	static final RuneScapeCache method394(int i, boolean bool, int i_1_, int i_2_) {
		try {
			Class17 class17 = null;
			if (Class98_Sub37.aClass225_4178 != null)
				class17 = new Class17(i_2_, Class98_Sub37.aClass225_4178, Class55.aClass225Array444[i_2_], 1000000);
			Class100.aClass339_Sub1Array844[i_2_] = Class161.aClass109_1261.method1734(72, Class29.aClass17_298, class17, i_2_);
			if (i >= -41)
				method394(-63, false, 100, 8);
			Class100.aClass339_Sub1Array844[i_2_].method3793(107);
			return new RuneScapeCache(Class100.aClass339_Sub1Array844[i_2_], bool, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pea.A(" + i + ',' + bool + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	Class42_Sub3(ha_Sub1 var_ha_Sub1, int i, int i_3_, byte[] is, int i_4_) {
		super(var_ha_Sub1, 3552, i, i_3_, false);
		try {
			anInt5362 = i_3_;
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage1Dub(((Class42) this).anInt3226, 0, ((Class42) this).anInt3230, anInt5362, 0, i_4_, 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
			this.method372(-28003, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pea.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ',' + i_4_ + ')'));
		}
	}
}
