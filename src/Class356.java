/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class Class356 {
	static int anInt3018 = 100;
	private long aLong3019;
	static int anInt3020;
	private RandomAccessFile aRandomAccessFile3021;
	private File aFile3022;
	static Class97[] aClass97Array3023 = new Class97[14];
	private long aLong3024;
	static int anInt3025;

	final File method3876(byte i) {
		try {
			if (i != 3)
				return null;
			return aFile3022;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vl.G(" + i + ')');
		}
	}

	final void method3877(byte i, long l) throws IOException {
		try {
			int i_0_ = -7 % ((i - 31) / 36);
			aRandomAccessFile3021.seek(l);
			aLong3019 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vl.A(" + i + ',' + l + ')');
		}
	}

	final long method3878(byte i) throws IOException {
		try {
			if (i > -17)
				method3876((byte) 94);
			return aRandomAccessFile3021.length();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vl.F(" + i + ')');
		}
	}

	final int method3879(int i, byte i_1_, int i_2_, byte[] is) throws IOException {
		try {
			if (i_1_ != -26)
				aLong3024 = -32L;
			int i_3_ = aRandomAccessFile3021.read(is, i_2_, i);
			if (i_3_ > 0)
				aLong3019 += i_3_;
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vl.C(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3880(boolean bool) throws IOException {
		do {
			try {
				if (aRandomAccessFile3021 != null) {
					aRandomAccessFile3021.close();
					aRandomAccessFile3021 = null;
				}
				if (bool == true)
					break;
				method3876((byte) -68);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vl.E(" + bool + ')');
			}
			break;
		} while (false);
	}

	Class356(File file, String string, long l) throws IOException {
		try {
			if (l == -1L)
				l = 9223372036854775807L;
			if (l < file.length())
				file.delete();
			aRandomAccessFile3021 = new RandomAccessFile(file, string);
			aLong3024 = l;
			aLong3019 = 0L;
			aFile3022 = file;
			int i = aRandomAccessFile3021.read();
			if (i != -1 && !string.equals("r")) {
				aRandomAccessFile3021.seek(0L);
				aRandomAccessFile3021.write(i);
			}
			aRandomAccessFile3021.seek(0L);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vl.<init>(" + (file != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + l + ')'));
		}
	}

	public static void method3881(int i) {
		try {
			if (i != -14445)
				method3881(107);
			aClass97Array3023 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vl.D(" + i + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			if (aRandomAccessFile3021 != null) {
				System.out.println("Warning! fileondisk " + aFile3022 + " not closed correctly using close(). Auto-closing instead. ");
				method3880(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vl.finalize(" + ')');
		}
	}

	final void method3882(byte[] is, int i, int i_4_, int i_5_) throws IOException {
		try {
			if (aLong3024 < (long) i_5_ - -aLong3019) {
				aRandomAccessFile3021.seek(aLong3024);
				aRandomAccessFile3021.write(1);
				throw new EOFException();
			}
			aRandomAccessFile3021.write(is, i_4_, i_5_);
			if (i != 4657)
				method3876((byte) 49);
			aLong3019 += i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vl.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}
}
