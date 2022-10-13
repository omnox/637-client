/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Method;

final class Class340 {
	static RuneScapeCache aClass207_2847;
	static Class332[] aClass332Array2848;
	static int anInt2849 = 0;
	/* synthetic */ static Class aClass2850;
	/* synthetic */ static Class aClass2851;

	static final void method3801(Mobile class246_sub3_sub4_sub2, int i) {
		try {
			if (i != -28111)
				aClass332Array2848 = null;
			do {
				if ((((Mobile) class246_sub3_sub4_sub2).anInt6385) != -1) {
					Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(((Mobile) class246_sub3_sub4_sub2).anInt6385, 16383));
					if (class97 != null && ((Class97) class97).anIntArray818 != null) {
						((Mobile) class246_sub3_sub4_sub2).anInt6409++;
						if (((((Mobile) class246_sub3_sub4_sub2).anInt6350 ^ 0xffffffff) > (((Class97) class97).anIntArray818.length ^ 0xffffffff)) && (((Mobile) class246_sub3_sub4_sub2).anInt6409 > (((Class97) class97).anIntArray811[((Mobile) class246_sub3_sub4_sub2).anInt6350]))) {
							((Mobile) class246_sub3_sub4_sub2).anInt6409 = 1;
							((Mobile) class246_sub3_sub4_sub2).anInt6350++;
							((Mobile) class246_sub3_sub4_sub2).anInt6419++;
							if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
								Class349.method3840((byte) -128, class246_sub3_sub4_sub2, (((Mobile) class246_sub3_sub4_sub2).anInt6350), class97);
						}
						if ((((Class97) class97).anIntArray818.length ^ 0xffffffff) >= (((Mobile) class246_sub3_sub4_sub2).anInt6350 ^ 0xffffffff)) {
							((Mobile) class246_sub3_sub4_sub2).anInt6350 = 0;
							((Mobile) class246_sub3_sub4_sub2).anInt6409 = 0;
							if (((Mobile) class246_sub3_sub4_sub2).aBoolean6359) {
								((Mobile) class246_sub3_sub4_sub2).anInt6385 = class246_sub3_sub4_sub2.getRenderAnimation(1).method3478(i + 28148);
								if ((((Mobile) class246_sub3_sub4_sub2).anInt6385 ^ 0xffffffff) == 0) {
									((Mobile) class246_sub3_sub4_sub2).aBoolean6359 = false;
									break;
								}
								class97 = (Class151_Sub7.aClass183_5001.method2623(((Mobile) class246_sub3_sub4_sub2).anInt6385, i + 44494));
							}
							if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
								Class349.method3840((byte) -126, class246_sub3_sub4_sub2, (((Mobile) class246_sub3_sub4_sub2).anInt6350), class97);
						}
						((Mobile) class246_sub3_sub4_sub2).anInt6419 = ((Mobile) class246_sub3_sub4_sub2).anInt6350 + 1;
						if (((Class97) class97).anIntArray818 != null) {
							if (((Mobile) class246_sub3_sub4_sub2).anInt6419 >= ((Class97) class97).anIntArray818.length)
								((Mobile) class246_sub3_sub4_sub2).anInt6419 = 0;
						} else {
							((Mobile) class246_sub3_sub4_sub2).aBoolean6359 = false;
							((Mobile) class246_sub3_sub4_sub2).anInt6385 = -1;
						}
					} else {
						((Mobile) class246_sub3_sub4_sub2).aBoolean6359 = false;
						((Mobile) class246_sub3_sub4_sub2).anInt6385 = -1;
					}
				}
			} while (false);
			do {
				if ((((Mobile) class246_sub3_sub4_sub2).anInt6379) != -1 && (((Mobile) class246_sub3_sub4_sub2).anInt6391) <= Class215.anInt1614) {
					Class107 class107 = (Class196.aClass304_1509.method3564(2, ((Mobile) class246_sub3_sub4_sub2).anInt6379));
					int i_0_ = ((Class107) class107).anInt910;
					if ((i_0_ ^ 0xffffffff) != 0) {
						Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_0_, 16383);
						if (((Class107) class107).aBoolean909) {
							if (((Class97) class97).anInt821 == 3) {
								if (((Mobile) class246_sub3_sub4_sub2).anInt6436 > 0 && ((((Mobile) class246_sub3_sub4_sub2).anInt6390 ^ 0xffffffff) >= (Class215.anInt1614 ^ 0xffffffff)) && (Class215.anInt1614 > (((Mobile) class246_sub3_sub4_sub2).anInt6424))) {
									((Mobile) class246_sub3_sub4_sub2).anInt6379 = -1;
									break;
								}
							} else if (((Class97) class97).anInt821 == 1 && (((Mobile) class246_sub3_sub4_sub2).anInt6436 > 0) && ((((Mobile) class246_sub3_sub4_sub2).anInt6390 ^ 0xffffffff) >= (Class215.anInt1614 ^ 0xffffffff)) && ((Class215.anInt1614 ^ 0xffffffff) < ((((Mobile) class246_sub3_sub4_sub2).anInt6424) ^ 0xffffffff))) {
								((Mobile) class246_sub3_sub4_sub2).anInt6391 = Class215.anInt1614 + 1;
								break;
							}
						}
						if (class97 != null && ((Class97) class97).anIntArray818 != null) {
							if (((Mobile) class246_sub3_sub4_sub2).anInt6376 < 0) {
								((Mobile) class246_sub3_sub4_sub2).anInt6376 = 0;
								if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
									Class349.method3840((byte) -126, class246_sub3_sub4_sub2, 0, class97);
							}
							((Mobile) class246_sub3_sub4_sub2).anInt6396++;
							if ((((Class97) class97).anIntArray818.length > ((Mobile) class246_sub3_sub4_sub2).anInt6376) && ((((Mobile) class246_sub3_sub4_sub2).anInt6396 ^ 0xffffffff) < ((((Class97) class97).anIntArray811[((Mobile) class246_sub3_sub4_sub2).anInt6376]) ^ 0xffffffff))) {
								((Mobile) class246_sub3_sub4_sub2).anInt6376++;
								((Mobile) class246_sub3_sub4_sub2).anInt6396 = 1;
								if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
									Class349.method3840((byte) -127, class246_sub3_sub4_sub2, ((Mobile) class246_sub3_sub4_sub2).anInt6376, class97);
							}
							if ((((Class97) class97).anIntArray818.length ^ 0xffffffff) >= (((Mobile) class246_sub3_sub4_sub2).anInt6376 ^ 0xffffffff)) {
								if (!((Class107) class107).aBoolean909)
									((Mobile) class246_sub3_sub4_sub2).anInt6379 = -1;
								else {
									((Mobile) class246_sub3_sub4_sub2).anInt6356++;
									((Mobile) class246_sub3_sub4_sub2).anInt6376 -= ((Class97) class97).anInt828;
									if (((Class97) class97).anInt807 > (((Mobile) class246_sub3_sub4_sub2).anInt6356)) {
										if ((((Mobile) class246_sub3_sub4_sub2).anInt6376) < 0 || ((((Class97) class97).anIntArray818).length <= (((Mobile) class246_sub3_sub4_sub2).anInt6376)))
											((Mobile) class246_sub3_sub4_sub2).anInt6379 = -1;
										else if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
											Class349.method3840((byte) -127, class246_sub3_sub4_sub2, (((Mobile) class246_sub3_sub4_sub2).anInt6376), class97);
									} else
										((Mobile) class246_sub3_sub4_sub2).anInt6379 = -1;
								}
							}
							((Mobile) class246_sub3_sub4_sub2).anInt6367 = ((Mobile) class246_sub3_sub4_sub2).anInt6376 - -1;
							if ((((Mobile) class246_sub3_sub4_sub2).anInt6367 ^ 0xffffffff) <= (((Class97) class97).anIntArray818.length ^ 0xffffffff)) {
								if (((Class107) class107).aBoolean909) {
									((Mobile) class246_sub3_sub4_sub2).anInt6367 -= ((Class97) class97).anInt828;
									if ((((Class97) class97).anInt807 ^ 0xffffffff) < ((((Mobile) class246_sub3_sub4_sub2).anInt6356 - -1) ^ 0xffffffff)) {
										if ((((Mobile) class246_sub3_sub4_sub2).anInt6367) < 0 || (((((Class97) class97).anIntArray818).length ^ 0xffffffff) >= ((((Mobile) class246_sub3_sub4_sub2).anInt6367) ^ 0xffffffff)))
											((Mobile) class246_sub3_sub4_sub2).anInt6367 = -1;
									} else
										((Mobile) class246_sub3_sub4_sub2).anInt6367 = -1;
								} else
									((Mobile) class246_sub3_sub4_sub2).anInt6367 = -1;
							}
						} else
							((Mobile) class246_sub3_sub4_sub2).anInt6379 = -1;
					} else
						((Mobile) class246_sub3_sub4_sub2).anInt6379 = -1;
				}
			} while (false);
			do {
				if ((((Mobile) class246_sub3_sub4_sub2).anInt6365) != -1 && (Class215.anInt1614 >= (((Mobile) class246_sub3_sub4_sub2).anInt6426))) {
					Class107 class107 = (Class196.aClass304_1509.method3564(2, ((Mobile) class246_sub3_sub4_sub2).anInt6365));
					int i_1_ = ((Class107) class107).anInt910;
					if (i_1_ != -1) {
						Class97 class97 = Class151_Sub7.aClass183_5001.method2623(i_1_, 16383);
						if (((Class107) class107).aBoolean909) {
							if ((((Class97) class97).anInt821 ^ 0xffffffff) == -4) {
								if (((Mobile) class246_sub3_sub4_sub2).anInt6436 > 0 && (Class215.anInt1614 >= ((Mobile) class246_sub3_sub4_sub2).anInt6390) && ((Class215.anInt1614 ^ 0xffffffff) < (((Mobile) class246_sub3_sub4_sub2).anInt6424 ^ 0xffffffff))) {
									((Mobile) class246_sub3_sub4_sub2).anInt6365 = -1;
									break;
								}
							} else if (((Class97) class97).anInt821 == 1 && (((Mobile) class246_sub3_sub4_sub2).anInt6436 ^ 0xffffffff) < -1 && (Class215.anInt1614 >= (((Mobile) class246_sub3_sub4_sub2).anInt6390)) && ((Class215.anInt1614 ^ 0xffffffff) < ((((Mobile) class246_sub3_sub4_sub2).anInt6424) ^ 0xffffffff))) {
								((Mobile) class246_sub3_sub4_sub2).anInt6426 = Class215.anInt1614 + 1;
								break;
							}
						}
						if (class97 == null || ((Class97) class97).anIntArray818 == null)
							((Mobile) class246_sub3_sub4_sub2).anInt6365 = -1;
						else {
							if (((Mobile) class246_sub3_sub4_sub2).anInt6428 < 0) {
								((Mobile) class246_sub3_sub4_sub2).anInt6428 = 0;
								if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
									Class349.method3840((byte) -127, class246_sub3_sub4_sub2, 0, class97);
							}
							((Mobile) class246_sub3_sub4_sub2).anInt6427++;
							if (((((Class97) class97).anIntArray818.length ^ 0xffffffff) < (((Mobile) class246_sub3_sub4_sub2).anInt6428 ^ 0xffffffff)) && ((((Class97) class97).anIntArray811[((Mobile) class246_sub3_sub4_sub2).anInt6428]) < ((Mobile) class246_sub3_sub4_sub2).anInt6427)) {
								((Mobile) class246_sub3_sub4_sub2).anInt6428++;
								((Mobile) class246_sub3_sub4_sub2).anInt6427 = 1;
								if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
									Class349.method3840((byte) -126, class246_sub3_sub4_sub2, ((Mobile) class246_sub3_sub4_sub2).anInt6428, class97);
							}
							if ((((Mobile) class246_sub3_sub4_sub2).anInt6428 ^ 0xffffffff) <= (((Class97) class97).anIntArray818.length ^ 0xffffffff)) {
								if (((Class107) class107).aBoolean909) {
									((Mobile) class246_sub3_sub4_sub2).anInt6380++;
									((Mobile) class246_sub3_sub4_sub2).anInt6428 -= ((Class97) class97).anInt828;
									if ((((Class97) class97).anInt807 ^ 0xffffffff) >= (((Mobile) class246_sub3_sub4_sub2).anInt6380 ^ 0xffffffff))
										((Mobile) class246_sub3_sub4_sub2).anInt6365 = -1;
									else if (((((Mobile) class246_sub3_sub4_sub2).anInt6428) ^ 0xffffffff) > -1 || ((((Class97) class97).anIntArray818).length <= (((Mobile) class246_sub3_sub4_sub2).anInt6428)))
										((Mobile) class246_sub3_sub4_sub2).anInt6365 = -1;
									else if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
										Class349.method3840((byte) -128, class246_sub3_sub4_sub2, (((Mobile) class246_sub3_sub4_sub2).anInt6428), class97);
								} else
									((Mobile) class246_sub3_sub4_sub2).anInt6365 = -1;
							}
							((Mobile) class246_sub3_sub4_sub2).anInt6421 = ((Mobile) class246_sub3_sub4_sub2).anInt6428 + 1;
							if (((Mobile) class246_sub3_sub4_sub2).anInt6421 >= ((Class97) class97).anIntArray818.length) {
								if (((Class107) class107).aBoolean909) {
									((Mobile) class246_sub3_sub4_sub2).anInt6421 -= ((Class97) class97).anInt828;
									if ((((Class97) class97).anInt807 ^ 0xffffffff) >= (1 + (((Mobile) class246_sub3_sub4_sub2).anInt6380) ^ 0xffffffff))
										((Mobile) class246_sub3_sub4_sub2).anInt6421 = -1;
									else if ((((Mobile) class246_sub3_sub4_sub2).anInt6421) < 0 || (((((Class97) class97).anIntArray818).length ^ 0xffffffff) >= ((((Mobile) class246_sub3_sub4_sub2).anInt6421) ^ 0xffffffff)))
										((Mobile) class246_sub3_sub4_sub2).anInt6421 = -1;
								} else
									((Mobile) class246_sub3_sub4_sub2).anInt6421 = -1;
							}
						}
					} else
						((Mobile) class246_sub3_sub4_sub2).anInt6365 = -1;
				}
			} while (false);
			if ((((Mobile) class246_sub3_sub4_sub2).anInt6413 ^ 0xffffffff) != 0 && (((Mobile) class246_sub3_sub4_sub2).anInt6400) <= 1) {
				Class97 class97 = (Class151_Sub7.aClass183_5001.method2623((((Mobile) class246_sub3_sub4_sub2).anInt6413), 16383));
				if (((Class97) class97).anInt821 == 3) {
					if ((((Mobile) class246_sub3_sub4_sub2).anInt6436) > 0 && Class215.anInt1614 >= (((Mobile) class246_sub3_sub4_sub2).anInt6390) && (((Mobile) class246_sub3_sub4_sub2).anInt6424) < Class215.anInt1614) {
						((Mobile) class246_sub3_sub4_sub2).anIntArray6373 = null;
						((Mobile) class246_sub3_sub4_sub2).anInt6413 = -1;
					}
				} else if (((Class97) class97).anInt821 == 1 && ((Mobile) class246_sub3_sub4_sub2).anInt6436 > 0 && ((((Mobile) class246_sub3_sub4_sub2).anInt6390 ^ 0xffffffff) >= (Class215.anInt1614 ^ 0xffffffff)) && ((((Mobile) class246_sub3_sub4_sub2).anInt6424 ^ 0xffffffff) > (Class215.anInt1614 ^ 0xffffffff)))
					((Mobile) class246_sub3_sub4_sub2).anInt6400 = 2;
			}
			if ((((Mobile) class246_sub3_sub4_sub2).anInt6413 != -1) && ((((Mobile) class246_sub3_sub4_sub2).anInt6400) ^ 0xffffffff) == -1) {
				Class97 class97 = (Class151_Sub7.aClass183_5001.method2623((((Mobile) class246_sub3_sub4_sub2).anInt6413), 16383));
				if (class97 != null && ((Class97) class97).anIntArray818 != null) {
					((Mobile) class246_sub3_sub4_sub2).anInt6366++;
					if (((((Class97) class97).anIntArray818.length ^ 0xffffffff) < (((Mobile) class246_sub3_sub4_sub2).anInt6393 ^ 0xffffffff)) && ((((Class97) class97).anIntArray811[((Mobile) class246_sub3_sub4_sub2).anInt6393]) < ((Mobile) class246_sub3_sub4_sub2).anInt6366)) {
						((Mobile) class246_sub3_sub4_sub2).anInt6366 = 1;
						((Mobile) class246_sub3_sub4_sub2).anInt6393++;
						if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
							Class349.method3840((byte) -126, class246_sub3_sub4_sub2, (((Mobile) class246_sub3_sub4_sub2).anInt6393), class97);
					}
					if ((((Mobile) class246_sub3_sub4_sub2).anInt6393) >= ((Class97) class97).anIntArray818.length) {
						((Mobile) class246_sub3_sub4_sub2).anInt6405++;
						((Mobile) class246_sub3_sub4_sub2).anInt6393 -= ((Class97) class97).anInt828;
						if ((((Class97) class97).anInt807 ^ 0xffffffff) < (((Mobile) class246_sub3_sub4_sub2).anInt6405 ^ 0xffffffff)) {
							if ((((Mobile) class246_sub3_sub4_sub2).anInt6393 ^ 0xffffffff) > -1 || ((((Class97) class97).anIntArray818.length ^ 0xffffffff) >= (((Mobile) class246_sub3_sub4_sub2).anInt6393 ^ 0xffffffff))) {
								((Mobile) class246_sub3_sub4_sub2).anInt6413 = -1;
								((Mobile) class246_sub3_sub4_sub2).anIntArray6373 = null;
							} else if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
								Class349.method3840((byte) -128, class246_sub3_sub4_sub2, (((Mobile) class246_sub3_sub4_sub2).anInt6393), class97);
						} else {
							((Mobile) class246_sub3_sub4_sub2).anIntArray6373 = null;
							((Mobile) class246_sub3_sub4_sub2).anInt6413 = -1;
						}
					}
					((Mobile) class246_sub3_sub4_sub2).anInt6361 = 1 + ((Mobile) class246_sub3_sub4_sub2).anInt6393;
					if ((((Mobile) class246_sub3_sub4_sub2).anInt6361) >= ((Class97) class97).anIntArray818.length) {
						((Mobile) class246_sub3_sub4_sub2).anInt6361 -= ((Class97) class97).anInt828;
						if ((((Class97) class97).anInt807 ^ 0xffffffff) < (1 + ((Mobile) class246_sub3_sub4_sub2).anInt6405 ^ 0xffffffff)) {
							if ((((Mobile) class246_sub3_sub4_sub2).anInt6361 ^ 0xffffffff) > -1 || ((((Mobile) class246_sub3_sub4_sub2).anInt6361 ^ 0xffffffff) <= ((((Class97) class97).anIntArray818).length ^ 0xffffffff)))
								((Mobile) class246_sub3_sub4_sub2).anInt6361 = -1;
						} else
							((Mobile) class246_sub3_sub4_sub2).anInt6361 = -1;
					}
				} else {
					((Mobile) class246_sub3_sub4_sub2).anIntArray6373 = null;
					((Mobile) class246_sub3_sub4_sub2).anInt6413 = -1;
				}
			}
			if ((((Mobile) class246_sub3_sub4_sub2).anInt6400 ^ 0xffffffff) < -1)
				((Mobile) class246_sub3_sub4_sub2).anInt6400--;
			for (int i_2_ = 0; i_2_ < (((Mobile) class246_sub3_sub4_sub2).aClass226Array6387).length; i_2_++) {
				Class226 class226 = (((Mobile) class246_sub3_sub4_sub2).aClass226Array6387[i_2_]);
				if (class226 != null) {
					if (((Class226) class226).anInt1703 > 0)
						((Class226) class226).anInt1703--;
					else {
						Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(((Class226) class226).anInt1700, i + 44494));
						if (class97 != null && ((Class97) class97).anIntArray818 != null) {
							((Class226) class226).anInt1707++;
							if ((((Class226) class226).anInt1702 < ((Class97) class97).anIntArray818.length) && ((((Class97) class97).anIntArray811[((Class226) class226).anInt1702]) < ((Class226) class226).anInt1707)) {
								((Class226) class226).anInt1707 = 1;
								((Class226) class226).anInt1702++;
								if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
									Class349.method3840((byte) -128, class246_sub3_sub4_sub2, ((Class226) class226).anInt1702, class97);
							}
							if (((Class97) class97).anIntArray818.length <= ((Class226) class226).anInt1702) {
								((Class226) class226).anInt1704++;
								((Class226) class226).anInt1702 -= ((Class97) class97).anInt828;
								if (((Class97) class97).anInt807 <= ((Class226) class226).anInt1704)
									((Mobile) class246_sub3_sub4_sub2).aClass226Array6387[i_2_] = null;
								else if (((Class226) class226).anInt1702 >= 0 && ((((Class97) class97).anIntArray818).length > (((Class226) class226).anInt1702))) {
									if (!((Mobile) class246_sub3_sub4_sub2).aBoolean6371)
										Class349.method3840((byte) -127, class246_sub3_sub4_sub2, ((Class226) class226).anInt1702, class97);
								} else
									((Mobile) class246_sub3_sub4_sub2).aClass226Array6387[i_2_] = null;
							}
							((Class226) class226).anInt1701 = ((Class226) class226).anInt1702 - -1;
							if ((((Class97) class97).anIntArray818.length ^ 0xffffffff) >= (((Class226) class226).anInt1701 ^ 0xffffffff)) {
								((Class226) class226).anInt1701 -= ((Class97) class97).anInt828;
								if ((1 + ((Class226) class226).anInt1704 ^ 0xffffffff) <= (((Class97) class97).anInt807 ^ 0xffffffff))
									((Class226) class226).anInt1701 = -1;
								else if ((((Class226) class226).anInt1701 ^ 0xffffffff) > -1 || ((((Class97) class97).anIntArray818).length <= (((Class226) class226).anInt1701)))
									((Class226) class226).anInt1701 = -1;
							}
						} else
							((Mobile) class246_sub3_sub4_sub2).aClass226Array6387[i_2_] = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uo.D(" + (class246_sub3_sub4_sub2 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3802(ha var_ha, int i, byte i_3_) {
		do {
			try {
				if (i_3_ != -59)
					aClass332Array2848 = null;
				if (!Class98_Sub17.aBoolean3942 || !Class135.aBoolean1052)
					Class59.anInt464 = 0;
				else {
					if (Class93_Sub1.aBoolean5479)
						Class98_Sub42.aLong4212 = Class376.aClass142_3174.method2308((byte) 69);
					Class151_Sub7.anInt5006 = 0;
					Class302.anInt2518 = 0;
					Class98_Sub16.anInt3927 = 0;
					int[] is = var_ha.Y();
					Class38.anInt358 = (int) ((float) is[2] / 3.0F);
					Class331.anInt2800 = (int) ((float) is[3] / 3.0F);
					var_ha.method1801(Class98_Sub46_Sub4.anIntArray5960);
					if ((Class64_Sub3.anInt3646 != (int) ((float) Class98_Sub46_Sub4.anIntArray5960[0] / 3.0F)) || ((IncomingOpcode.anInt461 ^ 0xffffffff) != ((int) ((float) (Class98_Sub46_Sub4.anIntArray5960[1]) / 3.0F) ^ 0xffffffff))) {
						IncomingOpcode.anInt461 = (int) ((float) (Class98_Sub46_Sub4.anIntArray5960[1]) / 3.0F);
						Class64_Sub3.anInt3646 = (int) ((float) (Class98_Sub46_Sub4.anIntArray5960[0]) / 3.0F);
						Class111_Sub3.anIntArray4707 = (new int[IncomingOpcode.anInt461 * Class64_Sub3.anInt3646]);
						Class2.anInt69 = Class64_Sub3.anInt3646 >> 427328737;
						Class98_Sub10_Sub23.anInt5659 = IncomingOpcode.anInt461 >> 942536705;
					}
					RuntimeException_Sub1.aClass111_3203 = var_ha.method1752();
					Class59.anInt464 = 0;
					for (int i_4_ = 0; Class21_Sub3.anInt5389 > i_4_; i_4_++)
						Class271.method3278(3, i, var_ha, Class258.aClass155Array1951[i_4_]);
					for (int i_5_ = 0; i_5_ < Class336.anInt2820; i_5_++)
						Class271.method3278(3, i, var_ha, (Class98_Sub30.aClass155Array4099[i_5_]));
					for (int i_6_ = 0; (ha.anInt936 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
						Class271.method3278(3, i, var_ha, (Class98_Sub32_Sub1.aClass155Array5889[i_6_]));
					Class4.anInt81 = 0;
					if (Class59.anInt464 > 0) {
						int i_7_ = Class111_Sub3.anIntArray4707.length;
						int i_8_ = -i_7_ + i_7_ & 0x7;
						int i_9_ = 0;
						while ((i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
						}
						while (i_7_ > i_9_)
							Class111_Sub3.anIntArray4707[i_9_++] = 2147483647;
						Class287.anInt2190 = 1;
						for (int i_10_ = 0; ((Class59.anInt464 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
							Class155 class155 = Class213.aClass155Array1611[i_10_];
							Class267.method3243(((Class155) class155).aShortArray1244[1], ((Class155) class155).aShortArray1244[0], (byte) 85, ((Class155) class155).aShortArray1234[1], ((Class155) class155).aShortArray1235[3], ((Class155) class155).aShortArray1235[0], ((Class155) class155).aShortArray1244[3], ((Class155) class155).aShortArray1235[1], ((Class155) class155).aShortArray1234[0], ((Class155) class155).aShortArray1234[3]);
							Class267.method3243(((Class155) class155).aShortArray1244[2], ((Class155) class155).aShortArray1244[1], (byte) 81, ((Class155) class155).aShortArray1234[2], ((Class155) class155).aShortArray1235[3], ((Class155) class155).aShortArray1235[1], ((Class155) class155).aShortArray1244[3], ((Class155) class155).aShortArray1235[2], ((Class155) class155).aShortArray1234[1], ((Class155) class155).aShortArray1234[3]);
						}
						Class287.anInt2190 = 2;
					}
					if (!Class93_Sub1.aBoolean5479)
						break;
					Class249.aLong1898 = (Class376.aClass142_3174.method2308((byte) 69) - Class98_Sub42.aLong4212);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("uo.B(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static final synchronized void method3803(boolean bool) {
		try {
			if (bool == false && Class98_Sub10_Sub22.anObject5653 == null) {
				try {
					Class var_class = (Class.forName("java.lang.management.ManagementFactory"));
					Method method = var_class.getDeclaredMethod("getPlatformMBeanServer");
					Object object = method.invoke(null);
					Method method_11_ = (var_class.getMethod("newPlatformMXBeanProxy", (new Class[] { (Class.forName("javax.management.MBeanServerConnection")), (aClass2850 != null ? aClass2850 : (aClass2850 = method3805("java.lang.String"))), (aClass2851 != null ? aClass2851 : (aClass2851 = method3805("java.lang.Class"))) })));
					Class98_Sub10_Sub22.anObject5653 = (method_11_.invoke(null, (new Object[] { object, "com.sun.management:type=HotSpotDiagnostic", (Class.forName("com.sun.management.HotSpotDiagnosticMXBean")) })));
				} catch (Exception exception) {
					System.out.println("HeapDump setup error:");
					exception.printStackTrace();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uo.C(" + bool + ')');
		}
	}

	public static void method3804(byte i) {
		try {
			aClass332Array2848 = null;
			if (i == -71)
				aClass207_2847 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uo.A(" + i + ')');
		}
	}

	/* synthetic */
	static Class method3805(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
