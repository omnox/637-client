/* Class98_Sub46_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub11 extends Class98_Sub46 {
	static int anInt6024;
	static int anInt6025;
	private int[] anIntArray6026;
	boolean aBoolean6027 = true;
	Class280 aClass280_6028;
	int[] anIntArray6029;
	private int[][] anIntArrayArray6030;
	private String[] aStringArray6031;
	static Class332[] aClass332Array6032;

	final int method1574(byte i) {
		try {
			if (i > -103)
				anIntArrayArray6030 = null;
			if (anIntArray6026 == null)
				return 0;
			return anIntArray6026.length;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gj.N(" + i + ')');
		}
	}

	final void method1575(byte i) {
		do {
			try {
				if (this.anIntArray6029 != null) {
					for (int i_0_ = 0; (this.anIntArray6029.length > i_0_); i_0_++)
						this.anIntArray6029[i_0_] = Class41.method366((this.anIntArray6029[i_0_]), 32768);
				}
				if (i <= -115)
					break;
				anIntArrayArray6030 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "gj.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final String getQuickChatMessage(int i, RSByteBuffer class98_sub22) {
		try {
			StringBuffer stringbuffer = new StringBuffer(80);
			if (anIntArray6026 != null) {
				for (int i_1_ = 0; i_1_ < anIntArray6026.length; i_1_++) {
					stringbuffer.append(aStringArray6031[i_1_]);
					stringbuffer.append(this.aClass280_6028.method3326(method1580(i_1_, -41), anIntArrayArray6030[i_1_], (byte) 70, class98_sub22.method1248(Class98_Sub10_Sub7.method1025(anIntArray6026[i_1_], (byte) -65).anInt2910, false)));
				}
			}
			if (i != 15281)
				return null;
			stringbuffer.append(aStringArray6031[-1 + aStringArray6031.length]);
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gj.G(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1577(byte i) {
		try {
			if (i != 99)
				method1581((byte) -118, null);
			aClass332Array6032 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gj.M(" + i + ')');
		}
	}

	private final void method1578(int i, int i_2_, RSByteBuffer class98_sub22) {
		try {
			if (i == 1)
				aStringArray6031 = Class112.method2142(class98_sub22.readString(), '<', false);
			else if (i != 2) {
				if (i == 3) {
					int i_3_ = class98_sub22.readUnsignedByte();
					anIntArrayArray6030 = new int[i_3_][];
					anIntArray6026 = new int[i_3_];
					for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
						int i_5_ = class98_sub22.readShort();
						Class348 class348 = Class98_Sub10_Sub7.method1025(i_5_, (byte) -96);
						if (class348 != null) {
							anIntArray6026[i_4_] = i_5_;
							anIntArrayArray6030[i_4_] = new int[class348.anInt2915];
							for (int i_6_ = 0; (class348.anInt2915 > i_6_); i_6_++)
								anIntArrayArray6030[i_4_][i_6_] = class98_sub22.readShort();
						}
					}
				} else if (i == 4)
					this.aBoolean6027 = false;
			} else {
				int i_7_ = class98_sub22.readUnsignedByte();
				this.anIntArray6029 = new int[i_7_];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
					this.anIntArray6029[i_8_] = class98_sub22.readShort();
			}
			if (i_2_ != -3)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gj.P(" + i + ',' + i_2_ + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1579(RSByteBuffer class98_sub22, int[] is, int i) {
		while_93_: do {
			try {
				if (i != -3)
					method1584((byte) 4, null);
				if (anIntArray6026 != null) {
					int i_9_ = 0;
					for (;;) {
						if (i_9_ >= anIntArray6026.length)
							break while_93_;
						if (i_9_ >= is.length)
							break;
						int i_10_ = (method1580(i_9_, i ^ 0x47).anInt2913);
						if (i_10_ > 0)
							class98_sub22.method1213(31498, is[i_9_], i_10_);
						i_9_++;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gj.C(" + (class98_sub22 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Class348 method1580(int i, int i_11_) {
		try {
			if (anIntArray6026 == null || i < 0 || anIntArray6026.length < i)
				return null;
			int i_12_ = -91 / ((i_11_ - 4) / 44);
			return Class98_Sub10_Sub7.method1025(anIntArray6026[i], (byte) -109);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gj.F(" + i + ',' + i_11_ + ')');
		}
	}

	static final Class98_Sub10 method1581(byte i, RSByteBuffer class98_sub22) {
		try {
			class98_sub22.readUnsignedByte();
			if (i >= -41)
				aClass332Array6032 = null;
			int i_13_ = class98_sub22.readUnsignedByte();
			Class98_Sub10 class98_sub10 = PlayerAppearance.method3630(i_13_, 115);
			class98_sub10.anInt3860 = class98_sub22.readUnsignedByte();
			int i_14_ = class98_sub22.readUnsignedByte();
			for (int i_15_ = 0; i_14_ > i_15_; i_15_++) {
				int i_16_ = class98_sub22.readUnsignedByte();
				class98_sub10.method991(i_16_, class98_sub22, (byte) -116);
			}
			class98_sub10.method1001((byte) 66);
			return class98_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gj.O(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final String method1582(boolean bool) {
		try {
			StringBuffer stringbuffer = new StringBuffer(80);
			if (aStringArray6031 == null)
				return "";
			stringbuffer.append(aStringArray6031[0]);
			if (bool != false)
				return null;
			for (int i = 1; i < aStringArray6031.length; i++) {
				stringbuffer.append("...");
				stringbuffer.append(aStringArray6031[i]);
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gj.E(" + bool + ')');
		}
	}

	final int method1583(int i, int i_17_, int i_18_) {
		try {
			if (i < 41)
				return -47;
			if (anIntArray6026 == null || i_18_ < 0 || anIntArray6026.length < i_18_)
				return -1;
			if (anIntArrayArray6030[i_18_] == null || i_17_ < 0 || anIntArrayArray6030[i_18_].length < i_17_)
				return -1;
			return anIntArrayArray6030[i_18_][i_17_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gj.A(" + i + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	final void method1584(byte i, RSByteBuffer class98_sub22) {
		try {
			if (i >= -81)
				anIntArray6026 = null;
			for (;;) {
				int i_19_ = class98_sub22.readUnsignedByte();
				if (i_19_ == 0)
					break;
				method1578(i_19_, -3, class98_sub22);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gj.B(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class98_Sub46_Sub11() {
		/* empty */
	}
}
