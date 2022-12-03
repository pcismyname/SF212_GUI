// Chidsanuphong Pengchai:
// ID 6410742040: 

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Q3 extends GraphicsProgram {
	/* pause duration */
	private static final double DURATION = 5;

	/* ball size */
	private static final double BALL_RADIUS = 20;

	/* moving ball */
	private GOval redBall, blueBall;

	/* ball speed */
	private double vx = 1;

	/* WRITE YOUR CODE BELOW */
	public void run() {
		createRedBall();
		createBlueBall();

		while (true) {
			moveBalls();
			checkBound();
			pause(DURATION);
			

		}

	}

	public void createRedBall() {
		redBall = new GOval(BALL_RADIUS * 2, BALL_RADIUS * 2);
		add(redBall, 0, getHeight() / 2 - BALL_RADIUS);
		redBall.setFilled(true);
		redBall.setColor(Color.red);
	}

	public void createBlueBall() {
		blueBall = new GOval(BALL_RADIUS * 2, BALL_RADIUS * 2);
		add(blueBall, getWidth() - BALL_RADIUS * 2, getHeight() / 2 - BALL_RADIUS);
		blueBall.setFilled(true);
		blueBall.setColor(Color.blue);
	}

	public void moveBalls() {
		redBall.move(vx, 0);
		blueBall.move(-vx, 0);
	}

	public void checkBound(){
		if(redBall.getX()<0 || redBall.getX()+BALL_RADIUS*2 > getWidth()) vx = -vx;
	}

}
