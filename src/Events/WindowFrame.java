package Events;

import javax.swing.JFrame;

public class WindowFrame extends JFrame {
	public WindowFrame() {
		this.setTitle("Window example");
		this.setBounds(500,300,500,500);
		this.setVisible(true);
		
		WindowBehavior behaviors = new WindowBehavior();
		this.addWindowListener(behaviors);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
