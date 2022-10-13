/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class22 {
	static int anInt216 = 0;
	static int pathEndY;
	static int anInt218 = 1337;
	static int anInt219;

	static final Class98_Sub46_Sub4 method280(byte[] is, int i) {
		try {
			Class98_Sub46_Sub4 class98_sub46_sub4 = new Class98_Sub46_Sub4();
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			((RSByteBuffer) class98_sub22).position = -2 + ((RSByteBuffer) class98_sub22).data.length;
			int i_0_ = class98_sub22.readShort();
			int i_1_ = (-12 + -i_0_ + (((RSByteBuffer) class98_sub22).data.length + -2));
			((RSByteBuffer) class98_sub22).position = i_1_;
			int i_2_ = class98_sub22.readInt(-2);
			((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5958 = class98_sub22.readShort();
			((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5964 = class98_sub22.readShort();
			((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5966 = class98_sub22.readShort();
			((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5965 = class98_sub22.readShort();
			int i_3_ = class98_sub22.readUnsignedByte();
			if ((i_3_ ^ 0xffffffff) < -1) {
				((Class98_Sub46_Sub4) class98_sub46_sub4).aClass377Array5956 = new Class377[i_3_];
				for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
					int i_5_ = class98_sub22.readShort();
					Class377 class377 = new Class377(Class48.method453(423660257, i_5_));
					((Class98_Sub46_Sub4) class98_sub46_sub4).aClass377Array5956[i_4_] = class377;
					while (i_5_-- > 0) {
						int i_6_ = class98_sub22.readInt(-2);
						int i_7_ = class98_sub22.readInt(-2);
						class377.method3996(new Class98_Sub34(i_7_), (long) i_6_, -1);
					}
				}
			}
			((RSByteBuffer) class98_sub22).position = 0;
			((Class98_Sub46_Sub4) class98_sub46_sub4).aString5968 = class98_sub22.method1222(-1);
			((Class98_Sub46_Sub4) class98_sub46_sub4).aStringArray5959 = new String[i_2_];
			((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5963 = new int[i_2_];
			((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5967 = new int[i_2_];
			int i_8_ = i;
			while ((i_1_ ^ 0xffffffff) < (((RSByteBuffer) class98_sub22).position ^ 0xffffffff)) {
				int i_9_ = class98_sub22.readShort();
				if ((i_9_ ^ 0xffffffff) == -4)
					((Class98_Sub46_Sub4) class98_sub46_sub4).aStringArray5959[i_8_] = class98_sub22.readString().intern();
				else if ((i_9_ ^ 0xffffffff) > -101 && i_9_ != 21 && (i_9_ ^ 0xffffffff) != -39 && i_9_ != 39)
					((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5967[i_8_] = class98_sub22.readInt(i + -2);
				else
					((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5967[i_8_] = class98_sub22.readUnsignedByte();
				((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5963[i_8_++] = i_9_;
			}
			return class98_sub46_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bk.A(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
