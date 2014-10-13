package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import database.interfaces.PersonStatus;

/**
 * This is the agent to communicate with users
 * 
 * @author Bing Li
 *
 */

public class IOService implements Runnable {

	private Socket socket;
	private ObjectInputStream in;
	private Main m;
	// private ObjectOutputStream out;

	boolean run = true;

	/**
	 * default constructor
	 * 
	 * @param s
	 *            input socket
	 * @param s1
	 *            output socket
	 */
	public IOService(Main m, Socket s) {
		socket = s;
		this.m = m;

	}

	@Override
	public void run() {

		//System.out.println("something");

		try {

			try {
				// out = new ObjectOutputStream(socket.getOutputStream());

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

	/**
	 * handle IO service
	 */
	private void handle() {
		boolean connected = true;
		PersonStatus ps;
		while (connected) {

			try {
				ps = (PersonStatus) in.readObject();
				//System.out.println("Recieved:\n" + ps.toString());

				// --------------------------add handle method for ps here
				m.addUserStatus(ps);
				// -------------------
				connected = false;

			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				connected = false;

				try {
					socket.close();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				e.printStackTrace();
			}

		}
	}

}
