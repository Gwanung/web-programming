import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		double pi = 0;
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("반복횟수:");
		int count = scan.nextInt();
		
		for(double i=1;i<=count;i++) {
			if(i%2==0) {
			sum = -(4/((2*i)-1));    // 분모가 짝수번째일 경우 -
			pi += sum;
			}
			else {
				sum = (4/((2*i)-1));  // 분모가 홀수번째일 경우 +
				pi += sum;
			}
		}
		System.out.println("Pi =" + pi);
	}


}
