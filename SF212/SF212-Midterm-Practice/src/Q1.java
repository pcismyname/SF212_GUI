/* 
 * Q1
 * 
 * Name:
 * 
 * Student ID:
 * 
 */

import stanford.karel.*;

public class Q1 extends SuperKarel {
	
	// You fill in this part
	
	public void pickAndDrop() {
		while(beepersPresent()) {
			pickBeeper();
			if(noBeepersPresent()) {
				putBeeper();
				break;
			}
			turnLeft();
			goUp();
			putBeeper();
			turnAround();
			goDown();
		}
	}
	
	public void goUp() {
		while(beepersPresent()) {
			move();
		}
	}
	
	public void goDown() {
		while(frontIsClear()) {
		move();
		}
		turnLeft();
	}
	
	
	public void run() {
		pickAndDrop();
		while(frontIsClear()) {
			move();
			pickAndDrop();
		}
	}
	
}
