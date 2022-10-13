/* Class98_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub47 extends Node {
	int anInt4266;
	int anInt4267;
	int anInt4268 = -1;
	int anInt4269;
	int anInt4271;
	int anInt4272;
	static Class332 aClass332_4273;
	static Class377 aClass377_4274 = new Class377(16);
	boolean aBoolean4275 = false;
	static int anInt4276 = 0;

	static final void method1658(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			if (i_3_ == i_1_)
				Class64_Sub17.method620(i, i_1_, true, i_0_, i_4_);
			else {
				if (i_2_ != 16977)
					IncomingOpcode.aClass58_4270 = null;
				if (-i_1_ + i_0_ >= Class76_Sub8.anInt3778 && i_0_ + i_1_ <= Class3.anInt77 && -i_3_ + i >= Class98_Sub10_Sub38.anInt5753 && i + i_3_ <= Class218.anInt1635)
					Class284.method3362(i, i_1_, i_4_, (byte) -119, i_0_, i_3_);
				else
					Class40.method364(i_3_, i_0_, i_1_, i, i_2_ + -17066, i_4_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uca.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method1659(int i) {
		try {
			IncomingOpcode.aClass58_4270 = null;
			aClass332_4273 = null;
			int i_5_ = -84 / ((i - 11) / 35);
			aClass377_4274 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uca.A(" + i + ')');
		}
	}

	Class98_Sub47(int i) {
		try {
			//i = sprite id or something, yet to figure it out lelele
			this.anInt4268 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uca.<init>(" + i + ')');
		}
	}
}
