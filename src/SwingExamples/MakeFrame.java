package SwingExamples;

import javax.swing.JFrame;

public class MakeFrame extends JFrame {
	public MakeFrame() {
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Saludando a mi mamá desde Java con Swing");
		//this.setSize(500, 300);
		//this.setLocation(650, 350);
		// setSize + SetLocation
		this.setResizable(false);
		this.setBounds(650, 350, 500,300);
		this.setExtendedState(MAXIMIZED_BOTH);
	}
}
