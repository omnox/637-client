/* Class98_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub41 extends Node {
	static int anInt4200 = 0;
	String aString4201;
	static int anInt4202;
	static Object anObject4203;
	static float aFloat4204;

	public static void method1474(boolean bool) {
		do {
			try {
				anObject4203 = null;
				IncomingOpcode.aClass58_4199 = null;
				if (bool == false)
					break;
				IncomingOpcode.aClass58_4199 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qda.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void decodeRegionOpcode(int i) {
		try {
			Class151_Sub9.anInt5028 = 0;
			int chunkY = IncomingMessages.packetStream.readLEShortA((byte) 104);
			if (i >= 4) {
				int chunkX = IncomingMessages.packetStream.readShortA(121);
				int viewDistanceIndex = IncomingMessages.packetStream.readUnsignedByte();
				boolean bool = ((IncomingMessages.packetStream.readByteA() ^ 0xffffffff) == -2);
				Class98_Sub10_Sub13.method1043((byte) -65);
				Class98_Sub27.method1282((byte) 8, viewDistanceIndex);
				int chunkCount = ((-((RSByteBuffer) IncomingMessages.packetStream).position + Class65.anInt496) / 16);
				Class98_Sub46_Sub17.regionKeys = new int[chunkCount][4];
				for (int localChunkX = 0; (chunkCount ^ 0xffffffff) < (localChunkX ^ 0xffffffff); localChunkX++) {
					for (int localChunkY = 0; (localChunkY ^ 0xffffffff) > -5; localChunkY++) {
						Class98_Sub46_Sub17.regionKeys[localChunkX][localChunkY] = IncomingMessages.packetStream.readInt(-2);
					}
				}
				Class105.aByteArrayArray3414 = null;
				Class121.anIntArray1006 = new int[chunkCount];
				client.aByteArrayArray3551 = new byte[chunkCount][];
				Class377.anIntArray3178 = new int[chunkCount];
				Class287.objectDataArchive = new int[chunkCount];
				Player.aByteArrayArray6533 = new byte[chunkCount][];
				Class255.aByteArrayArray3211 = new byte[chunkCount][];
				Class377.aByteArrayArray3182 = new byte[chunkCount][];
				Class98_Sub36.landscapeArchive = new int[chunkCount];
				Class76_Sub7.anIntArray3765 = null;
				Class302.anIntArray2517 = new int[chunkCount];
				chunkCount = 0;
				for (int regionX = (-(GameWorld.size_x >> -1188333180) + chunkX) / 8; ((GameWorld.size_x >> -222953052) + chunkX) / 8 >= regionX; regionX++) {
					for (int regionY = (chunkY - (GameWorld.size_y >> 907774532)) / 8; ((chunkY + (GameWorld.size_y >> -1113312988)) / 8 >= regionY); regionY++) {
						Class121.anIntArray1006[chunkCount] = (regionX << -1191642008) + regionY;
						Class287.objectDataArchive[chunkCount] = Class234.runescapeCache.readArchiveByName((byte) -90, ("m" + regionX + "_" + regionY));
						Class98_Sub36.landscapeArchive[chunkCount] = Class234.runescapeCache.readArchiveByName((byte) -114, ("l" + regionX + "_" + regionY));
						Class302.anIntArray2517[chunkCount] = Class234.runescapeCache.readArchiveByName((byte) -77, ("um" + regionX + "_" + regionY));
						Class377.anIntArray3178[chunkCount] = Class234.runescapeCache.readArchiveByName((byte) -61, ("ul" + regionX + "_" + regionY));
						chunkCount++;
					}
				}
				Class251.method3170(-6547, chunkY, bool, chunkX, 11);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qda.A(" + i + ')');
		}
	}

	public Class98_Sub41() {
		/* empty */
	}

	Class98_Sub41(String string, int i) {
		try {
			((Class98_Sub41) this).aString4201 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qda.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
