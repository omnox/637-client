/* Class246_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub4_Sub1 extends Class246_Sub4 {
	short aShort6167;
	String friendName;
	static Class258 aClass258_6169 = new Class258();
	static Class79 aClass79_6170 = new Class79(4);
	static String[] aStringArray6171 = new String[100];
	int anInt6172;

	public static void method3102(byte i) {
		do {
			try {
				IncomingOpcode.aClass58_6166 = null;
				aClass79_6170 = null;
				aClass258_6169 = null;
				aStringArray6171 = null;
				if (i == -62)
					break;
				IncomingOpcode.aClass58_6166 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ii.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3103(byte i) {
		do {
			try {
				if (Class64_Sub16.anInt3680 == 5) {
					Class64_Sub16.anInt3680 = 6;
					if (i == -38)
						break;
					method3104(52);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ii.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3104(int i) {
		try {
			Class248.aClass377_1894.method3994(-124);
			if (i == 5134)
				Class366.aClass377_3114.method3994(i ^ ~0x1433);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ii.D(" + i + ')');
		}
	}

	static final void method3105(byte i, Class172[][][] class172s) {
		try {
			if (i >= -30)
				aClass258_6169 = null;
			for (int i_0_ = 0; class172s.length > i_0_; i_0_++) {
				Class172[][] class172s_1_ = class172s[i_0_];
				for (int i_2_ = 0; class172s_1_.length > i_2_; i_2_++) {
					for (int i_3_ = 0; (i_3_ < class172s_1_[i_2_].length); i_3_++) {
						Class172 class172 = class172s_1_[i_2_][i_3_];
						if (class172 != null) {
							if (class172.aClass246_Sub3_Sub1_1332 instanceof Interface19)
								((Interface19) (class172.aClass246_Sub3_Sub1_1332)).method61((byte) -96);
							if (class172.aClass246_Sub3_Sub5_1334 instanceof Interface19)
								((Interface19) (class172.aClass246_Sub3_Sub5_1334)).method61((byte) -96);
							if (class172.aClass246_Sub3_Sub5_1326 instanceof Interface19)
								((Interface19) (class172.aClass246_Sub3_Sub5_1326)).method61((byte) -96);
							if (class172.aClass246_Sub3_Sub3_1324 instanceof Interface19)
								((Interface19) (class172.aClass246_Sub3_Sub3_1324)).method61((byte) -96);
							if (class172.aClass246_Sub3_Sub3_1333 instanceof Interface19)
								((Interface19) (class172.aClass246_Sub3_Sub3_1333)).method61((byte) -96);
							for (Class154 class154 = class172.aClass154_1325; class154 != null; class154 = class154.aClass154_1233) {
								Class246_Sub3_Sub4 class246_sub3_sub4 = (class154.aClass246_Sub3_Sub4_1232);
								if (class246_sub3_sub4 instanceof Interface19)
									((Interface19) class246_sub3_sub4).method61((byte) -96);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ii.A(" + i + ',' + (class172s != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub4_Sub1(String string, int i) {
		try {
			this.anInt6172 = (int) (Class343.method3819(-47) / 1000L);
			this.friendName = string;
			this.aShort6167 = (short) i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ii.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
