import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		int grade;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("점수를 입력하세요: ");
			grade = scan.nextInt();
			if (grade >= 0) {
			total += grade;
			count++;		
			}
		} while(grade > 0);
		System.out.println("평균은" + total/count);
	}

}
