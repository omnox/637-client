/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class312 {
	int[] anIntArray2662;
	private byte[] aByteArray2663;
	int[] anIntArray2664;
	int anInt2665;
	Class122 aClass122_2666;
	int[] anIntArray2667;
	int anInt2668;
	int[][] anIntArrayArray2669;
	int[] anIntArray2670;
	int[] anIntArray2671;
	Class122[] aClass122Array2672;
	int[] anIntArray2673;
	int[][] anIntArrayArray2674;
	byte[][] aByteArrayArray2675;
	int anInt2676;
	int anInt2677;

	static final void method3620(Class352 class352, int i, int i_0_, int i_1_, int i_2_) {
		try {
			Class98_Sub42 class98_sub42 = ((Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748.method2418(32));
			if (i != -22015)
				IncomingOpcode.aClass58_2661 = null;
			for (/**/; class98_sub42 != null; class98_sub42 = ((Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748.method2417(97))) {
				if (i_1_ == class98_sub42.anInt4220 && (i_2_ << 9 == class98_sub42.anInt4229) && (class98_sub42.anInt4225 == i_0_ << 9) && (class98_sub42.aClass352_4233.id == class352.id)) {
					if ((class98_sub42.aClass98_Sub31_Sub5_4232) != null) {
						Class81.aClass98_Sub31_Sub3_619.method1374(class98_sub42.aClass98_Sub31_Sub5_4232);
						class98_sub42.aClass98_Sub31_Sub5_4232 = null;
					}
					if ((class98_sub42.aClass98_Sub31_Sub5_4230) != null) {
						Class81.aClass98_Sub31_Sub3_619.method1374(class98_sub42.aClass98_Sub31_Sub5_4230);
						class98_sub42.aClass98_Sub31_Sub5_4230 = null;
					}
					class98_sub42.remove();
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("te.D(" + (class352 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method3621(byte i) {
		try {
			if (i != 7)
				method3620(null, -45, -88, 50, 116);
			IncomingOpcode.aClass58_2661 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "te.B(" + i + ')');
		}
	}

	private final void method3622(byte[] is, int i) {
		do {
			try {
				RSByteBuffer class98_sub22 = new RSByteBuffer(Class98_Sub46_Sub10.method1571(is, (byte) -84));
				int i_3_ = class98_sub22.readUnsignedByte();
				if (i_3_ < 5 || i_3_ > 6)
					throw new RuntimeException();
				if (i_3_ < 6)
					this.anInt2676 = 0;
				else
					this.anInt2676 = class98_sub22.readInt(-2);
				int i_4_ = class98_sub22.readUnsignedByte();
				boolean bool = (0x1 & i_4_) != 0;
				this.anInt2665 = class98_sub22.readShort();
				boolean bool_5_ = (0x2 & i_4_) != 0;
				int i_6_ = 0;
				this.anIntArray2664 = new int[this.anInt2665];
				int i_7_ = -1;
				for (int i_8_ = 0; this.anInt2665 > i_8_; i_8_++) {
					this.anIntArray2664[i_8_] = i_6_ += class98_sub22.readShort();
					if (this.anIntArray2664[i_8_] > i_7_)
						i_7_ = this.anIntArray2664[i_8_];
				}
				this.anInt2668 = 1 + i_7_;
				if (bool_5_)
					this.aByteArrayArray2675 = new byte[this.anInt2668][];
				this.anIntArray2670 = new int[this.anInt2668];
				this.anIntArrayArray2669 = new int[this.anInt2668][];
				this.anIntArray2671 = new int[this.anInt2668];
				this.anIntArray2667 = new int[this.anInt2668];
				this.anIntArray2673 = new int[this.anInt2668];
				if (bool) {
					this.anIntArray2662 = new int[this.anInt2668];
					for (int i_9_ = 0; (this.anInt2668 > i_9_); i_9_++)
						this.anIntArray2662[i_9_] = -1;
					for (int i_10_ = 0; i_10_ < this.anInt2665; i_10_++)
						this.anIntArray2662[this.anIntArray2664[i_10_]] = class98_sub22.readInt(-2);
					this.aClass122_2666 = new Class122(this.anIntArray2662);
				}
				for (int i_11_ = 0; this.anInt2665 > i_11_; i_11_++)
					this.anIntArray2673[(this.anIntArray2664[i_11_])] = class98_sub22.readInt(-2);
				if (bool_5_) {
					for (int i_12_ = 0; (this.anInt2665 > i_12_); i_12_++) {
						byte[] is_13_ = new byte[64];
						class98_sub22.method1190(is_13_, true, 64, 0);
						this.aByteArrayArray2675[this.anIntArray2664[i_12_]] = is_13_;
					}
				}
				if (i == -7572) {
					for (int i_14_ = 0; this.anInt2665 > i_14_; i_14_++)
						this.anIntArray2667[this.anIntArray2664[i_14_]] = class98_sub22.readInt(-2);
					for (int i_15_ = 0; this.anInt2665 > i_15_; i_15_++)
						this.anIntArray2670[this.anIntArray2664[i_15_]] = class98_sub22.readShort();
					for (int i_16_ = 0; (i_16_ < this.anInt2665); i_16_++) {
						int i_17_ = this.anIntArray2664[i_16_];
						int i_18_ = this.anIntArray2670[i_17_];
						i_6_ = 0;
						this.anIntArrayArray2669[i_17_] = new int[i_18_];
						int i_19_ = -1;
						for (int i_20_ = 0; i_18_ > i_20_; i_20_++) {
							int i_21_ = (this.anIntArrayArray2669[i_17_][i_20_] = i_6_ += class98_sub22.readShort());
							if (i_19_ < i_21_)
								i_19_ = i_21_;
						}
						this.anIntArray2671[i_17_] = 1 + i_19_;
						if (1 + i_19_ == i_18_)
							this.anIntArrayArray2669[i_17_] = null;
					}
					if (!bool)
						break;
					this.aClass122Array2672 = new Class122[1 + i_7_];
					this.anIntArrayArray2674 = new int[1 + i_7_][];
					for (int i_22_ = 0; this.anInt2665 > i_22_; i_22_++) {
						int i_23_ = this.anIntArray2664[i_22_];
						int i_24_ = this.anIntArray2670[i_23_];
						this.anIntArrayArray2674[i_23_] = new int[this.anIntArray2671[i_23_]];
						for (int i_25_ = 0; (this.anIntArray2671[i_23_] > i_25_); i_25_++)
							this.anIntArrayArray2674[i_23_][i_25_] = -1;
						for (int i_26_ = 0; i_24_ > i_26_; i_26_++) {
							int i_27_;
							if (this.anIntArrayArray2669[i_23_] != null)
								i_27_ = (this.anIntArrayArray2669[i_23_][i_26_]);
							else
								i_27_ = i_26_;
							this.anIntArrayArray2674[i_23_][i_27_] = class98_sub22.readInt(i + 7570);
						}
						this.aClass122Array2672[i_23_] = new Class122(this.anIntArrayArray2674[i_23_]);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("te.C(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3623(int i, int i_28_) {
		try {
			if (i > -68)
				IncomingOpcode.aClass58_2661 = null;
			if (i_28_ != 3 && i_28_ != 4)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "te.A(" + i + ',' + i_28_ + ')');
		}
	}

	Class312(byte[] is, int i, byte[] is_29_) {
		try {
			this.anInt2677 = Class31.method309(is.length, is, -30091);
			if (i != this.anInt2677)
				throw new RuntimeException();
			if (is_29_ != null) {
				if (is_29_.length != 64)
					throw new RuntimeException();
				aByteArray2663 = Class64_Sub11.method595(0, (byte) -121, is, is.length);
				for (int i_30_ = 0; i_30_ < 64; i_30_++) {
					if (is_29_[i_30_] != aByteArray2663[i_30_])
						throw new RuntimeException();
				}
			}
			method3622(is, -7572);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("te.<init>(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (is_29_ != null ? "{...}" : "null") + ')'));
		}
	}
}
