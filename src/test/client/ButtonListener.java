package test.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the button listener for all button in ClientGUI object.
 * 
 * @author Bing Li
 *
 */
public class ButtonListener implements ActionListener {

	public static final int Connect_Button = 0;
	public static final int Set_button = 1;

	private int buttontype = 0;// 0: connect button
								// 1: send button
	private ClientGUI client;

	/**
	 * Constructor
	 * 
	 * @param type
	 *            button type
	 */
	public ButtonListener(ClientGUI client, int type) {
		this.buttontype = type;
		this.client = client;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (this.buttontype) {
		case 0:
			this.client.connect();
			break;
		case 1:
			this.client.set();
			break;

		}
	}

}
