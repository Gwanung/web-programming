import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double area, w, h, perimeter;
		System.out.print("사각형의 가로를 입력하시오:");
		w = input.nextDouble();
		System.out.print("사각형의 세로를 입력하시오:");
		h = input.nextDouble();
		
		area = w * h;
		System.out.println("사각형의 넓이는" + area);
		perimeter = 2 * (w + h);
		System.out.println("사각형의 둘레는" + perimeter);
		input.close();
	}

}
