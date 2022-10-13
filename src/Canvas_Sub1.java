/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub1 extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7665093628592335222L;
	static int anInt23;
	private Component aComponent24;
	static float aFloat25;
	static int anInt26 = -1;

	Canvas_Sub1(Component component) {
		try {
			aComponent24 = component;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bn.<init>(" + (component != null ? "{...}" : "null") + ')');
		}
	}

	static final void method118(byte i) {
		try {
			if (Class177.anInt1376 == 7)
				Class98_Sub10_Sub1.exitToLobby(false, false);
			else {
				Class318.aClass123_2698 = aa_Sub1.aClass123_3561;
				aa_Sub1.aClass123_3561 = null;
				if (i == 104)
					Class61.method538(13, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bn.A(" + i + ')');
		}
	}

	static final void method119(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		do {
			try {
				if (i_4_ < (~i_5_) || i_0_ < 1 || GameWorld.size_x + -2 < i_5_ || -2 + GameWorld.size_y < i_0_)
					break;
				int i_8_ = i_3_;
				if (i_8_ < 3 && Class1.method162(i_0_, (byte) -88, i_5_))
					i_8_++;
				if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076.method564((byte) 122) != 0 || RenderAnimDefinitions.method3477(i_0_, i_8_, i_5_, Class115.anInt963, 55)) && (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null)) {
					Class146_Sub3.aClass305_Sub1_4952.method3590(i_0_, i_3_, Class265.aHa1974, Class167.aClass243Array1281[i_3_], 1, i_1_, i_5_);
					if (i < 0)
						break;
					int i_9_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038.method596((byte) 122);
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038));
					Class146_Sub3.aClass305_Sub1_4952.method3588(i, i_0_, i_6_, i_8_, false, i_5_, Class265.aHa1974, i_2_, i_7_, i_3_, Class167.aClass243Array1281[i_3_]);
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_9_, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("bn.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
			}
			break;
		} while (false);
	}

	public final void paint(Graphics graphics) {
		try {
			aComponent24.paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bn.paint(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	static final aa_Sub2 method120(int i, ha_Sub3 var_ha_Sub3, int i_10_, int[] is, int i_11_, int[] is_12_) {
		try {
			if (i_11_ <= 70)
				method119(108, -86, 41, 17, 85, 52, -105, 11, 108);
			if (!var_ha_Sub3.method1942(0, Class53_Sub1.aClass164_3633, Class162.aClass162_1266)) {
				int[] is_13_ = new int[i_10_ * i];
				for (int i_14_ = 0; i > i_14_; i_14_++) {
					int i_15_ = is[i_14_] + i_14_ * i_10_;
					for (int i_16_ = 0; i_16_ < is_12_[i_14_]; i_16_++)
						is_13_[i_15_++] = -16777216;
				}
				return new aa_Sub2(var_ha_Sub3, i_10_, i, is_13_);
			}
			byte[] is_17_ = new byte[i_10_ * i];
			for (int i_18_ = 0; i > i_18_; i_18_++) {
				int i_19_ = i_10_ * i_18_ + is[i_18_];
				for (int i_20_ = 0; is_12_[i_18_] > i_20_; i_20_++)
					is_17_[i_19_++] = (byte) -1;
			}
			return new aa_Sub2(var_ha_Sub3, i_10_, i, is_17_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bn.B(" + i + ',' + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i_10_ + ',' + (is != null ? "{...}" : "null") + ',' + i_11_ + ',' + (is_12_ != null ? "{...}" : "null") + ')'));
		}
	}

	public final void update(Graphics graphics) {
		try {
			aComponent24.update(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bn.update(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}
}
