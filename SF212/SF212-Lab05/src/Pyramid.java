/* 6410742040 Chidsanuphong Pengchai
 * File: Pyramid.java
 * Name: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	//private static final int BRICK_WIDTH = 30;
	private static final int BRICK_WIDTH = 10;

	/** Height of each brick in pixels */
	//private static final int BRICK_HEIGHT = 12;
	private static final int BRICK_HEIGHT = 10;

	/** Number of bricks in the base of the pyramid */
	//private static final int BRICKS_IN_BASE = 14;
	private static final int BRICKS_IN_BASE = 10;
	
	public void run() {
	  /* You fill this in. */
		
		for(int i=1;i<=BRICKS_IN_BASE;i++) {
			for(int j=1;j<= BRICKS_IN_BASE - i+1; j++) {
				double x = getWidth()/2.0 - BRICKS_IN_BASE/2.0*BRICK_WIDTH + j*BRICK_WIDTH + i*(BRICK_WIDTH/2.0);
				double y = getHeight() - BRICK_HEIGHT*i;
				GRect  block = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				block.setFilled((i + j) % 2 != 0);
				block.setColor(new Color(255-(i*j*25)%255,255-((i+1)*(i+1)*20)%255,255-(j*j*20)%255));
				//block.setColor(new Color((1*i*20)%255,(1*i*j*10)%255,(1*j*20)%255));

				
				add(block);
			}
		}
		
		/*for(int i=1;i<=BRICKS_IN_BASE;i++) {
			for(int j=1;j<=BRICKS_IN_BASE - i+1; j++) {
				double x = getWidth()/2 - BRICKS_IN_BASE/2*BRICK_WIDTH + j*BRICK_WIDTH + i*(BRICK_WIDTH/2);
				double y = getHeight()-BRICK_HEIGHT*BRICKS_IN_BASE - BRICK_HEIGHT*i;
				GRect  block = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(block);
			}
		}*/
		
		
  }
}

