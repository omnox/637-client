/* Class98_Sub10_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub31 extends Class98_Sub10 {
	private int anInt5714;
	private int anInt5715 = 4096;
	static Class350 aClass350_5716 = new Class350(0);
	static Class1[] aClass1Array5717;

	final void method991(int i, RSByteBuffer class98_sub22, byte i_0_) {
		do {
			try {
				int i_1_ = i;
				do {
					if ((i_1_ ^ 0xffffffff) != -1) {
						if (i_1_ != 1)
							break;
					} else {
						anInt5714 = class98_sub22.readShort();
						break;
					}
					anInt5715 = class98_sub22.readShort();
				} while (false);
				if (i_0_ < -92)
					break;
				method990(-115, -128);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("rf.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	final int[] method990(int i, int i_2_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237((byte) 98, i_2_);
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
				int[] is_3_ = this.method1000(i_2_, 0, 0);
				for (int i_4_ = 0; i_4_ < Class25.anInt268; i_4_++) {
					int i_5_ = is_3_[i_4_];
					is[i_4_] = ((i_5_ ^ 0xffffffff) <= (anInt5714 ^ 0xffffffff) && i_5_ <= anInt5715) ? 4096 : 0;
				}
			}
			if (i != 255)
				aClass350_5716 = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rf.G(" + i + ',' + i_2_ + ')');
		}
	}

	public static void method1095(int i) {
		do {
			try {
				aClass1Array5717 = null;
				aClass350_5716 = null;
				if (i == 10640)
					break;
				aClass1Array5717 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rf.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub31() {
		super(1, true);
		anInt5714 = 0;
	}
}
