/* Class26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.kg;

final class Class26_Sub1 extends Class26 implements Interface4_Impl3 {
	private IDirect3DCubeTexture anIDirect3DCubeTexture3576;
	private int anInt3577;

	Class26_Sub1(ha_Sub3_Sub1 var_ha_Sub3_Sub1, int i, boolean bool, int[][] is) {
		super(var_ha_Sub3_Sub1, Class62.aClass164_486, Class162.aClass162_1266, bool && var_ha_Sub3_Sub1.aBoolean6097, i * (i * 6));
		try {
			anInt3577 = i;
			if (!this.aBoolean269)
				anIDirect3DCubeTexture3576 = this.aHa_Sub3_Sub1_270.anIDirect3DDevice6098.a(anInt3577, 1, 0, 21, 1);
			else
				anIDirect3DCubeTexture3576 = this.aHa_Sub3_Sub1_270.anIDirect3DDevice6098.a(anInt3577, 0, 1024, 21, 1);
			PixelBuffer pixelbuffer = (this.aHa_Sub3_Sub1_270.aPixelBuffer6095);
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				int i_1_ = anIDirect3DCubeTexture3576.LockRect(i_0_, 0, 0, 0, anInt3577, anInt3577, 0, pixelbuffer);
				if (kg.a(-21593, i_1_)) {
					int i_2_ = pixelbuffer.getRowPitch();
					if (4 * anInt3577 != i_2_) {
						for (int i_3_ = 0; i_3_ < anInt3577; i_3_++)
							pixelbuffer.a(is[i_0_], anInt3577 * i_3_, i_3_ * i_2_, anInt3577);
					} else
						pixelbuffer.a(is[i_0_], 0, 0, anInt3577 * anInt3577);
					anIDirect3DCubeTexture3576.UnlockRect(i_0_, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method5(int i) {
		try {
			if (i < 14)
				anIDirect3DCubeTexture3576 = null;
			this.aHa_Sub3_Sub1_270.method2078(this, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method4(byte i, Class200 class200) {
		try {
			super.method4(i, class200);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final IDirect3DBaseTexture method293(byte i) {
		IDirect3DCubeTexture idirect3dcubetexture;
		try {
			if (i != 18)
				return null;
			idirect3dcubetexture = anIDirect3DCubeTexture3576;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dcubetexture;
	}
}
