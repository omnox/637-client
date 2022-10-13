/* Class21_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class21_Sub2 extends Class21 implements Interface4_Impl3 {
	static int[][] anIntArrayArray5386 = { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
	static int anInt5387 = -1;
	static int anInt5388;

	static final boolean method271(byte i, int i_0_, int i_1_) {
		try {
			if (i > -100)
				method273((byte) -47);
			if ((0x10000 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lq.E(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method272(byte i) {
		try {
			if (i == 86)
				anIntArrayArray5386 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lq.A(" + i + ')');
		}
	}

	Class21_Sub2(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i, boolean bool, int[][] is) {
		super(var_ha_Sub3_Sub2, 34067, Class62.aClass164_486, Class162.aClass162_1266, 6 * i * i, bool);
		try {
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -115);
			if (bool) {
				for (int i_2_ = 0; i_2_ < 6; i_2_++)
					this.method264(i, is[i_2_], i, 526364520, i_2_ + 34069);
			} else {
				for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -7; i_3_++)
					OpenGL.glTexImage2Di(34069 - -i_3_, 0, this.method260(0), i, i, 0, Class196.method2665(false, ((Class21) this).aClass164_3237), (((ha_Sub3_Sub2) ((Class21) this).aHa_Sub3_Sub2_3233).anInt6135), is[i_3_], 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lq.<init>(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method273(byte i) {// npc masks
		try {
			for (int i_4_ = 0; i_4_ < Class65.anInt502; i_4_++) {
				int i_5_ = Class76_Sub11.anIntArray3796[i_4_];
				Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) (Class98_Sub39) Class260.aClass377_3254.method3990((long) i_5_, -1)).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				int i_6_ = IncomingMessages.packetStream.readUnsignedByte();
				if ((0x20 & i_6_) != 0) {
					i_6_ += IncomingMessages.packetStream.readUnsignedByte() << 1706038888;
				}
				if ((0x2000 & i_6_) != 0) {
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6378 = IncomingMessages.packetStream.method1187((byte) 0);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6347 = IncomingMessages.packetStream.method1187((byte) 0);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6362 = IncomingMessages.packetStream.method1187((byte) -112);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6392 = IncomingMessages.packetStream.method1187((byte) 0);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6390 = IncomingMessages.packetStream.readShort() - -Class215.anInt1614;
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6424 = IncomingMessages.packetStream.readShort1((byte) -123) + Class215.anInt1614;
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6407 = IncomingMessages.packetStream.readByteC((byte) -109);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6362 += ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueX[0];
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6392 += ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueZ[0];
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6434 = 1;
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6378 += ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueX[0];
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6436 = 0;
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6347 += ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueZ[0];
				}
				if ((i_6_ & 0x4) != 0) {
					int i_7_ = IncomingMessages.packetStream.readByteC((byte) -121);
					if (i_7_ > 0) {
						for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
							int i_9_ = -1;
							int i_10_ = -1;
							int i_11_ = -1;
							int i_12_ = IncomingMessages.packetStream.readSmart(1689622712);
							if ((i_12_ ^ 0xffffffff) == -32768) {
								i_12_ = IncomingMessages.packetStream.readSmart(1689622712);
								i_10_ = IncomingMessages.packetStream.readSmart(1689622712);
								i_9_ = IncomingMessages.packetStream.readSmart(1689622712);
								i_11_ = IncomingMessages.packetStream.readSmart(1689622712);
							} else if (i_12_ != 32766)
								i_10_ = IncomingMessages.packetStream.readSmart(1689622712);
							else
								i_12_ = -1;
							int i_13_ = IncomingMessages.packetStream.readSmart(1689622712);
							int i_14_ = IncomingMessages.packetStream.readUnsignedByte();
							class246_sub3_sub4_sub2_sub1.method3037(i_14_, false, i_10_, i_12_, Class215.anInt1614, i_11_, i_13_, i_9_);
						}
					}
				}
				if ((0x4000 & i_6_ ^ 0xffffffff) != -1) {
					int i_15_ = ((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).anIntArray1117.length;
					int i_16_ = 0;
					if (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1105 != null)
						i_16_ = (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1105).length;
					if (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1137 != null)
						i_16_ = (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1137).length;
					int i_17_ = 0;
					int i_18_ = IncomingMessages.packetStream.readByteS();
					if ((0x1 & i_18_ ^ 0xffffffff) != -2) {
						int[] is = null;
						if ((0x2 & i_18_) == 2) {
							is = new int[i_15_];
							for (int i_19_ = 0; (i_15_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++)
								is[i_19_] = IncomingMessages.packetStream.readLEShortA((byte) -84);
						}
						short[] is_20_ = null;
						if ((0x4 & i_18_) == 4) {
							is_20_ = new short[i_16_];
							for (int i_21_ = 0; i_21_ < i_16_; i_21_++)
								is_20_[i_21_] = (short) IncomingMessages.packetStream.readShortA(51);
						}
						short[] is_22_ = null;
						if ((0x8 & i_18_ ^ 0xffffffff) == -9) {
							is_22_ = new short[i_17_];
							for (int i_23_ = 0; (i_17_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++)
								is_22_[i_23_] = (short) IncomingMessages.packetStream.readLEShortA((byte) 108);
						}
						long l = ((long) i_5_ | (long) ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6501++ << -1851073888);
						new Class40(l, is, is_20_, is_22_);
					}
				}
				if ((0x400 & i_6_ ^ 0xffffffff) != -1) {
					int i_24_ = IncomingMessages.packetStream.readShortA(96);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6394 = IncomingMessages.packetStream.readByteC((byte) -114);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6401 = IncomingMessages.packetStream.readUnsignedByte();
					((Mobile) class246_sub3_sub4_sub2_sub1).aBoolean6348 = (i_24_ & 0x8000) != 0;
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6420 = i_24_ & 0x7fff;
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6412 = (((Mobile) class246_sub3_sub4_sub2_sub1).anInt6420 + Class215.anInt1614 - -((Mobile) class246_sub3_sub4_sub2_sub1).anInt6394);
				}
				if ((0x2 & i_6_) != 0) {//Graphics
					int i_25_ = IncomingMessages.packetStream.readShortA(65);
					if ((i_25_ ^ 0xffffffff) == -65536)
						i_25_ = -1;
					int i_26_ = IncomingMessages.packetStream.readIntReverse(true);
					int i_27_ = IncomingMessages.packetStream.readByteC((byte) 119);
					int i_28_ = 0x7 & i_27_;
					int i_29_ = (0x79 & i_27_) >> 2140717763;
					if ((i_29_ ^ 0xffffffff) == -16)
						i_29_ = -1;
					class246_sub3_sub4_sub2_sub1.method3032(i_29_, false, i_26_, i_28_, i_25_, -117);
				}
				if ((i_6_ & 0x8 ^ 0xffffffff) != -1) {
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6364 = IncomingMessages.packetStream.readShort();
					if (((Mobile) class246_sub3_sub4_sub2_sub1).anInt6364 == 65535)
						((Mobile) class246_sub3_sub4_sub2_sub1).anInt6364 = -1;
				}
				if ((i_6_ & 0x8000 ^ 0xffffffff) != -1) {
					int i_30_ = ((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).anIntArray1107.length;
					int i_31_ = 0;
					if (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1105 != null)
						i_31_ = (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1105).length;
					int i_32_ = 0;
					if (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1137 != null)
						i_32_ = (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aShortArray1137).length;
					int i_33_ = IncomingMessages.packetStream.readUnsignedByte();
					if ((i_33_ & 0x1) == 1)
						((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass40_6502 = null;
					else {
						int[] is = null;
						if ((i_33_ & 0x2) == 2) {
							is = new int[i_30_];
							for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff); i_34_++)
								is[i_34_] = IncomingMessages.packetStream.readShortA(65);
						}
						short[] is_35_ = null;
						if ((i_33_ & 0x4 ^ 0xffffffff) == -5) {
							is_35_ = new short[i_31_];
							for (int i_36_ = 0; i_31_ > i_36_; i_36_++)
								is_35_[i_36_] = (short) IncomingMessages.packetStream.readShortA(85);
						}
						short[] is_37_ = null;
						if ((i_33_ & 0x8) == 8) {
							is_37_ = new short[i_32_];
							for (int i_38_ = 0; i_38_ < i_32_; i_38_++)
								is_37_[i_38_] = (short) IncomingMessages.packetStream.readShortA(106);
						}
						long l = ((long) i_5_ | (long) ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6503++ << 270238944);
						((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass40_6502 = new Class40(l, is, is_35_, is_37_);
					}
				}
				if ((0x800 & i_6_) != 0) {
					int i_39_ = IncomingMessages.packetStream.readByteA();
					int[] is = new int[i_39_];
					int[] is_40_ = new int[i_39_];
					for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
						int i_42_ = IncomingMessages.packetStream.readLEShortA((byte) 119);
						if ((i_42_ & 0xc000 ^ 0xffffffff) == -49153) {
							int i_43_ = IncomingMessages.packetStream.readLEShortA((byte) -28);
							is[i_41_] = Class41.method366(i_43_, i_42_ << 1873040720);
						} else
							is[i_41_] = i_42_;
						is_40_[i_41_] = IncomingMessages.packetStream.readShort();
					}
					class246_sub3_sub4_sub2_sub1.method3038(is_40_, is, true);
				}
				if ((0x80 & i_6_) != 0) {
					if (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504.method2302((byte) 97))
						Class98_Sub43_Sub4.method1504(class246_sub3_sub4_sub2_sub1, -16255);
					class246_sub3_sub4_sub2_sub1.method3054((Class4.aClass301_85.method3538(IncomingMessages.packetStream.readShort1((byte) -86))), 1);
					class246_sub3_sub4_sub2_sub1.method3045((byte) 88, ((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).anInt1112);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6414 = (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).anInt1091 << -821006205);
					if (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504.method2302((byte) 44))
						Class98_Sub31_Sub4.method1383(null, null, ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueX[0], 0, 3, ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueZ[0], (((AnimableEntity) class246_sub3_sub4_sub2_sub1).height_level), class246_sub3_sub4_sub2_sub1);
				}
				if ((0x10 & i_6_ ^ 0xffffffff) != -1) {
					int[] is = new int[4];
					for (int i_44_ = 0; i_44_ < 4; i_44_++) {
						is[i_44_] = IncomingMessages.packetStream.readShortA(49);
						if ((is[i_44_] ^ 0xffffffff) == -65536)
							is[i_44_] = -1;
					}
					int i_45_ = IncomingMessages.packetStream.readByteS();
					Class98_Sub43.method1483(i_45_, class246_sub3_sub4_sub2_sub1, 1, is);
				}
				if ((0x1000 & i_6_) != 0) {
					int i_46_ = IncomingMessages.packetStream.readByteA();
					int[] is = new int[i_46_];
					int[] is_47_ = new int[i_46_];
					int[] is_48_ = new int[i_46_];
					for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff); i_49_++) {
						int i_50_ = IncomingMessages.packetStream.readShort1((byte) 58);
						if (i_50_ == 65535)
							i_50_ = -1;
						is[i_49_] = i_50_;
						is_47_[i_49_] = IncomingMessages.packetStream.readByteS();
						is_48_[i_49_] = IncomingMessages.packetStream.readShort();
					}
					Class262.method3215(26256, is_47_, is_48_, class246_sub3_sub4_sub2_sub1, is);
				}
				if ((i_6_ & 0x100 ^ 0xffffffff) != -1) {
					int i_51_ = IncomingMessages.packetStream.readShortA(83);
					if (i_51_ == 65535)
						i_51_ = -1;
					int i_52_ = IncomingMessages.packetStream.readInt(-2);
					int i_53_ = IncomingMessages.packetStream.readByteC((byte) -106);
					int i_54_ = i_53_ & 0x7;
					int i_55_ = i_53_ >> -481470685 & 0xf;
					if ((i_55_ ^ 0xffffffff) == -16)
						i_55_ = -1;
					class246_sub3_sub4_sub2_sub1.method3032(i_55_, true, i_52_, i_54_, i_51_, -96);
				}
				if ((i_6_ & 0x40) != 0) {
					((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6510 = IncomingMessages.packetStream.readLEShortA((byte) 115);
					((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).anInt6505 = IncomingMessages.packetStream.readLEShortA((byte) 116);
				}
				if ((i_6_ & 0x200) != 0) {
					((Mobile) class246_sub3_sub4_sub2_sub1).aByte6404 = IncomingMessages.packetStream.readSignedByte();
					((Mobile) class246_sub3_sub4_sub2_sub1).aByte6381 = IncomingMessages.packetStream.method1187((byte) -112);
					((Mobile) class246_sub3_sub4_sub2_sub1).aByte6368 = IncomingMessages.packetStream.method1234(128);
					((Mobile) class246_sub3_sub4_sub2_sub1).aByte6422 = (byte) IncomingMessages.packetStream.readByteA();
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6403 = Class215.anInt1614 + IncomingMessages.packetStream.readLEShortA((byte) 96);
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6349 = Class215.anInt1614 - -IncomingMessages.packetStream.readShort1((byte) 100);
				}
				if ((0x1 & i_6_) != 0) {
					((Mobile) class246_sub3_sub4_sub2_sub1).aString6374 = IncomingMessages.packetStream.readString();
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6384 = 100;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lq.C(" + i + ')');
		}
	}

	static final void method274(byte i, int i_56_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_56_, -23, 9);
			class98_sub46_sub17.method1621(i + -83);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lq.D(" + i + ',' + i_56_ + ')');
		}
	}
}
