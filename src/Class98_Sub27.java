
/* Class98_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;

final class Class98_Sub27 extends Node {
	Class64_Sub6 aClass64_Sub6_4033;
	Class64_Sub15 aClass64_Sub15_4034;
	Class64_Sub26 aClass64_Sub26_4035;
	private Class145 aClass145_4036;
	Class64_Sub21 aClass64_Sub21_4037;
	Class64_Sub11 aClass64_Sub11_4038;
	Class64_Sub25 aClass64_Sub25_4039;
	Class64_Sub16 aClass64_Sub16_4040;
	Class64_Sub3 aClass64_Sub3_4041;
	Class64_Sub8 aClass64_Sub8_4042;
	Class64_Sub1 aClass64_Sub1_4043;
	Class64_Sub23 aClass64_Sub23_4044;
	static OutgoingOpcode aClass171_4045 = new OutgoingOpcode(59, 2);
	Class64_Sub17 aClass64_Sub17_4046;
	Class64_Sub24 aClass64_Sub24_4047;
	Class64_Sub12 aClass64_Sub12_4048;
	Class64_Sub14 aClass64_Sub14_4049;
	Class64_Sub29 aClass64_Sub29_4050;
	Class64_Sub22 aClass64_Sub22_4051;
	Class64_Sub27 aClass64_Sub27_4052;
	Class64_Sub4 aClass64_Sub4_4053;
	Class64_Sub22 aClass64_Sub22_4054;
	Class64_Sub23 aClass64_Sub23_4055;
	Class64_Sub20 aClass64_Sub20_4056;
	Class64_Sub19 aClass64_Sub19_4057;
	Class64_Sub15 aClass64_Sub15_4058;
	private Class279 aClass279_4059;
	static int anInt4060;
	Class64_Sub2 aClass64_Sub2_4061;
	Class64_Sub8 aClass64_Sub8_4062;
	Class64_Sub13 aClass64_Sub13_4063;
	Class64_Sub28 aClass64_Sub28_4064;
	Class64_Sub5 aClass64_Sub5_4065;
	Class64_Sub22 aClass64_Sub22_4066;
	Class64_Sub9 aClass64_Sub9_4067;
	Class64_Sub27 aClass64_Sub27_4068;
	Class64_Sub22 aClass64_Sub22_4069;
	Class64_Sub10 aClass64_Sub10_4070;
	Class64_Sub18 aClass64_Sub18_4071;
	Class64_Sub22 aClass64_Sub22_4072;
	Class64_Sub7 aClass64_Sub7_4073;
	static Class350 aClass350_4074 = new Class350(1);
	static byte[] aByteArray4075 = new byte[2048];
	Class64_Sub3 aClass64_Sub3_4076;
	/* synthetic */ static Class aClass4077;

	public static void method1280(boolean bool) {
		do {
			try {
				aClass350_4074 = null;
				aByteArray4075 = null;
				aClass171_4045 = null;
				if (bool == true)
					break;
				anInt4060 = 95;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kda.L(" + bool + ')');
			}
			break;
		} while (false);
	}

	private final void method1281(RSByteBuffer class98_sub22, int i, int i_0_) {
		do {
			try {
				this.aClass64_Sub19_4057 = new Class64_Sub19(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub3_4041 = new Class64_Sub3(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub15_4034 = new Class64_Sub15(1 + class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub11_4038 = new Class64_Sub11(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub9_4067 = new Class64_Sub9(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub24_4047 = new Class64_Sub24(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub13_4063 = new Class64_Sub13(class98_sub22.readUnsignedByte(), this);
				class98_sub22.readUnsignedByte();
				this.aClass64_Sub26_4035 = new Class64_Sub26(class98_sub22.readUnsignedByte(), this);
				int i_1_ = class98_sub22.readUnsignedByte();
				int i_2_ = 0;
				if (i >= 17)
					i_2_ = class98_sub22.readUnsignedByte();
				this.aClass64_Sub7_4073 = new Class64_Sub7((i_1_ > i_2_ ? i_1_ : i_2_), this);
				boolean bool = true;
				boolean bool_3_ = true;
				if (i >= 2) {
					bool = (class98_sub22.readUnsignedByte() == 1);
					if (i >= 17)
						bool_3_ = class98_sub22.readUnsignedByte() == 1;
				} else {
					bool = class98_sub22.readUnsignedByte() == 1;
					class98_sub22.readUnsignedByte();
				}
				this.aClass64_Sub10_4070 = new Class64_Sub10(!(bool | bool_3_) ? 0 : 1, this);
				this.aClass64_Sub28_4064 = new Class64_Sub28(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub14_4049 = new Class64_Sub14(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub23_4044 = new Class64_Sub23(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub1_4043 = new Class64_Sub1(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub22_4066 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
				if (i >= 20)
					this.aClass64_Sub22_4054 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
				else
					this.aClass64_Sub22_4054 = new Class64_Sub22(this.aClass64_Sub22_4066.method641((byte) 124), this);
				this.aClass64_Sub22_4069 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
				this.aClass64_Sub22_4051 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
				if (i >= 21)
					this.aClass64_Sub22_4072 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
				else
					this.aClass64_Sub22_4072 = new Class64_Sub22(this.aClass64_Sub22_4069.method641((byte) 125), this);
				if (i >= 1) {
					class98_sub22.readShort();
					class98_sub22.readShort();
				}
				if (i >= 3 && i < 6)
					class98_sub22.readUnsignedByte();
				if (i_0_ != 4311)
					method1281(null, -107, -6);
				if (i >= 4)
					this.aClass64_Sub6_4033 = new Class64_Sub6(class98_sub22.readUnsignedByte(), this);
				class98_sub22.readInt(-2);
				if (i >= 6)
					this.aClass64_Sub27_4052 = new Class64_Sub27(class98_sub22.readUnsignedByte(), this);
				if (i >= 7)
					this.aClass64_Sub2_4061 = new Class64_Sub2(class98_sub22.readUnsignedByte(), this);
				if (i >= 8)
					class98_sub22.readUnsignedByte();
				if (i >= 9)
					this.aClass64_Sub17_4046 = new Class64_Sub17(class98_sub22.readUnsignedByte(), this);
				if (i >= 10)
					this.aClass64_Sub5_4065 = new Class64_Sub5(class98_sub22.readUnsignedByte(), this);
				if (i >= 11)
					this.aClass64_Sub29_4050 = new Class64_Sub29(class98_sub22.readUnsignedByte(), this);
				if (i >= 12)
					this.aClass64_Sub24_4047 = new Class64_Sub24(class98_sub22.readUnsignedByte(), this);
				if (i >= 13)
					this.aClass64_Sub25_4039 = new Class64_Sub25(class98_sub22.readUnsignedByte(), this);
				if (i >= 14)
					this.aClass64_Sub8_4062 = new Class64_Sub8(class98_sub22.readUnsignedByte(), this);
				if (i >= 15)
					this.aClass64_Sub21_4037 = new Class64_Sub21(class98_sub22.readUnsignedByte(), this);
				if (i >= 16)
					this.aClass64_Sub20_4056 = new Class64_Sub20(class98_sub22.readUnsignedByte(), this);
				if (i >= 18)
					this.aClass64_Sub12_4048 = new Class64_Sub12(class98_sub22.readUnsignedByte(), this);
				if (i >= 19)
					this.aClass64_Sub16_4040 = new Class64_Sub16(class98_sub22.readUnsignedByte(), this);
				if (i < 22)
					break;
				this.aClass64_Sub4_4053 = new Class64_Sub4(class98_sub22.readUnsignedByte(), this);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kda.I(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1282(byte i, int viewDistanceIndex) {
		try {
			if (viewDistanceIndex != RSByteBuffer.currentViewDistanceIndex) {
				GameWorld.size_x = GameWorld.size_y = Class246_Sub3_Sub4_Sub5.viewDistances[viewDistanceIndex];
				Class98_Sub10_Sub34.method1104(112);
				Class170.anIntArrayArrayArray1311 = (new int[4][GameWorld.size_x >> 3][GameWorld.size_y >> 3]);
				Class372.anIntArrayArray3149 = (new int[GameWorld.size_x][GameWorld.size_y]);
				Class64_Sub28.anIntArrayArray3719 = (new int[GameWorld.size_x][GameWorld.size_y]);
				for (int i_5_ = 0; i_5_ < 4; i_5_++)
					Class167.aClass243Array1281[i_5_] = RtMouseListener.method3509(2742, GameWorld.size_y, GameWorld.size_x);
				OutputStream_Sub2.aByteArrayArrayArray41 = (new byte[4][GameWorld.size_x][GameWorld.size_y]);
				Class322.method3673(GameWorld.size_y, GameWorld.size_x, 4, true);
				Class159.method2508(GameWorld.size_x >> 3, GameWorld.size_y >> 3, (byte) -50, Class265.aHa1974);
				if (i != 8)
					method1284(43);
				RSByteBuffer.currentViewDistanceIndex = viewDistanceIndex;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.M(" + i + ',' + viewDistanceIndex + ')');
		}
	}

	private final void method1283(boolean bool, int i) {
		try {
			if (bool || this.aClass64_Sub23_4044 == null)
				this.aClass64_Sub23_4044 = new Class64_Sub23(this);
			if (bool || this.aClass64_Sub23_4055 == null)
				this.aClass64_Sub23_4055 = new Class64_Sub23(this.aClass64_Sub23_4044.method648((byte) 125), this);
			if (bool || this.aClass64_Sub5_4065 == null)
				this.aClass64_Sub5_4065 = new Class64_Sub5(this);
			if (bool || this.aClass64_Sub19_4057 == null)
				this.aClass64_Sub19_4057 = new Class64_Sub19(this);
			if (bool || this.aClass64_Sub17_4046 == null)
				this.aClass64_Sub17_4046 = new Class64_Sub17(this);
			if (bool || this.aClass64_Sub13_4063 == null)
				this.aClass64_Sub13_4063 = new Class64_Sub13(this);
			if (bool || this.aClass64_Sub14_4049 == null)
				this.aClass64_Sub14_4049 = new Class64_Sub14(this);
			if (bool || this.aClass64_Sub25_4039 == null)
				this.aClass64_Sub25_4039 = new Class64_Sub25(this);
			if (bool || this.aClass64_Sub11_4038 == null)
				this.aClass64_Sub11_4038 = new Class64_Sub11(this);
			if (bool || this.aClass64_Sub24_4047 == null)
				this.aClass64_Sub24_4047 = new Class64_Sub24(this);
			if (bool || this.aClass64_Sub10_4070 == null)
				this.aClass64_Sub10_4070 = new Class64_Sub10(this);
			if (bool || this.aClass64_Sub7_4073 == null)
				this.aClass64_Sub7_4073 = new Class64_Sub7(this);
			if (bool || this.aClass64_Sub18_4071 == null)
				this.aClass64_Sub18_4071 = new Class64_Sub18(this);
			if (bool || this.aClass64_Sub6_4033 == null)
				this.aClass64_Sub6_4033 = new Class64_Sub6(this);
			if (bool || this.aClass64_Sub15_4034 == null)
				this.aClass64_Sub15_4034 = new Class64_Sub15(this);
			if (bool || this.aClass64_Sub15_4058 == null)
				this.aClass64_Sub15_4058 = new Class64_Sub15(this.aClass64_Sub15_4034.method612((byte) 120), this);
			if (bool || this.aClass64_Sub16_4040 == null)
				this.aClass64_Sub16_4040 = new Class64_Sub16(this);
			if (bool || this.aClass64_Sub26_4035 == null)
				this.aClass64_Sub26_4035 = new Class64_Sub26(this);
			if (bool || this.aClass64_Sub9_4067 == null)
				this.aClass64_Sub9_4067 = new Class64_Sub9(this);
			if (bool || this.aClass64_Sub20_4056 == null)
				this.aClass64_Sub20_4056 = new Class64_Sub20(this);
			if (bool || this.aClass64_Sub8_4062 == null)
				this.aClass64_Sub8_4062 = new Class64_Sub8(this);
			if (bool || this.aClass64_Sub8_4042 == null)
				this.aClass64_Sub8_4042 = new Class64_Sub8(this.aClass64_Sub8_4062.method583((byte) 125), this);
			if (bool || this.aClass64_Sub3_4041 == null)
				this.aClass64_Sub3_4041 = new Class64_Sub3(this);
			if (bool || this.aClass64_Sub3_4076 == null)
				this.aClass64_Sub3_4076 = new Class64_Sub3(this.aClass64_Sub3_4041.method564((byte) 121), this);
			if (bool || this.aClass64_Sub28_4064 == null)
				this.aClass64_Sub28_4064 = new Class64_Sub28(this);
			if (bool || this.aClass64_Sub27_4052 == null)
				this.aClass64_Sub27_4052 = new Class64_Sub27(this);
			if (bool || this.aClass64_Sub27_4068 == null)
				this.aClass64_Sub27_4068 = new Class64_Sub27(this.aClass64_Sub27_4052.method666((byte) 127), this);
			if (bool || this.aClass64_Sub29_4050 == null)
				this.aClass64_Sub29_4050 = new Class64_Sub29(this);
			if (bool || this.aClass64_Sub12_4048 == null)
				this.aClass64_Sub12_4048 = new Class64_Sub12(this);
			if (bool || this.aClass64_Sub21_4037 == null)
				this.aClass64_Sub21_4037 = new Class64_Sub21(this);
			if (bool || this.aClass64_Sub4_4053 == null)
				this.aClass64_Sub4_4053 = new Class64_Sub4(this);
			if (i == 0) {
				if (bool || this.aClass64_Sub2_4061 == null)
					this.aClass64_Sub2_4061 = new Class64_Sub2(this);
				if (bool || this.aClass64_Sub22_4066 == null)
					this.aClass64_Sub22_4066 = new Class64_Sub22(this);
				if (bool || this.aClass64_Sub22_4051 == null)
					this.aClass64_Sub22_4051 = new Class64_Sub22(this);
				if (bool || this.aClass64_Sub22_4054 == null)
					this.aClass64_Sub22_4054 = new Class64_Sub22(this);
				if (bool || this.aClass64_Sub22_4069 == null)
					this.aClass64_Sub22_4069 = new Class64_Sub22(this);
				if (bool || this.aClass64_Sub22_4072 == null)
					this.aClass64_Sub22_4072 = new Class64_Sub22(this);
				if (bool || this.aClass64_Sub1_4043 == null)
					this.aClass64_Sub1_4043 = new Class64_Sub1(this);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.E(" + bool + ',' + i + ')');
		}
	}

	static final void method1284(int i) {
		try {
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4041));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4034));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub25_4039));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub24_4047));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub20_4056));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub10_4070));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub28_4064));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub14_4049));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4044));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4055));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub6_4033));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub5_4065));
			Class151_Sub1.method2450((byte) 106);
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub16_4040));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 4, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub12_4048));
			Class98_Sub46_Sub13_Sub1.method1593((byte) 110);
			Class374.method3980((byte) 125);
			Class33.aBoolean316 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.A(" + i + ')');
		}
	}

	final void method1285(byte i, int i_6_, Class64 class64) {
		try {
			if (i != -13)
				this.aClass64_Sub17_4046 = null;
			class64.method554(i_6_, i + 9861);
			method1287(false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kda.C(" + i + ',' + i_6_ + ',' + (class64 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class279 method1286(byte i) {
		try {
			if (i != 104)
				this.aClass64_Sub26_4035 = null;
			return aClass279_4059;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.D(" + i + ')');
		}
	}

	private final void method1287(boolean bool) {
		try {
			try {
				Field[] fields = this.getClass().getDeclaredFields();
				Field[] fields_7_ = fields;
				for (int i = 0; i < fields_7_.length; i++) {
					Field field = fields_7_[i];
					if ((aClass4077 != null ? aClass4077 : (aClass4077 = method1293("Class64"))).isAssignableFrom(field.getType())) {
						Class64 class64 = (Class64) field.get(this);
						class64.method551((byte) 119);
					}
				}
				if (bool != false)
					aClass279_4059 = null;
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.B(" + bool + ')');
		}
	}

	final RSByteBuffer method1288(boolean bool) {
		try {
			RSByteBuffer class98_sub22 = new RSByteBuffer(Class269.method3270(97));
			class98_sub22.writeByte(24);
			class98_sub22.writeByte(this.aClass64_Sub23_4044.method648((byte) 125));
			class98_sub22.writeByte(this.aClass64_Sub5_4065.method570((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub19_4057.method630((byte) 123));
			class98_sub22.writeByte(this.aClass64_Sub17_4046.method617((byte) 126));
			class98_sub22.writeByte(this.aClass64_Sub13_4063.method602((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub14_4049.method609((byte) 124));
			class98_sub22.writeByte(this.aClass64_Sub25_4039.method655((byte) 121));
			class98_sub22.writeByte(this.aClass64_Sub11_4038.method596((byte) 121));
			class98_sub22.writeByte(this.aClass64_Sub24_4047.method651((byte) 123));
			class98_sub22.writeByte(this.aClass64_Sub10_4070.method592((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub7_4073.method579((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub18_4071.method627((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub6_4033.method572((byte) 122));
			if (bool != true)
				return null;
			class98_sub22.writeByte(this.aClass64_Sub15_4034.method612((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub16_4040.method614((byte) 120));
			class98_sub22.writeByte(this.aClass64_Sub26_4035.method662((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub9_4067.method588((byte) 121));
			class98_sub22.writeByte(this.aClass64_Sub20_4056.method634((byte) 127));
			class98_sub22.writeByte(this.aClass64_Sub8_4062.method583((byte) 125));
			class98_sub22.writeByte(this.aClass64_Sub3_4041.method564((byte) 124));
			class98_sub22.writeByte(this.aClass64_Sub28_4064.method668((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub27_4052.method666((byte) 125));
			class98_sub22.writeByte(this.aClass64_Sub29_4050.method677((byte) 127));
			class98_sub22.writeByte(this.aClass64_Sub12_4048.method600((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub21_4037.method639((byte) 126));
			class98_sub22.writeByte(this.aClass64_Sub4_4053.method568((byte) 120));
			class98_sub22.writeByte(this.aClass64_Sub2_4061.method560((byte) 126));
			class98_sub22.writeByte(this.aClass64_Sub22_4066.method641((byte) 124));
			class98_sub22.writeByte(this.aClass64_Sub22_4051.method641((byte) 120));
			class98_sub22.writeByte(this.aClass64_Sub22_4054.method641((byte) 125));
			class98_sub22.writeByte(this.aClass64_Sub22_4069.method641((byte) 122));
			class98_sub22.writeByte(this.aClass64_Sub22_4072.method641((byte) 121));
			class98_sub22.writeByte(this.aClass64_Sub1_4043.method558((byte) 121));
			return class98_sub22;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.K(" + bool + ')');
		}
	}

	final Class145 method1289(int i) {
		try {
			if (i >= -95)
				method1280(true);
			return aClass145_4036;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.J(" + i + ')');
		}
	}

	private final void method1290(RSByteBuffer class98_sub22, int i) {
		try {
			if (class98_sub22 != null && class98_sub22.data != null) {
				int i_8_ = class98_sub22.readUnsignedByte();
				if (i_8_ < 23) {
					try {
						method1281(class98_sub22, i_8_, 4311);
					} catch (Exception exception) {
						method1283(true, i ^ 0x27a4);
					}
					method1283(false, 0);
				} else if (i_8_ > 24)
					method1283(true, i + -10148);
				else {
					this.aClass64_Sub23_4044 = new Class64_Sub23(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub23_4055 = new Class64_Sub23(this.aClass64_Sub23_4044.method648((byte) 124), this);
					this.aClass64_Sub5_4065 = new Class64_Sub5(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub19_4057 = new Class64_Sub19(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub17_4046 = new Class64_Sub17(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub13_4063 = new Class64_Sub13(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub14_4049 = new Class64_Sub14(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub25_4039 = new Class64_Sub25(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub11_4038 = new Class64_Sub11(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub24_4047 = new Class64_Sub24(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub10_4070 = new Class64_Sub10(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub7_4073 = new Class64_Sub7(class98_sub22.readUnsignedByte(), this);
					if (i_8_ >= 24)
						this.aClass64_Sub18_4071 = new Class64_Sub18(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub6_4033 = new Class64_Sub6(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub15_4034 = new Class64_Sub15(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub15_4058 = new Class64_Sub15(this.aClass64_Sub15_4034.method612((byte) 123), this);
					this.aClass64_Sub16_4040 = new Class64_Sub16(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub26_4035 = new Class64_Sub26(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub9_4067 = new Class64_Sub9(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub20_4056 = new Class64_Sub20(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub8_4062 = new Class64_Sub8(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub8_4042 = new Class64_Sub8(this.aClass64_Sub8_4062.method583((byte) 122), this);
					this.aClass64_Sub3_4041 = new Class64_Sub3(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub3_4076 = new Class64_Sub3(this.aClass64_Sub3_4041.method564((byte) 122), this);
					this.aClass64_Sub28_4064 = new Class64_Sub28(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub27_4052 = new Class64_Sub27(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub27_4068 = new Class64_Sub27(this.aClass64_Sub27_4052.method666((byte) 127), this);
					this.aClass64_Sub29_4050 = new Class64_Sub29(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub12_4048 = new Class64_Sub12(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub21_4037 = new Class64_Sub21(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub4_4053 = new Class64_Sub4(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub2_4061 = new Class64_Sub2(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub22_4066 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub22_4051 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub22_4054 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub22_4069 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub22_4072 = new Class64_Sub22(class98_sub22.readUnsignedByte(), this);
					this.aClass64_Sub1_4043 = new Class64_Sub1(class98_sub22.readUnsignedByte(), this);
					method1283(false, i ^ 0x27a4);
				}
			} else
				method1283(true, 0);
			if (i != 10148)
				method1280(true);
			method1287(false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kda.F(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method1291(byte i) {
		try {
			if (i < 100)
				aByteArray4075 = null;
			if (!this.aClass64_Sub8_4042.method586(true) || this.aClass64_Sub8_4042.method583((byte) 122) != 0 || aClass145_4036.method2318(-1) >= 96)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kda.H(" + i + ')');
		}
	}

	static final boolean method1292(int i, byte i_9_, int i_10_) {
		try {
			if (!Class53_Sub1.method502(i, i_10_, (byte) 116))
				return false;
			if ((i_10_ & 0x9000) != 0 | Class349.method3842(i, i_10_, -18021) | RSByteBuffer.method1241(false, i, i_10_))
				return true;
			if (i_9_ < 110)
				aClass171_4045 = null;
			return (((0x2000 & i_10_) != 0 | Class373_Sub3.method3978(i, i_10_, (byte) 74) | Class21_Sub2.method271((byte) -112, i_10_, i)) & (i & 0x37) == 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kda.G(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	Class98_Sub27(Class279 class279, int i) {
		try {
			aClass279_4059 = class279;
			aClass145_4036 = new Class145((Class98_Sub43_Sub2.aClass88_5907.aBoolean682), Class292.anInt3359, Class98_Sub46_Sub19.anInt6065, (Class88.aString690.toLowerCase().indexOf("arm") != -1));
			this.aClass64_Sub8_4042 = new Class64_Sub8(i, this);
			method1283(true, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kda.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	Class98_Sub27(RSByteBuffer class98_sub22, Class279 class279, int i) {
		try {
			aClass279_4059 = class279;
			aClass145_4036 = new Class145((Class98_Sub43_Sub2.aClass88_5907.aBoolean682), Class292.anInt3359, Class98_Sub46_Sub19.anInt6065, Class88.aString690.indexOf("arm") != -1);
			this.aClass64_Sub8_4042 = new Class64_Sub8(i, this);
			method1290(class98_sub22, 10148);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kda.<init>(" + (class98_sub22 != null ? "{...}" : "null") + ',' + (class279 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	/* synthetic */ static Class method1293(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
