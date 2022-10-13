import java.io.BufferedWriter;
import java.io.FileWriter;

/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
//steven
final class PlayerAppearance {
	private long aLong2678;
	private long aLong2679;
	static float aFloat2680 = 0.25F;
	boolean aBoolean2681;
	private int anInt2682;
	int[] anIntArray2683;
	int anInt2684 = -1;
	private int[] anIntArray2685;

	final AbstractModel method3624(byte i, int i_0_, Class83 class83, ItemDefinitionList class205, ha var_ha, int i_1_, Interface6 interface6, Class97 class97, Class301 class301, int i_2_, Class183 class183, int i_3_) {
		try {
			if (((PlayerAppearance) this).anInt2684 != -1)
				return (class301.method3538(((PlayerAppearance) this).anInt2684).method2299(class97, false, interface6, i_0_, i_1_, class183, i_3_, var_ha, null, i_2_));
			int i_4_ = i_3_;
			if (class97 != null) {
				boolean bool = false;
				boolean bool_5_ = false;
				boolean bool_6_ = false;
				boolean bool_7_ = false;
				int i_8_ = -1;
				int i_9_ = -1;
				Object object = null;
				Object object_10_ = null;
				i_4_ |= 0x20;
				i_8_ = ((Class97) class97).anIntArray818[i_1_];
				int i_11_ = i_8_ >>> 1075836880;
				Class98_Sub46_Sub16 class98_sub46_sub16 = class183.method2624(2, i_11_);
				i_8_ &= 0xffff;
				if (class98_sub46_sub16 != null) {
					bool_5_ |= class98_sub46_sub16.method1619(i_8_, 31239);
					bool |= class98_sub46_sub16.method1617(false, i_8_);
					bool_7_ |= class98_sub46_sub16.method1615(i_8_, false);
					bool_6_ |= ((Class97) class97).aBoolean817;
				}
				if ((((Class97) class97).aBoolean825 || Class357.aBoolean3027) && i_2_ != -1 && ((Class97) class97).anIntArray818.length > i_2_) {
					i_9_ = ((Class97) class97).anIntArray818[i_2_];
					int i_12_ = i_9_ >>> 334721392;
					i_9_ &= 0xffff;
					Class98_Sub46_Sub16 class98_sub46_sub16_13_ = (i_12_ == i_11_ ? class98_sub46_sub16 : class183.method2624(2, i_12_));
					if (class98_sub46_sub16_13_ != null) {
						bool_5_ |= class98_sub46_sub16_13_.method1619(i_9_, 31239);
						bool |= class98_sub46_sub16_13_.method1617(false, i_9_);
						bool_7_ |= class98_sub46_sub16_13_.method1615(i_9_, false);
					}
				}
				if (bool_5_)
					i_4_ |= 0x80;
				if (bool)
					i_4_ |= 0x100;
				if (bool_6_)
					i_4_ |= 0x200;
				if (bool_7_)
					i_4_ |= 0x400;
			}
			AbstractModel class146;
			synchronized (PlayerUpdate.aClass79_3411) {
				class146 = (AbstractModel) PlayerUpdate.aClass79_3411.get(aLong2678);
			}
			if (class146 == null || var_ha.c(class146.ua(), i_4_) != 0) {
				if (class146 != null)
					i_4_ = var_ha.method1777(i_4_, class146.ua());
				int i_14_ = i_4_;
				boolean bool = false;
				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -13; i_15_++) {
					int i_16_ = anIntArray2685[i_15_];
					if ((i_16_ & 0x40000000 ^ 0xffffffff) == -1) {
						if ((i_16_ & ~0x7fffffff) != 0 && !class83.method826(0x3fffffff & i_16_, 3).method2474(113))
							bool = true;
					} else if (!class205.getItemDefs(0x3fffffff & i_16_).method3489(((PlayerAppearance) this).aBoolean2681, 92))
						bool = true;
				}
				if (bool)
					return null;
				ModelDefinitions[] class178s = new ModelDefinitions[12];
				int i_17_ = 0;
				for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -13; i_18_++) {
					int i_19_ = anIntArray2685[i_18_];
					if ((i_19_ & 0x40000000 ^ 0xffffffff) != -1) {
						ModelDefinitions class178 = (class205.getItemDefs(i_19_ & 0x3fffffff).method3486(((PlayerAppearance) this).aBoolean2681, 0));
						if (class178 != null)
							class178s[i_17_++] = class178;
					} else if ((~0x7fffffff & i_19_) != 0) {
						ModelDefinitions class178 = class83.method826(i_19_ & 0x3fffffff, 3).method2476((byte) -99);
						if (class178 != null)
							class178s[i_17_++] = class178;
					}
				}
				ModelDefinitions class178 = new ModelDefinitions(class178s, i_17_);
				i_14_ |= 0x4000;
				class146 = var_ha.method1790(class178, i_14_, Class81.anInt624, 64, 768);
				for (int i_20_ = 0; i_20_ < 5; i_20_++) {
					for (int i_21_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
						if (((PlayerAppearance) this).anIntArray2683[i_20_] < (Class61.aShortArrayArrayArray478[i_21_][i_20_]).length)
							class146.ia((Class98_Sub10_Sub11.aShortArrayArray5597[i_21_][i_20_]), (Class61.aShortArrayArrayArray478[i_21_][i_20_][(((PlayerAppearance) this).anIntArray2683[i_20_])]));
					}
				}
				class146.s(i_4_);
				synchronized (PlayerUpdate.aClass79_3411) {
					PlayerUpdate.aClass79_3411.put(aLong2678, class146);
				}
			}
			if (class97 == null)
				return class146;
			AbstractModel class146_22_ = class146.method2341((byte) 4, i_4_, true);
			if (i <= 83)
				aLong2678 = -7L;
			class146_22_ = class97.method937(i_2_, i_0_, i_3_, 127, class146, i_1_);
			return class146_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.G(" + i + ',' + i_0_ + ',' + (class83 != null ? "{...}" : "null") + ',' + (class205 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_1_ + ',' + (interface6 != null ? "{...}" : "null") + ',' + (class97 != null ? "{...}" : "null") + ',' + (class301 != null ? "{...}" : "null") + ',' + i_2_ + ',' + (class183 != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	static final void method3625(int i) {
		do {
			try {
				int[] is = new int[(((ItemDefinitionList) Class98_Sub46_Sub19.getItemDefs).anInt1554)];
				int i_23_ = 0;
				for (int i_24_ = 0; i_24_ < (((ItemDefinitionList) Class98_Sub46_Sub19.getItemDefs).anInt1554); i_24_++) {
					ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_24_);
					if ((((ItemDefinition) class297).anInt2458 ^ 0xffffffff) <= -1 || ((((ItemDefinition) class297).anInt2466 ^ 0xffffffff) <= -1))
						is[i_23_++] = i_24_;
				}
				Class255.anIntArray3207 = new int[i_23_];
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter("equipids.txt"));
					for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_25_++) {
						Class255.anIntArray3207[i_25_] = is[i_25_];
						bw.write(is[i_25_] + ":" + i_25_);
						bw.newLine();
						//                    if(is[i_25_] == 19314) {
						//                    	System.out.println(i_25_);
						//                    }
					}
					bw.flush();
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (i == -1439)
					break;
				method3625(57);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tfa.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final AbstractModel method3626(int i, Class97 class97, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, Class83 class83, ha var_ha, int i_32_, Class183 class183) {
		try {
			if (i_32_ != 256)
				method3636(-13, 94);
			int i_33_ = i_31_;
			if (class97 != null) {
				boolean bool = false;
				boolean bool_34_ = false;
				boolean bool_35_ = false;
				boolean bool_36_ = false;
				int i_37_ = -1;
				int i_38_ = -1;
				Object object = null;
				i_37_ = ((Class97) class97).anIntArray818[i];
				Object object_39_ = null;
				i_33_ |= 0x20;
				int i_40_ = i_37_ >>> -1674141136;
				Class98_Sub46_Sub16 class98_sub46_sub16 = class183.method2624(i_32_ ^ 0x102, i_40_);
				i_37_ &= 0xffff;
				if (class98_sub46_sub16 != null) {
					bool_34_ |= class98_sub46_sub16.method1619(i_37_, 31239);
					bool |= class98_sub46_sub16.method1617(false, i_37_);
					bool_36_ |= class98_sub46_sub16.method1615(i_37_, false);
					bool_35_ |= ((Class97) class97).aBoolean817;
				}
				if ((((Class97) class97).aBoolean825 || Class357.aBoolean3027) && i_30_ != -1 && ((Class97) class97).anIntArray818.length > i_30_) {
					i_38_ = ((Class97) class97).anIntArray818[i_30_];
					int i_41_ = i_38_ >>> 1835918000;
					i_38_ &= 0xffff;
					Class98_Sub46_Sub16 class98_sub46_sub16_42_;
					if ((i_41_ ^ 0xffffffff) == (i_40_ ^ 0xffffffff))
						class98_sub46_sub16_42_ = class98_sub46_sub16;
					else
						class98_sub46_sub16_42_ = class183.method2624(2, i_38_ >>> 243215344);
					if (class98_sub46_sub16_42_ != null) {
						bool_34_ |= class98_sub46_sub16_42_.method1619(i_38_, i_32_ + 30983);
						bool |= class98_sub46_sub16_42_.method1617(false, i_38_);
						bool_36_ |= class98_sub46_sub16_42_.method1615(i_38_, false);
					}
				}
				if (bool_34_)
					i_33_ |= 0x80;
				if (bool)
					i_33_ |= 0x100;
				if (bool_35_)
					i_33_ |= 0x200;
				if (bool_36_)
					i_33_ |= 0x400;
			}
			long l = ((long) (i_29_ << -715025360) | (long) i_27_ << 270913248 | (long) i_28_);
			AbstractModel class146;
			synchronized (PlayerUpdate.aClass79_3411) {
				class146 = (AbstractModel) PlayerUpdate.aClass79_3411.get(l);
			}
			if (class146 == null || (var_ha.c(class146.ua(), i_33_) ^ 0xffffffff) != -1) {
				if (class146 != null)
					i_33_ = var_ha.method1777(i_33_, class146.ua());
				int i_43_ = i_33_;
				ModelDefinitions[] class178s = new ModelDefinitions[3];
				int i_44_ = 0;
				if (class83.method826(i_28_, i_32_ + -253).method2474(i_32_ + -150) && class83.method826(i_29_, i_32_ + -253).method2474(125) && class83.method826(i_27_, 3).method2474(i_32_ + -150)) {
					ModelDefinitions class178 = class83.method826(i_28_, 3).method2476((byte) -103);
					if (class178 != null)
						class178s[i_44_++] = class178;
					class178 = class83.method826(i_29_, i_32_ + -253).method2476((byte) 68);
					if (class178 != null)
						class178s[i_44_++] = class178;
					class178 = class83.method826(i_27_, i_32_ ^ 0x103).method2476((byte) 110);
					if (class178 != null)
						class178s[i_44_++] = class178;
					i_43_ |= 0x4000;
					class178 = new ModelDefinitions(class178s, i_44_);
					class146 = var_ha.method1790(class178, i_43_, Class81.anInt624, 64, 768);
					for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > -6; i_45_++) {
						for (int i_46_ = 0; Class61.aShortArrayArrayArray478.length > i_46_; i_46_++) {
							if (((PlayerAppearance) this).anIntArray2683[i_45_] < (Class61.aShortArrayArrayArray478[i_46_][i_45_]).length)
								class146.ia((Class98_Sub10_Sub11.aShortArrayArray5597[i_46_][i_45_]), (Class61.aShortArrayArrayArray478[i_46_][i_45_][(((PlayerAppearance) this).anIntArray2683[i_45_])]));
						}
					}
					class146.s(i_33_);
					synchronized (PlayerUpdate.aClass79_3411) {
						PlayerUpdate.aClass79_3411.put(l, class146);
					}
				} else
					return null;
			}
			if (class97 == null)
				return class146;
			class146 = class146.method2341((byte) 4, i_33_, true);
			class146 = class97.method937(i_30_, i_26_, i_31_, -43, class146, i);
			return class146;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.J(" + i + ',' + (class97 != null ? "{...}" : "null") + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + (class83 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_32_ + ',' + (class183 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3627(int[] is, int i, boolean bool, int[] is_47_, int i_48_, int i_49_) {
		try {
			//new Throwable().printStackTrace();
			if (i_48_ != anInt2682)
				anInt2682 = i_48_;
			anIntArray2685 = is;
			((PlayerAppearance) this).aBoolean2681 = bool;
			((PlayerAppearance) this).anInt2684 = i_49_;
			((PlayerAppearance) this).anIntArray2683 = is_47_;
			if (i >= -18)
				anInt2682 = 120;
			method3633(95);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.M(" + (is != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (is_47_ != null ? "{...}" : "null") + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	final AbstractModel method3628(Class257 class257, Class97 class97, Class97 class97_50_, Class183 class183, int i, Class83 class83, int[] is, ItemDefinitionList class205, boolean bool, int i_51_, Class226[] class226s, Class301 class301, Interface6 interface6, boolean bool_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, ha var_ha) {
		try {
			if ((((PlayerAppearance) this).anInt2684 ^ 0xffffffff) != 0)
				return (class301.method3538(((PlayerAppearance) this).anInt2684).method2301(i, i_58_, is, i_57_, (byte) 101, class97, class226s, var_ha, i_51_, i_56_, interface6, null, i_55_, class257, i_53_, i_54_, class183, class97_50_));
			int i_59_ = i_53_;
			long l = aLong2678;
			int[] is_60_ = anIntArray2685;
			if (class97 != null && (((Class97) class97).anInt820 >= 0 || ((Class97) class97).anInt809 >= 0)) {
				is_60_ = new int[12];
				for (int i_61_ = 0; i_61_ < 12; i_61_++)
					is_60_[i_61_] = anIntArray2685[i_61_];
				if ((((Class97) class97).anInt820 ^ 0xffffffff) <= -1) {
					if (((Class97) class97).anInt820 != 65535) {
						is_60_[5] = Class41.method366(((Class97) class97).anInt820, 1073741824);
						l ^= (long) is_60_[5] << 1378327584;
					} else {
						is_60_[5] = 0;
						l ^= ~0xffffffffL;
					}
				}
				if (((Class97) class97).anInt809 >= 0) {
					if ((((Class97) class97).anInt809 ^ 0xffffffff) != -65536) {
						is_60_[3] = Class41.method366(((Class97) class97).anInt809, 1073741824);
						l ^= (long) is_60_[3];
					} else {
						is_60_[3] = 0;
						l ^= 0xffffffffL;
					}
				}
			}
			boolean bool_62_ = false;
			boolean bool_63_ = false;
			boolean bool_64_ = false;
			boolean bool_65_ = class97 != null || class97_50_ != null;
			int i_66_ = class226s == null ? 0 : class226s.length;
			for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (i_66_ ^ 0xffffffff); i_67_++) {
				PacketParser.aClass98_Sub46_Sub16Array5468[i_67_] = null;
				if (class226s[i_67_] != null) {
					Class97 class97_68_ = class183.method2623((((Class226) class226s[i_67_]).anInt1700), 16383);
					if (((Class97) class97_68_).anIntArray818 != null) {
						bool_65_ = true;
						Class356.aClass97Array3023[i_67_] = class97_68_;
						int i_69_ = ((Class226) class226s[i_67_]).anInt1702;
						int i_70_ = ((Class226) class226s[i_67_]).anInt1701;
						int i_71_ = ((Class97) class97_68_).anIntArray818[i_69_];
						PacketParser.aClass98_Sub46_Sub16Array5468[i_67_] = class183.method2624(2, i_71_ >>> -1761370288);
						i_71_ &= 0xffff;
						Class367.anIntArray3546[i_67_] = i_71_;
						if (PacketParser.aClass98_Sub46_Sub16Array5468[i_67_] != null) {
							bool_63_ |= PacketParser.aClass98_Sub46_Sub16Array5468[i_67_].method1619(i_71_, 31239);
							bool_62_ |= PacketParser.aClass98_Sub46_Sub16Array5468[i_67_].method1617(false, i_71_);
							bool_64_ = bool_64_ | PacketParser.aClass98_Sub46_Sub16Array5468[i_67_].method1615(i_71_, !bool);
						}
						if ((!((Class97) class97_68_).aBoolean825 && !Class357.aBoolean3027) || i_70_ == -1 || ((i_70_ ^ 0xffffffff) <= ((((Class97) class97_68_).anIntArray818).length ^ 0xffffffff))) {
							Class98_Sub10_Sub17.anIntArray5624[i_67_] = 0;
							Class218.anIntArray1631[i_67_] = 0;
							Class351.aClass98_Sub46_Sub16Array2924[i_67_] = null;
							Class292.anIntArray3355[i_67_] = -1;
						} else {
							Class98_Sub10_Sub17.anIntArray5624[i_67_] = ((Class97) class97_68_).anIntArray811[i_69_];
							Class218.anIntArray1631[i_67_] = ((Class226) class226s[i_67_]).anInt1707;
							int i_72_ = ((Class97) class97_68_).anIntArray818[i_70_];
							Class351.aClass98_Sub46_Sub16Array2924[i_67_] = class183.method2624(2, i_72_ >>> 347419536);
							i_72_ &= 0xffff;
							Class292.anIntArray3355[i_67_] = i_72_;
							if (Class351.aClass98_Sub46_Sub16Array2924[i_67_] != null) {
								bool_63_ |= Class351.aClass98_Sub46_Sub16Array2924[i_67_].method1619(i_72_, 31239);
								bool_62_ |= Class351.aClass98_Sub46_Sub16Array2924[i_67_].method1617(false, i_72_);
								bool_64_ |= Class351.aClass98_Sub46_Sub16Array2924[i_67_].method1615(i_72_, false);
							}
						}
					}
				}
			}
			int i_73_ = -1;
			int i_74_ = -1;
			int i_75_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_76_ = null;
			int i_77_ = -1;
			int i_78_ = -1;
			int i_79_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16_80_ = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_81_ = null;
			if (bool_65_) {
				i_59_ |= 0x20;
				if (class97 != null) {
					i_73_ = ((Class97) class97).anIntArray818[i];
					int i_82_ = i_73_ >>> -454090480;
					i_73_ &= 0xffff;
					class98_sub46_sub16 = class183.method2624(2, i_82_);
					if (class98_sub46_sub16 != null) {
						bool_63_ |= class98_sub46_sub16.method1619(i_73_, 31239);
						bool_62_ |= class98_sub46_sub16.method1617(false, i_73_);
						bool_64_ |= class98_sub46_sub16.method1615(i_73_, false);
					}
					if ((((Class97) class97).aBoolean825 || Class357.aBoolean3027) && (i_56_ ^ 0xffffffff) != 0 && ((Class97) class97).anIntArray818.length > i_56_) {
						i_74_ = ((Class97) class97).anIntArray818[i_56_];
						i_75_ = ((Class97) class97).anIntArray811[i];
						int i_83_ = i_74_ >>> -240024528;
						class98_sub46_sub16_76_ = ((i_83_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff) ? class98_sub46_sub16 : class183.method2624(2, i_83_));
						i_74_ &= 0xffff;
						if (class98_sub46_sub16_76_ != null) {
							bool_63_ |= class98_sub46_sub16_76_.method1619(i_74_, 31239);
							bool_62_ |= class98_sub46_sub16_76_.method1617(false, i_74_);
							bool_64_ |= class98_sub46_sub16_76_.method1615(i_74_, false);
						}
					}
				}
				if (class97_50_ != null) {
					i_77_ = ((Class97) class97_50_).anIntArray818[i_57_];
					int i_84_ = i_77_ >>> 1300157968;
					i_77_ &= 0xffff;
					class98_sub46_sub16_80_ = class183.method2624(2, i_84_);
					if (class98_sub46_sub16_80_ != null) {
						bool_63_ |= class98_sub46_sub16_80_.method1619(i_77_, 31239);
						bool_62_ = bool_62_ | class98_sub46_sub16_80_.method1617(!bool, i_77_);
						bool_64_ |= class98_sub46_sub16_80_.method1615(i_77_, false);
					}
					if ((((Class97) class97_50_).aBoolean825 || Class357.aBoolean3027) && i_54_ != -1 && (((Class97) class97_50_).anIntArray818.length > i_54_)) {
						i_79_ = ((Class97) class97_50_).anIntArray811[i_57_];
						i_78_ = ((Class97) class97_50_).anIntArray818[i_54_];
						int i_85_ = i_78_ >>> -1612855760;
						class98_sub46_sub16_81_ = ((i_85_ ^ 0xffffffff) != (i_84_ ^ 0xffffffff) ? class183.method2624(2, i_85_) : class98_sub46_sub16_80_);
						i_78_ &= 0xffff;
						if (class98_sub46_sub16_81_ != null) {
							bool_63_ |= class98_sub46_sub16_81_.method1619(i_78_, 31239);
							bool_62_ |= class98_sub46_sub16_81_.method1617(false, i_78_);
							bool_64_ |= class98_sub46_sub16_81_.method1615(i_78_, false);
						}
					}
				}
				if (bool_63_)
					i_59_ |= 0x80;
				if (bool_62_)
					i_59_ |= 0x100;
				if (bool_64_)
					i_59_ |= 0x400;
			}
			AbstractModel class146;
			synchronized (Class211.aClass79_1594) {
				class146 = (AbstractModel) Class211.aClass79_1594.get(l);
			}
			RenderAnimDefinitions class294 = null;
			if ((anInt2682 ^ 0xffffffff) != 0)
				class294 = class257.method3199(false, anInt2682);
			if (class146 == null || (var_ha.c(class146.ua(), i_59_) ^ 0xffffffff) != -1) {
				if (class146 != null)
					i_59_ = var_ha.method1777(i_59_, class146.ua());
				int i_86_ = i_59_;
				boolean bool_87_ = false;
				for (int i_88_ = 0; i_88_ < 12; i_88_++) {
					int i_89_ = is_60_[i_88_];
					if ((i_89_ & 0x40000000 ^ 0xffffffff) == -1) {
						if ((i_89_ & ~0x7fffffff ^ 0xffffffff) != -1 && !class83.method826(0x3fffffff & i_89_, 3).method2475(0))
							bool_87_ = true;
					} else if (!class205.getItemDefs(i_89_ & 0x3fffffff).method3492(0, ((PlayerAppearance) this).aBoolean2681))
						bool_87_ = true;
				}
				if (!bool_87_) {
					ModelDefinitions[] class178s = new ModelDefinitions[12];
					for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > -13; i_90_++) {
						int i_91_ = is_60_[i_90_];
						if ((i_91_ & 0x40000000 ^ 0xffffffff) == -1) {
							if ((~0x7fffffff & i_91_ ^ 0xffffffff) != -1) {
								ModelDefinitions class178 = class83.method826(0x3fffffff & i_91_, 3).method2473(2);
								if (class178 != null)
									class178s[i_90_] = class178;
							}
						} else {
							ModelDefinitions class178 = (class205.getItemDefs(0x3fffffff & i_91_).method3500(((PlayerAppearance) this).aBoolean2681, 124));
							if (class178 != null)
								class178s[i_90_] = class178;
						}
					}
					if (class294 != null && ((RenderAnimDefinitions) class294).anIntArrayArray2366 != null) {
						for (int i_92_ = 0; (((RenderAnimDefinitions) class294).anIntArrayArray2366.length > i_92_); i_92_++) {
							if (class178s[i_92_] != null) {
								int i_93_ = 0;
								int i_94_ = 0;
								int i_95_ = 0;
								int i_96_ = 0;
								int i_97_ = 0;
								int i_98_ = 0;
								if ((((RenderAnimDefinitions) class294).anIntArrayArray2366[i_92_]) != null) {
									i_98_ = ((((RenderAnimDefinitions) class294).anIntArrayArray2366[i_92_][5]) << -264909725);
									i_96_ = ((((RenderAnimDefinitions) class294).anIntArrayArray2366[i_92_][3]) << 819372707);
									i_94_ = (((RenderAnimDefinitions) class294).anIntArrayArray2366[i_92_][1]);
									i_97_ = ((((RenderAnimDefinitions) class294).anIntArrayArray2366[i_92_][4]) << 1212264099);
									i_93_ = (((RenderAnimDefinitions) class294).anIntArrayArray2366[i_92_][0]);
									i_95_ = (((RenderAnimDefinitions) class294).anIntArrayArray2366[i_92_][2]);
								}
								if ((i_96_ ^ 0xffffffff) != -1 || (i_97_ ^ 0xffffffff) != -1 || i_98_ != 0)
									class178s[i_92_].method2600(i_98_, i_96_, (byte) 117, i_97_);
								if (i_93_ != 0 || i_94_ != 0 || i_95_ != 0)
									class178s[i_92_].method2597(i_95_, i_93_, (byte) 104, i_94_);
							}
						}
					}
					i_86_ |= 0x4000;
					ModelDefinitions class178 = new ModelDefinitions(class178s, class178s.length);
					class146 = var_ha.method1790(class178, i_86_, Class81.anInt624, 64, 850);
					for (int i_99_ = 0; i_99_ < 5; i_99_++) {
						for (int i_100_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_100_ ^ 0xffffffff)); i_100_++) {
							if (((Class61.aShortArrayArrayArray478[i_100_][i_99_]).length ^ 0xffffffff) < (((PlayerAppearance) this).anIntArray2683[i_99_] ^ 0xffffffff))
								class146.ia((Class98_Sub10_Sub11.aShortArrayArray5597[i_100_][i_99_]), (Class61.aShortArrayArrayArray478[i_100_][i_99_][(((PlayerAppearance) this).anIntArray2683[i_99_])]));
						}
					}
					if (bool_52_) {
						class146.s(i_59_);
						synchronized (Class211.aClass79_1594) {
							Class211.aClass79_1594.put(l, class146);
						}
						aLong2679 = l;
					}
				} else {
					if (aLong2679 != -1L) {
						synchronized (Class211.aClass79_1594) {
							class146 = (AbstractModel) Class211.aClass79_1594.get(aLong2679);
						}
					}
					if (class146 == null || var_ha.c(class146.ua(), i_59_) != 0)
						return null;
				}
			}
			AbstractModel class146_101_ = class146.method2341((byte) 4, i_59_, bool);
			boolean bool_102_ = false;
			if (is != null) {
				for (int i_103_ = 0; i_103_ < 12; i_103_++) {
					if ((is[i_103_] ^ 0xffffffff) != 0)
						bool_102_ = true;
				}
			}
			if (!bool_65_ && !bool_102_)
				return class146_101_;
			Class111[] class111s = null;
			if (class294 != null)
				class111s = class294.method3481(var_ha, (byte) 45);
			if (bool_102_ && class111s != null) {
				for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > -13; i_104_++) {
					if (class111s[i_104_] != null)
						class146_101_.method2331(class111s[i_104_], 1 << i_104_, true);
				}
			}
			int i_105_ = 0;
			int i_106_ = 1;
			for (/**/; i_66_ > i_105_; i_105_++) {
				if (PacketParser.aClass98_Sub46_Sub16Array5468[i_105_] != null)
					class146_101_.method2323(Class367.anIntArray3546[i_105_], -1 + Class218.anIntArray1631[i_105_], Class351.aClass98_Sub46_Sub16Array2924[i_105_], -27033, i_106_, PacketParser.aClass98_Sub46_Sub16Array5468[i_105_], false, Class292.anIntArray3355[i_105_], null, 0, Class98_Sub10_Sub17.anIntArray5624[i_105_]);
				i_106_ <<= 1;
			}
			if (bool_102_) {
				for (int i_107_ = 0; (i_107_ ^ 0xffffffff) > -13; i_107_++) {
					if (is[i_107_] != -1) {
						int i_108_ = -i_58_ + is[i_107_];
						i_108_ &= 0x3fff;
						Class111 class111 = var_ha.method1821();
						class111.method2101(i_108_);
						class146_101_.method2331(class111, 1 << i_107_, false);
					}
				}
			}
			if (bool_102_ && class111s != null) {
				for (int i_109_ = 0; i_109_ < 12; i_109_++) {
					if (class111s[i_109_] != null)
						class146_101_.method2331(class111s[i_109_], 1 << i_109_, false);
				}
			}
			if (class98_sub46_sub16 == null || class98_sub46_sub16_80_ == null) {
				if (class98_sub46_sub16 != null)
					class146_101_.method2338(-1 + i_55_, class98_sub46_sub16, i_73_, class98_sub46_sub16_76_, false, 0, 112, i_75_, i_74_);
				else if (class98_sub46_sub16_80_ != null)
					class146_101_.method2338(i_51_ - 1, class98_sub46_sub16_80_, i_77_, class98_sub46_sub16_81_, false, 0, 119, i_79_, i_78_);
			} else
				class146_101_.method2321(i_75_, i_73_, class98_sub46_sub16, class98_sub46_sub16_76_, ((Class97) class97).aBooleanArray813, i_79_, 28777, i_77_, class98_sub46_sub16_80_, i_78_, -1 + i_55_, false, class98_sub46_sub16_81_, -1 + i_51_, i_74_);
			for (int i_110_ = 0; i_66_ > i_110_; i_110_++) {
				PacketParser.aClass98_Sub46_Sub16Array5468[i_110_] = null;
				Class351.aClass98_Sub46_Sub16Array2924[i_110_] = null;
				Class356.aClass97Array3023[i_110_] = null;
			}
			return class146_101_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.K(" + (class257 != null ? "{...}" : "null") + ',' + (class97 != null ? "{...}" : "null") + ',' + (class97_50_ != null ? "{...}" : "null") + ',' + (class183 != null ? "{...}" : "null") + ',' + i + ',' + (class83 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (class205 != null ? "{...}" : "null") + ',' + bool + ',' + i_51_ + ',' + (class226s != null ? "{...}" : "null") + ',' + (class301 != null ? "{...}" : "null") + ',' + (interface6 != null ? "{...}" : "null") + ',' + bool_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ',' + i_56_ + ',' + i_57_ + ',' + i_58_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class98_Sub10 method3630(int i, int i_111_) {
		try {
			int i_112_ = -26 / ((i_111_ - 54) / 40);
			int i_113_ = i;
			while_216_: do {
				while_215_: do {
					while_214_: do {
						while_213_: do {
							while_212_: do {
								while_211_: do {
									while_210_: do {
										while_209_: do {
											while_208_: do {
												while_207_: do {
													while_206_: do {
														while_205_: do {
															while_204_: do {
																while_203_: do {
																	while_202_: do {
																		while_201_: do {
																			while_200_: do {
																				while_199_: do {
																					while_198_: do {
																						while_197_: do {
																							while_196_: do {
																								while_195_: do {
																									while_194_: do {
																										while_193_: do {
																											while_192_: do {
																												while_191_: do {
																													while_190_: do {
																														while_189_: do {
																															while_188_: do {
																																while_187_: do {
																																	while_186_: do {
																																		while_185_: do {
																																			while_184_: do {
																																				while_183_: do {
																																					while_182_: do {
																																						while_181_: do {
																																							while_180_: do {
																																								while_179_: do {
																																									while_178_: do {
																																										do {
																																											if (i_113_ != 0) {
																																												if ((i_113_ ^ 0xffffffff) == -2)
																																													break;
																																												if (i_113_ == 2)
																																													break while_178_;
																																												if (i_113_ == 3)
																																													break while_179_;
																																												if (i_113_ == 4)
																																													break while_180_;
																																												if (i_113_ == 5)
																																													break while_181_;
																																												if (i_113_ == 6)
																																													break while_182_;
																																												if (i_113_ == 7)
																																													break while_183_;
																																												if ((i_113_ ^ 0xffffffff) == -9)
																																													break while_184_;
																																												if ((i_113_ ^ 0xffffffff) == -10)
																																													break while_185_;
																																												if (i_113_ == 10)
																																													break while_186_;
																																												if (i_113_ == 11)
																																													break while_187_;
																																												if (i_113_ == 12)
																																													break while_188_;
																																												if ((i_113_ ^ 0xffffffff) == -14)
																																													break while_189_;
																																												if ((i_113_ ^ 0xffffffff) == -15)
																																													break while_190_;
																																												if (i_113_ == 15)
																																													break while_191_;
																																												if (i_113_ == 16)
																																													break while_192_;
																																												if ((i_113_ ^ 0xffffffff) == -18)
																																													break while_193_;
																																												if ((i_113_ ^ 0xffffffff) == -19)
																																													break while_194_;
																																												if (i_113_ == 19)
																																													break while_195_;
																																												if (i_113_ == 20)
																																													break while_196_;
																																												if (i_113_ == 21)
																																													break while_197_;
																																												if ((i_113_ ^ 0xffffffff) == -23)
																																													break while_198_;
																																												if (i_113_ == 23)
																																													break while_199_;
																																												if ((i_113_ ^ 0xffffffff) == -25)
																																													break while_200_;
																																												if ((i_113_ ^ 0xffffffff) == -26)
																																													break while_201_;
																																												if (i_113_ == 26)
																																													break while_202_;
																																												if (i_113_ == 27)
																																													break while_203_;
																																												if (i_113_ == 28)
																																													break while_204_;
																																												if (i_113_ == 29)
																																													break while_205_;
																																												if ((i_113_ ^ 0xffffffff) == -31)
																																													break while_206_;
																																												if (i_113_ == 31)
																																													break while_207_;
																																												if (i_113_ == 32)
																																													break while_208_;
																																												if (i_113_ == 33)
																																													break while_209_;
																																												if ((i_113_ ^ 0xffffffff) == -35)
																																													break while_210_;
																																												if (i_113_ == 35)
																																													break while_211_;
																																												if ((i_113_ ^ 0xffffffff) == -37)
																																													break while_212_;
																																												if (i_113_ == 37)
																																													break while_213_;
																																												if ((i_113_ ^ 0xffffffff) == -39)
																																													break while_214_;
																																												if (i_113_ != 39)
																																													break while_216_;
																																												if (!client.aBoolean3553)
																																													break while_215_;
																																											}
																																											return new Class98_Sub10_Sub13();
																																										} while (false);
																																										return new Class98_Sub10_Sub22();
																																									} while (false);
																																									return new Class98_Sub10_Sub18();
																																								} while (false);
																																								return new Class98_Sub10_Sub3();
																																							} while (false);
																																							return new Class98_Sub10_Sub38();
																																						} while (false);
																																						return new Class98_Sub10_Sub24();
																																					} while (false);
																																					return new Class98_Sub10_Sub15();
																																				} while (false);
																																				return new Class98_Sub10_Sub7();
																																			} while (false);
																																			return new Class98_Sub10_Sub9();
																																		} while (false);
																																		return new Class98_Sub10_Sub11();
																																	} while (false);
																																	return new Class98_Sub10_Sub33();
																																} while (false);
																																return new Class98_Sub10_Sub4();
																															} while (false);
																															return new Class98_Sub10_Sub30();
																														} while (false);
																														return new Class98_Sub10_Sub8();
																													} while (false);
																													return new Class98_Sub10_Sub17();
																												} while (false);
																												return new Class98_Sub10_Sub26();
																											} while (false);
																											return new Class98_Sub10_Sub32();
																										} while (false);
																										return new Class98_Sub10_Sub6();
																									} while (false);
																									return new Class98_Sub10_Sub5_Sub1();
																								} while (false);
																								return new Class98_Sub10_Sub2();
																							} while (false);
																							return new Class98_Sub10_Sub29();
																						} while (false);
																						return new Class98_Sub10_Sub12();
																					} while (false);
																					return new Class98_Sub10_Sub39();
																				} while (false);
																				return new Class98_Sub10_Sub27();
																			} while (false);
																			return new Class98_Sub10_Sub16();
																		} while (false);
																		return new Class98_Sub10_Sub14();
																	} while (false);
																	return (new Class98_Sub10_Sub31());
																} while (false);
																return (new Class98_Sub10_Sub23());
															} while (false);
															return (new Class98_Sub10_Sub28());
														} while (false);
														return (new Class98_Sub10_Sub36());
													} while (false);
													return (new Class98_Sub10_Sub10());
												} while (false);
												return (new Class98_Sub10_Sub34());
											} while (false);
											return new Class98_Sub10_Sub37();
										} while (false);
										return new Class98_Sub10_Sub20();
									} while (false);
									return new Class98_Sub10_Sub35();
								} while (false);
								return new Class98_Sub10_Sub1();
							} while (false);
							return new Class98_Sub10_Sub25();
						} while (false);
						return new Class98_Sub10_Sub21();
					} while (false);
					return new Class98_Sub10_Sub19();
				} while (false);
				return new Class98_Sub10_Sub5();
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tfa.A(" + i + ',' + i_111_ + ')');
		}
	}

	final void method3631(int i, int i_114_, Class83 class83, int i_115_) {
		try {
			int i_116_ = Class370.anIntArray3135[i_114_];
			if (i == 12 && class83.method826(i_115_, 3) != null) {
				anIntArray2685[i_116_] = Class41.method366(i_115_, -2147483648);
				System.out.println("Info " + anIntArray2685[i_116_]);
				method3633(i + 105);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.E(" + i + ',' + i_114_ + ',' + (class83 != null ? "{...}" : "null") + ',' + i_115_ + ')'));
		}
	}

	final void method3632(int i, int i_117_, int i_118_) {
		try {
			if (i_118_ == -9) {
				((PlayerAppearance) this).anIntArray2683[i_117_] = i;
				method3633(87);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.H(" + i + ',' + i_117_ + ',' + i_118_ + ')'));
		}
	}

	private final void method3633(int i) {
		try {
			long[] ls = Class374.aLongArray3164;
			aLong2678 = -1L;
			aLong2678 = (aLong2678 >>> -9573176 ^ ls[(int) (0xffL & (aLong2678 ^ (long) (anInt2682 >> 1903458056)))]);
			aLong2678 = (aLong2678 >>> 1694471240 ^ ls[(int) (0xffL & ((long) anInt2682 ^ aLong2678))]);
			if (i <= 86)
				method3635(false, false);
			for (int i_119_ = 0; (i_119_ ^ 0xffffffff) > -13; i_119_++) {
				aLong2678 = (ls[(int) (0xffL & (aLong2678 ^ (long) (anIntArray2685[i_119_] >> -1026146760)))] ^ aLong2678 >>> 1854597576);
				aLong2678 = (aLong2678 >>> 649681160 ^ ls[(int) (0xffL & ((long) (anIntArray2685[i_119_] >> -773668400) ^ aLong2678))]);
				aLong2678 = (aLong2678 >>> 519626696 ^ ls[(int) (((long) (anIntArray2685[i_119_] >> -1074692952) ^ aLong2678) & 0xffL)]);
				aLong2678 = (ls[(int) (0xffL & (aLong2678 ^ (long) anIntArray2685[i_119_]))] ^ aLong2678 >>> 690165768);
			}
			for (int i_120_ = 0; i_120_ < 5; i_120_++)
				aLong2678 = (ls[(int) (0xffL & ((long) (((PlayerAppearance) this).anIntArray2683[i_120_]) ^ aLong2678))] ^ aLong2678 >>> 376623304);
			aLong2678 = (aLong2678 >>> -1793821816 ^ ls[(int) (((long) (!((PlayerAppearance) this).aBoolean2681 ? 0 : 1) ^ aLong2678) & 0xffL)]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tfa.F(" + i + ')');
		}
	}

	final void method3634(int i, int i_121_, ItemDefinitionList class205, int i_122_) {
		try {
			if (i_122_ != 1073741824)
				((PlayerAppearance) this).aBoolean2681 = false;
			if (i != -1) {
				if (class205.getItemDefs(i) != null) {
					anIntArray2685[i_121_] = Class41.method366(1073741824, i);
					method3633(i_122_ ^ 0x4000005d);
				}
			} else
				anIntArray2685[i_121_] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.L(" + i + ',' + i_121_ + ',' + (class205 != null ? "{...}" : "null") + ',' + i_122_ + ')'));
		}
	}

	final void method3635(boolean bool, boolean bool_123_) {
		try {
			((PlayerAppearance) this).aBoolean2681 = bool;
			if (bool_123_ != false)
				method3628(null, null, null, null, 16, null, null, null, false, -109, null, null, null, false, 116, 111, 105, -25, 30, -75, null);
			method3633(123);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.D(" + bool + ',' + bool_123_ + ')'));
		}
	}

	static final int method3636(int i, int i_124_) {
		if (Class40.anIntArrayArray367 != null)
			return Class40.anIntArrayArray367[i][i_124_] & 0xffffff;
		return 0;
	}

	public PlayerAppearance() {
		/* empty */
	}
}
