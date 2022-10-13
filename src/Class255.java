/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class255 implements Interface1 {
	static OutgoingOpcode aClass171_3206;
	static int[] anIntArray3207;
	static GameInterfaceData draggedComponent = null;
	static String[] aStringArray3209 = new String[100];
	static int[] anIntArray3210 = new int[1000];
	static byte[][] aByteArrayArray3211;

	public Class255() {
		/* empty */
	}

	public static void method3191(byte i) {
		try {
			anIntArray3210 = null;
			aStringArray3209 = null;
			if (i != 49)
				aByteArrayArray3211 = null;
			aByteArrayArray3211 = null;
			anIntArray3207 = null;
			aClass171_3206 = null;
			draggedComponent = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pv.A(" + i + ')');
		}
	}

	public final String method1(int i, long l, Class348 class348, int[] is) {
		try {
			if (class348 == Class151_Sub9.aClass348_5023) {
				Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(is[0], 1028602529);
				return class306.method3594((int) l, (byte) 43);
			}
			if (Class77_Sub1.aClass348_3801 == class348 || class348 == Class359.aClass348_3046) {
				ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs((int) l);
				return ((ItemDefinition) class297).name;
			}
			if (class348 == Class42_Sub3.aClass348_5363 || class348 == Class98_Sub36.aClass348_4156 || Class151_Sub7.aClass348_5008 == class348)
				return Class98_Sub10_Sub16.aClass29_5620.method302(is[0], 1028602529).method3594((int) l, (byte) 127);
			if (i != 17438)
				method3191((byte) 34);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pv.B(" + i + ',' + l + ',' + (class348 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class119_Sub1 method3192(int i, RSByteBuffer class98_sub22) {
		try {
			if (i >= -115)
				return null;
			return new Class119_Sub1(class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readUShort(false), class98_sub22.readMedium(-125), class98_sub22.readUnsignedByte());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pv.C(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass171_3206 = new OutgoingOpcode(25, 7);
	}
}
