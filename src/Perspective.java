/**
 * A utility class containing methods with conversion between
 * in-game features to canvas areas.
 */
public class Perspective {

	static final int getTileHeight(int z, int y, int x) {
		try {
			if (Class78.activeTileHeightMap == null)
				return 0;
			int tileX = x >> 1350900553;
			int tileY = y >> 1039231433;
			if (tileX < 0 || (tileY ^ 0xffffffff) > -1 || -1 + GameWorld.size_x < tileX || ((-1 + GameWorld.size_y ^ 0xffffffff) > (tileY ^ 0xffffffff)))
				return 0;
			int tileZ = z;
			if (tileZ < 3 && (Class281.tileSettings[1][tileX][tileY] & 0x2 ^ 0xffffffff) != -1)
				tileZ++;
			return Class78.activeTileHeightMap[tileZ].method3417(x, y, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fca.E(" + z + ',' + y + ',' + x + ')'));
		}
	}

}
