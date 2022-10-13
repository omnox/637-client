/* Class98_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub17_Sub1 extends Class98_Sub17 {
	int anInt5774;
	int anInt5775;
	int anInt5776;
	long aLong5777;
	static boolean aBoolean5778 = false;
	int anInt5779;
	static OutgoingOpcode aClass171_5780 = new OutgoingOpcode(9, -1);
	static OutgoingOpcode aClass171_5781 = new OutgoingOpcode(44, 3);
	static int anInt5782 = 765;
	static RuneScapeCache aClass207_5783;

	static final void method1157(int i) {
		try {
			if (i >= -115)
				method1160(14);
			Class217.method2799(2, 22050, Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub1_4043.method558((byte) 123) == 1, (byte) 117);
			Class145.aClass268_1173 = Class153.method2484(22050, 0, (byte) -126, Class98_Sub43_Sub2.aClass88_5907, Class42_Sub3.aCanvas5361);
			Class246_Sub3_Sub5_Sub2.method3098(Class111_Sub1.method2115(-124, null), true, 28643);
			Class27.aClass268_276 = Class153.method2484(2048, 1, (byte) -126, Class98_Sub43_Sub2.aClass88_5907, Class42_Sub3.aCanvas5361);
			Class81.aClass98_Sub31_Sub3_619 = new Class98_Sub31_Sub3();
			Class27.aClass268_276.method3252(0, Class81.aClass98_Sub31_Sub3_619);
			LinkedList.aClass314_1195 = new Class314(22050, Class64_Sub15.anInt3678);
			Class233.method2883((byte) 111);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.C(" + i + ')');
		}
	}

	final long method1154(boolean bool) {
		try {
			if (bool != true)
				return -39L;
			return this.aLong5777;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.A(" + bool + ')');
		}
	}

	final int method1151(int i) {
		try {
			if (i < 34)
				return -100;
			return this.anInt5776;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.G(" + i + ')');
		}
	}

	final int method1156(int i) {
		try {
			if (i != -5)
				this.aLong5777 = 50L;
			return this.anInt5779;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.E(" + i + ')');
		}
	}

	static final void method1158(int i) {
		try {
			if (i == -2) {
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, Class219.aClass171_1640, Class331.aClass117_2811);
				class98_sub11.packet.writeByte(Class146_Sub2.method2391((byte) 112));
				class98_sub11.packet.writeShort(Class39_Sub1.anInt3593);
				class98_sub11.packet.writeShort(Class98_Sub25.anInt4024);
				class98_sub11.packet.writeByte(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4055.method648((byte) 120));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.B(" + i + ')');
		}
	}

	public static void method1159(int i) {
		do {
			try {
				aClass171_5780 = null;
				aClass171_5781 = null;
				aClass207_5783 = null;
				if (i == -15367)
					break;
				anInt5782 = -111;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "gfa.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method1155(int i) {
		try {
			int i_0_ = -3 % ((72 - i) / 49);
			return this.anInt5775;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.I(" + i + ')');
		}
	}

	final int method1152(int i) {
		try {
			if (i != 2)
				this.aLong5777 = -28L;
			return this.anInt5774;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.F(" + i + ')');
		}
	}

	static final boolean method1160(int i) {
		try {
			if (i <= 38)
				return true;
			if (Class359.anInt3058 <= 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gfa.D(" + i + ')');
		}
	}
}
