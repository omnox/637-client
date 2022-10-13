
/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

public final class client extends Applet_Sub1 {
	static volatile long aLong3547 = 0L;
	static int anInt3548;
	static RuneScapeCache aClass207_3549;
	private static int anInt3550;
	static byte[][] aByteArrayArray3551;
	/* synthetic */ static Class aClass3552;
	public static boolean aBoolean3553;
	static boolean mouseOverScrollWidget = false;

	public static void adjustClientZoom(boolean increase) {
		if (increase) {
			ClientSettings.clientZoom++;
		} else {
			ClientSettings.clientZoom--;
		}
		if (ClientSettings.clientZoom < 0) {
			ClientSettings.clientZoom = 0;
		}
	//	OutgoingPacket.sendOutgoingPacket(OutgoingPacket.SEND_ZOOM_AMOUNT_PACKET);
	//	OutgoingPacket.packet.writeByte(ClientSettings.clientZoom);
	}
	
	private final void method99(byte i) {
		do {
			try {
				if (Class177.anInt1376 != 14) {
					long l = (Class93_Sub3.method913(58) / 1000000L - Class98_Sub46_Sub9.aLong5997);
					Class98_Sub46_Sub9.aLong5997 = Class93_Sub3.method913(i + 67) / 1000000L;
					boolean bool = ClientScript2Event.method1178(i + 13308);
					if (bool && Class151_Sub5.aBoolean4991 && Class145.aClass268_1173 != null)
						Class145.aClass268_1173.method3249((byte) -99);
					if (Class98_Sub5_Sub1.method965((byte) 101, Class177.anInt1376)) {
						if ((Class98_Sub10_Sub25.aLong5677 ^ 0xffffffffffffffffL) != -1L && (Class343.method3819(-47) > Class98_Sub10_Sub25.aLong5677))
							Class98_Sub16.method1150(Class146_Sub2.method2391((byte) 12), Class98_Sub46_Sub15.anInt6039, 3, Class128.anInt1025, false);
						else if (!Class265.aHa1974.method1819() && Class224_Sub2_Sub1.aBoolean6142)
							Class277.method3292((byte) -51);
					}
					if (GameInterface.aFrame3950 == null) {
						java.awt.Container container;
						if (Class284.aFrame2168 == null) {
							if (Class76_Sub11.anApplet3799 == null)
								container = (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271);
							else
								container = Class76_Sub11.anApplet3799;
						} else
							container = Class284.aFrame2168;
						int i_0_ = container.getSize().width;
						int i_1_ = container.getSize().height;
						if (Class284.aFrame2168 == container) {
							Insets insets = Class284.aFrame2168.getInsets();
							i_0_ -= insets.left - -insets.right;
							i_1_ -= insets.top + insets.bottom;
						}
						if ((Class188.anInt1453 ^ 0xffffffff) != (i_0_ ^ 0xffffffff) || ((Class123_Sub1.anInt4744 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) || Class33.aBoolean316) {
							if (Class265.aHa1974 != null && !Class265.aHa1974.method1800()) {
								Class123_Sub1.anInt4744 = i_1_;
								Class188.anInt1453 = i_0_;
							} else
								Class98_Sub31_Sub2.method1336((byte) -98);
							Class98_Sub10_Sub25.aLong5677 = Class343.method3819(-47) - -500L;
							Class33.aBoolean316 = false;
						}
					}
					if (GameInterface.aFrame3950 != null && !Class4.aBoolean84 && Class98_Sub5_Sub1.method965((byte) -51, Class177.anInt1376))
						Class98_Sub16.method1150(((Class98_Sub27) (Class98_Sub9.aClass98_Sub27_3856)).aClass64_Sub27_4052.method666((byte) 126), -1, i + 12, -1, false);
					boolean bool_2_ = false;
					if (Class246_Sub10.aBoolean5152) {
						Class246_Sub10.aBoolean5152 = false;
						bool_2_ = true;
					}
					if (bool_2_)
						Class263.method3216(i ^ ~0x36e3);
					if ((Class265.aHa1974 != null && Class265.aHa1974.method1819()) || Class146_Sub2.method2391((byte) 110) != 1)
						Class98_Sub43.method1481(2);
					if (Class48_Sub1_Sub1.method462(Class177.anInt1376, 126))
						Class34.method330((byte) 50, bool_2_);
					else if (!Class191.method2651(Class177.anInt1376, (byte) -7)) {
						if (Class98_Sub5_Sub3.method974(Class177.anInt1376, (byte) -116))
							Class43.method398(105);
						else if (Class199.method2690(Class177.anInt1376, i ^ 0xffffffff)) {
							if (Class130.anInt1031 == 1) {
								if (Class98_Sub5_Sub3.anInt5538 < Class142.anInt1160)
									Class98_Sub5_Sub3.anInt5538 = Class142.anInt1160;
								int i_3_ = (50 * (-Class142.anInt1160 + Class98_Sub5_Sub3.anInt5538) / Class98_Sub5_Sub3.anInt5538);
								Class246_Sub2.method2972(-75, Class98_Sub46_Sub10.aClass197_6019, Class195.aClass43_1499, true, Class265.aHa1974, ((TextResources.LOADING_PLEASE_WAIT.get_text(Class374.anInt3159)) + "<br>(" + i_3_ + "%)"));
							} else if ((Class130.anInt1031 ^ 0xffffffff) != -3)
								Class246_Sub2.method2972(-115, Class98_Sub46_Sub10.aClass197_6019, Class195.aClass43_1499, true, Class265.aHa1974, (TextResources.LOADING_PLEASE_WAIT.get_text(Class374.anInt3159)));
							else {
								if (Class132.anInt1043 > Class280.anInt2105)
									Class280.anInt2105 = Class132.anInt1043;
								int i_4_ = 50 + ((Class280.anInt2105 + -Class132.anInt1043) * 50 / Class280.anInt2105);
								Class246_Sub2.method2972(-51, Class98_Sub46_Sub10.aClass197_6019, Class195.aClass43_1499, true, Class265.aHa1974, ((TextResources.LOADING_PLEASE_WAIT.get_text(Class374.anInt3159)) + "<br>(" + i_4_ + "%)"));
							}
						} else if ((Class177.anInt1376 ^ 0xffffffff) != -11) {
							if (Class177.anInt1376 == 13)
								Class246_Sub2.method2972(i ^ 0x48, Class98_Sub46_Sub10.aClass197_6019, Class195.aClass43_1499, false, Class265.aHa1974, ((TextResources.CONNECTION_LOST.get_text(Class374.anInt3159)) + "<br>" + (TextResources.aClass309_2601.get_text(Class374.anInt3159))));
						} else
							Class190.method2648(l, -54);
					} else
						Class43.method398(126);
					if (Class167.anInt1282 == 3) {
						for (int i_5_ = 0; Class69_Sub2.anInt5335 > i_5_; i_5_++) {
							Rectangle rectangle = Class98_Sub35.aRectangleArray4144[i_5_];
							if (!Class232.aBooleanArray1741[i_5_]) {
								if (Class98_Sub10_Sub20.aBooleanArray5639[i_5_])
									Class265.aHa1974.method1781(true, rectangle.height, rectangle.width, -65536, rectangle.x, rectangle.y);
								else
									Class265.aHa1974.method1781(true, rectangle.height, rectangle.width, -16711936, rectangle.x, rectangle.y);
							} else
								Class265.aHa1974.method1781(true, rectangle.height, rectangle.width, -65281, rectangle.x, rectangle.y);
						}
					}
					if (Class217.method2800(-8001))
						Class98_Sub10_Sub3.method1012(Class265.aHa1974, (byte) 126);
					if ((((Class88) Class98_Sub43_Sub2.aClass88_5907).aBoolean675) && Class98_Sub5_Sub1.method965((byte) 105, Class177.anInt1376) && (Class167.anInt1282 ^ 0xffffffff) == -1 && ((Class146_Sub2.method2391((byte) 104) ^ 0xffffffff) == -2) && !bool_2_) {
						int i_6_ = 0;
						for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (Class69_Sub2.anInt5335 ^ 0xffffffff)); i_7_++) {
							if (Class98_Sub10_Sub20.aBooleanArray5639[i_7_]) {
								Class98_Sub10_Sub20.aBooleanArray5639[i_7_] = false;
								Class280.aRectangleArray2106[i_6_++] = Class98_Sub35.aRectangleArray4144[i_7_];
							}
						}
						try {
							if (!za_Sub2.aBoolean6079)
								Class265.aHa1974.method1794(Class280.aRectangleArray2106, i_6_, i + 27188);
							else
								Class211.method2775((Class280.aRectangleArray2106), i_6_, i ^ ~0x10c);
						} catch (Exception_Sub1 exception_sub1) {
							/* empty */
						}
					} else if (!Class48_Sub1_Sub1.method462(Class177.anInt1376, i + 136)) {
						for (int i_8_ = 0; ((Class69_Sub2.anInt5335 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)); i_8_++)
							Class98_Sub10_Sub20.aBooleanArray5639[i_8_] = false;
						try {
							if (!za_Sub2.aBoolean6079)
								Class265.aHa1974.method1754(109);
							else
								Class6.method181((byte) 10);
						} catch (Exception_Sub1 exception_sub1) {
							Map.method3585(exception_sub1, -126, (exception_sub1.getMessage() + " (Recovered) " + method94(0)));
							Class76_Sub4.method754(0, false, i + 64);
						}
					}
					if (i == -9) {
						Class289.method3408((byte) 101);
						int i_9_ = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub21_4037.method639((byte) 121);
						if ((i_9_ ^ 0xffffffff) != -1) {
							if ((i_9_ ^ 0xffffffff) == -2)
								Class246_Sub7.method3131(0, 10L);
							else if (i_9_ != 2) {
								if ((i_9_ ^ 0xffffffff) == -4)
									Class246_Sub7.method3131(i ^ ~0x8, 2L);
							} else
								Class246_Sub7.method3131(0, 5L);
						} else
							Class246_Sub7.method3131(0, 15L);
						if (Class335.aBoolean2817)
							Class98_Sub10_Sub1.method1002(false);
						if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub2_4061.method560((byte) 123) ^ 0xffffffff) != -2 || (Class177.anInt1376 ^ 0xffffffff) != -4 || (Class15.anInt185 ^ 0xffffffff) == 0)
							break;
						Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub2_4061));
						Class310.method3618(-5964);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "client.CA(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method100(int i) {
		try {
			aByteArrayArray3551 = null;
			if (i >= -80)
				anInt3550 = 10;
			aClass207_3549 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.KA(" + i + ')');
		}
	}

