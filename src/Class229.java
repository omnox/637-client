/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

final class Class229 {
	private IDirect3DSurface anIDirect3DSurface1718;
	private IDirect3DSurface anIDirect3DSurface1719;
	private IDirect3DSwapChain anIDirect3DSwapChain1720;

	final int method2865(boolean bool, int i) {
		int i_0_;
		try {
			if (bool != true)
				return 100;
			i_0_ = anIDirect3DSwapChain1720.Present(i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	final void method2866(IDirect3DSurface idirect3dsurface, byte i, IDirect3DSwapChain idirect3dswapchain) {
		try {
			anIDirect3DSwapChain1720 = idirect3dswapchain;
			int i_1_ = 97 / ((i - -10) / 60);
			anIDirect3DSurface1718 = idirect3dsurface;
			anIDirect3DSurface1719 = anIDirect3DSwapChain1720.a(0, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method2867(int i) {
		boolean bool;
		try {
			if (i != 0)
				method2865(true, 65);
			if (null != anIDirect3DSwapChain1720)
				return true;
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method2868(byte i) {
		do {
			try {
				if (anIDirect3DSurface1719 != null) {
					anIDirect3DSurface1719.b(49);
					anIDirect3DSurface1719 = null;
				}
				int i_2_ = 24 / ((i - -10) / 48);
				if (null != anIDirect3DSurface1718) {
					anIDirect3DSurface1718.b(99);
					anIDirect3DSurface1718 = null;
				}
				if (null == anIDirect3DSwapChain1720)
					break;
				anIDirect3DSwapChain1720.b(63);
				anIDirect3DSwapChain1720 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class229(IDirect3DSwapChain idirect3dswapchain, IDirect3DSurface idirect3dsurface) {
		try {
			method2866(idirect3dsurface, (byte) -113, idirect3dswapchain);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
