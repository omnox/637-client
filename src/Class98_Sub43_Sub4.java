
/* Class98_Sub43_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Class98_Sub43_Sub4 extends Class98_Sub43 {
	private int anInt5930;
	private String aString5931;
	static String[] aStringArray5932 = new String[100];
	private String aString5933;
	static short aShort5934 = 205;
	private float aFloat5935;
	private int anInt5936;
	private String aString5937;
	static int anInt5938;
	private float aFloat5939;
	static float[] aFloatArray5940 = new float[4];

	final String method1503(int i) {
		try {
			if (i != 22875)
				anInt5936 = 92;
			return aString5937;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.G(" + i + ')');
		}
	}

	static final void method1504(Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1, int i) {
		try {
			if (i != -16255)
				method1508(-54, -22, null);
			for (Class98_Sub42 class98_sub42 = ((Class98_Sub42) Class358.aClass148_3032.method2418(i + 16287)); class98_sub42 != null; class98_sub42 = ((Class98_Sub42) Class358.aClass148_3032.method2417(i ^ ~0x3f24))) {
				if ((((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209) == class246_sub3_sub4_sub2_sub1) {
					if ((((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232) != null) {
						Class81.aClass98_Sub31_Sub3_619.method1374(((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232);
						((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232 = null;
					}
					class98_sub42.remove();
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wda.D(" + ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method1482(OggPacket oggpacket, boolean bool) {
		do {
			try {
				if (((Class98_Sub43) this).anInt4240 <= 0 || "SUB".equals(aString5931)) {
					RSByteBuffer class98_sub22 = new RSByteBuffer(oggpacket.getData());
					if (bool != false)
						method1510(-72);
					int i = class98_sub22.readUnsignedByte();
					if (((Class98_Sub43) this).anInt4240 > 8) {
						if (i == 0) {
							long l = class98_sub22.method1189((byte) -53);
							long l_0_ = class98_sub22.method1189((byte) -63);
							long l_1_ = class98_sub22.method1189((byte) -110);
							if (l < 0L || (l_0_ ^ 0xffffffffffffffffL) > -1L || l_1_ < 0L || ((l_1_ ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL)))
								throw new IllegalStateException();
							aFloat5939 = ((float) ((long) anInt5936 * l) / (float) anInt5930);
							aFloat5935 = ((float) ((long) anInt5936 * (l - -l_0_)) / (float) anInt5930);
							int i_2_ = class98_sub22.method1202((byte) -75);
							if ((i_2_ ^ 0xffffffff) > -1 || i_2_ > ((((RSByteBuffer) class98_sub22).data).length - (((RSByteBuffer) class98_sub22).position)))
								throw new IllegalStateException();
							aString5937 = za_Sub1.method1679(((RSByteBuffer) class98_sub22).position, i_2_, (byte) -51, (((RSByteBuffer) class98_sub22).data));
						}
						if ((0x80 | i) != 0)
							break;
					} else {
						if (((i | 0x80) ^ 0xffffffff) == -1)
							throw new IllegalStateException();
						if ((((Class98_Sub43) this).anInt4240 ^ 0xffffffff) != -1)
							break;
						((RSByteBuffer) class98_sub22).position += 23;
						anInt5930 = class98_sub22.method1202((byte) -51);
						anInt5936 = class98_sub22.method1202((byte) -108);
						if (anInt5930 == 0 || anInt5936 == 0)
							throw new IllegalStateException();
						RSByteBuffer class98_sub22_3_ = new RSByteBuffer(16);
						class98_sub22.method1190((((RSByteBuffer) class98_sub22_3_).data), true, 16, 0);
						aString5933 = class98_sub22_3_.readString();
						((RSByteBuffer) class98_sub22_3_).position = 0;
						class98_sub22.method1190((((RSByteBuffer) class98_sub22_3_).data), !bool, 16, 0);
						aString5931 = class98_sub22_3_.readString();
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("wda.J(" + (oggpacket != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public static void method1505(int i) {
		do {
			try {
				aFloatArray5940 = null;
				aStringArray5932 = null;
				if (i == 21237)
					break;
				aShort5934 = (short) -113;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wda.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean findPathForSingleSize(int entityCost, int i_4_, int targetY, int startX, int objectFlag, int radiusX, Collision collision, int radiusY, int i_10_, int targetX, int startY) {
		try {
			int checkX = startX;
			int checkY = startY;
			int localX = 64;
			if (i_4_ != 14664)
				method1504(null, -75);
			int localY = 64;
			int absoluteX = -localX + startX;
			int absoluteY = startY + -localY;
			PlayerUpdateMask.pathDirections[localX][localY] = 99;
			Class339.pathCosts[localX][localY] = 0;
			int writerPointer = 0;
			int readerPointer = 0;
			Class359.pathBufferX[writerPointer] = checkX;
			Class75.pathBufferY[writerPointer++] = checkY;
			int[][] flags = ((Collision) collision).flags;
			while (writerPointer != readerPointer) {
				checkX = Class359.pathBufferX[readerPointer];
				checkY = Class75.pathBufferY[readerPointer];
				localX = checkX - absoluteX;
				localY = -absoluteY + checkY;
				int flagOffsetX = -((Collision) collision).anInt1854 + checkX;
				readerPointer = 1 + readerPointer & 0xfff;
				int flagOffsetY = checkY + -((Collision) collision).anInt1855;
				int cost = entityCost;
				while_249_: do {
					while_248_: do {
						while_247_: do {
							while_246_: do {
								do {
									if ((cost ^ 0xffffffff) != 3) {
										if ((cost ^ 0xffffffff) != 2) {
											if (cost != -2) {
												if (cost != -1) {
													if (((cost ^ 0xffffffff) == -1) || cost == 1 || cost == 2 || cost == 3 || ((cost ^ 0xffffffff) == -10))
														break while_247_;
													break while_248_;
												}
											} else
												break;
											break while_246_;
										}
									} else {
										if (((radiusX ^ 0xffffffff) == (checkX ^ 0xffffffff)) && checkY == radiusY) {
											Class22.pathEndY = checkY;
											Class199.pathEndX = checkX;
											return true;
										}
										break while_249_;
									}
									if (Class98_Sub5.method960(radiusX, targetX, -105, checkY, targetY, checkX, radiusY, 1, 1)) {
										Class199.pathEndX = checkX;
										Class22.pathEndY = checkY;
										return true;
									}
									break while_249_;
								} while (false);
								if (collision.method2936(radiusX, targetY, radiusY, -1, checkY, targetX, 1, checkX, 1, objectFlag)) {
									Class22.pathEndY = checkY;
									Class199.pathEndX = checkX;
									return true;
								}
								break while_249_;
							} while (false);
							if (collision.method2939(targetX, radiusX, checkY, 14672, 1, radiusY, objectFlag, checkX, targetY)) {
								Class22.pathEndY = checkY;
								Class199.pathEndX = checkX;
								return true;
							}
							break while_249_;
						} while (false);
						if (collision.method2952(radiusY, checkX, (byte) -110, 1, checkY, i_10_, radiusX, entityCost)) {
							Class22.pathEndY = checkY;
							Class199.pathEndX = checkX;
							return true;
						}
						break while_249_;
					} while (false);
					if (collision.method2938(radiusX, i_10_, checkY, radiusY, entityCost, 17761, 1, checkX)) {
						Class22.pathEndY = checkY;
						Class199.pathEndX = checkX;
						return true;
					}
				} while (false);
				cost = Class339.pathCosts[localX][localY] + 1;
				if (localX > 0 && (PlayerUpdateMask.pathDirections[localX + -1][localY] ^ 0xffffffff) == -1 && ((flags[flagOffsetX + -1][flagOffsetY] & 0x42240000 ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[writerPointer] = checkX - 1;
					Class75.pathBufferY[writerPointer] = checkY;
					PlayerUpdateMask.pathDirections[localX - 1][localY] = 2;
					writerPointer = 0xfff & 1 + writerPointer;
					Class339.pathCosts[localX + -1][localY] = cost;
				}
				if ((localX ^ 0xffffffff) > -128 && PlayerUpdateMask.pathDirections[1 + localX][localY] == 0 && ((0x60240000 & flags[1 + flagOffsetX][flagOffsetY] ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[writerPointer] = 1 + checkX;
					Class75.pathBufferY[writerPointer] = checkY;
					PlayerUpdateMask.pathDirections[1 + localX][localY] = 8;
					writerPointer = writerPointer + 1 & 0xfff;
					Class339.pathCosts[1 + localX][localY] = cost;
				}
				if (localY > 0 && (PlayerUpdateMask.pathDirections[localX][-1 + localY] ^ 0xffffffff) == -1 && (flags[flagOffsetX][-1 + flagOffsetY] & 0x40a40000) == 0) {
					Class359.pathBufferX[writerPointer] = checkX;
					Class75.pathBufferY[writerPointer] = checkY - 1;
					PlayerUpdateMask.pathDirections[localX][localY - 1] = 1;
					writerPointer = writerPointer + 1 & 0xfff;
					Class339.pathCosts[localX][localY + -1] = cost;
				}
				if (localY < 127 && PlayerUpdateMask.pathDirections[localX][localY - -1] == 0 && ((flags[flagOffsetX][1 + flagOffsetY] & 0x48240000 ^ 0xffffffff) == -1)) {
					Class359.pathBufferX[writerPointer] = checkX;
					Class75.pathBufferY[writerPointer] = checkY - -1;
					writerPointer = writerPointer + 1 & 0xfff;
					PlayerUpdateMask.pathDirections[localX][localY - -1] = 4;
					Class339.pathCosts[localX][1 + localY] = cost;
				}
				if (localX > 0 && (localY ^ 0xffffffff) < -1 && (PlayerUpdateMask.pathDirections[-1 + localX][localY - 1] ^ 0xffffffff) == -1 && (flags[flagOffsetX + -1][flagOffsetY - 1] & 0x43a40000) == 0 && (flags[-1 + flagOffsetX][flagOffsetY] & 0x42240000 ^ 0xffffffff) == -1 && (0x40a40000 & flags[flagOffsetX][-1 + flagOffsetY]) == 0) {
					Class359.pathBufferX[writerPointer] = -1 + checkX;
					Class75.pathBufferY[writerPointer] = checkY + -1;
					writerPointer = 0xfff & 1 + writerPointer;
					PlayerUpdateMask.pathDirections[-1 + localX][-1 + localY] = 3;
					Class339.pathCosts[-1 + localX][-1 + localY] = cost;
				}
				if (localX < 127 && localY > 0 && PlayerUpdateMask.pathDirections[localX + 1][-1 + localY] == 0 && ((flags[1 + flagOffsetX][flagOffsetY - 1] & 0x60e40000 ^ 0xffffffff) == -1) && (flags[1 + flagOffsetX][flagOffsetY] & 0x60240000) == 0 && (flags[flagOffsetX][flagOffsetY - 1] & 0x40a40000) == 0) {
					Class359.pathBufferX[writerPointer] = checkX - -1;
					Class75.pathBufferY[writerPointer] = checkY - 1;
					writerPointer = 0xfff & 1 + writerPointer;
					PlayerUpdateMask.pathDirections[localX - -1][-1 + localY] = 9;
					Class339.pathCosts[1 + localX][localY + -1] = cost;
				}
				if ((localX ^ 0xffffffff) < -1 && (localY ^ 0xffffffff) > -128 && (PlayerUpdateMask.pathDirections[-1 + localX][localY + 1] ^ 0xffffffff) == -1 && (flags[-1 + flagOffsetX][flagOffsetY + 1] & 0x4e240000) == 0 && (0x42240000 & flags[flagOffsetX - 1][flagOffsetY]) == 0 && (0x48240000 & flags[flagOffsetX][flagOffsetY + 1]) == 0) {
					Class359.pathBufferX[writerPointer] = -1 + checkX;
					Class75.pathBufferY[writerPointer] = checkY - -1;
					PlayerUpdateMask.pathDirections[-1 + localX][1 + localY] = 6;
					writerPointer = 1 + writerPointer & 0xfff;
					Class339.pathCosts[localX + -1][localY + 1] = cost;
				}
				if ((localX ^ 0xffffffff) > -128 && (localY ^ 0xffffffff) > -128 && (PlayerUpdateMask.pathDirections[localX - -1][localY + 1] ^ 0xffffffff) == -1 && (0x78240000 & flags[flagOffsetX + 1][1 + flagOffsetY]) == 0 && (0x60240000 & flags[1 + flagOffsetX][flagOffsetY]) == 0 && (0x48240000 & flags[flagOffsetX][1 + flagOffsetY]) == 0) {
					Class359.pathBufferX[writerPointer] = 1 + checkX;
					Class75.pathBufferY[writerPointer] = checkY + 1;
					PlayerUpdateMask.pathDirections[localX - -1][localY - -1] = 12;
					writerPointer = 0xfff & writerPointer + 1;
					Class339.pathCosts[1 + localX][1 + localY] = cost;
				}
			}
			Class199.pathEndX = checkX;
			Class22.pathEndY = checkY;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wda.A(" + entityCost + ',' + i_4_ + ',' + targetY + ',' + startX + ',' + objectFlag + ',' + radiusX + ',' + (collision != null ? "{...}" : "null") + ',' + radiusY + ',' + i_10_ + ',' + targetX + ',' + startY + ')'));
		}
	}

	final String method1507(boolean bool) {
		try {
			if (bool != true)
				return null;
			return aString5933;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.E(" + bool + ')');
		}
	}

	final void method1487(int i) {
		do {
			try {
				if (i == -1128)
					break;
				method1510(33);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wda.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method1508(int i, int i_24_, String string) {
		try {
			if (i != 1)
				aStringArray5932 = null;
			return PlayerUpdate.method2859(i_24_, true, string, i ^ ~0x55d2);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wda.K(" + i + ',' + i_24_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class98_Sub43_Sub4(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	final float method1509(int i) {
		try {
			if (i != -6085)
				return 2.7172983F;
			return aFloat5935;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.F(" + i + ')');
		}
	}

	static final void method1510(int i) {
		try {
			RtKeyListener.key_listener.method773((byte) -30);
			if (i != 28837)
				anInt5938 = -111;
			Class2.aClass299_73.method3515(-119);
			Class315.aClient3529.method87(i + -28837);
			Class42_Sub3.aCanvas5361.setBackground(Color.black);
			Class325.anInt2729 = -1;
			RtKeyListener.key_listener = Class368.method3950((byte) 10, Class42_Sub3.aCanvas5361);
			Class2.aClass299_73 = Class151_Sub3.method2457(Class42_Sub3.aCanvas5361, true, -16777216);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.I(" + i + ')');
		}
	}

	final float method1511(int i) {
		try {
			if (i >= -38)
				aShort5934 = (short) 29;
			return aFloat5939;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.H(" + i + ')');
		}
	}
}
