package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r2d2 = new Robot();
	public void run() {
		
		r2d2.setPenWidth(40);
		r2d2.setX(30);
		r2d2.setY(550);
		r2d2.setSpeed(20);
		r2d2.setPenColor(Color.MAGENTA);
		r2d2.penDown();
		
}	
	
		public static void drawHouse() {
		r2d2.move(100);
		r2d2.turn(90);
		r2d2.move(60);
		r2d2.turn(90);
		r2d2.move(100);
		r2d2.turn(270);
		r2d2.setPenColor(Color.GREEN);
		r2d2.move(50);
		}
		
		public static void drawHouse2() {
			String input = JOptionPane.showInputDialog("Enter a height.");
			int height = Integer.parseInt(input);
			for(int x = 0;x <= 10; x++) {
				if(x < 10) {
					r2d2.setPenWidth(40);
					r2d2.setSpeed(20);
					r2d2.setPenColor(Color.BLUE);
					r2d2.penDown();
					r2d2.move(height);
					r2d2.turn(90);
					r2d2.move(60);
					r2d2.turn(90);
					r2d2.move(height);
					r2d2.turn(270);
					r2d2.setPenColor(Color.GREEN);
					r2d2.move(50);
					r2d2.turn(270);
				}
			}
		}
		public static void drawHouse3() {
			String input = JOptionPane.showInputDialog("Enter small, medium, or large.");
			int small = 60;
			int medium = 120;
			int large = 150;
			if(input.equalsIgnoreCase("small")){
				for(int x = 0; x < 10;x++){
					r2d2.setPenWidth(40);
					r2d2.setSpeed(20);
					r2d2.setPenColor(Color.BLUE);
					r2d2.penDown();
					r2d2.move(small);
					r2d2.turn(90);
					r2d2.move(60);
					r2d2.turn(90);
					r2d2.move(small);
					r2d2.turn(270);
					r2d2.setPenColor(Color.GREEN);
					r2d2.move(50);
					r2d2.turn(270);
				}
			}
			if(input.equalsIgnoreCase("medium")){
				for(int x = 0; x < 10;x++){
					r2d2.setPenWidth(40);
					r2d2.setSpeed(20);
					r2d2.setPenColor(Color.BLUE);
					r2d2.penDown();
					r2d2.move(medium);
					r2d2.turn(90);
					r2d2.move(60);
					r2d2.turn(90);
					r2d2.move(medium);
					r2d2.turn(270);
					r2d2.setPenColor(Color.GREEN);
					r2d2.move(50);
					r2d2.turn(270);
				}
		}
			else{
				if(input.equalsIgnoreCase("large")){
					for(int x = 0; x < 10;x++){
						r2d2.setPenWidth(40);
						r2d2.setSpeed(20);
						r2d2.setPenColor(Color.BLUE);
						r2d2.penDown();
						r2d2.move(large);
						r2d2.turn(90);
						r2d2.move(60);
						r2d2.turn(90);
						r2d2.move(large);
						r2d2.turn(270);
						r2d2.setPenColor(Color.GREEN);
						r2d2.move(50);
						r2d2.turn(270);
					}
			}
			}
		
		}
}
