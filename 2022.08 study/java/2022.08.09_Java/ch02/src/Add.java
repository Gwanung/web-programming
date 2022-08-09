import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
//		ctrl + shift + o 자동 import
		Scanner input = new Scanner(System.in);
		int x, y;
		int sum;
		
		System.out.print("첫 번째 입력 : ");
		x = input.nextInt();
		System.out.print("두 번째 입력 : ");
		y = input.nextInt();
		sum = x + y;
		System.out.println("sum:  " + sum);
	}

}
