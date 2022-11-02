/* 6410742040 chidsanuphong pengchai
 * This program draws a set of 10 circles with different sizes, positions, and
 * colors.  Each circle has a randomly chosen  color, a randomly chosen radius
 * between 5 and 50 pixels, and a randomly chosen position on the canvas,
 * subject to the condition that the entire circle must fit inside the canvas
 * without extending past the edge.
 */
import acm.program.*;

import java.awt.Color;

import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
    private static final int N_CIRCLES = 10;   // Number of circles
    private static final double MIN_RADIUS = 5;    // Minimum radius
    private static final double MAX_RADIUS = 50;   // Maximum radius

    public void run() {
    	
    	RandomGenerator rand = RandomGenerator.getInstance();
    	
    	for(int i=0;i<N_CIRCLES;i++) {
    		double r = rand.nextDouble(MIN_RADIUS, MAX_RADIUS);
    		double posX = rand.nextDouble(0,getWidth() - r*2);
    		double posY = rand.nextDouble(0,getHeight() - r*2);
    		
    		GOval circle = new GOval(r*2, r*2);
    		circle.setFilled(true);
    		circle.setColor(rand.nextColor());
    		add(circle, posX, posY);
    		

    	}
    }
    
}
