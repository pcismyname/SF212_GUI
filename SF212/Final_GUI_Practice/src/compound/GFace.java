package compound;
import java.awt.Color;

import acm.graphics.*;

public class GFace  extends GCompound{
	
	private static final double EYE_WIDTH = 0.15;

	private static final double EYE_HEIGHT = 0.15;

	private static final double NOSE_WIDTH = 0.15;

	private static final double NOSE_HEIGHT = 0.10;

	private static final double MOUTH_WIDTH = 0.50;

	private static final double MOUTH_HEIGHT = 0.03;
	
	private GOval head;

	private GOval leftEye, rightEye;

	private GPolygon nose;

	private GRect mouth;
	
	public GFace(double w, double h) {
		head = new GOval(w, h);
		leftEye = new GOval(EYE_WIDTH * w, EYE_HEIGHT * h);
		rightEye = new GOval(EYE_WIDTH * w, EYE_HEIGHT * h);
		nose = createNose(NOSE_WIDTH * w, NOSE_HEIGHT * h);
		mouth = new GRect(MOUTH_WIDTH * w, MOUTH_HEIGHT * h);
		head.setFillColor(Color.yellow);
		leftEye.setFillColor(Color.white);
		rightEye.setFillColor(Color.white);		
		nose.setFillColor(Color.red);
		mouth.setFilled(true);
		mouth.setFillColor(Color.blue);
		add(head, -w/2, -h/2);
		add(leftEye, -w/4-EYE_WIDTH*w/2, -h/3-EYE_HEIGHT/2);
		add(rightEye, w/4-EYE_WIDTH*w/2, -h/3-EYE_HEIGHT/2);
		add(nose, 0, 0);
		add(mouth, -MOUTH_WIDTH * w / 2, 0.25 * h - MOUTH_HEIGHT
				* h / 2);

	}
	
	private GPolygon createNose(double w, double h) {
		GPolygon poly = new GPolygon();
		poly.setFilled(true);
		poly.addVertex(0, -h/2);
		poly.addVertex(w/2, h/2);
		poly.addVertex(-w/2, h/2);
		return poly;
		}

}
