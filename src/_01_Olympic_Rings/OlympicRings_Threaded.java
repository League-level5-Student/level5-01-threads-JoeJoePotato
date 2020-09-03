package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		
	
	Robot timmy = new Robot(720, 400);
	Robot tammy = new Robot(800, 400);
	Robot sammy = new Robot(880, 400);
	Robot sammi = new Robot(760, 480);
	Robot bammi = new Robot(840, 480);
	
	timmy.setSpeed(10);
	tammy.setSpeed(10);
	sammy.setSpeed(10);
	sammi.setSpeed(10);
	bammi.setSpeed(10);
	
	
	timmy.penDown();
	tammy.penDown();
	sammy.penDown();
	sammi.penDown();
	bammi.penDown();
	
	
	Thread r1 = new Thread(()->drawcirc(timmy));
	Thread r2 = new Thread(()->drawcirc(tammy));
	Thread r3 = new Thread(()->drawcirc(sammy));
	Thread r4 = new Thread(()->drawcirc(sammi));
	Thread r5 = new Thread(()->drawcirc(bammi));
	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
	}
	
	public static void drawcirc(Robot r) {
		for (int i = 0; i < 360; i++) {
			r.hide();
			r.move(1);
			r.setAngle(i);
		}
	}
}

