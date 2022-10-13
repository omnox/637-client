/* Class98_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub7 extends Node {
	Class377 aClass377_3849;
	byte[] aByteArray3850;

	final void method983() {
		((Class98_Sub7) this).aClass377_3849 = null;
	}

	final void method984() {
		if (((Class98_Sub7) this).aClass377_3849 == null) {
			((Class98_Sub7) this).aClass377_3849 = new Class377(16);
			int[] is = new int[16];
			int[] is_0_ = new int[16];
			is[9] = is_0_[9] = 128;
			Class173 class173 = new Class173(((Class98_Sub7) this).aByteArray3850);
			int i = class173.method2558();
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				class173.method2555(i_1_);
				class173.method2556(i_1_);
				class173.method2552(i_1_);
			}
			while_37_: for (;;) {
				int i_2_ = class173.method2551();
				int i_3_ = ((Class173) class173).anIntArray1343[i_2_];
				while (((Class173) class173).anIntArray1343[i_2_] == i_3_) {
					class173.method2555(i_2_);
					int i_4_ = class173.method2559(i_2_);
					if (i_4_ == 1) {
						class173.method2553();
						class173.method2552(i_2_);
						if (!class173.method2550())
							break;
						break while_37_;
					}
					int i_5_ = i_4_ & 0xf0;
					if (i_5_ == 176) {
						int i_6_ = i_4_ & 0xf;
						int i_7_ = i_4_ >> 8 & 0x7f;
						int i_8_ = i_4_ >> 16 & 0x7f;
						if (i_7_ == 0)
							is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
						if (i_7_ == 32)
							is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
					}
					if (i_5_ == 192) {
						int i_9_ = i_4_ & 0xf;
						int i_10_ = i_4_ >> 8 & 0x7f;
						is_0_[i_9_] = is[i_9_] + i_10_;
					}
					if (i_5_ == 144) {
						int i_11_ = i_4_ & 0xf;
						int i_12_ = i_4_ >> 8 & 0x7f;
						int i_13_ = i_4_ >> 16 & 0x7f;
						if (i_13_ > 0) {
							int i_14_ = is_0_[i_11_];
							Class98_Sub14 class98_sub14 = ((Class98_Sub14) ((Class98_Sub7) this).aClass377_3849.method3990((long) i_14_, -1));
							if (class98_sub14 == null) {
								class98_sub14 = new Class98_Sub14(new byte[128]);
								((Class98_Sub7) this).aClass377_3849.method3996(class98_sub14, (long) i_14_, -1);
							}
							((Class98_Sub14) class98_sub14).aByteArray3914[i_12_] = (byte) 1;
						}
					}
					class173.method2556(i_2_);
					class173.method2552(i_2_);
				}
			}
		}
	}

	private Class98_Sub7(RSByteBuffer class98_sub22) {
		((RSByteBuffer) class98_sub22).position = ((RSByteBuffer) class98_sub22).data.length - 3;
		int i = class98_sub22.readUnsignedByte();
		int i_15_ = class98_sub22.readShort();
		int i_16_ = 14 + i * 10;
		((RSByteBuffer) class98_sub22).position = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		while_35_: for (int i_25_ = 0; i_25_ < i; i_25_++) {
			int i_26_ = -1;
			for (;;) {
				int i_27_ = class98_sub22.readUnsignedByte();
				if (i_27_ != i_26_)
					i_16_++;
				i_26_ = i_27_ & 0xf;
				if (i_27_ == 7)
					continue while_35_;
				if (i_27_ == 23)
					i_17_++;
				else if (i_26_ == 0)
					i_19_++;
				else if (i_26_ == 1)
					i_20_++;
				else if (i_26_ == 2)
					i_18_++;
				else if (i_26_ == 3)
					i_21_++;
				else if (i_26_ == 4)
					i_22_++;
				else if (i_26_ == 5)
					i_23_++;
				else {
					if (i_26_ != 6)
						break;
					i_24_++;
				}
			}
			throw new RuntimeException();
		}
		i_16_ += 5 * i_17_;
		i_16_ += 2 * (i_19_ + i_20_ + i_18_ + i_21_ + i_23_);
		i_16_ += i_22_ + i_24_;
		int i_28_ = ((RSByteBuffer) class98_sub22).position;
		int i_29_ = (i + i_17_ + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_);
		for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
			class98_sub22.method1240((byte) -20);
		i_16_ += ((RSByteBuffer) class98_sub22).position - i_28_;
		int i_31_ = ((RSByteBuffer) class98_sub22).position;
		int i_32_ = 0;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		for (int i_45_ = 0; i_45_ < i_18_; i_45_++) {
			i_44_ = i_44_ + class98_sub22.readUnsignedByte() & 0x7f;
			if (i_44_ == 0 || i_44_ == 32)
				i_24_++;
			else if (i_44_ == 1)
				i_32_++;
			else if (i_44_ == 33)
				i_33_++;
			else if (i_44_ == 7)
				i_34_++;
			else if (i_44_ == 39)
				i_35_++;
			else if (i_44_ == 10)
				i_36_++;
			else if (i_44_ == 42)
				i_37_++;
			else if (i_44_ == 99)
				i_38_++;
			else if (i_44_ == 98)
				i_39_++;
			else if (i_44_ == 101)
				i_40_++;
			else if (i_44_ == 100)
				i_41_++;
			else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121 || i_44_ == 123)
				i_42_++;
			else
				i_43_++;
		}
		int i_46_ = 0;
		int i_47_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_42_;
		int i_48_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_23_;
		int i_49_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_22_;
		int i_50_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_21_;
		int i_51_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_32_;
		int i_52_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_34_;
		int i_53_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_36_;
		int i_54_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_19_ + i_20_ + i_23_;
		int i_55_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_19_;
		int i_56_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_43_;
		int i_57_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_20_;
		int i_58_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_33_;
		int i_59_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_35_;
		int i_60_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_37_;
		int i_61_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_24_;
		int i_62_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_21_;
		int i_63_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_38_;
		int i_64_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_39_;
		int i_65_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_40_;
		int i_66_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_41_;
		int i_67_ = ((RSByteBuffer) class98_sub22).position;
		((RSByteBuffer) class98_sub22).position += i_17_ * 3;
		((Class98_Sub7) this).aByteArray3850 = new byte[i_16_];
		RSByteBuffer class98_sub22_68_ = new RSByteBuffer(((Class98_Sub7) this).aByteArray3850);
		class98_sub22_68_.writeInt(1571862888, 1297377380);
		class98_sub22_68_.writeInt(1571862888, 6);
		class98_sub22_68_.writeShort(i > 1 ? 1 : 0);
		class98_sub22_68_.writeShort(i);
		class98_sub22_68_.writeShort(i_15_);
		((RSByteBuffer) class98_sub22).position = i_28_;
		int i_69_ = 0;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		int i_75_ = 0;
		int[] is = new int[128];
		i_44_ = 0;
		for (int i_76_ = 0; i_76_ < i; i_76_++) {
			class98_sub22_68_.writeInt(1571862888, 1297379947);
			((RSByteBuffer) class98_sub22_68_).position += 4;
			int i_77_ = ((RSByteBuffer) class98_sub22_68_).position;
			int i_78_ = -1;
			while_36_: do {
				for (;;) {
					int i_79_ = class98_sub22.method1240((byte) -20);
					class98_sub22_68_.method1199(i_79_, false);
					int i_80_ = ((((RSByteBuffer) class98_sub22).data[i_46_++]) & 0xff);
					boolean bool = i_80_ != i_78_;
					i_78_ = i_80_ & 0xf;
					if (i_80_ == 7) {
						if (bool)
							class98_sub22_68_.writeByte(255);
						class98_sub22_68_.writeByte(47);
						class98_sub22_68_.writeByte(0);
						break while_36_;
					}
					if (i_80_ == 23) {
						if (bool)
							class98_sub22_68_.writeByte(255);
						class98_sub22_68_.writeByte(81);
						class98_sub22_68_.writeByte(3);
						class98_sub22_68_.writeByte((((RSByteBuffer) class98_sub22).data[i_67_++]));
						class98_sub22_68_.writeByte((((RSByteBuffer) class98_sub22).data[i_67_++]));
						class98_sub22_68_.writeByte((((RSByteBuffer) class98_sub22).data[i_67_++]));
					} else {
						i_69_ ^= i_80_ >> 4;
						if (i_78_ == 0) {
							if (bool)
								class98_sub22_68_.writeByte(144 + i_69_);
							i_70_ += (((RSByteBuffer) class98_sub22).data[i_54_++]);
							i_71_ += (((RSByteBuffer) class98_sub22).data[i_55_++]);
							class98_sub22_68_.writeByte(i_70_ & 0x7f);
							class98_sub22_68_.writeByte(i_71_ & 0x7f);
						} else if (i_78_ == 1) {
							if (bool)
								class98_sub22_68_.writeByte(128 + i_69_);
							i_70_ += (((RSByteBuffer) class98_sub22).data[i_54_++]);
							i_72_ += (((RSByteBuffer) class98_sub22).data[i_57_++]);
							class98_sub22_68_.writeByte(i_70_ & 0x7f);
							class98_sub22_68_.writeByte(i_72_ & 0x7f);
						} else if (i_78_ == 2) {
							if (bool)
								class98_sub22_68_.writeByte(176 + i_69_);
							i_44_ = i_44_ + (((RSByteBuffer) class98_sub22).data[i_31_++]) & 0x7f;
							class98_sub22_68_.writeByte(i_44_);
							int i_81_;
							if (i_44_ == 0 || i_44_ == 32)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_61_++]);
							else if (i_44_ == 1)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_51_++]);
							else if (i_44_ == 33)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_58_++]);
							else if (i_44_ == 7)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_52_++]);
							else if (i_44_ == 39)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_59_++]);
							else if (i_44_ == 10)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_53_++]);
							else if (i_44_ == 42)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_60_++]);
							else if (i_44_ == 99)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_63_++]);
							else if (i_44_ == 98)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_64_++]);
							else if (i_44_ == 101)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_65_++]);
							else if (i_44_ == 100)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_66_++]);
							else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121 || i_44_ == 123)
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_47_++]);
							else
								i_81_ = (((RSByteBuffer) class98_sub22).data[i_56_++]);
							i_81_ += is[i_44_];
							is[i_44_] = i_81_;
							class98_sub22_68_.writeByte(i_81_ & 0x7f);
						} else if (i_78_ == 3) {
							if (bool)
								class98_sub22_68_.writeByte(224 + i_69_);
							i_73_ += (((RSByteBuffer) class98_sub22).data[i_62_++]);
							i_73_ += (((RSByteBuffer) class98_sub22).data[i_50_++]) << 7;
							class98_sub22_68_.writeByte(i_73_ & 0x7f);
							class98_sub22_68_.writeByte(i_73_ >> 7 & 0x7f);
						} else if (i_78_ == 4) {
							if (bool)
								class98_sub22_68_.writeByte(208 + i_69_);
							i_74_ += (((RSByteBuffer) class98_sub22).data[i_49_++]);
							class98_sub22_68_.writeByte(i_74_ & 0x7f);
						} else if (i_78_ == 5) {
							if (bool)
								class98_sub22_68_.writeByte(160 + i_69_);
							i_70_ += (((RSByteBuffer) class98_sub22).data[i_54_++]);
							i_75_ += (((RSByteBuffer) class98_sub22).data[i_48_++]);
							class98_sub22_68_.writeByte(i_70_ & 0x7f);
							class98_sub22_68_.writeByte(i_75_ & 0x7f);
						} else {
							if (i_78_ != 6)
								break;
							if (bool)
								class98_sub22_68_.writeByte(192 + i_69_);
							class98_sub22_68_.writeByte((((RSByteBuffer) class98_sub22).data[i_61_++]));
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class98_sub22_68_.method1233((byte) -74, (((RSByteBuffer) class98_sub22_68_).position) - i_77_);
		}
	}

	static final Class98_Sub7 method985(RuneScapeCache class207, int i, int i_82_) {
		byte[] is = class207.readArchive(i_82_, i);
		if (is == null)
			return null;
		return new Class98_Sub7(new RSByteBuffer(is));
	}
}
