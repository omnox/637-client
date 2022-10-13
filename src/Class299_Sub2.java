/* Class299_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class299_Sub2 extends RtMouseListener implements MouseListener, MouseMotionListener {
	private LinkedList aClass148_5287 = new LinkedList();
	private int anInt5288;
	private int anInt5289;
	private int anInt5290;
	static byte[][] aByteArrayArray5291;
	private LinkedList aClass148_5292 = new LinkedList();
	private int anInt5293;
	private int anInt5294;
	private int anInt5295;
	static OutgoingOpcode aClass171_5296 = new OutgoingOpcode(72, 3);
	static Class354 aClass354_5297;
	static int anInt5298 = 16777215;
	private boolean aBoolean5299;
	private Component aComponent5300;
	static int[] anIntArray5301 = { 1, 2, 4, 8 };

	final boolean method3510(byte i) {
		try {
			if (i != -19)
				method3512(-127);
			if ((anInt5290 & 0x2) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.C(" + i + ')');
		}
	}

	final boolean method3506(byte i) {
		try {
			int i_0_ = -85 % ((72 - i) / 35);
			if ((0x1 & anInt5290) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.L(" + i + ')');
		}
	}

	public final synchronized void mousePressed(MouseEvent mouseevent) {
		do {
			try {
				int i = method3528(23542, mouseevent);
				if (i == 1)
					method3529(22661, mouseevent.getX(), mouseevent.getClickCount(), mouseevent.getY(), 0);
				else if (i != 4) {
					if (i == 2)
						method3529(22661, mouseevent.getX(), mouseevent.getClickCount(), mouseevent.getY(), 1);
				} else
					method3529(22661, mouseevent.getX(), mouseevent.getClickCount(), mouseevent.getY(), 2);
				anInt5294 |= i;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("un.mousePressed(" + (mouseevent != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final boolean method3512(int i) {
		try {
			if (i != 1)
				return false;
			if ((0x4 & anInt5290) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.I(" + i + ')');
		}
	}

	final void method3515(int i) {
		try {
			if (i < -110)
				method3530((byte) 119);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.H(" + i + ')');
		}
	}

	public final synchronized void mouseClicked(MouseEvent mouseevent) {
		do {
			try {
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("un.mouseClicked(" + (mouseevent != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final synchronized void mouseMoved(MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseMoved(" + (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void mouseExited(MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseExited(" + (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3522(boolean bool) {
		try {
			aByteArrayArray5291 = null;
			aClass354_5297 = null;
			if (bool != false)
				method3526(-120, -17);
			anIntArray5301 = null;
			aClass171_5296 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.S(" + bool + ')');
		}
	}

	static final void method3523(int i, int i_1_, int i_2_) {
		do {
			try {
				if (Class257.anInt1948 != 0) {
					if (i_1_ < 0) {
						for (int i_3_ = 0; i_3_ < 16; i_3_++)
							Class77_Sub1.anIntArray3804[i_3_] = i;
					} else
						Class77_Sub1.anIntArray3804[i_1_] = i;
				}
				Class366.aClass98_Sub31_Sub2_3122.method1363(-17, i_1_, i);
				if (i_2_ == 0)
					break;
				method3527(35, -66);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("un.O(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class154 method3524(byte i, Class246_Sub3_Sub4 class246_sub3_sub4) {
		try {
			if (i != -90)
				return null;
			Class154 class154;
			do {
				if (Class119_Sub1.aClass154_4718 == null) {
					class154 = new Class154();
					if (!client.aBoolean3553)
						break;
				}
				class154 = Class119_Sub1.aClass154_4718;
				Class119_Sub1.aClass154_4718 = ((Class154) Class119_Sub1.aClass154_4718).aClass154_1233;
				Class76_Sub8.anInt3766--;
				((Class154) class154).aClass154_1233 = null;
			} while (false);
			((Class154) class154).aClass246_Sub3_Sub4_1232 = class246_sub3_sub4;
			return class154;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.N(" + i + ',' + (class246_sub3_sub4 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3525(int i, Component component) {
		try {
			int i_4_ = -82 % ((i - 22) / 43);
			method3530((byte) -40);
			aComponent5300 = component;
			aComponent5300.addMouseListener(this);
			aComponent5300.addMouseMotionListener(this);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.R(" + i + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}

	final int method3514(int i) {
		try {
			if (i <= 4)
				return 121;
			return anInt5289;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.E(" + i + ')');
		}
	}

	final Class98_Sub17 method3508(int i) {
		try {
			if (i != 600)
				aClass148_5292 = null;
			return (Class98_Sub17) aClass148_5287.method2421(6494);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.G(" + i + ')');
		}
	}

	static final boolean method3526(int i, int i_5_) {
		try {
			if (i < 113)
				return false;
			if (i_5_ == 13 || i_5_ == 23 || i_5_ == 2 || i_5_ == 30 || i_5_ == 18)
				return true;
			if (i_5_ == 58 || i_5_ == 1008)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.M(" + i + ',' + i_5_ + ')');
		}
	}

	public final synchronized void mouseDragged(MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseDragged(" + (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method3527(int i, int i_6_) {
		try {
			if (i_6_ != 770356935)
				aClass354_5297 = null;
			return i >>> 7;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.V(" + i + ',' + i_6_ + ')');
		}
	}

	private final int method3528(int i, MouseEvent mouseevent) {
		try {
			int i_7_ = mouseevent.getModifiers();
			boolean bool = (i_7_ & 0x10) != 0;
			boolean bool_8_ = (0x8 & i_7_) != 0;
			boolean bool_9_ = (0x4 & i_7_) != 0;
			if (bool_8_ && (bool || bool_9_))
				bool_8_ = false;
			if (bool && bool_9_)
				return 4;
			if (bool)
				return 1;
			if (i != 23542)
				anInt5290 = -41;
			if (bool_8_)
				return 2;
			if (bool_9_)
				return 4;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.Q(" + i + ',' + (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	final synchronized void method3516(byte i) {
		try {
			anInt5288 = anInt5293;
			anInt5290 = anInt5294;
			anInt5289 = anInt5295;
			LinkedList class148 = aClass148_5287;
			aClass148_5287 = aClass148_5292;
			aClass148_5292 = class148;
			if (i <= 103)
				anInt5290 = 55;
			aClass148_5292.method2422((byte) 47);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.A(" + i + ')');
		}
	}

	final int method3507(byte i) {
		try {
			if (i < 24)
				mouseExited(null);
			return anInt5288;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.B(" + i + ')');
		}
	}

	private final void method3529(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		try {
			Class98_Sub17_Sub1 class98_sub17_sub1 = new Class98_Sub17_Sub1();
			((Class98_Sub17_Sub1) class98_sub17_sub1).anInt5774 = i_11_;
			((Class98_Sub17_Sub1) class98_sub17_sub1).anInt5779 = i_13_;
			((Class98_Sub17_Sub1) class98_sub17_sub1).anInt5775 = i_10_;
			((Class98_Sub17_Sub1) class98_sub17_sub1).anInt5776 = i_12_;
			((Class98_Sub17_Sub1) class98_sub17_sub1).aLong5777 = Class343.method3819(i ^ ~0x58ab);
			if (i != 22661)
				aClass148_5287 = null;
			aClass148_5292.add_last(class98_sub17_sub1, i ^ ~0x92b);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.U(" + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	public final synchronized void mouseEntered(MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseEntered(" + (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void mouseReleased(MouseEvent mouseevent) {
		do {
			try {
				int i = method3528(23542, mouseevent);
				if ((i & anInt5294) == 0)
					i = anInt5294;
				if ((0x1 & i) != 0)
					method3529(22661, mouseevent.getX(), mouseevent.getClickCount(), mouseevent.getY(), 3);
				if ((0x4 & i) != 0)
					method3529(22661, mouseevent.getX(), mouseevent.getClickCount(), mouseevent.getY(), 5);
				if ((0x2 & i) != 0)
					method3529(22661, mouseevent.getX(), mouseevent.getClickCount(), mouseevent.getY(), 4);
				anInt5294 &= ~i;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("un.mouseReleased(" + (mouseevent != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method3530(byte i) {
		try {
			if (aComponent5300 != null) {
				aComponent5300.removeMouseMotionListener(this);
				aComponent5300.removeMouseListener(this);
				anInt5295 = anInt5293 = anInt5294 = 0;
				anInt5289 = anInt5288 = anInt5290 = 0;
				aComponent5300 = null;
				int i_14_ = 20 / ((i - 45) / 48);
				aClass148_5287 = null;
				aClass148_5292 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.T(" + i + ')');
		}
	}

	Class299_Sub2(Component component, boolean bool) {
		try {
			method3525(-32, component);
			aBoolean5299 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.<init>(" + (component != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method3531(int i, int i_15_, int i_16_) {
		do {
			try {
				if (i != -22490)
					method3525(-122, null);
				anInt5293 = i_16_;
				anInt5295 = i_15_;
				if (!aBoolean5299)
					break;
				method3529(22661, i_15_, 0, i_16_, -1);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("un.P(" + i + ',' + i_15_ + ',' + i_16_ + ')'));
			}
			break;
		} while (false);
	}
}
