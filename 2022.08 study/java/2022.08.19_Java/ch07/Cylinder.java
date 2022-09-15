public class Cylinder extends Circle{
	
	static double height;
	
	public Cylinder() {
		
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius) {
		super(radius);
	}
	double getHeight() {
		return height;
	}
	
	double getVolume() {	
		super.getArea();
		return getArea();  
	}
}
