/* Class98_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub3 extends Node {
	int[] anIntArray3823 = new int[1];
	int[] anIntArray3824 = { -1 };
	static int anInt3825 = 0;

	final AbstractModel method951(Class97 class97, int i, int i_0_, boolean bool, PlayerAppearance class313, int i_1_, int i_2_, int i_3_, byte i_4_, ha var_ha) {
		try {
			AbstractModel class146 = null;
			int i_5_ = i_2_;
			RenderAnimDefinitions class294 = null;
			if (i_1_ != -1)
				class294 = Class370.aClass257_3136.method3199(false, i_1_);
			int[] is = this.anIntArray3824;
			if (class294 != null && class294.anIntArray2379 != null) {
				is = new int[class294.anIntArray2379.length];
				for (int i_6_ = 0; (class294.anIntArray2379.length > i_6_); i_6_++) {
					int i_7_ = class294.anIntArray2379[i_6_];
					if (i_7_ < 0 || (this.anIntArray3824.length <= i_7_))
						is[i_6_] = -1;
					else
						is[i_6_] = this.anIntArray3824[i_7_];
				}
			}
			boolean bool_8_ = false;
			boolean bool_9_ = false;
			boolean bool_10_ = false;
			boolean bool_11_ = false;
			int i_12_ = -1;
			int i_13_ = -1;
			int i_14_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_15_ = null;
			if (i_4_ > -43)
				method951(null, 78, 100, false, null, 112, 24, -42, (byte) 36, null);
			if (class97 != null) {
				i_5_ |= 0x20;
				i_12_ = class97.anIntArray818[i_0_];
				int i_16_ = i_12_ >>> 16;
				class98_sub46_sub16 = Class151_Sub7.aClass183_5001.method2624(2, i_16_);
				i_12_ &= 0xffff;
				if (class98_sub46_sub16 != null) {
					bool_9_ |= class98_sub46_sub16.method1619(i_12_, 31239);
					bool_8_ |= class98_sub46_sub16.method1617(false, i_12_);
					bool_11_ |= class98_sub46_sub16.method1615(i_12_, false);
					bool_10_ |= class97.aBoolean817;
				}
				if ((class97.aBoolean825 || Class357.aBoolean3027) && i_3_ != -1 && class97.anIntArray818.length > i_3_) {
					i_14_ = class97.anIntArray811[i_0_];
					i_13_ = class97.anIntArray818[i_3_];
					int i_17_ = i_13_ >>> 16;
					i_13_ &= 0xffff;
					if (i_17_ != i_16_)
						class98_sub46_sub16_15_ = Class151_Sub7.aClass183_5001.method2624(2, i_13_ >>> 16);
					else
						class98_sub46_sub16_15_ = class98_sub46_sub16;
					if (class98_sub46_sub16_15_ != null) {
						bool_9_ |= class98_sub46_sub16_15_.method1619(i_13_, 31239);
						bool_8_ |= class98_sub46_sub16_15_.method1617(false, i_13_);
						bool_11_ |= class98_sub46_sub16_15_.method1615(i_13_, false);
					}
				}
				if (bool_9_)
					i_5_ |= 0x80;
				if (bool_8_)
					i_5_ |= 0x100;
				if (bool_10_)
					i_5_ |= 0x200;
				if (bool_11_)
					i_5_ |= 0x400;
			}
			long l = method952(i_1_, bool, is, (class313 != null ? class313.anIntArray2683 : null), -29509);
			if (r_Sub1.aClass79_6321 != null)
				class146 = (AbstractModel) r_Sub1.aClass79_6321.get(l);
			if (class146 == null || var_ha.c(class146.ua(), i_5_) != 0) {
				if (class146 != null)
					i_5_ = var_ha.method1777(i_5_, class146.ua());
				int i_18_ = i_5_;
				boolean bool_19_ = false;
				for (int i_20_ = 0; i_20_ < is.length; i_20_++) {
					if (is[i_20_] != -1 && !Class98_Sub46_Sub19.getItemDefs.getItemDefs(is[i_20_]).method3492(0, bool))
						bool_19_ = true;
				}
				if (bool_19_)
					return null;
				ModelDefinitions[] class178s = new ModelDefinitions[is.length];
				for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
					if (is[i_21_] != -1)
						class178s[i_21_] = Class98_Sub46_Sub19.getItemDefs.getItemDefs(is[i_21_]).method3500(bool, 109);
				}
				if (class294 != null && class294.anIntArrayArray2366 != null) {
					for (int i_22_ = 0; (class294.anIntArrayArray2366.length > i_22_); i_22_++) {
						if ((class294.anIntArrayArray2366[i_22_] != null) && class178s[i_22_] != null) {
							int i_23_ = (class294.anIntArrayArray2366[i_22_][0]);
							int i_24_ = (class294.anIntArrayArray2366[i_22_][1]);
							int i_25_ = (class294.anIntArrayArray2366[i_22_][2]);
							int i_26_ = (class294.anIntArrayArray2366[i_22_][3]);
							int i_27_ = (class294.anIntArrayArray2366[i_22_][4]);
							int i_28_ = (class294.anIntArrayArray2366[i_22_][5]);
							if (i_26_ != 0 || i_27_ != 0 || i_28_ != 0)
								class178s[i_22_].method2600(i_28_, i_26_, (byte) -128, i_27_);
							if (i_23_ != 0 || i_24_ != 0 || i_25_ != 0)
								class178s[i_22_].method2597(i_25_, i_23_, (byte) 108, i_24_);
						}
					}
				}
				if (class313 != null)
					i_18_ |= 0x4000;
				ModelDefinitions class178 = new ModelDefinitions(class178s, class178s.length);
				class146 = var_ha.method1790(class178, i_18_, Class105.anInt3415, 64, 850);
				if (class313 != null) {
					for (int i_29_ = 0; i_29_ < 5; i_29_++) {
						for (int i_30_ = 0; Class61.aShortArrayArrayArray478.length > i_30_; i_30_++) {
							if ((Class61.aShortArrayArrayArray478[i_30_][i_29_]).length > class313.anIntArray2683[i_29_])
								class146.ia((Class98_Sub10_Sub11.aShortArrayArray5597[i_30_][i_29_]), (Class61.aShortArrayArrayArray478[i_30_][i_29_][(class313.anIntArray2683[i_29_])]));
						}
					}
				}
				if (r_Sub1.aClass79_6321 != null) {
					class146.s(i_5_);
					r_Sub1.aClass79_6321.put(l, class146);
				}
			}
			if (class97 == null || class98_sub46_sub16 == null)
				return class146;
			AbstractModel class146_31_ = class146.method2341((byte) 1, i_5_, true);
			class146_31_.method2338(i - 1, class98_sub46_sub16, i_12_, class98_sub46_sub16_15_, class97.aBoolean817, 0, -104, i_14_, i_13_);
			return class146_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bc.A(" + (class97 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + bool + ',' + (class313 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public Class98_Sub3() {
		/* empty */
	}

	private final long method952(int i, boolean bool, int[] is, int[] is_32_, int i_33_) {
		try {
			long[] ls = Class374.aLongArray3164;
			long l = -1L;
			l = (ls[(int) (((long) (i >> 8) ^ l) & 0xffL)] ^ l >>> 8);
			l = ls[(int) (0xffL & ((long) i ^ l))] ^ l >>> 8;
			for (int i_34_ = 0; is.length > i_34_; i_34_++) {
				l = (ls[(int) (((long) (is[i_34_] >> 24) ^ l) & 0xffL)] ^ l >>> 8);
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_34_] >> 16)) & 0xffL)];
				l = (ls[(int) ((l ^ (long) (is[i_34_] >> 8)) & 0xffL)] ^ l >>> 8);
				l = (ls[(int) (0xffL & ((long) is[i_34_] ^ l))] ^ l >>> 8);
			}
			if (is_32_ != null) {
				for (int i_35_ = 0; i_35_ < 5; i_35_++)
					l = l >>> 8 ^ ls[(int) (((long) is_32_[i_35_] ^ l) & 0xffL)];
			}
			if (i_33_ != -29509)
				return -33L;
			l = (ls[(int) (((long) (!bool ? 0 : 1) ^ l) & 0xffL)] ^ l >>> 8);
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bc.B(" + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + (is_32_ != null ? "{...}" : "null") + ',' + i_33_ + ')'));
		}
	}
}
