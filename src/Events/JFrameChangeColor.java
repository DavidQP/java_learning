package Events;

import javax.swing.JFrame;

public class JFrameChangeColor extends JFrame {
	
	public JFrameChangeColor() {
		this.setTitle("Change color");
		this.setBounds(700, 300, 500, 300);
		JPanelChangeColor myPanel = new JPanelChangeColor();
		this.add(myPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
