package Events;

import javax.swing.JFrame;

public class TestEventExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testWindowEvents();
		//testChangeColorEvent();
	}
	
	public static void testWindowEvents() {
		WindowFrame firstWindow = new WindowFrame();
		WindowFrame secondWindow = new WindowFrame();
		firstWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		secondWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public static void testChangeColorEvent() {
		JFrameChangeColor myFrame = new JFrameChangeColor();
	}

}
