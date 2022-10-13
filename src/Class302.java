/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class302 {
	RuneScapeCache aClass207_2512;
	boolean aBoolean2513 = false;
	private RuneScapeCache aClass207_2515;
	boolean aBoolean2516;
	static int[] anIntArray2517;
	static int anInt2518;
	private Class79 aClass79_2519 = new Class79(64);
	static OutgoingOpcode aClass171_2520 = new OutgoingOpcode(47, 3);
	static int[] anIntArray2521 = new int[4];
	Class79 aClass79_2522 = new Class79(500);
	static int anInt2523;
	static int anInt2524;
	Class79 aClass79_2525 = new Class79(30);
	static boolean aBoolean2526;
	Class79 aClass79_2527 = new Class79(50);
	int anInt2528;

	final Class352 method3546(int i, byte x) {
		try { //OBJECT DEFS
			Class352 class352;
			synchronized (aClass79_2519) {
				class352 = (Class352) aClass79_2519.get((long) i);
			}
			if (class352 != null)
				return class352;
			byte[] is;
			synchronized (aClass207_2515) {
				is = aClass207_2515.readArchive(Class151.method2444(i, -119), za.method1674(-1035933944, i));
			}
			class352 = new Class352();
			((Class352) class352).id = i;
			((Class352) class352).aClass302_2963 = this;
			if (is != null)
				class352.method3850(new RSByteBuffer(is), false);
			class352.method3865(118);
			if (!((Class302) this).aBoolean2516 && ((Class352) class352).aBoolean2927) {
				((Class352) class352).anIntArray2934 = null;
				((Class352) class352).aStringArray2939 = null;
			}
			if (((Class352) class352).clippingFlag) {
				((Class352) class352).walkable = false;
				((Class352) class352).actionCount = 0;
			}
			synchronized (aClass79_2519) {
				aClass79_2519.put((long) i, class352);
			}
			/*
			 * try { BufferedWriter writer = new BufferedWriter(new
			 * FileWriter("object_defs.txt", true)); Class352 def = (Class352) class352;
			 * writer.write(def.id + ", " + def.name + ", " + def.actionCount + ", " +
			 * def.walkable + ", " + def.clippingFlag + ", " + def.sizeX + ", " +
			 * def.sizeY); writer.newLine(); writer.flush(); } catch (IOException e) {
			 * e.printStackTrace(); }
			 */
			return class352;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.B(" + i + ',' + 0 + ')');
		}
	}

	final void method3547(byte i) {
		try {
			synchronized (aClass79_2519) {
				aClass79_2519.method806((byte) -90);
			}
			if (i > 126) {
				synchronized (((Class302) this).aClass79_2522) {
					((Class302) this).aClass79_2522.method806((byte) -105);
				}
				synchronized (((Class302) this).aClass79_2525) {
					((Class302) this).aClass79_2525.method806((byte) 99);
				}
				synchronized (((Class302) this).aClass79_2527) {
					((Class302) this).aClass79_2527.method806((byte) 8);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.J(" + i + ')');
		}
	}

	final void method3548(int i, byte i_1_) {
		try {
			synchronized (aClass79_2519) {
				aClass79_2519.method800((byte) 62, i);
			}
			synchronized (((Class302) this).aClass79_2522) {
				((Class302) this).aClass79_2522.method800((byte) 62, i);
			}
			synchronized (((Class302) this).aClass79_2525) {
				((Class302) this).aClass79_2525.method800((byte) 62, i);
			}
			if (i_1_ > 36) {
				synchronized (((Class302) this).aClass79_2527) {
					((Class302) this).aClass79_2527.method800((byte) 62, i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.A(" + i + ',' + i_1_ + ')');
		}
	}

	final void method3549(byte i) {
		try {
			synchronized (aClass79_2519) {
				aClass79_2519.method794(72);
				int i_2_ = -76 % ((i - 40) / 60);
			}
			synchronized (((Class302) this).aClass79_2522) {
				((Class302) this).aClass79_2522.method794(103);
			}
			synchronized (((Class302) this).aClass79_2525) {
				((Class302) this).aClass79_2525.method794(119);
			}
			synchronized (((Class302) this).aClass79_2527) {
				((Class302) this).aClass79_2527.method794(123);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.G(" + i + ')');
		}
	}

	final void method3550(int i, int i_3_) {
		try {
			if (i != -129)
				anInt2523 = -114;
			aClass79_2519 = new Class79(i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.E(" + i + ',' + i_3_ + ')');
		}
	}

	public static void method3551(int i) {
		try {
			aClass171_2520 = null;
			anIntArray2521 = null;
			IncomingOpcode.aClass58_2514 = null;
			if (i > -91)
				method3551(92);
			anIntArray2517 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.C(" + i + ')');
		}
	}

	final void method3552(boolean bool, int i) {
		do {
			try {
				if (((Class302) this).aBoolean2513 != bool) {
					((Class302) this).aBoolean2513 = bool;
					method3549((byte) 100);
					if (i > 18)
						break;
					((Class302) this).aClass79_2525 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sia.H(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method3553(int i, byte i_4_) {
		try {
			int i_5_ = i_4_ & 0xff;
			if ((i_5_ ^ 0xffffffff) == -1)
				return false;
			if ((i_5_ ^ 0xffffffff) <= -129 && i_5_ < 160 && (Class65.aCharArray497[i_5_ - 128] ^ 0xffffffff) == -1)
				return false;
			if (i > -116)
				anInt2524 = 55;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.I(" + i + ',' + i_4_ + ')');
		}
	}

	final void method3554(boolean bool, int i) {
		try {
			((Class302) this).anInt2528 = i;
			synchronized (((Class302) this).aClass79_2522) {
				((Class302) this).aClass79_2522.method794(91);
			}
			synchronized (((Class302) this).aClass79_2525) {
				((Class302) this).aClass79_2525.method794(102);
				if (bool != true)
					anInt2518 = 125;
			}
			synchronized (((Class302) this).aClass79_2527) {
				((Class302) this).aClass79_2527.method794(14);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.D(" + bool + ',' + i + ')');
		}
	}

	final void method3555(byte i, boolean bool) {
		try {
			int i_6_ = 35 % ((-83 - i) / 39);
			if (bool == !((Class302) this).aBoolean2516) {
				((Class302) this).aBoolean2516 = bool;
				method3549((byte) 123);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sia.F(" + i + ',' + bool + ')');
		}
	}

	Class302(Class279 class279, int i, boolean bool, RuneScapeCache class207, RuneScapeCache class207_7_) {
		do {
			try {
				((Class302) this).aBoolean2516 = bool;
				aClass207_2515 = class207;
				((Class302) this).aClass207_2512 = class207_7_;
				if (aClass207_2515 == null)
					break;
				int i_8_ = -1 + aClass207_2515.method2752((byte) -11);
				aClass207_2515.method2761(0, i_8_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sia.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class207 != null ? "{...}" : "null") + ',' + (class207_7_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
