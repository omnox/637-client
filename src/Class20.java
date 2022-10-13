/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

import java.awt.*;

final class Class20 implements IEnumModesCallback {
	private static int[] anIntArray3249;
	private static int anInt3250;
	private DirectDraw aDirectDraw3251;

	final int[] method252(boolean bool) {
		try {
			if (bool != false)
				anIntArray3249 = null;
			aDirectDraw3251.enumDisplayModes(0, null, null, this);
			anIntArray3249 = new int[anInt3250];
			anInt3250 = 0;
			aDirectDraw3251.enumDisplayModes(0, null, null, this);
			int[] is = anIntArray3249;
			anInt3250 = 0;
			anIntArray3249 = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method253(int i, Frame frame) {
		try {
			aDirectDraw3251.restoreDisplayMode();
			aDirectDraw3251.setCooperativeLevel(frame, 8);
			int i_0_ = -28 % ((i - 36) / 32);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method254(DDSurfaceDesc ddsurfacedesc, IUnknown iunknown) {
		try {
			if (anIntArray3249 != null) {
				anIntArray3249[anInt3250++] = ddsurfacedesc.width;
				anIntArray3249[anInt3250++] = ddsurfacedesc.height;
				anIntArray3249[anInt3250++] = ddsurfacedesc.rgbBitCount;
				anIntArray3249[anInt3250++] = ddsurfacedesc.refreshRate;
			} else
				anInt3250 += 4;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method255(int i, int i_1_, int i_2_, int i_3_, int i_4_, Frame frame) {
		try {
			frame.setVisible(true);
			WComponentPeer wcomponentpeer = new WComponentPeer();
			int i_5_ = wcomponentpeer.getHwnd();
			User32.SetWindowLong(i_5_, -16, i_1_);
			User32.SetWindowLong(i_5_, -20, 8);
			aDirectDraw3251.setCooperativeLevel(frame, 17);
			aDirectDraw3251.setDisplayMode(i_2_, i_4_, i, i_3_, 0);
			frame.setBounds(0, 0, i_2_, i_4_);
			frame.toFront();
			frame.requestFocus();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Class20() {
		try {
			aDirectDraw3251 = new DirectDraw();
			aDirectDraw3251.initialize(null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
