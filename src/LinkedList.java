/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LinkedList {
	static Class314 aClass314_1195;
	static int[] anIntArray1196 = new int[32];
	static double aDouble1197 = -1.0;
	Node aClass98_1198 = new Node();
	private Node aClass98_1199;

	public static void method2415(boolean bool) {
		do {
			try {
				aClass314_1195 = null;
				anIntArray1196 = null;
				if (bool == false)
					break;
				method2415(false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kba.K(" + bool + ')');
			}
			break;
		} while (false);
	}

	final Node method2416(byte i) {
		try {
			int i_0_ = -103 % ((i - -66) / 47);
			Node class98 = aClass98_1199;
			if (class98 == this.aClass98_1198) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = class98.aClass98_833;
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.C(" + i + ')');
		}
	}

	final Node method2417(int i) {
		try {
			Node class98 = aClass98_1199;
			if (this.aClass98_1198 == class98) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = class98.aClass98_836;
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.F(" + i + ')');
		}
	}

	final Node method2418(int i) {
		try {
			if (i != 32)
				return null;
			Node class98 = this.aClass98_1198.aClass98_836;
			if (this.aClass98_1198 == class98) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = class98.aClass98_836;
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.D(" + i + ')');
		}
	}

	final void add_last(Node class98, int i) {
		do {
			try {
				if (class98.aClass98_833 != null)
					class98.remove();
				class98.aClass98_833 = this.aClass98_1198.aClass98_833;
				class98.aClass98_836 = this.aClass98_1198;
				class98.aClass98_833.aClass98_836 = class98;
				class98.aClass98_836.aClass98_833 = class98;
				if (i == -20911)
					break;
				this.aClass98_1198 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kba.B(" + (class98 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2420(int i) {
		try {
			if (i > -123)
				anIntArray1196 = null;
			if (this.aClass98_1198 != this.aClass98_1198.aClass98_836)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.L(" + i + ')');
		}
	}

	final Node method2421(int i) {
		try {
			Node class98 = this.aClass98_1198.aClass98_836;
			if (this.aClass98_1198 == class98)
				return null;
			class98.remove();
			if (i != 6494)
				aClass98_1199 = null;
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.J(" + i + ')');
		}
	}

	final void method2422(byte i) {
		do {
			try {
				for (;;) {
					Node class98 = (this.aClass98_1198.aClass98_836);
					if (class98 == this.aClass98_1198)
						break;
					class98.remove();
				}
				aClass98_1199 = null;
				if (i == 47)
					break;
				method2429(-56, -39);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kba.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2423(int i, Node class98) {
		do {
			try {
				if (class98.aClass98_833 != null)
					class98.remove();
				class98.aClass98_833 = this.aClass98_1198;
				class98.aClass98_836 = this.aClass98_1198.aClass98_836;
				class98.aClass98_833.aClass98_836 = class98;
				class98.aClass98_836.aClass98_833 = class98;
				if (i == -2)
					break;
				method2427(100);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kba.E(" + i + ',' + (class98 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method2424(int i) {
		try {
			int i_1_ = i;
			for (Node class98 = (this.aClass98_1198.aClass98_836); this.aClass98_1198 != class98; class98 = class98.aClass98_836)
				i_1_++;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.M(" + i + ')');
		}
	}

	final void method2425(LinkedList class148_2_, int i) {
		try {
			int i_3_ = -55 % ((11 - i) / 57);
			method2426(class148_2_, (this.aClass98_1198.aClass98_836), (byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kba.N(" + (class148_2_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method2426(LinkedList class148_4_, Node class98, byte i) {
		do {
			try {
				if (i > -57)
					method2421(-21);
				Node class98_5_ = this.aClass98_1198.aClass98_833;
				this.aClass98_1198.aClass98_833 = class98.aClass98_833;
				class98.aClass98_833.aClass98_836 = this.aClass98_1198;
				if (class98 == this.aClass98_1198)
					break;
				class98.aClass98_833 = (class148_4_.aClass98_1198.aClass98_833);
				class98.aClass98_833.aClass98_836 = class98;
				class148_4_.aClass98_1198.aClass98_833 = class98_5_;
				class98_5_.aClass98_836 = class148_4_.aClass98_1198;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kba.O(" + (class148_4_ != null ? "{...}" : "null") + ',' + (class98 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Node method2427(int i) {
		try {
			if (i > -39)
				return null;
			Node class98 = this.aClass98_1198.aClass98_833;
			if (this.aClass98_1198 == class98) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = class98.aClass98_833;
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.H(" + i + ')');
		}
	}

	static final void method2428(Class98_Sub33 class98_sub33, boolean bool, int i) {
		do {
			try {
				if (i != 15697)
					aClass314_1195 = null;
				if (class98_sub33.aBoolean4124) {
					if (class98_sub33.anInt4119 < 0 || Class358.method3889((class98_sub33.anInt4115), (class98_sub33.anInt4119), false)) {
						if (!bool)
							Canvas_Sub1.method119(class98_sub33.anInt4119, class98_sub33.anInt4113, class98_sub33.anInt4118, class98_sub33.anInt4121, class98_sub33.anInt4116, i ^ ~0x3d50, class98_sub33.anInt4112, -1, class98_sub33.anInt4115);
						else
							Class64_Sub13.method601(null, class98_sub33.anInt4113, class98_sub33.anInt4116, class98_sub33.anInt4112, class98_sub33.anInt4118, 6093);
						class98_sub33.remove();
					}
				} else {
					if (!class98_sub33.aBoolean4123 || class98_sub33.anInt4112 < 1 || class98_sub33.anInt4113 < 1 || (GameWorld.size_x - 2 < class98_sub33.anInt4112) || (class98_sub33.anInt4113 > GameWorld.size_y + -2))
						break;
					if (class98_sub33.anInt4114 < 0 || Class358.method3889((class98_sub33.anInt4122), (class98_sub33.anInt4114), false)) {
						if (!bool)
							Canvas_Sub1.method119(class98_sub33.anInt4114, class98_sub33.anInt4113, class98_sub33.anInt4118, class98_sub33.anInt4120, class98_sub33.anInt4116, -2, class98_sub33.anInt4112, -1, class98_sub33.anInt4122);
						else
							Class64_Sub13.method601((class98_sub33.aClass185_4125), class98_sub33.anInt4113, class98_sub33.anInt4116, class98_sub33.anInt4112, class98_sub33.anInt4118, 6093);
						class98_sub33.aBoolean4123 = false;
						if (!bool && (class98_sub33.anInt4119 == class98_sub33.anInt4114) && class98_sub33.anInt4119 == -1)
							class98_sub33.remove();
						else {
							if (bool || ((class98_sub33.anInt4119) != class98_sub33.anInt4114) || (class98_sub33.anInt4121 != (class98_sub33.anInt4120)) || ((class98_sub33.anInt4122) != class98_sub33.anInt4115))
								break;
							class98_sub33.remove();
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kba.A(" + (class98_sub33 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2429(int i, int i_6_) {
		try {
			Class105.anInt3415 = i_6_;
			r_Sub1.aClass79_6321.method794(119);
			int i_7_ = -38 % ((57 - i) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.I(" + i + ',' + i_6_ + ')');
		}
	}

	public LinkedList() {
		try {
			this.aClass98_1198.aClass98_833 = this.aClass98_1198;
			this.aClass98_1198.aClass98_836 = this.aClass98_1198;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kba.<init>(" + ')');
		}
	}
}
