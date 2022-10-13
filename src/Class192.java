/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class192 {
	private static int anInt1481 = 0;
	private static boolean aBoolean1482 = false;
	private static LinkedList aClass148_1483 = new LinkedList();

	static final synchronized void method2652(int i, boolean bool) {
		try {
			if (i >= -41)
				method2652(-3, false);
			aBoolean1482 = bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final synchronized void method2653(int i) {
		do {
			try {
				if (i <= -24) {
					anInt1481--;
					if (anInt1481 != 0)
						break;
					method2656(0);
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method2654(boolean bool, Interface9 interface9) {
		do {
			try {
				if (!aBoolean1482) {
					if (anInt1481 <= 0)
						interface9.w(false);
					else {
						Class98_Sub51 class98_sub51 = new Class98_Sub51();
						((Class98_Sub51) class98_sub51).anInterface9_4295 = interface9;
						aClass148_1483.add_last(class98_sub51, -20911);
					}
					if (bool == false)
						break;
					aClass148_1483 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method2655(int i) {
		do {
			try {
				anInt1481++;
				if (i == -374)
					break;
				method2656(-76);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method2656(int i) {
		do {
			try {
				for (;;) {
					Class98_Sub51 class98_sub51 = (Class98_Sub51) aClass148_1483.method2421(6494);
					if (class98_sub51 == null)
						break;
					((Class98_Sub51) class98_sub51).anInterface9_4295.w(true);
					class98_sub51.remove();
				}
				if (i == 0)
					break;
				method2653(11);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
