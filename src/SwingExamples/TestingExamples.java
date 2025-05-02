package SwingExamples;

import javax.swing.JFrame;

public class TestingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testingMakeFrames();
		//testingCenterFrame();
		//testFrameWithText();
		testingFigures();
	}
	
	public static void testingFigures() {
		Figure myFigure = new Figure();
		FigurePanel myPanel = new FigurePanel();
		myFigure.add(myPanel);
	}
	
	public static void testFrameWithText() {
		FrameWithText myFrame = new FrameWithText();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void testingCenterFrame() {
		CenterFrame centerWindow = new CenterFrame();
		centerWindow.setResizable(false);
	}
	
	public static void testingMakeFrames() {
		MakeFrame myFirstFrame = new MakeFrame();
	}

}
