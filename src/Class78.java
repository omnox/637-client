
/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class78 {
	static s[] activeTileHeightMap;
	static int[] anIntArray595 = { -1, -1, 1, 1 };
	static int anInt596;
	static int[] anIntArray597 = new int[32];

	static final void method790(int i, int i_0_, int i_1_, Class246_Sub3_Sub3 class246_sub3_sub3, Class246_Sub3_Sub3 class246_sub3_sub3_2_) {
		Class172 class172 = Class100.method1693(i, i_0_, i_1_);
		if (class172 != null) {
			class172.aClass246_Sub3_Sub3_1324 = class246_sub3_sub3;
			class172.aClass246_Sub3_Sub3_1333 = class246_sub3_sub3_2_;
			int i_3_ = activeTileHeightMap == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub3.method2978(-124)) {
				if (class246_sub3_sub3.method2987(6540)) {
					class246_sub3_sub3.aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_3_];
					Class359.aClass246_Sub3Array3056[i_3_] = class246_sub3_sub3;
				} else {
					class246_sub3_sub3.aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_3_];
					Class379.aClass246_Sub3Array3198[i_3_] = class246_sub3_sub3;
					Class358.aBoolean3033 = true;
				}
			} else {
				class246_sub3_sub3.aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_3_];
				Class130.aClass246_Sub3Array1029[i_3_] = class246_sub3_sub3;
			}
			if (class246_sub3_sub3_2_ != null) {
				if (class246_sub3_sub3_2_.method2978(-126)) {
					if (class246_sub3_sub3_2_.method2987(6540)) {
						class246_sub3_sub3_2_.aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_3_];
						Class359.aClass246_Sub3Array3056[i_3_] = class246_sub3_sub3_2_;
					} else {
						class246_sub3_sub3_2_.aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_3_];
						Class379.aClass246_Sub3Array3198[i_3_] = class246_sub3_sub3_2_;
						Class358.aBoolean3033 = true;
					}
				} else {
					class246_sub3_sub3_2_.aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_3_];
					Class130.aClass246_Sub3Array1029[i_3_] = class246_sub3_sub3_2_;
				}
			}
		}
	}

	static final void method791(byte i) {
		do {
			try {
				if (i == 102) {
					Class356 class356 = null;
					try {
						Class143 class143 = Class98_Sub43_Sub2.aClass88_5907.method875("2", true, 21516);
						while (class143.anInt1163 == 0)
							Class246_Sub7.method3131(0, 1L);
						if (class143.anInt1163 == 1) {
							class356 = (Class356) class143.anObject1162;
							byte[] is = (new byte[(int) class356.method3878((byte) -60)]);
							int i_4_;
							for (int i_5_ = 0; i_5_ < is.length; i_5_ += i_4_) {
								i_4_ = class356.method3879(-i_5_ + is.length, (byte) -26, i_5_, is);
								if (i_4_ == -1)
									throw new IOException("EOF");
							}
							Class31.method306(i ^ 0x270c, new RSByteBuffer(is));
						}
					} catch (Exception exception) {
						/* empty */
					}
					try {
						if (class356 == null)
							break;
						class356.method3880(true);
					} catch (Exception exception) {
						/* empty */
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fba.B(" + i + ')');
			}
		} while (false);
	}

	public static void method792(int i) {
		do {
			try {
				anIntArray597 = null;
				activeTileHeightMap = null;
				anIntArray595 = null;
				if (i == -17344)
					break;
				method792(-125);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fba.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
