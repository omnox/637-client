/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class147 {
	String aString1185;
	String aString1186;
	byte aByte1187;
	int anInt1188;
	static String[] aStringArray1189;
	String aString1190;
	String aString1191;
	static int anInt1193 = 0;
	static int anInt1194;

	static final void method2411(int i) {
		try {
			Class76_Sub8.anInt3780 = 0;
			Class268.anInt2007 = i;
			for (int i_0_ = 0; Class63.anInt493 > i_0_; i_0_++) {
				int i_1_ = Class191.anInt1477 * i_0_;
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class191.anInt1477 ^ 0xffffffff); i_2_++) {
					int i_3_ = i_2_ + i_1_;
					Class172.anInterface17Array1327[i_3_].method56(Class197.anInt1513 * i_2_, Class98_Sub10_Sub38.anInt5761 * i_0_, Class197.anInt1513, Class98_Sub10_Sub38.anInt5761, 0, 0, true, true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kb.B(" + i + ')');
		}
	}

	static final void method2412(int i) {
		try {
			Class49.method477(-5788);
			IncomingOpcode.aClass58_4094 = null;
			Class98_Sub10_Sub6.anInt5569 = 0;
			Class65.anInt496 = 0;
			IncomingOpcode.aClass58_5641 = null;
			((RSByteBuffer) IncomingMessages.packetStream).position = 0;
			IncomingOpcode.currentIncommingOpcode = null;
			IncomingOpcode.aClass58_3262 = null;
			Class224_Sub1.anInt5031 = 0;
			Class64_Sub18.method622((byte) -38);
			Class248.method3159(0);
			if (i > -94)
				anInt1194 = -63;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -2049; i_4_++)
				Class151_Sub9.playerArray[i_4_] = null;
			Player.selfPlayer = null;
			for (int i_5_ = 0; i_5_ < Class98_Sub10_Sub20.anInt5640; i_5_++) {
				Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) Class163.aClass98_Sub39Array3516[i_5_]).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				if (class246_sub3_sub4_sub2_sub1 != null)
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6364 = -1;
			}
			Class98_Sub10_Sub34.method1106((byte) -61);
			Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
			Class98_Sub46_Sub20_Sub2.anInt6319 = 1;
			Class61.method538(10, false);
			for (int i_6_ = 0; i_6_ < 100; i_6_++)
				aa_Sub3.aBooleanArray3574[i_6_] = true;
			Class98_Sub17_Sub1.method1158(-2);
			Class284.aClass98_Sub4_2167 = null;
			Class11.aLong121 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kb.D(" + i + ')');
		}
	}

	static final void method2413(Class98_Sub22_Sub1 class98_sub22_sub1, int i) {
		try {
			for (int i_7_ = 0; (Class38.anInt354 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				int i_8_ = Class65.anIntArray501[i_7_];
				Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_8_]);
				int i_9_ = class98_sub22_sub1.readUnsignedByte();
				if ((0x20 & i_9_) != 0)
					i_9_ += (class98_sub22_sub1.readUnsignedByte() << -475812536);
				if ((0x800 & i_9_) != 0)
					i_9_ += (class98_sub22_sub1.readUnsignedByte() << 1299142480);
				PlayerUpdateMask.method709(class246_sub3_sub4_sub2_sub2, i_9_, class98_sub22_sub1, (byte) 82, i_8_);
			}
			if (i != 8429)
				method2413(null, 30);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kb.A(" + (class98_sub22_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public Class147() {
		/* empty */
	}

	public static void method2414(int i) {
		try {
			aStringArray1189 = null;
			if (i <= -96)
				IncomingOpcode.aClass58_1192 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kb.C(" + i + ')');
		}
	}
}
