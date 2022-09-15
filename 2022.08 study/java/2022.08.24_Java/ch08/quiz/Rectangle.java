package quiz;

interface GraphicsObject{
	
	int getArea();
	void draw();
}

public class Rectangle implements GraphicsObject{
	
	private int length, width;

	@Override
	public int getArea() {
		return 0;
	}

	@Override
	public void draw() {
		
	}
	
	void setDimensions(int l, int w) {
		this.length = l;
		this.width = w;
	}
	
	
}
