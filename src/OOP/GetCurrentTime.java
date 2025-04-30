package OOP;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static java.awt.Toolkit.getDefaultToolkit;
import java.util.Date;

public class GetCurrentTime implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date currentTime = new Date();
		System.out.println("The current time is " + currentTime.getTime());
		getDefaultToolkit().beep();
	}
}
