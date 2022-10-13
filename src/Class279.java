/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;
import java.util.zip.CRC32;

final class Class279 {
	int anInt2095;
	static int anInt2096 = 0;
	static CRC32 aCRC32_2097 = new CRC32();
	String aString2098;
	static int anInt2099 = 0;
	static double aDouble2100;

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rga.toString(" + ')');
		}
	}

	public static void method3321(boolean bool) {
		try {
			if (bool != true)
				method3321(true);
			aCRC32_2097 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rga.A(" + bool + ')');
		}
	}

	Class279(String string, int i) {
		try {
			this.aString2098 = string;
			this.anInt2095 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rga.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3322(Node class98, Node class98_0_, byte i) {
		try {
			if (class98_0_.aClass98_833 != null)
				class98_0_.remove();
			if (i != 24)
				anInt2099 = 4;
			class98_0_.aClass98_833 = class98.aClass98_833;
			class98_0_.aClass98_836 = class98;
			class98_0_.aClass98_833.aClass98_836 = class98_0_;
			class98_0_.aClass98_836.aClass98_833 = class98_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rga.B(" + (class98 != null ? "{...}" : "null") + ',' + (class98_0_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final byte[] method3323(int i, int i_1_) {
		try {
			Class98_Sub46_Sub7 class98_sub46_sub7 = ((Class98_Sub46_Sub7) Class81.aClass100_617.method1694((byte) 117, i));
			if (class98_sub46_sub7 == null) {
				byte[] is = new byte[512];
				Random random = new Random(i);
				for (int i_2_ = 0; i_2_ < 255; i_2_++)
					is[i_2_] = (byte) i_2_;
				for (int i_3_ = 0; i_3_ < 255; i_3_++) {
					int i_4_ = -i_3_ + 255;
					int i_5_ = Class63.method546(-28737, i_4_, random);
					byte i_6_ = is[i_5_];
					is[i_5_] = is[i_4_];
					is[i_4_] = is[-i_3_ + 511] = i_6_;
				}
				class98_sub46_sub7 = new Class98_Sub46_Sub7(is);
				Class81.aClass100_617.method1695(26404, class98_sub46_sub7, i);
			}
			if (i_1_ != 512)
				method3322(null, null, (byte) 75);
			return class98_sub46_sub7.aByteArray5981;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rga.C(" + i + ',' + i_1_ + ')');
		}
	}
}
