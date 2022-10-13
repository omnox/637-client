/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132 {
	static int anInt1043 = 0;
	static int[] anIntArray1044;
	private RuneScapeCache aClass207_1045;
	static int anInt1046;
	int anInt1047;
	static Class98_Sub48 aClass98_Sub48_1048 = new Class98_Sub48(0, 0);
	private Class79 aClass79_1049 = new Class79(64);
	static int anInt1050 = -1;

	public static void method2234(int i) {
		try {
			aClass98_Sub48_1048 = null;
			if (i == 0)
				anIntArray1044 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iu.B(" + i + ')');
		}
	}

	static final int method2235(int i, int i_0_, byte i_1_) {
		try {
			if (i_1_ != 98)
				anIntArray1044 = null;
			int i_2_;
			if (i <= 20000) {
				if (i > 10000) {
					i_2_ = 3;
					Class98_Sub50.method1672((byte) 19);
				} else if (i > 5000) {
					Class287.method3385((byte) 66);
					i_2_ = 2;
				} else {
					Class98_Sub32.method1436(i_1_ + -216, true);
					i_2_ = 1;
				}
			} else {
				Class98_Sub27.method1284(1);
				i_2_ = 4;
			}
			if (i_0_ != Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 125)) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_0_, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
				Class76_Sub4.method754(i_0_, false, i_1_ + -215);
			}
			Class310.method3618(-5964);
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iu.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2236(boolean bool, int i, String string, String string_3_, int i_4_) {
		do {
			try {
				OutgoingPacket class98_sub11 = Class98_Sub46_Sub9.method1556(false);
				class98_sub11.packet.writeByte(Class298.aClass222_2485.anInt1668);
				class98_sub11.packet.writeShort(0);
				int i_5_ = (class98_sub11.packet.position);
				class98_sub11.packet.writeShort(637);
				int[] is = Class42_Sub2.method389(12206, class98_sub11);
				int i_6_ = (class98_sub11.packet.position);
				class98_sub11.packet.method1188(string_3_, (byte) 113);
				class98_sub11.packet.writeShort(Class98_Sub10_Sub15.anInt5619);
				class98_sub11.packet.method1188(string, (byte) 113);
				class98_sub11.packet.method1221(-75, Class197.aLong1515);
				class98_sub11.packet.writeByte(Class374.anInt3159);
				class98_sub11.packet.writeByte(Class4.aClass279_86.anInt2095);
				ParamType.method2430((class98_sub11.packet), (byte) 0);
				String string_7_ = Class98_Sub10_Sub7.aString5573;
				class98_sub11.packet.writeByte(string_7_ == null ? 0 : 1);
				if (string_7_ != null)
					class98_sub11.packet.method1188(string_7_, (byte) 113);
				class98_sub11.packet.writeByte(i_4_);
				class98_sub11.packet.writeByte(bool ? 1 : 0);
				class98_sub11.packet.position += 7;
				class98_sub11.packet.method1235(true, is, i_6_, class98_sub11.packet.position);
				class98_sub11.packet.method1207((byte) 90, -i_5_ + (class98_sub11.packet.position));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				Class21_Sub4.anInt5394 = 1;
				Class372.anInt3150 = i;
				Class98_Sub26.anInt4028 = 0;
				Class55.anInt442 = -3;
				if (i_4_ >= 13)
					break;
				ha.aBoolean940 = true;
				MapRegion.method3571(-97);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("iu.D(" + bool + ',' + i + ',' + (string != null ? "{...}" : "null") + ',' + (string_3_ != null ? "{...}" : "null") + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final Class90 method2237(int i, int i_8_) {
		try {
			Class90 class90;
			synchronized (aClass79_1049) {
				class90 = (Class90) aClass79_1049.get(i);
			}
			if (class90 != null)
				return class90;
			if (i_8_ <= 39)
				method2235(-23, -51, (byte) 7);
			byte[] is;
			synchronized (aClass207_1045) {
				is = aClass207_1045.readArchive(i, 19);
			}
			class90 = new Class90();
			if (is != null)
				class90.method885(new RSByteBuffer(is), -23453);
			synchronized (aClass79_1049) {
				aClass79_1049.put(i, class90);
			}
			return class90;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iu.A(" + i + ',' + i_8_ + ')');
		}
	}

	Class132(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_1045 = class207;
			this.anInt1047 = aClass207_1045.method2761(0, 19);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iu.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
