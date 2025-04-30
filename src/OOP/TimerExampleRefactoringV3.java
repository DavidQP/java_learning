package OOP;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import static java.awt.Toolkit.getDefaultToolkit;
import javax.swing.Timer;
import static javax.swing.JOptionPane.showMessageDialog;

public class TimerExampleRefactoringV3 {
	public void init(int interval, final boolean sound) {
		
		class GetCurrentTime implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				
				Date currentTime = new Date();
				
				System.out.println("The current time is " + currentTime);
				if(sound) getDefaultToolkit().beep();
			}
		}
		
		GetCurrentTime getTime = new GetCurrentTime();
		Timer myTimer = new Timer(interval, getTime);
		
		myTimer.start();
		showMessageDialog(null, "Click in the but if you cancel the program");
		
	}
}
