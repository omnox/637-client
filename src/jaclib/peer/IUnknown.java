/* IUnknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class IUnknown extends Peer {
	protected IUnknown(jaa var_jaa) {
		try {
			reference = new IUnknownReference(this, var_jaa);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final long b(int i) {
		long l;
		try {
			if (i < 22)
				return -83L;
			l = super.a();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	public final native long AddRef();
}
