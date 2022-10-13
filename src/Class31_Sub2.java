/* Class31_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class Class31_Sub2 extends Class31 {
	private ProxySelector aProxySelector3587;
	static Class aClass3588;
	static Class aClass3589;

	private final Socket method310(int i, Proxy proxy) throws IOException {
		Socket socket;
		try {
			if (proxy.type() == Proxy.Type.DIRECT)
				return method308((byte) -53);
			java.net.SocketAddress socketaddress = proxy.address();
			if (!(socketaddress instanceof InetSocketAddress))
				return null;
			InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
			if (proxy.type() != Proxy.Type.HTTP) {
				if (proxy.type() == Proxy.Type.SOCKS) {
					Socket socket_0_ = new Socket(proxy);
					socket_0_.connect(new InetSocketAddress(this.aString299, this.anInt302));
					return socket_0_;
				}
			} else {
				String string = null;
				try {
					Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
					Method method = (var_class.getDeclaredMethod("getProxyAuth", (new Class[] { (aClass3588 == null ? aClass3588 = method312("java.lang.String") : aClass3588), Integer.TYPE })));
					method.setAccessible(true);
					Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
					if (object != null) {
						Method method_1_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
						method_1_.setAccessible(true);
						if (((Boolean) method_1_.invoke(object, new Object[0])).booleanValue()) {
							Method method_2_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
							method_2_.setAccessible(true);
							Method method_3_ = (var_class.getDeclaredMethod("getHeaderValue", (new Class[] { (aClass3589 == null ? (aClass3589 = method312("java.net.URL")) : aClass3589), (aClass3588 == null ? (aClass3588 = method312("java.lang.String")) : aClass3588) })));
							method_3_.setAccessible(true);
							String string_4_ = ((String) method_2_.invoke(object, new Object[0]));
							String string_5_ = ((String) (method_3_.invoke(object, new Object[] { new URL("https://" + this.aString299 + "/"), "https" })));
							string = string_4_ + ": " + string_5_;
						}
					}
				} catch (Exception exception) {
					/* empty */
				}
				return method311(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string);
			}
			if (i != -6562)
				aProxySelector3587 = null;
			socket = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return socket;
	}

	final Socket method305(int i) throws IOException {
		Socket socket;
		try {
			if (i != -2)
				return null;
			boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
			if (!bool)
				System.setProperty("java.net.useSystemProxies", "true");
			boolean bool_6_ = this.anInt302 == 443;
			List list;
			List list_7_;
			try {
				list = aProxySelector3587.select(new URI((!bool_6_ ? "http" : "https") + "://" + this.aString299));
				list_7_ = aProxySelector3587.select(new URI((bool_6_ ? "http" : "https") + "://" + this.aString299));
			} catch (URISyntaxException urisyntaxexception) {
				return method308((byte) -53);
			}
			list.addAll(list_7_);
			Object[] objects = list.toArray();
			IOException_Sub1 ioexception_sub1 = null;
			Object[] objects_8_ = objects;
			for (int i_9_ = 0; i_9_ < objects_8_.length; i_9_++) {
				Object object = objects_8_[i_9_];
				Proxy proxy = (Proxy) object;
				Socket socket_10_;
				try {
					Socket socket_11_ = method310(-6562, proxy);
					if (null == socket_11_)
						continue;
					socket_10_ = socket_11_;
				} catch (IOException_Sub1 ioexception_sub1_12_) {
					ioexception_sub1 = ioexception_sub1_12_;
					continue;
				} catch (IOException ioexception) {
					continue;
				}
				return socket_10_;
			}
			if (null != ioexception_sub1)
				throw ioexception_sub1;
			socket = method308((byte) -53);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return socket;
	}

	private final Socket method311(String string, int i, String string_13_) throws IOException {
		Socket socket;
		try {
			Socket socket_14_ = new Socket(string, i);
			socket_14_.setSoTimeout(10000);
			OutputStream outputstream = socket_14_.getOutputStream();
			if (null == string_13_)
				outputstream.write(("CONNECT " + this.aString299 + ":" + this.anInt302 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
			else
				outputstream.write(("CONNECT " + this.aString299 + ":" + this.anInt302 + " HTTP/1.0\n" + string_13_ + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
			outputstream.flush();
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(socket_14_.getInputStream())));
			String string_15_ = bufferedreader.readLine();
			if (string_15_ != null) {
				if (string_15_.startsWith("HTTP/1.0 200") || string_15_.startsWith("HTTP/1.1 200"))
					return socket_14_;
				if (string_15_.startsWith("HTTP/1.0 407") || string_15_.startsWith("HTTP/1.1 407")) {
					int i_16_ = 0;
					String string_17_ = "proxy-authenticate: ";
					for (string_15_ = bufferedreader.readLine(); string_15_ != null && i_16_ < 50; string_15_ = bufferedreader.readLine()) {
						if (string_15_.toLowerCase().startsWith(string_17_)) {
							string_15_ = string_15_.substring(string_17_.length()).trim();
							int i_18_ = string_15_.indexOf(' ');
							if (-1 != i_18_)
								string_15_ = string_15_.substring(0, i_18_);
							throw new IOException_Sub1(string_15_);
						}
						i_16_++;
					}
					throw new IOException_Sub1("");
				}
			}
			outputstream.close();
			bufferedreader.close();
			socket_14_.close();
			socket = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return socket;
	}

	public Class31_Sub2() {
		try {
			aProxySelector3587 = ProxySelector.getDefault();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static Class method312(String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
		return var_class;
	}
}
