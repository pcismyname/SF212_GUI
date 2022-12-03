// Chidsanuphong Pengchai:
// ID 6410742040: 

import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

public class Q2 extends GraphicsProgram {
  /* pause duration */
  private static final double DURATION = 5;

  /* ball size */
  private static final double BALL_RADIUS = 10;

  /* ball */
  private GBall ball;

  /* ball speed */
  private double vx = 0;
  private double vy = 0;
  
  /* WRITE YOUR CODE BELOW */
  
  public void run() {
	  
	  createBall();
	  
	  while(true) {
		  pause(DURATION);
		  moveBall(vx, vy);
		  
	  }
  }
  
  public void createBall() {
	  ball = new GBall(BALL_RADIUS);
	  add(ball,getWidth()/2,getHeight()/2);
  }
  
  public void moveBall(double vx1,double vy1) {	  
	  ball.move(vx1, vy1);
  }
  
  @Override
  public void mouseMoved(MouseEvent e) {
	  double dx = e.getX() - ball.getX();
	  double dy = e.getY() - ball.getY(); 
	  vx = dx/(Math.sqrt(dx*dx+dy*dy));
	  vy = dy/(Math.sqrt(dx*dx+dy*dy));
	  moveBall(vx, vy);
  }
  
}
