/* 
 * Q3
 * 
 * Name:
 * 
 * Student ID:
 * 
 */

import java.awt.Color;

import acm.graphics.G3DRect;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q3 extends GraphicsProgram {

	/** Height of wall in term of number of bricks layer */
	private static final Color ODD_COLOR = Color.RED;

	/** Number of bricks in the base of fence */
	private static final Color EVEN_COLOR = Color.GREEN;

	/** Window Width **/
	private static final int WINDOW_WIDTH = RandomGenerator.getInstance().nextInt(100, 300);

	/** Window Height **/
	private static final int WINDOW_HEIGHT = RandomGenerator.getInstance().nextInt(100, 300);

	/** Number of Rows */
	private static final int NUM_ROWS = RandomGenerator.getInstance().nextInt(2, 8)*2+1;

	public void init() {
		/* the width and height will be randomly set */
		setWidth(WINDOW_WIDTH);
		setHeight(WINDOW_HEIGHT);
	}
	
	public void run() {
		/* You fill this in */
		double height = (double)getHeight() / NUM_ROWS;
		double width = (double)getWidth() / NUM_ROWS;
		
		for(int i=0;i<NUM_ROWS;i++) {
			for(int j=0;j<NUM_ROWS;j++) {
				if(i==NUM_ROWS/2 || j==NUM_ROWS/2) {
					double posX = 0;
					double posY = 0;
					GRect rect = new GRect(posX+width*i,posY+height*j,width, height);
					add(rect);
					rect.setFilled(true);
					if((i+j)%2==0)rect.setColor(EVEN_COLOR);
					else rect.setFillColor(ODD_COLOR);

				}
			}
		}
		
		
		
		
	}
}

