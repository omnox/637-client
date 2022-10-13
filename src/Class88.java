
/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Class88 implements Runnable {
	boolean aBoolean675;
	static String aString676;
	private Callback_Sub1 aCallback_Sub1_677;
	static Method aMethod678;
	private static String aString679;
	Class356 aClass356_680;
	private boolean aBoolean681;
	boolean aBoolean682;
	private Object anObject683;
	private Class20 aClass20_684;
	Class356 aClass356_685;
	private Thread aThread686;
	private Object anObject687;
	private static String aString688;
	private Class143 aClass143_689 = null;
	static String aString690;
	private static int anInt691;
	static String aString692;
	private Object anObject693;
	private static String aString694;
	Class356[] aClass356Array695;
	static String aString696;
	private Class143 aClass143_697;
	EventQueue anEventQueue698;
	static String aString699;
	static Method aMethod700;
	private static volatile long aLong701 = 0L;
	Class356 aClass356_702;
	/* synthetic */ static Class aClass703;
	/* synthetic */ static Class aClass704;
	/* synthetic */ static Class aClass705;
	/* synthetic */ static Class aClass706;

	final Class143 method858(int i, Runnable runnable, int i_0_) {
		try {
			if (i_0_ != 1)
				method874(-5);
			return method877(0, -115, i, 2, runnable);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method859(int i, String string) {
		try {
			if (i != -14)
				aClass20_684 = null;
			return method877(0, -126, 0, 16, string);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method860(byte i) {
		try {
			int i_1_ = 6 % ((-56 - i) / 40);
			if (!this.aBoolean682)
				return false;
			if (!this.aBoolean675) {
				if (anObject693 == null)
					return false;
				return true;
			}
			if (aClass20_684 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method861(int i) {
		try {
			aLong701 = 5000L + Class343.method3819(-47);
			int i_2_ = -113 / ((i - 88) / 32);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method862(int i, Frame frame) {
		try {
			if (i != -3470)
				aString692 = null;
			return method877(0, -66, 0, 7, frame);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void run() {
		try {
			for (;;) {
				Class143 class143;
				synchronized (this) {
					for (;;) {
						if (aBoolean681)
							return;
						if (aClass143_697 != null) {
							class143 = aClass143_697;
							aClass143_697 = aClass143_697.aClass143_1167;
							if (aClass143_697 == null)
								aClass143_689 = null;
							break;
						}
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					int i = class143.anInt1164;
					if (i != 1) {
						if (i == 22) {
							if (Class343.method3819(-47) < aLong701)
								throw new IOException();
							try {
								class143.anObject1162 = Class246_Sub3_Sub2_Sub1.method3006((String) (class143.anObject1161), 0, class143.anInt1166).method305(-2);
							} catch (IOException_Sub1 ioexception_sub1) {
								class143.anObject1162 = ioexception_sub1.getMessage();
								throw ioexception_sub1;
							}
						} else if (i == 2) {
							Thread thread = new Thread((Runnable) (class143.anObject1161));
							thread.setDaemon(true);
							thread.start();
							thread.setPriority(class143.anInt1166);
							class143.anObject1162 = thread;
						} else if (i != 4) {
							if (i != 8) {
								if (i == 9) {
									Object[] objects = ((Object[]) class143.anObject1161);
									if (this.aBoolean682 && ((Class) objects[0]).getClassLoader() == null)
										throw new SecurityException();
									class143.anObject1162 = (((Class) objects[0]).getDeclaredField((String) objects[1]));
								} else if (i == 18) {
									Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
									class143.anObject1162 = clipboard.getContents(null);
								} else if (i != 19) {
									if (this.aBoolean682) {
										if (i == 3) {
											if (aLong701 > Class343.method3819(-47))
												throw new IOException();
											String string = ((String.valueOf(0xff & (class143.anInt1166 >> 24))) + "." + (0xff & (class143.anInt1166 >> 16)) + "." + ((class143.anInt1166 & 0xfffc) >> 8) + "." + (0xff & class143.anInt1166));
											class143.anObject1162 = InetAddress.getByName(string).getHostName();
										} else if (i != 21) {
											if (i != 5) {
												if (i == 6) {
													Frame frame = (new Frame("Jagex Full Screen"));
													class143.anObject1162 = frame;
													frame.setResizable(false);
													if (!this.aBoolean675)
														Class.forName("Class68").getMethod("method692", (new Class[] { ((aClass703 != null) ? aClass703 : (aClass703 = (method878("java.awt.Frame")))), Integer.TYPE, Integer.TYPE, Integer.TYPE, (Integer.TYPE) })).invoke(anObject693, (new Object[] { frame, (new Integer((class143.anInt1166) >>> 16)), (new Integer((class143.anInt1166) & 0xffff)), (new Integer((class143.anInt1165) >> 16)), (new Integer((class143.anInt1165) & 0xffff)) }));
													else
														aClass20_684.method255(((class143.anInt1165) >> 16), -2147483648, ((class143.anInt1166) >>> 16), ((class143.anInt1165) & 0xffff), (0xffff & (class143.anInt1166)), frame);
												} else if (i == 7) {
													if (!this.aBoolean675)
														Class.forName("Class68").getMethod("method690", new Class[0]).invoke(anObject693, new Object[0]);
													else
														aClass20_684.method253(83, ((Frame) (class143.anObject1161)));
												} else if (i == 12) {
													Class356 class356 = (method871(aString694, ((String) (class143.anObject1161)), anInt691, (byte) -121));
													class143.anObject1162 = class356;
												} else if (i != 13) {
													if ((this.aBoolean682) && (i == 14)) {
														int i_3_ = (class143.anInt1166);
														int i_4_ = (class143.anInt1165);
														if (this.aBoolean675)
															aCallback_Sub1_677.method356(1, i_4_, i_3_);
														else
															Class.forName("Class321").getDeclaredMethod("method3668", (new Class[] { (Integer.TYPE), (Integer.TYPE) })).invoke(anObject687, (new Object[] { (new Integer(i_3_)), (new Integer(i_4_)) }));
													} else if ((this.aBoolean682) && (i == 15)) {
														boolean bool = ((class143.anInt1166) != 0);
														Component component = ((Component) (class143.anObject1161));
														if (this.aBoolean675)
															aCallback_Sub1_677.method358(bool, component, (byte) -104);
														else
															Class.forName("Class321").getDeclaredMethod("method3667", (new Class[] { ((aClass704 != null) ? aClass704 : (aClass704 = (method878("java.awt.Component")))), (Boolean.TYPE) })).invoke(anObject687, (new Object[] { component, (new Boolean(bool)) }));
													} else if ((this.aBoolean675) || i != 17) {
														if (i != 16)
															throw new Exception("");
														try {
															if (!aString699.startsWith("win"))
																throw new Exception();
															String string = ((String) (class143.anObject1161));
															if (!(string.startsWith("http://")) && !(string.startsWith("https://")))
																throw new Exception();
															String string_5_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
															for (int i_6_ = 0; ((string.length()) > i_6_); i_6_++) {
																if ((string_5_.indexOf(string.charAt(i_6_))) == -1)
																	throw new Exception();
															}
															Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
															class143.anObject1162 = null;
														} catch (Exception exception) {
															class143.anObject1162 = exception;
															throw exception;
														}
													} else {
														Object[] objects = ((Object[]) (class143.anObject1161));
														Class.forName("Class321").getDeclaredMethod("method3666", (new Class[] { ((aClass704 != null) ? aClass704 : (aClass704 = (method878("java.awt.Component")))), ((aClass705 != null) ? aClass705 : (aClass705 = (method878("[I")))), Integer.TYPE, Integer.TYPE, ((aClass706 != null) ? aClass706 : (aClass706 = (method878("java.awt.Point")))) })).invoke(anObject687, (new Object[] {objects[0], objects[1], (new Integer(class143.anInt1166)), (new Integer(class143.anInt1165)), objects[2]}));
													}
												} else {
													Class356 class356 = (method871("", ((String) (class143.anObject1161)), anInt691, (byte) -110));
													class143.anObject1162 = class356;
												}
											} else if (this.aBoolean675)
												class143.anObject1162 = aClass20_684.method252(false);
											else
												class143.anObject1162 = (Class.forName("Class68").getMethod("method693", new Class[0]).invoke(anObject693, new Object[0]));
										} else {
											if (Class343.method3819(-47) < aLong701)
												throw new IOException();
											class143.anObject1162 = InetAddress.getByName((String) (class143.anObject1161)).getAddress();
										}
									} else
										throw new Exception("");
								} else {
									Transferable transferable = ((Transferable) class143.anObject1161);
									Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
									clipboard.setContents(transferable, null);
								}
							} else {
								Object[] objects = ((Object[]) class143.anObject1161);
								if (this.aBoolean682 && (((Class) objects[0]).getClassLoader() == null))
									throw new SecurityException();
								class143.anObject1162 = (((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]));
							}
						} else {
							if (aLong701 > Class343.method3819(-47))
								throw new IOException();
							class143.anObject1162 = new DataInputStream(((URL) (class143.anObject1161)).openStream());
						}
					} else {
						if (Class343.method3819(-47) < aLong701)
							throw new IOException();
						class143.anObject1162 = new Socket((InetAddress.getByName((String) (class143.anObject1161))), class143.anInt1166);
					}
					class143.anInt1163 = 1;
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					class143.anInt1163 = 2;
				}
				synchronized (class143) {
					class143.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method863(String string, boolean bool, int i, boolean bool_7_) {
		try {
			if (bool != false)
				aCallback_Sub1_677 = null;
			return method877(0, -93, i, bool_7_ ? 22 : 1, string);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method864(int i) {
		try {
			if (i < 36)
				method861(-64);
			return method877(0, -114, 0, 5, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final Class356 method865(int i, String string) {
		try {
			if (i > -64)
				return null;
			return method871(aString694, string, anInt691, (byte) -106);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method866(int i, URL url) {
		try {
			if (i >= -96)
				method875(null, false, -55);
			return method877(0, -102, 0, 4, url);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Object method867(boolean bool) {
		try {
			if (bool != false)
				aString688 = null;
			return anObject683;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method868(int i, int i_8_) {
		try {
			if (i_8_ < 91)
				this.aBoolean682 = true;
			return method877(0, -77, i, 3, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method869(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			if (i != -21605)
				return null;
			return method877((i_9_ << 16) - -i_11_, i + 21511, i_12_ + (i_10_ << 16), 6, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method870(String string, Class var_class, int i, Class[] var_classes) {
		try {
			if (i != 0)
				method876(null, false, null);
			return method877(0, -66, 0, 8, new Object[] { var_class, string, var_classes });
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final Class356 method871(String string, String string_13_, int i, byte i_14_) {
		try {
			String string_15_;
			if (i != 33) {
				if (i != 34)
					string_15_ = ("YOUR CLIENT NAME HERE_" + string + "_preferences" + string_13_ + ".dat");
				else
					string_15_ = ("YOUR CLIENT NAME HERE_" + string + "_preferences" + string_13_ + "_wip.dat");
			} else
				string_15_ = ("YOUR CLIENT NAME HERE_" + string + "_preferences" + string_13_ + "_rc.dat");
			String[] strings = { "c:/rscache/", "/rscache/", aString679, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
			int i_16_ = -102 % ((i_14_ - -59) / 47);
			for (int i_17_ = 0; strings.length > i_17_; i_17_++) {
				String string_18_ = strings[i_17_];
				if (string_18_.length() <= 0 || new File(string_18_).exists()) {
					try {
						Class356 class356 = new Class356(new File(string_18_, string_15_), "rw", 10000L);
						return class356;
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method872(int[] is, Point point, int i, byte i_19_, int i_20_, Component component) {
		try {
			if (i_19_ < 56)
				method861(16);
			return method877(i, -101, i_20_, 17, new Object[] { component, is, point });
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method873(String string, Class var_class, int i) {
		try {
			if (i != -27303)
				return null;
			return method877(0, -72, 0, 9, new Object[] { var_class, string });
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method874(int i) {
		try {
			synchronized (this) {
				aBoolean681 = true;
				this.notifyAll();
			}
			try {
				aThread686.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			if (this.aClass356_702 != null) {
				try {
					this.aClass356_702.method3880(true);
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (i >= 54) {
				if (this.aClass356_680 != null) {
					try {
						this.aClass356_680.method3880(true);
					} catch (IOException ioexception) {
						/* empty */
					}
				}
				if (this.aClass356Array695 != null) {
					for (int i_21_ = 0; (this.aClass356Array695.length > i_21_); i_21_++) {
						if (this.aClass356Array695[i_21_] != null) {
							try {
								this.aClass356Array695[i_21_].method3880(true);
							} catch (IOException ioexception) {
								/* empty */
							}
						}
					}
				}
				if (this.aClass356_685 != null) {
					try {
						this.aClass356_685.method3880(true);
					} catch (IOException ioexception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method875(String string, boolean bool, int i) {
		try {
			if (i != 21516)
				return null;
			if (!bool)
				return method877(0, i + -21585, 0, 13, string);
			return method877(0, -119, 0, 12, string);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method876(byte[] is, boolean bool, File file) {
		try {
			try {
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				fileoutputstream.write(is, 0, is.length);
				fileoutputstream.close();
				if (bool != true)
					return false;
				return true;
			} catch (IOException ioexception) {
				throw new RuntimeException();
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final Class143 method877(int i, int i_22_, int i_23_, int i_24_, Object object) {
		try {
			if (i_22_ > -61)
				aThread686 = null;
			Class143 class143 = new Class143();
			class143.anObject1161 = object;
			class143.anInt1164 = i_24_;
			class143.anInt1166 = i_23_;
			class143.anInt1165 = i;
			synchronized (this) {
				if (aClass143_689 != null) {
					aClass143_689.aClass143_1167 = class143;
					aClass143_689 = class143;
				} else
					aClass143_689 = aClass143_697 = class143;
				this.notify();
			}
			return class143;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class88(int i, String string, int i_25_, boolean bool) throws Exception {
		this.aClass356_680 = null;
		this.aClass356_685 = null;
		aBoolean681 = false;
		aClass143_697 = null;
		this.aBoolean682 = false;
		this.aBoolean675 = false;
		this.aClass356_702 = null;
		try {
			aString692 = "1.1";
			aString694 = string;
			this.aBoolean682 = bool;
			aString696 = "Unknown";
			anInt691 = i;
			try {
				aString696 = System.getProperty("java.vendor");
				aString692 = System.getProperty("java.version");
			} catch (Exception exception) {
				/* empty */
			}
			if (aString696.toLowerCase().indexOf("microsoft") != -1)
				this.aBoolean675 = true;
			try {
				aString688 = System.getProperty("os.name");
			} catch (Exception exception) {
				aString688 = "Unknown";
			}
			aString699 = aString688.toLowerCase();
			try {
				aString690 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception exception) {
				aString690 = "";
			}
			try {
				aString676 = System.getProperty("os.version").toLowerCase();
			} catch (Exception exception) {
				aString676 = "";
			}
			try {
				aString679 = System.getProperty("user.home");
				if (aString679 != null)
					aString679 += "/";
			} catch (Exception exception) {
				/* empty */
			}
			if (aString679 == null)
				aString679 = "~/";
			try {
				this.anEventQueue698 = Toolkit.getDefaultToolkit().getSystemEventQueue();
			} catch (Throwable throwable) {
				/* empty */
			}
			if (!this.aBoolean675) {
				try {
					aMethod700 = (Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE }));
				} catch (Exception exception) {
					/* empty */
				}
				try {
					aMethod678 = (Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE }));
				} catch (Exception exception) {
					/* empty */
				}
			}
			Class316.method3650(false, anInt691, aString694);
			if (this.aBoolean682) {
				this.aClass356_685 = new Class356(Class316.method3648(anInt691, 0, "random.dat", null), "rw", 25L);
				this.aClass356_702 = new Class356(Class316.method3649("main_file_cache.dat2", 13), "rw", 209715200L);
				this.aClass356_680 = (new Class356(Class316.method3649("main_file_cache.idx255", 61), "rw", 1048576L));
				this.aClass356Array695 = new Class356[i_25_];
				for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
					this.aClass356Array695[i_26_] = new Class356((Class316.method3649("main_file_cache.idx" + i_26_, -128)), "rw", 1048576L);
				if (this.aBoolean675) {
					try {
						anObject683 = Class.forName("Class158").newInstance();
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				try {
					if (!this.aBoolean675)
						anObject693 = Class.forName("Class68").newInstance();
					else
						aClass20_684 = new Class20();
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					if (!this.aBoolean675)
						anObject687 = Class.forName("Class321").newInstance();
					else
						aCallback_Sub1_677 = new Callback_Sub1();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			if (this.aBoolean682 && !this.aBoolean675) {
				ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
				for (ThreadGroup threadgroup_27_ = threadgroup.getParent(); threadgroup_27_ != null; threadgroup_27_ = threadgroup.getParent())
					threadgroup = threadgroup_27_;
				Thread[] threads = new Thread[1000];
				threadgroup.enumerate(threads);
				for (int i_28_ = 0; threads.length > i_28_; i_28_++) {
					if (threads[i_28_] != null && threads[i_28_].getName().startsWith("AWT"))
						threads[i_28_].setPriority(1);
				}
			}
			aBoolean681 = false;
			aThread686 = new Thread(this);
			aThread686.setPriority(10);
			aThread686.setDaemon(true);
			aThread686.start();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	/* synthetic */ static Class method878(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
