/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

final class ClientScript2Runtime {
	private static int[] anIntArray1875;
	private static Class300 aClass300_1876;
	private static GameInterfaceData aClass293_1877;
	private static int[] int_stack = new int[1000];
	private static GameInterfaceData aClass293_1879;
	static int anInt1880;
	private static int[][] anIntArrayArray1881 = new int[5][5000];
	private static Calendar aCalendar1882;
	private static String[] aStringArray1883 = new String[1000];
	private static int anInt1884 = 0;
	private static int int_stack_ptr;
	private static String[] aStringArray1886;
	private static int[] anIntArray1887;
	private static int anInt1888 = 0;
	private static Class349[] aClass349Array1889;
	static Class79 aClass79_1890;
	private static int[] anIntArray1891;
	private static String[] aStringArray1892;
	private static int anInt1893;

	private static final void method3142(int i) {
		GameInterfaceData class293 = Class159.method2509(i, -9820);
		if (class293 != null) {
			int i_0_ = i >>> 16;
			GameInterfaceData[] class293s = Class64_Sub13.aClass293ArrayArray3674[i_0_];
			if (class293s == null) {
				GameInterfaceData[] class293s_1_ = Class159.gameInterfaces[i_0_];
				int i_2_ = class293s_1_.length;
				class293s = Class64_Sub13.aClass293ArrayArray3674[i_0_] = new GameInterfaceData[i_2_];
				Class236.method2892(class293s_1_, 0, class293s, 0, class293s_1_.length);
			}
			int i_3_;
			for (i_3_ = 0; i_3_ < class293s.length; i_3_++) {
				if (class293s[i_3_] == class293)
					break;
			}
			if (i_3_ < class293s.length) {
				Class236.method2892(class293s, i_3_ + 1, class293s, i_3_, class293s.length - i_3_ - 1);
				class293s[class293s.length - 1] = class293;
			}
		}
	}

	static final void method3143(int i, boolean bool) {
		/* empty */
	}

	static final void method3144(ClientScript2Event class98_sub21) {
		method3150(class98_sub21, 200000);
	}

	private static final void method3145(int i) {
		GameInterfaceData class293 = Class159.method2509(i, -9820);
		if (class293 != null) {
			int i_4_ = i >>> 16;
			GameInterfaceData[] class293s = Class64_Sub13.aClass293ArrayArray3674[i_4_];
			if (class293s == null) {
				GameInterfaceData[] class293s_5_ = Class159.gameInterfaces[i_4_];
				int i_6_ = class293s_5_.length;
				class293s = Class64_Sub13.aClass293ArrayArray3674[i_4_] = new GameInterfaceData[i_6_];
				Class236.method2892(class293s_5_, 0, class293s, 0, class293s_5_.length);
			}
			int i_7_;
			for (i_7_ = 0; i_7_ < class293s.length; i_7_++) {
				if (class293s[i_7_] == class293)
					break;
			}
			if (i_7_ < class293s.length) {
				Class236.method2892(class293s, 0, class293s, 1, i_7_);
				class293s[0] = class293;
			}
		}
	}

	private static final int method3146(char c) {
		if (Class184.method2627(376, c))
			return 1;
		return 0;
	}

	static final void method3147() {
		/* empty */
	}

