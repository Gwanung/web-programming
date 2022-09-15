public class Circle {
	 static double radius;
	 static String color;
	
	Circle(){
		
	}
	 
	Circle(double radius, String color) {
		
		super();
		this.radius = radius;
		this.color = color;
	}
	
	Circle(double radius) {
		
		this.radius =radius;
	}
	
	double getRadius(){
		return radius;
	}
	
	double getArea(){
		
		return radius*radius*3.14;
	}
}
