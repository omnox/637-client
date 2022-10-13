/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92 {
	private int anInt726;
	int anInt727;
	int[] anIntArray728;
	int anInt729;
	int anInt730;
	int anInt731;
	boolean aBoolean732;
	int anInt733;
	int anInt734;
	int[] anIntArray735;
	boolean aBoolean736;
	int anInt737;
	int anInt739 = 0;
	private int anInt740;
	int anInt741;
	int anInt742;
	int anInt743;
	private int anInt744;
	int anInt745;
	int anInt746;
	short aShort747;
	private int anInt748;
	private int anInt749;
	int anInt750;
	private int anInt751;
	int anInt752;
	boolean aBoolean753;
	short aShort754;
	private int anInt755;
	int anInt756;
	int anInt757;
	int anInt758;
	boolean aBoolean759;
	int anInt760;
	int anInt761;
	int anInt762;
	short aShort763;
	int anInt764;
	int anInt765;
	int anInt766;
	private int anInt767;
	int[] anIntArray768;
	private int anInt769;
	int anInt770;
	int anInt771;
	int[] anIntArray772;
	private int anInt773;
	int anInt774;
	int anInt775;
	boolean aBoolean776;
	int anInt777;
	boolean aBoolean778;
	int anInt779;
	int anInt780;
	int anInt781;
	int anInt782;
	boolean aBoolean783;
	int anInt784;
	int anInt785;
	short aShort786;
	int anInt787;
	int anInt788;
	boolean aBoolean789;
	int anInt790;
	boolean aBoolean791;
	int anInt792;

	static final void method891(int i, int i_0_) {
		try {
			Class101.anInt849 = -1;
			Class42_Sub4.anInt5371 = i;
			Class169.anInt1307 = -1;
			if (i_0_ < -63)
				aa_Sub1.method155(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fp.F(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method892(int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 == null)
				Class265.aHa1974.method1760(i_4_, i_3_, i_2_, -16777216, (byte) -66, i_1_);
			else if (Player.selfPlayer.localXPos < 0 || ((Player.selfPlayer.localXPos) >= 512 * GameWorld.size_x) || Player.selfPlayer.localYPos < 0 || (512 * GameWorld.size_y <= Player.selfPlayer.localYPos))
				Class265.aHa1974.method1760(i_4_, i_3_, i_2_, -16777216, (byte) -66, i_1_);
			else {
				Class64_Sub15.anInt3676++;
				if (Player.selfPlayer != null && (Player.selfPlayer.localXPos - 256 * (Player.selfPlayer.getSize() + -1)) >> 9 == Class269.anInt2024 && (Class246_Sub3_Sub1_Sub2.anInt6251 == (Player.selfPlayer.localYPos - (Player.selfPlayer.getSize() * 256 + -256)) >> 9)) {
					Class246_Sub3_Sub1_Sub2.anInt6251 = -1;
					Class269.anInt2024 = -1;
					RSByteBuffer.method1216(-17470);
				}
				Class98_Sub44.method1512(true);
				if (!bool)
					ItemDefinitionList.method2716(-9627);
				Class246_Sub1.method2966(66);
				Class151_Sub3.method2453(i_2_, true, i_4_, 100, i_3_, i_1_);
				i_3_ = Class332_Sub2.anInt5421;
				i_1_ = Class151_Sub8.anInt5016;
				Class16.anInt197 = Class16.anInt199;
				i_4_ = Class215.anInt1612;
				i_2_ = Class98_Sub31_Sub2.anInt5824;
				if (Class98_Sub46_Sub20_Sub2.anInt6319 == 1) {
					int i_5_ = (int) GameWorld.cameraGetVrot;
					if (Class43.anInt372 >> 8 > i_5_)
						i_5_ = Class43.anInt372 >> 8;
					if (Class217.aBooleanArray3410[4] && (Class98_Sub10_Sub13.anIntArray5603[4] + 128 > i_5_))
						i_5_ = 128 + Class98_Sub10_Sub13.anIntArray5603[4];
					int i_6_ = 0x3fff & (Class98_Sub10_Sub9.anInt5581 + (int) GameWorld.cameraGetHrot);
					Class104.method1712(false, i_6_, 600 + ClientSettings.clientZoom * (i_5_ >> 3) << 2, Class224_Sub3_Sub1.anInt6147, i_3_, Class201.anInt1545, i_5_, -200 + (Perspective.getTileHeight(Class43.anInt377, (Player.selfPlayer.localYPos), (Player.selfPlayer.localXPos))));
				} else if (Class98_Sub46_Sub20_Sub2.anInt6319 == 4) {
					int i_7_ = (int) GameWorld.cameraGetVrot;
					if (i_7_ < Class43.anInt372 >> 8)
						i_7_ = Class43.anInt372 >> 8;
					if (Class217.aBooleanArray3410[4] && i_7_ < 128 + Class98_Sub10_Sub13.anIntArray5603[4])
						i_7_ = Class98_Sub10_Sub13.anIntArray5603[4] - -128;
					int i_8_ = (int) GameWorld.cameraGetHrot & 0x3fff;
					Class104.method1712(false, i_8_, (600 - -((i_7_ >> 3) * 3) << 2), Class224_Sub3_Sub1.anInt6147, i_3_, Class201.anInt1545, i_7_, (Perspective.getTileHeight(Class43.anInt377, Class135.anInt1051, Class98_Sub46_Sub2_Sub2.anInt6295)) - 200);
				} else if (Class98_Sub46_Sub20_Sub2.anInt6319 == 5)
					Class50.method484(i_3_, i ^ 0x5301);
				int renderX = Class98_Sub46_Sub10.renderX;
				int renderY = Class79.renderY;
				int renderZ = Class134.renderZ;
				int renderPitch = GameWorld.cameraPitch;
				int renderYaw = GameWorld.cameraYaw;
				for (int i_14_ = 0; i_14_ < 5; i_14_++) {
					if (Class217.aBooleanArray3410[i_14_]) {
						int i_15_ = (int) ((Math.random() * (double) (2 * (aa_Sub3.anIntArray3571[i_14_]) + 1)) - (double) aa_Sub3.anIntArray3571[i_14_] + (Math.sin((double) (Class212.anIntArray1597[i_14_]) * ((double) (Class98_Sub32.anIntArray4109[i_14_]) / 100.0)) * (double) (Class98_Sub10_Sub13.anIntArray5603[i_14_])));
						if (i_14_ == 3)
							GameWorld.cameraYaw = 0x3fff & GameWorld.cameraYaw + i_15_;
						if (i_14_ == 0)
							Class98_Sub46_Sub10.renderX += i_15_ << 2;
						if (i_14_ == 2)
							Class134.renderZ += i_15_ << 2;
						if (i_14_ == 4) {
							GameWorld.cameraPitch += i_15_;
							if (GameWorld.cameraPitch >= 1024) {
								if (GameWorld.cameraPitch > 3072)
									GameWorld.cameraPitch = 3072;
							} else
								GameWorld.cameraPitch = 1024;
						}
						if (i_14_ == 1)
							Class79.renderY += i_15_ << 2;
					}
				}
				if (Class98_Sub46_Sub10.renderX < 0)
					Class98_Sub46_Sub10.renderX = 0;
				if ((Class366.anInt3112 << 9) - 1 < Class98_Sub46_Sub10.renderX)
					Class98_Sub46_Sub10.renderX = (Class366.anInt3112 << 9) - 1;
				if (Class134.renderZ < 0)
					Class134.renderZ = 0;
				if (-1 + (Class64_Sub9.anInt3662 << 9) < Class134.renderZ)
					Class134.renderZ = (Class64_Sub9.anInt3662 << 9) - 1;
				if (i == 21337) {
					Class246_Sub3_Sub4_Sub1.method3025((byte) 72);
					Class329.method3708(i + -21338);
					Class265.aHa1974.KA(i_1_, i_2_, i_4_ + i_1_, i_3_ + i_2_);
					Class201.method2697(i ^ ~0x5178, true);
					if (!za_Sub2.aBoolean6079) {
						Class265.aHa1974.ya();
						int i_16_ = Class284_Sub1_Sub2.anInt6192;
						if (s_Sub1.aClass346_5202 == null)
							Class265.aHa1974.GA(i_16_);
						else
							s_Sub1.aClass346_5202.method3831(Class156_Sub1.anInt3278 << 3, GameWorld.cameraPitch, GameWorld.cameraYaw, i_2_, i + -45783, i_1_, Class265.aHa1974, i_3_, i_4_, i_16_);
					} else {
						Class156_Sub2.method2500(Class284_Sub1_Sub2.anInt6192, i + -21337);
						if (Class48_Sub2_Sub1.anInt5525 != Class16.anInt197)
							Class358.aBoolean3033 = true;
						Class48_Sub2_Sub1.anInt5525 = Class16.anInt197;
					}
					Class128.method2224(i ^ 0xbf1);
					Class266.aClass111_1986.method2093(Class98_Sub46_Sub10.renderX, Class79.renderY, Class134.renderZ, 0x3fff & -GameWorld.cameraPitch, -GameWorld.cameraYaw & 0x3fff, 0x3fff & -Class308.anInt2584);
					Class265.aHa1974.a(Class266.aClass111_1986);
					Class265.aHa1974.DA(i_1_ - -(i_4_ / 2), i_3_ / 2 + i_2_, (Class98_Sub10_Sub14.anInt5610 << 1), (Class98_Sub10_Sub14.anInt5610 << 1));
					Class260.method3208((Class98_Sub10_Sub14.anInt5610 << 1), -128, (Class98_Sub10_Sub14.anInt5610 << 1), i_2_ - -(i_3_ / 2), i_1_ + i_4_ / 2);
					Class98_Sub46_Sub6.method1548(0x3fff & -GameWorld.cameraYaw, Class79.renderY, -GameWorld.cameraPitch & 0x3fff, 0x3fff & -Class308.anInt2584, (byte) -78, Class134.renderZ, Class98_Sub46_Sub10.renderX);
					byte i_17_ = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058.method612((byte) 126) != 2 ? (byte) 1 : (byte) Class64_Sub15.anInt3676);
					if (!za_Sub2.aBoolean6079)
						Class60.method535(Class215.anInt1614, Class98_Sub46_Sub10.renderX, Class79.renderY, Class134.renderZ, OutputStream_Sub2.aByteArrayArrayArray41, Class204.anIntArray1551, Class336.anIntArray2826, Class287.anIntArray2195, Class295.anIntArray2409, IncomingMessages.anIntArray5518, 1 + (Player.selfPlayer.height_level), i_17_, (Player.selfPlayer.localXPos) >> 9, (Player.selfPlayer.localYPos) >> 9, Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063.method602((byte) 121) == 0, true, Class239.aBoolean1839 ? Class16.anInt197 : -1, 0, false);
					else {
						Class216.method2797((-GameWorld.cameraPitch & 0x3fff), 0x3fff & -Class308.anInt2584, -GameWorld.cameraYaw & 0x3fff, i + 4643);
						Class154.method2493(Class79.renderY, 1 + (Player.selfPlayer.height_level), OutputStream_Sub2.aByteArrayArrayArray41, Class16.anInt197, Class98_Sub46_Sub10.renderX, IncomingMessages.anIntArray5518, Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063.method602((byte) 126) == 0, Class204.anIntArray1551, i_17_, true, (Player.selfPlayer.localXPos) >> 9, (Player.selfPlayer.localYPos) >> 9, Class287.anIntArray2195, Class215.anInt1614, Class295.anIntArray2409, Class134.renderZ, Class336.anIntArray2826, true);
					}
					Class128.method2224(22696);
					if (Class177.anInt1376 == 10) {
						Class290.method3411(i_1_, (byte) 7, i_2_, i_3_, 256, 256, i_4_);
						Class98_Sub34.method1450(256, i_4_, i_3_, 256, (byte) -124, i_1_, i_2_);
						RenderAnimDefinitions.method3479(256, i_4_, -7957, i_3_, i_1_, i_2_, 256);
						Class98_Sub46_Sub13_Sub1.method1594(i_2_, i_1_, i_3_, i_4_, (byte) 116);
					}
					Class114.method2148();
					GameWorld.cameraYaw = renderYaw;
					Class98_Sub46_Sub10.renderX = renderX;
					Class134.renderZ = renderZ;
					GameWorld.cameraPitch = renderPitch;
					Class79.renderY = renderY;
					if (Class98_Sub10_Sub12.aBoolean5599 && Class98_Sub10_Sub38.aClass135_5765.method2261(-1) == 0)
						Class98_Sub10_Sub12.aBoolean5599 = false;
					if (Class98_Sub10_Sub12.aBoolean5599) {
						Class265.aHa1974.method1760(i_4_, i_3_, i_2_, -16777216, (byte) -66, i_1_);
						Class246_Sub2.method2972(i + -21457, Class98_Sub46_Sub10.aClass197_6019, Class195.aClass43_1499, false, Class265.aHa1974, TextResources.LOADING_PLEASE_WAIT.get_text(Class374.anInt3159));
					}
					Class201.method2697(-546, false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fp.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ')'));
		}
	}

	static final boolean method893(int i) {
		try {
			Class98_Sub19 class98_sub19 = (Class98_Sub19) Class186.aClass148_3428.method2418(32);
			if (class98_sub19 == null)
				return false;
			int i_18_ = 23 / ((12 - i) / 57);
			for (int i_19_ = 0; (i_19_ < class98_sub19.anInt3960); i_19_++) {
				if ((class98_sub19.aClass143Array3962[i_19_] != null) && (class98_sub19.aClass143Array3962[i_19_].anInt1163) == 0)
					return false;
				if ((class98_sub19.aClass143Array3961[i_19_] != null) && (class98_sub19.aClass143Array3961[i_19_].anInt1163) == 0)
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fp.B(" + i + ')');
		}
	}

	final void method894(int i, RSByteBuffer class98_sub22) {
		do {
			try {
				for (;;) {
					int i_20_ = class98_sub22.readUnsignedByte();
					if (i_20_ == 0)
						break;
					method895(class98_sub22, i_20_, (byte) -112);
				}
				if (i < -20)
					break;
				method892(113, 42, 109, 50, true, -116);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fp.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method895(RSByteBuffer class98_sub22, int i, byte i_21_) {
		try {
			if (i == 1) {
				this.aShort747 = (short) class98_sub22.readShort();
				this.aShort786 = (short) class98_sub22.readShort();
				this.aShort763 = (short) class98_sub22.readShort();
				this.aShort754 = (short) class98_sub22.readShort();
				int i_22_ = 3;
				this.aShort763 <<= i_22_;
				this.aShort786 <<= i_22_;
				this.aShort747 <<= i_22_;
				this.aShort754 <<= i_22_;
			} else if (i == 2)
				class98_sub22.readUnsignedByte();
			else if (i == 3) {
				this.anInt770 = class98_sub22.readInt(-2);
				this.anInt731 = class98_sub22.readInt(-2);
			} else if (i != 4) {
				if (i == 5)
					this.anInt780 = this.anInt788 = (class98_sub22.readShort() << -577553204 << 1586483106);
				else if (i != 6) {
					if (i == 7) {
						this.anInt766 = class98_sub22.readShort();
						this.anInt787 = class98_sub22.readShort();
					} else if (i != 8) {
						if (i == 9) {
							int i_23_ = class98_sub22.readUnsignedByte();
							this.anIntArray728 = new int[i_23_];
							for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
								this.anIntArray728[i_24_] = class98_sub22.readShort();
						} else if (i == 10) {
							int i_25_ = class98_sub22.readUnsignedByte();
							this.anIntArray772 = new int[i_25_];
							for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
								this.anIntArray772[i_26_] = class98_sub22.readShort();
						} else if (i != 12) {
							if (i == 13)
								this.anInt782 = class98_sub22.readSignedByte();
							else if (i == 14)
								this.anInt784 = class98_sub22.readShort();
							else if (i == 15)
								this.anInt729 = class98_sub22.readShort();
							else if (i != 16) {
								if (i == 17)
									this.anInt764 = class98_sub22.readShort();
								else if (i != 18) {
									if (i == 19)
										this.anInt752 = class98_sub22.readUnsignedByte();
									else if (i == 20)
										anInt773 = class98_sub22.readUnsignedByte();
									else if (i == 21)
										anInt767 = class98_sub22.readUnsignedByte();
									else if (i != 22) {
										if (i == 23)
											anInt748 = class98_sub22.readUnsignedByte();
										else if (i == 24)
											this.aBoolean759 = false;
										else if (i != 25) {
											if (i != 26) {
												if (i != 27) {
													if (i == 28)
														anInt749 = (class98_sub22.readUnsignedByte());
													else if (i != 29) {
														if (i != 30) {
															if (i == 31) {
																this.anInt780 = ((class98_sub22.readShort()) << -1910098324 << 660699586);
																this.anInt788 = ((class98_sub22.readShort()) << 1930543596 << 296157090);
															} else if (i != 32) {
																if (i == 33)
																	this.aBoolean789 = true;
																else if (i == 34)
																	this.aBoolean776 = false;
															} else
																this.aBoolean778 = false;
														} else
															this.aBoolean791 = true;
													} else
														class98_sub22.readUShort(false);
												} else
													this.anInt775 = ((class98_sub22.readShort()) << -1135326388 << 1935821730);
											} else
												this.aBoolean753 = false;
										} else {
											int i_27_ = class98_sub22.readUnsignedByte();
											this.anIntArray735 = new int[i_27_];
											for (int i_28_ = 0; (i_28_ < i_27_); i_28_++)
												this.anIntArray735[i_28_] = (class98_sub22.readShort());
										}
									} else
										this.anInt745 = class98_sub22.readInt(-2);
								} else
									this.anInt760 = class98_sub22.readInt(-2);
							} else {
								this.aBoolean732 = class98_sub22.readUnsignedByte() == 1;
								this.anInt746 = class98_sub22.readShort();
								this.anInt762 = class98_sub22.readShort();
								this.aBoolean783 = (class98_sub22.readUnsignedByte() == 1);
							}
						} else
							this.anInt774 = class98_sub22.readSignedByte();
					} else {
						this.anInt750 = class98_sub22.readShort();
						this.anInt790 = class98_sub22.readShort();
					}
				} else {
					anInt726 = class98_sub22.readInt(-2);
					anInt744 = class98_sub22.readInt(-2);
				}
			} else {
				this.anInt739 = class98_sub22.readUnsignedByte();
				this.anInt792 = class98_sub22.readSignedByte();
			}
			if (i_21_ >= -101)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fp.C(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_21_ + ')'));
		}
	}

	public static void method896(int i) {
		try {
			if (i != -1025810040)
				method891(-100, -83);
			IncomingOpcode.currentIncommingOpcode = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fp.G(" + i + ')');
		}
	}

	final void method897(byte i) {
		do {
			try {
				if (this.anInt774 > -2 || this.anInt782 > -2)
					this.aBoolean736 = true;
				this.anInt741 = (anInt726 & 0xffc52c) >> 16;
				anInt751 = 0xff & anInt744 >> 16;
				this.anInt730 = -this.anInt741 + anInt751;
				anInt740 = (0xff9a & anInt744) >> 8;
				this.anInt757 = (anInt726 & 0xff64) >> 8;
				this.anInt734 = -this.anInt757 + anInt740;
				this.anInt771 = anInt726 & 0xff;
				anInt755 = 0xff & anInt744;
				anInt769 = 0xff & anInt744 >> 24;
				if (i > 56) {
					this.anInt737 = anInt755 - this.anInt771;
					this.anInt756 = anInt726 >> 24 & 0xff;
					this.anInt765 = -this.anInt756 + anInt769;
					if (this.anInt760 != 0) {
						this.anInt761 = anInt773 * this.anInt787 / 100;
						this.anInt758 = this.anInt787 * anInt767 / 100;
						if (this.anInt761 == 0)
							this.anInt761 = 1;
						this.anInt743 = ((-this.anInt741 + (-(this.anInt730 / 2) + (this.anInt760 >> 16 & 0xff))) << 8) / this.anInt761;
						this.anInt733 = ((-(this.anInt734 / 2) + -this.anInt757 + (this.anInt760 >> 8 & 0xff)) << 8) / this.anInt761;
						this.anInt727 = ((-this.anInt771 + (-(this.anInt737 / 2) + (0xff & this.anInt760))) << 8) / this.anInt761;
						if (this.anInt758 == 0)
							this.anInt758 = 1;
						Class92 class92_29_ = this;
						class92_29_.anInt743 = (class92_29_.anInt743 + ((this.anInt743 <= 0) ? 4 : -4));
						Class92 class92_30_ = this;
						class92_30_.anInt733 = (class92_30_.anInt733 + (this.anInt733 <= 0 ? 4 : -4));
						Class92 class92_31_ = this;
						class92_31_.anInt727 = (class92_31_.anInt727 + (this.anInt727 <= 0 ? 4 : -4));
						this.anInt779 = (((this.anInt760 >> 24 & 0xff) - (this.anInt765 / 2 + this.anInt756)) << 8) / this.anInt758;
						Class92 class92_32_ = this;
						class92_32_.anInt779 = (class92_32_.anInt779 + (this.anInt779 <= 0 ? 4 : -4));
					}
					if (this.anInt775 != -1) {
						this.anInt777 = anInt749 * this.anInt787 / 100;
						if (this.anInt777 == 0)
							this.anInt777 = 1;
						this.anInt742 = ((-this.anInt780 + (-((this.anInt788 - this.anInt780) / 2) + this.anInt775)) / this.anInt777);
					}
					if (this.anInt745 == -1)
						break;
					this.anInt785 = this.anInt787 * anInt748 / 100;
					if (this.anInt785 == 0)
						this.anInt785 = 1;
					this.anInt781 = ((this.anInt745 - (-this.anInt770 + this.anInt731) / 2 - this.anInt770) / this.anInt785);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fp.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method898(boolean bool, byte[][] is, Map class305_sub1) {
		try {
			if (bool != false)
				method892(70, -39, 115, -109, false, -73);
			int i = client.aByteArrayArray3551.length;
			for (int i_33_ = 0; i > i_33_; i_33_++) {
				byte[] is_34_ = is[i_33_];
				if (is_34_ != null) {
					int i_35_ = ((Class121.anIntArray1006[i_33_] >> 8) * 64 - Class272.anInt2038);
					int i_36_ = (-aa_Sub2.anInt3562 + 64 * (Class121.anIntArray1006[i_33_] & 0xff));
					Class128.method2224(22696);
					class305_sub1.method3591(Class167.aClass243Array1281, i_36_, (byte) -19, is_34_, Class265.aHa1974, i_35_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fp.E(" + bool + ',' + (is != null ? "{...}" : "null") + ',' + (class305_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class92() {
		this.anInt729 = -1;
		anInt749 = 100;
		anInt748 = 100;
		this.aBoolean732 = true;
		this.aBoolean753 = true;
		this.anInt764 = -1;
		this.aBoolean736 = false;
		this.anInt762 = -1;
		this.aBoolean759 = true;
		this.anInt752 = 0;
		anInt773 = 100;
		this.aBoolean778 = true;
		this.anInt774 = -2;
		this.anInt745 = -1;
		this.anInt784 = 0;
		this.anInt746 = -1;
		this.anInt775 = -1;
		this.anInt782 = -2;
		anInt767 = 100;
		this.aBoolean776 = true;
		this.aBoolean783 = true;
		this.aBoolean791 = false;
		this.aBoolean789 = false;
	}
}
