/* Class98_Sub42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub42 extends Node {
	int anInt4205;
	Player aClass246_Sub3_Sub4_Sub2_Sub2_4206;
	boolean aBoolean4207;
	int[] anIntArray4208;
	Class246_Sub3_Sub4_Sub2_Sub1 aClass246_Sub3_Sub4_Sub2_Sub1_4209;
	int anInt4210;
	Class98_Sub24_Sub1 aClass98_Sub24_Sub1_4211;
	static long aLong4212;
	Class98_Sub13 aClass98_Sub13_4213;
	Class98_Sub24_Sub1 aClass98_Sub24_Sub1_4214;
	boolean aBoolean4215;
	int anInt4216;
	int anInt4217;
	static boolean aBoolean4218 = false;
	int anInt4219;
	int anInt4220;
	int anInt4221;
	int anInt4223;
	int anInt4224;
	int anInt4225;
	boolean aBoolean4226;
	int anInt4227 = 0;
	int anInt4228;
	int anInt4229;
	Class98_Sub31_Sub5 aClass98_Sub31_Sub5_4230;
	Class98_Sub13 aClass98_Sub13_4231;
	Class98_Sub31_Sub5 aClass98_Sub31_Sub5_4232;
	Class352 aClass352_4233;
	static float aFloat4234;
	static OutgoingOpcode aClass171_4235;
	int anInt4236;
	int anInt4237;
	static long aLong4238 = (long) (9.999999999E9 * Math.random());
	static int anInt4239;

	static final void method1476(int i, int i_0_) {
		do {
			try {
				if (i != 256)
					anInt4239 = -78;
				Class98_Sub36 class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277.method3990(i_0_, -1));
				if (class98_sub36 == null)
					break;
				class98_sub36.aBoolean4153 = !class98_sub36.aBoolean4153;
				class98_sub36.aClass237_Sub1_4157.method2911(class98_sub36.aBoolean4153, (byte) 22);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qfa.B(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	static final void method1477(boolean bool) {
		do {
			try {
				if (Class241.anObject1847 == null) {
					Class284_Sub2_Sub2 class284_sub2_sub2 = new Class284_Sub2_Sub2();
					byte[] is = class284_sub2_sub2.method3379(16, 20283, 128, 128);
					Class241.anObject1847 = Class64_Sub25.method654(2, is, false);
				}
				if (bool == false) {
					if (Class64_Sub24.anObject3709 != null)
						break;
					Class284_Sub1_Sub2 class284_sub1_sub2 = new Class284_Sub1_Sub2();
					byte[] is = class284_sub1_sub2.method3372(!bool, 128, 16, 128);
					Class64_Sub24.anObject3709 = Class64_Sub25.method654(2, is, false);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qfa.E(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method1478(boolean bool) {
		do {
			try {
				if (bool != true)
					this.anInt4228 = 82;
				int i = this.anInt4210;
				boolean bool_1_ = this.aBoolean4215;
				if (this.aClass352_4233 != null) {
					Class352 class352 = this.aClass352_4233.method3852(Class75.aClass140_584, (byte) -96);
					if (class352 != null) {
						this.anInt4223 = class352.anInt3006;
						this.anInt4219 = class352.anInt2949;
						this.aBoolean4226 = class352.aBoolean2957;
						this.anInt4205 = class352.anInt2972;
						this.anInt4236 = class352.anInt2987;
						this.anInt4210 = class352.anInt2996;
						this.aBoolean4215 = class352.aBoolean2992;
						this.anIntArray4208 = class352.anIntArray2926;
						this.anInt4237 = class352.anInt2950;
						this.anInt4228 = class352.anInt2981 << 9;
					} else {
						this.aBoolean4215 = false;
						this.anInt4237 = 256;
						this.anInt4228 = 0;
						this.anIntArray4208 = null;
						this.anInt4223 = 256;
						this.anInt4217 = 0;
						this.anInt4205 = 0;
						this.anInt4219 = 0;
						this.aBoolean4226 = false;
						this.anInt4236 = 0;
						this.anInt4210 = -1;
					}
				} else if ((this.aClass246_Sub3_Sub4_Sub2_Sub1_4209) == null) {
					if ((this.aClass246_Sub3_Sub4_Sub2_Sub2_4206) != null) {
						this.anInt4210 = (Class286.method3383((this.aClass246_Sub3_Sub4_Sub2_Sub2_4206), bool));
						this.anInt4223 = 256;
						this.anInt4217 = 0;
						this.anInt4228 = (this.aClass246_Sub3_Sub4_Sub2_Sub2_4206.ambientSoundHearDistance) << 9;
						this.aBoolean4215 = (this.aClass246_Sub3_Sub4_Sub2_Sub2_4206.hasDisplayName);
						this.anInt4236 = (this.aClass246_Sub3_Sub4_Sub2_Sub2_4206.anInt6514);
						this.anInt4237 = 256;
					}
				} else {
					int i_2_ = (Class277.method3293(125, (this.aClass246_Sub3_Sub4_Sub2_Sub1_4209)));
					if (i != i_2_) {
						this.anInt4210 = i_2_;
						Class141 class141 = (this.aClass246_Sub3_Sub4_Sub2_Sub1_4209.aClass141_6504);
						if (class141.anIntArray1109 != null)
							class141 = class141.method2300(Class75.aClass140_584, (byte) 79);
						if (class141 != null) {
							this.anInt4236 = class141.anInt1156;
							this.anInt4223 = class141.anInt1101;
							this.anInt4237 = class141.anInt1090;
							this.aBoolean4215 = class141.aBoolean1093;
							this.anInt4217 = (class141.anInt1125 << 9);
							this.anInt4228 = class141.anInt1128 << 9;
						} else {
							this.anInt4236 = this.anInt4228 = this.anInt4217 = 0;
							this.aBoolean4215 = this.aClass246_Sub3_Sub4_Sub2_Sub1_4209.aClass141_6504.aBoolean1093;
							this.anInt4237 = 256;
							this.anInt4223 = 256;
						}
					}
				}
				if (this.anInt4210 != i || this.aBoolean4215 == !bool_1_) {
					if (this.aClass98_Sub31_Sub5_4232 == null)
						break;
					Class81.aClass98_Sub31_Sub3_619.method1374(this.aClass98_Sub31_Sub5_4232);
					this.aClass98_Sub13_4213 = null;
					this.aClass98_Sub31_Sub5_4232 = null;
					this.aClass98_Sub24_Sub1_4214 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qfa.A(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1479(String string, int i) {
		try {
			if (i != 0)
				return true;
			return Class10.aHashtable118.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qfa.D(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method1480(byte i) {
		try {
			IncomingOpcode.aClass58_4222 = null;
			if (i <= 77)
				method1476(-13, -115);
			aClass171_4235 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qfa.C(" + i + ')');
		}
	}

	public Class98_Sub42() {
		/* empty */
	}

	static {
		aClass171_4235 = new OutgoingOpcode(65, 2);
	}
}
