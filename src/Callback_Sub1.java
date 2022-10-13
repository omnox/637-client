/* Callback_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

import java.awt.*;

final class Callback_Sub1 extends Callback {
	private volatile boolean aBoolean3596 = true;
	private volatile int anInt3597;
	private int anInt3598;
	private boolean aBoolean3599;
	private volatile int anInt3600;

	final void method356(int i, int i_0_, int i_1_) {
		try {
			User32.SetCursorPos(i_1_, i_0_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized int method357(int i, int i_3_, int i_4_, int i_5_) {
		try {
			if ((i ^ 0xffffffff) != (anInt3597 ^ 0xffffffff)) {
				int i_6_ = User32.GetWindowLong(i, -4);
				return User32.CallWindowProc(i_6_, i, i_3_, i_4_, i_5_);
			}
			if ((i_3_ ^ 0xffffffff) == -33) {
				int i_7_ = i_5_ & 0xffff;
				if (i_7_ == 1) {
					User32.SetCursor(!aBoolean3596 ? 0 : anInt3598);
					return 0;
				}
			}
			if (i_3_ == 101024) {
				User32.SetCursor(!aBoolean3596 ? 0 : anInt3598);
				return 0;
			}
			if (i_3_ == 1) {
				anInt3597 = 0;
				aBoolean3596 = true;
			}
			return User32.CallWindowProc(anInt3600, i, i_3_, i_4_, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method358(boolean bool, Component component, byte i) {
		try {
			WComponentPeer wcomponentpeer = (WComponentPeer) new WComponentPeer();
			if (i >= -65)
				method356(-61, -37, -29);
			int i_8_ = wcomponentpeer.getTopHwnd();
			if (anInt3597 != i_8_ || !aBoolean3596 != !bool) {
				if (!aBoolean3599) {
					anInt3598 = User32.LoadCursor(0, 32512);
					Root.alloc(this);
					aBoolean3599 = true;
				}
				if (anInt3597 != i_8_) {
					if ((anInt3597 ^ 0xffffffff) != -1) {
						aBoolean3596 = true;
						User32.SendMessage(i_8_, 101024, 0, 0);
						synchronized (this) {
							User32.SetWindowLong(anInt3597, -4, anInt3600);
						}
					}
					synchronized (this) {
						anInt3597 = i_8_;
						anInt3600 = User32.SetWindowLong(anInt3597, -4, this);
					}
				}
				aBoolean3596 = bool;
				User32.SendMessage(i_8_, 101024, 0, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
