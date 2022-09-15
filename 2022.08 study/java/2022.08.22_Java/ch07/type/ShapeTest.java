package type;

class Shape{
	int x, y;
	void draw(){
		System.out.println("Shape draw");
	}
}

class Rectangle extends Shape{
	int width, height;
	void draw(){
		System.out.println("Rectangle draw");
	}
}
class Triangle extends Shape{
	int base, height;
	void draw(){
		System.out.println("Triangle draw");
	}
}
class Circle extends Shape{
	int radius;	
	void draw(){
		System.out.println("Circle draw");
	}	
}
class Cylinder extends Shape{
	int radius;	
	void draw(){
		System.out.println("Cylinder Draw");
	}	
}
public class ShapeTest {
	static Shape arrOfShapes[];
	public static void main(String[] args) {
//		s1 = new Shape();        
//		s2 = new Rectangle();   //상향 형변환
//		((Rectangle)s2).width = 10;   //하향 형변환
//		((Rectangle)s2).height = 10;
		init();
		drawAll();
	}
	
	public static void init() {
		arrOfShapes = new Shape[4];
		arrOfShapes[0] = new Rectangle();	
		arrOfShapes[1] = new Triangle();	
		arrOfShapes[2] = new Circle();
		arrOfShapes[3] = new Cylinder();
	}
	public static void drawAll() {
		for(Shape s:arrOfShapes){
			System.out.println("obj is of type" + s.getClass().getName());
			s.draw();
		}
		
//		for(int i=0; i<arrOfShapes.length; i++) {
//			arrOfShapes[i].draw();
//		}
	}
	
}
