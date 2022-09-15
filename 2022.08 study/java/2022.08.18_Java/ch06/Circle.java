
public class Circle {
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}

	private int radius;
	private Point center;

	public Circle(int radius, Point center) {
		super();
		this.radius = radius;
		this.center = center;
	}

}
