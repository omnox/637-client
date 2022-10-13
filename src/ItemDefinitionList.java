/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class ItemDefinitionList {
	int anInt1554;
	int language;
	RuneScapeCache itemsJs5;
	private Class79 recently_used = new Class79(64);
	private boolean allow_members;
	private RuneScapeCache config_js5;
	Class79 aClass79_1560 = new Class79(50);
	Class74 aClass74_1561 = new Class74(250);
	private Class73 aClass73_1562 = new Class73();
	private Class365 paramtypelist;
	int anInt1564;
	private String[] membersObjOptions;
	private String[] membersObjInventoryOptions;

	final Class332 method2710(int i, int i_0_, ha var_ha, PlayerAppearance class313, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			((Class73) aClass73_1562).aBoolean3488 = class313 != null;
			((Class73) aClass73_1562).anInt3487 = i_3_;
			if (i_4_ != 24056)
				return null;
			((Class73) aClass73_1562).anInt3480 = i_0_;
			((Class73) aClass73_1562).anInt3481 = i_2_;
			((Class73) aClass73_1562).anInt3483 = ((ha) var_ha).anInt937;
			((Class73) aClass73_1562).anInt3484 = i_1_;
			((Class73) aClass73_1562).anInt3486 = i;
			return ((Class332) ((ItemDefinitionList) this).aClass74_1561.method732(aClass73_1562, i_4_ ^ 0x5df8));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nh.C(" + i + ',' + i_0_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class313 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final Class246_Sub3_Sub3 method2711(int i, int i_5_, int i_6_) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_5_][i_6_];
		if (class172 == null)
			return null;
		return ((Class172) class172).aClass246_Sub3_Sub3_1333;
	}

	final void method2712(int i, int i_7_) {
		try {
			((ItemDefinitionList) this).anInt1564 = i_7_;
			synchronized (((ItemDefinitionList) this).aClass79_1560) {
				((ItemDefinitionList) this).aClass79_1560.method794(103);
				int i_8_ = -127 / ((-60 - i) / 55);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.K(" + i + ',' + i_7_ + ')');
		}
	}

	static final Class82 method2713(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i, Class230[] class230s) {
		try {
			for (int i_9_ = 0; class230s.length > i_9_; i_9_++) {
				if (class230s[i_9_] == null || (((Class230) class230s[i_9_]).aLong1723 ^ 0xffffffffffffffffL) >= -1L)
					return null;
			}
			long l = OpenGL.glCreateProgramObjectARB();
			for (int i_10_ = 0; (class230s.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
				OpenGL.glAttachObjectARB(l, (((Class230) class230s[i_10_]).aLong1723));
			OpenGL.glLinkProgramARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35714, Class238.anIntArray1836, 0);
			if (i == Class238.anIntArray1836[0]) {
				if (Class238.anIntArray1836[0] == 0)
					System.out.println("Shader linking failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716, Class238.anIntArray1836, 1);
				if ((Class238.anIntArray1836[1] ^ 0xffffffff) < -2) {
					byte[] is = new byte[Class238.anIntArray1836[1]];
					OpenGL.glGetInfoLogARB(l, Class238.anIntArray1836[1], Class238.anIntArray1836, 0, is, 0);
					System.out.println(new String(is));
				}
				if ((Class238.anIntArray1836[0] ^ 0xffffffff) == -1) {
					for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (class230s.length ^ 0xffffffff)); i_11_++)
						OpenGL.glDetachObjectARB(l, (((Class230) class230s[i_11_]).aLong1723));
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class82(var_ha_Sub3_Sub2, l, class230s);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nh.G(" + (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (class230s != null ? "{...}" : "null") + ')'));
		}
	}

	final ItemDefinition getItemDefs(int id) { //Items
		try {
			ItemDefinition item;
			synchronized (recently_used) {
				item = (ItemDefinition) recently_used.get((long) id);
			}
			if (item != null)
				return item;
			byte[] data;
			synchronized (config_js5) {
				data = config_js5.readArchive(Class119_Sub3.readArchive(id), Class150.readFile(id));
			}
			item = new ItemDefinition();
			((ItemDefinition) item).itemList = this;
			((ItemDefinition) item).id = id;
			((ItemDefinition) item).itemGroundOption = (new String[] { null, null, TextResources.TAKE.get_text(((ItemDefinitionList) this).language), null, null });
			((ItemDefinition) item).inventoryOptions = (new String[] { null, null, null, null, TextResources.DROP.get_text((((ItemDefinitionList) this).language)) });
			if (data != null)
				item.decode(new RSByteBuffer(data));
			item.method3485(850);
			if ((((ItemDefinition) item).anInt2414 ^ 0xffffffff) != 0)
				item.method3487(getItemDefs(((ItemDefinition) item).anInt2433), 118, getItemDefs(((ItemDefinition) item).anInt2414));
			if (((ItemDefinition) item).anInt2459 != -1)
				item.method3498(getItemDefs(((ItemDefinition) item).anInt2472), getItemDefs(((ItemDefinition) item).anInt2459), 123);
			if (!allow_members && ((ItemDefinition) item).isMembersItem) {
				((ItemDefinition) item).name = TextResources.MEMBERS_OBJECT.get_text(((ItemDefinitionList) this).language);
				((ItemDefinition) item).itemGroundOption = membersObjOptions;
				((ItemDefinition) item).stockmarket = false;
				((ItemDefinition) item).inventoryOptions = membersObjInventoryOptions;
				((ItemDefinition) item).team = 0;
				((ItemDefinition) item).campaigns = null;
				if (((ItemDefinition) item).params != null) {
					boolean bool = false;
					for (Node class98 = ((ItemDefinition) item).params.start_iteration(124); class98 != null; class98 = ((ItemDefinition) item).params.iterate_next(-1)) {
						ParamType paramType = paramtypelist.list((byte) 31, (int) (((Node) class98).uid));
						if (((ParamType) paramType).autodisable)
							class98.remove();
						else
							bool = true;
					}
					if (!bool)
						((ItemDefinition) item).params = null;
				}
			}
			synchronized (recently_used) {
				recently_used.put((long) id, item);
			}

			return item;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.H(" + id + ')');
		}
	}

	final void method2715(int i) {
		try {
			int i_13_ = -17 / ((i - -34) / 55);
			synchronized (recently_used) {
				recently_used.method794(110);
			}
			synchronized (((ItemDefinitionList) this).aClass79_1560) {
				((ItemDefinitionList) this).aClass79_1560.method794(64);
			}
			synchronized (((ItemDefinitionList) this).aClass74_1561) {
				((ItemDefinitionList) this).aClass74_1561.method722(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.M(" + i + ')');
		}
	}

	static final void method2716(int i) {
		do {
			try {
				for (Class98_Sub46_Sub5 class98_sub46_sub5 = ((Class98_Sub46_Sub5) Class280.aClass148_2108.method2418(32)); class98_sub46_sub5 != null; class98_sub46_sub5 = ((Class98_Sub46_Sub5) Class280.aClass148_2108.method2417(i ^ ~0x25ed))) {
					Class246_Sub3_Sub4_Sub4 class246_sub3_sub4_sub4 = (((Class98_Sub46_Sub5) class98_sub46_sub5).aClass246_Sub3_Sub4_Sub4_5969);
					if (Class215.anInt1614 > (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6466)) {
						class98_sub46_sub5.remove();
						class246_sub3_sub4_sub4.method3078(i ^ 0x3254);
					} else if (Class215.anInt1614 >= ((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6479) {
						class246_sub3_sub4_sub4.method3080((byte) 109);
						if (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482 > 0) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) ((((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482) - 1), -1)));
							if (class98_sub39 != null) {
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								if ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos ^ 0xffffffff) <= -1 && (((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos) ^ 0xffffffff) > (GameWorld.size_x * 512 ^ 0xffffffff)) && ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos) ^ 0xffffffff) <= -1 && ((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos) < 512 * GameWorld.size_y))
									class246_sub3_sub4_sub4.method3074((((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos), ((Perspective.getTileHeight((((AnimableEntity) class246_sub3_sub4_sub4).height_level), (((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos), (((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos))) - (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6463)), Class215.anInt1614, (byte) 108, (((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos));
							}
						}
						if (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482 < 0) {
							int i_14_ = (-((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482 - 1);
							Player class246_sub3_sub4_sub2_sub2;
							if (i_14_ != za_Sub2.anInt6080)
								class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_14_]);
							else
								class246_sub3_sub4_sub2_sub2 = (Player.selfPlayer);
							if (class246_sub3_sub4_sub2_sub2 != null && (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localXPos ^ 0xffffffff) <= -1 && ((((AnimableEntity) class246_sub3_sub4_sub2_sub2).localXPos ^ 0xffffffff) > (512 * GameWorld.size_x ^ 0xffffffff)) && (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localYPos ^ 0xffffffff) <= -1 && ((((AnimableEntity) class246_sub3_sub4_sub2_sub2).localYPos ^ 0xffffffff) > (GameWorld.size_y * 512 ^ 0xffffffff)))
								class246_sub3_sub4_sub4.method3074(((AnimableEntity) class246_sub3_sub4_sub2_sub2).localXPos, ((Perspective.getTileHeight(((AnimableEntity) class246_sub3_sub4_sub4).height_level, (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localYPos), (((AnimableEntity) class246_sub3_sub4_sub2_sub2).localXPos))) - ((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6463), Class215.anInt1614, (byte) 108, ((AnimableEntity) class246_sub3_sub4_sub2_sub2).localYPos);
						}
						class246_sub3_sub4_sub4.method3075(-10462, Class279.anInt2099);
						Class222.method2826(class246_sub3_sub4_sub4, true);
					}
				}
				if (i == -9627)
					break;
				method2711(3, 3, 3);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nh.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2717(int i) {
		do {
			try {
				synchronized (((ItemDefinitionList) this).aClass74_1561) {
					((ItemDefinitionList) this).aClass74_1561.method722(true);
				}
				if (i == 64)
					break;
				((ItemDefinitionList) this).aClass74_1561 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nh.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2718(int i, boolean bool) {
		try {
			if (!bool != !allow_members) {
				allow_members = bool;
				if (i > -30)
					method2712(15, 22);
				method2715(94);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.F(" + i + ',' + bool + ')');
		}
	}

	final void method2719(byte i) {
		try {
			synchronized (recently_used) {
				int i_15_ = 85 / ((-69 - i) / 55);
				recently_used.method806((byte) -86);
			}
			synchronized (((ItemDefinitionList) this).aClass79_1560) {
				((ItemDefinitionList) this).aClass79_1560.method806((byte) 104);
			}
			synchronized (((ItemDefinitionList) this).aClass74_1561) {
				((ItemDefinitionList) this).aClass74_1561.method725(13937);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.E(" + i + ')');
		}
	}

	final void method2720(int i, int i_16_) {
		try {
			synchronized (recently_used) {
				recently_used.method800((byte) 62, i);
			}
			if (i_16_ != 1)
				getItemDefs(50);
			synchronized (((ItemDefinitionList) this).aClass79_1560) {
				((ItemDefinitionList) this).aClass79_1560.method800((byte) 62, i);
			}
			synchronized (((ItemDefinitionList) this).aClass74_1561) {
				((ItemDefinitionList) this).aClass74_1561.method724((byte) 96, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.I(" + i + ',' + i_16_ + ')');
		}
	}

	final void method2721(int i) {
		try {
			synchronized (((ItemDefinitionList) this).aClass79_1560) {
				if (i <= 13)
					((ItemDefinitionList) this).aClass79_1560 = null;
				((ItemDefinitionList) this).aClass79_1560.method794(38);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.B(" + i + ')');
		}
	}

	final Class332 method2722(Class43 class43, boolean bool, int i, int i_17_, int i_18_, PlayerAppearance class313, ha var_ha, int i_19_, boolean bool_20_, int i_21_, ha var_ha_22_, boolean bool_23_) {
		try {
			Class332 class332 = method2710(i_17_, i, var_ha_22_, class313, i_21_, i_19_, i_18_, 24056);
			if (class332 != null)
				return class332;
			ItemDefinition class297 = getItemDefs(i);
			if (i_21_ > 1 && ((ItemDefinition) class297).anIntArray2428 != null) {
				int i_24_ = -1;
				for (int i_25_ = 0; i_25_ < 10; i_25_++) {
					if (((ItemDefinition) class297).anIntArray2454[i_25_] <= i_21_ && (((ItemDefinition) class297).anIntArray2454[i_25_] ^ 0xffffffff) != -1)
						i_24_ = ((ItemDefinition) class297).anIntArray2428[i_25_];
				}
				if (i_24_ != -1)
					class297 = getItemDefs(i_24_);
			}
			int[] is = class297.method3488(i_18_, i_19_, bool_23_, i_21_, i_17_, var_ha_22_, var_ha, (byte) -125, class313, class43);
			if (is == null)
				return null;
			Class332 class332_26_;
			if (bool_20_)
				class332_26_ = var_ha.method1748(-7962, 0, 36, 32, is, 36);
			else
				class332_26_ = var_ha_22_.method1748(-7962, 0, 36, 32, is, 36);
			if (!bool_20_) {
				Class73 class73 = new Class73();
				((Class73) class73).anInt3486 = i_17_;
				((Class73) class73).anInt3480 = i;
				((Class73) class73).aBoolean3488 = class313 != null;
				((Class73) class73).anInt3487 = i_18_;
				((Class73) class73).anInt3484 = i_21_;
				((Class73) class73).anInt3483 = ((ha) var_ha_22_).anInt937;
				((Class73) class73).anInt3481 = i_19_;
				((ItemDefinitionList) this).aClass74_1561.method729(class332_26_, class73, false);
			}
			if (bool != false)
				method2718(-24, false);
			return class332_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nh.L(" + (class43 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_17_ + ',' + i_18_ + ',' + (class313 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_19_ + ',' + bool_20_ + ',' + i_21_ + ',' + (var_ha_22_ != null ? "{...}" : "null") + ',' + bool_23_ + ')'));
		}
	}

	ItemDefinitionList(Class279 class279, int i, boolean bool, Class365 class365, RuneScapeCache class207, RuneScapeCache class207_27_) {
		try {
			((ItemDefinitionList) this).language = i;
			paramtypelist = class365;
			((ItemDefinitionList) this).itemsJs5 = class207_27_;
			allow_members = bool;
			config_js5 = class207;
			do {
				if (config_js5 == null) {
					((ItemDefinitionList) this).anInt1554 = 0;
					if (!client.aBoolean3553)
						break;
				}
				int i_28_ = -1 + config_js5.method2752((byte) -11);
				((ItemDefinitionList) this).anInt1554 = config_js5.method2761(0, i_28_) + 256 * i_28_;
			} while (false);
			membersObjOptions = (new String[] { null, null, TextResources.TAKE.get_text(((ItemDefinitionList) this).language), null, null });
			membersObjInventoryOptions = (new String[] { null, null, null, null, TextResources.DROP.get_text((((ItemDefinitionList) this).language)) });
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nh.<init>(" + (class279 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class365 != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + (class207_27_ != null ? "{...}" : "null") + ')'));
		}
	}
}
