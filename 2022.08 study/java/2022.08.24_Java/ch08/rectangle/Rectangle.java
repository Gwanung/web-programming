package rectangle;

public class Rectangle implements Comparable {
	private int width = 0;
	private int height = 0;
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	@Override
	public int compareTo(Object o) {
		Rectangle otherRect = (Rectangle)o;
		if(this.getArea() < otherRect.getArea())
			return -1;
		else if(this.getArea() > otherRect.getArea())
			return 1;
		else
			return 0;
	}
}

