/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Collision {
	static int anInt1852;
	int[][] flags;
	int anInt1854;
	int anInt1855;
	int flagArrayLengthY;
	int flagArrayLengthX;

	final boolean method2936(int radiusX, int targetY, int radiusY, int i_2_, int checkY, int targetX, int i_5_, int checkX, int i_7_, int objectFlag) {
		try {
			if (i_2_ != -1)
				method2949(33, false, 107, -45, 14, true, -5);
			int i_9_ = i_5_ + checkX;
			int i_10_ = checkY - -i_7_;
			int i_11_ = targetX + radiusX;
			int i_12_ = radiusY - -targetY;
			if (i_11_ != checkX || (objectFlag & 0x2) != 0) {
				if (i_9_ != radiusX || (objectFlag & 0x8) != 0) {
					if (checkY == i_12_ && (0x1 & objectFlag) == 0) {
						int i_13_ = (radiusX < checkX ? checkX : radiusX);
						for (int i_14_ = i_11_ > i_9_ ? i_9_ : i_11_; i_13_ < i_14_; i_13_++) {
							if (((this.flags[-this.anInt1854 + i_13_][-this.anInt1855 + i_12_ + -1]) & 0x2) == 0)
								return true;
						}
					} else if (i_10_ == radiusY && (0x4 & objectFlag) == 0) {
						int i_15_ = (checkX <= radiusX ? radiusX : checkX);
						for (int i_16_ = (i_9_ >= i_11_ ? i_11_ : i_9_); i_16_ > i_15_; i_15_++) {
							if ((0x20 & (this.flags[i_15_ + -this.anInt1854][-this.anInt1855 + radiusY])) == 0)
								return true;
						}
					}
				} else {
					int i_17_ = checkY <= radiusY ? radiusY : checkY;
					for (int i_18_ = i_10_ < i_12_ ? i_10_ : i_12_; i_17_ < i_18_; i_17_++) {
						if ((0x80 & (this.flags[radiusX + -this.anInt1854][i_17_ + -this.anInt1855])) == 0)
							return true;
					}
				}
			} else {
				int i_19_ = checkY > radiusY ? checkY : radiusY;
				for (int i_20_ = (i_10_ < i_12_ ? i_10_ : i_12_); i_19_ < i_20_; i_19_++) {
					if ((0x8 & (this.flags[-this.anInt1854 + -1 + i_11_][i_19_ + -this.anInt1855])) == 0)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.C(" + radiusX + ',' + targetY + ',' + radiusY + ',' + i_2_ + ',' + checkY + ',' + targetX + ',' + i_5_ + ',' + checkX + ',' + i_7_ + ',' + objectFlag + ')'));
		}
	}

	final void applyObjectCollision(int i, boolean bool, byte i_21_, boolean bool_22_, int i_23_, int i_24_, int i_25_) {//IMPORTANT
		do {
			try {
				int i_26_ = -67 / ((i_21_ - -41) / 59);
				i_25_ -= this.anInt1855;
				i_23_ -= this.anInt1854;
				if (i == 0) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 128, 33);
						method2940(-1 + i_23_, i_25_, 8, 91);
					}
					if (i_24_ == 1) {
						method2940(i_23_, i_25_, 2, 52);
						method2940(i_23_, 1 + i_25_, 32, 60);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 8, 104);
						method2940(i_23_ + 1, i_25_, 128, 39);
					}
					if (i_24_ == 3) {
						method2940(i_23_, i_25_, 32, 83);
						method2940(i_23_, -1 + i_25_, 2, 126);
					}
				}
				if (i == 1 || i == 3) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 1, 84);
						method2940(i_23_ - 1, 1 + i_25_, 16, 80);
					}
					if (i_24_ == 1) {
						method2940(i_23_, i_25_, 4, 118);
						method2940(1 + i_23_, 1 + i_25_, 64, 75);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 16, 60);
						method2940(i_23_ - -1, -1 + i_25_, 1, 125);
					}
					if (i_24_ == 3) {
						method2940(i_23_, i_25_, 64, 86);
						method2940(i_23_ - 1, i_25_ - 1, 4, 67);
					}
				}
				if (i == 2) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 130, 109);
						method2940(i_23_ + -1, i_25_, 8, 105);
						method2940(i_23_, i_25_ + 1, 32, 83);
					}
					if (i_24_ == 1) {
						method2940(i_23_, i_25_, 10, 42);
						method2940(i_23_, i_25_ - -1, 32, 112);
						method2940(1 + i_23_, i_25_, 128, 34);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 40, 78);
						method2940(i_23_ + 1, i_25_, 128, 99);
						method2940(i_23_, -1 + i_25_, 2, 30);
					}
					if (i_24_ == 3) {
						method2940(i_23_, i_25_, 160, 66);
						method2940(i_23_, -1 + i_25_, 2, 30);
						method2940(-1 + i_23_, i_25_, 8, 86);
					}
				}
				if (bool) {
					if (i == 0) {
						if (i_24_ == 0) {
							method2940(i_23_, i_25_, 65536, 76);
							method2940(-1 + i_23_, i_25_, 4096, 41);
						}
						if (i_24_ == 1) {
							method2940(i_23_, i_25_, 1024, 94);
							method2940(i_23_, i_25_ - -1, 16384, 29);
						}
						if (i_24_ == 2) {
							method2940(i_23_, i_25_, 4096, 50);
							method2940(1 + i_23_, i_25_, 65536, 118);
						}
						if (i_24_ == 3) {
							method2940(i_23_, i_25_, 16384, 41);
							method2940(i_23_, -1 + i_25_, 1024, 69);
						}
					}
					if (i == 1 || i == 3) {
						if (i_24_ == 0) {
							method2940(i_23_, i_25_, 512, 34);
							method2940(i_23_ + -1, i_25_ - -1, 8192, 98);
						}
						if (i_24_ == 1) {
							method2940(i_23_, i_25_, 2048, 76);
							method2940(i_23_ - -1, i_25_ + 1, 32768, 60);
						}
						if (i_24_ == 2) {
							method2940(i_23_, i_25_, 8192, 100);
							method2940(1 + i_23_, -1 + i_25_, 512, 31);
						}
						if (i_24_ == 3) {
							method2940(i_23_, i_25_, 32768, 92);
							method2940(i_23_ - 1, -1 + i_25_, 2048, 111);
						}
					}
					if (i == 2) {
						if (i_24_ == 0) {
							method2940(i_23_, i_25_, 66560, 88);
							method2940(-1 + i_23_, i_25_, 4096, 99);
							method2940(i_23_, 1 + i_25_, 16384, 101);
						}
						if (i_24_ == 1) {
							method2940(i_23_, i_25_, 5120, 92);
							method2940(i_23_, i_25_ + 1, 16384, 54);
							method2940(i_23_ - -1, i_25_, 65536, 113);
						}
						if (i_24_ == 2) {
							method2940(i_23_, i_25_, 20480, 93);
							method2940(1 + i_23_, i_25_, 65536, 115);
							method2940(i_23_, -1 + i_25_, 1024, 34);
						}
						if (i_24_ == 3) {
							method2940(i_23_, i_25_, 81920, 37);
							method2940(i_23_, -1 + i_25_, 1024, 112);
							method2940(i_23_ + -1, i_25_, 4096, 34);
						}
					}
				}
				if (!bool_22_)
					break;
				if (i == 0) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 536870912, 71);
						method2940(-1 + i_23_, i_25_, 33554432, 86);
					}
					if (i_24_ == 1) {
						method2940(i_23_, i_25_, 8388608, 99);
						method2940(i_23_, 1 + i_25_, 134217728, 89);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 33554432, 91);
						method2940(1 + i_23_, i_25_, 536870912, 55);
					}
					if (i_24_ == 3) {
						method2940(i_23_, i_25_, 134217728, 82);
						method2940(i_23_, -1 + i_25_, 8388608, 117);
					}
				}
				if (i == 1 || i == 3) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 4194304, 78);
						method2940(i_23_ - 1, 1 + i_25_, 67108864, 106);
					}
					if (i_24_ == 1) {
						method2940(i_23_, i_25_, 16777216, 39);
						method2940(i_23_ + 1, i_25_ + 1, 268435456, 34);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 67108864, 31);
						method2940(i_23_ - -1, i_25_ - 1, 4194304, 65);
					}
					if (i_24_ == 3) {
						method2940(i_23_, i_25_, 268435456, 79);
						method2940(-1 + i_23_, -1 + i_25_, 16777216, 58);
					}
				}
				if (i != 2)
					break;
				if (i_24_ == 0) {
					method2940(i_23_, i_25_, 545259520, 79);
					method2940(i_23_ - 1, i_25_, 33554432, 51);
					method2940(i_23_, i_25_ - -1, 134217728, 53);
				}
				if (i_24_ == 1) {
					method2940(i_23_, i_25_, 41943040, 83);
					method2940(i_23_, i_25_ + 1, 134217728, 42);
					method2940(1 + i_23_, i_25_, 536870912, 39);
				}
				if (i_24_ == 2) {
					method2940(i_23_, i_25_, 167772160, 105);
					method2940(i_23_ + 1, i_25_, 536870912, 118);
					method2940(i_23_, -1 + i_25_, 8388608, 60);
				}
				if (i_24_ != 3)
					break;
				method2940(i_23_, i_25_, 671088640, 77);
				method2940(i_23_, -1 + i_25_, 8388608, 106);
				method2940(i_23_ - 1, i_25_, 33554432, 111);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pfa.O(" + i + ',' + bool + ',' + i_21_ + ',' + bool_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2938(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		try {
			if (i_32_ != 1) {
				if (i >= i_33_ && i <= i_33_ - -i_32_ - 1 && i_29_ <= i_29_ && i_32_ + i_29_ + -1 >= i_29_)
					return true;
			} else if (i_33_ == i && i_29_ == i_28_)
				return true;
			i_33_ -= this.anInt1854;
			i_28_ -= this.anInt1855;
			i_29_ -= this.anInt1855;
			if (i_31_ != 17761)
				method2946(39, (byte) -56, -52);
			i -= this.anInt1854;
			if (i_32_ == 1) {
				if (i_30_ == 6 || i_30_ == 7) {
					if (i_30_ == 7)
						i_27_ = 2 + i_27_ & 0x3;
					if (i_27_ != 0) {
						if (i_27_ == 1) {
							if (-1 + i == i_33_ && i_28_ == i_29_ && ((this.flags[i_33_][i_28_]) & 0x8) == 0)
								return true;
							if (i == i_33_ && i_28_ == i_29_ + -1 && (0x2 & (this.flags[i_33_][i_28_])) == 0)
								return true;
						} else if (i_27_ == 2) {
							if (i_33_ == -1 + i && i_29_ == i_28_ && (0x8 & (this.flags[i_33_][i_28_])) == 0)
								return true;
							if (i_33_ == i && 1 + i_29_ == i_28_ && (0x20 & (this.flags[i_33_][i_28_])) == 0)
								return true;
						} else if (i_27_ == 3) {
							if (i - -1 == i_33_ && i_29_ == i_28_ && (0x80 & (this.flags[i_33_][i_28_])) == 0)
								return true;
							if (i_33_ == i && i_28_ == 1 + i_29_ && (0x20 & (this.flags[i_33_][i_28_])) == 0)
								return true;
						}
					} else {
						if (1 + i == i_33_ && i_28_ == i_29_ && (0x80 & (this.flags[i_33_][i_28_])) == 0)
							return true;
						if (i == i_33_ && -1 + i_29_ == i_28_ && (0x2 & (this.flags[i_33_][i_28_])) == 0)
							return true;
					}
				}
				if (i_30_ == 8) {
					if (i_33_ == i && 1 + i_29_ == i_28_ && (this.flags[i_33_][i_28_] & 0x20) == 0)
						return true;
					if (i == i_33_ && i_28_ == i_29_ - 1 && (this.flags[i_33_][i_28_] & 0x2) == 0)
						return true;
					if (i_33_ == -1 + i && i_28_ == i_29_ && (0x8 & (this.flags[i_33_][i_28_])) == 0)
						return true;
					if (1 + i == i_33_ && i_28_ == i_29_ && (0x80 & (this.flags[i_33_][i_28_])) == 0)
						return true;
				}
			} else {
				int i_34_ = -1 + i_32_ + i_33_;
				int i_35_ = i_32_ + (i_28_ - 1);
				if (i_30_ == 6 || i_30_ == 7) {
					if (i_30_ == 7)
						i_27_ = i_27_ + 2 & 0x3;
					if (i_27_ == 0) {
						if (i_33_ == 1 + i && i_29_ >= i_28_ && i_35_ >= i_29_ && (0x80 & (this.flags[i_33_][i_29_])) == 0)
							return true;
						if (i_33_ <= i && i <= i_34_ && i_29_ + -i_32_ == i_28_ && (this.flags[i][i_35_] & 0x2) == 0)
							return true;
					} else if (i_27_ == 1) {
						if (-i_32_ + i == i_33_ && i_29_ >= i_28_ && i_29_ <= i_35_ && (0x8 & (this.flags[i_34_][i_29_])) == 0)
							return true;
						if (i_33_ <= i && i <= i_34_ && i_28_ == i_29_ - i_32_ && (0x2 & (this.flags[i][i_35_])) == 0)
							return true;
					} else if (i_27_ != 2) {
						if (i_27_ == 3) {
							if (1 + i == i_33_ && i_28_ <= i_29_ && i_35_ >= i_29_ && (0x80 & (this.flags[i_33_][i_29_])) == 0)
								return true;
							if (i >= i_33_ && i <= i_34_ && 1 + i_29_ == i_28_ && ((0x20 & (this.flags[i][i_28_])) == 0))
								return true;
						}
					} else {
						if (i_33_ == -i_32_ + i && i_29_ >= i_28_ && i_35_ >= i_29_ && ((this.flags[i_34_][i_29_]) & 0x8) == 0)
							return true;
						if (i_33_ <= i && i_34_ >= i && i_29_ + 1 == i_28_ && (0x20 & (this.flags[i][i_28_])) == 0)
							return true;
					}
				}
				if (i_30_ == 8) {
					if (i_33_ <= i && i_34_ >= i && i_28_ == 1 + i_29_ && (this.flags[i][i_28_] & 0x20) == 0)
						return true;
					if (i >= i_33_ && i_34_ >= i && i_29_ - i_32_ == i_28_ && (this.flags[i][i_35_] & 0x2) == 0)
						return true;
					if (i_33_ == -i_32_ + i && i_28_ <= i_29_ && i_29_ <= i_35_ && (this.flags[i_34_][i_29_] & 0x8) == 0)
						return true;
					if (i - -1 == i_33_ && i_29_ >= i_28_ && i_35_ >= i_29_ && (this.flags[i_33_][i_29_] & 0x80) == 0)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.B(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ')'));
		}
	}

	final boolean method2939(int tagetX, int radiusX, int checkY, int i_38_, int i_39_, int radiusY, int objectFlag, int checkX, int targetY) {
		try {
			if (i_39_ > 1) {
				if (Class98_Sub5.method960(radiusX, tagetX, -126, checkY, targetY, checkX, radiusY, i_39_, i_39_))
					return true;
				return method2936(radiusX, targetY, radiusY, -1, checkY, tagetX, i_39_, checkX, i_39_, objectFlag);
			}
			int i_44_ = radiusX - -tagetX + -1;
			int i_45_ = -1 + radiusY - -targetY;
			if (checkX >= radiusX && i_44_ >= checkX && checkY >= radiusY && i_45_ >= checkY)
				return true;
			if (radiusX - 1 == checkX && radiusY <= checkY && checkY <= i_45_ && (0x8 & (this.flags[-this.anInt1854 + checkX][checkY - this.anInt1855])) == 0 && (objectFlag & 0x8) == 0)
				return true;
			if (checkX == 1 + i_44_ && checkY >= radiusY && checkY <= i_45_ && ((this.flags[-this.anInt1854 + checkX][-this.anInt1855 + checkY]) & 0x80) == 0 && (0x2 & objectFlag) == 0)
				return true;
			if (radiusY + -1 == checkY && radiusX <= checkX && i_44_ >= checkX && (0x2 & (this.flags[checkX - this.anInt1854][checkY + -this.anInt1855])) == 0 && (objectFlag & 0x4) == 0)
				return true;
			if (i_38_ != 14672)
				return false;
			if (1 + i_45_ == checkY && checkX >= radiusX && i_44_ >= checkX && (0x20 & (this.flags[-this.anInt1854 + checkX][-this.anInt1855 + checkY])) == 0 && (0x1 & objectFlag) == 0)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.P(" + tagetX + ',' + radiusX + ',' + checkY + ',' + i_38_ + ',' + i_39_ + ',' + radiusY + ',' + objectFlag + ',' + checkX + ',' + targetY + ')'));
		}
	}

	private final void method2940(int i, int i_46_, int i_47_, int i_48_) {
		try {
			if (i_48_ <= 28)
				method2938(30, 97, -75, -102, 18, -47, -86, 19);
			this.flags[i][i_46_] = Class202.method2702((this.flags[i][i_46_]), ~i_47_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.N(" + i + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ')'));
		}
	}

	final void method2941(int i, int i_49_, int i_50_) {
		try {
			i_50_ -= this.anInt1854;
			i -= this.anInt1855;
			if (i_49_ != 23254)
				method2945(-47, true, false, 44, -19, -64, (byte) -46);
			this.flags[i_50_][i] = Class41.method366((this.flags[i_50_][i]), 2097152);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.D(" + i + ',' + i_49_ + ',' + i_50_ + ')'));
		}
	}

	static final void method2942(int i) {
		try {
			synchronized (Class211.aClass79_1594) {
				Class211.aClass79_1594.method806((byte) 29);
				if (i != 1)
					anInt1852 = 11;
			}
			synchronized (PlayerUpdate.aClass79_3411) {
				PlayerUpdate.aClass79_3411.method806((byte) 80);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pfa.A(" + i + ')');
		}
	}

	static final void method2943(float[] fs, int i, int i_51_, int i_52_, float[] fs_53_, int i_54_, int i_55_, float f, int i_56_, int i_57_, int i_58_) {
		try {
			if (i_58_ < 101)
				anInt1852 = 104;
			i_54_ -= i_52_;
			i -= i_55_;
			i_56_ -= i_57_;
			float f_59_ = ((float) i * fs_53_[1] + fs_53_[0] * (float) i_56_ + (float) i_54_ * fs_53_[2]);
			float f_60_ = ((float) i_54_ * fs_53_[5] + (fs_53_[3] * (float) i_56_ + fs_53_[4] * (float) i));
			float f_61_ = ((float) i_56_ * fs_53_[6] + fs_53_[7] * (float) i + fs_53_[8] * (float) i_54_);
			float f_62_ = (float) Math.sqrt(f_60_ * f_60_ + f_59_ * f_59_ + f_61_ * f_61_);
			float f_63_ = (((float) Math.atan2(f_59_, f_61_) / 6.2831855F) + 0.5F);
			float f_64_ = (0.5F + (float) Math.asin(f_60_ / f_62_) / 3.1415927F + f);
			if (i_51_ == 1) {
				float f_65_ = f_63_;
				f_63_ = -f_64_;
				f_64_ = f_65_;
			} else if (i_51_ == 2) {
				f_63_ = -f_63_;
				f_64_ = -f_64_;
			} else if (i_51_ == 3) {
				float f_66_ = f_63_;
				f_63_ = f_64_;
				f_64_ = -f_66_;
			}
			fs[0] = f_63_;
			fs[1] = f_64_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.E(" + (fs != null ? "{...}" : "null") + ',' + i + ',' + i_51_ + ',' + i_52_ + ',' + (fs_53_ != null ? "{...}" : "null") + ',' + i_54_ + ',' + i_55_ + ',' + f + ',' + i_56_ + ',' + i_57_ + ',' + i_58_ + ')'));
		}
	}

	final void method2944(int i, int i_67_, int i_68_) {
		try {
			i -= this.anInt1855;
			if (i_67_ >= 28) {
				i_68_ -= this.anInt1854;
				this.flags[i_68_][i] = Class202.method2702((this.flags[i_68_][i]), -2097153);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.H(" + i + ',' + i_67_ + ',' + i_68_ + ')'));
		}
	}

	final void method2945(int i, boolean bool, boolean bool_69_, int i_70_, int i_71_, int i_72_, byte i_73_) {//IMPORTANT
		do {
			try {
				i -= this.anInt1855;
				if (i_73_ < 63)
					this.flagArrayLengthX = 59;
				i_71_ -= this.anInt1854;
				if (i_72_ == 0) {
					if (i_70_ == 0) {
						method2947(i_71_, 128, (byte) -25, i);
						method2947(-1 + i_71_, 8, (byte) -23, i);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 2, (byte) -96, i);
						method2947(i_71_, 32, (byte) -89, 1 + i);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 8, (byte) -54, i);
						method2947(1 + i_71_, 128, (byte) -114, i);
					}
					if (i_70_ == 3) {
						method2947(i_71_, 32, (byte) -104, i);
						method2947(i_71_, 2, (byte) -20, i + -1);
					}
				}
				if (i_72_ == 1 || i_72_ == 3) {
					if (i_70_ == 0) {
						method2947(i_71_, 1, (byte) -119, i);
						method2947(i_71_ - 1, 16, (byte) -68, 1 + i);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 4, (byte) -99, i);
						method2947(i_71_ - -1, 64, (byte) -45, i - -1);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 16, (byte) -49, i);
						method2947(i_71_ + 1, 1, (byte) -73, i - 1);
					}
					if (i_70_ == 3) {
						method2947(i_71_, 64, (byte) -53, i);
						method2947(-1 + i_71_, 4, (byte) -82, -1 + i);
					}
				}
				if (i_72_ == 2) {
					if (i_70_ == 0) {
						method2947(i_71_, 130, (byte) -52, i);
						method2947(-1 + i_71_, 8, (byte) -33, i);
						method2947(i_71_, 32, (byte) -26, i + 1);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 10, (byte) -53, i);
						method2947(i_71_, 32, (byte) -112, i + 1);
						method2947(1 + i_71_, 128, (byte) -71, i);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 40, (byte) -72, i);
						method2947(1 + i_71_, 128, (byte) -113, i);
						method2947(i_71_, 2, (byte) -111, -1 + i);
					}
					if (i_70_ == 3) {
						method2947(i_71_, 160, (byte) -90, i);
						method2947(i_71_, 2, (byte) -45, -1 + i);
						method2947(-1 + i_71_, 8, (byte) -95, i);
					}
				}
				if (bool) {
					if (i_72_ == 0) {
						if (i_70_ == 0) {
							method2947(i_71_, 65536, (byte) -30, i);
							method2947(i_71_ + -1, 4096, (byte) -126, i);
						}
						if (i_70_ == 1) {
							method2947(i_71_, 1024, (byte) -102, i);
							method2947(i_71_, 16384, (byte) -92, 1 + i);
						}
						if (i_70_ == 2) {
							method2947(i_71_, 4096, (byte) -105, i);
							method2947(i_71_ + 1, 65536, (byte) -39, i);
						}
						if (i_70_ == 3) {
							method2947(i_71_, 16384, (byte) -111, i);
							method2947(i_71_, 1024, (byte) -106, i + -1);
						}
					}
					if (i_72_ == 1 || i_72_ == 3) {
						if (i_70_ == 0) {
							method2947(i_71_, 512, (byte) -128, i);
							method2947(i_71_ - 1, 8192, (byte) -60, 1 + i);
						}
						if (i_70_ == 1) {
							method2947(i_71_, 2048, (byte) -78, i);
							method2947(i_71_ - -1, 32768, (byte) -81, i - -1);
						}
						if (i_70_ == 2) {
							method2947(i_71_, 8192, (byte) -50, i);
							method2947(1 + i_71_, 512, (byte) -92, -1 + i);
						}
						if (i_70_ == 3) {
							method2947(i_71_, 32768, (byte) -85, i);
							method2947(-1 + i_71_, 2048, (byte) -27, i - 1);
						}
					}
					if (i_72_ == 2) {
						if (i_70_ == 0) {
							method2947(i_71_, 66560, (byte) -49, i);
							method2947(-1 + i_71_, 4096, (byte) -27, i);
							method2947(i_71_, 16384, (byte) -72, 1 + i);
						}
						if (i_70_ == 1) {
							method2947(i_71_, 5120, (byte) -83, i);
							method2947(i_71_, 16384, (byte) -95, 1 + i);
							method2947(i_71_ - -1, 65536, (byte) -110, i);
						}
						if (i_70_ == 2) {
							method2947(i_71_, 20480, (byte) -72, i);
							method2947(i_71_ - -1, 65536, (byte) -36, i);
							method2947(i_71_, 1024, (byte) -27, i - 1);
						}
						if (i_70_ == 3) {
							method2947(i_71_, 81920, (byte) -26, i);
							method2947(i_71_, 1024, (byte) -112, i + -1);
							method2947(i_71_ - 1, 4096, (byte) -108, i);
						}
					}
				}
				if (!bool_69_)
					break;
				if (i_72_ == 0) {
					if (i_70_ == 0) {
						method2947(i_71_, 536870912, (byte) -67, i);
						method2947(i_71_ - 1, 33554432, (byte) -84, i);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 8388608, (byte) -24, i);
						method2947(i_71_, 134217728, (byte) -107, i + 1);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 33554432, (byte) -86, i);
						method2947(1 + i_71_, 536870912, (byte) -24, i);
					}
					if (i_70_ == 3) {
						method2947(i_71_, 134217728, (byte) -46, i);
						method2947(i_71_, 8388608, (byte) -47, i + -1);
					}
				}
				if (i_72_ == 1 || i_72_ == 3) {
					if (i_70_ == 0) {
						method2947(i_71_, 4194304, (byte) -50, i);
						method2947(-1 + i_71_, 67108864, (byte) -123, 1 + i);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 16777216, (byte) -39, i);
						method2947(1 + i_71_, 268435456, (byte) -103, 1 + i);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 67108864, (byte) -41, i);
						method2947(i_71_ - -1, 4194304, (byte) -34, i + -1);
					}
					if (i_70_ == 3) {
						method2947(i_71_, 268435456, (byte) -33, i);
						method2947(i_71_ - 1, 16777216, (byte) -79, -1 + i);
					}
				}
				if (i_72_ != 2)
					break;
				if (i_70_ == 0) {
					method2947(i_71_, 545259520, (byte) -70, i);
					method2947(-1 + i_71_, 33554432, (byte) -66, i);
					method2947(i_71_, 134217728, (byte) -36, 1 + i);
				}
				if (i_70_ == 1) {
					method2947(i_71_, 41943040, (byte) -29, i);
					method2947(i_71_, 134217728, (byte) -96, 1 + i);
					method2947(1 + i_71_, 536870912, (byte) -72, i);
				}
				if (i_70_ == 2) {
					method2947(i_71_, 167772160, (byte) -112, i);
					method2947(i_71_ + 1, 536870912, (byte) -93, i);
					method2947(i_71_, 8388608, (byte) -114, i - 1);
				}
				if (i_70_ != 3)
					break;
				method2947(i_71_, 671088640, (byte) -66, i);
				method2947(i_71_, 8388608, (byte) -124, i + -1);
				method2947(-1 + i_71_, 33554432, (byte) -117, i);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pfa.K(" + i + ',' + bool + ',' + bool_69_ + ',' + i_70_ + ',' + i_71_ + ',' + i_72_ + ',' + i_73_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2946(int i, byte i_74_, int i_75_) {
		try {
			i_75_ -= this.anInt1855;
			if (i_74_ != -14)
				method2944(92, -7, 34);
			i -= this.anInt1854;
			this.flags[i][i_75_] = Class41.method366((this.flags[i][i_75_]), 262144);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.I(" + i + ',' + i_74_ + ',' + i_75_ + ')'));
		}
	}

	private final void method2947(int i, int i_76_, byte i_77_, int i_78_) {
		try {
			if (i_77_ >= -17)
				method2944(105, 35, 75);
			this.flags[i][i_78_] = Class41.method366((this.flags[i][i_78_]), i_76_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.G(" + i + ',' + i_76_ + ',' + i_77_ + ',' + i_78_ + ')'));
		}
	}

	final void method2948(boolean bool, int i, int i_79_) {
		try {
			i_79_ -= this.anInt1855;
			i -= this.anInt1854;
			if (bool != false)
				method2945(0, false, false, 89, 74, -95, (byte) -85);
			this.flags[i][i_79_] = Class202.method2702((this.flags[i][i_79_]), -262145);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.M(" + bool + ',' + i + ',' + i_79_ + ')'));
		}
	}

	final void method2949(int i, boolean bool, int i_80_, int i_81_, int i_82_, boolean bool_83_, int i_84_) {//IMPORTANT
		try {
			int i_85_ = 256;
			if (bool_83_)
				i_85_ |= 0x20000;
			i_80_ -= this.anInt1854;
			if (i != 0)
				method2946(-43, (byte) 16, 91);
			if (bool)
				i_85_ |= 0x40000000;
			i_84_ -= this.anInt1855;
			for (int i_86_ = i_80_; i_80_ - -i_82_ > i_86_; i_86_++) {
				if (i_86_ >= 0 && this.flagArrayLengthX > i_86_) {
					for (int i_87_ = i_84_; i_84_ - -i_81_ > i_87_; i_87_++) {
						if (i_87_ >= 0 && i_87_ < this.flagArrayLengthY)
							method2947(i_86_, i_85_, (byte) -51, i_87_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.L(" + i + ',' + bool + ',' + i_80_ + ',' + i_81_ + ',' + i_82_ + ',' + bool_83_ + ',' + i_84_ + ')'));
		}
	}

	final void method2950(byte i) {
		try {
			int i_88_ = 0;
			if (i == -99) {
				for (/**/; (i_88_ < this.flagArrayLengthX); i_88_++) {
					for (int i_89_ = 0; i_89_ < this.flagArrayLengthY; i_89_++) {
						if (i_88_ != 0 && i_89_ != 0 && i_88_ < this.flagArrayLengthX - 5 && (this.flagArrayLengthY + -5 > i_89_))
							this.flags[i_88_][i_89_] = 2097152;
						else
							this.flags[i_88_][i_89_] = -1;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pfa.Q(" + i + ')');
		}
	}

	final void method2951(int i, boolean bool, int i_90_, int i_91_, int i_92_, boolean bool_93_, int i_94_, int i_95_) {
		do {
			try {
				int i_96_ = 256;
				if (bool)
					i_96_ |= 0x20000;
				if (bool_93_)
					i_96_ |= 0x40000000;
				if (i_90_ == 1 || i_90_ == 3) {
					int i_97_ = i;
					i = i_91_;
					i_91_ = i_97_;
				}
				i_92_ -= this.anInt1855;
				i_95_ -= this.anInt1854;
				for (int i_98_ = i_95_; i_98_ < i + i_95_; i_98_++) {
					if (i_98_ >= 0 && this.flagArrayLengthX > i_98_) {
						for (int i_99_ = i_92_; (i_92_ + i_91_ > i_99_); i_99_++) {
							if (i_99_ >= 0 && (i_99_ < this.flagArrayLengthY))
								method2940(i_98_, i_99_, i_96_, 75);
						}
					}
				}
				if (i_94_ == 131072)
					break;
				method2938(-71, -69, -92, -110, 104, -115, 29, -10);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pfa.J(" + i + ',' + bool + ',' + i_90_ + ',' + i_91_ + ',' + i_92_ + ',' + bool_93_ + ',' + i_94_ + ',' + i_95_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2952(int i, int i_100_, byte i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_) {
		try {
			if (i_102_ != 1) {
				if (i_100_ <= i_105_ && i_105_ <= -1 + (i_100_ + i_102_) && i <= i && i_102_ + i - 1 >= i)
					return true;
			} else if (i_100_ == i_105_ && i == i_103_)
				return true;
			i_103_ -= this.anInt1855;
			int i_107_ = -104 / ((i_101_ - 45) / 41);
			i_100_ -= this.anInt1854;
			i -= this.anInt1855;
			i_105_ -= this.anInt1854;
			if (i_102_ != 1) {
				int i_108_ = i_100_ - -i_102_ - 1;
				int i_109_ = -1 + i_102_ + i_103_;
				if (i_106_ == 0) {
					if (i_104_ == 0) {
						if (i_105_ + -i_102_ == i_100_ && i_103_ <= i && i <= i_109_)
							return true;
						if (i_105_ >= i_100_ && i_105_ <= i_108_ && i + 1 == i_103_ && ((this.flags[i_105_][i_103_]) & 0x2c0120) == 0)
							return true;
						if (i_100_ <= i_105_ && i_108_ >= i_105_ && i_103_ == -i_102_ + i && ((this.flags[i_105_][i_109_]) & 0x2c0102) == 0)
							return true;
					} else if (i_104_ == 1) {
						if (i_100_ <= i_105_ && i_105_ <= i_108_ && i_103_ == 1 + i)
							return true;
						if (i_105_ + -i_102_ == i_100_ && i_103_ <= i && i <= i_109_ && ((this.flags[i_108_][i]) & 0x2c0108) == 0)
							return true;
						if (i_105_ + 1 == i_100_ && i >= i_103_ && i_109_ >= i && ((this.flags[i_100_][i]) & 0x2c0180) == 0)
							return true;
					} else if (i_104_ != 2) {
						if (i_104_ == 3) {
							if (i_100_ <= i_105_ && i_108_ >= i_105_ && (i_103_ == -i_102_ + i))
								return true;
							if (-i_102_ + i_105_ == i_100_ && i_103_ <= i && i <= i_109_ && ((this.flags[i_108_][i]) & 0x2c0108) == 0)
								return true;
							if (i_105_ + 1 == i_100_ && i_103_ <= i && i_109_ >= i && ((this.flags[i_100_][i]) & 0x2c0180) == 0)
								return true;
						}
					} else {
						if (i_105_ + 1 == i_100_ && i >= i_103_ && i <= i_109_)
							return true;
						if (i_100_ <= i_105_ && i_105_ <= i_108_ && i - -1 == i_103_ && (0x2c0120 & (this.flags[i_105_][i_103_])) == 0)
							return true;
						if (i_100_ <= i_105_ && i_108_ >= i_105_ && i - i_102_ == i_103_ && (0x2c0102 & (this.flags[i_105_][i_109_])) == 0)
							return true;
					}
				}
				if (i_106_ == 2) {
					if (i_104_ != 0) {
						if (i_104_ == 1) {
							if (i_105_ + -i_102_ == i_100_ && i >= i_103_ && i_109_ >= i && (0x2c0108 & (this.flags[i_108_][i])) == 0)
								return true;
							if (i_100_ <= i_105_ && i_105_ <= i_108_ && 1 + i == i_103_)
								return true;
							if (i_100_ == 1 + i_105_ && i >= i_103_ && i <= i_109_)
								return true;
							if (i_100_ <= i_105_ && i_105_ <= i_108_ && i_103_ == i - i_102_ && (0x2c0102 & (this.flags[i_105_][i_109_])) == 0)
								return true;
						} else if (i_104_ == 2) {
							if (i_100_ == i_105_ - i_102_ && i >= i_103_ && i <= i_109_ && ((this.flags[i_108_][i]) & 0x2c0108) == 0)
								return true;
							if (i_105_ >= i_100_ && i_105_ <= i_108_ && i_103_ == i + 1 && ((this.flags[i_105_][i_103_]) & 0x2c0120) == 0)
								return true;
							if (1 + i_105_ == i_100_ && i_103_ <= i && i <= i_109_)
								return true;
							if (i_105_ >= i_100_ && i_108_ >= i_105_ && -i_102_ + i == i_103_)
								return true;
						} else if (i_104_ == 3) {
							if ((i_100_ == -i_102_ + i_105_) && i >= i_103_ && i <= i_109_)
								return true;
							if (i_105_ >= i_100_ && i_108_ >= i_105_ && i - -1 == i_103_ && (0x2c0120 & (this.flags[i_105_][i_103_])) == 0)
								return true;
							if (i_100_ == i_105_ + 1 && i >= i_103_ && i <= i_109_ && ((this.flags[i_100_][i]) & 0x2c0180) == 0)
								return true;
							if (i_105_ >= i_100_ && i_108_ >= i_105_ && -i_102_ + i == i_103_)
								return true;
						}
					} else {
						if (i_105_ + -i_102_ == i_100_ && i >= i_103_ && i_109_ >= i)
							return true;
						if (i_105_ >= i_100_ && i_108_ >= i_105_ && 1 + i == i_103_)
							return true;
						if (1 + i_105_ == i_100_ && i >= i_103_ && i <= i_109_ && ((this.flags[i_100_][i]) & 0x2c0180) == 0)
							return true;
						if (i_105_ >= i_100_ && i_108_ >= i_105_ && i_103_ == i + -i_102_ && (0x2c0102 & (this.flags[i_105_][i_109_])) == 0)
							return true;
					}
				}
				if (i_106_ == 9) {
					if (i_105_ >= i_100_ && i_108_ >= i_105_ && 1 + i == i_103_ && (0x2c0120 & (this.flags[i_105_][i_103_])) == 0)
						return true;
					if (i_105_ >= i_100_ && i_105_ <= i_108_ && i_103_ == i - i_102_ && ((this.flags[i_105_][i_109_]) & 0x2c0102) == 0)
						return true;
					if (i_100_ == i_105_ - i_102_ && i_103_ <= i && i_109_ >= i && (this.flags[i_108_][i] & 0x2c0108) == 0)
						return true;
					if (1 + i_105_ == i_100_ && i_103_ <= i && i <= i_109_ && (0x2c0180 & (this.flags[i_100_][i])) == 0)
						return true;
				}
			} else {
				if (i_106_ == 0) {
					if (i_104_ != 0) {
						if (i_104_ == 1) {
							if (i_105_ == i_100_ && 1 + i == i_103_)
								return true;
							if (i_105_ - 1 == i_100_ && i_103_ == i && ((this.flags[i_100_][i_103_]) & 0x2c0108) == 0)
								return true;
							if (i_105_ - -1 == i_100_ && i == i_103_ && ((this.flags[i_100_][i_103_]) & 0x2c0180) == 0)
								return true;
						} else if (i_104_ != 2) {
							if (i_104_ == 3) {
								if (i_100_ == i_105_ && -1 + i == i_103_)
									return true;
								if (i_105_ - 1 == i_100_ && i_103_ == i && ((this.flags[i_100_][i_103_]) & 0x2c0108) == 0)
									return true;
								if (i_105_ - -1 == i_100_ && i == i_103_ && ((this.flags[i_100_][i_103_]) & 0x2c0180) == 0)
									return true;
							}
						} else {
							if (i_100_ == 1 + i_105_ && i == i_103_)
								return true;
							if (i_105_ == i_100_ && 1 + i == i_103_ && (0x2c0120 & (this.flags[i_100_][i_103_])) == 0)
								return true;
							if (i_105_ == i_100_ && i + -1 == i_103_ && (0x2c0102 & (this.flags[i_100_][i_103_])) == 0)
								return true;
						}
					} else {
						if (i_100_ == i_105_ - 1 && i == i_103_)
							return true;
						if (i_100_ == i_105_ && i_103_ == 1 + i && (0x2c0120 & (this.flags[i_100_][i_103_])) == 0)
							return true;
						if (i_105_ == i_100_ && i_103_ == i - 1 && (0x2c0102 & (this.flags[i_100_][i_103_])) == 0)
							return true;
					}
				}
				if (i_106_ == 2) {
					if (i_104_ == 0) {
						if (i_100_ == -1 + i_105_ && i_103_ == i)
							return true;
						if (i_100_ == i_105_ && 1 + i == i_103_)
							return true;
						if (1 + i_105_ == i_100_ && i == i_103_ && ((this.flags[i_100_][i_103_]) & 0x2c0180) == 0)
							return true;
						if (i_105_ == i_100_ && -1 + i == i_103_ && (0x2c0102 & (this.flags[i_100_][i_103_])) == 0)
							return true;
					} else if (i_104_ != 1) {
						if (i_104_ == 2) {
							if (i_105_ - 1 == i_100_ && i_103_ == i && ((this.flags[i_100_][i_103_]) & 0x2c0108) == 0)
								return true;
							if (i_105_ == i_100_ && i + 1 == i_103_ && (0x2c0120 & (this.flags[i_100_][i_103_])) == 0)
								return true;
							if (i_105_ - -1 == i_100_ && i_103_ == i)
								return true;
							if (i_100_ == i_105_ && -1 + i == i_103_)
								return true;
						} else if (i_104_ == 3) {
							if (i_100_ == i_105_ + -1 && i == i_103_)
								return true;
							if (i_100_ == i_105_ && 1 + i == i_103_ && ((this.flags[i_100_][i_103_]) & 0x2c0120) == 0)
								return true;
							if (i_105_ + 1 == i_100_ && i_103_ == i && ((this.flags[i_100_][i_103_]) & 0x2c0180) == 0)
								return true;
							if (i_100_ == i_105_ && i_103_ == -1 + i)
								return true;
						}
					} else {
						if (i_105_ - 1 == i_100_ && i == i_103_ && ((this.flags[i_100_][i_103_]) & 0x2c0108) == 0)
							return true;
						if (i_100_ == i_105_ && i_103_ == 1 + i)
							return true;
						if (i_100_ == i_105_ + 1 && i == i_103_)
							return true;
						if (i_105_ == i_100_ && i_103_ == -1 + i && (0x2c0102 & (this.flags[i_100_][i_103_])) == 0)
							return true;
					}
				}
				if (i_106_ == 9) {
					if (i_105_ == i_100_ && i - -1 == i_103_ && ((this.flags[i_100_][i_103_]) & 0x20) == 0)
						return true;
					if (i_100_ == i_105_ && i + -1 == i_103_ && ((this.flags[i_100_][i_103_]) & 0x2) == 0)
						return true;
					if (-1 + i_105_ == i_100_ && i == i_103_ && ((this.flags[i_100_][i_103_]) & 0x8) == 0)
						return true;
					if (1 + i_105_ == i_100_ && i_103_ == i && (0x80 & (this.flags[i_100_][i_103_])) == 0)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pfa.F(" + i + ',' + i_100_ + ',' + i_101_ + ',' + i_102_ + ',' + i_103_ + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ')'));
		}
	}
}
