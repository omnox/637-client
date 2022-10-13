/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class199 {
	boolean aBoolean1526;
	boolean aBoolean1527;
	Class32 aClass32_1528;
	int anInt1529;
	int anInt1530 = 64;
	static Class32 aClass32_1531;
	int anInt1532 = 1190717;
	static OutgoingOpcode aClass171_1533 = new OutgoingOpcode(63, -1);
	int anInt1534;
	int anInt1535;
	int anInt1536;
	int anInt1537;
	boolean aBoolean1538;
	static int pathEndX;
	int anInt1540;
	static int anInt1541 = -1;
	int anInt1542;

	static final void method2685(int i, byte i_0_) {
		try {
			if (i != -15)
				anInt1541 = -85;
			if (OutputStream_Sub2.aByteArrayArrayArray41 == null)
				OutputStream_Sub2.aByteArrayArrayArray41 = (new byte[4][GameWorld.size_x][GameWorld.size_y]);
			for (int i_1_ = 0; i_1_ < 4; i_1_++) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (GameWorld.size_x ^ 0xffffffff); i_2_++) {
					for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (GameWorld.size_y ^ 0xffffffff)); i_3_++)
						OutputStream_Sub2.aByteArrayArrayArray41[i_1_][i_2_][i_3_] = i_0_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nba.F(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method2686(String string, byte i) {
		do {
			try {
				System.out.println("Error: " + Class76_Sub9.method765("\n", 4185, "%0a", string));
				if (i == -80)
					break;
				anInt1541 = -21;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	public static void method2687(boolean bool) {
		try {
			aClass32_1531 = null;
			if (bool != false)
				aClass32_1531 = null;
			aClass171_1533 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nba.D(" + bool + ')');
		}
	}

	final void method2688(int i, RSByteBuffer class98_sub22) {
		try {
			for (;;) {
				int i_4_ = class98_sub22.readUnsignedByte();
				if (i_4_ == 0)
					break;
				method2689(2818, i_4_, class98_sub22);
			}
			int i_5_ = -102 % ((i - 40) / 58);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nba.B(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2689(int i, int i_6_, RSByteBuffer class98_sub22) {
		try {
			if ((i_6_ ^ 0xffffffff) != -2) {
				if ((i_6_ ^ 0xffffffff) == -3)
					((Class199) this).anInt1542 = class98_sub22.readUnsignedByte();
				else if ((i_6_ ^ 0xffffffff) == -4) {
					((Class199) this).anInt1542 = class98_sub22.readShort();
					if ((((Class199) this).anInt1542 ^ 0xffffffff) == -65536)
						((Class199) this).anInt1542 = -1;
				} else if ((i_6_ ^ 0xffffffff) != -6) {
					if (i_6_ == 7)
						((Class199) this).anInt1540 = (Class64_Sub24.method652(class98_sub22.readMedium(i ^ ~0xb7e), i + -2733));
					else if (i_6_ == 8)
						((Class32) ((Class199) this).aClass32_1528).anInt312 = ((Class199) this).anInt1536;
					else if ((i_6_ ^ 0xffffffff) == -10)
						((Class199) this).anInt1529 = (class98_sub22.readShort() << -242726558);
					else if ((i_6_ ^ 0xffffffff) == -11)
						((Class199) this).aBoolean1538 = false;
					else if (i_6_ == 11)
						((Class199) this).anInt1535 = class98_sub22.readUnsignedByte();
					else if ((i_6_ ^ 0xffffffff) == -13)
						((Class199) this).aBoolean1526 = true;
					else if (i_6_ == 13)
						((Class199) this).anInt1532 = class98_sub22.readMedium(-128);
					else if ((i_6_ ^ 0xffffffff) != -15) {
						if ((i_6_ ^ 0xffffffff) == -17)
							((Class199) this).anInt1534 = class98_sub22.readUnsignedByte();
					} else
						((Class199) this).anInt1530 = (class98_sub22.readUnsignedByte() << 33077314);
				} else
					((Class199) this).aBoolean1527 = false;
			} else
				((Class199) this).anInt1537 = Class64_Sub24.method652(class98_sub22.readMedium(i + -2942), 76);
			if (i != 2818)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nba.E(" + i + ',' + i_6_ + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method2690(int i, int i_7_) {
		try {
			if (i_7_ != 8)
				return false;
			if ((i ^ 0xffffffff) != -5 && i != 8 && (i ^ 0xffffffff) != -12)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nba.C(" + i + ',' + i_7_ + ')');
		}
	}

	public Class199() {
		((Class199) this).aBoolean1526 = false;
		((Class199) this).aBoolean1527 = true;
		((Class199) this).anInt1534 = 127;
		((Class199) this).anInt1537 = 0;
		((Class199) this).anInt1535 = 8;
		((Class199) this).anInt1540 = -1;
		((Class199) this).anInt1529 = 512;
		((Class199) this).aBoolean1538 = true;
		((Class199) this).anInt1542 = -1;
	}

	final void method2691(byte i) {
		try {
			((Class199) this).anInt1535 = (((Class199) this).anInt1535 << -1953787544 | ((Class199) this).anInt1536);
			if (i != 80)
				method2687(true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nba.A(" + i + ')');
		}
	}
}
