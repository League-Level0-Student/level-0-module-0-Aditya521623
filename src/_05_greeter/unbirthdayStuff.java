package _05_greeter;

import javax.swing.JOptionPane;

public class unbirthdayStuff {

	public static void main(String[] args) {
		
		
		String answer = JOptionPane.showInputDialog("when is your birthday?");
		
		if( answer.equals("9/23/19")) {
			
			
			JOptionPane.showMessageDialog(null, " Happy birthday");
			

		}
		else
		{
			JOptionPane.showMessageDialog(null, "Happy un-birthday. ");

		}
	}

}
