package SwingExamples;

import java.awt.SystemColor;

import javax.swing.JFrame;

public class ColorFrame extends JFrame {
	
	public ColorFrame() {
		this.setTitle("My frame with colors");
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel colorPanel = new ColorPanel();
		this.add(colorPanel);
		colorPanel.setBackground(SystemColor.window);
	}
}
