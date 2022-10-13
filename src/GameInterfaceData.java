/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Dimension;

final class GameInterfaceData {
	byte aByte2207;
	int anInt2208;
	boolean hasListener = false;
	int anInt2210;
	int anInt2211;
	Object[] anObjectArray2212;
	int anInt2213;
	String aString2214;
	Object[] anObjectArray2215;
	int anInt2216;
	int[] anIntArray2217;
	int anInt2218;
	GameInterfaceData aClass293_2219;
	Object[] anObjectArray2220;
	int[] anIntArray2221;
	boolean aBoolean2222 = false;
	int anInt2223;
	String aString2224;
	String aString2225;
	int anInt2226;
	Object[] anObjectArray2227;
	int anInt2228;
	int anInt2229;
	Object[] anObjectArray2230;
	String aString2231;
	int anInt2232;
	int anInt2233;
	int anInt2234;
	int anInt2235;
	int anInt2236;
	int anInt2237;
	int anInt2238;
	Object[] anObjectArray2239;
	byte aByte2240;
	boolean aBoolean2241;
	int anInt2242;
	byte aByte2243;
	int anInt2244;
	byte aByte2245;
	int anInt2246;
	int anInt2247;
	int anInt2248;
	int[] anIntArray2249;
	int anInt2250;
	int anInt2251;
	Object[] anObjectArray2252;
	Object[] anObjectArray2253;
	int anInt2254;
	int anInt2255;
	boolean aBoolean2256;
	Object[] anObjectArray2257;
	int anInt2258;
	int anInt2259;
	int anInt2260;
	int anInt2261;
	boolean aBoolean2262;
	boolean aBoolean2263;
	int anInt2264;
	boolean aBoolean2265;
	Object[] anObjectArray2266;
	int anInt2267;
	int anInt2268;
	Object[] anObjectArray2269;
	Object[] anObjectArray2270;
	int[] anIntArray2271;
	Object[] anObjectArray2272;
	int anInt2273;
	Object[] anObjectArray2274;
	int[] anIntArray2275;
	int anInt2276;
	Object[] onMouseWheelListener;
	Object[] anObjectArray2278;
	boolean aBoolean2279;
	boolean aBoolean2280;
	boolean aBoolean2281;
	int anInt2282;
	int anInt2283;
	int[] anIntArray2284;
	int anInt2285;
	boolean aBoolean2286;
	int anInt2287;
	boolean aBoolean2288;
	int anInt2289;
	int anInt2290;
	Object[] anObjectArray2291;
	Object[] anObjectArray2292;
	int anInt2293;
	Object[] anObjectArray2294;
	boolean aBoolean2295;
	int anInt2296;
	int[] anIntArray2297;
	int[] anIntArray2298;
	int anInt2299;
	int anInt2300;
	Class246_Sub5 aClass246_Sub5_2301;
	int anInt2302;
	int anInt2303;
	int anInt2304;
	int anInt2305;
	int anInt2306;
	int contentType;
	int anInt2308;
	int anInt2309;
	int anInt2310;
	int anInt2311;
	int anInt2312;
	Object[] anObjectArray2313;
	Object[] anObjectArray2314;
	boolean aBoolean2315;
	Object[] anObjectArray2316;
	int anInt2317;
	int anInt2318;
	Object[] anObjectArray2319;
	Object[] anObjectArray2320;
	int anInt2321;
	boolean aBoolean2322;
	int anInt2323;
	Object[] anObjectArray2324;
	boolean aBoolean2325;
	int[] anIntArray2326;
	boolean aBoolean2327;
	int anInt2328;
	Object[] anObjectArray2329;
	Object[] anObjectArray2330;
	byte[] aByteArray2331;
	Object[] anObjectArray2332;
	String aString2333;
	int anInt2334;
	Object[] anObjectArray2335;
	int anInt2336;
	private Class377 aClass377_2337;
	int anInt2338;
	GameInterfaceData[] interfaceComponents;
	Object[] anObjectArray2340;
	int anInt2341;
	int[] anIntArray2342;
	int anInt2343;
	int anInt2344;
	byte[] aByteArray2345;
	int anInt2346;
	int anInt2347;
	IComponentSettings aClass98_Sub49_2348;
	int anInt2349;
	int anInt2350;
	String[] aStringArray2351;
	int anInt2352;
	int anInt2353;
	int type;
	int anInt2355;
	Object[] anObjectArray2356;

