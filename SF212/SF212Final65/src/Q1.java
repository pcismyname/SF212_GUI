// Chidsanuphong Pengchai:
// ID 6410742040: 

import java.awt.event.MouseEvent;

import acm.graphics.GMath;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q1 extends GraphicsProgram {
  private static final int SIZE = 50;

  public void run() {
    addMouseListeners();
    add(new GTriangle(getWidth() / 4), getWidth() / 2, getHeight() / 2);
  }
  
  @Override
  public void mouseClicked(MouseEvent e) {
	  
	  RandomGenerator rand = new RandomGenerator();
	  
	  GTriangle tri = new GTriangle(SIZE);
	  add(tri,e.getX(), e.getY());
	  tri.setFilled(true);
	  tri.setColor(rand.nextColor());
	  
  }

  
}

class GTriangle extends GPolygon {
  public GTriangle(double size) {
    // YOUR CODE
    addVertex(0, -size);
    addVertex(-Math.sqrt(3)/2*size, size/2);
    addVertex(Math.sqrt(3)/2*size, size/2);

  }
}