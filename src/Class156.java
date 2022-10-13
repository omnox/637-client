/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

class Class156 {
	private ha_Sub1 aHa_Sub1_1246;
	Buffer aBuffer1247;

	final void method2496(byte[] is, int i) {
		if (this.aBuffer1247 == null || this.aBuffer1247.getSize() < i)
			this.aBuffer1247 = aHa_Sub1_1246.aNativeHeap4323.a(i, false);
		this.aBuffer1247.a(is, 0, 0, i);
	}

	Class156(ha_Sub1 var_ha_Sub1, byte[] is, int i) {
		aHa_Sub1_1246 = var_ha_Sub1;
		this.aBuffer1247 = aHa_Sub1_1246.aNativeHeap4323.a(i, false);
		if (is != null)
			this.aBuffer1247.a(is, 0, 0, i);
	}

	Class156(ha_Sub1 var_ha_Sub1, Buffer buffer) {
		aHa_Sub1_1246 = var_ha_Sub1;
		this.aBuffer1247 = buffer;
	}
}
