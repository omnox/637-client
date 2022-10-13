/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.kg;

final class Class125 implements Interface2_Impl2 {
	private Class162 aClass162_5344;
	private int anInt5345;
	private ha_Sub3_Sub1 aHa_Sub3_Sub1_5346;
	private boolean aBoolean5347;
	private boolean aBoolean5348 = false;
	private int anInt5349;
	IDirect3DIndexBuffer anIDirect3DIndexBuffer5350;

	public final Buffer method78(boolean bool, int i) {
		Buffer buffer;
		try {
			if (((Class125) this).anIDirect3DIndexBuffer5350 == null)
				return null;
			bool &= aBoolean5347;
			if (!aBoolean5348 && kg.a(-21593, (((Class125) this).anIDirect3DIndexBuffer5350.Lock(0, anInt5345, bool ? 8192 : 0, (((ha_Sub3_Sub1) aHa_Sub3_Sub1_5346).aGeometryBuffer6086))))) {
				aBoolean5348 = true;
				return ((ha_Sub3_Sub1) aHa_Sub3_Sub1_5346).aGeometryBuffer6086;
			}
			if (i > -79)
				anInt5349 = -35;
			buffer = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return buffer;
	}

	public final int method2(int i) {
		int i_0_;
		try {
			if (i != 200)
				return -80;
			i_0_ = anInt5349;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	public final Class162 method77(int i) {
		Class162 class162;
		try {
			if (i != -15448)
				method2(-126);
			class162 = aClass162_5344;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class162;
	}

	public final void method72(boolean bool) {
		try {
			if (bool)
				method2(71);
			if (null != ((Class125) this).anIDirect3DIndexBuffer5350) {
				((Class125) this).anIDirect3DIndexBuffer5350.b(31);
				((Class125) this).anIDirect3DIndexBuffer5350 = null;
			}
			anInt5345 = 0;
			anInt5349 = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean method79(byte i) {
		boolean bool;
		try {
			int i_1_ = -29 / ((-46 - i) / 32);
			if (aBoolean5348 && kg.a(-21593, ((Class125) this).anIDirect3DIndexBuffer5350.Unlock())) {
				aBoolean5348 = false;
				return true;
			}
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	public final void method76(int i, int i_2_) {
		do {
			try {
				anInt5349 = i * ((Class162) aClass162_5344).anInt1263;
				if (anInt5349 > anInt5345) {
					int i_3_ = 8;
					int i_4_;
					if (!aBoolean5347)
						i_4_ = 1;
					else {
						i_4_ = 0;
						i_3_ |= 0x200;
					}
					if (((Class125) this).anIDirect3DIndexBuffer5350 != null)
						((Class125) this).anIDirect3DIndexBuffer5350.b(i_2_ + -20747);
					((Class125) this).anIDirect3DIndexBuffer5350 = (((ha_Sub3_Sub1) aHa_Sub3_Sub1_5346).anIDirect3DDevice6098.a(anInt5349, i_3_, (aClass162_5344 == Class162.aClass162_1267 ? 101 : 102), i_4_, ((Class125) this).anIDirect3DIndexBuffer5350));
					anInt5345 = anInt5349;
				}
				if (i_2_ == 20779)
					break;
				method78(true, 102);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class125(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class162 class162, boolean bool) {
		try {
			aClass162_5344 = class162;
			aHa_Sub3_Sub1_5346 = var_ha_Sub3_Sub1;
			aBoolean5347 = bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
