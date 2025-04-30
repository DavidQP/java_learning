package OOP;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.util.Date;
import static java.awt.Toolkit.getDefaultToolkit;

public class TimerExampleRefactoring {
	private int interval;
	private boolean sound;
	
	public TimerExampleRefactoring(int interval, boolean sound) {
		this.interval = interval;
		this.sound = sound;
	}
	
	public void init() {
		CurrentTime getTime = new CurrentTime();
		Timer myTimer = new Timer(this.interval, getTime);
		myTimer.start();
	}
	
	private class CurrentTime implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			Date currentTime = new Date();
			System.out.println("The current time is "+ currentTime);
			
			if(sound) getDefaultToolkit().beep();
		}
	}
}
