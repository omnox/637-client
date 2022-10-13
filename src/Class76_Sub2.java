
/* Class76_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class76_Sub2 extends Class76 {
	static int anInt3728;
	private Class273 aClass273_3729;
	private ha_Sub3_Sub2 aHa_Sub3_Sub2_3730;
	private Class195 aClass195_3732;
	static RuneScapeCache aClass207_3733;

	final void method743(int i, boolean bool) {
		try {
			if (i < 93)
				method745((byte) -62);
			((Class76) this).aHa_Sub3_585.method2019(Class1.aClass128_64, Class288.aClass128_3381, 22831);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.D(" + i + ',' + bool + ')');
		}
	}

	final void method746(int i, int i_0_, int i_1_) {
		try {
			do {
				if (((Class195) aClass195_3732).aBoolean1501) {
					float f = ((float) ((((ha_Sub3) ((Class76) this).aHa_Sub3_585).anInt4556) % 4000) / 4000.0F);
					((Class76) this).aHa_Sub3_585.method2005(((Class195) aClass195_3732).anInterface4_Impl1_1498, 36);
					OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F, 0.0F, 1.0F);
					if (!client.aBoolean3553)
						break;
				}
				int i_2_ = 16 * (((ha_Sub3) ((Class76) this).aHa_Sub3_585).anInt4556 % 4000) / 4000;
				((Class76) this).aHa_Sub3_585.method2005((((Class195) aClass195_3732).anInterface4_Impl2Array1503[i_2_]), -117);
				OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
			} while (false);
			if (i_1_ > -75)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.E(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method742(int i, int i_3_, Interface4 interface4) {
		do {
			try {
				if (i == 6)
					break;
				method748(52, false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fs.I(" + i + ',' + i_3_ + ',' + (interface4 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method750(int i) {
		do {
			try {
				IncomingOpcode.aClass58_3731 = null;
				aClass207_3733 = null;
				if (i == 0)
					break;
				method751(-105, null, 58, null, -58, 58, 30, -85, -104);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fs.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method751(int i, byte[] is, int i_4_, byte[] is_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			int i_11_ = -(i_9_ >> -1972136990);
			if (i_10_ == 0) {
				i_9_ = -(i_9_ & 0x3);
				for (int i_12_ = -i_4_; (i_12_ ^ 0xffffffff) > -1; i_12_++) {
					for (int i_13_ = i_11_; i_13_ < 0; i_13_++) {
						is[i_8_++] += is_5_[i_6_++];
						is[i_8_++] += is_5_[i_6_++];
						is[i_8_++] += is_5_[i_6_++];
						is[i_8_++] += is_5_[i_6_++];
					}
					for (int i_14_ = i_9_; (i_14_ ^ 0xffffffff) > -1; i_14_++)
						is[i_8_++] += is_5_[i_6_++];
					i_8_ += i_7_;
					i_6_ += i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.G(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_4_ + ',' + (is_5_ != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method748(int i, boolean bool) {
		try {
			OpenGL.glBindProgramARB(34336, ((Class273) aClass273_3729).anInt2040);
			OpenGL.glEnable(34336);
			if (i != 69)
				aClass207_3733 = null;
			((Class76) this).aHa_Sub3_585.method2051(0, -128, IncomingOpcode.aClass65_459);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.B(" + i + ',' + bool + ')');
		}
	}

	final void method739(int i) {
		try {
			((Class76) this).aHa_Sub3_585.method2051(0, -114, Class300.aClass65_2499);
			OpenGL.glBindProgramARB(34336, 0);
			if (i != -2)
				method739(102);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.C(" + i + ')');
		}
	}

	static final boolean requestFlag(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool, int i_21_) {
		try {
			int i_22_ = (((Mobile) Player.selfPlayer).walkQueueX[0]);
			int i_23_ = (((Mobile) Player.selfPlayer).walkQueueZ[0]);
			if (i_22_ < 0 || GameWorld.size_x <= i_22_ || i_23_ < 0 || i_23_ >= GameWorld.size_y)
				return false;
			if (i_18_ > i_20_ || i_20_ >= GameWorld.size_x || i_19_ < 0 || (i_19_ ^ 0xffffffff) <= (GameWorld.size_y ^ 0xffffffff))
				return false;
			int i_24_ = (Applet_Sub1.findPath((Class167.aClass243Array1281[((AnimableEntity) Player.selfPlayer).height_level]), Player.selfPlayer.getSize(), Class76_Sub5.anIntArray3743, i_15_, i, i_19_, i_16_, i_23_, Class117.anIntArray974, bool, i_20_, i_17_, 48, i_22_, i_21_));
			if ((i_24_ ^ 0xffffffff) > -2)
				return false;

			Class269.anInt2024 = Class76_Sub5.anIntArray3743[-1 + i_24_];
			Class246_Sub3_Sub1_Sub2.anInt6251 = Class117.anIntArray974[-1 + i_24_];
			Class365.aBoolean3110 = false;
			RSByteBuffer.method1216(-17470);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.A(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + bool + ',' + i_21_ + ')'));
		}
	}

	Class76_Sub2(ha_Sub3_Sub2 var_ha_Sub3_Sub2, RuneScapeCache class207, Class195 class195) {
		super(var_ha_Sub3_Sub2);
		try {
			aClass195_3732 = class195;
			aHa_Sub3_Sub2_3730 = var_ha_Sub3_Sub2;
			if (class207 == null || !aClass195_3732.method2659(-22382) || !((ha_Sub3_Sub2) aHa_Sub3_Sub2_3730).aBoolean6134)
				aClass273_3729 = null;
			else
				aClass273_3729 = (Class240.method2927(class207.method2739("gl", "transparent_water", -32734), aHa_Sub3_Sub2_3730, 34336, 25246));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + (class195 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method745(byte i) {
		try {
			if (i != 27)
				method751(-3, null, 8, null, 91, 11, -110, 7, 116);
			if (aClass273_3729 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.H(" + i + ')');
		}
	}
}
