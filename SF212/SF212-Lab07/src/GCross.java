import acm.graphics.*;
//6410742040 chidsanuphong pengchai
class GCross extends GPolygon {
	public GCross(double size) {
		
		addVertex(-size/2 , -size/2/3);
		addEdge(size/3, 0);
		addEdge(0, -size/3);
		addEdge(size/3,0);
		addEdge(0, size/3);
		addEdge(size/3, 0);
		addEdge(0, size/3);
		addEdge(-size/3,0);
		addEdge(0, size/3);
		addEdge(-size/3, 0);
		addEdge(0, -size/3);
		addEdge(-size/3,0);
		
	}
}
