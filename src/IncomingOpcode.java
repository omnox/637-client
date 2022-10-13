/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IncomingOpcode {
	
	int anInt460;
	private int anInt462;
	
	static Class65 aClass65_459;
	static int anInt461 = -1;
	static int anInt463;

	static IncomingOpcode smallVarpOpcode;
	static IncomingOpcode CS2StringOpcode = new IncomingOpcode(88, -2);
	static IncomingOpcode hideComponentOpcode = new IncomingOpcode(3, 5);
	static IncomingOpcode currentIncommingOpcode = null;
	static IncomingOpcode cs2Opcode = new IncomingOpcode(16, -2);
	static IncomingOpcode bigVarpOpcode = new IncomingOpcode(27, 6);
	static IncomingOpcode sendInterfaceOpcode = new IncomingOpcode(50, 7);
	static IncomingOpcode carriedWeightOpcode;
	static IncomingOpcode closeInterfaceOpcode = new IncomingOpcode(61, 4);
	static IncomingOpcode smallVarcOpcode = new IncomingOpcode(5, 6);
	static IncomingOpcode exitToLobbyOpcode = new IncomingOpcode(45, 0);
	static IncomingOpcode ignoreOpcode = new IncomingOpcode(85, -1);
	static IncomingOpcode aClass58_4199;
	static IncomingOpcode aClass58_5838;
	static IncomingOpcode aClass58_4094;
	static IncomingOpcode aClass58_5641;
	static IncomingOpcode aClass58_5615;
	static IncomingOpcode aClass58_5493;
	static IncomingOpcode aClass58_5482 = new IncomingOpcode(62, -1);
	static IncomingOpcode aClass58_112 = new IncomingOpcode(35, -1);
	static IncomingOpcode aClass58_592 = new IncomingOpcode(44, 4);
	static IncomingOpcode aClass58_591 = new IncomingOpcode(99, 0);
	static IncomingOpcode aClass58_589 = new IncomingOpcode(69, 8);
	static IncomingOpcode aClass58_587 = new IncomingOpcode(6, -2);
	static IncomingOpcode aClass58_3731 = new IncomingOpcode(104, -2);
	static IncomingOpcode aClass58_3482 = new IncomingOpcode(120, -1);
	static IncomingOpcode aClass58_5333 = new IncomingOpcode(105, 6);
	static IncomingOpcode aClass58_499 = new IncomingOpcode(78, 4);
	static IncomingOpcode aClass58_3645 = new IncomingOpcode(73, 4);
	static IncomingOpcode aClass58_3642 = new IncomingOpcode(48, 3);
	static IncomingOpcode aClass58_3677 = new IncomingOpcode(119, 12);
	static IncomingOpcode aClass58_3665;
	static IncomingOpcode aClass58_3637;
	static IncomingOpcode aClass58_469 = new IncomingOpcode(113, -2);
	static IncomingOpcode aClass58_433;
	static IncomingOpcode aClass58_431 = new IncomingOpcode(8, 6);
	static IncomingOpcode aClass58_379 = new IncomingOpcode(75, 3);
	static IncomingOpcode aClass58_369 = new IncomingOpcode(11, 28);
	static IncomingOpcode aClass58_364 = new IncomingOpcode(25, 0);
	static IncomingOpcode aClass58_3147 = new IncomingOpcode(51, 3);
	static IncomingOpcode aClass58_3134;
	static IncomingOpcode aClass58_3132 = new IncomingOpcode(37, -2);
	static IncomingOpcode aClass58_344 = new IncomingOpcode(95, 10);
	static IncomingOpcode aClass58_3029 = new IncomingOpcode(110, -1);
	static IncomingOpcode aClass58_2993 = new IncomingOpcode(41, 4);
	static IncomingOpcode aClass58_2943 = new IncomingOpcode(108, 2);
	static IncomingOpcode aClass58_2912 = new IncomingOpcode(19, 2);
	static IncomingOpcode aClass58_2844;
	static IncomingOpcode aClass58_2825;
	static IncomingOpcode aClass58_2816;
	static IncomingOpcode aClass58_2708 = new IncomingOpcode(23, 0);
	static IncomingOpcode aClass58_3533 = new IncomingOpcode(93, 6);
	static IncomingOpcode aClass58_2661 = new IncomingOpcode(89, 0);
	static IncomingOpcode aClass58_2581 = new IncomingOpcode(96, 10);
	static IncomingOpcode aClass58_2514 = new IncomingOpcode(29, 5);
	static IncomingOpcode aClass58_2507 = new IncomingOpcode(100, 6);
	static IncomingOpcode aClass58_75;
	static IncomingOpcode aClass58_2187 = new IncomingOpcode(111, 1);
	static IncomingOpcode aClass58_6197 = new IncomingOpcode(56, 10);
	static IncomingOpcode aClass58_5176 = new IncomingOpcode(107, 6);
	static IncomingOpcode aClass58_2143 = new IncomingOpcode(90, 10);
	static IncomingOpcode aClass58_2139 = new IncomingOpcode(63, 7);
	static IncomingOpcode aClass58_2052 = new IncomingOpcode(116, 8);
	static IncomingOpcode aClass58_274 = new IncomingOpcode(70, -2);
	static IncomingOpcode aClass58_1992 = new IncomingOpcode(82, 0);
	static IncomingOpcode aClass58_3262;
	static IncomingOpcode aClass58_1921 = new IncomingOpcode(4, 6);
	static IncomingOpcode aClass58_266 = new IncomingOpcode(106, 6);
	static IncomingOpcode aClass58_6182 = new IncomingOpcode(13, 1);
	static IncomingOpcode aClass58_6166 = new IncomingOpcode(98, -2);
	static IncomingOpcode aClass58_5086 = new IncomingOpcode(83, 20);
	static IncomingOpcode aClass58_6264 = new IncomingOpcode(24, 6);
	static IncomingOpcode aClass58_6487 = new IncomingOpcode(112, 6);
	static IncomingOpcode aClass58_6457;
	static IncomingOpcode aClass58_6151 = new IncomingOpcode(46, 2);
	static IncomingOpcode aClass58_6335 = new IncomingOpcode(65, -1);
	static IncomingOpcode aClass58_1743;
	static IncomingOpcode aClass58_5032;
	static IncomingOpcode aClass58_3406 = new IncomingOpcode(59, 3);
	static IncomingOpcode aClass58_1609;
	static IncomingOpcode aClass58_1596 = new IncomingOpcode(79, 0);
	static IncomingOpcode aClass58_1595 = new IncomingOpcode(7, 8);
	static IncomingOpcode aClass58_1507 = new IncomingOpcode(72, 0);
	static IncomingOpcode aClass58_1452 = new IncomingOpcode(26, 6);
	static IncomingOpcode aClass58_3398;
	static IncomingOpcode aClass58_215 = new IncomingOpcode(1, -1);
	static IncomingOpcode aClass58_5011 = new IncomingOpcode(43, -1);
	static IncomingOpcode regionOpcode = new IncomingOpcode(80, -2);
	static IncomingOpcode aClass58_4997 = new IncomingOpcode(76, -1);
	static IncomingOpcode aClass58_4998 = new IncomingOpcode(12, 0);
	static IncomingOpcode aClass58_4992 = new IncomingOpcode(87, 7);
	static IncomingOpcode minimapFlagOpcode;
	static IncomingOpcode aClass58_1212;
	static IncomingOpcode aClass58_184 = new IncomingOpcode(103, 7);
	static IncomingOpcode aClass58_1192 = new IncomingOpcode(115, 8);
	static IncomingOpcode aClass58_161 = new IncomingOpcode(15, -2);
	static IncomingOpcode aClass58_2651;
	static IncomingOpcode aClass58_5205;
	static IncomingOpcode aClass58_1576 = new IncomingOpcode(92, 16);
	static IncomingOpcode aClass58_1207 = new IncomingOpcode(53, -1);
	static IncomingOpcode aClass58_5466 = new IncomingOpcode(18, 3);
	static IncomingOpcode aClass58_28 = new IncomingOpcode(22, 6);
	static IncomingOpcode aClass58_43 = new IncomingOpcode(117, 0);
	static IncomingOpcode aClass58_3844 = new IncomingOpcode(121, -1);
	static IncomingOpcode aClass58_4291;
	static IncomingOpcode aClass58_4270 = new IncomingOpcode(118, 1);
	static IncomingOpcode aClass58_5996 = new IncomingOpcode(30, -1);
	static IncomingOpcode aClass58_5975 = new IncomingOpcode(60, 4);
	static IncomingOpcode aClass58_6057 = new IncomingOpcode(91, 10);
	static IncomingOpcode aClass58_6041 = new IncomingOpcode(36, 3);
	static IncomingOpcode aClass58_4222 = new IncomingOpcode(42, 6);
	static IncomingOpcode aClass58_5793;
	static IncomingOpcode aClass58_3877 = new IncomingOpcode(66, 1);
	static IncomingOpcode aClass58_5697 = new IncomingOpcode(97, 2);
	static IncomingOpcode aClass58_5638 = new IncomingOpcode(2, 2);
	static IncomingOpcode aClass58_5635 = new IncomingOpcode(52, 4);
	static IncomingOpcode aClass58_5608;
	static IncomingOpcode aClass58_5606 = new IncomingOpcode(68, 3);
	static IncomingOpcode aClass58_4029 = new IncomingOpcode(57, -2);
	static IncomingOpcode aClass58_4128 = new IncomingOpcode(86, 6);
	static IncomingOpcode aClass58_2495 = new IncomingOpcode(47, -1);
	static IncomingOpcode aClass58_3993;
	static IncomingOpcode aClass58_6516;
	static IncomingOpcode aClass58_3566;
	static IncomingOpcode aClass58_3554;
	static IncomingOpcode aClass58_1179 = new IncomingOpcode(84, 4);

	static final Class6[] method520(byte i) {
		try {
			if (i >= -54)
				method522(11);
			return new Class6[] { Class2.aClass6_68, Class1.aClass6_63, Class244.aClass6_1861 };
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.A(" + i + ')');
		}
	}

	final int method521(byte i) {
		try {
			if (i <= 60)
				method521((byte) -127);
			return anInt462;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.C(" + i + ')');
		}
	}

	static final IncomingOpcode[] method3629() {
		try {
			return (new IncomingOpcode[] { IncomingOpcode.aClass58_3134, IncomingOpcode.aClass58_215, IncomingOpcode.aClass58_5638, IncomingOpcode.hideComponentOpcode, IncomingOpcode.aClass58_1921, IncomingOpcode.smallVarcOpcode, IncomingOpcode.aClass58_587, IncomingOpcode.aClass58_1595, IncomingOpcode.aClass58_431, IncomingOpcode.aClass58_4291, IncomingOpcode.aClass58_1743, IncomingOpcode.aClass58_369, IncomingOpcode.aClass58_4998, IncomingOpcode.aClass58_6182, IncomingOpcode.carriedWeightOpcode, IncomingOpcode.aClass58_161, IncomingOpcode.cs2Opcode, IncomingOpcode.aClass58_5793, IncomingOpcode.aClass58_5466, IncomingOpcode.aClass58_2912, IncomingOpcode.aClass58_4199, IncomingOpcode.smallVarpOpcode, IncomingOpcode.aClass58_28, IncomingOpcode.aClass58_2708, IncomingOpcode.aClass58_6264, IncomingOpcode.aClass58_364, IncomingOpcode.aClass58_1452, IncomingOpcode.bigVarpOpcode, IncomingOpcode.aClass58_6516, IncomingOpcode.aClass58_2514, IncomingOpcode.aClass58_5996, IncomingOpcode.aClass58_1212, IncomingOpcode.aClass58_5838, IncomingOpcode.aClass58_5032, IncomingOpcode.aClass58_3637, IncomingOpcode.aClass58_112, IncomingOpcode.aClass58_6041, IncomingOpcode.aClass58_3132, IncomingOpcode.aClass58_2651, IncomingOpcode.aClass58_433, IncomingOpcode.aClass58_5615, IncomingOpcode.aClass58_2993, IncomingOpcode.aClass58_4222, IncomingOpcode.aClass58_5011, IncomingOpcode.aClass58_592, IncomingOpcode.exitToLobbyOpcode, IncomingOpcode.aClass58_6151, IncomingOpcode.aClass58_2495, IncomingOpcode.aClass58_3642, IncomingOpcode.minimapFlagOpcode, IncomingOpcode.sendInterfaceOpcode, IncomingOpcode.aClass58_3147, IncomingOpcode.aClass58_5635, IncomingOpcode.aClass58_1207, IncomingOpcode.aClass58_2825, IncomingOpcode.aClass58_6457, IncomingOpcode.aClass58_6197, IncomingOpcode.aClass58_4029, IncomingOpcode.aClass58_5493, IncomingOpcode.aClass58_3406, IncomingOpcode.aClass58_5975, IncomingOpcode.closeInterfaceOpcode, IncomingOpcode.aClass58_5482, IncomingOpcode.aClass58_2139, IncomingOpcode.aClass58_3665, IncomingOpcode.aClass58_6335, IncomingOpcode.aClass58_3877, IncomingOpcode.aClass58_3566, IncomingOpcode.aClass58_5606, IncomingOpcode.aClass58_589, IncomingOpcode.aClass58_274, IncomingOpcode.aClass58_2816, IncomingOpcode.aClass58_1507, IncomingOpcode.aClass58_3645, IncomingOpcode.aClass58_2844, IncomingOpcode.aClass58_379, IncomingOpcode.aClass58_4997, IncomingOpcode.aClass58_5608, IncomingOpcode.aClass58_499, IncomingOpcode.aClass58_1596, IncomingOpcode.regionOpcode, IncomingOpcode.aClass58_75, IncomingOpcode.aClass58_1992, IncomingOpcode.aClass58_5086, IncomingOpcode.aClass58_1179, IncomingOpcode.ignoreOpcode, IncomingOpcode.aClass58_4128, IncomingOpcode.aClass58_4992, IncomingOpcode.CS2StringOpcode, IncomingOpcode.aClass58_2661, IncomingOpcode.aClass58_2143, IncomingOpcode.aClass58_6057, IncomingOpcode.aClass58_1576, IncomingOpcode.aClass58_3533, IncomingOpcode.aClass58_3554, IncomingOpcode.aClass58_344, IncomingOpcode.aClass58_2581, IncomingOpcode.aClass58_5697, IncomingOpcode.aClass58_6166, IncomingOpcode.aClass58_591, IncomingOpcode.aClass58_2507, IncomingOpcode.aClass58_5205, IncomingOpcode.aClass58_1609, IncomingOpcode.aClass58_184, IncomingOpcode.aClass58_3731, IncomingOpcode.aClass58_5333, IncomingOpcode.aClass58_266, IncomingOpcode.aClass58_5176, IncomingOpcode.aClass58_2943, IncomingOpcode.aClass58_3398, IncomingOpcode.aClass58_3029, IncomingOpcode.aClass58_2187, IncomingOpcode.aClass58_6487, IncomingOpcode.aClass58_469, IncomingOpcode.aClass58_3993, IncomingOpcode.aClass58_1192, IncomingOpcode.aClass58_2052, IncomingOpcode.aClass58_43, IncomingOpcode.aClass58_4270, IncomingOpcode.aClass58_3677, IncomingOpcode.aClass58_3482, IncomingOpcode.aClass58_3844 });
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tfa.I(");
		}
	}

	IncomingOpcode(int i, int i_0_) {
		try {
			((IncomingOpcode) this).anInt460 = i_0_;
			anInt462 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.<init>(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method522(int i) {
		try {
			int i_1_ = -3 / ((-64 - i) / 62);
			aClass65_459 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.D(" + i + ')');
		}
	}

	static final boolean method523(int i, int i_2_, int i_3_) {
		try {
			if (i_2_ != -1)
				return true;
			if ((0x21 & i_3_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ea.B(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.toString(" + ')');
		}
	}
	
	static {
		aClass65_459 = new Class65();
		aClass58_3554 = new IncomingOpcode(94, -1);
		IncomingOpcode.aClass58_3566 = new IncomingOpcode(67, -1);
		IncomingOpcode.aClass58_6516 = new IncomingOpcode(28, -2);
		IncomingOpcode.aClass58_3993 = new IncomingOpcode(114, 3);
		IncomingOpcode.aClass58_5608 = new IncomingOpcode(77, 2);
		IncomingOpcode.aClass58_5793 = new IncomingOpcode(17, 8);
		IncomingOpcode.aClass58_4291 = new IncomingOpcode(9, -1);
		IncomingOpcode.aClass58_5205 = new IncomingOpcode(101, 6);
		IncomingOpcode.aClass58_2651 = new IncomingOpcode(38, 3);
		IncomingOpcode.aClass58_1212 = new IncomingOpcode(31, -2);
		IncomingOpcode.minimapFlagOpcode = new IncomingOpcode(49, 2);
		IncomingOpcode.aClass58_3398 = new IncomingOpcode(109, 11);
		IncomingOpcode.aClass58_5032 = new IncomingOpcode(33, -2);
		IncomingOpcode.aClass58_1609 = new IncomingOpcode(102, -1);
		IncomingOpcode.aClass58_1743 = new IncomingOpcode(10, -2);
		IncomingOpcode.aClass58_6457 = new IncomingOpcode(55, -1);
		IncomingOpcode.aClass58_75 = new IncomingOpcode(81, 4);
		IncomingOpcode.aClass58_2816 = new IncomingOpcode(71, 6);
		IncomingOpcode.aClass58_2825 = new IncomingOpcode(54, 4);
		IncomingOpcode.aClass58_2844 = new IncomingOpcode(74, 11);
		IncomingOpcode.aClass58_3134 = new IncomingOpcode(0, 12);
		IncomingOpcode.aClass58_433 = new IncomingOpcode(39, 17);
		IncomingOpcode.aClass58_3637 = new IncomingOpcode(34, 6);
		IncomingOpcode.aClass58_3665 = new IncomingOpcode(64, 6);
		IncomingOpcode.aClass58_5493 = new IncomingOpcode(58, -1);
		IncomingOpcode.aClass58_5615 = new IncomingOpcode(40, -1);
		IncomingOpcode.aClass58_5838 = new IncomingOpcode(32, 1);
		IncomingOpcode.aClass58_4199 = new IncomingOpcode(20, 7);
		IncomingOpcode.carriedWeightOpcode = new IncomingOpcode(14, 2);
		IncomingOpcode.smallVarpOpcode = new IncomingOpcode(21, 3);
	}
}
