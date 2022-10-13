/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class185 {
	short[] aShortArray1444;
	static Class246_Sub4_Sub2_Sub1[] aClass246_Sub4_Sub2_Sub1Array1445;
	int[] anIntArray1446;
	short[] aShortArray1447;
	long aLong1448;

	static final Class98_Sub46_Sub17 setCS2StringOrVarc(int varcIndex, int i_0_, int i_1_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = ((Class98_Sub46_Sub17) Class76_Sub4.aClass377_3738.method3990((long) i_1_ << 32 | (long) varcIndex, -1));
			if (i_0_ >= -17)
				aClass246_Sub4_Sub2_Sub1Array1445 = null;
			if (class98_sub46_sub17 == null) {
				class98_sub46_sub17 = new Class98_Sub46_Sub17(i_1_, varcIndex);
				Class76_Sub4.aClass377_3738.method3996(class98_sub46_sub17, (class98_sub46_sub17.uid), -1);
			}
			return class98_sub46_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mg.B(" + varcIndex + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2629(byte i) {
		try {
			if (Class98_Sub10_Sub6.anInt5569 > 1) {
				Class98_Sub36.anInt4161 = Class24.anInt242;
				Class98_Sub10_Sub6.anInt5569--;
			}
			if (Class76_Sub9.aBoolean3788) {
				Class76_Sub9.aBoolean3788 = false;
				Canvas_Sub1.method118((byte) 104);
			} else {
				if (!Player.aBoolean6540)
					Class46.method435((byte) 85);
				for (int i_2_ = 0; i_2_ < 100; i_2_++) {
					if (!Class98_Sub10_Sub24.method1076(i + -58))
						break;
				}
				if (Class177.anInt1376 == 10) {
					while (Class92.method893(118)) {
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i + 313, (Class98_Sub10_Sub7.aClass171_5571), (Class331.aClass117_2811));
						class98_sub11.packet.writeByte(0);
						int i_3_ = (class98_sub11.packet.position);
						Class361.method3919((byte) -61, (class98_sub11.packet));
						class98_sub11.packet.method1211((byte) 91, -i_3_ + class98_sub11.packet.position);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (Class284.aClass98_Sub4_2167 != null) {
						if ((Class284.aClass98_Sub4_2167.anInt3827) != -1) {
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class98_Sub10_Sub22.aClass171_5652, Class331.aClass117_2811));
							class98_sub11.packet.writeShort((Class284.aClass98_Sub4_2167.anInt3827));
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class284.aClass98_Sub4_2167 = null;
							Class11.aLong121 = 30000L + Class343.method3819(-47);
						}
					} else if (Class11.aLong121 <= Class343.method3819(i ^ 0x1a))
						Class284.aClass98_Sub4_2167 = (Class48_Sub2_Sub1.aClass265_5531.method3229(i ^ ~0xb, Class98_Sub46_Sub10.aClass354_6011.aString3016));
					Class98_Sub17 class98_sub17 = ((Class98_Sub17) Class167.aClass148_1284.method2418(32));
					if (class98_sub17 != null || (-2000L + Class343.method3819(-47) > Class113.aLong954)) {
						//mysticflow
						//						Class98_Sub11 class98_sub11 = null;
						//						int i_4_ = 0;
						//						for (Class98_Sub17 class98_sub17_5_ = (Class98_Sub17) Class64_Sub21.aClass148_3703
						//								.method2418(32); class98_sub17_5_ != null; class98_sub17_5_ = (Class98_Sub17) Class64_Sub21.aClass148_3703
						//								.method2417(107)) {
						//							if (class98_sub11 != null
						//									&& ((((Class98_Sub22) (((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865)).anInt3991 - i_4_) ^ 0xffffffff) <= -241)
						//								break;
						//							class98_sub17_5_.method942(126);
						//							int i_6_ = class98_sub17_5_.method1151(48);
						//							if (i_6_ < -1)
						//								i_6_ = -1;
						//							else if (i_6_ > 65534)
						//								i_6_ = 65534;
						//							int i_7_ = class98_sub17_5_.method1155(123);
						//							if ((i_7_ ^ 0xffffffff) > 0)
						//								i_7_ = -1;
						//							else if (i_7_ > 65534)
						//								i_7_ = 65534;
						//							if (i_7_ != Class118.anInt980
						//									|| ((Class115.anInt960 ^ 0xffffffff) != (i_6_ ^ 0xffffffff))) {
						//								if (class98_sub11 == null) {
						//									class98_sub11 = (Class246_Sub3_Sub4
						//											.method3023(260,
						//													Class341.aClass171_2853,
						//													Class331.aClass117_2811));
						//									((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//											.method1194(0, i ^ 0x4f);
						//									i_4_ = (((Class98_Sub22) (((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865)).anInt3991);
						//								}
						//								int i_8_ = -Class118.anInt980 + i_7_;
						//								Class118.anInt980 = i_7_;
						//								int i_9_ = -Class115.anInt960 + i_6_;
						//								Class115.anInt960 = i_6_;
						//								int i_10_ = (int) ((class98_sub17_5_
						//										.method1154(true) - Class113.aLong954) / 20L);
						//								if (i_10_ >= 8 || i_8_ < -32
						//										|| (i_8_ ^ 0xffffffff) < -32
						//										|| (i_9_ ^ 0xffffffff) > 31
						//										|| (i_9_ ^ 0xffffffff) < -32) {
						//									if ((i_10_ ^ 0xffffffff) <= -33
						//											|| (i_8_ ^ 0xffffffff) > 127
						//											|| (i_8_ ^ 0xffffffff) < -128
						//											|| i_9_ < -128 || i_9_ > 127) {
						//										if (i_10_ >= 32) {
						//											((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//													.writeShort(i_10_ + 57344,
						//															1571862888);
						//											if (i_7_ == 1 || i_6_ == -1)
						//												((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//														.writeInt(1571862888,
						//																-2147483648);
						//											else
						//												((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//														.writeInt(
						//																1571862888,
						//																(i_7_ | i_6_ << 1539798800));
						//										} else {
						//											((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//													.method1194(192 + i_10_, 85);
						//											if ((i_7_ ^ 0xffffffff) == -2
						//													|| i_6_ == -1)
						//												((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//														.writeInt(1571862888,
						//																-2147483648);
						//											else
						//												((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//														.writeInt(
						//																i ^ ~0x5db0b95c,
						//																(i_7_ | i_6_ << -422182576));
						//										}
						//									} else {
						//										i_8_ += 128;
						//										((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//												.method1194(128 + i_10_, -98);
						//										i_9_ += 128;
						//										((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//												.writeShort(i_9_
						//														+ (i_8_ << 1431182856),
						//														1571862888);
						//									}
						//								} else {
						//									i_8_ += 32;
						//									i_9_ += 32;
						//									((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//											.writeShort(
						//													(i_9_
						//															+ (i_10_ << 1379774828) - -(i_8_ << -540290298)),
						//													1571862888);
						//								}
						//								Class113.aLong954 = class98_sub17_5_
						//										.method1154(true);
						//							}
						//						}
						//						if (class98_sub11 != null) {
						//							((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
						//									.method1211(
						//											(byte) 123,
						//											-i_4_
						//													+ (((Class98_Sub22) (((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865)).anInt3991));
						//							Class98_Sub10_Sub29
						//									.sendPacket(false, class98_sub11);
						//						}
					}
					if (class98_sub17 != null) {
						long l = ((class98_sub17.method1154(true) - Class98_Sub36.aLong4159) / 50L);
						Class98_Sub36.aLong4159 = class98_sub17.method1154(true);
						if (l > 32767L)
							l = 32767L;
						int i_11_ = class98_sub17.method1151(89);
						if (i_11_ < 0)
							i_11_ = 0;
						else if (i_11_ > 65535)
							i_11_ = 65535;
						int i_12_ = class98_sub17.method1155(122);
						if (i_12_ >= 0) {
							if (i_12_ > 65535)
								i_12_ = 65535;
						} else
							i_12_ = 0;
						int i_13_ = 0;
						if (class98_sub17.method1156(-5) == 2)
							i_13_ = 1;
						int i_14_ = (int) l;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class287_Sub2.aClass171_3270), (Class331.aClass117_2811));
						class98_sub11.packet.writeShort(i_13_ << 15 | i_14_);
						class98_sub11.packet.writeInt(i + 1571862941, i_12_ | i_11_ << 16);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (Class98_Sub46_Sub1.anInt5949 > 0) {
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class98_Sub32.aClass171_4106), (Class331.aClass117_2811));
						class98_sub11.packet.writeByte(3 * Class98_Sub46_Sub1.anInt5949);
						for (int i_15_ = 0; (i_15_ < Class98_Sub46_Sub1.anInt5949); i_15_++) {
							Interface7 interface7 = Class339.anInterface7Array2845[i_15_];
							long l = ((interface7.method18(-121) - Class292.aLong3356) / 50L);
							Class292.aLong3356 = interface7.method18(-84);
							if (l > 65535)
								l = 65535L;
							class98_sub11.packet.writeByte(interface7.method17(true));
							class98_sub11.packet.writeShort((int) l);
						}
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (Class42_Sub1_Sub1.anInt6210 > 0)
						Class42_Sub1_Sub1.anInt6210--;
					if (Class64_Sub6.aBoolean3656 && Class42_Sub1_Sub1.anInt6210 <= 0) {
						Class64_Sub6.aBoolean3656 = false;
						Class42_Sub1_Sub1.anInt6210 = 20;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i + 313, (Class246_Sub7.aClass171_5115), (Class331.aClass117_2811));
						class98_sub11.packet.writeLEShort((int) GameWorld.cameraGetVrot >> 3, 17624);
						class98_sub11.packet.writeShort((int) GameWorld.cameraGetHrot >> 3);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (Class4.aBoolean84 == !Class101.aBoolean856) {
						Class101.aBoolean856 = Class4.aBoolean84;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class230.aClass171_1727), (Class331.aClass117_2811));
						class98_sub11.packet.writeByte(!Class4.aBoolean84 ? 0 : 1);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (!s_Sub1.aBoolean5207) {
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i + 313, (Class246_Sub1.aClass171_5068), (Class331.aClass117_2811));
						class98_sub11.packet.writeByte(0);
						int i_16_ = (class98_sub11.packet.position);
						RSByteBuffer class98_sub22 = Class98_Sub9.aClass98_Sub27_3856.method1288(true);
						class98_sub11.packet.method1217(class98_sub22.data, class98_sub22.position, -1, 0);
						class98_sub11.packet.method1211((byte) 107, (class98_sub11.packet.position) - i_16_);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						s_Sub1.aBoolean5207 = true;
					}
					if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null) {
						if (Class98_Sub46_Sub20_Sub2.anInt6319 == 2)
							Class98_Sub46_Sub3.method1541(73);
						else if (Class98_Sub46_Sub20_Sub2.anInt6319 == 3)
							Class183.method2620(0);
					}
					if (Class4.aBoolean79)
						Class4.aBoolean79 = false;
					else
						Class180.aFloat3405 /= 2.0F;
					if (i != -53)
						aClass246_Sub4_Sub2_Sub1Array1445 = null;
					if (PacketSender.aBoolean2575)
						PacketSender.aBoolean2575 = false;
					else
						MapRegion.aFloat2545 /= 2.0F;
					Class141.method2294(0);
					if (Class177.anInt1376 == 10) {
						Class329.method3708(-1);
						Class269.method3273(true);
						Class246_Sub3_Sub2.method3003(i ^ 0x54bc);
						Class224_Sub1.anInt5031++;
						if (Class224_Sub1.anInt5031 > 750)
							Canvas_Sub1.method118((byte) 104);
						else {
							Class50.method485(37);
							Class216.method2794((byte) -85);
							Class76_Sub10.method770(-256);
							for (int i_17_ = Class75.aClass140_584.method2290(-115, true); i_17_ != -1; i_17_ = Class75.aClass140_584.method2290(-87, false)) {
								Class349.method3838(i_17_, 1864);
								Class111_Sub1.anIntArray4682[Class202.method2702(31, Class239.anInt1844++)] = i_17_;
							}
							for (Class98_Sub46_Sub17 class98_sub46_sub17 = Class98_Sub31_Sub4.method1384(i ^ 0x4b); class98_sub46_sub17 != null; class98_sub46_sub17 = Class98_Sub31_Sub4.method1384(-46)) {
								int i_18_ = class98_sub46_sub17.method1625((byte) -108);
								int i_19_ = class98_sub46_sub17.method1623(-101);
								if (i_18_ == 1) {
									Class76_Sub5.anIntArray3744[i_19_] = class98_sub46_sub17.anInt6054;
									Class66.aBoolean507 |= VarpClass.aBooleanArray3246[i_19_];
									Class98_Sub45.anIntArray4257[Class202.method2702(Class246_Sub4_Sub2.anInt6181++, 31)] = i_19_;
								} else if (i_18_ != 2) {
									if (i_18_ != 3) {
										if (i_18_ == 4) {
											GameInterfaceData class293 = Class159.method2509(i_19_, -9820);
											int i_20_ = (class98_sub46_sub17.anInt6054);
											int i_21_ = (class98_sub46_sub17.anInt6051);
											int i_22_ = (class98_sub46_sub17.anInt6053);
											if ((class293.anInt2233) != i_20_ || ((class293.anInt2343) != i_21_) || (i_22_ != (class293.anInt2210))) {
												class293.anInt2233 = i_20_;
												class293.anInt2343 = i_21_;
												class293.anInt2210 = i_22_;
												Class341.method3812(1, class293);
											}
										} else if (i_18_ != 5) {
											if (i_18_ != 6) {
												if (i_18_ != 7) {
													if (i_18_ == 8) {
														GameInterfaceData class293 = (Class159.method2509(i_19_, i + -9767));
														if (((class98_sub46_sub17.anInt6054) != (class293.anInt2310)) || ((class98_sub46_sub17.anInt6051) != (class293.anInt2218)) || ((class98_sub46_sub17.anInt6053) != (class293.anInt2251))) {
															class293.anInt2310 = (class98_sub46_sub17.anInt6054);
															class293.anInt2251 = (class98_sub46_sub17.anInt6053);
															class293.anInt2218 = (class98_sub46_sub17.anInt6051);
															if ((class293.anInt2302) != -1) {
																if ((class293.anInt2232) <= 0) {
																	if ((class293.anInt2235) > 0)
																		class293.anInt2251 = 32 * class293.anInt2251 / class293.anInt2235;
																} else
																	class293.anInt2251 = (32 * class293.anInt2251 / class293.anInt2232);
															}
															Class341.method3812(1, class293);
														}
													} else if (i_18_ != 9) {
														if (i_18_ != 10) {
															if (i_18_ == 11) {
																GameInterfaceData class293 = (Class159.method2509(i_19_, -9820));
																class293.aByte2245 = (byte) 0;
																class293.aByte2240 = (byte) 0;
																class293.anInt2347 = class293.anInt2283 = (class98_sub46_sub17.anInt6054);
																class293.anInt2299 = class293.anInt2229 = (class98_sub46_sub17.anInt6051);
																Class341.method3812(1, class293);
															} else if (i_18_ != 12) {
																if (i_18_ == 14) {
																	GameInterfaceData class293 = (Class159.method2509(i_19_, i ^ 0x266f));
																	class293.anInt2237 = (class98_sub46_sub17.anInt6054);
																} else if (i_18_ != 15) {
																	if (i_18_ != 16) {
																		if (i_18_ == 17) {
																			GameInterfaceData class293 = Class159.method2509(i_19_, -9820);
																			class293.anInt2211 = class98_sub46_sub17.anInt6054;
																		}
																	} else {
																		GameInterfaceData class293 = Class159.method2509(i_19_, -9820);
																		class293.anInt2264 = class98_sub46_sub17.anInt6054;
																	}
																} else {
																	Class269.anInt2024 = (class98_sub46_sub17.anInt6054);
																	Class246_Sub3_Sub1_Sub2.anInt6251 = (class98_sub46_sub17.anInt6051);
																	Class365.aBoolean3110 = true;
																}
															} else {
																GameInterfaceData class293 = (Class159.method2509(i_19_, -9820));
																int i_23_ = (class98_sub46_sub17.anInt6054);
																if ((class293 != null) && ((class293.type) == 0)) {
																	if ((-(class293.anInt2258) + class293.anInt2228) < i_23_)
																		i_23_ = class293.anInt2228 + -class293.anInt2258;
																	if (i_23_ < 0)
																		i_23_ = 0;
																	if (class293.anInt2213 != i_23_) {
																		class293.anInt2213 = i_23_;
																		Class341.method3812(1, class293);
																	}
																}
															}
														} else {
															GameInterfaceData class293 = (Class159.method2509(i_19_, -9820));
															if (((class293.anInt2268) != (class98_sub46_sub17.anInt6054)) || ((class293.anInt2273) != (class98_sub46_sub17.anInt6051)) || ((class98_sub46_sub17.anInt6053) != (class293.anInt2346))) {
																class293.anInt2346 = (class98_sub46_sub17.anInt6053);
																class293.anInt2268 = (class98_sub46_sub17.anInt6054);
																class293.anInt2273 = (class98_sub46_sub17.anInt6051);
																Class341.method3812(1, class293);
															}
														}
													} else {
														GameInterfaceData class293 = (Class159.method2509(i_19_, -9820));
														if (((class293.anInt2302) != (class98_sub46_sub17.anInt6054)) || ((class98_sub46_sub17.anInt6051) != (class293.anInt2349))) {
															class293.anInt2349 = (class98_sub46_sub17.anInt6051);
															class293.anInt2302 = (class98_sub46_sub17.anInt6054);
															Class341.method3812(1, class293);
														}
													}
												} else {
													GameInterfaceData class293 = (Class159.method2509(i_19_, i ^ 0x266f));
													boolean bool = (class98_sub46_sub17.anInt6054) == 1;
													if (!(class293.aBoolean2295) != !bool) {
														class293.aBoolean2295 = bool;
														Class341.method3812(i + 54, class293);
													}
												}
											} else {
												int i_24_ = (class98_sub46_sub17.anInt6054);
												int i_25_ = ((0x7d21 & i_24_) >> 10);
												int i_26_ = (i_24_ >> 5 & 0x1f);
												int i_27_ = 0x1f & i_24_;
												int i_28_ = ((i_26_ << 11) + (i_25_ << 19) + (i_27_ << 3));
												GameInterfaceData class293 = (Class159.method2509(i_19_, -9820));
												if ((class293.anInt2236) != i_28_) {
													class293.anInt2236 = i_28_;
													Class341.method3812(1, class293);
												}
											}
										} else {
											GameInterfaceData class293 = Class159.method2509(i_19_, -9820);
											if (((class293.anInt2208) != (class98_sub46_sub17.anInt6054)) || (class98_sub46_sub17.anInt6054) == -1) {
												class293.anInt2208 = (class98_sub46_sub17.anInt6054);
												class293.anInt2303 = 0;
												class293.anInt2312 = 0;
												class293.anInt2287 = 1;
												Class97 class97 = ((class293.anInt2208) != -1 ? (Class151_Sub7.aClass183_5001.method2623((class293.anInt2208), i + 16436)) : null);
												if (class97 != null)
													Class280.method3327((class293.anInt2303), class97, (byte) 118);
												Class341.method3812(i + 54, class293);
											}
										}
									} else {
										GameInterfaceData class293 = Class159.method2509(i_19_, i + -9767);
										if (!class98_sub46_sub17.aString6052.equals(class293.aString2225)) {
											class293.aString2225 = (class98_sub46_sub17.aString6052);
											Class341.method3812(i + 54, class293);
										}
									}
								} else {
									Class151_Sub1.aStringArray4967[i_19_] = class98_sub46_sub17.aString6052;
									LinkedList.anIntArray1196[Class202.method2702(31, Class96.anInt803++)] = i_19_;
								}
							}
							Class279.anInt2099++;
							if (Class55.anInt440 != 0) {
								Class98_Sub10_Sub32.anInt5720 += 20;
								if (Class98_Sub10_Sub32.anInt5720 >= 400)
									Class55.anInt440 = 0;
							}
							if (RtKeyListener.aClass293_593 != null) {
								Class42_Sub3.anInt5365++;
								if (Class42_Sub3.anInt5365 >= 15) {
									Class341.method3812(1, RtKeyListener.aClass293_593);
									RtKeyListener.aClass293_593 = null;
								}
							}
							Class162.draggedOnComponent = null;
							Class239.aBoolean1840 = false;
							Class11.aClass293_120 = null;
							Class166.aBoolean1278 = false;
							Class98_Sub1.method946(-1, -123, -1, null);
							Class304.method3563(-1, null, -1, i ^ ~0x8);
							if (!Class98_Sub10_Sub9.aBoolean5585)
								Class21_Sub2.anInt5387 = -1;
							Class3.method172(98);
							Class24.anInt242++;
							if (Class102.aBoolean889) {
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class98_Sub43_Sub2.aClass171_5906, Class331.aClass117_2811));
								class98_sub11.packet.method1232((Class375.anInt3169 | (Class122.anInt1009 << 14 | Class333.anInt3385 << 28)), (byte) 106);
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
								Class102.aBoolean889 = false;
							}
							for (;;) {
								ClientScript2Event class98_sub21 = ((ClientScript2Event) Class181.aClass148_1430.method2421(i ^ ~0x196a));
								if (class98_sub21 == null)
									break;
								GameInterfaceData class293 = (class98_sub21.component);
								if (class293.anInt2300 >= 0) {
									GameInterfaceData class293_29_ = Class159.method2509((class293.anInt2234), i ^ 0x266f);
									if (class293_29_ == null || (class293_29_.interfaceComponents) == null || ((class293_29_.interfaceComponents).length <= class293.anInt2300) || ((class293_29_.interfaceComponents[class293.anInt2300]) != class293))
										continue;
								}
								ClientScript2Runtime.method3144(class98_sub21);
							}
							for (;;) {
								ClientScript2Event class98_sub21 = ((ClientScript2Event) Class98_Sub46_Sub10.aClass148_6018.method2421(i ^ ~0x196a));
								if (class98_sub21 == null)
									break;
								GameInterfaceData class293 = (class98_sub21.component);
								if (class293.anInt2300 >= 0) {
									GameInterfaceData class293_30_ = Class159.method2509((class293.anInt2234), -9820);
									if (class293_30_ == null || (class293_30_.interfaceComponents) == null || (class293.anInt2300 >= (class293_30_.interfaceComponents).length) || ((class293_30_.interfaceComponents[class293.anInt2300]) != class293))
										continue;
								}
								ClientScript2Runtime.method3144(class98_sub21);
							}
							for (;;) {
								ClientScript2Event class98_sub21 = ((ClientScript2Event) Class151_Sub3.aClass148_4977.method2421(6494));
								if (class98_sub21 == null)
									break;
								GameInterfaceData class293 = (class98_sub21.component);
								if (class293.anInt2300 >= 0) {
									GameInterfaceData class293_31_ = Class159.method2509((class293.anInt2234), -9820);
									if (class293_31_ == null || (class293_31_.interfaceComponents) == null || (class293.anInt2300 >= (class293_31_.interfaceComponents).length) || (class293 != (class293_31_.interfaceComponents[(class293.anInt2300)])))
										continue;
								}
								ClientScript2Runtime.method3144(class98_sub21);
							}
							if (Class11.aClass293_120 == null)
								Class156_Sub2.anInt3423 = 0;
							if (Class255.draggedComponent != null)
								Class111_Sub3.method2118(19653);
							if (Player.rights > 0 && RtKeyListener.key_listener.is_key_down(82, 5503) && RtKeyListener.key_listener.is_key_down(81, 5503) && Class319.mouse_scroll_delta != 0) {
								int scrollHeight = ((Player.selfPlayer.height_level) - Class319.mouse_scroll_delta);
								if (scrollHeight >= 0) {
									if (scrollHeight > 3)
										scrollHeight = 3;
								} else
									scrollHeight = 0;
								Class351.shiftClickTele((Player.selfPlayer.walkQueueZ[0]) + aa_Sub2.anInt3562, (Class272.anInt2038 + (Player.selfPlayer.walkQueueX[0])), scrollHeight, 52);
							} else if (ClientSettings.zoomEnabled && Class319.mouse_scroll_delta != 0 && !client.mouseOverScrollWidget) {
								int zoom = Class319.mouse_scroll_delta;
								
								if (zoom >= 1) {// zoom in
									if (ClientSettings.clientZoom < 12) 
										client.adjustClientZoom(true);
									
								} else if (zoom < 1) { // zoom out
									if (ClientSettings.clientZoom >= 0) 
										client.adjustClientZoom(false);
								}
							}
							client.mouseOverScrollWidget = false;
							Class204.method2709((byte) 49);
							for (int i_33_ = 0; i_33_ < 5; i_33_++)
								Class212.anIntArray1597[i_33_]++;
							if (Class66.aBoolean507 && (-60000L + Class343.method3819(-47) > r_Sub1.aLong6322))
								Class23.method283((byte) 118);
							for (Class246_Sub4_Sub1 class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986.method2803((byte) 15)); class246_sub4_sub1 != null; class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986.method2809(false))) {
								if ((long) class246_sub4_sub1.anInt6172 < (-5L + Class343.method3819(i ^ 0x1a) / 1000L)) {
									if (class246_sub4_sub1.aShort6167 > 0)
										Class98_Sub45.add_message((byte) 125, 5, (class246_sub4_sub1.friendName + (TextResources.HAS_LOGGED_IN.get_text(Class374.anInt3159))), 0, "", "", "");
									if (class246_sub4_sub1.aShort6167 == 0)
										Class98_Sub45.add_message((byte) -120, 5, (class246_sub4_sub1.friendName + (TextResources.HAS_LOGGED_OUT.get_text(Class374.anInt3159))), 0, "", "", "");
									class246_sub4_sub1.method2965((byte) 126);
								}
							}
							Class134_Sub1.anInt5459++;
							if (Class134_Sub1.anInt5459 > 500) {
								Class134_Sub1.anInt5459 = 0;
								int i_34_ = (int) (Math.random() * 8.0);
								if ((i_34_ & 0x1) == 1)
									Class304.anInt2533 += Class197.anInt1520;
								if ((i_34_ & 0x2) == 2)
									Class98_Sub17.anInt3943 += Class93_Sub1.anInt5488;
								if ((i_34_ & 0x4) == 4)
									Class98_Sub10_Sub9.anInt5581 += Class98_Sub46_Sub4.anInt5961;
							}
							if (Class304.anInt2533 < -50)
								Class197.anInt1520 = 2;
							if (Class304.anInt2533 > 50)
								Class197.anInt1520 = -2;
							if (Class98_Sub17.anInt3943 < -55)
								Class93_Sub1.anInt5488 = 2;
							if (Class98_Sub10_Sub9.anInt5581 < -40)
								Class98_Sub46_Sub4.anInt5961 = 1;
							if (Class98_Sub17.anInt3943 > 55)
								Class93_Sub1.anInt5488 = -2;
							Class278_Sub1.anInt5170++;
							if (Class98_Sub10_Sub9.anInt5581 > 40)
								Class98_Sub46_Sub4.anInt5961 = -1;
							if (Class278_Sub1.anInt5170 > 500) {
								Class278_Sub1.anInt5170 = 0;
								int i_35_ = (int) (8.0 * Math.random());
								if ((0x2 & i_35_) == 2)
									Class151.anInt1213 += Class76_Sub9.anInt3786;
								if ((0x1 & i_35_) == 1)
									Class204.anInt1553 += Class169.anInt1305;
							}
							if (Class204.anInt1553 < -60)
								Class169.anInt1305 = 2;
							if (Class151.anInt1213 < -20)
								Class76_Sub9.anInt3786 = 1;
							if (Class204.anInt1553 > 60)
								Class169.anInt1305 = -2;
							Class196.anInt1511++;
							if (Class151.anInt1213 > 10)
								Class76_Sub9.anInt3786 = -1;
							if (Class196.anInt1511 > 50) {
								Class76_Sub5.anInt3746++;
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class98_Sub40.aClass171_4193, Class331.aClass117_2811));
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							}
							if (Class76_Sub8.aBoolean3771) {
								Class213.method2781(i ^ ~0x3c);
								Class76_Sub8.aBoolean3771 = false;
							}
							try {
								Class95.method920((byte) 115);
							} catch (java.io.IOException ioexception) {
								Canvas_Sub1.method118((byte) 104);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mg.D(" + i + ')');
		}
	}

	static final void method2630(int i, int i_36_, int i_37_, int i_38_) {
		try {
			if (i_36_ <= -102) {
				Class28 class28 = Class76.aClass28ArrayArray586[i_37_][i];
				Class21_Sub3.method275(false, i_38_, (class28 == null ? Class91.aClass28_722 : class28));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mg.C(" + i + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ')'));
		}
	}

	static final void method2631(int i, int i_39_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = setCS2StringOrVarc(i_39_, -29, i);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mg.E(" + i + ',' + i_39_ + ')');
		}
	}

	Class185(long l, int[] is, short[] is_40_, short[] is_41_) {
		try {
			this.aShortArray1444 = is_41_;
			this.aLong1448 = l;
			this.anIntArray1446 = is;
			this.aShortArray1447 = is_40_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mg.<init>(" + l + ',' + (is != null ? "{...}" : "null") + ',' + (is_40_ != null ? "{...}" : "null") + ',' + (is_41_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2632(byte i) {
		do {
			try {
				aClass246_Sub4_Sub2_Sub1Array1445 = null;
				if (i <= -6)
					break;
				method2630(14, 22, 64, 106);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mg.A(" + i + ')');
			}
			break;
		} while (false);
	}

	protected Class185() {
		/* empty */
	}
}
