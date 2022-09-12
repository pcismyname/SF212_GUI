/*
 * File: DoubleBeepers.java
 * ------------------------
 * Karel doubles the number of beepers on the corner directly
 * in front of him in the world.  He then returns to his
 * original position/orientation.
 */

import stanford.karel.SuperKarel;

public class DoubleBeepers extends SuperKarel {

	
	public void doubleBeeper() {
		putBeeper();
		putBeeper();
		move();
	}
	
	public void putBack() {
		pickBeeper();
		turnAround();
		move();
		putBeeper();
		turnAround();
		move();
	}
	
	public void run() {
		// your code here
		move();
		while(beepersPresent()) {
			pickBeeper();
			move();
			turnAround();
			doubleBeeper();
			turnAround();
		}
		move();
		while(beepersPresent()) {
			putBack();
		}
	}

}
