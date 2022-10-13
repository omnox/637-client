/* Class373_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class373_Sub1_Sub1 extends PacketParser {
	static Class126 aClass126_6216 = new Class126();

	static final void method3970(RuneScapeCache class207, byte i) {
		try {
			Class361.anInt3089 = 0;
			Class351.anInt2922 = 0;
			Class267.aClass218_2002 = new Class218();
			Class185.aClass246_Sub4_Sub2_Sub1Array1445 = new Class246_Sub4_Sub2_Sub1[1024];
			Class373_Sub2.aClass246_Sub5Array5469 = new Class246_Sub5[(Class224_Sub1.anIntArray5034[Class337_Sub1.anInt5497]) + 1];
			Class273.anInt2039 = 0;
			Class258.anInt1952 = 0;
			Class242.method2935((byte) 40, class207);
			if (i > -58)
				aClass126_6216 = null;
			Class89.method880(-13258, class207);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qea.N(" + (class207 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3971(int i) {
		try {
			if (i != 0)
				aClass126_6216 = null;
			aClass126_6216 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qea.P(" + i + ')');
		}
	}

	static final void method3972(int i, int i_0_, int i_1_) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_];
		if (class172 != null) {
			Class129.method2227(class172.aClass246_Sub3_Sub3_1324);
			Class129.method2227(class172.aClass246_Sub3_Sub3_1333);
			if (class172.aClass246_Sub3_Sub3_1324 != null)
				class172.aClass246_Sub3_Sub3_1324 = null;
			if (class172.aClass246_Sub3_Sub3_1333 != null)
				class172.aClass246_Sub3_Sub3_1333 = null;
		}
	}

	static final boolean method3973(int i, int i_2_, int i_3_) {
		try {
			int i_4_ = -114 / ((i_3_ - -11) / 53);
			if (!((i & 0x60000) != 0 | Class161.method2514(i, 16, i_2_)) && !Class228.method2864(55, i, i_2_) && !Class216.method2793(i_2_, (byte) -112, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qea.Q(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method3966(int i, int i_5_, int i_6_, int i_7_, byte i_8_) {
		try {
			if (i_8_ >= 21) {
				int i_9_ = this.aClass332_5462.method3737();
				int i_10_ = (((Class93_Sub1_Sub1) this.aClass93_3478).anInt6290 * RuntimeException_Sub1.method4012(true) / 10 % i_9_);
				this.aClass332_5462.method3738(i_10_ + i_7_ + -i_9_, i_6_, i_9_ + i_5_ + -i_10_, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qea.G(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	Class373_Sub1_Sub1(RuneScapeCache class207, RuneScapeCache class207_11_, Class93_Sub1_Sub1 class93_sub1_sub1) {
		super(class207, class207_11_, class93_sub1_sub1);
	}
}
