/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class366 {
	static int anInt3111;
	static int anInt3112;
	static String[] aStringArray3113 = { "en", "de", "fr", "pt", "nl" };
	static Class377 aClass377_3114;
	int anInt3115;
	int anInt3116;
	static int anInt3117 = 0;
	int anInt3118;
	static byte[][] aByteArrayArray3119;
	static float aFloat3120;
	static int anInt3121;
	static Class98_Sub31_Sub2 aClass98_Sub31_Sub2_3122;

	final void method3945(RSByteBuffer class98_sub22, int i) {
		try {
			if (i != -6364)
				method3946(true, -13, null);
			for (;;) {
				int i_0_ = class98_sub22.readUnsignedByte();
				if (i_0_ == 0)
					break;
				method3946(false, i_0_, class98_sub22);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wc.A(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method3946(boolean bool, int i, RSByteBuffer class98_sub22) {
		try {
			if (bool == false) {
				if (i == 1) {
					this.anInt3115 = class98_sub22.readShort();
					this.anInt3116 = class98_sub22.readUnsignedByte();
					this.anInt3118 = class98_sub22.readUnsignedByte();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wc.B(" + bool + ',' + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3947(int i) {
		try {
			aByteArrayArray3119 = null;
			aClass98_Sub31_Sub2_3122 = null;
			aClass377_3114 = null;
			if (i != -15598)
				method3947(-67);
			aStringArray3113 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wc.C(" + i + ')');
		}
	}

	public Class366() {
		/* empty */
	}

	static {
		aClass377_3114 = new Class377(8);
		aByteArrayArray3119 = new byte[250][];
	}
}
