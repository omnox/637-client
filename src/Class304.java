/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class304 {
	private RuneScapeCache aClass207_2532;
	static int anInt2533 = 0;
	static short[][] aShortArrayArray2534;
	private Class79 aClass79_2535 = new Class79(64);
	RuneScapeCache aClass207_2536;
	Class79 aClass79_2537 = new Class79(60);
	static int[] anIntArray2538 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int anInt2539;

	final void method3559(int i) {
		try {
			synchronized (aClass79_2535) {
				aClass79_2535.method806((byte) -126);
			}
			synchronized (((Class304) this).aClass79_2537) {
				((Class304) this).aClass79_2537.method806((byte) 23);
			}
			if (i != 4)
				((Class304) this).anInt2539 = -6;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sk.E(" + i + ')');
		}
	}

	final void method3560(int i, int i_0_) {
		try {
			((Class304) this).anInt2539 = i;
			synchronized (((Class304) this).aClass79_2537) {
				if (i_0_ != 0)
					aClass207_2532 = null;
				((Class304) this).aClass79_2537.method794(49);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sk.A(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method3561(int i) {
		do {
			try {
				anIntArray2538 = null;
				aShortArrayArray2534 = null;
				if (i == -19357)
					break;
				method3562(-126, -89, -59, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sk.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3562(int i, int i_1_, int i_2_, GameInterfaceData class293) {
		try {
			aa var_aa = class293.method3469(Class265.aHa1974, i + -3999);
			if (var_aa != null && i == 4096) {
				Class265.aHa1974.KA(i_1_, i_2_, i_1_ - -((GameInterfaceData) class293).anInt2311, ((GameInterfaceData) class293).anInt2258 + i_2_);
				if (Class333.anInt3386 < 3)
					Class334.aClass332_3471.method3739(((float) i_1_ + (float) ((GameInterfaceData) class293).anInt2311 / 2.0F), ((float) i_2_ + (float) ((GameInterfaceData) class293).anInt2258 / 2.0F), 4096, (((int) -GameWorld.cameraGetHrot & 0x3fff) << -1645068286), var_aa, i_1_, i_2_);
				else
					Class265.aHa1974.A(-16777216, var_aa, i_1_, i_2_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sk.B(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3563(int i, GameInterfaceData class293, int i_3_, int i_4_) {
		try {
			Class341.anInt2858 = i_3_;
			if (i_4_ == 60) {
				Class314.anInt2690 = i;
				Class282.aClass293_2129 = class293;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sk.G(" + i + ',' + (class293 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final Class107 method3564(int i, int i_5_) {
		try {
			Class107 class107;
			synchronized (aClass79_2535) {
				class107 = (Class107) aClass79_2535.get((long) i_5_);
			}
			if (class107 != null)
				return class107;
			byte[] is;
			synchronized (aClass207_2532) {
				is = aClass207_2532.readArchive(Class314.method3637(i ^ ~0x3a87, i_5_), Class329.method3711((byte) 117, i_5_));
				if (i != 2)
					((Class304) this).anInt2539 = 42;
			}
			class107 = new Class107();
			((Class107) class107).aClass304_921 = this;
			((Class107) class107).anInt925 = i_5_;
			if (is != null)
				class107.method1725(i + -2, new RSByteBuffer(is));
			synchronized (aClass79_2535) {
				aClass79_2535.put((long) i_5_, class107);
			}
			return class107;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sk.F(" + i + ',' + i_5_ + ')');
		}
	}

	final void method3565(byte i) {
		try {
			synchronized (aClass79_2535) {
				aClass79_2535.method794(46);
			}
			if (i == 0) {
				synchronized (((Class304) this).aClass79_2537) {
					((Class304) this).aClass79_2537.method794(89);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sk.D(" + i + ')');
		}
	}

	final void method3566(byte i, int i_6_) {
		try {
			synchronized (aClass79_2535) {
				aClass79_2535.method800((byte) 62, i_6_);
				if (i != -53)
					method3563(-6, null, -120, 48);
			}
			synchronized (((Class304) this).aClass79_2537) {
				((Class304) this).aClass79_2537.method800((byte) 62, i_6_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sk.H(" + i + ',' + i_6_ + ')');
		}
	}

	Class304(Class279 class279, int i, RuneScapeCache class207, RuneScapeCache class207_7_) {
		try {
			((Class304) this).aClass207_2536 = class207_7_;
			aClass207_2532 = class207;
			int i_8_ = aClass207_2532.method2752((byte) -11) + -1;
			aClass207_2532.method2761(0, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sk.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ',' + (class207_7_ != null ? "{...}" : "null") + ')'));
		}
	}
}
