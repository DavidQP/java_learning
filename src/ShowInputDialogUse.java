import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class ShowInputDialogUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = showInputDialog("Please type your name?");
		int age = parseInt(showInputDialog("How old are you?"));
		double salary = parseDouble(showInputDialog("How much is your salary by month?"));
		System.out.println("Hi " + name + " your age is " + age + " and your salary by month is " + salary);
		
	}

}
