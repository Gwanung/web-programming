package type;


public class ShapeTest2 {

	public static void printLocation(Shape s) {
		System.out.println("x=" + s.x + " y=" + s.y);
	}
	
	public static void main(String[] args) {
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Circle s3 = new Circle();
		
		printLocation(s1);
		printLocation(s2);
		printLocation(s3);
	}

}
