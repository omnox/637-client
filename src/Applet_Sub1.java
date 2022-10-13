/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean aBoolean1;
	static int anInt2;
	private boolean aBoolean3 = false;
	public static int anInt4;
	public static boolean aBoolean5;
	public static boolean aBoolean6;
	public static int anInt7;
	public static boolean aBoolean8;
	public static int anInt9;
	public static int anInt10;
	public static int anInt11;
	public static boolean aBoolean12;
	public static int anInt13;
	public static int anInt14;
	public static int anInt15;
	public static boolean aBoolean16;
	public static boolean aBoolean17;
	public static int anInt18;
	public static int anInt19;
	public static int anInt20;
	public static int anInt21;
	public static int anInt22;

	public final void update(Graphics graphics) {
		try {
			paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.update(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method80(int i) {
		try {
			if (i != 0)
				windowActivated(null);
			return Class134_Sub1.method2246("jagmisc", (byte) -36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.P(" + i + ')');
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	static final int method81(int i, byte i_0_, int i_1_) {
		try {
			if (i_0_ != -9)
				findPath(null, -42, null, -65, 42, 54, -75, 7, null, false, -21, 124, 62, -66, 123);
			int i_2_ = 0;
			for (/**/; i > 0; i--) {
				i_2_ = i_2_ << 1 | 0x1 & i_1_;
				i_1_ >>>= 1;
			}
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.O(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final boolean method82(int i) {
		try {
			if (i != -21568)
				aBoolean3 = true;
			return Class134_Sub1.method2246("jaclib", (byte) -36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.G(" + i + ')');
		}
	}

	public final void destroy() {
		try {
			if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 == this && !Class98_Sub10_Sub21.aBoolean5646) {
				Class180.aLong3404 = Class343.method3819(-47);
				Class246_Sub7.method3131(0, 5000L);
				Class98_Sub40.aClass88_4192 = null;
				method98(false, 18192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.destroy(" + ')');
		}
	}

	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	final boolean method83(boolean bool) {
		try {
			if (bool != true)
				aBoolean1 = false;
			return Class134_Sub1.method2246("jagtheora", (byte) -36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.C(" + bool + ')');
		}
	}

	final void method84(int i, int i_3_, int i_4_, int i_5_, String string, int i_6_, int i_7_) {
		try {
			try {
				if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 != null) {
					Class98_Sub41.anInt4200++;
					if (Class98_Sub41.anInt4200 >= 3)
						method97((byte) 74, "alreadyloaded");
					else
						getAppletContext().showDocument(getDocumentBase(), "_self");
				} else {
					Class164.anInt1273 = i;
					Class131.anApplet1038 = Class76_Sub11.anApplet3799;
					Class188.anInt1453 = Class39_Sub1.anInt3593 = i_7_;
					Class123_Sub1.anInt4744 = Class98_Sub25.anInt4024 = i_3_;
					Class98_Sub46_Sub10.anInt6022 = 0;
					if (i_4_ == 4) {
						Class191.anInt1479 = 0;
						Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 = this;
						Class98_Sub40.aClass88_4192 = Class98_Sub43_Sub2.aClass88_5907 = new Class88(i_6_, string, i_5_, Class76_Sub11.anApplet3799 != null);
						Class143 class143 = Class98_Sub43_Sub2.aClass88_5907.method858(1, this, i_4_ + -3);
						while (class143.anInt1163 == 0)
							Class246_Sub7.method3131(0, 10L);
					}
				}
			} catch (Throwable throwable) {
				Map.method3585(throwable, -128, null);
				method97((byte) -50, "crash");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.E(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + (string != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public final String getParameter(String string) {
		try {
			if (Class284.aFrame2168 != null)
				return null;
			if (Class76_Sub11.anApplet3799 != null && Class76_Sub11.anApplet3799 != this)
				return Class76_Sub11.anApplet3799.getParameter(string);
			return super.getParameter(string);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.getParameter(" + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public final void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	private final void method85(int i) {
		try {
			if (i != 6341)
				anInt2 = -22;
			long l = Class343.method3819(-47);
			long l_8_ = Class271.aLongArray2034[Class295.anInt2410];
			Class271.aLongArray2034[Class295.anInt2410] = l;
			if (l_8_ != 0 && l_8_ < l) {
				/* empty */
			}
			Class295.anInt2410 = 0x1f & 1 + Class295.anInt2410;
			synchronized (this) {
				Class4.aBoolean84 = Class153.aBoolean1228;
			}
			method86((byte) -6);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.S(" + i + ')');
		}
	}

	abstract void method86(byte i);

	synchronized void method87(int i) {
		try {
			if (Class42_Sub3.aCanvas5361 != null) {
				Class42_Sub3.aCanvas5361.removeFocusListener(this);
				Class42_Sub3.aCanvas5361.getParent().setBackground(Color.black);
				Class42_Sub3.aCanvas5361.getParent().remove(Class42_Sub3.aCanvas5361);
			}
			Container container;
			if (GameInterface.aFrame3950 != null)
				container = GameInterface.aFrame3950;
			else if (Class284.aFrame2168 != null)
				container = Class284.aFrame2168;
			else if (Class76_Sub11.anApplet3799 != null)
				container = Class76_Sub11.anApplet3799;
			else
				container = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
			container.setLayout(null);
			Class42_Sub3.aCanvas5361 = new Canvas_Sub1(this);
			container.add(Class42_Sub3.aCanvas5361);
			Class42_Sub3.aCanvas5361.setSize(Class39_Sub1.anInt3593, Class98_Sub25.anInt4024);
			Class42_Sub3.aCanvas5361.setVisible(true);
			if (Class284.aFrame2168 != container)
				Class42_Sub3.aCanvas5361.setLocation((Class98_Sub46_Sub10.anInt6022), Class191.anInt1479);
			else {
				Insets insets = Class284.aFrame2168.getInsets();
				Class42_Sub3.aCanvas5361.setLocation(Class98_Sub46_Sub10.anInt6022 + insets.left, Class191.anInt1479 + insets.top);
			}
			Class42_Sub3.aCanvas5361.addFocusListener(this);
			Class42_Sub3.aCanvas5361.requestFocus();
			Class4.aBoolean84 = true;
			Class153.aBoolean1228 = true;
			Class246_Sub10.aBoolean5152 = true;
			Class224_Sub2_Sub1.aBoolean6142 = false;
			if (i != 0)
				aBoolean3 = true;
			client.aLong3547 = Class343.method3819(-47);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.J(" + i + ')');
		}
	}

	public final void start() {
		try {
			if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 == this && !Class98_Sub10_Sub21.aBoolean5646)
				Class180.aLong3404 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.start(" + ')');
		}
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	final void method88(boolean bool, String string, int i, int i_9_, int i_10_, boolean bool_11_, int i_12_, int i_13_) {
		try {
			try {
				Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 = this;
				Class98_Sub46_Sub10.anInt6022 = 0;
				Class123_Sub1.anInt4744 = Class98_Sub25.anInt4024 = i_9_;
				Class188.anInt1453 = Class39_Sub1.anInt3593 = i_13_;
				Class131.anApplet1038 = null;
				Class191.anInt1479 = 0;
				Class164.anInt1273 = i_12_;
				Class284.aFrame2168 = new Frame();
				Class284.aFrame2168.setTitle("Jagex");
				Class284.aFrame2168.setResizable(true);
				Class284.aFrame2168.addWindowListener(this);
				Class284.aFrame2168.setVisible(true);
				Class284.aFrame2168.toFront();
				Insets insets = Class284.aFrame2168.getInsets();
				Class284.aFrame2168.setSize(insets.left + (Class188.anInt1453 + insets.right), (insets.bottom + (Class123_Sub1.anInt4744 - -insets.top)));
				Class98_Sub40.aClass88_4192 = Class98_Sub43_Sub2.aClass88_5907 = new Class88(i_10_, string, i, bool_11_);
				Class143 class143 = Class98_Sub43_Sub2.aClass88_5907.method858(1, this, 1);
				while (class143.anInt1163 == 0)
					Class246_Sub7.method3131(0, 10L);
			} catch (Exception exception) {
				Map.method3585(exception, -128, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.L(" + bool + ',' + (string != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ',' + i_10_ + ',' + bool_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	public final void focusLost(FocusEvent focusevent) {
		try {
			Class153.aBoolean1228 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	public final void run() {
		try {
			do {
				try {
					if (Class88.aString696 != null) {
						String string = Class88.aString696.toLowerCase();
						if (string.indexOf("sun") == -1 && string.indexOf("apple") == -1) {
							if (string.indexOf("ibm") != -1 && (Class88.aString692 == null || Class88.aString692.equals("1.4.2"))) {
								method97((byte) 87, "wrongjava");
								break;
							}
						} else {
							String string_14_ = Class88.aString692;
							if (string_14_.equals("1.1") || string_14_.startsWith("1.1.") || string_14_.equals("1.2") || string_14_.startsWith("1.2.")) {
								method97((byte) 88, "wrongjava");
								break;
							}
						}
					}
					if (Class88.aString692 != null && Class88.aString692.startsWith("1.")) {
						int i = 2;
						int i_15_ = 0;
						for (/**/; (Class88.aString692.length() > i); i++) {
							int i_16_ = Class88.aString692.charAt(i);
							if (i_16_ < 48 || i_16_ > 57)
								break;
							i_15_ = 10 * i_15_ - (48 + -i_16_);
						}
						if (i_15_ >= 5)
							Class237.aBoolean1803 = true;
					}
					Applet applet = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
					if (Class76_Sub11.anApplet3799 != null)
						applet = Class76_Sub11.anApplet3799;
					Method method = Class88.aMethod678;
					if (method != null) {
						try {
							method.invoke(applet, new Object[] { Boolean.TRUE });
						} catch (Throwable throwable) {
							/* empty */
						}
					}
					Class96.method927(107);
					Class85.method839(12345);
					method87(0);
					method95(-13395);
					OutputStream_Sub1.aClass240_36 = Class109.method1737(72);
					while (Class180.aLong3404 == 0 || (Class180.aLong3404 > Class343.method3819(-47))) {
						Class42_Sub1.anInt5356 = OutputStream_Sub1.aClass240_36.method2925(0, Class212.aLong1599);
						for (int i = 0; Class42_Sub1.anInt5356 > i; i++)
							method85(6341);
						method91(784382337);
						PlayerUpdate.method2857(Class98_Sub43_Sub2.aClass88_5907, 31668, Class42_Sub3.aCanvas5361);
					}
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Map.method3585(throwable, -123, method94(0));
					method97((byte) -88, "crash");
				} finally {
					method98(true, 18192);
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.run(" + ')');
		}
	}

	final boolean method89(int i) {
		try {
			String string = getDocumentBase().getHost().toLowerCase();
			if (string.endsWith("127.0.0.1"))
				return true;
			if (string.equalsIgnoreCase("127.0.0.1"))
				return true;
			for (/**/; (string.length() > 0 && string.charAt(-1 + string.length()) >= '0' && (string.charAt(-1 + string.length()) <= 57)); string = string.substring(0, -1 + string.length())) {
				/* empty */
			}
			if (string.endsWith("192.168.1."))
				return true;
			method97((byte) 112, "invalidhost");
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.M(" + i + ')');
		}
	}

	abstract void method90(int i);

	public static final void provideLoaderApplet(Applet applet) {
		try {
			Class76_Sub11.anApplet3799 = applet;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.provideLoaderApplet(" + (applet != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method91(int i) {
		try {
			long l = Class343.method3819(i + -784382384);
			long l_17_ = Class89.aLongArray709[Class98_Sub46_Sub11.anInt6024];
			Class89.aLongArray709[Class98_Sub46_Sub11.anInt6024] = l;
			if (i != 784382337)
				windowOpened(null);
			Class98_Sub46_Sub11.anInt6024 = 0x1f & Class98_Sub46_Sub11.anInt6024 - -1;
			if (l_17_ != 0 && l > l_17_) {
				int i_18_ = (int) (l + -l_17_);
				Class338.anInt2842 = ((i_18_ >> 1) + 32000) / i_18_;
			}
			do {
				if (OutputStream_Sub1.anInt32++ > 50) {
					Class246_Sub10.aBoolean5152 = true;
					OutputStream_Sub1.anInt32 -= 50;
					Class42_Sub3.aCanvas5361.setSize(Class39_Sub1.anInt3593, Class98_Sub25.anInt4024);
					Class42_Sub3.aCanvas5361.setVisible(true);
					if (Class284.aFrame2168 == null || GameInterface.aFrame3950 != null) {
						Class42_Sub3.aCanvas5361.setLocation(Class98_Sub46_Sub10.anInt6022, Class191.anInt1479);
						if (!client.aBoolean3553)
							break;
					}
					Insets insets = Class284.aFrame2168.getInsets();
					Class42_Sub3.aCanvas5361.setLocation(insets.left + Class98_Sub46_Sub10.anInt6022, Class191.anInt1479 + insets.top);
				}
			} while (false);
			method93(i + -784382227);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.R(" + i + ')');
		}
	}

	abstract void method92(boolean bool);

	public final URL getDocumentBase() {
		try {
			if (Class284.aFrame2168 != null)
				return null;
			if (Class76_Sub11.anApplet3799 != null && Class76_Sub11.anApplet3799 != this)
				return Class76_Sub11.anApplet3799.getDocumentBase();
			return super.getDocumentBase();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.getDocumentBase(" + ')');
		}
	}

	abstract void method93(int i);

	public final AppletContext getAppletContext() {
		try {
			if (Class284.aFrame2168 != null)
				return null;
			if (Class76_Sub11.anApplet3799 != null && Class76_Sub11.anApplet3799 != this)
				return Class76_Sub11.anApplet3799.getAppletContext();
			return super.getAppletContext();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.getAppletContext(" + ')');
		}
	}

	public final URL getCodeBase() {
		try {
			if (Class284.aFrame2168 != null)
				return null;
			if (Class76_Sub11.anApplet3799 != null && Class76_Sub11.anApplet3799 != this)
				return Class76_Sub11.anApplet3799.getCodeBase();
			return super.getCodeBase();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void stop() {
		try {
			if (this == Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 && !Class98_Sub10_Sub21.aBoolean5646)
				Class180.aLong3404 = Class343.method3819(-47) + 4000L;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.stop(" + ')');
		}
	}

	public abstract void init();

	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	String method94(int i) {
		try {
			if (i != 0)
				aBoolean1 = true;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.H(" + i + ')');
		}
	}

	public final void windowClosing(WindowEvent windowevent) {
		try {
			destroy();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.windowClosing(" + (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void paint(Graphics graphics) {
		do {
			try {
				if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 == this && !Class98_Sub10_Sub21.aBoolean5646) {
					Class246_Sub10.aBoolean5152 = true;
					if (!Class237.aBoolean1803 || (-client.aLong3547 + Class343.method3819(-47) <= 1000L))
						break;
					Rectangle rectangle = graphics.getClipBounds();
					if (rectangle == null || ((Class188.anInt1453 <= rectangle.width) && (Class123_Sub1.anInt4744 <= rectangle.height)))
						Class224_Sub2_Sub1.aBoolean6142 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ue.paint(" + (graphics != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	abstract void method95(int i);

	static final int findPath(Collision collision, int entitySize, int[] xBuffer, int objectFlag, int i_20_, int targetingY, int radiusY, int startY, int[] yBuffer, boolean searchAlternativePath, int targetingX, int entityCost, int dumb, int startX, int radiusX) {
		try {
			for (int x = 0; x < 128; x++) {
				for (int y = 0; y < 128; y++) {
					PlayerUpdateMask.pathDirections[x][y] = 0;
					Class339.pathCosts[x][y] = 99999999;
				}
			}
			boolean pathFound;
			if (entitySize != 1) {
				if (entitySize == 2) {
					pathFound = Class146_Sub2.findPathForDoubleSize(collision, radiusY, radiusX, objectFlag, entityCost, i_20_, startX, dumb ^ 0x29ddf632, targetingY, targetingX, startY);
				} else {
					pathFound = Class98_Sub46_Sub10.findPathForVariableSize(entitySize, radiusY, startX, i_20_, startY, (byte) 20, entityCost, objectFlag, radiusX, targetingX, targetingY, collision);
				}
			} else {
				pathFound = Class98_Sub43_Sub4.findPathForSingleSize(entityCost, 14664, radiusY, startX, objectFlag, targetingX, collision, targetingY, i_20_, radiusX, startY);
			}
			int startingX = startX + -64;
			int startingY = startY + -64;
			if (dumb != 48)
				anInt2 = -57;
			int endingX = Class199.pathEndX;
			int endingY = Class22.pathEndY;
			if (!pathFound) {
				if (searchAlternativePath) {
					int shortestDistance = 2147483647;
					int lowestCost = 2147483647;
					int checkRadius = 10;
					for (int x = -checkRadius + targetingX; targetingX + checkRadius >= x; x++) {
						for (int y = -checkRadius + targetingY; checkRadius + targetingY >= y; y++) {
							int i_42_ = x - startingX;
							int i_43_ = y - startingY;
							if (i_42_ >= 0 && i_43_ >= 0 && i_42_ < 128 && i_43_ < 128 && (Class339.pathCosts[i_42_][i_43_] < 100)) {
								int deltaX = 0;
								if (targetingX > x)
									deltaX = -x + targetingX;
								else if (targetingX + (radiusX + -1) < x)
									deltaX = -radiusX + (-targetingX - -1) + x;
								int deltaY = 0;
								if (y >= targetingY) {
									if (y > radiusY + (targetingY - 1))
										deltaY = y + 1 + (-radiusY + -targetingY);
								} else
									deltaY = -y + targetingY;
								int distance = deltaX * deltaX + deltaY * deltaY;
								if (shortestDistance > distance || (distance == shortestDistance && (Class339.pathCosts[i_42_][i_43_]) < lowestCost)) {
									endingY = y;
									endingX = x;
									shortestDistance = distance;
									lowestCost = (Class339.pathCosts[i_42_][i_43_]);
								}
							}
						}
					}
					if (shortestDistance == 2147483647)
						return -1;
				} else
					return -1;
			}
			if (endingX == startX && startY == endingY)
				return 0;
			int pathIndex = 0;
			Class359.pathBufferX[pathIndex] = endingX;
			Class75.pathBufferY[pathIndex++] = endingY;
			int lastDirection;
			int currentDirection = lastDirection = (PlayerUpdateMask.pathDirections[-startingX + endingX][-startingY + endingY]);
			while (endingX != startX || startY != endingY) {
				if (currentDirection != lastDirection) {
					lastDirection = currentDirection;
					Class359.pathBufferX[pathIndex] = endingX;
					Class75.pathBufferY[pathIndex++] = endingY;
				}
				if ((currentDirection & 0x2) == 0) {
					if ((currentDirection & 0x8) != 0)
						endingX--;
				} else
					endingX++;
				if ((currentDirection & 0x1) == 0) {
					if ((0x4 & currentDirection) != 0)
						endingY--;
				} else
					endingY++;
				currentDirection = (PlayerUpdateMask.pathDirections[-startingX + endingX][-startingY + endingY]);
			}
			int stepCount = 0;
			while (pathIndex-- > 0) {
				xBuffer[stepCount] = Class359.pathBufferX[pathIndex];
				yBuffer[stepCount++] = Class75.pathBufferY[pathIndex];
				if (stepCount >= xBuffer.length)
					break;
			}
			return stepCount;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.K(" + (collision != null ? "{...}" : "null") + ',' + entitySize + ',' + (xBuffer != null ? "{...}" : "null") + ',' + objectFlag + ',' + i_20_ + ',' + targetingY + ',' + radiusY + ',' + startY + ',' + (yBuffer != null ? "{...}" : "null") + ',' + searchAlternativePath + ',' + targetingX + ',' + entityCost + ',' + dumb + ',' + startX + ',' + radiusX + ')'));
		}
	}

	public Applet_Sub1() {
		aBoolean1 = false;
	}

	public final void focusGained(FocusEvent focusevent) {
		try {
			Class153.aBoolean1228 = true;
			Class246_Sub10.aBoolean5152 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.focusGained(" + (focusevent != null ? "{...}" : "null") + ')'));
		}
	}

	final void method97(byte i, String string) {
		try {
			if (!aBoolean3) {
				aBoolean3 = true;
				System.out.println("error_game_" + string);
				try {
					Class203.method2704("loggedout", Class76_Sub11.anApplet3799, -26978);
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					getAppletContext().showDocument(new URL(getCodeBase(), ("error_game_" + string + ".ws")), "_top");
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ue.A(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method98(boolean bool, int i) {
		try {
			synchronized (this) {
				if (Class98_Sub10_Sub21.aBoolean5646)
					return;
				if (i != 18192)
					return;
				Class98_Sub10_Sub21.aBoolean5646 = true;
			}
			System.out.println("Shutdown start - clean:" + bool);
			if (Class76_Sub11.anApplet3799 != null)
				Class76_Sub11.anApplet3799.destroy();
			try {
				method92(false);
			} catch (Exception exception) {
				/* empty */
			}
			if (aBoolean1) {
				try {
					jagmisc.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				aBoolean1 = false;
			}
			Class192.method2652(-87, true);
			Class351.method3847(-91);
			if (Class42_Sub3.aCanvas5361 != null) {
				try {
					Class42_Sub3.aCanvas5361.removeFocusListener(this);
					Class42_Sub3.aCanvas5361.getParent().remove(Class42_Sub3.aCanvas5361);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (Class98_Sub43_Sub2.aClass88_5907 != null) {
				try {
					Class98_Sub43_Sub2.aClass88_5907.method874(103);
				} catch (Exception exception) {
					/* empty */
				}
			}
			method90(0);
			if (Class284.aFrame2168 != null) {
				Class284.aFrame2168.setVisible(false);
				Class284.aFrame2168.dispose();
				Class284.aFrame2168 = null;
			}
			System.out.println("Shutdown complete - clean:" + bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ue.I(" + bool + ',' + i + ')');
		}
	}
}
