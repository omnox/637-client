
/* Class98_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

class RSByteBuffer extends Node {

	int position;
	byte[] data;
	static int currentViewDistanceIndex = -1;
	static RuneScapeCache aClass207_3995;

	final void method1181(String string, int i) {
		try {
			int i_0_ = string.indexOf('\0');
			if ((~i_0_) <= i)
				throw new IllegalArgumentException("NUL character at " + i_0_ + " - cannot pjstr2");
			this.data[this.position++] = (byte) 0;
			this.position += Class200.method2694(string, 0, string.length(), this.position, this.data, -28439);
			this.data[this.position++] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.GB(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void writeShortA(int i, byte i_1_) {
		try {
			this.data[this.position++] = (byte) (i >> 8);
			if (i_1_ != 126)
				writeLEInt(75, -5);
			this.data[this.position++] = (byte) (128 + i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.RA(" + i + ',' + i_1_ + ')');
		}
	}

	final int method1183(int i) {
		try {
			this.position += 2;
			int i_2_ = (((this.data[-2 + this.position]) & 0xff) + ((this.data[this.position - 1]) << 8 & 0xff00));
			if (i_2_ > 32767)
				i_2_ -= 65536;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.KC(" + i + ')');
		}
	}

	final byte method1184(int i) {
		try {
			return (byte) ((this.data[this.position++]) - 128);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.GA(" + i + ')');
		}
	}

	final void writeInt(int i, int i_3_) {
		try {
			this.data[this.position++] = (byte) (i_3_ >> 24);
			this.data[this.position++] = (byte) (i_3_ >> 16);
			this.data[this.position++] = (byte) (i_3_ >> 8);
			this.data[this.position++] = (byte) i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.FA(" + i + ',' + i_3_ + ')');
		}
	}

	final int readMedium(int i) {
		try {
			this.position += 3;
			return (((this.data[-1 + this.position]) & 0xff) + ((0xff & (this.data[-2 + this.position])) << 8) + (((this.data[this.position + -3]) & 0xff) << 16));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.MB(" + i + ')');
		}
	}

	final byte method1187(byte i) {
		try {
			return (byte) -(this.data[this.position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.WB(" + i + ')');
		}
	}

	final void method1188(String string, byte i) {
		try {
			if (i == 113) {
				int i_4_ = string.indexOf('\0');
				if (i_4_ >= 0)
					throw new IllegalArgumentException("NUL character at " + i_4_ + " - cannot pjstr");
				this.position += Class200.method2694(string, 0, string.length(), this.position, (this.data), -28439);
				this.data[this.position++] = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.BC(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final long method1189(byte i) {
		try {
			long l = (long) method1202((byte) -58) & 0xffffffffL;
			long l_5_ = 0xffffffffL & (long) method1202((byte) -68);
			return l + (l_5_ << 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.FC(" + i + ')');
		}
	}

	final void method1190(byte[] is, boolean bool, int i, int i_6_) {
		try {
			for (int i_7_ = i_6_; i_7_ < i_6_ + i; i_7_++)
				is[i_7_] = (this.data[this.position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.CA(" + (is != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_6_ + ')'));
		}
	}

	final byte readSignedByte() {
		try {
			return (this.data[this.position++]); // read byte lol... uhhhhh, just without the bitmask or w/e  this byte is signed
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.NC(");
		}
	}

	final int method1192(byte i) {
		try {
			this.position += 3;
			return ((0xff & (this.data[-3 + this.position])) + (((0xff & (this.data[-2 + this.position])) << 8) + (0xff0000 & ((this.data[this.position - 1]) << 16))));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.BA(" + i + ')');
		}
	}

	final int readInt1(boolean bool) {
		try {
			this.position += 4;
			return (((this.data[-4 + this.position]) << 8 & 0xff00) + ((0xff0000 & ((this.data[this.position - 1]) << 16)) + (((this.data[this.position + -2]) & 0xff) << 24)) - -((this.data[-3 + this.position]) & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.M(" + bool + ')');
		}
	}

	final void writeByte(int i) {
		try {
			this.data[this.position++] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.LC(" + i + ')');
		}
	}

	final void writeLEShort(int i, int i_10_) {
		try {
			this.data[this.position++] = (byte) i;
			this.data[this.position++] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.KA(" + i + ',' + i_10_ + ')');
		}
	}

	final int method1196(int i, byte i_11_) {
		try {
			int i_12_ = Class365.method3937(this.position, this.data, i, false);
			writeInt(1571862888, i_12_);
			return i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.KB(" + i + ',' + i_11_ + ')');
		}
	}

	final int readSmart(int i) {
		try {
			int i_13_ = 0xff & (this.data[this.position]);
			if (i_13_ < 128)
				return readUnsignedByte();
			return -32768 + readShort();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.R(" + i + ')');
		}
	}

	final int method1198(int i) {
		try {
			this.position += 2; //writeLEShortA
			int i_14_ = ((-128 + (this.data[this.position - 2]) & 0xff) + ((this.data[this.position + -1]) << 8 & 0xff00));
			if (i_14_ > 32767)
				i_14_ -= 65536;
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.QA(" + i + ')');
		}
	}

	final void method1199(int i, boolean bool) {
		try {
			if (bool != false)
				readInt1(true);
			if ((~0x7f & i) != 0) {
				if ((~0x3fff & i) != 0) {
					if ((~0x1fffff & i) != 0) {
						if ((~0xfffffff & i) != 0)
							writeByte(i >>> 28 | 0x80);
						writeByte((i | 0x1001c695) >>> 21);
					}
					writeByte((0x201d9a | i) >>> 14);
				}
				writeByte(0x80 | i >>> 7);
			}
			writeByte(i & 0x7f);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.QC(" + i + ',' + bool + ')');
		}
	}

	final void method1200(byte i, int i_16_) {
		try {
			this.data[this.position++] = (byte) (i_16_ >> 8);
			this.data[this.position++] = (byte) i_16_;
			this.data[this.position++] = (byte) (i_16_ >> 24);
			this.data[this.position++] = (byte) (i_16_ >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.MA(" + i + ',' + i_16_ + ')');
		}
	}

	final void method1201(int i) {
		do {
			try {
				if (this.data != null)
					Class129.method2228((byte) 75, this.data);
				this.data = null;
				if (i == 0)
					break;
				method1216(-7);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ji.VA(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method1202(byte i) {
		try {
			this.position += 4;
			if (i >= -45)
				currentViewDistanceIndex = 37;
			return (((this.data[-3 + this.position]) << 8 & 0xff00) + (((this.data[this.position + -2]) & 0xff) << 16) + (((0xff & (this.data[-1 + this.position])) << 24) + (0xff & (this.data[-4 + this.position]))));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.SA(" + i + ')');
		}
	}

	final int readShort() {
		try {
			this.position += 2;
			return (((this.data[this.position - 1]) & 0xff) + (((this.data[-2 + this.position]) & 0xff) << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.CB(");
		}
	}

	final String readString() {
		try {
			int i_18_ = this.position;
			while ((this.data[this.position++]) != 0) {
				/* empty */
			}
			int i_19_ = -i_18_ + this.position - 1;
			if (i_19_ == 0)
				return "";
			return Class98_Sub46_Sub6.method1546(i_19_, i_18_, (byte) -64, (this.data));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.TA(");
		}
	}

	final void method1205(BigInteger biginteger, boolean bool, BigInteger biginteger_20_) {
		try {
			int i = this.position;
			this.position = 0;
			byte[] is = new byte[i];
			method1190(is, bool, i, 0);
			BigInteger biginteger_21_ = new BigInteger(is);
			BigInteger biginteger_22_ = biginteger_21_; // disabled
			byte[] is_23_ = biginteger_22_.toByteArray();
			this.position = 0;
			if (bool == true) {
				writeShort(is_23_.length);
				method1217(is_23_, is_23_.length, -1, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.IA(" + (biginteger != null ? "{...}" : "null") + ',' + bool + ',' + (biginteger_20_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void writeByteS(int i, int i_24_) {
		do {
			try {
				this.data[this.position++] = (byte) (128 + -i);
				if (i_24_ <= -16)
					break;
				method1192((byte) -121);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ji.HA(" + i + ',' + i_24_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1207(byte i, int i_25_) {
		try {
			this.data[this.position - i_25_ + -2] = (byte) (i_25_ >> 8);
			if (i != 90)
				readUnsignedByte();
			this.data[-1 + (-i_25_ + this.position)] = (byte) i_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.CC(" + i + ',' + i_25_ + ')');
		}
	}

	final int method1208(int i) {
		try {
			int i_26_ = 0;
			if (i != 3893)
				return 116;
			int i_27_;
			for (i_27_ = readSmart(i + 1689618819); i_27_ == 32767; i_27_ = readSmart(1689622712))
				i_26_ += 32767;
			i_26_ += i_27_;
			return i_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.P(" + i + ')');
		}
	}

	final int readInt2(int i) {
		try {
			this.position += 4;
			if (i >= -7)
				this.position = -81;
			return (((this.data[-2 + this.position]) & 0xff) + (((this.data[this.position + -4]) & 0xff) << 16) + ((((this.data[-3 + this.position]) & 0xff) << 24) + ((0xff & (this.data[this.position - 1])) << 8)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.UB(" + i + ')');
		}
	}

	final boolean method1210(int i) {
		try {
			this.position -= 4;
			int i_29_ = Class365.method3937(this.position, this.data, 0, false);
			int i_30_ = readInt(-2);
			if (i_29_ == i_30_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.EB(" + i + ')');
		}
	}

	final void method1211(byte i, int i_31_) {
		try {
			if (i > 79)
				this.data[-i_31_ + (this.position - 1)] = (byte) i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.HB(" + i + ',' + i_31_ + ')');
		}
	}

	final int readShortA(int i) {
		try {
			this.position += 2;
			if (i <= 40)
				return -92;
			return ((0xff & (this.data[this.position - 1]) - 128) + (0xff00 & ((this.data[this.position + -2]) << 8)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.GC(" + i + ')');
		}
	}

	final void method1213(int i, long l, int i_32_) {
		try {
			if (--i_32_ < 0 || i_32_ > 7)
				throw new IllegalArgumentException();
			if (i != 31498)
				method1208(4);
			for (int i_33_ = 8 * i_32_; i_33_ >= 0; i_33_ -= 8)
				this.data[this.position++] = (byte) (int) (l >> i_33_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.S(" + i + ',' + l + ',' + i_32_ + ')'));
		}
	}

	final int readUShort(boolean bool) { //h
		try {
			this.position += 2;
			if (bool != false)
				method1244(45, (byte) 31);
			int i = ((0xff00 & ((this.data[this.position + -2]) << 8)) - -((this.data[this.position + -1]) & 0xff));
			if (i > 32767)
				i -= 65536;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.EA(" + bool + ')');
		}
	}

	final void method1215(int[] is, int i, int i_34_, byte i_35_) {
		try {
			if (i_35_ != 30)
				method1192((byte) -61);
			int i_36_ = this.position;
			this.position = i;
			int i_37_ = (-i + i_34_) / 8;
			for (int i_38_ = 0; i_37_ > i_38_; i_38_++) {
				int i_39_ = readInt(i_35_ ^ ~0x1f);
				int i_40_ = readInt(-2);
				int i_41_ = -957401312;
				int i_42_ = -1640531527;
				int i_43_ = 32;
				while (i_43_-- > 0) {
					i_40_ -= (is[i_41_ >>> 11 & 0x5a600003] + i_41_ ^ ((i_39_ << 4 ^ i_39_ >>> 5) - -i_39_));
					i_41_ -= i_42_;
					i_39_ -= (i_41_ + is[i_41_ & 0x3] ^ i_40_ + (i_40_ << 4 ^ i_40_ >>> 5));
				}
				this.position -= 8;
				writeInt(1571862888, i_39_);
				writeInt(i_35_ + 1571862858, i_40_);
			}
			this.position = i_36_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.AB(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}

	static final void method1216(int i) {
		try {
			if (i != -17470)
				method1216(-14);
			Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.setCS2StringOrVarc(0, -42, 15);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.HC(" + i + ')');
		}
	}

	final void method1217(byte[] is, int i, int i_44_, int i_45_) {
		try {
			int i_46_ = i_45_;
			if (i_44_ != -1)
				currentViewDistanceIndex = 121;
			for (/**/; i + i_45_ > i_46_; i_46_++)
				this.data[this.position++] = is[i_46_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.DB(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_44_ + ',' + i_45_ + ')'));
		}
	}

	final void method1218(int i, int i_47_) {
		try {
			this.data[this.position++] = (byte) i;
			this.data[this.position++] = (byte) (i >> 8);
			if (i_47_ != 1489446952)
				this.data = null;
			this.data[this.position++] = (byte) (i >> 16);
			this.data[this.position++] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.MC(" + i + ',' + i_47_ + ')');
		}
	}

	final int readInt(int i) {
		try {
			this.position += 4;
			if (i != -2)
				readShort1((byte) -76);
			return ((0xff & (this.data[-1 + this.position])) + ((0xff0000 & ((this.data[-3 + this.position]) << 16)) + ((0xff & (this.data[-4 + this.position])) << 24)) + ((this.data[-2 + this.position]) << 8 & 0xff00));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.SB(" + i + ')');
		}
	}

	final int readLEShortA(byte i) {
		try {
			this.position += 2;
			return ((((this.data[this.position - 1]) & 0xff) << 8) + (0xff & (this.data[-2 + this.position]) - 128));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.FB(" + i + ')');
		}
	}

	final void method1221(int i, long l) {
		try {
			this.data[this.position++] = (byte) (int) (l >> 56);
			if (i > -49)
				this.position = -23;
			this.data[this.position++] = (byte) (int) (l >> 48);
			this.data[this.position++] = (byte) (int) (l >> 40);
			this.data[this.position++] = (byte) (int) (l >> 32);
			this.data[this.position++] = (byte) (int) (l >> 24);
			this.data[this.position++] = (byte) (int) (l >> 16);
			this.data[this.position++] = (byte) (int) (l >> 8);
			this.data[this.position++] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.JB(" + i + ',' + l + ')');
		}
	}

	final String method1222(int i) {
		try {
			if ((~(((RSByteBuffer) this).data[((RSByteBuffer) this).position])) == i) {
				this.position++;
				return null;
			}
			return readString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.WA(" + i + ')');
		}
	}

	final String method1223(int i) {
		try {
			byte i_49_ = (this.data[this.position++]);
			if (i_49_ != 0)
				throw new IllegalStateException("Bad version number in gjstr2");
			int i_50_ = this.position;
			while ((this.data[this.position++]) != 0) {
				/* empty */
			}
			if (i != -1)
				return null;
			int i_51_ = -1 + (this.position + -i_50_);
			if (i_51_ == 0)
				return "";
			return Class98_Sub46_Sub6.method1546(i_51_, i_50_, (byte) -108, (this.data));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.PB(" + i + ')');
		}
	}

	final void writeShort(int i) {
		try {
			this.data[this.position++] = (byte) (i >> 8);
			this.data[this.position++] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.QB(" + i + ')');
		}
	}

	final void method1225(int i, int i_53_) {
		do {
			try {
				this.data[this.position++] = (byte) (i_53_ >> 16);
				this.data[this.position++] = (byte) (i_53_ >> 8);
				this.data[this.position++] = (byte) i_53_;
				if (i == -24472)
					break;
				//readInt(46);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ji.RB(" + i + ',' + i_53_ + ')'));
			}
			break;
		} while (false);
	}

	final int readByteC(byte i) {
		try {
			return (-(this.data[this.position++]) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.UA(" + i + ')');
		}
	}

	final int method1227(byte i) {
		try {
			if (i != -1)
				IncomingOpcode.aClass58_3993 = null;
			this.position += 3;
			int i_55_ = ((((this.data[-2 + this.position]) & 0xff) << 8) + (((this.data[this.position - 3]) << 16 & 0xff0000) + ((this.data[-1 + this.position]) & 0xff)));
			if (i_55_ > 8388607)
				i_55_ -= 16777216;
			return i_55_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.LA(" + i + ')');
		}
	}

	final int readShort1(byte i) {
		try {
			this.position += 2;
			return ((0xff & (this.data[-2 + this.position])) + (((this.data[-1 + this.position]) & 0xff) << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.PA(" + i + ')');
		}
	}

	final int readUnsignedByte() {
		try {
			return ((this.data[this.position++]) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.OA(");
		}
	}

	final int readByteS() {
		try {
			return (128 + -(this.data[this.position++]) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.OB(");
		}
	}

	final void method1231(int i, byte i_59_) {
		try {
			this.data[this.position++] = (byte) (128 + i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.Q(" + i + ',' + i_59_ + ')');
		}
	}

	final void method1232(int i, byte i_61_) {
		do {
			try {
				this.data[this.position++] = (byte) (i >> 16);
				this.data[this.position++] = (byte) (i >> 24);
				this.data[this.position++] = (byte) i;
				this.data[this.position++] = (byte) (i >> 8);
				if (i_61_ > 74)
					break;
				currentViewDistanceIndex = 115;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ji.IB(" + i + ',' + i_61_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1233(byte i, int i_62_) {
		try {
			this.data[-4 + (-i_62_ + this.position)] = (byte) (i_62_ >> 24);
			if (i > -69)
				method1190(null, false, -107, -119);
			this.data[-3 + (-i_62_ + this.position)] = (byte) (i_62_ >> 16);
			this.data[-i_62_ + this.position + -2] = (byte) (i_62_ >> 8);
			this.data[-i_62_ + (this.position + -1)] = (byte) i_62_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.O(" + i + ',' + i_62_ + ')');
		}
	}

	final byte method1234(int i) {
		try {
			return (byte) (-(this.data[this.position++]) + 128);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.PC(" + i + ')');
		}
	}

	final void method1235(boolean bool, int[] is, int i, int i_63_) {
		do {
			try {
				int i_64_ = this.position;
				this.position = i;
				int i_65_ = (i_63_ - i) / 8;
				for (int i_66_ = 0; i_65_ > i_66_; i_66_++) {
					int i_67_ = readInt(-2);
					int i_68_ = readInt(-2);
					int i_69_ = 0;
					int i_70_ = -1640531527;
					int i_71_ = 32;
					while (i_71_-- > 0) {
						i_67_ += ((i_68_ << 4 ^ i_68_ >>> 5) - -i_68_) ^ is[i_69_ & 0x3] + i_69_;
						i_69_ += i_70_;
						i_68_ += (is[(0x1fd8 & i_69_) >>> 11] + i_69_ ^ (i_67_ >>> 5 ^ i_67_ << 4) + i_67_);
					}
					this.position -= 8;
					writeInt(1571862888, i_67_);
					writeInt(1571862888, i_68_);
				}
				this.position = i_64_;
				if (bool == true)
					break;
				currentViewDistanceIndex = -83;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ji.AC(" + bool + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + i_63_ + ')'));
			}
			break;
		} while (false);
	}

	final int readByteA() {
		try {
			return 0xff & (this.data[this.position++]) - 128;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.JA(");
		}
	}

	final void method1237(int i, int i_72_) {
		try {
			if (i >= 0 && i < 128)
				writeByte(i);
			else {
				if (i_72_ >= -117)
					writeByte(-1);
				if (i >= 0 && i < 32768)
					writeShort(i + 32768);
				else
					throw new IllegalArgumentException();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.EC(" + i + ',' + i_72_ + ')');
		}
	}

	final void writeLEShortA(int i, int i_73_) {
		try {
			this.data[this.position++] = (byte) (i_73_ + i);
			this.data[this.position++] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.IC(" + i + ',' + i_73_ + ')');
		}
	}

	final int method1239(int i) {
		try {
			int i_74_ = 0xff & (this.data[this.position]);
			if (i_74_ < 128)
				return -64 + readUnsignedByte();
			return readShort() + -49152;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.LB(" + i + ')');
		}
	}

	final int method1240(byte i) {
		try {
			if (i != -20)
				return 50;
			int i_76_ = (this.data[this.position++]);
			int i_77_ = 0;
			for (/**/; i_76_ < 0; i_76_ = (this.data[this.position++]))
				i_77_ = (i_76_ & 0x7f | i_77_) << 7;
			return i_76_ | i_77_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.NB(" + i + ')');
		}
	}

	static final boolean method1241(boolean bool, int i, int i_78_) {
		try {
			if (bool != false)
				return false;
			if ((0x100 & i_78_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ji.L(" + bool + ',' + i + ',' + i_78_ + ')'));
		}
	}

	final int method1242(int i) {//k
		try {
			this.position += 2;
			int i_79_ = (((this.data[-1 + this.position]) - 128 & 0xff) + (0xff00 & ((this.data[-2 + this.position]) << 8)));
			if (i_79_ > 32767)
				i_79_ -= 65536;
			return i_79_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.OC(" + i + ')');
		}
	}

	public static void method1243(int i) {
		try {
			aClass207_3995 = null;
			if (i <= 79)
				currentViewDistanceIndex = -43;
			IncomingOpcode.aClass58_3993 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.JC(" + i + ')');
		}
	}

	final void method1244(int i, byte i_80_) {
		try {
			if (i_80_ != 112)
				method1217(null, -122, -10, -57);
			this.data[this.position++] = (byte) -i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.VB(" + i + ',' + i_80_ + ')');
		}
	}

	final void writeLEInt(int i, int i_81_) {
		try {
			this.data[this.position++] = (byte) i;
			if (i_81_ != 1046032984)
				readInt(13);
			this.data[this.position++] = (byte) (i >> 8);
			this.data[this.position++] = (byte) (i >> 16);
			this.data[this.position++] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.TB(" + i + ',' + i_81_ + ')');
		}
	}

	final long method1246(int i) {
		try {
			long l = 0xffffffffL & (long) readInt(-2);
			long l_82_ = (long) readInt(-2) & 0xffffffffL;
			if (i >= -87)
				readShort1((byte) 15);
			return l_82_ + (l << 32);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.N(" + i + ')');
		}
	}

	final void method1247(int i, int i_83_) {
		try {
			this.data[this.position++] = (byte) i;
			if (i_83_ != 4)
				method1187((byte) 12);
			this.data[this.position++] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.DA(" + i + ',' + i_83_ + ')');
		}
	}

	final long method1248(int i, boolean bool) {
		try {
			if (--i < 0 || i > 7)
				throw new IllegalArgumentException();
			if (bool != false)
				readIntReverse(false);
			int i_84_ = 8 * i;
			long l = 0L;
			for (/**/; i_84_ >= 0; i_84_ -= 8)
				l |= ((long) (this.data[this.position++]) & 0xffL) << i_84_;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.BB(" + i + ',' + bool + ')');
		}
	}

	final int readIntReverse(boolean bool) {
		try {
			this.position += 4;
			return (((this.data[-4 + this.position]) & 0xff) + ((0xff & (this.data[-2 + this.position])) << 16) + ((((this.data[-1 + this.position]) & 0xff) << 24) - -((0xff & (this.data[-3 + this.position])) << 8)));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.DC(" + bool + ')');
		}
	}

	RSByteBuffer(int i) {
		try {
			this.data = Class129.method2225(false, i);
			this.position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.<init>(" + i + ')');
		}
	}

	RSByteBuffer(byte[] is) {
		try {
			this.position = 0;
			this.data = is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ji.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method1250(int i, int i_85_, boolean bool, byte[] is) {
		do {
			try {
				for (int i_86_ = i_85_ + i + -1; i <= i_86_; i_86_--)
					is[i_86_] = (byte) (-128 + (this.data[this.position++]));
				if (bool == false)
					break;
				currentViewDistanceIndex = -120;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ji.NA(" + i + ',' + i_85_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
