package checkpoint;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("What's your favorite color?");
		
		JOptionPane.showMessageDialog( null, " My favorite color is " + answer + " to!" );
		
		Robot rob = new Robot();
		
		rob.penDown();
		
		rob.setSpeed(100);
		
		
		for(int i = 0; i<3; i++) {
			
			
			rob.move(200);
			
			rob.turn(120);

		}
		
		rob.hide();
		
		
	}

}
