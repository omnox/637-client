/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class61 {
	private int anInt477 = 0;
	static short[][][] aShortArrayArrayArray478;
	static int anInt479 = 0;
	private Class377 aClass377_480;
	static RuneScapeCache aClass207_481;
	private Node aClass98_482;

	static final void method537(byte i) {
		try {
			Class98_Sub27.method1282((byte) 8, ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub17_4046.method617((byte) 120));
			int i_0_ = ((Class272.anInt2038 >> 913933219) + (Class98_Sub46_Sub10.renderX >> -195505812));
			int i_1_ = ((Class134.renderZ >> -1524816148) + (aa_Sub2.anInt3562 >> -522339549));
			Class43.anInt377 = ((AnimableEntity) Player.selfPlayer).height_level = (byte) 0;
			Player.selfPlayer.method3060(8, 8, 1470);
			int i_2_ = 18;
			Class105.aByteArrayArray3414 = new byte[i_2_][];
			Class255.aByteArrayArray3211 = new byte[i_2_][];
			client.aByteArrayArray3551 = new byte[i_2_][];
			Class98_Sub46_Sub17.regionKeys = new int[i_2_][4];
			Class121.anIntArray1006 = new int[i_2_];
			Player.aByteArrayArray6533 = new byte[i_2_][];
			Class98_Sub36.landscapeArchive = new int[i_2_];
			Class287.objectDataArchive = new int[i_2_];
			Class377.aByteArrayArray3182 = new byte[i_2_][];
			Class377.anIntArray3178 = new int[i_2_];
			Class76_Sub7.anIntArray3765 = new int[i_2_];
			Class302.anIntArray2517 = new int[i_2_];
			if (i <= 64)
				method542(true);
			i_2_ = 0;
			for (int i_3_ = (i_0_ - (GameWorld.size_x >> -2009281948)) / 8; i_3_ <= ((GameWorld.size_x >> 1983437604) + i_0_) / 8; i_3_++) {
				for (int i_4_ = (-(GameWorld.size_y >> -1249052220) + i_1_) / 8; i_4_ <= ((GameWorld.size_y >> 226644196) + i_1_) / 8; i_4_++) {
					int i_5_ = i_4_ + (i_3_ << 1247776552);
					Class121.anIntArray1006[i_2_] = i_5_;
					Class287.objectDataArchive[i_2_] = Class234.runescapeCache.readArchiveByName((byte) -90, "m" + i_3_ + "_" + i_4_);
					Class98_Sub36.landscapeArchive[i_2_] = Class234.runescapeCache.readArchiveByName((byte) -69, "l" + i_3_ + "_" + i_4_);
					Class76_Sub7.anIntArray3765[i_2_] = Class234.runescapeCache.readArchiveByName((byte) -100, ("n" + i_3_ + "_" + i_4_));
					Class302.anIntArray2517[i_2_] = Class234.runescapeCache.readArchiveByName((byte) -109, ("um" + i_3_ + "_" + i_4_));
					Class377.anIntArray3178[i_2_] = Class234.runescapeCache.readArchiveByName((byte) -124, ("ul" + i_3_ + "_" + i_4_));
					if ((Class76_Sub7.anIntArray3765[i_2_] ^ 0xffffffff) == 0) {
						Class287.objectDataArchive[i_2_] = -1;
						Class98_Sub36.landscapeArchive[i_2_] = -1;
						Class302.anIntArray2517[i_2_] = -1;
						Class377.anIntArray3178[i_2_] = -1;
					}
					i_2_++;
				}
			}
			for (int i_6_ = i_2_; ((i_6_ ^ 0xffffffff) > (Class76_Sub7.anIntArray3765.length ^ 0xffffffff)); i_6_++) {
				Class76_Sub7.anIntArray3765[i_6_] = -1;
				Class287.objectDataArchive[i_6_] = -1;
				Class98_Sub36.landscapeArchive[i_6_] = -1;
				Class302.anIntArray2517[i_6_] = -1;
				Class377.anIntArray3178[i_6_] = -1;
			}
			int i_7_;
			if (Class177.anInt1376 != 3)
				i_7_ = 8;
			else
				i_7_ = 4;
			Class251.method3170(-6547, i_1_, false, i_0_, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.C(" + i + ')');
		}
	}

	static final void method538(int i, boolean bool) {
		try {
			if ((i ^ 0xffffffff) != (Class177.anInt1376 ^ 0xffffffff)) {
				if (i == 13) {
					if (Class98_Sub10_Sub10.aString5593 == null)
						Class251.method3171(Class360.aString3064, -17877, Class98_Sub5.aString3837, Class146_Sub2.anInt4855);
					else
						Class98_Sub10_Sub14.method1045(Class146_Sub2.anInt4855, -6182);
				}
				if (i != 13 && Class318.aClass123_2698 != null) {
					Class318.aClass123_2698.method2207(-61);
					Class318.aClass123_2698 = null;
				}
				if (i == 3)
					Class269.method3269(Class15.anInt185 != ItemDefinition.anInt2470, 0);
				if ((i ^ 0xffffffff) == -8)
					Class96.method922(((Class15.anInt185 ^ 0xffffffff) != (Class19.anInt3450 ^ 0xffffffff)), -1);
				if (i == 5) {
					if (Class98_Sub10_Sub10.aString5593 != null)
						Class27.method296((byte) 55);
					else
						Class276.method3285(Class360.aString3064, Class98_Sub5.aString3837, (byte) -68);
				} else if (i != 6) {
					if ((i ^ 0xffffffff) == -10) {
						if (Class98_Sub10_Sub10.aString5593 == null)
							Class251.method3171(Class360.aString3064, -17877, Class98_Sub5.aString3837, Class146_Sub2.anInt4855);
						else
							Class98_Sub10_Sub14.method1045(Class146_Sub2.anInt4855, -6182);
					} else if ((i ^ 0xffffffff) == -13) {
						if (Class98_Sub10_Sub10.aString5593 == null)
							Class276.method3285(Class360.aString3064, Class98_Sub5.aString3837, (byte) -68);
						else
							Class27.method296((byte) 55);
					}
				} else if (Class98_Sub10_Sub10.aString5593 != null)
					Class98_Sub10_Sub14.method1045(Class146_Sub2.anInt4855, -6182);
				else
					Class251.method3171(Class360.aString3064, -17877, Class98_Sub5.aString3837, Class146_Sub2.anInt4855);
				if (Class199.method2690(Class177.anInt1376, 8)) {
					((RuneScapeCache) client.aClass207_3549).anInt1575 = 2;
					((RuneScapeCache) Class98_Sub10_Sub24.aClass207_5668).anInt1575 = 2;
					((RuneScapeCache) Class375.aClass207_3167).anInt1575 = 2;
					((RuneScapeCache) Class234.aClass207_1751).anInt1575 = 2;
					((RuneScapeCache) Class208.aClass207_1581).anInt1575 = 2;
					((RuneScapeCache) AnimableEntity.aClass207_5087).anInt1575 = 2;
					((RuneScapeCache) PlayerUpdateMask.aClass207_525).anInt1575 = 2;
				}
				if (Class199.method2690(i, 8)) {
					Class280.anInt2105 = 1;
					Class98_Sub5_Sub3.anInt5538 = 1;
					Class130.anInt1031 = 0;
					Class142.anInt1160 = 0;
					Class132.anInt1043 = 0;
					Class118.method2173(true, 122);
					((RuneScapeCache) client.aClass207_3549).anInt1575 = 1;
					((RuneScapeCache) Class98_Sub10_Sub24.aClass207_5668).anInt1575 = 1;
					((RuneScapeCache) Class375.aClass207_3167).anInt1575 = 1;
					((RuneScapeCache) Class234.aClass207_1751).anInt1575 = 1;
					((RuneScapeCache) Class208.aClass207_1581).anInt1575 = 1;
					((RuneScapeCache) AnimableEntity.aClass207_5087).anInt1575 = 1;
					((RuneScapeCache) PlayerUpdateMask.aClass207_525).anInt1575 = 1;
				}
				if ((i ^ 0xffffffff) == -12 || i == 3)
					Class4.method174((byte) 99);
				boolean bool_8_ = ((i ^ 0xffffffff) == -3 || Class53_Sub1.method499(2048, i) || Class246_Sub3_Sub3.method3011(-6410, i));
				boolean bool_9_ = ((Class177.anInt1376 ^ 0xffffffff) == -3 || Class53_Sub1.method499(2048, Class177.anInt1376) || Class246_Sub3_Sub3.method3011(-6410, Class177.anInt1376));
				if (bool_8_ == !bool_9_) {
					if (bool_8_) {
						Class144.anInt1169 = Class94.anInt795;
						if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4072.method641((byte) 125) ^ 0xffffffff) == -1)
							Class96.method923(103, 2);
						else {
							Class226.method2854(false, false, ((Class98_Sub27) (Class98_Sub9.aClass98_Sub27_3856)).aClass64_Sub22_4072.method641((byte) 124), (Class98_Sub10_Sub1.aClass207_5544), 0, 2, Class94.anInt795);
							Class233.method2883((byte) 111);
						}
						Class98_Sub10_Sub38.aClass135_5765.method2255(2, false);
					} else {
						Class96.method923(100, 2);
						Class98_Sub10_Sub38.aClass135_5765.method2255(2, true);
					}
				}
				if (Class199.method2690(i, 8) || (i ^ 0xffffffff) == -14)
					Class265.aHa1974.method1817();
				if (bool == false)
					Class177.anInt1376 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.D(" + i + ',' + bool + ')');
		}
	}

	final Node method539(int i) {
		try {
			if (i != 2)
				aClass377_480 = null;
			if ((anInt477 ^ 0xffffffff) < -1 && (((Class377) aClass377_480).aClass98Array3180[anInt477 - 1] != aClass98_482)) {
				Node class98 = aClass98_482;
				aClass98_482 = ((Node) class98).aClass98_836;
				return class98;
			}
			while ((anInt477 ^ 0xffffffff) > (((Class377) aClass377_480).anInt3179 ^ 0xffffffff)) {
				Node class98 = (((Node) (((Class377) aClass377_480).aClass98Array3180[anInt477++])).aClass98_836);
				if (class98 != (((Class377) aClass377_480).aClass98Array3180[-1 + anInt477])) {
					aClass98_482 = ((Node) class98).aClass98_836;
					return class98;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.E(" + i + ')');
		}
	}

	static final void method540(byte i) {
		try {
			if (i != -51)
				method537((byte) 114);
			Class246.method2962(false);
			za_Sub2.aBoolean6079 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.A(" + i + ')');
		}
	}

	public Class61() {
		/* empty */
	}

	final Node method541(int i) {
		try {
			anInt477 = i;
			return method539(2);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.F(" + i + ')');
		}
	}

	Class61(Class377 class377) {
		try {
			aClass377_480 = class377;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.<init>(" + (class377 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method542(boolean bool) {
		try {
			if (bool != false)
				method537((byte) -49);
			aClass207_481 = null;
			aShortArrayArrayArray478 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.B(" + bool + ')');
		}
	}
}
