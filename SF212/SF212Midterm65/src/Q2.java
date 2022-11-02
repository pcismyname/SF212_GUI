/* 
 * Q2
 * 
 * Name: ªÔÉ³Ø¾§Èì à¾ç§ªÑÂ Chidsanuphong Pengchai
 * 
 * Student ID: 6410742040
 * 
 */

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q2 extends GraphicsProgram {

  /** Number of Rings */
  private static final int NUM_RINGS = RandomGenerator.getInstance().nextInt(1, 10);

  /** Height of wall in term of number of bricks layer */
  private static final Color ODD_COLOR = Color.RED;

  /** Number of bricks in the base of fence */
  private static final Color EVEN_COLOR = Color.GREEN;

  /** Window SIZE **/
  private static final int WINDOW_SIZE = RandomGenerator.getInstance().nextInt(100, 300);

  public void init() {
    /* the width and height will be randomly set */
    setWidth(WINDOW_SIZE);
    setHeight(WINDOW_SIZE);
  }
	
	public void run() {
		/* You fill this in */
			GOval circle = new GOval(0, 0, getWidth(), getWidth());
			add(circle);
		
	}
}

