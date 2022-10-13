/* Class246_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub5 extends Class246 {
	int anInt5093 = 0;
	private static boolean[] aBooleanArray5094 = new boolean[8];
	Class246_Sub4_Sub2_Sub1[] aClass246_Sub4_Sub2_Sub1Array5095;
	private boolean aBoolean5096;
	private Class218 aClass218_5097;
	private static boolean[] aBooleanArray5098 = new boolean[32];
	boolean aBoolean5099 = false;
	private long aLong5100;
	private long aLong5101;
	LinkedList aClass148_5102;
	private int anInt5103;
	Class242 aClass242_5104;
	private int anInt5105;
	int anInt5106;
	private boolean aBoolean5107;
	boolean aBoolean5108;

	final void method3114() {
		aBoolean5096 = true;
	}

	final Class242 method3115() {
		((Class242) ((Class246_Sub5) this).aClass242_5104).aClass358_1850.method3886((byte) -17);
		for (int i = 0; i < (((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095).length; i++) {
			if ((((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095[i] != null) && ((Class246_Sub4_Sub2_Sub1) (((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095[i])).aClass246_Sub9_6492 != null)
				((Class242) ((Class246_Sub5) this).aClass242_5104).aClass358_1850.method3891((((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095[i]), 8);
		}
		return ((Class246_Sub5) this).aClass242_5104;
	}

	final Class242 method3116() {
		return ((Class246_Sub5) this).aClass242_5104;
	}

	static final Class246_Sub5 method3117(int i, boolean bool) {
		if (Class273.anInt2039 != Class258.anInt1952) {
			Class246_Sub5 class246_sub5 = Class373_Sub2.aClass246_Sub5Array5469[Class258.anInt1952];
			Class258.anInt1952 = (Class258.anInt1952 + 1 & Class224_Sub1.anIntArray5034[Class337_Sub1.anInt5497]);
			class246_sub5.method3124(i, bool);
			return class246_sub5;
		}
		return new Class246_Sub5(i, bool);
	}

	final void method3118(ha var_ha) {
		((Class242) ((Class246_Sub5) this).aClass242_5104).aClass358_1850.method3886((byte) 99);
		for (Class246_Sub9 class246_sub9 = (Class246_Sub9) aClass218_5097.method2803((byte) 15); class246_sub9 != null; class246_sub9 = (Class246_Sub9) aClass218_5097.method2809(false))
			class246_sub9.method3134(aLong5100, var_ha, (byte) 38);
	}

	private final void method3119(ha var_ha, Class87[] class87s, boolean bool) {
		for (int i = 0; i < 32; i++)
			aBooleanArray5098[i] = false;
		while_102_: for (Class246_Sub9 class246_sub9 = (Class246_Sub9) aClass218_5097.method2803((byte) 15); class246_sub9 != null; class246_sub9 = (Class246_Sub9) aClass218_5097.method2809(false)) {
			if (class87s != null) {
				for (int i = 0; i < class87s.length; i++) {
					if ((((Class246_Sub9) class246_sub9).aClass87_5131 == class87s[i]) || (((Class246_Sub9) class246_sub9).aClass87_5131 == ((Class87) class87s[i]).aClass87_657)) {
						aBooleanArray5098[i] = true;
						class246_sub9.method3138(-1);
						((Class246_Sub9) class246_sub9).aBoolean5139 = false;
						continue while_102_;
					}
				}
			}
			if (!bool) {
				if (((Class246_Sub9) class246_sub9).anInt5135 == 0) {
					class246_sub9.method2965((byte) 122);
					anInt5103--;
				} else
					((Class246_Sub9) class246_sub9).aBoolean5139 = true;
			}
		}
		if (class87s != null) {
			for (int i = 0; i < class87s.length; i++) {
				if (i == 32 || anInt5103 == 32)
					break;
				if (!aBooleanArray5098[i]) {
					Class246_Sub9 class246_sub9 = new Class246_Sub9(var_ha, class87s[i], this, aLong5101);
					aClass218_5097.method2808(true, class246_sub9);
					anInt5103++;
					aBooleanArray5098[i] = true;
				}
			}
		}
	}

	final void method3120(ha var_ha, long l, Class87[] class87s, Class35[] class35s, boolean bool) {
		if (!((Class246_Sub5) this).aBoolean5099) {
			method3119(var_ha, class87s, bool);
			method3122(class35s, bool);
			aLong5101 = l;
		}
	}

	final boolean method3121(ha var_ha, long l) {
		if (aLong5101 != aLong5100)
			method3114();
		else
			method3128();
		if (l - aLong5101 > 750L) {
			method3129();
			return false;
		}
		int i = (int) (l - aLong5100);
		if (aBoolean5107) {
			for (Class246_Sub9 class246_sub9 = (Class246_Sub9) aClass218_5097.method2803((byte) 15); class246_sub9 != null; class246_sub9 = (Class246_Sub9) aClass218_5097.method2809(false)) {
				for (int i_0_ = 0; i_0_ < ((Class92) (((Class246_Sub9) class246_sub9).aClass92_5132)).anInt784; i_0_++)
					class246_sub9.method3135(var_ha, !aBoolean5096, l, -64, 1);
			}
			aBoolean5107 = false;
		}
		for (Class246_Sub9 class246_sub9 = (Class246_Sub9) aClass218_5097.method2803((byte) 15); class246_sub9 != null; class246_sub9 = (Class246_Sub9) aClass218_5097.method2809(false))
			class246_sub9.method3135(var_ha, !aBoolean5096, l, -64, i);
		aLong5100 = l;
		return true;
	}

	private final void method3122(Class35[] class35s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBooleanArray5094[i] = false;
		while_104_: for (Class98_Sub46_Sub6 class98_sub46_sub6 = ((Class98_Sub46_Sub6) ((Class246_Sub5) this).aClass148_5102.method2418(32)); class98_sub46_sub6 != null; class98_sub46_sub6 = ((Class98_Sub46_Sub6) ((Class246_Sub5) this).aClass148_5102.method2417(91))) {
			if (class35s != null) {
				for (int i = 0; i < class35s.length; i++) {
					if ((((Class98_Sub46_Sub6) class98_sub46_sub6).aClass35_5971) == class35s[i] || ((((Class98_Sub46_Sub6) class98_sub46_sub6).aClass35_5971) == ((Class35) class35s[i]).aClass35_328)) {
						aBooleanArray5094[i] = true;
						class98_sub46_sub6.method1547(-121);
						continue while_104_;
					}
				}
			}
			if (!bool) {
				class98_sub46_sub6.remove();
				anInt5105--;
				if (class98_sub46_sub6.method1522((byte) 92)) {
					class98_sub46_sub6.method1524((byte) -90);
					Class340.anInt2849--;
				}
			}
		}
		if (class35s != null) {
			for (int i = 0; i < class35s.length; i++) {
				if (i == 8 || anInt5105 == 8)
					break;
				if (!aBooleanArray5094[i]) {
					Class98_Sub46_Sub6 class98_sub46_sub6 = null;
					if ((((Class66) class35s[i].method331((byte) 110)).anInt508 == 1) && Class340.anInt2849 < 32) {
						class98_sub46_sub6 = new Class98_Sub46_Sub6(class35s[i], this);
						Class246_Sub3_Sub3.aClass254_6152.method3185((byte) -14, class98_sub46_sub6, (long) ((Class35) class35s[i]).anInt329);
						Class340.anInt2849++;
					}
					if (class98_sub46_sub6 == null)
						class98_sub46_sub6 = new Class98_Sub46_Sub6(class35s[i], this);
					((Class246_Sub5) this).aClass148_5102.add_last(class98_sub46_sub6, -20911);
					anInt5105++;
					aBooleanArray5094[i] = true;
				}
			}
		}
	}

	final void method3123(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class246_Sub5) this).anInt5106 = i;
	}

	private final void method3124(int i, boolean bool) {
		Class267.aClass218_2002.method2808(true, this);
		aLong5101 = (long) i;
		aLong5100 = (long) i;
		aBoolean5107 = true;
		((Class246_Sub5) this).aBoolean5108 = bool;
	}

	public static void method3125() {
		aBooleanArray5098 = null;
		aBooleanArray5094 = null;
	}

	final void method3126(long l) {
		aLong5101 = l;
	}

	final void method3127() {
		aBoolean5107 = true;
	}

	private final void method3128() {
		aBoolean5096 = false;
	}

	final void method3129() {
		((Class246_Sub5) this).aBoolean5099 = true;
		for (Class98_Sub46_Sub6 class98_sub46_sub6 = ((Class98_Sub46_Sub6) ((Class246_Sub5) this).aClass148_5102.method2418(32)); class98_sub46_sub6 != null; class98_sub46_sub6 = ((Class98_Sub46_Sub6) ((Class246_Sub5) this).aClass148_5102.method2417(111))) {
			if (((Class66) (((Class98_Sub46_Sub6) class98_sub46_sub6).aClass66_5973)).anInt508 == 1)
				class98_sub46_sub6.method1524((byte) -90);
		}
		for (int i = 0; i < (((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095).length; i++) {
			if (((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095[i] != null) {
				((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095[i].method3113();
				((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095[i] = null;
			}
		}
		((Class246_Sub5) this).anInt5093 = 0;
		aClass218_5097 = new Class218();
		anInt5103 = 0;
		((Class246_Sub5) this).aClass148_5102 = new LinkedList();
		anInt5105 = 0;
		this.method2965((byte) 127);
		Class373_Sub2.aClass246_Sub5Array5469[Class273.anInt2039] = this;
		Class273.anInt2039 = (Class273.anInt2039 + 1 & Class224_Sub1.anIntArray5034[Class337_Sub1.anInt5497]);
	}

	private Class246_Sub5(int i, boolean bool) {
		aBoolean5096 = false;
		aClass218_5097 = new Class218();
		anInt5103 = 0;
		((Class246_Sub5) this).aClass148_5102 = new LinkedList();
		anInt5105 = 0;
		((Class246_Sub5) this).aBoolean5108 = false;
		aBoolean5107 = false;
		((Class246_Sub5) this).aClass242_5104 = new Class242();
		((Class246_Sub5) this).aClass246_Sub4_Sub2_Sub1Array5095 = new Class246_Sub4_Sub2_Sub1[8192];
		method3124(i, bool);
	}
}
