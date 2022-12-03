package game;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Pong extends GraphicsProgram {

	private static final int PADDLE_WIDTH = 80;
	private static final int PADDLE_HEIGHT = 10;
	private static final int PADDLE_Y_OFFSET = 30;
	private static final int BALL_RADIUS = 10;

	private double vx1, vy1, vx_bot;
	RandomGenerator rand = new RandomGenerator();

	private GOval ball;
	private GRect paddle_player;
	private GRect paddle_bot;
	private boolean out;

	public void run() {
		drawPaddle();
		drawBall();

		vx1 = 4;
		vy1 = 3;
		vx_bot = 4;
		if (rand.nextBoolean(0.5))
			vx1 = -vx1;

		while (true) {
			if(out) {
				remove(ball);
				remove(paddle_bot);
				remove(paddle_player);
				drawPaddle();
				drawBall();
				if (rand.nextBoolean(0.5))
					vx1 = -vx1;
				out = false;
				
			}
			pause(20);
			moveBall();
			moveBot();
			checkCollision();
		}
	}

	public void drawPaddle() {
		paddle_player = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle_player.setFilled(true);
		paddle_player.setFillColor(Color.red);
		add(paddle_player, getWidth() / 2 - PADDLE_WIDTH / 2, getHeight() - PADDLE_Y_OFFSET * 2);

		paddle_bot = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle_bot.setFilled(true);
		paddle_bot.setFillColor(Color.blue);
		add(paddle_bot, getWidth() / 2 - PADDLE_WIDTH / 2, PADDLE_Y_OFFSET * 2);
	}

	public void drawBall() {
		ball = new GOval(BALL_RADIUS * 2, BALL_RADIUS * 2);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
	}

	public void mouseMoved(MouseEvent e) {
		double x = e.getX();
		if (x - PADDLE_WIDTH / 2 < 0) {
			x = PADDLE_WIDTH / 2;
		}
		if (x + PADDLE_WIDTH / 2 > getWidth()) {
			x = getWidth() - PADDLE_WIDTH / 2;
		}
		paddle_player.setCenterX(x);
	}

	public void moveBall() {
		
		if (ball.getX() < 0 || ball.getX() + BALL_RADIUS * 2 > getWidth())
			vx1 = -vx1;
		if (ball.getY() < 0 || ball.getY() + BALL_RADIUS > getHeight())
			out = true;
		ball.move(vx1, vy1);
	}

	public void moveBot() {
		
		
		if(paddle_bot.getX()<0) paddle_bot.setLocation(0, paddle_bot.getY());
		if(paddle_bot.getX()+PADDLE_WIDTH > getWidth()) paddle_bot.setLocation(getWidth()-PADDLE_WIDTH, paddle_bot.getY());
		
		paddle_bot.move(vx1, 0);
	}
	
	public void checkCollision() {
		if(getCollidingObject() != null) {
			vy1 = -vy1;
			
		}
	}
	
	public Object getCollidingObject() {
		
		System.out.println();
		
		if(getElementAt(ball.getX()+BALL_RADIUS, ball.getY()) != null)
			return getElementAt(ball.getX()+BALL_RADIUS, ball.getY());
		else if(getElementAt(ball.getX()+BALL_RADIUS, ball.getY()+BALL_RADIUS*2) != null)
			return getElementAt(ball.getX()+BALL_RADIUS, ball.getY()+BALL_RADIUS*2);
		return null;
	}
	


}
