/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class104 {
	static int anInt897;
	byte aByte898;
	short aShort899;
	byte aByte900;
	static OutgoingOpcode aClass171_901 = new OutgoingOpcode(18, 3);
	Interface16 anInterface16_902;
	static Class36[] aClass36Array903 = new Class36[8];

	static final void method1712(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			int i_6_ = -334 + i_2_;
			do {
				if (i_6_ >= 0) {
					if (i_6_ <= 100)
						break;
					i_6_ = 100;
					if (!client.aBoolean3553)
						break;
				}
				i_6_ = 0;
			} while (false);
			int i_7_ = (((Class135.cameraZoom + -Class64_Sub19.aShort3692) * i_6_ / 100) + Class64_Sub19.aShort3692);
			Class16.anInt197 = i_7_ * Class16.anInt199 >> 626243656;
			i_0_ = i_0_ * i_7_ >> -1212701304;
			int i_8_ = 16384 - i_4_ & 0x3fff;
			int i_9_ = 16384 + -i & 0x3fff;
			int i_10_ = 0;
			if (bool != false)
				anInt897 = -79;
			int i_11_ = 0;
			int i_12_ = i_0_;
			if ((i_8_ ^ 0xffffffff) != -1) {
				i_11_ = (Class284_Sub2_Sub2.anIntArray6200[i_8_] * -i_12_ >> -1123635698);
				i_12_ = (i_12_ * Class284_Sub2_Sub2.anIntArray6202[i_8_] >> 1849889102);
			}
			if ((i_9_ ^ 0xffffffff) != -1) {
				i_10_ = (Class284_Sub2_Sub2.anIntArray6200[i_9_] * i_12_ >> 1440327534);
				i_12_ = (i_12_ * Class284_Sub2_Sub2.anIntArray6202[i_9_] >> -1335926898);
			}
			Class134.renderZ = -i_12_ + i_1_;
			Class308.anInt2584 = 0;
			GameWorld.cameraPitch = i_4_;
			Class98_Sub46_Sub10.renderX = -i_10_ + i_3_;
			GameWorld.cameraYaw = i;
			Class79.renderY = i_5_ - i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gk.A(" + bool + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	public static void method1713(byte i) {
		try {
			if (i != 23)
				anInt897 = -82;
			aClass36Array903 = null;
			aClass171_901 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gk.B(" + i + ')');
		}
	}

	Class104(Interface16 interface16, int i, int i_13_, int i_14_) {
		try {
			((Class104) this).aByte898 = (byte) i_14_;
			((Class104) this).anInterface16_902 = interface16;
			((Class104) this).aShort899 = (short) i;
			((Class104) this).aByte900 = (byte) i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gk.<init>(" + (interface16 != null ? "{...}" : "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}
}
