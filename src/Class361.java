/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

final class Class361 implements Runnable {
	private boolean aBoolean3078;
	private Class143 aClass143_3079;
	private int anInt3080;
	private Class88 aClass88_3081;
	private OutputStream anOutputStream3082;
	private Socket aSocket3083;
	private InputStream anInputStream3084;
	private int anInt3085 = 0;
	private byte[] aByteArray3086;
	private int anInt3087;
	private boolean aBoolean3088;
	static int anInt3089 = 0;

	static final int method3914(int i) {
		try {
			if (i != -5133)
				anInt3089 = -25;
			int i_0_ = Class45.aClass75_381.method736((byte) -10);
			if (Class98_Sub10_Sub1.aClass75Array5542.length + -1 > i_0_)
				Class45.aClass75_381 = Class98_Sub10_Sub1.aClass75Array5542[1 + i_0_];
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.C(" + i + ')');
		}
	}

	final int method3915(int i) throws IOException {
		try {
			if (aBoolean3088)
				return 0;
			if (i < 70)
				anInputStream3084 = null;
			return anInputStream3084.available();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.B(" + i + ')');
		}
	}

	final void method3916(boolean bool) throws IOException {
		try {
			if (bool != true)
				anInt3080 = 96;
			if (!aBoolean3088) {
				if (aBoolean3078) {
					aBoolean3078 = false;
					throw new IOException();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.H(" + bool + ')');
		}
	}

	static final int method3917(int i) {
		try {
			if (i != -13)
				return -77;
			return Class98_Sub46_Sub15.method1610(false, (byte) 90);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.E(" + i + ')');
		}
	}

	final int method3918(int i) throws IOException {
		try {
			if (aBoolean3088)
				return 0;
			if (i != -14234)
				return 33;
			return anInputStream3084.read();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.D(" + i + ')');
		}
	}

	static final void method3919(byte i, Class98_Sub22_Sub1 class98_sub22_sub1) {
		try {
			Class98_Sub19 class98_sub19 = (Class98_Sub19) Class186.aClass148_3428.method2418(32);
			if (class98_sub19 != null) {
				boolean bool = false;
				for (int i_1_ = 0; (class98_sub19.anInt3960 > i_1_); i_1_++) {
					if ((class98_sub19.aClass143Array3962[i_1_]) != null) {
						if ((class98_sub19.aClass143Array3962[i_1_].anInt1163) == 2)
							class98_sub19.anIntArray3957[i_1_] = -5;
						if ((class98_sub19.aClass143Array3962[i_1_].anInt1163) == 0)
							bool = true;
					}
					if ((class98_sub19.aClass143Array3961[i_1_]) != null) {
						if ((class98_sub19.aClass143Array3961[i_1_].anInt1163) == 2)
							class98_sub19.anIntArray3957[i_1_] = -6;
						if ((class98_sub19.aClass143Array3961[i_1_].anInt1163) == 0)
							bool = true;
					}
				}
				if (!bool) {
					int i_2_ = class98_sub22_sub1.position;
					class98_sub22_sub1.writeInt(i + 1571862949, class98_sub19.anInt3954);
					if (i != -61)
						anInt3089 = 82;
					for (int i_3_ = 0; class98_sub19.anInt3960 > i_3_; i_3_++) {
						if ((class98_sub19.anIntArray3957[i_3_]) != 0)
							class98_sub22_sub1.writeByte((class98_sub19.anIntArray3957[i_3_]));
						else {
							try {
								int i_4_ = (class98_sub19.anIntArray3953[i_3_]);
								if (i_4_ == 0) {
									Field field = ((Field) (class98_sub19.aClass143Array3962[i_3_].anObject1162));
									int i_5_ = field.getInt(null);
									class98_sub22_sub1.writeByte(0);
									class98_sub22_sub1.writeInt(i ^ ~0x5db0b954, i_5_);
								} else if (i_4_ == 1) {
									Field field = ((Field) (class98_sub19.aClass143Array3962[i_3_].anObject1162));
									field.setInt(null, (class98_sub19.anIntArray3959[i_3_]));
									class98_sub22_sub1.writeByte(0);
								} else if (i_4_ == 2) {
									Field field = ((Field) (class98_sub19.aClass143Array3962[i_3_].anObject1162));
									int i_6_ = field.getModifiers();
									class98_sub22_sub1.writeByte(0);
									class98_sub22_sub1.writeInt(1571862888, i_6_);
								}
								if (i_4_ == 3) {
									Method method = ((Method) (class98_sub19.aClass143Array3961[i_3_].anObject1162));
									byte[][] is = (class98_sub19.aByteArrayArrayArray3958[i_3_]);
									Object[] objects = new Object[is.length];
									for (int i_7_ = 0; (i_7_ < is.length); i_7_++) {
										ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_7_])));
										objects[i_7_] = objectinputstream.readObject();
									}
									Object object = method.invoke(null, objects);
									if (object != null) {
										if (!(object instanceof Number)) {
											if (object instanceof String) {
												class98_sub22_sub1.writeByte(2);
												class98_sub22_sub1.method1188((String) object, (byte) 113);
											} else
												class98_sub22_sub1.writeByte(4);
										} else {
											class98_sub22_sub1.writeByte(1);
											class98_sub22_sub1.method1221(i + -65, ((Number) object).longValue());
										}
									} else
										class98_sub22_sub1.writeByte(0);
								} else if (i_4_ == 4) {
									Method method = ((Method) (class98_sub19.aClass143Array3961[i_3_].anObject1162));
									int i_8_ = method.getModifiers();
									class98_sub22_sub1.writeByte(0);
									class98_sub22_sub1.writeInt(1571862888, i_8_);
								}
							} catch (ClassNotFoundException classnotfoundexception) {
								class98_sub22_sub1.writeByte(-10);
							} catch (java.io.InvalidClassException invalidclassexception) {
								class98_sub22_sub1.writeByte(-11);
							} catch (java.io.StreamCorruptedException streamcorruptedexception) {
								class98_sub22_sub1.writeByte(-12);
							} catch (java.io.OptionalDataException optionaldataexception) {
								class98_sub22_sub1.writeByte(-13);
							} catch (IllegalAccessException illegalaccessexception) {
								class98_sub22_sub1.writeByte(-14);
							} catch (IllegalArgumentException illegalargumentexception) {
								class98_sub22_sub1.writeByte(-15);
							} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
								class98_sub22_sub1.writeByte(-16);
							} catch (SecurityException securityexception) {
								class98_sub22_sub1.writeByte(-17);
							} catch (IOException ioexception) {
								class98_sub22_sub1.writeByte(-18);
							} catch (NullPointerException nullpointerexception) {
								class98_sub22_sub1.writeByte(-19);
							} catch (Exception exception) {
								class98_sub22_sub1.writeByte(-20);
							} catch (Throwable throwable) {
								class98_sub22_sub1.writeByte(-21);
							}
						}
					}
					class98_sub22_sub1.method1196(i_2_, (byte) -32);
					class98_sub19.remove();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vt.G(" + i + ',' + (class98_sub22_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3920(byte i, int i_9_, int i_10_, byte[] is) throws IOException {
		try {
			if (!aBoolean3088) {
				if (aBoolean3078) {
					aBoolean3078 = false;
					throw new IOException();
				}
				if (aByteArray3086 == null)
					aByteArray3086 = new byte[anInt3080];
				synchronized (this) {
					for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
						aByteArray3086[anInt3085] = is[i_11_ + i_9_];
						anInt3085 = (1 + anInt3085) % anInt3080;
						if ((anInt3087 - (-anInt3080 - -100)) % anInt3080 == anInt3085)
							throw new IOException();
					}
					if (i != 77)
						anInt3087 = 85;
					if (aClass143_3079 == null)
						aClass143_3079 = aClass88_3081.method858(3, this, 1);
					this.notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vt.F(" + i + ',' + i_9_ + ',' + i_10_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3921(int i, boolean bool, int i_12_, byte[] is) throws IOException {
		try {
			if (bool != true)
				finalize();
			if (!aBoolean3088) {
				int i_13_;
				for (/**/; i_12_ > 0; i_12_ -= i_13_) {
					i_13_ = anInputStream3084.read(is, i, i_12_);
					if (i_13_ <= 0)
						throw new EOFException();
					i += i_13_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vt.A(" + i + ',' + bool + ',' + i_12_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3922(int i) {
		try {
			if (!aBoolean3088) {
				anInputStream3084 = new InputStream_Sub1();
				anOutputStream3082 = new OutputStream_Sub1();
				int i_14_ = -63 % ((4 - i) / 58);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.I(" + i + ')');
		}
	}

	protected final void finalize() {
		try {
			method3923(-29789);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.finalize(" + ')');
		}
	}

	final void method3923(int i) {
		try {
			if (!aBoolean3088) {
				synchronized (this) {
					aBoolean3088 = true;
					if (i != -29789)
						method3922(-126);
					this.notifyAll();
				}
				if (aClass143_3079 != null) {
					while (aClass143_3079.anInt1163 == 0)
						Class246_Sub7.method3131(0, 1L);
					if (aClass143_3079.anInt1163 == 1) {
						try {
							((Thread) aClass143_3079.anObject1162).join();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				aClass143_3079 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.J(" + i + ')');
		}
	}

	public final void run() {
		try {
			try {
				for (;;) {
					int i;
					int i_15_;
					synchronized (this) {
						if (anInt3087 == anInt3085) {
							if (aBoolean3088)
								break;
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						i = anInt3087;
						if (anInt3087 > anInt3085)
							i_15_ = -anInt3087 + anInt3080;
						else
							i_15_ = anInt3085 - anInt3087;
					}
					if (i_15_ > 0) {
						try {
							anOutputStream3082.write(aByteArray3086, i, i_15_);
						} catch (IOException ioexception) {
							aBoolean3078 = true;
						}
						anInt3087 = (i_15_ + anInt3087) % anInt3080;
						try {
							if (anInt3087 == anInt3085)
								anOutputStream3082.flush();
						} catch (IOException ioexception) {
							aBoolean3078 = true;
						}
					}
				}
				try {
					if (anInputStream3084 != null)
						anInputStream3084.close();
					if (anOutputStream3082 != null)
						anOutputStream3082.close();
					if (aSocket3083 != null)
						aSocket3083.close();
				} catch (IOException ioexception) {
					/* empty */
				}
				aByteArray3086 = null;
			} catch (Exception exception) {
				Map.method3585(exception, -128, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vt.run(" + ')');
		}
	}

	Class361(Socket socket, Class88 class88, int i) throws IOException {
		aBoolean3078 = false;//steven
		aBoolean3088 = false;
		anInt3087 = 0;
		try {
			//   System.out.println(socket);
			aSocket3083 = socket;
			aClass88_3081 = class88;
			aSocket3083.setSoTimeout(30000);
			aSocket3083.setTcpNoDelay(true);
			anInputStream3084 = aSocket3083.getInputStream();
			anOutputStream3082 = aSocket3083.getOutputStream();
			anInt3080 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vt.<init>(" + (socket != null ? "{...}" : "null") + ',' + (class88 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
