import java.util.Random;
import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Random generator = new Random();
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수:");
		int count = scan.nextInt();
		
		for(int i=1;i<=count;i++) {
			 int number = generator.nextInt(100);
			 sum += number;
			 System.out.println(number);
		}
		System.out.println("난수" + count + "개의 합은 " + sum);
	}

}
