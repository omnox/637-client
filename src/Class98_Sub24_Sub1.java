/* Class98_Sub24_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub24_Sub1 extends Class98_Sub24 {
	int anInt5795;
	int anInt5796;
	boolean aBoolean5797;
	int anInt5798;
	byte[] aByteArray5799;

	final Class98_Sub24_Sub1 method1269(Class314 class314) {
		this.aByteArray5799 = class314.method3642(true, this.aByteArray5799);
		this.anInt5795 = class314.method3643(this.anInt5795, 1);
		if (this.anInt5798 == this.anInt5796)
			this.anInt5798 = this.anInt5796 = class314.method3638(6, this.anInt5798);
		else {
			this.anInt5798 = class314.method3638(6, this.anInt5798);
			this.anInt5796 = class314.method3638(6, this.anInt5796);
			if (this.anInt5798 == this.anInt5796)
				this.anInt5798--;
		}
		return this;
	}

	Class98_Sub24_Sub1(int i, byte[] is, int i_0_, int i_1_) {
		this.anInt5795 = i;
		this.aByteArray5799 = is;
		this.anInt5798 = i_0_;
		this.anInt5796 = i_1_;
	}

	Class98_Sub24_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
		this.anInt5795 = i;
		this.aByteArray5799 = is;
		this.anInt5798 = i_2_;
		this.anInt5796 = i_3_;
		this.aBoolean5797 = bool;
	}
}
