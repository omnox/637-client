/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class28 {
	float aFloat281;
	int anInt282;
	int anInt283;
	int anInt284;
	int anInt285;
	static Class128 aClass128_286 = new Class128();
	Class48 aClass48_287;
	float aFloat288;
	float aFloat289;
	int anInt290;
	float aFloat291 = 0.25F;
	int anInt292;
	float aFloat293 = 1.0F;
	static float[] aFloatArray294 = new float[2];
	float aFloat295 = 1.0F;

	final void method297(int i, RSByteBuffer class98_sub22) {
		try {
			((Class28) this).aFloat295 = (float) (8 * class98_sub22.readUnsignedByte()) / 255.0F;
			((Class28) this).aFloat291 = (float) (class98_sub22.readUnsignedByte() * 8) / 255.0F;
			if (i != -50)
				method297(-51, null);
			((Class28) this).aFloat293 = (float) (8 * class98_sub22.readUnsignedByte()) / 255.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ca.A(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method298(int i) {
		do {
			try {
				aClass128_286 = null;
				aFloatArray294 = null;
				if (i == -15136)
					break;
				method298(-41);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ca.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method299(boolean bool, Class28 class28_0_) {
		try {
			if (bool != true)
				return false;
			if (((((Class28) this).anInt290 ^ 0xffffffff) != (((Class28) class28_0_).anInt290 ^ 0xffffffff)) || (((Class28) this).aFloat281 != ((Class28) class28_0_).aFloat281) || (((Class28) this).aFloat288 != ((Class28) class28_0_).aFloat288) || (((Class28) this).aFloat289 != ((Class28) class28_0_).aFloat289) || (((Class28) class28_0_).aFloat291 != ((Class28) this).aFloat291) || (((Class28) class28_0_).aFloat295 != ((Class28) this).aFloat295) || (((Class28) class28_0_).aFloat293 != ((Class28) this).aFloat293) || ((((Class28) class28_0_).anInt285 ^ 0xffffffff) != (((Class28) this).anInt285 ^ 0xffffffff)) || ((Class28) this).anInt283 != ((Class28) class28_0_).anInt283 || (((Class28) this).aClass48_287 != ((Class28) class28_0_).aClass48_287))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ca.C(" + bool + ',' + (class28_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class28() {
		try {
			((Class28) this).aFloat288 = 0.69921875F;
			((Class28) this).anInt282 = -50;
			((Class28) this).aClass48_287 = Class246_Sub7.aClass48_5119;
			((Class28) this).anInt292 = -50;
			((Class28) this).anInt285 = Class189.anInt1455;
			((Class28) this).anInt284 = -60;
			((Class28) this).anInt290 = Class299_Sub2.anInt5298;
			((Class28) this).anInt283 = 0;
			((Class28) this).aFloat281 = 1.1523438F;
			((Class28) this).aFloat289 = 1.2F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ca.<init>(" + ')');
		}
	}

	Class28(RSByteBuffer class98_sub22) {
		try {
			int i = class98_sub22.readUnsignedByte();
			if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub10_4070.method592((byte) 126) ^ 0xffffffff) == -2 && Class98_Sub37.aHa4185.method1822() > 0) {
				if ((0x1 & i ^ 0xffffffff) != -1)
					((Class28) this).anInt290 = class98_sub22.readInt(-2);
				else
					((Class28) this).anInt290 = Class299_Sub2.anInt5298;
				if ((0x2 & i) == 0)
					((Class28) this).aFloat281 = 1.1523438F;
				else
					((Class28) this).aFloat281 = ((float) class98_sub22.readShort() / 256.0F);
				if ((0x4 & i) != 0)
					((Class28) this).aFloat288 = ((float) class98_sub22.readShort() / 256.0F);
				else
					((Class28) this).aFloat288 = 0.69921875F;
				if ((0x8 & i ^ 0xffffffff) != -1)
					((Class28) this).aFloat289 = ((float) class98_sub22.readShort() / 256.0F);
				else
					((Class28) this).aFloat289 = 1.2F;
			} else {
				if ((0x1 & i ^ 0xffffffff) != -1)
					class98_sub22.readInt(-2);
				if ((0x2 & i ^ 0xffffffff) != -1)
					class98_sub22.readShort();
				if ((0x4 & i) != 0)
					class98_sub22.readShort();
				if ((i & 0x8) != 0)
					class98_sub22.readShort();
				((Class28) this).aFloat281 = 1.1523438F;
				((Class28) this).aFloat289 = 1.2F;
				((Class28) this).anInt290 = Class299_Sub2.anInt5298;
				((Class28) this).aFloat288 = 0.69921875F;
			}
			if ((0x10 & i) != 0) {
				((Class28) this).anInt282 = class98_sub22.readUShort(false);
				((Class28) this).anInt284 = class98_sub22.readUShort(false);
				((Class28) this).anInt292 = class98_sub22.readUShort(false);
			} else {
				((Class28) this).anInt284 = -60;
				((Class28) this).anInt292 = -50;
				((Class28) this).anInt282 = -50;
			}
			if ((0x20 & i ^ 0xffffffff) == -1)
				((Class28) this).anInt285 = Class189.anInt1455;
			else
				((Class28) this).anInt285 = class98_sub22.readInt(-2);
			if ((i & 0x40) == 0)
				((Class28) this).anInt283 = 0;
			else
				((Class28) this).anInt283 = class98_sub22.readShort();
			if ((i & 0x80) == 0)
				((Class28) this).aClass48_287 = Class246_Sub7.aClass48_5119;
			else {
				int i_1_ = class98_sub22.readShort();
				int i_2_ = class98_sub22.readShort();
				int i_3_ = class98_sub22.readShort();
				int i_4_ = class98_sub22.readShort();
				int i_5_ = class98_sub22.readShort();
				int i_6_ = class98_sub22.readShort();
				((Class28) this).aClass48_287 = Class13.method217(5, i_4_, i_6_, i_5_, i_3_, i_1_, i_2_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ca.<init>(" + (class98_sub22 != null ? "{...}" : "null") + ')');
		}
	}
}
