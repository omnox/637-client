/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
	private long peer;

	protected abstract void clear();

	public final void a() {
		do {
			try {
				if (b())
					break;
				clear();
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	protected final void finalize() throws Throwable {
		try {
			if (!b())
				a();
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final native void init();

	private final void setPeer(long l) {
		try {
			peer = l;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean b() {
		try {
			if ((peer ^ 0xffffffffffffffffL) != -1L)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		init();
	}
}
