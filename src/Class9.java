/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 {
	int anInt114;
	int anInt115;
	boolean aBoolean116 = false;
	Class335 aClass335_117;

	static final void method189(Class98_Sub46_Sub9 class98_sub46_sub9, byte i) {
		do {
			try {
				if (i == 87) {
					boolean bool = false;
					class98_sub46_sub9.method1524((byte) -90);
					for (Class98_Sub46_Sub9 class98_sub46_sub9_0_ = ((Class98_Sub46_Sub9) GameInterface.aClass215_3949.method2792(-1)); class98_sub46_sub9_0_ != null; class98_sub46_sub9_0_ = ((Class98_Sub46_Sub9) GameInterface.aClass215_3949.method2787(0))) {
						if (Class378.method4004((byte) 127, class98_sub46_sub9.method1559(78), class98_sub46_sub9_0_.method1559(103))) {
							bool = true;
							Class51.method487(i + -38, class98_sub46_sub9_0_, class98_sub46_sub9);
							break;
						}
					}
					if (bool)
						break;
					GameInterface.aClass215_3949.method2785(class98_sub46_sub9, -107);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("an.G(" + (class98_sub46_sub9 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Class332 method190(boolean bool, int i, int i_1_, ha var_ha) {
		try {
			long l = i_1_ << 16 | this.anInt114 | (!bool ? 0 : 262144) | var_ha.anInt937 << 19;
			Class332 class332 = (Class332) this.aClass335_117.aClass79_2818.get(l);
			if (class332 != null)
				return class332;
			if (!this.aClass335_117.aClass207_2814.method2742(-51, this.anInt114))
				return null;
			Class324 class324 = Class324.method3685((this.aClass335_117.aClass207_2814), this.anInt114, i);
			if (class324 != null) {
				class324.anInt2724 = class324.anInt2725 = class324.anInt2719 = class324.anInt2721 = 0;
				if (bool)
					class324.method3682();
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
					class324.method3687();
			}
			class332 = var_ha.method1758(class324, true);
			if (class332 != null)
				this.aClass335_117.aClass79_2818.put(l, class332);
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("an.C(" + bool + ',' + i + ',' + i_1_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method191(int i) {
		try {
			int i_3_ = 93 % ((19 - i) / 63);
			return this.aClass335_117.aClass207_2814.method2742(-68, this.anInt114);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "an.F(" + i + ')');
		}
	}

	final void method192(RSByteBuffer class98_sub22, boolean bool) {
		try {
			if (bool != false)
				method189(null, (byte) 10);
			for (;;) {
				int i = class98_sub22.readUnsignedByte();
				if (i == 0)
					break;
				method193(class98_sub22, (byte) -43, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("an.B(" + (class98_sub22 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method193(RSByteBuffer class98_sub22, byte i, int i_4_) {
		do {
			try {
				if (i != -43)
					method195(79, -65, null);
				if (i_4_ == 1)
					this.anInt114 = class98_sub22.readShort();
				else if (i_4_ == 2)
					this.anInt115 = class98_sub22.readMedium(i ^ 0x56);
				else if (i_4_ == 3)
					this.aBoolean116 = true;
				else {
					if (i_4_ != 4)
						break;
					this.anInt114 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("an.E(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method194() {
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < Class98_Sub46_Sub5.aClass174Array5970.length; i++) {
				if (!Class98_Sub46_Sub5.aClass174Array5970[i].method2563()) {
					synchronized (Class98_Sub46_Sub5.aClass174Array5970[i]) {
						Class98_Sub46_Sub5.aClass174Array5970[i].notify();
					}
					bool = false;
				} else
					Class98_Sub10_Sub39.aLongArray5772[i] = Class98_Sub46_Sub5.aClass174Array5970[i].method2562();
			}
			if (bool)
				break;
			try {
				Class246_Sub7.method3131(0, 1L);
			} catch (Exception exception) {
				/* empty */
			}
		}
		Class98_Sub46_Sub5.aClass174Array5970[Class98_Sub46_Sub5.aClass174Array5970.length - 1].method2561();
		Class69.method701(1);
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < Class98_Sub46_Sub5.aClass174Array5970.length - 1; i++) {
				if (!Class98_Sub46_Sub5.aClass174Array5970[i].method2563()) {
					synchronized (Class98_Sub46_Sub5.aClass174Array5970[i]) {
						Class98_Sub46_Sub5.aClass174Array5970[i].notify();
					}
					bool = false;
				}
			}
			if (bool)
				break;
			try {
				Class246_Sub7.method3131(0, 1L);
			} catch (Exception exception) {
				/* empty */
			}
		}
		for (int i = 1; i < Class98_Sub46_Sub5.aClass174Array5970.length - 2; i++)
			Class98_Sub46_Sub5.aClass174Array5970[i].method2561();
		Class69.method701(2);
		while (!Class98_Sub46_Sub5.aClass174Array5970[0].method2563()) {
			synchronized (Class98_Sub46_Sub5.aClass174Array5970[0]) {
				Class98_Sub46_Sub5.aClass174Array5970[0].notify();
			}
			try {
				Class246_Sub7.method3131(0, 1L);
			} catch (Exception exception) {
				/* empty */
			}
		}
		Class98_Sub46_Sub5.aClass174Array5970[0].method2561();
	}

	public Class9() {
		/* empty */
	}

	static final void method195(int i, int i_5_, GameInterfaceData[] class293s) {
		try {
			if (i_5_ != 28219)
				method194();
			for (int i_6_ = 0; class293s.length > i_6_; i_6_++) {
				GameInterfaceData class293 = class293s[i_6_];
				if (class293 != null && i == class293.anInt2234 && !client.method111(class293)) {
					if (class293.type == 0) {
						method195(class293.anInt2248, 28219, class293s);
						if (class293.interfaceComponents != null)
							method195(class293.anInt2248, 28219, (class293.interfaceComponents));
						GameInterface class98_sub18 = ((GameInterface) (Class116.aClass377_964.method3990(class293.anInt2248, -1)));
						if (class98_sub18 != null)
							Class350.method3844(class98_sub18.interfaceID, i_5_ + -28101);
					}
					if (class293.type == 6 && class293.anInt2208 != -1) {
						Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(class293.anInt2208, 16383));
						if (class97 != null) {
							class293.anInt2312 += Class279.anInt2099;
							int i_7_ = class293.anInt2303;
							while ((class97.anIntArray811[class293.anInt2303]) < class293.anInt2312) {
								class293.anInt2312 -= (class97.anIntArray811[class293.anInt2303]);
								class293.anInt2303++;
								if ((class97.anIntArray818).length <= class293.anInt2303) {
									class293.anInt2303 -= class97.anInt828;
									if (class293.anInt2303 < 0 || (class293.anInt2303 >= (class97.anIntArray818).length))
										class293.anInt2303 = 0;
								}
								class293.anInt2287 = 1 + class293.anInt2303;
								if ((class97.anIntArray818).length <= class293.anInt2287) {
									class293.anInt2287 -= class97.anInt828;
									if (class293.anInt2287 < 0 || ((class97.anIntArray818).length <= (class293.anInt2287)))
										class293.anInt2287 = -1;
								}
								Class341.method3812(1, class293);
							}
							if (i_7_ != class293.anInt2303)
								Class280.method3327((class293.anInt2303), class97, (byte) 121);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("an.D(" + i + ',' + i_5_ + ',' + (class293s != null ? "{...}" : "null") + ')'));
		}
	}
}
