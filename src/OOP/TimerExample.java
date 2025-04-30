package OOP;

import javax.swing.Timer;
import javax.swing.JOptionPane;

public class TimerExample {
	public static void main(String[] args) {
		GetCurrentTime getTime = new GetCurrentTime();
		Timer myTimer = new Timer(3000, getTime);
		
		myTimer.start();
		JOptionPane.showMessageDialog(null, "Click in acept to cancel");
		System.exit(0);
	}
}
