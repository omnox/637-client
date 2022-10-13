/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ba extends r implements Interface9 {
	long nativeid;

	public final native void w(boolean bool);

	ba(oa var_oa) {
		/* empty */
	}

	protected final void finalize() {
		if (this.nativeid != 0L)
			Class192.method2654(false, this);
	}
}
