/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class67 {
	static boolean aBoolean520 = false;
	static int anInt521;

	static final void method687(byte i, int i_0_) {
		try {
			synchronized (RtMouseListener.aClass79_2493) {
				RtMouseListener.aClass79_2493.method800((byte) 62, i_0_);
				if (i != 118)
					aBoolean520 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eh.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method688(int i, long l, int i_1_, int i_2_) {
		try {
			int i_3_ = (0x7f61d & (int) l) >> 250951790;
			int i_4_ = (int) l >> -1669061484 & 0x3;
			int i_5_ = (int) (l >>> -1972629216) & 0x7fffffff;
			if (i == -23) {
				if (i_3_ == 10 || (i_3_ ^ 0xffffffff) == -12 || (i_3_ ^ 0xffffffff) == -23) {
					Class352 class352 = Class130.aClass302_1028.method3546(i_5_, (byte) 119);
					int i_6_;
					int i_7_;
					do {
						if ((i_4_ ^ 0xffffffff) == -1 || i_4_ == 2) {
							i_6_ = ((Class352) class352).sizeY;
							i_7_ = ((Class352) class352).sizeX;
							if (!client.aBoolean3553)
								break;
						}
						i_6_ = ((Class352) class352).sizeX;
						i_7_ = ((Class352) class352).sizeY;
					} while (false);
					int i_8_ = ((Class352) class352).anInt2948;
					if (i_4_ != 0)
						i_8_ = (i_8_ << i_4_ & 0xf) + (i_8_ >> 4 + -i_4_);
					Class76_Sub2.requestFlag(0, i_8_, i_7_, 0, 0, i_2_, i_1_, true, i_6_);
				} else
					Class76_Sub2.requestFlag(i_4_, 0, 0, i_3_, 0, i_2_, i_1_, true, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eh.A(" + i + ',' + l + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final Class177 method689(int i, byte i_9_) {
		try {
			if (i_9_ > -87)
				anInt521 = 88;
			Class177 class177 = ((Class177) Class246_Sub9.aClass79_5138.get((long) i));
			if (class177 != null)
				return class177;
			byte[] is = ha_Sub3.aClass207_4528.readArchive(i, 0);
			class177 = new Class177();
			if (is != null)
				class177.method2586((byte) 77, new RSByteBuffer(is), i);
			Class246_Sub9.aClass79_5138.put((long) i, class177);
			return class177;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eh.B(" + i + ',' + i_9_ + ')');
		}
	}
}
