/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class219 {
	int anInt1637 = 128;
	int anInt1638;
	int anInt1639;
	static OutgoingOpcode aClass171_1640 = new OutgoingOpcode(7, 6);
	static Class361 aClass361_1642;
	int anInt1643;
	int anInt1644;
	int anInt1645 = 128;

	public static void method2813(boolean bool) {
		try {
			if (bool != false)
				aClass361_1642 = null;
			RtKeyListener.key_listener = null;
			aClass361_1642 = null;
			aClass171_1640 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oaa.B(" + bool + ')');
		}
	}

	final void method2814(Class219 class219_0_, int i) {
		try {
			if (i != 6)
				method2815(127);
			((Class219) this).anInt1638 = ((Class219) class219_0_).anInt1638;
			((Class219) this).anInt1639 = ((Class219) class219_0_).anInt1639;
			((Class219) this).anInt1643 = ((Class219) class219_0_).anInt1643;
			((Class219) this).anInt1645 = ((Class219) class219_0_).anInt1645;
			((Class219) this).anInt1644 = ((Class219) class219_0_).anInt1644;
			((Class219) this).anInt1637 = ((Class219) class219_0_).anInt1637;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oaa.A(" + (class219_0_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class219 method2815(int i) {
		try {
			if (i != 128)
				method2814(null, 107);
			return new Class219(((Class219) this).anInt1643, ((Class219) this).anInt1637, ((Class219) this).anInt1645, ((Class219) this).anInt1638, ((Class219) this).anInt1644, ((Class219) this).anInt1639);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oaa.C(" + i + ')');
		}
	}

	Class219(int i) {
		try {
			((Class219) this).anInt1643 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oaa.<init>(" + i + ')');
		}
	}

	private Class219(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			((Class219) this).anInt1638 = i_3_;
			((Class219) this).anInt1644 = i_4_;
			((Class219) this).anInt1639 = i_5_;
			((Class219) this).anInt1643 = i;
			((Class219) this).anInt1645 = i_2_;
			((Class219) this).anInt1637 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oaa.<init>(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}
}
