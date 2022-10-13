/* Class64_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class64_Sub18 extends Class64 {
	static int[] anIntArray3688 = { 1, -1, -1, 1 };
	static Class332[] aClass332Array3689;
	static boolean aBoolean3690 = false;
	static float aFloat3691;

	final void method550(int i, int i_0_) {
		try {
			this.anInt494 = i_0_;
			int i_1_ = -103 / ((i - -26) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.B(" + i + ',' + i_0_ + ')');
		}
	}

	final int method552(int i) {
		try {
			if (i != 0)
				aBoolean3690 = false;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.A(" + i + ')');
		}
	}

	static final void method622(byte i) {
		try {
			Class98_Sub46_Sub9 class98_sub46_sub9 = ((Class98_Sub46_Sub9) GameInterface.aClass215_3949.method2792(-1));
			if (i != -38)
				anIntArray3688 = null;
			for (/**/; class98_sub46_sub9 != null; class98_sub46_sub9 = ((Class98_Sub46_Sub9) GameInterface.aClass215_3949.method2787(0))) {
				if (class98_sub46_sub9.anInt6001 > 1) {
					class98_sub46_sub9.anInt6001 = 0;
					Class98_Sub46_Sub16.aClass79_6046.put(((Class98_Sub46_Sub8) class98_sub46_sub9.aClass215_5999.aClass98_Sub46_1615.aClass98_Sub46_4262).aLong5991, class98_sub46_sub9);
					class98_sub46_sub9.aClass215_5999.method2786(16711680);
				}
			}
			Class64_Sub12.anInt3672 = 0;
			Class359.anInt3058 = 0;
			Class33.aClass148_315.method2422((byte) 47);
			Class98_Sub47.aClass377_4274.method3994(-99);
			GameInterface.aClass215_3949.method2786(i ^ ~0xff0025);
			Player.aBoolean6540 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.O(" + i + ')');
		}
	}

	Class64_Sub18(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	static final void method623(int i) {
		do {
			try {
				Class22.anInt216 = 0;
				if (i != -23196)
					method623(27);
				int i_2_ = ((Player.selfPlayer.localXPos >> 9) + Class272.anInt2038);
				int i_3_ = ((Player.selfPlayer.localYPos >> 9) + aa_Sub2.anInt3562);
				if (i_2_ >= 3053 && i_2_ <= 3156 && i_3_ >= 3056 && i_3_ <= 3136)
					Class22.anInt216 = 1;
				if (i_2_ >= 3072 && i_2_ <= 3118 && i_3_ >= 9492 && i_3_ <= 9535)
					Class22.anInt216 = 1;
				if (Class22.anInt216 != 1 || i_2_ < 3139 || i_2_ > 3199 || i_3_ < 3008 || i_3_ > 3062)
					break;
				Class22.anInt216 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oc.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method624(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			int i_11_ = 0;
			int i_12_ = i_10_;
			int i_13_ = 0;
			int i_14_ = -i_6_ + i_7_;
			int i_15_ = -i_6_ + i_10_;
			int i_16_ = i_7_ * i_7_;
			int i_17_ = i_10_ * i_10_;
			int i_18_ = i_14_ * i_14_;
			int i_19_ = i_15_ * i_15_;
			int i_20_ = i_17_ << 1;
			int i_21_ = i_16_ << 1;
			int i_22_ = i_19_ << 1;
			int i_23_ = i_18_ << 1;
			int i_24_ = i_10_ << 1;
			int i_25_ = i_15_ << 1;
			int i_26_ = i_20_ + i_16_ * (-i_24_ + 1);
			int i_27_ = -((-1 + i_24_) * i_21_) + i_17_;
			int i_28_ = i_22_ + (1 + -i_25_) * i_18_;
			int i_29_ = -(i_23_ * (i_25_ + -1)) + i_19_;
			int i_30_ = i_16_ << 2;
			int i_31_ = i_17_ << 2;
			int i_32_ = i_18_ << 2;
			int i_33_ = i_19_ << 2;
			int i_34_ = 3 * i_20_;
			int i_35_ = i_21_ * (-3 + i_24_);
			int i_36_ = i_22_ * 3;
			int i_37_ = (i_25_ + -3) * i_23_;
			int i_38_ = i_31_;
			int i_39_ = (-1 + i_10_) * i_30_;
			int i_40_ = i_33_;
			int i_41_ = (-1 + i_15_) * i_32_;
			int[] is = Class97.anIntArrayArray814[i_8_];
			Class333.method3761(i_9_, is, i_5_ - i_7_, i_5_ + -i_14_, (byte) -123);
			Class333.method3761(i, is, i_5_ - i_14_, i_14_ + i_5_, (byte) -127);
			Class333.method3761(i_9_, is, i_14_ + i_5_, i_5_ + i_7_, (byte) 49);
			if (i_4_ == -2211) {
				while (i_12_ > 0) {
					boolean bool = i_12_ <= i_15_;
					if (bool) {
						if (i_28_ < 0) {
							while (i_28_ < 0) {
								i_29_ += i_40_;
								i_28_ += i_36_;
								i_40_ += i_33_;
								i_36_ += i_33_;
								i_13_++;
							}
						}
						if (i_29_ < 0) {
							i_29_ += i_40_;
							i_28_ += i_36_;
							i_36_ += i_33_;
							i_40_ += i_33_;
							i_13_++;
						}
						i_29_ += -i_37_;
						i_28_ += -i_41_;
						i_37_ -= i_32_;
						i_41_ -= i_32_;
					}
					if (i_26_ < 0) {
						while (i_26_ < 0) {
							i_27_ += i_38_;
							i_26_ += i_34_;
							i_11_++;
							i_34_ += i_31_;
							i_38_ += i_31_;
						}
					}
					if (i_27_ < 0) {
						i_26_ += i_34_;
						i_27_ += i_38_;
						i_34_ += i_31_;
						i_11_++;
						i_38_ += i_31_;
					}
					i_26_ += -i_39_;
					i_27_ += -i_35_;
					i_39_ -= i_30_;
					i_35_ -= i_30_;
					i_12_--;
					int i_42_ = i_8_ - i_12_;
					int i_43_ = i_8_ + i_12_;
					int i_44_ = i_5_ - -i_11_;
					int i_45_ = -i_11_ + i_5_;
					if (bool) {
						int i_46_ = i_13_ + i_5_;
						int i_47_ = i_5_ + -i_13_;
						Class333.method3761(i_9_, Class97.anIntArrayArray814[i_42_], i_45_, i_47_, (byte) -124);
						Class333.method3761(i, Class97.anIntArrayArray814[i_42_], i_47_, i_46_, (byte) -126);
						Class333.method3761(i_9_, Class97.anIntArrayArray814[i_42_], i_46_, i_44_, (byte) -124);
						Class333.method3761(i_9_, Class97.anIntArrayArray814[i_43_], i_45_, i_47_, (byte) -125);
						Class333.method3761(i, Class97.anIntArrayArray814[i_43_], i_47_, i_46_, (byte) 91);
						Class333.method3761(i_9_, Class97.anIntArrayArray814[i_43_], i_46_, i_44_, (byte) -128);
					} else {
						Class333.method3761(i_9_, Class97.anIntArrayArray814[i_42_], i_45_, i_44_, (byte) 60);
						Class333.method3761(i_9_, Class97.anIntArrayArray814[i_43_], i_45_, i_44_, (byte) -124);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oc.N(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final boolean method625(byte i) {
		try {
			if (i >= -41)
				method552(-65);
			return Class375.method3986(this.anInt494, (byte) -108);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.I(" + i + ')');
		}
	}

	final void method551(byte i) {
		try {
			if (i <= 118)
				method627((byte) 77);
			if (method625((byte) -111)) {
				if (this.aClass98_Sub27_495.aClass64_Sub8_4042.method586(true) && !(Class246_Sub4_Sub2.method3107(this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 121), (byte) -119)))
					this.anInt494 = 1;
				if (this.aClass98_Sub27_495.aClass64_Sub27_4068.method666((byte) 123) == 1)
					this.anInt494 = 1;
			}
			if (this.anInt494 == 3)
				this.anInt494 = 2;
			if (this.anInt494 < 0 || this.anInt494 > 3)
				this.anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.C(" + i + ')');
		}
	}

	final boolean method626(int i) {
		try {
			if (i != -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.G(" + i + ')');
		}
	}

	Class64_Sub18(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method556(int i, int i_48_) {
		try {
			if (Class375.method3986(i, (byte) -108)) {
				if (this.aClass98_Sub27_495.aClass64_Sub8_4042.method586(true) && !(Class246_Sub4_Sub2.method3107(this.aClass98_Sub27_495.aClass64_Sub8_4042.method583((byte) 127), (byte) -85)))
					return 3;
				if (this.aClass98_Sub27_495.aClass64_Sub27_4068.method666((byte) 120) == 1)
					return 3;
			}
			if (i == 3)
				return 3;
			if (i_48_ != 29053)
				aClass332Array3689 = null;
			if (Class375.method3986(i, (byte) -108))
				return 2;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.F(" + i + ',' + i_48_ + ')');
		}
	}

	final int method627(byte i) {
		try {
			if (i < 119)
				anIntArray3688 = null;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.E(" + i + ')');
		}
	}

	static final void method628(int i) {
		try {
			if (Class21_Sub4.anInt5394 != 0) {
				try {
					if (++Class98_Sub26.anInt4028 > 2000) {
						if (aa_Sub1.aClass123_3561 != null) {
							aa_Sub1.aClass123_3561.method2207(-114);
							aa_Sub1.aClass123_3561 = null;
						}
						if (Class372.anInt3150 >= 2) {
							Class55.anInt442 = -5;
							Class21_Sub4.anInt5394 = 0;
							return;
						}
						Class299_Sub2.aClass354_5297.method3874(0);
						Class372.anInt3150++;
						Class98_Sub26.anInt4028 = 0;
						Class21_Sub4.anInt5394 = 1;
					}
					if (Class21_Sub4.anInt5394 == 1) {
						Class246_Sub3_Sub3.aClass143_6155 = (Class299_Sub2.aClass354_5297.method3870(-127, Class98_Sub43_Sub2.aClass88_5907));
						Class21_Sub4.anInt5394 = 2;
					}
					if (Class21_Sub4.anInt5394 == 2) {
						if (Class246_Sub3_Sub3.aClass143_6155.anInt1163 == 2)
							throw new IOException();
						if (Class246_Sub3_Sub3.aClass143_6155.anInt1163 != 1)
							return;
						aa_Sub1.aClass123_3561 = Class196.method2668((Socket) (Class246_Sub3_Sub3.aClass143_6155.anObject1162), (byte) 11, 7500);
						Class246_Sub3_Sub3.aClass143_6155 = null;
						Class95.method920((byte) 127);
						Class21_Sub4.anInt5394 = 4;
					}
					if (i != 19700)
						method622((byte) -71);
					if (Class21_Sub4.anInt5394 == 4) {
						if (aa_Sub1.aClass123_3561.method2203(i + -21649, 1)) {
							aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
							int i_49_ = (IncomingMessages.packetStream.data[0]) & 0xff;
							Class55.anInt442 = i_49_;
							Class21_Sub4.anInt5394 = 0;
							aa_Sub1.aClass123_3561.method2207(-113);
							aa_Sub1.aClass123_3561 = null;
						}
					}
				} catch (IOException ioexception) {
					if (aa_Sub1.aClass123_3561 != null) {
						aa_Sub1.aClass123_3561.method2207(-100);
						aa_Sub1.aClass123_3561 = null;
					}
					if (Class372.anInt3150 >= 2) {
						Class55.anInt442 = -4;
						Class21_Sub4.anInt5394 = 0;
					} else {
						Class299_Sub2.aClass354_5297.method3874(0);
						Class372.anInt3150++;
						Class98_Sub26.anInt4028 = 0;
						Class21_Sub4.anInt5394 = 1;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.D(" + i + ')');
		}
	}

	public static void method629(int i) {
		try {
			if (i == -32294) {
				anIntArray3688 = null;
				aClass332Array3689 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oc.M(" + i + ')');
		}
	}
}
