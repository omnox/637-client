/* Class98_Sub10_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub37 extends Class98_Sub10 {
	private int anInt5746 = 3216;
	private int[] anIntArray5747 = new int[3];
	static LinkedList aClass148_5748 = new LinkedList();
	private int anInt5749;
	private int anInt5750 = 4096;

	public static void method1113(int i) {
		try {
			if (i != 0)
				method1113(126);
			aClass148_5748 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vb.D(" + i + ')');
		}
	}

	public Class98_Sub10_Sub37() {
		super(1, true);
		anInt5749 = 3216;
	}

	private final void method1114(byte i) {
		do {
			try {
				double d = Math.cos((double) ((float) anInt5749 / 4096.0F));
				anIntArray5747[0] = (int) (4096.0 * (d * Math.sin((double) ((float) anInt5746 / 4096.0F))));
				anIntArray5747[1] = (int) (Math.cos((double) ((float) anInt5746 / 4096.0F)) * d * 4096.0);
				anIntArray5747[2] = (int) (4096.0 * Math.sin((double) ((float) anInt5749 / 4096.0F)));
				if (i <= -73) {
					int i_0_ = anIntArray5747[0] * anIntArray5747[0] >> 247401804;
					int i_1_ = anIntArray5747[1] * anIntArray5747[1] >> 2024311884;
					int i_2_ = anIntArray5747[2] * anIntArray5747[2] >> -899467796;
					int i_3_ = (int) (4096.0 * Math.sqrt((double) (i_0_ + i_1_ - -i_2_ >> -1727670228)));
					if ((i_3_ ^ 0xffffffff) == -1)
						break;
					anIntArray5747[1] = (anIntArray5747[1] << -1369097108) / i_3_;
					anIntArray5747[2] = (anIntArray5747[2] << -1561597076) / i_3_;
					anIntArray5747[0] = (anIntArray5747[0] << -121165236) / i_3_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vb.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1001(byte i) {
		try {
			method1114((byte) -76);
			if (i != 66)
				method1001((byte) 126);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vb.I(" + i + ')');
		}
	}

	static final int method1115(int i, byte[] is, boolean bool, String string) {
		try {
			if (bool != false)
				return 5;
			int i_4_ = i;
			int i_5_ = string.length();
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_6_ += 4) {
				int i_7_ = Class64_Sub6.method574(120, string.charAt(i_6_));
				int i_8_ = ((i_5_ ^ 0xffffffff) >= (i_6_ + 1 ^ 0xffffffff) ? -1 : Class64_Sub6.method574(73, string.charAt(1 + i_6_)));
				int i_9_ = ((2 + i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff) ? Class64_Sub6.method574(124, string.charAt(2 + i_6_)) : -1);
				int i_10_ = ((i_6_ + 3 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff) ? -1 : Class64_Sub6.method574(103, string.charAt(3 + i_6_)));
				is[i++] = (byte) Class41.method366(i_7_ << 1770288578, i_8_ >>> 1496720228);
				if ((i_9_ ^ 0xffffffff) == 0)
					break;
				is[i++] = (byte) Class41.method366((Class202.method2702(240, i_8_ << -243044220)), i_9_ >>> -1134162686);
				if ((i_10_ ^ 0xffffffff) == 0)
					break;
				is[i++] = (byte) Class41.method366(i_10_, (Class202.method2702(3, i_9_) << -391855066));
			}
			return i - i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vb.B(" + i + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method990(int i, int i_11_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237((byte) 98, i_11_);
			if (i != 255)
				return null;
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
				int i_12_ = (anInt5750 * Class246_Sub3_Sub4_Sub1.anInt6241 >> -854156148);
				int[] is_13_ = this.method1000(i_11_ - 1 & za_Sub1.anInt6075, 0, 0);
				int[] is_14_ = this.method1000(i_11_, 0, 0);
				int[] is_15_ = this.method1000(za_Sub1.anInt6075 & i_11_ + 1, 0, i ^ 0xff);
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_16_++) {
					int i_17_ = (i_12_ * (is_15_[i_16_] - is_13_[i_16_]) >> -561357748);
					int i_18_ = (i_12_ * (is_14_[i_16_ + -1 & Class329.anInt2761] - is_14_[Class329.anInt2761 & i_16_ - -1]) >> -1616087444);
					int i_19_ = i_18_ >> 2114966948;
					if (i_19_ < 0)
						i_19_ = -i_19_;
					int i_20_ = i_17_ >> -373105820;
					if ((i_20_ ^ 0xffffffff) > -1)
						i_20_ = -i_20_;
					if ((i_19_ ^ 0xffffffff) < -256)
						i_19_ = 255;
					if ((i_20_ ^ 0xffffffff) < -256)
						i_20_ = 255;
					int i_21_ = (0xff & (Class194.aByteArray1495[(i_20_ * (i_20_ + 1) >> -714044351) + i_19_]));
					int i_22_ = i_21_ * i_17_ >> -419747032;
					int i_23_ = i_21_ * i_18_ >> -1545737624;
					int i_24_ = i_21_ * 4096 >> -666378040;
					i_22_ = i_22_ * anIntArray5747[1] >> -2050468148;
					i_24_ = anIntArray5747[2] * i_24_ >> 1934014988;
					i_23_ = i_23_ * anIntArray5747[0] >> -304764628;
					is[i_16_] = i_23_ + i_22_ - -i_24_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vb.G(" + i + ',' + i_11_ + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_25_) {
		while_242_: do {
			try {
				if (i_25_ >= -92)
					anInt5750 = 79;
				int i_26_ = i;
				do {
					if (i_26_ != 0) {
						if ((i_26_ ^ 0xffffffff) != -2) {
							if (i_26_ == 2)
								break;
							break while_242_;
						}
					} else {
						anInt5750 = class98_sub22.readShort();
						break while_242_;
					}
					anInt5746 = class98_sub22.readShort();
					break while_242_;
				} while (false);
				anInt5749 = class98_sub22.readShort();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vb.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_25_ + ')'));
			}
		} while (false);
	}
}
