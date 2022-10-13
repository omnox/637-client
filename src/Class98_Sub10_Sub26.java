
/* Class98_Sub10_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class98_Sub10_Sub26 extends Class98_Sub10 {
	private int anInt5681 = 1;
	private int anInt5682 = 2048;
	static int anInt5683 = -1;
	static Class105 aClass105_5684 = new Class105("", 16);
	private byte[] aByteArray5685 = new byte[512];
	private int anInt5686;
	private int anInt5687;
	private int anInt5688 = 5;
	private short[] aShortArray5689 = new short[512];
	static Class98_Sub46_Sub16[] aClass98_Sub46_Sub16Array5690 = new Class98_Sub46_Sub16[14];
	private int anInt5691;

	public static void method1082(int i) {
		try {
			aClass98_Sub46_Sub16Array5690 = null;
			aClass105_5684 = null;
			int i_0_ = 75 % ((i - 73) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oo.B(" + i + ')');
		}
	}

	private final void method1083(int i) {
		do {
			try {
				Random random = new Random(anInt5686);
				aShortArray5689 = new short[512];
				if (i <= (~anInt5682))
					break;
				for (int i_1_ = 0; i_1_ < 512; i_1_++)
					aShortArray5689[i_1_] = (short) Class63.method546(-28737, anInt5682, random);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oo.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1001(byte i) {
		do {
			try {
				aByteArray5685 = Class279.method3323(anInt5686, 512);
				method1083(-1);
				if (i == 66)
					break;
				method1084(false, null, 81);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oo.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method990(int i, int i_2_) {
		try {
			int[] is = this.aClass16_3863.method237((byte) 98, i_2_);
			if (i != 255)
				anInt5686 = -69;
			if (this.aClass16_3863.aBoolean198) {
				int i_3_ = 2048 - -(anInt5691 * Class352.anIntArray3001[i_2_]);
				int i_4_ = i_3_ >> 12;
				int i_5_ = 1 + i_4_;
				int i_6_ = 0;
				while_145_: for (/**/; Class25.anInt268 > i_6_; i_6_++) {
					Class163.anInt3517 = Class93_Sub1_Sub1.anInt6291 = Class252.anInt1924 = Class206.anInt1567 = 2147483647;
					int i_7_ = 2048 - -(anInt5688 * Class64_Sub1.anIntArray3640[i_6_]);
					int i_8_ = i_7_ >> 12;
					int i_9_ = 1 + i_8_;
					for (int i_10_ = i_4_ + -1; i_10_ <= i_5_; i_10_++) {
						int i_11_ = aByteArray5685[0xff & (anInt5691 <= i_10_ ? -anInt5691 + i_10_ : i_10_)] & 0xff;
						for (int i_12_ = i_8_ - 1; i_12_ <= i_9_; i_12_++) {
							int i_13_ = 2 * (0xff & (aByteArray5685[0xff & (i_12_ >= anInt5688 ? i_12_ + -anInt5688 : i_12_) + i_11_]));
							int i_14_ = (-(i_12_ << 12) - aShortArray5689[i_13_++] + i_7_);
							int i_15_ = (-(i_10_ << 12) - (aShortArray5689[i_13_] - i_3_));
							int i_16_ = anInt5681;
							int i_17_;
							while_141_: do {
								while_140_: do {
									while_139_: do {
										while_138_: do {
											do {
												if (i_16_ != 1) {
													if (i_16_ != 3) {
														if (i_16_ != 4) {
															if (i_16_ != 5) {
																if (i_16_ == 2)
																	break while_139_;
																break while_140_;
															}
														} else
															break;
														break while_138_;
													}
												} else {
													i_17_ = ((i_14_ * i_14_ - -(i_15_ * i_15_)) >> 12);
													break while_141_;
												}
												i_15_ = (i_15_ < 0 ? -i_15_ : i_15_);
												i_14_ = (i_14_ >= 0 ? i_14_ : -i_14_);
												i_17_ = (i_14_ > i_15_ ? i_14_ : i_15_);
												break while_141_;
											} while (false);
											i_14_ = (int) ((Math.sqrt((float) (i_14_ < 0 ? -i_14_ : i_14_) / 4096.0F)) * 4096.0);
											i_15_ = (int) (4096.0 * (Math.sqrt((float) (i_15_ >= 0 ? i_15_ : -i_15_) / 4096.0F)));
											i_17_ = i_14_ + i_15_;
											i_17_ = i_17_ * i_17_ >> 12;
											break while_141_;
										} while (false);
										i_14_ *= i_14_;
										i_15_ *= i_15_;
										i_17_ = (int) ((Math.sqrt(Math.sqrt((float) (i_15_ + i_14_) / 1.6777216E7F))) * 4096.0);
										break while_141_;
									} while (false);
									i_17_ = ((i_15_ < 0 ? -i_15_ : i_15_) + (i_14_ < 0 ? -i_14_ : i_14_));
									break while_141_;
								} while (false);
								i_17_ = (int) (4096.0 * (Math.sqrt((float) ((i_14_ * i_14_) - -(i_15_ * i_15_)) / 1.6777216E7F)));
							} while (false);
							if (i_17_ < Class163.anInt3517) {
								Class206.anInt1567 = Class252.anInt1924;
								Class252.anInt1924 = Class93_Sub1_Sub1.anInt6291;
								Class93_Sub1_Sub1.anInt6291 = Class163.anInt3517;
								Class163.anInt3517 = i_17_;
							} else if (Class93_Sub1_Sub1.anInt6291 > i_17_) {
								Class206.anInt1567 = Class252.anInt1924;
								Class252.anInt1924 = Class93_Sub1_Sub1.anInt6291;
								Class93_Sub1_Sub1.anInt6291 = i_17_;
							} else if (Class252.anInt1924 <= i_17_) {
								if (i_17_ < Class206.anInt1567)
									Class206.anInt1567 = i_17_;
							} else {
								Class206.anInt1567 = Class252.anInt1924;
								Class252.anInt1924 = i_17_;
							}
						}
					}
					int i_18_ = anInt5687;
					while_143_: do {
						while_142_: do {
							do {
								if (i_18_ != 0) {
									if (i_18_ != 1) {
										if (i_18_ != 3) {
											if (i_18_ != 4) {
												if (i_18_ == 2)
													break while_143_;
												continue while_145_;
											}
										} else
											break;
										break while_142_;
									}
								} else {
									is[i_6_] = Class163.anInt3517;
									continue while_145_;
								}
								is[i_6_] = Class93_Sub1_Sub1.anInt6291;
								continue while_145_;
							} while (false);
							is[i_6_] = Class252.anInt1924;
							continue while_145_;
						} while (false);
						is[i_6_] = Class206.anInt1567;
						continue while_145_;
					} while (false);
					is[i_6_] = Class93_Sub1_Sub1.anInt6291 + -Class163.anInt3517;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oo.G(" + i + ',' + i_2_ + ')');
		}
	}

	final void method991(int i, RSByteBuffer class98_sub22, byte i_19_) {
		try {
			int i_20_ = i;
			while_150_: do {
				while_149_: do {
					while_148_: do {
						while_147_: do {
							while_146_: do {
								do {
									if (i_20_ != 0) {
										if (i_20_ != 1) {
											if (i_20_ != 2) {
												if (i_20_ != 3) {
													if (i_20_ != 4) {
														if (i_20_ != 5) {
															if (i_20_ == 6)
																break while_149_;
															break while_150_;
														}
													} else
														break while_147_;
													break while_148_;
												}
											} else
												break;
											break while_146_;
										}
									} else {
										anInt5688 = anInt5691 = class98_sub22.readUnsignedByte();
										break while_150_;
									}
									anInt5686 = class98_sub22.readUnsignedByte();
									break while_150_;
								} while (false);
								anInt5682 = class98_sub22.readShort();
								break while_150_;
							} while (false);
							anInt5687 = class98_sub22.readUnsignedByte();
							break while_150_;
						} while (false);
						anInt5681 = class98_sub22.readUnsignedByte();
						break while_150_;
					} while (false);
					anInt5688 = class98_sub22.readUnsignedByte();
					break while_150_;
				} while (false);
				anInt5691 = class98_sub22.readUnsignedByte();
			} while (false);
			if (i_19_ > -92)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oo.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i_19_ + ')'));
		}
	}

	public Class98_Sub10_Sub26() {
		super(0, true);
		anInt5686 = 0;
		anInt5691 = 5;
		anInt5687 = 2;
	}

	static final String method1084(boolean bool, RSByteBuffer class98_sub22, int i) {
		try {
			try {
				int i_21_ = class98_sub22.readSmart(1689622712);
				if (i < i_21_)
					i_21_ = i;
				byte[] is = new byte[i_21_];
				class98_sub22.position += (Class146_Sub3.aClass213_4949.method2782(class98_sub22.position, is, -69, i_21_, class98_sub22.data, 0));
				String string = Class98_Sub46_Sub6.method1546(i_21_, 0, (byte) -101, is);
				if (bool != false)
					return null;
				return string;
			} catch (Exception exception) {
				return "Cabbage";
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oo.D(" + bool + ',' + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
