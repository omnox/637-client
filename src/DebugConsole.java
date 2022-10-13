import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jagex3.jagmisc.jagmisc;

public class DebugConsole {

	static final void handleCommand(String string, boolean bool, boolean bool_37_, byte i) {
		do {
			try {
				try {
					if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
						Class98_Sub46.method1525("commands - This command", 114);
						Class98_Sub46.method1525("cls - Clear console", i ^ 0x28);
						Class98_Sub46.method1525("displayfps - Toggle FPS and other information", 98);
						Class98_Sub46.method1525("renderer - Print graphics renderer information", 93);
						Class98_Sub46.method1525("heap - Print java memory information", -83);
						break;
					}
					if (string.equalsIgnoreCase("cls")) {
						Class54.anInt3395 = 0;
						Class98_Sub28.anInt4080 = 0;
						break;
					}
					if (string.equalsIgnoreCase("displayfps")) {
						Class91.aBoolean725 = !Class91.aBoolean725;
						if (Class91.aBoolean725)
							Class98_Sub46.method1525("FPS on", i + -72);
						else {
							Class98_Sub46.method1525("FPS off", -101);
							break;
						}
						break;
					}
					if (string.equals("renderer")) {
						Class62 class62 = Class265.aHa1974.method1799();
						Class98_Sub46.method1525(("Vendor: " + (class62.anInt484)), -123);
						Class98_Sub46.method1525(("Name: " + (class62.aString489)), i ^ ~0x3e);
						Class98_Sub46.method1525(("Version: " + (class62.anInt483)), 52);
						Class98_Sub46.method1525(("Device: " + (class62.aString488)), -115);
						Class98_Sub46.method1525(("Driver Version: " + (class62.aLong485)), -82);
						break;
					}
					if (i != 117)
						PlayerUpdateMask.aClass171_524 = null;
					if (string.equals("heap")) {
						Class98_Sub46.method1525(("Heap: " + Class292.anInt3359 + "MB"), i ^ ~0x2a);
						break;
					}
				} catch (Exception exception) {
					Class98_Sub46.method1525(TextResources.aClass309_2587.get_text(Class374.anInt3159), 107);
					break;
				}
				if (Class43.aClass196_375 != Class64_Sub29.aClass196_3720 || Player.rights >= 2) {
					if (string.equalsIgnoreCase("errortest"))
						throw new RuntimeException();
					if (string.equals("nativememerror"))
						throw new OutOfMemoryError("native(MPR");
					try {
						if (string.equalsIgnoreCase("printfps")) {
							Class98_Sub46.method1525("FPS: " + Class338.anInt2842, -74);
							break;
						}
						if (string.equalsIgnoreCase("occlude")) {
							Class98_Sub17.aBoolean3942 = !Class98_Sub17.aBoolean3942;
							if (Class98_Sub17.aBoolean3942)
								Class98_Sub46.method1525("Occlsion now on!", i ^ 0xd);
							else {
								Class98_Sub46.method1525("Occlsion now off!", 58);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("fpson")) {
							Class91.aBoolean725 = true;
							Class98_Sub46.method1525("fps debug enabled", -85);
							break;
						}
						if (string.equalsIgnoreCase("fpsoff")) {
							Class91.aBoolean725 = false;
							Class98_Sub46.method1525("fps debug disabled", -74);
							break;
						}
						if (string.equals("systemmem")) {
							try {
								Class98_Sub46.method1525(("System memory: " + (jagmisc.getAvailablePhysicalMemory() / 1048576L) + "/" + (Exception_Sub1.aClass98_Sub35_47.anInt4129) + "Mb"), 108);
							} catch (Throwable throwable) {
								/* empty */
							}
							break;
						}
						if (string.equalsIgnoreCase("cleartext")) {
							Class64_Sub20.aClass218_3694.method2802(i ^ 0x12);
							Class98_Sub46.method1525("Text coords cleared", 95);
							break;
						}
						if (string.equalsIgnoreCase("gc")) {
							Class27.method294(true);
							for (int i_38_ = 0; i_38_ < 10; i_38_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_39_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
							Class98_Sub46.method1525("mem=" + i_39_ + "k", i + -235);
							break;
						}
						if (string.equalsIgnoreCase("compact")) {
							Class27.method294(true);
							for (int i_40_ = 0; i_40_ < 10; i_40_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_41_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
							Class98_Sub46.method1525(("Memory before cleanup=" + i_41_ + "k"), -95);
							Class206.method2727(24);
							Class27.method294(true);
							for (int i_42_ = 0; i_42_ < 10; i_42_++)
								System.gc();
							i_41_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
							Class98_Sub46.method1525(("Memory after cleanup=" + i_41_ + "k"), 104);
							break;
						}
						if (string.equalsIgnoreCase("unloadnatives")) {
							Class98_Sub46.method1525((Class351.method3847(5) ? "Libraries unloaded" : "Library unloading failed!"), -104);
							break;
						}
						if (string.equalsIgnoreCase("clientdrop")) {
							Class98_Sub46.method1525("Dropped client connection", -67);
							if (Class177.anInt1376 != 10) {
								if (Class177.anInt1376 == 11)
									Class76_Sub9.aBoolean3788 = true;
							} else
								Canvas_Sub1.method118((byte) 104);
							break;
						}
						if (string.equalsIgnoreCase("rotateconnectmethods")) {
							Class98_Sub46_Sub10.aClass354_6011.method3874(0);
							Class98_Sub46.method1525("Rotated connection methods", i + -206);
							break;
						}
						if (string.equalsIgnoreCase("clientjs5drop")) {
							Class98_Sub10_Sub38.aClass135_5765.method2249(-45);
							Class98_Sub46.method1525("Dropped client js5 net queue", i + -220);
							break;
						}
						if (string.equalsIgnoreCase("serverjs5drop")) {
							Class98_Sub10_Sub38.aClass135_5765.method2254(i ^ 0x7106);
							Class98_Sub46.method1525("Dropped server js5 net queue", -84);
							break;
						}
						if (string.equalsIgnoreCase("breakcon")) {
							Class98_Sub43_Sub2.aClass88_5907.method861(i ^ 0x75);
							aa_Sub1.aClass123_3561.method2204(-1);
							Class98_Sub10_Sub38.aClass135_5765.method2259(0);
							Class98_Sub46.method1525("Breaking new connections for 5 seconds", -110);
							break;
						}
						if (string.equalsIgnoreCase("rebuild")) {
							Class98_Sub10.method999((byte) -59);
							InputStream_Sub2.method124(-109);
							Class98_Sub46.method1525("Rebuilding map", 107);
							break;
						}
						if (string.equalsIgnoreCase("rebuildprofile")) {
							Class123.aLong1011 = Class343.method3819(-47);
							Class270.aBoolean2031 = true;
							Class98_Sub10.method999((byte) -70);
							InputStream_Sub2.method124(-115);
							Class98_Sub46.method1525("Rebuilding map (with profiling)", -119);
							break;
						}
						if (string.equalsIgnoreCase("wm1")) {
							Class98_Sub16.method1150(1, -1, 3, -1, false);
							if (Class146_Sub2.method2391((byte) 124) != 1)
								Class98_Sub46.method1525("wm1 failed", 99);
							else {
								Class98_Sub46.method1525("wm1 succeeded", 51);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("wm2")) {
							Class98_Sub16.method1150(2, -1, i ^ 0x76, -1, false);
							if (Class146_Sub2.method2391((byte) 107) == 2)
								Class98_Sub46.method1525("wm2 succeeded", -94);
							else {
								Class98_Sub46.method1525("wm2 failed", -86);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("wm3")) {
							Class98_Sub16.method1150(3, 1024, 3, 768, false);
							if (Class146_Sub2.method2391((byte) -75) != 3)
								Class98_Sub46.method1525("wm3 failed", -108);
							else {
								Class98_Sub46.method1525("wm3 succeeded", 106);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk0")) {
							Class76_Sub4.method754(0, false, 103);
							if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 121) == 0) {
								Class98_Sub46.method1525("Entered tk0", 108);
								Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
								Class310.method3618(-5964);
								s_Sub1.aBoolean5207 = false;
							} else {
								Class98_Sub46.method1525("Failed to enter tk0", -128);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk1")) {
							Class76_Sub4.method754(1, false, -116);
							if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 123) == 1) {
								Class98_Sub46.method1525("Entered tk1", 110);
								Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
								Class310.method3618(i + -6081);
								s_Sub1.aBoolean5207 = false;
							} else {
								Class98_Sub46.method1525("Failed to enter tk1", -104);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk2")) {
							Class76_Sub4.method754(2, false, 71);
							if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 120) != 2)
								Class98_Sub46.method1525("Failed to enter tk2", -64);
							else {
								Class98_Sub46.method1525("Entered tk2", -116);
								Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
								Class310.method3618(-5964);
								s_Sub1.aBoolean5207 = false;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk3")) {
							Class76_Sub4.method754(3, false, i + -13);
							if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 127) != 3)
								Class98_Sub46.method1525("Failed to enter tk3", 50);
							else {
								Class98_Sub46.method1525("Entered tk3", 97);
								Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 3, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
								Class310.method3618(-5964);
								s_Sub1.aBoolean5207 = false;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk5")) {
							Class76_Sub4.method754(5, false, 76);
							if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 124) == 5) {
								Class98_Sub46.method1525("Entered tk5", 111);
								Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 5, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
								Class310.method3618(i + -6081);
								s_Sub1.aBoolean5207 = false;
							} else {
								Class98_Sub46.method1525("Failed to enter tk5", 88);
								break;
							}
							break;
						}
						if (string.startsWith("setba")) {
							if (string.length() < 6)
								Class98_Sub46.method1525("Invalid buildarea value", -80);
							else {
								int i_43_ = PacketSender.method3607(-102, string.substring(6));
								if (i_43_ < 0 || i_43_ > (Class98_Sub22_Sub2.method1262(i + -109, Class292.anInt3359)))
									Class98_Sub46.method1525("Invalid buildarea value", -63);
								else {
									Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_43_, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046));
									Class310.method3618(-5964);
									s_Sub1.aBoolean5207 = false;
									Class98_Sub46.method1525(("maxbuildarea=" + Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046.method617((byte) 120)), -65);
									break;
								}
								break;
							}
							break;
						}
						if (string.startsWith("rect_debug")) {
							if (string.length() < 10)
								Class98_Sub46.method1525("Invalid rect_debug value", -126);
							else {
								Class167.anInt1282 = PacketSender.method3607(64, string.substring(10).trim());
								Class98_Sub46.method1525(("rect_debug=" + (Class167.anInt1282)), -119);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("qa_op_test")) {
							Class15.aBoolean169 = true;
							Class98_Sub46.method1525(("qa_op_test=" + Class15.aBoolean169), -113);
							break;
						}
						if (string.equalsIgnoreCase("clipcomponents")) {
							Class153.aBoolean1230 = !Class153.aBoolean1230;
							Class98_Sub46.method1525(("clipcomponents=" + Class153.aBoolean1230), i ^ ~0x37);
							break;
						}
						if (string.startsWith("bloom")) {
							boolean bool_44_ = Class265.aHa1974.method1768();
							if (!Class98_Sub5_Sub1.method966(29089, !bool_44_))
								Class98_Sub46.method1525("Failed to enable bloom", 126);
							else {
								if (!bool_44_)
									Class98_Sub46.method1525("Bloom enabled", 46);
								else {
									Class98_Sub46.method1525("Bloom disabled", -85);
									break;
								}
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tween")) {
							if (!Class357.aBoolean3027) {
								Class357.aBoolean3027 = true;
								Class98_Sub46.method1525("Forced tweening ENABLED!", 123);
							} else {
								Class357.aBoolean3027 = false;
								Class98_Sub46.method1525("Forced tweening disabled.", i ^ ~0x2c);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("shiftclick")) {
							if (Class109.aBoolean934) {
								Class98_Sub46.method1525("Shift-click disabled.", i + -55);
								Class109.aBoolean934 = false;
							} else {
								Class98_Sub46.method1525("Shift-click ENABLED!", i ^ 0x11);
								Class109.aBoolean934 = true;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("getcgcoord")) {
							Class98_Sub46.method1525(("x:" + ((Player.selfPlayer.localXPos) >> 9) + " z:" + ((Player.selfPlayer.localYPos) >> 9)), -102);
							break;
						}
						if (string.equalsIgnoreCase("getheight")) {
							Class98_Sub46.method1525(("Height: " + (Class78.activeTileHeightMap[(Player.selfPlayer.height_level)].method3420((Player.selfPlayer.localYPos) >> 9, -12639, (Player.selfPlayer.localXPos) >> 9))), 88);
							break;
						}
						if (string.equalsIgnoreCase("resetminimap")) {
							Class332_Sub2.aClass207_5423.method2766(16);
							Class332_Sub2.aClass207_5423.method2760((byte) -116);
							Class98_Sub10_Sub23.aClass335_5662.method3770(i + -83);
							Class216.aClass341_1622.method3808(0);
							InputStream_Sub2.method124(-79);
							Class98_Sub46.method1525("Minimap reset", 103);
							break;
						}
						if (string.startsWith("mc")) {
							if (Class265.aHa1974.method1810()) {
								int i_45_ = Integer.parseInt(string.substring(3));
								if (i_45_ >= 1) {
									if (i_45_ > 4)
										i_45_ = 4;
								} else
									i_45_ = 1;
								Class337_Sub1.anInt5499 = i_45_;
								Class98_Sub10.method999((byte) -47);
								Class98_Sub46.method1525(("Render cores now: " + (Class337_Sub1.anInt5499)), -93);
							} else {
								Class98_Sub46.method1525("Current toolkit doesn't support multiple cores", 121);
								break;
							}
							break;
						}
						if (string.startsWith("cachespace")) {
							Class98_Sub46.method1525(("I(s): " + Class69_Sub2.aClass79_5334.method799(1551398789) + "/" + Class69_Sub2.aClass79_5334.method793(18)), 53);
							Class98_Sub46.method1525(("I(m): " + Class64_Sub5.aClass79_3650.method799(1551398789) + "/" + Class64_Sub5.aClass79_3650.method793(16)), -122);
							Class98_Sub46.method1525(("O(s): " + Class98_Sub46_Sub19.getItemDefs.aClass74_1561.method726(true) + "/" + Class98_Sub46_Sub19.getItemDefs.aClass74_1561.method730(-19536)), i + -197);
							break;
						}
						if (string.equalsIgnoreCase("getcamerapos")) {
							Class98_Sub46.method1525(("Pos: " + (Player.selfPlayer.height_level) + "," + ((Class98_Sub46_Sub10.renderX >> 9) - -Class272.anInt2038 >> 6) + "," + (((Class134.renderZ >> 9) + aa_Sub2.anInt3562) >> 6) + "," + (0x3f & (Class272.anInt2038 + (Class98_Sub46_Sub10.renderX >> 9))) + "," + (0x3f & ((Class134.renderZ >> 9) + aa_Sub2.anInt3562)) + " Height: " + ((Perspective.getTileHeight((Player.selfPlayer.height_level), Class134.renderZ, Class98_Sub46_Sub10.renderX)) + -Class79.renderY)), 96);
							Class98_Sub46.method1525(("Look: " + (Player.selfPlayer.height_level) + "," + ((Exception_Sub1.anInt44 - -Class272.anInt2038) >> 6) + "," + ((aa_Sub2.anInt3562 + Class98_Sub15.anInt3915) >> 6) + "," + (0x3f & (Class272.anInt2038 + Exception_Sub1.anInt44)) + "," + (0x3f & (Class98_Sub15.anInt3915 - -aa_Sub2.anInt3562)) + " Height: " + ((Perspective.getTileHeight((Player.selfPlayer.height_level), Class98_Sub15.anInt3915, Exception_Sub1.anInt44)) - Class303.anInt2530)), 122);
							break;
						}
						if (string.equals("renderprofile") || string.equals("rp")) {
							Class170.aBoolean1313 = !Class170.aBoolean1313;
							Class265.aHa1974.method1761(Class170.aBoolean1313);
							Class228.method2862(-123);
							Class98_Sub46.method1525(("showprofiling=" + Class170.aBoolean1313), 89);
							break;
						}
						if (string.startsWith("performancetest")) {
							int i_46_ = -1;
							int i_47_ = 1000;
							if (string.length() > 15) {
								String[] strings = Class112.method2142(string, ' ', false);
								try {
									if (strings.length > 1)
										i_47_ = Integer.parseInt(strings[1]);
								} catch (Throwable throwable) {
									/* empty */
								}
								try {
									if (strings.length > 2)
										i_46_ = Integer.parseInt(strings[2]);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (i_46_ != -1)
								Class98_Sub46.method1525(("Performance: " + Class66.method683((byte) -86, i_47_, i_46_)), -64);
							else {
								Class98_Sub46.method1525(("Java toolkit: " + Class66.method683((byte) -109, i_47_, 0)), -108);
								Class98_Sub46.method1525(("SSE toolkit:  " + Class66.method683((byte) -128, i_47_, 2)), i ^ 0x2b);
								Class98_Sub46.method1525(("D3D toolkit:  " + Class66.method683((byte) -117, i_47_, 3)), -61);
								Class98_Sub46.method1525(("GL toolkit:   " + Class66.method683((byte) -104, i_47_, 1)), 126);
								Class98_Sub46.method1525(("GLX toolkit:  " + Class66.method683((byte) -92, i_47_, 5)), i + 10);
								break;
							}
							break;
						}
						if (string.equals("nonpcs")) {
							Class237_Sub1.aBoolean5044 = !Class237_Sub1.aBoolean5044;
							Class98_Sub46.method1525(("nonpcs=" + (Class237_Sub1.aBoolean5044)), 94);
							break;
						}
						if (string.equals("autoworld")) {
							Class98_Sub10_Sub25.method1080((byte) -86);
							Class98_Sub46.method1525("auto world selected", -63);
							break;
						}
						if (string.startsWith("switchworld")) {
							int i_48_ = Integer.parseInt(string.substring(12));
							Class98_Sub12.method1131(-8804, i_48_, (Class275.method3283((byte) 113, i_48_).aString3634));
							Class98_Sub46.method1525("switched", i + -77);
							break;
						}
						if (string.equals("getworld")) {
							Class98_Sub46.method1525(("w: " + (Class98_Sub46_Sub10.aClass354_6011.anInt3011)), i + -196);
							break;
						}
						if (string.startsWith("pc")) {
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class246_Sub4_Sub2.aClass171_6185, Class331.aClass117_2811));
							class98_sub11.packet.writeByte(0);
							int i_49_ = (class98_sub11.packet.position);
							int i_50_ = string.indexOf(" ", 4);
							class98_sub11.packet.method1188(string.substring(3, i_50_), (byte) 113);
							Class284_Sub1_Sub1.method3368(i + 10, string.substring(i_50_), (class98_sub11.packet));
							class98_sub11.packet.method1211((byte) 118, -i_49_ + (class98_sub11.packet.position));
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							break;
						}
						if (string.equals("savevarcs")) {
							Class23.method283((byte) -80);
							Class98_Sub46.method1525("perm varcs saved", 103);
							break;
						}
						if (string.equals("scramblevarcs")) {
							for (int i_51_ = 0; (i_51_ < Class76_Sub5.anIntArray3744.length); i_51_++) {
								if (VarpClass.aBooleanArray3246[i_51_]) {
									Class76_Sub5.anIntArray3744[i_51_] = (int) (Math.random() * 99999.0);
									if (Math.random() > 0.5)
										Class76_Sub5.anIntArray3744[i_51_] *= -1;
								}
							}
							Class23.method283((byte) -118);
							Class98_Sub46.method1525("perm varcs scrambled", -114);
							break;
						}
						if (string.equals("showcolmap")) {
							Class44.aBoolean378 = true;
							InputStream_Sub2.method124(-119);
							Class98_Sub46.method1525("colmap is shown", -67);
							break;
						}
						if (string.equals("hidecolmap")) {
							Class44.aBoolean378 = false;
							InputStream_Sub2.method124(122);
							Class98_Sub46.method1525("colmap is hidden", i ^ ~0x2f);
							break;
						}
						if (string.equals("resetcache")) {
							Class98_Sub10_Sub15.method1050((byte) 114);
							Class98_Sub46.method1525("Caches reset", -104);
							break;
						}
						if (string.equals("profilecpu")) {
							Class98_Sub46.method1525((String.valueOf(Class278_Sub1.method3320(12)) + "ms"), i + -204);
							break;
						}
						if (string.startsWith("getclientvarpbit")) {
							int i_52_ = Integer.parseInt(string.substring(17));
							Class98_Sub46.method1525("varpbit=" + Class75.aClass140_584.method7(i_52_, i ^ 0x1cb8), 65);
							break;
						}
						if (string.startsWith("getclientvarp")) {
							int i_53_ = Integer.parseInt(string.substring(14));
							Class98_Sub46.method1525("varp=" + Class75.aClass140_584.method6(i_53_, i ^ ~0xb), -83);
							break;
						}
						if (string.startsWith("directlogin")) {
							String[] strings = Class112.method2142(string.substring(12), ' ', false);
							if (strings.length >= 2) {
								int i_54_ = (strings.length > 2 ? Integer.parseInt(strings[2]) : 0);
								Class251.method3171(strings[1], -17877, strings[0], i_54_);
								break;
							}
						}
						if (string.startsWith("csprofileclear")) {
							ClientScript2Runtime.method3147();
							break;
						}
						if (string.startsWith("csprofileoutputc")) {
							ClientScript2Runtime.method3143(100, false);
							break;
						}
						if (string.startsWith("csprofileoutputt")) {
							ClientScript2Runtime.method3143(10, true);
							break;
						}
						if (string.startsWith("texsize")) {
							int i_55_ = Integer.parseInt(string.substring(8));
							Class265.aHa1974.method1778(i_55_);
							break;
						}
						if (string.equals("soundstreamcount")) {
							Class98_Sub46.method1525(("Active streams: " + Class81.aClass98_Sub31_Sub3_619.method1377()), -93);
							break;
						}
						if (string.equals("autosetup")) {
							Class98_Sub28.method1306((byte) -106);
							Class98_Sub46.method1525(("Complete. Toolkit now: " + Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method583((byte) 123)), i + -52);
							break;
						}
						if (string.equals("errormessage")) {
							Class98_Sub46.method1525(Class315.aClient3529.method94(0), 58);
							break;
						}
						if (string.equals("heapdump")) {
							if (Class88.aString699.startsWith("win"))
								Class98_Sub30.method1319(0, new File("C:\\Temp\\heap.dump"), false);
							else
								Class98_Sub30.method1319(0, new File("/tmp/heap.dump"), false);
							Class98_Sub46.method1525("Done", -115);
							break;
						}
						if (string.equals("os")) {
							Class98_Sub46.method1525(("Name: " + Class88.aString699), i + -234);
							Class98_Sub46.method1525(("Arch: " + Class88.aString690), -80);
							Class98_Sub46.method1525(("Ver: " + Class88.aString676), -100);
							break;
						}
						if (string.startsWith("w2debug")) {
							int i_56_ = Integer.parseInt(string.substring(8, 9));
							Class98_Sub10_Sub14.anInt5614 = i_56_;
							Class98_Sub10.method999((byte) 124);
							Class98_Sub46.method1525("Toggled!", 74);
							break;
						}
						if (string.startsWith("ortho ")) {
							int i_57_ = string.indexOf(' ');
							if (i_57_ < 0)
								Class98_Sub46.method1525("Syntax: ortho <n>", -66);
							else {
								int i_58_ = (PacketSender.method3607(84, string.substring(i_57_ - -1)));
								Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_58_, (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071));
								Class310.method3618(-5964);
								s_Sub1.aBoolean5207 = false;
								Class230.method2871(-45);
								if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071.method627((byte) 124) != i_58_)
									Class98_Sub46.method1525("Failed to change ortho mode", -94);
								else {
									Class98_Sub46.method1525("Successfully changed ortho mode", -104);
									break;
								}
								break;
							}
							break;
						}
						if (string.startsWith("orthozoom ")) {
							if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071.method627((byte) 122) == 0)
								Class98_Sub46.method1525("enable ortho mode first (use 'ortho <n>')", -114);
							else {
								int i_59_ = (PacketSender.method3607(-52, string.substring(string.indexOf(' ') + 1)));
								Class16.anInt199 = i_59_;
								Class98_Sub46.method1525(("orthozoom=" + Class16.anInt199), -124);
								break;
							}
							break;
						}
						if (string.startsWith("orthotilesize ")) {
							int i_60_ = (PacketSender.method3607(-54, string.substring(1 + string.indexOf(' '))));
							Class341.anInt2856 = Class356.anInt3018 = i_60_;
							Class98_Sub46.method1525("ortho tile size=" + i_60_, -73);
							Class230.method2871(-37);
							break;
						}
						if (string.equals("orthocamlock")) {
							Class69.aBoolean3223 = !Class69.aBoolean3223;
							Class98_Sub46.method1525(("ortho camera lock is " + (Class69.aBoolean3223 ? "on" : "off")), 53);
							break;
						}
						if (string.startsWith("setoutput ")) {
							File file = new File(string.substring(10));
							if (file.exists()) {
								file = new File(string.substring(10) + "." + Class343.method3819(-47) + ".log");
								if (file.exists()) {
									Class98_Sub46.method1525("file already exists!", -106);
									break;
								}
							}
							if (Class264.aFileOutputStream1969 != null) {
								Class264.aFileOutputStream1969.close();
								Class264.aFileOutputStream1969 = null;
							}
							try {
								Class264.aFileOutputStream1969 = new FileOutputStream(file);
							} catch (java.io.FileNotFoundException filenotfoundexception) {
								Class98_Sub46.method1525(("Could not create " + file.getName()), i + -15);
							} catch (SecurityException securityexception) {
								Class98_Sub46.method1525(("Cannot write to " + file.getName()), 67);
							}
							break;
						}
						if (string.equals("closeoutput")) {
							if (Class264.aFileOutputStream1969 != null)
								Class264.aFileOutputStream1969.close();
							Class264.aFileOutputStream1969 = null;
							break;
						}
						if (string.startsWith("runscript ")) {
							File file = new File(string.substring(10));
							if (!file.exists()) {
								Class98_Sub46.method1525("No such file", 45);
								break;
							}
							byte[] is = Class273.method3281(i ^ ~0x3, file);
							if (is == null) {
								Class98_Sub46.method1525("Failed to read file", i ^ 0x2b);
								break;
							}
							String[] strings = (Class112.method2142((Class98_Sub32.method1435(Class69_Sub2.method707(is, true), "", (byte) -110, '\r')), '\n', false));
							Class98_Sub10_Sub13.method1044((byte) 91, strings);
						}
						if (string.startsWith("zoom ")) {
							short i_61_ = (short) (PacketSender.method3607(66, string.substring(5)));
							if (i_61_ > 0)
								Class135.cameraZoom = i_61_;
							break;
						}
						if (Class177.anInt1376 == 10) {
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, TextResources.aClass171_2650, Class331.aClass117_2811));
							class98_sub11.packet.writeByte(string.length() - -3);
							class98_sub11.packet.writeByte(!bool_37_ ? 0 : 1);
							class98_sub11.packet.writeByte(!bool ? 0 : 1);
							class98_sub11.packet.method1188(string, (byte) 113);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						}
						if (string.startsWith("fps ") && (Class64_Sub29.aClass196_3720 != Class43.aClass196_375)) {
							Class342.method3815(PacketSender.method3607(i ^ 0x59, string.substring(4)), 59);
							break;
						}
					} catch (Exception exception) {
						Class98_Sub46.method1525(TextResources.aClass309_2587.get_text(Class374.anInt3159), -117);
						break;
					}
				}
				if (Class177.anInt1376 == 10)
					break;
				Class98_Sub46.method1525(TextResources.aClass309_2589.get_text(Class374.anInt3159) + string, 71);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eia.A(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + bool_37_ + ',' + i + ')'));
			}
			break;
		} while (false);
	}

}
