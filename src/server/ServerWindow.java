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
 * This is the GUI of server
 * 
 * @author Bing Li
 *
 */
public class ServerWindow extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton button;
	private JButton mButton;
	private JFrame frame;
	private JLabel label;
	private boolean keepRunning = true;
	private Main main;

	/**
	 * Default constructor
	 */
	public ServerWindow(Main m) {
		this.main = m;
		frame = new JFrame();
		label = new JLabel("running ^_^", SwingConstants.CENTER);
		button = new JButton("close server");
		mButton = new JButton("Show Map");
		Container container = frame.getContentPane();
		container.setLayout(new GridLayout(3, 1));
		container.add(label);
		container.add(button);
		container.add(mButton);
		mButton.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						main.outputDataFile();
						monitor.Interfaces.startup();
						
						
					}
					
				});
		button.addActionListener(this);
		frame.setSize(200, 100);
		frame.setVisible(true);
		frame.setLocation(500, 500);
		// fame.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)){
			keepRunning=false;
			frame.dispose();
			System.exit(0);
		}
	}

}
