/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ModelDefinitions {
	short[] aShortArray1385;
	int[] anIntArray1386;
	int anInt1387 = 12;
	byte[] aByteArray1388;
	int[] anIntArray1389;
	int[] anIntArray1390;
	int anInt1391;
	short[] aShortArray1392;
	short[] aShortArray1393;
	short[] aShortArray1394;
	int[] anIntArray1395;
	int anInt1396;
	int[] anIntArray1397;
	Class35[] aClass35Array1398;
	byte[] aByteArray1399;
	int[] anIntArray1400;
	static boolean aBoolean1401 = false;
	byte[] aByteArray1402;
	short[] aShortArray1403;
	int[] anIntArray1404;
	static int anInt1405 = 0;
	int anInt1406;
	int anInt1407 = 0;
	short[] aShortArray1408;
	short[] aShortArray1409;
	short[] aShortArray1410;
	byte[] aByteArray1411;
	int[] anIntArray1412;
	Class87[] aClass87Array1413;
	byte[] aByteArray1414;
	short[] aShortArray1415;
	int[] anIntArray1416;
	int[] anIntArray1417;
	int[] anIntArray1418;
	Class106[] aClass106Array1419;
	byte[] aByteArray1420;
	short[] aShortArray1421;
	byte aByte1422;
	byte[] aByteArray1423;

	private final void method2587(byte[] is, int i) {
		do {
			try {
				boolean bool = false;
				boolean bool_0_ = false;
				RSByteBuffer class98_sub22 = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_1_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_2_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_3_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_4_ = new RSByteBuffer(is);
				((RSByteBuffer) class98_sub22).position = -18 + is.length;
				((ModelDefinitions) this).anInt1407 = class98_sub22.readShort();
				((ModelDefinitions) this).anInt1391 = class98_sub22.readShort();
				((ModelDefinitions) this).anInt1396 = class98_sub22.readUnsignedByte();
				int i_5_ = class98_sub22.readUnsignedByte();
				int i_6_ = class98_sub22.readUnsignedByte();
				int i_7_ = class98_sub22.readUnsignedByte();
				int i_8_ = class98_sub22.readUnsignedByte();
				int i_9_ = class98_sub22.readUnsignedByte();
				int i_10_ = class98_sub22.readShort();
				int i_11_ = class98_sub22.readShort();
				int i_12_ = class98_sub22.readShort();
				int i_13_ = class98_sub22.readShort();
				int i_14_ = 0;
				int i_15_ = i_14_;
				i_14_ += ((ModelDefinitions) this).anInt1407;
				int i_16_ = i_14_;
				i_14_ += ((ModelDefinitions) this).anInt1391;
				int i_17_ = i_14_;
				if (i_6_ == 255)
					i_14_ += ((ModelDefinitions) this).anInt1391;
				int i_18_ = i_14_;
				if ((i_8_ ^ 0xffffffff) == -2)
					i_14_ += ((ModelDefinitions) this).anInt1391;
				int i_19_ = i_14_;
				if (i_5_ == 1)
					i_14_ += ((ModelDefinitions) this).anInt1391;
				int i_20_ = i_14_;
				if ((i_9_ ^ 0xffffffff) == -2)
					i_14_ += ((ModelDefinitions) this).anInt1407;
				int i_21_ = i_14_;
				if (i_7_ == 1)
					i_14_ += ((ModelDefinitions) this).anInt1391;
				int i_22_ = i_14_;
				i_14_ += i_13_;
				int i_23_ = i_14_;
				i_14_ += 2 * ((ModelDefinitions) this).anInt1391;
				int i_24_ = i_14_;
				i_14_ += ((ModelDefinitions) this).anInt1396 * 6;
				int i_25_ = i_14_;
				i_14_ += i_10_;
				int i_26_ = i_14_;
				i_14_ += i_11_;
				int i_27_ = i_14_;
				((ModelDefinitions) this).anIntArray1416 = new int[((ModelDefinitions) this).anInt1407];
				if (i_7_ == 1)
					((ModelDefinitions) this).aByteArray1411 = new byte[((ModelDefinitions) this).anInt1391];
				if (((ModelDefinitions) this).anInt1396 > 0) {
					((ModelDefinitions) this).aShortArray1421 = new short[((ModelDefinitions) this).anInt1396];
					((ModelDefinitions) this).aShortArray1385 = new short[((ModelDefinitions) this).anInt1396];
					((ModelDefinitions) this).aShortArray1403 = new short[((ModelDefinitions) this).anInt1396];
					((ModelDefinitions) this).aByteArray1388 = new byte[((ModelDefinitions) this).anInt1396];
				}
				if (i_5_ == 1) {
					((ModelDefinitions) this).aByteArray1414 = new byte[((ModelDefinitions) this).anInt1391];
					((ModelDefinitions) this).aByteArray1420 = new byte[((ModelDefinitions) this).anInt1391];
					((ModelDefinitions) this).aShortArray1409 = new short[((ModelDefinitions) this).anInt1391];
				}
				((ModelDefinitions) this).aShortArray1415 = new short[((ModelDefinitions) this).anInt1391];
				((ModelDefinitions) this).anIntArray1418 = new int[((ModelDefinitions) this).anInt1407];
				((ModelDefinitions) this).anIntArray1400 = new int[((ModelDefinitions) this).anInt1407];
				((ModelDefinitions) this).aShortArray1410 = new short[((ModelDefinitions) this).anInt1391];
				i_14_ += i_12_;
				((ModelDefinitions) this).aShortArray1392 = new short[((ModelDefinitions) this).anInt1391];
				((RSByteBuffer) class98_sub22).position = i_15_;
				((ModelDefinitions) this).aShortArray1393 = new short[((ModelDefinitions) this).anInt1391];
				if ((i_8_ ^ 0xffffffff) == -2)
					((ModelDefinitions) this).anIntArray1395 = new int[((ModelDefinitions) this).anInt1391];
				if ((i_6_ ^ 0xffffffff) == -256)
					((ModelDefinitions) this).aByteArray1402 = new byte[((ModelDefinitions) this).anInt1391];
				else
					((ModelDefinitions) this).aByte1422 = (byte) i_6_;
				if (i_9_ == 1)
					((ModelDefinitions) this).anIntArray1417 = new int[((ModelDefinitions) this).anInt1407];
				((RSByteBuffer) class98_sub22_1_).position = i_25_;
				((RSByteBuffer) class98_sub22_2_).position = i_26_;
				((RSByteBuffer) class98_sub22_3_).position = i_27_;
				((RSByteBuffer) class98_sub22_4_).position = i_20_;
				int i_28_ = 0;
				int i_29_ = 0;
				int i_30_ = 0;
				for (int i_31_ = 0; ((ModelDefinitions) this).anInt1407 > i_31_; i_31_++) {
					int i_32_ = class98_sub22.readUnsignedByte();
					int i_33_ = 0;
					if ((i_32_ & 0x1 ^ 0xffffffff) != -1)
						i_33_ = class98_sub22_1_.method1239(40);
					int i_34_ = 0;
					if ((i_32_ & 0x2 ^ 0xffffffff) != -1)
						i_34_ = class98_sub22_2_.method1239(-122);
					int i_35_ = 0;
					if ((0x4 & i_32_ ^ 0xffffffff) != -1)
						i_35_ = class98_sub22_3_.method1239(i ^ ~0x31);
					((ModelDefinitions) this).anIntArray1416[i_31_] = i_33_ + i_28_;
					((ModelDefinitions) this).anIntArray1400[i_31_] = i_34_ + i_29_;
					((ModelDefinitions) this).anIntArray1418[i_31_] = i_30_ + i_35_;
					i_29_ = ((ModelDefinitions) this).anIntArray1400[i_31_];
					i_30_ = ((ModelDefinitions) this).anIntArray1418[i_31_];
					i_28_ = ((ModelDefinitions) this).anIntArray1416[i_31_];
					if ((i_9_ ^ 0xffffffff) == -2)
						((ModelDefinitions) this).anIntArray1417[i_31_] = class98_sub22_4_.readUnsignedByte();
				}
				((RSByteBuffer) class98_sub22).position = i_23_;
				((RSByteBuffer) class98_sub22_1_).position = i_19_;
				((RSByteBuffer) class98_sub22_2_).position = i_17_;
				((RSByteBuffer) class98_sub22_3_).position = i_21_;
				((RSByteBuffer) class98_sub22_4_).position = i_18_;
				for (int i_36_ = 0; i_36_ < ((ModelDefinitions) this).anInt1391; i_36_++) {
					((ModelDefinitions) this).aShortArray1415[i_36_] = (short) class98_sub22.readShort();
					if ((i_5_ ^ 0xffffffff) == -2) {
						int i_37_ = class98_sub22_1_.readUnsignedByte();
						if ((i_37_ & 0x1 ^ 0xffffffff) != -2)
							((ModelDefinitions) this).aByteArray1414[i_36_] = (byte) 0;
						else {
							bool = true;
							((ModelDefinitions) this).aByteArray1414[i_36_] = (byte) 1;
						}
						if ((0x2 & i_37_) != 2) {
							((ModelDefinitions) this).aByteArray1420[i_36_] = (byte) -1;
							((ModelDefinitions) this).aShortArray1409[i_36_] = (short) -1;
						} else {
							((ModelDefinitions) this).aByteArray1420[i_36_] = (byte) (i_37_ >> -870827966);
							((ModelDefinitions) this).aShortArray1409[i_36_] = ((ModelDefinitions) this).aShortArray1415[i_36_];
							((ModelDefinitions) this).aShortArray1415[i_36_] = (short) 127;
							if (((ModelDefinitions) this).aShortArray1409[i_36_] != -1)
								bool_0_ = true;
						}
					}
					if ((i_6_ ^ 0xffffffff) == -256)
						((ModelDefinitions) this).aByteArray1402[i_36_] = class98_sub22_2_.readSignedByte();
					if (i_7_ == 1)
						((ModelDefinitions) this).aByteArray1411[i_36_] = class98_sub22_3_.readSignedByte();
					if ((i_8_ ^ 0xffffffff) == -2)
						((ModelDefinitions) this).anIntArray1395[i_36_] = class98_sub22_4_.readUnsignedByte();
				}
				((ModelDefinitions) this).anInt1406 = i;
				((RSByteBuffer) class98_sub22).position = i_22_;
				((RSByteBuffer) class98_sub22_1_).position = i_16_;
				short i_38_ = 0;
				short i_39_ = 0;
				short i_40_ = 0;
				int i_41_ = 0;
				for (int i_42_ = 0; ((ModelDefinitions) this).anInt1391 > i_42_; i_42_++) {
					int i_43_ = class98_sub22_1_.readUnsignedByte();
					if ((i_43_ ^ 0xffffffff) == -2) {
						i_38_ = (short) (class98_sub22.method1239(-96) + i_41_);
						i_41_ = i_38_;
						i_39_ = (short) (class98_sub22.method1239(105) + i_41_);
						i_41_ = i_39_;
						i_40_ = (short) (class98_sub22.method1239(i + -104) + i_41_);
						((ModelDefinitions) this).aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						((ModelDefinitions) this).aShortArray1410[i_42_] = i_39_;
						((ModelDefinitions) this).aShortArray1392[i_42_] = i_40_;
						if ((((ModelDefinitions) this).anInt1406 ^ 0xffffffff) > (i_38_ ^ 0xffffffff))
							((ModelDefinitions) this).anInt1406 = i_38_;
						if (i_39_ > ((ModelDefinitions) this).anInt1406)
							((ModelDefinitions) this).anInt1406 = i_39_;
						if ((((ModelDefinitions) this).anInt1406 ^ 0xffffffff) > (i_40_ ^ 0xffffffff))
							((ModelDefinitions) this).anInt1406 = i_40_;
					}
					if (i_43_ == 2) {
						i_39_ = i_40_;
						i_40_ = (short) (i_41_ + class98_sub22.method1239(120));
						((ModelDefinitions) this).aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						((ModelDefinitions) this).aShortArray1410[i_42_] = i_39_;
						((ModelDefinitions) this).aShortArray1392[i_42_] = i_40_;
						if (i_40_ > ((ModelDefinitions) this).anInt1406)
							((ModelDefinitions) this).anInt1406 = i_40_;
					}
					if ((i_43_ ^ 0xffffffff) == -4) {
						i_38_ = i_40_;
						i_40_ = (short) (class98_sub22.method1239(39) + i_41_);
						((ModelDefinitions) this).aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						((ModelDefinitions) this).aShortArray1410[i_42_] = i_39_;
						((ModelDefinitions) this).aShortArray1392[i_42_] = i_40_;
						if (i_40_ > ((ModelDefinitions) this).anInt1406)
							((ModelDefinitions) this).anInt1406 = i_40_;
					}
					if (i_43_ == 4) {
						short i_44_ = i_38_;
						i_38_ = i_39_;
						i_39_ = i_44_;
						i_40_ = (short) (class98_sub22.method1239(116) + i_41_);
						((ModelDefinitions) this).aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						((ModelDefinitions) this).aShortArray1410[i_42_] = i_39_;
						((ModelDefinitions) this).aShortArray1392[i_42_] = i_40_;
						if (((ModelDefinitions) this).anInt1406 < i_40_)
							((ModelDefinitions) this).anInt1406 = i_40_;
					}
				}
				((RSByteBuffer) class98_sub22).position = i_24_;
				((ModelDefinitions) this).anInt1406++;
				for (int i_45_ = 0; ((ModelDefinitions) this).anInt1396 > i_45_; i_45_++) {
					((ModelDefinitions) this).aByteArray1388[i_45_] = (byte) 0;
					((ModelDefinitions) this).aShortArray1403[i_45_] = (short) class98_sub22.readShort();
					((ModelDefinitions) this).aShortArray1421[i_45_] = (short) class98_sub22.readShort();
					((ModelDefinitions) this).aShortArray1385[i_45_] = (short) class98_sub22.readShort();
				}
				if (((ModelDefinitions) this).aByteArray1420 != null) {
					boolean bool_46_ = false;
					for (int i_47_ = 0; ((i_47_ ^ 0xffffffff) > (((ModelDefinitions) this).anInt1391 ^ 0xffffffff)); i_47_++) {
						int i_48_ = 0xff & ((ModelDefinitions) this).aByteArray1420[i_47_];
						if ((i_48_ ^ 0xffffffff) != -256) {
							if (((0xffff & ((ModelDefinitions) this).aShortArray1403[i_48_]) != ((ModelDefinitions) this).aShortArray1393[i_47_]) || ((0xffff & (((ModelDefinitions) this).aShortArray1421[i_48_])) != (((ModelDefinitions) this).aShortArray1410[i_47_])) || ((((ModelDefinitions) this).aShortArray1392[i_47_] ^ 0xffffffff) != ((((ModelDefinitions) this).aShortArray1385[i_48_]) & 0xffff ^ 0xffffffff)))
								bool_46_ = true;
							else
								((ModelDefinitions) this).aByteArray1420[i_47_] = (byte) -1;
						}
					}
					if (!bool_46_)
						((ModelDefinitions) this).aByteArray1420 = null;
				}
				if (!bool)
					((ModelDefinitions) this).aByteArray1414 = null;
				if (bool_0_)
					break;
				((ModelDefinitions) this).aShortArray1409 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lv.H(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final float method2588(float f, int i, int i_49_, float f_50_, float f_51_) {
		try {
			if (i_49_ != -24576)
				method2588(-0.72166127F, 92, -119, -1.0185089F, -1.6095228F);
			float[] fs = Class48_Sub2_Sub1.aFloatArrayArray5522[i];
			return fs[2] * f_51_ + (f * fs[0] + fs[1] * f_50_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.D(" + f + ',' + i + ',' + i_49_ + ',' + f_50_ + ',' + f_51_ + ')'));
		}
	}

	private final void method2589(byte[] is, int i) {
		do {
			try {
				RSByteBuffer class98_sub22 = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_52_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_53_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_54_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_55_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_56_ = new RSByteBuffer(is);
				RSByteBuffer class98_sub22_57_ = new RSByteBuffer(is);
				((RSByteBuffer) class98_sub22).position = is.length - 23;
				((ModelDefinitions) this).anInt1407 = class98_sub22.readShort();
				((ModelDefinitions) this).anInt1391 = class98_sub22.readShort();
				((ModelDefinitions) this).anInt1396 = class98_sub22.readUnsignedByte();
				int i_58_ = class98_sub22.readUnsignedByte();
				boolean bool = (i_58_ & i) == 1;
				boolean bool_59_ = (0x2 & i_58_ ^ 0xffffffff) == -3;
				boolean bool_60_ = (i_58_ & 0x4) == 4;
				boolean bool_61_ = (i_58_ & 0x8 ^ 0xffffffff) == -9;
				if (bool_61_) {
					((RSByteBuffer) class98_sub22).position -= 7;
					((ModelDefinitions) this).anInt1387 = class98_sub22.readUnsignedByte();
					((RSByteBuffer) class98_sub22).position += 6;
				}
				int i_62_ = class98_sub22.readUnsignedByte();
				int i_63_ = class98_sub22.readUnsignedByte();
				int i_64_ = class98_sub22.readUnsignedByte();
				int i_65_ = class98_sub22.readUnsignedByte();
				int i_66_ = class98_sub22.readUnsignedByte();
				int i_67_ = class98_sub22.readShort();
				int i_68_ = class98_sub22.readShort();
				int i_69_ = class98_sub22.readShort();
				int i_70_ = class98_sub22.readShort();
				int i_71_ = class98_sub22.readShort();
				int i_72_ = 0;
				int i_73_ = 0;
				int i_74_ = 0;
				if (((ModelDefinitions) this).anInt1396 > 0) {
					((RSByteBuffer) class98_sub22).position = 0;
					((ModelDefinitions) this).aByteArray1388 = new byte[((ModelDefinitions) this).anInt1396];
					for (int i_75_ = 0; i_75_ < ((ModelDefinitions) this).anInt1396; i_75_++) {
						byte i_76_ = (((ModelDefinitions) this).aByteArray1388[i_75_] = class98_sub22.readSignedByte());
						if ((i_76_ ^ 0xffffffff) == -3)
							i_74_++;
						if ((i_76_ ^ 0xffffffff) == -1)
							i_72_++;
						if ((i_76_ ^ 0xffffffff) <= -2 && i_76_ <= 3)
							i_73_++;
					}
				}
				int i_77_ = ((ModelDefinitions) this).anInt1396;
				int i_78_ = i_77_;
				i_77_ += ((ModelDefinitions) this).anInt1407;
				int i_79_ = i_77_;
				if (bool)
					i_77_ += ((ModelDefinitions) this).anInt1391;
				int i_80_ = i_77_;
				i_77_ += ((ModelDefinitions) this).anInt1391;
				int i_81_ = i_77_;
				if (i_62_ == 255)
					i_77_ += ((ModelDefinitions) this).anInt1391;
				int i_82_ = i_77_;
				if (i_64_ == 1)
					i_77_ += ((ModelDefinitions) this).anInt1391;
				int i_83_ = i_77_;
				if (i_66_ == 1)
					i_77_ += ((ModelDefinitions) this).anInt1407;
				int i_84_ = i_77_;
				if (i_63_ == 1)
					i_77_ += ((ModelDefinitions) this).anInt1391;
				int i_85_ = i_77_;
				i_77_ += i_70_;
				int i_86_ = i_77_;
				if (i_65_ == 1)
					i_77_ += 2 * ((ModelDefinitions) this).anInt1391;
				int i_87_ = i_77_;
				i_77_ += i_71_;
				int i_88_ = i_77_;
				i_77_ += 2 * ((ModelDefinitions) this).anInt1391;
				int i_89_ = i_77_;
				i_77_ += i_67_;
				int i_90_ = i_77_;
				i_77_ += i_68_;
				int i_91_ = i_77_;
				i_77_ += i_69_;
				int i_92_ = i_77_;
				i_77_ += i_72_ * 6;
				int i_93_ = i_77_;
				i_77_ += i_73_ * 6;
				int i_94_ = 6;
				if ((((ModelDefinitions) this).anInt1387 ^ 0xffffffff) != -15) {
					if ((((ModelDefinitions) this).anInt1387 ^ 0xffffffff) <= -16)
						i_94_ = 9;
				} else
					i_94_ = 7;
				int i_95_ = i_77_;
				i_77_ += i_73_ * i_94_;
				int i_96_ = i_77_;
				i_77_ += i_73_;
				int i_97_ = i_77_;
				i_77_ += i_73_;
				int i_98_ = i_77_;
				i_77_ += 2 * i_74_ + i_73_;
				((ModelDefinitions) this).aShortArray1410 = new short[((ModelDefinitions) this).anInt1391];
				((ModelDefinitions) this).aShortArray1393 = new short[((ModelDefinitions) this).anInt1391];
				int i_99_ = i_77_;
				if ((i_64_ ^ 0xffffffff) == -2)
					((ModelDefinitions) this).anIntArray1395 = new int[((ModelDefinitions) this).anInt1391];
				if (bool)
					((ModelDefinitions) this).aByteArray1414 = new byte[((ModelDefinitions) this).anInt1391];
				if ((i_63_ ^ 0xffffffff) == -2)
					((ModelDefinitions) this).aByteArray1411 = new byte[((ModelDefinitions) this).anInt1391];
				((RSByteBuffer) class98_sub22).position = i_78_;
				if ((((ModelDefinitions) this).anInt1396 ^ 0xffffffff) < -1) {
					if ((i_73_ ^ 0xffffffff) < -1) {
						((ModelDefinitions) this).anIntArray1412 = new int[i_73_];
						((ModelDefinitions) this).anIntArray1389 = new int[i_73_];
						((ModelDefinitions) this).aByteArray1423 = new byte[i_73_];
						((ModelDefinitions) this).aByteArray1399 = new byte[i_73_];
						((ModelDefinitions) this).anIntArray1404 = new int[i_73_];
						((ModelDefinitions) this).anIntArray1390 = new int[i_73_];
					}
					if ((i_74_ ^ 0xffffffff) < -1) {
						((ModelDefinitions) this).anIntArray1397 = new int[i_74_];
						((ModelDefinitions) this).anIntArray1386 = new int[i_74_];
					}
					((ModelDefinitions) this).aShortArray1403 = new short[((ModelDefinitions) this).anInt1396];
					((ModelDefinitions) this).aShortArray1421 = new short[((ModelDefinitions) this).anInt1396];
					((ModelDefinitions) this).aShortArray1385 = new short[((ModelDefinitions) this).anInt1396];
				}
				((ModelDefinitions) this).anIntArray1416 = new int[((ModelDefinitions) this).anInt1407];
				if (i_65_ == 1)
					((ModelDefinitions) this).aShortArray1409 = new short[((ModelDefinitions) this).anInt1391];
				((ModelDefinitions) this).aShortArray1392 = new short[((ModelDefinitions) this).anInt1391];
				((ModelDefinitions) this).aShortArray1415 = new short[((ModelDefinitions) this).anInt1391];
				if ((i_62_ ^ 0xffffffff) == -256)
					((ModelDefinitions) this).aByteArray1402 = new byte[((ModelDefinitions) this).anInt1391];
				else
					((ModelDefinitions) this).aByte1422 = (byte) i_62_;
				((ModelDefinitions) this).anIntArray1400 = new int[((ModelDefinitions) this).anInt1407];
				((ModelDefinitions) this).anIntArray1418 = new int[((ModelDefinitions) this).anInt1407];
				if (i_65_ == 1 && (((ModelDefinitions) this).anInt1396 ^ 0xffffffff) < -1)
					((ModelDefinitions) this).aByteArray1420 = new byte[((ModelDefinitions) this).anInt1391];
				if ((i_66_ ^ 0xffffffff) == -2)
					((ModelDefinitions) this).anIntArray1417 = new int[((ModelDefinitions) this).anInt1407];
				((RSByteBuffer) class98_sub22_52_).position = i_89_;
				((RSByteBuffer) class98_sub22_53_).position = i_90_;
				((RSByteBuffer) class98_sub22_54_).position = i_91_;
				((RSByteBuffer) class98_sub22_55_).position = i_83_;
				int i_100_ = 0;
				int i_101_ = 0;
				int i_102_ = 0;
				for (int i_103_ = 0; ((((ModelDefinitions) this).anInt1407 ^ 0xffffffff) < (i_103_ ^ 0xffffffff)); i_103_++) {
					int i_104_ = class98_sub22.readUnsignedByte();
					int i_105_ = 0;
					if ((0x1 & i_104_ ^ 0xffffffff) != -1)
						i_105_ = class98_sub22_52_.method1239(i + -65);
					int i_106_ = 0;
					if ((i_104_ & 0x2 ^ 0xffffffff) != -1)
						i_106_ = class98_sub22_53_.method1239(-111);
					int i_107_ = 0;
					if ((0x4 & i_104_) != 0)
						i_107_ = class98_sub22_54_.method1239(56);
					((ModelDefinitions) this).anIntArray1416[i_103_] = i_100_ + i_105_;
					((ModelDefinitions) this).anIntArray1400[i_103_] = i_101_ + i_106_;
					((ModelDefinitions) this).anIntArray1418[i_103_] = i_102_ - -i_107_;
					i_101_ = ((ModelDefinitions) this).anIntArray1400[i_103_];
					i_102_ = ((ModelDefinitions) this).anIntArray1418[i_103_];
					i_100_ = ((ModelDefinitions) this).anIntArray1416[i_103_];
					if ((i_66_ ^ 0xffffffff) == -2)
						((ModelDefinitions) this).anIntArray1417[i_103_] = class98_sub22_55_.readUnsignedByte();
				}
				((RSByteBuffer) class98_sub22).position = i_88_;
				((RSByteBuffer) class98_sub22_52_).position = i_79_;
				((RSByteBuffer) class98_sub22_53_).position = i_81_;
				((RSByteBuffer) class98_sub22_54_).position = i_84_;
				((RSByteBuffer) class98_sub22_55_).position = i_82_;
				((RSByteBuffer) class98_sub22_56_).position = i_86_;
				((RSByteBuffer) class98_sub22_57_).position = i_87_;
				for (int i_108_ = 0; ((ModelDefinitions) this).anInt1391 > i_108_; i_108_++) {
					((ModelDefinitions) this).aShortArray1415[i_108_] = (short) class98_sub22.readShort();
					if (bool)
						((ModelDefinitions) this).aByteArray1414[i_108_] = class98_sub22_52_.readSignedByte();
					if (i_62_ == 255)
						((ModelDefinitions) this).aByteArray1402[i_108_] = class98_sub22_53_.readSignedByte();
					if ((i_63_ ^ 0xffffffff) == -2)
						((ModelDefinitions) this).aByteArray1411[i_108_] = class98_sub22_54_.readSignedByte();
					if (i_64_ == 1)
						((ModelDefinitions) this).anIntArray1395[i_108_] = class98_sub22_55_.readUnsignedByte();
					if (i_65_ == 1)
						((ModelDefinitions) this).aShortArray1409[i_108_] = (short) (class98_sub22_56_.readShort() + -1);
					if (((ModelDefinitions) this).aByteArray1420 != null) {
						if (((ModelDefinitions) this).aShortArray1409[i_108_] == -1)
							((ModelDefinitions) this).aByteArray1420[i_108_] = (byte) -1;
						else
							((ModelDefinitions) this).aByteArray1420[i_108_] = (byte) (class98_sub22_57_.readUnsignedByte() + -1);
					}
				}
				((ModelDefinitions) this).anInt1406 = -1;
				((RSByteBuffer) class98_sub22).position = i_85_;
				((RSByteBuffer) class98_sub22_52_).position = i_80_;
				short i_109_ = 0;
				short i_110_ = 0;
				short i_111_ = 0;
				int i_112_ = 0;
				for (int i_113_ = 0; i_113_ < ((ModelDefinitions) this).anInt1391; i_113_++) {
					int i_114_ = class98_sub22_52_.readUnsignedByte();
					if ((i_114_ ^ 0xffffffff) == -2) {
						i_109_ = (short) (i_112_ + class98_sub22.method1239(44));
						i_112_ = i_109_;
						i_110_ = (short) (class98_sub22.method1239(i ^ 0x44) + i_112_);
						i_112_ = i_110_;
						i_111_ = (short) (class98_sub22.method1239(i + -99) + i_112_);
						i_112_ = i_111_;
						((ModelDefinitions) this).aShortArray1393[i_113_] = i_109_;
						((ModelDefinitions) this).aShortArray1410[i_113_] = i_110_;
						((ModelDefinitions) this).aShortArray1392[i_113_] = i_111_;
						if (i_109_ > ((ModelDefinitions) this).anInt1406)
							((ModelDefinitions) this).anInt1406 = i_109_;
						if (((ModelDefinitions) this).anInt1406 < i_110_)
							((ModelDefinitions) this).anInt1406 = i_110_;
						if (i_111_ > ((ModelDefinitions) this).anInt1406)
							((ModelDefinitions) this).anInt1406 = i_111_;
					}
					if ((i_114_ ^ 0xffffffff) == -3) {
						i_110_ = i_111_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(-78));
						((ModelDefinitions) this).aShortArray1393[i_113_] = i_109_;
						i_112_ = i_111_;
						((ModelDefinitions) this).aShortArray1410[i_113_] = i_110_;
						((ModelDefinitions) this).aShortArray1392[i_113_] = i_111_;
						if ((i_111_ ^ 0xffffffff) < (((ModelDefinitions) this).anInt1406 ^ 0xffffffff))
							((ModelDefinitions) this).anInt1406 = i_111_;
					}
					if ((i_114_ ^ 0xffffffff) == -4) {
						i_109_ = i_111_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(74));
						i_112_ = i_111_;
						((ModelDefinitions) this).aShortArray1393[i_113_] = i_109_;
						((ModelDefinitions) this).aShortArray1410[i_113_] = i_110_;
						((ModelDefinitions) this).aShortArray1392[i_113_] = i_111_;
						if ((((ModelDefinitions) this).anInt1406 ^ 0xffffffff) > (i_111_ ^ 0xffffffff))
							((ModelDefinitions) this).anInt1406 = i_111_;
					}
					if ((i_114_ ^ 0xffffffff) == -5) {
						short i_115_ = i_109_;
						i_109_ = i_110_;
						i_110_ = i_115_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(i + -87));
						((ModelDefinitions) this).aShortArray1393[i_113_] = i_109_;
						i_112_ = i_111_;
						((ModelDefinitions) this).aShortArray1410[i_113_] = i_110_;
						((ModelDefinitions) this).aShortArray1392[i_113_] = i_111_;
						if ((((ModelDefinitions) this).anInt1406 ^ 0xffffffff) > (i_111_ ^ 0xffffffff))
							((ModelDefinitions) this).anInt1406 = i_111_;
					}
				}
				((ModelDefinitions) this).anInt1406++;
				((RSByteBuffer) class98_sub22).position = i_92_;
				((RSByteBuffer) class98_sub22_52_).position = i_93_;
				((RSByteBuffer) class98_sub22_53_).position = i_95_;
				((RSByteBuffer) class98_sub22_54_).position = i_96_;
				((RSByteBuffer) class98_sub22_55_).position = i_97_;
				((RSByteBuffer) class98_sub22_56_).position = i_98_;
				for (int i_116_ = 0; ((ModelDefinitions) this).anInt1396 > i_116_; i_116_++) {
					int i_117_ = ((ModelDefinitions) this).aByteArray1388[i_116_] & 0xff;
					if ((i_117_ ^ 0xffffffff) == -1) {
						((ModelDefinitions) this).aShortArray1403[i_116_] = (short) class98_sub22.readShort();
						((ModelDefinitions) this).aShortArray1421[i_116_] = (short) class98_sub22.readShort();
						((ModelDefinitions) this).aShortArray1385[i_116_] = (short) class98_sub22.readShort();
					}
					if (i_117_ == 1) {
						((ModelDefinitions) this).aShortArray1403[i_116_] = (short) class98_sub22_52_.readShort();
						((ModelDefinitions) this).aShortArray1421[i_116_] = (short) class98_sub22_52_.readShort();
						((ModelDefinitions) this).aShortArray1385[i_116_] = (short) class98_sub22_52_.readShort();
						if (((ModelDefinitions) this).anInt1387 < 15) {
							((ModelDefinitions) this).anIntArray1389[i_116_] = class98_sub22_53_.readShort();
							if (((ModelDefinitions) this).anInt1387 >= 14)
								((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-127);
							else
								((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readShort();
							((ModelDefinitions) this).anIntArray1390[i_116_] = class98_sub22_53_.readShort();
						} else {
							((ModelDefinitions) this).anIntArray1389[i_116_] = class98_sub22_53_.readMedium(i + -129);
							((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-127);
							((ModelDefinitions) this).anIntArray1390[i_116_] = (class98_sub22_53_.readMedium(Class369.method3953(i, -125)));
						}
						((ModelDefinitions) this).aByteArray1423[i_116_] = class98_sub22_54_.readSignedByte();
						((ModelDefinitions) this).aByteArray1399[i_116_] = class98_sub22_55_.readSignedByte();
						((ModelDefinitions) this).anIntArray1412[i_116_] = class98_sub22_56_.readSignedByte();
					}
					if (i_117_ == 2) {
						((ModelDefinitions) this).aShortArray1403[i_116_] = (short) class98_sub22_52_.readShort();
						((ModelDefinitions) this).aShortArray1421[i_116_] = (short) class98_sub22_52_.readShort();
						((ModelDefinitions) this).aShortArray1385[i_116_] = (short) class98_sub22_52_.readShort();
						if ((((ModelDefinitions) this).anInt1387 ^ 0xffffffff) <= -16) {
							((ModelDefinitions) this).anIntArray1389[i_116_] = (class98_sub22_53_.readMedium(Class369.method3953(i, -124)));
							((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-126);
							((ModelDefinitions) this).anIntArray1390[i_116_] = class98_sub22_53_.readMedium(-128);
						} else {
							((ModelDefinitions) this).anIntArray1389[i_116_] = class98_sub22_53_.readShort();
							if (((ModelDefinitions) this).anInt1387 < 14)
								((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readShort();
							else
								((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-127);
							((ModelDefinitions) this).anIntArray1390[i_116_] = class98_sub22_53_.readShort();
						}
						((ModelDefinitions) this).aByteArray1423[i_116_] = class98_sub22_54_.readSignedByte();
						((ModelDefinitions) this).aByteArray1399[i_116_] = class98_sub22_55_.readSignedByte();
						((ModelDefinitions) this).anIntArray1412[i_116_] = class98_sub22_56_.readSignedByte();
						((ModelDefinitions) this).anIntArray1397[i_116_] = class98_sub22_56_.readSignedByte();
						((ModelDefinitions) this).anIntArray1386[i_116_] = class98_sub22_56_.readSignedByte();
					}
					if (i_117_ == 3) {
						((ModelDefinitions) this).aShortArray1403[i_116_] = (short) class98_sub22_52_.readShort();
						((ModelDefinitions) this).aShortArray1421[i_116_] = (short) class98_sub22_52_.readShort();
						((ModelDefinitions) this).aShortArray1385[i_116_] = (short) class98_sub22_52_.readShort();
						if (((ModelDefinitions) this).anInt1387 < 15) {
							((ModelDefinitions) this).anIntArray1389[i_116_] = class98_sub22_53_.readShort();
							if ((((ModelDefinitions) this).anInt1387 ^ 0xffffffff) > -15)
								((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readShort();
							else
								((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-123);
							((ModelDefinitions) this).anIntArray1390[i_116_] = class98_sub22_53_.readShort();
						} else {
							((ModelDefinitions) this).anIntArray1389[i_116_] = class98_sub22_53_.readMedium(i + -126);
							((ModelDefinitions) this).anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-123);
							((ModelDefinitions) this).anIntArray1390[i_116_] = class98_sub22_53_.readMedium(-123);
						}
						((ModelDefinitions) this).aByteArray1423[i_116_] = class98_sub22_54_.readSignedByte();
						((ModelDefinitions) this).aByteArray1399[i_116_] = class98_sub22_55_.readSignedByte();
						((ModelDefinitions) this).anIntArray1412[i_116_] = class98_sub22_56_.readSignedByte();
					}
				}
				((RSByteBuffer) class98_sub22).position = i_99_;
				if (bool_59_) {
					int i_118_ = class98_sub22.readUnsignedByte();
					if ((i_118_ ^ 0xffffffff) < -1) {
						((ModelDefinitions) this).aClass87Array1413 = new Class87[i_118_];
						for (int i_119_ = 0; (i_118_ ^ 0xffffffff) < (i_119_ ^ 0xffffffff); i_119_++) {
							int i_120_ = class98_sub22.readShort();
							int i_121_ = class98_sub22.readShort();
							byte i_122_;
							if ((i_62_ ^ 0xffffffff) != -256)
								i_122_ = (byte) i_62_;
							else
								i_122_ = ((ModelDefinitions) this).aByteArray1402[i_121_];
							((ModelDefinitions) this).aClass87Array1413[i_119_] = new Class87(i_120_, (((ModelDefinitions) this).aShortArray1393[i_121_]), (((ModelDefinitions) this).aShortArray1410[i_121_]), (((ModelDefinitions) this).aShortArray1392[i_121_]), i_122_);
						}
					}
					int i_123_ = class98_sub22.readUnsignedByte();
					if (i_123_ > 0) {
						((ModelDefinitions) this).aClass35Array1398 = new Class35[i_123_];
						for (int i_124_ = 0; (i_123_ ^ 0xffffffff) < (i_124_ ^ 0xffffffff); i_124_++) {
							int i_125_ = class98_sub22.readShort();
							int i_126_ = class98_sub22.readShort();
							((ModelDefinitions) this).aClass35Array1398[i_124_] = new Class35(i_125_, i_126_);
						}
					}
				}
				if (!bool_60_)
					break;
				int i_127_ = class98_sub22.readUnsignedByte();
				if ((i_127_ ^ 0xffffffff) >= -1)
					break;
				((ModelDefinitions) this).aClass106Array1419 = new Class106[i_127_];
				for (int i_128_ = 0; (i_127_ ^ 0xffffffff) < (i_128_ ^ 0xffffffff); i_128_++) {
					int i_129_ = class98_sub22.readShort();
					int i_130_ = class98_sub22.readShort();
					int i_131_ = class98_sub22.readUnsignedByte();
					byte i_132_ = class98_sub22.readSignedByte();
					((ModelDefinitions) this).aClass106Array1419[i_128_] = new Class106(i_129_, i_130_, i_131_, i_132_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lv.E(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2590(short i, byte i_133_, short i_134_) {
		try {
			int i_135_ = -15 / ((5 - i_133_) / 54);
			if (((ModelDefinitions) this).aShortArray1409 != null) {
				for (int i_136_ = 0; i_136_ < ((ModelDefinitions) this).anInt1391; i_136_++) {
					if ((i_134_ ^ 0xffffffff) == (((ModelDefinitions) this).aShortArray1409[i_136_] ^ 0xffffffff))
						((ModelDefinitions) this).aShortArray1409[i_136_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.C(" + i + ',' + i_133_ + ',' + i_134_ + ')'));
		}
	}

	final int[][] method2591(byte i) {
		try {
			int[] is = new int[256];
			int i_137_ = 0;
			for (int i_138_ = 0; ((i_138_ ^ 0xffffffff) > (((ModelDefinitions) this).anInt1391 ^ 0xffffffff)); i_138_++) {
				int i_139_ = ((ModelDefinitions) this).anIntArray1395[i_138_];
				if ((i_139_ ^ 0xffffffff) <= -1) {
					if ((i_139_ ^ 0xffffffff) < (i_137_ ^ 0xffffffff))
						i_137_ = i_139_;
					is[i_139_]++;
				}
			}
			int[][] is_140_ = new int[1 + i_137_][];
			if (i <= 96)
				return null;
			for (int i_141_ = 0; i_137_ >= i_141_; i_141_++) {
				is_140_[i_141_] = new int[is[i_141_]];
				is[i_141_] = 0;
			}
			for (int i_142_ = 0; ((i_142_ ^ 0xffffffff) > (((ModelDefinitions) this).anInt1391 ^ 0xffffffff)); i_142_++) {
				int i_143_ = ((ModelDefinitions) this).anIntArray1395[i_142_];
				if ((i_143_ ^ 0xffffffff) <= -1)
					is_140_[i_143_][is[i_143_]++] = i_142_;
			}
			return is_140_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lv.J(" + i + ')');
		}
	}

	final void method2592(int i, int i_144_) {
		do {
			try {
				if (i != 13746)
					method2596(-114);
				for (int i_145_ = 0; ((ModelDefinitions) this).anInt1407 > i_145_; i_145_++) {
					((ModelDefinitions) this).anIntArray1416[i_145_] <<= i_144_;
					((ModelDefinitions) this).anIntArray1400[i_145_] <<= i_144_;
					((ModelDefinitions) this).anIntArray1418[i_145_] <<= i_144_;
				}
				if ((((ModelDefinitions) this).anInt1396 ^ 0xffffffff) >= -1 || ((ModelDefinitions) this).anIntArray1389 == null)
					break;
				for (int i_146_ = 0; ((((ModelDefinitions) this).anIntArray1389.length ^ 0xffffffff) < (i_146_ ^ 0xffffffff)); i_146_++) {
					((ModelDefinitions) this).anIntArray1389[i_146_] <<= i_144_;
					((ModelDefinitions) this).anIntArray1404[i_146_] <<= i_144_;
					if (((ModelDefinitions) this).aByteArray1388[i_146_] != 1)
						((ModelDefinitions) this).anIntArray1390[i_146_] <<= i_144_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lv.L(" + i + ',' + i_144_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2593(int i, short i_147_, short i_148_) {
		try {
			for (int i_149_ = i; ((ModelDefinitions) this).anInt1391 > i_149_; i_149_++) {
				if ((i_147_ ^ 0xffffffff) == (((ModelDefinitions) this).aShortArray1415[i_149_] ^ 0xffffffff))
					((ModelDefinitions) this).aShortArray1415[i_149_] = i_148_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.A(" + i + ',' + i_147_ + ',' + i_148_ + ')'));
		}
	}

	final int method2594(byte i, short i_150_, short i_151_, byte i_152_, boolean bool, int i_153_, int i_154_, byte i_155_, int i_156_) {
		try {
			((ModelDefinitions) this).aShortArray1393[((ModelDefinitions) this).anInt1391] = (short) i_154_;
			((ModelDefinitions) this).aShortArray1410[((ModelDefinitions) this).anInt1391] = (short) i_156_;
			((ModelDefinitions) this).aShortArray1392[((ModelDefinitions) this).anInt1391] = (short) i_153_;
			((ModelDefinitions) this).aByteArray1414[((ModelDefinitions) this).anInt1391] = i;
			((ModelDefinitions) this).aByteArray1420[((ModelDefinitions) this).anInt1391] = i_155_;
			((ModelDefinitions) this).aShortArray1415[((ModelDefinitions) this).anInt1391] = i_150_;
			((ModelDefinitions) this).aByteArray1411[((ModelDefinitions) this).anInt1391] = i_152_;
			if (bool != false)
				((ModelDefinitions) this).anIntArray1390 = null;
			((ModelDefinitions) this).aShortArray1409[((ModelDefinitions) this).anInt1391] = i_151_;
			return ((ModelDefinitions) this).anInt1391++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.F(" + i + ',' + i_150_ + ',' + i_151_ + ',' + i_152_ + ',' + bool + ',' + i_153_ + ',' + i_154_ + ',' + i_155_ + ',' + i_156_ + ')'));
		}
	}

	final int[][] method2595(int i, boolean bool) {
		try {
			if (i < 17)
				method2594((byte) -59, (short) -115, (short) -111, (byte) -111, true, -58, 126, (byte) -114, -57);
			int[] is = new int[256];
			int i_157_ = 0;
			int i_158_ = (!bool ? ((ModelDefinitions) this).anInt1406 : ((ModelDefinitions) this).anInt1407);
			for (int i_159_ = 0; (i_158_ ^ 0xffffffff) < (i_159_ ^ 0xffffffff); i_159_++) {
				int i_160_ = ((ModelDefinitions) this).anIntArray1417[i_159_];
				if (i_160_ >= 0) {
					if ((i_157_ ^ 0xffffffff) > (i_160_ ^ 0xffffffff))
						i_157_ = i_160_;
					is[i_160_]++;
				}
			}
			int[][] is_161_ = new int[i_157_ + 1][];
			for (int i_162_ = 0; i_157_ >= i_162_; i_162_++) {
				is_161_[i_162_] = new int[is[i_162_]];
				is[i_162_] = 0;
			}
			for (int i_163_ = 0; i_158_ > i_163_; i_163_++) {
				int i_164_ = ((ModelDefinitions) this).anIntArray1417[i_163_];
				if ((i_164_ ^ 0xffffffff) <= -1)
					is_161_[i_164_][is[i_164_]++] = i_163_;
			}
			return is_161_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lv.B(" + i + ',' + bool + ')');
		}
	}

	final int[][] method2596(int i) {
		try {
			int[] is = new int[256];
			int i_165_ = 0;
			for (int i_166_ = 0; ((((ModelDefinitions) this).aClass106Array1419.length ^ 0xffffffff) < (i_166_ ^ 0xffffffff)); i_166_++) {
				int i_167_ = (((Class106) ((ModelDefinitions) this).aClass106Array1419[i_166_]).anInt908);
				if ((i_167_ ^ 0xffffffff) <= -1) {
					if (i_165_ < i_167_)
						i_165_ = i_167_;
					is[i_167_]++;
				}
			}
			int[][] is_168_ = new int[i_165_ + 1][];
			for (int i_169_ = 0; (i_169_ ^ 0xffffffff) >= (i_165_ ^ 0xffffffff); i_169_++) {
				is_168_[i_169_] = new int[is[i_169_]];
				is[i_169_] = 0;
			}
			int i_170_ = 0;
			if (i != 21517)
				((ModelDefinitions) this).anIntArray1418 = null;
			for (/**/; ((i_170_ ^ 0xffffffff) > (((ModelDefinitions) this).aClass106Array1419.length ^ 0xffffffff)); i_170_++) {
				int i_171_ = (((Class106) ((ModelDefinitions) this).aClass106Array1419[i_170_]).anInt908);
				if (i_171_ >= 0)
					is_168_[i_171_][is[i_171_]++] = i_170_;
			}
			return is_168_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lv.G(" + i + ')');
		}
	}

	final void method2597(int i, int i_172_, byte i_173_, int i_174_) {
		do {
			try {
				for (int i_175_ = 0; i_175_ < ((ModelDefinitions) this).anInt1407; i_175_++) {
					((ModelDefinitions) this).anIntArray1416[i_175_] += i_172_;
					((ModelDefinitions) this).anIntArray1400[i_175_] += i_174_;
					((ModelDefinitions) this).anIntArray1418[i_175_] += i;
				}
				if (i_173_ >= 54)
					break;
				method2595(105, true);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lv.O(" + i + ',' + i_172_ + ',' + i_173_ + ',' + i_174_ + ')'));
			}
			break;
		} while (false);
	}

	private final int method2598(ModelDefinitions class178_176_, int i, short i_177_, int i_178_) {
		try {
			int i_179_ = ((ModelDefinitions) class178_176_).anIntArray1416[i];
			int i_180_ = ((ModelDefinitions) class178_176_).anIntArray1400[i];
			int i_181_ = ((ModelDefinitions) class178_176_).anIntArray1418[i];
			for (int i_182_ = i_178_; ((((ModelDefinitions) this).anInt1407 ^ 0xffffffff) < (i_182_ ^ 0xffffffff)); i_182_++) {
				if (((ModelDefinitions) this).anIntArray1416[i_182_] == i_179_ && ((ModelDefinitions) this).anIntArray1400[i_182_] == i_180_ && ((ModelDefinitions) this).anIntArray1418[i_182_] == i_181_) {
					((ModelDefinitions) this).aShortArray1408[i_182_] = (short) Class41.method366((((ModelDefinitions) this).aShortArray1408[i_182_]), i_177_);
					return i_182_;
				}
			}
			((ModelDefinitions) this).anIntArray1416[((ModelDefinitions) this).anInt1407] = i_179_;
			((ModelDefinitions) this).anIntArray1400[((ModelDefinitions) this).anInt1407] = i_180_;
			((ModelDefinitions) this).anIntArray1418[((ModelDefinitions) this).anInt1407] = i_181_;
			((ModelDefinitions) this).aShortArray1408[((ModelDefinitions) this).anInt1407] = i_177_;
			((ModelDefinitions) this).anIntArray1417[((ModelDefinitions) this).anInt1407] = (((ModelDefinitions) class178_176_).anIntArray1417 != null ? ((ModelDefinitions) class178_176_).anIntArray1417[i] : -1);
			return ((ModelDefinitions) this).anInt1407++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.M(" + (class178_176_ != null ? "{...}" : "null") + ',' + i + ',' + i_177_ + ',' + i_178_ + ')'));
		}
	}

	final int method2599(int i, int i_183_, int i_184_, int i_185_) {
		try {
			for (int i_186_ = 0; ((ModelDefinitions) this).anInt1407 > i_186_; i_186_++) {
				if (((i_183_ ^ 0xffffffff) == (((ModelDefinitions) this).anIntArray1416[i_186_] ^ 0xffffffff)) && ((((ModelDefinitions) this).anIntArray1400[i_186_] ^ 0xffffffff) == (i_184_ ^ 0xffffffff)) && i_185_ == ((ModelDefinitions) this).anIntArray1418[i_186_])
					return i_186_;
			}
			((ModelDefinitions) this).anIntArray1416[((ModelDefinitions) this).anInt1407] = i_183_;
			((ModelDefinitions) this).anIntArray1400[((ModelDefinitions) this).anInt1407] = i_184_;
			((ModelDefinitions) this).anIntArray1418[((ModelDefinitions) this).anInt1407] = i_185_;
			((ModelDefinitions) this).anInt1406 = ((ModelDefinitions) this).anInt1407 + 1;
			if (i != 14418)
				method2598(null, -77, (short) 58, 51);
			return ((ModelDefinitions) this).anInt1407++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.N(" + i + ',' + i_183_ + ',' + i_184_ + ',' + i_185_ + ')'));
		}
	}

	final void method2600(int i, int i_187_, byte i_188_, int i_189_) {
		do {
			try {
				if ((i ^ 0xffffffff) != -1) {
					int i_190_ = Class284_Sub2_Sub2.anIntArray6200[i];
					int i_191_ = Class284_Sub2_Sub2.anIntArray6202[i];
					for (int i_192_ = 0; i_192_ < ((ModelDefinitions) this).anInt1407; i_192_++) {
						int i_193_ = (((i_191_ * ((ModelDefinitions) this).anIntArray1416[i_192_]) + (((ModelDefinitions) this).anIntArray1400[i_192_] * i_190_)) >> -455896722);
						((ModelDefinitions) this).anIntArray1400[i_192_] = (-(((ModelDefinitions) this).anIntArray1416[i_192_] * i_190_) + (((ModelDefinitions) this).anIntArray1400[i_192_] * i_191_)) >> 1929293742;
						((ModelDefinitions) this).anIntArray1416[i_192_] = i_193_;
					}
				}
				int i_194_ = -79 / ((i_188_ - 49) / 63);
				if ((i_187_ ^ 0xffffffff) != -1) {
					int i_195_ = Class284_Sub2_Sub2.anIntArray6200[i_187_];
					int i_196_ = Class284_Sub2_Sub2.anIntArray6202[i_187_];
					for (int i_197_ = 0; ((ModelDefinitions) this).anInt1407 > i_197_; i_197_++) {
						int i_198_ = (((((ModelDefinitions) this).anIntArray1400[i_197_] * i_196_) + -(i_195_ * (((ModelDefinitions) this).anIntArray1418[i_197_]))) >> 324877006);
						((ModelDefinitions) this).anIntArray1418[i_197_] = ((((ModelDefinitions) this).anIntArray1400[i_197_] * i_195_) + (((ModelDefinitions) this).anIntArray1418[i_197_] * i_196_)) >> -2137564178;
						((ModelDefinitions) this).anIntArray1400[i_197_] = i_198_;
					}
				}
				if (i_189_ == 0)
					break;
				int i_199_ = Class284_Sub2_Sub2.anIntArray6200[i_189_];
				int i_200_ = Class284_Sub2_Sub2.anIntArray6202[i_189_];
				for (int i_201_ = 0; ((i_201_ ^ 0xffffffff) > (((ModelDefinitions) this).anInt1407 ^ 0xffffffff)); i_201_++) {
					int i_202_ = ((i_199_ * ((ModelDefinitions) this).anIntArray1418[i_201_] + (i_200_ * ((ModelDefinitions) this).anIntArray1416[i_201_])) >> 616678414);
					((ModelDefinitions) this).anIntArray1418[i_201_] = (((ModelDefinitions) this).anIntArray1418[i_201_] * i_200_ - i_199_ * (((ModelDefinitions) this).anIntArray1416[i_201_])) >> -1745229234;
					((ModelDefinitions) this).anIntArray1416[i_201_] = i_202_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lv.I(" + i + ',' + i_187_ + ',' + i_188_ + ',' + i_189_ + ')'));
			}
			break;
		} while (false);
	}

	final byte method2601(byte i, byte i_203_, short i_204_, short i_205_, short i_206_, short i_207_, short i_208_, byte i_209_, short i_210_, byte i_211_) {
		try {
			if (((ModelDefinitions) this).anInt1396 >= 255)
				throw new IllegalStateException();
			((ModelDefinitions) this).aByteArray1388[((ModelDefinitions) this).anInt1396] = (byte) 3;
			((ModelDefinitions) this).aShortArray1403[((ModelDefinitions) this).anInt1396] = i_205_;
			((ModelDefinitions) this).aShortArray1421[((ModelDefinitions) this).anInt1396] = i_210_;
			((ModelDefinitions) this).aShortArray1385[((ModelDefinitions) this).anInt1396] = i_204_;
			((ModelDefinitions) this).anIntArray1389[((ModelDefinitions) this).anInt1396] = i_208_;
			((ModelDefinitions) this).anIntArray1404[((ModelDefinitions) this).anInt1396] = i_207_;
			((ModelDefinitions) this).anIntArray1390[((ModelDefinitions) this).anInt1396] = i_206_;
			((ModelDefinitions) this).aByteArray1423[((ModelDefinitions) this).anInt1396] = i_211_;
			((ModelDefinitions) this).aByteArray1399[((ModelDefinitions) this).anInt1396] = i;
			((ModelDefinitions) this).anIntArray1412[((ModelDefinitions) this).anInt1396] = i_203_;
			if (i_209_ <= 116)
				return (byte) -112;
			return (byte) ((ModelDefinitions) this).anInt1396++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.K(" + i + ',' + i_203_ + ',' + i_204_ + ',' + i_205_ + ',' + i_206_ + ',' + i_207_ + ',' + i_208_ + ',' + i_209_ + ',' + i_210_ + ',' + i_211_ + ')'));
		}
	}

	public ModelDefinitions() {
		((ModelDefinitions) this).anInt1391 = 0;
		((ModelDefinitions) this).aByte1422 = (byte) 0;
		((ModelDefinitions) this).anInt1406 = 0;
		((ModelDefinitions) this).anInt1396 = 0;
	}

	ModelDefinitions(byte[] is) {
		((ModelDefinitions) this).anInt1391 = 0;
		((ModelDefinitions) this).aByte1422 = (byte) 0;
		((ModelDefinitions) this).anInt1406 = 0;
		((ModelDefinitions) this).anInt1396 = 0;
		try {
			if (is[-1 + is.length] == -1 && is[is.length + -2] == -1)
				method2589(is, 1);
			else
				method2587(is, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lv.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	ModelDefinitions(int i, int i_212_, int i_213_) {
		((ModelDefinitions) this).anInt1391 = 0;
		((ModelDefinitions) this).aByte1422 = (byte) 0;
		((ModelDefinitions) this).anInt1406 = 0;
		((ModelDefinitions) this).anInt1396 = 0;
		try {
			((ModelDefinitions) this).aByteArray1420 = new byte[i_212_];
			((ModelDefinitions) this).anIntArray1416 = new int[i];
			((ModelDefinitions) this).aByteArray1402 = new byte[i_212_];
			((ModelDefinitions) this).anIntArray1418 = new int[i];
			((ModelDefinitions) this).anIntArray1400 = new int[i];
			((ModelDefinitions) this).aByteArray1414 = new byte[i_212_];
			((ModelDefinitions) this).anIntArray1395 = new int[i_212_];
			((ModelDefinitions) this).aShortArray1415 = new short[i_212_];
			((ModelDefinitions) this).aShortArray1410 = new short[i_212_];
			((ModelDefinitions) this).aShortArray1393 = new short[i_212_];
			((ModelDefinitions) this).anIntArray1417 = new int[i];
			((ModelDefinitions) this).aByteArray1411 = new byte[i_212_];
			if (i_213_ > 0) {
				((ModelDefinitions) this).aByteArray1399 = new byte[i_213_];
				((ModelDefinitions) this).aByteArray1423 = new byte[i_213_];
				((ModelDefinitions) this).anIntArray1412 = new int[i_213_];
				((ModelDefinitions) this).aShortArray1385 = new short[i_213_];
				((ModelDefinitions) this).anIntArray1386 = new int[i_213_];
				((ModelDefinitions) this).anIntArray1390 = new int[i_213_];
				((ModelDefinitions) this).anIntArray1397 = new int[i_213_];
				((ModelDefinitions) this).aByteArray1388 = new byte[i_213_];
				((ModelDefinitions) this).anIntArray1404 = new int[i_213_];
				((ModelDefinitions) this).aShortArray1421 = new short[i_213_];
				((ModelDefinitions) this).anIntArray1389 = new int[i_213_];
				((ModelDefinitions) this).aShortArray1403 = new short[i_213_];
			}
			((ModelDefinitions) this).aShortArray1409 = new short[i_212_];
			((ModelDefinitions) this).aShortArray1392 = new short[i_212_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.<init>(" + i + ',' + i_212_ + ',' + i_213_ + ')'));
		}
	}

	ModelDefinitions(ModelDefinitions[] class178s, int i) {
		((ModelDefinitions) this).anInt1391 = 0;
		((ModelDefinitions) this).aByte1422 = (byte) 0;
		((ModelDefinitions) this).anInt1406 = 0;
		((ModelDefinitions) this).anInt1396 = 0;
		try {
			((ModelDefinitions) this).anInt1407 = 0;
			((ModelDefinitions) this).anInt1391 = 0;
			((ModelDefinitions) this).anInt1396 = 0;
			int i_214_ = 0;
			int i_215_ = 0;
			int i_216_ = 0;
			boolean bool = false;
			boolean bool_217_ = false;
			boolean bool_218_ = false;
			boolean bool_219_ = false;
			boolean bool_220_ = false;
			((ModelDefinitions) this).aByte1422 = (byte) -1;
			boolean bool_221_ = false;
			for (int i_222_ = 0; i_222_ < i; i_222_++) {
				ModelDefinitions class178_223_ = class178s[i_222_];
				if (class178_223_ != null) {
					((ModelDefinitions) this).anInt1391 += ((ModelDefinitions) class178_223_).anInt1391;
					((ModelDefinitions) this).anInt1407 += ((ModelDefinitions) class178_223_).anInt1407;
					((ModelDefinitions) this).anInt1396 += ((ModelDefinitions) class178_223_).anInt1396;
					if (((ModelDefinitions) class178_223_).aClass87Array1413 != null)
						i_214_ += (((ModelDefinitions) class178_223_).aClass87Array1413).length;
					if (((ModelDefinitions) class178_223_).aClass106Array1419 != null)
						i_216_ += (((ModelDefinitions) class178_223_).aClass106Array1419).length;
					bool = bool | (((ModelDefinitions) class178_223_).aByteArray1414 != null);
					if (((ModelDefinitions) class178_223_).aClass35Array1398 != null)
						i_215_ += (((ModelDefinitions) class178_223_).aClass35Array1398).length;
					bool_220_ = bool_220_ | (((ModelDefinitions) class178_223_).aShortArray1409) != null;
					bool_219_ = bool_219_ | (((ModelDefinitions) class178_223_).aByteArray1420) != null;
					bool_218_ = bool_218_ | (((ModelDefinitions) class178_223_).aByteArray1411) != null;
					if (((ModelDefinitions) class178_223_).aByteArray1402 != null)
						bool_217_ = true;
					else {
						if ((((ModelDefinitions) this).aByte1422 ^ 0xffffffff) == 0)
							((ModelDefinitions) this).aByte1422 = ((ModelDefinitions) class178_223_).aByte1422;
						if ((((ModelDefinitions) this).aByte1422 ^ 0xffffffff) != (((ModelDefinitions) class178_223_).aByte1422 ^ 0xffffffff))
							bool_217_ = true;
					}
					bool_221_ = bool_221_ | (((ModelDefinitions) class178_223_).anIntArray1395) != null;
				}
			}
			((ModelDefinitions) this).aShortArray1410 = new short[((ModelDefinitions) this).anInt1391];
			((ModelDefinitions) this).aShortArray1392 = new short[((ModelDefinitions) this).anInt1391];
			((ModelDefinitions) this).anIntArray1418 = new int[((ModelDefinitions) this).anInt1407];
			if (bool_221_)
				((ModelDefinitions) this).anIntArray1395 = new int[((ModelDefinitions) this).anInt1391];
			((ModelDefinitions) this).anIntArray1400 = new int[((ModelDefinitions) this).anInt1407];
			if ((i_215_ ^ 0xffffffff) < -1)
				((ModelDefinitions) this).aClass35Array1398 = new Class35[i_215_];
			if (bool_218_)
				((ModelDefinitions) this).aByteArray1411 = new byte[((ModelDefinitions) this).anInt1391];
			((ModelDefinitions) this).anIntArray1417 = new int[((ModelDefinitions) this).anInt1407];
			((ModelDefinitions) this).aShortArray1394 = new short[((ModelDefinitions) this).anInt1391];
			if (bool_220_)
				((ModelDefinitions) this).aShortArray1409 = new short[((ModelDefinitions) this).anInt1391];
			if (bool_217_)
				((ModelDefinitions) this).aByteArray1402 = new byte[((ModelDefinitions) this).anInt1391];
			if ((((ModelDefinitions) this).anInt1396 ^ 0xffffffff) < -1) {
				((ModelDefinitions) this).aShortArray1403 = new short[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).aByteArray1388 = new byte[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).aByteArray1399 = new byte[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).anIntArray1390 = new int[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).aByteArray1423 = new byte[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).aShortArray1385 = new short[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).anIntArray1386 = new int[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).anIntArray1397 = new int[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).aShortArray1421 = new short[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).anIntArray1412 = new int[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).anIntArray1389 = new int[((ModelDefinitions) this).anInt1396];
				((ModelDefinitions) this).anIntArray1404 = new int[((ModelDefinitions) this).anInt1396];
			}
			if (i_214_ > 0)
				((ModelDefinitions) this).aClass87Array1413 = new Class87[i_214_];
			if (bool_219_)
				((ModelDefinitions) this).aByteArray1420 = new byte[((ModelDefinitions) this).anInt1391];
			((ModelDefinitions) this).aShortArray1408 = new short[((ModelDefinitions) this).anInt1407];
			((ModelDefinitions) this).anIntArray1416 = new int[((ModelDefinitions) this).anInt1407];
			((ModelDefinitions) this).aShortArray1415 = new short[((ModelDefinitions) this).anInt1391];
			if (bool)
				((ModelDefinitions) this).aByteArray1414 = new byte[((ModelDefinitions) this).anInt1391];
			((ModelDefinitions) this).aShortArray1393 = new short[((ModelDefinitions) this).anInt1391];
			if (i_216_ > 0)
				((ModelDefinitions) this).aClass106Array1419 = new Class106[i_216_];
			((ModelDefinitions) this).anInt1407 = 0;
			((ModelDefinitions) this).anInt1396 = 0;
			i_214_ = 0;
			i_216_ = 0;
			((ModelDefinitions) this).anInt1391 = 0;
			i_215_ = 0;
			for (int i_224_ = 0; i > i_224_; i_224_++) {
				short i_225_ = (short) (1 << i_224_);
				ModelDefinitions class178_226_ = class178s[i_224_];
				if (class178_226_ != null) {
					if (((ModelDefinitions) class178_226_).aClass106Array1419 != null) {
						for (int i_227_ = 0; (((((ModelDefinitions) class178_226_).aClass106Array1419).length ^ 0xffffffff) < (i_227_ ^ 0xffffffff)); i_227_++) {
							Class106 class106 = (((ModelDefinitions) class178_226_).aClass106Array1419[i_227_]);
							((ModelDefinitions) this).aClass106Array1419[i_216_++] = class106.method1719(((((ModelDefinitions) this).anInt1391) + (((Class106) class106).anInt906)), -125);
						}
					}
					for (int i_228_ = 0; ((i_228_ ^ 0xffffffff) > (((ModelDefinitions) class178_226_).anInt1391 ^ 0xffffffff)); i_228_++) {
						if (bool && (((ModelDefinitions) class178_226_).aByteArray1414 != null))
							((ModelDefinitions) this).aByteArray1414[(((ModelDefinitions) this).anInt1391)] = (((ModelDefinitions) class178_226_).aByteArray1414[i_228_]);
						if (bool_217_) {
							if (((ModelDefinitions) class178_226_).aByteArray1402 != null)
								((ModelDefinitions) this).aByteArray1402[((ModelDefinitions) this).anInt1391] = (((ModelDefinitions) class178_226_).aByteArray1402[i_228_]);
							else
								((ModelDefinitions) this).aByteArray1402[((ModelDefinitions) this).anInt1391] = ((ModelDefinitions) class178_226_).aByte1422;
						}
						if (bool_218_ && (((ModelDefinitions) class178_226_).aByteArray1411 != null))
							((ModelDefinitions) this).aByteArray1411[(((ModelDefinitions) this).anInt1391)] = (((ModelDefinitions) class178_226_).aByteArray1411[i_228_]);
						if (bool_220_) {
							if (((ModelDefinitions) class178_226_).aShortArray1409 == null)
								((ModelDefinitions) this).aShortArray1409[((ModelDefinitions) this).anInt1391] = (short) -1;
							else
								((ModelDefinitions) this).aShortArray1409[((ModelDefinitions) this).anInt1391] = (((ModelDefinitions) class178_226_).aShortArray1409[i_228_]);
						}
						if (bool_221_) {
							if (((ModelDefinitions) class178_226_).anIntArray1395 != null)
								((ModelDefinitions) this).anIntArray1395[((ModelDefinitions) this).anInt1391] = (((ModelDefinitions) class178_226_).anIntArray1395[i_228_]);
							else
								((ModelDefinitions) this).anIntArray1395[((ModelDefinitions) this).anInt1391] = -1;
						}
						((ModelDefinitions) this).aShortArray1393[(((ModelDefinitions) this).anInt1391)] = (short) method2598(class178_226_, (((ModelDefinitions) class178_226_).aShortArray1393[i_228_]), i_225_, 0);
						((ModelDefinitions) this).aShortArray1410[(((ModelDefinitions) this).anInt1391)] = (short) method2598(class178_226_, (((ModelDefinitions) class178_226_).aShortArray1410[i_228_]), i_225_, 0);
						((ModelDefinitions) this).aShortArray1392[(((ModelDefinitions) this).anInt1391)] = (short) method2598(class178_226_, (((ModelDefinitions) class178_226_).aShortArray1392[i_228_]), i_225_, 0);
						((ModelDefinitions) this).aShortArray1394[(((ModelDefinitions) this).anInt1391)] = i_225_;
						((ModelDefinitions) this).aShortArray1415[(((ModelDefinitions) this).anInt1391)] = (((ModelDefinitions) class178_226_).aShortArray1415[i_228_]);
						((ModelDefinitions) this).anInt1391++;
					}
					if (((ModelDefinitions) class178_226_).aClass87Array1413 != null) {
						for (int i_229_ = 0; ((((ModelDefinitions) class178_226_).aClass87Array1413).length > i_229_); i_229_++) {
							int i_230_ = method2598(class178_226_, (((Class87) (((ModelDefinitions) class178_226_).aClass87Array1413[i_229_])).anInt666), i_225_, 0);
							int i_231_ = method2598(class178_226_, (((Class87) (((ModelDefinitions) class178_226_).aClass87Array1413[i_229_])).anInt661), i_225_, 0);
							int i_232_ = method2598(class178_226_, (((Class87) (((ModelDefinitions) class178_226_).aClass87Array1413[i_229_])).anInt674), i_225_, 0);
							((ModelDefinitions) this).aClass87Array1413[i_214_] = ((ModelDefinitions) class178_226_).aClass87Array1413[i_229_].method857(i_230_, true, i_232_, i_231_);
							i_214_++;
						}
					}
					if (((ModelDefinitions) class178_226_).aClass35Array1398 != null) {
						for (int i_233_ = 0; ((i_233_ ^ 0xffffffff) > ((((ModelDefinitions) class178_226_).aClass35Array1398).length ^ 0xffffffff)); i_233_++) {
							int i_234_ = method2598(class178_226_, (((Class35) (((ModelDefinitions) class178_226_).aClass35Array1398[i_233_])).anInt327), i_225_, 0);
							((ModelDefinitions) this).aClass35Array1398[i_215_] = ((ModelDefinitions) class178_226_).aClass35Array1398[i_233_].method336(-1854, i_234_);
							i_215_++;
						}
					}
				}
			}
			int i_235_ = 0;
			((ModelDefinitions) this).anInt1406 = ((ModelDefinitions) this).anInt1407;
			for (int i_236_ = 0; i > i_236_; i_236_++) {
				short i_237_ = (short) (1 << i_236_);
				ModelDefinitions class178_238_ = class178s[i_236_];
				if (class178_238_ != null) {
					for (int i_239_ = 0; ((ModelDefinitions) class178_238_).anInt1391 > i_239_; i_239_++) {
						if (bool_219_)
							((ModelDefinitions) this).aByteArray1420[i_235_++] = (byte) (((((ModelDefinitions) class178_238_).aByteArray1420) != null && (((ModelDefinitions) class178_238_).aByteArray1420[i_239_]) != -1) ? ((((ModelDefinitions) class178_238_).aByteArray1420[i_239_]) + ((ModelDefinitions) this).anInt1396) : -1);
					}
					for (int i_240_ = 0; i_240_ < ((ModelDefinitions) class178_238_).anInt1396; i_240_++) {
						byte i_241_ = (((ModelDefinitions) this).aByteArray1388[((ModelDefinitions) this).anInt1396] = (((ModelDefinitions) class178_238_).aByteArray1388[i_240_]));
						if ((i_241_ ^ 0xffffffff) == -1) {
							((ModelDefinitions) this).aShortArray1403[((ModelDefinitions) this).anInt1396] = (short) method2598(class178_238_, (((ModelDefinitions) class178_238_).aShortArray1403[i_240_]), i_237_, 0);
							((ModelDefinitions) this).aShortArray1421[((ModelDefinitions) this).anInt1396] = (short) method2598(class178_238_, (((ModelDefinitions) class178_238_).aShortArray1421[i_240_]), i_237_, 0);
							((ModelDefinitions) this).aShortArray1385[((ModelDefinitions) this).anInt1396] = (short) method2598(class178_238_, (((ModelDefinitions) class178_238_).aShortArray1385[i_240_]), i_237_, 0);
						}
						if ((i_241_ ^ 0xffffffff) <= -2 && (i_241_ ^ 0xffffffff) >= -4) {
							((ModelDefinitions) this).aShortArray1403[((ModelDefinitions) this).anInt1396] = (((ModelDefinitions) class178_238_).aShortArray1403[i_240_]);
							((ModelDefinitions) this).aShortArray1421[((ModelDefinitions) this).anInt1396] = (((ModelDefinitions) class178_238_).aShortArray1421[i_240_]);
							((ModelDefinitions) this).aShortArray1385[((ModelDefinitions) this).anInt1396] = (((ModelDefinitions) class178_238_).aShortArray1385[i_240_]);
							((ModelDefinitions) this).anIntArray1389[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).anIntArray1389[i_240_]);
							((ModelDefinitions) this).anIntArray1404[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).anIntArray1404[i_240_]);
							((ModelDefinitions) this).anIntArray1390[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).anIntArray1390[i_240_]);
							((ModelDefinitions) this).aByteArray1423[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).aByteArray1423[i_240_]);
							((ModelDefinitions) this).aByteArray1399[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).aByteArray1399[i_240_]);
							((ModelDefinitions) this).anIntArray1412[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).anIntArray1412[i_240_]);
						}
						if ((i_241_ ^ 0xffffffff) == -3) {
							((ModelDefinitions) this).anIntArray1397[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).anIntArray1397[i_240_]);
							((ModelDefinitions) this).anIntArray1386[(((ModelDefinitions) this).anInt1396)] = (((ModelDefinitions) class178_238_).anIntArray1386[i_240_]);
						}
						((ModelDefinitions) this).anInt1396++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.<init>(" + (class178s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
