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
			if (((Player) this).appearance == null)
				return false;
			if (i != 106)
				((Player) this).aBoolean6534 = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.WA(" + i + ')');
		}
	}

	final void method3056(byte i, int i_0_, int i_1_, int i_2_) {
		try {
			if (((Mobile) this).anInt6434 < 9)
				((Mobile) this).anInt6434++;
			for (int i_3_ = ((Mobile) this).anInt6434; (i_3_ ^ 0xffffffff) < -1; i_3_--) {
				((Mobile) this).walkQueueX[i_3_] = (((Mobile) this).walkQueueX[-1 + i_3_]);
				((Mobile) this).walkQueueZ[i_3_] = (((Mobile) this).walkQueueZ[i_3_ - 1]);
				((Mobile) this).aByteArray6443[i_3_] = (((Mobile) this).aByteArray6443[i_3_ - 1]);
			}
			((Mobile) this).walkQueueX[0] = i_2_;
			((Mobile) this).walkQueueZ[0] = i_1_;
			if (i_0_ != 1)
				method3064(-126);
			((Mobile) this).aByteArray6443[0] = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.NA(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method3057(int i, int i_4_, byte i_5_, int i_6_) {
		try {
			if ((((Mobile) this).anInt6413 ^ 0xffffffff) != 0 && ((Class97) (Class151_Sub7.aClass183_5001.method2623(((Mobile) this).anInt6413, 16383))).anInt816 == 1) {
				((Mobile) this).anInt6413 = -1;
				((Mobile) this).anIntArray6373 = null;
			}
			if (((Mobile) this).anInt6379 != i_6_) {
				Class107 class107 = (Class196.aClass304_1509.method3564(i_6_ + 3, ((Mobile) this).anInt6379));
				if (((Class107) class107).aBoolean909 && ((Class107) class107).anInt910 != -1 && ((((Class97) Class151_Sub7.aClass183_5001.method2623((((Class107) class107).anInt910), 16383)).anInt816) ^ 0xffffffff) == -2)
					((Mobile) this).anInt6379 = -1;
			}
			if ((((Mobile) this).anInt6365 ^ 0xffffffff) != 0) {
				Class107 class107 = (Class196.aClass304_1509.method3564(2, ((Mobile) this).anInt6365));
				if (((Class107) class107).aBoolean909 && ((Class107) class107).anInt910 != -1 && (((Class97) Class151_Sub7.aClass183_5001.method2623((((Class107) class107).anInt910), 16383)).anInt816) == 1)
					((Mobile) this).anInt6365 = -1;
			}
			((Player) this).anInt6512 = -1;
			if (i < 0 || (GameWorld.size_x ^ 0xffffffff) >= (i ^ 0xffffffff) || i_4_ < 0 || i_4_ >= GameWorld.size_y)
				method3060(i_4_, i, 1470);
			else if ((((Mobile) this).walkQueueX[0] ^ 0xffffffff) <= -1 && (((Mobile) this).walkQueueX[0] ^ 0xffffffff) > (GameWorld.size_x ^ 0xffffffff) && ((Mobile) this).walkQueueZ[0] >= 0 && ((((Mobile) this).walkQueueZ[0] ^ 0xffffffff) > (GameWorld.size_y ^ 0xffffffff))) {
				if ((i_5_ ^ 0xffffffff) == -3)
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
			Class97 class97 = ((((Mobile) this).anInt6413 == -1 || ((Mobile) this).anInt6400 != 0) ? null : (Class151_Sub7.aClass183_5001.method2623(((Mobile) this).anInt6413, 16383)));
			int i_9_ = -13 / ((-32 - i) / 57);
			Class97 class97_10_ = ((((Mobile) this).anInt6385 == -1 || ((Player) this).aBoolean6520 || (((Mobile) this).aBoolean6359 && class97 != null)) ? null : (Class151_Sub7.aClass183_5001.method2623(((Mobile) this).anInt6385, 16383)));
			int i_11_ = ((RenderAnimDefinitions) class294).anInt2362;
			int i_12_ = ((RenderAnimDefinitions) class294).anInt2382;
			if ((i_11_ ^ 0xffffffff) != -1 || (i_12_ ^ 0xffffffff) != -1 || (((RenderAnimDefinitions) class294).anInt2393 ^ 0xffffffff) != -1 || (((RenderAnimDefinitions) class294).anInt2363 ^ 0xffffffff) != -1)
				i_7_ |= 0x7;
			int i_13_ = ((Mobile) this).aClass325_6399.method3698((byte) 116);
			boolean bool = ((((Mobile) this).aByte6422 ^ 0xffffffff) != -1 && (Class215.anInt1614 >= ((Mobile) this).anInt6403) && (Class215.anInt1614 < ((Mobile) this).anInt6349));
			if (bool)
				i_7_ |= 0x80000;
			AbstractModel class146 = (((Mobile) this).aClass146Array6441[0] = (((Player) this).appearance.method3628(Class370.aClass257_3136, class97, class97_10_, Class151_Sub7.aClass183_5001, ((Mobile) this).anInt6393, ParamType.aClass83_1205, ((Mobile) this).anIntArray6370, Class98_Sub46_Sub19.getItemDefs, true, ((Mobile) this).anInt6409, ((Mobile) this).aClass226Array6387, Class4.aClass301_85, Class75.aClass140_584, true, i_7_, ((Mobile) this).anInt6419, ((Mobile) this).anInt6366, ((Mobile) this).anInt6361, ((Mobile) this).anInt6350, i_13_, var_ha)));
			int i_14_ = Class52.method488(true);
			if (Class292.anInt3359 < 96 && (i_14_ ^ 0xffffffff) < -51)
				Class206.method2727(89);
			if (Class43.aClass196_375 == Class64_Sub29.aClass196_3720 || (i_14_ ^ 0xffffffff) <= -51) {
				if (Class64_Sub29.aClass196_3720 != Class43.aClass196_375) {
					Class98_Sub48.anInt4281 = 0;
					Class76.aByteArrayArray590 = new byte[50][];
				}
			} else {
				int i_15_;
				for (i_15_ = -i_14_ + 50; ((i_15_ ^ 0xffffffff) < (Class98_Sub48.anInt4281 ^ 0xffffffff)); Class98_Sub48.anInt4281++)
					Class76.aByteArrayArray590[Class98_Sub48.anInt4281] = new byte[102400];
				while ((Class98_Sub48.anInt4281 ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
					Class98_Sub48.anInt4281--;
					Class76.aByteArrayArray590[Class98_Sub48.anInt4281] = null;
				}
			}
			if (class146 == null)
				return false;
			((Mobile) this).anInt6352 = class146.fa();
			((Mobile) this).anInt6354 = class146.ma();
			this.method3046(758, class146);
			if ((i_11_ ^ 0xffffffff) != -1 || i_12_ != 0) {
				this.method3040(false, ((RenderAnimDefinitions) class294).anInt2360, i_11_, i_12_, i_13_, ((RenderAnimDefinitions) class294).anInt2391);
				if ((((Mobile) this).anInt6388 ^ 0xffffffff) != -1)
					class146.FA(((Mobile) this).anInt6388);
				if (((Mobile) this).anInt6377 != 0)
					class146.VA(((Mobile) this).anInt6377);
				if ((((Mobile) this).anInt6416 ^ 0xffffffff) != -1)
					class146.H(0, ((Mobile) this).anInt6416, 0);
			} else
				this.method3040(false, 0, getSize() << -1003342711, getSize() << -31149111, i_13_, 0);
			if (bool)
				class146.method2337(((Mobile) this).aByte6404, ((Mobile) this).aByte6381, ((Mobile) this).aByte6368, 0xff & (((Mobile) this).aByte6422));
			if (!((Player) this).aBoolean6520 && ((Mobile) this).anInt6379 != -1 && ((((Mobile) this).anInt6376 ^ 0xffffffff) != 0)) {
				Class107 class107 = (Class196.aClass304_1509.method3564(2, ((Mobile) this).anInt6379));
				boolean bool_16_ = (((Class107) class107).aByte923 == 3 && ((i_11_ ^ 0xffffffff) != -1 || i_12_ != 0));
				int i_17_ = i_8_;
				if (!bool_16_) {
					if (((Mobile) this).anInt6389 != 0)
						i_17_ |= 0x5;
					if ((((Mobile) this).anInt6382 ^ 0xffffffff) != -1)
						i_17_ |= 0x2;
					if (((Mobile) this).anInt6410 >= 0)
						i_17_ |= 0x7;
				} else
					i_17_ |= 0x7;
				AbstractModel class146_18_ = (((Mobile) this).aClass146Array6441[1] = (class107.method1728(((Mobile) this).anInt6376, Class151_Sub7.aClass183_5001, i_17_, ((Mobile) this).anInt6396, (byte) -95, ((Mobile) this).anInt6367, var_ha)));
				if (class146_18_ != null) {
					if ((((Mobile) this).anInt6410 ^ 0xffffffff) <= -1 && ((RenderAnimDefinitions) class294).anIntArrayArray2366 != null && ((((RenderAnimDefinitions) class294).anIntArrayArray2366[((Mobile) this).anInt6410]) != null)) {
						int i_19_ = 0;
						int i_20_ = 0;
						int i_21_ = 0;
						if (((RenderAnimDefinitions) class294).anIntArrayArray2366 != null && ((((RenderAnimDefinitions) class294).anIntArrayArray2366[((Mobile) this).anInt6410]) != null)) {
							i_21_ += (((RenderAnimDefinitions) class294).anIntArrayArray2366[(((Mobile) this).anInt6410)][2]);
							i_19_ += (((RenderAnimDefinitions) class294).anIntArrayArray2366[(((Mobile) this).anInt6410)][0]);
							i_20_ += (((RenderAnimDefinitions) class294).anIntArrayArray2366[(((Mobile) this).anInt6410)][1]);
						}
						if (((RenderAnimDefinitions) class294).anIntArrayArray2364 != null && ((((RenderAnimDefinitions) class294).anIntArrayArray2364[((Mobile) this).anInt6410]) != null)) {
							i_21_ += (((RenderAnimDefinitions) class294).anIntArrayArray2364[(((Mobile) this).anInt6410)][2]);
							i_19_ += (((RenderAnimDefinitions) class294).anIntArrayArray2364[(((Mobile) this).anInt6410)][0]);
							i_20_ += (((RenderAnimDefinitions) class294).anIntArrayArray2364[(((Mobile) this).anInt6410)][1]);
						}
						if (i_21_ != 0 || (i_19_ ^ 0xffffffff) != -1) {
							int i_22_ = i_13_;
							if ((((Mobile) this).anIntArray6370) != null && ((((Mobile) this).anIntArray6370[(((Mobile) this).anInt6410)]) ^ 0xffffffff) != 0)
								i_22_ = (((Mobile) this).anIntArray6370[(((Mobile) this).anInt6410)]);
							int i_23_ = (0x3fff & i_22_ + ((((Mobile) this).anInt6389) * 2048 + -i_13_));
							if (i_23_ != 0)
								class146_18_.a(i_23_);
							int i_24_ = Class284_Sub2_Sub2.anIntArray6200[i_23_];
							int i_25_ = Class284_Sub2_Sub2.anIntArray6202[i_23_];
							int i_26_ = i_25_ * i_19_ + i_24_ * i_21_ >> 1204025262;
							i_21_ = (i_21_ * i_25_ + -(i_19_ * i_24_) >> -1923367154);
							i_19_ = i_26_;
						}
						class146_18_.H(i_19_, i_20_, i_21_);
					} else if (((Mobile) this).anInt6389 != 0)
						class146_18_.a(2048 * (((Mobile) this).anInt6389));
					if ((((Mobile) this).anInt6382 ^ 0xffffffff) != -1)
						class146_18_.H(0, -(((Mobile) this).anInt6382) << -849373150, 0);
					if (bool_16_) {
						if (((Mobile) this).anInt6388 != 0)
							class146_18_.FA(((Mobile) this).anInt6388);
						if ((((Mobile) this).anInt6377 ^ 0xffffffff) != -1)
							class146_18_.VA(((Mobile) this).anInt6377);
						if (((Mobile) this).anInt6416 != 0)
							class146_18_.H(0, (((Mobile) this).anInt6416), 0);
					}
				}
			} else
				((Mobile) this).aClass146Array6441[1] = null;
			if (((Player) this).aBoolean6520 || ((Mobile) this).anInt6365 == -1 || ((((Mobile) this).anInt6428 ^ 0xffffffff) == 0))
				((Mobile) this).aClass146Array6441[2] = null;
			else {
				Class107 class107 = (Class196.aClass304_1509.method3564(2, ((Mobile) this).anInt6365));
				boolean bool_27_ = ((((Class107) class107).aByte923 ^ 0xffffffff) == -4 && (i_11_ != 0 || (i_12_ ^ 0xffffffff) != -1));
				int i_28_ = i_8_;
				if (!bool_27_) {
					if ((((Mobile) this).anInt6360 ^ 0xffffffff) != -1)
						i_28_ |= 0x5;
					if (((Mobile) this).anInt6363 != 0)
						i_28_ |= 0x2;
					if (((Mobile) this).anInt6353 >= 0)
						i_28_ |= 0x7;
				} else
					i_28_ |= 0x7;
				AbstractModel class146_29_ = (((Mobile) this).aClass146Array6441[2] = (class107.method1721(var_ha, ((Mobile) this).anInt6421, 21945, i_28_, Class151_Sub7.aClass183_5001, ((Mobile) this).anInt6427, ((Mobile) this).anInt6428)));
				if (class146_29_ != null) {
					if ((((Mobile) this).anInt6353 ^ 0xffffffff) > -1 || ((RenderAnimDefinitions) class294).anIntArrayArray2366 == null || ((((RenderAnimDefinitions) class294).anIntArrayArray2366[((Mobile) this).anInt6353]) == null)) {
						if ((((Mobile) this).anInt6360 ^ 0xffffffff) != -1)
							class146_29_.a(2048 * ((Mobile) this).anInt6360);
					} else {
						int i_30_ = 0;
						int i_31_ = 0;
						int i_32_ = 0;
						if (((RenderAnimDefinitions) class294).anIntArrayArray2366 != null && ((((RenderAnimDefinitions) class294).anIntArrayArray2366[((Mobile) this).anInt6353]) != null)) {
							i_32_ += (((RenderAnimDefinitions) class294).anIntArrayArray2366[(((Mobile) this).anInt6353)][2]);
							i_31_ += (((RenderAnimDefinitions) class294).anIntArrayArray2366[(((Mobile) this).anInt6353)][1]);
							i_30_ += (((RenderAnimDefinitions) class294).anIntArrayArray2366[(((Mobile) this).anInt6353)][0]);
						}
						if (((RenderAnimDefinitions) class294).anIntArrayArray2364 != null && ((((RenderAnimDefinitions) class294).anIntArrayArray2364[((Mobile) this).anInt6353]) != null)) {
							i_32_ += (((RenderAnimDefinitions) class294).anIntArrayArray2364[(((Mobile) this).anInt6353)][2]);
							i_31_ += (((RenderAnimDefinitions) class294).anIntArrayArray2364[(((Mobile) this).anInt6353)][1]);
							i_30_ += (((RenderAnimDefinitions) class294).anIntArrayArray2364[(((Mobile) this).anInt6353)][0]);
						}
						if ((i_32_ ^ 0xffffffff) != -1 || i_30_ != 0) {
							int i_33_ = i_13_;
							if ((((Mobile) this).anIntArray6370) != null && ((((Mobile) this).anIntArray6370[(((Mobile) this).anInt6353)]) ^ 0xffffffff) != 0)
								i_33_ = (((Mobile) this).anIntArray6370[(((Mobile) this).anInt6353)]);
							int i_34_ = 0x3fff & -i_13_ + (((Mobile) this).anInt6360 * 2048 - -i_33_);
							if ((i_34_ ^ 0xffffffff) != -1)
								class146_29_.a(i_34_);
							int i_35_ = Class284_Sub2_Sub2.anIntArray6200[i_34_];
							int i_36_ = Class284_Sub2_Sub2.anIntArray6202[i_34_];
							int i_37_ = i_30_ * i_36_ + i_35_ * i_32_ >> 1334277742;
							i_32_ = i_36_ * i_32_ - i_35_ * i_30_ >> 1208318926;
							i_30_ = i_37_;
						}
						class146_29_.H(i_30_, i_31_, i_32_);
					}
					if ((((Mobile) this).anInt6363 ^ 0xffffffff) != -1)
						class146_29_.H(0, -(((Mobile) this).anInt6363) << -623157630, 0);
					if (bool_27_) {
						if ((((Mobile) this).anInt6388 ^ 0xffffffff) != -1)
							class146_29_.FA(((Mobile) this).anInt6388);
						if (((Mobile) this).anInt6377 != 0)
							class146_29_.VA(((Mobile) this).anInt6377);
						if ((((Mobile) this).anInt6416 ^ 0xffffffff) != -1)
							class146_29_.H(0, (((Mobile) this).anInt6416), 0);
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
				return ((Player) this).name;
			return ((Player) this).displayName;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gv.JA(" + i + ',' + bool + ')');
		}
	}

	final void method3060(int i, int i_38_, int i_39_) {
		do {
			try {
				((Mobile) this).walkQueueX[0] = i_38_;
				((Mobile) this).anInt6433 = 0;
				((Mobile) this).anInt6436 = 0;
				((Mobile) this).anInt6434 = 0;
				if (i_39_ != 1470)
					name_title_id = (byte) -42;
				((Mobile) this).walkQueueZ[0] = i;
				int i_40_ = getSize();
				((AnimableEntity) this).localXPos = (512 * ((Mobile) this).walkQueueX[0] + 256 * i_40_);
				((AnimableEntity) this).localYPos = i_40_ * 256 + (((Mobile) this).walkQueueZ[0]) * 512;
				if (Player.selfPlayer == this)
					Class374.method3980((byte) 126);
				if (((Mobile) this).aClass246_Sub5_6439 == null)
					break;
				((Mobile) this).aClass246_Sub5_6439.method3127();
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
				if ((i_45_ ^ 0xffffffff) <= -262145 && (i_43_ ^ 0xffffffff) <= (i_45_ ^ 0xffffffff)) {
					if (bool != true)
						method3030((byte) 44);
					int i_46_ = 0x3fff & (int) (2607.5945876176133 * Math.atan2((double) i_42_, (double) i));
					AbstractModel class146_47_ = (Class98_Sub10_Sub16.method1052(((Mobile) this).anInt6377, i_46_, ((Mobile) this).anInt6388, var_ha, i_44_, 106, ((Mobile) this).anInt6416));
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
				((RSByteBuffer) stream).position = 0;
				int bitPackedInfo = stream.readUnsignedByte();
				genderId = (byte) (0x1 & bitPackedInfo);
				boolean bool = ((Player) this).hasDisplayName;
				((Player) this).hasDisplayName = (bitPackedInfo & 0x2 ^ 0xffffffff) != -1;
				boolean bool_49_ = (0x4 & bitPackedInfo) != 0;
				int i_50_ = super.getSize();
				this.method3045((byte) 68, 1 + (0x7 & bitPackedInfo >> 846259619));
				titleId = (byte) (bitPackedInfo >> -218019610 & 0x3);
				((AnimableEntity) this).localXPos += -i_50_ + getSize() << 1992716520;
				((AnimableEntity) this).localYPos += getSize() - i_50_ << 1346950216;
				name_title_id = stream.readSignedByte();
				((Player) this).skull_id = stream.readSignedByte();
				((Player) this).headicon_id = stream.readSignedByte();
				((Player) this).cursed_orb_id = stream.readSignedByte() == 1;
				if (Class64_Sub29.aClass196_3720 == Class43.aClass196_375 && Player.rights >= 2)
					((Player) this).cursed_orb_id = false;
				int npcId = -1;
				((Player) this).team = 0;
				int[] is = new int[12];
				for (int i_52_ = 0; i_52_ < 12; i_52_++) {
					int i_53_ = stream.readUnsignedByte();
					if (i_53_ == 0)
						is[i_52_] = 0;
					else {
						int i_54_ = stream.readUnsignedByte();
						int i_55_ = (i_53_ << -30617816) + i_54_;
						if (i_52_ == 0 && (i_55_ ^ 0xffffffff) == -65536) {
							npcId = stream.readShort();
							((Player) this).team = stream.readUnsignedByte();
							break;
						}
						if (i_55_ >= 32768) {
							i_55_ = Class255.anIntArray3207[-32768 + i_55_];
							is[i_52_] = Class41.method366(1073741824, i_55_);
							int i_56_ = (((ItemDefinition) Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_55_)).team);
							if (i_56_ != 0)
								((Player) this).team = i_56_;
						} else
							is[i_52_] = Class41.method366(-2147483648, i_55_ + -256);
					}
				}
				int[] colours = new int[5];
				for (int i_58_ = 0; i_58_ < 5; i_58_++) {
					int i_59_ = stream.readUnsignedByte();
					if (((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) > -2) || i_59_ < 0 || (Class61.aShortArrayArrayArray478[0][i_58_].length <= i_59_))
						i_59_ = 0;
					colours[i_58_] = i_59_;
				}
				basTypeId = stream.readShort();
				((Player) this).name = stream.readString();
				((Player) this).displayName = ((Player) this).name;
				if (this == Player.selfPlayer)
					Class256_Sub1.aString5157 = ((Player) this).name;
				((Player) this).playerCbLevel = stream.readUnsignedByte();
				if (!bool_49_) {
					((Player) this).skillLevel = 0;
					((Player) this).combatLevelWithSummoning = stream.readUnsignedByte();
					((Player) this).combatRange = stream.readUnsignedByte();
					if ((((Player) this).combatRange ^ 0xffffffff) == -256)
						((Player) this).combatRange = -1;
				} else {
					((Player) this).skillLevel = stream.readShort();
					((Player) this).combatRange = -1;
					((Player) this).combatLevelWithSummoning = ((Player) this).playerCbLevel;
					if ((((Player) this).skillLevel ^ 0xffffffff) == -65536)
						((Player) this).skillLevel = -1;
				}
				int i_60_ = ((Player) this).ambientSoundHearDistance;
				((Player) this).ambientSoundHearDistance = stream.readUnsignedByte();
				if ((((Player) this).ambientSoundHearDistance ^ 0xffffffff) == -1)
					Class213.removePlayerAmbientSound(true, this);
				else {
					int i_61_ = ((Player) this).anInt6527;
					int i_62_ = ((Player) this).anInt6524;
					int i_63_ = ((Player) this).anInt6522;
					int i_64_ = ((Player) this).anInt6517;
					int i_65_ = ((Player) this).anInt6514;
					((Player) this).anInt6527 = stream.readShort();
					((Player) this).anInt6524 = stream.readShort();
					((Player) this).anInt6522 = stream.readShort();
					((Player) this).anInt6517 = stream.readShort();
					((Player) this).anInt6514 = stream.readUnsignedByte();
					if (!bool != !(((Player) this).hasDisplayName) || (i_60_ != ((Player) this).ambientSoundHearDistance) || (i_61_ != ((Player) this).anInt6527) || (i_62_ != ((Player) this).anInt6524) || (i_63_ != ((Player) this).anInt6522) || (i_64_ != ((Player) this).anInt6517) || (((Player) this).anInt6514 != i_65_))
						Class322.method3674(0, this);
				}
				if (((Player) this).appearance == null)
					((Player) this).appearance = new PlayerAppearance();
				int tempNpcId = (((PlayerAppearance) (((Player) this).appearance)).anInt2684);
				int[] tempColours = (((PlayerAppearance) ((Player) this).appearance).anIntArray2683);
				((Player) this).appearance.method3627(is, -59, (genderId ^ 0xffffffff) == -2, colours, method3030((byte) 70), npcId);
				if (i == 73) {
					if ((npcId ^ 0xffffffff) != (tempNpcId ^ 0xffffffff)) {
						((AnimableEntity) this).localXPos = (((((Mobile) this).walkQueueX[0]) << -1791062743) - -(getSize() << 2009592264));
						((AnimableEntity) this).localYPos = (((((Mobile) this).walkQueueZ[0]) << 845342377) - -(getSize() << 1847977800));
					}
					if ((((Mobile) this).anInt6369 ^ 0xffffffff) == (za_Sub2.anInt6080 ^ 0xffffffff) && tempColours != null) {
						for (int i_68_ = 0; colours.length > i_68_; i_68_++) {
							if ((tempColours[i_68_] ^ 0xffffffff) != (colours[i_68_] ^ 0xffffffff)) {
								Class98_Sub46_Sub19.getItemDefs.method2717(i + -9);
								break;
							}
						}
					}
					if (((Mobile) this).aClass246_Sub5_6439 != null)
						((Mobile) this).aClass246_Sub5_6439.method3127();
					if (((Mobile) this).anInt6385 == -1 || !((Mobile) this).aBoolean6359)
						break;
					RenderAnimDefinitions class294 = this.getRenderAnimation(1);
					if (class294.method3480((byte) 119, (((Mobile) this).anInt6385)))
						break;
					((Mobile) this).aBoolean6359 = false;
					((Mobile) this).anInt6385 = -1;
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
			if (((Player) this).appearance == null || !method3058((byte) -105, var_ha, 131072))
				return false;
			Class111 class111 = var_ha.method1793();
			int i_75_ = ((Mobile) this).aClass325_6399.method3698((byte) 116);
			class111.method2101(i_75_);
			class111.method2106(((AnimableEntity) this).localXPos, ((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localYPos);
			boolean bool = false;
			for (int i_76_ = 0; (((Mobile) this).aClass146Array6441.length > i_76_); i_76_++) {
				if ((((Mobile) this).aClass146Array6441[i_76_] != null) && (Class239.aBoolean1839 ? (((Mobile) this).aClass146Array6441[i_76_].method2333(i, i_74_, class111, true, 0, Class16.anInt197)) : ((Mobile) this).aClass146Array6441[i_76_].method2339(i, i_74_, class111, true, 0))) {
					bool = true;
					break;
				}
			}
			if (i_73_ < 59)
				((Player) this).aBoolean6534 = true;
			((Mobile) this).aClass146Array6441[0] = ((Mobile) this).aClass146Array6441[1] = ((Mobile) this).aClass146Array6441[2] = null;
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
			if ((genderId ^ 0xffffffff) == -2 && Class35.anIntArray333 != null)
				is = Class35.anIntArray333;
			else
				is = Class272.anIntArray2036;
			if (is != null && (is[titleId] ^ 0xffffffff) != 0) {
				Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(is[titleId], 1028602529);
				if ((((Class306) class306).aChar2567 ^ 0xffffffff) == -116)
					string += class306.method3594(name_title_id & 0xff, (byte) 37);
				else {
					Map.method3585(new Throwable(), i + -126, "gdn1");
					is[titleId] = -1;
				}
			}
			if (!bool)
				string += ((Player) this).displayName;
			else
				string += ((Player) this).name;
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
			if (((Player) this).appearance != null && (((Mobile) this).aBoolean6440 || method3058((byte) 35, var_ha, 0))) {
				Class111 class111 = var_ha.method1793();
				class111.method2101(((Mobile) this).aClass325_6399.method3698((byte) 116));
				class111.method2106(((AnimableEntity) this).localXPos, ((AnimableEntity) this).anInt5089 + -5, ((AnimableEntity) this).localYPos);
				int i_77_ = 120 % ((i - 53) / 46);
				this.method3036(var_ha, ((Mobile) this).aBoolean6440, (byte) -126, class111, (((Mobile) this).aClass146Array6441));
				((Mobile) this).aClass146Array6441[0] = ((Mobile) this).aClass146Array6441[1] = ((Mobile) this).aClass146Array6441[2] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int getSize() {
		try {
			if (((Player) this).appearance != null && (((PlayerAppearance) (((Player) this).appearance)).anInt2684 ^ 0xffffffff) != 0)
				return (((Class141) (Class4.aClass301_85.method3538(((PlayerAppearance) (((Player) this).appearance)).anInt2684))).anInt1112);
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
					Class48.anInt410 = ((Class28) class28).anInt284;
					InputStream_Sub2.anInt29 = ((Class28) class28).anInt282;
					OutputStream_Sub2.anInt40 = ((Class28) class28).anInt292;
				}
				Class230.method2870((byte) -74);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gv.UA(" + i + ',' + i_78_ + ',' + bool + ')'));
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			if (((Player) this).appearance == null || !method3058((byte) -122, var_ha, 2048))
				return null;
			Class111 class111 = var_ha.method1793();
			int i_79_ = ((Mobile) this).aClass325_6399.method3698((byte) 116);
			class111.method2101(i_79_);
			Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[((AnimableEntity) this).height_level][(((AnimableEntity) this).localXPos >> Class151_Sub8.anInt5015)][(((AnimableEntity) this).localYPos >> Class151_Sub8.anInt5015)]);
			if (class172 == null || ((Class172) class172).aClass246_Sub3_Sub1_1332 == null)
				((Mobile) this).anInt6351 -= ((float) ((Mobile) this).anInt6351 / 10.0F);
			else {
				int i_80_ = (((Mobile) this).anInt6351 - (((Class246_Sub3_Sub1) ((Class172) class172).aClass246_Sub3_Sub1_1332).aShort6149));
				((Mobile) this).anInt6351 -= (float) i_80_ / 10.0F;
			}
			class111.method2106(((AnimableEntity) this).localXPos, (-((Mobile) this).anInt6351 + ((AnimableEntity) this).anInt5089 + -20), ((AnimableEntity) this).localYPos);
			Class246_Sub1 class246_sub1 = null;
			if (i > -12)
				return null;
			((Mobile) this).aBoolean6442 = false;
			if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub26_4035.method662((byte) 120) ^ 0xffffffff) == -2) {
				RenderAnimDefinitions class294 = this.getRenderAnimation(1);
				if (((RenderAnimDefinitions) class294).aBoolean2400 && (((PlayerAppearance) (((Player) this).appearance)).anInt2684 == -1 || ((Class141) (Class4.aClass301_85.method3538((((PlayerAppearance) ((Player) this).appearance).anInt2684)))).aBoolean1130)) {
					Class97 class97 = (((((Mobile) this).anInt6413 ^ 0xffffffff) != 0 && ((Mobile) this).anInt6400 == 0) ? (Class151_Sub7.aClass183_5001.method2623(((Mobile) this).anInt6413, 16383)) : null);
					Class97 class97_81_ = (((((Mobile) this).anInt6385 ^ 0xffffffff) == 0 || (((Player) this).aBoolean6520) || (((Mobile) this).aBoolean6359 && class97 != null)) ? null : (Class151_Sub7.aClass183_5001.method2623(((Mobile) this).anInt6385, 16383)));
					AbstractModel class146 = (Class102.method1703(class97_81_ == null ? class97 : class97_81_, ((Mobile) this).anInt6377, 1, 240, (((Mobile) this).aClass146Array6441[0]), ((Mobile) this).anInt6388, i_79_, 124, 160, 0, (class97_81_ == null ? ((Mobile) this).anInt6393 : ((Mobile) this).anInt6350), var_ha, 0, ((Mobile) this).anInt6416));
					if (class146 != null) {
						class246_sub1 = (Class94.method915(1 + (((Mobile) this).aClass146Array6441).length, (byte) -47, true));
						((Mobile) this).aBoolean6442 = true;
						var_ha.C(false);
						if (Class239.aBoolean1839)
							class146.method2329(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[(((Mobile) this).aClass146Array6441).length]), Class16.anInt197, 0);
						else
							class146.method2325(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[(((Mobile) this).aClass146Array6441).length]), 0);
						var_ha.C(true);
					}
				}
			}
			if (this == Player.selfPlayer) {
				class111.method2100(((AnimableEntity) this).localXPos, ((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localYPos);
				for (int i_82_ = -1 + Class104.aClass36Array903.length; (i_82_ ^ 0xffffffff) <= -1; i_82_--) {
					Class36 class36 = Class104.aClass36Array903[i_82_];
					if (class36 != null && ((Class36) class36).anInt339 != -1) {
						if ((((Class36) class36).anInt346 ^ 0xffffffff) == -2) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) ((Class36) class36).anInt345, -1)));
							if (class98_sub39 != null) {
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								int i_83_ = (-(((AnimableEntity) (Player.selfPlayer)).localXPos) + (((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos));
								int i_84_ = (((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos - (((AnimableEntity) (Player.selfPlayer)).localYPos));
								if (!Class239.aBoolean1839)
									method3066(i_84_, class111, i_83_, false, ((Mobile) this).aClass146Array6441[0], 92160000, var_ha, ((Class36) class36).anInt339);
								else
									method3061(var_ha, i_84_, Class16.anInt197, i_83_, true, class111, 92160000, ((Class36) class36).anInt339, ((Mobile) this).aClass146Array6441[0]);
							}
						}
						if (((Class36) class36).anInt346 == 2) {
							int i_85_ = (-(((AnimableEntity) (Player.selfPlayer)).localXPos) + ((Class36) class36).anInt338 - -256);
							int i_86_ = (-(((AnimableEntity) (Player.selfPlayer)).localYPos) + 256 + ((Class36) class36).anInt347);
							int i_87_ = ((Class36) class36).anInt340 << 556190985;
							i_87_ *= i_87_;
							if (Class239.aBoolean1839)
								method3061(var_ha, i_86_, Class16.anInt197, i_85_, true, class111, i_87_, ((Class36) class36).anInt339, (((Mobile) this).aClass146Array6441[0]));
							else
								method3066(i_86_, class111, i_85_, false, (((Mobile) this).aClass146Array6441[0]), i_87_, var_ha, ((Class36) class36).anInt339);
						}
						if ((((Class36) class36).anInt346 ^ 0xffffffff) == -11 && ((((Class36) class36).anInt345 ^ 0xffffffff) <= -1) && (((Class36) class36).anInt345 < (Class151_Sub9.playerArray).length)) {
							Player class246_sub3_sub4_sub2_sub2_88_ = (Class151_Sub9.playerArray[((Class36) class36).anInt345]);
							if (class246_sub3_sub4_sub2_sub2_88_ != null) {
								int i_89_ = ((((AnimableEntity) class246_sub3_sub4_sub2_sub2_88_).localXPos) - (((AnimableEntity) (Player.selfPlayer)).localXPos));
								int i_90_ = (-(((AnimableEntity) (Player.selfPlayer)).localYPos) + (((AnimableEntity) class246_sub3_sub4_sub2_sub2_88_).localYPos));
								if (!Class239.aBoolean1839)
									method3066(i_90_, class111, i_89_, false, ((Mobile) this).aClass146Array6441[0], 92160000, var_ha, ((Class36) class36).anInt339);
								else
									method3061(var_ha, i_90_, Class16.anInt197, i_89_, true, class111, 92160000, ((Class36) class36).anInt339, ((Mobile) this).aClass146Array6441[0]);
							}
						}
					}
				}
				class111.method2101(i_79_);
				class111.method2106(((AnimableEntity) this).localXPos, ((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localYPos);
			}
			class111.method2101(i_79_);
			class111.method2106(((AnimableEntity) this).localXPos, (-((Mobile) this).anInt6351 + -5 + ((AnimableEntity) this).anInt5089), ((AnimableEntity) this).localYPos);
			if (class246_sub1 == null)
				class246_sub1 = Class94.method915((((Mobile) this).aClass146Array6441).length, (byte) -47, true);
			this.method3036(var_ha, false, (byte) -124, class111, (((Mobile) this).aClass146Array6441));
			if (!Class239.aBoolean1839) {
				for (int i_91_ = 0; (((((Mobile) this).aClass146Array6441).length ^ 0xffffffff) < (i_91_ ^ 0xffffffff)); i_91_++) {
					if ((((Mobile) this).aClass146Array6441[i_91_]) != null)
						((Mobile) this).aClass146Array6441[i_91_].method2325(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[i_91_]), (Player.selfPlayer == this ? 1 : 0));
				}
			} else {
				for (int i_92_ = 0; (i_92_ ^ 0xffffffff) > ((((Mobile) this).aClass146Array6441).length ^ 0xffffffff); i_92_++) {
					if ((((Mobile) this).aClass146Array6441[i_92_]) != null)
						((Mobile) this).aClass146Array6441[i_92_].method2329(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[i_92_]), Class16.anInt197, (Player.selfPlayer != this ? 0 : 1));
				}
			}
			if (((Mobile) this).aClass246_Sub5_6439 != null) {
				Class242 class242 = ((Mobile) this).aClass246_Sub5_6439.method3116();
				if (Class239.aBoolean1839)
					var_ha.method1785(class242, Class16.anInt197);
				else
					var_ha.method1820(class242);
			}
			for (int i_93_ = 0; (((Mobile) this).aClass146Array6441.length > i_93_); i_93_++) {
				if (((Mobile) this).aClass146Array6441[i_93_] != null)
					((Mobile) this).aBoolean6442 |= ((Mobile) this).aClass146Array6441[i_93_].F();
			}
			((Mobile) this).anInt6417 = Class64_Sub15.anInt3676;
			((Mobile) this).aClass146Array6441[0] = ((Mobile) this).aClass146Array6441[1] = ((Mobile) this).aClass146Array6441[2] = null;
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
				if (i_97_ >= 262144 && (i_97_ ^ 0xffffffff) >= (i_95_ ^ 0xffffffff) && bool == false) {
					int i_98_ = ((int) (Math.atan2((double) i_94_, (double) i) * 2607.5945876176133) & 0x3fff);
					AbstractModel class146_99_ = (Class98_Sub10_Sub16.method1052(((Mobile) this).anInt6377, i_98_, ((Mobile) this).anInt6388, var_ha, i_96_, 94, ((Mobile) this).anInt6416));
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
		((Player) this).playerCbLevel = 0;
		((Player) this).anInt6524 = -1;
		((Player) this).aBoolean6532 = false;
		((Player) this).combatRange = -1;
		((Player) this).cursed_orb_id = false;
		((Player) this).headicon_id = -1;
		((Player) this).skillLevel = 0;
		name_title_id = (byte) 0;
		((Player) this).anInt6514 = 255;
		((Player) this).ambientSoundHearDistance = 0;
		((Player) this).aBoolean6534 = false;
		((Player) this).hasDisplayName = false;
		((Player) this).team = 0;
		((Player) this).anInt6522 = -1;
		((Player) this).anInt6527 = -1;
		genderId = (byte) 0;
		((Player) this).aBoolean6520 = false;
		((Player) this).combatLevelWithSummoning = 0;
	}

	static {
		aClass196_6543 = new Class196("WTQA", "office", "_qa", 2);
	}
}