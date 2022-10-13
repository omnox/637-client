/* Class26_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.kg;

final class Class26_Sub2 extends Class26 implements Interface4_Impl1 {
	private IDirect3DVolumeTexture anIDirect3DVolumeTexture3578;
	private int anInt3579;
	private int anInt3580;
	private int anInt3581;

	public final void method4(byte i, Class200 class200) {
		try {
			super.method4(i, class200);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final IDirect3DBaseTexture method293(byte i) {
		IDirect3DVolumeTexture idirect3dvolumetexture;
		try {
			if (i != 18)
				anInt3580 = 43;
			idirect3dvolumetexture = anIDirect3DVolumeTexture3578;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvolumetexture;
	}

	public final void method5(int i) {
		do {
			try {
				this.aHa_Sub3_Sub1_270.method2077(false, this);
				if (i > 14)
					break;
				anIDirect3DVolumeTexture3578 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class26_Sub2(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class164 class164, int i, int i_0_, int i_1_, byte[] is) {
		super(var_ha_Sub3_Sub1, class164, Class162.aClass162_1266, false, i_1_ * (i * i_0_));
		try {
			anInt3580 = i_0_;
			anInt3581 = i_1_;
			anInt3579 = i;
			anIDirect3DVolumeTexture3578 = (this.aHa_Sub3_Sub1_270.anIDirect3DDevice6098.a(i, i_0_, i_1_, 1, 0, ha_Sub3_Sub1.method2074(-1935, class164, (this.aClass162_271)), 1));
			PixelBuffer pixelbuffer = (this.aHa_Sub3_Sub1_270.aPixelBuffer6095);
			int i_2_ = anIDirect3DVolumeTexture3578.LockBox(0, 0, 0, 0, i, i_0_, i_1_, 0, pixelbuffer);
			if (kg.a(-21593, i_2_)) {
				int i_3_ = (anInt3579 * (this.aClass164_273.anInt1275));
				int i_4_ = i_3_ * anInt3580;
				int i_5_ = pixelbuffer.getSlicePitch();
				if (i_5_ == i_4_)
					pixelbuffer.a(is, 0, 0, anInt3580 * (i_3_ * anInt3581));
				else {
					int i_6_ = pixelbuffer.getRowPitch();
					if (i_3_ == i_6_) {
						for (int i_7_ = 0; i_7_ < anInt3581; i_7_++)
							pixelbuffer.a(is, i_7_ * i_4_, i_7_ * i_5_, i_4_);
					} else {
						for (int i_8_ = 0; i_8_ < anInt3581; i_8_++) {
							for (int i_9_ = 0; (anInt3580 > i_9_); i_9_++)
								pixelbuffer.a(is, i_9_ * i_3_ + i_4_ * i_8_, i_9_ * i_6_ + i_5_ * i_8_, i_3_);
						}
					}
				}
				anIDirect3DVolumeTexture3578.UnlockBox(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
