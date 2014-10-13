package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

/**
 * Main class of server. It is the entry.
 * 
 * @author Bing Li
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		new ServerWindow();

		ServerSocket ssocket = new ServerSocket(ServerInfo.server_port_number);

		while (true) {
			System.out.println("waiting");
			Socket s = ssocket.accept();

			System.out.println("connected");
			IOService i = new IOService(s);
			Thread t = new Thread(i);
			t.start();
		}

	}

}
