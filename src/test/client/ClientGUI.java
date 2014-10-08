package test.client;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import database.data.Location;
import database.data.UserInfo;
import database.data.UserStatus;
import database.interfaces.PersonStatus;

/**
 * This is the GUI of test Client
 * 
 * @author bing
 *
 */
public class ClientGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean connectStatus = false;
	private int window_height = 500;
	private int window_width = 500;

	private PersonStatus userStatus;

	public ClientGUI() {
		this(new UserStatus(new UserInfo(2222, "Long", "Ma"), new Location(222,
				222), 222));
	}

	public ClientGUI(PersonStatus us) {
		// set information
		this.userStatus = us;
		this.setTitle("Test Client: ID: " + this.userStatus.getPerson().getID());

		// initialize components
		JButton setButton = new JButton("Set");
		JButton connectButton = new JButton("Connect");
		JTextArea log = new JTextArea();
		JTextField userID = new JTextField(us.getPerson().getID() + "");
		JTextField userFirstName = new JTextField(us.getPerson().getFirstName());
		JTextField userLastName = new JTextField(us.getPerson().getLastName());
		JTextField longtitude = new JTextField(us.getCoordinate().getLongitude()+"");
		JTextField latitude = new JTextField(us.getCoordinate().getLatitude()+"");
		JScrollPane logPane = new JScrollPane(log,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JLabel label1 = new JLabel("User Information");
		JLabel label2 = new JLabel("User ID:");
		JLabel label3 = new JLabel("First Name:");
		JLabel label4 = new JLabel("Last Name:");
		JLabel label5 = new JLabel("Coordinate");
		JLabel label6 = new JLabel("Longtitude:");
		JLabel label7 = new JLabel("Latitude:");
		// ----------------------Edit here-------------------
		label1.setBounds(10, 10, 150, 20);
		label2.setBounds(10, 35, 70, 20);
		label3.setBounds(10, 60, 90, 20);
		label4.setBounds(210, 60, 90, 20);
		label5.setBounds(10, 85, 90, 20);
		label6.setBounds(10, 110, 90, 20);
		label7.setBounds(210, 110, 90, 20);

		userID.setBounds(80, 35, 200, 20);
		userFirstName.setBounds(100, 60, 100, 20);
		userLastName.setBounds(310, 60, 100, 20);
		longtitude.setBounds(100, 110, 100, 20);
		latitude.setBounds(310, 110, 100, 20);

		log.setEditable(false);

		// add all components
		Container window = getContentPane();
		window.setLayout(null);
		window.add(label1);
		window.add(label2);
		window.add(userID);
		window.add(label3);
		window.add(userFirstName);
		window.add(label4);
		window.add(userLastName);
		window.add(label5);
		window.add(label6);
		window.add(longtitude);
		window.add(label7);
		window.add(latitude);
		// ----------------------Edit here-------------------

		// set windows size and postion
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		setBounds(width / 2 - (window_width / 2), height / 2
				- (window_height / 2), window_width, window_height);
		this.setResizable(false);

		this.setVisible(true);

	}

	public static void main(String args[]) {
		new ClientGUI();

	}

}
