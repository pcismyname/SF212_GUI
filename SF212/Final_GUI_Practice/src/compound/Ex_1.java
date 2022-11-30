package compound;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;



public class Ex_1 extends GraphicsProgram{

	public void run() {
		GPolygon diamond = create_1(100, 75);
		add(diamond,getWidth()/6,getHeight()/6);
		diamond.setFilled(true);
		diamond.setFillColor(Color.MAGENTA);
		
		GPolygon h = create_2(100, 75);
		add(h,getWidth()/2,getHeight()/6);
		h.setFilled(true);
		h.setFillColor(Color.RED);
		
		
		int num_door = getWidth()/75;

		
		for(int i=0;i<=num_door;i++) {
			if(i%2==0) {
				GPolygon door = door(75, 50);
				add(door,i*75,getHeight()/2);
				door.setFilled(true);
				door.setFillColor(Color.BLUE);
			}
			else {
				GPolygon door2 = door2(75, 50);
				add(door2,i*75,getHeight()/2);
				door2.setFilled(true);
				door2.setFillColor(Color.ORANGE);
			}
		}
		
		GFace face = new GFace(100,100);
		add(face,getWidth()/2,5*getHeight()/6);
		
		GLine line1 = new GLine(getWidth()/2, 0, getWidth()/2, getHeight());
		//add(line1);
		GLine line2 = new GLine(0, getHeight()/2, getWidth(), getHeight()/2);
		//add(line2);
		
	}
	
	private GPolygon create_1(double w, double h) {
		GPolygon diamond = new GPolygon();
		diamond.addVertex(-w/2, 0);
		diamond.addVertex(0, -h/2);
		diamond.addVertex(w/2, 0);
		diamond.addVertex(0, h/2);
		return diamond;
	}
	
	private GPolygon create_2(double w, double h) {
		GPolygon h_alpha = new GPolygon();
		h_alpha.addVertex(-w/4, -h/8);
		h_alpha.addEdge(0, -(h/4+h/8));
		h_alpha.addEdge(-w/4, 0);
		h_alpha.addEdge(0, h);
		h_alpha.addEdge(w/4, 0);
		h_alpha.addEdge(0, -(h/4+h/8));
		h_alpha.addEdge(w/2, 0);
		h_alpha.addEdge(0, (h/4+h/8));
		h_alpha.addEdge(w/4, 0);
		h_alpha.addEdge(0, -h);
		h_alpha.addEdge(-w/4, 0);
		h_alpha.addEdge(0, (h/4+h/8));
		
		return h_alpha;
	}
	
	private GPolygon door(double w, double h) {
		GPolygon d = new GPolygon();
		d.addVertex(w/2, 0);
		d.addEdge(0, -h);
		d.addArc(w, w, 0, 180);
		d.addEdge(0, h);
		
		return d;	
	}
	
	private GPolygon door2(double w, double h) {
		GPolygon d = new GPolygon();
		d.addVertex(w/2, 0);
		d.addEdge(0, h);
		d.addArc(w, w, 0, -180);
		d.addEdge(0, -h);
		
		return d;	
	}
	
	
	
	
}
