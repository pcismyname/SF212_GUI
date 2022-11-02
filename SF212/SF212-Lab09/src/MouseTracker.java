import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class MouseTracker extends GraphicsProgram {
	
	public void run() {
		 rect = new GRect(50,50);
		rect.setFilled(true);
		rect.setFillColor(Color.BLUE);
		add(rect);
	}
	
	public void mouseMoved(MouseEvent e) {
		int cx = e.getX();
		int cy = e.getY();
		rect.setLocation(cx-25, cy-25);
		
	}
	
	private GRect rect;
}
