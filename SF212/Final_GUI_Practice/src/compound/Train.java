package compound;

import acm.program.*;
import java.awt.*;
import acm.graphics.*;

public class Train extends GraphicsProgram {
	protected static final double CAR_WIDTH = 150;
	protected static final double CAR_HEIGHT = 80;
	protected static final double CAR_BASELINE = 30;
	protected static final double CONNECTOR = 6;
	protected static final double WHEEL_RADIUS = 10;
	protected static final double WHEEL_INSET = 16;

	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;

	private final int WINDOW_WIDTH = 800;
	private final int WINDOW_HEIGHT = 400;
	
	private double posX1, posX2, posX3;
	
	private GRect train1, train2, train3;

	public void init() {
		/* the width and height will be randomly set */
		setWidth(WINDOW_WIDTH);
		setHeight(WINDOW_HEIGHT);
	}

	public void run() {

		drawTrain();
		drawWheel();

	}
	
	
	
	public void drawTrain() {
		train1 = new GRect(CAR_WIDTH, CAR_HEIGHT);
		train2 = new GRect(CAR_WIDTH, CAR_HEIGHT);
		train3 = new GRect(CAR_WIDTH, CAR_HEIGHT);
		
		posX1 =getWidth()/4-CAR_WIDTH/2;
		posX2 =2*getWidth()/4-CAR_WIDTH/2;
		posX3 =3*getWidth()/4-CAR_WIDTH/2; 
		add(train1,posX1, getHeight()-CAR_BASELINE-CAR_HEIGHT);
		add(train2,posX2, getHeight()-CAR_BASELINE-CAR_HEIGHT);
		add(train3,posX3, getHeight()-CAR_BASELINE-CAR_HEIGHT);
	}
	
	public void drawWheel() {
		GOval wheel1 = new GOval(WHEEL_RADIUS*2,WHEEL_RADIUS*2);
		GOval wheel2 = new GOval(WHEEL_RADIUS*2,WHEEL_RADIUS*2);
		add(wheel1, train1.getX()+train1.getX()/4, train1.getY()+CAR_HEIGHT);
	}

}
