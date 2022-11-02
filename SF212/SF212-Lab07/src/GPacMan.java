import acm.graphics.*;
import java.awt.*;
//6410742040 chidsanuphong pengchai

class GPacMan extends GCompound {
	private GArc arc;
	
	public GPacMan(double r) {
    arc = new GArc(-r, -r, 2 * r, 2 * r, 0, 360);
    arc.setFilled(true);
    arc.setFillColor(Color.YELLOW);
    add(arc);
	}
	
	public void openMouth(int degrees) {
		arc.setStartAngle(degrees/2);
		arc.setSweepAngle(360-degrees);
	}
}
