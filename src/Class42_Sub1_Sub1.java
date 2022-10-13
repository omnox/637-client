/* Class42_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42_Sub1_Sub1 extends Class42_Sub1 {
	int anInt6204;
	float aFloat6205;
	static RuneScapeCache aClass207_6206;
	int anInt6207;
	static int anInt6208;
	float aFloat6209;
	static int anInt6210 = 0;
	boolean aBoolean6211;

	public static void method386(int i) {
		try {
			if (i == -16573)
				aClass207_6206 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iaa.K(" + i + ')');
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_0_, int i_1_, int i_2_, int[] is) {
		super(var_ha_Sub1, 3553, 6408, i_1_, i_2_);
		try {
			((Class42_Sub1_Sub1) this).anInt6207 = i;
			((Class42_Sub1_Sub1) this).anInt6204 = i_0_;
			this.method379(i_0_, is, 0, 3656, true, 0, 0, i, 0);
			((Class42_Sub1_Sub1) this).aFloat6205 = (float) i / (float) i_1_;
			((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_0_ / (float) i_2_;
			((Class42_Sub1_Sub1) this).aBoolean6211 = false;
			this.method383(false, 10242, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		super(var_ha_Sub1, 3553, i, i_5_, i_6_);
		try {
			((Class42_Sub1_Sub1) this).aBoolean6211 = false;
			((Class42_Sub1_Sub1) this).anInt6204 = i_4_;
			((Class42_Sub1_Sub1) this).anInt6207 = i_3_;
			((Class42_Sub1_Sub1) this).aFloat6205 = (float) i_3_ / (float) i_5_;
			((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_4_ / (float) i_6_;
			this.method383(false, 10242, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method387(boolean bool) {
		try {
			if (Class264.aFileOutputStream1969 != null) {
				try {
					Class264.aFileOutputStream1969.close();
				} catch (java.io.IOException ioexception) {
					/* empty */
				}
			}
			if (bool != true)
				method387(true);
			Class264.aFileOutputStream1969 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iaa.J(" + bool + ')');
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool) {
		super(var_ha_Sub1, i, i_7_, i_8_, i_9_, i_10_);
		try {
			((Class42_Sub1_Sub1) this).anInt6204 = i_10_;
			do {
				if (((Class42) this).anInt3226 == 34037) {
					((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_10_;
					((Class42_Sub1_Sub1) this).aFloat6205 = (float) i_9_;
					((Class42_Sub1_Sub1) this).aBoolean6211 = false;
					if (!client.aBoolean3553)
						break;
				}
				((Class42_Sub1_Sub1) this).aBoolean6211 = true;
				((Class42_Sub1_Sub1) this).aFloat6205 = ((Class42_Sub1_Sub1) this).aFloat6209 = 1.0F;
			} while (false);
			((Class42_Sub1_Sub1) this).anInt6207 = i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ')'));
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_11_, int i_12_, int i_13_, boolean bool, byte[] is, int i_14_) {
		super(var_ha_Sub1, i, i_11_, i_12_, i_13_, bool, is, i_14_, true);
		try {
			do {
				if (((Class42) this).anInt3226 == 34037) {
					((Class42_Sub1_Sub1) this).aBoolean6211 = false;
					((Class42_Sub1_Sub1) this).aFloat6205 = (float) i_12_;
					((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_13_;
					if (!client.aBoolean3553)
						break;
				}
				((Class42_Sub1_Sub1) this).aFloat6205 = ((Class42_Sub1_Sub1) this).aFloat6209 = 1.0F;
				((Class42_Sub1_Sub1) this).aBoolean6211 = true;
			} while (false);
			((Class42_Sub1_Sub1) this).anInt6207 = i_12_;
			((Class42_Sub1_Sub1) this).anInt6204 = i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_14_ + ')'));
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_15_, int i_16_, int i_17_) {
		super(var_ha_Sub1, i, i_15_, i_16_, i_17_);
		try {
			((Class42_Sub1_Sub1) this).anInt6207 = i_16_;
			do {
				if (((Class42) this).anInt3226 != 34037) {
					((Class42_Sub1_Sub1) this).aFloat6205 = ((Class42_Sub1_Sub1) this).aFloat6209 = 1.0F;
					((Class42_Sub1_Sub1) this).aBoolean6211 = true;
					if (!client.aBoolean3553)
						break;
				}
				((Class42_Sub1_Sub1) this).aBoolean6211 = false;
				((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_17_;
				((Class42_Sub1_Sub1) this).aFloat6205 = (float) i_16_;
			} while (false);
			((Class42_Sub1_Sub1) this).anInt6204 = i_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool) {
		super(var_ha_Sub1, 3553, i, i_18_, i_21_, i_22_);
		try {
			((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_20_ / (float) i_22_;
			((Class42_Sub1_Sub1) this).anInt6204 = i_20_;
			((Class42_Sub1_Sub1) this).aFloat6205 = (float) i_19_ / (float) i_21_;
			((Class42_Sub1_Sub1) this).anInt6207 = i_19_;
			((Class42_Sub1_Sub1) this).aBoolean6211 = false;
			this.method383(false, 10242, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + bool + ')'));
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_23_, int i_24_, int i_25_, int i_26_, byte[] is, int i_27_) {
		super(var_ha_Sub1, 3553, i, i_25_, i_26_);
		try {
			((Class42_Sub1_Sub1) this).anInt6204 = i_24_;
			((Class42_Sub1_Sub1) this).anInt6207 = i_23_;
			this.method378(i_23_, i_27_, true, 0, is, 0, (byte) -80, 0, 0, i_24_);
			((Class42_Sub1_Sub1) this).aBoolean6211 = false;
			((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_24_ / (float) i_26_;
			((Class42_Sub1_Sub1) this).aFloat6205 = (float) i_23_ / (float) i_25_;
			this.method383(false, 10242, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + (is != null ? "{...}" : "null") + ',' + i_27_ + ')'));
		}
	}

	Class42_Sub1_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_28_, int i_29_, boolean bool, int[] is, int i_30_, int i_31_) {
		super(var_ha_Sub1, i, 6408, i_28_, i_29_, bool, is, i_30_, i_31_, true);
		try {
			((Class42_Sub1_Sub1) this).anInt6207 = i_28_;
			do {
				if ((((Class42) this).anInt3226 ^ 0xffffffff) == -34038) {
					((Class42_Sub1_Sub1) this).aBoolean6211 = false;
					((Class42_Sub1_Sub1) this).aFloat6209 = (float) i_29_;
					((Class42_Sub1_Sub1) this).aFloat6205 = (float) i_28_;
					if (!client.aBoolean3553)
						break;
				}
				((Class42_Sub1_Sub1) this).aFloat6205 = ((Class42_Sub1_Sub1) this).aFloat6209 = 1.0F;
				((Class42_Sub1_Sub1) this).aBoolean6211 = true;
			} while (false);
			((Class42_Sub1_Sub1) this).anInt6204 = i_29_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_28_ + ',' + i_29_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}
}
