/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class379 {
	static boolean aBoolean3192;
	int anInt3193 = 0;
	int anInt3194;
	int anInt3195;
	static int anInt3196 = 0;
	int anInt3197 = 2048;
	static AnimableEntity[] aClass246_Sub3Array3198;

	public static void method4007(boolean bool) {
		do {
			try {
				aClass246_Sub3Array3198 = null;
				if (bool == true)
					break;
				anInt3196 = -58;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ww.C(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method4008(byte i, RSByteBuffer class98_sub22) {
		try {
			if (i <= 54)
				method4008((byte) 108, null);
			for (;;) {
				int i_0_ = class98_sub22.readUnsignedByte();
				if (i_0_ == 0)
					break;
				method4009(i_0_, class98_sub22, 116);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ww.B(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method4009(int i, RSByteBuffer class98_sub22, int i_1_) {
		try {
			if (i_1_ <= 88)
				method4009(-8, null, -88);
			if ((i ^ 0xffffffff) == -2)
				((Class379) this).anInt3195 = class98_sub22.readUnsignedByte();
			else if (i != 2) {
				if ((i ^ 0xffffffff) != -4) {
					if (i == 4)
						((Class379) this).anInt3193 = class98_sub22.readUShort(false);
				} else
					((Class379) this).anInt3194 = class98_sub22.readShort();
			} else
				((Class379) this).anInt3197 = class98_sub22.readShort();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ww.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	public Class379() {
		((Class379) this).anInt3194 = 2048;
		((Class379) this).anInt3195 = 0;
	}
}
