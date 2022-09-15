import java.util.Scanner;

public class ArrayProc {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	
	public void getValues(int array[]) {
		
		for(int i=0; i< array.length; i++) {
			System.out.print("점수를 입력하세요: ");
			int a = scan.nextInt();
			array[i] = a;
		}
	}
	
	public double getAverage(int array[]) {
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		double average = ((double)sum/array.length);
		return average;
	}
	
}
