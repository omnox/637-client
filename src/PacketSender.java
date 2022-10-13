
/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class PacketSender implements Runnable {
	private byte[] aByteArray2568;
	private IOException anIOException2569;
	private int anInt2570;
	private Thread aThread2571;
	private int anInt2572;
	private OutputStream anOutputStream2573;
	private int anInt2574 = 0;
	static boolean aBoolean2575 = false;

	final void method3603(boolean bool) {
		do {
			try {
				anOutputStream2573 = new OutputStream_Sub2();
				if (bool == true)
					break;
				aByteArray2568 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "st.E(" + bool + ')');
			}
			break;
		} while (false);
	}

	public final void run() {
		try {
			for (;;) {
				int i;
				synchronized (this) {
					for (;;) {
						if (anIOException2569 != null)
							return;
						if (anInt2572 < anInt2574)
							i = -anInt2574 + (anInt2570 + anInt2572);
						else
							i = anInt2572 - anInt2574;
						if (i > 0)
							break;
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					if (i + anInt2574 > anInt2570) {
						int i_0_ = -anInt2574 + anInt2570;
						anOutputStream2573.write(aByteArray2568, anInt2574, i_0_);
						anOutputStream2573.write(aByteArray2568, 0, i - i_0_);
					} else
						anOutputStream2573.write(aByteArray2568, anInt2574, i);
				} catch (IOException ioexception) {
					synchronized (this) {
						anIOException2569 = ioexception;
						break;
					}
				}
				synchronized (this) {
					anInt2574 = (anInt2574 - -i) % anInt2570;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "st.run(" + ')');
		}
	}

	static final void method3604(int i, byte i_1_, int i_2_, Class98_Sub46_Sub8 class98_sub46_sub8) {
		do {
			try {
				if (class98_sub46_sub8 != null && (Class33.aClass148_315.aClass98_1198 != class98_sub46_sub8)) {
					int i_3_ = class98_sub46_sub8.anInt5995;
					int i_4_ = class98_sub46_sub8.anInt5993;
					int i_5_ = class98_sub46_sub8.anInt5990;
					int i_6_ = (int) (class98_sub46_sub8.aLong5987);
					if (i_5_ >= 2000)
						i_5_ -= 2000;
					long l = class98_sub46_sub8.aLong5987;
					if (i_5_ == 1002) {
						Class55.anInt440 = 2;
						IComponentSettings.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_6_, -1));
						if (class98_sub39 != null) {
							Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							Class141 class141 = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
							if (class141.anIntArray1109 != null)
								class141 = class141.method2300((Class75.aClass140_584), (byte) 45);
							if (class141 != null) {
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, (Class246_Sub3_Sub4_Sub2_Sub1.aClass171_6506), Class331.aClass117_2811));
								class98_sub11.packet.writeShort(class141.anInt1097);
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							}
						}
					}
					if (i_5_ == 51) {
						Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 2;
							IComponentSettings.anInt4286 = i;
							Class98_Sub23.anInt4001++;
							Class366.anInt3117 = i_2_;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(i_1_ ^ 0x14a, Class121.aClass171_1001, Class331.aClass117_2811));
							class98_sub11.packet.writeLEShortA(i_6_, 128);
							class98_sub11.packet.method1231((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0), (byte) 107);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
						}
					}
					if (i_5_ == 45) {
						Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3111++;
							Class55.anInt440 = 2;
							IComponentSettings.anInt4286 = i;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class277.aClass171_2051, Class331.aClass117_2811));
							class98_sub11.packet.writeByteS((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), -102);
							class98_sub11.packet.writeShort(i_6_);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, i_1_ + -78, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
						}
					}
					if (i_5_ == 58) {
						IComponentSettings.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Exception_Sub1.aClass171_46), (Class331.aClass117_2811));
						class98_sub11.packet.method1200((byte) 127, Class187.anInt1450);
						class98_sub11.packet.writeLEShortA(aa_Sub2.anInt3562 + i_4_, 128);
						class98_sub11.packet.writeLEShortA(i_6_, 128);
						class98_sub11.packet.writeByte((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1));
						class98_sub11.packet.writeLEShortA(Class376.anInt3173, 128);
						class98_sub11.packet.writeLEShort(Class272.anInt2038 + i_3_, 17624);
						class98_sub11.packet.writeLEShortA(Class310.anInt2652, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(-19181, i_4_, i_3_);
					}
					if (i_5_ == 1011 || i_5_ == 1003 || i_5_ == 1001 || i_5_ == 1010 || i_5_ == 1004)
						Class162.method2518(-1004, i_5_, i_3_, i_6_);
					if (i_5_ == 2) {
						Class55.anInt440 = 2;
						IComponentSettings.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class98_Sub10_Sub32.anInt5720 = 0;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i_1_ + 182, (Class284_Sub2_Sub2.aClass171_6198), (Class331.aClass117_2811));
						class98_sub11.packet.writeLEShort(Class272.anInt2038 + i_3_, 17624);
						class98_sub11.packet.writeLEShort(i_6_, 17624);
						class98_sub11.packet.writeShortA(i_4_ + aa_Sub2.anInt3562, (byte) 126);
						class98_sub11.packet.method1244((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), (byte) 112);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(-19181, i_4_, i_3_);
					}
					if (i_5_ == 50) {
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						IComponentSettings.anInt4286 = i;
						Class55.anInt440 = 2;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class134.aClass171_3466), (Class331.aClass117_2811));
						class98_sub11.packet.writeLEInt(Class187.anInt1450, 1046032984);
						class98_sub11.packet.writeLEShortA(Class310.anInt2652, 128);
						class98_sub11.packet.writeShort(Class376.anInt3173);
						class98_sub11.packet.writeShort(Class272.anInt2038 + i_3_);
						class98_sub11.packet.writeByteS((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0), i_1_ + -112);
						class98_sub11.packet.writeShortA((int) (l >>> 32) & 0x7fffffff, (byte) 126);
						class98_sub11.packet.writeLEShortA(aa_Sub2.anInt3562 + i_4_, i_1_ + 50);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if (i_5_ == 11) {
						Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_6_, -1));
						if (class98_sub39 != null) {
							IComponentSettings.anInt4286 = i;
							Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(i_1_ + 182, Class98_Sub45.aClass171_4256, Class331.aClass117_2811));
							class98_sub11.packet.writeShort(i_6_);
							class98_sub11.packet.method1231((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0), (byte) 35);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub1.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub1.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub1.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub1.getSize());
						}
					}
					if (i_5_ == 20) {
						Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 2;
							IComponentSettings.anInt4286 = i;
							Class98_Sub46_Sub16.anInt6044++;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(i_1_ + 182, Class64_Sub8.aClass171_3661, Class331.aClass117_2811));
							class98_sub11.packet.writeLEShort(i_6_, 17624);
							class98_sub11.packet.writeByteS((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), -37);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, i_1_ + -78, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
						}
					}
					if (i_5_ == 5) {
						Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class55.anInt440 = 2;
							client.anInt3548++;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							IComponentSettings.anInt4286 = i;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class160.aClass171_1259, Class331.aClass117_2811));
							class98_sub11.packet.writeLEShortA(i_6_, 128);
							class98_sub11.packet.writeShortA(Class310.anInt2652, (byte) 126);
							class98_sub11.packet.writeLEInt(Class187.anInt1450, 1046032984);
							class98_sub11.packet.method1231((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0), (byte) -128);
							class98_sub11.packet.writeShortA(Class376.anInt3173, (byte) 126);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
						}
					}
					if (i_5_ == 19) {
						Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							IComponentSettings.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 2;
							Class366.anInt3117 = i_2_;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class21_Sub4.aClass171_5398, Class331.aClass117_2811));
							class98_sub11.packet.writeShortA(i_6_, (byte) 126);
							class98_sub11.packet.method1244((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), (byte) 112);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
						}
					}
					if (i_5_ == 30) {
						IComponentSettings.anInt4286 = i;
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i_1_ ^ 0x14a, (Class49.aClass171_413), (Class331.aClass117_2811));
						class98_sub11.packet.writeLEShort(i_4_ + aa_Sub2.anInt3562, 17624);
						class98_sub11.packet.writeLEShortA(i_6_, 128);
						class98_sub11.packet.writeLEShort(Class272.anInt2038 + i_3_, i_1_ ^ 0x4496);
						class98_sub11.packet.method1231((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), (byte) 126);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(i_1_ + -19259, i_4_, i_3_);
					}
					if (i_5_ == 47) {
						Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class366.anInt3117 = i_2_;
							Class65.anInt498++;
							IComponentSettings.anInt4286 = i;
							Class55.anInt440 = 2;
							Class98_Sub10_Sub32.anInt5720 = 0;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class302.aClass171_2520, Class331.aClass117_2811));
							class98_sub11.packet.writeByteS((RtKeyListener.key_listener.is_key_down(82, i_1_ + 5425) ? 1 : 0), -52);
							class98_sub11.packet.writeShort(i_6_);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
						}
					}
					if (i_5_ == 16) {
						Class366.anInt3117 = i_2_;
						IComponentSettings.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class55.anInt440 = 2;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i_1_ + 182, (Class196.aClass171_1508), (Class331.aClass117_2811));
						class98_sub11.packet.writeLEShort(i_3_ - -Class272.anInt2038, 17624);
						class98_sub11.packet.writeLEShort(i_4_ + aa_Sub2.anInt3562, i_1_ + 17546);
						class98_sub11.packet.writeShortA((int) (l >>> 32) & 0x7fffffff, (byte) 126);
						class98_sub11.packet.method1231((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0), (byte) 74);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if (i_5_ == 3) {
						Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							IComponentSettings.anInt4286 = i;
							Class55.anInt440 = 2;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class98_Sub43.anInt4242++;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, OutputStream_Sub1.aClass171_34, Class331.aClass117_2811));
							class98_sub11.packet.method1244((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), (byte) 112);
							class98_sub11.packet.writeShort(i_6_);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, i_1_ + -78, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
						}
					}
					if (i_5_ == 8) {
						Class55.anInt440 = 2;
						IComponentSettings.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class98_Sub10_Sub32.anInt5720 = 0;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class263.aClass171_1964), (Class331.aClass117_2811));
						class98_sub11.packet.writeShortA(i_3_ + Class272.anInt2038, (byte) 126);
						class98_sub11.packet.writeLEShortA(0x7fffffff & (int) (l >>> 32), 128);
						class98_sub11.packet.method1231((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), (byte) -124);
						class98_sub11.packet.writeLEShortA(aa_Sub2.anInt3562 + i_4_, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if (i_5_ == 17) {
						Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_6_, -1));
						if (class98_sub39 != null) {
							Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							Class98_Sub10_Sub32.anInt5720 = 0;
							IComponentSettings.anInt4286 = i;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class299_Sub2.aClass171_5296, Class331.aClass117_2811));
							class98_sub11.packet.writeShort(i_6_);
							class98_sub11.packet.method1231(!RtKeyListener.key_listener.is_key_down(82, i_1_ ^ 0x1531) ? 0 : 1, (byte) 37);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub1.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub1.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub1.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub1.getSize());
						}
					}
					if (i_5_ == 9 && OutputStream_Sub1.aClass293_33 == null) {
						ParamType.method2435(i_3_, i_1_ ^ 0x1f, i_4_);
						OutputStream_Sub1.aClass293_33 = Class246_Sub9.method3139((byte) 72, i_4_, i_3_);
						Class341.method3812(1, OutputStream_Sub1.aClass293_33);
					}
					if (i_5_ == 59) {
						GameInterfaceData class293 = Class246_Sub9.method3139((byte) 72, i_4_, i_3_);
						if (class293 != null)
							Class172.method2542(false, class293);
					}
					if (i_5_ == 13) {
						Class366.anInt3117 = i_2_;
						IComponentSettings.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class55.anInt440 = 2;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class222.aClass171_1669), (Class331.aClass117_2811));
						class98_sub11.packet.method1231((RtKeyListener.key_listener.is_key_down(82, i_1_ ^ 0x1531) ? 1 : 0), (byte) 32);
						class98_sub11.packet.writeShortA(i_3_ - -Class272.anInt2038, (byte) 126);
						class98_sub11.packet.writeLEShort(i_6_, 17624);
						class98_sub11.packet.writeLEShortA(i_4_ - -aa_Sub2.anInt3562, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(-19181, i_4_, i_3_);
					}
					if (i_5_ == 49 || i_5_ == 1006)
						Class303.method3557(i_6_, i_3_, class98_sub46_sub8.aString5992, -124, i_4_);
					if (i_5_ == 48) {
						Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_6_, i_1_ + -79));
						if (class98_sub39 != null) {
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							IComponentSettings.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class82.aClass171_625, Class331.aClass117_2811));
							class98_sub11.packet.method1200((byte) 125, Class187.anInt1450);
							class98_sub11.packet.writeLEShort(Class310.anInt2652, i_1_ + 17546);
							class98_sub11.packet.writeShort(i_6_);
							class98_sub11.packet.writeByteS((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), -53);
							class98_sub11.packet.writeLEShort(Class376.anInt3173, i_1_ + 17546);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub1.getSize(), -2, i_1_ ^ 0x4e, (class246_sub3_sub4_sub2_sub1.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub1.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub1.getSize());
						}
					}
					if (i_5_ == 1009) {
						IComponentSettings.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (aa_Sub1.aClass171_3559), (Class331.aClass117_2811));
						class98_sub11.packet.writeShort(i_6_);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (i_1_ != 78)
						method3604(-42, (byte) 33, 80, null);
					if (i_5_ == 57) {
						client.anInt3548++;
						Class55.anInt440 = 2;
						Class366.anInt3117 = i_2_;
						IComponentSettings.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(i_1_ ^ 0x14a, (Class160.aClass171_1259), (Class331.aClass117_2811));
						class98_sub11.packet.writeLEShortA((Player.selfPlayer.anInt6369), i_1_ ^ 0xce);
						class98_sub11.packet.writeShortA(Class310.anInt2652, (byte) 126);
						class98_sub11.packet.writeLEInt(Class187.anInt1450, 1046032984);
						class98_sub11.packet.method1231((!RtKeyListener.key_listener.is_key_down(82, i_1_ ^ 0x1531) ? 0 : 1), (byte) -72);
						class98_sub11.packet.writeShortA(Class376.anInt3173, (byte) 126);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (i_5_ == 15) {
						Class366.anInt3117 = i_2_;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class55.anInt440 = 2;
						IComponentSettings.anInt4286 = i;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class250.aClass171_1913), (Class331.aClass117_2811));
						class98_sub11.packet.writeLEShort(0x7fffffff & (int) (l >>> 32), 17624);
						class98_sub11.packet.writeByte((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1));
						class98_sub11.packet.writeLEShortA(i_3_ + Class272.anInt2038, i_1_ ^ 0xce);
						class98_sub11.packet.writeShortA(i_4_ + aa_Sub2.anInt3562, (byte) 126);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(i_1_ + -101, l, i_3_, i_4_);
					}
					if (i_5_ == 6) {
						if (Player.rights <= 0 || !RtKeyListener.key_listener.is_key_down(82, i_1_ ^ 0x1531) || !RtKeyListener.key_listener.is_key_down(81, i_1_ + 5425)) {
							OutgoingPacket outgoing = Class50.method486(0, 0, 1, -4, i_1_ ^ 0x4e, i_4_, i_3_, true, 1);//path
							if (i_6_ != 1) {
								Class55.anInt440 = 1;
								Class98_Sub10_Sub32.anInt5720 = 0;
								IComponentSettings.anInt4286 = i;
								Class366.anInt3117 = i_2_;
							} else {
								outgoing.packet.writeByte(-1);
								outgoing.packet.writeByte(-1);
								outgoing.packet.writeShort((int) GameWorld.cameraGetHrot);
								outgoing.packet.writeByte(57);
								outgoing.packet.writeByte(Class204.anInt1553);
								outgoing.packet.writeByte(Class151.anInt1213);
								outgoing.packet.writeByte(89);
								outgoing.packet.writeShort((Player.selfPlayer.localXPos));
								outgoing.packet.writeShort((Player.selfPlayer.localYPos));
								outgoing.packet.writeByte(63);

							}
							Class76_Sub2.requestFlag(0, 0, 1, -4, i_1_ ^ 0x4e, i_4_, i_3_, true, 1);
							Class98_Sub10_Sub29.sendPacket(false, outgoing);
						} else
							Class351.shiftClickTele(aa_Sub2.anInt3562 - -i_4_, Class272.anInt2038 - -i_3_, (Player.selfPlayer.height_level), 32);
					}
					if (i_5_ == 4) {
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						IComponentSettings.anInt4286 = i;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class283.aClass171_2146), (Class331.aClass117_2811));
						class98_sub11.packet.writeShort(aa_Sub2.anInt3562 + i_4_);
						class98_sub11.packet.writeLEShort((int) (l >>> 32) & 0x7fffffff, 17624);
						class98_sub11.packet.writeShort(Class272.anInt2038 + i_3_);
						class98_sub11.packet.writeByteS((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), i_1_ ^ ~0x6e);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if (i_5_ == 60) {
						if (Player.rights > 0 && RtKeyListener.key_listener.is_key_down(82, 5503) && RtKeyListener.key_listener.is_key_down(81, i_1_ + 5425))
							Class351.shiftClickTele(i_4_ + aa_Sub2.anInt3562, i_3_ + Class272.anInt2038, (Player.selfPlayer.height_level), -67);
						else {
							IComponentSettings.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 1;
							Class366.anInt3117 = i_2_;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class335.aClass171_2812, Class331.aClass117_2811));
							class98_sub11.packet.writeShortA(i_4_ + aa_Sub2.anInt3562, (byte) 126);
							class98_sub11.packet.writeShortA(Class272.anInt2038 + i_3_, (byte) 126);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						}
					}
					if (i_5_ == 1007) {
						Class98_Sub10_Sub32.anInt5720 = 0;
						IComponentSettings.anInt4286 = i;
						Class55.anInt440 = 2;
						Class366.anInt3117 = i_2_;
						OutgoingPacket class98_sub11 = Class246_Sub3_Sub4.method3023(260, (Class255.aClass171_3206), (Class331.aClass117_2811));
						class98_sub11.packet.writeShortA(i_3_ + Class272.anInt2038, (byte) 126);
						class98_sub11.packet.writeLEShortA(0x7fffffff & (int) (l >>> 32), i_1_ ^ 0xce);
						class98_sub11.packet.method1231((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0), (byte) -120);
						class98_sub11.packet.writeLEShortA(aa_Sub2.anInt3562 + i_4_, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(i_1_ + -101, l, i_3_, i_4_);
					}
					if (i_5_ == 21) {
						GameInterfaceData class293 = Class246_Sub9.method3139((byte) 72, i_4_, i_3_);
						if (class293 != null) {
							Class98_Sub10_Sub32.method1098((byte) 96);
							IComponentSettings class98_sub49 = client.getClickMask(class293);
							Class98_Sub5_Sub2.method970(class98_sub49.anInt4285, class293, class98_sub49.method1668(-1), -6838);
							Class287_Sub2.aString3272 = Class170.method2538(i_1_ + -79, class293);
							if (Class287_Sub2.aString3272 == null)
								Class287_Sub2.aString3272 = "Null";
							Class246_Sub3_Sub3.aString6156 = (class293.aString2224 + "<col=ffffff>");
						}
					} else {
						if (i_5_ == 10) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_6_, -1));
							if (class98_sub39 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class366.anInt3117 = i_2_;
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								Class55.anInt440 = 2;
								IComponentSettings.anInt4286 = i;
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class334.aClass171_3470, Class331.aClass117_2811));
								class98_sub11.packet.method1231((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0), (byte) -109);
								class98_sub11.packet.writeLEShort(i_6_, i_1_ + 17546);
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
								Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub1.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub1.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub1.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub1.getSize());
							}
						}
						if (i_5_ == 46) {
							Class55.anInt440 = 1;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							IComponentSettings.anInt4286 = i;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class267.aClass171_2000, Class331.aClass117_2811));
							class98_sub11.packet.method1232(Class187.anInt1450, (byte) 94);
							class98_sub11.packet.writeLEShortA(Class310.anInt2652, 128);
							class98_sub11.packet.writeShort(Class272.anInt2038 + i_3_);
							class98_sub11.packet.writeShort(Class376.anInt3173);
							class98_sub11.packet.writeShort(aa_Sub2.anInt3562 - -i_4_);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, 1, -4, 0, i_4_, i_3_, true, 1);
						}
						if (i_5_ == 18) {
							IComponentSettings.anInt4286 = i;
							Class55.anInt440 = 2;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(i_1_ + 182, Class98_Sub22_Sub2.aClass171_5792, Class331.aClass117_2811));
							class98_sub11.packet.writeLEShortA(Class272.anInt2038 + i_3_, 128);
							class98_sub11.packet.writeLEShortA(i_6_, 128);
							class98_sub11.packet.writeLEShortA(aa_Sub2.anInt3562 + i_4_, 128);
							class98_sub11.packet.writeByte((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1));
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class44.method427(-19181, i_4_, i_3_);
						}
						if (i_5_ == 1008) {
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							IComponentSettings.anInt4286 = i;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(i_1_ + 182, Class98_Sub50.aClass171_4290, Class331.aClass117_2811));
							class98_sub11.packet.writeShort(i_6_);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						}
						if (i_5_ == 22) {
							Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
							if (class246_sub3_sub4_sub2_sub2 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class55.anInt440 = 2;
								Class366.anInt3117 = i_2_;
								IComponentSettings.anInt4286 = i;
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class98_Sub37.aClass171_4168, Class331.aClass117_2811));
								class98_sub11.packet.writeLEShortA(i_6_, 128);
								class98_sub11.packet.method1231(RtKeyListener.key_listener.is_key_down(82, i_1_ ^ 0x1531) ? 1 : 0, (byte) 122);
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
								Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
							}
						}
						if (i_5_ == 44) {
							Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.playerArray[i_6_]);
							if (class246_sub3_sub4_sub2_sub2 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class366.anInt3117 = i_2_;
								IComponentSettings.anInt4286 = i;
								Class55.anInt440 = 2;
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class198.aClass171_1521, Class331.aClass117_2811));
								class98_sub11.packet.writeShort(i_6_);
								class98_sub11.packet.writeByte((RtKeyListener.key_listener.is_key_down(82, 5503) ? 1 : 0));
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
								Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub2.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub2.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub2.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub2.getSize());
							}
						}
						if (i_5_ == 23) {
							IComponentSettings.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class284_Sub2.aClass171_5180, Class331.aClass117_2811));
							class98_sub11.packet.writeLEShortA(i_4_ - -aa_Sub2.anInt3562, i_1_ ^ 0xce);
							class98_sub11.packet.method1231((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), (byte) 101);
							class98_sub11.packet.writeShortA(i_6_, (byte) 126);
							class98_sub11.packet.writeLEShortA(i_3_ - -Class272.anInt2038, 128);
							Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
							Class44.method427(-19181, i_4_, i_3_);
						}
						if (i_5_ == 12) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_6_, -1));
							if (class98_sub39 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class55.anInt440 = 2;
								IComponentSettings.anInt4286 = i;
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								Class366.anInt3117 = i_2_;
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(i_1_ + 182, Class41.aClass171_371, Class331.aClass117_2811));
								class98_sub11.packet.writeShort(i_6_);
								class98_sub11.packet.method1231(!RtKeyListener.key_listener.is_key_down(82, i_1_ + 5425) ? 0 : 1, (byte) -99);
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
								Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub1.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub1.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub1.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub1.getSize());
							}
						}
						if (i_5_ == 25) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254.method3990(i_6_, i_1_ ^ ~0x4e));
							if (class98_sub39 != null) {
								Class366.anInt3117 = i_2_;
								Class55.anInt440 = 2;
								IComponentSettings.anInt4286 = i;
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								OutgoingPacket class98_sub11 = (Class246_Sub3_Sub4.method3023(260, Class104.aClass171_901, Class331.aClass117_2811));
								class98_sub11.packet.writeShort(i_6_);
								class98_sub11.packet.method1244((!RtKeyListener.key_listener.is_key_down(82, 5503) ? 0 : 1), (byte) 112);
								Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
								Class76_Sub2.requestFlag(0, 0, class246_sub3_sub4_sub2_sub1.getSize(), -2, 0, (class246_sub3_sub4_sub2_sub1.walkQueueZ[0]), (class246_sub3_sub4_sub2_sub1.walkQueueX[0]), true, class246_sub3_sub4_sub2_sub1.getSize());
							}
						}
						if (Class98_Sub10_Sub9.aBoolean5585)
							Class98_Sub10_Sub32.method1098((byte) -30);
						if (RtKeyListener.aClass293_593 == null || Class42_Sub3.anInt5365 != 0)
							break;
						Class341.method3812(i_1_ + -77, RtKeyListener.aClass293_593);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("st.A(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (class98_sub46_sub8 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3605(int i, int i_7_, byte[] is, int i_8_) throws IOException {
		try {
			if (i_7_ < 0 || i < 0 || i_7_ + i > is.length)
				throw new IOException();
			synchronized (this) {
				if (anIOException2569 != null)
					throw new IOException(anIOException2569.toString());
				int i_9_;
				if (anInt2574 <= anInt2572)
					i_9_ = anInt2570 - anInt2572 - (-anInt2574 - -1);
				else
					i_9_ = -1 + anInt2574 + -anInt2572;
				if (i_9_ < i_7_)
					throw new IOException("");
				if (i_8_ != -5)
					method3603(true);
				if (i_7_ + anInt2572 > anInt2570) {
					int i_10_ = anInt2570 - anInt2572;
					Class236.method2894(is, i, aByteArray2568, anInt2572, i_10_);
					Class236.method2894(is, i_10_ + i, aByteArray2568, 0, -i_10_ + i_7_);
				} else
					Class236.method2894(is, i, aByteArray2568, anInt2572, i_7_);
				anInt2572 = (i_7_ + anInt2572) % anInt2570;
				this.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("st.B(" + i + ',' + i_7_ + ',' + (is != null ? "{...}" : "null") + ',' + i_8_ + ')'));
		}
	}

	final void method3606(byte i) {
		try {
			synchronized (this) {
				if (anIOException2569 == null)
					anIOException2569 = new IOException("");
				if (i > -113)
					return;
				this.notifyAll();
			}
			try {
				aThread2571.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "st.D(" + i + ')');
		}
	}

	static final int method3607(int i, String string) {
		try {
			return PlayerUpdate.method2859(10, true, string, -21972);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("st.C(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	PacketSender(OutputStream outputstream, int i) {
		anInt2572 = 0;
		try {
			anOutputStream2573 = outputstream;
			anInt2570 = 1 + i;
			aByteArray2568 = new byte[anInt2570];
			aThread2571 = new Thread(this);
			aThread2571.setDaemon(true);
			aThread2571.start();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("st.<init>(" + (outputstream != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
