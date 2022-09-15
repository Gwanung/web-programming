
public class Rectangle {
	int weight;
	int height;

	
	int area(int weight, int height) {
		int a = weight * height;
		
		return a;
	}
	int perimeter(int weight, int height) {
		int p = 2*(weight+height);
		
		return p;
	}
}
