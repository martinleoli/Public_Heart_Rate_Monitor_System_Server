package server;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import database.data.UserStatusList;
import database.interfaces.PersonStatus;

/**
 * Main class of server. It is the entry.
 * 
 * @author Bing Li
 *
 */
public class Main {

	private ServerSocket ssocket;
	private UserStatusList usl;

	public Main() {
		new ServerWindow(this);
		usl = new UserStatusList();

		try {
			ssocket = new ServerSocket(ServerInfo.server_port_number);
			while (true) {
				System.out.println("waiting");
				Socket s;

				s = ssocket.accept();
				System.out.println("connected");
				IOService i = new IOService(this, s);
				Thread t = new Thread(i);
				t.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addUserStatus(PersonStatus ps) {
		for (PersonStatus p : this.usl) {
			if (p.getPerson().getID() == ps.getPerson().getID()) {
				usl.remove(p);
				break;
			}
		}
		usl.add(ps);
		// -------------------test-----------------------------
		System.out.println("--------------------------");
		for (PersonStatus p : this.usl) {
			System.out.println(p.toString());
		}
	}

	/**
	 * output user status to data.txt for Map display
	 */
	public void outputDataFile() {
		try {
			PrintWriter pw = new PrintWriter("Maps/Data.txt");
			// pw.println("Hello!");
			for (PersonStatus p : this.usl) {
				pw.println(""+p.getCoordinate().getLongitude()
						+", "+p.getCoordinate().getLatitude()
						+", "+p.getHeartRate());
			}

			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
