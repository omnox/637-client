/* Class64_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub27 extends Class64 {
	static int anInt3716;

	static final Class93_Sub2 method663(int i, RSByteBuffer class98_sub22) {
		try {
			Class93 class93 = Class105.method1716(-1, class98_sub22);
			if (i > -14)
				return null;
			int i_0_ = class98_sub22.readInt(-2);
			int i_1_ = class98_sub22.readInt(-2);
			int i_2_ = class98_sub22.readShort();
			return new Class93_Sub2(class93.aClass63_3509, class93.aClass110_3511, class93.anInt3505, class93.anInt3507, class93.anInt3514, class93.anInt3504, class93.anInt3508, class93.anInt3506, class93.anInt3513, i_0_, i_1_, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw method667(runtimeexception, "ve.G(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')');
		}
	}

	final void method551(byte i) {
		do {
			try {
				if (this.anInt494 < 1 || this.anInt494 > 3)
					this.anInt494 = method552(0);
				if (i >= 118)
					break;
				anInt3716 = -41;
			} catch (RuntimeException runtimeexception) {
				throw method667(runtimeexception, "ve.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				IncomingOpcode.cs2Opcode = null;
			if (!this.aClass98_Sub27_495.method1289(-120).method2316(true))
				return 2;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw method667(runtimeexception, "ve.A(" + i + ')');
		}
	}

	final int method556(int i, int i_3_) {
		try {
			if (i_3_ != 29053)
				anInt3716 = -17;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw method667(runtimeexception, "ve.F(" + i + ',' + i_3_ + ')');
		}
	}

	static final int method664(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			if (Class78.activeTileHeightMap == null)
				return 0;
			if (i_5_ < 59)
				IncomingOpcode.cs2Opcode = null;
			if (i_6_ < 3) {
				int i_9_ = i_7_ >> 9;
				int i_10_ = i >> 9;
				if (i_8_ < 0 || i_4_ < 0 || i_8_ > -1 + GameWorld.size_x || (i_4_ > GameWorld.size_y + -1))
					return 0;
				if (i_9_ < 1 || i_10_ < 1 || i_9_ > GameWorld.size_x - 1 || (i_10_ > -1 + GameWorld.size_y))
					return 0;
				boolean bool = ((0x2 & (Class281.tileSettings[1][i_7_ >> 9][i >> 9])) != 0);
				if ((i_7_ & 0x1ff) == 0) {
					boolean bool_11_ = (((Class281.tileSettings[1][i_9_ + -1][i >> 9]) & 0x2) != 0);
					boolean bool_12_ = (((Class281.tileSettings[1][i_9_][i >> 9]) & 0x2) != 0);
					if (!bool_12_ == bool_11_)
						bool = (0x2 & (Class281.tileSettings[1][i_8_][i_4_])) != 0;
				}
				if ((0x1ff & i) == 0) {
					boolean bool_13_ = (((Class281.tileSettings[1][i_7_ >> 9][i_10_ - 1]) & 0x2) != 0);
					boolean bool_14_ = ((0x2 & (Class281.tileSettings[1][i_7_ >> 9][i_10_])) != 0);
					if (!bool_13_ != !bool_14_)
						bool = (0x2 & (Class281.tileSettings[1][i_8_][i_4_])) != 0;
				}
				if (bool)
					i_6_++;
			}
			return Class78.activeTileHeightMap[i_6_].method3417(i_7_, i, true);
		} catch (RuntimeException runtimeexception) {
			throw method667(runtimeexception, ("ve.I(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method665(int i) {
		try {
			if (i != 2)
				anInt3716 = 3;
			IncomingOpcode.cs2Opcode = null;
		} catch (RuntimeException runtimeexception) {
			throw method667(runtimeexception, "ve.H(" + i + ')');
		}
	}

	final void method550(int i, int i_15_) {
		try {
			int i_16_ = 13 / ((i - -26) / 41);
			this.anInt494 = i_15_;
		} catch (RuntimeException runtimeexception) {
			throw method667(runtimeexception, "ve.B(" + i + ',' + i_15_ + ')');
		}
	}

	Class64_Sub27(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	Class64_Sub27(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method666(byte i) {
		try {
			if (i <= 119)
				return -75;
			return this.anInt494;
		} catch (RuntimeException runtimeexception) {
			throw method667(runtimeexception, "ve.E(" + i + ')');
		}
	}

	static final RuntimeException_Sub1 method667(Throwable throwable, String string) {
		try {
			RuntimeException_Sub1 runtimeexception_sub1;
			if (!(throwable instanceof RuntimeException_Sub1))
				runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
			else {
				runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
				runtimeexception_sub1.aString3202 += ' ' + string;
			}
			return runtimeexception_sub1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
