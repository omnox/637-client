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
				class98_sub22.position = -18 + is.length;
				this.anInt1407 = class98_sub22.readShort();
				this.anInt1391 = class98_sub22.readShort();
				this.anInt1396 = class98_sub22.readUnsignedByte();
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
				i_14_ += this.anInt1407;
				int i_16_ = i_14_;
				i_14_ += this.anInt1391;
				int i_17_ = i_14_;
				if (i_6_ == 255)
					i_14_ += this.anInt1391;
				int i_18_ = i_14_;
				if (i_8_ == 1)
					i_14_ += this.anInt1391;
				int i_19_ = i_14_;
				if (i_5_ == 1)
					i_14_ += this.anInt1391;
				int i_20_ = i_14_;
				if (i_9_ == 1)
					i_14_ += this.anInt1407;
				int i_21_ = i_14_;
				if (i_7_ == 1)
					i_14_ += this.anInt1391;
				int i_22_ = i_14_;
				i_14_ += i_13_;
				int i_23_ = i_14_;
				i_14_ += 2 * this.anInt1391;
				int i_24_ = i_14_;
				i_14_ += this.anInt1396 * 6;
				int i_25_ = i_14_;
				i_14_ += i_10_;
				int i_26_ = i_14_;
				i_14_ += i_11_;
				int i_27_ = i_14_;
				this.anIntArray1416 = new int[this.anInt1407];
				if (i_7_ == 1)
					this.aByteArray1411 = new byte[this.anInt1391];
				if (this.anInt1396 > 0) {
					this.aShortArray1421 = new short[this.anInt1396];
					this.aShortArray1385 = new short[this.anInt1396];
					this.aShortArray1403 = new short[this.anInt1396];
					this.aByteArray1388 = new byte[this.anInt1396];
				}
				if (i_5_ == 1) {
					this.aByteArray1414 = new byte[this.anInt1391];
					this.aByteArray1420 = new byte[this.anInt1391];
					this.aShortArray1409 = new short[this.anInt1391];
				}
				this.aShortArray1415 = new short[this.anInt1391];
				this.anIntArray1418 = new int[this.anInt1407];
				this.anIntArray1400 = new int[this.anInt1407];
				this.aShortArray1410 = new short[this.anInt1391];
				i_14_ += i_12_;
				this.aShortArray1392 = new short[this.anInt1391];
				class98_sub22.position = i_15_;
				this.aShortArray1393 = new short[this.anInt1391];
				if (i_8_ == 1)
					this.anIntArray1395 = new int[this.anInt1391];
				if (i_6_ == 255)
					this.aByteArray1402 = new byte[this.anInt1391];
				else
					this.aByte1422 = (byte) i_6_;
				if (i_9_ == 1)
					this.anIntArray1417 = new int[this.anInt1407];
				class98_sub22_1_.position = i_25_;
				class98_sub22_2_.position = i_26_;
				class98_sub22_3_.position = i_27_;
				class98_sub22_4_.position = i_20_;
				int i_28_ = 0;
				int i_29_ = 0;
				int i_30_ = 0;
				for (int i_31_ = 0; this.anInt1407 > i_31_; i_31_++) {
					int i_32_ = class98_sub22.readUnsignedByte();
					int i_33_ = 0;
					if ((i_32_ & 0x1) != 0)
						i_33_ = class98_sub22_1_.method1239(40);
					int i_34_ = 0;
					if ((i_32_ & 0x2) != 0)
						i_34_ = class98_sub22_2_.method1239(-122);
					int i_35_ = 0;
					if ((0x4 & i_32_) != 0)
						i_35_ = class98_sub22_3_.method1239(i ^ ~0x31);
					this.anIntArray1416[i_31_] = i_33_ + i_28_;
					this.anIntArray1400[i_31_] = i_34_ + i_29_;
					this.anIntArray1418[i_31_] = i_30_ + i_35_;
					i_29_ = this.anIntArray1400[i_31_];
					i_30_ = this.anIntArray1418[i_31_];
					i_28_ = this.anIntArray1416[i_31_];
					if (i_9_ == 1)
						this.anIntArray1417[i_31_] = class98_sub22_4_.readUnsignedByte();
				}
				class98_sub22.position = i_23_;
				class98_sub22_1_.position = i_19_;
				class98_sub22_2_.position = i_17_;
				class98_sub22_3_.position = i_21_;
				class98_sub22_4_.position = i_18_;
				for (int i_36_ = 0; i_36_ < this.anInt1391; i_36_++) {
					this.aShortArray1415[i_36_] = (short) class98_sub22.readShort();
					if (i_5_ == 1) {
						int i_37_ = class98_sub22_1_.readUnsignedByte();
						if ((i_37_ & 0x1) != 1)
							this.aByteArray1414[i_36_] = (byte) 0;
						else {
							bool = true;
							this.aByteArray1414[i_36_] = (byte) 1;
						}
						if ((0x2 & i_37_) != 2) {
							this.aByteArray1420[i_36_] = (byte) -1;
							this.aShortArray1409[i_36_] = (short) -1;
						} else {
							this.aByteArray1420[i_36_] = (byte) (i_37_ >> 2);
							this.aShortArray1409[i_36_] = this.aShortArray1415[i_36_];
							this.aShortArray1415[i_36_] = (short) 127;
							if (this.aShortArray1409[i_36_] != -1)
								bool_0_ = true;
						}
					}
					if (i_6_ == 255)
						this.aByteArray1402[i_36_] = class98_sub22_2_.readSignedByte();
					if (i_7_ == 1)
						this.aByteArray1411[i_36_] = class98_sub22_3_.readSignedByte();
					if (i_8_ == 1)
						this.anIntArray1395[i_36_] = class98_sub22_4_.readUnsignedByte();
				}
				this.anInt1406 = i;
				class98_sub22.position = i_22_;
				class98_sub22_1_.position = i_16_;
				short i_38_ = 0;
				short i_39_ = 0;
				short i_40_ = 0;
				int i_41_ = 0;
				for (int i_42_ = 0; this.anInt1391 > i_42_; i_42_++) {
					int i_43_ = class98_sub22_1_.readUnsignedByte();
					if (i_43_ == 1) {
						i_38_ = (short) (class98_sub22.method1239(-96) + i_41_);
						i_41_ = i_38_;
						i_39_ = (short) (class98_sub22.method1239(105) + i_41_);
						i_41_ = i_39_;
						i_40_ = (short) (class98_sub22.method1239(i + -104) + i_41_);
						this.aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						this.aShortArray1410[i_42_] = i_39_;
						this.aShortArray1392[i_42_] = i_40_;
						if (i_38_ > this.anInt1406)
							this.anInt1406 = i_38_;
						if (i_39_ > this.anInt1406)
							this.anInt1406 = i_39_;
						if (i_40_ > this.anInt1406)
							this.anInt1406 = i_40_;
					}
					if (i_43_ == 2) {
						i_39_ = i_40_;
						i_40_ = (short) (i_41_ + class98_sub22.method1239(120));
						this.aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						this.aShortArray1410[i_42_] = i_39_;
						this.aShortArray1392[i_42_] = i_40_;
						if (i_40_ > this.anInt1406)
							this.anInt1406 = i_40_;
					}
					if (i_43_ == 3) {
						i_38_ = i_40_;
						i_40_ = (short) (class98_sub22.method1239(39) + i_41_);
						this.aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						this.aShortArray1410[i_42_] = i_39_;
						this.aShortArray1392[i_42_] = i_40_;
						if (i_40_ > this.anInt1406)
							this.anInt1406 = i_40_;
					}
					if (i_43_ == 4) {
						short i_44_ = i_38_;
						i_38_ = i_39_;
						i_39_ = i_44_;
						i_40_ = (short) (class98_sub22.method1239(116) + i_41_);
						this.aShortArray1393[i_42_] = i_38_;
						i_41_ = i_40_;
						this.aShortArray1410[i_42_] = i_39_;
						this.aShortArray1392[i_42_] = i_40_;
						if (this.anInt1406 < i_40_)
							this.anInt1406 = i_40_;
					}
				}
				class98_sub22.position = i_24_;
				this.anInt1406++;
				for (int i_45_ = 0; this.anInt1396 > i_45_; i_45_++) {
					this.aByteArray1388[i_45_] = (byte) 0;
					this.aShortArray1403[i_45_] = (short) class98_sub22.readShort();
					this.aShortArray1421[i_45_] = (short) class98_sub22.readShort();
					this.aShortArray1385[i_45_] = (short) class98_sub22.readShort();
				}
				if (this.aByteArray1420 != null) {
					boolean bool_46_ = false;
					for (int i_47_ = 0; (this.anInt1391 > i_47_); i_47_++) {
						int i_48_ = 0xff & this.aByteArray1420[i_47_];
						if (i_48_ != 255) {
							if (((0xffff & this.aShortArray1403[i_48_]) != this.aShortArray1393[i_47_]) || ((0xffff & (this.aShortArray1421[i_48_])) != (this.aShortArray1410[i_47_])) || (((this.aShortArray1385[i_48_]) & 0xffff) != this.aShortArray1392[i_47_]))
								bool_46_ = true;
							else
								this.aByteArray1420[i_47_] = (byte) -1;
						}
					}
					if (!bool_46_)
						this.aByteArray1420 = null;
				}
				if (!bool)
					this.aByteArray1414 = null;
				if (bool_0_)
					break;
				this.aShortArray1409 = null;
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
				class98_sub22.position = is.length - 23;
				this.anInt1407 = class98_sub22.readShort();
				this.anInt1391 = class98_sub22.readShort();
				this.anInt1396 = class98_sub22.readUnsignedByte();
				int i_58_ = class98_sub22.readUnsignedByte();
				boolean bool = (i_58_ & i) == 1;
				boolean bool_59_ = (0x2 & i_58_) == 2;
				boolean bool_60_ = (i_58_ & 0x4) == 4;
				boolean bool_61_ = (i_58_ & 0x8) == 8;
				if (bool_61_) {
					class98_sub22.position -= 7;
					this.anInt1387 = class98_sub22.readUnsignedByte();
					class98_sub22.position += 6;
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
				if (this.anInt1396 > 0) {
					class98_sub22.position = 0;
					this.aByteArray1388 = new byte[this.anInt1396];
					for (int i_75_ = 0; i_75_ < this.anInt1396; i_75_++) {
						byte i_76_ = (this.aByteArray1388[i_75_] = class98_sub22.readSignedByte());
						if (i_76_ == 2)
							i_74_++;
						if (i_76_ == 0)
							i_72_++;
						if (i_76_ >= 1 && i_76_ <= 3)
							i_73_++;
					}
				}
				int i_77_ = this.anInt1396;
				int i_78_ = i_77_;
				i_77_ += this.anInt1407;
				int i_79_ = i_77_;
				if (bool)
					i_77_ += this.anInt1391;
				int i_80_ = i_77_;
				i_77_ += this.anInt1391;
				int i_81_ = i_77_;
				if (i_62_ == 255)
					i_77_ += this.anInt1391;
				int i_82_ = i_77_;
				if (i_64_ == 1)
					i_77_ += this.anInt1391;
				int i_83_ = i_77_;
				if (i_66_ == 1)
					i_77_ += this.anInt1407;
				int i_84_ = i_77_;
				if (i_63_ == 1)
					i_77_ += this.anInt1391;
				int i_85_ = i_77_;
				i_77_ += i_70_;
				int i_86_ = i_77_;
				if (i_65_ == 1)
					i_77_ += 2 * this.anInt1391;
				int i_87_ = i_77_;
				i_77_ += i_71_;
				int i_88_ = i_77_;
				i_77_ += 2 * this.anInt1391;
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
				if (this.anInt1387 != 14) {
					if (this.anInt1387 >= 15)
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
				this.aShortArray1410 = new short[this.anInt1391];
				this.aShortArray1393 = new short[this.anInt1391];
				int i_99_ = i_77_;
				if (i_64_ == 1)
					this.anIntArray1395 = new int[this.anInt1391];
				if (bool)
					this.aByteArray1414 = new byte[this.anInt1391];
				if (i_63_ == 1)
					this.aByteArray1411 = new byte[this.anInt1391];
				class98_sub22.position = i_78_;
				if (this.anInt1396 > 0) {
					if (i_73_ > 0) {
						this.anIntArray1412 = new int[i_73_];
						this.anIntArray1389 = new int[i_73_];
						this.aByteArray1423 = new byte[i_73_];
						this.aByteArray1399 = new byte[i_73_];
						this.anIntArray1404 = new int[i_73_];
						this.anIntArray1390 = new int[i_73_];
					}
					if (i_74_ > 0) {
						this.anIntArray1397 = new int[i_74_];
						this.anIntArray1386 = new int[i_74_];
					}
					this.aShortArray1403 = new short[this.anInt1396];
					this.aShortArray1421 = new short[this.anInt1396];
					this.aShortArray1385 = new short[this.anInt1396];
				}
				this.anIntArray1416 = new int[this.anInt1407];
				if (i_65_ == 1)
					this.aShortArray1409 = new short[this.anInt1391];
				this.aShortArray1392 = new short[this.anInt1391];
				this.aShortArray1415 = new short[this.anInt1391];
				if (i_62_ == 255)
					this.aByteArray1402 = new byte[this.anInt1391];
				else
					this.aByte1422 = (byte) i_62_;
				this.anIntArray1400 = new int[this.anInt1407];
				this.anIntArray1418 = new int[this.anInt1407];
				if (i_65_ == 1 && this.anInt1396 > 0)
					this.aByteArray1420 = new byte[this.anInt1391];
				if (i_66_ == 1)
					this.anIntArray1417 = new int[this.anInt1407];
				class98_sub22_52_.position = i_89_;
				class98_sub22_53_.position = i_90_;
				class98_sub22_54_.position = i_91_;
				class98_sub22_55_.position = i_83_;
				int i_100_ = 0;
				int i_101_ = 0;
				int i_102_ = 0;
				for (int i_103_ = 0; (i_103_ < this.anInt1407); i_103_++) {
					int i_104_ = class98_sub22.readUnsignedByte();
					int i_105_ = 0;
					if ((0x1 & i_104_) != 0)
						i_105_ = class98_sub22_52_.method1239(i + -65);
					int i_106_ = 0;
					if ((i_104_ & 0x2) != 0)
						i_106_ = class98_sub22_53_.method1239(-111);
					int i_107_ = 0;
					if ((0x4 & i_104_) != 0)
						i_107_ = class98_sub22_54_.method1239(56);
					this.anIntArray1416[i_103_] = i_100_ + i_105_;
					this.anIntArray1400[i_103_] = i_101_ + i_106_;
					this.anIntArray1418[i_103_] = i_102_ - -i_107_;
					i_101_ = this.anIntArray1400[i_103_];
					i_102_ = this.anIntArray1418[i_103_];
					i_100_ = this.anIntArray1416[i_103_];
					if (i_66_ == 1)
						this.anIntArray1417[i_103_] = class98_sub22_55_.readUnsignedByte();
				}
				class98_sub22.position = i_88_;
				class98_sub22_52_.position = i_79_;
				class98_sub22_53_.position = i_81_;
				class98_sub22_54_.position = i_84_;
				class98_sub22_55_.position = i_82_;
				class98_sub22_56_.position = i_86_;
				class98_sub22_57_.position = i_87_;
				for (int i_108_ = 0; this.anInt1391 > i_108_; i_108_++) {
					this.aShortArray1415[i_108_] = (short) class98_sub22.readShort();
					if (bool)
						this.aByteArray1414[i_108_] = class98_sub22_52_.readSignedByte();
					if (i_62_ == 255)
						this.aByteArray1402[i_108_] = class98_sub22_53_.readSignedByte();
					if (i_63_ == 1)
						this.aByteArray1411[i_108_] = class98_sub22_54_.readSignedByte();
					if (i_64_ == 1)
						this.anIntArray1395[i_108_] = class98_sub22_55_.readUnsignedByte();
					if (i_65_ == 1)
						this.aShortArray1409[i_108_] = (short) (class98_sub22_56_.readShort() + -1);
					if (this.aByteArray1420 != null) {
						if (this.aShortArray1409[i_108_] == -1)
							this.aByteArray1420[i_108_] = (byte) -1;
						else
							this.aByteArray1420[i_108_] = (byte) (class98_sub22_57_.readUnsignedByte() + -1);
					}
				}
				this.anInt1406 = -1;
				class98_sub22.position = i_85_;
				class98_sub22_52_.position = i_80_;
				short i_109_ = 0;
				short i_110_ = 0;
				short i_111_ = 0;
				int i_112_ = 0;
				for (int i_113_ = 0; i_113_ < this.anInt1391; i_113_++) {
					int i_114_ = class98_sub22_52_.readUnsignedByte();
					if (i_114_ == 1) {
						i_109_ = (short) (i_112_ + class98_sub22.method1239(44));
						i_112_ = i_109_;
						i_110_ = (short) (class98_sub22.method1239(i ^ 0x44) + i_112_);
						i_112_ = i_110_;
						i_111_ = (short) (class98_sub22.method1239(i + -99) + i_112_);
						i_112_ = i_111_;
						this.aShortArray1393[i_113_] = i_109_;
						this.aShortArray1410[i_113_] = i_110_;
						this.aShortArray1392[i_113_] = i_111_;
						if (i_109_ > this.anInt1406)
							this.anInt1406 = i_109_;
						if (this.anInt1406 < i_110_)
							this.anInt1406 = i_110_;
						if (i_111_ > this.anInt1406)
							this.anInt1406 = i_111_;
					}
					if (i_114_ == 2) {
						i_110_ = i_111_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(-78));
						this.aShortArray1393[i_113_] = i_109_;
						i_112_ = i_111_;
						this.aShortArray1410[i_113_] = i_110_;
						this.aShortArray1392[i_113_] = i_111_;
						if (this.anInt1406 < i_111_)
							this.anInt1406 = i_111_;
					}
					if (i_114_ == 3) {
						i_109_ = i_111_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(74));
						i_112_ = i_111_;
						this.aShortArray1393[i_113_] = i_109_;
						this.aShortArray1410[i_113_] = i_110_;
						this.aShortArray1392[i_113_] = i_111_;
						if (i_111_ > this.anInt1406)
							this.anInt1406 = i_111_;
					}
					if (i_114_ == 4) {
						short i_115_ = i_109_;
						i_109_ = i_110_;
						i_110_ = i_115_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(i + -87));
						this.aShortArray1393[i_113_] = i_109_;
						i_112_ = i_111_;
						this.aShortArray1410[i_113_] = i_110_;
						this.aShortArray1392[i_113_] = i_111_;
						if (i_111_ > this.anInt1406)
							this.anInt1406 = i_111_;
					}
				}
				this.anInt1406++;
				class98_sub22.position = i_92_;
				class98_sub22_52_.position = i_93_;
				class98_sub22_53_.position = i_95_;
				class98_sub22_54_.position = i_96_;
				class98_sub22_55_.position = i_97_;
				class98_sub22_56_.position = i_98_;
				for (int i_116_ = 0; this.anInt1396 > i_116_; i_116_++) {
					int i_117_ = this.aByteArray1388[i_116_] & 0xff;
					if (i_117_ == 0) {
						this.aShortArray1403[i_116_] = (short) class98_sub22.readShort();
						this.aShortArray1421[i_116_] = (short) class98_sub22.readShort();
						this.aShortArray1385[i_116_] = (short) class98_sub22.readShort();
					}
					if (i_117_ == 1) {
						this.aShortArray1403[i_116_] = (short) class98_sub22_52_.readShort();
						this.aShortArray1421[i_116_] = (short) class98_sub22_52_.readShort();
						this.aShortArray1385[i_116_] = (short) class98_sub22_52_.readShort();
						if (this.anInt1387 < 15) {
							this.anIntArray1389[i_116_] = class98_sub22_53_.readShort();
							if (this.anInt1387 >= 14)
								this.anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-127);
							else
								this.anIntArray1404[i_116_] = class98_sub22_53_.readShort();
							this.anIntArray1390[i_116_] = class98_sub22_53_.readShort();
						} else {
							this.anIntArray1389[i_116_] = class98_sub22_53_.readMedium(i + -129);
							this.anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-127);
							this.anIntArray1390[i_116_] = (class98_sub22_53_.readMedium(Class369.method3953(i, -125)));
						}
						this.aByteArray1423[i_116_] = class98_sub22_54_.readSignedByte();
						this.aByteArray1399[i_116_] = class98_sub22_55_.readSignedByte();
						this.anIntArray1412[i_116_] = class98_sub22_56_.readSignedByte();
					}
					if (i_117_ == 2) {
						this.aShortArray1403[i_116_] = (short) class98_sub22_52_.readShort();
						this.aShortArray1421[i_116_] = (short) class98_sub22_52_.readShort();
						this.aShortArray1385[i_116_] = (short) class98_sub22_52_.readShort();
						if (this.anInt1387 >= 15) {
							this.anIntArray1389[i_116_] = (class98_sub22_53_.readMedium(Class369.method3953(i, -124)));
							this.anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-126);
							this.anIntArray1390[i_116_] = class98_sub22_53_.readMedium(-128);
						} else {
							this.anIntArray1389[i_116_] = class98_sub22_53_.readShort();
							if (this.anInt1387 < 14)
								this.anIntArray1404[i_116_] = class98_sub22_53_.readShort();
							else
								this.anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-127);
							this.anIntArray1390[i_116_] = class98_sub22_53_.readShort();
						}
						this.aByteArray1423[i_116_] = class98_sub22_54_.readSignedByte();
						this.aByteArray1399[i_116_] = class98_sub22_55_.readSignedByte();
						this.anIntArray1412[i_116_] = class98_sub22_56_.readSignedByte();
						this.anIntArray1397[i_116_] = class98_sub22_56_.readSignedByte();
						this.anIntArray1386[i_116_] = class98_sub22_56_.readSignedByte();
					}
					if (i_117_ == 3) {
						this.aShortArray1403[i_116_] = (short) class98_sub22_52_.readShort();
						this.aShortArray1421[i_116_] = (short) class98_sub22_52_.readShort();
						this.aShortArray1385[i_116_] = (short) class98_sub22_52_.readShort();
						if (this.anInt1387 < 15) {
							this.anIntArray1389[i_116_] = class98_sub22_53_.readShort();
							if (this.anInt1387 < 14)
								this.anIntArray1404[i_116_] = class98_sub22_53_.readShort();
							else
								this.anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-123);
							this.anIntArray1390[i_116_] = class98_sub22_53_.readShort();
						} else {
							this.anIntArray1389[i_116_] = class98_sub22_53_.readMedium(i + -126);
							this.anIntArray1404[i_116_] = class98_sub22_53_.readMedium(-123);
							this.anIntArray1390[i_116_] = class98_sub22_53_.readMedium(-123);
						}
						this.aByteArray1423[i_116_] = class98_sub22_54_.readSignedByte();
						this.aByteArray1399[i_116_] = class98_sub22_55_.readSignedByte();
						this.anIntArray1412[i_116_] = class98_sub22_56_.readSignedByte();
					}
				}
				class98_sub22.position = i_99_;
				if (bool_59_) {
					int i_118_ = class98_sub22.readUnsignedByte();
					if (i_118_ > 0) {
						this.aClass87Array1413 = new Class87[i_118_];
						for (int i_119_ = 0; i_119_ < i_118_; i_119_++) {
							int i_120_ = class98_sub22.readShort();
							int i_121_ = class98_sub22.readShort();
							byte i_122_;
							if (i_62_ != 255)
								i_122_ = (byte) i_62_;
							else
								i_122_ = this.aByteArray1402[i_121_];
							this.aClass87Array1413[i_119_] = new Class87(i_120_, (this.aShortArray1393[i_121_]), (this.aShortArray1410[i_121_]), (this.aShortArray1392[i_121_]), i_122_);
						}
					}
					int i_123_ = class98_sub22.readUnsignedByte();
					if (i_123_ > 0) {
						this.aClass35Array1398 = new Class35[i_123_];
						for (int i_124_ = 0; i_124_ < i_123_; i_124_++) {
							int i_125_ = class98_sub22.readShort();
							int i_126_ = class98_sub22.readShort();
							this.aClass35Array1398[i_124_] = new Class35(i_125_, i_126_);
						}
					}
				}
				if (!bool_60_)
					break;
				int i_127_ = class98_sub22.readUnsignedByte();
				if (i_127_ <= 0)
					break;
				this.aClass106Array1419 = new Class106[i_127_];
				for (int i_128_ = 0; i_128_ < i_127_; i_128_++) {
					int i_129_ = class98_sub22.readShort();
					int i_130_ = class98_sub22.readShort();
					int i_131_ = class98_sub22.readUnsignedByte();
					byte i_132_ = class98_sub22.readSignedByte();
					this.aClass106Array1419[i_128_] = new Class106(i_129_, i_130_, i_131_, i_132_);
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
			if (this.aShortArray1409 != null) {
				for (int i_136_ = 0; i_136_ < this.anInt1391; i_136_++) {
					if (this.aShortArray1409[i_136_] == i_134_)
						this.aShortArray1409[i_136_] = i;
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
			for (int i_138_ = 0; (this.anInt1391 > i_138_); i_138_++) {
				int i_139_ = this.anIntArray1395[i_138_];
				if (i_139_ >= 0) {
					if (i_137_ < i_139_)
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
			for (int i_142_ = 0; (this.anInt1391 > i_142_); i_142_++) {
				int i_143_ = this.anIntArray1395[i_142_];
				if (i_143_ >= 0)
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
				for (int i_145_ = 0; this.anInt1407 > i_145_; i_145_++) {
					this.anIntArray1416[i_145_] <<= i_144_;
					this.anIntArray1400[i_145_] <<= i_144_;
					this.anIntArray1418[i_145_] <<= i_144_;
				}
				if (this.anInt1396 <= 0 || this.anIntArray1389 == null)
					break;
				for (int i_146_ = 0; (i_146_ < this.anIntArray1389.length); i_146_++) {
					this.anIntArray1389[i_146_] <<= i_144_;
					this.anIntArray1404[i_146_] <<= i_144_;
					if (this.aByteArray1388[i_146_] != 1)
						this.anIntArray1390[i_146_] <<= i_144_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lv.L(" + i + ',' + i_144_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2593(int i, short i_147_, short i_148_) {
		try {
			for (int i_149_ = i; this.anInt1391 > i_149_; i_149_++) {
				if (this.aShortArray1415[i_149_] == i_147_)
					this.aShortArray1415[i_149_] = i_148_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.A(" + i + ',' + i_147_ + ',' + i_148_ + ')'));
		}
	}

	final int method2594(byte i, short i_150_, short i_151_, byte i_152_, boolean bool, int i_153_, int i_154_, byte i_155_, int i_156_) {
		try {
			this.aShortArray1393[this.anInt1391] = (short) i_154_;
			this.aShortArray1410[this.anInt1391] = (short) i_156_;
			this.aShortArray1392[this.anInt1391] = (short) i_153_;
			this.aByteArray1414[this.anInt1391] = i;
			this.aByteArray1420[this.anInt1391] = i_155_;
			this.aShortArray1415[this.anInt1391] = i_150_;
			this.aByteArray1411[this.anInt1391] = i_152_;
			if (bool != false)
				this.anIntArray1390 = null;
			this.aShortArray1409[this.anInt1391] = i_151_;
			return this.anInt1391++;
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
			int i_158_ = (!bool ? this.anInt1406 : this.anInt1407);
			for (int i_159_ = 0; i_159_ < i_158_; i_159_++) {
				int i_160_ = this.anIntArray1417[i_159_];
				if (i_160_ >= 0) {
					if (i_160_ > i_157_)
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
				int i_164_ = this.anIntArray1417[i_163_];
				if (i_164_ >= 0)
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
			for (int i_166_ = 0; (i_166_ < this.aClass106Array1419.length); i_166_++) {
				int i_167_ = (this.aClass106Array1419[i_166_].anInt908);
				if (i_167_ >= 0) {
					if (i_165_ < i_167_)
						i_165_ = i_167_;
					is[i_167_]++;
				}
			}
			int[][] is_168_ = new int[i_165_ + 1][];
			for (int i_169_ = 0; i_165_ >= i_169_; i_169_++) {
				is_168_[i_169_] = new int[is[i_169_]];
				is[i_169_] = 0;
			}
			int i_170_ = 0;
			if (i != 21517)
				this.anIntArray1418 = null;
			for (/**/; (this.aClass106Array1419.length > i_170_); i_170_++) {
				int i_171_ = (this.aClass106Array1419[i_170_].anInt908);
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
				for (int i_175_ = 0; i_175_ < this.anInt1407; i_175_++) {
					this.anIntArray1416[i_175_] += i_172_;
					this.anIntArray1400[i_175_] += i_174_;
					this.anIntArray1418[i_175_] += i;
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
			int i_179_ = class178_176_.anIntArray1416[i];
			int i_180_ = class178_176_.anIntArray1400[i];
			int i_181_ = class178_176_.anIntArray1418[i];
			for (int i_182_ = i_178_; (i_182_ < this.anInt1407); i_182_++) {
				if (this.anIntArray1416[i_182_] == i_179_ && this.anIntArray1400[i_182_] == i_180_ && this.anIntArray1418[i_182_] == i_181_) {
					this.aShortArray1408[i_182_] = (short) Class41.method366((this.aShortArray1408[i_182_]), i_177_);
					return i_182_;
				}
			}
			this.anIntArray1416[this.anInt1407] = i_179_;
			this.anIntArray1400[this.anInt1407] = i_180_;
			this.anIntArray1418[this.anInt1407] = i_181_;
			this.aShortArray1408[this.anInt1407] = i_177_;
			this.anIntArray1417[this.anInt1407] = (class178_176_.anIntArray1417 != null ? class178_176_.anIntArray1417[i] : -1);
			return this.anInt1407++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.M(" + (class178_176_ != null ? "{...}" : "null") + ',' + i + ',' + i_177_ + ',' + i_178_ + ')'));
		}
	}

	final int method2599(int i, int i_183_, int i_184_, int i_185_) {
		try {
			for (int i_186_ = 0; this.anInt1407 > i_186_; i_186_++) {
				if ((this.anIntArray1416[i_186_] == i_183_) && (i_184_ == this.anIntArray1400[i_186_]) && i_185_ == this.anIntArray1418[i_186_])
					return i_186_;
			}
			this.anIntArray1416[this.anInt1407] = i_183_;
			this.anIntArray1400[this.anInt1407] = i_184_;
			this.anIntArray1418[this.anInt1407] = i_185_;
			this.anInt1406 = this.anInt1407 + 1;
			if (i != 14418)
				method2598(null, -77, (short) 58, 51);
			return this.anInt1407++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.N(" + i + ',' + i_183_ + ',' + i_184_ + ',' + i_185_ + ')'));
		}
	}

	final void method2600(int i, int i_187_, byte i_188_, int i_189_) {
		do {
			try {
				if (i != 0) {
					int i_190_ = Class284_Sub2_Sub2.anIntArray6200[i];
					int i_191_ = Class284_Sub2_Sub2.anIntArray6202[i];
					for (int i_192_ = 0; i_192_ < this.anInt1407; i_192_++) {
						int i_193_ = (((i_191_ * this.anIntArray1416[i_192_]) + (this.anIntArray1400[i_192_] * i_190_)) >> 14);
						this.anIntArray1400[i_192_] = (-(this.anIntArray1416[i_192_] * i_190_) + (this.anIntArray1400[i_192_] * i_191_)) >> 14;
						this.anIntArray1416[i_192_] = i_193_;
					}
				}
				int i_194_ = -79 / ((i_188_ - 49) / 63);
				if (i_187_ != 0) {
					int i_195_ = Class284_Sub2_Sub2.anIntArray6200[i_187_];
					int i_196_ = Class284_Sub2_Sub2.anIntArray6202[i_187_];
					for (int i_197_ = 0; this.anInt1407 > i_197_; i_197_++) {
						int i_198_ = (((this.anIntArray1400[i_197_] * i_196_) + -(i_195_ * (this.anIntArray1418[i_197_]))) >> 14);
						this.anIntArray1418[i_197_] = ((this.anIntArray1400[i_197_] * i_195_) + (this.anIntArray1418[i_197_] * i_196_)) >> 14;
						this.anIntArray1400[i_197_] = i_198_;
					}
				}
				if (i_189_ == 0)
					break;
				int i_199_ = Class284_Sub2_Sub2.anIntArray6200[i_189_];
				int i_200_ = Class284_Sub2_Sub2.anIntArray6202[i_189_];
				for (int i_201_ = 0; (this.anInt1407 > i_201_); i_201_++) {
					int i_202_ = ((i_199_ * this.anIntArray1418[i_201_] + (i_200_ * this.anIntArray1416[i_201_])) >> 14);
					this.anIntArray1418[i_201_] = (this.anIntArray1418[i_201_] * i_200_ - i_199_ * (this.anIntArray1416[i_201_])) >> 14;
					this.anIntArray1416[i_201_] = i_202_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lv.I(" + i + ',' + i_187_ + ',' + i_188_ + ',' + i_189_ + ')'));
			}
			break;
		} while (false);
	}

	final byte method2601(byte i, byte i_203_, short i_204_, short i_205_, short i_206_, short i_207_, short i_208_, byte i_209_, short i_210_, byte i_211_) {
		try {
			if (this.anInt1396 >= 255)
				throw new IllegalStateException();
			this.aByteArray1388[this.anInt1396] = (byte) 3;
			this.aShortArray1403[this.anInt1396] = i_205_;
			this.aShortArray1421[this.anInt1396] = i_210_;
			this.aShortArray1385[this.anInt1396] = i_204_;
			this.anIntArray1389[this.anInt1396] = i_208_;
			this.anIntArray1404[this.anInt1396] = i_207_;
			this.anIntArray1390[this.anInt1396] = i_206_;
			this.aByteArray1423[this.anInt1396] = i_211_;
			this.aByteArray1399[this.anInt1396] = i;
			this.anIntArray1412[this.anInt1396] = i_203_;
			if (i_209_ <= 116)
				return (byte) -112;
			return (byte) this.anInt1396++;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.K(" + i + ',' + i_203_ + ',' + i_204_ + ',' + i_205_ + ',' + i_206_ + ',' + i_207_ + ',' + i_208_ + ',' + i_209_ + ',' + i_210_ + ',' + i_211_ + ')'));
		}
	}

	public ModelDefinitions() {
		this.anInt1391 = 0;
		this.aByte1422 = (byte) 0;
		this.anInt1406 = 0;
		this.anInt1396 = 0;
	}

	ModelDefinitions(byte[] is) {
		this.anInt1391 = 0;
		this.aByte1422 = (byte) 0;
		this.anInt1406 = 0;
		this.anInt1396 = 0;
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
		this.anInt1391 = 0;
		this.aByte1422 = (byte) 0;
		this.anInt1406 = 0;
		this.anInt1396 = 0;
		try {
			this.aByteArray1420 = new byte[i_212_];
			this.anIntArray1416 = new int[i];
			this.aByteArray1402 = new byte[i_212_];
			this.anIntArray1418 = new int[i];
			this.anIntArray1400 = new int[i];
			this.aByteArray1414 = new byte[i_212_];
			this.anIntArray1395 = new int[i_212_];
			this.aShortArray1415 = new short[i_212_];
			this.aShortArray1410 = new short[i_212_];
			this.aShortArray1393 = new short[i_212_];
			this.anIntArray1417 = new int[i];
			this.aByteArray1411 = new byte[i_212_];
			if (i_213_ > 0) {
				this.aByteArray1399 = new byte[i_213_];
				this.aByteArray1423 = new byte[i_213_];
				this.anIntArray1412 = new int[i_213_];
				this.aShortArray1385 = new short[i_213_];
				this.anIntArray1386 = new int[i_213_];
				this.anIntArray1390 = new int[i_213_];
				this.anIntArray1397 = new int[i_213_];
				this.aByteArray1388 = new byte[i_213_];
				this.anIntArray1404 = new int[i_213_];
				this.aShortArray1421 = new short[i_213_];
				this.anIntArray1389 = new int[i_213_];
				this.aShortArray1403 = new short[i_213_];
			}
			this.aShortArray1409 = new short[i_212_];
			this.aShortArray1392 = new short[i_212_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.<init>(" + i + ',' + i_212_ + ',' + i_213_ + ')'));
		}
	}

	ModelDefinitions(ModelDefinitions[] class178s, int i) {
		this.anInt1391 = 0;
		this.aByte1422 = (byte) 0;
		this.anInt1406 = 0;
		this.anInt1396 = 0;
		try {
			this.anInt1407 = 0;
			this.anInt1391 = 0;
			this.anInt1396 = 0;
			int i_214_ = 0;
			int i_215_ = 0;
			int i_216_ = 0;
			boolean bool = false;
			boolean bool_217_ = false;
			boolean bool_218_ = false;
			boolean bool_219_ = false;
			boolean bool_220_ = false;
			this.aByte1422 = (byte) -1;
			boolean bool_221_ = false;
			for (int i_222_ = 0; i_222_ < i; i_222_++) {
				ModelDefinitions class178_223_ = class178s[i_222_];
				if (class178_223_ != null) {
					this.anInt1391 += class178_223_.anInt1391;
					this.anInt1407 += class178_223_.anInt1407;
					this.anInt1396 += class178_223_.anInt1396;
					if (class178_223_.aClass87Array1413 != null)
						i_214_ += (class178_223_.aClass87Array1413).length;
					if (class178_223_.aClass106Array1419 != null)
						i_216_ += (class178_223_.aClass106Array1419).length;
					bool = bool | (class178_223_.aByteArray1414 != null);
					if (class178_223_.aClass35Array1398 != null)
						i_215_ += (class178_223_.aClass35Array1398).length;
					bool_220_ = bool_220_ | (class178_223_.aShortArray1409) != null;
					bool_219_ = bool_219_ | (class178_223_.aByteArray1420) != null;
					bool_218_ = bool_218_ | (class178_223_.aByteArray1411) != null;
					if (class178_223_.aByteArray1402 != null)
						bool_217_ = true;
					else {
						if (this.aByte1422 == -1)
							this.aByte1422 = class178_223_.aByte1422;
						if (class178_223_.aByte1422 != this.aByte1422)
							bool_217_ = true;
					}
					bool_221_ = bool_221_ | (class178_223_.anIntArray1395) != null;
				}
			}
			this.aShortArray1410 = new short[this.anInt1391];
			this.aShortArray1392 = new short[this.anInt1391];
			this.anIntArray1418 = new int[this.anInt1407];
			if (bool_221_)
				this.anIntArray1395 = new int[this.anInt1391];
			this.anIntArray1400 = new int[this.anInt1407];
			if (i_215_ > 0)
				this.aClass35Array1398 = new Class35[i_215_];
			if (bool_218_)
				this.aByteArray1411 = new byte[this.anInt1391];
			this.anIntArray1417 = new int[this.anInt1407];
			this.aShortArray1394 = new short[this.anInt1391];
			if (bool_220_)
				this.aShortArray1409 = new short[this.anInt1391];
			if (bool_217_)
				this.aByteArray1402 = new byte[this.anInt1391];
			if (this.anInt1396 > 0) {
				this.aShortArray1403 = new short[this.anInt1396];
				this.aByteArray1388 = new byte[this.anInt1396];
				this.aByteArray1399 = new byte[this.anInt1396];
				this.anIntArray1390 = new int[this.anInt1396];
				this.aByteArray1423 = new byte[this.anInt1396];
				this.aShortArray1385 = new short[this.anInt1396];
				this.anIntArray1386 = new int[this.anInt1396];
				this.anIntArray1397 = new int[this.anInt1396];
				this.aShortArray1421 = new short[this.anInt1396];
				this.anIntArray1412 = new int[this.anInt1396];
				this.anIntArray1389 = new int[this.anInt1396];
				this.anIntArray1404 = new int[this.anInt1396];
			}
			if (i_214_ > 0)
				this.aClass87Array1413 = new Class87[i_214_];
			if (bool_219_)
				this.aByteArray1420 = new byte[this.anInt1391];
			this.aShortArray1408 = new short[this.anInt1407];
			this.anIntArray1416 = new int[this.anInt1407];
			this.aShortArray1415 = new short[this.anInt1391];
			if (bool)
				this.aByteArray1414 = new byte[this.anInt1391];
			this.aShortArray1393 = new short[this.anInt1391];
			if (i_216_ > 0)
				this.aClass106Array1419 = new Class106[i_216_];
			this.anInt1407 = 0;
			this.anInt1396 = 0;
			i_214_ = 0;
			i_216_ = 0;
			this.anInt1391 = 0;
			i_215_ = 0;
			for (int i_224_ = 0; i > i_224_; i_224_++) {
				short i_225_ = (short) (1 << i_224_);
				ModelDefinitions class178_226_ = class178s[i_224_];
				if (class178_226_ != null) {
					if (class178_226_.aClass106Array1419 != null) {
						for (int i_227_ = 0; (i_227_ < (class178_226_.aClass106Array1419).length); i_227_++) {
							Class106 class106 = (class178_226_.aClass106Array1419[i_227_]);
							this.aClass106Array1419[i_216_++] = class106.method1719(((this.anInt1391) + (class106.anInt906)), -125);
						}
					}
					for (int i_228_ = 0; (class178_226_.anInt1391 > i_228_); i_228_++) {
						if (bool && (class178_226_.aByteArray1414 != null))
							this.aByteArray1414[(this.anInt1391)] = (class178_226_.aByteArray1414[i_228_]);
						if (bool_217_) {
							if (class178_226_.aByteArray1402 != null)
								this.aByteArray1402[this.anInt1391] = (class178_226_.aByteArray1402[i_228_]);
							else
								this.aByteArray1402[this.anInt1391] = class178_226_.aByte1422;
						}
						if (bool_218_ && (class178_226_.aByteArray1411 != null))
							this.aByteArray1411[(this.anInt1391)] = (class178_226_.aByteArray1411[i_228_]);
						if (bool_220_) {
							if (class178_226_.aShortArray1409 == null)
								this.aShortArray1409[this.anInt1391] = (short) -1;
							else
								this.aShortArray1409[this.anInt1391] = (class178_226_.aShortArray1409[i_228_]);
						}
						if (bool_221_) {
							if (class178_226_.anIntArray1395 != null)
								this.anIntArray1395[this.anInt1391] = (class178_226_.anIntArray1395[i_228_]);
							else
								this.anIntArray1395[this.anInt1391] = -1;
						}
						this.aShortArray1393[(this.anInt1391)] = (short) method2598(class178_226_, (class178_226_.aShortArray1393[i_228_]), i_225_, 0);
						this.aShortArray1410[(this.anInt1391)] = (short) method2598(class178_226_, (class178_226_.aShortArray1410[i_228_]), i_225_, 0);
						this.aShortArray1392[(this.anInt1391)] = (short) method2598(class178_226_, (class178_226_.aShortArray1392[i_228_]), i_225_, 0);
						this.aShortArray1394[(this.anInt1391)] = i_225_;
						this.aShortArray1415[(this.anInt1391)] = (class178_226_.aShortArray1415[i_228_]);
						this.anInt1391++;
					}
					if (class178_226_.aClass87Array1413 != null) {
						for (int i_229_ = 0; ((class178_226_.aClass87Array1413).length > i_229_); i_229_++) {
							int i_230_ = method2598(class178_226_, (class178_226_.aClass87Array1413[i_229_].anInt666), i_225_, 0);
							int i_231_ = method2598(class178_226_, (class178_226_.aClass87Array1413[i_229_].anInt661), i_225_, 0);
							int i_232_ = method2598(class178_226_, (class178_226_.aClass87Array1413[i_229_].anInt674), i_225_, 0);
							this.aClass87Array1413[i_214_] = class178_226_.aClass87Array1413[i_229_].method857(i_230_, true, i_232_, i_231_);
							i_214_++;
						}
					}
					if (class178_226_.aClass35Array1398 != null) {
						for (int i_233_ = 0; ((class178_226_.aClass35Array1398).length > i_233_); i_233_++) {
							int i_234_ = method2598(class178_226_, (class178_226_.aClass35Array1398[i_233_].anInt327), i_225_, 0);
							this.aClass35Array1398[i_215_] = class178_226_.aClass35Array1398[i_233_].method336(-1854, i_234_);
							i_215_++;
						}
					}
				}
			}
			int i_235_ = 0;
			this.anInt1406 = this.anInt1407;
			for (int i_236_ = 0; i > i_236_; i_236_++) {
				short i_237_ = (short) (1 << i_236_);
				ModelDefinitions class178_238_ = class178s[i_236_];
				if (class178_238_ != null) {
					for (int i_239_ = 0; class178_238_.anInt1391 > i_239_; i_239_++) {
						if (bool_219_)
							this.aByteArray1420[i_235_++] = (byte) (((class178_238_.aByteArray1420) != null && (class178_238_.aByteArray1420[i_239_]) != -1) ? ((class178_238_.aByteArray1420[i_239_]) + this.anInt1396) : -1);
					}
					for (int i_240_ = 0; i_240_ < class178_238_.anInt1396; i_240_++) {
						byte i_241_ = (this.aByteArray1388[this.anInt1396] = (class178_238_.aByteArray1388[i_240_]));
						if (i_241_ == 0) {
							this.aShortArray1403[this.anInt1396] = (short) method2598(class178_238_, (class178_238_.aShortArray1403[i_240_]), i_237_, 0);
							this.aShortArray1421[this.anInt1396] = (short) method2598(class178_238_, (class178_238_.aShortArray1421[i_240_]), i_237_, 0);
							this.aShortArray1385[this.anInt1396] = (short) method2598(class178_238_, (class178_238_.aShortArray1385[i_240_]), i_237_, 0);
						}
						if (i_241_ >= 1 && i_241_ <= 3) {
							this.aShortArray1403[this.anInt1396] = (class178_238_.aShortArray1403[i_240_]);
							this.aShortArray1421[this.anInt1396] = (class178_238_.aShortArray1421[i_240_]);
							this.aShortArray1385[this.anInt1396] = (class178_238_.aShortArray1385[i_240_]);
							this.anIntArray1389[(this.anInt1396)] = (class178_238_.anIntArray1389[i_240_]);
							this.anIntArray1404[(this.anInt1396)] = (class178_238_.anIntArray1404[i_240_]);
							this.anIntArray1390[(this.anInt1396)] = (class178_238_.anIntArray1390[i_240_]);
							this.aByteArray1423[(this.anInt1396)] = (class178_238_.aByteArray1423[i_240_]);
							this.aByteArray1399[(this.anInt1396)] = (class178_238_.aByteArray1399[i_240_]);
							this.anIntArray1412[(this.anInt1396)] = (class178_238_.anIntArray1412[i_240_]);
						}
						if (i_241_ == 2) {
							this.anIntArray1397[(this.anInt1396)] = (class178_238_.anIntArray1397[i_240_]);
							this.anIntArray1386[(this.anInt1396)] = (class178_238_.anIntArray1386[i_240_]);
						}
						this.anInt1396++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lv.<init>(" + (class178s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
