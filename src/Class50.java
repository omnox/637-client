/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50 {
	static int[] anIntArray417;
	static int anInt418 = 0;
	static float aFloat419;

	public static void method483(int i) {
		try {
			if (i != -11543)
				method483(-8);
			anIntArray417 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dj.D(" + i + ')');
		}
	}

	static final void method484(int i, int i_0_) {
		try {
			int i_1_ = -120 % ((i_0_ - -60) / 60);
			int i_2_ = Class215.anInt1614 + -Class98_Sub10_Sub14.anInt5613;
			if (i_2_ >= 100) {
				Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
				Class98_Sub46_Sub20_Sub2.anInt6319 = 1;
			} else {
				int cameraVrotation = (int) GameWorld.cameraGetVrot;
				if ((cameraVrotation ^ 0xffffffff) > (Class43.anInt372 >> 237711528 ^ 0xffffffff))
					cameraVrotation = Class43.anInt372 >> 238117992;
				if (Class217.aBooleanArray3410[4] && 128 + Class98_Sub10_Sub13.anIntArray5603[4] > cameraVrotation)
					cameraVrotation = 128 + Class98_Sub10_Sub13.anIntArray5603[4];
				int cameraHrotation = ((Class98_Sub10_Sub9.anInt5581 + (int) GameWorld.cameraGetHrot) & 0x3fff);
				Class104.method1712(false, cameraHrotation, ClientSettings.clientZoom * (cameraVrotation >> 756311203) + 600 << 995508098, Class224_Sub3_Sub1.anInt6147, i, Class201.anInt1545, cameraVrotation, (Perspective.getTileHeight(Class43.anInt377, ((AnimableEntity) Player.selfPlayer).localYPos, ((AnimableEntity) Player.selfPlayer).localXPos)) - 200);
				float f = 1.0F - ((float) ((100 + -i_2_) * ((-i_2_ + 100) * (100 - i_2_))) / 1000000.0F);
				GameWorld.cameraPitch = (int) ((float) (-RtMouseListener.anInt2494 + GameWorld.cameraPitch) * f + (float) RtMouseListener.anInt2494);
				Class98_Sub46_Sub10.renderX = (int) ((float) Class246_Sub3_Sub4_Sub2_Sub1.anInt6511 + (float) (-Class246_Sub3_Sub4_Sub2_Sub1.anInt6511 + Class98_Sub46_Sub10.renderX) * f);
				Class79.renderY = (int) ((float) Class363.anInt3095 + f * (float) (-Class363.anInt3095 + Class79.renderY));
				Class134.renderZ = (int) ((float) Class98_Sub50.anInt4292 + (float) (Class134.renderZ + -Class98_Sub50.anInt4292) * f);
				int i_5_ = -Class96.anInt801 + GameWorld.cameraYaw;
				do {
					if ((i_5_ ^ 0xffffffff) >= -8193) {
						if (i_5_ >= -8192)
							break;
						i_5_ += 16384;
						if (!client.aBoolean3553)
							break;
					}
					i_5_ -= 16384;
				} while (false);
				GameWorld.cameraYaw = (int) ((float) Class96.anInt801 + (float) i_5_ * f);
				GameWorld.cameraYaw &= 0x3fff;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dj.B(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method485(int i) {
		try {
			int i_6_ = Class2.anInt71;
			int i_7_ = 42 / ((i - -17) / 42);
			int[] is = Class319.anIntArray2705;
			for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
				Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[is[i_8_]]);
				if (class246_sub3_sub4_sub2_sub2 != null)
					Class98_Sub10_Sub10.method1038(class246_sub3_sub4_sub2_sub2, class246_sub3_sub4_sub2_sub2.getSize(), -12212);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dj.A(" + i + ')');
		}
	}

	static final OutgoingPacket method486(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool, int i_21_) {
		try {
			OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, Class254.aClass171_1940, Class331.aClass117_2811);
			//class98_sub11 = Class246_Sub3_Sub4.method3023(260, ha.aClass171_939, Class331.aClass117_2811);//steven
			//			((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865.writeShort(Class272.anInt2038 + toLocalX, 128);
			//			((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865.writeShort(aa_Sub2.anInt3562 + toLocalY, 128);
			((OutgoingPacket) class98_sub11).packet.writeShort(Class272.anInt2038 + i_20_);
			((OutgoingPacket) class98_sub11).packet.writeShort(aa_Sub2.anInt3562 + i_19_);
			((OutgoingPacket) class98_sub11).packet.writeByte(!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1);
			return class98_sub11;
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			return null;
		}
	}
}
