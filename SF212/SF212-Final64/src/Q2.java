/* Q2
 * Name: Lalita Sornsakrin
 * ID: 6310742389
 */

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q2 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* CONSTANTS */
	private static final int RADIUS = 20; // BALL RADIUS
	private static final int SPEED = 2; // BALL SPEED
	private static final int DURATION = 3; // PAUSE_DURATION
	private static final int PADDLE_WIDTH = RADIUS * 5; // PADDLE WIDTH
	private static final int PADDLE_HEIGHT = 10; // PADDLE HEIGHT
	private static final int PADDLE_OFFSET = 50; // PADDLE OFFSET FROM BOTTOM EDGE
	private static final String SCOREBOARD_FONT = "BOLD-20"; // TEXT FONT
	private static final int SCOREBOARD_OFFSET = 5; // SCOREBOARD OFFSET FROM LEFT AND BOTTOM EDGE
	
	/* Object references */
	private GOval ball; // ball reference
	private GRect paddle; // paddle reference
	private GLabel scoreboard; // scoreboard reference
	private GRect paddle_auto;
	
	private int scores = 0; // game scores
	
	private RandomGenerator rg = RandomGenerator.getInstance();
	
	private void createBall() {
		ball = new GOval(2 *RADIUS, 2*RADIUS);
		ball.setFilled(true);
		ball.setColor(Color.blue);
		placeBallAtTop();
	}
	
	private void placeBallAtTop(){
		int x = rg.nextInt(0, getWidth() - 2 * RADIUS);
		int y = -2 * RADIUS;
		add(ball, x, y);
	}
	
	public void createPaddle() {
		paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		int x = getWidth() /2;
		int y = getHeight() - PADDLE_OFFSET-PADDLE_HEIGHT;
		add(paddle,x,y);
		
		paddle_auto = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle_auto.setFilled(true);
		int x2 = getWidth() /2;
		int y2 = 1+PADDLE_OFFSET-PADDLE_HEIGHT;
		add(paddle_auto,x,y);
	}
	
	public void mouseMoved(MouseEvent e) {
		int x = e.getX() - PADDLE_WIDTH/2;
		if(x < 0) x =0;
		if( x+ PADDLE_WIDTH > getWidth()) 
			x = getWidth() - PADDLE_WIDTH;
		
		paddle.setX(x);
	}
	
	public void createScoreboard() {
		scoreboard = new GLabel("Scores: 0");
		int x = 0;
		int y = getHeight() - SCOREBOARD_OFFSET;
		scoreboard.setFont(SCOREBOARD_FONT);
		add(scoreboard,x,y);
	}
	
	public void moveBall() {
		ball.move(0, SPEED);
		if(hitPaddle()) {
			scores++;
			scoreboard.setText("Scores: " + scores);
			placeBallAtTop();
		}
		if(hitBottom()) placeBallAtTop(); 
	}
	
	public boolean hitPaddle() {
		double x = ball.getX() -RADIUS;
		double y = ball.getY() + 2*RADIUS;
		return (getElementAt(x, y) == paddle);
	
	}
	
	
	
	public boolean hitBottom() {
		double y = ball.getY() + 2*RADIUS;
		return y > getHeight();
		
	}

	// You fill in this part
	public void run() {
		
		createBall();
		createPaddle();
		createScoreboard();
		while(true) {
			moveBall();
			pause(DURATION);
		}
	}
	
	
	
}
