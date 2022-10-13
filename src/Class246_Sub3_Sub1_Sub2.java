/* Class246_Sub3_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub1_Sub2 extends Class246_Sub3_Sub1 implements Interface19 {
	static int[] anIntArray6245 = new int[8];
	private boolean aBoolean6246;
	static Class204 aClass204_6247;
	private boolean aBoolean6248 = false;
	Class359 aClass359_6249;
	private Class228 aClass228_6250;
	static int anInt6251 = -1;
	static int anInt6252;

	public final void method67(int i, ha var_ha) {
		do {
			try {
				this.aClass359_6249.method3894((byte) -85, var_ha);
				if (i == -25163)
					break;
				method2981(null, (byte) -78, false, 22, null, 107, 28);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ps.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final void method62(ha var_ha, int i) {
		try {
			if (i != 24447)
				anIntArray6245 = null;
			this.aClass359_6249.method3892(var_ha, 105);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ps.G(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				anInt6251 = -108;
			return this.aClass359_6249.method3899((byte) 125);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.J(" + i + ')');
		}
	}

	public final int method64(int i) {
		try {
			if (i != 30472)
				method3001(55);
			return (this.aClass359_6249.anInt3052);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.C(" + i + ')');
		}
	}

	public final void method61(byte i) {
		try {
			if (i != -96)
				aClass228_6250 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.Q(" + i + ')');
		}
	}

	public final boolean method65(boolean bool) {
		try {
			if (bool != true)
				return true;
			return this.aClass359_6249.method3898(21);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.A(" + bool + ')');
		}
	}

	final boolean method2987(int i) {
		try {
			if (i != 6540)
				method3002(null, (byte) -110);
			return aBoolean6248;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.I(" + i + ')');
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				aClass204_6247 = null;
			return aClass228_6250;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ps.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2992(byte i) {
		try {
			if (i != -73)
				anInt6251 = -80;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.DA(" + i + ')');
		}
	}

	public static void method3001(int i) {
		try {
			if (i != -22408)
				method3001(77);
			aClass204_6247 = null;
			anIntArray6245 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.L(" + i + ')');
		}
	}

	final boolean method2976(int i, ha var_ha, byte i_0_, int i_1_) {
		try {
			AbstractModel class146 = this.aClass359_6249.method3897(-1, false, 131072, var_ha, false);
			if (class146 == null)
				return false;
			if (i_0_ < 59)
				method2990(-80);
			Class111 class111 = var_ha.method1793();
			class111.method2100(this.localXPos, this.anInt5089, this.localYPos);
			if (Class239.aBoolean1839)
				return class146.method2333(i, i_1_, class111, false, 0, Class16.anInt197);
			return class146.method2339(i, i_1_, class111, false, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ps.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method3002(Class185 class185, byte i) {
		try {
			int i_2_ = 127 % ((i - -41) / 46);
			this.aClass359_6249.method3901(class185, -118);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ps.M(" + (class185 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method2982(byte i) {
		try {
			if (i >= -70)
				anIntArray6245 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.HA(" + i + ')');
		}
	}

	final void method2988(ha var_ha, int i) {
		do {
			try {
				int i_3_ = 46 % ((53 - i) / 46);
				AbstractModel class146 = this.aClass359_6249.method3897(-1, true, 262144, var_ha, true);
				if (class146 == null)
					break;
				int i_4_ = this.localXPos >> 9;
				int i_5_ = this.localYPos >> 9;
				Class111 class111 = var_ha.method1793();
				class111.method2100(this.localXPos, this.anInt5089, this.localYPos);
				this.aClass359_6249.method3895(class146, i_4_, i_5_, class111, false, i_4_, var_ha, false, i_5_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ps.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				method66(82);
			return this.aClass359_6249.method3903((byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.O(" + bool + ')');
		}
	}

	final boolean method2978(int i) {
		try {
			int i_6_ = -68 / ((i - -76) / 47);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.H(" + i + ')');
		}
	}

	public final int method66(int i) {
		try {
			if (i != 4657)
				method2976(108, null, (byte) 101, -1);
			return (this.aClass359_6249.anInt3059);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.N(" + i + ')');
		}
	}

	Class246_Sub3_Sub1_Sub2(ha var_ha, Class352 class352, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_) {
		super(i_8_, i_9_, i_10_, i, i_7_, class352.anInt2945);
		try {
			this.aClass359_6249 = new Class359(var_ha, class352, 22, i_11_, i, i_7_, this, bool, i_12_);
			aBoolean6246 = class352.anInt2998 != 0 && !bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ps.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class352 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_13_, ha var_ha, int i_14_, int i_15_) {
		try {
			int i_16_ = -32 / ((i - 15) / 55);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ps.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_13_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			AbstractModel class146 = this.aClass359_6249.method3897(-1, false, 2048, var_ha, true);
			if (class146 == null)
				return null;
			Class111 class111 = var_ha.method1793();
			class111.method2100(this.localXPos, this.anInt5089, this.localYPos);
			Class246_Sub1 class246_sub1 = Class94.method915(1, (byte) -47, aBoolean6246);
			int i_17_ = this.localXPos >> 9;
			if (i >= -12)
				method2975(null, -86);
			int i_18_ = this.localYPos >> 9;
			this.aClass359_6249.method3895(class146, i_17_, i_18_, class111, true, i_17_, var_ha, false, i_18_);
			if (!Class239.aBoolean1839)
				class146.method2325(class111, (class246_sub1.aClass246_Sub6Array5067[0]), 0);
			else
				class146.method2329(class111, (class246_sub1.aClass246_Sub6Array5067[0]), Class16.anInt197, 0);
			if ((this.aClass359_6249.aClass246_Sub5_3062) != null) {
				Class242 class242 = this.aClass359_6249.aClass246_Sub5_3062.method3116();
				if (Class239.aBoolean1839)
					var_ha.method1785(class242, Class16.anInt197);
				else
					var_ha.method1820(class242);
			}
			aBoolean6248 = class146.F() || (this.aClass359_6249.aClass246_Sub5_3062) != null;
			if (aClass228_6250 != null)
				Class283.method3350(this.anInt5089, this.localXPos, 18, this.localYPos, class146, aClass228_6250);
			else
				aClass228_6250 = (Class48_Sub2_Sub1.method472(this.anInt5089, this.localXPos, class146, this.localYPos, 4));
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ps.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final int method63(byte i) {
		try {
			if (i != 20)
				anInt6251 = -77;
			return (this.aClass359_6249.anInt3038);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ps.B(" + i + ')');
		}
	}

	static {
		aClass204_6247 = new Class204();
		anInt6252 = 0;
	}
}
