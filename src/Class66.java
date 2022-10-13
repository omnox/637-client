/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Dimension;

final class Class66 {
	int anInt505;
	int anInt506;
	static boolean aBoolean507 = false;
	int anInt508;
	int anInt509;
	private int anInt510;
	int anInt511;
	int anInt512;
	int anInt513 = 0;
	int anInt514;
	int anInt515 = 0;
	long aLong516;
	int anInt517;
	int anInt518;
	private boolean aBoolean519 = false;

	final void method682(RSByteBuffer class98_sub22, int i) {
		do {
			try {
				for (;;) {
					int i_0_ = class98_sub22.readUnsignedByte();
					if ((i_0_ ^ 0xffffffff) == -1)
						break;
					method686(i_0_, class98_sub22, (byte) -126);
				}
				if (i == 17127)
					break;
				method686(-122, null, (byte) -5);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ega.B(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final int method683(byte i, int i_1_, int i_2_) {
		try {
			if ((Class64_Sub10.anInt3666 ^ 0xffffffff) == 0)
				return 1;
			if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 122) ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
				Class151_Sub9.method2472(true, TextResources.aClass309_2599.get_text(Class374.anInt3159), i_2_, true);
				if ((i_2_ ^ 0xffffffff) != (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 126) ^ 0xffffffff))
					return -1;
			}
			try {
				Dimension dimension = Class42_Sub3.aCanvas5361.getSize();
				if (i > -77)
					method683((byte) -124, -85, 24);
				Class246_Sub2.method2972(-117, Class98_Sub46_Sub10.aClass197_6019, Class195.aClass43_1499, true, Class265.aHa1974, TextResources.aClass309_2599.get_text(Class374.anInt3159));
				ModelDefinitions class178 = Class98_Sub6.method981(0, -9252, Class76_Sub9.aClass207_3787, Class64_Sub10.anInt3666);
				long l = Class343.method3819(-47);
				Class265.aHa1974.la();
				Class266.aClass111_1986.method2100(0, RuneScapeCache.anInt1577, 0);
				Class265.aHa1974.a(Class266.aClass111_1986);
				Class265.aHa1974.DA(dimension.width / 2, dimension.height / 2, 512, 512);
				Class265.aHa1974.xa(1.0F);
				Class265.aHa1974.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				AbstractModel class146 = Class265.aHa1974.method1790(class178, 2048, 64, 64, 768);
				int i_3_ = 0;
				while_77_: for (int i_4_ = 0; i_4_ < 500; i_4_++) {
					Class265.aHa1974.GA(0);
					Class265.aHa1974.ya();
					for (int i_5_ = 15; i_5_ >= 0; i_5_--) {
						for (int i_6_ = 0; i_5_ >= i_6_; i_6_++) {
							Class76_Sub5.aClass111_3745.method2100((int) (((float) i_6_ - (float) i_5_ / 2.0F) * (float) r_Sub2.anInt6333), 0, (1 + i_5_) * r_Sub2.anInt6333);
							class146.method2325(Class76_Sub5.aClass111_3745, null, 0);
							i_3_++;
							if (((long) i_1_ ^ 0xffffffffffffffffL) >= (-l + Class343.method3819(-47) ^ 0xffffffffffffffffL))
								break while_77_;
						}
					}
				}
				Class265.aHa1974.method1825();
				long l_7_ = (long) (i_3_ * 1000) / (-l + Class343.method3819(-47));
				Class265.aHa1974.GA(0);
				Class265.aHa1974.ya();
				return (int) l_7_;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				return -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ega.E(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method684(int i, String string, boolean bool) {
		try {
			if (string != null) {
				if (Class248.anInt1897 >= 100)
					za_Sub2.method1684(TextResources.aClass309_2625.get_text(Class374.anInt3159), 4, (byte) -40);
				else {
					String string_8_ = Class353.method3867(-1, string);
					if (string_8_ != null) {
						for (int i_9_ = 0; i_9_ < Class248.anInt1897; i_9_++) {
							String string_10_ = Class353.method3867(-1, (Class246_Sub4_Sub1.aStringArray6171[i_9_]));
							if (string_10_ != null && string_10_.equals(string_8_)) {
								za_Sub2.method1684((string + (TextResources.aClass309_2626.get_text(Class374.anInt3159))), 4, (byte) -66);
								return;
							}
							if (Class98_Sub45.aStringArray4255[i_9_] != null) {
								String string_11_ = Class353.method3867(-1, (Class98_Sub45.aStringArray4255[i_9_]));
								if (string_11_ != null && string_11_.equals(string_8_)) {
									za_Sub2.method1684((string + (TextResources.aClass309_2626.get_text(Class374.anInt3159))), 4, (byte) -84);
									return;
								}
							}
						}
						for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class314.anInt2692 ^ 0xffffffff)); i_12_++) {
							String string_13_ = Class353.method3867(-1, (Class98_Sub25.aStringArray4026[i_12_]));
							if (string_13_ != null && string_13_.equals(string_8_)) {
								za_Sub2.method1684(((TextResources.aClass309_2631.get_text(Class374.anInt3159)) + string + (TextResources.aClass309_2632.get_text(Class374.anInt3159))), 4, (byte) 59);
								return;
							}
							if (Class315.aStringArray3527[i_12_] != null) {
								String string_14_ = Class353.method3867(-1, (Class315.aStringArray3527[i_12_]));
								if (string_14_ != null && string_14_.equals(string_8_)) {
									za_Sub2.method1684(((TextResources.aClass309_2631.get_text(Class374.anInt3159)) + string + (TextResources.aClass309_2632.get_text(Class374.anInt3159))), 4, (byte) -95);
									return;
								}
							}
						}
						if (Class353.method3867(-1, (((Player) Player.selfPlayer).displayName)).equals(string_8_))
							za_Sub2.method1684((TextResources.aClass309_2628.get_text(Class374.anInt3159)), 4, (byte) -66);
						else {
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class98_Sub8.aClass171_3264, Class331.aClass117_2811));
							((OutgoingPacket) class98_sub11).packet.writeByte(1 + r_Sub2.method1650(string, (byte) 90));
							((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
							((OutgoingPacket) class98_sub11).packet.writeByte(bool ? 1 : 0);
							if (i < -40)
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ega.C(" + i + ',' + (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method685(int i) {
		do {
			try {
				((Class66) this).anInt514 = (Class284_Sub2_Sub2.anIntArray6202[anInt510 << 1969546147]);
				long l = (long) ((Class66) this).anInt506;
				if (i != 1)
					((Class66) this).anInt509 = 44;
				long l_15_ = (long) ((Class66) this).anInt511;
				long l_16_ = (long) ((Class66) this).anInt505;
				((Class66) this).anInt517 = (int) Math.sqrt((double) (l * l + l_15_ * l_15_ + l_16_ * l_16_));
				if (((Class66) this).anInt512 == 0)
					((Class66) this).anInt512 = 1;
				if ((((Class66) this).anInt518 ^ 0xffffffff) == -1)
					((Class66) this).aLong516 = 2147483647L;
				else if ((((Class66) this).anInt518 ^ 0xffffffff) == -2) {
					((Class66) this).aLong516 = (long) (8 * ((Class66) this).anInt517 / ((Class66) this).anInt512);
					((Class66) this).aLong516 *= ((Class66) this).aLong516;
				} else if ((((Class66) this).anInt518 ^ 0xffffffff) == -3)
					((Class66) this).aLong516 = (long) (8 * ((Class66) this).anInt517 / ((Class66) this).anInt512);
				if (!aBoolean519)
					break;
				((Class66) this).anInt517 *= -1;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ega.A(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method686(int i, RSByteBuffer class98_sub22, byte i_17_) {
		do {
			try {
				if ((i ^ 0xffffffff) == -2)
					anInt510 = class98_sub22.readShort();
				else if (i == 2)
					class98_sub22.readUnsignedByte();
				else if (i != 3) {
					if ((i ^ 0xffffffff) == -5) {
						((Class66) this).anInt518 = class98_sub22.readUnsignedByte();
						((Class66) this).anInt512 = class98_sub22.readInt(-2);
					} else if (i == 6)
						((Class66) this).anInt508 = class98_sub22.readUnsignedByte();
					else if ((i ^ 0xffffffff) != -9) {
						if (i == 9)
							((Class66) this).anInt515 = 1;
						else if ((i ^ 0xffffffff) == -11)
							aBoolean519 = true;
					} else
						((Class66) this).anInt513 = 1;
				} else {
					((Class66) this).anInt506 = class98_sub22.readInt(-2);
					((Class66) this).anInt511 = class98_sub22.readInt(-2);
					((Class66) this).anInt505 = class98_sub22.readInt(-2);
				}
				if (i_17_ <= -120)
					break;
				((Class66) this).anInt518 = 31;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ega.D(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_17_ + ')'));
			}
			break;
		} while (false);
	}

	public Class66() {
		/* empty */
	}
}
