
/* Class98_Sub46_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class98_Sub46_Sub16 extends Class98_Sub46 {
	static int anInt6044;
	FrameDefinitions[] aClass7Array6045;
	static Class79 aClass79_6046 = new Class79(30);
	private int anInt6047;
	private byte[][] aByteArrayArray6048;

	static final void method1613(int i, int i_0_, byte[] is, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			if ((~i) < i_1_ && !Class81.method815(i, 0))
				throw new IllegalArgumentException("");
			if (i_2_ > 0 && !Class81.method815(i_2_, 0))
				throw new IllegalArgumentException("");
			int i_5_ = Class246_Sub3_Sub3.method3014(1, i_4_);
			int i_6_ = 0;
			int i_7_ = i_2_ <= i ? i_2_ : i;
			int i_8_ = i >> 1;
			int i_9_ = i_2_ >> 1;
			byte[] is_10_ = is;
			byte[] is_11_ = new byte[i_5_ * (i_9_ * i_8_)];
			for (;;) {
				OpenGL.glTexImage2Dub(i_0_, i_6_, i_3_, i, i_2_, 0, i_4_, 5121, is_10_, 0);
				if (i_7_ <= 1)
					break;
				int i_12_ = i_5_ * i;
				for (int i_13_ = 0; i_13_ < i_5_; i_13_++) {
					int i_14_ = i_13_;
					int i_15_ = i_13_;
					int i_16_ = i_15_ - -i_12_;
					for (int i_17_ = 0; i_9_ > i_17_; i_17_++) {
						for (int i_18_ = 0; i_18_ < i_8_; i_18_++) {
							int i_19_ = is_10_[i_15_];
							i_15_ += i_5_;
							i_19_ += is_10_[i_15_];
							i_15_ += i_5_;
							i_19_ += is_10_[i_16_];
							i_16_ += i_5_;
							i_19_ += is_10_[i_16_];
							i_16_ += i_5_;
							is_11_[i_14_] = (byte) (i_19_ >> 2);
							i_14_ += i_5_;
						}
						i_15_ += i_12_;
						i_16_ += i_12_;
					}
				}
				byte[] is_20_ = is_11_;
				is_11_ = is_10_;
				i = i_8_;
				is_10_ = is_20_;
				i_2_ = i_9_;
				i_9_ >>= 1;
				i_7_ >>= 1;
				i_6_++;
				i_8_ >>= 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jea.F(" + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final boolean method1614(byte i) {
		try {
			if (this.aClass7Array6045 != null)
				return true;
			if (aByteArrayArray6048 == null) {
				synchronized (Class64_Sub15.aClass207_3679) {
					if (!Class64_Sub15.aClass207_3679.method2756(false, anInt6047))
						return false;
					int[] is = Class64_Sub15.aClass207_3679.method2743(anInt6047, 6341);
					aByteArrayArray6048 = new byte[is.length][];
					for (int i_21_ = 0; i_21_ < is.length; i_21_++)
						aByteArrayArray6048[i_21_] = Class64_Sub15.aClass207_3679.readArchive(is[i_21_], anInt6047);
				}
			}
			boolean bool = true;
			for (int i_22_ = 0; (i_22_ < aByteArrayArray6048.length); i_22_++) {
				byte[] is = aByteArrayArray6048[i_22_];
				RSByteBuffer class98_sub22 = new RSByteBuffer(is);
				class98_sub22.position = 1;
				int i_23_ = class98_sub22.readShort();
				synchronized (Class64_Sub2.aClass207_3644) {
					bool &= Class64_Sub2.aClass207_3644.method2742(-89, i_23_);
				}
			}
			if (!bool)
				return false;
			LinkedList class148 = new LinkedList();
			int[] is;
			synchronized (Class64_Sub15.aClass207_3679) {
				int i_24_ = Class64_Sub15.aClass207_3679.method2761(0, anInt6047);
				this.aClass7Array6045 = new FrameDefinitions[i_24_];
				is = Class64_Sub15.aClass207_3679.method2743(anInt6047, 6341);
			}
			for (int i_25_ = 0; i_25_ < is.length; i_25_++) {
				byte[] is_26_ = aByteArrayArray6048[i_25_];
				RSByteBuffer class98_sub22 = new RSByteBuffer(is_26_);
				class98_sub22.position = 1;
				int i_27_ = class98_sub22.readShort();
				Class98_Sub1 class98_sub1 = null;
				for (Class98_Sub1 class98_sub1_28_ = (Class98_Sub1) class148.method2418(32); class98_sub1_28_ != null; class98_sub1_28_ = (Class98_Sub1) class148.method2417(92)) {
					if (i_27_ == class98_sub1_28_.anInt3813) {
						class98_sub1 = class98_sub1_28_;
						break;
					}
				}
				if (class98_sub1 == null) {
					synchronized (Class64_Sub2.aClass207_3644) {
						class98_sub1 = new Class98_Sub1(i_27_, Class64_Sub2.aClass207_3644.method2733(i_27_, -118));
					}
					class148.add_last(class98_sub1, -20911);
				}
				this.aClass7Array6045[is[i_25_]] = new FrameDefinitions(is_26_, class98_sub1);
			}
			aByteArrayArray6048 = null;
			int i_29_ = -47 % ((5 - i) / 61);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jea.B(" + i + ')');
		}
	}

	final boolean method1615(int i, boolean bool) {
		try {
			if (bool != false)
				return true;
			return (this.aClass7Array6045[i].aBoolean95);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jea.C(" + i + ',' + bool + ')');
		}
	}

	public static void method1616(int i) {
		try {
			if (i >= -3)
				aClass79_6046 = null;
			aClass79_6046 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jea.D(" + i + ')');
		}
	}

	final boolean method1617(boolean bool, int i) {
		try {
			if (bool != false)
				return true;
			return (this.aClass7Array6045[i].aBoolean102);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jea.A(" + bool + ',' + i + ')');
		}
	}

	static final void method1618(int i, byte i_30_) {
		try {
			Class76_Sub10.anInt3794 = i;
			if (i_30_ == -85)
				Class64_Sub5.aClass79_3650.method794(105);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jea.E(" + i + ',' + i_30_ + ')');
		}
	}

	Class98_Sub46_Sub16(int i) {
		try {
			anInt6047 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jea.<init>(" + i + ')');
		}
	}

	final boolean method1619(int i, int i_31_) {
		try {
			if (i_31_ != 31239)
				method1613(53, 0, null, 91, 99, -3, -67);
			return (this.aClass7Array6045[i].aBoolean104);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jea.G(" + i + ',' + i_31_ + ')');
		}
	}
}
