package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		
	
	Robot timmy = new Robot(100, 700);
	Robot tammy = new Robot(200, 700);
	Robot sammy = new Robot(300, 700);
	Robot sammi = new Robot(400, 700);
	Robot bammi = new Robot(500, 700);
	
	timmy.setSpeed(1);
	tammy.setSpeed(1);
	sammy.setSpeed(1);
	sammi.setSpeed(1);
	bammi.setSpeed(1);

	
	
	Thread r1 = new Thread(()->race(timmy));
	Thread r2 = new Thread(()->race(tammy));
	Thread r3 = new Thread(()->race(sammy));
	Thread r4 = new Thread(()->race(sammi));
	Thread r5 = new Thread(()->race(bammi));
	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
	}
	
	public static void race(Robot r) {
		Random s=new Random();
		while(r.getY()>0){
			int n=s.nextInt(500);
			r.move(n);
		}
		System.out.println("Robot "+(r.getX()/100)+" is the winner");
	}



}
