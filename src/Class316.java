/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class316 {
	private static String aString2693;
	private static Hashtable aHashtable2694;
	private static boolean aBoolean2695 = false;
	private static int anInt2696;
	private static String aString2697;

	public static File method3648(int i, int i_0_, String string, String string_1_) {
		try {
			if (!aBoolean2695)
				throw new RuntimeException("");
			File file = (File) aHashtable2694.get(string);
			if (file != null)
				return file;
			String[] strings = { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString2693, "/tmp/", "" };
			String[] strings_2_ = { ".YOUR CLIENT NAME HERE_cache_" + i, ".file_store_" + i };
			for (int i_3_ = i_0_; (i_3_ ^ 0xffffffff) > -3; i_3_++) {
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (strings_2_.length ^ 0xffffffff); i_4_++) {
					for (int i_5_ = 0; strings.length > i_5_; i_5_++) {
						String string_6_ = (strings[i_5_] + strings_2_[i_4_] + "/" + (string_1_ != null ? string_1_ + "/" : "") + string);
						RandomAccessFile randomaccessfile = null;
						try {
							File file_7_ = new File(string_6_);
							if ((i_3_ ^ 0xffffffff) != -1 || file_7_.exists()) {
								String string_8_ = strings[i_5_];
								if ((i_3_ ^ 0xffffffff) != -2 || string_8_.length() <= 0 || new File(string_8_).exists()) {
									new File(strings[i_5_] + strings_2_[i_4_]).mkdir();
									if (string_1_ != null)
										new File(strings[i_5_] + strings_2_[i_4_] + "/" + string_1_).mkdir();
									randomaccessfile = new RandomAccessFile(file_7_, "rw");
									int i_9_ = randomaccessfile.read();
									randomaccessfile.seek(0L);
									randomaccessfile.write(i_9_);
									randomaccessfile.seek(0L);
									randomaccessfile.close();
									aHashtable2694.put(string, file_7_);
									return file_7_;
								}
							}
						} catch (Exception exception) {
							try {
								if (randomaccessfile != null) {
									randomaccessfile.close();
									Object object = null;
								}
							} catch (Exception exception_10_) {
								/* empty */
							}
						}
					}
				}
			}
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static File method3649(String string, int i) {
		try {
			int i_11_ = 33 % ((-71 - i) / 52);
			return method3648(anInt2696, 0, string, aString2697);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method3650(boolean bool, int i, String string) {
		do {
			try {
				anInt2696 = i;
				aString2697 = string;
				try {
					if (bool != false)
						break;
					aString2693 = System.getProperty("user.home");
					if (aString2693 != null)
						aString2693 += "/";
				} catch (Exception exception) {
					/* empty */
				}
				aBoolean2695 = true;
				if (aString2693 != null)
					break;
				aString2693 = "~/";
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static {
		aHashtable2694 = new Hashtable(16);
	}
}
