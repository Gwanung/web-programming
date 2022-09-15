import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STUDENTS = 5;
		int average = 0;
		int score[] = new int[STUDENTS];
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("성적을 입력하세요 : ");
			int data = scan.nextInt();
			score[i] = data;
		}
		for(int i=0;i<score.length;i++) {
			average += score[i];
		}
		
		System.out.println("평균 성적은" + average/score.length+ "입니다.");
	}

}
