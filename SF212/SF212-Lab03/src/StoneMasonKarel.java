/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		while(frontIsClear()) {
			goUp();
			fix();
			goDown();
			nextAvenue();
		}
		goUp();
		fix();
		goDown();
	}
	
	private void goUp() {
		turnLeft();
		fix();
		while(frontIsClear()) {
			move();
			fix();
		}
		turnAround();
	}
	
	private void fix() {
		if(noBeepersPresent()) putBeeper();
	}
	
	private void goDown() {
		while(frontIsClear())move();
		turnLeft();
	}
	
	private void nextAvenue() {
		for(int i=0;i<4;i++)move();
	}

}