
/* Class76_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class76_Sub6 extends Class76 {
	private IDirect3DVertexShader anIDirect3DVertexShader3749;
	private IDirect3DVertexShader anIDirect3DVertexShader3750;
	private boolean aBoolean3751;
	private static float[] aFloatArray3752 = new float[4];
	private IDirect3DVertexShader anIDirect3DVertexShader3753;
	private ha_Sub3_Sub1 aHa_Sub3_Sub1_3754;
	private Interface4_Impl2 anInterface4_Impl2_3755;
	private IDirect3DVertexShader anIDirect3DVertexShader3756;
	private boolean aBoolean3757;
	private static float[] aFloatArray3758 = new float[16];
	private IDirect3DVertexShader anIDirect3DVertexShader3759;
	private boolean aBoolean3760 = false;

	final void method740(int i) {
		try {
			if (i > -49)
				aBoolean3760 = false;
			if (null != anIDirect3DVertexShader3750) {
				IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				idirect3ddevice.a(4, this.aHa_Sub3_585.method2040(aFloatArray3758, 32227));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method738(int i) {
		try {
			if (i > -45)
				anIDirect3DVertexShader3750 = null;
			if (null != anIDirect3DVertexShader3750) {
				IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				int i_0_ = this.aHa_Sub3_585.XA();
				int i_1_ = this.aHa_Sub3_585.i();
				float f = (float) i_0_ - (float) (i_0_ - i_1_) * 0.125F;
				float f_2_ = -(0.25F * (float) (i_0_ - i_1_)) + (float) i_0_;
				idirect3ddevice.b(10, f_2_, 1.0F / (f - f_2_), f, 1.0F / ((float) i_0_ - f));
				idirect3ddevice.b(11, 1.0F / (float) this.aHa_Sub3_585.method1948(126), (float) this.aHa_Sub3_585.method2018((byte) 122) / 255.0F, this.aHa_Sub3_585.aFloat4592, 1.0F / ((this.aHa_Sub3_585.aFloat4592) - (this.aHa_Sub3_585.aFloat4615)));
				this.aHa_Sub3_585.method1984(2, this.aHa_Sub3_585.method1998((byte) 92));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method760(boolean bool) {
		do {
			try {
				if (bool != true)
					method749(-31);
				if (null == anIDirect3DVertexShader3750)
					break;
				if (aBoolean3751) {
					Class111_Sub3 class111_sub3 = this.aHa_Sub3_585.method2023(1);
					IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
					idirect3ddevice.b(13, ((this.aHa_Sub3_585.aFloat4576) * (this.aHa_Sub3_585.aFloat4611)), ((this.aHa_Sub3_585.aFloat4576) * (this.aHa_Sub3_585.aFloat4549)), ((this.aHa_Sub3_585.aFloat4591) * (this.aHa_Sub3_585.aFloat4576)), 1.0F);
					idirect3ddevice.b(14, ((this.aHa_Sub3_585.aFloat4630) * (this.aHa_Sub3_585.aFloat4611)), ((this.aHa_Sub3_585.aFloat4549) * (this.aHa_Sub3_585.aFloat4630)), ((this.aHa_Sub3_585.aFloat4630) * (this.aHa_Sub3_585.aFloat4591)), 1.0F);
					idirect3ddevice.b(16, ((this.aHa_Sub3_585.aFloat4611) * (this.aHa_Sub3_585.aFloat4594)), ((this.aHa_Sub3_585.aFloat4594) * (this.aHa_Sub3_585.aFloat4549)), ((this.aHa_Sub3_585.aFloat4594) * (this.aHa_Sub3_585.aFloat4591)), 1.0F);
					class111_sub3.method2134(-19890, (this.aHa_Sub3_585.aFloatArray4596[0]), (this.aHa_Sub3_585.aFloatArray4596[2]), aFloatArray3752, (this.aHa_Sub3_585.aFloatArray4596[1]));
					idirect3ddevice.SetVertexShaderConstantF(15, aFloatArray3752, 1);
					class111_sub3.method2134(-19890, (this.aHa_Sub3_585.aFloatArray4572[0]), (this.aHa_Sub3_585.aFloatArray4572[2]), aFloatArray3752, (this.aHa_Sub3_585.aFloatArray4572[1]));
					idirect3ddevice.SetVertexShaderConstantF(17, aFloatArray3752, 1);
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method742(int i, int i_3_, Interface4 interface4) {
		do {
			try {
				if (null == interface4) {
					if (!aBoolean3760) {
						this.aHa_Sub3_585.method2005((this.aHa_Sub3_585.anInterface4_4586), 98);
						this.aHa_Sub3_585.method2015(1, (byte) -99);
						this.aHa_Sub3_585.method2051(0, -115, IncomingOpcode.aClass65_459);
						this.aHa_Sub3_585.method1953(-121, IncomingOpcode.aClass65_459, 0);
						aBoolean3760 = true;
					}
				} else {
					if (aBoolean3760) {
						this.aHa_Sub3_585.method2051(0, -80, Class300.aClass65_2499);
						this.aHa_Sub3_585.method1953(-72, Class300.aClass65_2499, 0);
						aBoolean3760 = false;
					}
					this.aHa_Sub3_585.method2005(interface4, i ^ ~0x73);
					this.aHa_Sub3_585.method2015(i_3_, (byte) 92);
				}
				if (i == 6)
					break;
				method748(-96, true);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method739(int i) {
		do {
			try {
				this.aHa_Sub3_585.method1951((byte) 120, 1);
				this.aHa_Sub3_585.method2005(null, -123);
				this.aHa_Sub3_585.method2019(Class249.aClass128_1903, Class249.aClass128_1903, 22831);
				this.aHa_Sub3_585.method2051(0, -70, Class300.aClass65_2499);
				this.aHa_Sub3_585.method2051(2, -81, Class64_Sub16.aClass65_3681);
				this.aHa_Sub3_585.method1953(-108, Class300.aClass65_2499, 0);
				this.aHa_Sub3_585.method1951((byte) 120, 0);
				if (aBoolean3760) {
					this.aHa_Sub3_585.method2051(0, -115, Class300.aClass65_2499);
					this.aHa_Sub3_585.method1953(-82, Class300.aClass65_2499, 0);
					aBoolean3760 = false;
				}
				if (i != -2)
					method747(96);
				if (null == anIDirect3DVertexShader3750)
					break;
				aHa_Sub3_Sub1_3754.method2070(null, true);
				anIDirect3DVertexShader3750 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final boolean method745(byte i) {
		boolean bool;
		try {
			if (i != 27)
				method746(-54, -30, -35);
			bool = aBoolean3757;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method746(int i, int i_4_, int i_5_) {
		do {
			try {
				if (i_5_ <= -75)
					break;
				aBoolean3757 = false;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method741(byte i) {
		try {
			if (null != anIDirect3DVertexShader3750) {
				IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				Class111_Sub3 class111_sub3 = aHa_Sub3_Sub1_3754.method2027(0);
				idirect3ddevice.a(0, class111_sub3.method2128(123, aFloatArray3758));
			}
			int i_6_ = -6 / ((i - -63) / 38);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method748(int i, boolean bool) {
		try {
			aBoolean3751 = bool;
			this.aHa_Sub3_585.method1951((byte) 120, 1);
			this.aHa_Sub3_585.method2005(anInterface4_Impl2_3755, 63);
			this.aHa_Sub3_585.method2019(Class288.aClass128_3381, Class323.aClass128_2715, i + 22762);
			this.aHa_Sub3_585.method2051(0, i ^ ~0x3c, Class64_Sub16.aClass65_3681);
			this.aHa_Sub3_585.method2026(2, true, (byte) 27, Class300.aClass65_2499, false);
			this.aHa_Sub3_585.method1953(-76, IncomingOpcode.aClass65_459, 0);
			this.aHa_Sub3_585.method1951((byte) 120, 0);
			if (i == 69)
				method747(-25684);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method743(int i, boolean bool) {
		do {
			try {
				if (i > 93)
					break;
				aFloatArray3752 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class76_Sub6(ha_Sub3_Sub1 var_ha_Sub3_Sub1, RuneScapeCache class207) {
		super(var_ha_Sub3_Sub1);
		try {
			aHa_Sub3_Sub1_3754 = var_ha_Sub3_Sub1;
			if (class207 == null || ((aHa_Sub3_Sub1_3754.aD3DCAPS6093.VertexShaderVersion) & 0xffff) < 257)
				aBoolean3757 = false;
			else {
				anIDirect3DVertexShader3759 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098.a(class207.method2739("dx", "uw_ground_unlit", -32734)));
				anIDirect3DVertexShader3753 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098.a(class207.method2739("dx", "uw_ground_lit", -32734)));
				anIDirect3DVertexShader3749 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098.a(class207.method2739("dx", "uw_model_unlit", -32734)));
				anIDirect3DVertexShader3756 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098.a(class207.method2739("dx", "uw_model_lit", -32734)));
				if (anIDirect3DVertexShader3756 != null & (anIDirect3DVertexShader3753 != null & null != anIDirect3DVertexShader3759 & anIDirect3DVertexShader3749 != null)) {
					anInterface4_Impl2_3755 = (this.aHa_Sub3_585.method2012(2, 1, (byte) 31, new int[] { 0, -1 }, false));
					anInterface4_Impl2_3755.method46(false, false, 76);
					aBoolean3757 = true;
				} else
					aBoolean3757 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method737(int i) {
		do {
			try {
				if (anIDirect3DVertexShader3750 != null) {
					IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
					Class111_Sub3 class111_sub3 = aHa_Sub3_Sub1_3754.method2027(0);
					idirect3ddevice.a(0, class111_sub3.method2128(126, aFloatArray3758));
				}
				if (i == 2899)
					break;
				method741((byte) -1);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method747(int i) {
		try {
			if (i == -25684) {
				IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				int i_7_ = this.aHa_Sub3_585.method2017((byte) 67);
				Class111_Sub3 class111_sub3 = this.aHa_Sub3_585.method1956((byte) -127);
				IDirect3DVertexShader idirect3dvertexshader;
				if (!aBoolean3751)
					idirect3dvertexshader = (i_7_ == 2147483647 ? anIDirect3DVertexShader3759 : anIDirect3DVertexShader3749);
				else
					idirect3dvertexshader = (i_7_ != 2147483647 ? anIDirect3DVertexShader3756 : anIDirect3DVertexShader3753);
				if (anIDirect3DVertexShader3750 != idirect3dvertexshader) {
					anIDirect3DVertexShader3750 = idirect3dvertexshader;
					aHa_Sub3_Sub1_3754.method2070(idirect3dvertexshader, true);
					method760(true);
					method740(-101);
					method749(8);
					method741((byte) -124);
					method737(2899);
					method738(-57);
				}
				class111_sub3.method2120((byte) 18, 0.0F, -1.0F, (float) i_7_, aFloatArray3752, 0.0F);
				idirect3ddevice.a(12, aFloatArray3752);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method749(int i) {
		do {
			try {
				if (null != anIDirect3DVertexShader3750) {
					IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
					Class111_Sub3 class111_sub3 = this.aHa_Sub3_585.method2061(i + -7);
					idirect3ddevice.SetVertexShaderConstantF(8, class111_sub3.method2129(aFloatArray3758, 4), 2);
				}
				if (i == 8)
					break;
				anIDirect3DVertexShader3749 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
