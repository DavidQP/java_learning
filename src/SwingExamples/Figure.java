package SwingExamples;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Figure extends JFrame {
	public Figure() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenDimension = toolkit.getScreenSize();
		
		int height = screenDimension.height;
		int width  = screenDimension.width;
		
		this.setBounds(width/4, height/4, width/2, height/2);
		this.setVisible(true);
		this.setTitle("My first Figure using JFrame and JPanel");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
