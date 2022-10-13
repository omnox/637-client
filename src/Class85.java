
/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class85 {
	static int anInt638;
	/* synthetic */ static Class aClass639;

	static final boolean getInterfaceData(int interfaceID, int i_0_) { //Interfaces
		try {
			if (Class246_Sub3_Sub3_Sub1.loadedInterfaceFlags[interfaceID])
				return true;
			if (!Class98_Sub17_Sub1.aClass207_5783.method2756(false, interfaceID))
				return false;
			int i_1_ = Class98_Sub17_Sub1.aClass207_5783.method2761(0, interfaceID);
			if ((i_1_ ^ 0xffffffff) == -1) {
				Class246_Sub3_Sub3_Sub1.loadedInterfaceFlags[interfaceID] = true;
				return true;
			}
			if (Class159.gameInterfaces[interfaceID] == null)
				Class159.gameInterfaces[interfaceID] = new GameInterfaceData[i_1_];
			for (int componentID = 0; componentID < i_1_; componentID++) {
				if (Class159.gameInterfaces[interfaceID][componentID] == null) {
					byte[] archiveData = Class98_Sub17_Sub1.aClass207_5783.readArchive(componentID, interfaceID);
					if (archiveData != null) {
						GameInterfaceData interfaceComponent = (Class159.gameInterfaces[interfaceID][componentID] = new GameInterfaceData());
						((GameInterfaceData) interfaceComponent).anInt2248 = (interfaceID << -1849090224) - -componentID;
						if (archiveData[0] != -1)
							throw new IllegalStateException("if1");
						interfaceComponent.decodeInterface(new RSByteBuffer(archiveData), -947);
					}
				}
			}
			Class246_Sub3_Sub3_Sub1.loadedInterfaceFlags[interfaceID] = true;
			if (i_0_ < 1)
				method838(null);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fha.A(" + interfaceID + ',' + i_0_ + ')');
		}
	}

	static final void method838(Class84 class84) {
		Class98_Sub10_Sub27.aClass84_5692 = class84;
	}

	static final void method839(int i) {
		do {
			try {
				try {
					Method method = (aClass639 != null ? aClass639 : (aClass639 = method840("java.lang.Runtime"))).getMethod("availableProcessors", new Class[0]);
					if (method != null) {
						try {
							Runtime runtime = Runtime.getRuntime();
							Integer integer = (Integer) method.invoke(runtime);
							Class98_Sub46_Sub19.anInt6065 = integer.intValue();
						} catch (Throwable throwable) {
							/* empty */
						}
					}
					if (i == 12345)
						break;
					anInt638 = 1;
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fha.B(" + i + ')');
			}
		} while (false);
	}

	Class85(int i, int i_3_) {
		/* empty */
	}

	/* synthetic */ static Class method840(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
