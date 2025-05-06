package SwingExamples;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class ColorPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;		
		g2.setBackground(Color.WHITE);
		
		Rectangle2D rectangle = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.GREEN);
		g2.fill(rectangle);
		//g2.draw(rectangle);
		
		
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rectangle);
		//g2.setPaint(Color.RED);
		g2.setPaint(new Color(0,140,255));
		g2.fill(ellipse);
		//g2.draw(ellipse);
	}
}
