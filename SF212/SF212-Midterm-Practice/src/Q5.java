import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Q5 extends GraphicsProgram {

	/* Constants for the drawing */
	private static final int HOUSE_WIDTH = 150;
	private static final int HOUSE_HEIGHT = 200;
	private static final int WINDOW_WIDTH = 30;
	private static final int WINDOW_HEIGHT = 30;
	private static final int DOOR_WIDTH = 40;
	private static final int DOOR_HEIGHT = 80;
	private static final int DOOR_RADIUS = 5;

	
	public void run() {
		GLine line1 = new GLine(getWidth()/2, 0, getWidth()/2, getHeight());
		GLine line2 = new GLine(0, getHeight()/2, getWidth(), getHeight()/2);
		add(line1);
		add(line2);
		double xHome = (getWidth()-HOUSE_WIDTH)/2.0;
		double yHome = (getHeight()-HOUSE_HEIGHT)/2.0;
		double xDoor = xHome+HOUSE_WIDTH/2-DOOR_WIDTH/2;
		double yDoor = yHome+HOUSE_HEIGHT-DOOR_HEIGHT;
		addHome(xHome, yHome);
		addWindow(xHome+HOUSE_WIDTH/4-WINDOW_WIDTH/2, yHome+0.20*HOUSE_HEIGHT);
		addWindow(xHome+2*HOUSE_WIDTH/4+WINDOW_WIDTH/2, yHome+0.20*HOUSE_HEIGHT);
		addDoor(xDoor, yDoor);
		addKnob(xDoor+0.75*DOOR_WIDTH, yDoor+0.5*DOOR_HEIGHT);
		
	}
	
	private void addHome(double x, double y) {
		drawRectangle(x, y , HOUSE_WIDTH, HOUSE_HEIGHT, Color.GREEN);
	}
	
	private void  addWindow(double x, double y) {
		drawRectangle(x, y , WINDOW_WIDTH, WINDOW_HEIGHT, Color.YELLOW);
	}
	
	private void addDoor(double x, double y) {
		drawRectangle(x, y , DOOR_WIDTH, DOOR_HEIGHT, Color.RED);
	}
	
	private void addKnob(double x, double y) {
		drawCircle(x, y, DOOR_RADIUS, Color.black);
	}
	
	
	private void drawRectangle(double x, double y, double width, 
            double height, Color c) {
			GRect rect = new GRect(x,y, width, height);
			rect.setColor(c);
			rect.setFilled(true);
			add(rect);
	}
	
	private void drawCircle(double cx, double cy, double r, Color c) {
		GOval circle = new GOval(cx-r, cy-r, r*2, r*2);
		circle.setColor(c);
		circle.setFilled(true);
		add(circle);
	}

}