	final void method90(int i) {
		try {
			method100(-108);
			Class347.method3832((byte) 102);
			Class116.method2160(-25882);
			Class98_Sub46_Sub17.method1622((byte) 20);
			TextResources.method3616(38);
			RtKeyListener.method777((byte) 72);
			RtMouseListener.method3511(-1);
			Class95.method921(false);
			Class102.method1708((byte) 70);
			Class86.method842(false);
			Class121.method2196((byte) -10);
			Class289.method3409((byte) -117);
			MapRegion.method3573((byte) -20);
			Class98_Sub46.method1523(0);
			Node.method940(false);
			Class377.method4000((byte) -97);
			Class6.method179(2566);
			Class196.method2667((byte) -112);
			Class279.method3321(true);
			ha.method1787(false);
			Class98_Sub27.method1280(true);
			Class98_Sub35.method1456(false);
			Class36.method339(-13);
			VarpClass.method2285(i ^ ~0x118b);
			LinkedList.method2415(false);
			Class135.method2250(i ^ 0x169e);
			Class253.method3178((byte) 118);
			Class339_Sub1.method3794((byte) -101);
			RuneScapeCache.method2757(1);
			Class225.method2851(true);
			Class17.method244(-24652);
			Class79.method798((byte) 22);
			Class257.method3198(51);
			Class11.method199((byte) 2);
			Class29.method301(-23881);
			Class32.method314(0);
			Class153.method2488(-1);
			Class83.method830((byte) 64);
			Class8.method184((byte) -109);
			Class269.method3267((byte) 118);
			Class302.method3551(-98);
			Class341.method3811(-8433);
			Class335.method3769((byte) 121);
			Class301.method3536((byte) -82);
			Class365.method3942(i + 36);
			Class13.method219(true);
			Class59.method531((byte) -124);
			Class115.method2154((byte) -67);
			Class304.method3561(-19357);
			Class264.method3225(true);
			Class132.method2234(0);
			Class198.method2682(false);
			Class212.method2776((byte) -102);
			Class280.method3329(-121);
			Class98_Sub39.method1467(true);
			Class123.method2210(i + 145149062);
			RSByteBuffer.method1243(81);
			Class117.method2163(-20732);
			IncomingOpcode.method522(77);
			Class265.method3231(-94);
			Class98_Sub46_Sub10.method1567((byte) 83);
			Class370.method3956(-121);
			Class346.method3830(-211);
			Class218.method2804((byte) -81);
			Class259.method3205(true);
			Player.method3064(-2485);
			Class147.method2414(i ^ ~0x65);
			Class101.method1696(true);
			OutgoingPacket.method1123((byte) -90);
			Class172.method2543(4390);
			Class98_Sub26.method1278(107);
			Class246_Sub3_Sub4_Sub2_Sub1.method3053(false);
			GameInterface.method1161(0);
			IComponentSettings.method1665((byte) 116);
			Class98_Sub46_Sub2.method1535(26767);
			Class246.method2963(i + -1);
			Class57.method518(30);
			Class343.method3818(-59);
			Class2.method170((byte) 53);
			Class53_Sub1.method500(-100);
			Class354.method3871(43594);//port
			RuntimeException_Sub1.method4013(16711935);
			Class188.method2638(23950);
			Class98_Sub46_Sub13_Sub2.method1599(109);
			Class98_Sub46_Sub13_Sub1.method1596((byte) 80);
			Class129.method2226((byte) 122);
			Class248.method3157(-2229);
			Class98_Sub46_Sub16.method1616(i ^ ~0x27);
			Class97.method934((byte) -26);
			Class226.method2853(1);
			AbstractModel.method2328(i);
			Class270.method3275(false);
			Class28.method298(-15136);
			Class138.method2279(100);
			Class310.method3617((byte) -59);
			Class352.method3862(-40);
			Class298.method3502(38);
			s.method3423(true);
			Class185.method2632((byte) -119);
			Class40.method363(i + -72);
			Class43.method414(-2);
			Class356.method3881(i ^ ~0x386c);
			Class145.method2314(-1);
			Class64_Sub23.method649(-111);
			Class64_Sub5.method569(true);
			Class64_Sub17.method616(-110);
			Class64_Sub13.method605(-2);
			Class64_Sub14.method608(-96);
			Class64_Sub11.method598(0);
			Class64_Sub24.method650(-36);
			Class64_Sub10.method593(34);
			Class64_Sub7.method577(i ^ 0x10);
			Class64_Sub18.method629(i ^ ~0x7e25);
			Class64_Sub15.method611((byte) -51);
			Class64_Sub16.method615(i ^ 0x3);
			Class64_Sub26.method659(i + 3);
			Class64_Sub9.method589(8);
			Class64_Sub20.method637(0);
			Class64_Sub8.method584(i);
			Class64_Sub3.method566(i ^ ~0xe26);
			Class64_Sub28.method672(i + 8192);
			Class64_Sub27.method665(2);
			Class64_Sub29.method676((byte) -58);
			Class64_Sub12.method599((byte) -13);
			Class64_Sub21.method638(4);
			Class64_Sub4.method567((byte) 81);
			Class64_Sub2.method563((byte) 122);
			Class64_Sub22.method642(97);
			Class64_Sub1.method557(i + 109);
			Class166.method2526(-19351);
			Class62.method543(0);
			Exception_Sub1.method133((byte) -127);
			aa.method151(true);
			za.method1676(-112);
			Class242.method2933(-115);
			Class98_Sub5.method957(i ^ ~0xdb4);
			Class221.method2822(-128);
			AnimableEntity.method2983((byte) -67);
			Class98_Sub31_Sub2.method1333(0);
			Class314.method3640(i);
			Class338.method3779(115);
			ClientScript2Runtime.method3154();
			Class105.method1714(-9);
			Class98_Sub43_Sub4.method1505(i + 21237);
			Class237.method2906(i + 10);
			Class98_Sub43_Sub3.method1497((byte) 95);
			Class98_Sub43_Sub1.method1491(-3);
			Class98_Sub31_Sub4.method1389(-18925);
			Class179.method2602((byte) -119);
			Class290.method3412(i ^ 0xffffffff);
			Class75.method734((byte) 97);
			Class161.method2515(1);
			Class194.method2658(255);
			Class260.method3209(-19788);
			Class213.method2783((byte) -124);
			Class160.method2512((byte) -119);
			Class255.method3191((byte) 49);
			Class282.method3338(0);
			Class90.method881((byte) -27);
			Class278.method3313();
			Class47.method449(i ^ 0x50);
			Class41.method365(0);
			Class375.method3987((byte) -73);
			Class272.method3279(false);
			Class308.method3610(-746085692);
			Class10.method198((byte) -47);
			Class295.method3483(0);
			Class234.method2885((byte) -116);
			Class63.method548((byte) -60);
			Class110.method2086((byte) 54);
			Class351.method3848((byte) -47);
			Class369.method3955(110);
			Class84.method835(2169);
			Class246_Sub1.method2968((byte) -101);
			Class325.method3700(2);
			Class246_Sub5.method3125();
			RenderAnimDefinitions.method3482(-10494);
			Class342.method3816(30935);
			Class312.method3621((byte) 7);
			Class263.method3221(-124);
			Class339.method3787((byte) -69);
			Class278_Sub1.method3319(1204);
			Class61.method542(false);
			Class157.method2507(57);
			Class98_Sub47.method1659(58);
			Class326.method3703();
			Class222.method2827((byte) -101);
			Class191.method2649(i ^ 0x79);
			Class300.method3532((byte) -63);
			ClientScript2Event.method1177(24301);
			Class98_Sub46_Sub4.method1542(i ^ 0x4c);
			Class159.method2510(4);
			Class142.method2306(-1);
			Class1.method163(68);
			Class245.method2955((byte) 67);
			Class246_Sub3_Sub1.method2993(i + 288450632);
			Class246_Sub3_Sub2.method3004(-123);
			Class246_Sub3_Sub3.method3013((byte) -93);
			Class246_Sub3_Sub5.method3089(4);
			Class154.method2492(-1);
			Class323.method3679(-1443);
			Class175.method2571();
			Class87.method853(i + -75);
			Class35.method334(i ^ ~0x7b);
			Class98_Sub1.method947(-20899);
			FrameDefinitions.method183();
			Class231.method2877(35);
			Class74.method727((byte) 5);
			Class107.method1726(false);
			Class320.method3664(i ^ 0x1765);
			Class98_Sub42.method1480((byte) 112);
			Class98_Sub13.method1136();
			Class176.method2581(84);
			Class376.method3989((byte) -40);
			Class98_Sub50.method1673(1);
			Class199.method2687(false);
			Class152.method2481(false);
			Class366.method3947(i ^ ~0x3ced);
			Class167.method2528((byte) 85);
			ParamType.method2432(0);
			Class220.method2817(-49);
			Class60.method534((byte) -63);
			Class266.method3233(86);
			Class379.method4007(true);
			Class98_Sub46_Sub12.method1587((byte) -99);
			Class92.method896(-1025810040);
			Class50.method483(-11543);
			Class100.method1691(i ^ ~0x8);
			Class23.method281((byte) 107);
			Class131.method2233(-11535);
			Class25.method292((byte) 41);
			Class137.method2275(121);
			Class211.method2774(79);
			Class150.method2436(true);
			Class254.method3188(-386);
			Class246_Sub2.method2970((byte) -101);
			Class246_Sub3_Sub4_Sub4.method3077((byte) -29);
			Class246_Sub3_Sub4_Sub3.method3072(i);
			Class246_Sub7.method3133((byte) 64);
			Class318.method3655(true);
			Class98_Sub45.method1518(i + 5);
			Class3.method171((byte) 126);
			Class98_Sub46_Sub11.method1577((byte) 99);
			Class348.method3837(2);
			Class275.method3282((byte) -53);
			Class246_Sub3_Sub2_Sub1.method3010((byte) -37);
			Class246_Sub3_Sub3_Sub1.method3017((byte) 97);
			Class359.method3896(11);
			Class246_Sub3_Sub5_Sub1.method3090((byte) -94);
			Class246_Sub3_Sub4_Sub5.method3087(-1001);
			Class246_Sub3_Sub1_Sub2.method3001(-22408);
			Class78.method792(-17344);
			Class77_Sub1.method785(3);
			Class299_Sub2.method3522(false);
			Class113.method2146((byte) 122);
			Class124.method2214(i);
			Class210.method2773(i + 3);
			Class163.method2521((byte) -106);
			Class367.method3948(true);
			Class93_Sub1.method902(2);
			Class52.method492(true);
			Class337_Sub1.method3776((byte) 52);
			Class93_Sub3.method912(58);
			Class337.method3775(i + 10003);
			Class315.method3645(false);
			Class238.method2918(-92);
			Class98_Sub46_Sub19.method1632((byte) 37);
			Class306.method3597(92);
			Class177.method2585((byte) 70);
			Class98_Sub46_Sub1.method1530(true);
			Class357.method3883(-71);
			Class130.method2231(0);
			Class31.method307(true);
			IOException_Sub1.method126(65535);
			PlayerUpdateMask.method711(-23308);
			Class27.method295((byte) -124);
			Class374.method3985(0);
			Class330.method3714();
			Class331.method3724(-88);
			Class98_Sub46_Sub2_Sub2.method1539(22412);
			Class98_Sub46_Sub20.method1636(true);
			Class246_Sub3_Sub1_Sub1.method2999(i + 25581);
			Class246_Sub3_Sub4_Sub1.method3029(-1);
			Class45.method432((byte) 102);
			Class246_Sub3_Sub5_Sub2.method3097(0);
			Class98_Sub6.method975(1);
			Class98_Sub34.method1451(i + -112);
			Class98_Sub15.method1145(97);
			Class53.method494((byte) 116);
			Class114.method2150(0);
			Class271.method3276((byte) 87);
			Class358.method3888((byte) -3);
			Class98_Sub16.method1146(false);
			Class173.method2554();
			Class98_Sub31_Sub1.method1329((byte) -84);
			Class98_Sub44.method1516(i);
			Class344.method3823();
			Class56.method515();
			Class89.method879(true);
			Class268_Sub1.method3263();
			Class208.method2768(104);
			Class98_Sub43_Sub2.method1494(4);
			Class340.method3804((byte) -71);
			Class54.method505((byte) 123);
			PlayerUpdate.method2856(i);
			Class180.method2605((byte) -127);
			Class217.method2801((byte) 101);
			Class133.method2240((byte) 16);
			Class334.method3763(true);
			Class134.method2241(-115);
			Class373_Sub2.method3975((byte) -10);
			Class373.method3961(i ^ ~0xeba);
			Class93.method899(i ^ 0x7a);
			Class373_Sub3.method3979(false);
			PacketParser.method3968(false);
			Class19.method251(51);
			Class5.method177(i + 7681);
			Class373_Sub1_Sub1.method3971(0);
			Class267.method3240(i ^ 0x1);
			Class368.method3949((byte) 49);
			Class136.method2269();
			Class292.method3448(1);
			Class44.method429((byte) 74);
			Class4.method175(10);
			Class98_Sub46_Sub6.method1549((byte) -112);
			Class246_Sub4_Sub2.method3106((byte) 116);
			Class246_Sub9.method3137(-6086);
			Class252.method3172(0);
			Class165.method2524((byte) -108);
			Class284.method3355(15029);
			Class223.method2832((byte) 71);
			Class16.method235((byte) 102);
			Class98_Sub46_Sub20_Sub2.method1640((byte) 45);
			Class277.method3291(114);
			Class262.method3214(i ^ ~0x7b);
			Class98_Sub10_Sub13.method1042(127);
			Class98_Sub41.method1474(false);
			Class98_Sub32.method1440(-104);
			Class186.method2633(-20830);
			Class235.method2890(64);
			ha_Sub1.method1862(i);
			Class364.method3936((byte) -59);
			Class55.method506(false);
			Class283.method3352(13);
			Class98_Sub28_Sub1.method1308((byte) 113);
			Class360.method3913((byte) 112);
			Class111_Sub1.method2114((byte) 66);
			Class332_Sub1.method3751(i ^ 0x1702);
			Class288.method3397(true);
			Class42_Sub1.method384(-40);
			Class48_Sub1.method459(false);
			Class42_Sub1_Sub1.method386(-16573);
			Class146_Sub2.method2378(0);
			Class104.method1713((byte) 23);
			Class98_Sub22_Sub2.method1263(-125);
			Class42_Sub2.method390(false);
			ha_Sub3.method2024(true);
			Class169.method2536(i + -116);
			Class162.method2517(-120);
			Class195.method2660(i ^ 0x68dd);
			Class111_Sub3.method2127(-51);
			Class204.method2707((byte) 15);
			Class258.method3204((byte) -18);
			Class319.method3658((byte) 114);
			Class76.method744(i + 87);
			Class81.method820(i + 1);
			Class146_Sub3.method2400(-1);
			Class65.method680((byte) -108);
			Class38.method346(255);
			Class49.method482(13);
			Class232.method2881(false);
			Class69_Sub2.method708(7315);
			Class182.method2614();
			Class98_Sub10_Sub22.method1072((byte) -121);
			Class98_Sub10_Sub3.method1011(true);
			Class98_Sub10_Sub38.method1118(true);
			Class98_Sub10_Sub24.method1078((byte) 98);
			Class98_Sub10_Sub15.method1049((byte) 21);
			Class98_Sub10_Sub7.method1024((byte) 114);
			Class98_Sub10_Sub11.method1040(i + -80);
			Class98_Sub10_Sub4.method1013(119);
			Class98_Sub10_Sub30.method1094(615);
			Class98_Sub10_Sub8.method1028(false);
			Class98_Sub10_Sub17.method1053((byte) 40);
			Class98_Sub10_Sub26.method1082(i + 125);
			Class98_Sub10_Sub6.method1020(i + 2048);
			Class98_Sub10_Sub39.method1119(0);
			Class98_Sub10_Sub27.method1085(i + 82);
			Class98_Sub10_Sub16.method1051(false);
			Class98_Sub10_Sub14.method1048((byte) -100);
			Class98_Sub10_Sub31.method1095(10640);
			Class98_Sub10_Sub23.method1073(4096);
			Class98_Sub10_Sub28.method1088(i ^ ~0x5a);
			Class98_Sub10_Sub36.method1112(0);
			Class98_Sub10_Sub10.method1039(75);
			Class98_Sub10_Sub34.method1105(83);
			Class98_Sub10_Sub37.method1113(i);
			Class98_Sub10_Sub20.method1062(0);
			Class98_Sub10_Sub1.method1006(-1);
			Class98_Sub10_Sub21.method1068((byte) -48);
			Class94.method918(-19406);
			Class98_Sub2.method950();
			aa_Sub1.method154((byte) 29);
			Class170.method2539((byte) 13);
			Class329.method3712((byte) 21);
			Class98_Sub32_Sub1.method1442(true);
			Class98_Sub5_Sub3.method973(1);
			Class187.method2635(109);
			Class33.method327((byte) -128);
			Class156_Sub1.method2497((byte) -81);
			s_Sub1.method3431(i ^ ~0x7f);
			Class336.method3774(-43327976);
			Class98_Sub46_Sub14.method1606((byte) 113);
			Class151.method2438(-24883);
			Class151_Sub9.method2469(i ^ 0x7fffffff);
			Class249.method3163((byte) 95);
			Class219.method2813(false);
			r_Sub1.method1644(9949);
			aa_Sub3.method158(6406);
			Class91.method889(true);
			Class98_Sub20.method1166(-22268);
			Class202.method2699((byte) 44);
			Class48_Sub1_Sub1.method460(true);
			IncomingMessages.method467(1);
			Class287_Sub2.method3394(90);
			Class287.method3388(32414);
			Class287_Sub1.method3390(i ^ ~0x6fc5);
			Class151_Sub6.method2465((byte) 89);
			Class151_Sub3.method2456(73);
			Class151_Sub1.method2447(32132);
			Class42_Sub3.method392(i ^ ~0x35);
			Class151_Sub7.method2467(0);
			Class151_Sub5.method2461(-3);
			Class151_Sub8.method2468((byte) -101);
			Class151_Sub4.method2460(23777);
			Class151_Sub2.method2452(928);
			Class345.method3826(-70);
			Class144.method2312(-6569);
			Class34.method329(i);
			Class200.method2695(-382);
			za_Sub1.method1678(-129);
			Class281.method3332(22011);
			Class181.method2606(-16841);
			r_Sub2.method1649(true);
			Class241.method2932(14441);
			Class39_Sub1.method354((byte) -107);
			Class332_Sub2.method3755(-14320);
			aa_Sub2.method156(13);
			Class98_Sub30.method1318(i + -10);
			Class15.method233(8);
			Class48_Sub2_Sub1.method475(i ^ 0x46c2e462);
			Class98_Sub5_Sub1.method967((byte) 77);
			Class76_Sub4.method753(116);
			Class76_Sub7.method761((byte) 19);
			Class76_Sub5.method757((byte) 4);
			Class76_Sub11.method772((byte) 105);
			Class284_Sub2.method3376(-128);
			Class284_Sub1.method3364(i + 13432);
			Class39.method351(true);
			Class303.method3558(10);
			Class21_Sub1.method270(i);
			Class21.method257(0);
			Class21_Sub2.method272((byte) 86);
			Class21_Sub4.method277((byte) 0);
			Class76_Sub8.method764((byte) 122);
			Class76_Sub2.method750(i);
			Class76_Sub9.method767(true);
			Class82.method821(i + 14);
			Class69.method699(-95);
			Class256_Sub1.method3194(0);
			Class224.method2833((byte) -122);
			Class224_Sub1.method2835(-15870);
			Class224_Sub3_Sub1.method2841((byte) -101);
			Class224_Sub3.method2840((byte) 102);
			Class98_Sub40.method1472(-1);
			Class98_Sub37.method1463((byte) 119);
			Class190.method2646(i + 27387);
			Class98_Sub25.method1271(573132577);
			Class230.method2872((byte) -80);
			Class246_Sub4_Sub1.method3102((byte) -62);
			Class98_Sub46_Sub5.method1545((byte) 78);
			Class98_Sub46_Sub3.method1540(false);
			Class98_Sub36.method1457(-2496);
			Class244.method2954(126);
			InputStream_Sub1.method122(false);
			OutputStream_Sub1.method131((byte) 4);
			Class73.method720(-63);
			Class250.method3165(76);
			Class98_Sub46_Sub15.method1612(true);
			Class98_Sub12.method1129(false);
			Class98_Sub23.method1266(-6292);
			Class98_Sub46_Sub9.method1560((byte) 118);
			Class98_Sub46_Sub8.method1552(true);
			Class98_Sub8.method987(125);
			Class98_Sub17_Sub1.method1159(-15367);
			Class127.method2218(0);
			OutputStream_Sub2.method132(-1);
			Class216.method2798(0);
			Class98_Sub9.method988(i ^ 0x7166);
			Class98_Sub46_Sub7.method1551((byte) -28);
			Class372.method3958(-12477);
			Class322.method3669(i ^ 0x3ca9);
			Class284_Sub2_Sub2.method3378(i + 8);
			Class284_Sub1_Sub2.method3369((byte) -54);
			Class189.method2641((byte) 120);
			Class18.method246((byte) -102);
			Class378.method4002(115);
			Class251.method3169((byte) 11);
			Class168.method2532((byte) -6);
			Class119.method2175((byte) -30);
			Class119_Sub1.method2181(true);
			Class119_Sub2.method2184((byte) 72);
			Class119_Sub4.method2189((byte) -1);
			Class284_Sub1_Sub1.method3365((byte) 89);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.N(" + i + ')');
		}
		if (Applet_Sub1.anInt4 != 0)
			aBoolean3553 = true;
	}

	static final void method101() {
		for (int i = 0; i < GameWorld.size_x; i++) {
			int[] is = Class372.anIntArrayArray3149[i];
			for (int i_10_ = 0; i_10_ < GameWorld.size_y; i_10_++)
				is[i_10_] = 0;
		}
	}

	static final GameInterfaceData method102(GameInterfaceData class293) {
		int i = getClickMask(class293).method1663(1);
		if (i == 0)
			return null;
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			class293 = Class159.method2509(((GameInterfaceData) class293).anInt2234, -9820);
			if (class293 == null)
				return null;
		}
		return class293;
	}

