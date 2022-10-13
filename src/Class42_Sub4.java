/* Class42_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class42_Sub4 extends Class42 {
	private int anInt5367 = -1;
	int anInt5368;
	int anInt5369;
	private int anInt5370 = -1;
	static int anInt5371;
	int anInt5372;

	final void method395(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			this.aHa_Sub1_3227.method1863(1, this);
			OpenGL.glCopyTexSubImage3D(this.anInt3226, i_2_, i_0_, i_6_, i_1_, i, i_3_, i_4_, i_5_);
			OpenGL.glFlush();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qj.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public final void method3(byte i) {
		do {
			try {
				OpenGL.glFramebufferTexture3DEXT(anInt5370, anInt5367, this.anInt3226, 0, 0, 0);
				anInt5370 = -1;
				anInt5367 = -1;
				if (i <= -117)
					break;
				anInt5371 = -122;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qj.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class42_Sub4(ha_Sub1 var_ha_Sub1, int i, int i_7_, int i_8_, int i_9_, byte[] is, int i_10_) {
		super(var_ha_Sub1, 32879, i, i_9_ * i_7_ * i_8_, false);
		try {
			this.anInt5368 = i_9_;
			this.anInt5369 = i_7_;
			this.anInt5372 = i_8_;
			this.aHa_Sub1_3227.method1863(1, this);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage3Dub(this.anInt3226, 0, this.anInt3230, this.anInt5369, this.anInt5372, this.anInt5368, 0, i_10_, 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
			this.method372(-28003, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qj.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (is != null ? "{...}" : "null") + ',' + i_10_ + ')'));
		}
	}

	Class42_Sub4(ha_Sub1 var_ha_Sub1, int i, int i_11_, int i_12_, int i_13_) {
		super(var_ha_Sub1, 32879, i, i_13_ * (i_11_ * i_12_), false);
		try {
			this.anInt5369 = i_11_;
			this.anInt5368 = i_13_;
			this.anInt5372 = i_12_;
			this.aHa_Sub1_3227.method1863(1, this);
			OpenGL.glTexImage3Dub(this.anInt3226, 0, this.anInt3230, this.anInt5369, this.anInt5372, this.anInt5368, 0, Class98_Sub31_Sub2.method1339((this.anInt3230), 124), 5121, null, 0);
			this.method372(-28003, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qj.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}
}
