/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

final class Class153 {
	static ha aHa1225;
	private Class79 aClass79_1226 = new Class79(128);
	private RuneScapeCache aClass207_1227;
	static volatile boolean aBoolean1228 = true;
	static String aString1229 = null;
	static boolean aBoolean1230 = false;

	final void method2482(byte i) {
		do {
			try {
				synchronized (aClass79_1226) {
					aClass79_1226.method806((byte) 61);
				}
				if (i > 17)
					break;
				method2487(126);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kf.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class72 method2483(int i, int i_0_) {
		try {
			Class72 class72;
			synchronized (aClass79_1226) {
				class72 = (Class72) aClass79_1226.get(i);
			}
			if (class72 != null)
				return class72;
			if (i_0_ < 117)
				aBoolean1228 = false;
			byte[] is;
			synchronized (aClass207_1227) {
				is = aClass207_1227.readArchive(i, 1);
			}
			class72 = new Class72();
			if (is != null)
				class72.method717(new RSByteBuffer(is), -52);
			synchronized (aClass79_1226) {
				aClass79_1226.put(i, class72);
			}
			return class72;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kf.A(" + i + ',' + i_0_ + ')');
		}
	}

	static final Class268 method2484(int i, int i_1_, byte i_2_, Class88 class88, Component component) {
		try {
			if (Class64_Sub15.anInt3678 == 0)
				throw new IllegalStateException();
			if (i_1_ < 0 || i_1_ >= 2)
				throw new IllegalArgumentException();
			if (i < 256)
				i = 256;
			try {
				Class268 class268 = (Class268) Class.forName("Class268_Sub2").newInstance();
				class268.anInt2016 = i;
				class268.anIntArray2005 = new int[(!Class151_Sub7.aBoolean5007 ? 1 : 2) * 256];
				class268.method3253(component);
				class268.anInt2010 = 1024 + (i & ~0x3ff);
				if (class268.anInt2010 > 16384)
					class268.anInt2010 = 16384;
				class268.method3250(class268.anInt2010);
				if (PlayerUpdateMask.anInt529 > 0 && Class177.aClass103_1375 == null) {
					Class177.aClass103_1375 = new Class103();
					Class177.aClass103_1375.aClass88_891 = class88;
					class88.method858(PlayerUpdateMask.anInt529, Class177.aClass103_1375, 1);
				}
				if (Class177.aClass103_1375 != null) {
					if ((Class177.aClass103_1375.aClass268Array894[i_1_]) != null)
						throw new IllegalArgumentException();
					Class177.aClass103_1375.aClass268Array894[i_1_] = class268;
				}
				return class268;
			} catch (Throwable throwable) {
				try {
					Class268_Sub1 class268_sub1 = new Class268_Sub1(class88, i_1_);
					class268_sub1.anInt2016 = i;
					class268_sub1.anIntArray2005 = new int[256 * (Class151_Sub7.aBoolean5007 ? 2 : 1)];
					class268_sub1.method3253(component);
					class268_sub1.anInt2010 = 16384;
					if (i_2_ != -126)
						aBoolean1228 = true;
					class268_sub1.method3250(class268_sub1.anInt2010);
					if (PlayerUpdateMask.anInt529 > 0 && Class177.aClass103_1375 == null) {
						Class177.aClass103_1375 = new Class103();
						Class177.aClass103_1375.aClass88_891 = class88;
						class88.method858(PlayerUpdateMask.anInt529, Class177.aClass103_1375, 1);
					}
					if (Class177.aClass103_1375 != null) {
						if ((Class177.aClass103_1375.aClass268Array894[i_1_]) != null)
							throw new IllegalArgumentException();
						Class177.aClass103_1375.aClass268Array894[i_1_] = class268_sub1;
					}
					return class268_sub1;
				} catch (Throwable throwable_3_) {
					return new Class268();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kf.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (class88 != null ? "{...}" : "null") + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2485(int i, int i_4_) {
		try {
			synchronized (aClass79_1226) {
				aClass79_1226.method800((byte) 62, i);
			}
			if (i_4_ != 1)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kf.H(" + i + ',' + i_4_ + ')');
		}
	}

	final void method2486(byte i) {
		do {
			try {
				synchronized (aClass79_1226) {
					aClass79_1226.method794(97);
				}
				if (i < -67)
					break;
				method2485(-5, -3);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kf.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2487(int i) {
		do {
			try {
				Class186.aClass148_3428 = new LinkedList();
				if (i == -1)
					break;
				aBoolean1230 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kf.I(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2488(int i) {
		do {
			try {
				aHa1225 = null;
				aString1229 = null;
				if (i == -1)
					break;
				aString1229 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kf.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2489(long l, byte i) {
		try {
			int i_5_ = (Class304.anInt2533 + Player.selfPlayer.localXPos);
			int i_6_ = -83 / ((i - -27) / 43);
			int i_7_ = ((Player.selfPlayer.localYPos) - -Class98_Sub17.anInt3943);
			if (-i_5_ + Class201.anInt1545 < -2000 || Class201.anInt1545 + -i_5_ > 2000 || Class224_Sub3_Sub1.anInt6147 + -i_7_ < -2000 || (-i_7_ + Class224_Sub3_Sub1.anInt6147 > 2000)) {
				Class201.anInt1545 = i_5_;
				Class224_Sub3_Sub1.anInt6147 = i_7_;
			}
			if (Class201.anInt1545 != i_5_) {
				int i_8_ = i_5_ + -Class201.anInt1545;
				int i_9_ = (int) ((long) i_8_ * l / 320L);
				if (i_8_ <= 0) {
					if (i_9_ == 0)
						i_9_ = -1;
					else if (i_8_ > i_9_)
						i_9_ = i_8_;
				} else if (i_9_ != 0) {
					if (i_8_ < i_9_)
						i_9_ = i_8_;
				} else
					i_9_ = 1;
				Class201.anInt1545 += i_9_;
			}
			if (i_7_ != Class224_Sub3_Sub1.anInt6147) {
				int i_10_ = -Class224_Sub3_Sub1.anInt6147 + i_7_;
				int i_11_ = (int) (l * (long) i_10_ / 320L);
				if (i_10_ <= 0) {
					if (i_11_ != 0) {
						if (i_11_ < i_10_)
							i_11_ = i_10_;
					} else
						i_11_ = -1;
				} else if (i_11_ == 0)
					i_11_ = 1;
				else if (i_10_ < i_11_)
					i_11_ = i_10_;
				Class224_Sub3_Sub1.anInt6147 += i_11_;
			}
			GameWorld.cameraGetVrot += (float) l * MapRegion.aFloat2545 / 6.0F;
			GameWorld.cameraGetHrot += (float) l * Class180.aFloat3405 / 6.0F;
			Class42_Sub2.method388(true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kf.G(" + l + ',' + i + ')');
		}
	}

	Class153(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_1227 = class207;
			aClass207_1227.method2761(0, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kf.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2490(int i, boolean bool) {
		try {
			if (bool != false)
				aHa1225 = null;
			return i >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kf.E(" + i + ',' + bool + ')');
		}
	}
}
