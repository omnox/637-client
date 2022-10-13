/* Class246_Sub3_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3_Sub5 extends AnimableEntity {
	short aShort6163;
	static OutgoingOpcode aClass171_6164 = new OutgoingOpcode(34, 4);
	short aShort6165;

	final void method2992(byte i) {
		try {
			if (i != -73)
				aClass171_6164 = null;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.DA(" + i + ')');
		}
	}

	final boolean method2982(byte i) {
		try {
			if (i > -70)
				aClass171_6164 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.HA(" + i + ')');
		}
	}

	final void method2981(AnimableEntity class246_sub3, byte i, boolean bool, int i_0_, ha var_ha, int i_1_, int i_2_) {
		try {
			int i_3_ = -36 / ((i - 15) / 55);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.CA(" + (class246_sub3 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_0_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method3089(int i) {
		try {
			if (i != 4)
				aClass171_6164 = null;
			aClass171_6164 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.R(" + i + ')');
		}
	}

	final boolean method2977(ha var_ha, byte i) {
		try {
			if (i != 77)
				return false;
			return Class195.method2661(((AnimableEntity) this).aByte5081, (((AnimableEntity) this).localYPos >> Class151_Sub8.anInt5015), (((AnimableEntity) this).localXPos >> Class151_Sub8.anInt5015), this.method2990(i + -77), (byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.AA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method2980(int i, Class98_Sub5[] class98_sub5s) {
		try {
			int i_4_ = -17 / ((i - 29) / 62);
			return this.method2989((((AnimableEntity) this).localXPos >> Class151_Sub8.anInt5015), false, class98_sub5s, (((AnimableEntity) this).localYPos >> Class151_Sub8.anInt5015));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.GA(" + i + ',' + (class98_sub5s != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub3_Sub5(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			((AnimableEntity) this).localXPos = i;
			((AnimableEntity) this).aByte5081 = (byte) i_8_;
			((Class246_Sub3_Sub5) this).aShort6165 = (short) i_9_;
			((Class246_Sub3_Sub5) this).aShort6163 = (short) i_10_;
			((AnimableEntity) this).height_level = (byte) i_7_;
			((AnimableEntity) this).localYPos = i_6_;
			((AnimableEntity) this).anInt5089 = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.<init>(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final boolean method2991(boolean bool) {
		try {
			if (bool != false)
				return true;
			return (Class74.aBooleanArrayArray551[(Class259.anInt1959 + -Class241.anInt1845 + (((AnimableEntity) this).localXPos >> Class151_Sub8.anInt5015))][(Class259.anInt1959 + (((AnimableEntity) this).localYPos >> Class151_Sub8.anInt5015) - Class64_Sub26.anInt3714)]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.FA(" + bool + ')');
		}
	}
}
