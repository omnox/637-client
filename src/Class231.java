/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class231 {
	static Class324 aClass324_1733;
	static int[] anIntArray1734 = new int[2];
	private int anInt1735;
	int anInt1736;
	Class11 aClass11_1737;
	int anInt1738;
	static int anInt1739;

	static final String method2873(int i) {
		try {
			if (i != 0)
				aClass324_1733 = null;
			if (Player.aBoolean6540 || Class266.aClass98_Sub46_Sub8_1994 == null)
				return "";
			return (Class266.aClass98_Sub46_Sub8_1994.aString5994);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "op.C(" + i + ')');
		}
	}

	static final Mobile method2874(int i, int i_0_, int i_1_, int i_2_) {
		try {
			Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_]);
			if (i_2_ <= 42)
				method2877(-69);
			if (class172 == null)
				return null;
			Mobile class246_sub3_sub4_sub2 = null;
			int i_3_ = -1;
			for (Class154 class154 = class172.aClass154_1325; class154 != null; class154 = class154.aClass154_1233) {
				Class246_Sub3_Sub4 class246_sub3_sub4 = class154.aClass246_Sub3_Sub4_1232;
				if (class246_sub3_sub4 instanceof Mobile) {
					Mobile class246_sub3_sub4_sub2_4_ = (Mobile) class246_sub3_sub4;
					int i_5_ = (class246_sub3_sub4_sub2_4_.getSize() * 256 + -256 - -252);
					int i_6_ = -i_5_ + (class246_sub3_sub4_sub2_4_.localXPos) >> 9;
					int i_7_ = ((class246_sub3_sub4_sub2_4_.localYPos) + -i_5_ >> 9);
					int i_8_ = ((class246_sub3_sub4_sub2_4_.localXPos) + i_5_ >> 9);
					int i_9_ = ((class246_sub3_sub4_sub2_4_.localYPos) + i_5_ >> 9);
					if (i_0_ >= i_6_ && i_1_ >= i_7_ && i_8_ >= i_0_ && i_9_ >= i_1_) {
						int i_10_ = (i_9_ + 1 - i_1_) * (i_8_ + 1 + -i_0_);
						if (i_3_ < i_10_) {
							i_3_ = i_10_;
							class246_sub3_sub4_sub2 = class246_sub3_sub4_sub2_4_;
						}
					}
				}
			}
			return class246_sub3_sub4_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("op.E(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method2875(int i, int i_11_) {
		try {
			if (Class331.anIntArray2810 == null || (i_11_ > Class331.anIntArray2810.length))
				Class331.anIntArray2810 = new int[i_11_];
			if (i != 256)
				method2875(-98, 95);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "op.F(" + i + ',' + i_11_ + ')');
		}
	}

	final synchronized Class324 method2876(byte i) {
		try {
			if (i != 126)
				anInt1739 = -116;
			Class324 class324 = ((Class324) this.aClass11_1737.aClass79_126.get(anInt1735));
			if (class324 != null)
				return class324;
			class324 = Class324.method3685((this.aClass11_1737.aClass207_124), anInt1735, 0);
			if (class324 != null)
				this.aClass11_1737.aClass79_126.put(anInt1735, class324);
			return class324;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "op.B(" + i + ')');
		}
	}

	public static void method2877(int i) {
		try {
			aClass324_1733 = null;
			if (i <= 0)
				method2878(16);
			anIntArray1734 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "op.H(" + i + ')');
		}
	}

	static final void method2878(int i) {
		try {
			if (i != 2)
				anInt1739 = -105;
			Class61.method538(11, false);
			Class373_Sub3.method3977(true);
			System.gc();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "op.D(" + i + ')');
		}
	}

	private final void method2879(int i, RSByteBuffer class98_sub22, int i_12_) {
		try {
			do {
				if (i != 1) {
					if (i != 2)
						break;
					this.anInt1738 = class98_sub22.readUnsignedByte();
					this.anInt1736 = class98_sub22.readUnsignedByte();
					if (!client.aBoolean3553)
						break;
				}
				anInt1735 = class98_sub22.readShort();
			} while (false);
			int i_13_ = 59 % ((i_12_ - -55) / 48);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("op.G(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_12_ + ')'));
		}
	}

	public Class231() {
		/* empty */
	}

	final void method2880(boolean bool, RSByteBuffer class98_sub22) {
		try {
			if (bool == true) {
				for (;;) {
					int i = class98_sub22.readUnsignedByte();
					if (i == 0)
						break;
					method2879(i, class98_sub22, -127);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("op.A(" + bool + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}
}
