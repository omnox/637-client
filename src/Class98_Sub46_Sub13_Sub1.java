/* Class98_Sub46_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub13_Sub1 extends Class98_Sub46_Sub13 {
	int anInt6304;
	RSByteBuffer aClass98_Sub22_6305;
	byte aByte6306;
	static Class258 aClass258_6307 = new Class258();
	static int[] anIntArray6308;

	final int method1590(int i) {
		try {
			if (i != 100)
				return -60;
			if (((Class98_Sub46_Sub13_Sub1) this).aClass98_Sub22_6305 == null)
				return 0;
			return (((RSByteBuffer) (((Class98_Sub46_Sub13_Sub1) this).aClass98_Sub22_6305)).position * 100 / (-((Class98_Sub46_Sub13_Sub1) this).aByte6306 + (((RSByteBuffer) (((Class98_Sub46_Sub13_Sub1) this).aClass98_Sub22_6305)).data).length));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gb.B(" + i + ')');
		}
	}

	static final void method1593(byte i) {
		try {
			int i_0_ = 0;
			if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub10_4070.method592((byte) 127) ^ 0xffffffff) == -2) {
				i_0_ |= 0x1;
				i_0_ |= 0x10;
				i_0_ |= 0x20;
				i_0_ |= 0x2;
				i_0_ |= 0x4;
			}
			if (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056.method634((byte) 124) == 0)
				i_0_ |= 0x40;
			Class98_Sub46_Sub16.method1618(i_0_, (byte) -85);
			Class130.aClass302_1028.method3554(true, i_0_);
			Class98_Sub46_Sub19.getItemDefs.method2712(60, i_0_);
			Class4.aClass301_85.method3541(true, i_0_);
			Class196.aClass304_1509.method3560(i_0_, 0);
			Class64_Sub13.method606(18279, i_0_);
			Class97.method936(i_0_, 1024);
			Class65.method678(i_0_, false);
			LinkedList.method2429(117, i_0_);
			if (i <= 44)
				method1595(85);
			Class98_Sub10.method999((byte) 124);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gb.G(" + i + ')');
		}
	}

	final byte[] method1591(int i) {
		try {
			if (i < 5)
				return null;
			if (((Class98_Sub46_Sub13) this).aBoolean6038 || (((((RSByteBuffer) ((Class98_Sub46_Sub13_Sub1) this).aClass98_Sub22_6305).data).length - ((Class98_Sub46_Sub13_Sub1) this).aByte6306) > ((RSByteBuffer) (((Class98_Sub46_Sub13_Sub1) this).aClass98_Sub22_6305)).position))
				throw new RuntimeException();
			return (((RSByteBuffer) ((Class98_Sub46_Sub13_Sub1) this).aClass98_Sub22_6305).data);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gb.C(" + i + ')');
		}
	}

	static final void method1594(int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
		try {
			int i_5_ = Class366.anInt3117;
			int i_6_ = IComponentSettings.anInt4286;
			if (za_Sub2.aBoolean6079) {
				i_5_ += Class189.method2642((byte) 42);
				i_6_ += Class335.method3765(false);
			}
			if (i_4_ <= 115)
				anIntArray6308 = null;
			if ((Class55.anInt440 ^ 0xffffffff) == -2) {
				Class332 class332 = (Class76_Sub7.aClass332Array3764[Class98_Sub10_Sub32.anInt5720 / 100]);
				class332.method3735(i_5_ + -8, -8 + i_6_);
				Class93_Sub1_Sub1.method908(class332.method3749() + -8 + i_6_, -8 + i_6_, false, i_5_ - 8, -8 + (i_5_ - -class332.method3737()));
			}
			if (Class55.anInt440 == 2) {
				Class332 class332 = (Class76_Sub7.aClass332Array3764[4 - -(Class98_Sub10_Sub32.anInt5720 / 100)]);
				class332.method3735(-8 + i_5_, -8 + i_6_);
				Class93_Sub1_Sub1.method908(class332.method3749() + -8 + i_6_, -8 + i_6_, false, i_5_ - 8, -8 + i_5_ + class332.method3737());
			}
			Class64_Sub18.method623(-23196);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gb.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final Class63[] method1595(int i) {
		try {
			if (i <= 102)
				method1596((byte) 125);
			return new Class63[] { Class98_Sub35.aClass63_4151, Class368.aClass63_3126, za.aClass63_4296 };
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gb.F(" + i + ')');
		}
	}

	public static void method1596(byte i) {
		try {
			if (i > 6) {
				anIntArray6308 = null;
				aClass258_6307 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gb.A(" + i + ')');
		}
	}

	static final void method1597(int[] is, Object[] objects, int i) {
		try {
			Class33.method323(is, objects, i, -1 + is.length, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gb.E(" + (is != null ? "{...}" : "null") + ',' + (objects != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
