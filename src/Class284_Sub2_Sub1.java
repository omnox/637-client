/* Class284_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284_Sub2_Sub1 extends Class284_Sub2 {
	private byte[] aByteArray6195;

	final byte[] method3377(int i, int i_0_, int i_1_, int i_2_) {
		try {
			aByteArray6195 = new byte[2 * i * (i_2_ * i_1_)];
			if (i_0_ != 20283)
				return null;
			this.method3361((byte) -81, i_2_, i_1_, i);
			return aByteArray6195;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("in.M(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method3375(int i, int i_3_, byte i_4_) {
		try {
			int i_5_ = i * 2;
			int i_6_ = 0xff & i_4_;
			aByteArray6195[i_5_++] = (byte) (i_6_ * 3 >> -320652859);
			aByteArray6195[i_5_] = (byte) (i_6_ * 3 >> 451584293);
			int i_7_ = -116 % ((i_3_ - -46) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("in.L(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public Class284_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}
}
