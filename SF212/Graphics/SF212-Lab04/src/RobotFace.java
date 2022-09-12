/*
 * File: RobotFace.java
 * --------------------
 * This program draws a robot face using GRects and GOvals, centered
 * in the graphics window.  We make sure to define constants at the
 * top of our program instead of using magic numbers. We also write
 * the program in terms of reusable and general methods
 * drawRectangle and drawCircle.
 */

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {

	/* Constants for the drawing */
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 20;
	private static final int MOUTH_WIDTH = 100;
	private static final int MOUTH_HEIGHT = 30;

	public void run() {

	}

	/*
	 * Add a head with top left at position x,y. Adding a head consists 
     * of drawing a rectangle with the given width, height, and color.
	 */
	private void addHead(double x, double y) {

	}
	
	/*
	 * Add an eye centered at cx, cy. Adding an eye consists of drawing
     * a circle with the given radius and color.
	 */
	private void addEye(double cx, double cy) {

	}
	
	/*
	 * Add a mouth with top left at x,y. Adding a mouth consists of       
     * drawing a rectangle with given width, height and color.
	 */
	private void addMouth(double x, double y) {

	}

	/*
	 * This method draws a general rectangle with its top left 
     * at position x,y with a specified width, height and color.
	 */
	private void drawRectangle(double x, double y, double width, 
	                           double height, Color c) {

	}
	
	/*
	 * This method draws a general circle centered at (cx,cy), 
     * with a given radius r and a Color c.
	 */
	private void drawCircle(double cx, double cy, double r, Color c) {

	}
}