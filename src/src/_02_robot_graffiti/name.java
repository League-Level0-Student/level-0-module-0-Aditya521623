package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class name {

	public static void main(String[] args) {


		Robot robo = new Robot("mini");
		
		robo.penDown();
		
		robo.setSpeed(100);

		robo.turn(15);
		
		robo.move(100);
		
		robo.turn(150);
		
		robo.move(100);
	}

}
