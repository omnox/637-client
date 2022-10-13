
/* Class98_Sub10_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class98_Sub10_Sub32 extends Class98_Sub10 {
	static int anInt5718 = 0;
	private int anInt5719 = 1;
	static int anInt5720 = 0;
	private int anInt5721 = 1;
	private int anInt5722 = 204;

	final int[] method990(int i, int i_0_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237((byte) 98, i_0_);
			if (i != 255)
				anInt5719 = 57;
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
				int i_1_ = 0;
				for (/**/; (i_1_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_1_++) {
					int i_2_ = Class64_Sub1.anIntArray3640[i_1_];
					int i_3_ = Class352.anIntArray3001[i_0_];
					int i_4_ = anInt5721 * i_2_ >> 160759052;
					int i_5_ = i_3_ * anInt5719 >> 274375116;
					int i_6_ = i_2_ % (4096 / anInt5721) * anInt5721;
					int i_7_ = i_3_ % (4096 / anInt5719) * anInt5719;
					if (i_7_ < anInt5722) {
						for (i_4_ -= i_5_; (i_4_ ^ 0xffffffff) > -1; i_4_ += 4) {
							/* empty */
						}
						for (/**/; (i_4_ ^ 0xffffffff) < -4; i_4_ -= 4) {
							/* empty */
						}
						if ((i_4_ ^ 0xffffffff) != -2) {
							is[i_1_] = 0;
							continue;
						}
						if ((anInt5722 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
							is[i_1_] = 0;
							continue;
						}
					}
					if ((i_6_ ^ 0xffffffff) > (anInt5722 ^ 0xffffffff)) {
						for (i_4_ -= i_5_; (i_4_ ^ 0xffffffff) > -1; i_4_ += 4) {
							/* empty */
						}
						for (/**/; i_4_ > 3; i_4_ -= 4) {
							/* empty */
						}
						if ((i_4_ ^ 0xffffffff) < -1) {
							is[i_1_] = 0;
							continue;
						}
					}
					is[i_1_] = 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sd.G(" + i + ',' + i_0_ + ')');
		}
	}

	static final int method1096(int i, int i_8_) {
		try {
			if (i_8_ != 127)
				method1098((byte) 59);
			return i & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sd.B(" + i + ',' + i_8_ + ')');
		}
	}

	static final Class143 method1097(int i, String string, Class88 class88, int i_9_) {
		try {
			if ((i_9_ ^ 0xffffffff) == -1)
				return class88.method859(-14, string);
			if (i_9_ == 1) {
				try {
					Class203.method2705(26635, Class76_Sub11.anApplet3799, "openjs", (new Object[] { new URL(Class76_Sub11.anApplet3799.getCodeBase(), string).toString() }));
					Class143 class143 = new Class143();
					class143.anInt1163 = 1;
					return class143;
				} catch (Throwable throwable) {
					Class143 class143 = new Class143();
					class143.anInt1163 = 2;
					return class143;
				}
			}
			if ((i_9_ ^ 0xffffffff) == -3) {
				try {
					Class76_Sub11.anApplet3799.getAppletContext().showDocument(new URL(Class76_Sub11.anApplet3799.getCodeBase(), string), "_blank");
					Class143 class143 = new Class143();
					class143.anInt1163 = 1;
					return class143;
				} catch (Exception exception) {
					Class143 class143 = new Class143();
					class143.anInt1163 = 2;
					return class143;
				}
			}
			if (i != -18871)
				method1096(103, -97);
			if (i_9_ == 3) {
				try {
					Class203.method2704("loggedout", Class76_Sub11.anApplet3799, -26978);
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					Class76_Sub11.anApplet3799.getAppletContext().showDocument(new URL(Class76_Sub11.anApplet3799.getCodeBase(), string), "_top");
					Class143 class143 = new Class143();
					class143.anInt1163 = 1;
					return class143;
				} catch (Exception exception) {
					Class143 class143 = new Class143();
					class143.anInt1163 = 2;
					return class143;
				}
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sd.E(" + i + ',' + (string != null ? "{...}" : "null") + ',' + (class88 != null ? "{...}" : "null") + ',' + i_9_ + ')'));
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_10_) {
		while_167_: do {
			try {
				if (i_10_ >= -92)
					anInt5719 = 113;
				int i_11_ = i;
				do {
					if (i_11_ != 0) {
						if (i_11_ != 1) {
							if ((i_11_ ^ 0xffffffff) == -3)
								break;
							break while_167_;
						}
					} else {
						anInt5721 = class98_sub22.readUnsignedByte();
						break while_167_;
					}
					anInt5719 = class98_sub22.readUnsignedByte();
					break while_167_;
				} while (false);
				anInt5722 = class98_sub22.readShort();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sd.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_10_ + ')'));
			}
		} while (false);
	}

	static final void method1098(byte i) {
		do {
			try {
				int i_12_ = 63 % ((37 - i) / 59);
				if (Class98_Sub10_Sub9.aBoolean5585) {
					GameInterfaceData class293 = Class246_Sub9.method3139((byte) 72, Class187.anInt1450, Class310.anInt2652);
					if (class293 != null && ((GameInterfaceData) class293).anObjectArray2324 != null) {
						ClientScript2Event class98_sub21 = new ClientScript2Event();
						((ClientScript2Event) class98_sub21).component = class293;
						((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) class293).anObjectArray2324;
						ClientScript2Runtime.method3144(class98_sub21);
					}
					Class98_Sub10_Sub9.aBoolean5585 = false;
					Class376.anInt3173 = -1;
					Class21_Sub2.anInt5387 = -1;
					if (class293 == null)
						break;
					Class341.method3812(1, class293);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sd.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub32() {
		super(0, true);
	}
}
