package Events;

//import java.awt.event.WindowListener; // An interface
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter; // This abstract class, implements two interfaces

public class WindowBehavior extends WindowAdapter {
		
	public void windowClosed(WindowEvent e) {
		
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Thanks for using this window goodbye");
	}
	
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Minimizing window");
	}
	
}
