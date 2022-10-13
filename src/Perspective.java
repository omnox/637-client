/**
 * A utility class containing methods with conversion between
 * in-game features to canvas areas.
 */
public class Perspective {

	static final int getTileHeight(int z, int y, int x) {
		try {
			if (Class78.activeTileHeightMap == null)
				return 0;
			int tileX = x >> 9;
			int tileY = y >> 9;
			if (tileX < 0 || tileY < 0 || -1 + GameWorld.size_x < tileX || (tileY > -1 + GameWorld.size_y))
				return 0;
			int tileZ = z;
			if (tileZ < 3 && (Class281.tileSettings[1][tileX][tileY] & 0x2) != 0)
				tileZ++;
			return Class78.activeTileHeightMap[tileZ].method3417(x, y, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fca.E(" + z + ',' + y + ',' + x + ')'));
		}
	}

}
