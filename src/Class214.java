/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.lang.reflect.Method;

final class Class214 {
	static final ha method2784(int i, int i_0_, Canvas canvas, d var_d, RuneScapeCache class207) {
		try {
			ha var_ha;
			try {
				if (!Class319.method3660(true))
					throw new RuntimeException("");
				int i_1_ = -84 / ((0 - i) / 52);
				if (!Class134_Sub1.method2246("jagdx", (byte) -36))
					throw new RuntimeException("");
				Class var_class = Class.forName("ha_Sub3_Sub1");
				Method method = (var_class.getDeclaredMethod("createToolkit", new Class[] { Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("Class207"), Class.forName("java.lang.Integer") }));
				var_ha = (ha) method.invoke(null, (new Object[] { canvas, var_d, class207, new Integer(i_0_) }));
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			} catch (Throwable throwable) {
				throw new RuntimeException("");
			}
			return var_ha;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
