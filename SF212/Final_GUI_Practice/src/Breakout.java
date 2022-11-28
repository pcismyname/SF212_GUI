/* 6410742040 chidsanuphong pengchai
 * File: Breakout.java
 * -------------------
 * Name:
 * This file will eventually implement the game of Breakout.
 */

// import java.applet.*;
import java.awt.Dimension;
// import java.awt.event.*;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
// import acm.program.*;
import acm.util.RandomGenerator;

public class Breakout extends BreakoutLab6 {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;

	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;

	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** paddle */
	private GRect paddle;

	/** ball */
	private GBall ball;

	private double vx, vy;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final int PAUSE_TIME = 20;

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		addMouseListeners();
		setMaximumSize(new Dimension(WIDTH, HEIGHT));
		drawBricks();
		paddle = drawPaddle();
		ball = drawBall();
		vy = 3.0;
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5))
			vx = -vx;
		while (true) {
			pause(PAUSE_TIME);
			moveBall();
			checkCollision();
		}
	}

	/* move paddle x-centered aligned with mouse location */
	public void mouseMoved(MouseEvent e) {
		double x = e.getX();
		if(x-PADDLE_WIDTH/2<0) {
			x = PADDLE_WIDTH/2;
		}
		if(x+PADDLE_WIDTH/2>getWidth()) {
			x = getWidth()-PADDLE_WIDTH/2;
		}
		paddle.setCenterX(x);
	}
	

	/* move ball and bounce off when hit object or wall */
	private void moveBall() {
		double top_left_x = ball.getX() - BALL_RADIUS;
		double top_left_y = ball.getY() - BALL_RADIUS;
		double top_right_x = ball.getX() + BALL_RADIUS;
		double top_right_y = ball.getY() - BALL_RADIUS;
		double bottom_left_x = ball.getX() - BALL_RADIUS;
		double bottom_left_y = ball.getY() + BALL_RADIUS;
		double bottom_right_x = ball.getX() + BALL_RADIUS;
		double bottom_right_y = ball.getY() + BALL_RADIUS;
		

		
		if(bottom_left_x <0 || bottom_right_x > getWidth() || 
				top_left_x < 0 || top_right_x > getWidth()) { vx = -vx;}
		
		if(bottom_left_y > getHeight() || bottom_right_y > getHeight() ||
				top_left_y < 0 || top_right_y < 0) { vy = -vy;}
		ball.move(vx, vy);
		
	}

	/* get object colliding with ball if any */
	private GObject getCollidingObject() {
		
		double top_left_x = ball.getX() - BALL_RADIUS;
		double top_left_y = ball.getY() - BALL_RADIUS;
		double top_right_x = ball.getX() + BALL_RADIUS;
		double top_right_y = ball.getY() - BALL_RADIUS;
		double bottom_left_x = ball.getX() - BALL_RADIUS;
		double bottom_left_y = ball.getY() + BALL_RADIUS;
		double bottom_right_x = ball.getX() + BALL_RADIUS;
		double bottom_right_y = ball.getY() + BALL_RADIUS;
		
		
		if(getElementAt(top_left_x, top_left_y) != null ) {

			return getElementAt(top_left_x, top_left_y);
		}
		else if(getElementAt(bottom_left_x, bottom_left_y) != null) {

			return getElementAt(bottom_left_x, bottom_left_y);

		}
		else if(getElementAt(top_right_x, top_right_y) != null ) {

			return getElementAt(top_right_x, top_right_y);
		}
		else if(getElementAt(bottom_right_x, bottom_right_y) != null ) {

			return getElementAt(bottom_right_x, bottom_right_y);
		}
		return null;
		
	}

	/* check if ball collides with blick, then remove blick */
	private void checkCollision() {
		GObject undefinedObject = getCollidingObject();
		if(undefinedObject!=null && paddle != undefinedObject ) {
			vy = -vy;
			remove(undefinedObject);
		}
		else if(undefinedObject == paddle) {
			vy = -vy;
		}
	}
}
