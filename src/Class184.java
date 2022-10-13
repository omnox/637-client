/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class184 {
	static final boolean method2626(r var_r, int i, int i_0_, int i_1_, boolean[] bools) {
		boolean bool = false;
		if (Class78.activeTileHeightMap != Class81.aSArray618) {
			int i_2_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i].method3417(i_0_, i_1_, true);
			int i_3_ = 0;
			for (/**/; i_3_ <= i; i_3_++) {
				s var_s = Class98_Sub46_Sub2_Sub2.aSArray6298[i_3_];
				if (var_s != null) {
					int i_4_ = i_2_ - var_s.method3417(i_0_, i_1_, true);
					if (bools != null) {
						bools[i_3_] = var_s.method3418(var_r, i_0_, i_4_, i_1_, 0, false);
						if (!bools[i_3_])
							continue;
					}
					var_s.CA(var_r, i_0_, i_4_, i_1_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	static final boolean method2627(int i, char c) {
		try {
			if (c >= 32 && c <= 126)
				return true;
			if ((c ^ 0xffffffff) <= -161 && (c ^ 0xffffffff) >= -256)
				return true;
			if (i != 376)
				return false;
			if (c == 8364 || c == 338 || c == 8212 || c == 339 || c == 376)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mea.B(" + i + ',' + c + ')');
		}
	}
}
