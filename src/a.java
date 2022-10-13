/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class a implements Interface9 {
	private i anI3280;
	Runnable aRunnable3281;
	private i anI3282;
	private i anI3283;
	private i anI3284;
	long nativeid;
	private i anI3285;
	private i anI3286;
	private i anI3287;
	private i anI3288;
	private i anI3289;
	private oa anOa3290;
	private i anI3291;

	private final native void f(long l, long l_0_, long l_1_, int[] is, int i, int i_2_);

	protected final void finalize() {
		if (this.nativeid != 0L)
			Class192.method2654(false, this);
	}

	private final native void UA(long l, long l_3_, long l_4_, int[] is, int i);

	private final void method135() {
		M(this.nativeid);
	}

	final void method136(s var_s, int i, int i_5_, int i_6_) {
		Z(this.nativeid, ((t) var_s).nativeid, i, i_5_, i_6_);
	}

	final AbstractModel method137(i var_i, byte i, int i_7_, boolean bool) {
		i var_i_8_;
		i var_i_9_;
		if (i == 1) {
			var_i_8_ = anI3287;
			var_i_9_ = anI3285;
		} else if (i == 2) {
			var_i_8_ = anI3289;
			var_i_9_ = anI3286;
		} else if (i == 3) {
			var_i_8_ = anI3280;
			var_i_9_ = anI3288;
		} else if (i == 4) {
			var_i_8_ = anI3284;
			var_i_9_ = anI3291;
		} else if (i == 5) {
			var_i_8_ = anI3283;
			var_i_9_ = anI3282;
		} else
			var_i_9_ = var_i_8_ = new i(anOa3290);
		var_i.ZA(var_i_9_, var_i_8_, i_7_, i != 0, bool);
		var_i_9_.aClass87Array3294 = var_i.aClass87Array3294;
		var_i_9_.aClass35Array3295 = var_i.aClass35Array3295;
		return var_i_9_;
	}

	private final native void ta(long l, long l_10_, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean[][] bools);

	final void method138(ha var_ha, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		na(this.nativeid, var_ha, i, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_);
	}

	private final native void HA(long l, ha var_ha, int i, int i_23_);

	private final native void Z(long l, long l_24_, int i, int i_25_, int i_26_);

	final void method139() {
		this.aRunnable3281 = null;
		method144();
	}

	final void method140(AbstractModel class146, AbstractModel class146_27_, int i, int i_28_, int i_29_, boolean bool) {
		r(this.nativeid, ((i) class146).nativeid, ((i) class146_27_).nativeid, i, i_28_, i_29_, bool);
	}

	private final native boolean n(long l, long l_30_, int i, int i_31_, long l_32_, boolean bool, int i_33_);

	final void method141() {
		this.aRunnable3281 = Thread.currentThread();
		method135();
	}

	final void method142(ha var_ha, int[] is, int[] is_34_, int[] is_35_, short[] is_36_, int i) {
		O(this.nativeid, var_ha, is, is_34_, is_35_, is_36_, i);
	}

	private final native void O(long l, ha var_ha, int[] is, int[] is_37_, int[] is_38_, short[] is_39_, int i);

	private final native void M(long l);

	private final native void na(long l, ha var_ha, int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_);

	final void method143(AbstractModel class146, int[] is, Class111 class111) {
		e(this.nativeid, ((i) class146).nativeid, is, ((ja) class111).nativeid);
	}

	private final void method144() {
		W(this.nativeid);
	}

	public final void w(boolean bool) {
		E(this.nativeid, bool);
	}

	private final native void e(long l, long l_46_, int[] is, long l_47_);

	final void method145(s var_s, int i, int i_48_) {
		H(this.nativeid, ((t) var_s).nativeid, i, i_48_);
	}

	private final native void r(long l, long l_49_, long l_50_, int i, int i_51_, int i_52_, boolean bool);

	private final native void W(long l);

	final void method146(AbstractModel class146, Class111 class111, int[] is, int i, int i_53_) {
		f(this.nativeid, ((i) class146).nativeid, ((ja) class111).nativeid, is, i, i_53_);
	}

	private final native void E(long l, boolean bool);

	private final native void H(long l, long l_54_, int i, int i_55_);

	private final native boolean R(long l, long l_56_, int i, int i_57_, long l_58_, boolean bool);

	final boolean method147(AbstractModel class146, int i, int i_59_, Class111 class111, boolean bool, int i_60_) {
		return n(this.nativeid, ((i) class146).nativeid, i, i_59_, ((ja) class111).nativeid, bool, i_60_);
	}

	final void method148(s var_s, int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, boolean[][] bools) {
		ta(this.nativeid, ((t) var_s).nativeid, i, i_61_, i_62_, i_63_, i_64_, i_65_, i_66_, bools);
	}

	final void method149(AbstractModel class146, Class111 class111, int[] is, int i) {
		UA(this.nativeid, ((i) class146).nativeid, ((ja) class111).nativeid, is, i);
	}

	final boolean method150(AbstractModel class146, int i, int i_67_, Class111 class111, boolean bool) {
		return R(this.nativeid, ((i) class146).nativeid, i, i_67_, ((ja) class111).nativeid, bool);
	}

	a(oa var_oa, int i, int i_68_) {
		anOa3290 = var_oa;
		anI3285 = new i(anOa3290);
		anI3286 = new i(anOa3290);
		anI3288 = new i(anOa3290);
		anI3291 = new i(anOa3290);
		anI3282 = new i(anOa3290);
		anI3287 = new i(anOa3290);
		anI3289 = new i(anOa3290);
		anI3280 = new i(anOa3290);
		anI3284 = new i(anOa3290);
		anI3283 = new i(anOa3290);
		HA(this.nativeid, var_oa, i, i_68_);
	}
}
