
/* ha_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

import jaclib.peer.jaa;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.jc;
import jagdx.kg;

public final class ha_Sub3_Sub1 extends ha_Sub3 {
	private int anInt6083 = 0;
	private static int[] anIntArray6084;
	private D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS6085;
	GeometryBuffer aGeometryBuffer6086;
	private int[] anIntArray6087;
	private boolean[] aBooleanArray6088;
	private IDirect3D anIDirect3D6089;
	private int anInt6090;
	private IDirect3DVertexShader anIDirect3DVertexShader6091;
	private D3DLIGHT aD3DLIGHT6092;
	D3DCAPS aD3DCAPS6093;
	private boolean[] aBooleanArray6094;
	PixelBuffer aPixelBuffer6095;
	private boolean aBoolean6096 = false;
	boolean aBoolean6097;
	IDirect3DDevice anIDirect3DDevice6098;
	private D3DLIGHT aD3DLIGHT6099;
	private boolean[] aBooleanArray6100;
	private static float[] aFloatArray6101 = new float[16];
	private Class200[] aClass200Array6102;
	private int anInt6103;
	private D3DLIGHT aD3DLIGHT6104;
	private boolean[] aBooleanArray6105;
	private static int[] anIntArray6106 = { 22, 23 };
	boolean aBoolean6107;
	jaa aJaa6108;
	boolean aBoolean6109;
	private Class229 aClass229_6110;

	final Interface4_Impl2 method1968(int i, int i_0_, boolean bool, Class164 class164, int i_1_, int i_2_, int i_3_, float[] fs) {
		Interface4_Impl2 interface4_impl2;
		try {
			int i_4_ = -10 / ((57 - i_1_) / 33);
			interface4_impl2 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface4_impl2;
	}

	final void method1746(int i, int i_5_, int i_6_, int i_7_) {
		/* empty */
	}

	final void F(int i, int i_8_) {
		/* empty */
	}

	final void method2007(boolean bool) {
		try {
			this.aFloat4592 = (float) (this.anInt4605 + -this.anInt4601);
			this.aFloat4615 = ((float) -this.anInt4581 + this.aFloat4592);
			if (bool)
				anIntArray6106 = null;
			if (this.aFloat4615 < (float) this.anInt4640)
				this.aFloat4615 = (float) this.anInt4640;
			this.anIDirect3DDevice6098.a(36, this.aFloat4615);
			this.anIDirect3DDevice6098.a(37, this.aFloat4592);
			this.anIDirect3DDevice6098.SetRenderState(34, this.anInt4636);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2010(int i) {
		do {
			try {
				int i_9_ = -52 % ((-62 - i) / 42);
				if (null != anIDirect3DVertexShader6091 || (Class98_Sub46_Sub19.aClass258_6062 == (this.aClass258Array4644[this.anInt4579]))) {
					this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, 24, 0);
					anIntArray6087[this.anInt4579] = 0;
				} else {
					if (Class246_Sub3_Sub4_Sub5.aClass258_6260 != (this.aClass258Array4644[this.anInt4579]))
						this.anIDirect3DDevice6098.SetTransform(this.anInt4579 + 16, this.aClass111_Sub3Array4609[this.anInt4579].method2121((byte) -91, aFloatArray6101));
					else
						this.anIDirect3DDevice6098.SetTransform(this.anInt4579 + 16, this.aClass111_Sub3Array4609[this.anInt4579].method2122(aFloatArray6101, 22));
					int i_10_ = method2071((this.aClass258Array4644[this.anInt4579]), 2474);
					if (i_10_ == anIntArray6087[this.anInt4579])
						break;
					this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, 24, i_10_);
					anIntArray6087[this.anInt4579] = i_10_;
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final Interface2_Impl2 method1990(byte i, boolean bool) {
		Class125 class125;
		try {
			if (i != 84)
				aBooleanArray6094 = null;
			class125 = new Class125(this, Class162.aClass162_1267, bool);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class125;
	}

	final void method1773() {
		try {
			this.aJaa6108.b((byte) -125);
			super.method1773();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1761(boolean bool) {
		/* empty */
	}

	final void method2021(int i) {
		try {
			if (!this.aClass204_4551.method2708(98)) {
				aFloatArray6101[15] = 1.0F;
				aFloatArray6101[1] = 0.0F;
				aFloatArray6101[11] = 0.0F;
				aFloatArray6101[12] = 0.0F;
				aFloatArray6101[8] = 0.0F;
				aFloatArray6101[13] = 0.0F;
				aFloatArray6101[4] = 0.0F;
				aFloatArray6101[5] = 1.0F;
				aFloatArray6101[6] = 0.0F;
				aFloatArray6101[14] = 0.0F;
				aFloatArray6101[7] = 0.0F;
				aFloatArray6101[2] = 0.0F;
				aFloatArray6101[3] = 0.0F;
				aFloatArray6101[0] = 1.0F;
				aFloatArray6101[9] = 0.0F;
				aFloatArray6101[10] = 1.0F;
			} else
				this.aClass111_Sub3_4545.method2121((byte) -111, aFloatArray6101);
			if (i == 0)
				this.anIDirect3DDevice6098.SetTransform(2, aFloatArray6101);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final float method2050(byte i) {
		float f;
		try {
			if (i != 56)
				return 0.34527656F;
			f = -0.5F;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return f;
	}

	private static final int method2068(Class65 class65, byte i) {
		try {
			if (i <= 125)
				return -28;
			if (class65 == Class300.aClass65_2499)
				return 2;
			if (class65 != Class98_Sub43_Sub3.aClass65_5926) {
				if (class65 != IncomingOpcode.aClass65_459) {
					if (Class64_Sub16.aClass65_3681 == class65)
						return 3;
				} else
					return 1;
			} else
				return 0;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1776() {
		/* empty */
	}

	final Class62 method1799() {
		Class62 class62;
		try {
			D3DADAPTER_IDENTIFIER d3dadapter_identifier = anIDirect3D6089.b(anInt6103, 0);
			class62 = new Class62(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class62;
	}

	private static final int method2069(int i, Class232 class232) {
		try {
			if (class232 != Class334.aClass232_3468) {
				if (class232 != Class287_Sub1.aClass232_3420) {
					if (class232 == Class224.aClass232_1685)
						return 1;
					if (Class336.aClass232_2822 != class232) {
						if (Class98_Sub46_Sub15.aClass232_6043 != class232) {
							if (class232 == Class97.aClass232_806)
								return 5;
						} else
							return 6;
					} else
						return 4;
				} else
					return 3;
			} else
				return 2;
			int i_11_ = -122 % ((-8 - i) / 44);
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1989(int i) {
		do {
			try {
				int i_12_ = 92 / ((-16 - i) / 50);
				if (aBoolean6096)
					break;
				this.anIDirect3DDevice6098.LightEnable(0, false);
				this.anIDirect3DDevice6098.LightEnable(1, false);
				this.anIDirect3DDevice6098.SetLight(0, aD3DLIGHT6099);
				this.anIDirect3DDevice6098.SetLight(1, aD3DLIGHT6104);
				this.anIDirect3DDevice6098.LightEnable(0, true);
				this.anIDirect3DDevice6098.LightEnable(1, true);
				aBoolean6096 = true;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method2070(IDirect3DVertexShader idirect3dvertexshader, boolean bool) {
		do {
			try {
				anIDirect3DVertexShader6091 = idirect3dvertexshader;
				this.anIDirect3DDevice6098.SetVertexShader(idirect3dvertexshader);
				method2010(-114);
				if (bool == true)
					break;
				anInt6090 = -60;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1740(Interface17 interface17) {
		/* empty */
	}

	final void method2046(int i) {
		do {
			try {
				this.anIDirect3DDevice6098.a(15, this.aBoolean4599);
				if (i == 0)
					break;
				aBooleanArray6088 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	private static final int method2071(Class258 class258, int i) {
		int i_13_;
		try {
			if (i != 2474)
				anIntArray6106 = null;
			if (Class98_Sub10_Sub6.aClass258_5568 == class258)
				return 1;
			if (class258 != Class246_Sub3_Sub4_Sub5.aClass258_6260) {
				if (class258 == Class144.aClass258_1168)
					return 3;
				if (Class98_Sub46_Sub13_Sub1.aClass258_6307 != class258) {
					if (Class246_Sub4_Sub1.aClass258_6169 == class258)
						return 256;
				} else
					return 4;
			} else
				return 2;
			i_13_ = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_13_;
	}

	final void method1825() {
		try {
			IDirect3DEventQuery idirect3deventquery = this.anIDirect3DDevice6098.c();
			if (kg.a(-21593, idirect3deventquery.Issue())) {
				for (;;) {
					int i = idirect3deventquery.IsSignaled();
					if (i != 1)
						break;
					Thread.yield();
				}
			}
			idirect3deventquery.b(99);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int I() {
		int i;
		try {
			i = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	final void method2037(Class232 class232, int i, byte i_14_, int i_15_) {
		do {
			try {
				this.anIDirect3DDevice6098.DrawPrimitive(method2069(-101, class232), i, i_15_);
				if (i_14_ > 8)
					break;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final Interface5 method1813(int i, int i_16_) {
		Interface5 interface5;
		try {
			interface5 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface5;
	}

	final void method1814() {
		/* empty */
	}

	final void method2036(int i) {
		do {
			try {
				this.anIDirect3DDevice6098.SetViewport(this.anInt4578, this.anInt4622, this.anInt4527, this.anInt4531, 0.0F, 1.0F);
				if (i == -11155)
					break;
				this.aBoolean6109 = true;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final Interface2_Impl1 method2060(boolean bool, int i) {
		Class80 class80;
		try {
			if (i <= 40)
				method1972(-48);
			class80 = new Class80(this, bool);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class80;
	}

	final boolean method1977(Class162 class162, boolean bool, Class164 class164) {
		boolean bool_17_;
		try {
			if (bool != true)
				method2074(19, null, null);
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (kg.a(-21593, anIDirect3D6089.a(anInt6103, d3ddisplaymode)) && kg.a(-21593, (anIDirect3D6089.CheckDeviceFormat(anInt6103, anInt6090, d3ddisplaymode.Format, 0, 4, method2074(-1935, class164, class162)))))
				return true;
			bool_17_ = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool_17_;
	}

	final void method1955(int i) {
		try {
			if (i != -5668)
				anIntArray6084 = null;
			this.anIDirect3DDevice6098.a(137, (this.aBoolean4643 && !this.aBoolean4637));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized void method1806(int i) {
		try {
			this.aJaa6108.a((byte) 126);
			super.method1806(i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2009(int i) {
		try {
			if (i != 28976)
				aBoolean6096 = false;
			this.anIDirect3DDevice6098.SetScissorRect((this.anInt4602 + this.anInt4578), (this.anInt4558 + this.anInt4622), this.anInt4575, this.anInt4638);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int[] na(int i, int i_18_, int i_19_, int i_20_) {
		int[] is;
		try {
			int[] is_21_ = null;
			IDirect3DSurface idirect3dsurface = this.anIDirect3DDevice6098.d(0);
			IDirect3DSurface idirect3dsurface_22_ = this.anIDirect3DDevice6098.a(i_19_, i_20_, 21, 0, 0, true);
			if (kg.a(-21593, (this.anIDirect3DDevice6098.StretchRect(idirect3dsurface, i, i_18_, i_19_, i_20_, idirect3dsurface_22_, 0, 0, i_19_, i_20_, 0))) && kg.a(-21593, idirect3dsurface_22_.LockRect(0, 0, i_19_, i_20_, 16, (this.aPixelBuffer6095)))) {
				is_21_ = new int[i_19_ * i_20_];
				int i_23_ = this.aPixelBuffer6095.getRowPitch();
				if (i_23_ == 4 * i_19_)
					this.aPixelBuffer6095.b(is_21_, 0, 0, i_19_ * i_20_);
				else {
					for (int i_24_ = 0; i_20_ > i_24_; i_24_++)
						this.aPixelBuffer6095.b(is_21_, i_19_ * i_24_, i_24_ * i_23_, i_19_);
				}
				idirect3dsurface_22_.UnlockRect();
			}
			idirect3dsurface.b(71);
			idirect3dsurface_22_.b(80);
			is = is_21_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	final void method1756() {
		/* empty */
	}

	final void method2057(int i) {
		try {
			if (i == 12362)
				this.anIDirect3DDevice6098.SetRenderState(60, this.anInt4648);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final int method2072(boolean bool, Class128 class128) {
		try {
			if (bool)
				aFloatArray6101 = null;
			if (class128 != Class288.aClass128_3381) {
				if (class128 != Class249.aClass128_1903) {
					if (Class323.aClass128_2715 == class128)
						return 26;
					if (Class1.aClass128_64 == class128)
						return 7;
					if (class128 == Class28.aClass128_286)
						return 10;
				} else
					return 4;
			} else
				return 2;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class76 method2067(int i, byte i_25_) {
		Class76 class76;
		try {
			int i_26_ = -6 % ((i_25_ - 39) / 56);
			int i_27_ = i;
			while_23_: do {
				do {
					if (3 != i_27_) {
						if (i_27_ != 4) {
							if (i_27_ == 8)
								break;
							break while_23_;
						}
					} else
						return new Class76_Sub6(this, (this.aClass207_4535));
					return new Class76_Sub3(this, (this.aClass207_4535), (this.aClass195_4529));
				} while (false);
				return new Class76_Sub1(this, this.aClass207_4535, this.aClass195_4529);
			} while (false);
			class76 = super.method2067(i, (byte) 102);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class76;
	}

	final boolean method1768() {
		boolean bool;
		try {
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method2025(byte i) {
		try {
			method2004((byte) -118);
			int i_28_ = 16 / ((69 - i) / 53);
			method1989(73);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final int method2073(int i, Class200 class200) {
		try {
			if (Class284_Sub1_Sub1.aClass200_6187 == class200)
				return 2;
			if (class200 == Class342.aClass200_2861)
				return 1;
			if (i != 26476)
				return -49;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class48 method1769(Class48 class48, Class48 class48_29_, float f, Class48 class48_30_) {
		Class48 class48_31_;
		try {
			if (f < 0.5F)
				return class48;
			class48_31_ = class48_29_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class48_31_;
	}

	final void method1964(Class38 class38, byte i) {
		try {
			if (i != 26)
				method1942(-76, null, null);
			int i_32_ = 0;
			if (class38 != Class357.aClass38_3026) {
				if (Node.aClass38_834 == class38)
					i_32_ = 131072;
				else if (Class204.aClass38_1552 == class38)
					i_32_ = 196608;
			} else
				i_32_ = 65536;
			this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, 11, i_32_ | this.anInt4579);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final int method2074(int i, Class164 class164, Class162 class162) {
		try {
			if (Class162.aClass162_1266 == class162) {
				if (class164 == Class98_Sub40.aClass164_4190)
					return 22;
				if (Class62.aClass164_486 == class164)
					return 21;
				if (class164 != Class53_Sub1.aClass164_3633) {
					if (class164 == Class98_Sub30.aClass164_4088)
						return 50;
					if (Class74.aClass164_547 == class164)
						return 51;
					if (class164 == Class280.aClass164_2101)
						return 77;
				} else
					return 28;
			}
			if (i != -1935)
				method2069(119, null);
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1983(byte i) {
		try {
			if (this.aBoolean4540) {
				aFloatArray6101[5] = 1.0F;
				aFloatArray6101[9] = 0.0F;
				aFloatArray6101[7] = 0.0F;
				aFloatArray6101[3] = 0.0F;
				aFloatArray6101[11] = 0.0F;
				aFloatArray6101[10] = 1.0F;
				aFloatArray6101[4] = 0.0F;
				aFloatArray6101[13] = 0.0F;
				aFloatArray6101[2] = 0.0F;
				aFloatArray6101[6] = 0.0F;
				aFloatArray6101[12] = 0.0F;
				aFloatArray6101[0] = 1.0F;
				aFloatArray6101[14] = 0.0F;
				aFloatArray6101[1] = 0.0F;
				aFloatArray6101[15] = 1.0F;
				aFloatArray6101[8] = 0.0F;
			} else
				this.aClass111_Sub3_4542.method2121((byte) -90, aFloatArray6101);
			int i_33_ = 2 % ((26 - i) / 53);
			this.anIDirect3DDevice6098.SetTransform(256, aFloatArray6101);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void ya() {
		try {
			method1997(0, true);
			this.anIDirect3DDevice6098.Clear(2, 0, 1.0F, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1973(Class232 class232, int i, int i_34_, int i_35_, Interface2_Impl2 interface2_impl2, int i_36_, int i_37_) {
		try {
			this.anIDirect3DDevice6098.SetIndices(((Class125) interface2_impl2).anIDirect3DIndexBuffer5350);
			if (i_35_ != 26810)
				aBooleanArray6094 = null;
			this.anIDirect3DDevice6098.DrawIndexedPrimitive(method2069(-85, class232), 0, i_36_, i, i_34_, i_37_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1936(int i, Object object, Canvas canvas) {
		do {
			try {
				if (i == 0)
					break;
				method2080(4, -101, null, -18, null, 124);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method2075(int i, IDirect3DPixelShader idirect3dpixelshader) {
		try {
			if (i != 28)
				method2072(true, null);
			this.anIDirect3DDevice6098.SetPixelShader(idirect3dpixelshader);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private ha_Sub3_Sub1(int i, int i_38_, Canvas canvas, jaa var_jaa, IDirect3D idirect3d, IDirect3DDevice idirect3ddevice, Class229 class229, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, d var_d, RuneScapeCache class207, int i_39_) {
		super(canvas, class229, var_d, class207, i_39_, 0);
		try {
			try {
				anInt6103 = i;
				this.aJaa6108 = var_jaa;
				this.anIDirect3DDevice6098 = idirect3ddevice;
				anInt6090 = i_38_;
				aD3DPRESENT_PARAMETERS6085 = d3dpresent_parameters;
				aClass229_6110 = class229;
				this.aD3DCAPS6093 = d3dcaps;
				anIDirect3D6089 = idirect3d;
				aD3DLIGHT6099 = new D3DLIGHT(this.aJaa6108);
				aD3DLIGHT6104 = new D3DLIGHT(this.aJaa6108);
				aD3DLIGHT6092 = new D3DLIGHT(this.aJaa6108);
				this.aPixelBuffer6095 = new PixelBuffer(this.aJaa6108);
				this.aGeometryBuffer6086 = new GeometryBuffer(this.aJaa6108);
				new GeometryBuffer(this.aJaa6108);
				this.anInt4608 = (this.aD3DCAPS6093.MaxSimultaneousTextures);
				this.aBoolean6097 = (0x10000 & this.aD3DCAPS6093.TextureCaps) != 0;
				this.aBoolean4569 = (this.aD3DCAPS6093.TextureCaps & 0x800) != 0;
				this.anInt4565 = (this.aD3DCAPS6093.MaxActiveLights > 0 ? this.aD3DCAPS6093.MaxActiveLights : 8);
				this.aBoolean6107 = (this.aD3DCAPS6093.TextureCaps & 0x4000) != 0;
				this.aBoolean4588 = (0x2000 & this.aD3DCAPS6093.TextureCaps) != 0;
				this.aBoolean6109 = ((this.aD3DCAPS6093.TextureCaps & 0x2) == 0);
				this.aBoolean4559 = (this.anInt4616 > 0 || (anIDirect3D6089.CheckDeviceMultiSampleType(anInt6103, anInt6090, aD3DPRESENT_PARAMETERS6085.BackBufferFormat, true, 2)) == 0);
				aBooleanArray6100 = new boolean[this.anInt4608];
				aBooleanArray6088 = new boolean[this.anInt4608];
				aBooleanArray6094 = new boolean[this.anInt4608];
				aBooleanArray6105 = new boolean[this.anInt4608];
				anIntArray6087 = new int[this.anInt4608];
				aClass200Array6102 = new Class200[this.anInt4608];
				this.anIDirect3DDevice6098.BeginScene();
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				method1743(-1);
				throw new RuntimeException("");
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface4_Impl2 method2006(int i, int i_40_, Class164 class164, byte i_41_, Class162 class162) {
		Class26_Sub3 class26_sub3;
		try {
			if (i_41_ != 45)
				method1802();
			class26_sub3 = new Class26_Sub3(this, class164, class162, i_40_, i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub3;
	}

	final Interface13 method1744(int i, int i_42_) {
		Interface13 interface13;
		try {
			interface13 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface13;
	}

	private final boolean method2076(int i) {
		boolean bool;
		try {
			if (i >= -127)
				return true;
			int i_43_ = this.anIDirect3DDevice6098.TestCooperativeLevel();
			if (0 == i_43_ || i_43_ == -2005530519) {
				Class229 class229 = (Class229) this.anObject4530;
				method1981((byte) -105);
				class229.method2868((byte) 88);
				aD3DPRESENT_PARAMETERS6085.BackBufferWidth = 0;
				aD3DPRESENT_PARAMETERS6085.BackBufferHeight = 0;
				if (method2080(this.anInt4616, anInt6103, anIDirect3D6089, 0, aD3DPRESENT_PARAMETERS6085, anInt6090)) {
					int i_44_ = this.anIDirect3DDevice6098.Reset(aD3DPRESENT_PARAMETERS6085);
					if (kg.a(-21593, i_44_)) {
						class229.method2866(this.anIDirect3DDevice6098.b(), (byte) -85, this.anIDirect3DDevice6098.c(0));
						method2064((byte) -61);
						method1941(1);
						return true;
					}
				}
			}
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method2077(boolean bool, Class26_Sub2 class26_sub2) {
		do {
			try {
				method2078(class26_sub2, 0);
				if (!aBooleanArray6088[this.anInt4579]) {
					this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 1, 1);
					aBooleanArray6088[this.anInt4579] = true;
				}
				if (!aBooleanArray6100[this.anInt4579]) {
					this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 2, 1);
					aBooleanArray6100[this.anInt4579] = true;
				}
				if (!bool)
					break;
				this.aBoolean6097 = true;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1817() {
		/* empty */
	}

	final boolean method1802() {
		boolean bool;
		try {
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method2078(Class26 class26, int i) {
		do {
			try {
				this.anIDirect3DDevice6098.SetTexture(this.anInt4579, class26.method293((byte) 18));
				if (class26.aClass200_272 != aClass200Array6102[this.anInt4579]) {
					int i_45_ = method2073(26476, class26.aClass200_272);
					this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 6, i_45_);
					this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 5, i_45_);
					aClass200Array6102[this.anInt4579] = class26.aClass200_272;
					if (!aBooleanArray6105[this.anInt4579] != !class26.aBoolean269) {
						this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 7, (!class26.aBoolean269 ? 0 : method2073(26476, (class26.aClass200_272))));
						aBooleanArray6105[this.anInt4579] = class26.aBoolean269;
					}
				} else if (!class26.aBoolean269 != !(aBooleanArray6105[this.anInt4579])) {
					this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 7, (!class26.aBoolean269 ? 0 : method2073(26476, class26.aClass200_272)));
					aBooleanArray6105[this.anInt4579] = class26.aBoolean269;
				}
				if (i == 0) {
					if (aBooleanArray6094[this.anInt4579])
						break;
					aBooleanArray6094[this.anInt4579] = true;
					method1958((byte) -48);
					method2011(2);
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1994(byte i, int i_46_) {
		try {
			if (i < 0)
				anIntArray6087 = null;
			this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, 11, i_46_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2065(byte i) {
		try {
			aD3DLIGHT6099.SetDirection(-this.aFloatArray4596[0], -this.aFloatArray4596[1], -this.aFloatArray4596[2]);
			aD3DLIGHT6104.SetDirection(-this.aFloatArray4572[0], -this.aFloatArray4572[1], -this.aFloatArray4572[2]);
			if (i == 80)
				aBoolean6096 = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final ha createToolkit(Canvas canvas, d var_d, RuneScapeCache class207, Integer integer) {
		try {
			ha_Sub3_Sub1 var_ha_Sub3_Sub1 = null;
			ha_Sub3_Sub1 var_ha_Sub3_Sub1_47_;
			try {
				int i = 0;
				int i_48_ = 1;
				jaa var_jaa = new jaa();
				IDirect3D idirect3d = IDirect3D.a(-2147483616, var_jaa);
				D3DCAPS d3dcaps = idirect3d.a(i, i_48_);
				if (0 == (0x1000000 & d3dcaps.RasterCaps))
					throw new RuntimeException("");
				if (2 > d3dcaps.MaxSimultaneousTextures)
					throw new RuntimeException("");
				if ((d3dcaps.TextureOpCaps & 0x2) == 0)
					throw new RuntimeException("");
				if (0 == (0x8 & d3dcaps.TextureOpCaps))
					throw new RuntimeException("");
				if ((0x40 & d3dcaps.TextureOpCaps) == 0)
					throw new RuntimeException("");
				if ((d3dcaps.TextureOpCaps & 0x200) == 0)
					throw new RuntimeException("");
				if ((0x2000000 & d3dcaps.TextureOpCaps) == 0)
					throw new RuntimeException("");
				if (0 == (0x10 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps)))
					throw new RuntimeException("");
				if (0 == (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20))
					throw new RuntimeException("");
				if ((0x2 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps)) == 0)
					throw new RuntimeException("");
				if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
					throw new RuntimeException("");
				if (d3dcaps.MaxStreams < 5)
					throw new RuntimeException("");
				D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
				if (!method2080(integer.intValue(), i, idirect3d, 0, d3dpresent_parameters, i_48_))
					throw new RuntimeException("");
				d3dpresent_parameters.PresentationInterval = -2147483648;
				d3dpresent_parameters.EnableAutoDepthStencil = true;
				d3dpresent_parameters.Windowed = true;
				int i_49_ = 2;
				if ((0x100000 & d3dcaps.DevCaps) != 0)
					i_49_ |= 0x10;
				Object object = null;
				IDirect3DDevice idirect3ddevice;
				try {
					idirect3ddevice = idirect3d.a(i, i_48_, canvas, 0x40 | i_49_, d3dpresent_parameters);
				} catch (jc var_jc) {
					idirect3ddevice = idirect3d.a(i, i_48_, canvas, 0x20 | i_49_, d3dpresent_parameters);
				}
				Class229 class229 = new Class229(idirect3ddevice.c(0), idirect3ddevice.b());
				var_ha_Sub3_Sub1 = new ha_Sub3_Sub1(i, i_48_, canvas, var_jaa, idirect3d, idirect3ddevice, class229, d3dpresent_parameters, d3dcaps, var_d, class207, integer.intValue());
				var_ha_Sub3_Sub1.method1965(true);
				var_ha_Sub3_Sub1_47_ = var_ha_Sub3_Sub1;
			} catch (RuntimeException runtimeexception) {
				if (var_ha_Sub3_Sub1 != null)
					var_ha_Sub3_Sub1.method1773();
				throw runtimeexception;
			}
			return var_ha_Sub3_Sub1_47_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1991(int i) {
		do {
			try {
				aD3DLIGHT6099.SetAmbient((this.aFloat4611 * this.aFloat4576), (this.aFloat4549 * this.aFloat4576), (this.aFloat4576 * this.aFloat4591), 0.0F);
				aBoolean6096 = false;
				if (i == -24391)
					break;
				method2007(true);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method2030(byte i) {
		try {
			if (i != -122)
				F(29, 70);
			this.anIDirect3DDevice6098.a(174, this.aBoolean4672);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method1942(int i, Class164 class164, Class162 class162) {
		boolean bool;
		try {
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (i != 0)
				method2080(-93, -77, null, -97, null, -25);
			if (kg.a(-21593, anIDirect3D6089.a(anInt6103, d3ddisplaymode)) && kg.a(-21593, (anIDirect3D6089.CheckDeviceFormat(anInt6103, anInt6090, d3ddisplaymode.Format, 0, 3, method2074(-1935, class164, class162)))))
				return true;
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final Class256 method1982(Class49[] class49s, int i) {
		dxVertexLayout var_dxVertexLayout;
		try {
			if (i != 6)
				return null;
			var_dxVertexLayout = new dxVertexLayout(this, class49s);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return var_dxVertexLayout;
	}

	final Interface4_Impl2 method2063(int i, byte i_50_, int[] is, boolean bool, int i_51_, int i_52_, int i_53_) {
		Class26_Sub3 class26_sub3;
		try {
			int i_54_ = 77 % ((i_50_ - 60) / 58);
			class26_sub3 = new Class26_Sub3(this, i_51_, i_52_, bool, is, i, i_53_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub3;
	}

	final void method1972(int i) {
		try {
			if (i == 0)
				this.anIDirect3DDevice6098.a(14, (this.aBoolean4606 && this.aBoolean4620));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1764(int i, int i_55_) throws Exception_Sub1 {
		try {
			this.anIDirect3DDevice6098.EndScene();
			if (aClass229_6110.method2867(0)) {
				anInt6083 = 0;
				if (kg.b(-7175, aClass229_6110.method2865(true, 0)))
					method2076(-128);
			} else {
				if (50 < ++anInt6083)
					throw new Exception_Sub1();
				method2076(-128);
			}
			this.anIDirect3DDevice6098.BeginScene();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface4_Impl2 method2032(byte[] is, boolean bool, Class164 class164, int i, int i_56_, boolean bool_57_, int i_58_, int i_59_) {
		Class26_Sub3 class26_sub3;
		try {
			if (bool)
				method2016((byte) 12);
			class26_sub3 = new Class26_Sub3(this, class164, i_59_, i_56_, bool_57_, is, i_58_, i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub3;
	}

	final void method1944(Object object, Canvas canvas, byte i) {
		do {
			try {
				aClass229_6110 = (Class229) object;
				if (i == -34)
					break;
				this.aJaa6108 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1950(byte i) {
		try {
			int i_60_ = 40 / ((i - -49) / 47);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2079(boolean bool, Class26_Sub3 class26_sub3) {
		do {
			try {
				method2078(class26_sub3, 0);
				if (class26_sub3.aBoolean3584 != aBooleanArray6088[this.anInt4579]) {
					this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 1, class26_sub3.aBoolean3584 ? 1 : 3);
					aBooleanArray6088[this.anInt4579] = class26_sub3.aBoolean3584;
				}
				if (bool)
					method1942(-63, null, null);
				if (class26_sub3.aBoolean3585 != !aBooleanArray6100[this.anInt4579])
					break;
				this.anIDirect3DDevice6098.SetSamplerState(this.anInt4579, 2, !class26_sub3.aBoolean3585 ? 3 : 1);
				aBooleanArray6100[this.anInt4579] = class26_sub3.aBoolean3585;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1999(byte i) {
		do {
			try {
				this.anIDirect3DDevice6098.a(28, (this.aBoolean4571 && this.aBoolean4562 && this.anInt4581 >= 0));
				if (i == 112)
					break;
				anIntArray6106 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void GA(int i) {
		try {
			this.anIDirect3DDevice6098.Clear(1, i, 0.0F, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface4_Impl3 method1934(int i, boolean bool, int[][] is, int i_61_) {
		Class26_Sub1 class26_sub1;
		try {
			if (i != 8)
				return null;
			class26_sub1 = new Class26_Sub1(this, i_61_, bool, is);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub1;
	}

	final void method1971(int i, boolean bool, Interface2_Impl1 interface2_impl1) {
		do {
			try {
				Class80 class80 = (Class80) interface2_impl1;
				this.anIDirect3DDevice6098.SetStreamSource(i, class80.anIDirect3DVertexBuffer5337, 0, class80.method810((byte) -22));
				if (bool == true)
					break;
				anIntArray6084 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1958(byte i) {
		do {
			try {
				int i_62_ = (aBooleanArray6094[this.anInt4579] ? method2072(false, (this.aClass128Array4639[this.anInt4579])) : 1);
				this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, 4, i_62_);
				if (i == -48)
					break;
				aBooleanArray6100 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1959(int i) {
		do {
			try {
				if (aBooleanArray6094[this.anInt4579]) {
					aBooleanArray6094[this.anInt4579] = false;
					this.anIDirect3DDevice6098.SetTexture(this.anInt4579, null);
					method1958((byte) -48);
					method2011(2);
				}
				if (i == 0)
					break;
				aBoolean6096 = true;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final Object method2058(Canvas canvas, int i) {
		Object object;
		try {
			if (i != -8401)
				return null;
			object = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}

	final void method1966(byte i) {
		try {
			int i_63_ = 9 / ((i - -6) / 34);
			this.anIDirect3DDevice6098.SetTransform(3, this.aFloatArray4566);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface17 method1815(Interface5 interface5, Interface13 interface13) {
		Interface17 interface17;
		try {
			interface17 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface17;
	}

	final void method2042(Class256 class256, byte i) {
		try {
			int i_64_ = 55 / ((i - -4) / 48);
			dxVertexLayout var_dxVertexLayout = (dxVertexLayout) class256;
			this.anIDirect3DDevice6098.SetVertexDeclaration(var_dxVertexLayout.anIDirect3DVertexDeclaration5155);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1988(Canvas canvas, Object object, int i) {
		do {
			try {
				if (i > -40)
					method1950((byte) -56);
				if (this.aCanvas4533 != canvas)
					break;
				Dimension dimension = canvas.getSize();
				if (dimension.width <= 0 || dimension.height <= 0)
					break;
				this.anIDirect3DDevice6098.EndScene();
				method2076(-128);
				this.anIDirect3DDevice6098.BeginScene();
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	private static final boolean method2080(int i, int i_65_, IDirect3D idirect3d, int i_66_, D3DPRESENT_PARAMETERS d3dpresent_parameters, int i_67_) {
		boolean bool;
		do {
			try {
				int i_68_ = 0;
				int i_69_ = 0;
				int i_70_ = 0;
				boolean bool_71_;
				try {
					D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
					if (kg.b(i_66_ + -7175, idirect3d.a(i_65_, d3ddisplaymode)))
						return false;
					while_24_: for (/**/; 0 <= i; i--) {
						if (i != 1) {
							i_70_ = 0 + i;
							for (int i_72_ = 0; (anIntArray6106.length > i_72_); i_72_++) {
								if (idirect3d.CheckDeviceType(i_65_, i_67_, (d3ddisplaymode.Format), (anIntArray6106[i_72_]), true) == 0 && (idirect3d.CheckDeviceFormat(i_65_, i_67_, d3ddisplaymode.Format, 1, 1, anIntArray6106[i_72_])) == 0 && (i == 0 || (idirect3d.CheckDeviceMultiSampleType(i_65_, i_67_, anIntArray6106[i_72_], true, i_70_)) == 0)) {
									for (int i_73_ = 0; anIntArray6084.length > i_73_; i_73_++) {
										if ((idirect3d.CheckDeviceFormat(i_65_, i_67_, d3ddisplaymode.Format, 2, 1, anIntArray6084[i_73_])) == 0 && (0 == (idirect3d.CheckDepthStencilMatch(i_65_, i_67_, d3ddisplaymode.Format, anIntArray6106[i_72_], anIntArray6084[i_73_]))) && (i == 0 || (idirect3d.CheckDeviceMultiSampleType(i_65_, i_67_, anIntArray6084[i_72_], true, i_70_)) == 0)) {
											i_69_ = anIntArray6106[i_72_];
											i_68_ = anIntArray6084[i_73_];
											break while_24_;
										}
									}
								}
							}
						}
					}
					if (i < i_66_ || 0 == i_69_ || i_68_ == 0)
						return false;
					d3dpresent_parameters.BackBufferFormat = i_69_;
					d3dpresent_parameters.MultiSampleQuality = 0;
					d3dpresent_parameters.MultiSampleType = i_70_;
					d3dpresent_parameters.AutoDepthStencilFormat = i_68_;
					bool_71_ = true;
				} catch (Throwable throwable) {
					bool = false;
					break;
				}
				return bool_71_;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
		} while (false);
		return bool;
	}

	final void method2035(int i) {
		try {
			int i_74_;
			for (i_74_ = 0; this.anInt4619 > i_74_; i_74_++) {
				Class98_Sub5 class98_sub5 = this.aClass98_Sub5Array4597[i_74_];
				int i_75_ = i_74_ - -2;
				int i_76_ = class98_sub5.method961((byte) -78);
				float f = class98_sub5.method956(false) / 255.0F;
				aD3DLIGHT6092.SetPosition((float) class98_sub5.method954(7019), (float) class98_sub5.method963((byte) 115), (float) class98_sub5.method962(i + 43412));
				aD3DLIGHT6092.SetDiffuse((float) ((i_76_ & 0xff6196) >> 16) * f, (float) ((i_76_ & 0xff55) >> 8) * f, (float) (0xff & i_76_) * f, 0.0F);
				aD3DLIGHT6092.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (class98_sub5.method958(i + 14840) * class98_sub5.method958(i ^ ~0x3906)));
				aD3DLIGHT6092.SetRange((float) class98_sub5.method958(i ^ ~0x3906));
				this.anIDirect3DDevice6098.SetLight(i_75_, aD3DLIGHT6092);
				this.anIDirect3DDevice6098.LightEnable(i_75_, true);
			}
			for (/**/; this.anInt4628 > i_74_; i_74_++)
				this.anIDirect3DDevice6098.LightEnable(i_74_ + 2, false);
			super.method2035(i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2026(int i, boolean bool, byte i_77_, Class65 class65, boolean bool_78_) {
		try {
			if (i_77_ != 27)
				method1740(null);
			int i_79_ = i;
			int i_80_;
			while_25_: do {
				do {
					if (1 != i_79_) {
						if (2 != i_79_)
							break;
					} else {
						i_80_ = 3;
						break while_25_;
					}
					i_80_ = 26;
					break while_25_;
				} while (false);
				i_80_ = 2;
			} while (false);
			int i_81_ = 0;
			if (bool)
				i_81_ |= 0x20;
			if (bool_78_)
				i_81_ |= 0x10;
			this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, i_80_, i_81_ | method2068(class65, (byte) 127));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2004(byte i) {
		try {
			if (i <= -98) {
				float f = (this.aBoolean4555 ? this.aFloat4630 : 0.0F);
				float f_82_ = (this.aBoolean4555 ? -this.aFloat4594 : 0.0F);
				aD3DLIGHT6099.SetDiffuse(f * this.aFloat4611, this.aFloat4549 * f, f * this.aFloat4591, 0.0F);
				aD3DLIGHT6104.SetDiffuse(this.aFloat4611 * f_82_, this.aFloat4549 * f_82_, this.aFloat4591 * f_82_, 0.0F);
				aBoolean6096 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void b(int i, int i_83_, int i_84_, int i_85_, double d) {
		/* empty */
	}

	final Interface4_Impl1 method2044(int i, Class164 class164, byte[] is, int i_86_, int i_87_, int i_88_) {
		Class26_Sub2 class26_sub2;
		try {
			int i_89_ = 33 / ((i - 49) / 38);
			class26_sub2 = new Class26_Sub2(this, class164, i_86_, i_87_, i_88_, is);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub2;
	}

	final void method2033(int i) {
		try {
			this.anIDirect3DDevice6098.a(27, this.aBoolean4560);
			int i_90_ = 25 / ((i - -43) / 34);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2059(boolean bool, boolean bool_91_) {
		do {
			try {
				this.anIDirect3DDevice6098.a(161, bool);
				if (!bool_91_)
					break;
				method2025((byte) -31);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method1941(int i) {
		try {
			for (int i_92_ = 0; (this.anInt4608 > i_92_); i_92_++) {
				this.anIDirect3DDevice6098.SetSamplerState(i_92_, 7, 0);
				this.anIDirect3DDevice6098.SetSamplerState(i_92_, 6, 2);
				this.anIDirect3DDevice6098.SetSamplerState(i_92_, 5, 2);
				this.anIDirect3DDevice6098.SetSamplerState(i_92_, 1, 1);
				this.anIDirect3DDevice6098.SetSamplerState(i_92_, 2, 1);
				aClass200Array6102[i_92_] = Class284_Sub1_Sub1.aClass200_6187;
				aBooleanArray6088[i_92_] = aBooleanArray6100[i_92_] = true;
				aBooleanArray6105[i_92_] = false;
				anIntArray6087[i_92_] = 0;
			}
			this.anIDirect3DDevice6098.SetTextureStageState(0, 6, 1);
			this.anIDirect3DDevice6098.SetRenderState(9, 2);
			this.anIDirect3DDevice6098.SetRenderState(23, 4);
			this.anIDirect3DDevice6098.SetRenderState(25, 5);
			this.anIDirect3DDevice6098.SetRenderState(24, 0);
			this.anIDirect3DDevice6098.SetRenderState(22, 2);
			this.anIDirect3DDevice6098.SetRenderState(147, i);
			this.anIDirect3DDevice6098.SetRenderState(145, 1);
			this.anIDirect3DDevice6098.a(38, 0.95F);
			this.anIDirect3DDevice6098.SetRenderState(140, 3);
			aD3DLIGHT6099.SetType(3);
			aD3DLIGHT6104.SetType(3);
			aD3DLIGHT6092.SetType(1);
			aBoolean6096 = false;
			super.method1941(1);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2047(int i, boolean bool, byte i_93_, Class65 class65) {
		try {
			int i_94_ = 0;
			if (i_93_ != -42)
				aFloatArray6101 = null;
			int i_95_ = i;
			int i_96_;
			while_26_: do {
				do {
					if (i_95_ != 1) {
						if (i_95_ != 2)
							break;
					} else {
						i_96_ = 6;
						break while_26_;
					}
					i_96_ = 27;
					break while_26_;
				} while (false);
				i_96_ = 5;
			} while (false);
			if (bool)
				i_94_ |= 0x10;
			this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, i_96_, i_94_ | method2068(class65, (byte) 127));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2011(int i) {
		try {
			int i_97_ = (aBooleanArray6094[this.anInt4579] ? method2072(false, (this.aClass128Array4585[this.anInt4579])) : 1);
			if (i != 2)
				this.aGeometryBuffer6086 = null;
			this.anIDirect3DDevice6098.SetTextureStageState(this.anInt4579, 1, i_97_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1791(float f, float f_98_, float f_99_) {
		/* empty */
	}

	final void method2016(byte i) {
		try {
			if (i <= -109) {
				if (this.aClass126_4625 != Class101.aClass126_848) {
					if (this.aClass126_4625 != Class373_Sub1_Sub1.aClass126_6216) {
						if (Class83.aClass126_632 == this.aClass126_4625) {
							this.anIDirect3DDevice6098.SetRenderState(19, 9);
							this.anIDirect3DDevice6098.SetRenderState(20, 2);
						}
					} else {
						this.anIDirect3DDevice6098.SetRenderState(19, 2);
						this.anIDirect3DDevice6098.SetRenderState(20, 2);
					}
				} else {
					this.anIDirect3DDevice6098.SetRenderState(19, 5);
					this.anIDirect3DDevice6098.SetRenderState(20, 6);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1974(int i) {
		do {
			try {
				this.anIDirect3DDevice6098.a(7, this.aBoolean4577);
				if (i == 0)
					break;
				anInt6083 = -18;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void a(Rectangle[] rectangles, int i, int i_100_, int i_101_) throws Exception_Sub1 {
		try {
			method1764(i_100_, i_101_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		anIntArray6084 = new int[] { 77, 80 };
	}
}
