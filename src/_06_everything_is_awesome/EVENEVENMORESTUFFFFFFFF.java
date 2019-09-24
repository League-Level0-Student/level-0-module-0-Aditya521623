package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EVENEVENMORESTUFFFFFFFF {

	public static void main(String[] args) {
		String p = "Stuff is Awesome";
		
		String stuff =JOptionPane.showInputDialog(" please give me a message");

		String guess =JOptionPane.showInputDialog( "  Other person, if you can guess the passcode, you can figure out the secret message. please enter the passcode. ");
	
		if(guess.equals(p)) {
			 JOptionPane.showMessageDialog(null, "Here is the message: " + stuff);
		}
		else
		
		{
			JOptionPane.showMessageDialog(null, "  INTRUDER!!!!!!!!");

		}
	}

}
