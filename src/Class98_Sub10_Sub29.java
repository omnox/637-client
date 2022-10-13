/* Class98_Sub10_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub29 extends Class98_Sub10 {
	private int anInt5707 = 4;
	private int anInt5708 = 4;

	final int[][] method997(int i, int i_0_) {
		try {
			if (i > -76)
				method991(84, null, (byte) 25);
			int[][] is = this.aClass223_3859.method2828(i_0_, 0);
			if (this.aClass223_3859.aBoolean1683) {
				int i_1_ = Class25.anInt268 / anInt5707;
				int i_2_ = Class63.anInt492 / anInt5708;
				int[][] is_3_;
				if (i_2_ <= 0)
					is_3_ = this.method994(0, 24431, 0);
				else {
					int i_4_ = i_0_ % i_2_;
					is_3_ = this.method994(Class63.anInt492 * i_4_ / i_2_, 24431, 0);
				}
				int[] is_5_ = is_3_[0];
				int[] is_6_ = is_3_[1];
				int[] is_7_ = is_3_[2];
				int[] is_8_ = is[0];
				int[] is_9_ = is[1];
				int[] is_10_ = is[2];
				for (int i_11_ = 0; Class25.anInt268 > i_11_; i_11_++) {
					int i_12_;
					if (i_1_ > 0) {
						int i_13_ = i_11_ % i_1_;
						i_12_ = i_13_ * Class25.anInt268 / i_1_;
					} else
						i_12_ = 0;
					is_8_[i_11_] = is_5_[i_12_];
					is_9_[i_11_] = is_6_[i_12_];
					is_10_[i_11_] = is_7_[i_12_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qaa.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1090(int i, aa var_aa, int i_14_, int i_15_, GameInterfaceData class293, int i_16_, long l, int i_17_, int i_18_) {
		try {
			int i_19_ = i_14_ * i_14_ + i_15_ * i_15_;
			if ((long) i_19_ <= l) {
				if (i_18_ != 4)
					method1092(-62, -95, (byte) 36);
				int i_20_ = Math.min(class293.anInt2311 / 2, class293.anInt2258 / 2);
				if (i_20_ * i_20_ >= i_19_)
					Class4.method173(i_16_, i_14_, i_17_, class293, var_aa, i_15_, (byte) -24, (Class98_Sub46_Sub11.aClass332Array6032[i]));
				else {
					i_20_ -= 10;
					int i_21_;
					do {
						if (Class98_Sub46_Sub20_Sub2.anInt6319 == 4) {
							i_21_ = 0x3fff & (int) GameWorld.cameraGetHrot;
							if (!client.aBoolean3553)
								break;
						}
						i_21_ = 0x3fff & (Class204.anInt1553 + (int) GameWorld.cameraGetHrot);
					} while (false);
					int i_22_ = Class284_Sub2_Sub2.anIntArray6200[i_21_];
					int i_23_ = Class284_Sub2_Sub2.anIntArray6202[i_21_];
					if (Class98_Sub46_Sub20_Sub2.anInt6319 != 4) {
						i_22_ = i_22_ * 256 / (Class151.anInt1213 - -256);
						i_23_ = i_23_ * 256 / (256 + Class151.anInt1213);
					}
					int i_24_ = i_22_ * i_14_ - -(i_15_ * i_23_) >> 14;
					int i_25_ = -(i_15_ * i_22_) + i_23_ * i_14_ >> 14;
					double d = Math.atan2(i_24_, i_25_);
					int i_26_ = (int) (Math.sin(d) * (double) i_20_);
					int i_27_ = (int) (Math.cos(d) * (double) i_20_);
					Class352.aClass332Array3000[i].method3730(((float) i_17_ + (float) class293.anInt2311 / 2.0F + (float) i_26_), (float) -i_27_ + ((float) i_16_ + (float) (class293.anInt2258) / 2.0F), 4096, (int) (-d / 6.283185307179586 * 65535.0));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qaa.B(" + i + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_14_ + ',' + i_15_ + ',' + (class293 != null ? "{...}" : "null") + ',' + i_16_ + ',' + l + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	public Class98_Sub10_Sub29() {
		super(1, false);
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_28_) {
		do {
			try {
				int i_29_ = i;
				do {
					if (i_29_ != 0) {
						if (i_29_ != 1)
							break;
					} else {
						anInt5707 = class98_sub22.readUnsignedByte();
						break;
					}
					anInt5708 = class98_sub22.readUnsignedByte();
				} while (false);
				if (i_28_ <= -92)
					break;
				anInt5708 = -70;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qaa.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_28_ + ')'));
			}
			break;
		} while (false);
	}

	static final void sendPacket(boolean bool, OutgoingPacket class98_sub11) {
		try {
			Class336.aClass148_2827.add_last(class98_sub11, -20911);
			if (bool != false)
				method1092(-65, -93, (byte) 41);
			class98_sub11.anInt3869 = class98_sub11.packet.position;
			Class62.anInt490 += class98_sub11.anInt3869;
			class98_sub11.packet.position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qaa.E(" + bool + ',' + (class98_sub11 != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method990(int i, int i_30_) {
		try {
			int[] is = this.aClass16_3863.method237((byte) 98, i_30_);
			if (this.aClass16_3863.aBoolean198) {
				int i_31_ = Class25.anInt268 / anInt5707;
				int i_32_ = Class63.anInt492 / anInt5708;
				int[] is_33_;
				if (i_32_ > 0) {
					int i_34_ = i_30_ % i_32_;
					is_33_ = this.method1000(i_34_ * Class63.anInt492 / i_32_, 0, 0);
				} else
					is_33_ = this.method1000(0, 0, i + -255);
				for (int i_35_ = 0; Class25.anInt268 > i_35_; i_35_++) {
					if (i_31_ > 0) {
						int i_36_ = i_35_ % i_31_;
						is[i_35_] = is_33_[Class25.anInt268 * i_36_ / i_31_];
					} else
						is[i_35_] = is_33_[0];
				}
			}
			if (i != 255)
				anInt5708 = 9;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qaa.G(" + i + ',' + i_30_ + ')');
		}
	}

	static final boolean method1092(int i, int i_37_, byte i_38_) {
		try {
			if (i_38_ >= -64)
				return true;
			if ((i & 0x20) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qaa.D(" + i + ',' + i_37_ + ',' + i_38_ + ')'));
		}
	}
}
