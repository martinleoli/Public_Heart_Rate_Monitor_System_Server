package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * This is the agent to communicate with users
 * 
 * @author Bing Li
 *
 */

public class IOService implements Runnable {

	private Socket socket, socket1;
	private ObjectInputStream in;
	private ObjectOutputStream out;
	// private database.MyIMDB db;
	boolean run = true;

	/**
	 * default constructor
	 * 
	 * @param s
	 *            input socket
	 * @param s1
	 *            output socket
	 */
	public IOService(Socket s, Socket s1/* ,database.MyIMDB db */) {
		socket = s;
		socket1 = s1;
		// this.db = db;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("something");

		try {
			// System.out.println("something2");
			try {
				out = new ObjectOutputStream(socket.getOutputStream());
				// System.out.println("something1");
				in = new ObjectInputStream(socket.getInputStream());

				handle();// handle message
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void handle() {
	}

}
