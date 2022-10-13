/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Field;

final class Class269 {
	static String[] aStringArray2021 = new String[8];
	private RuneScapeCache aClass207_2022;
	static float[] aFloatArray2023 = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
	static int anInt2024 = -1;
	static RuneScapeCache aClass207_2025;
	static int anInt2026;
	static float[] aFloatArray2027 = new float[4];
	private Class79 aClass79_2028 = new Class79(64);
	/* synthetic */ static Class aClass2029;
	/* synthetic */ static Class aClass2030;

	final void method3265(int i) {
		try {
			synchronized (aClass79_2028) {
				if (i != 1)
					aFloatArray2023 = null;
				aClass79_2028.method794(85);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.I(" + i + ')');
		}
	}

	static final void method3266(int i, byte i_0_) {
		try {
			Class69_Sub2.aClass79_5334.method800((byte) 62, i);
			int i_1_ = -75 / ((50 - i_0_) / 63);
			Class64_Sub5.aClass79_3650.method800((byte) 62, i);
			Class76_Sub11.aClass79_3797.method800((byte) 62, i);
			Class151_Sub7.aClass79_5004.method800((byte) 62, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.H(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method3267(byte i) {
		do {
			try {
				aStringArray2021 = null;
				aClass207_2025 = null;
				aFloatArray2027 = null;
				aFloatArray2023 = null;
				if (i > 36)
					break;
				method3266(-41, (byte) 0);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qq.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class379 method3268(int i, int i_2_) {
		try {
			Class379 class379;
			synchronized (aClass79_2028) {
				class379 = (Class379) aClass79_2028.get(i_2_);
			}
			if (i != -37)
				method3269(false, 104);
			if (class379 != null)
				return class379;
			byte[] is;
			synchronized (aClass207_2022) {
				is = aClass207_2022.readArchive(i_2_, 31);
			}
			class379 = new Class379();
			if (is != null)
				class379.method4008((byte) 126, new RSByteBuffer(is));
			synchronized (aClass79_2028) {
				aClass79_2028.put(i_2_, class379);
			}
			return class379;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.C(" + i + ',' + i_2_ + ')');
		}
	}

	static final void method3269(boolean bool, int i) {
		try {
			if (bool) {
				if (Class15.anInt185 != -1)
					Class246.method2964(false, Class15.anInt185);
				for (GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.start_iteration(94)); class98_sub18 != null; class98_sub18 = ((GameInterface) Class116.aClass377_964.iterate_next(-1))) {
					if (!class98_sub18.method941((byte) 78)) {
						class98_sub18 = (GameInterface) Class116.aClass377_964.start_iteration(121);
						if (class98_sub18 == null)
							break;
					}
					Class196.method2666(16398, false, class98_sub18, true);
				}
				Class15.anInt185 = -1;
				Class116.aClass377_964 = new Class377(8);
				Class76_Sub9.method768(118);
				Class15.anInt185 = ItemDefinition.anInt2470;
				Class40.method359(i + 83, false);
				Class98_Sub43.method1481(2);
				ClientScript2Runtime.method3155(Class15.anInt185);
			}
			Class98_Sub5.aString3837 = Class360.aString3064 = "";
			aa_Sub3.aBoolean3569 = false;
			Class162.method2516(-96);
			Class21_Sub2.anInt5387 = -1;
			Class43.method401(OutputStream_Sub2.anInt39, true);
			Player.selfPlayer = new Player();
			Player.selfPlayer.localXPos = GameWorld.size_x * 512 / 2;
			Player.selfPlayer.walkQueueX[i] = GameWorld.size_x / 2;
			Player.selfPlayer.localYPos = GameWorld.size_y * 512 / 2;
			Player.selfPlayer.walkQueueZ[0] = GameWorld.size_y / 2;
			Class98_Sub46_Sub10.renderX = Class134.renderZ = 0;
			if (Class98_Sub46_Sub20_Sub2.anInt6319 != 2)
				Class183.method2620(0);
			else {
				Class134.renderZ = Class98_Sub10_Sub21.anInt5643 << 9;
				Class98_Sub46_Sub10.renderX = Class363.anInt3098 << 9;
			}
			Class374.method3980((byte) 121);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.B(" + bool + ',' + i + ')');
		}
	}

	static final int method3270(int i) {
		try {
			int i_3_ = 0;
			Field[] fields = (aClass2029 != null ? aClass2029 : (aClass2029 = method3274("Class98_Sub27"))).getDeclaredFields();
			Field[] fields_4_ = fields;
			for (int i_5_ = 0; i_5_ < fields_4_.length; i_5_++) {
				Field field = fields_4_[i_5_];
				if ((aClass2030 != null ? aClass2030 : (aClass2030 = method3274("Class64"))).isAssignableFrom(field.getType()))
					i_3_++;
			}
			if (i <= 85)
				method3273(true);
			return 1 + i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.F(" + i + ')');
		}
	}

	final void method3271(boolean bool) {
		try {
			synchronized (aClass79_2028) {
				aClass79_2028.method806((byte) 63);
			}
			if (bool != true)
				aClass207_2025 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.A(" + bool + ')');
		}
	}

	final void method3272(int i, int i_6_) {
		try {
			synchronized (aClass79_2028) {
				aClass79_2028.method800((byte) 62, i_6_);
			}
			if (i <= 110)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.G(" + i + ',' + i_6_ + ')');
		}
	}

	static final void method3273(boolean bool) {
		try {
			if (bool == true) {
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478.method2418(32)); class98_sub33 != null; class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478.method2417(109)))
					LinkedList.method2428(class98_sub33, false, 15697);
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) OutgoingPacket.aClass148_3866.method2418(32)); class98_sub33 != null; class98_sub33 = ((Class98_Sub33) OutgoingPacket.aClass148_3866.method2417(93)))
					LinkedList.method2428(class98_sub33, true, 15697);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qq.D(" + bool + ')');
		}
	}

	Class269(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_2022 = class207;
			aClass207_2022.method2761(0, 31);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qq.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	/* synthetic */
	static Class method3274(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
