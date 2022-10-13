/* Class98_Sub10_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub24 extends Class98_Sub10 {
	private int anInt5665 = 1;
	static Class101[] aClass101Array5666;
	private static short[] aShortArray5667 = { 967, 20428, -21577, 11219, -10290 };
	static RuneScapeCache aClass207_5668;
	static short[][] aShortArrayArray5669;
	private static short[] aShortArray5670 = { 957, 20418, -21587, 11209, -10300 };
	static int anInt5671;
	private int anInt5672 = 1;
	private static short[] aShortArray5673;
	private static short[] aShortArray5674;

	final int[] method990(int i, int i_0_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237((byte) 98, i_0_);
			if (i != 255)
				aClass207_5668 = null;
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
				int i_1_ = 1 + (anInt5665 - -anInt5665);
				int i_2_ = 65536 / i_1_;
				int i_3_ = 1 + anInt5672 + anInt5672;
				int i_4_ = 65536 / i_3_;
				int[][] is_5_ = new int[i_1_][];
				for (int i_6_ = i_0_ + -anInt5665; anInt5665 + i_0_ >= i_6_; i_6_++) {
					int[] is_7_ = this.method1000(i_6_ & za_Sub1.anInt6075, 0, i ^ 0xff);
					int[] is_8_ = new int[Class25.anInt268];
					int i_9_ = 0;
					for (int i_10_ = -anInt5672; (anInt5672 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff); i_10_++)
						i_9_ += is_7_[Class329.anInt2761 & i_10_];
					int i_11_ = 0;
					while ((i_11_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)) {
						is_8_[i_11_] = i_9_ * i_4_ >> 880426384;
						i_9_ -= is_7_[Class329.anInt2761 & -anInt5672 + i_11_];
						i_11_++;
						i_9_ += is_7_[Class329.anInt2761 & i_11_ - -anInt5672];
					}
					is_5_[i_6_ + (anInt5665 + -i_0_)] = is_8_;
				}
				for (int i_12_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
					int i_13_ = 0;
					for (int i_14_ = 0; i_14_ < i_1_; i_14_++)
						i_13_ += is_5_[i_14_][i_12_];
					is[i_12_] = i_2_ * i_13_ >> -153979312;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.G(" + i + ',' + i_0_ + ')');
		}
	}

	static final byte[] method1075(byte[] is, boolean bool) {
		try {
			if (is == null)
				return null;
			if (bool != true)
				return null;
			byte[] is_15_ = new byte[is.length];
			Class236.method2894(is, 0, is_15_, 0, is.length);
			return is_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("od.F(" + (is != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final boolean method1076(int i) {
		try {
			int i_16_ = -112 / ((31 - i) / 45);
			try {
				return PacketParser.method3967(525200579);
			} catch (java.io.IOException ioexception) {
				Canvas_Sub1.method118((byte) 104);
				return true;
			} catch (Exception exception) {
				exception.printStackTrace();
				String string = ("T2 - " + (IncomingOpcode.currentIncommingOpcode != null ? IncomingOpcode.currentIncommingOpcode.method521((byte) 89) : -1) + "," + (IncomingOpcode.aClass58_3262 != null ? IncomingOpcode.aClass58_3262.method521((byte) 64) : -1) + "," + (IncomingOpcode.aClass58_5641 == null ? -1 : IncomingOpcode.aClass58_5641.method521((byte) 97)) + " - " + Class65.anInt496 + "," + (Class272.anInt2038 + (((Mobile) Player.selfPlayer).walkQueueX[0])) + "," + (aa_Sub2.anInt3562 + (((Mobile) Player.selfPlayer).walkQueueZ[0])) + " - ");
				for (int i_17_ = 0; i_17_ < Class65.anInt496 && (i_17_ ^ 0xffffffff) > -51; i_17_++)
					string += (((RSByteBuffer) IncomingMessages.packetStream).data[i_17_]) + ",";
				Map.method3585(exception, -124, string);
				Class98_Sub10_Sub1.exitToLobby(false, false);
				return true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.E(" + i + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_18_) {
		while_135_: do {
			try {
				if (i_18_ >= -92)
					method1075(null, true);
				int i_19_ = i;
				while_134_: do {
					do {
						if (i_19_ != 0) {
							if (i_19_ == 1)
								break;
							if (i_19_ != 2)
								break while_135_;
							if (!client.aBoolean3553)
								break while_134_;
						}
						anInt5672 = class98_sub22.readUnsignedByte();
						return;
					} while (false);
					anInt5665 = class98_sub22.readUnsignedByte();
					return;
				} while (false);
				((Class98_Sub10) this).aBoolean3861 = class98_sub22.readUnsignedByte() == 1;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("od.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_18_ + ')'));
			}
		} while (false);
	}

	final int[][] method997(int i, int i_20_) {
		try {
			if (i > -76)
				anInt5671 = -102;
			int[][] is = ((Class98_Sub10) this).aClass223_3859.method2828(i_20_, 0);
			if (((Class223) ((Class98_Sub10) this).aClass223_3859).aBoolean1683) {
				int i_21_ = anInt5665 + anInt5665 + 1;
				int i_22_ = 65536 / i_21_;
				int i_23_ = anInt5672 + anInt5672 + 1;
				int i_24_ = 65536 / i_23_;
				int[][][] is_25_ = new int[i_21_][][];
				for (int i_26_ = -anInt5665 + i_20_; (i_26_ ^ 0xffffffff) >= (i_20_ - -anInt5665 ^ 0xffffffff); i_26_++) {
					int[][] is_27_ = this.method994(i_26_ & za_Sub1.anInt6075, 24431, 0);
					int[][] is_28_ = new int[3][Class25.anInt268];
					int i_29_ = 0;
					int i_30_ = 0;
					int i_31_ = 0;
					int[] is_32_ = is_27_[0];
					int[] is_33_ = is_27_[1];
					int[] is_34_ = is_27_[2];
					for (int i_35_ = -anInt5672; (anInt5672 ^ 0xffffffff) <= (i_35_ ^ 0xffffffff); i_35_++) {
						int i_36_ = Class329.anInt2761 & i_35_;
						i_29_ += is_32_[i_36_];
						i_30_ += is_33_[i_36_];
						i_31_ += is_34_[i_36_];
					}
					int[] is_37_ = is_28_[0];
					int[] is_38_ = is_28_[1];
					int[] is_39_ = is_28_[2];
					int i_40_ = 0;
					while (Class25.anInt268 > i_40_) {
						is_37_[i_40_] = i_24_ * i_29_ >> -948678224;
						is_38_[i_40_] = i_24_ * i_30_ >> -1965134224;
						is_39_[i_40_] = i_24_ * i_31_ >> 1110096464;
						int i_41_ = Class329.anInt2761 & -anInt5672 + i_40_;
						i_30_ -= is_33_[i_41_];
						i_31_ -= is_34_[i_41_];
						i_29_ -= is_32_[i_41_];
						i_40_++;
						i_41_ = Class329.anInt2761 & i_40_ - -anInt5672;
						i_29_ += is_32_[i_41_];
						i_31_ += is_34_[i_41_];
						i_30_ += is_33_[i_41_];
					}
					is_25_[i_26_ - (-anInt5665 - -i_20_)] = is_28_;
				}
				int[] is_42_ = is[0];
				int[] is_43_ = is[1];
				int[] is_44_ = is[2];
				for (int i_45_ = 0; i_45_ < Class25.anInt268; i_45_++) {
					int i_46_ = 0;
					int i_47_ = 0;
					int i_48_ = 0;
					for (int i_49_ = 0; (i_21_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
						int[][] is_50_ = is_25_[i_49_];
						i_48_ += is_50_[2][i_45_];
						i_47_ += is_50_[1][i_45_];
						i_46_ += is_50_[0][i_45_];
					}
					is_42_[i_45_] = i_46_ * i_22_ >> 710103472;
					is_43_[i_45_] = i_47_ * i_22_ >> -1587122512;
					is_44_[i_45_] = i_22_ * i_48_ >> 807012816;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.C(" + i + ',' + i_20_ + ')');
		}
	}

	public Class98_Sub10_Sub24() {
		super(1, false);
	}

	static final void method1077(int i, boolean bool, int i_51_, int i_52_, int i_53_, int i_54_, GameInterfaceData[] class293s, int i_55_, int i_56_, boolean bool_57_, int i_58_) {
		try {
			Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
			if (bool == true) {
				int i_59_ = 0;
				for (/**/; (i_59_ ^ 0xffffffff) > (class293s.length ^ 0xffffffff); i_59_++) {
					GameInterfaceData class293 = class293s[i_59_];
					if (class293 != null && (i == ((GameInterfaceData) class293).anInt2234 || (i == -1412584499 && Class255.draggedComponent == class293))) {
						int i_60_ = i_51_ + ((GameInterfaceData) class293).anInt2347;
						int i_61_ = ((GameInterfaceData) class293).anInt2299 + i_58_;
						int i_62_ = 1 + (((GameInterfaceData) class293).anInt2311 + i_60_);
						int i_63_ = ((GameInterfaceData) class293).anInt2258 + i_61_ + 1;
						int i_64_;
						if (i_54_ == -1) {
							Class98_Sub35.aRectangleArray4144[Class69_Sub2.anInt5335].setBounds(i_51_ + ((GameInterfaceData) class293).anInt2347, ((GameInterfaceData) class293).anInt2299 - -i_58_, ((GameInterfaceData) class293).anInt2311, ((GameInterfaceData) class293).anInt2258);
							i_64_ = Class69_Sub2.anInt5335++;
						} else
							i_64_ = i_54_;
						((GameInterfaceData) class293).anInt2250 = Class215.anInt1614;
						((GameInterfaceData) class293).anInt2238 = i_64_;
						if (!client.method111(class293)) {
							if ((((GameInterfaceData) class293).contentType ^ 0xffffffff) != -1)
								Class123.method2206(class293, (byte) 19);
							int i_65_ = ((GameInterfaceData) class293).anInt2347 - -i_51_;
							int i_66_ = i_58_ + ((GameInterfaceData) class293).anInt2299;
							int i_67_ = 0;
							int i_68_ = 0;
							if (za_Sub2.aBoolean6079) {
								i_67_ = Class189.method2642((byte) 42);
								i_68_ = Class335.method3765(false);
							}
							int i_69_ = ((GameInterfaceData) class293).anInt2285;
							if (Class15.aBoolean169 && (((IComponentSettings) client.getClickMask(class293)).optionMask != 0 || (((GameInterfaceData) class293).type ^ 0xffffffff) == -1) && i_69_ > 127)
								i_69_ = 127;
							if (Class255.draggedComponent == class293) {
								if ((i ^ 0xffffffff) != 1412584498 && (((Class36.anInt350 ^ 0xffffffff) == (((GameInterfaceData) class293).anInt2289 ^ 0xffffffff)) || ((Class369.anInt3129 ^ 0xffffffff) == (((GameInterfaceData) class293).anInt2289 ^ 0xffffffff)))) {
									Class65.aClass293Array500 = class293s;
									IncomingOpcode.anInt463 = i_51_;
									Class64_Sub5.anInt3654 = i_58_;
									continue;
								}
								if (Class15.aBoolean186 && Class239.aBoolean1840) {
									int i_70_ = (Class2.aClass299_73.method3514(67) - -i_67_);
									int i_71_ = (Class2.aClass299_73.method3507((byte) 116) + i_68_);
									i_71_ -= PlayerUpdateMask.anInt526;
									i_70_ -= ModelDefinitions.anInt1405;
									if ((i_70_ ^ 0xffffffff) > ((Class246_Sub3_Sub4_Sub2_Sub1.anInt6500) ^ 0xffffffff))
										i_70_ = (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500);
									if ((i_70_ - -((GameInterfaceData) class293).anInt2311) > (((GameInterfaceData) Class189.aClass293_1457).anInt2311 + (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500)))
										i_70_ = (-((GameInterfaceData) class293).anInt2311 + ((((GameInterfaceData) Class189.aClass293_1457).anInt2311) + (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500)));
									if (i_71_ < Class222.anInt1670)
										i_71_ = Class222.anInt1670;
									i_65_ = i_70_;
									if ((i_71_ - -((GameInterfaceData) class293).anInt2258) > (Class222.anInt1670 + (((GameInterfaceData) Class189.aClass293_1457).anInt2258)))
										i_71_ = (-((GameInterfaceData) class293).anInt2258 + ((((GameInterfaceData) Class189.aClass293_1457).anInt2258) + Class222.anInt1670));
									i_66_ = i_71_;
								}
								if ((((GameInterfaceData) class293).anInt2289 ^ 0xffffffff) == (Class369.anInt3129 ^ 0xffffffff))
									i_69_ = 128;
							}
							int i_72_;
							int i_73_;
							int i_74_;
							int i_75_;
							if ((((GameInterfaceData) class293).type ^ 0xffffffff) != -3) {
								int i_76_ = ((GameInterfaceData) class293).anInt2311 + i_65_;
								int i_77_ = i_66_ - -((GameInterfaceData) class293).anInt2258;
								i_72_ = i_66_ <= i_53_ ? i_53_ : i_66_;
								i_73_ = i_52_ >= i_65_ ? i_52_ : i_65_;
								if (((GameInterfaceData) class293).type == 9) {
									i_76_++;
									i_77_++;
								}
								i_75_ = ((i_55_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff) ? i_76_ : i_55_);
								i_74_ = i_56_ <= i_77_ ? i_56_ : i_77_;
							} else {
								i_72_ = i_53_;
								i_73_ = i_52_;
								i_74_ = i_56_;
								i_75_ = i_55_;
							}
							if ((i_75_ ^ 0xffffffff) < (i_73_ ^ 0xffffffff) && i_72_ < i_74_) {
								if ((((GameInterfaceData) class293).contentType ^ 0xffffffff) != -1) {
									if ((Class22.anInt218 == ((GameInterfaceData) class293).contentType) || ((((GameInterfaceData) class293).contentType ^ 0xffffffff) == (Class64_Sub20.anInt3698 ^ 0xffffffff))) {
										Class98_Sub1.method946(i_65_, -121, i_66_, class293);
										if (!za_Sub2.aBoolean6079) {
											Class92.method892(21337, i_65_, i_66_, (((GameInterfaceData) class293).anInt2258), (((((GameInterfaceData) class293).contentType) ^ 0xffffffff) == (Class64_Sub20.anInt3698 ^ 0xffffffff)), (((GameInterfaceData) class293).anInt2311));
											Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
										}
										aa_Sub3.aBooleanArray3574[i_64_] = true;
										continue;
									}
									if ((((GameInterfaceData) class293).contentType ^ 0xffffffff) == (Class325.anInt2727 ^ 0xffffffff)) {
										if (class293.method3469((Class265.aHa1974), 123) != null) {
											Class128.method2224(22696);
											Class201.method2696(4, class293, (Class265.aHa1974), i_65_, i_66_);
											Class98_Sub10_Sub20.aBooleanArray5639[i_64_] = true;
											Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
											if (za_Sub2.aBoolean6079) {
												if (!bool_57_)
													Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 126);
												else
													Class93_Sub1_Sub1.method908(i_63_, i_61_, false, i_60_, i_62_);
											}
										}
										continue;
									}
									if (Class96.anInt804 == ((GameInterfaceData) class293).contentType) {
										if (class293.method3469((Class265.aHa1974), 103) != null) {
											Class304.method3562(4096, i_65_, i_66_, class293);
											Class98_Sub10_Sub20.aBooleanArray5639[i_64_] = true;
											Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
											if (za_Sub2.aBoolean6079) {
												if (bool_57_)
													Class93_Sub1_Sub1.method908(i_63_, i_61_, !bool, i_60_, i_62_);
												else
													Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 113);
											}
										}
										continue;
									}
									if (((GameInterfaceData) class293).contentType == Class87.anInt673) {
										Class64_Sub29.method673(Class265.aHa1974, Class284_Sub2_Sub2.aD6203, i_66_, i_65_, ((GameInterfaceData) class293).anInt2258, (byte) 31, ((GameInterfaceData) class293).anInt2311);
										aa_Sub3.aBooleanArray3574[i_64_] = true;
										Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
										continue;
									}
									if (Class239.anInt1841 == ((GameInterfaceData) class293).contentType) {
										Class202.method2701(i_65_, ((GameInterfaceData) class293).anInt2311, Class265.aHa1974, i_66_, (byte) -90, ((GameInterfaceData) class293).anInt2258);
										aa_Sub3.aBooleanArray3574[i_64_] = true;
										Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
										continue;
									}
									if ((((GameInterfaceData) class293).contentType ^ 0xffffffff) == (RenderAnimDefinitions.anInt2371 ^ 0xffffffff)) {
										if (Class91.aBoolean725 || Class170.aBoolean1313) {
											int i_78_ = ((((GameInterfaceData) class293).anInt2311) + i_65_);
											int i_79_ = 15 + i_66_;
											if (za_Sub2.aBoolean6079) {
												if (bool_57_)
													Class93_Sub1_Sub1.method908(i_63_, i_61_, false, i_60_, i_62_);
												else
													Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 118);
											}
											if (Class91.aBoolean725) {
												int i_80_ = -256;
												if (Class338.anInt2842 < 20)
													i_80_ = -65536;
												Class195.aClass43_1499.method397(i_80_, 0, i_78_, -1, ("Fps:" + Class338.anInt2842), i_79_);
												i_79_ += 15;
												Runtime runtime = Runtime.getRuntime();
												int i_81_ = (int) (((runtime.totalMemory()) - (runtime.freeMemory())) / 1024L);
												int i_82_ = -256;
												if ((i_81_ ^ 0xffffffff) < -98305) {
													if (Class23.aBoolean220) {
														Class27.method294(true);
														for (int i_83_ = 0; ((i_83_ ^ 0xffffffff) > -11); i_83_++)
															System.gc();
														i_81_ = (int) (((runtime.totalMemory()) + -(runtime.freeMemory())) / 1024L);
														if ((i_81_ ^ 0xffffffff) < -65537)
															za_Sub2.method1684("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4, (byte) -109);
													}
													i_82_ = -65536;
												}
												Class195.aClass43_1499.method397(i_82_, 0, i_78_, -1, "Mem:" + i_81_ + "k", i_79_);
												i_79_ += 15;
												Class195.aClass43_1499.method397(-256, 0, i_78_, -1, ("In:" + Class118.anInt975 + "B/s Out:" + Class98_Sub12.anInt3879 + "B/s"), i_79_);
												i_79_ += 15;
												int i_84_ = (Class265.aHa1974.E() / 1024);
												Class195.aClass43_1499.method397((i_84_ <= 65536 ? -256 : -65536), 0, i_78_, -1, "Offheap:" + i_84_ + "k", i_79_);
												i_79_ += 15;
												int i_85_ = 0;
												int i_86_ = 0;
												int i_87_ = 0;
												for (int i_88_ = 0; ((i_88_ ^ 0xffffffff) > -38); i_88_++) {
													if ((Class100.aClass339_Sub1Array844[i_88_]) != null) {
														i_85_ += (Class100.aClass339_Sub1Array844[i_88_].method3800(0));
														i_86_ += (Class100.aClass339_Sub1Array844[i_88_].method3798(49));
														i_87_ += (Class100.aClass339_Sub1Array844[i_88_].method3791((byte) -125));
													}
												}
												int i_89_ = i_87_ * 100 / i_85_;
												int i_90_ = i_86_ * 10000 / i_85_;
												String string = ("Cache:" + (Class39.method349(0, 2, 48, (long) i_90_, true)) + "% (" + i_89_ + "%)");
												Class69_Sub2.aClass43_5336.method397(-256, 0, i_78_, -1, string, i_79_);
												i_79_ += 12;
											}
											if (Class113.anInt952 > 0)
												Class69_Sub2.aClass43_5336.method397(-256, 0, i_78_, -1, ("Particles: " + (Class98_Sub43_Sub3.anInt5924) + " / " + Class113.anInt952), i_79_);
											i_79_ += 12;
											if (Class170.aBoolean1313) {
												Class69_Sub2.aClass43_5336.method397(-256, 0, i_78_, -1, ("Polys: " + Class265.aHa1974.I() + " Models: " + Class265.aHa1974.M()), i_79_);
												i_79_ += 12;
												Class69_Sub2.aClass43_5336.method397(-256, 0, i_78_, -1, ("Ls: " + Class191.anInt1480 + " La: " + Class76_Sub5.anInt3748 + " NPC: " + Class181.anInt1432 + " Pl: " + (Class98_Sub10_Sub13.anInt5602)), i_79_);
												Class228.method2862(-92);
												i_79_ += 12;
											}
											aa_Sub3.aBooleanArray3574[i_64_] = true;
										}
										continue;
									}
								}
								if (((GameInterfaceData) class293).type == 0) {
									if ((((GameInterfaceData) class293).contentType == Class64_Sub21.anInt3704) && Class265.aHa1974.method1768())
										Class265.aHa1974.method1746(i_65_, i_66_, ((GameInterfaceData) class293).anInt2311, ((GameInterfaceData) class293).anInt2258);
									method1077(((GameInterfaceData) class293).anInt2248, true, -(((GameInterfaceData) class293).anInt2246) + i_65_, i_73_, i_72_, i_64_, class293s, i_75_, i_74_, bool_57_, i_66_ + -(((GameInterfaceData) class293).anInt2213));
									if ((((GameInterfaceData) class293).interfaceComponents) != null)
										method1077(((GameInterfaceData) class293).anInt2248, true, i_65_ - (((GameInterfaceData) class293).anInt2246), i_73_, i_72_, i_64_, (((GameInterfaceData) class293).interfaceComponents), i_75_, i_74_, bool_57_, i_66_ - (((GameInterfaceData) class293).anInt2213));
									GameInterface class98_sub18 = ((GameInterface) (Class116.aClass377_964.method3990((long) (((GameInterfaceData) class293).anInt2248), -1)));
									if (class98_sub18 != null)
										Class246_Sub3_Sub5_Sub2.method3093(i_74_, i_64_, i_72_, (((GameInterface) class98_sub18).interfaceID), i_66_, i_65_, i_75_, (byte) -9, i_73_);
									if (((Class64_Sub21.anInt3704 ^ 0xffffffff) == (((GameInterfaceData) class293).contentType ^ 0xffffffff)) && Class265.aHa1974.method1768())
										Class265.aHa1974.method1814();
									Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
								}
								if (Class232.aBooleanArray1741[i_64_] || ((Class167.anInt1282 ^ 0xffffffff) < -2)) {
									if (((GameInterfaceData) class293).type == 3) {
										if (i_69_ != 0) {
											if (!((GameInterfaceData) class293).aBoolean2263)
												Class265.aHa1974.method1779(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258), ((255 + -(0xff & i_69_) << 1189469208) | (0xffffff & (((GameInterfaceData) class293).anInt2236))), 1);
											else
												Class265.aHa1974.aa(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258), ((255 + -(0xff & i_69_) << -1750207592) | (0xffffff & (((GameInterfaceData) class293).anInt2236))), 1);
										} else if (((GameInterfaceData) class293).aBoolean2263)
											Class265.aHa1974.aa(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258), (((GameInterfaceData) class293).anInt2236), 0);
										else
											Class265.aHa1974.method1779(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258), (((GameInterfaceData) class293).anInt2236), 0);
										if (za_Sub2.aBoolean6079) {
											if (bool_57_)
												Class93_Sub1_Sub1.method908(i_63_, i_61_, false, i_60_, i_62_);
											else
												Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 91);
										}
									} else if (((GameInterfaceData) class293).type == 4) {
										Class43 class43 = class293.method3460(-69, (Class265.aHa1974));
										if (class43 == null) {
											if (Class93.aBoolean3503)
												Class341.method3812(1, class293);
										} else {
											int i_91_ = (((GameInterfaceData) class293).anInt2236);
											String string = (((GameInterfaceData) class293).aString2225);
											if (((GameInterfaceData) class293).anInt2302 != -1) {
												ItemDefinition class297 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs((((GameInterfaceData) class293).anInt2302)));
												string = (((ItemDefinition) class297).name);
												if (string == null)
													string = "null";
												if (((((ItemDefinition) class297).anInt2469) == 1 || ((((GameInterfaceData) class293).anInt2349) ^ 0xffffffff) != -2) && ((((GameInterfaceData) class293).anInt2349) ^ 0xffffffff) != 0)
													string = ("<col=ff9040>" + string + "</col> x" + (Class64_Sub29.method675((((GameInterfaceData) class293).anInt2349), 16474)));
											}
											if (((GameInterfaceData) class293).anInt2211 != -1) {
												string = (Class48.method454((((GameInterfaceData) class293).anInt2211), bool));
												if (string == null)
													string = "";
											}
											if (OutputStream_Sub1.aClass293_33 == class293) {
												string = (TextResources.PLEASE_WAIT.get_text(Class374.anInt3159));
												i_91_ = (((GameInterfaceData) class293).anInt2236);
											}
											if (Class153.aBoolean1230)
												Class265.aHa1974.T(i_65_, i_66_, (i_65_ + (((GameInterfaceData) class293).anInt2311)), (i_66_ + (((GameInterfaceData) class293).anInt2258)));
											class43.method405(i_65_, (((GameInterfaceData) class293).anInt2350), (((GameInterfaceData) class293).anInt2258), null, 0, (((GameInterfaceData) class293).anInt2311), ((((GameInterfaceData) class293).aBoolean2315) ? (-(0xff & i_69_) + 255 << 1735414296) : -1), (((GameInterfaceData) class293).anInt2244), (((GameInterfaceData) class293).anInt2296), i_66_, (byte) -80, (Class64_Sub18.aClass332Array3689), (-(i_69_ & 0xff) + 255 << 1099433400) | i_91_, 0, string, (((GameInterfaceData) class293).anInt2341), null);
											if (Class153.aBoolean1230)
												Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
											if ((string.trim().length() ^ 0xffffffff) < -1) {
												if (Class153.aBoolean1230) {
													if (za_Sub2.aBoolean6079) {
														if (bool_57_)
															Class93_Sub1_Sub1.method908(i_63_, i_61_, false, i_60_, i_62_);
														else
															Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 114);
													}
												} else {
													Class197 class197 = (Class98_Sub46_Sub6.method1550((((GameInterfaceData) class293).anInt2264), 18361, Class265.aHa1974));
													int i_92_ = (class197.method2670((((GameInterfaceData) class293).anInt2311), string, (Class64_Sub18.aClass332Array3689), (byte) 79));
													int i_93_ = (class197.method2672((Class64_Sub18.aClass332Array3689), (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2244), string, true));
													if (za_Sub2.aBoolean6079) {
														if (bool_57_)
															Class93_Sub1_Sub1.method908(i_66_ + i_93_, i_66_, false, i_65_, (i_92_ + i_65_));
														else
															Class216.method2796(i_93_ + i_66_, i_65_, i_92_ + i_65_, i_66_, (byte) -62);
													}
												}
											}
										}
									} else if ((((GameInterfaceData) class293).type ^ 0xffffffff) == -6) {
										if (((GameInterfaceData) class293).anInt2267 >= 0)
											class293.method3467(0, Class101.aClass115_857, Class373_Sub2.aClass59_5470).method3831(0, (((GameInterfaceData) class293).anInt2216) << 1037126371, (((GameInterfaceData) class293).anInt2261) << 765115811, i_66_, -24446, i_65_, Class265.aHa1974, (((GameInterfaceData) class293).anInt2258), (((GameInterfaceData) class293).anInt2311), 0);
										else {
											Class332 class332;
											if (((((GameInterfaceData) class293).anInt2302) ^ 0xffffffff) != 0) {
												PlayerAppearance class313 = ((((GameInterfaceData) class293).aBoolean2262) ? (((Player) (Player.selfPlayer)).appearance) : null);
												class332 = (Class98_Sub46_Sub19.getItemDefs.method2710((((GameInterfaceData) class293).anInt2304), (((GameInterfaceData) class293).anInt2302), Class265.aHa1974, class313, (((GameInterfaceData) class293).anInt2349), (((GameInterfaceData) class293).anInt2305), (~0xffffff | (((GameInterfaceData) class293).anInt2355)), 24056));
											} else if (((((GameInterfaceData) class293).anInt2211) ^ 0xffffffff) != 0)
												class332 = (Class200.method2693((((GameInterfaceData) class293).anInt2211), (byte) -114, Class265.aHa1974));
											else
												class332 = (class293.method3456(Class265.aHa1974, -1234042329));
											if (class332 != null) {
												int i_94_ = class332.method3737();
												int i_95_ = class332.method3749();
												int i_96_ = ((((((GameInterfaceData) class293).anInt2236) ^ 0xffffffff) == -1 ? 16777215 : (((GameInterfaceData) class293).anInt2236 & 0xffffff)) | (255 - (i_69_ & 0xff) << 638192120));
												if (((GameInterfaceData) class293).aBoolean2288) {
													Class265.aHa1974.T(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311) + i_65_, i_66_ + (((GameInterfaceData) class293).anInt2258));
													if ((((GameInterfaceData) class293).anInt2255) != 0) {
														int i_97_ = ((i_94_ + (-1 + (((GameInterfaceData) class293).anInt2311))) / i_94_);
														int i_98_ = ((i_95_ - 1 + (((GameInterfaceData) class293).anInt2258)) / i_95_);
														for (int i_99_ = 0; ((i_99_ ^ 0xffffffff) > (i_97_ ^ 0xffffffff)); i_99_++) {
															for (int i_100_ = 0; ((i_98_ ^ 0xffffffff) < (i_100_ ^ 0xffffffff)); i_100_++) {
																if ((((GameInterfaceData) class293).anInt2236) == 0)
																	class332.method3730(((float) (i_99_ * i_94_ + i_65_) + ((float) i_94_ / 2.0F)), ((float) (i_95_ * i_100_ + i_66_) + ((float) i_95_ / 2.0F)), 4096, (((GameInterfaceData) class293).anInt2255));
																else
																	class332.method3743(((float) (i_65_ - -(i_99_ * i_94_)) + ((float) i_94_ / 2.0F)), ((float) (i_66_ + i_100_ * i_95_) + ((float) i_95_ / 2.0F)), 4096, (((GameInterfaceData) class293).anInt2255), 0, i_96_, 1);
															}
														}
													} else if (((((GameInterfaceData) class293).anInt2236) != 0) || i_69_ != 0)
														class332.method3728(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258), 0, i_96_, 1);
													else
														class332.method3738(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258));
													Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
												} else if ((((GameInterfaceData) class293).anInt2236) == 0 && i_69_ == 0) {
													if (((((GameInterfaceData) class293).anInt2255) ^ 0xffffffff) != -1)
														class332.method3730(((float) i_65_ + ((float) (((GameInterfaceData) class293).anInt2311) / 2.0F)), ((float) i_66_ + ((float) (((GameInterfaceData) class293).anInt2258) / 2.0F)), ((((GameInterfaceData) class293).anInt2311) * 4096 / i_94_), (((GameInterfaceData) class293).anInt2255));
													else if (((i_94_ ^ 0xffffffff) != ((((GameInterfaceData) class293).anInt2311) ^ 0xffffffff)) || (((((GameInterfaceData) class293).anInt2258) ^ 0xffffffff) != (i_95_ ^ 0xffffffff)))
														class332.method3726(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258));
													else
														class332.method3735(i_65_, i_66_);
												} else if (((GameInterfaceData) class293).anInt2255 == 0) {
													if (((((GameInterfaceData) class293).anInt2311 ^ 0xffffffff) == (i_94_ ^ 0xffffffff)) && ((((GameInterfaceData) class293).anInt2258) == i_95_))
														class332.method3748(i_65_, i_66_, 0, i_96_, 1);
													else
														class332.method3727(i_65_, i_66_, (((GameInterfaceData) class293).anInt2311), (((GameInterfaceData) class293).anInt2258), 0, i_96_, 1);
												} else
													class332.method3743((((float) (((GameInterfaceData) class293).anInt2311) / 2.0F) + (float) i_65_), ((float) i_66_ + ((float) (((GameInterfaceData) class293).anInt2258) / 2.0F)), (4096 * (((GameInterfaceData) class293).anInt2311) / i_94_), (((GameInterfaceData) class293).anInt2255), 0, i_96_, 1);
											} else if (Class93.aBoolean3503)
												Class341.method3812(1, class293);
										}
										if (za_Sub2.aBoolean6079) {
											if (!bool_57_)
												Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 102);
											else
												Class93_Sub1_Sub1.method908(i_63_, i_61_, false, i_60_, i_62_);
										}
									} else if (((GameInterfaceData) class293).type == 6) {
										Class98_Sub35.method1452(0);
										Class40 class40 = null;
										AbstractModel class146 = null;
										int i_101_ = 0;
										if ((((GameInterfaceData) class293).anInt2302 ^ 0xffffffff) != 0) {
											ItemDefinition class297 = (Class98_Sub46_Sub19.getItemDefs.getItemDefs((((GameInterfaceData) class293).anInt2302)));
											if (class297 != null) {
												class297 = (class297.method3493((byte) -45, (((GameInterfaceData) class293).anInt2349)));
												Class97 class97 = ((((GameInterfaceData) class293).anInt2208) == -1 ? null : (Class151_Sub7.aClass183_5001.method2623((((GameInterfaceData) class293).anInt2208), 16383)));
												PlayerAppearance class313 = ((((GameInterfaceData) class293).aBoolean2262) ? (((Player) (Player.selfPlayer)).appearance) : null);
												class146 = (class297.method3501((((GameInterfaceData) class293).anInt2312), 2048, (((GameInterfaceData) class293).anInt2303), class97, (((GameInterfaceData) class293).anInt2287), Class265.aHa1974, 1, 128, class313));
												if (class146 == null)
													Class341.method3812(1, class293);
												else
													i_101_ = (-class146.fa() >> -1224511199);
											}
										} else if ((((GameInterfaceData) class293).anInt2233) != 5) {
											if (((((GameInterfaceData) class293).anInt2233) ^ 0xffffffff) == -9 || (((GameInterfaceData) class293).anInt2233) == 9) {
												Class98_Sub3 class98_sub3 = (Class64_Sub28.method669((((GameInterfaceData) class293).anInt2343), false, 6));
												Class97 class97 = (((((GameInterfaceData) class293).anInt2208) ^ 0xffffffff) == 0 ? null : (Class151_Sub7.aClass183_5001.method2623((((GameInterfaceData) class293).anInt2208), 16383)));
												if (class98_sub3 != null) {
													PlayerAppearance class313 = (!(((GameInterfaceData) class293).aBoolean2262) ? null : (((Player) (Player.selfPlayer)).appearance));
													class146 = (class98_sub3.method951(class97, (((GameInterfaceData) class293).anInt2312), (((GameInterfaceData) class293).anInt2303), (((GameInterfaceData) class293).anInt2233) == 9, class313, (((GameInterfaceData) class293).anInt2210), 2048, (((GameInterfaceData) class293).anInt2287), (byte) -80, Class265.aHa1974));
												}
											} else if (((((GameInterfaceData) class293).anInt2208) ^ 0xffffffff) == 0) {
												class146 = (class293.method3461(Class75.aClass140_584, (Class151_Sub7.aClass183_5001), Class4.aClass301_85, ParamType.aClass83_1205, Class265.aHa1974, (Class370.aClass257_3136), class40, (byte) -40, -1, 2048, -1, 0, null, (((Player) (Player.selfPlayer)).appearance), (Class98_Sub46_Sub19.getItemDefs)));
												if (class146 == null && Class93.aBoolean3503)
													Class341.method3812(1, class293);
											} else {
												Class97 class97 = (Class151_Sub7.aClass183_5001.method2623((((GameInterfaceData) class293).anInt2208), 16383));
												class146 = (class293.method3461(Class75.aClass140_584, (Class151_Sub7.aClass183_5001), Class4.aClass301_85, ParamType.aClass83_1205, Class265.aHa1974, (Class370.aClass257_3136), class40, (byte) -57, (((GameInterfaceData) class293).anInt2287), 2048, (((GameInterfaceData) class293).anInt2303), (((GameInterfaceData) class293).anInt2312), class97, (((Player) (Player.selfPlayer)).appearance), (Class98_Sub46_Sub19.getItemDefs)));
												if (class146 == null && Class93.aBoolean3503)
													Class341.method3812(1, class293);
											}
										} else {
											int i_102_ = (((GameInterfaceData) class293).anInt2343);
											if ((i_102_ ^ 0xffffffff) <= -1 && ((i_102_ ^ 0xffffffff) > -2049)) {
												Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_102_]);
												Class97 class97 = ((((GameInterfaceData) class293).anInt2208) != -1 ? (Class151_Sub7.aClass183_5001.method2623((((GameInterfaceData) class293).anInt2208), 16383)) : null);
												if ((class246_sub3_sub4_sub2_sub2 != null) && ((za_Sub2.anInt6080 == i_102_) || ((Class98_Sub32.method1438((((Player) class246_sub3_sub4_sub2_sub2).displayName), 6243)) == (((GameInterfaceData) class293).anInt2210))))
													class146 = (((Player) class246_sub3_sub4_sub2_sub2).appearance.method3628((Class370.aClass257_3136), class97, null, (Class151_Sub7.aClass183_5001), (((GameInterfaceData) class293).anInt2303), (ParamType.aClass83_1205), null, (Class98_Sub46_Sub19.getItemDefs), true, 0, null, (Class4.aClass301_85), (Class75.aClass140_584), true, 2048, -1, (((GameInterfaceData) class293).anInt2312), (((GameInterfaceData) class293).anInt2287), 0, 0, Class265.aHa1974));
											}
										}
										if (class146 != null) {
											int i_103_;
											if (((GameInterfaceData) class293).anInt2232 > 0)
												i_103_ = (((((GameInterfaceData) class293).anInt2311) << -1492214583) / (((GameInterfaceData) class293).anInt2232));
											else
												i_103_ = 512;
											int i_104_;
											if (((GameInterfaceData) class293).anInt2226 > 0)
												i_104_ = (((((GameInterfaceData) class293).anInt2258) << -44986999) / (((GameInterfaceData) class293).anInt2226));
											else
												i_104_ = 512;
											int i_105_ = ((((GameInterfaceData) class293).anInt2311) / 2 + i_65_);
											int i_106_ = (i_66_ + (((GameInterfaceData) class293).anInt2258) / 2);
											if (!((GameInterfaceData) class293).aBoolean2280) {
												i_105_ += ((((GameInterfaceData) class293).anInt2336) * i_103_ >> -1439009655);
												i_106_ += (i_104_ * (((GameInterfaceData) class293).anInt2344) >> -285380663);
											}
											Class266.aClass111_1986.method2091();
											Class265.aHa1974.a(Class266.aClass111_1986);
											Class265.aHa1974.DA(i_105_, i_106_, i_103_, i_104_);
											Class265.aHa1974.ya();
											if (((GameInterfaceData) class293).aBoolean2325)
												Class265.aHa1974.C(false);
											if (!((GameInterfaceData) class293).aBoolean2280) {
												int i_107_ = ((((((GameInterfaceData) class293).anInt2251) << -1783646334) * (Class284_Sub2_Sub2.anIntArray6200[((((GameInterfaceData) class293).anInt2310) << -1188499165)])) >> -1207674034);
												int i_108_ = (((Class284_Sub2_Sub2.anIntArray6202[(((GameInterfaceData) class293).anInt2310 << -223590269)]) * (((GameInterfaceData) class293).anInt2251 << -423051582)) >> -1224356338);
												Class76_Sub5.aClass111_3745.method2104(-(((GameInterfaceData) class293).anInt2346) << -1988380221);
												Class76_Sub5.aClass111_3745.method2097((((GameInterfaceData) class293).anInt2218) << 1880483235);
												Class76_Sub5.aClass111_3745.method2106(((((GameInterfaceData) class293).anInt2268) << 1838805666), (i_101_ + (i_107_ - -((((GameInterfaceData) class293).anInt2273) << -1320988254))), ((((GameInterfaceData) class293).anInt2273) << -290939422) + i_108_);
												Class76_Sub5.aClass111_3745.method2105((((GameInterfaceData) class293).anInt2310) << -1796566077);
											} else {
												Class76_Sub5.aClass111_3745.method2107(((GameInterfaceData) class293).anInt2310);
												Class76_Sub5.aClass111_3745.method2097(((GameInterfaceData) class293).anInt2218);
												Class76_Sub5.aClass111_3745.method2090(((GameInterfaceData) class293).anInt2346);
												Class76_Sub5.aClass111_3745.method2106((((GameInterfaceData) class293).anInt2336), (((GameInterfaceData) class293).anInt2344), (((GameInterfaceData) class293).anInt2352));
											}
											class293.method3464(true, Class265.aHa1974, Class215.anInt1614, class146, Class76_Sub5.aClass111_3745);
											if (Class153.aBoolean1230)
												Class265.aHa1974.T(i_65_, i_66_, (i_65_ - -(((GameInterfaceData) class293).anInt2311)), (((GameInterfaceData) class293).anInt2258) + i_66_);
											if (!((GameInterfaceData) class293).aBoolean2280) {
												if (!((GameInterfaceData) class293).aBoolean2265) {
													class146.method2325((Class76_Sub5.aClass111_3745), null, 1);
													if ((((GameInterfaceData) class293).aClass246_Sub5_2301) != null)
														Class265.aHa1974.method1820(((GameInterfaceData) class293).aClass246_Sub5_2301.method3115());
												} else
													class146.method2329((Class76_Sub5.aClass111_3745), null, (((GameInterfaceData) class293).anInt2251 << 1326541250), 1);
											} else if (((GameInterfaceData) class293).aBoolean2265)
												class146.method2329((Class76_Sub5.aClass111_3745), null, (((GameInterfaceData) class293).anInt2251), 1);
											else {
												class146.method2325((Class76_Sub5.aClass111_3745), null, 1);
												if ((((GameInterfaceData) class293).aClass246_Sub5_2301) != null)
													Class265.aHa1974.method1820(((GameInterfaceData) class293).aClass246_Sub5_2301.method3115());
											}
											if (Class153.aBoolean1230)
												Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
											if (((GameInterfaceData) class293).aBoolean2325)
												Class265.aHa1974.C(true);
										}
										if (za_Sub2.aBoolean6079) {
											if (bool_57_)
												Class93_Sub1_Sub1.method908(i_63_, i_61_, false, i_60_, i_62_);
											else
												Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 95);
										}
									} else if ((((GameInterfaceData) class293).type ^ 0xffffffff) == -10) {
										int i_109_;
										int i_110_;
										int i_111_;
										int i_112_;
										if (((GameInterfaceData) class293).aBoolean2256) {
											i_112_ = i_66_;
											i_110_ = i_65_ + ((GameInterfaceData) class293).anInt2311;
											i_111_ = i_65_;
											i_109_ = (i_66_ - -(((GameInterfaceData) class293).anInt2258));
										} else {
											i_109_ = i_66_;
											i_110_ = (((GameInterfaceData) class293).anInt2311) + i_65_;
											i_111_ = i_65_;
											i_112_ = (((GameInterfaceData) class293).anInt2258) + i_66_;
										}
										if (((GameInterfaceData) class293).anInt2293 == 1)
											Class265.aHa1974.method1795(i_111_, i_109_, i_110_, i_112_, (((GameInterfaceData) class293).anInt2236), 0);
										else
											Class265.aHa1974.method1816(i_111_, i_109_, i_110_, i_112_, (((GameInterfaceData) class293).anInt2236), (((GameInterfaceData) class293).anInt2293), 0);
										if (za_Sub2.aBoolean6079) {
											if (!bool_57_)
												Class216.method2796(i_63_, i_60_, i_62_, i_61_, (byte) 102);
											else
												Class93_Sub1_Sub1.method908(i_63_, i_61_, false, i_60_, i_62_);
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("od.B(" + i + ',' + bool + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + (class293s != null ? "{...}" : "null") + ',' + i_55_ + ',' + i_56_ + ',' + bool_57_ + ',' + i_58_ + ')'));
		}
	}

	public static void method1078(byte i) {
		try {
			aShortArray5674 = null;
			aShortArrayArray5669 = null;
			aShortArray5667 = null;
			aClass207_5668 = null;
			aShortArray5670 = null;
			int i_113_ = 39 / ((i - -53) / 62);
			aShortArray5673 = null;
			aClass101Array5666 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.D(" + i + ')');
		}
	}

	static {
		aClass101Array5666 = new Class101[6];
		aShortArray5673 = new short[] { 962, 20423, -21582, 11214, -10295 };
		aShortArray5674 = new short[] { 952, 20413, -21592, 11204, -10305 };
		aShortArrayArray5669 = new short[][] { aShortArray5667, aShortArray5673, aShortArray5670, aShortArray5674 };
	}
}
