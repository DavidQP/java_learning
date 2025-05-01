package SwingExamples;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class CenterFrame extends JFrame {
	public CenterFrame() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int screenHeight = screen.height;
		int screenWidth = screen.width;
		this.setBounds(screenWidth/4, screenHeight/4, screenWidth/2, screenHeight/2);
		this.setVisible(true);
		this.setTitle("Center my first Window");
	}
}
