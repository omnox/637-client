
/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

final class Class8 {
	private Class79 aClass79_109 = new Class79(64);
	static LinkedList aClass148_110;
	private RuneScapeCache aClass207_111;
	static Clipboard aClipboard113;

	public static void method184(byte i) {
		try {
			if (i == -109) {
				aClipboard113 = null;
				IncomingOpcode.aClass58_112 = null;
				aClass148_110 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ai.C(" + i + ')');
		}
	}

	final Class98_Sub46_Sub18 method185(int i, int i_0_) {
		try {
			Class98_Sub46_Sub18 class98_sub46_sub18;
			synchronized (aClass79_109) {
				class98_sub46_sub18 = ((Class98_Sub46_Sub18) aClass79_109.get((long) i_0_));
			}
			if (class98_sub46_sub18 != null)
				return class98_sub46_sub18;
			byte[] is;
			synchronized (aClass207_111) {
				is = aClass207_111.readArchive(i_0_, 5);
			}
			class98_sub46_sub18 = new Class98_Sub46_Sub18();
			if (is != null)
				class98_sub46_sub18.method1628(new RSByteBuffer(is), -125);
			synchronized (aClass79_109) {
				aClass79_109.put((long) i_0_, class98_sub46_sub18);
			}
			if (i != 9)
				method186(-13, null, 80, -89);
			return class98_sub46_sub18;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ai.D(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method186(int i, GameInterfaceData class293, int i_1_, int i_2_) {
		do {
			try {
				if (Class98_Sub10_Sub9.aBoolean5585) {
					ParamType class149 = ((Class98_Sub46_Sub1.anInt5945 ^ 0xffffffff) != 0 ? (Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, Class98_Sub46_Sub1.anInt5945)) : null);
					if (client.getClickMask(class293).method1667((byte) 74) && (Class98_Sub4.anInt3826 & 0x20 ^ 0xffffffff) != -1 && (class149 == null || ((class293.method3472(i ^ 0x56da, (((ParamType) class149).anInt1202), (Class98_Sub46_Sub1.anInt5945)) ^ 0xffffffff) != (((ParamType) class149).anInt1202 ^ 0xffffffff))))
						GameInterfaceData.method3470(false, true, 0L, Class336.anInt2823, ((GameInterfaceData) class293).anInt2300, (Class246_Sub3_Sub3.aString6156 + " -> " + ((GameInterfaceData) class293).aString2224), false, ((GameInterfaceData) class293).anInt2248, 59, (long) ((((GameInterfaceData) class293).anInt2300 << 1322373568) | ((GameInterfaceData) class293).anInt2248), ((GameInterfaceData) class293).anInt2302, false, Class287_Sub2.aString3272);
				}
				if (i == 59) {
					for (int i_3_ = 9; i_3_ >= 5; i_3_--) {
						String string = Class38.method347(class293, (byte) 66, i_3_);
						if (string != null) {
							Class132.anInt1046++;
							GameInterfaceData.method3470(false, true, (long) (i_3_ + 1), Class377.method3991(class293, -127, i_3_), ((GameInterfaceData) class293).anInt2300, ((GameInterfaceData) class293).aString2224, false, ((GameInterfaceData) class293).anInt2248, 1006, (long) (((GameInterfaceData) class293).anInt2248 | (((GameInterfaceData) class293).anInt2300 << 75346272)), ((GameInterfaceData) class293).anInt2302, false, string);
						}
					}
					String string = Class170.method2538(-1, class293);
					if (string != null)
						GameInterfaceData.method3470(false, true, 0L, ((GameInterfaceData) class293).anInt2254, ((GameInterfaceData) class293).anInt2300, ((GameInterfaceData) class293).aString2224, false, ((GameInterfaceData) class293).anInt2248, 21, (long) ((((GameInterfaceData) class293).anInt2300 << -1538321408) | ((GameInterfaceData) class293).anInt2248), ((GameInterfaceData) class293).anInt2302, false, string);
					for (int i_4_ = 4; i_4_ >= 0; i_4_--) {
						String string_5_ = Class38.method347(class293, (byte) 65, i_4_);
						if (string_5_ != null) {
							Class132.anInt1046++;
							GameInterfaceData.method3470(false, true, (long) (i_4_ - -1), Class377.method3991(class293, i ^ ~0x49, i_4_), ((GameInterfaceData) class293).anInt2300, ((GameInterfaceData) class293).aString2224, false, ((GameInterfaceData) class293).anInt2248, 49, (long) (((GameInterfaceData) class293).anInt2248 | (((GameInterfaceData) class293).anInt2300 << -2042533440)), ((GameInterfaceData) class293).anInt2302, false, string_5_);
						}
					}
					if (!client.getClickMask(class293).method1669(1964468))
						break;
					if (((GameInterfaceData) class293).aString2333 == null)
						GameInterfaceData.method3470(false, true, 0L, -1, ((GameInterfaceData) class293).anInt2300, "", false, ((GameInterfaceData) class293).anInt2248, 9, (long) (((GameInterfaceData) class293).anInt2248 | (((GameInterfaceData) class293).anInt2300 << -35313376)), ((GameInterfaceData) class293).anInt2302, false, TextResources.CONTINUE.get_text(Class374.anInt3159));
					else
						GameInterfaceData.method3470(false, true, 0L, -1, ((GameInterfaceData) class293).anInt2300, "", false, ((GameInterfaceData) class293).anInt2248, 9, (long) (((GameInterfaceData) class293).anInt2248 | (((GameInterfaceData) class293).anInt2300 << -1733821568)), ((GameInterfaceData) class293).anInt2302, false, ((GameInterfaceData) class293).aString2333);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ai.A(" + i + ',' + (class293 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method187(boolean bool) {
		do {
			try {
				Class98_Sub17_Sub1.aBoolean5778 = false;
				Class98_Sub43.method1481(2);
				if (bool == true)
					break;
				IncomingOpcode.aClass58_112 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ai.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final boolean method188(boolean bool) {
		try {
			if (bool != false)
				aClass148_110 = null;
			if (Class257.anInt1948 != 0)
				return true;
			return Class366.aClass98_Sub31_Sub2_3122.method1354(-3619);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ai.E(" + bool + ')');
		}
	}

	Class8(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_111 = class207;
			aClass207_111.method2761(0, 5);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ai.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
