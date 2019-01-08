import java.net.*;
import java.io.*;

public class Example {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://ifconfig.co/ip");
				Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("PROXY", PORT));
				Authenticator authenticator = new Authenticator() {
        	public PasswordAuthentication getPasswordAuthentication() {
          	return (new PasswordAuthentication("username","pass".toCharArray()));
        	}
    		};
    		Authenticator.setDefault(authenticator);
        URLConnection conn = url.openConnection(proxy);
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                conn.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
