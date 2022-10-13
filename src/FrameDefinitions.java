/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FrameDefinitions {
	private static short[] aShortArray92 = new short[500];
	Class98_Sub1 framemap = null;
	short[] aShortArray94;
	boolean aBoolean95;
	private static short[] aShortArray96;
	private static byte[] aByteArray97;
	private static short[] aShortArray98;
	byte[] aByteArray99;
	int anInt100 = 0;
	private static short[] aShortArray101 = new short[500];
	boolean aBoolean102 = false;
	private static short[] aShortArray103;
	boolean aBoolean104;
	short[] aShortArray105;
	short[] aShortArray106;
	short[] aShortArray107;
	short[] aShortArray108;

	public static void method183() {
		aShortArray103 = null;
		aShortArray101 = null;
		aShortArray96 = null;
		aShortArray92 = null;
		aShortArray98 = null;
		aByteArray97 = null;
	}

	FrameDefinitions(byte[] is, Class98_Sub1 class98_sub1) {
		((FrameDefinitions) this).aBoolean95 = false;
		((FrameDefinitions) this).aBoolean104 = false;
		((FrameDefinitions) this).framemap = class98_sub1;
		try {
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			RSByteBuffer class98_sub22_0_ = new RSByteBuffer(is);
			class98_sub22.readUnsignedByte();
			((RSByteBuffer) class98_sub22).position += 2;
			int i = class98_sub22.readUnsignedByte();
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			((RSByteBuffer) class98_sub22_0_).position = ((RSByteBuffer) class98_sub22).position + i;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((Class98_Sub1) ((FrameDefinitions) this).framemap).anIntArray3812[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = class98_sub22.readUnsignedByte();
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray103[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray101[i_1_] = (short) class98_sub22_0_.method1239(-80);
					else
						aShortArray101[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray96[i_1_] = (short) class98_sub22_0_.method1239(-76);
					else
						aShortArray96[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray92[i_1_] = (short) class98_sub22_0_.method1239(-82);
					else
						aShortArray92[i_1_] = i_7_;
					aByteArray97[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray101[i_1_] = (short) (aShortArray101[i_1_] << 2 & 0x3fff);
						aShortArray96[i_1_] = (short) (aShortArray96[i_1_] << 2 & 0x3fff);
						aShortArray92[i_1_] = (short) (aShortArray92[i_1_] << 2 & 0x3fff);
					}
					aShortArray98[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray98[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						((FrameDefinitions) this).aBoolean102 = true;
					else if (i_5_ == 7)
						((FrameDefinitions) this).aBoolean104 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						((FrameDefinitions) this).aBoolean95 = true;
					i_1_++;
				}
			}
			if (((RSByteBuffer) class98_sub22_0_).position != is.length)
				throw new RuntimeException();
			((FrameDefinitions) this).anInt100 = i_1_;
			((FrameDefinitions) this).aShortArray108 = new short[i_1_];
			((FrameDefinitions) this).aShortArray94 = new short[i_1_];
			((FrameDefinitions) this).aShortArray105 = new short[i_1_];
			((FrameDefinitions) this).aShortArray106 = new short[i_1_];
			((FrameDefinitions) this).aShortArray107 = new short[i_1_];
			((FrameDefinitions) this).aByteArray99 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				((FrameDefinitions) this).aShortArray108[i_8_] = aShortArray103[i_8_];
				((FrameDefinitions) this).aShortArray94[i_8_] = aShortArray101[i_8_];
				((FrameDefinitions) this).aShortArray105[i_8_] = aShortArray96[i_8_];
				((FrameDefinitions) this).aShortArray106[i_8_] = aShortArray92[i_8_];
				((FrameDefinitions) this).aShortArray107[i_8_] = aShortArray98[i_8_];
				((FrameDefinitions) this).aByteArray99[i_8_] = aByteArray97[i_8_];
			}
		} catch (Exception exception) {
			((FrameDefinitions) this).anInt100 = 0;
			((FrameDefinitions) this).aBoolean102 = false;
			((FrameDefinitions) this).aBoolean104 = false;
		}
	}

	static {
		aByteArray97 = new byte[500];
		aShortArray103 = new short[500];
		aShortArray98 = new short[500];
		aShortArray96 = new short[500];
	}
}
