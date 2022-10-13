
/* Class98_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

final class Class98_Sub20 extends Node {
	private Class156_Sub1 aClass156_Sub1_3963;
	private NativeHeapBuffer aNativeHeapBuffer3964;
	private s_Sub1 aS_Sub1_3965;
	private Class104 aClass104_3966;
	static Class53_Sub1[] aClass53_Sub1Array3967;
	int anInt3968;
	private ha_Sub1 aHa_Sub1_3969;
	private Stream aStream3970;
	int anInt3971;
	float aFloat3972;
	private int[] anIntArray3973;
	int anInt3974;
	int anInt3975;

	public static void method1166(int i) {
		try {
			if (i == -22268)
				aClass53_Sub1Array3967 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iw.B(" + i + ')');
		}
	}

	final void method1167(int i, boolean bool) {
		try {
			if (bool != true)
				method1171(-17);
			aStream3970.b(3 + i * 4);
			aStream3970.e(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iw.H(" + i + ',' + bool + ')');
		}
	}

	final void method1168(int i, byte i_0_, float f, int i_1_, int i_2_) {
		try {
			if (i_0_ > 64) {
				if ((((Class98_Sub20) this).anInt3968 ^ 0xffffffff) != 0) {
					Class238 class238 = ((ha) aHa_Sub1_3969).aD938.method11(((Class98_Sub20) this).anInt3968, -28755);
					int i_3_ = 0xff & ((Class238) class238).aByte1830;
					if ((i_3_ ^ 0xffffffff) != -1 && ((Class238) class238).aByte1820 != 4) {
						int i_4_;
						if (i >= 0) {
							if (i > 127)
								i_4_ = 16777215;
							else
								i_4_ = 131586 * i;
						} else
							i_4_ = 0;
						if ((i_3_ ^ 0xffffffff) == -257)
							i_1_ = i_4_;
						else {
							int i_5_ = i_3_;
							int i_6_ = 256 - i_3_;
							i_1_ = ((0xff0000 & (i_6_ * (i_1_ & 0xff00) + (i_4_ & 0xff00) * i_5_)) + (((0xff00ff & i_1_) * i_6_ + i_5_ * (0xff00ff & i_4_)) & ~0xff00ff)) >> -191668280;
						}
					}
					int i_7_ = 0xff & ((Class238) class238).aByte1829;
					if ((i_7_ ^ 0xffffffff) != -1) {
						i_7_ += 256;
						int i_8_ = (i_1_ >> -1266724752 & 0xff) * i_7_;
						if ((i_8_ ^ 0xffffffff) < -65536)
							i_8_ = 65535;
						int i_9_ = i_7_ * ((i_1_ & 0xff00) >> 1126487880);
						if ((i_9_ ^ 0xffffffff) < -65536)
							i_9_ = 65535;
						int i_10_ = i_7_ * (i_1_ & 0xff);
						if (i_10_ > 65535)
							i_10_ = 65535;
						i_1_ = ((i_10_ >> 2022380040) + (i_9_ & 0xff00) + (0xff00ca & i_8_ << -1067840792));
					}
				}
				aStream3970.b(4 * i_2_);
				if (f != 1.0F) {
					int i_11_ = i_1_ >> -523059280 & 0xff;
					int i_12_ = (i_1_ & 0xff54) >> -1129896280;
					i_11_ *= f;
					int i_13_ = 0xff & i_1_;
					i_12_ *= f;
					if (i_11_ < 0)
						i_11_ = 0;
					else if (i_11_ > 255)
						i_11_ = 255;
					i_13_ *= f;
					if ((i_12_ ^ 0xffffffff) <= -1) {
						if ((i_12_ ^ 0xffffffff) < -256)
							i_12_ = 255;
					} else
						i_12_ = 0;
					if ((i_13_ ^ 0xffffffff) <= -1) {
						if (i_13_ > 255)
							i_13_ = 255;
					} else
						i_13_ = 0;
					i_1_ = i_12_ << 1129793576 | i_11_ << 1969555312 | i_13_;
				}
				aStream3970.e((byte) (i_1_ >> 367830512));
				aStream3970.e((byte) (i_1_ >> 1207926120));
				aStream3970.e((byte) i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iw.F(" + i + ',' + i_0_ + ',' + f + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method1169(int[] is, byte i, int i_14_) {
		do {
			try {
				if (i == 98) {
					int i_15_ = 0;
					Class98_Sub22_Sub2 class98_sub22_sub2 = ((ha_Sub1) aHa_Sub1_3969).aClass98_Sub22_Sub2_4446;
					((RSByteBuffer) class98_sub22_sub2).position = 0;
					if (!((ha_Sub1) aHa_Sub1_3969).aBoolean4397) {
						for (int i_16_ = 0; i_14_ > i_16_; i_16_++) {
							int i_17_ = is[i_16_];
							int i_18_ = anIntArray3973[i_17_];
							short[] is_19_ = (((s_Sub1) aS_Sub1_3965).aShortArrayArray5196[i_17_]);
							if (i_18_ != 0 && is_19_ != null) {
								int i_20_ = 0;
								int i_21_ = 0;
								while ((i_21_ ^ 0xffffffff) > (is_19_.length ^ 0xffffffff)) {
									if ((1 << i_20_++ & i_18_ ^ 0xffffffff) != -1) {
										class98_sub22_sub2.method1247(is_19_[i_21_++] & 0xffff, 4);
										i_15_++;
										i_15_++;
										class98_sub22_sub2.method1247(is_19_[i_21_++] & 0xffff, 4);
										class98_sub22_sub2.method1247(is_19_[i_21_++] & 0xffff, 4);
										i_15_++;
									} else
										i_21_ += 3;
								}
							}
						}
					} else {
						for (int i_22_ = 0; (i_14_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
							int i_23_ = is[i_22_];
							short[] is_24_ = (((s_Sub1) aS_Sub1_3965).aShortArrayArray5196[i_23_]);
							int i_25_ = anIntArray3973[i_23_];
							if ((i_25_ ^ 0xffffffff) != -1 && is_24_ != null) {
								int i_26_ = 0;
								int i_27_ = 0;
								while (is_24_.length > i_27_) {
									if ((1 << i_26_++ & i_25_ ^ 0xffffffff) != -1) {
										i_15_++;
										class98_sub22_sub2.writeShort(0xffff & is_24_[i_27_++]);
										i_15_++;
										class98_sub22_sub2.writeShort(is_24_[i_27_++] & 0xffff);
										i_15_++;
										class98_sub22_sub2.writeShort(0xffff & is_24_[i_27_++]);
									} else
										i_27_ += 3;
								}
							}
						}
					}
					if (i_15_ <= 0)
						break;
					aClass156_Sub1_3963.method20((byte) -47, ((RSByteBuffer) class98_sub22_sub2).data, ((RSByteBuffer) class98_sub22_sub2).position, 5123);
					aHa_Sub1_3969.method1868(aClass104_3966, ((s_Sub1) aS_Sub1_3965).aClass104_5215, ((s_Sub1) aS_Sub1_3965).aClass104_5224, ((s_Sub1) aS_Sub1_3965).aClass104_5222, i + -98);
					aHa_Sub1_3969.method1897(((Class98_Sub20) this).anInt3968, (0x8 & (((s_Sub1) aS_Sub1_3965).anInt5198) ^ 0xffffffff) != -1, ((((s_Sub1) aS_Sub1_3965).anInt5198) & 0x7 ^ 0xffffffff) != -1, (byte) -70);
					if (((ha_Sub1) aHa_Sub1_3969).aBoolean4366)
						aHa_Sub1_3969.EA(2147483647, ((Class98_Sub20) this).anInt3971, ((Class98_Sub20) this).anInt3974, ((Class98_Sub20) this).anInt3975);
					OpenGL.glMatrixMode(5890);
					OpenGL.glPushMatrix();
					OpenGL.glScalef(1.0F / ((Class98_Sub20) this).aFloat3972, 1.0F / ((Class98_Sub20) this).aFloat3972, 1.0F);
					OpenGL.glMatrixMode(5888);
					aHa_Sub1_3969.method1868(aClass104_3966, ((s_Sub1) aS_Sub1_3965).aClass104_5215, ((s_Sub1) aS_Sub1_3965).aClass104_5224, ((s_Sub1) aS_Sub1_3965).aClass104_5222, 0);
					aHa_Sub1_3969.method1865(i_15_, 4, aClass156_Sub1_3963, false, 0);
					OpenGL.glMatrixMode(5890);
					OpenGL.glPopMatrix();
					OpenGL.glMatrixMode(5888);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("iw.I(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1170(boolean bool, int i) {
		try {
			if (bool == true) {
				aStream3970.c();
				Interface16 interface16 = aHa_Sub1_3969.method1843(4, (byte) 78, aNativeHeapBuffer3964, false, i * 4);
				aClass104_3966 = new Class104(interface16, 5121, 4, 0);
				aNativeHeapBuffer3964 = null;
				aStream3970 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iw.C(" + bool + ',' + i + ')');
		}
	}

	static final void method1171(int i) {
		try {
			Class246_Sub3_Sub3.aClass254_6152 = new Class254(8);
			Class340.anInt2849 = i;
			for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class267.aClass218_2002.method2803((byte) 15)); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class267.aClass218_2002.method2809(false)))
				class246_sub5.method3129();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iw.E(" + i + ')');
		}
	}

	static final boolean method1172(byte i, int i_28_, int i_29_) {
		try {
			if (i != 1)
				method1166(46);
			if (!((i_28_ & 0x60000) != 0 | Class98_Sub10_Sub9.method1033(i_28_, i_29_, 16)) && !Class276.method3286((byte) 115, i_28_, i_29_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iw.D(" + i + ',' + i_28_ + ',' + i_29_ + ')'));
		}
	}

	static final void method1173(int i) {
		do {
			try {
				if (Class146_Sub3.method2408((byte) 57)) {
					if (Class98_Sub46_Sub20.aStringArray6073 == null)
						Class264.method3222((byte) -43);
					Class98_Sub17_Sub1.aBoolean5778 = true;
					Class98_Sub10_Sub15.anInt5618 = 0;
				}
				if (i == 0)
					break;
				aClass53_Sub1Array3967 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "iw.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1174(int i, byte i_30_, int i_31_, int i_32_) {
		try {
			if (i_30_ > 117)
				anIntArray3973[i_32_ + ((s) aS_Sub1_3965).anInt2203 * i_31_] = Class41.method366((anIntArray3973[i_32_ + (((s) aS_Sub1_3965).anInt2203 * i_31_)]), 1 << i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iw.A(" + i + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'));
		}
	}

	final void method1175(int i, byte i_33_) {
		try {
			aNativeHeapBuffer3964 = ((ha_Sub1) aHa_Sub1_3969).aNativeHeap4323.a(4 * i, true);
			if (i_33_ == -64)
				aStream3970 = new Stream(aNativeHeapBuffer3964);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iw.J(" + i + ',' + i_33_ + ')');
		}
	}

	Class98_Sub20(s_Sub1 var_s_Sub1, int i, int i_34_, int i_35_, int i_36_, int i_37_) {
		try {
			aS_Sub1_3965 = var_s_Sub1;
			aHa_Sub1_3969 = ((s_Sub1) aS_Sub1_3965).aHa_Sub1_5206;
			((Class98_Sub20) this).anInt3974 = i_36_;
			anIntArray3973 = new int[(((s) aS_Sub1_3965).anInt2203 * ((s) aS_Sub1_3965).anInt2204)];
			((Class98_Sub20) this).anInt3968 = i;
			((Class98_Sub20) this).anInt3975 = i_37_;
			((Class98_Sub20) this).anInt3971 = i_35_;
			((Class98_Sub20) this).aFloat3972 = (float) i_34_;
			aClass156_Sub1_3963 = new Class156_Sub1(aHa_Sub1_3969, 5123, null, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iw.<init>(" + (var_s_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}
}
