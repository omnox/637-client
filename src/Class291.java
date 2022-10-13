/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class291 {
	static double aDouble2199;

	static final void method3414(int i, boolean bool, int i_0_) {
		try {
			if (i == -1) {
				if (bool) {
					OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class98_Sub42.aClass171_4235), (Class331.aClass117_2811));
					((OutgoingPacket) class98_sub11).packet.writeShort(i_0_);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				} else
					ClientScript2Runtime.method3152(Class288.aClass105_3375, i_0_, -1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rw.A(" + i + ',' + bool + ',' + i_0_ + ')'));
		}
	}

	static final void method3415(int i, RSByteBuffer class98_sub22) {
		try {
			if (i > 64) {
				for (int i_1_ = 0; i_1_ < Class42_Sub3.anInt5366; i_1_++) {
					int i_2_ = class98_sub22.readSmart(1689622712);
					int i_3_ = class98_sub22.readShort();
					if (i_3_ == 65535)
						i_3_ = -1;
					if (Class98_Sub20.aClass53_Sub1Array3967[i_2_] != null)
						((Class53) Class98_Sub20.aClass53_Sub1Array3967[i_2_]).anInt429 = i_3_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rw.B(" + i + ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}
}
