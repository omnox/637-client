/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;

final class Class363 implements Runnable {
	private Class368[] aClass368Array3094;
	static int anInt3095;
	private Class143 aClass143_3096;
	private Thread aThread3097;
	static int anInt3098;
	static int anInt3099 = 0;
	private volatile boolean aBoolean3100;

	public final void run() {
		try {
			try {
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader((DataInputStream) aClass143_3096.anObject1162)));
				String string = bufferedreader.readLine();
				Class267 class267 = Class98_Sub10_Sub2.method1010(120);
				for (/**/; string != null; string = bufferedreader.readLine())
					class267.method3245(string, 0);
				String[] strings = class267.method3244(20780);
				if ((strings.length % 3 ^ 0xffffffff) != -1)
					return;
				aClass368Array3094 = new Class368[strings.length / 3];
				for (int i = 0; (i ^ 0xffffffff) > (strings.length ^ 0xffffffff); i += 3)
					aClass368Array3094[i / 3] = new Class368(strings[i], strings[i + 1], strings[2 + i]);
			} catch (java.io.IOException ioexception) {
				/* empty */
			}
			aBoolean3100 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vv.run(" + ')');
		}
	}

	final boolean method3928(int i) {
		try {
			if (i != -1)
				return false;
			if (aBoolean3100)
				return true;
			if (aClass143_3096 == null) {
				try {
					int i_0_ = ((Class64_Sub29.aClass196_3720 == Class43.aClass196_375) ? 80 : 7000 + ((Class354) (Class98_Sub46_Sub17.aClass354_6050)).anInt3011);
					aClass143_3096 = (Class98_Sub43_Sub2.aClass88_5907.method866(-106, new URL("http://" + (((Class354) (Class98_Sub46_Sub17.aClass354_6050)).aString3016) + ":" + i_0_ + "/news.ws?game=" + (((Class279) Class4.aClass279_86).anInt2095))));
				} catch (java.net.MalformedURLException malformedurlexception) {
					return true;
				}
			}
			if (aClass143_3096 == null || aClass143_3096.anInt1163 == 2)
				return true;
			if ((aClass143_3096.anInt1163 ^ 0xffffffff) != -2)
				return false;
			if (aThread3097 == null) {
				aThread3097 = new Thread(this);
				aThread3097.start();
			}
			return aBoolean3100;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vv.B(" + i + ')');
		}
	}

	final Class368 method3929(int i, int i_1_) {
		try {
			if (i != 23885)
				return null;
			if (aClass368Array3094 == null || i_1_ < 0 || i_1_ >= aClass368Array3094.length)
				return null;
			return aClass368Array3094[i_1_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vv.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method3930(boolean bool, byte i, Player class246_sub3_sub4_sub2_sub2, int i_2_, int i_3_) {
		try {
			int i_4_ = (((Mobile) class246_sub3_sub4_sub2_sub2).walkQueueX[0]);
			int i_5_ = (((Mobile) class246_sub3_sub4_sub2_sub2).walkQueueZ[0]);
			if ((i_4_ ^ 0xffffffff) <= -1 && (i_4_ ^ 0xffffffff) > (GameWorld.size_x ^ 0xffffffff) && (i_5_ ^ 0xffffffff) <= -1 && (i_5_ ^ 0xffffffff) > (GameWorld.size_y ^ 0xffffffff) && ((i_3_ ^ 0xffffffff) <= -1 && (i_3_ ^ 0xffffffff) > (GameWorld.size_x ^ 0xffffffff) && (i_2_ ^ 0xffffffff) <= -1 && (i_2_ ^ 0xffffffff) > (GameWorld.size_y ^ 0xffffffff))) {
				int i_6_ = (Applet_Sub1.findPath((Class167.aClass243Array1281[(((AnimableEntity) class246_sub3_sub4_sub2_sub2).height_level)]), class246_sub3_sub4_sub2_sub2.getSize(), Class76_Sub5.anIntArray3743, 0, 0, i_2_, 0, i_5_, Class117.anIntArray974, true, i_3_, -4, 48, i_4_, 0));
				if ((i_6_ ^ 0xffffffff) <= -2 && i_6_ <= 3) {
					if (bool != false)
						anInt3098 = 115;
					for (int i_7_ = 0; -1 + i_6_ > i_7_; i_7_++)
						class246_sub3_sub4_sub2_sub2.method3056(i, 1, Class117.anIntArray974[i_7_], Class76_Sub5.anIntArray3743[i_7_]);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vv.A(" + bool + ',' + i + ',' + ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public Class363() {
		/* empty */
	}
}
