/* Class134_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class134_Sub1 extends Class134 {
	private int anInt5458 = 0;
	static int anInt5459 = 0;
	/* synthetic */ static Class aClass5460;

	static final byte[] method2244(int i, float f, float f_0_, float f_1_, int i_2_, int i_3_, int i_4_, Class39 class39, float f_5_, float f_6_, int i_7_) {
		try {
			byte[] is = new byte[i_2_ * i_4_ * i_7_];
			Class98_Sub48.method1661(0, i_2_, class39, (byte) -19, f, f_1_, i_4_, f_5_, i_7_, i_3_, f_0_, is, f_6_);
			if (i != -31633)
				method2246(null, (byte) 101);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mw.G(" + i + ',' + f + ',' + f_0_ + ',' + f_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (class39 != null ? "{...}" : "null") + ',' + f_5_ + ',' + f_6_ + ',' + i_7_ + ')'));
		}
	}

	public final void method60(boolean bool, byte i) {
		try {
			int i_8_ = ((((Class337) ((Class134) this).aClass337_3460).aClass63_3538.method545(Class98_Sub17_Sub1.anInt5782, ((Class134) this).aClass332_3459.method3737(), (byte) -106)) + ((Class337) ((Class134) this).aClass337_3460).anInt3541);
			int i_9_ = ((((Class337) ((Class134) this).aClass337_3460).aClass110_3540.method2088(((Class134) this).aClass332_3459.method3749(), Class246_Sub2.anInt5072, (byte) -56)) + ((Class337) ((Class134) this).aClass337_3460).anInt3542);
			if (i >= -81)
				anInt5459 = 121;
			((Class134) this).aClass332_3459.method3730((float) (i_8_ + ((Class134) this).aClass332_3459.method3737() / 2), (float) (((Class134) this).aClass332_3459.method3749() / 2 + i_9_), 4096, anInt5458);
			anInt5458 += ((Class337_Sub1) (Class337_Sub1) ((Class134) this).aClass337_3460).anInt5498;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mw.B(" + bool + ',' + i + ')');
		}
	}

	static final boolean method2245(int i, char c) {
		try {
			if (i != 18646)
				anInt5459 = -5;
			if ((c ^ 0xffffffff) > -49 || c > 57)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mw.E(" + i + ',' + c + ')');
		}
	}

	static final boolean method2246(String string, byte i) {
		try {
			if (i != -36)
				return true;
			return Class79.method795(90, (aClass5460 != null ? aClass5460 : (aClass5460 = method2248("Class166"))), string);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mw.D(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2247(int i) {
		try {
			((RuneScapeCache) client.aClass207_3549).anInt1575 = 1;
			Class366.anInt3111 = 0;
			client.anInt3548 = 0;
			Class132.anInt1046 = 0;
			Class76_Sub5.anInt3746 = 0;
			Class98_Sub46_Sub16.anInt6044 = 0;
			Class65.anInt498 = 0;
			ClientScript2Runtime.anInt1880 = 0;
			Class98_Sub23.anInt4001 = 0;
			int i_10_ = -117 % ((i - -13) / 61);
			Class98_Sub43.anInt4242 = 0;
			Class39_Sub1.anInt3594 = 0;
			Class301.method3543(16535);
			Class4.aBoolean84 = true;
			Class101.aBoolean856 = true;
			Class153.method2487(-1);
			for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (Class104.aClass36Array903.length ^ 0xffffffff)); i_11_++)
				Class104.aClass36Array903[i_11_] = null;
			Class98_Sub10_Sub9.aBoolean5585 = false;
			Class220.method2820((byte) 125);
			Class98_Sub10_Sub9.anInt5581 = -40 + (int) (80.0 * Math.random());
			Class151.anInt1213 = (int) (Math.random() * 30.0) + -20;
			GameWorld.cameraGetHrot = (float) (0x3fff & (int) (Math.random() * 160.0) + -80);
			Class204.anInt1553 = (int) (120.0 * Math.random()) - 60;
			Class98_Sub17.anInt3943 = (int) (Math.random() * 110.0) - 55;
			Class304.anInt2533 = (int) (Math.random() * 100.0) + -50;
			Class256.method3193(-1);
			for (int i_12_ = 0; i_12_ < 2048; i_12_++)
				Class151_Sub9.playerArray[i_12_] = null;
			Class98_Sub10_Sub20.anInt5640 = 0;
			Class150.anInt1211 = 0;
			Class260.aClass377_3254.method3994(-90);
			Class280.aClass148_2108.method2422((byte) 47);
			Class98_Sub10_Sub11.aClass148_5596.method2422((byte) 47);
			Class64_Sub20.aClass218_3694.method2802(20);
			AbstractModel.aClass377_1180.method3994(-63);
			Class191.aClass148_1478 = new LinkedList();
			OutgoingPacket.aClass148_3866 = new LinkedList();
			Class75.aClass140_584.method2288((byte) -88);
			Class268.method3248(0);
			Class98_Sub4.anInt3828 = 0;
			Class303.anInt2530 = 0;
			Class98_Sub10_Sub21.anInt5643 = 0;
			Class363.anInt3098 = 0;
			Class263.anInt1967 = 0;
			Class98_Sub15.anInt3915 = 0;
			Class308.anInt2580 = 0;
			Class98_Sub41.anInt4202 = 0;
			Exception_Sub1.anInt44 = 0;
			Class98_Sub46_Sub2_Sub2.anInt6300 = 0;
			for (int i_13_ = 0; i_13_ < Class76_Sub5.anIntArray3744.length; i_13_++) {
				if (!VarpClass.aBooleanArray3246[i_13_])
					Class76_Sub5.anIntArray3744[i_13_] = -1;
			}
			if (Class15.anInt185 != -1)
				Class246.method2964(false, Class15.anInt185);
			for (GameInterface class98_sub18 = (GameInterface) Class116.aClass377_964.start_iteration(113); class98_sub18 != null; class98_sub18 = (GameInterface) Class116.aClass377_964.iterate_next(-1)) {
				if (!class98_sub18.method941((byte) 78)) {
					class98_sub18 = ((GameInterface) Class116.aClass377_964.start_iteration(116));
					if (class98_sub18 == null)
						break;
				}
				Class196.method2666(16398, false, class98_sub18, true);
			}
			Class15.anInt185 = -1;
			Class116.aClass377_964 = new Class377(8);
			Class76_Sub9.method768(123);
			OutputStream_Sub1.aClass293_33 = null;
			for (int i_14_ = 0; i_14_ < 8; i_14_++) {
				Class269.aStringArray2021[i_14_] = null;
				Class146_Sub2.aBooleanArray4840[i_14_] = false;
				Class151_Sub9.anIntArray5019[i_14_] = -1;
			}
			Class98_Sub10_Sub34.method1106((byte) -61);
			Class98_Sub10_Sub12.aBoolean5599 = true;
			for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -101; i_15_++)
				aa_Sub3.aBooleanArray3574[i_15_] = true;
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -7; i_16_++)
				Class98_Sub10_Sub24.aClass101Array5666[i_16_] = new Class101();
			for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -26; i_17_++) {
				Class64_Sub21.anIntArray3701[i_17_] = 0;
				Class256_Sub1.anIntArray5158[i_17_] = 0;
				Class52.anIntArray3493[i_17_] = 0;
			}
			Class374.method3980((byte) 125);
			Class246.aShortArray1869 = Class372.aShortArray3153 = Class265.aShortArray1977 = Class338.aShortArray2833 = new short[256];
			Class64_Sub6.aBoolean3656 = true;
			Class218.aString1636 = TextResources.WALK_HERE.get_text(Class374.anInt3159);
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4034.method612((byte) 120), (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4058));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4041.method564((byte) 121), (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076));
			Class75.anInt581 = 0;
			Class64_Sub18.method622((byte) -38);
			Class98_Sub17_Sub1.method1158(-2);
			((RuneScapeCache) client.aClass207_3549).anInt1575 = 2;
			Class11.aLong121 = 0L;
			Class284.aClass98_Sub4_2167 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mw.F(" + i + ')');
		}
	}

	Class134_Sub1(RuneScapeCache class207, Class337_Sub1 class337_sub1) {
		super(class207, (Class337) class337_sub1);
	}

	/* synthetic */
	static Class method2248(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
