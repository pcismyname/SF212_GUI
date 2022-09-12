/*
 * File: RhoombaKarel.java
 * ------------------------
 * Karel sweeps the entire world of all beepers.
 */

import stanford.karel.SuperKarel;

public class RhoombaKarel extends SuperKarel {
	
	
	public void sweepBeeper() {
		while(frontIsClear()) {
			if(beepersPresent())pickBeeper();
			move();
		}
	}
	
	public void rightSide() {
		turnLeft();
		move();
		turnLeft();
	}
	
	public void leftSide() {

		turnRight();
		move();
		turnRight();
	}
	
	public void run() {
		while(true) {
			sweepBeeper();
			if(beepersPresent())pickBeeper();
			if(leftIsClear()) rightSide();
			else break;
			sweepBeeper();
			if(beepersPresent())pickBeeper();
			if(rightIsClear()) leftSide();
			else break;
		}
	}
	
}
