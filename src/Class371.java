/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class371 {
	int anInt3141;
	int[] anIntArray3142;
	int[] anIntArray3143;
	int anInt3144;

	Class371() {
		Class98_Sub13.method1138(16);
		((Class371) this).anInt3141 = (Class98_Sub13.method1134() != 0 ? Class98_Sub13.method1138(4) + 1 : 1);
		if (Class98_Sub13.method1134() != 0)
			Class98_Sub13.method1138(8);
		Class98_Sub13.method1138(2);
		if (((Class371) this).anInt3141 > 1)
			((Class371) this).anInt3144 = Class98_Sub13.method1138(4);
		((Class371) this).anIntArray3142 = new int[((Class371) this).anInt3141];
		((Class371) this).anIntArray3143 = new int[((Class371) this).anInt3141];
		for (int i = 0; i < ((Class371) this).anInt3141; i++) {
			Class98_Sub13.method1138(8);
			((Class371) this).anIntArray3142[i] = Class98_Sub13.method1138(8);
			((Class371) this).anIntArray3143[i] = Class98_Sub13.method1138(8);
		}
	}
}
