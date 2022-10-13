/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class139 {
	int anInt1086;
	static int anInt1087 = 0;
	private RuneScapeCache aClass207_1088;
	private Class79 aClass79_1089 = new Class79(64);

	final void method2281(int i) {
		try {
			synchronized (aClass79_1089) {
				aClass79_1089.method794(4);
				if (i > -102)
					this.anInt1086 = 56;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jj.D(" + i + ')');
		}
	}

	final Class167 method2282(int i, int i_0_) {
		try {
			Class167 class167;
			synchronized (aClass79_1089) {
				class167 = (Class167) aClass79_1089.get(i);
			}
			if (class167 != null)
				return class167;
			byte[] is;
			synchronized (aClass207_1088) {
				if (i_0_ != 16)
					this.anInt1086 = 120;
				is = aClass207_1088.readArchive(i, 16);
			}
			class167 = new Class167();
			if (is != null)
				class167.method2527(new RSByteBuffer(is), -2);
			synchronized (aClass79_1089) {
				aClass79_1089.put(i, class167);
			}
			return class167;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jj.C(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2283(byte i) {
		try {
			if (i <= 9)
				method2282(-33, -125);
			synchronized (aClass79_1089) {
				aClass79_1089.method806((byte) 30);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jj.A(" + i + ')');
		}
	}

	final void method2284(byte i, int i_1_) {
		try {
			int i_2_ = 84 / ((i - -8) / 63);
			synchronized (aClass79_1089) {
				aClass79_1089.method800((byte) 62, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jj.B(" + i + ',' + i_1_ + ')');
		}
	}

	Class139(Class279 class279, int i, RuneScapeCache class207) {
		try {
			aClass207_1088 = class207;
			if (aClass207_1088 == null)
				this.anInt1086 = 0;
			else
				this.anInt1086 = aClass207_1088.method2761(0, 16);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jj.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
