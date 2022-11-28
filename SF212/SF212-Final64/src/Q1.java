/* Q1
 * Name: Benjamaporn Tunsuwat
 * ID: 6310742751
 */

import java.awt.Color;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q1 extends GraphicsProgram {
	private RandomGenerator rand = RandomGenerator.getInstance();
	
	/* CONSTANTS */
	private static final int MIN_NUM_BLOCKS = 20; // minimum number of blocks
	private static final int MAX_NUM_BLOCKS = 100; // maximum number of blocks
	
	private static final int MIN_SIZE = 20; // minimum block size
	private static final int MAX_SIZE = 50; // maximum block size
	
	private static double MIN_RADIUS; // minimum bomb radius
	private static double MAX_RADIUS; // maximum bomb radius
	
	private static GOval circle;
	private static GRect square;

	
	public void createCircle() {
		MIN_RADIUS = getWidth() / 10;
		MAX_RADIUS = MIN_RADIUS * 2;
		rand = RandomGenerator.getInstance();    	
    	double r = rand.nextDouble(MIN_RADIUS, MAX_RADIUS);
    	double posX = rand.nextDouble(-r,getWidth()-r);
    	double posY = rand.nextDouble(-r,getHeight()-r);
    	
    	circle = new GOval(r*2, r*2);
    	GRect test = new GRect(r*2,r*2);
    	circle.setFilled(false);
    	circle.setColor(Color.red);
    	//add(test,posX,posY);
    	add(circle,posX,posY);
	}
	
	public void createSquare() {

		rand = RandomGenerator.getInstance();    
		
		int num_blocks = rand.nextInt(MIN_NUM_BLOCKS, MAX_NUM_BLOCKS);
		
		int size = rand.nextInt(MIN_SIZE,MAX_SIZE);
		int posX;
		int posY;
		for(int i=0;i<num_blocks;i++) {
			square = new GRect(size, size);
			posX = rand.nextInt(0,getWidth()-size);
			posY = rand.nextInt(0,getHeight()-size);
			add(square,posX,posY);
			inside();
			//paintSquare();
			
		}
		
	

	}
	
	public void inside() {
		if(circle.contains(square.getX(), square.getY())) {
			square.setFilled(false);
		}
		else if(circle.contains(square.getX()+square.getWidth(), square.getY())) {
			square.setFilled(false);

		}
		else if(circle.contains(square.getX()+square.getWidth(), square.getY()+square.getWidth())) {
			square.setFilled(false);

		}
		else if(circle.contains(square.getX(), square.getY()+square.getWidth())) {
			square.setFilled(false);

		}
		else {
			square.setFilled(true);
			square.setColor(rand.nextColor());

		}
	}
	
//	private GObject getCollidingObject() {
//		if (getElementAt(square.getX(),square.getY()) == circle)
//			return getElementAt(square.getX(),square.getY());
//		else if(getElementAt(square.getX()+square.getWidth(),square.getY()) == circle)
//			return getElementAt(square.getX()+square.getWidth(),square.getY());
//		else if (getElementAt(square.getX()+square.getWidth(),square.getY()+square.getWidth()) == circle)
//			return getElementAt(square.getX()+square.getWidth(),square.getY()+square.getWidth());
//		else if (getElementAt(square.getX(),square.getY()+square.getWidth())==circle)
//			return getElementAt(square.getX(),square.getY()+square.getWidth());
//		else 
//			return null;
//	}
//	
//	public void paintSquare() {
//		
//		GObject unknown = getCollidingObject();
//		
//		if(unknown==null) {
//			square.setFilled(true);
//			square.setFillColor(rand.nextColor());
//		}
		
		
//		if(circle.intersects(square)) {
//			square.setFilled(false);
//		}
//		else {
//			square.setFilled(true);
//			square.setColor(rand.nextColor());
//		}
//		
//	}
	
	// You fill in this part
	public void run() {
		
		createCircle();
		createSquare();
	}
	
}