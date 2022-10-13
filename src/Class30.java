/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30 {
	static final boolean method304(int i, byte[] is) {
		try {
			RSByteBuffer class98_sub22 = new RSByteBuffer(is);
			int i_0_ = class98_sub22.readUnsignedByte();
			if (i_0_ != 2)
				return false;
			boolean bool = (class98_sub22.readUnsignedByte() ^ 0xffffffff) == -2;
			if (bool)
				ha_Sub1.method1853(2, class98_sub22);
			int i_1_ = -95 % ((-30 - i) / 48);
			Class291.method3415(104, class98_sub22);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cca.A(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
