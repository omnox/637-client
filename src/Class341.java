/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class341 {
	RuneScapeCache aClass207_2852;
	static OutgoingOpcode aClass171_2853 = new OutgoingOpcode(17, -1);
	private Class79 aClass79_2854 = new Class79(128);
	private RuneScapeCache aClass207_2855;
	static int anInt2856 = 100;
	Class79 aClass79_2857 = new Class79(64);
	static int anInt2858 = -1;

	final void method3806(int i, boolean bool) {
		try {
			if (bool != false)
				anInt2856 = 20;
			synchronized (aClass79_2854) {
				aClass79_2854.method800((byte) 62, i);
			}
			synchronized (((Class341) this).aClass79_2857) {
				((Class341) this).aClass79_2857.method800((byte) 62, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.C(" + i + ',' + bool + ')');
		}
	}

	final Class24 method3807(int i, int i_0_) { // Map Loading
		try {
			Class24 class24;
			synchronized (aClass79_2854) {
				class24 = (Class24) aClass79_2854.get((long) i_0_);
			}
			if (class24 != null)
				return class24;
			int i_1_ = -89 % ((i - 44) / 53);
			byte[] is;
			synchronized (aClass207_2855) {
				is = aClass207_2855.readArchive(i_0_, 36);
			}
			class24 = new Class24();
			((Class24) class24).anInt228 = i_0_;
			((Class24) class24).aClass341_233 = this;
			if (is != null)
				class24.method290(new RSByteBuffer(is), 5);
			class24.method291(-25798);
			synchronized (aClass79_2854) {
				aClass79_2854.put((long) i_0_, class24);
			}
			return class24;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.B(" + i + ',' + i_0_ + ')');
		}
	}

	final void method3808(int i) {
		try {
			synchronized (aClass79_2854) {
				aClass79_2854.method794(84);
				if (i != 0)
					anInt2856 = 80;
			}
			synchronized (((Class341) this).aClass79_2857) {
				((Class341) this).aClass79_2857.method794(i ^ 0x3d);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.F(" + i + ')');
		}
	}

	final void method3809(int i, int i_2_, int i_3_) {
		try {
			if (i_2_ != -30502)
				aClass171_2853 = null;
			aClass79_2854 = new Class79(i_3_);
			((Class341) this).aClass79_2857 = new Class79(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("up.A(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method3810(byte i) {
		try {
			while ((IncomingMessages.packetStream.method1258(Class65.anInt496, 75) ^ 0xffffffff) <= -16) {
				int i_4_ = IncomingMessages.packetStream.readBits((byte) -111, 15);
				if (i_4_ == 32767)
					break;
				boolean bool = false;
				Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990((long) i_4_, -1));
				if (class98_sub39 == null) {
					Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = new Class246_Sub3_Sub4_Sub2_Sub1();
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6369 = i_4_;
					class98_sub39 = new Class98_Sub39(class246_sub3_sub4_sub2_sub1);
					Class260.aClass377_3254.method3996(class98_sub39, (long) i_4_, -1);
					bool = true;
					Class163.aClass98_Sub39Array3516[Class98_Sub10_Sub20.anInt5640++] = class98_sub39;
				}
				Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				Class325.anIntArray2726[Class150.anInt1211++] = i_4_;
				((Mobile) class246_sub3_sub4_sub2_sub1).anInt6406 = Class201.anInt1544;
				if (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504 != null && ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504.method2302((byte) 65))
					Class98_Sub43_Sub4.method1504(class246_sub3_sub4_sub2_sub1, -16255);
				class246_sub3_sub4_sub2_sub1.method3054((Class4.aClass301_85.method3538(IncomingMessages.packetStream.readBits((byte) -64, 14))), 1);
				int i_5_ = IncomingMessages.packetStream.readBits((byte) -67, 1);
				int i_6_ = IncomingMessages.packetStream.readBits((byte) -24, 5);
				if ((i_6_ ^ 0xffffffff) < -16)
					i_6_ -= 32;
				int i_7_ = IncomingMessages.packetStream.readBits((byte) -34, 5);
				if ((i_7_ ^ 0xffffffff) < -16)
					i_7_ -= 32;
				int i_8_ = IncomingMessages.packetStream.readBits((byte) -25, 2);
				int i_9_ = IncomingMessages.packetStream.readBits((byte) -68, 1);
				if (i_9_ == 1)
					Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_4_;
				int i_10_ = (4 + IncomingMessages.packetStream.readBits((byte) -70, 3) << 280873515 & 0x3ee3);
				class246_sub3_sub4_sub2_sub1.method3045((byte) 87, ((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).anInt1112);
				((Mobile) class246_sub3_sub4_sub2_sub1).anInt6414 = ((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).anInt1091 << -90290813;
				if (bool)
					class246_sub3_sub4_sub2_sub1.method3047(i_10_, true, 31);
				class246_sub3_sub4_sub2_sub1.method3049(class246_sub3_sub4_sub2_sub1.getSize(), i_6_ + (((Mobile) Player.selfPlayer).walkQueueX[0]), (i_5_ ^ 0xffffffff) == -2, (byte) -106, i_7_ + (((Mobile) Player.selfPlayer).walkQueueZ[0]), i_8_);
				if (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504.method2302((byte) 24))
					Class98_Sub31_Sub4.method1383(null, null, ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueX[0], 0, 3, ((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueZ[0], (((AnimableEntity) class246_sub3_sub4_sub2_sub1).height_level), class246_sub3_sub4_sub2_sub1);
			}
			if (i >= 112)
				IncomingMessages.packetStream.method1254((byte) 120);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.G(" + i + ')');
		}
	}

	public static void method3811(int i) {
		try {
			if (i == -8433)
				aClass171_2853 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.H(" + i + ')');
		}
	}

	static final void method3812(int i, GameInterfaceData class293) {
		do {
			try {
				if (Class77_Sub1.anInt3803 == ((GameInterfaceData) class293).anInt2250)
					aa_Sub3.aBooleanArray3574[((GameInterfaceData) class293).anInt2238] = true;
				if (i == 1)
					break;
				method3811(91);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("up.D(" + i + ',' + (class293 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class341(Class279 class279, int i, RuneScapeCache class207, RuneScapeCache class207_11_) {
		try {
			((Class341) this).aClass207_2852 = class207_11_;
			aClass207_2855 = class207;
			aClass207_2855.method2761(0, 36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("up.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ',' + (class207_11_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3813(int i) {
		try {
			synchronized (aClass79_2854) {
				if (i != 36)
					return;
				aClass79_2854.method806((byte) -118);
			}
			synchronized (((Class341) this).aClass79_2857) {
				((Class341) this).aClass79_2857.method806((byte) 61);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.E(" + i + ')');
		}
	}
}
