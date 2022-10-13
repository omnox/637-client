/* Class246_Sub3_Sub4_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Mobile {
	int anInt6512 = -1;
	private byte titleId;
	int anInt6514;
	int skull_id = -1;
	int anInt6517 = -1;
	PlayerAppearance appearance;
	int playerCbLevel;
	boolean aBoolean6520;
	int anInt6521;
	int anInt6522;
	boolean cursed_orb_id;
	int anInt6524;
	int ambientSoundHearDistance;
	boolean hasDisplayName;
	int anInt6527;
	int team;
	private int basTypeId;
	int headicon_id;
	private byte genderId;
	boolean aBoolean6532;
	static byte[][] aByteArrayArray6533;
	boolean aBoolean6534;
	int combatRange;
	String name;
	String displayName;
	private byte name_title_id;
	int skillLevel;
	static boolean aBoolean6540 = false;
	int anInt6541;
	int combatLevelWithSummoning;
	static int rights = 0;
	static Player selfPlayer;
	static Class196 aClass196_6543;

	final boolean method3055(byte i) {
		try {
			if (this.appearance == null)
				return false;
			if (i != 106)
				this.aBoolean6534 = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.WA(" + i + ')');
		}
	}

	final void method3056(byte i, int i_0_, int i_1_, int i_2_) {
		try {
			if (this.anInt6434 < 9)
				this.anInt6434++;
			for (int i_3_ = this.anInt6434; i_3_ > 0; i_3_--) {
				this.walkQueueX[i_3_] = (this.walkQueueX[-1 + i_3_]);
				this.walkQueueZ[i_3_] = (this.walkQueueZ[i_3_ - 1]);
				this.aByteArray6443[i_3_] = (this.aByteArray6443[i_3_ - 1]);
			}
			this.walkQueueX[0] = i_2_;
			this.walkQueueZ[0] = i_1_;
			if (i_0_ != 1)
				method3064(-126);
			this.aByteArray6443[0] = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.NA(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method3057(int i, int i_4_, byte i_5_, int i_6_) {
		try {
			if (this.anInt6413 != -1 && Class151_Sub7.aClass183_5001.method2623(this.anInt6413, 16383).anInt816 == 1) {
				this.anInt6413 = -1;
				this.anIntArray6373 = null;
			}
			if (this.anInt6379 != i_6_) {
				Class107 class107 = (Class196.aClass304_1509.method3564(i_6_ + 3, this.anInt6379));
				if (class107.aBoolean909 && class107.anInt910 != -1 && (Class151_Sub7.aClass183_5001.method2623((class107.anInt910), 16383).anInt816) == 1)
					this.anInt6379 = -1;
			}
			if (this.anInt6365 != -1) {
				Class107 class107 = (Class196.aClass304_1509.method3564(2, this.anInt6365));
				if (class107.aBoolean909 && class107.anInt910 != -1 && (Class151_Sub7.aClass183_5001.method2623((class107.anInt910), 16383).anInt816) == 1)
					this.anInt6365 = -1;
			}
			this.anInt6512 = -1;
			if (i < 0 || i >= GameWorld.size_x || i_4_ < 0 || i_4_ >= GameWorld.size_y)
				method3060(i_4_, i, 1470);
			else if (this.walkQueueX[0] >= 0 && GameWorld.size_x > this.walkQueueX[0] && this.walkQueueZ[0] >= 0 && (GameWorld.size_y > this.walkQueueZ[0])) {
				if (i_5_ == 2)
					Class363.method3930(false, (byte) 2, this, i_4_, i);
				method3056(i_5_, 1, i_4_, i);
			} else
				method3060(i_4_, i, 1470);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.LA(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	private final boolean method3058(byte i, ha var_ha, int i_7_) {
		try {
			int i_8_ = i_7_;
			RenderAnimDefinitions class294 = this.getRenderAnimation(1);
			Class97 class97 = ((this.anInt6413 == -1 || this.anInt6400 != 0) ? null : (Class151_Sub7.aClass183_5001.method2623(this.anInt6413, 16383)));
			int i_9_ = -13 / ((-32 - i) / 57);
			Class97 class97_10_ = ((this.anInt6385 == -1 || this.aBoolean6520 || (this.aBoolean6359 && class97 != null)) ? null : (Class151_Sub7.aClass183_5001.method2623(this.anInt6385, 16383)));
			int i_11_ = class294.anInt2362;
			int i_12_ = class294.anInt2382;
			if (i_11_ != 0 || i_12_ != 0 || class294.anInt2393 != 0 || class294.anInt2363 != 0)
				i_7_ |= 0x7;
			int i_13_ = this.aClass325_6399.method3698((byte) 116);
			boolean bool = (this.aByte6422 != 0 && (Class215.anInt1614 >= this.anInt6403) && (Class215.anInt1614 < this.anInt6349));
			if (bool)
				i_7_ |= 0x80000;
			AbstractModel class146 = (this.aClass146Array6441[0] = (this.appearance.method3628(Class370.aClass257_3136, class97, class97_10_, Class151_Sub7.aClass183_5001, this.anInt6393, ParamType.aClass83_1205, this.anIntArray6370, Class98_Sub46_Sub19.getItemDefs, true, this.anInt6409, this.aClass226Array6387, Class4.aClass301_85, Class75.aClass140_584, true, i_7_, this.anInt6419, this.anInt6366, this.anInt6361, this.anInt6350, i_13_, var_ha)));
			int i_14_ = Class52.method488(true);
			if (Class292.anInt3359 < 96 && i_14_ > 50)
				Class206.method2727(89);
			if (Class43.aClass196_375 == Class64_Sub29.aClass196_3720 || i_14_ >= 50) {
				if (Class64_Sub29.aClass196_3720 != Class43.aClass196_375) {
					Class98_Sub48.anInt4281 = 0;
					Class76.aByteArrayArray590 = new byte[50][];
				}
			} else {
				int i_15_;
				for (i_15_ = -i_14_ + 50; (Class98_Sub48.anInt4281 < i_15_); Class98_Sub48.anInt4281++)
					Class76.aByteArrayArray590[Class98_Sub48.anInt4281] = new byte[102400];
				while (i_15_ < Class98_Sub48.anInt4281) {
					Class98_Sub48.anInt4281--;
					Class76.aByteArrayArray590[Class98_Sub48.anInt4281] = null;
				}
			}
			if (class146 == null)
				return false;
			this.anInt6352 = class146.fa();
			this.anInt6354 = class146.ma();
			this.method3046(758, class146);
			if (i_11_ != 0 || i_12_ != 0) {
				this.method3040(false, class294.anInt2360, i_11_, i_12_, i_13_, class294.anInt2391);
				if (this.anInt6388 != 0)
					class146.FA(this.anInt6388);
				if (this.anInt6377 != 0)
					class146.VA(this.anInt6377);
				if (this.anInt6416 != 0)
					class146.H(0, this.anInt6416, 0);
			} else
				this.method3040(false, 0, getSize() << 9, getSize() << 9, i_13_, 0);
			if (bool)
				class146.method2337(this.aByte6404, this.aByte6381, this.aByte6368, 0xff & (this.aByte6422));
			if (!this.aBoolean6520 && this.anInt6379 != -1 && (this.anInt6376 != -1)) {
				Class107 class107 = (Class196.aClass304_1509.method3564(2, this.anInt6379));
				boolean bool_16_ = (class107.aByte923 == 3 && (i_11_ != 0 || i_12_ != 0));
				int i_17_ = i_8_;
				if (!bool_16_) {
					if (this.anInt6389 != 0)
						i_17_ |= 0x5;
					if (this.anInt6382 != 0)
						i_17_ |= 0x2;
					if (this.anInt6410 >= 0)
						i_17_ |= 0x7;
				} else
					i_17_ |= 0x7;
				AbstractModel class146_18_ = (this.aClass146Array6441[1] = (class107.method1728(this.anInt6376, Class151_Sub7.aClass183_5001, i_17_, this.anInt6396, (byte) -95, this.anInt6367, var_ha)));
				if (class146_18_ != null) {
					if (this.anInt6410 >= 0 && class294.anIntArrayArray2366 != null && ((class294.anIntArrayArray2366[this.anInt6410]) != null)) {
						int i_19_ = 0;
						int i_20_ = 0;
						int i_21_ = 0;
						if (class294.anIntArrayArray2366 != null && ((class294.anIntArrayArray2366[this.anInt6410]) != null)) {
							i_21_ += (class294.anIntArrayArray2366[(this.anInt6410)][2]);
							i_19_ += (class294.anIntArrayArray2366[(this.anInt6410)][0]);
							i_20_ += (class294.anIntArrayArray2366[(this.anInt6410)][1]);
						}
						if (class294.anIntArrayArray2364 != null && ((class294.anIntArrayArray2364[this.anInt6410]) != null)) {
							i_21_ += (class294.anIntArrayArray2364[(this.anInt6410)][2]);
							i_19_ += (class294.anIntArrayArray2364[(this.anInt6410)][0]);
							i_20_ += (class294.anIntArrayArray2364[(this.anInt6410)][1]);
						}
						if (i_21_ != 0 || i_19_ != 0) {
							int i_22_ = i_13_;
							if ((this.anIntArray6370) != null && (this.anIntArray6370[(this.anInt6410)]) != -1)
								i_22_ = (this.anIntArray6370[(this.anInt6410)]);
							int i_23_ = (0x3fff & i_22_ + ((this.anInt6389) * 2048 + -i_13_));
							if (i_23_ != 0)
								class146_18_.a(i_23_);
							int i_24_ = Class284_Sub2_Sub2.anIntArray6200[i_23_];
							int i_25_ = Class284_Sub2_Sub2.anIntArray6202[i_23_];
							int i_26_ = i_25_ * i_19_ + i_24_ * i_21_ >> 14;
							i_21_ = (i_21_ * i_25_ + -(i_19_ * i_24_) >> 14);
							i_19_ = i_26_;
						}
						class146_18_.H(i_19_, i_20_, i_21_);
					} else if (this.anInt6389 != 0)
						class146_18_.a(2048 * (this.anInt6389));
					if (this.anInt6382 != 0)
						class146_18_.H(0, -(this.anInt6382) << 2, 0);
					if (bool_16_) {
						if (this.anInt6388 != 0)
							class146_18_.FA(this.anInt6388);
						if (this.anInt6377 != 0)
							class146_18_.VA(this.anInt6377);
						if (this.anInt6416 != 0)
							class146_18_.H(0, (this.anInt6416), 0);
					}
				}
			} else
				this.aClass146Array6441[1] = null;
			if (this.aBoolean6520 || this.anInt6365 == -1 || (this.anInt6428 == -1))
				this.aClass146Array6441[2] = null;
			else {
				Class107 class107 = (Class196.aClass304_1509.method3564(2, this.anInt6365));
				boolean bool_27_ = (class107.aByte923 == 3 && (i_11_ != 0 || i_12_ != 0));
				int i_28_ = i_8_;
				if (!bool_27_) {
					if (this.anInt6360 != 0)
						i_28_ |= 0x5;
					if (this.anInt6363 != 0)
						i_28_ |= 0x2;
					if (this.anInt6353 >= 0)
						i_28_ |= 0x7;
				} else
					i_28_ |= 0x7;
				AbstractModel class146_29_ = (this.aClass146Array6441[2] = (class107.method1721(var_ha, this.anInt6421, 21945, i_28_, Class151_Sub7.aClass183_5001, this.anInt6427, this.anInt6428)));
				if (class146_29_ != null) {
					if (this.anInt6353 < 0 || class294.anIntArrayArray2366 == null || ((class294.anIntArrayArray2366[this.anInt6353]) == null)) {
						if (this.anInt6360 != 0)
							class146_29_.a(2048 * this.anInt6360);
					} else {
						int i_30_ = 0;
						int i_31_ = 0;
						int i_32_ = 0;
						if (class294.anIntArrayArray2366 != null && ((class294.anIntArrayArray2366[this.anInt6353]) != null)) {
							i_32_ += (class294.anIntArrayArray2366[(this.anInt6353)][2]);
							i_31_ += (class294.anIntArrayArray2366[(this.anInt6353)][1]);
							i_30_ += (class294.anIntArrayArray2366[(this.anInt6353)][0]);
						}
						if (class294.anIntArrayArray2364 != null && ((class294.anIntArrayArray2364[this.anInt6353]) != null)) {
							i_32_ += (class294.anIntArrayArray2364[(this.anInt6353)][2]);
							i_31_ += (class294.anIntArrayArray2364[(this.anInt6353)][1]);
							i_30_ += (class294.anIntArrayArray2364[(this.anInt6353)][0]);
						}
						if (i_32_ != 0 || i_30_ != 0) {
							int i_33_ = i_13_;
							if ((this.anIntArray6370) != null && (this.anIntArray6370[(this.anInt6353)]) != -1)
								i_33_ = (this.anIntArray6370[(this.anInt6353)]);
							int i_34_ = 0x3fff & -i_13_ + (this.anInt6360 * 2048 - -i_33_);
							if (i_34_ != 0)
								class146_29_.a(i_34_);
							int i_35_ = Class284_Sub2_Sub2.anIntArray6200[i_34_];
							int i_36_ = Class284_Sub2_Sub2.anIntArray6202[i_34_];
							int i_37_ = i_30_ * i_36_ + i_35_ * i_32_ >> 14;
							i_32_ = i_36_ * i_32_ - i_35_ * i_30_ >> 14;
							i_30_ = i_37_;
						}
						class146_29_.H(i_30_, i_31_, i_32_);
					}
					if (this.anInt6363 != 0)
						class146_29_.H(0, -(this.anInt6363) << 2, 0);
					if (bool_27_) {
						if (this.anInt6388 != 0)
							class146_29_.FA(this.anInt6388);
						if (this.anInt6377 != 0)
							class146_29_.VA(this.anInt6377);
						if (this.anInt6416 != 0)
							class146_29_.H(0, (this.anInt6416), 0);
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.IA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_7_ + ')'));
		}
	}

	final boolean method2982(byte i) {
		try {
			if (i >= -70)
				aClass196_6543 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.HA(" + i + ')');
		}
	}

	final String method3059(int i, boolean bool) {
		try {
			if (i != -1)
				method2992((byte) 110);
			if (bool)
				return this.name;
			return this.displayName;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.JA(" + i + ',' + bool + ')');
		}
	}

	final void method3060(int i, int i_38_, int i_39_) {
		do {
			try {
				this.walkQueueX[0] = i_38_;
				this.anInt6433 = 0;
				this.anInt6436 = 0;
				this.anInt6434 = 0;
				if (i_39_ != 1470)
					name_title_id = (byte) -42;
				this.walkQueueZ[0] = i;
				int i_40_ = getSize();
				this.localXPos = (512 * this.walkQueueX[0] + 256 * i_40_);
				this.localYPos = i_40_ * 256 + (this.walkQueueZ[0]) * 512;
				if (Player.selfPlayer == this)
					Class374.method3980((byte) 126);
				if (this.aClass246_Sub5_6439 == null)
					break;
				this.aClass246_Sub5_6439.method3127();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gv.VA(" + i + ',' + i_38_ + ',' + i_39_ + ')'));
			}
			break;
		} while (false);
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				return null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3061(ha var_ha, int i, int i_41_, int i_42_, boolean bool, Class111 class111, int i_43_, int i_44_, AbstractModel class146) {
		do {
			try {
				int i_45_ = i * i + i_42_ * i_42_;
				if (i_45_ >= 262144 && i_45_ <= i_43_) {
					if (bool != true)
						method3030((byte) 44);
					int i_46_ = 0x3fff & (int) (2607.5945876176133 * Math.atan2(i_42_, i));
					AbstractModel class146_47_ = (Class98_Sub10_Sub16.method1052(this.anInt6377, i_46_, this.anInt6388, var_ha, i_44_, 106, this.anInt6416));
					if (class146_47_ == null)
						break;
					var_ha.C(false);
					class146_47_.method2329(class111, null, i_41_, 0);
					var_ha.C(true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gv.AB(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_41_ + ',' + i_42_ + ',' + bool + ',' + (class111 != null ? "{...}" : "null") + ',' + i_43_ + ',' + i_44_ + ',' + (class146 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void decodeAppearence(RSByteBuffer stream, byte i) {
		do {
			try {
				stream.position = 0;
				int bitPackedInfo = stream.readUnsignedByte();
				genderId = (byte) (0x1 & bitPackedInfo);
				boolean bool = this.hasDisplayName;
				this.hasDisplayName = (bitPackedInfo & 0x2) != 0;
				boolean bool_49_ = (0x4 & bitPackedInfo) != 0;
				int i_50_ = super.getSize();
				this.method3045((byte) 68, 1 + (0x7 & bitPackedInfo >> 3));
				titleId = (byte) (bitPackedInfo >> 6 & 0x3);
				this.localXPos += -i_50_ + getSize() << 8;
				this.localYPos += getSize() - i_50_ << 8;
				name_title_id = stream.readSignedByte();
				this.skull_id = stream.readSignedByte();
				this.headicon_id = stream.readSignedByte();
				this.cursed_orb_id = stream.readSignedByte() == 1;
				if (Class64_Sub29.aClass196_3720 == Class43.aClass196_375 && Player.rights >= 2)
					this.cursed_orb_id = false;
				int npcId = -1;
				this.team = 0;
				int[] is = new int[12];
				for (int i_52_ = 0; i_52_ < 12; i_52_++) {
					int i_53_ = stream.readUnsignedByte();
					if (i_53_ == 0)
						is[i_52_] = 0;
					else {
						int i_54_ = stream.readUnsignedByte();
						int i_55_ = (i_53_ << 8) + i_54_;
						if (i_52_ == 0 && i_55_ == 65535) {
							npcId = stream.readShort();
							this.team = stream.readUnsignedByte();
							break;
						}
						if (i_55_ >= 32768) {
							i_55_ = Class255.anIntArray3207[-32768 + i_55_];
							is[i_52_] = Class41.method366(1073741824, i_55_);
							int i_56_ = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_55_).team);
							if (i_56_ != 0)
								this.team = i_56_;
						} else
							is[i_52_] = Class41.method366(-2147483648, i_55_ + -256);
					}
				}
				int[] colours = new int[5];
				for (int i_58_ = 0; i_58_ < 5; i_58_++) {
					int i_59_ = stream.readUnsignedByte();
					if ((Class61.aShortArrayArrayArray478.length < 1) || i_59_ < 0 || (Class61.aShortArrayArrayArray478[0][i_58_].length <= i_59_))
						i_59_ = 0;
					colours[i_58_] = i_59_;
				}
				basTypeId = stream.readShort();
				this.name = stream.readString();
				this.displayName = this.name;
				if (this == Player.selfPlayer)
					Class256_Sub1.aString5157 = this.name;
				this.playerCbLevel = stream.readUnsignedByte();
				if (!bool_49_) {
					this.skillLevel = 0;
					this.combatLevelWithSummoning = stream.readUnsignedByte();
					this.combatRange = stream.readUnsignedByte();
					if (this.combatRange == 255)
						this.combatRange = -1;
				} else {
					this.skillLevel = stream.readShort();
					this.combatRange = -1;
					this.combatLevelWithSummoning = this.playerCbLevel;
					if (this.skillLevel == 65535)
						this.skillLevel = -1;
				}
				int i_60_ = this.ambientSoundHearDistance;
				this.ambientSoundHearDistance = stream.readUnsignedByte();
				if (this.ambientSoundHearDistance == 0)
					Class213.removePlayerAmbientSound(true, this);
				else {
					int i_61_ = this.anInt6527;
					int i_62_ = this.anInt6524;
					int i_63_ = this.anInt6522;
					int i_64_ = this.anInt6517;
					int i_65_ = this.anInt6514;
					this.anInt6527 = stream.readShort();
					this.anInt6524 = stream.readShort();
					this.anInt6522 = stream.readShort();
					this.anInt6517 = stream.readShort();
					this.anInt6514 = stream.readUnsignedByte();
					if (!bool != !(this.hasDisplayName) || (i_60_ != this.ambientSoundHearDistance) || (i_61_ != this.anInt6527) || (i_62_ != this.anInt6524) || (i_63_ != this.anInt6522) || (i_64_ != this.anInt6517) || (this.anInt6514 != i_65_))
						Class322.method3674(0, this);
				}
				if (this.appearance == null)
					this.appearance = new PlayerAppearance();
				int tempNpcId = (this.appearance.anInt2684);
				int[] tempColours = (this.appearance.anIntArray2683);
				this.appearance.method3627(is, -59, genderId == 1, colours, method3030((byte) 70), npcId);
				if (i == 73) {
					if (tempNpcId != npcId) {
						this.localXPos = (((this.walkQueueX[0]) << 9) - -(getSize() << 8));
						this.localYPos = (((this.walkQueueZ[0]) << 9) - -(getSize() << 8));
					}
					if (za_Sub2.anInt6080 == this.anInt6369 && tempColours != null) {
						for (int i_68_ = 0; colours.length > i_68_; i_68_++) {
							if (colours[i_68_] != tempColours[i_68_]) {
								Class98_Sub46_Sub19.getItemDefs.method2717(i + -9);
								break;
							}
						}
					}
					if (this.aClass246_Sub5_6439 != null)
						this.aClass246_Sub5_6439.method3127();
					if (this.anInt6385 == -1 || !this.aBoolean6359)
						break;
					RenderAnimDefinitions class294 = this.getRenderAnimation(1);
					if (class294.method3480((byte) 119, (this.anInt6385)))
						break;
					this.aBoolean6359 = false;
					this.anInt6385 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gv.SA(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_69_, ha var_ha, int i_70_, int i_71_) {
		try {
			int i_72_ = -110 % ((15 - i) / 55);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_69_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_70_ + ',' + i_71_ + ')'));
		}
	}

	final boolean method2976(int i, ha var_ha, byte i_73_, int i_74_) {
		try {
			if (this.appearance == null || !method3058((byte) -105, var_ha, 131072))
				return false;
			Class111 class111 = var_ha.method1793();
			int i_75_ = this.aClass325_6399.method3698((byte) 116);
			class111.method2101(i_75_);
			class111.method2106(this.localXPos, this.anInt5089, this.localYPos);
			boolean bool = false;
			for (int i_76_ = 0; (this.aClass146Array6441.length > i_76_); i_76_++) {
				if ((this.aClass146Array6441[i_76_] != null) && (Class239.aBoolean1839 ? (this.aClass146Array6441[i_76_].method2333(i, i_74_, class111, true, 0, Class16.anInt197)) : this.aClass146Array6441[i_76_].method2339(i, i_74_, class111, true, 0))) {
					bool = true;
					break;
				}
			}
			if (i_73_ < 59)
				this.aBoolean6534 = true;
			this.aClass146Array6441[0] = this.aClass146Array6441[1] = this.aClass146Array6441[2] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_73_ + ',' + i_74_ + ')'));
		}
	}

	final String method3063(int i, boolean bool) {
		try {
			String string = "";
			if (i != 0)
				return null;
			if (Class116.aStringArray966 != null)
				string += Class116.aStringArray966[titleId];
			int[] is;
			if (genderId == 1 && Class35.anIntArray333 != null)
				is = Class35.anIntArray333;
			else
				is = Class272.anIntArray2036;
			if (is != null && is[titleId] != -1) {
				Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(is[titleId], 1028602529);
				if (class306.aChar2567 == 115)
					string += class306.method3594(name_title_id & 0xff, (byte) 37);
				else {
					Map.method3585(new Throwable(), i + -126, "gdn1");
					is[titleId] = -1;
				}
			}
			if (!bool)
				string += this.displayName;
			else
				string += this.name;
			if (Class84.aStringArray636 != null)
				string += Class84.aStringArray636[titleId];
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.PA(" + i + ',' + bool + ')');
		}
	}

	final int method3035(int i) {
		try {
			if (i != 28213)
				decodeAppearence(null, (byte) -78);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.T(" + i + ')');
		}
	}

	final void method2988(ha var_ha, int i) {
		try {
			if (this.appearance != null && (this.aBoolean6440 || method3058((byte) 35, var_ha, 0))) {
				Class111 class111 = var_ha.method1793();
				class111.method2101(this.aClass325_6399.method3698((byte) 116));
				class111.method2106(this.localXPos, this.anInt5089 + -5, this.localYPos);
				int i_77_ = 120 % ((i - 53) / 46);
				this.method3036(var_ha, this.aBoolean6440, (byte) -126, class111, (this.aClass146Array6441));
				this.aClass146Array6441[0] = this.aClass146Array6441[1] = this.aClass146Array6441[2] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int getSize() {
		try {
			if (this.appearance != null && this.appearance.anInt2684 != -1)
				return (Class4.aClass301_85.method3538(this.appearance.anInt2684).anInt1112);
			return super.getSize();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.A(");
		}
	}

	public static void method3064(int i) {
		try {
			if (i != -2485)
				method3064(-115);
			aClass196_6543 = null;
			aByteArrayArray6533 = null;
			IncomingOpcode.aClass58_6516 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.OA(" + i + ')');
		}
	}

	final void method2992(byte i) {
		try {
			if (i != -73)
				method3035(16);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.DA(" + i + ')');
		}
	}

	static final void method3065(int i, int i_78_, boolean bool) {
		try {
			Class28 class28 = Class76.aClass28ArrayArray586[i][i_78_];
			if (bool == true) {
				if (class28 != null) {
					Class48.anInt410 = class28.anInt284;
					InputStream_Sub2.anInt29 = class28.anInt282;
					OutputStream_Sub2.anInt40 = class28.anInt292;
				}
				Class230.method2870((byte) -74);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.UA(" + i + ',' + i_78_ + ',' + bool + ')'));
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			if (this.appearance == null || !method3058((byte) -122, var_ha, 2048))
				return null;
			Class111 class111 = var_ha.method1793();
			int i_79_ = this.aClass325_6399.method3698((byte) 116);
			class111.method2101(i_79_);
			Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[this.height_level][(this.localXPos >> Class151_Sub8.anInt5015)][(this.localYPos >> Class151_Sub8.anInt5015)]);
			if (class172 == null || class172.aClass246_Sub3_Sub1_1332 == null)
				this.anInt6351 -= ((float) this.anInt6351 / 10.0F);
			else {
				int i_80_ = (this.anInt6351 - (class172.aClass246_Sub3_Sub1_1332.aShort6149));
				this.anInt6351 -= (float) i_80_ / 10.0F;
			}
			class111.method2106(this.localXPos, (-this.anInt6351 + this.anInt5089 + -20), this.localYPos);
			Class246_Sub1 class246_sub1 = null;
			if (i > -12)
				return null;
			this.aBoolean6442 = false;
			if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035.method662((byte) 120) == 1) {
				RenderAnimDefinitions class294 = this.getRenderAnimation(1);
				if (class294.aBoolean2400 && (this.appearance.anInt2684 == -1 || Class4.aClass301_85.method3538((this.appearance.anInt2684)).aBoolean1130)) {
					Class97 class97 = ((this.anInt6413 != -1 && this.anInt6400 == 0) ? (Class151_Sub7.aClass183_5001.method2623(this.anInt6413, 16383)) : null);
					Class97 class97_81_ = ((this.anInt6385 == -1 || (this.aBoolean6520) || (this.aBoolean6359 && class97 != null)) ? null : (Class151_Sub7.aClass183_5001.method2623(this.anInt6385, 16383)));
					AbstractModel class146 = (Class102.method1703(class97_81_ == null ? class97 : class97_81_, this.anInt6377, 1, 240, (this.aClass146Array6441[0]), this.anInt6388, i_79_, 124, 160, 0, (class97_81_ == null ? this.anInt6393 : this.anInt6350), var_ha, 0, this.anInt6416));
					if (class146 != null) {
						class246_sub1 = (Class94.method915(1 + (this.aClass146Array6441).length, (byte) -47, true));
						this.aBoolean6442 = true;
						var_ha.C(false);
						if (Class239.aBoolean1839)
							class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[(this.aClass146Array6441).length]), Class16.anInt197, 0);
						else
							class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[(this.aClass146Array6441).length]), 0);
						var_ha.C(true);
					}
				}
			}
			if (this == Player.selfPlayer) {
				class111.method2100(this.localXPos, this.anInt5089, this.localYPos);
				for (int i_82_ = -1 + Class104.aClass36Array903.length; i_82_ >= 0; i_82_--) {
					Class36 class36 = Class104.aClass36Array903[i_82_];
					if (class36 != null && class36.anInt339 != -1) {
						if (class36.anInt346 == 1) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990(class36.anInt345, -1)));
							if (class98_sub39 != null) {
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								int i_83_ = (-(Player.selfPlayer.localXPos) + (class246_sub3_sub4_sub2_sub1.localXPos));
								int i_84_ = (class246_sub3_sub4_sub2_sub1.localYPos - (Player.selfPlayer.localYPos));
								if (!Class239.aBoolean1839)
									method3066(i_84_, class111, i_83_, false, this.aClass146Array6441[0], 92160000, var_ha, class36.anInt339);
								else
									method3061(var_ha, i_84_, Class16.anInt197, i_83_, true, class111, 92160000, class36.anInt339, this.aClass146Array6441[0]);
							}
						}
						if (class36.anInt346 == 2) {
							int i_85_ = (-(Player.selfPlayer.localXPos) + class36.anInt338 - -256);
							int i_86_ = (-(Player.selfPlayer.localYPos) + 256 + class36.anInt347);
							int i_87_ = class36.anInt340 << 9;
							i_87_ *= i_87_;
							if (Class239.aBoolean1839)
								method3061(var_ha, i_86_, Class16.anInt197, i_85_, true, class111, i_87_, class36.anInt339, (this.aClass146Array6441[0]));
							else
								method3066(i_86_, class111, i_85_, false, (this.aClass146Array6441[0]), i_87_, var_ha, class36.anInt339);
						}
						if (class36.anInt346 == 10 && (class36.anInt345 >= 0) && (class36.anInt345 < (Class151_Sub9.playerArray).length)) {
							Player class246_sub3_sub4_sub2_sub2_88_ = (Class151_Sub9.playerArray[class36.anInt345]);
							if (class246_sub3_sub4_sub2_sub2_88_ != null) {
								int i_89_ = ((class246_sub3_sub4_sub2_sub2_88_.localXPos) - (Player.selfPlayer.localXPos));
								int i_90_ = (-(Player.selfPlayer.localYPos) + (class246_sub3_sub4_sub2_sub2_88_.localYPos));
								if (!Class239.aBoolean1839)
									method3066(i_90_, class111, i_89_, false, this.aClass146Array6441[0], 92160000, var_ha, class36.anInt339);
								else
									method3061(var_ha, i_90_, Class16.anInt197, i_89_, true, class111, 92160000, class36.anInt339, this.aClass146Array6441[0]);
							}
						}
					}
				}
				class111.method2101(i_79_);
				class111.method2106(this.localXPos, this.anInt5089, this.localYPos);
			}
			class111.method2101(i_79_);
			class111.method2106(this.localXPos, (-this.anInt6351 + -5 + this.anInt5089), this.localYPos);
			if (class246_sub1 == null)
				class246_sub1 = Class94.method915((this.aClass146Array6441).length, (byte) -47, true);
			this.method3036(var_ha, false, (byte) -124, class111, (this.aClass146Array6441));
			if (!Class239.aBoolean1839) {
				for (int i_91_ = 0; (i_91_ < (this.aClass146Array6441).length); i_91_++) {
					if ((this.aClass146Array6441[i_91_]) != null)
						this.aClass146Array6441[i_91_].method2325(class111, (class246_sub1.aClass246_Sub6Array5067[i_91_]), (Player.selfPlayer == this ? 1 : 0));
				}
			} else {
				for (int i_92_ = 0; (this.aClass146Array6441).length > i_92_; i_92_++) {
					if ((this.aClass146Array6441[i_92_]) != null)
						this.aClass146Array6441[i_92_].method2329(class111, (class246_sub1.aClass246_Sub6Array5067[i_92_]), Class16.anInt197, (Player.selfPlayer != this ? 0 : 1));
				}
			}
			if (this.aClass246_Sub5_6439 != null) {
				Class242 class242 = this.aClass246_Sub5_6439.method3116();
				if (Class239.aBoolean1839)
					var_ha.method1785(class242, Class16.anInt197);
				else
					var_ha.method1820(class242);
			}
			for (int i_93_ = 0; (this.aClass146Array6441.length > i_93_); i_93_++) {
				if (this.aClass146Array6441[i_93_] != null)
					this.aBoolean6442 |= this.aClass146Array6441[i_93_].F();
			}
			this.anInt6417 = Class64_Sub15.anInt3676;
			this.aClass146Array6441[0] = this.aClass146Array6441[1] = this.aClass146Array6441[2] = null;
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method3030(byte i) {
		try {
			if (i != 70)
				method3030((byte) 12);
			return basTypeId;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.G(" + i + ')');
		}
	}

	private final void method3066(int i, Class111 class111, int i_94_, boolean bool, AbstractModel class146, int i_95_, ha var_ha, int i_96_) {
		do {
			try {
				int i_97_ = i * i + i_94_ * i_94_;
				if (i_97_ >= 262144 && i_95_ >= i_97_ && bool == false) {
					int i_98_ = ((int) (Math.atan2(i_94_, i) * 2607.5945876176133) & 0x3fff);
					AbstractModel class146_99_ = (Class98_Sub10_Sub16.method1052(this.anInt6377, i_98_, this.anInt6388, var_ha, i_96_, 94, this.anInt6416));
					if (class146_99_ == null)
						break;
					var_ha.C(false);
					class146_99_.method2325(class111, null, 0);
					var_ha.C(true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gv.RA(" + i + ',' + (class111 != null ? "{...}" : "null") + ',' + i_94_ + ',' + bool + ',' + (class146 != null ? "{...}" : "null") + ',' + i_95_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_96_ + ')'));
			}
			break;
		} while (false);
	}

	public Player() {
		titleId = (byte) 0;
		this.playerCbLevel = 0;
		this.anInt6524 = -1;
		this.aBoolean6532 = false;
		this.combatRange = -1;
		this.cursed_orb_id = false;
		this.headicon_id = -1;
		this.skillLevel = 0;
		name_title_id = (byte) 0;
		this.anInt6514 = 255;
		this.ambientSoundHearDistance = 0;
		this.aBoolean6534 = false;
		this.hasDisplayName = false;
		this.team = 0;
		this.anInt6522 = -1;
		this.anInt6527 = -1;
		genderId = (byte) 0;
		this.aBoolean6520 = false;
		this.combatLevelWithSummoning = 0;
	}

	static {
		aClass196_6543 = new Class196("WTQA", "office", "_qa", 2);
	}
}