	private static final void method3148(int i, boolean bool) {
		if (i < 300) {
			if (i == 100) {
				int_stack_ptr -= 3;
				int i_8_ = int_stack[int_stack_ptr];
				int i_9_ = int_stack[int_stack_ptr + 1];
				int i_10_ = int_stack[int_stack_ptr + 2];
				if (i_9_ == 0)
					throw new RuntimeException();
				GameInterfaceData class293 = Class159.method2509(i_8_, -9820);
				if (((GameInterfaceData) class293).interfaceComponents == null)
					((GameInterfaceData) class293).interfaceComponents = new GameInterfaceData[i_10_ + 1];
				if (((GameInterfaceData) class293).interfaceComponents.length <= i_10_) {
					GameInterfaceData[] class293s = new GameInterfaceData[i_10_ + 1];
					for (int i_11_ = 0; (i_11_ < ((GameInterfaceData) class293).interfaceComponents.length); i_11_++)
						class293s[i_11_] = ((GameInterfaceData) class293).interfaceComponents[i_11_];
					((GameInterfaceData) class293).interfaceComponents = class293s;
				}
				if (i_10_ > 0 && (((GameInterfaceData) class293).interfaceComponents[i_10_ - 1] == null))
					throw new RuntimeException("Gap at:" + (i_10_ - 1));
				GameInterfaceData class293_12_ = new GameInterfaceData();
				((GameInterfaceData) class293_12_).type = i_9_;
				((GameInterfaceData) class293_12_).anInt2234 = ((GameInterfaceData) class293_12_).anInt2248 = ((GameInterfaceData) class293).anInt2248;
				((GameInterfaceData) class293_12_).anInt2300 = i_10_;
				((GameInterfaceData) class293).interfaceComponents[i_10_] = class293_12_;
				if (bool)
					aClass293_1877 = class293_12_;
				else
					aClass293_1879 = class293_12_;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 101) {
				GameInterfaceData class293 = bool ? aClass293_1877 : aClass293_1879;
				if (((GameInterfaceData) class293).anInt2300 == -1) {
					if (bool)
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				GameInterfaceData class293_13_ = Class159.method2509(((GameInterfaceData) class293).anInt2248, -9820);
				((GameInterfaceData) class293_13_).interfaceComponents[((GameInterfaceData) class293).anInt2300] = null;
				Class341.method3812(1, class293_13_);
				return;
			}
			if (i == 102) {
				GameInterfaceData class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
				((GameInterfaceData) class293).interfaceComponents = null;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 200) {
				int_stack_ptr -= 2;
				int i_14_ = int_stack[int_stack_ptr];
				int i_15_ = int_stack[int_stack_ptr + 1];
				GameInterfaceData class293 = Class246_Sub9.method3139((byte) 72, i_14_, i_15_);
				if (class293 != null && i_15_ != -1) {
					int_stack[int_stack_ptr++] = 1;
					if (bool)
						aClass293_1877 = class293;
					else
						aClass293_1879 = class293;
				} else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 201) {
				int i_16_ = int_stack[--int_stack_ptr];
				GameInterfaceData class293 = Class159.method2509(i_16_, -9820);
				if (class293 != null) {
					int_stack[int_stack_ptr++] = 1;
					if (bool)
						aClass293_1877 = class293;
					else
						aClass293_1879 = class293;
				} else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 202) {
				int i_17_ = int_stack[--int_stack_ptr];
				method3142(i_17_);
				return;
			}
			if (i == 203) {
				int i_18_ = int_stack[--int_stack_ptr];
				method3145(i_18_);
				return;
			}
		} else if (i < 500) {
			if (i == 403) {
				int_stack_ptr -= 2;
				int i_19_ = int_stack[int_stack_ptr];
				int i_20_ = int_stack[int_stack_ptr + 1];
				if (((Player) Player.selfPlayer).appearance != null) {
					for (int i_21_ = 0; i_21_ < Class304.anIntArray2538.length; i_21_++) {
						if (Class304.anIntArray2538[i_21_] == i_19_) {
							((Player) Player.selfPlayer).appearance.method3631(12, i_21_, ParamType.aClass83_1205, i_20_);
							return;
						}
					}
					for (int i_22_ = 0; i_22_ < Class49.anIntArray414.length; i_22_++) {
						if (Class49.anIntArray414[i_22_] == i_19_) {
							((Player) Player.selfPlayer).appearance.method3631(12, i_22_, ParamType.aClass83_1205, i_20_);
							break;
						}
					}
					return;
				}
				return;
			}
			if (i == 404) {
				int_stack_ptr -= 2;
				int i_23_ = int_stack[int_stack_ptr];
				int i_24_ = int_stack[int_stack_ptr + 1];
				if (((Player) Player.selfPlayer).appearance != null) {
					((Player) Player.selfPlayer).appearance.method3632(i_24_, i_23_, -9);
					return;
				}
				return;
			}
			if (i == 410) {
				boolean bool_25_ = int_stack[--int_stack_ptr] != 0;
				if (((Player) Player.selfPlayer).appearance != null) {
					((Player) Player.selfPlayer).appearance.method3635(bool_25_, false);
					return;
				}
				return;
			}
			if (i == 411) {
				int_stack_ptr -= 2;
				int i_26_ = int_stack[int_stack_ptr];
				int i_27_ = int_stack[int_stack_ptr + 1];
				if (((Player) Player.selfPlayer).appearance != null) {
					((Player) Player.selfPlayer).appearance.method3634(i_27_, i_26_, Class98_Sub46_Sub19.getItemDefs, 1073741824);
					return;
				}
				return;
			}
		} else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
			GameInterfaceData class293;
			if (i >= 2000) {
				i -= 1000;
				class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
			} else
				class293 = bool ? aClass293_1877 : aClass293_1879;
			if (i == 1000) {
				int_stack_ptr -= 4;
				((GameInterfaceData) class293).anInt2283 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2229 = int_stack[int_stack_ptr + 1];
				int i_28_ = int_stack[int_stack_ptr + 2];
				if (i_28_ < 0)
					i_28_ = 0;
				else if (i_28_ > 5)
					i_28_ = 5;
				int i_29_ = int_stack[int_stack_ptr + 3];
				if (i_29_ < 0)
					i_29_ = 0;
				else if (i_29_ > 5)
					i_29_ = 5;
				((GameInterfaceData) class293).aByte2240 = (byte) i_28_;
				((GameInterfaceData) class293).aByte2245 = (byte) i_29_;
				Class341.method3812(1, class293);
				Class98_Sub45.method1519(class293, true);
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class224_Sub2_Sub1.method2838(11, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1001) {
				int_stack_ptr -= 4;
				((GameInterfaceData) class293).anInt2235 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2242 = int_stack[int_stack_ptr + 1];
				((GameInterfaceData) class293).anInt2232 = 0;
				((GameInterfaceData) class293).anInt2226 = 0;
				int i_30_ = int_stack[int_stack_ptr + 2];
				if (i_30_ < 0)
					i_30_ = 0;
				else if (i_30_ > 4)
					i_30_ = 4;
				int i_31_ = int_stack[int_stack_ptr + 3];
				if (i_31_ < 0)
					i_31_ = 0;
				else if (i_31_ > 4)
					i_31_ = 4;
				((GameInterfaceData) class293).aByte2243 = (byte) i_30_;
				((GameInterfaceData) class293).aByte2207 = (byte) i_31_;
				Class341.method3812(1, class293);
				Class98_Sub45.method1519(class293, true);
				if (((GameInterfaceData) class293).type == 0)
					Class63.method549(class293, false, (byte) 118);
				return;
			}
			if (i == 1003) {
				boolean bool_32_ = int_stack[--int_stack_ptr] == 1;
				if (((GameInterfaceData) class293).aBoolean2295 != bool_32_) {
					((GameInterfaceData) class293).aBoolean2295 = bool_32_;
					Class341.method3812(1, class293);
				}
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class98_Sub10_Sub18.method1056((byte) 97, (((GameInterfaceData) class293).anInt2248));
				return;
			}
			if (i == 1004) {
				int_stack_ptr -= 2;
				((GameInterfaceData) class293).anInt2321 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2338 = int_stack[int_stack_ptr + 1];
				Class341.method3812(1, class293);
				Class98_Sub45.method1519(class293, true);
				if (((GameInterfaceData) class293).type == 0)
					Class63.method549(class293, false, (byte) -112);
				return;
			}
			if (i == 1005) {
				((GameInterfaceData) class293).aBoolean2286 = int_stack[--int_stack_ptr] == 1;
				return;
			}
		} else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
			GameInterfaceData class293;
			if (i >= 2000) {
				i -= 1000;
				class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
			} else
				class293 = bool ? aClass293_1877 : aClass293_1879;
			if (i == 1100) {
				int_stack_ptr -= 2;
				((GameInterfaceData) class293).anInt2246 = int_stack[int_stack_ptr];
				if (((GameInterfaceData) class293).anInt2246 > (((GameInterfaceData) class293).anInt2290 - ((GameInterfaceData) class293).anInt2311))
					((GameInterfaceData) class293).anInt2246 = (((GameInterfaceData) class293).anInt2290 - ((GameInterfaceData) class293).anInt2311);
				if (((GameInterfaceData) class293).anInt2246 < 0)
					((GameInterfaceData) class293).anInt2246 = 0;
				((GameInterfaceData) class293).anInt2213 = int_stack[int_stack_ptr + 1];
				if (((GameInterfaceData) class293).anInt2213 > (((GameInterfaceData) class293).anInt2228 - ((GameInterfaceData) class293).anInt2258))
					((GameInterfaceData) class293).anInt2213 = (((GameInterfaceData) class293).anInt2228 - ((GameInterfaceData) class293).anInt2258);
				if (((GameInterfaceData) class293).anInt2213 < 0)
					((GameInterfaceData) class293).anInt2213 = 0;
				Class341.method3812(1, class293);
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class21_Sub4.method279(16953, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1101) {
				((GameInterfaceData) class293).anInt2236 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class98_Sub16.method1147(124, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1102) {
				((GameInterfaceData) class293).aBoolean2263 = int_stack[--int_stack_ptr] == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1103) {
				((GameInterfaceData) class293).anInt2285 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1104) {
				((GameInterfaceData) class293).anInt2293 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1105) {
				int i_33_ = int_stack[--int_stack_ptr];
				if (((GameInterfaceData) class293).anInt2237 != i_33_) {
					((GameInterfaceData) class293).anInt2237 = i_33_;
					Class341.method3812(1, class293);
				}
				if (((GameInterfaceData) class293).anInt2300 == -1)
					RtKeyListener.method778(44, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1106) {
				((GameInterfaceData) class293).anInt2255 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1107) {
				((GameInterfaceData) class293).aBoolean2288 = int_stack[--int_stack_ptr] == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1108) {
				((GameInterfaceData) class293).anInt2233 = 1;
				((GameInterfaceData) class293).anInt2343 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class183.method2625(false, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1109) {
				int_stack_ptr -= 6;
				((GameInterfaceData) class293).anInt2268 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2273 = int_stack[int_stack_ptr + 1];
				((GameInterfaceData) class293).anInt2310 = int_stack[int_stack_ptr + 2];
				((GameInterfaceData) class293).anInt2218 = int_stack[int_stack_ptr + 3];
				((GameInterfaceData) class293).anInt2346 = int_stack[int_stack_ptr + 4];
				((GameInterfaceData) class293).anInt2251 = int_stack[int_stack_ptr + 5];
				Class341.method3812(1, class293);
				if (((GameInterfaceData) class293).anInt2300 == -1) {
					Class290.method3413(0, ((GameInterfaceData) class293).anInt2248);
					Class185.method2631(10, ((GameInterfaceData) class293).anInt2248);
				}
				return;
			}
			if (i == 1110) {
				int i_34_ = int_stack[--int_stack_ptr];
				if (((GameInterfaceData) class293).anInt2208 != i_34_) {
					((GameInterfaceData) class293).anInt2208 = i_34_;
					((GameInterfaceData) class293).anInt2303 = 0;
					((GameInterfaceData) class293).anInt2287 = 1;
					((GameInterfaceData) class293).anInt2312 = 0;
					Class97 class97 = (((GameInterfaceData) class293).anInt2208 == -1 ? null : (Class151_Sub7.aClass183_5001.method2623(((GameInterfaceData) class293).anInt2208, 16383)));
					if (class97 != null)
						Class280.method3327(((GameInterfaceData) class293).anInt2303, class97, (byte) 74);
					Class341.method3812(1, class293);
				}
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class119_Sub3.method2185(5, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1111) {
				((GameInterfaceData) class293).aBoolean2265 = int_stack[--int_stack_ptr] == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1112) {
				String string = aStringArray1883[--anInt1884];
				if (!string.equals(((GameInterfaceData) class293).aString2225)) {
					((GameInterfaceData) class293).aString2225 = string;
					Class341.method3812(1, class293);
				}
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class286.method3380(3, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1113) {
				((GameInterfaceData) class293).anInt2264 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class40.method361(((GameInterfaceData) class293).anInt2248, 0);
				return;
			}
			if (i == 1114) {
				int_stack_ptr -= 3;
				((GameInterfaceData) class293).anInt2341 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2296 = int_stack[int_stack_ptr + 1];
				((GameInterfaceData) class293).anInt2244 = int_stack[int_stack_ptr + 2];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1115) {
				((GameInterfaceData) class293).aBoolean2315 = int_stack[--int_stack_ptr] == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1116) {
				((GameInterfaceData) class293).anInt2304 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1117) {
				((GameInterfaceData) class293).anInt2355 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1118) {
				((GameInterfaceData) class293).aBoolean2327 = int_stack[--int_stack_ptr] == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1119) {
				((GameInterfaceData) class293).aBoolean2281 = int_stack[--int_stack_ptr] == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1120) {
				int_stack_ptr -= 2;
				((GameInterfaceData) class293).anInt2290 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2228 = int_stack[int_stack_ptr + 1];
				Class341.method3812(1, class293);
				if (((GameInterfaceData) class293).type == 0)
					Class63.method549(class293, false, (byte) 60);
				return;
			}
			if (i == 1122) {
				((GameInterfaceData) class293).aBoolean2279 = int_stack[--int_stack_ptr] == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1123) {
				((GameInterfaceData) class293).anInt2251 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class290.method3413(0, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1124) {
				int i_35_ = int_stack[--int_stack_ptr];
				((GameInterfaceData) class293).aBoolean2256 = i_35_ == 1;
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1125) {
				int_stack_ptr -= 2;
				((GameInterfaceData) class293).anInt2336 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2344 = int_stack[int_stack_ptr + 1];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1126) {
				((GameInterfaceData) class293).anInt2350 = int_stack[--int_stack_ptr];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1127) {
				int_stack_ptr -= 2;
				int i_36_ = int_stack[int_stack_ptr];
				int i_37_ = int_stack[int_stack_ptr + 1];
				ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_36_);
				if (i_37_ != ((ParamType) class149).anInt1202)
					class293.method3455(i_36_, i_37_, 16);
				else {
					class293.method3459((byte) 54, i_36_);
					return;
				}
				return;
			}
			if (i == 1128) {
				int i_38_ = int_stack[--int_stack_ptr];
				String string = aStringArray1883[--anInt1884];
				ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_38_);
				if (!((ParamType) class149).aString1203.equals(string))
					class293.method3458(string, 16, i_38_);
				else {
					class293.method3459((byte) 101, i_38_);
					return;
				}
				return;
			}
			if (i == 1129 || i == 1130) {
				int i_39_ = int_stack[--int_stack_ptr];
				if ((((GameInterfaceData) class293).type == 5 || i != 1129) && (((GameInterfaceData) class293).type == 4 || i != 1130)) {
					if (((GameInterfaceData) class293).anInt2211 != i_39_) {
						((GameInterfaceData) class293).anInt2211 = i_39_;
						Class341.method3812(1, class293);
					}
					if (((GameInterfaceData) class293).anInt2300 == -1)
						PacketParser.method3969(121, ((GameInterfaceData) class293).anInt2248);
					return;
				}
				return;
			}
		} else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
			GameInterfaceData class293;
			if (i >= 2000) {
				i -= 1000;
				class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
			} else
				class293 = bool ? aClass293_1877 : aClass293_1879;
			Class341.method3812(1, class293);
			if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
				int_stack_ptr -= 2;
				int i_40_ = int_stack[int_stack_ptr];
				int i_41_ = int_stack[int_stack_ptr + 1];
				if (((GameInterfaceData) class293).anInt2300 == -1) {
					Class21_Sub2.method274((byte) 83, ((GameInterfaceData) class293).anInt2248);
					Class290.method3413(0, ((GameInterfaceData) class293).anInt2248);
					Class185.method2631(10, ((GameInterfaceData) class293).anInt2248);
				}
				if (i_40_ == -1) {
					((GameInterfaceData) class293).anInt2233 = 1;
					((GameInterfaceData) class293).anInt2343 = -1;
					((GameInterfaceData) class293).anInt2302 = -1;
				} else {
					((GameInterfaceData) class293).anInt2302 = i_40_;
					((GameInterfaceData) class293).anInt2349 = i_41_;
					if (i == 1208 || i == 1209)
						((GameInterfaceData) class293).aBoolean2262 = true;
					else
						((GameInterfaceData) class293).aBoolean2262 = false;
					ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_40_);
					((GameInterfaceData) class293).anInt2310 = ((ItemDefinition) class297).anInt2416;
					((GameInterfaceData) class293).anInt2218 = ((ItemDefinition) class297).anInt2476;
					((GameInterfaceData) class293).anInt2346 = ((ItemDefinition) class297).anInt2441;
					((GameInterfaceData) class293).anInt2268 = ((ItemDefinition) class297).anInt2437;
					((GameInterfaceData) class293).anInt2273 = ((ItemDefinition) class297).anInt2447;
					((GameInterfaceData) class293).anInt2251 = ((ItemDefinition) class297).anInt2465;
					if (i == 1205 || i == 1209)
						((GameInterfaceData) class293).anInt2305 = 0;
					else if (i == 1212 || i == 1213)
						((GameInterfaceData) class293).anInt2305 = 1;
					else
						((GameInterfaceData) class293).anInt2305 = 2;
					if (((GameInterfaceData) class293).anInt2232 > 0)
						((GameInterfaceData) class293).anInt2251 = (((GameInterfaceData) class293).anInt2251 * 32 / ((GameInterfaceData) class293).anInt2232);
					else {
						if (((GameInterfaceData) class293).anInt2235 > 0)
							((GameInterfaceData) class293).anInt2251 = (((GameInterfaceData) class293).anInt2251 * 32 / ((GameInterfaceData) class293).anInt2235);
						return;
					}
					return;
				}
				return;
			}
			if (i == 1201) {
				((GameInterfaceData) class293).anInt2233 = 2;
				((GameInterfaceData) class293).anInt2343 = int_stack[--int_stack_ptr];
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class183.method2625(false, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1202) {
				((GameInterfaceData) class293).anInt2233 = 3;
				((GameInterfaceData) class293).anInt2343 = -1;
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class183.method2625(false, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1203) {
				((GameInterfaceData) class293).anInt2233 = 6;
				((GameInterfaceData) class293).anInt2343 = int_stack[--int_stack_ptr];
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class183.method2625(false, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1204) {
				((GameInterfaceData) class293).anInt2233 = 5;
				((GameInterfaceData) class293).anInt2343 = int_stack[--int_stack_ptr];
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class183.method2625(false, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1206) {
				int_stack_ptr -= 4;
				((GameInterfaceData) class293).anInt2267 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2306 = int_stack[int_stack_ptr + 1];
				((GameInterfaceData) class293).anInt2260 = int_stack[int_stack_ptr + 2];
				((GameInterfaceData) class293).anInt2334 = int_stack[int_stack_ptr + 3];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1207) {
				int_stack_ptr -= 2;
				((GameInterfaceData) class293).anInt2216 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2261 = int_stack[int_stack_ptr + 1];
				Class341.method3812(1, class293);
				return;
			}
			if (i == 1210) {
				int_stack_ptr -= 4;
				((GameInterfaceData) class293).anInt2343 = int_stack[int_stack_ptr];
				((GameInterfaceData) class293).anInt2210 = int_stack[int_stack_ptr + 1];
				if (int_stack[int_stack_ptr + 2] == 1)
					((GameInterfaceData) class293).anInt2233 = 9;
				else
					((GameInterfaceData) class293).anInt2233 = 8;
				if (int_stack[int_stack_ptr + 3] == 1)
					((GameInterfaceData) class293).aBoolean2262 = true;
				else
					((GameInterfaceData) class293).aBoolean2262 = false;
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class183.method2625(false, ((GameInterfaceData) class293).anInt2248);
				return;
			}
			if (i == 1211) {
				((GameInterfaceData) class293).anInt2233 = 5;
				((GameInterfaceData) class293).anInt2343 = za_Sub2.anInt6080;
				((GameInterfaceData) class293).anInt2210 = 0;
				if (((GameInterfaceData) class293).anInt2300 == -1)
					Class183.method2625(false, ((GameInterfaceData) class293).anInt2248);
				return;
			}
		} else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
			GameInterfaceData class293;
			if (i >= 2000) {
				i -= 1000;
				class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
			} else
				class293 = bool ? aClass293_1877 : aClass293_1879;
			if (i == 1300) {
				int i_42_ = int_stack[--int_stack_ptr] - 1;
				if (i_42_ < 0 || i_42_ > 9)
					anInt1884--;
				else {
					class293.method3468(aStringArray1883[--anInt1884], i_42_, 1);
					return;
				}
				return;
			}
			if (i == 1301) {
				int_stack_ptr -= 2;
				int i_43_ = int_stack[int_stack_ptr];
				int i_44_ = int_stack[int_stack_ptr + 1];
				if (i_43_ == -1 && i_44_ == -1)
					((GameInterfaceData) class293).aClass293_2219 = null;
				else {
					((GameInterfaceData) class293).aClass293_2219 = Class246_Sub9.method3139((byte) 72, i_43_, i_44_);
					return;
				}
				return;
			}
			if (i == 1302) {
				int i_45_ = int_stack[--int_stack_ptr];
				if (i_45_ == Class369.anInt3129 || i_45_ == Class253.anInt1929 || i_45_ == Class36.anInt350) {
					((GameInterfaceData) class293).anInt2289 = i_45_;
					return;
				}
				return;
			}
			if (i == 1303) {
				((GameInterfaceData) class293).anInt2308 = int_stack[--int_stack_ptr];
				return;
			}
			if (i == 1304) {
				((GameInterfaceData) class293).anInt2353 = int_stack[--int_stack_ptr];
				return;
			}
			if (i == 1305) {
				((GameInterfaceData) class293).aString2224 = aStringArray1883[--anInt1884];
				return;
			}
			if (i == 1306) {
				((GameInterfaceData) class293).aString2214 = aStringArray1883[--anInt1884];
				return;
			}
			if (i == 1307) {
				((GameInterfaceData) class293).aStringArray2351 = null;
				return;
			}
			if (i == 1308) {
				((GameInterfaceData) class293).anInt2318 = int_stack[--int_stack_ptr];
				((GameInterfaceData) class293).anInt2309 = int_stack[--int_stack_ptr];
				return;
			}
			if (i == 1309) {
				int i_46_ = int_stack[--int_stack_ptr];
				int i_47_ = int_stack[--int_stack_ptr];
				if (i_47_ >= 1 && i_47_ <= 10)
					class293.method3474(-17972, i_47_ - 1, i_46_);
				return;
			}
			if (i == 1310) {
				((GameInterfaceData) class293).aString2333 = aStringArray1883[--anInt1884];
				return;
			}
			if (i == 1311) {
				((GameInterfaceData) class293).anInt2254 = int_stack[--int_stack_ptr];
				return;
			}
			if (i == 1312 || i == 1313) {
				int i_48_;
				int i_49_;
				int i_50_;
				if (i == 1312) {
					int_stack_ptr -= 3;
					i_48_ = int_stack[int_stack_ptr] - 1;
					i_49_ = int_stack[int_stack_ptr + 1];
					i_50_ = int_stack[int_stack_ptr + 2];
					if (i_48_ < 0 || i_48_ > 9)
						throw new RuntimeException("IOR13121313");
				} else {
					int_stack_ptr -= 2;
					i_48_ = 10;
					i_49_ = int_stack[int_stack_ptr];
					i_50_ = int_stack[int_stack_ptr + 1];
				}
				if (((GameInterfaceData) class293).aByteArray2345 == null) {
					if (i_49_ != 0) {
						((GameInterfaceData) class293).aByteArray2345 = new byte[11];
						((GameInterfaceData) class293).aByteArray2331 = new byte[11];
						((GameInterfaceData) class293).anIntArray2275 = new int[11];
					} else
						return;
				}
				((GameInterfaceData) class293).aByteArray2345[i_48_] = (byte) i_49_;
				if (i_49_ != 0)
					((GameInterfaceData) class293).aBoolean2222 = true;
				else {
					((GameInterfaceData) class293).aBoolean2222 = false;
					for (int i_51_ = 0; i_51_ < ((GameInterfaceData) class293).aByteArray2345.length; i_51_++) {
						if (((GameInterfaceData) class293).aByteArray2345[i_51_] != 0) {
							((GameInterfaceData) class293).aBoolean2222 = true;
							break;
						}
					}
				}
				((GameInterfaceData) class293).aByteArray2331[i_48_] = (byte) i_50_;
				return;
			}
			if (i == 1314) {
				((GameInterfaceData) class293).anInt2317 = int_stack[--int_stack_ptr];
				return;
			}
		} else {
			if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
				GameInterfaceData class293;
				if (i >= 2000) {
					i -= 1000;
					class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
				} else
					class293 = bool ? aClass293_1877 : aClass293_1879;
				if (i == 1499)
					class293.method3465(-1);
				else {
					String string = aStringArray1883[--anInt1884];
					int[] is = null;
					if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
						int i_52_ = int_stack[--int_stack_ptr];
						if (i_52_ > 0) {
							is = new int[i_52_];
							while (i_52_-- > 0)
								is[i_52_] = int_stack[--int_stack_ptr];
						}
						string = string.substring(0, string.length() - 1);
					}
					Object[] objects = new Object[string.length() + 1];
					for (int i_53_ = objects.length - 1; i_53_ >= 1; i_53_--) {
						if (string.charAt(i_53_ - 1) == 's')
							objects[i_53_] = aStringArray1883[--anInt1884];
						else
							objects[i_53_] = new Integer(int_stack[--int_stack_ptr]);
					}
					int i_54_ = int_stack[--int_stack_ptr];
					if (i_54_ != -1)
						objects[0] = new Integer(i_54_);
					else
						objects = null;
					if (i == 1400)
						((GameInterfaceData) class293).anObjectArray2291 = objects;
					else if (i == 1401)
						((GameInterfaceData) class293).anObjectArray2230 = objects;
					else if (i == 1402)
						((GameInterfaceData) class293).anObjectArray2356 = objects;
					else if (i == 1403)
						((GameInterfaceData) class293).anObjectArray2227 = objects;
					else if (i == 1404)
						((GameInterfaceData) class293).anObjectArray2272 = objects;
					else if (i == 1405)
						((GameInterfaceData) class293).anObjectArray2316 = objects;
					else if (i == 1406)
						((GameInterfaceData) class293).anObjectArray2324 = objects;
					else if (i == 1407) {
						((GameInterfaceData) class293).anObjectArray2269 = objects;
						((GameInterfaceData) class293).anIntArray2284 = is;
					} else if (i == 1408)
						((GameInterfaceData) class293).anObjectArray2270 = objects;
					else if (i == 1409)
						((GameInterfaceData) class293).anObjectArray2329 = objects;
					else if (i == 1410)
						((GameInterfaceData) class293).anObjectArray2313 = objects;
					else if (i == 1411)
						((GameInterfaceData) class293).anObjectArray2335 = objects;
					else if (i == 1412)
						((GameInterfaceData) class293).anObjectArray2314 = objects;
					else if (i == 1414) {
						((GameInterfaceData) class293).anObjectArray2252 = objects;
						((GameInterfaceData) class293).anIntArray2249 = is;
					} else if (i == 1415) {
						((GameInterfaceData) class293).anObjectArray2278 = objects;
						((GameInterfaceData) class293).anIntArray2271 = is;
					} else if (i == 1416)
						((GameInterfaceData) class293).anObjectArray2257 = objects;
					else if (i == 1417)
						((GameInterfaceData) class293).onMouseWheelListener = objects;
					else if (i == 1418)
						((GameInterfaceData) class293).anObjectArray2239 = objects;
					else if (i == 1419)
						((GameInterfaceData) class293).anObjectArray2274 = objects;
					else if (i == 1420)
						((GameInterfaceData) class293).anObjectArray2215 = objects;
					else if (i == 1421)
						((GameInterfaceData) class293).anObjectArray2292 = objects;
					else if (i == 1422)
						((GameInterfaceData) class293).anObjectArray2340 = objects;
					else if (i == 1423)
						((GameInterfaceData) class293).anObjectArray2330 = objects;
					else if (i == 1424)
						((GameInterfaceData) class293).anObjectArray2319 = objects;
					else if (i == 1425)
						((GameInterfaceData) class293).anObjectArray2294 = objects;
					else if (i == 1426)
						((GameInterfaceData) class293).anObjectArray2220 = objects;
					else if (i == 1427)
						((GameInterfaceData) class293).anObjectArray2266 = objects;
					else if (i == 1428) {
						((GameInterfaceData) class293).anObjectArray2212 = objects;
						((GameInterfaceData) class293).anIntArray2297 = is;
					} else if (i == 1429) {
						((GameInterfaceData) class293).anObjectArray2320 = objects;
						((GameInterfaceData) class293).anIntArray2342 = is;
					} else if (i == 1430)
						((GameInterfaceData) class293).anObjectArray2253 = objects;
					((GameInterfaceData) class293).hasListener = true;
					return;
				}
				return;
			}
			if (i < 1600) {
				GameInterfaceData class293 = bool ? aClass293_1877 : aClass293_1879;
				if (i == 1500) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2347;
					return;
				}
				if (i == 1501) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2299;
					return;
				}
				if (i == 1502) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2311;
					return;
				}
				if (i == 1503) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2258;
					return;
				}
				if (i == 1504) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).aBoolean2295 ? 1 : 0;
					return;
				}
				if (i == 1505) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2234;
					return;
				}
				if (i == 1506) {
					GameInterfaceData class293_55_ = Class360.method3910(true, class293);
					int_stack[int_stack_ptr++] = (class293_55_ == null ? -1 : ((GameInterfaceData) class293_55_).anInt2248);
					return;
				}
			} else if (i < 1700) {
				GameInterfaceData class293 = bool ? aClass293_1877 : aClass293_1879;
				if (i == 1600) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2246;
					return;
				}
				if (i == 1601) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2213;
					return;
				}
				if (i == 1602) {
					aStringArray1883[anInt1884++] = ((GameInterfaceData) class293).aString2225;
					return;
				}
				if (i == 1603) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2290;
					return;
				}
				if (i == 1604) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2228;
					return;
				}
				if (i == 1605) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2251;
					return;
				}
				if (i == 1606) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2310;
					return;
				}
				if (i == 1607) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2346;
					return;
				}
				if (i == 1608) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2218;
					return;
				}
				if (i == 1609) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2285;
					return;
				}
				if (i == 1610) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2268;
					return;
				}
				if (i == 1611) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2273;
					return;
				}
				if (i == 1612) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2237;
					return;
				}
				if (i == 1613) {
					int i_56_ = int_stack[--int_stack_ptr];
					ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_56_);
					if (class149.method2433(false))
						aStringArray1883[anInt1884++] = class293.method3463(i_56_, 700, (((ParamType) class149).aString1203));
					else {
						int_stack[int_stack_ptr++] = class293.method3472(22241, (((ParamType) class149).anInt1202), i_56_);
						return;
					}
					return;
				}
				if (i == 1614) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2255;
					return;
				}
				if (i == 2614) {
					int_stack[int_stack_ptr++] = (((GameInterfaceData) class293).anInt2233 == 1 ? ((GameInterfaceData) class293).anInt2343 : -1);
					return;
				}
			} else if (i < 1800) {
				GameInterfaceData class293 = bool ? aClass293_1877 : aClass293_1879;
				if (i == 1700) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2302;
					return;
				}
				if (i == 1701) {
					if (((GameInterfaceData) class293).anInt2302 != -1)
						int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2349;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 1702) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2300;
					return;
				}
			} else if (i < 1900) {
				GameInterfaceData class293 = bool ? aClass293_1877 : aClass293_1879;
				if (i == 1800) {
					int_stack[int_stack_ptr++] = client.getClickMask(class293).method1668(-1);
					return;
				}
				if (i == 1801) {
					int i_57_ = int_stack[--int_stack_ptr];
					i_57_--;
					if (((GameInterfaceData) class293).aStringArray2351 == null || (i_57_ >= ((GameInterfaceData) class293).aStringArray2351.length) || (((GameInterfaceData) class293).aStringArray2351[i_57_] == null))
						aStringArray1883[anInt1884++] = "";
					else {
						aStringArray1883[anInt1884++] = ((GameInterfaceData) class293).aStringArray2351[i_57_];
						return;
					}
					return;
				}
				if (i == 1802) {
					if (((GameInterfaceData) class293).aString2224 == null)
						aStringArray1883[anInt1884++] = "";
					else {
						aStringArray1883[anInt1884++] = ((GameInterfaceData) class293).aString2224;
						return;
					}
					return;
				}
			} else if (i < 2000 || i >= 2900 && i < 3000) {
				GameInterfaceData class293;
				if (i >= 2000) {
					class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
					i -= 1000;
				} else
					class293 = bool ? aClass293_1877 : aClass293_1879;
				if (anInt1893 >= 10)
					throw new RuntimeException("C29xx-1");
				if (i == 1927) {
					if (((GameInterfaceData) class293).anObjectArray2266 != null) {
						ClientScript2Event class98_sub21 = new ClientScript2Event();
						((ClientScript2Event) class98_sub21).component = class293;
						((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) class293).anObjectArray2266;
						((ClientScript2Event) class98_sub21).anInt3990 = anInt1893 + 1;
						Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
						return;
					}
					return;
				}
			} else if (i < 2600) {
				GameInterfaceData class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
				if (i == 2500) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2347;
					return;
				}
				if (i == 2501) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2299;
					return;
				}
				if (i == 2502) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2311;
					return;
				}
				if (i == 2503) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2258;
					return;
				}
				if (i == 2504) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).aBoolean2295 ? 1 : 0;
					return;
				}
				if (i == 2505) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2234;
					return;
				}
				if (i == 1506) {
					GameInterfaceData class293_58_ = Class360.method3910(true, class293);
					int_stack[int_stack_ptr++] = (class293_58_ == null ? -1 : ((GameInterfaceData) class293_58_).anInt2248);
					return;
				}
			} else if (i < 2700) {
				GameInterfaceData class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
				if (i == 2600) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2246;
					return;
				}
				if (i == 2601) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2213;
					return;
				}
				if (i == 2602) {
					aStringArray1883[anInt1884++] = ((GameInterfaceData) class293).aString2225;
					return;
				}
				if (i == 2603) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2290;
					return;
				}
				if (i == 2604) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2228;
					return;
				}
				if (i == 2605) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2251;
					return;
				}
				if (i == 2606) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2310;
					return;
				}
				if (i == 2607) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2346;
					return;
				}
				if (i == 2608) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2218;
					return;
				}
				if (i == 2609) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2285;
					return;
				}
				if (i == 2610) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2268;
					return;
				}
				if (i == 2611) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2273;
					return;
				}
				if (i == 2612) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2237;
					return;
				}
				if (i == 2613) {
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2255;
					return;
				}
				if (i == 2614) {
					int_stack[int_stack_ptr++] = (((GameInterfaceData) class293).anInt2233 == 1 ? ((GameInterfaceData) class293).anInt2343 : -1);
					return;
				}
			} else if (i < 2800) {
				if (i == 2700) {
					GameInterfaceData class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
					int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2302;
					return;
				}
				if (i == 2701) {
					GameInterfaceData class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
					if (((GameInterfaceData) class293).anInt2302 != -1)
						int_stack[int_stack_ptr++] = ((GameInterfaceData) class293).anInt2349;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 2702) {
					int i_59_ = int_stack[--int_stack_ptr];
					GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990((long) i_59_, -1));
					if (class98_sub18 != null)
						int_stack[int_stack_ptr++] = 1;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 2703) {
					GameInterfaceData class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
					if (((GameInterfaceData) class293).interfaceComponents == null)
						int_stack[int_stack_ptr++] = 0;
					else {
						int i_60_ = ((GameInterfaceData) class293).interfaceComponents.length;
						for (int i_61_ = 0; i_61_ < (((GameInterfaceData) class293).interfaceComponents).length; i_61_++) {
							if (((GameInterfaceData) class293).interfaceComponents[i_61_] == null) {
								i_60_ = i_61_;
								break;
							}
						}
						int_stack[int_stack_ptr++] = i_60_;
						return;
					}
					return;
				}
				if (i == 2704 || i == 2705) {
					int_stack_ptr -= 2;
					int i_62_ = int_stack[int_stack_ptr];
					int i_63_ = int_stack[int_stack_ptr + 1];
					GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990((long) i_62_, -1));
					if (class98_sub18 != null && ((GameInterface) class98_sub18).interfaceID == i_63_)
						int_stack[int_stack_ptr++] = 1;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
			} else if (i < 2900) {
				GameInterfaceData class293 = Class159.method2509(int_stack[--int_stack_ptr], -9820);
				if (i == 2800) {
					int_stack[int_stack_ptr++] = client.getClickMask(class293).method1668(-1);
					return;
				}
				if (i == 2801) {
					int i_64_ = int_stack[--int_stack_ptr];
					i_64_--;
					if (((GameInterfaceData) class293).aStringArray2351 == null || (i_64_ >= ((GameInterfaceData) class293).aStringArray2351.length) || (((GameInterfaceData) class293).aStringArray2351[i_64_] == null))
						aStringArray1883[anInt1884++] = "";
					else {
						aStringArray1883[anInt1884++] = ((GameInterfaceData) class293).aStringArray2351[i_64_];
						return;
					}
					return;
				}
				if (i == 2802) {
					if (((GameInterfaceData) class293).aString2224 == null)
						aStringArray1883[anInt1884++] = "";
					else {
						aStringArray1883[anInt1884++] = ((GameInterfaceData) class293).aString2224;
						return;
					}
					return;
				}
			} else if (i < 3200) {
				if (i == 3100) {
					String string = aStringArray1883[--anInt1884];
					Class84.method832(string, (byte) 108);
					return;
				}
				if (i == 3101) {
					int_stack_ptr -= 2;
					Class194.method2657((Player.selfPlayer), (byte) 114, int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr]);
					return;
				}
				if (i == 3103) {
					Class246_Sub3_Sub5_Sub1.method3092(-1, true);
					return;
				}
				if (i == 3104) {
					String string = aStringArray1883[--anInt1884];
					int i_65_ = 0;
					if (Class77_Sub1.method781((byte) 53, string))
						i_65_ = PacketSender.method3607(-126, string);
					OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class246_Sub3_Sub5.aClass171_6164), (Class331.aClass117_2811));
					((OutgoingPacket) class98_sub11).packet.writeInt(1571862888, i_65_);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (i == 3105) {
					String string = aStringArray1883[--anInt1884];
					OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class284_Sub1_Sub2.aClass171_6191), (Class331.aClass117_2811));
					((OutgoingPacket) class98_sub11).packet.writeByte(string.length() + 1);
					((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (i == 3106) {
					String string = aStringArray1883[--anInt1884];
					OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class199.aClass171_1533), (Class331.aClass117_2811));
					((OutgoingPacket) class98_sub11).packet.writeByte(string.length() + 1);
					((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (i == 3107) {
					int i_66_ = int_stack[--int_stack_ptr];
					String string = aStringArray1883[--anInt1884];
					Class314.method3639(i_66_, string, false);
					return;
				}
				if (i == 3108) {
					int_stack_ptr -= 3;
					int i_67_ = int_stack[int_stack_ptr];
					int i_68_ = int_stack[int_stack_ptr + 1];
					int i_69_ = int_stack[int_stack_ptr + 2];
					GameInterfaceData class293 = Class159.method2509(i_69_, -9820);
					Class146_Sub3.method2405(class293, (byte) 103, i_67_, i_68_);
					return;
				}
				if (i == 3109) {
					int_stack_ptr -= 2;
					int i_70_ = int_stack[int_stack_ptr];
					int i_71_ = int_stack[int_stack_ptr + 1];
					GameInterfaceData class293 = bool ? aClass293_1877 : aClass293_1879;
					Class146_Sub3.method2405(class293, (byte) 118, i_70_, i_71_);
					return;
				}
				if (i == 3110) {
					int i_72_ = int_stack[--int_stack_ptr];
					OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class150.aClass171_1209), (Class331.aClass117_2811));
					((OutgoingPacket) class98_sub11).packet.writeShort(i_72_);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (i == 3111) {
					int_stack_ptr -= 2;
					int i_73_ = int_stack[int_stack_ptr];
					int i_74_ = int_stack[int_stack_ptr + 1];
					GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990((long) i_73_, -1));
					if (class98_sub18 != null)
						Class196.method2666(16398, true, class98_sub18, (((GameInterface) class98_sub18).interfaceID) != i_74_);
					Class323.createInterface(true, -128, i_74_, i_73_, 3);
					return;
				}
				if (i == 3112) {
					int_stack_ptr--;
					int i_75_ = int_stack[int_stack_ptr];
					GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.method3990((long) i_75_, -1));
					if (class98_sub18 != null && ((GameInterface) class98_sub18).interfaceClickThrough == 3)
						Class196.method2666(16398, true, class98_sub18, true);
					return;
				}
				if (i == 3113) {
					Class98_Sub19.method1165((byte) 36, aStringArray1883[--anInt1884]);
					return;
				}
				if (i == 3114) {
					int_stack_ptr -= 2;
					int i_76_ = int_stack[int_stack_ptr];
					int i_77_ = int_stack[int_stack_ptr + 1];
					String string = aStringArray1883[--anInt1884];
					Class98_Sub45.add_message((byte) -119, i_76_, string, i_77_, "", "", "");
					return;
				}
				if (i == 3115) {
					int_stack_ptr -= 11;
					Class63[] class63s = Class98_Sub46_Sub13_Sub1.method1595(123);
					Class110[] class110s = Class331.method3723(256);
					OutputStream_Sub1.method129(int_stack[int_stack_ptr + 10], int_stack[int_stack_ptr + 3], (class63s[int_stack[int_stack_ptr]]), int_stack[int_stack_ptr + 4], int_stack[int_stack_ptr + 2], false, int_stack[int_stack_ptr + 8], int_stack[int_stack_ptr + 9], int_stack[int_stack_ptr + 6], int_stack[int_stack_ptr + 7], int_stack[int_stack_ptr + 5], class110s[(int_stack[int_stack_ptr + 1])]);
					return;
				}
			} else if (i < 3300) {
				if (i == 3200) {
					int_stack_ptr -= 3;
					Class301.method3537(256, (byte) 1, int_stack[int_stack_ptr], int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr + 2], 255);
					return;
				}
				if (i == 3201) {
					Class246_Sub3_Sub1.method2994(int_stack[--int_stack_ptr], 255, (byte) -83, 50);
					return;
				}
				if (i == 3202) {
					int_stack_ptr -= 2;
					Class228.method2861(int_stack[int_stack_ptr + 1], 255, int_stack[int_stack_ptr], 18596);
					return;
				}
				if (i == 3203) {
					int_stack_ptr -= 4;
					Class301.method3537(256, (byte) 1, int_stack[int_stack_ptr], int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr + 2], int_stack[int_stack_ptr + 3]);
					return;
				}
				if (i == 3204) {
					int_stack_ptr -= 3;
					Class246_Sub3_Sub1.method2994(int_stack[int_stack_ptr], (int_stack[int_stack_ptr + 1]), (byte) -83, (int_stack[int_stack_ptr + 2]));
					return;
				}
				if (i == 3205) {
					int_stack_ptr -= 3;
					Class228.method2861(int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr + 2], int_stack[int_stack_ptr], 18596);
					return;
				}
				if (i == 3206) {
					int_stack_ptr -= 4;
					Class98_Sub10_Sub9.method1036(-1962608884, int_stack[int_stack_ptr + 3], int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr], false, int_stack[int_stack_ptr + 2], 256);
					return;
				}
				if (i == 3207) {
					int_stack_ptr -= 4;
					Class98_Sub10_Sub9.method1036(-1962608884, int_stack[int_stack_ptr + 3], int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr], true, int_stack[int_stack_ptr + 2], 256);
					return;
				}
				if (i == 3208) {
					int_stack_ptr -= 5;
					Class301.method3537(int_stack[int_stack_ptr + 4], (byte) 1, int_stack[int_stack_ptr], int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr + 2], int_stack[int_stack_ptr + 3]);
					return;
				}
				if (i == 3209) {
					int_stack_ptr -= 5;
					Class98_Sub10_Sub9.method1036(-1962608884, int_stack[int_stack_ptr + 3], int_stack[int_stack_ptr + 1], int_stack[int_stack_ptr], false, int_stack[int_stack_ptr + 2], int_stack[int_stack_ptr + 4]);
					return;
				}
			} else if (i < 3400) {
				if (i == 3300) {
					int_stack[int_stack_ptr++] = Class215.anInt1614;
					return;
				}
				if (i == 3301) {
					int_stack_ptr -= 2;
					int i_78_ = int_stack[int_stack_ptr];
					int i_79_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class96.method925(i_78_, -121, i_79_, false);
					return;
				}
				if (i == 3302) {
					int_stack_ptr -= 2;
					int i_80_ = int_stack[int_stack_ptr];
					int i_81_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class124.method2212(false, (byte) -96, i_80_, i_81_);
					return;
				}
				if (i == 3303) {
					int_stack_ptr -= 2;
					int i_82_ = int_stack[int_stack_ptr];
					int i_83_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class249.method3161(i_82_, -122, false, i_83_);
					return;
				}
				if (i == 3304) {
					int i_84_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub18) Class98_Sub46_Sub14.aClass8_5378.method185(9, i_84_)).anInt6055);
					return;
				}
				if (i == 3305) {
					int i_85_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Class64_Sub21.anIntArray3701[i_85_];
					return;
				}
				if (i == 3306) {
					int i_86_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Class256_Sub1.anIntArray5158[i_86_];
					return;
				}
				if (i == 3307) {
					int i_87_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Class52.anIntArray3493[i_87_];
					return;
				}
				if (i == 3308) {
					int i_88_ = (((AnimableEntity) Player.selfPlayer).height_level);
					int i_89_ = (((((AnimableEntity) Player.selfPlayer).localXPos) >> 9) + Class272.anInt2038);
					int i_90_ = (((((AnimableEntity) Player.selfPlayer).localYPos) >> 9) + aa_Sub2.anInt3562);
					int_stack[int_stack_ptr++] = (i_88_ << 28) + (i_89_ << 14) + i_90_;
					return;
				}
				if (i == 3309) {
					int i_91_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = i_91_ >> 14 & 0x3fff;
					return;
				}
				if (i == 3310) {
					int i_92_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = i_92_ >> 28;
					return;
				}
				if (i == 3311) {
					int i_93_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = i_93_ & 0x3fff;
					return;
				}
				if (i == 3312) {
					int_stack[int_stack_ptr++] = Class79.aBoolean602 ? 1 : 0;
					return;
				}
				if (i == 3313) {
					int_stack_ptr -= 2;
					int i_94_ = int_stack[int_stack_ptr];
					int i_95_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class96.method925(i_94_, 118, i_95_, true);
					return;
				}
				if (i == 3314) {
					int_stack_ptr -= 2;
					int i_96_ = int_stack[int_stack_ptr];
					int i_97_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class124.method2212(true, (byte) -96, i_96_, i_97_);
					return;
				}
				if (i == 3315) {
					int_stack_ptr -= 2;
					int i_98_ = int_stack[int_stack_ptr];
					int i_99_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class249.method3161(i_98_, -121, true, i_99_);
					return;
				}
				if (i == 3316) {
					if (Player.rights >= 2)
						int_stack[int_stack_ptr++] = Player.rights;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3317) {
					int_stack[int_stack_ptr++] = Class98_Sub10_Sub6.anInt5569;
					return;
				}
				if (i == 3318) {
					int_stack[int_stack_ptr++] = (((Class354) Class98_Sub46_Sub10.aClass354_6011).anInt3011);
					return;
				}
				if (i == 3321) {
					int_stack[int_stack_ptr++] = Class368.anInt3124;
					return;
				}
				if (i == 3322) {
					int_stack[int_stack_ptr++] = Class24.carriedWeight;
					return;
				}
				if (i == 3323) {
					if (Class47.anInt407 >= 5 && Class47.anInt407 <= 9)
						int_stack[int_stack_ptr++] = 1;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3324) {
					if (Class47.anInt407 >= 5 && Class47.anInt407 <= 9)
						int_stack[int_stack_ptr++] = Class47.anInt407;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3325) {
					int_stack[int_stack_ptr++] = Class64_Sub18.aBoolean3690 ? 1 : 0;
					return;
				}
				if (i == 3326) {
					int_stack[int_stack_ptr++] = (((Player) Player.selfPlayer).playerCbLevel);
					return;
				}
				if (i == 3327) {
					int_stack[int_stack_ptr++] = ((((Player) Player.selfPlayer).appearance) != null && ((PlayerAppearance) (((Player) Player.selfPlayer).appearance)).aBoolean2681) ? 1 : 0;
					return;
				}
				if (i == 3329) {
					int_stack[int_stack_ptr++] = ModelDefinitions.aBoolean1401 ? 1 : 0;
					return;
				}
				if (i == 3330) {
					int i_100_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Class156_Sub1.method2498(i_100_, (byte) 99, false);
					return;
				}
				if (i == 3331) {
					int_stack_ptr -= 2;
					int i_101_ = int_stack[int_stack_ptr];
					int i_102_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class98_Sub6.method978(false, false, i_101_, true, i_102_);
					return;
				}
				if (i == 3332) {
					int_stack_ptr -= 2;
					int i_103_ = int_stack[int_stack_ptr];
					int i_104_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = Class98_Sub6.method978(false, true, i_103_, true, i_104_);
					return;
				}
				if (i == 3333) {
					int_stack[int_stack_ptr++] = Class146_Sub2.anInt4855;
					return;
				}
				if (i == 3335) {
					int_stack[int_stack_ptr++] = Class374.anInt3159;
					return;
				}
				if (i == 3336) {
					int_stack_ptr -= 4;
					int i_105_ = int_stack[int_stack_ptr];
					int i_106_ = int_stack[int_stack_ptr + 1];
					int i_107_ = int_stack[int_stack_ptr + 2];
					int i_108_ = int_stack[int_stack_ptr + 3];
					i_105_ += i_106_ << 14;
					i_105_ += i_107_ << 28;
					i_105_ += i_108_;
					int_stack[int_stack_ptr++] = i_105_;
					return;
				}
				if (i == 3337) {
					int_stack[int_stack_ptr++] = Class98_Sub10_Sub15.anInt5619;
					return;
				}
				if (i == 3338) {
					int_stack[int_stack_ptr++] = Class278_Sub1.method3320(12);
					return;
				}
				if (i == 3339) {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				if (i == 3340) {
					int_stack[int_stack_ptr++] = Class4.aBoolean84 ? 1 : 0;
					return;
				}
				if (i == 3341) {
					int_stack[int_stack_ptr++] = Class98_Sub10_Sub30.aBoolean5712 ? 1 : 0;
					return;
				}
				if (i == 3342) {
					int_stack[int_stack_ptr++] = Class2.aClass299_73.method3514(61);
					return;
				}
				if (i == 3343) {
					int_stack[int_stack_ptr++] = Class2.aClass299_73.method3507((byte) 82);
					return;
				}
				if (i == 3344) {
					aStringArray1883[anInt1884++] = Class152.method2477(29558);
					return;
				}
				if (i == 3345) {
					aStringArray1883[anInt1884++] = Class231.method2873(0);
					return;
				}
				if (i == 3346) {
					int_stack[int_stack_ptr++] = Class102.method1710(66);
					return;
				}
				if (i == 3347) {
					int_stack[int_stack_ptr++] = Class325.anInt2729;
					return;
				}
				if (i == 3349) {
					int_stack[int_stack_ptr++] = ((Mobile) Player.selfPlayer).aClass325_6399.method3698((byte) 116) >> 3;
					return;
				}
			} else if (i < 3500) {
				if (i == 3400) {
					int_stack_ptr -= 2;
					int i_109_ = int_stack[int_stack_ptr];
					int i_110_ = int_stack[int_stack_ptr + 1];
					Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(i_109_, 1028602529);
					aStringArray1883[anInt1884++] = class306.method3594(i_110_, (byte) 88);
					return;
				}
				if (i == 3408) {
					int_stack_ptr -= 4;
					int i_111_ = int_stack[int_stack_ptr];
					int i_112_ = int_stack[int_stack_ptr + 1];
					int i_113_ = int_stack[int_stack_ptr + 2];
					int i_114_ = int_stack[int_stack_ptr + 3];
					Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(i_113_, 1028602529);
					if (((Class306) class306).aChar2560 != i_111_ || ((Class306) class306).aChar2567 != i_112_)
						throw new RuntimeException("C3408-1 " + i_113_ + "-" + i_114_);
					if (i_112_ == 115)
						aStringArray1883[anInt1884++] = class306.method3594(i_114_, (byte) 23);
					else {
						int_stack[int_stack_ptr++] = class306.method3598(i_114_, -28629);
						return;
					}
					return;
				}
				if (i == 3409) {
					int_stack_ptr -= 3;
					int i_115_ = int_stack[int_stack_ptr];
					int i_116_ = int_stack[int_stack_ptr + 1];
					int i_117_ = int_stack[int_stack_ptr + 2];
					if (i_116_ == -1)
						throw new RuntimeException("C3409-2");
					Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(i_116_, 1028602529);
					if (((Class306) class306).aChar2567 != i_115_)
						throw new RuntimeException("C3409-1");
					int_stack[int_stack_ptr++] = class306.method3596(i_117_, (byte) 104) ? 1 : 0;
					return;
				}
				if (i == 3410) {
					int i_118_ = int_stack[--int_stack_ptr];
					String string = aStringArray1883[--anInt1884];
					if (i_118_ == -1)
						throw new RuntimeException("C3410-2");
					Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(i_118_, 1028602529);
					if (((Class306) class306).aChar2567 != 's')
						throw new RuntimeException("C3410-1");
					int_stack[int_stack_ptr++] = class306.method3602(string, -16972) ? 1 : 0;
					return;
				}
				if (i == 3411) {
					int i_119_ = int_stack[--int_stack_ptr];
					Class306 class306 = Class98_Sub10_Sub16.aClass29_5620.method302(i_119_, 1028602529);
					int_stack[int_stack_ptr++] = ((Class306) class306).aClass377_2558.method3999((byte) -6);
					return;
				}
			} else if (i < 3700) {
				if (i == 3600) {
					if (Class98_Sub28.anInt4078 == 0)
						int_stack[int_stack_ptr++] = -2;
					else {
						if (Class98_Sub28.anInt4078 == 1)
							int_stack[int_stack_ptr++] = -1;
						else {
							int_stack[int_stack_ptr++] = Class314.anInt2692;
							return;
						}
						return;
					}
					return;
				}
				if (i == 3601) {
					int i_120_ = int_stack[--int_stack_ptr];
					if (Class98_Sub28.anInt4078 == 2 && i_120_ < Class314.anInt2692) {
						aStringArray1883[anInt1884++] = Class98_Sub25.aStringArray4026[i_120_];
						if (Class315.aStringArray3527[i_120_] != null)
							aStringArray1883[anInt1884++] = Class315.aStringArray3527[i_120_];
						else
							aStringArray1883[anInt1884++] = "";
					} else {
						aStringArray1883[anInt1884++] = "";
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3602) {
					int i_121_ = int_stack[--int_stack_ptr];
					if (Class98_Sub28.anInt4078 == 2 && i_121_ < Class314.anInt2692)
						int_stack[int_stack_ptr++] = Class98_Sub26.anIntArray4030[i_121_];
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3603) {
					int i_122_ = int_stack[--int_stack_ptr];
					if (Class98_Sub28.anInt4078 == 2 && i_122_ < Class314.anInt2692)
						int_stack[int_stack_ptr++] = Class69.anIntArray3222[i_122_];
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3604) {
					String string = aStringArray1883[--anInt1884];
					int i_123_ = int_stack[--int_stack_ptr];
					Class373_Sub3.method3976(i_123_, (byte) 89, string);
					return;
				}
				if (i == 3605) {
					String string = aStringArray1883[--anInt1884];
					Class176.method2580(4, string);
					return;
				}
				if (i == 3606) {
					String string = aStringArray1883[--anInt1884];
					Class118.method2170(54, string);
					return;
				}
				if (i == 3607) {
					String string = aStringArray1883[--anInt1884];
					Class66.method684(-104, string, false);
					return;
				}
				if (i == 3608) {
					String string = aStringArray1883[--anInt1884];
					s_Sub1.method3430(string, -23995);
					return;
				}
				if (i == 3609) {
					String string = aStringArray1883[--anInt1884];
					if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
						string = string.substring(7);
					int_stack[int_stack_ptr++] = Class256_Sub1.method3195(0, string) ? 1 : 0;
					return;
				}
				if (i == 3610) {
					int i_124_ = int_stack[--int_stack_ptr];
					if (Class98_Sub28.anInt4078 == 2 && i_124_ < Class314.anInt2692)
						aStringArray1883[anInt1884++] = Class98_Sub10_Sub17.aStringArray5625[i_124_];
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3611) {
					if (Class153.aString1229 != null)
						aStringArray1883[anInt1884++] = Class98_Sub10_Sub2.method1007(Class153.aString1229, 46);
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3612) {
					if (Class153.aString1229 != null)
						int_stack[int_stack_ptr++] = Class32.anInt308;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3613) {
					int i_125_ = int_stack[--int_stack_ptr];
					if (Class153.aString1229 != null && i_125_ < Class32.anInt308)
						aStringArray1883[anInt1884++] = (((Class147) Class374.aClass147Array3157[i_125_]).aString1191);
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3614) {
					int i_126_ = int_stack[--int_stack_ptr];
					if (Class153.aString1229 != null && i_126_ < Class32.anInt308)
						int_stack[int_stack_ptr++] = (((Class147) Class374.aClass147Array3157[i_126_]).anInt1188);
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3615) {
					int i_127_ = int_stack[--int_stack_ptr];
					if (Class153.aString1229 != null && i_127_ < Class32.anInt308)
						int_stack[int_stack_ptr++] = (((Class147) Class374.aClass147Array3157[i_127_]).aByte1187);
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3616) {
					int_stack[int_stack_ptr++] = Class232.aByte1742;
					return;
				}
				if (i == 3617) {
					String string = aStringArray1883[--anInt1884];
					Class76_Sub4.method756(-108, string);
					return;
				}
				if (i == 3618) {
					int_stack[int_stack_ptr++] = Class111.aByte947;
					return;
				}
				if (i == 3619) {
					String string = aStringArray1883[--anInt1884];
					Class345.method3824(string, 2);
					return;
				}
				if (i == 3620) {
					Class339_Sub1.method3799(0);
					return;
				}
				if (i == 3621) {
					if (Class98_Sub28.anInt4078 == 0)
						int_stack[int_stack_ptr++] = -1;
					else {
						int_stack[int_stack_ptr++] = Class248.anInt1897;
						return;
					}
					return;
				}
				if (i == 3622) {
					int i_128_ = int_stack[--int_stack_ptr];
					if (Class98_Sub28.anInt4078 != 0 && i_128_ < Class248.anInt1897) {
						aStringArray1883[anInt1884++] = Class246_Sub4_Sub1.aStringArray6171[i_128_];
						if (Class98_Sub45.aStringArray4255[i_128_] != null)
							aStringArray1883[anInt1884++] = Class98_Sub45.aStringArray4255[i_128_];
						else
							aStringArray1883[anInt1884++] = "";
					} else {
						aStringArray1883[anInt1884++] = "";
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3623) {
					String string = aStringArray1883[--anInt1884];
					if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
						string = string.substring(7);
					int_stack[int_stack_ptr++] = Class14.method225(string, (byte) 117) ? 1 : 0;
					return;
				}
				if (i == 3624) {
					int i_129_ = int_stack[--int_stack_ptr];
					if (Class374.aClass147Array3157 != null && i_129_ < Class32.anInt308 && (((Class147) Class374.aClass147Array3157[i_129_]).aString1186.equalsIgnoreCase(((Player) Player.selfPlayer).displayName)))
						int_stack[int_stack_ptr++] = 1;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3625) {
					if (Class93_Sub3.aString5494 != null)
						aStringArray1883[anInt1884++] = Class93_Sub3.aString5494;
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3626) {
					int i_130_ = int_stack[--int_stack_ptr];
					if (Class153.aString1229 != null && i_130_ < Class32.anInt308)
						aStringArray1883[anInt1884++] = (((Class147) Class374.aClass147Array3157[i_130_]).aString1190);
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3627) {
					int i_131_ = int_stack[--int_stack_ptr];
					if (Class98_Sub28.anInt4078 == 2 && i_131_ >= 0 && i_131_ < Class314.anInt2692)
						int_stack[int_stack_ptr++] = aa_Sub3.aBooleanArray3575[i_131_] ? 1 : 0;
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 3628) {
					String string = aStringArray1883[--anInt1884];
					if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
						string = string.substring(7);
					int_stack[int_stack_ptr++] = Class111.method2094(string, -125);
					return;
				}
				if (i == 3629) {
					int_stack[int_stack_ptr++] = Class233.anInt1746;
					return;
				}
				if (i == 3630) {
					String string = aStringArray1883[--anInt1884];
					Class66.method684(-59, string, true);
					return;
				}
				if (i == 3631) {
					int i_132_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (Class98_Sub10_Sub38.aBooleanArray5759[i_132_] ? 1 : 0);
					return;
				}
				if (i == 3632) {
					int i_133_ = int_stack[--int_stack_ptr];
					if (Class153.aString1229 != null && i_133_ < Class32.anInt308)
						aStringArray1883[anInt1884++] = (((Class147) Class374.aClass147Array3157[i_133_]).aString1186);
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 3633) {
					int i_134_ = int_stack[--int_stack_ptr];
					if (Class98_Sub28.anInt4078 != 0 && i_134_ < Class248.anInt1897)
						aStringArray1883[anInt1884++] = Class255.aStringArray3209[i_134_];
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
			} else if (i < 4000) {
				if (i == 3903) {
					int i_135_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Class98_Sub10_Sub24.aClass101Array5666[i_135_].method1698(true);
					return;
				}
				if (i == 3904) {
					int i_136_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class101) (Class98_Sub10_Sub24.aClass101Array5666[i_136_])).anInt852;
					return;
				}
				if (i == 3905) {
					int i_137_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class101) (Class98_Sub10_Sub24.aClass101Array5666[i_137_])).anInt847;
					return;
				}
				if (i == 3906) {
					int i_138_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class101) (Class98_Sub10_Sub24.aClass101Array5666[i_138_])).anInt853;
					return;
				}
				if (i == 3907) {
					int i_139_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class101) (Class98_Sub10_Sub24.aClass101Array5666[i_139_])).anInt851;
					return;
				}
				if (i == 3908) {
					int i_140_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class101) (Class98_Sub10_Sub24.aClass101Array5666[i_140_])).anInt850;
					return;
				}
				if (i == 3910) {
					int i_141_ = int_stack[--int_stack_ptr];
					int i_142_ = Class98_Sub10_Sub24.aClass101Array5666[i_141_].method1700(7);
					int_stack[int_stack_ptr++] = i_142_ == 0 ? 1 : 0;
					return;
				}
				if (i == 3911) {
					int i_143_ = int_stack[--int_stack_ptr];
					int i_144_ = Class98_Sub10_Sub24.aClass101Array5666[i_143_].method1700(7);
					int_stack[int_stack_ptr++] = i_144_ == 2 ? 1 : 0;
					return;
				}
				if (i == 3912) {
					int i_145_ = int_stack[--int_stack_ptr];
					int i_146_ = Class98_Sub10_Sub24.aClass101Array5666[i_145_].method1700(7);
					int_stack[int_stack_ptr++] = i_146_ == 5 ? 1 : 0;
					return;
				}
				if (i == 3913) {
					int i_147_ = int_stack[--int_stack_ptr];
					int i_148_ = Class98_Sub10_Sub24.aClass101Array5666[i_147_].method1700(7);
					int_stack[int_stack_ptr++] = i_148_ == 1 ? 1 : 0;
					return;
				}
			} else if (i < 4100) {
				if (i == 4000) {
					int_stack_ptr -= 2;
					int i_149_ = int_stack[int_stack_ptr];
					int i_150_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_149_ + i_150_;
					return;
				}
				if (i == 4001) {
					int_stack_ptr -= 2;
					int i_151_ = int_stack[int_stack_ptr];
					int i_152_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_151_ - i_152_;
					return;
				}
				if (i == 4002) {
					int_stack_ptr -= 2;
					int i_153_ = int_stack[int_stack_ptr];
					int i_154_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_153_ * i_154_;
					return;
				}
				if (i == 4003) {
					int_stack_ptr -= 2;
					int i_155_ = int_stack[int_stack_ptr];
					int i_156_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_155_ / i_156_;
					return;
				}
				if (i == 4004) {
					int i_157_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (int) (Math.random() * (double) i_157_);
					return;
				}
				if (i == 4005) {
					int i_158_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (int) (Math.random() * (double) (i_158_ + 1));
					return;
				}
				if (i == 4006) {
					int_stack_ptr -= 5;
					int i_159_ = int_stack[int_stack_ptr];
					int i_160_ = int_stack[int_stack_ptr + 1];
					int i_161_ = int_stack[int_stack_ptr + 2];
					int i_162_ = int_stack[int_stack_ptr + 3];
					int i_163_ = int_stack[int_stack_ptr + 4];
					int_stack[int_stack_ptr++] = i_159_ + ((i_160_ - i_159_) * (i_163_ - i_161_) / (i_162_ - i_161_));
					return;
				}
				if (i == 4007) {
					int_stack_ptr -= 2;
					long l = (long) int_stack[int_stack_ptr];
					long l_164_ = (long) int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = (int) (l + l * l_164_ / 100L);
					return;
				}
				if (i == 4008) {
					int_stack_ptr -= 2;
					int i_165_ = int_stack[int_stack_ptr];
					int i_166_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_165_ | 1 << i_166_;
					return;
				}
				if (i == 4009) {
					int_stack_ptr -= 2;
					int i_167_ = int_stack[int_stack_ptr];
					int i_168_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_167_ & -1 - (1 << i_168_);
					return;
				}
				if (i == 4010) {
					int_stack_ptr -= 2;
					int i_169_ = int_stack[int_stack_ptr];
					int i_170_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = (i_169_ & 1 << i_170_) != 0 ? 1 : 0;
					return;
				}
				if (i == 4011) {
					int_stack_ptr -= 2;
					int i_171_ = int_stack[int_stack_ptr];
					int i_172_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_171_ % i_172_;
					return;
				}
				if (i == 4012) {
					int_stack_ptr -= 2;
					int i_173_ = int_stack[int_stack_ptr];
					int i_174_ = int_stack[int_stack_ptr + 1];
					if (i_173_ == 0)
						int_stack[int_stack_ptr++] = 0;
					else {
						int_stack[int_stack_ptr++] = (int) Math.pow((double) i_173_, (double) i_174_);
						return;
					}
					return;
				}
				if (i == 4013) {
					int_stack_ptr -= 2;
					int i_175_ = int_stack[int_stack_ptr];
					int i_176_ = int_stack[int_stack_ptr + 1];
					if (i_175_ == 0)
						int_stack[int_stack_ptr++] = 0;
					else {
						if (i_176_ == 0)
							int_stack[int_stack_ptr++] = 2147483647;
						else {
							int_stack[int_stack_ptr++] = (int) Math.pow((double) i_175_, 1.0 / (double) i_176_);
							return;
						}
						return;
					}
					return;
				}
				if (i == 4014) {
					int_stack_ptr -= 2;
					int i_177_ = int_stack[int_stack_ptr];
					int i_178_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_177_ & i_178_;
					return;
				}
				if (i == 4015) {
					int_stack_ptr -= 2;
					int i_179_ = int_stack[int_stack_ptr];
					int i_180_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_179_ | i_180_;
					return;
				}
				if (i == 4016) {
					int_stack_ptr -= 2;
					int i_181_ = int_stack[int_stack_ptr];
					int i_182_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_181_ < i_182_ ? i_181_ : i_182_;
					return;
				}
				if (i == 4017) {
					int_stack_ptr -= 2;
					int i_183_ = int_stack[int_stack_ptr];
					int i_184_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = i_183_ > i_184_ ? i_183_ : i_184_;
					return;
				}
				if (i == 4018) {
					int_stack_ptr -= 3;
					long l = (long) int_stack[int_stack_ptr];
					long l_185_ = (long) int_stack[int_stack_ptr + 1];
					long l_186_ = (long) int_stack[int_stack_ptr + 2];
					int_stack[int_stack_ptr++] = (int) (l * l_186_ / l_185_);
					return;
				}
				if (i == 4019) {
					int_stack_ptr -= 2;
					int i_187_ = int_stack[int_stack_ptr];
					int i_188_ = int_stack[int_stack_ptr + 1];
					if (i_187_ > 700 || i_188_ > 700)
						int_stack[int_stack_ptr++] = 256;
					double d = ((Math.random() * (double) (i_188_ + i_187_) - (double) i_187_ + 800.0) / 100.0);
					int_stack[int_stack_ptr++] = (int) (Math.pow(2.0, d) + 0.5);
					return;
				}
			} else if (i < 4200) {
				if (i == 4100) {
					String string = aStringArray1883[--anInt1884];
					int i_189_ = int_stack[--int_stack_ptr];
					aStringArray1883[anInt1884++] = string + i_189_;
					return;
				}
				if (i == 4101) {
					anInt1884 -= 2;
					String string = aStringArray1883[anInt1884];
					String string_190_ = aStringArray1883[anInt1884 + 1];
					aStringArray1883[anInt1884++] = string + string_190_;
					return;
				}
				if (i == 4102) {
					String string = aStringArray1883[--anInt1884];
					int i_191_ = int_stack[--int_stack_ptr];
					aStringArray1883[anInt1884++] = string + Class44.method428(i_191_, false, true);
					return;
				}
				if (i == 4103) {
					String string = aStringArray1883[--anInt1884];
					aStringArray1883[anInt1884++] = string.toLowerCase();
					return;
				}
				if (i == 4104) {
					aStringArray1883[anInt1884++] = method3149(int_stack[--int_stack_ptr]);
					return;
				}
				if (i == 4105) {
					anInt1884 -= 2;
					String string = aStringArray1883[anInt1884];
					String string_192_ = aStringArray1883[anInt1884 + 1];
					if ((((Player) Player.selfPlayer).appearance) != null && ((PlayerAppearance) (((Player) Player.selfPlayer).appearance)).aBoolean2681)
						aStringArray1883[anInt1884++] = string_192_;
					else {
						aStringArray1883[anInt1884++] = string;
						return;
					}
					return;
				}
				if (i == 4106) {
					int i_193_ = int_stack[--int_stack_ptr];
					aStringArray1883[anInt1884++] = Integer.toString(i_193_);
					return;
				}
				if (i == 4107) {
					anInt1884 -= 2;
					int_stack[int_stack_ptr++] = Class336.method3772(aStringArray1883[anInt1884], aStringArray1883[anInt1884 + 1], Class374.anInt3159, 1166845806);
					return;
				}
				if (i == 4108) {
					String string = aStringArray1883[--anInt1884];
					int_stack_ptr -= 2;
					int i_194_ = int_stack[int_stack_ptr];
					int i_195_ = int_stack[int_stack_ptr + 1];
					Class197 class197 = Class109.method1733((byte) 121, 0, i_195_, Class36.aClass207_348);
					int_stack[int_stack_ptr++] = class197.method2669(i_194_, 0, string, (Class64_Sub18.aClass332Array3689));
					return;
				}
				if (i == 4109) {
					String string = aStringArray1883[--anInt1884];
					int_stack_ptr -= 2;
					int i_196_ = int_stack[int_stack_ptr];
					int i_197_ = int_stack[int_stack_ptr + 1];
					Class197 class197 = Class109.method1733((byte) 119, 0, i_197_, Class36.aClass207_348);
					int_stack[int_stack_ptr++] = class197.method2670(i_196_, string, Class64_Sub18.aClass332Array3689, (byte) 5);
					return;
				}
				if (i == 4110) {
					anInt1884 -= 2;
					String string = aStringArray1883[anInt1884];
					String string_198_ = aStringArray1883[anInt1884 + 1];
					if (int_stack[--int_stack_ptr] == 1)
						aStringArray1883[anInt1884++] = string;
					else {
						aStringArray1883[anInt1884++] = string_198_;
						return;
					}
					return;
				}
				if (i == 4111) {
					String string = aStringArray1883[--anInt1884];
					aStringArray1883[anInt1884++] = Class249.method3160(string, 62);
					return;
				}
				if (i == 4112) {
					String string = aStringArray1883[--anInt1884];
					int i_199_ = int_stack[--int_stack_ptr];
					if (i_199_ == -1)
						throw new RuntimeException("null char");
					aStringArray1883[anInt1884++] = string + (char) i_199_;
					return;
				}
				if (i == 4113) {
					int i_200_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = method3146((char) i_200_);
					return;
				}
				if (i == 4114) {
					int i_201_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Class114.method2147((char) i_201_, 118) ? 1 : 0;
					return;
				}
				if (i == 4115) {
					int i_202_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (Class98_Sub46_Sub15.method1611((byte) 124, (char) i_202_) ? 1 : 0);
					return;
				}
				if (i == 4116) {
					int i_203_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (Class134_Sub1.method2245(18646, (char) i_203_) ? 1 : 0);
					return;
				}
				if (i == 4117) {
					String string = aStringArray1883[--anInt1884];
					if (string != null)
						int_stack[int_stack_ptr++] = string.length();
					else {
						int_stack[int_stack_ptr++] = 0;
						return;
					}
					return;
				}
				if (i == 4118) {
					String string = aStringArray1883[--anInt1884];
					int_stack_ptr -= 2;
					int i_204_ = int_stack[int_stack_ptr];
					int i_205_ = int_stack[int_stack_ptr + 1];
					aStringArray1883[anInt1884++] = string.substring(i_204_, i_205_);
					return;
				}
				if (i == 4119) {
					String string = aStringArray1883[--anInt1884];
					StringBuffer stringbuffer = new StringBuffer(string.length());
					boolean bool_206_ = false;
					for (int i_207_ = 0; i_207_ < string.length(); i_207_++) {
						char c = string.charAt(i_207_);
						if (c == '<')
							bool_206_ = true;
						else if (c == '>')
							bool_206_ = false;
						else if (!bool_206_)
							stringbuffer.append(c);
					}
					aStringArray1883[anInt1884++] = stringbuffer.toString();
					return;
				}
				if (i == 4120) {
					String string = aStringArray1883[--anInt1884];
					int_stack_ptr -= 2;
					int i_208_ = int_stack[int_stack_ptr];
					int i_209_ = int_stack[int_stack_ptr + 1];
					int_stack[int_stack_ptr++] = string.indexOf(i_208_, i_209_);
					return;
				}
				if (i == 4121) {
					anInt1884 -= 2;
					String string = aStringArray1883[anInt1884];
					String string_210_ = aStringArray1883[anInt1884 + 1];
					int i_211_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = string.indexOf(string_210_, i_211_);
					return;
				}
				if (i == 4122) {
					int i_212_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Character.toLowerCase((char) i_212_);
					return;
				}
				if (i == 4123) {
					int i_213_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = Character.toUpperCase((char) i_213_);
					return;
				}
				if (i == 4124) {
					boolean bool_214_ = int_stack[--int_stack_ptr] != 0;
					int i_215_ = int_stack[--int_stack_ptr];
					aStringArray1883[anInt1884++] = Class39.method349(Class374.anInt3159, 0, 48, (long) i_215_, bool_214_);
					return;
				}
				if (i == 4125) {
					String string = aStringArray1883[--anInt1884];
					int i_216_ = int_stack[--int_stack_ptr];
					Class197 class197 = Class109.method1733((byte) 115, 0, i_216_, Class36.aClass207_348);
					int_stack[int_stack_ptr++] = class197.method2676((byte) 82, Class64_Sub18.aClass332Array3689, string);
					return;
				}
			} else if (i < 4300) {
				if (i == 4200) {
					int i_217_ = int_stack[--int_stack_ptr];
					aStringArray1883[anInt1884++] = (((ItemDefinition) Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_217_)).name);
					return;
				}
				if (i == 4201) {
					int_stack_ptr -= 2;
					int i_218_ = int_stack[int_stack_ptr];
					int i_219_ = int_stack[int_stack_ptr + 1];
					ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_218_);
					if (i_219_ >= 1 && i_219_ <= 5 && (((ItemDefinition) class297).itemGroundOption[i_219_ - 1] != null))
						aStringArray1883[anInt1884++] = (((ItemDefinition) class297).itemGroundOption[i_219_ - 1]);
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 4202) {
					int_stack_ptr -= 2;
					int i_220_ = int_stack[int_stack_ptr];
					int i_221_ = int_stack[int_stack_ptr + 1];
					ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_220_);
					if (i_221_ >= 1 && i_221_ <= 5 && (((ItemDefinition) class297).inventoryOptions[i_221_ - 1] != null))
						aStringArray1883[anInt1884++] = (((ItemDefinition) class297).inventoryOptions[i_221_ - 1]);
					else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (i == 4203) {
					int i_222_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (((ItemDefinition) Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_222_)).anInt2475);
					return;
				}
				if (i == 4204) {
					int i_223_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (((ItemDefinition) Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_223_)).anInt2469) == 1 ? 1 : 0;
					return;
				}
				if (i == 4205) {
					int i_224_ = int_stack[--int_stack_ptr];
					ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_224_);
					if (((ItemDefinition) class297).anInt2414 == -1 && ((ItemDefinition) class297).anInt2433 >= 0)
						int_stack[int_stack_ptr++] = ((ItemDefinition) class297).anInt2433;
					else {
						int_stack[int_stack_ptr++] = i_224_;
						return;
					}
					return;
				}
				if (i == 4206) {
					int i_225_ = int_stack[--int_stack_ptr];
					ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_225_);
					if (((ItemDefinition) class297).anInt2414 >= 0 && ((ItemDefinition) class297).anInt2433 >= 0)
						int_stack[int_stack_ptr++] = ((ItemDefinition) class297).anInt2433;
					else {
						int_stack[int_stack_ptr++] = i_225_;
						return;
					}
					return;
				}
				if (i == 4207) {
					int i_226_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (((ItemDefinition) Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_226_)).isMembersItem) ? 1 : 0;
					return;
				}
				if (i == 4208) {
					int_stack_ptr -= 2;
					int i_227_ = int_stack[int_stack_ptr];
					int i_228_ = int_stack[int_stack_ptr + 1];
					ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_228_);
					if (class149.method2433(false))
						aStringArray1883[anInt1884++] = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_227_).method3495(((ParamType) class149).aString1203, -1, i_228_));
					else {
						int_stack[int_stack_ptr++] = (Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_227_).method3494(i_228_, (byte) -86, ((ParamType) class149).anInt1202));
						return;
					}
					return;
				}
				if (i == 4209) {
					int_stack_ptr -= 2;
					int i_229_ = int_stack[int_stack_ptr];
					int i_230_ = int_stack[int_stack_ptr + 1] - 1;
					ItemDefinition class297 = Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_229_);
					if (((ItemDefinition) class297).anInt2463 == i_230_)
						int_stack[int_stack_ptr++] = ((ItemDefinition) class297).anInt2440;
					else {
						if (((ItemDefinition) class297).anInt2434 == i_230_)
							int_stack[int_stack_ptr++] = ((ItemDefinition) class297).anInt2462;
						else {
							int_stack[int_stack_ptr++] = -1;
							return;
						}
						return;
					}
					return;
				}
				if (i == 4210) {
					String string = aStringArray1883[--anInt1884];
					int i_231_ = int_stack[--int_stack_ptr];
					Class115.method2156(i_231_ == 1, string, -97);
					int_stack[int_stack_ptr++] = Class18.anInt214;
					return;
				}
				if (i == 4211) {
					if (Class64_Sub16.aShortArray3682 == null || Class85.anInt638 >= Class18.anInt214)
						int_stack[int_stack_ptr++] = -1;
					else {
						int_stack[int_stack_ptr++] = (Class64_Sub16.aShortArray3682[Class85.anInt638++]) & 0xffff;
						return;
					}
					return;
				}
				if (i == 4212) {
					Class85.anInt638 = 0;
					return;
				}
				if (i == 4213) {
					int i_232_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = (((ItemDefinition) Class98_Sub46_Sub19.getItemDefs.getItemDefs(i_232_)).anInt2418);
					return;
				}
				if (i == 4214) {
					String string = aStringArray1883[--anInt1884];
					int_stack_ptr -= 3;
					int i_233_ = int_stack[int_stack_ptr];
					int i_234_ = int_stack[int_stack_ptr + 1];
					int i_235_ = int_stack[int_stack_ptr + 2];
					Class57.method519(i_233_ == 1, string, i_235_, -1, i_234_);
					int_stack[int_stack_ptr++] = Class18.anInt214;
					return;
				}
				if (i == 4215) {
					anInt1884 -= 2;
					int_stack_ptr -= 2;
					String string = aStringArray1883[anInt1884];
					int i_236_ = int_stack[int_stack_ptr];
					int i_237_ = int_stack[int_stack_ptr + 1];
					String string_238_ = aStringArray1883[anInt1884 + 1];
					Class287.method3387(string, string_238_, (byte) 34, i_236_ == 1, i_237_);
					int_stack[int_stack_ptr++] = Class18.anInt214;
					return;
				}
			} else if (i < 4400) {
				if (i == 4300) {
					int_stack_ptr -= 2;
					int i_239_ = int_stack[int_stack_ptr];
					int i_240_ = int_stack[int_stack_ptr + 1];
					ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_240_);
					if (class149.method2433(false))
						aStringArray1883[anInt1884++] = (Class4.aClass301_85.method3538(i_239_).method2298(i_240_, -105, ((ParamType) class149).aString1203));
					else {
						int_stack[int_stack_ptr++] = (Class4.aClass301_85.method3538(i_239_).method2305(i_240_, ((ParamType) class149).anInt1202, (byte) 127));
						return;
					}
					return;
				}
			} else if (i < 4500) {
				if (i == 4400) {
					int_stack_ptr -= 2;
					int i_241_ = int_stack[int_stack_ptr];
					int i_242_ = int_stack[int_stack_ptr + 1];
					ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_242_);
					if (class149.method2433(false))
						aStringArray1883[anInt1884++] = (Class130.aClass302_1028.method3546(i_241_, (byte) 119).method3864((byte) 109, i_242_, ((ParamType) class149).aString1203));
					else {
						int_stack[int_stack_ptr++] = (Class130.aClass302_1028.method3546(i_241_, (byte) 119).method3866(((ParamType) class149).anInt1202, i_242_, 1));
						return;
					}
					return;
				}
			} else if (i < 4600) {
				if (i == 4500) {
					int_stack_ptr -= 2;
					int i_243_ = int_stack[int_stack_ptr];
					int i_244_ = int_stack[int_stack_ptr + 1];
					ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_244_);
					if (class149.method2433(false))
						aStringArray1883[anInt1884++] = (Class62.aClass264_487.method3224(26, i_243_).method1586(i_244_, (byte) -19, ((ParamType) class149).aString1203));
					else {
						int_stack[int_stack_ptr++] = (Class62.aClass264_487.method3224(26, i_243_).method1585(i_244_, true, ((ParamType) class149).anInt1202));
						return;
					}
					return;
				}
			} else if (i < 4700 && i == 4600) {
				int i_245_ = int_stack[--int_stack_ptr];
				RenderAnimDefinitions class294 = Class370.aClass257_3136.method3199(false, i_245_);
				if (((RenderAnimDefinitions) class294).anIntArray2395 != null && ((RenderAnimDefinitions) class294).anIntArray2395.length > 0) {
					int i_246_ = 0;
					int i_247_ = ((RenderAnimDefinitions) class294).anIntArray2386[0];
					for (int i_248_ = 1; i_248_ < ((RenderAnimDefinitions) class294).anIntArray2395.length; i_248_++) {
						if (((RenderAnimDefinitions) class294).anIntArray2386[i_248_] > i_247_) {
							i_246_ = i_248_;
							i_247_ = ((RenderAnimDefinitions) class294).anIntArray2386[i_248_];
						}
					}
					int_stack[int_stack_ptr++] = ((RenderAnimDefinitions) class294).anIntArray2395[i_246_];
				} else {
					int_stack[int_stack_ptr++] = ((RenderAnimDefinitions) class294).anInt2396;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException(String.valueOf(i));
	}

	private static final String method3149(int i) {
		long l = ((long) i + 11745L) * 86400000L;
		aCalendar1882.setTime(new Date(l));
		int i_249_ = aCalendar1882.get(5);
		int i_250_ = aCalendar1882.get(2);
		int i_251_ = aCalendar1882.get(1);
		return (String.valueOf(i_249_) + "-" + aStringArray1892[i_250_] + "-" + i_251_);
	}

	private static final void method3150(ClientScript2Event class98_sub21, int i) {
		Object[] objects = ((ClientScript2Event) class98_sub21).cs2_params;
		int i_252_ = ((Integer) objects[0]).intValue();
		Class98_Sub46_Sub4 class98_sub46_sub4 = Class98_Sub46_Sub13_Sub2.method1601(i_252_, 100);
		if (class98_sub46_sub4 != null) {
			anIntArray1875 = new int[((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5958];
			int i_253_ = 0;
			aStringArray1886 = (new String[((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5964]);
			int i_254_ = 0;
			for (int i_255_ = 1; i_255_ < objects.length; i_255_++) {
				if (objects[i_255_] instanceof Integer) {
					int i_256_ = ((Integer) objects[i_255_]).intValue();
					if (i_256_ == -2147483647)
						i_256_ = ((ClientScript2Event) class98_sub21).anInt3985;
					if (i_256_ == -2147483646)
						i_256_ = ((ClientScript2Event) class98_sub21).mouse_y;
					if (i_256_ == -2147483645)
						i_256_ = ((((ClientScript2Event) class98_sub21).component != null) ? ((GameInterfaceData) (((ClientScript2Event) class98_sub21).component)).anInt2248 : -1);
					if (i_256_ == -2147483644)
						i_256_ = ((ClientScript2Event) class98_sub21).anInt3984;
					if (i_256_ == -2147483643)
						i_256_ = ((((ClientScript2Event) class98_sub21).component != null) ? ((GameInterfaceData) (((ClientScript2Event) class98_sub21).component)).anInt2300 : -1);
					if (i_256_ == -2147483642)
						i_256_ = ((((ClientScript2Event) class98_sub21).aClass293_3982 != null) ? ((GameInterfaceData) (((ClientScript2Event) class98_sub21).aClass293_3982)).anInt2248 : -1);
					if (i_256_ == -2147483641)
						i_256_ = ((((ClientScript2Event) class98_sub21).aClass293_3982 != null) ? ((GameInterfaceData) (((ClientScript2Event) class98_sub21).aClass293_3982)).anInt2300 : -1);
					if (i_256_ == -2147483640)
						i_256_ = ((ClientScript2Event) class98_sub21).anInt3977;
					if (i_256_ == -2147483639)
						i_256_ = ((ClientScript2Event) class98_sub21).anInt3976;
					anIntArray1875[i_253_++] = i_256_;
				} else if (objects[i_255_] instanceof String) {
					String string = (String) objects[i_255_];
					if (string.equals("event_opbase"))
						string = ((ClientScript2Event) class98_sub21).aString3978;
					aStringArray1886[i_254_++] = string;
				}
			}
			anInt1893 = ((ClientScript2Event) class98_sub21).anInt3990;
			method3153(class98_sub46_sub4, i);
		}
	}

	private static final void method3151(String string, int i) {
		if (Player.rights != 0 || ((!Class109.aBoolean933 || Class98_Sub10_Sub35.aBoolean5732) && !ModelDefinitions.aBoolean1401)) {
			String string_257_ = string.toLowerCase();
			int i_258_ = 0;
			if (string_257_.startsWith(TextResources.aClass309_2633.get_text(0))) {
				i_258_ = 0;
				string = string.substring(TextResources.aClass309_2633.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2634.get_text(0))) {
				i_258_ = 1;
				string = string.substring(TextResources.aClass309_2634.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2635.get_text(0))) {
				i_258_ = 2;
				string = string.substring(TextResources.aClass309_2635.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2636.get_text(0))) {
				i_258_ = 3;
				string = string.substring(TextResources.aClass309_2636.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2637.get_text(0))) {
				i_258_ = 4;
				string = string.substring(TextResources.aClass309_2637.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2638.get_text(0))) {
				i_258_ = 5;
				string = string.substring(TextResources.aClass309_2638.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2639.get_text(0))) {
				i_258_ = 6;
				string = string.substring(TextResources.aClass309_2639.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2640.get_text(0))) {
				i_258_ = 7;
				string = string.substring(TextResources.aClass309_2640.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2641.get_text(0))) {
				i_258_ = 8;
				string = string.substring(TextResources.aClass309_2641.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2642.get_text(0))) {
				i_258_ = 9;
				string = string.substring(TextResources.aClass309_2642.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2643.get_text(0))) {
				i_258_ = 10;
				string = string.substring(TextResources.aClass309_2643.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2644.get_text(0))) {
				i_258_ = 11;
				string = string.substring(TextResources.aClass309_2644.get_text(0).length());
			} else if (Class374.anInt3159 != 0) {
				if (string_257_.startsWith(TextResources.aClass309_2633.get_text(Class374.anInt3159))) {
					i_258_ = 0;
					string = string.substring(TextResources.aClass309_2633.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2634.get_text(Class374.anInt3159))) {
					i_258_ = 1;
					string = string.substring(TextResources.aClass309_2634.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2635.get_text(Class374.anInt3159))) {
					i_258_ = 2;
					string = string.substring(TextResources.aClass309_2635.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2636.get_text(Class374.anInt3159))) {
					i_258_ = 3;
					string = string.substring(TextResources.aClass309_2636.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2637.get_text(Class374.anInt3159))) {
					i_258_ = 4;
					string = string.substring(TextResources.aClass309_2637.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2638.get_text(Class374.anInt3159))) {
					i_258_ = 5;
					string = string.substring(TextResources.aClass309_2638.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2639.get_text(Class374.anInt3159))) {
					i_258_ = 6;
					string = string.substring(TextResources.aClass309_2639.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2640.get_text(Class374.anInt3159))) {
					i_258_ = 7;
					string = string.substring(TextResources.aClass309_2640.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2641.get_text(Class374.anInt3159))) {
					i_258_ = 8;
					string = string.substring(TextResources.aClass309_2641.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2642.get_text(Class374.anInt3159))) {
					i_258_ = 9;
					string = string.substring(TextResources.aClass309_2642.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2643.get_text(Class374.anInt3159))) {
					i_258_ = 10;
					string = string.substring(TextResources.aClass309_2643.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2644.get_text(Class374.anInt3159))) {
					i_258_ = 11;
					string = string.substring(TextResources.aClass309_2644.get_text(Class374.anInt3159).length());
				}
			}
			string_257_ = string.toLowerCase();
			int i_259_ = 0;
			if (string_257_.startsWith(TextResources.aClass309_2645.get_text(0))) {
				i_259_ = 1;
				string = string.substring(TextResources.aClass309_2645.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2646.get_text(0))) {
				i_259_ = 2;
				string = string.substring(TextResources.aClass309_2646.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2647.get_text(0))) {
				i_259_ = 3;
				string = string.substring(TextResources.aClass309_2647.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2648.get_text(0))) {
				i_259_ = 4;
				string = string.substring(TextResources.aClass309_2648.get_text(0).length());
			} else if (string_257_.startsWith(TextResources.aClass309_2649.get_text(0))) {
				i_259_ = 5;
				string = string.substring(TextResources.aClass309_2649.get_text(0).length());
			} else if (Class374.anInt3159 != 0) {
				if (string_257_.startsWith(TextResources.aClass309_2645.get_text(Class374.anInt3159))) {
					i_259_ = 1;
					string = string.substring(TextResources.aClass309_2645.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2646.get_text(Class374.anInt3159))) {
					i_259_ = 2;
					string = string.substring(TextResources.aClass309_2646.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2647.get_text(Class374.anInt3159))) {
					i_259_ = 3;
					string = string.substring(TextResources.aClass309_2647.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2648.get_text(Class374.anInt3159))) {
					i_259_ = 4;
					string = string.substring(TextResources.aClass309_2648.get_text(Class374.anInt3159).length());
				} else if (string_257_.startsWith(TextResources.aClass309_2649.get_text(Class374.anInt3159))) {
					i_259_ = 5;
					string = string.substring(TextResources.aClass309_2649.get_text(Class374.anInt3159).length());
				}
			}
			OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, Class87.aClass171_665, Class331.aClass117_2811);
			((OutgoingPacket) class98_sub11).packet.writeByte(0);
			int i_260_ = (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
			((OutgoingPacket) class98_sub11).packet.writeByte(i_258_);
			((OutgoingPacket) class98_sub11).packet.writeByte(i_259_);
			Class284_Sub1_Sub1.method3368(127, string, (((OutgoingPacket) class98_sub11).packet));
			((OutgoingPacket) class98_sub11).packet.method1211((byte) 84, (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position) - i_260_);
			Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
		}
	}

	static final void method3152(Class105 class105, int i, int i_261_) {
		Class98_Sub46_Sub4 class98_sub46_sub4 = Class213.method2779((byte) -109, i_261_, i, class105);
		if (class98_sub46_sub4 != null) {
			anIntArray1875 = new int[((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5958];
			aStringArray1886 = (new String[((Class98_Sub46_Sub4) class98_sub46_sub4).anInt5964]);
			if ((((Class98_Sub46_Sub4) class98_sub46_sub4).aClass105_5957 == Class90.aClass105_719) || (((Class98_Sub46_Sub4) class98_sub46_sub4).aClass105_5957 == Class331.aClass105_2792) || (((Class98_Sub46_Sub4) class98_sub46_sub4).aClass105_5957 == Class98_Sub10_Sub26.aClass105_5684)) {
				int i_262_ = 0;
				int i_263_ = 0;
				if (Class11.aClass293_120 != null) {
					i_262_ = ((GameInterfaceData) Class11.aClass293_120).anInt2347;
					i_263_ = ((GameInterfaceData) Class11.aClass293_120).anInt2299;
				}
				anIntArray1875[0] = Class2.aClass299_73.method3514(112) - i_262_;
				anIntArray1875[1] = Class2.aClass299_73.method3507((byte) 72) - i_263_;
			}
			method3153(class98_sub46_sub4, 200000);
		}
	}

	private static final void method3153(Class98_Sub46_Sub4 class98_sub46_sub4, int i) {
		int_stack_ptr = 0;
		anInt1884 = 0;
		int i_264_ = -1;
		int[] is = ((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5963;
		int[] is_265_ = ((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5967;
		int i_266_ = -1;
		anInt1888 = 0;
		try {
			int i_267_ = 0;
			for (;;) {
				if (++i_267_ > i)
					throw new RuntimeException("slow");
				i_266_ = is[++i_264_];
				if (i_266_ < 100) {
					if (i_266_ == 0)
						int_stack[int_stack_ptr++] = is_265_[i_264_];
					else if (i_266_ == 1) {
						int i_268_ = is_265_[i_264_];
						int_stack[int_stack_ptr++] = (((VarpClass) Class75.aClass140_584).anIntArray3244[i_268_]);
					} else if (i_266_ == 2) {
						int i_269_ = is_265_[i_264_];
						Class75.aClass140_584.method2291(i_269_, 98, (int_stack[--int_stack_ptr]));
					} else if (i_266_ == 3)
						aStringArray1883[anInt1884++] = (((Class98_Sub46_Sub4) class98_sub46_sub4).aStringArray5959[i_264_]);
					else if (i_266_ == 6)
						i_264_ += is_265_[i_264_];
					else if (i_266_ == 7) {
						int_stack_ptr -= 2;
						if (int_stack[int_stack_ptr] != int_stack[int_stack_ptr + 1])
							i_264_ += is_265_[i_264_];
					} else if (i_266_ == 8) {
						int_stack_ptr -= 2;
						if (int_stack[int_stack_ptr] == int_stack[int_stack_ptr + 1])
							i_264_ += is_265_[i_264_];
					} else if (i_266_ == 9) {
						int_stack_ptr -= 2;
						if (int_stack[int_stack_ptr] < int_stack[int_stack_ptr + 1])
							i_264_ += is_265_[i_264_];
					} else if (i_266_ == 10) {
						int_stack_ptr -= 2;
						if (int_stack[int_stack_ptr] > int_stack[int_stack_ptr + 1])
							i_264_ += is_265_[i_264_];
					} else if (i_266_ == 21) {
						if (anInt1888 == 0)
							return;
						Class349 class349 = aClass349Array1889[--anInt1888];
						class98_sub46_sub4 = ((Class349) class349).aClass98_Sub46_Sub4_2918;
						is = (((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5963);
						is_265_ = (((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5967);
						i_264_ = ((Class349) class349).anInt2919;
						anIntArray1875 = ((Class349) class349).anIntArray2916;
						aStringArray1886 = ((Class349) class349).aStringArray2917;
					} else if (i_266_ == 25) {
						int i_270_ = is_265_[i_264_];
						int_stack[int_stack_ptr++] = Class75.aClass140_584.method7(i_270_, 7373);
					} else if (i_266_ == 27) {
						int i_271_ = is_265_[i_264_];
						Class75.aClass140_584.method2289((int_stack[--int_stack_ptr]), i_271_, 0);
					} else if (i_266_ == 31) {
						int_stack_ptr -= 2;
						if (int_stack[int_stack_ptr] <= int_stack[int_stack_ptr + 1])
							i_264_ += is_265_[i_264_];
					} else if (i_266_ == 32) {
						int_stack_ptr -= 2;
						if (int_stack[int_stack_ptr] >= int_stack[int_stack_ptr + 1])
							i_264_ += is_265_[i_264_];
					} else if (i_266_ == 33)
						int_stack[int_stack_ptr++] = anIntArray1875[is_265_[i_264_]];
					else if (i_266_ == 34)
						anIntArray1875[is_265_[i_264_]] = int_stack[--int_stack_ptr];
					else if (i_266_ == 35)
						aStringArray1883[anInt1884++] = aStringArray1886[is_265_[i_264_]];
					else if (i_266_ == 36)
						aStringArray1886[is_265_[i_264_]] = aStringArray1883[--anInt1884];
					else if (i_266_ == 37) {
						int i_272_ = is_265_[i_264_];
						anInt1884 -= i_272_;
						String string = Class98_Sub5_Sub2.method968(i_272_, aStringArray1883, anInt1884, -17120);
						aStringArray1883[anInt1884++] = string;
					} else if (i_266_ == 38)
						int_stack_ptr--;
					else if (i_266_ == 39)
						anInt1884--;
					else if (i_266_ == 40) {
						int i_273_ = is_265_[i_264_];
						Class98_Sub46_Sub4 class98_sub46_sub4_274_ = Class98_Sub46_Sub13_Sub2.method1601(i_273_, 100);
						if (class98_sub46_sub4_274_ == null)
							throw new RuntimeException();
						int[] is_275_ = (new int[(((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5958)]);
						String[] strings = (new String[(((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5964)]);
						for (int i_276_ = 0; (i_276_ < (((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5966)); i_276_++)
							is_275_[i_276_] = (int_stack[int_stack_ptr - (((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5966) + i_276_]);
						for (int i_277_ = 0; (i_277_ < (((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5965)); i_277_++)
							strings[i_277_] = (aStringArray1883[anInt1884 - (((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5965) + i_277_]);
						int_stack_ptr -= (((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5966);
						anInt1884 -= (((Class98_Sub46_Sub4) class98_sub46_sub4_274_).anInt5965);
						Class349 class349 = new Class349();
						((Class349) class349).aClass98_Sub46_Sub4_2918 = class98_sub46_sub4;
						((Class349) class349).anInt2919 = i_264_;
						((Class349) class349).anIntArray2916 = anIntArray1875;
						((Class349) class349).aStringArray2917 = aStringArray1886;
						if (anInt1888 >= aClass349Array1889.length)
							throw new RuntimeException();
						aClass349Array1889[anInt1888++] = class349;
						class98_sub46_sub4 = class98_sub46_sub4_274_;
						is = (((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5963);
						is_265_ = (((Class98_Sub46_Sub4) class98_sub46_sub4).anIntArray5967);
						i_264_ = -1;
						anIntArray1875 = is_275_;
						aStringArray1886 = strings;
					} else if (i_266_ == 42)
						int_stack[int_stack_ptr++] = Class76_Sub5.anIntArray3744[is_265_[i_264_]];
					else if (i_266_ == 43) {
						int i_278_ = is_265_[i_264_];
						Class76_Sub5.anIntArray3744[i_278_] = int_stack[--int_stack_ptr];
						Class119_Sub1.method2180(i_278_, 15233);
						Class66.aBoolean507 |= VarpClass.aBooleanArray3246[i_278_];
					} else if (i_266_ == 44) {
						int i_279_ = is_265_[i_264_] >> 16;
						int i_280_ = is_265_[i_264_] & 0xffff;
						int i_281_ = int_stack[--int_stack_ptr];
						if (i_281_ < 0 || i_281_ > 5000)
							throw new RuntimeException();
						anIntArray1887[i_279_] = i_281_;
						int i_282_ = -1;
						if (i_280_ == 105)
							i_282_ = 0;
						for (int i_283_ = 0; i_283_ < i_281_; i_283_++)
							anIntArrayArray1881[i_279_][i_283_] = i_282_;
					} else if (i_266_ == 45) {
						int i_284_ = is_265_[i_264_];
						int i_285_ = int_stack[--int_stack_ptr];
						if (i_285_ < 0 || i_285_ >= anIntArray1887[i_284_])
							throw new RuntimeException();
						int_stack[int_stack_ptr++] = anIntArrayArray1881[i_284_][i_285_];
					} else if (i_266_ == 46) {
						int i_286_ = is_265_[i_264_];
						int_stack_ptr -= 2;
						int i_287_ = int_stack[int_stack_ptr];
						if (i_287_ < 0 || i_287_ >= anIntArray1887[i_286_])
							throw new RuntimeException();
						anIntArrayArray1881[i_286_][i_287_] = int_stack[int_stack_ptr + 1];
					} else if (i_266_ == 47) {
						String string = Class151_Sub1.aStringArray4967[is_265_[i_264_]];
						if (string == null)
							string = "null";
						aStringArray1883[anInt1884++] = string;
					} else if (i_266_ == 48) {
						int i_288_ = is_265_[i_264_];
						Class151_Sub1.aStringArray4967[i_288_] = aStringArray1883[--anInt1884];
						Class347.method3833(i_288_, 2);
					} else if (i_266_ == 51) {
						Class377 class377 = (((Class98_Sub46_Sub4) class98_sub46_sub4).aClass377Array5956[is_265_[i_264_]]);
						Class98_Sub34 class98_sub34 = ((Class98_Sub34) class377.method3990((long) (int_stack[--int_stack_ptr]), -1));
						if (class98_sub34 != null)
							i_264_ += ((Class98_Sub34) class98_sub34).anInt4126;
					} else if (i_266_ == 86) {
						if (int_stack[--int_stack_ptr] == 1)
							i_264_ += is_265_[i_264_];
					} else if (i_266_ == 87 && int_stack[--int_stack_ptr] == 0)
						i_264_ += is_265_[i_264_];
				} else {
					boolean bool;
					if (is_265_[i_264_] == 1)
						bool = true;
					else
						bool = false;
					if (i_266_ >= 100 && i_266_ < 5000)
						method3148(i_266_, bool);
					else {
						if (i_266_ < 5000 || i_266_ >= 10000)
							break;
						method3156(i_266_, bool);
					}
				}
			}
			throw new IllegalStateException("Command: " + i_266_);
		} catch (Exception exception) {
			if (((Class98_Sub46_Sub4) class98_sub46_sub4).aString5968 != null) {
				za_Sub2.method1684(("Clientscript error in: " + ((Class98_Sub46_Sub4) class98_sub46_sub4).aString5968), 4, (byte) 68);
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("Clientscript error in: ").append(((Class98_Sub46_Sub4) class98_sub46_sub4).aString5968).append("\n");
				for (int i_289_ = anInt1888 - 1; i_289_ >= 0; i_289_--)
					stringbuffer.append("via: ").append(((Class98_Sub46_Sub4) (((Class349) aClass349Array1889[i_289_]).aClass98_Sub46_Sub4_2918)).aString5968).append("\n");
				stringbuffer.append("Op: ").append(i_266_).append("\n");
				String string = exception.getMessage();
				if (string != null && string.length() > 0)
					stringbuffer.append("Message: ").append(string).append("\n");
				Map.method3585(exception, -125, stringbuffer.toString());
				Class98_Sub46.method1525(stringbuffer.toString(), -126);
			} else {
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("CS2: ").append(((Node) class98_sub46_sub4).uid).append(" ");
				for (int i_290_ = anInt1888 - 1; i_290_ >= 0; i_290_--)
					stringbuffer.append("v: ").append(((Node) (((Class349) aClass349Array1889[i_290_]).aClass98_Sub46_Sub4_2918)).uid).append(" ");
				stringbuffer.append("op: ").append(i_266_);
				Map.method3585(exception, -125, stringbuffer.toString());
			}
		}
	}

	public static void method3154() {
		anIntArray1875 = null;
		aStringArray1886 = null;
		anIntArray1887 = null;
		anIntArrayArray1881 = null;
		int_stack = null;
		aStringArray1883 = null;
		aClass349Array1889 = null;
		aClass293_1879 = null;
		aClass293_1877 = null;
		aClass300_1876 = null;
		aCalendar1882 = null;
		aStringArray1892 = null;
		anIntArray1891 = null;
		aClass79_1890 = null;
	}

	static final void method3155(int i) {
		if (i != -1 && Class85.getInterfaceData(i, 73)) {
			GameInterfaceData[] class293s = Class159.gameInterfaces[i];
			for (int i_291_ = 0; i_291_ < class293s.length; i_291_++) {
				GameInterfaceData class293 = class293s[i_291_];
				if (((GameInterfaceData) class293).anObjectArray2332 != null) {
					ClientScript2Event class98_sub21 = new ClientScript2Event();
					((ClientScript2Event) class98_sub21).component = class293;
					((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) class293).anObjectArray2332;
					method3150(class98_sub21, 2000000);
				}
			}
		}
	}

	private static final void method3156(int i, boolean bool) {
		if (i < 5100) {
			if (i == 5000) {
				int_stack[int_stack_ptr++] = Class265.anInt1983;
				return;
			}
			if (i == 5001) {
				int_stack_ptr -= 3;
				Class265.anInt1983 = int_stack[int_stack_ptr];
				Class86.aClass350_649 = Class98_Sub10_Sub8.method1029((byte) -107, (int_stack[int_stack_ptr + 1]));
				if (Class86.aClass350_649 == null)
					Class86.aClass350_649 = Class98_Sub27.aClass350_4074;
				Node.anInt837 = int_stack[int_stack_ptr + 2];
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class98_Sub17_Sub1.aClass171_5781), Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte(Class265.anInt1983);
				((OutgoingPacket) class98_sub11).packet.writeByte(((Class350) Class86.aClass350_649).anInt2920);
				((OutgoingPacket) class98_sub11).packet.writeByte(Node.anInt837);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5002) {
				anInt1884 -= 2;
				String string = aStringArray1883[anInt1884];
				String string_292_ = aStringArray1883[anInt1884 + 1];
				int_stack_ptr -= 2;
				int i_293_ = int_stack[int_stack_ptr];
				int i_294_ = int_stack[int_stack_ptr + 1];
				if (string_292_ == null)
					string_292_ = "";
				if (string_292_.length() > 80)
					string_292_ = string_292_.substring(0, 80);
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class64_Sub7.aClass171_3657), Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte((r_Sub2.method1650(string, (byte) 109) + 2 + r_Sub2.method1650(string_292_, (byte) 110)));
				((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
				((OutgoingPacket) class98_sub11).packet.writeByte(i_293_ - 1);
				((OutgoingPacket) class98_sub11).packet.writeByte(i_294_);
				((OutgoingPacket) class98_sub11).packet.method1188(string_292_, (byte) 113);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5003) {
				int i_295_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_295_);
				String string = "";
				if (class131 != null && ((Class131) class131).aString1041 != null)
					string = ((Class131) class131).aString1041;
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5004) {
				int i_296_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_296_);
				int i_297_ = -1;
				if (class131 != null)
					i_297_ = ((Class131) class131).anInt1040;
				int_stack[int_stack_ptr++] = i_297_;
				return;
			}
			if (i == 5005) {
				if (Class86.aClass350_649 == null)
					int_stack[int_stack_ptr++] = -1;
				else {
					int_stack[int_stack_ptr++] = ((Class350) Class86.aClass350_649).anInt2920;
					return;
				}
				return;
			}
			if (i == 5006) {
				int i_298_ = int_stack[--int_stack_ptr];
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class146_Sub3.aClass171_4900), Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte(i_298_);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5008) {
				String string = aStringArray1883[--anInt1884];
				method3151(string, i);
				return;
			}
			if (i == 5009) {
				anInt1884 -= 2;
				String string = aStringArray1883[anInt1884];
				String string_299_ = aStringArray1883[anInt1884 + 1];
				if (Player.rights != 0 || ((!Class109.aBoolean933 || Class98_Sub10_Sub35.aBoolean5732) && !ModelDefinitions.aBoolean1401)) {
					OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class246_Sub4_Sub2.aClass171_6185), (Class331.aClass117_2811));
					((OutgoingPacket) class98_sub11).packet.writeByte(0);
					int i_300_ = (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
					((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
					Class284_Sub1_Sub1.method3368(127, string_299_, (((OutgoingPacket) class98_sub11).packet));
					((OutgoingPacket) class98_sub11).packet.method1211((byte) 98, (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position) - i_300_);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				return;
			}
			if (i == 5010) {
				int i_301_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_301_);
				String string = "";
				if (class131 != null && ((Class131) class131).aString1033 != null)
					string = ((Class131) class131).aString1033;
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5011) {
				int i_302_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_302_);
				String string = "";
				if (class131 != null && ((Class131) class131).aString1032 != null)
					string = ((Class131) class131).aString1032;
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5012) {
				int i_303_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_303_);
				int i_304_ = -1;
				if (class131 != null)
					i_304_ = ((Class131) class131).anInt1036;
				int_stack[int_stack_ptr++] = i_304_;
				return;
			}
			if (i == 5015) {
				String string;
				if (Player.selfPlayer != null && (((Player) Player.selfPlayer).name != null))
					string = Player.selfPlayer.method3063(0, true);
				else
					string = "";
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5016) {
				int_stack[int_stack_ptr++] = Node.anInt837;
				return;
			}
			if (i == 5017) {
				int_stack[int_stack_ptr++] = Class98_Sub10_Sub27.method1086((byte) -4);
				return;
			}
			if (i == 5018) {
				int i_305_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_305_);
				int i_306_ = 0;
				if (class131 != null)
					i_306_ = ((Class131) class131).anInt1035;
				int_stack[int_stack_ptr++] = i_306_;
				return;
			}
			if (i == 5019) {
				int i_307_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_307_);
				String string = "";
				if (class131 != null && ((Class131) class131).aString1034 != null)
					string = ((Class131) class131).aString1034;
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5020) {
				String string;
				if (Player.selfPlayer != null && (((Player) Player.selfPlayer).name != null))
					string = Player.selfPlayer.method3059(-1, false);
				else
					string = "";
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5023) {
				int i_308_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_308_);
				int i_309_ = -1;
				if (class131 != null)
					i_309_ = ((Class131) class131).anInt1037;
				int_stack[int_stack_ptr++] = i_309_;
				return;
			}
			if (i == 5024) {
				int i_310_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_310_);
				int i_311_ = -1;
				if (class131 != null)
					i_311_ = ((Class131) class131).anInt1039;
				int_stack[int_stack_ptr++] = i_311_;
				return;
			}
			if (i == 5025) {
				int i_312_ = int_stack[--int_stack_ptr];
				Class131 class131 = Class138.method2280((byte) 49, i_312_);
				String string = "";
				if (class131 != null && ((Class131) class131).aString1042 != null)
					string = ((Class131) class131).aString1042;
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5050) {
				int i_313_ = int_stack[--int_stack_ptr];
				aStringArray1883[anInt1884++] = (((Class98_Sub46_Sub1) Class218.aClass212_1634.method2777(28559, i_313_)).aString5941);
				return;
			}
			if (i == 5051) {
				int i_314_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub1 class98_sub46_sub1 = Class218.aClass212_1634.method2777(28559, i_314_);
				if (((Class98_Sub46_Sub1) class98_sub46_sub1).anIntArray5944 == null)
					int_stack[int_stack_ptr++] = 0;
				else {
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub1) class98_sub46_sub1).anIntArray5944).length;
					return;
				}
				return;
			}
			if (i == 5052) {
				int_stack_ptr -= 2;
				int i_315_ = int_stack[int_stack_ptr];
				int i_316_ = int_stack[int_stack_ptr + 1];
				Class98_Sub46_Sub1 class98_sub46_sub1 = Class218.aClass212_1634.method2777(28559, i_315_);
				int i_317_ = (((Class98_Sub46_Sub1) class98_sub46_sub1).anIntArray5944[i_316_]);
				int_stack[int_stack_ptr++] = i_317_;
				return;
			}
			if (i == 5053) {
				int i_318_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub1 class98_sub46_sub1 = Class218.aClass212_1634.method2777(28559, i_318_);
				if (((Class98_Sub46_Sub1) class98_sub46_sub1).anIntArray5942 == null)
					int_stack[int_stack_ptr++] = 0;
				else {
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub1) class98_sub46_sub1).anIntArray5942).length;
					return;
				}
				return;
			}
			if (i == 5054) {
				int_stack_ptr -= 2;
				int i_319_ = int_stack[int_stack_ptr];
				int i_320_ = int_stack[int_stack_ptr + 1];
				int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub1) Class218.aClass212_1634.method2777(28559, i_319_)).anIntArray5942[i_320_]);
				return;
			}
			if (i == 5055) {
				int i_321_ = int_stack[--int_stack_ptr];
				aStringArray1883[anInt1884++] = Class52.aClass280_3500.method3325(i_321_, 51).method1582(false);
				return;
			}
			if (i == 5056) {
				int i_322_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub11 class98_sub46_sub11 = Class52.aClass280_3500.method3325(i_322_, 53);
				if (((Class98_Sub46_Sub11) class98_sub46_sub11).anIntArray6029 == null)
					int_stack[int_stack_ptr++] = 0;
				else {
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub11) class98_sub46_sub11).anIntArray6029).length;
					return;
				}
				return;
			}
			if (i == 5057) {
				int_stack_ptr -= 2;
				int i_323_ = int_stack[int_stack_ptr];
				int i_324_ = int_stack[int_stack_ptr + 1];
				int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub11) Class52.aClass280_3500.method3325(i_323_, 74)).anIntArray6029[i_324_]);
				return;
			}
			if (i == 5058) {
				aClass300_1876 = new Class300();
				((Class300) aClass300_1876).quickChatFileID = int_stack[--int_stack_ptr];
				((Class300) aClass300_1876).aClass98_Sub46_Sub11_2498 = Class52.aClass280_3500.method3325((((Class300) aClass300_1876).quickChatFileID), 98);
				((Class300) aClass300_1876).anIntArray2497 = new int[((Class300) aClass300_1876).aClass98_Sub46_Sub11_2498.method1574((byte) -111)];
				return;
			}
			if (i == 5059) {
				anInt1880++;
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class246_Sub3_Sub1.aClass171_6148), Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte(0);
				int i_325_ = (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
				((OutgoingPacket) class98_sub11).packet.writeByte(0);
				((OutgoingPacket) class98_sub11).packet.writeShort(((Class300) aClass300_1876).quickChatFileID);
				((Class300) aClass300_1876).aClass98_Sub46_Sub11_2498.method1579(((OutgoingPacket) class98_sub11).packet, ((Class300) aClass300_1876).anIntArray2497, -3);
				((OutgoingPacket) class98_sub11).packet.method1211((byte) 98, (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position - i_325_));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5060) {
				String string = aStringArray1883[--anInt1884];
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class98_Sub17_Sub1.aClass171_5780), Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte(0);
				int i_326_ = (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
				((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
				((OutgoingPacket) class98_sub11).packet.writeShort(((Class300) aClass300_1876).quickChatFileID);
				((Class300) aClass300_1876).aClass98_Sub46_Sub11_2498.method1579(((OutgoingPacket) class98_sub11).packet, ((Class300) aClass300_1876).anIntArray2497, -3);
				((OutgoingPacket) class98_sub11).packet.method1211((byte) 115, (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position - i_326_));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5061) {
				anInt1880++;
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class246_Sub3_Sub1.aClass171_6148), Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte(0);
				int i_327_ = (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position);
				((OutgoingPacket) class98_sub11).packet.writeByte(1);
				((OutgoingPacket) class98_sub11).packet.writeShort(((Class300) aClass300_1876).quickChatFileID);
				((Class300) aClass300_1876).aClass98_Sub46_Sub11_2498.method1579(((OutgoingPacket) class98_sub11).packet, ((Class300) aClass300_1876).anIntArray2497, -3);
				((OutgoingPacket) class98_sub11).packet.method1211((byte) 118, (((RSByteBuffer) (((OutgoingPacket) class98_sub11).packet)).position - i_327_));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5062) {
				int_stack_ptr -= 2;
				int i_328_ = int_stack[int_stack_ptr];
				int i_329_ = int_stack[int_stack_ptr + 1];
				int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub1) Class218.aClass212_1634.method2777(28559, i_328_)).aCharArray5946[i_329_]);
				return;
			}
			if (i == 5063) {
				int_stack_ptr -= 2;
				int i_330_ = int_stack[int_stack_ptr];
				int i_331_ = int_stack[int_stack_ptr + 1];
				int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub1) Class218.aClass212_1634.method2777(28559, i_330_)).aCharArray5947[i_331_]);
				return;
			}
			if (i == 5064) {
				int_stack_ptr -= 2;
				int i_332_ = int_stack[int_stack_ptr];
				int i_333_ = int_stack[int_stack_ptr + 1];
				if (i_333_ == -1)
					int_stack[int_stack_ptr++] = -1;
				else {
					int_stack[int_stack_ptr++] = Class218.aClass212_1634.method2777(28559, i_332_).method1528(-1, (char) i_333_);
					return;
				}
				return;
			}
			if (i == 5065) {
				int_stack_ptr -= 2;
				int i_334_ = int_stack[int_stack_ptr];
				int i_335_ = int_stack[int_stack_ptr + 1];
				if (i_335_ == -1)
					int_stack[int_stack_ptr++] = -1;
				else {
					int_stack[int_stack_ptr++] = Class218.aClass212_1634.method2777(28559, i_334_).method1529((char) i_335_, (byte) -126);
					return;
				}
				return;
			}
			if (i == 5066) {
				int i_336_ = int_stack[--int_stack_ptr];
				int_stack[int_stack_ptr++] = Class52.aClass280_3500.method3325(i_336_, 109).method1574((byte) -109);
				return;
			}
			if (i == 5067) {
				int_stack_ptr -= 2;
				int i_337_ = int_stack[int_stack_ptr];
				int i_338_ = int_stack[int_stack_ptr + 1];
				int i_339_ = (((Class348) Class52.aClass280_3500.method3325(i_337_, 67).method1580(i_338_, 78)).anInt2909);
				int_stack[int_stack_ptr++] = i_339_;
				return;
			}
			if (i == 5068) {
				int_stack_ptr -= 2;
				int i_340_ = int_stack[int_stack_ptr];
				int i_341_ = int_stack[int_stack_ptr + 1];
				((Class300) aClass300_1876).anIntArray2497[i_340_] = i_341_;
				return;
			}
			if (i == 5069) {
				int_stack_ptr -= 2;
				int i_342_ = int_stack[int_stack_ptr];
				int i_343_ = int_stack[int_stack_ptr + 1];
				((Class300) aClass300_1876).anIntArray2497[i_342_] = i_343_;
				return;
			}
			if (i == 5070) {
				int_stack_ptr -= 3;
				int i_344_ = int_stack[int_stack_ptr];
				int i_345_ = int_stack[int_stack_ptr + 1];
				int i_346_ = int_stack[int_stack_ptr + 2];
				Class98_Sub46_Sub11 class98_sub46_sub11 = Class52.aClass280_3500.method3325(i_344_, 65);
				if ((((Class348) class98_sub46_sub11.method1580(i_345_, -126)).anInt2909) != 0)
					throw new RuntimeException("bad command");
				int_stack[int_stack_ptr++] = class98_sub46_sub11.method1583(121, i_346_, i_345_);
				return;
			}
			if (i == 5071) {
				String string = aStringArray1883[--anInt1884];
				boolean bool_347_ = int_stack[--int_stack_ptr] == 1;
				RuneScapeCache.method2759(bool_347_, string, (byte) 69);
				int_stack[int_stack_ptr++] = Class18.anInt214;
				return;
			}
			if (i == 5072) {
				if (Class64_Sub16.aShortArray3682 == null || Class85.anInt638 >= Class18.anInt214)
					int_stack[int_stack_ptr++] = -1;
				else {
					int_stack[int_stack_ptr++] = (Class64_Sub16.aShortArray3682[Class85.anInt638++] & 0xffff);
					return;
				}
				return;
			}
			if (i == 5073) {
				Class85.anInt638 = 0;
				return;
			}
		} else if (i < 5200) {
			if (i == 5100) {
				if (RtKeyListener.key_listener.is_key_down(86, 5503))
					int_stack[int_stack_ptr++] = 1;
				else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 5101) {
				if (RtKeyListener.key_listener.is_key_down(82, 5503))
					int_stack[int_stack_ptr++] = 1;
				else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 5102) {
				if (RtKeyListener.key_listener.is_key_down(81, 5503))
					int_stack[int_stack_ptr++] = 1;
				else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
		} else if (i < 5300) {
			if (i == 5200) {
				Class98_Sub46_Sub2.method1534(int_stack[--int_stack_ptr], false);
				return;
			}
			if (i == 5201) {
				int_stack[int_stack_ptr++] = Class64.method553(1024);
				return;
			}
			if (i == 5205) {
				Class119.method2176(-1, false, int_stack[--int_stack_ptr], (byte) 89, -1);
				return;
			}
			if (i == 5206) {
				int i_348_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class278.method3303(i_348_ >> 14 & 0x3fff, i_348_ & 0x3fff);
				if (class98_sub46_sub10 == null)
					int_stack[int_stack_ptr++] = -1;
				else {
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6014);
					return;
				}
				return;
			}
			if (i == 5207) {
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class278.method3306(int_stack[--int_stack_ptr]);
				if (class98_sub46_sub10 == null || (((Class98_Sub46_Sub10) class98_sub46_sub10).aString6005 == null))
					aStringArray1883[anInt1884++] = "";
				else {
					aStringArray1883[anInt1884++] = (((Class98_Sub46_Sub10) class98_sub46_sub10).aString6005);
					return;
				}
				return;
			}
			if (i == 5208) {
				int_stack[int_stack_ptr++] = aa.anInt48;
				int_stack[int_stack_ptr++] = Class246_Sub3_Sub5_Sub2.anInt6268;
				return;
			}
			if (i == 5209) {
				int_stack[int_stack_ptr++] = Class42_Sub4.anInt5371 + Class278.anInt2075;
				int_stack[int_stack_ptr++] = Class98_Sub40.anInt4197 + Class278.anInt2078;
				return;
			}
			if (i == 5210) {
				int i_349_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class278.method3306(i_349_);
				if (class98_sub46_sub10 == null) {
					int_stack[int_stack_ptr++] = 0;
					int_stack[int_stack_ptr++] = 0;
				} else {
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6006) >> 14 & 0x3fff;
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6006) & 0x3fff;
					return;
				}
				return;
			}
			if (i == 5211) {
				int i_350_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class278.method3306(i_350_);
				if (class98_sub46_sub10 == null) {
					int_stack[int_stack_ptr++] = 0;
					int_stack[int_stack_ptr++] = 0;
				} else {
					int_stack[int_stack_ptr++] = ((((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6016) - (((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6008));
					int_stack[int_stack_ptr++] = ((((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6023) - (((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6009));
					return;
				}
				return;
			}
			if (i == 5212) {
				Class98_Sub47 class98_sub47 = Class256_Sub1.method3196((byte) -99);
				if (class98_sub47 == null) {
					int_stack[int_stack_ptr++] = -1;
					int_stack[int_stack_ptr++] = -1;
				} else {
					int_stack[int_stack_ptr++] = ((Class98_Sub47) class98_sub47).anInt4268;
					int i_351_ = (((Class98_Sub47) class98_sub47).anInt4269 << 28 | (((Class98_Sub47) class98_sub47).anInt4272 + Class278.anInt2075) << 14 | (((Class98_Sub47) class98_sub47).anInt4267 + Class278.anInt2078));
					int_stack[int_stack_ptr++] = i_351_;
					return;
				}
				return;
			}
			if (i == 5213) {
				Class98_Sub47 class98_sub47 = AnimableEntity.method2979(-105);
				if (class98_sub47 == null) {
					int_stack[int_stack_ptr++] = -1;
					int_stack[int_stack_ptr++] = -1;
				} else {
					int_stack[int_stack_ptr++] = ((Class98_Sub47) class98_sub47).anInt4268;
					int i_352_ = (((Class98_Sub47) class98_sub47).anInt4269 << 28 | (((Class98_Sub47) class98_sub47).anInt4272 + Class278.anInt2075) << 14 | (((Class98_Sub47) class98_sub47).anInt4267 + Class278.anInt2078));
					int_stack[int_stack_ptr++] = i_352_;
					return;
				}
				return;
			}
			if (i == 5214) {
				int i_353_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8.method1026(-3);
				if (class98_sub46_sub10 != null) {
					boolean bool_354_ = class98_sub46_sub10.method1573(i_353_ >> 28 & 0x3, anIntArray1891, -90, i_353_ & 0x3fff, (i_353_ >> 14 & 0x3fff));
					if (bool_354_)
						Class246_Sub2.method2971(anIntArray1891[2], (byte) 39, anIntArray1891[1]);
				}
				return;
			}
			if (i == 5215) {
				int_stack_ptr -= 2;
				int i_355_ = int_stack[int_stack_ptr];
				int i_356_ = int_stack[int_stack_ptr + 1];
				Class215 class215 = Class278.method3296(i_355_ >> 14 & 0x3fff, i_355_ & 0x3fff);
				boolean bool_357_ = false;
				for (Class98_Sub46_Sub10 class98_sub46_sub10 = (Class98_Sub46_Sub10) class215.method2792(-1); class98_sub46_sub10 != null; class98_sub46_sub10 = (Class98_Sub46_Sub10) class215.method2787(0)) {
					if (((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6014 == i_356_) {
						bool_357_ = true;
						break;
					}
				}
				if (bool_357_)
					int_stack[int_stack_ptr++] = 1;
				else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 5218) {
				int i_358_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class278.method3306(i_358_);
				if (class98_sub46_sub10 == null)
					int_stack[int_stack_ptr++] = -1;
				else {
					int_stack[int_stack_ptr++] = (((Class98_Sub46_Sub10) class98_sub46_sub10).anInt6007);
					return;
				}
				return;
			}
			if (i == 5220) {
				int_stack[int_stack_ptr++] = Class212.anInt1600 == 100 ? 1 : 0;
				return;
			}
			if (i == 5221) {
				int i_359_ = int_stack[--int_stack_ptr];
				Class246_Sub2.method2971(i_359_ & 0x3fff, (byte) 100, i_359_ >> 14 & 0x3fff);
				return;
			}
			if (i == 5222) {
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8.method1026(-3);
				if (class98_sub46_sub10 != null) {
					boolean bool_360_ = (class98_sub46_sub10.method1563(31960, Class42_Sub4.anInt5371 + Class278.anInt2075, anIntArray1891, Class98_Sub40.anInt4197 + Class278.anInt2078));
					if (bool_360_) {
						int_stack[int_stack_ptr++] = anIntArray1891[1];
						int_stack[int_stack_ptr++] = anIntArray1891[2];
					} else {
						int_stack[int_stack_ptr++] = -1;
						int_stack[int_stack_ptr++] = -1;
					}
				} else {
					int_stack[int_stack_ptr++] = -1;
					int_stack[int_stack_ptr++] = -1;
					return;
				}
				return;
			}
			if (i == 5223) {
				int_stack_ptr -= 2;
				int i_361_ = int_stack[int_stack_ptr];
				int i_362_ = int_stack[int_stack_ptr + 1];
				Class119.method2176(i_362_ >> 14 & 0x3fff, false, i_361_, (byte) 89, i_362_ & 0x3fff);
				return;
			}
			if (i == 5224) {
				int i_363_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8.method1026(-3);
				if (class98_sub46_sub10 != null) {
					boolean bool_364_ = class98_sub46_sub10.method1573(i_363_ >> 28 & 0x3, anIntArray1891, -105, i_363_ & 0x3fff, (i_363_ >> 14 & 0x3fff));
					if (bool_364_) {
						int_stack[int_stack_ptr++] = anIntArray1891[1];
						int_stack[int_stack_ptr++] = anIntArray1891[2];
					} else {
						int_stack[int_stack_ptr++] = -1;
						int_stack[int_stack_ptr++] = -1;
					}
				} else {
					int_stack[int_stack_ptr++] = -1;
					int_stack[int_stack_ptr++] = -1;
					return;
				}
				return;
			}
			if (i == 5225) {
				int i_365_ = int_stack[--int_stack_ptr];
				Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8.method1026(-3);
				if (class98_sub46_sub10 != null) {
					boolean bool_366_ = class98_sub46_sub10.method1563(31960, i_365_ >> 14 & 0x3fff, anIntArray1891, i_365_ & 0x3fff);
					if (bool_366_) {
						int_stack[int_stack_ptr++] = anIntArray1891[1];
						int_stack[int_stack_ptr++] = anIntArray1891[2];
					} else {
						int_stack[int_stack_ptr++] = -1;
						int_stack[int_stack_ptr++] = -1;
					}
				} else {
					int_stack[int_stack_ptr++] = -1;
					int_stack[int_stack_ptr++] = -1;
					return;
				}
				return;
			}
			if (i == 5226) {
				Class40.method362((byte) 103, int_stack[--int_stack_ptr]);
				return;
			}
			if (i == 5227) {
				int_stack_ptr -= 2;
				int i_367_ = int_stack[int_stack_ptr];
				int i_368_ = int_stack[int_stack_ptr + 1];
				Class119.method2176(i_368_ >> 14 & 0x3fff, true, i_367_, (byte) 89, i_368_ & 0x3fff);
				return;
			}
			if (i == 5228) {
				Class98_Sub43_Sub1.aBoolean5895 = int_stack[--int_stack_ptr] == 1;
				return;
			}
			if (i == 5229) {
				int_stack[int_stack_ptr++] = Class98_Sub43_Sub1.aBoolean5895 ? 1 : 0;
				return;
			}
			if (i == 5230) {
				int i_369_ = int_stack[--int_stack_ptr];
				Class119_Sub4.method2190(125, i_369_);
				return;
			}
			if (i == 5231) {
				int_stack_ptr -= 2;
				int i_370_ = int_stack[int_stack_ptr];
				boolean bool_371_ = int_stack[int_stack_ptr + 1] == 1;
				if (Class366.aClass377_3114 != null) {
					Node class98 = Class366.aClass377_3114.method3990((long) i_370_, -1);
					if (class98 != null && !bool_371_)
						class98.remove();
					else if (class98 == null && bool_371_) {
						class98 = new Node();
						Class366.aClass377_3114.method3996(class98, (long) i_370_, -1);
					}
				}
				return;
			}
			if (i == 5232) {
				int i_372_ = int_stack[--int_stack_ptr];
				if (Class366.aClass377_3114 != null) {
					Node class98 = Class366.aClass377_3114.method3990((long) i_372_, -1);
					int_stack[int_stack_ptr++] = class98 != null ? 1 : 0;
				} else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 5233) {
				int_stack_ptr -= 2;
				int i_373_ = int_stack[int_stack_ptr];
				boolean bool_374_ = int_stack[int_stack_ptr + 1] == 1;
				if (Class248.aClass377_1894 != null) {
					Node class98 = Class248.aClass377_1894.method3990((long) i_373_, -1);
					if (class98 != null && !bool_374_)
						class98.remove();
					else if (class98 == null && bool_374_) {
						class98 = new Node();
						Class248.aClass377_1894.method3996(class98, (long) i_373_, -1);
					}
				}
				return;
			}
			if (i == 5234) {
				int i_375_ = int_stack[--int_stack_ptr];
				if (Class248.aClass377_1894 != null) {
					Node class98 = Class248.aClass377_1894.method3990((long) i_375_, -1);
					int_stack[int_stack_ptr++] = class98 != null ? 1 : 0;
				} else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 5235) {
				int_stack[int_stack_ptr++] = (Class278.aClass98_Sub46_Sub10_2056 != null ? ((Class98_Sub46_Sub10) Class278.aClass98_Sub46_Sub10_2056).anInt6014 : -1);
				return;
			}
			if (i == 5236) {
				int_stack_ptr -= 2;
				int i_376_ = int_stack[int_stack_ptr];
				int i_377_ = int_stack[int_stack_ptr + 1];
				int i_378_ = i_377_ >> 14 & 0x3fff;
				int i_379_ = i_377_ & 0x3fff;
				int i_380_ = Class98_Sub28.method1307(i_376_, 1, i_378_, i_379_);
				if (i_380_ < 0)
					int_stack[int_stack_ptr++] = -1;
				else {
					int_stack[int_stack_ptr++] = i_380_;
					return;
				}
				return;
			}
			if (i == 5237) {
				Class231.method2878(2);
				return;
			}
		} else if (i < 5400) {
			if (i == 5300) {
				int_stack_ptr -= 2;
				int i_381_ = int_stack[int_stack_ptr];
				int i_382_ = int_stack[int_stack_ptr + 1];
				Class98_Sub16.method1150(3, i_381_, 3, i_382_, false);
				int_stack[int_stack_ptr++] = GameInterface.aFrame3950 != null ? 1 : 0;
				return;
			}
			if (i == 5301) {
				if (GameInterface.aFrame3950 != null)
					Class98_Sub16.method1150(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub27_4052.method666((byte) 123), -1, 3, -1, false);
				return;
			}
			if (i == 5302) {
				Class259[] class259s = Class47.method451(124);
				int_stack[int_stack_ptr++] = class259s.length;
				return;
			}
			if (i == 5303) {
				int i_383_ = int_stack[--int_stack_ptr];
				Class259[] class259s = Class47.method451(121);
				int_stack[int_stack_ptr++] = ((Class259) class259s[i_383_]).anInt1953;
				int_stack[int_stack_ptr++] = ((Class259) class259s[i_383_]).anInt1956;
				return;
			}
			if (i == 5305) {
				int i_384_ = Class110.anInt946;
				int i_385_ = Class112.anInt949;
				int i_386_ = -1;
				Class259[] class259s = Class47.method451(122);
				for (int i_387_ = 0; i_387_ < class259s.length; i_387_++) {
					Class259 class259 = class259s[i_387_];
					if (((Class259) class259).anInt1953 == i_384_ && ((Class259) class259).anInt1956 == i_385_) {
						i_386_ = i_387_;
						break;
					}
				}
				int_stack[int_stack_ptr++] = i_386_;
				return;
			}
			if (i == 5306) {
				int_stack[int_stack_ptr++] = Class146_Sub2.method2391((byte) 102);
				return;
			}
			if (i == 5307) {
				int i_388_ = int_stack[--int_stack_ptr];
				if (i_388_ >= 1 && i_388_ <= 2) {
					Class98_Sub16.method1150(i_388_, -1, 3, -1, false);
					return;
				}
				return;
			}
			if (i == 5308) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub27_4052.method666((byte) 122);
				return;
			}
			if (i == 5309) {
				int i_389_ = int_stack[--int_stack_ptr];
				if (i_389_ >= 1 && i_389_ <= 2) {
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_389_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub27_4052));
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_389_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub27_4068));
					Class310.method3618(-5964);
					return;
				}
				return;
			}
		} else if (i < 5500) {
			if (i == 5400) {
				anInt1884 -= 2;
				String string = aStringArray1883[anInt1884];
				String string_390_ = aStringArray1883[anInt1884 + 1];
				int i_391_ = int_stack[--int_stack_ptr];
				OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, Class224.aClass171_1684, Class331.aClass117_2811);
				((OutgoingPacket) class98_sub11).packet.writeByte((r_Sub2.method1650(string, (byte) 79) + r_Sub2.method1650(string_390_, (byte) 124) + 1));
				((OutgoingPacket) class98_sub11).packet.method1188(string, (byte) 113);
				((OutgoingPacket) class98_sub11).packet.method1188(string_390_, (byte) 113);
				((OutgoingPacket) class98_sub11).packet.writeByte(i_391_);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5401) {
				int_stack_ptr -= 2;
				Class246.aShortArray1869[int_stack[int_stack_ptr]] = (short) Class38.method348(int_stack[int_stack_ptr + 1], -13);
				Class98_Sub46_Sub19.getItemDefs.method2721(60);
				Class98_Sub46_Sub19.getItemDefs.method2717(64);
				Class4.aClass301_85.method3534(-123);
				Class98_Sub43.method1481(2);
				return;
			}
			if (i == 5405) {
				int_stack_ptr -= 2;
				int i_392_ = int_stack[int_stack_ptr];
				int i_393_ = int_stack[int_stack_ptr + 1];
				if (i_392_ >= 0 && i_392_ < 2)
					InputStream_Sub1.anIntArrayArrayArray27[i_392_] = new int[i_393_ << 1][4];
				return;
			}
			if (i == 5406) {
				int_stack_ptr -= 7;
				int i_394_ = int_stack[int_stack_ptr];
				int i_395_ = int_stack[int_stack_ptr + 1] << 1;
				int i_396_ = int_stack[int_stack_ptr + 2];
				int i_397_ = int_stack[int_stack_ptr + 3];
				int i_398_ = int_stack[int_stack_ptr + 4];
				int i_399_ = int_stack[int_stack_ptr + 5];
				int i_400_ = int_stack[int_stack_ptr + 6];
				if (i_394_ >= 0 && i_394_ < 2 && InputStream_Sub1.anIntArrayArrayArray27[i_394_] != null && i_395_ >= 0 && i_395_ < (InputStream_Sub1.anIntArrayArrayArray27[i_394_]).length) {
					InputStream_Sub1.anIntArrayArrayArray27[i_394_][i_395_] = new int[] { (i_396_ >> 14 & 0x3fff) << 9, i_397_ << 2, (i_396_ & 0x3fff) << 9, i_400_ };
					InputStream_Sub1.anIntArrayArrayArray27[i_394_][i_395_ + 1] = new int[] { (i_398_ >> 14 & 0x3fff) << 9, i_399_ << 2, (i_398_ & 0x3fff) << 9 };
				}
				return;
			}
			if (i == 5407) {
				int i_401_ = ((InputStream_Sub1.anIntArrayArrayArray27[int_stack[--int_stack_ptr]]).length >> 1);
				int_stack[int_stack_ptr++] = i_401_;
				return;
			}
			if (i == 5411) {
				if (GameInterface.aFrame3950 != null)
					Class98_Sub16.method1150(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub27_4052.method666((byte) 121), -1, 3, -1, false);
				if (Class284.aFrame2168 != null) {
					Class23.method283((byte) 100);
					System.exit(0);
				} else {
					String string = (Class5.aString3440 != null ? Class5.aString3440 : Class98_Sub17.method1153((byte) -100));
					Class315.method3647(false, ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 123) == 1, string, true, Class98_Sub43_Sub2.aClass88_5907);
					return;
				}
				return;
			}
			if (i == 5419) {
				String string = "";
				if (Class187.aClass143_1449 != null) {
					if (Class187.aClass143_1449.anObject1162 != null)
						string = (String) Class187.aClass143_1449.anObject1162;
					else
						string = Class98_Sub10_Sub39.method1122((Class187.aClass143_1449.anInt1166), (byte) -36);
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5420) {
				int_stack[int_stack_ptr++] = (((Class88) Class98_Sub43_Sub2.aClass88_5907).aBoolean682 ? 0 : 1);
				return;
			}
			if (i == 5421) {
				if (GameInterface.aFrame3950 != null)
					Class98_Sub16.method1150(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub27_4052.method666((byte) 125), -1, 3, -1, false);
				String string = aStringArray1883[--anInt1884];
				boolean bool_402_ = int_stack[--int_stack_ptr] == 1;
				String string_403_ = Class98_Sub17.method1153((byte) -64) + string;
				Class315.method3647(bool_402_, ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 123) == 1, string_403_, true, Class98_Sub43_Sub2.aClass88_5907);
				return;
			}
			if (i == 5422) {
				anInt1884 -= 2;
				String string = aStringArray1883[anInt1884];
				String string_404_ = aStringArray1883[anInt1884 + 1];
				int i_405_ = int_stack[--int_stack_ptr];
				if (string.length() > 0) {
					if (Class116.aStringArray966 == null)
						Class116.aStringArray966 = new String[(Class282.anIntArray2130[(((Class279) Class4.aClass279_86).anInt2095)])];
					Class116.aStringArray966[i_405_] = string;
				}
				if (string_404_.length() > 0) {
					if (Class84.aStringArray636 == null)
						Class84.aStringArray636 = new String[(Class282.anIntArray2130[(((Class279) Class4.aClass279_86).anInt2095)])];
					Class84.aStringArray636[i_405_] = string_404_;
				}
				return;
			}
			if (i == 5423) {
				System.out.println(aStringArray1883[--anInt1884]);
				return;
			}
			if (i == 5424) {
				int_stack_ptr -= 11;
				Class260.anInt3261 = int_stack[int_stack_ptr];
				Class355.anInt3017 = int_stack[int_stack_ptr + 1];
				Class93_Sub1_Sub1.anInt6289 = int_stack[int_stack_ptr + 2];
				Class264.anInt1971 = int_stack[int_stack_ptr + 3];
				Class38.anInt360 = int_stack[int_stack_ptr + 4];
				Class222.anInt1672 = int_stack[int_stack_ptr + 5];
				Class25.anInt267 = int_stack[int_stack_ptr + 6];
				Class95.anInt799 = int_stack[int_stack_ptr + 7];
				AbstractModel.anInt1183 = int_stack[int_stack_ptr + 8];
				Class147.anInt1194 = int_stack[int_stack_ptr + 9];
				Class246.anInt1871 = int_stack[int_stack_ptr + 10];
				Class332_Sub2.aClass207_5423.method2742(-28, Class38.anInt360);
				Class332_Sub2.aClass207_5423.method2742(-124, Class222.anInt1672);
				Class332_Sub2.aClass207_5423.method2742(-125, Class25.anInt267);
				Class332_Sub2.aClass207_5423.method2742(-34, Class95.anInt799);
				Class332_Sub2.aClass207_5423.method2742(-116, AbstractModel.anInt1183);
				Class45.aClass332_383 = Class98_Sub50.aClass332_4287 = Class98_Sub47.aClass332_4273 = null;
				Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508 = Class300.aClass332_2500 = Class76_Sub11.aClass332_3795 = null;
				Class98_Sub10_Sub28.aClass332_5704 = Class221.aClass332_1666 = null;
				Class98_Sub5_Sub3.aBoolean5539 = true;
				return;
			}
			if (i == 5425) {
				IncomingMessages.method466(true);
				Class98_Sub5_Sub3.aBoolean5539 = false;
				return;
			}
			if (i == 5426) {
				int_stack_ptr -= 2;
				OutputStream_Sub2.anInt39 = int_stack[int_stack_ptr];
				Class284_Sub2.anInt5186 = int_stack[int_stack_ptr + 1];
				return;
			}
			if (i == 5427) {
				int_stack_ptr -= 2;
				Class16.anInt190 = int_stack[int_stack_ptr + 1];
				return;
			}
			if (i == 5428) {
				int_stack_ptr -= 2;
				int i_406_ = int_stack[int_stack_ptr];
				int i_407_ = int_stack[int_stack_ptr + 1];
				int_stack[int_stack_ptr++] = (Class98_Sub46_Sub5.method1543(i_406_, i_407_, (byte) 6) ? 1 : 0);
				return;
			}
			if (i == 5429) {
				DebugConsole.handleCommand(aStringArray1883[--anInt1884], false, false, (byte) 117);
				return;
			}
			if (i == 5430) {
				try {
					Class203.method2704("accountcreated", Class76_Sub11.anApplet3799, -26978);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (i == 5431) {
				try {
					Class203.method2704("accountcreatestarted", Class76_Sub11.anApplet3799, -26978);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (i == 5432) {
				String string = "";
				if (Class8.aClipboard113 != null) {
					Transferable transferable = Class8.aClipboard113.getContents(null);
					if (transferable != null) {
						try {
							string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string == null)
								string = "";
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5433) {
				Class64_Sub3.anInt3647 = int_stack[--int_stack_ptr];
				return;
			}
		} else if (i < 5600) {
			if (i == 5500) {
				int_stack_ptr -= 4;
				int i_408_ = int_stack[int_stack_ptr];
				int i_409_ = int_stack[int_stack_ptr + 1];
				int i_410_ = int_stack[int_stack_ptr + 2];
				int i_411_ = int_stack[int_stack_ptr + 3];
				ha_Sub1.method1871(i_410_, ((i_408_ >> 14 & 0x3fff) - Class272.anInt2038), false, i_409_ << 2, (i_408_ & 0x3fff) - aa_Sub2.anInt3562, i_411_, -116);
				return;
			}
			if (i == 5501) {
				int_stack_ptr -= 4;
				int i_412_ = int_stack[int_stack_ptr];
				int i_413_ = int_stack[int_stack_ptr + 1];
				int i_414_ = int_stack[int_stack_ptr + 2];
				int i_415_ = int_stack[int_stack_ptr + 3];
				Class98_Sub46_Sub13.method1592(-25686, i_414_, ((i_412_ >> 14 & 0x3fff) - Class272.anInt2038), i_413_ << 2, i_415_, ((i_412_ & 0x3fff) - aa_Sub2.anInt3562));
				return;
			}
			if (i == 5502) {
				int_stack_ptr -= 6;
				int i_416_ = int_stack[int_stack_ptr];
				if (i_416_ >= 2)
					throw new RuntimeException();
				Class368.anInt3128 = i_416_;
				int i_417_ = int_stack[int_stack_ptr + 1];
				if (i_417_ + 1 >= (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128]).length >> 1)
					throw new RuntimeException();
				Class50.anInt418 = i_417_;
				Class54.anInt3394 = 0;
				Class246.anInt1872 = int_stack[int_stack_ptr + 2];
				Class98_Sub10_Sub32.anInt5718 = int_stack[int_stack_ptr + 3];
				int i_418_ = int_stack[int_stack_ptr + 4];
				if (i_418_ >= 2)
					throw new RuntimeException();
				Class53_Sub1.anInt3636 = i_418_;
				int i_419_ = int_stack[int_stack_ptr + 5];
				if (i_419_ + 1 >= (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636]).length >> 1)
					throw new RuntimeException();
				ha.anInt943 = i_419_;
				Class98_Sub46_Sub20_Sub2.anInt6319 = 3;
				Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
				return;
			}
			if (i == 5503) {
				Class284.method3359(9268);
				return;
			}
			if (i == 5504) {
				int_stack_ptr -= 2;
				Class308.method3608(int_stack[int_stack_ptr + 1], 0, 87, int_stack[int_stack_ptr]);
				return;
			}
			if (i == 5505) {
				int_stack[int_stack_ptr++] = (int) GameWorld.cameraGetVrot >> 3;
				return;
			}
			if (i == 5506) {
				int_stack[int_stack_ptr++] = (int) GameWorld.cameraGetHrot >> 3;
				return;
			}
			if (i == 5507) {
				Exception_Sub1.method134((byte) -87);
				return;
			}
			if (i == 5508) {
				Class98_Sub43.method1485(-1);
				return;
			}
			if (i == 5509) {
				Class64_Sub13.method603((byte) -107);
				return;
			}
			if (i == 5510) {
				Class98_Sub31_Sub2.method1367((byte) 83);
				return;
			}
			if (i == 5511) {
				int i_420_ = int_stack[--int_stack_ptr];
				int i_421_ = i_420_ >> 14 & 0x3fff;
				int i_422_ = i_420_ & 0x3fff;
				i_421_ -= Class272.anInt2038;
				if (i_421_ < 0)
					i_421_ = 0;
				else if (i_421_ >= GameWorld.size_x)
					i_421_ = GameWorld.size_x;
				i_422_ -= aa_Sub2.anInt3562;
				if (i_422_ < 0)
					i_422_ = 0;
				else if (i_422_ >= GameWorld.size_y)
					i_422_ = GameWorld.size_y;
				Class98_Sub46_Sub2_Sub2.anInt6295 = (i_421_ << 9) + 256;
				Class135.anInt1051 = (i_422_ << 9) + 256;
				Class98_Sub46_Sub20_Sub2.anInt6319 = 4;
				Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
				return;
			}
			if (i == 5512) {
				Class352.method3856((byte) 1);
				return;
			}
			if (i == 5514) {
				Class16.anInt199 = int_stack[--int_stack_ptr];
				return;
			}
			if (i == 5516) {
				int_stack[int_stack_ptr++] = Class16.anInt199;
				return;
			}
			if (i == 5517) {
				int i_423_ = int_stack[--int_stack_ptr];
				if (i_423_ == -1) {
					int i_424_ = i_423_ >> 14 & 0x3fff;
					int i_425_ = i_423_ & 0x3fff;
					i_424_ -= Class272.anInt2038;
					if (i_424_ < 0)
						i_424_ = 0;
					else if (i_424_ >= GameWorld.size_x)
						i_424_ = GameWorld.size_x;
					i_425_ -= aa_Sub2.anInt3562;
					if (i_425_ < 0)
						i_425_ = 0;
					else if (i_425_ >= GameWorld.size_y)
						i_425_ = GameWorld.size_y;
					Class116.anInt967 = (i_424_ << 9) + 256;
					Class64_Sub26.anInt3712 = (i_425_ << 9) + 256;
				} else {
					Class116.anInt967 = -1;
					Class64_Sub26.anInt3712 = -1;
					return;
				}
				return;
			}
		} else if (i < 5700) {
			if (i == 5600) {
				anInt1884 -= 2;
				String string = aStringArray1883[anInt1884];
				String string_426_ = aStringArray1883[anInt1884 + 1];
				int i_427_ = int_stack[--int_stack_ptr];
				if (string.length() <= 320 && Class177.anInt1376 == 3 && (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					Class98_Sub5.aString3837 = string;
					Class360.aString3064 = string_426_;
					Class146_Sub2.anInt4855 = i_427_;
					Class61.method538(6, false);
					return;
				}
				return;
			}
			if (i == 5601) {
				Class246_Sub4_Sub1.method3103((byte) -38);
				return;
			}
			if (i == 5602) {
				if (Class64_Sub16.anInt3680 == 0) {
					Class257.anInt1946 = -2;
					Class31.anInt300 = -2;
				}
				return;
			}
			if (i == 5604) {
				anInt1884--;
				if (Class177.anInt1376 == 3 && (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					Class329.method3713((byte) 34, aStringArray1883[anInt1884]);
					return;
				}
				return;
			}
			if (i == 5605) {
				anInt1884 -= 2;
				int_stack_ptr -= 2;
				if (Class177.anInt1376 == 3 && (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					Class132.method2236(int_stack[int_stack_ptr + 1] == 1, 0, aStringArray1883[anInt1884 + 1], aStringArray1883[anInt1884], int_stack[int_stack_ptr]);
					return;
				}
				return;
			}
			if (i == 5606) {
				if (Class21_Sub4.anInt5394 == 0)
					Class55.anInt442 = -2;
				return;
			}
			if (i == 5607) {
				int_stack[int_stack_ptr++] = Class31.anInt300;
				return;
			}
			if (i == 5608) {
				int_stack[int_stack_ptr++] = Class98_Sub48.anInt4277;
				return;
			}
			if (i == 5609) {
				int_stack[int_stack_ptr++] = Class55.anInt442;
				return;
			}
			if (i == 5611) {
				int_stack[int_stack_ptr++] = Class69_Sub1.anInt5330;
				return;
			}
			if (i == 5612) {
				int i_428_ = int_stack[--int_stack_ptr];
				if (Class177.anInt1376 == 7 && (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					if (aa_Sub1.aClass123_3561 != null) {
						aa_Sub1.aClass123_3561.method2207(-18);
						aa_Sub1.aClass123_3561 = null;
					}
					Class146_Sub2.anInt4855 = i_428_;
					Class61.method538(9, false);
					return;
				}
				return;
			}
			if (i == 5613) {
				int_stack[int_stack_ptr++] = Class31.anInt300;
				return;
			}
			if (i == 5615) {
				anInt1884 -= 2;
				String string = aStringArray1883[anInt1884];
				String string_429_ = aStringArray1883[anInt1884 + 1];
				if (string.length() <= 320 && Class177.anInt1376 == 3 && (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					if (aa_Sub1.aClass123_3561 != null) {
						aa_Sub1.aClass123_3561.method2207(-64);
						aa_Sub1.aClass123_3561 = null;
					}
					Class98_Sub5.aString3837 = string;
					Class360.aString3064 = string_429_;
					Class61.method538(5, false);
					return;
				}
				return;
			}
			if (i == 5616) {
				Class98_Sub10_Sub1.exitToLobby(false, false);
				return;
			}
			if (i == 5617) {
				int_stack[int_stack_ptr++] = Class257.anInt1946;
				return;
			}
			if (i == 5618) {
				int_stack_ptr--;
				return;
			}
			if (i == 5619) {
				int_stack_ptr--;
				return;
			}
			if (i == 5620) {
				int_stack[int_stack_ptr++] = 0;
				return;
			}
			if (i == 5621) {
				anInt1884 -= 2;
				int_stack_ptr -= 2;
				return;
			}
			if (i == 5622)
				return;
			if (i == 5623) {
				if (Class98_Sub10_Sub10.aString5593 != null)
					int_stack[int_stack_ptr++] = 1;
				else {
					int_stack[int_stack_ptr++] = 0;
					return;
				}
				return;
			}
			if (i == 5624) {
				int_stack[int_stack_ptr++] = (int) (Class197.aLong1515 >> 32);
				int_stack[int_stack_ptr++] = (int) (Class197.aLong1515 & 0xffffL);
				return;
			}
			if (i == 5625) {
				int_stack[int_stack_ptr++] = ha.aBoolean940 ? 1 : 0;
				return;
			}
			if (i == 5626) {
				ha.aBoolean940 = true;
				MapRegion.method3571(-68);
				return;
			}
		} else if (i < 6100) {
			if (i == 6001) {
				int i_430_ = int_stack[--int_stack_ptr];
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_430_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub19_4057));
				Class98_Sub10.method999((byte) -74);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6002) {
				boolean bool_431_ = int_stack[--int_stack_ptr] == 1;
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, bool_431_ ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4041));
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, bool_431_ ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076));
				Class98_Sub10.method999((byte) 121);
				Class135.method2264((byte) -118);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6003) {
				boolean bool_432_ = int_stack[--int_stack_ptr] == 1;
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, bool_432_ ? 2 : 1, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4034));
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, bool_432_ ? 2 : 1, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4058));
				Class135.method2264((byte) -117);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6005) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub11_4038));
				Class98_Sub10.method999((byte) 124);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6007) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub24_4047));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6008) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub13_4063));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6010) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub26_4035));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6011) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073));
				Class98_Sub10.method999((byte) 123);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6012) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub10_4070));
				Class98_Sub46_Sub13_Sub1.method1593((byte) 67);
				Class374.method3980((byte) 127);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6014) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 2 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064));
				Class98_Sub10.method999((byte) 119);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6015) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub14_4049));
				Class98_Sub10.method999((byte) 123);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6016) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4055));
				Class76_Sub4.method754(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 123), false, 80);
				Class310.method3618(-5964);
				return;
			}
			if (i == 6017) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub1_4043));
				Class233.method2884(124);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6018) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4066));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6019) {
				int i_433_ = int_stack[--int_stack_ptr];
				int i_434_ = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4069.method641((byte) 121);
				if (i_433_ != i_434_) {
					if (za_Sub2.method1683(-11297, Class177.anInt1376)) {
						if (i_434_ == 0 && Class144.anInt1169 != -1) {
							s_Sub1.method3434((Class98_Sub10_Sub1.aClass207_5544), false, i_433_, Class144.anInt1169, 0, -16523);
							Class233.method2883((byte) 111);
							Class151_Sub5.aBoolean4991 = false;
						} else if (i_433_ == 0) {
							Class337_Sub1.method3777(31585);
							Class151_Sub5.aBoolean4991 = false;
						} else
							Class98_Sub10_Sub19.method1057(i_433_, 1024);
					}
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_433_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4069));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
				}
				return;
			}
			if (i == 6020) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4051));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6021) {
				int i_435_ = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4034.method612((byte) 127);
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 0 : i_435_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4058));
				Class135.method2264((byte) -113);
				return;
			}
			if (i == 6023) {
				int i_436_ = int_stack[--int_stack_ptr];
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_436_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub6_4033));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6024) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4044));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6025) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub17_4046));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6027) {
				int i_437_ = int_stack[--int_stack_ptr];
				if (i_437_ < 0 || i_437_ > 1)
					i_437_ = 0;
				Class98_Sub5_Sub1.method966(29089, i_437_ == 1);
				return;
			}
			if (i == 6028) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] != 0 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub29_4050));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6029) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub24_4047));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6030) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] != 0 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub25_4039));
				Class310.method3618(-5964);
				Class98_Sub10.method999((byte) -71);
				return;
			}
			if (i == 6031) {
				int i_438_ = int_stack[--int_stack_ptr];
				if (i_438_ < 0 || i_438_ > 5)
					i_438_ = 2;
				Class76_Sub4.method754(i_438_, false, 3);
				return;
			}
			if (i == 6032) {
				int_stack_ptr -= 2;
				int i_439_ = int_stack[int_stack_ptr];
				boolean bool_440_ = int_stack[int_stack_ptr + 1] == 1;
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_439_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4062));
				if (!bool_440_)
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub12_4048));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6033) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub21_4037));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6034) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056));
				Class310.method3618(-5964);
				Class98_Sub46_Sub13_Sub1.method1593((byte) 49);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6035) {
				int i_441_ = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4041.method564((byte) 125);
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr] == 1 ? 1 : i_441_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076));
				Class98_Sub10.method999((byte) 112);
				Class135.method2264((byte) -118);
				return;
			}
			if (i == 6036) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub16_4040));
				Class310.method3618(-5964);
				Class33.aBoolean316 = true;
				return;
			}
			if (i == 6037) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, int_stack[--int_stack_ptr], (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4054));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6038) {
				int i_442_ = int_stack[--int_stack_ptr];
				int i_443_ = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4072.method641((byte) 123);
				if (i_442_ != i_443_ && Class144.anInt1169 == Class94.anInt795) {
					if (!za_Sub2.method1683(-11297, Class177.anInt1376)) {
						if (i_443_ == 0) {
							s_Sub1.method3434((Class98_Sub10_Sub1.aClass207_5544), false, i_442_, Class144.anInt1169, 0, -16523);
							Class233.method2883((byte) 111);
							Class151_Sub5.aBoolean4991 = false;
						} else if (i_442_ == 0) {
							Class337_Sub1.method3777(31585);
							Class151_Sub5.aBoolean4991 = false;
						} else
							Class98_Sub10_Sub19.method1057(i_442_, 1024);
					}
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_442_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4072));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
				}
				return;
			}
			if (i == 6039) {
				int i_444_ = int_stack[--int_stack_ptr];
				if (i_444_ > 255 || i_444_ < 0)
					i_444_ = 0;
				if (i_444_ != ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub4_4053.method568((byte) 125)) {
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_444_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub4_4053));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
				}
				return;
			}
			if (i == 6040) {
				int i_445_ = int_stack[--int_stack_ptr];
				if (i_445_ != ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub18_4071.method627((byte) 122)) {
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_445_, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub18_4071));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					Class230.method2871(-58);
				}
				return;
			}
		} else if (i < 6200) {
			if (i == 6101) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub19_4057.method630((byte) 125);
				return;
			}
			if (i == 6102) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4041.method564((byte) 127) == 1 ? 1 : 0);
				return;
			}
			if (i == 6103) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4034.method612((byte) 125) == 2 ? 1 : 0);
				return;
			}
			if (i == 6105) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub11_4038.method596((byte) 125) == 1 ? 1 : 0);
				return;
			}
			if (i == 6107) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub24_4047.method651((byte) 126);
				return;
			}
			if (i == 6108) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub13_4063.method602((byte) 127) == 1 ? 1 : 0);
				return;
			}
			if (i == 6110) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub26_4035.method662((byte) 120) == 1 ? 1 : 0);
				return;
			}
			if (i == 6111) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073.method579((byte) 126);
				return;
			}
			if (i == 6112) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub10_4070.method592((byte) 123) == 1 ? 1 : 0);
				return;
			}
			if (i == 6114) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064.method668((byte) 125) == 2 ? 1 : 0);
				return;
			}
			if (i == 6115) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub14_4049.method609((byte) 125) == 1 ? 1 : 0);
				return;
			}
			if (i == 6116) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4055.method648((byte) 125);
				return;
			}
			if (i == 6117) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub1_4043.method558((byte) 120) == 1 ? 1 : 0);
				return;
			}
			if (i == 6118) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4066.method641((byte) 126);
				return;
			}
			if (i == 6119) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4069.method641((byte) 121);
				return;
			}
			if (i == 6120) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4051.method641((byte) 120);
				return;
			}
			if (i == 6123) {
				int_stack[int_stack_ptr++] = Class98_Sub46_Sub13_Sub2.method1600((byte) -47);
				return;
			}
			if (i == 6124) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4044.method648((byte) 121);
				return;
			}
			if (i == 6125) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub17_4046.method617((byte) 123);
				return;
			}
			if (i == 6127) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub5_4065.method570((byte) 121) == 1 ? 1 : 0);
				return;
			}
			if (i == 6128) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub29_4050.method677((byte) 122) == 1 ? 1 : 0);
				return;
			}
			if (i == 6129) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub24_4047.method651((byte) 125);
				return;
			}
			if (i == 6130) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub25_4039.method655((byte) 127) == 1 ? 1 : 0);
				return;
			}
			if (i == 6131) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 122);
				return;
			}
			if (i == 6132) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4062.method583((byte) 120);
				return;
			}
			if (i == 6133) {
				int_stack[int_stack_ptr++] = (((Class88) Class98_Sub43_Sub2.aClass88_5907).aBoolean682 && !(((Class88) Class98_Sub43_Sub2.aClass88_5907).aBoolean675)) ? 1 : 0;
				return;
			}
			if (i == 6135) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub21_4037.method639((byte) 121);
				return;
			}
			if (i == 6136) {
				int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056.method634((byte) 122) == 1 ? 1 : 0);
				return;
			}
			if (i == 6138) {
				int_stack[int_stack_ptr++] = Class66.method683((byte) -80, 200, ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 122));
				return;
			}
			if (i == 6139) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub16_4040.method614((byte) 124);
				return;
			}
			if (i == 6142) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4054.method641((byte) 127);
				return;
			}
			if (i == 6143) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4072.method641((byte) 120);
				return;
			}
			if (i == 6144) {
				int_stack[int_stack_ptr++] = Class98_Sub46_Sub18.aBoolean6056 ? 1 : 0;
				return;
			}
			if (i == 6145) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub4_4053.method568((byte) 121);
				return;
			}
			if (i == 6146) {
				int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub18_4071.method627((byte) 127);
				return;
			}
			if (i == 6147) {
				int_stack[int_stack_ptr++] = ((((Class98_Sub35) Exception_Sub1.aClass98_Sub35_47).anInt4129) < 512 || Class98_Sub46_Sub18.aBoolean6056 || Class223.aBoolean1679) ? 1 : 0;
				return;
			}
			if (i == 6148) {
				int_stack[int_stack_ptr++] = Class82.aBoolean626 ? 1 : 0;
				return;
			}
		} else if (i < 6300) {
			if (i == 6200) {
				int_stack_ptr -= 2;
				Class265.aShort1973 = (short) int_stack[int_stack_ptr];
				if (Class265.aShort1973 <= 0)
					Class265.aShort1973 = (short) 256;
				Class98_Sub43_Sub4.aShort5934 = (short) int_stack[int_stack_ptr + 1];
				if (Class98_Sub43_Sub4.aShort5934 <= 0)
					Class98_Sub43_Sub4.aShort5934 = (short) 205;
				return;
			}
			if (i == 6201) {
				int_stack_ptr -= 2;
				Class64_Sub19.aShort3692 = (short) int_stack[int_stack_ptr];
				if (Class64_Sub19.aShort3692 <= 0)
					Class64_Sub19.aShort3692 = (short) 256;
				Class135.cameraZoom = (short) int_stack[int_stack_ptr + 1];
				if (Class135.cameraZoom <= 0)
					Class135.cameraZoom = (short) 320;
				return;
			}
			if (i == 6202) {
				int_stack_ptr -= 4;
				Class284_Sub2_Sub2.aShort6201 = (short) int_stack[int_stack_ptr];
				if (Class284_Sub2_Sub2.aShort6201 <= 0)
					Class284_Sub2_Sub2.aShort6201 = (short) 1;
				Class112.aShort948 = (short) int_stack[int_stack_ptr + 1];
				if (Class112.aShort948 <= 0)
					Class112.aShort948 = (short) 32767;
				else if (Class112.aShort948 < Class284_Sub2_Sub2.aShort6201)
					Class112.aShort948 = Class284_Sub2_Sub2.aShort6201;
				Class42.aShort3231 = (short) int_stack[int_stack_ptr + 2];
				if (Class42.aShort3231 <= 0)
					Class42.aShort3231 = (short) 1;
				Class260.aShort3256 = (short) int_stack[int_stack_ptr + 3];
				if (Class260.aShort3256 <= 0)
					Class260.aShort3256 = (short) 32767;
				else {
					if (Class260.aShort3256 < Class42.aShort3231)
						Class260.aShort3256 = Class42.aShort3231;
					return;
				}
				return;
			}
			if (i == 6203) {
				Class151_Sub3.method2453(0, false, ((GameInterfaceData) Class98_Sub32.aClass293_4107).anInt2311, 100, ((GameInterfaceData) Class98_Sub32.aClass293_4107).anInt2258, 0);
				int_stack[int_stack_ptr++] = Class215.anInt1612;
				int_stack[int_stack_ptr++] = Class332_Sub2.anInt5421;
				return;
			}
			if (i == 6204) {
				int_stack[int_stack_ptr++] = Class64_Sub19.aShort3692;
				int_stack[int_stack_ptr++] = Class135.cameraZoom;
				return;
			}
			if (i == 6205) {
				int_stack[int_stack_ptr++] = Class265.aShort1973;
				int_stack[int_stack_ptr++] = Class98_Sub43_Sub4.aShort5934;
				return;
			}
		} else if (i < 6400) {
			if (i == 6300) {
				int_stack[int_stack_ptr++] = (int) (Class343.method3819(-47) / 60000L);
				return;
			}
			if (i == 6301) {
				int_stack[int_stack_ptr++] = (int) (Class343.method3819(-47) / 86400000L) - 11745;
				return;
			}
			if (i == 6302) {
				int_stack_ptr -= 3;
				int i_446_ = int_stack[int_stack_ptr];
				int i_447_ = int_stack[int_stack_ptr + 1];
				int i_448_ = int_stack[int_stack_ptr + 2];
				aCalendar1882.clear();
				aCalendar1882.set(11, 12);
				aCalendar1882.set(i_448_, i_447_, i_446_);
				int i_449_ = ((int) (aCalendar1882.getTime().getTime() / 86400000L) - 11745);
				if (i_448_ < 1970)
					i_449_--;
				int_stack[int_stack_ptr++] = i_449_;
				return;
			}
			if (i == 6303) {
				aCalendar1882.clear();
				aCalendar1882.setTime(new Date(Class343.method3819(-47)));
				int_stack[int_stack_ptr++] = aCalendar1882.get(1);
				return;
			}
			if (i == 6304) {
				int i_450_ = int_stack[--int_stack_ptr];
				boolean bool_451_ = true;
				if (i_450_ < 0)
					bool_451_ = (i_450_ + 1) % 4 == 0;
				else if (i_450_ < 1582)
					bool_451_ = i_450_ % 4 == 0;
				else if (i_450_ % 4 != 0)
					bool_451_ = false;
				else if (i_450_ % 100 != 0)
					bool_451_ = true;
				else if (i_450_ % 400 != 0)
					bool_451_ = false;
				int_stack[int_stack_ptr++] = bool_451_ ? 1 : 0;
				return;
			}
		} else if (i < 6500) {
			if (i == 6405) {
				int_stack[int_stack_ptr++] = Class195.method2662(-96) ? 1 : 0;
				return;
			}
			if (i == 6406) {
				int_stack[int_stack_ptr++] = Class98_Sub10_Sub18.method1054(76) ? 1 : 0;
				return;
			}
		} else if (i < 6600) {
			if (i == 6500) {
				if (Class177.anInt1376 != 7 || Class64_Sub16.anInt3680 != 0 || Class21_Sub4.anInt5394 != 0)
					int_stack[int_stack_ptr++] = 1;
				else {
					if (Class64_Sub12.aBoolean3671)
						int_stack[int_stack_ptr++] = 0;
					else {
						if (Class267.aLong1998 > Class343.method3819(-47) - 1000L)
							int_stack[int_stack_ptr++] = 1;
						else {
							Class64_Sub12.aBoolean3671 = true;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class98_Sub32_Sub1.aClass171_5887, Class331.aClass117_2811));
							((OutgoingPacket) class98_sub11).packet.writeInt(1571862888, Class6.anInt88);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							int_stack[int_stack_ptr++] = 0;
							return;
						}
						return;
					}
					return;
				}
				return;
			}
			if (i == 6501) {
				Class53_Sub1 class53_sub1 = Class155.method2494((byte) 101);
				if (class53_sub1 != null) {
					int_stack[int_stack_ptr++] = ((Class53_Sub1) class53_sub1).anInt3632;
					int_stack[int_stack_ptr++] = ((Class53) class53_sub1).anInt427;
					aStringArray1883[anInt1884++] = ((Class53_Sub1) class53_sub1).aString3630;
					Class114 class114 = class53_sub1.method501(-1);
					int_stack[int_stack_ptr++] = ((Class114) class114).anInt956;
					aStringArray1883[anInt1884++] = ((Class114) class114).aString957;
					int_stack[int_stack_ptr++] = ((Class53) class53_sub1).anInt429;
					int_stack[int_stack_ptr++] = ((Class53_Sub1) class53_sub1).anInt3631;
					aStringArray1883[anInt1884++] = ((Class53_Sub1) class53_sub1).aString3634;
				} else {
					int_stack[int_stack_ptr++] = -1;
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					int_stack[int_stack_ptr++] = 0;
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					return;
				}
				return;
			}
			if (i == 6502) {
				Class53_Sub1 class53_sub1 = Class69_Sub2.method706(200);
				if (class53_sub1 != null) {
					int_stack[int_stack_ptr++] = ((Class53_Sub1) class53_sub1).anInt3632;
					int_stack[int_stack_ptr++] = ((Class53) class53_sub1).anInt427;
					aStringArray1883[anInt1884++] = ((Class53_Sub1) class53_sub1).aString3630;
					Class114 class114 = class53_sub1.method501(-1);
					int_stack[int_stack_ptr++] = ((Class114) class114).anInt956;
					aStringArray1883[anInt1884++] = ((Class114) class114).aString957;
					int_stack[int_stack_ptr++] = ((Class53) class53_sub1).anInt429;
					int_stack[int_stack_ptr++] = ((Class53_Sub1) class53_sub1).anInt3631;
					aStringArray1883[anInt1884++] = ((Class53_Sub1) class53_sub1).aString3634;
				} else {
					int_stack[int_stack_ptr++] = -1;
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					int_stack[int_stack_ptr++] = 0;
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					return;
				}
				return;
			}
			if (i == 6503) {
				int i_452_ = int_stack[--int_stack_ptr];
				String string = aStringArray1883[--anInt1884];
				if (Class177.anInt1376 != 7 || Class64_Sub16.anInt3680 != 0 || Class21_Sub4.anInt5394 != 0)
					int_stack[int_stack_ptr++] = 0;
				else {
					int_stack[int_stack_ptr++] = (Class98_Sub12.method1131(-8804, i_452_, string) ? 1 : 0);
					return;
				}
				return;
			}
			if (i == 6506) {
				int i_453_ = int_stack[--int_stack_ptr];
				Class53_Sub1 class53_sub1 = Class275.method3283((byte) 123, i_453_);
				if (class53_sub1 != null) {
					int_stack[int_stack_ptr++] = ((Class53) class53_sub1).anInt427;
					aStringArray1883[anInt1884++] = ((Class53_Sub1) class53_sub1).aString3630;
					Class114 class114 = class53_sub1.method501(-1);
					int_stack[int_stack_ptr++] = ((Class114) class114).anInt956;
					aStringArray1883[anInt1884++] = ((Class114) class114).aString957;
					int_stack[int_stack_ptr++] = ((Class53) class53_sub1).anInt429;
					int_stack[int_stack_ptr++] = ((Class53_Sub1) class53_sub1).anInt3631;
					aStringArray1883[anInt1884++] = ((Class53_Sub1) class53_sub1).aString3634;
				} else {
					int_stack[int_stack_ptr++] = -1;
					aStringArray1883[anInt1884++] = "";
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					int_stack[int_stack_ptr++] = 0;
					int_stack[int_stack_ptr++] = 0;
					aStringArray1883[anInt1884++] = "";
					return;
				}
				return;
			}
			if (i == 6507) {
				int_stack_ptr -= 4;
				int i_454_ = int_stack[int_stack_ptr];
				boolean bool_455_ = int_stack[int_stack_ptr + 1] == 1;
				int i_456_ = int_stack[int_stack_ptr + 2];
				boolean bool_457_ = int_stack[int_stack_ptr + 3] == 1;
				Class287_Sub2.method3393(bool_457_, i_456_, i_454_, (byte) 82, bool_455_);
				return;
			}
			if (i == 6508) {
				Class98_Sub10_Sub25.method1080((byte) 74);
				return;
			}
			if (i == 6509) {
				if (Class177.anInt1376 == 7) {
					Class224_Sub3_Sub1.aBoolean6144 = int_stack[--int_stack_ptr] == 1;
					return;
				}
				return;
			}
			if (i == 6510) {
				int_stack[int_stack_ptr++] = Class98_Sub46.anInt4260;
				return;
			}
		} else if (i >= 6700) {
			if (i < 6800 && Class73.aClass6_3485 == Class244.aClass6_1861) {
				if (i == 6700) {
					int i_458_ = Class116.aClass377_964.method3999((byte) -6);
					if (Class15.anInt185 != -1)
						i_458_++;
					int_stack[int_stack_ptr++] = i_458_;
					return;
				}
				if (i == 6701) {
					int i_459_ = int_stack[--int_stack_ptr];
					if (Class15.anInt185 != -1) {
						if (i_459_ == 0) {
							int_stack[int_stack_ptr++] = Class15.anInt185;
							return;
						}
						i_459_--;
					}
					GameInterface class98_sub18 = ((GameInterface) Class116.aClass377_964.start_iteration(98));
					while (i_459_-- > 0)
						class98_sub18 = (GameInterface) Class116.aClass377_964.iterate_next(-1);
					int_stack[int_stack_ptr++] = ((GameInterface) class98_sub18).interfaceID;
					return;
				}
				if (i == 6702) {
					int i_460_ = int_stack[--int_stack_ptr];
					if (Class159.gameInterfaces[i_460_] == null)
						aStringArray1883[anInt1884++] = "";
					else {
						String string = (((GameInterfaceData) Class159.gameInterfaces[i_460_][0]).aString2231);
						if (string == null)
							aStringArray1883[anInt1884++] = "";
						else {
							aStringArray1883[anInt1884++] = string.substring(0, string.indexOf(':'));
							return;
						}
						return;
					}
					return;
				}
				if (i == 6703) {
					int i_461_ = int_stack[--int_stack_ptr];
					if (Class159.gameInterfaces[i_461_] == null)
						int_stack[int_stack_ptr++] = 0;
					else {
						int_stack[int_stack_ptr++] = Class159.gameInterfaces[i_461_].length;
						return;
					}
					return;
				}
				if (i == 6704) {
					int_stack_ptr -= 2;
					int i_462_ = int_stack[int_stack_ptr];
					int i_463_ = int_stack[int_stack_ptr + 1];
					if (Class159.gameInterfaces[i_462_] == null)
						aStringArray1883[anInt1884++] = "";
					else {
						String string = (((GameInterfaceData) (Class159.gameInterfaces[i_462_][i_463_])).aString2231);
						if (string == null)
							aStringArray1883[anInt1884++] = "";
						else {
							aStringArray1883[anInt1884++] = string;
							return;
						}
						return;
					}
					return;
				}
				if (i == 6705) {
					int_stack_ptr -= 2;
					int i_464_ = int_stack[int_stack_ptr];
					int i_465_ = int_stack[int_stack_ptr + 1];
					if (Class159.gameInterfaces[i_464_] == null)
						int_stack[int_stack_ptr++] = 0;
					else {
						int_stack[int_stack_ptr++] = ((GameInterfaceData) (Class159.gameInterfaces[i_464_][i_465_])).anInt2259;
						return;
					}
					return;
				}
				if (i == 6706)
					return;
				if (i == 6707) {
					int_stack_ptr -= 3;
					int i_466_ = int_stack[int_stack_ptr];
					int i_467_ = int_stack[int_stack_ptr + 1];
					int i_468_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(1, i_468_, "", -121, i_466_ << 16 | i_467_);
					return;
				}
				if (i == 6708) {
					int_stack_ptr -= 3;
					int i_469_ = int_stack[int_stack_ptr];
					int i_470_ = int_stack[int_stack_ptr + 1];
					int i_471_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(2, i_471_, "", -117, i_469_ << 16 | i_470_);
					return;
				}
				if (i == 6709) {
					int_stack_ptr -= 3;
					int i_472_ = int_stack[int_stack_ptr];
					int i_473_ = int_stack[int_stack_ptr + 1];
					int i_474_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(3, i_474_, "", -126, i_472_ << 16 | i_473_);
					return;
				}
				if (i == 6710) {
					int_stack_ptr -= 3;
					int i_475_ = int_stack[int_stack_ptr];
					int i_476_ = int_stack[int_stack_ptr + 1];
					int i_477_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(4, i_477_, "", -121, i_475_ << 16 | i_476_);
					return;
				}
				if (i == 6711) {
					int_stack_ptr -= 3;
					int i_478_ = int_stack[int_stack_ptr];
					int i_479_ = int_stack[int_stack_ptr + 1];
					int i_480_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(5, i_480_, "", -117, i_478_ << 16 | i_479_);
					return;
				}
				if (i == 6712) {
					int_stack_ptr -= 3;
					int i_481_ = int_stack[int_stack_ptr];
					int i_482_ = int_stack[int_stack_ptr + 1];
					int i_483_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(6, i_483_, "", -118, i_481_ << 16 | i_482_);
					return;
				}
				if (i == 6713) {
					int_stack_ptr -= 3;
					int i_484_ = int_stack[int_stack_ptr];
					int i_485_ = int_stack[int_stack_ptr + 1];
					int i_486_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(7, i_486_, "", -125, i_484_ << 16 | i_485_);
					return;
				}
				if (i == 6714) {
					int_stack_ptr -= 3;
					int i_487_ = int_stack[int_stack_ptr];
					int i_488_ = int_stack[int_stack_ptr + 1];
					int i_489_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(8, i_489_, "", -117, i_487_ << 16 | i_488_);
					return;
				}
				if (i == 6715) {
					int_stack_ptr -= 3;
					int i_490_ = int_stack[int_stack_ptr];
					int i_491_ = int_stack[int_stack_ptr + 1];
					int i_492_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(9, i_492_, "", -115, i_490_ << 16 | i_491_);
					return;
				}
				if (i == 6716) {
					int_stack_ptr -= 3;
					int i_493_ = int_stack[int_stack_ptr];
					int i_494_ = int_stack[int_stack_ptr + 1];
					int i_495_ = int_stack[int_stack_ptr + 2];
					Class303.method3557(10, i_495_, "", -126, i_493_ << 16 | i_494_);
					return;
				}
				if (i == 6717) {
					int_stack_ptr -= 3;
					int i_496_ = int_stack[int_stack_ptr];
					int i_497_ = int_stack[int_stack_ptr + 1];
					int i_498_ = int_stack[int_stack_ptr + 2];
					GameInterfaceData class293 = Class246_Sub9.method3139((byte) 72, i_496_ << 16 | i_497_, i_498_);
					Class98_Sub10_Sub32.method1098((byte) 117);
					IComponentSettings class98_sub49 = client.getClickMask(class293);
					Class98_Sub5_Sub2.method970(((IComponentSettings) class98_sub49).anInt4285, class293, class98_sub49.method1668(-1), -6838);
					return;
				}
			} else if (i < 6900) {
				if (i == 6800) {
					int i_499_ = int_stack[--int_stack_ptr];
					Class24 class24 = Class216.aClass341_1622.method3807(-114, i_499_);
					if (((Class24) class24).aString263 == null)
						aStringArray1883[anInt1884++] = "";
					else {
						aStringArray1883[anInt1884++] = ((Class24) class24).aString263;
						return;
					}
					return;
				}
				if (i == 6801) {
					int i_500_ = int_stack[--int_stack_ptr];
					Class24 class24 = Class216.aClass341_1622.method3807(106, i_500_);
					int_stack[int_stack_ptr++] = ((Class24) class24).anInt245;
					return;
				}
				if (i == 6802) {
					int i_501_ = int_stack[--int_stack_ptr];
					Class24 class24 = Class216.aClass341_1622.method3807(-54, i_501_);
					int_stack[int_stack_ptr++] = ((Class24) class24).anInt264;
					return;
				}
				if (i == 6803) {
					int i_502_ = int_stack[--int_stack_ptr];
					Class24 class24 = Class216.aClass341_1622.method3807(-47, i_502_);
					int_stack[int_stack_ptr++] = ((Class24) class24).anInt246;
					return;
				}
				if (i == 6804) {
					int_stack_ptr -= 2;
					int i_503_ = int_stack[int_stack_ptr];
					int i_504_ = int_stack[int_stack_ptr + 1];
					ParamType class149 = Class98_Sub43_Sub1.aClass365_5897.list((byte) 31, i_504_);
					if (class149.method2433(false))
						aStringArray1883[anInt1884++] = (Class216.aClass341_1622.method3807(105, i_503_).method289(-5911, ((ParamType) class149).aString1203, i_504_));
					else {
						int_stack[int_stack_ptr++] = (Class216.aClass341_1622.method3807(122, i_503_).method285(48, i_504_, ((ParamType) class149).anInt1202));
						return;
					}
					return;
				}
			} else if (i < 7000) {
				if (i == 6900) {
					int_stack[int_stack_ptr++] = (Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732) ? 1 : 0;
					return;
				}
				if (i == 6901) {
					int_stack[int_stack_ptr++] = Class48.anInt409;
					return;
				}
				if (i == 6902) {
					int_stack[int_stack_ptr++] = Class98_Sub1.anInt3814;
					return;
				}
				if (i == 6903) {
					int_stack[int_stack_ptr++] = Class93_Sub1.anInt5489;
					return;
				}
				if (i == 6904) {
					int_stack[int_stack_ptr++] = Class98_Sub10_Sub19.anInt5630;
					return;
				}
				if (i == 6905) {
					String string = "";
					if (Class187.aClass143_1449 != null) {
						if (Class187.aClass143_1449.anObject1162 != null)
							string = ((String) Class187.aClass143_1449.anObject1162);
						else
							string = (Class98_Sub10_Sub39.method1122(Class187.aClass143_1449.anInt1166, (byte) -63));
					}
					aStringArray1883[anInt1884++] = string;
					return;
				}
				if (i == 6906) {
					int_stack[int_stack_ptr++] = Class17.anInt203;
					return;
				}
				if (i == 6907) {
					int_stack[int_stack_ptr++] = Class98_Sub46.anInt4264;
					return;
				}
				if (i == 6908) {
					int_stack[int_stack_ptr++] = Class93_Sub2.anInt5491;
					return;
				}
				if (i == 6909) {
					int_stack[int_stack_ptr++] = s_Sub1.aBoolean5200 ? 1 : 0;
					return;
				}
				if (i == 6910) {
					int_stack[int_stack_ptr++] = Class98_Sub46_Sub9.anInt6003;
					return;
				}
				if (i == 6911) {
					int_stack[int_stack_ptr++] = Class98_Sub43_Sub2.anInt5910;
					return;
				}
				if (i == 6912) {
					int_stack[int_stack_ptr++] = Class36.anInt349;
					return;
				}
			} else if (i < 7100) {
				if (i == 7000) {
					int i_505_ = Class98_Sub28.method1306((byte) -106);
					int_stack[int_stack_ptr++] = Class98_Sub10_Sub24.anInt5671 = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 120);
					int_stack[int_stack_ptr++] = i_505_;
					Class98_Sub10.method999((byte) 122);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7001) {
					Class98_Sub27.method1284(1);
					Class98_Sub10.method999((byte) -27);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7002) {
					Class98_Sub50.method1672((byte) 19);
					Class98_Sub10.method999((byte) 113);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7003) {
					Class287.method3385((byte) 27);
					Class98_Sub10.method999((byte) -126);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7004) {
					Class98_Sub32.method1436(-100, true);
					Class98_Sub10.method999((byte) -10);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7005) {
					Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub12_4048));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7006) {
					if (Class98_Sub10_Sub24.anInt5671 == 2)
						Class98_Sub10_Sub38.aBoolean5756 = true;
					else {
						if (Class98_Sub10_Sub24.anInt5671 == 1)
							Class95.aBoolean798 = true;
						else {
							if (Class98_Sub10_Sub24.anInt5671 == 3)
								Class67.aBoolean520 = true;
							return;
						}
						return;
					}
					return;
				}
				if (i == 7007) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub12_4048.method600((byte) 123);
					return;
				}
			} else if (i < 7200) {
				if (i == 7100) {
					int_stack_ptr -= 2;
					int i_506_ = int_stack[int_stack_ptr];
					int i_507_ = int_stack[int_stack_ptr + 1];
					if (i_506_ != -1) {
						if (i_507_ > 255)
							i_507_ = 255;
						else if (i_507_ < 0)
							i_507_ = 0;
						Class98_Sub10_Sub30.method1093(-29680, i_507_, false, i_506_);
					}
					return;
				}
				if (i == 7101) {
					int i_508_ = int_stack[--int_stack_ptr];
					if (i_508_ != -1)
						OutgoingPacket.method1127((byte) 67, i_508_);
					return;
				}
				if (i == 7102) {
					int i_509_ = int_stack[--int_stack_ptr];
					if (i_509_ != -1)
						Class98_Sub42.method1476(256, i_509_);
					return;
				}
				if (i == 7103) {
					int_stack[int_stack_ptr++] = Class98_Sub42.method1479("jagtheora", 0) ? 1 : 0;
					return;
				}
			} else if (i < 7300) {
				if (i == 7201) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub11_4038.method597(-1) ? 1 : 0;
					return;
				}
				if (i == 7202) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub26_4035.method661(-1) ? 1 : 0;
					return;
				}
				if (i == 7203) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073.method581(-1) ? 1 : 0;
					return;
				}
				if (i == 7204) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064.method671(-1) ? 1 : 0;
					return;
				}
				if (i == 7205) {
					int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4044.method647(-1) && Class265.aHa1974.method1823()) ? 1 : 0;
					return;
				}
				if (i == 7206) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub6_4033.method575(-1) ? 1 : 0;
					return;
				}
				if (i == 7207) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub17_4046.method621(-1) ? 1 : 0;
					return;
				}
				if (i == 7208) {
					int_stack[int_stack_ptr++] = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub5_4065.method571(-1) && Class265.aHa1974.method1767()) ? 1 : 0;
					return;
				}
				if (i == 7209) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub25_4039.method657(-1) ? 1 : 0;
					return;
				}
				if (i == 7210) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056.method635(-1) ? 1 : 0;
					return;
				}
				if (i == 7211) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub16_4040.method613(-1) ? 1 : 0;
					return;
				}
				if (i == 7212) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub14_4049.method607(-1) ? 1 : 0;
					return;
				}
				if (i == 7213) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub18_4071.method626(-1) ? 1 : 0;
					return;
				}
				if (i == 7214) {
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4062.method587(-1) ? 1 : 0;
					return;
				}
			} else if (i < 7400) {
				if (i == 7301) {
					int i_510_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub11_4038.method556(i_510_, 29053);
					return;
				}
				if (i == 7302) {
					int i_511_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub26_4035.method556(i_511_, 29053);
					return;
				}
				if (i == 7303) {
					int i_512_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073.method556(i_512_, 29053);
					return;
				}
				if (i == 7304) {
					int i_513_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064.method556(i_513_, 29053);
					return;
				}
				if (i == 7305) {
					int i_514_ = int_stack[--int_stack_ptr];
					if (!Class265.aHa1974.method1823())
						int_stack[int_stack_ptr++] = 3;
					else {
						int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4044.method556(i_514_, 29053);
						return;
					}
					return;
				}
				if (i == 7306) {
					int i_515_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub6_4033.method556(i_515_, 29053);
					return;
				}
				if (i == 7307) {
					int i_516_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub17_4046.method556(i_516_, 29053);
					return;
				}
				if (i == 7308) {
					int i_517_ = int_stack[--int_stack_ptr];
					if (!Class265.aHa1974.method1767())
						int_stack[int_stack_ptr++] = 3;
					else {
						int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub5_4065.method556(i_517_, 29053);
						return;
					}
					return;
				}
				if (i == 7309) {
					int i_518_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub25_4039.method556(i_518_, 29053);
					return;
				}
				if (i == 7310) {
					int i_519_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056.method556(i_519_, 29053);
					return;
				}
				if (i == 7311) {
					int i_520_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub16_4040.method556(i_520_, 29053);
					return;
				}
				if (i == 7312) {
					int i_521_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub14_4049.method556(i_521_, 29053);
					return;
				}
				if (i == 7313) {
					int i_522_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub18_4071.method556(i_522_, 29053);
					return;
				}
				if (i == 7314) {
					int i_523_ = int_stack[--int_stack_ptr];
					int_stack[int_stack_ptr++] = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4062.method556(i_523_, 29053);
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(i));
	}

	static {
		anIntArray1887 = new int[5];
		int_stack_ptr = 0;
		aClass349Array1889 = new Class349[50];
		aCalendar1882 = Calendar.getInstance();
		aStringArray1892 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		anIntArray1891 = new int[3];
		aClass79_1890 = new Class79(4);
		anInt1893 = 0;
	}
}
