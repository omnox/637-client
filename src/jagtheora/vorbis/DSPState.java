/* DSPState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer {
	public DSPState(VorbisInfo vorbisinfo) {
		try {
			init(vorbisinfo);
			if (this.b())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native void blockIn(VorbisBlock vorbisblock);

	protected final native void clear();

	public final native float[][] pcmOut(int i);

	public final native double granuleTime();

	public final native void read(int i);

	private final native void init(VorbisInfo vorbisinfo);
}
