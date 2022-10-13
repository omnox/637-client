/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class186 implements Interface17 {
	private Class333 aClass333_3425;
	int anInt3426;
	int[] anIntArray3427;
	static LinkedList aClass148_3428;
	float[] aFloatArray3429;
	int anInt3430;
	static int anInt3431 = 0;
	private ha_Sub2 aHa_Sub2_3432;
	static Class348 aClass348_3433;

	public final void method56(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		try {
			Class246_Sub3_Sub4_Sub5.method3086(aHa_Sub2_3432.aClass98_Sub32_4478.anInt4105, bool ? (aHa_Sub2_3432.aClass98_Sub32_4478.anIntArray4108) : null, i_0_, i, i_1_, bool_5_ ? this.aFloatArray3429 : null, i_4_, this.anIntArray3427, i_2_, i_3_, !bool_5_ ? null : aHa_Sub2_3432.aFloatArray4488, this.anInt3426, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mga.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + bool + ',' + bool_5_ + ')'));
		}
	}

	public static void method2633(int i) {
		try {
			aClass148_3428 = null;
			if (i != -20830)
				GameWorld.cameraYaw = 49;
			aClass348_3433 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mga.C(" + i + ')');
		}
	}

	public final void method57(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, boolean bool_11_) {
		try {
			Class246_Sub3_Sub4_Sub5.method3086(this.anInt3426, bool ? this.anIntArray3427 : null, i_6_, i, i_7_, bool_11_ ? aHa_Sub2_3432.aFloatArray4488 : null, i_10_, aHa_Sub2_3432.aClass98_Sub32_4478.anIntArray4108, i_8_, i_9_, !bool_11_ ? null : this.aFloatArray3429, aHa_Sub2_3432.aClass98_Sub32_4478.anInt4105, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mga.B(" + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + bool_11_ + ')'));
		}
	}

	Class186(ha_Sub2 var_ha_Sub2, Class332 class332, Class333 class333) {
		do {
			try {
				aHa_Sub2_3432 = var_ha_Sub2;
				do {
					if (!(class332 instanceof Class332_Sub3_Sub2)) {
						if (!(class332 instanceof Class332_Sub3_Sub1))
							throw new RuntimeException();
						Class332_Sub3_Sub1 class332_sub3_sub1 = (Class332_Sub3_Sub1) class332;
						this.anInt3426 = class332_sub3_sub1.anInt5433;
						this.anIntArray3427 = (class332_sub3_sub1.anIntArray6212);
						this.anInt3430 = class332_sub3_sub1.anInt5454;
						if (!client.aBoolean3553)
							break;
					}
					Class332_Sub3_Sub2 class332_sub3_sub2 = (Class332_Sub3_Sub2) class332;
					this.anInt3430 = class332_sub3_sub2.anInt5454;
					this.anIntArray3427 = (class332_sub3_sub2.anIntArray6213);
					this.anInt3426 = class332_sub3_sub2.anInt5433;
				} while (false);
				if (class333 == null)
					break;
				aClass333_3425 = class333;
				if ((aClass333_3425.anInt3388 != this.anInt3426) || (aClass333_3425.anInt3387 != this.anInt3430))
					throw new RuntimeException();
				this.aFloatArray3429 = aClass333_3425.aFloatArray3389;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mga.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (class332 != null ? "{...}" : "null") + ',' + (class333 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass148_3428 = new LinkedList();
		aClass348_3433 = new Class348(8, 0, 4, 1);
	}
}
