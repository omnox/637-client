/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class355 {
	static int anInt3017;

	static final Class98_Sub44 method3875(int i, RuneScapeCache class207, int i_0_) {
		try {
			if (i_0_ > -20)
				anInt3017 = -75;
			byte[] is = class207.method2733(i, -119);
			if (is == null)
				return null;
			return new Class98_Sub44(is);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vk.A(" + i + ',' + (class207 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}
}
