
/* ha_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

final class ha_Sub3_Sub2 extends ha_Sub3 {
	private OpenGL anOpenGL6111;
	private LinkedList aClass148_6112 = new LinkedList();
	private LinkedList aClass148_6113 = new LinkedList();
	private LinkedList aClass148_6114 = new LinkedList();
	private LinkedList aClass148_6115 = new LinkedList();
	private LinkedList aClass148_6116 = new LinkedList();
	private LinkedList aClass148_6117 = new LinkedList();
	private LinkedList aClass148_6118 = new LinkedList();
	private boolean aBoolean6119;
	private boolean aBoolean6120;
	private boolean aBoolean6121;
	private boolean aBoolean6122;
	private boolean aBoolean6123;
	private Class69_Sub2[] aClass69_Sub2Array6124 = new Class69_Sub2[16];
	MapBuffer aMapBuffer6125 = new MapBuffer();
	private int anInt6126;
	private long aLong6127;
	MapBuffer aMapBuffer6128 = new MapBuffer();
	private int anInt6129;
	private boolean aBoolean6130;
	private String aString6131;
	private int anInt6132 = 0;
	boolean aBoolean6133;
	boolean aBoolean6134;
	int anInt6135;
	boolean aBoolean6136;
	boolean aBoolean6137;
	private boolean aBoolean6138;
	int[] anIntArray6139;
	private String aString6140;

	final void method1994(byte i, int i_0_) {
		do {
			try {
				if (i >= 0)
					break;
				((ha_Sub3_Sub2) this).aBoolean6133 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.BA(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	final void GA(int i) {
		try {
			OpenGL.glClearColor((float) (i & 0xff0000) / 1.671168E7F, (float) (i & 0xff00) / 65280.0F, (float) (0xff & i) / 255.0F, (float) (i >>> -58636872) / 255.0F);
			OpenGL.glClear(16384);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.GA(" + i + ')');
		}
	}

	final void method2026(int i, boolean bool, byte i_1_, Class65 class65, boolean bool_2_) {
		try {
			if (i_1_ != 27)
				aString6140 = null;
			OpenGL.glTexEnvi(8960, 34176 + i, Class98_Sub12.method1128(class65, 36));
			if (bool)
				OpenGL.glTexEnvi(8960, i + 34192, !bool_2_ ? 770 : 771);
			else
				OpenGL.glTexEnvi(8960, i + 34192, !bool_2_ ? 768 : 769);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.KB(" + i + ',' + bool + ',' + i_1_ + ',' + (class65 != null ? "{...}" : "null") + ',' + bool_2_ + ')'));
		}
	}

	final void method2037(Class232 class232, int i, byte i_3_, int i_4_) {
		try {
			if (i_3_ > 8) {
				int i_5_;
				int i_6_;
				if (Class334.aClass232_3468 != class232) {
					if (class232 == Class287_Sub1.aClass232_3420) {
						i_5_ = 1 + i_4_;
						i_6_ = 3;
					} else if (class232 == Class336.aClass232_2822) {
						i_6_ = 4;
						i_5_ = i_4_ * 3;
					} else if (class232 == Class98_Sub46_Sub15.aClass232_6043) {
						i_5_ = i_4_ - -2;
						i_6_ = 6;
					} else if (Class97.aClass232_806 == class232) {
						i_5_ = i_4_ + 2;
						i_6_ = 5;
					} else {
						i_5_ = i_4_;
						i_6_ = 0;
					}
				} else {
					i_5_ = 2 * i_4_;
					i_6_ = 1;
				}
				OpenGL.glDrawArrays(i_6_, i, i_5_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.HB(" + (class232 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	private final void method2081(byte i) {
		try {
			if (aBoolean6120)
				OpenGL.glPopMatrix();
			int i_7_ = -109 / (-i / 51);
			if (((ha_Sub3) this).aClass204_4551.method2708(126)) {
				if (!aBoolean6122) {
					OpenGL.glLoadMatrixf((((ha_Sub3) this).aClass111_Sub3_4545.method2121((byte) -81, Class98_Sub30.aFloatArray4096)), 0);
					aBoolean6122 = true;
					method2065((byte) 80);
					method2035(-14713);
				}
				if (((ha_Sub3) this).aBoolean4540)
					aBoolean6120 = false;
				else {
					OpenGL.glPushMatrix();
					OpenGL.glMultMatrixf((((ha_Sub3) this).aClass111_Sub3_4542.method2121((byte) -80, Class98_Sub30.aFloatArray4096)), 0);
					aBoolean6120 = true;
				}
			} else if (!((ha_Sub3) this).aBoolean4540) {
				OpenGL.glLoadMatrixf((((ha_Sub3) this).aClass111_Sub3_4542.method2121((byte) -57, Class98_Sub30.aFloatArray4096)), 0);
				aBoolean6120 = false;
			} else {
				OpenGL.glLoadIdentity();
				aBoolean6120 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.N(" + i + ')');
		}
	}

	final void method2025(byte i) {
		try {
			int i_8_ = 93 % ((i - 69) / 53);
			if (!((ha_Sub3) this).aBoolean4555) {
				OpenGL.glDisable(16384);
				OpenGL.glDisable(16385);
			} else {
				OpenGL.glEnable(16384);
				OpenGL.glEnable(16385);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.QA(" + i + ')');
		}
	}

	final Class76 method2067(int i, byte i_9_) {
		try {
			int i_10_ = -112 / ((39 - i_9_) / 56);
			int i_11_ = i;
			while_98_: do {
				while_97_: do {
					do {
						if (i_11_ != 3) {
							if ((i_11_ ^ 0xffffffff) == -5)
								break;
							if ((i_11_ ^ 0xffffffff) != -9)
								break while_98_;
							if (!client.aBoolean3553)
								break while_97_;
						}
						return new Class76_Sub8(this, (((ha_Sub3) this).aClass207_4535));
					} while (false);
					return new Class76_Sub2(this, ((ha_Sub3) this).aClass207_4535, ((ha_Sub3) this).aClass195_4529);
				} while (false);
				return new Class76_Sub9(this, ((ha_Sub3) this).aClass207_4535, ((ha_Sub3) this).aClass195_4529);
			} while (false);
			return super.method2067(i, (byte) -112);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.CD(" + i + ',' + i_9_ + ')');
		}
	}

	final void method1746(int i, int i_12_, int i_13_, int i_14_) {
		/* empty */
	}

	final void method2009(int i) {
		try {
			OpenGL.glScissor(((ha_Sub3) this).anInt4578 + ((ha_Sub3) this).anInt4602, (-((ha_Sub3) this).anInt4638 + ((ha_Sub3) this).anInt4531 + ((ha_Sub3) this).anInt4622), ((ha_Sub3) this).anInt4575 - ((ha_Sub3) this).anInt4602, -((ha_Sub3) this).anInt4558 + ((ha_Sub3) this).anInt4638);
			if (i != 28976)
				method1974(-60);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.V(" + i + ')');
		}
	}

	final void F(int i, int i_15_) {
		/* empty */
	}

	final void method2007(boolean bool) {
		try {
			((ha_Sub3) this).aFloat4592 = (float) (-((ha_Sub3) this).anInt4601 + ((ha_Sub3) this).anInt4605);
			((ha_Sub3) this).aFloat4615 = ((float) -((ha_Sub3) this).anInt4581 + ((ha_Sub3) this).aFloat4592);
			if (bool != false)
				method1972(58);
			if (((ha_Sub3) this).aFloat4615 < (float) ((ha_Sub3) this).anInt4640)
				((ha_Sub3) this).aFloat4615 = (float) ((ha_Sub3) this).anInt4640;
			OpenGL.glFogf(2915, ((ha_Sub3) this).aFloat4615);
			OpenGL.glFogf(2916, ((ha_Sub3) this).aFloat4592);
			Class98_Sub39.aFloatArray4189[2] = ((float) Class202.method2702(((ha_Sub3) this).anInt4636, 255) / 255.0F);
			Class98_Sub39.aFloatArray4189[0] = ((float) Class202.method2702(16711680, ((ha_Sub3) this).anInt4636) / 1.671168E7F);
			Class98_Sub39.aFloatArray4189[1] = ((float) Class202.method2702(65280, ((ha_Sub3) this).anInt4636) / 65280.0F);
			OpenGL.glFogfv(2918, Class98_Sub39.aFloatArray4189, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.S(" + bool + ')');
		}
	}

	final Object method2058(Canvas canvas, int i) {
		try {
			if (i != -8401)
				anInt6126 = -114;
			long l = anOpenGL6111.prepareSurface(canvas);
			if (l == -1L)
				throw new RuntimeException();
			return new Long(l);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.EB(" + (canvas != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int I() {
		try {
			return anInt6132;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.I(" + ')');
		}
	}

	final void b(int i, int i_16_, int i_17_, int i_18_, double d) {
		/* empty */
	}

	final synchronized void method2082(int i, long l) {
		try {
			if (i != 0)
				aClass148_6112 = null;
			Node class98 = new Node();
			((Node) class98).uid = l;
			aClass148_6118.add_last(class98, -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.AA(" + i + ',' + l + ')');
		}
	}

	final void method2030(byte i) {
		do {
			try {
				do {
					if (!((ha_Sub3) this).aBoolean4672) {
						OpenGL.glDisable(3089);
						if (!client.aBoolean3553)
							break;
					}
					OpenGL.glEnable(3089);
				} while (false);
				if (i == -122)
					break;
				method2007(true);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.MC(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1999(byte i) {
		try {
			do {
				if (((ha_Sub3) this).aBoolean4571 && ((ha_Sub3) this).aBoolean4562 && (((ha_Sub3) this).anInt4581 ^ 0xffffffff) <= -1) {
					OpenGL.glEnable(2912);
					if (!client.aBoolean3553)
						break;
				}
				OpenGL.glDisable(2912);
			} while (false);
			if (i != 112)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.WB(" + i + ')');
		}
	}

	final void method2036(int i) {
		try {
			if (i != -11155)
				aBoolean6123 = false;
			OpenGL.glViewport(((ha_Sub3) this).anInt4578, ((ha_Sub3) this).anInt4622, ((ha_Sub3) this).anInt4527, ((ha_Sub3) this).anInt4531);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.JB(" + i + ')');
		}
	}

	final void method2016(byte i) {
		try {
			if (((ha_Sub3) this).aClass126_4625 == Class101.aClass126_848)
				OpenGL.glBlendFunc(770, 771);
			else if (Class373_Sub1_Sub1.aClass126_6216 == ((ha_Sub3) this).aClass126_4625)
				OpenGL.glBlendFunc(1, 1);
			else if (Class83.aClass126_632 == ((ha_Sub3) this).aClass126_4625)
				OpenGL.glBlendFunc(774, 1);
			if (i >= -109)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.LA(" + i + ')');
		}
	}

	final void method2059(boolean bool, boolean bool_19_) {
		do {
			try {
				do {
					if (bool) {
						OpenGL.glEnable(32925);
						if (!client.aBoolean3553)
							break;
					}
					OpenGL.glDisable(32925);
				} while (false);
				if (bool_19_ == false)
					break;
				method1806(86);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("hl.FD(" + bool + ',' + bool_19_ + ')'));
			}
			break;
		} while (false);
	}

	final Class62 method1799() {
		try {
			int i = -1;
			if (aString6140.indexOf("nvidia") == -1) {
				if ((aString6140.indexOf("intel") ^ 0xffffffff) != 0)
					i = 32902;
				else if ((aString6140.indexOf("ati") ^ 0xffffffff) != 0)
					i = 4098;
			} else
				i = 4318;
			return new Class62(i, "OpenGL", anInt6129, aString6131, 0L);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.RB(" + ')');
		}
	}

	final void method1764(int i, int i_20_) throws Exception_Sub1 {
		try {
			anOpenGL6111.swapBuffers();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.BB(" + i + ',' + i_20_ + ')');
		}
	}

	final void method1791(float f, float f_21_, float f_22_) {
		/* empty */
	}

	final void method2033(int i) {
		try {
			do {
				if (((ha_Sub3) this).aBoolean4560) {
					OpenGL.glEnable(3042);
					if (!client.aBoolean3553)
						break;
				}
				OpenGL.glDisable(3042);
			} while (false);
			int i_23_ = -123 % ((-43 - i) / 34);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.IA(" + i + ')');
		}
	}

	final int[] na(int i, int i_24_, int i_25_, int i_26_) {
		try {
			int[] is = new int[i_25_ * i_26_];
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
				OpenGL.glReadPixelsi(i, (-i_27_ + ((ha_Sub3) this).anInt4531 + -i_24_ + -1), i_25_, 1, 32993, ((ha_Sub3_Sub2) this).anInt6135, is, i_27_ * i_25_);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.na(" + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	final synchronized void method1806(int i) {
		try {
			i &= 0x7fffffff;
			int i_28_ = 0;
			while (!aClass148_6113.method2420(-126)) {
				Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6113.method2421(6494);
				RenderAnimDefinitions.anIntArray2408[i_28_++] = (int) ((Node) class98_sub34).uid;
				((ha_Sub3) this).anInt4538 -= ((Class98_Sub34) class98_sub34).anInt4126;
				if (i_28_ == 1000) {
					OpenGL.glDeleteBuffersARB(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if ((i_28_ ^ 0xffffffff) < -1) {
				OpenGL.glDeleteBuffersARB(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
				i_28_ = 0;
			}
			while (!aClass148_6114.method2420(-125)) {
				Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6114.method2421(6494);
				RenderAnimDefinitions.anIntArray2408[i_28_++] = (int) ((Node) class98_sub34).uid;
				((ha_Sub3) this).anInt4541 -= ((Class98_Sub34) class98_sub34).anInt4126;
				if (i_28_ == 1000) {
					OpenGL.glDeleteTextures(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if (i_28_ > 0) {
				OpenGL.glDeleteTextures(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
				i_28_ = 0;
			}
			while (!aClass148_6115.method2420(-125)) {
				Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6115.method2421(6494);
				RenderAnimDefinitions.anIntArray2408[i_28_++] = ((Class98_Sub34) class98_sub34).anInt4126;
				if ((i_28_ ^ 0xffffffff) == -1001) {
					OpenGL.glDeleteFramebuffersEXT(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if (i_28_ > 0) {
				OpenGL.glDeleteFramebuffersEXT(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
				i_28_ = 0;
			}
			while (!aClass148_6116.method2420(-124)) {
				Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6116.method2421(6494);
				RenderAnimDefinitions.anIntArray2408[i_28_++] = (int) ((Node) class98_sub34).uid;
				((ha_Sub3) this).anInt4539 -= ((Class98_Sub34) class98_sub34).anInt4126;
				if (i_28_ == 1000) {
					OpenGL.glDeleteRenderbuffersEXT(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if ((i_28_ ^ 0xffffffff) < -1) {
				OpenGL.glDeleteRenderbuffersEXT(i_28_, RenderAnimDefinitions.anIntArray2408, 0);
				boolean bool = false;
			}
			while (!aClass148_6112.method2420(-127)) {
				Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6112.method2421(6494);
				OpenGL.glDeleteLists((int) ((Node) class98_sub34).uid, (((Class98_Sub34) class98_sub34).anInt4126));
			}
			while (!aClass148_6117.method2420(-128)) {
				Node class98 = aClass148_6117.method2421(6494);
				OpenGL.glDeleteProgramARB((int) ((Node) class98).uid);
			}
			while (!aClass148_6118.method2420(-125)) {
				Node class98 = aClass148_6118.method2421(6494);
				OpenGL.glDeleteObjectARB(((Node) class98).uid);
			}
			while (!aClass148_6112.method2420(-125)) {
				Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6112.method2421(6494);
				OpenGL.glDeleteLists((int) ((Node) class98_sub34).uid, (((Class98_Sub34) class98_sub34).anInt4126));
			}
			if (this.E() > 100663296 && aLong6127 - -60000L < Class343.method3819(-47)) {
				System.gc();
				aLong6127 = Class343.method3819(-47);
			}
			super.method1806(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.UB(" + i + ')');
		}
	}

	final void method1955(int i) {
		do {
			try {
				do {
					if (!((ha_Sub3) this).aBoolean4643 || ((ha_Sub3) this).aBoolean4637) {
						OpenGL.glDisable(2896);
						if (!client.aBoolean3553)
							break;
					}
					OpenGL.glEnable(2896);
				} while (false);
				if (i == -5668)
					break;
				method2030((byte) -122);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.AC(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1966(byte i) {
		try {
			int i_29_ = 70 / ((-6 - i) / 34);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(((ha_Sub3) this).aFloatArray4566, 0);
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.LC(" + i + ')');
		}
	}

	final Interface2_Impl1 method2060(boolean bool, int i) {
		try {
			if (i < 40)
				return null;
			return new Class69_Sub2(this, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.AD(" + bool + ',' + i + ')');
		}
	}

	final Interface2_Impl2 method1990(byte i, boolean bool) {
		try {
			if (i != 84)
				aClass69_Sub2Array6124 = null;
			return new Class69_Sub1(this, Class162.aClass162_1267, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.KD(" + i + ',' + bool + ')');
		}
	}

	final void method1825() {
		try {
			OpenGL.glFinish();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.TC(" + ')');
		}
	}

	final void a(Rectangle[] rectangles, int i, int i_30_, int i_31_) throws Exception_Sub1 {
		try {
			method1764(i_30_, i_31_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.DD(" + (rectangles != null ? "{...}" : "null") + ',' + i + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	final void method1761(boolean bool) {
		/* empty */
	}

	final Interface13 method1744(int i, int i_32_) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.SB(" + i + ',' + i_32_ + ')');
		}
	}

	final boolean method1942(int i, Class164 class164, Class162 class162) {
		try {
			if (i != 0)
				method1988(null, null, 89);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.CC(" + i + ',' + (class164 != null ? "{...}" : "null") + ',' + (class162 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1972(int i) {
		do {
			try {
				OpenGL.glDepthMask(((ha_Sub3) this).aBoolean4606 && ((ha_Sub3) this).aBoolean4620);
				if (i == 0)
					break;
				((ha_Sub3_Sub2) this).aMapBuffer6125 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.DB(" + i + ')');
			}
			break;
		} while (false);
	}

	final synchronized void method2083(int i, int i_33_, int i_34_) {
		try {
			Class98_Sub34 class98_sub34 = new Class98_Sub34(i_34_);
			((Node) class98_sub34).uid = (long) i_33_;
			if (i <= -4)
				aClass148_6114.add_last(class98_sub34, -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.CA(" + i + ',' + i_33_ + ',' + i_34_ + ')'));
		}
	}

	final void method1983(byte i) {
		try {
			method2081((byte) -89);
			int i_35_ = 121 / ((26 - i) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.PB(" + i + ')');
		}
	}

	final void method2047(int i, boolean bool, byte i_36_, Class65 class65) {
		do {
			try {
				OpenGL.glTexEnvi(8960, i + 34184, Class98_Sub12.method1128(class65, 97));
				OpenGL.glTexEnvi(8960, 34200 - -i, bool ? 771 : 770);
				if (i_36_ == -42)
					break;
				aBoolean6138 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("hl.B(" + i + ',' + bool + ',' + i_36_ + ',' + (class65 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Interface4_Impl2 method2063(int i, byte i_37_, int[] is, boolean bool, int i_38_, int i_39_, int i_40_) {
		try {
			int i_41_ = -10 % ((60 - i_37_) / 58);
			if (!aBoolean6130 && (!Class81.method815(i_38_, 0) || !Class81.method815(i_39_, 0))) {
				if (!aBoolean6138) {
					Class21_Sub1 class21_sub1 = new Class21_Sub1(this, Class62.aClass164_486, Class162.aClass162_1266, Class48.method453(423660257, i_38_), Class48.method453(423660257, i_39_));
					class21_sub1.method49(17779, 0, i_39_, is, 0, i, i_40_, i_38_);
					return class21_sub1;
				}
				return new Class21_Sub3(this, i_38_, i_39_, is, i, i_40_);
			}
			return new Class21_Sub1(this, i_38_, i_39_, bool, is, i, i_40_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.QB(" + i + ',' + i_37_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ')'));
		}
	}

	final void method1776() {
		/* empty */
	}

	final void method2046(int i) {
		do {
			try {
				do {
					if (((ha_Sub3) this).aBoolean4599) {
						OpenGL.glEnable(3008);
						if (!client.aBoolean3553)
							break;
					}
					OpenGL.glDisable(3008);
				} while (false);
				if (i == 0)
					break;
				aClass148_6117 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.TA(" + i + ')');
			}
			break;
		} while (false);
	}

	final Interface5 method1813(int i, int i_42_) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.GD(" + i + ',' + i_42_ + ')');
		}
	}

	final Interface4_Impl2 method2032(byte[] is, boolean bool, Class164 class164, int i, int i_43_, boolean bool_44_, int i_45_, int i_46_) {
		try {
			if (bool != false)
				anInt6132 = -43;
			if (aBoolean6130 || Class81.method815(i_46_, 0) && Class81.method815(i_43_, 0))
				return new Class21_Sub1(this, class164, i_46_, i_43_, bool_44_, is, i_45_, i);
			if (!aBoolean6138) {
				Class21_Sub1 class21_sub1 = new Class21_Sub1(this, class164, Class162.aClass162_1266, Class48.method453(423660257, i_46_), Class48.method453(423660257, i_43_));
				class21_sub1.method41(i, i_45_, i_46_, 0, i_43_, -26946, is, class164, 0);
				return class21_sub1;
			}
			return new Class21_Sub3(this, class164, i_46_, i_43_, is, i_45_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.FC(" + (is != null ? "{...}" : "null") + ',' + bool + ',' + (class164 != null ? "{...}" : "null") + ',' + i + ',' + i_43_ + ',' + bool_44_ + ',' + i_45_ + ',' + i_46_ + ')'));
		}
	}

	final void method1974(int i) {
		try {
			if (i == 0) {
				if (!((ha_Sub3) this).aBoolean4577)
					OpenGL.glDisable(2929);
				else
					OpenGL.glEnable(2929);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.PA(" + i + ')');
		}
	}

	final Interface4_Impl1 method2044(int i, Class164 class164, byte[] is, int i_47_, int i_48_, int i_49_) {
		try {
			int i_50_ = -56 / ((i - 49) / 38);
			return new Class21_Sub4(this, class164, i_47_, i_48_, i_49_, is);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.OB(" + i + ',' + (class164 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	final void method1814() {
		/* empty */
	}

	final void method1964(Class38 class38, byte i) {
		do {
			try {
				if (i != 26)
					aBoolean6130 = false;
				if (class38 == r_Sub2.aClass38_6334) {
					OpenGL.glDisable(3168);
					OpenGL.glDisable(3169);
					OpenGL.glDisable(3170);
					if (!client.aBoolean3553)
						break;
				}
				int i_51_ = Class323.method3678((byte) 115, class38);
				OpenGL.glTexGeni(8192, 9472, i_51_);
				OpenGL.glEnable(3168);
				OpenGL.glTexGeni(8193, 9472, i_51_);
				OpenGL.glEnable(3169);
				OpenGL.glTexGeni(8194, 9472, i_51_);
				OpenGL.glEnable(3170);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("hl.ND(" + (class38 != null ? "{...}" : "null") + ',' + i + ')'));
			}
		} while (false);
	}

	final void method2042(Class256 class256, byte i) {
		try {
			int i_52_ = -90 % ((-4 - i) / 48);
			Class49[] class49s = ((Class256_Sub1) (Class256_Sub1) class256).aClass49Array5159;
			int i_53_ = 0;
			boolean bool = false;
			boolean bool_54_ = false;
			boolean bool_55_ = false;
			for (int i_56_ = 0; (class49s.length ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
				Class49 class49 = class49s[i_56_];
				Class69_Sub2 class69_sub2 = aClass69_Sub2Array6124[i_56_];
				int i_57_ = 0;
				int i_58_ = class69_sub2.method704((byte) -22);
				long l = class69_sub2.method695(-30277);
				class69_sub2.method698(18569);
				for (int i_59_ = 0; class49.method480((byte) -99) > i_59_; i_59_++) {
					Class169 class169 = class49.method479(i_59_, (byte) -122);
					if (class169 != Class169.aClass169_1294) {
						if (class169 == Class169.aClass169_1297) {
							bool_54_ = true;
							OpenGL.glNormalPointer(5126, i_58_, l - -(long) i_57_);
						} else if (Class169.aClass169_1298 == class169) {
							bool = true;
							OpenGL.glColorPointer(4, 5121, i_58_, l + (long) i_57_);
						} else if (Class169.aClass169_1299 == class169) {
							OpenGL.glClientActiveTexture(i_53_++ + 33984);
							OpenGL.glTexCoordPointer(1, 5126, i_58_, l - -(long) i_57_);
						} else if (Class169.aClass169_1301 == class169) {
							OpenGL.glClientActiveTexture(33984 + i_53_++);
							OpenGL.glTexCoordPointer(2, 5126, i_58_, l - -(long) i_57_);
						} else if (class169 != Class169.aClass169_1302) {
							if (class169 == Class169.aClass169_1303) {
								OpenGL.glClientActiveTexture(33984 + i_53_++);
								OpenGL.glTexCoordPointer(4, 5126, i_58_, (long) i_57_ + l);
							}
						} else {
							OpenGL.glClientActiveTexture(33984 - -i_53_++);
							OpenGL.glTexCoordPointer(3, 5126, i_58_, l - -(long) i_57_);
						}
					} else {
						bool_55_ = true;
						OpenGL.glVertexPointer(3, 5126, i_58_, l + (long) i_57_);
					}
					i_57_ += ((Class169) class169).anInt1295;
				}
			}
			if (bool_55_ != aBoolean6121) {
				if (!bool_55_)
					OpenGL.glDisableClientState(32884);
				else
					OpenGL.glEnableClientState(32884);
				aBoolean6121 = bool_55_;
			}
			if (!aBoolean6123 != !bool_54_) {
				if (bool_54_)
					OpenGL.glEnableClientState(32885);
				else
					OpenGL.glDisableClientState(32885);
				aBoolean6123 = bool_54_;
			}
			if (aBoolean6119 == !bool) {
				if (!bool)
					OpenGL.glDisableClientState(32886);
				else
					OpenGL.glEnableClientState(32886);
				aBoolean6119 = bool;
			}
			if ((anInt6126 ^ 0xffffffff) <= (i_53_ ^ 0xffffffff)) {
				if (anInt6126 > i_53_) {
					for (int i_60_ = i_53_; i_60_ < anInt6126; i_60_++) {
						OpenGL.glClientActiveTexture(33984 - -i_60_);
						OpenGL.glDisableClientState(32888);
					}
					anInt6126 = i_53_;
				}
			} else {
				for (int i_61_ = anInt6126; (i_61_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff); i_61_++) {
					OpenGL.glClientActiveTexture(i_61_ + 33984);
					OpenGL.glEnableClientState(32888);
				}
				anInt6126 = i_53_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.JD(" + (class256 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method1958(byte i) {
		do {
			try {
				OpenGL.glTexEnvi(8960, 34162, Class5.method178((((ha_Sub3) this).aClass128Array4639[(((ha_Sub3) this).anInt4579)]), 0));
				if (i == -48)
					break;
				method2065((byte) -18);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.KC(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1817() {
		try {
			if ((((ha_Sub3) this).anInt4527 ^ 0xffffffff) < -1 || ((ha_Sub3) this).anInt4531 > 0) {
				int i = ((ha_Sub3) this).anInt4602;
				int i_62_ = ((ha_Sub3) this).anInt4575;
				int i_63_ = ((ha_Sub3) this).anInt4558;
				int i_64_ = ((ha_Sub3) this).anInt4638;
				this.la();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				this.method1992((byte) 125);
				this.method2028(false, (byte) -101);
				this.method1979(false, -60);
				this.method2013(false, 2103);
				this.method1997(0, false);
				this.method2005(null, 127);
				this.method2039(false, 0, -2, false);
				this.method2015(1, (byte) -120);
				this.method2001(0, 79);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, ((ha_Sub3) this).anInt4527, ((ha_Sub3) this).anInt4531, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				this.KA(i, i_63_, i_62_, i_64_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.O(" + ')');
		}
	}

	final void method1973(Class232 class232, int i, int i_65_, int i_66_, Interface2_Impl2 interface2_impl2, int i_67_, int i_68_) {
		try {
			if (i_66_ == 26810) {
				int i_69_;
				int i_70_;
				if (Class334.aClass232_3468 == class232) {
					i_70_ = i_68_ * 2;
					i_69_ = 1;
				} else if (Class287_Sub1.aClass232_3420 != class232) {
					if (Class336.aClass232_2822 == class232) {
						i_69_ = 4;
						i_70_ = i_68_ * 3;
					} else if (Class98_Sub46_Sub15.aClass232_6043 == class232) {
						i_69_ = 6;
						i_70_ = 2 + i_68_;
					} else if (Class97.aClass232_806 == class232) {
						i_69_ = 5;
						i_70_ = 2 + i_68_;
					} else {
						i_70_ = i_68_;
						i_69_ = 0;
					}
				} else {
					i_70_ = i_68_ + 1;
					i_69_ = 3;
				}
				Class162 class162 = interface2_impl2.method77(-15448);
				Class69_Sub1 class69_sub1 = (Class69_Sub1) interface2_impl2;
				class69_sub1.method698(18569);
				OpenGL.glDrawElements(i_69_, i_70_, Class98_Sub5_Sub1.method964(class162, (byte) 105), (class69_sub1.method695(-30277) - -(long) (i_65_ * (((Class162) class162).anInt1263))));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.SD(" + (class232 != null ? "{...}" : "null") + ',' + i + ',' + i_65_ + ',' + i_66_ + ',' + (interface2_impl2 != null ? "{...}" : "null") + ',' + i_67_ + ',' + i_68_ + ')'));
		}
	}

	final Class48 method1769(Class48 class48, Class48 class48_71_, float f, Class48 class48_72_) {
		try {
			if (!(f < 0.5F))
				return class48_71_;
			return class48;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.UC(" + (class48 != null ? "{...}" : "null") + ',' + (class48_71_ != null ? "{...}" : "null") + ',' + f + ',' + (class48_72_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2011(int i) {
		do {
			try {
				OpenGL.glTexEnvi(8960, 34161, Class5.method178((((ha_Sub3) this).aClass128Array4585[(((ha_Sub3) this).anInt4579)]), 0));
				if (i == 2)
					break;
				GA(-98);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.GB(" + i + ')');
			}
			break;
		} while (false);
	}

	final Interface4_Impl2 method1968(int i, int i_73_, boolean bool, Class164 class164, int i_74_, int i_75_, int i_76_, float[] fs) {
		try {
			int i_77_ = -104 % ((i_74_ - 57) / 33);
			if (aBoolean6130 || Class81.method815(i_73_, 0) && Class81.method815(i_75_, 0))
				return new Class21_Sub1(this, class164, i_73_, i_75_, bool, fs, i, i_76_);
			if (aBoolean6138)
				return new Class21_Sub3(this, class164, i_73_, i_75_, fs, i, i_76_);
			Class21_Sub1 class21_sub1 = new Class21_Sub1(this, class164, Class162.aClass162_1270, Class48.method453(423660257, i_73_), Class48.method453(423660257, i_75_));
			class21_sub1.method267(fs, class164, i_75_, i_73_, (byte) 111, 0, i_76_, 0, i);
			return class21_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.HC(" + i + ',' + i_73_ + ',' + bool + ',' + (class164 != null ? "{...}" : "null") + ',' + i_74_ + ',' + i_75_ + ',' + i_76_ + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2057(int i) {
		try {
			Class98_Sub39.aFloatArray4189[2] = ((float) Class202.method2702(((ha_Sub3) this).anInt4648, 255) / 255.0F);
			Class98_Sub39.aFloatArray4189[1] = ((float) Class202.method2702(65280, ((ha_Sub3) this).anInt4648) / 65280.0F);
			if (i != 12362)
				aLong6127 = 41L;
			Class98_Sub39.aFloatArray4189[0] = ((float) Class202.method2702(16711680, ((ha_Sub3) this).anInt4648) / 1.671168E7F);
			Class98_Sub39.aFloatArray4189[3] = (float) (((ha_Sub3) this).anInt4648 >>> 1318505624) / 255.0F;
			OpenGL.glTexEnvfv(8960, 8705, Class98_Sub39.aFloatArray4189, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.TB(" + i + ')');
		}
	}

	final Class256 method1982(Class49[] class49s, int i) {
		try {
			if (i != 6)
				method2036(59);
			return new Class256_Sub1(class49s);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.RC(" + (class49s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method1950(byte i) {
		try {
			int i_78_ = 50 % ((-49 - i) / 47);
			OpenGL.glActiveTexture(((ha_Sub3) this).anInt4579 + 33984);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.IB(" + i + ')');
		}
	}

	final void method2004(byte i) {
		do {
			try {
				Class98_Sub39.aFloatArray4189[1] = (((ha_Sub3) this).aFloat4549 * ((ha_Sub3) this).aFloat4630);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				Class98_Sub39.aFloatArray4189[0] = (((ha_Sub3) this).aFloat4630 * ((ha_Sub3) this).aFloat4611);
				Class98_Sub39.aFloatArray4189[2] = (((ha_Sub3) this).aFloat4630 * ((ha_Sub3) this).aFloat4591);
				OpenGL.glLightfv(16384, 4609, Class98_Sub39.aFloatArray4189, 0);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				Class98_Sub39.aFloatArray4189[1] = (-((ha_Sub3) this).aFloat4594 * ((ha_Sub3) this).aFloat4549);
				Class98_Sub39.aFloatArray4189[2] = (-((ha_Sub3) this).aFloat4594 * ((ha_Sub3) this).aFloat4591);
				Class98_Sub39.aFloatArray4189[0] = (((ha_Sub3) this).aFloat4611 * -((ha_Sub3) this).aFloat4594);
				OpenGL.glLightfv(16385, 4609, Class98_Sub39.aFloatArray4189, 0);
				if (i <= -98)
					break;
				aBoolean6138 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.QC(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1936(int i, Object object, Canvas canvas) {
		try {
			if (i != 0)
				aBoolean6120 = false;
			Long var_long = (Long) object;
			anOpenGL6111.releaseSurface(canvas, var_long.longValue());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.JC(" + i + ',' + (object != null ? "{...}" : "null") + ',' + (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2021(int i) {
		try {
			if (i != 0)
				method2021(-94);
			aBoolean6122 = false;
			method2081((byte) 119);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.G(" + i + ')');
		}
	}

	final void method2065(byte i) {
		try {
			OpenGL.glLightfv(16384, 4611, ((ha_Sub3) this).aFloatArray4596, 0);
			if (i == 80)
				OpenGL.glLightfv(16385, 4611, ((ha_Sub3) this).aFloatArray4572, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.LB(" + i + ')');
		}
	}

	final void method1959(int i) {
		do {
			try {
				int i_79_ = (((ha_Sub3_Sub2) this).anIntArray6139[((ha_Sub3) this).anInt4579]);
				if (i_79_ == i)
					break;
				((ha_Sub3_Sub2) this).anIntArray6139[(((ha_Sub3) this).anInt4579)] = 0;
				OpenGL.glBindTexture(i_79_, 0);
				OpenGL.glDisable(i_79_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.MD(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1740(Interface17 interface17) {
		/* empty */
	}

	final synchronized void method2084(int i, int i_80_, int i_81_) {
		try {
			if (i != 1)
				method1746(-36, 50, 45, 78);
			Class98_Sub34 class98_sub34 = new Class98_Sub34(i_80_);
			((Node) class98_sub34).uid = (long) i_81_;
			aClass148_6113.add_last(class98_sub34, -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.FA(" + i + ',' + i_80_ + ',' + i_81_ + ')'));
		}
	}

	final void method1989(int i) {
		try {
			int i_82_ = 35 / ((i - -16) / 50);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.J(" + i + ')');
		}
	}

	final void ya() {
		try {
			this.method1997(0, true);
			OpenGL.glClear(256);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.ya(" + ')');
		}
	}

	ha_Sub3_Sub2(OpenGL opengl, Canvas canvas, long l, d var_d, RuneScapeCache class207, int i) {
		super(canvas, new Long(l), var_d, class207, i, 1);
		try {
			try {
				anOpenGL6111 = opengl;
				anOpenGL6111.b();
				aString6140 = OpenGL.glGetString(7936).toLowerCase();
				aString6131 = OpenGL.glGetString(7937).toLowerCase();
				if ((aString6140.indexOf("microsoft") ^ 0xffffffff) != 0 || aString6140.indexOf("brian paul") != -1 || aString6140.indexOf("mesa") != -1)
					throw new RuntimeException("");
				String string = OpenGL.glGetString(7938);
				String[] strings = Class112.method2142(string.replace('.', ' '), ' ', false);
				if ((strings.length ^ 0xffffffff) <= -3) {
					try {
						int i_83_ = PacketSender.method3607(-52, strings[0]);
						int i_84_ = PacketSender.method3607(73, strings[1]);
						anInt6129 = i_84_ + 10 * i_83_;
					} catch (NumberFormatException numberformatexception) {
						throw new RuntimeException("");
					}
				} else
					throw new RuntimeException("");
				if ((anInt6129 ^ 0xffffffff) > -13)
					throw new RuntimeException("");
				if (!anOpenGL6111.a("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!anOpenGL6111.a("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
				int[] is = new int[1];
				OpenGL.glGetIntegerv(34018, is, 0);
				((ha_Sub3) this).anInt4608 = is[0];
				if (((ha_Sub3) this).anInt4608 < 2)
					throw new RuntimeException("");
				((ha_Sub3) this).anInt4565 = 8;
				((ha_Sub3_Sub2) this).aBoolean6137 = anOpenGL6111.a("GL_ARB_vertex_buffer_object");
				((ha_Sub3) this).aBoolean4559 = anOpenGL6111.a("GL_ARB_multisample");
				aBoolean6138 = anOpenGL6111.a("GL_ARB_texture_rectangle");
				((ha_Sub3) this).aBoolean4569 = anOpenGL6111.a("GL_ARB_texture_cube_map");
				aBoolean6130 = anOpenGL6111.a("GL_ARB_texture_non_power_of_two");
				((ha_Sub3) this).aBoolean4588 = anOpenGL6111.a("GL_EXT_texture3D");
				((ha_Sub3_Sub2) this).aBoolean6133 = anOpenGL6111.a("GL_ARB_vertex_shader");
				((ha_Sub3_Sub2) this).aBoolean6134 = anOpenGL6111.a("GL_ARB_vertex_program");
				((ha_Sub3_Sub2) this).aBoolean6136 = anOpenGL6111.a("GL_ARB_fragment_shader");
				anOpenGL6111.a("GL_ARB_fragment_program");
				((ha_Sub3_Sub2) this).anIntArray6139 = new int[((ha_Sub3) this).anInt4608];
				((ha_Sub3_Sub2) this).anInt6135 = !Stream.a() ? 5121 : 33639;
				if (aString6131.indexOf("radeon") != -1) {
					int i_85_ = 0;
					boolean bool = false;
					boolean bool_86_ = false;
					String[] strings_87_ = Class112.method2142(aString6131.replace('/', ' '), ' ', false);
					for (int i_88_ = 0; strings_87_.length > i_88_; i_88_++) {
						String string_89_ = strings_87_[i_88_];
						try {
							if (string_89_.length() > 0) {
								if (string_89_.charAt(0) == 'x' && (string_89_.length() ^ 0xffffffff) <= -4 && (Class77_Sub1.method781((byte) 53, string_89_.substring(1, 3)))) {
									string_89_ = string_89_.substring(1);
									bool_86_ = true;
								}
								if (string_89_.equals("hd"))
									bool = true;
								else {
									if (string_89_.startsWith("hd")) {
										string_89_ = string_89_.substring(2);
										bool = true;
									}
									if (((string_89_.length() ^ 0xffffffff) <= -5) && (Class77_Sub1.method781((byte) 53, string_89_.substring(0, 4)))) {
										i_85_ = (PacketSender.method3607(87, string_89_.substring(0, 4)));
										break;
									}
								}
							}
						} catch (Exception exception) {
							/* empty */
						}
					}
					if (!bool_86_ && !bool) {
						if (i_85_ >= 7000 && i_85_ <= 7999)
							((ha_Sub3_Sub2) this).aBoolean6137 = false;
						if (i_85_ >= 7000 && i_85_ <= 9250)
							((ha_Sub3) this).aBoolean4588 = false;
					}
					aBoolean6138 &= anOpenGL6111.a("GL_ARB_half_float_pixel");
				}
				aString6140.indexOf("intel");
				if (((ha_Sub3_Sub2) this).aBoolean6137) {
					try {
						int[] is_90_ = new int[1];
						OpenGL.glGenBuffersARB(1, is_90_, 0);
					} catch (Throwable throwable) {
						throw new RuntimeException("");
					}
				}
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				this.method1743(-1);
				throw new RuntimeException("");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.<init>(" + (opengl != null ? "{...}" : "null") + ',' + (canvas != null ? "{...}" : "null") + ',' + l + ',' + (var_d != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Interface17 method1815(Interface5 interface5, Interface13 interface13) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.EC(" + (interface5 != null ? "{...}" : "null") + ',' + (interface13 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1977(Class162 class162, boolean bool, Class164 class164) {
		try {
			if (bool != true)
				anInt6132 = -89;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.BD(" + (class162 != null ? "{...}" : "null") + ',' + bool + ',' + (class164 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1802() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.FB(" + ')');
		}
	}

	final void method1991(int i) {
		try {
			Class98_Sub39.aFloatArray4189[2] = ((ha_Sub3) this).aFloat4576 * ((ha_Sub3) this).aFloat4591;
			Class98_Sub39.aFloatArray4189[3] = 1.0F;
			Class98_Sub39.aFloatArray4189[1] = ((ha_Sub3) this).aFloat4549 * ((ha_Sub3) this).aFloat4576;
			Class98_Sub39.aFloatArray4189[0] = ((ha_Sub3) this).aFloat4611 * ((ha_Sub3) this).aFloat4576;
			if (i != -24391)
				I();
			OpenGL.glLightModelfv(2899, Class98_Sub39.aFloatArray4189, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.HD(" + i + ')');
		}
	}

	final Interface4_Impl2 method2006(int i, int i_91_, Class164 class164, byte i_92_, Class162 class162) {
		try {
			if (i_92_ != 45)
				return null;
			if (aBoolean6130 || Class81.method815(i_91_, 0) && Class81.method815(i, 0))
				return new Class21_Sub1(this, class164, class162, i_91_, i);
			if (aBoolean6138)
				return new Class21_Sub3(this, class164, class162, i_91_, i);
			return new Class21_Sub1(this, class164, class162, Class48.method453(423660257, i_91_), Class48.method453(423660257, i));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.WC(" + i + ',' + i_91_ + ',' + (class164 != null ? "{...}" : "null") + ',' + i_92_ + ',' + (class162 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1941(int i) {
		try {
			for (int i_93_ = ((ha_Sub3) this).anInt4608 + -1; (i_93_ ^ 0xffffffff) <= -1; i_93_--) {
				OpenGL.glActiveTexture(i_93_ + 33984);
				OpenGL.glTexEnvi(8960, 8704, 34160);
				OpenGL.glTexEnvi(8960, 34161, 8448);
				OpenGL.glTexEnvi(8960, 34178, 34166);
				OpenGL.glTexEnvi(8960, 34162, 8448);
				OpenGL.glTexEnvi(8960, 34186, 34166);
			}
			OpenGL.glTexEnvi(8960, 34186, 34168);
			OpenGL.glShadeModel(7425);
			OpenGL.glClearDepth(1.0F);
			OpenGL.glDepthFunc(515);
			OpenGL.glPolygonMode(1028, 6914);
			OpenGL.glEnable(2884);
			OpenGL.glCullFace(1029);
			OpenGL.glAlphaFunc(516, 0.0F);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glColorMaterial(1028, 5634);
			OpenGL.glEnable(2903);
			float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
			for (int i_94_ = 0; i_94_ < 8; i_94_++) {
				int i_95_ = i_94_ + 16384;
				OpenGL.glLightfv(i_95_, 4608, fs, 0);
				OpenGL.glLightf(i_95_, 4615, 0.0F);
				OpenGL.glLightf(i_95_, 4616, 0.0F);
			}
			OpenGL.glFogf(2914, 0.95F);
			OpenGL.glFogi(2917, 9729);
			OpenGL.glHint(3156, 4353);
			anOpenGL6111.setSwapInterval(0);
			super.method1941(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.OC(" + i + ')');
		}
	}

	final float method2050(byte i) {
		try {
			if (i != 56)
				return -1.1192888F;
			return 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.NC(" + i + ')');
		}
	}

	final Interface4_Impl3 method1934(int i, boolean bool, int[][] is, int i_96_) {
		try {
			if (i != 8)
				aClass148_6115 = null;
			return new Class21_Sub2(this, i_96_, bool, is);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.GC(" + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_96_ + ')'));
		}
	}

	final void method2035(int i) {
		try {
			this.method1960(i ^ ~0xf07);
			int i_97_;
			for (i_97_ = 0; ((ha_Sub3) this).anInt4619 > i_97_; i_97_++) {
				Class98_Sub5 class98_sub5 = ((ha_Sub3) this).aClass98_Sub5Array4597[i_97_];
				int i_98_ = class98_sub5.method961((byte) -78);
				int i_99_ = 16386 - -i_97_;
				float f = class98_sub5.method956(false) / 255.0F;
				Class98_Sub39.aFloatArray4189[0] = (float) class98_sub5.method954(Class369.method3953(i, -8724));
				Class98_Sub39.aFloatArray4189[1] = (float) class98_sub5.method963((byte) 84);
				Class98_Sub39.aFloatArray4189[2] = (float) class98_sub5.method962(i + 43412);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				OpenGL.glLightfv(i_99_, 4611, Class98_Sub39.aFloatArray4189, 0);
				Class98_Sub39.aFloatArray4189[2] = f * (float) Class202.method2702(255, i_98_);
				Class98_Sub39.aFloatArray4189[1] = f * (float) Class202.method2702(i_98_ >> -989028888, 255);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				Class98_Sub39.aFloatArray4189[0] = (float) Class202.method2702(255, i_98_ >> 444887952) * f;
				OpenGL.glLightfv(i_99_, 4609, Class98_Sub39.aFloatArray4189, 0);
				OpenGL.glLightf(i_99_, 4617, (1.0F / (float) (class98_sub5.method958(i + 14840) * class98_sub5.method958(126))));
				OpenGL.glEnable(i_99_);
			}
			for (/**/; ((((ha_Sub3) this).anInt4628 ^ 0xffffffff) < (i_97_ ^ 0xffffffff)); i_97_++)
				OpenGL.glDisable(16386 - -i_97_);
			super.method2035(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.BC(" + i + ')');
		}
	}

	final void method1773() {
		do {
			try {
				super.method1773();
				if (anOpenGL6111 == null)
					break;
				anOpenGL6111.a();
				anOpenGL6111.release();
				anOpenGL6111 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hl.AB(" + ')');
			}
			break;
		} while (false);
	}

	final void method1971(int i, boolean bool, Interface2_Impl1 interface2_impl1) {
		try {
			if (bool == true)
				aClass69_Sub2Array6124[i] = (Class69_Sub2) interface2_impl1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.R(" + i + ',' + bool + ',' + (interface2_impl1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1756() {
		/* empty */
	}

	final void method1988(Canvas canvas, Object object, int i) {
		try {
			if (i >= -40)
				method2025((byte) -19);
			Long var_long = (Long) object;
			anOpenGL6111.surfaceResized(var_long.longValue());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.VC(" + (canvas != null ? "{...}" : "null") + ',' + (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method1768() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.CB(" + ')');
		}
	}

	final synchronized void method2085(boolean bool, int i) {
		try {
			if (bool != true)
				((ha_Sub3_Sub2) this).aBoolean6133 = false;
			Node class98 = new Node();
			((Node) class98).uid = (long) i;
			aClass148_6117.add_last(class98, -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.W(" + bool + ',' + i + ')');
		}
	}

	final void method2010(int i) {
		try {
			OpenGL.glMatrixMode(5890);
			do {
				if (Class98_Sub46_Sub19.aClass258_6062 == (((ha_Sub3) this).aClass258Array4644[((ha_Sub3) this).anInt4579])) {
					OpenGL.glLoadIdentity();
					if (!client.aBoolean3553)
						break;
				}
				OpenGL.glLoadMatrixf((((ha_Sub3) this).aClass111_Sub3Array4609[((ha_Sub3) this).anInt4579].method2121((byte) -58, Class98_Sub30.aFloatArray4096)), 0);
			} while (false);
			int i_100_ = -73 % ((i - -62) / 42);
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hl.MB(" + i + ')');
		}
	}

	final void method1944(Object object, Canvas canvas, byte i) {
		try {
			if (i == -34) {
				Long var_long = (Long) object;
				if (!anOpenGL6111.setSurface(var_long.longValue()))
					throw new RuntimeException();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hl.NB(" + (object != null ? "{...}" : "null") + ',' + (canvas != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
