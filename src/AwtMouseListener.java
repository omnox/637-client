/* Class299_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class AwtMouseListener extends RtMouseListener implements MouseListener, MouseMotionListener, MouseWheelListener {
	private LinkedList aClass148_5277 = new LinkedList();
	private int anInt5278;
	private int anInt5279;
	private int anInt5280;
	private int anInt5281;
	private int anInt5282;
	private int anInt5283;
	private LinkedList aClass148_5284 = new LinkedList();
	private Component aComponent5285;
	private boolean aBoolean5286;
	
	public static boolean mouseWheelDown;
	public int mouseWheelX;
	public int mouseWheelY;
	public int i;
	public int j;

	public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		try {
			int i = mousewheelevent.getX();
			int i_0_ = mousewheelevent.getY();
			int i_1_ = mousewheelevent.getWheelRotation();
			method3517(i_1_, (byte) -127, i, 6, i_0_);
			mousewheelevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mousePressed(MouseEvent mouseevent) {
		do {
			try {
				int i = method3519(mouseevent, 2);
				if (i == 1)
					method3517(mouseevent.getClickCount(), (byte) -127, mouseevent.getX(), 0, mouseevent.getY());
				else if (4 == i)
					method3517(mouseevent.getClickCount(), (byte) -107, mouseevent.getX(), 2, mouseevent.getY());
				else if (i == 2)
					method3517(mouseevent.getClickCount(), (byte) -113, mouseevent.getX(), 1, mouseevent.getY());
				int type = mouseevent.getButton();
				if (type == 2 && ClientSettings.middleMouseCameraEnabled) {
					mouseWheelDown = true;
					mouseWheelX = mouseevent.getX();
					mouseWheelY = mouseevent.getY();
					this.mouseWheelDragged(i, j);
					return;
				}
				anInt5283 |= i;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final boolean method3510(byte i) {
		boolean bool;
		try {
			if (i != -19)
				aBoolean5286 = true;
			if ((0x2 & anInt5280) != 0)
				return true;
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	public final synchronized void mouseReleased(MouseEvent mouseevent) {
		try {
			int i = method3519(mouseevent, 2);
			if ((i & anInt5283) == 0)
				i = anInt5283;
			if (0 != (i & 0x1))
				method3517(mouseevent.getClickCount(), (byte) -111, mouseevent.getX(), 3, mouseevent.getY());
			if ((i & 0x4) != 0)
				method3517(mouseevent.getClickCount(), (byte) -114, mouseevent.getX(), 5, mouseevent.getY());
			if ((0x2 & i) != 0)
				method3517(mouseevent.getClickCount(), (byte) -127, mouseevent.getX(), 4, mouseevent.getY());
			anInt5283 &= ~i;
			mouseWheelDown = false;
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized void method3516(byte i) {
		try {
			anInt5280 = anInt5283;
			anInt5278 = anInt5282;
			anInt5279 = anInt5281;
			LinkedList class148 = aClass148_5277;
			aClass148_5277 = aClass148_5284;
			aClass148_5284 = class148;
			if (i < 103)
				anInt5281 = -46;
			aClass148_5284.method2422((byte) 47);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method3512(int i) {
		boolean bool;
		try {
			if (i != 1)
				mouseReleased(null);
			if (0 != (anInt5280 & 0x4))
				return true;
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final int method3507(byte i) {
		int i_2_;
		try {
			if (i < 24)
				method3518(null, (byte) -4);
			i_2_ = anInt5278;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_2_;
	}

	final void method3515(int i) {
		do {
			try {
				method3520(-87);
				if (i < -110)
					break;
				aBoolean5286 = true;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final Class98_Sub17 method3508(int i) {
		Class98_Sub17 class98_sub17;
		try {
			if (i != 600)
				anInt5281 = -94;
			class98_sub17 = (Class98_Sub17) aClass148_5277.method2421(i ^ 0x1b06);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class98_sub17;
	}

	private final void method3517(int i, byte i_3_, int i_4_, int i_5_, int i_6_) {
		do {
			try {
				Class98_Sub17_Sub2 class98_sub17_sub2 = new Class98_Sub17_Sub2();
				((Class98_Sub17_Sub2) class98_sub17_sub2).anInt5785 = i_6_;
				((Class98_Sub17_Sub2) class98_sub17_sub2).anInt5786 = i_5_;
				((Class98_Sub17_Sub2) class98_sub17_sub2).anInt5787 = i_4_;
				((Class98_Sub17_Sub2) class98_sub17_sub2).aLong5788 = Class343.method3819(-47);
				((Class98_Sub17_Sub2) class98_sub17_sub2).anInt5784 = i;
				aClass148_5284.add_last(class98_sub17_sub2, -20911);
				if (i_3_ <= -106)
					break;
				anInt5278 = -78;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	private final void method3518(Component component, byte i) {
		try {
			method3520(i + -153);
			aComponent5285 = component;
			if (i != 88)
				aClass148_5284 = null;
			aComponent5285.addMouseListener(this);
			aComponent5285.addMouseMotionListener(this);
			aComponent5285.addMouseWheelListener(this);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mouseDragged(MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
			
			if (mouseWheelDown == true) {
				int y = mouseWheelX - mouseevent.getX();
				int k = mouseWheelY - mouseevent.getY();
				mouseWheelDragged(y, -k);
				mouseWheelX = mouseevent.getX();
				mouseWheelY = mouseevent.getY();
				return;
			}
			
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	void mouseWheelDragged(int i, int j) {
		if (!mouseWheelDown)
			return;
		GameWorld.cameraGetHrot += i * 9;
		GameWorld.cameraGetVrot += (j << 2);
	}
	
	public final synchronized void mouseMoved(MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mouseExited(MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mouseEntered(MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mouseClicked(MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final int method3519(MouseEvent mouseevent, int i) {
		int i_7_;
		try {
			if (i != 2)
				return 56;
			if (mouseevent.getButton() == 1) {
				if (mouseevent.isMetaDown())
					return 4;
				return 1;
			}
			if (mouseevent.getButton() == 2)
				return 2;
			if (mouseevent.getButton() == 3)
				return 4;
			i_7_ = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_7_;
	}

	private final void method3520(int i) {
		try {
			if (null != aComponent5285) {
				aComponent5285.removeMouseWheelListener(this);
				aComponent5285.removeMouseMotionListener(this);
				aComponent5285.removeMouseListener(this);
				aClass148_5284 = null;
				anInt5281 = anInt5282 = anInt5283 = 0;
				int i_8_ = 107 / ((43 - i) / 39);
				anInt5279 = anInt5278 = anInt5280 = 0;
				aComponent5285 = null;
				aClass148_5277 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method3514(int i) {
		int i_9_;
		try {
			if (i <= 4)
				anInt5278 = 117;
			i_9_ = anInt5279;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_9_;
	}

	private final void method3521(int i, int i_10_, int i_11_) {
		do {
			try {
				anInt5282 = i_11_;
				anInt5281 = i_10_;
				if (i != -11571)
					anInt5279 = 31;
				if (!aBoolean5286)
					break;
				method3517(0, (byte) -125, i_10_, -1, i_11_);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final boolean method3506(byte i) {
		boolean bool;
		try {
			int i_12_ = -116 / ((72 - i) / 35);
			if ((anInt5280 & 0x1) != 0)
				return true;
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	AwtMouseListener(Component component, boolean bool) {
		try {
			method3518(component, (byte) 88);
			aBoolean5286 = bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
