/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class177 {
	int anInt1373 = -1;
	int anInt1374 = 64;
	static Class103 aClass103_1375;
	static int anInt1376 = 0;
	boolean aBoolean1377;
	static float aFloat1378 = 1.0F;
	int anInt1379;
	int anInt1380 = 64;
	static Class332[] aClass332Array1382;
	boolean aBoolean1383;
	int anInt1384;

	private final void method2583(RSByteBuffer class98_sub22, int i, int i_0_, int i_1_) {
		do {
			try {
				if (i_0_ == 6) {
					if (i != 1) {
						if ((i ^ 0xffffffff) == -3) {
							((Class177) this).anInt1374 = 1 + class98_sub22.readShort();
							((Class177) this).anInt1380 = class98_sub22.readShort() + 1;
						} else if ((i ^ 0xffffffff) != -4) {
							if ((i ^ 0xffffffff) != -5) {
								if ((i ^ 0xffffffff) != -6) {
									if (i != 6) {
										if (i == 7)
											((Class177) this).aBoolean1377 = true;
									} else
										((Class177) this).aBoolean1383 = true;
								} else
									((Class177) this).anInt1384 = class98_sub22.readUnsignedByte();
							} else
								((Class177) this).anInt1379 = class98_sub22.readUnsignedByte();
						} else
							class98_sub22.readSignedByte();
					} else {
						((Class177) this).anInt1373 = class98_sub22.readShort();
						if (((Class177) this).anInt1373 != 65535)
							break;
						((Class177) this).anInt1373 = -1;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lu.B(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class336 method2584(ha_Sub1 var_ha_Sub1, Class345[] class345s, boolean bool) {
		try {
			for (int i = 0; (class345s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (class345s[i] == null || (((Class345) class345s[i]).aLong2891 ^ 0xffffffffffffffffL) >= -1L)
					return null;
			}
			long l = OpenGL.glCreateProgramObjectARB();
			for (int i = 0; (i ^ 0xffffffff) > (class345s.length ^ 0xffffffff); i++)
				OpenGL.glAttachObjectARB(l, ((Class345) class345s[i]).aLong2891);
			OpenGL.glLinkProgramARB(l);
			if (bool != true)
				method2584(null, null, false);
			OpenGL.glGetObjectParameterivARB(l, 35714, Class145.anIntArray1177, 0);
			if ((Class145.anIntArray1177[0] ^ 0xffffffff) == -1) {
				if ((Class145.anIntArray1177[0] ^ 0xffffffff) == -1)
					System.out.println("Shader linking failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716, Class145.anIntArray1177, 1);
				if ((Class145.anIntArray1177[1] ^ 0xffffffff) < -2) {
					byte[] is = new byte[Class145.anIntArray1177[1]];
					OpenGL.glGetInfoLogARB(l, Class145.anIntArray1177[1], Class145.anIntArray1177, 0, is, 0);
					System.out.println(new String(is));
				}
				if (Class145.anIntArray1177[0] == 0) {
					for (int i = 0; (class345s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
						OpenGL.glDetachObjectARB(l, (((Class345) class345s[i]).aLong2891));
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class336(var_ha_Sub1, l, class345s);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lu.A(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + (class345s != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	public static void method2585(byte i) {
		try {
			aClass332Array1382 = null;
			if (i != 70)
				method2584(null, null, false);
			IncomingOpcode.smallVarcOpcode = null;
			aClass103_1375 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lu.D(" + i + ')');
		}
	}

	final void method2586(byte i, RSByteBuffer class98_sub22, int i_2_) {
		do {
			try {
				for (;;) {
					int i_3_ = class98_sub22.readUnsignedByte();
					if ((i_3_ ^ 0xffffffff) == -1)
						break;
					method2583(class98_sub22, i_3_, 6, i_2_);
				}
				if (i > 71)
					break;
				method2585((byte) -61);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lu.C(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	public Class177() {
		((Class177) this).aBoolean1377 = false;
		((Class177) this).aBoolean1383 = false;
		((Class177) this).anInt1384 = 1;
		((Class177) this).anInt1379 = 2;
	}
}
