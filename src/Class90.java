/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class90 {
	int anInt718 = 1;
	static Class105 aClass105_719 = new Class105("", 15);
	char aChar720;
	static int anInt721 = 4;

	public static void method881(byte i) {
		do {
			try {
				aClass105_719 = null;
				if (i == -27)
					break;
				method883(88);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fn.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method882(int[] is, long[] ls, byte i) {
		do {
			try {
				Class117.method2169(is, ls, 0, ls.length - 1, false);
				if (i == 118)
					break;
				aClass105_719 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fn.A(" + (is != null ? "{...}" : "null") + ',' + (ls != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final Class246_Sub2 method883(int i) {
		try {
			Class246_Sub2 class246_sub2 = ((Class246_Sub2) Class138.aClass218_1084.method2805((byte) -72));
			if (class246_sub2 != null) {
				Class98_Sub50.anInt4294--;
				return class246_sub2;
			}
			if (i > 0)
				return null;
			return new Class246_Sub2();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fn.D(" + i + ')');
		}
	}

	private final void method884(int i, RSByteBuffer class98_sub22, byte i_0_) {
		do {
			try {
				do {
					if (i == 1) {
						this.aChar720 = (Class64_Sub7.method576(class98_sub22.readSignedByte(), (byte) 122));
						if (!client.aBoolean3553)
							break;
					}
					if (i == 2)
						this.anInt718 = 0;
				} while (false);
				if (i_0_ == -37)
					break;
				this.anInt718 = -63;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fn.B(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	public Class90() {
		/* empty */
	}

	final void method885(RSByteBuffer class98_sub22, int i) {
		try {
			if (i == -23453) {
				for (;;) {
					int i_1_ = class98_sub22.readUnsignedByte();
					if (i_1_ == 0)
						break;
					method884(i_1_, class98_sub22, (byte) -37);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fn.C(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
