/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class173 {
	private static byte[] aByteArray1336 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private RSByteBuffer aClass98_Sub22_1337;
	private int[] anIntArray1338;
	private long aLong1339;
	int anInt1340;
	private int anInt1341;
	private int[] anIntArray1342;
	int[] anIntArray1343;
	private int[] anIntArray1344;

	final void method2545() {
		((RSByteBuffer) aClass98_Sub22_1337).data = null;
		anIntArray1338 = null;
		anIntArray1344 = null;
		((Class173) this).anIntArray1343 = null;
		anIntArray1342 = null;
	}

	final boolean method2546() {
		if (((RSByteBuffer) aClass98_Sub22_1337).data == null)
			return false;
		return true;
	}

	final long method2547(int i) {
		return aLong1339 + (long) i * (long) anInt1341;
	}

	final void method2548(long l) {
		aLong1339 = l;
		int i = anIntArray1344.length;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			((Class173) this).anIntArray1343[i_0_] = 0;
			anIntArray1342[i_0_] = 0;
			((RSByteBuffer) aClass98_Sub22_1337).position = anIntArray1338[i_0_];
			method2556(i_0_);
			anIntArray1344[i_0_] = ((RSByteBuffer) aClass98_Sub22_1337).position;
		}
	}

	private final int method2549(int i) {
		int i_1_ = (((RSByteBuffer) aClass98_Sub22_1337).data[((RSByteBuffer) aClass98_Sub22_1337).position]);
		if (i_1_ < 0) {
			i_1_ &= 0xff;
			anIntArray1342[i] = i_1_;
			((RSByteBuffer) aClass98_Sub22_1337).position++;
		} else
			i_1_ = anIntArray1342[i];
		if (i_1_ == 240 || i_1_ == 247) {
			int i_2_ = aClass98_Sub22_1337.method1240((byte) -20);
			if (i_1_ == 247 && i_2_ > 0) {
				int i_3_ = ((((RSByteBuffer) aClass98_Sub22_1337).data[((RSByteBuffer) aClass98_Sub22_1337).position]) & 0xff);
				if (i_3_ >= 241 && i_3_ <= 243 || i_3_ == 246 || i_3_ == 248 || i_3_ >= 250 && i_3_ <= 252 || i_3_ == 254) {
					((RSByteBuffer) aClass98_Sub22_1337).position++;
					anIntArray1342[i] = i_3_;
					return method2560(i, i_3_);
				}
			}
			((RSByteBuffer) aClass98_Sub22_1337).position += i_2_;
			return 0;
		}
		return method2560(i, i_1_);
	}

	final boolean method2550() {
		int i = anIntArray1344.length;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			if (anIntArray1344[i_4_] >= 0)
				return false;
		}
		return true;
	}

	final int method2551() {
		int i = anIntArray1344.length;
		int i_5_ = -1;
		int i_6_ = 2147483647;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			if (anIntArray1344[i_7_] >= 0 && ((Class173) this).anIntArray1343[i_7_] < i_6_) {
				i_5_ = i_7_;
				i_6_ = ((Class173) this).anIntArray1343[i_7_];
			}
		}
		return i_5_;
	}

	final void method2552(int i) {
		anIntArray1344[i] = ((RSByteBuffer) aClass98_Sub22_1337).position;
	}

	final void method2553() {
		((RSByteBuffer) aClass98_Sub22_1337).position = -1;
	}

	public static void method2554() {
		aByteArray1336 = null;
	}

	final void method2555(int i) {
		((RSByteBuffer) aClass98_Sub22_1337).position = anIntArray1344[i];
	}

	final void method2556(int i) {
		int i_8_ = aClass98_Sub22_1337.method1240((byte) -20);
		((Class173) this).anIntArray1343[i] += i_8_;
	}

	final void method2557(byte[] is) {
		((RSByteBuffer) aClass98_Sub22_1337).data = is;
		((RSByteBuffer) aClass98_Sub22_1337).position = 10;
		int i = aClass98_Sub22_1337.readShort();
		((Class173) this).anInt1340 = aClass98_Sub22_1337.readShort();
		anInt1341 = 500000;
		anIntArray1338 = new int[i];
		int i_9_ = 0;
		while (i_9_ < i) {
			int i_10_ = aClass98_Sub22_1337.readInt(-2);
			int i_11_ = aClass98_Sub22_1337.readInt(-2);
			if (i_10_ == 1297379947) {
				anIntArray1338[i_9_] = ((RSByteBuffer) aClass98_Sub22_1337).position;
				i_9_++;
			}
			((RSByteBuffer) aClass98_Sub22_1337).position += i_11_;
		}
		aLong1339 = 0L;
		anIntArray1344 = new int[i];
		for (int i_12_ = 0; i_12_ < i; i_12_++)
			anIntArray1344[i_12_] = anIntArray1338[i_12_];
		((Class173) this).anIntArray1343 = new int[i];
		anIntArray1342 = new int[i];
	}

	final int method2558() {
		return anIntArray1344.length;
	}

	final int method2559(int i) {
		int i_13_ = method2549(i);
		return i_13_;
	}

	private final int method2560(int i, int i_14_) {
		if (i_14_ == 255) {
			int i_15_ = aClass98_Sub22_1337.readUnsignedByte();
			int i_16_ = aClass98_Sub22_1337.method1240((byte) -20);
			if (i_15_ == 47) {
				((RSByteBuffer) aClass98_Sub22_1337).position += i_16_;
				return 1;
			}
			if (i_15_ == 81) {
				int i_17_ = aClass98_Sub22_1337.readMedium(-124);
				i_16_ -= 3;
				int i_18_ = ((Class173) this).anIntArray1343[i];
				aLong1339 += (long) i_18_ * (long) (anInt1341 - i_17_);
				anInt1341 = i_17_;
				((RSByteBuffer) aClass98_Sub22_1337).position += i_16_;
				return 2;
			}
			((RSByteBuffer) aClass98_Sub22_1337).position += i_16_;
			return 3;
		}
		byte i_19_ = aByteArray1336[i_14_ - 128];
		int i_20_ = i_14_;
		if (i_19_ >= 1)
			i_20_ |= aClass98_Sub22_1337.readUnsignedByte() << 8;
		if (i_19_ >= 2)
			i_20_ |= aClass98_Sub22_1337.readUnsignedByte() << 16;
		return i_20_;
	}

	public Class173() {
		aClass98_Sub22_1337 = new RSByteBuffer(null);
	}

	Class173(byte[] is) {
		aClass98_Sub22_1337 = new RSByteBuffer(null);
		method2557(is);
	}
}
