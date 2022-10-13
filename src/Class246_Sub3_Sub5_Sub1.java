/* Class246_Sub3_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub5_Sub1 extends Class246_Sub3_Sub5 implements Interface19 {
	private Class228 aClass228_6217;
	private boolean aBoolean6218 = false;
	Class359 aClass359_6219;
	private boolean aBoolean6220;
	static OutgoingOpcode aClass171_6221 = new OutgoingOpcode(6, 8);

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			AbstractModel class146 = ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3897(-1, false, 2048, var_ha, true);
			if (class146 == null)
				return null;
			Class111 class111 = var_ha.method1793();
			if (i >= -12)
				aBoolean6220 = true;
			class111.method2100((((Class246_Sub3_Sub5) this).aShort6165 + ((AnimableEntity) this).localXPos), ((AnimableEntity) this).anInt5089, (((AnimableEntity) this).localYPos + ((Class246_Sub3_Sub5) this).aShort6163));
			Class246_Sub1 class246_sub1 = Class94.method915(1, (byte) -47, aBoolean6220);
			int i_0_ = ((AnimableEntity) this).localXPos >> -644618167;
			int i_1_ = ((AnimableEntity) this).localYPos >> -811550487;
			((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3895(class146, i_0_, i_1_, class111, true, i_0_, var_ha, false, i_1_);
			if (Class239.aBoolean1839)
				class146.method2329(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[0]), Class16.anInt197, 0);
			else
				class146.method2325(class111, (((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[0]), 0);
			if ((((Class359) ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219).aClass246_Sub5_3062) != null) {
				Class242 class242 = ((Class359) ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219).aClass246_Sub5_3062.method3116();
				if (Class239.aBoolean1839)
					var_ha.method1785(class242, Class16.anInt197);
				else
					var_ha.method1820(class242);
			}
			aBoolean6218 = class146.F() || (((Class359) ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219).aClass246_Sub5_3062) != null;
			if (aClass228_6217 != null)
				Class283.method3350(((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localXPos, 18, ((AnimableEntity) this).localYPos, class146, aClass228_6217);
			else
				aClass228_6217 = (Class48_Sub2_Sub1.method472(((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localXPos, class146, ((AnimableEntity) this).localYPos, 4));
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.QA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final void method67(int i, ha var_ha) {
		try {
			((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3894((byte) 125, var_ha);
			if (i != -25163)
				method2974((byte) 25, null);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method64(int i) {
		try {
			if (i != 30472)
				method2978(119);
			return (((Class359) ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219).anInt3052);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.C(" + i + ')');
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				method66(-34);
			return ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3899((byte) 126);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.J(" + i + ')');
		}
	}

	final boolean method2987(int i) {
		try {
			if (i != 6540)
				aBoolean6218 = false;
			return aBoolean6218;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.I(" + i + ')');
		}
	}

	public final int method63(byte i) {
		try {
			if (i != 20)
				method2978(-38);
			return (((Class359) ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219).anInt3038);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.B(" + i + ')');
		}
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				method2978(-53);
			return ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3903((byte) -127);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.O(" + bool + ')');
		}
	}

	final void method2988(ha var_ha, int i) {
		try {
			AbstractModel class146 = ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3897(-1, false, 262144, var_ha, true);
			if (class146 != null) {
				int i_2_ = ((AnimableEntity) this).localXPos >> -2058956119;
				int i_3_ = ((AnimableEntity) this).localYPos >> -1110738775;
				Class111 class111 = var_ha.method1793();
				class111.method2100(((AnimableEntity) this).localXPos, ((AnimableEntity) this).anInt5089, ((AnimableEntity) this).localYPos);
				((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3895(class146, i_2_, i_3_, class111, false, i_2_, var_ha, false, i_3_);
			}
			int i_4_ = 72 / ((i - 53) / 46);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.MA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final void method61(byte i) {
		try {
			if (i != -96)
				method2988(null, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.Q(" + i + ')');
		}
	}

	public static void method3090(byte i) {
		do {
			try {
				aClass171_6221 = null;
				if (i == -94)
					break;
				method3090((byte) 106);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ce.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public final boolean method65(boolean bool) {
		try {
			if (bool != true)
				return false;
			return ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3898(99);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.A(" + bool + ')');
		}
	}

	public final void method62(ha var_ha, int i) {
		try {
			if (i != 24447)
				method64(106);
			((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3892(var_ha, 103);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.G(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3091(Class185 class185, boolean bool) {
		do {
			try {
				((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3901(class185, -108);
				if (bool == false)
					break;
				aBoolean6218 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ce.K(" + (class185 != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2976(int i, ha var_ha, byte i_5_, int i_6_) {
		try {
			AbstractModel class146 = ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219.method3897(-1, false, 131072, var_ha, false);
			if (class146 == null)
				return false;
			Class111 class111 = var_ha.method1793();
			class111.method2100((((AnimableEntity) this).localXPos + ((Class246_Sub3_Sub5) this).aShort6165), ((AnimableEntity) this).anInt5089, (((AnimableEntity) this).localYPos + ((Class246_Sub3_Sub5) this).aShort6163));
			if (i_5_ < 59)
				method64(111);
			if (!Class239.aBoolean1839)
				return class146.method2339(i, i_6_, class111, false, 0);
			return class146.method2333(i, i_6_, class111, false, 0, Class16.anInt197);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.TA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	Class246_Sub3_Sub5_Sub1(ha var_ha, Class352 class352, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		super(i_8_, i_9_, i_10_, i, i_7_, i_11_, i_12_);
		try {
			((Class246_Sub3_Sub5_Sub1) this).aClass359_6219 = new Class359(var_ha, class352, i_13_, i_14_, ((AnimableEntity) this).height_level, i_7_, this, bool, i_15_);
			aBoolean6220 = ((Class352) class352).anInt2998 != 0 && !bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class352 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	final boolean method2978(int i) {
		try {
			int i_16_ = -92 % ((i - -76) / 47);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.H(" + i + ')');
		}
	}

	static final void method3092(int i, boolean bool) {
		do {
			try {
				if (i != -1)
					method3090((byte) 63);
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, Class15.aClass171_183, Class331.aClass117_2811);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				for (GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.start_iteration(94)); class98_sub18 != null; class98_sub18 = ((GameInterface) Class116.aClass377_964.iterate_next(i))) {
					if (!class98_sub18.method941((byte) 78)) {
						class98_sub18 = (GameInterface) Class116.aClass377_964.start_iteration(95);
						if (class98_sub18 == null)
							break;
					}
					if ((((GameInterface) class98_sub18).interfaceClickThrough ^ 0xffffffff) == -1)
						Class196.method2666(16398, bool, class98_sub18, true);
				}
				if (OutputStream_Sub1.aClass293_33 == null)
					break;
				Class341.method3812(1, OutputStream_Sub1.aClass293_33);
				OutputStream_Sub1.aClass293_33 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ce.F(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	public final int method66(int i) {
		try {
			if (i != 4657)
				aClass171_6221 = null;
			return (((Class359) ((Class246_Sub3_Sub5_Sub1) this).aClass359_6219).anInt3059);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.N(" + i + ')');
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				return null;
			return aClass228_6217;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.KA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}
}
