
/* PlayerUpdateMask - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlayerUpdateMask {
	static OutgoingOpcode aClass171_524;
	static RuneScapeCache aClass207_525;
	static int anInt526 = 0;
	static Class259[] aClass259Array527;
	static int[][] pathDirections;
	static int anInt529;

	static final void method709(Player class246_sub3_sub4_sub2_sub2, int mask, Class98_Sub22_Sub1 class98_sub22_sub1, byte i_0_, int i_1_) {
		do {
			try {
				if ((0x400 & mask) != 0) {
					int i_2_ = class98_sub22_sub1.readShort1((byte) 51);
					class246_sub3_sub4_sub2_sub2.anInt6394 = class98_sub22_sub1.readByteA();
					class246_sub3_sub4_sub2_sub2.anInt6401 = class98_sub22_sub1.readByteS();
					class246_sub3_sub4_sub2_sub2.anInt6420 = i_2_ & 0x7fff;
					class246_sub3_sub4_sub2_sub2.aBoolean6348 = (i_2_ & 0x8000) != 0;
					class246_sub3_sub4_sub2_sub2.anInt6412 = (class246_sub3_sub4_sub2_sub2.anInt6420 + (Class215.anInt1614 - -class246_sub3_sub4_sub2_sub2.anInt6394));
				}
				byte i_3_ = -1;
				if ((mask & 0x4000) != 0) {
					int i_4_ = class98_sub22_sub1.readLEShortA((byte) -28);
					int i_5_ = class98_sub22_sub1.readInt2(-74);
					if (i_4_ == 65535)
						i_4_ = -1;
					int i_6_ = class98_sub22_sub1.readUnsignedByte();
					int i_7_ = 0x7 & i_6_;
					int i_8_ = (0x7e & i_6_) >> 3;
					if (i_8_ == 15)
						i_8_ = -1;
					class246_sub3_sub4_sub2_sub2.method3032(i_8_, true, i_5_, i_7_, i_4_, -94);
				}
				if ((mask & 0x2000) != 0)
					i_3_ = class98_sub22_sub1.method1184(-1498293360);
				if ((0x40000 & mask) != 0) {
					int i_9_ = class98_sub22_sub1.readByteS();
					int[] is = new int[i_9_];
					int[] is_10_ = new int[i_9_];
					for (int i_11_ = 0; i_9_ > i_11_; i_11_++) {
						int i_12_ = class98_sub22_sub1.readShort1((byte) 111);
						if ((0xc000 & i_12_) != 49152)
							is[i_11_] = i_12_;
						else {
							int i_13_ = class98_sub22_sub1.readShort1((byte) -76);
							is[i_11_] = Class41.method366(i_13_, i_12_ << 16);
						}
						is_10_[i_11_] = class98_sub22_sub1.readShort();
					}
					class246_sub3_sub4_sub2_sub2.method3038(is_10_, is, true);
				}
				if ((mask & 0x80) != 0) {
					int i_14_ = class98_sub22_sub1.readShort();
					int i_15_ = class98_sub22_sub1.readIntReverse(true);
					if (i_14_ == 65535)
						i_14_ = -1;
					int i_16_ = class98_sub22_sub1.readByteA();
					int i_17_ = 0x7 & i_16_;
					int i_18_ = 0xf & i_16_ >> 3;
					if (i_18_ == 15)
						i_18_ = -1;
					class246_sub3_sub4_sub2_sub2.method3032(i_18_, false, i_15_, i_17_, i_14_, -72);
				}
				if ((mask & 0x200) != 0) {
					class246_sub3_sub4_sub2_sub2.anInt6378 = class98_sub22_sub1.method1187((byte) -112);
					class246_sub3_sub4_sub2_sub2.anInt6347 = class98_sub22_sub1.method1184(-1498293360);
					class246_sub3_sub4_sub2_sub2.anInt6362 = class98_sub22_sub1.method1187((byte) -112);
					class246_sub3_sub4_sub2_sub2.anInt6392 = class98_sub22_sub1.method1187((byte) -112);
					class246_sub3_sub4_sub2_sub2.anInt6390 = class98_sub22_sub1.readShort1((byte) 92) + Class215.anInt1614;
					class246_sub3_sub4_sub2_sub2.anInt6424 = class98_sub22_sub1.readLEShortA((byte) -53) + Class215.anInt1614;
					class246_sub3_sub4_sub2_sub2.anInt6407 = class98_sub22_sub1.readByteA();
					if (!class246_sub3_sub4_sub2_sub2.aBoolean6532) {
						class246_sub3_sub4_sub2_sub2.anInt6347 += class246_sub3_sub4_sub2_sub2.walkQueueZ[0];
						class246_sub3_sub4_sub2_sub2.anInt6392 += class246_sub3_sub4_sub2_sub2.walkQueueZ[0];
						class246_sub3_sub4_sub2_sub2.anInt6378 += class246_sub3_sub4_sub2_sub2.walkQueueX[0];
						class246_sub3_sub4_sub2_sub2.anInt6362 += class246_sub3_sub4_sub2_sub2.walkQueueX[0];
						class246_sub3_sub4_sub2_sub2.anInt6434 = 1;
					} else {
						class246_sub3_sub4_sub2_sub2.anInt6347 += class246_sub3_sub4_sub2_sub2.anInt6541;
						class246_sub3_sub4_sub2_sub2.anInt6392 += class246_sub3_sub4_sub2_sub2.anInt6541;
						class246_sub3_sub4_sub2_sub2.anInt6378 += class246_sub3_sub4_sub2_sub2.anInt6521;
						class246_sub3_sub4_sub2_sub2.anInt6362 += class246_sub3_sub4_sub2_sub2.anInt6521;
						class246_sub3_sub4_sub2_sub2.anInt6434 = 0;
					}
					class246_sub3_sub4_sub2_sub2.anInt6436 = 0;
				}
				if ((mask & 0x4) != 0) {
					class246_sub3_sub4_sub2_sub2.anInt6512 = class98_sub22_sub1.readLEShortA((byte) 91);
					if (class246_sub3_sub4_sub2_sub2.anInt6434 == 0) {
						class246_sub3_sub4_sub2_sub2.method3042(class246_sub3_sub4_sub2_sub2.anInt6512, -8193);
						class246_sub3_sub4_sub2_sub2.anInt6512 = -1;
					}
				}
				if ((0x2 & mask) != 0) {
					int i_19_ = class98_sub22_sub1.readShort1((byte) -126);
					if (i_19_ == 65535)
						i_19_ = -1;
					class246_sub3_sub4_sub2_sub2.anInt6364 = i_19_;
				}
				if ((mask & 0x10000) != 0) {
					class246_sub3_sub4_sub2_sub2.aByte6404 = class98_sub22_sub1.method1187((byte) -112);
					class246_sub3_sub4_sub2_sub2.aByte6381 = class98_sub22_sub1.method1234(128);
					class246_sub3_sub4_sub2_sub2.aByte6368 = class98_sub22_sub1.method1234(128);
					class246_sub3_sub4_sub2_sub2.aByte6422 = (byte) class98_sub22_sub1.readUnsignedByte();
					class246_sub3_sub4_sub2_sub2.anInt6403 = (Class215.anInt1614 + class98_sub22_sub1.readLEShortA((byte) 97));
					class246_sub3_sub4_sub2_sub2.anInt6349 = (Class215.anInt1614 - -class98_sub22_sub1.readShortA(98));
				}
				if ((0x8 & mask) != 0) {//hit
					int i_20_ = class98_sub22_sub1.readUnsignedByte();
					if (i_20_ > 0) {
						for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
							int i_22_ = -1;
							int i_23_ = -1;
							int i_24_ = class98_sub22_sub1.readSmart(1689622712);
							int i_25_ = -1;
							if (i_24_ != 32767) {
								if (i_24_ == 32766)
									i_24_ = -1;
								else
									i_23_ = class98_sub22_sub1.readSmart(1689622712);
							} else {
								i_24_ = class98_sub22_sub1.readSmart(1689622712);
								i_23_ = class98_sub22_sub1.readSmart(1689622712);
								i_22_ = class98_sub22_sub1.readSmart(1689622712);
								i_25_ = class98_sub22_sub1.readSmart(1689622712);
							}
							int i_26_ = class98_sub22_sub1.readSmart(1689622712);
							int i_27_ = class98_sub22_sub1.readUnsignedByte();
							class246_sub3_sub4_sub2_sub2.method3037(i_27_, false, i_23_, i_24_, Class215.anInt1614, i_25_, i_26_, i_22_);
						}
					}
				}
				if ((mask & 0x10) != 0) {
					int[] is = new int[4];
					for (int i_28_ = 0; i_28_ < 4; i_28_++) {
						is[i_28_] = class98_sub22_sub1.readLEShortA((byte) -116);
						if (is[i_28_] == 65535)
							is[i_28_] = -1;
					}
					int i_29_ = class98_sub22_sub1.readByteC((byte) 58);
					Class181.method2608(i_29_, class246_sub3_sub4_sub2_sub2, is, 0);
				}
				if ((0x40 & mask) != 0) {
					int i_30_ = class98_sub22_sub1.readByteA();
					byte[] is = new byte[i_30_];
					RSByteBuffer class98_sub22 = new RSByteBuffer(is);
					class98_sub22_sub1.method1190(is, true, i_30_, 0);
					Class224_Sub3_Sub1.aClass98_Sub22Array6146[i_1_] = class98_sub22;
					class246_sub3_sub4_sub2_sub2.decodeAppearence(class98_sub22, (byte) 73);
				}
				if ((0x1000 & mask) != 0)
					class246_sub3_sub4_sub2_sub2.aBoolean6534 = class98_sub22_sub1.readByteA() == 1;
				if (i_0_ <= 7)
					DebugConsole.handleCommand(null, false, true, (byte) -128);
				if ((mask & 0x8000) != 0) {
					class246_sub3_sub4_sub2_sub2.aString6374 = class98_sub22_sub1.readString();
					if (class246_sub3_sub4_sub2_sub2.aString6374.charAt(0) == 126) {
						class246_sub3_sub4_sub2_sub2.aString6374 = class246_sub3_sub4_sub2_sub2.aString6374.substring(1);
						Class98_Sub45.add_message((byte) -96, 2, class246_sub3_sub4_sub2_sub2.aString6374, 0, class246_sub3_sub4_sub2_sub2.method3059(-1, false), class246_sub3_sub4_sub2_sub2.method3063(0, true), class246_sub3_sub4_sub2_sub2.name);
					} else if (class246_sub3_sub4_sub2_sub2 == Player.selfPlayer)
						Class98_Sub45.add_message((byte) 90, 2, class246_sub3_sub4_sub2_sub2.aString6374, 0, class246_sub3_sub4_sub2_sub2.method3059(-1, false), class246_sub3_sub4_sub2_sub2.method3063(0, true), class246_sub3_sub4_sub2_sub2.name);
					class246_sub3_sub4_sub2_sub2.anInt6384 = 150;
					class246_sub3_sub4_sub2_sub2.anInt6398 = 0;
					class246_sub3_sub4_sub2_sub2.anInt6402 = 0;
				}
				if ((0x100 & mask) != 0) {
					int i_31_ = class98_sub22_sub1.readByteC((byte) -109);
					int[] is = new int[i_31_];
					int[] is_32_ = new int[i_31_];
					int[] is_33_ = new int[i_31_];
					for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
						int i_35_ = class98_sub22_sub1.readShortA(79);
						if (i_35_ == 65535)
							i_35_ = -1;
						is[i_34_] = i_35_;
						is_32_[i_34_] = class98_sub22_sub1.readByteC((byte) 124);
						is_33_[i_34_] = class98_sub22_sub1.readLEShortA((byte) -37);
					}
					Class266.method3234(class246_sub3_sub4_sub2_sub2, -3433, is_33_, is_32_, is);
				}
				if ((0x1 & mask) != 0)
					Class98_Sub10_Sub21.aByteArray5642[i_1_] = class98_sub22_sub1.method1184(-1498293360);
				if (!class246_sub3_sub4_sub2_sub2.aBoolean6532)
					break;
				if (i_3_ != 127) {
					byte i_36_;
					if (i_3_ == -1)
						i_36_ = Class98_Sub10_Sub21.aByteArray5642[i_1_];
					else
						i_36_ = i_3_;
					Class282.method3334((byte) 37, i_36_, class246_sub3_sub4_sub2_sub2);
					class246_sub3_sub4_sub2_sub2.method3057(class246_sub3_sub4_sub2_sub2.anInt6521, class246_sub3_sub4_sub2_sub2.anInt6541, i_36_, -1);
				} else
					class246_sub3_sub4_sub2_sub2.method3060(class246_sub3_sub4_sub2_sub2.anInt6541, class246_sub3_sub4_sub2_sub2.anInt6521, 1470);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eia.B(" + ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}" : "null") + ',' + mask + ',' + (class98_sub22_sub1 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method711(int i) {
		try {
			if (i == -23308) {
				pathDirections = null;
				aClass207_525 = null;
				aClass171_524 = null;
				aClass259Array527 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eia.C(" + i + ')');
		}
	}

	static {
		aClass171_524 = new OutgoingOpcode(51, -1);
		pathDirections = new int[128][128];
	}
}
