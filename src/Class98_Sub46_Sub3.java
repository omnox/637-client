/* Class98_Sub46_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub3 extends Class98_Sub46 {
	static Class131[] aClass131Array5953 = new Class131[100];
	Class246_Sub3_Sub4_Sub3 aClass246_Sub3_Sub4_Sub3_5954;

	public static void method1540(boolean bool) {
		do {
			try {
				aClass131Array5953 = null;
				if (bool == false)
					break;
				method1540(true);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bv.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	Class98_Sub46_Sub3(Class246_Sub3_Sub4_Sub3 class246_sub3_sub4_sub3) {
		try {
			this.aClass246_Sub3_Sub4_Sub3_5954 = class246_sub3_sub4_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bv.<init>(" + (class246_sub3_sub4_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1541(int i) {
		do {
			try {
				int i_0_ = 256 + 512 * Class363.anInt3098;
				int i_1_ = Class98_Sub10_Sub21.anInt5643 * 512 + 256;
				int i_2_ = (Perspective.getTileHeight(Class43.anInt377, i_1_, i_0_) - Class308.anInt2580);
				do {
					if (Class263.anInt1967 >= 100) {
						Class134.renderZ = 256 + 512 * Class98_Sub10_Sub21.anInt5643;
						Class98_Sub46_Sub10.renderX = Class363.anInt3098 * 512 + 256;
						Class79.renderY = ((Perspective.getTileHeight(Class43.anInt377, Class134.renderZ, Class98_Sub46_Sub10.renderX)) - Class308.anInt2580);
						if (!client.aBoolean3553)
							break;
					}
					if (Class98_Sub46_Sub10.renderX < i_0_) {
						Class98_Sub46_Sub10.renderX += (Class98_Sub46_Sub2_Sub2.anInt6300 - -((-Class98_Sub46_Sub10.renderX + i_0_) * Class263.anInt1967 / 1000));
						if (i_0_ < Class98_Sub46_Sub10.renderX)
							Class98_Sub46_Sub10.renderX = i_0_;
					}
					if (i_0_ < Class98_Sub46_Sub10.renderX) {
						Class98_Sub46_Sub10.renderX -= (Class98_Sub46_Sub2_Sub2.anInt6300 + ((-i_0_ + Class98_Sub46_Sub10.renderX) * Class263.anInt1967 / 1000));
						if (Class98_Sub46_Sub10.renderX < i_0_)
							Class98_Sub46_Sub10.renderX = i_0_;
					}
					if (i_2_ > Class79.renderY) {
						Class79.renderY += ((-Class79.renderY + i_2_) * Class263.anInt1967 / 1000) + Class98_Sub46_Sub2_Sub2.anInt6300;
						if (Class79.renderY > i_2_)
							Class79.renderY = i_2_;
					}
					if (i_1_ > Class134.renderZ) {
						Class134.renderZ += ((Class263.anInt1967 * (i_1_ + -Class134.renderZ) / 1000) + Class98_Sub46_Sub2_Sub2.anInt6300);
						if (i_1_ < Class134.renderZ)
							Class134.renderZ = i_1_;
					}
					if (i_2_ < Class79.renderY) {
						Class79.renderY -= (Class98_Sub46_Sub2_Sub2.anInt6300 - -((Class79.renderY - i_2_) * Class263.anInt1967 / 1000));
						if (i_2_ > Class79.renderY)
							Class79.renderY = i_2_;
					}
					if (Class134.renderZ > i_1_) {
						Class134.renderZ -= (Class98_Sub46_Sub2_Sub2.anInt6300 + (Class263.anInt1967 * (-i_1_ + Class134.renderZ) / 1000));
						if (Class134.renderZ < i_1_)
							Class134.renderZ = i_1_;
					}
				} while (false);
				i_1_ = 512 * Class98_Sub15.anInt3915 + 256;
				i_0_ = 256 + 512 * Exception_Sub1.anInt44;
				i_2_ = (Perspective.getTileHeight(Class43.anInt377, i_1_, i_0_) - Class303.anInt2530);
				int i_3_ = -Class98_Sub46_Sub10.renderX + i_0_;
				int i_4_ = -Class79.renderY + i_2_;
				int i_5_ = -Class134.renderZ + i_1_;
				int i_6_ = (int) Math.sqrt(i_3_ * i_3_ - -(i_5_ * i_5_));
				int i_7_ = 0x3fff & (int) (Math.atan2(i_4_, i_6_) * 2607.5945876176133);
				int i_8_ = ((int) (-2607.5945876176133 * Math.atan2(i_3_, i_5_)) & 0x3fff);
				if (i_7_ < 1024)
					i_7_ = 1024;
				if (i_7_ > 3072)
					i_7_ = 3072;
				if (GameWorld.cameraPitch < i_7_) {
					GameWorld.cameraPitch += ((i_7_ - GameWorld.cameraPitch >> 3) * Class98_Sub4.anInt3828 / 1000 + Class98_Sub41.anInt4202) << 3;
					if (GameWorld.cameraPitch > i_7_)
						GameWorld.cameraPitch = i_7_;
				}
				if (GameWorld.cameraPitch > i_7_) {
					GameWorld.cameraPitch -= (Class98_Sub41.anInt4202 + (Class98_Sub4.anInt3828 * (-i_7_ + GameWorld.cameraPitch >> 3) / 1000)) << 3;
					if (i_7_ > GameWorld.cameraPitch)
						GameWorld.cameraPitch = i_7_;
				}
				int i_9_ = i_8_ + -GameWorld.cameraYaw;
				if (i_9_ > 8192)
					i_9_ -= 16384;
				if (i_9_ < -8192)
					i_9_ += 16384;
				i_9_ >>= 3;
				if (i_9_ > 0) {
					GameWorld.cameraYaw += (Class98_Sub4.anInt3828 * i_9_ / 1000 + Class98_Sub41.anInt4202) << 3;
					GameWorld.cameraYaw &= 0x3fff;
				}
				if (i_9_ < 0) {
					GameWorld.cameraYaw -= (Class98_Sub4.anInt3828 * -i_9_ / 1000 + Class98_Sub41.anInt4202) << 3;
					GameWorld.cameraYaw &= 0x3fff;
				}
				int i_10_ = -GameWorld.cameraYaw + i_8_;
				if (i > 69) {
					if (i_10_ > 8192)
						i_10_ -= 16384;
					if (i_10_ < -8192)
						i_10_ += 16384;
					Class308.anInt2584 = 0;
					if ((i_10_ >= 0 || i_9_ <= 0) && (i_10_ <= 0 || i_9_ >= 0))
						break;
					GameWorld.cameraYaw = i_8_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bv.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
