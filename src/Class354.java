/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class354 {
	private boolean aBoolean3010 = false;
	int anInt3011;
	int anInt3012;
	private boolean aBoolean3013 = true;
	static Class98_Sub9 aClass98_Sub9_3014 = new Class98_Sub9(0, 0);
	int anInt3015;
	String aString3016;

	final Class143 method3870(int i, Class88 class88) {
		try {
			int i_0_ = 56 / ((-28 - i) / 39);
			return class88.method863(this.aString3016, false, (!aBoolean3013 ? this.anInt3015 : this.anInt3012), aBoolean3010);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("via.E(" + i + ',' + (class88 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3871(int i) {
		do {
			try {
				aClass98_Sub9_3014 = null;
				if (i == 43594)
					break;
				method3872((byte) -4);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "via.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class277 method3872(byte i) {
		try {
			if (i != 83)
				aClass98_Sub9_3014 = null;
			try {
				return (Class277) Class.forName("Class277_Sub1").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "via.D(" + i + ')');
		}
	}

	final boolean method3873(int i, Class354 class354_1_) {
		try {
			if (i < 103)
				method3873(-66, null);
			if (class354_1_ != null) {
				if ((this.anInt3011 != class354_1_.anInt3011) || !this.aString3016.equals(class354_1_.aString3016))
					return false;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("via.C(" + i + ',' + (class354_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3874(int i) {
		do {
			try {
				if (!aBoolean3013) {
					aBoolean3013 = true;
					aBoolean3010 = true;
				} else if (!aBoolean3010)
					aBoolean3013 = false;
				else
					aBoolean3010 = false;
				if (i == 0)
					break;
				method3873(9, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "via.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class354() {
		this.anInt3015 = 43594;
	}
}
