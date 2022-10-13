/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class86 {
	static float[] aFloatArray640 = new float[16];
	private int anInt641 = -1;
	int anInt642 = -1;
	private int anInt643;
	Class121 aClass121_644;
	int anInt645;
	int anInt646;
	private int anInt647 = -1;
	int anInt648;
	static Class350 aClass350_649;
	int anInt650;
	int anInt651;
	private int anInt652;
	int anInt653;
	private String aString654;
	int anInt655;

	private final void method841(int i, int i_0_, RSByteBuffer class98_sub22) {
		do {
			try {
				if (i_0_ == 1)
					((Class86) this).anInt655 = class98_sub22.readShort();
				else if ((i_0_ ^ 0xffffffff) == -3)
					((Class86) this).anInt648 = class98_sub22.readMedium(-128);
				else if ((i_0_ ^ 0xffffffff) == -4)
					anInt641 = class98_sub22.readShort();
				else if (i_0_ == 4)
					anInt643 = class98_sub22.readShort();
				else if ((i_0_ ^ 0xffffffff) == -6)
					anInt652 = class98_sub22.readShort();
				else if ((i_0_ ^ 0xffffffff) != -7) {
					if ((i_0_ ^ 0xffffffff) != -8) {
						if ((i_0_ ^ 0xffffffff) != -9) {
							if ((i_0_ ^ 0xffffffff) == -10)
								((Class86) this).anInt651 = class98_sub22.readShort();
							else if (i_0_ == 10)
								((Class86) this).anInt650 = class98_sub22.readUShort(false);
							else if (i_0_ == 11)
								((Class86) this).anInt645 = 0;
							else if (i_0_ == 12)
								((Class86) this).anInt642 = class98_sub22.readUnsignedByte();
							else if (i_0_ == 13)
								((Class86) this).anInt646 = class98_sub22.readUShort(false);
							else if (i_0_ == 14)
								((Class86) this).anInt645 = class98_sub22.readShort();
						} else {
							aString654 = class98_sub22.method1223(-1);
						}
					} else
						((Class86) this).anInt653 = class98_sub22.readUShort(false);
				} else
					anInt647 = class98_sub22.readShort();
				if (i <= -7)
					break;
				method844(2, false, 22, 53, -22, 114, -118, -30);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fj.C(" + i + ',' + i_0_ + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method842(boolean bool) {
		do {
			try {
				aFloatArray640 = null;
				aClass350_649 = null;
				if (bool == false)
					break;
				aFloatArray640 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fj.J(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method843(int i, ha var_ha, LinkedList class148, int i_1_, int i_2_) {
		do {
			try {
				Class8.aClass148_110.method2422((byte) 47);
				if (!Class98_Sub43_Sub1.aBoolean5895) {
					for (Class98_Sub47 class98_sub47 = (Class98_Sub47) class148.method2418(32); class98_sub47 != null; class98_sub47 = ((Class98_Sub47) class148.method2417(i_1_ + 93))) {
						Class24 class24 = (Class278.aClass341_2057.method3807(i_1_ ^ ~0x65, ((Class98_Sub47) class98_sub47).anInt4268));
						if (Class87.method855(87, class24)) {
							boolean bool = Class98_Sub40.method1473(class24, i, class98_sub47, i_2_, 15924, var_ha);
							if (bool)
								Class103.method1711(var_ha, (byte) 70, class98_sub47, class24);
						}
					}
					if (i_1_ == -1)
						break;
					aFloatArray640 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fj.F(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class148 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method844(int i, boolean bool, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		do {
			try {
				if ((!bool ? ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4066.method641((byte) 122) : ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4054.method641((byte) 127)) != 0 && i_4_ != 0 && Class306.anInt2566 < 50 && i_7_ != -1)
					Class245.aClass338Array1865[Class306.anInt2566++] = new Class338(!bool ? (byte) 2 : (byte) 3, i_7_, i_4_, i_3_, i_5_, i_6_, i, null);
				if (i_8_ < -58)
					break;
				method844(-106, false, -53, 52, 126, 31, -86, -57);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fj.E(" + i + ',' + bool + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final String method845(byte i, Class98_Sub46_Sub8 class98_sub46_sub8) {
		try {
			if (i != -124)
				method844(-38, false, 87, -74, -69, -59, 2, -40);
			if (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5985 != null && ((Class98_Sub46_Sub8) class98_sub46_sub8).aString5985.length() != 0) {
				if ((((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992 == null) || (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992.length() ^ 0xffffffff) >= -1)
					return ((((Class98_Sub46_Sub8) class98_sub46_sub8).aString5994) + TextResources.aClass309_2618.get_text(Class374.anInt3159) + (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5985));
				return (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5994 + TextResources.aClass309_2618.get_text(Class374.anInt3159) + ((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992 + TextResources.aClass309_2618.get_text(Class374.anInt3159) + (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5985));
			}
			if (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992 == null || (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992.length() ^ 0xffffffff) >= -1)
				return ((Class98_Sub46_Sub8) class98_sub46_sub8).aString5994;
			return (((Class98_Sub46_Sub8) class98_sub46_sub8).aString5994 + TextResources.aClass309_2618.get_text(Class374.anInt3159) + ((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fj.K(" + i + ',' + (class98_sub46_sub8 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class332 method846(boolean bool, ha var_ha) {
		try {
			if (anInt641 < 0)
				return null;
			if (bool != false)
				((Class86) this).anInt655 = 120;
			Class332 class332 = ((Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt641));
			if (class332 == null) {
				method847(-109, var_ha);
				class332 = (Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt641);
			}
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fj.A(" + bool + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method847(int i, ha var_ha) {
		do {
			try {
				int i_9_ = 25 / ((i - 3) / 34);
				RuneScapeCache class207 = (((Class121) ((Class86) this).aClass121_644).aClass207_1005);
				if (anInt641 >= 0 && (((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt641) == null) && class207.method2742(-32, anInt641)) {
					Class324 class324 = Class324.method3683(class207, anInt641);
					((Class121) ((Class86) this).aClass121_644).aClass79_1003.put((long) anInt641, var_ha.method1758(class324, true));
				}
				if (anInt652 >= 0 && (((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt652) == null) && class207.method2742(-83, anInt652)) {
					Class324 class324 = Class324.method3683(class207, anInt652);
					((Class121) ((Class86) this).aClass121_644).aClass79_1003.put((long) anInt652, var_ha.method1758(class324, true));
				}
				if ((anInt643 ^ 0xffffffff) <= -1 && (((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt643) == null) && class207.method2742(-91, anInt643)) {
					Class324 class324 = Class324.method3683(class207, anInt643);
					((Class121) ((Class86) this).aClass121_644).aClass79_1003.put((long) anInt643, var_ha.method1758(class324, true));
				}
				if ((anInt647 ^ 0xffffffff) > -1 || (((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt647) != null) || !class207.method2742(-79, anInt647))
					break;
				Class324 class324 = Class324.method3683(class207, anInt647);
				((Class121) ((Class86) this).aClass121_644).aClass79_1003.put((long) anInt647, var_ha.method1758(class324, true));
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fj.G(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final String method848(int i, int i_10_) {
		try {
			String string = aString654;
			if (i != 22414)
				anInt652 = 8;
			for (;;) {
				int i_11_ = string.indexOf("%1");
				if ((i_11_ ^ 0xffffffff) > -1)
					break;
				string = (string.substring(0, i_11_) + Class44.method428(i_10_, false, false) + string.substring(i_11_ + 2));
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fj.L(" + i + ',' + i_10_ + ')');
		}
	}

	final Class332 method849(ha var_ha, int i) {
		try {
			if ((anInt643 ^ 0xffffffff) > -1)
				return null;
			int i_12_ = 85 / ((-57 - i) / 49);
			Class332 class332 = ((Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt643));
			if (class332 == null) {
				method847(-83, var_ha);
				class332 = (Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt643);
			}
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fj.H(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class332 method850(int i, ha var_ha) {
		try {
			if (i < (anInt647 ^ 0xffffffff))
				return null;
			Class332 class332 = ((Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt647));
			if (class332 == null) {
				method847(i + 61, var_ha);
				class332 = (Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt647);
			}
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fj.I(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method851(RSByteBuffer class98_sub22, int i) {
		do {
			try {
				for (;;) {
					int i_13_ = class98_sub22.readUnsignedByte();
					if ((i_13_ ^ 0xffffffff) == -1)
						break;
					method841(-120, i_13_, class98_sub22);
				}
				if (i == -1)
					break;
				aFloatArray640 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fj.B(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Class332 method852(int i, ha var_ha) {
		try {
			if (anInt652 < 0)
				return null;
			Class332 class332 = ((Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt652));
			if (i < 11)
				return null;
			if (class332 == null) {
				method847(45, var_ha);
				class332 = (Class332) ((Class121) ((Class86) this).aClass121_644).aClass79_1003.get((long) anInt652);
			}
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fj.D(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public Class86() {
		((Class86) this).anInt645 = -1;
		((Class86) this).anInt650 = 0;
		((Class86) this).anInt648 = 16777215;
		((Class86) this).anInt651 = 70;
		anInt643 = -1;
		anInt652 = -1;
		((Class86) this).anInt653 = 0;
		((Class86) this).anInt646 = 0;
		((Class86) this).anInt655 = -1;
		aString654 = "";
	}
}
