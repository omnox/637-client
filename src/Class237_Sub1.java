/* Class237_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class237_Sub1 extends Class237 {
	private int[] anIntArray5040;
	private byte[][] aByteArrayArray5041 = new byte[10][];
	private int anInt5042;
	private RSByteBuffer aClass98_Sub22_5043 = new RSByteBuffer(null);
	static boolean aBoolean5044 = false;
	private int anInt5045;
	private RuneScapeCache aClass207_5046;
	static int anInt5047 = 0;
	private RSByteBuffer aClass98_Sub22_5048 = new RSByteBuffer(null);

	Class237_Sub1(int i, RuneScapeCache class207, int i_0_) {
		super(i);
		try {
			anInt5042 = i_0_;
			aClass207_5046 = class207;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dha.<init>(" + i + ',' + (class207 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final int method2899(int i, byte[] is) throws IOException {
		try {
			if (anIntArray5040 == null) {
				if (!aClass207_5046.method2751(0, anInt5042, -6329))
					return 0;
				byte[] is_1_ = aClass207_5046.readArchive(0, anInt5042);
				if (is_1_ == null)
					throw new IllegalStateException("");
				aClass98_Sub22_5048.data = is_1_;
				aClass98_Sub22_5048.position = 0;
				int i_2_ = is_1_.length >> 1;
				anIntArray5040 = new int[i_2_];
				for (int i_3_ = 0; i_2_ > i_3_; i_3_++)
					anIntArray5040[i_3_] = aClass98_Sub22_5048.readShort();
			}
			if (anInt5045 >= anIntArray5040.length)
				return -1;
			method2916((byte) 44);
			aClass98_Sub22_5048.position = 0;
			aClass98_Sub22_5048.data = is;
			if (i <= 43)
				anIntArray5040 = null;
			while (aClass98_Sub22_5048.position < (aClass98_Sub22_5048.data).length) {
				if (aClass98_Sub22_5043.data == null) {
					if (aByteArrayArray5041[0] == null) {
						aClass98_Sub22_5048.data = null;
						return aClass98_Sub22_5048.position;
					}
					aClass98_Sub22_5043.data = aByteArrayArray5041[0];
				}
				int i_4_ = (-aClass98_Sub22_5048.position + (aClass98_Sub22_5048.data).length);
				int i_5_ = (-aClass98_Sub22_5043.position + (aClass98_Sub22_5043.data).length);
				if (i_5_ <= i_4_) {
					aClass98_Sub22_5048.method1217(aClass98_Sub22_5043.data, i_5_, -1, aClass98_Sub22_5043.position);
					aClass98_Sub22_5043.data = null;
					aClass98_Sub22_5043.position = 0;
					anInt5045++;
					for (int i_6_ = 0; i_6_ < 9; i_6_++)
						aByteArrayArray5041[i_6_] = aByteArrayArray5041[1 + i_6_];
					aByteArrayArray5041[9] = null;
					if (anInt5045 >= anIntArray5040.length) {
						aClass98_Sub22_5048.data = null;
						return aClass98_Sub22_5048.position;
					}
				} else {
					aClass98_Sub22_5043.method1190(aClass98_Sub22_5048.data, true, i_4_, aClass98_Sub22_5048.position);
					aClass98_Sub22_5048.data = null;
					return is.length;
				}
			}
			aClass98_Sub22_5048.data = null;
			return is.length;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dha.O(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class332 method2915(int i, RuneScapeCache class207, byte i_7_) {
		try {
			if (i_7_ != -89)
				aBoolean5044 = true;
			Class332 class332 = (Class332) Class135.aClass79_1054.get(i);
			if (class332 == null) {
				do {
					if (!Class98_Sub5_Sub2.aBoolean5535) {
						class332 = Class271.method3277(class207.method2733(i, 58), 1);
						if (!client.aBoolean3553)
							break;
					}
					class332 = (Class265.aHa1974.method1758(Class324.method3683(class207, i), true));
				} while (false);
				Class135.aClass79_1054.put(i, class332);
			}
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dha.R(" + i + ',' + (class207 != null ? "{...}" : "null") + ',' + i_7_ + ')'));
		}
	}

	final void method2916(byte i) {
		while_56_: do {
			try {
				if (anIntArray5040 != null) {
					if (i != 44)
						anInt5047 = -49;
					int i_8_ = 0;
					for (;;) {
						if (i_8_ >= 10)
							break while_56_;
						if (anInt5045 + i_8_ >= anIntArray5040.length)
							break;
						if (aByteArrayArray5041[i_8_] == null && aClass207_5046.method2751(0, (anIntArray5040[anInt5045 + i_8_]), -6329))
							aByteArrayArray5041[i_8_] = aClass207_5046.readArchive(0, (anIntArray5040[(i_8_ + anInt5045)]));
						i_8_++;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dha.S(" + i + ')');
			}
			break;
		} while (false);
	}
}
