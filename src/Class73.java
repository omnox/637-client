/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73 implements Interface20 {
	int anInt3480;
	int anInt3481;
	int anInt3483;
	int anInt3484;
	static Class6 aClass6_3485;
	int anInt3486;
	int anInt3487;
	boolean aBoolean3488;

	static final boolean method719(int i, int i_0_, int i_1_, int i_2_) {
		try {
			RuntimeException_Sub1.aClass111_3203.method2103(i_0_, i_1_, i, Class114.anIntArray958);
			int i_3_ = Class114.anIntArray958[2];
			if (i_3_ < 50)
				return false;
			Class114.anIntArray958[1] = (Class331.anInt2800 * Class114.anIntArray958[1] / i_3_ + Class98_Sub10_Sub23.anInt5659);
			Class114.anIntArray958[2] = i_3_;
			Class114.anIntArray958[i_2_] = (Class38.anInt358 * Class114.anIntArray958[0] / i_3_ + Class2.anInt69);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eo.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public final long method69(boolean bool) {
		try {
			long[] ls = Class374.aLongArray3164;
			long l = -1L;
			l = (l >>> 8 ^ ls[(int) (0xffL & ((long) this.anInt3483 ^ l))]);
			l = (l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt3480 >> 8)) & 0xffL)]);
			l = (ls[(int) (((long) this.anInt3480 ^ l) & 0xffL)] ^ l >>> 8);
			l = (l >>> 8 ^ ls[(int) (0xffL & (l ^ (long) (this.anInt3484 >> 24)))]);
			l = ls[(int) ((l ^ (long) (this.anInt3484 >> 16)) & 0xffL)] ^ l >>> 8;
			l = (l >>> 8 ^ ls[(int) (0xffL & ((long) (this.anInt3484 >> 8) ^ l))]);
			l = (ls[(int) ((l ^ (long) this.anInt3484) & 0xffL)] ^ l >>> 8);
			l = (l >>> 8 ^ ls[(int) (0xffL & ((long) this.anInt3486 ^ l))]);
			l = ls[(int) (((long) (this.anInt3487 >> 24) ^ l) & 0xffL)] ^ l >>> 8;
			l = ls[(int) (0xffL & ((long) (this.anInt3487 >> 16) ^ l))] ^ l >>> 8;
			l = (l >>> 8 ^ ls[(int) (0xffL & (l ^ (long) (this.anInt3487 >> 8)))]);
			l = l >>> 8 ^ ls[(int) (((long) this.anInt3487 ^ l) & 0xffL)];
			l = (ls[(int) ((l ^ (long) this.anInt3481) & 0xffL)] ^ l >>> 8);
			l = (l >>> 8 ^ ls[(int) (0xffL & ((long) (!this.aBoolean3488 ? 0 : 1) ^ l))]);
			if (bool != true)
				method721(null, -115, '$');
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eo.C(" + bool + ')');
		}
	}

	public final boolean method68(int i, Interface20 interface20) {
		try {
			if (!(interface20 instanceof Class73))
				return false;
			Class73 class73_4_ = (Class73) interface20;
			if (this.anInt3483 != class73_4_.anInt3483)
				return false;
			if (class73_4_.anInt3480 != this.anInt3480)
				return false;
			if (class73_4_.anInt3484 != this.anInt3484)
				return false;
			if (this.anInt3486 != class73_4_.anInt3486)
				return false;
			if (class73_4_.anInt3487 != this.anInt3487)
				return false;
			if (this.anInt3481 != class73_4_.anInt3481)
				return false;
			if (i != 22000)
				this.anInt3483 = -99;
			if (!this.aBoolean3488 == class73_4_.aBoolean3488)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eo.D(" + i + ',' + (interface20 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method720(int i) {
		try {
			IncomingOpcode.aClass58_3482 = null;
			aClass6_3485 = null;
			int i_5_ = 127 % ((i - -9) / 46);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eo.B(" + i + ')');
		}
	}

	static final int method721(String string, int i, char c) {
		try {
			int i_6_ = 0;
			int i_7_ = string.length();
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				if (string.charAt(i_8_) == c)
					i_6_++;
			}
			if (i < 10)
				method720(61);
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eo.E(" + (string != null ? "{...}" : "null") + ',' + i + ',' + c + ')'));
		}
	}
}
