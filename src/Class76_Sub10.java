/* Class76_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76_Sub10 extends Class76 {
	static int anInt3793;
	static int anInt3794;

	final void method746(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ >= -75)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vga.E(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method739(int i) {
		try {
			if (i != -2)
				method770(13);
			this.aHa_Sub3_585.method2029((byte) -62, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vga.C(" + i + ')');
		}
	}

	final void method742(int i, int i_2_, Interface4 interface4) {
		do {
			try {
				this.aHa_Sub3_585.method2005(interface4, 63);
				this.aHa_Sub3_585.method2015(i_2_, (byte) -118);
				if (i == 6)
					break;
				method742(-90, 37, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vga.I(" + i + ',' + i_2_ + ',' + (interface4 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final char method769(char c, int i, byte i_3_) {
		try {
			if (i_3_ > -66)
				return '|';
			if (c >= 192 && c <= 255) {
				if (c >= 192 && c <= 198)
					return 'A';
				if (c == 199)
					return 'C';
				if (c >= 200 && c <= 203)
					return 'E';
				if (c >= 204 && c <= 207)
					return 'I';
				if (c >= 210 && c <= 214)
					return 'O';
				if (c >= 217 && c <= 220)
					return 'U';
				if (c == 221)
					return 'Y';
				if (c == 223)
					return 's';
				if (c >= 224 && c <= 230)
					return 'a';
				if (c == 231)
					return 'c';
				if (c >= 232 && c <= 235)
					return 'e';
				if (c >= 236 && c <= 239)
					return 'i';
				if (c >= 242 && c <= 246)
					return 'o';
				if (c >= 249 && c <= 252)
					return 'u';
				if (c == 253 || c == 255)
					return 'y';
			}
			if (c == 338)
				return 'O';
			if (c == 339)
				return 'o';
			if (c == 376)
				return 'Y';
			return c;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vga.A(" + c + ',' + i + ',' + i_3_ + ')'));
		}
	}

	static final void method770(int i) {
		do {
			try {
				int i_4_ = Class2.anInt71;
				int[] is = Class319.anIntArray2705;
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[is[i_5_]]);
					if (class246_sub3_sub4_sub2_sub2 != null && class246_sub3_sub4_sub2_sub2.anInt6384 > 0) {
						class246_sub3_sub4_sub2_sub2.anInt6384--;
						if (class246_sub3_sub4_sub2_sub2.anInt6384 == 0)
							class246_sub3_sub4_sub2_sub2.aString6374 = null;
					}
				}
				for (int i_6_ = 0; Class150.anInt1211 > i_6_; i_6_++) {
					long l = Class325.anIntArray2726[i_6_];
					Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(l, -1));
					if (class98_sub39 != null) {
						Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						if (class246_sub3_sub4_sub2_sub1.anInt6384 > 0) {
							class246_sub3_sub4_sub2_sub1.anInt6384--;
							if (class246_sub3_sub4_sub2_sub1.anInt6384 == 0)
								class246_sub3_sub4_sub2_sub1.aString6374 = null;
						}
					}
				}
				if (i == -256)
					break;
				method770(98);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vga.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method743(int i, boolean bool) {
		do {
			try {
				if (i >= 93)
					break;
				anInt3794 = 111;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vga.D(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final void method748(int i, boolean bool) {
		try {
			if (i != 69)
				method739(77);
			this.aHa_Sub3_585.method2029((byte) -93, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vga.B(" + i + ',' + bool + ')');
		}
	}

	final boolean method745(byte i) {
		try {
			if (i != 27)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vga.H(" + i + ')');
		}
	}

	Class76_Sub10(ha_Sub3 var_ha_Sub3) {
		super(var_ha_Sub3);
	}
}
