package server;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Warning windows for showing warning messages
 * 
 * @author Bing Li
 *
 */
public class WarningWindows extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton button;
	private JFrame frame;
	private JLabel label;

	public WarningWindows(String mg) {

		frame = new JFrame();
		label = new JLabel(mg, SwingConstants.CENTER);
		button = new JButton("OK");

		Container container = frame.getContentPane();
		container.setLayout(new GridLayout(2, 1));
		container.add(label);
		container.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				frame.dispose();

			}

		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(500, 100);
		frame.setVisible(true);
		frame.setLocation(500, 500);

	}

	public static void main(String[] args) {
		new WarningWindows("Hello");
	}

}
