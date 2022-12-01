/* Q1
 * Name: Phattrada Mikota
 * ID: 6410742099
 */

import java.awt.Color;
import java.util.Random;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q1 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* CONSTANTS */
	private static final int MIN_NUM_BLOCKS = 20; // minimum number of blocks
	private static final int MAX_NUM_BLOCKS = 100; // maximum number of blocks
	
	private static final int MIN_SIZE = 20; // minimum block size
	private static final int MAX_SIZE = 50; // maximum block size
	
	private static double MIN_RADIUS; // minimum bomb radius
	private static double MAX_RADIUS; // maximum bomb radius
	
	private GOval cir;
	public void init() {
		MIN_RADIUS = getWidth() / 10;
		MAX_RADIUS = MIN_RADIUS * 2;
	}
	
	// You fill in this part
	public void run() {
		makeCircle();
		makeAllSquares();
	}
	
	public void makeCircle() {
		double r = rgen.nextDouble(MIN_RADIUS,MAX_RADIUS);
		cir = new GOval(2*r,2*r);
		cir.setFilled(false);
		cir.setColor(Color.red);
		add(cir,rgen.nextInt(getWidth())-r, rgen.nextInt(getHeight())-r);
	}
	public void makeASquare() { 
		double s = rgen.nextDouble(MIN_SIZE,MAX_SIZE);
		GRect sq = new GRect(s,s);
		add(sq,rgen.nextDouble(0,getWidth() - s),rgen.nextDouble(0,getHeight()-s));
		if (!(checkRedCircle(sq))) {
			sq.setFilled(true);
			sq.setFillColor(rgen.nextColor());
			sq.setColor(Color.black);
		} 
	}
	public void makeAllSquares() {
		int numSquare = rgen.nextInt(MIN_NUM_BLOCKS,MAX_NUM_BLOCKS);
		for (int i=0;i<numSquare;i++) {
			makeASquare();
		}
	}
	public boolean checkRedCircle(GRect square) {
		for (double i=0;i<=square.getWidth();i+=0.1) {
			if (cir.contains(square.getX()+i,square.getY())) {
				return true;
			} 
			if (cir.contains(square.getX(),square.getY()+i)) {
				return true;
			} 
			if (cir.contains(square.getX()+square.getWidth(),square.getY()+i)) {
				return true;
			} 
			if (cir.contains(square.getX()+i,square.getY()+square.getHeight())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}