/* Class151_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.lang.reflect.Constructor;

import jaggl.OpenGL;

final class Class151_Sub3 extends Class151 {
	private Class51 aClass51_4976;
	static LinkedList aClass148_4977 = new LinkedList();
	private int anInt4978;
	private float aFloat4979;
	private Class91 aClass91_4980;
	private Class202 aClass202_4981;
	private float[] aFloatArray4982;
	/* synthetic */ static Class aClass4983;

	final void method2442(Class42 class42, boolean bool, int i) {
		try {
			if (bool != false)
				method2457(null, true, -76);
			this.aHa_Sub1_1215.method1863(1, class42);
			this.aHa_Sub1_1215.method1896(260, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eq.F(" + (class42 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	final void method2443(boolean bool, int i) {
		do {
			try {
				if (i == 255)
					break;
				aClass91_4980 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "eq.C(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2439(int i) {
		try {
			if (i != 31565)
				aFloatArray4982 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eq.A(" + i + ')');
		}
	}

	final void method2440(boolean bool, boolean bool_0_) {
		do {
			try {
				if (aClass91_4980 != null) {
					aClass91_4980.method888('\0', bool);
					this.aHa_Sub1_1215.method1845(1, 847872872);
					OpenGL.glMatrixMode(5890);
					OpenGL.glLoadMatrixf(this.aHa_Sub1_1215.aClass111_Sub1_4354.method2113(-110), 0);
					OpenGL.glMatrixMode(5888);
					this.aHa_Sub1_1215.method1845(0, 847872872);
					if ((this.aHa_Sub1_1215.anInt4321) == anInt4978)
						break;
					int i = 128 * ((this.aHa_Sub1_1215.anInt4321) % 5000) / 5000;
					for (int i_1_ = 0; i_1_ < 64; i_1_++) {
						OpenGL.glProgramLocalParameter4fvARB(34336, i_1_, aFloatArray4982, i);
						i += 2;
					}
					if (aClass51_4976.aBoolean424)
						aFloat4979 = (float) (this.aHa_Sub1_1215.anInt4321 % 4000) / 4000.0F;
					else
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					anInt4978 = (this.aHa_Sub1_1215.anInt4321);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eq.D(" + bool + ',' + bool_0_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2441(int i, int i_2_, int i_3_) {
		try {
			if (i_3_ > -2)
				method2440(true, true);
			if (aClass91_4980 != null) {
				this.aHa_Sub1_1215.method1845(1, 847872872);
				if ((0x80 & i) == 0) {
					if ((0x1 & i_2_) == 1) {
						if (!aClass51_4976.aBoolean424) {
							int i_4_ = ((this.aHa_Sub1_1215.anInt4321) % 4000 * 16 / 4000);
							this.aHa_Sub1_1215.method1863(1, (aClass51_4976.aClass42_Sub1Array423[i_4_]));
							OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
						} else {
							this.aHa_Sub1_1215.method1863(1, aClass51_4976.aClass42_Sub4_422);
							OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat4979, 0.0F, 0.0F, 1.0F);
						}
					} else {
						if (!aClass51_4976.aBoolean424)
							this.aHa_Sub1_1215.method1863(1, (aClass51_4976.aClass42_Sub1Array423[0]));
						else
							this.aHa_Sub1_1215.method1863(1, aClass51_4976.aClass42_Sub4_422);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					}
				} else
					this.aHa_Sub1_1215.method1863(1, null);
				this.aHa_Sub1_1215.method1845(0, 847872872);
				if ((0x40 & i) == 0) {
					Class269.aFloatArray2027[0] = ((this.aHa_Sub1_1215.aFloat4413) * (this.aHa_Sub1_1215.aFloat4433));
					Class269.aFloatArray2027[2] = ((this.aHa_Sub1_1215.aFloat4413) * (this.aHa_Sub1_1215.aFloat4458));
					Class269.aFloatArray2027[1] = ((this.aHa_Sub1_1215.aFloat4413) * (this.aHa_Sub1_1215.aFloat4420));
					OpenGL.glProgramLocalParameter4fvARB(34336, 66, (Class269.aFloatArray2027), 0);
				} else
					OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
				int i_5_ = i & 0x3;
				if (i_5_ == 2)
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
				else if (i_5_ == 3)
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eq.G(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method2453(int i, boolean bool, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			if (i_6_ < 1)
				i_6_ = 1;
			if (i_8_ < 1)
				i_8_ = 1;
			int i_10_ = -334 + i_8_;
			if (i_10_ >= 0) {
				if (i_10_ > 100)
					i_10_ = 100;
			} else
				i_10_ = 0;
			int i_11_ = (i_10_ * (-Class265.aShort1973 + Class98_Sub43_Sub4.aShort5934) / i_7_ + Class265.aShort1973);
			if (Class284_Sub2_Sub2.aShort6201 <= i_11_) {
				if (i_11_ > Class112.aShort948)
					i_11_ = Class112.aShort948;
			} else
				i_11_ = Class284_Sub2_Sub2.aShort6201;
			int i_12_ = i_11_ * i_8_ * 512 / (i_6_ * 334);
			if (Class42.aShort3231 > i_12_) {
				i_12_ = Class42.aShort3231;
				i_11_ = 334 * (i_12_ * i_6_) / (512 * i_8_);
				if (Class112.aShort948 < i_11_) {
					i_11_ = Class112.aShort948;
					int i_13_ = i_11_ * i_8_ * 512 / (i_12_ * 334);
					int i_14_ = (i_6_ - i_13_) / 2;
					if (bool) {
						Class265.aHa1974.la();
						Class265.aHa1974.method1760(i_14_, i_8_, i, -16777216, (byte) -66, i_9_);
						Class265.aHa1974.method1760(i_14_, i_8_, i, -16777216, (byte) -66, -i_14_ + (i_9_ + i_6_));
					}
					i_9_ += i_14_;
					i_6_ -= i_14_ * 2;
				}
			} else if (Class260.aShort3256 < i_12_) {
				i_12_ = Class260.aShort3256;
				i_11_ = 334 * (i_12_ * i_6_) / (512 * i_8_);
				if (i_11_ < Class284_Sub2_Sub2.aShort6201) {
					i_11_ = Class284_Sub2_Sub2.aShort6201;
					int i_15_ = i_6_ * i_12_ * 334 / (i_11_ * 512);
					int i_16_ = (i_8_ - i_15_) / 2;
					if (bool) {
						Class265.aHa1974.la();
						Class265.aHa1974.method1760(i_6_, i_16_, i, -16777216, (byte) -66, i_9_);
						Class265.aHa1974.method1760(i_6_, i_16_, i - -i_8_ + -i_16_, -16777216, (byte) -66, i_9_);
					}
					i += i_16_;
					i_8_ -= 2 * i_16_;
				}
			}
			Class215.anInt1612 = (short) i_6_;
			Class151_Sub8.anInt5016 = i_9_;
			Class98_Sub31_Sub2.anInt5824 = i;
			Class98_Sub10_Sub14.anInt5610 = i_11_ * i_8_ / 334;
			Class332_Sub2.anInt5421 = (short) i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eq.I(" + i + ',' + bool + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	Class151_Sub3(ha_Sub1 var_ha_Sub1, Class51 class51) {
		super(var_ha_Sub1);
		do {
			try {
				aClass51_4976 = class51;
				if (!this.aHa_Sub1_1215.aBoolean4431 || this.aHa_Sub1_1215.anInt4410 < 2)
					break;
				aClass202_4981 = (Class347.method3835(0, this.aHa_Sub1_1215, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
				if (aClass202_4981 != null) {
					int[][] is = Class135.method2258(3, 256, false, 64, 0.4F, 0, 4, (byte) -63, 4);
					int[][] is_17_ = Class135.method2258(3, 256, false, 64, 0.4F, 8, 4, (byte) -63, 4);
					aFloatArray4982 = new float[32768];
					int i = 0;
					for (int i_18_ = 0; i_18_ < 256; i_18_++) {
						int[] is_19_ = is[i_18_];
						int[] is_20_ = is_17_[i_18_];
						for (int i_21_ = 0; i_21_ < 64; i_21_++) {
							aFloatArray4982[i++] = (float) is_19_[i_21_] / 4096.0F;
							aFloatArray4982[i++] = (float) is_20_[i_21_] / 4096.0F;
						}
					}
					method2454(13402);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eq.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method2454(int i) {
		try {
			aClass91_4980 = new Class91(this.aHa_Sub1_1215, 2);
			aClass91_4980.method887(0, -30389);
			this.aHa_Sub1_1215.method1845(1, 847872872);
			this.aHa_Sub1_1215.method1882(-16777216, i + -13509);
			this.aHa_Sub1_1215.method1899(7681, i + -4442, 260);
			this.aHa_Sub1_1215.method1886(770, 0, 34200, 34166);
			this.aHa_Sub1_1215.method1845(0, 847872872);
			OpenGL.glBindProgramARB(34336, aClass202_4981.anInt1549);
			OpenGL.glEnable(34336);
			aClass91_4980.method886((byte) -56);
			aClass91_4980.method887(1, i + -43791);
			this.aHa_Sub1_1215.method1845(1, i ^ 0x3289b732);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			if (i != 13402)
				method2458(null, null, (byte) -62);
			OpenGL.glMatrixMode(5888);
			this.aHa_Sub1_1215.method1896(260, 0);
			this.aHa_Sub1_1215.method1886(770, 0, i ^ 0xb1c2, 5890);
			this.aHa_Sub1_1215.method1845(0, 847872872);
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34336);
			OpenGL.glDisable(34820);
			aClass91_4980.method886((byte) 60);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eq.H(" + i + ')');
		}
	}

	static final short[][] method2455(float[][] fs, byte i, short[][] is) {
		try {
			if (i != -78)
				return null;
			for (int i_22_ = 0; i_22_ < fs.length; i_22_++) {
				for (int i_23_ = 0; i_23_ < is[i_22_].length; i_23_++)
					is[i_22_][i_23_] = (short) (int) (16383.0F * fs[i_22_][i_23_]);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eq.N(" + (fs != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2456(int i) {
		try {
			if (i >= 28)
				aClass148_4977 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eq.B(" + i + ')');
		}
	}

	static final RtMouseListener method2457(Component component, boolean bool, int i) {
		try {
			try {
				if (i != -16777216)
					method2455(null, (byte) -127, null);
				Constructor constructor = (Class.forName("AwtMouseListener").getDeclaredConstructor(new Class[] { (aClass4983 != null ? aClass4983 : (aClass4983 = method2459("java.awt.Component"))), Boolean.TYPE }));
				return ((RtMouseListener) constructor.newInstance(new Object[] { component, new Boolean(bool) }));
			} catch (Throwable throwable) {
				return new Class299_Sub2(component, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eq.J(" + (component != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	final void method2445(byte i) {
		try {
			if (aClass91_4980 != null) {
				aClass91_4980.method888('\001', false);
				if (i <= 25)
					method2442(null, false, 69);
				this.aHa_Sub1_1215.method1845(1, 847872872);
				this.aHa_Sub1_1215.method1863(1, null);
				this.aHa_Sub1_1215.method1845(0, 847872872);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eq.E(" + i + ')');
		}
	}

	static final void method2458(Class246 class246, Class246 class246_24_, byte i) {
		try {
			if (class246.aClass246_1873 != null)
				class246.method2965((byte) 127);
			if (i != 27)
				method2458(null, null, (byte) 98);
			class246.aClass246_1873 = class246_24_.aClass246_1873;
			class246.aClass246_1874 = class246_24_;
			class246.aClass246_1873.aClass246_1874 = class246;
			class246.aClass246_1874.aClass246_1873 = class246;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eq.K(" + (class246 != null ? "{...}" : "null") + ',' + (class246_24_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	/* synthetic */
	static Class method2459(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
