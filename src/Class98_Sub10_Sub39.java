/* Class98_Sub10_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub39 extends Class98_Sub10 {
	static long[] aLongArray5772 = new long[10];
	static RuneScapeCache aClass207_5773;

	public static void method1119(int i) {
		try {
			aLongArray5772 = null;
			if (i != 0)
				aClass207_5773 = null;
			aClass207_5773 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wm.B(" + i + ')');
		}
	}

	final int[][] method997(int i, int i_0_) {
		try {
			int[][] is = this.aClass223_3859.method2828(i_0_, 0);
			if (i >= -76)
				aClass207_5773 = null;
			if (this.aClass223_3859.aBoolean1683) {
				int[][] is_1_ = this.method994(i_0_, 24431, 0);
				int[] is_2_ = is_1_[0];
				int[] is_3_ = is_1_[1];
				int[] is_4_ = is_1_[2];
				int[] is_5_ = is[0];
				int[] is_6_ = is[1];
				int[] is_7_ = is[2];
				for (int i_8_ = 0; i_8_ < Class25.anInt268; i_8_++) {
					is_5_[i_8_] = -is_2_[i_8_] + 4096;
					is_6_[i_8_] = 4096 + -is_3_[i_8_];
					is_7_[i_8_] = -is_4_[i_8_] + 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wm.C(" + i + ',' + i_0_ + ')');
		}
	}

	public Class98_Sub10_Sub39() {
		super(1, false);
	}

	static final long method1120(Interface19 interface19, byte i, int i_9_, int i_10_) {
		try {
			if (i != 113)
				return 76L;
			long l = 4194304L;
			long l_11_ = -9223372036854775808L;
			Class352 class352 = Class130.aClass302_1028.method3546(interface19.method64(30472), (byte) 119);
			long l_12_ = interface19.method63((byte) 20) << 14 | (i_10_ << 7 | i_9_) | interface19.method66(i ^ 0x1240) << 20 | 0x40000000;
			if (class352.anInt2998 == 0)
				l_12_ |= l_11_;
			if (class352.anInt2975 == 1)
				l_12_ |= l;
			l_12_ |= (long) interface19.method64(i ^ 0x7779) << 32;
			return l_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wm.F(" + (interface19 != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final int[] method990(int i, int i_13_) {
		try {
			int[] is = this.aClass16_3863.method237((byte) 98, i_13_);
			if (i != 255)
				method1120(null, (byte) 69, -45, -45);
			if (this.aClass16_3863.aBoolean198) {
				int[] is_14_ = this.method1000(i_13_, 0, 0);
				for (int i_15_ = 0; Class25.anInt268 > i_15_; i_15_++)
					is[i_15_] = -is_14_[i_15_] + 4096;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wm.G(" + i + ',' + i_13_ + ')');
		}
	}

	static final void method1121(byte i, ha var_ha, int i_16_, int i_17_, int i_18_, int i_19_) {
		try {
			int i_20_ = 21 % ((-59 - i) / 48);
			Class154.aHa1231 = var_ha;
			Class98_Sub5_Sub3.aClass111_5540 = Class154.aHa1231.method1821();
			Class42_Sub3.aClass111_5364 = Class154.aHa1231.method1821();
			Class200.aClass111_1543 = Class154.aHa1231.method1821();
			Class146_Sub2.anIntArray4873 = null;
			Class111_Sub3.anInt4701 = i_19_;
			Class377.anInt3183 = i_18_;
			Class172.anInterface17Array1327 = null;
			Class98_Sub46.anInt4261 = 0;
			Class287_Sub2.method3391(i_16_, i_17_, 2);
			Class224_Sub2_Sub1.anInt6141 = -1;
			aa_Sub1.anInt3558 = -1;
			Class109.anInt926 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wm.D(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_21_) {
		do {
			try {
				if (i_21_ < -92) {
					if (i != 0)
						break;
					this.aBoolean3861 = class98_sub22.readUnsignedByte() == 1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("wm.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_21_ + ')'));
			}
			break;
		} while (false);
	}

	static final String method1122(int i, byte i_22_) {
		try {
			if (i_22_ >= -11)
				return null;
			return (String.valueOf(i >> 24 & 0xff) + "." + (0xff & i >> 16) + "." + (i >> 8 & 0xff) + "." + (0xff & i));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wm.E(" + i + ',' + i_22_ + ')');
		}
	}
}
