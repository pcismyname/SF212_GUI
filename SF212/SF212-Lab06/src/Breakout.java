/* chidsanuphong pengchai 6410742040
 * File: Breakout.java
 * -------------------
 * Name:
 * This file will eventually implement the game of Breakout.
 */

import java.awt.Color;
import java.awt.Dimension;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Breakout extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;

	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;

	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;

	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final double BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1)
			* BRICK_SEP)
			/ NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** paddle */
	protected GRect paddle;

	/** ball */
	protected GOval ball;

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
	  setMaximumSize(new Dimension(APPLICATION_WIDTH, APPLICATION_WIDTH));
		drawBricks();
		drawPaddle();
		drawBall();
		//GLine line = new GLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
		//add(line);
	}

	/* You fill this in, along with any subsidiary methods */
	protected void drawBricks() {
		for(int i=0;i < NBRICK_ROWS;i++) {
			for(int j=0;j < NBRICKS_PER_ROW; j++) {
				double x = BRICK_WIDTH*j;
				double y = BRICK_HEIGHT*i;
				GRect  brick = new GRect(x + BRICK_SEP*j, y + BRICK_SEP*i + BRICK_Y_OFFSET, BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				if(i<2) brick.setColor(Color.red);
				else if(i<4) brick.setColor(Color.ORANGE);
				else if(i<6) brick.setColor(Color.YELLOW);
				else if(i<8) brick.setColor(Color.GREEN);
				else brick.setColor(Color.CYAN);
				add(brick);
			}
		
			
		}
	}

	protected void drawPaddle() {
		paddle = new GRect(WIDTH/2-PADDLE_WIDTH/2, HEIGHT - PADDLE_Y_OFFSET*2 ,PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle);
	}

	protected void drawBall() {
		ball = new GOval(WIDTH/2-BALL_RADIUS,HEIGHT/2-BALL_RADIUS,BALL_RADIUS*2, BALL_RADIUS*2);
		ball.setFilled(true);
		add(ball);
	}
}
