
/* Class77_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class Class77_Sub1 extends RtKeyListener implements KeyListener, FocusListener {
	static Class348 aClass348_3801;
	private LinkedList aClass148_3802 = new LinkedList();
	static int anInt3803 = -2;
	static int[] anIntArray3804;
	static Class326 aClass326_3805;
	private LinkedList aClass148_3806 = new LinkedList();
	private Component aComponent3807;
	private boolean[] aBooleanArray3808 = new boolean[112];

	public final synchronized void keyTyped(KeyEvent keyevent) {
		try {
			char c = keyevent.getKeyChar();
			if (c != 0 && Class111.method2089((byte) 102, c)) {
				method786(3, -1, c, false);
				keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.keyTyped(" + (keyevent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void keyReleased(KeyEvent keyevent) {
		try {
			method783((byte) 61, 1, keyevent);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oca.keyReleased(" + (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	static final boolean method781(byte i, String string) {
		try {
			if (i != 53)
				anIntArray3804 = null;
			return IncomingMessages.method468(true, 30883, 10, string);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oca.J(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method773(byte i) {
		try {
			if (i <= -9)
				method782(128);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.B(" + i + ')');
		}
	}

	private final void method782(int i) {
		try {
			if (aComponent3807 != null) {
				aComponent3807.removeKeyListener(this);
				aComponent3807.removeFocusListener(this);
				aComponent3807 = null;
				for (int i_0_ = 0; i_0_ < 112; i_0_++)
					aBooleanArray3808[i_0_] = false;
				if (i != 128)
					aClass348_3801 = null;
				aClass148_3802.method2422((byte) 47);
				aClass148_3806.method2422((byte) 47);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.Q(" + i + ')');
		}
	}

	private final void method783(byte i, int i_1_, KeyEvent keyevent) {
		try {
			int i_2_ = keyevent.getKeyCode();
			if (i != 61)
				aBooleanArray3808 = null;
			if (i_2_ != 0) {
				if (i_2_ >= 0 && Class87.anIntArray667.length > i_2_) {
					i_2_ = Class87.anIntArray667[i_2_];
					if (i_1_ != 0 || (i_2_ & 0x80) == 0)
						i_2_ &= ~0x80;
					else
						i_2_ = 0;
				} else
					i_2_ = 0;
			} else
				i_2_ = 0;
			if (i_2_ != 0) {
				method786(i_1_, i_2_, '\0', false);
				keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oca.K(" + i + ',' + i_1_ + ',' + (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	private final int method784(byte i) {
		try {
			int i_3_ = 0;
			if (aBooleanArray3808[81])
				i_3_ |= 0x1;
			if (i <= 32)
				return -81;
			if (aBooleanArray3808[82])
				i_3_ |= 0x4;
			if (aBooleanArray3808[86])
				i_3_ |= 0x2;
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.L(" + i + ')');
		}
	}

	final synchronized void method774(byte i) {
		do {
			try {
				aClass148_3802.method2422((byte) 47);
				for (Class98_Sub8 class98_sub8 = (Class98_Sub8) aClass148_3806.method2421(6494); class98_sub8 != null; class98_sub8 = (Class98_Sub8) aClass148_3806.method2421(6494)) {
					class98_sub8.anInt3266 = method784((byte) 127);
					if (class98_sub8.anInt3268 != 0) {
						if (class98_sub8.anInt3268 == 1) {
							if (aBooleanArray3808[class98_sub8.anInt3269]) {
								aClass148_3802.add_last(class98_sub8, -20911);
								aBooleanArray3808[class98_sub8.anInt3269] = false;
							}
						} else if (class98_sub8.anInt3268 == -1) {
							for (int i_4_ = 0; i_4_ < 112; i_4_++) {
								if (aBooleanArray3808[i_4_]) {
									Class98_Sub8 class98_sub8_5_ = new Class98_Sub8();
									class98_sub8_5_.anInt3266 = (class98_sub8.anInt3266);
									class98_sub8_5_.anInt3269 = i_4_;
									class98_sub8_5_.aLong3267 = (class98_sub8.aLong3267);
									class98_sub8_5_.anInt3268 = 1;
									class98_sub8_5_.aChar3265 = '\0';
									aClass148_3802.add_last(class98_sub8_5_, -20911);
									aBooleanArray3808[i_4_] = false;
								}
							}
						} else if (class98_sub8.anInt3268 == 3)
							aClass148_3802.add_last(class98_sub8, -20911);
					} else {
						if (!aBooleanArray3808[class98_sub8.anInt3269]) {
							Class98_Sub8 class98_sub8_6_ = new Class98_Sub8();
							class98_sub8_6_.aLong3267 = class98_sub8.aLong3267;
							class98_sub8_6_.anInt3266 = class98_sub8.anInt3266;
							class98_sub8_6_.anInt3268 = 0;
							class98_sub8_6_.aChar3265 = '\0';
							class98_sub8_6_.anInt3269 = class98_sub8.anInt3269;
							aClass148_3802.add_last(class98_sub8_6_, -20911);
							aBooleanArray3808[(class98_sub8.anInt3269)] = true;
						}
						class98_sub8.anInt3268 = 2;
						aClass148_3802.add_last(class98_sub8, -20911);
					}
				}
				if (i <= -74)
					break;
				method789(102);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "oca.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method785(int i) {
		try {
			if (i != 3)
				method785(48);
			aClass348_3801 = null;
			anIntArray3804 = null;
			aClass326_3805 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.O(" + i + ')');
		}
	}

	public final synchronized void focusLost(FocusEvent focusevent) {
		try {
			method786(-1, 0, '\0', false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oca.focusLost(" + (focusevent != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method786(int i, int i_7_, char c, boolean bool) {
		try {
			Class98_Sub8 class98_sub8 = new Class98_Sub8();
			class98_sub8.anInt3269 = i_7_;
			class98_sub8.aChar3265 = c;
			class98_sub8.anInt3268 = i;
			class98_sub8.aLong3267 = Class343.method3819(-47);
			if (bool != false)
				aClass326_3805 = null;
			aClass148_3806.add_last(class98_sub8, -20911);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oca.N(" + i + ',' + i_7_ + ',' + c + ',' + bool + ')'));
		}
	}

	static final void method787(byte i, int i_8_) {
		try {
			if (i <= 88)
				method787((byte) -39, 78);
			Class246_Sub4_Sub1.aClass79_6170.method800((byte) 62, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.I(" + i + ',' + i_8_ + ')');
		}
	}

	private final void method788(Component component, int i) {
		do {
			try {
				method782(128);
				aComponent3807 = component;
				Method method = Class88.aMethod700;
				if (method != null) {
					try {
						method.invoke(aComponent3807, new Object[] { Boolean.FALSE });
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				aComponent3807.addKeyListener(this);
				aComponent3807.addFocusListener(this);
				if (i <= -117)
					break;
				keyReleased(null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("oca.P(" + (component != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final synchronized void keyPressed(KeyEvent keyevent) {
		try {
			method783((byte) 61, 0, keyevent);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oca.keyPressed(" + (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method789(int i) {
		try {
			for (Class98_Sub33 class98_sub33 = (Class98_Sub33) Class191.aClass148_1478.method2418(32); class98_sub33 != null; class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478.method2417(94))) {
				if (class98_sub33.aBoolean4124)
					class98_sub33.remove();
				else {
					class98_sub33.aBoolean4123 = true;
					if (class98_sub33.anInt4112 >= 0 && class98_sub33.anInt4113 >= 0 && GameWorld.size_x > class98_sub33.anInt4112 && (GameWorld.size_y > class98_sub33.anInt4113))
						Class98_Sub46_Sub9.method1558((byte) 109, class98_sub33);
				}
			}
			for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) OutgoingPacket.aClass148_3866.method2418(32)); class98_sub33 != null; class98_sub33 = (Class98_Sub33) OutgoingPacket.aClass148_3866.method2417(98)) {
				if (!class98_sub33.aBoolean4124)
					class98_sub33.aBoolean4123 = true;
				else
					class98_sub33.remove();
			}
			int i_9_ = -114 % ((81 - i) / 36);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.M(" + i + ')');
		}
	}

	final boolean is_key_down(int i, int i_10_) {
		try {
			if (i < 0 || i >= 112)
				return false;
			if (i_10_ != 5503)
				return true;
			return aBooleanArray3808[i];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.C(" + i + ',' + i_10_ + ')');
		}
	}

	final Interface7 method776(byte i) {
		try {
			if (i != 31)
				aClass148_3802 = null;
			return (Interface7) aClass148_3802.method2421(6494);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.A(" + i + ')');
		}
	}

	Class77_Sub1(Component component) {
		try {
			Class202.method2703(false);
			method788(component, -124);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oca.<init>(" + (component != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass348_3801 = new Class348(1, 2, 2, 0);
	}
}
