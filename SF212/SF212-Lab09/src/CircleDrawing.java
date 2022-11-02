/** 6410742040 chidsanuphong pengchai
 * File: CircleDrawing.java
 * ------------------------
 * This program allows users to create circles on the graphics
 * canvas by clicking and dragging with the mouse. The point of
 * the users first mouse-press sets the center of the circle,
 * and the radius of the circle is updated as the mouse is dragged
 * so that the mouse point always remains on the edge of the circle.
 */
import java.awt.event.*;
import acm.program.*;
import acm.graphics.*;

public class CircleDrawing extends GraphicsProgram {
    /*
     * Called when the mouse button is pressed down.
     * Creates a new circle on the screen.
     */
    public void mousePressed(MouseEvent e) {
    	cx = e.getX();
    	cy = e.getY();
		circle = new GOval(cx, cy, 0, 0);

    }

    /*
     * Called when mouse is pressed and moved.
     * Sets the new size for the circle.
     */
    public void mouseDragged(MouseEvent e) {
    	double r = Math.sqrt(Math.pow(cx-e.getX(), 2) + Math.pow(cy-e.getY(), 2));
    	circle.setSize(r*2, r*2);
    	circle.setCenterLocation(cx,cy);
    	add(circle);
    }

    // field representing the current line in progress
    private GOval circle;
    private double cx;
    private double cy;
	
}