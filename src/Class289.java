/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class289 {
	static Class354 aClass354_2197;

	static final void method3407(AnimableEntity class246_sub3, Class98_Sub5[] class98_sub5s) {
		if (Class348.aBoolean2914) {
			int i = class246_sub3.method2980(-51, class98_sub5s);
			Class98_Sub10_Sub30.aHa5709.method1818(i, class98_sub5s);
		}
		if (Class81.aSArray618 == Class78.activeTileHeightMap) {
			boolean bool = false;
			boolean bool_0_ = false;
			int i;
			int i_1_;
			if (class246_sub3 instanceof Class246_Sub3_Sub4) {
				i = (((Class246_Sub3_Sub4) (Class246_Sub3_Sub4) class246_sub3).aShort6158);
				i_1_ = ((Class246_Sub3_Sub4) (Class246_Sub3_Sub4) class246_sub3).aShort6157;
			} else {
				i = (((AnimableEntity) class246_sub3).localXPos >> Class151_Sub8.anInt5015);
				i_1_ = (((AnimableEntity) class246_sub3).localYPos >> Class151_Sub8.anInt5015);
			}
			Class98_Sub10_Sub30.aHa5709.EA((Class98_Sub46_Sub2_Sub2.aSArray6298[0].method3417(((AnimableEntity) class246_sub3).localXPos, ((AnimableEntity) class246_sub3).localYPos, true)), PlayerAppearance.method3636(i, i_1_), IOException_Sub1.method127(i, i_1_), Class98_Sub46_Sub20.method1639(i, i_1_));
		}
		Class246_Sub1 class246_sub1 = class246_sub3.method2975(Class98_Sub10_Sub30.aHa5709, -30);
		if (class246_sub1 != null) {
			if (((AnimableEntity) class246_sub3).aBoolean5082) {
				Class246_Sub6[] class246_sub6s = ((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067;
				for (int i = 0; i < class246_sub6s.length; i++) {
					Class246_Sub6 class246_sub6 = class246_sub6s[i];
					if (((Class246_Sub6) class246_sub6).aBoolean5114)
						Class93_Sub1_Sub1.method908((((Class246_Sub6) class246_sub6).anInt5112 + ((Class246_Sub6) class246_sub6).anInt5109), (((Class246_Sub6) class246_sub6).anInt5113 - ((Class246_Sub6) class246_sub6).anInt5109), false, (((Class246_Sub6) class246_sub6).anInt5111 - ((Class246_Sub6) class246_sub6).anInt5109), (((Class246_Sub6) class246_sub6).anInt5110 + ((Class246_Sub6) class246_sub6).anInt5109));
				}
			}
			if (((Class246_Sub1) class246_sub1).aBoolean5070) {
				((Class246_Sub1) class246_sub1).aClass246_Sub3_5069 = class246_sub3;
				if (Class375.aBoolean3170) {
					synchronized (Class98_Sub10_Sub27.aClass84_5692) {
						Class98_Sub10_Sub27.aClass84_5692.method836(0, class246_sub1);
					}
				} else
					Class98_Sub10_Sub27.aClass84_5692.method836(0, class246_sub1);
			} else
				Class35.method333(class246_sub1, 95);
		}
	}

	static final void method3408(byte i) {
		try {
			if (i < 79)
				method3410(67);
			for (Class98_Sub36 class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277.start_iteration(126)); class98_sub36 != null; class98_sub36 = (Class98_Sub36) Class156_Sub1.aClass377_3277.iterate_next(-1)) {
				if (!((Class98_Sub36) class98_sub36).aBoolean4158)
					OutgoingPacket.method1127((byte) 67, (((Class98_Sub36) class98_sub36).anInt4160));
				else
					((Class98_Sub36) class98_sub36).aBoolean4158 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rs.A(" + i + ')');
		}
	}

	public static void method3409(byte i) {
		do {
			try {
				aClass354_2197 = null;
				if (i == -117)
					break;
				method3407(null, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rs.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final OutgoingPacket method3410(int i) {
		try {
			if (i == (Class98_Sub33.anInt4117 ^ 0xffffffff))
				return new OutgoingPacket();
			return (Class98_Sub46_Sub2_Sub2.aClass98_Sub11Array6302[--Class98_Sub33.anInt4117]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rs.C(" + i + ')');
		}
	}
}
