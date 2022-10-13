/* Class246_Sub3_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3_Sub4 extends AnimableEntity {
	short aShort6157;
	short aShort6158;
	short aShort6159;
	short aShort6160;
	byte aByte6161;
	boolean aBoolean6162;

	void method3022(int i) {
		try {
			if (i != -8675)
				method3023(101, null, null);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lr.F(" + i + ')');
		}
	}

	static final OutgoingPacket method3023(int i, OutgoingOpcode class171, Class117 class117) {
		try {
			OutgoingPacket class98_sub11 = Class289.method3410(i + -261);
			((OutgoingPacket) class98_sub11).aClass171_3864 = class171;
			((OutgoingPacket) class98_sub11).anInt3867 = ((OutgoingOpcode) class171).size;
			if ((((OutgoingPacket) class98_sub11).anInt3867 ^ 0xffffffff) != 0) {
				if ((((OutgoingPacket) class98_sub11).anInt3867 ^ 0xffffffff) != 1) {
					if (((OutgoingPacket) class98_sub11).anInt3867 <= 18)
						((OutgoingPacket) class98_sub11).packet = new Class98_Sub22_Sub1(20);
					else if (((OutgoingPacket) class98_sub11).anInt3867 <= 98)
						((OutgoingPacket) class98_sub11).packet = new Class98_Sub22_Sub1(100);
					else
						((OutgoingPacket) class98_sub11).packet = new Class98_Sub22_Sub1(260);
				} else
					((OutgoingPacket) class98_sub11).packet = new Class98_Sub22_Sub1(10000);
			} else
				((OutgoingPacket) class98_sub11).packet = new Class98_Sub22_Sub1(260);
			((OutgoingPacket) class98_sub11).packet.method1252((byte) -125, class117);
			((OutgoingPacket) class98_sub11).packet.method1261(false, ((OutgoingPacket) class98_sub11).aClass171_3864.method2541(2));
			((OutgoingPacket) class98_sub11).anInt3869 = 0;
			if (i != 260)
				method3023(-19, null, null);
			return class98_sub11;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lr.BA(" + i + ',' + (class171 != null ? "{...}" : "null") + ',' + (class117 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class315 method3024(RSByteBuffer class98_sub22, boolean bool) {
		try {
			String string = class98_sub22.readString();
			Class63 class63 = (Class98_Sub46_Sub13_Sub1.method1595(122)[class98_sub22.readUnsignedByte()]);
			Class110 class110 = (Class331.method3723(256)[class98_sub22.readUnsignedByte()]);
			int i = class98_sub22.readUShort(false);
			int i_0_ = class98_sub22.readUShort(!bool);
			if (bool != true)
				return null;
			int i_1_ = class98_sub22.readUnsignedByte();
			int i_2_ = class98_sub22.readUnsignedByte();
			int i_3_ = class98_sub22.readUnsignedByte();
			int i_4_ = class98_sub22.readShort();
			int i_5_ = class98_sub22.readShort();
			int i_6_ = class98_sub22.readInt(-2);
			int i_7_ = class98_sub22.readInt(-2);
			int i_8_ = class98_sub22.readInt(-2);
			return new Class315(string, class63, class110, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lr.EA(" + (class98_sub22 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final int method2980(int i, Class98_Sub5[] class98_sub5s) {
		try {
			int i_9_ = 0;
			while_119_: for (int i_10_ = ((Class246_Sub3_Sub4) this).aShort6158; i_10_ <= ((Class246_Sub3_Sub4) this).aShort6160; i_10_++) {
				for (int i_11_ = ((Class246_Sub3_Sub4) this).aShort6157; i_11_ <= ((Class246_Sub3_Sub4) this).aShort6159; i_11_++) {
					long l = (Class373_Sub3.aLongArrayArrayArray5476[((AnimableEntity) this).height_level][i_10_][i_11_]);
					long l_12_ = 0L;
					while_118_: while (l_12_ <= 48L) {
						int i_13_ = (int) (0xffffL & l >>> (int) l_12_);
						if (i_13_ <= 0)
							break;
						Class1 class1 = Class98_Sub10_Sub31.aClass1Array5717[i_13_ + -1];
						for (int i_14_ = 0; i_9_ > i_14_; i_14_++) {
							if (((Class1) class1).aClass98_Sub5_55 == class98_sub5s[i_14_]) {
								l_12_ += 16L;
								continue while_118_;
							}
						}
						class98_sub5s[i_9_++] = ((Class1) class1).aClass98_Sub5_55;
						if (i_9_ == 4)
							break while_119_;
						l_12_ += 16L;
					}
				}
			}
			int i_15_ = 79 % ((29 - i) / 62);
			for (int i_16_ = i_9_; i_16_ < 4; i_16_++)
				class98_sub5s[i_16_] = null;
			if (((Class246_Sub3_Sub4) this).aByte6161 != 0) {
				int i_17_ = (((Class246_Sub3_Sub4) this).aShort6158 - Class241.anInt1845);
				int i_18_ = (-Class64_Sub26.anInt3714 + ((Class246_Sub3_Sub4) this).aShort6157);
				int i_19_;
				int i_20_;
				short i_21_;
				short i_22_;
				if ((((Class246_Sub3_Sub4) this).aByte6161 ^ 0xffffffff) != -2) {
					if (i_18_ <= -i_17_) {
						i_21_ = ((Class246_Sub3_Sub4) this).aShort6158;
						i_22_ = ((Class246_Sub3_Sub4) this).aShort6157;
						i_20_ = 1 + ((Class246_Sub3_Sub4) this).aShort6157;
						i_19_ = ((Class246_Sub3_Sub4) this).aShort6158 + 1;
					} else {
						i_19_ = ((Class246_Sub3_Sub4) this).aShort6158 + -1;
						i_20_ = ((Class246_Sub3_Sub4) this).aShort6157 + -1;
						i_22_ = ((Class246_Sub3_Sub4) this).aShort6157;
						i_21_ = ((Class246_Sub3_Sub4) this).aShort6158;
					}
				} else if (i_17_ < i_18_) {
					i_19_ = ((Class246_Sub3_Sub4) this).aShort6158 + 1;
					i_20_ = -1 + ((Class246_Sub3_Sub4) this).aShort6157;
					i_21_ = ((Class246_Sub3_Sub4) this).aShort6158;
					i_22_ = ((Class246_Sub3_Sub4) this).aShort6157;
				} else {
					i_22_ = ((Class246_Sub3_Sub4) this).aShort6157;
					i_20_ = ((Class246_Sub3_Sub4) this).aShort6157 + 1;
					i_19_ = -1 + ((Class246_Sub3_Sub4) this).aShort6158;
					i_21_ = ((Class246_Sub3_Sub4) this).aShort6158;
				}
				int i_23_ = 0;
				while_121_: for (/**/; i_23_ < i_9_; i_23_++) {
					long l = (Class373_Sub3.aLongArrayArrayArray5476[((AnimableEntity) this).height_level][i_21_][i_20_]);
					while ((l ^ 0xffffffffffffffffL) != -1L) {
						Class1 class1 = (Class98_Sub10_Sub31.aClass1Array5717[(int) ((0xffffL & l) - 1L)]);
						l >>>= 16;
						if (((Class1) class1).aClass98_Sub5_55 == class98_sub5s[i_23_])
							continue while_121_;
					}
					l = (Class373_Sub3.aLongArrayArrayArray5476[((AnimableEntity) this).height_level][i_19_][i_22_]);
					while (l != 0L) {
						Class1 class1 = (Class98_Sub10_Sub31.aClass1Array5717[(int) (-1L + (l & 0xffffL))]);
						l >>>= 16;
						if (class98_sub5s[i_23_] == ((Class1) class1).aClass98_Sub5_55)
							continue while_121_;
					}
					for (int i_24_ = i_23_; (i_9_ + -1 ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
						class98_sub5s[i_24_] = class98_sub5s[i_24_ + 1];
					i_9_--;
				}
			}
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lr.GA(" + i + ',' + (class98_sub5s != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2977(ha var_ha, byte i) {
		try {
			if (i != 77)
				method2991(false);
			return Class63.method547(((Class246_Sub3_Sub4) this).aShort6158, ((Class246_Sub3_Sub4) this).aShort6157, this.method2974((byte) -53, var_ha), 0, ((Class246_Sub3_Sub4) this).aShort6160, ((Class246_Sub3_Sub4) this).aShort6159, ((AnimableEntity) this).aByte5081);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lr.AA(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method2991(boolean bool) {
		try {
			if (bool != false)
				method2991(true);
			for (int i = ((Class246_Sub3_Sub4) this).aShort6158; ((Class246_Sub3_Sub4) this).aShort6160 >= i; i++) {
				for (int i_25_ = ((Class246_Sub3_Sub4) this).aShort6157; ((Class246_Sub3_Sub4) this).aShort6159 >= i_25_; i_25_++) {
					int i_26_ = Class259.anInt1959 + i + -Class241.anInt1845;
					if (i_26_ >= 0 && ((i_26_ ^ 0xffffffff) > (Class74.aBooleanArrayArray551.length ^ 0xffffffff))) {
						int i_27_ = (-Class64_Sub26.anInt3714 + i_25_ - -Class259.anInt1959);
						if ((i_27_ ^ 0xffffffff) <= -1 && Class74.aBooleanArrayArray551.length > i_27_ && Class74.aBooleanArrayArray551[i_26_][i_27_])
							return true;
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lr.FA(" + bool + ')');
		}
	}

	Class246_Sub3_Sub4(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, boolean bool, byte i_36_) {
		try {
			((Class246_Sub3_Sub4) this).aShort6158 = (short) i_32_;
			((Class246_Sub3_Sub4) this).aBoolean6162 = bool;
			((AnimableEntity) this).anInt5089 = i_30_;
			((AnimableEntity) this).aByte5081 = (byte) i_28_;
			((Class246_Sub3_Sub4) this).aShort6157 = (short) i_34_;
			((Class246_Sub3_Sub4) this).aByte6161 = i_36_;
			((Class246_Sub3_Sub4) this).aShort6160 = (short) i_33_;
			((AnimableEntity) this).localXPos = i_29_;
			((AnimableEntity) this).localYPos = i_31_;
			((Class246_Sub3_Sub4) this).aShort6159 = (short) i_35_;
			((AnimableEntity) this).height_level = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("lr.<init>(" + i + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + bool + ',' + i_36_ + ')'));
		}
	}
}
