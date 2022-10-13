/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.net.InetAddress;

import jagex3.jagmisc.jagmisc;

final class Class265 implements Runnable {
	static short aShort1973;
	static ha aHa1974;
	static int anInt1975;
	private Thread aThread1976;
	static short[] aShortArray1977;
	static String aString1978 = null;
	static GameInterfaceData aClass293_1979;
	private LinkedList aClass148_1980 = new LinkedList();
	static int[] anIntArray1981;
	static IComponentSettings aClass98_Sub49_1982;
	static int anInt1983;

	private final void method3228(int i, Node class98) {
		do {
			try {
				synchronized (aClass148_1980) {
					aClass148_1980.add_last(class98, i + -20911);
					aClass148_1980.notify();
				}
				if (i == 0)
					break;
				method3231(-48);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qia.A(" + i + ',' + (class98 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final void run() {
		try {
			for (;;) {
				Class98_Sub4 class98_sub4;
				synchronized (aClass148_1980) {
					Node class98;
					for (class98 = aClass148_1980.method2421(6494); class98 == null; class98 = aClass148_1980.method2421(6494)) {
						try {
							aClass148_1980.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					if (!(class98 instanceof Class98_Sub4))
						break;
					class98_sub4 = (Class98_Sub4) class98;
				}
				int i;
				try {
					byte[] is = InetAddress.getByName(((Class98_Sub4) class98_sub4).aString3829).getAddress();
					i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
				} catch (Throwable throwable) {
					i = 1000;
				}
				((Class98_Sub4) class98_sub4).anInt3827 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qia.run(" + ')');
		}
	}

	final Class98_Sub4 method3229(int i, String string) {
		try {
			if (i <= 43)
				return null;
			if (aThread1976 == null)
				throw new IllegalStateException("");
			if (string == null)
				throw new IllegalArgumentException("");
			Class98_Sub4 class98_sub4 = new Class98_Sub4(string);
			method3228(0, class98_sub4);
			return class98_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qia.D(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method3230(int i, int i_0_) {
		try {
			int i_1_ = -80 / ((i - -67) / 47);
			if ((i_0_ ^ 0xffffffff) != -1 && i_0_ != 1 && i_0_ != 2)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qia.E(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method3231(int i) {
		try {
			aClass293_1979 = null;
			anIntArray1981 = null;
			aClass98_Sub49_1982 = null;
			aString1978 = null;
			aHa1974 = null;
			int i_2_ = -16 % ((i - -4) / 60);
			aShortArray1977 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qia.C(" + i + ')');
		}
	}

	public Class265() {
		try {
			aThread1976 = new Thread(this);
			aThread1976.setDaemon(true);
			aThread1976.start();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qia.<init>(" + ')');
		}
	}

	final void method3232(byte i) {
		try {
			if (aThread1976 != null) {
				method3228(0, new Node());
				if (i == -103) {
					try {
						aThread1976.join();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					aThread1976 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qia.B(" + i + ')');
		}
	}

	static {
		aShort1973 = (short) 256;
		aShortArray1977 = new short[256];
		aClass293_1979 = null;
		anIntArray1981 = new int[14];
		anInt1983 = 0;
		aClass98_Sub49_1982 = new IComponentSettings(0, -1);
	}
}
