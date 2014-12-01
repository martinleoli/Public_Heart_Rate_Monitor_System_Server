package monitor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {

	public Main() {
		Display display = new Display();
		Shell shell = new Shell(display);
		Browser browser = new Browser(shell, SWT.NONE);
		
		shell.setBounds(100, 100, 1010, 810);

		browser.setBounds(5, 5, 1000, 800);
		browser.setUrl("file:///home/bing/workspace/Public_Heart_Rate_Monitor_System_Server/Maps/map.html");
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();

	}

}
