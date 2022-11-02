/* 
 * Q1
 * 
 * Name: ªÔÉ³Ø¾§Èì à¾ç§ªÑÂ Chidsanuphong Pengchai 
 * 
 * Student ID: 6410742040
 * 
 */

import stanford.karel.*;

public class Q1 extends SuperKarel {
	
	// You fill in this part
	public void run() {
		
		while(frontIsClear()) {
			pickAll();
			goUp();
			dropAll();
			goDown();
			move();
		}
		pickAll();
		goUp();
		dropAll();
		goDown();
	}
	
	public void pickAll() {
		while(beepersPresent()){
			pickBeeper();
		}
	}
	
	public void goUp() {
		turnLeft();
		while(frontIsClear()) {
			move();
		}
	}
	
	public void dropAll() {
		turnAround();
		while(beepersInBag()) {
			putBeeper();
			move();
		}
	}
	
	public void goDown() {
		
		while(frontIsClear()) move();
		turnLeft();
	}
	
}