	static final void method103(int i, ha var_ha) {
		do {
			try {
				if (i != 0)
					anInt3550 = -100;
				if ((Canvas_Sub1.anInt26 != ((AnimableEntity) Player.selfPlayer).height_level) && (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null)) {
					if (!Class98_Sub10_Sub5.method1015(var_ha, (((AnimableEntity) Player.selfPlayer).height_level), 8939))
						break;
					Canvas_Sub1.anInt26 = (((AnimableEntity) Player.selfPlayer).height_level);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("client.AA(" + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method93(int i) {
		do {
			try {
				do {
					if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 123) ^ 0xffffffff) != -3) {
						method99((byte) -9);
						if (!aBoolean3553)
							break;
					}
					try {
						method99((byte) -9);
					} catch (ThreadDeath threaddeath) {
						throw threaddeath;
					} catch (Throwable throwable) {
						Map.method3585(throwable, -124, (throwable.getMessage() + " (Recovered) " + method94(0)));
						Class223.aBoolean1679 = true;
						Class76_Sub4.method754(0, false, 70);
					}
				} while (false);
				if (i > 91)
					break;
				method110(-22);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "client.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method104(GameInterfaceData[] class293s, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		for (int i_22_ = 0; i_22_ < class293s.length; i_22_++) {
			GameInterfaceData comp = class293s[i_22_];
			if (comp != null && ((GameInterfaceData) comp).anInt2234 == i) {
				int i_23_ = ((GameInterfaceData) comp).anInt2347 + i_16_;
				int i_24_ = ((GameInterfaceData) comp).anInt2299 + i_17_;
				int i_25_;
				int i_26_;
				int i_27_;
				int i_28_;
				if (((GameInterfaceData) comp).type == 2) {
					i_25_ = i_12_;
					i_26_ = i_13_;
					i_27_ = i_14_;
					i_28_ = i_15_;
				} else {
					int i_29_ = i_23_ + ((GameInterfaceData) comp).anInt2311;
					int i_30_ = i_24_ + ((GameInterfaceData) comp).anInt2258;
					if (((GameInterfaceData) comp).type == 9) {
						i_29_++;
						i_30_++;
					}
					i_25_ = i_23_ > i_12_ ? i_23_ : i_12_;
					i_26_ = i_24_ > i_13_ ? i_24_ : i_13_;
					i_27_ = i_29_ < i_14_ ? i_29_ : i_14_;
					i_28_ = i_30_ < i_15_ ? i_30_ : i_15_;
				}
				if (((GameInterfaceData) comp).type != 0 && !((GameInterfaceData) comp).hasListener && ((IComponentSettings) getClickMask(comp)).optionMask == 0 && comp != Class189.aClass293_1457 && ((GameInterfaceData) comp).contentType != Class325.anInt2727 && (((GameInterfaceData) comp).contentType != Class373_Sub2.anInt5471)) {
					if (i_25_ < i_27_ && i_26_ < i_28_)
						Class98_Sub10_Sub21.method1066(108, comp);
				} else if (!method111(comp)) {
					int i_31_ = 0;
					int i_32_ = 0;
					if (za_Sub2.aBoolean6079) {
						i_31_ = Class189.method2642((byte) 42);
						i_32_ = Class335.method3765(false);
					}
					if (comp == Class255.draggedComponent && (Class365.method3939(4456, Class255.draggedComponent) != null)) {
						Class166.aBoolean1278 = true;
						Class167.anInt1286 = i_23_;
						Class259.anInt1960 = i_24_;
					}
					if (((GameInterfaceData) comp).aBoolean2222 || i_25_ < i_27_ && i_26_ < i_28_) {
						if (((GameInterfaceData) comp).aBoolean2286 && i_20_ >= i_25_ && i_21_ >= i_26_ && i_20_ < i_27_ && i_21_ < i_28_) {
							for (ClientScript2Event class98_sub21 = (ClientScript2Event) Class151_Sub3.aClass148_4977.method2418(32); class98_sub21 != null; class98_sub21 = (ClientScript2Event) Class151_Sub3.aClass148_4977.method2417(103)) {
								if (((ClientScript2Event) class98_sub21).aBoolean3980) {
									class98_sub21.remove();
									((GameInterfaceData) (((ClientScript2Event) class98_sub21).component)).aBoolean2322 = false;
								}
							}
							if (Class105.anInt3417 == 0) {
								Class255.draggedComponent = null;
								Class189.aClass293_1457 = null;
							}
							Class156_Sub2.anInt3423 = 0;
							Class253.aBoolean1930 = false;
							Class102.aBoolean889 = false;
							if (!Player.aBoolean6540)
								Class46.method435((byte) 103);
						}
						boolean bool;
						if ((Class2.aClass299_73.method3514(124) + i_31_ >= i_25_) && (Class2.aClass299_73.method3507((byte) 60) + i_32_) >= i_26_ && (Class2.aClass299_73.method3514(70) + i_31_ < i_27_) && (Class2.aClass299_73.method3507((byte) 49) + i_32_) < i_28_)
							bool = true;
						else
							bool = false;
						if (!Class98_Sub10_Sub9.aBoolean5585 && bool) {
							if (((GameInterfaceData) comp).anInt2317 >= 0)
								Class21_Sub2.anInt5387 = ((GameInterfaceData) comp).anInt2317;
							else if (((GameInterfaceData) comp).aBoolean2286)
								Class21_Sub2.anInt5387 = -1;
						}
						if (!Player.aBoolean6540 && i_20_ >= i_25_ && i_21_ >= i_26_ && i_20_ < i_27_ && i_21_ < i_28_)
							Class8.method186(59, comp, i_21_ - i_24_, i_20_ - i_23_);
						boolean bool_33_ = false;
						if (Class2.aClass299_73.method3506((byte) 121) && bool)
							bool_33_ = true;
						boolean bool_34_ = false;
						Class98_Sub17 class98_sub17 = ((Class98_Sub17) Class167.aClass148_1284.method2418(32));
						if (class98_sub17 != null && class98_sub17.method1156(-5) == 0 && class98_sub17.method1155(124) + i_31_ >= i_25_ && class98_sub17.method1151(123) + i_32_ >= i_26_ && class98_sub17.method1155(125) + i_31_ < i_27_ && class98_sub17.method1151(80) + i_32_ < i_28_)
							bool_34_ = true;
						if (((GameInterfaceData) comp).aByteArray2345 != null && !Class217.method2800(-8001)) {
							for (int i_35_ = 0; i_35_ < (((GameInterfaceData) comp).aByteArray2345).length; i_35_++) {
								if (!RtKeyListener.key_listener.is_key_down((((GameInterfaceData) comp).aByteArray2345[i_35_]), 5503)) {
									if (((GameInterfaceData) comp).anIntArray2221 != null)
										((GameInterfaceData) comp).anIntArray2221[i_35_] = 0;
								} else if ((((GameInterfaceData) comp).anIntArray2221) == null || (Class215.anInt1614 >= (((GameInterfaceData) comp).anIntArray2221[i_35_]))) {
									byte i_36_ = (((GameInterfaceData) comp).aByteArray2331[i_35_]);
									if (i_36_ == 0 || (((i_36_ & 0x8) == 0 || (!RtKeyListener.key_listener.is_key_down(86, 5503) && !RtKeyListener.key_listener.is_key_down(82, 5503) && !RtKeyListener.key_listener.is_key_down(81, 5503))) && ((i_36_ & 0x2) == 0 || RtKeyListener.key_listener.is_key_down(86, 5503)) && ((i_36_ & 0x1) == 0 || RtKeyListener.key_listener.is_key_down(82, 5503)) && ((i_36_ & 0x4) == 0 || (RtKeyListener.key_listener.is_key_down(81, 5503))))) {
										if (i_35_ < 10)
											Class303.method3557(i_35_ + 1, -1, "", -120, (((GameInterfaceData) comp).anInt2248));
										else if (i_35_ == 10) {
											Class98_Sub10_Sub32.method1098((byte) -118);
											IComponentSettings class98_sub49 = getClickMask(comp);
											Class98_Sub5_Sub2.method970(((IComponentSettings) class98_sub49).anInt4285, comp, class98_sub49.method1668(-1), -6838);
											Class287_Sub2.aString3272 = (Class170.method2538(-1, comp));
											if (Class287_Sub2.aString3272 == null)
												Class287_Sub2.aString3272 = "Null";
											Class246_Sub3_Sub3.aString6156 = ((((GameInterfaceData) comp).aString2224) + "<col=ffffff>");
										}
										int i_37_ = (((GameInterfaceData) comp).anIntArray2275[i_35_]);
										if ((((GameInterfaceData) comp).anIntArray2221) == null)
											((GameInterfaceData) comp).anIntArray2221 = (new int[(((GameInterfaceData) comp).aByteArray2345).length]);
										if (i_37_ != 0)
											((GameInterfaceData) comp).anIntArray2221[i_35_] = Class215.anInt1614 + i_37_;
										else
											((GameInterfaceData) comp).anIntArray2221[i_35_] = 2147483647;
									}
								}
							}
						}
						if (bool_34_)
							Class146_Sub3.method2405(comp, (byte) 52, i_31_ + class98_sub17.method1155(-89) - i_23_, i_32_ + class98_sub17.method1151(47) - i_24_);
						if (Class255.draggedComponent != null && Class255.draggedComponent != comp && bool && getClickMask(comp).canDrag(-1))
							Class162.draggedOnComponent = comp;
						if (comp == Class189.aClass293_1457) {
							Class239.aBoolean1840 = true;
							Class246_Sub3_Sub4_Sub2_Sub1.anInt6500 = i_23_;
							Class222.anInt1670 = i_24_;
						}
						if (((GameInterfaceData) comp).hasListener || ((GameInterfaceData) comp).contentType != 0) {
							if (bool && Class319.mouse_scroll_delta != 0 && (((GameInterfaceData) comp).onMouseWheelListener != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).aBoolean3980 = true;
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).mouse_y = Class319.mouse_scroll_delta;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).onMouseWheelListener;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								client.mouseOverScrollWidget = true;
							}
							if (Class255.draggedComponent != null || Player.aBoolean6540 || ((((GameInterfaceData) comp).contentType != Class87.anInt673) && Class156_Sub2.anInt3423 > 0)) {
								bool_34_ = false;
								bool_33_ = false;
								bool = false;
							}
							if (((GameInterfaceData) comp).contentType != 0) {
								if ((((GameInterfaceData) comp).contentType == Class22.anInt218) || (((GameInterfaceData) comp).contentType == Class64_Sub20.anInt3698)) {
									Class98_Sub32.aClass293_4107 = comp;
									if (s_Sub1.aClass346_5202 != null)
										s_Sub1.aClass346_5202.method3828(((GameInterfaceData) comp).anInt2258, 6, Class265.aHa1974);
									if (((GameInterfaceData) comp).contentType == Class22.anInt218) {
										if (!(Player.aBoolean6540) && i_20_ >= i_25_ && i_21_ >= i_26_ && i_20_ < i_27_ && i_21_ < i_28_) {
											Class39.method350(0, i_19_, i_18_, (Class265.aHa1974));
											for (Class246_Sub2 class246_sub2 = ((Class246_Sub2) (Class151_Sub2.aClass218_4973.method2803((byte) 15))); class246_sub2 != null; class246_sub2 = ((Class246_Sub2) (Class151_Sub2.aClass218_4973.method2809(false)))) {
												if (i_20_ >= (((Class246_Sub2) class246_sub2).anInt5074) && (i_20_ < (((Class246_Sub2) class246_sub2).anInt5073)) && (i_21_ >= (((Class246_Sub2) class246_sub2).anInt5071)) && (i_21_ < (((Class246_Sub2) class246_sub2).anInt5075))) {
													Class46.method435((byte) 101);
													Class246_Sub3_Sub3.method3012((((Class246_Sub2) class246_sub2).aClass246_Sub3_Sub4_Sub2_5076), (byte) -124);
												}
											}
										}
										continue;
									}
								}
								if (((GameInterfaceData) comp).contentType == Class325.anInt2727) {
									if (comp.method3469(Class265.aHa1974, 115) != null && (Class333.anInt3386 == 0 || Class333.anInt3386 == 3) && !(Player.aBoolean6540) && i_20_ >= i_25_ && i_21_ >= i_26_ && i_20_ < i_27_ && i_21_ < i_28_) {
										int i_38_ = i_20_ - i_23_;
										int i_39_ = i_21_ - i_24_;
										int i_40_ = (((GameInterfaceData) comp).anIntArray2217[i_39_]);
										if (i_38_ >= i_40_ && (i_38_ <= (i_40_ + (((GameInterfaceData) comp).anIntArray2298[i_39_])))) {
											i_38_ -= (((GameInterfaceData) comp).anInt2311) / 2;
											i_39_ -= (((GameInterfaceData) comp).anInt2258) / 2;
											int i_41_;
											if ((Class98_Sub46_Sub20_Sub2.anInt6319) == 4)
												i_41_ = ((int) (GameWorld.cameraGetHrot) & 0x3fff);
											else
												i_41_ = (((int) (GameWorld.cameraGetHrot) + Class204.anInt1553) & 0x3fff);
											int i_42_ = (Class284_Sub2_Sub2.anIntArray6200[i_41_]);
											int i_43_ = (Class284_Sub2_Sub2.anIntArray6202[i_41_]);
											if ((Class98_Sub46_Sub20_Sub2.anInt6319) != 4) {
												i_42_ = (i_42_ * (Class151.anInt1213 + 256)) >> 8;
												i_43_ = (i_43_ * (Class151.anInt1213 + 256)) >> 8;
											}
											int i_44_ = ((i_39_ * i_42_ + i_38_ * i_43_) >> 14);
											int i_45_ = ((i_39_ * i_43_ - i_38_ * i_42_) >> 14);
											int i_46_;
											int i_47_;
											if ((Class98_Sub46_Sub20_Sub2.anInt6319) == 4) {
												i_46_ = ((Class98_Sub46_Sub2_Sub2.anInt6295) >> 9) + (i_44_ >> 2);
												i_47_ = (Class135.anInt1051 >> 9) - (i_45_ >> 2);
											} else {
												int i_48_ = (Player.selfPlayer.getSize() - 1) * 256;
												i_46_ = ((((AnimableEntity) (Player.selfPlayer)).localXPos) - i_48_ >> 9) + (i_44_ >> 2);
												i_47_ = ((((AnimableEntity) (Player.selfPlayer)).localYPos) - i_48_ >> 9) - (i_45_ >> 2);
											}
											if (Class98_Sub10_Sub9.aBoolean5585 && (Class98_Sub4.anInt3826 & 0x40) != 0) {
												GameInterfaceData class293_49_ = (Class246_Sub9.method3139((byte) 72, Class187.anInt1450, Class310.anInt2652));
												if (class293_49_ != null)
													GameInterfaceData.method3470(false, true, 1L, Class336.anInt2823, i_46_, " ->", true, i_47_, 46, (long) (((((GameInterfaceData) comp).anInt2300) << 32) | (((GameInterfaceData) comp).anInt2248)), (((GameInterfaceData) comp).anInt2302), false, (Class287_Sub2.aString3272));
												else
													Class98_Sub10_Sub32.method1098((byte) 111);
											} else {
												if (Class4.aClass279_86 == (Class64_Sub2.aClass279_3643))
													GameInterfaceData.method3470(false, true, 1L, -1, i_46_, "", true, i_47_, 60, 0L, -1, false, (TextResources.FACE_HERE.get_text(Class374.anInt3159)));
												GameInterfaceData.method3470(false, true, 1L, Class199.anInt1541, i_46_, "", true, i_47_, 6, 0L, -1, false, Class218.aString1636);
											}
										}
									}
									continue;
								}
								if (((GameInterfaceData) comp).contentType == Class87.anInt673) {
									Class11.aClass293_120 = comp;
									if (bool)
										Class253.aBoolean1930 = true;
									if (bool_34_) {
										int i_50_ = (int) ((double) (i_31_ + (class98_sub17.method1155(19)) - i_23_ - ((((GameInterfaceData) comp).anInt2311) / 2)) * 2.0 / (double) (Class278.aFloat2064));
										int i_51_ = (int) -((double) (i_32_ + (class98_sub17.method1151(69)) - i_24_ - ((((GameInterfaceData) comp).anInt2258) / 2)) * 2.0 / (double) (Class278.aFloat2064));
										int i_52_ = (Class42_Sub4.anInt5371 + i_50_ + Class278.anInt2075);
										int i_53_ = (Class98_Sub40.anInt4197 + i_51_ + Class278.anInt2078);
										Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8.method1026(-3);
										if (class98_sub46_sub10 != null) {
											int[] is = new int[3];
											class98_sub46_sub10.method1563(31960, i_52_, is, i_53_);
											if (is != null) {
												if (RtKeyListener.key_listener.is_key_down(82, 5503) && (Player.rights > 0)) {
													Class351.shiftClickTele(is[2], is[1], is[0], -52);
													continue;
												}
												Class102.aBoolean889 = true;
												Class333.anInt3385 = is[0];
												Class122.anInt1009 = is[1];
												Class375.anInt3169 = is[2];
											}
											Class156_Sub2.anInt3423 = 1;
											Class81.aBoolean621 = false;
											ModelDefinitions.anInt1405 = Class2.aClass299_73.method3514(106);
											PlayerUpdateMask.anInt526 = Class2.aClass299_73.method3507((byte) 46);
										}
									} else if (bool_33_ && (Class156_Sub2.anInt3423 > 0)) {
										if (Class156_Sub2.anInt3423 == 1 && ((ModelDefinitions.anInt1405 != Class2.aClass299_73.method3514(64)) || (PlayerUpdateMask.anInt526 != (Class2.aClass299_73.method3507((byte) 89))))) {
											anInt3550 = Class42_Sub4.anInt5371;
											Class265.anInt1975 = Class98_Sub40.anInt4197;
											Class156_Sub2.anInt3423 = 2;
										}
										if (Class156_Sub2.anInt3423 == 2) {
											Class81.aBoolean621 = true;
											Class92.method891((anInt3550 + (int) ((double) ((ModelDefinitions.anInt1405) - (Class2.aClass299_73.method3514(27))) * 2.0 / (double) (Class278.aFloat2068))), -94);
											Class113.method2144(-4365, (Class265.anInt1975 - (int) ((double) ((PlayerUpdateMask.anInt526) - (Class2.aClass299_73.method3507((byte) 92))) * 2.0 / (double) (Class278.aFloat2068))));
										}
									} else {
										if (Class156_Sub2.anInt3423 > 0 && !Class81.aBoolean621) {
											if ((Map.anInt5303 == 1 || (r_Sub1.method1642((byte) 127))) && Class359.anInt3058 > 2)
												Class353.method3869(PlayerUpdateMask.anInt526, ModelDefinitions.anInt1405, -2);
											else if (Class98_Sub17_Sub1.method1160(90))
												Class353.method3869(PlayerUpdateMask.anInt526, ModelDefinitions.anInt1405, -2);
										}
										Class156_Sub2.anInt3423 = 0;
									}
									continue;
								}
								if (((GameInterfaceData) comp).contentType == Class239.anInt1841) {
									if (bool_33_)
										Class202.method2698((byte) 48, (i_32_ + Class2.aClass299_73.method3507((byte) 29) - i_24_), ((GameInterfaceData) comp).anInt2311, (i_31_ + Class2.aClass299_73.method3514(18) - i_23_), ((GameInterfaceData) comp).anInt2258);
									continue;
								}
								if (((GameInterfaceData) comp).contentType == Class373_Sub2.anInt5471) {
									Class304.method3563(i_24_, comp, i_23_, 60);
									continue;
								}
							}
							if (!((GameInterfaceData) comp).aBoolean2241 && bool_34_) {
								((GameInterfaceData) comp).aBoolean2241 = true;
								if (((GameInterfaceData) comp).anObjectArray2291 != null) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).aBoolean3980 = true;
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).anInt3985 = (i_31_ + class98_sub17.method1155(-25) - i_23_);
									((ClientScript2Event) class98_sub21).mouse_y = (i_32_ + class98_sub17.method1151(54) - i_24_);
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2291);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								}
							}
							if (((GameInterfaceData) comp).aBoolean2241 && bool_33_ && (((GameInterfaceData) comp).anObjectArray2335 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).aBoolean3980 = true;
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).anInt3985 = (i_31_ + Class2.aClass299_73.method3514(118) - i_23_);
								((ClientScript2Event) class98_sub21).mouse_y = (i_32_ + Class2.aClass299_73.method3507((byte) 47) - i_24_);
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2335;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							if (((GameInterfaceData) comp).aBoolean2241 && !bool_33_) {
								((GameInterfaceData) comp).aBoolean2241 = false;
								if (((GameInterfaceData) comp).anObjectArray2356 != null) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).aBoolean3980 = true;
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).anInt3985 = (i_31_ + Class2.aClass299_73.method3514(47) - i_23_);
									((ClientScript2Event) class98_sub21).mouse_y = (i_32_ + Class2.aClass299_73.method3507((byte) 72) - i_24_);
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2356);
									Class98_Sub46_Sub10.aClass148_6018.add_last(class98_sub21, -20911);
								}
							}
							if (bool_33_ && (((GameInterfaceData) comp).anObjectArray2230 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).aBoolean3980 = true;
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).anInt3985 = (i_31_ + Class2.aClass299_73.method3514(51) - i_23_);
								((ClientScript2Event) class98_sub21).mouse_y = (i_32_ + Class2.aClass299_73.method3507((byte) 85) - i_24_);
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2230;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							if (!((GameInterfaceData) comp).aBoolean2322 && bool) {
								((GameInterfaceData) comp).aBoolean2322 = true;
								if (((GameInterfaceData) comp).anObjectArray2227 != null) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).aBoolean3980 = true;
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).anInt3985 = (i_31_ + Class2.aClass299_73.method3514(10) - i_23_);
									((ClientScript2Event) class98_sub21).mouse_y = (i_32_ + Class2.aClass299_73.method3507((byte) 124) - i_24_);
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2227);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								}
							}
							if (((GameInterfaceData) comp).aBoolean2322 && bool && (((GameInterfaceData) comp).anObjectArray2314 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).aBoolean3980 = true;
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).anInt3985 = (i_31_ + Class2.aClass299_73.method3514(45) - i_23_);
								((ClientScript2Event) class98_sub21).mouse_y = (i_32_ + Class2.aClass299_73.method3507((byte) 99) - i_24_);
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2314;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							if (((GameInterfaceData) comp).aBoolean2322 && !bool) {
								((GameInterfaceData) comp).aBoolean2322 = false;
								if (((GameInterfaceData) comp).anObjectArray2272 != null) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).aBoolean3980 = true;
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).anInt3985 = i_31_ + Class2.aClass299_73.method3514(116) - i_23_;
									((ClientScript2Event) class98_sub21).mouse_y = (i_32_ + Class2.aClass299_73.method3507((byte) 77) - i_24_);
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2272);
									Class98_Sub46_Sub10.aClass148_6018.add_last(class98_sub21, -20911);
								}
							}
							if (((GameInterfaceData) comp).anObjectArray2270 != null) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2270;
								Class181.aClass148_1430.add_last(class98_sub21, -20911);
							}
							if (((GameInterfaceData) comp).anObjectArray2212 != null && (Class246_Sub4_Sub2.anInt6181 > ((GameInterfaceData) comp).anInt2223)) {
								if ((((GameInterfaceData) comp).anIntArray2297 == null) || ((Class246_Sub4_Sub2.anInt6181 - ((GameInterfaceData) comp).anInt2223) > 32)) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2212);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								} else {
									while_39_: for (int i_54_ = ((GameInterfaceData) comp).anInt2223; i_54_ < Class246_Sub4_Sub2.anInt6181; i_54_++) {
										int i_55_ = (Class98_Sub45.anIntArray4257[i_54_ & 0x1f]);
										for (int i_56_ = 0; i_56_ < (((GameInterfaceData) comp).anIntArray2297).length; i_56_++) {
											if ((((GameInterfaceData) comp).anIntArray2297[i_56_]) == i_55_) {
												ClientScript2Event class98_sub21 = new ClientScript2Event();
												((ClientScript2Event) class98_sub21).component = comp;
												((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2212);
												Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
												break while_39_;
											}
										}
									}
								}
								((GameInterfaceData) comp).anInt2223 = Class246_Sub4_Sub2.anInt6181;
							}
							if (((GameInterfaceData) comp).anObjectArray2320 != null && (Class96.anInt803 > ((GameInterfaceData) comp).anInt2282)) {
								if ((((GameInterfaceData) comp).anIntArray2342 == null) || ((Class96.anInt803 - ((GameInterfaceData) comp).anInt2282) > 32)) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2320);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								} else {
									while_40_: for (int i_57_ = ((GameInterfaceData) comp).anInt2282; i_57_ < Class96.anInt803; i_57_++) {
										int i_58_ = (LinkedList.anIntArray1196[i_57_ & 0x1f]);
										for (int i_59_ = 0; i_59_ < (((GameInterfaceData) comp).anIntArray2342).length; i_59_++) {
											if ((((GameInterfaceData) comp).anIntArray2342[i_59_]) == i_58_) {
												ClientScript2Event class98_sub21 = new ClientScript2Event();
												((ClientScript2Event) class98_sub21).component = comp;
												((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2320);
												Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
												break while_40_;
											}
										}
									}
								}
								((GameInterfaceData) comp).anInt2282 = Class96.anInt803;
							}
							if (((GameInterfaceData) comp).anObjectArray2269 != null && (Class239.anInt1844 > ((GameInterfaceData) comp).anInt2328)) {
								if ((((GameInterfaceData) comp).anIntArray2284 == null) || ((Class239.anInt1844 - ((GameInterfaceData) comp).anInt2328) > 32)) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2269);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								} else {
									while_41_: for (int i_60_ = ((GameInterfaceData) comp).anInt2328; i_60_ < Class239.anInt1844; i_60_++) {
										int i_61_ = (Class111_Sub1.anIntArray4682[i_60_ & 0x1f]);
										for (int i_62_ = 0; i_62_ < (((GameInterfaceData) comp).anIntArray2284).length; i_62_++) {
											if ((((GameInterfaceData) comp).anIntArray2284[i_62_]) == i_61_) {
												ClientScript2Event class98_sub21 = new ClientScript2Event();
												((ClientScript2Event) class98_sub21).component = comp;
												((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2269);
												Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
												break while_41_;
											}
										}
									}
								}
								((GameInterfaceData) comp).anInt2328 = Class239.anInt1844;
							}
							if (((GameInterfaceData) comp).anObjectArray2252 != null && (Class145.anInt1172 > ((GameInterfaceData) comp).anInt2323)) {
								if ((((GameInterfaceData) comp).anIntArray2249 == null) || ((Class145.anInt1172 - ((GameInterfaceData) comp).anInt2323) > 32)) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2252);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								} else {
									while_42_: for (int i_63_ = ((GameInterfaceData) comp).anInt2323; i_63_ < Class145.anInt1172; i_63_++) {
										int i_64_ = (Class78.anIntArray597[i_63_ & 0x1f]);
										for (int i_65_ = 0; i_65_ < (((GameInterfaceData) comp).anIntArray2249).length; i_65_++) {
											if ((((GameInterfaceData) comp).anIntArray2249[i_65_]) == i_64_) {
												ClientScript2Event class98_sub21 = new ClientScript2Event();
												((ClientScript2Event) class98_sub21).component = comp;
												((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2252);
												Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
												break while_42_;
											}
										}
									}
								}
								((GameInterfaceData) comp).anInt2323 = Class145.anInt1172;
							}
							if (((GameInterfaceData) comp).anObjectArray2278 != null && (Class93_Sub1.anInt5477 > ((GameInterfaceData) comp).anInt2276)) {
								if ((((GameInterfaceData) comp).anIntArray2271 == null) || ((Class93_Sub1.anInt5477 - ((GameInterfaceData) comp).anInt2276) > 32)) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2278);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								} else {
									while_43_: for (int i_66_ = ((GameInterfaceData) comp).anInt2276; i_66_ < Class93_Sub1.anInt5477; i_66_++) {
										int i_67_ = (Class98_Sub16.anIntArray3928[i_66_ & 0x1f]);
										for (int i_68_ = 0; i_68_ < (((GameInterfaceData) comp).anIntArray2271).length; i_68_++) {
											if ((((GameInterfaceData) comp).anIntArray2271[i_68_]) == i_67_) {
												ClientScript2Event class98_sub21 = new ClientScript2Event();
												((ClientScript2Event) class98_sub21).component = comp;
												((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2278);
												Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
												break while_43_;
											}
										}
									}
								}
								((GameInterfaceData) comp).anInt2276 = Class93_Sub1.anInt5477;
							}
							if ((Class98_Sub3.anInt3825 > ((GameInterfaceData) comp).anInt2247) && (((GameInterfaceData) comp).anObjectArray2239 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2239;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							if ((Class363.anInt3099 > ((GameInterfaceData) comp).anInt2247) && (((GameInterfaceData) comp).anObjectArray2215 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2215;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							if ((Class64_Sub22.anInt3705 > ((GameInterfaceData) comp).anInt2247) && (((GameInterfaceData) comp).anObjectArray2292 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2292;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							if ((Class64_Sub11.anInt3668 > ((GameInterfaceData) comp).anInt2247) && (((GameInterfaceData) comp).anObjectArray2294 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2294;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							if ((Class98_Sub36.anInt4161 > ((GameInterfaceData) comp).anInt2247) && (((GameInterfaceData) comp).anObjectArray2340 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2340;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
							((GameInterfaceData) comp).anInt2247 = Class24.anInt242;
							if (((GameInterfaceData) comp).anObjectArray2274 != null) {
								for (int i_69_ = 0; i_69_ < Class329.anInt2765; i_69_++) {
									ClientScript2Event class98_sub21 = new ClientScript2Event();
									((ClientScript2Event) class98_sub21).component = comp;
									((ClientScript2Event) class98_sub21).anInt3977 = Class21_Sub1.anInterface7Array5385[i_69_].method17(true);
									((ClientScript2Event) class98_sub21).anInt3976 = Class21_Sub1.anInterface7Array5385[i_69_].method15(13313);
									((ClientScript2Event) class98_sub21).cs2_params = (((GameInterfaceData) comp).anObjectArray2274);
									Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
								}
							}
							if (Class187.aBoolean1451 && (((GameInterfaceData) comp).anObjectArray2220 != null)) {
								ClientScript2Event class98_sub21 = new ClientScript2Event();
								((ClientScript2Event) class98_sub21).component = comp;
								((ClientScript2Event) class98_sub21).cs2_params = ((GameInterfaceData) comp).anObjectArray2220;
								Class151_Sub3.aClass148_4977.add_last(class98_sub21, -20911);
							}
						}
						if (((GameInterfaceData) comp).type == 5 && ((GameInterfaceData) comp).anInt2267 != -1)
							comp.method3467(0, Class101.aClass115_857, Class373_Sub2.aClass59_5470).method3828(((GameInterfaceData) comp).anInt2258, 6, Class265.aHa1974);
						Class98_Sub10_Sub21.method1066(124, comp);
						if (((GameInterfaceData) comp).type == 0) {
							method104(class293s, ((GameInterfaceData) comp).anInt2248, i_25_, i_26_, i_27_, i_28_, i_23_ - ((GameInterfaceData) comp).anInt2246, i_24_ - ((GameInterfaceData) comp).anInt2213, i_18_, i_19_, i_20_, i_21_);
							if (((GameInterfaceData) comp).interfaceComponents != null)
								method104(((GameInterfaceData) comp).interfaceComponents, ((GameInterfaceData) comp).anInt2248, i_25_, i_26_, i_27_, i_28_, i_23_ - ((GameInterfaceData) comp).anInt2246, i_24_ - ((GameInterfaceData) comp).anInt2213, i_18_, i_19_, i_20_, i_21_);
							GameInterface class98_sub18 = ((GameInterface) (Class116.aClass377_964.method3990((long) ((GameInterfaceData) comp).anInt2248, -1)));
							if (class98_sub18 != null) {
								if ((Class4.aClass279_86 == s_Sub1.aClass279_5197) && (((GameInterface) class98_sub18).interfaceClickThrough) == 0 && !(Player.aBoolean6540) && bool && !Class15.aBoolean169)
									Class46.method435((byte) 117);
								Class62.method544(i_20_, i_26_, ((GameInterface) class98_sub18).interfaceID, i_27_, 0, i_28_, i_23_, i_18_, i_19_, i_21_, i_24_, i_25_);
							}
						}
					}
				}
			}
		}
	}

	static final void method105(int i) {
		int i_70_ = Class2.anInt71;
		int[] is = Class319.anIntArray2705;
		for (int i_71_ = 0; i_71_ < i_70_ + Class150.anInt1211; i_71_++) {
			Mobile class246_sub3_sub4_sub2;
			if (i_71_ < i_70_)
				class246_sub3_sub4_sub2 = (Class151_Sub9.playerArray[is[i_71_]]);
			else
				class246_sub3_sub4_sub2 = (((Class98_Sub39) (Class98_Sub39) (Class260.aClass377_3254.method3990((long) Class325.anIntArray2726[i_71_ - i_70_], -1))).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
			if (((AnimableEntity) class246_sub3_sub4_sub2).height_level == i && (((Mobile) class246_sub3_sub4_sub2).anInt6372) >= 0) {
				int i_72_ = class246_sub3_sub4_sub2.getSize();
				if ((i_72_ & 0x1) == 0) {
					if ((((AnimableEntity) class246_sub3_sub4_sub2).localXPos & 0x1ff) != 0 || (((AnimableEntity) class246_sub3_sub4_sub2).localYPos & 0x1ff) != 0)
						continue;
				} else if ((((AnimableEntity) class246_sub3_sub4_sub2).localXPos & 0x1ff) != 256 || ((((AnimableEntity) class246_sub3_sub4_sub2).localYPos) & 0x1ff) != 256)
					continue;
				if (i_72_ == 1) {
					int i_73_ = (((AnimableEntity) class246_sub3_sub4_sub2).localXPos >> 9);
					int i_74_ = (((AnimableEntity) class246_sub3_sub4_sub2).localYPos >> 9);
					if ((((Mobile) class246_sub3_sub4_sub2).anInt6372) > Class372.anIntArrayArray3149[i_73_][i_74_]) {
						Class372.anIntArrayArray3149[i_73_][i_74_] = ((Mobile) class246_sub3_sub4_sub2).anInt6372;
						Class64_Sub28.anIntArrayArray3719[i_73_][i_74_] = 1;
					} else if (((Mobile) class246_sub3_sub4_sub2).anInt6372 == Class372.anIntArrayArray3149[i_73_][i_74_])
						Class64_Sub28.anIntArrayArray3719[i_73_][i_74_]++;
				} else {
					int i_75_ = (i_72_ - 1) * 256 + 60;
					int i_76_ = ((((AnimableEntity) class246_sub3_sub4_sub2).localXPos - i_75_) >> 9);
					int i_77_ = ((((AnimableEntity) class246_sub3_sub4_sub2).localYPos - i_75_) >> 9);
					int i_78_ = ((((AnimableEntity) class246_sub3_sub4_sub2).localXPos + i_75_) >> 9);
					int i_79_ = ((((AnimableEntity) class246_sub3_sub4_sub2).localYPos + i_75_) >> 9);
					for (int i_80_ = i_76_; i_80_ <= i_78_; i_80_++) {
						for (int i_81_ = i_77_; i_81_ <= i_79_; i_81_++) {
							if (((Mobile) class246_sub3_sub4_sub2).anInt6372 > Class372.anIntArrayArray3149[i_80_][i_81_]) {
								Class372.anIntArrayArray3149[i_80_][i_81_] = ((Mobile) class246_sub3_sub4_sub2).anInt6372;
								Class64_Sub28.anIntArrayArray3719[i_80_][i_81_] = 1;
							} else if (((Mobile) class246_sub3_sub4_sub2).anInt6372 == (Class372.anIntArrayArray3149[i_80_][i_81_]))
								Class64_Sub28.anIntArrayArray3719[i_80_][i_81_]++;
						}
					}
				}
			}
		}
	}

	final void method86(byte i) {
		try {
			if (i != -6)
				method104(null, 101, 22, 118, 53, 94, -102, -124, -49, -22, -63, 30);
			if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 122) ^ 0xffffffff) == -3) {
				try {
					method108((byte) 68);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Map.method3585(throwable, i ^ 0x7e, (throwable.getMessage() + " (Recovered) " + method94(0)));
					Class223.aBoolean1679 = true;
					Class76_Sub4.method754(0, false, -125);
				}
			} else
				method108((byte) 68);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.Q(" + i + ')');
		}
	}

	private final void method106(byte i) {
		do {
			try {
				if ((((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1065 ^ 0xffffffff) < (Class110.anInt944 ^ 0xffffffff)) {
					Class98_Sub46_Sub10.aClass354_6011.method3874(0);
					Class379.anInt3196 = ((((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1065) - 1) * 250;
					if ((Class379.anInt3196 ^ 0xffffffff) < -3001)
						Class379.anInt3196 = 3000;
					if ((((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1065) >= 2 && ((((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1066) ^ 0xffffffff) == -7) {
						this.method97((byte) 89, "js5connect_outofdate");
						Class177.anInt1376 = 14;
						break;
					}
					if ((((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1065) >= 4 && (((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1066) == -1) {
						this.method97((byte) -126, "js5crc");
						Class177.anInt1376 = 14;
						break;
					}
					if ((((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1065) >= 4 && Class48_Sub1_Sub1.method462(Class177.anInt1376, 126)) {
						if (((((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1066) ^ 0xffffffff) != -8 && (((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1066) != 9) {
							if (((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1066 <= 0)
								this.method97((byte) 112, "js5io");
							else if (s.aString2202 != null)
								this.method97((byte) -60, ("js5proxy_" + s.aString2202.trim()));
							else
								this.method97((byte) 125, "js5connect");
						} else
							this.method97((byte) -79, "js5connect_full");
						Class177.anInt1376 = 14;
						break;
					}
				}
				Class110.anInt944 = (((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1065);
				if ((Class379.anInt3196 ^ 0xffffffff) < -1)
					Class379.anInt3196--;
				else {
					try {
						if (i <= -127) {
							if (Class221.anInt1664 == 0) {
								Class98_Sub10_Sub36.aClass143_5745 = (Class98_Sub46_Sub10.aClass354_6011.method3870(-111, Class98_Sub43_Sub2.aClass88_5907));
								Class221.anInt1664++;
							}
							if ((Class221.anInt1664 ^ 0xffffffff) == -2) {
								if (((Class98_Sub10_Sub36.aClass143_5745.anInt1163) ^ 0xffffffff) == -3) {
									if ((Class98_Sub10_Sub36.aClass143_5745.anObject1162) != null)
										s.aString2202 = (String) (Class98_Sub10_Sub36.aClass143_5745.anObject1162);
									method107((byte) -119, 1000);
									break;
								}
								if (((Class98_Sub10_Sub36.aClass143_5745.anInt1163) ^ 0xffffffff) == -2)
									Class221.anInt1664++;
							}
							if ((Class221.anInt1664 ^ 0xffffffff) == -3) {
								Class219.aClass361_1642 = new Class361(((Socket) (Class98_Sub10_Sub36.aClass143_5745.anObject1162)), (Class98_Sub43_Sub2.aClass88_5907), 25000);
								RSByteBuffer class98_sub22 = new RSByteBuffer(5);
								class98_sub22.writeByte((((Class222) (Class298.aClass222_2480)).anInt1668));
								class98_sub22.writeInt(1571862888, 637);
								Class219.aClass361_1642.method3920((byte) 77, 0, 5, (((RSByteBuffer) class98_sub22).data));
								Class221.anInt1664++;
								Class337.aLong3537 = Class343.method3819(-47);
							}
							if (Class221.anInt1664 == 3) {
								if (Class48_Sub1_Sub1.method462(Class177.anInt1376, 127) || (Class219.aClass361_1642.method3915(95) > 0)) {
									int i_82_ = Class219.aClass361_1642.method3918(-14234);
									if (i_82_ != 0) {
										method107((byte) -96, i_82_);
										break;
									}
									Class221.anInt1664++;
								} else if ((Class343.method3819(-47) + -Class337.aLong3537) > 30000L) {
									method107((byte) -95, 1001);
									break;
								}
							}
							if ((Class221.anInt1664 ^ 0xffffffff) != -5)
								break;
							boolean bool = (Class48_Sub1_Sub1.method462(Class177.anInt1376, 127) || Class53_Sub1.method499(2048, Class177.anInt1376) || (Class246_Sub3_Sub3.method3011(-6410, Class177.anInt1376)));
							Class102[] class102s = Class102.method1704(4);
							RSByteBuffer class98_sub22 = new RSByteBuffer(4 * class102s.length);
							Class219.aClass361_1642.method3921(0, true, (((RSByteBuffer) class98_sub22).data).length, (((RSByteBuffer) class98_sub22).data));
							for (int i_83_ = 0; ((class102s.length ^ 0xffffffff) < (i_83_ ^ 0xffffffff)); i_83_++)
								class102s[i_83_].method1706(class98_sub22.readInt(-2), 107);
							Class98_Sub10_Sub38.aClass135_5765.method2260(Class219.aClass361_1642, !bool, (byte) 74);
							Class219.aClass361_1642 = null;
							Class221.anInt1664 = 0;
							Class98_Sub10_Sub36.aClass143_5745 = null;
						}
					} catch (java.io.IOException ioexception) {
						method107((byte) -118, 1002);
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "client.JA(" + i + ')');
			}
		} while (false);
	}

	final void method92(boolean bool) {
		try {
			if (Class66.aBoolean507)
				Class23.method283((byte) 98);
			Class98_Sub43_Sub1.method1493(124);
			if (Class265.aHa1974 != null)
				Class265.aHa1974.method1743(-1);
			if (GameInterface.aFrame3950 != null) {
				Class281.method3331(bool, GameInterface.aFrame3950, Class98_Sub43_Sub2.aClass88_5907);
				GameInterface.aFrame3950 = null;
			}
			if (aa_Sub1.aClass123_3561 != null) {
				aa_Sub1.aClass123_3561.method2207(-18);
				aa_Sub1.aClass123_3561 = null;
			}
			Class246_Sub3_Sub4_Sub5.method3084(true);
			Class98_Sub10_Sub38.aClass135_5765.method2249(-84);
			Class168.aClass253_1290.method3183((byte) -75);
			if (Class48_Sub2_Sub1.aClass265_5531 != null) {
				Class48_Sub2_Sub1.aClass265_5531.method3232((byte) -103);
				Class48_Sub2_Sub1.aClass265_5531 = null;
			}
			try {
				Class98_Sub37.aClass225_4178.method2843((byte) -54);
				int i = 0;
				if (bool != false)
					method115();
				for (/**/; i < 37; i++)
					Class55.aClass225Array444[i].method2843((byte) -99);
				Class252.aClass225_1926.method2843((byte) -73);
				Class195.aClass225_1502.method2843((byte) -67);
				Class42_Sub1_Sub1.method387(true);
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.F(" + bool + ')');
		}
	}

	private final void method107(byte i, int i_84_) {
		try {
			Class221.anInt1664 = 0;
			((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1065++;
			if (i >= -89)
				method115();
			Class98_Sub10_Sub36.aClass143_5745 = null;
			Class219.aClass361_1642 = null;
			((Class135) Class98_Sub10_Sub38.aClass135_5765).anInt1066 = i_84_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("client.HA(" + i + ',' + i_84_ + ')'));
		}
	}

	private final void method108(byte i) {
		try {
			if (Class177.anInt1376 != 14) {
				Class215.anInt1614++;
				if ((Class215.anInt1614 % 1000 ^ 0xffffffff) == -2) {
					GregorianCalendar gregoriancalendar = new GregorianCalendar();
					Class39_Sub1.anInt3591 = (600 * gregoriancalendar.get(11) + (gregoriancalendar.get(12) * 10 - -(gregoriancalendar.get(13) / 6)));
					Class76_Sub8.aRandom3767.setSeed((long) Class39_Sub1.anInt3591);
				}
				if (Class215.anInt1614 % 50 == 0) {
					Class98_Sub12.anInt3879 = Class98_Sub50.anInt4289;
					Class118.anInt975 = Class103.anInt892;
					Class98_Sub50.anInt4289 = 0;
					Class103.anInt892 = 0;
				}
				method109((byte) 59);
				if (Class161.aClass109_1261 != null)
					Class161.aClass109_1261.method1736(0);
				Class40.method360((byte) 79);
				Class64_Sub7.method578(16543);
				RtKeyListener.key_listener.method774((byte) -113);
				Class2.aClass299_73.method3516((byte) 108);
				if (Class265.aHa1974 != null)
					Class265.aHa1974.method1806((int) Class343.method3819(i ^ ~0x6a));
				Class301.method3540(-2);
				Class98_Sub46_Sub1.anInt5949 = 0;
				Class329.anInt2765 = 0;
				if (i != 68)
					method103(81, null);
				for (Interface7 interface7 = RtKeyListener.key_listener.method776((byte) 31); interface7 != null; interface7 = RtKeyListener.key_listener.method776((byte) 31)) {
					int i_85_ = interface7.method14(-111);
					if ((i_85_ ^ 0xffffffff) != -3 && (i_85_ ^ 0xffffffff) != -4) {
						if (i_85_ == 0 && (Class98_Sub46_Sub1.anInt5949 ^ 0xffffffff) > -76) {
							Class339.anInterface7Array2845[(Class98_Sub46_Sub1.anInt5949)] = interface7;
							Class98_Sub46_Sub1.anInt5949++;
						}
					} else {
						int i_86_ = interface7.method15(13313);
						if (!Class146_Sub3.method2408((byte) 57) || (i_86_ != 96 && i_86_ != 167 && (i_86_ ^ 0xffffffff) != -179)) {
							if (Class329.anInt2765 < 128) {
								Class21_Sub1.anInterface7Array5385[Class329.anInt2765] = interface7;
								Class329.anInt2765++;
							}
						} else if (!Class217.method2800(-8001))
							Class98_Sub20.method1173(0);
						else
							Class8.method187(true);
					}
				}
				Class319.mouse_scroll_delta = 0;
				for (Class98_Sub17 class98_sub17 = Class2.aClass299_73.method3508(600); class98_sub17 != null; class98_sub17 = Class2.aClass299_73.method3508(600)) {
					int i_87_ = class98_sub17.method1156(i ^ ~0x40);
					if (i_87_ == -1)
						Class64_Sub21.aClass148_3703.add_last(class98_sub17, -20911);
					else if (i_87_ != 6) {
						if (Class265.method3230(i + -192, i_87_)) {
							Class167.aClass148_1284.add_last(class98_sub17, i ^ ~0x51ea);
							if (Class167.aClass148_1284.method2424(0) > 10)
								Class167.aClass148_1284.method2421(i ^ 0x191a);
						}
					} else
						Class319.mouse_scroll_delta += class98_sub17.method1152(i + -66);
				}
				if (Class217.method2800(-8001))
					Class261.method3212(104);
				if (!Class48_Sub1_Sub1.method462(Class177.anInt1376, 126)) {
					if (Class199.method2690(Class177.anInt1376, 8))
						Class181.method2607((byte) 99);
				} else {
					Class98_Sub43_Sub1.method1490(-16798);
					Class32.method316(false);
				}
				if (!Class53_Sub1.method499(2048, Class177.anInt1376) || Class199.method2690(Class177.anInt1376, 8)) {
					if (Class246_Sub3_Sub3.method3011(-6410, Class177.anInt1376) && !Class199.method2690(Class177.anInt1376, i ^ 0x4c)) {
						method112(i + -58);
						Class332_Sub1.method3753(74);
					} else if (Class177.anInt1376 != 12) {
						if (!za_Sub2.method1683(i ^ ~0x2c64, Class177.anInt1376) || Class199.method2690(Class177.anInt1376, 8)) {
							if (Class177.anInt1376 == 13) {
								Class332_Sub1.method3753(120);
								if ((Class31.anInt300 ^ 0xffffffff) != 2 && (Class31.anInt300 ^ 0xffffffff) != -3 && Class31.anInt300 != 15)
									Class98_Sub10_Sub1.exitToLobby(false, false);
							}
						} else
							Class185.method2629((byte) -53);
					} else
						Class332_Sub1.method3753(115);
				} else {
					method112(10);
					Class64_Sub18.method628(19700);
					Class332_Sub1.method3753(113);
				}
				Class119_Sub3.method2186(i ^ ~0x7d, Class265.aHa1974);
				Class167.aClass148_1284.method2421(i ^ 0x191a);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.DA(" + i + ')');
		}
	}

	final String method94(int i) {
		try {
			if (i != 0)
				method95(13);
			String string = null;
			try {
				string = ("[1)" + Class272.anInt2038 + "," + aa_Sub2.anInt3562 + "," + GameWorld.size_x + "," + GameWorld.size_y + "|");
				if (Player.selfPlayer != null)
					string += ("2)" + Class43.anInt377 + "," + (Class272.anInt2038 + (((Mobile) Player.selfPlayer).walkQueueX[0])) + "," + ((((Mobile) Player.selfPlayer).walkQueueZ[0]) + aa_Sub2.anInt3562) + "|");
				string += ("3)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 124) + "|4)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4044.method648((byte) 122) + "|5)" + Class146_Sub2.method2391((byte) -59) + "|6)" + Class39_Sub1.anInt3593 + "," + Class98_Sub25.anInt4024 + "|");
				string += ("7)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub10_4070.method592((byte) 127) + "|");
				string += ("8)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073.method579((byte) 126) + "|");
				string += ("9)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064.method668((byte) 121) + "|");
				string += ("10)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056.method634((byte) 120) + "|");
				string += ("11)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub5_4065.method570((byte) 127) + "|");
				string += ("12)" + ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076.method564((byte) 126) + "|");
				string += "13)" + Class292.anInt3359 + "|";
				string += "14)" + Class177.anInt1376;
				if (Exception_Sub1.aClass98_Sub35_47 != null)
					string += "|15)" + (((Class98_Sub35) Exception_Sub1.aClass98_Sub35_47).anInt4129);
				try {
					if (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub8_4042.method583((byte) 125) == 2) {
						Class var_class = Class.forName("java.lang.ClassLoader");
						Field field = var_class.getDeclaredField("nativeLibraries");
						Class var_class_88_ = (Class.forName("java.lang.reflect.AccessibleObject"));
						Method method = var_class_88_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
						method.invoke(field, new Object[] { Boolean.TRUE });
						Vector vector = ((Vector) field.get((aClass3552 != null ? aClass3552 : (aClass3552 = method117("client"))).getClassLoader()));
						for (int i_89_ = 0; ((vector.size() ^ 0xffffffff) < (i_89_ ^ 0xffffffff)); i_89_++) {
							try {
								Object object = vector.elementAt(i_89_);
								Field field_90_ = object.getClass().getDeclaredField("name");
								method.invoke(field_90_, new Object[] { Boolean.TRUE });
								try {
									String string_91_ = (String) field_90_.get(object);
									if (string_91_ != null && (string_91_.indexOf("sw3d.dll") ^ 0xffffffff) != 0) {
										Field field_92_ = object.getClass().getDeclaredField("handle");
										method.invoke(field_92_, (new Object[] { Boolean.TRUE }));
										string += ("|16)" + Long.toHexString(field_92_.getLong(object)));
										method.invoke(field_92_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_90_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					}
				} catch (Throwable throwable) {
					/* empty */
				}
				string += "]";
			} catch (Throwable throwable) {
				/* empty */
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.H(" + i + ')');
		}
	}

	final synchronized void method87(int i) {
		try {
			if (Class76_Sub11.anApplet3799 != null && Class42_Sub3.aCanvas5361 == null && !((Class88) Class98_Sub43_Sub2.aClass88_5907).aBoolean675) {
				try {
					Class var_class = Class76_Sub11.anApplet3799.getClass();
					Field field = var_class.getDeclaredField("canvas");
					Class42_Sub3.aCanvas5361 = (Canvas) field.get(Class76_Sub11.anApplet3799);
					field.set(Class76_Sub11.anApplet3799, null);
					if (Class42_Sub3.aCanvas5361 != null)
						return;
				} catch (Exception exception) {
					/* empty */
				}
			}
			super.method87(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.J(" + i + ')');
		}
	}

	public static final void main(String[] strings) {
		try {
			try {
				if (strings.length != 6)
					Class98_Sub26.method1277(1, "Argument count");
				Class98_Sub46_Sub17.aClass354_6050 = new Class354();
				((Class354) Class98_Sub46_Sub17.aClass354_6050).anInt3011 = Integer.parseInt(strings[0]);
				Class299_Sub2.aClass354_5297 = new Class354();
				((Class354) Class299_Sub2.aClass354_5297).anInt3011 = Integer.parseInt(strings[1]);
				Class250.aClass354_1914 = new Class354();
				((Class354) Class250.aClass354_1914).anInt3011 = Integer.parseInt(strings[2]);
				Class64_Sub29.aClass196_3720 = Class98_Sub43_Sub2.aClass196_5908;
				if (!strings[3].equals("live")) {
					if (!strings[3].equals("rc")) {
						if (!strings[3].equals("wip"))
							Class98_Sub26.method1277(1, "modewhat");
						else
							Class73.aClass6_3485 = Class244.aClass6_1861;
					} else
						Class73.aClass6_3485 = Class1.aClass6_63;
				} else
					Class73.aClass6_3485 = Class2.aClass6_68;
				Class374.anInt3159 = Class76_Sub4.method755(false, strings[4]);
				if (Class374.anInt3159 == -1) {
					if (strings[4].equals("english"))
						Class374.anInt3159 = 0;
					else if (!strings[4].equals("german"))
						Class98_Sub26.method1277(1, "language");
					else
						Class374.anInt3159 = 1;
				}
				Class76_Sub7.aBoolean3761 = false;
				Class133.aBoolean3456 = false;
				if (!strings[5].equals("game0")) {
					if (!strings[5].equals("game1")) {
						if (!strings[5].equals("game2")) {
							if (!strings[5].equals("game3"))
								Class98_Sub26.method1277(1, "game");
							else
								Class4.aClass279_86 = Class98_Sub46.aClass279_4263;
						} else
							Class4.aClass279_86 = Class246_Sub3_Sub4_Sub1.aClass279_6240;
					} else
						Class4.aClass279_86 = Class64_Sub2.aClass279_3643;
				} else
					Class4.aClass279_86 = s_Sub1.aClass279_5197;
				Class89.aString716 = "";
				Class98_Sub10_Sub10.aString5593 = null;
				Class233.anInt1746 = 0;
				Class98_Sub46.anInt4260 = 0;
				Class98_Sub10_Sub30.aBoolean5712 = false;
				Class197.aLong1515 = 0L;
				Class64_Sub18.aBoolean3690 = Class146_Sub3.aBoolean4926 = true;
				Class98_Sub10_Sub7.aString5573 = null;
				Class23.aBoolean220 = false;
				Class98_Sub10_Sub15.anInt5619 = 0;
				Class98_Sub9.anInt3855 = ((Class279) Class4.aClass279_86).anInt2095;
				client var_client = new client();
				Class315.aClient3529 = var_client;
				var_client.method88(false, (((Class279) Class4.aClass279_86).aString2098), 37, 768, Class73.aClass6_3485.method182(-106) + 32, true, 637, 1024);
				Class284.aFrame2168.setLocation(40, 40);
			} catch (Exception exception) {
				Map.method3585(exception, -124, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.main(" + (strings != null ? "{...}" : "null") + ')');
		}
	}

	private final void method109(byte i) {
		do {
			try {
				boolean bool = Class98_Sub10_Sub38.aClass135_5765.method2256(4096);
				if (i != 59)
					anInt3550 = -77;
				if (bool)
					break;
				method106((byte) -128);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "client.EA(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method110(int i) {
		int i_93_ = Class2.anInt71;
		int[] is = Class319.anIntArray2705;
		int i_94_ = Class237_Sub1.aBoolean5044 ? i_93_ : i_93_ + Class150.anInt1211;
		for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
			Mobile class246_sub3_sub4_sub2;
			if (i_95_ < i_93_)
				class246_sub3_sub4_sub2 = (Class151_Sub9.playerArray[is[i_95_]]);
			else
				class246_sub3_sub4_sub2 = (((Class98_Sub39) (Class98_Sub39) (Class260.aClass377_3254.method3990((long) Class325.anIntArray2726[i_95_ - i_93_], -1))).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
			if (((AnimableEntity) class246_sub3_sub4_sub2).height_level == i) {
				((Mobile) class246_sub3_sub4_sub2).anInt6358 = 0;
				if ((((Mobile) class246_sub3_sub4_sub2).anInt6372) < 0)
					((Mobile) class246_sub3_sub4_sub2).aBoolean6371 = false;
				else {
					int i_96_ = class246_sub3_sub4_sub2.getSize();
					if ((i_96_ & 0x1) == 0) {
						if (((((AnimableEntity) class246_sub3_sub4_sub2).localXPos) & 0x1ff) != 0 || ((((AnimableEntity) class246_sub3_sub4_sub2).localYPos) & 0x1ff) != 0) {
							((Mobile) class246_sub3_sub4_sub2).aBoolean6371 = false;
							continue;
						}
					} else if (((((AnimableEntity) class246_sub3_sub4_sub2).localXPos) & 0x1ff) != 256 || ((((AnimableEntity) class246_sub3_sub4_sub2).localYPos) & 0x1ff) != 256) {
						((Mobile) class246_sub3_sub4_sub2).aBoolean6371 = false;
						continue;
					}
					if (i_96_ == 1) {
						int i_97_ = ((((AnimableEntity) class246_sub3_sub4_sub2).localXPos) >> 9);
						int i_98_ = ((((AnimableEntity) class246_sub3_sub4_sub2).localYPos) >> 9);
						if (((Mobile) class246_sub3_sub4_sub2).anInt6372 != Class372.anIntArrayArray3149[i_97_][i_98_]) {
							((Mobile) class246_sub3_sub4_sub2).aBoolean6371 = true;
							continue;
						}
						if (Class64_Sub28.anIntArrayArray3719[i_97_][i_98_] > 1) {
							Class64_Sub28.anIntArrayArray3719[i_97_][i_98_]--;
							((Mobile) class246_sub3_sub4_sub2).aBoolean6371 = true;
							continue;
						}
					} else {
						int i_99_ = (i_96_ - 1) * 256 + 252;
						int i_100_ = (((AnimableEntity) class246_sub3_sub4_sub2).localXPos) - i_99_ >> 9;
						int i_101_ = (((AnimableEntity) class246_sub3_sub4_sub2).localYPos) - i_99_ >> 9;
						int i_102_ = (((AnimableEntity) class246_sub3_sub4_sub2).localXPos) + i_99_ >> 9;
						int i_103_ = (((AnimableEntity) class246_sub3_sub4_sub2).localYPos) + i_99_ >> 9;
						if (!Class97.method935(i_103_, i_102_, i_100_, 50, i_101_, (((Mobile) class246_sub3_sub4_sub2).anInt6372))) {
							for (int i_104_ = i_100_; i_104_ <= i_102_; i_104_++) {
								for (int i_105_ = i_101_; i_105_ <= i_103_; i_105_++) {
									if (((Mobile) class246_sub3_sub4_sub2).anInt6372 == (Class372.anIntArrayArray3149[i_104_][i_105_]))
										Class64_Sub28.anIntArrayArray3719[i_104_][i_105_]--;
								}
							}
							((Mobile) class246_sub3_sub4_sub2).aBoolean6371 = true;
							continue;
						}
					}
					((Mobile) class246_sub3_sub4_sub2).aBoolean6371 = false;
					((AnimableEntity) class246_sub3_sub4_sub2).anInt5089 = (Perspective.getTileHeight((((AnimableEntity) class246_sub3_sub4_sub2).height_level), (((AnimableEntity) class246_sub3_sub4_sub2).localYPos), (((AnimableEntity) class246_sub3_sub4_sub2).localXPos)));
					Class222.method2826(class246_sub3_sub4_sub2, true);
				}
			}
		}
	}

	static final boolean method111(GameInterfaceData class293) {
		if (Class15.aBoolean169) {
			if (((IComponentSettings) getClickMask(class293)).optionMask != 0)
				return false;
			if (((GameInterfaceData) class293).type == 0)
				return false;
		}
		return ((GameInterfaceData) class293).aBoolean2295;
	}

	private final void method112(int i) {
		try {
			if ((Class177.anInt1376 ^ 0xffffffff) == -8 && Class64_Sub16.anInt3680 == 0) {
				if (Class98_Sub10_Sub6.anInt5569 > 1) {
					Class98_Sub36.anInt4161 = Class24.anInt242;
					Class98_Sub10_Sub6.anInt5569--;
				}
				if (!Player.aBoolean6540)
					Class46.method435((byte) 89);
				for (int i_106_ = 0; (i_106_ ^ 0xffffffff) > -101; i_106_++) {
					if (!Class98_Sub10_Sub24.method1076(114))
						break;
				}
			}
			Class279.anInt2099++;
			Class98_Sub1.method946(-1, i + -119, -1, null);
			Class304.method3563(-1, null, -1, 60);
			Class3.method172(118);
			Class24.anInt242++;
			for (int i_107_ = 0; ((Class98_Sub10_Sub20.anInt5640 ^ 0xffffffff) < (i_107_ ^ 0xffffffff)); i_107_++) {
				Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) Class163.aClass98_Sub39Array3516[i_107_]).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				if (class246_sub3_sub4_sub2_sub1 != null) {
					byte i_108_ = (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aByte1103);
					if ((0x1 & i_108_) != 0) {
						int i_109_ = class246_sub3_sub4_sub2_sub1.getSize();
						if ((0x2 & i_108_ ^ 0xffffffff) != -1 && (((Mobile) class246_sub3_sub4_sub2_sub1).anInt6434 ^ 0xffffffff) == -1 && Math.random() * 1000.0 < 10.0) {
							int i_110_ = (int) Math.round(-5.0 + (Math.random() * 10.0));
							int i_111_ = (int) Math.round(-5.0 + 10.0 * Math.random());
							if ((i_110_ ^ 0xffffffff) != -1 || (i_111_ ^ 0xffffffff) != -1) {
								int i_112_ = ((((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueX[0]) - -i_110_);
								int i_113_ = i_111_ + (((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueZ[0]);
								if ((i_112_ ^ 0xffffffff) > -1)
									i_112_ = 0;
								else if ((-i_109_ + (GameWorld.size_x - 1) ^ 0xffffffff) > (i_112_ ^ 0xffffffff))
									i_112_ = -1 + -i_109_ + GameWorld.size_x;
								if (i_113_ < 0)
									i_113_ = 0;
								else if ((GameWorld.size_y - i_109_ - 1) < i_113_)
									i_113_ = (GameWorld.size_y + (-i_109_ - 1));
								int i_114_ = (Applet_Sub1.findPath((Class167.aClass243Array1281[(((AnimableEntity) class246_sub3_sub4_sub2_sub1).height_level)]), i_109_, Class76_Sub5.anIntArray3743, 0, 0, i_113_, i_109_, (((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueZ[0]), Class117.anIntArray974, true, i_112_, -1, 48, (((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueX[0]), i_109_));
								if (i_114_ > 0) {
									if ((i_114_ ^ 0xffffffff) < -10)
										i_114_ = 9;
									for (int i_115_ = 0; ((i_115_ ^ 0xffffffff) > (i_114_ ^ 0xffffffff)); i_115_++) {
										((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueX[i_115_] = (Class76_Sub5.anIntArray3743[-1 + (i_114_ - i_115_)]);
										((Mobile) class246_sub3_sub4_sub2_sub1).walkQueueZ[i_115_] = (Class117.anIntArray974[-1 + i_114_ + -i_115_]);
										((Mobile) class246_sub3_sub4_sub2_sub1).aByteArray6443[i_115_] = (byte) 1;
									}
									((Mobile) class246_sub3_sub4_sub2_sub1).anInt6434 = i_114_;
								}
							}
						}
						Class333.method3762((byte) 57, true, class246_sub3_sub4_sub2_sub1);
						int i_116_ = Class98_Sub10_Sub13.method1041(class246_sub3_sub4_sub2_sub1, 0);
						Class108.method1729(-90, class246_sub3_sub4_sub2_sub1);
						Class284_Sub1_Sub2.method3370(Class366.anInt3121, i ^ 0x180a, class246_sub3_sub4_sub2_sub1, Class64_Sub23.anInt3708, i_116_);
						Class282.method3334((byte) 37, Class64_Sub23.anInt3708, class246_sub3_sub4_sub2_sub1);
						Class340.method3801(class246_sub3_sub4_sub2_sub1, -28111);
					}
				}
			}
			if (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0) {
				if (Class98_Sub46_Sub20_Sub2.anInt6319 != 2)
					Class183.method2620(0);
				else
					Class98_Sub46_Sub3.method1541(123);
				if (Class98_Sub46_Sub10.renderX >> 1205626121 < 14 || (Class98_Sub46_Sub10.renderX >> -1191358487 >= GameWorld.size_x - 14) || Class134.renderZ >> -1312364695 < 14 || ((Class134.renderZ >> 242670249 ^ 0xffffffff) <= (GameWorld.size_y - 14 ^ 0xffffffff)))
					Class61.method537((byte) 66);
			}
			for (;;) {
				ClientScript2Event class98_sub21 = (ClientScript2Event) Class181.aClass148_1430.method2421(6494);
				if (class98_sub21 == null)
					break;
				GameInterfaceData class293 = ((ClientScript2Event) class98_sub21).component;
				if (((GameInterfaceData) class293).anInt2300 >= 0) {
					GameInterfaceData class293_117_ = Class159.method2509(((GameInterfaceData) class293).anInt2234, -9820);
					if (class293_117_ == null || (((GameInterfaceData) class293_117_).interfaceComponents == null) || ((((GameInterfaceData) class293_117_).interfaceComponents).length <= ((GameInterfaceData) class293).anInt2300) || (((GameInterfaceData) class293_117_).interfaceComponents[((GameInterfaceData) class293).anInt2300]) != class293)
						continue;
				}
				ClientScript2Runtime.method3144(class98_sub21);
			}
			for (;;) {
				ClientScript2Event class98_sub21 = ((ClientScript2Event) Class98_Sub46_Sub10.aClass148_6018.method2421(6494));
				if (class98_sub21 == null)
					break;
				GameInterfaceData class293 = ((ClientScript2Event) class98_sub21).component;
				if ((((GameInterfaceData) class293).anInt2300 ^ 0xffffffff) <= -1) {
					GameInterfaceData class293_118_ = Class159.method2509(((GameInterfaceData) class293).anInt2234, -9820);
					if (class293_118_ == null || (((GameInterfaceData) class293_118_).interfaceComponents == null) || ((((GameInterfaceData) class293).anInt2300 ^ 0xffffffff) <= ((((GameInterfaceData) class293_118_).interfaceComponents).length ^ 0xffffffff)) || (((GameInterfaceData) class293_118_).interfaceComponents[((GameInterfaceData) class293).anInt2300]) != class293)
						continue;
				}
				ClientScript2Runtime.method3144(class98_sub21);
			}
			for (;;) {
				ClientScript2Event class98_sub21 = ((ClientScript2Event) Class151_Sub3.aClass148_4977.method2421(6494));
				if (class98_sub21 == null)
					break;
				GameInterfaceData class293 = ((ClientScript2Event) class98_sub21).component;
				if (((GameInterfaceData) class293).anInt2300 >= 0) {
					GameInterfaceData class293_119_ = Class159.method2509(((GameInterfaceData) class293).anInt2234, -9820);
					if (class293_119_ == null || (((GameInterfaceData) class293_119_).interfaceComponents == null) || ((((GameInterfaceData) class293_119_).interfaceComponents).length <= ((GameInterfaceData) class293).anInt2300) || class293 != (((GameInterfaceData) class293_119_).interfaceComponents[((GameInterfaceData) class293).anInt2300]))
						continue;
				}
				ClientScript2Runtime.method3144(class98_sub21);
			}
			if (Class255.draggedComponent != null)
				Class111_Sub3.method2118(19653);
			if ((Class215.anInt1614 % 1500 ^ 0xffffffff) == -1)
				Class4.method174((byte) 99);
			if (Class177.anInt1376 == 7 && (Class64_Sub16.anInt3680 ^ 0xffffffff) == -1)
				Class204.method2709((byte) 49);
			Class368.method3951((byte) -101);
			if (Class66.aBoolean507 && ((r_Sub1.aLong6322 ^ 0xffffffffffffffffL) > (-60000L + Class343.method3819(-47) ^ 0xffffffffffffffffL)))
				Class23.method283((byte) 98);
			if (i != 10)
				anInt3550 = -112;
			for (Class246_Sub4_Sub1 class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986.method2803((byte) 15)); class246_sub4_sub1 != null; class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986.method2809(false))) {
				if (-5L + Class343.method3819(-47) / 1000L > (long) (((Class246_Sub4_Sub1) class246_sub4_sub1).anInt6172)) {
					if (((Class246_Sub4_Sub1) class246_sub4_sub1).aShort6167 > 0)
						Class98_Sub45.add_message((byte) -97, 5, ((((Class246_Sub4_Sub1) class246_sub4_sub1).friendName) + (TextResources.HAS_LOGGED_IN.get_text(Class374.anInt3159))), 0, "", "", "");
					if (((Class246_Sub4_Sub1) class246_sub4_sub1).aShort6167 == 0)
						Class98_Sub45.add_message((byte) 109, 5, ((((Class246_Sub4_Sub1) class246_sub4_sub1).friendName) + (TextResources.HAS_LOGGED_OUT.get_text(Class374.anInt3159))), 0, "", "", "");
					class246_sub4_sub1.method2965((byte) -97);
				}
			}
			if (Class177.anInt1376 == 7 && (Class64_Sub16.anInt3680 ^ 0xffffffff) == -1) {
				if (aa_Sub1.aClass123_3561 == null)
					Class98_Sub10_Sub1.exitToLobby(false, false);
				else {
					Class196.anInt1511++;
					if ((Class196.anInt1511 ^ 0xffffffff) < -51) {
						Class76_Sub5.anInt3746++;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i ^ 0x10e, (Class98_Sub40.aClass171_4193), (Class331.aClass117_2811));
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					try {
						Class95.method920((byte) 124);
					} catch (java.io.IOException ioexception) {
						Class98_Sub10_Sub1.exitToLobby(false, false);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.U(" + i + ')');
		}
	}

	static final void method113() {
		Class98_Sub19.anInt3955 = 0;
		for (int i = 0; i < Class150.anInt1211; i++) {
			Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) (Class98_Sub39) Class260.aClass377_3254.method3990((long) Class325.anIntArray2726[i], -1)).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
			if ((((Mobile) class246_sub3_sub4_sub2_sub1).aBoolean6371) && class246_sub3_sub4_sub2_sub1.method3035(28213) != -1) {
				int i_120_ = ((class246_sub3_sub4_sub2_sub1.getSize() - 1) * 256 + 252);
				int i_121_ = (((AnimableEntity) class246_sub3_sub4_sub2_sub1).localXPos - i_120_) >> 9;
				int i_122_ = (((AnimableEntity) class246_sub3_sub4_sub2_sub1).localYPos - i_120_) >> 9;
				Mobile class246_sub3_sub4_sub2 = Class231.method2874((((AnimableEntity) class246_sub3_sub4_sub2_sub1).height_level), i_121_, i_122_, 64);
				if (class246_sub3_sub4_sub2 != null) {
					int i_123_ = (((Mobile) class246_sub3_sub4_sub2).anInt6369);
					if (class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub1)
						i_123_ += 2048;
					if ((((Mobile) class246_sub3_sub4_sub2).anInt6358) == 0 && class246_sub3_sub4_sub2.method3035(28213) != -1) {
						Class151_Sub1.anIntArray4969[Class98_Sub19.anInt3955] = i_123_;
						Class119_Sub2.anIntArray4727[Class98_Sub19.anInt3955] = i_123_;
						Class98_Sub19.anInt3955++;
						((Mobile) class246_sub3_sub4_sub2).anInt6358++;
					}
					Class151_Sub1.anIntArray4969[Class98_Sub19.anInt3955] = i_123_;
					Class119_Sub2.anIntArray4727[Class98_Sub19.anInt3955] = ((Mobile) class246_sub3_sub4_sub2_sub1).anInt6369 + 2048;
					Class98_Sub19.anInt3955++;
					((Mobile) class246_sub3_sub4_sub2).anInt6358++;
				}
			}
		}
		Class221.method2823((byte) -125, Class151_Sub1.anIntArray4969, Class119_Sub2.anIntArray4727, 0, Class98_Sub19.anInt3955 - 1);
	}

	static final void method114() {
		int i = Class2.anInt71;
		int[] is = Class319.anIntArray2705;
		int i_124_ = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub24_4047.method651((byte) 127);
		boolean bool = i_124_ == 1 && i > 200 || i_124_ == 0 && i > 50;
		for (int i_125_ = 0; i_125_ < i; i_125_++) {
			Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[is[i_125_]]);
			if (!class246_sub3_sub4_sub2_sub2.method3055((byte) 106))
				((Mobile) class246_sub3_sub4_sub2_sub2).anInt6372 = -1;
			else if (((Player) class246_sub3_sub4_sub2_sub2).cursed_orb_id)
				((Mobile) class246_sub3_sub4_sub2_sub2).anInt6372 = -1;
			else {
				class246_sub3_sub4_sub2_sub2.method3022(-8675);
				if ((((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub2).aShort6158) < 0 || (((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub2).aShort6157) < 0 || (((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub2).aShort6160) >= GameWorld.size_x || (((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub2).aShort6159) >= GameWorld.size_y)
					((Mobile) class246_sub3_sub4_sub2_sub2).anInt6372 = -1;
				else {
					((Player) class246_sub3_sub4_sub2_sub2).aBoolean6520 = (((Mobile) class246_sub3_sub4_sub2_sub2).aBoolean6359 ? bool : false);
					if (class246_sub3_sub4_sub2_sub2 == Player.selfPlayer)
						((Mobile) class246_sub3_sub4_sub2_sub2).anInt6372 = 2147483647;
					else {
						int i_126_ = 0;
						if (!((Mobile) class246_sub3_sub4_sub2_sub2).aBoolean6371)
							i_126_++;
						if (((Mobile) class246_sub3_sub4_sub2_sub2).anInt6418 > Class215.anInt1614)
							i_126_ += 2;
						i_126_ += (5 - class246_sub3_sub4_sub2_sub2.getSize() << 2);
						if (((Player) class246_sub3_sub4_sub2_sub2).aBoolean6534)
							i_126_ += 512;
						else {
							if (Class103.anInt896 == 0)
								i_126_ += 32;
							else
								i_126_ += 128;
							i_126_ += 256;
						}
						((Mobile) class246_sub3_sub4_sub2_sub2).anInt6372 = i_126_ + 1;
					}
				}
			}
		}
		for (int i_127_ = 0; i_127_ < Class150.anInt1211; i_127_++) {
			Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) (Class98_Sub39) Class260.aClass377_3254.method3990((long) (Class325.anIntArray2726[i_127_]), -1)).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
			if (!class246_sub3_sub4_sub2_sub1.method3052((byte) 106) || !((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504.method2296(Class75.aClass140_584, (byte) -118))
				((Mobile) class246_sub3_sub4_sub2_sub1).anInt6372 = -1;
			else {
				class246_sub3_sub4_sub2_sub1.method3022(-8675);
				if ((((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub1).aShort6158) < 0 || (((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub1).aShort6157) < 0 || (((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub1).aShort6160) >= GameWorld.size_x || (((Class246_Sub3_Sub4) class246_sub3_sub4_sub2_sub1).aShort6159) >= GameWorld.size_y)
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6372 = -1;
				else {
					int i_128_ = 0;
					if (!((Mobile) class246_sub3_sub4_sub2_sub1).aBoolean6371)
						i_128_++;
					if (((Mobile) class246_sub3_sub4_sub2_sub1).anInt6418 > Class215.anInt1614)
						i_128_ += 2;
					i_128_ += 5 - class246_sub3_sub4_sub2_sub1.getSize() << 2;
					if (Class103.anInt896 == 0) {
						if (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aBoolean1153)
							i_128_ += 64;
						else
							i_128_ += 128;
					} else if (Class103.anInt896 == 1) {
						if (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aBoolean1153)
							i_128_ += 32;
						else
							i_128_ += 64;
					}
					if (((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aBoolean1106)
						i_128_ += 1024;
					else if (!((Class141) (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2_sub1).aClass141_6504)).aBoolean1149)
						i_128_ += 256;
					((Mobile) class246_sub3_sub4_sub2_sub1).anInt6372 = i_128_ + 1;
				}
			}
		}
		for (int i_129_ = 0; i_129_ < Class104.aClass36Array903.length; i_129_++) {
			Class36 class36 = Class104.aClass36Array903[i_129_];
			if (class36 != null) {
				if (((Class36) class36).anInt346 == 1) {
					Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254.method3990((long) ((Class36) class36).anInt345, -1)));
					if (class98_sub39 != null) {
						Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						if (((Mobile) class246_sub3_sub4_sub2_sub1).anInt6372 >= 0)
							((Mobile) class246_sub3_sub4_sub2_sub1).anInt6372 += 2048;
					}
				} else if (((Class36) class36).anInt346 == 10) {
					Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[((Class36) class36).anInt345]);
					if (class246_sub3_sub4_sub2_sub2 != null && (class246_sub3_sub4_sub2_sub2 != Player.selfPlayer) && ((Mobile) class246_sub3_sub4_sub2_sub2).anInt6372 >= 0)
						((Mobile) class246_sub3_sub4_sub2_sub2).anInt6372 += 2048;
				}
			}
		}
	}

	final void method95(int i) {
		try {
			if (Class23.aBoolean220)
				Class292.anInt3359 = 64;
			if (i == -13395) {
				Frame frame = new Frame("Jagex");
				frame.pack();
				frame.dispose();
				Class98_Sub31_Sub2.method1336((byte) -106);
				Class168.aClass253_1290 = new Class253(Class98_Sub43_Sub2.aClass88_5907);
				Class98_Sub10_Sub38.aClass135_5765 = new Class135();
				Class157.method2502(new int[] { 20, 260 }, new int[] { 1000, 100 }, 0);
				if (Class64_Sub29.aClass196_3720 != Class43.aClass196_375)
					Class76.aByteArrayArray590 = new byte[50][];
				Class98_Sub9.aClass98_Sub27_3856 = Class98_Sub5_Sub3.method972(-122);
				if (Class43.aClass196_375 != Class64_Sub29.aClass196_3720) {
					if (!Class133.method2238(true, Class64_Sub29.aClass196_3720)) {
						if (Class98_Sub43_Sub2.aClass196_5908 == Class64_Sub29.aClass196_3720) {
							((Class354) Class98_Sub46_Sub17.aClass354_6050).aString3016 = RS2Loader.mainurl;
							((Class354) Class299_Sub2.aClass354_5297).aString3016 = RS2Loader.mainurl;
							((Class354) Class250.aClass354_1914).aString3016 = RS2Loader.mainurl;
							((Class354) Class98_Sub46_Sub17.aClass354_6050).anInt3015 = (((Class354) (Class98_Sub46_Sub17.aClass354_6050)).anInt3011 + 40000);
							((Class354) Class299_Sub2.aClass354_5297).anInt3015 = (40000 + (((Class354) Class299_Sub2.aClass354_5297).anInt3011));
							((Class354) Class250.aClass354_1914).anInt3015 = (((Class354) Class250.aClass354_1914).anInt3011) + 40000;
							((Class354) Class98_Sub46_Sub17.aClass354_6050).anInt3012 = (((Class354) (Class98_Sub46_Sub17.aClass354_6050)).anInt3011 + 50000);
							((Class354) Class299_Sub2.aClass354_5297).anInt3012 = (((Class354) Class299_Sub2.aClass354_5297).anInt3011) + 50000;
							((Class354) Class250.aClass354_1914).anInt3012 = (((Class354) Class250.aClass354_1914).anInt3011) + 50000;
						}
					} else {
						((Class354) Class98_Sub46_Sub17.aClass354_6050).aString3016 = this.getCodeBase().getHost();
						((Class354) Class98_Sub46_Sub17.aClass354_6050).anInt3015 = 40000 + ((Class354) (Class98_Sub46_Sub17.aClass354_6050)).anInt3011;
						((Class354) Class299_Sub2.aClass354_5297).anInt3015 = (((Class354) Class299_Sub2.aClass354_5297).anInt3011) + 40000;
						((Class354) Class250.aClass354_1914).anInt3015 = (((Class354) Class250.aClass354_1914).anInt3011 + 40000);
						((Class354) Class98_Sub46_Sub17.aClass354_6050).anInt3012 = (((Class354) Class98_Sub46_Sub17.aClass354_6050).anInt3011) + 50000;
						((Class354) Class299_Sub2.aClass354_5297).anInt3012 = (((Class354) Class299_Sub2.aClass354_5297).anInt3011) + 50000;
						((Class354) Class250.aClass354_1914).anInt3012 = 50000 - -(((Class354) Class250.aClass354_1914).anInt3011);
					}
				} else
					((Class354) Class98_Sub46_Sub17.aClass354_6050).aString3016 = this.getCodeBase().getHost();
				Class98_Sub46_Sub10.aClass354_6011 = Class98_Sub46_Sub17.aClass354_6050;
				if (Class64_Sub2.aClass279_3643 == Class4.aClass279_86) {
					Class299_Sub2.anInt5298 = 16777215;
					Class98_Sub10_Sub11.aShortArrayArray5597 = Class98_Sub10_Sub24.aShortArrayArray5669;
					Class109.aBoolean934 = true;
					Class189.anInt1455 = 0;
					Class61.aShortArrayArrayArray478 = Class119.aShortArrayArrayArray983;
				} else if (Class98_Sub46.aClass279_4263 == Class4.aClass279_86) {
					Class61.aShortArrayArrayArray478 = Class180.aShortArrayArrayArray3397;
					Class98_Sub10_Sub11.aShortArrayArray5597 = Class48_Sub1_Sub1.aShortArrayArray5503;
				} else {
					Class98_Sub10_Sub11.aShortArrayArray5597 = ClientScript2Event.aShortArrayArray3987;
					Class61.aShortArrayArrayArray478 = Class98_Sub46_Sub2_Sub2.aShortArrayArrayArray6299;
				}
				if (Class4.aClass279_86 == s_Sub1.aClass279_5197)
					Class246_Sub3_Sub5_Sub2.aBoolean6272 = false;
				Class246.aShortArray1869 = Class372.aShortArray3153 = Class265.aShortArray1977 = Class338.aShortArray2833 = new short[256];
				try {
					Class8.aClipboard113 = Class315.aClient3529.getToolkit().getSystemClipboard();
				} catch (Exception exception) {
					/* empty */
				}
				RtKeyListener.key_listener = Class368.method3950((byte) 10, Class42_Sub3.aCanvas5361);
				Class2.aClass299_73 = Class151_Sub3.method2457(Class42_Sub3.aCanvas5361, true, -16777216);
				try {
					if ((((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356_702) != null) {
						Class98_Sub37.aClass225_4178 = new Class225((((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356_702), 5200, 0);
						for (int i_130_ = 0; (i_130_ ^ 0xffffffff) > -38; i_130_++)
							Class55.aClass225Array444[i_130_] = new Class225((((Class88) (Class98_Sub43_Sub2.aClass88_5907)).aClass356Array695[i_130_]), 6000, 0);
						Class252.aClass225_1926 = new Class225((((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356_680), 6000, 0);
						Class29.aClass17_298 = new Class17(255, Class98_Sub37.aClass225_4178, Class252.aClass225_1926, 500000);
						Class195.aClass225_1502 = new Class225((((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356_685), 24, 0);
						((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356_685 = null;
						((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356_702 = null;
						((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356Array695 = null;
						((Class88) Class98_Sub43_Sub2.aClass88_5907).aClass356_680 = null;
					}
				} catch (java.io.IOException ioexception) {
					Class98_Sub37.aClass225_4178 = null;
					Class252.aClass225_1926 = null;
					Class29.aClass17_298 = null;
					Class195.aClass225_1502 = null;
				}
				if (Class43.aClass196_375 != Class64_Sub29.aClass196_3720)
					Class91.aBoolean725 = true;
				Class265.aString1978 = TextResources.LOADING_PLEASE_WAIT.get_text(Class374.anInt3159);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.D(" + i + ')');
		}
	}

	static final void method115() {
		int i = Class2.anInt71;
		int[] is = Class319.anIntArray2705;
		int i_131_ = Class237_Sub1.aBoolean5044 ? i : i + Class150.anInt1211;
		for (int i_132_ = 0; i_132_ < i_131_; i_132_++) {
			Mobile class246_sub3_sub4_sub2;
			if (i_132_ < i)
				class246_sub3_sub4_sub2 = (Class151_Sub9.playerArray[is[i_132_]]);
			else
				class246_sub3_sub4_sub2 = (((Class98_Sub39) (Class98_Sub39) (Class260.aClass377_3254.method3990((long) Class325.anIntArray2726[i_132_ - i], -1))).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
			if (((Mobile) class246_sub3_sub4_sub2).anInt6372 >= 0) {
				int i_133_ = class246_sub3_sub4_sub2.getSize();
				if ((i_133_ & 0x1) == 0) {
					if ((((AnimableEntity) class246_sub3_sub4_sub2).localXPos & 0x1ff) == 0 && (((AnimableEntity) class246_sub3_sub4_sub2).localYPos & 0x1ff) == 0)
						continue;
				} else if ((((AnimableEntity) class246_sub3_sub4_sub2).localXPos & 0x1ff) == 256 && ((((AnimableEntity) class246_sub3_sub4_sub2).localYPos) & 0x1ff) == 256)
					continue;
				((AnimableEntity) class246_sub3_sub4_sub2).anInt5089 = (Perspective.getTileHeight(((AnimableEntity) class246_sub3_sub4_sub2).height_level, ((AnimableEntity) class246_sub3_sub4_sub2).localYPos, ((AnimableEntity) class246_sub3_sub4_sub2).localXPos));
				Class222.method2826(class246_sub3_sub4_sub2, true);
			}
		}
	}

	public final void init() {
		try {
			if (this.method89(31)) {
				Class98_Sub46_Sub17.aClass354_6050 = new Class354();
				((Class354) Class98_Sub46_Sub17.aClass354_6050).anInt3011 = Integer.parseInt(this.getParameter("worldid"));
				Class299_Sub2.aClass354_5297 = new Class354();
				((Class354) Class299_Sub2.aClass354_5297).anInt3011 = Integer.parseInt(this.getParameter("lobbyid"));
				((Class354) Class299_Sub2.aClass354_5297).aString3016 = this.getParameter("lobbyaddress");
				Class250.aClass354_1914 = new Class354();
				((Class354) Class250.aClass354_1914).anInt3011 = Integer.parseInt(this.getParameter("demoid"));
				((Class354) Class250.aClass354_1914).aString3016 = this.getParameter("demoaddress");
				Class64_Sub29.aClass196_3720 = (Class246_Sub3_Sub1_Sub1.method2997(103, Integer.parseInt(this.getParameter("modewhere"))));
				if (Class64_Sub29.aClass196_3720 != Class98_Sub43_Sub2.aClass196_5908) {
					if (!Class133.method2238(true, Class64_Sub29.aClass196_3720) && (Class64_Sub29.aClass196_3720 != Class43.aClass196_375))
						Class64_Sub29.aClass196_3720 = Class43.aClass196_375;
				} else
					Class64_Sub29.aClass196_3720 = RuneScapeCache.aClass196_1578;
				Class73.aClass6_3485 = (Class246_Sub3_Sub3_Sub2.method3020(Integer.parseInt(this.getParameter("modewhat")), 108));
				if (Class244.aClass6_1861 != Class73.aClass6_3485 && Class73.aClass6_3485 != Class1.aClass6_63 && Class2.aClass6_68 != Class73.aClass6_3485)
					Class73.aClass6_3485 = Class2.aClass6_68;
				try {
					Class374.anInt3159 = Integer.parseInt(this.getParameter("lang"));
				} catch (Exception exception) {
					Class374.anInt3159 = 0;
				}
				String string = this.getParameter("objecttag");
				if (string != null && string.equals("1"))
					Class133.aBoolean3456 = true;
				else
					Class133.aBoolean3456 = false;
				String string_134_ = this.getParameter("js");
				if (string_134_ == null || !string_134_.equals("1"))
					Class76_Sub7.aBoolean3761 = false;
				else
					Class76_Sub7.aBoolean3761 = true;
				String string_135_ = this.getParameter("advert");
				if (string_135_ == null || !string_135_.equals("1"))
					Class172.aBoolean1321 = false;
				else
					Class172.aBoolean1321 = true;
				String string_136_ = this.getParameter("game");
				if (string_136_ != null) {
					if (string_136_.equals("0"))
						Class4.aClass279_86 = s_Sub1.aClass279_5197;
					else if (!string_136_.equals("1")) {
						if (!string_136_.equals("2")) {
							if (string_136_.equals("3"))
								Class4.aClass279_86 = Class98_Sub46.aClass279_4263;
						} else
							Class4.aClass279_86 = Class246_Sub3_Sub4_Sub1.aClass279_6240;
					} else
						Class4.aClass279_86 = Class64_Sub2.aClass279_3643;
				}
				try {
					Class98_Sub10_Sub15.anInt5619 = Integer.parseInt(this.getParameter("affid"));
				} catch (Exception exception) {
					Class98_Sub10_Sub15.anInt5619 = 0;
				}
				Class5.aString3440 = this.getParameter("quiturl");
				Class89.aString716 = this.getParameter("settings");
				if (Class89.aString716 == null)
					Class89.aString716 = "";
				ha.aBoolean940 = "1".equals(this.getParameter("under"));
				String string_137_ = this.getParameter("country");
				if (string_137_ != null) {
					try {
						Class233.anInt1746 = Integer.parseInt(string_137_);
					} catch (Exception exception) {
						Class233.anInt1746 = 0;
					}
				}
				Class98_Sub9.anInt3855 = Integer.parseInt(this.getParameter("colourid"));
				if (Class98_Sub9.anInt3855 < 0 || ((Class301.aColorArray2508.length ^ 0xffffffff) >= (Class98_Sub9.anInt3855 ^ 0xffffffff)))
					Class98_Sub9.anInt3855 = 0;
				if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1)
					Class64_Sub18.aBoolean3690 = Class146_Sub3.aBoolean4926 = true;
				String string_138_ = this.getParameter("frombilling");
				if (string_138_ != null && string_138_.equals("true"))
					Class98_Sub10_Sub30.aBoolean5712 = true;
				Class98_Sub10_Sub10.aString5593 = this.getParameter("sskey");
				if (Class98_Sub10_Sub10.aString5593 != null && ((Class98_Sub10_Sub10.aString5593.length() ^ 0xffffffff) > -3))
					Class98_Sub10_Sub10.aString5593 = null;
				String string_139_ = this.getParameter("force64mb");
				if (string_139_ != null && string_139_.equals("true"))
					Class23.aBoolean220 = true;
				String string_140_ = this.getParameter("worldflags");
				if (string_140_ != null) {
					try {
						Class98_Sub46.anInt4260 = Integer.parseInt(string_140_);
					} catch (Exception exception) {
						/* empty */
					}
				}
				String string_141_ = this.getParameter("userFlow");
				if (string_141_ != null) {
					try {
						Class197.aLong1515 = Long.parseLong(string_141_);
					} catch (NumberFormatException numberformatexception) {
						/* empty */
					}
				}
				Class98_Sub10_Sub7.aString5573 = this.getParameter("additionalInfo");
				if (Class98_Sub10_Sub7.aString5573 != null && Class98_Sub10_Sub7.aString5573.length() > 50)
					Class98_Sub10_Sub7.aString5573 = null;
				Class315.aClient3529 = this;
				if (s_Sub1.aClass279_5197 != Class4.aClass279_86) {
					if (Class4.aClass279_86 == Class64_Sub2.aClass279_3643) {
						Class246_Sub2.anInt5072 = 480;
						Class98_Sub17_Sub1.anInt5782 = 640;
					}
				} else {
					Class246_Sub2.anInt5072 = 503;
					Class98_Sub17_Sub1.anInt5782 = 765;
				}
				this.method84(637, Class246_Sub2.anInt5072, 4, 37, ((Class279) Class4.aClass279_86).aString2098, 32 + Class73.aClass6_3485.method182(-124), Class98_Sub17_Sub1.anInt5782);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "client.init(" + ')');
		}
	}

	static final IComponentSettings getClickMask(GameInterfaceData class293) {
		IComponentSettings class98_sub49 = (IComponentSettings) (Class168.aClass377_1287.method3990((((long) ((GameInterfaceData) class293).anInt2248 << 32) + (long) ((GameInterfaceData) class293).anInt2300), -1));
		if (class98_sub49 != null)
			return class98_sub49;
		return ((GameInterfaceData) class293).aClass98_Sub49_2348;
	}

	/* synthetic */ static Class method117(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
