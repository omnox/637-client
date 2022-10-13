/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;

abstract class Class26 {
	boolean aBoolean269;
	ha_Sub3_Sub1 aHa_Sub3_Sub1_270;
	Class162 aClass162_271;
	Class200 aClass200_272 = Class284_Sub1_Sub1.aClass200_6187;
	Class164 aClass164_273;

	abstract IDirect3DBaseTexture method293(byte i);

	Class26(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class164 class164, Class162 class162, boolean bool, int i) {
		try {
			((Class26) this).aBoolean269 = bool;
			((Class26) this).aClass162_271 = class162;
			((Class26) this).aHa_Sub3_Sub1_270 = var_ha_Sub3_Sub1;
			((Class26) this).aClass164_273 = class164;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	void method4(byte i, Class200 class200) {
		do {
			try {
				((Class26) this).aClass200_272 = class200;
				if (i == -81)
					break;
				((Class26) this).aHa_Sub3_Sub1_270 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
