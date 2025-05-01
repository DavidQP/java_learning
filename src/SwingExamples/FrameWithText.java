package SwingExamples;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;

public class FrameWithText extends JFrame {
	public FrameWithText() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int screenHeight = screen.height;
		int screenWidth = screen.width;
		this.setBounds(screenWidth/4, screenHeight/4, screenWidth/2, screenHeight/2);
		this.setVisible(true);
		this.setTitle("Default text");
		this.setResizable(false);
		SheatExample mySheat = new SheatExample();
		this.add(mySheat);
		
	}
}

class SheatExample extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("My first text on Swing library", 100, 100);
	}
}