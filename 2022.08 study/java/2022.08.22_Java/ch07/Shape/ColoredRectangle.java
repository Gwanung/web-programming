package Shape;

import java.awt.Color;

public class ColoredRectangle extends Rectangle{
	
	private String color;
	
	ColoredRectangle(int x, int y, int width, int height, String color){
		super(x,y,width,height);
		this.color = color;
	}
	
	public static void main(String[] args) {
		ColoredRectangle obj = new ColoredRectangle(10, 10, 20, 20, "red");
	}
	
}
