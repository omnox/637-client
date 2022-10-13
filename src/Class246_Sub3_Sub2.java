/* Class246_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3_Sub2 extends AnimableEntity {
	static final void method3003(int i) {
		do {
			try {
				int i_0_ = 0;
				for (/**/; Class306.anInt2566 > i_0_; i_0_++) {
					Class338 class338 = Class245.aClass338Array1865[i_0_];
					boolean bool = false;
					if (class338.aClass98_Sub31_Sub5_2836 == null) {
						class338.anInt2832--;
						if (class338.anInt2832 < (class338.method3782(-4) ? -1500 : -10))
							bool = true;
						else {
							if ((class338.aByte2840 == 1) && (class338.aClass37_2835 == null)) {
								class338.aClass37_2835 = Class37.method342((Class76_Sub2.aClass207_3733), (class338.anInt2830), 0);
								if (class338.aClass37_2835 == null)
									continue;
								class338.anInt2832 += class338.aClass37_2835.method343();
							} else if (class338.method3782(i ^ 0x548b) && ((class338.aClass98_Sub13_2838) == null || ((class338.aClass98_Sub24_Sub1_2839) == null))) {
								if (class338.aClass98_Sub13_2838 == null)
									class338.aClass98_Sub13_2838 = (Class98_Sub13.method1137(Class196.aClass207_1512, class338.anInt2830));
								if (class338.aClass98_Sub13_2838 == null)
									continue;
								if ((class338.aClass98_Sub24_Sub1_2839) == null) {
									class338.aClass98_Sub24_Sub1_2839 = class338.aClass98_Sub13_2838.method1132(new int[] { 22050 });
									if ((class338.aClass98_Sub24_Sub1_2839) == null)
										continue;
								}
							}
							if (class338.anInt2832 < 0) {
								int i_1_ = 8192;
								int i_2_;
								if (class338.anInt2837 == 0)
									i_2_ = ((class338.anInt2841 * ((class338.aByte2840 == 3) ? Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4054.method641((byte) 121) : Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4066.method641((byte) 125))) >> 2);
								else {
									int i_3_ = 0x3 & (class338.anInt2837) >> 24;
									if ((Player.selfPlayer.height_level) != i_3_)
										i_2_ = 0;
									else {
										int i_4_ = ((0xff & (class338.anInt2837)) << 9);
										int i_5_ = (Player.selfPlayer.getSize() << 8);
										int i_6_ = ((class338.anInt2837 & 0xff3ad9) >> 16);
										int i_7_ = (i_5_ + ((i_6_ << 9) - (-256 - -(Player.selfPlayer.localXPos))));
										int i_8_ = ((class338.anInt2837 >> 8) & 0xff);
										int i_9_ = (-(Player.selfPlayer.localYPos) + ((i_8_ << 9) - (-256 - i_5_)));
										int i_10_ = -512 + (Math.abs(i_7_) + Math.abs(i_9_));
										if (i_10_ > i_4_) {
											class338.anInt2832 = -99999;
											continue;
										}
										if (i_10_ < 0)
											i_10_ = 0;
										i_2_ = ((i_4_ + -i_10_) * (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4051.method641((byte) 127) * (class338.anInt2841)) / i_4_) >> 2;
										if ((class338.aClass246_Sub3_2834) != null && ((class338.aClass246_Sub3_2834) instanceof Class246_Sub3_Sub4)) {
											Class246_Sub3_Sub4 class246_sub3_sub4 = ((Class246_Sub3_Sub4) (class338.aClass246_Sub3_2834));
											short i_11_ = (class246_sub3_sub4.aShort6157);
											short i_12_ = (class246_sub3_sub4.aShort6158);
										}
										if (i_7_ != 0 || i_9_ != 0) {
											int i_13_ = (0x3fff & (-4096 + -GameWorld.cameraYaw - (int) ((Math.atan2(i_7_, i_9_)) * 2607.5945876176133)));
											if (i_13_ > 8192)
												i_13_ = -i_13_ + 16384;
											int i_14_;
											if (i_10_ <= 0)
												i_14_ = 8192;
											else if (i_10_ >= 4096)
												i_14_ = 16384;
											else
												i_14_ = ((-i_10_ + 8192) / 4096 + 8192);
											i_1_ = (i_14_ * i_13_ / 8192 - -(-i_14_ + 16384 >> 1));
										}
									}
								}
								if (i_2_ > 0) {
									Class98_Sub24_Sub1 class98_sub24_sub1 = null;
									if (class338.aByte2840 == 1)
										class98_sub24_sub1 = (class338.aClass37_2835.method344().method1269(LinkedList.aClass314_1195));
									else if (class338.method3782(i + 21637))
										class98_sub24_sub1 = (class338.aClass98_Sub24_Sub1_2839);
									Class98_Sub31_Sub5 class98_sub31_sub5 = (class338.aClass98_Sub31_Sub5_2836 = (Class98_Sub31_Sub5.method1402(class98_sub24_sub1, class338.anInt2843, i_2_, i_1_)));
									class98_sub31_sub5.method1422(-1 + class338.anInt2831);
									Class81.aClass98_Sub31_Sub3_619.method1371(class98_sub31_sub5);
								}
							}
						}
					} else if (!class338.aClass98_Sub31_Sub5_2836.method941((byte) 78))
						bool = true;
					if (bool) {
						Class306.anInt2566--;
						for (int i_15_ = i_0_; (i_15_ < Class306.anInt2566); i_15_++)
							Class245.aClass338Array1865[i_15_] = Class245.aClass338Array1865[i_15_ + 1];
						i_0_--;
					}
				}
				if (Class151_Sub5.aBoolean4991 && !Class8.method188(false)) {
					if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069.method641((byte) 120) != 0 && Class144.anInt1169 != -1) {
						if (Class151_Sub8.aClass98_Sub31_Sub2_5013 == null)
							s_Sub1.method3434((Class98_Sub10_Sub1.aClass207_5544), false, Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069.method641((byte) 123), Class144.anInt1169, 0, -16523);
						else
							Class372.method3959(256, Class144.anInt1169, Class151_Sub8.aClass98_Sub31_Sub2_5013, Class98_Sub10_Sub1.aClass207_5544, Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069.method641((byte) 122), 0, false);
					}
					Class151_Sub5.aBoolean4991 = false;
					Class151_Sub8.aClass98_Sub31_Sub2_5013 = null;
				} else {
					if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069.method641((byte) 126) == 0 || Class144.anInt1169 == -1 || Class8.method188(false))
						break;
					OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (VarpClass.aClass171_3248), (Class331.aClass117_2811));
					class98_sub11.packet.writeInt(i ^ ~0x5db0ede0, Class144.anInt1169);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					Class144.anInt1169 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ic.IA(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2991(boolean bool) {
		try {
			if (bool != false)
				IncomingOpcode.aClass58_6151 = null;
			return (Class74.aBooleanArrayArray551[Class259.anInt1959 + ((this.localXPos >> Class151_Sub8.anInt5015) + -Class241.anInt1845)][(Class259.anInt1959 + -Class64_Sub26.anInt3714 + (this.localYPos >> Class151_Sub8.anInt5015))]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ic.FA(" + bool + ')');
		}
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_16_, ha var_ha, int i_17_, int i_18_) {
		try {
			int i_19_ = 102 / ((i - 15) / 55);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ic.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_16_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	final boolean method2977(ha var_ha, byte i) {
		try {
			if (i != 77)
				method2981(null, (byte) 76, true, 85, null, -57, 85);
			Class154 class154 = Class94.method914(this.height_level, (this.localXPos >> Class151_Sub8.anInt5015), (this.localYPos >> Class151_Sub8.anInt5015));
			if (class154 == null || !(class154.aClass246_Sub3_Sub4_1232.aBoolean6162))
				return Class76_Sub5.method758((byte) 103, this.height_level, (this.localYPos >> Class151_Sub8.anInt5015), (this.localXPos >> Class151_Sub8.anInt5015));
			return Class195.method2661(this.height_level, (this.localYPos >> Class151_Sub8.anInt5015), (this.localXPos >> Class151_Sub8.anInt5015), (class154.aClass246_Sub3_Sub4_1232.method2990(0) + this.method2990(i ^ 0x4d)), (byte) -118);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ic.AA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3004(int i) {
		try {
			if (i < -117)
				IncomingOpcode.aClass58_6151 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ic.EA(" + i + ')');
		}
	}

	static final void method3005(int i) {
		try {
			int i_20_ = Class105.aByteArrayArray3414.length;
			int i_21_ = 0;
			if (i != 21378)
				method3005(36);
			for (/**/; i_20_ > i_21_; i_21_++) {
				if (Class105.aByteArrayArray3414[i_21_] != null) {
					int i_22_ = -1;
					for (int i_23_ = 0; (Class254.anInt1944 > i_23_); i_23_++) {
						if (Class213.anIntArray1607[i_23_] == Class121.anIntArray1006[i_21_]) {
							i_22_ = i_23_;
							break;
						}
					}
					if (i_22_ == -1) {
						Class213.anIntArray1607[Class254.anInt1944] = Class121.anIntArray1006[i_21_];
						i_22_ = Class254.anInt1944++;
					}
					RSByteBuffer class98_sub22 = new RSByteBuffer(Class105.aByteArrayArray3414[i_21_]);
					int i_24_ = 0;
					while (class98_sub22.position < Class105.aByteArrayArray3414[i_21_].length) {
						if (i_24_ >= 511 || Class150.anInt1211 >= 1023)
							break;
						int i_25_ = i_24_++ << 6 | i_22_;
						int i_26_ = class98_sub22.readShort();
						int i_27_ = i_26_ >> 14;
						int i_28_ = (i_26_ & 0x1fd6) >> 7;
						int i_29_ = 0x3f & i_26_;
						int i_30_ = (i_28_ + (Class121.anIntArray1006[i_21_] >> 8) * 64 - Class272.anInt2038);
						int i_31_ = (-aa_Sub2.anInt3562 + (64 * (0xff & Class121.anIntArray1006[i_21_]) - -i_29_));
						Class141 class141 = (Class4.aClass301_85.method3538(class98_sub22.readShort()));
						Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_25_, i ^ ~0x5382));
						if (class98_sub39 == null && (class141.aByte1103 & 0x1) > 0 && Class115.anInt963 == i_27_ && i_30_ >= 0 && (GameWorld.size_x > i_30_ + class141.anInt1112) && i_31_ >= 0 && (class141.anInt1112 + i_31_ < GameWorld.size_y)) {
							Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = new Class246_Sub3_Sub4_Sub2_Sub1();
							class246_sub3_sub4_sub2_sub1.anInt6369 = i_25_;
							Class98_Sub39 class98_sub39_32_ = (new Class98_Sub39(class246_sub3_sub4_sub2_sub1));
							Class260.aClass377_3254.method3996(class98_sub39_32_, i_25_, i + -21379);
							Class163.aClass98_Sub39Array3516[Class98_Sub10_Sub20.anInt5640++] = class98_sub39_32_;
							Class325.anIntArray2726[Class150.anInt1211++] = i_25_;
							class246_sub3_sub4_sub2_sub1.anInt6406 = Class215.anInt1614;
							class246_sub3_sub4_sub2_sub1.method3054(class141, 1);
							class246_sub3_sub4_sub2_sub1.method3045((byte) 70, class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1112);
							class246_sub3_sub4_sub2_sub1.anInt6414 = (class246_sub3_sub4_sub2_sub1.aClass141_6504.anInt1091 << 3);
							class246_sub3_sub4_sub2_sub1.method3047((class246_sub3_sub4_sub2_sub1.aClass141_6504.aByte1141 + 4 << 11) & 0x3fda, true, 16);
							class246_sub3_sub4_sub2_sub1.method3049(class246_sub3_sub4_sub2_sub1.getSize(), i_30_, true, (byte) -122, i_31_, i_27_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ic.BA(" + i + ')');
		}
	}

	Class246_Sub3_Sub2(int i, int i_33_, int i_34_, int i_35_, int i_36_) {
		try {
			this.anInt5089 = i_33_;
			this.localYPos = i_34_;
			this.aByte5081 = (byte) i_36_;
			this.localXPos = i;
			this.height_level = (byte) i_35_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ic.<init>(" + i + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}

	final void method2992(byte i) {
		try {
			if (i != -73)
				IncomingOpcode.aClass58_6151 = null;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ic.DA(" + i + ')');
		}
	}

	final boolean method2982(byte i) {
		try {
			if (i >= -70)
				IncomingOpcode.aClass58_6151 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ic.HA(" + i + ')');
		}
	}

	final int method2980(int i, Class98_Sub5[] class98_sub5s) {
		try {
			int i_37_ = 34 % ((29 - i) / 62);
			return this.method2989((this.localXPos >> Class151_Sub8.anInt5015), false, class98_sub5s, (this.localYPos >> Class151_Sub8.anInt5015));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ic.GA(" + i + ',' + (class98_sub5s != null ? "{...}" : "null") + ')'));
		}
	}
}
