/* 6410742040 ªÔÉ³Ø¾§Èì à¾ç§ªÑÂ
 * File: BanishWinter.java
 * -----------------------
 * The BanishWinter subclass gets Karel adorn a series
 * of trees with a cluster of beeper leaves.
 */

import stanford.karel.*;

public class BanishWinter extends SuperKarel {

	// You fill in this part
	public void run() {
		for(int i=0;i<4;i++){
			nextTree();	
			if(frontIsBlocked()) {
				goUp();
				drawLeavs();
				goDown();
			}
				//break;
		}
	}
	
	private void nextTree() {
		while(frontIsClear()) {
			move();
		}
	}
	
	private void drawLeavs() {
		turnRight();
		drawLeaf();
		move();
	}
	
	private void drawLeaf() {
		for(int i=0;i<4;i++) {
			putBeeper();
			move();
			turnLeft();
		}
	}
	
	private void goUp() {
		turnLeft();
		while(rightIsBlocked()) {
			move();
		}
	}
	
	private void goDown() {
		turnRight();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}

}
