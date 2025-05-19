package Events;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class WindowBehavior implements WindowListener {
	public void windowActivated(WindowEvent e) {
		System.out.println("Activate window");
	}
	
	public void windowClosed(WindowEvent e) {
		
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Thanks for using this window goodbye");
	}
	
	public void windowDeactivated(WindowEvent e) {
		
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Opening window");
	}
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Minimizing window");
	}
	
	public void windowOpened(WindowEvent e) {
		
	}
}
