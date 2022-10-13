
/* Class98_Sub22_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

final class Class98_Sub22_Sub2 extends RSByteBuffer {
	static OutgoingOpcode aClass171_5792 = new OutgoingOpcode(71, 7);
	static final int method1262(int i, int i_0_) {
		try {
			if (i != 8)
				method1262(43, -97);
			if (i_0_ < 96)
				return 0;
			if (i_0_ < 128)
				return 2;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vda.A(" + i + ',' + i_0_ + ')');
		}
	}

	Class98_Sub22_Sub2(int i) {
		super(i);
	}

	public static void method1263(int i) {
		try {
			if (i >= -66)
				method1262(-69, 69);
			IncomingOpcode.aClass58_5793 = null;
			aClass171_5792 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vda.D(" + i + ')');
		}
	}

	final void method1264(byte i, float f) {
		try {
			int i_2_ = Stream.floatToRawIntBits(f);
			this.data[this.position++] = (byte) (i_2_ >> 24);
			this.data[this.position++] = (byte) (i_2_ >> 16);
			this.data[this.position++] = (byte) (i_2_ >> 8);
			this.data[this.position++] = (byte) i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vda.B(" + i + ',' + f + ')');
		}
	}

	final void method1265(byte i, float f) {
		try {
			int i_3_ = Stream.floatToRawIntBits(f);
			if (i != -52)
				aClass171_5792 = null;
			this.data[this.position++] = (byte) i_3_;
			this.data[this.position++] = (byte) (i_3_ >> 8);
			this.data[this.position++] = (byte) (i_3_ >> 16);
			this.data[this.position++] = (byte) (i_3_ >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vda.C(" + i + ',' + f + ')');
		}
	}
}
