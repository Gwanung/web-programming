package _abstract;

abstract class Shape{
	int x, y;
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
}

class Rectangle extends Shape{
	int width, height;
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
}

class Circle extends Shape{
	int radius;
	
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
	}

}
