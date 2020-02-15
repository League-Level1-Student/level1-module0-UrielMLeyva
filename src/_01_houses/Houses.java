package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		
		Robot r2d2 = new Robot();
		r2d2.setPenWidth(40);
		r2d2.penDown();
		r2d2.setPenColor(255,0,0);
		r2d2.move(100);
	}
}
