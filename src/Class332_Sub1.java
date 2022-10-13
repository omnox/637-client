/* Class332_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

import jaggl.OpenGL;

final class Class332_Sub1 extends Class332 {
	private int anInt5400 = 0;
	private boolean aBoolean5401;
	private int anInt5402 = 0;
	private Class42_Sub1_Sub1 aClass42_Sub1_Sub1_5403;
	private int anInt5404;
	private int anInt5405;
	private ha_Sub1 aHa_Sub1_5406;
	private Class42_Sub1_Sub1 aClass42_Sub1_Sub1_5407;
	private int anInt5408;
	static Object anObject5409;

	final void method3728(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			int i_6_ = i_1_ + i;
			int i_7_ = i_0_ - -i_2_;
			aClass42_Sub1_Sub1_5407.method372(-28003, false);
			aHa_Sub1_5406.method1829((byte) -117);
			aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
			aHa_Sub1_5406.method1870((byte) -90, i_5_);
			aHa_Sub1_5406.method1896(260, i_3_);
			OpenGL.glColor4ub((byte) (i_4_ >> 16), (byte) (i_4_ >> 8), (byte) i_4_, (byte) (i_4_ >> 24));
			if (!aClass42_Sub1_Sub1_5407.aBoolean6211 || aBoolean5401) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef((float) anInt5404, (float) anInt5405, 0.0F);
				int i_8_ = method3737();
				int i_9_ = method3749();
				int i_10_ = i_0_ + (aClass42_Sub1_Sub1_5407.anInt6204);
				OpenGL.glBegin(7);
				int i_11_ = i_0_;
				while (i_7_ >= i_10_) {
					int i_12_ = ((aClass42_Sub1_Sub1_5407.anInt6207) + i);
					int i_13_ = i;
					for (/**/; i_6_ >= i_12_; i_12_ += i_8_) {
						OpenGL.glTexCoord2f(0.0F, (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_13_, i_11_);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(i_13_, i_10_);
						OpenGL.glTexCoord2f((aClass42_Sub1_Sub1_5407.aFloat6205), 0.0F);
						OpenGL.glVertex2i(i_12_, i_10_);
						OpenGL.glTexCoord2f((aClass42_Sub1_Sub1_5407.aFloat6205), (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_12_, i_11_);
						i_13_ += i_8_;
					}
					if (i_13_ < i_6_) {
						float f = ((float) (i_6_ - i_13_) * (aClass42_Sub1_Sub1_5407.aFloat6205) / (float) aClass42_Sub1_Sub1_5407.anInt6207);
						OpenGL.glTexCoord2f(0.0F, (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_13_, i_11_);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(i_13_, i_10_);
						OpenGL.glTexCoord2f(f, 0.0F);
						OpenGL.glVertex2i(i_6_, i_10_);
						OpenGL.glTexCoord2f(f, (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_6_, i_11_);
					}
					i_10_ += i_9_;
					i_11_ += i_9_;
				}
				if (i_11_ < i_7_) {
					float f = ((float) (aClass42_Sub1_Sub1_5407.anInt6204 + i_11_ + -i_7_) * (aClass42_Sub1_Sub1_5407.aFloat6209) / (float) aClass42_Sub1_Sub1_5407.anInt6204);
					int i_14_ = ((aClass42_Sub1_Sub1_5407.anInt6207) + i);
					int i_15_ = i;
					while (i_14_ <= i_6_) {
						OpenGL.glTexCoord2f(0.0F, (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_15_, i_11_);
						OpenGL.glTexCoord2f(0.0F, f);
						OpenGL.glVertex2i(i_15_, i_7_);
						OpenGL.glTexCoord2f((aClass42_Sub1_Sub1_5407.aFloat6205), f);
						OpenGL.glVertex2i(i_14_, i_7_);
						OpenGL.glTexCoord2f((aClass42_Sub1_Sub1_5407.aFloat6205), (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_14_, i_11_);
						i_14_ += i_8_;
						i_15_ += i_8_;
					}
					if (i_6_ > i_15_) {
						float f_16_ = ((float) (i_6_ + -i_15_) * (aClass42_Sub1_Sub1_5407.aFloat6205) / (float) aClass42_Sub1_Sub1_5407.anInt6207);
						OpenGL.glTexCoord2f(0.0F, (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_15_, i_11_);
						OpenGL.glTexCoord2f(0.0F, f);
						OpenGL.glVertex2i(i_15_, i_7_);
						OpenGL.glTexCoord2f(f_16_, f);
						OpenGL.glVertex2i(i_6_, i_7_);
						OpenGL.glTexCoord2f(f_16_, (aClass42_Sub1_Sub1_5407.aFloat6209));
						OpenGL.glVertex2i(i_6_, i_11_);
					}
				}
				OpenGL.glEnd();
				OpenGL.glPopMatrix();
			} else {
				float f = ((float) i_2_ * (aClass42_Sub1_Sub1_5407.aFloat6209) / (float) (aClass42_Sub1_Sub1_5407.anInt6204));
				float f_17_ = (aClass42_Sub1_Sub1_5407.aFloat6205 * (float) i_1_ / (float) (aClass42_Sub1_Sub1_5407.anInt6207));
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, f);
				OpenGL.glVertex2i(i, i_0_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(i, i_7_);
				OpenGL.glTexCoord2f(f_17_, 0.0F);
				OpenGL.glVertex2i(i_6_, i_7_);
				OpenGL.glTexCoord2f(f_17_, f);
				OpenGL.glVertex2i(i_6_, i_0_);
				OpenGL.glEnd();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.K(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	private final void method3750(boolean bool, int i) {
		try {
			if (bool != false)
				method3752(-23);
			aHa_Sub1_5406.method1845(1, 847872872);
			aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
			aHa_Sub1_5406.method1899(7681, 8960, aHa_Sub1_5406.method1892(i, 596294056));
			aHa_Sub1_5406.method1840(1, 768, -58, 34167);
			aHa_Sub1_5406.method1886(770, 0, 34200, 34168);
			aHa_Sub1_5406.method1845(0, 847872872);
			aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5403);
			aHa_Sub1_5406.method1899(7681, 8960, 34479);
			aHa_Sub1_5406.method1840(1, 768, 122, 34166);
			if (anInt5408 != 0) {
				if (anInt5408 != 1) {
					if (anInt5408 == 2)
						aHa_Sub1_5406.method1858(0.5F, 1.0F, 0.5F, 0.0F, -89);
					else if (anInt5408 == 3)
						aHa_Sub1_5406.method1858(128.5F, 128.5F, 128.5F, 0.0F, -40);
				} else
					aHa_Sub1_5406.method1858(1.0F, 0.5F, 0.5F, 0.0F, -59);
			} else
				aHa_Sub1_5406.method1858(0.5F, 0.5F, 1.0F, 0.0F, 108);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.H(" + bool + ',' + i + ')');
		}
	}

	final void method3748(int i, int i_18_, int i_19_, int i_20_, int i_21_) {
		try {
			aClass42_Sub1_Sub1_5407.method372(-28003, false);
			aHa_Sub1_5406.method1829((byte) -104);
			aHa_Sub1_5406.method1870((byte) -110, i_21_);
			OpenGL.glColor4ub((byte) (i_20_ >> 16), (byte) (i_20_ >> 8), (byte) i_20_, (byte) (i_20_ >> 24));
			i_18_ += anInt5405;
			i += anInt5404;
			if (aClass42_Sub1_Sub1_5403 != null) {
				method3750(false, i_19_);
				aClass42_Sub1_Sub1_5403.method372(-28003, false);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
				OpenGL.glTexCoord2f(0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
				OpenGL.glVertex2i(i, i_18_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(i, i_18_ + aClass42_Sub1_Sub1_5407.anInt6204);
				OpenGL.glMultiTexCoord2f(33985, aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
				OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
				OpenGL.glVertex2i(aClass42_Sub1_Sub1_5407.anInt6207 + i, i_18_ + aClass42_Sub1_Sub1_5407.anInt6204);
				OpenGL.glMultiTexCoord2f(33985, aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
				OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
				OpenGL.glVertex2i(aClass42_Sub1_Sub1_5407.anInt6207 + i, i_18_);
				OpenGL.glEnd();
				method3752(-22);
			} else {
				aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
				aHa_Sub1_5406.method1896(260, i_19_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
				OpenGL.glVertex2i(i, i_18_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(i, aClass42_Sub1_Sub1_5407.anInt6204 + i_18_);
				OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
				OpenGL.glVertex2i(aClass42_Sub1_Sub1_5407.anInt6207 + i, aClass42_Sub1_Sub1_5407.anInt6204 + i_18_);
				OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
				OpenGL.glVertex2i(aClass42_Sub1_Sub1_5407.anInt6207 + i, i_18_);
				OpenGL.glEnd();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.E(" + i + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ')'));
		}
	}

	final int method3731() {
		try {
			return aClass42_Sub1_Sub1_5407.anInt6204;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.U(" + ')');
		}
	}

	public static void method3751(int i) {
		try {
			if (i != 5890)
				anObject5409 = null;
			anObject5409 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.G(" + i + ')');
		}
	}

	final void method3745(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		try {
			aClass42_Sub1_Sub1_5407.method372(-28003, (i_28_ & 0x1) != 0);
			aHa_Sub1_5406.method1829((byte) -126);
			aHa_Sub1_5406.method1870((byte) -75, i_27_);
			OpenGL.glColor4ub((byte) (i_26_ >> 16), (byte) (i_26_ >> 8), (byte) i_26_, (byte) (i_26_ >> 24));
			if (!aBoolean5401) {
				if (aClass42_Sub1_Sub1_5403 != null) {
					method3750(false, i_25_);
					aClass42_Sub1_Sub1_5403.method372(-28003, true);
					OpenGL.glBegin(7);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, (aClass42_Sub1_Sub1_5407.aFloat6209));
					OpenGL.glTexCoord2f(0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2i(i, i_22_);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i, i_22_ - -i_24_);
					OpenGL.glMultiTexCoord2f(33985, (aClass42_Sub1_Sub1_5407.aFloat6205), 0.0F);
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
					OpenGL.glVertex2i(i_23_ + i, i_24_ + i_22_);
					OpenGL.glMultiTexCoord2f(33985, (aClass42_Sub1_Sub1_5407.aFloat6205), (aClass42_Sub1_Sub1_5407.aFloat6209));
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2i(i_23_ + i, i_22_);
					OpenGL.glEnd();
					method3752(-119);
				} else {
					aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
					aHa_Sub1_5406.method1896(260, i_25_);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2i(i, i_22_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i, i_24_ + i_22_);
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
					OpenGL.glVertex2i(i + i_23_, i_24_ + i_22_);
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2i(i_23_ + i, i_22_);
					OpenGL.glEnd();
				}
			} else {
				float f = (float) i_23_ / (float) method3737();
				float f_29_ = (float) i_24_ / (float) method3749();
				float f_30_ = f * (float) anInt5404 + (float) i;
				float f_31_ = (float) anInt5405 * f_29_ + (float) i_22_;
				float f_32_ = (f_30_ + (float) (aClass42_Sub1_Sub1_5407.anInt6207) * f);
				float f_33_ = (f_31_ + f_29_ * (float) aClass42_Sub1_Sub1_5407.anInt6204);
				if (aClass42_Sub1_Sub1_5403 != null) {
					method3750(false, i_25_);
					aClass42_Sub1_Sub1_5403.method372(-28003, true);
					OpenGL.glBegin(7);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, (aClass42_Sub1_Sub1_5407.aFloat6209));
					OpenGL.glTexCoord2f(0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2f(f_30_, f_31_);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2f(f_30_, f_33_);
					OpenGL.glMultiTexCoord2f(33985, (aClass42_Sub1_Sub1_5407.aFloat6205), 0.0F);
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
					OpenGL.glVertex2f(f_32_, f_33_);
					OpenGL.glMultiTexCoord2f(33985, (aClass42_Sub1_Sub1_5407.aFloat6205), (aClass42_Sub1_Sub1_5407.aFloat6209));
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2f(f_32_, f_31_);
					OpenGL.glEnd();
					method3752(-69);
				} else {
					aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
					aHa_Sub1_5406.method1896(260, i_25_);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2f(f_30_, f_31_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2f(f_30_, f_33_);
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
					OpenGL.glVertex2f(f_32_, f_33_);
					OpenGL.glTexCoord2f(aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
					OpenGL.glVertex2f(f_32_, f_31_);
					OpenGL.glEnd();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.C(" + i + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ')'));
		}
	}

	final void method3740(int i, int i_34_, int i_35_, int i_36_) {
		try {
			anInt5404 = i;
			anInt5405 = i_34_;
			anInt5402 = i_35_;
			anInt5400 = i_36_;
			aBoolean5401 = (anInt5404 != 0 || anInt5405 != 0 || anInt5402 != 0 || anInt5400 != 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.Q(" + i + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}

	final int method3737() {
		try {
			return (aClass42_Sub1_Sub1_5407.anInt6207 - (-anInt5404 - anInt5402));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.O(" + ')');
		}
	}

	private final void method3752(int i) {
		try {
			aHa_Sub1_5406.method1845(1, 847872872);
			aHa_Sub1_5406.method1863(1, null);
			aHa_Sub1_5406.method1899(8448, 8960, 8448);
			int i_37_ = 120 % ((i - 28) / 43);
			aHa_Sub1_5406.method1840(1, 768, -54, 34168);
			aHa_Sub1_5406.method1886(770, 0, 34200, 5890);
			aHa_Sub1_5406.method1845(0, 847872872);
			aHa_Sub1_5406.method1840(1, 768, -71, 34168);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.I(" + i + ')');
		}
	}

	final void method3742(int i, int i_38_, int i_39_) {
		try {
			OpenGL.glPixelTransferf(3348, 0.5F);
			OpenGL.glPixelTransferf(3349, 0.499F);
			OpenGL.glPixelTransferf(3352, 0.5F);
			OpenGL.glPixelTransferf(3353, 0.499F);
			OpenGL.glPixelTransferf(3354, 0.5F);
			OpenGL.glPixelTransferf(3355, 0.499F);
			aClass42_Sub1_Sub1_5403 = aa_Sub1.method153((byte) 30, aClass42_Sub1_Sub1_5407.anInt6204, aHa_Sub1_5406, aClass42_Sub1_Sub1_5407.anInt6207, i, i_38_);
			anInt5408 = i_39_;
			OpenGL.glPixelTransferf(3348, 1.0F);
			OpenGL.glPixelTransferf(3349, 0.0F);
			OpenGL.glPixelTransferf(3352, 1.0F);
			OpenGL.glPixelTransferf(3353, 0.0F);
			OpenGL.glPixelTransferf(3354, 1.0F);
			OpenGL.glPixelTransferf(3355, 0.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.F(" + i + ',' + i_38_ + ',' + i_39_ + ')'));
		}
	}

	static final void method3753(int i) {
		try {
			if (i <= 36)
				anObject5409 = null;
			if (Class64_Sub16.anInt3680 != 0 && Class64_Sub16.anInt3680 != 5) {
				try {
					int i_40_;
					if (Class151_Sub9.anInt5020 != 0)
						i_40_ = 2000;
					else
						i_40_ = 250;
					if (i_40_ < ++Class139.anInt1087) {
						if (aa_Sub1.aClass123_3561 != null) {
							aa_Sub1.aClass123_3561.method2207(-93);
							aa_Sub1.aClass123_3561 = null;
						}
						if (Class151_Sub9.anInt5020 >= 3) {
							Class64_Sub16.anInt3680 = 0;
							Class369.method3952(-5, (byte) -55);
							return;
						}
						if (Class98_Sub46_Sub20_Sub2.anInt6317 != 2)
							Class299_Sub2.aClass354_5297.method3874(0);
						else
							Class98_Sub46_Sub10.aClass354_6011.method3874(0);
						Class64_Sub16.anInt3680 = 1;
						Class139.anInt1087 = 0;
						Class151_Sub9.anInt5020++;
					}
					if (Class64_Sub16.anInt3680 == 1) {
						if (Class98_Sub46_Sub20_Sub2.anInt6317 != 2)
							Class246_Sub3_Sub3.aClass143_6155 = (Class299_Sub2.aClass354_5297.method3870(-115, Class98_Sub43_Sub2.aClass88_5907));
						else
							Class246_Sub3_Sub3.aClass143_6155 = (Class98_Sub46_Sub10.aClass354_6011.method3870(51, Class98_Sub43_Sub2.aClass88_5907));
						Class64_Sub16.anInt3680 = 2;
					}
					if (Class64_Sub16.anInt3680 == 2) {
						if (Class246_Sub3_Sub3.aClass143_6155.anInt1163 == 2)
							throw new IOException();
						if (Class246_Sub3_Sub3.aClass143_6155.anInt1163 != 1)
							return;
						aa_Sub1.aClass123_3561 = Class196.method2668((Socket) (Class246_Sub3_Sub3.aClass143_6155.anObject1162), (byte) 11, 7500);
						Class246_Sub3_Sub3.aClass143_6155 = null;
						Class49.method477(-5788);
						OutgoingPacket class98_sub11 = Class98_Sub46_Sub9.method1556(false);
						class98_sub11.packet.writeByte(Class298.aClass222_2478.anInt1668);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class95.method920((byte) 115);
						Class64_Sub16.anInt3680 = 3;
					}
					if (Class64_Sub16.anInt3680 == 3) {
						if (!aa_Sub1.aClass123_3561.method2203(-1949, 1))
							return;
						aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
						int i_41_ = (0xff & (IncomingMessages.packetStream.data[0]));
						if (i_41_ != 0) {
							Class64_Sub16.anInt3680 = 0;
							Class369.method3952(i_41_, (byte) -55);
							aa_Sub1.aClass123_3561.method2207(-63);
							aa_Sub1.aClass123_3561 = null;
							Class98_Sub12.method1130(27089);
							return;
						}
						IncomingMessages.packetStream.position = 0;
						RSByteBuffer class98_sub22 = new RSByteBuffer(518);
						int[] is = new int[4];
						is[2] = (int) (Math.random() * 9.9999999E7);
						is[1] = (int) (9.9999999E7 * Math.random());
						is[0] = (int) (Math.random() * 9.9999999E7);
						is[3] = (int) (Math.random() * 9.9999999E7);
						class98_sub22.writeByte(10);
						class98_sub22.writeInt(1571862888, is[0]);
						class98_sub22.writeInt(1571862888, is[1]);
						class98_sub22.writeInt(1571862888, is[2]);
						class98_sub22.writeInt(1571862888, is[3]);
						class98_sub22.method1221(-68, 0L);
						class98_sub22.method1188(Class360.aString3064, (byte) 113);
						class98_sub22.method1221(-96, Class98_Sub10_Sub19.aLong5631);
						class98_sub22.method1221(-71, Class98_Sub42.aLong4238);
						class98_sub22.method1205(Class98_Sub45.aBigInteger4253, true, Class138.aBigInteger1082);
						Class49.method477(-5788);
						OutgoingPacket class98_sub11 = Class98_Sub46_Sub9.method1556(false);
						Class98_Sub22_Sub1 class98_sub22_sub1 = (class98_sub11.packet);
						if (Class98_Sub46_Sub20_Sub2.anInt6317 != 2) {
							class98_sub22_sub1.writeByte((Class298.aClass222_2484.anInt1668));
							class98_sub22_sub1.writeShort(0);
							int i_42_ = (class98_sub22_sub1.position);
							class98_sub22_sub1.writeInt(1571862888, 637);
							class98_sub22_sub1.method1217((class98_sub22.data), class98_sub22.position, -1, 0);
							int i_43_ = (class98_sub22_sub1.position);
							class98_sub22_sub1.method1188((Class98_Sub5.aString3837), (byte) 113);
							class98_sub22_sub1.writeByte(Class4.aClass279_86.anInt2095);
							class98_sub22_sub1.writeByte(Class374.anInt3159);
							ParamType.method2430(class98_sub22_sub1, (byte) 0);
							class98_sub22_sub1.method1188(Class89.aString716, (byte) 113);
							class98_sub22_sub1.writeInt(1571862888, (Class98_Sub10_Sub15.anInt5619));
							Class98_Sub9.method989(class98_sub22_sub1, (byte) 122);
							class98_sub22_sub1.method1235(true, is, i_43_, (class98_sub22_sub1.position));
							class98_sub22_sub1.method1207((byte) 90, -i_42_ + (class98_sub22_sub1.position));
						} else {
							if (Class177.anInt1376 == 13)
								class98_sub22_sub1.writeByte((Class298.aClass222_2483.anInt1668));
							else
								class98_sub22_sub1.writeByte((Class298.aClass222_2481.anInt1668));
							class98_sub22_sub1.writeShort(0);
							int i_44_ = (class98_sub22_sub1.position);
							class98_sub22_sub1.writeInt(1571862888, 637);
							class98_sub22_sub1.method1217((class98_sub22.data), class98_sub22.position, -1, 0);
							int i_45_ = (class98_sub22_sub1.position);
							class98_sub22_sub1.method1188((Class98_Sub5.aString3837), (byte) 113);
							class98_sub22_sub1.writeByte(Class146_Sub2.anInt4855);
							class98_sub22_sub1.writeByte(Class146_Sub2.method2391((byte) 127));
							class98_sub22_sub1.writeShort((Class39_Sub1.anInt3593));
							class98_sub22_sub1.writeShort((Class98_Sub25.anInt4024));
							class98_sub22_sub1.writeByte(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4055.method648((byte) 124));
							ParamType.method2430(class98_sub22_sub1, (byte) 0);
							class98_sub22_sub1.method1188(Class89.aString716, (byte) 113);
							class98_sub22_sub1.writeInt(1571862888, (Class98_Sub10_Sub15.anInt5619));
							RSByteBuffer class98_sub22_46_ = Class98_Sub9.aClass98_Sub27_3856.method1288(true);
							class98_sub22_sub1.writeByte((class98_sub22_46_.position));
							class98_sub22_sub1.method1217((class98_sub22_46_.data), class98_sub22_46_.position, -1, 0);
							s_Sub1.aBoolean5207 = true;
							RSByteBuffer class98_sub22_47_ = (new RSByteBuffer(Exception_Sub1.aClass98_Sub35_47.method1455((byte) 116)));
							Exception_Sub1.aClass98_Sub35_47.method1453((byte) 17, class98_sub22_47_);
							class98_sub22_sub1.method1217((class98_sub22_47_.data), (class98_sub22_47_.data).length, -1, 0);
							class98_sub22_sub1.writeShort(Class75.anInt581);
							class98_sub22_sub1.method1221(-104, Class197.aLong1515);
							class98_sub22_sub1.writeByte(((Class98_Sub10_Sub7.aString5573) == null) ? 0 : 1);
							if (Class98_Sub10_Sub7.aString5573 != null)
								class98_sub22_sub1.method1188(Class98_Sub10_Sub7.aString5573, (byte) 113);
							class98_sub22_sub1.writeByte((Class98_Sub42.method1479("jagtheora", 0) ? 1 : 0));
							Class98_Sub9.method989(class98_sub22_sub1, (byte) 100);
							class98_sub22_sub1.method1235(true, is, i_45_, (class98_sub22_sub1.position));
							class98_sub22_sub1.method1207((byte) 90, (class98_sub22_sub1.position) + -i_44_);
						}
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class95.method920((byte) 80);
						Class331.aClass117_2811 = new Class117(is);
						for (int i_48_ = 0; i_48_ < 4; i_48_++)
							is[i_48_] += 50;
						IncomingMessages.packetStream.method1259(is, 255);
						Class64_Sub16.anInt3680 = 4;
					}
					if (Class64_Sub16.anInt3680 == 4) {
						if (!aa_Sub1.aClass123_3561.method2203(-1949, 1))
							return;
						aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
						int i_49_ = (0xff & (IncomingMessages.packetStream.data[0]));
						if (i_49_ != 21) {
							if (i_49_ == 29)
								Class64_Sub16.anInt3680 = 13;
							else if (i_49_ != 1) {
								if (i_49_ != 2) {
									if (i_49_ == 15) {
										Class65.anInt496 = -2;
										Class64_Sub16.anInt3680 = 14;
									} else {
										if (i_49_ == 23 && Class151_Sub9.anInt5020 < 3) {
											Class151_Sub9.anInt5020++;
											Class64_Sub16.anInt3680 = 1;
											Class139.anInt1087 = 0;
											aa_Sub1.aClass123_3561.method2207(-114);
											aa_Sub1.aClass123_3561 = null;
										} else {
											Class64_Sub16.anInt3680 = 0;
											Class369.method3952(i_49_, (byte) -55);
											aa_Sub1.aClass123_3561.method2207(-113);
											aa_Sub1.aClass123_3561 = null;
											Class98_Sub12.method1130(27089);
											return;
										}
										return;
									}
								} else
									Class64_Sub16.anInt3680 = 8;
							} else {
								Class64_Sub16.anInt3680 = 5;
								Class369.method3952(i_49_, (byte) -55);
								return;
							}
						} else
							Class64_Sub16.anInt3680 = 7;
					}
					if (Class64_Sub16.anInt3680 == 6) {
						Class49.method477(-5788);
						OutgoingPacket class98_sub11 = Class98_Sub46_Sub9.method1556(false);
						Class98_Sub22_Sub1 class98_sub22_sub1 = (class98_sub11.packet);
						class98_sub22_sub1.method1252((byte) -104, Class331.aClass117_2811);
						class98_sub22_sub1.method1261(false, Class298.aClass222_2488.anInt1668);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class95.method920((byte) 115);
						Class64_Sub16.anInt3680 = 4;
					} else if (Class64_Sub16.anInt3680 == 7) {
						if (aa_Sub1.aClass123_3561.method2203(-1949, 1)) {
							aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
							int i_50_ = (IncomingMessages.packetStream.data[0]) & 0xff;
							Class98_Sub48.anInt4277 = 180 + i_50_ * 60;
							Class64_Sub16.anInt3680 = 0;
							Class369.method3952(21, (byte) -55);
							aa_Sub1.aClass123_3561.method2207(-13);
							aa_Sub1.aClass123_3561 = null;
							Class98_Sub12.method1130(27089);
						}
					} else if (Class64_Sub16.anInt3680 == 13) {
						if (aa_Sub1.aClass123_3561.method2203(-1949, 1)) {
							aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
							Class64_Sub16.anInt3680 = 0;
							Class69_Sub1.anInt5330 = (IncomingMessages.packetStream.data[0]) & 0xff;
							Class369.method3952(29, (byte) -55);
							aa_Sub1.aClass123_3561.method2207(-71);
							aa_Sub1.aClass123_3561 = null;
							Class98_Sub12.method1130(27089);
						}
					} else if (Class64_Sub16.anInt3680 == 8) {
						if (aa_Sub1.aClass123_3561.method2203(-1949, 1)) {
							aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
							Class98_Sub46_Sub19.anInt6069 = (IncomingMessages.packetStream.data[0]) & 0xff;
							Class64_Sub16.anInt3680 = 9;
						}
					} else {
						if (Class64_Sub16.anInt3680 == 9) {
							Class98_Sub22_Sub1 class98_sub22_sub1 = IncomingMessages.packetStream;
							if (Class98_Sub46_Sub20_Sub2.anInt6317 == 2) {
								if (!aa_Sub1.aClass123_3561.method2203(-1949, Class98_Sub46_Sub19.anInt6069))
									return;
								aa_Sub1.aClass123_3561.method2208((class98_sub22_sub1.data), 0, 2047, Class98_Sub46_Sub19.anInt6069);
								class98_sub22_sub1.position = 0;
								Player.rights = class98_sub22_sub1.readUnsignedByte();
								Class47.anInt407 = class98_sub22_sub1.readUnsignedByte();
								Class109.aBoolean933 = class98_sub22_sub1.readUnsignedByte() == 1;
								Class98_Sub10_Sub35.aBoolean5732 = (class98_sub22_sub1.readUnsignedByte() == 1);
								Class234.aBoolean1750 = class98_sub22_sub1.readUnsignedByte() == 1;
								ModelDefinitions.aBoolean1401 = class98_sub22_sub1.readUnsignedByte() == 1;
								za_Sub2.anInt6080 = class98_sub22_sub1.readShort();
								Class64_Sub18.aBoolean3690 = class98_sub22_sub1.readUnsignedByte() == 1;
								Class98_Sub46_Sub9.anInt6003 = class98_sub22_sub1.method1227((byte) -1);
								Class79.aBoolean602 = class98_sub22_sub1.readUnsignedByte() == 1;
								Class130.aClass302_1028.method3555((byte) -123, Class79.aBoolean602);
								Class98_Sub46_Sub19.getItemDefs.method2718(-71, Class79.aBoolean602);
								Class4.aClass301_85.method3545(9179409, Class79.aBoolean602);
							} else {
								if (!aa_Sub1.aClass123_3561.method2203(-1949, Class98_Sub46_Sub19.anInt6069))
									return;
								aa_Sub1.aClass123_3561.method2208((class98_sub22_sub1.data), 0, 2047, Class98_Sub46_Sub19.anInt6069);
								class98_sub22_sub1.position = 0;
								Player.rights = class98_sub22_sub1.readUnsignedByte();
								Class47.anInt407 = class98_sub22_sub1.readUnsignedByte();
								Class109.aBoolean933 = class98_sub22_sub1.readUnsignedByte() == 1;
								Class98_Sub10_Sub35.aBoolean5732 = (class98_sub22_sub1.readUnsignedByte() == 1);
								Class234.aBoolean1750 = class98_sub22_sub1.readUnsignedByte() == 1;
								Class48.anInt409 = class98_sub22_sub1.readUShort(false);
								Class64_Sub18.aBoolean3690 = Class48.anInt409 > 0;
								Class98_Sub1.anInt3814 = class98_sub22_sub1.readShort();
								Class93_Sub1.anInt5489 = class98_sub22_sub1.readShort();
								Class98_Sub10_Sub19.anInt5630 = class98_sub22_sub1.readShort();
								Class151_Sub5.anInt4990 = class98_sub22_sub1.readInt(-2);
								Class187.aClass143_1449 = (Class98_Sub43_Sub2.aClass88_5907.method868(Class151_Sub5.anInt4990, 113));
								Class17.anInt203 = class98_sub22_sub1.readUnsignedByte();
								Class98_Sub46.anInt4264 = class98_sub22_sub1.readShort();
								Class93_Sub2.anInt5491 = class98_sub22_sub1.readShort();
								s_Sub1.aBoolean5200 = class98_sub22_sub1.readUnsignedByte() == 1;
								Player.selfPlayer.displayName = Player.selfPlayer.name = Class256_Sub1.aString5157 = class98_sub22_sub1.method1223(-1);// steven
								Class98_Sub43_Sub2.anInt5910 = class98_sub22_sub1.readUnsignedByte();
								Class36.anInt349 = class98_sub22_sub1.readInt(-2);
								Class289.aClass354_2197 = new Class354();
								Class289.aClass354_2197.anInt3011 = class98_sub22_sub1.readShort();
								if ((Class289.aClass354_2197.anInt3011) == 65535)
									Class289.aClass354_2197.anInt3011 = -1;
								class98_sub22_sub1.method1223(-1);
								// ((Class354) Class289.aClass354_2197).aString3016 =
								// class98_sub22_sub1.method1223(-1);//steven
								Class289.aClass354_2197.aString3016 = RS2Loader.mainurl;
								if (Class64_Sub29.aClass196_3720 != Class43.aClass196_375) {
									Class289.aClass354_2197.anInt3012 = 50000 + (Class289.aClass354_2197.anInt3011);
									Class289.aClass354_2197.anInt3015 = 40000 + (Class289.aClass354_2197.anInt3011);
								}
								if ((Class64_Sub29.aClass196_3720 != Class98_Sub43_Sub2.aClass196_5908) && ((Class98_Sub46_Sub10.aClass354_6011.method3873(120, Class98_Sub46_Sub17.aClass354_6050)) || (Class98_Sub46_Sub10.aClass354_6011.method3873(113, Class250.aClass354_1914))))
									Class98_Sub10_Sub25.method1080((byte) 96);
							}
							if ((!Class109.aBoolean933 || Class234.aBoolean1750) && !Class64_Sub18.aBoolean3690) {
								try {
									Class203.method2704("unzap", (Class76_Sub11.anApplet3799), -26978);
								} catch (Throwable throwable) {
									/* empty */
								}
							} else {
								try {
									Class203.method2704("zap", (Class76_Sub11.anApplet3799), -26978);
								} catch (Throwable throwable) {
									if (Class172.aBoolean1321) {
										try {
											// Class76_Sub11.anApplet3799
											// .getAppletContext
											// ().showDocument
											// (new URL(Class76_Sub11
											// .anApplet3799
											// .getCodeBase(),
											// "blank.ws"),
											// "tbi");
										} catch (Exception exception) {
											/* empty */
										}
									}
								}
							}
							if (Class43.aClass196_375 == Class64_Sub29.aClass196_3720) {
								try {
									Class203.method2704("loggedin", (Class76_Sub11.anApplet3799), -26978);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class98_Sub46_Sub20_Sub2.anInt6317 == 2)
								Class64_Sub16.anInt3680 = 11;
							else {
								Class64_Sub16.anInt3680 = 0;
								Class369.method3952(2, (byte) -55);
								Class98_Sub44.method1515(2);
								Class61.method538(7, false);
								IncomingOpcode.currentIncommingOpcode = null;
								return;
							}
						}
						if (Class64_Sub16.anInt3680 == 11) {
							if (!aa_Sub1.aClass123_3561.method2203(-1949, 3))
								return;
							aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 3);
							Class64_Sub16.anInt3680 = 12;
						}
						if (Class64_Sub16.anInt3680 == 12) {
							Class98_Sub22_Sub1 class98_sub22_sub1 = IncomingMessages.packetStream;
							class98_sub22_sub1.position = 0;
							if (class98_sub22_sub1.method1260((byte) 54)) {
								if (!aa_Sub1.aClass123_3561.method2203(-1949, 1))
									return;
								aa_Sub1.aClass123_3561.method2208((class98_sub22_sub1.data), 3, 2047, 1);
							}
							IncomingOpcode.currentIncommingOpcode = (IncomingOpcode.method3629()[class98_sub22_sub1.method1255(0)]);
							Class65.anInt496 = class98_sub22_sub1.readShort();
							Class64_Sub16.anInt3680 = 10;
						}
						if (Class64_Sub16.anInt3680 == 10) {
							if (aa_Sub1.aClass123_3561.method2203(-1949, Class65.anInt496)) {
								aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, Class65.anInt496);
								IncomingMessages.packetStream.position = 0;
								int i_51_ = Class65.anInt496;
								Class64_Sub16.anInt3680 = 0;
								Class369.method3952(2, (byte) -55);
								Class134_Sub1.method2247(-104);
								Class373.method3964((IncomingMessages.packetStream), 15811816);
								Class160.anInt1258 = -1;
								if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1212)
									Class98_Sub36.method1459(-1048016408);
								else
									Class98_Sub41.decodeRegionOpcode(68);
								if (IncomingMessages.packetStream.position != i_51_)
									throw new RuntimeException("lswp pos:" + (IncomingMessages.packetStream.position) + " psize:" + i_51_);
								IncomingOpcode.currentIncommingOpcode = null;
							}
						} else if (Class64_Sub16.anInt3680 == 14) {
							if (Class65.anInt496 == -2) {
								if (!aa_Sub1.aClass123_3561.method2203(-1949, 2))
									return;
								aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 2);
								IncomingMessages.packetStream.position = 0;
								Class65.anInt496 = IncomingMessages.packetStream.readShort();
							}
							if (aa_Sub1.aClass123_3561.method2203(-1949, Class65.anInt496)) {
								aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, Class65.anInt496);
								IncomingMessages.packetStream.position = 0;
								Class64_Sub16.anInt3680 = 0;
								int i_52_ = Class65.anInt496;
								Class369.method3952(15, (byte) -55);
								Class147.method2412(-108);
								Class373.method3964((IncomingMessages.packetStream), 15811816);
								if (IncomingMessages.packetStream.position != i_52_)
									throw new RuntimeException("lswpr pos:" + (IncomingMessages.packetStream.position) + " psize:" + i_52_);
								IncomingOpcode.currentIncommingOpcode = null;
							}
						}
					}
				} catch (IOException ioexception) {
					if (aa_Sub1.aClass123_3561 != null) {
						aa_Sub1.aClass123_3561.method2207(-86);
						aa_Sub1.aClass123_3561 = null;
					}
					if (Class151_Sub9.anInt5020 >= 3) {
						Class64_Sub16.anInt3680 = 0;
						Class369.method3952(-4, (byte) -55);
						Class98_Sub12.method1130(27089);
					} else {
						if (Class98_Sub46_Sub20_Sub2.anInt6317 != 2)
							Class299_Sub2.aClass354_5297.method3874(0);
						else
							Class98_Sub46_Sub10.aClass354_6011.method3874(0);
						Class151_Sub9.anInt5020++;
						Class64_Sub16.anInt3680 = 1;
						Class139.anInt1087 = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.A(" + i + ')');
		}
	}

	final int method3749() {
		try {
			return (anInt5405 + (aClass42_Sub1_Sub1_5407.anInt6204 + anInt5400));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.T(" + ')');
		}
	}

	final void method3733(float f, float f_53_, float f_54_, float f_55_, float f_56_, float f_57_, int i, int i_58_, int i_59_, int i_60_) {
		try {
			if (aBoolean5401) {
				float f_61_ = (float) method3737();
				float f_62_ = (float) method3749();
				float f_63_ = (-f + f_54_) / f_61_;
				float f_64_ = (f_55_ - f_53_) / f_61_;
				float f_65_ = (-f + f_56_) / f_62_;
				float f_66_ = (-f_53_ + f_57_) / f_62_;
				float f_67_ = f_65_ * (float) anInt5405;
				float f_68_ = f_66_ * (float) anInt5405;
				float f_69_ = (float) anInt5404 * f_63_;
				float f_70_ = (float) anInt5404 * f_64_;
				float f_71_ = -f_63_ * (float) anInt5402;
				float f_72_ = (float) anInt5402 * -f_64_;
				float f_73_ = (float) anInt5400 * -f_65_;
				float f_74_ = -f_66_ * (float) anInt5400;
				f_53_ = f_70_ + f_53_ + f_68_;
				f_55_ = f_68_ + (f_55_ + f_72_);
				f = f_69_ + f + f_67_;
				f_56_ = f_73_ + (f_56_ + f_69_);
				f_54_ = f_67_ + (f_71_ + f_54_);
				f_57_ = f_74_ + (f_70_ + f_57_);
			}
			float f_75_ = f_56_ + (-f + f_54_);
			float f_76_ = f_55_ + (-f_53_ + f_57_);
			aClass42_Sub1_Sub1_5407.method372(-28003, (i_60_ & 0x1) != 0);
			aHa_Sub1_5406.method1829((byte) -114);
			aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
			aHa_Sub1_5406.method1870((byte) -117, i_59_);
			aHa_Sub1_5406.method1896(260, i);
			OpenGL.glColor4ub((byte) (i_58_ >> 16), (byte) (i_58_ >> 8), (byte) i_58_, (byte) (i_58_ >> 24));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, (aClass42_Sub1_Sub1_5407.aFloat6209));
			OpenGL.glVertex2f(f, f_53_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2f(f_56_, f_57_);
			OpenGL.glTexCoord2f((aClass42_Sub1_Sub1_5407.aFloat6205), 0.0F);
			OpenGL.glVertex2f(f_75_, f_76_);
			OpenGL.glTexCoord2f((aClass42_Sub1_Sub1_5407.aFloat6205), (aClass42_Sub1_Sub1_5407.aFloat6209));
			OpenGL.glVertex2f(f_54_, f_55_);
			OpenGL.glEnd();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.BA(" + f + ',' + f_53_ + ',' + f_54_ + ',' + f_55_ + ',' + f_56_ + ',' + f_57_ + ',' + i + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ')'));
		}
	}

	final void method3747(float f, float f_77_, float f_78_, float f_79_, float f_80_, float f_81_, int i, aa var_aa, int i_82_, int i_83_) {
		try {
			Class42_Sub1_Sub1 class42_sub1_sub1 = ((aa_Sub3) var_aa).aClass42_Sub1_Sub1_3568;
			if (aBoolean5401) {
				float f_84_ = (float) method3737();
				float f_85_ = (float) method3749();
				float f_86_ = (f_78_ - f) / f_84_;
				float f_87_ = (-f_77_ + f_79_) / f_84_;
				float f_88_ = (f_80_ - f) / f_85_;
				float f_89_ = (-f_77_ + f_81_) / f_85_;
				float f_90_ = (float) anInt5405 * f_88_;
				float f_91_ = (float) anInt5405 * f_89_;
				float f_92_ = f_86_ * (float) anInt5404;
				float f_93_ = (float) anInt5404 * f_87_;
				float f_94_ = (float) anInt5402 * -f_86_;
				float f_95_ = (float) anInt5402 * -f_87_;
				float f_96_ = -f_88_ * (float) anInt5400;
				float f_97_ = (float) anInt5400 * -f_89_;
				f = f + f_92_ + f_90_;
				f_79_ = f_95_ + f_79_ + f_91_;
				f_80_ = f_92_ + f_80_ + f_96_;
				f_78_ = f_78_ + f_94_ + f_90_;
				f_77_ = f_91_ + (f_93_ + f_77_);
				f_81_ = f_97_ + (f_81_ + f_93_);
			}
			float f_98_ = f_78_ - f + f_80_;
			float f_99_ = f_79_ + (f_81_ - f_77_);
			aClass42_Sub1_Sub1_5407.method372(-28003, (i & 0x1) != 0);
			aHa_Sub1_5406.method1829((byte) -98);
			aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
			aHa_Sub1_5406.method1896(260, 1);
			aHa_Sub1_5406.method1845(1, 847872872);
			aHa_Sub1_5406.method1863(1, class42_sub1_sub1);
			aHa_Sub1_5406.method1899(8448, 8960, 7681);
			aHa_Sub1_5406.method1840(0, 768, -65, 34168);
			aHa_Sub1_5406.method1870((byte) -24, 1);
			float f_100_ = (class42_sub1_sub1.aFloat6205 / (float) (class42_sub1_sub1.anInt6207));
			float f_101_ = (class42_sub1_sub1.aFloat6209 / (float) (class42_sub1_sub1.anInt6204));
			OpenGL.glBegin(7);
			OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
			OpenGL.glMultiTexCoord2f(33985, f_100_ * ((float) -i_82_ + f), ((class42_sub1_sub1.aFloat6209) - f_101_ * (f_77_ - (float) i_83_)));
			OpenGL.glVertex2f(f, f_77_);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, (f_80_ - (float) i_82_) * f_100_, (-(f_101_ * ((float) -i_83_ + f_81_)) + class42_sub1_sub1.aFloat6209));
			OpenGL.glVertex2f(f_80_, f_81_);
			OpenGL.glMultiTexCoord2f(33984, aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, ((float) -i_82_ + f_98_) * f_100_, (-((f_99_ - (float) i_83_) * f_101_) + class42_sub1_sub1.aFloat6209));
			OpenGL.glVertex2f(f_98_, f_99_);
			OpenGL.glMultiTexCoord2f(33984, aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
			OpenGL.glMultiTexCoord2f(33985, f_100_ * (f_78_ - (float) i_82_), (-(((float) -i_83_ + f_79_) * f_101_) + class42_sub1_sub1.aFloat6209));
			OpenGL.glVertex2f(f_78_, f_79_);
			OpenGL.glEnd();
			aHa_Sub1_5406.method1840(0, 768, 91, 5890);
			aHa_Sub1_5406.method1896(260, 0);
			aHa_Sub1_5406.method1863(1, null);
			aHa_Sub1_5406.method1845(0, 847872872);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.L(" + f + ',' + f_77_ + ',' + f_78_ + ',' + f_79_ + ',' + f_80_ + ',' + f_81_ + ',' + i + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_82_ + ',' + i_83_ + ')'));
		}
	}

	final void method3741(int[] is) {
		try {
			is[0] = anInt5404;
			is[3] = anInt5400;
			is[1] = anInt5405;
			is[2] = anInt5402;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.S(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method3729(int i, int i_102_, aa var_aa, int i_103_, int i_104_) {
		try {
			aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
			Class42_Sub1_Sub1 class42_sub1_sub1 = var_aa_Sub3.aClass42_Sub1_Sub1_3568;
			aClass42_Sub1_Sub1_5407.method372(-28003, false);
			aHa_Sub1_5406.method1829((byte) -80);
			aHa_Sub1_5406.method1863(1, aClass42_Sub1_Sub1_5407);
			aHa_Sub1_5406.method1896(260, 1);
			aHa_Sub1_5406.method1845(1, 847872872);
			aHa_Sub1_5406.method1863(1, class42_sub1_sub1);
			aHa_Sub1_5406.method1899(8448, 8960, 7681);
			aHa_Sub1_5406.method1840(0, 768, 102, 34168);
			aHa_Sub1_5406.method1870((byte) -59, 1);
			i += anInt5404;
			i_102_ += anInt5405;
			int i_105_ = i - -aClass42_Sub1_Sub1_5407.anInt6207;
			int i_106_ = (i_102_ - -aClass42_Sub1_Sub1_5407.anInt6204);
			float f = (class42_sub1_sub1.aFloat6205 / (float) (class42_sub1_sub1.anInt6207));
			float f_107_ = (class42_sub1_sub1.aFloat6209 / (float) (class42_sub1_sub1.anInt6204));
			float f_108_ = (float) (i + -i_103_) * f;
			float f_109_ = (float) (-i_103_ + i_105_) * f;
			float f_110_ = (-((float) (-i_104_ + i_102_) * f_107_) + class42_sub1_sub1.aFloat6209);
			float f_111_ = (class42_sub1_sub1.aFloat6209 - f_107_ * (float) (-i_104_ + i_106_));
			OpenGL.glBegin(7);
			OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass42_Sub1_Sub1_5407.aFloat6209);
			OpenGL.glMultiTexCoord2f(33985, f_108_, f_110_);
			OpenGL.glVertex2i(i, i_102_);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, f_108_, f_111_);
			OpenGL.glVertex2i(i, (aClass42_Sub1_Sub1_5407.anInt6204) + i_102_);
			OpenGL.glMultiTexCoord2f(33984, aClass42_Sub1_Sub1_5407.aFloat6205, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, f_109_, f_111_);
			OpenGL.glVertex2i((aClass42_Sub1_Sub1_5407.anInt6207) + i, (aClass42_Sub1_Sub1_5407.anInt6204) + i_102_);
			OpenGL.glMultiTexCoord2f(33984, aClass42_Sub1_Sub1_5407.aFloat6205, aClass42_Sub1_Sub1_5407.aFloat6209);
			OpenGL.glMultiTexCoord2f(33985, f_109_, f_110_);
			OpenGL.glVertex2i(i - -aClass42_Sub1_Sub1_5407.anInt6207, i_102_);
			OpenGL.glEnd();
			aHa_Sub1_5406.method1840(0, 768, 87, 5890);
			aHa_Sub1_5406.method1896(260, 0);
			aHa_Sub1_5406.method1863(1, null);
			aHa_Sub1_5406.method1845(0, 847872872);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.D(" + i + ',' + i_102_ + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_103_ + ',' + i_104_ + ')'));
		}
	}

	final void method3736(int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		try {
			if (aHa_Sub1_5406.aBoolean4367) {
				int[] is = aHa_Sub1_5406.na(i_115_, i_116_, i_113_, i_114_);
				if (is != null) {
					for (int i_117_ = 0; i_117_ < is.length; i_117_++)
						is[i_117_] = Class41.method366(is[i_117_], -16777216);
					method3754(i, i_112_, i_113_, i_114_, is, 0, i_113_);
				}
			} else
				aClass42_Sub1_Sub1_5407.method380(i_113_, i, i_112_, i_116_, i_115_, 120, i_114_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.J(" + i + ',' + i_112_ + ',' + i_113_ + ',' + i_114_ + ',' + i_115_ + ',' + i_116_ + ')'));
		}
	}

	private final void method3754(int i, int i_118_, int i_119_, int i_120_, int[] is, int i_121_, int i_122_) {
		try {
			aClass42_Sub1_Sub1_5407.method379(i_120_, is, i_121_, 3656, true, i_118_, i_122_, i_119_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.B(" + i + ',' + i_118_ + ',' + i_119_ + ',' + i_120_ + ',' + (is != null ? "{...}" : "null") + ',' + i_121_ + ',' + i_122_ + ')'));
		}
	}

	final int method3734() {
		try {
			return aClass42_Sub1_Sub1_5407.anInt6207;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ol.AA(" + ')');
		}
	}

	Class332_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_123_, boolean bool) {
		aBoolean5401 = false;
		anInt5405 = 0;
		anInt5404 = 0;
		anInt5408 = 0;
		try {
			aHa_Sub1_5406 = var_ha_Sub1;
			aClass42_Sub1_Sub1_5407 = Class82.method823(i_123_, var_ha_Sub1, i, -97, bool ? 6408 : 6407);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_123_ + ',' + bool + ')'));
		}
	}

	Class332_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_124_, int i_125_, int i_126_) {
		aBoolean5401 = false;
		anInt5405 = 0;
		anInt5404 = 0;
		anInt5408 = 0;
		try {
			aHa_Sub1_5406 = var_ha_Sub1;
			aClass42_Sub1_Sub1_5407 = aa_Sub1.method153((byte) -125, i_126_, var_ha_Sub1, i_125_, i, i_124_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_124_ + ',' + i_125_ + ',' + i_126_ + ')'));
		}
	}

	Class332_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_127_, int[] is, int i_128_, int i_129_) {
		aBoolean5401 = false;
		anInt5405 = 0;
		anInt5404 = 0;
		anInt5408 = 0;
		try {
			aHa_Sub1_5406 = var_ha_Sub1;
			aClass42_Sub1_Sub1_5407 = Class246_Sub9.method3136(var_ha_Sub1, false, is, i, (byte) 120, i_129_, i_128_, i_127_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ol.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_127_ + ',' + (is != null ? "{...}" : "null") + ',' + i_128_ + ',' + i_129_ + ')'));
		}
	}
}
