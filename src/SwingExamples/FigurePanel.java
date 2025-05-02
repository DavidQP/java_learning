package SwingExamples;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class FigurePanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Color defaultColor = Color.BLUE;
		g.setColor(defaultColor);
		
		//g.drawRect(50, 50, 100, 100);
		g.drawOval(300, 300, 50, 50);
		g.drawLine(200, 200, 400, 200);
	}
}
