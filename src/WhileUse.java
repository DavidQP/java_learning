import static javax.swing.JOptionPane.showInputDialog;

public class WhileUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correctPassword = "welcomeToBogota";
		String userIntents = "";
		
		while(!correctPassword.equals(userIntents)) {
			userIntents = showInputDialog("Please type your password");
		}
		
		System.out.println("Your password is correct");
	}

}
