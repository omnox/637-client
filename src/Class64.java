/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class64 {
	int anInt494;
	Class98_Sub27 aClass98_Sub27_495;

	abstract void method550(int i, int i_0_);

	abstract void method551(byte i);

	abstract int method552(int i);

	static final int method553(int i) {
		try {
			if ((double) Class278.aFloat2068 == 3.0)
				return 37;
			if ((double) Class278.aFloat2068 == 4.0)
				return 50;
			if (i != 1024)
				method555(58, -19, -15);
			if ((double) Class278.aFloat2068 == 6.0)
				return 75;
			if ((double) Class278.aFloat2068 == 8.0)
				return 100;
			return 200;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eea.K(" + i + ')');
		}
	}

	final void method554(int i, int i_1_) {
		do {
			try {
				if (method556(i, 29053) != 3)
					method550(i_1_ ^ ~0x2608, i);
				if (i_1_ == 9848)
					break;
				this.anInt494 = 1;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "eea.L(" + i + ',' + i_1_ + ')');
			}
			break;
		} while (false);
	}

	static final boolean method555(int i, int i_2_, int i_3_) {
		try {
			if (i_3_ >= -33)
				return false;
			if ((0x400 & i_2_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eea.J(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	abstract int method556(int i, int i_4_);

	Class64(Class98_Sub27 class98_sub27) {
		try {
			this.aClass98_Sub27_495 = class98_sub27;
			this.anInt494 = method552(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eea.<init>(" + (class98_sub27 != null ? "{...}" : "null") + ')'));
		}
	}

	Class64(int i, Class98_Sub27 class98_sub27) {
		try {
			this.aClass98_Sub27_495 = class98_sub27;
			this.anInt494 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eea.<init>(" + i + ',' + (class98_sub27 != null ? "{...}" : "null") + ')'));
		}
	}
}
