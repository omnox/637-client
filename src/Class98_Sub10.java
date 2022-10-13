/* Class98_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class98_Sub10 extends Node {
	Class98_Sub10[] aClass98_Sub10Array3857;
	static boolean aBoolean3858;
	Class223 aClass223_3859;
	int anInt3860;
	boolean aBoolean3861;
	static boolean aBoolean3862;
	Class16 aClass16_3863;

	int[] method990(int i, int i_0_) {
		try {
			if (i != 255)
				this.aClass98_Sub10Array3857 = null;
			throw new IllegalStateException("This operation does not have a monochrome output");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.G(" + i + ',' + i_0_ + ')');
		}
	}

	void method991(int i, RSByteBuffer class98_sub22, byte i_1_) {
		try {
			if (i_1_ > -92)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dt.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	int method992(int i) {
		try {
			int i_2_ = 27 / ((i - -20) / 33);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.S(" + i + ')');
		}
	}

	void method993(int i) {
		try {
			if (i != 1002)
				aBoolean3862 = true;
			if (this.aBoolean3861) {
				this.aClass16_3863.method236(34);
				this.aClass16_3863 = null;
			} else {
				this.aClass223_3859.method2831(0);
				this.aClass223_3859 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.P(" + i + ')');
		}
	}

	final int[][] method994(int i, int i_3_, int i_4_) {
		try {
			if (i_3_ != 24431)
				this.aClass16_3863 = null;
			if (!this.aClass98_Sub10Array3857[i_4_].aBoolean3861)
				return this.aClass98_Sub10Array3857[i_4_].method997(-119, i);
			int[] is = this.aClass98_Sub10Array3857[i_4_].method990(i_3_ + -24176, i);
			int[][] is_5_ = new int[3][];
			is_5_[1] = is;
			is_5_[2] = is;
			is_5_[0] = is;
			return is_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dt.L(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method995(Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1, byte i, boolean bool) {
		try {
			if (Class359.anInt3058 < 400) {
				Class141 class141 = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
				if (i != 55)
					aBoolean3858 = true;
				if (class141.anIntArray1109 != null) {
					class141 = class141.method2300(Class75.aClass140_584, (byte) 120);
					if (class141 == null)
						return;
				}
				if (class141.aBoolean1116) {
					String string = class141.aString1144;
					if (class141.anInt1115 != 0) {
						String string_6_ = ((Class64_Sub2.aClass279_3643 != Class4.aClass279_86) ? TextResources.LEVEL.get_text(Class374.anInt3159) : (TextResources.aClass309_2616.get_text(Class374.anInt3159)));
						string += ((Class108.method1730((Player.selfPlayer.playerCbLevel), class141.anInt1115, i + 16328)) + " (" + string_6_ + class141.anInt1115 + ")");
					}
					if (Class98_Sub10_Sub9.aBoolean5585 && !bool) {
						ParamType class149 = (Class98_Sub46_Sub1.anInt5945 != -1 ? (Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, Class98_Sub46_Sub1.anInt5945)) : null);
						if ((0x2 & Class98_Sub4.anInt3826) != 0 && (class149 == null || (class149.anInt1202 != class141.method2305((Class98_Sub46_Sub1.anInt5945), (class149.anInt1202), (byte) 125))))
							GameInterfaceData.method3470(false, true, class246_sub3_sub4_sub2_sub1.anInt6369, Class336.anInt2823, 0, (Class246_Sub3_Sub3.aString6156 + " -> <col=ffff00>" + string), false, 0, 48, class246_sub3_sub4_sub2_sub1.anInt6369, -1, false, Class287_Sub2.aString3272);
					}
					if (!bool) {
						String[] strings = class141.aStringArray1148;
						if (Class34.aBoolean324)
							strings = Class98_Sub10_Sub6.method1022(i ^ ~0x37b, strings);
						if (strings != null) {
							for (int i_7_ = 4; i_7_ >= 0; i_7_--) {
								if (strings[i_7_] != null && (class141.aByte1129 == 0 || !(strings[i_7_].equalsIgnoreCase(TextResources.ATTACK.get_text(Class374.anInt3159))))) {
									int i_8_ = 0;
									if (i_7_ == 0)
										i_8_ = 10;
									int i_9_ = Class284_Sub2.anInt5186;
									if (i_7_ == 1)
										i_8_ = 25;
									if (i_7_ == 2)
										i_8_ = 11;
									if (i_7_ == 3)
										i_8_ = 12;
									if (class141.anInt1143 == i_7_)
										i_9_ = class141.anInt1154;
									if (i_7_ == 4)
										i_8_ = 17;
									if (class141.anInt1114 == i_7_)
										i_9_ = class141.anInt1110;
									GameInterfaceData.method3470(false, true, class246_sub3_sub4_sub2_sub1.anInt6369, ((strings[i_7_].equalsIgnoreCase(TextResources.ATTACK.get_text(Class374.anInt3159))) ? class141.anInt1099 : i_9_), 0, "<col=ffff00>" + string, false, 0, i_8_, class246_sub3_sub4_sub2_sub1.anInt6369, -1, false, strings[i_7_]);
								}
							}
						}
						if (class141.aByte1129 == 1 && strings != null) {
							for (int i_10_ = 4; i_10_ >= 0; i_10_--) {
								if (strings[i_10_] != null && (strings[i_10_].equalsIgnoreCase(TextResources.ATTACK.get_text(Class374.anInt3159)))) {
									short i_11_ = 0;
									if (class141.anInt1115 > (Player.selfPlayer.playerCbLevel))
										i_11_ = (short) 2000;
									short i_12_ = 0;
									if (i_10_ == 0)
										i_12_ = (short) 10;
									if (i_10_ == 1)
										i_12_ = (short) 25;
									if (i_10_ == 2)
										i_12_ = (short) 11;
									if (i_10_ == 3)
										i_12_ = (short) 12;
									if (i_10_ == 4)
										i_12_ = (short) 17;
									if (i_12_ != 0)
										i_12_ += i_11_;
									GameInterfaceData.method3470(false, true, class246_sub3_sub4_sub2_sub1.anInt6369, class141.anInt1099, 0, "<col=ffff00>" + string, false, 0, i_12_, class246_sub3_sub4_sub2_sub1.anInt6369, -1, false, strings[i_10_]);
								}
							}
						}
					}
					GameInterfaceData.method3470(false, true, class246_sub3_sub4_sub2_sub1.anInt6369, Class16.anInt190, 0, "<col=ffff00>" + string, false, 0, 1002, class246_sub3_sub4_sub2_sub1.anInt6369, -1, bool, TextResources.EXAMINE.get_text(Class374.anInt3159));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dt.N(" + ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
		}
	}

	int method996(byte i) {
		try {
			if (i > -119)
				return 85;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.M(" + i + ')');
		}
	}

	int[][] method997(int i, int i_13_) {
		try {
			if (i > -76)
				method999((byte) 1);
			throw new IllegalStateException("This operation does not have a colour output");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.C(" + i + ',' + i_13_ + ')');
		}
	}

	void method998(int i, int i_14_, int i_15_) {
		try {
			int i_16_ = (i_15_ == (~((Class98_Sub10) this).anInt3860) ? i : this.anInt3860);
			if (this.aBoolean3861)
				this.aClass16_3863 = new Class16(i_16_, i, i_14_);
			else
				this.aClass223_3859 = new Class223(i_16_, i, i_14_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dt.O(" + i + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	static final void method999(byte i) {
		try {
			if (Class177.anInt1376 != 3) {
				if (Class177.anInt1376 == 7)
					Class61.method538(8, false);
				else if (Class177.anInt1376 == 10)
					Class61.method538(11, false);
			} else
				Class61.method538(4, false);
			int i_17_ = 83 / ((i - 56) / 55);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.R(" + i + ')');
		}
	}

	Class98_Sub10(int i, boolean bool) {
		try {
			this.aBoolean3861 = bool;
			this.aClass98_Sub10Array3857 = new Class98_Sub10[i];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.<init>(" + i + ',' + bool + ')');
		}
	}

	final int[] method1000(int i, int i_18_, int i_19_) {
		try {
			if (i_19_ != 0)
				method993(-48);
			if (this.aClass98_Sub10Array3857[i_18_].aBoolean3861)
				return this.aClass98_Sub10Array3857[i_18_].method990(255, i);
			return (this.aClass98_Sub10Array3857[i_18_].method997(-94, i)[0]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dt.Q(" + i + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	void method1001(byte i) {
		try {
			if (i != 66)
				this.anInt3860 = 121;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dt.I(" + i + ')');
		}
	}
}
