package compound;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Img extends GraphicsProgram{
	
	public void run() {
		GImage img1 = new GImage("EarthFromApollo17.jpg");
		img1.setSize(100,100);
		
		GImage img2 = new GImage("images/Cherry.jpg");
		img2.setSize(100,100);
		
		add(img1,getWidth()/6,getHeight()/6);
		addName("Earth",img1.getX(),img1.getY(),img1.getWidth(),img1.getHeight());
		
	
		add(img2, 5*getWidth()/6, getHeight()/6);
		addName("Cheery",img2.getX(),img2.getY(),img2.getWidth(),img2.getHeight());

		
		
	}
	
	public void addName(String text,double x,double y,double w,double h) {
		GLabel label = new GLabel(text);
		add(label, x+w/2-label.getWidth(), y+h+label.getHeight());
	}

}
