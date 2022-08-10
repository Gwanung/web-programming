import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		int score;
		String point;
		
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		score = input.nextInt();
		
		if(score>= 90) {
			point = "학점 A";
		}
		else if(score>= 80) {
			point = "학점 B";
		}
		else if(score>= 70) {
			point = "학점 C";
		}
		else if(score>= 60) {
			point = "학점 D";
		}
		else {
			point = "학점 F";
		}
		System.out.println(point);
	}

}
