/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class42 implements Interface3 {
	private int anInt3224;
	private boolean aBoolean3225;
	int anInt3226;
	ha_Sub1 aHa_Sub1_3227;
	private boolean aBoolean3228 = false;
	int anInt3229;
	int anInt3230;
	static short aShort3231 = 1;

	private final void method368(int i) {
		try {
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			do {
				if (aBoolean3228) {
					OpenGL.glTexParameteri(((Class42) this).anInt3226, 10241, !aBoolean3225 ? 9729 : 9987);
					OpenGL.glTexParameteri(((Class42) this).anInt3226, 10240, 9729);
					if (!client.aBoolean3553)
						break;
				}
				OpenGL.glTexParameteri(((Class42) this).anInt3226, 10241, !aBoolean3225 ? 9728 : 9984);
				OpenGL.glTexParameteri(((Class42) this).anInt3226, 10240, 9728);
			} while (false);
			int i_0_ = -52 % ((43 - i) / 43);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cu.Q(" + i + ')');
		}
	}

	final int method369(boolean bool) {
		try {
			if (bool != true)
				method377(57, 44);
			return ((Class42) this).anInt3229;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cu.T(" + bool + ')');
		}
	}

	private final int method370(int i) {
		try {
			int i_1_ = (((Class42) this).aHa_Sub1_3227.method1866(i + 6368, ((Class42) this).anInt3230) * anInt3224);
			if (i != -6462)
				method376((byte) 56, null);
			if (!aBoolean3225)
				return i_1_;
			return i_1_ * 4 / 3;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cu.P(" + i + ')');
		}
	}

	final boolean method371(int i) {
		try {
			if (i <= 31)
				method370(108);
			if (((ha_Sub1) ((Class42) this).aHa_Sub1_3227).aBoolean4460) {
				int i_2_ = method370(-6462);
				((Class42) this).aHa_Sub1_3227.method1863(1, this);
				OpenGL.glGenerateMipmapEXT(((Class42) this).anInt3226);
				aBoolean3225 = true;
				method368(-114);
				method377(113, i_2_);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cu.S(" + i + ')');
		}
	}

	final void method372(int i, boolean bool) {
		do {
			try {
				if (!bool == aBoolean3228) {
					aBoolean3228 = bool;
					method368(102);
				}
				if (i == -28003)
					break;
				aShort3231 = (short) 21;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cu.U(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() throws Throwable {
		try {
			method375(true);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cu.finalize(" + ')');
		}
	}

	final void method373(boolean bool, boolean bool_3_) {
		try {
			if (!aBoolean3225 == bool_3_) {
				int i = method370(-6462);
				aBoolean3225 = true;
				method368(-38);
				method377(100, i);
			}
			if (bool != true)
				((Class42) this).anInt3226 = 51;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cu.N(" + bool + ',' + bool_3_ + ')'));
		}
	}

	static final void method374(Map class305_sub1, int i, byte[][] is) {
		try {
			int[] is_4_ = { -1, 0, 0, 0, 0 };
			int i_5_ = is.length;
			for (int i_6_ = i; i_5_ > i_6_; i_6_++) {
				byte[] is_7_ = is[i_6_];
				if (is_7_ != null) {
					RSByteBuffer class98_sub22 = new RSByteBuffer(is_7_);
					int i_8_ = Class121.anIntArray1006[i_6_] >> -908871672;
					int i_9_ = 0xff & Class121.anIntArray1006[i_6_];
					int i_10_ = 64 * i_8_ - Class272.anInt2038;
					int i_11_ = 64 * i_9_ + -aa_Sub2.anInt3562;
					Class128.method2224(i ^ 0x58a8);
					class305_sub1.method3574((byte) 117, i_11_, aa_Sub2.anInt3562, Class272.anInt2038, class98_sub22, i_10_, Class167.aClass243Array1281);
					class305_sub1.method3582(i + 17685, i_11_, i_10_, Class265.aHa1974, class98_sub22, is_4_);
					if (!((MapRegion) class305_sub1).aBoolean2544 && (i_8_ ^ 0xffffffff) == (Class160.anInt1258 / 8 ^ 0xffffffff) && i_9_ == Class275.anInt2047 / 8 && is_4_[0] != -1) {
						s_Sub1.aClass346_5202 = (Class373_Sub2.aClass59_5470.method528(0, is_4_[0], is_4_[2], is_4_[1], Class101.aClass115_857, is_4_[3]));
						Class156_Sub1.anInt3278 = is_4_[4];
					}
				}
			}
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_12_++) {
				int i_13_ = ((Class121.anIntArray1006[i_12_] >> -1224911608) * 64 - Class272.anInt2038);
				int i_14_ = (-aa_Sub2.anInt3562 + (Class121.anIntArray1006[i_12_] & 0xff) * 64);
				byte[] is_15_ = is[i_12_];
				if (is_15_ == null && Class275.anInt2047 < 800) {
					Class128.method2224(22696);
					class305_sub1.method3569(64, true, i_14_, 64, i_13_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cu.O(" + (class305_sub1 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method375(boolean bool) {
		try {
			if (bool == true) {
				if (((Class42) this).anInt3229 > 0) {
					((Class42) this).aHa_Sub1_3227.method1873(method370(-6462), 4, (((Class42) this).anInt3229));
					((Class42) this).anInt3229 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cu.M(" + bool + ')');
		}
	}

	Class42(ha_Sub1 var_ha_Sub1, int i, int i_16_, int i_17_, boolean bool) {
		try {
			((Class42) this).aHa_Sub1_3227 = var_ha_Sub1;
			((Class42) this).anInt3226 = i;
			aBoolean3225 = bool;
			((Class42) this).anInt3230 = i_16_;
			anInt3224 = i_17_;
			OpenGL.glGenTextures(1, Class165.anIntArray1277, 0);
			((Class42) this).anInt3229 = Class165.anIntArray1277[0];
			method377(122, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cu.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ',' + i_17_ + ',' + bool + ')'));
		}
	}

	static final Class300 method376(byte i, RSByteBuffer class98_sub22) {
		try {
			if (i != -12)
				aShort3231 = (short) -15;
			Class300 class300 = new Class300();
			((Class300) class300).quickChatFileID = class98_sub22.readShort();
			((Class300) class300).aClass98_Sub46_Sub11_2498 = Class52.aClass280_3500.method3325(((Class300) class300).quickChatFileID, 96);
			return class300;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cu.L(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method377(int i, int i_18_) {
		try {
			((ha_Sub1) ((Class42) this).aHa_Sub1_3227).anInt4337 -= i_18_;
			if (i <= 88)
				((Class42) this).anInt3226 = 38;
			((ha_Sub1) ((Class42) this).aHa_Sub1_3227).anInt4337 += method370(-6462);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cu.R(" + i + ',' + i_18_ + ')');
		}
	}

	public abstract void method3(byte i);
}