	final void method3455(int i, int i_0_, int i_1_) {
		try {
			if (aClass377_2337 == null) {
				aClass377_2337 = new Class377(16);
				aClass377_2337.method3996(new Class98_Sub34(i_0_), (long) i, -1);
			} else if (i_1_ == 16) {
				Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_2337.method3990((long) i, -1);
				if (class98_sub34 != null)
					((Class98_Sub34) class98_sub34).anInt4126 = i_0_;
				else
					aClass377_2337.method3996(new Class98_Sub34(i_0_), (long) i, i_1_ ^ ~0x10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final Class332 method3456(ha var_ha, int i) {
		try {
			Class93.aBoolean3503 = false;
			long l = (((long) ((GameInterfaceData) this).anInt2355 << 479438120) + (((!((GameInterfaceData) this).aBoolean2281 ? 0L : 1L) << -1234042329) + ((!((GameInterfaceData) this).aBoolean2279 ? 0L : 1L) << 273433763)) + ((long) ((GameInterfaceData) this).anInt2237 - (-((long) ((GameInterfaceData) this).anInt2304 << 2008896804) - ((!((GameInterfaceData) this).aBoolean2327 ? 0L : 1L) << -445924378))));
			if (i != -1234042329)
				decodeInterface(null, -103);
			Class332 class332 = ((Class332) Class69_Sub2.aClass79_5334.get(l));
			if (class332 != null)
				return class332;
			Class324 class324 = Class324.method3685(Class166.aClass207_1280, ((GameInterfaceData) this).anInt2237, 0);
			if (class324 == null) {
				Class93.aBoolean3503 = true;
				return null;
			}
			if (((GameInterfaceData) this).aBoolean2327)
				class324.method3682();
			if (((GameInterfaceData) this).aBoolean2281)
				class324.method3691();
			do {
				if ((((GameInterfaceData) this).anInt2304 ^ 0xffffffff) >= -1) {
					if (((GameInterfaceData) this).anInt2355 == 0)
						break;
					class324.method3688(1);
					if (!client.aBoolean3553)
						break;
				}
				class324.method3688(((GameInterfaceData) this).anInt2304);
			} while (false);
			if ((((GameInterfaceData) this).anInt2304 ^ 0xffffffff) <= -2)
				class324.method3694(1);
			if (((GameInterfaceData) this).anInt2304 >= 2)
				class324.method3694(16777215);
			if (((GameInterfaceData) this).anInt2355 != 0)
				class324.method3693(((GameInterfaceData) this).anInt2355 | ~0xffffff);
			class332 = var_ha.method1758(class324, true);
			Class69_Sub2.aClass79_5334.method807(13436, l, 4 * (class332.method3734() * class332.method3731()), class332);
			return class332;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void decodeInterface(RSByteBuffer stream, int i) {
		try {
			int i_2_ = stream.readUnsignedByte();
			if (i_2_ == 255)
				i_2_ = -1;
			((GameInterfaceData) this).type = stream.readUnsignedByte();
			if ((0x80 & ((GameInterfaceData) this).type ^ 0xffffffff) != -1) {
				((GameInterfaceData) this).type &= 0x7f;
				((GameInterfaceData) this).aString2231 = stream.readString();
			}
			((GameInterfaceData) this).contentType = stream.readShort();
			((GameInterfaceData) this).anInt2283 = stream.readUShort(false);
			((GameInterfaceData) this).anInt2229 = stream.readUShort(false);
			((GameInterfaceData) this).anInt2235 = stream.readShort();
			((GameInterfaceData) this).anInt2242 = stream.readShort();
			((GameInterfaceData) this).aByte2243 = stream.readSignedByte();
			((GameInterfaceData) this).aByte2207 = stream.readSignedByte();
			((GameInterfaceData) this).aByte2240 = stream.readSignedByte();
			((GameInterfaceData) this).aByte2245 = stream.readSignedByte();
			((GameInterfaceData) this).anInt2234 = stream.readShort();
			if (((GameInterfaceData) this).anInt2234 != 65535)
				((GameInterfaceData) this).anInt2234 = (((GameInterfaceData) this).anInt2234 + (((GameInterfaceData) this).anInt2248 & ~0xffff));
			else
				((GameInterfaceData) this).anInt2234 = -1;
			int i_3_ = stream.readUnsignedByte();
			if (i_2_ >= 0)
				((GameInterfaceData) this).aBoolean2286 = (0x2 & i_3_ ^ 0xffffffff) != -1;
			((GameInterfaceData) this).aBoolean2295 = (i_3_ & 0x1 ^ 0xffffffff) != -1;
			if ((((GameInterfaceData) this).type ^ 0xffffffff) == -1) {
				((GameInterfaceData) this).anInt2290 = stream.readShort();
				((GameInterfaceData) this).anInt2228 = stream.readShort();
				if (i_2_ < 0)
					((GameInterfaceData) this).aBoolean2286 = ((stream.readUnsignedByte() ^ 0xffffffff) == -2);
			}
			if (((GameInterfaceData) this).type == 5) {
				((GameInterfaceData) this).anInt2237 = stream.readInt(-2);
				((GameInterfaceData) this).anInt2255 = stream.readShort();
				int i_4_ = stream.readUnsignedByte();
				((GameInterfaceData) this).aBoolean2288 = (0x1 & i_4_ ^ 0xffffffff) != -1;
				((GameInterfaceData) this).aBoolean2279 = (i_4_ & 0x2) != 0;
				((GameInterfaceData) this).anInt2285 = stream.readUnsignedByte();
				((GameInterfaceData) this).anInt2304 = stream.readUnsignedByte();
				((GameInterfaceData) this).anInt2355 = stream.readInt(-2);
				((GameInterfaceData) this).aBoolean2327 = stream.readUnsignedByte() == 1;
				((GameInterfaceData) this).aBoolean2281 = stream.readUnsignedByte() == 1;
				((GameInterfaceData) this).anInt2236 = stream.readInt(-2);
			}
			if (((GameInterfaceData) this).type == 6) {
				((GameInterfaceData) this).anInt2233 = 1;
				((GameInterfaceData) this).anInt2343 = stream.readShort();
				if (((GameInterfaceData) this).anInt2343 == 65535)
					((GameInterfaceData) this).anInt2343 = -1;
				int i_5_ = stream.readUnsignedByte();
				((GameInterfaceData) this).aBoolean2280 = (0x2 & i_5_ ^ 0xffffffff) == -3;
				((GameInterfaceData) this).aBoolean2265 = (i_5_ & 0x4 ^ 0xffffffff) == -5;
				((GameInterfaceData) this).aBoolean2325 = (0x8 & i_5_) == 8;
				boolean bool = (0x1 & i_5_) == 1;
				if (bool) {
					((GameInterfaceData) this).anInt2336 = stream.readUShort(false);
					((GameInterfaceData) this).anInt2344 = stream.readUShort(false);
					((GameInterfaceData) this).anInt2310 = stream.readShort();
					((GameInterfaceData) this).anInt2218 = stream.readShort();
					((GameInterfaceData) this).anInt2346 = stream.readShort();
					((GameInterfaceData) this).anInt2251 = stream.readShort();
				} else if (((GameInterfaceData) this).aBoolean2280) {
					((GameInterfaceData) this).anInt2336 = stream.readUShort(false);
					((GameInterfaceData) this).anInt2344 = stream.readUShort(false);
					((GameInterfaceData) this).anInt2352 = stream.readUShort(false);
					((GameInterfaceData) this).anInt2310 = stream.readShort();
					((GameInterfaceData) this).anInt2218 = stream.readShort();
					((GameInterfaceData) this).anInt2346 = stream.readShort();
					((GameInterfaceData) this).anInt2251 = stream.readUShort(false);
				}
				((GameInterfaceData) this).anInt2208 = stream.readShort();
				if ((((GameInterfaceData) this).anInt2208 ^ 0xffffffff) == -65536)
					((GameInterfaceData) this).anInt2208 = -1;
				if ((((GameInterfaceData) this).aByte2243 ^ 0xffffffff) != -1)
					((GameInterfaceData) this).anInt2232 = stream.readShort();
				if ((((GameInterfaceData) this).aByte2207 ^ 0xffffffff) != -1)
					((GameInterfaceData) this).anInt2226 = stream.readShort();
			}
			if ((((GameInterfaceData) this).type ^ 0xffffffff) == -5) {
				((GameInterfaceData) this).anInt2264 = stream.readShort();
				if (((GameInterfaceData) this).anInt2264 == 65535)
					((GameInterfaceData) this).anInt2264 = -1;
				((GameInterfaceData) this).aString2225 = stream.readString();
				((GameInterfaceData) this).anInt2244 = stream.readUnsignedByte();
				((GameInterfaceData) this).anInt2341 = stream.readUnsignedByte();
				((GameInterfaceData) this).anInt2296 = stream.readUnsignedByte();
				((GameInterfaceData) this).aBoolean2315 = stream.readUnsignedByte() == 1;
				((GameInterfaceData) this).anInt2236 = stream.readInt(i ^ 0x3b3);
				((GameInterfaceData) this).anInt2285 = stream.readUnsignedByte();
				if ((i_2_ ^ 0xffffffff) <= -1)
					((GameInterfaceData) this).anInt2350 = stream.readUnsignedByte();
			}
			if ((((GameInterfaceData) this).type ^ 0xffffffff) == -4) {
				((GameInterfaceData) this).anInt2236 = stream.readInt(-2);
				((GameInterfaceData) this).aBoolean2263 = stream.readUnsignedByte() == 1;
				((GameInterfaceData) this).anInt2285 = stream.readUnsignedByte();
			}
			if ((((GameInterfaceData) this).type ^ 0xffffffff) == -10) {
				((GameInterfaceData) this).anInt2293 = stream.readUnsignedByte();
				((GameInterfaceData) this).anInt2236 = stream.readInt(-2);
				((GameInterfaceData) this).aBoolean2256 = ((stream.readUnsignedByte() ^ 0xffffffff) == -2);
			}
			int i_6_ = stream.readMedium(-125);
			int i_7_ = stream.readUnsignedByte();
			if (i_7_ != 0) {
				((GameInterfaceData) this).aByteArray2345 = new byte[11];
				((GameInterfaceData) this).anIntArray2275 = new int[11];
				((GameInterfaceData) this).aByteArray2331 = new byte[11];
				for (/**/; (i_7_ ^ 0xffffffff) != -1; i_7_ = stream.readUnsignedByte()) {
					int i_8_ = -1 + (i_7_ >> -1687058556);
					i_7_ = (stream.readUnsignedByte() | i_7_ << -1011278808);
					i_7_ &= 0xfff;
					if (i_7_ == 4095)
						i_7_ = -1;
					byte i_9_ = stream.readSignedByte();
					if (i_9_ != 0)
						((GameInterfaceData) this).aBoolean2222 = true;
					byte i_10_ = stream.readSignedByte();
					((GameInterfaceData) this).anIntArray2275[i_8_] = i_7_;
					((GameInterfaceData) this).aByteArray2345[i_8_] = i_9_;
					((GameInterfaceData) this).aByteArray2331[i_8_] = i_10_;
				}
			}
			((GameInterfaceData) this).aString2224 = stream.readString();
			int i_11_ = stream.readUnsignedByte();
			int i_12_ = 0xf & i_11_;
			int i_13_ = i_11_ >> -1266982652;
			if (i_12_ > 0) {
				((GameInterfaceData) this).aStringArray2351 = new String[i_12_];
				for (int i_14_ = 0; i_12_ > i_14_; i_14_++)
					((GameInterfaceData) this).aStringArray2351[i_14_] = stream.readString();
			}
			if ((i_13_ ^ 0xffffffff) < -1) {
				int i_15_ = stream.readUnsignedByte();
				((GameInterfaceData) this).anIntArray2326 = new int[1 + i_15_];
				for (int i_16_ = 0; ((((GameInterfaceData) this).anIntArray2326.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++)
					((GameInterfaceData) this).anIntArray2326[i_16_] = -1;
				((GameInterfaceData) this).anIntArray2326[i_15_] = stream.readShort();
			}
			if (i_13_ > 1) {
				int i_17_ = stream.readUnsignedByte();
				((GameInterfaceData) this).anIntArray2326[i_17_] = stream.readShort();
			}
			((GameInterfaceData) this).aString2333 = stream.readString();
			if (((GameInterfaceData) this).aString2333.equals(""))
				((GameInterfaceData) this).aString2333 = null;
			((GameInterfaceData) this).anInt2308 = stream.readUnsignedByte();
			((GameInterfaceData) this).anInt2353 = stream.readUnsignedByte();
			((GameInterfaceData) this).anInt2289 = stream.readUnsignedByte();
			((GameInterfaceData) this).aString2214 = stream.readString();
			int i_18_ = -1;
			if ((aa_Sub3.method157(i_6_, (byte) 64) ^ 0xffffffff) != -1) {
				i_18_ = stream.readShort();
				if (i_18_ == 65535)
					i_18_ = -1;
				((GameInterfaceData) this).anInt2309 = stream.readShort();
				if ((((GameInterfaceData) this).anInt2309 ^ 0xffffffff) == -65536)
					((GameInterfaceData) this).anInt2309 = -1;
				((GameInterfaceData) this).anInt2318 = stream.readShort();
				if (((GameInterfaceData) this).anInt2318 == 65535)
					((GameInterfaceData) this).anInt2318 = -1;
			}
			if ((i_2_ ^ 0xffffffff) <= -1) {
				((GameInterfaceData) this).anInt2317 = stream.readShort();
				if ((((GameInterfaceData) this).anInt2317 ^ 0xffffffff) == -65536)
					((GameInterfaceData) this).anInt2317 = -1;
			}
			((GameInterfaceData) this).aClass98_Sub49_2348 = new IComponentSettings(i_6_, i_18_);
			if ((i_2_ ^ 0xffffffff) <= -1) {
				int i_19_ = stream.readUnsignedByte();
				for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
					int i_21_ = stream.readMedium(-124);
					int i_22_ = stream.readInt(-2);
					aClass377_2337.method3996(new Class98_Sub34(i_22_), (long) i_21_, -1);
				}
				int i_23_ = stream.readUnsignedByte();
				for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_24_++) {
					int i_25_ = stream.readMedium(-123);
					String string = stream.method1223(-1);
					aClass377_2337.method3996(new Class98_Sub15(string), (long) i_25_, -1);
				}
			}
			((GameInterfaceData) this).anObjectArray2332 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2227 = decodeScript(stream, i ^ ~0x3b2);
			((GameInterfaceData) this).anObjectArray2272 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2324 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2257 = decodeScript(stream, i + 947);
			((GameInterfaceData) this).anObjectArray2269 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2252 = decodeScript(stream, i ^ i);
			((GameInterfaceData) this).anObjectArray2278 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2270 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2329 = decodeScript(stream, i + 947);
			if ((i_2_ ^ 0xffffffff) <= -1)
				((GameInterfaceData) this).anObjectArray2253 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2314 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2291 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2335 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2356 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2230 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2316 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2313 = decodeScript(stream, 0);
			((GameInterfaceData) this).onMouseWheelListener = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2212 = decodeScript(stream, 0);
			((GameInterfaceData) this).anObjectArray2320 = decodeScript(stream, 0);
			((GameInterfaceData) this).anIntArray2284 = decodeConfigs(stream, 0);
			((GameInterfaceData) this).anIntArray2249 = decodeConfigs(stream, 0);
			((GameInterfaceData) this).anIntArray2271 = decodeConfigs(stream, 0);
			((GameInterfaceData) this).anIntArray2297 = decodeConfigs(stream, i + 947);
			((GameInterfaceData) this).anIntArray2342 = decodeConfigs(stream, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.T(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3458(String string, int i, int i_26_) {
		try {
			if (i != 16)
				method3464(true, null, 18, null, null);
			if (aClass377_2337 == null) {
				aClass377_2337 = new Class377(16);
				aClass377_2337.method3996(new Class98_Sub15(string), (long) i_26_, i ^ ~0x10);
			} else {
				Class98_Sub15 class98_sub15 = ((Class98_Sub15) aClass377_2337.method3990((long) i_26_, i ^ ~0x10));
				if (class98_sub15 == null)
					aClass377_2337.method3996(new Class98_Sub15(string), (long) i_26_, i ^ ~0x10);
				else
					((Class98_Sub15) class98_sub15).aString3917 = string;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.H(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ')'));
		}
	}

	final void method3459(byte i, int i_27_) {
		do {
			try {
				if (aClass377_2337 != null) {
					Node class98 = aClass377_2337.method3990((long) i_27_, -1);
					if (class98 != null)
						class98.remove();
				}
				if (i >= 36)
					break;
				method3458(null, 44, -60);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sba.L(" + i + ',' + i_27_ + ')'));
			}
			break;
		} while (false);
	}

	final Class43 method3460(int i, ha var_ha) {
		try {
			Class43 class43 = Class98_Sub1.method945(((GameInterfaceData) this).anInt2264, var_ha, (byte) 99, false);
			Class93.aBoolean3503 = class43 == null;
			if (i > -37)
				((GameInterfaceData) this).anInt2347 = -28;
			return class43;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.D(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final AbstractModel method3461(Interface6 interface6, Class183 class183, Class301 class301, Class83 class83, ha var_ha, Class257 class257, Class40 class40, byte i, int i_28_, int i_29_, int i_30_, int i_31_, Class97 class97, PlayerAppearance class313, ItemDefinitionList class205) {
		try {
			Class93.aBoolean3503 = false;
			if ((((GameInterfaceData) this).anInt2233 ^ 0xffffffff) == -1)
				return null;
			if ((((GameInterfaceData) this).anInt2233 ^ 0xffffffff) == -2 && ((GameInterfaceData) this).anInt2343 == -1)
				return null;
			if ((((GameInterfaceData) this).anInt2233 ^ 0xffffffff) == -2) {
				int i_33_ = i_29_;
				if (class97 != null)
					i_29_ |= class97.method932(true, i_30_, true, i_28_);
				long l = (long) ((((GameInterfaceData) this).anInt2233 << 994290256) + (((ha) var_ha).anInt937 << -395944227) - -((GameInterfaceData) this).anInt2343);
				AbstractModel class146 = (AbstractModel) Class64_Sub5.aClass79_3650.get(l);
				if (class146 == null || ((var_ha.c(class146.ua(), i_29_) ^ 0xffffffff) != -1)) {
					if (class146 != null)
						i_29_ = var_ha.method1777(i_29_, class146.ua());
					ModelDefinitions class178 = Class98_Sub6.method981(0, -9252, Class340.aClass207_2847, ((GameInterfaceData) this).anInt2343);
					if (class178 == null) {
						Class93.aBoolean3503 = true;
						return null;
					}
					if (((ModelDefinitions) class178).anInt1387 < 13)
						class178.method2592(13746, 2);
					class146 = var_ha.method1790(class178, i_29_, Class76_Sub10.anInt3794, 64, 768);
					Class64_Sub5.aClass79_3650.put(l, class146);
				}
				if (class97 != null)
					class146 = class97.method937(i_28_, i_31_, i_29_, 121, class146, i_30_);
				class146.s(i_33_);
				return class146;
			}
			if ((((GameInterfaceData) this).anInt2233 ^ 0xffffffff) == -3) {
				AbstractModel class146 = (class301.method3538(((GameInterfaceData) this).anInt2343).method2299(class97, false, interface6, i_31_, i_30_, class183, i_29_, var_ha, class40, i_28_));
				if (class146 == null) {
					Class93.aBoolean3503 = true;
					return null;
				}
				return class146;
			}
			if (((GameInterfaceData) this).anInt2233 == 3) {
				if (class313 == null)
					return null;
				AbstractModel class146 = class313.method3624((byte) 107, i_31_, class83, class205, var_ha, i_30_, interface6, class97, class301, i_28_, class183, i_29_);
				if (class146 == null) {
					Class93.aBoolean3503 = true;
					return null;
				}
				return class146;
			}
			if (((GameInterfaceData) this).anInt2233 == 4) {
				ItemDefinition class297 = class205.getItemDefs(((GameInterfaceData) this).anInt2343);
				AbstractModel class146 = class297.method3501(i_31_, i_29_, i_30_, class97, i_28_, var_ha, 10, 128, class313);
				if (class146 == null) {
					Class93.aBoolean3503 = true;
					return null;
				}
				return class146;
			}
			if (((GameInterfaceData) this).anInt2233 == 6) {
				AbstractModel class146 = (class301.method3538(((GameInterfaceData) this).anInt2343).method2301(i_30_, 0, null, 0, (byte) 120, class97, null, var_ha, 0, i_28_, interface6, class40, i_31_, class257, i_29_, 0, class183, null));
				if (class146 == null) {
					Class93.aBoolean3503 = true;
					return null;
				}
				return class146;
			}
			if (((GameInterfaceData) this).anInt2233 == 7) {
				if (class313 == null)
					return null;
				int i_34_ = ((GameInterfaceData) this).anInt2343 >>> -1684107024;
				int i_35_ = ((GameInterfaceData) this).anInt2343 & 0xffff;
				int i_36_ = ((GameInterfaceData) this).anInt2210;
				AbstractModel class146 = class313.method3626(i_30_, class97, i_31_, i_36_, i_34_, i_35_, i_28_, i_29_, class83, var_ha, 256, class183);
				if (class146 == null) {
					Class93.aBoolean3503 = true;
					return null;
				}
				return class146;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.P(" + (interface6 != null ? "{...}" : "null") + ',' + (class183 != null ? "{...}" : "null") + ',' + (class301 != null ? "{...}" : "null") + ',' + (class83 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class257 != null ? "{...}" : "null") + ',' + (class40 != null ? "{...}" : "null") + ',' + i + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + (class97 != null ? "{...}" : "null") + ',' + (class313 != null ? "{...}" : "null") + ',' + (class205 != null ? "{...}" : "null") + ')'));
		}
	}

	private final Object[] decodeScript(RSByteBuffer class98_sub22, int i) {
		try {
			int i_37_ = class98_sub22.readUnsignedByte();
			if ((i_37_ ^ 0xffffffff) == -1)
				return null;
			Object[] objects = new Object[i_37_];
			for (int i_38_ = i; (i_38_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff); i_38_++) {
				int i_39_ = class98_sub22.readUnsignedByte();
				if (i_39_ != 0) {
					if (i_39_ == 1)
						objects[i_38_] = class98_sub22.readString();
				} else
					objects[i_38_] = new Integer(class98_sub22.readInt(-2));
			}
			((GameInterfaceData) this).hasListener = true;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.M(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final String method3463(int i, int i_40_, String string) {
		try {
			if (i_40_ != 700)
				((GameInterfaceData) this).aBoolean2263 = false;
			if (aClass377_2337 == null)
				return string;
			Class98_Sub15 class98_sub15 = (Class98_Sub15) aClass377_2337.method3990((long) i, -1);
			if (class98_sub15 == null)
				return string;
			return ((Class98_Sub15) class98_sub15).aString3917;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.R(" + i + ',' + i_40_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3464(boolean bool, ha var_ha, int i, AbstractModel class146, Class111 class111) {
		do {
			try {
				class146.method2343(class111);
				Class87[] class87s = class146.method2320();
				if (bool == true) {
					Class35[] class35s = class146.method2322();
					if ((((GameInterfaceData) this).aClass246_Sub5_2301 == null || (((Class246_Sub5) ((GameInterfaceData) this).aClass246_Sub5_2301).aBoolean5099)) && (class87s != null || class35s != null))
						((GameInterfaceData) this).aClass246_Sub5_2301 = Class246_Sub5.method3117(i, false);
					if (((GameInterfaceData) this).aClass246_Sub5_2301 == null)
						break;
					((GameInterfaceData) this).aClass246_Sub5_2301.method3120(var_ha, (long) i, class87s, class35s, false);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sba.A(" + bool + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + (class146 != null ? "{...}" : "null") + ',' + (class111 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3465(int i) {
		try {
			((GameInterfaceData) this).anObjectArray2316 = null;
			((GameInterfaceData) this).anObjectArray2215 = null;
			((GameInterfaceData) this).anObjectArray2292 = null;
			((GameInterfaceData) this).anObjectArray2272 = null;
			((GameInterfaceData) this).anObjectArray2252 = null;
			((GameInterfaceData) this).anObjectArray2340 = null;
			if (i != -1)
				((GameInterfaceData) this).anIntArray2271 = null;
			((GameInterfaceData) this).anIntArray2297 = null;
			((GameInterfaceData) this).anIntArray2249 = null;
			((GameInterfaceData) this).anObjectArray2320 = null;
			((GameInterfaceData) this).onMouseWheelListener = null;
			((GameInterfaceData) this).anObjectArray2266 = null;
			((GameInterfaceData) this).anObjectArray2291 = null;
			((GameInterfaceData) this).anObjectArray2220 = null;
			((GameInterfaceData) this).anObjectArray2274 = null;
			((GameInterfaceData) this).anObjectArray2278 = null;
			((GameInterfaceData) this).anObjectArray2313 = null;
			((GameInterfaceData) this).anObjectArray2324 = null;
			((GameInterfaceData) this).anObjectArray2335 = null;
			((GameInterfaceData) this).anObjectArray2356 = null;
			((GameInterfaceData) this).anObjectArray2253 = null;
			((GameInterfaceData) this).anIntArray2342 = null;
			((GameInterfaceData) this).anObjectArray2314 = null;
			((GameInterfaceData) this).anIntArray2271 = null;
			((GameInterfaceData) this).anObjectArray2294 = null;
			((GameInterfaceData) this).anObjectArray2239 = null;
			((GameInterfaceData) this).anIntArray2284 = null;
			((GameInterfaceData) this).anObjectArray2269 = null;
			((GameInterfaceData) this).anObjectArray2270 = null;
			((GameInterfaceData) this).anObjectArray2332 = null;
			((GameInterfaceData) this).anObjectArray2329 = null;
			((GameInterfaceData) this).anObjectArray2257 = null;
			((GameInterfaceData) this).anObjectArray2330 = null;
			((GameInterfaceData) this).anObjectArray2227 = null;
			((GameInterfaceData) this).anObjectArray2230 = null;
			((GameInterfaceData) this).anObjectArray2212 = null;
			((GameInterfaceData) this).anObjectArray2319 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sba.K(" + i + ')');
		}
	}

	static final void method3466(byte i, Mobile class246_sub3_sub4_sub2) {
		do {
			try {
				boolean bool = false;
				do {
					if (((Class215.anInt1614 ^ 0xffffffff) != (((Mobile) class246_sub3_sub4_sub2).anInt6424 ^ 0xffffffff)) && (((Mobile) class246_sub3_sub4_sub2).anInt6413) != -1 && (((Mobile) class246_sub3_sub4_sub2).anInt6400) == 0) {
						Class97 class97 = (Class151_Sub7.aClass183_5001.method2623(((Mobile) class246_sub3_sub4_sub2).anInt6413, i + 16363));
						if (!((Class97) class97).aBoolean825 && (1 + ((Mobile) class246_sub3_sub4_sub2).anInt6366 <= (((Class97) class97).anIntArray811[((Mobile) class246_sub3_sub4_sub2).anInt6393])))
							break;
						bool = true;
						if (!client.aBoolean3553)
							break;
					}
					bool = true;
				} while (false);
				if (bool) {
					int i_41_ = ((((Mobile) class246_sub3_sub4_sub2).anInt6424) + -((Mobile) class246_sub3_sub4_sub2).anInt6390);
					int i_42_ = (Class215.anInt1614 + -((Mobile) class246_sub3_sub4_sub2).anInt6390);
					int i_43_ = ((((Mobile) class246_sub3_sub4_sub2).anInt6378) * 512 - -(256 * class246_sub3_sub4_sub2.getSize()));
					int i_44_ = ((((Mobile) class246_sub3_sub4_sub2).anInt6347) * 512 + class246_sub3_sub4_sub2.getSize() * 256);
					int i_45_ = ((((Mobile) class246_sub3_sub4_sub2).anInt6362) * 512 - -(256 * class246_sub3_sub4_sub2.getSize()));
					int i_46_ = (512 * ((Mobile) class246_sub3_sub4_sub2).anInt6392 - -(class246_sub3_sub4_sub2.getSize() * 256));
					((AnimableEntity) class246_sub3_sub4_sub2).localXPos = (((-i_42_ + i_41_) * i_43_ - -(i_45_ * i_42_)) / i_41_);
					((AnimableEntity) class246_sub3_sub4_sub2).localYPos = (i_42_ * i_46_ + i_44_ * (i_41_ - i_42_)) / i_41_;
				}
				((Mobile) class246_sub3_sub4_sub2).anInt6433 = 0;
				if ((((Mobile) class246_sub3_sub4_sub2).anInt6407) == 0)
					class246_sub3_sub4_sub2.method3047(8192, false, i + 11);
				if (i == 20) {
					if ((((Mobile) class246_sub3_sub4_sub2).anInt6407) == 1)
						class246_sub3_sub4_sub2.method3047(12288, false, 107);
					if ((((Mobile) class246_sub3_sub4_sub2).anInt6407) == 2)
						class246_sub3_sub4_sub2.method3047(0, false, 65);
					if (((((Mobile) class246_sub3_sub4_sub2).anInt6407) ^ 0xffffffff) != -4)
						break;
					class246_sub3_sub4_sub2.method3047(4096, false, 88);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sba.S(" + i + ',' + ((class246_sub3_sub4_sub2 != null) ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Class346 method3467(int i, Class115 class115, Class59 class59) {
		try {
			if (i == (((GameInterfaceData) this).anInt2267 ^ 0xffffffff))
				return null;
			long l = (((0xffffL & (long) ((GameInterfaceData) this).anInt2306) << -1299272208) | ((long) ((GameInterfaceData) this).anInt2260 << 1934691488 & 65535L << -565839264) | (65535L << 1514706192 & (long) ((GameInterfaceData) this).anInt2334 << 1170488080) | (long) ((GameInterfaceData) this).anInt2267 & 0xffffL);
			Class346 class346 = ((Class346) Class151_Sub7.aClass79_5004.get(l));
			if (class346 == null) {
				class346 = class59.method528(0, ((GameInterfaceData) this).anInt2267, ((GameInterfaceData) this).anInt2260, ((GameInterfaceData) this).anInt2306, class115, ((GameInterfaceData) this).anInt2334);
				Class151_Sub7.aClass79_5004.put(l, class346);
			}
			return class346;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.F(" + i + ',' + (class115 != null ? "{...}" : "null") + ',' + (class59 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3468(String string, int i, int i_47_) {
		try {
			if (((GameInterfaceData) this).aStringArray2351 == null || i >= ((GameInterfaceData) this).aStringArray2351.length) {
				String[] strings = new String[1 + i];
				if (((GameInterfaceData) this).aStringArray2351 != null) {
					for (int i_48_ = 0; ((i_48_ ^ 0xffffffff) > (((GameInterfaceData) this).aStringArray2351.length ^ 0xffffffff)); i_48_++)
						strings[i_48_] = ((GameInterfaceData) this).aStringArray2351[i_48_];
				}
				((GameInterfaceData) this).aStringArray2351 = strings;
			}
			if (i_47_ != 1)
				((GameInterfaceData) this).anIntArray2297 = null;
			((GameInterfaceData) this).aStringArray2351[i] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.Q(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_47_ + ')'));
		}
	}

	final aa method3469(ha var_ha, int i) {
		try {
			aa var_aa = ((aa) Class76_Sub11.aClass79_3797.get((long) ((GameInterfaceData) this).anInt2248));
			if (var_aa != null)
				return var_aa;
			Class324 class324 = Class324.method3685(Class166.aClass207_1280, ((GameInterfaceData) this).anInt2237, 0);
			if (class324 == null)
				return null;
			if (i < 91)
				method3468(null, 115, 17);
			int i_49_ = (((Class324) class324).anInt2719 + (((Class324) class324).anInt2722 + ((Class324) class324).anInt2725));
			int i_50_ = (((Class324) class324).anInt2720 - (-((Class324) class324).anInt2721 - ((Class324) class324).anInt2724));
			((GameInterfaceData) this).anIntArray2217 = new int[i_50_];
			((GameInterfaceData) this).anIntArray2298 = new int[i_50_];
			for (int i_51_ = 0; ((Class324) class324).anInt2720 > i_51_; i_51_++) {
				int i_52_ = 0;
				for (int i_53_ = 0; ((i_53_ ^ 0xffffffff) > (((Class324) class324).anInt2722 ^ 0xffffffff)); i_53_++) {
					if ((((Class324) class324).aByteArray2717[i_53_ + ((Class324) class324).anInt2722 * i_51_]) != 0) {
						i_52_ = i_53_;
						break;
					}
				}
				int i_54_ = i_49_;
				for (int i_55_ = i_52_; i_55_ < ((Class324) class324).anInt2722; i_55_++) {
					if (((((Class324) class324).aByteArray2717[i_55_ - -(i_51_ * ((Class324) class324).anInt2722)]) ^ 0xffffffff) == -1) {
						i_54_ = i_55_;
						break;
					}
				}
				((GameInterfaceData) this).anIntArray2217[((Class324) class324).anInt2721 + i_51_] = ((Class324) class324).anInt2725 + i_52_;
				((GameInterfaceData) this).anIntArray2298[((Class324) class324).anInt2721 + i_51_] = i_54_ + -i_52_;
			}
			var_aa = var_ha.method1772(i_49_, i_50_, ((GameInterfaceData) this).anIntArray2217, ((GameInterfaceData) this).anIntArray2298);
			Class76_Sub11.aClass79_3797.put((long) (((GameInterfaceData) this).anInt2248), var_aa);
			return var_aa;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.I(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3470(boolean bool, boolean bool_56_, long l, int i, int i_57_, String string, boolean bool_58_, int i_59_, int i_60_, long l_61_, int i_62_, boolean bool_63_, String string_64_) {
		try {
			if (!Player.aBoolean6540 && Class359.anInt3058 < 500) {
				i = i == -1 ? Class21_Sub2.anInt5387 : i;
				if (bool == false) {
					Class98_Sub46_Sub8 class98_sub46_sub8 = new Class98_Sub46_Sub8(string_64_, string, i, i_60_, i_62_, l, i_57_, i_59_, bool_56_, bool_63_, l_61_, bool_58_);
					Class157.method2506(126, class98_sub46_sub8);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.G(" + bool + ',' + bool_56_ + ',' + l + ',' + i + ',' + i_57_ + ',' + (string != null ? "{...}" : "null") + ',' + bool_58_ + ',' + i_59_ + ',' + i_60_ + ',' + l_61_ + ',' + i_62_ + ',' + bool_63_ + ',' + (string_64_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3471(Canvas canvas, int i) {
		try {
			Dimension dimension = canvas.getSize();
			Class287_Sub2.method3391(dimension.height, dimension.width, i + 2);
			if (i != 0)
				method3470(false, false, 67L, 36, 81, null, false, -96, 43, 34L, 85, false, null);
			if (Class98_Sub46.anInt4261 == 1)
				Class154.aHa1231.method1782(canvas, aa_Sub1.anInt3556, IncomingMessages.anInt5519);
			else
				Class154.aHa1231.method1782(canvas, Class151_Sub7.anInt5005, ParamType.anInt1208);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.C(" + (canvas != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method3472(int i, int i_65_, int i_66_) {
		try {
			if (i != 22241)
				return -31;
			if (aClass377_2337 == null)
				return i_65_;
			Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_2337.method3990((long) i_66_, -1);
			if (class98_sub34 == null)
				return i_65_;
			return ((Class98_Sub34) class98_sub34).anInt4126;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.O(" + i + ',' + i_65_ + ',' + i_66_ + ')'));
		}
	}

	private final int[] decodeConfigs(RSByteBuffer class98_sub22, int i) {
		try {
			int i_67_ = class98_sub22.readUnsignedByte();
			if (i_67_ == 0)
				return null;
			int[] is = new int[i_67_];
			for (int i_68_ = i; i_68_ < i_67_; i_68_++)
				is[i_68_] = class98_sub22.readInt(-2);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.J(" + (class98_sub22 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3474(int i, int i_69_, int i_70_) {
		try {
			if (((GameInterfaceData) this).anIntArray2326 == null || ((i_69_ ^ 0xffffffff) <= (((GameInterfaceData) this).anIntArray2326.length ^ 0xffffffff))) {
				int[] is = new int[i_69_ + 1];
				if (((GameInterfaceData) this).anIntArray2326 != null) {
					for (int i_71_ = 0; ((GameInterfaceData) this).anIntArray2326.length > i_71_; i_71_++)
						is[i_71_] = ((GameInterfaceData) this).anIntArray2326[i_71_];
					for (int i_72_ = ((GameInterfaceData) this).anIntArray2326.length; (i_72_ ^ 0xffffffff) > (i_69_ ^ 0xffffffff); i_72_++)
						is[i_72_] = -1;
				}
				((GameInterfaceData) this).anIntArray2326 = is;
			}
			if (i != -17972)
				((GameInterfaceData) this).aBoolean2288 = false;
			((GameInterfaceData) this).anIntArray2326[i_69_] = i_70_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sba.E(" + i + ',' + i_69_ + ',' + i_70_ + ')'));
		}
	}

	public GameInterfaceData() {
		((GameInterfaceData) this).aClass293_2219 = null;
		((GameInterfaceData) this).anInt2234 = -1;
		((GameInterfaceData) this).aByte2207 = (byte) 0;
		((GameInterfaceData) this).anInt2238 = -1;
		((GameInterfaceData) this).anInt2211 = -1;
		((GameInterfaceData) this).anInt2244 = 0;
		((GameInterfaceData) this).aBoolean2262 = false;
		((GameInterfaceData) this).anInt2246 = 0;
		((GameInterfaceData) this).anInt2258 = 0;
		((GameInterfaceData) this).aString2225 = "";
		((GameInterfaceData) this).anInt2237 = -1;
		((GameInterfaceData) this).anInt2218 = 0;
		((GameInterfaceData) this).anInt2255 = 0;
		((GameInterfaceData) this).anInt2268 = 0;
		((GameInterfaceData) this).anInt2228 = 0;
		((GameInterfaceData) this).anInt2273 = 0;
		((GameInterfaceData) this).anInt2251 = 100;
		((GameInterfaceData) this).anInt2289 = Class369.anInt3129;
		((GameInterfaceData) this).anInt2254 = -1;
		((GameInterfaceData) this).aBoolean2265 = false;
		((GameInterfaceData) this).aString2224 = "";
		((GameInterfaceData) this).anInt2264 = -1;
		((GameInterfaceData) this).anInt2208 = -1;
		((GameInterfaceData) this).anInt2276 = 0;
		((GameInterfaceData) this).aByte2240 = (byte) 0;
		((GameInterfaceData) this).anInt2248 = -1;
		((GameInterfaceData) this).aString2214 = "";
		((GameInterfaceData) this).anInt2235 = 0;
		((GameInterfaceData) this).aBoolean2295 = false;
		((GameInterfaceData) this).anInt2232 = 0;
		((GameInterfaceData) this).anInt2213 = 0;
		((GameInterfaceData) this).anInt2300 = -1;
		((GameInterfaceData) this).aBoolean2263 = false;
		((GameInterfaceData) this).anInt2308 = 0;
		((GameInterfaceData) this).aBoolean2315 = false;
		((GameInterfaceData) this).anInt2285 = 0;
		((GameInterfaceData) this).anInt2311 = 0;
		((GameInterfaceData) this).aBoolean2286 = false;
		((GameInterfaceData) this).anInt2210 = -1;
		((GameInterfaceData) this).anInt2267 = -1;
		((GameInterfaceData) this).aBoolean2241 = false;
		((GameInterfaceData) this).anInt2305 = 2;
		((GameInterfaceData) this).anInt2303 = 0;
		((GameInterfaceData) this).anInt2229 = 0;
		((GameInterfaceData) this).anInt2250 = -1;
		((GameInterfaceData) this).anInt2323 = 0;
		((GameInterfaceData) this).aByte2245 = (byte) 0;
		((GameInterfaceData) this).anInt2312 = 0;
		((GameInterfaceData) this).aBoolean2279 = false;
		((GameInterfaceData) this).anInt2233 = 1;
		((GameInterfaceData) this).anInt2223 = 0;
		((GameInterfaceData) this).anInt2321 = 1;
		((GameInterfaceData) this).anInt2302 = -1;
		((GameInterfaceData) this).anInt2247 = -1;
		((GameInterfaceData) this).aByte2243 = (byte) 0;
		((GameInterfaceData) this).anInt2309 = -1;
		((GameInterfaceData) this).anInt2317 = -1;
		((GameInterfaceData) this).aBoolean2325 = false;
		((GameInterfaceData) this).anInt2282 = 0;
		((GameInterfaceData) this).aBoolean2322 = false;
		((GameInterfaceData) this).anInt2236 = 0;
		((GameInterfaceData) this).anInt2299 = 0;
		((GameInterfaceData) this).anInt2310 = 0;
		((GameInterfaceData) this).anInt2283 = 0;
		((GameInterfaceData) this).anInt2290 = 0;
		((GameInterfaceData) this).anInt2328 = 0;
		((GameInterfaceData) this).anInt2336 = 0;
		((GameInterfaceData) this).anInt2293 = 1;
		((GameInterfaceData) this).anInt2242 = 0;
		((GameInterfaceData) this).anInt2304 = 0;
		((GameInterfaceData) this).anInt2226 = 0;
		((GameInterfaceData) this).aBoolean2288 = false;
		((GameInterfaceData) this).anInt2318 = -1;
		((GameInterfaceData) this).anInt2338 = 1;
		((GameInterfaceData) this).aClass98_Sub49_2348 = Class265.aClass98_Sub49_1982;
		((GameInterfaceData) this).anInt2346 = 0;
		((GameInterfaceData) this).anInt2341 = 0;
		((GameInterfaceData) this).anInt2347 = 0;
		((GameInterfaceData) this).anInt2352 = 0;
		((GameInterfaceData) this).anInt2349 = 0;
		((GameInterfaceData) this).anInt2350 = 0;
		((GameInterfaceData) this).anInt2344 = 0;
		((GameInterfaceData) this).anInt2353 = 0;
		((GameInterfaceData) this).anInt2287 = 1;
		((GameInterfaceData) this).contentType = 0;
		((GameInterfaceData) this).anInt2296 = 0;
		((GameInterfaceData) this).aBoolean2256 = false;
		((GameInterfaceData) this).anInt2355 = 0;
	}
}
