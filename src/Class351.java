/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class Class351 {
	static Class85 aClass85_2921;
	static int anInt2922 = 0;
	static int[] anIntArray2923 = { 1, 0, -1, 0 };
	static Class98_Sub46_Sub16[] aClass98_Sub46_Sub16Array2924;

	static final boolean method3845(int i, int playerIndex, Class98_Sub22_Sub1 class98_sub22_sub1) {
		try {
			int i_1_ = class98_sub22_sub1.readBits((byte) -86, 2);
			if (i_1_ == 0) {
				int secondBit = class98_sub22_sub1.readBits((byte) -110, 1);
				if (secondBit != 0)
					method3845(-2, playerIndex, class98_sub22_sub1);
				int i_2_ = class98_sub22_sub1.readBits((byte) -119, 6);
				int i_3_ = class98_sub22_sub1.readBits((byte) -53, 6);
				boolean bool = (class98_sub22_sub1.readBits((byte) -15, 1) == 1);
				if (bool)
					Class65.anIntArray501[Class38.anInt354++] = playerIndex;
				if (Class151_Sub9.playerArray[playerIndex] != null)
					throw new RuntimeException("hr:lr");
				Class376 class376 = Class306.aClass376Array2562[playerIndex];
				Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[playerIndex] = new Player());
				class246_sub3_sub4_sub2_sub2.anInt6369 = playerIndex;
				if (Class224_Sub3_Sub1.aClass98_Sub22Array6146[playerIndex] != null)
					class246_sub3_sub4_sub2_sub2.decodeAppearence(Class224_Sub3_Sub1.aClass98_Sub22Array6146[playerIndex], (byte) 73);
				class246_sub3_sub4_sub2_sub2.method3047(class376.anInt3172, true, 61);
				class246_sub3_sub4_sub2_sub2.anInt6364 = class376.anInt3177;
				int i_4_ = class376.anInt3176;
				int i_5_ = i_4_ >> 28;
				int i_6_ = (0x3ffe75 & i_4_) >> 14;
				int i_7_ = i_4_ & 0xff;
				int i_8_ = -Class272.anInt2038 + i_2_ + (i_6_ << 6);
				class246_sub3_sub4_sub2_sub2.aBoolean6534 = class376.aBoolean3175;
				int i_9_ = i_3_ + ((i_7_ << 6) + -aa_Sub2.anInt3562);
				class246_sub3_sub4_sub2_sub2.aByteArray6443[0] = Class98_Sub10_Sub21.aByteArray5642[playerIndex];
				class246_sub3_sub4_sub2_sub2.height_level = class246_sub3_sub4_sub2_sub2.aByte5081 = (byte) i_5_;
				if (Class1.method162(i_9_, (byte) -104, i_8_))
					class246_sub3_sub4_sub2_sub2.aByte5081++;
				class246_sub3_sub4_sub2_sub2.method3060(i_9_, i_8_, 1470);
				class246_sub3_sub4_sub2_sub2.aBoolean6532 = false;
				Class306.aClass376Array2562[playerIndex] = null;
				return true;
			}
			if (i_1_ == 1) {
				int i_10_ = class98_sub22_sub1.readBits((byte) -17, 2);
				int i_11_ = Class306.aClass376Array2562[playerIndex].anInt3176;
				Class306.aClass376Array2562[playerIndex].anInt3176 = (((0x3 & i_10_ + (i_11_ >> 28)) << 28) + (i_11_ & 0xfffffff));
				return false;
			}
			if (i_1_ == 2) {
				int i_12_ = class98_sub22_sub1.readBits((byte) -75, 5);
				int i_13_ = i_12_ >> 3;
				int i_14_ = i_12_ & 0x7;
				int i_15_ = Class306.aClass376Array2562[playerIndex].anInt3176;
				int i_16_ = 0x3 & i_13_ + (i_15_ >> 28);
				int i_17_ = i_15_ >> 14 & 0xff;
				int i_18_ = i_15_ & 0xff;
				if (i_14_ == 0) {
					i_18_--;
					i_17_--;
				}
				if (i_14_ == 1)
					i_18_--;
				if (i_14_ == 2) {
					i_17_++;
					i_18_--;
				}
				if (i_14_ == 3)
					i_17_--;
				if (i_14_ == 4)
					i_17_++;
				if (i_14_ == 5) {
					i_17_--;
					i_18_++;
				}
				if (i_14_ == 6)
					i_18_++;
				if (i_14_ == 7) {
					i_18_++;
					i_17_++;
				}
				Class306.aClass376Array2562[playerIndex].anInt3176 = (i_17_ << 14) + (i_16_ << 28) - -i_18_;
				return false;
			}
			int i_19_ = class98_sub22_sub1.readBits((byte) -63, 18);
			int i_20_ = i_19_ >> 16;
			int i_21_ = (0xffe5 & i_19_) >> 8;
			int i_22_ = 0xff & i_19_;
			int i_24_ = i_20_;
			int i_25_ = i_21_;
			int i_26_ = i_22_;
			Class306.aClass376Array2562[playerIndex].anInt3176 = (i_25_ << 14) + ((i_24_ << 28) + i_26_);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vh.A(" + i + ',' + playerIndex + ',' + (class98_sub22_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void shiftClickTele(int i, int i_27_, int i_28_, int i_29_) {
		try {
			String string = ("tele " + i_28_ + "," + (i_27_ >> 6) + "," + (i >> 6) + "," + (i_27_ & 0x3f) + "," + (i & 0x3f));
			DebugConsole.handleCommand(string, false, true, (byte) 117);
			int i_30_ = 67 / ((-9 - i_29_) / 38);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vh.C(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ')'));
		}
	}

	static final boolean method3847(int i) {
		try {
			Hashtable hashtable = new Hashtable();
			Enumeration enumeration = Class10.aHashtable118.keys();
			while (enumeration.hasMoreElements()) {
				Object object = enumeration.nextElement();
				hashtable.put(object, Class10.aHashtable118.get(object));
			}
			try {
				Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
				Class var_class_31_ = Class.forName("java.lang.ClassLoader");
				Field field = var_class_31_.getDeclaredField("nativeLibraries");
				Method method = var_class.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				method.invoke(field, new Object[] { Boolean.TRUE });
				try {
					int i_32_ = -73 % ((i - -50) / 35);
					enumeration = Class10.aHashtable118.keys();
					while (enumeration.hasMoreElements()) {
						String string = (String) enumeration.nextElement();
						try {
							File file = (File) Class124.aHashtable1015.get(string);
							Class var_class_33_ = (Class) Class10.aHashtable118.get(string);
							Vector vector = ((Vector) field.get(var_class_33_.getClassLoader()));
							for (int i_34_ = 0; (vector.size() > i_34_); i_34_++) {
								try {
									Object object = vector.elementAt(i_34_);
									Field field_35_ = object.getClass().getDeclaredField("name");
									method.invoke(field_35_, (new Object[] { Boolean.TRUE }));
									try {
										String string_36_ = (String) field_35_.get(object);
										if (string_36_ != null && (string_36_.equalsIgnoreCase(file.getCanonicalPath()))) {
											Field field_37_ = (object.getClass().getDeclaredField("handle"));
											Method method_38_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
											method.invoke(field_37_, (new Object[] { Boolean.TRUE }));
											method.invoke(method_38_, (new Object[] { Boolean.TRUE }));
											try {
												method_38_.invoke(object, (new Object[0]));
												field_37_.set(object, new Integer(0));
												hashtable.remove(string);
											} catch (Throwable throwable) {
												/* empty */
											}
											method.invoke(method_38_, (new Object[] { Boolean.FALSE }));
											method.invoke(field_37_, (new Object[] { Boolean.FALSE }));
										}
									} catch (Throwable throwable) {
										/* empty */
									}
									method.invoke(field_35_, (new Object[] { Boolean.FALSE }));
								} catch (Throwable throwable) {
									/* empty */
								}
							}
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				} catch (Throwable throwable) {
					/* empty */
				}
				method.invoke(field, new Object[] { Boolean.FALSE });
			} catch (Throwable throwable) {
				/* empty */
			}
			Class10.aHashtable118 = hashtable;
			return Class10.aHashtable118.isEmpty();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vh.E(" + i + ')');
		}
	}

	public static void method3848(byte i) {
		do {
			try {
				anIntArray2923 = null;
				aClass85_2921 = null;
				aClass98_Sub46_Sub16Array2924 = null;
				if (i == -47)
					break;
				anIntArray2923 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vh.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3849(int i, int i_39_, int i_40_, int i_41_, int i_42_) {
		try {
			if (i_39_ != -8)
				shiftClickTele(76, 117, 69, 21);
			for (int i_43_ = 0; Class69_Sub2.anInt5335 > i_43_; i_43_++) {
				Rectangle rectangle = Class98_Sub35.aRectangleArray4144[i_43_];
				if (rectangle.width + rectangle.x > i_40_ && i_40_ + i_41_ > rectangle.x && rectangle.y + rectangle.height > i_42_ && i_42_ + i > rectangle.y)
					Class98_Sub10_Sub20.aBooleanArray5639[i_43_] = true;
			}
			Class93_Sub1_Sub1.method908(i_42_ + i, i_42_, false, i_40_, i_41_ + i_40_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vh.B(" + i + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ')'));
		}
	}

	static {
		aClass85_2921 = new Class85(9, 7);
		aClass98_Sub46_Sub16Array2924 = new Class98_Sub46_Sub16[14];
	}
}
