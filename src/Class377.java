/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class377 {
	static int[] anIntArray3178;
	int anInt3179;
	Node[] aClass98Array3180;
	private long aLong3181;
	static byte[][] aByteArrayArray3182;
	static int anInt3183;
	private Node aClass98_3184;
	private Node aClass98_3185;
	private int anInt3186 = 0;

	final Node method3990(long l, int i) {
		try {
			aLong3181 = l;
			Node class98 = (((Class377) this).aClass98Array3180[(int) (l & (long) (((Class377) this).anInt3179 + i))]);
			for (aClass98_3184 = ((Node) class98).aClass98_836; aClass98_3184 != class98; aClass98_3184 = ((Node) aClass98_3184).aClass98_836) {
				if ((l ^ 0xffffffffffffffffL) == (((Node) aClass98_3184).uid ^ 0xffffffffffffffffL)) {
					Node class98_0_ = aClass98_3184;
					aClass98_3184 = ((Node) aClass98_3184).aClass98_836;
					return class98_0_;
				}
			}
			aClass98_3184 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.J(" + l + ',' + i + ')');
		}
	}

	static final int method3991(GameInterfaceData class293, int i, int i_1_) {
		try {
			if (i >= -23)
				method3991(null, -63, -59);
			if (!client.getClickMask(class293).method1666((byte) -72, i_1_) && ((GameInterfaceData) class293).anObjectArray2329 == null)
				return -1;
			if (((GameInterfaceData) class293).anIntArray2326 != null && ((((GameInterfaceData) class293).anIntArray2326.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)))
				return ((GameInterfaceData) class293).anIntArray2326[i_1_];
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wr.K(" + (class293 != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
		}
	}

	final int method3992(Node[] class98s, byte i) {
		try {
			int i_2_ = 0;
			for (int i_3_ = 0; ((Class377) this).anInt3179 > i_3_; i_3_++) {
				Node class98 = ((Class377) this).aClass98Array3180[i_3_];
				for (Node class98_4_ = ((Node) class98).aClass98_836; class98 != class98_4_; class98_4_ = ((Node) class98_4_).aClass98_836)
					class98s[i_2_++] = class98_4_;
			}
			if (i != 74)
				method4000((byte) 120);
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wr.B(" + (class98s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Node method3993(int i) {
		try {
			if (aClass98_3184 == null)
				return null;
			for (Node class98 = (((Class377) this).aClass98Array3180[(int) ((long) (-1 + ((Class377) this).anInt3179) & aLong3181)]); aClass98_3184 != class98; aClass98_3184 = ((Node) aClass98_3184).aClass98_836) {
				if ((aLong3181 ^ 0xffffffffffffffffL) == (((Node) aClass98_3184).uid ^ 0xffffffffffffffffL)) {
					Node class98_5_ = aClass98_3184;
					aClass98_3184 = ((Node) aClass98_3184).aClass98_836;
					return class98_5_;
				}
			}
			aClass98_3184 = null;
			int i_6_ = -38 / ((70 - i) / 48);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.D(" + i + ')');
		}
	}

	final void method3994(int i) {
		try {
			for (int i_7_ = 0; ((((Class377) this).anInt3179 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
				Node class98 = ((Class377) this).aClass98Array3180[i_7_];
				for (;;) {
					Node class98_8_ = ((Node) class98).aClass98_836;
					if (class98_8_ == class98)
						break;
					class98_8_.remove();
				}
			}
			if (i < -59) {
				aClass98_3184 = null;
				aClass98_3185 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.H(" + i + ')');
		}
	}

	final Node iterate_next(int i) {
		try {
			if ((anInt3186 ^ 0xffffffff) < i && (((Class377) this).aClass98Array3180[anInt3186 - 1] != aClass98_3185)) {
				Node class98 = aClass98_3185;
				aClass98_3185 = ((Node) class98).aClass98_836;
				return class98;
			}
			while ((anInt3186 ^ 0xffffffff) > (((Class377) this).anInt3179 ^ 0xffffffff)) {
				Node class98 = (((Node) ((Class377) this).aClass98Array3180[anInt3186++]).aClass98_836);
				if (class98 != ((Class377) this).aClass98Array3180[anInt3186 + -1]) {
					aClass98_3185 = ((Node) class98).aClass98_836;
					return class98;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.F(" + i + ')');
		}
	}

	final void method3996(Node class98, long varpIndex, int i) {
		try {
			if (((Node) class98).aClass98_833 != null)
				class98.remove();
			Node class98_9_ = (((Class377) this).aClass98Array3180[(int) (varpIndex & (long) (i + ((Class377) this).anInt3179))]);
			((Node) class98).aClass98_836 = class98_9_;
			((Node) class98).aClass98_833 = ((Node) class98_9_).aClass98_833;
			((Node) ((Node) class98).aClass98_833).aClass98_836 = class98;
			((Node) class98).uid = varpIndex;
			((Node) ((Node) class98).aClass98_836).aClass98_833 = class98;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wr.G(" + (class98 != null ? "{...}" : "null") + ',' + varpIndex + ',' + i + ')'));
		}
	}

	Class377(int i) {
		try {
			((Class377) this).anInt3179 = i;
			((Class377) this).aClass98Array3180 = new Node[i];
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff); i_10_++) {
				Node class98 = (((Class377) this).aClass98Array3180[i_10_] = new Node());
				((Node) class98).aClass98_833 = class98;
				((Node) class98).aClass98_836 = class98;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.<init>(" + i + ')');
		}
	}

	final int method3997(byte i) {
		try {
			if (i <= 40)
				aByteArrayArray3182 = null;
			return ((Class377) this).anInt3179;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.I(" + i + ')');
		}
	}

	final Node start_iteration(int i) {
		try {
			if (i <= 93)
				method3992(null, (byte) 45);
			anInt3186 = 0;
			return iterate_next(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.C(" + i + ')');
		}
	}

	final int method3999(byte i) {
		try {
			int i_11_ = 0;
			for (int i_12_ = 0; ((((Class377) this).anInt3179 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
				Node class98 = ((Class377) this).aClass98Array3180[i_12_];
				for (Node class98_13_ = ((Node) class98).aClass98_836; class98 != class98_13_; class98_13_ = ((Node) class98_13_).aClass98_836)
					i_11_++;
			}
			if (i != -6)
				anIntArray3178 = null;
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.A(" + i + ')');
		}
	}

	public static void method4000(byte i) {
		try {
			aByteArrayArray3182 = null;
			if (i > -62)
				anInt3183 = -27;
			anIntArray3178 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.E(" + i + ')');
		}
	}
}
