/* Class98_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub31_Sub1 extends Class98_Sub31 {
	private Class98_Sub31_Sub2 aClass98_Sub31_Sub2_5815;
	static Map aClass305_Sub1_5816;
	LinkedList aClass148_5817 = new LinkedList();
	Class98_Sub31_Sub3 aClass98_Sub31_Sub3_5818 = new Class98_Sub31_Sub3();

	final int method1326() {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.G(" + ')');
		}
	}

	final void method1325(int[] is, int i, int i_0_) {
		try {
			((Class98_Sub31_Sub1) this).aClass98_Sub31_Sub3_5818.method1325(is, i, i_0_);
			Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) this).aClass148_5817.method2418(32));
			while_19_: for (/**/; class98_sub16 != null; class98_sub16 = (Class98_Sub16) ((Class98_Sub31_Sub1) this).aClass148_5817.method2417(111)) {
				if (!aClass98_Sub31_Sub2_5815.method1345(1816, class98_sub16)) {
					int i_1_ = i;
					int i_2_ = i_0_;
					while (((Class98_Sub16) class98_sub16).anInt3923 < i_2_) {
						method1328(i_2_ + i_1_, ((Class98_Sub16) class98_sub16).anInt3923, i_1_, 1048575, is, class98_sub16);
						i_1_ += ((Class98_Sub16) class98_sub16).anInt3923;
						i_2_ -= ((Class98_Sub16) class98_sub16).anInt3923;
						if (aClass98_Sub31_Sub2_5815.method1340(i_2_, is, 2, i_1_, class98_sub16))
							continue while_19_;
					}
					method1328(i_2_ + i_1_, i_2_, i_1_, 1048575, is, class98_sub16);
					((Class98_Sub16) class98_sub16).anInt3923 -= i_2_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ap.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	private final void method1328(int i, int i_3_, int i_4_, int i_5_, int[] is, Class98_Sub16 class98_sub16) {
		do {
			try {
				if (((((Class98_Sub31_Sub2) aClass98_Sub31_Sub2_5815).anIntArray5840[((Class98_Sub16) class98_sub16).anInt3940]) & 0x4 ^ 0xffffffff) != -1 && ((Class98_Sub16) class98_sub16).anInt3930 < 0) {
					int i_6_ = ((((Class98_Sub31_Sub2) aClass98_Sub31_Sub2_5815).anIntArray5843[((Class98_Sub16) class98_sub16).anInt3940]) / Class64_Sub15.anInt3678);
					for (;;) {
						int i_7_ = ((1048575 - -i_6_ + -((Class98_Sub16) class98_sub16).anInt3919) / i_6_);
						if (i_3_ < i_7_)
							break;
						((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1325(is, i_4_, i_7_);
						i_4_ += i_7_;
						((Class98_Sub16) class98_sub16).anInt3919 += i_7_ * i_6_ - 1048576;
						i_3_ -= i_7_;
						int i_8_ = Class64_Sub15.anInt3678 / 100;
						int i_9_ = 262144 / i_6_;
						if (i_9_ < i_8_)
							i_8_ = i_9_;
						Class98_Sub31_Sub5 class98_sub31_sub5 = (((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939);
						if (((((Class98_Sub31_Sub2) aClass98_Sub31_Sub2_5815).anIntArray5842[((Class98_Sub16) class98_sub16).anInt3940]) ^ 0xffffffff) != -1) {
							((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5.method1402((((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934), class98_sub31_sub5.method1430(), 0, class98_sub31_sub5.method1426()));
							aClass98_Sub31_Sub2_5815.method1361(1, ((((Class98_Sub44) (((Class98_Sub16) class98_sub16).aClass98_Sub44_3918)).aShortArray4248[((Class98_Sub16) class98_sub16).anInt3936]) ^ 0xffffffff) > -1, class98_sub16);
							((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1397(i_8_, class98_sub31_sub5.method1400());
						} else
							((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5.method1402((((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934), class98_sub31_sub5.method1430(), class98_sub31_sub5.method1400(), class98_sub31_sub5.method1426()));
						if (((((Class98_Sub44) (((Class98_Sub16) class98_sub16).aClass98_Sub44_3918)).aShortArray4248[((Class98_Sub16) class98_sub16).anInt3936]) ^ 0xffffffff) > -1)
							((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1422(-1);
						class98_sub31_sub5.method1423(i_8_);
						class98_sub31_sub5.method1325(is, i_4_, i - i_4_);
						if (class98_sub31_sub5.method1425())
							((Class98_Sub31_Sub1) this).aClass98_Sub31_Sub3_5818.method1371(class98_sub31_sub5);
					}
					((Class98_Sub16) class98_sub16).anInt3919 += i_6_ * i_3_;
				}
				((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1325(is, i_4_, i_3_);
				if (i_5_ == 1048575)
					break;
				method1321(-128);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ap.C(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + (is != null ? "{...}" : "null") + ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method1329(byte i) {
		try {
			if (i >= -17)
				aClass305_Sub1_5816 = null;
			aClass305_Sub1_5816 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.E(" + i + ')');
		}
	}

	final Class98_Sub31 method1327() {
		try {
			Class98_Sub16 class98_sub16;
			do {
				class98_sub16 = (Class98_Sub16) ((Class98_Sub31_Sub1) this).aClass148_5817.method2417(117);
				if (class98_sub16 == null)
					return null;
			} while (((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 == null);
			return ((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.D(" + ')');
		}
	}

	final Class98_Sub31 method1322() {
		try {
			Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) this).aClass148_5817.method2418(32));
			if (class98_sub16 == null)
				return null;
			if (((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 != null)
				return (((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939);
			return method1327();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.B(" + ')');
		}
	}

	final void method1321(int i) {
		try {
			((Class98_Sub31_Sub1) this).aClass98_Sub31_Sub3_5818.method1321(i);
			Class98_Sub16 class98_sub16 = ((Class98_Sub16) ((Class98_Sub31_Sub1) this).aClass148_5817.method2418(32));
			while_21_: for (/**/; class98_sub16 != null; class98_sub16 = (Class98_Sub16) ((Class98_Sub31_Sub1) this).aClass148_5817.method2417(94)) {
				if (!aClass98_Sub31_Sub2_5815.method1345(1816, class98_sub16)) {
					int i_10_ = i;
					while ((i_10_ ^ 0xffffffff) < (((Class98_Sub16) class98_sub16).anInt3923 ^ 0xffffffff)) {
						method1330(((Class98_Sub16) class98_sub16).anInt3923, class98_sub16, -1);
						i_10_ -= ((Class98_Sub16) class98_sub16).anInt3923;
						if (aClass98_Sub31_Sub2_5815.method1340(i_10_, null, 2, 0, class98_sub16))
							continue while_21_;
					}
					method1330(i_10_, class98_sub16, -1);
					((Class98_Sub16) class98_sub16).anInt3923 -= i_10_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.M(" + i + ')');
		}
	}

	private final void method1330(int i, Class98_Sub16 class98_sub16, int i_11_) {
		try {
			if ((0x4 & (((Class98_Sub31_Sub2) aClass98_Sub31_Sub2_5815).anIntArray5840[((Class98_Sub16) class98_sub16).anInt3940])) != 0 && ((((Class98_Sub16) class98_sub16).anInt3930 ^ 0xffffffff) > -1)) {
				int i_12_ = ((((Class98_Sub31_Sub2) aClass98_Sub31_Sub2_5815).anIntArray5843[((Class98_Sub16) class98_sub16).anInt3940]) / Class64_Sub15.anInt3678);
				int i_13_ = ((1048575 - (-i_12_ - -((Class98_Sub16) class98_sub16).anInt3919)) / i_12_);
				((Class98_Sub16) class98_sub16).anInt3919 = 0xfffff & (i * i_12_ + ((Class98_Sub16) class98_sub16).anInt3919);
				if ((i_13_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
					do {
						if ((((Class98_Sub31_Sub2) aClass98_Sub31_Sub2_5815).anIntArray5842[((Class98_Sub16) class98_sub16).anInt3940]) != 0) {
							((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5.method1402((((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934), ((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1430(), 0, ((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1426()));
							aClass98_Sub31_Sub2_5815.method1361(i_11_ + 2, ((((Class98_Sub44) (((Class98_Sub16) class98_sub16).aClass98_Sub44_3918)).aShortArray4248[((Class98_Sub16) class98_sub16).anInt3936]) ^ 0xffffffff) > -1, class98_sub16);
							if (!client.aBoolean3553)
								break;
						}
						((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5.method1402((((Class98_Sub16) class98_sub16).aClass98_Sub24_Sub1_3934), ((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1430(), ((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1400(), ((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1426()));
					} while (false);
					if (((((Class98_Sub44) ((Class98_Sub16) class98_sub16).aClass98_Sub44_3918).aShortArray4248[((Class98_Sub16) class98_sub16).anInt3936]) ^ 0xffffffff) > -1)
						((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1422(-1);
					i = ((Class98_Sub16) class98_sub16).anInt3919 / i_12_;
				}
			}
			if (i_11_ != -1)
				method1327();
			((Class98_Sub16) class98_sub16).aClass98_Sub31_Sub5_3939.method1321(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ap.F(" + i + ',' + (class98_sub16 != null ? "{...}" : "null") + ',' + i_11_ + ')'));
		}
	}

	Class98_Sub31_Sub1(Class98_Sub31_Sub2 class98_sub31_sub2) {
		try {
			aClass98_Sub31_Sub2_5815 = class98_sub31_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ap.<init>(" + (class98_sub31_sub2 != null ? "{...}" : "null") + ')'));
		}
	}
}
