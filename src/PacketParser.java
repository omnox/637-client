
import java.io.IOException;
import java.util.Arrays;

class PacketParser extends Class373 {
	private Class332 aClass332_5461;
	Class332 aClass332_5462;
	private Class332 aClass332_5463;
	private Class332 aClass332_5464;
	private Class332 aClass332_5465;
	private Class332 aClass332_5467;
	static Class98_Sub46_Sub16[] aClass98_Sub46_Sub16Array5468 = new Class98_Sub46_Sub16[14];

	final void method3965(int i, int i_0_, int i_1_, boolean bool) {
		try {
			int i_2_ = aClass332_5463.method3737() + i_1_;
			int i_3_ = i_1_ + (this.aClass93_3478.anInt3514 + -aClass332_5465.method3737());
			int i_4_ = i_0_ + aClass332_5461.method3749();
			int i_5_ = i_0_ + (this.aClass93_3478.anInt3504 + -aClass332_5464.method3749());
			int i_6_ = i_3_ + -i_2_;
			int i_7_ = -i_4_ + i_5_;
			int i_8_ = i_6_ * this.method3963(i ^ 0x66) / 10000;
			int[] is = new int[4];
			Class265.aHa1974.K(is);
			Class265.aHa1974.KA(i_2_, i_4_, i_8_ + i_2_, i_5_);
			method3966(i_7_, i_6_, i_4_, i_2_, (byte) 88);
			Class265.aHa1974.KA(i_2_ - -i_8_, i_4_, i_3_, i_5_);
			aClass332_5467.method3738(i_2_, i_4_, i_6_, i_7_);
			Class265.aHa1974.KA(is[0], is[1], is[i], is[3]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bia.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + bool + ')'));
		}
	}

	PacketParser(RuneScapeCache class207, RuneScapeCache class207_9_, Class93_Sub1 class93_sub1) {
		super(class207, class207_9_, class93_sub1);
	}

	void method3966(int i, int i_10_, int i_11_, int i_12_, byte i_13_) {
		do {
			try {
				this.aClass332_5462.method3738(i_12_, i_11_, i_10_, i);
				method3969(56, 14);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("bia.G(" + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3967(int i) throws IOException {
		try {
			if (aa_Sub1.aClass123_3561 == null)
				return false;
			if (IncomingOpcode.currentIncommingOpcode == null) {
				if (Class98_Sub43.aBoolean4243) {
					if (!aa_Sub1.aClass123_3561.method2203(-1949, 1))
						return false;
					aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
					Class224_Sub1.anInt5031 = 0;
					Class103.anInt892++;
					Class98_Sub43.aBoolean4243 = false;
				}
				IncomingMessages.packetStream.position = 0;
				if (IncomingMessages.packetStream.method1260((byte) 54)) {
					if (!aa_Sub1.aClass123_3561.method2203(-1949, 1))
						return false;
					aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 1, 2047, 1);
					Class103.anInt892++;
					Class224_Sub1.anInt5031 = 0;
				}
				Class98_Sub43.aBoolean4243 = true;
				IncomingOpcode[] class58s = IncomingOpcode.method3629();
				int i_14_ = IncomingMessages.packetStream.method1255(0);
				if (i_14_ < 0 || i_14_ >= class58s.length)
					throw new IOException("invo:" + i_14_ + " ip:" + (IncomingMessages.packetStream.position));
				IncomingOpcode.currentIncommingOpcode = class58s[i_14_];
				Class65.anInt496 = IncomingOpcode.currentIncommingOpcode.anInt460;
			}
			if (Class65.anInt496 == -1) {
				if (!aa_Sub1.aClass123_3561.method2203(-1949, 1))
					return false;
				aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 1);
				Class224_Sub1.anInt5031 = 0;
				Class65.anInt496 = (IncomingMessages.packetStream.data[0]) & 0xff;
				Class103.anInt892++;
			}
			if (Class65.anInt496 == -2) {
				if (!aa_Sub1.aClass123_3561.method2203(-1949, 2))
					return false;
				aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, 2047, 2);
				IncomingMessages.packetStream.position = 0;
				Class65.anInt496 = IncomingMessages.packetStream.readShort();
				Class103.anInt892 += 2;
				Class224_Sub1.anInt5031 = 0;
			}
			if (Class65.anInt496 > 0) {
				if (!aa_Sub1.aClass123_3561.method2203(-1949, Class65.anInt496))
					return false;
				IncomingMessages.packetStream.position = 0;
				aa_Sub1.aClass123_3561.method2208((IncomingMessages.packetStream.data), 0, i + -525198532, Class65.anInt496);
				Class224_Sub1.anInt5031 = 0;
				Class103.anInt892 += Class65.anInt496;
			}
			IncomingOpcode.aClass58_5641 = IncomingOpcode.aClass58_3262;
			IncomingOpcode.aClass58_3262 = IncomingOpcode.aClass58_4094;
			IncomingOpcode.aClass58_4094 = IncomingOpcode.currentIncommingOpcode;
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_591) {
				IncomingOpcode.currentIncommingOpcode = null;
				return false;
			}
			if (IncomingOpcode.bigVarpOpcode == IncomingOpcode.currentIncommingOpcode) {
				int varpValue = IncomingMessages.packetStream.readInt1(false);
				int varpIndex = IncomingMessages.packetStream.readShort();
				Class75.aClass140_584.setVarp(-7469, varpValue, varpIndex);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3566 == IncomingOpcode.currentIncommingOpcode) {
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				String string = IncomingMessages.packetStream.readString();
				String string_17_ = string;
				if (bool)
					string_17_ = IncomingMessages.packetStream.readString();
				int i_18_ = IncomingMessages.packetStream.readUnsignedByte();
				boolean bool_19_ = false;
				if (i_18_ <= 1) {
					if ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732) || ModelDefinitions.aBoolean1401)
						bool_19_ = true;
					else if (i_18_ <= 1 && Class14.method225(string_17_, (byte) 113))
						bool_19_ = true;
				}
				if (!bool_19_ && Class22.anInt216 == 0) {
					String string_20_ = (Class249.method3160(Class322.method3670((IncomingMessages.packetStream), (byte) 72), 62));
					if (i_18_ == 2)
						Class137.method2276(string, 24, "<img=1>" + string, string_20_, -1, null, (byte) -67, 0, "<img=1>" + string_17_);
					else if (i_18_ == 1)
						Class137.method2276(string, 24, "<img=0>" + string, string_20_, -1, null, (byte) -82, 0, "<img=0>" + string_17_);
					else
						Class137.method2276(string, 24, string, string_20_, -1, null, (byte) -63, 0, string_17_);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5176 == IncomingOpcode.currentIncommingOpcode) {
				int i_21_ = IncomingMessages.packetStream.readInt(-2);
				int i_22_ = IncomingMessages.packetStream.readShort();
				Class98_Sub25.method1274(i + -525200580);
				za_Sub2.method1680(i_22_, i_21_, 9767);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_6057) {
				int i_23_ = IncomingMessages.packetStream.readLEShortA((byte) 99);
				if (i_23_ == 65535)
					i_23_ = -1;
				int i_24_ = IncomingMessages.packetStream.readInt(-2);
				int i_25_ = IncomingMessages.packetStream.readInt2(-43);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class64_Sub26.method660(i_25_, i_24_, 113, i_23_);
				ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_23_);
				Class353.method3868(class297.anInt2465, i_25_, (byte) -104, class297.anInt2416, class297.anInt2476);
				Class323.method3675(i_25_, class297.anInt2437, true, class297.anInt2447, class297.anInt2441);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_364) {
				Class98_Sub25.method1274(-1);
				Class352.method3856((byte) 1);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5466 == IncomingOpcode.currentIncommingOpcode) {
				int i_26_ = IncomingMessages.packetStream.readShortA(i ^ 0x1f4decad);
				int i_27_ = IncomingMessages.packetStream.readByteA();
				Class98_Sub25.method1274(-1);
				Class98_Sub10_Sub30.method1093(-29680, i_27_, true, i_26_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1576) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class242.aClass85_1849);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.sendInterfaceOpcode) {
				int interfaceMask = IncomingMessages.packetStream.readInt2(-84);
				int interfaceID = IncomingMessages.packetStream.readLEShortA((byte) -106);
				int clickThrough = IncomingMessages.packetStream.readByteC((byte) -126);
				Class98_Sub25.method1274(-1);
				GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990(interfaceMask, i ^ ~0x1f4decc3));
				if (class98_sub18 != null)
					Class196.method2666(16398, false, class98_sub18, interfaceID != class98_sub18.interfaceID);
				Class323.createInterface(false, -126, interfaceID, interfaceMask, clickThrough);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5205) {
				int i_31_ = IncomingMessages.packetStream.readShort();
				int i_32_ = IncomingMessages.packetStream.readInt2(-89);
				Class98_Sub25.method1274(-1);
				Class225.method2848(i_32_, 17, i_31_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_2943) {
				Node.anInt837 = IncomingMessages.packetStream.readByteA();
				Class265.anInt1983 = IncomingMessages.packetStream.readByteS();
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2495 == IncomingOpcode.currentIncommingOpcode) {
				String string = IncomingMessages.packetStream.readString();
				int i_33_ = IncomingMessages.packetStream.readShort();
				String string_34_ = (Class52.aClass280_3500.method3325(i_33_, 67).getQuickChatMessage(15281, IncomingMessages.packetStream));
				Class137.method2276(string, 19, string, string_34_, i_33_, null, (byte) -93, 0, string);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2514 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class6.aClass85_89);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5606 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class133.aClass85_3454);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3731 == IncomingOpcode.currentIncommingOpcode) {
				Mobile.method3041(i + -525200579, (Class98_Sub43_Sub2.aClass88_5907), (IncomingMessages.packetStream), Class65.anInt496);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5011 == IncomingOpcode.currentIncommingOpcode) {
				int i_35_ = IncomingMessages.packetStream.readShort();
				String string = IncomingMessages.packetStream.readString();
				Class98_Sub25.method1274(-1);
				Class94.method919(string, i_35_, 52);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1609) {
				Class142.method2309(19208, IncomingMessages.packetStream.readString());
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5793 == IncomingOpcode.currentIncommingOpcode) {
				int i_36_ = IncomingMessages.packetStream.readInt2(-124);
				int i_37_ = IncomingMessages.packetStream.readInt(i + -525200581);
				Class98_Sub25.method1274(-1);
				GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990(i_37_, -1));
				GameInterface class98_sub18_38_ = ((GameInterface) Class116.aClass377_964.method3990(i_36_, -1));
				if (class98_sub18_38_ != null)
					Class196.method2666(16398, false, class98_sub18_38_, (class98_sub18 == null || ((class98_sub18.interfaceID) != (class98_sub18_38_.interfaceID))));
				if (class98_sub18 != null) {
					class98_sub18.remove();
					Class116.aClass377_964.method3996(class98_sub18, i_36_, i ^ ~0x1f4decc3);
				}
				GameInterfaceData class293 = Class159.method2509(i_37_, -9820);
				if (class293 != null)
					Class341.method3812(1, class293);
				class293 = Class159.method2509(i_36_, -9820);
				if (class293 != null) {
					Class341.method3812(i + -525200578, class293);
					Class63.method549(class293, true, (byte) -117);
				}
				if (Class15.anInt185 != -1)
					RuneScapeCache.method2764(1, Class15.anInt185, -43);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_6166 == IncomingOpcode.currentIncommingOpcode) {
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				byte[] is = new byte[Class65.anInt496 - 1];
				IncomingMessages.packetStream.method1190(is, true, -1 + Class65.anInt496, 0);
				Node.method943(is, bool, false);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_1743 == IncomingOpcode.currentIncommingOpcode) {
				while (IncomingMessages.packetStream.position < Class65.anInt496) {
					boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
					String string = IncomingMessages.packetStream.readString();
					String string_39_ = IncomingMessages.packetStream.readString();
					int i_40_ = IncomingMessages.packetStream.readShort();
					int i_41_ = IncomingMessages.packetStream.readUnsignedByte();
					String string_42_ = "";
					boolean bool_43_ = false;
					if (i_40_ > 0) {
						string_42_ = IncomingMessages.packetStream.readString();
						bool_43_ = IncomingMessages.packetStream.readUnsignedByte() == 1;
					}
					for (int i_44_ = 0; (Class314.anInt2692 > i_44_); i_44_++) {
						if (!bool) {
							if (string.equals(Class98_Sub25.aStringArray4026[i_44_])) {
								if (i_40_ != Class98_Sub26.anIntArray4030[i_44_]) {
									boolean bool_45_ = true;
									for (Class246_Sub4_Sub1 class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986.method2803((byte) 15)); class246_sub4_sub1 != null; class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986.method2809(false))) {
										if (class246_sub4_sub1.friendName.equals(string)) {
											if (i_40_ != 0 && (class246_sub4_sub1.aShort6167) == 0) {
												bool_45_ = false;
												class246_sub4_sub1.method2965((byte) -72);
											} else if (i_40_ == 0 && (class246_sub4_sub1.aShort6167) != 0) {
												bool_45_ = false;
												class246_sub4_sub1.method2965((byte) 126);
											}
										}
									}
									if (bool_45_)
										Class119.aClass218_986.method2808(true, new Class246_Sub4_Sub1(string, i_40_));
									Class98_Sub26.anIntArray4030[i_44_] = i_40_;
								}
								Class315.aStringArray3527[i_44_] = string_39_;
								Class98_Sub10_Sub17.aStringArray5625[i_44_] = string_42_;
								Class69.anIntArray3222[i_44_] = i_41_;
								string = null;
								aa_Sub3.aBooleanArray3575[i_44_] = bool_43_;
								break;
							}
						} else if (string_39_.equals(Class98_Sub25.aStringArray4026[i_44_])) {
							Class98_Sub25.aStringArray4026[i_44_] = string;
							string = null;
							Class315.aStringArray3527[i_44_] = string_39_;
							break;
						}
					}
					if (string != null && Class314.anInt2692 < 200) {
						Class98_Sub25.aStringArray4026[Class314.anInt2692] = string;
						Class315.aStringArray3527[Class314.anInt2692] = string_39_;
						Class98_Sub26.anIntArray4030[Class314.anInt2692] = i_40_;
						Class98_Sub10_Sub17.aStringArray5625[(Class314.anInt2692)] = string_42_;
						Class69.anIntArray3222[Class314.anInt2692] = i_41_;
						aa_Sub3.aBooleanArray3575[Class314.anInt2692] = bool_43_;
						Class314.anInt2692++;
					}
				}
				Class363.anInt3099 = Class24.anInt242;
				Class98_Sub28.anInt4078 = 2;
				boolean bool = false;
				int i_46_ = Class314.anInt2692;
				while (i_46_ > 0) {
					bool = true;
					i_46_--;
					for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
						if (((Class98_Sub26.anIntArray4030[i_47_] != Class98_Sub46_Sub10.aClass354_6011.anInt3011) && (Class98_Sub46_Sub10.aClass354_6011.anInt3011 == Class98_Sub26.anIntArray4030[1 + i_47_])) || (Class98_Sub26.anIntArray4030[i_47_] == 0 && (Class98_Sub26.anIntArray4030[1 + i_47_] != 0))) {
							int i_48_ = Class98_Sub26.anIntArray4030[i_47_];
							Class98_Sub26.anIntArray4030[i_47_] = Class98_Sub26.anIntArray4030[i_47_ + 1];
							Class98_Sub26.anIntArray4030[1 + i_47_] = i_48_;
							String string = Class98_Sub10_Sub17.aStringArray5625[i_47_];
							Class98_Sub10_Sub17.aStringArray5625[i_47_] = (Class98_Sub10_Sub17.aStringArray5625[1 + i_47_]);
							Class98_Sub10_Sub17.aStringArray5625[1 + i_47_] = string;
							String string_49_ = Class98_Sub25.aStringArray4026[i_47_];
							Class98_Sub25.aStringArray4026[i_47_] = Class98_Sub25.aStringArray4026[i_47_ - -1];
							Class98_Sub25.aStringArray4026[i_47_ + 1] = string_49_;
							String string_50_ = Class315.aStringArray3527[i_47_];
							Class315.aStringArray3527[i_47_] = Class315.aStringArray3527[1 + i_47_];
							Class315.aStringArray3527[i_47_ + 1] = string_50_;
							int i_51_ = Class69.anIntArray3222[i_47_];
							Class69.anIntArray3222[i_47_] = Class69.anIntArray3222[1 + i_47_];
							Class69.anIntArray3222[i_47_ + 1] = i_51_;
							boolean bool_52_ = aa_Sub3.aBooleanArray3575[i_47_];
							aa_Sub3.aBooleanArray3575[i_47_] = aa_Sub3.aBooleanArray3575[1 + i_47_];
							bool = false;
							aa_Sub3.aBooleanArray3575[1 + i_47_] = bool_52_;
						}
					}
					if (bool)
						break;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_1452 == IncomingOpcode.currentIncommingOpcode) { //llll
				int i_53_ = IncomingMessages.packetStream.readLEShortA((byte) -114);
				int i_54_ = IncomingMessages.packetStream.readByteA();
				int i_55_ = IncomingMessages.packetStream.readByteS();
				int i_56_ = IncomingMessages.packetStream.readByteS();
				int i_57_ = IncomingMessages.packetStream.readByteC((byte) 122);
				Class98_Sub25.method1274(-1);
				Class217.aBooleanArray3410[i_57_] = true;
				aa_Sub3.anIntArray3571[i_57_] = i_54_;
				Class98_Sub10_Sub13.anIntArray5603[i_57_] = i_56_;
				Class98_Sub32.anIntArray4109[i_57_] = i_55_;
				Class212.anIntArray1597[i_57_] = i_53_;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_6182 == IncomingOpcode.currentIncommingOpcode) {
				Class368.anInt3124 = IncomingMessages.packetStream.readUnsignedByte();
				IncomingOpcode.currentIncommingOpcode = null;
				Class98_Sub36.anInt4161 = Class24.anInt242;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.regionOpcode) {
				Class98_Sub41.decodeRegionOpcode(119);
				IncomingOpcode.currentIncommingOpcode = null;
				return false;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_4199) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class373_Sub3.aClass85_5474);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_369) {
				IncomingMessages.packetStream.position += 28;
				if (IncomingMessages.packetStream.method1210(-114))
					Class76_Sub7.method762((IncomingMessages.packetStream.position) + -28, (IncomingMessages.packetStream), true);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_592) {
				int i_58_ = IncomingMessages.packetStream.readInt(-2);
				Class98_Sub25.method1274(i + -525200580);
				if (i_58_ != -1) {
					int i_59_ = (0xfffeabc & i_58_) >> 14;
					int i_60_ = i_58_ & 0x3fff;
					i_59_ -= Class272.anInt2038;
					i_60_ -= aa_Sub2.anInt3562;
					if (i_59_ < 0)
						i_59_ = 0;
					else if (GameWorld.size_x <= i_59_)
						i_59_ = GameWorld.size_x;
					Class116.anInt967 = 256 + (i_59_ << 9);
					if (i_60_ >= 0) {
						if (GameWorld.size_y <= i_60_)
							i_60_ = GameWorld.size_y;
					} else
						i_60_ = 0;
					Class64_Sub26.anInt3712 = 256 + (i_60_ << 9);
				} else {
					Class64_Sub26.anInt3712 = -1;
					Class116.anInt967 = -1;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3533) {
				int i_61_ = IncomingMessages.packetStream.readByteA();
				int i_62_ = IncomingMessages.packetStream.readByteS();
				int i_63_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_64_ = IncomingMessages.packetStream.readByteC((byte) -120);
				int i_65_ = (IncomingMessages.packetStream.readShort1((byte) 107) << 2);
				Class98_Sub25.method1274(i + -525200580);
				Class98_Sub46_Sub13.method1592(-25686, i_64_, i_62_, i_65_, i_61_, i_63_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3029 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class64_Sub10.aClass85_3667);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3398 == IncomingOpcode.currentIncommingOpcode) {
				int i_66_ = IncomingMessages.packetStream.readInt1(false);
				int i_67_ = IncomingMessages.packetStream.readLEShortA((byte) 91);
				int i_68_ = IncomingMessages.packetStream.readLEShortA((byte) -81);
				int i_69_ = IncomingMessages.packetStream.readShort();
				int i_70_ = IncomingMessages.packetStream.readByteC((byte) -124);
				boolean bool = (0x80 & i_70_) != 0;
				int i_71_ = i_70_ & 0x7;
				int i_72_ = 0xf & i_70_ >> 3;
				if (i_72_ == 15)
					i_72_ = -1;
				if (i_66_ >> 30 != 0) {
					int i_73_ = i_66_ >> 28 & 0x3;
					int i_74_ = (((i_66_ & 0xfffdb84) >> 14) - Class272.anInt2038);
					int i_75_ = -aa_Sub2.anInt3562 + (0x3fff & i_66_);
					if (i_74_ >= 0 && i_75_ >= 0 && GameWorld.size_x > i_74_ && (i_75_ < GameWorld.size_y)) {
						int i_76_ = 512 * i_74_ + 256;
						int i_77_ = 256 + i_75_ * 512;
						int i_78_ = i_73_;
						if (i_78_ < 3 && Class1.method162(i_75_, (byte) -118, i_74_))
							i_78_++;
						Class246_Sub3_Sub4_Sub3 class246_sub3_sub4_sub3 = (new Class246_Sub3_Sub4_Sub3(i_69_, i_68_, Class215.anInt1614, i_73_, i_78_, i_76_, (-i_67_ + Perspective.getTileHeight(i_73_, i_77_, i_76_)), i_77_, i_74_, i_74_, i_75_, i_75_, i_71_));
						Class98_Sub10_Sub11.aClass148_5596.add_last(new Class98_Sub46_Sub3(class246_sub3_sub4_sub3), -20911);
					}
				} else if (i_66_ >> 29 == 0) {
					if (i_66_ >> 28 != 0) {
						int i_79_ = i_66_ & 0xffff;
						Player class246_sub3_sub4_sub2_sub2;
						if (i_79_ == za_Sub2.anInt6080)
							class246_sub3_sub4_sub2_sub2 = Player.selfPlayer;
						else
							class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_79_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							if (i_69_ == 65535)
								i_69_ = -1;
							boolean bool_80_ = true;
							int i_81_ = (bool ? class246_sub3_sub4_sub2_sub2.anInt6365 : class246_sub3_sub4_sub2_sub2.anInt6379);
							if (i_69_ != -1 && i_81_ != -1) {
								if (i_81_ != i_69_) {
									Class107 class107 = Class196.aClass304_1509.method3564(2, i_69_);
									Class107 class107_82_ = Class196.aClass304_1509.method3564(2, i_81_);
									if (class107.anInt910 != -1 && (class107_82_.anInt910 != -1)) {
										Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383));
										Class97 class97_83_ = (Class151_Sub7.aClass183_5001.method2623((class107_82_.anInt910), 16383));
										if (class97_83_.anInt829 > class97.anInt829)
											bool_80_ = false;
									}
								} else {
									Class107 class107 = Class196.aClass304_1509.method3564(2, i_69_);
									if (class107.aBoolean909 && class107.anInt910 != -1) {
										Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, i + -525184196));
										int i_84_ = class97.anInt819;
										if (i_84_ == 0 || i_84_ == 2)
											bool_80_ = false;
										else if (i_84_ == 1)
											bool_80_ = true;
									}
								}
							}
							if (bool_80_) {
								if (!bool) {
									class246_sub3_sub4_sub2_sub2.anInt6376 = 0;
									class246_sub3_sub4_sub2_sub2.anInt6396 = 0;
									class246_sub3_sub4_sub2_sub2.anInt6367 = 1;
									class246_sub3_sub4_sub2_sub2.anInt6410 = i_72_;
									class246_sub3_sub4_sub2_sub2.anInt6379 = i_69_;
									class246_sub3_sub4_sub2_sub2.anInt6382 = i_67_;
									class246_sub3_sub4_sub2_sub2.anInt6389 = i_71_;
									class246_sub3_sub4_sub2_sub2.anInt6391 = i_68_ + Class215.anInt1614;
									if (Class215.anInt1614 < (class246_sub3_sub4_sub2_sub2.anInt6391))
										class246_sub3_sub4_sub2_sub2.anInt6376 = -1;
									if ((class246_sub3_sub4_sub2_sub2.anInt6379) == 65535)
										class246_sub3_sub4_sub2_sub2.anInt6379 = -1;
									if ((class246_sub3_sub4_sub2_sub2.anInt6379) != -1 && (Class215.anInt1614 == (class246_sub3_sub4_sub2_sub2.anInt6391))) {
										int i_85_ = Class196.aClass304_1509.method3564(i + -525200577, (class246_sub3_sub4_sub2_sub2.anInt6379)).anInt910;
										if (i_85_ != -1) {
											Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(i_85_, 16383));
											if (class97 != null && (class97.anIntArray818) != null && !(class246_sub3_sub4_sub2_sub2.aBoolean6371))
												Class349.method3840((byte) -128, class246_sub3_sub4_sub2_sub2, 0, class97);
										}
									}
								} else {
									class246_sub3_sub4_sub2_sub2.anInt6427 = 0;
									class246_sub3_sub4_sub2_sub2.anInt6426 = i_68_ + Class215.anInt1614;
									class246_sub3_sub4_sub2_sub2.anInt6353 = i_72_;
									class246_sub3_sub4_sub2_sub2.anInt6365 = i_69_;
									class246_sub3_sub4_sub2_sub2.anInt6360 = i_71_;
									class246_sub3_sub4_sub2_sub2.anInt6428 = 0;
									class246_sub3_sub4_sub2_sub2.anInt6363 = i_67_;
									class246_sub3_sub4_sub2_sub2.anInt6421 = 1;
									if ((class246_sub3_sub4_sub2_sub2.anInt6426) > Class215.anInt1614)
										class246_sub3_sub4_sub2_sub2.anInt6428 = -1;
									if ((class246_sub3_sub4_sub2_sub2.anInt6365) == 65535)
										class246_sub3_sub4_sub2_sub2.anInt6365 = -1;
									if ((class246_sub3_sub4_sub2_sub2.anInt6365) != -1 && ((class246_sub3_sub4_sub2_sub2.anInt6426) == Class215.anInt1614)) {
										int i_86_ = Class196.aClass304_1509.method3564(2, (class246_sub3_sub4_sub2_sub2.anInt6365)).anInt910;
										if (i_86_ != -1) {
											Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(i_86_, i ^ 0x1f4dd33c));
											if (class97 != null && (class97.anIntArray818) != null && !(class246_sub3_sub4_sub2_sub2.aBoolean6371))
												Class349.method3840((byte) -128, class246_sub3_sub4_sub2_sub2, 0, class97);
										}
									}
								}
							}
						}
					}
				} else {
					int i_87_ = i_66_ & 0xffff;
					Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_87_, -1));
					if (class98_sub39 != null) {
						Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						if (i_69_ == 65535)
							i_69_ = -1;
						boolean bool_88_ = true;
						int i_89_ = (bool ? class246_sub3_sub4_sub2_sub1.anInt6365 : class246_sub3_sub4_sub2_sub1.anInt6379);
						if (i_69_ != -1 && i_89_ != -1) {
							if (i_89_ == i_69_) {
								Class107 class107 = Class196.aClass304_1509.method3564(i ^ 0x1f4decc1, i_69_);
								if (class107.aBoolean909 && class107.anInt910 != -1) {
									Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383));
									int i_90_ = class97.anInt819;
									if (i_90_ != 0 && i_90_ != 2) {
										if (i_90_ == 1)
											bool_88_ = true;
									} else
										bool_88_ = false;
								}
							} else {
								Class107 class107 = Class196.aClass304_1509.method3564(2, i_69_);
								Class107 class107_91_ = Class196.aClass304_1509.method3564(2, i_89_);
								if (class107.anInt910 != -1 && class107_91_.anInt910 != -1) {
									Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class107.anInt910, 16383));
									Class97 class97_92_ = (Class151_Sub7.aClass183_5001.method2623(class107_91_.anInt910, 16383));
									if (class97.anInt829 < class97_92_.anInt829)
										bool_88_ = false;
								}
							}
						}
						if (bool_88_) {
							if (bool) {
								class246_sub3_sub4_sub2_sub1.anInt6426 = i_68_ + Class215.anInt1614;
								class246_sub3_sub4_sub2_sub1.anInt6353 = i_72_;
								class246_sub3_sub4_sub2_sub1.anInt6427 = 0;
								class246_sub3_sub4_sub2_sub1.anInt6360 = i_71_;
								class246_sub3_sub4_sub2_sub1.anInt6365 = i_69_;
								class246_sub3_sub4_sub2_sub1.anInt6428 = 0;
								class246_sub3_sub4_sub2_sub1.anInt6421 = 1;
								class246_sub3_sub4_sub2_sub1.anInt6363 = i_67_;
								if (Class215.anInt1614 < class246_sub3_sub4_sub2_sub1.anInt6426)
									class246_sub3_sub4_sub2_sub1.anInt6428 = -1;
								if ((class246_sub3_sub4_sub2_sub1.anInt6365 != -1) && (Class215.anInt1614 == (class246_sub3_sub4_sub2_sub1.anInt6426))) {
									int i_93_ = Class196.aClass304_1509.method3564(2, (class246_sub3_sub4_sub2_sub1.anInt6365)).anInt910;
									if (i_93_ != -1) {
										Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_93_, 16383);
										if (class97 != null && (class97.anIntArray818) != null && !(class246_sub3_sub4_sub2_sub1.aBoolean6371))
											Class349.method3840((byte) -128, class246_sub3_sub4_sub2_sub1, 0, class97);
									}
								}
							} else {
								class246_sub3_sub4_sub2_sub1.anInt6367 = 1;
								class246_sub3_sub4_sub2_sub1.anInt6389 = i_71_;
								class246_sub3_sub4_sub2_sub1.anInt6376 = 0;
								class246_sub3_sub4_sub2_sub1.anInt6396 = 0;
								class246_sub3_sub4_sub2_sub1.anInt6379 = i_69_;
								class246_sub3_sub4_sub2_sub1.anInt6410 = i_72_;
								class246_sub3_sub4_sub2_sub1.anInt6391 = Class215.anInt1614 - -i_68_;
								class246_sub3_sub4_sub2_sub1.anInt6382 = i_67_;
								if (class246_sub3_sub4_sub2_sub1.anInt6391 > Class215.anInt1614)
									class246_sub3_sub4_sub2_sub1.anInt6376 = -1;
								if ((class246_sub3_sub4_sub2_sub1.anInt6379 != -1) && (Class215.anInt1614 == (class246_sub3_sub4_sub2_sub1.anInt6391))) {
									int i_94_ = Class196.aClass304_1509.method3564(2, (class246_sub3_sub4_sub2_sub1.anInt6379)).anInt910;
									if (i_94_ != -1) {
										Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_94_, 16383);
										if (class97 != null && (class97.anIntArray818) != null && !(class246_sub3_sub4_sub2_sub1.aBoolean6371))
											Class349.method3840((byte) -128, class246_sub3_sub4_sub2_sub1, 0, class97);
									}
								}
							}
						}
					}
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3877) {
				Class86.aClass350_649 = (Class98_Sub10_Sub8.method1029((byte) -107, IncomingMessages.packetStream.readUnsignedByte()));
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_433 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class35.aClass85_332);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1207) {
				int i_95_ = IncomingMessages.packetStream.readSmart(1689622712);
				int i_96_ = IncomingMessages.packetStream.readInt(-2);
				int i_97_ = IncomingMessages.packetStream.readUnsignedByte();
				String string = "";
				String string_98_ = string;
				if ((i_97_ & 0x1) != 0) {
					string = IncomingMessages.packetStream.readString();
					if ((i_97_ & 0x2) != 0)
						string_98_ = IncomingMessages.packetStream.readString();
					else
						string_98_ = string;
				}
				String string_99_ = IncomingMessages.packetStream.readString();
				if (i_95_ != 99) {
					if (!string_98_.equals("") && Class14.method225(string_98_, (byte) 125)) {
						IncomingOpcode.currentIncommingOpcode = null;
						return true;
					}
					Class98_Sub45.add_message((byte) -113, i_95_, string_99_, i_96_, string_98_, string, string);
				} else
					Class98_Sub46.method1525(string_99_, -92);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2912 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class98_Sub23.aClass85_4007);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5615) {
				String string = IncomingMessages.packetStream.readString();
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				String string_100_;
				if (bool)
					string_100_ = IncomingMessages.packetStream.readString();
				else
					string_100_ = string;
				int i_101_ = IncomingMessages.packetStream.readShort();
				byte i_102_ = IncomingMessages.packetStream.readSignedByte();
				boolean bool_103_ = false;
				if (i_102_ == -128)
					bool_103_ = true;
				if (!bool_103_) {
					String string_104_ = IncomingMessages.packetStream.readString();
					Class147 class147 = new Class147();
					class147.aString1191 = string;
					class147.aString1186 = string_100_;
					class147.aString1185 = Class353.method3867(-1, (class147.aString1186));
					class147.aByte1187 = i_102_;
					class147.anInt1188 = i_101_;
					class147.aString1190 = string_104_;
					int i_105_;
					for (i_105_ = -1 + Class32.anInt308; i_105_ >= 0; i_105_--) {
						int i_106_ = (Class374.aClass147Array3157[i_105_].aString1185.compareTo(class147.aString1185));
						if (i_106_ == 0) {
							Class374.aClass147Array3157[i_105_].anInt1188 = i_101_;
							Class374.aClass147Array3157[i_105_].aByte1187 = i_102_;
							Class374.aClass147Array3157[i_105_].aString1190 = string_104_;
							if (string_100_.equals(Player.selfPlayer.displayName))
								Class111.aByte947 = i_102_;
							Class64_Sub22.anInt3705 = Class24.anInt242;
							IncomingOpcode.currentIncommingOpcode = null;
							return true;
						}
						if (i_106_ < 0)
							break;
					}
					if (Class374.aClass147Array3157.length <= Class32.anInt308) {
						IncomingOpcode.currentIncommingOpcode = null;
						return true;
					}
					for (int i_107_ = Class32.anInt308 + -1; i_107_ > i_105_; i_107_--)
						Class374.aClass147Array3157[i_107_ - -1] = Class374.aClass147Array3157[i_107_];
					if (Class32.anInt308 == 0)
						Class374.aClass147Array3157 = new Class147[100];
					Class374.aClass147Array3157[i_105_ - -1] = class147;
					Class32.anInt308++;
					if (string_100_.equals(Player.selfPlayer.displayName))
						Class111.aByte947 = i_102_;
				} else {
					if (Class32.anInt308 == 0) {
						IncomingOpcode.currentIncommingOpcode = null;
						return true;
					}
					boolean bool_108_ = false;
					int i_109_;
					for (i_109_ = 0; (Class32.anInt308 > i_109_); i_109_++) {
						if (Class374.aClass147Array3157[i_109_].aString1186.equals(string_100_) && Class374.aClass147Array3157[i_109_].anInt1188 == i_101_)
							break;
					}
					if (Class32.anInt308 > i_109_) {
						for (/**/; (Class32.anInt308 - 1 > i_109_); i_109_++)
							Class374.aClass147Array3157[i_109_] = Class374.aClass147Array3157[i_109_ - -1];
						Class32.anInt308--;
						Class374.aClass147Array3157[Class32.anInt308] = null;
					}
				}
				IncomingOpcode.currentIncommingOpcode = null;
				Class64_Sub22.anInt3705 = Class24.anInt242;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.hideComponentOpcode) {
				int interfaceMask = IncomingMessages.packetStream.readInt2(-91);
				int hiddenChoice = IncomingMessages.packetStream.readByteC((byte) 59);
				Class98_Sub25.method1274(-1);
				Map.method3587(hiddenChoice, -39, interfaceMask);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.CS2StringOpcode) {
				String string = IncomingMessages.packetStream.readString();
				int cs2StringID = IncomingMessages.packetStream.readLEShortA((byte) 101);
				Class98_Sub25.method1274(i + -525200580);
				Class94.method919(string, cs2StringID, 68);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_28 == IncomingOpcode.currentIncommingOpcode) {
				int i_113_ = IncomingMessages.packetStream.readShort();
				if (i_113_ == 65535)
					i_113_ = -1;
				int i_114_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_115_ = IncomingMessages.packetStream.readShort();
				int i_116_ = IncomingMessages.packetStream.readUnsignedByte();
				Class98_Sub10_Sub9.method1036(i ^ ~0x6bb6e430, i_116_, i_114_, i_113_, true, i_115_, 256);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5333) {
				int i_117_ = IncomingMessages.packetStream.readLEShortA((byte) -31);
				int i_118_ = IncomingMessages.packetStream.readIntReverse(true);
				Class98_Sub25.method1274(-1);
				Class64_Sub8.method585(i_117_, (byte) -85, i_118_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5482) {
				int playerIndex = IncomingMessages.packetStream.readShort();
				Player class246_sub3_sub4_sub2_sub2;
				if (playerIndex != za_Sub2.anInt6080)
					class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[playerIndex]);
				else
					class246_sub3_sub4_sub2_sub2 = Player.selfPlayer;
				if (class246_sub3_sub4_sub2_sub2 == null) {
					IncomingOpcode.currentIncommingOpcode = null;
					return true;
				}
				int chatMask = IncomingMessages.packetStream.readShort();
				int playerRank = IncomingMessages.packetStream.readUnsignedByte();
				boolean sendingQuickChat = (0x8000 & chatMask) != 0;
				if (class246_sub3_sub4_sub2_sub2.displayName != null && class246_sub3_sub4_sub2_sub2.appearance != null) {
					boolean bool_122_ = false;
					if (playerRank <= 1) {
						if (!sendingQuickChat && ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732) || ModelDefinitions.aBoolean1401))
							bool_122_ = true;
						else if (Class14.method225(class246_sub3_sub4_sub2_sub2.displayName, (byte) 117))
							bool_122_ = true;
					}
					if (!bool_122_ && Class22.anInt216 == 0) {
						int i_123_ = -1;
						String string;
						if (!sendingQuickChat)
							string = (Class249.method3160((Class322.method3670((IncomingMessages.packetStream), (byte) 72)), 62));
						else {
							chatMask &= 0x7fff;
							Class300 class300 = (Class42.method376((byte) -12, (IncomingMessages.packetStream)));
							i_123_ = class300.quickChatFileID;
							string = (class300.aClass98_Sub46_Sub11_2498.getQuickChatMessage(15281, (IncomingMessages.packetStream)));
						}
						class246_sub3_sub4_sub2_sub2.aString6374 = string.trim();
						class246_sub3_sub4_sub2_sub2.anInt6398 = chatMask >> 8;
						class246_sub3_sub4_sub2_sub2.anInt6402 = 0xff & chatMask;
						class246_sub3_sub4_sub2_sub2.anInt6384 = 150;
						int i_124_;
						if (playerRank == 1 || playerRank == 2)
							i_124_ = sendingQuickChat ? 17 : 1;
						else
							i_124_ = !sendingQuickChat ? 2 : 17;
						if (playerRank == 2)
							Class137.method2276(class246_sub3_sub4_sub2_sub2.name, i_124_, "<img=1>" + class246_sub3_sub4_sub2_sub2.method3063(0, true), string, i_123_, null, (byte) -107, 0, "<img=1>" + class246_sub3_sub4_sub2_sub2.method3059(-1, false));
						else if (playerRank == 1)
							Class137.method2276(class246_sub3_sub4_sub2_sub2.name, i_124_, "<img=0>" + class246_sub3_sub4_sub2_sub2.method3063(0, true), string, i_123_, null, (byte) -84, 0, "<img=0>" + class246_sub3_sub4_sub2_sub2.method3059(-1, false));
						else
							Class137.method2276(class246_sub3_sub4_sub2_sub2.name, i_124_, class246_sub3_sub4_sub2_sub2.method3063(i ^ 0x1f4decc3, true), string, i_123_, null, (byte) -81, 0, class246_sub3_sub4_sub2_sub2.method3059(-1, false));
					}
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_6264 == IncomingOpcode.currentIncommingOpcode) {
				int i_125_ = IncomingMessages.packetStream.readShort();
				if (i_125_ == 65535)
					i_125_ = -1;
				int i_126_ = IncomingMessages.packetStream.readIntReverse(true);
				Class98_Sub25.method1274(i + -525200580);
				Class98_Sub46_Sub10.method1572(i_126_, 30585, i_125_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5638) {
				int i_127_ = IncomingMessages.packetStream.readByteA();
				byte i_128_ = IncomingMessages.packetStream.method1187((byte) -112);
				Class98_Sub25.method1274(-1);
				OutputStream_Sub1.method130(i_128_, 65280, i_127_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_4992) {
				Class98_Sub10_Sub22.method1070((byte) -45, OutgoingPacket.aClass85_3868);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_6151) {
				int i_129_ = IncomingMessages.packetStream.readShort1((byte) 112);
				Class98_Sub25.method1274(-1);
				Class98_Sub42.method1476(256, i_129_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5635) {
				int i_130_ = IncomingMessages.packetStream.readShort1((byte) -85);
				int i_131_ = IncomingMessages.packetStream.readLEShortA((byte) 92);
				Class98_Sub25.method1274(-1);
				Class308.method3608(i_131_, 0, i + -525200495, i_130_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2844 == IncomingOpcode.currentIncommingOpcode) {//Quick chat? maybe
				int[] is = new int[4];
				for (int i_132_ = 0; i_132_ < 4; i_132_++)
					is[i_132_] = IncomingMessages.packetStream.readShort1((byte) -104);
				int i_133_ = IncomingMessages.packetStream.readShort();
				int i_134_ = IncomingMessages.packetStream.readByteS();
				Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_133_, -1));
				if (class98_sub39 != null)
					Class98_Sub43.method1483(i_134_, (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187), i ^ 0x1f4decc2, is);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5086 == IncomingOpcode.currentIncommingOpcode) { //grand exchange
				int i_135_ = IncomingMessages.packetStream.readUnsignedByte();
				if (IncomingMessages.packetStream.readUnsignedByte() == 0)
					Class98_Sub10_Sub24.aClass101Array5666[i_135_] = new Class101();
				else {
					IncomingMessages.packetStream.position--;
					Class98_Sub10_Sub24.aClass101Array5666[i_135_] = new Class101(IncomingMessages.packetStream);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				Class64_Sub11.anInt3668 = Class24.anInt242;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_184) {
				int i_136_ = IncomingMessages.packetStream.readByteC((byte) -112);
				int i_137_ = i_136_ >> 2;
				int i_138_ = i_136_ & 0x3;
				int i_139_ = Class64_Sub17.anIntArray3685[i_137_];
				int i_140_ = IncomingMessages.packetStream.readLEShortA((byte) -40);
				if (i_140_ == 65535)
					i_140_ = -1;
				int i_141_ = IncomingMessages.packetStream.readInt2(i + -525200657);
				int i_142_ = 0x3 & i_141_ >> 28;
				int i_143_ = (0xffff619 & i_141_) >> 14;
				i_143_ -= Class272.anInt2038;
				int i_144_ = i_141_ & 0x3fff;
				i_144_ -= aa_Sub2.anInt3562;
				Class283.method3351(i_137_, i_138_, true, i_143_, i_144_, i_142_, i_140_, i_139_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_499 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class60.aClass85_471);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.smallVarpOpcode == IncomingOpcode.currentIncommingOpcode) {
				int varpIndex = IncomingMessages.packetStream.readShortA(50);
				byte varpValue = IncomingMessages.packetStream.method1234(128);
				Class75.aClass140_584.setVarp(-7469, varpValue, varpIndex);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_6457) {
				if (GameInterface.aFrame3950 != null)
					Class98_Sub16.method1150(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4052.method666((byte) 120), -1, 3, -1, false);
				byte[] is = new byte[Class65.anInt496];
				IncomingMessages.packetStream.method1251(0, Class65.anInt496, is, true);
				String string = Class98_Sub46_Sub6.method1546(Class65.anInt496, 0, (byte) -84, is);
				Class315.method3647(true, Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 127) == 1, string, true, Class98_Sub43_Sub2.aClass88_5907);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5996 == IncomingOpcode.currentIncommingOpcode) {
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				String string = IncomingMessages.packetStream.readString();
				String string_147_ = string;
				if (bool)
					string_147_ = IncomingMessages.packetStream.readString();
				long l = IncomingMessages.packetStream.readShort();
				long l_148_ = IncomingMessages.packetStream.readMedium(i ^ ~0x1f4decbf);
				int i_149_ = IncomingMessages.packetStream.readUnsignedByte();
				long l_150_ = (l << 32) + l_148_;
				boolean bool_151_ = false;
				while_29_: do {
					for (int i_152_ = 0; i_152_ < 100; i_152_++) {
						if (l_150_ == Class94.aLongArray794[i_152_]) {
							bool_151_ = true;
							break while_29_;
						}
					}
					if (i_149_ <= 1) {
						if ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732) || ModelDefinitions.aBoolean1401) {
							bool_151_ = true;
						} else if (Class14.method225(string_147_, (byte) 126)) {
							bool_151_ = true;
						}
					}
				} while (false);
				if (!bool_151_ && Class22.anInt216 == 0) {
					Class94.aLongArray794[Class147.anInt1193] = l_150_;
					Class147.anInt1193 = (1 + Class147.anInt1193) % 100;
					String string_153_ = (Class249.method3160(Class322.method3670((IncomingMessages.packetStream), (byte) 72), 62));
					if (i_149_ != 2) {
						if (i_149_ != 1) {
							Class137.method2276(string, 3, string, string_153_, -1, null, (byte) -108, 0, string_147_);
						} else {
							Class137.method2276(string, 7, "<img=0>" + string, string_153_, -1, null, (byte) -120, 0, "<img=0>" + string_147_);
						}
					} else
						Class137.method2276(string, 7, "<img=1>" + string, string_153_, -1, null, (byte) -93, 0, "<img=1>" + string_147_);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_43) {
				Class273.method3280((byte) -101);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3147 == IncomingOpcode.currentIncommingOpcode) {
				int i_154_ = IncomingMessages.packetStream.readShort1((byte) 50);
				byte i_155_ = IncomingMessages.packetStream.readSignedByte();
				Class98_Sub25.method1274(-1);
				Class116.setVarc(i_155_, i_154_, (byte) -120);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5032) {
				String string = IncomingMessages.packetStream.readString();
				int i_156_ = IncomingMessages.packetStream.readIntReverse(true);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				ha_Sub1.method1895(i_156_, (byte) -52, string);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.exitToLobbyOpcode) {
				Class98_Sub10_Sub1.exitToLobby(false, aa_Sub3.aBoolean3569);
				IncomingOpcode.currentIncommingOpcode = null;
				return false;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_2052) {
				int i_157_ = IncomingMessages.packetStream.readShort1((byte) -79);
				int i_158_ = IncomingMessages.packetStream.readLEShortA((byte) -72);
				int i_159_ = IncomingMessages.packetStream.readInt1(false);
				Class98_Sub25.method1274(-1);
				Class98_Sub10_Sub33.method1099(i_159_, i_158_ + (i_157_ << 16), (byte) 111);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2143 == IncomingOpcode.currentIncommingOpcode) { //save
				int i_160_ = IncomingMessages.packetStream.readIntReverse(true);
				int i_161_ = IncomingMessages.packetStream.readLEShortA((byte) -48);
				int i_162_ = IncomingMessages.packetStream.readIntReverse(true);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(i_161_, i_160_, 5, 4, i_162_);
				//Class98_Sub19.method1164(id, -1, 2, i ^ 0x1f4decc7, interfaceId);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3132 == IncomingOpcode.currentIncommingOpcode) {
				Class248.anInt1897 = IncomingMessages.packetStream.readUnsignedByte();
				for (int i_163_ = 0; i_163_ < Class248.anInt1897; i_163_++) {
					Class246_Sub4_Sub1.aStringArray6171[i_163_] = IncomingMessages.packetStream.readString();
					Class255.aStringArray3209[i_163_] = IncomingMessages.packetStream.readString();
					if (Class255.aStringArray3209[i_163_].equals(""))
						Class255.aStringArray3209[i_163_] = Class246_Sub4_Sub1.aStringArray6171[i_163_];
					Class98_Sub45.aStringArray4255[i_163_] = IncomingMessages.packetStream.readString();
					Class110.aStringArray945[i_163_] = IncomingMessages.packetStream.readString();
					if (Class110.aStringArray945[i_163_].equals(""))
						Class110.aStringArray945[i_163_] = Class98_Sub45.aStringArray4255[i_163_];
					Class98_Sub10_Sub38.aBooleanArray5759[i_163_] = false;
				}
				Class363.anInt3099 = Class24.anInt242;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1212) {
				Class98_Sub36.method1459(-1048016408);
				IncomingOpcode.currentIncommingOpcode = null;
				return false;
			}
			if (IncomingOpcode.aClass58_2651 == IncomingOpcode.currentIncommingOpcode) {//steven
				int i_164_ = IncomingMessages.packetStream.readByteC((byte) -107);
				int i_165_ = IncomingMessages.packetStream.readShortA(75);
				Class75.aClass140_584.method2292(i_165_, i_164_, -32727);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3482 == IncomingOpcode.currentIncommingOpcode) {
				int i_166_ = IncomingMessages.packetStream.readShortA(i ^ 0x1f4dec82);
				if (i_166_ == 65535)
					i_166_ = -1;
				int i_167_ = IncomingMessages.packetStream.readByteS();
				String string = IncomingMessages.packetStream.readString();
				int i_168_ = IncomingMessages.packetStream.readByteS();
				if (i_168_ >= 1 && i_168_ <= 8) {
					if (string.equalsIgnoreCase("null"))
						string = null;
					Class269.aStringArray2021[-1 + i_168_] = string;
					Class151_Sub9.anIntArray5019[i_168_ + -1] = i_166_;
					Class146_Sub2.aBooleanArray4840[-1 + i_168_] = i_167_ == 0;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3134 == IncomingOpcode.currentIncommingOpcode) { //hinticon id 0
				int i_169_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_170_ = i_169_ >> 5;
				int i_171_ = i_169_ & 0x1f;
				if (i_171_ == 0) {
					Class104.aClass36Array903[i_170_] = null;
					IncomingOpcode.currentIncommingOpcode = null;
					return true;
				}
				Class36 class36 = new Class36();
				class36.anInt346 = i_171_;
				class36.anInt341 = IncomingMessages.packetStream.readUnsignedByte();
				if (class36.anInt341 >= 0 && (class36.anInt341 < Class306.aClass332Array2557.length)) {
					if (class36.anInt346 != 1 && class36.anInt346 != 10) {
						if (class36.anInt346 >= 2 && class36.anInt346 <= 6) {
							if (class36.anInt346 == 2) {
								class36.anInt338 = 256;
								class36.anInt347 = 256;
							}
							if (class36.anInt346 == 3) {
								class36.anInt338 = 0;
								class36.anInt347 = 256;
							}
							if (class36.anInt346 == 4) {
								class36.anInt338 = 512;
								class36.anInt347 = 256;
							}
							if (class36.anInt346 == 5) {
								class36.anInt338 = 256;
								class36.anInt347 = 0;
							}
							if (class36.anInt346 == 6) {
								class36.anInt347 = 512;
								class36.anInt338 = 256;
							}
							class36.anInt346 = 2;
							class36.anInt342 = IncomingMessages.packetStream.readUnsignedByte();
							class36.anInt338 += (IncomingMessages.packetStream.readShort() - Class272.anInt2038) << 9;
							class36.anInt347 += (IncomingMessages.packetStream.readShort() + -aa_Sub2.anInt3562) << 9;
							class36.anInt343 = IncomingMessages.packetStream.readUnsignedByte() << 2;
							class36.anInt340 = IncomingMessages.packetStream.readShort();
						}
					} else {
						class36.anInt345 = IncomingMessages.packetStream.readShort();
						IncomingMessages.packetStream.position += 6;
					}
					class36.anInt339 = IncomingMessages.packetStream.readShort();
					if (class36.anInt339 == 65535)
						class36.anInt339 = -1;
					Class104.aClass36Array903[i_170_] = class36;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1595) { //sound
				int i_172_ = IncomingMessages.packetStream.readShort();
				if (i_172_ == 65535)
					i_172_ = -1;
				int i_173_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_174_ = IncomingMessages.packetStream.readShort();
				int i_175_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_176_ = IncomingMessages.packetStream.readShort();
				Class98_Sub10_Sub9.method1036(-1962608884, i_175_, i_173_, i_172_, false, i_174_, i_176_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_2507) {
				int i_177_ = IncomingMessages.packetStream.readByteS();
				int i_178_ = IncomingMessages.packetStream.readByteA();
				int i_179_ = (IncomingMessages.packetStream.readShort1((byte) 57) << 2);
				int i_180_ = IncomingMessages.packetStream.readByteA();
				int i_181_ = IncomingMessages.packetStream.readByteA();
				Class98_Sub25.method1274(-1);
				ha_Sub1.method1871(i_177_, i_180_, true, i_179_, i_178_, i_181_, i + -525200676);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_469 == IncomingOpcode.currentIncommingOpcode) {
				int i_182_ = IncomingMessages.packetStream.readShort();
				int i_183_ = IncomingMessages.packetStream.readUnsignedByte();
				boolean bool = (0x1 & i_183_) == 1;
				Class232.method2882(i + -525200605, i_182_, bool);
				int i_184_ = IncomingMessages.packetStream.readShort();
				for (int i_185_ = 0; i_185_ < i_184_; i_185_++) {
					int i_186_ = IncomingMessages.packetStream.readShortA(84);
					int i_187_ = IncomingMessages.packetStream.readByteC((byte) -122);
					if (i_187_ == 255)
						i_187_ = IncomingMessages.packetStream.readInt1(false);
					Class349.method3841(bool, i_187_, 3113, i_182_, -1 + i_186_, i_185_);
				}
				Class78.anIntArray597[Class202.method2702(Class145.anInt1172++, 31)] = i_182_;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_4997) {
				String string = IncomingMessages.packetStream.readString();
				String string_188_ = (Class249.method3160(Class322.method3670((IncomingMessages.packetStream), (byte) 72), 62));
				Class98_Sub45.add_message((byte) 44, 6, string_188_, 0, string, string, string);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.minimapFlagOpcode) {
				int minimapX = IncomingMessages.packetStream.readByteS();
				int minimapY = IncomingMessages.packetStream.readByteS();
				if (minimapX == 255) {
					minimapY = -1;
					minimapX = -1;
				}
				Class244.method2953((byte) -103, minimapX, minimapY);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_5838) {
				Class333.anInt3386 = IncomingMessages.packetStream.readUnsignedByte();
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_4222) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class246_Sub4_Sub2.aClass85_6186);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_266 == IncomingOpcode.currentIncommingOpcode) {
				int i_191_ = IncomingMessages.packetStream.readIntReverse(true);
				int i_192_ = IncomingMessages.packetStream.readLEShortA((byte) 121);
				Class98_Sub25.method1274(-1);
				Class45.method430(true, i_192_, i_191_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3554) {
				int i_193_ = IncomingMessages.packetStream.readShort();
				int i_194_ = IncomingMessages.packetStream.readShort();
				int i_195_ = IncomingMessages.packetStream.readShort();
				Class98_Sub25.method1274(-1);
				if (Class159.gameInterfaces[i_193_] != null) {
					for (int i_196_ = i_194_; i_196_ < i_195_; i_196_++) {
						int i_197_ = IncomingMessages.packetStream.readMedium(i + -525200702);
						if (i_196_ < Class159.gameInterfaces[i_193_].length && (Class159.gameInterfaces[i_193_][i_196_]) != null)
							Class159.gameInterfaces[i_193_][i_196_].anInt2259 = i_197_;
					}
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_75) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class79.aClass85_600);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_379 == IncomingOpcode.currentIncommingOpcode) {
				int i_198_ = IncomingMessages.packetStream.readByteS();
				int i_199_ = IncomingMessages.packetStream.readLEShortA((byte) -81);
				boolean bool = (0x1 & i_198_) == 1;
				Class181.method2610(true, bool, i_199_);
				Class78.anIntArray597[Class202.method2702(Class145.anInt1172++, 31)] = i_199_;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_6041 == IncomingOpcode.currentIncommingOpcode) {
				int i_200_ = IncomingMessages.packetStream.readByteA();
				int i_201_ = IncomingMessages.packetStream.readShortA(102);
				Class98_Sub25.method1274(-1);
				if (i_200_ == 2)
					Class231.method2878(i ^ 0x1f4decc1);
				Class15.anInt185 = i_201_;
				Class98_Sub46_Sub15.method1609(i_201_, i + -525213468);
				Class40.method359(-124, false);
				ClientScript2Runtime.method3155(Class15.anInt185);
				for (int i_202_ = 0; i_202_ < 100; i_202_++)
					aa_Sub3.aBooleanArray3574[i_202_] = true;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3645 == IncomingOpcode.currentIncommingOpcode) {
				int i_203_ = IncomingMessages.packetStream.readByteC((byte) -128);
				int i_204_ = IncomingMessages.packetStream.readByteC((byte) -128);
				int i_205_ = IncomingMessages.packetStream.readShort1((byte) 90);
				if (i_205_ == 65535)
					i_205_ = -1;
				Class246_Sub3_Sub1.method2994(i_205_, i_203_, (byte) -83, i_204_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3665 == IncomingOpcode.currentIncommingOpcode) {
				int i_206_ = IncomingMessages.packetStream.method1192((byte) -108);
				int i_207_ = IncomingMessages.packetStream.readByteS();
				int i_208_ = IncomingMessages.packetStream.readShort1((byte) 42);
				if (i_208_ == 65535)
					i_208_ = -1;
				Class228.method2861(i_206_, i_207_, i_208_, 18596);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_161) { //Changed their streams?
				Class206.anInt1568 = IncomingMessages.packetStream.readUnsignedByte();
				Class335.anInt2819 = IncomingMessages.packetStream.method1187((byte) -112) << 3;
				Class53.anInt430 = IncomingMessages.packetStream.method1184(i + -2023493939) << 3;
				while (IncomingMessages.packetStream.position < Class65.anInt496) {
					Class85 class85 = (Class113.method2143(-1)[IncomingMessages.packetStream.readUnsignedByte()]);
					Class98_Sub10_Sub22.method1070((byte) -45, class85);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_589 == IncomingOpcode.currentIncommingOpcode) {
				int i_209_ = IncomingMessages.packetStream.readShort();
				if (i_209_ == 65535)
					i_209_ = -1;
				int i_210_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_211_ = IncomingMessages.packetStream.readShort();
				int i_212_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_213_ = IncomingMessages.packetStream.readShort();
				Class301.method3537(i_213_, (byte) 1, i_209_, i_210_, i_211_, i_212_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_1596 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub25.method1274(i + -525200580);
				Class284.method3359(9268);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_6487) {
				int i_214_ = IncomingMessages.packetStream.readLEShortA((byte) -39);
				int i_215_ = IncomingMessages.packetStream.readInt(-2);
				Class75.aClass140_584.method2292(i_214_, i_215_, i ^ ~0x1f4d9315);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3406) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class98_Sub10_Sub16.aClass85_5621);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3993) { //??
				Class53.anInt430 = IncomingMessages.packetStream.method1184(-1498293360) << 3;
				Class206.anInt1568 = IncomingMessages.packetStream.readByteC((byte) -106);
				Class335.anInt2819 = IncomingMessages.packetStream.method1184(i + -2023493939) << 3;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_4029 == IncomingOpcode.currentIncommingOpcode) {
				int i_216_ = IncomingMessages.packetStream.readShort();
				int i_217_ = IncomingMessages.packetStream.readUnsignedByte();
				boolean bool = (0x1 & i_217_) == 1;
				while (Class65.anInt496 > IncomingMessages.packetStream.position) {
					int i_218_ = IncomingMessages.packetStream.readSmart(1689622712);
					int i_219_ = IncomingMessages.packetStream.readShort();
					int i_220_ = 0;
					if (i_219_ != 0) {
						i_220_ = IncomingMessages.packetStream.readUnsignedByte();
						if (i_220_ == 255)
							i_220_ = IncomingMessages.packetStream.readInt(i + -525200581);
					}
					Class349.method3841(bool, i_220_, i ^ 0x1f4de0ea, i_216_, -1 + i_219_, i_218_);
				}
				Class78.anIntArray597[Class202.method2702(Class145.anInt1172++, 31)] = i_216_;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_4270 == IncomingOpcode.currentIncommingOpcode) {
				boolean bool = (IncomingMessages.packetStream.readByteS() == 1);
				Class98_Sub25.method1274(-1);
				Class98_Sub46_Sub1.aBoolean5943 = bool;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_274) {
				Class108.method1731(Class65.anInt496, IncomingMessages.packetStream, i + -525200579);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.ignoreOpcode == IncomingOpcode.currentIncommingOpcode) {
				int i_221_ = IncomingMessages.packetStream.readUnsignedByte();
				boolean bool = (i_221_ & 0x1) == 1;
				String displayName1 = IncomingMessages.packetStream.readString();
				String displayName2 = IncomingMessages.packetStream.readString();
				if (displayName2.equals(""))
					displayName2 = displayName1;
				String previousName = IncomingMessages.packetStream.readString();
				String displayName3 = IncomingMessages.packetStream.readString();
				if (displayName3.equals(""))
					displayName3 = previousName;
				if (bool) {
					for (int i_225_ = 0; (Class248.anInt1897 > i_225_); i_225_++) {
						if (Class255.aStringArray3209[i_225_].equals(displayName3)) {
							Class246_Sub4_Sub1.aStringArray6171[i_225_] = displayName1;
							Class255.aStringArray3209[i_225_] = displayName2;
							Class98_Sub45.aStringArray4255[i_225_] = previousName;
							Class110.aStringArray945[i_225_] = displayName3;
							break;
						}
					}
				} else {
					Class246_Sub4_Sub1.aStringArray6171[Class248.anInt1897] = displayName1;
					Class255.aStringArray3209[Class248.anInt1897] = displayName2;
					Class98_Sub45.aStringArray4255[Class248.anInt1897] = previousName;
					Class110.aStringArray945[Class248.anInt1897] = displayName3;
					Class98_Sub10_Sub38.aBooleanArray5759[Class248.anInt1897] = Class202.method2702(2, i_221_) == 2;
					Class248.anInt1897++;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				Class363.anInt3099 = Class24.anInt242;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_6335) {
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				String string = IncomingMessages.packetStream.readString();
				String string_226_ = string;
				if (bool)
					string_226_ = IncomingMessages.packetStream.readString();
				int i_227_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_228_ = IncomingMessages.packetStream.readShort();
				boolean bool_229_ = false;
				if (i_227_ <= 1 && Class14.method225(string_226_, (byte) 108))
					bool_229_ = true;
				if (!bool_229_ && Class22.anInt216 == 0) {
					String string_230_ = (Class52.aClass280_3500.method3325(i_228_, 44).getQuickChatMessage(i + -525185298, IncomingMessages.packetStream));
					if (i_227_ != 2) {
						if (i_227_ != 1)
							Class137.method2276(string, 25, string, string_230_, i_228_, null, (byte) -100, 0, string_226_);
						else
							Class137.method2276(string, 25, "<img=0>" + string, string_230_, i_228_, null, (byte) -127, 0, "<img=0>" + string_226_);
					} else
						Class137.method2276(string, 25, "<img=1>" + string, string_230_, i_228_, null, (byte) -123, 0, "<img=1>" + string_226_);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2708 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub1.exitToLobby(false, false);
				IncomingOpcode.currentIncommingOpcode = null;
				return false;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_431) {
				int i_231_ = IncomingMessages.packetStream.readInt1(false);
				int i_232_ = IncomingMessages.packetStream.readByteS();
				int i_233_ = IncomingMessages.packetStream.readByteS();
				Class52.anIntArray3493[i_232_] = i_231_;
				Class64_Sub21.anIntArray3701[i_232_] = i_233_;
				Class256_Sub1.anIntArray5158[i_232_] = 1;
				int i_234_ = -1 + Class98_Sub46_Sub4.anIntArray5955[i_232_];
				for (int i_235_ = 0; i_234_ > i_235_; i_235_++) {
					if (i_231_ >= Class48_Sub1.anIntArray3629[i_235_])
						Class256_Sub1.anIntArray5158[i_232_] = 2 + i_235_;
				}
				Class98_Sub16.anIntArray3928[Class202.method2702(31, Class93_Sub1.anInt5477++)] = i_232_;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3637) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class39.aClass85_362);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_4291) {
				Class218.aString1636 = (Class65.anInt496 > 2 ? IncomingMessages.packetStream.readString() : TextResources.WALK_HERE.get_text(Class374.anInt3159));
				Class199.anInt1541 = Class65.anInt496 > 0 ? IncomingMessages.packetStream.readShort() : -1;
				IncomingOpcode.currentIncommingOpcode = null;
				if (Class199.anInt1541 == 65535)
					Class199.anInt1541 = -1;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_4998) {
				Class98_Sub28.anInt4078 = 1;
				IncomingOpcode.currentIncommingOpcode = null;
				Class363.anInt3099 = Class24.anInt242;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1179) {
				int i_236_ = IncomingMessages.packetStream.readInt2(i ^ ~0x1f4deccd);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(za_Sub2.anInt6080, 0, 5, i ^ 0x1f4decc7, i_236_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1192) {
				int i_237_ = IncomingMessages.packetStream.method1242(-1420625632);
				int i_238_ = IncomingMessages.packetStream.readInt(i + -525200581);
				int i_239_ = IncomingMessages.packetStream.method1183(65536);
				Class98_Sub25.method1274(-1);
				AnimableEntity.method2984(i_239_, (byte) -105, i_237_, i_238_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.closeInterfaceOpcode) {
				int interfaceMask = IncomingMessages.packetStream.readIntReverse(true);
				Class98_Sub25.method1274(-1);
				GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990(interfaceMask, -1));
				if (class98_sub18 != null)
					Class196.method2666(16398, false, class98_sub18, true);
				if (OutputStream_Sub1.aClass293_33 != null) {
					Class341.method3812(1, OutputStream_Sub1.aClass293_33);
					OutputStream_Sub1.aClass293_33 = null;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_4128) {
				int i_241_ = IncomingMessages.packetStream.readInt1(false);
				int i_242_ = IncomingMessages.packetStream.method1198(i + -525200697);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class218.method2806(i_241_, i_242_, true);//steven
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2581 == IncomingOpcode.currentIncommingOpcode) {
				int i_243_ = IncomingMessages.packetStream.readShort();
				int i_244_ = IncomingMessages.packetStream.readIntReverse(true);
				int i_245_ = IncomingMessages.packetStream.readLEShortA((byte) -115);
				int i_246_ = IncomingMessages.packetStream.readShortA(96);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(i_245_ << 16 | i_243_, i_246_, 7, 4, i_244_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_2139) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class351.aClass85_2921);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_2993) {
				Class98_Sub46_Sub9.anInt6003 = IncomingMessages.packetStream.method1227((byte) -1);
				Class109.aBoolean933 = IncomingMessages.packetStream.readUnsignedByte() == 1;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_1992 == IncomingOpcode.currentIncommingOpcode) {
				if (Class15.anInt185 != -1)
					RuneScapeCache.method2764(0, Class15.anInt185, -46);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5608 == IncomingOpcode.currentIncommingOpcode) {
				if (!Class246_Sub3_Sub3.method3011(-6410, Class177.anInt1376))
					Class98_Sub10_Sub6.anInt5569 = 30 * IncomingMessages.packetStream.readShort();
				else
					Class98_Sub10_Sub6.anInt5569 = (int) ((float) IncomingMessages.packetStream.readShort() * 2.5F);
				Class98_Sub36.anInt4161 = Class24.anInt242;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5493 == IncomingOpcode.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, ha_Sub1.aClass85_4299);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5697 == IncomingOpcode.currentIncommingOpcode) {
				int i_247_ = IncomingMessages.packetStream.readShort1((byte) 75);
				Class98_Sub25.method1274(i + -525200580);
				OutgoingPacket.method1127((byte) 67, i_247_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2661 == IncomingOpcode.currentIncommingOpcode) {
				for (int i_248_ = 0; i_248_ < (Class151_Sub9.playerArray).length; i_248_++) {
					if ((Class151_Sub9.playerArray[i_248_]) != null) {
						Class151_Sub9.playerArray[i_248_].anIntArray6373 = null;
						Class151_Sub9.playerArray[i_248_].anInt6413 = -1;
					}
				}
				for (int i_249_ = 0; (Class98_Sub10_Sub20.anInt5640 > i_249_); i_249_++) {
					Class163.aClass98_Sub39Array3516[i_249_].aClass246_Sub3_Sub4_Sub2_Sub1_4187.anIntArray6373 = null;
					Class163.aClass98_Sub39Array3516[i_249_].aClass246_Sub3_Sub4_Sub2_Sub1_4187.anInt6413 = -1;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2825 == IncomingOpcode.currentIncommingOpcode) {
				int i_250_ = IncomingMessages.packetStream.readInt1(false);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(-1, -1, 3, i ^ 0x1f4decc7, i_250_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_112) {
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				String string = IncomingMessages.packetStream.readString();
				String string_251_ = string;
				if (bool)
					string_251_ = IncomingMessages.packetStream.readString();
				long l = IncomingMessages.packetStream.method1246(-105);
				long l_252_ = IncomingMessages.packetStream.readShort();
				long l_253_ = IncomingMessages.packetStream.readMedium(-124);
				int i_254_ = IncomingMessages.packetStream.readUnsignedByte();
				long l_255_ = (l_252_ << 32) + l_253_;
				boolean bool_256_ = false;
				while_30_: do {
					for (int i_257_ = 0; i_257_ < 100; i_257_++) {
						if (l_255_ == Class94.aLongArray794[i_257_]) {
							bool_256_ = true;
							break while_30_;
						}
					}
					if (i_254_ <= 1) {
						if ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732) || ModelDefinitions.aBoolean1401)
							bool_256_ = true;
						else if (Class14.method225(string_251_, (byte) 121))
							bool_256_ = true;
					}
				} while (false);
				if (!bool_256_ && Class22.anInt216 == 0) {
					Class94.aLongArray794[Class147.anInt1193] = l_255_;
					Class147.anInt1193 = (Class147.anInt1193 - -1) % 100;
					String string_258_ = (Class249.method3160(Class322.method3670((IncomingMessages.packetStream), (byte) 72), 62));
					if (i_254_ != 2 && i_254_ != 3) {
						if (i_254_ == 1)
							Class137.method2276(string, 9, "<img=0>" + string, string_258_, -1, Class18.method247(l, i + -525200681), (byte) -65, 0, "<img=0>" + string_251_);
						else
							Class137.method2276(string, 9, string, string_258_, -1, Class18.method247(l, -120), (byte) -84, 0, string_251_);
					} else
						Class137.method2276(string, 9, "<img=1>" + string, string_258_, -1, Class18.method247(l, i + -525200644), (byte) -113, 0, "<img=1>" + string_251_);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3677) {
				int i_259_ = IncomingMessages.packetStream.readInt2(-108);
				int i_260_ = IncomingMessages.packetStream.readShortA(i + -525200459);
				if (i_260_ == 65535)
					i_260_ = -1;
				int i_261_ = IncomingMessages.packetStream.readShortA(74);
				if (i_261_ == 65535)
					i_261_ = -1;
				int i_262_ = IncomingMessages.packetStream.readIntReverse(true);
				Class98_Sub25.method1274(-1);
				for (int i_263_ = i_261_; i_263_ <= i_260_; i_263_++) {
					long l = ((long) i_262_ << 32) - -(long) i_263_;
					IComponentSettings class98_sub49 = ((IComponentSettings) Class168.aClass377_1287.method3990(l, -1));
					IComponentSettings class98_sub49_264_;
					if (class98_sub49 != null) {
						class98_sub49_264_ = new IComponentSettings(i_259_, class98_sub49.anInt4285);
						class98_sub49.remove();
					} else if (i_263_ == -1)
						class98_sub49_264_ = new IComponentSettings(i_259_, (Class159.method2509(i_262_, -9820).aClass98_Sub49_2348.anInt4285));
					else
						class98_sub49_264_ = new IComponentSettings(i_259_, -1);
					Class168.aClass377_1287.method3996(class98_sub49_264_, l, -1);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_344) {//shawn
				int i_265_ = IncomingMessages.packetStream.readInt1(false);
				int i_266_ = IncomingMessages.packetStream.readShort();
				if (i_266_ == 65535)
					i_266_ = -1;
				int i_267_ = IncomingMessages.packetStream.readShortA(66);
				int i_268_ = IncomingMessages.packetStream.readShort();
				if (i_268_ == 65535)
					i_268_ = -1;
				Class98_Sub25.method1274(-1);
				for (int i_269_ = i_266_; i_268_ >= i_269_; i_269_++) {
					long l = ((long) i_265_ << 32) - -(long) i_269_;
					IComponentSettings class98_sub49 = ((IComponentSettings) Class168.aClass377_1287.method3990(l, -1));
					IComponentSettings class98_sub49_270_;
					if (class98_sub49 != null) {
						class98_sub49_270_ = new IComponentSettings(class98_sub49.optionMask, i_267_);
						class98_sub49.remove();
					} else if (i_269_ == -1)
						class98_sub49_270_ = (new IComponentSettings(Class159.method2509(i_265_, i ^ ~0x1f4dca98).aClass98_Sub49_2348.optionMask, i_267_));
					else
						class98_sub49_270_ = new IComponentSettings(0, i_267_);
					Class168.aClass377_1287.method3996(class98_sub49_270_, l, i ^ ~0x1f4decc3);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_6197 == IncomingOpcode.currentIncommingOpcode) {
				int i_271_ = IncomingMessages.packetStream.readIntReverse(true);
				int i_272_ = IncomingMessages.packetStream.readShortA(111);
				int i_273_ = IncomingMessages.packetStream.readShort();
				int i_274_ = IncomingMessages.packetStream.readShort();
				Class98_Sub25.method1274(i + -525200580);
				Class353.method3868(i_274_, i_271_, (byte) -121, i_273_, i_272_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_6516) {
				Class64_Sub22.anInt3705 = Class24.anInt242;
				if (Class65.anInt496 == 0) {
					Class374.aClass147Array3157 = null;
					Class93_Sub3.aString5494 = null;
					Class32.anInt308 = 0;
					Class153.aString1229 = null;
					IncomingOpcode.currentIncommingOpcode = null;
					return true;
				}
				Class93_Sub3.aString5494 = IncomingMessages.packetStream.readString();
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				if (bool)
					IncomingMessages.packetStream.readString();
				long l = IncomingMessages.packetStream.method1246(-126);
				Class153.aString1229 = Class98_Sub28.method1305(-89, l);
				Class232.aByte1742 = IncomingMessages.packetStream.readSignedByte();
				int i_275_ = IncomingMessages.packetStream.readUnsignedByte();
				if (i_275_ == 255) {
					IncomingOpcode.currentIncommingOpcode = null;
					return true;
				}
				Class32.anInt308 = i_275_;
				Class147[] class147s = new Class147[100];
				for (int i_276_ = 0; Class32.anInt308 > i_276_; i_276_++) {
					class147s[i_276_] = new Class147();
					class147s[i_276_].aString1191 = IncomingMessages.packetStream.readString();
					bool = IncomingMessages.packetStream.readUnsignedByte() == 1;
					if (bool)
						class147s[i_276_].aString1186 = IncomingMessages.packetStream.readString();
					else
						class147s[i_276_].aString1186 = class147s[i_276_].aString1191;
					class147s[i_276_].aString1185 = Class353.method3867(i ^ ~0x1f4decc3, (class147s[i_276_].aString1186));
					class147s[i_276_].anInt1188 = IncomingMessages.packetStream.readShort();
					class147s[i_276_].aByte1187 = IncomingMessages.packetStream.readSignedByte();
					class147s[i_276_].aString1190 = IncomingMessages.packetStream.readString();
					if (class147s[i_276_].aString1186.equals(Player.selfPlayer.displayName))
						Class111.aByte947 = class147s[i_276_].aByte1187;
				}
				boolean bool_277_ = false;
				int i_278_ = Class32.anInt308;
				while (i_278_ > 0) {
					bool_277_ = true;
					i_278_--;
					for (int i_279_ = 0; i_278_ > i_279_; i_279_++) {
						if ((class147s[i_279_].aString1185.compareTo(class147s[1 + i_279_].aString1185)) > 0) {
							Class147 class147 = class147s[i_279_];
							class147s[i_279_] = class147s[i_279_ + 1];
							class147s[1 + i_279_] = class147;
							bool_277_ = false;
						}
					}
					if (bool_277_)
						break;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				Class374.aClass147Array3157 = class147s;
				return true;
			}
			if (IncomingOpcode.aClass58_215 == IncomingOpcode.currentIncommingOpcode) {
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				String string = IncomingMessages.packetStream.readString();
				String string_280_ = string;
				if (bool)
					string_280_ = IncomingMessages.packetStream.readString();
				long l = IncomingMessages.packetStream.method1246(-122);
				long l_281_ = IncomingMessages.packetStream.readShort();
				long l_282_ = IncomingMessages.packetStream.readMedium(i ^ ~0x1f4decbe);
				int i_283_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_284_ = IncomingMessages.packetStream.readShort();
				long l_285_ = l_282_ + (l_281_ << 32);
				boolean bool_286_ = false;
				while_31_: do {
					for (int i_287_ = 0; i_287_ < 100; i_287_++) {
						if (l_285_ == Class94.aLongArray794[i_287_]) {
							bool_286_ = true;
							break while_31_;
						}
					}
					if (i_283_ <= 1 && Class14.method225(string_280_, (byte) 103))
						bool_286_ = true;
				} while (false);
				if (!bool_286_ && Class22.anInt216 == 0) {
					Class94.aLongArray794[Class147.anInt1193] = l_285_;
					Class147.anInt1193 = (Class147.anInt1193 - -1) % 100;
					String string_288_ = (Class52.aClass280_3500.method3325(i_284_, 98).getQuickChatMessage(15281, IncomingMessages.packetStream));
					if (i_283_ == 2)
						Class137.method2276(string, 20, "<img=1>" + string, string_288_, i_284_, Class18.method247(l, -76), (byte) -117, 0, "<img=1>" + string_280_);
					else if (i_283_ == 1)
						Class137.method2276(string, 20, "<img=0>" + string, string_288_, i_284_, Class18.method247(l, -113), (byte) -121, 0, "<img=0>" + string_280_);
					else
						Class137.method2276(string, 20, string, string_288_, i_284_, Class18.method247(l, -81), (byte) -53, 0, string_280_);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.smallVarcOpcode == IncomingOpcode.currentIncommingOpcode) {
				int varcIndex = IncomingMessages.packetStream.readLEShortA((byte) -102);
				int varcValue = IncomingMessages.packetStream.readIntReverse(true);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class116.setVarc(varcValue, varcIndex, (byte) -120);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_3844) {
				boolean bool = (IncomingMessages.packetStream.readUnsignedByte() == 1);
				String string = IncomingMessages.packetStream.readString();
				String string_291_ = string;
				if (bool)
					string_291_ = IncomingMessages.packetStream.readString();
				long l = IncomingMessages.packetStream.readShort();
				long l_292_ = IncomingMessages.packetStream.readMedium(-123);
				int i_293_ = IncomingMessages.packetStream.readUnsignedByte();
				int i_294_ = IncomingMessages.packetStream.readShort();
				long l_295_ = l_292_ + (l << 32);
				boolean bool_296_ = false;
				while_32_: do {
					for (int i_297_ = 0; i_297_ < 100; i_297_++) {
						if (Class94.aLongArray794[i_297_] == l_295_) {
							bool_296_ = true;
							break while_32_;
						}
					}
					if (i_293_ <= 1 && Class14.method225(string_291_, (byte) 104))
						bool_296_ = true;
				} while (false);
				if (!bool_296_ && Class22.anInt216 == 0) {
					Class94.aLongArray794[Class147.anInt1193] = l_295_;
					Class147.anInt1193 = (Class147.anInt1193 - -1) % 100;
					String string_298_ = (Class52.aClass280_3500.method3325(i_294_, 98).getQuickChatMessage(15281, IncomingMessages.packetStream));
					if (i_293_ == 2)
						Class137.method2276(string, 18, "<img=1>" + string, string_298_, i_294_, null, (byte) -101, 0, "<img=1>" + string_291_);
					else if (i_293_ != 1)
						Class137.method2276(string, 18, string, string_298_, i_294_, null, (byte) -97, 0, string_291_);
					else
						Class137.method2276(string, 18, "<img=0>" + string, string_298_, i_294_, null, (byte) -126, 0, "<img=0>" + string_291_);
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_587 == IncomingOpcode.currentIncommingOpcode) {
				Class166.method2525(0);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.cs2Opcode) {
				String string = IncomingMessages.packetStream.readString();
				Object[] objects = new Object[string.length() + 1];
				for (int i_299_ = string.length() + -1; i_299_ >= 0; i_299_--) {
					if (string.charAt(i_299_) != 's') {
						objects[1 + i_299_] = new Integer(IncomingMessages.packetStream.readInt(-2));
					} else {
						objects[i_299_ + 1] = IncomingMessages.packetStream.readString();
					}
				}
				objects[0] = new Integer(IncomingMessages.packetStream.readInt(-2));
				Class98_Sub25.method1274(-1);
				ClientScript2Event class98_sub21 = new ClientScript2Event();
				class98_sub21.cs2_params = objects;
				ClientScript2Runtime.method3144(class98_sub21);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_2816) {
				int i_300_ = IncomingMessages.packetStream.readInt2(-112);
				int i_301_ = IncomingMessages.packetStream.readShort1((byte) -77);
				if (i_301_ == 65535)
					i_301_ = -1;
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(i_301_, -1, 2, i ^ 0x1f4decc7, i_300_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.currentIncommingOpcode == IncomingOpcode.aClass58_1921) {
				int i_302_ = IncomingMessages.packetStream.readShort1((byte) 78);
				if (i_302_ == 65535)
					i_302_ = -1;
				int i_303_ = IncomingMessages.packetStream.readInt(-2);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class98_Sub19.method1164(i_302_, -1, 1, 4, i_303_);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_2187 == IncomingOpcode.currentIncommingOpcode) {
				int i_304_ = IncomingMessages.packetStream.readUnsignedByte();
				Class98_Sub25.method1274(-1);
				Class103.anInt896 = i_304_;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.carriedWeightOpcode == IncomingOpcode.currentIncommingOpcode) {
				Class24.carriedWeight = IncomingMessages.packetStream.readUShort(false);
				Class98_Sub36.anInt4161 = Class24.anInt242;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_5975 == IncomingOpcode.currentIncommingOpcode) {
				int i_305_ = IncomingMessages.packetStream.readInt(-2);
				Class187.aClass143_1449 = Class98_Sub43_Sub2.aClass88_5907.method868(i_305_, 113);
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_1507 == IncomingOpcode.currentIncommingOpcode) {
				Class75.aClass140_584.method2288((byte) -79);
				Class239.anInt1844 += 32;
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			if (IncomingOpcode.aClass58_3642 == IncomingOpcode.currentIncommingOpcode) { //rawr
				Class206.anInt1568 = IncomingMessages.packetStream.readUnsignedByte();
				Class335.anInt2819 = IncomingMessages.packetStream.method1234(128) << 3;
				Class53.anInt430 = IncomingMessages.packetStream.readSignedByte() << 3;
				for (Class98_Sub45 class98_sub45 = ((Class98_Sub45) AbstractModel.aClass377_1180.start_iteration(105)); class98_sub45 != null; class98_sub45 = (Class98_Sub45) AbstractModel.aClass377_1180.iterate_next(-1)) {
					int i_306_ = (int) (0x3L & (class98_sub45.uid >> 28));
					int i_307_ = (int) (0x3fffL & class98_sub45.uid);
					int i_308_ = i_307_ + -Class272.anInt2038;
					int i_309_ = (int) (0x3fffL & (class98_sub45.uid >> 14));
					int i_310_ = -aa_Sub2.anInt3562 + i_309_;
					if (Class206.anInt1568 == i_306_ && i_308_ >= Class53.anInt430 && (i_308_ < Class53.anInt430 - -8) && Class335.anInt2819 <= i_310_ && Class335.anInt2819 - -8 > i_310_) {
						class98_sub45.remove();
						if (i_308_ >= 0 && i_310_ >= 0 && i_308_ < GameWorld.size_x && (i_310_ < GameWorld.size_y))
							Class98_Sub32.method1437(i_308_, Class206.anInt1568, (byte) 122, i_310_);
					}
				}
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478.method2418(32)); class98_sub33 != null; class98_sub33 = (Class98_Sub33) Class191.aClass148_1478.method2417(96)) {
					if (Class53.anInt430 <= class98_sub33.anInt4112 && (class98_sub33.anInt4112 < 8 + Class53.anInt430) && Class335.anInt2819 <= class98_sub33.anInt4113 && (class98_sub33.anInt4113 < 8 + Class335.anInt2819) && (Class206.anInt1568 == class98_sub33.anInt4116))
						class98_sub33.aBoolean4124 = true;
				}
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) OutgoingPacket.aClass148_3866.method2418(32)); class98_sub33 != null; class98_sub33 = (Class98_Sub33) OutgoingPacket.aClass148_3866.method2417(i + -525200461)) {
					if ((class98_sub33.anInt4112 >= Class53.anInt430) && (class98_sub33.anInt4112 < 8 + Class53.anInt430) && (Class335.anInt2819 <= class98_sub33.anInt4113) && (class98_sub33.anInt4113 < 8 + Class335.anInt2819) && (class98_sub33.anInt4116 == Class206.anInt1568))
						class98_sub33.aBoolean4124 = true;
				}
				IncomingOpcode.currentIncommingOpcode = null;
				return true;
			}
			Map.method3585(null, i ^ ~0x1f4decb8, ("T1 - " + (IncomingOpcode.currentIncommingOpcode != null ? IncomingOpcode.currentIncommingOpcode.method521((byte) 67) : -1) + "," + (IncomingOpcode.aClass58_3262 == null ? -1 : IncomingOpcode.aClass58_3262.method521((byte) 76)) + "," + (IncomingOpcode.aClass58_5641 == null ? -1 : IncomingOpcode.aClass58_5641.method521((byte) 71)) + " - " + Class65.anInt496));
			Class98_Sub10_Sub1.exitToLobby(false, false);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bia.I(" + i + ')');
		}
	}

	public final void method58(byte i) {
		try {
			super.method58(i);
			Class93_Sub1 class93_sub1 = (Class93_Sub1) this.aClass93_3478;
			this.aClass332_5462 = Class237_Sub1.method2915((class93_sub1.anInt5483), this.aClass207_3473, (byte) -89);
			aClass332_5467 = Class237_Sub1.method2915((class93_sub1.anInt5480), this.aClass207_3473, (byte) -89);
			aClass332_5463 = Class237_Sub1.method2915((class93_sub1.anInt5485), this.aClass207_3473, (byte) -89);
			aClass332_5465 = Class237_Sub1.method2915((class93_sub1.anInt5481), this.aClass207_3473, (byte) -89);
			aClass332_5461 = Class237_Sub1.method2915((class93_sub1.anInt5478), this.aClass207_3473, (byte) -89);
			aClass332_5464 = Class237_Sub1.method2915((class93_sub1.anInt5484), this.aClass207_3473, (byte) -89);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bia.C(" + i + ')');
		}
	}

	public static void method3968(boolean bool) {
		try {
			IncomingOpcode.aClass58_5466 = null;
			if (bool != false)
				method3969(-29, 33);
			aClass98_Sub46_Sub16Array5468 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bia.H(" + bool + ')');
		}
	}

	public final boolean method59(int i) {
		try {
			if (!super.method59(i))
				return false;
			Class93_Sub1 class93_sub1 = (Class93_Sub1) this.aClass93_3478;
			if (!this.aClass207_3473.method2742(-22, class93_sub1.anInt5483))
				return false;
			if (!this.aClass207_3473.method2742(-81, class93_sub1.anInt5480))
				return false;
			if (!this.aClass207_3473.method2742(-87, class93_sub1.anInt5485))
				return false;
			if (!this.aClass207_3473.method2742(-58, class93_sub1.anInt5481))
				return false;
			if (!this.aClass207_3473.method2742(-61, class93_sub1.anInt5478))
				return false;
			if (!this.aClass207_3473.method2742(-61, class93_sub1.anInt5484))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bia.A(" + i + ')');
		}
	}

	final void method3960(int i, int i_311_, byte i_312_, boolean bool) {
		try {
			if (i_312_ == -36) {
				if (bool) {
					int[] is = new int[4];
					Class265.aHa1974.K(is);
					Class265.aHa1974.KA(i_311_, i, i_311_ + (this.aClass93_3478.anInt3514), i - -(this.aClass93_3478.anInt3504));
					int i_313_ = aClass332_5463.method3737();
					int i_314_ = aClass332_5463.method3749();
					int i_315_ = aClass332_5465.method3737();
					int i_316_ = aClass332_5465.method3749();
					aClass332_5463.method3735(i_311_, (-i_314_ + (this.aClass93_3478.anInt3504)) / 2 + i);
					aClass332_5465.method3735(-i_315_ + (i_311_ - -this.aClass93_3478.anInt3514), (this.aClass93_3478.anInt3504 + -i_316_) / 2 + i);
					Class265.aHa1974.KA(i_311_, i, (this.aClass93_3478.anInt3514 + i_311_), aClass332_5461.method3749() + i);
					aClass332_5461.method3738(i_311_ + i_313_, i, (-i_315_ + -i_313_ + (this.aClass93_3478.anInt3514)), (this.aClass93_3478.anInt3504));
					int i_317_ = aClass332_5464.method3749();
					Class265.aHa1974.KA(i_311_, i + (this.aClass93_3478.anInt3504) - i_317_, (this.aClass93_3478.anInt3514 + i_311_), i - -(this.aClass93_3478.anInt3504));
					aClass332_5464.method3738(i_311_ + i_313_, (-i_317_ + (i - -(this.aClass93_3478.anInt3504))), -i_315_ + (this.aClass93_3478.anInt3514) + -i_313_, (this.aClass93_3478.anInt3504));
					Class265.aHa1974.KA(is[0], is[1], is[2], is[3]);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bia.D(" + i + ',' + i_311_ + ',' + i_312_ + ',' + bool + ')'));
		}
	}

	static final void method3969(int i, int i_318_) {
		do {
			try {
				Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(i_318_, -114, 17);
				class98_sub46_sub17.method1621(0);
				if (i >= 94)
					break;
				IncomingOpcode.aClass58_5466 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("bia.E(" + i + ',' + i_318_ + ')'));
			}
			break;
		} while (false);
	}
}
