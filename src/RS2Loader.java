import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class RS2Loader extends Applet {
	private static final long serialVersionUID = 1L;
	public static Properties params = new Properties();
	public static String mainurl = "127.0.0.1";
	public JFrame appletFrame;
	public JPanel appletPanel = new JPanel();

	public static void main(String[] strings) {
		RS2Loader runclient = new RS2Loader();
		runclient.doFrame();

	}

	public void init() {
		doApplet();
	}

	void doApplet() {
		try {
			readVars();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void doFrame() {
		try {
			readVars();
			openFrame();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void readVars() throws IOException {
		params.put("cabbase", "g.cab");
		params.put("java_arguments", "-Xmx1024m -Dsun.java2d.noddraw=true");
		params.put("colourid", "0");
		params.put("worldid", "16");
		params.put("lobbyid", "15");
		params.put("demoid", "0");
		params.put("demoaddress", "");
		params.put("modewhere", "0");
		params.put("modewhat", "0");
		params.put("lang", "0");
		params.put("objecttag", "0");
		params.put("js", "1");
		params.put("game", "0");
		params.put("affid", "0");
		params.put("advert", "1");
		params.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		params.put("country", "0");
		params.put("haveie6", "0");
		params.put("havefirefox", "1");
		params.put("cookieprefix", "");
		params.put("cookiehost", "127.0.0.1");
		params.put("cachesubdirid", "0");
		params.put("crashurl", "");
		params.put("unsignedurl", "");
		params.put("sitesettings_member", "1");
		params.put("frombilling", "false");
		params.put("sskey", "");
		params.put("force64mb", "false");
		params.put("worldflags", "8");
		params.put("lobbyaddress", "127.0.0.1");
	}

	public void openFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appletFrame = new JFrame("Jagex");
					appletFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					appletFrame.setLayout(new BorderLayout());
					appletPanel.setLayout(new BorderLayout());
					appletPanel.add(RS2Loader.this);
					appletPanel.setPreferredSize(new Dimension(765, 503));
					appletFrame.getContentPane().add(appletPanel, "Center");
					appletFrame.pack();
					appletFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void startClient() {
		try {
			client.provideLoaderApplet(this);
			client var_client = new client();
			var_client.init();
			var_client.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public String getParameter(String string) {
		return (String) params.get(string);
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public URL getCodeBase() {
		URL url;
		try {
			url = new URL("https://127.0.0.1/");
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return url;
	}

}
