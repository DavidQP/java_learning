package Events;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JPanelChangeColor extends JPanel implements ActionListener {
	
	JButton blueButton = new JButton("Blue");
	JButton yellowButton = new JButton("Yellow");
	JButton redButton = new JButton("Red");

	public JPanelChangeColor() {
		
		this.add(blueButton);
		this.add(yellowButton);
		this.add(redButton);
		blueButton.addActionListener(this);
		yellowButton.addActionListener(this);
		redButton.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		Object button = e.getSource();
		
		if(button == blueButton) {			
			this.setBackground(Color.BLUE);
		} else if(button == yellowButton) {
			this.setBackground(Color.YELLOW);
		} else if(button == redButton) {
			this.setBackground(Color.RED);
		}
		
	}
}
