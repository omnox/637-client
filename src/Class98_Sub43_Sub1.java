
/* Class98_Sub43_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

final class Class98_Sub43_Sub1 extends Class98_Sub43 {
	static boolean aBoolean5895;
	static int[] anIntArray5896 = { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
	static Class365 aClass365_5897;
	private VorbisBlock aVorbisBlock5898;
	private double aDouble5899;
	private Class314 aClass314_5900;
	private DSPState aDSPState5901;
	private Class98_Sub31_Sub4 aClass98_Sub31_Sub4_5902;
	private int anInt5903;
	private VorbisComment aVorbisComment5904;
	private VorbisInfo aVorbisInfo5905;

	final Class98_Sub31_Sub4 method1488(byte i) {
		try {
			if (i <= 70)
				return null;
			return aClass98_Sub31_Sub4_5902;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cga.D(" + i + ')');
		}
	}

	final double method1489(int i) {
		try {
			if (i != 0)
				method1492((byte) 79);
			double d = aDouble5899;
			if (aClass98_Sub31_Sub4_5902 != null) {
				d = aClass98_Sub31_Sub4_5902.method1382(false);
				if (d < 0.0)
					d = aDouble5899;
			}
			return (double) -(256.0F / (float) Class64_Sub15.anInt3678) + d;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cga.F(" + i + ')');
		}
	}

	final void method1487(int i) {
		do {
			try {
				if (aVorbisBlock5898 != null)
					aVorbisBlock5898.a();
				if (i != -1128)
					method1489(114);
				if (aDSPState5901 != null)
					aDSPState5901.a();
				aVorbisComment5904.a();
				aVorbisInfo5905.a();
				if (aClass98_Sub31_Sub4_5902 == null)
					break;
				aClass98_Sub31_Sub4_5902.method1379(i ^ ~0x467);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cga.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1490(int i) {
		do {
			try {
				if (Class98_Sub10_Sub1.aClass75Array5542 == null) {
					Class98_Sub10_Sub1.aClass75Array5542 = Class75.method735(-127);
					Class45.aClass75_381 = Class98_Sub10_Sub1.aClass75Array5542[0];
					Class235.aLong1753 = Class343.method3819(i + 16751);
				}
				if (VarpClass.aClass47_3241 == null)
					Class266.method3238(i + 16798);
				Class75 class75 = Class45.aClass75_381;
				if (i == -16798) {
					int i_0_ = Class98_Sub46_Sub17.method1624(125);
					if (class75 == Class45.aClass75_381) {
						Class107.aString912 = Class45.aClass75_381.aClass309_560.get_text(Class374.anInt3159);
						if (Class45.aClass75_381.aBoolean553)
							Class195.anInt1506 = ((-Class45.aClass75_381.anInt552 + (Class45.aClass75_381.anInt557)) * i_0_ / 100 + (Class45.aClass75_381.anInt552));
						if (Class45.aClass75_381.aBoolean554)
							Class107.aString912 += Class195.anInt1506 + "%";
					} else if (Class75.aClass75_579 == Class45.aClass75_381) {
						VarpClass.aClass47_3241 = null;
						Class61.method538(3, false);
					} else {
						Class107.aString912 = class75.aClass309_555.get_text(Class374.anInt3159);
						Class195.anInt1506 = class75.anInt557;
						if (Class45.aClass75_381.aBoolean554)
							Class107.aString912 += class75.anInt557 + "%";
						if (Class45.aClass75_381.aBoolean553 || class75.aBoolean553)
							Class235.aLong1753 = Class343.method3819(-47);
					}
					if (VarpClass.aClass47_3241 == null)
						break;
					VarpClass.aClass47_3241.method446(Class235.aLong1753, (byte) -119, Class195.anInt1506, Class45.aClass75_381, Class107.aString912);
					if (Class39_Sub1.anInterface10Array3592 == null)
						break;
					for (int i_1_ = 1 + Class21_Sub3.anInt5390; (i_1_ < Class39_Sub1.anInterface10Array3592.length); i_1_++) {
						if (Class39_Sub1.anInterface10Array3592[i_1_].method26(i + 16004) >= 100 && -1 + i_1_ == Class21_Sub3.anInt5390 && Class177.anInt1376 >= 1 && VarpClass.aClass47_3241.method441((byte) 124)) {
							try {
								Class39_Sub1.anInterface10Array3592[i_1_].method27(-31295);
							} catch (Exception exception) {
								Class39_Sub1.anInterface10Array3592 = null;
								break;
							}
							VarpClass.aClass47_3241.method444((byte) -74, Class39_Sub1.anInterface10Array3592[i_1_]);
							Class21_Sub3.anInt5390++;
							if (((Class39_Sub1.anInterface10Array3592).length + -1 <= Class21_Sub3.anInt5390) && Class39_Sub1.anInterface10Array3592.length > 1)
								Class21_Sub3.anInt5390 = (Class3.aClass282_76.method3337(1) ? 0 : -1);
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cga.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1491(int i) {
		try {
			if (i == -3) {
				anIntArray5896 = null;
				aClass365_5897 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cga.A(" + i + ')');
		}
	}

	final int method1492(byte i) {
		try {
			if (i > -14)
				return -48;
			if (aClass98_Sub31_Sub4_5902 == null)
				return 0;
			return aClass98_Sub31_Sub4_5902.method1387(true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cga.B(" + i + ')');
		}
	}

	static final void method1493(int i) {
		try {
			int i_2_ = -14 % ((-20 - i) / 38);
			if (VarpClass.aClass47_3241 != null)
				VarpClass.aClass47_3241.method448(false);
			if (Class76_Sub9.aThread3783 != null) {
				for (;;) {
					try {
						Class76_Sub9.aThread3783.join();
						break;
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cga.E(" + i + ')');
		}
	}

	Class98_Sub43_Sub1(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		try {
			aVorbisInfo5905 = new VorbisInfo();
			aVorbisComment5904 = new VorbisComment();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cga.<init>(" + (oggstreamstate != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1482(OggPacket oggpacket, boolean bool) {
		do {
			try {
				if (bool == false) {
					if (this.anInt4240 >= 3) {
						if (aVorbisBlock5898.synthesis(oggpacket) == 0)
							aDSPState5901.blockIn(aVorbisBlock5898);
						float[][] fs = aDSPState5901.pcmOut(aVorbisInfo5905.channels);
						aDouble5899 = aDSPState5901.granuleTime();
						if (aDouble5899 == -1.0)
							aDouble5899 = (float) anInt5903 / (float) aVorbisInfo5905.rate;
						aDSPState5901.read(fs[0].length);
						anInt5903 += fs[0].length;
						Class98_Sub46_Sub15 class98_sub46_sub15 = aClass98_Sub31_Sub4_5902.method1385(aDouble5899, fs[0].length, -99);
						Class151_Sub3.method2455(fs, (byte) -78, (class98_sub46_sub15.aShortArrayArray6040));
						for (int i = 0; i < aVorbisInfo5905.channels; i++)
							class98_sub46_sub15.aShortArrayArray6040[i] = (aClass314_5900.method3641(6, (class98_sub46_sub15.aShortArrayArray6040[i])));
						aClass98_Sub31_Sub4_5902.method1380((byte) 111, class98_sub46_sub15);
					} else {
						int i = aVorbisInfo5905.headerIn(aVorbisComment5904, oggpacket);
						if (i < 0)
							throw new IllegalStateException(String.valueOf(i));
						if (this.anInt4240 != 2)
							break;
						if (aVorbisInfo5905.channels > 2 || aVorbisInfo5905.channels < 1)
							throw new RuntimeException(String.valueOf(aVorbisInfo5905.channels));
						aDSPState5901 = new DSPState(aVorbisInfo5905);
						aVorbisBlock5898 = new VorbisBlock(aDSPState5901);
						aClass314_5900 = new Class314(aVorbisInfo5905.rate, Class64_Sub15.anInt3678);
						aClass98_Sub31_Sub4_5902 = new Class98_Sub31_Sub4(aVorbisInfo5905.channels);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("cga.J(" + (oggpacket != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	static {
		aBoolean5895 = false;
	}
}
